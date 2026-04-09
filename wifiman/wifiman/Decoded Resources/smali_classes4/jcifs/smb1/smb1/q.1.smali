.class Ljcifs/smb1/smb1/q;
.super Ljcifs/smb1/smb1/b;
.source "SourceFile"


# instance fields
.field private E:I

.field private F:I

.field private G:I

.field private H:I

.field private I:I

.field private J:I

.field private N:J

.field private X:B

.field private Y:I

.field Z:I

.field f1:I


# direct methods
.method constructor <init>(Ljava/lang/String;IIIIILjcifs/smb1/smb1/l;)V
    .locals 0

    invoke-direct {p0, p7}, Ljcifs/smb1/smb1/b;-><init>(Ljcifs/smb1/smb1/l;)V

    iput-object p1, p0, Ljcifs/smb1/smb1/l;->w:Ljava/lang/String;

    const/16 p1, -0x5e

    iput-byte p1, p0, Ljcifs/smb1/smb1/l;->c:B

    or-int/lit16 p1, p3, 0x89

    iput p1, p0, Ljcifs/smb1/smb1/q;->f1:I

    iput p5, p0, Ljcifs/smb1/smb1/q;->F:I

    iput p4, p0, Ljcifs/smb1/smb1/q;->G:I

    and-int/lit8 p1, p2, 0x40

    const/4 p3, 0x3

    const/4 p4, 0x2

    const/16 p5, 0x10

    const/16 p7, 0x40

    if-ne p1, p7, :cond_1

    and-int/lit8 p1, p2, 0x10

    if-ne p1, p5, :cond_0

    const/4 p1, 0x5

    iput p1, p0, Ljcifs/smb1/smb1/q;->H:I

    goto :goto_0

    :cond_0
    const/4 p1, 0x4

    iput p1, p0, Ljcifs/smb1/smb1/q;->H:I

    goto :goto_0

    :cond_1
    and-int/lit8 p1, p2, 0x10

    if-ne p1, p5, :cond_3

    const/16 p1, 0x20

    and-int/2addr p2, p1

    if-ne p2, p1, :cond_2

    iput p4, p0, Ljcifs/smb1/smb1/q;->H:I

    goto :goto_0

    :cond_2
    iput p3, p0, Ljcifs/smb1/smb1/q;->H:I

    goto :goto_0

    :cond_3
    const/4 p1, 0x1

    iput p1, p0, Ljcifs/smb1/smb1/q;->H:I

    :goto_0
    and-int/lit8 p1, p6, 0x1

    if-nez p1, :cond_4

    or-int/lit8 p1, p6, 0x40

    iput p1, p0, Ljcifs/smb1/smb1/q;->I:I

    goto :goto_1

    :cond_4
    iput p6, p0, Ljcifs/smb1/smb1/q;->I:I

    :goto_1
    iput p4, p0, Ljcifs/smb1/smb1/q;->J:I

    iput-byte p3, p0, Ljcifs/smb1/smb1/q;->X:B

    return-void
.end method


