.class final Landroidx/compose/material/a$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/a$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/N;

.field final synthetic b:LIi/N;

.field final synthetic c:Lmh/p;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/N;LIi/N;Lmh/p;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/material/a$d$a;->a:Lkotlin/jvm/internal/N;

    iput-object p2, p0, Landroidx/compose/material/a$d$a;->b:LIi/N;

    iput-object p3, p0, Landroidx/compose/material/a$d$a;->c:Lmh/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Landroidx/compose/material/a$d$a$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Landroidx/compose/material/a$d$a$b;

    iget v1, v0, Landroidx/compose/material/a$d$a$b;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Landroidx/compose/material/a$d$a$b;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/compose/material/a$d$a$b;

    invoke-direct {v0, p0, p2}, Landroidx/compose/material/a$d$a$b;-><init>(Landroidx/compose/material/a$d$a;Ldh/e;)V

    :goto_0
    iget-object p2, v0, Landroidx/compose/material/a$d$a$b;->d:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Landroidx/compose/material/a$d$a$b;->f:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Landroidx/compose/material/a$d$a$b;->c:Ljava/lang/Object;

    check-cast p1, LIi/y0;

    iget-object p1, v0, Landroidx/compose/material/a$d$a$b;->b:Ljava/lang/Object;

    iget-object v0, v0, Landroidx/compose/material/a$d$a$b;->a:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/material/a$d$a;

    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Landroidx/compose/material/a$d$a;->a:Lkotlin/jvm/internal/N;

    iget-object p2, p2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast p2, LIi/y0;

    if-eqz p2, :cond_3

    new-instance v2, Landroidx/compose/material/AnchoredDragFinishedSignal;

    invoke-direct {v2}, Landroidx/compose/material/AnchoredDragFinishedSignal;-><init>()V

    invoke-interface {p2, v2}, LIi/y0;->cancel(Ljava/util/concurrent/CancellationException;)V

    iput-object p0, v0, Landroidx/compose/material/a$d$a$b;->a:Ljava/lang/Object;

    iput-object p1, v0, Landroidx/compose/material/a$d$a$b;->b:Ljava/lang/Object;

    iput-object p2, v0, Landroidx/compose/material/a$d$a$b;->c:Ljava/lang/Object;

    iput v3, v0, Landroidx/compose/material/a$d$a$b;->f:I

    invoke-interface {p2, v0}, LIi/y0;->join(Ldh/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    iget-object p2, v0, Landroidx/compose/material/a$d$a;->a:Lkotlin/jvm/internal/N;

    iget-object v1, v0, Landroidx/compose/material/a$d$a;->b:LIi/N;

    sget-object v3, LIi/P;->UNDISPATCHED:LIi/P;

    new-instance v4, Landroidx/compose/material/a$d$a$a;

    iget-object v0, v0, Landroidx/compose/material/a$d$a;->c:Lmh/p;

    const/4 v2, 0x0

    invoke-direct {v4, v0, p1, v1, v2}, Landroidx/compose/material/a$d$a$a;-><init>(Lmh/p;Ljava/lang/Object;LIi/N;Ldh/e;)V

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    move-result-object p1

    iput-object p1, p2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
