.class final Landroidx/compose/foundation/selection/e;
.super Landroidx/compose/foundation/e;
.source "SourceFile"


# instance fields
.field private J:LK0/a;


# direct methods
.method private constructor <init>(LK0/a;Ly/m;Ls/I;ZLJ0/g;Lmh/a;)V
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
    iput-object p1, p0, Landroidx/compose/foundation/selection/e;->J:LK0/a;

    return-void
.end method

.method public synthetic constructor <init>(LK0/a;Ly/m;Ls/I;ZLJ0/g;Lmh/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Landroidx/compose/foundation/selection/e;-><init>(LK0/a;Ly/m;Ls/I;ZLJ0/g;Lmh/a;)V

    return-void
.end method


# virtual methods
.method public P2(LJ0/w;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/selection/e;->J:LK0/a;

    invoke-static {p1, v0}, LJ0/t;->v0(LJ0/w;LK0/a;)V

    return-void
.end method

.method public final e3(LK0/a;Ly/m;Ls/I;ZLJ0/g;Lmh/a;)V
    .locals 8

    iget-object v0, p0, Landroidx/compose/foundation/selection/e;->J:LK0/a;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Landroidx/compose/foundation/selection/e;->J:LK0/a;

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
