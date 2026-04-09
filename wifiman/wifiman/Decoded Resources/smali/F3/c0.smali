.class public abstract LF3/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:LF3/b0;


# direct methods
.method public static declared-synchronized a(LF3/O;)LF3/T;
    .locals 3

    const-class v0, LF3/c0;

    monitor-enter v0

    :try_start_0
    sget-object v1, LF3/c0;->a:LF3/b0;

    if-nez v1, :cond_0

    new-instance v1, LF3/b0;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, LF3/b0;-><init>(LF3/a0;)V

    sput-object v1, LF3/c0;->a:LF3/b0;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, LF3/c0;->a:LF3/b0;

    invoke-virtual {v1, p0}, LA5/e;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LF3/T;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static declared-synchronized b(Ljava/lang/String;)LF3/T;
    .locals 1

    const-class p0, LF3/c0;

    monitor-enter p0

    :try_start_0
    const-string v0, "object-detection"

    invoke-static {v0}, LF3/O;->d(Ljava/lang/String;)LF3/N;

    move-result-object v0

    invoke-virtual {v0}, LF3/N;->c()LF3/O;

    move-result-object v0

    invoke-static {v0}, LF3/c0;->a(LF3/O;)LF3/T;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
