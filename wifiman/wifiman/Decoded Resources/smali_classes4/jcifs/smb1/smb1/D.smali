.class abstract Ljcifs/smb1/smb1/D;
.super Ljcifs/smb1/smb1/l;
.source "SourceFile"

# interfaces
.implements Ljava/util/Enumeration;


# instance fields
.field private B:I

.field private C:I

.field private D:Z

.field private E:Z

.field protected F:I

.field protected G:I

.field protected H:I

.field protected I:I

.field protected J:I

.field protected N:I

.field protected X:I

.field protected Y:I

.field protected Z:I

.field protected f1:I

.field g1:I

.field h1:B

.field i1:Z

.field j1:Z

.field k1:[B


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljcifs/smb1/smb1/l;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Ljcifs/smb1/smb1/D;->i1:Z

    iput-boolean v0, p0, Ljcifs/smb1/smb1/D;->j1:Z

    const/4 v0, 0x0

    iput-object v0, p0, Ljcifs/smb1/smb1/D;->k1:[B

    return-void
.end method


# virtual methods
.method A([BI)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method abstract E([BII)I
.end method

.method abstract F([BII)I
.end method

.method h([BI)I
    .locals 5

    const/4 v0, 0x0

    iput v0, p0, Ljcifs/smb1/smb1/D;->C:I

    iput v0, p0, Ljcifs/smb1/smb1/D;->B:I

    iget v1, p0, Ljcifs/smb1/smb1/D;->H:I

    if-lez v1, :cond_0

    iget v2, p0, Ljcifs/smb1/smb1/D;->I:I

    iget v3, p0, Ljcifs/smb1/smb1/l;->e:I

    sub-int v3, p2, v3

    sub-int/2addr v2, v3

    iput v2, p0, Ljcifs/smb1/smb1/D;->B:I

    add-int/2addr p2, v2

    iget-object v2, p0, Ljcifs/smb1/smb1/D;->k1:[B

    iget v3, p0, Ljcifs/smb1/smb1/D;->Z:I

    iget v4, p0, Ljcifs/smb1/smb1/D;->J:I

    add-int/2addr v3, v4

    invoke-static {p1, p2, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v1, p0, Ljcifs/smb1/smb1/D;->H:I

    add-int/2addr p2, v1

    :cond_0
    iget v1, p0, Ljcifs/smb1/smb1/D;->g1:I

    if-lez v1, :cond_1

    iget v2, p0, Ljcifs/smb1/smb1/D;->N:I

    iget v3, p0, Ljcifs/smb1/smb1/l;->e:I

    sub-int v3, p2, v3

    sub-int/2addr v2, v3

    iput v2, p0, Ljcifs/smb1/smb1/D;->C:I

    add-int/2addr p2, v2

    iget-object v2, p0, Ljcifs/smb1/smb1/D;->k1:[B

    iget v3, p0, Ljcifs/smb1/smb1/D;->f1:I

    iget v4, p0, Ljcifs/smb1/smb1/D;->X:I

    add-int/2addr v3, v4

    invoke-static {p1, p2, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1
    iget-boolean p1, p0, Ljcifs/smb1/smb1/D;->D:Z

    const/4 p2, 0x1

    if-nez p1, :cond_2

    iget p1, p0, Ljcifs/smb1/smb1/D;->J:I

    iget v1, p0, Ljcifs/smb1/smb1/D;->H:I

    add-int/2addr p1, v1

    iget v1, p0, Ljcifs/smb1/smb1/D;->F:I

    if-ne p1, v1, :cond_2

    iput-boolean p2, p0, Ljcifs/smb1/smb1/D;->D:Z

    :cond_2
    iget-boolean p1, p0, Ljcifs/smb1/smb1/D;->E:Z

    if-nez p1, :cond_3

    iget p1, p0, Ljcifs/smb1/smb1/D;->X:I

    iget v1, p0, Ljcifs/smb1/smb1/D;->g1:I

    add-int/2addr p1, v1

    iget v1, p0, Ljcifs/smb1/smb1/D;->G:I

    if-ne p1, v1, :cond_3

    iput-boolean p2, p0, Ljcifs/smb1/smb1/D;->E:Z

    :cond_3
    iget-boolean p1, p0, Ljcifs/smb1/smb1/D;->D:Z

    if-eqz p1, :cond_4

    iget-boolean p1, p0, Ljcifs/smb1/smb1/D;->E:Z

    if-eqz p1, :cond_4

    iput-boolean v0, p0, Ljcifs/smb1/smb1/D;->i1:Z

    iget-object p1, p0, Ljcifs/smb1/smb1/D;->k1:[B

    iget p2, p0, Ljcifs/smb1/smb1/D;->Z:I

    iget v0, p0, Ljcifs/smb1/smb1/D;->F:I

    invoke-virtual {p0, p1, p2, v0}, Ljcifs/smb1/smb1/D;->F([BII)I

    iget-object p1, p0, Ljcifs/smb1/smb1/D;->k1:[B

    iget p2, p0, Ljcifs/smb1/smb1/D;->f1:I

    iget v0, p0, Ljcifs/smb1/smb1/D;->G:I

    invoke-virtual {p0, p1, p2, v0}, Ljcifs/smb1/smb1/D;->E([BII)I

    :cond_4
    iget p1, p0, Ljcifs/smb1/smb1/D;->B:I

    iget p2, p0, Ljcifs/smb1/smb1/D;->H:I

    add-int/2addr p1, p2

    iget p2, p0, Ljcifs/smb1/smb1/D;->C:I

    add-int/2addr p1, p2

    iget p2, p0, Ljcifs/smb1/smb1/D;->g1:I

    add-int/2addr p1, p2

    return p1
.end method

.method public hasMoreElements()Z
    .locals 1

    iget v0, p0, Ljcifs/smb1/smb1/l;->h:I

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ljcifs/smb1/smb1/D;->i1:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method m([BI)I
    .locals 3

    invoke-static {p1, p2}, Ljcifs/smb1/smb1/l;->j([BI)I

    move-result v0

    iput v0, p0, Ljcifs/smb1/smb1/D;->F:I

    iget v1, p0, Ljcifs/smb1/smb1/D;->f1:I

    if-nez v1, :cond_0

    iput v0, p0, Ljcifs/smb1/smb1/D;->f1:I

    :cond_0
    add-int/lit8 v0, p2, 0x2

    invoke-static {p1, v0}, Ljcifs/smb1/smb1/l;->j([BI)I

    move-result v0

    iput v0, p0, Ljcifs/smb1/smb1/D;->G:I

    add-int/lit8 v0, p2, 0x6

    invoke-static {p1, v0}, Ljcifs/smb1/smb1/l;->j([BI)I

    move-result v0

    iput v0, p0, Ljcifs/smb1/smb1/D;->H:I

    add-int/lit8 v0, p2, 0x8

    invoke-static {p1, v0}, Ljcifs/smb1/smb1/l;->j([BI)I

    move-result v0

    iput v0, p0, Ljcifs/smb1/smb1/D;->I:I

    add-int/lit8 v0, p2, 0xa

    invoke-static {p1, v0}, Ljcifs/smb1/smb1/l;->j([BI)I

    move-result v0

    iput v0, p0, Ljcifs/smb1/smb1/D;->J:I

    add-int/lit8 v0, p2, 0xc

    invoke-static {p1, v0}, Ljcifs/smb1/smb1/l;->j([BI)I

    move-result v0

    iput v0, p0, Ljcifs/smb1/smb1/D;->g1:I

    add-int/lit8 v0, p2, 0xe

    invoke-static {p1, v0}, Ljcifs/smb1/smb1/l;->j([BI)I

    move-result v0

    iput v0, p0, Ljcifs/smb1/smb1/D;->N:I

    add-int/lit8 v0, p2, 0x10

    invoke-static {p1, v0}, Ljcifs/smb1/smb1/l;->j([BI)I

    move-result v0

    iput v0, p0, Ljcifs/smb1/smb1/D;->X:I

    add-int/lit8 v0, p2, 0x12

    aget-byte p1, p1, v0

    and-int/lit16 p1, p1, 0xff

    iput p1, p0, Ljcifs/smb1/smb1/D;->Y:I

    add-int/lit8 v0, p2, 0x14

    if-eqz p1, :cond_1

    sget p1, LUg/e;->b:I

    const/4 v1, 0x2

    if-le p1, v1, :cond_1

    sget-object p1, Ljcifs/smb1/smb1/l;->z:LUg/e;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setupCount is not zero: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/D;->Y:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_1
    sub-int/2addr v0, p2

    return v0
.end method

.method public nextElement()Ljava/lang/Object;
    .locals 1

    iget-boolean v0, p0, Ljcifs/smb1/smb1/D;->j1:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Ljcifs/smb1/smb1/D;->j1:Z

    :cond_0
    return-object p0
.end method

.method t()V
    .locals 2

    invoke-super {p0}, Ljcifs/smb1/smb1/l;->t()V

    const/4 v0, 0x0

    iput v0, p0, Ljcifs/smb1/smb1/D;->f1:I

    const/4 v1, 0x1

    iput-boolean v1, p0, Ljcifs/smb1/smb1/D;->i1:Z

    iput-boolean v1, p0, Ljcifs/smb1/smb1/D;->j1:Z

    iput-boolean v0, p0, Ljcifs/smb1/smb1/D;->E:Z

    iput-boolean v0, p0, Ljcifs/smb1/smb1/D;->D:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ljcifs/smb1/smb1/l;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",totalParameterCount="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/D;->F:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",totalDataCount="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/D;->G:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",parameterCount="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/D;->H:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",parameterOffset="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/D;->I:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",parameterDisplacement="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/D;->J:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",dataCount="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/D;->g1:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",dataOffset="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/D;->N:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",dataDisplacement="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/D;->X:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",setupCount="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/D;->Y:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",pad="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/D;->B:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",pad1="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/D;->C:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

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
