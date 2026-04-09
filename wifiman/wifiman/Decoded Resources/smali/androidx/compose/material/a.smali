.class public abstract Landroidx/compose/material/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lmh/l;)LN/D;
    .locals 2

    new-instance v0, Landroidx/compose/material/c;

    new-instance v1, LN/E;

    invoke-direct {v1}, LN/E;-><init>()V

    invoke-interface {p0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, LN/E;->b()Ljava/util/Map;

    move-result-object p0

    invoke-direct {v0, p0}, Landroidx/compose/material/c;-><init>(Ljava/util/Map;)V

    return-object v0
.end method

.method public static final synthetic b()Landroidx/compose/material/c;
    .locals 1

    invoke-static {}, Landroidx/compose/material/a;->i()Landroidx/compose/material/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic c(Lmh/a;Lmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/compose/material/a;->j(Lmh/a;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/e;LN/b;Lw/q;ZZLy/m;Z)Landroidx/compose/ui/e;
    .locals 11

    invoke-virtual {p1}, LN/b;->u()Lw/m;

    move-result-object v1

    new-instance v7, Landroidx/compose/material/a$a;

    const/4 v0, 0x0

    move-object v2, p1

    invoke-direct {v7, p1, v0}, Landroidx/compose/material/a$a;-><init>(LN/b;Ldh/e;)V

    const/16 v9, 0x20

    const/4 v10, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p2

    move v3, p3

    move-object/from16 v4, p5

    move/from16 v5, p6

    move v8, p4

    invoke-static/range {v0 .. v10}, Lw/l;->h(Landroidx/compose/ui/e;Lw/m;Lw/q;ZLy/m;ZLmh/q;Lmh/q;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e(Landroidx/compose/ui/e;LN/b;Lw/q;ZZLy/m;ZILjava/lang/Object;)Landroidx/compose/ui/e;
    .locals 7

    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_0

    const/4 p3, 0x1

    :cond_0
    move v3, p3

    and-int/lit8 p3, p7, 0x8

    if-eqz p3, :cond_1

    const/4 p4, 0x0

    :cond_1
    move v4, p4

    and-int/lit8 p3, p7, 0x10

    if-eqz p3, :cond_2

    const/4 p5, 0x0

    :cond_2
    move-object v5, p5

    and-int/lit8 p3, p7, 0x20

    if-eqz p3, :cond_3

    invoke-virtual {p1}, LN/b;->y()Z

    move-result p6

    :cond_3
    move v6, p6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v6}, Landroidx/compose/material/a;->d(Landroidx/compose/ui/e;LN/b;Lw/q;ZZLy/m;Z)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.method public static final f(LN/b;Ljava/lang/Object;FLdh/e;)Ljava/lang/Object;
    .locals 7

    new-instance v3, Landroidx/compose/material/a$b;

    const/4 v0, 0x0

    invoke-direct {v3, p0, p2, v0}, Landroidx/compose/material/a$b;-><init>(LN/b;FLdh/e;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v4, p3

    invoke-static/range {v0 .. v6}, LN/b;->k(LN/b;Ljava/lang/Object;Ls/L;Lmh/r;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static synthetic g(LN/b;Ljava/lang/Object;FLdh/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    invoke-virtual {p0}, LN/b;->v()F

    move-result p2

    :cond_0
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/material/a;->f(LN/b;Ljava/lang/Object;FLdh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Landroidx/compose/ui/e;LN/b;Lw/q;Lmh/p;)Landroidx/compose/ui/e;
    .locals 1

    new-instance v0, Landroidx/compose/material/DraggableAnchorsElement;

    invoke-direct {v0, p1, p3, p2}, Landroidx/compose/material/DraggableAnchorsElement;-><init>(LN/b;Lmh/p;Lw/q;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.method private static final i()Landroidx/compose/material/c;
    .locals 2

    new-instance v0, Landroidx/compose/material/c;

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/compose/material/c;-><init>(Ljava/util/Map;)V

    return-object v0
.end method

.method private static final j(Lmh/a;Lmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Landroidx/compose/material/a$c;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Landroidx/compose/material/a$c;

    iget v1, v0, Landroidx/compose/material/a$c;->b:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Landroidx/compose/material/a$c;->b:I

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/compose/material/a$c;

    invoke-direct {v0, p2}, Landroidx/compose/material/a$c;-><init>(Ldh/e;)V

    :goto_0
    iget-object p2, v0, Landroidx/compose/material/a$c;->a:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Landroidx/compose/material/a$c;->b:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroidx/compose/material/AnchoredDragFinishedSignal; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_1
    new-instance p2, Landroidx/compose/material/a$d;

    const/4 v2, 0x0

    invoke-direct {p2, p0, p1, v2}, Landroidx/compose/material/a$d;-><init>(Lmh/a;Lmh/p;Ldh/e;)V

    iput v3, v0, Landroidx/compose/material/a$c;->b:I

    invoke-static {p2, v0}, LIi/O;->g(Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Landroidx/compose/material/AnchoredDragFinishedSignal; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p0, v1, :cond_3

    return-object v1

    :catch_0
    :cond_3
    :goto_1
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
