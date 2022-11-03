Translate API Yandex
1. `Translator`:
- отправляем headers;
- получаем JSON;
- парсим JSON.

2. `YandexResponse` - соответствует получаемому JSON объекту и парсит его
3. `Translation` - размещаем ключи "text" и "detectedLanguageCode"