.class final LG8/b$e;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG8/b;->f(Lq9/g;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LG8/b;

.field final synthetic c:Lq9/g;


# direct methods
.method constructor <init>(LG8/b;Lq9/g;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LG8/b$e;->b:LG8/b;

    iput-object p2, p0, LG8/b$e;->c:Lq9/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, LG8/b$e;

    iget-object v0, p0, LG8/b$e;->b:LG8/b;

    iget-object v1, p0, LG8/b$e;->c:Lq9/g;

    invoke-direct {p1, v0, v1, p2}, LG8/b$e;-><init>(LG8/b;Lq9/g;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LG8/b$e;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LG8/b$e;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LG8/b$e;->b:LG8/b;

    iget-object v1, p0, LG8/b$e;->c:Lq9/g;

    invoke-virtual {v1}, Lq9/g;->d()I

    move-result v1

    iput v2, p0, LG8/b$e;->a:I

    invoke-static {p1, v1, p0}, LG8/b;->p0(LG8/b;ILdh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    if-eqz p1, :cond_3

    iget-object v0, p0, LG8/b$e;->b:LG8/b;

    invoke-virtual {v0}, LG8/b;->x0()LLi/y;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->e()Ljava/util/UUID;

    move-result-object v1

    invoke-static {v1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;->e(Ljava/util/UUID;)I

    move-result v1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->k()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Lpf/b$a$a;

    invoke-direct {v2, p1, v1}, Lpf/b$a$a;-><init>(Ljava/lang/String;I)V

    invoke-interface {v0, v2}, LLi/y;->j(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    iget-object p1, p0, LG8/b$e;->c:Lq9/g;

    invoke-virtual {p1}, Lq9/g;->d()I

    move-result p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Account "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " not found. Can\'t delete."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x6

    const/4 v1, 0x0

    invoke-static {p1, v1, v1, v0, v1}, LZ7/b;->j(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    :goto_1
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LG8/b$e;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LG8/b$e;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LG8/b$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
