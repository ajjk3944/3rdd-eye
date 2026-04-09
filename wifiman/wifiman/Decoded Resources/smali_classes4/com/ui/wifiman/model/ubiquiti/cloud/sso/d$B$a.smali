.class final Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B;->a(Lcom/ui/sso/api/UiAccountApi;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

.field final synthetic c:LEb/r;

.field final synthetic d:Lcom/ui/sso/api/UiAccountApi;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;LEb/r;Lcom/ui/sso/api/UiAccountApi;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B$a;->b:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B$a;->c:LEb/r;

    iput-object p3, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B$a;->d:Lcom/ui/sso/api/UiAccountApi;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance p1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B$a;

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B$a;->b:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B$a;->c:LEb/r;

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B$a;->d:Lcom/ui/sso/api/UiAccountApi;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B$a;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;LEb/r;Lcom/ui/sso/api/UiAccountApi;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B$a;->a:I

    const/4 v2, 0x2

    const-string v3, "SSO - Updating UI Account api info for "

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v4, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B$a;->b:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B$a;->c:LEb/r;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " with "

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v5, v2, v5}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B$a;->d:Lcom/ui/sso/api/UiAccountApi;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B$a;->b:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->e()Ljava/util/UUID;

    move-result-object v1

    iget-object v6, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B$a;->c:LEb/r;

    invoke-virtual {v6}, LEb/r;->g()Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B$a;->c:LEb/r;

    invoke-virtual {v7}, LEb/r;->c()Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B$a;->c:LEb/r;

    invoke-virtual {v8}, LEb/r;->f()Ljava/lang/String;

    move-result-object v8

    new-instance v9, LNa/b;

    invoke-direct {v9, v1, v7, v6, v8}, LNa/b;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput v4, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B$a;->a:I

    invoke-interface {p1, v9, p0}, Lcom/ui/sso/api/UiAccountApi;->b(LNa/b;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B$a;->b:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " - SUCCESS"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v5, v2, v5}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$B$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
