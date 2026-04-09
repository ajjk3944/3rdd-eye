.class public abstract Lcom/google/common/collect/t;
.super Lcom/google/common/collect/u;
.source "SourceFile"

# interfaces
.implements Ljava/util/NavigableSet;
.implements Lcom/google/common/collect/O;


# instance fields
.field final transient c:Ljava/util/Comparator;

.field transient d:Lcom/google/common/collect/t;


# direct methods
.method constructor <init>(Ljava/util/Comparator;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/common/collect/u;-><init>()V

    iput-object p1, p0, Lcom/google/common/collect/t;->c:Ljava/util/Comparator;

    return-void
.end method

.method static varargs U0(Ljava/util/Comparator;I[Ljava/lang/Object;)Lcom/google/common/collect/t;
    .locals 4

    if-nez p1, :cond_0

    invoke-static {p0}, Lcom/google/common/collect/t;->Z0(Ljava/util/Comparator;)Lcom/google/common/collect/L;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p2, p1}, Lcom/google/common/collect/F;->c([Ljava/lang/Object;I)[Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-static {p2, v0, p1, p0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    const/4 v0, 0x1

    move v1, v0

    :goto_0
    if-ge v0, p1, :cond_2

    aget-object v2, p2, v0

    add-int/lit8 v3, v1, -0x1

    aget-object v3, p2, v3

    invoke-interface {p0, v2, v3}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v3

    if-eqz v3, :cond_1

    add-int/lit8 v3, v1, 0x1

    aput-object v2, p2, v1

    move v1, v3

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    invoke-static {p2, v1, p1, v0}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    array-length p1, p2

    div-int/lit8 p1, p1, 0x2

    if-ge v1, p1, :cond_3

    invoke-static {p2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    :cond_3
    new-instance p1, Lcom/google/common/collect/L;

    invoke-static {p2, v1}, Lcom/google/common/collect/o;->y([Ljava/lang/Object;I)Lcom/google/common/collect/o;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Lcom/google/common/collect/L;-><init>(Lcom/google/common/collect/o;Ljava/util/Comparator;)V

    return-object p1
.end method

.method public static V0(Ljava/util/Comparator;Ljava/lang/Iterable;)Lcom/google/common/collect/t;
    .locals 2

    invoke-static {p0}, Lm4/h;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0, p1}, Lcom/google/common/collect/P;->b(Ljava/util/Comparator;Ljava/lang/Iterable;)Z

    move-result v0

    if-eqz v0, :cond_0

    instance-of v0, p1, Lcom/google/common/collect/t;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/google/common/collect/t;

    invoke-virtual {v0}, Lcom/google/common/collect/n;->s()Z

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {p1}, Lcom/google/common/collect/v;->b(Ljava/lang/Iterable;)[Ljava/lang/Object;

    move-result-object p1

    array-length v0, p1

    invoke-static {p0, v0, p1}, Lcom/google/common/collect/t;->U0(Ljava/util/Comparator;I[Ljava/lang/Object;)Lcom/google/common/collect/t;

    move-result-object p0

    return-object p0
.end method

.method public static W0(Ljava/util/Comparator;Ljava/util/Collection;)Lcom/google/common/collect/t;
    .locals 0

    invoke-static {p0, p1}, Lcom/google/common/collect/t;->V0(Ljava/util/Comparator;Ljava/lang/Iterable;)Lcom/google/common/collect/t;

    move-result-object p0

    return-object p0
.end method

.method static Z0(Ljava/util/Comparator;)Lcom/google/common/collect/L;
    .locals 2

    invoke-static {}, Lcom/google/common/collect/G;->d()Lcom/google/common/collect/G;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lcom/google/common/collect/L;->f:Lcom/google/common/collect/L;

    return-object p0

    :cond_0
    new-instance v0, Lcom/google/common/collect/L;

    invoke-static {}, Lcom/google/common/collect/o;->T()Lcom/google/common/collect/o;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lcom/google/common/collect/L;-><init>(Lcom/google/common/collect/o;Ljava/util/Comparator;)V

    return-object v0
.end method

.method static k1(Ljava/util/Comparator;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    invoke-interface {p0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    return p0
.end method


# virtual methods
.method abstract X0()Lcom/google/common/collect/t;
.end method

.method public Y0()Lcom/google/common/collect/t;
    .locals 1

    iget-object v0, p0, Lcom/google/common/collect/t;->d:Lcom/google/common/collect/t;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/common/collect/t;->X0()Lcom/google/common/collect/t;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/collect/t;->d:Lcom/google/common/collect/t;

    iput-object p0, v0, Lcom/google/common/collect/t;->d:Lcom/google/common/collect/t;

    :cond_0
    return-object v0
.end method

.method public a1(Ljava/lang/Object;)Lcom/google/common/collect/t;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/common/collect/t;->b1(Ljava/lang/Object;Z)Lcom/google/common/collect/t;

    move-result-object p1

    return-object p1
.end method

.method public b1(Ljava/lang/Object;Z)Lcom/google/common/collect/t;
    .locals 0

    invoke-static {p1}, Lm4/h;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/google/common/collect/t;->c1(Ljava/lang/Object;Z)Lcom/google/common/collect/t;

    move-result-object p1

    return-object p1
.end method

.method abstract c1(Ljava/lang/Object;Z)Lcom/google/common/collect/t;
.end method

.method public comparator()Ljava/util/Comparator;
    .locals 1

    iget-object v0, p0, Lcom/google/common/collect/t;->c:Ljava/util/Comparator;

    return-object v0
.end method

.method public d1(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/t;
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, p2, v1}, Lcom/google/common/collect/t;->e1(Ljava/lang/Object;ZLjava/lang/Object;Z)Lcom/google/common/collect/t;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic descendingSet()Ljava/util/NavigableSet;
    .locals 1

    invoke-virtual {p0}, Lcom/google/common/collect/t;->Y0()Lcom/google/common/collect/t;

    move-result-object v0

    return-object v0
.end method

.method public e1(Ljava/lang/Object;ZLjava/lang/Object;Z)Lcom/google/common/collect/t;
    .locals 1

    invoke-static {p1}, Lm4/h;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lm4/h;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/common/collect/t;->c:Ljava/util/Comparator;

    invoke-interface {v0, p1, p3}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lm4/h;->d(Z)V

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/common/collect/t;->f1(Ljava/lang/Object;ZLjava/lang/Object;Z)Lcom/google/common/collect/t;

    move-result-object p1

    return-object p1
.end method

.method abstract f1(Ljava/lang/Object;ZLjava/lang/Object;Z)Lcom/google/common/collect/t;
.end method

.method public g1(Ljava/lang/Object;)Lcom/google/common/collect/t;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/google/common/collect/t;->h1(Ljava/lang/Object;Z)Lcom/google/common/collect/t;

    move-result-object p1

    return-object p1
.end method

.method public h1(Ljava/lang/Object;Z)Lcom/google/common/collect/t;
    .locals 0

    invoke-static {p1}, Lm4/h;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/google/common/collect/t;->i1(Ljava/lang/Object;Z)Lcom/google/common/collect/t;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic headSet(Ljava/lang/Object;Z)Ljava/util/NavigableSet;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/google/common/collect/t;->b1(Ljava/lang/Object;Z)Lcom/google/common/collect/t;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic headSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/google/common/collect/t;->a1(Ljava/lang/Object;)Lcom/google/common/collect/t;

    move-result-object p1

    return-object p1
.end method

.method abstract i1(Ljava/lang/Object;Z)Lcom/google/common/collect/t;
.end method

.method j1(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lcom/google/common/collect/t;->c:Ljava/util/Comparator;

    invoke-static {v0, p1, p2}, Lcom/google/common/collect/t;->k1(Ljava/util/Comparator;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final pollFirst()Ljava/lang/Object;
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final pollLast()Ljava/lang/Object;
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public bridge synthetic subSet(Ljava/lang/Object;ZLjava/lang/Object;Z)Ljava/util/NavigableSet;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/common/collect/t;->e1(Ljava/lang/Object;ZLjava/lang/Object;Z)Lcom/google/common/collect/t;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic subSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/google/common/collect/t;->d1(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/t;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic tailSet(Ljava/lang/Object;Z)Ljava/util/NavigableSet;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/google/common/collect/t;->h1(Ljava/lang/Object;Z)Lcom/google/common/collect/t;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic tailSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/google/common/collect/t;->g1(Ljava/lang/Object;)Lcom/google/common/collect/t;

    move-result-object p1

    return-object p1
.end method
