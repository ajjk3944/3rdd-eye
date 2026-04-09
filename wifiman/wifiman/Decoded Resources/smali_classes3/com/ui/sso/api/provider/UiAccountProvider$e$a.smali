.class final Lcom/ui/sso/api/provider/UiAccountProvider$e$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/sso/api/provider/UiAccountProvider$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/sso/api/provider/UiAccountProvider$e$a$a;
    }
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lcom/ui/sso/api/provider/UiAccountProvider;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Landroid/os/Bundle;


# direct methods
.method constructor <init>(Lcom/ui/sso/api/provider/UiAccountProvider;Ljava/lang/String;Landroid/os/Bundle;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/sso/api/provider/UiAccountProvider$e$a;->b:Lcom/ui/sso/api/provider/UiAccountProvider;

    iput-object p2, p0, Lcom/ui/sso/api/provider/UiAccountProvider$e$a;->c:Ljava/lang/String;

    iput-object p3, p0, Lcom/ui/sso/api/provider/UiAccountProvider$e$a;->d:Landroid/os/Bundle;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ldh/e;)Ldh/e;
    .locals 4

    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProvider$e$a;

    iget-object v1, p0, Lcom/ui/sso/api/provider/UiAccountProvider$e$a;->b:Lcom/ui/sso/api/provider/UiAccountProvider;

    iget-object v2, p0, Lcom/ui/sso/api/provider/UiAccountProvider$e$a;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/ui/sso/api/provider/UiAccountProvider$e$a;->d:Landroid/os/Bundle;

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/ui/sso/api/provider/UiAccountProvider$e$a;-><init>(Lcom/ui/sso/api/provider/UiAccountProvider;Ljava/lang/String;Landroid/os/Bundle;Ldh/e;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldh/e;

    invoke-virtual {p0, p1}, Lcom/ui/sso/api/provider/UiAccountProvider$e$a;->n(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/ui/sso/api/provider/UiAccountProvider$e$a;->a:I

    const/4 v2, 0x2

    const/4 v3, 0x0

    packed-switch v1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_3
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_4
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_5
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_6
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_7
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_8

    :pswitch_8
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/ui/sso/api/provider/UiAccountProvider$e$a;->b:Lcom/ui/sso/api/provider/UiAccountProvider;

    invoke-static {p1}, Lcom/ui/sso/api/provider/UiAccountProvider;->d(Lcom/ui/sso/api/provider/UiAccountProvider;)V

    iget-object p1, p0, Lcom/ui/sso/api/provider/UiAccountProvider$e$a;->b:Lcom/ui/sso/api/provider/UiAccountProvider;

    invoke-static {p1}, Lcom/ui/sso/api/provider/UiAccountProvider;->k(Lcom/ui/sso/api/provider/UiAccountProvider;)Ljava/util/Map;

    move-result-object p1

    iget-object v1, p0, Lcom/ui/sso/api/provider/UiAccountProvider$e$a;->c:Ljava/lang/String;

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/sso/api/provider/UiAccountProvider$b;

    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/ui/sso/api/provider/UiAccountProvider$e$a$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    :goto_0
    const-string/jumbo v1, "failed to deserialize call params"

    const-string/jumbo v4, "call params of invalid type"

    const-string/jumbo v5, "call extras null, but params expected"

    packed-switch p1, :pswitch_data_1

    :pswitch_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_a
    iget-object p1, p0, Lcom/ui/sso/api/provider/UiAccountProvider$e$a;->b:Lcom/ui/sso/api/provider/UiAccountProvider;

    iget-object v6, p0, Lcom/ui/sso/api/provider/UiAccountProvider$e$a;->d:Landroid/os/Bundle;

    if-eqz v6, :cond_3

    :try_start_0
    invoke-virtual {p1}, Lcom/ui/sso/api/provider/UiAccountProvider;->G()Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;

    move-result-object v5

    invoke-interface {v5, v6}, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;->b(Landroid/os/Bundle;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ui/sso/api/provider/d;
    :try_end_0
    .catch Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$SerializationError; {:try_start_0 .. :try_end_0} :catch_0

    instance-of v1, v5, Lcom/ui/sso/api/provider/d$d;

    if-eqz v1, :cond_2

    check-cast v5, Lcom/ui/sso/api/provider/d$d;

    const/16 v1, 0x8

    iput v1, p0, Lcom/ui/sso/api/provider/UiAccountProvider$e$a;->a:I

    invoke-static {p1, v5, p0}, Lcom/ui/sso/api/provider/UiAccountProvider;->m(Lcom/ui/sso/api/provider/UiAccountProvider;Lcom/ui/sso/api/provider/d$d;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_1

    return-object v0

    :cond_1
    :goto_1
    check-cast p1, Lcom/ui/sso/api/provider/e;

    goto/16 :goto_9

    :cond_2
    new-instance p1, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;

    invoke-direct {p1, v4, v3, v2, v3}, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :catch_0
    move-exception p1

    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;

    invoke-direct {v0, v1, p1}, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_3
    new-instance p1, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;

    invoke-direct {p1, v5, v3, v2, v3}, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :pswitch_b
    iget-object p1, p0, Lcom/ui/sso/api/provider/UiAccountProvider$e$a;->b:Lcom/ui/sso/api/provider/UiAccountProvider;

    iget-object v6, p0, Lcom/ui/sso/api/provider/UiAccountProvider$e$a;->d:Landroid/os/Bundle;

    if-eqz v6, :cond_6

    :try_start_1
    invoke-virtual {p1}, Lcom/ui/sso/api/provider/UiAccountProvider;->G()Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;

    move-result-object v5

    invoke-interface {v5, v6}, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;->b(Landroid/os/Bundle;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ui/sso/api/provider/d;
    :try_end_1
    .catch Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$SerializationError; {:try_start_1 .. :try_end_1} :catch_1

    instance-of v1, v5, Lcom/ui/sso/api/provider/d$e;

    if-eqz v1, :cond_5

    check-cast v5, Lcom/ui/sso/api/provider/d$e;

    const/4 v1, 0x7

    iput v1, p0, Lcom/ui/sso/api/provider/UiAccountProvider$e$a;->a:I

    invoke-static {p1, v5, p0}, Lcom/ui/sso/api/provider/UiAccountProvider;->o(Lcom/ui/sso/api/provider/UiAccountProvider;Lcom/ui/sso/api/provider/d$e;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_2
    check-cast p1, Lcom/ui/sso/api/provider/e;

    goto/16 :goto_9

    :cond_5
    new-instance p1, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;

    invoke-direct {p1, v4, v3, v2, v3}, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :catch_1
    move-exception p1

    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;

    invoke-direct {v0, v1, p1}, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_6
    new-instance p1, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;

    invoke-direct {p1, v5, v3, v2, v3}, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :pswitch_c
    iget-object p1, p0, Lcom/ui/sso/api/provider/UiAccountProvider$e$a;->b:Lcom/ui/sso/api/provider/UiAccountProvider;

    iget-object v6, p0, Lcom/ui/sso/api/provider/UiAccountProvider$e$a;->d:Landroid/os/Bundle;

    if-eqz v6, :cond_9

    :try_start_2
    invoke-virtual {p1}, Lcom/ui/sso/api/provider/UiAccountProvider;->G()Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;

    move-result-object v5

    invoke-interface {v5, v6}, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;->b(Landroid/os/Bundle;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ui/sso/api/provider/d;
    :try_end_2
    .catch Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$SerializationError; {:try_start_2 .. :try_end_2} :catch_2

    instance-of v1, v5, Lcom/ui/sso/api/provider/d$c;

    if-eqz v1, :cond_8

    check-cast v5, Lcom/ui/sso/api/provider/d$c;

    const/4 v1, 0x6

    iput v1, p0, Lcom/ui/sso/api/provider/UiAccountProvider$e$a;->a:I

    invoke-static {p1, v5, p0}, Lcom/ui/sso/api/provider/UiAccountProvider;->h(Lcom/ui/sso/api/provider/UiAccountProvider;Lcom/ui/sso/api/provider/d$c;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_7
    :goto_3
    check-cast p1, Lcom/ui/sso/api/provider/e;

    goto/16 :goto_9

    :cond_8
    new-instance p1, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;

    invoke-direct {p1, v4, v3, v2, v3}, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :catch_2
    move-exception p1

    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;

    invoke-direct {v0, v1, p1}, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_9
    new-instance p1, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;

    invoke-direct {p1, v5, v3, v2, v3}, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :pswitch_d
    iget-object p1, p0, Lcom/ui/sso/api/provider/UiAccountProvider$e$a;->b:Lcom/ui/sso/api/provider/UiAccountProvider;

    iget-object v6, p0, Lcom/ui/sso/api/provider/UiAccountProvider$e$a;->d:Landroid/os/Bundle;

    if-eqz v6, :cond_c

    :try_start_3
    invoke-virtual {p1}, Lcom/ui/sso/api/provider/UiAccountProvider;->G()Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;

    move-result-object v5

    invoke-interface {v5, v6}, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;->b(Landroid/os/Bundle;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ui/sso/api/provider/d;
    :try_end_3
    .catch Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$SerializationError; {:try_start_3 .. :try_end_3} :catch_3

    instance-of v1, v5, Lcom/ui/sso/api/provider/d$a;

    if-eqz v1, :cond_b

    check-cast v5, Lcom/ui/sso/api/provider/d$a;

    const/4 v1, 0x5

    iput v1, p0, Lcom/ui/sso/api/provider/UiAccountProvider$e$a;->a:I

    invoke-static {p1, v5, p0}, Lcom/ui/sso/api/provider/UiAccountProvider;->e(Lcom/ui/sso/api/provider/UiAccountProvider;Lcom/ui/sso/api/provider/d$a;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    return-object v0

    :cond_a
    :goto_4
    check-cast p1, Lcom/ui/sso/api/provider/e;

    goto/16 :goto_9

    :cond_b
    new-instance p1, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;

    invoke-direct {p1, v4, v3, v2, v3}, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :catch_3
    move-exception p1

    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;

    invoke-direct {v0, v1, p1}, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_c
    new-instance p1, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;

    invoke-direct {p1, v5, v3, v2, v3}, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :pswitch_e
    iget-object p1, p0, Lcom/ui/sso/api/provider/UiAccountProvider$e$a;->b:Lcom/ui/sso/api/provider/UiAccountProvider;

    iget-object v6, p0, Lcom/ui/sso/api/provider/UiAccountProvider$e$a;->d:Landroid/os/Bundle;

    if-eqz v6, :cond_f

    :try_start_4
    invoke-virtual {p1}, Lcom/ui/sso/api/provider/UiAccountProvider;->G()Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;

    move-result-object v5

    invoke-interface {v5, v6}, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;->b(Landroid/os/Bundle;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ui/sso/api/provider/d;
    :try_end_4
    .catch Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$SerializationError; {:try_start_4 .. :try_end_4} :catch_4

    instance-of v1, v5, Lcom/ui/sso/api/provider/d$b;

    if-eqz v1, :cond_e

    check-cast v5, Lcom/ui/sso/api/provider/d$b;

    const/4 v1, 0x4

    iput v1, p0, Lcom/ui/sso/api/provider/UiAccountProvider$e$a;->a:I

    invoke-static {p1, v5, p0}, Lcom/ui/sso/api/provider/UiAccountProvider;->n(Lcom/ui/sso/api/provider/UiAccountProvider;Lcom/ui/sso/api/provider/d$b;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_d

    return-object v0

    :cond_d
    :goto_5
    check-cast p1, Lcom/ui/sso/api/provider/e;

    goto :goto_9

    :cond_e
    new-instance p1, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;

    invoke-direct {p1, v4, v3, v2, v3}, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :catch_4
    move-exception p1

    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;

    invoke-direct {v0, v1, p1}, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_f
    new-instance p1, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;

    invoke-direct {p1, v5, v3, v2, v3}, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :pswitch_f
    iget-object p1, p0, Lcom/ui/sso/api/provider/UiAccountProvider$e$a;->b:Lcom/ui/sso/api/provider/UiAccountProvider;

    const/4 v1, 0x3

    iput v1, p0, Lcom/ui/sso/api/provider/UiAccountProvider$e$a;->a:I

    invoke-static {p1, p0}, Lcom/ui/sso/api/provider/UiAccountProvider;->i(Lcom/ui/sso/api/provider/UiAccountProvider;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_10

    return-object v0

    :cond_10
    :goto_6
    check-cast p1, Lcom/ui/sso/api/provider/e;

    goto :goto_9

    :pswitch_10
    iget-object p1, p0, Lcom/ui/sso/api/provider/UiAccountProvider$e$a;->b:Lcom/ui/sso/api/provider/UiAccountProvider;

    iput v2, p0, Lcom/ui/sso/api/provider/UiAccountProvider$e$a;->a:I

    invoke-static {p1, p0}, Lcom/ui/sso/api/provider/UiAccountProvider;->j(Lcom/ui/sso/api/provider/UiAccountProvider;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_11

    return-object v0

    :cond_11
    :goto_7
    check-cast p1, Lcom/ui/sso/api/provider/e;

    goto :goto_9

    :pswitch_11
    iget-object p1, p0, Lcom/ui/sso/api/provider/UiAccountProvider$e$a;->b:Lcom/ui/sso/api/provider/UiAccountProvider;

    const/4 v1, 0x1

    iput v1, p0, Lcom/ui/sso/api/provider/UiAccountProvider$e$a;->a:I

    invoke-static {p1, p0}, Lcom/ui/sso/api/provider/UiAccountProvider;->c(Lcom/ui/sso/api/provider/UiAccountProvider;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_12

    return-object v0

    :cond_12
    :goto_8
    check-cast p1, Lcom/ui/sso/api/provider/e;

    :goto_9
    :try_start_5
    iget-object v0, p0, Lcom/ui/sso/api/provider/UiAccountProvider$e$a;->b:Lcom/ui/sso/api/provider/UiAccountProvider;

    invoke-virtual {v0}, Lcom/ui/sso/api/provider/UiAccountProvider;->H()Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;->a(Ljava/lang/Object;)Landroid/os/Bundle;

    move-result-object p1
    :try_end_5
    .catch Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$SerializationError; {:try_start_5 .. :try_end_5} :catch_5

    return-object p1

    :catch_5
    new-instance p1, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;

    iget-object v0, p0, Lcom/ui/sso/api/provider/UiAccountProvider$e$a;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "failed to serialize response on \'"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\'"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0, v3, v2, v3}, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :pswitch_12
    new-instance p1, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;

    iget-object v0, p0, Lcom/ui/sso/api/provider/UiAccountProvider$e$a;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "unknown call method "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0, v3, v2, v3}, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch -0x1
        :pswitch_12
        :pswitch_9
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch
.end method

.method public final n(Ldh/e;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/ui/sso/api/provider/UiAccountProvider$e$a;->create(Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lcom/ui/sso/api/provider/UiAccountProvider$e$a;

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-virtual {p1, v0}, Lcom/ui/sso/api/provider/UiAccountProvider$e$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
