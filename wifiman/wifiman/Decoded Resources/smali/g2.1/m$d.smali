.class final Lg2/m$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg2/m;->a(Lf2/w;Lf2/t;Landroidx/compose/ui/e;Lf0/c;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field synthetic b:Ljava/lang/Object;

.field final synthetic c:Lg2/e;

.field final synthetic d:LT/z1;

.field final synthetic e:LT/m0;

.field final synthetic f:LT/q0;


# direct methods
.method constructor <init>(Lg2/e;LT/z1;LT/m0;LT/q0;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lg2/m$d;->c:Lg2/e;

    iput-object p2, p0, Lg2/m$d;->d:LT/z1;

    iput-object p3, p0, Lg2/m$d;->e:LT/m0;

    iput-object p4, p0, Lg2/m$d;->f:LT/q0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 7

    new-instance v6, Lg2/m$d;

    iget-object v1, p0, Lg2/m$d;->c:Lg2/e;

    iget-object v2, p0, Lg2/m$d;->d:LT/z1;

    iget-object v3, p0, Lg2/m$d;->e:LT/m0;

    iget-object v4, p0, Lg2/m$d;->f:LT/q0;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lg2/m$d;-><init>(Lg2/e;LT/z1;LT/m0;LT/q0;Ldh/e;)V

    iput-object p1, v6, Lg2/m$d;->b:Ljava/lang/Object;

    return-object v6
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LLi/g;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lg2/m$d;->n(LLi/g;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lg2/m$d;->a:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, Lg2/m$d;->b:Ljava/lang/Object;

    check-cast v0, Lf2/k;

    :try_start_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lg2/m$d;->b:Ljava/lang/Object;

    check-cast p1, LLi/g;

    iget-object v1, p0, Lg2/m$d;->d:LT/z1;

    invoke-static {v1}, Lg2/m;->n(LT/z1;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-le v1, v3, :cond_2

    iget-object v1, p0, Lg2/m$d;->e:LT/m0;

    const/4 v4, 0x0

    invoke-static {v1, v4}, Lg2/m;->p(LT/m0;F)V

    iget-object v1, p0, Lg2/m$d;->d:LT/z1;

    invoke-static {v1}, Lg2/m;->n(LT/z1;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, LZg/v;->D0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf2/k;

    iget-object v4, p0, Lg2/m$d;->c:Lg2/e;

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v4, v1}, Lg2/e;->p(Lf2/k;)V

    iget-object v4, p0, Lg2/m$d;->d:LT/z1;

    invoke-static {v4}, Lg2/m;->n(LT/z1;)Ljava/util/List;

    move-result-object v4

    iget-object v5, p0, Lg2/m$d;->d:LT/z1;

    invoke-static {v5}, Lg2/m;->n(LT/z1;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    add-int/lit8 v5, v5, -0x2

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lf2/k;

    iget-object v5, p0, Lg2/m$d;->c:Lg2/e;

    invoke-virtual {v5, v4}, Lg2/e;->p(Lf2/k;)V

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    :try_start_1
    new-instance v4, Lg2/m$d$a;

    iget-object v5, p0, Lg2/m$d;->d:LT/z1;

    iget-object v6, p0, Lg2/m$d;->f:LT/q0;

    iget-object v7, p0, Lg2/m$d;->e:LT/m0;

    invoke-direct {v4, v5, v6, v7}, Lg2/m$d$a;-><init>(LT/z1;LT/q0;LT/m0;)V

    iput-object v1, p0, Lg2/m$d;->b:Ljava/lang/Object;

    iput v3, p0, Lg2/m$d;->a:I

    invoke-interface {p1, v4, p0}, LLi/g;->b(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    move-object v0, v1

    :goto_1
    iget-object p1, p0, Lg2/m$d;->d:LT/z1;

    invoke-static {p1}, Lg2/m;->n(LT/z1;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-le p1, v3, :cond_4

    iget-object p1, p0, Lg2/m$d;->f:LT/q0;

    invoke-static {p1, v2}, Lg2/m;->k(LT/q0;Z)V

    iget-object p1, p0, Lg2/m$d;->c:Lg2/e;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1, v0, v2}, Lg2/e;->j(Lf2/k;Z)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    iget-object p1, p0, Lg2/m$d;->d:LT/z1;

    invoke-static {p1}, Lg2/m;->n(LT/z1;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-le p1, v3, :cond_4

    iget-object p1, p0, Lg2/m$d;->f:LT/q0;

    invoke-static {p1, v2}, Lg2/m;->k(LT/q0;Z)V

    :cond_4
    :goto_2
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LLi/g;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lg2/m$d;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lg2/m$d;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lg2/m$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
