.class public final Lrg/k;
.super Lgg/n;
.source "SourceFile"

# interfaces
.implements Lkg/q;


# instance fields
.field final a:Ljava/util/concurrent/Callable;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Callable;)V
    .locals 0

    invoke-direct {p0}, Lgg/n;-><init>()V

    iput-object p1, p0, Lrg/k;->a:Ljava/util/concurrent/Callable;

    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lrg/k;->a:Ljava/util/concurrent/Callable;

    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method protected v(Lgg/p;)V
    .locals 2

    invoke-static {}, Lhg/c;->r()Lhg/c;

    move-result-object v0

    invoke-interface {p1, v0}, Lgg/p;->c(Lhg/c;)V

    invoke-interface {v0}, Lhg/c;->isDisposed()Z

    move-result v1

    if-nez v1, :cond_2

    :try_start_0
    iget-object v1, p0, Lrg/k;->a:Ljava/util/concurrent/Callable;

    invoke-interface {v1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Lhg/c;->isDisposed()Z

    move-result v0

    if-nez v0, :cond_2

    if-nez v1, :cond_0

    invoke-interface {p1}, Lgg/p;->a()V

    goto :goto_0

    :cond_0
    invoke-interface {p1, v1}, Lgg/p;->onSuccess(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-static {v1}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-interface {v0}, Lhg/c;->isDisposed()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, Lgg/p;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    invoke-static {v1}, LEg/a;->v(Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    return-void
.end method
