.class Lt5/h$b;
.super Ljava/util/AbstractSet;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt5/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lt5/h;


# direct methods
.method constructor <init>(Lt5/h;)V
    .locals 0

    iput-object p1, p0, Lt5/h$b;->a:Lt5/h;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    iget-object v0, p0, Lt5/h$b;->a:Lt5/h;

    invoke-virtual {v0}, Lt5/h;->clear()V

    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Ljava/util/Map$Entry;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lt5/h$b;->a:Lt5/h;

    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {v0, p1}, Lt5/h;->h(Ljava/util/Map$Entry;)Lt5/h$e;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lt5/h$b$a;

    invoke-direct {v0, p0}, Lt5/h$b$a;-><init>(Lt5/h$b;)V

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lt5/h$b;->a:Lt5/h;

    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {v0, p1}, Lt5/h;->h(Ljava/util/Map$Entry;)Lt5/h$e;

    move-result-object p1

    if-nez p1, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Lt5/h$b;->a:Lt5/h;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lt5/h;->n(Lt5/h$e;Z)V

    return v1
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lt5/h$b;->a:Lt5/h;

    iget v0, v0, Lt5/h;->d:I

    return v0
.end method
