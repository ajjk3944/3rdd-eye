.class public Lorg/snmp4j/util/TreeEvent;
.super Lorg/snmp4j/util/RetrievalEvent;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = 0x4e8e327068e77934L


# direct methods
.method public constructor <init>(Lorg/snmp4j/util/TreeUtils$TreeRequest;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lorg/snmp4j/util/RetrievalEvent;-><init>(Lorg/snmp4j/util/TreeUtils$TreeRequest;Ljava/lang/Object;I)V

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/util/TreeUtils$TreeRequest;Ljava/lang/Object;Ljava/lang/Exception;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2, p3}, Lorg/snmp4j/util/RetrievalEvent;-><init>(Lorg/snmp4j/util/TreeUtils$TreeRequest;Ljava/lang/Object;Ljava/lang/Exception;)V

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/util/TreeUtils$TreeRequest;Ljava/lang/Object;Lorg/snmp4j/PDU;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lorg/snmp4j/util/RetrievalEvent;-><init>(Lorg/snmp4j/util/TreeUtils$TreeRequest;Ljava/lang/Object;Lorg/snmp4j/PDU;)V

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/util/TreeUtils$TreeRequest;Ljava/lang/Object;[Lorg/snmp4j/smi/VariableBinding;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lorg/snmp4j/util/RetrievalEvent;-><init>(Lorg/snmp4j/event/ResponseListener;Ljava/lang/Object;[Lorg/snmp4j/smi/VariableBinding;)V

    return-void
.end method


# virtual methods
.method public getVariableBindings()[Lorg/snmp4j/smi/VariableBinding;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/util/RetrievalEvent;->vbs:[Lorg/snmp4j/smi/VariableBinding;

    return-object v0
.end method
