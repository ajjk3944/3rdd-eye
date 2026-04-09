.class public abstract LP5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(JFLm0/i1;Lr6/b;Lw6/b;FJLT/l;II)Lo6/b;
    .locals 15

    move/from16 v0, p10

    const v1, -0x7edf10dd

    move-object/from16 v14, p9

    invoke-interface {v14, v1}, LT/l;->e(I)V

    and-int/lit8 v2, p11, 0x1

    if-eqz v2, :cond_0

    sget-object v2, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v2}, Lm0/v0$a;->a()J

    move-result-wide v2

    goto :goto_0

    :cond_0
    move-wide v2, p0

    :goto_0
    and-int/lit8 v4, p11, 0x2

    if-eqz v4, :cond_1

    const/high16 v4, 0x41000000    # 8.0f

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    goto :goto_1

    :cond_1
    move/from16 v4, p2

    :goto_1
    and-int/lit8 v5, p11, 0x4

    if-eqz v5, :cond_2

    invoke-static {}, Lm0/c1;->a()Lm0/i1;

    move-result-object v5

    goto :goto_2

    :cond_2
    move-object/from16 v5, p3

    :goto_2
    and-int/lit8 v6, p11, 0x8

    if-eqz v6, :cond_3

    const/4 v6, 0x0

    goto :goto_3

    :cond_3
    move-object/from16 v6, p4

    :goto_3
    and-int/lit8 v7, p11, 0x10

    if-eqz v7, :cond_4

    invoke-static {}, Lw6/d;->a()Lw6/c;

    move-result-object v7

    goto :goto_4

    :cond_4
    move-object/from16 v7, p5

    :goto_4
    and-int/lit8 v8, p11, 0x20

    if-eqz v8, :cond_5

    const/4 v8, 0x0

    int-to-float v8, v8

    invoke-static {v8}, LY0/h;->j(F)F

    move-result v8

    goto :goto_5

    :cond_5
    move/from16 v8, p6

    :goto_5
    and-int/lit8 v9, p11, 0x40

    if-eqz v9, :cond_6

    sget-object v9, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v9}, Lm0/v0$a;->d()J

    move-result-wide v9

    goto :goto_6

    :cond_6
    move-wide/from16 v9, p7

    :goto_6
    invoke-static {}, LT/o;->H()Z

    move-result v11

    if-eqz v11, :cond_7

    const/4 v11, -0x1

    const-string/jumbo v12, "com.patrykandpatrick.vico.compose.component.lineComponent (Components.kt:87)"

    invoke-static {v1, v0, v11, v12}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_7
    invoke-static {v5}, LQ5/a;->b(Lm0/i1;)Lo6/c;

    move-result-object v5

    and-int/lit8 v1, v0, 0xe

    const v11, 0x9200

    or-int/2addr v1, v11

    and-int/lit8 v11, v0, 0x70

    or-int/2addr v1, v11

    const/high16 v11, 0x70000

    and-int/2addr v11, v0

    or-int/2addr v1, v11

    const/high16 v11, 0x380000

    and-int/2addr v0, v11

    or-int v12, v1, v0

    const/4 v13, 0x0

    move-object/from16 v11, p9

    invoke-static/range {v2 .. v13}, LP5/a;->b(JFLo6/c;Lr6/b;Lw6/b;FJLT/l;II)Lo6/b;

    move-result-object v0

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    invoke-interface/range {p9 .. p9}, LT/l;->P()V

    return-object v0
.end method

