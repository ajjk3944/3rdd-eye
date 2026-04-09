.class public abstract Lah/d$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lah/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field private final a:Lah/d;

.field private b:I

.field private c:I

.field private d:I


# direct methods
.method public constructor <init>(Lah/d;)V
    .locals 1

    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lah/d$d;->a:Lah/d;

    const/4 v0, -0x1

    iput v0, p0, Lah/d$d;->c:I

    invoke-static {p1}, Lah/d;->n(Lah/d;)I

    move-result p1

    iput p1, p0, Lah/d$d;->d:I

    invoke-virtual {p0}, Lah/d$d;->h()V

    return-void
.end method


# virtual methods
.method public final d()V
    .locals 2

    iget-object v0, p0, Lah/d$d;->a:Lah/d;

    invoke-static {v0}, Lah/d;->n(Lah/d;)I

    move-result v0

    iget v1, p0, Lah/d$d;->d:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lah/d$d;->b:I

    return v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Lah/d$d;->c:I

    return v0
.end method

.method public final g()Lah/d;
    .locals 1

    iget-object v0, p0, Lah/d$d;->a:Lah/d;

    return-object v0
.end method

.method public final h()V
    .locals 2

    :goto_0
    iget v0, p0, Lah/d$d;->b:I

    iget-object v1, p0, Lah/d$d;->a:Lah/d;

    invoke-static {v1}, Lah/d;->j(Lah/d;)I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lah/d$d;->a:Lah/d;

    invoke-static {v0}, Lah/d;->p(Lah/d;)[I

    move-result-object v0

    iget v1, p0, Lah/d$d;->b:I

    aget v0, v0, v1

    if-gez v0, :cond_0

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lah/d$d;->b:I

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final hasNext()Z
    .locals 2

    iget v0, p0, Lah/d$d;->b:I

    iget-object v1, p0, Lah/d$d;->a:Lah/d;

    invoke-static {v1}, Lah/d;->j(Lah/d;)I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final i(I)V
    .locals 0

    iput p1, p0, Lah/d$d;->b:I

    return-void
.end method

.method public final j(I)V
    .locals 0

    iput p1, p0, Lah/d$d;->c:I

    return-void
.end method

.method public final remove()V
    .locals 3

    invoke-virtual {p0}, Lah/d$d;->d()V

    iget v0, p0, Lah/d$d;->c:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lah/d$d;->a:Lah/d;

    invoke-virtual {v0}, Lah/d;->B()V

    iget-object v0, p0, Lah/d$d;->a:Lah/d;

    iget v2, p0, Lah/d$d;->c:I

    invoke-static {v0, v2}, Lah/d;->s(Lah/d;I)V

    iput v1, p0, Lah/d$d;->c:I

    iget-object v0, p0, Lah/d$d;->a:Lah/d;

    invoke-static {v0}, Lah/d;->n(Lah/d;)I

    move-result v0

    iput v0, p0, Lah/d$d;->d:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Call next() before removing element from the iterator."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
