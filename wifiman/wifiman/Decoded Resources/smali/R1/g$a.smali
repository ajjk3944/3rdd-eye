.class final LR1/g$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR1/g;->a(LO1/e;Lmh/p;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field synthetic b:Ljava/lang/Object;

.field final synthetic c:Lmh/p;


# direct methods
.method constructor <init>(Lmh/p;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LR1/g$a;->c:Lmh/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance v0, LR1/g$a;

    iget-object v1, p0, LR1/g$a;->c:Lmh/p;

    invoke-direct {v0, v1, p2}, LR1/g$a;-><init>(Lmh/p;Ldh/e;)V

    iput-object p1, v0, LR1/g$a;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LR1/d;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LR1/g$a;->n(LR1/d;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LR1/g$a;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, LR1/g$a;->b:Ljava/lang/Object;

    check-cast v0, LR1/a;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LR1/g$a;->b:Ljava/lang/Object;

    check-cast p1, LR1/d;

    invoke-virtual {p1}, LR1/d;->c()LR1/a;

    move-result-object p1

    iget-object v1, p0, LR1/g$a;->c:Lmh/p;

    iput-object p1, p0, LR1/g$a;->b:Ljava/lang/Object;

    iput v2, p0, LR1/g$a;->a:I

    invoke-interface {v1, p1, p0}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, p1

    :goto_0
    return-object v0
.end method

.method public final n(LR1/d;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LR1/g$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LR1/g$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LR1/g$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
