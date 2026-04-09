.class final Lw/B$f;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/B;->j(Ly0/G;Lmh/l;Lmh/l;Lmh/q;Lmh/l;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Ly0/G;

.field final synthetic d:Lmh/q;

.field final synthetic e:Lmh/l;

.field final synthetic f:Lmh/l;

.field final synthetic g:Lmh/l;


# direct methods
.method constructor <init>(Ly0/G;Lmh/q;Lmh/l;Lmh/l;Lmh/l;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lw/B$f;->c:Ly0/G;

    iput-object p2, p0, Lw/B$f;->d:Lmh/q;

    iput-object p3, p0, Lw/B$f;->e:Lmh/l;

    iput-object p4, p0, Lw/B$f;->f:Lmh/l;

    iput-object p5, p0, Lw/B$f;->g:Lmh/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 8

    new-instance v7, Lw/B$f;

    iget-object v1, p0, Lw/B$f;->c:Ly0/G;

    iget-object v2, p0, Lw/B$f;->d:Lmh/q;

    iget-object v3, p0, Lw/B$f;->e:Lmh/l;

    iget-object v4, p0, Lw/B$f;->f:Lmh/l;

    iget-object v5, p0, Lw/B$f;->g:Lmh/l;

    move-object v0, v7

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lw/B$f;-><init>(Ly0/G;Lmh/q;Lmh/l;Lmh/l;Lmh/l;Ldh/e;)V

    iput-object p1, v7, Lw/B$f;->b:Ljava/lang/Object;

    return-object v7
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lw/B$f;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lw/B$f;->a:I

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

    iget-object p1, p0, Lw/B$f;->b:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, LIi/N;

    new-instance v9, Lw/s;

    iget-object p1, p0, Lw/B$f;->c:Ly0/G;

    invoke-direct {v9, p1}, Lw/s;-><init>(LY0/d;)V

    iget-object p1, p0, Lw/B$f;->c:Ly0/G;

    new-instance v1, Lw/B$f$a;

    iget-object v5, p0, Lw/B$f;->d:Lmh/q;

    iget-object v6, p0, Lw/B$f;->e:Lmh/l;

    iget-object v7, p0, Lw/B$f;->f:Lmh/l;

    iget-object v8, p0, Lw/B$f;->g:Lmh/l;

    const/4 v10, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v10}, Lw/B$f$a;-><init>(LIi/N;Lmh/q;Lmh/l;Lmh/l;Lmh/l;Lw/s;Ldh/e;)V

    iput v2, p0, Lw/B$f;->a:I

    invoke-static {p1, v1, p0}, Lw/o;->d(Ly0/G;Lmh/p;Ldh/e;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lw/B$f;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lw/B$f;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lw/B$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
