.class public final Lej/v$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lej/B;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lej/v;-><init>(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:Lej/E;

.field final synthetic b:Lej/v;


# direct methods
.method constructor <init>(Lej/v;)V
    .locals 0

    iput-object p1, p0, Lej/v$a;->b:Lej/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lej/E;

    invoke-direct {p1}, Lej/E;-><init>()V

    iput-object p1, p0, Lej/v$a;->a:Lej/E;

    return-void
.end method


# virtual methods
.method public Z(Lej/e;J)V
    .locals 12

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lej/v$a;->b:Lej/v;

    invoke-virtual {v0}, Lej/v;->e()Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    iget-object v1, p0, Lej/v$a;->b:Lej/v;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    invoke-virtual {v1}, Lej/v;->g()Z

    move-result v2

    if-nez v2, :cond_c

    invoke-virtual {v1}, Lej/v;->b()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v3, "canceled"

    if-nez v2, :cond_b

    :goto_0
    const-wide/16 v4, 0x0

    cmp-long v2, p2, v4

    if-lez v2, :cond_4

    :try_start_1
    invoke-virtual {v1}, Lej/v;->d()Lej/B;

    move-result-object v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Lej/v;->h()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-virtual {v1}, Lej/v;->f()J

    move-result-wide v6

    invoke-virtual {v1}, Lej/v;->a()Lej/e;

    move-result-object v2

    invoke-virtual {v2}, Lej/e;->D0()J

    move-result-wide v8

    sub-long/2addr v6, v8

    cmp-long v2, v6, v4

    if-nez v2, :cond_2

    iget-object v2, p0, Lej/v$a;->a:Lej/E;

    invoke-virtual {v1}, Lej/v;->c()Ljava/util/concurrent/locks/Condition;

    move-result-object v4

    invoke-virtual {v2, v4}, Lej/E;->a(Ljava/util/concurrent/locks/Condition;)V

    invoke-virtual {v1}, Lej/v;->b()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :cond_2
    invoke-static {v6, v7, p2, p3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    invoke-virtual {v1}, Lej/v;->a()Lej/e;

    move-result-object v2

    invoke-virtual {v2, p1, v4, v5}, Lej/e;->Z(Lej/e;J)V

    sub-long/2addr p2, v4

    invoke-virtual {v1}, Lej/v;->c()Ljava/util/concurrent/locks/Condition;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/concurrent/locks/Condition;->signalAll()V

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "source is closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    const/4 v2, 0x0

    :goto_1
    sget-object v1, LYg/J;->a:LYg/J;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    if-eqz v2, :cond_a

    iget-object v0, p0, Lej/v$a;->b:Lej/v;

    invoke-interface {v2}, Lej/B;->c()Lej/E;

    move-result-object v1

    invoke-virtual {v0}, Lej/v;->k()Lej/B;

    move-result-object v0

    invoke-interface {v0}, Lej/B;->c()Lej/E;

    move-result-object v0

    invoke-virtual {v1}, Lej/E;->i()J

    move-result-wide v3

    sget-object v5, Lej/E;->e:Lej/E$b;

    invoke-virtual {v0}, Lej/E;->i()J

    move-result-wide v6

    invoke-virtual {v1}, Lej/E;->i()J

    move-result-wide v8

    invoke-virtual {v5, v6, v7, v8, v9}, Lej/E$b;->a(JJ)J

    move-result-wide v5

    sget-object v7, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v5, v6, v7}, Lej/E;->h(JLjava/util/concurrent/TimeUnit;)Lej/E;

    invoke-virtual {v1}, Lej/E;->f()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-virtual {v1}, Lej/E;->d()J

    move-result-wide v5

    invoke-virtual {v0}, Lej/E;->f()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-virtual {v1}, Lej/E;->d()J

    move-result-wide v8

    invoke-virtual {v0}, Lej/E;->d()J

    move-result-wide v10

    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v8

    invoke-virtual {v1, v8, v9}, Lej/E;->e(J)Lej/E;

    :cond_5
    :try_start_2
    invoke-interface {v2, p1, p2, p3}, Lej/B;->Z(Lej/e;J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-virtual {v1, v3, v4, v7}, Lej/E;->h(JLjava/util/concurrent/TimeUnit;)Lej/E;

    invoke-virtual {v0}, Lej/E;->f()Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-virtual {v1, v5, v6}, Lej/E;->e(J)Lej/E;

    goto :goto_2

    :catchall_1
    move-exception p1

    sget-object p2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v3, v4, p2}, Lej/E;->h(JLjava/util/concurrent/TimeUnit;)Lej/E;

    invoke-virtual {v0}, Lej/E;->f()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-virtual {v1, v5, v6}, Lej/E;->e(J)Lej/E;

    :cond_6
    throw p1

    :cond_7
    invoke-virtual {v0}, Lej/E;->f()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-virtual {v0}, Lej/E;->d()J

    move-result-wide v5

    invoke-virtual {v1, v5, v6}, Lej/E;->e(J)Lej/E;

    :cond_8
    :try_start_3
    invoke-interface {v2, p1, p2, p3}, Lej/B;->Z(Lej/e;J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    invoke-virtual {v1, v3, v4, v7}, Lej/E;->h(JLjava/util/concurrent/TimeUnit;)Lej/E;

    invoke-virtual {v0}, Lej/E;->f()Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-virtual {v1}, Lej/E;->b()Lej/E;

    goto :goto_2

    :catchall_2
    move-exception p1

    sget-object p2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v3, v4, p2}, Lej/E;->h(JLjava/util/concurrent/TimeUnit;)Lej/E;

    invoke-virtual {v0}, Lej/E;->f()Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-virtual {v1}, Lej/E;->b()Lej/E;

    :cond_9
    throw p1

    :cond_a
    :goto_2
    return-void

    :cond_b
    :try_start_4
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    const-string p1, "closed"

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_3
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public c()Lej/E;
    .locals 1

    iget-object v0, p0, Lej/v$a;->a:Lej/E;

    return-object v0
.end method

.method public close()V
    .locals 12

    iget-object v0, p0, Lej/v$a;->b:Lej/v;

    invoke-virtual {v0}, Lej/v;->e()Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    iget-object v1, p0, Lej/v$a;->b:Lej/v;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    invoke-virtual {v1}, Lej/v;->g()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :cond_0
    :try_start_1
    invoke-virtual {v1}, Lej/v;->d()Lej/B;

    move-result-object v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lej/v;->h()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v1}, Lej/v;->a()Lej/e;

    move-result-object v2

    invoke-virtual {v2}, Lej/e;->D0()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-gtz v2, :cond_2

    goto :goto_0

    :cond_2
    new-instance v1, Ljava/io/IOException;

    const-string v2, "source is closed"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    goto/16 :goto_3

    :cond_3
    :goto_0
    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lej/v;->i(Z)V

    invoke-virtual {v1}, Lej/v;->c()Ljava/util/concurrent/locks/Condition;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Condition;->signalAll()V

    const/4 v2, 0x0

    :goto_1
    sget-object v1, LYg/J;->a:LYg/J;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    if-eqz v2, :cond_9

    iget-object v0, p0, Lej/v$a;->b:Lej/v;

    invoke-interface {v2}, Lej/B;->c()Lej/E;

    move-result-object v1

    invoke-virtual {v0}, Lej/v;->k()Lej/B;

    move-result-object v0

    invoke-interface {v0}, Lej/B;->c()Lej/E;

    move-result-object v0

    invoke-virtual {v1}, Lej/E;->i()J

    move-result-wide v3

    sget-object v5, Lej/E;->e:Lej/E$b;

    invoke-virtual {v0}, Lej/E;->i()J

    move-result-wide v6

    invoke-virtual {v1}, Lej/E;->i()J

    move-result-wide v8

    invoke-virtual {v5, v6, v7, v8, v9}, Lej/E$b;->a(JJ)J

    move-result-wide v5

    sget-object v7, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v5, v6, v7}, Lej/E;->h(JLjava/util/concurrent/TimeUnit;)Lej/E;

    invoke-virtual {v1}, Lej/E;->f()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-virtual {v1}, Lej/E;->d()J

    move-result-wide v5

    invoke-virtual {v0}, Lej/E;->f()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-virtual {v1}, Lej/E;->d()J

    move-result-wide v8

    invoke-virtual {v0}, Lej/E;->d()J

    move-result-wide v10

    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v8

    invoke-virtual {v1, v8, v9}, Lej/E;->e(J)Lej/E;

    :cond_4
    :try_start_2
    invoke-interface {v2}, Lej/B;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-virtual {v1, v3, v4, v7}, Lej/E;->h(JLjava/util/concurrent/TimeUnit;)Lej/E;

    invoke-virtual {v0}, Lej/E;->f()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {v1, v5, v6}, Lej/E;->e(J)Lej/E;

    goto :goto_2

    :catchall_1
    move-exception v2

    sget-object v7, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v3, v4, v7}, Lej/E;->h(JLjava/util/concurrent/TimeUnit;)Lej/E;

    invoke-virtual {v0}, Lej/E;->f()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v1, v5, v6}, Lej/E;->e(J)Lej/E;

    :cond_5
    throw v2

    :cond_6
    invoke-virtual {v0}, Lej/E;->f()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-virtual {v0}, Lej/E;->d()J

    move-result-wide v5

    invoke-virtual {v1, v5, v6}, Lej/E;->e(J)Lej/E;

    :cond_7
    :try_start_3
    invoke-interface {v2}, Lej/B;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    invoke-virtual {v1, v3, v4, v7}, Lej/E;->h(JLjava/util/concurrent/TimeUnit;)Lej/E;

    invoke-virtual {v0}, Lej/E;->f()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {v1}, Lej/E;->b()Lej/E;

    goto :goto_2

    :catchall_2
    move-exception v2

    sget-object v5, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v3, v4, v5}, Lej/E;->h(JLjava/util/concurrent/TimeUnit;)Lej/E;

    invoke-virtual {v0}, Lej/E;->f()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {v1}, Lej/E;->b()Lej/E;

    :cond_8
    throw v2

    :cond_9
    :goto_2
    return-void

    :goto_3
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1
.end method

