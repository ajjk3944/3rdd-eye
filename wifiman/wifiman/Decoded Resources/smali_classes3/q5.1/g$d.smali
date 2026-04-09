.class final Lq5/g$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq5/g;->h(LR1/d$a;Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field synthetic b:Ljava/lang/Object;

.field final synthetic c:Ljava/lang/Object;

.field final synthetic d:LR1/d$a;

.field final synthetic e:Lq5/g;


# direct methods
.method constructor <init>(Ljava/lang/Object;LR1/d$a;Lq5/g;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lq5/g$d;->c:Ljava/lang/Object;

    iput-object p2, p0, Lq5/g$d;->d:LR1/d$a;

    iput-object p3, p0, Lq5/g$d;->e:Lq5/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 4

    new-instance v0, Lq5/g$d;

    iget-object v1, p0, Lq5/g$d;->c:Ljava/lang/Object;

    iget-object v2, p0, Lq5/g$d;->d:LR1/d$a;

    iget-object v3, p0, Lq5/g$d;->e:Lq5/g;

    invoke-direct {v0, v1, v2, v3, p2}, Lq5/g$d;-><init>(Ljava/lang/Object;LR1/d$a;Lq5/g;Ldh/e;)V

    iput-object p1, v0, Lq5/g$d;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LR1/a;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lq5/g$d;->n(LR1/a;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, Lq5/g$d;->a:I

    if-nez v0, :cond_1

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lq5/g$d;->b:Ljava/lang/Object;

    check-cast p1, LR1/a;

    iget-object v0, p0, Lq5/g$d;->c:Ljava/lang/Object;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lq5/g$d;->d:LR1/d$a;

    invoke-virtual {p1, v1, v0}, LR1/a;->i(LR1/d$a;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lq5/g$d;->d:LR1/d$a;

    invoke-virtual {p1, v0}, LR1/a;->h(LR1/d$a;)Ljava/lang/Object;

    :goto_0
    iget-object v0, p0, Lq5/g$d;->e:Lq5/g;

    invoke-static {v0, p1}, Lq5/g;->c(Lq5/g;LR1/d;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LR1/a;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lq5/g$d;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lq5/g$d;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lq5/g$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
