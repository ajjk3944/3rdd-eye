.class public final Lda/I$g$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lda/I$g;->b(LLi/h;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ldh/e;)V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lda/I$g$b;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lda/I$g$b;->b:Ljava/lang/Object;

    check-cast p1, LLi/h;

    iget-object v1, p0, Lda/I$g$b;->c:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aget-object v4, v1, v3

    instance-of v5, v4, Ls9/d;

    const/4 v6, 0x0

    if-eqz v5, :cond_2

    check-cast v4, Ls9/d;

    goto :goto_0

    :cond_2
    move-object v4, v6

    :goto_0
    if-nez v4, :cond_3

    move v4, v2

    goto :goto_1

    :cond_3
    move v4, v3

    :goto_1
    aget-object v5, v1, v2

    instance-of v7, v5, Ljava/lang/Boolean;

    if-eqz v7, :cond_4

    check-cast v5, Ljava/lang/Boolean;

    goto :goto_2

    :cond_4
    move-object v5, v6

    :goto_2
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const/4 v7, 0x2

    aget-object v7, v1, v7

    instance-of v8, v7, Ls9/d;

    if-eqz v8, :cond_5

    check-cast v7, Ls9/d;

    goto :goto_3

    :cond_5
    move-object v7, v6

    :goto_3
    if-nez v7, :cond_6

    move v7, v2

    goto :goto_4

    :cond_6
    move v7, v3

    :goto_4
    const/4 v8, 0x3

    aget-object v8, v1, v8

    instance-of v9, v8, Ljava/lang/Boolean;

    if-eqz v9, :cond_7

    check-cast v8, Ljava/lang/Boolean;

    goto :goto_5

    :cond_7
    move-object v8, v6

    :goto_5
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    const/4 v9, 0x4

    aget-object v1, v1, v9

    instance-of v9, v1, Ljava/lang/Boolean;

    if-eqz v9, :cond_8

    move-object v6, v1

    check-cast v6, Ljava/lang/Boolean;

    :cond_8
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v6, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v4, :cond_9

    if-eqz v5, :cond_9

    if-eqz v7, :cond_9

    if-eqz v8, :cond_9

    if-nez v1, :cond_9

    move v3, v2

    :cond_9
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput v2, p0, Lda/I$g$b;->a:I

    invoke-interface {p1, v1, p0}, LLi/h;->a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    return-object v0

    :cond_a
    :goto_6
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LLi/h;[Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lda/I$g$b;

    invoke-direct {v0, p3}, Lda/I$g$b;-><init>(Ldh/e;)V

    iput-object p1, v0, Lda/I$g$b;->b:Ljava/lang/Object;

    iput-object p2, v0, Lda/I$g$b;->c:Ljava/lang/Object;

    sget-object p1, LYg/J;->a:LYg/J;

    invoke-virtual {v0, p1}, Lda/I$g$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LLi/h;

    check-cast p2, [Ljava/lang/Object;

    check-cast p3, Ldh/e;

    invoke-virtual {p0, p1, p2, p3}, Lda/I$g$b;->n(LLi/h;[Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
