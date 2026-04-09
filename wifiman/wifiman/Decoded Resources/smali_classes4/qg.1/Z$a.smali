.class final Lqg/Z$a;
.super Lxg/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/Z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final e:Lkg/n;


# direct methods
.method constructor <init>(LDj/b;Lkg/n;)V
    .locals 0

    invoke-direct {p0, p1}, Lxg/j;-><init>(LDj/b;)V

    iput-object p2, p0, Lqg/Z$a;->e:Lkg/n;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lxg/j;->a:LDj/b;

    invoke-interface {v0}, LDj/b;->a()V

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 4

    iget-wide v0, p0, Lxg/j;->d:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lxg/j;->d:J

    iget-object v0, p0, Lxg/j;->a:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lqg/Z$a;->e:Lkg/n;

    invoke-interface {v0, p1}, Lkg/n;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "The valueSupplier returned a null value"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v0}, Lxg/j;->d(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    iget-object v1, p0, Lxg/j;->a:LDj/b;

    new-instance v2, Lio/reactivex/rxjava3/exceptions/CompositeException;

    filled-new-array {p1, v0}, [Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v2, p1}, Lio/reactivex/rxjava3/exceptions/CompositeException;-><init>([Ljava/lang/Throwable;)V

    invoke-interface {v1, v2}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
