.class public final LJ7/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$c;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:LJ7/G;

.field private final c:Lokhttp3/OkHttpClient;


# direct methods
.method public constructor <init>(Ljava/lang/String;LJ7/G;Lokhttp3/OkHttpClient;)V
    .locals 1

    const-string/jumbo v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "clientDelegate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "sharedOkhttpClient"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LJ7/v;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, LJ7/v;->b:LJ7/G;

    .line 4
    iput-object p3, p0, LJ7/v;->c:Lokhttp3/OkHttpClient;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;LJ7/G;Lokhttp3/OkHttpClient;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_0

    .line 5
    sget-object p1, LI7/g;->a:LI7/g;

    invoke-virtual {p1}, LI7/g;->b()Ljava/lang/String;

    move-result-object p1

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, LJ7/v;-><init>(Ljava/lang/String;LJ7/G;Lokhttp3/OkHttpClient;)V

    return-void
.end method

.method public static synthetic c(Lmh/l;Ljava/lang/Object;)Lgg/D;
    .locals 0

    invoke-static {p0, p1}, LJ7/v;->g(Lmh/l;Ljava/lang/Object;)Lgg/D;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(LJ7/v;)LJ7/G;
    .locals 0

    iget-object p0, p0, LJ7/v;->b:LJ7/G;

    return-object p0
.end method

.method public static final synthetic e(LJ7/v;)Lokhttp3/OkHttpClient;
    .locals 0

    iget-object p0, p0, LJ7/v;->c:Lokhttp3/OkHttpClient;

    return-object p0
.end method

.method public static final synthetic f(LJ7/v;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LJ7/v;->a:Ljava/lang/String;

    return-object p0
.end method

.method private static final g(Lmh/l;Ljava/lang/Object;)Lgg/D;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/D;

    return-object p0
.end method


# virtual methods
.method public a()Lgg/z;
    .locals 2

    new-instance v0, LJ7/v$b;

    invoke-direct {v0, p0}, LJ7/v$b;-><init>(LJ7/v;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v0

    const-string/jumbo v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public b(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;)Lgg/z;
    .locals 2

    const-string/jumbo v0, "token"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LJ7/v;->b:LJ7/G;

    invoke-interface {v0}, LJ7/G;->f()Lgg/z;

    move-result-object v0

    new-instance v1, LJ7/v$a;

    invoke-direct {v1, p1, p0}, LJ7/v$a;-><init>(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;LJ7/v;)V

    new-instance p1, LJ7/r;

    invoke-direct {p1, v1}, LJ7/r;-><init>(Lmh/l;)V

    invoke-virtual {v0, p1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "override fun newAuthenti\u2026          }\n            }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
