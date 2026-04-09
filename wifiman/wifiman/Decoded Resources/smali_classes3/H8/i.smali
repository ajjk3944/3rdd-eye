.class public final LH8/i;
.super Lcom/ui/wifiman/ui/teleport/consoles/w;
.source "SourceFile"


# static fields
.field static final synthetic s:[Lth/l;

.field public static final t:I


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:LYg/m;

.field private final j:LYg/m;

.field private final k:LYg/m;

.field private final l:LYg/m;

.field private final m:Lgg/i;

.field private final n:Lgg/i;

.field private final o:Lgg/i;

.field private final p:Lgg/i;

.field private final q:LLi/N;

.field private final r:LLi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LH8/i;

    const-string/jumbo v2, "teleportConsoleService"

    const-string/jumbo v3, "getTeleportConsoleService()Lcom/ui/wifiman/model/teleport/TeleportConsoleService;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "teleportManager"

    const-string/jumbo v5, "getTeleportManager()Lcom/ui/wifiman/model/teleport/TeleportManager;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/F;

    const-string/jumbo v5, "cloudStatusService"

    const-string/jumbo v6, "getCloudStatusService()Lcom/ui/wifiman/model/ubiquiti/cloud/status/UbiquitiCloudStatus$Service;"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v3

    new-instance v5, Lkotlin/jvm/internal/F;

    const-string/jumbo v6, "networkConnection"

    const-string/jumbo v7, "getNetworkConnection()Lcom/ui/wifiman/model/network/connection/NetworkConnectionManager;"

    invoke-direct {v5, v1, v6, v7, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v5}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v5

    new-instance v6, Lkotlin/jvm/internal/F;

    const-string/jumbo v7, "viewRouter"

    const-string/jumbo v8, "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;"

    invoke-direct {v6, v1, v7, v8, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v6}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v6

    new-instance v7, Lkotlin/jvm/internal/D;

    const-string/jumbo v8, "consoleBecameAvailable"

    const-string v9, "<v#0>"

    invoke-direct {v7, v1, v8, v9, v4}, Lkotlin/jvm/internal/D;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v7}, Lkotlin/jvm/internal/O;->g(Lkotlin/jvm/internal/C;)Lth/m;

    move-result-object v1

    const/4 v7, 0x6

    new-array v7, v7, [Lth/l;

    aput-object v0, v7, v4

    const/4 v0, 0x1

    aput-object v2, v7, v0

    const/4 v0, 0x2

    aput-object v3, v7, v0

    const/4 v0, 0x3

    aput-object v5, v7, v0

    const/4 v0, 0x4

    aput-object v6, v7, v0

    const/4 v0, 0x5

    aput-object v1, v7, v0

    sput-object v7, LH8/i;->s:[Lth/l;

    const/16 v0, 0x8

    sput v0, LH8/i;->t:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 9

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/ui/wifiman/ui/teleport/consoles/w;-><init>()V

    iput-object p1, p0, LH8/i;->g:Lorg/kodein/di/DI;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, LH8/i$h;

    invoke-direct {v0}, LH8/i$h;-><init>()V

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

    sget-object v2, LH8/i;->s:[Lth/l;

    const/4 v3, 0x0

    aget-object v3, v2, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LH8/i;->h:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v3, LH8/i$i;

    invoke-direct {v3}, LH8/i$i;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, LFd/D;

    invoke-direct {p1, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v3, 0x1

    aget-object v4, v2, v3

    invoke-interface {p1, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LH8/i;->i:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v4, LH8/i$j;

    invoke-direct {v4}, LH8/i$j;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, LOd/a$a;

    invoke-direct {p1, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v4, 0x2

    aget-object v4, v2, v4

    invoke-interface {p1, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LH8/i;->j:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v4, LH8/i$k;

    invoke-direct {v4}, LH8/i$k;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, LZc/f;

    invoke-direct {p1, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v4, 0x3

    aget-object v4, v2, v4

    invoke-interface {p1, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LH8/i;->k:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v4, LH8/i$l;

    invoke-direct {v4}, LH8/i$l;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, Li8/a;

    invoke-direct {p1, v4, v1}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v0, 0x4

    aget-object v0, v2, v0

    invoke-interface {p1, p0, v0}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LH8/i;->l:LYg/m;

    sget-object p1, Lgg/a;->LATEST:Lgg/a;

    new-instance v0, LH8/i$g;

    invoke-direct {v0, p0}, LH8/i$g;-><init>(LH8/i;)V

    invoke-static {v0, p1}, Lgg/i;->N(Lgg/k;Lgg/a;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LH8/i;->m:Lgg/i;

    invoke-direct {p0}, LH8/i;->z0()LFd/C;

    move-result-object v1

    invoke-interface {v1}, LFd/C;->getAll()Lgg/i;

    move-result-object v1

    sget-object v2, LH8/i$a;->a:LH8/i$a;

    invoke-static {p1, v1, v2}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const-string/jumbo v1, "distinctUntilChanged(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, LH8/f;

    invoke-direct {v2, p0}, LH8/f;-><init>(LH8/i;)V

    invoke-static {p1, v2}, Ln9/c;->c(Lgg/i;Lmh/l;)Lgg/i;

    move-result-object p1

    invoke-static {p1}, Ll9/f;->e(Lgg/i;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LH8/i;->n:Lgg/i;

    invoke-direct {p0}, LH8/i;->y0()LZc/f;

    move-result-object v2

    invoke-interface {v2}, LZc/f;->getState()Lgg/i;

    move-result-object v2

    sget-object v4, LH8/i$e;->a:LH8/i$e;

    invoke-virtual {v2, v4}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v2

    invoke-virtual {v2}, Lgg/i;->W()Lgg/i;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, p0, LH8/i;->o:Lgg/i;

    invoke-direct {p0}, LH8/i;->x0()LOd/a$a;

    move-result-object v4

    invoke-interface {v4}, LOd/a$a;->a()Lgg/i;

    move-result-object v4

    sget-object v5, LH8/i$b;->a:LH8/i$b;

    invoke-static {p1, v4, v2, v5}, Lgg/i;->u(LDj/a;LDj/a;LDj/a;Lkg/g;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, LH8/g;

    invoke-direct {v2, p0}, LH8/g;-><init>(LH8/i;)V

    invoke-static {p1, v2}, Ln9/c;->c(Lgg/i;Lmh/l;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LH8/i;->p:Lgg/i;

    sget-object v0, LH8/i$m;->a:LH8/i$m;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Ls9/d$c;

    const-string v0, ""

    invoke-direct {v4, v0}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v8}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v2

    iput-object v2, p0, LH8/i;->q:LLi/N;

    sget-object v2, LH8/i$f;->a:LH8/i$f;

    invoke-virtual {p1, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Ls9/d$c;

    invoke-direct {v4, v0}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    move-object v2, p0

    invoke-static/range {v2 .. v8}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, LH8/i;->r:LLi/N;

    return-void
.end method

.method private final A0()LFd/D;
    .locals 1

    iget-object v0, p0, LH8/i;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFd/D;

    return-object v0
.end method

.method private final B0()Li8/a;
    .locals 1

    iget-object v0, p0, LH8/i;->l:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method

.method private final C0()V
    .locals 7

    sget-object v6, Lye/d;->a:Lye/d;

    new-instance v3, LH8/h;

    invoke-direct {v3, p0}, LH8/h;-><init>(LH8/i;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, v6

    move-object v1, p0

    invoke-static/range {v0 .. v5}, Lye/d;->c(Lye/d;Lye/g;Landroidx/lifecycle/k$b;Lmh/a;ILjava/lang/Object;)Lye/d$a;

    move-result-object v0

    invoke-static {v0}, LH8/i;->E0(Lye/d$a;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, LH8/i$c;

    invoke-direct {v1, p0}, LH8/i$c;-><init>(LH8/i;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "flatMapCompletable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, v0, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method private static final D0(LH8/i;)Lgg/i;
    .locals 1

    iget-object p0, p0, LH8/i;->p:Lgg/i;

    sget-object v0, LH8/i$d;->a:LH8/i$d;

    invoke-virtual {p0, v0}, Lgg/i;->m0(Lkg/p;)Lgg/i;

    move-result-object p0

    const-string/jumbo v0, "filter(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final E0(Lye/d$a;)Lgg/i;
    .locals 2

    sget-object v0, LH8/i;->s:[Lth/l;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lye/d$a;->c(Ljava/lang/Object;Lth/l;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p0(LH8/i;)Lgg/i;
    .locals 0

    invoke-static {p0}, LH8/i;->D0(LH8/i;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q0(LH8/i;LYg/s;)Lgg/b;
    .locals 0

    invoke-static {p0, p1}, LH8/i;->w0(LH8/i;LYg/s;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r0(LH8/i;Ll9/a;)Lgg/b;
    .locals 0

    invoke-static {p0, p1}, LH8/i;->v0(LH8/i;Ll9/a;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic s0(LH8/i;)Lcom/ui/wifiman/ui/teleport/consoles/v;
    .locals 0

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/teleport/consoles/w;->o0()Lcom/ui/wifiman/ui/teleport/consoles/v;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic t0(LH8/i;)LFd/D;
    .locals 0

    invoke-direct {p0}, LH8/i;->A0()LFd/D;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic u0(LH8/i;)Li8/a;
    .locals 0

    invoke-direct {p0}, LH8/i;->B0()Li8/a;

    move-result-object p0

    return-object p0
.end method

.method private static final v0(LH8/i;Ll9/a;)Lgg/b;
    .locals 2

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/teleport/h;

    if-nez p1, :cond_0

    invoke-direct {p0}, LH8/i;->B0()Li8/a;

    move-result-object p0

    const/4 p1, 0x1

    new-array p1, p1, [Li8/a$b;

    sget-object v0, Li8/a$b$n;->a:Li8/a$b$n;

    const/4 v1, 0x0

    aput-object v0, p1, v1

    invoke-interface {p0, p1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_0
    return-object p0
.end method

.method private static final w0(LH8/i;LYg/s;)Lgg/b;
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    const-string v2, "<destruct>"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v2

    const-string/jumbo v3, "component1(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lcom/ui/wifiman/model/teleport/h;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LId/a;

    instance-of v3, p1, LId/a$a;

    if-eqz v3, :cond_0

    invoke-direct {p0}, LH8/i;->A0()LFd/D;

    move-result-object p1

    invoke-virtual {v2}, Lcom/ui/wifiman/model/teleport/h;->j()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v2}, LFd/D;->b(Ljava/lang/String;)Lgg/b;

    move-result-object p1

    invoke-direct {p0}, LH8/i;->B0()Li8/a;

    move-result-object p0

    new-array v2, v1, [Li8/a$b;

    sget-object v3, Li8/a$b$n;->a:Li8/a$b$n;

    aput-object v3, v2, v0

    invoke-interface {p0, v2}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p0

    const/4 v2, 0x2

    new-array v2, v2, [Lgg/f;

    aput-object p1, v2, v0

    aput-object p0, v2, v1

    invoke-static {v2}, Lgg/b;->p([Lgg/f;)Lgg/b;

    move-result-object p0

    const-string/jumbo p1, "concatArray(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    instance-of p0, p1, LId/a$c;

    if-nez p0, :cond_2

    instance-of p0, p1, LId/a$b;

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    :goto_0
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p0

    const-string/jumbo p1, "complete(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    return-object p0
.end method

.method private final x0()LOd/a$a;
    .locals 1

    iget-object v0, p0, LH8/i;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LOd/a$a;

    return-object v0
.end method

.method private final y0()LZc/f;
    .locals 1

    iget-object v0, p0, LH8/i;->k:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZc/f;

    return-object v0
.end method

.method private final z0()LFd/C;
    .locals 1

    iget-object v0, p0, LH8/i;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFd/C;

    return-object v0
.end method


# virtual methods
.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, LH8/i;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public getTitle()LLi/N;
    .locals 1

    iget-object v0, p0, LH8/i;->q:LLi/N;

    return-object v0
.end method

.method public l0()V
    .locals 0

    invoke-super {p0}, Lye/g;->l0()V

    invoke-direct {p0}, LH8/i;->C0()V

    return-void
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, LH8/i;->r:LLi/N;

    return-object v0
.end method
