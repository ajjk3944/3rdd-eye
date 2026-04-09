.class final Lq/d$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq/d;->a(Lr/o0;Lmh/l;Landroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Lmh/p;Lq/s;Lmh/q;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Lr/o0;

.field final synthetic d:LT/z1;


# direct methods
.method constructor <init>(Lr/o0;LT/z1;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lq/d$c;->c:Lr/o0;

    iput-object p2, p0, Lq/d$c;->d:LT/z1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance v0, Lq/d$c;

    iget-object v1, p0, Lq/d$c;->c:Lr/o0;

    iget-object v2, p0, Lq/d$c;->d:LT/z1;

    invoke-direct {v0, v1, v2, p2}, Lq/d$c;-><init>(Lr/o0;LT/z1;Ldh/e;)V

    iput-object p1, v0, Lq/d$c;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/F0;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lq/d$c;->n(LT/F0;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lq/d$c;->a:I

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

    iget-object p1, p0, Lq/d$c;->b:Ljava/lang/Object;

    check-cast p1, LT/F0;

    new-instance v1, Lq/d$c$a;

    iget-object v3, p0, Lq/d$c;->c:Lr/o0;

    invoke-direct {v1, v3}, Lq/d$c$a;-><init>(Lr/o0;)V

    invoke-static {v1}, LT/o1;->o(Lmh/a;)LLi/g;

    move-result-object v1

    new-instance v3, Lq/d$c$b;

    iget-object v4, p0, Lq/d$c;->c:Lr/o0;

    iget-object v5, p0, Lq/d$c;->d:LT/z1;

    invoke-direct {v3, p1, v4, v5}, Lq/d$c$b;-><init>(LT/F0;Lr/o0;LT/z1;)V

    iput v2, p0, Lq/d$c;->a:I

    invoke-interface {v1, v3, p0}, LLi/g;->b(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LT/F0;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lq/d$c;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lq/d$c;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lq/d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
