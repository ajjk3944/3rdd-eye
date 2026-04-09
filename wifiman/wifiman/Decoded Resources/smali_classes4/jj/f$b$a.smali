.class final Ljj/f$b$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljj/f$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:I

.field private synthetic c:Ljava/lang/Object;

.field final synthetic d:Ljj/i;


# direct methods
.method constructor <init>(Ljj/i;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Ljj/f$b$a;->d:Ljj/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance v0, Ljj/f$b$a;

    iget-object v1, p0, Ljj/f$b$a;->d:Ljj/i;

    invoke-direct {v0, v1, p2}, Ljj/f$b$a;-><init>(Ljj/i;Ldh/e;)V

    iput-object p1, v0, Ljj/f$b$a;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly0/G;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Ljj/f$b$a;->n(Ly0/G;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ljj/f$b$a;->b:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Ljj/f$b$a;->a:Ljava/lang/Object;

    check-cast v1, Ljj/k;

    iget-object v3, p0, Ljj/f$b$a;->c:Ljava/lang/Object;

    check-cast v3, Ly0/G;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    move-object v6, v3

    goto :goto_1

    :cond_2
    iget-object v1, p0, Ljj/f$b$a;->c:Ljava/lang/Object;

    check-cast v1, Ly0/G;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Ljj/f$b$a;->c:Ljava/lang/Object;

    check-cast p1, Ly0/G;

    iget-object v1, p0, Ljj/f$b$a;->d:Ljj/i;

    invoke-virtual {v1}, Ljj/i;->w()LKi/g;

    move-result-object v1

    iput-object p1, p0, Ljj/f$b$a;->c:Ljava/lang/Object;

    iput v4, p0, Ljj/f$b$a;->b:I

    invoke-interface {v1, p0}, LKi/v;->c(Ldh/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_4

    return-object v0

    :cond_4
    move-object v13, v1

    move-object v1, p1

    move-object p1, v13

    :goto_0
    check-cast p1, Ljj/k;

    new-instance v4, Ljj/f$b$a$d;

    invoke-direct {v4, p1, v5}, Ljj/f$b$a$d;-><init>(Ljj/k;Ldh/e;)V

    iput-object v1, p0, Ljj/f$b$a;->c:Ljava/lang/Object;

    iput-object p1, p0, Ljj/f$b$a;->a:Ljava/lang/Object;

    iput v3, p0, Ljj/f$b$a;->b:I

    invoke-interface {v1, v4, p0}, Ly0/G;->P(Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_5

    return-object v0

    :cond_5
    move-object v6, v1

    move-object v1, p1

    move-object p1, v3

    :goto_1
    check-cast p1, Ly0/y;

    if-eqz p1, :cond_7

    iget-object v3, p0, Ljj/f$b$a;->d:Ljj/i;

    invoke-virtual {p1}, Ly0/y;->h()J

    move-result-wide v7

    invoke-static {v7, v8}, Ll0/g;->m(J)F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {p1}, Ly0/y;->h()J

    move-result-wide v7

    invoke-static {v7, v8}, Ll0/g;->n(J)F

    move-result v7

    float-to-int v7, v7

    invoke-virtual {v3, v4, v7}, Ljj/i;->L(II)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {v1}, Ljj/k;->b()Ll0/g;

    move-result-object v1

    if-eqz v1, :cond_6

    iget-object v3, p0, Ljj/f$b$a;->d:Ljj/i;

    invoke-virtual {v1}, Ll0/g;->v()J

    move-result-wide v7

    invoke-static {v7, v8}, Ll0/g;->m(J)F

    move-result v1

    float-to-int v1, v1

    invoke-static {v7, v8}, Ll0/g;->n(J)F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {v3, v1, v4}, Ljj/i;->J(II)V

    :cond_6
    invoke-virtual {p1}, Ly0/y;->f()J

    move-result-wide v7

    new-instance v9, Ljj/f$b$a$a;

    iget-object p1, p0, Ljj/f$b$a;->d:Ljj/i;

    invoke-direct {v9, p1}, Ljj/f$b$a$a;-><init>(Ljj/i;)V

    new-instance v10, Ljj/f$b$a$b;

    iget-object p1, p0, Ljj/f$b$a;->d:Ljj/i;

    invoke-direct {v10, p1}, Ljj/f$b$a$b;-><init>(Ljj/i;)V

    new-instance v11, Ljj/f$b$a$c;

    iget-object p1, p0, Ljj/f$b$a;->d:Ljj/i;

    invoke-direct {v11, p1}, Ljj/f$b$a$c;-><init>(Ljj/i;)V

    iput-object v5, p0, Ljj/f$b$a;->c:Ljava/lang/Object;

    iput-object v5, p0, Ljj/f$b$a;->a:Ljava/lang/Object;

    iput v2, p0, Ljj/f$b$a;->b:I

    move-object v12, p0

    invoke-static/range {v6 .. v12}, Ljj/f;->a(Ly0/G;JLmh/a;Lmh/a;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_7
    :goto_2
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(Ly0/G;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Ljj/f$b$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Ljj/f$b$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Ljj/f$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
