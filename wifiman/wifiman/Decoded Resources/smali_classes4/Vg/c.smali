.class public abstract LVg/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field static f:I

.field static g:LUg/e;


# instance fields
.field a:I

.field b:Ljava/lang/String;

.field c:Ljava/lang/Thread;

.field d:Ljcifs/smb1/util/transport/TransportException;

.field protected e:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, LUg/e;->a()LUg/e;

    move-result-object v0

    sput-object v0, LVg/c;->g:LUg/e;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LVg/c;->a:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Transport"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v1, LVg/c;->f:I

    add-int/lit8 v2, v1, 0x1

    sput v2, LVg/c;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LVg/c;->b:Ljava/lang/String;

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p0, LVg/c;->e:Ljava/util/HashMap;

    return-void
.end method

.method private h()V
    .locals 4

    :goto_0
    iget-object v0, p0, LVg/c;->c:Ljava/lang/Thread;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_5

    const/4 v0, 0x1

    :try_start_0
    invoke-virtual {p0}, LVg/c;->j()LVg/a;

    move-result-object v1

    if-eqz v1, :cond_2

    monitor-enter p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v2, p0, LVg/c;->e:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LVg/b;

    if-nez v1, :cond_1

    sget v1, LUg/e;->b:I

    const/4 v2, 0x4

    if-lt v1, v2, :cond_0

    sget-object v1, LVg/c;->g:LUg/e;

    const-string v2, "Invalid key, skipping message"

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_3

    :cond_0
    :goto_1
    invoke-virtual {p0}, LVg/c;->g()V

    goto :goto_2

    :cond_1
    invoke-virtual {p0, v1}, LVg/c;->e(LVg/b;)V

    iput-boolean v0, v1, LVg/b;->b:Z

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    :goto_2
    monitor-exit p0

    goto :goto_0

    :goto_3
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v1

    :catch_0
    move-exception v1

    goto :goto_4

    :cond_2
    new-instance v1, Ljava/io/IOException;

    const-string v2, "end of stream"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :goto_4
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    const-string v3, "Read timed out"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_5

    :cond_3
    const/4 v0, 0x0

    :goto_5
    xor-int/lit8 v2, v0, 0x1

    if-nez v0, :cond_4

    sget v0, LUg/e;->b:I

    const/4 v3, 0x3

    if-lt v0, v3, :cond_4

    sget-object v0, LVg/c;->g:LUg/e;

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V

    :cond_4
    :try_start_3
    invoke-virtual {p0, v2}, LVg/c;->b(Z)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    sget-object v1, LVg/c;->g:LUg/e;

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V

    goto :goto_0

    :cond_5
    return-void
.end method

