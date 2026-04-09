.class public Lkj/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/eclipse/paho/client/mqttv3/MqttPersistable;


# instance fields
.field private a:Ljava/lang/String;

.field private b:[B

.field private c:I

.field private d:I

.field private e:[B

.field private f:I

.field private g:I


# direct methods
.method public constructor <init>(Ljava/lang/String;[BII[BII)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lkj/o;->b:[B

    const/4 v1, 0x0

    iput v1, p0, Lkj/o;->c:I

    iput v1, p0, Lkj/o;->d:I

    iput-object v0, p0, Lkj/o;->e:[B

    iput v1, p0, Lkj/o;->f:I

    iput v1, p0, Lkj/o;->g:I

    iput-object p1, p0, Lkj/o;->a:Ljava/lang/String;

    invoke-virtual {p2}, [B->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    iput-object p1, p0, Lkj/o;->b:[B

    iput p3, p0, Lkj/o;->c:I

    iput p4, p0, Lkj/o;->d:I

    if-eqz p5, :cond_0

    invoke-virtual {p5}, [B->clone()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, [B

    :cond_0
    iput-object v0, p0, Lkj/o;->e:[B

    iput p6, p0, Lkj/o;->f:I

    iput p7, p0, Lkj/o;->g:I

    return-void
.end method


# virtual methods
.method public getHeaderBytes()[B
    .locals 1

    iget-object v0, p0, Lkj/o;->b:[B

    return-object v0
.end method

.method public getHeaderLength()I
    .locals 1

    iget v0, p0, Lkj/o;->d:I

    return v0
.end method

.method public getHeaderOffset()I
    .locals 1

    iget v0, p0, Lkj/o;->c:I

    return v0
.end method

.method public getPayloadBytes()[B
    .locals 1

    iget-object v0, p0, Lkj/o;->e:[B

    return-object v0
.end method

.method public getPayloadLength()I
    .locals 1

    iget-object v0, p0, Lkj/o;->e:[B

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, p0, Lkj/o;->g:I

    return v0
.end method

.method public getPayloadOffset()I
    .locals 1

    iget v0, p0, Lkj/o;->f:I

    return v0
.end method
