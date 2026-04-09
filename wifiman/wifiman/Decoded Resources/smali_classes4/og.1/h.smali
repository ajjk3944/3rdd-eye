.class public final Log/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/x;
.implements Lhg/c;


# instance fields
.field final a:Lgg/x;

.field final b:Lkg/f;

.field final c:Lkg/a;

.field d:Lhg/c;


# direct methods
.method public constructor <init>(Lgg/x;Lkg/f;Lkg/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Log/h;->a:Lgg/x;

    iput-object p2, p0, Log/h;->b:Lkg/f;

    iput-object p3, p0, Log/h;->c:Lkg/a;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Log/h;->d:Lhg/c;

    sget-object v1, Llg/b;->DISPOSED:Llg/b;

    if-eq v0, v1, :cond_0

    iput-object v1, p0, Log/h;->d:Lhg/c;

    iget-object v0, p0, Log/h;->a:Lgg/x;

    invoke-interface {v0}, Lgg/x;->a()V

    :cond_0
    return-void
.end method

.method public c(Lhg/c;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Log/h;->b:Lkg/f;

    invoke-interface {v0, p1}, Lkg/f;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Log/h;->d:Lhg/c;

    invoke-static {v0, p1}, Llg/b;->validate(Lhg/c;Lhg/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Log/h;->d:Lhg/c;

    iget-object p1, p0, Log/h;->a:Lgg/x;

    invoke-interface {p1, p0}, Lgg/x;->c(Lhg/c;)V

    :cond_0
    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-interface {p1}, Lhg/c;->dispose()V

    sget-object p1, Llg/b;->DISPOSED:Llg/b;

    iput-object p1, p0, Log/h;->d:Lhg/c;

    iget-object p1, p0, Log/h;->a:Lgg/x;

    invoke-static {v0, p1}, Llg/c;->error(Ljava/lang/Throwable;Lgg/x;)V

    return-void
.end method

.method public dispose()V
    .locals 2

    iget-object v0, p0, Log/h;->d:Lhg/c;

    sget-object v1, Llg/b;->DISPOSED:Llg/b;

    if-eq v0, v1, :cond_0

    iput-object v1, p0, Log/h;->d:Lhg/c;

    :try_start_0
    iget-object v1, p0, Log/h;->c:Lkg/a;

    invoke-interface {v1}, Lkg/a;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-static {v1}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {v1}, LEg/a;->v(Ljava/lang/Throwable;)V

    :goto_0
    invoke-interface {v0}, Lhg/c;->dispose()V

    :cond_0
    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Log/h;->a:Lgg/x;

    invoke-interface {v0, p1}, Lgg/x;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Log/h;->d:Lhg/c;

    invoke-interface {v0}, Lhg/c;->isDisposed()Z

    move-result v0

    return v0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Log/h;->d:Lhg/c;

    sget-object v1, Llg/b;->DISPOSED:Llg/b;

    if-eq v0, v1, :cond_0

    iput-object v1, p0, Log/h;->d:Lhg/c;

    iget-object v0, p0, Log/h;->a:Lgg/x;

    invoke-interface {v0, p1}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
