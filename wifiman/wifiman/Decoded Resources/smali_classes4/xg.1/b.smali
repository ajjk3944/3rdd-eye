.class public abstract Lxg/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/l;
.implements LDg/d;


# instance fields
.field protected final a:LDj/b;

.field protected b:LDj/c;

.field protected c:LDg/d;

.field protected d:Z

.field protected e:I


# direct methods
.method public constructor <init>(LDj/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxg/b;->a:LDj/b;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-boolean v0, p0, Lxg/b;->d:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lxg/b;->d:Z

    iget-object v0, p0, Lxg/b;->a:LDj/b;

    invoke-interface {v0}, LDj/b;->a()V

    return-void
.end method

.method protected b()V
    .locals 0

    return-void
.end method

.method protected c()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Lxg/b;->b:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    return-void
.end method

.method public clear()V
    .locals 1

    iget-object v0, p0, Lxg/b;->c:LDg/d;

    invoke-interface {v0}, LDg/g;->clear()V

    return-void
.end method

.method protected final d(Ljava/lang/Throwable;)V
    .locals 1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lxg/b;->b:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    invoke-virtual {p0, p1}, Lxg/b;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method protected final e(I)I
    .locals 2

    iget-object v0, p0, Lxg/b;->c:LDg/d;

    if-eqz v0, :cond_1

    and-int/lit8 v1, p1, 0x4

    if-nez v1, :cond_1

    invoke-interface {v0, p1}, LDg/c;->requestFusion(I)I

    move-result p1

    if-eqz p1, :cond_0

    iput p1, p0, Lxg/b;->e:I

    :cond_0
    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Lxg/b;->c:LDg/d;

    invoke-interface {v0}, LDg/g;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final j(LDj/c;)V
    .locals 1

    iget-object v0, p0, Lxg/b;->b:LDj/c;

    invoke-static {v0, p1}, Lyg/g;->validate(LDj/c;LDj/c;)Z

    move-result v0

    if-eqz v0, :cond_1

    iput-object p1, p0, Lxg/b;->b:LDj/c;

    instance-of v0, p1, LDg/d;

    if-eqz v0, :cond_0

    check-cast p1, LDg/d;

    iput-object p1, p0, Lxg/b;->c:LDg/d;

    :cond_0
    invoke-virtual {p0}, Lxg/b;->c()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lxg/b;->a:LDj/b;

    invoke-interface {p1, p0}, LDj/b;->j(LDj/c;)V

    invoke-virtual {p0}, Lxg/b;->b()V

    :cond_1
    return-void
.end method

.method public final offer(Ljava/lang/Object;)Z
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Should not be called!"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Lxg/b;->d:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lxg/b;->d:Z

    iget-object v0, p0, Lxg/b;->a:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public request(J)V
    .locals 1

    iget-object v0, p0, Lxg/b;->b:LDj/c;

    invoke-interface {v0, p1, p2}, LDj/c;->request(J)V

    return-void
.end method
