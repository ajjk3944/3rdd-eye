.class public LLg/h$e;
.super LLg/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LLg/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field private final n:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/d;ZILjava/lang/String;)V
    .locals 6

    sget-object v2, Ljavax/jmdns/impl/constants/e;->TYPE_PTR:Ljavax/jmdns/impl/constants/e;

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, LLg/h;-><init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;ZI)V

    iput-object p5, p0, LLg/h$e;->n:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public E(LLg/l;)LKg/c;
    .locals 4

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LLg/h$e;->G(Z)LKg/d;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LLg/q;

    invoke-virtual {v1, p1}, LLg/q;->j0(LLg/l;)V

    invoke-virtual {v0}, LKg/d;->A()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, LLg/h$e;->W()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, LLg/l;->q1(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, LLg/p;

    invoke-direct {v3, p1, v1, v2, v0}, LLg/p;-><init>(LLg/l;Ljava/lang/String;Ljava/lang/String;LKg/d;)V

    return-object v3
.end method

.method public G(Z)LKg/d;
    .locals 8

    invoke-virtual {p0}, LLg/b;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LLg/h$e;->W()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LLg/r;->b(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    new-instance v0, LLg/q;

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v0

    move v6, p1

    invoke-direct/range {v1 .. v7}, LLg/q;-><init>(Ljava/util/Map;IIIZ[B)V

    return-object v0

    :cond_0
    invoke-virtual {p0}, LLg/b;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, LLg/q;

    invoke-virtual {p0}, LLg/b;->e()Ljava/util/Map;

    move-result-object v2

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v0

    move v6, p1

    invoke-direct/range {v1 .. v7}, LLg/q;-><init>(Ljava/util/Map;IIIZ[B)V

    return-object v0

    :cond_1
    invoke-virtual {p0}, LLg/b;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, LLg/q;

    invoke-virtual {p0}, LLg/b;->e()Ljava/util/Map;

    move-result-object v2

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v0

    move v6, p1

    invoke-direct/range {v1 .. v7}, LLg/q;-><init>(Ljava/util/Map;IIIZ[B)V

    return-object v0

    :cond_2
    invoke-virtual {p0}, LLg/h$e;->W()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LLg/r;->b(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    sget-object v0, LKg/d$a;->Subtype:LKg/d$a;

    invoke-virtual {p0}, LLg/b;->e()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, LLg/q;

    const/4 v5, 0x0

    invoke-virtual {p0}, LLg/h$e;->W()Ljava/lang/String;

    move-result-object v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v0

    move v6, p1

    invoke-direct/range {v1 .. v7}, LLg/q;-><init>(Ljava/util/Map;IIIZLjava/lang/String;)V

    return-object v0
.end method

.method I(LLg/l;J)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method J(LLg/l;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public L()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method Q(LLg/h;)Z
    .locals 3

    instance-of v0, p1, LLg/h$e;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, LLg/h$e;

    iget-object v0, p0, LLg/h$e;->n:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-object v2, p1, LLg/h$e;->n:Ljava/lang/String;

    if-eqz v2, :cond_1

    return v1

    :cond_1
    iget-object p1, p1, LLg/h$e;->n:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method V(LLg/f$a;)V
    .locals 1

    iget-object v0, p0, LLg/h$e;->n:Ljava/lang/String;

    invoke-virtual {p1, v0}, LLg/f$a;->p(Ljava/lang/String;)V

    return-void
.end method

.method W()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LLg/h$e;->n:Ljava/lang/String;

    return-object v0
.end method

.method public m(LLg/b;)Z
    .locals 1

    invoke-super {p0, p1}, LLg/b;->m(LLg/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    instance-of v0, p1, LLg/h$e;

    if-eqz v0, :cond_0

    check-cast p1, LLg/h$e;

    invoke-virtual {p0, p1}, LLg/h$e;->Q(LLg/h;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method protected y(Ljava/lang/StringBuilder;)V
    .locals 1

    invoke-super {p0, p1}, LLg/h;->y(Ljava/lang/StringBuilder;)V

    const-string v0, " alias: \'"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LLg/h$e;->n:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "null"

    :goto_0
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x27

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method
