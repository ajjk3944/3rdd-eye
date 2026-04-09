.class abstract LY6/p$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY6/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x400
    name = "f"
.end annotation


# instance fields
.field a:LY6/p$g;

.field b:LY6/p$g;

.field c:I

.field final synthetic d:LY6/p;


# direct methods
.method constructor <init>(LY6/p;)V
    .locals 1

    iput-object p1, p0, LY6/p$f;->d:LY6/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, LY6/p;->c:LY6/p$g;

    iget-object v0, v0, LY6/p$g;->d:LY6/p$g;

    iput-object v0, p0, LY6/p$f;->a:LY6/p$g;

    const/4 v0, 0x0

    iput-object v0, p0, LY6/p$f;->b:LY6/p$g;

    iget p1, p1, LY6/p;->e:I

    iput p1, p0, LY6/p$f;->c:I

    return-void
.end method


# virtual methods
.method final a()LY6/p$g;
    .locals 3

    iget-object v0, p0, LY6/p$f;->a:LY6/p$g;

    iget-object v1, p0, LY6/p$f;->d:LY6/p;

    iget-object v2, v1, LY6/p;->c:LY6/p$g;

    if-eq v0, v2, :cond_1

    iget v1, v1, LY6/p;->e:I

    iget v2, p0, LY6/p$f;->c:I

    if-ne v1, v2, :cond_0

    iget-object v1, v0, LY6/p$g;->d:LY6/p$g;

    iput-object v1, p0, LY6/p$f;->a:LY6/p$g;

    iput-object v0, p0, LY6/p$f;->b:LY6/p$g;

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

    iget-object v0, p0, LY6/p$f;->a:LY6/p$g;

    iget-object v1, p0, LY6/p$f;->d:LY6/p;

    iget-object v1, v1, LY6/p;->c:LY6/p$g;

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

    iget-object v0, p0, LY6/p$f;->b:LY6/p$g;

    if-eqz v0, :cond_0

    iget-object v1, p0, LY6/p$f;->d:LY6/p;

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, LY6/p;->r(LY6/p$g;Z)V

    const/4 v0, 0x0

    iput-object v0, p0, LY6/p$f;->b:LY6/p$g;

    iget-object v0, p0, LY6/p$f;->d:LY6/p;

    iget v0, v0, LY6/p;->e:I

    iput v0, p0, LY6/p$f;->c:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
