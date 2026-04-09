.class final Lcom/ui/sso/api/provider/a$i;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/sso/api/provider/a;->u(Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lcom/ui/sso/api/provider/a;


# direct methods
.method constructor <init>(Lcom/ui/sso/api/provider/a;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/sso/api/provider/a$i;->b:Lcom/ui/sso/api/provider/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 1

    new-instance p1, Lcom/ui/sso/api/provider/a$i;

    iget-object v0, p0, Lcom/ui/sso/api/provider/a$i;->b:Lcom/ui/sso/api/provider/a;

    invoke-direct {p1, v0, p2}, Lcom/ui/sso/api/provider/a$i;-><init>(Lcom/ui/sso/api/provider/a;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lcom/ui/sso/api/provider/a$i;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, Lcom/ui/sso/api/provider/a$i;->a:I

    if-nez v0, :cond_2

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_0
    iget-object p1, p0, Lcom/ui/sso/api/provider/a$i;->b:Lcom/ui/sso/api/provider/a;

    invoke-static {p1}, Lcom/ui/sso/api/provider/a;->p(Lcom/ui/sso/api/provider/a;)Landroid/content/ContentResolver;

    move-result-object v0

    iget-object p1, p0, Lcom/ui/sso/api/provider/a$i;->b:Lcom/ui/sso/api/provider/a;

    invoke-static {p1}, Lcom/ui/sso/api/provider/a;->s(Lcom/ui/sso/api/provider/a;)Lcom/ui/sso/api/provider/f;

    move-result-object p1

    invoke-interface {p1}, Lcom/ui/sso/api/provider/f;->a()Landroid/net/Uri;

    move-result-object v1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/ui/sso/api/provider/a$i;->b:Lcom/ui/sso/api/provider/a;

    invoke-static {v0}, Lcom/ui/sso/api/provider/a;->l(Lcom/ui/sso/api/provider/a;)Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer;

    move-result-object v0

    const-class v1, Lcom/ui/sso/api/provider/UiAccountProviderCursor$a;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer;->a(Landroid/database/Cursor;Lth/d;)Lcom/ui/sso/api/provider/UiAccountProviderCursor;

    move-result-object p1

    check-cast p1, Lcom/ui/sso/api/provider/UiAccountProviderCursor$a;

    invoke-virtual {p1}, Lcom/ui/sso/api/provider/UiAccountProviderCursor$a;->a()Ljava/util/List;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    goto :goto_2

    :cond_0
    new-instance p1, Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider$ReceivedInvalidResponse;

    const-string/jumbo v0, "Null cursor in accounts query"

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p1, v0, v2, v1, v2}, Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider$ReceivedInvalidResponse;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer$Error; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    sget-object v0, Lcom/ui/sso/api/provider/UiAccountProviderError$InterprocessWrapper;->c:Lcom/ui/sso/api/provider/UiAccountProviderError$InterprocessWrapper$a;

    invoke-virtual {v0, p1}, Lcom/ui/sso/api/provider/UiAccountProviderError$InterprocessWrapper$a;->a(Ljava/lang/IllegalStateException;)Lcom/ui/sso/api/UiAccountApi$Error;

    move-result-object v0

    if-eqz v0, :cond_1

    move-object p1, v0

    :cond_1
    throw p1

    :goto_1
    new-instance v0, Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider$ReceivedInvalidResponse;

    invoke-virtual {p1}, Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer$Error;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider$ReceivedInvalidResponse;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :goto_2
    new-instance v0, Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider$ProviderUnavailable;

    invoke-direct {v0, p1}, Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider$ProviderUnavailable;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/ui/sso/api/provider/a$i;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lcom/ui/sso/api/provider/a$i;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lcom/ui/sso/api/provider/a$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
