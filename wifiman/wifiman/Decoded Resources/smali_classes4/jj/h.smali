.class public abstract Ljj/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lmh/p;LA/B;Lmh/p;Lmh/p;FLjj/b;LT/l;II)Ljj/g;
    .locals 16

    move-object/from16 v0, p6

    const-string v1, "onMove"

    move-object/from16 v6, p0

    invoke-static {v6, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, -0x30c243d4

    invoke-interface {v0, v1}, LT/l;->e(I)V

    and-int/lit8 v2, p8, 0x2

    const/4 v10, 0x0

    if-eqz v2, :cond_0

    const/4 v2, 0x3

    invoke-static {v10, v10, v0, v10, v2}, LA/C;->c(IILT/l;II)LA/B;

    move-result-object v2

    move-object v11, v2

    goto :goto_0

    :cond_0
    move-object/from16 v11, p1

    :goto_0
    and-int/lit8 v2, p8, 0x4

    const/4 v12, 0x0

    if-eqz v2, :cond_1

    move-object v7, v12

    goto :goto_1

    :cond_1
    move-object/from16 v7, p2

    :goto_1
    and-int/lit8 v2, p8, 0x8

    if-eqz v2, :cond_2

    move-object v8, v12

    goto :goto_2

    :cond_2
    move-object/from16 v8, p3

    :goto_2
    and-int/lit8 v2, p8, 0x10

    if-eqz v2, :cond_3

    const/16 v2, 0x14

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    goto :goto_3

    :cond_3
    move/from16 v2, p4

    :goto_3
    and-int/lit8 v3, p8, 0x20

    const/4 v13, 0x1

    if-eqz v3, :cond_4

    new-instance v3, Ljj/j;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v13, v12}, Ljj/j;-><init>(FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v9, v3

    goto :goto_4

    :cond_4
    move-object/from16 v9, p5

    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_5

    const/4 v3, -0x1

    const-string v4, "org.burnoutcrew.reorderable.rememberReorderableLazyListState (ReorderableLazyListState.kt:36)"

    move/from16 v5, p7

    invoke-static {v1, v5, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_5
    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v1

    invoke-interface {v0, v1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LY0/d;

    invoke-interface {v1, v2}, LY0/d;->d1(F)F

    move-result v5

    const v1, 0x2e20b340

    invoke-interface {v0, v1}, LT/l;->e(I)V

    const v1, -0x1d58f75c

    invoke-interface {v0, v1}, LT/l;->e(I)V

    invoke-interface/range {p6 .. p6}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    sget-object v14, LT/l;->a:LT/l$a;

    invoke-virtual {v14}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_6

    sget-object v1, Ldh/j;->a:Ldh/j;

    invoke-static {v1, v0}, LT/O;->i(Ldh/i;LT/l;)LIi/N;

    move-result-object v1

    new-instance v2, LT/A;

    invoke-direct {v2, v1}, LT/A;-><init>(LIi/N;)V

    invoke-interface {v0, v2}, LT/l;->K(Ljava/lang/Object;)V

    move-object v1, v2

    :cond_6
    invoke-interface/range {p6 .. p6}, LT/l;->P()V

    check-cast v1, LT/A;

    invoke-virtual {v1}, LT/A;->a()LIi/N;

    move-result-object v4

    invoke-interface/range {p6 .. p6}, LT/l;->P()V

    const v1, 0x44faf204

    invoke-interface {v0, v1}, LT/l;->e(I)V

    invoke-interface {v0, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface/range {p6 .. p6}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_7

    invoke-virtual {v14}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_8

    :cond_7
    new-instance v15, Ljj/g;

    move-object v2, v15

    move-object v3, v11

    move-object/from16 v6, p0

    invoke-direct/range {v2 .. v9}, Ljj/g;-><init>(LA/B;LIi/N;FLmh/p;Lmh/p;Lmh/p;Ljj/b;)V

    invoke-interface {v0, v15}, LT/l;->K(Ljava/lang/Object;)V

    move-object v3, v15

    :cond_8
    invoke-interface/range {p6 .. p6}, LT/l;->P()V

    check-cast v3, Ljj/g;

    invoke-static {}, Landroidx/compose/ui/platform/k0;->m()LT/H0;

    move-result-object v2

    invoke-interface {v0, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    sget-object v4, LY0/t;->Rtl:LY0/t;

    if-ne v2, v4, :cond_9

    move v10, v13

    :cond_9
    invoke-interface {v0, v1}, LT/l;->e(I)V

    invoke-interface {v0, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface/range {p6 .. p6}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_a

    invoke-virtual {v14}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_b

    :cond_a
    new-instance v2, Ljj/h$a;

    invoke-direct {v2, v3, v12}, Ljj/h$a;-><init>(Ljj/g;Ldh/e;)V

    invoke-interface {v0, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    invoke-interface/range {p6 .. p6}, LT/l;->P()V

    check-cast v2, Lmh/p;

    const/16 v1, 0x40

    invoke-static {v3, v2, v0, v1}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const v4, 0x607fb4c4

    invoke-interface {v0, v4}, LT/l;->e(I)V

    invoke-interface {v0, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface {v0, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v2, v4

    invoke-interface {v0, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    invoke-interface/range {p6 .. p6}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_c

    invoke-virtual {v14}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_d

    :cond_c
    new-instance v4, Ljj/h$b;

    invoke-direct {v4, v11, v10, v3, v12}, Ljj/h$b;-><init>(LA/B;ZLjj/g;Ldh/e;)V

    invoke-interface {v0, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_d
    invoke-interface/range {p6 .. p6}, LT/l;->P()V

    check-cast v4, Lmh/p;

    invoke-static {v3, v4, v0, v1}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-static {}, LT/o;->P()V

    :cond_e
    invoke-interface/range {p6 .. p6}, LT/l;->P()V

    return-object v3
.end method
