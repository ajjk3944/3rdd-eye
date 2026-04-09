.class final LQ0/f$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ0/f;->j(Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LQ0/f;

.field final synthetic c:LQ0/j;


# direct methods
.method constructor <init>(LQ0/f;LQ0/j;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LQ0/f$b;->b:LQ0/f;

    iput-object p2, p0, LQ0/f$b;->c:LQ0/j;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ldh/e;)Ldh/e;
    .locals 3

    new-instance v0, LQ0/f$b;

    iget-object v1, p0, LQ0/f$b;->b:LQ0/f;

    iget-object v2, p0, LQ0/f$b;->c:LQ0/j;

    invoke-direct {v0, v1, v2, p1}, LQ0/f$b;-><init>(LQ0/f;LQ0/j;Ldh/e;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldh/e;

    invoke-virtual {p0, p1}, LQ0/f$b;->n(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LQ0/f$b;->a:I

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

    iget-object p1, p0, LQ0/f$b;->b:LQ0/f;

    iget-object v1, p0, LQ0/f$b;->c:LQ0/j;

    iput v2, p0, LQ0/f$b;->a:I

    invoke-virtual {p1, v1, p0}, LQ0/f;->p(LQ0/j;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    return-object p1
.end method

.method public final n(Ldh/e;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, LQ0/f$b;->create(Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LQ0/f$b;

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-virtual {p1, v0}, LQ0/f$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
