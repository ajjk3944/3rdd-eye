.class public Lorg/snmp4j/uri/SnmpUriResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/snmp4j/uri/SnmpUriResponse$Type;
    }
.end annotation


# instance fields
.field private data:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "[",
            "Lorg/snmp4j/smi/VariableBinding;",
            ">;"
        }
    .end annotation
.end field

.field private errorMessage:Ljava/lang/String;

.field private errorStatus:I

.field private responseType:Lorg/snmp4j/uri/SnmpUriResponse$Type;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 15
    iput v0, p0, Lorg/snmp4j/uri/SnmpUriResponse;->errorStatus:I

    .line 16
    sget-object v0, Lorg/snmp4j/uri/SnmpUriResponse$Type;->FINAL:Lorg/snmp4j/uri/SnmpUriResponse$Type;

    iput-object v0, p0, Lorg/snmp4j/uri/SnmpUriResponse;->responseType:Lorg/snmp4j/uri/SnmpUriResponse$Type;

    .line 17
    iput p1, p0, Lorg/snmp4j/uri/SnmpUriResponse;->errorStatus:I

    .line 18
    sget-object p1, Lorg/snmp4j/uri/SnmpUriResponse$Type;->SNMP_ERROR:Lorg/snmp4j/uri/SnmpUriResponse$Type;

    iput-object p1, p0, Lorg/snmp4j/uri/SnmpUriResponse;->responseType:Lorg/snmp4j/uri/SnmpUriResponse$Type;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "[",
            "Lorg/snmp4j/smi/VariableBinding;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lorg/snmp4j/uri/SnmpUriResponse;->errorStatus:I

    .line 3
    sget-object v0, Lorg/snmp4j/uri/SnmpUriResponse$Type;->FINAL:Lorg/snmp4j/uri/SnmpUriResponse$Type;

    iput-object v0, p0, Lorg/snmp4j/uri/SnmpUriResponse;->responseType:Lorg/snmp4j/uri/SnmpUriResponse$Type;

    .line 4
    iput-object p1, p0, Lorg/snmp4j/uri/SnmpUriResponse;->data:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "[",
            "Lorg/snmp4j/smi/VariableBinding;",
            ">;I)V"
        }
    .end annotation

    .line 19
    invoke-direct {p0, p1}, Lorg/snmp4j/uri/SnmpUriResponse;-><init>(Ljava/util/List;)V

    .line 20
    iput p2, p0, Lorg/snmp4j/uri/SnmpUriResponse;->errorStatus:I

    .line 21
    sget-object p1, Lorg/snmp4j/uri/SnmpUriResponse$Type;->SNMP_ERROR:Lorg/snmp4j/uri/SnmpUriResponse$Type;

    iput-object p1, p0, Lorg/snmp4j/uri/SnmpUriResponse;->responseType:Lorg/snmp4j/uri/SnmpUriResponse$Type;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lorg/snmp4j/uri/SnmpUriResponse$Type;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "[",
            "Lorg/snmp4j/smi/VariableBinding;",
            ">;",
            "Lorg/snmp4j/uri/SnmpUriResponse$Type;",
            ")V"
        }
    .end annotation

    .line 22
    invoke-direct {p0, p1}, Lorg/snmp4j/uri/SnmpUriResponse;-><init>(Ljava/util/List;)V

    .line 23
    iput-object p2, p0, Lorg/snmp4j/uri/SnmpUriResponse;->responseType:Lorg/snmp4j/uri/SnmpUriResponse$Type;

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/uri/SnmpUriResponse$Type;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 6
    iput v0, p0, Lorg/snmp4j/uri/SnmpUriResponse;->errorStatus:I

    .line 7
    sget-object v0, Lorg/snmp4j/uri/SnmpUriResponse$Type;->FINAL:Lorg/snmp4j/uri/SnmpUriResponse$Type;

    .line 8
    iput-object p1, p0, Lorg/snmp4j/uri/SnmpUriResponse;->responseType:Lorg/snmp4j/uri/SnmpUriResponse$Type;

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/uri/SnmpUriResponse$Type;Ljava/lang/String;)V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 10
    iput v0, p0, Lorg/snmp4j/uri/SnmpUriResponse;->errorStatus:I

    .line 11
    sget-object v0, Lorg/snmp4j/uri/SnmpUriResponse$Type;->FINAL:Lorg/snmp4j/uri/SnmpUriResponse$Type;

    .line 12
    iput-object p1, p0, Lorg/snmp4j/uri/SnmpUriResponse;->responseType:Lorg/snmp4j/uri/SnmpUriResponse$Type;

    .line 13
    iput-object p2, p0, Lorg/snmp4j/uri/SnmpUriResponse;->errorMessage:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getData()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "[",
            "Lorg/snmp4j/smi/VariableBinding;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/uri/SnmpUriResponse;->data:Ljava/util/List;

    return-object v0
.end method

.method public getErrorMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/uri/SnmpUriResponse;->errorMessage:Ljava/lang/String;

    return-object v0
.end method

.method public getErrorStatus()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/uri/SnmpUriResponse;->errorStatus:I

    return v0
.end method

.method public getResponseType()Lorg/snmp4j/uri/SnmpUriResponse$Type;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/uri/SnmpUriResponse;->responseType:Lorg/snmp4j/uri/SnmpUriResponse$Type;

    return-object v0
.end method

.method public setResponseType(Lorg/snmp4j/uri/SnmpUriResponse$Type;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/uri/SnmpUriResponse;->responseType:Lorg/snmp4j/uri/SnmpUriResponse$Type;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SnmpUriResponse{data="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/uri/SnmpUriResponse;->data:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", errorStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/snmp4j/uri/SnmpUriResponse;->errorStatus:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", responseType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/uri/SnmpUriResponse;->responseType:Lorg/snmp4j/uri/SnmpUriResponse$Type;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", errorMessage=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/uri/SnmpUriResponse;->errorMessage:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
