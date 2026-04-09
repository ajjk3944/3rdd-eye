.class interface abstract Lorg/snmp4j/transport/TLSTM$SSLEngineConfigurator;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/transport/TLSTM;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x608
    name = "SSLEngineConfigurator"
.end annotation


# virtual methods
.method public abstract configure(Ljavax/net/ssl/SSLEngine;)V
.end method

.method public abstract getSSLContext(ZLorg/snmp4j/TransportStateReference;)Ljavax/net/ssl/SSLContext;
.end method
