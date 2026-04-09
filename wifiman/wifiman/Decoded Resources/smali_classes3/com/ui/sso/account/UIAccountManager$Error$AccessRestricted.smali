.class public final Lcom/ui/sso/account/UIAccountManager$Error$AccessRestricted;
.super Lcom/ui/sso/account/UIAccountManager$Error;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/sso/account/UIAccountManager$Error;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AccessRestricted"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0006\u0010\u0008R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/ui/sso/account/UIAccountManager$Error$AccessRestricted;",
        "Lcom/ui/sso/account/UIAccountManager$Error;",
        "Ljava/lang/SecurityException;",
        "cause",
        "<init>",
        "(Ljava/lang/SecurityException;)V",
        "a",
        "Ljava/lang/SecurityException;",
        "()Ljava/lang/SecurityException;",
        "",
        "b",
        "Ljava/lang/String;",
        "getMessage",
        "()Ljava/lang/String;",
        "message",
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


# instance fields
.field private final a:Ljava/lang/SecurityException;

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/SecurityException;)V
    .locals 2

    const-string/jumbo v0, "cause"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/sso/account/UIAccountManager$Error;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ui/sso/account/UIAccountManager$Error$AccessRestricted;->a:Ljava/lang/SecurityException;

    invoke-virtual {p0}, Lcom/ui/sso/account/UIAccountManager$Error$AccessRestricted;->a()Ljava/lang/SecurityException;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Account type seem to be managed by other package. Cause: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/sso/account/UIAccountManager$Error$AccessRestricted;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/SecurityException;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/account/UIAccountManager$Error$AccessRestricted;->a:Ljava/lang/SecurityException;

    return-object v0
.end method

.method public bridge synthetic getCause()Ljava/lang/Throwable;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/sso/account/UIAccountManager$Error$AccessRestricted;->a()Ljava/lang/SecurityException;

    move-result-object v0

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/account/UIAccountManager$Error$AccessRestricted;->b:Ljava/lang/String;

    return-object v0
.end method
