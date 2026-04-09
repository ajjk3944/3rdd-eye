.class public final LG8/g;
.super Lof/a$c;
.source "SourceFile"


# static fields
.field static final synthetic r:[Lth/l;

.field public static final s:I


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:Ls9/c$a;

.field private final j:LYg/m;

.field private final k:Lye/b$a;

.field private final l:Lye/b$a;

.field private final m:Lye/b$a;

.field private final n:LLi/N;

.field private final o:LLi/N;

.field private final p:LLi/N;

.field private final q:LLi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LG8/g;

    const-string/jumbo v2, "accountManager"

    const-string/jumbo v3, "getAccountManager()Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "viewRouter"

    const-string/jumbo v5, "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/F;

    const-string/jumbo v5, "primaryAccount"

    const-string/jumbo v6, "getPrimaryAccount()Lkotlinx/coroutines/flow/Flow;"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v3

    new-instance v5, Lkotlin/jvm/internal/F;

    const-string/jumbo v6, "isPrimarySessionAuthenticated"

    const-string/jumbo v7, "isPrimarySessionAuthenticated()Lkotlinx/coroutines/flow/Flow;"

    invoke-direct {v5, v1, v6, v7, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v5}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v5

    new-instance v6, Lkotlin/jvm/internal/F;

    const-string/jumbo v7, "isAccountManagerAvailable"

    const-string/jumbo v8, "isAccountManagerAvailable()Lkotlinx/coroutines/flow/Flow;"

    invoke-direct {v6, v1, v7, v8, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v6}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/4 v6, 0x5

    new-array v6, v6, [Lth/l;

    aput-object v0, v6, v4

    const/4 v0, 0x1

    aput-object v2, v6, v0

    const/4 v0, 0x2

    aput-object v3, v6, v0

    const/4 v0, 0x3

    aput-object v5, v6, v0

    const/4 v0, 0x4

    aput-object v1, v6, v0

    sput-object v6, LG8/g;->r:[Lth/l;

    const/16 v0, 0x8

    sput v0, LG8/g;->s:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 12

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lof/a$c;-><init>()V

    iput-object p1, p0, LG8/g;->g:Lorg/kodein/di/DI;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, LG8/g$e;

    invoke-direct {v0}, LG8/g$e;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;

    invoke-direct {p1, v0, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    sget-object v2, LG8/g;->r:[Lth/l;

    const/4 v3, 0x0

    aget-object v3, v2, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LG8/g;->h:LYg/m;

    new-instance v5, Ls9/c$a;

    const p1, 0x7f0703f7

    const/4 v3, 0x2

    invoke-direct {v5, p1, v0, v3, v0}, Ls9/c$a;-><init>(ILs9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v5, p0, LG8/g;->i:Ls9/c$a;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v3, LG8/g$f;

    invoke-direct {v3}, LG8/g$f;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, Li8/a;

    invoke-direct {p1, v3, v1}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v1, 0x1

    aget-object v1, v2, v1

    invoke-interface {p1, p0, v1}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LG8/g;->j:LYg/m;

    sget-object p1, Lye/b;->a:Lye/b;

    new-instance v9, LG8/d;

    invoke-direct {v9, p0}, LG8/d;-><init>(LG8/g;)V

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v8, 0x0

    move-object v6, p1

    move-object v7, p0

    invoke-static/range {v6 .. v11}, Lye/b;->c(Lye/b;Lye/g;Landroidx/lifecycle/k$b;Lmh/a;ILjava/lang/Object;)Lye/b$a;

    move-result-object v1

    iput-object v1, p0, LG8/g;->k:Lye/b$a;

    new-instance v9, LG8/e;

    invoke-direct {v9, p0}, LG8/e;-><init>(LG8/g;)V

    invoke-static/range {v6 .. v11}, Lye/b;->c(Lye/b;Lye/g;Landroidx/lifecycle/k$b;Lmh/a;ILjava/lang/Object;)Lye/b$a;

    move-result-object v1

    iput-object v1, p0, LG8/g;->l:Lye/b$a;

    new-instance v9, LG8/f;

    invoke-direct {v9, p0}, LG8/f;-><init>(LG8/g;)V

    invoke-static/range {v6 .. v11}, Lye/b;->c(Lye/b;Lye/g;Landroidx/lifecycle/k$b;Lmh/a;ILjava/lang/Object;)Lye/b$a;

    move-result-object p1

    iput-object p1, p0, LG8/g;->m:Lye/b$a;

    invoke-direct {p0}, LG8/g;->x0()LLi/g;

    move-result-object p1

    new-instance v4, LG8/g$g;

    invoke-direct {v4, p1, p0}, LG8/g$g;-><init>(LLi/g;LG8/g;)V

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v9}, Lye/g;->c0(Lye/g;LLi/g;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, LG8/g;->n:LLi/N;

    invoke-direct {p0}, LG8/g;->x0()LLi/g;

    move-result-object p1

    invoke-direct {p0}, LG8/g;->B0()LLi/g;

    move-result-object v1

    invoke-direct {p0}, LG8/g;->z0()LLi/g;

    move-result-object v2

    new-instance v3, LG8/g$a;

    invoke-direct {v3, v0}, LG8/g$a;-><init>(Ldh/e;)V

    invoke-static {p1, v1, v2, v3}, LLi/i;->k(LLi/g;LLi/g;LLi/g;Lmh/r;)LLi/g;

    move-result-object v5

    sget-object v6, Lof/a$a;->IN_PROGRESS:Lof/a$a;

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v4, p0

    invoke-static/range {v4 .. v10}, Lye/g;->c0(Lye/g;LLi/g;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, LG8/g;->o:LLi/N;

    invoke-direct {p0}, LG8/g;->x0()LLi/g;

    move-result-object p1

    new-instance v1, LG8/g$h;

    invoke-direct {v1, p1}, LG8/g$h;-><init>(LLi/g;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lye/g;->c0(Lye/g;LLi/g;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, LG8/g;->p:LLi/N;

    invoke-direct {p0}, LG8/g;->x0()LLi/g;

    move-result-object p1

    new-instance v1, LG8/g$i;

    invoke-direct {v1, p1}, LG8/g$i;-><init>(LLi/g;)V

    invoke-static/range {v0 .. v6}, Lye/g;->c0(Lye/g;LLi/g;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, LG8/g;->q:LLi/N;

    return-void
.end method

.method private static final A0(LG8/g;)LLi/g;
    .locals 1

    invoke-direct {p0}, LG8/g;->w0()Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;

    move-result-object p0

    invoke-interface {p0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;->getState()Lgg/i;

    move-result-object p0

    sget-object v0, LG8/g$b;->a:LG8/g$b;

    invoke-virtual {p0, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p0

    invoke-virtual {p0}, Lgg/i;->W()Lgg/i;

    move-result-object p0

    const-string/jumbo v0, "distinctUntilChanged(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LPi/e;->a(LDj/a;)LLi/g;

    move-result-object p0

    return-object p0
.end method

.method private final B0()LLi/g;
    .locals 3

    iget-object v0, p0, LG8/g;->l:Lye/b$a;

    sget-object v1, LG8/g;->r:[Lth/l;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lye/b$a;->c(Ljava/lang/Object;Lth/l;)LLi/g;

    move-result-object v0

    return-object v0
.end method

.method private static final C0(LG8/g;)LLi/g;
    .locals 1

    invoke-direct {p0}, LG8/g;->w0()Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;

    move-result-object p0

    invoke-interface {p0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;->c()Lgg/i;

    move-result-object p0

    sget-object v0, LG8/g$c;->a:LG8/g$c;

    invoke-virtual {p0, v0}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p0

    invoke-virtual {p0}, Lgg/i;->W()Lgg/i;

    move-result-object p0

    const-string/jumbo v0, "distinctUntilChanged(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LPi/e;->a(LDj/a;)LLi/g;

    move-result-object p0

    return-object p0
.end method

.method private static final D0(LG8/g;)LLi/g;
    .locals 1

    invoke-direct {p0}, LG8/g;->w0()Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;

    move-result-object p0

    invoke-interface {p0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;->e()Lgg/i;

    move-result-object p0

    invoke-static {p0}, LPi/e;->a(LDj/a;)LLi/g;

    move-result-object p0

    new-instance v0, LG8/g$d;

    invoke-direct {v0, p0}, LG8/g$d;-><init>(LLi/g;)V

    return-object v0
.end method

.method public static synthetic s0(LG8/g;)LLi/g;
    .locals 0

    invoke-static {p0}, LG8/g;->A0(LG8/g;)LLi/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t0(LG8/g;)LLi/g;
    .locals 0

    invoke-static {p0}, LG8/g;->C0(LG8/g;)LLi/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u0(LG8/g;)LLi/g;
    .locals 0

    invoke-static {p0}, LG8/g;->D0(LG8/g;)LLi/g;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic v0(LG8/g;)Ls9/c$a;
    .locals 0

    iget-object p0, p0, LG8/g;->i:Ls9/c$a;

    return-object p0
.end method

.method private final w0()Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;
    .locals 1

    iget-object v0, p0, LG8/g;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;

    return-object v0
.end method

.method private final x0()LLi/g;
    .locals 3

    iget-object v0, p0, LG8/g;->k:Lye/b$a;

    sget-object v1, LG8/g;->r:[Lth/l;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lye/b$a;->c(Ljava/lang/Object;Lth/l;)LLi/g;

    move-result-object v0

    return-object v0
.end method

.method private final y0()Li8/a;
    .locals 1

    iget-object v0, p0, LG8/g;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method

.method private final z0()LLi/g;
    .locals 3

    iget-object v0, p0, LG8/g;->m:Lye/b$a;

    sget-object v1, LG8/g;->r:[Lth/l;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lye/b$a;->c(Ljava/lang/Object;Lth/l;)LLi/g;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, LG8/g;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, LG8/g;->o:LLi/N;

    return-object v0
.end method

.method public o0()LLi/N;
    .locals 1

    iget-object v0, p0, LG8/g;->n:LLi/N;

    return-object v0
.end method

.method public p0()LLi/N;
    .locals 1

    iget-object v0, p0, LG8/g;->q:LLi/N;

    return-object v0
.end method

.method public q0()LLi/N;
    .locals 1

    iget-object v0, p0, LG8/g;->p:LLi/N;

    return-object v0
.end method

.method public r0()V
    .locals 5

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LG8/g;->y0()Li8/a;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Li8/a$b;

    sget-object v3, Li8/a$b$w;->a:Li8/a$b$w;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v1, v2}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method
