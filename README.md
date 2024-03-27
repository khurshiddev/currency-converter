## currency-converter

Currency converter app helps you to convert one currency to another currency

### 🔨 Technologies used:
- Kotlin
- Coroutines
- ApiLayer
- Hilt
- Retrofit

### 🏗️ Project Structure: 

````
├── src
|    ├── data
|    |    ├── models
|    |    |     ├── ExchangeResponse
|    |    |     ├── Info
|    |    |     └── Query
|    |    └── ConvertApi
|    |
|    ├── di
|    |    └── AppModule
|    |
|    ├── main
|    |    ├── MainRepository
|    |    ├── MainRepositoryImpl
|    |    └── MainViewModel
└──  └── utils
          ├── MainActivity
          └── MyApp
