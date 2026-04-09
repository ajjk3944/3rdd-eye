.class final Lf2/n$b;
.super Lf2/F;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf2/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private final g:Lf2/D;

.field final synthetic h:Lf2/n;


# direct methods
.method public constructor <init>(Lf2/n;Lf2/D;)V
    .locals 1

    const-string v0, "navigator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lf2/n$b;->h:Lf2/n;

    invoke-direct {p0}, Lf2/F;-><init>()V

    iput-object p2, p0, Lf2/n$b;->g:Lf2/D;

    return-void
.end method

.method public static final synthetic m(Lf2/n$b;Lf2/k;Z)V
    .locals 0

    invoke-super {p0, p1, p2}, Lf2/F;->g(Lf2/k;Z)V

    return-void
.end method


# virtual methods
.method public a(Lf2/r;Landroid/os/Bundle;)Lf2/k;
    .locals 11

    const-string v0, "destination"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lf2/k;->o:Lf2/k$a;

    iget-object v0, p0, Lf2/n$b;->h:Lf2/n;

    invoke-virtual {v0}, Lf2/n;->E()Landroid/content/Context;

    move-result-object v2

    iget-object v0, p0, Lf2/n$b;->h:Lf2/n;

    invoke-virtual {v0}, Lf2/n;->J()Landroidx/lifecycle/k$b;

    move-result-object v5

    iget-object v0, p0, Lf2/n$b;->h:Lf2/n;

    invoke-static {v0}, Lf2/n;->k(Lf2/n;)Lf2/o;

    move-result-object v6

    const/16 v9, 0x60

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, p1

    move-object v4, p2

    invoke-static/range {v1 .. v10}, Lf2/k$a;->b(Lf2/k$a;Landroid/content/Context;Lf2/r;Landroid/os/Bundle;Landroidx/lifecycle/k$b;Lf2/C;Ljava/lang/String;Landroid/os/Bundle;ILjava/lang/Object;)Lf2/k;

    move-result-object p1

    return-object p1
.end method

