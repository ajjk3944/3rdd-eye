.class final LS6/i$b$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS6/i$b;->a(Lz/f;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LS6/k;

.field final synthetic c:Lz/f;

.field final synthetic d:LU6/a;


# direct methods
.method constructor <init>(LS6/k;Lz/f;LU6/a;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LS6/i$b$a;->b:LS6/k;

    iput-object p2, p0, LS6/i$b$a;->c:Lz/f;

    iput-object p3, p0, LS6/i$b$a;->d:LU6/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance p1, LS6/i$b$a;

    iget-object v0, p0, LS6/i$b$a;->b:LS6/k;

    iget-object v1, p0, LS6/i$b$a;->c:Lz/f;

    iget-object v2, p0, LS6/i$b$a;->d:LU6/a;

    invoke-direct {p1, v0, v1, v2, p2}, LS6/i$b$a;-><init>(LS6/k;Lz/f;LU6/a;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LS6/i$b$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, LS6/i$b$a;->a:I

    if-nez v0, :cond_2

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LS6/i$b$a;->b:LS6/k;

    invoke-virtual {p1}, LS6/k;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/r;->g(J)I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p1}, LS6/k;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/r;->f(J)I

    move-result p1

    if-lez p1, :cond_0

    iget-object p1, p0, LS6/i$b$a;->b:LS6/k;

    invoke-virtual {p1}, LS6/k;->h()J

    move-result-wide v0

    iget-object p1, p0, LS6/i$b$a;->c:Lz/f;

    invoke-interface {p1}, Lz/f;->d()J

    move-result-wide v2

    invoke-static {v0, v1}, LY0/r;->g(J)I

    move-result v4

    invoke-static {v0, v1}, LY0/r;->g(J)I

    move-result v5

    invoke-static {v0, v1}, LY0/r;->f(J)I

    move-result v6

    invoke-static {v0, v1}, LY0/r;->f(J)I

    move-result v7

    invoke-static/range {v2 .. v7}, LY0/b;->c(JIIII)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    iget-object p1, p0, LS6/i$b$a;->c:Lz/f;

    invoke-interface {p1}, Lz/f;->d()J

    move-result-wide v0

    :goto_0
    iget-object p1, p0, LS6/i$b$a;->d:LU6/a;

    if-eqz p1, :cond_1

    invoke-interface {p1, v0, v1}, LU6/a;->c(J)V

    :cond_1
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LS6/i$b$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LS6/i$b$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LS6/i$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
