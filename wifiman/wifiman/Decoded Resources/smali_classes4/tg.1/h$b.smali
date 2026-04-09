.class final Ltg/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/x;
.implements Lhg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field final a:Lgg/x;

.field final b:J

.field final c:Ljava/util/concurrent/TimeUnit;

.field final d:Lgg/y$c;

.field final e:Lkg/f;

.field f:Lhg/c;

.field g:Ltg/h$a;

.field volatile h:J

.field i:Z


# direct methods
.method constructor <init>(Lgg/x;JLjava/util/concurrent/TimeUnit;Lgg/y$c;Lkg/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltg/h$b;->a:Lgg/x;

    iput-wide p2, p0, Ltg/h$b;->b:J

    iput-object p4, p0, Ltg/h$b;->c:Ljava/util/concurrent/TimeUnit;

    iput-object p5, p0, Ltg/h$b;->d:Lgg/y$c;

    iput-object p6, p0, Ltg/h$b;->e:Lkg/f;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-boolean v0, p0, Ltg/h$b;->i:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Ltg/h$b;->i:Z

    iget-object v0, p0, Ltg/h$b;->g:Ltg/h$a;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ltg/h$a;->dispose()V

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ltg/h$a;->run()V

    :cond_2
    iget-object v0, p0, Ltg/h$b;->a:Lgg/x;

    invoke-interface {v0}, Lgg/x;->a()V

    iget-object v0, p0, Ltg/h$b;->d:Lgg/y$c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    return-void
.end method

.method b(JLjava/lang/Object;Ltg/h$a;)V
    .locals 2

    iget-wide v0, p0, Ltg/h$b;->h:J

    cmp-long p1, p1, v0

    if-nez p1, :cond_0

    iget-object p1, p0, Ltg/h$b;->a:Lgg/x;

    invoke-interface {p1, p3}, Lgg/x;->h(Ljava/lang/Object;)V

    invoke-virtual {p4}, Ltg/h$a;->dispose()V

    :cond_0
    return-void
.end method

.method public c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, Ltg/h$b;->f:Lhg/c;

    invoke-static {v0, p1}, Llg/b;->validate(Lhg/c;Lhg/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Ltg/h$b;->f:Lhg/c;

    iget-object p1, p0, Ltg/h$b;->a:Lgg/x;

    invoke-interface {p1, p0}, Lgg/x;->c(Lhg/c;)V

    :cond_0
    return-void
.end method

.method public dispose()V
    .locals 1

    iget-object v0, p0, Ltg/h$b;->f:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    iget-object v0, p0, Ltg/h$b;->d:Lgg/y$c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 4

    iget-boolean v0, p0, Ltg/h$b;->i:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-wide v0, p0, Ltg/h$b;->h:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ltg/h$b;->h:J

    iget-object v2, p0, Ltg/h$b;->g:Ltg/h$a;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ltg/h$a;->dispose()V

    :cond_1
    iget-object v3, p0, Ltg/h$b;->e:Lkg/f;

    if-eqz v3, :cond_2

    if-eqz v2, :cond_2

    :try_start_0
    iget-object v2, p0, Ltg/h$b;->g:Ltg/h$a;

    iget-object v2, v2, Ltg/h$a;->a:Ljava/lang/Object;

    invoke-interface {v3, v2}, Lkg/f;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    invoke-static {v2}, Lig/a;->b(Ljava/lang/Throwable;)V

    iget-object v3, p0, Ltg/h$b;->f:Lhg/c;

    invoke-interface {v3}, Lhg/c;->dispose()V

    iget-object v3, p0, Ltg/h$b;->a:Lgg/x;

    invoke-interface {v3, v2}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    const/4 v2, 0x1

    iput-boolean v2, p0, Ltg/h$b;->i:Z

    :cond_2
    :goto_0
    new-instance v2, Ltg/h$a;

    invoke-direct {v2, p1, v0, v1, p0}, Ltg/h$a;-><init>(Ljava/lang/Object;JLtg/h$b;)V

    iput-object v2, p0, Ltg/h$b;->g:Ltg/h$a;

    iget-object p1, p0, Ltg/h$b;->d:Lgg/y$c;

    iget-wide v0, p0, Ltg/h$b;->b:J

    iget-object v3, p0, Ltg/h$b;->c:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v2, v0, v1, v3}, Lgg/y$c;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lhg/c;

    move-result-object p1

    invoke-virtual {v2, p1}, Ltg/h$a;->a(Lhg/c;)V

    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Ltg/h$b;->d:Lgg/y$c;

    invoke-interface {v0}, Lhg/c;->isDisposed()Z

    move-result v0

    return v0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Ltg/h$b;->i:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iget-object v0, p0, Ltg/h$b;->g:Ltg/h$a;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lhg/c;->dispose()V

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Ltg/h$b;->i:Z

    iget-object v0, p0, Ltg/h$b;->a:Lgg/x;

    invoke-interface {v0, p1}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    iget-object p1, p0, Ltg/h$b;->d:Lgg/y$c;

    invoke-interface {p1}, Lhg/c;->dispose()V

    return-void
.end method