.method public static final b(JFLo6/c;Lr6/b;Lw6/b;FJLT/l;II)Lo6/b;
    .locals 18

    move-object/from16 v0, p9

    const-string/jumbo v1, "shape"

    move-object/from16 v9, p3

    invoke-static {v9, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, -0x7edf10dd

    invoke-interface {v0, v1}, LT/l;->e(I)V

    and-int/lit8 v2, p11, 0x1

    if-eqz v2, :cond_0

    sget-object v2, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v2}, Lm0/v0$a;->a()J

    move-result-wide v2

    move-wide v10, v2

    goto :goto_0

    :cond_0
    move-wide/from16 v10, p0

    :goto_0
    and-int/lit8 v2, p11, 0x8

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    move-object v12, v2

    goto :goto_1

    :cond_1
    move-object/from16 v12, p4

    :goto_1
    and-int/lit8 v2, p11, 0x10

    if-eqz v2, :cond_2

    invoke-static {}, Lw6/d;->a()Lw6/c;

    move-result-object v2

    move-object v13, v2

    goto :goto_2

    :cond_2
    move-object/from16 v13, p5

    :goto_2
    and-int/lit8 v2, p11, 0x20

    const/4 v14, 0x0

    if-eqz v2, :cond_3

    int-to-float v2, v14

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    move v15, v2

    goto :goto_3

    :cond_3
    move/from16 v15, p6

    :goto_3
    and-int/lit8 v2, p11, 0x40

    if-eqz v2, :cond_4

    sget-object v2, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v2}, Lm0/v0$a;->d()J

    move-result-wide v2

    move-wide/from16 v16, v2

    goto :goto_4

    :cond_4
    move-wide/from16 v16, p7

    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_5

    const/4 v2, -0x1

    const-string/jumbo v3, "com.patrykandpatrick.vico.compose.component.lineComponent (Components.kt:55)"

    move/from16 v4, p10

    invoke-static {v1, v4, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_5
    invoke-static {v10, v11}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v2

    invoke-static/range {p2 .. p2}, LY0/h;->d(F)LY0/h;

    move-result-object v3

    invoke-static {v15}, LY0/h;->d(F)LY0/h;

    move-result-object v7

    invoke-static/range {v16 .. v17}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v8

    move-object/from16 v4, p3

    move-object v5, v12

    move-object v6, v13

    filled-new-array/range {v2 .. v8}, [Ljava/lang/Object;

    move-result-object v1

    const v2, -0x21de6e89

    invoke-interface {v0, v2}, LT/l;->e(I)V

    move v2, v14

    :goto_5
    const/4 v3, 0x7

    if-ge v14, v3, :cond_6

    aget-object v3, v1, v14

    invoke-interface {v0, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    add-int/lit8 v14, v14, 0x1

    goto :goto_5

    :cond_6
    invoke-interface/range {p9 .. p9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez v2, :cond_7

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_8

    :cond_7
    new-instance v1, Lo6/b;

    invoke-static {v10, v11}, Lm0/x0;->j(J)I

    move-result v3

    invoke-static/range {v16 .. v17}, Lm0/x0;->j(J)I

    move-result v10

    move-object v2, v1

    move/from16 v4, p2

    move-object/from16 v5, p3

    move-object v6, v12

    move-object v7, v13

    move v8, v15

    move v9, v10

    invoke-direct/range {v2 .. v9}, Lo6/b;-><init>(IFLo6/c;Lr6/b;Lw6/b;FI)V

    invoke-interface {v0, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    invoke-interface/range {p9 .. p9}, LT/l;->P()V

    check-cast v1, Lo6/b;

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    invoke-interface/range {p9 .. p9}, LT/l;->P()V

    return-object v1
.end method

.method public static final c(JJLo6/d;Landroid/text/TextUtils$TruncateAt;ILw6/c;Lw6/c;Landroid/graphics/Typeface;Landroid/graphics/Paint$Align;LT/l;II)Lt6/b;
    .locals 16

    move-object/from16 v0, p11

    move/from16 v1, p13

    const v2, -0x630c0ecd

    invoke-interface {v0, v2}, LT/l;->e(I)V

    and-int/lit8 v3, v1, 0x1

    if-eqz v3, :cond_0

    sget-object v3, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v3}, Lm0/v0$a;->a()J

    move-result-wide v3

    goto :goto_0

    :cond_0
    move-wide/from16 v3, p0

    :goto_0
    and-int/lit8 v5, v1, 0x2

    if-eqz v5, :cond_1

    const/high16 v5, 0x41400000    # 12.0f

    invoke-static {v5}, LY0/w;->f(F)J

    move-result-wide v5

    goto :goto_1

    :cond_1
    move-wide/from16 v5, p2

    :goto_1
    and-int/lit8 v7, v1, 0x4

    const/4 v8, 0x0

    if-eqz v7, :cond_2

    move-object v7, v8

    goto :goto_2

    :cond_2
    move-object/from16 v7, p4

    :goto_2
    and-int/lit8 v9, v1, 0x8

    if-eqz v9, :cond_3

    sget-object v9, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    goto :goto_3

    :cond_3
    move-object/from16 v9, p5

    :goto_3
    and-int/lit8 v10, v1, 0x10

    if-eqz v10, :cond_4

    const/4 v10, 0x1

    goto :goto_4

    :cond_4
    move/from16 v10, p6

    :goto_4
    and-int/lit8 v11, v1, 0x20

    if-eqz v11, :cond_5

    invoke-static {}, Lw6/d;->a()Lw6/c;

    move-result-object v11

    goto :goto_5

    :cond_5
    move-object/from16 v11, p7

    :goto_5
    and-int/lit8 v12, v1, 0x40

    if-eqz v12, :cond_6

    invoke-static {}, Lw6/d;->a()Lw6/c;

    move-result-object v12

    goto :goto_6

    :cond_6
    move-object/from16 v12, p8

    :goto_6
    and-int/lit16 v13, v1, 0x80

    if-eqz v13, :cond_7

    goto :goto_7

    :cond_7
    move-object/from16 v8, p9

    :goto_7
    and-int/lit16 v1, v1, 0x100

    if-eqz v1, :cond_8

    sget-object v1, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    goto :goto_8

    :cond_8
    move-object/from16 v1, p10

    :goto_8
    invoke-static {}, LT/o;->H()Z

    move-result v13

    if-eqz v13, :cond_9

    const/4 v13, -0x1

    const-string/jumbo v14, "com.patrykandpatrick.vico.compose.component.textComponent (Components.kt:245)"

    move/from16 v15, p12

    invoke-static {v2, v15, v13, v14}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_9
    invoke-static {v3, v4}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v2

    invoke-static {v5, v6}, LY0/v;->b(J)LY0/v;

    move-result-object v13

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    move-object/from16 p0, v2

    move-object/from16 p1, v13

    move-object/from16 p2, v7

    move-object/from16 p3, v9

    move-object/from16 p4, v14

    move-object/from16 p5, v11

    move-object/from16 p6, v12

    move-object/from16 p7, v8

    move-object/from16 p8, v1

    filled-new-array/range {p0 .. p8}, [Ljava/lang/Object;

    move-result-object v2

    const v13, -0x21de6e89

    invoke-interface {v0, v13}, LT/l;->e(I)V

    const/4 v13, 0x0

    move v14, v13

    :goto_9
    const/16 v15, 0x9

    if-ge v13, v15, :cond_a

    aget-object v15, v2, v13

    invoke-interface {v0, v15}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v14, v15

    add-int/lit8 v13, v13, 0x1

    goto :goto_9

    :cond_a
    invoke-interface/range {p11 .. p11}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v14, :cond_b

    sget-object v13, LT/l;->a:LT/l$a;

    invoke-virtual {v13}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v13

    if-ne v2, v13, :cond_c

    :cond_b
    new-instance v2, Lt6/b$a;

    invoke-direct {v2}, Lt6/b$a;-><init>()V

    invoke-static {v3, v4}, Lm0/x0;->j(J)I

    move-result v3

    invoke-virtual {v2, v3}, Lt6/b$a;->c(I)V

    invoke-static {v5, v6}, LT5/c;->a(J)F

    move-result v3

    invoke-virtual {v2, v3}, Lt6/b$a;->i(F)V

    invoke-virtual {v2, v9}, Lt6/b$a;->d(Landroid/text/TextUtils$TruncateAt;)V

    invoke-virtual {v2, v10}, Lt6/b$a;->e(I)V

    invoke-virtual {v2, v7}, Lt6/b$a;->b(Lm6/a;)V

    invoke-virtual {v2, v11}, Lt6/b$a;->g(Lw6/c;)V

    invoke-virtual {v2, v12}, Lt6/b$a;->f(Lw6/c;)V

    invoke-virtual {v2, v8}, Lt6/b$a;->j(Landroid/graphics/Typeface;)V

    invoke-virtual {v2, v1}, Lt6/b$a;->h(Landroid/graphics/Paint$Align;)V

    invoke-virtual {v2}, Lt6/b$a;->a()Lt6/b;

    move-result-object v2

    invoke-interface {v0, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_c
    invoke-interface/range {p11 .. p11}, LT/l;->P()V

    check-cast v2, Lt6/b;

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-static {}, LT/o;->P()V

    :cond_d
    invoke-interface/range {p11 .. p11}, LT/l;->P()V

    return-object v2
.end method
