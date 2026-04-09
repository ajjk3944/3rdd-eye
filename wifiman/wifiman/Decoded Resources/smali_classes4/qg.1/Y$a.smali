.class final Lqg/Y$a;
.super Lyg/f;
.source "SourceFile"

# interfaces
.implements Lgg/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/Y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final i:LDj/b;

.field final j:Lkg/n;

.field k:Z

.field l:Z

.field m:J


# direct methods
.method constructor <init>(LDj/b;Lkg/n;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lyg/f;-><init>(Z)V

    iput-object p1, p0, Lqg/Y$a;->i:LDj/b;

    iput-object p2, p0, Lqg/Y$a;->j:Lkg/n;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-boolean v0, p0, Lqg/Y$a;->l:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/Y$a;->l:Z

    iput-boolean v0, p0, Lqg/Y$a;->k:Z

    iget-object v0, p0, Lqg/Y$a;->i:LDj/b;

    invoke-interface {v0}, LDj/b;->a()V

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 4

    iget-boolean v0, p0, Lqg/Y$a;->l:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Lqg/Y$a;->k:Z

    if-nez v0, :cond_1

    iget-wide v0, p0, Lqg/Y$a;->m:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lqg/Y$a;->m:J

    :cond_1
    iget-object v0, p0, Lqg/Y$a;->i:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public j(LDj/c;)V
    .locals 0

    invoke-virtual {p0, p1}, Lyg/f;->r(LDj/c;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 5

    iget-boolean v0, p0, Lqg/Y$a;->k:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lqg/Y$a;->l:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lqg/Y$a;->i:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/Y$a;->k:Z

    :try_start_0
    iget-object v0, p0, Lqg/Y$a;->j:Lkg/n;

    invoke-interface {v0, p1}, Lkg/n;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "The nextSupplier returned a null Publisher"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, LDj/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-wide v1, p0, Lqg/Y$a;->m:J

    const-wide/16 v3, 0x0

    cmp-long p1, v1, v3

    if-eqz p1, :cond_2

    invoke-virtual {p0, v1, v2}, Lyg/f;->p(J)V

    :cond_2
    invoke-interface {v0, p0}, LDj/a;->b(LDj/b;)V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    iget-object v1, p0, Lqg/Y$a;->i:LDj/b;

    new-instance v2, Lio/reactivex/rxjava3/exceptions/CompositeException;

    filled-new-array {p1, v0}, [Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v2, p1}, Lio/reactivex/rxjava3/exceptions/CompositeException;-><init>([Ljava/lang/Throwable;)V

    invoke-interface {v1, v2}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
