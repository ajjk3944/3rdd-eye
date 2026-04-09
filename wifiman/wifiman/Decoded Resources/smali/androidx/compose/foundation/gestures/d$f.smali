.class final Landroidx/compose/foundation/gestures/d$f;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/d;->j(Lw/A;JLdh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Lw/A;

.field final synthetic d:J

.field final synthetic e:Lkotlin/jvm/internal/K;


# direct methods
.method constructor <init>(Lw/A;JLkotlin/jvm/internal/K;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/gestures/d$f;->c:Lw/A;

    iput-wide p2, p0, Landroidx/compose/foundation/gestures/d$f;->d:J

    iput-object p4, p0, Landroidx/compose/foundation/gestures/d$f;->e:Lkotlin/jvm/internal/K;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 7

    new-instance v6, Landroidx/compose/foundation/gestures/d$f;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/d$f;->c:Lw/A;

    iget-wide v2, p0, Landroidx/compose/foundation/gestures/d$f;->d:J

    iget-object v4, p0, Landroidx/compose/foundation/gestures/d$f;->e:Lkotlin/jvm/internal/K;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/gestures/d$f;-><init>(Lw/A;JLkotlin/jvm/internal/K;Ldh/e;)V

    iput-object p1, v6, Landroidx/compose/foundation/gestures/d$f;->b:Ljava/lang/Object;

    return-object v6
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lw/p;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/d$f;->n(Lw/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Landroidx/compose/foundation/gestures/d$f;->a:I

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

    iget-object p1, p0, Landroidx/compose/foundation/gestures/d$f;->b:Ljava/lang/Object;

    check-cast p1, Lw/p;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/d$f;->c:Lw/A;

    iget-wide v3, p0, Landroidx/compose/foundation/gestures/d$f;->d:J

    invoke-virtual {v1, v3, v4}, Lw/A;->A(J)F

    move-result v6

    new-instance v9, Landroidx/compose/foundation/gestures/d$f$a;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/d$f;->e:Lkotlin/jvm/internal/K;

    iget-object v3, p0, Landroidx/compose/foundation/gestures/d$f;->c:Lw/A;

    invoke-direct {v9, v1, v3, p1}, Landroidx/compose/foundation/gestures/d$f$a;-><init>(Lkotlin/jvm/internal/K;Lw/A;Lw/p;)V

    iput v2, p0, Landroidx/compose/foundation/gestures/d$f;->a:I

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v11, 0xc

    const/4 v12, 0x0

    move-object v10, p0

    invoke-static/range {v5 .. v12}, Lr/m0;->e(FFFLr/i;Lmh/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(Lw/p;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/d$f;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/gestures/d$f;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/d$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
