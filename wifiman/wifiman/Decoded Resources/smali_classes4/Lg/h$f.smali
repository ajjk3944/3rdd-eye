.class public LLg/h$f;
.super LLg/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LLg/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation


# instance fields
.field private final n:I

.field private final o:I

.field private final p:I

.field private final q:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/d;ZIIIILjava/lang/String;)V
    .locals 6

    sget-object v2, Ljavax/jmdns/impl/constants/e;->TYPE_SRV:Ljavax/jmdns/impl/constants/e;

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, LLg/h;-><init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;ZI)V

    iput p5, p0, LLg/h$f;->n:I

    iput p6, p0, LLg/h$f;->o:I

    iput p7, p0, LLg/h$f;->p:I

    iput-object p8, p0, LLg/h$f;->q:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public E(LLg/l;)LKg/c;
    .locals 4

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LLg/h$f;->G(Z)LKg/d;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LLg/q;

    invoke-virtual {v1, p1}, LLg/q;->j0(LLg/l;)V

    new-instance v1, LLg/p;

    invoke-virtual {v0}, LKg/d;->A()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, LKg/d;->n()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, p1, v2, v3, v0}, LLg/p;-><init>(LLg/l;Ljava/lang/String;Ljava/lang/String;LKg/d;)V

    return-object v1
.end method

.method public G(Z)LKg/d;
    .locals 8

    new-instance v7, LLg/q;

    invoke-virtual {p0}, LLg/b;->e()Ljava/util/Map;

    move-result-object v1

    iget v2, p0, LLg/h$f;->p:I

    iget v3, p0, LLg/h$f;->o:I

    iget v4, p0, LLg/h$f;->n:I

    iget-object v6, p0, LLg/h$f;->q:Ljava/lang/String;

    move-object v0, v7

    move v5, p1

    invoke-direct/range {v0 .. v6}, LLg/q;-><init>(Ljava/util/Map;IIIZLjava/lang/String;)V

    return-object v7
.end method

.method I(LLg/l;J)Z
    .locals 12

    invoke-virtual {p1}, LLg/l;->K0()Ljava/util/Map;

    move-result-object p2

    invoke-virtual {p0}, LLg/b;->c()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p2, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LLg/q;

    const/4 p3, 0x0

    if-eqz p2, :cond_4

    invoke-virtual {p2}, LLg/q;->a0()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p2}, LLg/q;->Z()Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_0
    iget v0, p0, LLg/h$f;->p:I

    invoke-virtual {p2}, LLg/q;->o()I

    move-result v1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, LLg/h$f;->q:Ljava/lang/String;

    invoke-virtual {p1}, LLg/l;->F0()LLg/k;

    move-result-object v1

    invoke-virtual {v1}, LLg/k;->p()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    :cond_1
    invoke-static {}, LLg/h;->z()LEj/b;

    move-result-object v0

    const-string v1, "handleQuery() Conflicting probe detected from: {}"

    invoke-virtual {p0}, LLg/h;->C()Ljava/net/InetAddress;

    move-result-object v2

    invoke-interface {v0, v1, v2}, LEj/b;->n(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v0, LLg/h$f;

    invoke-virtual {p2}, LLg/q;->u()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ljavax/jmdns/impl/constants/d;->CLASS_IN:Ljavax/jmdns/impl/constants/d;

    sget v7, Ljavax/jmdns/impl/constants/a;->d:I

    invoke-virtual {p2}, LLg/q;->p()I

    move-result v8

    invoke-virtual {p2}, LLg/q;->B()I

    move-result v9

    invoke-virtual {p2}, LLg/q;->o()I

    move-result v10

    invoke-virtual {p1}, LLg/l;->F0()LLg/k;

    move-result-object v1

    invoke-virtual {v1}, LLg/k;->p()Ljava/lang/String;

    move-result-object v11

    const/4 v6, 0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v11}, LLg/h$f;-><init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/d;ZIIIILjava/lang/String;)V

    :try_start_0
    invoke-virtual {p1}, LLg/l;->D0()Ljava/net/InetAddress;

    move-result-object v1

    invoke-virtual {p0}, LLg/h;->C()Ljava/net/InetAddress;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/net/InetAddress;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {}, LLg/h;->z()LEj/b;

    move-result-object v1

    const-string v2, "Got conflicting probe from ourselves\nincoming: {}\nlocal   : {}"

    invoke-virtual {p0}, LLg/b;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, LLg/b;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v2, v3, v4}, LEj/b;->j(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-static {}, LLg/h;->z()LEj/b;

    move-result-object v2

    const-string v3, "IOException"

    invoke-interface {v2, v3, v1}, LEj/b;->r(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    invoke-virtual {p0, v0}, LLg/b;->b(LLg/b;)I

    move-result v0

    if-nez v0, :cond_3

    invoke-static {}, LLg/h;->z()LEj/b;

    move-result-object p1

    const-string p2, "handleQuery() Ignoring a identical service query"

    invoke-interface {p1, p2}, LEj/b;->l(Ljava/lang/String;)V

    return p3

    :cond_3
    invoke-virtual {p2}, LLg/q;->d0()Z

    move-result v1

    if-eqz v1, :cond_4

    if-lez v0, :cond_4

    invoke-virtual {p2}, LLg/q;->u()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p3

    invoke-static {}, LLg/n$c;->a()LLg/n;

    move-result-object v0

    invoke-virtual {p1}, LLg/l;->F0()LLg/k;

    move-result-object v1

    invoke-virtual {v1}, LLg/k;->n()Ljava/net/InetAddress;

    move-result-object v1

    invoke-virtual {p2}, LLg/q;->n()Ljava/lang/String;

    move-result-object v2

    sget-object v3, LLg/n$d;->SERVICE:LLg/n$d;

    invoke-interface {v0, v1, v2, v3}, LLg/n;->a(Ljava/net/InetAddress;Ljava/lang/String;LLg/n$d;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, LLg/q;->k0(Ljava/lang/String;)V

    invoke-virtual {p1}, LLg/l;->K0()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, LLg/l;->K0()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p2}, LLg/q;->u()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p1, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, LLg/h;->z()LEj/b;

    move-result-object p1

    const-string p3, "handleQuery() Lost tie break: new unique name chosen:{}"

    invoke-virtual {p2}, LLg/q;->n()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p3, v0}, LEj/b;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p2}, LLg/q;->i0()Z

    const/4 p1, 0x1

    return p1

    :cond_4
    return p3
