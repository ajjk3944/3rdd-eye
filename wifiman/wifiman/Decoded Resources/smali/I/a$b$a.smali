.class final LI/a$b$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Landroidx/compose/ui/platform/O0;

.field final synthetic d:Lmh/l;

.field final synthetic e:LI/a;

.field final synthetic f:LI/N0$a;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/O0;Lmh/l;LI/a;LI/N0$a;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LI/a$b$a;->c:Landroidx/compose/ui/platform/O0;

    iput-object p2, p0, LI/a$b$a;->d:Lmh/l;

    iput-object p3, p0, LI/a$b$a;->e:LI/a;

    iput-object p4, p0, LI/a$b$a;->f:LI/N0$a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 7

    new-instance v6, LI/a$b$a;

    iget-object v1, p0, LI/a$b$a;->c:Landroidx/compose/ui/platform/O0;

    iget-object v2, p0, LI/a$b$a;->d:Lmh/l;

    iget-object v3, p0, LI/a$b$a;->e:LI/a;

    iget-object v4, p0, LI/a$b$a;->f:LI/N0$a;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LI/a$b$a;-><init>(Landroidx/compose/ui/platform/O0;Lmh/l;LI/a;LI/N0$a;Ldh/e;)V

    iput-object p1, v6, LI/a$b$a;->b:Ljava/lang/Object;

    return-object v6
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LI/a$b$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LI/a$b$a;->a:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-eq v1, v3, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    :try_start_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LI/a$b$a;->b:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, LIi/N;

    invoke-static {}, LI/O0;->c()Lmh/l;

    move-result-object p1

    iget-object v1, p0, LI/a$b$a;->c:Landroidx/compose/ui/platform/O0;

    invoke-interface {v1}, Landroidx/compose/ui/platform/O0;->a()Landroid/view/View;

    move-result-object v1

    invoke-interface {p1, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LI/I0;

    new-instance v1, LI/P0;

    iget-object v5, p0, LI/a$b$a;->c:Landroidx/compose/ui/platform/O0;

    invoke-interface {v5}, Landroidx/compose/ui/platform/O0;->a()Landroid/view/View;

    move-result-object v5

    new-instance v6, LI/a$b$a$b;

    iget-object v7, p0, LI/a$b$a;->f:LI/N0$a;

    invoke-direct {v6, v7}, LI/a$b$a$b;-><init>(LI/N0$a;)V

    invoke-direct {v1, v5, v6, p1}, LI/P0;-><init>(Landroid/view/View;Lmh/l;LI/I0;)V

    invoke-static {}, LG/c;->a()Z

    move-result v5

    if-eqz v5, :cond_2

    new-instance v7, LI/a$b$a$a;

    iget-object v5, p0, LI/a$b$a;->e:LI/a;

    invoke-direct {v7, v5, p1, v2}, LI/a$b$a$a;-><init>(LI/a;LI/I0;Ldh/e;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    :cond_2
    iget-object p1, p0, LI/a$b$a;->d:Lmh/l;

    if-eqz p1, :cond_3

    invoke-interface {p1, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    iget-object p1, p0, LI/a$b$a;->e:LI/a;

    invoke-static {p1, v1}, LI/a;->n(LI/a;LI/P0;)V

    :try_start_1
    iget-object p1, p0, LI/a$b$a;->c:Landroidx/compose/ui/platform/O0;

    iput v3, p0, LI/a$b$a;->a:I

    invoke-interface {p1, v1, p0}, Landroidx/compose/ui/platform/O0;->b(Landroidx/compose/ui/platform/L0;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_0
    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    iget-object v0, p0, LI/a$b$a;->e:LI/a;

    invoke-static {v0, v2}, LI/a;->n(LI/a;LI/P0;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LI/a$b$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LI/a$b$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LI/a$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
