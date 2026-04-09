.class public abstract Lcom/google/common/collect/q;
.super Lcom/google/common/collect/e;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/common/collect/q$a;
    }
.end annotation


# instance fields
.field final transient a:Lcom/google/common/collect/p;

.field final transient b:I


# direct methods
.method constructor <init>(Lcom/google/common/collect/p;I)V
    .locals 0

    invoke-direct {p0}, Lcom/google/common/collect/e;-><init>()V

    iput-object p1, p0, Lcom/google/common/collect/q;->a:Lcom/google/common/collect/p;

    iput p2, p0, Lcom/google/common/collect/q;->b:I

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/util/Map;
    .locals 1

    invoke-virtual {p0}, Lcom/google/common/collect/q;->d()Lcom/google/common/collect/p;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/Object;)Z
    .locals 0

    if-eqz p1, :cond_0

    invoke-super {p0, p1}, Lcom/google/common/collect/d;->c(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public d()Lcom/google/common/collect/p;
    .locals 1

    iget-object v0, p0, Lcom/google/common/collect/q;->a:Lcom/google/common/collect/p;

    return-object v0
.end method

.method public bridge synthetic equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-super {p0, p1}, Lcom/google/common/collect/d;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic hashCode()I
    .locals 1

    invoke-super {p0}, Lcom/google/common/collect/d;->hashCode()I

    move-result v0

    return v0
.end method

.method public bridge synthetic toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lcom/google/common/collect/d;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
