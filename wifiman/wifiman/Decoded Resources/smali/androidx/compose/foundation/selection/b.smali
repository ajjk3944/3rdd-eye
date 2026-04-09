.class final Landroidx/compose/foundation/selection/b;
.super Landroidx/compose/foundation/e;
.source "SourceFile"


# instance fields
.field private J:Z


# direct methods
.method private constructor <init>(ZLy/m;Ls/I;ZLJ0/g;Lmh/a;)V
    .locals 8

    const/4 v4, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move v3, p4

    move-object v5, p5

    move-object v6, p6

    .line 2
    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/e;-><init>(Ly/m;Ls/I;ZLjava/lang/String;LJ0/g;Lmh/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-boolean p1, p0, Landroidx/compose/foundation/selection/b;->J:Z

    return-void
.end method

.method public synthetic constructor <init>(ZLy/m;Ls/I;ZLJ0/g;Lmh/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Landroidx/compose/foundation/selection/b;-><init>(ZLy/m;Ls/I;ZLJ0/g;Lmh/a;)V

    return-void
.end method


# virtual methods
.method public P2(LJ0/w;)V
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/selection/b;->J:Z

    invoke-static {p1, v0}, LJ0/t;->j0(LJ0/w;Z)V

    return-void
.end method

.method public final e3(ZLy/m;Ls/I;ZLJ0/g;Lmh/a;)V
    .locals 8

    iget-boolean v0, p0, Landroidx/compose/foundation/selection/b;->J:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Landroidx/compose/foundation/selection/b;->J:Z

    invoke-static {p0}, LE0/w0;->b(LE0/v0;)V

    :cond_0
    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v6, p5

    move-object v7, p6

    invoke-super/range {v1 .. v7}, Landroidx/compose/foundation/e;->d3(Ly/m;Ls/I;ZLjava/lang/String;LJ0/g;Lmh/a;)V

    return-void
.end method
