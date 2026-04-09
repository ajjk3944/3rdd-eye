.class public LOg/d;
.super LOg/c;
.source "SourceFile"


# direct methods
.method public constructor <init>(LLg/l;)V
    .locals 1

    invoke-static {}, LOg/c;->n()I

    move-result v0

    invoke-direct {p0, p1, v0}, LOg/c;-><init>(LLg/l;I)V

    sget-object p1, Ljavax/jmdns/impl/constants/g;->PROBING_1:Ljavax/jmdns/impl/constants/g;

    invoke-virtual {p0, p1}, LOg/c;->t(Ljavax/jmdns/impl/constants/g;)V

    invoke-virtual {p0, p1}, LOg/c;->i(Ljavax/jmdns/impl/constants/g;)V

    return-void
.end method


# virtual methods
.method public cancel()Z
    .locals 1

    invoke-virtual {p0}, LOg/c;->s()V

    invoke-super {p0}, Ljava/util/TimerTask;->cancel()Z

    move-result v0

    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Prober("

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

.method protected h()V
    .locals 1

    invoke-virtual {p0}, LOg/c;->q()Ljavax/jmdns/impl/constants/g;

    move-result-object v0

    invoke-virtual {v0}, Ljavax/jmdns/impl/constants/g;->advance()Ljavax/jmdns/impl/constants/g;

    move-result-object v0

    invoke-virtual {p0, v0}, LOg/c;->t(Ljavax/jmdns/impl/constants/g;)V

    invoke-virtual {p0}, LOg/c;->q()Ljavax/jmdns/impl/constants/g;

    move-result-object v0

    invoke-virtual {v0}, Ljavax/jmdns/impl/constants/g;->isProbing()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LOg/d;->cancel()Z

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v0

    invoke-virtual {v0}, LLg/l;->J()V

    :cond_0
    return-void
.end method

.method protected j(LLg/f;)LLg/f;
    .locals 4

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v0

    invoke-virtual {v0}, LLg/l;->F0()LLg/k;

    move-result-object v0

    invoke-virtual {v0}, LLg/k;->p()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljavax/jmdns/impl/constants/e;->TYPE_ANY:Ljavax/jmdns/impl/constants/e;

    sget-object v2, Ljavax/jmdns/impl/constants/d;->CLASS_IN:Ljavax/jmdns/impl/constants/d;

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, LLg/g;->D(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;Z)LLg/g;

    move-result-object v0

    invoke-virtual {p1, v0}, LLg/f;->A(LLg/g;)V

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v0

    invoke-virtual {v0}, LLg/l;->F0()LLg/k;

    move-result-object v0

    sget-object v1, Ljavax/jmdns/impl/constants/d;->CLASS_ANY:Ljavax/jmdns/impl/constants/d;

    invoke-virtual {p0}, LOg/c;->o()I

    move-result v2

    invoke-virtual {v0, v1, v3, v2}, LLg/k;->a(Ljavax/jmdns/impl/constants/d;ZI)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LLg/h;

    invoke-virtual {p0, p1, v1}, LMg/a;->c(LLg/f;LLg/h;)LLg/f;

    move-result-object p1

    goto :goto_0

    :cond_0
    return-object p1
.end method

.method protected k(LLg/q;LLg/f;)LLg/f;
    .locals 11

    invoke-virtual {p1}, LLg/q;->u()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljavax/jmdns/impl/constants/e;->TYPE_ANY:Ljavax/jmdns/impl/constants/e;

    sget-object v4, Ljavax/jmdns/impl/constants/d;->CLASS_IN:Ljavax/jmdns/impl/constants/d;

    const/4 v2, 0x0

    invoke-static {v0, v1, v4, v2}, LLg/g;->D(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;Z)LLg/g;

    move-result-object v0

    invoke-virtual {p0, p2, v0}, LMg/a;->d(LLg/f;LLg/g;)LLg/f;

    move-result-object p2

    new-instance v0, LLg/h$f;

    invoke-virtual {p1}, LLg/q;->u()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, LOg/c;->o()I

    move-result v6

    invoke-virtual {p1}, LLg/q;->p()I

    move-result v7

    invoke-virtual {p1}, LLg/q;->B()I

    move-result v8

    invoke-virtual {p1}, LLg/q;->o()I

    move-result v9

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object p1

    invoke-virtual {p1}, LLg/l;->F0()LLg/k;

    move-result-object p1

    invoke-virtual {p1}, LLg/k;->p()Ljava/lang/String;

    move-result-object v10

    const/4 v5, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v10}, LLg/h$f;-><init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/d;ZIIIILjava/lang/String;)V

    invoke-virtual {p0, p2, v0}, LMg/a;->c(LLg/f;LLg/h;)LLg/f;

    move-result-object p1

    return-object p1
.end method

.method protected l()Z
    .locals 1

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v0

    invoke-virtual {v0}, LLg/l;->W0()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v0

    invoke-virtual {v0}, LLg/l;->V0()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected m()LLg/f;
    .locals 2

    new-instance v0, LLg/f;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LLg/f;-><init>(I)V

    return-object v0
.end method

.method public p()Ljava/lang/String;
    .locals 1

    const-string v0, "probing"

    return-object v0
.end method

.method protected r(Ljava/lang/Throwable;)V
    .locals 0

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object p1

    invoke-virtual {p1}, LLg/l;->c1()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, LMg/a;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LOg/c;->q()Ljavax/jmdns/impl/constants/g;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u(Ljava/util/Timer;)V
    .locals 7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v2

    invoke-virtual {v2}, LLg/l;->E0()J

    move-result-wide v2

    sub-long v2, v0, v2

    const-wide/16 v4, 0x1388

    cmp-long v2, v2, v4

    const/4 v3, 0x1

    if-gez v2, :cond_0

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v2

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v4

    invoke-virtual {v4}, LLg/l;->M0()I

    move-result v4

    add-int/2addr v4, v3

    invoke-virtual {v2, v4}, LLg/l;->o1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v2

    invoke-virtual {v2, v3}, LLg/l;->o1(I)V

    :goto_0
    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, LLg/l;->n1(J)V

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v0

    invoke-virtual {v0}, LLg/l;->T0()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v0

    invoke-virtual {v0}, LLg/l;->M0()I

    move-result v0

    const/16 v1, 0xa

    if-ge v0, v1, :cond_1

    invoke-static {}, LLg/l;->H0()Ljava/util/Random;

    move-result-object v0

    const/16 v1, 0xfb

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    int-to-long v3, v0

    const-wide/16 v5, 0xfa

    move-object v1, p1

    move-object v2, p0

    invoke-virtual/range {v1 .. v6}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v0

    invoke-virtual {v0}, LLg/l;->W0()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v0

    invoke-virtual {v0}, LLg/l;->V0()Z

    move-result v0

    if-nez v0, :cond_2

    const-wide/16 v3, 0x3e8

    const-wide/16 v5, 0x3e8

    move-object v1, p1

    move-object v2, p0

    invoke-virtual/range {v1 .. v6}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    :cond_2
    :goto_1
    return-void
.end method
