.class final LT/S;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lnh/a;


# instance fields
.field private final a:LT/b1;

.field private final b:I

.field private c:I

.field private final d:I


# direct methods
.method public constructor <init>(LT/b1;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT/S;->a:LT/b1;

    iput p3, p0, LT/S;->b:I

    iput p2, p0, LT/S;->c:I

    invoke-virtual {p1}, LT/b1;->z()I

    move-result p2

    iput p2, p0, LT/S;->d:I

    invoke-virtual {p1}, LT/b1;->A()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/util/ConcurrentModificationException;

    invoke-direct {p1}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw p1
.end method

.method private final e()V
    .locals 2

    iget-object v0, p0, LT/S;->a:LT/b1;

    invoke-virtual {v0}, LT/b1;->z()I

    move-result v0

    iget v1, p0, LT/S;->d:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method


# virtual methods
.method public d()Le0/b;
    .locals 4

    invoke-direct {p0}, LT/S;->e()V

    iget v0, p0, LT/S;->c:I

    iget-object v1, p0, LT/S;->a:LT/b1;

    invoke-virtual {v1}, LT/b1;->u()[I

    move-result-object v1

    invoke-static {v1, v0}, LT/d1;->h([II)I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, LT/S;->c:I

    new-instance v1, LT/c1;

    iget-object v2, p0, LT/S;->a:LT/b1;

    iget v3, p0, LT/S;->d:I

    invoke-direct {v1, v2, v0, v3}, LT/c1;-><init>(LT/b1;II)V

    return-object v1
.end method

.method public hasNext()Z
    .locals 2

    iget v0, p0, LT/S;->c:I

    iget v1, p0, LT/S;->b:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LT/S;->d()Le0/b;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
