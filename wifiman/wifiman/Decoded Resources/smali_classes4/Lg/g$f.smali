.class LLg/g$f;
.super LLg/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LLg/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "f"
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;Z)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LLg/g;-><init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;Z)V

    return-void
.end method


# virtual methods
.method public z(LLg/l;Ljava/util/Set;)V
    .locals 8

    invoke-virtual {p1}, LLg/l;->K0()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LKg/d;

    check-cast v1, LLg/q;

    invoke-virtual {p0, p1, p2, v1}, LLg/g;->A(LLg/l;Ljava/util/Set;LLg/q;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LLg/b;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LLg/l;->J0()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LLg/l$j;

    new-instance v7, LLg/h$e;

    sget-object v3, Ljavax/jmdns/impl/constants/d;->CLASS_IN:Ljavax/jmdns/impl/constants/d;

    sget v5, Ljavax/jmdns/impl/constants/a;->d:I

    invoke-virtual {v0}, LLg/l$j;->f()Ljava/lang/String;

    move-result-object v6

    const-string v2, "_services._dns-sd._udp.local."

    const/4 v4, 0x0

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, LLg/h$e;-><init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/d;ZILjava/lang/String;)V

    invoke-interface {p2, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, LLg/b;->l()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, LLg/b;->e()Ljava/util/Map;

    move-result-object v0

    sget-object v1, LKg/d$a;->Instance:LKg/d$a;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_5

    invoke-virtual {p1}, LLg/l;->F0()LLg/k;

    move-result-object v1

    invoke-virtual {v1}, LLg/k;->n()Ljava/net/InetAddress;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_2
    const-string v1, ""

    :goto_2
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, LLg/b;->r()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, LLg/l;->F0()LLg/k;

    move-result-object v0

    sget-object v2, Ljavax/jmdns/impl/constants/e;->TYPE_A:Ljavax/jmdns/impl/constants/e;

    sget v3, Ljavax/jmdns/impl/constants/a;->d:I

    invoke-virtual {v0, v2, v1, v3}, LLg/k;->k(Ljavax/jmdns/impl/constants/e;ZI)LLg/h$e;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-virtual {p0}, LLg/b;->s()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, LLg/l;->F0()LLg/k;

    move-result-object p1

    sget-object v0, Ljavax/jmdns/impl/constants/e;->TYPE_AAAA:Ljavax/jmdns/impl/constants/e;

    sget v2, Ljavax/jmdns/impl/constants/a;->d:I

    invoke-virtual {p1, v0, v1, v2}, LLg/k;->k(Ljavax/jmdns/impl/constants/e;ZI)LLg/h$e;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    invoke-virtual {p0}, LLg/b;->j()Z

    :cond_5
    :goto_3
    return-void
.end method
