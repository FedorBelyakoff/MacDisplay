package classes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnswerPageFrom2IpTest {

    private AnswerPageFrom2Ip answer;

    @BeforeEach
    void setUp() {
    }

    @Test
    void shouldReturnCorrectManufacturer() {
        AnswerPageFrom2Ip page = new AnswerPageFrom2Ip(test2ipAnswer());

    }

    private String test2ipAnswer() {
        return """
                <!DOCTYPE html>
                <html lang="ru" dir="ltr"
                	  class='com_content view-article itemid-134 _mac-find j38'>
                                
                <head>
                	<base href="https://2ip.ua/ru/services/information-service/mac-find" />
                	<meta http-equiv="content-type" content="text/html; charset=utf-8" />
                	<meta name="keywords" content="MAC-адрес, определение производителя, поиск производителя" />
                	<meta name="description" content="Определение производителя по MAC-адресу, поиск производителя устройства по MAC-адресу" />
                	<title>Определение производителя по MAC-адресу | 2IP.ua</title>
                	<link href="https://2ip.ua/ua/services/information-service/mac-find" rel="alternate" hreflang="uk" />
                	<link href="https://2ip.ua/ru/services/information-service/mac-find" rel="alternate" hreflang="ru" />
                	<link href="https://2ip.me/en/services/information-service/mac-find" rel="alternate" hreflang="en" />
                	<link href="https://2ip.me/fr/services/information-service/mac-find" rel="alternate" hreflang="fr" />
                	<link href="/t3-assets/css/css-f0369-02521.css" rel="stylesheet" type="text/css" media="all" attribs="[]" />
                	<link href="/t3-assets/css/css-21011-02522.css" rel="stylesheet" type="text/css" media="all" attribs="[]" />
                	<script src="/media/jui/js/jquery.min.js" type="text/javascript"></script>
                	<script src="/media/jui/js/jquery-migrate.min.js" type="text/javascript"></script>
                	<script src="/media/jui/js/jquery-noconflict.js" type="text/javascript"></script>
                	<script src="/t3-assets/js/js-32353-83353.js" type="text/javascript"></script>
                	<link href="https://2ip.ua/ru/services/information-service/mac-find" rel="alternate" hreflang="x-default" />
                                
                	<link rel="icon" type="image/png" href="/templates/2ip/favicon.png" />
                <meta name="referrer" content="always" />
                <!-- META FOR IOS & HANDHELD -->
                	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
                	<meta name="theme-color" content="#cfd8dc">
                	<link rel="icon" sizes="192x192" href="/templates/2ip/images/logo.png">
                	<style type="text/stylesheet">
                		@-webkit-viewport   { width: device-width; }
                		@-moz-viewport      { width: device-width; }
                		@-ms-viewport       { width: device-width; }
                		@-o-viewport        { width: device-width; }
                		@viewport           { width: device-width; }
                	</style>
                	<script type="text/javascript">
                		//<![CDATA[
                		if (navigator.userAgent.match(/IEMobile\\/10\\.0/)) {
                			var msViewportStyle = document.createElement("style");
                			msViewportStyle.appendChild(
                				document.createTextNode("@-ms-viewport{width:auto!important}")
                			);
                			document.getElementsByTagName("head")[0].appendChild(msViewportStyle);
                		}
                		//]]>
                	</script>
                <meta name="HandheldFriendly" content="true"/>
                <meta name="apple-mobile-web-app-capable" content="YES"/>
                <!-- //META FOR IOS & HANDHELD -->
                                
                <script async src="//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>
                <script>
                  (adsbygoogle = window.adsbygoogle || []).push({
                    google_ad_client: "ca-pub-2871984509315629",
                    enable_page_level_ads: true
                  });
                </script>
                </head>
                                
                <body>
                                
                <div class="t3-wrapper">
                 <header id="t3-header" class="t3-header">
                	<div class="container-fluid mobile-top-menu hidden-md hidden-lg">
                		<div class="row">
                			<div class="col-xs-6">
                									
                <div class="off-canvas-toggle " data-pos="left" data-nav="#t3-off-canvas" data-effect="off-canvas-effect-1">
                  <i class="fa fa-bars"></i>
                </div>
                                
                <!-- OFF-CANVAS SIDEBAR -->
                <div id="t3-off-canvas" class="t3-off-canvas ">
                                
                  <div class="t3-off-canvas-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><i class="fa fa-times"></i></button>
                  </div>
                                
                  <div class="t3-off-canvas-body">
                  		<div class="languageswitcherload">
                			<div class="mod-languages">
                                
                	<ul class="lang-inline">
                						<li class="" dir="ltr">
                			<a href="//2ip.ua/ua/services/information-service/mac-find">
                							UA						</a>
                			</li>
                								<li class="lang-active" dir="ltr">
                			<a href="//2ip.ua/ru/services/information-service/mac-find">
                							RU						</a>
                			</li>
                								<li class="" dir="ltr">
                			<a href="//2ip.me/en/services/information-service/mac-find">
                							EN						</a>
                			</li>
                								<li class="" dir="ltr">
                			<a href="//2ip.me/fr/services/information-service/mac-find">
                							FR						</a>
                			</li>
                				</ul>
                                
                </div>
                                
                		</div>
                      <ul class="nav sidebar-nav">
                <li class="item-117"><a href="/ru/" >Главная</a></li><li class="item-101 active deeper dropdown parent"><a role="button" data-target="#" class="dropdown-toggle menu-head" data-toggle="dropdown" aria-expanded="false"><span class="hang">Сервисы</span></a><ul class="dropdown-menu"><li class="item-123 dropdown-submenu parent"><a role="button" data-target="#" class="dropdown-toggle menu-head" data-toggle="dropdown" aria-expanded="false"><span class="hang">IP сервисы</span></a><ul class="dropdown-menu"><li class="item-108"><a href="/ru/services/ip-service/speedtest" >Тест скорости Интернет соединения</a></li><li class="item-109"><a href="/ru/services/ip-service/ping-traceroute" >Проверка доступности IP адреса или сайта</a></li><li class="item-369"><a href="/ru/services/ip-service/privacy" >Проверка приватности</a></li><li class="item-111"><a href="/ru/services/ip-service/port-check" >Проверка доступности порта</a></li><li class="item-136"><a href="/ru/services/ip-service/email-check" >Проверка существования e-mail адреса</a></li><li class="item-119"><a href="/ru/services/ip-service/spam" >Проверка наличия IP адреса в спам базах</a></li><li class="item-120"><a href="/ru/services/ip-service/dns-response" >Проверка времени отклика DNS-сервера</a></li><li class="item-133"><a href="/ru/services/ip-service/server-check" >Проверка ресурса на наличие активных сервисов</a></li></ul></li><li class="item-124 active dropdown-submenu parent"><a role="button" data-target="#" class="dropdown-toggle menu-head" data-toggle="dropdown" aria-expanded="false"><span class="hang">Информационные сервисы</span></a><ul class="dropdown-menu"><li class="item-134 current active"><a href="/ru/services/information-service/mac-find" >Определение производителя по MAC-адресу</a></li><li class="item-107"><a class="whois" href="https://2ip.ua/ru/services/information-service/whois" >Информация об IP адресе</a></li><li class="item-144"><a href="/ru/services/information-service/provider-ip" >Информация о блоках IP адресов провайдера</a></li><li class="item-143"><a href="/ru/services/information-service/hosting-information" >Определение хостинг-провайдера сайта</a></li><li class="item-121"><a href="/ru/services/information-service/site-location" >Узнать местонахождение IP адреса или сайта</a></li><li class="item-116"><a href="/ru/services/information-service/location-ip" >Узнать диапазон IP адресов по адресу</a></li><li class="item-208"><a href="/ru/services/information-service/site-distance" >Узнать расстояние между сайтами</a></li><li class="item-112"><a href="/ru/services/information-service/domain-information" >Информация о домене</a></li><li class="item-130"><a href="/ru/services/information-service/domain-check" >Проверка доступности домена</a></li><li class="item-132"><a href="/ru/services/information-service/nslookup" >Узнать IP адрес и почтовый сервер сайта</a></li><li class="item-142"><a href="/ru/services/information-service/site-information" >Информация о сайте</a></li><li class="item-129"><a href="/ru/services/information-service/dns-dig" >Узнать DNS параметры домена</a></li><li class="item-400"><a href="/ru/services/information-service/dns-check" >Проверка распространения DNS записи</a></li></ul></li><li class="item-125 dropdown-submenu parent"><a role="button" data-target="#" class="dropdown-toggle menu-head" data-toggle="dropdown" aria-expanded="false"><span class="hang">Полезные сервисы</span></a><ul class="dropdown-menu"><li class="item-141"><a href="/ru/services/useful-service/time-calculator" >Расчёт времени загрузки файла</a></li><li class="item-110"><a href="/ru/services/useful-service/ip-calculator" >Онлайн IP калькулятор</a></li><li class="item-131"><a href="/ru/services/useful-service/chmod-calculator" >Онлайн chmod калькулятор</a></li><li class="item-202"><a href="/ru/services/useful-service/punycode-converter" >Онлайн punycode конвертер</a></li><li class="item-210"><a href="/ru/services/useful-service/converter" >Онлайн конвертер</a></li><li class="item-204"><a href="/ru/services/useful-service/converter-registers" >Онлайн конвертер регистров</a></li><li class="item-118"><a href="/ru/services/useful-service/password-generator" >Онлайн генератор паролей</a></li><li class="item-206"><a href="/ru/services/useful-service/text-encryption" >Онлайн шифрование текста</a></li></ul></li><li class="item-137 dropdown-submenu parent"><a role="button" data-target="#" class="dropdown-toggle menu-head" data-toggle="dropdown" aria-expanded="false"><span class="hang">Сервисы для блога или сайта</span></a><ul class="dropdown-menu"><li class="item-138"><a href="/ru/services/userbars/speedmeter" >Тест скорости Интернет соединения для вашего сайта</a></li><li class="item-139"><a href="/ru/services/userbars/ip-block-userbar" >IP-блок и userbar для форума или вашего сайта</a></li></ul></li><li class="item-145"><a href="/ru/services/providers-rating" >Рейтинг интернет-провайдеров</a></li><li class="item-294"><a href="/ru/services/account" >Мой аккаунт</a></li></ul></li><li class="item-212 deeper dropdown parent"><a role="button" data-target="#" class="dropdown-toggle menu-head" data-toggle="dropdown" aria-expanded="false"><span class="hang">API</span></a><ul class="dropdown-menu"><li class="item-186"><a href="/ru/api/our-api" >2IP API</a></li><li class="item-358"><a href="/ru/api/2ip-speedtest-api" >2IP Speedtest API</a></li><li class="item-213"><a href="/ru/api/api-statistics" >Статистика использования API</a></li></ul></li><li class="item-104"><a href="/ru/blog" >Статьи</a></li><li class="item-262 deeper dropdown parent"><a role="button" data-target="#" class="dropdown-toggle menu-head" data-toggle="dropdown" aria-expanded="false"><span class="hang">Сайт</span></a><ul class="dropdown-menu"><li class="item-279"><a href="/ru/site/authentication" >Авторизация на сайте</a></li><li class="item-274"><a href="/ru/site/registration" >Регистрация на сайте</a></li><li class="item-275"><a href="/ru/site/password" >Восстановление пароля</a></li></ul></li><li class="item-352">	<a class="menu_social margin menu_facebook" href="//fb.com/2ip.ua" target="_blank" >fb.com/2ip.ua</a></li><li class="item-388">	<a class="menu_banner menu_luxsite" href="//luxsite.ua/seo/" target="_blank" title="продвижение сайтов" >luxsite.ua</a></li></ul>
                                
                  </div>
                                
                </div>
                <!-- //OFF-CANVAS SIDEBAR -->
                                
                							</div>
                			<div class="col-xs-6">
                				<div class="account-mob pull-right">
                					
                                
                                
                                
                <div class="account">
                	<a class="fa fa-sign-in" href="/ru/site/authentication"></a>
                </div>
                				</div>
                			</div>
                		</div>
                	</div>
                	<div class="container">
                		<div class="row">
                			<div class="col-sm-2 logo">
                				<div class="logo-image">
                					<a href="/ru/" title="2IP">
                																					<img class="logo-img" src="/templates/2ip/images/logo_ua.png" alt="2IP" />
                								<span class="site-title visible-xs-inline-block visible-sm-inline-block">2IP.ua</span>
                																								</a>
                				</div>
                			</div>
                			<div class="col-sm-8">
                				<div class="row">
                					<div class="col-xs-12 top-banner">
                													
                                
                <div class="custom_adsense"  >
                	<script async src="//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>
                <!-- 2ip adaptive -->
                <ins class="adsbygoogle"
                     style="display:block"
                     data-ad-client="ca-pub-2871984509315629"
                     data-ad-slot="3172940050"
                     data-ad-format="horizontal"
                     data-full-width-responsive="true"></ins>
                <script>
                (adsbygoogle = window.adsbygoogle || []).push({});
                </script></div>
                                
                							
                											</div>
                					<!--
                					<div class="col-md-12" style="margin-bottom: 25px;">
                						<div class="row">
                							<div class="col-md-3 col-xs-3 social_block_links fb">
                								<a href="//www.facebook.com/ukrainianwitness" target="_blank">
                									<img class="img-responsive" src="/images/facebook.png">
                								</a>
                							</div>
                							<div class="col-md-3 col-xs-3 social_block_links">
                								<a href="//www.youtube.com/channel/UCSw52AtaknWAZLUP6ZCKm8A/videos" target="_blank">
                									<img class="img-responsive" src="/images/youtube.png">
                								</a>
                							</div>
                							<div class="col-md-3 col-xs-3 social_block_links insta">
                								<a href="//instagram.com/UkrainianWitness" target="_blank">
                									<img class="img-responsive" src="/images/instagram.png">
                								</a>
                							</div>
                							<div class="col-md-3 col-xs-3 social_block_links tg">
                								<a href="//t.me/UkrainianWitness" target="_blank">
                									<img class="img-responsive" src="/images/telegram.png">
                								</a>
                							</div>
                						</div>
                					</div>
                					-->
                				</div>
                			</div>
                			<div class="col-md-2 hidden-sm hidden-xs languages">
                									<div class="languageswitcherload">
                						<div class="mod-languages">
                                
                	<ul class="lang-inline">
                						<li class="" dir="ltr">
                			<a href="//2ip.ua/ua/services/information-service/mac-find">
                							UA						</a>
                			</li>
                								<li class="lang-active" dir="ltr">
                			<a href="//2ip.ua/ru/services/information-service/mac-find">
                							RU						</a>
                			</li>
                								<li class="" dir="ltr">
                			<a href="//2ip.me/en/services/information-service/mac-find">
                							EN						</a>
                			</li>
                								<li class="" dir="ltr">
                			<a href="//2ip.me/fr/services/information-service/mac-find">
                							FR						</a>
                			</li>
                				</ul>
                                
                </div>
                                
                					</div>
                							</div>
                		</div>
                	</div>
                </header>
                                
                                
                 <nav id="t3-mainnav" class="hidden-sm hidden-xs t3-mainnav">
                	<div class="container">
                		<div class="row">
                			<div class="col-md-2">
                				<div class="t3-navbar">
                					<ul class="nav sidebar-nav">
                <li class="item-117"><a href="/ru/" >Главная</a></li><li class="item-101 active deeper dropdown parent"><a role="button" data-target="#" class="dropdown-toggle menu-head" data-toggle="dropdown" aria-expanded="false"><span class="hang">Сервисы</span></a><ul class="dropdown-menu"><li class="item-123 dropdown-submenu parent"><a role="button" data-target="#" class="dropdown-toggle menu-head" data-toggle="dropdown" aria-expanded="false"><span class="hang">IP сервисы</span></a><ul class="dropdown-menu"><li class="item-108"><a href="/ru/services/ip-service/speedtest" >Тест скорости Интернет соединения</a></li><li class="item-109"><a href="/ru/services/ip-service/ping-traceroute" >Проверка доступности IP адреса или сайта</a></li><li class="item-369"><a href="/ru/services/ip-service/privacy" >Проверка приватности</a></li><li class="item-111"><a href="/ru/services/ip-service/port-check" >Проверка доступности порта</a></li><li class="item-136"><a href="/ru/services/ip-service/email-check" >Проверка существования e-mail адреса</a></li><li class="item-119"><a href="/ru/services/ip-service/spam" >Проверка наличия IP адреса в спам базах</a></li><li class="item-120"><a href="/ru/services/ip-service/dns-response" >Проверка времени отклика DNS-сервера</a></li><li class="item-133"><a href="/ru/services/ip-service/server-check" >Проверка ресурса на наличие активных сервисов</a></li></ul></li><li class="item-124 active dropdown-submenu parent"><a role="button" data-target="#" class="dropdown-toggle menu-head" data-toggle="dropdown" aria-expanded="false"><span class="hang">Информационные сервисы</span></a><ul class="dropdown-menu"><li class="item-134 current active"><a href="/ru/services/information-service/mac-find" >Определение производителя по MAC-адресу</a></li><li class="item-107"><a class="whois" href="https://2ip.ua/ru/services/information-service/whois" >Информация об IP адресе</a></li><li class="item-144"><a href="/ru/services/information-service/provider-ip" >Информация о блоках IP адресов провайдера</a></li><li class="item-143"><a href="/ru/services/information-service/hosting-information" >Определение хостинг-провайдера сайта</a></li><li class="item-121"><a href="/ru/services/information-service/site-location" >Узнать местонахождение IP адреса или сайта</a></li><li class="item-116"><a href="/ru/services/information-service/location-ip" >Узнать диапазон IP адресов по адресу</a></li><li class="item-208"><a href="/ru/services/information-service/site-distance" >Узнать расстояние между сайтами</a></li><li class="item-112"><a href="/ru/services/information-service/domain-information" >Информация о домене</a></li><li class="item-130"><a href="/ru/services/information-service/domain-check" >Проверка доступности домена</a></li><li class="item-132"><a href="/ru/services/information-service/nslookup" >Узнать IP адрес и почтовый сервер сайта</a></li><li class="item-142"><a href="/ru/services/information-service/site-information" >Информация о сайте</a></li><li class="item-129"><a href="/ru/services/information-service/dns-dig" >Узнать DNS параметры домена</a></li><li class="item-400"><a href="/ru/services/information-service/dns-check" >Проверка распространения DNS записи</a></li></ul></li><li class="item-125 dropdown-submenu parent"><a role="button" data-target="#" class="dropdown-toggle menu-head" data-toggle="dropdown" aria-expanded="false"><span class="hang">Полезные сервисы</span></a><ul class="dropdown-menu"><li class="item-141"><a href="/ru/services/useful-service/time-calculator" >Расчёт времени загрузки файла</a></li><li class="item-110"><a href="/ru/services/useful-service/ip-calculator" >Онлайн IP калькулятор</a></li><li class="item-131"><a href="/ru/services/useful-service/chmod-calculator" >Онлайн chmod калькулятор</a></li><li class="item-202"><a href="/ru/services/useful-service/punycode-converter" >Онлайн punycode конвертер</a></li><li class="item-210"><a href="/ru/services/useful-service/converter" >Онлайн конвертер</a></li><li class="item-204"><a href="/ru/services/useful-service/converter-registers" >Онлайн конвертер регистров</a></li><li class="item-118"><a href="/ru/services/useful-service/password-generator" >Онлайн генератор паролей</a></li><li class="item-206"><a href="/ru/services/useful-service/text-encryption" >Онлайн шифрование текста</a></li></ul></li><li class="item-137 dropdown-submenu parent"><a role="button" data-target="#" class="dropdown-toggle menu-head" data-toggle="dropdown" aria-expanded="false"><span class="hang">Сервисы для блога или сайта</span></a><ul class="dropdown-menu"><li class="item-138"><a href="/ru/services/userbars/speedmeter" >Тест скорости Интернет соединения для вашего сайта</a></li><li class="item-139"><a href="/ru/services/userbars/ip-block-userbar" >IP-блок и userbar для форума или вашего сайта</a></li></ul></li><li class="item-145"><a href="/ru/services/providers-rating" >Рейтинг интернет-провайдеров</a></li><li class="item-294"><a href="/ru/services/account" >Мой аккаунт</a></li></ul></li><li class="item-212 deeper dropdown parent"><a role="button" data-target="#" class="dropdown-toggle menu-head" data-toggle="dropdown" aria-expanded="false"><span class="hang">API</span></a><ul class="dropdown-menu"><li class="item-186"><a href="/ru/api/our-api" >2IP API</a></li><li class="item-358"><a href="/ru/api/2ip-speedtest-api" >2IP Speedtest API</a></li><li class="item-213"><a href="/ru/api/api-statistics" >Статистика использования API</a></li></ul></li><li class="item-104"><a href="/ru/blog" >Статьи</a></li><li class="item-262 deeper dropdown parent"><a role="button" data-target="#" class="dropdown-toggle menu-head" data-toggle="dropdown" aria-expanded="false"><span class="hang">Сайт</span></a><ul class="dropdown-menu"><li class="item-279"><a href="/ru/site/authentication" >Авторизация на сайте</a></li><li class="item-274"><a href="/ru/site/registration" >Регистрация на сайте</a></li><li class="item-275"><a href="/ru/site/password" >Восстановление пароля</a></li></ul></li><li class="item-352">	<a class="menu_social margin menu_facebook" href="//fb.com/2ip.ua" target="_blank" >fb.com/2ip.ua</a></li><li class="item-388">	<a class="menu_banner menu_luxsite" href="//luxsite.ua/seo/" target="_blank" title="продвижение сайтов" >luxsite.ua</a></li></ul>
                                
                				</div>
                			</div>
                			<div class="col-md-10">
                				<div class="row">
                					<div class="col-md-offset-10">
                						<div class="col-xs-12 account-lg">
                							
                                
                                
                                
                <div class="account">
                	<a class="fa fa-sign-in" href="/ru/site/authentication"><span>Войти</span></a>
                </div>
                						</div>
                					</div>
                				</div>
                			</div>
                		</div>
                	</div>
                </nav>
                                
                                
                 	<div class="container t3-sl t3-sl-userinfo ipblock">
                		<div class="row">
                			<div class="col-md-offset-2 col-md-10">
                				<div class="row">
                					<div class="col-md-10">
                						<div class="showip_mod"><div class="ipblockgradient">
                			<div class="row"><div class="col-xs-12 s-ipblockgrid"><div class="col-sm-3 col-xs-6 s-info1">
                						  <div class="name">Ваш IP адрес:</div><div class="result"><a href="/ru/services/information-service/whois?a=act&ip=217.79.4.44">217.79.4.44</a></div><div class="hmi-mini"><a href="//hidemy.name/ua/#558d28d96b224&chan=code2"><i class="fa fa-shield"></i><span class="hidden-sm hidden-xs">Сменить IP</span></a></div>
                					</div><div class="col-sm-3 col-xs-6 s-info2 microsoft hidden-xs"><div class="name">Операционная система:</div><div class="result">Microsoft Windows 10</div></div><div class="col-sm-3 col-xs-6 s-info3 hidden-xs"><div class="name">Местоположение:</div>
                					<div class="result"><a href="/ru/services/information-service/site-location?ip=217.79.4.44&a=act" id="resultlocation">...</a></div></div>
                				<div class="col-sm-3 col-xs-6 s-info4">
                					<div class="name">Провайдер:</div>
                						<div class="result"><span id="resultproveder">...</span></div></div></div>
                				</div>
                		</div>
                		<script>
                		(function($){
                			var PTE = new PrivacyTestExspress({
                					file: '/service/privacy/privacy.php',
                					tests: [ ['provider'] ],
                					langcode: 'ru-RU',
                					lang: {
                					},
                					onstart: function(){
                					},
                					onprogress: function(test, data){
                						if(test === 'provider'){
                							var provider = $('#resultproveder'),
                							location = $('#resultlocation');
                							provider.html(data.provider);
                							location.text(data.country + ', ' + data.city);
                						}
                					}
                				});
                			PTE.startTest();
                		})(jQuery);
                	</script>
                	</div>
                <script>
                (function($){
                	$('.inner-block-cl').click(function(){
                		var cid = $(this).attr('cid');
                		$.ajax({
                			url: '/service/libs/adv-click.php?cid=' + cid + '&rnd=' + Math.random(),
                			success: function(data){}
                		});
                	});
                                
                	$('[data-toggle="tooltip"]').tooltip();
                })(jQuery);
                </script>
                                
                					</div>
                				</div>
                			</div>
                		</div>
                	</div>
                                
                                
                \s
                                
                 	<div class="container t3-sl-helper">
                		<div class="row">
                			<div class="col-md-offset-2 col-md-10">
                				<div class="row">
                					<div class="col-md-10">
                						<div class="t3-sl-helper-wrap">
                							
                                
                <div class="custom_helpinfo"  >
                	<p><i class="fa fa-info-circle"></i>
                	<span><a href="/ru/blog/mac-address">Что такое MAC-адрес?</a></span></p>
                </div>
                                
                						</div>
                					</div>
                				</div>
                			</div>
                		</div>
                	</div>
                                
                                
                \s
                <div id="t3-mainbody" class="container t3-mainbody">
                	<div class="row">
                		<div class="col-md-offset-2 col-md-10">
                			<div class="row">
                				<div class="col-md-10">
                					<div id="t3-content" class="t3-content">
                												
                	<div class="page-header clearfix">
                					<h1 class="page-title"><span style="background-image:url('/images/icon/Mac_find.png');">Определение производителя по MAC-адресу</span></h1>
                			</div>
                                
                <div class="item-page_mac-find clearfix">
                                
                                
                                
                <article itemscope itemtype="http://schema.org/Article">
                                
                                
                                
                                
                	
                                
                	
                                
                	
                	
                	<section class="article-content clearfix" itemprop="articleBody">
                		
                <form method="post" role="form" action="" onsubmit="progressbar();">
                	<input type="hidden" value="act" name="a">
                                
                	<div class="form-group label-floating">
                		<label for="mac" class="control-label">
                			Введите mac-адрес для проверки		</label>
                		<input type="text" id="mac" class="form-control" required="required" name="mac" value="00:30:48:5a:58:65">
                		<p class="help-block">Например: <span>00:30:48:5a:58:65</span>, <span>00-22-15-75-1C-1E</span>, <span>000a.e475.7469</span>, <span>001201BB4ADD</span></p>
                	</div>
                	<div class="form-group text-center">
                		<button type="submit" class="btn btn-primary">Проверить</button>
                	</div>
                </form>
                                
                <div id="progressbar" class="progressbar"></div>
                                
                                
                		<div id="resultcontainer" class="table-responsive">
                			<p class="text-center">Производителем устройства с mac-адресом 00:30:48:5a:58:65 является компания:</p>
                			<table class="table table-striped">
                				<tr>
                					<td>Имя компании:</td>
                					<td>Super Micro Computer, Inc.</td>
                				</tr>
                				<tr>
                					<td>Адрес компании:</td>
                					<td>2051 Junction Avenue San Jose CA US 95131 </td>
                				</tr>
                				<tr>
                					<td>Уникальный идентификатор организации:</td>
                					<td>003048</td>
                				</tr>
                				<tr>
                					<td>Размер диапазона:</td>
                					<td>MA-L <i class="fa fa-info-circle mac-info" data-toggle="tooltip" data-placement="top" title="MAC Address Block Large (~16 million)"></i>
                					</td>
                				</tr>
                			</table>
                			<center style="padding: 0 18%;"><img class="img-responsive" src="/images/mac/mac-mal.png" />
                			</center>
                		</div><script>
                (function($, w){
                	$('[data-toggle="tooltip"]').tooltip();
                })(jQuery, window);
                </script>
                	</section>
                                
                 \s
                	
                	
                	
                </article>
                                
                                
                                
                </div>
                					</div>
                				</div>
                			</div>
                		</div>
                	</div>
                </div>\s
                                
                                
                \s
                	<div class="container t3-sl t3-sl-2" style="position: relative;top: -45px;">
                			<!-- SPOTLIGHT -->
                	<div class="t3-spotlight t3-spotlight-adsence-2  row">
                		<div class="col-md-offset-2 col-md-10">
                			<div class="row">
                				<div class="col-md-10">
                					<div class="row">
                													<div class=" col-lg-12 col-md-12 col-sm-12 col-xs-12">
                																<div class="t3-module module_adsense " id="Mod421" ><div class="module-inner"><div class="module-ct">
                                
                <div class="custom_adsense"  >
                	<a href="//www.comebackalive.in.ua/uk/donate" target="_blank"><img class="img-responsive" style="margin: 0 auto;" src="/images/support_ukraine.png" alt="" /></a></div>
                </div></div></div>
                															</div>
                											</div>
                				</div>
                			</div>
                		</div>
                	</div>
                <!-- SPOTLIGHT -->
                	</div>
                                
                                
                \s
                                
                                
                \s
                                
                                
                \s
                                
                                
                \s
                                
                \s
                                
                                
                \s
                                
                                
                \s
                                
                                
                 <div class="container t3-sl t3-sl-totop hidden-sm hidden-xs">
                	<div class="row">
                		<div class="col-md-2">
                					</div>
                		<div class="col-md-10">
                			<div class="row">
                				<div class="col-md-offset-10">
                											<div class="col-xs-12">
                							
                                
                <div class="custom"  >
                	<a href="#" class="totop fa fa-chevron-up"></a>
                </div>
                                
                						</div>
                									</div>
                			</div>
                		</div>
                	</div>
                </div>
                                
                \s
                	<div class="container t3-sl t3-sl-adsense-bottom">
                		<div class="row">
                			<div class="col-md-offset-2 col-md-10">
                				<div class="row">
                					<div class="col-md-10">
                						
                                
                <div class="custom_adsense"  >
                	<script async src="//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>
                <!-- 2ip adaptive -->
                <ins class="adsbygoogle"
                     style="display:block"
                     data-ad-client="ca-pub-2871984509315629"
                     data-ad-slot="3172940050"
                     data-ad-format="auto"
                     data-full-width-responsive="true"></ins>
                <script>
                (adsbygoogle = window.adsbygoogle || []).push({});
                </script></div>
                                
                					</div>
                				</div>
                			</div>
                		</div>
                	</div>
                                
                                
                 <footer id="t3-footer" class="wrap t3-footer">
                                
                	
                	<section class="t3-copyright">
                		<div class="container">
                			<div class="row">
                				<div class="col-sm-2 col-md-2">
                					<div class="email"><i class="fa fa-envelope-o"></i><a href="mailto:help@2ip.ua">help@2ip.ua</a></div>
                				</div>
                				<div class="col-sm-10 col-md-10">
                					<div class="row">
                						<div class="col-sm-10 col-md-10">
                							<ul class="social-icons list-inline">
                								<!--
                								<li><a onclick="share.facebook(document.URL)"><i class="fa fa-facebook"></i></a></li>
                								<li><a onclick="share.twitter(document.URL)"><i class="fa fa-twitter"></i></a></li>
                								<li><a onclick="share.linkedin(document.URL)"><i class="fa fa-linkedin"></i></a></li>
                								-->
                								<li><a href="//www.facebook.com/ukrainianwitness" target="_blank"><i class="fa fa-facebook"></i></a></li>
                								<li><a href="//www.youtube.com/channel/UCSw52AtaknWAZLUP6ZCKm8A/videos" target="_blank"><i class="fa fa-youtube"></i></a></li>
                								<li><a href="//instagram.com/UkrainianWitness" target="_blank"><i class="fa fa-instagram"></i></a></li>
                								<li><a href="//t.me/UkrainianWitness" target="_blank"><i class="fa fa-telegram"></i></a></li>
                							</ul>
                						</div>
                						<div class="col-sm-2 col-md-2">
                							<div class="date">
                								<span style="white-space:nowrap;">
                									<i class="fa fa-copyright"></i> 2IP<sup class="trademark"><i class="fa fa-trademark"></i></sup>
                								</span>\s
                								<span style="white-space:nowrap;">
                									2012 &mdash; 2022								</span>\s
                							</div>
                						</div>
                					</div>
                					<div class="row">
                						<div class="col-sm-10 col-md-10 text-center agreement">
                							<a href="/ua/user-agreement">Пользовательское соглашение</a>
                						</div>
                					</div>
                				</div>
                			</div>
                		</div>
                	</section>
                                
                	<script>
                	(function($){
                		$.material.init();
                	})(jQuery);
                	</script>
                	
                                
                <div class="custom"  >
                	<!-- Global site tag (gtag.js) - Google Analytics -->
                <script async src="https://www.googletagmanager.com/gtag/js?id=G-RC0V2XPF1X"></script>
                <script>
                  window.dataLayer = window.dataLayer || [];
                  function gtag(){dataLayer.push(arguments);}
                  gtag('js', new Date());
                                
                  gtag('config', 'G-RC0V2XPF1X');
                </script></div>
                                
                </footer>
                                
                </div>
                                
                </body>
                                
                </html>
                """;
    }

}