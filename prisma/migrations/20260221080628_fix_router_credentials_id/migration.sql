-- RedefineTables
PRAGMA defer_foreign_keys=ON;
PRAGMA foreign_keys=OFF;
CREATE TABLE "new_router_credentials" (
    "id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
    "routerIP" TEXT NOT NULL,
    "username" TEXT NOT NULL,
    "password" TEXT NOT NULL,
    "updatedAt" DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP
);
INSERT INTO "new_router_credentials" ("id", "password", "routerIP", "updatedAt", "username") SELECT "id", "password", "routerIP", "updatedAt", "username" FROM "router_credentials";
DROP TABLE "router_credentials";
ALTER TABLE "new_router_credentials" RENAME TO "router_credentials";
PRAGMA foreign_keys=ON;
PRAGMA defer_foreign_keys=OFF;
