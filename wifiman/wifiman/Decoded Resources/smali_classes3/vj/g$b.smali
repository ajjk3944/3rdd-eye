.class final Lvj/g$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvj/g;->g(Lrj/N5;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lorg/kodein/type/q;

.field final synthetic b:Lvj/g;


# direct methods
.method constructor <init>(Lorg/kodein/type/q;Lvj/g;)V
    .locals 0

    iput-object p1, p0, Lvj/g$b;->a:Lorg/kodein/type/q;

    iput-object p2, p0, Lvj/g$b;->b:Lvj/g;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LYg/y;)LYg/y;
    .locals 11

    const-string/jumbo v0, "triple"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/y;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvj/k$a;

    iget-object v1, p0, Lvj/g$b;->a:Lorg/kodein/type/q;

    invoke-virtual {v0, v1}, Lvj/k$a;->a(Lorg/kodein/type/q;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lvj/g$b;->b:Lvj/g;

    invoke-static {v1}, Lvj/g;->f(Lvj/g;)Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, p0, Lvj/g$b;->a:Lorg/kodein/type/q;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Luj/d;

    invoke-interface {v5}, Luj/d;->b()Lorg/kodein/type/q;

    move-result-object v6

    invoke-interface {v6, v2}, Lorg/kodein/type/q;->d(Lorg/kodein/type/q;)Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v5}, Luj/d;->c()Lorg/kodein/type/q;

    move-result-object v5

    invoke-virtual {v0, v5}, Lvj/k$a;->a(Lorg/kodein/type/q;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_0

    :cond_2
    move-object v3, v4

    :goto_0
    move-object v8, v3

    check-cast v8, Luj/d;

    if-eqz v8, :cond_3

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v5, p1

    invoke-static/range {v5 .. v10}, LYg/y;->h(LYg/y;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)LYg/y;

    move-result-object p1

    goto :goto_1

    :cond_3
    move-object p1, v4

    :goto_1
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/y;

    invoke-virtual {p0, p1}, Lvj/g$b;->a(LYg/y;)LYg/y;

    move-result-object p1

    return-object p1
.end method
