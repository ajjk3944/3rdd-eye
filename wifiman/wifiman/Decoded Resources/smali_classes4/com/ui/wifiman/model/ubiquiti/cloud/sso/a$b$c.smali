.class final Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;->g(Lcom/ui/sso/auth/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;

.field final synthetic c:Lcom/ui/sso/auth/a$a;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;Lcom/ui/sso/auth/a$a;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b$c;->b:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;

    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b$c;->c:Lcom/ui/sso/auth/a$a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b$c;

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b$c;->b:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b$c;->c:Lcom/ui/sso/auth/a$a;

    invoke-direct {p1, v0, v1, p2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b$c;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;Lcom/ui/sso/auth/a$a;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b$c;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b$c;->a:I

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

    iget-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b$c;->b:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;

    invoke-static {p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;->d(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;)Lcom/ui/sso/api/UiAccountApi;

    move-result-object p1

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b$c;->b:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;

    invoke-static {v1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;->c(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;)Ljava/util/UUID;

    move-result-object v1

    iget-object v3, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b$c;->c:Lcom/ui/sso/auth/a$a;

    iput v2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b$c;->a:I

    invoke-interface {p1, v1, v3, p0}, Lcom/ui/sso/api/UiAccountApi;->d(Ljava/util/UUID;Lcom/ui/sso/auth/a$a;Ldh/e;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b$c;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b$c;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
