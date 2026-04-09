.class public final Lcom/ui/sso/api/provider/a$r;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/sso/api/provider/a;->g(Ljava/util/UUID;Lcom/ui/sso/auth/a;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LWa/a;

.field final synthetic c:Landroid/content/ContentResolver;

.field final synthetic d:Lcom/ui/sso/api/provider/f;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Lcom/ui/sso/api/provider/d;

.field final synthetic g:Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;

.field final synthetic h:Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;


# direct methods
.method public constructor <init>(LWa/a;Landroid/content/ContentResolver;Lcom/ui/sso/api/provider/f;Ljava/lang/String;Lcom/ui/sso/api/provider/d;Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/sso/api/provider/a$r;->b:LWa/a;

    iput-object p2, p0, Lcom/ui/sso/api/provider/a$r;->c:Landroid/content/ContentResolver;

    iput-object p3, p0, Lcom/ui/sso/api/provider/a$r;->d:Lcom/ui/sso/api/provider/f;

    iput-object p4, p0, Lcom/ui/sso/api/provider/a$r;->e:Ljava/lang/String;

    iput-object p5, p0, Lcom/ui/sso/api/provider/a$r;->f:Lcom/ui/sso/api/provider/d;

    iput-object p6, p0, Lcom/ui/sso/api/provider/a$r;->g:Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;

    iput-object p7, p0, Lcom/ui/sso/api/provider/a$r;->h:Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 9

    new-instance p1, Lcom/ui/sso/api/provider/a$r;

    iget-object v1, p0, Lcom/ui/sso/api/provider/a$r;->b:LWa/a;

    iget-object v2, p0, Lcom/ui/sso/api/provider/a$r;->c:Landroid/content/ContentResolver;

    iget-object v3, p0, Lcom/ui/sso/api/provider/a$r;->d:Lcom/ui/sso/api/provider/f;

    iget-object v4, p0, Lcom/ui/sso/api/provider/a$r;->e:Ljava/lang/String;

    iget-object v5, p0, Lcom/ui/sso/api/provider/a$r;->f:Lcom/ui/sso/api/provider/d;

    iget-object v6, p0, Lcom/ui/sso/api/provider/a$r;->g:Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;

    iget-object v7, p0, Lcom/ui/sso/api/provider/a$r;->h:Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;

    move-object v0, p1

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lcom/ui/sso/api/provider/a$r;-><init>(LWa/a;Landroid/content/ContentResolver;Lcom/ui/sso/api/provider/f;Ljava/lang/String;Lcom/ui/sso/api/provider/d;Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lcom/ui/sso/api/provider/a$r;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, Lcom/ui/sso/api/provider/a$r;->a:I

    if-nez v0, :cond_7

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_0
    iget-object p1, p0, Lcom/ui/sso/api/provider/a$r;->b:LWa/a;

    const/16 v0, 0x1d

    invoke-virtual {p1, v0}, LWa/a;->b(I)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/ui/sso/api/provider/a$r;->c:Landroid/content/ContentResolver;

    iget-object v1, p0, Lcom/ui/sso/api/provider/a$r;->d:Lcom/ui/sso/api/provider/f;

    invoke-interface {v1}, Lcom/ui/sso/api/provider/f;->b()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/ui/sso/api/provider/a$r;->e:Ljava/lang/String;

    iget-object v3, p0, Lcom/ui/sso/api/provider/a$r;->f:Lcom/ui/sso/api/provider/d;

    if-eqz v3, :cond_0

    iget-object v4, p0, Lcom/ui/sso/api/provider/a$r;->h:Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;

    invoke-interface {v4, v3}, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;->a(Ljava/lang/Object;)Landroid/os/Bundle;

    move-result-object v3

    goto :goto_0

    :catch_0
    move-exception p1

    goto/16 :goto_3

    :catch_1
    move-exception p1

    goto/16 :goto_4

    :catch_2
    move-exception p1

    goto/16 :goto_5

    :cond_0
    move-object v3, v0

    :goto_0
    invoke-static {p1, v1, v2, v0, v3}, LSa/a;->a(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p1

    goto :goto_2

    :cond_1
    iget-object p1, p0, Lcom/ui/sso/api/provider/a$r;->c:Landroid/content/ContentResolver;

    iget-object v1, p0, Lcom/ui/sso/api/provider/a$r;->d:Lcom/ui/sso/api/provider/f;

    invoke-interface {v1}, Lcom/ui/sso/api/provider/f;->c()Landroid/net/Uri;

    move-result-object v1

    iget-object v2, p0, Lcom/ui/sso/api/provider/a$r;->e:Ljava/lang/String;

    iget-object v3, p0, Lcom/ui/sso/api/provider/a$r;->f:Lcom/ui/sso/api/provider/d;

    if-eqz v3, :cond_2

    iget-object v4, p0, Lcom/ui/sso/api/provider/a$r;->h:Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;

    invoke-interface {v4, v3}, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;->a(Ljava/lang/Object;)Landroid/os/Bundle;

    move-result-object v3

    goto :goto_1

    :cond_2
    move-object v3, v0

    :goto_1
    invoke-virtual {p1, v1, v2, v0, v3}, Landroid/content/ContentResolver;->call(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p1
    :try_end_0
    .catch Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$SerializationError; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_2
    const-string/jumbo v1, "method \'"

    const/4 v2, 0x2

    if-eqz p1, :cond_5

    :try_start_1
    iget-object v3, p0, Lcom/ui/sso/api/provider/a$r;->g:Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;

    invoke-interface {v3, p1}, Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;->b(Landroid/os/Bundle;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/sso/api/provider/e;
    :try_end_1
    .catch Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$SerializationError; {:try_start_1 .. :try_end_1} :catch_3

    instance-of v1, p1, Lcom/ui/sso/api/provider/e$a;

    if-eqz v1, :cond_4

    check-cast p1, Lcom/ui/sso/api/provider/e$a;

    invoke-virtual {p1}, Lcom/ui/sso/api/provider/e$a;->c()Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_3
    new-instance p1, Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider$ReceivedInvalidResponse;

    const-string/jumbo v1, "action not successful but no exception thrown"

    invoke-direct {p1, v1, v0, v2, v0}, Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider$ReceivedInvalidResponse;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :cond_4
    new-instance p1, Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider$ReceivedInvalidResponse;

    const-string/jumbo v1, "Received response of unexpected type"

    invoke-direct {p1, v1, v0, v2, v0}, Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider$ReceivedInvalidResponse;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :catch_3
    move-exception p1

    new-instance v0, Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider$ReceivedInvalidResponse;

    iget-object v2, p0, Lcom/ui/sso/api/provider/a$r;->e:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\' missing response"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider$ReceivedInvalidResponse;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_5
    new-instance p1, Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider$ReceivedInvalidResponse;

    iget-object v3, p0, Lcom/ui/sso/api/provider/a$r;->e:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\' got null response bundle"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1, v0, v2, v0}, Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider$ReceivedInvalidResponse;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :goto_3
    sget-object v0, Lcom/ui/sso/api/provider/UiAccountProviderError$InterprocessWrapper;->c:Lcom/ui/sso/api/provider/UiAccountProviderError$InterprocessWrapper$a;

    invoke-virtual {v0, p1}, Lcom/ui/sso/api/provider/UiAccountProviderError$InterprocessWrapper$a;->a(Ljava/lang/IllegalStateException;)Lcom/ui/sso/api/UiAccountApi$Error;

    move-result-object v0

    if-eqz v0, :cond_6

    move-object p1, v0

    :cond_6
    throw p1

    :goto_4
    new-instance v0, Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider$ProviderUnavailable;

    invoke-direct {v0, p1}, Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider$ProviderUnavailable;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :goto_5
    new-instance v0, Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider$IllegalState;

    const-string/jumbo v1, "failed to serialized request message"

    invoke-direct {v0, v1, p1}, Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider$IllegalState;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/ui/sso/api/provider/a$r;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lcom/ui/sso/api/provider/a$r;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lcom/ui/sso/api/provider/a$r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
