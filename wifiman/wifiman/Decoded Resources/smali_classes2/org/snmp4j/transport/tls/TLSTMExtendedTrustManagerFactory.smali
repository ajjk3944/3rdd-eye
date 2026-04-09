.class public Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManagerFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/transport/TLSTM$TLSTMTrustManagerFactory;


# instance fields
.field private counterSupport:Lorg/snmp4j/mp/CounterSupport;

.field private securityCallback:Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/snmp4j/transport/tls/TlsTmSecurityCallback<",
            "Ljava/security/cert/X509Certificate;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lorg/snmp4j/mp/CounterSupport;Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/snmp4j/mp/CounterSupport;",
            "Lorg/snmp4j/transport/tls/TlsTmSecurityCallback<",
            "Ljava/security/cert/X509Certificate;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManagerFactory;->counterSupport:Lorg/snmp4j/mp/CounterSupport;

    iput-object p2, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManagerFactory;->securityCallback:Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;

    return-void
.end method


# virtual methods
.method public create(Ljavax/net/ssl/X509TrustManager;ZLorg/snmp4j/TransportStateReference;)Ljavax/net/ssl/X509TrustManager;
    .locals 7

    new-instance v6, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;

    iget-object v1, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManagerFactory;->counterSupport:Lorg/snmp4j/mp/CounterSupport;

    iget-object v2, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManagerFactory;->securityCallback:Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;

    move-object v0, v6

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;-><init>(Lorg/snmp4j/mp/CounterSupport;Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;Ljavax/net/ssl/X509TrustManager;ZLorg/snmp4j/TransportStateReference;)V

    return-object v6
.end method
