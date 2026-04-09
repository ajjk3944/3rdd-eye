.class public abstract Lrj/o2$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrj/o2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Lrj/o2;)Lorg/kodein/di/DI;
    .locals 0

    invoke-interface {p0}, Lrj/o2;->f()Lorg/kodein/di/DI;

    move-result-object p0

    return-object p0
.end method
