.class public final LId/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LId/h;
.implements LId/f;


# static fields
.field static final synthetic f:[Lth/l;


# instance fields
.field private final a:LYg/m;

.field private final b:LYg/m;

.field private final c:LYg/m;

.field private final d:LYg/m;

.field private final e:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LId/i;

    const-string v2, "networkConnection"

    const-string v3, "getNetworkConnection()Lcom/ui/wifiman/model/network/connection/NetworkConnectionManager;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string v3, "teleportConnector"

    const-string v5, "getTeleportConnector()Lcom/ui/wifiman/model/teleport/TeleportConnection;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/F;

    const-string v5, "teleportConsoles"

    const-string v6, "getTeleportConsoles()Lcom/ui/wifiman/model/teleport/TeleportConsoleService;"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v3

    new-instance v5, Lkotlin/jvm/internal/F;

    const-string v6, "cloudStatusService"

    const-string v7, "getCloudStatusService()Lcom/ui/wifiman/model/ubiquiti/cloud/status/UbiquitiCloudStatus$Service;"

    invoke-direct {v5, v1, v6, v7, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v5}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/4 v5, 0x4

    new-array v5, v5, [Lth/l;

    aput-object v0, v5, v4

    const/4 v0, 0x1

    aput-object v2, v5, v0

    const/4 v0, 0x2

    aput-object v3, v5, v0

    const/4 v0, 0x3

    aput-object v1, v5, v0

    sput-object v5, LId/i;->f:[Lth/l;

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 7

    const-string v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, LId/i$a;

    invoke-direct {v1}, LId/i$a;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, LZc/f;

    invoke-direct {v0, v1, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    sget-object v3, LId/i;->f:[Lth/l;

    const/4 v4, 0x0

    aget-object v4, v3, v4

    invoke-interface {v0, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LId/i;->a:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v4, LId/i$b;

    invoke-direct {v4}, LId/i$b;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lcom/ui/wifiman/model/teleport/TeleportConnection;

    invoke-direct {v0, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p1, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v4, 0x1

    aget-object v5, v3, v4

    invoke-interface {v0, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LId/i;->b:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v5, LId/i$c;

    invoke-direct {v5}, LId/i$c;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, LFd/C;

    invoke-direct {v0, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p1, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v5, 0x2

    aget-object v5, v3, v5

    invoke-interface {v0, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LId/i;->c:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v5, LId/i$d;

    invoke-direct {v5}, LId/i$d;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, LOd/a$a;

    invoke-direct {v0, v5, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p1, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v0, 0x3

    aget-object v0, v3, v0

    invoke-interface {p1, p0, v0}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LId/i;->d:LYg/m;

    invoke-direct {p0}, LId/i;->b()LZc/f;

    move-result-object p1

    invoke-interface {p1}, LZc/f;->getState()Lgg/i;

    move-result-object p1

    invoke-direct {p0}, LId/i;->c()Lcom/ui/wifiman/model/teleport/TeleportConnection;

    move-result-object v0

    invoke-interface {v0}, Lcom/ui/wifiman/model/teleport/TeleportConnection;->getState()Lgg/i;

    move-result-object v0

    invoke-direct {p0}, LId/i;->d()LFd/C;

    move-result-object v1

    invoke-interface {v1}, LFd/C;->a()Lgg/i;

    move-result-object v1

    invoke-direct {p0}, LId/i;->a()LOd/a$a;

    move-result-object v2

    invoke-interface {v2}, LOd/a$a;->a()Lgg/i;

    move-result-object v2

    new-instance v3, LId/i$e;

    invoke-direct {v3, p0}, LId/i$e;-><init>(LId/i;)V

    invoke-static {p1, v0, v1, v2, v3}, Lgg/i;->t(LDj/a;LDj/a;LDj/a;LDj/a;Lkg/h;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v4}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LId/i;->e:Lgg/i;

    return-void
.end method

.method private final a()LOd/a$a;
    .locals 1

    iget-object v0, p0, LId/i;->d:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LOd/a$a;

    return-object v0
.end method

.method private final b()LZc/f;
    .locals 1

    iget-object v0, p0, LId/i;->a:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZc/f;

    return-object v0
.end method

.method private final c()Lcom/ui/wifiman/model/teleport/TeleportConnection;
    .locals 1

    iget-object v0, p0, LId/i;->b:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/teleport/TeleportConnection;

    return-object v0
.end method

.method private final d()LFd/C;
    .locals 1

    iget-object v0, p0, LId/i;->c:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFd/C;

    return-object v0
.end method


# virtual methods
.method public B(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;)LId/c;
    .locals 0

    invoke-static {p0, p1}, LId/f$a;->a(LId/f;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;)LId/c;

    move-result-object p1

    return-object p1
.end method

.method public S(Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;)LId/c;
    .locals 0

    invoke-static {p0, p1}, LId/f$a;->d(LId/f;Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;)LId/c;

    move-result-object p1

    return-object p1
.end method

.method public e(Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;)LId/c;
    .locals 0

    invoke-static {p0, p1}, LId/f$a;->c(LId/f;Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;)LId/c;

    move-result-object p1

    return-object p1
.end method

.method public getState()Lgg/i;
    .locals 1

    iget-object v0, p0, LId/i;->e:Lgg/i;

    return-object v0
.end method

.method public t(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;)LId/c;
    .locals 0

    invoke-static {p0, p1}, LId/f$a;->b(LId/f;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;)LId/c;

    move-result-object p1

    return-object p1
.end method
