.class final Ltg/d$a;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lgg/x;
.implements Lhg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/d$a$a;
    }
.end annotation


# instance fields
.field final a:Lgg/x;

.field final b:Lkg/n;

.field final c:I

.field final d:Lzg/c;

.field final e:Ltg/d$a$a;

.field final f:Z

.field g:LDg/g;

.field h:Lhg/c;

.field volatile i:Z

.field volatile j:Z

.field volatile k:Z

.field l:I


# direct methods
.method constructor <init>(Lgg/x;Lkg/n;IZ)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Ltg/d$a;->a:Lgg/x;

    iput-object p2, p0, Ltg/d$a;->b:Lkg/n;

    iput p3, p0, Ltg/d$a;->c:I

    iput-boolean p4, p0, Ltg/d$a;->f:Z

    new-instance p2, Lzg/c;

    invoke-direct {p2}, Lzg/c;-><init>()V

    iput-object p2, p0, Ltg/d$a;->d:Lzg/c;

    new-instance p2, Ltg/d$a$a;

    invoke-direct {p2, p1, p0}, Ltg/d$a$a;-><init>(Lgg/x;Ltg/d$a;)V

    iput-object p2, p0, Ltg/d$a;->e:Ltg/d$a$a;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ltg/d$a;->j:Z

    invoke-virtual {p0}, Ltg/d$a;->d()V

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 2

    iget-object v0, p0, Ltg/d$a;->h:Lhg/c;

    invoke-static {v0, p1}, Llg/b;->validate(Lhg/c;Lhg/c;)Z

    move-result v0

    if-eqz v0, :cond_2

    iput-object p1, p0, Ltg/d$a;->h:Lhg/c;

    instance-of v0, p1, LDg/b;

    if-eqz v0, :cond_1

    check-cast p1, LDg/b;

    const/4 v0, 0x3

    invoke-interface {p1, v0}, LDg/c;->requestFusion(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iput v0, p0, Ltg/d$a;->l:I

    iput-object p1, p0, Ltg/d$a;->g:LDg/g;

    iput-boolean v1, p0, Ltg/d$a;->j:Z

    iget-object p1, p0, Ltg/d$a;->a:Lgg/x;

    invoke-interface {p1, p0}, Lgg/x;->c(Lhg/c;)V

    invoke-virtual {p0}, Ltg/d$a;->d()V

    return-void

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iput v0, p0, Ltg/d$a;->l:I

    iput-object p1, p0, Ltg/d$a;->g:LDg/g;

    iget-object p1, p0, Ltg/d$a;->a:Lgg/x;

    invoke-interface {p1, p0}, Lgg/x;->c(Lhg/c;)V

    return-void

    :cond_1
    new-instance p1, LDg/i;

    iget v0, p0, Ltg/d$a;->c:I

    invoke-direct {p1, v0}, LDg/i;-><init>(I)V

    iput-object p1, p0, Ltg/d$a;->g:LDg/g;

    iget-object p1, p0, Ltg/d$a;->a:Lgg/x;

    invoke-interface {p1, p0}, Lgg/x;->c(Lhg/c;)V

    :cond_2
    return-void
.end method

.method d()V
    .locals 7

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ltg/d$a;->a:Lgg/x;

    iget-object v1, p0, Ltg/d$a;->g:LDg/g;

    iget-object v2, p0, Ltg/d$a;->d:Lzg/c;

    :cond_1
    :goto_0
    iget-boolean v3, p0, Ltg/d$a;->i:Z

    if-nez v3, :cond_7

    iget-boolean v3, p0, Ltg/d$a;->k:Z

    if-eqz v3, :cond_2

    invoke-interface {v1}, LDg/g;->clear()V

    return-void

    :cond_2
    iget-boolean v3, p0, Ltg/d$a;->f:Z

    const/4 v4, 0x1

    if-nez v3, :cond_3

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Throwable;

    if-eqz v3, :cond_3

    invoke-interface {v1}, LDg/g;->clear()V

    iput-boolean v4, p0, Ltg/d$a;->k:Z

    invoke-virtual {v2, v0}, Lzg/c;->n(Lgg/x;)V

    return-void

    :cond_3
    iget-boolean v3, p0, Ltg/d$a;->j:Z

    :try_start_0
    invoke-interface {v1}, LDg/g;->poll()Ljava/lang/Object;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-nez v5, :cond_4

    move v6, v4

    goto :goto_1

    :cond_4
    const/4 v6, 0x0

    :goto_1
    if-eqz v3, :cond_5

    if-eqz v6, :cond_5

    iput-boolean v4, p0, Ltg/d$a;->k:Z

    invoke-virtual {v2, v0}, Lzg/c;->n(Lgg/x;)V

    return-void

    :cond_5
    if-nez v6, :cond_7

    :try_start_1
    iget-object v3, p0, Ltg/d$a;->b:Lkg/n;

    invoke-interface {v3, v5}, Lkg/n;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const-string v5, "The mapper returned a null ObservableSource"

    invoke-static {v3, v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v3, Lgg/v;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    instance-of v5, v3, Lkg/q;

    if-eqz v5, :cond_6

    :try_start_2
    check-cast v3, Lkg/q;

    invoke-interface {v3}, Lkg/q;->get()Ljava/lang/Object;

    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v3, :cond_1

    iget-boolean v4, p0, Ltg/d$a;->k:Z

    if-nez v4, :cond_1

    invoke-interface {v0, v3}, Lgg/x;->h(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v3

    invoke-static {v3}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-virtual {v2, v3}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    goto :goto_0

    :cond_6
    iput-boolean v4, p0, Ltg/d$a;->i:Z

    iget-object v4, p0, Ltg/d$a;->e:Ltg/d$a$a;

    invoke-interface {v3, v4}, Lgg/v;->d(Lgg/x;)V

    goto :goto_2

    :catchall_1
    move-exception v3

    invoke-static {v3}, Lig/a;->b(Ljava/lang/Throwable;)V

    iput-boolean v4, p0, Ltg/d$a;->k:Z

    iget-object v4, p0, Ltg/d$a;->h:Lhg/c;

    invoke-interface {v4}, Lhg/c;->dispose()V

    invoke-interface {v1}, LDg/g;->clear()V

    invoke-virtual {v2, v3}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    invoke-virtual {v2, v0}, Lzg/c;->n(Lgg/x;)V

    return-void

    :catchall_2
    move-exception v1

    invoke-static {v1}, Lig/a;->b(Ljava/lang/Throwable;)V

    iput-boolean v4, p0, Ltg/d$a;->k:Z

    iget-object v3, p0, Ltg/d$a;->h:Lhg/c;

    invoke-interface {v3}, Lhg/c;->dispose()V

    invoke-virtual {v2, v1}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    invoke-virtual {v2, v0}, Lzg/c;->n(Lgg/x;)V

    return-void

    :cond_7
    :goto_2
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v3

    if-nez v3, :cond_1

    return-void
.end method

.method public dispose()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ltg/d$a;->k:Z

    iget-object v0, p0, Ltg/d$a;->h:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    iget-object v0, p0, Ltg/d$a;->e:Ltg/d$a$a;

    invoke-virtual {v0}, Ltg/d$a$a;->d()V

    iget-object v0, p0, Ltg/d$a;->d:Lzg/c;

    invoke-virtual {v0}, Lzg/c;->h()V

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Ltg/d$a;->l:I

    if-nez v0, :cond_0

    iget-object v0, p0, Ltg/d$a;->g:LDg/g;

    invoke-interface {v0, p1}, LDg/g;->offer(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual {p0}, Ltg/d$a;->d()V

    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-boolean v0, p0, Ltg/d$a;->k:Z

    return v0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Ltg/d$a;->d:Lzg/c;

    invoke-virtual {v0, p1}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Ltg/d$a;->j:Z

    invoke-virtual {p0}, Ltg/d$a;->d()V

    :cond_0
    return-void
.end method
