.class LO6/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO6/e;-><init>(Ljava/lang/String;LK6/B;Ljava/util/concurrent/ExecutorService;Lgg/y;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lgg/y;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:LO6/e;


# direct methods
.method constructor <init>(LO6/e;Lgg/y;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LO6/e$a;->c:LO6/e;

    iput-object p2, p0, LO6/e$a;->a:Lgg/y;

    iput-object p3, p0, LO6/e$a;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    :goto_0
    iget-object v0, p0, LO6/e$a;->c:LO6/e;

    iget-boolean v0, v0, LO6/e;->f:Z

    if-eqz v0, :cond_1

    :try_start_0
    iget-object v0, p0, LO6/e$a;->c:LO6/e;

    iget-object v0, v0, LO6/e;->d:LO6/h;

    invoke-virtual {v0}, LO6/h;->d()LO6/g;

    move-result-object v0

    iget-object v1, v0, LO6/g;->b:LM6/j;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v1}, LL6/b;->t(LM6/j;)V

    invoke-static {v1}, LL6/b;->r(LM6/j;)V

    new-instance v4, LO6/j;

    invoke-direct {v4}, LO6/j;-><init>()V

    iget-object v5, p0, LO6/e$a;->a:Lgg/y;

    invoke-virtual {v0, v4, v5}, LO6/g;->b(LO6/j;Lgg/y;)V

    invoke-virtual {v4}, LO6/j;->a()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {v1, v2, v3, v4, v5}, LL6/b;->o(LM6/j;JJ)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, LO6/e$a;->c:LO6/e;

    monitor-enter v1

    :try_start_1
    iget-object v2, p0, LO6/e$a;->c:LO6/e;

    iget-boolean v2, v2, LO6/e;->f:Z

    if-nez v2, :cond_0

    monitor-exit v1

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string/jumbo v1, "Error while processing connection operation queue"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, LI6/q;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :goto_1
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :cond_1
    :goto_2
    iget-object v0, p0, LO6/e$a;->c:LO6/e;

    invoke-virtual {v0}, LO6/e;->d()V

    const-string/jumbo v0, "Terminated (%s)"

    iget-object v1, p0, LO6/e$a;->b:Ljava/lang/String;

    invoke-static {v1}, LL6/b;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, LI6/q;->p(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
