.class public Lcom/google/common/collect/s;
.super Lcom/google/common/collect/q;
.source "SourceFile"

# interfaces
.implements Lcom/google/common/collect/A;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/common/collect/s$a;
    }
.end annotation


# instance fields
.field private final transient c:Lcom/google/common/collect/r;


# direct methods
.method constructor <init>(Lcom/google/common/collect/p;ILjava/util/Comparator;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/common/collect/q;-><init>(Lcom/google/common/collect/p;I)V

    invoke-static {p3}, Lcom/google/common/collect/s;->g(Ljava/util/Comparator;)Lcom/google/common/collect/r;

    move-result-object p1

    iput-object p1, p0, Lcom/google/common/collect/s;->c:Lcom/google/common/collect/r;

    return-void
.end method

.method private static g(Ljava/util/Comparator;)Lcom/google/common/collect/r;
    .locals 0

    if-nez p0, :cond_0

    invoke-static {}, Lcom/google/common/collect/r;->b0()Lcom/google/common/collect/r;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/google/common/collect/t;->Z0(Ljava/util/Comparator;)Lcom/google/common/collect/L;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method static h(Ljava/util/Collection;Ljava/util/Comparator;)Lcom/google/common/collect/s;
    .locals 5

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/common/collect/s;->j()Lcom/google/common/collect/s;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lcom/google/common/collect/p$a;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v0, v1}, Lcom/google/common/collect/p$a;-><init>(I)V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v1, 0x0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-static {p1, v2}, Lcom/google/common/collect/s;->l(Ljava/util/Comparator;Ljava/util/Collection;)Lcom/google/common/collect/r;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v0, v3, v2}, Lcom/google/common/collect/p$a;->f(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/p$a;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_2
    new-instance p0, Lcom/google/common/collect/s;

    invoke-virtual {v0}, Lcom/google/common/collect/p$a;->c()Lcom/google/common/collect/p;

    move-result-object v0

    invoke-direct {p0, v0, v1, p1}, Lcom/google/common/collect/s;-><init>(Lcom/google/common/collect/p;ILjava/util/Comparator;)V

    return-object p0
.end method

.method public static j()Lcom/google/common/collect/s;
    .locals 1

    sget-object v0, Lcom/google/common/collect/l;->d:Lcom/google/common/collect/l;

    return-object v0
.end method

.method private static l(Ljava/util/Comparator;Ljava/util/Collection;)Lcom/google/common/collect/r;
    .locals 0

    if-nez p0, :cond_0

    invoke-static {p1}, Lcom/google/common/collect/r;->F(Ljava/util/Collection;)Lcom/google/common/collect/r;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, Lcom/google/common/collect/t;->W0(Ljava/util/Comparator;Ljava/util/Collection;)Lcom/google/common/collect/t;

    move-result-object p0

    :goto_0
    return-object p0
.end method
