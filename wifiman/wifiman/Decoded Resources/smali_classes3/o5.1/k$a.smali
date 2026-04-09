.class final Lo5/k$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo5/k;-><init>(Lcom/google/firebase/f;Lq5/f;Ldh/i;Lo5/F;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lo5/k;

.field final synthetic c:Ldh/i;

.field final synthetic d:Lo5/F;


# direct methods
.method constructor <init>(Lo5/k;Ldh/i;Lo5/F;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lo5/k$a;->b:Lo5/k;

    iput-object p2, p0, Lo5/k$a;->c:Ldh/i;

    iput-object p3, p0, Lo5/k$a;->d:Lo5/F;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance p1, Lo5/k$a;

    iget-object v0, p0, Lo5/k$a;->b:Lo5/k;

    iget-object v1, p0, Lo5/k$a;->c:Ldh/i;

    iget-object v2, p0, Lo5/k$a;->d:Lo5/F;

    invoke-direct {p1, v0, v1, v2, p2}, Lo5/k$a;-><init>(Lo5/k;Ldh/i;Lo5/F;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lo5/k$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lo5/k$a;->a:I

    const-string/jumbo v2, "FirebaseSessions"

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    sget-object p1, Lp5/a;->a:Lp5/a;

    iput v4, p0, Lo5/k$a;->a:I

    invoke-virtual {p1, p0}, Lp5/a;->c(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    check-cast p1, Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    instance-of v1, p1, Ljava/util/Collection;

    if-eqz v1, :cond_4

    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp5/b;

    invoke-interface {v1}, Lp5/b;->b()Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object p1, p0, Lo5/k$a;->b:Lo5/k;

    invoke-static {p1}, Lo5/k;->b(Lo5/k;)Lq5/f;

    move-result-object p1

    iput v3, p0, Lo5/k$a;->a:I

    invoke-virtual {p1, p0}, Lq5/f;->g(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    return-object v0

    :cond_6
    :goto_1
    iget-object p1, p0, Lo5/k$a;->b:Lo5/k;

    invoke-static {p1}, Lo5/k;->b(Lo5/k;)Lq5/f;

    move-result-object p1

    invoke-virtual {p1}, Lq5/f;->d()Z

    move-result p1

    if-nez p1, :cond_7

    const-string/jumbo p1, "Sessions SDK disabled. Not listening to lifecycle events."

    invoke-static {v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_3

    :cond_7
    new-instance p1, Lo5/D;

    iget-object v0, p0, Lo5/k$a;->c:Ldh/i;

    invoke-direct {p1, v0}, Lo5/D;-><init>(Ldh/i;)V

    iget-object v0, p0, Lo5/k$a;->d:Lo5/F;

    invoke-virtual {p1, v0}, Lo5/D;->i(Lo5/F;)V

    sget-object v0, Lo5/H;->a:Lo5/H;

    invoke-virtual {v0, p1}, Lo5/H;->a(Lo5/D;)V

    iget-object p1, p0, Lo5/k$a;->b:Lo5/k;

    invoke-static {p1}, Lo5/k;->a(Lo5/k;)Lcom/google/firebase/f;

    move-result-object p1

    new-instance v0, Lo5/j;

    invoke-direct {v0}, Lo5/j;-><init>()V

    invoke-virtual {p1, v0}, Lcom/google/firebase/f;->h(Lcom/google/firebase/g;)V

    goto :goto_3

    :cond_8
    :goto_2
    const-string/jumbo p1, "No Sessions subscribers. Not listening to lifecycle events."

    invoke-static {v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :goto_3
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lo5/k$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lo5/k$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lo5/k$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
