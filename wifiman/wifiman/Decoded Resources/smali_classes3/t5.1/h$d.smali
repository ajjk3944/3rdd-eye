.class abstract Lt5/h$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt5/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "d"
.end annotation


# instance fields
.field a:Lt5/h$e;

.field b:Lt5/h$e;

.field c:I

.field final synthetic d:Lt5/h;


# direct methods
.method constructor <init>(Lt5/h;)V
    .locals 1

    iput-object p1, p0, Lt5/h$d;->d:Lt5/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lt5/h;->f:Lt5/h$e;

    iget-object v0, v0, Lt5/h$e;->d:Lt5/h$e;

    iput-object v0, p0, Lt5/h$d;->a:Lt5/h$e;

    const/4 v0, 0x0

    iput-object v0, p0, Lt5/h$d;->b:Lt5/h$e;

    iget p1, p1, Lt5/h;->e:I

    iput p1, p0, Lt5/h$d;->c:I

    return-void
.end method


# virtual methods
.method final a()Lt5/h$e;
    .locals 3

    iget-object v0, p0, Lt5/h$d;->a:Lt5/h$e;

    iget-object v1, p0, Lt5/h$d;->d:Lt5/h;

    iget-object v2, v1, Lt5/h;->f:Lt5/h$e;

    if-eq v0, v2, :cond_1

    iget v1, v1, Lt5/h;->e:I

    iget v2, p0, Lt5/h$d;->c:I

    if-ne v1, v2, :cond_0

    iget-object v1, v0, Lt5/h$e;->d:Lt5/h$e;

    iput-object v1, p0, Lt5/h$d;->a:Lt5/h$e;

    iput-object v0, p0, Lt5/h$d;->b:Lt5/h$e;

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final hasNext()Z
    .locals 2

    iget-object v0, p0, Lt5/h$d;->a:Lt5/h$e;

    iget-object v1, p0, Lt5/h$d;->d:Lt5/h;

    iget-object v1, v1, Lt5/h;->f:Lt5/h$e;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final remove()V
    .locals 3

    iget-object v0, p0, Lt5/h$d;->b:Lt5/h$e;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lt5/h$d;->d:Lt5/h;

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lt5/h;->n(Lt5/h$e;Z)V

    const/4 v0, 0x0

    iput-object v0, p0, Lt5/h$d;->b:Lt5/h$e;

    iget-object v0, p0, Lt5/h$d;->d:Lt5/h;

    iget v0, v0, Lt5/h;->e:I

    iput v0, p0, Lt5/h$d;->c:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
