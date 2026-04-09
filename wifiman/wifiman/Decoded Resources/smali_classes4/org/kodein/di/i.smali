.class final Lorg/kodein/di/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/kodein/di/DI;


# instance fields
.field private final a:Lorg/kodein/di/DI;

.field private final b:Lorg/kodein/di/f;


# direct methods
.method public constructor <init>(Lorg/kodein/di/DI;Lorg/kodein/di/f;Lrj/l2;)V
    .locals 0

    const-string p3, "_base"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "diContext"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lorg/kodein/di/i;->a:Lorg/kodein/di/DI;

    .line 3
    iput-object p2, p0, Lorg/kodein/di/i;->b:Lorg/kodein/di/f;

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/c;Lorg/kodein/di/f;Lrj/l2;)V
    .locals 1

    const-string v0, "base"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "diContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-interface {p1}, Lorg/kodein/di/c;->d()Lorg/kodein/di/DI;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Lorg/kodein/di/i;-><init>(Lorg/kodein/di/DI;Lorg/kodein/di/f;Lrj/l2;)V

    return-void
.end method


# virtual methods
.method public I()Lorg/kodein/di/f;
    .locals 1

    iget-object v0, p0, Lorg/kodein/di/i;->b:Lorg/kodein/di/f;

    return-object v0
.end method

.method public d()Lorg/kodein/di/DI;
    .locals 0

    return-object p0
.end method

.method public i()Lrj/l2;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public y()Lorg/kodein/di/e;
    .locals 1

    iget-object v0, p0, Lorg/kodein/di/i;->a:Lorg/kodein/di/DI;

    invoke-interface {v0}, Lorg/kodein/di/DI;->y()Lorg/kodein/di/e;

    move-result-object v0

    return-object v0
.end method
