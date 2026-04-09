.class final Lcom/ui/sso/api/a$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/sso/api/a;->a(LIi/N;)LLi/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field synthetic b:Ljava/lang/Object;

.field final synthetic c:Lcom/ui/sso/api/a;


# direct methods
.method constructor <init>(Lcom/ui/sso/api/a;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/sso/api/a$d;->c:Lcom/ui/sso/api/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance v0, Lcom/ui/sso/api/a$d;

    iget-object v1, p0, Lcom/ui/sso/api/a$d;->c:Lcom/ui/sso/api/a;

    invoke-direct {v0, v1, p2}, Lcom/ui/sso/api/a$d;-><init>(Lcom/ui/sso/api/a;Ldh/e;)V

    iput-object p1, v0, Lcom/ui/sso/api/a$d;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/sso/api/UiAccountApi;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lcom/ui/sso/api/a$d;->n(Lcom/ui/sso/api/UiAccountApi;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, Lcom/ui/sso/api/a$d;->a:I

    if-nez v0, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/ui/sso/api/a$d;->b:Ljava/lang/Object;

    check-cast p1, Lcom/ui/sso/api/UiAccountApi;

    new-instance v0, Lcom/ui/sso/api/a$d$a;

    iget-object v1, p0, Lcom/ui/sso/api/a$d;->c:Lcom/ui/sso/api/a;

    invoke-direct {v0, v1, p1}, Lcom/ui/sso/api/a$d$a;-><init>(Lcom/ui/sso/api/a;Lcom/ui/sso/api/UiAccountApi;)V

    invoke-static {v0}, LUa/a;->e(Lmh/a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(Lcom/ui/sso/api/UiAccountApi;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/ui/sso/api/a$d;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lcom/ui/sso/api/a$d;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lcom/ui/sso/api/a$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
