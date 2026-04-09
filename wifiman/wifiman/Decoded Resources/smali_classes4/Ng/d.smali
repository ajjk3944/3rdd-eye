.class public LNg/d;
.super LNg/a;
.source "SourceFile"


# direct methods
.method public constructor <init>(LLg/l;)V
    .locals 0

    invoke-direct {p0, p1}, LNg/a;-><init>(LLg/l;)V

    return-void
.end method


# virtual methods
.method public f()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TypeResolver("

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
    .locals 11

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v2

    invoke-virtual {v2}, LLg/l;->J0()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LLg/l$j;

    new-instance v10, LLg/h$e;

    sget-object v6, Ljavax/jmdns/impl/constants/d;->CLASS_IN:Ljavax/jmdns/impl/constants/d;

    sget v8, Ljavax/jmdns/impl/constants/a;->d:I

    invoke-virtual {v3}, LLg/l$j;->f()Ljava/lang/String;

    move-result-object v9

    const-string v5, "_services._dns-sd._udp.local."

    const/4 v7, 0x0

    move-object v4, v10

    invoke-direct/range {v4 .. v9}, LLg/h$e;-><init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/d;ZILjava/lang/String;)V

    invoke-virtual {p0, p1, v10, v0, v1}, LMg/a;->b(LLg/f;LLg/h;J)LLg/f;

    move-result-object p1

    goto :goto_0

    :cond_0
    return-object p1
.end method

.method protected h(LLg/f;)LLg/f;
    .locals 4

    sget-object v0, Ljavax/jmdns/impl/constants/e;->TYPE_PTR:Ljavax/jmdns/impl/constants/e;

    sget-object v1, Ljavax/jmdns/impl/constants/d;->CLASS_IN:Ljavax/jmdns/impl/constants/d;

    const/4 v2, 0x0

    const-string v3, "_services._dns-sd._udp.local."

    invoke-static {v3, v0, v1, v2}, LLg/g;->D(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;Z)LLg/g;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, LMg/a;->d(LLg/f;LLg/g;)LLg/f;

    move-result-object p1

    return-object p1
.end method

.method protected i()Ljava/lang/String;
    .locals 1

    const-string v0, "querying type"

    return-object v0
.end method
