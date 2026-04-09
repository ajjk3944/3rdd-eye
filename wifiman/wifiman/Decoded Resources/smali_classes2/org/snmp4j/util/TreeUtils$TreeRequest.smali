.class Lorg/snmp4j/util/TreeUtils$TreeRequest;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/event/ResponseListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/util/TreeUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "TreeRequest"
.end annotation


# instance fields
.field private listener:Lorg/snmp4j/util/TreeListener;

.field private request:Lorg/snmp4j/PDU;

.field private rootOIDs:[Lorg/snmp4j/smi/OID;

.field private target:Lorg/snmp4j/Target;

.field final synthetic this$0:Lorg/snmp4j/util/TreeUtils;

.field private userObject:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lorg/snmp4j/util/TreeUtils;Lorg/snmp4j/util/TreeListener;[Lorg/snmp4j/smi/OID;Lorg/snmp4j/Target;Ljava/lang/Object;Lorg/snmp4j/PDU;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->this$0:Lorg/snmp4j/util/TreeUtils;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->listener:Lorg/snmp4j/util/TreeListener;

    iput-object p5, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->userObject:Ljava/lang/Object;

    iput-object p6, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->request:Lorg/snmp4j/PDU;

    iput-object p3, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->rootOIDs:[Lorg/snmp4j/smi/OID;

    iput-object p4, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->target:Lorg/snmp4j/Target;

    return-void
.end method


# virtual methods
.method public onResponse(Lorg/snmp4j/event/ResponseEvent;)V
    .locals 10

    iget-object v0, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->this$0:Lorg/snmp4j/util/TreeUtils;

    iget-object v0, v0, Lorg/snmp4j/util/AbstractSnmpUtility;->session:Lorg/snmp4j/Session;

    invoke-virtual {p1}, Lorg/snmp4j/event/ResponseEvent;->getRequest()Lorg/snmp4j/PDU;

    move-result-object v1

    invoke-interface {v0, v1, p0}, Lorg/snmp4j/Session;->cancel(Lorg/snmp4j/PDU;Lorg/snmp4j/event/ResponseListener;)V

    invoke-virtual {p1}, Lorg/snmp4j/event/ResponseEvent;->getResponse()Lorg/snmp4j/PDU;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->listener:Lorg/snmp4j/util/TreeListener;

    new-instance v0, Lorg/snmp4j/util/TreeEvent;

    iget-object v1, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->userObject:Ljava/lang/Object;

    const/4 v2, -0x1

    invoke-direct {v0, p0, v1, v2}, Lorg/snmp4j/util/TreeEvent;-><init>(Lorg/snmp4j/util/TreeUtils$TreeRequest;Ljava/lang/Object;I)V

    invoke-interface {p1, v0}, Lorg/snmp4j/util/TreeListener;->finished(Lorg/snmp4j/util/TreeEvent;)V

    goto/16 :goto_6

    :cond_0
    invoke-virtual {p1}, Lorg/snmp4j/PDU;->getErrorStatus()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->target:Lorg/snmp4j/Target;

    invoke-interface {v0}, Lorg/snmp4j/Target;->getVersion()I

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lorg/snmp4j/PDU;->getErrorStatus()I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->listener:Lorg/snmp4j/util/TreeListener;

    new-instance v2, Lorg/snmp4j/util/TreeEvent;

    iget-object v3, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->userObject:Ljava/lang/Object;

    new-array v1, v1, [Lorg/snmp4j/smi/VariableBinding;

    invoke-direct {v2, p0, v3, v1}, Lorg/snmp4j/util/TreeEvent;-><init>(Lorg/snmp4j/util/TreeUtils$TreeRequest;Ljava/lang/Object;[Lorg/snmp4j/smi/VariableBinding;)V

    invoke-interface {v0, v2}, Lorg/snmp4j/util/TreeListener;->finished(Lorg/snmp4j/util/TreeEvent;)V

    :cond_1
    iget-object v0, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->listener:Lorg/snmp4j/util/TreeListener;

    new-instance v1, Lorg/snmp4j/util/TreeEvent;

    iget-object v2, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->userObject:Ljava/lang/Object;

    invoke-virtual {p1}, Lorg/snmp4j/PDU;->getErrorStatus()I

    move-result p1

    invoke-direct {v1, p0, v2, p1}, Lorg/snmp4j/util/TreeEvent;-><init>(Lorg/snmp4j/util/TreeUtils$TreeRequest;Ljava/lang/Object;I)V

    invoke-interface {v0, v1}, Lorg/snmp4j/util/TreeListener;->finished(Lorg/snmp4j/util/TreeEvent;)V

    goto/16 :goto_6

    :cond_2
    invoke-virtual {p1}, Lorg/snmp4j/PDU;->getType()I

    move-result v0

    const/16 v2, -0x58

    if-ne v0, v2, :cond_3

    iget-object v0, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->listener:Lorg/snmp4j/util/TreeListener;

    new-instance v1, Lorg/snmp4j/util/TreeEvent;

    iget-object v2, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->userObject:Ljava/lang/Object;

    invoke-direct {v1, p0, v2, p1}, Lorg/snmp4j/util/TreeEvent;-><init>(Lorg/snmp4j/util/TreeUtils$TreeRequest;Ljava/lang/Object;Lorg/snmp4j/PDU;)V

    invoke-interface {v0, v1}, Lorg/snmp4j/util/TreeListener;->finished(Lorg/snmp4j/util/TreeEvent;)V

    goto/16 :goto_6

    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Lorg/snmp4j/PDU;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v2, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->this$0:Lorg/snmp4j/util/TreeUtils;

    invoke-static {v2}, Lorg/snmp4j/util/TreeUtils;->access$000(Lorg/snmp4j/util/TreeUtils;)Z

    move-result v2

    if-nez v2, :cond_4

    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->request:Lorg/snmp4j/PDU;

    invoke-virtual {v3}, Lorg/snmp4j/PDU;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    move v3, v1

    :goto_0
    iget-object v4, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->request:Lorg/snmp4j/PDU;

    invoke-virtual {v4}, Lorg/snmp4j/PDU;->size()I

    move-result v4

    if-ge v3, v4, :cond_5

    iget-object v4, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->request:Lorg/snmp4j/PDU;

    invoke-virtual {v4, v3}, Lorg/snmp4j/PDU;->get(I)Lorg/snmp4j/smi/VariableBinding;

    move-result-object v4

    invoke-virtual {v4}, Lorg/snmp4j/smi/VariableBinding;->getOid()Lorg/snmp4j/smi/OID;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    const/4 v2, 0x0

    :cond_5
    move v3, v1

    move v4, v3

    :goto_1
    const/4 v5, 0x1

    if-eqz v3, :cond_6

    iget-object v6, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->rootOIDs:[Lorg/snmp4j/smi/OID;

    array-length v6, v6

    rem-int v6, v4, v6

    if-lez v6, :cond_d

    :cond_6
    invoke-virtual {p1}, Lorg/snmp4j/PDU;->size()I

    move-result v6

    if-ge v4, v6, :cond_d

    iget-object v3, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->rootOIDs:[Lorg/snmp4j/smi/OID;

    array-length v3, v3

    rem-int v3, v4, v3

    invoke-virtual {p1, v4}, Lorg/snmp4j/PDU;->get(I)Lorg/snmp4j/smi/VariableBinding;

    move-result-object v6

    invoke-virtual {v6}, Lorg/snmp4j/smi/VariableBinding;->getOid()Lorg/snmp4j/smi/OID;

    move-result-object v7

    if-eqz v7, :cond_8

    invoke-virtual {v6}, Lorg/snmp4j/smi/VariableBinding;->getOid()Lorg/snmp4j/smi/OID;

    move-result-object v7

    invoke-virtual {v7}, Lorg/snmp4j/smi/OID;->size()I

    move-result v7

    iget-object v8, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->rootOIDs:[Lorg/snmp4j/smi/OID;

    aget-object v8, v8, v3

    invoke-virtual {v8}, Lorg/snmp4j/smi/OID;->size()I

    move-result v8

    if-lt v7, v8, :cond_8

    iget-object v7, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->rootOIDs:[Lorg/snmp4j/smi/OID;

    aget-object v7, v7, v3

    invoke-virtual {v7}, Lorg/snmp4j/smi/OID;->size()I

    move-result v8

    invoke-virtual {v6}, Lorg/snmp4j/smi/VariableBinding;->getOid()Lorg/snmp4j/smi/OID;

    move-result-object v9

    invoke-virtual {v7, v8, v9}, Lorg/snmp4j/smi/OID;->leftMostCompare(ILorg/snmp4j/smi/OID;)I

    move-result v7

    if-eqz v7, :cond_7

    goto :goto_2

    :cond_7
    invoke-virtual {v6}, Lorg/snmp4j/smi/VariableBinding;->getVariable()Lorg/snmp4j/smi/Variable;

    move-result-object v7

    invoke-interface {v7}, Lorg/snmp4j/smi/Variable;->getSyntax()I

    move-result v7

    invoke-static {v7}, Lorg/snmp4j/smi/Null;->isExceptionSyntax(I)Z

    move-result v7

    if-eqz v7, :cond_9

    :cond_8
    :goto_2
    move v3, v5

    goto :goto_3

    :cond_9
    iget-object v7, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->this$0:Lorg/snmp4j/util/TreeUtils;

    invoke-static {v7}, Lorg/snmp4j/util/TreeUtils;->access$000(Lorg/snmp4j/util/TreeUtils;)Z

    move-result v7

    if-nez v7, :cond_a

    if-eqz v2, :cond_a

    invoke-virtual {v6}, Lorg/snmp4j/smi/VariableBinding;->getOid()Lorg/snmp4j/smi/OID;

    move-result-object v7

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lorg/snmp4j/smi/Variable;

    invoke-virtual {v7, v8}, Lorg/snmp4j/smi/OID;->compareTo(Lorg/snmp4j/smi/Variable;)I

    move-result v7

    if-gtz v7, :cond_a

    iget-object v2, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->listener:Lorg/snmp4j/util/TreeListener;

    new-instance v3, Lorg/snmp4j/util/TreeEvent;

    iget-object v4, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->userObject:Ljava/lang/Object;

    const/4 v6, -0x2

    invoke-direct {v3, p0, v4, v6}, Lorg/snmp4j/util/TreeEvent;-><init>(Lorg/snmp4j/util/TreeUtils$TreeRequest;Ljava/lang/Object;I)V

    invoke-interface {v2, v3}, Lorg/snmp4j/util/TreeListener;->finished(Lorg/snmp4j/util/TreeEvent;)V

    move v3, v5

    goto :goto_4

    :cond_a
    if-eqz v2, :cond_b

    invoke-virtual {v6}, Lorg/snmp4j/smi/VariableBinding;->getOid()Lorg/snmp4j/smi/OID;

    move-result-object v7

    invoke-interface {v2, v3, v7}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_b
    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v3, v1

    :goto_3
    iget-object v6, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->rootOIDs:[Lorg/snmp4j/smi/OID;

    array-length v7, v6

    if-le v7, v5, :cond_c

    add-int/lit8 v5, v4, 0x1

    array-length v6, v6

    rem-int/2addr v5, v6

    if-nez v5, :cond_c

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    new-array v5, v5, [Lorg/snmp4j/smi/VariableBinding;

    invoke-interface {v0, v5}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [Lorg/snmp4j/smi/VariableBinding;

    iget-object v6, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->listener:Lorg/snmp4j/util/TreeListener;

    new-instance v7, Lorg/snmp4j/util/TreeEvent;

    iget-object v8, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->userObject:Ljava/lang/Object;

    invoke-direct {v7, p0, v8, v5}, Lorg/snmp4j/util/TreeEvent;-><init>(Lorg/snmp4j/util/TreeUtils$TreeRequest;Ljava/lang/Object;[Lorg/snmp4j/smi/VariableBinding;)V

    invoke-interface {v6, v7}, Lorg/snmp4j/util/TreeListener;->next(Lorg/snmp4j/util/TreeEvent;)Z

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_c
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_1

    :cond_d
    :goto_4
    invoke-virtual {p1}, Lorg/snmp4j/PDU;->size()I

    move-result v2

    if-nez v2, :cond_e

    move v3, v5

    :cond_e
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    new-array v2, v2, [Lorg/snmp4j/smi/VariableBinding;

    invoke-interface {v0, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/snmp4j/smi/VariableBinding;

    if-eqz v3, :cond_f

    iget-object p1, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->listener:Lorg/snmp4j/util/TreeListener;

    new-instance v1, Lorg/snmp4j/util/TreeEvent;

    iget-object v2, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->userObject:Ljava/lang/Object;

    invoke-direct {v1, p0, v2, v0}, Lorg/snmp4j/util/TreeEvent;-><init>(Lorg/snmp4j/util/TreeUtils$TreeRequest;Ljava/lang/Object;[Lorg/snmp4j/smi/VariableBinding;)V

    invoke-interface {p1, v1}, Lorg/snmp4j/util/TreeListener;->finished(Lorg/snmp4j/util/TreeEvent;)V

    goto :goto_6

    :cond_f
    iget-object v2, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->listener:Lorg/snmp4j/util/TreeListener;

    new-instance v3, Lorg/snmp4j/util/TreeEvent;

    iget-object v4, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->userObject:Ljava/lang/Object;

    invoke-direct {v3, p0, v4, v0}, Lorg/snmp4j/util/TreeEvent;-><init>(Lorg/snmp4j/util/TreeUtils$TreeRequest;Ljava/lang/Object;[Lorg/snmp4j/smi/VariableBinding;)V

    invoke-interface {v2, v3}, Lorg/snmp4j/util/TreeListener;->next(Lorg/snmp4j/util/TreeEvent;)Z

    move-result v2

    if-eqz v2, :cond_12

    invoke-virtual {p1}, Lorg/snmp4j/PDU;->size()I

    move-result v0

    iget-object v2, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->rootOIDs:[Lorg/snmp4j/smi/OID;

    array-length v3, v2

    div-int/2addr v0, v3

    sub-int/2addr v0, v5

    array-length v2, v2

    mul-int/2addr v0, v2

    iget-object v2, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->request:Lorg/snmp4j/PDU;

    invoke-virtual {v2}, Lorg/snmp4j/PDU;->clear()V

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v2

    :goto_5
    iget-object v3, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->rootOIDs:[Lorg/snmp4j/smi/OID;

    array-length v3, v3

    add-int/2addr v3, v0

    if-ge v2, v3, :cond_10

    invoke-virtual {p1, v2}, Lorg/snmp4j/PDU;->get(I)Lorg/snmp4j/smi/VariableBinding;

    move-result-object v3

    invoke-virtual {v3}, Lorg/snmp4j/smi/VariableBinding;->clone()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/snmp4j/smi/VariableBinding;

    new-instance v4, Lorg/snmp4j/smi/Null;

    invoke-direct {v4}, Lorg/snmp4j/smi/Null;-><init>()V

    invoke-virtual {v3, v4}, Lorg/snmp4j/smi/VariableBinding;->setVariable(Lorg/snmp4j/smi/Variable;)V

    iget-object v4, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->request:Lorg/snmp4j/PDU;

    invoke-virtual {v4, v3}, Lorg/snmp4j/PDU;->add(Lorg/snmp4j/smi/VariableBinding;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_10
    iget-object p1, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->request:Lorg/snmp4j/PDU;

    invoke-virtual {p1}, Lorg/snmp4j/PDU;->size()I

    move-result p1

    if-lez p1, :cond_11

    invoke-virtual {p0}, Lorg/snmp4j/util/TreeUtils$TreeRequest;->send()V

    goto :goto_6

    :cond_11
    iget-object p1, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->listener:Lorg/snmp4j/util/TreeListener;

    new-instance v0, Lorg/snmp4j/util/TreeEvent;

    iget-object v2, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->userObject:Ljava/lang/Object;

    new-array v1, v1, [Lorg/snmp4j/smi/VariableBinding;

    invoke-direct {v0, p0, v2, v1}, Lorg/snmp4j/util/TreeEvent;-><init>(Lorg/snmp4j/util/TreeUtils$TreeRequest;Ljava/lang/Object;[Lorg/snmp4j/smi/VariableBinding;)V

    invoke-interface {p1, v0}, Lorg/snmp4j/util/TreeListener;->finished(Lorg/snmp4j/util/TreeEvent;)V

    goto :goto_6

    :cond_12
    iget-object p1, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->listener:Lorg/snmp4j/util/TreeListener;

    new-instance v1, Lorg/snmp4j/util/TreeEvent;

    iget-object v2, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->userObject:Ljava/lang/Object;

    invoke-direct {v1, p0, v2, v0}, Lorg/snmp4j/util/TreeEvent;-><init>(Lorg/snmp4j/util/TreeUtils$TreeRequest;Ljava/lang/Object;[Lorg/snmp4j/smi/VariableBinding;)V

    invoke-interface {p1, v1}, Lorg/snmp4j/util/TreeListener;->finished(Lorg/snmp4j/util/TreeEvent;)V

    :goto_6
    return-void
.end method

.method public send()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->this$0:Lorg/snmp4j/util/TreeUtils;

    iget-object v0, v0, Lorg/snmp4j/util/AbstractSnmpUtility;->session:Lorg/snmp4j/Session;

    iget-object v1, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->request:Lorg/snmp4j/PDU;

    iget-object v2, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->target:Lorg/snmp4j/Target;

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3, p0}, Lorg/snmp4j/Session;->send(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;Ljava/lang/Object;Lorg/snmp4j/event/ResponseListener;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->listener:Lorg/snmp4j/util/TreeListener;

    new-instance v2, Lorg/snmp4j/util/TreeEvent;

    iget-object v3, p0, Lorg/snmp4j/util/TreeUtils$TreeRequest;->userObject:Ljava/lang/Object;

    invoke-direct {v2, p0, v3, v0}, Lorg/snmp4j/util/TreeEvent;-><init>(Lorg/snmp4j/util/TreeUtils$TreeRequest;Ljava/lang/Object;Ljava/lang/Exception;)V

    invoke-interface {v1, v2}, Lorg/snmp4j/util/TreeListener;->finished(Lorg/snmp4j/util/TreeEvent;)V

    :goto_0
    return-void
.end method
