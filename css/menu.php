@import url('../sticky-slider/css/sticky-slider.php');
@import url('../flexslider/css/flexslider.php');

/* -----------------------------------------
   Fixed menu navigation
----------------------------------------- */

.header-navi {
    width: 100%;
    z-index: 999;
    top:0;
}

.header-navi-inner {
    width: 1200px;
    margin: 0 auto;
}

#header .row {
    padding-bottom: 18px;
}

.small-logo {
    max-width: 15%;
    float:left;
    margin:7px 0 0 2%;
}

.small-logo img {
	max-height:35px;
}

.droped-navi {
	position:fixed;
    display: none;
    left:0;
	top:-60px;
	height:56px;
	width:100%;
    box-shadow: 0 0 3px rgba(0, 0, 0, .3);
    -webkit-box-shadow: 0 0 3px rgba(0, 0, 0, .3);
    -moz-box-shadow: 0 0 3px rgba(0, 0, 0, .3);
    background: #ffffff;
    background: rgba(255, 255, 255, .95);
	z-index:9999;
	padding:3px 0 0;
	opacity:0;
}

.droped-navi.active {
    display: block;
}

.droped-navi-inner {
	max-width:1200px;
	margin:0 auto;
}

#drop-top-menu {
	float:right;
}

.menu-item-wrap {
	width: 100%;
}

#drop-top-menu li .menu-item-wrap:before {
	display:none;
}

#header #drop-top-menu .menu li .link-desc {
	display:none;
}

#drop-top-menu li {
	list-style:none;
}

#drop-top-menu > ul > li {
	float:left;
	font-size:14px;
}

#top-menu {
    float: none;
    padding-top: 12px;
}

#top-menu>.menu {
    margin: 0 auto;
    padding: 0 10px;
}

#header {
  padding: 20px;
  text-align: center;
}

#header #drop-top-menu .menu > li {
	width:auto;
	padding-bottom:0;
}

#header #drop-top-menu .menu {
	width:auto;
	margin-top:13px;
}

#header .link-text{
	color: #565a5f;
}

#header #drop-top-menu .menu ul li > .menu-item-wrap .link-text:hover,
#header #drop-top-menu .menu ul .current-menu-item > .menu-item-wrap .link-text  {
	color:#ffffff;
}

#header #drop-top-menu .menu > li > .menu-item-wrap {
	padding:0 40px 20px 0;
}

#header #drop-top-menu .menu > li > ul {
	margin:0;
	top:38px;
}

#header #drop-top-menu .menu > li > ul > li:first-child:after,
#header #drop-top-menu .menu > li > ul > li:first-child:before {
	left:40px;
}


/* -----------------------------------------
   Top menu
----------------------------------------- */

#header.horizontal #top-menu>ul>li>.menu-item-wrap {
    display: block;
}

.has-submenu > span .link-text {
    display: inline-block;
    padding-right: 15px;
    background: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAcAAAAFCAYAAACJmvbYAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyBpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMC1jMDYwIDYxLjEzNDc3NywgMjAxMC8wMi8xMi0xNzozMjowMCAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNSBXaW5kb3dzIiB4bXBNTTpJbnN0YW5jZUlEPSJ4bXAuaWlkOjUyQUEyRTFDQUE4RTExRTJBNUI4QjhDRTExMjA5OTMwIiB4bXBNTTpEb2N1bWVudElEPSJ4bXAuZGlkOjUyQUEyRTFEQUE4RTExRTJBNUI4QjhDRTExMjA5OTMwIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6NTJBQTJFMUFBQThFMTFFMkE1QjhCOENFMTEyMDk5MzAiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6NTJBQTJFMUJBQThFMTFFMkE1QjhCOENFMTEyMDk5MzAiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz4XhKTDAAAAS0lEQVR42mJcueXQ//8MDAzh3raMDFCwcuuh/4wMjAxMIA5IdNXWwyA1YJqRAaKO8T9QH0wCGYQBTWKCMdAlwAyQThgG24/EBwgwAG/PLDHRBRqHAAAAAElFTkSuQmCC) 100% 50% no-repeat;
	/*arrow-drop.png*/
}

