.class public abstract LU0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LT0/g;LL0/D;Lmh/r;LY0/d;Z)LL0/D;
    .locals 6

    invoke-virtual {p1}, LL0/D;->k()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/v;->g(J)J

    move-result-wide v0

    sget-object v2, LY0/x;->b:LY0/x$a;

    invoke-virtual {v2}, LY0/x$a;->b()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, LY0/x;->g(JJ)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p1}, LL0/D;->k()J

    move-result-wide v0

    invoke-interface {p3, v0, v1}, LY0/d;->N1(J)F

    move-result v0

    invoke-virtual {p0, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, LY0/x$a;->a()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, LY0/x;->g(JJ)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/graphics/Paint;->getTextSize()F

    move-result v0

    invoke-virtual {p1}, LL0/D;->k()J

    move-result-wide v3

    invoke-static {v3, v4}, LY0/v;->h(J)F

    move-result v1

    mul-float/2addr v0, v1

    invoke-virtual {p0, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    :cond_1
    :goto_0
    invoke-static {p1}, LU0/d;->d(LL0/D;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, LL0/D;->i()LQ0/k;

    move-result-object v0

    invoke-virtual {p1}, LL0/D;->n()LQ0/A;

    move-result-object v1

    if-nez v1, :cond_2

    sget-object v1, LQ0/A;->b:LQ0/A$a;

    invoke-virtual {v1}, LQ0/A$a;->e()LQ0/A;

    move-result-object v1

    :cond_2
    invoke-virtual {p1}, LL0/D;->l()LQ0/v;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3}, LQ0/v;->i()I

    move-result v3

    goto :goto_1

    :cond_3
    sget-object v3, LQ0/v;->b:LQ0/v$a;

    invoke-virtual {v3}, LQ0/v$a;->b()I

    move-result v3

    :goto_1
    invoke-static {v3}, LQ0/v;->c(I)LQ0/v;

    move-result-object v3

    invoke-virtual {p1}, LL0/D;->m()LQ0/w;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v4}, LQ0/w;->m()I

    move-result v4

    goto :goto_2

    :cond_4
    sget-object v4, LQ0/w;->b:LQ0/w$a;

    invoke-virtual {v4}, LQ0/w$a;->a()I

    move-result v4

    :goto_2
    invoke-static {v4}, LQ0/w;->e(I)LQ0/w;

    move-result-object v4

    invoke-interface {p2, v0, v1, v3, v4}, Lmh/r;->y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/graphics/Typeface;

    invoke-virtual {p0, p2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    :cond_5
    invoke-virtual {p1}, LL0/D;->p()LS0/e;

    move-result-object p2

    if-eqz p2, :cond_6

    invoke-virtual {p1}, LL0/D;->p()LS0/e;

    move-result-object p2

    sget-object v0, LS0/e;->c:LS0/e$a;

    invoke-virtual {v0}, LS0/e$a;->a()LS0/e;

    move-result-object v0

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_6

    sget-object p2, LU0/a;->a:LU0/a;

    invoke-virtual {p1}, LL0/D;->p()LS0/e;

    move-result-object v0

    invoke-virtual {p2, p0, v0}, LU0/a;->b(LT0/g;LS0/e;)V

    :cond_6
    invoke-virtual {p1}, LL0/D;->j()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_7

    invoke-virtual {p1}, LL0/D;->j()Ljava/lang/String;

    move-result-object p2

    const-string v0, ""

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_7

    invoke-virtual {p1}, LL0/D;->j()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    :cond_7
    invoke-virtual {p1}, LL0/D;->u()LW0/o;

    move-result-object p2

    if-eqz p2, :cond_8

    invoke-virtual {p1}, LL0/D;->u()LW0/o;

    move-result-object p2

    sget-object v0, LW0/o;->c:LW0/o$a;

    invoke-virtual {v0}, LW0/o$a;->a()LW0/o;

    move-result-object v0

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_8

    invoke-virtual {p0}, Landroid/graphics/Paint;->getTextScaleX()F

    move-result p2

    invoke-virtual {p1}, LL0/D;->u()LW0/o;

    move-result-object v0

    invoke-virtual {v0}, LW0/o;->b()F

    move-result v0

    mul-float/2addr p2, v0

    invoke-virtual {p0, p2}, Landroid/graphics/Paint;->setTextScaleX(F)V

    invoke-virtual {p0}, Landroid/graphics/Paint;->getTextSkewX()F

    move-result p2

    invoke-virtual {p1}, LL0/D;->u()LW0/o;

    move-result-object v0

    invoke-virtual {v0}, LW0/o;->c()F

    move-result v0

    add-float/2addr p2, v0

    invoke-virtual {p0, p2}, Landroid/graphics/Paint;->setTextSkewX(F)V

    :cond_8
    invoke-virtual {p1}, LL0/D;->g()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LT0/g;->f(J)V

    invoke-virtual {p1}, LL0/D;->f()Lm0/l0;

    move-result-object p2

    sget-object v0, Ll0/m;->b:Ll0/m$a;

    invoke-virtual {v0}, Ll0/m$a;->a()J

    move-result-wide v0

    invoke-virtual {p1}, LL0/D;->c()F

    move-result v3

    invoke-virtual {p0, p2, v0, v1, v3}, LT0/g;->e(Lm0/l0;JF)V

    invoke-virtual {p1}, LL0/D;->r()Lm0/g1;

    move-result-object p2

    invoke-virtual {p0, p2}, LT0/g;->h(Lm0/g1;)V

    invoke-virtual {p1}, LL0/D;->s()LW0/k;

    move-result-object p2

    invoke-virtual {p0, p2}, LT0/g;->i(LW0/k;)V

    invoke-virtual {p1}, LL0/D;->h()Lo0/g;

    move-result-object p2

    invoke-virtual {p0, p2}, LT0/g;->g(Lo0/g;)V

    invoke-virtual {p1}, LL0/D;->o()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/v;->g(J)J

    move-result-wide v0

    invoke-virtual {v2}, LY0/x$a;->b()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, LY0/x;->g(JJ)Z

    move-result p2

    if-eqz p2, :cond_b

    invoke-virtual {p1}, LL0/D;->o()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/v;->h(J)F

    move-result p2

    const/4 v0, 0x0

    cmpg-float p2, p2, v0

    if-nez p2, :cond_9

    goto :goto_3

    :cond_9
    invoke-virtual {p0}, Landroid/graphics/Paint;->getTextSize()F

    move-result p2

    invoke-virtual {p0}, Landroid/graphics/Paint;->getTextScaleX()F

    move-result v1

    mul-float/2addr p2, v1

    invoke-virtual {p1}, LL0/D;->o()J

    move-result-wide v1

    invoke-interface {p3, v1, v2}, LY0/d;->N1(J)F

    move-result p3

    cmpg-float v0, p2, v0

    if-nez v0, :cond_a

    goto :goto_4

    :cond_a
    div-float/2addr p3, p2

    invoke-virtual {p0, p3}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    goto :goto_4

    :cond_b
    :goto_3
    invoke-virtual {p1}, LL0/D;->o()J

    move-result-wide p2

    invoke-static {p2, p3}, LY0/v;->g(J)J

    move-result-wide p2

    invoke-virtual {v2}, LY0/x$a;->a()J

    move-result-wide v0

    invoke-static {p2, p3, v0, v1}, LY0/x;->g(JJ)Z

    move-result p2

    if-eqz p2, :cond_c

    invoke-virtual {p1}, LL0/D;->o()J

    move-result-wide p2

    invoke-static {p2, p3}, LY0/v;->h(J)F

    move-result p2

    invoke-virtual {p0, p2}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    :cond_c
    :goto_4
    invoke-virtual {p1}, LL0/D;->o()J

    move-result-wide v0

    invoke-virtual {p1}, LL0/D;->d()J

    move-result-wide v3

    invoke-virtual {p1}, LL0/D;->e()LW0/a;

    move-result-object v5

    move v2, p4

    invoke-static/range {v0 .. v5}, LU0/d;->c(JZJLW0/a;)LL0/D;

    move-result-object p0

    return-object p0
.end method

.method public static final b(F)F
    .locals 1

    const/4 v0, 0x0

    cmpg-float v0, p0, v0

    if-nez v0, :cond_0

    const/4 p0, 0x1

    :cond_0
    return p0
.end method

.method private static final c(JZJLW0/a;)LL0/D;
    .locals 32

    move-wide/from16 v0, p3

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz p2, :cond_1

    invoke-static/range {p0 .. p1}, LY0/v;->g(J)J

    move-result-wide v4

    sget-object v6, LY0/x;->b:LY0/x$a;

    invoke-virtual {v6}, LY0/x$a;->b()J

    move-result-wide v6

    invoke-static {v4, v5, v6, v7}, LY0/x;->g(JJ)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-static/range {p0 .. p1}, LY0/v;->h(J)F

    move-result v4

    const/4 v5, 0x0

    cmpg-float v4, v4, v5

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    move v4, v3

    goto :goto_1

    :cond_1
    :goto_0
    move v4, v2

    :goto_1
    sget-object v5, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v5}, Lm0/v0$a;->e()J

    move-result-wide v6

    invoke-static {v0, v1, v6, v7}, Lm0/v0;->m(JJ)Z

    move-result v6

    if-nez v6, :cond_2

    invoke-virtual {v5}, Lm0/v0$a;->d()J

    move-result-wide v6

    invoke-static {v0, v1, v6, v7}, Lm0/v0;->m(JJ)Z

    move-result v6

    if-nez v6, :cond_2

    move v6, v3

    goto :goto_2

    :cond_2
    move v6, v2

    :goto_2
    if-eqz p5, :cond_3

    sget-object v7, LW0/a;->b:LW0/a$a;

    invoke-virtual {v7}, LW0/a$a;->a()F

    move-result v7

    invoke-virtual/range {p5 .. p5}, LW0/a;->h()F

    move-result v8

    invoke-static {v8, v7}, LW0/a;->e(FF)Z

    move-result v7

    if-nez v7, :cond_3

    move v2, v3

    :cond_3
    const/4 v3, 0x0

    if-nez v4, :cond_4

    if-nez v6, :cond_4

    if-nez v2, :cond_4

    goto :goto_7

    :cond_4
    if-eqz v4, :cond_5

    move-wide/from16 v19, p0

    goto :goto_3

    :cond_5
    sget-object v4, LY0/v;->b:LY0/v$a;

    invoke-virtual {v4}, LY0/v$a;->a()J

    move-result-wide v7

    move-wide/from16 v19, v7

    :goto_3
    if-eqz v6, :cond_6

    :goto_4
    move-wide/from16 v24, v0

    goto :goto_5

    :cond_6
    invoke-virtual {v5}, Lm0/v0$a;->e()J

    move-result-wide v0

    goto :goto_4

    :goto_5
    if-eqz v2, :cond_7

    move-object/from16 v21, p5

    goto :goto_6

    :cond_7
    move-object/from16 v21, v3

    :goto_6
    new-instance v3, LL0/D;

    move-object v9, v3

    const v30, 0xf67f

    const/16 v31, 0x0

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-direct/range {v9 .. v31}, LL0/D;-><init>(JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;LL0/A;Lo0/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_7
    return-object v3
.end method

.method public static final d(LL0/D;)Z
    .locals 1

    invoke-virtual {p0}, LL0/D;->i()LQ0/k;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, LL0/D;->l()LQ0/v;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, LL0/D;->n()LQ0/A;

    move-result-object p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static final e(LT0/g;LW0/s;)V
    .locals 3

    if-nez p1, :cond_0

    sget-object p1, LW0/s;->c:LW0/s$a;

    invoke-virtual {p1}, LW0/s$a;->a()LW0/s;

    move-result-object p1

    :cond_0
    invoke-virtual {p1}, LW0/s;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/graphics/Paint;->getFlags()I

    move-result v0

    or-int/lit16 v0, v0, 0x80

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroid/graphics/Paint;->getFlags()I

    move-result v0

    and-int/lit16 v0, v0, -0x81

    :goto_0
    invoke-virtual {p0, v0}, Landroid/graphics/Paint;->setFlags(I)V

    invoke-virtual {p1}, LW0/s;->b()I

    move-result p1

    sget-object v0, LW0/s$b;->a:LW0/s$b$a;

    invoke-virtual {v0}, LW0/s$b$a;->b()I

    move-result v1

    invoke-static {p1, v1}, LW0/s$b;->e(II)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Landroid/graphics/Paint;->getFlags()I

    move-result p1

    or-int/lit8 p1, p1, 0x40

    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setFlags(I)V

    invoke-virtual {p0, v2}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, LW0/s$b$a;->a()I

    move-result v1

    invoke-static {p1, v1}, LW0/s$b;->e(II)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Landroid/graphics/Paint;->getFlags()I

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, LW0/s$b$a;->c()I

    move-result v0

    invoke-static {p1, v0}, LW0/s$b;->e(II)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Landroid/graphics/Paint;->getFlags()I

    invoke-virtual {p0, v2}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Landroid/graphics/Paint;->getFlags()I

    :goto_1
    return-void
.end method
