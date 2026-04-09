.class final Lorg/kodein/di/DI$c$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/kodein/di/DI$c;->c(ZLmh/l;)Lorg/kodein/di/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lmh/l;


# direct methods
.method constructor <init>(ZLmh/l;)V
    .locals 0

    iput-boolean p1, p0, Lorg/kodein/di/DI$c$a;->a:Z

    iput-object p2, p0, Lorg/kodein/di/DI$c$a;->b:Lmh/l;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lorg/kodein/di/DI;
    .locals 3

    new-instance v0, Lvj/e;

    iget-boolean v1, p0, Lorg/kodein/di/DI$c$a;->a:Z

    iget-object v2, p0, Lorg/kodein/di/DI$c$a;->b:Lmh/l;

    invoke-direct {v0, v1, v2}, Lvj/e;-><init>(ZLmh/l;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lorg/kodein/di/DI$c$a;->a()Lorg/kodein/di/DI;

    move-result-object v0

    return-object v0
.end method
