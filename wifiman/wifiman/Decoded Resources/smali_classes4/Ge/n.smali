.class public abstract LGe/n;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Lmh/p;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LGe/n;->c(Landroidx/compose/ui/e;Lmh/p;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;Lmh/p;LT/l;I)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v13, p1

    move/from16 v14, p3

    const-string v1, "modifier"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "content"

    invoke-static {v13, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x6121c4ba

    move-object/from16 v2, p2

    invoke-interface {v2, v1}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v2, v14, 0x6

    if-nez v2, :cond_1

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v14

    goto :goto_1

    :cond_1
    move v2, v14

    :goto_1
    and-int/lit8 v3, v14, 0x30

    const/16 v4, 0x20

    if-nez v3, :cond_3

    invoke-interface {v15, v13}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    move v3, v4

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    and-int/lit8 v3, v2, 0x13

    const/16 v5, 0x12

    if-ne v3, v5, :cond_5

    invoke-interface {v15}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v15}, LT/l;->C()V

    goto/16 :goto_4

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_6

    const/4 v3, -0x1

    const-string v5, "com.ui.wifiman.ui.component.notification.InAppNotification (InAppNotification.kt:34)"

    invoke-static {v1, v2, v3, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    const/16 v1, 0x280

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    const/4 v3, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {v0, v6, v1, v3, v5}, Landroidx/compose/foundation/layout/r;->B(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v3, Lla/a;->a:Lla/a;

    sget v5, Lla/a;->b:I

    invoke-virtual {v3, v15, v5}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v6

    invoke-virtual {v6}, Lra/a;->a()Lra/b;

    move-result-object v6

    invoke-virtual {v6}, Lra/b;->a()Lra/b$a$a;

    move-result-object v6

    invoke-virtual {v6}, Lra/b$a$a;->c()F

    move-result v6

    invoke-virtual {v3, v15, v5}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v7

    invoke-virtual {v7}, Lra/a;->a()Lra/b;

    move-result-object v7

    invoke-virtual {v7}, Lra/b;->b()Lra/b$a$b;

    move-result-object v7

    invoke-virtual {v7}, Lra/b$a$b;->c()F

    move-result v7

    invoke-static {v1, v6, v7}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual {v3, v15, v5}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->e()Lma/a$e;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$e;->e()J

    move-result-wide v5

    const/4 v3, 0x5

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v8

    int-to-float v3, v4

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v3}, LE/h;->d(F)LE/g;

    move-result-object v3

    shl-int/lit8 v2, v2, 0xf

    const/high16 v4, 0x380000

    and-int/2addr v2, v4

    const/high16 v4, 0x30000

    or-int v11, v2, v4

    const/16 v12, 0x18

    const-wide/16 v9, 0x0

    const/4 v7, 0x0

    move-object v2, v3

    move-wide v3, v5

    move-wide v5, v9

    move-object/from16 v9, p1

    move-object v10, v15

    invoke-static/range {v1 .. v12}, LN/O0;->a(Landroidx/compose/ui/e;Lm0/i1;JJLs/g;FLmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    :goto_4
    invoke-interface {v15}, LT/l;->z()LT/X0;

    move-result-object v1

    if-eqz v1, :cond_8

    new-instance v2, LGe/m;

    invoke-direct {v2, v0, v13, v14}, LGe/m;-><init>(Landroidx/compose/ui/e;Lmh/p;I)V

    invoke-interface {v1, v2}, LT/X0;->a(Lmh/p;)V

    :cond_8
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;Lmh/p;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, LGe/n;->b(Landroidx/compose/ui/e;Lmh/p;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
