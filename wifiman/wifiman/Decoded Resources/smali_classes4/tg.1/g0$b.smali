.class final Ltg/g0$b;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lgg/x;
.implements Lhg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# static fields
.field static final k:Ltg/g0$a;


# instance fields
.field final a:Lgg/x;

.field final b:Lkg/n;

.field final c:I

.field final d:Z

.field final e:Lzg/c;

.field volatile f:Z

.field volatile g:Z

.field h:Lhg/c;

.field final i:Ljava/util/concurrent/atomic/AtomicReference;

.field volatile j:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ltg/g0$a;

    const-wide/16 v1, -0x1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct {v0, v4, v1, v2, v3}, Ltg/g0$a;-><init>(Ltg/g0$b;JI)V

    sput-object v0, Ltg/g0$b;->k:Ltg/g0$a;

    invoke-virtual {v0}, Ltg/g0$a;->d()V

    return-void
.end method

.method constructor <init>(Lgg/x;Lkg/n;IZ)V
    .locals 1

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Ltg/g0$b;->i:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p1, p0, Ltg/g0$b;->a:Lgg/x;

    iput-object p2, p0, Ltg/g0$b;->b:Lkg/n;

    iput p3, p0, Ltg/g0$b;->c:I

    iput-boolean p4, p0, Ltg/g0$b;->d:Z

    new-instance p1, Lzg/c;

    invoke-direct {p1}, Lzg/c;-><init>()V

    iput-object p1, p0, Ltg/g0$b;->e:Lzg/c;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-boolean v0, p0, Ltg/g0$b;->f:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Ltg/g0$b;->f:Z

    invoke-virtual {p0}, Ltg/g0$b;->g()V

    :cond_0
    return-void
.end method

