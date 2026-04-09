.class public final LK8/e;
.super Lcom/ui/wifiman/ui/teleport/B;
.source "SourceFile"

# interfaces
.implements LK8/d;
.implements LId/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LK8/e$a;
    }
.end annotation


# static fields
.field public static final A:I

.field static final synthetic z:[Lth/l;


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:LYg/m;

.field private final j:LYg/m;

.field private final k:LYg/m;

.field private final l:LYg/m;

.field private final m:LYg/m;

.field private final n:LYg/m;

.field private final o:LYg/m;

.field private final p:LYg/m;

.field private final q:LFg/a;

.field private final r:Lgg/i;

.field private final s:Lgg/i;

.field private final t:Lgg/i;

.field private final u:Lgg/i;

.field private final v:Lgg/i;

.field private final w:Lgg/i;

.field private final x:LLi/N;

.field private final y:LLi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LK8/e;

    const-string/jumbo v2, "teleportConsoles"

    const-string/jumbo v3, "getTeleportConsoles()Lcom/ui/wifiman/model/teleport/TeleportConsoleService;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "accountManager"

    const-string/jumbo v5, "getAccountManager()Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/F;

    const-string/jumbo v5, "teleportConnector"

    const-string/jumbo v6, "getTeleportConnector()Lcom/ui/wifiman/model/teleport/TeleportConnection;"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v3

    new-instance v5, Lkotlin/jvm/internal/F;

    const-string/jumbo v6, "teleportStatusNotification"

    const-string/jumbo v7, "getTeleportStatusNotification()Lcom/ui/wifiman/model/teleport/TeleportConnectionStatusNotification;"

    invoke-direct {v5, v1, v6, v7, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v5}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v5

    new-instance v6, Lkotlin/jvm/internal/F;

    const-string/jumbo v7, "cloudStatusService"

    const-string/jumbo v8, "getCloudStatusService()Lcom/ui/wifiman/model/ubiquiti/cloud/status/UbiquitiCloudStatus$Service;"

    invoke-direct {v6, v1, v7, v8, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v6}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v6

    new-instance v7, Lkotlin/jvm/internal/F;

    const-string/jumbo v8, "networkConnection"

    const-string/jumbo v9, "getNetworkConnection()Lcom/ui/wifiman/model/network/connection/NetworkConnectionManager;"

    invoke-direct {v7, v1, v8, v9, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v7}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v7

    new-instance v8, Lkotlin/jvm/internal/F;

    const-string/jumbo v9, "deviceManager"

    const-string/jumbo v10, "getDeviceManager()Lcom/ui/wifiman/model/device/WifimanDeviceManager;"

    invoke-direct {v8, v1, v9, v10, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v8}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v8

    new-instance v9, Lkotlin/jvm/internal/F;

    const-string/jumbo v10, "viewRouter"

    const-string/jumbo v11, "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;"

    invoke-direct {v9, v1, v10, v11, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v9}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v9

    new-instance v10, Lkotlin/jvm/internal/F;

    const-string/jumbo v11, "teleportTunnelAvailableService"

    const-string/jumbo v12, "getTeleportTunnelAvailableService()Lcom/ui/wifiman/model/teleport/tunnel/TunnelAvailableService;"

    invoke-direct {v10, v1, v11, v12, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v10}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/16 v10, 0x9

    new-array v10, v10, [Lth/l;

    aput-object v0, v10, v4

    const/4 v0, 0x1

    aput-object v2, v10, v0

    const/4 v0, 0x2

    aput-object v3, v10, v0

    const/4 v0, 0x3

    aput-object v5, v10, v0

    const/4 v0, 0x4

    aput-object v6, v10, v0

    const/4 v0, 0x5

    aput-object v7, v10, v0

    const/4 v0, 0x6

    aput-object v8, v10, v0

    const/4 v0, 0x7

    aput-object v9, v10, v0

    const/16 v0, 0x8

    aput-object v1, v10, v0

    sput-object v10, LK8/e;->z:[Lth/l;

    sput v0, LK8/e;->A:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 13

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/ui/wifiman/ui/teleport/B;-><init>()V

    iput-object p1, p0, LK8/e;->g:Lorg/kodein/di/DI;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, LK8/e$j;

    invoke-direct {v0}, LK8/e$j;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, LFd/C;

    invoke-direct {p1, v0, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    sget-object v2, LK8/e;->z:[Lth/l;

    const/4 v3, 0x0

    aget-object v3, v2, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LK8/e;->h:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v3, LK8/e$k;

    invoke-direct {v3}, LK8/e$k;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;

    invoke-direct {p1, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v3, 0x1

    aget-object v4, v2, v3

    invoke-interface {p1, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LK8/e;->i:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v4, LK8/e$l;

    invoke-direct {v4}, LK8/e$l;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lcom/ui/wifiman/model/teleport/TeleportConnection;

    invoke-direct {p1, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v4, 0x2

    aget-object v4, v2, v4

    invoke-interface {p1, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LK8/e;->j:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v4, LK8/e$m;

    invoke-direct {v4}, LK8/e$m;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lcom/ui/wifiman/model/teleport/g;

    invoke-direct {p1, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v4, 0x3

    aget-object v4, v2, v4

    invoke-interface {p1, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LK8/e;->k:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v4, LK8/e$n;

    invoke-direct {v4}, LK8/e$n;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, LOd/a$a;

    invoke-direct {p1, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v4, 0x4

    aget-object v4, v2, v4

    invoke-interface {p1, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LK8/e;->l:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v4, LK8/e$o;

    invoke-direct {v4}, LK8/e$o;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, LZc/f;

    invoke-direct {p1, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v4, 0x5

    aget-object v4, v2, v4

    invoke-interface {p1, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LK8/e;->m:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v4, LK8/e$p;

    invoke-direct {v4}, LK8/e$p;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, LCc/n;

    invoke-direct {p1, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v4, 0x6

    aget-object v4, v2, v4

    invoke-interface {p1, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LK8/e;->n:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v4, LK8/e$q;

    invoke-direct {v4}, LK8/e$q;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Li8/a;

    invoke-direct {p1, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v4, 0x7

    aget-object v4, v2, v4

    invoke-interface {p1, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LK8/e;->o:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v4, LK8/e$r;

    invoke-direct {v4}, LK8/e$r;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, LId/h;

    invoke-direct {p1, v4, v1}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/16 v0, 0x8

    aget-object v0, v2, v0

    invoke-interface {p1, p0, v0}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LK8/e;->p:LYg/m;

    invoke-static {}, LFg/a;->j2()LFg/a;

    move-result-object p1

    const-string/jumbo v0, "create(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LK8/e;->q:LFg/a;

    invoke-direct {p0}, LK8/e;->G0()Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;

    move-result-object v0

    invoke-interface {v0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;->c()Lgg/i;

    move-result-object v0

    sget-object v1, LK8/e$e;->a:LK8/e$e;

    invoke-virtual {v0, v1}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    const-string/jumbo v1, "distinctUntilChanged(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LK8/e;->r:Lgg/i;

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p1

    invoke-direct {p0}, LK8/e;->K0()Lcom/ui/wifiman/model/teleport/TeleportConnection;

    move-result-object v0

    invoke-interface {v0}, Lcom/ui/wifiman/model/teleport/TeleportConnection;->getState()Lgg/i;

    move-result-object v0

    sget-object v2, LK8/e$u;->a:LK8/e$u;

    invoke-virtual {v0, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    new-instance v2, LK8/e$v;

    invoke-direct {v2, p0}, LK8/e$v;-><init>(LK8/e;)V

    invoke-virtual {v0, v2}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->E0()Lgg/b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/i;->U0(Lgg/f;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object v5

    const-string/jumbo p1, "refCount(...)"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v5, p0, LK8/e;->s:Lgg/i;

    invoke-direct {p0}, LK8/e;->K0()Lcom/ui/wifiman/model/teleport/TeleportConnection;

    move-result-object v0

    invoke-interface {v0}, Lcom/ui/wifiman/model/teleport/TeleportConnection;->getState()Lgg/i;

    move-result-object v0

    sget-object v2, LK8/e$w;->a:LK8/e$w;

    invoke-virtual {v0, v2}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v10

    invoke-static {v10, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v10, p0, LK8/e;->t:Lgg/i;

    invoke-direct {p0}, LK8/e;->J0()LZc/f;

    move-result-object v0

    invoke-interface {v0}, LZc/f;->getState()Lgg/i;

    move-result-object v0

    invoke-direct {p0}, LK8/e;->K0()Lcom/ui/wifiman/model/teleport/TeleportConnection;

    move-result-object v2

    invoke-interface {v2}, Lcom/ui/wifiman/model/teleport/TeleportConnection;->getState()Lgg/i;

    move-result-object v2

    invoke-direct {p0}, LK8/e;->L0()LFd/C;

    move-result-object v4

    invoke-interface {v4}, LFd/C;->a()Lgg/i;

    move-result-object v4

    invoke-direct {p0}, LK8/e;->H0()LOd/a$a;

    move-result-object v6

    invoke-interface {v6}, LOd/a$a;->a()Lgg/i;

    move-result-object v6

    new-instance v7, LK8/e$t;

    invoke-direct {v7, p0}, LK8/e$t;-><init>(LK8/e;)V

    invoke-static {v0, v2, v4, v6, v7}, Lgg/i;->t(LDj/a;LDj/a;LDj/a;LDj/a;Lkg/h;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    invoke-virtual {v0, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LK8/e;->u:Lgg/i;

    invoke-direct {p0}, LK8/e;->K0()Lcom/ui/wifiman/model/teleport/TeleportConnection;

    move-result-object p1

    invoke-interface {p1}, Lcom/ui/wifiman/model/teleport/TeleportConnection;->getState()Lgg/i;

    move-result-object p1

    new-instance v0, LK8/e$c;

    invoke-direct {v0, p0}, LK8/e$c;-><init>(LK8/e;)V

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object v8

    invoke-static {v8, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v8, p0, LK8/e;->v:Lgg/i;

    invoke-direct {p0}, LK8/e;->I0()LCc/n;

    move-result-object p1

    invoke-interface {p1}, LCc/n;->b()Lgg/i;

    move-result-object p1

    sget-object v0, LK8/e$f;->a:LK8/e$f;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object v7

    invoke-static {v7, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v7, p0, LK8/e;->w:Lgg/i;

    invoke-direct {p0}, LK8/e;->L0()LFd/C;

    move-result-object p1

    invoke-interface {p1}, LFd/C;->a()Lgg/i;

    move-result-object v6

    invoke-direct {p0}, LK8/e;->K0()Lcom/ui/wifiman/model/teleport/TeleportConnection;

    move-result-object p1

    invoke-interface {p1}, Lcom/ui/wifiman/model/teleport/TeleportConnection;->getState()Lgg/i;

    move-result-object v9

    invoke-direct {p0}, LK8/e;->M0()LId/h;

    move-result-object p1

    invoke-interface {p1}, LId/h;->getState()Lgg/i;

    move-result-object v11

    new-instance v12, LK8/e$s;

    invoke-direct {v12, p0}, LK8/e$s;-><init>(LK8/e;)V

    invoke-static/range {v6 .. v12}, Lgg/i;->r(LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;Lkg/j;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object v7

    invoke-static {v7, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v10, 0x2

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v6, p0

    invoke-static/range {v6 .. v11}, Lye/g;->h0(Lye/g;Lgg/i;Ljava/lang/Object;Landroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, LK8/e;->x:LLi/N;

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v7, 0x0

    move-object v4, p0

    invoke-static/range {v4 .. v10}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, LK8/e;->y:LLi/N;

    return-void
.end method

.method private final A0(Lcom/ui/wifiman/model/teleport/h;)Lrf/e;
    .locals 13

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/h;->s()LFd/B;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, LK8/e;->C0(LFd/B;)Lcom/ui/wifiman/ui/teleport/z;

    move-result-object v6

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/h;->j()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    move-object v2, v0

    goto :goto_3

    :cond_2
    :goto_2
    const-string/jumbo v0, "no_console"

    goto :goto_1

    :goto_3
    if-eqz p1, :cond_4

    invoke-virtual {p0, p1}, LK8/e;->E0(Lcom/ui/wifiman/model/teleport/h;)Ls9/a;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_5

    :cond_3
    :goto_4
    move-object v3, v0

    goto :goto_6

    :cond_4
    :goto_5
    new-instance v0, Ls9/b$a;

    const/4 v11, 0x6

    const/4 v12, 0x0

    const v8, 0x7f0703c3

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Ls9/b$a;-><init>(ILs9/b$b;Ls9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_4

    :goto_6
    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/h;->l()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_5

    new-instance v0, Ls9/d$c;

    invoke-direct {v0, p1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    move-object v4, v0

    goto :goto_7

    :cond_5
    new-instance p1, Ls9/d$b;

    const v0, 0x7f11030c

    invoke-direct {p1, v0}, Ls9/d$b;-><init>(I)V

    move-object v4, p1

    :goto_7
    invoke-static {v6}, Lcom/ui/wifiman/ui/teleport/C;->d(Lcom/ui/wifiman/ui/teleport/z;)Ls9/d;

    move-result-object v5

    new-instance p1, Lrf/e;

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lrf/e;-><init>(Ljava/lang/String;Ls9/a;Ls9/d;Ls9/d;Lcom/ui/wifiman/ui/teleport/z;)V

    return-object p1
.end method

.method private final B0(Lcom/ui/wifiman/model/teleport/TeleportConnection$a;)Lcom/ui/wifiman/ui/teleport/y;
    .locals 1

    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$a;

    if-eqz v0, :cond_0

    sget-object p1, Lcom/ui/wifiman/ui/teleport/y$a;->a:Lcom/ui/wifiman/ui/teleport/y$a;

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/ui/wifiman/ui/teleport/y$b;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/TeleportConnection$a;->a()F

    move-result p1

    invoke-direct {v0, p1}, Lcom/ui/wifiman/ui/teleport/y$b;-><init>(F)V

    move-object p1, v0

    goto :goto_0

    :cond_1
    instance-of p1, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$a;

    if-eqz p1, :cond_2

    sget-object p1, Lcom/ui/wifiman/ui/teleport/y$c;->a:Lcom/ui/wifiman/ui/teleport/y$c;

    :goto_0
    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final D0()Lgg/b;
    .locals 2

    invoke-direct {p0}, LK8/e;->K0()Lcom/ui/wifiman/model/teleport/TeleportConnection;

    move-result-object v0

    invoke-interface {v0}, Lcom/ui/wifiman/model/teleport/TeleportConnection;->connect()Lgg/b;

    move-result-object v0

    new-instance v1, LK8/e$b;

    invoke-direct {v1, p0}, LK8/e$b;-><init>(LK8/e;)V

    invoke-virtual {v0, v1}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "onErrorResumeNext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final F0()Lgg/b;
    .locals 2

    invoke-direct {p0}, LK8/e;->K0()Lcom/ui/wifiman/model/teleport/TeleportConnection;

    move-result-object v0

    invoke-interface {v0}, Lcom/ui/wifiman/model/teleport/TeleportConnection;->disconnect()Lgg/b;

    move-result-object v0

    sget-object v1, LK8/e$d;->a:LK8/e$d;

    invoke-virtual {v0, v1}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "onErrorResumeNext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final G0()Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;
    .locals 1

    iget-object v0, p0, LK8/e;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;

    return-object v0
.end method

.method private final H0()LOd/a$a;
    .locals 1

    iget-object v0, p0, LK8/e;->l:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LOd/a$a;

    return-object v0
.end method

.method private final I0()LCc/n;
    .locals 1

    iget-object v0, p0, LK8/e;->n:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LCc/n;

    return-object v0
.end method

.method private final J0()LZc/f;
    .locals 1

    iget-object v0, p0, LK8/e;->m:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZc/f;

    return-object v0
.end method

.method private final K0()Lcom/ui/wifiman/model/teleport/TeleportConnection;
    .locals 1

    iget-object v0, p0, LK8/e;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/teleport/TeleportConnection;

    return-object v0
.end method

.method private final L0()LFd/C;
    .locals 1

    iget-object v0, p0, LK8/e;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFd/C;

    return-object v0
.end method

.method private final M0()LId/h;
    .locals 1

    iget-object v0, p0, LK8/e;->p:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LId/h;

    return-object v0
.end method

.method private final N0()Li8/a;
    .locals 1

    iget-object v0, p0, LK8/e;->o:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method

.method public static final synthetic s0(LK8/e;LId/h$a;)Ls9/d;
    .locals 0

    invoke-direct {p0, p1}, LK8/e;->y0(LId/h$a;)Ls9/d;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic t0(LK8/e;J)Ls9/d;
    .locals 0

    invoke-direct {p0, p1, p2}, LK8/e;->z0(J)Ls9/d;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic u0(LK8/e;Lcom/ui/wifiman/model/teleport/h;)Lrf/e;
    .locals 0

    invoke-direct {p0, p1}, LK8/e;->A0(Lcom/ui/wifiman/model/teleport/h;)Lrf/e;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic v0(LK8/e;Lcom/ui/wifiman/model/teleport/TeleportConnection$a;)Lcom/ui/wifiman/ui/teleport/y;
    .locals 0

    invoke-direct {p0, p1}, LK8/e;->B0(Lcom/ui/wifiman/model/teleport/TeleportConnection$a;)Lcom/ui/wifiman/ui/teleport/y;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic w0(LK8/e;)Li8/a;
    .locals 0

    invoke-direct {p0}, LK8/e;->N0()Li8/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic x0(LK8/e;)LFg/a;
    .locals 0

    iget-object p0, p0, LK8/e;->q:LFg/a;

    return-object p0
.end method

.method private final y0(LId/h$a;)Ls9/d;
    .locals 2

    instance-of v0, p1, LId/h$a$d;

    const/4 v1, 0x0

    if-nez v0, :cond_5

    instance-of v0, p1, LId/h$a$a;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, LId/h$a$b;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    instance-of v0, p1, LId/h$a$c;

    if-eqz v0, :cond_4

    check-cast p1, LId/h$a$c;

    invoke-virtual {p1}, LId/h$a$c;->a()LId/a$c;

    move-result-object p1

    instance-of v0, p1, LId/a$c$e;

    if-nez v0, :cond_5

    instance-of v0, p1, LId/a$c$f;

    if-nez v0, :cond_5

    instance-of v0, p1, LId/a$c$c;

    if-nez v0, :cond_5

    instance-of v0, p1, LId/a$c$b;

    if-nez v0, :cond_5

    instance-of v0, p1, LId/a$c$a;

    if-nez v0, :cond_5

    instance-of v0, p1, LId/a$c$g;

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    instance-of p1, p1, LId/a$c$d;

    if-eqz p1, :cond_3

    new-instance v1, Ls9/d$b;

    const p1, 0x7f1102db

    invoke-direct {v1, p1}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    :goto_0
    return-object v1
.end method

.method private final z0(J)Ls9/d;
    .locals 3

    sget-object v0, LW7/a;->b:LW7/a$a;

    const/16 v1, 0x8

    int-to-long v1, v1

    mul-long/2addr p1, v1

    invoke-virtual {v0, p1, p2}, LW7/a$a;->b(J)LW7/a;

    move-result-object p1

    const/4 p2, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v1, p2, v0}, LL8/b;->b(LW7/a;IILjava/lang/Object;)Ls9/d;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public B(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;)LId/c;
    .locals 0

    invoke-static {p0, p1}, LId/f$a;->a(LId/f;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;)LId/c;

    move-result-object p1

    return-object p1
.end method

.method public C0(LFd/B;)Lcom/ui/wifiman/ui/teleport/z;
    .locals 0

    invoke-static {p0, p1}, LK8/d$a;->a(LK8/d;LFd/B;)Lcom/ui/wifiman/ui/teleport/z;

    move-result-object p1

    return-object p1
.end method

.method public E0(Lcom/ui/wifiman/model/teleport/h;)Ls9/a;
    .locals 0

    invoke-static {p0, p1}, LK8/d$a;->b(LK8/d;Lcom/ui/wifiman/model/teleport/h;)Ls9/a;

    move-result-object p1

    return-object p1
.end method

.method public O0(Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;)LId/c;
    .locals 0

    invoke-static {p0, p1}, LId/f$a;->c(LId/f;Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;)LId/c;

    move-result-object p1

    return-object p1
.end method

.method public S(Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;)LId/c;
    .locals 0

    invoke-static {p0, p1}, LId/f$a;->d(LId/f;Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;)LId/c;

    move-result-object p1

    return-object p1
.end method

.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, LK8/e;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, LK8/e;->x:LLi/N;

    return-object v0
.end method

.method public o0()LLi/N;
    .locals 1

    iget-object v0, p0, LK8/e;->y:LLi/N;

    return-object v0
.end method

.method public p0()V
    .locals 6

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LK8/e;->K0()Lcom/ui/wifiman/model/teleport/TeleportConnection;

    move-result-object v1

    invoke-interface {v1}, Lcom/ui/wifiman/model/teleport/TeleportConnection;->getState()Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    sget-object v2, LK8/e$g;->a:LK8/e$g;

    invoke-virtual {v1, v2}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v1

    sget-object v2, LK8/e$h;->a:LK8/e$h;

    invoke-virtual {v1, v2}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v1

    invoke-direct {p0}, LK8/e;->N0()Li8/a;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Li8/a$b;

    sget-object v4, Li8/a$b$b;->a:Li8/a$b$b;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-interface {v2, v3}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v2

    invoke-virtual {v1, v2}, Lgg/b;->g(Lgg/f;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "andThen(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public q0()V
    .locals 3

    sget-object v0, Lye/d;->a:Lye/d;

    iget-object v1, p0, LK8/e;->u:Lgg/i;

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    new-instance v2, LK8/e$i;

    invoke-direct {v2, p0}, LK8/e$i;-><init>(LK8/e;)V

    invoke-virtual {v1, v2}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "flatMapCompletable(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public r0(Z)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object p1, p0, LK8/e;->q:LFg/a;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, LFg/a;->h(Ljava/lang/Object;)V

    sget-object p1, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LK8/e;->D0()Lgg/b;

    move-result-object v0

    invoke-virtual {p1, v0, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LK8/e;->q:LFg/a;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, LFg/a;->h(Ljava/lang/Object;)V

    sget-object p1, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LK8/e;->F0()Lgg/b;

    move-result-object v0

    invoke-virtual {p1, v0, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    :goto_0
    return-void
.end method

.method public t(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;)LId/c;
    .locals 0

    invoke-static {p0, p1}, LId/f$a;->b(LId/f;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;)LId/c;

    move-result-object p1

    return-object p1
.end method
