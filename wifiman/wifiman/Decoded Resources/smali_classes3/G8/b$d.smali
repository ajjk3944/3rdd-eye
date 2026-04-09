.class final LG8/b$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG8/b;->n0(Lpf/b$a$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LG8/b;

.field final synthetic c:Lpf/b$a$a;


# direct methods
.method constructor <init>(LG8/b;Lpf/b$a$a;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LG8/b$d;->b:LG8/b;

    iput-object p2, p0, LG8/b$d;->c:Lpf/b$a$a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, LG8/b$d;

    iget-object v0, p0, LG8/b$d;->b:LG8/b;

    iget-object v1, p0, LG8/b$d;->c:Lpf/b$a$a;

    invoke-direct {p1, v0, v1, p2}, LG8/b$d;-><init>(LG8/b;Lpf/b$a$a;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LG8/b$d;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LG8/b$d;->a:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_2

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

    iget-object p1, p0, LG8/b$d;->b:LG8/b;

    invoke-static {p1}, LG8/b;->r0(LG8/b;)LLi/g;

    move-result-object p1

    iput v3, p0, LG8/b$d;->a:I

    invoke-static {p1, p0}, LLi/i;->z(LLi/g;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    check-cast p1, Ljava/util/List;

    const/4 v1, 0x0

    if-eqz p1, :cond_6

    check-cast p1, Ljava/lang/Iterable;

    iget-object v3, p0, LG8/b$d;->c:Lpf/b$a$a;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    invoke-virtual {v5}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->e()Ljava/util/UUID;

    move-result-object v5

    invoke-static {v5}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;->e(Ljava/util/UUID;)I

    move-result v5

    invoke-virtual {v3}, Lpf/b$a$a;->a()I

    move-result v6

    if-ne v5, v6, :cond_4

    goto :goto_1

    :cond_5
    move-object v4, v1

    :goto_1
    check-cast v4, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    if-eqz v4, :cond_6

    iget-object p1, p0, LG8/b$d;->b:LG8/b;

    invoke-static {p1}, LG8/b;->q0(LG8/b;)Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;

    move-result-object p1

    invoke-interface {p1, v4}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;->d(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;)Lgg/b;

    move-result-object p1

    iput v2, p0, LG8/b$d;->a:I

    invoke-static {p1, p0}, LQi/b;->b(Lgg/f;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_6
    iget-object p1, p0, LG8/b$d;->c:Lpf/b$a$a;

    invoke-virtual {p1}, Lpf/b$a$a;->a()I

    move-result p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Account "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " not found. Can\'t delete."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x6

    invoke-static {p1, v1, v1, v0, v1}, LZ7/b;->j(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_7
    :goto_2
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LG8/b$d;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LG8/b$d;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LG8/b$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
