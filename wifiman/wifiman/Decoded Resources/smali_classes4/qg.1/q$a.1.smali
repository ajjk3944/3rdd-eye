.class final Lqg/q$a;
.super Lyg/c;
.source "SourceFile"

# interfaces
.implements Lgg/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final c:J

.field final d:Ljava/lang/Object;

.field final e:Z

.field f:LDj/c;

.field g:J

.field h:Z


# direct methods
.method constructor <init>(LDj/b;JLjava/lang/Object;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lyg/c;-><init>(LDj/b;)V

    iput-wide p2, p0, Lqg/q$a;->c:J

    iput-object p4, p0, Lqg/q$a;->d:Ljava/lang/Object;

    iput-boolean p5, p0, Lqg/q$a;->e:Z

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-boolean v0, p0, Lqg/q$a;->h:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/q$a;->h:Z

    iget-object v0, p0, Lqg/q$a;->d:Ljava/lang/Object;

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lqg/q$a;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lyg/c;->a:LDj/b;

    new-instance v1, Ljava/util/NoSuchElementException;

    invoke-direct {v1}, Ljava/util/NoSuchElementException;-><init>()V

    invoke-interface {v0, v1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lyg/c;->a:LDj/b;

    invoke-interface {v0}, LDj/b;->a()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v0}, Lyg/c;->d(Ljava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public cancel()V
    .locals 1

    invoke-super {p0}, Lyg/c;->cancel()V

    iget-object v0, p0, Lqg/q$a;->f:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 4

    iget-boolean v0, p0, Lqg/q$a;->h:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-wide v0, p0, Lqg/q$a;->g:J

    iget-wide v2, p0, Lqg/q$a;->c:J

    cmp-long v2, v0, v2

    if-nez v2, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/q$a;->h:Z

    iget-object v0, p0, Lqg/q$a;->f:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    invoke-virtual {p0, p1}, Lyg/c;->d(Ljava/lang/Object;)V

    return-void

    :cond_1
    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lqg/q$a;->g:J

    return-void
.end method

.method public j(LDj/c;)V
    .locals 2

    iget-object v0, p0, Lqg/q$a;->f:LDj/c;

    invoke-static {v0, p1}, Lyg/g;->validate(LDj/c;LDj/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lqg/q$a;->f:LDj/c;

    iget-object v0, p0, Lyg/c;->a:LDj/b;

    invoke-interface {v0, p0}, LDj/b;->j(LDj/c;)V

    const-wide v0, 0x7fffffffffffffffL

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    :cond_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Lqg/q$a;->h:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/q$a;->h:Z

    iget-object v0, p0, Lyg/c;->a:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
