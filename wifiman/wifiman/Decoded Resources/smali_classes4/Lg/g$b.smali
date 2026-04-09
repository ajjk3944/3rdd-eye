.class LLg/g$b;
.super LLg/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LLg/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;Z)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LLg/g;-><init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;Z)V

    return-void
.end method


# virtual methods
.method public C(LLg/l;)Z
    .locals 2

    invoke-virtual {p0}, LLg/b;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, LLg/l;->F0()LLg/k;

    move-result-object v1

    invoke-virtual {v1}, LLg/k;->p()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, LLg/l;->K0()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public o(LLg/b;)Z
    .locals 0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public z(LLg/l;Ljava/util/Set;)V
    .locals 5

    invoke-virtual {p0}, LLg/b;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, LLg/l;->F0()LLg/k;

    move-result-object v1

    invoke-virtual {v1}, LLg/k;->p()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, LLg/l;->F0()LLg/k;

    move-result-object p1

    invoke-virtual {p0}, LLg/b;->f()Ljavax/jmdns/impl/constants/d;

    move-result-object v0

    invoke-virtual {p0}, LLg/b;->q()Z

    move-result v1

    sget v2, Ljavax/jmdns/impl/constants/a;->d:I

    invoke-virtual {p1, v0, v1, v2}, LLg/k;->a(Ljavax/jmdns/impl/constants/d;ZI)Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-void

    :cond_0
    invoke-virtual {p1}, LLg/l;->J0()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, LLg/g$f;

    invoke-virtual {p0}, LLg/b;->d()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljavax/jmdns/impl/constants/e;->TYPE_PTR:Ljavax/jmdns/impl/constants/e;

    invoke-virtual {p0}, LLg/b;->f()Ljavax/jmdns/impl/constants/d;

    move-result-object v3

    invoke-virtual {p0}, LLg/b;->q()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, LLg/g$f;-><init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;Z)V

    invoke-virtual {v0, p1, p2}, LLg/g;->z(LLg/l;Ljava/util/Set;)V

    return-void

    :cond_1
    invoke-virtual {p1}, LLg/l;->K0()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LKg/d;

    check-cast v1, LLg/q;

    invoke-virtual {p0, p1, p2, v1}, LLg/g;->A(LLg/l;Ljava/util/Set;LLg/q;)V

    goto :goto_0

    :cond_2
    return-void
.end method
