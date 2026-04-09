.class public final Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "passphrase"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb;

    invoke-static {p1, v0, p2}, Lm2/p;->a(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Lm2/q$a;

    move-result-object p1

    new-instance p2, Lnet/sqlcipher/database/SupportFactory;

    invoke-virtual {p3}, Ljava/lang/String;->toCharArray()[C

    move-result-object p3

    const-string v0, "toCharArray(...)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3}, Lnet/sqlcipher/database/SQLiteDatabase;->getBytes([C)[B

    move-result-object p3

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p2, p3, v0, v1}, Lnet/sqlcipher/database/SupportFactory;-><init>([BLnet/sqlcipher/database/SQLiteDatabaseHook;Z)V

    invoke-virtual {p1, p2}, Lm2/q$a;->c(Landroidx/sqlite/db/SupportSQLiteOpenHelper$b;)Lm2/q$a;

    move-result-object p1

    sget-object p2, LJd/d;->a:LJd/d;

    invoke-virtual {p2}, LJd/d;->a()Ln2/a;

    move-result-object p3

    filled-new-array {p3}, [Ln2/a;

    move-result-object p3

    invoke-virtual {p1, p3}, Lm2/q$a;->a([Ln2/a;)Lm2/q$a;

    move-result-object p1

    invoke-virtual {p2}, LJd/d;->b()Ln2/a;

    move-result-object p3

    filled-new-array {p3}, [Ln2/a;

    move-result-object p3

    invoke-virtual {p1, p3}, Lm2/q$a;->a([Ln2/a;)Lm2/q$a;

    move-result-object p1

    invoke-virtual {p2}, LJd/d;->c()Ln2/a;

    move-result-object p3

    filled-new-array {p3}, [Ln2/a;

    move-result-object p3

    invoke-virtual {p1, p3}, Lm2/q$a;->a([Ln2/a;)Lm2/q$a;

    move-result-object p1

    invoke-virtual {p2}, LJd/d;->d()Ln2/a;

    move-result-object p3

    filled-new-array {p3}, [Ln2/a;

    move-result-object p3

    invoke-virtual {p1, p3}, Lm2/q$a;->a([Ln2/a;)Lm2/q$a;

    move-result-object p1

    invoke-virtual {p2}, LJd/d;->e()Ln2/a;

    move-result-object p3

    filled-new-array {p3}, [Ln2/a;

    move-result-object p3

    invoke-virtual {p1, p3}, Lm2/q$a;->a([Ln2/a;)Lm2/q$a;

    move-result-object p1

    invoke-virtual {p2}, LJd/d;->f()Ln2/a;

    move-result-object p3

    filled-new-array {p3}, [Ln2/a;

    move-result-object p3

    invoke-virtual {p1, p3}, Lm2/q$a;->a([Ln2/a;)Lm2/q$a;

    move-result-object p1

    invoke-virtual {p2}, LJd/d;->g()Ln2/a;

    move-result-object p2

    filled-new-array {p2}, [Ln2/a;

    move-result-object p2

    invoke-virtual {p1, p2}, Lm2/q$a;->a([Ln2/a;)Lm2/q$a;

    move-result-object p1

    invoke-virtual {p1}, Lm2/q$a;->b()Lm2/q;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/teleport/tunnel/config/TeleportTunnelDb;

    return-object p1
.end method
