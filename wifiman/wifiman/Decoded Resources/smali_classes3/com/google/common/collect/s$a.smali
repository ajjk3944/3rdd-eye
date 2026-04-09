.class public final Lcom/google/common/collect/s$a;
.super Lcom/google/common/collect/q$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/common/collect/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/common/collect/q$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/common/collect/s;
    .locals 2

    iget-object v0, p0, Lcom/google/common/collect/q$a;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, Lcom/google/common/collect/q$a;->b:Ljava/util/Comparator;

    if-eqz v1, :cond_0

    invoke-static {v1}, Lcom/google/common/collect/G;->a(Ljava/util/Comparator;)Lcom/google/common/collect/G;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/common/collect/G;->g()Lcom/google/common/collect/G;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/common/collect/G;->c(Ljava/lang/Iterable;)Lcom/google/common/collect/o;

    move-result-object v0

    :cond_0
    iget-object v1, p0, Lcom/google/common/collect/q$a;->c:Ljava/util/Comparator;

    invoke-static {v0, v1}, Lcom/google/common/collect/s;->h(Ljava/util/Collection;Ljava/util/Comparator;)Lcom/google/common/collect/s;

    move-result-object v0

    return-object v0
.end method
