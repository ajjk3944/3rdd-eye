.class public final LA8/f;
.super LWe/c;
.source "SourceFile"


# static fields
.field static final synthetic p:[Lth/l;

.field public static final q:I


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:LYg/m;

.field private final j:LYg/m;

.field private final k:LYg/m;

.field private final l:Lgg/i;

.field private final m:Lgg/i;

.field private final n:Lgg/i;

.field private final o:LLi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LA8/f;

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

    move-result-object v5

    new-instance v6, Lkotlin/jvm/internal/D;

    const-string/jumbo v7, "stream"

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

    sput-object v6, LA8/f;->p:[Lth/l;

    const/16 v0, 0x8

    sput v0, LA8/f;->q:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 7

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LWe/c;-><init>()V

    iput-object p1, p0, LA8/f;->g:Lorg/kodein/di/DI;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, LA8/f$l;

    invoke-direct {v0}, LA8/f$l;-><init>()V

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

    sget-object v2, LA8/f;->p:[Lth/l;

    const/4 v3, 0x0

    aget-object v3, v2, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LA8/f;->h:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v3, LA8/f$m;

    invoke-direct {v3}, LA8/f$m;-><init>()V

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

    iput-object p1, p0, LA8/f;->i:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v4, LA8/f$n;

    invoke-direct {v4}, LA8/f$n;-><init>()V

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

    iput-object p1, p0, LA8/f;->j:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v4, LA8/f$o;

    invoke-direct {v4}, LA8/f$o;-><init>()V

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

    iput-object p1, p0, LA8/f;->k:LYg/m;

    sget-object p1, Lgg/a;->LATEST:Lgg/a;

    new-instance v0, LA8/f$k;

    invoke-direct {v0, p0}, LA8/f$k;-><init>(LA8/f;)V

    invoke-static {v0, p1}, Lgg/i;->N(Lgg/k;Lgg/a;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LA8/f;->l:Lgg/i;

    new-instance v1, LA8/f$j;

    invoke-direct {v1, p0}, LA8/f$j;-><init>(LA8/f;)V

    invoke-virtual {p1, v1}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v1

    invoke-virtual {v1}, Ljg/a;->i2()Lgg/i;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, LA8/f;->m:Lgg/i;

    new-instance v2, LA8/f$c;

    invoke-direct {v2, p0}, LA8/f$c;-><init>(LA8/f;)V

    invoke-virtual {p1, v2}, Lgg/i;->N1(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object v2, LA8/f$d;->a:LA8/f$d;

    invoke-virtual {p1, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object v2, LA8/f$e;->a:LA8/f$e;

    invoke-virtual {p1, v2}, Lgg/i;->f1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LA8/f;->n:Lgg/i;

    invoke-static {v1}, Ll9/f;->e(Lgg/i;)Lgg/i;

    move-result-object v0

    invoke-static {p1}, Ll9/f;->e(Lgg/i;)Lgg/i;

    move-result-object p1

    sget-object v1, LA8/f$a;->a:LA8/f$a;

    invoke-static {v0, p1, v1}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    sget-object v0, LA8/f$b;->a:LA8/f$b;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v2

    const-string/jumbo p1, "map(...)"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lye/g;->h0(Lye/g;Lgg/i;Ljava/lang/Object;Landroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, LA8/f;->o:LLi/N;

    return-void
.end method

.method private final A0()Li8/a;
    .locals 1

    iget-object v0, p0, LA8/f;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method

.method private final B0()V
    .locals 7

    sget-object v6, Lye/d;->a:Lye/d;

    new-instance v3, LA8/e;

    invoke-direct {v3, p0}, LA8/e;-><init>(LA8/f;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, v6

    move-object v1, p0

    invoke-static/range {v0 .. v5}, Lye/d;->c(Lye/d;Lye/g;Landroidx/lifecycle/k$b;Lmh/a;ILjava/lang/Object;)Lye/d$a;

    move-result-object v0

    invoke-static {v0}, LA8/f;->D0(Lye/d$a;)Lgg/i;

    move-result-object v0

    invoke-virtual {v6, v0, p0}, Lye/d;->e(Lgg/i;Lye/g;)V

    return-void
.end method

.method private static final C0(LA8/f;)Lgg/i;
    .locals 3

    iget-object v0, p0, LA8/f;->m:Lgg/i;

    sget-object v1, LA8/f$f;->a:LA8/f$f;

    invoke-virtual {v0, v1}, Lgg/i;->m0(Lkg/p;)Lgg/i;

    move-result-object v0

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Lgg/i;->O1(J)Lgg/i;

    move-result-object v0

    new-instance v1, LA8/f$g;

    invoke-direct {v1, p0}, LA8/f$g;-><init>(LA8/f;)V

    invoke-virtual {v0, v1}, Lgg/i;->t0(Lkg/n;)Lgg/b;

    move-result-object p0

    invoke-virtual {p0}, Lgg/b;->c0()Lgg/i;

    move-result-object p0

    const-string/jumbo v0, "toFlowable(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final D0(Lye/d$a;)Lgg/i;
    .locals 2

    sget-object v0, LA8/f;->p:[Lth/l;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lye/d$a;->c(Ljava/lang/Object;Lth/l;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r0(LA8/f;)Lgg/i;
    .locals 0

    invoke-static {p0}, LA8/f;->C0(LA8/f;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic s0(LA8/f;)LP7/a;
    .locals 0

    invoke-direct {p0}, LA8/f;->x0()LP7/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic t0(LA8/f;)Lod/b;
    .locals 0

    invoke-direct {p0}, LA8/f;->y0()Lod/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic u0(LA8/f;)Lcom/ubnt/usurvey/ui/signal/floorplan/WifimanFloorplanViewControllerManager;
    .locals 0

    invoke-direct {p0}, LA8/f;->z0()Lcom/ubnt/usurvey/ui/signal/floorplan/WifimanFloorplanViewControllerManager;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic v0(LA8/f;)LWe/a;
    .locals 0

    invoke-virtual {p0}, LWe/c;->o0()LWe/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic w0(LA8/f;)Li8/a;
    .locals 0

    invoke-direct {p0}, LA8/f;->A0()Li8/a;

    move-result-object p0

    return-object p0
.end method

.method private final x0()LP7/a;
    .locals 1

    iget-object v0, p0, LA8/f;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LP7/a;

    return-object v0
.end method

.method private final y0()Lod/b;
    .locals 1

    iget-object v0, p0, LA8/f;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lod/b;

    return-object v0
.end method

.method private final z0()Lcom/ubnt/usurvey/ui/signal/floorplan/WifimanFloorplanViewControllerManager;
    .locals 1

    iget-object v0, p0, LA8/f;->k:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ubnt/usurvey/ui/signal/floorplan/WifimanFloorplanViewControllerManager;

    return-object v0
.end method


# virtual methods
.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, LA8/f;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public l0()V
    .locals 0

    invoke-super {p0}, Lye/g;->l0()V

    invoke-direct {p0}, LA8/f;->B0()V

    return-void
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, LA8/f;->o:LLi/N;

    return-object v0
.end method

.method public p0()V
    .locals 3

    sget-object v0, Lye/d;->a:Lye/d;

    iget-object v1, p0, LA8/f;->l:Lgg/i;

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    new-instance v2, LA8/f$h;

    invoke-direct {v2, p0}, LA8/f$h;-><init>(LA8/f;)V

    invoke-virtual {v1, v2}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "flatMapCompletable(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public q0()V
    .locals 6

    invoke-static {p0}, Landroidx/lifecycle/O;->a(Landroidx/lifecycle/N;)LIi/N;

    move-result-object v0

    new-instance v3, LA8/f$i;

    const/4 v1, 0x0

    invoke-direct {v3, p0, v1}, LA8/f$i;-><init>(LA8/f;Ldh/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    return-void
.end method
