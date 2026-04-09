.class final LF/m$i$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/m$i;->a(Lk0/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LD/b;

.field final synthetic c:LR0/Q;

.field final synthetic d:LF/E;

.field final synthetic e:LF/j0;

.field final synthetic f:LR0/H;


# direct methods
.method constructor <init>(LD/b;LR0/Q;LF/E;LF/j0;LR0/H;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LF/m$i$a;->b:LD/b;

    iput-object p2, p0, LF/m$i$a;->c:LR0/Q;

    iput-object p3, p0, LF/m$i$a;->d:LF/E;

    iput-object p4, p0, LF/m$i$a;->e:LF/j0;

    iput-object p5, p0, LF/m$i$a;->f:LR0/H;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 7

    new-instance p1, LF/m$i$a;

    iget-object v1, p0, LF/m$i$a;->b:LD/b;

    iget-object v2, p0, LF/m$i$a;->c:LR0/Q;

    iget-object v3, p0, LF/m$i$a;->d:LF/E;

    iget-object v4, p0, LF/m$i$a;->e:LF/j0;

    iget-object v5, p0, LF/m$i$a;->f:LR0/H;

    move-object v0, p1

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, LF/m$i$a;-><init>(LD/b;LR0/Q;LF/E;LF/j0;LR0/H;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LF/m$i$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LF/m$i$a;->a:I

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

    iget-object v1, p0, LF/m$i$a;->b:LD/b;

    iget-object p1, p0, LF/m$i$a;->c:LR0/Q;

    iget-object v3, p0, LF/m$i$a;->d:LF/E;

    invoke-virtual {v3}, LF/E;->v()LF/S;

    move-result-object v3

    iget-object v4, p0, LF/m$i$a;->e:LF/j0;

    invoke-virtual {v4}, LF/j0;->f()LL0/M;

    move-result-object v4

    iget-object v5, p0, LF/m$i$a;->f:LR0/H;

    iput v2, p0, LF/m$i$a;->a:I

    move-object v2, p1

    move-object v6, p0

    invoke-static/range {v1 .. v6}, LF/m;->m(LD/b;LR0/Q;LF/S;LL0/M;LR0/H;Ldh/e;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, LF/m$i$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LF/m$i$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LF/m$i$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
