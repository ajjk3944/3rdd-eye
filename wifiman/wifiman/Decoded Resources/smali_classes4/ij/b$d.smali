.class public abstract Lij/b$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lij/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40c
    name = "d"
.end annotation


# instance fields
.field protected final a:Lij/b;

.field protected b:Lij/b$c;

.field protected c:Lij/b$c;

.field protected d:I


# direct methods
.method protected constructor <init>(Lij/b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lij/b$d;->a:Lij/b;

    iget-object v0, p1, Lij/b;->j:Lij/b$c;

    iget-object v0, v0, Lij/b$c;->f:Lij/b$c;

    iput-object v0, p0, Lij/b$d;->c:Lij/b$c;

    iget p1, p1, Lij/a;->e:I

    iput p1, p0, Lij/b$d;->d:I

    return-void
.end method


# virtual methods
.method protected a()Lij/b$c;
    .locals 1

    iget-object v0, p0, Lij/b$d;->b:Lij/b$c;

    return-object v0
.end method

.method protected c()Lij/b$c;
    .locals 3

    iget-object v0, p0, Lij/b$d;->a:Lij/b;

    iget v1, v0, Lij/a;->e:I

    iget v2, p0, Lij/b$d;->d:I

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lij/b$d;->c:Lij/b$c;

    iget-object v0, v0, Lij/b;->j:Lij/b$c;

    if-eq v1, v0, :cond_0

    iput-object v1, p0, Lij/b$d;->b:Lij/b$c;

    iget-object v0, v1, Lij/b$c;->f:Lij/b$c;

    iput-object v0, p0, Lij/b$d;->c:Lij/b$c;

    return-object v1

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "No next() entry in the iteration"

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method

.method public hasNext()Z
    .locals 2

    iget-object v0, p0, Lij/b$d;->c:Lij/b$c;

    iget-object v1, p0, Lij/b$d;->a:Lij/b;

    iget-object v1, v1, Lij/b;->j:Lij/b$c;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public remove()V
    .locals 4

    iget-object v0, p0, Lij/b$d;->b:Lij/b$c;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lij/b$d;->a:Lij/b;

    iget v2, v1, Lij/a;->e:I

    iget v3, p0, Lij/b$d;->d:I

    if-ne v2, v3, :cond_0

    invoke-virtual {v0}, Lij/a$b;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Lij/a;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, Lij/b$d;->b:Lij/b$c;

    iget-object v0, p0, Lij/b$d;->a:Lij/b;

    iget v0, v0, Lij/a;->e:I

    iput v0, p0, Lij/b$d;->d:I

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "remove() can only be called once after next()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lij/b$d;->b:Lij/b$c;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Iterator["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lij/b$d;->b:Lij/b$c;

    invoke-virtual {v1}, Lij/a$b;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lij/b$d;->b:Lij/b$c;

    invoke-virtual {v1}, Lij/a$b;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "Iterator[]"

    return-object v0
.end method
