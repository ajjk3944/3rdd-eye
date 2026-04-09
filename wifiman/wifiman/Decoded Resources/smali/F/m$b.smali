.class final LF/m$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/m;->a(LR0/Q;Lmh/l;Landroidx/compose/ui/e;LL0/U;LR0/c0;Lmh/l;Ly/m;Lm0/l0;ZIILR0/s;LF/C;ZZLmh/q;LT/l;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LF/E;

.field final synthetic c:LT/z1;

.field final synthetic d:LR0/T;

.field final synthetic e:LM/G;

.field final synthetic f:LR0/s;


# direct methods
.method constructor <init>(LF/E;LT/z1;LR0/T;LM/G;LR0/s;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LF/m$b;->b:LF/E;

    iput-object p2, p0, LF/m$b;->c:LT/z1;

    iput-object p3, p0, LF/m$b;->d:LR0/T;

    iput-object p4, p0, LF/m$b;->e:LM/G;

    iput-object p5, p0, LF/m$b;->f:LR0/s;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 7

    new-instance p1, LF/m$b;

    iget-object v1, p0, LF/m$b;->b:LF/E;

    iget-object v2, p0, LF/m$b;->c:LT/z1;

    iget-object v3, p0, LF/m$b;->d:LR0/T;

    iget-object v4, p0, LF/m$b;->e:LM/G;

    iget-object v5, p0, LF/m$b;->f:LR0/s;

    move-object v0, p1

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, LF/m$b;-><init>(LF/E;LT/z1;LR0/T;LM/G;LR0/s;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LF/m$b;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LF/m$b;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_1
    new-instance p1, LF/m$b$a;

    iget-object v1, p0, LF/m$b;->c:LT/z1;

    invoke-direct {p1, v1}, LF/m$b$a;-><init>(LT/z1;)V

    invoke-static {p1}, LT/o1;->o(Lmh/a;)LLi/g;

    move-result-object p1

    new-instance v1, LF/m$b$b;

    iget-object v3, p0, LF/m$b;->b:LF/E;

    iget-object v4, p0, LF/m$b;->d:LR0/T;

    iget-object v5, p0, LF/m$b;->e:LM/G;

    iget-object v6, p0, LF/m$b;->f:LR0/s;

    invoke-direct {v1, v3, v4, v5, v6}, LF/m$b$b;-><init>(LF/E;LR0/T;LM/G;LR0/s;)V

    iput v2, p0, LF/m$b;->a:I

    invoke-interface {p1, v1, p0}, LLi/g;->b(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, LF/m$b;->b:LF/E;

    invoke-static {p1}, LF/m;->i(LF/E;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :goto_1
    iget-object v0, p0, LF/m$b;->b:LF/E;

    invoke-static {v0}, LF/m;->i(LF/E;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LF/m$b;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LF/m$b;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LF/m$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
