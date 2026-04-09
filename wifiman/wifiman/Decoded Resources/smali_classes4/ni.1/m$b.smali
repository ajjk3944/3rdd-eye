.class final Lni/m$b;
.super Lpi/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lni/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private final d:Loi/i;

.field final synthetic e:Lni/m;


# direct methods
.method public constructor <init>(Lni/m;)V
    .locals 2

    iput-object p1, p0, Lni/m$b;->e:Lni/m;

    invoke-virtual {p1}, Lni/m;->d1()Lli/p;

    move-result-object v0

    invoke-virtual {v0}, Lli/p;->h()Loi/n;

    move-result-object v0

    invoke-direct {p0, v0}, Lpi/b;-><init>(Loi/n;)V

    invoke-virtual {p1}, Lni/m;->d1()Lli/p;

    move-result-object v0

    invoke-virtual {v0}, Lli/p;->h()Loi/n;

    move-result-object v0

    new-instance v1, Lni/n;

    invoke-direct {v1, p1}, Lni/n;-><init>(Lni/m;)V

    invoke-interface {v0, v1}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p1

    iput-object p1, p0, Lni/m$b;->d:Loi/i;

    return-void
.end method

.method static synthetic J(Lni/m;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lni/m$b;->L(Lni/m;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final L(Lni/m;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, LBh/p0;->g(LBh/i;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic I()LBh/e;
    .locals 1

    invoke-virtual {p0}, Lni/m$b;->K()Lni/m;

    move-result-object v0

    return-object v0
.end method

.method public K()Lni/m;
    .locals 1

    iget-object v0, p0, Lni/m$b;->e:Lni/m;

    return-object v0
.end method

.method public bridge synthetic c()LBh/h;
    .locals 1

    invoke-virtual {p0}, Lni/m$b;->K()Lni/m;

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

    iget-object v0, p0, Lni/m$b;->d:Loi/i;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method protected r()Ljava/util/Collection;
    .locals 7

    iget-object v0, p0, Lni/m$b;->e:Lni/m;

    invoke-virtual {v0}, Lni/m;->e1()LUh/c;

    move-result-object v0

    iget-object v1, p0, Lni/m$b;->e:Lni/m;

    invoke-virtual {v1}, Lni/m;->d1()Lli/p;

    move-result-object v1

    invoke-virtual {v1}, Lli/p;->j()LWh/g;

    move-result-object v1

    invoke-static {v0, v1}, LWh/f;->o(LUh/c;LWh/g;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, p0, Lni/m$b;->e:Lni/m;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LUh/q;

    invoke-virtual {v1}, Lni/m;->d1()Lli/p;

    move-result-object v5

    invoke-virtual {v5}, Lli/p;->i()Lli/X;

    move-result-object v5

    invoke-virtual {v5, v4}, Lli/X;->u(LUh/q;)Lpi/S;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lni/m$b;->e:Lni/m;

    invoke-virtual {v0}, Lni/m;->d1()Lli/p;

    move-result-object v0

    invoke-virtual {v0}, Lli/p;->c()Lli/n;

    move-result-object v0

    invoke-virtual {v0}, Lli/n;->c()LCh/a;

    move-result-object v0

    iget-object v1, p0, Lni/m$b;->e:Lni/m;

    invoke-interface {v0, v1}, LCh/a;->c(LBh/e;)Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v2, v0}, LZg/v;->M0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpi/S;

    invoke-virtual {v4}, Lpi/S;->N0()Lpi/v0;

    move-result-object v4

    invoke-interface {v4}, Lpi/v0;->c()LBh/h;

    move-result-object v4

    instance-of v5, v4, LBh/L$b;

    if-eqz v5, :cond_2

    check-cast v4, LBh/L$b;

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    :goto_2
    if-eqz v4, :cond_1

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_7

    iget-object v2, p0, Lni/m$b;->e:Lni/m;

    invoke-virtual {v2}, Lni/m;->d1()Lli/p;

    move-result-object v2

    invoke-virtual {v2}, Lli/p;->c()Lli/n;

    move-result-object v2

    invoke-virtual {v2}, Lli/n;->j()Lli/w;

    move-result-object v2

    iget-object v4, p0, Lni/m$b;->e:Lni/m;

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v1, v3}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v5, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LBh/L$b;

    invoke-static {v3}, Lfi/e;->n(LBh/h;)LZh/b;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-virtual {v6}, LZh/b;->a()LZh/c;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-virtual {v6}, LZh/c;->b()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_5

    :cond_4
    invoke-virtual {v3}, LDh/a;->getName()LZh/f;

    move-result-object v3

    invoke-virtual {v3}, LZh/f;->b()Ljava/lang/String;

    move-result-object v6

    const-string v3, "asString(...)"

    invoke-static {v6, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_5
    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    invoke-interface {v2, v4, v5}, Lli/w;->b(LBh/e;Ljava/util/List;)V

    :cond_7
    invoke-static {v0}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lni/m$b;->e:Lni/m;

    invoke-virtual {v0}, LDh/a;->getName()LZh/f;

    move-result-object v0

    invoke-virtual {v0}, LZh/f;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method protected v()LBh/j0;
    .locals 1

    sget-object v0, LBh/j0$a;->a:LBh/j0$a;

    return-object v0
.end method
