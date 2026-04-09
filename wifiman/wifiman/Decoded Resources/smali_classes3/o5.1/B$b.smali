.class final Lo5/B$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo5/B;->a(Lo5/y;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:Ljava/lang/Object;

.field d:Ljava/lang/Object;

.field e:Ljava/lang/Object;

.field f:Ljava/lang/Object;

.field g:I

.field final synthetic h:Lo5/B;

.field final synthetic i:Lo5/y;


# direct methods
.method constructor <init>(Lo5/B;Lo5/y;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lo5/B$b;->h:Lo5/B;

    iput-object p2, p0, Lo5/B$b;->i:Lo5/y;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, Lo5/B$b;

    iget-object v0, p0, Lo5/B$b;->h:Lo5/B;

    iget-object v1, p0, Lo5/B$b;->i:Lo5/y;

    invoke-direct {p1, v0, v1, p2}, Lo5/B$b;-><init>(Lo5/B;Lo5/y;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lo5/B$b;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lo5/B$b;->g:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lo5/B$b;->f:Ljava/lang/Object;

    check-cast v0, Lq5/f;

    iget-object v1, p0, Lo5/B$b;->e:Ljava/lang/Object;

    check-cast v1, Lo5/y;

    iget-object v2, p0, Lo5/B$b;->d:Ljava/lang/Object;

    check-cast v2, Lcom/google/firebase/f;

    iget-object v3, p0, Lo5/B$b;->c:Ljava/lang/Object;

    check-cast v3, Lo5/A;

    iget-object v4, p0, Lo5/B$b;->b:Ljava/lang/Object;

    check-cast v4, Lo5/B;

    iget-object v5, p0, Lo5/B$b;->a:Ljava/lang/Object;

    check-cast v5, Lo5/s;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    move-object v7, v4

    move-object v8, v3

    move-object v3, v0

    move-object v0, v8

    move-object v9, v2

    move-object v2, v1

    move-object v1, v9

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lo5/B$b;->h:Lo5/B;

    iput v4, p0, Lo5/B$b;->g:I

    invoke-static {p1, p0}, Lo5/B;->f(Lo5/B;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_7

    sget-object p1, Lo5/s;->c:Lo5/s$a;

    iget-object v1, p0, Lo5/B$b;->h:Lo5/B;

    invoke-static {v1}, Lo5/B;->d(Lo5/B;)Lg5/e;

    move-result-object v1

    iput v3, p0, Lo5/B$b;->g:I

    invoke-virtual {p1, v1, p0}, Lo5/s$a;->a(Lg5/e;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_1
    move-object v5, p1

    check-cast v5, Lo5/s;

    iget-object v4, p0, Lo5/B$b;->h:Lo5/B;

    sget-object v3, Lo5/A;->a:Lo5/A;

    invoke-static {v4}, Lo5/B;->c(Lo5/B;)Lcom/google/firebase/f;

    move-result-object p1

    iget-object v1, p0, Lo5/B$b;->i:Lo5/y;

    iget-object v6, p0, Lo5/B$b;->h:Lo5/B;

    invoke-static {v6}, Lo5/B;->e(Lo5/B;)Lq5/f;

    move-result-object v6

    sget-object v7, Lp5/a;->a:Lp5/a;

    iput-object v5, p0, Lo5/B$b;->a:Ljava/lang/Object;

    iput-object v4, p0, Lo5/B$b;->b:Ljava/lang/Object;

    iput-object v3, p0, Lo5/B$b;->c:Ljava/lang/Object;

    iput-object p1, p0, Lo5/B$b;->d:Ljava/lang/Object;

    iput-object v1, p0, Lo5/B$b;->e:Ljava/lang/Object;

    iput-object v6, p0, Lo5/B$b;->f:Ljava/lang/Object;

    iput v2, p0, Lo5/B$b;->g:I

    invoke-virtual {v7, p0}, Lp5/a;->c(Ldh/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_6

    return-object v0

    :cond_6
    move-object v0, v3

    move-object v7, v4

    move-object v3, v6

    move-object v8, v1

    move-object v1, p1

    move-object p1, v2

    move-object v2, v8

    :goto_2
    move-object v4, p1

    check-cast v4, Ljava/util/Map;

    invoke-virtual {v5}, Lo5/s;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5}, Lo5/s;->a()Ljava/lang/String;

    move-result-object v6

    move-object v5, p1

    invoke-virtual/range {v0 .. v6}, Lo5/A;->a(Lcom/google/firebase/f;Lo5/y;Lq5/f;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lo5/z;

    move-result-object p1

    invoke-static {v7, p1}, Lo5/B;->b(Lo5/B;Lo5/z;)V

    :cond_7
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lo5/B$b;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lo5/B$b;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lo5/B$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
