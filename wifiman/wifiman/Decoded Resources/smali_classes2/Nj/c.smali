.class final LNj/c;
.super Lgg/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LNj/c$a;
    }
.end annotation


# instance fields
.field private final a:LMj/d;


# direct methods
.method constructor <init>(LMj/d;)V
    .locals 0

    invoke-direct {p0}, Lgg/s;-><init>()V

    iput-object p1, p0, LNj/c;->a:LMj/d;

    return-void
.end method


# virtual methods
.method protected L0(Lgg/x;)V
    .locals 4

    iget-object v0, p0, LNj/c;->a:LMj/d;

    invoke-interface {v0}, LMj/d;->clone()LMj/d;

    move-result-object v0

    new-instance v1, LNj/c$a;

    invoke-direct {v1, v0}, LNj/c$a;-><init>(LMj/d;)V

    invoke-interface {p1, v1}, Lgg/x;->c(Lhg/c;)V

    invoke-virtual {v1}, LNj/c$a;->isDisposed()Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    :cond_0
    const/4 v2, 0x0

    :try_start_0
    invoke-interface {v0}, LMj/d;->g()LMj/w;

    move-result-object v0

    invoke-virtual {v1}, LNj/c$a;->isDisposed()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-interface {p1, v0}, Lgg/x;->h(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {v1}, LNj/c$a;->isDisposed()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_3

    :try_start_1
    invoke-interface {p1}, Lgg/x;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    const/4 v2, 0x1

    :goto_1
    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    if-eqz v2, :cond_2

    invoke-static {v0}, LEg/a;->v(Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, LNj/c$a;->isDisposed()Z

    move-result v1

    if-nez v1, :cond_3

    :try_start_2
    invoke-interface {p1, v0}, Lgg/x;->onError(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    new-instance v1, Lio/reactivex/rxjava3/exceptions/CompositeException;

    filled-new-array {v0, p1}, [Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v1, p1}, Lio/reactivex/rxjava3/exceptions/CompositeException;-><init>([Ljava/lang/Throwable;)V

    invoke-static {v1}, LEg/a;->v(Ljava/lang/Throwable;)V

    :cond_3
    :goto_2
    return-void
.end method
