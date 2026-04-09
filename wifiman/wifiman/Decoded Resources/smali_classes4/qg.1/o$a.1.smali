.class final Lqg/o$a;
.super Lxg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final f:Lkg/f;

.field final g:Lkg/f;

.field final h:Lkg/a;

.field final i:Lkg/a;


# direct methods
.method constructor <init>(LDg/a;Lkg/f;Lkg/f;Lkg/a;Lkg/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lxg/a;-><init>(LDg/a;)V

    iput-object p2, p0, Lqg/o$a;->f:Lkg/f;

    iput-object p3, p0, Lqg/o$a;->g:Lkg/f;

    iput-object p4, p0, Lqg/o$a;->h:Lkg/a;

    iput-object p5, p0, Lqg/o$a;->i:Lkg/a;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-boolean v0, p0, Lxg/a;->d:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lqg/o$a;->h:Lkg/a;

    invoke-interface {v0}, Lkg/a;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lxg/a;->d:Z

    iget-object v0, p0, Lxg/a;->a:LDg/a;

    invoke-interface {v0}, LDj/b;->a()V

    :try_start_1
    iget-object v0, p0, Lqg/o$a;->i:Lkg/a;

    invoke-interface {v0}, Lkg/a;->run()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {v0}, LEg/a;->v(Ljava/lang/Throwable;)V

    :goto_0
    return-void

    :catchall_1
    move-exception v0

    invoke-virtual {p0, v0}, Lxg/a;->d(Ljava/lang/Throwable;)V

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 1

    iget-boolean v0, p0, Lxg/a;->d:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lxg/a;->e:I

    if-eqz v0, :cond_1

    iget-object p1, p0, Lxg/a;->a:LDg/a;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LDj/b;->h(Ljava/lang/Object;)V

    return-void

    :cond_1
    :try_start_0
    iget-object v0, p0, Lqg/o$a;->f:Lkg/f;

    invoke-interface {v0, p1}, Lkg/f;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lxg/a;->a:LDg/a;

    invoke-interface {v0, p1}, LDj/b;->h(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p0, p1}, Lxg/a;->d(Ljava/lang/Throwable;)V

    return-void
.end method

.method public m(Ljava/lang/Object;)Z
    .locals 2

    iget-boolean v0, p0, Lxg/a;->d:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    :try_start_0
    iget-object v0, p0, Lqg/o$a;->f:Lkg/f;

    invoke-interface {v0, p1}, Lkg/f;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lxg/a;->a:LDg/a;

    invoke-interface {v0, p1}, LDg/a;->m(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :catchall_0
    move-exception p1

    invoke-virtual {p0, p1}, Lxg/a;->d(Ljava/lang/Throwable;)V

    return v1
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 3

    iget-boolean v0, p0, Lxg/a;->d:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lxg/a;->d:Z

    :try_start_0
    iget-object v0, p0, Lqg/o$a;->g:Lkg/f;

    invoke-interface {v0, p1}, Lkg/f;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lxg/a;->a:LDg/a;

    invoke-interface {v0, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    iget-object v1, p0, Lxg/a;->a:LDg/a;

    new-instance v2, Lio/reactivex/rxjava3/exceptions/CompositeException;

    filled-new-array {p1, v0}, [Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v2, p1}, Lio/reactivex/rxjava3/exceptions/CompositeException;-><init>([Ljava/lang/Throwable;)V

    invoke-interface {v1, v2}, LDj/b;->onError(Ljava/lang/Throwable;)V

    :goto_0
    :try_start_1
    iget-object p1, p0, Lqg/o$a;->i:Lkg/a;

    invoke-interface {p1}, Lkg/a;->run()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method

.method public poll()Ljava/lang/Object;
    .locals 3

    :try_start_0
    iget-object v0, p0, Lxg/a;->c:LDg/d;

    invoke-interface {v0}, LDg/g;->poll()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    if-eqz v0, :cond_0

    :try_start_1
    iget-object v1, p0, Lqg/o$a;->f:Lkg/f;

    invoke-interface {v1, v0}, Lkg/f;->accept(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v1, p0, Lqg/o$a;->i:Lkg/a;

    invoke-interface {v1}, Lkg/a;->run()V

    goto :goto_1

    :catchall_0
    move-exception v0

    :try_start_2
    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    iget-object v1, p0, Lqg/o$a;->g:Lkg/f;

    invoke-interface {v1, v0}, Lkg/f;->accept(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    invoke-static {v0}, Lzg/h;->f(Ljava/lang/Throwable;)Ljava/lang/Exception;

    move-result-object v0

    throw v0

    :catchall_1
    move-exception v0

    goto :goto_0

    :catchall_2
    move-exception v1

    invoke-static {v1}, Lig/a;->b(Ljava/lang/Throwable;)V

    new-instance v2, Lio/reactivex/rxjava3/exceptions/CompositeException;

    filled-new-array {v0, v1}, [Ljava/lang/Throwable;

    move-result-object v0

    invoke-direct {v2, v0}, Lio/reactivex/rxjava3/exceptions/CompositeException;-><init>([Ljava/lang/Throwable;)V

    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_0
    iget-object v1, p0, Lqg/o$a;->i:Lkg/a;

    invoke-interface {v1}, Lkg/a;->run()V

    throw v0

    :cond_0
    iget v1, p0, Lxg/a;->e:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lqg/o$a;->h:Lkg/a;

    invoke-interface {v1}, Lkg/a;->run()V

    iget-object v1, p0, Lqg/o$a;->i:Lkg/a;

    invoke-interface {v1}, Lkg/a;->run()V

    :cond_1
    :goto_1
    return-object v0

    :catchall_3
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    :try_start_5
    iget-object v1, p0, Lqg/o$a;->g:Lkg/f;

    invoke-interface {v1, v0}, Lkg/f;->accept(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    invoke-static {v0}, Lzg/h;->f(Ljava/lang/Throwable;)Ljava/lang/Exception;

    move-result-object v0

    throw v0

    :catchall_4
    move-exception v1

    invoke-static {v1}, Lig/a;->b(Ljava/lang/Throwable;)V

    new-instance v2, Lio/reactivex/rxjava3/exceptions/CompositeException;

    filled-new-array {v0, v1}, [Ljava/lang/Throwable;

    move-result-object v0

    invoke-direct {v2, v0}, Lio/reactivex/rxjava3/exceptions/CompositeException;-><init>([Ljava/lang/Throwable;)V

    throw v2
.end method

.method public requestFusion(I)I
    .locals 0

    invoke-virtual {p0, p1}, Lxg/a;->e(I)I

    move-result p1

    return p1
.end method
