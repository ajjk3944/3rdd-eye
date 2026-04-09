.class public abstract Lorg/snmp4j/smi/ReadonlyVariableCallback;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/smi/VariantVariableCallback;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract updateVariable(Lorg/snmp4j/smi/VariantVariable;)V
.end method

.method public final variableUpdated(Lorg/snmp4j/smi/VariantVariable;)V
    .locals 0

    return-void
.end method
