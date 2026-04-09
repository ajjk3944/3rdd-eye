.class public final LGd/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/quicksettings/a;
.implements LId/f;


# static fields
.field static final synthetic g:[Lth/l;


# instance fields
.field private final a:LYg/m;

.field private final b:LYg/m;

.field private final c:LYg/m;

.field private final d:LYg/m;

.field private final e:Lgg/i;

.field private final f:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LGd/b;

    const-string v2, "teleportAvailableService"

    const-string v3, "getTeleportAvailableService()Lcom/ui/wifiman/model/teleport/TeleportAvailableService;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string v3, "tunnelAvailableService"

    const-string v5, "getTunnelAvailableService()Lcom/ui/wifiman/model/teleport/tunnel/TunnelAvailableService;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/F;

    const-string v5, "teleportConnector"

    const-string v6, "getTeleportConnector()Lcom/ui/wifiman/model/teleport/TeleportConnection;"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v3

    new-instance v5, Lkotlin/jvm/internal/F;

    const-string v6, "settingsManager"

    const-string v7, "getSettingsManager()Lcom/ui/wifiman/model/settings/AppSettingsManager;"

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

    sput-object v5, LGd/b;->g:[Lth/l;

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 8

    const-string v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, LGd/b$d;

    invoke-direct {v1}, LGd/b$d;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, LFd/s;

    invoke-direct {v0, v1, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    sget-object v3, LGd/b;->g:[Lth/l;

    const/4 v4, 0x0

    aget-object v5, v3, v4

    invoke-interface {v0, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LGd/b;->a:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v5, LGd/b$e;

    invoke-direct {v5}, LGd/b$e;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, LId/h;

    invoke-direct {v0, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p1, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v5, 0x1

    aget-object v6, v3, v5

    invoke-interface {v0, p0, v6}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LGd/b;->b:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v6, LGd/b$f;

    invoke-direct {v6}, LGd/b$f;-><init>()V

    invoke-virtual {v6}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v6

    invoke-static {v6}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v7, Lcom/ui/wifiman/model/teleport/TeleportConnection;

    invoke-direct {v0, v6, v7}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p1, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v6, 0x2

    aget-object v6, v3, v6

    invoke-interface {v0, p0, v6}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LGd/b;->c:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v6, LGd/b$g;

    invoke-direct {v6}, LGd/b$g;-><init>()V

    invoke-virtual {v6}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v6

    invoke-static {v6}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Lmd/b;

    invoke-direct {v0, v6, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p1, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v0, 0x3

    aget-object v0, v3, v0

    invoke-interface {p1, p0, v0}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LGd/b;->d:LYg/m;

    sget-object p1, LAg/c;->a:LAg/c;

    invoke-direct {p0}, LGd/b;->j()Lcom/ui/wifiman/model/teleport/TeleportConnection;

    move-result-object v0

    invoke-interface {v0}, Lcom/ui/wifiman/model/teleport/TeleportConnection;->getState()Lgg/i;

    move-result-object v0

    invoke-direct {p0}, LGd/b;->i()LFd/s;

    move-result-object v1

    invoke-interface {v1}, LFd/s;->getState()Lgg/i;

    move-result-object v1

    invoke-direct {p0}, LGd/b;->k()LId/h;

    move-result-object v2

    invoke-interface {v2}, LId/h;->getState()Lgg/i;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, LAg/c;->b(Lgg/i;Lgg/i;Lgg/i;)Lgg/i;

    move-result-object p1

    new-instance v0, LGd/b$h;

    invoke-direct {v0, p0}, LGd/b$h;-><init>(LGd/b;)V

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0, v4, v5}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const-string v0, "distinctUntilChanged(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LGd/b;->e:Lgg/i;

    invoke-direct {p0}, LGd/b;->h()Lmd/b;

    move-result-object p1

    invoke-interface {p1}, Lee/c;->b()Lgg/i;

    move-result-object p1

    sget-object v1, LGd/b$a;->a:LGd/b$a;

    invoke-virtual {p1, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LGd/b;->f:Lgg/i;

    return-void
.end method

.method public static synthetic d(ZLmd/a;)Lmd/a;
    .locals 0

    invoke-static {p0, p1}, LGd/b;->n(ZLmd/a;)Lmd/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(LGd/b;)Lcom/ui/wifiman/model/teleport/TeleportConnection;
    .locals 0

    invoke-direct {p0}, LGd/b;->j()Lcom/ui/wifiman/model/teleport/TeleportConnection;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(LGd/b;LFd/s$a;LId/h$a;)I
    .locals 0

    invoke-direct {p0, p1, p2}, LGd/b;->l(LFd/s$a;LId/h$a;)I

    move-result p0

    return p0
.end method

.method public static final synthetic g(LGd/b;Lcom/ui/wifiman/model/teleport/TeleportConnection$a;)Lcom/ui/wifiman/quicksettings/a$a;
    .locals 0

    invoke-direct {p0, p1}, LGd/b;->m(Lcom/ui/wifiman/model/teleport/TeleportConnection$a;)Lcom/ui/wifiman/quicksettings/a$a;

    move-result-object p0

    return-object p0
.end method

.method private final h()Lmd/b;
    .locals 1

    iget-object v0, p0, LGd/b;->d:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmd/b;

    return-object v0
.end method

.method private final i()LFd/s;
    .locals 1

    iget-object v0, p0, LGd/b;->a:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFd/s;

    return-object v0
.end method

.method private final j()Lcom/ui/wifiman/model/teleport/TeleportConnection;
    .locals 1

    iget-object v0, p0, LGd/b;->c:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/teleport/TeleportConnection;

    return-object v0
.end method

.method private final k()LId/h;
    .locals 1

    iget-object v0, p0, LGd/b;->b:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LId/h;

    return-object v0
.end method

.method private final l(LFd/s$a;LId/h$a;)I
    .locals 0

    sget p1, Ljc/d;->k:I

    return p1
.end method

.method private final m(Lcom/ui/wifiman/model/teleport/TeleportConnection$a;)Lcom/ui/wifiman/quicksettings/a$a;
    .locals 1

    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$a;

    if-eqz v0, :cond_0

    sget-object p1, Lcom/ui/wifiman/quicksettings/a$a$c;->a:Lcom/ui/wifiman/quicksettings/a$a$c;

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$a;

    if-eqz v0, :cond_1

    sget-object p1, Lcom/ui/wifiman/quicksettings/a$a$a;->a:Lcom/ui/wifiman/quicksettings/a$a$a;

    goto :goto_1

    :cond_1
    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$a;

    if-nez v0, :cond_3

    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$b;

    if-nez v0, :cond_3

    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$c;

    if-nez v0, :cond_3

    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$d;

    if-nez v0, :cond_3

    instance-of p1, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$e;

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    :goto_0
    sget-object p1, Lcom/ui/wifiman/quicksettings/a$a$b$a;->a:Lcom/ui/wifiman/quicksettings/a$a$b$a;

    :goto_1
    return-object p1
.end method

.method private static final n(ZLmd/a;)Lmd/a;
    .locals 11

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x3f

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p1

    move v8, p0

    invoke-static/range {v1 .. v10}, Lmd/a;->b(Lmd/a;LT7/b;LT7/c;ZZZZZILjava/lang/Object;)Lmd/a;

    move-result-object p0

    return-object p0
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

.method public a(Landroid/content/Context;)Lgg/b;
    .locals 1

    const-string v0, "ctx"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LGd/b;->j()Lcom/ui/wifiman/model/teleport/TeleportConnection;

    move-result-object p1

    invoke-interface {p1}, Lcom/ui/wifiman/model/teleport/TeleportConnection;->getState()Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->o0()Lgg/z;

    move-result-object p1

    sget-object v0, LGd/b$b;->a:LGd/b$b;

    invoke-virtual {p1, v0}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    new-instance v0, LGd/b$c;

    invoke-direct {v0, p0}, LGd/b$c;-><init>(LGd/b;)V

    invoke-virtual {p1, v0}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string v0, "flatMapCompletable(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, LGd/b;->f:Lgg/i;

    return-object v0
.end method

.method public c(Z)Lgg/b;
    .locals 2

    invoke-direct {p0}, LGd/b;->h()Lmd/b;

    move-result-object v0

    new-instance v1, LGd/a;

    invoke-direct {v1, p1}, LGd/a;-><init>(Z)V

    invoke-interface {v0, v1}, Lee/c;->a(Lmh/l;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public getState()Lgg/i;
    .locals 1

    iget-object v0, p0, LGd/b;->e:Lgg/i;

    return-object v0
.end method

.method public t(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;)LId/c;
    .locals 0

    invoke-static {p0, p1}, LId/f$a;->b(LId/f;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;)LId/c;

    move-result-object p1

    return-object p1
.end method
