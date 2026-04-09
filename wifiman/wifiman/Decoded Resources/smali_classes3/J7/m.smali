.class public final LJ7/m;
.super LJ7/n;
.source "SourceFile"

# interfaces
.implements Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ7/m$a;
    }
.end annotation


# static fields
.field public static final j:LJ7/m$a;


# instance fields
.field private final h:Ljava/lang/String;

.field private final i:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LJ7/m$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LJ7/m$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LJ7/m;->j:LJ7/m$a;

    return-void
.end method

.method public constructor <init>(Lokhttp3/OkHttpClient;Ljava/lang/String;Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;)V
    .locals 1

    const-string/jumbo v0, "sharedOkhttpClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "url"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "clientName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "token"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2}, LJ7/n;-><init>(Lokhttp3/OkHttpClient;Ljava/lang/String;)V

    .line 4
    iput-object p3, p0, LJ7/m;->h:Ljava/lang/String;

    .line 5
    iput-object p4, p0, LJ7/m;->i:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;

    return-void
.end method

.method public synthetic constructor <init>(Lokhttp3/OkHttpClient;Ljava/lang/String;Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    .line 1
    sget-object p2, LI7/g;->a:LI7/g;

    invoke-virtual {p2}, LI7/g;->b()Ljava/lang/String;

    move-result-object p2

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, LJ7/m;-><init>(Lokhttp3/OkHttpClient;Ljava/lang/String;Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;)V

    return-void
.end method

.method public static synthetic A(Lmh/l;Ljava/lang/Object;)Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;
    .locals 0

    invoke-static {p0, p1}, LJ7/m;->J(Lmh/l;Ljava/lang/Object;)Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lmh/l;Ljava/lang/Object;)Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;
    .locals 0

    invoke-static {p0, p1}, LJ7/m;->L(Lmh/l;Ljava/lang/Object;)Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic C(LJ7/m;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;)Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$d;
    .locals 0

    invoke-direct {p0, p1}, LJ7/m;->E(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;)Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$d;

    move-result-object p0

    return-object p0
.end method

.method private final D(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$d;)Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;
    .locals 9

    new-instance v8, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$d;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$d;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$d;->c()Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    return-object v8
.end method

.method private final E(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;)Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$d;
    .locals 5

    new-instance v0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$d;

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;->c()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;->d()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, v4, p1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_0
    new-instance p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;

    const-string/jumbo v0, "missing peer description"

    invoke-direct {p1, v0, v3, v2, v3}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :cond_1
    new-instance p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;

    const-string/jumbo v0, "missing encryption key"

    invoke-direct {p1, v0, v3, v2, v3}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1
.end method

