.class public final Lfb/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljavax/net/ssl/X509TrustManager;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfb/u$a;
    }
.end annotation


# static fields
.field public static final c:Lfb/u$a;

.field private static final d:LYg/m;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:LGb/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lfb/u$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lfb/u$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lfb/u;->c:Lfb/u$a;

    new-instance v0, Lfb/t;

    invoke-direct {v0}, Lfb/t;-><init>()V

    invoke-static {v0}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v0

    sput-object v0, Lfb/u;->d:LYg/m;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LGb/f;)V
    .locals 1

    const-string/jumbo v0, "macAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "storage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfb/u;->a:Ljava/lang/String;

    iput-object p2, p0, Lfb/u;->b:LGb/f;

    return-void
.end method

.method public static synthetic a()Ljavax/net/ssl/X509TrustManager;
    .locals 1

    invoke-static {}, Lfb/u;->e()Ljavax/net/ssl/X509TrustManager;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic b()LYg/m;
    .locals 1

    sget-object v0, Lfb/u;->d:LYg/m;

    return-object v0
.end method

.method private final c([Ljava/security/cert/X509Certificate;)V
    .locals 3

    iget-object v0, p0, Lfb/u;->a:Ljava/lang/String;

    invoke-static {p0, p1, v0}, Lfb/u;->d(Lfb/u;[Ljava/security/cert/X509Certificate;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/ui/unifi/core/base/net/client/UntrustedCertificateException;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, p1, v2, v1, v2}, Lcom/ui/unifi/core/base/net/client/UntrustedCertificateException;-><init>([Ljava/security/cert/Certificate;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method private static final d(Lfb/u;[Ljava/security/cert/X509Certificate;Ljava/lang/String;)Z
    .locals 0

    if-eqz p2, :cond_0

    iget-object p0, p0, Lfb/u;->b:LGb/f;

    invoke-interface {p0, p2, p1}, LGb/f;->D(Ljava/lang/String;[Ljava/security/cert/Certificate;)Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final e()Ljavax/net/ssl/X509TrustManager;
    .locals 6

    invoke-static {}, Ljavax/net/ssl/TrustManagerFactory;->getDefaultAlgorithm()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljavax/net/ssl/TrustManagerFactory;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljavax/net/ssl/TrustManagerFactory;->init(Ljava/security/KeyStore;)V

    invoke-virtual {v0}, Ljavax/net/ssl/TrustManagerFactory;->getTrustManagers()[Ljavax/net/ssl/TrustManager;

    move-result-object v0

    const-string/jumbo v2, "getTrustManagers(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v0, v3

    instance-of v5, v4, Ljavax/net/ssl/X509TrustManager;

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    move-object v4, v1

    :goto_1
    instance-of v0, v4, Ljavax/net/ssl/X509TrustManager;

    if-eqz v0, :cond_2

    move-object v1, v4

    check-cast v1, Ljavax/net/ssl/X509TrustManager;

    :cond_2
    return-object v1
.end method


# virtual methods
.method public checkClientTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
    .locals 1

    const-string/jumbo v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p1, "authType"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string/jumbo p2, "This implementation does not verify client certificates"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public checkServerTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
    .locals 1

    const-string/jumbo v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "authType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lfb/u;->c:Lfb/u$a;

    invoke-static {v0}, Lfb/u$a;->a(Lfb/u$a;)Ljavax/net/ssl/X509TrustManager;

    move-result-object v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-interface {v0, p1, p2}, Ljavax/net/ssl/X509TrustManager;->checkServerTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-direct {p0, p1}, Lfb/u;->c([Ljava/security/cert/X509Certificate;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lfb/u;->c([Ljava/security/cert/X509Certificate;)V

    :goto_0
    return-void
.end method

.method public getAcceptedIssuers()[Ljava/security/cert/X509Certificate;
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/security/cert/X509Certificate;

    return-object v0
.end method
