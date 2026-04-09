.class final Lcom/google/common/collect/J$b;
.super Lcom/google/common/collect/r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/common/collect/J;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private final transient c:Lcom/google/common/collect/p;

.field private final transient d:Lcom/google/common/collect/o;


# direct methods
.method constructor <init>(Lcom/google/common/collect/p;Lcom/google/common/collect/o;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/common/collect/r;-><init>()V

    iput-object p1, p0, Lcom/google/common/collect/J$b;->c:Lcom/google/common/collect/p;

    iput-object p2, p0, Lcom/google/common/collect/J$b;->d:Lcom/google/common/collect/o;

    return-void
.end method


# virtual methods
.method public T()Lcom/google/common/collect/S;
    .locals 1

    invoke-virtual {p0}, Lcom/google/common/collect/J$b;->v()Lcom/google/common/collect/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/collect/o;->F()Lcom/google/common/collect/S;

    move-result-object v0

    return-object v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/common/collect/J$b;->c:Lcom/google/common/collect/p;

    invoke-virtual {v0, p1}, Lcom/google/common/collect/p;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method g([Ljava/lang/Object;I)I
    .locals 1

    invoke-virtual {p0}, Lcom/google/common/collect/J$b;->v()Lcom/google/common/collect/o;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/common/collect/o;->g([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lcom/google/common/collect/J$b;->T()Lcom/google/common/collect/S;

    move-result-object v0

    return-object v0
.end method

.method s()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lcom/google/common/collect/J$b;->c:Lcom/google/common/collect/p;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

.method public v()Lcom/google/common/collect/o;
    .locals 1

    iget-object v0, p0, Lcom/google/common/collect/J$b;->d:Lcom/google/common/collect/o;

    return-object v0
.end method
