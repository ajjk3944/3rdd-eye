.class Lorg/snmp4j/util/TableUtils$LastReceived;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/util/TableUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "LastReceived"
.end annotation


# instance fields
.field private columnInfos:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/snmp4j/util/TableUtils$LastReceivedColumnInfo;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lorg/snmp4j/util/TableUtils;


# direct methods
.method public constructor <init>(Lorg/snmp4j/util/TableUtils;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lorg/snmp4j/smi/OID;",
            ">;)V"
        }
    .end annotation

    .line 5
    iput-object p1, p0, Lorg/snmp4j/util/TableUtils$LastReceived;->this$0:Lorg/snmp4j/util/TableUtils;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lorg/snmp4j/util/TableUtils$LastReceived;->columnInfos:Ljava/util/List;

    .line 7
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/smi/OID;

    .line 8
    iget-object v1, p0, Lorg/snmp4j/util/TableUtils$LastReceived;->columnInfos:Ljava/util/List;

    new-instance v2, Lorg/snmp4j/util/TableUtils$LastReceivedColumnInfo;

    const/4 v3, 0x0

    invoke-direct {v2, p1, v0, v3}, Lorg/snmp4j/util/TableUtils$LastReceivedColumnInfo;-><init>(Lorg/snmp4j/util/TableUtils;Lorg/snmp4j/smi/OID;Lorg/snmp4j/util/TableUtils$Row;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/util/TableUtils;Lorg/snmp4j/util/TableUtils$LastReceived;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lorg/snmp4j/util/TableUtils$LastReceived;->this$0:Lorg/snmp4j/util/TableUtils;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance p1, Ljava/util/ArrayList;

    invoke-virtual {p2}, Lorg/snmp4j/util/TableUtils$LastReceived;->size()I

    move-result v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Lorg/snmp4j/util/TableUtils$LastReceived;->columnInfos:Ljava/util/List;

    .line 3
    iget-object p1, p2, Lorg/snmp4j/util/TableUtils$LastReceived;->columnInfos:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lorg/snmp4j/util/TableUtils$LastReceivedColumnInfo;

    .line 4
    iget-object v0, p0, Lorg/snmp4j/util/TableUtils$LastReceived;->columnInfos:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public get(I)Lorg/snmp4j/smi/OID;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/util/TableUtils$LastReceived;->columnInfos:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/snmp4j/util/TableUtils$LastReceivedColumnInfo;

    invoke-virtual {p1}, Lorg/snmp4j/util/TableUtils$LastReceivedColumnInfo;->getOid()Lorg/snmp4j/smi/OID;

    move-result-object p1

    return-object p1
.end method

.method public getColumnInfos()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/snmp4j/util/TableUtils$LastReceivedColumnInfo;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/util/TableUtils$LastReceived;->columnInfos:Ljava/util/List;

    return-object v0
.end method

.method public set(ILorg/snmp4j/smi/OID;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/snmp4j/util/TableUtils$LastReceived;->columnInfos:Ljava/util/List;

    new-instance v1, Lorg/snmp4j/util/TableUtils$LastReceivedColumnInfo;

    iget-object v2, p0, Lorg/snmp4j/util/TableUtils$LastReceived;->this$0:Lorg/snmp4j/util/TableUtils;

    const/4 v3, 0x0

    invoke-direct {v1, v2, p2, v3}, Lorg/snmp4j/util/TableUtils$LastReceivedColumnInfo;-><init>(Lorg/snmp4j/util/TableUtils;Lorg/snmp4j/smi/OID;Lorg/snmp4j/util/TableUtils$Row;)V

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public set(ILorg/snmp4j/smi/OID;Lorg/snmp4j/util/TableUtils$Row;)V
    .locals 3

    .line 2
    iget-object v0, p0, Lorg/snmp4j/util/TableUtils$LastReceived;->columnInfos:Ljava/util/List;

    new-instance v1, Lorg/snmp4j/util/TableUtils$LastReceivedColumnInfo;

    iget-object v2, p0, Lorg/snmp4j/util/TableUtils$LastReceived;->this$0:Lorg/snmp4j/util/TableUtils;

    invoke-direct {v1, v2, p2, p3}, Lorg/snmp4j/util/TableUtils$LastReceivedColumnInfo;-><init>(Lorg/snmp4j/util/TableUtils;Lorg/snmp4j/smi/OID;Lorg/snmp4j/util/TableUtils$Row;)V

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setColumnInfos(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lorg/snmp4j/util/TableUtils$LastReceivedColumnInfo;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lorg/snmp4j/util/TableUtils$LastReceived;->columnInfos:Ljava/util/List;

    return-void
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/util/TableUtils$LastReceived;->columnInfos:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
