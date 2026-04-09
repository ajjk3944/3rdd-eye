.class Lcom/google/common/collect/o$c;
.super Lcom/google/common/collect/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/common/collect/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field private final transient c:Lcom/google/common/collect/o;


# direct methods
.method constructor <init>(Lcom/google/common/collect/o;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/common/collect/o;-><init>()V

    iput-object p1, p0, Lcom/google/common/collect/o$c;->c:Lcom/google/common/collect/o;

    return-void
.end method

.method private X0(I)I
    .locals 1

    invoke-virtual {p0}, Lcom/google/common/collect/o$c;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    sub-int/2addr v0, p1

    return v0
.end method

.method private Y0(I)I
    .locals 1

    invoke-virtual {p0}, Lcom/google/common/collect/o$c;->size()I

    move-result v0

    sub-int/2addr v0, p1

    return v0
.end method


# virtual methods
.method public N0()Lcom/google/common/collect/o;
    .locals 1

    iget-object v0, p0, Lcom/google/common/collect/o$c;->c:Lcom/google/common/collect/o;

    return-object v0
.end method

.method public V0(II)Lcom/google/common/collect/o;
    .locals 1

    invoke-virtual {p0}, Lcom/google/common/collect/o$c;->size()I

    move-result v0

    invoke-static {p1, p2, v0}, Lm4/h;->m(III)V

    iget-object v0, p0, Lcom/google/common/collect/o$c;->c:Lcom/google/common/collect/o;

    invoke-direct {p0, p2}, Lcom/google/common/collect/o$c;->Y0(I)I

    move-result p2

    invoke-direct {p0, p1}, Lcom/google/common/collect/o$c;->Y0(I)I

    move-result p1

    invoke-virtual {v0, p2, p1}, Lcom/google/common/collect/o;->V0(II)Lcom/google/common/collect/o;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/common/collect/o;->N0()Lcom/google/common/collect/o;

    move-result-object p1

    return-object p1
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/common/collect/o$c;->c:Lcom/google/common/collect/o;

    invoke-virtual {v0, p1}, Lcom/google/common/collect/o;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/common/collect/o$c;->size()I

    move-result v0

    invoke-static {p1, v0}, Lm4/h;->g(II)I

    iget-object v0, p0, Lcom/google/common/collect/o$c;->c:Lcom/google/common/collect/o;

    invoke-direct {p0, p1}, Lcom/google/common/collect/o$c;->X0(I)I

    move-result p1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lcom/google/common/collect/o$c;->c:Lcom/google/common/collect/o;

    invoke-virtual {v0, p1}, Lcom/google/common/collect/o;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    invoke-direct {p0, p1}, Lcom/google/common/collect/o$c;->X0(I)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-super {p0}, Lcom/google/common/collect/o;->F()Lcom/google/common/collect/S;

    move-result-object v0

    return-object v0
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lcom/google/common/collect/o$c;->c:Lcom/google/common/collect/o;

    invoke-virtual {v0, p1}, Lcom/google/common/collect/o;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    invoke-direct {p0, p1}, Lcom/google/common/collect/o$c;->X0(I)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public bridge synthetic listIterator()Ljava/util/ListIterator;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/common/collect/o;->J()Lcom/google/common/collect/T;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lcom/google/common/collect/o;->S(I)Lcom/google/common/collect/T;

    move-result-object p1

    return-object p1
.end method

.method s()Z
    .locals 1

    iget-object v0, p0, Lcom/google/common/collect/o$c;->c:Lcom/google/common/collect/o;

    invoke-virtual {v0}, Lcom/google/common/collect/n;->s()Z

    move-result v0

    return v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lcom/google/common/collect/o$c;->c:Lcom/google/common/collect/o;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/common/collect/o$c;->V0(II)Lcom/google/common/collect/o;

    move-result-object p1

    return-object p1
.end method
