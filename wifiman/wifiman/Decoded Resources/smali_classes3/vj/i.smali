.class public final Lvj/i;
.super Lvj/h;
.source "SourceFile"

# interfaces
.implements Lrj/m2;


# direct methods
.method public constructor <init>(Lorg/kodein/di/e;Lorg/kodein/di/f;)V
    .locals 1

    const-string/jumbo v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lvj/h;-><init>(Lorg/kodein/di/e;Lorg/kodein/di/f;)V

    return-void
.end method
