<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 滾動畫面 2 (不確定作用) -->

<section class="slider">
	<div id="carousel" class="carousel slide" data-ride="carousel" data-interval="false">
	  <ol class="carousel-indicators">
	    <li data-target="#carousel" data-slide-to="0" class="active"></li>
	    <li data-target="#carousel" data-slide-to="1"></li>
	    <li data-target="#carousel" data-slide-to="2"></li>
	  </ol>
	  <div class="carousel-inner" role="listbox">
	  	<div class="item active dark-bg overly">
			<img src="./source/images/slider/slider-1.jpg" alt="slider image">
			<div class="carousel-caption">
				<h1>Minimal  Summer Collection</h1>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Repudiandae aut illum ratione? <br> Aliquam facilis dolorem dolor illum saepe commodi ratione.</p>
				<a href="shop.html" class="btn btn-main">Buy Now</a>
			</div>
	    </div>
	    <div class="item  dark-bg overly">
	      <img src="./source/images/slider/slider-2.jpg" alt="slider image">
	      <div class="carousel-caption">
	        <h1>Weeding Business & Casual</h1>
	        <p>But I must explain to you how all this mistaken idea of oralized by the charms denouncing pleasure and pain was </p>
	        <a href="shop.html" class="btn btn-main">Buy Now</a>
	      </div>
	    </div>
	    
	    <div class="item white-bg content-left">
			<img src="./source/images/slider/slider-3.jpg" alt="slider image">
			<div class="carousel-caption">
				<h1>Stylish & Scalable</h1>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet nostrum similique veniam reiciendis facere <br> aliquid consectetur ad quibusdam maxime nisi!</p>
				<a href="shop.html" class="btn btn-main">Buy Now</a>
			</div>
	    </div>
	  </div>

	  <a class="left carousel-control" href="#carousel" role="button" data-slide="prev">
	    <i class="tf-ion-ios-arrow-left"></i>
	    <span class="sr-only">Previous</span>
	  </a>
	  <a class="right carousel-control" href="#carousel" role="button" data-slide="next">
	    <i class="tf-ion-ios-arrow-right"></i>
	    <span class="sr-only">Next</span>
	  </a>
	</div>
</section>