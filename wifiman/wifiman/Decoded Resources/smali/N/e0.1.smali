.class public abstract LN/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(JJJ)F
    .locals 11

    const/4 v0, 0x0

    const v1, 0x3e4ccccd    # 0.2f

    const v2, 0x3ecccccd    # 0.4f

    move v9, v2

    move v10, v9

    :goto_0
    const/4 v2, 0x7

    if-ge v0, v2, :cond_2

    move-wide v2, p0

    move v4, v9

    move-wide v5, p2

    move-wide v7, p4

    invoke-static/range {v2 .. v8}, LN/e0;->c(JFJJ)F

    move-result v2

    const/high16 v3, 0x40900000    # 4.5f

    div-float/2addr v2, v3

    const/high16 v3, 0x3f800000    # 1.0f

    sub-float/2addr v2, v3

    const/4 v3, 0x0

    cmpg-float v4, v3, v2

    if-gtz v4, :cond_0

    const v4, 0x3c23d70a    # 0.01f

    cmpg-float v4, v2, v4

    if-gtz v4, :cond_0

    goto :goto_2

    :cond_0
    cmpg-float v2, v2, v3

    if-gez v2, :cond_1

    move v10, v9

    goto :goto_1

    :cond_1
    move v1, v9

    :goto_1
    add-float v2, v10, v1

    const/high16 v3, 0x40000000    # 2.0f

    div-float v9, v2, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_2
    return v9
.end method

.method public static final b(JJ)F
    .locals 0

    invoke-static {p0, p1}, Lm0/x0;->i(J)F

    move-result p0

    const p1, 0x3d4ccccd    # 0.05f

    add-float/2addr p0, p1

    invoke-static {p2, p3}, Lm0/x0;->i(J)F

    move-result p2

    add-float/2addr p2, p1

    invoke-static {p0, p2}, Ljava/lang/Math;->max(FF)F

    move-result p1

    invoke-static {p0, p2}, Ljava/lang/Math;->min(FF)F

    move-result p0

    div-float/2addr p1, p0

    return p1
.end method

.method private static final c(JFJJ)F
    .locals 8

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-wide v0, p0

    move v2, p2

    invoke-static/range {v0 .. v7}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide p0

    invoke-static {p0, p1, p5, p6}, Lm0/x0;->g(JJ)J

    move-result-wide p0

    invoke-static {p3, p4, p0, p1}, Lm0/x0;->g(JJ)J

    move-result-wide p2

    invoke-static {p2, p3, p0, p1}, LN/e0;->b(JJ)F

    move-result p0

    return p0
.end method

.method public static final d(JJJ)J
    .locals 8

    const v2, 0x3ecccccd    # 0.4f

    move-wide v0, p0

    move-wide v3, p2

    move-wide v5, p4

    invoke-static/range {v0 .. v6}, LN/e0;->c(JFJJ)F

    move-result v0

    const v3, 0x3e4ccccd    # 0.2f

    move-wide v1, p0

    move-wide v4, p2

    move-wide v6, p4

    invoke-static/range {v1 .. v7}, LN/e0;->c(JFJJ)F

    move-result v1

    const/high16 v2, 0x40900000    # 4.5f

    cmpl-float v0, v0, v2

    if-ltz v0, :cond_0

    const p2, 0x3ecccccd    # 0.4f

    :goto_0
    move v2, p2

    goto :goto_1

    :cond_0
    cmpg-float v0, v1, v2

    if-gez v0, :cond_1

    const p2, 0x3e4ccccd    # 0.2f

    goto :goto_0

    :cond_1
    invoke-static/range {p0 .. p5}, LN/e0;->a(JJJ)F

    move-result p2

    goto :goto_0

    :goto_1
    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-wide v0, p0

    invoke-static/range {v0 .. v7}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final e(LN/m;LT/l;I)LM/K;
    .locals 18

    move-object/from16 v0, p1

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.rememberTextSelectionColors (MaterialTextSelectionColors.kt:35)"

    const v3, -0x2b0437ad

    move/from16 v4, p2

    invoke-static {v3, v4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-virtual/range {p0 .. p0}, LN/m;->j()J

    move-result-wide v4

    invoke-virtual/range {p0 .. p0}, LN/m;->c()J

    move-result-wide v8

    const v1, 0x41bad058

    invoke-interface {v0, v1}, LT/l;->U(I)V

    move-object/from16 v1, p0

    invoke-static {v1, v8, v9}, LN/n;->a(LN/m;J)J

    move-result-wide v2

    const-wide/16 v6, 0x10

    cmp-long v6, v2, v6

    if-eqz v6, :cond_1

    :goto_0
    move-wide v10, v2

    goto :goto_1

    :cond_1
    invoke-static {}, LN/t;->a()LT/H0;

    move-result-object v2

    invoke-interface {v0, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm0/v0;

    invoke-virtual {v2}, Lm0/v0;->u()J

    move-result-wide v2

    goto :goto_0

    :goto_1
    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    sget-object v2, LN/r;->a:LN/r;

    const/4 v3, 0x6

    invoke-virtual {v2, v0, v3}, LN/r;->d(LT/l;I)F

    move-result v12

    const/16 v16, 0xe

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v10 .. v17}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v6

    invoke-interface {v0, v4, v5}, LT/l;->j(J)Z

    move-result v2

    invoke-interface {v0, v8, v9}, LT/l;->j(J)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-interface {v0, v6, v7}, LT/l;->j(J)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_2

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_3

    :cond_2
    new-instance v3, LM/K;

    invoke-virtual/range {p0 .. p0}, LN/m;->j()J

    move-result-wide v11

    invoke-static/range {v4 .. v9}, LN/e0;->d(JJJ)J

    move-result-wide v13

    const/4 v15, 0x0

    move-object v10, v3

    invoke-direct/range {v10 .. v15}, LM/K;-><init>(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    check-cast v3, LM/K;

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    return-object v3
.end method
