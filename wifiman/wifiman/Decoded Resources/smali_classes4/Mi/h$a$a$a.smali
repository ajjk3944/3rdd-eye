.class final LMi/h$a$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMi/h$a$a;->a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LMi/h;

.field final synthetic c:LLi/h;

.field final synthetic d:Ljava/lang/Object;


# direct methods
.method constructor <init>(LMi/h;LLi/h;Ljava/lang/Object;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LMi/h$a$a$a;->b:LMi/h;

    iput-object p2, p0, LMi/h$a$a$a;->c:LLi/h;

    iput-object p3, p0, LMi/h$a$a$a;->d:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance p1, LMi/h$a$a$a;

    iget-object v0, p0, LMi/h$a$a$a;->b:LMi/h;

    iget-object v1, p0, LMi/h$a$a$a;->c:LLi/h;

    iget-object v2, p0, LMi/h$a$a$a;->d:Ljava/lang/Object;

    invoke-direct {p1, v0, v1, v2, p2}, LMi/h$a$a$a;-><init>(LMi/h;LLi/h;Ljava/lang/Object;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LMi/h$a$a$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LMi/h$a$a$a;->a:I

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

    iget-object p1, p0, LMi/h$a$a$a;->b:LMi/h;

    invoke-static {p1}, LMi/h;->t(LMi/h;)Lmh/q;

    move-result-object p1

    iget-object v1, p0, LMi/h$a$a$a;->c:LLi/h;

    iget-object v3, p0, LMi/h$a$a$a;->d:Ljava/lang/Object;

    iput v2, p0, LMi/h$a$a$a;->a:I

    invoke-interface {p1, v1, v3, p0}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, LMi/h$a$a$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LMi/h$a$a$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LMi/h$a$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
