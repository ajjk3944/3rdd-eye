.class final Lrg/s$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/p;
.implements Lhg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrg/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Lgg/p;

.field final b:Lrg/s;

.field c:Lhg/c;


# direct methods
.method constructor <init>(Lgg/p;Lrg/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrg/s$a;->a:Lgg/p;

    iput-object p2, p0, Lrg/s$a;->b:Lrg/s;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lrg/s$a;->c:Lhg/c;

    sget-object v1, Llg/b;->DISPOSED:Llg/b;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lrg/s$a;->b:Lrg/s;

    iget-object v0, v0, Lrg/s;->e:Lkg/a;

    invoke-interface {v0}, Lkg/a;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v1, p0, Lrg/s$a;->c:Lhg/c;

    iget-object v0, p0, Lrg/s$a;->a:Lgg/p;

    invoke-interface {v0}, Lgg/p;->a()V

    invoke-virtual {p0}, Lrg/s$a;->b()V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-virtual {p0, v0}, Lrg/s$a;->d(Ljava/lang/Throwable;)V

    return-void
.end method

.method b()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lrg/s$a;->b:Lrg/s;

    iget-object v0, v0, Lrg/s;->f:Lkg/a;

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

    iget-object v0, p0, Lrg/s$a;->c:Lhg/c;

    invoke-static {v0, p1}, Llg/b;->validate(Lhg/c;Lhg/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lrg/s$a;->b:Lrg/s;

    iget-object v0, v0, Lrg/s;->b:Lkg/f;

    invoke-interface {v0, p1}, Lkg/f;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object p1, p0, Lrg/s$a;->c:Lhg/c;

    iget-object p1, p0, Lrg/s$a;->a:Lgg/p;

    invoke-interface {p1, p0}, Lgg/p;->c(Lhg/c;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-interface {p1}, Lhg/c;->dispose()V

    sget-object p1, Llg/b;->DISPOSED:Llg/b;

    iput-object p1, p0, Lrg/s$a;->c:Lhg/c;

    iget-object p1, p0, Lrg/s$a;->a:Lgg/p;

    invoke-static {v0, p1}, Llg/c;->error(Ljava/lang/Throwable;Lgg/p;)V

    :cond_0
    :goto_0
    return-void
.end method

.method d(Ljava/lang/Throwable;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lrg/s$a;->b:Lrg/s;

    iget-object v0, v0, Lrg/s;->d:Lkg/f;

    invoke-interface {v0, p1}, Lkg/f;->accept(Ljava/lang/Object;)V
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
    sget-object v0, Llg/b;->DISPOSED:Llg/b;

    iput-object v0, p0, Lrg/s$a;->c:Lhg/c;

    iget-object v0, p0, Lrg/s$a;->a:Lgg/p;

    invoke-interface {v0, p1}, Lgg/p;->onError(Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lrg/s$a;->b()V

    return-void
.end method

.method public dispose()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lrg/s$a;->b:Lrg/s;

    iget-object v0, v0, Lrg/s;->g:Lkg/a;

    invoke-interface {v0}, Lkg/a;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {v0}, LEg/a;->v(Ljava/lang/Throwable;)V

    :goto_0
    iget-object v0, p0, Lrg/s$a;->c:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    sget-object v0, Llg/b;->DISPOSED:Llg/b;

    iput-object v0, p0, Lrg/s$a;->c:Lhg/c;

    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Lrg/s$a;->c:Lhg/c;

    invoke-interface {v0}, Lhg/c;->isDisposed()Z

    move-result v0

    return v0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lrg/s$a;->c:Lhg/c;

    sget-object v1, Llg/b;->DISPOSED:Llg/b;

    if-ne v0, v1, :cond_0

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lrg/s$a;->d(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lrg/s$a;->c:Lhg/c;

    sget-object v1, Llg/b;->DISPOSED:Llg/b;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lrg/s$a;->b:Lrg/s;

    iget-object v0, v0, Lrg/s;->c:Lkg/f;

    invoke-interface {v0, p1}, Lkg/f;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v1, p0, Lrg/s$a;->c:Lhg/c;

    iget-object v0, p0, Lrg/s$a;->a:Lgg/p;

    invoke-interface {v0, p1}, Lgg/p;->onSuccess(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lrg/s$a;->b()V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-virtual {p0, p1}, Lrg/s$a;->d(Ljava/lang/Throwable;)V

    return-void
.end method
