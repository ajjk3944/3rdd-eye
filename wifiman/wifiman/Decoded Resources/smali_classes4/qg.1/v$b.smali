.class final Lqg/v$b;
.super Lxg/b;
.source "SourceFile"

# interfaces
.implements LDg/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field final f:Lkg/p;


# direct methods
.method constructor <init>(LDj/b;Lkg/p;)V
    .locals 0

    invoke-direct {p0, p1}, Lxg/b;-><init>(LDj/b;)V

    iput-object p2, p0, Lqg/v$b;->f:Lkg/p;

    return-void
.end method


# virtual methods
.method public h(Ljava/lang/Object;)V
    .locals 2

    invoke-virtual {p0, p1}, Lqg/v$b;->m(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lxg/b;->b:LDj/c;

    const-wide/16 v0, 0x1

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    :cond_0
    return-void
.end method

.method public m(Ljava/lang/Object;)Z
    .locals 2

    iget-boolean v0, p0, Lxg/b;->d:Z

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget v0, p0, Lxg/b;->e:I

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget-object p1, p0, Lxg/b;->a:LDj/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LDj/b;->h(Ljava/lang/Object;)V

    return v1

    :cond_1
    :try_start_0
    iget-object v0, p0, Lqg/v$b;->f:Lkg/p;

    invoke-interface {v0, p1}, Lkg/p;->test(Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_2

    iget-object v1, p0, Lxg/b;->a:LDj/b;

    invoke-interface {v1, p1}, LDj/b;->h(Ljava/lang/Object;)V

    :cond_2
    return v0

    :catchall_0
    move-exception p1

    invoke-virtual {p0, p1}, Lxg/b;->d(Ljava/lang/Throwable;)V

    return v1
.end method

.method public poll()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lxg/b;->c:LDg/d;

    iget-object v1, p0, Lqg/v$b;->f:Lkg/p;

    :cond_0
    :goto_0
    invoke-interface {v0}, LDg/g;->poll()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    invoke-interface {v1, v2}, Lkg/p;->test(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    return-object v2

    :cond_2
    iget v2, p0, Lxg/b;->e:I

    const/4 v3, 0x2

    if-ne v2, v3, :cond_0

    const-wide/16 v2, 0x1

    invoke-interface {v0, v2, v3}, LDj/c;->request(J)V

    goto :goto_0
.end method

.method public requestFusion(I)I
    .locals 0

    invoke-virtual {p0, p1}, Lxg/b;->e(I)I

    move-result p1

    return p1
.end method
