.class final LO/g$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO/g;->e(F)LIi/y0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LO/g;

.field final synthetic c:F


# direct methods
.method constructor <init>(LO/g;FLdh/e;)V
    .locals 0

    iput-object p1, p0, LO/g$b;->b:LO/g;

    iput p2, p0, LO/g$b;->c:F

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, LO/g$b;

    iget-object v0, p0, LO/g$b;->b:LO/g;

    iget v1, p0, LO/g$b;->c:F

    invoke-direct {p1, v0, v1, p2}, LO/g$b;-><init>(LO/g;FLdh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LO/g$b;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LO/g$b;->a:I

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

    iget-object p1, p0, LO/g$b;->b:LO/g;

    invoke-static {p1}, LO/g;->b(LO/g;)Ls/M;

    move-result-object v3

    new-instance v5, LO/g$b$a;

    iget-object p1, p0, LO/g$b;->b:LO/g;

    iget v1, p0, LO/g$b;->c:F

    const/4 v4, 0x0

    invoke-direct {v5, p1, v1, v4}, LO/g$b$a;-><init>(LO/g;FLdh/e;)V

    iput v2, p0, LO/g$b;->a:I

    const/4 v7, 0x1

    const/4 v8, 0x0

    move-object v6, p0

    invoke-static/range {v3 .. v8}, Ls/M;->e(Ls/M;Ls/L;Lmh/l;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, LO/g$b;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LO/g$b;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LO/g$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
