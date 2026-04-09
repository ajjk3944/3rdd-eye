.class Ljcifs/smb1/smb1/B;
.super Ljcifs/smb1/smb1/b;
.source "SourceFile"


# instance fields
.field private E:Ljava/lang/String;

.field private F:Ljava/lang/String;

.field private G:Ljava/lang/String;

.field H:Z

.field I:[B


# direct methods
.method constructor <init>(Ljcifs/smb1/smb1/l;)V
    .locals 0

    invoke-direct {p0, p1}, Ljcifs/smb1/smb1/b;-><init>(Ljcifs/smb1/smb1/l;)V

    const-string p1, ""

    iput-object p1, p0, Ljcifs/smb1/smb1/B;->E:Ljava/lang/String;

    iput-object p1, p0, Ljcifs/smb1/smb1/B;->F:Ljava/lang/String;

    iput-object p1, p0, Ljcifs/smb1/smb1/B;->G:Ljava/lang/String;

    const/4 p1, 0x0

    iput-object p1, p0, Ljcifs/smb1/smb1/B;->I:[B

    return-void
.end method


# virtual methods
.method A([BI)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method h([BI)I
    .locals 8

    iget-boolean v0, p0, Ljcifs/smb1/smb1/l;->r:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljcifs/smb1/smb1/B;->I:[B

    const/4 v1, 0x0

    array-length v2, v0

    invoke-static {p1, p2, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Ljcifs/smb1/smb1/B;->I:[B

    array-length v0, v0

    add-int/2addr v0, p2

    goto :goto_0

    :cond_0
    move v0, p2

    :goto_0
    invoke-virtual {p0, p1, v0}, Ljcifs/smb1/smb1/l;->n([BI)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ljcifs/smb1/smb1/B;->E:Ljava/lang/String;

    invoke-virtual {p0, v1, v0}, Ljcifs/smb1/smb1/l;->u(Ljava/lang/String;I)I

    move-result v1

    add-int/2addr v0, v1

    iget v1, p0, Ljcifs/smb1/smb1/l;->o:I

    add-int v5, p2, v1

    const/16 v6, 0xff

    iget-boolean v7, p0, Ljcifs/smb1/smb1/l;->p:Z

    move-object v2, p0

    move-object v3, p1

    move v4, v0

    invoke-virtual/range {v2 .. v7}, Ljcifs/smb1/smb1/l;->o([BIIIZ)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ljcifs/smb1/smb1/B;->F:Ljava/lang/String;

    invoke-virtual {p0, v1, v0}, Ljcifs/smb1/smb1/l;->u(Ljava/lang/String;I)I

    move-result v1

    add-int/2addr v0, v1

    iget-boolean v1, p0, Ljcifs/smb1/smb1/l;->r:Z

    if-nez v1, :cond_1

    iget v1, p0, Ljcifs/smb1/smb1/l;->o:I

    add-int v5, p2, v1

    const/16 v6, 0xff

    iget-boolean v7, p0, Ljcifs/smb1/smb1/l;->p:Z

    move-object v2, p0

    move-object v3, p1

    move v4, v0

    invoke-virtual/range {v2 .. v7}, Ljcifs/smb1/smb1/l;->o([BIIIZ)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ljcifs/smb1/smb1/B;->G:Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Ljcifs/smb1/smb1/l;->u(Ljava/lang/String;I)I

    move-result p1

    add-int/2addr v0, p1

    :cond_1
    sub-int/2addr v0, p2

    return v0
.end method

.method m([BI)I
    .locals 2

    aget-byte v0, p1, p2

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, p0, Ljcifs/smb1/smb1/B;->H:Z

    add-int/lit8 v0, p2, 0x2

    iget-boolean v1, p0, Ljcifs/smb1/smb1/l;->r:Z

    if-eqz v1, :cond_1

    invoke-static {p1, v0}, Ljcifs/smb1/smb1/l;->j([BI)I

    move-result p1

    add-int/lit8 v0, p2, 0x4

    new-array p1, p1, [B

    iput-object p1, p0, Ljcifs/smb1/smb1/B;->I:[B

    :cond_1
    sub-int/2addr v0, p2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SmbComSessionSetupAndXResponse["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Ljcifs/smb1/smb1/b;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",isLoggedInAsGuest="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Ljcifs/smb1/smb1/B;->H:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ",nativeOs="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ljcifs/smb1/smb1/B;->E:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",nativeLanMan="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ljcifs/smb1/smb1/B;->F:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",primaryDomain="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ljcifs/smb1/smb1/B;->G:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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
