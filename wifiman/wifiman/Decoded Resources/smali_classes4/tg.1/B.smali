.class public final Ltg/B;
.super Lgg/s;
.source "SourceFile"

# interfaces
.implements Lkg/q;


# instance fields
.field final a:Ljava/util/concurrent/Callable;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Callable;)V
    .locals 0

    invoke-direct {p0}, Lgg/s;-><init>()V

    iput-object p1, p0, Ltg/B;->a:Ljava/util/concurrent/Callable;

    return-void
.end method


# virtual methods
.method public L0(Lgg/x;)V
    .locals 3

    new-instance v0, Log/g;

    invoke-direct {v0, p1}, Log/g;-><init>(Lgg/x;)V

    invoke-interface {p1, v0}, Lgg/x;->c(Lhg/c;)V

    invoke-virtual {v0}, Log/g;->isDisposed()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v1, p0, Ltg/B;->a:Ljava/util/concurrent/Callable;

    invoke-interface {v1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Callable returned a null value."

    invoke-static {v1, v2}, Lzg/h;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0, p1}, Log/g;->g(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception v1

    invoke-static {v1}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-virtual {v0}, Log/g;->isDisposed()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    invoke-static {v1}, LEg/a;->v(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ltg/B;->a:Ljava/util/concurrent/Callable;

    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "The Callable returned a null value."

    invoke-static {v0, v1}, Lzg/h;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
