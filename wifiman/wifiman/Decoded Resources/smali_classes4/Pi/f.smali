.class final LPi/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LDj/b;


# instance fields
.field private final a:J

.field private b:LDj/c;

.field private final c:LKi/g;


# direct methods
.method public constructor <init>(ILKi/a;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p3, p0, LPi/f;->a:J

    if-nez p1, :cond_0

    const/4 p1, 0x1

    :cond_0
    const/4 p3, 0x4

    const/4 p4, 0x0

    invoke-static {p1, p2, p4, p3, p4}, LKi/j;->b(ILKi/a;Lmh/l;ILjava/lang/Object;)LKi/g;

    move-result-object p1

    iput-object p1, p0, LPi/f;->c:LKi/g;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, LPi/f;->c:LKi/g;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LKi/w$a;->a(LKi/w;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    return-void
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, LPi/f;->b:LDj/c;

    if-nez v0, :cond_0

    const-string v0, "subscription"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-interface {v0}, LDj/c;->cancel()V

    return-void
.end method

.method public final c()V
    .locals 3

    iget-object v0, p0, LPi/f;->b:LDj/c;

    if-nez v0, :cond_0

    const-string v0, "subscription"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    iget-wide v1, p0, LPi/f;->a:J

    invoke-interface {v0, v1, v2}, LDj/c;->request(J)V

    return-void
.end method

.method public final d(Ldh/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, LPi/f$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LPi/f$a;

    iget v1, v0, LPi/f$a;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LPi/f$a;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, LPi/f$a;

    invoke-direct {v0, p0, p1}, LPi/f$a;-><init>(LPi/f;Ldh/e;)V

    :goto_0
    iget-object p1, v0, LPi/f$a;->a:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LPi/f$a;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    check-cast p1, LKi/k;

    invoke-virtual {p1}, LKi/k;->l()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LPi/f;->c:LKi/g;

    iput v3, v0, LPi/f$a;->c:I

    invoke-interface {p1, v0}, LKi/v;->i(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    invoke-static {p1}, LKi/k;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_5

    instance-of v0, p1, LKi/k$c;

    if-eqz v0, :cond_4

    invoke-static {p1}, LKi/k;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    const/4 p1, 0x0

    :cond_4
    return-object p1

    :cond_5
    throw v0
.end method

.method public h(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, LPi/f;->c:LKi/g;

    invoke-interface {v0, p1}, LKi/w;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LKi/k;->j(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Element "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " was not added to channel because it was full, "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, LPi/f;->c:LKi/g;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public j(LDj/c;)V
    .locals 0

    iput-object p1, p0, LPi/f;->b:LDj/c;

    invoke-virtual {p0}, LPi/f;->c()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, LPi/f;->c:LKi/g;

    invoke-interface {v0, p1}, LKi/w;->f(Ljava/lang/Throwable;)Z

    return-void
.end method