.method public flush()V
    .locals 12

    iget-object v0, p0, Lej/v$a;->b:Lej/v;

    invoke-virtual {v0}, Lej/v;->e()Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    iget-object v1, p0, Lej/v$a;->b:Lej/v;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    invoke-virtual {v1}, Lej/v;->g()Z

    move-result v2

    if-nez v2, :cond_a

    invoke-virtual {v1}, Lej/v;->b()Z

    move-result v2

    if-nez v2, :cond_9

    invoke-virtual {v1}, Lej/v;->d()Lej/B;

    move-result-object v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Lej/v;->h()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Lej/v;->a()Lej/e;

    move-result-object v1

    invoke-virtual {v1}, Lej/e;->D0()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-gtz v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/io/IOException;

    const-string v2, "source is closed"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    goto/16 :goto_3

    :cond_2
    :goto_0
    const/4 v2, 0x0

    :goto_1
    sget-object v1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    if-eqz v2, :cond_8

    iget-object v0, p0, Lej/v$a;->b:Lej/v;

    invoke-interface {v2}, Lej/B;->c()Lej/E;

    move-result-object v1

    invoke-virtual {v0}, Lej/v;->k()Lej/B;

    move-result-object v0

    invoke-interface {v0}, Lej/B;->c()Lej/E;

    move-result-object v0

    invoke-virtual {v1}, Lej/E;->i()J

    move-result-wide v3

    sget-object v5, Lej/E;->e:Lej/E$b;

    invoke-virtual {v0}, Lej/E;->i()J

    move-result-wide v6

    invoke-virtual {v1}, Lej/E;->i()J

    move-result-wide v8

    invoke-virtual {v5, v6, v7, v8, v9}, Lej/E$b;->a(JJ)J

    move-result-wide v5

    sget-object v7, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v5, v6, v7}, Lej/E;->h(JLjava/util/concurrent/TimeUnit;)Lej/E;

    invoke-virtual {v1}, Lej/E;->f()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {v1}, Lej/E;->d()J

    move-result-wide v5

    invoke-virtual {v0}, Lej/E;->f()Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-virtual {v1}, Lej/E;->d()J

    move-result-wide v8

    invoke-virtual {v0}, Lej/E;->d()J

    move-result-wide v10

    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v8

    invoke-virtual {v1, v8, v9}, Lej/E;->e(J)Lej/E;

    :cond_3
    :try_start_1
    invoke-interface {v2}, Lej/B;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-virtual {v1, v3, v4, v7}, Lej/E;->h(JLjava/util/concurrent/TimeUnit;)Lej/E;

    invoke-virtual {v0}, Lej/E;->f()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {v1, v5, v6}, Lej/E;->e(J)Lej/E;

    goto :goto_2

    :catchall_1
    move-exception v2

    sget-object v7, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v3, v4, v7}, Lej/E;->h(JLjava/util/concurrent/TimeUnit;)Lej/E;

    invoke-virtual {v0}, Lej/E;->f()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v1, v5, v6}, Lej/E;->e(J)Lej/E;

    :cond_4
    throw v2

    :cond_5
    invoke-virtual {v0}, Lej/E;->f()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-virtual {v0}, Lej/E;->d()J

    move-result-wide v5

    invoke-virtual {v1, v5, v6}, Lej/E;->e(J)Lej/E;

    :cond_6
    :try_start_2
    invoke-interface {v2}, Lej/B;->flush()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-virtual {v1, v3, v4, v7}, Lej/E;->h(JLjava/util/concurrent/TimeUnit;)Lej/E;

    invoke-virtual {v0}, Lej/E;->f()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {v1}, Lej/E;->b()Lej/E;

    goto :goto_2

    :catchall_2
    move-exception v2

    sget-object v5, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v3, v4, v5}, Lej/E;->h(JLjava/util/concurrent/TimeUnit;)Lej/E;

    invoke-virtual {v0}, Lej/E;->f()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v1}, Lej/E;->b()Lej/E;

    :cond_7
    throw v2

    :cond_8
    :goto_2
    return-void

    :cond_9
    :try_start_3
    new-instance v1, Ljava/io/IOException;

    const-string v2, "canceled"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_a
    const-string v1, "closed"

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_3
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1
.end method
