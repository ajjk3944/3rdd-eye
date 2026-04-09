.class final Lcom/ui/wifiman/ui/signal/P$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/signal/P;->b(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/e;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;Lcom/ui/wifiman/ui/signal/N;Lcom/ui/wifiman/ui/signal/m;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/ui/signal/e;

.field final synthetic b:Lcom/ui/wifiman/ui/signal/N;

.field final synthetic c:Lcom/ui/wifiman/ui/signal/m;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/ui/signal/e;Lcom/ui/wifiman/ui/signal/N;Lcom/ui/wifiman/ui/signal/m;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/signal/P$b;->a:Lcom/ui/wifiman/ui/signal/e;

    iput-object p2, p0, Lcom/ui/wifiman/ui/signal/P$b;->b:Lcom/ui/wifiman/ui/signal/N;

    iput-object p3, p0, Lcom/ui/wifiman/ui/signal/P$b;->c:Lcom/ui/wifiman/ui/signal/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/ui/wifiman/ui/signal/N;Lcom/ui/wifiman/ui/signal/m;Lf2/u;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ui/wifiman/ui/signal/P$b;->f(Lcom/ui/wifiman/ui/signal/N;Lcom/ui/wifiman/ui/signal/m;Lf2/u;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/ui/wifiman/ui/signal/e;LJ9/a;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/ui/signal/P$b;->e(Lcom/ui/wifiman/ui/signal/e;LJ9/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lcom/ui/wifiman/ui/signal/e;LJ9/a;)LYg/J;
    .locals 2

    const-string v0, "tab"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LJ9/a;->c()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    sget-object p1, Lcom/ui/wifiman/ui/signal/d;->FLOORPLAN:Lcom/ui/wifiman/ui/signal/d;

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, LJ9/a;->c()I

    move-result p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "unknown tab id "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    sget-object p1, Lcom/ui/wifiman/ui/signal/d;->SIGNAL:Lcom/ui/wifiman/ui/signal/d;

    :goto_0
    invoke-virtual {p0, p1}, Lcom/ui/wifiman/ui/signal/e;->o0(Lcom/ui/wifiman/ui/signal/d;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final f(Lcom/ui/wifiman/ui/signal/N;Lcom/ui/wifiman/ui/signal/m;Lf2/u;)LYg/J;
    .locals 9

    const-string v0, "$this$NavHost"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/ui/signal/P$b$a;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/ui/signal/P$b$a;-><init>(Lcom/ui/wifiman/ui/signal/N;)V

    const p0, 0x39fbd890

    const/4 v1, 0x1

    invoke-static {p0, v1, v0}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v6

    const/4 v7, 0x6

    const/4 v8, 0x0

    const-string v3, "SIGNAL"

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p2

    invoke-static/range {v2 .. v8}, LAe/a;->c(Lf2/u;Ljava/lang/String;Ljava/util/List;LAe/n;Lmh/q;ILjava/lang/Object;)V

    new-instance p0, Lcom/ui/wifiman/ui/signal/P$b$b;

    invoke-direct {p0, p1}, Lcom/ui/wifiman/ui/signal/P$b$b;-><init>(Lcom/ui/wifiman/ui/signal/m;)V

    const p1, 0x3ed74507

    invoke-static {p1, v1, p0}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v6

    const-string v3, "FLOORPLAN"

    invoke-static/range {v2 .. v8}, LAe/a;->c(Lf2/u;Ljava/lang/String;Ljava/util/List;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final c(Lz/N;LT/l;I)V
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v15, p2

    const-string v2, "scaffoldPadding"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_1

    invoke-interface {v15, v1}, LT/l;->T(Ljava/lang/Object;)Z

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

    goto/16 :goto_7

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, -0x1

    const-string v4, "com.ui.wifiman.ui.signal.SignalTabUi.<anonymous> (SignalTabUi.kt:74)"

    const v5, -0x31d3fbc4

    invoke-static {v5, v2, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    sget-object v9, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v10, 0x0

    const/4 v14, 0x1

    const/4 v13, 0x0

    invoke-static {v9, v10, v14, v13}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/o;->h(Landroidx/compose/ui/e;Lz/N;)Landroidx/compose/ui/e;

    move-result-object v1

    iget-object v12, v0, Lcom/ui/wifiman/ui/signal/P$b;->a:Lcom/ui/wifiman/ui/signal/e;

    iget-object v11, v0, Lcom/ui/wifiman/ui/signal/P$b;->b:Lcom/ui/wifiman/ui/signal/N;

    iget-object v8, v0, Lcom/ui/wifiman/ui/signal/P$b;->c:Lcom/ui/wifiman/ui/signal/m;

    sget-object v2, Lz/c;->a:Lz/c;

    invoke-virtual {v2}, Lz/c;->g()Lz/c$m;

    move-result-object v2

    sget-object v16, Lf0/c;->a:Lf0/c$a;

    invoke-virtual/range {v16 .. v16}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v3

    const/4 v7, 0x0

    invoke-static {v2, v3, v15, v7}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v2

    invoke-static {v15, v7}, LT/j;->a(LT/l;I)I

    move-result v3

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v4

    invoke-static {v15, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v17, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->a()Lmh/a;

    move-result-object v5

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v6

    if-nez v6, :cond_5

    invoke-static {}, LT/j;->c()V

    :cond_5
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v15, v5}, LT/l;->D(Lmh/a;)V

    goto :goto_3

    :cond_6
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_3
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v5

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->e()Lmh/p;

    move-result-object v6

    invoke-static {v5, v2, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->g()Lmh/p;

    move-result-object v2

    invoke-static {v5, v4, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->b()Lmh/p;

    move-result-object v2

    invoke-interface {v5}, LT/l;->o()Z

    move-result v4

    if-nez v4, :cond_7

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    :cond_7
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v5, v4}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v5, v3, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_8
    invoke-virtual/range {v17 .. v17}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v5, v1, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v6, Lz/k;->a:Lz/k;

    invoke-virtual {v12}, Lcom/ui/wifiman/ui/signal/e;->n0()LLi/N;

    move-result-object v1

    invoke-static {v1, v13, v15, v7, v14}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ui/wifiman/ui/signal/d;

    invoke-static {v1, v15, v7}, Lcom/ui/wifiman/ui/signal/P;->d(Lcom/ui/wifiman/ui/signal/d;LT/l;I)LJ9/j;

    move-result-object v2

    invoke-static {v9, v10, v14, v13}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v18

    sget-object v5, Lla/a;->a:Lla/a;

    sget v4, Lla/a;->b:I

    invoke-virtual {v5, v15, v4}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v1

    invoke-virtual {v1}, Lra/a;->a()Lra/b;

    move-result-object v1

    invoke-virtual {v1}, Lra/b;->a()Lra/b$a$a;

    move-result-object v1

    invoke-virtual {v1}, Lra/b$a$a;->c()F

    move-result v19

    invoke-virtual {v5, v15, v4}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v1

    invoke-virtual {v1}, Lra/a;->a()Lra/b;

    move-result-object v1

    invoke-virtual {v1}, Lra/b;->a()Lra/b$a$a;

    move-result-object v1

    invoke-virtual {v1}, Lra/b$a$a;->c()F

    move-result v21

    const/16 v23, 0xa

    const/16 v24, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    invoke-static/range {v18 .. v24}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    const v3, 0x69c8c8c7

    invoke-interface {v15, v3}, LT/l;->U(I)V

    invoke-interface {v15, v12}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v3, :cond_9

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v7, v3, :cond_a

    :cond_9
    new-instance v7, Lcom/ui/wifiman/ui/signal/Q;

    invoke-direct {v7, v12}, Lcom/ui/wifiman/ui/signal/Q;-><init>(Lcom/ui/wifiman/ui/signal/e;)V

    invoke-interface {v15, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_a
    check-cast v7, Lmh/l;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/16 v18, 0x0

    const/16 v19, 0xc

    const/4 v3, 0x0

    const/16 v20, 0x0

    move/from16 v25, v4

    move-object/from16 v4, v20

    move-object/from16 v26, v5

    move-object v5, v7

    move-object v7, v6

    move-object/from16 v6, p2

    move-object v13, v7

    const/4 v10, 0x0

    move/from16 v7, v18

    move-object/from16 v27, v8

    move/from16 v8, v19

    invoke-static/range {v1 .. v8}, LJ9/h;->g(Landroidx/compose/ui/e;LJ9/j;ZLJ9/i;Lmh/l;LT/l;II)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-interface {v13, v9, v1, v14}, Lz/j;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual/range {v16 .. v16}, Lf0/c$a;->o()Lf0/c;

    move-result-object v2

    invoke-static {v2, v10}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v2

    invoke-static {v15, v10}, LT/j;->a(LT/l;I)I

    move-result v3

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v4

    invoke-static {v15, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->a()Lmh/a;

    move-result-object v5

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v6

    if-nez v6, :cond_b

    invoke-static {}, LT/j;->c()V

    :cond_b
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-interface {v15, v5}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_c
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_4
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v5

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->e()Lmh/p;

    move-result-object v6

    invoke-static {v5, v2, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->g()Lmh/p;

    move-result-object v2

    invoke-static {v5, v4, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->b()Lmh/p;

    move-result-object v2

    invoke-interface {v5}, LT/l;->o()Z

    move-result v4

    if-nez v4, :cond_d

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_e

    :cond_d
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v5, v4}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v5, v3, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_e
    invoke-virtual/range {v17 .. v17}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v5, v1, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    new-array v1, v10, [Lf2/D;

    invoke-static {v1, v15, v10}, Lg2/l;->d([Lf2/D;LT/l;I)Lf2/w;

    move-result-object v13

    const/4 v1, 0x0

    const/4 v8, 0x0

    invoke-static {v9, v1, v14, v8}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    const v1, -0x4b575c0e

    invoke-interface {v15, v1}, LT/l;->U(I)V

    invoke-interface {v15, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    move-object/from16 v2, v27

    invoke-interface {v15, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v1, v4

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_f

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v4, v1, :cond_10

    :cond_f
    new-instance v4, Lcom/ui/wifiman/ui/signal/S;

    invoke-direct {v4, v11, v2}, Lcom/ui/wifiman/ui/signal/S;-><init>(Lcom/ui/wifiman/ui/signal/N;Lcom/ui/wifiman/ui/signal/m;)V

    invoke-interface {v15, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_10
    move-object v11, v4

    check-cast v11, Lmh/l;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/16 v16, 0x0

    const/16 v17, 0x3f8

    const-string v2, "SIGNAL"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x180

    move-object v1, v13

    move-object/from16 v21, v8

    move-object v8, v9

    move-object/from16 v9, v18

    move-object/from16 v10, v19

    move-object/from16 v18, v12

    move-object/from16 v12, p2

    move-object/from16 v28, v13

    move/from16 v13, v20

    move/from16 v14, v16

    move-object v0, v15

    move/from16 v15, v17

    invoke-static/range {v1 .. v15}, Lg2/m;->b(Lf2/w;Ljava/lang/String;Landroidx/compose/ui/e;Lf0/c;Ljava/lang/String;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;LT/l;III)V

    const v1, -0x4b573014

    invoke-interface {v0, v1}, LT/l;->U(I)V

    move-object/from16 v1, v28

    invoke-interface {v0, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_12

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_11

    goto :goto_5

    :cond_11
    const/4 v2, 0x0

    goto :goto_6

    :cond_12
    :goto_5
    new-instance v3, Lcom/ui/wifiman/ui/signal/P$b$c;

    const/4 v2, 0x0

    invoke-direct {v3, v1, v2}, Lcom/ui/wifiman/ui/signal/P$b$c;-><init>(Lf2/w;Ldh/e;)V

    invoke-interface {v0, v3}, LT/l;->K(Ljava/lang/Object;)V

    :goto_6
    check-cast v3, Lmh/p;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/4 v4, 0x0

    invoke-static {v1, v3, v0, v4}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-virtual/range {v18 .. v18}, Lcom/ui/wifiman/ui/signal/e;->n0()LLi/N;

    move-result-object v3

    const/4 v5, 0x1

    invoke-static {v3, v2, v0, v4, v5}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v3

    invoke-interface {v3}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ui/wifiman/ui/signal/d;

    const v5, -0x4b5716ff

    invoke-interface {v0, v5}, LT/l;->U(I)V

    invoke-interface {v0, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface {v0, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_13

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v6, v5, :cond_14

    :cond_13
    new-instance v6, Lcom/ui/wifiman/ui/signal/P$b$d;

    invoke-direct {v6, v1, v3, v2}, Lcom/ui/wifiman/ui/signal/P$b$d;-><init>(Lf2/w;Lcom/ui/wifiman/ui/signal/d;Ldh/e;)V

    invoke-interface {v0, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_14
    check-cast v6, Lmh/p;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-static {v3, v6, v0, v4}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    move/from16 v2, v25

    move-object/from16 v1, v26

    invoke-virtual {v1, v0, v2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a;->e()Lma/a$e;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$e;->a()J

    move-result-wide v2

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v1, 0x0

    move-object/from16 v4, p2

    invoke-static/range {v1 .. v6}, LEe/B;->b(Landroidx/compose/ui/e;JLT/l;II)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-static {}, LT/o;->P()V

    :cond_15
    :goto_7
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/N;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/signal/P$b;->c(Lz/N;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
