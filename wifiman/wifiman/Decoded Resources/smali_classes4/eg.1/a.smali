.class public abstract Leg/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile a:Lkg/n;

.field private static volatile b:Lkg/n;


# direct methods
.method static a(Lkg/n;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    :try_start_0
    invoke-interface {p0, p1}, Lkg/n;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lig/a;->a(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method

.method static b(Lkg/n;Ljava/util/concurrent/Callable;)Lgg/y;
    .locals 0

    invoke-static {p0, p1}, Leg/a;->a(Lkg/n;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/y;

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "Scheduler Callable returned null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method static c(Ljava/util/concurrent/Callable;)Lgg/y;
    .locals 1

    :try_start_0
    invoke-interface {p0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/y;

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "Scheduler Callable returned null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lig/a;->a(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method

.method public static d(Ljava/util/concurrent/Callable;)Lgg/y;
    .locals 1

    if-eqz p0, :cond_1

    sget-object v0, Leg/a;->a:Lkg/n;

    if-nez v0, :cond_0

    invoke-static {p0}, Leg/a;->c(Ljava/util/concurrent/Callable;)Lgg/y;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {v0, p0}, Leg/a;->b(Lkg/n;Ljava/util/concurrent/Callable;)Lgg/y;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "scheduler == null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static e(Lgg/y;)Lgg/y;
    .locals 1

    if-eqz p0, :cond_1

    sget-object v0, Leg/a;->b:Lkg/n;

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    invoke-static {v0, p0}, Leg/a;->a(Lkg/n;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/y;

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "scheduler == null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
