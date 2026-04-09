.class final Landroidx/compose/foundation/gestures/b$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/b;->V2()Ly0/S;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Landroidx/compose/foundation/gestures/b;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/gestures/b;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/gestures/b$b;->c:Landroidx/compose/foundation/gestures/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance v0, Landroidx/compose/foundation/gestures/b$b;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/b$b;->c:Landroidx/compose/foundation/gestures/b;

    invoke-direct {v0, v1, p2}, Landroidx/compose/foundation/gestures/b$b;-><init>(Landroidx/compose/foundation/gestures/b;Ldh/e;)V

    iput-object p1, v0, Landroidx/compose/foundation/gestures/b$b;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly0/G;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/b$b;->n(Ly0/G;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Landroidx/compose/foundation/gestures/b$b;->a:I

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

    iget-object p1, p0, Landroidx/compose/foundation/gestures/b$b;->b:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Ly0/G;

    new-instance p1, Lz0/d;

    invoke-direct {p1}, Lz0/d;-><init>()V

    new-instance v6, Landroidx/compose/foundation/gestures/b$b$e;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/b$b;->c:Landroidx/compose/foundation/gestures/b;

    invoke-direct {v6, v1, p1}, Landroidx/compose/foundation/gestures/b$b$e;-><init>(Landroidx/compose/foundation/gestures/b;Lz0/d;)V

    new-instance v7, Landroidx/compose/foundation/gestures/b$b$d;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/b$b;->c:Landroidx/compose/foundation/gestures/b;

    invoke-direct {v7, p1, v1}, Landroidx/compose/foundation/gestures/b$b$d;-><init>(Lz0/d;Landroidx/compose/foundation/gestures/b;)V

    new-instance v8, Landroidx/compose/foundation/gestures/b$b$c;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/b$b;->c:Landroidx/compose/foundation/gestures/b;

    invoke-direct {v8, v1}, Landroidx/compose/foundation/gestures/b$b$c;-><init>(Landroidx/compose/foundation/gestures/b;)V

    new-instance v9, Landroidx/compose/foundation/gestures/b$b$f;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/b$b;->c:Landroidx/compose/foundation/gestures/b;

    invoke-direct {v9, v1}, Landroidx/compose/foundation/gestures/b$b$f;-><init>(Landroidx/compose/foundation/gestures/b;)V

    new-instance v10, Landroidx/compose/foundation/gestures/b$b$b;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/b$b;->c:Landroidx/compose/foundation/gestures/b;

    invoke-direct {v10, p1, v1}, Landroidx/compose/foundation/gestures/b$b$b;-><init>(Lz0/d;Landroidx/compose/foundation/gestures/b;)V

    new-instance p1, Landroidx/compose/foundation/gestures/b$b$a;

    iget-object v4, p0, Landroidx/compose/foundation/gestures/b$b;->c:Landroidx/compose/foundation/gestures/b;

    const/4 v11, 0x0

    move-object v3, p1

    invoke-direct/range {v3 .. v11}, Landroidx/compose/foundation/gestures/b$b$a;-><init>(Landroidx/compose/foundation/gestures/b;Ly0/G;Lmh/q;Lmh/l;Lmh/a;Lmh/a;Lmh/p;Ldh/e;)V

    iput v2, p0, Landroidx/compose/foundation/gestures/b$b;->a:I

    invoke-static {p1, p0}, LIi/O;->g(Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(Ly0/G;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/b$b;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/gestures/b$b;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/b$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
