.class public final Lcom/ui/sso/api/provider/UiAccountProviderError$InterprocessWrapper$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/sso/api/provider/UiAccountProviderError$InterprocessWrapper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ui/sso/api/provider/UiAccountProviderError$InterprocessWrapper$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/IllegalStateException;)Lcom/ui/sso/api/UiAccountApi$Error;
    .locals 5

    const-string/jumbo v0, "ex"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_7

    new-instance v1, Lkotlin/text/p;

    const-string/jumbo v2, "UIAccountInterprocessError:(\\d+)-(.*)"

    invoke-direct {v1, v2}, Lkotlin/text/p;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Lkotlin/text/p;->l(Ljava/lang/CharSequence;)Lkotlin/text/l;

    move-result-object v1

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    invoke-interface {v1}, Lkotlin/text/l;->b()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x1

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lkotlin/text/t;->q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {v1}, Lkotlin/text/l;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    move-object v1, v0

    :cond_1
    check-cast v1, Ljava/lang/String;

    packed-switch v2, :pswitch_data_0

    new-instance v1, Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider$ReceivedInvalidResponse;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "unknown interprocess error "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0, v3, v0}, Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider$ReceivedInvalidResponse;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v1

    :pswitch_0
    new-instance v0, Lcom/ui/sso/api/UiAccountApi$Error$AccountManager$IO;

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    move-object p1, v1

    :goto_0
    invoke-direct {v0, p1}, Lcom/ui/sso/api/UiAccountApi$Error$AccountManager$IO;-><init>(Ljava/lang/String;)V

    goto :goto_4

    :pswitch_1
    new-instance v0, Lcom/ui/sso/api/UiAccountApi$Error$AccountManager$AccountNotFound;

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    move-object p1, v1

    :goto_1
    invoke-direct {v0, p1}, Lcom/ui/sso/api/UiAccountApi$Error$AccountManager$AccountNotFound;-><init>(Ljava/lang/String;)V

    goto :goto_4

    :pswitch_2
    new-instance v0, Lcom/ui/sso/api/UiAccountApi$Error$AccountManager$AccessRestricted;

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    move-object p1, v1

    :goto_2
    invoke-direct {v0, p1}, Lcom/ui/sso/api/UiAccountApi$Error$AccountManager$AccessRestricted;-><init>(Ljava/lang/String;)V

    goto :goto_4

    :pswitch_3
    new-instance v2, Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider$IllegalState;

    if-nez v1, :cond_5

    goto :goto_3

    :cond_5
    move-object p1, v1

    :goto_3
    invoke-direct {v2, p1, v0, v3, v0}, Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider$IllegalState;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v2

    goto :goto_4

    :pswitch_4
    new-instance p1, Lcom/ui/sso/api/UiAccountApi$Error$CallerSignCertMismatch;

    invoke-direct {p1}, Lcom/ui/sso/api/UiAccountApi$Error$CallerSignCertMismatch;-><init>()V

    move-object v0, p1

    goto :goto_4

    :cond_6
    new-instance v1, Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider$ReceivedInvalidResponse;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "invalid interprocess error message "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0, v3, v0}, Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider$ReceivedInvalidResponse;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v1

    :cond_7
    :goto_4
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
