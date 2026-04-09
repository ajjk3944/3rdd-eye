.class final LLe/s$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLe/s;->e(Landroidx/compose/ui/e;LLe/d;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LT/z1;

.field final synthetic b:LLe/d;


# direct methods
.method constructor <init>(LT/z1;LLe/d;)V
    .locals 0

    iput-object p1, p0, LLe/s$c;->a:LT/z1;

    iput-object p2, p0, LLe/s$c;->b:LLe/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LT/z1;)LYg/J;
    .locals 0

    invoke-static {p0}, LLe/s$c;->c(LT/z1;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LT/z1;)LYg/J;
    .locals 0

    invoke-static {p0}, LLe/s;->i(LT/z1;)LBe/b0;

    move-result-object p0

    invoke-virtual {p0}, LBe/b0;->d()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(Lz/N;LT/l;I)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v11, p2

    const-string v2, "padding"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_1

    invoke-interface {v11, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p3, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p3

    :goto_1
    and-int/lit8 v3, v2, 0x13

    const/16 v4, 0x12

    if-ne v3, v4, :cond_3

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_5

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, -0x1

    const-string v4, "com.ui.wifiman.ui.discovery.DiscoveryHomeUi.<anonymous> (DiscoveryHomeUi.kt:83)"

    const v5, 0x6e47db28

    invoke-static {v5, v2, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    sget-object v12, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v12, v1}, Landroidx/compose/foundation/layout/o;->h(Landroidx/compose/ui/e;Lz/N;)Landroidx/compose/ui/e;

    move-result-object v1

    iget-object v13, v0, LLe/s$c;->b:LLe/d;

    iget-object v14, v0, LLe/s$c;->a:LT/z1;

    sget-object v2, Lz/c;->a:Lz/c;

    invoke-virtual {v2}, Lz/c;->g()Lz/c$m;

    move-result-object v2

    sget-object v3, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v3}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v3

    const/4 v15, 0x0

    invoke-static {v2, v3, v11, v15}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v2

    invoke-static {v11, v15}, LT/j;->a(LT/l;I)I

    move-result v3

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v4

    invoke-static {v11, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v5, LE0/g;->K:LE0/g$a;

    invoke-virtual {v5}, LE0/g$a;->a()Lmh/a;

    move-result-object v6

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v7

    if-nez v7, :cond_5

    invoke-static {}, LT/j;->c()V

    :cond_5
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v11, v6}, LT/l;->D(Lmh/a;)V

    goto :goto_3

    :cond_6
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_3
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v6

    invoke-virtual {v5}, LE0/g$a;->e()Lmh/p;

    move-result-object v7

    invoke-static {v6, v2, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v5}, LE0/g$a;->g()Lmh/p;

    move-result-object v2

    invoke-static {v6, v4, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v5}, LE0/g$a;->b()Lmh/p;

    move-result-object v2

    invoke-interface {v6}, LT/l;->o()Z

    move-result v4

    if-nez v4, :cond_7

    invoke-interface {v6}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    :cond_7
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v6, v4}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v6, v3, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_8
    invoke-virtual {v5}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v6, v1, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v16, Lz/k;->a:Lz/k;

    const/4 v10, 0x0

    const/4 v9, 0x1

    const/4 v8, 0x0

    invoke-static {v12, v10, v9, v8}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v2, Lla/a;->a:Lla/a;

    sget v3, Lla/a;->b:I

    invoke-virtual {v2, v11, v3}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v2

    invoke-virtual {v2}, Lra/a;->a()Lra/b;

    move-result-object v2

    invoke-virtual {v2}, Lra/b;->b()Lra/b$a$b;

    move-result-object v2

    invoke-virtual {v2}, Lra/b$a$b;->d()F

    move-result v2

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1, v11, v15}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-virtual {v13}, LLe/d;->r0()LLi/N;

    move-result-object v1

    invoke-static {v1, v8, v11, v15, v9}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LLe/c;

    invoke-virtual {v13}, LLe/d;->q0()LLi/N;

    move-result-object v2

    invoke-static {v2, v8, v11, v15, v9}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v2

    invoke-interface {v2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb8/c;

    invoke-static {v1, v2, v11, v15}, LLe/s;->j(LLe/c;Lb8/c;LT/l;I)LJ9/j;

    move-result-object v2

    if-eqz v1, :cond_9

    invoke-static {v14}, LLe/s;->i(LT/z1;)LBe/b0;

    move-result-object v1

    invoke-virtual {v1}, LBe/b0;->c()LT/q0;

    move-result-object v1

    invoke-interface {v1}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_9

    move v3, v9

    goto :goto_4

    :cond_9
    move v3, v15

    :goto_4
    new-instance v1, LLe/s$c$a;

    invoke-direct {v1, v2, v13}, LLe/s$c$a;-><init>(LJ9/j;LLe/d;)V

    const v2, 0x25f66a9a

    const/16 v7, 0x36

    invoke-static {v2, v9, v1, v11, v7}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v17

    const v18, 0x180006

    const/16 v19, 0x1e

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v20, 0x0

    move-object/from16 v1, v16

    move v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object/from16 v6, v20

    move-object/from16 v7, v17

    move-object/from16 v8, p2

    move/from16 v9, v18

    move/from16 v10, v19

    invoke-static/range {v1 .. v10}, Lq/d;->d(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-virtual {v13}, LLe/d;->o0()LLi/N;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v1, v3, v11, v15, v2}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LLe/a;

    const/4 v4, 0x0

    invoke-static {v12, v4, v2, v3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v17

    const/16 v20, 0x2

    const/16 v21, 0x0

    const/high16 v18, 0x3f800000    # 1.0f

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Lz/j;->b(Lz/j;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    new-instance v4, LLe/s$c$b;

    invoke-direct {v4, v13, v14}, LLe/s$c$b;-><init>(LLe/d;LT/z1;)V

    const v5, 0x7f739448

    const/16 v6, 0x36

    invoke-static {v5, v2, v4, v11, v6}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v5

    const/16 v7, 0x6c00

    const/4 v8, 0x4

    const/4 v4, 0x0

    const-string v6, "contentCrossfade"

    move-object v2, v3

    move-object v3, v4

    move-object v4, v6

    move-object/from16 v6, p2

    invoke-static/range {v1 .. v8}, Lq/j;->a(Ljava/lang/Object;Landroidx/compose/ui/e;Lr/H;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    iget-object v1, v0, LLe/s$c;->a:LT/z1;

    invoke-static {v1}, LLe/s;->i(LT/z1;)LBe/b0;

    move-result-object v1

    invoke-virtual {v1}, LBe/b0;->c()LT/q0;

    move-result-object v1

    invoke-interface {v1}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const v2, -0x7f522d8e

    invoke-interface {v11, v2}, LT/l;->U(I)V

    iget-object v2, v0, LLe/s$c;->a:LT/z1;

    invoke-interface {v11, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    iget-object v3, v0, LLe/s$c;->a:LT/z1;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_a

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_b

    :cond_a
    new-instance v4, LLe/t;

    invoke-direct {v4, v3}, LLe/t;-><init>(LT/z1;)V

    invoke-interface {v11, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    check-cast v4, Lmh/a;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-static {v1, v4, v11, v15, v15}, Ld/a;->a(ZLmh/a;LT/l;II)V

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

    check-cast p1, Lz/N;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LLe/s$c;->b(Lz/N;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
