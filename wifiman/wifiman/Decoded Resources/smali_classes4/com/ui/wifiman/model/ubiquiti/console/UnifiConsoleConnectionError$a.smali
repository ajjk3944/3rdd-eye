.class public final Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;
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
    invoke-direct {p0}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$a;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/security/cert/Certificate;)Ljava/security/cert/X509Certificate;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$a;->e(Ljava/security/cert/Certificate;)Ljava/security/cert/X509Certificate;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/security/cert/Certificate;)Ljava/security/cert/X509Certificate;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$a;->d(Ljava/security/cert/Certificate;)Ljava/security/cert/X509Certificate;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Ljava/security/cert/Certificate;)Ljava/security/cert/X509Certificate;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    check-cast p0, Ljava/security/cert/X509Certificate;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$IO;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$IO;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method private static final e(Ljava/security/cert/Certificate;)Ljava/security/cert/X509Certificate;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    check-cast p0, Ljava/security/cert/X509Certificate;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$IO;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$IO;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method


# virtual methods
.method public final c(Ljava/lang/Throwable;)Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;
    .locals 4

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;

    return-object p1

    :cond_0
    instance-of v0, p1, Ljava/lang/RuntimeException;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Ljava/lang/RuntimeException;

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_2

    sget-object v2, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;->a:Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$a;

    invoke-virtual {v2, v0}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$a;->c(Ljava/lang/Throwable;)Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;

    move-result-object v0

    goto :goto_1

    :cond_2
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_3

    return-object v0

    :cond_3
    instance-of v0, p1, Lcom/ui/unifi/core/base/net/client/UntrustedCertificateException;

    if-eqz v0, :cond_4

    new-instance v1, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$UntrustedCertificate;

    move-object v0, p1

    check-cast v0, Lcom/ui/unifi/core/base/net/client/UntrustedCertificateException;

    invoke-virtual {v0}, Lcom/ui/unifi/core/base/net/client/UntrustedCertificateException;->a()[Ljava/security/cert/Certificate;

    move-result-object v0

    invoke-static {v0}, LZg/n;->Q([Ljava/lang/Object;)Lzi/j;

    move-result-object v0

    new-instance v2, LQd/i;

    invoke-direct {v2}, LQd/i;-><init>()V

    invoke-static {v0, v2}, Lzi/m;->N(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v0

    invoke-static {v0}, Lzi/m;->b0(Lzi/j;)Ljava/util/Set;

    move-result-object v0

    invoke-direct {v1, v0, p1}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$UntrustedCertificate;-><init>(Ljava/util/Set;Ljava/lang/Throwable;)V

    goto/16 :goto_6

    :cond_4
    instance-of v0, p1, Ljavax/net/ssl/SSLException;

    if-eqz v0, :cond_8

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v2, v0, Lcom/ui/unifi/core/base/net/client/UntrustedCertificateException;

    if-eqz v2, :cond_5

    check-cast v0, Lcom/ui/unifi/core/base/net/client/UntrustedCertificateException;

    goto :goto_2

    :cond_5
    move-object v0, v1

    :goto_2
    if-eqz v0, :cond_7

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    instance-of v0, p1, Lcom/ui/unifi/core/base/net/client/UntrustedCertificateException;

    if-eqz v0, :cond_6

    check-cast p1, Lcom/ui/unifi/core/base/net/client/UntrustedCertificateException;

    goto :goto_3

    :cond_6
    move-object p1, v1

    :goto_3
    if-eqz p1, :cond_f

    new-instance v1, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$UntrustedCertificate;

    invoke-virtual {p1}, Lcom/ui/unifi/core/base/net/client/UntrustedCertificateException;->a()[Ljava/security/cert/Certificate;

    move-result-object v0

    invoke-static {v0}, LZg/n;->Q([Ljava/lang/Object;)Lzi/j;

    move-result-object v0

    new-instance v2, LQd/j;

    invoke-direct {v2}, LQd/j;-><init>()V

    invoke-static {v0, v2}, Lzi/m;->N(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v0

    invoke-static {v0}, Lzi/m;->b0(Lzi/j;)Ljava/util/Set;

    move-result-object v0

    invoke-direct {v1, v0, p1}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$UntrustedCertificate;-><init>(Ljava/util/Set;Ljava/lang/Throwable;)V

    goto :goto_6

    :cond_7
    new-instance v1, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$RequestFailed;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unknown SSL exception : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, p1}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$RequestFailed;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_6

    :cond_8
    instance-of v0, p1, Lcom/ui/unifi/core/base/net/client/http/InvalidNcaTokenException;

    if-nez v0, :cond_d

    instance-of v0, p1, Lcom/ui/unifi/core/sso/exceptions/TwoFaRequiredException;

    if-nez v0, :cond_d

    instance-of v0, p1, Lcom/ui/unifi/core/http/exceptions/UnauthorisedException;

    if-eqz v0, :cond_9

    goto :goto_5

    :cond_9
    instance-of v0, p1, Lcom/ui/unifi/core/base/net/webrtc/WebRtcClientDisconnectedException;

    if-nez v0, :cond_c

    instance-of v0, p1, Ljava/net/UnknownHostException;

    if-nez v0, :cond_c

    instance-of v0, p1, Ljava/net/ConnectException;

    if-nez v0, :cond_c

    instance-of v0, p1, Ljava/net/SocketTimeoutException;

    if-nez v0, :cond_c

    instance-of v0, p1, Lretrofit2/HttpException;

    if-eqz v0, :cond_a

    goto :goto_4

    :cond_a
    instance-of v0, p1, Lcom/ui/unifi/core/base/net/exceptions/ApiRequestException;

    if-nez v0, :cond_b

    instance-of v0, p1, Lcom/ui/unifi/core/base/net/client/MissingDataClientException;

    if-nez v0, :cond_b

    instance-of v0, p1, Ljava/util/concurrent/TimeoutException;

    if-eqz v0, :cond_f

    :cond_b
    new-instance v1, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$RequestFailed;

    const-string v0, "Request timed out"

    invoke-direct {v1, v0, p1}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$RequestFailed;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_6

    :cond_c
    :goto_4
    new-instance v1, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$IO;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$IO;-><init>(Ljava/lang/Throwable;)V

    goto :goto_6

    :cond_d
    :goto_5
    new-instance v1, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$Unauthorized;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_e

    const-string v0, "Unauthorized"

    :cond_e
    invoke-direct {v1, v0, p1}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$Unauthorized;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_f
    :goto_6
    return-object v1
.end method
