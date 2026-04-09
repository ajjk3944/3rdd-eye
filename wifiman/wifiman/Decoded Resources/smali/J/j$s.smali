.class final LJ/j$s;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ/j;->O(Ly0/G;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field b:I

.field private synthetic c:Ljava/lang/Object;

.field final synthetic d:LJ/j;


# direct methods
.method constructor <init>(LJ/j;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LJ/j$s;->d:LJ/j;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance v0, LJ/j$s;

    iget-object v1, p0, LJ/j$s;->d:LJ/j;

    invoke-direct {v0, v1, p2}, LJ/j$s;-><init>(LJ/j;Ldh/e;)V

    iput-object p1, v0, LJ/j$s;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly0/b;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LJ/j$s;->n(Ly0/b;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LJ/j$s;->b:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, LJ/j$s;->c:Ljava/lang/Object;

    check-cast v1, Ly0/b;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LJ/j$s;->c:Ljava/lang/Object;

    check-cast p1, Ly0/b;

    move-object v1, p1

    :goto_0
    sget-object p1, Ly0/p;->Initial:Ly0/p;

    iput-object v1, p0, LJ/j$s;->c:Ljava/lang/Object;

    iput v2, p0, LJ/j$s;->b:I

    invoke-interface {v1, p1, p0}, Ly0/b;->A1(Ly0/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_1
    check-cast p1, Ly0/n;

    iget-object v3, p0, LJ/j$s;->d:LJ/j;

    invoke-static {p1}, LM/t;->j(Ly0/n;)Z

    move-result p1

    xor-int/2addr p1, v2

    invoke-virtual {v3, p1}, LJ/j;->w0(Z)V

    goto :goto_0
.end method

.method public final n(Ly0/b;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LJ/j$s;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LJ/j$s;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LJ/j$s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
