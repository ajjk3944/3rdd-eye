.class public abstract Lorg/kodein/di/DI$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/kodein/di/DI;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# direct methods
.method public static a(Lorg/kodein/di/DI;)Lorg/kodein/di/DI;
    .locals 0

    return-object p0
.end method

.method public static b(Lorg/kodein/di/DI;)Lorg/kodein/di/f;
    .locals 0

    invoke-static {p0}, Lorg/kodein/di/c$a;->a(Lorg/kodein/di/c;)Lorg/kodein/di/f;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lorg/kodein/di/DI;)Lrj/l2;
    .locals 0

    invoke-static {p0}, Lorg/kodein/di/c$a;->b(Lorg/kodein/di/c;)Lrj/l2;

    const/4 p0, 0x0

    return-object p0
.end method
