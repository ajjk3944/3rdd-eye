.class public LMg/c;
.super LMg/a;
.source "SourceFile"


# static fields
.field static f:LEj/b;


# instance fields
.field private final b:LLg/c;

.field private final c:Ljava/net/InetAddress;

.field private final d:I

.field private final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, LMg/c;

    invoke-static {v0}, LEj/c;->i(Ljava/lang/Class;)LEj/b;

    move-result-object v0

    sput-object v0, LMg/c;->f:LEj/b;

    return-void
.end method

.method public constructor <init>(LLg/l;LLg/c;Ljava/net/InetAddress;I)V
    .locals 0

    invoke-direct {p0, p1}, LMg/a;-><init>(LLg/l;)V

    iput-object p2, p0, LMg/c;->b:LLg/c;

    iput-object p3, p0, LMg/c;->c:Ljava/net/InetAddress;

    iput p4, p0, LMg/c;->d:I

    sget p1, Ljavax/jmdns/impl/constants/a;->c:I

    if-eq p4, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, LMg/c;->e:Z

    return-void
.end method


# virtual methods
.method public f()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Responder("

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

.method public g(Ljava/util/Timer;)V
    .locals 5

    iget-object v0, p0, LMg/c;->b:LLg/c;

    invoke-virtual {v0}, LLg/e;->l()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x1

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LLg/g;

    sget-object v2, LMg/c;->f:LEj/b;

    const-string v3, "{}.start() question={}"

    invoke-virtual {p0}, LMg/c;->f()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4, v1}, LEj/b;->g(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v2

    invoke-virtual {v1, v2}, LLg/g;->C(LLg/l;)Z

    move-result v1

    if-nez v1, :cond_0

    :cond_1
    const/4 v0, 0x0

    if-eqz v1, :cond_2

    iget-object v1, p0, LMg/c;->b:LLg/c;

    invoke-virtual {v1}, LLg/e;->r()Z

    move-result v1

    if-nez v1, :cond_2

    move v1, v0

    goto :goto_0

    :cond_2
    invoke-static {}, LLg/l;->H0()Ljava/util/Random;

    move-result-object v1

    const/16 v2, 0x60

    invoke-virtual {v1, v2}, Ljava/util/Random;->nextInt(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x14

    iget-object v2, p0, LMg/c;->b:LLg/c;

    invoke-virtual {v2}, LLg/c;->B()I

    move-result v2

    sub-int/2addr v1, v2

    :goto_0
    if-gez v1, :cond_3

    goto :goto_1

    :cond_3
    move v0, v1

    :goto_1
    sget-object v1, LMg/c;->f:LEj/b;

    invoke-virtual {p0}, LMg/c;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "{}.start() Responder chosen delay={}"

    invoke-interface {v1, v4, v2, v3}, LEj/b;->g(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v1

    invoke-virtual {v1}, LLg/l;->W0()Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v1

    invoke-virtual {v1}, LLg/l;->V0()Z

    move-result v1

    if-nez v1, :cond_4

    int-to-long v0, v0

    invoke-virtual {p1, p0, v0, v1}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_4
    return-void
.end method

.method public run()V
    .locals 8

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v0

    iget-object v1, p0, LMg/c;->b:LLg/c;

    invoke-virtual {v0, v1}, LLg/l;->k1(LLg/c;)V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v2

    invoke-virtual {v2}, LLg/l;->T0()Z

    move-result v2

    if-eqz v2, :cond_9

    :try_start_0
    iget-object v2, p0, LMg/c;->b:LLg/c;

    invoke-virtual {v2}, LLg/e;->l()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LLg/g;

    sget-object v4, LMg/c;->f:LEj/b;

    const-string v5, "{}.run() JmDNS responding to: {}"

    invoke-virtual {p0}, LMg/c;->f()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v5, v6, v3}, LEj/b;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v4, p0, LMg/c;->e:Z

    if-eqz v4, :cond_0

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :cond_0
    :goto_1
    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v4

    invoke-virtual {v3, v4, v1}, LLg/g;->z(LLg/l;Ljava/util/Set;)V

    goto :goto_0

    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-object v4, p0, LMg/c;->b:LLg/c;

    invoke-virtual {v4}, LLg/e;->c()Ljava/util/Collection;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LLg/h;

    invoke-virtual {v5, v2, v3}, LLg/h;->M(J)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v1, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    sget-object v5, LMg/c;->f:LEj/b;

    const-string v6, "{} - JmDNS Responder Known Answer Removed"

    invoke-virtual {p0}, LMg/c;->f()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v5, v6, v7}, LEj/b;->n(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_9

    sget-object v2, LMg/c;->f:LEj/b;

    const-string v3, "{}.run() JmDNS responding"

    invoke-virtual {p0}, LMg/c;->f()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, LEj/b;->n(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v2, LLg/f;

    iget-boolean v3, p0, LMg/c;->e:Z

    xor-int/lit8 v3, v3, 0x1

    iget-object v4, p0, LMg/c;->b:LLg/c;

    invoke-virtual {v4}, LLg/c;->C()I

    move-result v4

    const v5, 0x8400

    invoke-direct {v2, v5, v3, v4}, LLg/f;-><init>(IZI)V

    iget-boolean v3, p0, LMg/c;->e:Z

    if-eqz v3, :cond_4

    new-instance v3, Ljava/net/InetSocketAddress;

    iget-object v4, p0, LMg/c;->c:Ljava/net/InetAddress;

    iget v5, p0, LMg/c;->d:I

    invoke-direct {v3, v4, v5}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    invoke-virtual {v2, v3}, LLg/f;->F(Ljava/net/InetSocketAddress;)V

    :cond_4
    iget-object v3, p0, LMg/c;->b:LLg/c;

    invoke-virtual {v3}, LLg/e;->f()I

    move-result v3

    invoke-virtual {v2, v3}, LLg/e;->w(I)V

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LLg/g;

    if-eqz v3, :cond_5

    invoke-virtual {p0, v2, v3}, LMg/a;->d(LLg/f;LLg/g;)LLg/f;

    move-result-object v2

    goto :goto_3

    :cond_6
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_7
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LLg/h;

    if-eqz v1, :cond_7

    iget-object v3, p0, LMg/c;->b:LLg/c;

    invoke-virtual {p0, v2, v3, v1}, LMg/a;->a(LLg/f;LLg/c;LLg/h;)LLg/f;

    move-result-object v1

    move-object v2, v1

    goto :goto_4

    :cond_8
    invoke-virtual {v2}, LLg/e;->n()Z

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v0

    invoke-virtual {v0, v2}, LLg/l;->m1(LLg/f;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_6

    :goto_5
    sget-object v1, LMg/c;->f:LEj/b;

    const-string v2, "{}run() exception "

    invoke-virtual {p0}, LMg/c;->f()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3, v0}, LEj/b;->j(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v0

    invoke-virtual {v0}, LLg/l;->close()V

    :cond_9
    :goto_6
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, LMg/a;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " incomming: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LMg/c;->b:LLg/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
