.class Lcom/google/common/collect/o$d;
.super Lcom/google/common/collect/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/common/collect/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final transient c:I

.field final transient d:I

.field final synthetic e:Lcom/google/common/collect/o;


# direct methods
.method constructor <init>(Lcom/google/common/collect/o;II)V
    .locals 0

    iput-object p1, p0, Lcom/google/common/collect/o$d;->e:Lcom/google/common/collect/o;

    invoke-direct {p0}, Lcom/google/common/collect/o;-><init>()V

    iput p2, p0, Lcom/google/common/collect/o$d;->c:I

    iput p3, p0, Lcom/google/common/collect/o$d;->d:I

    return-void
.end method


# virtual methods
.method public V0(II)Lcom/google/common/collect/o;
    .locals 2

    iget v0, p0, Lcom/google/common/collect/o$d;->d:I

    invoke-static {p1, p2, v0}, Lm4/h;->m(III)V

    iget-object v0, p0, Lcom/google/common/collect/o$d;->e:Lcom/google/common/collect/o;

    iget v1, p0, Lcom/google/common/collect/o$d;->c:I

    add-int/2addr p1, v1

    add-int/2addr p2, v1

    invoke-virtual {v0, p1, p2}, Lcom/google/common/collect/o;->V0(II)Lcom/google/common/collect/o;

    move-result-object p1

    return-object p1
.end method

.method public get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/google/common/collect/o$d;->d:I

    invoke-static {p1, v0}, Lm4/h;->g(II)I

    iget-object v0, p0, Lcom/google/common/collect/o$d;->e:Lcom/google/common/collect/o;

    iget v1, p0, Lcom/google/common/collect/o$d;->c:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-super {p0}, Lcom/google/common/collect/o;->F()Lcom/google/common/collect/S;

    move-result-object v0

    return-object v0
.end method

.method j()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/common/collect/o$d;->e:Lcom/google/common/collect/o;

    invoke-virtual {v0}, Lcom/google/common/collect/n;->j()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
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

.method m()I
    .locals 2

    iget-object v0, p0, Lcom/google/common/collect/o$d;->e:Lcom/google/common/collect/o;

    invoke-virtual {v0}, Lcom/google/common/collect/n;->o()I

    move-result v0

    iget v1, p0, Lcom/google/common/collect/o$d;->c:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/google/common/collect/o$d;->d:I

    add-int/2addr v0, v1

    return v0
.end method

.method o()I
    .locals 2

    iget-object v0, p0, Lcom/google/common/collect/o$d;->e:Lcom/google/common/collect/o;

    invoke-virtual {v0}, Lcom/google/common/collect/n;->o()I

    move-result v0

    iget v1, p0, Lcom/google/common/collect/o$d;->c:I

    add-int/2addr v0, v1

    return v0
.end method

.method s()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public size()I
    .locals 1

    iget v0, p0, Lcom/google/common/collect/o$d;->d:I

    return v0
.end method

.method public bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/common/collect/o$d;->V0(II)Lcom/google/common/collect/o;

    move-result-object p1

    return-object p1
.end method
