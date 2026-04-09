.class final LCf/h$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCf/h$a;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LCf/d;

.field final synthetic b:LT/o0;


# direct methods
.method constructor <init>(LCf/d;LT/o0;)V
    .locals 0

    iput-object p1, p0, LCf/h$a$a;->a:LCf/d;

    iput-object p2, p0, LCf/h$a$a;->b:LT/o0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LCf/d;LT/o0;LS8/c;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, LCf/h$a$a;->c(LCf/d;LT/o0;LS8/c;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LCf/d;LT/o0;LS8/c;)LYg/J;
    .locals 2

    invoke-virtual {p0, p2}, LCf/d;->v0(LS8/c;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {p1, v0, v1}, LCf/h;->k(LT/o0;J)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(Lz/j;LT/l;I)V
    .locals 32

    move-object/from16 v0, p0

    move-object/from16 v11, p1

    move-object/from16 v12, p2

    const-string v1, "$this$UiCardCollapsible"

    invoke-static {v11, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p3, 0x6

    const/4 v13, 0x2

    if-nez v1, :cond_1

    invoke-interface {v12, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v13

    :goto_0
    or-int v1, p3, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p3

    :goto_1
    and-int/lit8 v2, v1, 0x13

    const/16 v3, 0x12

    if-ne v2, v3, :cond_3

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_5

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.wifi.network.Content.<anonymous>.<anonymous> (WifiNetworkDetailUi.kt:112)"

    const v4, -0x595a5c4b

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    iget-object v2, v0, LCf/h$a$a;->a:LCf/d;

    invoke-virtual {v2}, LCf/d;->q0()LLi/N;

    move-result-object v2

    const/4 v15, 0x0

    const/4 v10, 0x0

    const/4 v9, 0x1

    invoke-static {v2, v15, v12, v10, v9}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v2

    invoke-interface {v2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LDf/b;

    if-eqz v2, :cond_5

    move v3, v9

    goto :goto_3

    :cond_5
    move v3, v10

    :goto_3
    new-instance v4, LCf/h$a$a$a;

    invoke-direct {v4, v2}, LCf/h$a$a$a;-><init>(LDf/b;)V

    const v2, 0x952efdd

    const/16 v8, 0x36

    invoke-static {v2, v9, v4, v12, v8}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    and-int/lit8 v1, v1, 0xe

    const/high16 v2, 0x180000

    or-int v16, v1, v2

    const/16 v17, 0x1e

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v18, 0x0

    move-object/from16 v1, p1

    move v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object/from16 v6, v18

    move-object/from16 v8, p2

    move v14, v9

    move/from16 v9, v16

    move/from16 v10, v17

    invoke-static/range {v1 .. v10}, Lq/d;->d(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    sget-object v7, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v1, 0x0

    invoke-static {v7, v1, v14, v15}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    sget-object v3, Lla/a;->a:Lla/a;

    sget v4, Lla/a;->b:I

    invoke-virtual {v3, v12, v4}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v3

    invoke-virtual {v3}, Lra/a;->a()Lra/b;

    move-result-object v3

    invoke-virtual {v3}, Lra/b;->a()Lra/b$a$a;

    move-result-object v3

    invoke-virtual {v3}, Lra/b$a$a;->c()F

    move-result v3

    invoke-static {v2, v3, v1, v13, v15}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v19

    const/16 v1, 0x10

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v21

    const/16 v24, 0xd

    const/16 v25, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v19 .. v25}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v2, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v2}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v2

    iget-object v8, v0, LCf/h$a$a;->a:LCf/d;

    iget-object v3, v0, LCf/h$a$a;->b:LT/o0;

    sget-object v4, Lz/c;->a:Lz/c;

    invoke-virtual {v4}, Lz/c;->f()Lz/c$e;

    move-result-object v4

    const/16 v9, 0x30

    invoke-static {v4, v2, v12, v9}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v2

    const/4 v10, 0x0

    invoke-static {v12, v10}, LT/j;->a(LT/l;I)I

    move-result v4

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v5

    invoke-static {v12, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v6, LE0/g;->K:LE0/g$a;

    invoke-virtual {v6}, LE0/g$a;->a()Lmh/a;

    move-result-object v13

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v17

    if-nez v17, :cond_6

    invoke-static {}, LT/j;->c()V

    :cond_6
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v17

    if-eqz v17, :cond_7

    invoke-interface {v12, v13}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_7
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_4
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v13

    invoke-virtual {v6}, LE0/g$a;->e()Lmh/p;

    move-result-object v9

    invoke-static {v13, v2, v9}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v6}, LE0/g$a;->g()Lmh/p;

    move-result-object v2

    invoke-static {v13, v5, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v6}, LE0/g$a;->b()Lmh/p;

    move-result-object v2

    invoke-interface {v13}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_8

    invoke-interface {v13}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v5, v9}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_9

    :cond_8
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v13, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v13, v4, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_9
    invoke-virtual {v6}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v13, v1, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v19, Lz/Z;->a:Lz/Z;

    invoke-virtual {v8}, LCf/d;->s0()LLi/N;

    move-result-object v1

    invoke-static {v1, v15, v12, v10, v14}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LAf/B;

    const v1, 0x641a16ba

    invoke-interface {v12, v1}, LT/l;->U(I)V

    invoke-interface {v12, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_a

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v4, v1, :cond_b

    :cond_a
    new-instance v4, LCf/g;

    invoke-direct {v4, v8, v3}, LCf/g;-><init>(LCf/d;LT/o0;)V

    invoke-interface {v12, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    move-object v3, v4

    check-cast v3, Lmh/l;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, v7

    move-object/from16 v4, p2

    invoke-static/range {v1 .. v6}, LAf/E;->c(Landroidx/compose/ui/e;LAf/B;Lmh/l;LT/l;II)V

    const/16 v23, 0x2

    const/16 v24, 0x0

    const/high16 v21, 0x3f800000    # 1.0f

    const/16 v22, 0x0

    move-object/from16 v20, v7

    invoke-static/range {v19 .. v24}, Lz/Y;->b(Lz/Y;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v25

    const/4 v1, 0x4

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v28

    const/16 v30, 0xb

    const/16 v31, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    invoke-static/range {v25 .. v31}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1, v12, v10}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-static {}, LN/c0;->b()LT/H0;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v1

    new-instance v2, LCf/h$a$a$b;

    invoke-direct {v2, v8}, LCf/h$a$a$b;-><init>(LCf/d;)V

    const v3, -0x59f637ef

    const/16 v4, 0x36

    invoke-static {v3, v14, v2, v12, v4}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v2

    sget v3, LT/I0;->i:I

    const/16 v4, 0x30

    or-int/2addr v3, v4

    invoke-static {v1, v2, v12, v3}, LT/w;->a(LT/I0;Lmh/p;LT/l;I)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    iget-object v1, v0, LCf/h$a$a;->a:LCf/d;

    invoke-virtual {v1}, LCf/d;->p0()LLi/N;

    move-result-object v1

    invoke-static {v1, v15, v12, v10, v14}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    sget-object v1, LCf/a;->a:LCf/a;

    invoke-virtual {v1}, LCf/a;->b()Lmh/q;

    move-result-object v7

    const/16 v10, 0x1e

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v1, p1

    move-object/from16 v8, p2

    move/from16 v9, v16

    invoke-static/range {v1 .. v10}, Lq/d;->d(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-static {}, LT/o;->P()V

    :cond_c
    :goto_5
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/j;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LCf/h$a$a;->b(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
