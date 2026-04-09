.class public abstract LFe/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Lmh/p;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, LFe/e;->c(Landroidx/compose/ui/e;Lmh/p;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;Lmh/p;LT/l;II)V
    .locals 18

    move-object/from16 v0, p1

    move/from16 v1, p3

    move/from16 v2, p4

    const/4 v3, 0x2

    const/4 v4, 0x6

    const-string v5, "content"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v5, 0x78d2a448

    move-object/from16 v6, p2

    invoke-interface {v6, v5}, LT/l;->r(I)LT/l;

    move-result-object v15

    const/4 v6, 0x1

    and-int/lit8 v7, v2, 0x1

    if-eqz v7, :cond_0

    or-int/lit8 v8, v1, 0x6

    move v9, v8

    move-object/from16 v8, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v8, v1, 0x6

    if-nez v8, :cond_2

    move-object/from16 v8, p0

    invoke-interface {v15, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/4 v9, 0x4

    goto :goto_0

    :cond_1
    move v9, v3

    :goto_0
    or-int/2addr v9, v1

    goto :goto_1

    :cond_2
    move-object/from16 v8, p0

    move v9, v1

    :goto_1
    and-int/2addr v3, v2

    if-eqz v3, :cond_3

    or-int/lit8 v9, v9, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v1, 0x30

    if-nez v3, :cond_5

    invoke-interface {v15, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v9, v3

    :cond_5
    :goto_3
    and-int/lit8 v3, v9, 0x13

    const/16 v10, 0x12

    if-ne v3, v10, :cond_7

    invoke-interface {v15}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v15}, LT/l;->C()V

    move-object v3, v8

    move-object v4, v15

    goto/16 :goto_7

    :cond_7
    :goto_4
    if-eqz v7, :cond_8

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_5

    :cond_8
    move-object v3, v8

    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v7

    if-eqz v7, :cond_9

    const/4 v7, -0x1

    const-string v8, "com.ui.wifiman.ui.component.modal.ModalContainer (ModalContainer.kt:18)"

    invoke-static {v5, v9, v7, v8}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_9
    sget-object v5, Lz/c;->a:Lz/c;

    invoke-virtual {v5}, Lz/c;->g()Lz/c$m;

    move-result-object v5

    sget-object v7, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v7}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v7

    const/4 v8, 0x0

    invoke-static {v5, v7, v15, v8}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v5

    invoke-static {v15, v8}, LT/j;->a(LT/l;I)I

    move-result v7

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v9

    invoke-static {v15, v3}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v10

    sget-object v11, LE0/g;->K:LE0/g$a;

    invoke-virtual {v11}, LE0/g$a;->a()Lmh/a;

    move-result-object v12

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v13

    if-nez v13, :cond_a

    invoke-static {}, LT/j;->c()V

    :cond_a
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v13

    if-eqz v13, :cond_b

    invoke-interface {v15, v12}, LT/l;->D(Lmh/a;)V

    goto :goto_6

    :cond_b
    invoke-interface {v15}, LT/l;->I()V

    :goto_6
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v12

    invoke-virtual {v11}, LE0/g$a;->e()Lmh/p;

    move-result-object v13

    invoke-static {v12, v5, v13}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v11}, LE0/g$a;->g()Lmh/p;

    move-result-object v5

    invoke-static {v12, v9, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v11}, LE0/g$a;->b()Lmh/p;

    move-result-object v5

    invoke-interface {v12}, LT/l;->o()Z

    move-result v9

    if-nez v9, :cond_c

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v9, v13}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_d

    :cond_c
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v12, v9}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v12, v7, v5}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_d
    invoke-virtual {v11}, LE0/g$a;->f()Lmh/p;

    move-result-object v5

    invoke-static {v12, v10, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v5, Lz/k;->a:Lz/k;

    sget-object v5, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v5}, Lz/j0;->c(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v7

    invoke-static {v7, v15, v8}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    sget-object v7, LQ/b;->a:LQ/b;

    invoke-virtual {v7, v15, v4}, LQ/b;->b(LT/l;I)Lm0/i1;

    move-result-object v4

    sget-object v8, Lla/a;->a:Lla/a;

    sget v9, Lla/a;->b:I

    invoke-virtual {v8, v15, v9}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v8

    invoke-virtual {v8}, Lma/a;->e()Lma/a$e;

    move-result-object v8

    invoke-virtual {v8}, Lma/a$e;->b()J

    move-result-wide v8

    invoke-static {}, LN/t;->a()LT/H0;

    move-result-object v10

    invoke-interface {v15, v10}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lm0/v0;

    invoke-virtual {v10}, Lm0/v0;->u()J

    move-result-wide v10

    invoke-virtual {v7}, LQ/b;->a()F

    move-result v13

    new-instance v7, LFe/e$a;

    invoke-direct {v7, v0}, LFe/e$a;-><init>(Lmh/p;)V

    const/16 v12, 0x36

    const v14, -0x6e295e06

    invoke-static {v14, v6, v7, v15, v12}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v14

    const v16, 0x180006

    const/16 v17, 0x10

    const/4 v12, 0x0

    move-object v6, v5

    move-object v7, v4

    move-object v4, v15

    invoke-static/range {v6 .. v17}, LN/O0;->a(Landroidx/compose/ui/e;Lm0/i1;JJLs/g;FLmh/p;LT/l;II)V

    invoke-interface {v4}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-static {}, LT/o;->P()V

    :cond_e
    :goto_7
    invoke-interface {v4}, LT/l;->z()LT/X0;

    move-result-object v4

    if-eqz v4, :cond_f

    new-instance v5, LFe/d;

    invoke-direct {v5, v3, v0, v1, v2}, LFe/d;-><init>(Landroidx/compose/ui/e;Lmh/p;II)V

    invoke-interface {v4, v5}, LT/X0;->a(Lmh/p;)V

    :cond_f
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;Lmh/p;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, LFe/e;->b(Landroidx/compose/ui/e;Lmh/p;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
