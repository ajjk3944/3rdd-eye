.class final LJe/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJe/e;->b(Landroidx/compose/ui/e;LJe/c;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LJe/c;


# direct methods
.method constructor <init>(LJe/c;)V
    .locals 0

    iput-object p1, p0, LJe/e$a;->a:LJe/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/e;LKe/a;LT/l;I)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v12, p3

    const-string v3, "itemModifier"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "item"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v3, p4, 0x6

    if-nez v3, :cond_1

    invoke-interface {v12, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int v3, p4, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p4

    :goto_1
    and-int/lit8 v4, p4, 0x30

    const/16 v5, 0x10

    if-nez v4, :cond_4

    and-int/lit8 v4, p4, 0x40

    if-nez v4, :cond_2

    invoke-interface {v12, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_2

    :cond_2
    invoke-interface {v12, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    :goto_2
    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_3

    :cond_3
    move v4, v5

    :goto_3
    or-int/2addr v3, v4

    :cond_4
    and-int/lit16 v4, v3, 0x93

    const/16 v6, 0x92

    if-ne v4, v6, :cond_6

    invoke-interface/range {p3 .. p3}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_4

    :cond_5
    invoke-interface/range {p3 .. p3}, LT/l;->C()V

    goto/16 :goto_6

    :cond_6
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_7

    const/4 v4, -0x1

    const-string v6, "com.ui.wifiman.ui.device.DeviceDetailUiContent.<anonymous> (DeviceDetailUiContent.kt:28)"

    const v7, -0x5be49661

    invoke-static {v7, v3, v4, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_7
    instance-of v4, v2, LKe/a$a;

    if-eqz v4, :cond_8

    const v4, 0x42e548f4

    invoke-interface {v12, v4}, LT/l;->U(I)V

    check-cast v2, LKe/a$a;

    and-int/lit8 v3, v3, 0xe

    invoke-static {v1, v2, v12, v3}, LKe/i;->f(Landroidx/compose/ui/e;LKe/a$a;LT/l;I)V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    goto/16 :goto_5

    :cond_8
    instance-of v4, v2, LKe/a$g;

    if-eqz v4, :cond_b

    const v2, 0x42e55cf1

    invoke-interface {v12, v2}, LT/l;->U(I)V

    iget-object v2, v0, LJe/e$a;->a:LJe/c;

    const v4, 0x42e568ff

    invoke-interface {v12, v4}, LT/l;->U(I)V

    invoke-interface {v12, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface/range {p3 .. p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_9

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_a

    :cond_9
    new-instance v5, LJe/e$a$a;

    invoke-direct {v5, v2}, LJe/e$a$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {v12, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_a
    check-cast v5, Lth/g;

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    check-cast v5, Lmh/a;

    and-int/lit8 v2, v3, 0xe

    invoke-static {v1, v5, v12, v2}, LKe/u;->b(Landroidx/compose/ui/e;Lmh/a;LT/l;I)V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    goto/16 :goto_5

    :cond_b
    instance-of v4, v2, LKe/a$c;

    if-eqz v4, :cond_e

    const v4, 0x42e57413

    invoke-interface {v12, v4}, LT/l;->U(I)V

    check-cast v2, LKe/a$c;

    invoke-virtual {v2}, LKe/a$c;->a()Ls9/a;

    move-result-object v4

    invoke-virtual {v2}, LKe/a$c;->b()Ls9/d;

    move-result-object v5

    iget-object v2, v0, LJe/e$a;->a:LJe/c;

    const v6, 0x42e58800    # 114.765625f

    invoke-interface {v12, v6}, LT/l;->U(I)V

    invoke-interface {v12, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    invoke-interface/range {p3 .. p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_c

    sget-object v6, LT/l;->a:LT/l$a;

    invoke-virtual {v6}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v7, v6, :cond_d

    :cond_c
    new-instance v7, LJe/e$a$b;

    invoke-direct {v7, v2}, LJe/e$a$b;-><init>(Ljava/lang/Object;)V

    invoke-interface {v12, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_d
    check-cast v7, Lth/g;

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    move-object v6, v7

    check-cast v6, Lmh/a;

    and-int/lit8 v7, v3, 0xe

    move-object/from16 v1, p1

    move-object v2, v4

    move-object v3, v5

    move-object v4, v6

    move-object/from16 v5, p3

    move v6, v7

    invoke-static/range {v1 .. v6}, LKe/k;->b(Landroidx/compose/ui/e;Ls9/a;Ls9/d;Lmh/a;LT/l;I)V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    goto/16 :goto_5

    :cond_e
    instance-of v4, v2, LKe/a$b;

    if-eqz v4, :cond_f

    const v4, 0x42e5933d

    invoke-interface {v12, v4}, LT/l;->U(I)V

    check-cast v2, LKe/a$b;

    invoke-virtual {v2}, LKe/a$b;->c()Ls9/d;

    move-result-object v4

    invoke-virtual {v2}, LKe/a$b;->b()Ls9/d;

    move-result-object v5

    invoke-virtual {v2}, LKe/a$b;->d()Ls9/d;

    move-result-object v6

    invoke-virtual {v2}, LKe/a$b;->a()Z

    move-result v7

    and-int/lit8 v10, v3, 0xe

    const/16 v11, 0xe0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v13, 0x0

    move-object/from16 v1, p1

    move-object v2, v4

    move-object v3, v5

    move-object v4, v6

    move v5, v7

    move v6, v8

    move v7, v9

    move v8, v13

    move-object/from16 v9, p3

    invoke-static/range {v1 .. v11}, LBe/z0;->b(Landroidx/compose/ui/e;Ls9/d;Ls9/d;Ls9/d;ZIIILT/l;II)V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    goto/16 :goto_5

    :cond_f
    instance-of v4, v2, LKe/a$f;

    if-eqz v4, :cond_10

    const v4, 0x42e5ba7d

    invoke-interface {v12, v4}, LT/l;->U(I)V

    check-cast v2, LKe/a$f;

    and-int/lit8 v3, v3, 0xe

    invoke-static {v1, v2, v12, v3}, LKe/c;->b(Landroidx/compose/ui/e;LKe/a$f;LT/l;I)V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    goto/16 :goto_5

    :cond_10
    instance-of v4, v2, LKe/a$h;

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v4, :cond_13

    const v1, 0x42e5cf11

    invoke-interface {v12, v1}, LT/l;->U(I)V

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v3, 0x0

    invoke-static {v1, v3, v7, v6}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    const/16 v4, 0x8

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v8

    invoke-static {v1, v3, v8, v7, v6}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v13

    int-to-float v1, v5

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v14

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v16

    const/16 v18, 0xa

    const/16 v19, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    invoke-static/range {v13 .. v19}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    check-cast v2, LKe/a$h;

    invoke-virtual {v2}, LKe/a$h;->a()LAf/c;

    move-result-object v2

    iget-object v3, v0, LJe/e$a;->a:LJe/c;

    const v4, 0x42e5ee60

    invoke-interface {v12, v4}, LT/l;->U(I)V

    invoke-interface {v12, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface/range {p3 .. p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_11

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_12

    :cond_11
    new-instance v5, LJe/e$a$c;

    invoke-direct {v5, v3}, LJe/e$a$c;-><init>(Ljava/lang/Object;)V

    invoke-interface {v12, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_12
    check-cast v5, Lth/g;

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    move-object v3, v5

    check-cast v3, Lmh/l;

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object/from16 v4, p3

    invoke-static/range {v1 .. v6}, LAf/l;->f(Landroidx/compose/ui/e;LAf/c;Lmh/l;LT/l;II)V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    goto :goto_5

    :cond_13
    instance-of v4, v2, LKe/a$d;

    if-eqz v4, :cond_16

    const v2, 0x42e5fa3a

    invoke-interface {v12, v2}, LT/l;->U(I)V

    iget-object v2, v0, LJe/e$a;->a:LJe/c;

    invoke-virtual {v2}, LJe/c;->q0()LLi/N;

    move-result-object v2

    const/4 v4, 0x0

    invoke-static {v2, v6, v12, v4, v7}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v2

    invoke-interface {v2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LKe/m;

    iget-object v4, v0, LJe/e$a;->a:LJe/c;

    const v5, 0x42e60ea3

    invoke-interface {v12, v5}, LT/l;->U(I)V

    invoke-interface {v12, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface/range {p3 .. p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_14

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v6, v5, :cond_15

    :cond_14
    new-instance v6, LJe/e$a$d;

    invoke-direct {v6, v4}, LJe/e$a$d;-><init>(Ljava/lang/Object;)V

    invoke-interface {v12, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_15
    check-cast v6, Lth/g;

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    check-cast v6, Lmh/a;

    and-int/lit8 v3, v3, 0xe

    invoke-static {v1, v2, v6, v12, v3}, LKe/s;->h(Landroidx/compose/ui/e;LKe/m;Lmh/a;LT/l;I)V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    goto :goto_5

    :cond_16
    instance-of v4, v2, LKe/a$e;

    if-eqz v4, :cond_18

    const v4, 0x42e61a1f

    invoke-interface {v12, v4}, LT/l;->U(I)V

    check-cast v2, LKe/a$e;

    invoke-virtual {v2}, LKe/a$e;->a()LKe/l;

    move-result-object v2

    and-int/lit8 v3, v3, 0xe

    invoke-static {v1, v2, v12, v3}, LKe/s;->j(Landroidx/compose/ui/e;LKe/l;LT/l;I)V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_17

    invoke-static {}, LT/o;->P()V

    :cond_17
    :goto_6
    return-void

    :cond_18
    const v1, 0x42e548ca

    invoke-interface {v12, v1}, LT/l;->U(I)V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/e;

    check-cast p2, LKe/a;

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, LJe/e$a;->a(Landroidx/compose/ui/e;LKe/a;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
