.class final Lpg/v$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/d;
.implements Lhg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpg/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field final a:Lgg/d;

.field b:Lhg/c;

.field final synthetic c:Lpg/v;


# direct methods
.method constructor <init>(Lpg/v;Lgg/d;)V
    .locals 0

    iput-object p1, p0, Lpg/v$a;->c:Lpg/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lpg/v$a;->a:Lgg/d;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lpg/v$a;->b:Lhg/c;

    sget-object v1, Llg/b;->DISPOSED:Llg/b;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lpg/v$a;->c:Lpg/v;

    iget-object v0, v0, Lpg/v;->d:Lkg/a;

    invoke-interface {v0}, Lkg/a;->run()V

    iget-object v0, p0, Lpg/v$a;->c:Lpg/v;

    iget-object v0, v0, Lpg/v;->e:Lkg/a;

    invoke-interface {v0}, Lkg/a;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lpg/v$a;->a:Lgg/d;

    invoke-interface {v0}, Lgg/d;->a()V

    invoke-virtual {p0}, Lpg/v$a;->b()V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    iget-object v1, p0, Lpg/v$a;->a:Lgg/d;

    invoke-interface {v1, v0}, Lgg/d;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method b()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lpg/v$a;->c:Lpg/v;

    iget-object v0, v0, Lpg/v;->f:Lkg/a;

    invoke-interface {v0}, Lkg/a;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {v0}, LEg/a;->v(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public c(Lhg/c;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lpg/v$a;->c:Lpg/v;

    iget-object v0, v0, Lpg/v;->b:Lkg/f;

    invoke-interface {v0, p1}, Lkg/f;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lpg/v$a;->b:Lhg/c;

    invoke-static {v0, p1}, Llg/b;->validate(Lhg/c;Lhg/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lpg/v$a;->b:Lhg/c;

    iget-object p1, p0, Lpg/v$a;->a:Lgg/d;

    invoke-interface {p1, p0}, Lgg/d;->c(Lhg/c;)V

    :cond_0
    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-interface {p1}, Lhg/c;->dispose()V

    sget-object p1, Llg/b;->DISPOSED:Llg/b;

    iput-object p1, p0, Lpg/v$a;->b:Lhg/c;

    iget-object p1, p0, Lpg/v$a;->a:Lgg/d;

    invoke-static {v0, p1}, Llg/c;->error(Ljava/lang/Throwable;Lgg/d;)V

    return-void
.end method

.method public dispose()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lpg/v$a;->c:Lpg/v;

    iget-object v0, v0, Lpg/v;->g:Lkg/a;

    invoke-interface {v0}, Lkg/a;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {v0}, LEg/a;->v(Ljava/lang/Throwable;)V

    :goto_0
    iget-object v0, p0, Lpg/v$a;->b:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Lpg/v$a;->b:Lhg/c;

    invoke-interface {v0}, Lhg/c;->isDisposed()Z

    move-result v0

    return v0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lpg/v$a;->b:Lhg/c;

    sget-object v1, Llg/b;->DISPOSED:Llg/b;

    if-ne v0, v1, :cond_0

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lpg/v$a;->c:Lpg/v;

    iget-object v0, v0, Lpg/v;->c:Lkg/f;

    invoke-interface {v0, p1}, Lkg/f;->accept(Ljava/lang/Object;)V

    iget-object v0, p0, Lpg/v$a;->c:Lpg/v;

    iget-object v0, v0, Lpg/v;->e:Lkg/a;

    invoke-interface {v0}, Lkg/a;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    new-instance v1, Lio/reactivex/rxjava3/exceptions/CompositeException;

    filled-new-array {p1, v0}, [Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v1, p1}, Lio/reactivex/rxjava3/exceptions/CompositeException;-><init>([Ljava/lang/Throwable;)V

    move-object p1, v1

    :goto_0
    iget-object v0, p0, Lpg/v$a;->a:Lgg/d;

    invoke-interface {v0, p1}, Lgg/d;->onError(Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lpg/v$a;->b()V

    return-void
.end method
