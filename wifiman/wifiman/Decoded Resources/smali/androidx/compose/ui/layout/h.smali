.class public final Landroidx/compose/ui/layout/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/layout/h$a;,
        Landroidx/compose/ui/layout/h$b;,
        Landroidx/compose/ui/layout/h$c;
    }
.end annotation


# instance fields
.field private final a:LE0/G;

.field private b:LT/q;

.field private c:Landroidx/compose/ui/layout/y;

.field private d:I

.field private e:I

.field private final f:Ljava/util/HashMap;

.field private final g:Ljava/util/HashMap;

.field private final h:Landroidx/compose/ui/layout/h$c;

.field private final i:Landroidx/compose/ui/layout/h$b;

.field private final j:Ljava/util/HashMap;

.field private final k:Landroidx/compose/ui/layout/y$a;

.field private final l:Ljava/util/Map;

.field private final m:LV/b;

.field private n:I

.field private o:I

.field private final p:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LE0/G;Landroidx/compose/ui/layout/y;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/layout/h;->a:LE0/G;

    iput-object p2, p0, Landroidx/compose/ui/layout/h;->c:Landroidx/compose/ui/layout/y;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/layout/h;->f:Ljava/util/HashMap;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/layout/h;->g:Ljava/util/HashMap;

    new-instance p1, Landroidx/compose/ui/layout/h$c;

    invoke-direct {p1, p0}, Landroidx/compose/ui/layout/h$c;-><init>(Landroidx/compose/ui/layout/h;)V

    iput-object p1, p0, Landroidx/compose/ui/layout/h;->h:Landroidx/compose/ui/layout/h$c;

    new-instance p1, Landroidx/compose/ui/layout/h$b;

    invoke-direct {p1, p0}, Landroidx/compose/ui/layout/h$b;-><init>(Landroidx/compose/ui/layout/h;)V

    iput-object p1, p0, Landroidx/compose/ui/layout/h;->i:Landroidx/compose/ui/layout/h$b;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/layout/h;->j:Ljava/util/HashMap;

    new-instance p1, Landroidx/compose/ui/layout/y$a;

    const/4 p2, 0x0

    const/4 v0, 0x1

    invoke-direct {p1, p2, v0, p2}, Landroidx/compose/ui/layout/y$a;-><init>(Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Landroidx/compose/ui/layout/h;->k:Landroidx/compose/ui/layout/y$a;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/layout/h;->l:Ljava/util/Map;

    new-instance p1, LV/b;

    const/16 p2, 0x10

    new-array p2, p2, [Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-direct {p1, p2, v0}, LV/b;-><init>([Ljava/lang/Object;I)V

    iput-object p1, p0, Landroidx/compose/ui/layout/h;->m:LV/b;

    const-string p1, "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve \'match parent\' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement."

    iput-object p1, p0, Landroidx/compose/ui/layout/h;->p:Ljava/lang/String;

    return-void
.end method

.method private final A(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/h;->a:LE0/G;

    invoke-virtual {v0}, LE0/G;->M()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LE0/G;

    iget-object v0, p0, Landroidx/compose/ui/layout/h;->f:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast p1, Landroidx/compose/ui/layout/h$a;

    invoke-virtual {p1}, Landroidx/compose/ui/layout/h$a;->f()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final C(Z)V
    .locals 11

    const/4 v0, 0x0

    iput v0, p0, Landroidx/compose/ui/layout/h;->o:I

    iget-object v1, p0, Landroidx/compose/ui/layout/h;->j:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    iget-object v1, p0, Landroidx/compose/ui/layout/h;->a:LE0/G;

    invoke-virtual {v1}, LE0/G;->M()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget v2, p0, Landroidx/compose/ui/layout/h;->n:I

    if-eq v2, v1, :cond_5

    iput v1, p0, Landroidx/compose/ui/layout/h;->n:I

    sget-object v2, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/g$a;->d()Landroidx/compose/runtime/snapshots/g;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Landroidx/compose/runtime/snapshots/g;->h()Lmh/l;

    move-result-object v5

    goto :goto_0

    :cond_0
    move-object v5, v4

    :goto_0
    invoke-virtual {v2, v3}, Landroidx/compose/runtime/snapshots/g$a;->f(Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/g;

    move-result-object v6

    move v7, v0

    :goto_1
    if-ge v7, v1, :cond_4

    :try_start_0
    iget-object v8, p0, Landroidx/compose/ui/layout/h;->a:LE0/G;

    invoke-virtual {v8}, LE0/G;->M()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LE0/G;

    iget-object v9, p0, Landroidx/compose/ui/layout/h;->f:Ljava/util/HashMap;

    invoke-virtual {v9, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/compose/ui/layout/h$a;

    if-eqz v9, :cond_3

    invoke-virtual {v9}, Landroidx/compose/ui/layout/h$a;->a()Z

    move-result v10

    if-eqz v10, :cond_3

    invoke-direct {p0, v8}, Landroidx/compose/ui/layout/h;->H(LE0/G;)V

    if-eqz p1, :cond_2

    invoke-virtual {v9}, Landroidx/compose/ui/layout/h$a;->b()LT/U0;

    move-result-object v8

    if-eqz v8, :cond_1

    invoke-interface {v8}, LT/U0;->deactivate()V

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_1
    :goto_2
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v10, 0x2

    invoke-static {v8, v4, v10, v4}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v8

    invoke-virtual {v9, v8}, Landroidx/compose/ui/layout/h$a;->h(LT/q0;)V

    goto :goto_3

    :cond_2
    invoke-virtual {v9, v0}, Landroidx/compose/ui/layout/h$a;->g(Z)V

    :goto_3
    invoke-static {}, Landroidx/compose/ui/layout/w;->c()Landroidx/compose/ui/layout/w$a;

    move-result-object v8

    invoke-virtual {v9, v8}, Landroidx/compose/ui/layout/h$a;->m(Ljava/lang/Object;)V

    :cond_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_4
    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v2, v3, v6, v5}, Landroidx/compose/runtime/snapshots/g$a;->m(Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;Lmh/l;)V

    iget-object p1, p0, Landroidx/compose/ui/layout/h;->g:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    goto :goto_5

    :goto_4
    invoke-virtual {v2, v3, v6, v5}, Landroidx/compose/runtime/snapshots/g$a;->m(Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;Lmh/l;)V

    throw p1

    :cond_5
    :goto_5
    invoke-virtual {p0}, Landroidx/compose/ui/layout/h;->B()V

    return-void
.end method

.method private final D(III)V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/layout/h;->a:LE0/G;

    const/4 v1, 0x1

    invoke-static {v0, v1}, LE0/G;->s(LE0/G;Z)V

    iget-object v1, p0, Landroidx/compose/ui/layout/h;->a:LE0/G;

    invoke-virtual {v1, p1, p2, p3}, LE0/G;->e1(III)V

    const/4 p1, 0x0

    invoke-static {v0, p1}, LE0/G;->s(LE0/G;Z)V

    return-void
.end method

.method static synthetic E(Landroidx/compose/ui/layout/h;IIIILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x1

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/ui/layout/h;->D(III)V

    return-void
.end method

.method private final F(Ljava/lang/Object;Lmh/p;)Ljava/util/List;
    .locals 8

    iget-object v0, p0, Landroidx/compose/ui/layout/h;->m:LV/b;

    invoke-virtual {v0}, LV/b;->o()I

    move-result v0

    iget v1, p0, Landroidx/compose/ui/layout/h;->e:I

    if-lt v0, v1, :cond_5

    iget-object v0, p0, Landroidx/compose/ui/layout/h;->m:LV/b;

    invoke-virtual {v0}, LV/b;->o()I

    move-result v0

    iget v1, p0, Landroidx/compose/ui/layout/h;->e:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/layout/h;->m:LV/b;

    invoke-virtual {v0, p1}, LV/b;->b(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/layout/h;->m:LV/b;

    invoke-virtual {v0, v1, p1}, LV/b;->C(ILjava/lang/Object;)Ljava/lang/Object;

    :goto_0
    iget v0, p0, Landroidx/compose/ui/layout/h;->e:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Landroidx/compose/ui/layout/h;->e:I

    iget-object v0, p0, Landroidx/compose/ui/layout/h;->j:Ljava/util/HashMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/layout/h;->G(Ljava/lang/Object;Lmh/p;)Landroidx/compose/ui/layout/x$a;

    move-result-object p2

    iget-object v0, p0, Landroidx/compose/ui/layout/h;->l:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Landroidx/compose/ui/layout/h;->a:LE0/G;

    invoke-virtual {p2}, LE0/G;->W()LE0/G$e;

    move-result-object p2

    sget-object v0, LE0/G$e;->LayingOut:LE0/G$e;

    if-ne p2, v0, :cond_1

    iget-object p2, p0, Landroidx/compose/ui/layout/h;->a:LE0/G;

    invoke-virtual {p2, v1}, LE0/G;->p1(Z)V

    goto :goto_1

    :cond_1
    iget-object v2, p0, Landroidx/compose/ui/layout/h;->a:LE0/G;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, LE0/G;->s1(LE0/G;ZZZILjava/lang/Object;)V

    :cond_2
    :goto_1
    iget-object p2, p0, Landroidx/compose/ui/layout/h;->j:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LE0/G;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, LE0/G;->c0()LE0/L$b;

    move-result-object p1

    invoke-virtual {p1}, LE0/L$b;->h1()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    const/4 v0, 0x0

    :goto_2
    if-ge v0, p2, :cond_4

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LE0/L$b;

    invoke-virtual {v1}, LE0/L$b;->M1()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    :cond_4
    return-object p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final H(LE0/G;)V
    .locals 2

    invoke-virtual {p1}, LE0/G;->c0()LE0/L$b;

    move-result-object v0

    sget-object v1, LE0/G$g;->NotUsed:LE0/G$g;

    invoke-virtual {v0, v1}, LE0/L$b;->f2(LE0/G$g;)V

    invoke-virtual {p1}, LE0/G;->Z()LE0/L$a;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1, v1}, LE0/L$a;->Y1(LE0/G$g;)V

    :cond_0
    return-void
.end method

.method private final L(LE0/G;Landroidx/compose/ui/layout/h$a;)V
    .locals 13

    sget-object v0, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/g$a;->d()Landroidx/compose/runtime/snapshots/g;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/g;->h()Lmh/l;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroidx/compose/runtime/snapshots/g$a;->f(Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/g;

    move-result-object v3

    :try_start_0
    iget-object v4, p0, Landroidx/compose/ui/layout/h;->a:LE0/G;

    const/4 v5, 0x1

    invoke-static {v4, v5}, LE0/G;->s(LE0/G;Z)V

    invoke-virtual {p2}, Landroidx/compose/ui/layout/h$a;->c()Lmh/p;

    move-result-object v6

    invoke-virtual {p2}, Landroidx/compose/ui/layout/h$a;->b()LT/U0;

    move-result-object v8

    iget-object v11, p0, Landroidx/compose/ui/layout/h;->b:LT/q;

    if-eqz v11, :cond_1

    invoke-virtual {p2}, Landroidx/compose/ui/layout/h$a;->e()Z

    move-result v10

    new-instance v7, Landroidx/compose/ui/layout/h$h;

    invoke-direct {v7, p2, v6}, Landroidx/compose/ui/layout/h$h;-><init>(Landroidx/compose/ui/layout/h$a;Lmh/p;)V

    const v6, -0x68551fe9

    invoke-static {v6, v5, v7}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v12

    move-object v7, p0

    move-object v9, p1

    invoke-direct/range {v7 .. v12}, Landroidx/compose/ui/layout/h;->N(LT/U0;LE0/G;ZLT/q;Lmh/p;)LT/U0;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroidx/compose/ui/layout/h$a;->i(LT/U0;)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Landroidx/compose/ui/layout/h$a;->l(Z)V

    invoke-static {v4, p1}, LE0/G;->s(LE0/G;Z)V

    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0, v1, v3, v2}, Landroidx/compose/runtime/snapshots/g$a;->m(Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;Lmh/l;)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "parent composition reference not set"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    invoke-virtual {v0, v1, v3, v2}, Landroidx/compose/runtime/snapshots/g$a;->m(Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;Lmh/l;)V

    throw p1
.end method

.method private final M(LE0/G;Ljava/lang/Object;Lmh/p;)V
    .locals 8

    iget-object v0, p0, Landroidx/compose/ui/layout/h;->f:Ljava/util/HashMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Landroidx/compose/ui/layout/h$a;

    sget-object v2, LC0/g;->a:LC0/g;

    invoke-virtual {v2}, LC0/g;->a()Lmh/p;

    move-result-object v4

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, v1

    move-object v3, p2

    invoke-direct/range {v2 .. v7}, Landroidx/compose/ui/layout/h$a;-><init>(Ljava/lang/Object;Lmh/p;LT/U0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    check-cast v1, Landroidx/compose/ui/layout/h$a;

    invoke-virtual {v1}, Landroidx/compose/ui/layout/h$a;->b()LT/U0;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-interface {p2}, LT/p;->o()Z

    move-result p2

    goto :goto_0

    :cond_1
    const/4 p2, 0x1

    :goto_0
    invoke-virtual {v1}, Landroidx/compose/ui/layout/h$a;->c()Lmh/p;

    move-result-object v0

    if-ne v0, p3, :cond_2

    if-nez p2, :cond_2

    invoke-virtual {v1}, Landroidx/compose/ui/layout/h$a;->d()Z

    move-result p2

    if-eqz p2, :cond_3

    :cond_2
    invoke-virtual {v1, p3}, Landroidx/compose/ui/layout/h$a;->j(Lmh/p;)V

    invoke-direct {p0, p1, v1}, Landroidx/compose/ui/layout/h;->L(LE0/G;Landroidx/compose/ui/layout/h$a;)V

    const/4 p1, 0x0

    invoke-virtual {v1, p1}, Landroidx/compose/ui/layout/h$a;->k(Z)V

    :cond_3
    return-void
.end method

.method private final N(LT/U0;LE0/G;ZLT/q;Lmh/p;)LT/U0;
    .locals 1

    if-eqz p1, :cond_0

    invoke-interface {p1}, LT/p;->isDisposed()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-static {p2, p4}, Landroidx/compose/ui/platform/M1;->a(LE0/G;LT/q;)LT/U0;

    move-result-object p1

    :cond_1
    if-nez p3, :cond_2

    invoke-interface {p1, p5}, LT/p;->e(Lmh/p;)V

    goto :goto_0

    :cond_2
    invoke-interface {p1, p5}, LT/U0;->v(Lmh/p;)V

    :goto_0
    return-object p1
.end method

.method private final O(Ljava/lang/Object;)LE0/G;
    .locals 9

    iget v0, p0, Landroidx/compose/ui/layout/h;->n:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/layout/h;->a:LE0/G;

    invoke-virtual {v0}, LE0/G;->M()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v2, p0, Landroidx/compose/ui/layout/h;->o:I

    sub-int/2addr v0, v2

    iget v2, p0, Landroidx/compose/ui/layout/h;->n:I

    sub-int v2, v0, v2

    const/4 v3, 0x1

    sub-int/2addr v0, v3

    move v4, v0

    :goto_0
    const/4 v5, -0x1

    if-lt v4, v2, :cond_2

    invoke-direct {p0, v4}, Landroidx/compose/ui/layout/h;->A(I)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    move v6, v4

    goto :goto_1

    :cond_1
    add-int/lit8 v4, v4, -0x1

    goto :goto_0

    :cond_2
    move v6, v5

    :goto_1
    if-ne v6, v5, :cond_6

    :goto_2
    if-lt v0, v2, :cond_5

    iget-object v4, p0, Landroidx/compose/ui/layout/h;->a:LE0/G;

    invoke-virtual {v4}, LE0/G;->M()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LE0/G;

    iget-object v7, p0, Landroidx/compose/ui/layout/h;->f:Ljava/util/HashMap;

    invoke-virtual {v7, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v4, Landroidx/compose/ui/layout/h$a;

    invoke-virtual {v4}, Landroidx/compose/ui/layout/h$a;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-static {}, Landroidx/compose/ui/layout/w;->c()Landroidx/compose/ui/layout/w$a;

    move-result-object v8

    if-eq v7, v8, :cond_4

    iget-object v7, p0, Landroidx/compose/ui/layout/h;->c:Landroidx/compose/ui/layout/y;

    invoke-virtual {v4}, Landroidx/compose/ui/layout/h$a;->f()Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v7, p1, v8}, Landroidx/compose/ui/layout/y;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_3

    :cond_3
    add-int/lit8 v0, v0, -0x1

    goto :goto_2

    :cond_4
    :goto_3
    invoke-virtual {v4, p1}, Landroidx/compose/ui/layout/h$a;->m(Ljava/lang/Object;)V

    move v4, v0

    move v6, v4

    goto :goto_4

    :cond_5
    move v4, v0

    :cond_6
    :goto_4
    if-ne v6, v5, :cond_7

    goto :goto_5

    :cond_7
    if-eq v4, v2, :cond_8

    invoke-direct {p0, v4, v2, v3}, Landroidx/compose/ui/layout/h;->D(III)V

    :cond_8
    iget p1, p0, Landroidx/compose/ui/layout/h;->n:I

    add-int/2addr p1, v5

    iput p1, p0, Landroidx/compose/ui/layout/h;->n:I

    iget-object p1, p0, Landroidx/compose/ui/layout/h;->a:LE0/G;

    invoke-virtual {p1}, LE0/G;->M()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LE0/G;

    iget-object v0, p0, Landroidx/compose/ui/layout/h;->f:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v0, Landroidx/compose/ui/layout/h$a;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v4, 0x2

    invoke-static {v2, v1, v4, v1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/compose/ui/layout/h$a;->h(LT/q0;)V

    invoke-virtual {v0, v3}, Landroidx/compose/ui/layout/h$a;->l(Z)V

    invoke-virtual {v0, v3}, Landroidx/compose/ui/layout/h$a;->k(Z)V

    move-object v1, p1

    :goto_5
    return-object v1
.end method

.method public static final synthetic a(Landroidx/compose/ui/layout/h;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/layout/h;->y()V

    return-void
.end method

.method public static final synthetic b(Landroidx/compose/ui/layout/h;)I
    .locals 0

    iget p0, p0, Landroidx/compose/ui/layout/h;->d:I

    return p0
.end method

.method public static final synthetic c(Landroidx/compose/ui/layout/h;)I
    .locals 0

    iget p0, p0, Landroidx/compose/ui/layout/h;->e:I

    return p0
.end method

.method public static final synthetic d(Landroidx/compose/ui/layout/h;)LV/b;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/layout/h;->m:LV/b;

    return-object p0
.end method

.method public static final synthetic e(Landroidx/compose/ui/layout/h;)Landroidx/compose/ui/layout/h$b;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/layout/h;->i:Landroidx/compose/ui/layout/h$b;

    return-object p0
.end method

.method public static final synthetic g(Landroidx/compose/ui/layout/h;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/layout/h;->j:Ljava/util/HashMap;

    return-object p0
.end method

.method public static final synthetic i(Landroidx/compose/ui/layout/h;)I
    .locals 0

    iget p0, p0, Landroidx/compose/ui/layout/h;->o:I

    return p0
.end method

.method public static final synthetic j(Landroidx/compose/ui/layout/h;)I
    .locals 0

    iget p0, p0, Landroidx/compose/ui/layout/h;->n:I

    return p0
.end method

.method public static final synthetic k(Landroidx/compose/ui/layout/h;)LE0/G;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/layout/h;->a:LE0/G;

    return-object p0
.end method

.method public static final synthetic l(Landroidx/compose/ui/layout/h;)Landroidx/compose/ui/layout/h$c;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/layout/h;->h:Landroidx/compose/ui/layout/h$c;

    return-object p0
.end method

.method public static final synthetic m(Landroidx/compose/ui/layout/h;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/layout/h;->g:Ljava/util/HashMap;

    return-object p0
.end method

.method public static final synthetic n(Landroidx/compose/ui/layout/h;III)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/ui/layout/h;->D(III)V

    return-void
.end method

.method public static final synthetic o(Landroidx/compose/ui/layout/h;Ljava/lang/Object;Lmh/p;)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/compose/ui/layout/h;->F(Ljava/lang/Object;Lmh/p;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic q(Landroidx/compose/ui/layout/h;I)V
    .locals 0

    iput p1, p0, Landroidx/compose/ui/layout/h;->d:I

    return-void
.end method

.method public static final synthetic r(Landroidx/compose/ui/layout/h;I)V
    .locals 0

    iput p1, p0, Landroidx/compose/ui/layout/h;->e:I

    return-void
.end method

.method public static final synthetic s(Landroidx/compose/ui/layout/h;I)V
    .locals 0

    iput p1, p0, Landroidx/compose/ui/layout/h;->o:I

    return-void
.end method

.method public static final synthetic t(Landroidx/compose/ui/layout/h;I)V
    .locals 0

    iput p1, p0, Landroidx/compose/ui/layout/h;->n:I

    return-void
.end method

.method private final v(I)LE0/G;
    .locals 5

    new-instance v0, LE0/G;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, LE0/G;-><init>(ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v1, p0, Landroidx/compose/ui/layout/h;->a:LE0/G;

    invoke-static {v1, v3}, LE0/G;->s(LE0/G;Z)V

    iget-object v2, p0, Landroidx/compose/ui/layout/h;->a:LE0/G;

    invoke-virtual {v2, p1, v0}, LE0/G;->B0(ILE0/G;)V

    invoke-static {v1, v4}, LE0/G;->s(LE0/G;Z)V

    return-object v0
.end method

.method private final w()V
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/layout/h;->a:LE0/G;

    const/4 v1, 0x1

    invoke-static {v0, v1}, LE0/G;->s(LE0/G;Z)V

    iget-object v1, p0, Landroidx/compose/ui/layout/h;->f:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/layout/h$a;

    invoke-virtual {v2}, Landroidx/compose/ui/layout/h$a;->b()LT/U0;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v2}, LT/p;->dispose()V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Landroidx/compose/ui/layout/h;->a:LE0/G;

    invoke-virtual {v1}, LE0/G;->m1()V

    const/4 v1, 0x0

    invoke-static {v0, v1}, LE0/G;->s(LE0/G;Z)V

    iget-object v0, p0, Landroidx/compose/ui/layout/h;->f:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    iget-object v0, p0, Landroidx/compose/ui/layout/h;->g:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    iput v1, p0, Landroidx/compose/ui/layout/h;->o:I

    iput v1, p0, Landroidx/compose/ui/layout/h;->n:I

    iget-object v0, p0, Landroidx/compose/ui/layout/h;->j:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    invoke-virtual {p0}, Landroidx/compose/ui/layout/h;->B()V

    return-void
.end method

.method private final y()V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/layout/h;->l:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Landroidx/compose/ui/layout/h$e;

    invoke-direct {v1, p0}, Landroidx/compose/ui/layout/h$e;-><init>(Landroidx/compose/ui/layout/h;)V

    invoke-static {v0, v1}, LZg/v;->I(Ljava/lang/Iterable;Lmh/l;)Z

    return-void
.end method


# virtual methods
.method public final B()V
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/layout/h;->a:LE0/G;

    invoke-virtual {v0}, LE0/G;->M()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Landroidx/compose/ui/layout/h;->f:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v1

    if-ne v1, v0, :cond_2

    iget v1, p0, Landroidx/compose/ui/layout/h;->n:I

    sub-int v1, v0, v1

    iget v2, p0, Landroidx/compose/ui/layout/h;->o:I

    sub-int/2addr v1, v2

    if-ltz v1, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/layout/h;->j:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    iget v1, p0, Landroidx/compose/ui/layout/h;->o:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Incorrect state. Precomposed children "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/ui/layout/h;->o:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ". Map size "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/layout/h;->j:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Incorrect state. Total children "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ". Reusable children "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Landroidx/compose/ui/layout/h;->n:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ". Precomposed children "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Landroidx/compose/ui/layout/h;->o:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Inconsistency between the count of nodes tracked by the state ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/compose/ui/layout/h;->f:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ") and the children count on the SubcomposeLayout ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "). Are you trying to use the state of the disposed SubcomposeLayout?"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final G(Ljava/lang/Object;Lmh/p;)Landroidx/compose/ui/layout/x$a;
    .locals 5

    iget-object v0, p0, Landroidx/compose/ui/layout/h;->a:LE0/G;

    invoke-virtual {v0}, LE0/G;->K0()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p1, Landroidx/compose/ui/layout/h$f;

    invoke-direct {p1}, Landroidx/compose/ui/layout/h$f;-><init>()V

    return-object p1

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/layout/h;->B()V

    iget-object v0, p0, Landroidx/compose/ui/layout/h;->g:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Landroidx/compose/ui/layout/h;->l:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Landroidx/compose/ui/layout/h;->j:Ljava/util/HashMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_2

    invoke-direct {p0, p1}, Landroidx/compose/ui/layout/h;->O(Ljava/lang/Object;)LE0/G;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    iget-object v3, p0, Landroidx/compose/ui/layout/h;->a:LE0/G;

    invoke-virtual {v3}, LE0/G;->M()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v3

    iget-object v4, p0, Landroidx/compose/ui/layout/h;->a:LE0/G;

    invoke-virtual {v4}, LE0/G;->M()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {p0, v3, v4, v2}, Landroidx/compose/ui/layout/h;->D(III)V

    iget v3, p0, Landroidx/compose/ui/layout/h;->o:I

    add-int/2addr v3, v2

    iput v3, p0, Landroidx/compose/ui/layout/h;->o:I

    goto :goto_0

    :cond_1
    iget-object v1, p0, Landroidx/compose/ui/layout/h;->a:LE0/G;

    invoke-virtual {v1}, LE0/G;->M()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {p0, v1}, Landroidx/compose/ui/layout/h;->v(I)LE0/G;

    move-result-object v1

    iget v3, p0, Landroidx/compose/ui/layout/h;->o:I

    add-int/2addr v3, v2

    iput v3, p0, Landroidx/compose/ui/layout/h;->o:I

    :goto_0
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    check-cast v1, LE0/G;

    invoke-direct {p0, v1, p1, p2}, Landroidx/compose/ui/layout/h;->M(LE0/G;Ljava/lang/Object;Lmh/p;)V

    :cond_3
    new-instance p2, Landroidx/compose/ui/layout/h$g;

    invoke-direct {p2, p0, p1}, Landroidx/compose/ui/layout/h$g;-><init>(Landroidx/compose/ui/layout/h;Ljava/lang/Object;)V

    return-object p2
.end method

.method public final I(LT/q;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/layout/h;->b:LT/q;

    return-void
.end method

.method public final J(Landroidx/compose/ui/layout/y;)V
    .locals 6

    iget-object v0, p0, Landroidx/compose/ui/layout/h;->c:Landroidx/compose/ui/layout/y;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Landroidx/compose/ui/layout/h;->c:Landroidx/compose/ui/layout/y;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Landroidx/compose/ui/layout/h;->C(Z)V

    iget-object v0, p0, Landroidx/compose/ui/layout/h;->a:LE0/G;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, LE0/G;->w1(LE0/G;ZZZILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final K(Ljava/lang/Object;Lmh/p;)Ljava/util/List;
    .locals 12

    invoke-virtual {p0}, Landroidx/compose/ui/layout/h;->B()V

    iget-object v0, p0, Landroidx/compose/ui/layout/h;->a:LE0/G;

    invoke-virtual {v0}, LE0/G;->W()LE0/G$e;

    move-result-object v0

    sget-object v1, LE0/G$e;->Measuring:LE0/G$e;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_1

    sget-object v4, LE0/G$e;->LayingOut:LE0/G$e;

    if-eq v0, v4, :cond_1

    sget-object v4, LE0/G$e;->LookaheadMeasuring:LE0/G$e;

    if-eq v0, v4, :cond_1

    sget-object v4, LE0/G$e;->LookaheadLayingOut:LE0/G$e;

    if-ne v0, v4, :cond_0

    goto :goto_0

    :cond_0
    move v4, v2

    goto :goto_1

    :cond_1
    :goto_0
    move v4, v3

    :goto_1
    if-nez v4, :cond_2

    const-string v4, "subcompose can only be used inside the measure or layout blocks"

    invoke-static {v4}, LB0/a;->b(Ljava/lang/String;)V

    :cond_2
    iget-object v4, p0, Landroidx/compose/ui/layout/h;->g:Ljava/util/HashMap;

    invoke-interface {v4, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_7

    iget-object v5, p0, Landroidx/compose/ui/layout/h;->j:Ljava/util/HashMap;

    invoke-virtual {v5, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LE0/G;

    if-eqz v5, :cond_5

    iget v6, p0, Landroidx/compose/ui/layout/h;->o:I

    if-lez v6, :cond_3

    move v2, v3

    :cond_3
    if-nez v2, :cond_4

    const-string v2, "Check failed."

    invoke-static {v2}, LB0/a;->b(Ljava/lang/String;)V

    :cond_4
    iget v2, p0, Landroidx/compose/ui/layout/h;->o:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Landroidx/compose/ui/layout/h;->o:I

    goto :goto_2

    :cond_5
    invoke-direct {p0, p1}, Landroidx/compose/ui/layout/h;->O(Ljava/lang/Object;)LE0/G;

    move-result-object v2

    if-nez v2, :cond_6

    iget v2, p0, Landroidx/compose/ui/layout/h;->d:I

    invoke-direct {p0, v2}, Landroidx/compose/ui/layout/h;->v(I)LE0/G;

    move-result-object v2

    :cond_6
    move-object v5, v2

    :goto_2
    invoke-interface {v4, p1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    check-cast v5, LE0/G;

    iget-object v2, p0, Landroidx/compose/ui/layout/h;->a:LE0/G;

    invoke-virtual {v2}, LE0/G;->M()Ljava/util/List;

    move-result-object v2

    iget v4, p0, Landroidx/compose/ui/layout/h;->d:I

    invoke-static {v2, v4}, LZg/v;->t0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v5, :cond_9

    iget-object v2, p0, Landroidx/compose/ui/layout/h;->a:LE0/G;

    invoke-virtual {v2}, LE0/G;->M()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v5}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v7

    iget v8, p0, Landroidx/compose/ui/layout/h;->d:I

    if-lt v7, v8, :cond_8

    if-eq v8, v7, :cond_9

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object v6, p0

    invoke-static/range {v6 .. v11}, Landroidx/compose/ui/layout/h;->E(Landroidx/compose/ui/layout/h;IIIILjava/lang/Object;)V

    goto :goto_3

    :cond_8
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Key \""

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_9
    :goto_3
    iget v2, p0, Landroidx/compose/ui/layout/h;->d:I

    add-int/2addr v2, v3

    iput v2, p0, Landroidx/compose/ui/layout/h;->d:I

    invoke-direct {p0, v5, p1, p2}, Landroidx/compose/ui/layout/h;->M(LE0/G;Ljava/lang/Object;Lmh/p;)V

    if-eq v0, v1, :cond_b

    sget-object p1, LE0/G$e;->LayingOut:LE0/G$e;

    if-ne v0, p1, :cond_a

    goto :goto_4

    :cond_a
    invoke-virtual {v5}, LE0/G;->F()Ljava/util/List;

    move-result-object p1

    goto :goto_5

    :cond_b
    :goto_4
    invoke-virtual {v5}, LE0/G;->G()Ljava/util/List;

    move-result-object p1

    :goto_5
    return-object p1
.end method

.method public f()V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/layout/h;->w()V

    return-void
.end method

.method public h()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Landroidx/compose/ui/layout/h;->C(Z)V

    return-void
.end method

.method public p()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroidx/compose/ui/layout/h;->C(Z)V

    return-void
.end method

.method public final u(Lmh/p;)LC0/C;
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/layout/h;->p:Ljava/lang/String;

    new-instance v1, Landroidx/compose/ui/layout/h$d;

    invoke-direct {v1, p0, p1, v0}, Landroidx/compose/ui/layout/h$d;-><init>(Landroidx/compose/ui/layout/h;Lmh/p;Ljava/lang/String;)V

    return-object v1
.end method

.method public final x(I)V
    .locals 13

    const/4 v0, 0x0

    iput v0, p0, Landroidx/compose/ui/layout/h;->n:I

    iget-object v1, p0, Landroidx/compose/ui/layout/h;->a:LE0/G;

    invoke-virtual {v1}, LE0/G;->M()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget v2, p0, Landroidx/compose/ui/layout/h;->o:I

    sub-int/2addr v1, v2

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    if-gt p1, v1, :cond_6

    iget-object v3, p0, Landroidx/compose/ui/layout/h;->k:Landroidx/compose/ui/layout/y$a;

    invoke-virtual {v3}, Landroidx/compose/ui/layout/y$a;->clear()V

    if-gt p1, v1, :cond_0

    move v3, p1

    :goto_0
    invoke-direct {p0, v3}, Landroidx/compose/ui/layout/h;->A(I)Ljava/lang/Object;

    move-result-object v4

    iget-object v5, p0, Landroidx/compose/ui/layout/h;->k:Landroidx/compose/ui/layout/y$a;

    invoke-virtual {v5, v4}, Landroidx/compose/ui/layout/y$a;->b(Ljava/lang/Object;)Z

    if-eq v3, v1, :cond_0

    add-int/2addr v3, v2

    goto :goto_0

    :cond_0
    iget-object v3, p0, Landroidx/compose/ui/layout/h;->c:Landroidx/compose/ui/layout/y;

    iget-object v4, p0, Landroidx/compose/ui/layout/h;->k:Landroidx/compose/ui/layout/y$a;

    invoke-interface {v3, v4}, Landroidx/compose/ui/layout/y;->a(Landroidx/compose/ui/layout/y$a;)V

    sget-object v3, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    invoke-virtual {v3}, Landroidx/compose/runtime/snapshots/g$a;->d()Landroidx/compose/runtime/snapshots/g;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Landroidx/compose/runtime/snapshots/g;->h()Lmh/l;

    move-result-object v5

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    :goto_1
    invoke-virtual {v3, v4}, Landroidx/compose/runtime/snapshots/g$a;->f(Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/g;

    move-result-object v6

    move v7, v0

    :goto_2
    if-lt v1, p1, :cond_5

    :try_start_0
    iget-object v8, p0, Landroidx/compose/ui/layout/h;->a:LE0/G;

    invoke-virtual {v8}, LE0/G;->M()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LE0/G;

    iget-object v9, p0, Landroidx/compose/ui/layout/h;->f:Ljava/util/HashMap;

    invoke-virtual {v9, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    invoke-static {v9}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v9, Landroidx/compose/ui/layout/h$a;

    invoke-virtual {v9}, Landroidx/compose/ui/layout/h$a;->f()Ljava/lang/Object;

    move-result-object v10

    iget-object v11, p0, Landroidx/compose/ui/layout/h;->k:Landroidx/compose/ui/layout/y$a;

    invoke-virtual {v11, v10}, Landroidx/compose/ui/layout/y$a;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2

    iget v11, p0, Landroidx/compose/ui/layout/h;->n:I

    add-int/2addr v11, v2

    iput v11, p0, Landroidx/compose/ui/layout/h;->n:I

    invoke-virtual {v9}, Landroidx/compose/ui/layout/h$a;->a()Z

    move-result v11

    if-eqz v11, :cond_4

    invoke-direct {p0, v8}, Landroidx/compose/ui/layout/h;->H(LE0/G;)V

    invoke-virtual {v9, v0}, Landroidx/compose/ui/layout/h$a;->g(Z)V

    move v7, v2

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_2
    iget-object v11, p0, Landroidx/compose/ui/layout/h;->a:LE0/G;

    invoke-static {v11, v2}, LE0/G;->s(LE0/G;Z)V

    iget-object v12, p0, Landroidx/compose/ui/layout/h;->f:Ljava/util/HashMap;

    invoke-virtual {v12, v8}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v9}, Landroidx/compose/ui/layout/h$a;->b()LT/U0;

    move-result-object v8

    if-eqz v8, :cond_3

    invoke-interface {v8}, LT/p;->dispose()V

    :cond_3
    iget-object v8, p0, Landroidx/compose/ui/layout/h;->a:LE0/G;

    invoke-virtual {v8, v1, v2}, LE0/G;->n1(II)V

    invoke-static {v11, v0}, LE0/G;->s(LE0/G;Z)V

    :cond_4
    :goto_3
    iget-object v8, p0, Landroidx/compose/ui/layout/h;->g:Ljava/util/HashMap;

    invoke-virtual {v8, v10}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, -0x1

    goto :goto_2

    :cond_5
    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v3, v4, v6, v5}, Landroidx/compose/runtime/snapshots/g$a;->m(Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;Lmh/l;)V

    move v0, v7

    goto :goto_5

    :goto_4
    invoke-virtual {v3, v4, v6, v5}, Landroidx/compose/runtime/snapshots/g$a;->m(Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;Lmh/l;)V

    throw p1

    :cond_6
    :goto_5
    if-eqz v0, :cond_7

    sget-object p1, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    invoke-virtual {p1}, Landroidx/compose/runtime/snapshots/g$a;->n()V

    :cond_7
    invoke-virtual {p0}, Landroidx/compose/ui/layout/h;->B()V

    return-void
.end method

.method public final z()V
    .locals 7

    iget-object v0, p0, Landroidx/compose/ui/layout/h;->a:LE0/G;

    invoke-virtual {v0}, LE0/G;->M()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Landroidx/compose/ui/layout/h;->n:I

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/layout/h;->f:Ljava/util/HashMap;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/ui/layout/h$a;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroidx/compose/ui/layout/h$a;->k(Z)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/layout/h;->a:LE0/G;

    invoke-virtual {v0}, LE0/G;->d0()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v1, p0, Landroidx/compose/ui/layout/h;->a:LE0/G;

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LE0/G;->w1(LE0/G;ZZZILjava/lang/Object;)V

    :cond_1
    return-void
.end method
