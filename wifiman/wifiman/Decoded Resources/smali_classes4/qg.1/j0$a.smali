.class final Lqg/j0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/l;
.implements LDj/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:LDj/b;

.field final b:Lkg/b;

.field c:LDj/c;

.field d:Ljava/lang/Object;

.field e:Z


# direct methods
.method constructor <init>(LDj/b;Lkg/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqg/j0$a;->a:LDj/b;

    iput-object p2, p0, Lqg/j0$a;->b:Lkg/b;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-boolean v0, p0, Lqg/j0$a;->e:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/j0$a;->e:Z

    iget-object v0, p0, Lqg/j0$a;->a:LDj/b;

    invoke-interface {v0}, LDj/b;->a()V

    return-void
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Lqg/j0$a;->c:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 3

    iget-boolean v0, p0, Lqg/j0$a;->e:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lqg/j0$a;->a:LDj/b;

    iget-object v1, p0, Lqg/j0$a;->d:Ljava/lang/Object;

    if-nez v1, :cond_1

    iput-object p1, p0, Lqg/j0$a;->d:Ljava/lang/Object;

    invoke-interface {v0, p1}, LDj/b;->h(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    :try_start_0
    iget-object v2, p0, Lqg/j0$a;->b:Lkg/b;

    invoke-interface {v2, v1, p1}, Lkg/b;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v1, "The value returned by the accumulator is null"

    invoke-static {p1, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object p1, p0, Lqg/j0$a;->d:Ljava/lang/Object;

    invoke-interface {v0, p1}, LDj/b;->h(Ljava/lang/Object;)V

    :goto_0
    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lqg/j0$a;->c:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    invoke-virtual {p0, p1}, Lqg/j0$a;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public j(LDj/c;)V
    .locals 1

    iget-object v0, p0, Lqg/j0$a;->c:LDj/c;

    invoke-static {v0, p1}, Lyg/g;->validate(LDj/c;LDj/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lqg/j0$a;->c:LDj/c;

    iget-object p1, p0, Lqg/j0$a;->a:LDj/b;

    invoke-interface {p1, p0}, LDj/b;->j(LDj/c;)V

    :cond_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Lqg/j0$a;->e:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/j0$a;->e:Z

    iget-object v0, p0, Lqg/j0$a;->a:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public request(J)V
    .locals 1

    iget-object v0, p0, Lqg/j0$a;->c:LDj/c;

    invoke-interface {v0, p1, p2}, LDj/c;->request(J)V

    return-void
.end method
