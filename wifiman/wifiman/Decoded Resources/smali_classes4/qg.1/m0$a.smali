.class final Lqg/m0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/l;
.implements Lhg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/m0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Lgg/B;

.field final b:Ljava/lang/Object;

.field c:LDj/c;

.field d:Z

.field e:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lgg/B;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqg/m0$a;->a:Lgg/B;

    iput-object p2, p0, Lqg/m0$a;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-boolean v0, p0, Lqg/m0$a;->d:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/m0$a;->d:Z

    sget-object v0, Lyg/g;->CANCELLED:Lyg/g;

    iput-object v0, p0, Lqg/m0$a;->c:LDj/c;

    iget-object v0, p0, Lqg/m0$a;->e:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, p0, Lqg/m0$a;->e:Ljava/lang/Object;

    if-nez v0, :cond_1

    iget-object v0, p0, Lqg/m0$a;->b:Ljava/lang/Object;

    :cond_1
    if-eqz v0, :cond_2

    iget-object v1, p0, Lqg/m0$a;->a:Lgg/B;

    invoke-interface {v1, v0}, Lgg/B;->onSuccess(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lqg/m0$a;->a:Lgg/B;

    new-instance v1, Ljava/util/NoSuchElementException;

    invoke-direct {v1}, Ljava/util/NoSuchElementException;-><init>()V

    invoke-interface {v0, v1}, Lgg/B;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public dispose()V
    .locals 1

    iget-object v0, p0, Lqg/m0$a;->c:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    sget-object v0, Lyg/g;->CANCELLED:Lyg/g;

    iput-object v0, p0, Lqg/m0$a;->c:LDj/c;

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 2

    iget-boolean v0, p0, Lqg/m0$a;->d:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lqg/m0$a;->e:Ljava/lang/Object;

    if-eqz v0, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, Lqg/m0$a;->d:Z

    iget-object p1, p0, Lqg/m0$a;->c:LDj/c;

    invoke-interface {p1}, LDj/c;->cancel()V

    sget-object p1, Lyg/g;->CANCELLED:Lyg/g;

    iput-object p1, p0, Lqg/m0$a;->c:LDj/c;

    iget-object p1, p0, Lqg/m0$a;->a:Lgg/B;

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Sequence contains more than one element!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lgg/B;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_1
    iput-object p1, p0, Lqg/m0$a;->e:Ljava/lang/Object;

    return-void
.end method

.method public isDisposed()Z
    .locals 2

    iget-object v0, p0, Lqg/m0$a;->c:LDj/c;

    sget-object v1, Lyg/g;->CANCELLED:Lyg/g;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public j(LDj/c;)V
    .locals 2

    iget-object v0, p0, Lqg/m0$a;->c:LDj/c;

    invoke-static {v0, p1}, Lyg/g;->validate(LDj/c;LDj/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lqg/m0$a;->c:LDj/c;

    iget-object v0, p0, Lqg/m0$a;->a:Lgg/B;

    invoke-interface {v0, p0}, Lgg/B;->c(Lhg/c;)V

    const-wide v0, 0x7fffffffffffffffL

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    :cond_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Lqg/m0$a;->d:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/m0$a;->d:Z

    sget-object v0, Lyg/g;->CANCELLED:Lyg/g;

    iput-object v0, p0, Lqg/m0$a;->c:LDj/c;

    iget-object v0, p0, Lqg/m0$a;->a:Lgg/B;

    invoke-interface {v0, p1}, Lgg/B;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
