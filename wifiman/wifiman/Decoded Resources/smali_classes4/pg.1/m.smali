.class public final Lpg/m;
.super Lgg/b;
.source "SourceFile"


# instance fields
.field final a:Ljava/util/concurrent/Callable;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Callable;)V
    .locals 0

    invoke-direct {p0}, Lgg/b;-><init>()V

    iput-object p1, p0, Lpg/m;->a:Ljava/util/concurrent/Callable;

    return-void
.end method


# virtual methods
.method protected V(Lgg/d;)V
    .locals 2

    invoke-static {}, Lhg/c;->r()Lhg/c;

    move-result-object v0

    invoke-interface {p1, v0}, Lgg/d;->c(Lhg/c;)V

    :try_start_0
    iget-object v1, p0, Lpg/m;->a:Ljava/util/concurrent/Callable;

    invoke-interface {v1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Lhg/c;->isDisposed()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Lgg/d;->a()V

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    invoke-static {v1}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-interface {v0}, Lhg/c;->isDisposed()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, Lgg/d;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    invoke-static {v1}, LEg/a;->v(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
