.class final Lsg/i$a;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lgg/l;
.implements LDj/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsg/i$a$a;
    }
.end annotation


# static fields
.field static final k:Lsg/i$a$a;


# instance fields
.field final a:LDj/b;

.field final b:Lkg/n;

.field final c:Z

.field final d:Lzg/c;

.field final e:Ljava/util/concurrent/atomic/AtomicLong;

.field final f:Ljava/util/concurrent/atomic/AtomicReference;

.field g:LDj/c;

.field volatile h:Z

.field volatile i:Z

.field j:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lsg/i$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lsg/i$a$a;-><init>(Lsg/i$a;)V

    sput-object v0, Lsg/i$a;->k:Lsg/i$a$a;

    return-void
.end method

.method constructor <init>(LDj/b;Lkg/n;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Lsg/i$a;->a:LDj/b;

    iput-object p2, p0, Lsg/i$a;->b:Lkg/n;

    iput-boolean p3, p0, Lsg/i$a;->c:Z

    new-instance p1, Lzg/c;

    invoke-direct {p1}, Lzg/c;-><init>()V

    iput-object p1, p0, Lsg/i$a;->d:Lzg/c;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lsg/i$a;->e:Ljava/util/concurrent/atomic/AtomicLong;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lsg/i$a;->f:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lsg/i$a;->h:Z

    invoke-virtual {p0}, Lsg/i$a;->d()V

    return-void
.end method

.method c()V
    .locals 2

    iget-object v0, p0, Lsg/i$a;->f:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lsg/i$a;->k:Lsg/i$a$a;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsg/i$a$a;

    if-eqz v0, :cond_0

    if-eq v0, v1, :cond_0

    invoke-virtual {v0}, Lsg/i$a$a;->a()V

    :cond_0
    return-void
.end method

.method public cancel()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lsg/i$a;->i:Z

    iget-object v0, p0, Lsg/i$a;->g:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    invoke-virtual {p0}, Lsg/i$a;->c()V

    iget-object v0, p0, Lsg/i$a;->d:Lzg/c;

    invoke-virtual {v0}, Lzg/c;->h()V

    return-void
.end method

.method d()V
    .locals 12

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lsg/i$a;->a:LDj/b;

    iget-object v1, p0, Lsg/i$a;->d:Lzg/c;

    iget-object v2, p0, Lsg/i$a;->f:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v3, p0, Lsg/i$a;->e:Ljava/util/concurrent/atomic/AtomicLong;

    iget-wide v4, p0, Lsg/i$a;->j:J

    const/4 v6, 0x1

    move v7, v6

    :cond_1
    :goto_0
    iget-boolean v8, p0, Lsg/i$a;->i:Z

    if-eqz v8, :cond_2

    return-void

    :cond_2
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_3

    iget-boolean v8, p0, Lsg/i$a;->c:Z

    if-nez v8, :cond_3

    invoke-virtual {v1, v0}, Lzg/c;->j(LDj/b;)V

    return-void

    :cond_3
    iget-boolean v8, p0, Lsg/i$a;->h:Z

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lsg/i$a$a;

    if-nez v9, :cond_4

    move v10, v6

    goto :goto_1

    :cond_4
    const/4 v10, 0x0

    :goto_1
    if-eqz v8, :cond_5

    if-eqz v10, :cond_5

    invoke-virtual {v1, v0}, Lzg/c;->j(LDj/b;)V

    return-void

    :cond_5
    if-nez v10, :cond_7

    iget-object v8, v9, Lsg/i$a$a;->b:Ljava/lang/Object;

    if-eqz v8, :cond_7

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v10

    cmp-long v8, v4, v10

    if-nez v8, :cond_6

    goto :goto_2

    :cond_6
    const/4 v8, 0x0

    invoke-static {v2, v9, v8}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v8, v9, Lsg/i$a$a;->b:Ljava/lang/Object;

    invoke-interface {v0, v8}, LDj/b;->h(Ljava/lang/Object;)V

    const-wide/16 v8, 0x1

    add-long/2addr v4, v8

    goto :goto_0

    :cond_7
    :goto_2
    iput-wide v4, p0, Lsg/i$a;->j:J

    neg-int v7, v7

    invoke-virtual {p0, v7}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v7

    if-nez v7, :cond_1

    return-void
.end method

.method g(Lsg/i$a$a;Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lsg/i$a;->f:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lsg/i$a;->d:Lzg/c;

    invoke-virtual {p1, p2}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-boolean p1, p0, Lsg/i$a;->c:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lsg/i$a;->g:LDj/c;

    invoke-interface {p1}, LDj/c;->cancel()V

    invoke-virtual {p0}, Lsg/i$a;->c()V

    :cond_0
    invoke-virtual {p0}, Lsg/i$a;->d()V

    goto :goto_0

    :cond_1
    invoke-static {p2}, LEg/a;->v(Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lsg/i$a;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsg/i$a$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lsg/i$a$a;->a()V

    :cond_0
    :try_start_0
    iget-object v0, p0, Lsg/i$a;->b:Lkg/n;

    invoke-interface {v0, p1}, Lkg/n;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "The mapper returned a null SingleSource"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Lgg/D;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v0, Lsg/i$a$a;

    invoke-direct {v0, p0}, Lsg/i$a$a;-><init>(Lsg/i$a;)V

    :cond_1
    iget-object v1, p0, Lsg/i$a;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsg/i$a$a;

    sget-object v2, Lsg/i$a;->k:Lsg/i$a$a;

    if-ne v1, v2, :cond_2

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lsg/i$a;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v2, v1, v0}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1, v0}, Lgg/D;->a(Lgg/B;)V

    :goto_0
    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lsg/i$a;->g:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    iget-object v0, p0, Lsg/i$a;->f:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lsg/i$a;->k:Lsg/i$a$a;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lsg/i$a;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public j(LDj/c;)V
    .locals 2

    iget-object v0, p0, Lsg/i$a;->g:LDj/c;

    invoke-static {v0, p1}, Lyg/g;->validate(LDj/c;LDj/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lsg/i$a;->g:LDj/c;

    iget-object v0, p0, Lsg/i$a;->a:LDj/b;

    invoke-interface {v0, p0}, LDj/b;->j(LDj/c;)V

    const-wide v0, 0x7fffffffffffffffL

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    :cond_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lsg/i$a;->d:Lzg/c;

    invoke-virtual {v0, p1}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Lsg/i$a;->c:Z

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lsg/i$a;->c()V

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lsg/i$a;->h:Z

    invoke-virtual {p0}, Lsg/i$a;->d()V

    :cond_1
    return-void
.end method

.method public request(J)V
    .locals 1

    iget-object v0, p0, Lsg/i$a;->e:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, p1, p2}, Lzg/d;->a(Ljava/util/concurrent/atomic/AtomicLong;J)J

    invoke-virtual {p0}, Lsg/i$a;->d()V

    return-void
.end method
