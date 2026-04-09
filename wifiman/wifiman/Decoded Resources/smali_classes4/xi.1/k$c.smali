.class Lxi/k$c;
.super Lxi/k$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxi/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field private final b:I

.field final synthetic c:Lxi/k;


# direct methods
.method public constructor <init>(Lxi/k;)V
    .locals 1

    iput-object p1, p0, Lxi/k$c;->c:Lxi/k;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lxi/k$d;-><init>(Lxi/k$a;)V

    invoke-static {p1}, Lxi/k;->e(Lxi/k;)I

    move-result p1

    iput p1, p0, Lxi/k$c;->b:I

    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    iget-object v0, p0, Lxi/k$c;->c:Lxi/k;

    invoke-static {v0}, Lxi/k;->g(Lxi/k;)I

    move-result v0

    iget v1, p0, Lxi/k$c;->b:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ModCount: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lxi/k$c;->c:Lxi/k;

    invoke-static {v2}, Lxi/k;->i(Lxi/k;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "; expected: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lxi/k$c;->b:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ConcurrentModificationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected c()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lxi/k$c;->c:Lxi/k;

    invoke-static {v0}, Lxi/k;->f(Lxi/k;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 1

    invoke-virtual {p0}, Lxi/k$c;->a()V

    iget-object v0, p0, Lxi/k$c;->c:Lxi/k;

    invoke-virtual {v0}, Lxi/k;->clear()V

    return-void
.end method
