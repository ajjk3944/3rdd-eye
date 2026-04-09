.class final LBf/e$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBf/e;->b(LBf/b;LT/l;I)LLi/N;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LLi/z;

.field final synthetic c:LBf/b;


# direct methods
.method constructor <init>(LLi/z;LBf/b;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LBf/e$a;->b:LLi/z;

    iput-object p2, p0, LBf/e$a;->c:LBf/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method

.method public static synthetic n(LLi/z;LBf/b;LBf/b;FF)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LBf/e$a;->t(LLi/z;LBf/b;LBf/b;FF)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final t(LLi/z;LBf/b;LBf/b;FF)LYg/J;
    .locals 0

    invoke-static {p3, p1, p2}, LBf/e;->a(FLBf/b;LBf/b;)LBf/b;

    move-result-object p1

    invoke-interface {p0, p1}, LLi/y;->j(Ljava/lang/Object;)Z

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, LBf/e$a;

    iget-object v0, p0, LBf/e$a;->b:LLi/z;

    iget-object v1, p0, LBf/e$a;->c:LBf/b;

    invoke-direct {p1, v0, v1, p2}, LBf/e$a;-><init>(LLi/z;LBf/b;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LBf/e$a;->o(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v8

    iget v0, p0, LBf/e$a;->a:I

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v1, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object v0, p0, LBf/e$a;->b:LLi/z;

    invoke-interface {v0}, LLi/z;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBf/b;

    iget-object v2, p0, LBf/e$a;->c:LBf/b;

    invoke-virtual {v2}, LBf/b;->c()LS8/c;

    move-result-object v2

    invoke-virtual {v0}, LBf/b;->c()LS8/c;

    move-result-object v3

    if-eq v2, v3, :cond_2

    iget-object v1, p0, LBf/e$a;->b:LLi/z;

    const/high16 v2, 0x3f800000    # 1.0f

    iget-object v3, p0, LBf/e$a;->c:LBf/b;

    invoke-static {v2, v0, v3}, LBf/e;->a(FLBf/b;LBf/b;)LBf/b;

    move-result-object v0

    invoke-interface {v1, v0}, LLi/y;->j(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    goto :goto_0

    :cond_2
    invoke-static {}, Lr/G;->e()Lr/E;

    move-result-object v2

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/16 v5, 0x2bc

    const/4 v6, 0x0

    invoke-static {v5, v6, v2, v3, v4}, Lr/j;->l(IILr/E;ILjava/lang/Object;)Lr/r0;

    move-result-object v3

    iget-object v2, p0, LBf/e$a;->b:LLi/z;

    iget-object v4, p0, LBf/e$a;->c:LBf/b;

    new-instance v5, LBf/d;

    invoke-direct {v5, v2, v0, v4}, LBf/d;-><init>(LLi/z;LBf/b;LBf/b;)V

    iput v1, p0, LBf/e$a;->a:I

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v4, v5

    move-object v5, p0

    invoke-static/range {v0 .. v7}, Lr/m0;->e(FFFLr/i;Lmh/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_3

    return-object v8

    :cond_3
    :goto_0
    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method public final o(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LBf/e$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LBf/e$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LBf/e$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
