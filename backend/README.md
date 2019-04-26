# Construindo imagem

docker build -t trt22-demo-backend .
docker save -o trt22-demo-backend.tar trt22-demo-backend
scp trt22-demo-backend.tar root@10.22.20.11:~

# la no servidor com docker

docker load -i trt22-demo-backend.tar
docker run -d -it --link postgres-pje -e DATABASE_URL=jdbc:postgresql://postgres-pje/trt22-demo-angular --name trt22-demo-backend -p 9090:8080 trt22-demo-backend

#levantar angular
ng serve --prod
