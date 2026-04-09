.class final Landroidx/compose/foundation/gestures/b$f;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/b;->c3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:I

.field private synthetic d:Ljava/lang/Object;

.field final synthetic e:Landroidx/compose/foundation/gestures/b;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/gestures/b;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/gestures/b$f;->e:Landroidx/compose/foundation/gestures/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance v0, Landroidx/compose/foundation/gestures/b$f;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/b$f;->e:Landroidx/compose/foundation/gestures/b;

    invoke-direct {v0, v1, p2}, Landroidx/compose/foundation/gestures/b$f;-><init>(Landroidx/compose/foundation/gestures/b;Ldh/e;)V

    iput-object p1, v0, Landroidx/compose/foundation/gestures/b$f;->d:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/b$f;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Landroidx/compose/foundation/gestures/b$f;->c:I

    const/4 v2, 0x0

    packed-switch v1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v1, p0, Landroidx/compose/foundation/gestures/b$f;->d:Ljava/lang/Object;

    check-cast v1, LIi/N;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_1
    iget-object v1, p0, Landroidx/compose/foundation/gestures/b$f;->d:Ljava/lang/Object;

    check-cast v1, LIi/N;

    :goto_0
    :try_start_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_2

    goto :goto_1

    :pswitch_2
    iget-object v1, p0, Landroidx/compose/foundation/gestures/b$f;->d:Ljava/lang/Object;

    check-cast v1, LIi/N;

    goto :goto_0

    :cond_0
    :goto_1
    move-object v4, v1

    goto :goto_2

    :pswitch_3
    iget-object v1, p0, Landroidx/compose/foundation/gestures/b$f;->a:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/N;

    iget-object v3, p0, Landroidx/compose/foundation/gestures/b$f;->d:Ljava/lang/Object;

    check-cast v3, LIi/N;

    :try_start_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    :cond_1
    move-object v4, v3

    goto/16 :goto_6

    :catch_0
    move-object v1, v3

    goto/16 :goto_7

    :pswitch_4
    iget-object v1, p0, Landroidx/compose/foundation/gestures/b$f;->a:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/N;

    iget-object v3, p0, Landroidx/compose/foundation/gestures/b$f;->d:Ljava/lang/Object;

    check-cast v3, LIi/N;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_5

    :pswitch_5
    iget-object v1, p0, Landroidx/compose/foundation/gestures/b$f;->b:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/N;

    iget-object v3, p0, Landroidx/compose/foundation/gestures/b$f;->a:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/internal/N;

    iget-object v4, p0, Landroidx/compose/foundation/gestures/b$f;->d:Ljava/lang/Object;

    check-cast v4, LIi/N;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_3

    :pswitch_6
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/compose/foundation/gestures/b$f;->d:Ljava/lang/Object;

    check-cast p1, LIi/N;

    move-object v4, p1

    :cond_2
    :goto_2
    invoke-static {v4}, LIi/O;->i(LIi/N;)Z

    move-result p1

    if-eqz p1, :cond_7

    new-instance v1, Lkotlin/jvm/internal/N;

    invoke-direct {v1}, Lkotlin/jvm/internal/N;-><init>()V

    iget-object p1, p0, Landroidx/compose/foundation/gestures/b$f;->e:Landroidx/compose/foundation/gestures/b;

    invoke-static {p1}, Landroidx/compose/foundation/gestures/b;->J2(Landroidx/compose/foundation/gestures/b;)LKi/g;

    move-result-object p1

    if-eqz p1, :cond_4

    iput-object v4, p0, Landroidx/compose/foundation/gestures/b$f;->d:Ljava/lang/Object;

    iput-object v1, p0, Landroidx/compose/foundation/gestures/b$f;->a:Ljava/lang/Object;

    iput-object v1, p0, Landroidx/compose/foundation/gestures/b$f;->b:Ljava/lang/Object;

    const/4 v3, 0x1

    iput v3, p0, Landroidx/compose/foundation/gestures/b$f;->c:I

    invoke-interface {p1, p0}, LKi/v;->c(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    move-object v3, v1

    :goto_3
    check-cast p1, Landroidx/compose/foundation/gestures/a;

    goto :goto_4

    :cond_4
    move-object v3, v1

    move-object p1, v2

    :goto_4
    iput-object p1, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    iget-object p1, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    instance-of v1, p1, Landroidx/compose/foundation/gestures/a$c;

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroidx/compose/foundation/gestures/b$f;->e:Landroidx/compose/foundation/gestures/b;

    check-cast p1, Landroidx/compose/foundation/gestures/a$c;

    iput-object v4, p0, Landroidx/compose/foundation/gestures/b$f;->d:Ljava/lang/Object;

    iput-object v3, p0, Landroidx/compose/foundation/gestures/b$f;->a:Ljava/lang/Object;

    iput-object v2, p0, Landroidx/compose/foundation/gestures/b$f;->b:Ljava/lang/Object;

    const/4 v5, 0x2

    iput v5, p0, Landroidx/compose/foundation/gestures/b$f;->c:I

    invoke-static {v1, p1, p0}, Landroidx/compose/foundation/gestures/b;->N2(Landroidx/compose/foundation/gestures/b;Landroidx/compose/foundation/gestures/a$c;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    move-object v1, v3

    move-object v3, v4

    :goto_5
    :try_start_2
    iget-object p1, p0, Landroidx/compose/foundation/gestures/b$f;->e:Landroidx/compose/foundation/gestures/b;

    new-instance v4, Landroidx/compose/foundation/gestures/b$f$a;

    invoke-direct {v4, v1, p1, v2}, Landroidx/compose/foundation/gestures/b$f$a;-><init>(Lkotlin/jvm/internal/N;Landroidx/compose/foundation/gestures/b;Ldh/e;)V

    iput-object v3, p0, Landroidx/compose/foundation/gestures/b$f;->d:Ljava/lang/Object;

    iput-object v1, p0, Landroidx/compose/foundation/gestures/b$f;->a:Ljava/lang/Object;

    const/4 v5, 0x3

    iput v5, p0, Landroidx/compose/foundation/gestures/b$f;->c:I

    invoke-virtual {p1, v4, p0}, Landroidx/compose/foundation/gestures/b;->S2(Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0

    if-ne p1, v0, :cond_1

    return-object v0

    :goto_6
    :try_start_3
    iget-object p1, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    instance-of v1, p1, Landroidx/compose/foundation/gestures/a$d;

    if-eqz v1, :cond_6

    iget-object v1, p0, Landroidx/compose/foundation/gestures/b$f;->e:Landroidx/compose/foundation/gestures/b;

    const-string v3, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragStopped"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroidx/compose/foundation/gestures/a$d;

    iput-object v4, p0, Landroidx/compose/foundation/gestures/b$f;->d:Ljava/lang/Object;

    iput-object v2, p0, Landroidx/compose/foundation/gestures/b$f;->a:Ljava/lang/Object;

    const/4 v3, 0x4

    iput v3, p0, Landroidx/compose/foundation/gestures/b$f;->c:I

    invoke-static {v1, p1, p0}, Landroidx/compose/foundation/gestures/b;->O2(Landroidx/compose/foundation/gestures/b;Landroidx/compose/foundation/gestures/a$d;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :catch_1
    move-object v1, v4

    goto :goto_7

    :cond_6
    instance-of p1, p1, Landroidx/compose/foundation/gestures/a$a;

    if-eqz p1, :cond_2

    iget-object p1, p0, Landroidx/compose/foundation/gestures/b$f;->e:Landroidx/compose/foundation/gestures/b;

    iput-object v4, p0, Landroidx/compose/foundation/gestures/b$f;->d:Ljava/lang/Object;

    iput-object v2, p0, Landroidx/compose/foundation/gestures/b$f;->a:Ljava/lang/Object;

    const/4 v1, 0x5

    iput v1, p0, Landroidx/compose/foundation/gestures/b$f;->c:I

    invoke-static {p1, p0}, Landroidx/compose/foundation/gestures/b;->M2(Landroidx/compose/foundation/gestures/b;Ldh/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_1

    if-ne p1, v0, :cond_2

    return-object v0

    :catch_2
    :goto_7
    iget-object p1, p0, Landroidx/compose/foundation/gestures/b$f;->e:Landroidx/compose/foundation/gestures/b;

    iput-object v1, p0, Landroidx/compose/foundation/gestures/b$f;->d:Ljava/lang/Object;

    iput-object v2, p0, Landroidx/compose/foundation/gestures/b$f;->a:Ljava/lang/Object;

    const/4 v3, 0x6

    iput v3, p0, Landroidx/compose/foundation/gestures/b$f;->c:I

    invoke-static {p1, p0}, Landroidx/compose/foundation/gestures/b;->M2(Landroidx/compose/foundation/gestures/b;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_0

    return-object v0

    :cond_7
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/b$f;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/gestures/b$f;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/b$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
