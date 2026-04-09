.class final LEe/z$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LEe/z;->B(Landroidx/compose/ui/e;LEe/g;ZLmh/l;ZZLmh/r;Lmh/r;Lmh/q;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/l;

.field final synthetic b:Z

.field final synthetic c:Lmh/r;

.field final synthetic d:Lmh/q;


# direct methods
.method constructor <init>(Lmh/l;ZLmh/r;Lmh/q;)V
    .locals 0

    iput-object p1, p0, LEe/z$e;->a:Lmh/l;

    iput-boolean p2, p0, LEe/z$e;->b:Z

    iput-object p3, p0, LEe/z$e;->c:Lmh/r;

    iput-object p4, p0, LEe/z$e;->d:Lmh/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/e;LEe/g$b;LT/l;I)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v13, p3

    const-string v3, "itemModifier"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "item"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v3, p4, 0x6

    if-nez v3, :cond_1

    invoke-interface {v13, v1}, LT/l;->T(Ljava/lang/Object;)Z

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

    if-nez v4, :cond_4

    and-int/lit8 v4, p4, 0x40

    if-nez v4, :cond_2

    invoke-interface {v13, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_2

    :cond_2
    invoke-interface {v13, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    :goto_2
    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_3

    :cond_3
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v3, v4

    :cond_4
    move v14, v3

    and-int/lit16 v3, v14, 0x93

    const/16 v4, 0x92

    if-ne v3, v4, :cond_6

    invoke-interface/range {p3 .. p3}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_4

    :cond_5
    invoke-interface/range {p3 .. p3}, LT/l;->C()V

    goto/16 :goto_7

    :cond_6
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_7

    const/4 v3, -0x1

    const-string v4, "com.ui.wifiman.ui.component.list.LazyActionCards.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LazyColumnCard.kt:427)"

    const v5, -0x3184383a

    invoke-static {v5, v14, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_7
    sget-object v3, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v3}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v3

    iget-object v4, v0, LEe/z$e;->a:Lmh/l;

    iget-boolean v5, v0, LEe/z$e;->b:Z

    iget-object v15, v0, LEe/z$e;->c:Lmh/r;

    iget-object v6, v0, LEe/z$e;->d:Lmh/q;

    sget-object v7, Lz/c;->a:Lz/c;

    invoke-virtual {v7}, Lz/c;->f()Lz/c$e;

    move-result-object v7

    const/16 v8, 0x30

    invoke-static {v7, v3, v13, v8}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v3

    const/4 v7, 0x0

    invoke-static {v13, v7}, LT/j;->a(LT/l;I)I

    move-result v7

    invoke-interface/range {p3 .. p3}, LT/l;->G()LT/x;

    move-result-object v8

    invoke-static {v13, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v9, LE0/g;->K:LE0/g$a;

    invoke-virtual {v9}, LE0/g$a;->a()Lmh/a;

    move-result-object v10

    invoke-interface/range {p3 .. p3}, LT/l;->x()LT/f;

    move-result-object v11

    if-nez v11, :cond_8

    invoke-static {}, LT/j;->c()V

    :cond_8
    invoke-interface/range {p3 .. p3}, LT/l;->u()V

    invoke-interface/range {p3 .. p3}, LT/l;->o()Z

    move-result v11

    if-eqz v11, :cond_9

    invoke-interface {v13, v10}, LT/l;->D(Lmh/a;)V

    goto :goto_5

    :cond_9
    invoke-interface/range {p3 .. p3}, LT/l;->I()V

    :goto_5
    invoke-static/range {p3 .. p3}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v10

    invoke-virtual {v9}, LE0/g$a;->e()Lmh/p;

    move-result-object v11

    invoke-static {v10, v3, v11}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v10, v8, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v10}, LT/l;->o()Z

    move-result v8

    if-nez v8, :cond_a

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_b

    :cond_a
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v10, v8}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v10, v7, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_b
    invoke-virtual {v9}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v10, v1, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Lz/Z;->a:Lz/Z;

    const v3, -0x7d733ccc

    invoke-interface {v13, v3}, LT/l;->U(I)V

    invoke-interface {v4, v2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    const/4 v12, 0x1

    if-eqz v3, :cond_c

    new-instance v3, LEe/z$e$a;

    invoke-direct {v3, v5, v6, v2}, LEe/z$e$a;-><init>(ZLmh/q;LEe/g$b;)V

    const/16 v4, 0x36

    const v6, -0x5acbe1e3

    invoke-static {v6, v12, v3, v13, v4}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v9

    const v11, 0x180006

    const/16 v16, 0x1e

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    move-object v3, v1

    move v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v10

    move-object/from16 v10, p3

    move v0, v12

    move/from16 v12, v16

    invoke-static/range {v3 .. v12}, Lq/d;->e(Lz/Y;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    goto :goto_6

    :cond_c
    move v0, v12

    :goto_6
    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-interface {v1, v3, v4, v0}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v0

    and-int/lit8 v1, v14, 0x70

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v15, v0, v2, v13, v1}, Lmh/r;->y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface/range {p3 .. p3}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, LT/o;->P()V

    :cond_d
    :goto_7
    return-void
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/e;

    check-cast p2, LEe/g$b;

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, LEe/z$e;->a(Landroidx/compose/ui/e;LEe/g$b;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
