.class final Lt5/h$c;
.super Ljava/util/AbstractSet;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt5/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lt5/h;


# direct methods
.method constructor <init>(Lt5/h;)V
    .locals 0

    iput-object p1, p0, Lt5/h$c;->a:Lt5/h;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    iget-object v0, p0, Lt5/h$c;->a:Lt5/h;

    invoke-virtual {v0}, Lt5/h;->clear()V

    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lt5/h$c;->a:Lt5/h;

    invoke-virtual {v0, p1}, Lt5/h;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lt5/h$c$a;

    invoke-direct {v0, p0}, Lt5/h$c$a;-><init>(Lt5/h$c;)V

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lt5/h$c;->a:Lt5/h;

    invoke-virtual {v0, p1}, Lt5/h;->p(Ljava/lang/Object;)Lt5/h$e;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lt5/h$c;->a:Lt5/h;

    iget v0, v0, Lt5/h;->d:I

    return v0
.end method
