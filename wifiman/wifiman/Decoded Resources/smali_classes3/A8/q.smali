.class public final LA8/q;
.super LXe/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LA8/q$a;
    }
.end annotation


# static fields
.field public static final r:LA8/q$a;

.field static final synthetic s:[Lth/l;

.field public static final t:I


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:LYg/m;

.field private final j:LYg/m;

.field private final k:LYg/m;

.field private final l:Lgg/i;

.field private final m:Lgg/i;

.field private final n:LFg/a;

.field private final o:Lgg/i;

.field private final p:LLi/N;

.field private final q:LLi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LA8/q;

    const-string/jumbo v2, "viewRouter"

    const-string/jumbo v3, "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "analytics"

    const-string/jumbo v5, "getAnalytics()Lcom/ubnt/usurvey/analytics/Analytics;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/F;

    const-string/jumbo v5, "floorplanRecordManager"

    const-string/jumbo v6, "getFloorplanRecordManager()Lcom/ui/wifiman/model/signalmapper/floorplan/FloorplanRecordManager;"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v3

    new-instance v5, Lkotlin/jvm/internal/F;

    const-string/jumbo v6, "floorplanViewControllerManager"

    const-string/jumbo v7, "getFloorplanViewControllerManager()Lcom/ubnt/usurvey/ui/signal/floorplan/WifimanFloorplanViewControllerManager;"

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

    sput-object v5, LA8/q;->s:[Lth/l;

    new-instance v0, LA8/q$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LA8/q$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LA8/q;->r:LA8/q$a;

    const/16 v0, 0x8

    sput v0, LA8/q;->t:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 8

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LXe/b;-><init>()V

    iput-object p1, p0, LA8/q;->g:Lorg/kodein/di/DI;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, LA8/q$i;

    invoke-direct {v0}, LA8/q$i;-><init>()V

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

    sget-object v2, LA8/q;->s:[Lth/l;

    const/4 v3, 0x0

    aget-object v3, v2, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LA8/q;->h:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v3, LA8/q$j;

    invoke-direct {v3}, LA8/q$j;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, LP7/a;

    invoke-direct {p1, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v3, 0x1

    aget-object v4, v2, v3

    invoke-interface {p1, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LA8/q;->i:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v4, LA8/q$k;

    invoke-direct {v4}, LA8/q$k;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lod/b;

    invoke-direct {p1, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v4, 0x2

    aget-object v4, v2, v4

    invoke-interface {p1, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LA8/q;->j:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v4, LA8/q$l;

    invoke-direct {v4}, LA8/q$l;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, Lcom/ubnt/usurvey/ui/signal/floorplan/WifimanFloorplanViewControllerManager;

    invoke-direct {p1, v4, v1}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v0, 0x3

    aget-object v0, v2, v0

    invoke-interface {p1, p0, v0}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LA8/q;->k:LYg/m;

    sget-object p1, Lgg/a;->LATEST:Lgg/a;

    new-instance v0, LA8/q$h;

    invoke-direct {v0, p0}, LA8/q$h;-><init>(LA8/q;)V

    invoke-static {v0, p1}, Lgg/i;->N(Lgg/k;Lgg/a;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LA8/q;->l:Lgg/i;

    new-instance v1, LA8/q$g;

    invoke-direct {v1, p0}, LA8/q$g;-><init>(LA8/q;)V

    invoke-virtual {p1, v1}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v1

    invoke-virtual {v1}, Ljg/a;->i2()Lgg/i;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, LA8/q;->m:Lgg/i;

    const-string v2, ""

    invoke-static {v2}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object v2

    const-string/jumbo v4, "createDefault(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, p0, LA8/q;->n:LFg/a;

    sget-object v2, LA8/q$b;->a:LA8/q$b;

    invoke-virtual {v1, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v1

    invoke-virtual {v1}, Ljg/a;->i2()Lgg/i;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, LA8/q;->o:Lgg/i;

    sget-object v0, LA8/q$d;->a:LA8/q$d;

    invoke-virtual {v1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v3

    const-string/jumbo v0, "map(...)"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v7}, Lye/g;->h0(Lye/g;Lgg/i;Ljava/lang/Object;Landroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v1

    iput-object v1, p0, LA8/q;->p:LLi/N;

    sget-object v1, LA8/q$c;->a:LA8/q$c;

    invoke-virtual {p1, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {v2 .. v7}, Lye/g;->h0(Lye/g;Lgg/i;Ljava/lang/Object;Landroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, LA8/q;->q:LLi/N;

    return-void
.end method

.method private final A0()LP7/a;
    .locals 1

    iget-object v0, p0, LA8/q;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LP7/a;

    return-object v0
.end method

.method private final B0()Lod/b;
    .locals 1

    iget-object v0, p0, LA8/q;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lod/b;

    return-object v0
.end method

.method private final C0()Lcom/ubnt/usurvey/ui/signal/floorplan/WifimanFloorplanViewControllerManager;
    .locals 1

    iget-object v0, p0, LA8/q;->k:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ubnt/usurvey/ui/signal/floorplan/WifimanFloorplanViewControllerManager;

    return-object v0
.end method

.method private final D0()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lye/g;->j0()Landroidx/lifecycle/E;

    move-result-object v0

    const-string/jumbo v1, "name"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/E;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    return-object v0
.end method

.method private final E0()Li8/a;
    .locals 1

    iget-object v0, p0, LA8/q;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method

.method private final F0(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0}, Lye/g;->j0()Landroidx/lifecycle/E;

    move-result-object v0

    const-string/jumbo v1, "name"

    invoke-virtual {v0, v1, p1}, Landroidx/lifecycle/E;->i(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, LA8/q;->n:LFg/a;

    invoke-virtual {v0, p1}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic u0(LA8/q;)LP7/a;
    .locals 0

    invoke-direct {p0}, LA8/q;->A0()LP7/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic v0(LA8/q;)Lod/b;
    .locals 0

    invoke-direct {p0}, LA8/q;->B0()Lod/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic w0(LA8/q;)Lcom/ubnt/usurvey/ui/signal/floorplan/WifimanFloorplanViewControllerManager;
    .locals 0

    invoke-direct {p0}, LA8/q;->C0()Lcom/ubnt/usurvey/ui/signal/floorplan/WifimanFloorplanViewControllerManager;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic x0(LA8/q;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, LA8/q;->D0()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic y0(LA8/q;)LXe/a;
    .locals 0

    invoke-virtual {p0}, LXe/b;->p0()LXe/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic z0(LA8/q;)Li8/a;
    .locals 0

    invoke-direct {p0}, LA8/q;->E0()Li8/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, LA8/q;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public l0()V
    .locals 2

    invoke-super {p0}, Lye/g;->l0()V

    iget-object v0, p0, LA8/q;->n:LFg/a;

    invoke-direct {p0}, LA8/q;->D0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, LA8/q;->q:LLi/N;

    return-object v0
.end method

.method public o0()LLi/N;
    .locals 1

    iget-object v0, p0, LA8/q;->p:LLi/N;

    return-object v0
.end method

.method public q0(JLdh/e;)Ljava/lang/Object;
    .locals 2

    sget-object v0, LA8/d;->a:LA8/d;

    invoke-direct {p0}, LA8/q;->C0()Lcom/ubnt/usurvey/ui/signal/floorplan/WifimanFloorplanViewControllerManager;

    move-result-object v1

    invoke-virtual {v0, p1, p2, v1, p3}, LA8/d;->a(JLcom/ubnt/usurvey/ui/signal/floorplan/WifimanFloorplanViewControllerManager;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public r0(Ljava/lang/String;)V
    .locals 1

    const-string/jumbo v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LA8/q;->F0(Ljava/lang/String;)V

    return-void
.end method

.method public s0()V
    .locals 6

    sget-object v0, Lye/d;->a:Lye/d;

    sget-object v1, LAg/c;->a:LAg/c;

    iget-object v2, p0, LA8/q;->l:Lgg/i;

    iget-object v3, p0, LA8/q;->o:Lgg/i;

    invoke-virtual {v1, v2, v3}, LAg/c;->a(Lgg/i;Lgg/i;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    new-instance v2, LA8/q$e;

    invoke-direct {v2, p0}, LA8/q$e;-><init>(LA8/q;)V

    invoke-virtual {v1, v2}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v1

    invoke-direct {p0}, LA8/q;->A0()LP7/a;

    move-result-object v2

    new-instance v3, LP7/c$g$b;

    invoke-direct {v3}, LP7/c$g$b;-><init>()V

    invoke-interface {v2, v3}, LP7/a;->d(LP7/c;)Lgg/b;

    move-result-object v2

    invoke-virtual {v1, v2}, Lgg/b;->g(Lgg/f;)Lgg/b;

    move-result-object v1

    invoke-direct {p0}, LA8/q;->E0()Li8/a;

    move-result-object v2

    new-instance v3, Li8/a$b$c;

    sget-object v4, LQe/c$a;->SIGNAL:LQe/c$a;

    invoke-direct {v3, v4}, Li8/a$b$c;-><init>(LQe/c$a;)V

    const/4 v4, 0x1

    new-array v4, v4, [Li8/a$b;

    const/4 v5, 0x0

    aput-object v3, v4, v5

    invoke-interface {v2, v4}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v2

    invoke-virtual {v1, v2}, Lgg/b;->g(Lgg/f;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "andThen(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public t0()V
    .locals 6

    invoke-static {p0}, Landroidx/lifecycle/O;->a(Landroidx/lifecycle/N;)LIi/N;

    move-result-object v0

    new-instance v3, LA8/q$f;

    const/4 v1, 0x0

    invoke-direct {v3, p0, v1}, LA8/q$f;-><init>(LA8/q;Ldh/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    return-void
.end method
