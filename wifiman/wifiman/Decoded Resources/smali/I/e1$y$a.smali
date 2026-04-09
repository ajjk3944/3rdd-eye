.class final LI/e1$y$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/e1$y;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:LI/e1;


# direct methods
.method constructor <init>(LI/e1;Lu/a;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LI/e1$y$a;->c:LI/e1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance v0, LI/e1$y$a;

    iget-object v1, p0, LI/e1$y$a;->c:LI/e1;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p2}, LI/e1$y$a;-><init>(LI/e1;Lu/a;Ldh/e;)V

    iput-object p1, v0, LI/e1$y$a;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/platform/P0;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LI/e1$y$a;->n(Landroidx/compose/ui/platform/P0;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LI/e1$y$a;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-eq v1, v2, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LI/e1$y$a;->b:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Landroidx/compose/ui/platform/P0;

    iget-object p1, p0, LI/e1$y$a;->c:LI/e1;

    invoke-virtual {p1}, LI/e1;->f3()LI/o1;

    move-result-object v4

    iget-object p1, p0, LI/e1$y$a;->c:LI/e1;

    invoke-virtual {p1}, LI/e1;->g3()LI/l1;

    move-result-object v5

    iget-object p1, p0, LI/e1$y$a;->c:LI/e1;

    invoke-virtual {p1}, LI/e1;->a3()LF/D;

    move-result-object p1

    iget-object v1, p0, LI/e1$y$a;->c:LI/e1;

    invoke-virtual {v1}, LI/e1;->c3()Z

    move-result v1

    invoke-virtual {p1, v1}, LF/D;->l(Z)LR0/s;

    move-result-object v6

    new-instance v8, LI/e1$y$a$a;

    iget-object p1, p0, LI/e1$y$a;->c:LI/e1;

    invoke-direct {v8, p1}, LI/e1$y$a$a;-><init>(Ljava/lang/Object;)V

    iget-object p1, p0, LI/e1$y$a;->c:LI/e1;

    invoke-static {p1}, LI/e1;->N2(LI/e1;)LLi/y;

    move-result-object v9

    iget-object p1, p0, LI/e1$y$a;->c:LI/e1;

    invoke-static {}, Landroidx/compose/ui/platform/k0;->t()LT/H0;

    move-result-object v1

    invoke-static {p1, v1}, LE0/i;->a(LE0/h;LT/u;)Ljava/lang/Object;

    move-result-object p1

    move-object v10, p1

    check-cast v10, Landroidx/compose/ui/platform/w1;

    iput v2, p0, LI/e1$y$a;->a:I

    const/4 v7, 0x0

    move-object v11, p0

    invoke-static/range {v3 .. v11}, LI/c;->d(Landroidx/compose/ui/platform/O0;LI/o1;LI/l1;LR0/s;Lu/a;Lmh/l;LLi/y;Landroidx/compose/ui/platform/w1;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public final n(Landroidx/compose/ui/platform/P0;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LI/e1$y$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LI/e1$y$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LI/e1$y$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
