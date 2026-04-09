.class public Landroidx/compose/foundation/e;
.super Landroidx/compose/foundation/a;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Ly/m;Ls/I;ZLjava/lang/String;LJ0/g;Lmh/a;)V
    .locals 8

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 2
    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/a;-><init>(Ly/m;Ls/I;ZLjava/lang/String;LJ0/g;Lmh/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ly/m;Ls/I;ZLjava/lang/String;LJ0/g;Lmh/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Landroidx/compose/foundation/e;-><init>(Ly/m;Ls/I;ZLjava/lang/String;LJ0/g;Lmh/a;)V

    return-void
.end method

.method static synthetic c3(Landroidx/compose/foundation/e;Ly0/G;Ldh/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Landroidx/compose/foundation/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/compose/foundation/e$a;-><init>(Landroidx/compose/foundation/e;Ldh/e;)V

    new-instance v1, Landroidx/compose/foundation/e$b;

    invoke-direct {v1, p0}, Landroidx/compose/foundation/e$b;-><init>(Landroidx/compose/foundation/e;)V

    invoke-static {p1, v0, v1, p2}, Lw/B;->i(Ly0/G;Lmh/q;Lmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public Q2(Ly0/G;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/e;->c3(Landroidx/compose/foundation/e;Ly0/G;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final d3(Ly/m;Ls/I;ZLjava/lang/String;LJ0/g;Lmh/a;)V
    .locals 0

    invoke-virtual/range {p0 .. p6}, Landroidx/compose/foundation/a;->b3(Ly/m;Ls/I;ZLjava/lang/String;LJ0/g;Lmh/a;)V

    return-void
.end method
