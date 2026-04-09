.class final LX9/c$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX9/c;->c1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LX9/c;


# direct methods
.method constructor <init>(LX9/c;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LX9/c$d;->b:LX9/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 1

    new-instance p1, LX9/c$d;

    iget-object v0, p0, LX9/c$d;->b:LX9/c;

    invoke-direct {p1, v0, p2}, LX9/c$d;-><init>(LX9/c;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LX9/c$d;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LX9/c$d;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iput v2, p0, LX9/c$d;->a:I

    const-wide/16 v1, 0x3e8

    invoke-static {v1, v2, p0}, LIi/Y;->a(JLdh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, LX9/c$d;->b:LX9/c;

    invoke-static {p1}, LX9/c;->M0(LX9/c;)Lha/a;

    move-result-object p1

    invoke-interface {p1}, Lha/a;->a()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v0, p0, LX9/c$d;->b:LX9/c;

    invoke-static {v0}, LX9/c;->N0(LX9/c;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, LX9/c$d;->b:LX9/c;

    invoke-static {v0, p1}, LX9/c;->T0(LX9/c;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, LX9/c$d;->b:LX9/c;

    invoke-static {v0}, LX9/c;->Q0(LX9/c;)LLi/y;

    move-result-object v0

    new-instance v1, LX9/p$a$c;

    invoke-direct {v1, p1}, LX9/p$a$c;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, LLi/y;->j(Ljava/lang/Object;)Z

    iget-object v0, p0, LX9/c$d;->b:LX9/c;

    invoke-virtual {v0, p1}, LX9/c;->O(Ljava/lang/String;)V

    :cond_3
    iget-object v0, p0, LX9/c$d;->b:LX9/c;

    invoke-static {v0, p1}, LX9/c;->S0(LX9/c;Ljava/lang/String;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LX9/c$d;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LX9/c$d;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LX9/c$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
