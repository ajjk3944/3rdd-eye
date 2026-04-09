.class Ljcifs/smb1/smb1/I;
.super Ljcifs/smb1/smb1/b;
.source "SourceFile"


# static fields
.field private static final Z:I

.field private static final f1:I


# instance fields
.field private E:I

.field private F:I

.field private G:I

.field private H:I

.field private I:I

.field private J:[B

.field private N:J

.field private X:I

.field Y:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "jcifs.smb1.smb.client.WriteAndX.ReadAndX"

    const/4 v1, 0x1

    invoke-static {v0, v1}, LRg/a;->d(Ljava/lang/String;I)I

    move-result v0

    sput v0, Ljcifs/smb1/smb1/I;->Z:I

    const-string v0, "jcifs.smb1.smb.client.WriteAndX.Close"

    invoke-static {v0, v1}, LRg/a;->d(Ljava/lang/String;I)I

    move-result v0

    sput v0, Ljcifs/smb1/smb1/I;->f1:I

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ljcifs/smb1/smb1/b;-><init>(Ljcifs/smb1/smb1/l;)V

    const/16 v0, 0x2f

    iput-byte v0, p0, Ljcifs/smb1/smb1/l;->c:B

    return-void
.end method


# virtual methods
.method A([BI)I
    .locals 6

    iget v0, p0, Ljcifs/smb1/smb1/l;->e:I

    sub-int v1, p2, v0

    add-int/lit8 v1, v1, 0x1a

    iput v1, p0, Ljcifs/smb1/smb1/I;->H:I

    sub-int v0, v1, v0

    const/4 v2, 0x4

    rem-int/2addr v0, v2

    iput v0, p0, Ljcifs/smb1/smb1/I;->X:I

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    rsub-int/lit8 v0, v0, 0x4

    :goto_0
    iput v0, p0, Ljcifs/smb1/smb1/I;->X:I

    add-int/2addr v1, v0

    iput v1, p0, Ljcifs/smb1/smb1/I;->H:I

    iget v0, p0, Ljcifs/smb1/smb1/I;->E:I

    int-to-long v0, v0

    invoke-static {v0, v1, p1, p2}, Ljcifs/smb1/smb1/l;->x(J[BI)V

    add-int/lit8 v0, p2, 0x2

    iget-wide v4, p0, Ljcifs/smb1/smb1/I;->N:J

    invoke-static {v4, v5, p1, v0}, Ljcifs/smb1/smb1/l;->y(J[BI)V

    add-int/lit8 v0, p2, 0x6

    move v1, v3

    :goto_1
    if-ge v1, v2, :cond_1

    add-int/lit8 v4, v0, 0x1

    const/4 v5, -0x1

    aput-byte v5, p1, v0

    add-int/lit8 v1, v1, 0x1

    move v0, v4

    goto :goto_1

    :cond_1
    iget v1, p0, Ljcifs/smb1/smb1/I;->Y:I

    int-to-long v1, v1

    invoke-static {v1, v2, p1, v0}, Ljcifs/smb1/smb1/l;->x(J[BI)V

    add-int/lit8 v1, v0, 0x2

    iget v2, p0, Ljcifs/smb1/smb1/I;->F:I

    int-to-long v4, v2

    invoke-static {v4, v5, p1, v1}, Ljcifs/smb1/smb1/l;->x(J[BI)V

    add-int/lit8 v1, v0, 0x4

    add-int/lit8 v2, v0, 0x5

    aput-byte v3, p1, v1

    add-int/lit8 v1, v0, 0x6

    aput-byte v3, p1, v2

    iget v2, p0, Ljcifs/smb1/smb1/I;->G:I

    int-to-long v2, v2

    invoke-static {v2, v3, p1, v1}, Ljcifs/smb1/smb1/l;->x(J[BI)V

    add-int/lit8 v1, v0, 0x8

    iget v2, p0, Ljcifs/smb1/smb1/I;->H:I

    int-to-long v2, v2

    invoke-static {v2, v3, p1, v1}, Ljcifs/smb1/smb1/l;->x(J[BI)V

    add-int/lit8 v1, v0, 0xa

    iget-wide v2, p0, Ljcifs/smb1/smb1/I;->N:J

    const/16 v4, 0x20

    shr-long/2addr v2, v4

    invoke-static {v2, v3, p1, v1}, Ljcifs/smb1/smb1/l;->y(J[BI)V

    add-int/lit8 v0, v0, 0xe

    sub-int/2addr v0, p2

    return v0
.end method

.method E(B)I
    .locals 1

    const/16 v0, 0x2e

    if-ne p1, v0, :cond_0

    sget p1, Ljcifs/smb1/smb1/I;->Z:I

    return p1

    :cond_0
    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    sget p1, Ljcifs/smb1/smb1/I;->f1:I

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method H(IJI[BII)V
    .locals 0

    iput p1, p0, Ljcifs/smb1/smb1/I;->E:I

    iput-wide p2, p0, Ljcifs/smb1/smb1/I;->N:J

    iput p4, p0, Ljcifs/smb1/smb1/I;->F:I

    iput-object p5, p0, Ljcifs/smb1/smb1/I;->J:[B

    iput p6, p0, Ljcifs/smb1/smb1/I;->I:I

    iput p7, p0, Ljcifs/smb1/smb1/I;->G:I

    const/4 p1, 0x0

    iput-object p1, p0, Ljcifs/smb1/smb1/l;->x:Ljcifs/smb1/smb1/m;

    return-void
.end method

.method h([BI)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method m([BI)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SmbComWriteAndX["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Ljcifs/smb1/smb1/b;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",fid="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/I;->E:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",offset="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Ljcifs/smb1/smb1/I;->N:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ",writeMode="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/I;->Y:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",remaining="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/I;->F:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",dataLength="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/I;->G:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",dataOffset="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/I;->H:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method v([BI)I
    .locals 4

    move v0, p2

    :goto_0
    iget v1, p0, Ljcifs/smb1/smb1/I;->X:I

    add-int/lit8 v2, v1, -0x1

    iput v2, p0, Ljcifs/smb1/smb1/I;->X:I

    if-lez v1, :cond_0

    add-int/lit8 v1, v0, 0x1

    const/16 v2, -0x12

    aput-byte v2, p1, v0

    move v0, v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Ljcifs/smb1/smb1/I;->J:[B

    iget v2, p0, Ljcifs/smb1/smb1/I;->I:I

    iget v3, p0, Ljcifs/smb1/smb1/I;->G:I

    invoke-static {v1, v2, p1, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Ljcifs/smb1/smb1/I;->G:I

    add-int/2addr v0, p1

    sub-int/2addr v0, p2

    return v0
.end method
