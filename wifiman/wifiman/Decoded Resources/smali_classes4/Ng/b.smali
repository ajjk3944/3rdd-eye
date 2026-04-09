.class public LNg/b;
.super LNg/a;
.source "SourceFile"


# instance fields
.field private final d:LLg/q;


# direct methods
.method public constructor <init>(LLg/l;LLg/q;)V
    .locals 4

    invoke-direct {p0, p1}, LNg/a;-><init>(LLg/l;)V

    iput-object p2, p0, LNg/b;->d:LLg/q;

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object p1

    invoke-virtual {p2, p1}, LLg/q;->j0(LLg/l;)V

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object p1

    invoke-virtual {p2}, LLg/q;->u()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljavax/jmdns/impl/constants/e;->TYPE_ANY:Ljavax/jmdns/impl/constants/e;

    sget-object v2, Ljavax/jmdns/impl/constants/d;->CLASS_IN:Ljavax/jmdns/impl/constants/d;

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, LLg/g;->D(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;Z)LLg/g;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, LLg/l;->s0(LLg/d;LLg/g;)V

    return-void
.end method


# virtual methods
.method public cancel()Z
    .locals 3

    invoke-super {p0}, Ljava/util/TimerTask;->cancel()Z

    move-result v0

    iget-object v1, p0, LNg/b;->d:LLg/q;

    invoke-virtual {v1}, LLg/q;->F()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v1

    iget-object v2, p0, LNg/b;->d:LLg/q;

    invoke-virtual {v1, v2}, LLg/l;->g1(LLg/d;)V

    :cond_0
    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ServiceInfoResolver("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v1

    invoke-virtual {v1}, LLg/l;->G0()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected g(LLg/f;)LLg/f;
    .locals 6

    iget-object v0, p0, LNg/b;->d:LLg/q;

    invoke-virtual {v0}, LLg/q;->D()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v2

    invoke-virtual {v2}, LLg/l;->z0()LLg/a;

    move-result-object v2

    iget-object v3, p0, LNg/b;->d:LLg/q;

    invoke-virtual {v3}, LLg/q;->u()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljavax/jmdns/impl/constants/e;->TYPE_SRV:Ljavax/jmdns/impl/constants/e;

    sget-object v5, Ljavax/jmdns/impl/constants/d;->CLASS_IN:Ljavax/jmdns/impl/constants/d;

    invoke-virtual {v2, v3, v4, v5}, LLg/a;->l(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;)LLg/b;

    move-result-object v2

    check-cast v2, LLg/h;

    invoke-virtual {p0, p1, v2, v0, v1}, LMg/a;->b(LLg/f;LLg/h;J)LLg/f;

    move-result-object p1

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v2

    invoke-virtual {v2}, LLg/l;->z0()LLg/a;

    move-result-object v2

    iget-object v3, p0, LNg/b;->d:LLg/q;

    invoke-virtual {v3}, LLg/q;->u()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljavax/jmdns/impl/constants/e;->TYPE_TXT:Ljavax/jmdns/impl/constants/e;

    invoke-virtual {v2, v3, v4, v5}, LLg/a;->l(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;)LLg/b;

    move-result-object v2

    check-cast v2, LLg/h;

    invoke-virtual {p0, p1, v2, v0, v1}, LMg/a;->b(LLg/f;LLg/h;J)LLg/f;

    move-result-object p1

    iget-object v2, p0, LNg/b;->d:LLg/q;

    invoke-virtual {v2}, LLg/q;->w()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v2

    invoke-virtual {v2}, LLg/l;->z0()LLg/a;

    move-result-object v2

    iget-object v3, p0, LNg/b;->d:LLg/q;

    invoke-virtual {v3}, LLg/q;->w()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljavax/jmdns/impl/constants/e;->TYPE_A:Ljavax/jmdns/impl/constants/e;

    invoke-virtual {v2, v3, v4, v5}, LLg/a;->p(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;)Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LLg/b;

    check-cast v3, LLg/h;

    invoke-virtual {p0, p1, v3, v0, v1}, LMg/a;->b(LLg/f;LLg/h;J)LLg/f;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v2

    invoke-virtual {v2}, LLg/l;->z0()LLg/a;

    move-result-object v2

    iget-object v3, p0, LNg/b;->d:LLg/q;

    invoke-virtual {v3}, LLg/q;->w()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljavax/jmdns/impl/constants/e;->TYPE_AAAA:Ljavax/jmdns/impl/constants/e;

    sget-object v5, Ljavax/jmdns/impl/constants/d;->CLASS_IN:Ljavax/jmdns/impl/constants/d;

    invoke-virtual {v2, v3, v4, v5}, LLg/a;->p(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;)Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LLg/b;

    check-cast v3, LLg/h;

    invoke-virtual {p0, p1, v3, v0, v1}, LMg/a;->b(LLg/f;LLg/h;J)LLg/f;

    move-result-object p1

    goto :goto_1

    :cond_1
    return-object p1
.end method

.method protected h(LLg/f;)LLg/f;
    .locals 4

    iget-object v0, p0, LNg/b;->d:LLg/q;

    invoke-virtual {v0}, LLg/q;->D()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LNg/b;->d:LLg/q;

    invoke-virtual {v0}, LLg/q;->u()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljavax/jmdns/impl/constants/e;->TYPE_SRV:Ljavax/jmdns/impl/constants/e;

    sget-object v2, Ljavax/jmdns/impl/constants/d;->CLASS_IN:Ljavax/jmdns/impl/constants/d;

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, LLg/g;->D(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;Z)LLg/g;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, LMg/a;->d(LLg/f;LLg/g;)LLg/f;

    move-result-object p1

    iget-object v0, p0, LNg/b;->d:LLg/q;

    invoke-virtual {v0}, LLg/q;->u()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljavax/jmdns/impl/constants/e;->TYPE_TXT:Ljavax/jmdns/impl/constants/e;

    invoke-static {v0, v1, v2, v3}, LLg/g;->D(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;Z)LLg/g;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, LMg/a;->d(LLg/f;LLg/g;)LLg/f;

    move-result-object p1

    iget-object v0, p0, LNg/b;->d:LLg/q;

    invoke-virtual {v0}, LLg/q;->w()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, LNg/b;->d:LLg/q;

    invoke-virtual {v0}, LLg/q;->w()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljavax/jmdns/impl/constants/e;->TYPE_A:Ljavax/jmdns/impl/constants/e;

    invoke-static {v0, v1, v2, v3}, LLg/g;->D(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;Z)LLg/g;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, LMg/a;->d(LLg/f;LLg/g;)LLg/f;

    move-result-object p1

    iget-object v0, p0, LNg/b;->d:LLg/q;

    invoke-virtual {v0}, LLg/q;->w()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljavax/jmdns/impl/constants/e;->TYPE_AAAA:Ljavax/jmdns/impl/constants/e;

    invoke-static {v0, v1, v2, v3}, LLg/g;->D(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;Z)LLg/g;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, LMg/a;->d(LLg/f;LLg/g;)LLg/f;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method protected i()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "querying service info: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LNg/b;->d:LLg/q;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, LLg/q;->u()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, "null"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
