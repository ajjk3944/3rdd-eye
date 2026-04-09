.class final Landroidx/compose/material/a$d$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/a$d$a;->a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lmh/p;

.field final synthetic c:Ljava/lang/Object;

.field final synthetic d:LIi/N;


# direct methods
.method constructor <init>(Lmh/p;Ljava/lang/Object;LIi/N;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/material/a$d$a$a;->b:Lmh/p;

    iput-object p2, p0, Landroidx/compose/material/a$d$a$a;->c:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/compose/material/a$d$a$a;->d:LIi/N;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance p1, Landroidx/compose/material/a$d$a$a;

    iget-object v0, p0, Landroidx/compose/material/a$d$a$a;->b:Lmh/p;

    iget-object v1, p0, Landroidx/compose/material/a$d$a$a;->c:Ljava/lang/Object;

    iget-object v2, p0, Landroidx/compose/material/a$d$a$a;->d:LIi/N;

    invoke-direct {p1, v0, v1, v2, p2}, Landroidx/compose/material/a$d$a$a;-><init>(Lmh/p;Ljava/lang/Object;LIi/N;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material/a$d$a$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Landroidx/compose/material/a$d$a$a;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/compose/material/a$d$a$a;->b:Lmh/p;

    iget-object v1, p0, Landroidx/compose/material/a$d$a$a;->c:Ljava/lang/Object;

    iput v2, p0, Landroidx/compose/material/a$d$a$a;->a:I

    invoke-interface {p1, v1, p0}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, Landroidx/compose/material/a$d$a$a;->d:LIi/N;

    new-instance v0, Landroidx/compose/material/AnchoredDragFinishedSignal;

    invoke-direct {v0}, Landroidx/compose/material/AnchoredDragFinishedSignal;-><init>()V

    invoke-static {p1, v0}, LIi/O;->d(LIi/N;Ljava/util/concurrent/CancellationException;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material/a$d$a$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/material/a$d$a$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Landroidx/compose/material/a$d$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
