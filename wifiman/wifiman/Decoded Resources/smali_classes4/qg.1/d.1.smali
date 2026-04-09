.class public final Lqg/d;
.super Lqg/b;
.source "SourceFile"

# interfaces
.implements Lgg/l;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/d$b;,
        Lqg/d$a;
    }
.end annotation


# static fields
.field static final l:[Lqg/d$a;

.field static final m:[Lqg/d$a;


# instance fields
.field final c:Ljava/util/concurrent/atomic/AtomicBoolean;

.field final d:I

.field final e:Ljava/util/concurrent/atomic/AtomicReference;

.field volatile f:J

.field final g:Lqg/d$b;

.field h:Lqg/d$b;

.field i:I

.field j:Ljava/lang/Throwable;

.field volatile k:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v1, v0, [Lqg/d$a;

    sput-object v1, Lqg/d;->l:[Lqg/d$a;

    new-array v0, v0, [Lqg/d$a;

    sput-object v0, Lqg/d;->m:[Lqg/d$a;

    return-void
.end method

.method public constructor <init>(Lgg/i;I)V
    .locals 0

    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    iput p2, p0, Lqg/d;->d:I

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object p1, p0, Lqg/d;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p1, Lqg/d$b;

    invoke-direct {p1, p2}, Lqg/d$b;-><init>(I)V

    iput-object p1, p0, Lqg/d;->g:Lqg/d$b;

    iput-object p1, p0, Lqg/d;->h:Lqg/d$b;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object p2, Lqg/d;->l:[Lqg/d$a;

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lqg/d;->e:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 3

    new-instance v0, Lqg/d$a;

    invoke-direct {v0, p1, p0}, Lqg/d$a;-><init>(LDj/b;Lqg/d;)V

    invoke-interface {p1, v0}, LDj/b;->j(LDj/c;)V

    invoke-virtual {p0, v0}, Lqg/d;->h2(Lqg/d$a;)V

    iget-object p1, p0, Lqg/d;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lqg/d;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {p1, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lqg/b;->b:Lgg/i;

    invoke-virtual {p1, p0}, Lgg/i;->D1(Lgg/l;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Lqg/d;->j2(Lqg/d$a;)V

    :goto_0
    return-void
.end method

.method public a()V
    .locals 4

    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/d;->k:Z

    iget-object v0, p0, Lqg/d;->e:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lqg/d;->m:[Lqg/d$a;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lqg/d$a;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {p0, v3}, Lqg/d;->j2(Lqg/d$a;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 5

    iget v0, p0, Lqg/d;->i:I

    iget v1, p0, Lqg/d;->d:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    new-instance v1, Lqg/d$b;

    invoke-direct {v1, v0}, Lqg/d$b;-><init>(I)V

    iget-object v0, v1, Lqg/d$b;->a:[Ljava/lang/Object;

    aput-object p1, v0, v2

    iput v3, p0, Lqg/d;->i:I

    iget-object p1, p0, Lqg/d;->h:Lqg/d$b;

    iput-object v1, p1, Lqg/d$b;->b:Lqg/d$b;

    iput-object v1, p0, Lqg/d;->h:Lqg/d$b;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lqg/d;->h:Lqg/d$b;

    iget-object v1, v1, Lqg/d$b;->a:[Ljava/lang/Object;

    aput-object p1, v1, v0

    add-int/2addr v0, v3

    iput v0, p0, Lqg/d;->i:I

    :goto_0
    iget-wide v0, p0, Lqg/d;->f:J

    const-wide/16 v3, 0x1

    add-long/2addr v0, v3

    iput-wide v0, p0, Lqg/d;->f:J

    iget-object p1, p0, Lqg/d;->e:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lqg/d$a;

    array-length v0, p1

    :goto_1
    if-ge v2, v0, :cond_1

    aget-object v1, p1, v2

    invoke-virtual {p0, v1}, Lqg/d;->j2(Lqg/d$a;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method h2(Lqg/d$a;)V
    .locals 4

    :cond_0
    iget-object v0, p0, Lqg/d;->e:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lqg/d$a;

    sget-object v1, Lqg/d;->m:[Lqg/d$a;

    if-ne v0, v1, :cond_1

    return-void

    :cond_1
    array-length v1, v0

    add-int/lit8 v2, v1, 0x1

    new-array v2, v2, [Lqg/d$a;

    const/4 v3, 0x0

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aput-object p1, v2, v1

    iget-object v1, p0, Lqg/d;->e:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v1, v0, v2}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method

.method i2(Lqg/d$a;)V
    .locals 6

    :cond_0
    iget-object v0, p0, Lqg/d;->e:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lqg/d$a;

    array-length v1, v0

    if-nez v1, :cond_1

    return-void

    :cond_1
    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_3

    aget-object v4, v0, v3

    if-ne v4, p1, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    const/4 v3, -0x1

    :goto_1
    if-gez v3, :cond_4

    return-void

    :cond_4
    const/4 v4, 0x1

    if-ne v1, v4, :cond_5

    sget-object v1, Lqg/d;->l:[Lqg/d$a;

    goto :goto_2

    :cond_5
    add-int/lit8 v5, v1, -0x1

    new-array v5, v5, [Lqg/d$a;

    invoke-static {v0, v2, v5, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v2, v3, 0x1

    sub-int/2addr v1, v3

    sub-int/2addr v1, v4

    invoke-static {v0, v2, v5, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v1, v5

    :goto_2
    iget-object v2, p0, Lqg/d;->e:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v2, v0, v1}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method

.method public j(LDj/c;)V
    .locals 2

    const-wide v0, 0x7fffffffffffffffL

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    return-void
.end method

.method j2(Lqg/d$a;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {p1 .. p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v2

    if-eqz v2, :cond_0

    return-void

    :cond_0
    iget-wide v2, v1, Lqg/d$a;->f:J

    iget v4, v1, Lqg/d$a;->e:I

    iget-object v5, v1, Lqg/d$a;->d:Lqg/d$b;

    iget-object v6, v1, Lqg/d$a;->c:Ljava/util/concurrent/atomic/AtomicLong;

    iget-object v7, v1, Lqg/d$a;->a:LDj/b;

    iget v8, v0, Lqg/d;->d:I

    const/4 v9, 0x1

    move v10, v9

    :cond_1
    :goto_0
    iget-boolean v11, v0, Lqg/d;->k:Z

    iget-wide v12, v0, Lqg/d;->f:J

    cmp-long v12, v12, v2

    const/4 v13, 0x0

    if-nez v12, :cond_2

    move v12, v9

    goto :goto_1

    :cond_2
    move v12, v13

    :goto_1
    const/4 v14, 0x0

    if-eqz v11, :cond_4

    if-eqz v12, :cond_4

    iput-object v14, v1, Lqg/d$a;->d:Lqg/d$b;

    iget-object v1, v0, Lqg/d;->j:Ljava/lang/Throwable;

    if-eqz v1, :cond_3

    invoke-interface {v7, v1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_3
    invoke-interface {v7}, LDj/b;->a()V

    :goto_2
    return-void

    :cond_4
    if-nez v12, :cond_7

    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v11

    const-wide/high16 v15, -0x8000000000000000L

    cmp-long v15, v11, v15

    if-nez v15, :cond_5

    iput-object v14, v1, Lqg/d$a;->d:Lqg/d$b;

    return-void

    :cond_5
    cmp-long v11, v11, v2

    if-eqz v11, :cond_7

    if-ne v4, v8, :cond_6

    iget-object v4, v5, Lqg/d$b;->b:Lqg/d$b;

    move-object v5, v4

    move v4, v13

    :cond_6
    iget-object v11, v5, Lqg/d$b;->a:[Ljava/lang/Object;

    aget-object v11, v11, v4

    invoke-interface {v7, v11}, LDj/b;->h(Ljava/lang/Object;)V

    add-int/2addr v4, v9

    const-wide/16 v11, 0x1

    add-long/2addr v2, v11

    goto :goto_0

    :cond_7
    iput-wide v2, v1, Lqg/d$a;->f:J

    iput v4, v1, Lqg/d$a;->e:I

    iput-object v5, v1, Lqg/d$a;->d:Lqg/d$b;

    neg-int v10, v10

    invoke-virtual {v1, v10}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v10

    if-nez v10, :cond_1

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 3

    iget-boolean v0, p0, Lqg/d;->k:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iput-object p1, p0, Lqg/d;->j:Ljava/lang/Throwable;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lqg/d;->k:Z

    iget-object p1, p0, Lqg/d;->e:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v0, Lqg/d;->m:[Lqg/d$a;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lqg/d$a;

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    invoke-virtual {p0, v2}, Lqg/d;->j2(Lqg/d$a;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
