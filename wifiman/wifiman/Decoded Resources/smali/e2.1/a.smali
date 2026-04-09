.class public abstract Le2/a;
.super Le2/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le2/a$a;
    }
.end annotation


# instance fields
.field private final i:Ljava/util/concurrent/Executor;

.field volatile j:Le2/a$a;

.field volatile k:Le2/a$a;

.field l:J

.field m:J

.field n:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    sget-object v0, Le2/c;->h:Ljava/util/concurrent/Executor;

    invoke-direct {p0, p1, v0}, Le2/a;-><init>(Landroid/content/Context;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;)V
    .locals 2

    .line 2
    invoke-direct {p0, p1}, Le2/b;-><init>(Landroid/content/Context;)V

    const-wide/16 v0, -0x2710

    .line 3
    iput-wide v0, p0, Le2/a;->m:J

    .line 4
    iput-object p2, p0, Le2/a;->i:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method A()V
    .locals 6

    iget-object v0, p0, Le2/a;->k:Le2/a$a;

    if-nez v0, :cond_2

    iget-object v0, p0, Le2/a;->j:Le2/a$a;

    if-eqz v0, :cond_2

    iget-object v0, p0, Le2/a;->j:Le2/a$a;

    iget-boolean v0, v0, Le2/a$a;->l:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Le2/a;->j:Le2/a$a;

    const/4 v1, 0x0

    iput-boolean v1, v0, Le2/a$a;->l:Z

    iget-object v0, p0, Le2/a;->n:Landroid/os/Handler;

    iget-object v1, p0, Le2/a;->j:Le2/a$a;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    iget-wide v0, p0, Le2/a;->l:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Le2/a;->m:J

    iget-wide v4, p0, Le2/a;->l:J

    add-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    iget-object v0, p0, Le2/a;->j:Le2/a$a;

    const/4 v1, 0x1

    iput-boolean v1, v0, Le2/a$a;->l:Z

    iget-object v0, p0, Le2/a;->n:Landroid/os/Handler;

    iget-object v1, p0, Le2/a;->j:Le2/a$a;

    iget-wide v2, p0, Le2/a;->m:J

    iget-wide v4, p0, Le2/a;->l:J

    add-long/2addr v2, v4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;J)Z

    return-void

    :cond_1
    iget-object v0, p0, Le2/a;->j:Le2/a$a;

    iget-object v1, p0, Le2/a;->i:Ljava/util/concurrent/Executor;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Le2/c;->c(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Le2/c;

    :cond_2
    return-void
.end method

.method public abstract B()Ljava/lang/Object;
.end method

.method public C(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method protected D()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Le2/a;->B()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public g(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 4

    invoke-super {p0, p1, p2, p3, p4}, Le2/b;->g(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    iget-object p2, p0, Le2/a;->j:Le2/a$a;

    const-string p4, " waiting="

    if-eqz p2, :cond_0

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "mTask="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, Le2/a;->j:Le2/a$a;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, Le2/a;->j:Le2/a$a;

    iget-boolean p2, p2, Le2/a$a;->l:Z

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Z)V

    :cond_0
    iget-object p2, p0, Le2/a;->k:Le2/a$a;

    if-eqz p2, :cond_1

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "mCancellingTask="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, Le2/a;->k:Le2/a$a;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, Le2/a;->k:Le2/a$a;

    iget-boolean p2, p2, Le2/a$a;->l:Z

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Z)V

    :cond_1
    iget-wide v0, p0, Le2/a;->l:J

    const-wide/16 v2, 0x0

    cmp-long p2, v0, v2

    if-eqz p2, :cond_2

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p1, "mUpdateThrottle="

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-wide p1, p0, Le2/a;->l:J

    invoke-static {p1, p2, p3}, LE1/j;->c(JLjava/io/PrintWriter;)V

    const-string p1, " mLastLoadCompleteTime="

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-wide p1, p0, Le2/a;->m:J

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1, p3}, LE1/j;->b(JJLjava/io/PrintWriter;)V

    invoke-virtual {p3}, Ljava/io/PrintWriter;->println()V

    :cond_2
    return-void
.end method

.method protected l()Z
    .locals 4

    iget-object v0, p0, Le2/a;->j:Le2/a$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    iget-boolean v0, p0, Le2/b;->d:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Le2/b;->g:Z

    :cond_0
    iget-object v0, p0, Le2/a;->k:Le2/a$a;

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Le2/a;->j:Le2/a$a;

    iget-boolean v0, v0, Le2/a$a;->l:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Le2/a;->j:Le2/a$a;

    iput-boolean v1, v0, Le2/a$a;->l:Z

    iget-object v0, p0, Le2/a;->n:Landroid/os/Handler;

    iget-object v3, p0, Le2/a;->j:Le2/a$a;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_1
    iput-object v2, p0, Le2/a;->j:Le2/a$a;

    return v1

    :cond_2
    iget-object v0, p0, Le2/a;->j:Le2/a$a;

    iget-boolean v0, v0, Le2/a$a;->l:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Le2/a;->j:Le2/a$a;

    iput-boolean v1, v0, Le2/a$a;->l:Z

    iget-object v0, p0, Le2/a;->n:Landroid/os/Handler;

    iget-object v3, p0, Le2/a;->j:Le2/a$a;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iput-object v2, p0, Le2/a;->j:Le2/a$a;

    return v1

    :cond_3
    iget-object v0, p0, Le2/a;->j:Le2/a$a;

    invoke-virtual {v0, v1}, Le2/c;->a(Z)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v1, p0, Le2/a;->j:Le2/a$a;

    iput-object v1, p0, Le2/a;->k:Le2/a$a;

    invoke-virtual {p0}, Le2/a;->x()V

    :cond_4
    iput-object v2, p0, Le2/a;->j:Le2/a$a;

    return v0

    :cond_5
    return v1
.end method

.method protected n()V
    .locals 1

    invoke-super {p0}, Le2/b;->n()V

    invoke-virtual {p0}, Le2/b;->b()Z

    new-instance v0, Le2/a$a;

    invoke-direct {v0, p0}, Le2/a$a;-><init>(Le2/a;)V

    iput-object v0, p0, Le2/a;->j:Le2/a$a;

    invoke-virtual {p0}, Le2/a;->A()V

    return-void
.end method

.method public x()V
    .locals 0

    return-void
.end method

.method y(Le2/a$a;Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p2}, Le2/a;->C(Ljava/lang/Object;)V

    iget-object p2, p0, Le2/a;->k:Le2/a$a;

    if-ne p2, p1, :cond_0

    invoke-virtual {p0}, Le2/b;->t()V

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Le2/a;->m:J

    const/4 p1, 0x0

    iput-object p1, p0, Le2/a;->k:Le2/a$a;

    invoke-virtual {p0}, Le2/b;->e()V

    invoke-virtual {p0}, Le2/a;->A()V

    :cond_0
    return-void
.end method

.method z(Le2/a$a;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Le2/a;->j:Le2/a$a;

    if-eq v0, p1, :cond_0

    invoke-virtual {p0, p1, p2}, Le2/a;->y(Le2/a$a;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Le2/b;->j()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0, p2}, Le2/a;->C(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Le2/b;->c()V

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Le2/a;->m:J

    const/4 p1, 0x0

    iput-object p1, p0, Le2/a;->j:Le2/a$a;

    invoke-virtual {p0, p2}, Le2/b;->f(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
