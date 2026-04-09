.class public abstract Log/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/x;
.implements LDg/b;


# instance fields
.field protected final a:Lgg/x;

.field protected b:Lhg/c;

.field protected c:LDg/b;

.field protected d:Z

.field protected e:I


# direct methods
.method public constructor <init>(Lgg/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Log/a;->a:Lgg/x;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-boolean v0, p0, Log/a;->d:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Log/a;->d:Z

    iget-object v0, p0, Log/a;->a:Lgg/x;

    invoke-interface {v0}, Lgg/x;->a()V

    return-void
.end method

.method protected b()V
    .locals 0

    return-void
.end method

.method public final c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, Log/a;->b:Lhg/c;

    invoke-static {v0, p1}, Llg/b;->validate(Lhg/c;Lhg/c;)Z

    move-result v0

    if-eqz v0, :cond_1

    iput-object p1, p0, Log/a;->b:Lhg/c;

    instance-of v0, p1, LDg/b;

    if-eqz v0, :cond_0

    check-cast p1, LDg/b;

    iput-object p1, p0, Log/a;->c:LDg/b;

    :cond_0
    invoke-virtual {p0}, Log/a;->d()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Log/a;->a:Lgg/x;

    invoke-interface {p1, p0}, Lgg/x;->c(Lhg/c;)V

    invoke-virtual {p0}, Log/a;->b()V

    :cond_1
    return-void
.end method

.method public clear()V
    .locals 1

    iget-object v0, p0, Log/a;->c:LDg/b;

    invoke-interface {v0}, LDg/g;->clear()V

    return-void
.end method

.method protected d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public dispose()V
    .locals 1

    iget-object v0, p0, Log/a;->b:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    return-void
.end method

.method protected final e(Ljava/lang/Throwable;)V
    .locals 1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    iget-object v0, p0, Log/a;->b:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    invoke-virtual {p0, p1}, Log/a;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method protected final f(I)I
    .locals 2

    iget-object v0, p0, Log/a;->c:LDg/b;

    if-eqz v0, :cond_1

    and-int/lit8 v1, p1, 0x4

    if-nez v1, :cond_1

    invoke-interface {v0, p1}, LDg/c;->requestFusion(I)I

    move-result p1

    if-eqz p1, :cond_0

    iput p1, p0, Log/a;->e:I

    :cond_0
    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Log/a;->b:Lhg/c;

    invoke-interface {v0}, Lhg/c;->isDisposed()Z

    move-result v0

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Log/a;->c:LDg/b;

    invoke-interface {v0}, LDg/g;->isEmpty()Z

    move-result v0

    return v0
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

    iget-boolean v0, p0, Log/a;->d:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Log/a;->d:Z

    iget-object v0, p0, Log/a;->a:Lgg/x;

    invoke-interface {v0, p1}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
