.class public final Lpg/l;
.super Lgg/b;
.source "SourceFile"


# instance fields
.field final a:Lkg/a;


# direct methods
.method public constructor <init>(Lkg/a;)V
    .locals 0

    invoke-direct {p0}, Lgg/b;-><init>()V

    iput-object p1, p0, Lpg/l;->a:Lkg/a;

    return-void
.end method


# virtual methods
.method protected V(Lgg/d;)V
    .locals 2

    invoke-static {}, Lhg/c;->r()Lhg/c;

    move-result-object v0

    invoke-interface {p1, v0}, Lgg/d;->c(Lhg/c;)V

    invoke-interface {v0}, Lhg/c;->isDisposed()Z

    move-result v1

    if-nez v1, :cond_1

    :try_start_0
    iget-object v1, p0, Lpg/l;->a:Lkg/a;

    invoke-interface {v1}, Lkg/a;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Lhg/c;->isDisposed()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p1}, Lgg/d;->a()V

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-static {v1}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-interface {v0}, Lhg/c;->isDisposed()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Lgg/d;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    invoke-static {v1}, LEg/a;->v(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-void
.end method
