.class public final Lcom/ui/sso/api/provider/UiAccountProviderError$InterprocessWrapper;
.super Ljava/lang/IllegalStateException;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/sso/api/provider/UiAccountProviderError;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "InterprocessWrapper"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/sso/api/provider/UiAccountProviderError$InterprocessWrapper$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0018\u0000 \u00112\u00060\u0001j\u0002`\u0002:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\u0007\u0010\tR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/ui/sso/api/provider/UiAccountProviderError$InterprocessWrapper;",
        "Ljava/lang/IllegalStateException;",
        "Lkotlin/IllegalStateException;",
        "Lcom/ui/sso/api/provider/UiAccountProviderError;",
        "cause",
        "<init>",
        "(Lcom/ui/sso/api/provider/UiAccountProviderError;)V",
        "a",
        "Lcom/ui/sso/api/provider/UiAccountProviderError;",
        "()Lcom/ui/sso/api/provider/UiAccountProviderError;",
        "",
        "b",
        "Ljava/lang/String;",
        "getMessage",
        "()Ljava/lang/String;",
        "message",
        "",
        "c",
        "()I",
        "id",
        "account_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final c:Lcom/ui/sso/api/provider/UiAccountProviderError$InterprocessWrapper$a;


# instance fields
.field private final a:Lcom/ui/sso/api/provider/UiAccountProviderError;

.field private final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/sso/api/provider/UiAccountProviderError$InterprocessWrapper$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/sso/api/provider/UiAccountProviderError$InterprocessWrapper$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/sso/api/provider/UiAccountProviderError$InterprocessWrapper;->c:Lcom/ui/sso/api/provider/UiAccountProviderError$InterprocessWrapper$a;

    return-void
.end method

.method public constructor <init>(Lcom/ui/sso/api/provider/UiAccountProviderError;)V
    .locals 3

    const-string/jumbo v0, "cause"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    iput-object p1, p0, Lcom/ui/sso/api/provider/UiAccountProviderError$InterprocessWrapper;->a:Lcom/ui/sso/api/provider/UiAccountProviderError;

    invoke-direct {p0}, Lcom/ui/sso/api/provider/UiAccountProviderError$InterprocessWrapper;->c()I

    move-result p1

    invoke-virtual {p0}, Lcom/ui/sso/api/provider/UiAccountProviderError$InterprocessWrapper;->a()Lcom/ui/sso/api/provider/UiAccountProviderError;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "UIAccountInterprocessError:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "-"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/sso/api/provider/UiAccountProviderError$InterprocessWrapper;->b:Ljava/lang/String;

    return-void
.end method

.method private final c()I
    .locals 2

    invoke-virtual {p0}, Lcom/ui/sso/api/provider/UiAccountProviderError$InterprocessWrapper;->a()Lcom/ui/sso/api/provider/UiAccountProviderError;

    move-result-object v0

    instance-of v1, v0, Lcom/ui/sso/api/provider/UiAccountProviderError$CallerSignCertMismatch;

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    instance-of v1, v0, Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    instance-of v0, v0, Lcom/ui/sso/api/provider/UiAccountProviderError$AccountManager;

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lcom/ui/sso/api/provider/UiAccountProviderError$InterprocessWrapper;->a()Lcom/ui/sso/api/provider/UiAccountProviderError;

    move-result-object v0

    check-cast v0, Lcom/ui/sso/api/provider/UiAccountProviderError$AccountManager;

    invoke-virtual {v0}, Lcom/ui/sso/api/provider/UiAccountProviderError$AccountManager;->a()Lcom/ui/sso/account/UIAccountManager$Error;

    move-result-object v0

    instance-of v1, v0, Lcom/ui/sso/account/UIAccountManager$Error$AccessRestricted;

    if-eqz v1, :cond_2

    const/4 v0, 0x2

    goto :goto_0

    :cond_2
    instance-of v1, v0, Lcom/ui/sso/account/UIAccountManager$Error$NotFound;

    if-eqz v1, :cond_3

    const/4 v0, 0x3

    goto :goto_0

    :cond_3
    instance-of v0, v0, Lcom/ui/sso/account/UIAccountManager$Error$IO;

    if-eqz v0, :cond_4

    const/4 v0, 0x4

    :goto_0
    return v0

    :cond_4
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_5
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method


# virtual methods
.method public a()Lcom/ui/sso/api/provider/UiAccountProviderError;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/api/provider/UiAccountProviderError$InterprocessWrapper;->a:Lcom/ui/sso/api/provider/UiAccountProviderError;

    return-object v0
.end method

.method public bridge synthetic getCause()Ljava/lang/Throwable;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/sso/api/provider/UiAccountProviderError$InterprocessWrapper;->a()Lcom/ui/sso/api/provider/UiAccountProviderError;

    move-result-object v0

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/api/provider/UiAccountProviderError$InterprocessWrapper;->b:Ljava/lang/String;

    return-object v0
.end method
