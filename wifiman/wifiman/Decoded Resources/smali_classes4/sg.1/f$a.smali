.class final Lsg/f$a;
.super Lsg/c;
.source "SourceFile"

# interfaces
.implements LDj/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsg/f$a$a;
    }
.end annotation


# instance fields
.field final i:LDj/b;

.field final j:Lkg/n;

.field final k:Ljava/util/concurrent/atomic/AtomicLong;

.field final l:Lsg/f$a$a;

.field m:J

.field n:I

.field o:Ljava/lang/Object;

.field volatile p:I


# direct methods
.method constructor <init>(LDj/b;Lkg/n;ILzg/g;)V
    .locals 0

    invoke-direct {p0, p3, p4}, Lsg/c;-><init>(ILzg/g;)V

    iput-object p1, p0, Lsg/f$a;->i:LDj/b;

    iput-object p2, p0, Lsg/f$a;->j:Lkg/n;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lsg/f$a;->k:Ljava/util/concurrent/atomic/AtomicLong;

    new-instance p1, Lsg/f$a$a;

    invoke-direct {p1, p0}, Lsg/f$a$a;-><init>(Lsg/f$a;)V

    iput-object p1, p0, Lsg/f$a;->l:Lsg/f$a$a;

    return-void
.end method


# virtual methods
.method c()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lsg/f$a;->o:Ljava/lang/Object;

    return-void
.end method

.method public cancel()V
    .locals 0

    invoke-virtual {p0}, Lsg/c;->s()V

    return-void
.end method

.method d()V
    .locals 1

    iget-object v0, p0, Lsg/f$a;->l:Lsg/f$a$a;

    invoke-virtual {v0}, Lsg/f$a$a;->a()V

    return-void
.end method

