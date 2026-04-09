.class final LO1/l$f;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO1/l;-><init>(Lmh/a;LO1/j;Ljava/util/List;LO1/a;LIi/N;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field synthetic b:Ljava/lang/Object;

.field final synthetic c:LO1/l;


# direct methods
.method constructor <init>(LO1/l;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LO1/l$f;->c:LO1/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance v0, LO1/l$f;

    iget-object v1, p0, LO1/l$f;->c:LO1/l;

    invoke-direct {v0, v1, p2}, LO1/l$f;-><init>(LO1/l;Ldh/e;)V

    iput-object p1, v0, LO1/l$f;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LO1/l$b;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LO1/l$f;->n(LO1/l$b;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LO1/l$f;->a:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LO1/l$f;->b:Ljava/lang/Object;

    check-cast p1, LO1/l$b;

    instance-of v1, p1, LO1/l$b$a;

    if-eqz v1, :cond_3

    iget-object v1, p0, LO1/l$f;->c:LO1/l;

    check-cast p1, LO1/l$b$a;

    iput v3, p0, LO1/l$f;->a:I

    invoke-static {v1, p1, p0}, LO1/l;->i(LO1/l;LO1/l$b$a;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_3
    instance-of v1, p1, LO1/l$b$b;

    if-eqz v1, :cond_4

    iget-object v1, p0, LO1/l$f;->c:LO1/l;

    check-cast p1, LO1/l$b$b;

    iput v2, p0, LO1/l$f;->a:I

    invoke-static {v1, p1, p0}, LO1/l;->j(LO1/l;LO1/l$b$b;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LO1/l$b;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LO1/l$f;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LO1/l$f;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LO1/l$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
