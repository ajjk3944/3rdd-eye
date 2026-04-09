.class final Lw/B$e;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/B;->i(Ly0/G;Lmh/q;Lmh/l;Ldh/e;)Ljava/lang/Object;
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

.field final synthetic f:Lw/s;


# direct methods
.method constructor <init>(Ly0/G;Lmh/q;Lmh/l;Lw/s;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lw/B$e;->c:Ly0/G;

    iput-object p2, p0, Lw/B$e;->d:Lmh/q;

    iput-object p3, p0, Lw/B$e;->e:Lmh/l;

    iput-object p4, p0, Lw/B$e;->f:Lw/s;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 7

    new-instance v6, Lw/B$e;

    iget-object v1, p0, Lw/B$e;->c:Ly0/G;

    iget-object v2, p0, Lw/B$e;->d:Lmh/q;

    iget-object v3, p0, Lw/B$e;->e:Lmh/l;

    iget-object v4, p0, Lw/B$e;->f:Lw/s;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lw/B$e;-><init>(Ly0/G;Lmh/q;Lmh/l;Lw/s;Ldh/e;)V

    iput-object p1, v6, Lw/B$e;->b:Ljava/lang/Object;

    return-object v6
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lw/B$e;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lw/B$e;->a:I

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

    iget-object p1, p0, Lw/B$e;->b:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, LIi/N;

    iget-object p1, p0, Lw/B$e;->c:Ly0/G;

    new-instance v1, Lw/B$e$a;

    iget-object v5, p0, Lw/B$e;->d:Lmh/q;

    iget-object v6, p0, Lw/B$e;->e:Lmh/l;

    iget-object v7, p0, Lw/B$e;->f:Lw/s;

    const/4 v8, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v8}, Lw/B$e$a;-><init>(LIi/N;Lmh/q;Lmh/l;Lw/s;Ldh/e;)V

    iput v2, p0, Lw/B$e;->a:I

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

    invoke-virtual {p0, p1, p2}, Lw/B$e;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lw/B$e;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lw/B$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
