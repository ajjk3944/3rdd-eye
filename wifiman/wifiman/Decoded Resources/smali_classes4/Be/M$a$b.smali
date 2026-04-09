.class final LBe/M$a$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBe/M$a;->c(FFLT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field synthetic b:F

.field final synthetic c:LQ/z;


# direct methods
.method constructor <init>(LQ/z;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LBe/M$a$b;->c:LQ/z;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LBe/M$a$b;->a:I

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

    iget p1, p0, LBe/M$a$b;->b:F

    iget-object v1, p0, LBe/M$a$b;->c:LQ/z;

    invoke-interface {v1}, LQ/z;->getState()LQ/A;

    move-result-object v1

    iget-object v3, p0, LBe/M$a$b;->c:LQ/z;

    invoke-interface {v3}, LQ/z;->b()Lr/z;

    move-result-object v3

    iget-object v4, p0, LBe/M$a$b;->c:LQ/z;

    invoke-interface {v4}, LQ/z;->c()Lr/i;

    move-result-object v4

    iput v2, p0, LBe/M$a$b;->a:I

    invoke-static {v1, p1, v3, v4, p0}, LBe/M;->f(LQ/A;FLr/z;Lr/i;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LIi/N;FLdh/e;)Ljava/lang/Object;
    .locals 1

    new-instance p1, LBe/M$a$b;

    iget-object v0, p0, LBe/M$a$b;->c:LQ/z;

    invoke-direct {p1, v0, p3}, LBe/M$a$b;-><init>(LQ/z;Ldh/e;)V

    iput p2, p1, LBe/M$a$b;->b:F

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LBe/M$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    check-cast p3, Ldh/e;

    invoke-virtual {p0, p1, p2, p3}, LBe/M$a$b;->n(LIi/N;FLdh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