.method private static final F(Lmh/l;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final G(Lmh/l;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final H(Lmh/l;Ljava/lang/Object;)Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;

    return-object p0
.end method

.method private static final I(Lmh/l;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final J(Lmh/l;Ljava/lang/Object;)Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;

    return-object p0
.end method

.method private static final K(Lmh/l;Ljava/lang/Object;)Lgg/D;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/D;

    return-object p0
.end method

.method private static final L(Lmh/l;Ljava/lang/Object;)Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;

    return-object p0
.end method

.method private static final M(Lmh/l;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final N(Lmh/l;Ljava/lang/Object;)Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseIce;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseIce;

    return-object p0
.end method

.method private static final O(Lmh/l;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final P(Lmh/l;Ljava/lang/Object;)Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$g;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$g;

    return-object p0
.end method

.method private static final Q(Lmh/l;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic q(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LJ7/m;->F(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic r(Lmh/l;Ljava/lang/Object;)Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseIce;
    .locals 0

    invoke-static {p0, p1}, LJ7/m;->N(Lmh/l;Ljava/lang/Object;)Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseIce;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LJ7/m;->Q(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic t(Lmh/l;Ljava/lang/Object;)Lgg/D;
    .locals 0

    invoke-static {p0, p1}, LJ7/m;->K(Lmh/l;Ljava/lang/Object;)Lgg/D;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Lmh/l;Ljava/lang/Object;)Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$g;
    .locals 0

    invoke-static {p0, p1}, LJ7/m;->P(Lmh/l;Ljava/lang/Object;)Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LJ7/m;->G(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic w(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LJ7/m;->I(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic x(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LJ7/m;->O(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic y(Lmh/l;Ljava/lang/Object;)Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;
    .locals 0

    invoke-static {p0, p1}, LJ7/m;->H(Lmh/l;Ljava/lang/Object;)Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LJ7/m;->M(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$d;)Lgg/z;
    .locals 5

    const-string/jumbo v0, "peerInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequest;

    invoke-virtual {p0}, LJ7/m;->f()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;->b()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadConnection;

    iget-object v3, p0, LJ7/m;->h:Ljava/lang/String;

    invoke-direct {p0, p1}, LJ7/m;->D(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$d;)Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;

    move-result-object p1

    invoke-virtual {p0}, LJ7/m;->f()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;

    move-result-object v4

    invoke-virtual {v4}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;->a()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, p1, v4}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadConnection;-><init>(Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequest;-><init>(Ljava/lang/String;LK7/b;)V

    new-instance p1, Lkotlin/jvm/internal/N;

    invoke-direct {p1}, Lkotlin/jvm/internal/N;-><init>()V

    invoke-static {p0}, LJ7/n;->g(LJ7/n;)LK7/a;

    move-result-object v1

    invoke-interface {v1, v0}, LK7/a;->c(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequest;)Lgg/z;

    move-result-object v1

    new-instance v2, LJ7/o;

    invoke-direct {v2, p0}, LJ7/o;-><init>(LJ7/n;)V

    new-instance v3, LJ7/n$e;

    invoke-direct {v3, v2}, LJ7/n$e;-><init>(Lmh/l;)V

    invoke-virtual {v1, v3}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v1

    new-instance v2, LJ7/p;

    invoke-direct {v2, p0}, LJ7/p;-><init>(LJ7/n;)V

    new-instance v3, LJ7/n$d;

    invoke-direct {v3, v2}, LJ7/n$d;-><init>(Lmh/l;)V

    invoke-virtual {v1, v3}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object v1

    sget-object v2, LJ7/q;->a:LJ7/q;

    new-instance v3, LJ7/n$e;

    invoke-direct {v3, v2}, LJ7/n$e;-><init>(Lmh/l;)V

    invoke-virtual {v1, v3}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v1

    new-instance v2, LJ7/m$b;

    const-wide/16 v3, 0xc8

    invoke-direct {v2, p0, p1, v3, v4}, LJ7/m$b;-><init>(LJ7/n;Lkotlin/jvm/internal/N;J)V

    new-instance v3, LJ7/n$e;

    invoke-direct {v3, v2}, LJ7/n$e;-><init>(Lmh/l;)V

    invoke-virtual {v1, v3}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object v1

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x4e20

    invoke-virtual {v1, v3, v4, v2}, Lgg/z;->Q(JLjava/util/concurrent/TimeUnit;)Lgg/z;

    move-result-object v1

    new-instance v2, LJ7/m$c;

    invoke-direct {v2, p1, v0}, LJ7/m$c;-><init>(Lkotlin/jvm/internal/N;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequest;)V

    new-instance p1, LJ7/n$e;

    invoke-direct {p1, v2}, LJ7/n$e;-><init>(Lmh/l;)V

    invoke-virtual {v1, p1}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "protected inline fun <re\u2026On(Schedulers.io())\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LJ7/m$d;

    invoke-direct {v0, p0}, LJ7/m$d;-><init>(LJ7/m;)V

    new-instance v1, LJ7/f;

    invoke-direct {v1, v0}, LJ7/f;-><init>(Lmh/l;)V

    invoke-virtual {p1, v1}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object p1

    sget-object v0, LJ7/m$e;->a:LJ7/m$e;

    new-instance v1, LJ7/g;

    invoke-direct {v1, v0}, LJ7/g;-><init>(Lmh/l;)V

    invoke-virtual {p1, v1}, Lgg/z;->n(Lkg/f;)Lgg/z;

    move-result-object p1

    new-instance v0, LJ7/m$f;

    invoke-direct {v0, p0}, LJ7/m$f;-><init>(LJ7/m;)V

    new-instance v1, LJ7/h;

    invoke-direct {v1, v0}, LJ7/h;-><init>(Lmh/l;)V

    invoke-virtual {p1, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    sget-object v0, LJ7/m$g;->a:LJ7/m$g;

    new-instance v1, LJ7/i;

    invoke-direct {v1, v0}, LJ7/i;-><init>(Lmh/l;)V

    invoke-virtual {p1, v1}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "override fun getConnecti\u2026SUCCESS: ${it}\" } }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public c()Lgg/z;
    .locals 3

    invoke-virtual {p0}, LJ7/n;->j()LK7/a;

    move-result-object v0

    invoke-virtual {p0}, LJ7/m;->f()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, LK7/a;->b(Ljava/lang/String;)Lgg/z;

    move-result-object v0

    new-instance v1, LJ7/m$h;

    invoke-direct {v1, p0}, LJ7/m$h;-><init>(LJ7/m;)V

    new-instance v2, LJ7/a;

    invoke-direct {v2, v1}, LJ7/a;-><init>(Lmh/l;)V

    invoke-virtual {v0, v2}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v0

    sget-object v1, LJ7/m$i;->a:LJ7/m$i;

    new-instance v2, LJ7/d;

    invoke-direct {v2, v1}, LJ7/d;-><init>(Lmh/l;)V

    invoke-virtual {v0, v2}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v0

    sget-object v1, LJ7/m$j;->a:LJ7/m$j;

    new-instance v2, LJ7/e;

    invoke-direct {v2, v1}, LJ7/e;-><init>(Lmh/l;)V

    invoke-virtual {v0, v2}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object v0

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object v0

    const-string/jumbo v1, "override fun getEndpoint\u2026On(Schedulers.io())\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public d()Lgg/z;
    .locals 6

    new-instance v0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequest;

    invoke-virtual {p0}, LJ7/m;->f()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;->b()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadIce;

    invoke-virtual {p0}, LJ7/m;->f()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadIce;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequest;-><init>(Ljava/lang/String;LK7/b;)V

    new-instance v1, Lkotlin/jvm/internal/N;

    invoke-direct {v1}, Lkotlin/jvm/internal/N;-><init>()V

    invoke-static {p0}, LJ7/n;->g(LJ7/n;)LK7/a;

    move-result-object v2

    invoke-interface {v2, v0}, LK7/a;->c(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequest;)Lgg/z;

    move-result-object v2

    new-instance v3, LJ7/o;

    invoke-direct {v3, p0}, LJ7/o;-><init>(LJ7/n;)V

    new-instance v4, LJ7/n$e;

    invoke-direct {v4, v3}, LJ7/n$e;-><init>(Lmh/l;)V

    invoke-virtual {v2, v4}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v2

    new-instance v3, LJ7/p;

    invoke-direct {v3, p0}, LJ7/p;-><init>(LJ7/n;)V

    new-instance v4, LJ7/n$d;

    invoke-direct {v4, v3}, LJ7/n$d;-><init>(Lmh/l;)V

    invoke-virtual {v2, v4}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object v2

    sget-object v3, LJ7/q;->a:LJ7/q;

    new-instance v4, LJ7/n$e;

    invoke-direct {v4, v3}, LJ7/n$e;-><init>(Lmh/l;)V

    invoke-virtual {v2, v4}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v2

    new-instance v3, LJ7/m$k;

    const-wide/16 v4, 0xc8

    invoke-direct {v3, p0, v1, v4, v5}, LJ7/m$k;-><init>(LJ7/n;Lkotlin/jvm/internal/N;J)V

    new-instance v4, LJ7/n$e;

    invoke-direct {v4, v3}, LJ7/n$e;-><init>(Lmh/l;)V

    invoke-virtual {v2, v4}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object v2

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x4e20

    invoke-virtual {v2, v4, v5, v3}, Lgg/z;->Q(JLjava/util/concurrent/TimeUnit;)Lgg/z;

    move-result-object v2

    new-instance v3, LJ7/m$l;

    invoke-direct {v3, v1, v0}, LJ7/m$l;-><init>(Lkotlin/jvm/internal/N;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequest;)V

    new-instance v0, LJ7/n$e;

    invoke-direct {v0, v3}, LJ7/n$e;-><init>(Lmh/l;)V

    invoke-virtual {v2, v0}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object v0

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object v0

    const-string/jumbo v1, "protected inline fun <re\u2026On(Schedulers.io())\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LJ7/m$m;

    invoke-direct {v1, p0}, LJ7/m$m;-><init>(LJ7/m;)V

    new-instance v2, LJ7/j;

    invoke-direct {v2, v1}, LJ7/j;-><init>(Lmh/l;)V

    invoke-virtual {v0, v2}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object v0

    sget-object v1, LJ7/m$n;->a:LJ7/m$n;

    new-instance v2, LJ7/k;

    invoke-direct {v2, v1}, LJ7/k;-><init>(Lmh/l;)V

    invoke-virtual {v0, v2}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v0

    sget-object v1, LJ7/m$o;->a:LJ7/m$o;

    new-instance v2, LJ7/l;

    invoke-direct {v2, v1}, LJ7/l;-><init>(Lmh/l;)V

    invoke-virtual {v0, v2}, Lgg/z;->n(Lkg/f;)Lgg/z;

    move-result-object v0

    sget-object v1, LJ7/m$p;->a:LJ7/m$p;

    new-instance v2, LJ7/b;

    invoke-direct {v2, v1}, LJ7/b;-><init>(Lmh/l;)V

    invoke-virtual {v0, v2}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v0

    sget-object v1, LJ7/m$q;->a:LJ7/m$q;

    new-instance v2, LJ7/c;

    invoke-direct {v2, v1}, LJ7/c;-><init>(Lmh/l;)V

    invoke-virtual {v0, v2}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object v0

    const-string/jumbo v1, "override fun getWebRTCIc\u2026SUCCESS: ${it}\" } }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public f()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;
    .locals 1

    iget-object v0, p0, LJ7/m;->i:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;

    return-object v0
.end method