#header .menu {
    width: 100%;
    display: inline-block;
    list-style: none;
}

#header .menu>li {
    position: relative;
    float: left;
    width: 25%;
    text-align: left;
    min-height: 65px;
    
	/*float: left;
	width: 25%;
	min-height: 65px;
	display: inline-block;*/
}

#header .menu>li ul li .link-text {
    padding: 8px 10px 8px 35px;
    font-size: 14px !important;
}

#top-menu ul {
    padding: 0;
    margin: 0;
    list-style: none;
}

#header .menu>li.last {
    margin-right: 0;
    padding-right: 0;
}

#header .menu>li:last-child ul {
    right: 0;
    left: auto;
}

#header .menu>li>.under {
    display: none;
}

#header .menu>li>.menu-item-wrap {
    display: block;
    cursor: pointer;
    min-height: 50px;
    margin-left: 18%;
}

#header .menu .no_icon .link-text {
    display: inline-block;
    margin-top: 23px;
}

#header .menu>li:last-child>ul {
    right: 0;
}

#header .menu>li>ul>li:first-child {
    padding-top:15px;
}

#header .menu>li>ul>li:last-child {
    padding-bottom:10px;
}

#header .menu>li>ul {
    border: 1px solid #eaeced;
    //position: absolute;
    top: 65px;
    width: 225px;
    //max-width: 600%;
    overflow: visible !important;
    box-shadow: 4px 4px 0 rgba(0, 0, 0, 0.1);
    -webkit-box-shadow: 4px 4px 0 rgba(0, 0, 0, 0.1);
    -moz-box-shadow: 4px 4px 0 rgba(0, 0, 0, 0.1);
    background: #ffffff;
    background: rgba(255,255,255,.95);
    opacity: 0;
    display: none;
    border-radius: 3px;
    z-index:9999;
    -moz-transition: opacity .2s ease-in-out;
    -webkit-transition: opacity .2s ease-in-out;
    -o-transition: opacity .2s ease-in-out;
    transition: opacity .2s ease-in-out;
    overflow: visible !important;
    list-style: none;
}

#header .menu>li>ul>li {
    position: relative;
    padding-bottom:5px;
}

#header .menu>li>ul>li>ul {
    position: absolute;
    height: 0;
    overflow: hidden;
    left: 0;
    top: -3px;
    display: none;
    min-width: 200px;
    width: 255px;
    background: #ffffff;
    border: 1px solid #eaeced;
    border-radius: 3px;
}

#header .menu>li>ul>li:hover>ul {
    height: auto;
    display: block;
    left: 100%;
}

#top-menu ul li ul .link-text {
    margin-left: 0;
}

#header .menu>li ul li .link-text {
    padding: 8px 10px 8px 35px;
    font-size: 14px !important;
}

#header .menu .link-desc {
    font-weight: normal;
    font-style: italic;
    color: #bcc1c7;
    font-size: 12px;
    line-height: 20px;
    display: block;
    white-space: nowrap;
}

#header .menu>li:hover>ul {
    opacity: 1;
	display: block;
}

#header .menu>li ul li .menu-item-wrap {
    display: inline-block;
}

#header .menu>li ul li .menu-item-wrap a {
    display: block;
}

#header .menu> li ul  .mega-text  a {
    display: inline-block !important;
}


#header .menu > li >ul>li>.menu-item-wrap>a:hover,
#header .menu > li > ul > li >ul>li>.menu-item-wrap>a:hover,
#header .menu > li>ul>li.current-menu-item>.menu-item-wrap>a {
    background: #99a7ac;
    margin: 0 -1px;
    padding: 0 1px;
}

#header .menu > li > ul > li > span > a:hover > .link-text,
#header .menu ul > li  > ul > li > span > a:hover > .link-text {
    color: #fff;
}

