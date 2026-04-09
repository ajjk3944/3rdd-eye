.class LNj/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LNj/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:Lgg/x;


# direct methods
.method constructor <init>(Lgg/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNj/e$a;->a:Lgg/x;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, LNj/e$a;->a:Lgg/x;

    invoke-interface {v0}, Lgg/x;->a()V

    return-void
.end method

.method public b(LMj/w;)V
    .locals 1

    iget-object v0, p0, LNj/e$a;->a:Lgg/x;

    invoke-static {p1}, LNj/d;->b(LMj/w;)LNj/d;

    move-result-object p1

    invoke-interface {v0, p1}, Lgg/x;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, LNj/e$a;->a:Lgg/x;

    invoke-interface {v0, p1}, Lgg/x;->c(Lhg/c;)V

    return-void
.end method

.method public bridge synthetic h(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LMj/w;

    invoke-virtual {p0, p1}, LNj/e$a;->b(LMj/w;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, LNj/e$a;->a:Lgg/x;

    invoke-static {p1}, LNj/d;->a(Ljava/lang/Throwable;)LNj/d;

    move-result-object p1

    invoke-interface {v0, p1}, Lgg/x;->h(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LNj/e$a;->a:Lgg/x;

    invoke-interface {p1}, Lgg/x;->a()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    iget-object v0, p0, LNj/e$a;->a:Lgg/x;

    invoke-interface {v0, p1}, Lgg/x;->onError(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    new-instance v1, Lio/reactivex/rxjava3/exceptions/CompositeException;

    filled-new-array {p1, v0}, [Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v1, p1}, Lio/reactivex/rxjava3/exceptions/CompositeException;-><init>([Ljava/lang/Throwable;)V

    invoke-static {v1}, LEg/a;->v(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
