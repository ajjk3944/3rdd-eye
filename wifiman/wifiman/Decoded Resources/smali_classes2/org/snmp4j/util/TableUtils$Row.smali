.class Lorg/snmp4j/util/TableUtils$Row;
.super Ljava/util/Vector;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/util/TableUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "Row"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/Vector<",
        "Lorg/snmp4j/smi/VariableBinding;",
        ">;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x1fe191a908bafe13L


# instance fields
.field private index:Lorg/snmp4j/smi/OID;

.field private orderError:Z

.field final synthetic this$0:Lorg/snmp4j/util/TableUtils;


# direct methods
.method public constructor <init>(Lorg/snmp4j/util/TableUtils;Lorg/snmp4j/smi/OID;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/util/TableUtils$Row;->this$0:Lorg/snmp4j/util/TableUtils;

    invoke-direct {p0}, Ljava/util/Vector;-><init>()V

    iput-object p2, p0, Lorg/snmp4j/util/TableUtils$Row;->index:Lorg/snmp4j/smi/OID;

    return-void
.end method

.method static synthetic access$300(Lorg/snmp4j/util/TableUtils$Row;)Lorg/snmp4j/smi/OID;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/util/TableUtils$Row;->index:Lorg/snmp4j/smi/OID;

    return-object p0
.end method

.method static synthetic access$400(Lorg/snmp4j/util/TableUtils$Row;)Z
    .locals 0

    iget-boolean p0, p0, Lorg/snmp4j/util/TableUtils$Row;->orderError:Z

    return p0
.end method

.method static synthetic access$402(Lorg/snmp4j/util/TableUtils$Row;Z)Z
    .locals 0

    iput-boolean p1, p0, Lorg/snmp4j/util/TableUtils$Row;->orderError:Z

    return p1
.end method


# virtual methods
.method public getNumComplete()I
    .locals 1

    invoke-super {p0}, Ljava/util/Vector;->size()I

    move-result v0

    return v0
.end method

.method public getRowIndex()Lorg/snmp4j/smi/OID;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/util/TableUtils$Row;->index:Lorg/snmp4j/smi/OID;

    return-object v0
.end method

.method public isOrderError()Z
    .locals 1

    iget-boolean v0, p0, Lorg/snmp4j/util/TableUtils$Row;->orderError:Z

    return v0
.end method

.method public setNumComplete(I)Z
    .locals 3

    invoke-virtual {p0}, Lorg/snmp4j/util/TableUtils$Row;->getNumComplete()I

    move-result v0

    sub-int/2addr p1, v0

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, p1, :cond_0

    const/4 v2, 0x0

    invoke-super {p0, v2}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    if-ltz p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method
