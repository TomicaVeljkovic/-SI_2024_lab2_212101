<h1>lab 02 po sofversko inzenerstvo</h1>
<h2>Tomica Veljkovic</h2>
<h3>Control Flow Graph</h3>

![lab2final](https://github.com/TomicaVeljkovic/SI_2024_lab2_212101/blob/master/image.png) 


<h3>Цикломатска комплексност</h3>
<p>Po crtaniot graf cikomatskata kompleksnost izleguva 8</p>

<h3>Тест случаи според критериумот Every Branch, користам 4 случаи.</h3>
<p>- test so slucaj koga allItems e null.<br></p>
<p>- test slucaj koga getBarcode e razlicno odnull ili nema dolzina </p>
<p>- test slucaj koga samo barcode e razlicna od null</p>
<p>- test slucaj koga sum e pomala od payment </p>

<h3>Multiple Condition testovi</h3>

<p>- item.getName() == null || item.getName().length() == 0</p>
<p>- item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0'</p>

<h3>Unit testovi</h3>

<p>-testAllItemsNull se null<br></p>
<p>-getBarcode!=null se so dolzina 0</p>
<p>-barCode e 0 </p>

<h3>Tests za Every Branch:</h3>

<p>-name e null ili 0<br></p>
<p>-price e pogolema od 300 i ima discount</p>