.method public static k(Ljava/io/InputStream;[BII)I
    .locals 3

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_1

    add-int v1, p2, v0

    sub-int v2, p3, v0

    invoke-virtual {p0, p1, v1, v2}, Ljava/io/InputStream;->read([BII)I

    move-result v1

    if-gtz v1, :cond_0

    goto :goto_1

    :cond_0
    add-int/2addr v0, v1

    goto :goto_0

    :cond_1
    :goto_1
    return v0
.end method


# virtual methods
.method public declared-synchronized a(J)V
    .locals 7

    monitor-enter p0

    const/4 v0, 0x4

    const/4 v1, 0x3

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :try_start_0
    iget v5, p0, LVg/c;->a:I

    if-eqz v5, :cond_4

    if-eq v5, v1, :cond_1

    if-eq v5, v0, :cond_0

    new-instance p1, Ljcifs/smb1/util/transport/TransportException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Invalid state: "

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v5, p0, LVg/c;->a:I

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljcifs/smb1/util/transport/TransportException;-><init>(Ljava/lang/String;)V

    iput v4, p0, LVg/c;->a:I

    throw p1

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :catch_0
    move-exception p1

    goto/16 :goto_2

    :cond_0
    iput v4, p0, LVg/c;->a:I

    new-instance p1, Ljcifs/smb1/util/transport/TransportException;

    const-string p2, "Connection in error"

    iget-object v5, p0, LVg/c;->d:Ljcifs/smb1/util/transport/TransportException;

    invoke-direct {p1, p2, v5}, Ljcifs/smb1/util/transport/TransportException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    if-eqz v5, :cond_3

    if-eq v5, v1, :cond_3

    if-eq v5, v0, :cond_3

    :try_start_1
    sget p1, LUg/e;->b:I

    if-lt p1, v2, :cond_2

    sget-object p1, LVg/c;->g:LUg/e;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid state: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, LVg/c;->a:I

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_0

    :catchall_1
    move-exception p1

    goto/16 :goto_4

    :cond_2
    :goto_0
    iput v4, p0, LVg/c;->a:I

    iput-object v3, p0, LVg/c;->c:Ljava/lang/Thread;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :cond_3
    monitor-exit p0

    return-void

    :cond_4
    :try_start_2
    iput v2, p0, LVg/c;->a:I

    iput-object v3, p0, LVg/c;->d:Ljcifs/smb1/util/transport/TransportException;

    new-instance v5, Ljava/lang/Thread;

    iget-object v6, p0, LVg/c;->b:Ljava/lang/String;

    invoke-direct {v5, p0, v6}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    iput-object v5, p0, LVg/c;->c:Ljava/lang/Thread;

    invoke-virtual {v5, v2}, Ljava/lang/Thread;->setDaemon(Z)V

    iget-object v5, p0, LVg/c;->c:Ljava/lang/Thread;

    monitor-enter v5
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget-object v6, p0, LVg/c;->c:Ljava/lang/Thread;

    invoke-virtual {v6}, Ljava/lang/Thread;->start()V

    iget-object v6, p0, LVg/c;->c:Ljava/lang/Thread;

    invoke-virtual {v6, p1, p2}, Ljava/lang/Object;->wait(J)V

    iget p1, p0, LVg/c;->a:I

    if-eq p1, v2, :cond_9

    const/4 p2, 0x2

    if-eq p1, p2, :cond_7

    monitor-exit v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-eqz p1, :cond_6

    if-eq p1, v1, :cond_6

    if-eq p1, v0, :cond_6

    :try_start_4
    sget p1, LUg/e;->b:I

    if-lt p1, v2, :cond_5

    sget-object p1, LVg/c;->g:LUg/e;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid state: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, LVg/c;->a:I

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_5
    iput v4, p0, LVg/c;->a:I

    iput-object v3, p0, LVg/c;->c:Ljava/lang/Thread;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :cond_6
    monitor-exit p0

    return-void

    :catchall_2
    move-exception p1

    goto :goto_1

    :cond_7
    :try_start_5
    iget-object p1, p0, LVg/c;->d:Ljcifs/smb1/util/transport/TransportException;

    if-nez p1, :cond_8

    iput v1, p0, LVg/c;->a:I

    monitor-exit v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    monitor-exit p0

    return-void

    :cond_8
    :try_start_6
    iput v0, p0, LVg/c;->a:I

    iput-object v3, p0, LVg/c;->c:Ljava/lang/Thread;

    throw p1

    :cond_9
    iput v4, p0, LVg/c;->a:I

    iput-object v3, p0, LVg/c;->c:Ljava/lang/Thread;

    new-instance p1, Ljcifs/smb1/util/transport/TransportException;

    const-string p2, "Connection timeout"

    invoke-direct {p1, p2}, Ljcifs/smb1/util/transport/TransportException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_1
    monitor-exit v5
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :try_start_7
    throw p1
    :try_end_7
    .catch Ljava/lang/InterruptedException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :goto_2
    :try_start_8
    iput v4, p0, LVg/c;->a:I

    iput-object v3, p0, LVg/c;->c:Ljava/lang/Thread;

    new-instance p2, Ljcifs/smb1/util/transport/TransportException;

    invoke-direct {p2, p1}, Ljcifs/smb1/util/transport/TransportException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :goto_3
    :try_start_9
    iget p2, p0, LVg/c;->a:I

    if-eqz p2, :cond_b

    if-eq p2, v1, :cond_b

    if-eq p2, v0, :cond_b

    sget p2, LUg/e;->b:I

    if-lt p2, v2, :cond_a

    sget-object p2, LVg/c;->g:LUg/e;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LVg/c;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_a
    iput v4, p0, LVg/c;->a:I

    iput-object v3, p0, LVg/c;->c:Ljava/lang/Thread;

    :cond_b
    throw p1

    :goto_4
    monitor-exit p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    throw p1
.end method

.method public declared-synchronized b(Z)V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget v0, p0, LVg/c;->a:I

    if-eqz v0, :cond_6

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 p1, 0x4

    if-eq v0, p1, :cond_4

    sget p1, LUg/e;->b:I

    if-lt p1, v3, :cond_0

    sget-object p1, LVg/c;->g:LUg/e;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LVg/c;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_0
    :goto_0
    iput-object v4, p0, LVg/c;->c:Ljava/lang/Thread;

    iput v2, p0, LVg/c;->a:I

    goto :goto_2

    :cond_1
    move p1, v3

    :cond_2
    iget-object v0, p0, LVg/c;->e:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_3

    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    :try_start_1
    invoke-virtual {p0, p1}, LVg/c;->d(Z)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_4
    move-object p1, v4

    goto :goto_1

    :catch_0
    move-exception p1

    :goto_1
    :try_start_2
    iput-object v4, p0, LVg/c;->c:Ljava/lang/Thread;

    iput v2, p0, LVg/c;->a:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v4, p1

    :goto_2
    if-nez v4, :cond_5

    monitor-exit p0

    return-void

    :cond_5
    :try_start_3
    throw v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_6
    monitor-exit p0

    return-void

    :goto_3
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method

.method protected abstract c()V
.end method

.method protected abstract d(Z)V
.end method

.method protected abstract e(LVg/b;)V
.end method

.method protected abstract f(LVg/a;)V
.end method

.method protected abstract g()V
.end method

.method protected abstract i(LVg/a;)V
.end method

.method protected abstract j()LVg/a;
.end method

.method public declared-synchronized l(LVg/a;LVg/b;J)V
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1}, LVg/c;->i(LVg/a;)V

    const/4 v0, 0x0

    iput-boolean v0, p2, LVg/b;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v0, p0, LVg/c;->e:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p1}, LVg/c;->f(LVg/a;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    add-long/2addr v0, p3

    iput-wide v0, p2, LVg/b;->a:J

    :goto_0
    iget-boolean v0, p2, LVg/b;->b:Z

    if-nez v0, :cond_1

    invoke-virtual {p0, p3, p4}, Ljava/lang/Object;->wait(J)V

    iget-wide p3, p2, LVg/b;->a:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr p3, v0

    const-wide/16 v0, 0x0

    cmp-long v0, p3, v0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p2, Ljcifs/smb1/util/transport/TransportException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p4, p0, LVg/c;->b:Ljava/lang/String;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, " timedout waiting for response to "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Ljcifs/smb1/util/transport/TransportException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p2

    goto :goto_4

    :catch_0
    move-exception p2

    goto :goto_1

    :catch_1
    move-exception p2

    goto :goto_2

    :cond_1
    :try_start_2
    iget-object p2, p0, LVg/c;->e:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit p0

    return-void

    :catchall_1
    move-exception p1

    goto :goto_5

    :goto_1
    :try_start_3
    new-instance p3, Ljcifs/smb1/util/transport/TransportException;

    invoke-direct {p3, p2}, Ljcifs/smb1/util/transport/TransportException;-><init>(Ljava/lang/Throwable;)V

    throw p3

    :goto_2
    sget p3, LUg/e;->b:I

    const/4 p4, 0x2

    if-le p3, p4, :cond_2

    sget-object p3, LVg/c;->g:LUg/e;

    invoke-virtual {p2, p3}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_2
    const/4 p3, 0x1

    :try_start_4
    invoke-virtual {p0, p3}, LVg/c;->b(Z)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_3

    :catch_2
    move-exception p3

    :try_start_5
    sget-object p4, LVg/c;->g:LUg/e;

    invoke-virtual {p3, p4}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V

    :goto_3
    throw p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_4
    :try_start_6
    iget-object p3, p0, LVg/c;->e:Ljava/util/HashMap;

    invoke-virtual {p3, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    throw p2

    :goto_5
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    throw p1
.end method

.method public run()V
    .locals 4

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    const/4 v1, 0x2

    :try_start_0
    invoke-virtual {p0}, LVg/c;->c()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-enter v0

    :try_start_1
    iget-object v2, p0, LVg/c;->c:Ljava/lang/Thread;

    if-eq v0, v2, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    iput v1, p0, LVg/c;->a:I

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-direct {p0}, LVg/c;->h()V

    return-void

    :goto_0
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1

    :catchall_1
    move-exception v2

    monitor-enter v0

    :try_start_3
    iget-object v3, p0, LVg/c;->c:Ljava/lang/Thread;

    if-eq v0, v3, :cond_1

    monitor-exit v0

    return-void

    :catchall_2
    move-exception v1

    goto :goto_1

    :cond_1
    iput v1, p0, LVg/c;->a:I

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw v2

    :goto_1
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw v1

    :catch_0
    move-exception v2

    monitor-enter v0

    :try_start_5
    iget-object v3, p0, LVg/c;->c:Ljava/lang/Thread;

    if-eq v0, v3, :cond_3

    sget v3, LUg/e;->b:I

    if-lt v3, v1, :cond_2

    sget-object v1, LVg/c;->g:LUg/e;

    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V

    goto :goto_2

    :catchall_3
    move-exception v1

    goto :goto_3

    :cond_2
    :goto_2
    monitor-exit v0

    return-void

    :cond_3
    new-instance v3, Ljcifs/smb1/util/transport/TransportException;

    invoke-direct {v3, v2}, Ljcifs/smb1/util/transport/TransportException;-><init>(Ljava/lang/Throwable;)V

    iput-object v3, p0, LVg/c;->d:Ljcifs/smb1/util/transport/TransportException;

    iput v1, p0, LVg/c;->a:I

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    monitor-exit v0

    return-void

    :goto_3
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    throw v1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LVg/c;->b:Ljava/lang/String;

    return-object v0
.end method
