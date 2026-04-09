.class Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb_Impl$a;
.super Lm2/s$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb_Impl;->h(Lm2/f;)Landroidx/sqlite/db/SupportSQLiteOpenHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb_Impl;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb_Impl;I)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb_Impl$a;->b:Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb_Impl;

    invoke-direct {p0, p2}, Lm2/s$b;-><init>(I)V

    return-void
.end method


# virtual methods
.method public a(Landroidx/sqlite/db/SupportSQLiteDatabase;)V
    .locals 1

    const-string v0, "CREATE TABLE IF NOT EXISTS `config` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `cloudToken` TEXT NOT NULL, `cloudSecret` TEXT NOT NULL, `key` TEXT NOT NULL)"

    invoke-interface {p1, v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "CREATE UNIQUE INDEX IF NOT EXISTS `index_config_key` ON `config` (`key`)"

    invoke-interface {p1, v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    invoke-interface {p1, v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'bf22e5909a49844be9494808d3d1a0f8\')"

    invoke-interface {p1, v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return-void
.end method

.method public b(Landroidx/sqlite/db/SupportSQLiteDatabase;)V
    .locals 1

    const-string v0, "DROP TABLE IF EXISTS `config`"

    invoke-interface {p1, v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb_Impl$a;->b:Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb_Impl;

    invoke-static {p1}, Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb_Impl;->D(Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb_Impl;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lf/d;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public c(Landroidx/sqlite/db/SupportSQLiteDatabase;)V
    .locals 1

    iget-object p1, p0, Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb_Impl$a;->b:Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb_Impl;

    invoke-static {p1}, Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb_Impl;->E(Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb_Impl;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lf/d;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public d(Landroidx/sqlite/db/SupportSQLiteDatabase;)V
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb_Impl$a;->b:Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb_Impl;

    invoke-static {v0, p1}, Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb_Impl;->F(Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb_Impl;Landroidx/sqlite/db/SupportSQLiteDatabase;)Landroidx/sqlite/db/SupportSQLiteDatabase;

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb_Impl$a;->b:Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb_Impl;

    invoke-static {v0, p1}, Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb_Impl;->G(Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb_Impl;Landroidx/sqlite/db/SupportSQLiteDatabase;)V

    iget-object p1, p0, Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb_Impl$a;->b:Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb_Impl;

    invoke-static {p1}, Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb_Impl;->H(Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb_Impl;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lf/d;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public e(Landroidx/sqlite/db/SupportSQLiteDatabase;)V
    .locals 0

    return-void
.end method

.method public f(Landroidx/sqlite/db/SupportSQLiteDatabase;)V
    .locals 0

    invoke-static {p1}, Lp2/b;->a(Landroidx/sqlite/db/SupportSQLiteDatabase;)V

    return-void
.end method

.method public g(Landroidx/sqlite/db/SupportSQLiteDatabase;)Lm2/s$c;
    .locals 10

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v1, Lp2/f$a;

    const/4 v7, 0x0

    const/4 v8, 0x1

    const-string v3, "id"

    const-string v4, "INTEGER"

    const/4 v5, 0x1

    const/4 v6, 0x1

    move-object v2, v1

    invoke-direct/range {v2 .. v8}, Lp2/f$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "id"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lp2/f$a;

    const/4 v8, 0x0

    const/4 v9, 0x1

    const-string v4, "cloudToken"

    const-string v5, "TEXT"

    const/4 v7, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, Lp2/f$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "cloudToken"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lp2/f$a;

    const-string v4, "cloudSecret"

    const-string v5, "TEXT"

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, Lp2/f$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "cloudSecret"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lp2/f$a;

    const-string v4, "key"

    const-string v5, "TEXT"

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, Lp2/f$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "key"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ljava/util/HashSet;

    const/4 v3, 0x0

    invoke-direct {v1, v3}, Ljava/util/HashSet;-><init>(I)V

    new-instance v4, Ljava/util/HashSet;

    const/4 v5, 0x1

    invoke-direct {v4, v5}, Ljava/util/HashSet;-><init>(I)V

    new-instance v6, Lp2/f$e;

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v7, "ASC"

    filled-new-array {v7}, [Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    const-string v8, "index_config_key"

    invoke-direct {v6, v8, v5, v2, v7}, Lp2/f$e;-><init>(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V

    invoke-virtual {v4, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v2, Lp2/f;

    const-string v6, "config"

    invoke-direct {v2, v6, v0, v1, v4}, Lp2/f;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    invoke-static {p1, v6}, Lp2/f;->a(Landroidx/sqlite/db/SupportSQLiteDatabase;Ljava/lang/String;)Lp2/f;

    move-result-object p1

    invoke-virtual {v2, p1}, Lp2/f;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lm2/s$c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "config(com.ui.wifiman.model.teleport.tunnel.config.RoomTeleportConfig).\n Expected:\n"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\n Found:\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v3, p1}, Lm2/s$c;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_0
    new-instance p1, Lm2/s$c;

    const/4 v0, 0x0

    invoke-direct {p1, v5, v0}, Lm2/s$c;-><init>(ZLjava/lang/String;)V

    return-object p1
.end method
