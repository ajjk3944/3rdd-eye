.class public final LLi/x$b$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLi/x$b;->b(LLi/h;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field synthetic c:Ljava/lang/Object;

.field final synthetic d:Lmh/s;


# direct methods
.method public constructor <init>(Ldh/e;Lmh/s;)V
    .locals 0

    iput-object p2, p0, LLi/x$b$a;->d:Lmh/s;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LLi/x$b$a;->a:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, LLi/x$b$a;->b:Ljava/lang/Object;

    check-cast v1, LLi/h;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LLi/x$b$a;->b:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, LLi/h;

    iget-object p1, p0, LLi/x$b$a;->c:Ljava/lang/Object;

    check-cast p1, [Ljava/lang/Object;

    iget-object v4, p0, LLi/x$b$a;->d:Lmh/s;

    const/4 v5, 0x0

    aget-object v5, p1, v5

    aget-object v6, p1, v3

    aget-object v7, p1, v2

    const/4 v8, 0x3

    aget-object v8, p1, v8

    iput-object v1, p0, LLi/x$b$a;->b:Ljava/lang/Object;

    iput v3, p0, LLi/x$b$a;->a:I

    const/4 p1, 0x6

    invoke-static {p1}, Lkotlin/jvm/internal/q;->a(I)V

    move-object v9, p0

    invoke-interface/range {v4 .. v9}, Lmh/s;->K(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const/4 v3, 0x7

    invoke-static {v3}, Lkotlin/jvm/internal/q;->a(I)V

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    const/4 v3, 0x0

    iput-object v3, p0, LLi/x$b$a;->b:Ljava/lang/Object;

    iput v2, p0, LLi/x$b$a;->a:I

    invoke-interface {v1, p1, p0}, LLi/h;->a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LLi/h;[Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, LLi/x$b$a;

    iget-object v1, p0, LLi/x$b$a;->d:Lmh/s;

    invoke-direct {v0, p3, v1}, LLi/x$b$a;-><init>(Ldh/e;Lmh/s;)V

    iput-object p1, v0, LLi/x$b$a;->b:Ljava/lang/Object;

    iput-object p2, v0, LLi/x$b$a;->c:Ljava/lang/Object;

    sget-object p1, LYg/J;->a:LYg/J;

    invoke-virtual {v0, p1}, LLi/x$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LLi/h;

    check-cast p2, [Ljava/lang/Object;

    check-cast p3, Ldh/e;

    invoke-virtual {p0, p1, p2, p3}, LLi/x$b$a;->n(LLi/h;[Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
