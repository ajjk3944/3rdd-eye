.class final Lqg/f$a;
.super Lyg/f;
.source "SourceFile"

# interfaces
.implements Lgg/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final i:LDj/b;

.field final j:[LDj/a;

.field final k:Z

.field final l:Ljava/util/concurrent/atomic/AtomicInteger;

.field m:I

.field n:Ljava/util/List;

.field o:J


# direct methods
.method constructor <init>([LDj/a;ZLDj/b;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lyg/f;-><init>(Z)V

    iput-object p3, p0, Lqg/f$a;->i:LDj/b;

    iput-object p1, p0, Lqg/f$a;->j:[LDj/a;

    iput-boolean p2, p0, Lqg/f$a;->k:Z

    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Lqg/f$a;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 9

    iget-object v0, p0, Lqg/f$a;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lqg/f$a;->j:[LDj/a;

    array-length v1, v0

    iget v2, p0, Lqg/f$a;->m:I

    :cond_0
    :goto_0
    const/4 v3, 0x1

    if-ne v2, v1, :cond_3

    iget-object v0, p0, Lqg/f$a;->n:Ljava/util/List;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Lqg/f$a;->i:LDj/b;

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    invoke-interface {v1, v0}, LDj/b;->onError(Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lqg/f$a;->i:LDj/b;

    new-instance v2, Lio/reactivex/rxjava3/exceptions/CompositeException;

    invoke-direct {v2, v0}, Lio/reactivex/rxjava3/exceptions/CompositeException;-><init>(Ljava/lang/Iterable;)V

    invoke-interface {v1, v2}, LDj/b;->onError(Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lqg/f$a;->i:LDj/b;

    invoke-interface {v0}, LDj/b;->a()V

    :goto_1
    return-void

    :cond_3
    aget-object v4, v0, v2

    if-nez v4, :cond_6

    new-instance v4, Ljava/lang/NullPointerException;

    const-string v5, "A Publisher entry is null"

    invoke-direct {v4, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    iget-boolean v5, p0, Lqg/f$a;->k:Z

    if-eqz v5, :cond_5

    iget-object v5, p0, Lqg/f$a;->n:Ljava/util/List;

    if-nez v5, :cond_4

    new-instance v5, Ljava/util/ArrayList;

    sub-int v6, v1, v2

    add-int/2addr v6, v3

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v5, p0, Lqg/f$a;->n:Ljava/util/List;

    :cond_4
    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lqg/f$a;->i:LDj/b;

    invoke-interface {v0, v4}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_6
    iget-wide v5, p0, Lqg/f$a;->o:J

    const-wide/16 v7, 0x0

    cmp-long v3, v5, v7

    if-eqz v3, :cond_7

    iput-wide v7, p0, Lqg/f$a;->o:J

    invoke-virtual {p0, v5, v6}, Lyg/f;->p(J)V

    :cond_7
    invoke-interface {v4, p0}, LDj/a;->b(LDj/b;)V

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lqg/f$a;->m:I

    iget-object v3, p0, Lqg/f$a;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v3

    if-nez v3, :cond_0

    :cond_8
    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 4

    iget-wide v0, p0, Lqg/f$a;->o:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lqg/f$a;->o:J

    iget-object v0, p0, Lqg/f$a;->i:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public j(LDj/c;)V
    .locals 0

    invoke-virtual {p0, p1}, Lyg/f;->r(LDj/c;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 3

    iget-boolean v0, p0, Lqg/f$a;->k:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lqg/f$a;->n:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lqg/f$a;->j:[LDj/a;

    array-length v1, v1

    iget v2, p0, Lqg/f$a;->m:I

    sub-int/2addr v1, v2

    add-int/lit8 v1, v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lqg/f$a;->n:Ljava/util/List;

    :cond_0
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lqg/f$a;->a()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lqg/f$a;->i:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
