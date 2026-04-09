.class final Lqg/m$a;
.super Lxg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final f:Lkg/n;

.field final g:Lkg/c;

.field h:Ljava/lang/Object;

.field i:Z


# direct methods
.method constructor <init>(LDg/a;Lkg/n;Lkg/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lxg/a;-><init>(LDg/a;)V

    iput-object p2, p0, Lqg/m$a;->f:Lkg/n;

    iput-object p3, p0, Lqg/m$a;->g:Lkg/c;

    return-void
.end method


# virtual methods
.method public h(Ljava/lang/Object;)V
    .locals 2

    invoke-virtual {p0, p1}, Lqg/m$a;->m(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lxg/a;->b:LDj/c;

    const-wide/16 v0, 0x1

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    :cond_0
    return-void
.end method

.method public m(Ljava/lang/Object;)Z
    .locals 5

    iget-boolean v0, p0, Lxg/a;->d:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget v0, p0, Lxg/a;->e:I

    if-eqz v0, :cond_1

    iget-object v0, p0, Lxg/a;->a:LDg/a;

    invoke-interface {v0, p1}, LDg/a;->m(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 v0, 0x1

    :try_start_0
    iget-object v2, p0, Lqg/m$a;->f:Lkg/n;

    invoke-interface {v2, p1}, Lkg/n;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iget-boolean v3, p0, Lqg/m$a;->i:Z

    if-eqz v3, :cond_2

    iget-object v3, p0, Lqg/m$a;->g:Lkg/c;

    iget-object v4, p0, Lqg/m$a;->h:Ljava/lang/Object;

    invoke-interface {v3, v4, v2}, Lkg/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    iput-object v2, p0, Lqg/m$a;->h:Ljava/lang/Object;

    if-eqz v3, :cond_3

    return v1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_2
    iput-boolean v0, p0, Lqg/m$a;->i:Z

    iput-object v2, p0, Lqg/m$a;->h:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    iget-object v1, p0, Lxg/a;->a:LDg/a;

    invoke-interface {v1, p1}, LDj/b;->h(Ljava/lang/Object;)V

    return v0

    :goto_0
    invoke-virtual {p0, p1}, Lxg/a;->d(Ljava/lang/Throwable;)V

    return v0
.end method

.method public poll()Ljava/lang/Object;
    .locals 5

    :cond_0
    :goto_0
    iget-object v0, p0, Lxg/a;->c:LDg/d;

    invoke-interface {v0}, LDg/g;->poll()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    iget-object v1, p0, Lqg/m$a;->f:Lkg/n;

    invoke-interface {v1, v0}, Lkg/n;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iget-boolean v2, p0, Lqg/m$a;->i:Z

    const/4 v3, 0x1

    if-nez v2, :cond_2

    iput-boolean v3, p0, Lqg/m$a;->i:Z

    iput-object v1, p0, Lqg/m$a;->h:Ljava/lang/Object;

    return-object v0

    :cond_2
    iget-object v2, p0, Lqg/m$a;->g:Lkg/c;

    iget-object v4, p0, Lqg/m$a;->h:Ljava/lang/Object;

    invoke-interface {v2, v4, v1}, Lkg/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    iput-object v1, p0, Lqg/m$a;->h:Ljava/lang/Object;

    return-object v0

    :cond_3
    iput-object v1, p0, Lqg/m$a;->h:Ljava/lang/Object;

    iget v0, p0, Lxg/a;->e:I

    if-eq v0, v3, :cond_0

    iget-object v0, p0, Lxg/a;->b:LDj/c;

    const-wide/16 v1, 0x1

    invoke-interface {v0, v1, v2}, LDj/c;->request(J)V

    goto :goto_0
.end method

.method public requestFusion(I)I
    .locals 0

    invoke-virtual {p0, p1}, Lxg/a;->e(I)I

    move-result p1

    return p1
.end method
