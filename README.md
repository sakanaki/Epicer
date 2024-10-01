地址編碼API介接範例說明
---

對使用者身分進行認證後，進入地址編碼服務API，在此提供範例說明提供使用者做參考。

API認證機制
---

OpenAPI皆使用Access Token(金鑰)進行身分驗證，將Access Token帶入即可存取OpenAPI服務。

詳細步驟如下:

1. 註冊為內政部地址識別碼會員
於內政部-地址識別碼 https:/adrid.moi.gov.tw 註冊成為會員。
務必完成Email驗證，帳號經管理員審核後，即可登入內政地址編碼網站。

2. 取得Access Token(API金鑰)
登入地址編碼網站後，可於會員專區申請取得API金鑰。
經後台管理員審核通過後，申請者得一組API金鑰，包含[Access Token]及[Refresh Token]。
API金鑰相關內容可於[會員區]-[會員資料管理]查看。

![image](https://github.com/user-attachments/assets/9d5675e3-49d2-4e43-8ee9-25b9813fb5b2)

API金鑰
---
包含金鑰(Access Token)與刷新金鑰(Refresh Token)

詳細敘述如下:

金鑰(Access Token)
--
 * 可用於所有的OpenAPI進行身分驗證。
 
 * 默認申請後第一次使用的IP位置，做為日後使用者的驗證IP。
 
 * 金鑰的使用期限為1日。

刷新金鑰(Refresh Token)
---
* 用於更新金鑰的使用期限。
* 刷新金鑰的使用期限為2日。
* 當系統判定金鑰過期時，即要求使用者帶入刷新金鑰，以更新金鑰的使用期限。
* 若金鑰與刷新金鑰皆過期，使用者需回到內政部-地址識別碼會員專區-會員管理，
 重新整理頁面後，即得一組新的API金鑰。

OpenAPI綁定金鑰
--

1. 進入OpenAPI Swagger頁面 

於 **```[官網]-[API服務]-[前往地址識別碼API線上說明文件]```**，開啟OpenAPI界接之Swagger畫面。

![image](https://github.com/user-attachments/assets/9b103a55-999f-4150-91c1-ba9c272b487c)

2. 於Swagger頁面綁定API金鑰


點選右上方的 **```[Authorization]```**</span>。

![image](https://github.com/user-attachments/assets/7bd65c3a-6766-471b-832f-0b14854cf94c)

待畫面出現金鑰的認證框後，於此貼上金鑰。

![image](https://github.com/user-attachments/assets/b6e801ab-9df4-40f5-9266-17b89660fa84)

```
提醒您，這步驟必須確實按下下方[Authorization]按鈕，才能正確綁定金鑰，以利系統進行身分驗證。

每次進入只需綁定一次。若有重新整理或重新開啟務必再次綁定。
```



OpenAPI服務
---

OpenAPI 共提供5項服務項目。

下圖依序分別為

* [單筆地址查詢](#revise-address)
* [更新刷新金鑰](#refresh-token)
* [單筆軌跡查詢](#single-track)
* [單筆標準地址查詢](#standard-address)
* [單筆地址編碼查詢](#single-query)

  ![image](https://github.com/user-attachments/assets/b2d46bdc-4f19-4b2e-9c3f-366107a4d2c3)
  
## <div id="revise-address">單筆地址查詢</div>

* 使用說明

1. 點擊右側 **```[下拉圖示]```**。

  ![image](https://github.com/user-attachments/assets/3ae389a2-41f5-4363-ba7b-6c02598f12c4)
  
2. 點擊右側 **```[try it out]```** 按鈕。

  ![image](https://github.com/user-attachments/assets/0d0e0a8d-dab5-4d0d-a9f5-4b5fb9018663)
  
3. 待頁面解鎖下方的輸入框。

  ![image](https://github.com/user-attachments/assets/0609b662-c1e3-434e-bfe8-97598bfedb18)
  
4. 於輸入框輸入地址後，按下下方 **```[Execute]```**


 ```特別注意地址前後無須加上""或''```

  ![image](https://github.com/user-attachments/assets/2ae41e8a-0f19-47b7-9335-f2f2a28c0dd5)
  
 5. 執行完畢後下拉，會看見 **```[sever response]```** 之小標，下方黑框內容即為本次查詢結果。

  ![image](https://github.com/user-attachments/assets/9fc21e6a-585b-4039-b260-a3b74cd71d47)

* 請求參數說明: 

|英文|中文
| ------- | ----------------------
**originalAddressStr**|**來源地址**

## <div id="single-track">單筆軌跡查詢</div>
取得指定【地址識別碼】之異動軌跡
* 使用說明
 
參照單筆地址查詢，完成步驟(1)-(3)。

4. 於輸入框輸入**地址識別碼**，按下下方 **```[Execute]```**

![image](https://github.com/user-attachments/assets/9a8f9377-7574-40f4-8424-6f589be9ae07)

```
特別注意地址前後無須加上""或''。
```
5. 執行完畢後下拉，會看見 **```[sever response]```** 之小標，下方黑框內容即為本次查詢結果。

![image](https://github.com/user-attachments/assets/e2e56429-af9f-4d65-b031-3e377110c3c3)
 
* 請求參數說明

|英文|中文
| ------- | ----------------------
**addressId**|**地址識別碼**


 

## <div id="standard-address">單筆標準地址查詢</div>


取得指定【地址】之標準格式地址

* 使用說明

參照單筆地址查詢，完成步驟(1)-(3)。

 4. 於輸入框輸入地址後，按下下方 **```[Execute]```**

```
特別注意地址前後無須加上""或''。
```

  ![image](https://github.com/user-attachments/assets/b2694fa6-3ec5-43b6-b2ab-1e13985bf849)

  
 5. 執行完畢後下拉，會看見 **```[sever response]```** 之小標，下方黑框內容即為本次查詢結果。

  ![image](https://github.com/user-attachments/assets/9fc21e6a-585b-4039-b260-a3b74cd71d47)
  
* 請求參數說明

|英文|中文
| ------- | ----------------------
**address**|**來源地址**


## <div id="single-query">單筆地址編碼查詢<div>

取得指定【地址】之地址識別碼相關資訊

* 使用說明

參照單筆地址查詢，完成步驟(1)-(3)。

 4. 於輸入框輸入地址後，按下下方 **```[Execute]```**
 
 ```
特別注意地址前後無須加上""或''。

地址後方可加入指定縣市、鄉鎮，以半形逗號區隔組合而成，或只輸地址。
  
 ex：台南市東區衛國里007鄰衛國街１１４巷９弄１０號B六樓之５,臺南市,東區
  
 ex：台南市東區衛國里007鄰衛國街１１４巷９弄１０號B六樓之５
  ```
  
![image](https://github.com/user-attachments/assets/ae1a006c-095b-44bc-b7cb-0646d28233f9)

5. 執行完畢後下拉，會看見 **```[sever response]```** 之小標，下方黑框內容即為本次查詢結果。

![image](https://github.com/user-attachments/assets/8caaad6d-a74e-476e-9fe4-9c961b615d1d)

* 請求參數說明

|英文|中文
| ------- | ----------------------
**address**|**來源地址**


## <div id="refresh-token">更新金鑰效期</div>

使用刷新金鑰，取得全新效期的金鑰。

* 使用說明

參照單筆地址查詢，完成步驟(1)-(3)。

4. 回到 **```[會員專區]-[會員資料管理]```**，複製右方API金鑰內容的刷新金鑰。

![image](https://github.com/user-attachments/assets/799c059a-ee20-467a-ad23-17a3ef146784)


5. 於輸入框輸入刷新金鑰後，按下下方 **```[Execute]```**

![image](https://github.com/user-attachments/assets/2bb8edfc-9fa4-48fd-beef-35311a48e8f8)

6. 執行完畢後下拉，會看見 **```[sever response]```** 之小標，下方黑框內容即為本次查詢結果。

![image](https://github.com/user-attachments/assets/10de1776-7588-4d88-b718-2bea351563c8)


8. 特別注意若回覆內容為**```[刷新金鑰已過期，請重新整理]```**，

回到```[會員專區]-[會員資料管理]```頁面，進行重新整理。

<span style="color:red;background-color: lightgray; padding: 1px;">**全新效期的金鑰與刷新金鑰，將會更新在右邊API金鑰相關內容。**</span>

![image](https://github.com/user-attachments/assets/5966d64a-2a9b-4764-a45e-b2abee55728e)

* 請求參數說明

|英文|中文
| ------- | ----------------------
**refreshToken**|**刷新金鑰**

響應碼 403
---
(1) OpenAPI若回覆403響應碼，

表示使用者身分驗證失敗，以上述使用刷新金鑰的API取得新效期金鑰。

![image](https://github.com/user-attachments/assets/a94706d1-761d-4fbd-977d-3339f9f555bd)
