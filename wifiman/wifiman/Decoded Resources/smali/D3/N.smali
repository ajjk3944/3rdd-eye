.class public abstract LD3/N;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:LD3/M;


# direct methods
.method public static declared-synchronized a(LD3/B;)LD3/F;
    .locals 3

    const-class v0, LD3/N;

    monitor-enter v0

    :try_start_0
    sget-object v1, LD3/N;->a:LD3/M;

    if-nez v1, :cond_0

    new-instance v1, LD3/M;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, LD3/M;-><init>(LD3/L;)V

    sput-object v1, LD3/N;->a:LD3/M;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, LD3/N;->a:LD3/M;

    invoke-virtual {v1, p0}, LA5/e;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LD3/F;
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

.method public static declared-synchronized b(Ljava/lang/String;)LD3/F;
    .locals 1

    const-class p0, LD3/N;

    monitor-enter p0

    :try_start_0
    const-string v0, "common"

    invoke-static {v0}, LD3/B;->d(Ljava/lang/String;)LD3/A;

    move-result-object v0

    invoke-virtual {v0}, LD3/A;->c()LD3/B;

    move-result-object v0

    invoke-static {v0}, LD3/N;->a(LD3/B;)LD3/F;

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
