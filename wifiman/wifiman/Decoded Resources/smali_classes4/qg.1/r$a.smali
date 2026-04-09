.class final Lqg/r$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/l;
.implements Lhg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Lgg/p;

.field final b:J

.field c:LDj/c;

.field d:J

.field e:Z


# direct methods
.method constructor <init>(Lgg/p;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqg/r$a;->a:Lgg/p;

    iput-wide p2, p0, Lqg/r$a;->b:J

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    sget-object v0, Lyg/g;->CANCELLED:Lyg/g;

    iput-object v0, p0, Lqg/r$a;->c:LDj/c;

    iget-boolean v0, p0, Lqg/r$a;->e:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/r$a;->e:Z

    iget-object v0, p0, Lqg/r$a;->a:Lgg/p;

    invoke-interface {v0}, Lgg/p;->a()V

    :cond_0
    return-void
.end method

.method public dispose()V
    .locals 1

    iget-object v0, p0, Lqg/r$a;->c:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    sget-object v0, Lyg/g;->CANCELLED:Lyg/g;

    iput-object v0, p0, Lqg/r$a;->c:LDj/c;

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 4

    iget-boolean v0, p0, Lqg/r$a;->e:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-wide v0, p0, Lqg/r$a;->d:J

    iget-wide v2, p0, Lqg/r$a;->b:J

    cmp-long v2, v0, v2

    if-nez v2, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/r$a;->e:Z

    iget-object v0, p0, Lqg/r$a;->c:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    sget-object v0, Lyg/g;->CANCELLED:Lyg/g;

    iput-object v0, p0, Lqg/r$a;->c:LDj/c;

    iget-object v0, p0, Lqg/r$a;->a:Lgg/p;

    invoke-interface {v0, p1}, Lgg/p;->onSuccess(Ljava/lang/Object;)V

    return-void

    :cond_1
    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lqg/r$a;->d:J

    return-void
.end method

.method public isDisposed()Z
    .locals 2

    iget-object v0, p0, Lqg/r$a;->c:LDj/c;

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
    .locals 4

    iget-object v0, p0, Lqg/r$a;->c:LDj/c;

    invoke-static {v0, p1}, Lyg/g;->validate(LDj/c;LDj/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lqg/r$a;->c:LDj/c;

    iget-object v0, p0, Lqg/r$a;->a:Lgg/p;

    invoke-interface {v0, p0}, Lgg/p;->c(Lhg/c;)V

    iget-wide v0, p0, Lqg/r$a;->b:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    :cond_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Lqg/r$a;->e:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/r$a;->e:Z

    sget-object v0, Lyg/g;->CANCELLED:Lyg/g;

    iput-object v0, p0, Lqg/r$a;->c:LDj/c;

    iget-object v0, p0, Lqg/r$a;->a:Lgg/p;

    invoke-interface {v0, p1}, Lgg/p;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
