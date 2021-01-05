FROM node:latest as build-WebUI

WORKDIR /app
COPY package.json ./ 
RUN npm install
RUN npm install -g @angular/cli
COPY . .
RUN npm run build --prod

FROM nginx
COPY --from=build-WebUI /app/dist/WebUI /usr/share/nginx/html
EXPOSE 80
