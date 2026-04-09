.class public Lorg/snmp4j/util/TableUtils$ColumnsOfRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/util/TableUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "ColumnsOfRequest"
.end annotation


# instance fields
.field private columnIDs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private lastReceived:Lorg/snmp4j/util/TableUtils$LastReceived;

.field private requestSerial:I

.field final synthetic this$0:Lorg/snmp4j/util/TableUtils;


# direct methods
.method public constructor <init>(Lorg/snmp4j/util/TableUtils;Ljava/util/List;ILorg/snmp4j/util/TableUtils$LastReceived;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;I",
            "Lorg/snmp4j/util/TableUtils$LastReceived;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lorg/snmp4j/util/TableUtils$ColumnsOfRequest;->this$0:Lorg/snmp4j/util/TableUtils;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lorg/snmp4j/util/TableUtils$ColumnsOfRequest;->columnIDs:Ljava/util/List;

    iput p3, p0, Lorg/snmp4j/util/TableUtils$ColumnsOfRequest;->requestSerial:I

    iput-object p4, p0, Lorg/snmp4j/util/TableUtils$ColumnsOfRequest;->lastReceived:Lorg/snmp4j/util/TableUtils$LastReceived;

    return-void
.end method

.method static synthetic access$500(Lorg/snmp4j/util/TableUtils$ColumnsOfRequest;)Lorg/snmp4j/util/TableUtils$LastReceived;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/util/TableUtils$ColumnsOfRequest;->lastReceived:Lorg/snmp4j/util/TableUtils$LastReceived;

    return-object p0
.end method


# virtual methods
.method public getColumnIDs()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/util/TableUtils$ColumnsOfRequest;->columnIDs:Ljava/util/List;

    return-object v0
.end method

.method public getLastReceived()Lorg/snmp4j/util/TableUtils$LastReceived;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/util/TableUtils$ColumnsOfRequest;->lastReceived:Lorg/snmp4j/util/TableUtils$LastReceived;

    return-object v0
.end method

.method public getRequestSerial()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/util/TableUtils$ColumnsOfRequest;->requestSerial:I

    return v0
.end method
