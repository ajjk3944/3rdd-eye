.class Ljcifs/smb1/smb1/H;
.super Ljcifs/smb1/smb1/l;
.source "SourceFile"


# instance fields
.field private B:I

.field private C:I

.field private D:I

.field private E:I

.field private F:I

.field private G:[B


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljcifs/smb1/smb1/l;-><init>()V

    const/16 v0, 0xb

    iput-byte v0, p0, Ljcifs/smb1/smb1/l;->c:B

    return-void
.end method


# virtual methods
.method A([BI)I
    .locals 3

    iget v0, p0, Ljcifs/smb1/smb1/H;->B:I

    int-to-long v0, v0

    invoke-static {v0, v1, p1, p2}, Ljcifs/smb1/smb1/l;->x(J[BI)V

    add-int/lit8 v0, p2, 0x2

    iget v1, p0, Ljcifs/smb1/smb1/H;->C:I

    int-to-long v1, v1

    invoke-static {v1, v2, p1, v0}, Ljcifs/smb1/smb1/l;->x(J[BI)V

    add-int/lit8 v0, p2, 0x4

    iget v1, p0, Ljcifs/smb1/smb1/H;->D:I

    int-to-long v1, v1

    invoke-static {v1, v2, p1, v0}, Ljcifs/smb1/smb1/l;->y(J[BI)V

    add-int/lit8 v0, p2, 0x8

    iget v1, p0, Ljcifs/smb1/smb1/H;->E:I

    int-to-long v1, v1

    invoke-static {v1, v2, p1, v0}, Ljcifs/smb1/smb1/l;->x(J[BI)V

    add-int/lit8 p1, p2, 0xa

    sub-int/2addr p1, p2

    return p1
.end method

.method E(IJI[BII)V
    .locals 2

    iput p1, p0, Ljcifs/smb1/smb1/H;->B:I

    const-wide v0, 0xffffffffL

    and-long p1, p2, v0

    long-to-int p1, p1

    iput p1, p0, Ljcifs/smb1/smb1/H;->D:I

    iput p4, p0, Ljcifs/smb1/smb1/H;->E:I

    iput-object p5, p0, Ljcifs/smb1/smb1/H;->G:[B

    iput p6, p0, Ljcifs/smb1/smb1/H;->F:I

    iput p7, p0, Ljcifs/smb1/smb1/H;->C:I

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
    .locals 3

    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SmbComWrite["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Ljcifs/smb1/smb1/l;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",fid="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/H;->B:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",count="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/H;->C:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",offset="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/H;->D:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",remaining="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/H;->E:I

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

    add-int/lit8 v0, p2, 0x1

    const/4 v1, 0x1

    aput-byte v1, p1, p2

    iget v1, p0, Ljcifs/smb1/smb1/H;->C:I

    int-to-long v1, v1

    invoke-static {v1, v2, p1, v0}, Ljcifs/smb1/smb1/l;->x(J[BI)V

    add-int/lit8 v0, p2, 0x3

    iget-object v1, p0, Ljcifs/smb1/smb1/H;->G:[B

    iget v2, p0, Ljcifs/smb1/smb1/H;->F:I

    iget v3, p0, Ljcifs/smb1/smb1/H;->C:I

    invoke-static {v1, v2, p1, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Ljcifs/smb1/smb1/H;->C:I

    add-int/2addr v0, p1

    sub-int/2addr v0, p2

    return v0
.end method
