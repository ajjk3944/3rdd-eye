.class Ljcifs/smb1/smb1/Y;
.super Ljcifs/smb1/smb1/D;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljcifs/smb1/smb1/Y$b;,
        Ljcifs/smb1/smb1/Y$a;
    }
.end annotation


# instance fields
.field private l1:I

.field m1:Ljcifs/smb1/smb1/g;


# direct methods
.method constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljcifs/smb1/smb1/D;-><init>()V

    iput p1, p0, Ljcifs/smb1/smb1/Y;->l1:I

    const/4 p1, 0x5

    iput-byte p1, p0, Ljcifs/smb1/smb1/D;->h1:B

    return-void
.end method


# virtual methods
.method E([BII)I
    .locals 1

    iget p3, p0, Ljcifs/smb1/smb1/Y;->l1:I

    const/16 v0, 0x101

    if-eq p3, v0, :cond_1

    const/16 v0, 0x102

    if-eq p3, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0, p1, p2}, Ljcifs/smb1/smb1/Y;->H([BI)I

    move-result p1

    return p1

    :cond_1
    invoke-virtual {p0, p1, p2}, Ljcifs/smb1/smb1/Y;->G([BI)I

    move-result p1

    return p1
.end method

.method F([BII)I
    .locals 0

    const/4 p1, 0x2

    return p1
.end method

.method G([BI)I
    .locals 3

    new-instance v0, Ljcifs/smb1/smb1/Y$a;

    invoke-direct {v0, p0}, Ljcifs/smb1/smb1/Y$a;-><init>(Ljcifs/smb1/smb1/Y;)V

    invoke-static {p1, p2}, Ljcifs/smb1/smb1/l;->r([BI)J

    move-result-wide v1

    iput-wide v1, v0, Ljcifs/smb1/smb1/Y$a;->a:J

    add-int/lit8 v1, p2, 0x8

    invoke-static {p1, v1}, Ljcifs/smb1/smb1/l;->r([BI)J

    move-result-wide v1

    iput-wide v1, v0, Ljcifs/smb1/smb1/Y$a;->b:J

    add-int/lit8 v1, p2, 0x10

    invoke-static {p1, v1}, Ljcifs/smb1/smb1/l;->r([BI)J

    move-result-wide v1

    iput-wide v1, v0, Ljcifs/smb1/smb1/Y$a;->c:J

    add-int/lit8 v1, p2, 0x18

    invoke-static {p1, v1}, Ljcifs/smb1/smb1/l;->r([BI)J

    move-result-wide v1

    iput-wide v1, v0, Ljcifs/smb1/smb1/Y$a;->d:J

    add-int/lit8 v1, p2, 0x20

    invoke-static {p1, v1}, Ljcifs/smb1/smb1/l;->j([BI)I

    move-result p1

    iput p1, v0, Ljcifs/smb1/smb1/Y$a;->e:I

    add-int/lit8 p1, p2, 0x22

    iput-object v0, p0, Ljcifs/smb1/smb1/Y;->m1:Ljcifs/smb1/smb1/g;

    sub-int/2addr p1, p2

    return p1
.end method

.method H([BI)I
    .locals 5

    new-instance v0, Ljcifs/smb1/smb1/Y$b;

    invoke-direct {v0, p0}, Ljcifs/smb1/smb1/Y$b;-><init>(Ljcifs/smb1/smb1/Y;)V

    invoke-static {p1, p2}, Ljcifs/smb1/smb1/l;->l([BI)J

    move-result-wide v1

    iput-wide v1, v0, Ljcifs/smb1/smb1/Y$b;->a:J

    add-int/lit8 v1, p2, 0x8

    invoke-static {p1, v1}, Ljcifs/smb1/smb1/l;->l([BI)J

    move-result-wide v1

    iput-wide v1, v0, Ljcifs/smb1/smb1/Y$b;->b:J

    add-int/lit8 v1, p2, 0x10

    invoke-static {p1, v1}, Ljcifs/smb1/smb1/l;->k([BI)I

    move-result v1

    iput v1, v0, Ljcifs/smb1/smb1/Y$b;->c:I

    add-int/lit8 v1, p2, 0x14

    add-int/lit8 v2, p2, 0x15

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-lez v1, :cond_0

    move v1, v4

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    iput-boolean v1, v0, Ljcifs/smb1/smb1/Y$b;->d:Z

    add-int/lit8 v1, p2, 0x16

    aget-byte p1, p1, v2

    and-int/lit16 p1, p1, 0xff

    if-lez p1, :cond_1

    move v3, v4

    :cond_1
    iput-boolean v3, v0, Ljcifs/smb1/smb1/Y$b;->e:Z

    iput-object v0, p0, Ljcifs/smb1/smb1/Y;->m1:Ljcifs/smb1/smb1/g;

    sub-int/2addr v1, p2

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Trans2QueryPathInformationResponse["

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
