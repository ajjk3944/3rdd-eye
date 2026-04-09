.class public Lorg/snmp4j/mp/MutableStateReference;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private stateReference:Lorg/snmp4j/mp/StateReference;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getStateReference()Lorg/snmp4j/mp/StateReference;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/mp/MutableStateReference;->stateReference:Lorg/snmp4j/mp/StateReference;

    return-object v0
.end method

.method public setStateReference(Lorg/snmp4j/mp/StateReference;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/mp/MutableStateReference;->stateReference:Lorg/snmp4j/mp/StateReference;

    return-void
.end method
