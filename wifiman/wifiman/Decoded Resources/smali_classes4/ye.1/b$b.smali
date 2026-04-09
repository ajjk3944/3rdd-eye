.class public final Lye/b$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lye/b;->a(Lye/g;Landroidx/lifecycle/k$b;Lmh/a;)LLi/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field synthetic c:Ljava/lang/Object;

.field final synthetic d:Lmh/a;


# direct methods
.method public constructor <init>(Ldh/e;Lmh/a;)V
    .locals 0

    iput-object p2, p0, Lye/b$b;->d:Lmh/a;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lye/b$b;->a:I

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

    iget-object p1, p0, Lye/b$b;->b:Ljava/lang/Object;

    check-cast p1, LLi/h;

    iget-object v1, p0, Lye/b$b;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lye/b$b;->d:Lmh/a;

    invoke-interface {v1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LLi/g;

    goto :goto_0

    :cond_2
    invoke-static {}, LLi/i;->u()LLi/g;

    move-result-object v1

    :goto_0
    iput v2, p0, Lye/b$b;->a:I

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

    new-instance v0, Lye/b$b;

    iget-object v1, p0, Lye/b$b;->d:Lmh/a;

    invoke-direct {v0, p3, v1}, Lye/b$b;-><init>(Ldh/e;Lmh/a;)V

    iput-object p1, v0, Lye/b$b;->b:Ljava/lang/Object;

    iput-object p2, v0, Lye/b$b;->c:Ljava/lang/Object;

    sget-object p1, LYg/J;->a:LYg/J;

    invoke-virtual {v0, p1}, Lye/b$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LLi/h;

    check-cast p3, Ldh/e;

    invoke-virtual {p0, p1, p2, p3}, Lye/b$b;->n(LLi/h;Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