.method g()V
    .locals 17

    move-object/from16 v1, p0

    invoke-virtual/range {p0 .. p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v2, v1, Lsg/f$a;->i:LDj/b;

    iget-object v0, v1, Lsg/c;->c:Lzg/g;

    iget-object v3, v1, Lsg/c;->d:LDg/g;

    iget-object v4, v1, Lsg/c;->a:Lzg/c;

    iget-object v5, v1, Lsg/f$a;->k:Ljava/util/concurrent/atomic/AtomicLong;

    iget v6, v1, Lsg/c;->b:I

    shr-int/lit8 v7, v6, 0x1

    sub-int/2addr v6, v7

    iget-boolean v7, v1, Lsg/c;->h:Z

    const/4 v8, 0x1

    move v9, v8

    :cond_1
    :goto_0
    iget-boolean v10, v1, Lsg/c;->g:Z

    const/4 v11, 0x0

    if-eqz v10, :cond_2

    invoke-interface {v3}, LDg/g;->clear()V

    iput-object v11, v1, Lsg/f$a;->o:Ljava/lang/Object;

    goto/16 :goto_3

    :cond_2
    iget v10, v1, Lsg/f$a;->p:I

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v12

    if-eqz v12, :cond_4

    sget-object v12, Lzg/g;->IMMEDIATE:Lzg/g;

    if-eq v0, v12, :cond_3

    sget-object v12, Lzg/g;->BOUNDARY:Lzg/g;

    if-ne v0, v12, :cond_4

    if-nez v10, :cond_4

    :cond_3
    invoke-interface {v3}, LDg/g;->clear()V

    iput-object v11, v1, Lsg/f$a;->o:Ljava/lang/Object;

    invoke-virtual {v4, v2}, Lzg/c;->j(LDj/b;)V

    return-void

    :cond_4
    const/4 v12, 0x0

    if-nez v10, :cond_a

    iget-boolean v10, v1, Lsg/c;->f:Z

    :try_start_0
    invoke-interface {v3}, LDg/g;->poll()Ljava/lang/Object;

    move-result-object v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v11, :cond_5

    move v13, v8

    goto :goto_1

    :cond_5
    move v13, v12

    :goto_1
    if-eqz v10, :cond_6

    if-eqz v13, :cond_6

    invoke-virtual {v4, v2}, Lzg/c;->j(LDj/b;)V

    return-void

    :cond_6
    if-eqz v13, :cond_7

    goto :goto_3

    :cond_7
    if-nez v7, :cond_9

    iget v10, v1, Lsg/f$a;->n:I

    add-int/2addr v10, v8

    if-ne v10, v6, :cond_8

    iput v12, v1, Lsg/f$a;->n:I

    iget-object v10, v1, Lsg/c;->e:LDj/c;

    int-to-long v12, v6

    invoke-interface {v10, v12, v13}, LDj/c;->request(J)V

    goto :goto_2

    :cond_8
    iput v10, v1, Lsg/f$a;->n:I

    :cond_9
    :goto_2
    :try_start_1
    iget-object v10, v1, Lsg/f$a;->j:Lkg/n;

    invoke-interface {v10, v11}, Lkg/n;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    const-string v11, "The mapper returned a null SingleSource"

    invoke-static {v10, v11}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v10, Lgg/D;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iput v8, v1, Lsg/f$a;->p:I

    iget-object v11, v1, Lsg/f$a;->l:Lsg/f$a$a;

    invoke-interface {v10, v11}, Lgg/D;->a(Lgg/B;)V

    goto :goto_3

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    iget-object v5, v1, Lsg/c;->e:LDj/c;

    invoke-interface {v5}, LDj/c;->cancel()V

    invoke-interface {v3}, LDg/g;->clear()V

    invoke-virtual {v4, v0}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    invoke-virtual {v4, v2}, Lzg/c;->j(LDj/b;)V

    return-void

    :catchall_1
    move-exception v0

    move-object v3, v0

    invoke-static {v3}, Lig/a;->b(Ljava/lang/Throwable;)V

    iget-object v0, v1, Lsg/c;->e:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    invoke-virtual {v4, v3}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    invoke-virtual {v4, v2}, Lzg/c;->j(LDj/b;)V

    return-void

    :cond_a
    const/4 v13, 0x2

    if-ne v10, v13, :cond_b

    iget-wide v13, v1, Lsg/f$a;->m:J

    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v15

    cmp-long v10, v13, v15

    if-eqz v10, :cond_b

    iget-object v10, v1, Lsg/f$a;->o:Ljava/lang/Object;

    iput-object v11, v1, Lsg/f$a;->o:Ljava/lang/Object;

    invoke-interface {v2, v10}, LDj/b;->h(Ljava/lang/Object;)V

    const-wide/16 v10, 0x1

    add-long/2addr v13, v10

    iput-wide v13, v1, Lsg/f$a;->m:J

    iput v12, v1, Lsg/f$a;->p:I

    goto/16 :goto_0

    :cond_b
    :goto_3
    neg-int v9, v9

    invoke-virtual {v1, v9}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v9

    if-nez v9, :cond_1

    return-void
.end method

.method o()V
    .locals 1

    iget-object v0, p0, Lsg/f$a;->i:LDj/b;

    invoke-interface {v0, p0}, LDj/b;->j(LDj/c;)V

    return-void
.end method

.method public request(J)V
    .locals 1

    iget-object v0, p0, Lsg/f$a;->k:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, p1, p2}, Lzg/d;->a(Ljava/util/concurrent/atomic/AtomicLong;J)J

    invoke-virtual {p0}, Lsg/f$a;->g()V

    return-void
.end method

.method t(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lsg/c;->a:Lzg/c;

    invoke-virtual {v0, p1}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lsg/c;->c:Lzg/g;

    sget-object v0, Lzg/g;->END:Lzg/g;

    if-eq p1, v0, :cond_0

    iget-object p1, p0, Lsg/c;->e:LDj/c;

    invoke-interface {p1}, LDj/c;->cancel()V

    :cond_0
    const/4 p1, 0x0

    iput p1, p0, Lsg/f$a;->p:I

    invoke-virtual {p0}, Lsg/f$a;->g()V

    :cond_1
    return-void
.end method

.method v(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lsg/f$a;->o:Ljava/lang/Object;

    const/4 p1, 0x2

    iput p1, p0, Lsg/f$a;->p:I

    invoke-virtual {p0}, Lsg/f$a;->g()V

    return-void
.end method
