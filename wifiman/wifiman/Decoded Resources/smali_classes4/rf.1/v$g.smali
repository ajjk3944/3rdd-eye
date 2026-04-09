.class final Lrf/v$g;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrf/v;->w(Ljava/lang/Object;Lmh/l;Lr/i;LT/l;II)LN/R0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Ljava/lang/Object;

.field final synthetic c:LN/R0;


# direct methods
.method constructor <init>(Ljava/lang/Object;LN/R0;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lrf/v$g;->b:Ljava/lang/Object;

    iput-object p2, p0, Lrf/v$g;->c:LN/R0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, Lrf/v$g;

    iget-object v0, p0, Lrf/v$g;->b:Ljava/lang/Object;

    iget-object v1, p0, Lrf/v$g;->c:LN/R0;

    invoke-direct {p1, v0, v1, p2}, Lrf/v$g;-><init>(Ljava/lang/Object;LN/R0;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lrf/v$g;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lrf/v$g;->a:I

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

    iget-object p1, p0, Lrf/v$g;->b:Ljava/lang/Object;

    iget-object v1, p0, Lrf/v$g;->c:LN/R0;

    invoke-virtual {v1}, LN/R0;->o()Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object v3, p0, Lrf/v$g;->c:LN/R0;

    iget-object v4, p0, Lrf/v$g;->b:Ljava/lang/Object;

    iput v2, p0, Lrf/v$g;->a:I

    const/4 v5, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    move-object v6, p0

    invoke-static/range {v3 .. v8}, LN/R0;->j(LN/R0;Ljava/lang/Object;Lr/i;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lrf/v$g;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lrf/v$g;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lrf/v$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
