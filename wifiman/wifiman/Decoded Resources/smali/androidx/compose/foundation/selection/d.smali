.class final Landroidx/compose/foundation/selection/d;
.super Landroidx/compose/foundation/e;
.source "SourceFile"


# instance fields
.field private J:Z

.field private N:Lmh/l;

.field private final X:Lmh/a;


# direct methods
.method private constructor <init>(ZLy/m;Ls/I;ZLJ0/g;Lmh/l;)V
    .locals 8

    .line 2
    new-instance v6, Landroidx/compose/foundation/selection/d$a;

    invoke-direct {v6, p6, p1}, Landroidx/compose/foundation/selection/d$a;-><init>(Lmh/l;Z)V

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move v3, p4

    move-object v5, p5

    .line 3
    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/e;-><init>(Ly/m;Ls/I;ZLjava/lang/String;LJ0/g;Lmh/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 4
    iput-boolean p1, p0, Landroidx/compose/foundation/selection/d;->J:Z

    .line 5
    iput-object p6, p0, Landroidx/compose/foundation/selection/d;->N:Lmh/l;

    .line 6
    new-instance p1, Landroidx/compose/foundation/selection/d$b;

    invoke-direct {p1, p0}, Landroidx/compose/foundation/selection/d$b;-><init>(Landroidx/compose/foundation/selection/d;)V

    iput-object p1, p0, Landroidx/compose/foundation/selection/d;->X:Lmh/a;

    return-void
.end method

.method public synthetic constructor <init>(ZLy/m;Ls/I;ZLJ0/g;Lmh/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Landroidx/compose/foundation/selection/d;-><init>(ZLy/m;Ls/I;ZLJ0/g;Lmh/l;)V

    return-void
.end method

.method public static final synthetic e3(Landroidx/compose/foundation/selection/d;)Lmh/l;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/selection/d;->N:Lmh/l;

    return-object p0
.end method

.method public static final synthetic f3(Landroidx/compose/foundation/selection/d;)Z
    .locals 0

    iget-boolean p0, p0, Landroidx/compose/foundation/selection/d;->J:Z

    return p0
.end method


# virtual methods
.method public P2(LJ0/w;)V
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/selection/d;->J:Z

    invoke-static {v0}, LK0/b;->a(Z)LK0/a;

    move-result-object v0

    invoke-static {p1, v0}, LJ0/t;->v0(LJ0/w;LK0/a;)V

    return-void
.end method

.method public final g3(ZLy/m;Ls/I;ZLJ0/g;Lmh/l;)V
    .locals 8

    iget-boolean v0, p0, Landroidx/compose/foundation/selection/d;->J:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Landroidx/compose/foundation/selection/d;->J:Z

    invoke-static {p0}, LE0/w0;->b(LE0/v0;)V

    :cond_0
    iput-object p6, p0, Landroidx/compose/foundation/selection/d;->N:Lmh/l;

    const/4 v5, 0x0

    iget-object v7, p0, Landroidx/compose/foundation/selection/d;->X:Lmh/a;

    move-object v1, p0

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v6, p5

    invoke-super/range {v1 .. v7}, Landroidx/compose/foundation/e;->d3(Ly/m;Ls/I;ZLjava/lang/String;LJ0/g;Lmh/a;)V

    return-void
.end method
