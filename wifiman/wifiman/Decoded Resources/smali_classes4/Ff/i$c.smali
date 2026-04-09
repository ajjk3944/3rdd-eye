.class final LFf/i$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFf/i;->c(LFf/e;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LA/B;

.field final synthetic c:LQ/z;

.field final synthetic d:LT/o0;


# direct methods
.method constructor <init>(LA/B;LQ/z;LT/o0;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LFf/i$c;->b:LA/B;

    iput-object p2, p0, LFf/i$c;->c:LQ/z;

    iput-object p3, p0, LFf/i$c;->d:LT/o0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method

.method public static synthetic n(LQ/z;FF)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, LFf/i$c;->t(LQ/z;FF)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final t(LQ/z;FF)LYg/J;
    .locals 0

    invoke-interface {p0}, LQ/z;->getState()LQ/A;

    move-result-object p0

    invoke-virtual {p0, p1}, LQ/A;->g(F)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance p1, LFf/i$c;

    iget-object v0, p0, LFf/i$c;->b:LA/B;

    iget-object v1, p0, LFf/i$c;->c:LQ/z;

    iget-object v2, p0, LFf/i$c;->d:LT/o0;

    invoke-direct {p1, v0, v1, v2, p2}, LFf/i$c;-><init>(LA/B;LQ/z;LT/o0;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LFf/i$c;->o(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LFf/i$c;->a:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LFf/i$c;->d:LT/o0;

    invoke-static {p1}, LFf/i;->i(LT/o0;)J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long p1, v4, v6

    if-eqz p1, :cond_4

    iget-object p1, p0, LFf/i$c;->b:LA/B;

    iput v3, p0, LFf/i$c;->a:I

    const/4 v1, 0x0

    const/high16 v3, -0x80000000

    invoke-virtual {p1, v1, v3, p0}, LA/B;->l(IILdh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    iget-object p1, p0, LFf/i$c;->c:LQ/z;

    invoke-interface {p1}, LQ/z;->getState()LQ/A;

    move-result-object p1

    invoke-virtual {p1}, LQ/A;->d()F

    move-result v3

    iget-object p1, p0, LFf/i$c;->c:LQ/z;

    new-instance v7, LFf/o;

    invoke-direct {v7, p1}, LFf/o;-><init>(LQ/z;)V

    iput v2, p0, LFf/i$c;->a:I

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v9, 0xc

    const/4 v10, 0x0

    move-object v8, p0

    invoke-static/range {v3 .. v10}, Lr/m0;->e(FFFLr/i;Lmh/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final o(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LFf/i$c;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LFf/i$c;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LFf/i$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
