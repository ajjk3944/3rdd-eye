.class final Landroidx/compose/foundation/g$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/g$a;->n2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Landroidx/compose/foundation/g$a;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/g$a;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/g$a$a;->b:Landroidx/compose/foundation/g$a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 1

    new-instance p1, Landroidx/compose/foundation/g$a$a;

    iget-object v0, p0, Landroidx/compose/foundation/g$a$a;->b:Landroidx/compose/foundation/g$a;

    invoke-direct {p1, v0, p2}, Landroidx/compose/foundation/g$a$a;-><init>(Landroidx/compose/foundation/g$a;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/g$a$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Landroidx/compose/foundation/g$a$a;->a:I

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

    new-instance p1, Lkotlin/jvm/internal/L;

    invoke-direct {p1}, Lkotlin/jvm/internal/L;-><init>()V

    new-instance v1, Lkotlin/jvm/internal/L;

    invoke-direct {v1}, Lkotlin/jvm/internal/L;-><init>()V

    new-instance v3, Lkotlin/jvm/internal/L;

    invoke-direct {v3}, Lkotlin/jvm/internal/L;-><init>()V

    iget-object v4, p0, Landroidx/compose/foundation/g$a$a;->b:Landroidx/compose/foundation/g$a;

    invoke-static {v4}, Landroidx/compose/foundation/g$a;->D2(Landroidx/compose/foundation/g$a;)Ly/k;

    move-result-object v4

    invoke-interface {v4}, Ly/k;->b()LLi/g;

    move-result-object v4

    new-instance v5, Landroidx/compose/foundation/g$a$a$a;

    iget-object v6, p0, Landroidx/compose/foundation/g$a$a;->b:Landroidx/compose/foundation/g$a;

    invoke-direct {v5, p1, v1, v3, v6}, Landroidx/compose/foundation/g$a$a$a;-><init>(Lkotlin/jvm/internal/L;Lkotlin/jvm/internal/L;Lkotlin/jvm/internal/L;Landroidx/compose/foundation/g$a;)V

    iput v2, p0, Landroidx/compose/foundation/g$a$a;->a:I

    invoke-interface {v4, v5, p0}, LLi/g;->b(LLi/h;Ldh/e;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/g$a$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/g$a$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/g$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
