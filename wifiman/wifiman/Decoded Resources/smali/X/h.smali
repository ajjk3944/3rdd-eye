.class public final LX/h;
.super LX/a;
.source "SourceFile"

# interfaces
.implements Ljava/util/ListIterator;
.implements Lnh/a;


# instance fields
.field private final c:LX/f;

.field private d:I

.field private e:LX/k;

.field private f:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LX/f;I)V
    .locals 1

    invoke-virtual {p1}, LZg/h;->size()I

    move-result v0

    invoke-direct {p0, p2, v0}, LX/a;-><init>(II)V

    iput-object p1, p0, LX/h;->c:LX/f;

    invoke-virtual {p1}, LX/f;->y()I

    move-result p1

    iput p1, p0, LX/h;->d:I

    const/4 p1, -0x1

    iput p1, p0, LX/h;->f:I

    invoke-direct {p0}, LX/h;->p()V

    return-void
.end method

.method private final j()V
    .locals 2

    iget v0, p0, LX/h;->d:I

    iget-object v1, p0, LX/h;->c:LX/f;

    invoke-virtual {v1}, LX/f;->y()I

    move-result v1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method

.method private final k()V
    .locals 2

    iget v0, p0, LX/h;->f:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method private final n()V
    .locals 1

    iget-object v0, p0, LX/h;->c:LX/f;

    invoke-virtual {v0}, LZg/h;->size()I

    move-result v0

    invoke-virtual {p0, v0}, LX/a;->i(I)V

    iget-object v0, p0, LX/h;->c:LX/f;

    invoke-virtual {v0}, LX/f;->y()I

    move-result v0

    iput v0, p0, LX/h;->d:I

    const/4 v0, -0x1

    iput v0, p0, LX/h;->f:I

    invoke-direct {p0}, LX/h;->p()V

    return-void
.end method

