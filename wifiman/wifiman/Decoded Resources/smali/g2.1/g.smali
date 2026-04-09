.class public abstract Lg2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lg2/i;LT/l;I)V
    .locals 20

    move-object/from16 v6, p0

    move/from16 v7, p2

    const v0, 0x118f13d0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v14

    and-int/lit8 v1, v7, 0x6

    const/4 v2, 0x2

    const/4 v15, 0x4

    if-nez v1, :cond_1

    invoke-interface {v14, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v15

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, v7

    move v13, v1

    goto :goto_1

    :cond_1
    move v13, v7

    :goto_1
    and-int/lit8 v1, v13, 0x3

    if-ne v1, v2, :cond_3

    invoke-interface {v14}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {v14}, LT/l;->C()V

    goto/16 :goto_6

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, -0x1

    const-string v2, "androidx.navigation.compose.DialogHost (DialogHost.kt:40)"

    invoke-static {v0, v13, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    const/4 v12, 0x0

    invoke-static {v14, v12}, Lc0/g;->a(LT/l;I)Lc0/e;

    move-result-object v16

    invoke-virtual/range {p0 .. p0}, Lg2/i;->n()LLi/N;

    move-result-object v0

    const/4 v11, 0x0

    const/4 v10, 0x1

    invoke-static {v0, v11, v14, v12, v10}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v0

    invoke-static {v0}, Lg2/g;->b(LT/z1;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-static {v1, v14, v12}, Lg2/g;->f(Ljava/util/Collection;LT/l;I)Landroidx/compose/runtime/snapshots/k;

    move-result-object v1

    invoke-static {v0}, Lg2/g;->b(LT/z1;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v1, v0, v14, v12}, Lg2/g;->d(Ljava/util/List;Ljava/util/Collection;LT/l;I)V

    invoke-virtual/range {p0 .. p0}, Lg2/i;->o()LLi/N;

    move-result-object v0

    invoke-static {v0, v11, v14, v12, v10}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v9

    invoke-interface {v14}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_5

    invoke-static {}, LT/o1;->f()Landroidx/compose/runtime/snapshots/k;

    move-result-object v0

    invoke-interface {v14, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    move-object v8, v0

    check-cast v8, Landroidx/compose/runtime/snapshots/k;

    const v0, 0x511fc6cf

    invoke-interface {v14, v0}, LT/l;->U(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_3
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lf2/k;

    invoke-virtual {v1}, Lf2/k;->f()Lf2/r;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, v0

    check-cast v5, Lg2/i$b;

    and-int/lit8 v0, v13, 0xe

    if-ne v0, v15, :cond_6

    move v0, v10

    goto :goto_4

    :cond_6
    move v0, v12

    :goto_4
    invoke-interface {v14, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-interface {v14}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_7

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_8

    :cond_7
    new-instance v2, Lg2/g$a;

    invoke-direct {v2, v6, v1}, Lg2/g$a;-><init>(Lg2/i;Lf2/k;)V

    invoke-interface {v14, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    move-object/from16 v18, v2

    check-cast v18, Lmh/a;

    invoke-virtual {v5}, Lg2/i$b;->M()Landroidx/compose/ui/window/i;

    move-result-object v19

    new-instance v4, Lg2/g$b;

    move-object v0, v4

    move-object/from16 v2, p0

    move-object/from16 v3, v16

    move-object v11, v4

    move-object v4, v8

    invoke-direct/range {v0 .. v5}, Lg2/g$b;-><init>(Lf2/k;Lg2/i;Lc0/e;Landroidx/compose/runtime/snapshots/k;Lg2/i$b;)V

    const/16 v0, 0x36

    const v1, 0x43541ebc

    invoke-static {v1, v10, v11, v14, v0}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v0

    const/16 v1, 0x180

    const/4 v2, 0x0

    move-object v3, v8

    move-object/from16 v8, v18

    move-object v4, v9

    move-object/from16 v9, v19

    move v5, v10

    move-object v10, v0

    const/4 v0, 0x0

    move-object v11, v14

    move/from16 v18, v12

    move v12, v1

    move v1, v13

    move v13, v2

    invoke-static/range {v8 .. v13}, Landroidx/compose/ui/window/a;->a(Lmh/a;Landroidx/compose/ui/window/i;Lmh/p;LT/l;II)V

    move-object v11, v0

    move v13, v1

    move-object v8, v3

    move-object v9, v4

    move v10, v5

    move/from16 v12, v18

    goto :goto_3

    :cond_9
    move-object v3, v8

    move-object v4, v9

    move v5, v10

    move-object v0, v11

    move/from16 v18, v12

    move v1, v13

    invoke-interface {v14}, LT/l;->J()V

    invoke-static {v4}, Lg2/g;->c(LT/z1;)Ljava/util/Set;

    move-result-object v2

    invoke-interface {v14, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    and-int/lit8 v1, v1, 0xe

    if-ne v1, v15, :cond_a

    move v12, v5

    goto :goto_5

    :cond_a
    move/from16 v12, v18

    :goto_5
    or-int v1, v8, v12

    invoke-interface {v14}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_b

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v5, v1, :cond_c

    :cond_b
    new-instance v5, Lg2/g$c;

    invoke-direct {v5, v4, v6, v3, v0}, Lg2/g$c;-><init>(LT/z1;Lg2/i;Landroidx/compose/runtime/snapshots/k;Ldh/e;)V

    invoke-interface {v14, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_c
    check-cast v5, Lmh/p;

    const/16 v0, 0x30

    invoke-static {v2, v3, v5, v14, v0}, LT/O;->e(Ljava/lang/Object;Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, LT/o;->P()V

    :cond_d
    :goto_6
    invoke-interface {v14}, LT/l;->z()LT/X0;

    move-result-object v0

    if-eqz v0, :cond_e

    new-instance v1, Lg2/g$d;

    invoke-direct {v1, v6, v7}, Lg2/g$d;-><init>(Lg2/i;I)V

    invoke-interface {v0, v1}, LT/X0;->a(Lmh/p;)V

    :cond_e
    return-void
.end method

.method private static final b(LT/z1;)Ljava/util/List;
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method private static final c(LT/z1;)Ljava/util/Set;
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Set;

    return-object p0
.end method

.method public static final d(Ljava/util/List;Ljava/util/Collection;LT/l;I)V
    .locals 6

    const v0, 0x5baa69c3

    invoke-interface {p2, v0}, LT/l;->r(I)LT/l;

    move-result-object p2

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_1

    invoke-interface {p2, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p3

    goto :goto_1

    :cond_1
    move v1, p3

    :goto_1
    and-int/lit8 v2, p3, 0x30

    if-nez v2, :cond_3

    invoke-interface {p2, p1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit8 v2, v1, 0x13

    const/16 v3, 0x12

    if-ne v2, v3, :cond_5

    invoke-interface {p2}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p2}, LT/l;->C()V

    goto :goto_5

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v2, -0x1

    const-string v3, "androidx.navigation.compose.PopulateVisibleList (DialogHost.kt:88)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    invoke-static {}, Landroidx/compose/ui/platform/A0;->a()LT/H0;

    move-result-object v0

    invoke-interface {p2, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf2/k;

    invoke-virtual {v2}, Lf2/k;->O()Landroidx/lifecycle/k;

    move-result-object v3

    invoke-interface {p2, v0}, LT/l;->c(Z)Z

    move-result v4

    invoke-interface {p2, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-interface {p2, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_7

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_8

    :cond_7
    new-instance v5, Lg2/g$e;

    invoke-direct {v5, v2, v0, p0}, Lg2/g$e;-><init>(Lf2/k;ZLjava/util/List;)V

    invoke-interface {p2, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    check-cast v5, Lmh/l;

    const/4 v2, 0x0

    invoke-static {v3, v5, p2, v2}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    goto :goto_4

    :cond_9
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    :goto_5
    invoke-interface {p2}, LT/l;->z()LT/X0;

    move-result-object p2

    if-eqz p2, :cond_b

    new-instance v0, Lg2/g$f;

    invoke-direct {v0, p0, p1, p3}, Lg2/g$f;-><init>(Ljava/util/List;Ljava/util/Collection;I)V

    invoke-interface {p2, v0}, LT/X0;->a(Lmh/p;)V

    :cond_b
    return-void
.end method

.method public static final synthetic e(LT/z1;)Ljava/util/Set;
    .locals 0

    invoke-static {p0}, Lg2/g;->c(LT/z1;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Ljava/util/Collection;LT/l;I)Landroidx/compose/runtime/snapshots/k;
    .locals 5

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.navigation.compose.rememberVisibleList (DialogHost.kt:119)"

    const v2, 0x1bdba1c5

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/A0;->a()LT/H0;

    move-result-object p2

    invoke-interface {p1, p2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-interface {p1, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_1

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_5

    :cond_1
    invoke-static {}, LT/o1;->f()Landroidx/compose/runtime/snapshots/k;

    move-result-object v1

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lf2/k;

    if-eqz p2, :cond_3

    const/4 v3, 0x1

    goto :goto_1

    :cond_3
    invoke-virtual {v3}, Lf2/k;->O()Landroidx/lifecycle/k;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/lifecycle/k;->b()Landroidx/lifecycle/k$b;

    move-result-object v3

    sget-object v4, Landroidx/lifecycle/k$b;->STARTED:Landroidx/lifecycle/k$b;

    invoke-virtual {v3, v4}, Landroidx/lifecycle/k$b;->isAtLeast(Landroidx/lifecycle/k$b;)Z

    move-result v3

    :goto_1
    if-eqz v3, :cond_2

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    invoke-virtual {v1, v0}, Landroidx/compose/runtime/snapshots/k;->addAll(Ljava/util/Collection;)Z

    invoke-interface {p1, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    check-cast v1, Landroidx/compose/runtime/snapshots/k;

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
    return-object v1
.end method
