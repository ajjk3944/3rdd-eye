.class final Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$d$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$d;->a(Lcom/ui/sso/api/UiAccountApi;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lcom/ui/sso/api/UiAccountApi;

.field final synthetic c:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;


# direct methods
.method constructor <init>(Lcom/ui/sso/api/UiAccountApi;Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$d$a;->b:Lcom/ui/sso/api/UiAccountApi;

    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$d$a;->c:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$d$a;

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$d$a;->b:Lcom/ui/sso/api/UiAccountApi;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$d$a;->c:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;

    invoke-direct {p1, v0, v1, p2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$d$a;-><init>(Lcom/ui/sso/api/UiAccountApi;Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$d$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$d$a;->a:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$d$a;->b:Lcom/ui/sso/api/UiAccountApi;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$d$a;->c:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;->f()Ljava/util/UUID;

    move-result-object v1

    sget-object v5, Lcom/ui/sso/auth/a$a;->UBIC_PKCE:Lcom/ui/sso/auth/a$a;

    iput v3, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$d$a;->a:I

    invoke-interface {p1, v1, v5, p0}, Lcom/ui/sso/api/UiAccountApi;->e(Ljava/util/UUID;Lcom/ui/sso/auth/a$a;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    check-cast p1, Lcom/ui/sso/auth/a;

    if-eqz p1, :cond_5

    instance-of v1, p1, Lcom/ui/sso/auth/d;

    if-eqz v1, :cond_4

    move-object v1, p1

    check-cast v1, Lcom/ui/sso/auth/d;

    invoke-virtual {v1}, Lcom/ui/sso/auth/d;->d()Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_1

    :cond_4
    move-object p1, v4

    :goto_1
    if-eqz p1, :cond_5

    :goto_2
    move-object v4, p1

    goto :goto_4

    :cond_5
    iget-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$d$a;->b:Lcom/ui/sso/api/UiAccountApi;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$d$a;->c:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;->f()Ljava/util/UUID;

    move-result-object v1

    sget-object v3, Lcom/ui/sso/auth/a$a;->UBIC:Lcom/ui/sso/auth/a$a;

    iput v2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$d$a;->a:I

    invoke-interface {p1, v1, v3, p0}, Lcom/ui/sso/api/UiAccountApi;->e(Ljava/util/UUID;Lcom/ui/sso/auth/a$a;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    return-object v0

    :cond_6
    :goto_3
    check-cast p1, Lcom/ui/sso/auth/a;

    if-eqz p1, :cond_7

    instance-of v0, p1, Lcom/ui/sso/auth/c;

    if-eqz v0, :cond_7

    move-object v0, p1

    check-cast v0, Lcom/ui/sso/auth/c;

    invoke-virtual {v0}, Lcom/ui/sso/auth/c;->d()Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_2

    :cond_7
    :goto_4
    iget-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$d$a;->b:Lcom/ui/sso/api/UiAccountApi;

    invoke-static {p1, v4}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$d$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$d$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
