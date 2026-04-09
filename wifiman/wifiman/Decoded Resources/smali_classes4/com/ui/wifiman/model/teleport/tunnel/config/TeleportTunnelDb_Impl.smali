.class public final Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb_Impl;
.super Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb;
.source "SourceFile"


# instance fields
.field private volatile q:LJd/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb;-><init>()V

    return-void
.end method

.method static synthetic D(Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lm2/q;->h:Ljava/util/List;

    return-object p0
.end method

.method static synthetic E(Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lm2/q;->h:Ljava/util/List;

    return-object p0
.end method

.method static synthetic F(Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb_Impl;Landroidx/sqlite/db/SupportSQLiteDatabase;)Landroidx/sqlite/db/SupportSQLiteDatabase;
    .locals 0

    iput-object p1, p0, Lm2/q;->a:Landroidx/sqlite/db/SupportSQLiteDatabase;

    return-object p1
.end method

.method static synthetic G(Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb_Impl;Landroidx/sqlite/db/SupportSQLiteDatabase;)V
    .locals 0

    invoke-virtual {p0, p1}, Lm2/q;->v(Landroidx/sqlite/db/SupportSQLiteDatabase;)V

    return-void
.end method

.method static synthetic H(Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lm2/q;->h:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public C()LJd/b;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb_Impl;->q:LJd/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb_Impl;->q:LJd/b;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb_Impl;->q:LJd/b;

    if-nez v0, :cond_1

    new-instance v0, LJd/c;

    invoke-direct {v0, p0}, LJd/c;-><init>(Lm2/q;)V

    iput-object v0, p0, Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb_Impl;->q:LJd/b;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb_Impl;->q:LJd/b;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected g()Landroidx/room/c;
    .locals 4

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v1, Landroidx/room/c;

    const-string v3, "config"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, p0, v0, v2, v3}, Landroidx/room/c;-><init>(Lm2/q;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V

    return-object v1
.end method

.method protected h(Lm2/f;)Landroidx/sqlite/db/SupportSQLiteOpenHelper;
    .locals 4

    new-instance v0, Lm2/s;

    new-instance v1, Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb_Impl$a;

    const/16 v2, 0x8

    invoke-direct {v1, p0, v2}, Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb_Impl$a;-><init>(Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb_Impl;I)V

    const-string v2, "bf22e5909a49844be9494808d3d1a0f8"

    const-string v3, "5c858480781e1a786617377d3b2274ee"

    invoke-direct {v0, p1, v1, v2, v3}, Lm2/s;-><init>(Lm2/f;Lm2/s$b;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p1, Lm2/f;->a:Landroid/content/Context;

    invoke-static {v1}, Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;->a(Landroid/content/Context;)Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$a;

    move-result-object v1

    iget-object v2, p1, Lm2/f;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$a;->c(Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$a;->b(Landroidx/sqlite/db/SupportSQLiteOpenHelper$a;)Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$a;->a()Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;

    move-result-object v0

    iget-object p1, p1, Lm2/f;->c:Landroidx/sqlite/db/SupportSQLiteOpenHelper$b;

    invoke-interface {p1, v0}, Landroidx/sqlite/db/SupportSQLiteOpenHelper$b;->create(Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;)Landroidx/sqlite/db/SupportSQLiteOpenHelper;

    move-result-object p1

    return-object p1
.end method

.method public j(Ljava/util/Map;)Ljava/util/List;
    .locals 0

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1
.end method

.method public o()Ljava/util/Set;
    .locals 1

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    return-object v0
.end method

.method protected p()Ljava/util/Map;
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-class v1, LJd/b;

    invoke-static {}, LJd/c;->e()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
