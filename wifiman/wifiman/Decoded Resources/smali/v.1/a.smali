.class public abstract Lv/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lv/i;Lmh/a;Landroidx/compose/ui/e;Lmh/l;LT/l;II)V
    .locals 9

    const v0, 0x267ea035

    invoke-interface {p4, v0}, LT/l;->r(I)LT/l;

    move-result-object p4

    and-int/lit8 v1, p6, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, p5, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, p5, 0x6

    if-nez v1, :cond_2

    invoke-interface {p4, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p5

    goto :goto_1

    :cond_2
    move v1, p5

    :goto_1
    and-int/lit8 v2, p6, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v2, p5, 0x30

    if-nez v2, :cond_5

    invoke-interface {p4, p1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x20

    goto :goto_2

    :cond_4
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_5
    :goto_3
    and-int/lit8 v2, p6, 0x4

    if-eqz v2, :cond_6

    or-int/lit16 v1, v1, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v3, p5, 0x180

    if-nez v3, :cond_8

    invoke-interface {p4, p2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    const/16 v3, 0x100

    goto :goto_4

    :cond_7
    const/16 v3, 0x80

    :goto_4
    or-int/2addr v1, v3

    :cond_8
    :goto_5
    and-int/lit8 v3, p6, 0x8

    if-eqz v3, :cond_9

    or-int/lit16 v1, v1, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v3, p5, 0xc00

    if-nez v3, :cond_b

    invoke-interface {p4, p3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    const/16 v3, 0x800

    goto :goto_6

    :cond_a
    const/16 v3, 0x400

    :goto_6
    or-int/2addr v1, v3

    :cond_b
    :goto_7
    and-int/lit16 v3, v1, 0x493

    const/16 v4, 0x492

    if-ne v3, v4, :cond_e

    invoke-interface {p4}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_c

    goto :goto_9

    :cond_c
    invoke-interface {p4}, LT/l;->C()V

    :cond_d
    :goto_8
    move-object v4, p2

    goto/16 :goto_a

    :cond_e
    :goto_9
    if-eqz v2, :cond_f

    sget-object p2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    :cond_f
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_10

    const/4 v2, -0x1

    const-string v3, "androidx.compose.foundation.contextmenu.ContextMenu (ContextMenuArea.android.kt:63)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_10
    invoke-virtual {p0}, Lv/i;->a()Lv/i$a;

    move-result-object v0

    instance-of v2, v0, Lv/i$a$b;

    if-nez v2, :cond_13

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-static {}, LT/o;->P()V

    :cond_11
    invoke-interface {p4}, LT/l;->z()LT/X0;

    move-result-object p4

    if-eqz p4, :cond_12

    new-instance v0, Lv/a$a;

    move-object v2, v0

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move v7, p5

    move v8, p6

    invoke-direct/range {v2 .. v8}, Lv/a$a;-><init>(Lv/i;Lmh/a;Landroidx/compose/ui/e;Lmh/l;II)V

    invoke-interface {p4, v0}, LT/X0;->a(Lmh/p;)V

    :cond_12
    return-void

    :cond_13
    invoke-interface {p4, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {p4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_14

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_15

    :cond_14
    new-instance v3, Lv/e;

    check-cast v0, Lv/i$a$b;

    invoke-virtual {v0}, Lv/i$a$b;->a()J

    move-result-wide v4

    invoke-static {v4, v5}, LY0/o;->d(J)J

    move-result-wide v4

    const/4 v0, 0x0

    invoke-direct {v3, v4, v5, v0}, Lv/e;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p4, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_15
    move-object v0, v3

    check-cast v0, Lv/e;

    and-int/lit16 v6, v1, 0x1ff0

    const/4 v7, 0x0

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-static/range {v1 .. v7}, Lv/k;->c(Landroidx/compose/ui/window/q;Lmh/a;Landroidx/compose/ui/e;Lmh/l;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, LT/o;->P()V

    goto :goto_8

    :goto_a
    invoke-interface {p4}, LT/l;->z()LT/X0;

    move-result-object p2

    if-eqz p2, :cond_16

    new-instance p4, Lv/a$b;

    move-object v1, p4

    move-object v2, p0

    move-object v3, p1

    move-object v5, p3

    move v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lv/a$b;-><init>(Lv/i;Lmh/a;Landroidx/compose/ui/e;Lmh/l;II)V

    invoke-interface {p2, p4}, LT/X0;->a(Lmh/p;)V

    :cond_16
    return-void
.end method

.method public static final b(Lv/i;Lmh/a;Lmh/l;Landroidx/compose/ui/e;ZLmh/p;LT/l;II)V
    .locals 16

    move-object/from16 v7, p0

    move-object/from16 v8, p5

    move/from16 v9, p7

    const/16 v0, 0x10

    const/16 v1, 0x20

    const/4 v2, 0x2

    const/4 v3, 0x4

    const v4, -0x50aa686

    move-object/from16 v5, p6

    invoke-interface {v5, v4}, LT/l;->r(I)LT/l;

    move-result-object v10

    const/4 v5, 0x1

    and-int/lit8 v6, p8, 0x1

    if-eqz v6, :cond_0

    or-int/lit8 v6, v9, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v9, 0x6

    if-nez v6, :cond_2

    invoke-interface {v10, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    move v6, v3

    goto :goto_0

    :cond_1
    move v6, v2

    :goto_0
    or-int/2addr v6, v9

    goto :goto_1

    :cond_2
    move v6, v9

    :goto_1
    and-int/lit8 v2, p8, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v6, v6, 0x30

    move-object/from16 v11, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v2, v9, 0x30

    move-object/from16 v11, p1

    if-nez v2, :cond_5

    invoke-interface {v10, v11}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    move v2, v1

    goto :goto_2

    :cond_4
    move v2, v0

    :goto_2
    or-int/2addr v6, v2

    :cond_5
    :goto_3
    and-int/lit8 v2, p8, 0x4

    if-eqz v2, :cond_6

    or-int/lit16 v6, v6, 0x180

    move-object/from16 v12, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v2, v9, 0x180

    move-object/from16 v12, p2

    if-nez v2, :cond_8

    invoke-interface {v10, v12}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    const/16 v2, 0x100

    goto :goto_4

    :cond_7
    const/16 v2, 0x80

    :goto_4
    or-int/2addr v6, v2

    :cond_8
    :goto_5
    and-int/lit8 v2, p8, 0x8

    if-eqz v2, :cond_a

    or-int/lit16 v6, v6, 0xc00

    :cond_9
    move-object/from16 v3, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v3, v9, 0xc00

    if-nez v3, :cond_9

    move-object/from16 v3, p3

    invoke-interface {v10, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_b

    const/16 v13, 0x800

    goto :goto_6

    :cond_b
    const/16 v13, 0x400

    :goto_6
    or-int/2addr v6, v13

    :goto_7
    and-int/lit8 v0, p8, 0x10

    if-eqz v0, :cond_d

    or-int/lit16 v6, v6, 0x6000

    :cond_c
    move/from16 v13, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v13, v9, 0x6000

    if-nez v13, :cond_c

    move/from16 v13, p4

    invoke-interface {v10, v13}, LT/l;->c(Z)Z

    move-result v14

    if-eqz v14, :cond_e

    const/16 v14, 0x4000

    goto :goto_8

    :cond_e
    const/16 v14, 0x2000

    :goto_8
    or-int/2addr v6, v14

    :goto_9
    and-int/lit8 v1, p8, 0x20

    const/high16 v14, 0x30000

    if-eqz v1, :cond_f

    or-int/2addr v6, v14

    goto :goto_b

    :cond_f
    and-int v1, v9, v14

    if-nez v1, :cond_11

    invoke-interface {v10, v8}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    const/high16 v1, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v1, 0x10000

    :goto_a
    or-int/2addr v6, v1

    :cond_11
    :goto_b
    const v1, 0x12493

    and-int/2addr v1, v6

    const v14, 0x12492

    if-ne v1, v14, :cond_13

    invoke-interface {v10}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_12

    goto :goto_c

    :cond_12
    invoke-interface {v10}, LT/l;->C()V

    move-object v4, v3

    move v5, v13

    goto/16 :goto_10

    :cond_13
    :goto_c
    if-eqz v2, :cond_14

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v14, v1

    goto :goto_d

    :cond_14
    move-object v14, v3

    :goto_d
    if-eqz v0, :cond_15

    move v13, v5

    :cond_15
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_16

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:44)"

    invoke-static {v4, v6, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_16
    if-eqz v13, :cond_17

    invoke-static {v14, v7}, Lv/c;->c(Landroidx/compose/ui/e;Lv/i;)Landroidx/compose/ui/e;

    move-result-object v0

    goto :goto_e

    :cond_17
    move-object v0, v14

    :goto_e
    sget-object v1, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v1}, Lf0/c$a;->o()Lf0/c;

    move-result-object v1

    invoke-static {v1, v5}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v10, v2}, LT/j;->a(LT/l;I)I

    move-result v2

    invoke-interface {v10}, LT/l;->G()LT/x;

    move-result-object v3

    invoke-static {v10, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v4, LE0/g;->K:LE0/g$a;

    invoke-virtual {v4}, LE0/g$a;->a()Lmh/a;

    move-result-object v5

    invoke-interface {v10}, LT/l;->x()LT/f;

    move-result-object v15

    if-nez v15, :cond_18

    invoke-static {}, LT/j;->c()V

    :cond_18
    invoke-interface {v10}, LT/l;->u()V

    invoke-interface {v10}, LT/l;->o()Z

    move-result v15

    if-eqz v15, :cond_19

    invoke-interface {v10, v5}, LT/l;->D(Lmh/a;)V

    goto :goto_f

    :cond_19
    invoke-interface {v10}, LT/l;->I()V

    :goto_f
    invoke-static {v10}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v5

    invoke-virtual {v4}, LE0/g$a;->e()Lmh/p;

    move-result-object v15

    invoke-static {v5, v1, v15}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v4}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v5, v3, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v4}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v5}, LT/l;->o()Z

    move-result v3

    if-nez v3, :cond_1a

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v3, v15}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1b

    :cond_1a
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v5, v3}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v5, v2, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_1b
    invoke-virtual {v4}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v5, v0, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    shr-int/lit8 v0, v6, 0xf

    and-int/lit8 v0, v0, 0xe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v8, v10, v0}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    and-int/lit8 v0, v6, 0x7e

    shl-int/lit8 v1, v6, 0x3

    and-int/lit16 v1, v1, 0x1c00

    or-int v5, v0, v1

    const/4 v6, 0x4

    const/4 v2, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v3, p2

    move-object v4, v10

    invoke-static/range {v0 .. v6}, Lv/a;->a(Lv/i;Lmh/a;Landroidx/compose/ui/e;Lmh/l;LT/l;II)V

    invoke-interface {v10}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_1c

    invoke-static {}, LT/o;->P()V

    :cond_1c
    move v5, v13

    move-object v4, v14

    :goto_10
    invoke-interface {v10}, LT/l;->z()LT/X0;

    move-result-object v10

    if-eqz v10, :cond_1d

    new-instance v13, Lv/a$c;

    move-object v0, v13

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v6, p5

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lv/a$c;-><init>(Lv/i;Lmh/a;Lmh/l;Landroidx/compose/ui/e;ZLmh/p;II)V

    invoke-interface {v10, v13}, LT/X0;->a(Lmh/p;)V

    :cond_1d
    return-void
.end method