#header .menu>li ul li .link-text {
    display: block;
    padding: 10px 10px 10px 35px;
    text-transform: none;
    font-size: 14px;
    color: #7b7b7b;
}

#top-menu .current-menu-item>span .tile-icon .normal-icon,
#top-menu li>span .tile-icon .active-icon {
    display: none;
}

#top-menu .current-menu-item>span .tile-icon .active-icon {
    display: inline;
}

#header .menu.current-menu-item > span .link-text {
    color: #fff;
}

#show-menu-button {
    display: none;
    color: #696a6c;
    cursor: hand;
}

#show-menu-button::selection {
	background-color: #A8A8A9;
	color: #696a6c;
}

#show-menu-button::-moz-selection {
	background-color: #696A6C;
	color: #696a6c;
}

#top-menu .current-menu-item>span .tile-icon .normal-icon,
#top-menu li>span .tile-icon .active-icon,
#top-menu .current-menu-item>span .tile-icon .active-icon,
#top-menu .tile-icon img {
    display: none;
}

.tile-icon {
    font-family: 'fontello';
    position: relative;
    font-size:40px;
    line-height:46px;
    text-align:center;

}

#header .menu>li:hover>.under {
	display:none !important;
}

#header .menu .current-menu-item > span  .link-text {
	color: #5e6063;
}

#header .menu> li >ul>li>.menu-item-wrap>a:hover,
#header .menu > li > ul > li >ul>li>.menu-item-wrap>a:hover,
#header .menu > li>ul>li.current-menu-item>.menu-item-wrap>a {
    background: #52BED2;
}

#header .menu>li ul li .link-text {
    padding: 8px 10px 8px 35px;
    font-size: 14px !important;
}

#menu-products, #menu-develop, #menu-community, #menu-about {
    z-index: 9999;
}

#menu-products ul>li:first-child:before {
    content: "";
    width: 0;
    height: 0;
    border-left: 10px solid transparent;
    border-right: 10px solid transparent;
    border-bottom: 7px solid #eaeced;
    position: absolute;
    top: -8px;
    left: 16%;
}

#menu-products ul>li:first-child:after {
	content: "";
    width: 0;
    height: 0;
    border-left: 9px solid transparent;
    border-right: 9px solid transparent;
    border-bottom: 7px solid #ffffff;
    position: absolute;
    top: -7px;
    left: 16%;
    margin-left: 1px;
}


#menu-develop ul>li:first-child:before, #menu-community ul>li:first-child:before, #menu-about ul>li:first-child:before {
    content: "";
    width: 0;
    height: 0;
    border-left: 10px solid transparent;
    border-right: 10px solid transparent;
    border-bottom: 7px solid #eaeced;
    position: absolute;
    top: -8px;
    left: 50%;
    margin-left: -11px;
}

#menu-develop ul>li:first-child:after, #menu-community ul>li:first-child:after, #menu-about ul>li:first-child:after {
	content: "";
    width: 0;
    height: 0;
    border-left: 9px solid transparent;
    border-right: 9px solid transparent;
    border-bottom: 7px solid #ffffff;
    position: absolute;
    top: -7px;
    left: 50%;
    margin-left: -10px;
}

#header .phone {font-weight: 400;}

#menu-primary-navigation >li>ul {
	right: 0;
	left: auto;
}

.twitter-row iframe { display:none; }

.twitter-row .icon {width: 40px; margin-right:25px;}

/*  Fix 28.05 
2cols masonry blog
  */

.lost_password-link {
	margin-top: 4px;
}

#grid-posts.col-2 article.small-news {
	width: 49.9% !important;
	margin-left: 0 !important;
	padding-left: 10px;
	padding-right: 10px;
}

.linecon {
	height: 22px;
	float: left;
}

.products_image {
	height: 36px;
	width: 36px;
	float: left;
	margin-right: 12px;
	margin-top: 2px;
}

.develop_image {
	height: 36px;
	width: 36px;
	float: left;
	margin-right: 12px;
	margin-top: 2px;	
}

