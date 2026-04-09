.class final LN/Q0$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/Q0;->f(Landroidx/compose/ui/e;LN/R0;Ljava/util/Map;Lw/q;ZZLy/m;Lmh/p;LN/x0;F)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Map;

.field final synthetic b:LN/R0;

.field final synthetic c:LN/x0;

.field final synthetic d:Lmh/p;

.field final synthetic e:F

.field final synthetic f:Lw/q;

.field final synthetic g:Z

.field final synthetic h:Ly/m;

.field final synthetic i:Z


# direct methods
.method constructor <init>(Ljava/util/Map;LN/R0;LN/x0;Lmh/p;FLw/q;ZLy/m;Z)V
    .locals 0

    iput-object p1, p0, LN/Q0$b;->a:Ljava/util/Map;

    iput-object p2, p0, LN/Q0$b;->b:LN/R0;

    iput-object p3, p0, LN/Q0$b;->c:LN/x0;

    iput-object p4, p0, LN/Q0$b;->d:Lmh/p;

    iput p5, p0, LN/Q0$b;->e:F

    iput-object p6, p0, LN/Q0$b;->f:Lw/q;

    iput-boolean p7, p0, LN/Q0$b;->g:Z

    iput-object p8, p0, LN/Q0$b;->h:Ly/m;

    iput-boolean p9, p0, LN/Q0$b;->i:Z

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const v2, 0x29934e9

    invoke-interface {v1, v2}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, -0x1

    const-string v4, "androidx.compose.material.swipeable.<anonymous> (Swipeable.kt:596)"

    move/from16 v5, p3

    invoke-static {v2, v5, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object v2, v0, LN/Q0$b;->a:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_7

    iget-object v2, v0, LN/Q0$b;->a:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, LZg/v;->g0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    iget-object v3, v0, LN/Q0$b;->a:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->size()I

    move-result v3

    if-ne v2, v3, :cond_6

    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v2

    invoke-interface {v1, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, LY0/d;

    iget-object v2, v0, LN/Q0$b;->b:LN/R0;

    iget-object v3, v0, LN/Q0$b;->a:Ljava/util/Map;

    invoke-virtual {v2, v3}, LN/R0;->k(Ljava/util/Map;)V

    iget-object v2, v0, LN/Q0$b;->a:Ljava/util/Map;

    iget-object v11, v0, LN/Q0$b;->b:LN/R0;

    iget-object v3, v0, LN/Q0$b;->b:LN/R0;

    invoke-interface {v1, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    iget-object v4, v0, LN/Q0$b;->a:Ljava/util/Map;

    invoke-interface {v1, v4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    iget-object v4, v0, LN/Q0$b;->c:LN/x0;

    invoke-interface {v1, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    iget-object v4, v0, LN/Q0$b;->d:Lmh/p;

    invoke-interface {v1, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-interface {v1, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    iget v4, v0, LN/Q0$b;->e:F

    invoke-interface {v1, v4}, LT/l;->g(F)Z

    move-result v4

    or-int/2addr v3, v4

    iget-object v4, v0, LN/Q0$b;->b:LN/R0;

    iget-object v5, v0, LN/Q0$b;->a:Ljava/util/Map;

    iget-object v6, v0, LN/Q0$b;->c:LN/x0;

    iget-object v8, v0, LN/Q0$b;->d:Lmh/p;

    iget v9, v0, LN/Q0$b;->e:F

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v10

    if-nez v3, :cond_1

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v10, v3, :cond_2

    :cond_1
    new-instance v12, LN/Q0$b$a;

    const/4 v10, 0x0

    move-object v3, v12

    invoke-direct/range {v3 .. v10}, LN/Q0$b$a;-><init>(LN/R0;Ljava/util/Map;LN/x0;LY0/d;Lmh/p;FLdh/e;)V

    invoke-interface {v1, v12}, LT/l;->K(Ljava/lang/Object;)V

    move-object v10, v12

    :cond_2
    check-cast v10, Lmh/p;

    const/4 v3, 0x0

    invoke-static {v2, v11, v10, v1, v3}, LT/O;->e(Ljava/lang/Object;Ljava/lang/Object;Lmh/p;LT/l;I)V

    sget-object v12, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    iget-object v2, v0, LN/Q0$b;->b:LN/R0;

    invoke-virtual {v2}, LN/R0;->x()Z

    move-result v17

    iget-object v2, v0, LN/Q0$b;->b:LN/R0;

    invoke-virtual {v2}, LN/R0;->p()Lw/m;

    move-result-object v13

    iget-object v14, v0, LN/Q0$b;->f:Lw/q;

    iget-boolean v15, v0, LN/Q0$b;->g:Z

    iget-object v2, v0, LN/Q0$b;->h:Ly/m;

    iget-object v3, v0, LN/Q0$b;->b:LN/R0;

    invoke-interface {v1, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    iget-object v4, v0, LN/Q0$b;->b:LN/R0;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_3

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v5, v3, :cond_4

    :cond_3
    new-instance v5, LN/Q0$b$b;

    const/4 v3, 0x0

    invoke-direct {v5, v4, v3}, LN/Q0$b$b;-><init>(LN/R0;Ldh/e;)V

    invoke-interface {v1, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    move-object/from16 v19, v5

    check-cast v19, Lmh/q;

    iget-boolean v3, v0, LN/Q0$b;->i:Z

    const/16 v21, 0x20

    const/16 v22, 0x0

    const/16 v18, 0x0

    move-object/from16 v16, v2

    move/from16 v20, v3

    invoke-static/range {v12 .. v22}, Lw/l;->h(Landroidx/compose/ui/e;Lw/m;Lw/q;ZLy/m;ZLmh/q;Lmh/q;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    return-object v2

    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "You cannot have two anchors mapped to the same state."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "You must have at least one anchor."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LN/Q0$b;->a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;

    move-result-object p1

    return-object p1
.end method
