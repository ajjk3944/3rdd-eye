.class public final Lcom/ui/unifi/core/base/net/client/UntrustedCertificateException;
.super Ljava/security/cert/CertificateException;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B#\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00030\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\t\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/ui/unifi/core/base/net/client/UntrustedCertificateException;",
        "Ljava/security/cert/CertificateException;",
        "",
        "Ljava/security/cert/Certificate;",
        "certificates",
        "",
        "cause",
        "<init>",
        "([Ljava/security/cert/Certificate;Ljava/lang/Throwable;)V",
        "a",
        "[Ljava/security/cert/Certificate;",
        "()[Ljava/security/cert/Certificate;",
        "unificore_release"
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
.field private final a:[Ljava/security/cert/Certificate;


# direct methods
.method public constructor <init>([Ljava/security/cert/Certificate;Ljava/lang/Throwable;)V
    .locals 1

    const-string/jumbo v0, "certificates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    const-string/jumbo v0, "Untrusted certificate"

    invoke-direct {p0, v0, p2}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-object p1, p0, Lcom/ui/unifi/core/base/net/client/UntrustedCertificateException;->a:[Ljava/security/cert/Certificate;

    return-void
.end method

.method public synthetic constructor <init>([Ljava/security/cert/Certificate;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/ui/unifi/core/base/net/client/UntrustedCertificateException;-><init>([Ljava/security/cert/Certificate;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final a()[Ljava/security/cert/Certificate;
    .locals 1

    iget-object v0, p0, Lcom/ui/unifi/core/base/net/client/UntrustedCertificateException;->a:[Ljava/security/cert/Certificate;

    return-object v0
.end method
