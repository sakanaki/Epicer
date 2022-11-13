package com.epicer.model.product;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.epicer.model.cart.CartOfProduct;
import com.epicer.model.cart.OrderProduct;
import com.epicer.model.cart.OrderProductDetails;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "product")
@Component
public class Product implements Serializable {

	@Id
	@Column(name = "productid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productId;

	@Column(name = "productname")
	private String productName;

	@Column(name = "productcategoryid")
	private Integer productCategoryId;

	@Column(name = "productunit")
	private String productUnit;

	@Column(name = "productprice")
	private Integer productPrice;

	@Column(name = "productorigin")
	private String productOrigin;

	@Column(name = "productstock")
	private Integer productStock;

	@Column(name = "productstatus")
	private Integer productStatus;

	@Column(name = "productdescription")
	private String productDescription;

	@Column(name = "productdetails")
	private String productDetails;

	@Column(name = "productimage")
	private String productImage;
	
	@Column(name = "producthot")
	private Integer productHot;
	
	
	

	// 跟購物車商品清單串聯
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cartProduct", cascade = CascadeType.ALL)
	 @JsonManagedReference
	private Set<CartOfProduct> cartOfProduct = new LinkedHashSet<CartOfProduct>();

	// 跟訂單表格串聯(訂購明細)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "orderProduct", cascade = CascadeType.ALL)
	private Set<OrderProductDetails> orderItem = new LinkedHashSet<OrderProductDetails>();

//	@OneToMany(mappedBy = "cartProduct", cascade = CascadeType.ALL)
//	private List<Cart> cartsList;
	
	
//	消費者的商品收藏
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "product", cascade = CascadeType.ALL)
	 @JsonManagedReference
	private List<ProductLike> ProductLikeId =new ArrayList<ProductLike>();

	public Product() {
	}


	public List<ProductLike> getProductLikeId() {
		return ProductLikeId;
	}



	public void setProductLikeId(List<ProductLike> productLikeId) {
		ProductLikeId = productLikeId;
	}



	public Product(Integer productId, String productName, Integer productCategoryId, String productUnit,
			Integer productPrice, String productOrigin, Integer productStock, Integer productStatus,
			String productDescription, String productDetails, String productImage, Set<CartOfProduct> cartOfProduct,
			List<ProductLike> productLikeId) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCategoryId = productCategoryId;
		this.productUnit = productUnit;
		this.productPrice = productPrice;
		this.productOrigin = productOrigin;
		this.productStock = productStock;
		this.productStatus = productStatus;
		this.productDescription = productDescription;
		this.productDetails = productDetails;
		this.productImage = productImage;
		this.cartOfProduct = cartOfProduct;
		ProductLikeId = productLikeId;
	}


	public Product(Integer productId, String productName, Integer productCategoryId, String productUnit,
			Integer productPrice, String productOrigin, Integer productStock, Integer productStatus,
			String productDescription, String productDetails, String productImage,
			Set<CartOfProduct> cartOfProduct) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCategoryId = productCategoryId;
		this.productUnit = productUnit;
		this.productPrice = productPrice;
		this.productOrigin = productOrigin;
		this.productStock = productStock;
		this.productStatus = productStatus;
		this.productDescription = productDescription;
		this.productDetails = productDetails;
		this.productImage = productImage;
		this.cartOfProduct = cartOfProduct;
	}

	public Product(Integer productId, String productName, String productUnit, Integer productPrice, String productImage,
			Set<CartOfProduct> cartOfProduct) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productUnit = productUnit;
		this.productPrice = productPrice;
		this.productImage = productImage;
		this.cartOfProduct = cartOfProduct;
	}

	public Product(Integer productId, Integer productPrice, Set<CartOfProduct> cartOfProduct) {
		super();
		this.productId = productId;
		this.productPrice = productPrice;
		this.cartOfProduct = cartOfProduct;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCategoryId="
				+ productCategoryId + ", productUnit=" + productUnit + ", productPrice=" + productPrice
				+ ", productOrigin=" + productOrigin + ", productStock=" + productStock + ", productStatus="
				+ productStatus + ", productDescription=" + productDescription + ", productDetails="
				+ productDetails + ", productImage=" + productImage + "]";
	}



	public Product(Integer productId, String productName, Integer productCategoryId, String productUnit,
			Integer productPrice, String productOrigin, Integer productStock, Integer productStatus,
			String productDescription) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCategoryId = productCategoryId;
		this.productUnit = productUnit;
		this.productPrice = productPrice;
		this.productOrigin = productOrigin;
		this.productStock = productStock;
		this.productStatus = productStatus;
		this.productDescription = productDescription;
	}
	
	

