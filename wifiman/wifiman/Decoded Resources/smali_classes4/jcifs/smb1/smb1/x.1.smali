.class Ljcifs/smb1/smb1/x;
.super Ljcifs/smb1/smb1/l;
.source "SourceFile"

# interfaces
.implements Ljcifs/smb1/smb1/g;


# instance fields
.field private B:I

.field private C:J

.field private D:J

.field private E:I


# direct methods
.method constructor <init>(J)V
    .locals 3

    invoke-direct {p0}, Ljcifs/smb1/smb1/l;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Ljcifs/smb1/smb1/x;->B:I

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Ljcifs/smb1/smb1/x;->C:J

    iput v0, p0, Ljcifs/smb1/smb1/x;->E:I

    iput-wide p1, p0, Ljcifs/smb1/smb1/x;->D:J

    const/16 p1, 0x8

    iput-byte p1, p0, Ljcifs/smb1/smb1/l;->c:B

    return-void
.end method


# virtual methods
.method A([BI)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public a()J
    .locals 2

    iget v0, p0, Ljcifs/smb1/smb1/x;->E:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Ljcifs/smb1/smb1/x;->B:I

    return v0
.end method

.method public c()J
    .locals 4

    iget-wide v0, p0, Ljcifs/smb1/smb1/x;->C:J

    iget-wide v2, p0, Ljcifs/smb1/smb1/x;->D:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public d()J
    .locals 4

    iget-wide v0, p0, Ljcifs/smb1/smb1/x;->C:J

    iget-wide v2, p0, Ljcifs/smb1/smb1/x;->D:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method h([BI)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method m([BI)I
    .locals 2

    iget v0, p0, Ljcifs/smb1/smb1/l;->n:I

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-static {p1, p2}, Ljcifs/smb1/smb1/l;->j([BI)I

    move-result v0

    iput v0, p0, Ljcifs/smb1/smb1/x;->B:I

    add-int/lit8 v0, p2, 0x2

    invoke-static {p1, v0}, Ljcifs/smb1/smb1/l;->s([BI)J

    move-result-wide v0

    iput-wide v0, p0, Ljcifs/smb1/smb1/x;->C:J

    add-int/lit8 p2, p2, 0x6

    invoke-static {p1, p2}, Ljcifs/smb1/smb1/l;->k([BI)I

    move-result p1

    iput p1, p0, Ljcifs/smb1/smb1/x;->E:I

    const/16 p1, 0x14

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SmbComQueryInformationResponse["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Ljcifs/smb1/smb1/l;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",fileAttributes=0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/x;->B:I

    const/4 v3, 0x4

    invoke-static {v2, v3}, LUg/d;->c(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",lastWriteTime="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Ljava/util/Date;

    iget-wide v3, p0, Ljcifs/smb1/smb1/x;->C:J

    invoke-direct {v2, v3, v4}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ",fileSize="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/x;->E:I

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
