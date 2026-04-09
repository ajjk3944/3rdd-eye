.class final Lqg/n0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/l;
.implements LDj/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/n0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:LDj/b;

.field b:J

.field c:LDj/c;


# direct methods
.method constructor <init>(LDj/b;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqg/n0$a;->a:LDj/b;

    iput-wide p2, p0, Lqg/n0$a;->b:J

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lqg/n0$a;->a:LDj/b;

    invoke-interface {v0}, LDj/b;->a()V

    return-void
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Lqg/n0$a;->c:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 4

    iget-wide v0, p0, Lqg/n0$a;->b:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lqg/n0$a;->b:J

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lqg/n0$a;->a:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->h(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public j(LDj/c;)V
    .locals 3

    iget-object v0, p0, Lqg/n0$a;->c:LDj/c;

    invoke-static {v0, p1}, Lyg/g;->validate(LDj/c;LDj/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lqg/n0$a;->b:J

    iput-object p1, p0, Lqg/n0$a;->c:LDj/c;

    iget-object v2, p0, Lqg/n0$a;->a:LDj/b;

    invoke-interface {v2, p0}, LDj/b;->j(LDj/c;)V

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    :cond_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lqg/n0$a;->a:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public request(J)V
    .locals 1

    iget-object v0, p0, Lqg/n0$a;->c:LDj/c;

    invoke-interface {v0, p1, p2}, LDj/c;->request(J)V

    return-void
.end method