.method public c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, Ltg/g0$b;->h:Lhg/c;

    invoke-static {v0, p1}, Llg/b;->validate(Lhg/c;Lhg/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Ltg/g0$b;->h:Lhg/c;

    iget-object p1, p0, Ltg/g0$b;->a:Lgg/x;

    invoke-interface {p1, p0}, Lgg/x;->c(Lhg/c;)V

    :cond_0
    return-void
.end method

.method d()V
    .locals 2

    iget-object v0, p0, Ltg/g0$b;->i:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Ltg/g0$b;->k:Ltg/g0$a;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltg/g0$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ltg/g0$a;->d()V

    :cond_0
    return-void
.end method

.method public dispose()V
    .locals 1

    iget-boolean v0, p0, Ltg/g0$b;->g:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Ltg/g0$b;->g:Z

    iget-object v0, p0, Ltg/g0$b;->h:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    invoke-virtual {p0}, Ltg/g0$b;->d()V

    iget-object v0, p0, Ltg/g0$b;->e:Lzg/c;

    invoke-virtual {v0}, Lzg/c;->h()V

    :cond_0
    return-void
.end method

.method g()V
    .locals 13

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ltg/g0$b;->a:Lgg/x;

    iget-object v1, p0, Ltg/g0$b;->i:Ljava/util/concurrent/atomic/AtomicReference;

    iget-boolean v2, p0, Ltg/g0$b;->d:Z

    const/4 v3, 0x1

    move v4, v3

    :cond_1
    :goto_0
    iget-boolean v5, p0, Ltg/g0$b;->g:Z

    if-eqz v5, :cond_2

    return-void

    :cond_2
    iget-boolean v5, p0, Ltg/g0$b;->f:Z

    const/4 v6, 0x0

    if-eqz v5, :cond_7

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_3

    move v5, v3

    goto :goto_1

    :cond_3
    move v5, v6

    :goto_1
    if-eqz v2, :cond_5

    if-eqz v5, :cond_7

    iget-object v1, p0, Ltg/g0$b;->e:Lzg/c;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    if-eqz v1, :cond_4

    invoke-interface {v0, v1}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_4
    invoke-interface {v0}, Lgg/x;->a()V

    :goto_2
    return-void

    :cond_5
    iget-object v7, p0, Ltg/g0$b;->e:Lzg/c;

    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Throwable;

    if-eqz v7, :cond_6

    iget-object v1, p0, Ltg/g0$b;->e:Lzg/c;

    invoke-virtual {v1, v0}, Lzg/c;->n(Lgg/x;)V

    return-void

    :cond_6
    if-eqz v5, :cond_7

    invoke-interface {v0}, Lgg/x;->a()V

    return-void

    :cond_7
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ltg/g0$a;

    if-eqz v5, :cond_f

    iget-object v7, v5, Ltg/g0$a;->d:LDg/g;

    if-eqz v7, :cond_f

    move v8, v6

    :goto_3
    iget-boolean v9, p0, Ltg/g0$b;->g:Z

    if-eqz v9, :cond_8

    return-void

    :cond_8
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v9

    if-eq v5, v9, :cond_9

    :goto_4
    move v8, v3

    goto :goto_8

    :cond_9
    if-nez v2, :cond_a

    iget-object v9, p0, Ltg/g0$b;->e:Lzg/c;

    invoke-virtual {v9}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Throwable;

    if-eqz v9, :cond_a

    iget-object v1, p0, Ltg/g0$b;->e:Lzg/c;

    invoke-virtual {v1, v0}, Lzg/c;->n(Lgg/x;)V

    return-void

    :cond_a
    iget-boolean v9, v5, Ltg/g0$a;->e:Z

    const/4 v10, 0x0

    :try_start_0
    invoke-interface {v7}, LDg/g;->poll()Ljava/lang/Object;

    move-result-object v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_6

    :catchall_0
    move-exception v8

    invoke-static {v8}, Lig/a;->b(Ljava/lang/Throwable;)V

    iget-object v11, p0, Ltg/g0$b;->e:Lzg/c;

    invoke-virtual {v11, v8}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    invoke-static {v1, v5, v10}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    if-nez v2, :cond_b

    invoke-virtual {p0}, Ltg/g0$b;->d()V

    iget-object v8, p0, Ltg/g0$b;->h:Lhg/c;

    invoke-interface {v8}, Lhg/c;->dispose()V

    iput-boolean v3, p0, Ltg/g0$b;->f:Z

    goto :goto_5

    :cond_b
    invoke-virtual {v5}, Ltg/g0$a;->d()V

    :goto_5
    move v8, v3

    move-object v11, v10

    :goto_6
    if-nez v11, :cond_c

    move v12, v3

    goto :goto_7

    :cond_c
    move v12, v6

    :goto_7
    if-eqz v9, :cond_d

    if-eqz v12, :cond_d

    invoke-static {v1, v5, v10}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_4

    :cond_d
    if-eqz v12, :cond_e

    :goto_8
    if-eqz v8, :cond_f

    goto/16 :goto_0

    :cond_e
    invoke-interface {v0, v11}, Lgg/x;->h(Ljava/lang/Object;)V

    goto :goto_3

    :cond_f
    neg-int v4, v4

    invoke-virtual {p0, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v4

    if-nez v4, :cond_1

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 4

    iget-wide v0, p0, Ltg/g0$b;->j:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ltg/g0$b;->j:J

    iget-object v2, p0, Ltg/g0$b;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltg/g0$a;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ltg/g0$a;->d()V

    :cond_0
    :try_start_0
    iget-object v2, p0, Ltg/g0$b;->b:Lkg/n;

    invoke-interface {v2, p1}, Lkg/n;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v2, "The ObservableSource returned is null"

    invoke-static {p1, v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Lgg/v;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v2, Ltg/g0$a;

    iget v3, p0, Ltg/g0$b;->c:I

    invoke-direct {v2, p0, v0, v1, v3}, Ltg/g0$a;-><init>(Ltg/g0$b;JI)V

    :cond_1
    iget-object v0, p0, Ltg/g0$b;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltg/g0$a;

    sget-object v1, Ltg/g0$b;->k:Ltg/g0$a;

    if-ne v0, v1, :cond_2

    goto :goto_0

    :cond_2
    iget-object v1, p0, Ltg/g0$b;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v1, v0, v2}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1, v2}, Lgg/v;->d(Lgg/x;)V

    :goto_0
    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    iget-object v0, p0, Ltg/g0$b;->h:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    invoke-virtual {p0, p1}, Ltg/g0$b;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-boolean v0, p0, Ltg/g0$b;->g:Z

    return v0
.end method

.method j(Ltg/g0$a;Ljava/lang/Throwable;)V
    .locals 4

    iget-wide v0, p1, Ltg/g0$a;->b:J

    iget-wide v2, p0, Ltg/g0$b;->j:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    iget-object v0, p0, Ltg/g0$b;->e:Lzg/c;

    invoke-virtual {v0, p2}, Lzg/c;->d(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean p2, p0, Ltg/g0$b;->d:Z

    const/4 v0, 0x1

    if-nez p2, :cond_0

    iget-object p2, p0, Ltg/g0$b;->h:Lhg/c;

    invoke-interface {p2}, Lhg/c;->dispose()V

    iput-boolean v0, p0, Ltg/g0$b;->f:Z

    :cond_0
    iput-boolean v0, p1, Ltg/g0$a;->e:Z

    invoke-virtual {p0}, Ltg/g0$b;->g()V

    goto :goto_0

    :cond_1
    invoke-static {p2}, LEg/a;->v(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Ltg/g0$b;->f:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ltg/g0$b;->e:Lzg/c;

    invoke-virtual {v0, p1}, Lzg/c;->d(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean p1, p0, Ltg/g0$b;->d:Z

    if-nez p1, :cond_0

    invoke-virtual {p0}, Ltg/g0$b;->d()V

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Ltg/g0$b;->f:Z

    invoke-virtual {p0}, Ltg/g0$b;->g()V

    goto :goto_0

    :cond_1
    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
