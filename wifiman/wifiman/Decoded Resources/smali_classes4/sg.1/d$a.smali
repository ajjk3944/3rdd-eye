.class final Lsg/d$a;
.super Lsg/c;
.source "SourceFile"

# interfaces
.implements Lhg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsg/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsg/d$a$a;
    }
.end annotation


# instance fields
.field final i:Lgg/d;

.field final j:Lkg/n;

.field final k:Lsg/d$a$a;

.field volatile l:Z

.field m:I


# direct methods
.method constructor <init>(Lgg/d;Lkg/n;Lzg/g;I)V
    .locals 0

    invoke-direct {p0, p4, p3}, Lsg/c;-><init>(ILzg/g;)V

    iput-object p1, p0, Lsg/d$a;->i:Lgg/d;

    iput-object p2, p0, Lsg/d$a;->j:Lkg/n;

    new-instance p1, Lsg/d$a$a;

    invoke-direct {p1, p0}, Lsg/d$a$a;-><init>(Lsg/d$a;)V

    iput-object p1, p0, Lsg/d$a;->k:Lsg/d$a$a;

    return-void
.end method


# virtual methods
.method d()V
    .locals 1

    iget-object v0, p0, Lsg/d$a;->k:Lsg/d$a$a;

    invoke-virtual {v0}, Lsg/d$a$a;->d()V

    return-void
.end method

.method public dispose()V
    .locals 0

    invoke-virtual {p0}, Lsg/c;->s()V

    return-void
.end method

.method g()V
    .locals 10

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lsg/c;->c:Lzg/g;

    iget-object v1, p0, Lsg/c;->d:LDg/g;

    iget-object v2, p0, Lsg/c;->a:Lzg/c;

    iget-boolean v3, p0, Lsg/c;->h:Z

    :cond_1
    iget-boolean v4, p0, Lsg/c;->g:Z

    if-eqz v4, :cond_2

    invoke-interface {v1}, LDg/g;->clear()V

    return-void

    :cond_2
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_4

    sget-object v4, Lzg/g;->IMMEDIATE:Lzg/g;

    if-eq v0, v4, :cond_3

    sget-object v4, Lzg/g;->BOUNDARY:Lzg/g;

    if-ne v0, v4, :cond_4

    iget-boolean v4, p0, Lsg/d$a;->l:Z

    if-nez v4, :cond_4

    :cond_3
    invoke-interface {v1}, LDg/g;->clear()V

    iget-object v0, p0, Lsg/d$a;->i:Lgg/d;

    invoke-virtual {v2, v0}, Lzg/c;->l(Lgg/d;)V

    return-void

    :cond_4
    iget-boolean v4, p0, Lsg/d$a;->l:Z

    if-nez v4, :cond_9

    iget-boolean v4, p0, Lsg/c;->f:Z

    :try_start_0
    invoke-interface {v1}, LDg/g;->poll()Ljava/lang/Object;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-nez v5, :cond_5

    move v8, v7

    goto :goto_0

    :cond_5
    move v8, v6

    :goto_0
    if-eqz v4, :cond_6

    if-eqz v8, :cond_6

    iget-object v0, p0, Lsg/d$a;->i:Lgg/d;

    invoke-virtual {v2, v0}, Lzg/c;->l(Lgg/d;)V

    return-void

    :cond_6
    if-nez v8, :cond_9

    iget v4, p0, Lsg/c;->b:I

    shr-int/lit8 v8, v4, 0x1

    sub-int/2addr v4, v8

    if-nez v3, :cond_8

    iget v8, p0, Lsg/d$a;->m:I

    add-int/2addr v8, v7

    if-ne v8, v4, :cond_7

    iput v6, p0, Lsg/d$a;->m:I

    iget-object v6, p0, Lsg/c;->e:LDj/c;

    int-to-long v8, v4

    invoke-interface {v6, v8, v9}, LDj/c;->request(J)V

    goto :goto_1

    :cond_7
    iput v8, p0, Lsg/d$a;->m:I

    :cond_8
    :goto_1
    :try_start_1
    iget-object v4, p0, Lsg/d$a;->j:Lkg/n;

    invoke-interface {v4, v5}, Lkg/n;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    const-string v5, "The mapper returned a null CompletableSource"

    invoke-static {v4, v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v4, Lgg/f;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iput-boolean v7, p0, Lsg/d$a;->l:Z

    iget-object v5, p0, Lsg/d$a;->k:Lsg/d$a$a;

    invoke-interface {v4, v5}, Lgg/f;->e(Lgg/d;)V

    goto :goto_2

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-interface {v1}, LDg/g;->clear()V

    iget-object v1, p0, Lsg/c;->e:LDj/c;

    invoke-interface {v1}, LDj/c;->cancel()V

    invoke-virtual {v2, v0}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    iget-object v0, p0, Lsg/d$a;->i:Lgg/d;

    invoke-virtual {v2, v0}, Lzg/c;->l(Lgg/d;)V

    return-void

    :catchall_1
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    iget-object v1, p0, Lsg/c;->e:LDj/c;

    invoke-interface {v1}, LDj/c;->cancel()V

    invoke-virtual {v2, v0}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    iget-object v0, p0, Lsg/d$a;->i:Lgg/d;

    invoke-virtual {v2, v0}, Lzg/c;->l(Lgg/d;)V

    return-void

    :cond_9
    :goto_2
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v4

    if-nez v4, :cond_1

    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-boolean v0, p0, Lsg/c;->g:Z

    return v0
.end method

.method o()V
    .locals 1

    iget-object v0, p0, Lsg/d$a;->i:Lgg/d;

    invoke-interface {v0, p0}, Lgg/d;->c(Lhg/c;)V

    return-void
.end method

.method t()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lsg/d$a;->l:Z

    invoke-virtual {p0}, Lsg/d$a;->g()V

    return-void
.end method

.method v(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lsg/c;->a:Lzg/c;

    invoke-virtual {v0, p1}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lsg/c;->c:Lzg/g;

    sget-object v0, Lzg/g;->IMMEDIATE:Lzg/g;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lsg/c;->e:LDj/c;

    invoke-interface {p1}, LDj/c;->cancel()V

    iget-object p1, p0, Lsg/c;->a:Lzg/c;

    iget-object v0, p0, Lsg/d$a;->i:Lgg/d;

    invoke-virtual {p1, v0}, Lzg/c;->l(Lgg/d;)V

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lsg/c;->d:LDg/g;

    invoke-interface {p1}, LDg/g;->clear()V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    iput-boolean p1, p0, Lsg/d$a;->l:Z

    invoke-virtual {p0}, Lsg/d$a;->g()V

    :cond_1
    :goto_0
    return-void
.end method