.method private final p()V
    .locals 5

    iget-object v0, p0, LX/h;->c:LX/f;

    invoke-virtual {v0}, LX/f;->C()[Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, LX/h;->e:LX/k;

    return-void

    :cond_0
    iget-object v1, p0, LX/h;->c:LX/f;

    invoke-virtual {v1}, LZg/h;->size()I

    move-result v1

    invoke-static {v1}, LX/l;->d(I)I

    move-result v1

    invoke-virtual {p0}, LX/a;->f()I

    move-result v2

    invoke-static {v2, v1}, Lsh/m;->g(II)I

    move-result v2

    iget-object v3, p0, LX/h;->c:LX/f;

    invoke-virtual {v3}, LX/f;->J()I

    move-result v3

    div-int/lit8 v3, v3, 0x5

    add-int/lit8 v3, v3, 0x1

    iget-object v4, p0, LX/h;->e:LX/k;

    if-nez v4, :cond_1

    new-instance v4, LX/k;

    invoke-direct {v4, v0, v2, v1, v3}, LX/k;-><init>([Ljava/lang/Object;III)V

    iput-object v4, p0, LX/h;->e:LX/k;

    goto :goto_0

    :cond_1
    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v4, v0, v2, v1, v3}, LX/k;->p([Ljava/lang/Object;III)V

    :goto_0
    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;)V
    .locals 2

    invoke-direct {p0}, LX/h;->j()V

    iget-object v0, p0, LX/h;->c:LX/f;

    invoke-virtual {p0}, LX/a;->f()I

    move-result v1

    invoke-virtual {v0, v1, p1}, LX/f;->add(ILjava/lang/Object;)V

    invoke-virtual {p0}, LX/a;->f()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, LX/a;->h(I)V

    invoke-direct {p0}, LX/h;->n()V

    return-void
.end method

.method public next()Ljava/lang/Object;
    .locals 4

    invoke-direct {p0}, LX/h;->j()V

    invoke-virtual {p0}, LX/a;->d()V

    invoke-virtual {p0}, LX/a;->f()I

    move-result v0

    iput v0, p0, LX/h;->f:I

    iget-object v0, p0, LX/h;->e:LX/k;

    if-nez v0, :cond_0

    iget-object v0, p0, LX/h;->c:LX/f;

    invoke-virtual {v0}, LX/f;->S()[Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, LX/a;->f()I

    move-result v1

    add-int/lit8 v2, v1, 0x1

    invoke-virtual {p0, v2}, LX/a;->h(I)V

    aget-object v0, v0, v1

    return-object v0

    :cond_0
    invoke-virtual {v0}, LX/a;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, LX/a;->f()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {p0, v1}, LX/a;->h(I)V

    invoke-virtual {v0}, LX/k;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v1, p0, LX/h;->c:LX/f;

    invoke-virtual {v1}, LX/f;->S()[Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0}, LX/a;->f()I

    move-result v2

    add-int/lit8 v3, v2, 0x1

    invoke-virtual {p0, v3}, LX/a;->h(I)V

    invoke-virtual {v0}, LX/a;->g()I

    move-result v0

    sub-int/2addr v2, v0

    aget-object v0, v1, v2

    return-object v0
.end method

.method public previous()Ljava/lang/Object;
    .locals 3

    invoke-direct {p0}, LX/h;->j()V

    invoke-virtual {p0}, LX/a;->e()V

    invoke-virtual {p0}, LX/a;->f()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LX/h;->f:I

    iget-object v0, p0, LX/h;->e:LX/k;

    if-nez v0, :cond_0

    iget-object v0, p0, LX/h;->c:LX/f;

    invoke-virtual {v0}, LX/f;->S()[Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, LX/a;->f()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v1}, LX/a;->h(I)V

    invoke-virtual {p0}, LX/a;->f()I

    move-result v1

    aget-object v0, v0, v1

    return-object v0

    :cond_0
    invoke-virtual {p0}, LX/a;->f()I

    move-result v1

    invoke-virtual {v0}, LX/a;->g()I

    move-result v2

    if-le v1, v2, :cond_1

    iget-object v1, p0, LX/h;->c:LX/f;

    invoke-virtual {v1}, LX/f;->S()[Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0}, LX/a;->f()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {p0, v2}, LX/a;->h(I)V

    invoke-virtual {p0}, LX/a;->f()I

    move-result v2

    invoke-virtual {v0}, LX/a;->g()I

    move-result v0

    sub-int/2addr v2, v0

    aget-object v0, v1, v2

    return-object v0

    :cond_1
    invoke-virtual {p0}, LX/a;->f()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v1}, LX/a;->h(I)V

    invoke-virtual {v0}, LX/k;->previous()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 2

    invoke-direct {p0}, LX/h;->j()V

    invoke-direct {p0}, LX/h;->k()V

    iget-object v0, p0, LX/h;->c:LX/f;

    iget v1, p0, LX/h;->f:I

    invoke-virtual {v0, v1}, LZg/h;->remove(I)Ljava/lang/Object;

    iget v0, p0, LX/h;->f:I

    invoke-virtual {p0}, LX/a;->f()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget v0, p0, LX/h;->f:I

    invoke-virtual {p0, v0}, LX/a;->h(I)V

    :cond_0
    invoke-direct {p0}, LX/h;->n()V

    return-void
.end method

.method public set(Ljava/lang/Object;)V
    .locals 2

    invoke-direct {p0}, LX/h;->j()V

    invoke-direct {p0}, LX/h;->k()V

    iget-object v0, p0, LX/h;->c:LX/f;

    iget v1, p0, LX/h;->f:I

    invoke-virtual {v0, v1, p1}, LX/f;->set(ILjava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, LX/h;->c:LX/f;

    invoke-virtual {p1}, LX/f;->y()I

    move-result p1

    iput p1, p0, LX/h;->d:I

    invoke-direct {p0}, LX/h;->p()V

    return-void
.end method
