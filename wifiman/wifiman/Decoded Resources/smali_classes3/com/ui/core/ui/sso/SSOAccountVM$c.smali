.class final Lcom/ui/core/ui/sso/SSOAccountVM$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/core/ui/sso/SSOAccountVM;-><init>(Lcom/ui/sso/api/UiAccountApi$b;Landroidx/lifecycle/E;LP9/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lcom/ui/core/ui/sso/SSOAccountVM;


# direct methods
.method constructor <init>(Lcom/ui/core/ui/sso/SSOAccountVM;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/core/ui/sso/SSOAccountVM$c;->b:Lcom/ui/core/ui/sso/SSOAccountVM;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method

.method public static synthetic n()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/ui/core/ui/sso/SSOAccountVM$c;->t()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final t()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "Failed to obtain device identifiers from account api"

    return-object v0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 1

    new-instance p1, Lcom/ui/core/ui/sso/SSOAccountVM$c;

    iget-object v0, p0, Lcom/ui/core/ui/sso/SSOAccountVM$c;->b:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-direct {p1, v0, p2}, Lcom/ui/core/ui/sso/SSOAccountVM$c;-><init>(Lcom/ui/core/ui/sso/SSOAccountVM;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lcom/ui/core/ui/sso/SSOAccountVM$c;->o(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/ui/core/ui/sso/SSOAccountVM$c;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/ui/sso/api/UiAccountApi$Error; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lcom/ui/core/ui/sso/SSOAccountVM$c;->b:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-static {p1}, Lcom/ui/core/ui/sso/SSOAccountVM;->i0(Lcom/ui/core/ui/sso/SSOAccountVM;)Lcom/ui/sso/api/UiAccountApi;

    move-result-object p1

    iput v2, p0, Lcom/ui/core/ui/sso/SSOAccountVM$c;->a:I

    invoke-interface {p1, p0}, Lcom/ui/sso/api/UiAccountApi;->h(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, LTa/c;
    :try_end_1
    .catch Lcom/ui/sso/api/UiAccountApi$Error; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :goto_1
    new-instance v0, Lcom/ui/core/ui/sso/b;

    invoke-direct {v0}, Lcom/ui/core/ui/sso/b;-><init>()V

    invoke-static {v0, p1}, LS9/a;->c(Lmh/a;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    :goto_2
    return-object p1
.end method

.method public final o(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/ui/core/ui/sso/SSOAccountVM$c;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lcom/ui/core/ui/sso/SSOAccountVM$c;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lcom/ui/core/ui/sso/SSOAccountVM$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
