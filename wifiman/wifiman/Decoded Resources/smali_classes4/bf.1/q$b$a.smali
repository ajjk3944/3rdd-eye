.class final Lbf/q$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbf/q$b;->f(Lz/N;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbf/q$b$a$b;
    }
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/runtime/snapshots/k;

.field final synthetic b:Ljava/util/Map;

.field final synthetic c:Lbf/e;

.field final synthetic d:Lbf/j;

.field final synthetic e:Lbf/k;


# direct methods
.method constructor <init>(Landroidx/compose/runtime/snapshots/k;Ljava/util/Map;Lbf/e;Lbf/j;Lbf/k;)V
    .locals 0

    iput-object p1, p0, Lbf/q$b$a;->a:Landroidx/compose/runtime/snapshots/k;

    iput-object p2, p0, Lbf/q$b$a;->b:Ljava/util/Map;

    iput-object p3, p0, Lbf/q$b$a;->c:Lbf/e;

    iput-object p4, p0, Lbf/q$b$a;->d:Lbf/j;

    iput-object p5, p0, Lbf/q$b$a;->e:Lbf/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/d;ZLT/l;I)V
    .locals 22

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v9, p3

    const-string v2, "$this$ReorderableItem"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, p4, 0x30

    const/16 v3, 0x10

    if-nez v2, :cond_1

    invoke-interface {v9, v1}, LT/l;->c(Z)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0x20

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int v2, p4, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p4

    :goto_1
    and-int/lit16 v4, v2, 0x91

    const/16 v5, 0x90

    if-ne v4, v5, :cond_3

    invoke-interface/range {p3 .. p3}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p3 .. p3}, LT/l;->C()V

    goto/16 :goto_8

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v4

    const/4 v10, -0x1

    if-eqz v4, :cond_4

    const v4, -0x76b744a6

    const-string v5, "com.ui.wifiman.ui.speed.hosts.NetworkHostsUi.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NetworkHostsUi.kt:153)"

    invoke-static {v4, v2, v10, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    const/4 v11, 0x0

    if-eqz v1, :cond_5

    int-to-float v2, v3

    :goto_3
    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    goto :goto_4

    :cond_5
    int-to-float v2, v11

    goto :goto_3

    :goto_4
    const/16 v7, 0x180

    const/16 v8, 0xa

    const/4 v3, 0x0

    const-string v4, "host elevation"

    const/4 v5, 0x0

    move-object/from16 v6, p3

    invoke-static/range {v2 .. v8}, Lr/c;->c(FLr/i;Ljava/lang/String;Lmh/l;LT/l;II)LT/z1;

    move-result-object v2

    iget-object v3, v0, Lbf/q$b$a;->a:Landroidx/compose/runtime/snapshots/k;

    iget-object v4, v0, Lbf/q$b$a;->c:Lbf/e;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    invoke-interface {v3, v5}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v3

    :cond_6
    invoke-interface {v3}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v3}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lbf/e;

    invoke-virtual {v5}, Lbf/e;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Lbf/e;->b()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v3}, Ljava/util/ListIterator;->nextIndex()I

    move-result v10

    :cond_7
    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    sget-object v4, Lla/a;->a:Lla/a;

    sget v5, Lla/a;->b:I

    invoke-virtual {v4, v9, v5}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v4

    invoke-virtual {v4}, Lra/a;->a()Lra/b;

    move-result-object v4

    invoke-virtual {v4}, Lra/b;->a()Lra/b$a$a;

    move-result-object v4

    invoke-virtual {v4}, Lra/b$a$a;->c()F

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-static {v3, v4, v5, v7, v6}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v12

    invoke-interface {v2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LY0/h;

    invoke-virtual {v2}, LY0/h;->s()F

    move-result v13

    const/16 v20, 0x1e

    const/16 v21, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    invoke-static/range {v12 .. v21}, Lj0/k;->b(Landroidx/compose/ui/e;FLm0/i1;ZJJILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    iget-object v3, v0, Lbf/q$b$a;->b:Ljava/util/Map;

    iget-object v4, v0, Lbf/q$b$a;->c:Lbf/e;

    invoke-virtual {v4}, Lbf/e;->b()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbf/e;

    if-nez v3, :cond_8

    iget-object v3, v0, Lbf/q$b$a;->c:Lbf/e;

    :cond_8
    iget-object v4, v0, Lbf/q$b$a;->d:Lbf/j;

    sget-object v5, Lbf/q$b$a$b;->a:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v4, v5, v4

    const/4 v5, 0x1

    if-eq v4, v5, :cond_a

    if-ne v4, v7, :cond_9

    goto :goto_5

    :cond_9
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_a
    move v11, v5

    :goto_5
    if-eqz v1, :cond_b

    sget-object v1, Lbf/a;->DRAGGING:Lbf/a;

    :goto_6
    move-object v4, v1

    goto :goto_7

    :cond_b
    if-nez v10, :cond_c

    iget-object v1, v0, Lbf/q$b$a;->a:Landroidx/compose/runtime/snapshots/k;

    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/k;->size()I

    move-result v1

    if-ne v1, v5, :cond_c

    sget-object v1, Lbf/a;->ON_LIST_TOP_BOTTOM:Lbf/a;

    goto :goto_6

    :cond_c
    if-nez v10, :cond_d

    sget-object v1, Lbf/a;->ON_LIST_TOP:Lbf/a;

    goto :goto_6

    :cond_d
    iget-object v1, v0, Lbf/q$b$a;->a:Landroidx/compose/runtime/snapshots/k;

    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/k;->size()I

    move-result v1

    sub-int/2addr v1, v5

    if-ne v10, v1, :cond_e

    sget-object v1, Lbf/a;->ON_LIST_BOTTOM:Lbf/a;

    goto :goto_6

    :cond_e
    sget-object v1, Lbf/a;->IN_LIST_MIDDLE:Lbf/a;

    goto :goto_6

    :goto_7
    const v1, 0x14a565d

    invoke-interface {v9, v1}, LT/l;->U(I)V

    iget-object v1, v0, Lbf/q$b$a;->e:Lbf/k;

    invoke-interface {v9, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    iget-object v5, v0, Lbf/q$b$a;->c:Lbf/e;

    invoke-interface {v9, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v1, v5

    iget-object v5, v0, Lbf/q$b$a;->e:Lbf/k;

    iget-object v6, v0, Lbf/q$b$a;->c:Lbf/e;

    invoke-interface/range {p3 .. p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v1, :cond_f

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v7, v1, :cond_10

    :cond_f
    new-instance v7, Lbf/q$b$a$a;

    invoke-direct {v7, v5, v6}, Lbf/q$b$a$a;-><init>(Lbf/k;Lbf/e;)V

    invoke-interface {v9, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_10
    move-object v5, v7

    check-cast v5, Lmh/l;

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, v2

    move-object v2, v3

    move v3, v11

    move-object/from16 v6, p3

    invoke-static/range {v1 .. v8}, Lbf/i;->e(Landroidx/compose/ui/e;Lbf/e;ZLbf/a;Lmh/l;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-static {}, LT/o;->P()V

    :cond_11
    :goto_8
    return-void
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/d;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lbf/q$b$a;->a(Lz/d;ZLT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