.community_image {
	height: 36px;
	width: 36px;
	float: left;
	margin-right: 12px;
	margin-top: 2px;	
}

.about_image {
	height: 36px;
	width: 36px;
	float: left;
	margin-right: 12px;
	margin-top: 2px;
}

#header.sticky .menu .link-desc {
	display: none;
}

#header.sticky .products_image, #header.sticky .develop_image, #header.sticky .community_image, #header.sticky .about_image {
	background: none;
	height: 0;
}

#header.sticky .menu>li>ul {
	position: relative !important;
	right: 68% !important;
	top: 0px;
}

#header.sticky .products_list {
	display: none !important;
}

#header.sticky {
	right: 0;
	top: 0;
}

#header.sticky .menu>li>.menu-item-wrap.community {
	margin-left: 12%;
}

.panel-grid:before {
	content: '';
	display: block;
}

.panel-grid:after {
	clear: both;
	content: '';
	display: table;
}

#product-1-desc .widget_about_author_widget:before {
	content: "";
	width: 0;
	height: 0;
	border-top: 10px solid transparent;
	border-bottom: 10px solid transparent;
	border-right: 7px solid #eaeced;
	position: absolute;
	top: 9%;
	margin-left: -17px;
}

#product-1-desc .widget_about_author_widget:after {
	content: "";
	width: 0;
	height: 0;
	border-top: 10px solid transparent;
	border-bottom: 9px solid transparent;
	border-right: 7px solid #ffffff;
	position: absolute;
	top: 9%;
	margin-left: -17px;
}


#product-2-desc .widget_about_author_widget:before {
	content: "";
	width: 0;
	height: 0;
	border-top: 10px solid transparent;
	border-bottom: 10px solid transparent;
	border-right: 7px solid #eaeced;
	position: absolute;
	top: 42%;
	margin-left: -17px;
}


#product-2-desc .widget_about_author_widget:after {
	content: "";
	width: 0;
	height: 0;
	border-top: 10px solid transparent;
	border-bottom: 9px solid transparent;
	border-right: 7px solid #ffffff;
	position: absolute;
	top: 42%;
	margin-left: -17px;
}


#product-3-desc .widget_about_author_widget:before {
	content: "";
	width: 0;
	height: 0;
	border-top: 10px solid transparent;
	border-bottom: 10px solid transparent;
	border-right: 7px solid #eaeced;
	position: absolute;
	top: 48%;
	margin-left: -17px;
}


#product-3-desc .widget_about_author_widget:after {
	content: "";
	width: 0;
	height: 0;
	border-top: 10px solid transparent;
	border-bottom: 9px solid transparent;
	border-right: 7px solid #ffffff;
	position: absolute;
	top: 48%;
	margin-left: -17px;
}

#product-4-desc .widget_about_author_widget:before {
	content: "";
	width: 0;
	height: 0;
	border-top: 10px solid transparent;
	border-bottom: 10px solid transparent;
	border-right: 7px solid #eaeced;
	position: absolute;
	top: 124%;
	margin-left: -17px;
}


#product-4-desc .widget_about_author_widget:after {
	content: "";
	width: 0;
	height: 0;
	border-top: 10px solid transparent;
	border-bottom: 9px solid transparent;
	border-right: 7px solid #ffffff;
	position: absolute;
	top: 124%;
	margin-left: -17px;
}


#pg-2491-0 .panel-grid-cell { 
	float:left;
} 

.panel-grid-cell .panel { 
	//margin-bottom: 60px;
} 

.panel-grid-cell .panel:last-child { 
	//margin-bottom: 0 !important;
} 

.panel-grid { 
	margin: 0 -10px 0 -10px;
} 

.panel-grid:before {
	content: '';
	display: block;
}