.method public e(Lf2/k;)V
    .locals 4

    const-string v0, "entry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf2/n$b;->h:Lf2/n;

    invoke-static {v0}, Lf2/n;->g(Lf2/n;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    invoke-super {p0, p1}, Lf2/F;->e(Lf2/k;)V

    iget-object v1, p0, Lf2/n$b;->h:Lf2/n;

    invoke-static {v1}, Lf2/n;->g(Lf2/n;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lf2/n$b;->h:Lf2/n;

    invoke-static {v1}, Lf2/n;->d(Lf2/n;)LZg/m;

    move-result-object v1

    invoke-virtual {v1, p1}, LZg/m;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    iget-object v1, p0, Lf2/n$b;->h:Lf2/n;

    invoke-virtual {v1, p1}, Lf2/n;->u0(Lf2/k;)Lf2/k;

    invoke-virtual {p1}, Lf2/k;->O()Landroidx/lifecycle/k;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/lifecycle/k;->b()Landroidx/lifecycle/k$b;

    move-result-object v1

    sget-object v2, Landroidx/lifecycle/k$b;->CREATED:Landroidx/lifecycle/k$b;

    invoke-virtual {v1, v2}, Landroidx/lifecycle/k$b;->isAtLeast(Landroidx/lifecycle/k$b;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Landroidx/lifecycle/k$b;->DESTROYED:Landroidx/lifecycle/k$b;

    invoke-virtual {p1, v1}, Lf2/k;->p(Landroidx/lifecycle/k$b;)V

    :cond_0
    iget-object v1, p0, Lf2/n$b;->h:Lf2/n;

    invoke-static {v1}, Lf2/n;->d(Lf2/n;)LZg/m;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf2/k;

    invoke-virtual {v2}, Lf2/k;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lf2/k;->i()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_3
    :goto_0
    if-nez v0, :cond_4

    iget-object v0, p0, Lf2/n$b;->h:Lf2/n;

    invoke-static {v0}, Lf2/n;->k(Lf2/n;)Lf2/o;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lf2/k;->i()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lf2/o;->Y(Ljava/lang/String;)V

    :cond_4
    :goto_1
    iget-object p1, p0, Lf2/n$b;->h:Lf2/n;

    invoke-virtual {p1}, Lf2/n;->v0()V

    iget-object p1, p0, Lf2/n$b;->h:Lf2/n;

    invoke-static {p1}, Lf2/n;->n(Lf2/n;)LLi/z;

    move-result-object p1

    iget-object v0, p0, Lf2/n$b;->h:Lf2/n;

    invoke-virtual {v0}, Lf2/n;->m0()Ljava/util/List;

    move-result-object v0

    invoke-interface {p1, v0}, LLi/y;->j(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, Lf2/F;->d()Z

    move-result p1

    if-nez p1, :cond_6

    iget-object p1, p0, Lf2/n$b;->h:Lf2/n;

    invoke-virtual {p1}, Lf2/n;->v0()V

    iget-object p1, p0, Lf2/n$b;->h:Lf2/n;

    invoke-static {p1}, Lf2/n;->l(Lf2/n;)LLi/z;

    move-result-object p1

    iget-object v0, p0, Lf2/n$b;->h:Lf2/n;

    invoke-static {v0}, Lf2/n;->d(Lf2/n;)LZg/m;

    move-result-object v0

    invoke-static {v0}, LZg/v;->l1(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    invoke-interface {p1, v0}, LLi/y;->j(Ljava/lang/Object;)Z

    iget-object p1, p0, Lf2/n$b;->h:Lf2/n;

    invoke-static {p1}, Lf2/n;->n(Lf2/n;)LLi/z;

    move-result-object p1

    iget-object v0, p0, Lf2/n$b;->h:Lf2/n;

    invoke-virtual {v0}, Lf2/n;->m0()Ljava/util/List;

    move-result-object v0

    invoke-interface {p1, v0}, LLi/y;->j(Ljava/lang/Object;)Z

    :cond_6
    :goto_2
    return-void
.end method

.method public g(Lf2/k;Z)V
    .locals 3

    const-string v0, "popUpTo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf2/n$b;->h:Lf2/n;

    invoke-static {v0}, Lf2/n;->m(Lf2/n;)Lf2/E;

    move-result-object v0

    invoke-virtual {p1}, Lf2/k;->f()Lf2/r;

    move-result-object v1

    invoke-virtual {v1}, Lf2/r;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lf2/E;->e(Ljava/lang/String;)Lf2/D;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-object v2, p0, Lf2/n$b;->h:Lf2/n;

    invoke-static {v2}, Lf2/n;->g(Lf2/n;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lf2/n$b;->g:Lf2/D;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, p0, Lf2/n$b;->h:Lf2/n;

    invoke-static {v0}, Lf2/n;->j(Lf2/n;)Lmh/l;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-super {p0, p1, p2}, Lf2/F;->g(Lf2/k;Z)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lf2/n$b;->h:Lf2/n;

    new-instance v1, Lf2/n$b$a;

    invoke-direct {v1, p0, p1, p2}, Lf2/n$b$a;-><init>(Lf2/n$b;Lf2/k;Z)V

    invoke-virtual {v0, p1, v1}, Lf2/n;->e0(Lf2/k;Lmh/a;)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lf2/n$b;->h:Lf2/n;

    invoke-static {v1}, Lf2/n;->i(Lf2/n;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v0, Lf2/n$b;

    invoke-virtual {v0, p1, p2}, Lf2/n$b;->g(Lf2/k;Z)V

    :goto_0
    return-void
.end method

.method public h(Lf2/k;Z)V
    .locals 1

    const-string v0, "popUpTo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lf2/F;->h(Lf2/k;Z)V

    return-void
.end method

.method public i(Lf2/k;)V
    .locals 1

    const-string v0, "entry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lf2/F;->i(Lf2/k;)V

    iget-object v0, p0, Lf2/n$b;->h:Lf2/n;

    invoke-static {v0}, Lf2/n;->d(Lf2/n;)LZg/m;

    move-result-object v0

    invoke-virtual {v0, p1}, LZg/m;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Landroidx/lifecycle/k$b;->STARTED:Landroidx/lifecycle/k$b;

    invoke-virtual {p1, v0}, Lf2/k;->p(Landroidx/lifecycle/k$b;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot transition entry that is not in the back stack"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public j(Lf2/k;)V
    .locals 2

    const-string v0, "backStackEntry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf2/n$b;->h:Lf2/n;

    invoke-static {v0}, Lf2/n;->m(Lf2/n;)Lf2/E;

    move-result-object v0

    invoke-virtual {p1}, Lf2/k;->f()Lf2/r;

    move-result-object v1

    invoke-virtual {v1}, Lf2/r;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lf2/E;->e(Ljava/lang/String;)Lf2/D;

    move-result-object v0

    iget-object v1, p0, Lf2/n$b;->g:Lf2/D;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, p0, Lf2/n$b;->h:Lf2/n;

    invoke-static {v0}, Lf2/n;->c(Lf2/n;)Lmh/l;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lf2/n$b;->n(Lf2/k;)V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Ignoring add of destination "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lf2/k;->f()Lf2/r;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " outside of the call to navigate(). "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "NavController"

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lf2/n$b;->h:Lf2/n;

    invoke-static {v1}, Lf2/n;->i(Lf2/n;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    check-cast v0, Lf2/n$b;

    invoke-virtual {v0, p1}, Lf2/n$b;->j(Lf2/k;)V

    :goto_0
    return-void

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NavigatorBackStack for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lf2/k;->f()Lf2/r;

    move-result-object p1

    invoke-virtual {p1}, Lf2/r;->u()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " should already be created"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final n(Lf2/k;)V
    .locals 1

    const-string v0, "backStackEntry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lf2/F;->j(Lf2/k;)V

    return-void
.end method
