.class public final LLi/s$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLi/s;->e(LLi/g;I)LLi/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LLi/g;

.field final synthetic b:I


# direct methods
.method public constructor <init>(LLi/g;I)V
    .locals 0

    iput-object p1, p0, LLi/s$f;->a:LLi/g;

    iput p2, p0, LLi/s$f;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(LLi/h;Ldh/e;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, LLi/s$f$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LLi/s$f$a;

    iget v1, v0, LLi/s$f$a;->b:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LLi/s$f$a;->b:I

    goto :goto_0

    :cond_0
    new-instance v0, LLi/s$f$a;

    invoke-direct {v0, p0, p2}, LLi/s$f$a;-><init>(LLi/s$f;Ldh/e;)V

    :goto_0
    iget-object p2, v0, LLi/s$f$a;->a:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LLi/s$f$a;->b:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, LLi/s$f$a;->d:Ljava/lang/Object;

    :try_start_0
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkotlinx/coroutines/flow/internal/AbortFlowException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p2

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    new-instance p2, Ljava/lang/Object;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    new-instance v2, Lkotlin/jvm/internal/L;

    invoke-direct {v2}, Lkotlin/jvm/internal/L;-><init>()V

    :try_start_1
    iget-object v4, p0, LLi/s$f;->a:LLi/g;

    new-instance v5, LLi/s$g;

    iget v6, p0, LLi/s$f;->b:I

    invoke-direct {v5, v2, v6, p1, p2}, LLi/s$g;-><init>(Lkotlin/jvm/internal/L;ILLi/h;Ljava/lang/Object;)V

    iput-object p2, v0, LLi/s$f$a;->d:Ljava/lang/Object;

    iput v3, v0, LLi/s$f$a;->b:I

    invoke-interface {v4, v5, v0}, LLi/g;->b(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Lkotlinx/coroutines/flow/internal/AbortFlowException; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p1, v1, :cond_3

    return-object v1

    :catch_1
    move-exception p1

    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    :goto_1
    invoke-static {p2, p1}, LMi/n;->a(Lkotlinx/coroutines/flow/internal/AbortFlowException;Ljava/lang/Object;)V

    :cond_3
    :goto_2
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
