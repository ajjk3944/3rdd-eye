.class final LLi/L$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLi/L;->a(LLi/N;)LLi/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:LLi/N;


# direct methods
.method constructor <init>(LLi/N;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LLi/L$a;->c:LLi/N;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance v0, LLi/L$a;

    iget-object v1, p0, LLi/L$a;->c:LLi/N;

    invoke-direct {v0, v1, p2}, LLi/L$a;-><init>(LLi/N;Ldh/e;)V

    iput-object p1, v0, LLi/L$a;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LLi/h;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LLi/L$a;->n(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LLi/L$a;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-eq v1, v2, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LLi/L$a;->b:Ljava/lang/Object;

    check-cast p1, LLi/h;

    new-instance v1, Lkotlin/jvm/internal/J;

    invoke-direct {v1}, Lkotlin/jvm/internal/J;-><init>()V

    iget-object v3, p0, LLi/L$a;->c:LLi/N;

    new-instance v4, LLi/L$a$a;

    invoke-direct {v4, v1, p1}, LLi/L$a$a;-><init>(Lkotlin/jvm/internal/J;LLi/h;)V

    iput v2, p0, LLi/L$a;->a:I

    invoke-interface {v3, v4, p0}, LLi/D;->b(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public final n(LLi/h;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LLi/L$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LLi/L$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LLi/L$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
