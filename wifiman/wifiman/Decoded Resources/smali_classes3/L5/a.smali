.class public abstract LL5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(JJLo6/d;Landroid/text/TextUtils$TruncateAt;IFFFFLandroid/graphics/Typeface;Landroid/graphics/Paint$Align;LT/l;III)Lt6/b;
    .locals 18

    move-object/from16 v14, p13

    move/from16 v0, p14

    move/from16 v1, p15

    move/from16 v2, p16

    const v3, -0x3b1a40d0

    invoke-interface {v14, v3}, LT/l;->e(I)V

    and-int/lit8 v4, v2, 0x1

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    invoke-static {v14, v5}, LW5/b;->a(LT/l;I)LW5/a;

    move-result-object v4

    invoke-virtual {v4}, LW5/a;->a()LW5/a$a;

    move-result-object v4

    invoke-virtual {v4}, LW5/a$a;->b()J

    move-result-wide v6

    goto :goto_0

    :cond_0
    move-wide/from16 v6, p0

    :goto_0
    and-int/lit8 v4, v2, 0x2

    if-eqz v4, :cond_1

    invoke-static {v14, v5}, LW5/b;->a(LT/l;I)LW5/a;

    move-result-object v4

    invoke-virtual {v4}, LW5/a;->a()LW5/a$a;

    move-result-object v4

    invoke-virtual {v4}, LW5/a$a;->g()J

    move-result-wide v8

    goto :goto_1

    :cond_1
    move-wide/from16 v8, p2

    :goto_1
    and-int/lit8 v4, v2, 0x4

    if-eqz v4, :cond_2

    invoke-static {v14, v5}, LW5/b;->a(LT/l;I)LW5/a;

    move-result-object v4

    invoke-virtual {v4}, LW5/a;->a()LW5/a$a;

    move-result-object v4

    invoke-virtual {v4}, LW5/a$a;->a()Lo6/d;

    move-result-object v4

    goto :goto_2

    :cond_2
    move-object/from16 v4, p4

    :goto_2
    and-int/lit8 v10, v2, 0x8

    if-eqz v10, :cond_3

    sget-object v10, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    goto :goto_3

    :cond_3
    move-object/from16 v10, p5

    :goto_3
    and-int/lit8 v11, v2, 0x10

    if-eqz v11, :cond_4

    invoke-static {v14, v5}, LW5/b;->a(LT/l;I)LW5/a;

    move-result-object v11

    invoke-virtual {v11}, LW5/a;->a()LW5/a$a;

    move-result-object v11

    invoke-virtual {v11}, LW5/a$a;->e()I

    move-result v11

    goto :goto_4

    :cond_4
    move/from16 v11, p6

    :goto_4
    and-int/lit8 v12, v2, 0x20

    if-eqz v12, :cond_5

    invoke-static {v14, v5}, LW5/b;->a(LT/l;I)LW5/a;

    move-result-object v12

    invoke-virtual {v12}, LW5/a;->a()LW5/a$a;

    move-result-object v12

    invoke-virtual {v12}, LW5/a$a;->j()F

    move-result v12

    goto :goto_5

    :cond_5
    move/from16 v12, p7

    :goto_5
    and-int/lit8 v13, v2, 0x40

    if-eqz v13, :cond_6

    invoke-static {v14, v5}, LW5/b;->a(LT/l;I)LW5/a;

    move-result-object v13

    invoke-virtual {v13}, LW5/a;->a()LW5/a$a;

    move-result-object v13

    invoke-virtual {v13}, LW5/a$a;->d()F

    move-result v13

    goto :goto_6

    :cond_6
    move/from16 v13, p8

    :goto_6
    and-int/lit16 v15, v2, 0x80

    if-eqz v15, :cond_7

    invoke-static {v14, v5}, LW5/b;->a(LT/l;I)LW5/a;

    move-result-object v15

    invoke-virtual {v15}, LW5/a;->a()LW5/a$a;

    move-result-object v15

    invoke-virtual {v15}, LW5/a$a;->i()F

    move-result v15

    goto :goto_7

    :cond_7
    move/from16 v15, p9

    :goto_7
    and-int/lit16 v3, v2, 0x100

    if-eqz v3, :cond_8

    invoke-static {v14, v5}, LW5/b;->a(LT/l;I)LW5/a;

    move-result-object v3

    invoke-virtual {v3}, LW5/a;->a()LW5/a$a;

    move-result-object v3

    invoke-virtual {v3}, LW5/a$a;->c()F

    move-result v3

    goto :goto_8

    :cond_8
    move/from16 v3, p10

    :goto_8
    move/from16 p0, v11

    and-int/lit16 v11, v2, 0x200

    if-eqz v11, :cond_9

    invoke-static {v14, v5}, LW5/b;->a(LT/l;I)LW5/a;

    move-result-object v11

    invoke-virtual {v11}, LW5/a;->a()LW5/a$a;

    move-result-object v11

    invoke-virtual {v11}, LW5/a$a;->h()Landroid/graphics/Typeface;

    move-result-object v11

    goto :goto_9

    :cond_9
    move-object/from16 v11, p11

    :goto_9
    and-int/lit16 v2, v2, 0x400

    if-eqz v2, :cond_a

    invoke-static {v14, v5}, LW5/b;->a(LT/l;I)LW5/a;

    move-result-object v2

    invoke-virtual {v2}, LW5/a;->a()LW5/a$a;

    move-result-object v2

    invoke-virtual {v2}, LW5/a$a;->f()Landroid/graphics/Paint$Align;

    move-result-object v2

    move-object/from16 v17, v2

    goto :goto_a

    :cond_a
    move-object/from16 v17, p12

    :goto_a
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_b

    const-string/jumbo v2, "com.patrykandpatrick.vico.compose.axis.axisLabelComponent (AxisComponents.kt:60)"

    const v5, -0x3b1a40d0

    invoke-static {v5, v0, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_b
    invoke-static {v13, v12}, LS5/a;->a(FF)Lw6/c;

    move-result-object v12

    invoke-static {v3, v15}, LS5/a;->a(FF)Lw6/c;

    move-result-object v13

    and-int/lit8 v2, v0, 0xe

    const v3, 0x1240200

    or-int/2addr v2, v3

    and-int/lit8 v3, v0, 0x70

    or-int/2addr v2, v3

    and-int/lit16 v3, v0, 0x1c00

    or-int/2addr v2, v3

    const v3, 0xe000

    and-int/2addr v0, v3

    or-int/2addr v0, v2

    shl-int/lit8 v1, v1, 0x18

    const/high16 v2, 0xe000000

    and-int/2addr v1, v2

    or-int v15, v0, v1

    const/16 v16, 0x0

    move-wide v0, v6

    move-wide v2, v8

    move-object v5, v10

    move/from16 v6, p0

    move-object v7, v12

    move-object v8, v13

    move-object v9, v11

    move-object/from16 v10, v17

    move-object/from16 v11, p13

    move v12, v15

    move/from16 v13, v16

    invoke-static/range {v0 .. v13}, LP5/a;->c(JJLo6/d;Landroid/text/TextUtils$TruncateAt;ILw6/c;Lw6/c;Landroid/graphics/Typeface;Landroid/graphics/Paint$Align;LT/l;II)Lt6/b;

    move-result-object v0

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-static {}, LT/o;->P()V

    :cond_c
    invoke-interface/range {p13 .. p13}, LT/l;->P()V

    return-object v0
.end method
