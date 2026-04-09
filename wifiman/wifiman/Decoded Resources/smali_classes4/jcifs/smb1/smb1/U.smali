.class Ljcifs/smb1/smb1/U;
.super Ljcifs/smb1/smb1/D;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljcifs/smb1/smb1/U$a;
    }
.end annotation


# instance fields
.field l1:I

.field m1:I

.field n1:I

.field o1:[Ljcifs/smb1/smb1/U$a;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljcifs/smb1/smb1/D;-><init>()V

    const/16 v0, 0x10

    iput-byte v0, p0, Ljcifs/smb1/smb1/D;->h1:B

    return-void
.end method


# virtual methods
.method E([BII)I
    .locals 4

    invoke-static {p1, p2}, Ljcifs/smb1/smb1/l;->j([BI)I

    move-result v0

    iput v0, p0, Ljcifs/smb1/smb1/U;->l1:I

    add-int/lit8 v1, p2, 0x2

    iget v2, p0, Ljcifs/smb1/smb1/l;->i:I

    const v3, 0x8000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    div-int/lit8 v0, v0, 0x2

    iput v0, p0, Ljcifs/smb1/smb1/U;->l1:I

    :cond_0
    invoke-static {p1, v1}, Ljcifs/smb1/smb1/l;->j([BI)I

    move-result v0

    iput v0, p0, Ljcifs/smb1/smb1/U;->m1:I

    add-int/lit8 v0, p2, 0x4

    invoke-static {p1, v0}, Ljcifs/smb1/smb1/l;->j([BI)I

    move-result v0

    iput v0, p0, Ljcifs/smb1/smb1/U;->n1:I

    add-int/lit8 v0, p2, 0x8

    iget v1, p0, Ljcifs/smb1/smb1/U;->m1:I

    new-array v1, v1, [Ljcifs/smb1/smb1/U$a;

    iput-object v1, p0, Ljcifs/smb1/smb1/U;->o1:[Ljcifs/smb1/smb1/U$a;

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Ljcifs/smb1/smb1/U;->m1:I

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Ljcifs/smb1/smb1/U;->o1:[Ljcifs/smb1/smb1/U$a;

    new-instance v3, Ljcifs/smb1/smb1/U$a;

    invoke-direct {v3, p0}, Ljcifs/smb1/smb1/U$a;-><init>(Ljcifs/smb1/smb1/U;)V

    aput-object v3, v2, v1

    iget-object v2, p0, Ljcifs/smb1/smb1/U;->o1:[Ljcifs/smb1/smb1/U$a;

    aget-object v2, v2, v1

    invoke-virtual {v2, p1, v0, p3}, Ljcifs/smb1/smb1/U$a;->a([BII)I

    move-result v2

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    sub-int/2addr v0, p2

    return v0
.end method

.method F([BII)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Trans2GetDfsReferralResponse["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Ljcifs/smb1/smb1/D;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",pathConsumed="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/U;->l1:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",numReferrals="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/U;->m1:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",flags="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/U;->n1:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
