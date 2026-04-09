.class final LBe/M$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBe/M;->d(Landroidx/compose/ui/e;LQ/z;Lmh/q;Lmh/q;Lmh/q;ZLmh/q;ZLmh/p;Lmh/p;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:LQ/z;

.field final synthetic c:Landroidx/compose/ui/e;

.field final synthetic d:Lmh/q;

.field final synthetic e:Lmh/q;

.field final synthetic f:Lmh/q;

.field final synthetic g:Z

.field final synthetic h:Lmh/p;

.field final synthetic i:Lmh/q;


# direct methods
.method constructor <init>(ZLQ/z;Landroidx/compose/ui/e;Lmh/q;Lmh/q;Lmh/q;ZLmh/p;Lmh/q;)V
    .locals 0

    iput-boolean p1, p0, LBe/M$a;->a:Z

    iput-object p2, p0, LBe/M$a;->b:LQ/z;

    iput-object p3, p0, LBe/M$a;->c:Landroidx/compose/ui/e;

    iput-object p4, p0, LBe/M$a;->d:Lmh/q;

    iput-object p5, p0, LBe/M$a;->e:Lmh/q;

    iput-object p6, p0, LBe/M$a;->f:Lmh/q;

    iput-boolean p7, p0, LBe/M$a;->g:Z

    iput-object p8, p0, LBe/M$a;->h:Lmh/p;

    iput-object p9, p0, LBe/M$a;->i:Lmh/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LQ/z;F)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LBe/M$a;->f(LQ/z;F)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ZFLQ/z;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, LBe/M$a;->e(ZFLQ/z;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final e(ZFLQ/z;)LYg/J;
    .locals 0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, LQ/z;->getState()LQ/A;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, LQ/A;->e()F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    :goto_1
    neg-float p1, p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->b(Ljava/lang/Float;F)Z

    move-result p0

    if-nez p0, :cond_2

    if-eqz p2, :cond_2

    invoke-interface {p2}, LQ/z;->getState()LQ/A;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0, p1}, LQ/A;->h(F)V

    :cond_2
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final f(LQ/z;F)LYg/J;
    .locals 1

    invoke-interface {p0}, LQ/z;->getState()LQ/A;

    move-result-object v0

    invoke-interface {p0}, LQ/z;->getState()LQ/A;

    move-result-object p0

    invoke-virtual {p0}, LQ/A;->d()F

    move-result p0

    add-float/2addr p0, p1

    invoke-virtual {v0, p0}, LQ/A;->g(F)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final c(FFLT/l;I)V
    .locals 25

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v13, p3

    and-int/lit8 v2, p4, 0x30

    if-nez v2, :cond_1

    invoke-interface {v13, v1}, LT/l;->g(F)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0x20

    goto :goto_0

    :cond_0
    const/16 v2, 0x10

    :goto_0
    or-int v2, p4, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p4

    :goto_1
    and-int/lit16 v3, v2, 0x91

    const/16 v4, 0x90

    if-ne v3, v4, :cond_3

    invoke-interface/range {p3 .. p3}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p3 .. p3}, LT/l;->C()V

    goto/16 :goto_5

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, -0x1

    const-string v4, "com.ui.wifiman.ui.component.UiCardCollapsible.<anonymous> (TopScrollCollapsibleContainer.kt:50)"

    const v5, 0x5cb2db29

    invoke-static {v5, v2, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v2

    invoke-interface {v13, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LY0/d;

    invoke-interface {v2, v1}, LY0/d;->d1(F)F

    move-result v8

    const v1, 0x7efc1d66

    invoke-interface {v13, v1}, LT/l;->U(I)V

    iget-boolean v1, v0, LBe/M$a;->a:Z

    invoke-interface {v13, v1}, LT/l;->c(Z)Z

    move-result v1

    invoke-interface {v13, v8}, LT/l;->g(F)Z

    move-result v2

    or-int/2addr v1, v2

    iget-object v2, v0, LBe/M$a;->b:LQ/z;

    invoke-interface {v13, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    iget-boolean v2, v0, LBe/M$a;->a:Z

    iget-object v3, v0, LBe/M$a;->b:LQ/z;

    invoke-interface/range {p3 .. p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_5

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v4, v1, :cond_6

    :cond_5
    new-instance v4, LBe/K;

    invoke-direct {v4, v2, v8, v3}, LBe/K;-><init>(ZFLQ/z;)V

    invoke-interface {v13, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v4, Lmh/a;

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    const/4 v1, 0x0

    invoke-static {v4, v13, v1}, LT/O;->g(Lmh/a;LT/l;I)V

    const v2, 0x7efc4e46

    invoke-interface {v13, v2}, LT/l;->U(I)V

    iget-object v2, v0, LBe/M$a;->b:LQ/z;

    const/4 v3, 0x0

    if-eqz v2, :cond_b

    invoke-interface {v2}, LQ/z;->d()Z

    move-result v2

    if-nez v2, :cond_b

    sget-object v14, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    sget-object v16, Lw/q;->Vertical:Lw/q;

    const v2, 0x7efc63ae

    invoke-interface {v13, v2}, LT/l;->U(I)V

    iget-object v2, v0, LBe/M$a;->b:LQ/z;

    invoke-interface {v13, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    iget-object v4, v0, LBe/M$a;->b:LQ/z;

    invoke-interface/range {p3 .. p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_7

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v5, v2, :cond_8

    :cond_7
    new-instance v5, LBe/L;

    invoke-direct {v5, v4}, LBe/L;-><init>(LQ/z;)V

    invoke-interface {v13, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    check-cast v5, Lmh/l;

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    invoke-static {v5, v13, v1}, Lw/l;->i(Lmh/l;LT/l;I)Lw/m;

    move-result-object v15

    const v2, 0x7efc784b

    invoke-interface {v13, v2}, LT/l;->U(I)V

    iget-object v2, v0, LBe/M$a;->b:LQ/z;

    invoke-interface {v13, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    iget-object v4, v0, LBe/M$a;->b:LQ/z;

    invoke-interface/range {p3 .. p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_9

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v5, v2, :cond_a

    :cond_9
    new-instance v5, LBe/M$a$b;

    invoke-direct {v5, v4, v3}, LBe/M$a$b;-><init>(LQ/z;Ldh/e;)V

    invoke-interface {v13, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_a
    move-object/from16 v21, v5

    check-cast v21, Lmh/q;

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    const/16 v23, 0xbc

    const/16 v24, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    invoke-static/range {v14 .. v24}, Lw/l;->h(Landroidx/compose/ui/e;Lw/m;Lw/q;ZLy/m;ZLmh/q;Lmh/q;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    goto :goto_3

    :cond_b
    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    :goto_3
    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    iget-object v4, v0, LBe/M$a;->c:Landroidx/compose/ui/e;

    invoke-interface {v4, v2}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    iget-object v4, v0, LBe/M$a;->d:Lmh/q;

    iget-object v14, v0, LBe/M$a;->e:Lmh/q;

    iget-object v5, v0, LBe/M$a;->f:Lmh/q;

    iget-object v6, v0, LBe/M$a;->b:LQ/z;

    iget-boolean v7, v0, LBe/M$a;->a:Z

    iget-boolean v9, v0, LBe/M$a;->g:Z

    iget-object v10, v0, LBe/M$a;->h:Lmh/p;

    iget-object v11, v0, LBe/M$a;->i:Lmh/q;

    sget-object v12, Lz/c;->a:Lz/c;

    invoke-virtual {v12}, Lz/c;->g()Lz/c$m;

    move-result-object v12

    sget-object v15, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v15}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v15

    invoke-static {v12, v15, v13, v1}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v12

    invoke-static {v13, v1}, LT/j;->a(LT/l;I)I

    move-result v1

    invoke-interface/range {p3 .. p3}, LT/l;->G()LT/x;

    move-result-object v15

    invoke-static {v13, v2}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    sget-object v16, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->a()Lmh/a;

    move-result-object v3

    invoke-interface/range {p3 .. p3}, LT/l;->x()LT/f;

    move-result-object v17

    if-nez v17, :cond_c

    invoke-static {}, LT/j;->c()V

    :cond_c
    invoke-interface/range {p3 .. p3}, LT/l;->u()V

    invoke-interface/range {p3 .. p3}, LT/l;->o()Z

    move-result v17

    if-eqz v17, :cond_d

    invoke-interface {v13, v3}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_d
    invoke-interface/range {p3 .. p3}, LT/l;->I()V

    :goto_4
    invoke-static/range {p3 .. p3}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v3

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->e()Lmh/p;

    move-result-object v0

    invoke-static {v3, v12, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->g()Lmh/p;

    move-result-object v0

    invoke-static {v3, v15, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->b()Lmh/p;

    move-result-object v0

    invoke-interface {v3}, LT/l;->o()Z

    move-result v12

    if-nez v12, :cond_e

    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v12, v15}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_f

    :cond_e
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v3, v12}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v1, v0}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_f
    invoke-virtual/range {v16 .. v16}, LE0/g$a;->f()Lmh/p;

    move-result-object v0

    invoke-static {v3, v2, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Lz/k;->a:Lz/k;

    const/4 v15, 0x6

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v13, v1}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v2, 0x0

    const/4 v12, 0x1

    const/4 v3, 0x0

    invoke-static {v1, v2, v12, v3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v4, Lla/a;->a:Lla/a;

    sget v15, Lla/a;->b:I

    invoke-virtual {v4, v13, v15}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v4

    invoke-virtual {v4}, Lra/a;->a()Lra/b;

    move-result-object v4

    invoke-virtual {v4}, Lra/b;->a()Lra/b$a$a;

    move-result-object v4

    invoke-virtual {v4}, Lra/b$a$a;->c()F

    move-result v4

    const/4 v15, 0x2

    invoke-static {v1, v4, v2, v15, v3}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    new-instance v2, LBe/M$a$a;

    move-object v3, v2

    move-object v4, v5

    move-object v5, v6

    move v6, v7

    move v7, v9

    move-object v9, v10

    move-object v10, v11

    invoke-direct/range {v3 .. v10}, LBe/M$a$a;-><init>(Lmh/q;LQ/z;ZZFLmh/p;Lmh/q;)V

    const/16 v3, 0x36

    const v4, -0x227aaff

    invoke-static {v4, v12, v2, v13, v3}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v9

    const/high16 v11, 0x6000000

    const/16 v12, 0xfe

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v10, p3

    invoke-static/range {v1 .. v12}, LB9/h;->i(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;Ls9/a;Lmh/a;Lmh/a;LB9/b;LB9/b;Lmh/q;LT/l;II)V

    const/4 v1, 0x6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v14, v0, v13, v1}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface/range {p3 .. p3}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-static {}, LT/o;->P()V

    :cond_10
    :goto_5
    return-void
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LY0/h;

    invoke-virtual {p1}, LY0/h;->s()F

    move-result p1

    check-cast p2, LY0/h;

    invoke-virtual {p2}, LY0/h;->s()F

    move-result p2

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, LBe/M$a;->c(FFLT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
