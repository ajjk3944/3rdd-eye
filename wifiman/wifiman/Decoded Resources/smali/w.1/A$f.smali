.class final Lw/A$f;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/A;->v(Ls/L;Lmh/p;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Lw/A;

.field final synthetic d:Lmh/p;


# direct methods
.method constructor <init>(Lw/A;Lmh/p;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lw/A$f;->c:Lw/A;

    iput-object p2, p0, Lw/A$f;->d:Lmh/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance v0, Lw/A$f;

    iget-object v1, p0, Lw/A$f;->c:Lw/A;

    iget-object v2, p0, Lw/A$f;->d:Lmh/p;

    invoke-direct {v0, v1, v2, p2}, Lw/A$f;-><init>(Lw/A;Lmh/p;Ldh/e;)V

    iput-object p1, v0, Lw/A$f;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lw/v;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lw/A$f;->n(Lw/v;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lw/A$f;->a:I

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

    iget-object p1, p0, Lw/A$f;->b:Ljava/lang/Object;

    check-cast p1, Lw/v;

    iget-object v1, p0, Lw/A$f;->c:Lw/A;

    invoke-static {v1, p1}, Lw/A;->k(Lw/A;Lw/v;)V

    iget-object p1, p0, Lw/A$f;->d:Lmh/p;

    iget-object v1, p0, Lw/A$f;->c:Lw/A;

    invoke-static {v1}, Lw/A;->d(Lw/A;)Lw/A$c;

    move-result-object v1

    iput v2, p0, Lw/A$f;->a:I

    invoke-interface {p1, v1, p0}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(Lw/v;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lw/A$f;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lw/A$f;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lw/A$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
