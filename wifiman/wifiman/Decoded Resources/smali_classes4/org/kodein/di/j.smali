.class public final Lorg/kodein/di/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/kodein/di/DI;


# instance fields
.field private final a:LYg/m;


# direct methods
.method public constructor <init>(Lmh/a;)V
    .locals 1

    const-string v0, "f"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lorg/kodein/di/j;->a:LYg/m;

    return-void
.end method


# virtual methods
.method public I()Lorg/kodein/di/f;
    .locals 1

    invoke-static {p0}, Lorg/kodein/di/DI$d;->b(Lorg/kodein/di/DI;)Lorg/kodein/di/f;

    move-result-object v0

    return-object v0
.end method

.method public final a()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, Lorg/kodein/di/j;->a:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/kodein/di/DI;

    return-object v0
.end method

.method public d()Lorg/kodein/di/DI;
    .locals 1

    invoke-static {p0}, Lorg/kodein/di/DI$d;->a(Lorg/kodein/di/DI;)Lorg/kodein/di/DI;

    move-result-object v0

    return-object v0
.end method

.method public i()Lrj/l2;
    .locals 1

    invoke-static {p0}, Lorg/kodein/di/DI$d;->c(Lorg/kodein/di/DI;)Lrj/l2;

    const/4 v0, 0x0

    return-object v0
.end method

.method public y()Lorg/kodein/di/e;
    .locals 1

    invoke-virtual {p0}, Lorg/kodein/di/j;->a()Lorg/kodein/di/DI;

    move-result-object v0

    invoke-interface {v0}, Lorg/kodein/di/DI;->y()Lorg/kodein/di/e;

    move-result-object v0

    return-object v0
.end method
