.class public abstract Lcom/google/common/collect/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# direct methods
.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/Comparator;)Lcom/google/common/collect/G;
    .locals 1

    instance-of v0, p0, Lcom/google/common/collect/G;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/google/common/collect/G;

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/common/collect/k;

    invoke-direct {v0, p0}, Lcom/google/common/collect/k;-><init>(Ljava/util/Comparator;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method

.method public static d()Lcom/google/common/collect/G;
    .locals 1

    sget-object v0, Lcom/google/common/collect/D;->a:Lcom/google/common/collect/D;

    return-object v0
.end method


# virtual methods
.method public c(Ljava/lang/Iterable;)Lcom/google/common/collect/o;
    .locals 0

    invoke-static {p0, p1}, Lcom/google/common/collect/o;->U0(Ljava/util/Comparator;Ljava/lang/Iterable;)Lcom/google/common/collect/o;

    move-result-object p1

    return-object p1
.end method

.method public abstract compare(Ljava/lang/Object;Ljava/lang/Object;)I
.end method

.method g()Lcom/google/common/collect/G;
    .locals 1

    invoke-static {}, Lcom/google/common/collect/z;->b()Lm4/c;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/common/collect/G;->h(Lm4/c;)Lcom/google/common/collect/G;

    move-result-object v0

    return-object v0
.end method

.method public h(Lm4/c;)Lcom/google/common/collect/G;
    .locals 1

    new-instance v0, Lcom/google/common/collect/f;

    invoke-direct {v0, p1, p0}, Lcom/google/common/collect/f;-><init>(Lm4/c;Lcom/google/common/collect/G;)V

    return-object v0
.end method
