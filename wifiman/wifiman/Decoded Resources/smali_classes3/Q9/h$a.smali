.class final LQ9/h$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ9/h;->g(Landroid/app/Activity;Lmh/a;Ljava/lang/String;Lmh/a;Lf2/w;Lmh/q;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:LQ9/j;

.field final synthetic d:Lf2/w;

.field final synthetic e:Lmh/a;

.field final synthetic f:Landroid/app/Activity;

.field final synthetic g:Ljava/lang/String;


# direct methods
.method constructor <init>(LQ9/j;Lf2/w;Lmh/a;Landroid/app/Activity;Ljava/lang/String;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LQ9/h$a;->c:LQ9/j;

    iput-object p2, p0, LQ9/h$a;->d:Lf2/w;

    iput-object p3, p0, LQ9/h$a;->e:Lmh/a;

    iput-object p4, p0, LQ9/h$a;->f:Landroid/app/Activity;

    iput-object p5, p0, LQ9/h$a;->g:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 8

    new-instance v7, LQ9/h$a;

    iget-object v1, p0, LQ9/h$a;->c:LQ9/j;

    iget-object v2, p0, LQ9/h$a;->d:Lf2/w;

    iget-object v3, p0, LQ9/h$a;->e:Lmh/a;

    iget-object v4, p0, LQ9/h$a;->f:Landroid/app/Activity;

    iget-object v5, p0, LQ9/h$a;->g:Ljava/lang/String;

    move-object v0, v7

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, LQ9/h$a;-><init>(LQ9/j;Lf2/w;Lmh/a;Landroid/app/Activity;Ljava/lang/String;Ldh/e;)V

    iput-object p1, v7, LQ9/h$a;->b:Ljava/lang/Object;

    return-object v7
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LQ9/h$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, LQ9/h$a;->a:I

    if-nez v0, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LQ9/h$a;->b:Ljava/lang/Object;

    check-cast p1, LIi/N;

    iget-object v0, p0, LQ9/h$a;->c:LQ9/j;

    invoke-interface {v0}, LQ9/j;->a()LLi/D;

    move-result-object v0

    new-instance v7, LQ9/h$a$a;

    iget-object v2, p0, LQ9/h$a;->d:Lf2/w;

    iget-object v3, p0, LQ9/h$a;->e:Lmh/a;

    iget-object v4, p0, LQ9/h$a;->f:Landroid/app/Activity;

    iget-object v5, p0, LQ9/h$a;->g:Ljava/lang/String;

    const/4 v6, 0x0

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, LQ9/h$a$a;-><init>(Lf2/w;Lmh/a;Landroid/app/Activity;Ljava/lang/String;Ldh/e;)V

    invoke-static {v0, v7}, LLi/i;->I(LLi/g;Lmh/p;)LLi/g;

    move-result-object v0

    invoke-static {v0, p1}, LLi/i;->D(LLi/g;LIi/N;)LIi/y0;

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LQ9/h$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LQ9/h$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LQ9/h$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
