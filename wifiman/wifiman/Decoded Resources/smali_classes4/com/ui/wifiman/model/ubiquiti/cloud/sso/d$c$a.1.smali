.class final Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$c$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$c;->a(Lcom/ui/sso/api/UiAccountApi;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

.field final synthetic c:Lcom/ui/sso/api/UiAccountApi;

.field final synthetic d:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;Lcom/ui/sso/api/UiAccountApi;Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$c$a;->b:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$c$a;->c:Lcom/ui/sso/api/UiAccountApi;

    iput-object p3, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$c$a;->d:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance p1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$c$a;

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$c$a;->b:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$c$a;->c:Lcom/ui/sso/api/UiAccountApi;

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$c$a;->d:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$c$a;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;Lcom/ui/sso/api/UiAccountApi;Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$c$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$c$a;->a:I

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

    iget-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$c$a;->b:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->k()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SSO - Deleting Account "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v3, v1, v3}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$c$a;->c:Lcom/ui/sso/api/UiAccountApi;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$c$a;->d:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;

    iget-object v3, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$c$a;->b:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    invoke-static {v1, v3}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->q(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;)LLb/a;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->n(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;LLb/a;)LNa/b;

    move-result-object v1

    invoke-virtual {v1}, LNa/b;->c()Ljava/util/UUID;

    move-result-object v1

    iput v2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$c$a;->a:I

    invoke-interface {p1, v1, p0}, Lcom/ui/sso/api/UiAccountApi;->c(Ljava/util/UUID;Ldh/e;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$c$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$c$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
