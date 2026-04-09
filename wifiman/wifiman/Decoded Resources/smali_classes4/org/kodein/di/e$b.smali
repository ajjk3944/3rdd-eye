.class public abstract Lorg/kodein/di/e$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/kodein/di/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method public static synthetic a(Lorg/kodein/di/e;Lorg/kodein/di/DI$e;Ljava/lang/Object;IILjava/lang/Object;)Lmh/l;
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-interface {p0, p1, p2, p3}, Lorg/kodein/di/e;->b(Lorg/kodein/di/DI$e;Ljava/lang/Object;I)Lmh/l;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: factory"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(Lorg/kodein/di/e;Lorg/kodein/di/DI$e;Ljava/lang/Object;I)Lmh/a;
    .locals 6

    const-string p3, "key"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "context"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v5}, Lorg/kodein/di/e$b;->a(Lorg/kodein/di/e;Lorg/kodein/di/DI$e;Ljava/lang/Object;IILjava/lang/Object;)Lmh/l;

    move-result-object p0

    new-instance p1, Lorg/kodein/di/e$b$a;

    invoke-direct {p1, p0}, Lorg/kodein/di/e$b$a;-><init>(Lmh/l;)V

    return-object p1
.end method

.method public static synthetic c(Lorg/kodein/di/e;Lorg/kodein/di/DI$e;Ljava/lang/Object;IILjava/lang/Object;)Lmh/a;
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-interface {p0, p1, p2, p3}, Lorg/kodein/di/e;->a(Lorg/kodein/di/DI$e;Ljava/lang/Object;I)Lmh/a;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: provider"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
