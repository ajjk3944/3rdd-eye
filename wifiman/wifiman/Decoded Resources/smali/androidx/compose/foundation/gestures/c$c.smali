.class final Landroidx/compose/foundation/gestures/c$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/c;->X2(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Landroidx/compose/foundation/gestures/c;

.field final synthetic d:J


# direct methods
.method constructor <init>(Landroidx/compose/foundation/gestures/c;JLdh/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/gestures/c$c;->c:Landroidx/compose/foundation/gestures/c;

    iput-wide p2, p0, Landroidx/compose/foundation/gestures/c$c;->d:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 4

    new-instance v0, Landroidx/compose/foundation/gestures/c$c;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/c$c;->c:Landroidx/compose/foundation/gestures/c;

    iget-wide v2, p0, Landroidx/compose/foundation/gestures/c$c;->d:J

    invoke-direct {v0, v1, v2, v3, p2}, Landroidx/compose/foundation/gestures/c$c;-><init>(Landroidx/compose/foundation/gestures/c;JLdh/e;)V

    iput-object p1, v0, Landroidx/compose/foundation/gestures/c$c;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/c$c;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Landroidx/compose/foundation/gestures/c$c;->a:I

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

    iget-object p1, p0, Landroidx/compose/foundation/gestures/c$c;->b:Ljava/lang/Object;

    check-cast p1, LIi/N;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/c$c;->c:Landroidx/compose/foundation/gestures/c;

    invoke-static {v1}, Landroidx/compose/foundation/gestures/c;->f3(Landroidx/compose/foundation/gestures/c;)Lmh/q;

    move-result-object v1

    iget-object v3, p0, Landroidx/compose/foundation/gestures/c$c;->c:Landroidx/compose/foundation/gestures/c;

    iget-wide v4, p0, Landroidx/compose/foundation/gestures/c$c;->d:J

    invoke-static {v3, v4, v5}, Landroidx/compose/foundation/gestures/c;->h3(Landroidx/compose/foundation/gestures/c;J)J

    move-result-wide v3

    iget-object v5, p0, Landroidx/compose/foundation/gestures/c$c;->c:Landroidx/compose/foundation/gestures/c;

    invoke-static {v5}, Landroidx/compose/foundation/gestures/c;->g3(Landroidx/compose/foundation/gestures/c;)Lw/q;

    move-result-object v5

    invoke-static {v3, v4, v5}, Lw/l;->e(JLw/q;)F

    move-result v3

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    move-result-object v3

    iput v2, p0, Landroidx/compose/foundation/gestures/c$c;->a:I

    invoke-interface {v1, p1, v3, p0}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/c$c;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/gestures/c$c;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/c$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
