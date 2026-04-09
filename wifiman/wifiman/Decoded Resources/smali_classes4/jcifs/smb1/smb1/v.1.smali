.class Ljcifs/smb1/smb1/v;
.super Ljcifs/smb1/smb1/b;
.source "SourceFile"


# instance fields
.field E:I

.field F:I

.field G:I

.field H:I

.field I:I

.field J:I

.field N:I

.field X:I

.field Y:J


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljcifs/smb1/smb1/b;-><init>()V

    return-void
.end method


# virtual methods
.method A([BI)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method h([BI)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method m([BI)I
    .locals 2

    invoke-static {p1, p2}, Ljcifs/smb1/smb1/l;->j([BI)I

    move-result v0

    iput v0, p0, Ljcifs/smb1/smb1/v;->E:I

    add-int/lit8 v0, p2, 0x2

    invoke-static {p1, v0}, Ljcifs/smb1/smb1/l;->j([BI)I

    move-result v0

    iput v0, p0, Ljcifs/smb1/smb1/v;->F:I

    add-int/lit8 v0, p2, 0x4

    invoke-static {p1, v0}, Ljcifs/smb1/smb1/l;->s([BI)J

    move-result-wide v0

    iput-wide v0, p0, Ljcifs/smb1/smb1/v;->Y:J

    add-int/lit8 v0, p2, 0x8

    invoke-static {p1, v0}, Ljcifs/smb1/smb1/l;->k([BI)I

    move-result v0

    iput v0, p0, Ljcifs/smb1/smb1/v;->G:I

    add-int/lit8 v0, p2, 0xc

    invoke-static {p1, v0}, Ljcifs/smb1/smb1/l;->j([BI)I

    move-result v0

    iput v0, p0, Ljcifs/smb1/smb1/v;->H:I

    add-int/lit8 v0, p2, 0xe

    invoke-static {p1, v0}, Ljcifs/smb1/smb1/l;->j([BI)I

    move-result v0

    iput v0, p0, Ljcifs/smb1/smb1/v;->I:I

    add-int/lit8 v0, p2, 0x10

    invoke-static {p1, v0}, Ljcifs/smb1/smb1/l;->j([BI)I

    move-result v0

    iput v0, p0, Ljcifs/smb1/smb1/v;->J:I

    add-int/lit8 v0, p2, 0x12

    invoke-static {p1, v0}, Ljcifs/smb1/smb1/l;->j([BI)I

    move-result v0

    iput v0, p0, Ljcifs/smb1/smb1/v;->N:I

    add-int/lit8 v0, p2, 0x14

    invoke-static {p1, v0}, Ljcifs/smb1/smb1/l;->k([BI)I

    move-result p1

    iput p1, p0, Ljcifs/smb1/smb1/v;->X:I

    add-int/lit8 p1, p2, 0x1a

    sub-int/2addr p1, p2

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SmbComOpenAndXResponse["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Ljcifs/smb1/smb1/b;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",fid="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/v;->E:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",fileAttributes="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/v;->F:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",lastWriteTime="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Ljcifs/smb1/smb1/v;->Y:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ",dataSize="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/v;->G:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",grantedAccess="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/v;->H:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",fileType="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/v;->I:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",deviceState="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/v;->J:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",action="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/v;->N:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",serverFid="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/v;->X:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method v([BI)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
