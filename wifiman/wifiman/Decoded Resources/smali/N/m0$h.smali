.class final LN/m0$h;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/m0;->c(JLmh/a;ZLT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Lmh/a;


# direct methods
.method constructor <init>(Lmh/a;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LN/m0$h;->c:Lmh/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance v0, LN/m0$h;

    iget-object v1, p0, LN/m0$h;->c:Lmh/a;

    invoke-direct {v0, v1, p2}, LN/m0$h;-><init>(Lmh/a;Ldh/e;)V

    iput-object p1, v0, LN/m0$h;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly0/G;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LN/m0$h;->n(Ly0/G;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LN/m0$h;->a:I

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

    iget-object p1, p0, LN/m0$h;->b:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Ly0/G;

    new-instance v7, LN/m0$h$a;

    iget-object p1, p0, LN/m0$h;->c:Lmh/a;

    invoke-direct {v7, p1}, LN/m0$h$a;-><init>(Lmh/a;)V

    iput v2, p0, LN/m0$h;->a:I

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x7

    const/4 v10, 0x0

    move-object v8, p0

    invoke-static/range {v3 .. v10}, Lw/B;->k(Ly0/G;Lmh/l;Lmh/l;Lmh/q;Lmh/l;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(Ly0/G;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LN/m0$h;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LN/m0$h;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LN/m0$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
