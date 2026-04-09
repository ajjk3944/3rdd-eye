.class public final Lej/v$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lej/D;


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

    iput-object p1, p0, Lej/v$b;->b:Lej/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lej/E;

    invoke-direct {p1}, Lej/E;-><init>()V

    iput-object p1, p0, Lej/v$b;->a:Lej/E;

    return-void
.end method


# virtual methods
.method public U(Lej/e;J)J
    .locals 8

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lej/v$b;->b:Lej/v;

    invoke-virtual {v0}, Lej/v;->e()Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    iget-object v1, p0, Lej/v$b;->b:Lej/v;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    invoke-virtual {v1}, Lej/v;->h()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {v1}, Lej/v;->b()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v3, "canceled"

    if-nez v2, :cond_3

    :goto_0
    :try_start_1
    invoke-virtual {v1}, Lej/v;->a()Lej/e;

    move-result-object v2

    invoke-virtual {v2}, Lej/e;->D0()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v2, v4, v6

    if-nez v2, :cond_2

    invoke-virtual {v1}, Lej/v;->g()Z

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const-wide/16 p1, -0x1

    return-wide p1

    :cond_0
    :try_start_2
    iget-object v2, p0, Lej/v$b;->a:Lej/E;

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

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Lej/v;->a()Lej/e;

    move-result-object v2

    invoke-virtual {v2, p1, p2, p3}, Lej/e;->U(Lej/e;J)J

    move-result-wide p1

    invoke-virtual {v1}, Lej/v;->c()Ljava/util/concurrent/locks/Condition;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/concurrent/locks/Condition;->signalAll()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-wide p1

    :cond_3
    :try_start_3
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    const-string p1, "closed"

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_1
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public c()Lej/E;
    .locals 1

    iget-object v0, p0, Lej/v$b;->a:Lej/E;

    return-object v0
.end method

.method public close()V
    .locals 3

    iget-object v0, p0, Lej/v$b;->b:Lej/v;

    invoke-virtual {v0}, Lej/v;->e()Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    iget-object v1, p0, Lej/v$b;->b:Lej/v;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    const/4 v2, 0x1

    :try_start_0
    invoke-virtual {v1, v2}, Lej/v;->j(Z)V

    invoke-virtual {v1}, Lej/v;->c()Ljava/util/concurrent/locks/Condition;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Condition;->signalAll()V

    sget-object v1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1
.end method
