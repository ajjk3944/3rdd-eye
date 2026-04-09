.class final Lqg/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/l;
.implements LDj/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/k$a$a;,
        Lqg/k$a$b;,
        Lqg/k$a$c;
    }
.end annotation


# instance fields
.field final a:LDj/b;

.field final b:J

.field final c:Ljava/util/concurrent/TimeUnit;

.field final d:Lgg/y$c;

.field final e:Z

.field f:LDj/c;


# direct methods
.method constructor <init>(LDj/b;JLjava/util/concurrent/TimeUnit;Lgg/y$c;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqg/k$a;->a:LDj/b;

    iput-wide p2, p0, Lqg/k$a;->b:J

    iput-object p4, p0, Lqg/k$a;->c:Ljava/util/concurrent/TimeUnit;

    iput-object p5, p0, Lqg/k$a;->d:Lgg/y$c;

    iput-boolean p6, p0, Lqg/k$a;->e:Z

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    iget-object v0, p0, Lqg/k$a;->d:Lgg/y$c;

    new-instance v1, Lqg/k$a$a;

    invoke-direct {v1, p0}, Lqg/k$a$a;-><init>(Lqg/k$a;)V

    iget-wide v2, p0, Lqg/k$a;->b:J

    iget-object v4, p0, Lqg/k$a;->c:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3, v4}, Lgg/y$c;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lhg/c;

    return-void
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Lqg/k$a;->f:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    iget-object v0, p0, Lqg/k$a;->d:Lgg/y$c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Lqg/k$a;->d:Lgg/y$c;

    new-instance v1, Lqg/k$a$c;

    invoke-direct {v1, p0, p1}, Lqg/k$a$c;-><init>(Lqg/k$a;Ljava/lang/Object;)V

    iget-wide v2, p0, Lqg/k$a;->b:J

    iget-object p1, p0, Lqg/k$a;->c:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3, p1}, Lgg/y$c;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lhg/c;

    return-void
.end method

.method public j(LDj/c;)V
    .locals 1

    iget-object v0, p0, Lqg/k$a;->f:LDj/c;

    invoke-static {v0, p1}, Lyg/g;->validate(LDj/c;LDj/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lqg/k$a;->f:LDj/c;

    iget-object p1, p0, Lqg/k$a;->a:LDj/b;

    invoke-interface {p1, p0}, LDj/b;->j(LDj/c;)V

    :cond_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 4

    iget-object v0, p0, Lqg/k$a;->d:Lgg/y$c;

    new-instance v1, Lqg/k$a$b;

    invoke-direct {v1, p0, p1}, Lqg/k$a$b;-><init>(Lqg/k$a;Ljava/lang/Throwable;)V

    iget-boolean p1, p0, Lqg/k$a;->e:Z

    if-eqz p1, :cond_0

    iget-wide v2, p0, Lqg/k$a;->b:J

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x0

    :goto_0
    iget-object p1, p0, Lqg/k$a;->c:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3, p1}, Lgg/y$c;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lhg/c;

    return-void
.end method

.method public request(J)V
    .locals 1

    iget-object v0, p0, Lqg/k$a;->f:LDj/c;

    invoke-interface {v0, p1, p2}, LDj/c;->request(J)V

    return-void
.end method
