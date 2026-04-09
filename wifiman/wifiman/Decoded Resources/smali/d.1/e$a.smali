.class final Ld/e$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld/e;-><init>(LIi/N;ZLmh/p;Lc/F;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:I

.field final synthetic c:Lc/F;

.field final synthetic d:Lmh/p;

.field final synthetic e:Ld/e;


# direct methods
.method constructor <init>(Lc/F;Lmh/p;Ld/e;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Ld/e$a;->c:Lc/F;

    iput-object p2, p0, Ld/e$a;->d:Lmh/p;

    iput-object p3, p0, Ld/e$a;->e:Ld/e;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance p1, Ld/e$a;

    iget-object v0, p0, Ld/e$a;->c:Lc/F;

    iget-object v1, p0, Ld/e$a;->d:Lmh/p;

    iget-object v2, p0, Ld/e$a;->e:Ld/e;

    invoke-direct {p1, v0, v1, v2, p2}, Ld/e$a;-><init>(Lc/F;Lmh/p;Ld/e;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Ld/e$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ld/e$a;->b:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Ld/e$a;->a:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/J;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Ld/e$a;->c:Lc/F;

    invoke-virtual {p1}, Lc/F;->g()Z

    move-result p1

    if-eqz p1, :cond_4

    new-instance p1, Lkotlin/jvm/internal/J;

    invoke-direct {p1}, Lkotlin/jvm/internal/J;-><init>()V

    iget-object v1, p0, Ld/e$a;->d:Lmh/p;

    iget-object v3, p0, Ld/e$a;->e:Ld/e;

    invoke-virtual {v3}, Ld/e;->c()LKi/g;

    move-result-object v3

    invoke-static {v3}, LLi/i;->m(LKi/v;)LLi/g;

    move-result-object v3

    new-instance v4, Ld/e$a$a;

    const/4 v5, 0x0

    invoke-direct {v4, p1, v5}, Ld/e$a$a;-><init>(Lkotlin/jvm/internal/J;Ldh/e;)V

    invoke-static {v3, v4}, LLi/i;->H(LLi/g;Lmh/q;)LLi/g;

    move-result-object v3

    iput-object p1, p0, Ld/e$a;->a:Ljava/lang/Object;

    iput v2, p0, Ld/e$a;->b:I

    invoke-interface {v1, v3, p0}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, p1

    :goto_0
    iget-boolean p1, v0, Lkotlin/jvm/internal/J;->a:Z

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "You must collect the progress flow"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_1
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Ld/e$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Ld/e$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Ld/e$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
