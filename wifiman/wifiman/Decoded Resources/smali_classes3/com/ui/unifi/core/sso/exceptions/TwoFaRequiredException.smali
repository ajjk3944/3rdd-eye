.class public final Lcom/ui/unifi/core/sso/exceptions/TwoFaRequiredException;
.super Ljava/lang/Exception;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\u0007\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/ui/unifi/core/sso/exceptions/TwoFaRequiredException;",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "LEb/z;",
        "response",
        "<init>",
        "(LEb/z;)V",
        "a",
        "LEb/z;",
        "()LEb/z;",
        "SSO_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:LEb/z;


# direct methods
.method public constructor <init>(LEb/z;)V
    .locals 1

    const-string/jumbo v0, "Two Factor Token Required!"

    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/unifi/core/sso/exceptions/TwoFaRequiredException;->a:LEb/z;

    return-void
.end method


# virtual methods
.method public final a()LEb/z;
    .locals 1

    iget-object v0, p0, Lcom/ui/unifi/core/sso/exceptions/TwoFaRequiredException;->a:LEb/z;

    return-object v0
.end method
