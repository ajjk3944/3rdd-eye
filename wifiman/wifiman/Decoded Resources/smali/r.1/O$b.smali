.class final Lr/O$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/O;->k(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:I

.field private synthetic c:Ljava/lang/Object;

.field final synthetic d:LT/q0;

.field final synthetic e:Lr/O;


# direct methods
.method constructor <init>(LT/q0;Lr/O;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lr/O$b;->d:LT/q0;

    iput-object p2, p0, Lr/O$b;->e:Lr/O;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance v0, Lr/O$b;

    iget-object v1, p0, Lr/O$b;->d:LT/q0;

    iget-object v2, p0, Lr/O$b;->e:Lr/O;

    invoke-direct {v0, v1, v2, p2}, Lr/O$b;-><init>(LT/q0;Lr/O;Ldh/e;)V

    iput-object p1, v0, Lr/O$b;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lr/O$b;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lr/O$b;->b:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lr/O$b;->a:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/K;

    iget-object v4, p0, Lr/O$b;->c:Ljava/lang/Object;

    check-cast v4, LIi/N;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    move-object p1, v4

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lr/O$b;->a:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/K;

    iget-object v4, p0, Lr/O$b;->c:Ljava/lang/Object;

    check-cast v4, LIi/N;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    move-object p1, v4

    goto :goto_1

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lr/O$b;->c:Ljava/lang/Object;

    check-cast p1, LIi/N;

    new-instance v1, Lkotlin/jvm/internal/K;

    invoke-direct {v1}, Lkotlin/jvm/internal/K;-><init>()V

    const/high16 v4, 0x3f800000    # 1.0f

    iput v4, v1, Lkotlin/jvm/internal/K;->a:F

    :cond_3
    :goto_0
    new-instance v4, Lr/O$b$a;

    iget-object v5, p0, Lr/O$b;->d:LT/q0;

    iget-object v6, p0, Lr/O$b;->e:Lr/O;

    invoke-direct {v4, v5, v6, v1, p1}, Lr/O$b$a;-><init>(LT/q0;Lr/O;Lkotlin/jvm/internal/K;LIi/N;)V

    iput-object p1, p0, Lr/O$b;->c:Ljava/lang/Object;

    iput-object v1, p0, Lr/O$b;->a:Ljava/lang/Object;

    iput v3, p0, Lr/O$b;->b:I

    invoke-static {v4, p0}, Lr/M;->a(Lmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    iget v4, v1, Lkotlin/jvm/internal/K;->a:F

    const/4 v5, 0x0

    cmpg-float v4, v4, v5

    if-nez v4, :cond_3

    new-instance v4, Lr/O$b$b;

    invoke-direct {v4, p1}, Lr/O$b$b;-><init>(LIi/N;)V

    invoke-static {v4}, LT/o1;->o(Lmh/a;)LLi/g;

    move-result-object v4

    new-instance v5, Lr/O$b$c;

    const/4 v6, 0x0

    invoke-direct {v5, v6}, Lr/O$b$c;-><init>(Ldh/e;)V

    iput-object p1, p0, Lr/O$b;->c:Ljava/lang/Object;

    iput-object v1, p0, Lr/O$b;->a:Ljava/lang/Object;

    iput v2, p0, Lr/O$b;->b:I

    invoke-static {v4, v5, p0}, LLi/i;->y(LLi/g;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_3

    return-object v0
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lr/O$b;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lr/O$b;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lr/O$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
