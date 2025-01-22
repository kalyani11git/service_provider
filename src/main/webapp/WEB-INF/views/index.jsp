<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
  <!-- Basic -->
  <meta charset="utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <!-- Mobile Metas -->
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
  <!-- Site Metas -->
  <meta name="keywords" content="" />
  <meta name="description" content="" />
  <meta name="author" content="" />

  <title>Electrochip</title>

  <!-- slider stylesheet -->
  <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.1.3/assets/owl.carousel.min.css" />

  <!-- bootstrap core css -->
  <link rel="stylesheet" type="text/css" href="./resources/css/bootstrap.css" />

  <!-- fonts style -->
  <link href="https://fonts.googleapis.com/css?family=Poppins:400,600,700&display=swap" rel="stylesheet">
  <!-- Custom styles for this template -->
  <link href="./resources/css/style.css" rel="stylesheet" />
  <!-- responsive style -->
  <link href="./resources/css/responsive.css" rel="stylesheet" />
</head>

<body>

  <div class="hero_area">
    <!-- header section strats -->
    <header class="header_section">
      <div class="container">
        <nav class="navbar navbar-expand-lg custom_nav-container ">
          <a class="navbar-brand" href="index.html">
            <img src="./resources/images/logo.png" alt="">
            <span>
              Super Services
            </span>
          </a>
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="s-1"> </span>
            <span class="s-2"> </span>
            <span class="s-3"> </span>
          </button>

          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <div class="d-flex ml-auto flex-column flex-lg-row align-items-center">
              <ul class="navbar-nav  ">
                <li class="nav-item active">
                  <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="#about"> About</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="#services"> Service </a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="AdminLoginForm"> Admin </a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="ServiceProviderLogin">Service Provider</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="UserLoginForm">User</a>
                </li>
              </ul>
            </div>
          </div>
        </nav>
      </div>
    </header>
    <!-- end header section -->
    <!-- slider section -->
    <section class=" slider_section ">
      <div class="container">
        <div class="row">
          <div class="col-md-6 ">
            <div class="detail_box">
              <h1>

                Service <br>
                Providers
              </h1>
              <p>
              We Believe in Service, and you know that.
                
              </p>
              <a href="#Contact" class="">
                Contact Us
            </div>
          </div>
          <div class="col-lg-5 col-md-6 offset-lg-1">
            <div class="img_content">
              <div class="img_container">
                <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
                  <div class="carousel-inner">
                    
                    <div class="carousel-item active">
                      <div class="img-box">
                        <img src="./resources/images/painter.jpeg" alt="">
                      </div>
                    </div>
                    <div class="carousel-item">
                      <div class="img-box">
                        <img src="./resources/images/child care.jpeg" alt="">
                      </div>
                    </div>
                    
                    
                    </div>
                  </div>
                </div>
              </div>
              <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
                <span class="sr-only">Previous</span>
              </a>
              <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
                <span class="sr-only">Next</span>
              </a>
            </div>

          </div>
        </div>
      </div>
    </section>
    <!-- end slider section -->
  </div>


  <!-- service section -->
  <section id="services" class="service_section layout_padding">
    <div class="container">
      <div class="heading_container">
        <h2>
          Our Services
        </h2>
        <img src="./resources/images/plug.png" alt="">
      </div>

      <div class="service_container">
        <div class="box">
          <div class="img-box">
            <img src="./resources/images/s1.jpeg" class="img1" alt="">
          </div>
          <div class="detail-box">
            <h5>
              Plumber
            </h5>
            
          </div>
        </div>
        <div class="box active">
          <div class="img-box">
            <img src="./resources/images/electrician.jpeg" class="img1" alt="">
          </div>
          <div class="detail-box">
            <h5>
              
              Electrician
              </a>
            </h5>
            
          </div>
        </div>
        <div class="box">
          <div class="img-box">
            <img src="./resources/images/PestControl.jpeg" class="img1" alt="">
          </div>
          <div class="detail-box">
            <h5>
              
                Pest Control
                  
            </h5>
            
          </div>
        </div>
        <div class="box">
          <div class="img-box">
            <img src="./resources/images/painter.jpeg" class="img1" alt="">
          </div>
          <div class="detail-box">
            <h5>
              
                Painter
           
            </h5>
          </div>
        </div>
        <div class="box">
          <div class="img-box">
            <img src="./resources/images/carpenter.jpeg" class="img1" alt="">
          </div>
          <div class="detail-box">
            <h5>
              
                Carpenter
              
            </h5>
          </div>
        </div>
        
        <div class="box">
          <div class="img-box">
            <img src="./resources/images/child care.jpeg" class="img1" alt="">
          </div>
          <div class="detail-box">
            <h5>
              
                Child Care
             
            </h5>
          </div>
        </div>
      </div>
      
  </section>
  <!-- end service section -->

  <!-- about section -->
  <section id="about" class="about_section layout_padding">
    <div class="container">
      <div class="row">
        <div class="col-md-6">
          <div class="detail-box">
            <div class="heading_container">
              <h2>
                About Us
              </h2>
              <img src="./resources/images/plug.png" alt="">
            </div>
            <p>
              Empowering your endeavors, we at Super Services dedicate ourselves to delivering 
              top-tier [service category] solutions. With a steadfast commitment to excellence,
               we strive to exceed expectations, making your satisfaction our utmost priority. 
               Trust in our expertise to elevate your experience and achieve your goals seamlessly.
            </p>
            <a href="">
              Read More
            </a>
          </div>
        </div>
        <div class="col-md-6">
          <div class="img_container">
            <div class="img-box b1">
              <img src="./resources/images/carpenter.jpeg" alt="" />
            </div>
            <div class="img-box b2">
              <img src="./resources/images/s1.jpeg" alt="" />
            </div>
            
          </div>

        </div>

      </div>
    </div>
  </section>

  <!-- end about section -->

  <!-- end blog section -->



  <!-- contact section -->

  <section id="Contact" class="contact_section layout_padding">
    <div class="container ">
      <div class="heading_container">
        <h2>
          Contact Us
        </h2>
        <img src="./resources/images/plug.png" alt="">
      </div>
    </div>
    <div class="container">
      <div class="row">
        <div class="col-md-6">
          <form action="">
            <div>
              <input type="text" placeholder="Name" />
            </div>
            <div>
              <input type="email" placeholder="Email" />
            </div>
            <div>
              <input type="text" placeholder="Phone Number" />
            </div>
            <div>
              <input type="text" class="message-box" placeholder="Message" />
            </div>
            <div class="d-flex ">
              <button>
                SEND
              </button>
            </div>
          </form>
        </div>
        <div class="col-md-6">
          <div class="map_container">
            <div class="map-responsive">
              <iframe src="https://www.google.com/maps/embed/v1/place?key=AIzaSyA0s1a7phLN0iaD6-UE7m4qP-z21pH0eSc&q=Eiffel+Tower+Paris+France" width="600" height="300" frameborder="0" style="border:0; width: 100%; height:100%" allowfullscreen></iframe>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>

  <!-- end contact section -->


  <!-- info section -->

  <section class="info_section layout_padding">
    <div class="container">
      <div class="info_contact">
        <div class="row">
          <div class="col-md-4">
            <a href="">
              <img src="./resources/images/location-white.png" alt="">
              <span>
                Passages of Lorem Ipsum available
              </span>
            </a>
          </div>
          <div class="col-md-4">
            <a href="">
              <img src="./resources/images/telephone-white.png" alt="">
              <span>
                Call : +012334567890
              </span>
            </a>
          </div>
          <div class="col-md-4">
            <a href="">
              <img src="./resources/images/envelope-white.png" alt="">
              <span>
                demo@gmail.com
              </span>
            </a>
          </div>
        </div>
      </div>
      <div class="row">
        <div class="col-md-8 col-lg-9">
          <div class="info_form">
            <form action="">
              <input type="text" placeholder="Enter your email">
              <button>
                subscribe
              </button>
            </form>
          </div>
        </div>
        <div class="col-md-4 col-lg-3">
          <div class="info_social">
            <div>
              <a href="">
                <img src="./resources/images/fb.png" alt="">
              </a>
            </div>
            <div>
              <a href="">
                <img src="./resources/images/twitter.png" alt="">
              </a>
            </div>
            <div>
              <a href="">
                <img src="./resources/images/linkedin.png" alt="">
              </a>
            </div>
            <div>
              <a href="">
                <img src="./resources/images/instagram.png" alt="">
              </a>
            </div>
          </div>
        </div>
      </div>

    </div>
  </section>

  <!-- end info section -->

  <!-- footer section -->
  <footer class="container-fluid footer_section">
    <div class="container">
      <div class="row">
        <div class="col-lg-7 col-md-9 mx-auto">
          <p>
            &copy; 2019 All Rights Reserved By
            <a href="https://html.design/">Super Services</a>
          </p>
        </div>
      </div>
    </div>
  </footer>
  <!-- footer section -->


  <script src="./resources/js/jquery-3.4.1.min.js"></script>
  <script src="./resources/js/bootstrap.js"></script>

</body>

</html>