.class public abstract LN/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/compose/ui/e;Lm0/i1;JJLs/g;FLmh/p;LT/l;II)V
    .locals 13

    move-object/from16 v9, p9

    move/from16 v0, p10

    and-int/lit8 v1, p11, 0x1

    if-eqz v1, :cond_0

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_0

    :cond_0
    move-object v1, p0

    :goto_0
    and-int/lit8 v2, p11, 0x2

    const/4 v3, 0x6

    if-eqz v2, :cond_1

    sget-object v2, LN/f0;->a:LN/f0;

    invoke-virtual {v2, v9, v3}, LN/f0;->b(LT/l;I)LN/F0;

    move-result-object v2

    invoke-virtual {v2}, LN/F0;->b()LE/a;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, p1

    :goto_1
    and-int/lit8 v4, p11, 0x4

    if-eqz v4, :cond_2

    sget-object v4, LN/f0;->a:LN/f0;

    invoke-virtual {v4, v9, v3}, LN/f0;->a(LT/l;I)LN/m;

    move-result-object v3

    invoke-virtual {v3}, LN/m;->n()J

    move-result-wide v3

    goto :goto_2

    :cond_2
    move-wide v3, p2

    :goto_2
    and-int/lit8 v5, p11, 0x8

    if-eqz v5, :cond_3

    shr-int/lit8 v5, v0, 0x6

    and-int/lit8 v5, v5, 0xe

    invoke-static {v3, v4, v9, v5}, LN/n;->b(JLT/l;I)J

    move-result-wide v5

    goto :goto_3

    :cond_3
    move-wide/from16 v5, p4

    :goto_3
    and-int/lit8 v7, p11, 0x10

    if-eqz v7, :cond_4

    const/4 v7, 0x0

    goto :goto_4

    :cond_4
    move-object/from16 v7, p6

    :goto_4
    and-int/lit8 v8, p11, 0x20

    if-eqz v8, :cond_5

    const/4 v8, 0x1

    int-to-float v8, v8

    invoke-static {v8}, LY0/h;->j(F)F

    move-result v8

    goto :goto_5

    :cond_5
    move/from16 v8, p7

    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v10

    if-eqz v10, :cond_6

    const/4 v10, -0x1

    const-string v11, "androidx.compose.material.Card (Card.kt:62)"

    const v12, 0x74a1b8b8

    invoke-static {v12, v0, v10, v11}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    const v10, 0x3ffffe

    and-int/2addr v10, v0

    const/4 v11, 0x0

    move-object v0, v1

    move-object v1, v2

    move-wide v2, v3

    move-wide v4, v5

    move-object v6, v7

    move v7, v8

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    invoke-static/range {v0 .. v11}, LN/O0;->a(Landroidx/compose/ui/e;Lm0/i1;JJLs/g;FLmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    return-void
.end method
