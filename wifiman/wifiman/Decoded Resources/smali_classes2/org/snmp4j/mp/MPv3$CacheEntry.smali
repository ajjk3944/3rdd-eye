.class public Lorg/snmp4j/mp/MPv3$CacheEntry;
.super Lorg/snmp4j/mp/StateReference;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/mp/MPv3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "CacheEntry"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A::",
        "Lorg/snmp4j/smi/Address;",
        ">",
        "Lorg/snmp4j/mp/StateReference<",
        "TA;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x78b5ab567feb3b0fL


# instance fields
.field contextEngineID:[B

.field contextName:[B

.field errorCode:I

.field msgID:I

.field secEngineID:[B

.field secLevel:I

.field secModel:Lorg/snmp4j/security/SecurityModel;

.field secName:[B

.field secStateReference:Lorg/snmp4j/security/SecurityStateReference;

.field transactionID:J


# direct methods
.method public constructor <init>(IJ[BLorg/snmp4j/security/SecurityModel;[BI[B[BLorg/snmp4j/security/SecurityStateReference;I)V
    .locals 0

    invoke-direct {p0}, Lorg/snmp4j/mp/StateReference;-><init>()V

    iput p1, p0, Lorg/snmp4j/mp/MPv3$CacheEntry;->msgID:I

    iput-wide p2, p0, Lorg/snmp4j/mp/MPv3$CacheEntry;->transactionID:J

    iput-object p4, p0, Lorg/snmp4j/mp/MPv3$CacheEntry;->secEngineID:[B

    iput-object p5, p0, Lorg/snmp4j/mp/MPv3$CacheEntry;->secModel:Lorg/snmp4j/security/SecurityModel;

    iput-object p6, p0, Lorg/snmp4j/mp/MPv3$CacheEntry;->secName:[B

    iput p7, p0, Lorg/snmp4j/mp/MPv3$CacheEntry;->secLevel:I

    iput-object p8, p0, Lorg/snmp4j/mp/MPv3$CacheEntry;->contextEngineID:[B

    iput-object p9, p0, Lorg/snmp4j/mp/MPv3$CacheEntry;->contextName:[B

    iput-object p10, p0, Lorg/snmp4j/mp/MPv3$CacheEntry;->secStateReference:Lorg/snmp4j/security/SecurityStateReference;

    iput p11, p0, Lorg/snmp4j/mp/MPv3$CacheEntry;->errorCode:I

    return-void
.end method