.end method

.method J(LLg/l;)Z
    .locals 6

    invoke-virtual {p1}, LLg/l;->K0()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, LLg/b;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LLg/q;

    if-eqz v0, :cond_2

    iget v1, p0, LLg/h$f;->p:I

    invoke-virtual {v0}, LLg/q;->o()I

    move-result v2

    if-ne v1, v2, :cond_0

    iget-object v1, p0, LLg/h$f;->q:Ljava/lang/String;

    invoke-virtual {p1}, LLg/l;->F0()LLg/k;

    move-result-object v2

    invoke-virtual {v2}, LLg/k;->p()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    :cond_0
    invoke-static {}, LLg/h;->z()LEj/b;

    move-result-object v1

    const-string v2, "handleResponse() Denial detected"

    invoke-interface {v1, v2}, LEj/b;->l(Ljava/lang/String;)V

    invoke-virtual {v0}, LLg/q;->d0()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, LLg/q;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, LLg/n$c;->a()LLg/n;

    move-result-object v2

    invoke-virtual {p1}, LLg/l;->F0()LLg/k;

    move-result-object v3

    invoke-virtual {v3}, LLg/k;->n()Ljava/net/InetAddress;

    move-result-object v3

    invoke-virtual {v0}, LLg/q;->n()Ljava/lang/String;

    move-result-object v4

    sget-object v5, LLg/n$d;->SERVICE:LLg/n$d;

    invoke-interface {v2, v3, v4, v5}, LLg/n;->a(Ljava/net/InetAddress;Ljava/lang/String;LLg/n$d;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, LLg/q;->k0(Ljava/lang/String;)V

    invoke-virtual {p1}, LLg/l;->K0()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, LLg/l;->K0()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v0}, LLg/q;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, LLg/h;->z()LEj/b;

    move-result-object p1

    const-string v1, "handleResponse() New unique name chose:{}"

    invoke-virtual {v0}, LLg/q;->n()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v1, v2}, LEj/b;->n(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {v0}, LLg/q;->i0()Z

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public L()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method Q(LLg/h;)Z
    .locals 3

    instance-of v0, p1, LLg/h$f;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, LLg/h$f;

    iget v0, p0, LLg/h$f;->n:I

    iget v2, p1, LLg/h$f;->n:I

    if-ne v0, v2, :cond_1

    iget v0, p0, LLg/h$f;->o:I

    iget v2, p1, LLg/h$f;->o:I

    if-ne v0, v2, :cond_1

    iget v0, p0, LLg/h$f;->p:I

    iget v2, p1, LLg/h$f;->p:I

    if-ne v0, v2, :cond_1

    iget-object v0, p0, LLg/h$f;->q:Ljava/lang/String;

    iget-object p1, p1, LLg/h$f;->q:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method V(LLg/f$a;)V
    .locals 3

    iget v0, p0, LLg/h$f;->n:I

    invoke-virtual {p1, v0}, LLg/f$a;->C(I)V

    iget v0, p0, LLg/h$f;->o:I

    invoke-virtual {p1, v0}, LLg/f$a;->C(I)V

    iget v0, p0, LLg/h$f;->p:I

    invoke-virtual {p1, v0}, LLg/f$a;->C(I)V

    sget-boolean v0, LLg/c;->m:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LLg/h$f;->q:Ljava/lang/String;

    invoke-virtual {p1, v0}, LLg/f$a;->p(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LLg/h$f;->q:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v1}, LLg/f$a;->J(Ljava/lang/String;II)V

    invoke-virtual {p1, v2}, LLg/f$a;->g(I)V

    :goto_0
    return-void
.end method

.method public W()I
    .locals 1

    iget v0, p0, LLg/h$f;->p:I

    return v0
.end method

.method public X()I
    .locals 1

    iget v0, p0, LLg/h$f;->n:I

    return v0
.end method

.method Y()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LLg/h$f;->q:Ljava/lang/String;

    return-object v0
.end method

.method public Z()I
    .locals 1

    iget v0, p0, LLg/h$f;->o:I

    return v0
.end method

.method protected w(Ljava/io/DataOutputStream;)V
    .locals 2

    invoke-super {p0, p1}, LLg/b;->w(Ljava/io/DataOutputStream;)V

    iget v0, p0, LLg/h$f;->n:I

    invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeShort(I)V

    iget v0, p0, LLg/h$f;->o:I

    invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeShort(I)V

    iget v0, p0, LLg/h$f;->p:I

    invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeShort(I)V

    :try_start_0
    iget-object v0, p0, LLg/h$f;->q:Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method protected y(Ljava/lang/StringBuilder;)V
    .locals 1

    invoke-super {p0, p1}, LLg/h;->y(Ljava/lang/StringBuilder;)V

    const-string v0, " server: \'"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LLg/h$f;->q:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x3a

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v0, p0, LLg/h$f;->p:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v0, 0x27

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method
