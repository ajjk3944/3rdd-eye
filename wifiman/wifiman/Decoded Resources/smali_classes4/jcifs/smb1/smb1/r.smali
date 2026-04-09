.class Ljcifs/smb1/smb1/r;
.super Ljcifs/smb1/smb1/b;
.source "SourceFile"


# instance fields
.field E:B

.field F:I

.field G:I

.field H:I

.field I:I

.field J:I

.field N:J

.field X:J

.field Y:J

.field Z:J

.field f1:J

.field g1:J

.field h1:Z

.field i1:Z


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

    add-int/lit8 v0, p2, 0x1

    aget-byte v1, p1, p2

    iput-byte v1, p0, Ljcifs/smb1/smb1/r;->E:B

    invoke-static {p1, v0}, Ljcifs/smb1/smb1/l;->j([BI)I

    move-result v0

    iput v0, p0, Ljcifs/smb1/smb1/r;->F:I

    add-int/lit8 v0, p2, 0x3

    invoke-static {p1, v0}, Ljcifs/smb1/smb1/l;->k([BI)I

    move-result v0

    iput v0, p0, Ljcifs/smb1/smb1/r;->G:I

    add-int/lit8 v0, p2, 0x7

    invoke-static {p1, v0}, Ljcifs/smb1/smb1/l;->r([BI)J

    move-result-wide v0

    iput-wide v0, p0, Ljcifs/smb1/smb1/r;->N:J

    add-int/lit8 v0, p2, 0xf

    invoke-static {p1, v0}, Ljcifs/smb1/smb1/l;->r([BI)J

    move-result-wide v0

    iput-wide v0, p0, Ljcifs/smb1/smb1/r;->X:J

    add-int/lit8 v0, p2, 0x17

    invoke-static {p1, v0}, Ljcifs/smb1/smb1/l;->r([BI)J

    move-result-wide v0

    iput-wide v0, p0, Ljcifs/smb1/smb1/r;->Y:J

    add-int/lit8 v0, p2, 0x1f

    invoke-static {p1, v0}, Ljcifs/smb1/smb1/l;->r([BI)J

    move-result-wide v0

    iput-wide v0, p0, Ljcifs/smb1/smb1/r;->Z:J

    add-int/lit8 v0, p2, 0x27

    invoke-static {p1, v0}, Ljcifs/smb1/smb1/l;->k([BI)I

    move-result v0

    iput v0, p0, Ljcifs/smb1/smb1/r;->H:I

    add-int/lit8 v0, p2, 0x2b

    invoke-static {p1, v0}, Ljcifs/smb1/smb1/l;->l([BI)J

    move-result-wide v0

    iput-wide v0, p0, Ljcifs/smb1/smb1/r;->f1:J

    add-int/lit8 v0, p2, 0x33

    invoke-static {p1, v0}, Ljcifs/smb1/smb1/l;->l([BI)J

    move-result-wide v0

    iput-wide v0, p0, Ljcifs/smb1/smb1/r;->g1:J

    add-int/lit8 v0, p2, 0x3b

    invoke-static {p1, v0}, Ljcifs/smb1/smb1/l;->j([BI)I

    move-result v0

    iput v0, p0, Ljcifs/smb1/smb1/r;->I:I

    add-int/lit8 v0, p2, 0x3d

    invoke-static {p1, v0}, Ljcifs/smb1/smb1/l;->j([BI)I

    move-result v0

    iput v0, p0, Ljcifs/smb1/smb1/r;->J:I

    add-int/lit8 v0, p2, 0x3f

    add-int/lit8 v1, p2, 0x40

    aget-byte p1, p1, v0

    and-int/lit16 p1, p1, 0xff

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Ljcifs/smb1/smb1/r;->h1:Z

    sub-int/2addr v1, p2

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SmbComNTCreateAndXResponse["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Ljcifs/smb1/smb1/b;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",oplockLevel="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v2, p0, Ljcifs/smb1/smb1/r;->E:B

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",fid="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/r;->F:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",createAction=0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/r;->G:I

    const/4 v3, 0x4

    invoke-static {v2, v3}, LUg/d;->c(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",creationTime="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Ljava/util/Date;

    iget-wide v4, p0, Ljcifs/smb1/smb1/r;->N:J

    invoke-direct {v2, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ",lastAccessTime="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Ljava/util/Date;

    iget-wide v4, p0, Ljcifs/smb1/smb1/r;->X:J

    invoke-direct {v2, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ",lastWriteTime="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Ljava/util/Date;

    iget-wide v4, p0, Ljcifs/smb1/smb1/r;->Y:J

    invoke-direct {v2, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ",changeTime="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Ljava/util/Date;

    iget-wide v4, p0, Ljcifs/smb1/smb1/r;->Z:J

    invoke-direct {v2, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ",extFileAttributes=0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/r;->H:I

    invoke-static {v2, v3}, LUg/d;->c(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",allocationSize="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Ljcifs/smb1/smb1/r;->f1:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ",endOfFile="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Ljcifs/smb1/smb1/r;->g1:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ",fileType="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/r;->I:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",deviceState="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/r;->J:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",directory="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Ljcifs/smb1/smb1/r;->h1:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

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
