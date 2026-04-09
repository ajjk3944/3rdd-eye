.class final Ltg/c0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/x;
.implements Lhg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Lgg/p;

.field b:Lhg/c;

.field c:Ljava/lang/Object;

.field d:Z


# direct methods
.method constructor <init>(Lgg/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltg/c0$a;->a:Lgg/p;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-boolean v0, p0, Ltg/c0$a;->d:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Ltg/c0$a;->d:Z

    iget-object v0, p0, Ltg/c0$a;->c:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, p0, Ltg/c0$a;->c:Ljava/lang/Object;

    if-nez v0, :cond_1

    iget-object v0, p0, Ltg/c0$a;->a:Lgg/p;

    invoke-interface {v0}, Lgg/p;->a()V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Ltg/c0$a;->a:Lgg/p;

    invoke-interface {v1, v0}, Lgg/p;->onSuccess(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, Ltg/c0$a;->b:Lhg/c;

    invoke-static {v0, p1}, Llg/b;->validate(Lhg/c;Lhg/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Ltg/c0$a;->b:Lhg/c;

    iget-object p1, p0, Ltg/c0$a;->a:Lgg/p;

    invoke-interface {p1, p0}, Lgg/p;->c(Lhg/c;)V

    :cond_0
    return-void
.end method

.method public dispose()V
    .locals 1

    iget-object v0, p0, Ltg/c0$a;->b:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 2

    iget-boolean v0, p0, Ltg/c0$a;->d:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ltg/c0$a;->c:Ljava/lang/Object;

    if-eqz v0, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, Ltg/c0$a;->d:Z

    iget-object p1, p0, Ltg/c0$a;->b:Lhg/c;

    invoke-interface {p1}, Lhg/c;->dispose()V

    iget-object p1, p0, Ltg/c0$a;->a:Lgg/p;

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Sequence contains more than one element!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lgg/p;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_1
    iput-object p1, p0, Ltg/c0$a;->c:Ljava/lang/Object;

    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Ltg/c0$a;->b:Lhg/c;

    invoke-interface {v0}, Lhg/c;->isDisposed()Z

    move-result v0

    return v0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Ltg/c0$a;->d:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Ltg/c0$a;->d:Z

    iget-object v0, p0, Ltg/c0$a;->a:Lgg/p;

    invoke-interface {v0, p1}, Lgg/p;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
