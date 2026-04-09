.class final Lqg/l$a;
.super Lxg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final f:Ljava/util/Collection;

.field final g:Lkg/n;


# direct methods
.method constructor <init>(LDj/b;Lkg/n;Ljava/util/Collection;)V
    .locals 0

    invoke-direct {p0, p1}, Lxg/b;-><init>(LDj/b;)V

    iput-object p2, p0, Lqg/l$a;->g:Lkg/n;

    iput-object p3, p0, Lqg/l$a;->f:Ljava/util/Collection;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-boolean v0, p0, Lxg/b;->d:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lxg/b;->d:Z

    iget-object v0, p0, Lqg/l$a;->f:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    iget-object v0, p0, Lxg/b;->a:LDj/b;

    invoke-interface {v0}, LDj/b;->a()V

    :cond_0
    return-void
.end method

.method public clear()V
    .locals 1

    iget-object v0, p0, Lqg/l$a;->f:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    invoke-super {p0}, Lxg/b;->clear()V

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 2

    iget-boolean v0, p0, Lxg/b;->d:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lxg/b;->e:I

    if-nez v0, :cond_2

    :try_start_0
    iget-object v0, p0, Lqg/l$a;->g:Lkg/n;

    invoke-interface {v0, p1}, Lkg/n;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "The keySelector returned a null key"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v1, p0, Lqg/l$a;->f:Ljava/util/Collection;

    invoke-interface {v1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lxg/b;->a:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->h(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lxg/b;->b:LDj/c;

    const-wide/16 v0, 0x1

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0, p1}, Lxg/b;->d(Ljava/lang/Throwable;)V

    return-void

    :cond_2
    iget-object p1, p0, Lxg/b;->a:LDj/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LDj/b;->h(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Lxg/b;->d:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lxg/b;->d:Z

    iget-object v0, p0, Lqg/l$a;->f:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    iget-object v0, p0, Lxg/b;->a:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public poll()Ljava/lang/Object;
    .locals 4

    :cond_0
    :goto_0
    iget-object v0, p0, Lxg/b;->c:LDg/d;

    invoke-interface {v0}, LDg/g;->poll()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v1, p0, Lqg/l$a;->f:Ljava/util/Collection;

    iget-object v2, p0, Lqg/l$a;->g:Lkg/n;

    invoke-interface {v2, v0}, Lkg/n;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "The keySelector returned a null key"

    invoke-static {v2, v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    iget v0, p0, Lxg/b;->e:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lxg/b;->b:LDj/c;

    const-wide/16 v1, 0x1

    invoke-interface {v0, v1, v2}, LDj/c;->request(J)V

    goto :goto_0

    :cond_2
    :goto_1
    return-object v0
.end method

.method public requestFusion(I)I
    .locals 0

    invoke-virtual {p0, p1}, Lxg/b;->e(I)I

    move-result p1

    return p1
.end method
