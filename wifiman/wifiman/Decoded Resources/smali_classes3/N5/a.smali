.class public abstract LN5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/util/List;FLh6/a$b;Ljava/util/List;Ljava/util/Map;Lk6/a;LY5/c$b;LT/l;II)Lh6/a;
    .locals 15

    move-object/from16 v0, p7

    const v1, -0x787ca6d4

    invoke-interface {v0, v1}, LT/l;->e(I)V

    and-int/lit8 v2, p9, 0x1

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-static {v0, v3}, LW5/b;->a(LT/l;I)LW5/a;

    move-result-object v2

    invoke-virtual {v2}, LW5/a;->c()LW5/a$d;

    move-result-object v2

    invoke-virtual {v2}, LW5/a$d;->a()Ljava/util/List;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, p0

    :goto_0
    and-int/lit8 v4, p9, 0x2

    if-eqz v4, :cond_1

    invoke-static {v0, v3}, LW5/b;->a(LT/l;I)LW5/a;

    move-result-object v3

    invoke-virtual {v3}, LW5/a;->c()LW5/a$d;

    move-result-object v3

    invoke-virtual {v3}, LW5/a$d;->b()F

    move-result v3

    goto :goto_1

    :cond_1
    move/from16 v3, p1

    :goto_1
    and-int/lit8 v4, p9, 0x4

    if-eqz v4, :cond_2

    sget-object v4, Lh6/a$b;->Center:Lh6/a$b;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p2

    :goto_2
    and-int/lit8 v5, p9, 0x8

    const/4 v6, 0x0

    if-eqz v5, :cond_3

    move-object v5, v6

    goto :goto_3

    :cond_3
    move-object/from16 v5, p3

    :goto_3
    and-int/lit8 v7, p9, 0x10

    if-eqz v7, :cond_4

    move-object v7, v6

    goto :goto_4

    :cond_4
    move-object/from16 v7, p4

    :goto_4
    and-int/lit8 v8, p9, 0x20

    if-eqz v8, :cond_5

    move-object v8, v6

    goto :goto_5

    :cond_5
    move-object/from16 v8, p5

    :goto_5
    and-int/lit8 v9, p9, 0x40

    if-eqz v9, :cond_6

    goto :goto_6

    :cond_6
    move-object/from16 v6, p6

    :goto_6
    invoke-static {}, LT/o;->H()Z

    move-result v9

    if-eqz v9, :cond_7

    const/4 v9, -0x1

    const-string/jumbo v10, "com.patrykandpatrick.vico.compose.chart.line.lineChart (LineChart.kt:68)"

    move/from16 v11, p8

    invoke-static {v1, v11, v9, v10}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_7
    const v1, -0x1d58f75c

    invoke-interface {v0, v1}, LT/l;->e(I)V

    invoke-interface/range {p7 .. p7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    sget-object v9, LT/l;->a:LT/l$a;

    invoke-virtual {v9}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v9

    if-ne v1, v9, :cond_8

    new-instance v1, Lh6/a;

    const/16 v9, 0xf

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object p0, v1

    move-object/from16 p1, v11

    move/from16 p2, v12

    move-object/from16 p3, v13

    move-object/from16 p4, v14

    move/from16 p5, v9

    move-object/from16 p6, v10

    invoke-direct/range {p0 .. p6}, Lh6/a;-><init>(Ljava/util/List;FLY5/c$b;Lh6/a$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    invoke-interface/range {p7 .. p7}, LT/l;->P()V

    check-cast v1, Lh6/a;

    invoke-virtual {v1, v2}, Lh6/a;->M(Ljava/util/List;)V

    invoke-virtual {v1, v3}, Lh6/a;->O(F)V

    invoke-virtual {v1, v4}, Lh6/a;->N(Lh6/a$b;)V

    invoke-virtual {v1, v8}, Lb6/a;->y(Lk6/a;)V

    invoke-virtual {v1, v6}, Lh6/a;->P(LY5/c$b;)V

    if-eqz v5, :cond_9

    invoke-virtual {v1, v5}, Lb6/a;->z(Ljava/util/List;)V

    :cond_9
    if-eqz v7, :cond_a

    invoke-virtual {v1, v7}, Lb6/a;->A(Ljava/util/Map;)V

    :cond_a
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-static {}, LT/o;->P()V

    :cond_b
    invoke-interface/range {p7 .. p7}, LT/l;->P()V

    return-object v1
.end method
