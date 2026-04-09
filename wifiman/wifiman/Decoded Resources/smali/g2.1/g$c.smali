.class final Lg2/g$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg2/g;->a(Lg2/i;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LT/z1;

.field final synthetic c:Lg2/i;

.field final synthetic d:Landroidx/compose/runtime/snapshots/k;


# direct methods
.method constructor <init>(LT/z1;Lg2/i;Landroidx/compose/runtime/snapshots/k;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lg2/g$c;->b:LT/z1;

    iput-object p2, p0, Lg2/g$c;->c:Lg2/i;

    iput-object p3, p0, Lg2/g$c;->d:Landroidx/compose/runtime/snapshots/k;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance p1, Lg2/g$c;

    iget-object v0, p0, Lg2/g$c;->b:LT/z1;

    iget-object v1, p0, Lg2/g$c;->c:Lg2/i;

    iget-object v2, p0, Lg2/g$c;->d:Landroidx/compose/runtime/snapshots/k;

    invoke-direct {p1, v0, v1, v2, p2}, Lg2/g$c;-><init>(LT/z1;Lg2/i;Landroidx/compose/runtime/snapshots/k;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lg2/g$c;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, Lg2/g$c;->a:I

    if-nez v0, :cond_2

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lg2/g$c;->b:LT/z1;

    invoke-static {p1}, Lg2/g;->e(LT/z1;)Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, Lg2/g$c;->c:Lg2/i;

    iget-object v1, p0, Lg2/g$c;->d:Landroidx/compose/runtime/snapshots/k;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf2/k;

    invoke-virtual {v0}, Lg2/i;->n()LLi/N;

    move-result-object v3

    invoke-interface {v3}, LLi/N;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v1, v2}, Landroidx/compose/runtime/snapshots/k;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v0, v2}, Lg2/i;->p(Lf2/k;)V

    goto :goto_0

    :cond_1
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lg2/g$c;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lg2/g$c;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lg2/g$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
