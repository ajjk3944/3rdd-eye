.class final Lqg/l0$a;
.super Lyg/c;
.source "SourceFile"

# interfaces
.implements Lgg/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/l0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final c:Ljava/lang/Object;

.field final d:Z

.field e:LDj/c;

.field f:Z


# direct methods
.method constructor <init>(LDj/b;Ljava/lang/Object;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lyg/c;-><init>(LDj/b;)V

    iput-object p2, p0, Lqg/l0$a;->c:Ljava/lang/Object;

    iput-boolean p3, p0, Lqg/l0$a;->d:Z

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-boolean v0, p0, Lqg/l0$a;->f:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/l0$a;->f:Z

    iget-object v0, p0, Lyg/c;->b:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, p0, Lyg/c;->b:Ljava/lang/Object;

    if-nez v0, :cond_1

    iget-object v0, p0, Lqg/l0$a;->c:Ljava/lang/Object;

    :cond_1
    if-nez v0, :cond_3

    iget-boolean v0, p0, Lqg/l0$a;->d:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lyg/c;->a:LDj/b;

    new-instance v1, Ljava/util/NoSuchElementException;

    invoke-direct {v1}, Ljava/util/NoSuchElementException;-><init>()V

    invoke-interface {v0, v1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lyg/c;->a:LDj/b;

    invoke-interface {v0}, LDj/b;->a()V

    goto :goto_0

    :cond_3
    invoke-virtual {p0, v0}, Lyg/c;->d(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public cancel()V
    .locals 1

    invoke-super {p0}, Lyg/c;->cancel()V

    iget-object v0, p0, Lqg/l0$a;->e:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 2

    iget-boolean v0, p0, Lqg/l0$a;->f:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lyg/c;->b:Ljava/lang/Object;

    if-eqz v0, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, Lqg/l0$a;->f:Z

    iget-object p1, p0, Lqg/l0$a;->e:LDj/c;

    invoke-interface {p1}, LDj/c;->cancel()V

    iget-object p1, p0, Lyg/c;->a:LDj/b;

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Sequence contains more than one element!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_1
    iput-object p1, p0, Lyg/c;->b:Ljava/lang/Object;

    return-void
.end method

.method public j(LDj/c;)V
    .locals 2

    iget-object v0, p0, Lqg/l0$a;->e:LDj/c;

    invoke-static {v0, p1}, Lyg/g;->validate(LDj/c;LDj/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lqg/l0$a;->e:LDj/c;

    iget-object v0, p0, Lyg/c;->a:LDj/b;

    invoke-interface {v0, p0}, LDj/b;->j(LDj/c;)V

    const-wide v0, 0x7fffffffffffffffL

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    :cond_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Lqg/l0$a;->f:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/l0$a;->f:Z

    iget-object v0, p0, Lyg/c;->a:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
