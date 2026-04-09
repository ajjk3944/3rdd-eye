.class final LQ2/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ2/j;
.implements Landroidx/lifecycle/n;


# instance fields
.field private final a:Ljava/util/Set;

.field private final b:Landroidx/lifecycle/k;


# direct methods
.method constructor <init>(Landroidx/lifecycle/k;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, LQ2/k;->a:Ljava/util/Set;

    iput-object p1, p0, LQ2/k;->b:Landroidx/lifecycle/k;

    invoke-virtual {p1, p0}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/n;)V

    return-void
.end method


# virtual methods
.method public a(LQ2/l;)V
    .locals 1

    iget-object v0, p0, LQ2/k;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public b(LQ2/l;)V
    .locals 2

    iget-object v0, p0, LQ2/k;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LQ2/k;->b:Landroidx/lifecycle/k;

    invoke-virtual {v0}, Landroidx/lifecycle/k;->b()Landroidx/lifecycle/k$b;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/k$b;->DESTROYED:Landroidx/lifecycle/k$b;

    if-ne v0, v1, :cond_0

    invoke-interface {p1}, LQ2/l;->f()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LQ2/k;->b:Landroidx/lifecycle/k;

    invoke-virtual {v0}, Landroidx/lifecycle/k;->b()Landroidx/lifecycle/k$b;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/k$b;->STARTED:Landroidx/lifecycle/k$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k$b;->isAtLeast(Landroidx/lifecycle/k$b;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, LQ2/l;->b()V

    goto :goto_0

    :cond_1
    invoke-interface {p1}, LQ2/l;->a()V

    :goto_0
    return-void
.end method

.method public onDestroy(Landroidx/lifecycle/o;)V
    .locals 2
    .annotation runtime Landroidx/lifecycle/w;
        value = .enum Landroidx/lifecycle/k$a;->ON_DESTROY:Landroidx/lifecycle/k$a;
    .end annotation

    iget-object v0, p0, LQ2/k;->a:Ljava/util/Set;

    invoke-static {v0}, LW2/l;->j(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LQ2/l;

    invoke-interface {v1}, LQ2/l;->f()V

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Landroidx/lifecycle/o;->O()Landroidx/lifecycle/k;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/lifecycle/k;->c(Landroidx/lifecycle/n;)V

    return-void
.end method

.method public onStart(Landroidx/lifecycle/o;)V
    .locals 1
    .annotation runtime Landroidx/lifecycle/w;
        value = .enum Landroidx/lifecycle/k$a;->ON_START:Landroidx/lifecycle/k$a;
    .end annotation

    iget-object p1, p0, LQ2/k;->a:Ljava/util/Set;

    invoke-static {p1}, LW2/l;->j(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LQ2/l;

    invoke-interface {v0}, LQ2/l;->b()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onStop(Landroidx/lifecycle/o;)V
    .locals 1
    .annotation runtime Landroidx/lifecycle/w;
        value = .enum Landroidx/lifecycle/k$a;->ON_STOP:Landroidx/lifecycle/k$a;
    .end annotation

    iget-object p1, p0, LQ2/k;->a:Ljava/util/Set;

    invoke-static {p1}, LW2/l;->j(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LQ2/l;

    invoke-interface {v0}, LQ2/l;->a()V

    goto :goto_0

    :cond_0
    return-void
.end method
