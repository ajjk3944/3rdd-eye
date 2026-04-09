.class final Lcom/valentinilk/shimmer/ShimmerElement;
.super LE0/V;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LE0/V;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0082\u0008\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001d\"\u0004\u0008\u001e\u0010\u001fR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#\"\u0004\u0008$\u0010%\u00a8\u0006&"
    }
    d2 = {
        "Lcom/valentinilk/shimmer/ShimmerElement;",
        "LE0/V;",
        "Lcom/valentinilk/shimmer/d;",
        "LVf/c;",
        "area",
        "LVf/d;",
        "effect",
        "<init>",
        "(LVf/c;LVf/d;)V",
        "d",
        "()Lcom/valentinilk/shimmer/d;",
        "node",
        "LYg/J;",
        "e",
        "(Lcom/valentinilk/shimmer/d;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "LVf/c;",
        "getArea",
        "()LVf/c;",
        "setArea",
        "(LVf/c;)V",
        "b",
        "LVf/d;",
        "getEffect",
        "()LVf/d;",
        "setEffect",
        "(LVf/d;)V",
        "shimmer_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private a:LVf/c;

.field private b:LVf/d;


# direct methods
.method public constructor <init>(LVf/c;LVf/d;)V
    .locals 1

    const-string v0, "area"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "effect"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LE0/V;-><init>()V

    iput-object p1, p0, Lcom/valentinilk/shimmer/ShimmerElement;->a:LVf/c;

    iput-object p2, p0, Lcom/valentinilk/shimmer/ShimmerElement;->b:LVf/d;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Landroidx/compose/ui/e$c;
    .locals 1

    invoke-virtual {p0}, Lcom/valentinilk/shimmer/ShimmerElement;->d()Lcom/valentinilk/shimmer/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c(Landroidx/compose/ui/e$c;)V
    .locals 0

    check-cast p1, Lcom/valentinilk/shimmer/d;

    invoke-virtual {p0, p1}, Lcom/valentinilk/shimmer/ShimmerElement;->e(Lcom/valentinilk/shimmer/d;)V

    return-void
.end method

.method public d()Lcom/valentinilk/shimmer/d;
    .locals 3

    new-instance v0, Lcom/valentinilk/shimmer/d;

    iget-object v1, p0, Lcom/valentinilk/shimmer/ShimmerElement;->a:LVf/c;

    iget-object v2, p0, Lcom/valentinilk/shimmer/ShimmerElement;->b:LVf/d;

    invoke-direct {v0, v1, v2}, Lcom/valentinilk/shimmer/d;-><init>(LVf/c;LVf/d;)V

    return-object v0
.end method

.method public e(Lcom/valentinilk/shimmer/d;)V
    .locals 1

    const-string v0, "node"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/valentinilk/shimmer/ShimmerElement;->a:LVf/c;

    invoke-virtual {p1, v0}, Lcom/valentinilk/shimmer/d;->D2(LVf/c;)V

    iget-object v0, p0, Lcom/valentinilk/shimmer/ShimmerElement;->b:LVf/d;

    invoke-virtual {p1, v0}, Lcom/valentinilk/shimmer/d;->E2(LVf/d;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/valentinilk/shimmer/ShimmerElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/valentinilk/shimmer/ShimmerElement;

    iget-object v1, p0, Lcom/valentinilk/shimmer/ShimmerElement;->a:LVf/c;

    iget-object v3, p1, Lcom/valentinilk/shimmer/ShimmerElement;->a:LVf/c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/valentinilk/shimmer/ShimmerElement;->b:LVf/d;

    iget-object p1, p1, Lcom/valentinilk/shimmer/ShimmerElement;->b:LVf/d;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/valentinilk/shimmer/ShimmerElement;->a:LVf/c;

    invoke-virtual {v0}, LVf/c;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/valentinilk/shimmer/ShimmerElement;->b:LVf/d;

    invoke-virtual {v1}, LVf/d;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ShimmerElement(area="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/valentinilk/shimmer/ShimmerElement;->a:LVf/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", effect="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/valentinilk/shimmer/ShimmerElement;->b:LVf/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
