.class Ljcifs/smb1/smb1/W;
.super Ljcifs/smb1/smb1/D;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljcifs/smb1/smb1/W$a;
    }
.end annotation


# instance fields
.field private l1:I

.field m1:Ljcifs/smb1/smb1/a;


# direct methods
.method constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljcifs/smb1/smb1/D;-><init>()V

    iput p1, p0, Ljcifs/smb1/smb1/W;->l1:I

    const/16 p1, 0x32

    iput-byte p1, p0, Ljcifs/smb1/smb1/l;->c:B

    const/4 p1, 0x3

    iput-byte p1, p0, Ljcifs/smb1/smb1/D;->h1:B

    return-void
.end method


# virtual methods
.method E([BII)I
    .locals 1

    iget p3, p0, Ljcifs/smb1/smb1/W;->l1:I

    const/4 v0, 0x1

    if-eq p3, v0, :cond_2

    const/16 v0, 0x103

    if-eq p3, v0, :cond_1

    const/16 v0, 0x3ef

    if-eq p3, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0, p1, p2}, Ljcifs/smb1/smb1/W;->G([BI)I

    move-result p1

    return p1

    :cond_1
    invoke-virtual {p0, p1, p2}, Ljcifs/smb1/smb1/W;->I([BI)I

    move-result p1

    return p1

    :cond_2
    invoke-virtual {p0, p1, p2}, Ljcifs/smb1/smb1/W;->H([BI)I

    move-result p1

    return p1
.end method

.method F([BII)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method G([BI)I
    .locals 3

    new-instance v0, Ljcifs/smb1/smb1/W$a;

    invoke-direct {v0, p0}, Ljcifs/smb1/smb1/W$a;-><init>(Ljcifs/smb1/smb1/W;)V

    invoke-static {p1, p2}, Ljcifs/smb1/smb1/l;->l([BI)J

    move-result-wide v1

    iput-wide v1, v0, Ljcifs/smb1/smb1/W$a;->a:J

    add-int/lit8 v1, p2, 0x8

    invoke-static {p1, v1}, Ljcifs/smb1/smb1/l;->l([BI)J

    move-result-wide v1

    iput-wide v1, v0, Ljcifs/smb1/smb1/W$a;->b:J

    add-int/lit8 v1, p2, 0x18

    invoke-static {p1, v1}, Ljcifs/smb1/smb1/l;->k([BI)I

    move-result v1

    iput v1, v0, Ljcifs/smb1/smb1/W$a;->c:I

    add-int/lit8 v1, p2, 0x1c

    invoke-static {p1, v1}, Ljcifs/smb1/smb1/l;->k([BI)I

    move-result p1

    iput p1, v0, Ljcifs/smb1/smb1/W$a;->d:I

    add-int/lit8 p1, p2, 0x20

    iput-object v0, p0, Ljcifs/smb1/smb1/W;->m1:Ljcifs/smb1/smb1/a;

    sub-int/2addr p1, p2

    return p1
.end method

.method H([BI)I
    .locals 3

    new-instance v0, Ljcifs/smb1/smb1/W$a;

    invoke-direct {v0, p0}, Ljcifs/smb1/smb1/W$a;-><init>(Ljcifs/smb1/smb1/W;)V

    add-int/lit8 v1, p2, 0x4

    invoke-static {p1, v1}, Ljcifs/smb1/smb1/l;->k([BI)I

    move-result v1

    iput v1, v0, Ljcifs/smb1/smb1/W$a;->c:I

    add-int/lit8 v1, p2, 0x8

    invoke-static {p1, v1}, Ljcifs/smb1/smb1/l;->k([BI)I

    move-result v1

    int-to-long v1, v1

    iput-wide v1, v0, Ljcifs/smb1/smb1/W$a;->a:J

    add-int/lit8 v1, p2, 0xc

    invoke-static {p1, v1}, Ljcifs/smb1/smb1/l;->k([BI)I

    move-result v1

    int-to-long v1, v1

    iput-wide v1, v0, Ljcifs/smb1/smb1/W$a;->b:J

    add-int/lit8 v1, p2, 0x10

    invoke-static {p1, v1}, Ljcifs/smb1/smb1/l;->j([BI)I

    move-result p1

    iput p1, v0, Ljcifs/smb1/smb1/W$a;->d:I

    add-int/lit8 p1, p2, 0x14

    iput-object v0, p0, Ljcifs/smb1/smb1/W;->m1:Ljcifs/smb1/smb1/a;

    sub-int/2addr p1, p2

    return p1
.end method

.method I([BI)I
    .locals 3

    new-instance v0, Ljcifs/smb1/smb1/W$a;

    invoke-direct {v0, p0}, Ljcifs/smb1/smb1/W$a;-><init>(Ljcifs/smb1/smb1/W;)V

    invoke-static {p1, p2}, Ljcifs/smb1/smb1/l;->l([BI)J

    move-result-wide v1

    iput-wide v1, v0, Ljcifs/smb1/smb1/W$a;->a:J

    add-int/lit8 v1, p2, 0x8

    invoke-static {p1, v1}, Ljcifs/smb1/smb1/l;->l([BI)J

    move-result-wide v1

    iput-wide v1, v0, Ljcifs/smb1/smb1/W$a;->b:J

    add-int/lit8 v1, p2, 0x10

    invoke-static {p1, v1}, Ljcifs/smb1/smb1/l;->k([BI)I

    move-result v1

    iput v1, v0, Ljcifs/smb1/smb1/W$a;->c:I

    add-int/lit8 v1, p2, 0x14

    invoke-static {p1, v1}, Ljcifs/smb1/smb1/l;->k([BI)I

    move-result p1

    iput p1, v0, Ljcifs/smb1/smb1/W$a;->d:I

    add-int/lit8 p1, p2, 0x18

    iput-object v0, p0, Ljcifs/smb1/smb1/W;->m1:Ljcifs/smb1/smb1/a;

    sub-int/2addr p1, p2

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Trans2QueryFSInformationResponse["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Ljcifs/smb1/smb1/D;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
