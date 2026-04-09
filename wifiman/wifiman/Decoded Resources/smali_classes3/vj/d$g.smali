.class final Lvj/d$g;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvj/d;-><init>(Lvj/c;Ljava/util/List;ZZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lvj/d;

.field final synthetic b:Lvj/c;


# direct methods
.method constructor <init>(Lvj/d;Lvj/c;)V
    .locals 0

    iput-object p1, p0, Lvj/d$g;->a:Lvj/d;

    iput-object p2, p0, Lvj/d$g;->b:Lvj/c;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    new-instance v0, Lvj/i;

    iget-object v1, p0, Lvj/d$g;->a:Lvj/d;

    invoke-static {}, Lorg/kodein/di/d;->e()Lorg/kodein/di/f;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lvj/i;-><init>(Lorg/kodein/di/e;Lorg/kodein/di/f;)V

    iget-object v1, p0, Lvj/d$g;->b:Lvj/c;

    invoke-virtual {v1}, Lvj/c;->e()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lmh/l;

    invoke-interface {v2, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lvj/d$g;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
