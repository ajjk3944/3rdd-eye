.class public abstract Ls/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Lm0/U0;Ll0/k;FZ)Lm0/U0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ls/e;->i(Lm0/U0;Ll0/k;FZ)Lm0/U0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lj0/d;)Lj0/h;
    .locals 0

    invoke-static {p0}, Ls/e;->j(Lj0/d;)Lj0/h;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lj0/d;Lm0/l0;JJZF)Lj0/h;
    .locals 0

    invoke-static/range {p0 .. p7}, Ls/e;->k(Lj0/d;Lm0/l0;JJZF)Lj0/h;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(JF)J
    .locals 0

    invoke-static {p0, p1, p2}, Ls/e;->l(JF)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final e(Landroidx/compose/ui/e;Ls/g;Lm0/i1;)Landroidx/compose/ui/e;
    .locals 1

    invoke-virtual {p1}, Ls/g;->b()F

    move-result v0

    invoke-virtual {p1}, Ls/g;->a()Lm0/l0;

    move-result-object p1

    invoke-static {p0, v0, p1, p2}, Ls/e;->g(Landroidx/compose/ui/e;FLm0/l0;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Landroidx/compose/ui/e;FJLm0/i1;)Landroidx/compose/ui/e;
    .locals 2

    new-instance v0, Lm0/j1;

    const/4 v1, 0x0

    invoke-direct {v0, p2, p3, v1}, Lm0/j1;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p0, p1, v0, p4}, Ls/e;->g(Landroidx/compose/ui/e;FLm0/l0;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Landroidx/compose/ui/e;FLm0/l0;Lm0/i1;)Landroidx/compose/ui/e;
    .locals 2

    new-instance v0, Landroidx/compose/foundation/BorderModifierNodeElement;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p3, v1}, Landroidx/compose/foundation/BorderModifierNodeElement;-><init>(FLm0/l0;Lm0/i1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.method private static final h(FLl0/k;)Ll0/k;
    .locals 15

    move v2, p0

    invoke-virtual/range {p1 .. p1}, Ll0/k;->j()F

    move-result v0

    sub-float v3, v0, v2

    invoke-virtual/range {p1 .. p1}, Ll0/k;->d()F

    move-result v0

    sub-float v4, v0, v2

    invoke-virtual/range {p1 .. p1}, Ll0/k;->h()J

    move-result-wide v0

    invoke-static {v0, v1, p0}, Ls/e;->l(JF)J

    move-result-wide v5

    invoke-virtual/range {p1 .. p1}, Ll0/k;->i()J

    move-result-wide v0

    invoke-static {v0, v1, p0}, Ls/e;->l(JF)J

    move-result-wide v7

    invoke-virtual/range {p1 .. p1}, Ll0/k;->b()J

    move-result-wide v0

    invoke-static {v0, v1, p0}, Ls/e;->l(JF)J

    move-result-wide v11

    invoke-virtual/range {p1 .. p1}, Ll0/k;->c()J

    move-result-wide v0

    invoke-static {v0, v1, p0}, Ls/e;->l(JF)J

    move-result-wide v9

    new-instance v14, Ll0/k;

    const/4 v13, 0x0

    move-object v0, v14

    move v1, p0

    invoke-direct/range {v0 .. v13}, Ll0/k;-><init>(FFFFJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v14
.end method

.method private static final i(Lm0/U0;Ll0/k;FZ)Lm0/U0;
    .locals 2

    invoke-interface {p0}, Lm0/U0;->a()V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lm0/U0;->t(Lm0/U0;Ll0/k;Lm0/U0$b;ILjava/lang/Object;)V

    if-nez p3, :cond_0

    invoke-static {}, Lm0/Y;->a()Lm0/U0;

    move-result-object p3

    invoke-static {p2, p1}, Ls/e;->h(FLl0/k;)Ll0/k;

    move-result-object p1

    invoke-static {p3, p1, v0, v1, v0}, Lm0/U0;->t(Lm0/U0;Ll0/k;Lm0/U0$b;ILjava/lang/Object;)V

    sget-object p1, Lm0/Y0;->a:Lm0/Y0$a;

    invoke-virtual {p1}, Lm0/Y0$a;->a()I

    move-result p1

    invoke-interface {p0, p0, p3, p1}, Lm0/U0;->k(Lm0/U0;Lm0/U0;I)Z

    :cond_0
    return-object p0
.end method

.method private static final j(Lj0/d;)Lj0/h;
    .locals 1

    sget-object v0, Ls/e$a;->a:Ls/e$a;

    invoke-virtual {p0, v0}, Lj0/d;->p(Lmh/l;)Lj0/h;

    move-result-object p0

    return-object p0
.end method

.method private static final k(Lj0/d;Lm0/l0;JJZF)Lj0/h;
    .locals 16

    if-eqz p6, :cond_0

    sget-object v0, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v0}, Ll0/g$a;->c()J

    move-result-wide v0

    move-wide v4, v0

    goto :goto_0

    :cond_0
    move-wide/from16 v4, p2

    :goto_0
    if-eqz p6, :cond_1

    invoke-virtual/range {p0 .. p0}, Lj0/d;->c()J

    move-result-wide v0

    move-wide v6, v0

    goto :goto_1

    :cond_1
    move-wide/from16 v6, p4

    :goto_1
    if-eqz p6, :cond_2

    sget-object v0, Lo0/j;->a:Lo0/j;

    move-object v8, v0

    goto :goto_2

    :cond_2
    new-instance v0, Lo0/k;

    const/16 v14, 0x1e

    const/4 v15, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v8, v0

    move/from16 v9, p7

    invoke-direct/range {v8 .. v15}, Lo0/k;-><init>(FFIILm0/V0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_2
    new-instance v0, Ls/e$b;

    move-object v2, v0

    move-object/from16 v3, p1

    invoke-direct/range {v2 .. v8}, Ls/e$b;-><init>(Lm0/l0;JJLo0/g;)V

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lj0/d;->p(Lmh/l;)Lj0/h;

    move-result-object v0

    return-object v0
.end method

.method private static final l(JF)J
    .locals 2

    invoke-static {p0, p1}, Ll0/a;->d(J)F

    move-result v0

    sub-float/2addr v0, p2

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-static {p0, p1}, Ll0/a;->e(J)F

    move-result p0

    sub-float/2addr p0, p2

    invoke-static {v1, p0}, Ljava/lang/Math;->max(FF)F

    move-result p0

    invoke-static {v0, p0}, Ll0/b;->a(FF)J

    move-result-wide p0

    return-wide p0
.end method
