.class Lorg/snmp4j/Snmp$AsyncRequestKey;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/Snmp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "AsyncRequestKey"
.end annotation


# instance fields
.field private listener:Lorg/snmp4j/event/ResponseListener;

.field private request:Lorg/snmp4j/PDU;


# direct methods
.method public constructor <init>(Lorg/snmp4j/PDU;Lorg/snmp4j/event/ResponseListener;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/snmp4j/Snmp$AsyncRequestKey;->request:Lorg/snmp4j/PDU;

    iput-object p2, p0, Lorg/snmp4j/Snmp$AsyncRequestKey;->listener:Lorg/snmp4j/event/ResponseListener;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lorg/snmp4j/Snmp$AsyncRequestKey;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lorg/snmp4j/Snmp$AsyncRequestKey;

    iget-object v0, p0, Lorg/snmp4j/Snmp$AsyncRequestKey;->request:Lorg/snmp4j/PDU;

    iget-object v2, p1, Lorg/snmp4j/Snmp$AsyncRequestKey;->request:Lorg/snmp4j/PDU;

    invoke-virtual {v0, v2}, Lorg/snmp4j/PDU;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/snmp4j/Snmp$AsyncRequestKey;->listener:Lorg/snmp4j/event/ResponseListener;

    iget-object p1, p1, Lorg/snmp4j/Snmp$AsyncRequestKey;->listener:Lorg/snmp4j/event/ResponseListener;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/Snmp$AsyncRequestKey;->request:Lorg/snmp4j/PDU;

    invoke-virtual {v0}, Lorg/snmp4j/PDU;->hashCode()I

    move-result v0

    return v0
.end method
