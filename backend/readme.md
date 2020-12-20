# backend 

> 정하정 한기연

## Spring REST API

## CURL
1. curl 통신 후 쿠키안에 있는 csrf토큰을 받아 저장한다.
   - 이 때, 통신 보내는 url에 보안인증서가 필요하다면 cacert를 추가해 보낸다.
     - curl -c cookie.txt --cacert /etc/ssl/certs/cacert.pem http://localhost.com:8000/ 

2. 이전에 저장한 cookie.txt와 JSON으로 접근에 필요한 아이디/비밀번호를 저장해서 보낸다.->응답 쿠키를 저장!!
3. 저장한 cookie.txt로 원하는 정보얻기!





참고: [https://stackoverflow.com/questions/10628275/how-to-use-curl-with-django-csrf-tokens-and-post-requests](https://stackoverflow.com/questions/10628275/how-to-use-curl-with-django-csrf-tokens-and-post-requests)

