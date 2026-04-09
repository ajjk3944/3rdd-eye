.class public final Ljj/i$g;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljj/i;->Q()LLi/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field synthetic c:Ljava/lang/Object;

.field final synthetic d:Ljj/i;


# direct methods
.method public constructor <init>(Ldh/e;Ljj/i;)V
    .locals 0

    iput-object p2, p0, Ljj/i$g;->d:Ljj/i;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ljj/i$g;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Ljj/i$g;->b:Ljava/lang/Object;

    check-cast p1, LLi/h;

    iget-object v1, p0, Ljj/i$g;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Ljj/i$i;

    iget-object v3, p0, Ljj/i$g;->d:Ljj/i;

    invoke-direct {v1, v3}, Ljj/i$i;-><init>(Ljj/i;)V

    invoke-static {v1}, LT/o1;->o(Lmh/a;)LLi/g;

    move-result-object v1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    invoke-static {v1}, LLi/i;->B(Ljava/lang/Object;)LLi/g;

    move-result-object v1

    :goto_0
    iput v2, p0, Ljj/i$g;->a:I

    invoke-static {p1, v1, p0}, LLi/i;->t(LLi/h;LLi/g;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_1
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LLi/h;Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Ljj/i$g;

    iget-object v1, p0, Ljj/i$g;->d:Ljj/i;

    invoke-direct {v0, p3, v1}, Ljj/i$g;-><init>(Ldh/e;Ljj/i;)V

    iput-object p1, v0, Ljj/i$g;->b:Ljava/lang/Object;

    iput-object p2, v0, Ljj/i$g;->c:Ljava/lang/Object;

    sget-object p1, LYg/J;->a:LYg/J;

    invoke-virtual {v0, p1}, Ljj/i$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LLi/h;

    check-cast p3, Ldh/e;

    invoke-virtual {p0, p1, p2, p3}, Ljj/i$g;->n(LLi/h;Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
