.class public final LJ7/F;
.super LJ7/n;
.source "SourceFile"

# interfaces
.implements Lcom/ubnt/teleport/unifi/cloud/TeleportCloud;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ7/F$a;
    }
.end annotation


# static fields
.field public static final i:LJ7/F$a;


# instance fields
.field private final h:LM7/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LJ7/F$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LJ7/F$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LJ7/F;->i:LJ7/F$a;

    return-void
.end method

.method public constructor <init>(Lokhttp3/OkHttpClient;Ljava/lang/String;)V
    .locals 1

    const-string/jumbo v0, "sharedOkhttpClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "url"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, LJ7/n;-><init>(Lokhttp3/OkHttpClient;Ljava/lang/String;)V

    new-instance p1, Lcom/ubnt/teleport/unifi/token/GoTokenSecurity;

    invoke-direct {p1}, Lcom/ubnt/teleport/unifi/token/GoTokenSecurity;-><init>()V

    iput-object p1, p0, LJ7/F;->h:LM7/b;

    return-void
.end method

.method private static final A(Lmh/l;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final B(Lmh/l;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final C(Lmh/l;Ljava/lang/Object;)Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;

    return-object p0
.end method

.method private static final D(Lmh/l;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final E(Lmh/l;Ljava/lang/Object;)Lgg/D;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/D;

    return-object p0
.end method

.method private static final F(Lmh/l;Ljava/lang/Object;)Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;

    return-object p0
.end method

.method private static final G(Lmh/l;Ljava/lang/Object;)Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;

    return-object p0
.end method

.method private static final H(Lmh/l;Ljava/lang/Object;)Lgg/D;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/D;

    return-object p0
.end method

.method private final I(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;)Lgg/z;
    .locals 1

    instance-of v0, p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, LJ7/F;->h:LM7/b;

    invoke-interface {v0, p1}, LM7/b;->a(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;)Lgg/z;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;

    if-eqz v0, :cond_1

    new-instance v0, LJ7/F$k;

    invoke-direct {v0, p1}, LJ7/F$k;-><init>(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public static synthetic q(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LJ7/F;->A(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic r(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LJ7/F;->B(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic s(Lmh/l;Ljava/lang/Object;)Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;
    .locals 0

    invoke-static {p0, p1}, LJ7/F;->F(Lmh/l;Ljava/lang/Object;)Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lmh/l;Ljava/lang/Object;)Lgg/D;
    .locals 0

    invoke-static {p0, p1}, LJ7/F;->z(Lmh/l;Ljava/lang/Object;)Lgg/D;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Lmh/l;Ljava/lang/Object;)Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;
    .locals 0

    invoke-static {p0, p1}, LJ7/F;->G(Lmh/l;Ljava/lang/Object;)Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Lmh/l;Ljava/lang/Object;)Lgg/D;
    .locals 0

    invoke-static {p0, p1}, LJ7/F;->E(Lmh/l;Ljava/lang/Object;)Lgg/D;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(Lmh/l;Ljava/lang/Object;)Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;
    .locals 0

    invoke-static {p0, p1}, LJ7/F;->C(Lmh/l;Ljava/lang/Object;)Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x(Lmh/l;Ljava/lang/Object;)Lgg/D;
    .locals 0

    invoke-static {p0, p1}, LJ7/F;->H(Lmh/l;Ljava/lang/Object;)Lgg/D;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LJ7/F;->D(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method

.method private static final z(Lmh/l;Ljava/lang/Object;)Lgg/D;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/D;

    return-object p0
.end method


# virtual methods
.method public b(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;)Lgg/z;
    .locals 2

    const-string/jumbo v0, "token"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LJ7/F;->I(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;)Lgg/z;

    move-result-object p1

    new-instance v0, LJ7/F$g;

    invoke-direct {v0, p0}, LJ7/F$g;-><init>(LJ7/F;)V

    new-instance v1, LJ7/B;

    invoke-direct {v1, v0}, LJ7/B;-><init>(Lmh/l;)V

    invoke-virtual {p1, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    new-instance v0, LJ7/F$h;

    invoke-direct {v0, p0}, LJ7/F$h;-><init>(LJ7/F;)V

    new-instance v1, LJ7/C;

    invoke-direct {v1, v0}, LJ7/C;-><init>(Lmh/l;)V

    invoke-virtual {p1, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    sget-object v0, LJ7/F$i;->a:LJ7/F$i;

    new-instance v1, LJ7/D;

    invoke-direct {v1, v0}, LJ7/D;-><init>(Lmh/l;)V

    invoke-virtual {p1, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    sget-object v0, LJ7/F$j;->a:LJ7/F$j;

    new-instance v1, LJ7/E;

    invoke-direct {v1, v0}, LJ7/E;-><init>(Lmh/l;)V

    invoke-virtual {p1, v1}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "override fun getEndpoint\u2026On(Schedulers.io())\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public e(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;Ljava/lang/String;Ljava/lang/String;)Lgg/z;
    .locals 2

    const-string/jumbo v0, "secret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "clientId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "clientName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LJ7/F;->I(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;)Lgg/z;

    move-result-object v0

    new-instance v1, LJ7/F$b;

    invoke-direct {v1, p0, p2, p3, p1}, LJ7/F$b;-><init>(LJ7/F;Ljava/lang/String;Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;)V

    new-instance p1, LJ7/w;

    invoke-direct {p1, v1}, LJ7/w;-><init>(Lmh/l;)V

    invoke-virtual {v0, p1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    new-instance p2, LJ7/F$c;

    invoke-direct {p2, p0}, LJ7/F$c;-><init>(LJ7/F;)V

    new-instance p3, LJ7/x;

    invoke-direct {p3, p2}, LJ7/x;-><init>(Lmh/l;)V

    invoke-virtual {p1, p3}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object p1

    sget-object p2, LJ7/F$d;->a:LJ7/F$d;

    new-instance p3, LJ7/y;

    invoke-direct {p3, p2}, LJ7/y;-><init>(Lmh/l;)V

    invoke-virtual {p1, p3}, Lgg/z;->n(Lkg/f;)Lgg/z;

    move-result-object p1

    sget-object p2, LJ7/F$e;->a:LJ7/F$e;

    new-instance p3, LJ7/z;

    invoke-direct {p3, p2}, LJ7/z;-><init>(Lmh/l;)V

    invoke-virtual {p1, p3}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    sget-object p2, LJ7/F$f;->a:LJ7/F$f;

    new-instance p3, LJ7/A;

    invoke-direct {p3, p2}, LJ7/A;-><init>(Lmh/l;)V

    invoke-virtual {p1, p3}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object p1

    const-string/jumbo p2, "override fun generateLon\u2026SUCCESS: ${it}\" } }\n    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
