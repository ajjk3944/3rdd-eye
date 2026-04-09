.class final Lzh/b$b;
.super Lpi/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzh/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic d:Lzh/b;


# direct methods
.method public constructor <init>(Lzh/b;)V
    .locals 0

    iput-object p1, p0, Lzh/b$b;->d:Lzh/b;

    invoke-static {p1}, Lzh/b;->P0(Lzh/b;)Loi/n;

    move-result-object p1

    invoke-direct {p0, p1}, Lpi/b;-><init>(Loi/n;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic I()LBh/e;
    .locals 1

    invoke-virtual {p0}, Lzh/b$b;->J()Lzh/b;

    move-result-object v0

    return-object v0
.end method

.method public J()Lzh/b;
    .locals 1

    iget-object v0, p0, Lzh/b$b;->d:Lzh/b;

    return-object v0
.end method

.method public bridge synthetic c()LBh/h;
    .locals 1

    invoke-virtual {p0}, Lzh/b$b;->J()Lzh/b;

    move-result-object v0

    return-object v0
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getParameters()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lzh/b$b;->d:Lzh/b;

    invoke-static {v0}, Lzh/b;->O0(Lzh/b;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected r()Ljava/util/Collection;
    .locals 9

    iget-object v0, p0, Lzh/b$b;->d:Lzh/b;

    invoke-virtual {v0}, Lzh/b;->U0()Lzh/f;

    move-result-object v0

    sget-object v1, Lzh/f$a;->e:Lzh/f$a;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {}, Lzh/b;->M0()LZh/b;

    move-result-object v0

    invoke-static {v0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v2, Lzh/f$b;->e:Lzh/f$b;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {}, Lzh/b;->N0()LZh/b;

    move-result-object v0

    new-instance v2, LZh/b;

    sget-object v3, Lkotlin/reflect/jvm/internal/impl/builtins/o;->A:LZh/c;

    iget-object v4, p0, Lzh/b$b;->d:Lzh/b;

    invoke-virtual {v4}, Lzh/b;->Q0()I

    move-result v4

    invoke-virtual {v1, v4}, Lzh/f;->c(I)LZh/f;

    move-result-object v1

    invoke-direct {v2, v3, v1}, LZh/b;-><init>(LZh/c;LZh/f;)V

    filled-new-array {v0, v2}, [LZh/b;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_1
    sget-object v1, Lzh/f$d;->e:Lzh/f$d;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {}, Lzh/b;->M0()LZh/b;

    move-result-object v0

    invoke-static {v0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_2
    sget-object v2, Lzh/f$c;->e:Lzh/f$c;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, Lzh/b;->N0()LZh/b;

    move-result-object v0

    new-instance v2, LZh/b;

    sget-object v3, Lkotlin/reflect/jvm/internal/impl/builtins/o;->s:LZh/c;

    iget-object v4, p0, Lzh/b$b;->d:Lzh/b;

    invoke-virtual {v4}, Lzh/b;->Q0()I

    move-result v4

    invoke-virtual {v1, v4}, Lzh/f;->c(I)LZh/f;

    move-result-object v1

    invoke-direct {v2, v3, v1}, LZh/b;-><init>(LZh/c;LZh/f;)V

    filled-new-array {v0, v2}, [LZh/b;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    :goto_0
    iget-object v1, p0, Lzh/b$b;->d:Lzh/b;

    invoke-static {v1}, Lzh/b;->L0(Lzh/b;)LBh/M;

    move-result-object v1

    invoke-interface {v1}, LBh/M;->b()LBh/G;

    move-result-object v1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LZh/b;

    invoke-static {v1, v4}, LBh/y;->b(LBh/G;LZh/b;)LBh/e;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-virtual {p0}, Lzh/b$b;->getParameters()Ljava/util/List;

    move-result-object v4

    invoke-interface {v5}, LBh/h;->k()Lpi/v0;

    move-result-object v6

    invoke-interface {v6}, Lpi/v0;->getParameters()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    invoke-static {v4, v6}, LZg/v;->b1(Ljava/util/List;I)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v4, v3}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LBh/l0;

    new-instance v8, Lpi/D0;

    invoke-interface {v7}, LBh/h;->u()Lpi/d0;

    move-result-object v7

    invoke-direct {v8, v7}, Lpi/D0;-><init>(Lpi/S;)V

    invoke-interface {v6, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    sget-object v4, Lpi/r0;->b:Lpi/r0$a;

    invoke-virtual {v4}, Lpi/r0$a;->j()Lpi/r0;

    move-result-object v4

    invoke-static {v4, v5, v6}, Lpi/V;->h(Lpi/r0;LBh/e;Ljava/util/List;)Lpi/d0;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Built-in class "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " not found"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    invoke-static {v2}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0

    :cond_6
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v1, v0, v1}, Lyi/a;->b(Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    throw v1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lzh/b$b;->J()Lzh/b;

    move-result-object v0

    invoke-virtual {v0}, Lzh/b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected v()LBh/j0;
    .locals 1

    sget-object v0, LBh/j0$a;->a:LBh/j0$a;

    return-object v0
.end method
