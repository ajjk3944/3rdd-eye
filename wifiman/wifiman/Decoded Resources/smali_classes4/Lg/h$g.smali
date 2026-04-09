.class public LLg/h$g;
.super LLg/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LLg/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "g"
.end annotation


# instance fields
.field private final n:[B


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/d;ZI[B)V
    .locals 6

    sget-object v2, Ljavax/jmdns/impl/constants/e;->TYPE_TXT:Ljavax/jmdns/impl/constants/e;

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, LLg/h;-><init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;ZI)V

    if-eqz p5, :cond_0

    array-length p1, p5

    if-lez p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p5, LPg/a;->c:[B

    :goto_0
    iput-object p5, p0, LLg/h$g;->n:[B

    return-void
.end method


# virtual methods
.method public E(LLg/l;)LKg/c;
    .locals 4

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LLg/h$g;->G(Z)LKg/d;

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

    const/4 v4, 0x0

    iget-object v6, p0, LLg/h$g;->n:[B

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v7

    move v5, p1

    invoke-direct/range {v0 .. v6}, LLg/q;-><init>(Ljava/util/Map;IIIZ[B)V

    return-object v7
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

    const/4 v0, 0x1

    return v0
.end method

.method Q(LLg/h;)Z
    .locals 4

    instance-of v0, p1, LLg/h$g;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, LLg/h$g;

    iget-object v0, p0, LLg/h$g;->n:[B

    if-nez v0, :cond_1

    iget-object v2, p1, LLg/h$g;->n:[B

    if-eqz v2, :cond_1

    return v1

    :cond_1
    iget-object v2, p1, LLg/h$g;->n:[B

    array-length v2, v2

    array-length v3, v0

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    array-length v0, v0

    :goto_0
    add-int/lit8 v2, v0, -0x1

    if-lez v0, :cond_4

    iget-object v0, p1, LLg/h$g;->n:[B

    aget-byte v0, v0, v2

    iget-object v3, p0, LLg/h$g;->n:[B

    aget-byte v3, v3, v2

    if-eq v0, v3, :cond_3

    return v1

    :cond_3
    move v0, v2

    goto :goto_0

    :cond_4
    const/4 p1, 0x1

    return p1
.end method

.method V(LLg/f$a;)V
    .locals 3

    iget-object v0, p0, LLg/h$g;->n:[B

    const/4 v1, 0x0

    array-length v2, v0

    invoke-virtual {p1, v0, v1, v2}, LLg/f$a;->h([BII)V

    return-void
.end method

.method W()[B
    .locals 1

    iget-object v0, p0, LLg/h$g;->n:[B

    return-object v0
.end method

.method protected y(Ljava/lang/StringBuilder;)V
    .locals 3

    invoke-super {p0, p1}, LLg/h;->y(Ljava/lang/StringBuilder;)V

    const-string v0, " text: \'"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LLg/h$g;->n:[B

    invoke-static {v0}, LPg/a;->c([B)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    const/16 v1, 0x14

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_0

    const/4 v1, 0x0

    const/16 v2, 0x11

    invoke-virtual {p1, v0, v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    const-string v0, "..."

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    :goto_0
    const/16 v0, 0x27

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method
