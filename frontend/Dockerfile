# Use the official Node.js image as the base image
FROM node:14-alpine
# Set the working directory inside the container
WORKDIR /usr/src/app
# Copy package.json and package-lock.json to the working directory
COPY package*.json ./
# Install dependencies
RUN npm install
COPY . .
# Build the Next.js application
RUN npm run build
# Expose the port that your Next.js app will run on
EXPOSE 3000
# Set the environment variable for production
ENV NODE_ENV=production
# Command to run the application
CMD ["npm", "start"]
