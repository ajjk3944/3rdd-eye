.class public Lorg/snmp4j/event/CounterEvent;
.super Ljava/util/EventObject;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = 0x6ddd15e64bf4cb61L


# instance fields
.field private currentValue:Lorg/snmp4j/smi/Variable;

.field private increment:J

.field private index:Ljava/lang/Object;

.field private oid:Lorg/snmp4j/smi/OID;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Ljava/util/EventObject;-><init>(Ljava/lang/Object;)V

    .line 2
    new-instance p1, Lorg/snmp4j/smi/Counter32;

    invoke-direct {p1}, Lorg/snmp4j/smi/Counter32;-><init>()V

    iput-object p1, p0, Lorg/snmp4j/event/CounterEvent;->currentValue:Lorg/snmp4j/smi/Variable;

    const-wide/16 v0, 0x1

    .line 3
    iput-wide v0, p0, Lorg/snmp4j/event/CounterEvent;->increment:J

    .line 4
    iput-object p2, p0, Lorg/snmp4j/event/CounterEvent;->oid:Lorg/snmp4j/smi/OID;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;J)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    .line 6
    iput-wide p3, p0, Lorg/snmp4j/event/CounterEvent;->increment:J

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;Ljava/lang/Object;J)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2, p4, p5}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;J)V

    .line 8
    iput-object p3, p0, Lorg/snmp4j/event/CounterEvent;->index:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public getCurrentValue()Lorg/snmp4j/smi/Variable;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/event/CounterEvent;->currentValue:Lorg/snmp4j/smi/Variable;

    return-object v0
.end method

.method public getIncrement()J
    .locals 2

    iget-wide v0, p0, Lorg/snmp4j/event/CounterEvent;->increment:J

    return-wide v0
.end method

.method public getIndex()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/event/CounterEvent;->index:Ljava/lang/Object;

    return-object v0
.end method

.method public getOid()Lorg/snmp4j/smi/OID;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/event/CounterEvent;->oid:Lorg/snmp4j/smi/OID;

    return-object v0
.end method

.method public setCurrentValue(Lorg/snmp4j/smi/Variable;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/event/CounterEvent;->currentValue:Lorg/snmp4j/smi/Variable;

    return-void
.end method

.method public setIncrement(J)V
    .locals 0

    iput-wide p1, p0, Lorg/snmp4j/event/CounterEvent;->increment:J

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CounterEvent{oid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/event/CounterEvent;->oid:Lorg/snmp4j/smi/OID;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", currentValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/event/CounterEvent;->currentValue:Lorg/snmp4j/smi/Variable;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", increment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lorg/snmp4j/event/CounterEvent;->increment:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", index="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/event/CounterEvent;->index:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "} "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Ljava/util/EventObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
