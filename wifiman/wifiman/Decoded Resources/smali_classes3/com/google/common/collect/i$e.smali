.class abstract Lcom/google/common/collect/i$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/common/collect/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "e"
.end annotation


# instance fields
.field a:I

.field b:I

.field c:I

.field final synthetic d:Lcom/google/common/collect/i;


# direct methods
.method private constructor <init>(Lcom/google/common/collect/i;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/google/common/collect/i$e;->d:Lcom/google/common/collect/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1}, Lcom/google/common/collect/i;->d(Lcom/google/common/collect/i;)I

    move-result v0

    iput v0, p0, Lcom/google/common/collect/i$e;->a:I

    .line 3
    invoke-virtual {p1}, Lcom/google/common/collect/i;->E0()I

    move-result p1

    iput p1, p0, Lcom/google/common/collect/i$e;->b:I

    const/4 p1, -0x1

    .line 4
    iput p1, p0, Lcom/google/common/collect/i$e;->c:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/common/collect/i;Lcom/google/common/collect/i$a;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Lcom/google/common/collect/i$e;-><init>(Lcom/google/common/collect/i;)V

    return-void
.end method

.method private a()V
    .locals 2

    iget-object v0, p0, Lcom/google/common/collect/i$e;->d:Lcom/google/common/collect/i;

    invoke-static {v0}, Lcom/google/common/collect/i;->d(Lcom/google/common/collect/i;)I

    move-result v0

    iget v1, p0, Lcom/google/common/collect/i$e;->a:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method


# virtual methods
.method abstract c(I)Ljava/lang/Object;
.end method

.method d()V
    .locals 1

    iget v0, p0, Lcom/google/common/collect/i$e;->a:I

    add-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/google/common/collect/i$e;->a:I

    return-void
.end method

.method public hasNext()Z
    .locals 1

    iget v0, p0, Lcom/google/common/collect/i$e;->b:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 3

    invoke-direct {p0}, Lcom/google/common/collect/i$e;->a()V

    invoke-virtual {p0}, Lcom/google/common/collect/i$e;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/common/collect/i$e;->b:I

    iput v0, p0, Lcom/google/common/collect/i$e;->c:I

    invoke-virtual {p0, v0}, Lcom/google/common/collect/i$e;->c(I)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/google/common/collect/i$e;->d:Lcom/google/common/collect/i;

    iget v2, p0, Lcom/google/common/collect/i$e;->b:I

    invoke-virtual {v1, v2}, Lcom/google/common/collect/i;->G0(I)I

    move-result v1

    iput v1, p0, Lcom/google/common/collect/i$e;->b:I

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public remove()V
    .locals 3

    invoke-direct {p0}, Lcom/google/common/collect/i$e;->a()V

    iget v0, p0, Lcom/google/common/collect/i$e;->c:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/google/common/collect/g;->c(Z)V

    invoke-virtual {p0}, Lcom/google/common/collect/i$e;->d()V

    iget-object v0, p0, Lcom/google/common/collect/i$e;->d:Lcom/google/common/collect/i;

    iget v1, p0, Lcom/google/common/collect/i$e;->c:I

    invoke-static {v0, v1}, Lcom/google/common/collect/i;->g(Lcom/google/common/collect/i;I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/common/collect/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/common/collect/i$e;->d:Lcom/google/common/collect/i;

    iget v1, p0, Lcom/google/common/collect/i$e;->b:I

    iget v2, p0, Lcom/google/common/collect/i$e;->c:I

    invoke-virtual {v0, v1, v2}, Lcom/google/common/collect/i;->E(II)I

    move-result v0

    iput v0, p0, Lcom/google/common/collect/i$e;->b:I

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/common/collect/i$e;->c:I

    return-void
.end method
