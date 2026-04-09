.class public abstract Lsj/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Ljava/lang/Object;Landroid/content/Context;)Lorg/kodein/di/DI;
    .locals 0

    invoke-static {p0, p1}, Lsj/a;->b(Ljava/lang/Object;Landroid/content/Context;)Lorg/kodein/di/DI;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Ljava/lang/Object;Landroid/content/Context;)Lorg/kodein/di/DI;
    .locals 3

    move-object v0, p1

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-static {v0, p0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    instance-of v2, v0, Lorg/kodein/di/c;

    if-eqz v2, :cond_0

    check-cast v0, Lorg/kodein/di/c;

    invoke-interface {v0}, Lorg/kodein/di/c;->d()Lorg/kodein/di/DI;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v2, v0, Landroid/content/ContextWrapper;

    if-eqz v2, :cond_1

    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v1

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    instance-of p1, p0, Lorg/kodein/di/c;

    if-eqz p1, :cond_3

    move-object v1, p0

    check-cast v1, Lorg/kodein/di/c;

    :cond_3
    if-eqz v1, :cond_4

    invoke-interface {v1}, Lorg/kodein/di/c;->d()Lorg/kodein/di/DI;

    move-result-object p0

    return-object p0

    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Trying to find closest DI, but no DI container was found at all. Your Application should be DIAware."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final c()Lsj/c;
    .locals 1

    new-instance v0, Lsj/b;

    invoke-direct {v0}, Lsj/b;-><init>()V

    return-object v0
.end method

.method public static final d(Landroid/content/Context;)Lsj/d;
    .locals 2

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lsj/d;

    new-instance v1, Lsj/a$a;

    invoke-direct {v1, p0}, Lsj/a$a;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, v1}, Lsj/d;-><init>(Lmh/a;)V

    return-object v0
.end method
