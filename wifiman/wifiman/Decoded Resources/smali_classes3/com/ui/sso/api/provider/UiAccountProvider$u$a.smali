.class final Lcom/ui/sso/api/provider/UiAccountProvider$u$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/sso/api/provider/UiAccountProvider$u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I


# direct methods
.method constructor <init>(Ldh/e;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ldh/e;)Ldh/e;
    .locals 1

    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProvider$u$a;

    invoke-direct {v0, p1}, Lcom/ui/sso/api/provider/UiAccountProvider$u$a;-><init>(Ldh/e;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldh/e;

    invoke-virtual {p0, p1}, Lcom/ui/sso/api/provider/UiAccountProvider$u$a;->n(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, Lcom/ui/sso/api/provider/UiAccountProvider$u$a;->a:I

    if-eqz v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    new-instance p1, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;

    const-string/jumbo v0, "update should never be called"

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p1, v0, v2, v1, v2}, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1
.end method

.method public final n(Ldh/e;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/ui/sso/api/provider/UiAccountProvider$u$a;->create(Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lcom/ui/sso/api/provider/UiAccountProvider$u$a;

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-virtual {p1, v0}, Lcom/ui/sso/api/provider/UiAccountProvider$u$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
