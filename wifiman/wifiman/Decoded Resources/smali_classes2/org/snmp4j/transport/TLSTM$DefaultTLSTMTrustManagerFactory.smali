.class Lorg/snmp4j/transport/TLSTM$DefaultTLSTMTrustManagerFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/transport/TLSTM$TLSTMTrustManagerFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/transport/TLSTM;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "DefaultTLSTMTrustManagerFactory"
.end annotation


# instance fields
.field final synthetic this$0:Lorg/snmp4j/transport/TLSTM;


# direct methods
.method private constructor <init>(Lorg/snmp4j/transport/TLSTM;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/snmp4j/transport/TLSTM$DefaultTLSTMTrustManagerFactory;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/snmp4j/transport/TLSTM;Lorg/snmp4j/transport/TLSTM$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lorg/snmp4j/transport/TLSTM$DefaultTLSTMTrustManagerFactory;-><init>(Lorg/snmp4j/transport/TLSTM;)V

    return-void
.end method


# virtual methods
.method public create(Ljavax/net/ssl/X509TrustManager;ZLorg/snmp4j/TransportStateReference;)Ljavax/net/ssl/X509TrustManager;
    .locals 7

    new-instance v6, Lorg/snmp4j/transport/tls/TlsTrustManager;

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$DefaultTLSTMTrustManagerFactory;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-static {v0}, Lorg/snmp4j/transport/TLSTM;->access$200(Lorg/snmp4j/transport/TLSTM;)Lorg/snmp4j/mp/CounterSupport;

    move-result-object v4

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$DefaultTLSTMTrustManagerFactory;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-static {v0}, Lorg/snmp4j/transport/TLSTM;->access$600(Lorg/snmp4j/transport/TLSTM;)Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;

    move-result-object v5

    move-object v0, v6

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lorg/snmp4j/transport/tls/TlsTrustManager;-><init>(Ljavax/net/ssl/X509TrustManager;ZLorg/snmp4j/TransportStateReference;Lorg/snmp4j/mp/CounterSupport;Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;)V

    return-object v6
.end method
