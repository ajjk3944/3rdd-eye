.class public final LI7/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LI7/a$a;

.field private static b:LI7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LI7/a$a;

    invoke-direct {v0}, LI7/a$a;-><init>()V

    sput-object v0, LI7/a$a;->a:LI7/a$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Ljava/lang/Class;LJ7/G;Lcom/ubnt/teleport/TeleportTunnelManager$Storage;Lokhttp3/OkHttpClient;)LI7/a;
    .locals 7

    const-string/jumbo v0, "applicationContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "vpnServiceClass"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "clientDelegate"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "tunnelStorage"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "sharedOkhttpClient"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter p0

    :try_start_0
    sget-object v0, LI7/a$a;->b:LI7/a;

    if-nez v0, :cond_0

    new-instance v0, LI7/f;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, LI7/f;-><init>(Landroid/content/Context;Ljava/lang/Class;LJ7/G;Lcom/ubnt/teleport/TeleportTunnelManager$Storage;Lokhttp3/OkHttpClient;)V

    sput-object v0, LI7/a$a;->b:LI7/a;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    sget-object p1, LI7/a$a;->b:LI7/a;

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    return-object p1

    :goto_1
    monitor-exit p0

    throw p1
.end method