h1, h2, h3, h4, h5, h6, .author-description > h6 a, .project-title, .info-box .title, ul.accordion > li.active > div.title h5, ul.accordion > li.active > div.title h4, ul.accordion > li.active > div.title h3, ul.accordion > li.active > div.title h2, ul.accordion > li > div.title h1, ul.accordion > li > div.title h2, ul.accordion > li > div.title h3, ul.accordion > li > div.title h4, ul.accordion > li > div.title h5, #header .menu .current-menu-item > span .link-text {
	color: #494949;
}

h3 {
	margin: 0;
	font-weight: 600;
	font-size: 19px;
}

.panel-grid-cell {
	padding: 0 10px 0 10px; 
	box-sizing: border-box;
	min-height: 1em;
	border-left: 1px solid #e7e7e7;
}

/* -----------------------------------------
   Widgets
----------------------------------------- */

.widget {
    margin-bottom: 40px;
}


.widget p {
    font-size: inherit;
    line-height: inherit;
    font-style: inherit;
}

.video-block {
    position: relative;
}

.text-widget {
    line-height: 1.6;
}

.widget ul {
    padding: 0;
    margin: 0;
    list-style: none;
}

.widget {
    position: relative;
}

.menu-item-wrap h3.widget-title {
	margin-bottom: 15px;
}

.widget-title .our_products_image {
	background: url(data:image/png;base64,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) no-repeat scroll 50% 50% / 24px 24px transparent;
	float: left;
	margin-right: 15px;
	height: 24px;
	width: 24px;
	margin-top: -2px;
}

#footer .widget-title{
    margin-bottom: 30px;
}

/* -----------------------------------------
   styled list widget
----------------------------------------- */

.product-1, .product-2, .product-3, .product-4 { 
	width:24.043%;
	text-align: center;
	color:#4CA5B5;
} 

.product-1 .product_logo, .product-2 .product_logo, .product-3 .product_logo, .product-4 .product_logo {
	height: 24px;
	padding-right: 12px;
}

.product-1 .product_logo {
	/*background: url('../images/core.png') no-repeat scroll 50% 50% / 34px 24px transparent;*/
	padding-left: 26px;
	padding-top: 5px;
}

.product-2 .product_logo {
	padding-left: 26px;
	padding-top: 5px;
}

.product-3 .product_logo {
	padding-left: 26px;
	padding-top: 5px;
}

.product-4 .product_logo {
	padding-left: 26px;
	padding-top: 5px;
}

.menu-item-wrap [class*="product_"] {
    margin-right:10px;
}

.product-1, .product-2, .product-3, .product-4 {
    border-radius:2px;
    padding:12px 0px;
    font-style: italic;
    line-height: 1;
}

#product-1-desc, #product-2-desc, #product-3-desc, #product-4-desc {
	display: none;
}

.menu-background-transparent {
	background: transparent !important;
}


.product-1-1:hover> #product-1-desc, .product-2-1:hover> #product-2-desc, .product-3-1:hover> #product-3-desc, .product-4-1:hover> #product-4-desc {
    display: block;
}

#product-1-desc {
	float: right;
 	width:75.957%;
 	display: none;
	margin-top: -50px; 
}

#product-2-desc {
	float: right;
	width:75.957%;
	display: none;
	margin-top: -88px;
}

#product-3-desc {
	float: right;
	width:75.957%;
	display: none;
	margin-top: -126px;
}

#product-4-desc {
	width:75.957%;
	float: right;
	display: none;
	margin-top: -164px;
}

.about_author_widget .avatar {
	float: left;
}

.about_author_widget .avatar img {
	padding-top: 23%;
}

.about_author_widget .text {
	padding: 0px 0 0 0px;
	margin: 10px 0 20px 0px;
}

.about_author_widget .additional-links {
	float: right;
}

.about_author_widget .additional-links div {
	margin-right: 15px;
}

#header .menu>li ul li .menu-item-wrap .about_author_widget .additional-links>a {
	display: initial;
}

.styled-widget-list > li [class*="product_"]:before {
    line-height:20px;
}

.styled-widget-list > li:hover [class*="product_"], .styled-widget-list > li:hover {
    color:#fff;
}


