.class public interface abstract Lorg/snmp4j/security/AuthenticationProtocol;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/security/SecurityProtocol;


# virtual methods
.method public abstract authenticate([B[BIILorg/snmp4j/security/ByteArrayWindow;)Z
.end method

.method public abstract changeDelta([B[B[B)[B
.end method

.method public abstract getAuthenticationCodeLength()I
.end method

.method public abstract getDigestLength()I
.end method

.method public abstract getID()Lorg/snmp4j/smi/OID;
.end method

.method public abstract hash([B)[B
.end method

.method public abstract hash([BII)[B
.end method

.method public abstract isAuthentic([B[BIILorg/snmp4j/security/ByteArrayWindow;)Z
.end method

.method public abstract passwordToKey(Lorg/snmp4j/smi/OctetString;[B)[B
.end method