# virtual methods
.method A([BI)I
    .locals 3

    add-int/lit8 v0, p2, 0x1

    const/4 v1, 0x0

    aput-byte v1, p1, p2

    iput v0, p0, Ljcifs/smb1/smb1/q;->Y:I

    add-int/lit8 v0, p2, 0x3

    iget v1, p0, Ljcifs/smb1/smb1/q;->Z:I

    int-to-long v1, v1

    invoke-static {v1, v2, p1, v0}, Ljcifs/smb1/smb1/l;->y(J[BI)V

    add-int/lit8 v0, p2, 0x7

    iget v1, p0, Ljcifs/smb1/smb1/q;->E:I

    int-to-long v1, v1

    invoke-static {v1, v2, p1, v0}, Ljcifs/smb1/smb1/l;->y(J[BI)V

    add-int/lit8 v0, p2, 0xb

    iget v1, p0, Ljcifs/smb1/smb1/q;->f1:I

    int-to-long v1, v1

    invoke-static {v1, v2, p1, v0}, Ljcifs/smb1/smb1/l;->y(J[BI)V

    add-int/lit8 v0, p2, 0xf

    iget-wide v1, p0, Ljcifs/smb1/smb1/q;->N:J

    invoke-static {v1, v2, p1, v0}, Ljcifs/smb1/smb1/l;->z(J[BI)V

    add-int/lit8 v0, p2, 0x17

    iget v1, p0, Ljcifs/smb1/smb1/q;->F:I

    int-to-long v1, v1

    invoke-static {v1, v2, p1, v0}, Ljcifs/smb1/smb1/l;->y(J[BI)V

    add-int/lit8 v0, p2, 0x1b

    iget v1, p0, Ljcifs/smb1/smb1/q;->G:I

    int-to-long v1, v1

    invoke-static {v1, v2, p1, v0}, Ljcifs/smb1/smb1/l;->y(J[BI)V

    add-int/lit8 v0, p2, 0x1f

    iget v1, p0, Ljcifs/smb1/smb1/q;->H:I

    int-to-long v1, v1

    invoke-static {v1, v2, p1, v0}, Ljcifs/smb1/smb1/l;->y(J[BI)V

    add-int/lit8 v0, p2, 0x23

    iget v1, p0, Ljcifs/smb1/smb1/q;->I:I

    int-to-long v1, v1

    invoke-static {v1, v2, p1, v0}, Ljcifs/smb1/smb1/l;->y(J[BI)V

    add-int/lit8 v0, p2, 0x27

    iget v1, p0, Ljcifs/smb1/smb1/q;->J:I

    int-to-long v1, v1

    invoke-static {v1, v2, p1, v0}, Ljcifs/smb1/smb1/l;->y(J[BI)V

    add-int/lit8 v0, p2, 0x2b

    add-int/lit8 v1, p2, 0x2c

    iget-byte v2, p0, Ljcifs/smb1/smb1/q;->X:B

    aput-byte v2, p1, v0

    sub-int/2addr v1, p2

    return v1
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
    .locals 7

    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SmbComNTCreateAndX["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Ljcifs/smb1/smb1/b;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",flags=0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/q;->Z:I

    const/4 v3, 0x2

    invoke-static {v2, v3}, LUg/d;->c(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",rootDirectoryFid="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/q;->E:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",desiredAccess=0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/q;->f1:I

    const/4 v4, 0x4

    invoke-static {v2, v4}, LUg/d;->c(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",allocationSize="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v5, p0, Ljcifs/smb1/smb1/q;->N:J

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ",extFileAttributes=0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/q;->F:I

    invoke-static {v2, v4}, LUg/d;->c(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",shareAccess=0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/q;->G:I

    invoke-static {v2, v4}, LUg/d;->c(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",createDisposition=0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/q;->H:I

    invoke-static {v2, v4}, LUg/d;->c(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",createOptions=0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/q;->I:I

    const/16 v5, 0x8

    invoke-static {v2, v5}, LUg/d;->c(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",impersonationLevel=0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/q;->J:I

    invoke-static {v2, v4}, LUg/d;->c(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",securityFlags=0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v2, p0, Ljcifs/smb1/smb1/q;->X:B

    invoke-static {v2, v3}, LUg/d;->c(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",name="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ljcifs/smb1/smb1/l;->w:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method v([BI)I
    .locals 3

    iget-object v0, p0, Ljcifs/smb1/smb1/l;->w:Ljava/lang/String;

    invoke-virtual {p0, v0, p1, p2}, Ljcifs/smb1/smb1/l;->B(Ljava/lang/String;[BI)I

    move-result p2

    iget-boolean v0, p0, Ljcifs/smb1/smb1/l;->p:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljcifs/smb1/smb1/l;->w:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    goto :goto_0

    :cond_0
    move v0, p2

    :goto_0
    int-to-long v0, v0

    iget v2, p0, Ljcifs/smb1/smb1/q;->Y:I

    invoke-static {v0, v1, p1, v2}, Ljcifs/smb1/smb1/l;->x(J[BI)V

    return p2
.end method
