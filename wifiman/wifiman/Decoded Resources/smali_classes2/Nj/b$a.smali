.class final LNj/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhg/c;
.implements LMj/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LNj/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:LMj/d;

.field private final b:Lgg/x;

.field private volatile c:Z

.field d:Z


# direct methods
.method constructor <init>(LMj/d;Lgg/x;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LNj/b$a;->d:Z

    iput-object p1, p0, LNj/b$a;->a:LMj/d;

    iput-object p2, p0, LNj/b$a;->b:Lgg/x;

    return-void
.end method


# virtual methods
.method public a(LMj/d;LMj/w;)V
    .locals 1

    iget-boolean p1, p0, LNj/b$a;->c:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object p1, p0, LNj/b$a;->b:Lgg/x;

    invoke-interface {p1, p2}, Lgg/x;->h(Ljava/lang/Object;)V

    iget-boolean p1, p0, LNj/b$a;->c:Z

    if-nez p1, :cond_2

    const/4 p1, 0x1

    iput-boolean p1, p0, LNj/b$a;->d:Z

    iget-object p1, p0, LNj/b$a;->b:Lgg/x;

    invoke-interface {p1}, Lgg/x;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    iget-boolean p2, p0, LNj/b$a;->d:Z

    if-eqz p2, :cond_1

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    iget-boolean p2, p0, LNj/b$a;->c:Z

    if-nez p2, :cond_2

    :try_start_1
    iget-object p2, p0, LNj/b$a;->b:Lgg/x;

    invoke-interface {p2, p1}, Lgg/x;->onError(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    invoke-static {p2}, Lig/a;->b(Ljava/lang/Throwable;)V

    new-instance v0, Lio/reactivex/rxjava3/exceptions/CompositeException;

    filled-new-array {p1, p2}, [Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v0, p1}, Lio/reactivex/rxjava3/exceptions/CompositeException;-><init>([Ljava/lang/Throwable;)V

    invoke-static {v0}, LEg/a;->v(Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public b(LMj/d;Ljava/lang/Throwable;)V
    .locals 1

    invoke-interface {p1}, LMj/d;->v()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object p1, p0, LNj/b$a;->b:Lgg/x;

    invoke-interface {p1, p2}, Lgg/x;->onError(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    new-instance v0, Lio/reactivex/rxjava3/exceptions/CompositeException;

    filled-new-array {p2, p1}, [Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v0, p1}, Lio/reactivex/rxjava3/exceptions/CompositeException;-><init>([Ljava/lang/Throwable;)V

    invoke-static {v0}, LEg/a;->v(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public dispose()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LNj/b$a;->c:Z

    iget-object v0, p0, LNj/b$a;->a:LMj/d;

    invoke-interface {v0}, LMj/d;->cancel()V

    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-boolean v0, p0, LNj/b$a;->c:Z

    return v0
.end method