//可以放照片的Update
	public Product(Integer productId, String productName, Integer productCategoryId, String productUnit,
			Integer productPrice, String productOrigin, Integer productStock, Integer productStatus,
			String productDescription,String productDetails, String productImage) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCategoryId = productCategoryId;
		this.productUnit = productUnit;
		this.productPrice = productPrice;
		this.productOrigin = productOrigin;
		this.productStock = productStock;
		this.productStatus = productStatus;
		this.productDescription = productDescription;
		this.productDetails = productDetails;
		this.productImage = productImage;
	}
	
	




//可以放照片的insert
	public Product(String productName, Integer productCategoryId, String productUnit, Integer productPrice,
			String productOrigin, Integer productStock, Integer productStatus, String productDescription,
			String productImage) {
		super();
		this.productName = productName;
		this.productCategoryId = productCategoryId;
		this.productUnit = productUnit;
		this.productPrice = productPrice;
		this.productOrigin = productOrigin;
		this.productStock = productStock;
		this.productStatus = productStatus;
		this.productDescription = productDescription;
		this.productImage = productImage;
	}


	public Product(String productName, Integer productCategoryId, String productUnit,
			Integer productPrice, String productOrigin, Integer productStock, Integer productStatus,
			String productDescription, String productDetails, String productImage) {
		super();
		this.productName = productName;
		this.productCategoryId = productCategoryId;
		this.productUnit = productUnit;
		this.productPrice = productPrice;
		this.productOrigin = productOrigin;
		this.productStock = productStock;
		this.productStatus = productStatus;
		this.productDescription = productDescription;
		this.productDetails = productDetails;
		this.productImage = productImage;
	}



	public Product(String productName, Integer productCategoryId, String productUnit,
			Integer productPrice, String productOrigin, Integer productStock, Integer productStatus,
			String productDescription) {
		super();
		this.productName = productName;
		this.productCategoryId = productCategoryId;
		this.productUnit = productUnit;
		this.productPrice = productPrice;
		this.productOrigin = productOrigin;
		this.productStock = productStock;
		this.productStatus = productStatus;
		this.productDescription = productDescription;
	}
	
	

//產品所有欄位(含熱賣商品)修改
	public Product(Integer productId, String productName, Integer productCategoryId, String productUnit,
			Integer productPrice, String productOrigin, Integer productStock, Integer productStatus,
			String productDescription, String productDetails, String productImage, Integer productHot) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCategoryId = productCategoryId;
		this.productUnit = productUnit;
		this.productPrice = productPrice;
		this.productOrigin = productOrigin;
		this.productStock = productStock;
		this.productStatus = productStatus;
		this.productDescription = productDescription;
		this.productDetails = productDetails;
		this.productImage = productImage;
		this.productHot = productHot;
	}
	
	public Product( String productName, Integer productCategoryId, String productUnit,
			Integer productPrice, String productOrigin, Integer productStock, Integer productStatus,
			String productDescription, String productDetails, String productImage, Integer productHot) {
		super();
		this.productName = productName;
		this.productCategoryId = productCategoryId;
		this.productUnit = productUnit;
		this.productPrice = productPrice;
		this.productOrigin = productOrigin;
		this.productStock = productStock;
		this.productStatus = productStatus;
		this.productDescription = productDescription;
		this.productDetails = productDetails;
		this.productImage = productImage;
		this.productHot = productHot;
	}
	
	
	


	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(Integer productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public String getProductUnit() {
		return productUnit;
	}

	public void setProductUnit(String productUnit) {
		this.productUnit = productUnit;
	}

	public Integer getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductOrigin() {
		return productOrigin;
	}

	public void setProductOrigin(String productOrigin) {
		this.productOrigin = productOrigin;
	}

	public Integer getProductStock() {
		return productStock;
	}

	public void setProductStock(Integer productStock) {
		this.productStock = productStock;
	}

	public Integer getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(Integer productStatus) {
		this.productStatus = productStatus;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(String productDetails) {
		this.productDetails = productDetails;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}
	
	

	public Integer getProductHot() {
		return productHot;
	}


	public void setProductHot(Integer productHot) {
		this.productHot = productHot;
	}


	public Set<CartOfProduct> getCartOfProduct() {
		return cartOfProduct;
	}

	public void setCarts(Set<CartOfProduct> cartOfProduct) {
		this.cartOfProduct = cartOfProduct;
	}
}
