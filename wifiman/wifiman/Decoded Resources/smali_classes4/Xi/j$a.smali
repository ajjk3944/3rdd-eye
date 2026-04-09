.class public final LXi/j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lnh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LXi/j;->a(LXi/f;)Ljava/lang/Iterable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private a:I

.field final synthetic b:LXi/f;


# direct methods
.method constructor <init>(LXi/f;)V
    .locals 0

    iput-object p1, p0, LXi/j$a;->b:LXi/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, LXi/f;->e()I

    move-result p1

    iput p1, p0, LXi/j$a;->a:I

    return-void
.end method


# virtual methods
.method public d()LXi/f;
    .locals 4

    iget-object v0, p0, LXi/j$a;->b:LXi/f;

    invoke-interface {v0}, LXi/f;->e()I

    move-result v1

    iget v2, p0, LXi/j$a;->a:I

    add-int/lit8 v3, v2, -0x1

    iput v3, p0, LXi/j$a;->a:I

    sub-int/2addr v1, v2

    invoke-interface {v0, v1}, LXi/f;->i(I)LXi/f;

    move-result-object v0

    return-object v0
.end method

.method public hasNext()Z
    .locals 1

    iget v0, p0, LXi/j$a;->a:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LXi/j$a;->d()LXi/f;

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
