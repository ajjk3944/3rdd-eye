.class public abstract Lag/d$a;
.super Lag/h;
.source "SourceFile"

# interfaces
.implements Lag/d$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lag/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "a"
.end annotation


# instance fields
.field private g:Lag/a;

.field private h:Ljava/util/Iterator;

.field private i:Lag/a;

.field private j:Lag/a;

.field protected final k:Lag/d$d;

.field private l:Z

.field private final m:Z

.field private n:Ljava/util/function/Function;

.field private o:Ljava/util/function/Predicate;

.field private final p:Ljava/util/function/ToLongFunction;

.field private q:J

.field private r:Ljava/math/BigInteger;

.field final s:Ljava/util/function/Predicate;


# direct methods
.method protected constructor <init>(Lag/a;Ljava/util/function/Predicate;Lag/d$d;Ljava/util/function/Function;Ljava/util/function/Predicate;Ljava/util/function/ToLongFunction;)V
    .locals 9

    const/4 v4, 0x1

    const/4 v5, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v6, p4

    move-object v7, p5

    move-object v8, p6

    .line 1
    invoke-direct/range {v0 .. v8}, Lag/d$a;-><init>(Lag/a;Ljava/util/function/Predicate;Lag/d$d;ZZLjava/util/function/Function;Ljava/util/function/Predicate;Ljava/util/function/ToLongFunction;)V

    .line 2
    invoke-virtual {p0}, Lag/d$a;->p()V

    return-void
.end method

