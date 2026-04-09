.class Lcom/google/gson/internal/bind/l$t;
.super Lcom/google/gson/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/gson/internal/bind/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/gson/p;-><init>()V

    return-void
.end method

.method private f(Lw5/a;Lw5/b;)Lcom/google/gson/g;
    .locals 2

    sget-object v0, Lcom/google/gson/internal/bind/l$B;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lw5/a;->r0()V

    sget-object p1, Lcom/google/gson/h;->a:Lcom/google/gson/h;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "Unexpected token: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p2, Lcom/google/gson/j;

    invoke-virtual {p1}, Lw5/a;->f0()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/google/gson/j;-><init>(Ljava/lang/Boolean;)V

    return-object p2

    :cond_2
    new-instance p2, Lcom/google/gson/j;

    invoke-virtual {p1}, Lw5/a;->t0()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/google/gson/j;-><init>(Ljava/lang/String;)V

    return-object p2

    :cond_3
    invoke-virtual {p1}, Lw5/a;->t0()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Lcom/google/gson/j;

    new-instance v0, Lt5/g;

    invoke-direct {v0, p1}, Lt5/g;-><init>(Ljava/lang/String;)V

    invoke-direct {p2, v0}, Lcom/google/gson/j;-><init>(Ljava/lang/Number;)V

    return-object p2
.end method

.method private g(Lw5/a;Lw5/b;)Lcom/google/gson/g;
    .locals 1

    sget-object v0, Lcom/google/gson/internal/bind/l$B;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x4

    if-eq p2, v0, :cond_1

    const/4 v0, 0x5

    if-eq p2, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lw5/a;->h()V

    new-instance p1, Lcom/google/gson/i;

    invoke-direct {p1}, Lcom/google/gson/i;-><init>()V

    return-object p1

    :cond_1
    invoke-virtual {p1}, Lw5/a;->g()V

    new-instance p1, Lcom/google/gson/f;

    invoke-direct {p1}, Lcom/google/gson/f;-><init>()V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic b(Lw5/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/gson/internal/bind/l$t;->e(Lw5/a;)Lcom/google/gson/g;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Lw5/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/google/gson/g;

    invoke-virtual {p0, p1, p2}, Lcom/google/gson/internal/bind/l$t;->h(Lw5/c;Lcom/google/gson/g;)V

    return-void
.end method

.method public e(Lw5/a;)Lcom/google/gson/g;
    .locals 6

    invoke-virtual {p1}, Lw5/a;->v0()Lw5/b;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/google/gson/internal/bind/l$t;->g(Lw5/a;Lw5/b;)Lcom/google/gson/g;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-direct {p0, p1, v0}, Lcom/google/gson/internal/bind/l$t;->f(Lw5/a;Lw5/b;)Lcom/google/gson/g;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    :cond_1
    :goto_0
    invoke-virtual {p1}, Lw5/a;->T()Z

    move-result v2

    if-eqz v2, :cond_6

    instance-of v2, v1, Lcom/google/gson/i;

    if-eqz v2, :cond_2

    invoke-virtual {p1}, Lw5/a;->p0()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    invoke-virtual {p1}, Lw5/a;->v0()Lw5/b;

    move-result-object v3

    invoke-direct {p0, p1, v3}, Lcom/google/gson/internal/bind/l$t;->g(Lw5/a;Lw5/b;)Lcom/google/gson/g;

    move-result-object v4

    if-eqz v4, :cond_3

    const/4 v5, 0x1

    goto :goto_2

    :cond_3
    const/4 v5, 0x0

    :goto_2
    if-nez v4, :cond_4

    invoke-direct {p0, p1, v3}, Lcom/google/gson/internal/bind/l$t;->f(Lw5/a;Lw5/b;)Lcom/google/gson/g;

    move-result-object v4

    :cond_4
    instance-of v3, v1, Lcom/google/gson/f;

    if-eqz v3, :cond_5

    move-object v2, v1

    check-cast v2, Lcom/google/gson/f;

    invoke-virtual {v2, v4}, Lcom/google/gson/f;->m(Lcom/google/gson/g;)V

    goto :goto_3

    :cond_5
    move-object v3, v1

    check-cast v3, Lcom/google/gson/i;

    invoke-virtual {v3, v2, v4}, Lcom/google/gson/i;->m(Ljava/lang/String;Lcom/google/gson/g;)V

    :goto_3
    if-eqz v5, :cond_1

    invoke-interface {v0, v1}, Ljava/util/Deque;->addLast(Ljava/lang/Object;)V

    move-object v1, v4

    goto :goto_0

    :cond_6
    instance-of v2, v1, Lcom/google/gson/f;

    if-eqz v2, :cond_7

    invoke-virtual {p1}, Lw5/a;->v()V

    goto :goto_4

    :cond_7
    invoke-virtual {p1}, Lw5/a;->y()V

    :goto_4
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_8

    return-object v1

    :cond_8
    invoke-interface {v0}, Ljava/util/Deque;->removeLast()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/gson/g;

    goto :goto_0
.end method

.method public h(Lw5/c;Lcom/google/gson/g;)V
    .locals 2

    if-eqz p2, :cond_8

    invoke-virtual {p2}, Lcom/google/gson/g;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p2}, Lcom/google/gson/g;->k()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p2}, Lcom/google/gson/g;->f()Lcom/google/gson/j;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/gson/j;->y()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lcom/google/gson/j;->u()Ljava/lang/Number;

    move-result-object p2

    invoke-virtual {p1, p2}, Lw5/c;->w0(Ljava/lang/Number;)Lw5/c;

    goto/16 :goto_3

    :cond_1
    invoke-virtual {p2}, Lcom/google/gson/j;->w()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Lcom/google/gson/j;->q()Z

    move-result p2

    invoke-virtual {p1, p2}, Lw5/c;->y0(Z)Lw5/c;

    goto/16 :goto_3

    :cond_2
    invoke-virtual {p2}, Lcom/google/gson/j;->v()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lw5/c;->x0(Ljava/lang/String;)Lw5/c;

    goto/16 :goto_3

    :cond_3
    invoke-virtual {p2}, Lcom/google/gson/g;->g()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lw5/c;->h()Lw5/c;

    invoke-virtual {p2}, Lcom/google/gson/g;->b()Lcom/google/gson/f;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/gson/f;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/gson/g;

    invoke-virtual {p0, p1, v0}, Lcom/google/gson/internal/bind/l$t;->h(Lw5/c;Lcom/google/gson/g;)V

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Lw5/c;->s()Lw5/c;

    goto :goto_3

    :cond_5
    invoke-virtual {p2}, Lcom/google/gson/g;->j()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Lw5/c;->j()Lw5/c;

    invoke-virtual {p2}, Lcom/google/gson/g;->e()Lcom/google/gson/i;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/gson/i;->o()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Lw5/c;->T(Ljava/lang/String;)Lw5/c;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/gson/g;

    invoke-virtual {p0, p1, v0}, Lcom/google/gson/internal/bind/l$t;->h(Lw5/c;Lcom/google/gson/g;)V

    goto :goto_1

    :cond_6
    invoke-virtual {p1}, Lw5/c;->v()Lw5/c;

    goto :goto_3

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Couldn\'t write "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    :goto_2
    invoke-virtual {p1}, Lw5/c;->b0()Lw5/c;

    :goto_3
    return-void
.end method
