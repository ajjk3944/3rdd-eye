.class public abstract Lj1/m;
.super Lj1/e;
.source "SourceFile"


# instance fields
.field public K0:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lj1/e;-><init>(II)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lj1/m;->K0:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public a1(Lj1/e;)V
    .locals 1

    iget-object v0, p0, Lj1/m;->K0:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lj1/e;->F()Lj1/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lj1/e;->F()Lj1/e;

    move-result-object v0

    check-cast v0, Lj1/m;

    invoke-virtual {v0, p1}, Lj1/m;->e1(Lj1/e;)V

    :cond_0
    invoke-virtual {p1, p0}, Lj1/e;->M0(Lj1/e;)V

    return-void
.end method

.method public varargs b1([Lj1/e;)V
    .locals 3

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    invoke-virtual {p0, v2}, Lj1/m;->a1(Lj1/e;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public c1()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lj1/m;->K0:Ljava/util/ArrayList;

    return-object v0
.end method

.method public abstract d1()V
.end method

.method public e1(Lj1/e;)V
    .locals 1

    iget-object v0, p0, Lj1/m;->K0:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lj1/e;->k0()V

    return-void
.end method

.method public f1()V
    .locals 1

    iget-object v0, p0, Lj1/m;->K0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public k0()V
    .locals 1

    iget-object v0, p0, Lj1/m;->K0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    invoke-super {p0}, Lj1/e;->k0()V

    return-void
.end method

.method public n0(Lc1/c;)V
    .locals 3

    invoke-super {p0, p1}, Lj1/e;->n0(Lc1/c;)V

    iget-object v0, p0, Lj1/m;->K0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lj1/m;->K0:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj1/e;

    invoke-virtual {v2, p1}, Lj1/e;->n0(Lc1/c;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
