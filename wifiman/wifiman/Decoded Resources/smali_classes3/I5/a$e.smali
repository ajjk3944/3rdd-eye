.class final LI5/a$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LDj/b;
.implements LDj/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI5/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "e"
.end annotation


# instance fields
.field private final a:LDj/b;

.field private final b:LI5/a$a;

.field private c:LDj/c;

.field private volatile d:Z

.field private e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(LDj/b;LI5/a$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, LI5/a$e;->e:Z

    iput-object p1, p0, LI5/a$e;->a:LDj/b;

    iput-object p2, p0, LI5/a$e;->b:LI5/a$a;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, LI5/a$e;->a:LDj/b;

    invoke-interface {v0}, LDj/b;->a()V

    return-void
.end method

.method public cancel()V
    .locals 2

    iget-object v0, p0, LI5/a$e;->c:LDj/c;

    const/4 v1, 0x1

    iput-boolean v1, p0, LI5/a$e;->d:Z

    invoke-interface {v0}, LDj/c;->cancel()V

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LI5/a$e;->a:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public j(LDj/c;)V
    .locals 0

    iput-object p1, p0, LI5/a$e;->c:LDj/c;

    iget-object p1, p0, LI5/a$e;->a:LDj/b;

    invoke-interface {p1, p0}, LDj/b;->j(LDj/c;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, LI5/a$e;->a:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public request(J)V
    .locals 4

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    return-void

    :cond_0
    iget-boolean v2, p0, LI5/a$e;->e:Z

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    iput-boolean v2, p0, LI5/a$e;->e:Z

    iget-object v2, p0, LI5/a$e;->b:LI5/a$a;

    iget-object v2, v2, LI5/a$a;->b:Ljava/lang/Object;

    if-eqz v2, :cond_1

    iget-boolean v3, p0, LI5/a$e;->d:Z

    if-nez v3, :cond_1

    iget-object v3, p0, LI5/a$e;->a:LDj/b;

    invoke-interface {v3, v2}, LDj/b;->h(Ljava/lang/Object;)V

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v2, p1, v2

    if-eqz v2, :cond_1

    const-wide/16 v2, 0x1

    sub-long/2addr p1, v2

    cmp-long v0, p1, v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, LI5/a$e;->c:LDj/c;

    invoke-interface {v0, p1, p2}, LDj/c;->request(J)V

    return-void
.end method
