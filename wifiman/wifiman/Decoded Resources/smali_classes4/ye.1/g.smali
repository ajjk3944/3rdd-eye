.class public abstract Lye/g;
.super Landroidx/lifecycle/N;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/e;


# static fields
.field static final synthetic e:[Lth/l;

.field public static final f:I


# instance fields
.field private b:Landroidx/lifecycle/E;

.field private final c:LYg/m;

.field private final d:LLi/g;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lkotlin/jvm/internal/D;

    const-class v1, Lye/g;

    const-string v2, "scopedFlow"

    const-string v3, "<v#0>"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/D;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->g(Lkotlin/jvm/internal/C;)Lth/m;

    move-result-object v0

    new-instance v3, Lkotlin/jvm/internal/D;

    const-string v5, "<v#1>"

    invoke-direct {v3, v1, v2, v5, v4}, Lkotlin/jvm/internal/D;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->g(Lkotlin/jvm/internal/C;)Lth/m;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lth/l;

    aput-object v0, v2, v4

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, Lye/g;->e:[Lth/l;

    const/16 v0, 0x8

    sput v0, Lye/g;->f:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/lifecycle/N;-><init>()V

    new-instance v0, Lye/e;

    invoke-direct {v0}, Lye/e;-><init>()V

    invoke-static {v0}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v0

    iput-object v0, p0, Lye/g;->c:LYg/m;

    invoke-direct {p0}, Lye/g;->k0()LLi/z;

    move-result-object v0

    iput-object v0, p0, Lye/g;->d:LLi/g;

    return-void
.end method

.method public static synthetic X(LLi/g;)LLi/g;
    .locals 0

    invoke-static {p0}, Lye/g;->e0(LLi/g;)LLi/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Y()LLi/z;
    .locals 1

    invoke-static {}, Lye/g;->Z()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method private static final Z()LLi/z;
    .locals 1

    sget-object v0, Landroidx/lifecycle/k$b;->INITIALIZED:Landroidx/lifecycle/k$b;

    invoke-static {v0}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c0(Lye/g;LLi/g;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;
    .locals 0

    if-nez p6, :cond_2

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p3, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    sget-object p4, Landroidx/lifecycle/k$b;->STARTED:Landroidx/lifecycle/k$b;

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lye/g;->a0(LLi/g;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;)LLi/N;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: asLifecycleStateFlow"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;
    .locals 0

    if-nez p6, :cond_2

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p3, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    sget-object p4, Landroidx/lifecycle/k$b;->STARTED:Landroidx/lifecycle/k$b;

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lye/g;->b0(Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;)LLi/N;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: asLifecycleStateFlow"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final e0(LLi/g;)LLi/g;
    .locals 1

    invoke-static {}, LIi/c0;->a()LIi/J;

    move-result-object v0

    invoke-static {p0, v0}, LLi/i;->C(LLi/g;Ldh/i;)LLi/g;

    move-result-object p0

    return-object p0
.end method

.method private static final f0(Lye/b$a;)LLi/g;
    .locals 2

    sget-object v0, Lye/g;->e:[Lth/l;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lye/b$a;->c(Ljava/lang/Object;Lth/l;)LLi/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h0(Lye/g;Lgg/i;Ljava/lang/Object;Landroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    sget-object p3, Landroidx/lifecycle/k$b;->STARTED:Landroidx/lifecycle/k$b;

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lye/g;->g0(Lgg/i;Ljava/lang/Object;Landroidx/lifecycle/k$b;)LLi/N;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: asLifecycleStateFlow"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final k0()LLi/z;
    .locals 1

    iget-object v0, p0, Lye/g;->c:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LLi/z;

    return-object v0
.end method


# virtual methods
.method protected final a0(LLi/g;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;)LLi/N;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isAtLeast"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lye/b;->a:Lye/b;

    new-instance v1, Lye/f;

    invoke-direct {v1, p1}, Lye/f;-><init>(LLi/g;)V

    invoke-virtual {v0, p0, p4, v1}, Lye/b;->b(Lye/g;Landroidx/lifecycle/k$b;Lmh/a;)Lye/b$a;

    move-result-object p1

    invoke-static {p1}, Lye/g;->f0(Lye/b$a;)LLi/g;

    move-result-object p1

    invoke-static {p0}, Landroidx/lifecycle/O;->a(Landroidx/lifecycle/N;)LIi/N;

    move-result-object p4

    sget-object v0, LLi/J;->a:LLi/J$a;

    if-nez p3, :cond_0

    const-wide v1, 0x7fffffffffffffffL

    :goto_0
    move-wide v3, v1

    goto :goto_1

    :cond_0
    const-wide/16 v1, 0x0

    goto :goto_0

    :goto_1
    const/4 v5, 0x1

    const/4 v6, 0x0

    const-wide/16 v1, 0x0

    invoke-static/range {v0 .. v6}, LLi/J$a;->b(LLi/J$a;JJILjava/lang/Object;)LLi/J;

    move-result-object p3

    invoke-static {p1, p4, p3, p2}, LLi/i;->M(LLi/g;LIi/N;LLi/J;Ljava/lang/Object;)LLi/N;

    move-result-object p1

    return-object p1
.end method

.method protected final b0(Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;)LLi/N;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialValue"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isAtLeast"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LPi/e;->a(LDj/a;)LLi/g;

    move-result-object p1

    invoke-virtual {p0, p1, p2, p3, p4}, Lye/g;->a0(LLi/g;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;)LLi/N;

    move-result-object p1

    return-object p1
.end method

.method public g(Landroidx/lifecycle/o;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/lifecycle/e;->g(Landroidx/lifecycle/o;)V

    invoke-direct {p0}, Lye/g;->k0()LLi/z;

    move-result-object p1

    sget-object v0, Landroidx/lifecycle/k$b;->RESUMED:Landroidx/lifecycle/k$b;

    invoke-interface {p1, v0}, LLi/z;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method protected final g0(Lgg/i;Ljava/lang/Object;Landroidx/lifecycle/k$b;)LLi/N;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isAtLeast"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LPi/e;->a(LDj/a;)LLi/g;

    move-result-object p1

    new-instance v1, Lye/g$a;

    invoke-direct {v1, p1}, Lye/g$a;-><init>(LLi/g;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v2, p2

    move-object v4, p3

    invoke-static/range {v0 .. v6}, Lye/g;->c0(Lye/g;LLi/g;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    return-object p1
.end method

.method public h(Landroidx/lifecycle/o;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/lifecycle/e;->h(Landroidx/lifecycle/o;)V

    invoke-direct {p0}, Lye/g;->k0()LLi/z;

    move-result-object p1

    sget-object v0, Landroidx/lifecycle/k$b;->CREATED:Landroidx/lifecycle/k$b;

    invoke-interface {p1, v0}, LLi/z;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final i0()LLi/g;
    .locals 1

    iget-object v0, p0, Lye/g;->d:LLi/g;

    return-object v0
.end method

.method protected final j0()Landroidx/lifecycle/E;
    .locals 2

    iget-object v0, p0, Lye/g;->b:Landroidx/lifecycle/E;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "SavedStateHandle not set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public l0()V
    .locals 0

    return-void
.end method

.method public final m0(Landroidx/lifecycle/E;)V
    .locals 1

    const-string v0, "handle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lye/g;->b:Landroidx/lifecycle/E;

    return-void
.end method

.method public onDestroy(Landroidx/lifecycle/o;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/lifecycle/e;->onDestroy(Landroidx/lifecycle/o;)V

    invoke-direct {p0}, Lye/g;->k0()LLi/z;

    move-result-object p1

    sget-object v0, Landroidx/lifecycle/k$b;->DESTROYED:Landroidx/lifecycle/k$b;

    invoke-interface {p1, v0}, LLi/z;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public onStart(Landroidx/lifecycle/o;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/lifecycle/e;->onStart(Landroidx/lifecycle/o;)V

    invoke-direct {p0}, Lye/g;->k0()LLi/z;

    move-result-object p1

    sget-object v0, Landroidx/lifecycle/k$b;->STARTED:Landroidx/lifecycle/k$b;

    invoke-interface {p1, v0}, LLi/z;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public onStop(Landroidx/lifecycle/o;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/lifecycle/e;->onStop(Landroidx/lifecycle/o;)V

    invoke-direct {p0}, Lye/g;->k0()LLi/z;

    move-result-object p1

    sget-object v0, Landroidx/lifecycle/k$b;->CREATED:Landroidx/lifecycle/k$b;

    invoke-interface {p1, v0}, LLi/z;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public p(Landroidx/lifecycle/o;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/lifecycle/e;->p(Landroidx/lifecycle/o;)V

    invoke-direct {p0}, Lye/g;->k0()LLi/z;

    move-result-object p1

    sget-object v0, Landroidx/lifecycle/k$b;->STARTED:Landroidx/lifecycle/k$b;

    invoke-interface {p1, v0}, LLi/z;->setValue(Ljava/lang/Object;)V

    return-void
.end method
