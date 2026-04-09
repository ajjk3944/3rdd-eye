.class public abstract LBe/q;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(ZLandroidx/compose/foundation/o;FJZLo0/c;)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, LBe/q;->d(ZLandroidx/compose/foundation/o;FJZLo0/c;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;Landroidx/compose/foundation/o;JFZZ)Landroidx/compose/ui/e;
    .locals 8

    const-string v0, "$this$verticalFadeScrollIndicator"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scrollState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LBe/p;

    move-object v1, v0

    move v2, p5

    move-object v3, p1

    move v4, p4

    move-wide v5, p2

    move v7, p6

    invoke-direct/range {v1 .. v7}, LBe/p;-><init>(ZLandroidx/compose/foundation/o;FJZ)V

    invoke-static {p0, v0}, Landroidx/compose/ui/draw/b;->d(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/e;Landroidx/compose/foundation/o;JFZZILjava/lang/Object;)Landroidx/compose/ui/e;
    .locals 7

    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_0

    const/16 p4, 0x3c

    int-to-float p4, p4

    invoke-static {p4}, LY0/h;->j(F)F

    move-result p4

    :cond_0
    move v4, p4

    and-int/lit8 p4, p7, 0x8

    const/4 p8, 0x1

    if-eqz p4, :cond_1

    move v5, p8

    goto :goto_0

    :cond_1
    move v5, p5

    :goto_0
    and-int/lit8 p4, p7, 0x10

    if-eqz p4, :cond_2

    move v6, p8

    goto :goto_1

    :cond_2
    move v6, p6

    :goto_1
    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    invoke-static/range {v0 .. v6}, LBe/q;->b(Landroidx/compose/ui/e;Landroidx/compose/foundation/o;JFZZ)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.method private static final d(ZLandroidx/compose/foundation/o;FJZLo0/c;)LYg/J;
    .locals 21

    const-string v0, "$this$drawWithContent"

    move-object/from16 v13, p6

    invoke-static {v13, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface/range {p6 .. p6}, Lo0/c;->X1()V

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/o;->m()I

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface/range {p6 .. p6}, Lo0/f;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/m;->i(J)F

    move-result v1

    invoke-interface/range {p6 .. p6}, LY0/d;->getDensity()F

    move-result v2

    mul-float v2, v2, p2

    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/o;->m()I

    move-result v3

    int-to-float v3, v3

    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    move-result v2

    invoke-static {v1, v2}, Ll0/n;->a(FF)J

    move-result-wide v5

    invoke-static {v0, v0}, Ll0/h;->a(FF)J

    move-result-wide v3

    sget-object v14, Lm0/l0;->b:Lm0/l0$a;

    invoke-static/range {p3 .. p4}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v1

    sget-object v2, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v2}, Lm0/v0$a;->d()J

    move-result-wide v7

    invoke-static {v7, v8}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v2

    filled-new-array {v1, v2}, [Lm0/v0;

    move-result-object v1

    invoke-static {v1}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    invoke-static {v5, v6}, Ll0/m;->g(J)F

    move-result v17

    const/16 v19, 0x8

    const/16 v20, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    invoke-static/range {v14 .. v20}, Lm0/l0$a;->i(Lm0/l0$a;Ljava/util/List;FFIILjava/lang/Object;)Lm0/l0;

    move-result-object v2

    const/16 v11, 0x78

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v1, p6

    invoke-static/range {v1 .. v12}, Lo0/f;->l0(Lo0/f;Lm0/l0;JJFLo0/g;Lm0/w0;IILjava/lang/Object;)V

    :cond_0
    if-eqz p5, :cond_1

    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/o;->m()I

    move-result v1

    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/o;->l()I

    move-result v2

    if-eq v1, v2, :cond_1

    invoke-interface/range {p6 .. p6}, LY0/d;->getDensity()F

    move-result v1

    mul-float v1, v1, p2

    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/o;->l()I

    move-result v2

    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/o;->m()I

    move-result v3

    sub-int/2addr v2, v3

    int-to-float v2, v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    invoke-interface/range {p6 .. p6}, Lo0/f;->c()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/m;->g(J)F

    move-result v2

    sub-float/2addr v2, v1

    invoke-static {v0, v2}, Ll0/h;->a(FF)J

    move-result-wide v3

    sget-object v5, Lm0/l0;->b:Lm0/l0$a;

    sget-object v0, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v0}, Lm0/v0$a;->d()J

    move-result-wide v6

    invoke-static {v6, v7}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v0

    invoke-static/range {p3 .. p4}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v2

    filled-new-array {v0, v2}, [Lm0/v0;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-interface/range {p6 .. p6}, Lo0/f;->c()J

    move-result-wide v7

    invoke-static {v7, v8}, Ll0/m;->g(J)F

    move-result v0

    sub-float v7, v0, v1

    invoke-interface/range {p6 .. p6}, Lo0/f;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/m;->g(J)F

    move-result v8

    const/16 v10, 0x8

    const/4 v11, 0x0

    const/4 v9, 0x0

    invoke-static/range {v5 .. v11}, Lm0/l0$a;->i(Lm0/l0$a;Ljava/util/List;FFIILjava/lang/Object;)Lm0/l0;

    move-result-object v2

    const/16 v11, 0x7c

    const/4 v12, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v1, p6

    invoke-static/range {v1 .. v12}, Lo0/f;->l0(Lo0/f;Lm0/l0;JJFLo0/g;Lm0/w0;IILjava/lang/Object;)V

    :cond_1
    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
