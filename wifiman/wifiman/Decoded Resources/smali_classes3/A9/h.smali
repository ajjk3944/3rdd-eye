.class public abstract LA9/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lmh/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, LA9/a;->a:LA9/a;

    invoke-virtual {v0}, LA9/a;->a()Lmh/p;

    move-result-object v0

    sput-object v0, LA9/h;->a:Lmh/p;

    return-void
.end method

.method public static synthetic a(Lmh/q;Lmh/p;LC0/U;LY0/b;)LC0/D;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LA9/h;->g(Lmh/q;Lmh/p;LC0/U;LY0/b;)LC0/D;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;Lmh/p;Lmh/q;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, LA9/h;->j(Landroidx/compose/ui/e;Lmh/p;Lmh/q;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LY0/b;LC0/B;)Landroidx/compose/ui/layout/t;
    .locals 0

    invoke-static {p0, p1}, LA9/h;->i(LY0/b;LC0/B;)Landroidx/compose/ui/layout/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/layout/t$a;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, LA9/h;->h(Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/layout/t$a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/e;Lmh/p;Lmh/q;LT/l;II)V
    .locals 8

    const-string/jumbo v0, "content"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x55880681

    invoke-interface {p3, v0}, LT/l;->r(I)LT/l;

    move-result-object p3

    and-int/lit8 v1, p5, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, p4, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p4, 0x6

    if-nez v2, :cond_2

    invoke-interface {p3, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, p4

    goto :goto_1

    :cond_2
    move v2, p4

    :goto_1
    and-int/lit8 v3, p5, 0x2

    const/16 v4, 0x20

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v5, p4, 0x30

    if-nez v5, :cond_5

    invoke-interface {p3, p1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    move v5, v4

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    :cond_5
    :goto_3
    and-int/lit8 v5, p5, 0x4

    const/16 v6, 0x100

    if-eqz v5, :cond_6

    or-int/lit16 v2, v2, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v5, p4, 0x180

    if-nez v5, :cond_8

    invoke-interface {p3, p2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    move v5, v6

    goto :goto_4

    :cond_7
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v2, v5

    :cond_8
    :goto_5
    and-int/lit16 v5, v2, 0x93

    const/16 v7, 0x92

    if-ne v5, v7, :cond_b

    invoke-interface {p3}, LT/l;->v()Z

    move-result v5

    if-nez v5, :cond_9

    goto :goto_7

    :cond_9
    invoke-interface {p3}, LT/l;->C()V

    :cond_a
    :goto_6
    move-object v2, p0

    move-object v3, p1

    goto :goto_a

    :cond_b
    :goto_7
    if-eqz v1, :cond_c

    sget-object p0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    :cond_c
    if-eqz v3, :cond_d

    sget-object p1, LA9/h;->a:Lmh/p;

    :cond_d
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_e

    const/4 v1, -0x1

    const-string/jumbo v3, "com.ui.core.ui.component.layout.UiColumnWithDividers (UiColumnWithDividers.kt:36)"

    invoke-static {v0, v2, v1, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_e
    const v0, 0x9d21e11

    invoke-interface {p3, v0}, LT/l;->U(I)V

    and-int/lit16 v0, v2, 0x380

    const/4 v1, 0x0

    const/4 v3, 0x1

    if-ne v0, v6, :cond_f

    move v0, v3

    goto :goto_8

    :cond_f
    move v0, v1

    :goto_8
    and-int/lit8 v5, v2, 0x70

    if-ne v5, v4, :cond_10

    goto :goto_9

    :cond_10
    move v3, v1

    :goto_9
    or-int/2addr v0, v3

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_11

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v3, v0, :cond_12

    :cond_11
    new-instance v3, LA9/d;

    invoke-direct {v3, p2, p1}, LA9/d;-><init>(Lmh/q;Lmh/p;)V

    invoke-interface {p3, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_12
    check-cast v3, Lmh/p;

    invoke-interface {p3}, LT/l;->J()V

    and-int/lit8 v0, v2, 0xe

    invoke-static {p0, v3, p3, v0, v1}, Landroidx/compose/ui/layout/w;->a(Landroidx/compose/ui/e;Lmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, LT/o;->P()V

    goto :goto_6

    :goto_a
    invoke-interface {p3}, LT/l;->z()LT/X0;

    move-result-object p0

    if-eqz p0, :cond_13

    new-instance p1, LA9/e;

    move-object v1, p1

    move-object v4, p2

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, LA9/e;-><init>(Landroidx/compose/ui/e;Lmh/p;Lmh/q;II)V

    invoke-interface {p0, p1}, LT/X0;->a(Lmh/p;)V

    :cond_13
    return-void
.end method

.method private static final f(Lmh/p;ILjava/util/List;LT/l;I)V
    .locals 22

    move/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v11, p3

    const/4 v12, 0x1

    const v2, 0x300d4024

    invoke-interface {v11, v2}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, -0x1

    const-string/jumbo v4, "com.ui.core.ui.component.layout.UiColumnWithDividers.Dividers (UiColumnWithDividers.kt:41)"

    move/from16 v5, p4

    invoke-static {v2, v5, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    add-int/lit8 v13, v0, -0x1

    const/4 v14, 0x0

    move v2, v14

    :goto_0
    if-ge v2, v13, :cond_9

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    add-int/lit8 v15, v2, 0x1

    invoke-static {v15, v0}, Lsh/m;->s(II)Lsh/i;

    move-result-object v2

    instance-of v4, v2, Ljava/util/Collection;

    if-eqz v4, :cond_2

    move-object v4, v2

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_2

    :cond_1
    move v2, v14

    goto :goto_1

    :cond_2
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    move-object v4, v2

    check-cast v4, LZg/Q;

    invoke-virtual {v4}, LZg/Q;->d()I

    move-result v4

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_3

    move v2, v12

    :goto_1
    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    sget-object v5, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v5}, Lf0/c$a;->o()Lf0/c;

    move-result-object v5

    invoke-static {v5, v14}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v5

    invoke-static {v11, v14}, LT/j;->a(LT/l;I)I

    move-result v6

    invoke-interface/range {p3 .. p3}, LT/l;->G()LT/x;

    move-result-object v7

    invoke-static {v11, v4}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v8

    sget-object v9, LE0/g;->K:LE0/g$a;

    invoke-virtual {v9}, LE0/g$a;->a()Lmh/a;

    move-result-object v10

    invoke-interface/range {p3 .. p3}, LT/l;->x()LT/f;

    move-result-object v16

    if-nez v16, :cond_4

    invoke-static {}, LT/j;->c()V

    :cond_4
    invoke-interface/range {p3 .. p3}, LT/l;->u()V

    invoke-interface/range {p3 .. p3}, LT/l;->o()Z

    move-result v16

    if-eqz v16, :cond_5

    invoke-interface {v11, v10}, LT/l;->D(Lmh/a;)V

    goto :goto_2

    :cond_5
    invoke-interface/range {p3 .. p3}, LT/l;->I()V

    :goto_2
    invoke-static/range {p3 .. p3}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v10

    invoke-virtual {v9}, LE0/g$a;->e()Lmh/p;

    move-result-object v14

    invoke-static {v10, v5, v14}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->g()Lmh/p;

    move-result-object v5

    invoke-static {v10, v7, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->b()Lmh/p;

    move-result-object v5

    invoke-interface {v10}, LT/l;->o()Z

    move-result v7

    if-nez v7, :cond_6

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v7, v14}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_7

    :cond_6
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v10, v7}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v10, v6, v5}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_7
    invoke-virtual {v9}, LE0/g$a;->f()Lmh/p;

    move-result-object v5

    invoke-static {v10, v8, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v5, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    if-eqz v3, :cond_8

    if-eqz v2, :cond_8

    move v2, v12

    goto :goto_3

    :cond_8
    const/4 v2, 0x0

    :goto_3
    const/16 v9, 0xf

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Landroidx/compose/animation/g;->m(Lr/H;Lf0/c$c;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/animation/i;

    move-result-object v3

    const/4 v6, 0x0

    const/4 v7, 0x3

    invoke-static {v5, v6, v7, v5}, Landroidx/compose/animation/g;->o(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/i;

    move-result-object v8

    invoke-virtual {v3, v8}, Landroidx/compose/animation/i;->c(Landroidx/compose/animation/i;)Landroidx/compose/animation/i;

    move-result-object v8

    const/16 v20, 0xf

    const/16 v21, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/animation/g;->y(Lr/H;Lf0/c$c;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/animation/k;

    move-result-object v3

    invoke-static {v5, v6, v7, v5}, Landroidx/compose/animation/g;->q(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/k;

    move-result-object v5

    invoke-virtual {v3, v5}, Landroidx/compose/animation/k;->c(Landroidx/compose/animation/k;)Landroidx/compose/animation/k;

    move-result-object v5

    new-instance v3, LA9/h$c;

    move-object/from16 v14, p0

    invoke-direct {v3, v14}, LA9/h$c;-><init>(Lmh/p;)V

    const/16 v6, 0x36

    const v7, -0x6f2054ae

    invoke-static {v7, v12, v3, v11, v6}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    const v9, 0x30db0

    const/16 v10, 0x10

    const/4 v6, 0x0

    move-object v3, v4

    move-object v4, v8

    move-object/from16 v8, p3

    invoke-static/range {v2 .. v10}, Lq/d;->f(ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-interface/range {p3 .. p3}, LT/l;->R()V

    move v2, v15

    const/4 v14, 0x0

    goto/16 :goto_0

    :cond_9
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    return-void
.end method

.method private static final g(Lmh/q;Lmh/p;LC0/U;LY0/b;)LC0/D;
    .locals 11

    const-string v1, "$this$SubcomposeLayout"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LA9/c;->MainContent:LA9/c;

    new-instance v2, LA9/h$a;

    invoke-direct {v2, p0}, LA9/h$a;-><init>(Lmh/q;)V

    const v3, -0x56c252fa

    const/4 v4, 0x1

    invoke-static {v3, v4, v2}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v2

    invoke-interface {p2, v1, v2}, LC0/U;->Q1(Ljava/lang/Object;Lmh/p;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object v2

    new-instance v3, LA9/f;

    invoke-direct {v3, p3}, LA9/f;-><init>(LY0/b;)V

    invoke-static {v2, v3}, Lzi/m;->N(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v2

    invoke-static {v2}, Lzi/m;->Z(Lzi/j;)Ljava/util/List;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const/4 v7, 0x0

    move v8, v7

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/compose/ui/layout/t;

    invoke-virtual {v9}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v9

    add-int/2addr v8, v9

    goto :goto_0

    :cond_0
    new-instance v6, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v1, v9}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v6, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LC0/B;

    invoke-static {v10}, LA9/h;->l(LC0/n;)Z

    move-result v10

    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    invoke-interface {v6, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    sget-object v1, LA9/c;->Dividers:LA9/c;

    new-instance v10, LA9/h$b;

    invoke-direct {v10, v6, p1}, LA9/h$b;-><init>(Ljava/util/List;Lmh/p;)V

    const v6, 0x537c5e5f

    invoke-static {v6, v4, v10}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v4

    invoke-interface {p2, v1, v4}, LC0/U;->Q1(Ljava/lang/Object;Lmh/p;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v1, v9}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LC0/B;

    invoke-virtual {p3}, LY0/b;->r()J

    move-result-wide v9

    invoke-interface {v6, v9, v10}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v5, v7

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/compose/ui/layout/t;

    invoke-virtual {v6}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v6

    add-int/2addr v5, v6

    goto :goto_3

    :cond_3
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_4

    const/4 v1, 0x0

    goto :goto_5

    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/ui/layout/t;

    invoke-virtual {v3}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    :cond_5
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/compose/ui/layout/t;

    invoke-virtual {v6}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v9

    if-gez v9, :cond_5

    move-object v3, v6

    goto :goto_4

    :cond_6
    move-object v1, v3

    :goto_5
    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_6

    :cond_7
    move v1, v7

    :goto_6
    add-int v3, v8, v5

    new-instance v5, LA9/g;

    invoke-direct {v5, v2, v4}, LA9/g;-><init>(Ljava/util/List;Ljava/util/List;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v0, p2

    move v2, v3

    move-object v3, v4

    move-object v4, v5

    move v5, v6

    move-object v6, v7

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object v0

    return-object v0
.end method

.method private static final h(Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/layout/t$a;)LYg/J;
    .locals 12

    const-string v0, "$this$layout"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v8, v1

    move v9, v8

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v10, v8, 0x1

    if-gez v8, :cond_0

    invoke-static {}, LZg/v;->v()V

    :cond_0
    move-object v11, v1

    check-cast v11, Landroidx/compose/ui/layout/t;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v1, p2

    move-object v2, v11

    move v4, v9

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/t$a;->h(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFILjava/lang/Object;)V

    invoke-virtual {v11}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v1

    add-int/2addr v9, v1

    invoke-static {p1, v8}, LZg/v;->t0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Landroidx/compose/ui/layout/t;

    if-eqz v8, :cond_1

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v1, p2

    move-object v2, v8

    move v4, v9

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/t$a;->h(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFILjava/lang/Object;)V

    invoke-virtual {v8}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v1

    add-int/2addr v9, v1

    :cond_1
    move v8, v10

    goto :goto_0

    :cond_2
    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final i(LY0/b;LC0/B;)Landroidx/compose/ui/layout/t;
    .locals 2

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LY0/b;->r()J

    move-result-wide v0

    invoke-interface {p1, v0, v1}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Landroidx/compose/ui/e;Lmh/p;Lmh/q;IILT/l;I)LYg/J;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p5

    move v5, p4

    invoke-static/range {v0 .. v5}, LA9/h;->e(Landroidx/compose/ui/e;Lmh/p;Lmh/q;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final synthetic k(Lmh/p;ILjava/util/List;LT/l;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LA9/h;->f(Lmh/p;ILjava/util/List;LT/l;I)V

    return-void
.end method

.method private static final l(LC0/n;)Z
    .locals 1

    invoke-interface {p0}, LC0/n;->b()Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, LA9/i$b;

    if-eqz v0, :cond_0

    check-cast p0, LA9/i$b;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, LA9/i$b;->a()Z

    move-result p0

    goto :goto_1

    :cond_1
    const/4 p0, 0x1

    :goto_1
    return p0
.end method
