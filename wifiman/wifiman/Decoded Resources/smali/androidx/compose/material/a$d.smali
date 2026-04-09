.class final Landroidx/compose/material/a$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/a;->j(Lmh/a;Lmh/p;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Lmh/a;

.field final synthetic d:Lmh/p;


# direct methods
.method constructor <init>(Lmh/a;Lmh/p;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/material/a$d;->c:Lmh/a;

    iput-object p2, p0, Landroidx/compose/material/a$d;->d:Lmh/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance v0, Landroidx/compose/material/a$d;

    iget-object v1, p0, Landroidx/compose/material/a$d;->c:Lmh/a;

    iget-object v2, p0, Landroidx/compose/material/a$d;->d:Lmh/p;

    invoke-direct {v0, v1, v2, p2}, Landroidx/compose/material/a$d;-><init>(Lmh/a;Lmh/p;Ldh/e;)V

    iput-object p1, v0, Landroidx/compose/material/a$d;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material/a$d;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Landroidx/compose/material/a$d;->a:I

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

    iget-object p1, p0, Landroidx/compose/material/a$d;->b:Ljava/lang/Object;

    check-cast p1, LIi/N;

    new-instance v1, Lkotlin/jvm/internal/N;

    invoke-direct {v1}, Lkotlin/jvm/internal/N;-><init>()V

    iget-object v3, p0, Landroidx/compose/material/a$d;->c:Lmh/a;

    invoke-static {v3}, LT/o1;->o(Lmh/a;)LLi/g;

    move-result-object v3

    new-instance v4, Landroidx/compose/material/a$d$a;

    iget-object v5, p0, Landroidx/compose/material/a$d;->d:Lmh/p;

    invoke-direct {v4, v1, p1, v5}, Landroidx/compose/material/a$d$a;-><init>(Lkotlin/jvm/internal/N;LIi/N;Lmh/p;)V

    iput v2, p0, Landroidx/compose/material/a$d;->a:I

    invoke-interface {v3, v4, p0}, LLi/g;->b(LLi/h;Ldh/e;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material/a$d;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/material/a$d;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Landroidx/compose/material/a$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
