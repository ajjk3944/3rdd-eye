.class public final Lf2/t$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lnh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf2/t;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private a:I

.field private b:Z

.field final synthetic c:Lf2/t;


# direct methods
.method constructor <init>(Lf2/t;)V
    .locals 0

    iput-object p1, p0, Lf2/t$b;->c:Lf2/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, -0x1

    iput p1, p0, Lf2/t$b;->a:I

    return-void
.end method


# virtual methods
.method public d()Lf2/r;
    .locals 3

    invoke-virtual {p0}, Lf2/t$b;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lf2/t$b;->b:Z

    iget-object v1, p0, Lf2/t$b;->c:Lf2/t;

    invoke-virtual {v1}, Lf2/t;->T()Lo/W;

    move-result-object v1

    iget v2, p0, Lf2/t$b;->a:I

    add-int/2addr v2, v0

    iput v2, p0, Lf2/t$b;->a:I

    invoke-virtual {v1, v2}, Lo/W;->q(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf2/r;

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public hasNext()Z
    .locals 3

    iget v0, p0, Lf2/t$b;->a:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iget-object v2, p0, Lf2/t$b;->c:Lf2/t;

    invoke-virtual {v2}, Lf2/t;->T()Lo/W;

    move-result-object v2

    invoke-virtual {v2}, Lo/W;->p()I

    move-result v2

    if-ge v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lf2/t$b;->d()Lf2/r;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 3

    iget-boolean v0, p0, Lf2/t$b;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lf2/t$b;->c:Lf2/t;

    invoke-virtual {v0}, Lf2/t;->T()Lo/W;

    move-result-object v0

    iget v1, p0, Lf2/t$b;->a:I

    invoke-virtual {v0, v1}, Lo/W;->q(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf2/r;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lf2/r;->H(Lf2/t;)V

    iget v1, p0, Lf2/t$b;->a:I

    invoke-virtual {v0, v1}, Lo/W;->n(I)V

    iget v0, p0, Lf2/t$b;->a:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lf2/t$b;->a:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lf2/t$b;->b:Z

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You must call next() before you can remove an element"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
