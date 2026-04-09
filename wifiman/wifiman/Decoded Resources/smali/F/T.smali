.class public abstract LF/T;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(F)I
    .locals 2

    float-to-double v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-float p0, v0

    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    move-result p0

    return p0
.end method

.method public static final b(LF/S;LL0/d;LL0/U;LY0/d;LQ0/k$b;ZIIILjava/util/List;)LF/S;
    .locals 12

    invoke-virtual {p0}, LF/S;->k()LL0/d;

    move-result-object v0

    move-object v2, p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p0}, LF/S;->j()LL0/U;

    move-result-object v0

    move-object v3, p2

    invoke-static {v0, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p0}, LF/S;->i()Z

    move-result v0

    move/from16 v6, p5

    if-ne v0, v6, :cond_6

    invoke-virtual {p0}, LF/S;->g()I

    move-result v0

    move/from16 v7, p6

    invoke-static {v0, v7}, LW0/t;->e(II)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, LF/S;->d()I

    move-result v0

    move/from16 v4, p7

    if-ne v0, v4, :cond_4

    invoke-virtual {p0}, LF/S;->e()I

    move-result v0

    move/from16 v5, p8

    if-ne v0, v5, :cond_3

    invoke-virtual {p0}, LF/S;->a()LY0/d;

    move-result-object v0

    move-object v8, p3

    invoke-static {v0, p3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, LF/S;->h()Ljava/util/List;

    move-result-object v0

    move-object/from16 v10, p9

    invoke-static {v0, v10}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LF/S;->b()LQ0/k$b;

    move-result-object v0

    move-object/from16 v9, p4

    if-eq v0, v9, :cond_0

    goto :goto_6

    :cond_0
    move-object v0, p0

    goto :goto_7

    :cond_1
    move-object/from16 v9, p4

    goto :goto_6

    :cond_2
    :goto_0
    move-object/from16 v9, p4

    :goto_1
    move-object/from16 v10, p9

    goto :goto_6

    :cond_3
    move-object v8, p3

    goto :goto_0

    :cond_4
    move-object v8, p3

    move-object/from16 v9, p4

    :goto_2
    move/from16 v5, p8

    goto :goto_1

    :cond_5
    move-object v8, p3

    move-object/from16 v9, p4

    :goto_3
    move/from16 v4, p7

    goto :goto_2

    :cond_6
    move-object v8, p3

    move-object/from16 v9, p4

    :goto_4
    move/from16 v7, p6

    goto :goto_3

    :cond_7
    :goto_5
    move-object v8, p3

    move-object/from16 v9, p4

    move/from16 v6, p5

    goto :goto_4

    :cond_8
    move-object v3, p2

    goto :goto_5

    :goto_6
    new-instance v0, LF/S;

    const/4 v11, 0x0

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move/from16 v4, p7

    move/from16 v5, p8

    move/from16 v6, p5

    move/from16 v7, p6

    move-object v8, p3

    move-object/from16 v9, p4

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v11}, LF/S;-><init>(LL0/d;LL0/U;IIZILY0/d;LQ0/k$b;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_7
    return-object v0
.end method

.method public static synthetic c(LF/S;LL0/d;LL0/U;LY0/d;LQ0/k$b;ZIIILjava/util/List;ILjava/lang/Object;)LF/S;
    .locals 13

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x20

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v8, v2

    goto :goto_0

    :cond_0
    move/from16 v8, p5

    :goto_0
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_1

    sget-object v1, LW0/t;->a:LW0/t$a;

    invoke-virtual {v1}, LW0/t$a;->a()I

    move-result v1

    move v9, v1

    goto :goto_1

    :cond_1
    move/from16 v9, p6

    :goto_1
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_2

    const v1, 0x7fffffff

    move v10, v1

    goto :goto_2

    :cond_2
    move/from16 v10, p7

    :goto_2
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_3

    move v11, v2

    goto :goto_3

    :cond_3
    move/from16 v11, p8

    :goto_3
    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v12, p9

    invoke-static/range {v3 .. v12}, LF/T;->b(LF/S;LL0/d;LL0/U;LY0/d;LQ0/k$b;ZIIILjava/util/List;)LF/S;

    move-result-object v0

    return-object v0
.end method
