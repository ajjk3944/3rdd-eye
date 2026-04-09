.class final Landroidx/compose/foundation/gestures/b$f$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/b$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:I

.field synthetic c:Ljava/lang/Object;

.field final synthetic d:Lkotlin/jvm/internal/N;

.field final synthetic e:Landroidx/compose/foundation/gestures/b;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/N;Landroidx/compose/foundation/gestures/b;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/gestures/b$f$a;->d:Lkotlin/jvm/internal/N;

    iput-object p2, p0, Landroidx/compose/foundation/gestures/b$f$a;->e:Landroidx/compose/foundation/gestures/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance v0, Landroidx/compose/foundation/gestures/b$f$a;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/b$f$a;->d:Lkotlin/jvm/internal/N;

    iget-object v2, p0, Landroidx/compose/foundation/gestures/b$f$a;->e:Landroidx/compose/foundation/gestures/b;

    invoke-direct {v0, v1, v2, p2}, Landroidx/compose/foundation/gestures/b$f$a;-><init>(Lkotlin/jvm/internal/N;Landroidx/compose/foundation/gestures/b;Ldh/e;)V

    iput-object p1, v0, Landroidx/compose/foundation/gestures/b$f$a;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmh/l;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/b$f$a;->n(Lmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Landroidx/compose/foundation/gestures/b$f$a;->b:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Landroidx/compose/foundation/gestures/b$f$a;->a:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/N;

    iget-object v3, p0, Landroidx/compose/foundation/gestures/b$f$a;->c:Ljava/lang/Object;

    check-cast v3, Lmh/l;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/compose/foundation/gestures/b$f$a;->c:Ljava/lang/Object;

    check-cast p1, Lmh/l;

    move-object v3, p1

    :goto_0
    iget-object p1, p0, Landroidx/compose/foundation/gestures/b$f$a;->d:Lkotlin/jvm/internal/N;

    iget-object p1, p1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    instance-of v1, p1, Landroidx/compose/foundation/gestures/a$d;

    if-nez v1, :cond_6

    instance-of v1, p1, Landroidx/compose/foundation/gestures/a$a;

    if-nez v1, :cond_6

    instance-of v1, p1, Landroidx/compose/foundation/gestures/a$b;

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Landroidx/compose/foundation/gestures/a$b;

    goto :goto_1

    :cond_2
    move-object p1, v4

    :goto_1
    if-eqz p1, :cond_3

    invoke-interface {v3, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    iget-object v1, p0, Landroidx/compose/foundation/gestures/b$f$a;->d:Lkotlin/jvm/internal/N;

    iget-object p1, p0, Landroidx/compose/foundation/gestures/b$f$a;->e:Landroidx/compose/foundation/gestures/b;

    invoke-static {p1}, Landroidx/compose/foundation/gestures/b;->J2(Landroidx/compose/foundation/gestures/b;)LKi/g;

    move-result-object p1

    if-eqz p1, :cond_5

    iput-object v3, p0, Landroidx/compose/foundation/gestures/b$f$a;->c:Ljava/lang/Object;

    iput-object v1, p0, Landroidx/compose/foundation/gestures/b$f$a;->a:Ljava/lang/Object;

    iput v2, p0, Landroidx/compose/foundation/gestures/b$f$a;->b:I

    invoke-interface {p1, p0}, LKi/v;->c(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_2
    move-object v4, p1

    check-cast v4, Landroidx/compose/foundation/gestures/a;

    :cond_5
    iput-object v4, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    goto :goto_0

    :cond_6
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(Lmh/l;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/b$f$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/gestures/b$f$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/b$f$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
