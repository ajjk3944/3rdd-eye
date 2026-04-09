.class final LU9/y$l$b$a$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU9/y$l$b$a;->e(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:LU9/h;

.field final synthetic d:Lf2/w;

.field final synthetic e:LU9/f;

.field final synthetic f:LN/n0;

.field final synthetic g:Lmh/l;


# direct methods
.method constructor <init>(LU9/h;Lf2/w;LU9/f;LN/n0;Lmh/l;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LU9/y$l$b$a$b;->c:LU9/h;

    iput-object p2, p0, LU9/y$l$b$a$b;->d:Lf2/w;

    iput-object p3, p0, LU9/y$l$b$a$b;->e:LU9/f;

    iput-object p4, p0, LU9/y$l$b$a$b;->f:LN/n0;

    iput-object p5, p0, LU9/y$l$b$a$b;->g:Lmh/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 8

    new-instance v7, LU9/y$l$b$a$b;

    iget-object v1, p0, LU9/y$l$b$a$b;->c:LU9/h;

    iget-object v2, p0, LU9/y$l$b$a$b;->d:Lf2/w;

    iget-object v3, p0, LU9/y$l$b$a$b;->e:LU9/f;

    iget-object v4, p0, LU9/y$l$b$a$b;->f:LN/n0;

    iget-object v5, p0, LU9/y$l$b$a$b;->g:Lmh/l;

    move-object v0, v7

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, LU9/y$l$b$a$b;-><init>(LU9/h;Lf2/w;LU9/f;LN/n0;Lmh/l;Ldh/e;)V

    iput-object p1, v7, LU9/y$l$b$a$b;->b:Ljava/lang/Object;

    return-object v7
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LU9/y$l$b$a$b;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, LU9/y$l$b$a$b;->a:I

    if-nez v0, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LU9/y$l$b$a$b;->b:Ljava/lang/Object;

    check-cast p1, LIi/N;

    iget-object v0, p0, LU9/y$l$b$a$b;->c:LU9/h;

    invoke-virtual {v0}, LU9/h;->b()LLi/g;

    move-result-object v0

    new-instance v7, LU9/y$l$b$a$b$a;

    iget-object v2, p0, LU9/y$l$b$a$b;->d:Lf2/w;

    iget-object v3, p0, LU9/y$l$b$a$b;->e:LU9/f;

    iget-object v4, p0, LU9/y$l$b$a$b;->f:LN/n0;

    iget-object v5, p0, LU9/y$l$b$a$b;->g:Lmh/l;

    const/4 v6, 0x0

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, LU9/y$l$b$a$b$a;-><init>(Lf2/w;LU9/f;LN/n0;Lmh/l;Ldh/e;)V

    invoke-static {v0, v7}, LLi/i;->I(LLi/g;Lmh/p;)LLi/g;

    move-result-object v0

    invoke-static {v0, p1}, LLi/i;->D(LLi/g;LIi/N;)LIi/y0;

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LU9/y$l$b$a$b;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LU9/y$l$b$a$b;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LU9/y$l$b$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