.method protected constructor <init>(Lag/a;Ljava/util/function/Predicate;Lag/d$d;ZZLjava/util/function/Function;Ljava/util/function/Predicate;Ljava/util/function/ToLongFunction;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lag/h;-><init>()V

    .line 4
    iput-object p1, p0, Lag/d$a;->g:Lag/a;

    .line 5
    iput-object p3, p0, Lag/d$a;->k:Lag/d$d;

    .line 6
    iput-boolean p4, p0, Lag/d$a;->l:Z

    .line 7
    iput-boolean p5, p0, Lag/d$a;->m:Z

    .line 8
    iput-object p8, p0, Lag/d$a;->p:Ljava/util/function/ToLongFunction;

    .line 9
    iput-object p6, p0, Lag/d$a;->n:Ljava/util/function/Function;

    .line 10
    iput-object p7, p0, Lag/d$a;->o:Ljava/util/function/Predicate;

    .line 11
    iput-object p2, p0, Lag/d$a;->s:Ljava/util/function/Predicate;

    .line 12
    invoke-virtual {p0}, Lag/d$a;->p()V

    return-void
.end method

.method private h()Ljava/math/BigInteger;
    .locals 2

    invoke-direct {p0}, Lag/d$a;->j()Ljava/math/BigInteger;

    move-result-object v0

    iget-object v1, p0, Lag/h;->d:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method

.method private i()J
    .locals 4

    invoke-direct {p0}, Lag/d$a;->k()J

    move-result-wide v0

    iget-wide v2, p0, Lag/m;->a:J

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method private j()Ljava/math/BigInteger;
    .locals 2

    iget-object v0, p0, Lag/d$a;->r:Ljava/math/BigInteger;

    if-nez v0, :cond_0

    iget-object v0, p0, Lag/d$a;->n:Ljava/util/function/Function;

    iget-object v1, p0, Lag/d$a;->g:Lag/a;

    invoke-interface {v0, v1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/math/BigInteger;

    iput-object v0, p0, Lag/d$a;->r:Ljava/math/BigInteger;

    :cond_0
    return-object v0
.end method

.method private k()J
    .locals 4

    iget-wide v0, p0, Lag/d$a;->q:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-gez v2, :cond_0

    iget-object v0, p0, Lag/d$a;->p:Ljava/util/function/ToLongFunction;

    iget-object v1, p0, Lag/d$a;->g:Lag/a;

    invoke-interface {v0, v1}, Ljava/util/function/ToLongFunction;->applyAsLong(Ljava/lang/Object;)J

    move-result-wide v0

    iput-wide v0, p0, Lag/d$a;->q:J

    :cond_0
    return-wide v0
.end method

.method private l()Ljava/util/Iterator;
    .locals 4

    iget-object v0, p0, Lag/d$a;->h:Ljava/util/Iterator;

    if-nez v0, :cond_0

    iget-object v0, p0, Lag/d$a;->k:Lag/d$d;

    iget-boolean v1, p0, Lag/d$a;->l:Z

    iget-boolean v2, p0, Lag/d$a;->m:Z

    iget-object v3, p0, Lag/d$a;->g:Lag/a;

    invoke-interface {v0, v1, v2, v3}, Lag/d$d;->a(ZZLjava/lang/Object;)Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Lag/d$a;->h:Ljava/util/Iterator;

    :cond_0
    iget-object v0, p0, Lag/d$a;->h:Ljava/util/Iterator;

    return-object v0
.end method


# virtual methods
.method public a()Lag/a;
    .locals 1

    .line 2
    iget-object v0, p0, Lag/d$a;->g:Lag/a;

    return-object v0
.end method

.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lag/d$a;->a()Lag/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lag/a;

    check-cast p2, Lag/a;

    invoke-virtual {p0, p1, p2}, Lag/d$a;->m(Lag/a;Lag/a;)V

    return-void
.end method

.method public characteristics()I
    .locals 1

    iget-boolean v0, p0, Lag/h;->c:Z

    if-eqz v0, :cond_0

    const/16 v0, 0x1115

    return v0

    :cond_0
    invoke-super {p0}, Lag/m;->characteristics()I

    move-result v0

    return v0
.end method

.method public estimateSize()J
    .locals 2

    iget-boolean v0, p0, Lag/h;->c:Z

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lag/d$a;->h()Ljava/math/BigInteger;

    move-result-object v0

    sget-object v1, Lag/d;->i:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v0

    if-gtz v0, :cond_0

    invoke-direct {p0}, Lag/d$a;->h()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide v0, 0x7fffffffffffffffL

    return-wide v0

    :cond_1
    invoke-direct {p0}, Lag/d$a;->i()J

    move-result-wide v0

    return-wide v0
.end method

.method protected f()Z
    .locals 7

    iget-boolean v0, p0, Lag/m;->b:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p0, Lag/h;->c:Z

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lag/h;->d:Ljava/math/BigInteger;

    invoke-direct {p0}, Lag/d$a;->j()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v0

    if-gez v0, :cond_2

    :goto_0
    move v1, v2

    goto :goto_1

    :cond_1
    iget-wide v3, p0, Lag/m;->a:J

    invoke-direct {p0}, Lag/d$a;->k()J

    move-result-wide v5

    shr-long/2addr v5, v2

    cmp-long v0, v3, v5

    if-gez v0, :cond_2

    goto :goto_0

    :cond_2
    :goto_1
    return v1
.end method

.method public forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 4

    iget-boolean v0, p0, Lag/m;->b:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lag/m;->b:Z

    const/4 v0, 0x0

    :try_start_0
    iget-boolean v1, p0, Lag/h;->c:Z

    if-eqz v1, :cond_1

    invoke-direct {p0}, Lag/d$a;->l()Ljava/util/Iterator;

    move-result-object v1

    invoke-direct {p0}, Lag/d$a;->j()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {p0, v1, p1, v2}, Lag/h;->e(Ljava/util/Iterator;Ljava/util/function/Consumer;Ljava/math/BigInteger;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    invoke-direct {p0}, Lag/d$a;->l()Ljava/util/Iterator;

    move-result-object v1

    invoke-direct {p0}, Lag/d$a;->k()J

    move-result-wide v2

    invoke-virtual {p0, v1, p1, v2, v3}, Lag/m;->c(Ljava/util/Iterator;Ljava/util/function/Consumer;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    iput-boolean v0, p0, Lag/m;->b:Z

    return-void

    :goto_1
    iput-boolean v0, p0, Lag/m;->b:Z

    throw p1
.end method

.method protected abstract g(Lag/a;ZLjava/util/function/Function;Ljava/util/function/Predicate;Ljava/util/function/ToLongFunction;)Lag/d$a;
.end method

.method public m(Lag/a;Lag/a;)V
    .locals 0

    iput-object p1, p0, Lag/d$a;->i:Lag/a;

    iput-object p2, p0, Lag/d$a;->j:Lag/a;

    return-void
.end method

.method protected n()Z
    .locals 1

    iget-object v0, p0, Lag/d$a;->s:Ljava/util/function/Predicate;

    invoke-interface {v0, p0}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public o()Lag/d$a;
    .locals 14

    invoke-virtual {p0}, Lag/d$a;->f()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_9

    invoke-virtual {p0}, Lag/d$a;->n()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-boolean v0, p0, Lag/h;->c:Z

    const-wide/16 v2, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lag/h;->d:Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/math/BigInteger;->signum()I

    move-result v0

    if-lez v0, :cond_1

    goto :goto_0

    :cond_1
    move v4, v5

    goto :goto_0

    :cond_2
    iget-wide v6, p0, Lag/m;->a:J

    cmp-long v0, v6, v2

    if-lez v0, :cond_1

    :goto_0
    const-wide/16 v6, -0x1

    if-eqz v4, :cond_4

    iget-boolean v0, p0, Lag/h;->c:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lag/d$a;->n:Ljava/util/function/Function;

    iget-object v8, p0, Lag/d$a;->i:Lag/a;

    invoke-interface {v0, v8}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/math/BigInteger;

    iget-object v8, p0, Lag/h;->d:Ljava/math/BigInteger;

    invoke-virtual {v8, v0}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v8

    if-ltz v8, :cond_5

    return-object v1

    :cond_3
    iget-object v0, p0, Lag/d$a;->p:Ljava/util/function/ToLongFunction;

    iget-object v6, p0, Lag/d$a;->i:Lag/a;

    invoke-interface {v0, v6}, Ljava/util/function/ToLongFunction;->applyAsLong(Ljava/lang/Object;)J

    move-result-wide v6

    iget-wide v8, p0, Lag/m;->a:J

    cmp-long v0, v8, v6

    if-ltz v0, :cond_4

    return-object v1

    :cond_4
    move-object v0, v1

    :cond_5
    iget-object v9, p0, Lag/d$a;->i:Lag/a;

    iget-boolean v10, p0, Lag/d$a;->l:Z

    iget-object v11, p0, Lag/d$a;->n:Ljava/util/function/Function;

    iget-object v12, p0, Lag/d$a;->o:Ljava/util/function/Predicate;

    iget-object v13, p0, Lag/d$a;->p:Ljava/util/function/ToLongFunction;

    move-object v8, p0

    invoke-virtual/range {v8 .. v13}, Lag/d$a;->g(Lag/a;ZLjava/util/function/Function;Ljava/util/function/Predicate;Ljava/util/function/ToLongFunction;)Lag/d$a;

    move-result-object v8

    if-eqz v4, :cond_8

    iget-boolean v4, p0, Lag/h;->c:Z

    if-eqz v4, :cond_7

    iget-boolean v2, v8, Lag/h;->c:Z

    if-eqz v2, :cond_6

    iget-object v2, p0, Lag/h;->d:Ljava/math/BigInteger;

    iput-object v2, v8, Lag/h;->d:Ljava/math/BigInteger;

    goto :goto_1

    :cond_6
    iget-object v2, p0, Lag/h;->d:Ljava/math/BigInteger;

    invoke-virtual {v2}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v2

    iput-wide v2, v8, Lag/m;->a:J

    :goto_1
    sget-object v2, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    iput-object v2, p0, Lag/h;->d:Ljava/math/BigInteger;

    goto :goto_2

    :cond_7
    iget-wide v9, p0, Lag/m;->a:J

    iput-wide v9, v8, Lag/m;->a:J

    iput-wide v2, p0, Lag/m;->a:J

    :goto_2
    iget-object v2, p0, Lag/d$a;->h:Ljava/util/Iterator;

    iput-object v2, v8, Lag/d$a;->h:Ljava/util/Iterator;

    iput-object v1, p0, Lag/d$a;->h:Ljava/util/Iterator;

    iput-object v0, v8, Lag/d$a;->r:Ljava/math/BigInteger;

    iput-wide v6, v8, Lag/d$a;->q:J

    :cond_8
    iget-object v0, p0, Lag/d$a;->j:Lag/a;

    iput-object v0, p0, Lag/d$a;->g:Lag/a;

    iput-boolean v5, p0, Lag/d$a;->l:Z

    invoke-virtual {p0}, Lag/d$a;->p()V

    return-object v8

    :cond_9
    :goto_3
    return-object v1
.end method

.method p()V
    .locals 4

    iget-object v0, p0, Lag/d$a;->n:Ljava/util/function/Function;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lag/d$a;->o:Ljava/util/function/Predicate;

    if-eqz v0, :cond_0

    iget-object v3, p0, Lag/d$a;->g:Lag/a;

    invoke-interface {v0, v3}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v1, 0x1

    :cond_1
    iput-boolean v1, p0, Lag/h;->c:Z

    if-nez v1, :cond_3

    iput-object v2, p0, Lag/d$a;->n:Ljava/util/function/Function;

    iput-object v2, p0, Lag/d$a;->o:Ljava/util/function/Predicate;

    goto :goto_0

    :cond_2
    iput-boolean v1, p0, Lag/h;->c:Z

    :cond_3
    :goto_0
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lag/d$a;->q:J

    iput-object v2, p0, Lag/d$a;->r:Ljava/math/BigInteger;

    return-void
.end method

.method public tryAdvance(Ljava/util/function/Consumer;)Z
    .locals 6

    iget-boolean v0, p0, Lag/m;->b:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p0, Lag/h;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lag/h;->d:Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/math/BigInteger;->signum()I

    move-result v0

    if-lez v0, :cond_2

    iget-object v0, p0, Lag/h;->d:Ljava/math/BigInteger;

    invoke-direct {p0}, Lag/d$a;->j()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v0

    if-gez v0, :cond_3

    goto :goto_0

    :cond_1
    iget-wide v2, p0, Lag/m;->a:J

    invoke-direct {p0}, Lag/d$a;->k()J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-gez v0, :cond_3

    :cond_2
    :goto_0
    invoke-direct {p0}, Lag/d$a;->l()Ljava/util/Iterator;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lag/h;->d(Ljava/util/Iterator;Ljava/util/function/Consumer;)Z

    move-result p1

    return p1

    :cond_3
    return v1
.end method

.method public bridge synthetic trySplit()Ljava/util/Spliterator;
    .locals 1

    invoke-virtual {p0}, Lag/d$a;->o()Lag/d$a;

    move-result-object v0

    return-object v0
.end method
