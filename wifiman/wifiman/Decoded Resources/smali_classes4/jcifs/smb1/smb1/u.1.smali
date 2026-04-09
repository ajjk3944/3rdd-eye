.class Ljcifs/smb1/smb1/u;
.super Ljcifs/smb1/smb1/b;
.source "SourceFile"


# static fields
.field private static final X:I


# instance fields
.field E:I

.field F:I

.field G:I

.field H:I

.field I:I

.field J:I

.field N:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "jcifs.smb1.smb.client.OpenAndX.ReadAndX"

    const/4 v1, 0x1

    invoke-static {v0, v1}, LRg/a;->d(Ljava/lang/String;I)I

    move-result v0

    sput v0, Ljcifs/smb1/smb1/u;->X:I

    return-void
.end method

.method constructor <init>(Ljava/lang/String;IILjcifs/smb1/smb1/l;)V
    .locals 1

    invoke-direct {p0, p4}, Ljcifs/smb1/smb1/b;-><init>(Ljcifs/smb1/smb1/l;)V

    iput-object p1, p0, Ljcifs/smb1/smb1/l;->w:Ljava/lang/String;

    const/16 p1, 0x2d

    iput-byte p1, p0, Ljcifs/smb1/smb1/l;->c:B

    const/4 p1, 0x3

    and-int/2addr p2, p1

    iput p2, p0, Ljcifs/smb1/smb1/u;->F:I

    const/4 p4, 0x2

    if-ne p2, p1, :cond_0

    iput p4, p0, Ljcifs/smb1/smb1/u;->F:I

    :cond_0
    iget p1, p0, Ljcifs/smb1/smb1/u;->F:I

    const/16 p2, 0x40

    or-int/2addr p1, p2

    and-int/lit8 p1, p1, -0x2

    iput p1, p0, Ljcifs/smb1/smb1/u;->F:I

    const/16 p1, 0x16

    iput p1, p0, Ljcifs/smb1/smb1/u;->G:I

    const/4 p1, 0x0

    iput p1, p0, Ljcifs/smb1/smb1/u;->H:I

    and-int/lit8 p1, p3, 0x40

    const/16 v0, 0x10

    if-ne p1, p2, :cond_2

    and-int/lit8 p1, p3, 0x10

    if-ne p1, v0, :cond_1

    const/16 p1, 0x12

    iput p1, p0, Ljcifs/smb1/smb1/u;->J:I

    goto :goto_0

    :cond_1
    iput p4, p0, Ljcifs/smb1/smb1/u;->J:I

    goto :goto_0

    :cond_2
    and-int/lit8 p1, p3, 0x10

    if-ne p1, v0, :cond_4

    const/16 p1, 0x20

    and-int/lit8 p2, p3, 0x20

    if-ne p2, p1, :cond_3

    iput v0, p0, Ljcifs/smb1/smb1/u;->J:I

    goto :goto_0

    :cond_3
    const/16 p1, 0x11

    iput p1, p0, Ljcifs/smb1/smb1/u;->J:I

    goto :goto_0

    :cond_4
    const/4 p1, 0x1

    iput p1, p0, Ljcifs/smb1/smb1/u;->J:I

    :goto_0
    return-void
.end method


# virtual methods
.method A([BI)I
    .locals 4

    iget v0, p0, Ljcifs/smb1/smb1/u;->E:I

    int-to-long v0, v0

    invoke-static {v0, v1, p1, p2}, Ljcifs/smb1/smb1/l;->x(J[BI)V

    add-int/lit8 v0, p2, 0x2

    iget v1, p0, Ljcifs/smb1/smb1/u;->F:I

    int-to-long v1, v1

    invoke-static {v1, v2, p1, v0}, Ljcifs/smb1/smb1/l;->x(J[BI)V

    add-int/lit8 v0, p2, 0x4

    iget v1, p0, Ljcifs/smb1/smb1/u;->G:I

    int-to-long v1, v1

    invoke-static {v1, v2, p1, v0}, Ljcifs/smb1/smb1/l;->x(J[BI)V

    add-int/lit8 v0, p2, 0x6

    iget v1, p0, Ljcifs/smb1/smb1/u;->H:I

    int-to-long v1, v1

    invoke-static {v1, v2, p1, v0}, Ljcifs/smb1/smb1/l;->x(J[BI)V

    add-int/lit8 v0, p2, 0x8

    const/4 v1, 0x0

    iput v1, p0, Ljcifs/smb1/smb1/u;->I:I

    int-to-long v2, v1

    invoke-static {v2, v3, p1, v0}, Ljcifs/smb1/smb1/l;->y(J[BI)V

    add-int/lit8 v0, p2, 0xc

    iget v2, p0, Ljcifs/smb1/smb1/u;->J:I

    int-to-long v2, v2

    invoke-static {v2, v3, p1, v0}, Ljcifs/smb1/smb1/l;->x(J[BI)V

    add-int/lit8 v0, p2, 0xe

    iget v2, p0, Ljcifs/smb1/smb1/u;->N:I

    int-to-long v2, v2

    invoke-static {v2, v3, p1, v0}, Ljcifs/smb1/smb1/l;->y(J[BI)V

    add-int/lit8 v0, p2, 0x12

    move v2, v1

    :goto_0
    const/16 v3, 0x8

    if-ge v2, v3, :cond_0

    add-int/lit8 v3, v0, 0x1

    aput-byte v1, p1, v0

    add-int/lit8 v2, v2, 0x1

    move v0, v3

    goto :goto_0

    :cond_0
    sub-int/2addr v0, p2

    return v0
.end method

.method E(B)I
    .locals 1

    const/16 v0, 0x2e

    if-ne p1, v0, :cond_0

    sget p1, Ljcifs/smb1/smb1/u;->X:I

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
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
    .locals 6

    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SmbComOpenAndX["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Ljcifs/smb1/smb1/b;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",flags=0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/u;->E:I

    const/4 v3, 0x2

    invoke-static {v2, v3}, LUg/d;->c(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",desiredAccess=0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/u;->F:I

    const/4 v4, 0x4

    invoke-static {v2, v4}, LUg/d;->c(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",searchAttributes=0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/u;->G:I

    invoke-static {v2, v4}, LUg/d;->c(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",fileAttributes=0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/u;->H:I

    invoke-static {v2, v4}, LUg/d;->c(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",creationTime="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Ljava/util/Date;

    iget v4, p0, Ljcifs/smb1/smb1/u;->I:I

    int-to-long v4, v4

    invoke-direct {v2, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ",openFunction=0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/u;->J:I

    invoke-static {v2, v3}, LUg/d;->c(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",allocationSize="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/u;->N:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",fileName="

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
    .locals 2

    iget-boolean v0, p0, Ljcifs/smb1/smb1/l;->p:Z

    if-eqz v0, :cond_0

    add-int/lit8 v0, p2, 0x1

    const/4 v1, 0x0

    aput-byte v1, p1, p2

    goto :goto_0

    :cond_0
    move v0, p2

    :goto_0
    iget-object v1, p0, Ljcifs/smb1/smb1/l;->w:Ljava/lang/String;

    invoke-virtual {p0, v1, p1, v0}, Ljcifs/smb1/smb1/l;->B(Ljava/lang/String;[BI)I

    move-result p1

    add-int/2addr v0, p1

    sub-int/2addr v0, p2

    return v0
.end method
