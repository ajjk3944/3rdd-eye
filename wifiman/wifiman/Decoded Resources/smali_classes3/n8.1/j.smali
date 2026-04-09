.class public final Ln8/j;
.super LJe/c;
.source "SourceFile"


# static fields
.field static final synthetic v:[Lth/l;

.field public static final w:I


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:LYg/m;

.field private final j:LYg/m;

.field private final k:LYg/m;

.field private final l:Lgg/i;

.field private m:Ln8/e;

.field private final n:Lgg/i;

.field private final o:LLi/N;

.field private final p:LLi/N;

.field private final q:LLi/N;

.field private final r:LLi/N;

.field private final s:LLi/N;

.field private final t:Lgg/i;

.field private final u:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, Ln8/j;

    const-string/jumbo v2, "viewRouter"

    const-string/jumbo v3, "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "ssAccountService"

    const-string/jumbo v5, "getSsAccountService()Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/F;

    const-string/jumbo v5, "localConsoleService"

    const-string/jumbo v6, "getLocalConsoleService()Lcom/ui/wifiman/model/ubiquiti/console/local/UnifiLocalConsoleService;"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v3

    new-instance v5, Lkotlin/jvm/internal/F;

    const-string/jumbo v6, "unifiNetworkDeeplinkResolver"

    const-string/jumbo v7, "getUnifiNetworkDeeplinkResolver()Lcom/ui/wifiman/model/ubiquiti/unifi/network/app/UnifiNetworkDeeplinkResolver;"

    invoke-direct {v5, v1, v6, v7, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v5}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v5

    new-instance v6, Lkotlin/jvm/internal/D;

    const-string/jumbo v7, "inForegroundStream"

    const-string v8, "<v#0>"

    invoke-direct {v6, v1, v7, v8, v4}, Lkotlin/jvm/internal/D;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v6}, Lkotlin/jvm/internal/O;->g(Lkotlin/jvm/internal/C;)Lth/m;

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

    sput-object v6, Ln8/j;->v:[Lth/l;

    const/16 v0, 0x8

    sput v0, Ln8/j;->w:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 12

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LJe/c;-><init>()V

    iput-object p1, p0, Ln8/j;->g:Lorg/kodein/di/DI;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, Ln8/j$q;

    invoke-direct {v0}, Ln8/j$q;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Li8/a;

    invoke-direct {p1, v0, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    sget-object v2, Ln8/j;->v:[Lth/l;

    const/4 v3, 0x0

    aget-object v3, v2, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Ln8/j;->h:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v3, Ln8/j$r;

    invoke-direct {v3}, Ln8/j$r;-><init>()V

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

    iput-object p1, p0, Ln8/j;->i:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v4, Ln8/j$s;

    invoke-direct {v4}, Ln8/j$s;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, LSd/d;

    invoke-direct {p1, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v4, 0x2

    aget-object v4, v2, v4

    invoke-interface {p1, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Ln8/j;->j:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v4, Ln8/j$t;

    invoke-direct {v4}, Ln8/j$t;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, Lae/b;

    invoke-direct {p1, v4, v1}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v0, 0x3

    aget-object v0, v2, v0

    invoke-interface {p1, p0, v0}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Ln8/j;->k:LYg/m;

    sget-object p1, Lgg/a;->LATEST:Lgg/a;

    new-instance v0, Ln8/j$p;

    invoke-direct {v0, p0}, Ln8/j$p;-><init>(Ln8/j;)V

    invoke-static {v0, p1}, Lgg/i;->N(Lgg/k;Lgg/a;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ln8/j;->l:Lgg/i;

    new-instance v1, Ln8/j$b;

    invoke-direct {v1, p0}, Ln8/j$b;-><init>(Ln8/j;)V

    invoke-virtual {p1, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v1

    new-instance v2, Ln8/j$c;

    invoke-direct {v2, p0}, Ln8/j$c;-><init>(Ln8/j;)V

    invoke-virtual {v1, v2}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v1

    invoke-virtual {v1}, Ljg/a;->i2()Lgg/i;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Ln8/j;->n:Lgg/i;

    sget-object v2, Ln8/j$d;->a:Ln8/j$d;

    invoke-virtual {v1, v2}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v5

    const-string/jumbo v2, "switchMap(...)"

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, LJe/a$c;->a:LJe/a$c;

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v4, p0

    invoke-static/range {v4 .. v10}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v4

    iput-object v4, p0, Ln8/j;->o:LLi/N;

    sget-object v4, Ln8/j$v;->a:Ln8/j$v;

    invoke-virtual {v1, v4}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v5, p0

    invoke-static/range {v5 .. v11}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v4

    iput-object v4, p0, Ln8/j;->p:LLi/N;

    sget-object v4, Ln8/j$w;->a:Ln8/j$w;

    invoke-virtual {v1, v4}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v9, 0x2

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lye/g;->h0(Lye/g;Lgg/i;Ljava/lang/Object;Landroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v4

    iput-object v4, p0, Ln8/j;->q:LLi/N;

    sget-object v4, Ln8/j$a;->a:Ln8/j$a;

    invoke-virtual {v1, v4}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, LEe/g;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v4

    invoke-direct {v7, v4}, LEe/g;-><init>(Ljava/util/List;)V

    const/4 v10, 0x6

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v5 .. v11}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v4

    iput-object v4, p0, Ln8/j;->r:LLi/N;

    sget-object v4, Ln8/j$o;->a:Ln8/j$o;

    invoke-virtual {v1, v4}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v7, LKe/m$b;->a:LKe/m$b;

    invoke-static/range {v5 .. v11}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v1

    iput-object v1, p0, Ln8/j;->s:LLi/N;

    invoke-direct {p0}, Ln8/j;->I0()LSd/d;

    move-result-object v1

    invoke-interface {v1}, LSd/d;->b()Lgg/i;

    move-result-object v1

    new-instance v2, Ln8/j$e;

    invoke-direct {v2, p0}, Ln8/j$e;-><init>(Ln8/j;)V

    invoke-virtual {v1, v2}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    const-string/jumbo v2, "distinctUntilChanged(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Ln8/j;->t:Lgg/i;

    invoke-virtual {p1}, Lgg/i;->o0()Lgg/z;

    move-result-object p1

    new-instance v1, Ln8/j$x;

    invoke-direct {v1, p0}, Ln8/j$x;-><init>(Ln8/j;)V

    invoke-virtual {p1, v1}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ln8/j;->u:Lgg/i;

    return-void
.end method

.method public static final synthetic A0(Ln8/j;)LSd/d;
    .locals 0

    invoke-direct {p0}, Ln8/j;->I0()LSd/d;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic B0(Ln8/j;)LJe/b;
    .locals 0

    invoke-virtual {p0}, LJe/c;->p0()LJe/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic C0(Ln8/j;)Landroidx/lifecycle/E;
    .locals 0

    invoke-virtual {p0}, Lye/g;->j0()Landroidx/lifecycle/E;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic D0(Ln8/j;)Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;
    .locals 0

    invoke-direct {p0}, Ln8/j;->J0()Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic E0(Ln8/j;)Lae/b;
    .locals 0

    invoke-direct {p0}, Ln8/j;->K0()Lae/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic F0(Ln8/j;)Lgg/i;
    .locals 0

    iget-object p0, p0, Ln8/j;->u:Lgg/i;

    return-object p0
.end method

.method public static final synthetic G0(Ln8/j;)Li8/a;
    .locals 0

    invoke-direct {p0}, Ln8/j;->L0()Li8/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic H0(Ln8/j;Ln8/e;)V
    .locals 0

    iput-object p1, p0, Ln8/j;->m:Ln8/e;

    return-void
.end method

.method private final I0()LSd/d;
    .locals 1

    iget-object v0, p0, Ln8/j;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LSd/d;

    return-object v0
.end method

.method private final J0()Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;
    .locals 1

    iget-object v0, p0, Ln8/j;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;

    return-object v0
.end method

.method private final K0()Lae/b;
    .locals 1

    iget-object v0, p0, Ln8/j;->k:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lae/b;

    return-object v0
.end method

.method private final L0()Li8/a;
    .locals 1

    iget-object v0, p0, Ln8/j;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method

.method private final M0()V
    .locals 7

    sget-object v6, Lye/d;->a:Lye/d;

    new-instance v3, Ln8/i;

    invoke-direct {v3, p0}, Ln8/i;-><init>(Ln8/j;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, v6

    move-object v1, p0

    invoke-static/range {v0 .. v5}, Lye/d;->c(Lye/d;Lye/g;Landroidx/lifecycle/k$b;Lmh/a;ILjava/lang/Object;)Lye/d$a;

    move-result-object v0

    invoke-static {v0}, Ln8/j;->O0(Lye/d$a;)Lgg/i;

    move-result-object v0

    invoke-virtual {v6, v0, p0}, Lye/d;->e(Lgg/i;Lye/g;)V

    return-void
.end method

.method private static final N0(Ln8/j;)Lgg/i;
    .locals 1

    iget-object p0, p0, Ln8/j;->n:Lgg/i;

    sget-object v0, Ln8/j$u;->a:Ln8/j$u;

    invoke-virtual {p0, v0}, Lgg/i;->L1(Lkg/n;)Lgg/b;

    move-result-object p0

    invoke-virtual {p0}, Lgg/b;->c0()Lgg/i;

    move-result-object p0

    const-string/jumbo v0, "toFlowable(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final O0(Lye/d$a;)Lgg/i;
    .locals 2

    sget-object v0, Ln8/j;->v:[Lth/l;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lye/d$a;->c(Ljava/lang/Object;Lth/l;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x0(Ln8/j;)Lgg/i;
    .locals 0

    invoke-static {p0}, Ln8/j;->N0(Ln8/j;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic y0(Ln8/j;)Lgg/i;
    .locals 0

    iget-object p0, p0, Ln8/j;->n:Lgg/i;

    return-object p0
.end method

.method public static final synthetic z0(Ln8/j;)Lgg/i;
    .locals 0

    iget-object p0, p0, Ln8/j;->t:Lgg/i;

    return-object p0
.end method


# virtual methods
.method public c()LLi/N;
    .locals 1

    iget-object v0, p0, Ln8/j;->q:LLi/N;

    return-object v0
.end method

.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, Ln8/j;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public l0()V
    .locals 0

    invoke-direct {p0}, Ln8/j;->M0()V

    return-void
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, Ln8/j;->r:LLi/N;

    return-object v0
.end method

.method public o0()LLi/N;
    .locals 1

    iget-object v0, p0, Ln8/j;->o:LLi/N;

    return-object v0
.end method

.method public p(Landroidx/lifecycle/o;)V
    .locals 2

    const-string/jumbo v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ln8/j;->m:Ln8/e;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lye/g;->j0()Landroidx/lifecycle/E;

    move-result-object v1

    invoke-interface {v0, v1}, Ln8/e;->e(Landroidx/lifecycle/E;)V

    :cond_0
    invoke-super {p0, p1}, Lye/g;->p(Landroidx/lifecycle/o;)V

    return-void
.end method

.method public q0()LLi/N;
    .locals 1

    iget-object v0, p0, Ln8/j;->s:LLi/N;

    return-object v0
.end method

.method public r0()LLi/N;
    .locals 1

    iget-object v0, p0, Ln8/j;->p:LLi/N;

    return-object v0
.end method

.method public s0()V
    .locals 3

    sget-object v0, Lye/d;->a:Lye/d;

    iget-object v1, p0, Ln8/j;->n:Lgg/i;

    sget-object v2, Ln8/j$f;->a:Ln8/j$f;

    invoke-virtual {v1, v2}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    new-instance v2, Ln8/j$g;

    invoke-direct {v2, p0}, Ln8/j$g;-><init>(Ln8/j;)V

    invoke-virtual {v1, v2}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "flatMapCompletable(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public t0()V
    .locals 3

    sget-object v0, Lye/d;->a:Lye/d;

    iget-object v1, p0, Ln8/j;->n:Lgg/i;

    sget-object v2, Ln8/j$h;->a:Ln8/j$h;

    invoke-virtual {v1, v2}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    sget-object v2, Ln8/j$i;->a:Ln8/j$i;

    invoke-virtual {v1, v2}, Lgg/z;->u(Lkg/n;)Lgg/n;

    move-result-object v1

    new-instance v2, Ln8/j$j;

    invoke-direct {v2, p0}, Ln8/j$j;-><init>(Ln8/j;)V

    invoke-virtual {v1, v2}, Lgg/n;->k(Lkg/n;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "flatMapCompletable(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public u0()V
    .locals 3

    sget-object v0, Lye/d;->a:Lye/d;

    iget-object v1, p0, Ln8/j;->n:Lgg/i;

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    sget-object v2, Ln8/j$k;->a:Ln8/j$k;

    invoke-virtual {v1, v2}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "flatMapCompletable(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public v0()V
    .locals 3

    sget-object v0, Lye/d;->a:Lye/d;

    iget-object v1, p0, Ln8/j;->n:Lgg/i;

    sget-object v2, Ln8/j$l;->a:Ln8/j$l;

    invoke-virtual {v1, v2}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    sget-object v2, Ln8/j$m;->a:Ln8/j$m;

    invoke-virtual {v1, v2}, Lgg/z;->u(Lkg/n;)Lgg/n;

    move-result-object v1

    new-instance v2, Ln8/j$n;

    invoke-direct {v2, p0}, Ln8/j$n;-><init>(Ln8/j;)V

    invoke-virtual {v1, v2}, Lgg/n;->k(Lkg/n;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "flatMapCompletable(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public w0(Lh9/a;)V
    .locals 4

    const-string/jumbo v0, "bssid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, Ln8/j;->L0()Li8/a;

    move-result-object v1

    new-instance v2, Li8/a$b$K;

    new-instance v3, Lxf/d;

    invoke-direct {v3, p1}, Lxf/d;-><init>(Lh9/a;)V

    invoke-direct {v2, v3}, Li8/a$b$K;-><init>(Lxf/d;)V

    const/4 p1, 0x1

    new-array p1, p1, [Li8/a$b;

    const/4 v3, 0x0

    aput-object v2, p1, v3

    invoke-interface {v1, p1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    invoke-virtual {v0, p1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method
