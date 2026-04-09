.class final Lbf/q$b$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbf/q$b;->f(Lz/N;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Landroidx/compose/runtime/snapshots/k;

.field final synthetic c:Lbf/k$a;


# direct methods
.method constructor <init>(Landroidx/compose/runtime/snapshots/k;Lbf/k$a;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lbf/q$b$b;->b:Landroidx/compose/runtime/snapshots/k;

    iput-object p2, p0, Lbf/q$b$b;->c:Lbf/k$a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, Lbf/q$b$b;

    iget-object v0, p0, Lbf/q$b$b;->b:Landroidx/compose/runtime/snapshots/k;

    iget-object v1, p0, Lbf/q$b$b;->c:Lbf/k$a;

    invoke-direct {p1, v0, v1, p2}, Lbf/q$b$b;-><init>(Landroidx/compose/runtime/snapshots/k;Lbf/k$a;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lbf/q$b$b;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, Lbf/q$b$b;->a:I

    if-nez v0, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lbf/q$b$b;->b:Landroidx/compose/runtime/snapshots/k;

    iget-object v0, p0, Lbf/q$b$b;->c:Lbf/k$a;

    invoke-virtual {v0}, Lbf/k$a;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {p1, v0}, Ly6/a;->b(Ljava/util/List;Ljava/util/Collection;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lbf/q$b$b;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lbf/q$b$b;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lbf/q$b$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
