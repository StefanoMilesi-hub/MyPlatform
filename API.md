# REST API

The backend exposes JSON CRUD endpoints for all Oracle tables. Use the Firebase record key as `firebaseKey` when creating a record.

| Table | Endpoint |
|---|---|
| Assets | `/api/assets` |
| Documents | `/api/documents` |
| Items | `/api/items` |
| Joined roles | `/api/joined-roles` |
| Payroll | `/api/payroll` |
| Roles | `/api/roles` |
| Stats | `/api/stats` |
| Users | `/api/users` |
| Videos | `/api/videos` |

Each endpoint supports `GET /{endpoint}`, `GET /{endpoint}/{id}`, `POST /{endpoint}`, `PUT /{endpoint}/{id}`, and `DELETE /{endpoint}/{id}`. A missing resource returns `404`; duplicate create requests return `409`. `PUT` replaces the record and uses the ID from the URL.

Example:

```javascript
import axios from "axios";

const api = axios.create({ baseURL: "http://localhost:8080/api" });

const { data: assets } = await api.get("/assets");
const { data: asset } = await api.get("/assets/A0001");
await api.post("/assets", { firebaseKey: "new-asset", assetId: "A0005" });
await api.put("/assets/new-asset", { assetId: "A0005", status: "Available" });
await api.delete("/assets/new-asset");
```

By default, CORS allows `http://localhost:4200` and `http://localhost:3000`. Set `CORS_ALLOWED_ORIGINS` to customize this list. Database connection settings can be overridden with `DB_URL`, `DB_USERNAME`, and `DB_PASSWORD`.

The endpoints currently have no authentication; add authentication and authorization before exposing them outside a trusted development environment. The user token can be written but is omitted from API responses.
