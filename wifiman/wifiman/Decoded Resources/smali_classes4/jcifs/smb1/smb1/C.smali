.class abstract Ljcifs/smb1/smb1/C;
.super Ljcifs/smb1/smb1/l;
.source "SourceFile"

# interfaces
.implements Ljava/util/Enumeration;


# static fields
.field private static final s1:I


# instance fields
.field private B:I

.field private C:I

.field private D:I

.field private E:Z

.field private F:Z

.field private G:I

.field private H:I

.field protected I:I

.field protected J:I

.field protected N:I

.field protected X:I

.field protected Y:I

.field protected Z:I

.field protected f1:I

.field protected g1:I

.field h1:I

.field i1:I

.field j1:I

.field k1:I

.field l1:B

.field m1:I

.field n1:I

.field o1:B

.field p1:Ljava/lang/String;

.field q1:I

.field r1:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "jcifs.smb1.smb.client.transaction_buf_size"

    const v1, 0xffff

    invoke-static {v0, v1}, LRg/a;->d(Ljava/lang/String;I)I

    move-result v0

    add-int/lit16 v0, v0, -0x200

    sput v0, Ljcifs/smb1/smb1/C;->s1:I

    return-void
.end method

.method constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljcifs/smb1/smb1/l;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Ljcifs/smb1/smb1/C;->B:I

    iput v0, p0, Ljcifs/smb1/smb1/C;->C:I

    iput v0, p0, Ljcifs/smb1/smb1/C;->D:I

    const/4 v1, 0x1

    iput-boolean v1, p0, Ljcifs/smb1/smb1/C;->E:Z

    iput-boolean v1, p0, Ljcifs/smb1/smb1/C;->F:Z

    sget v2, Ljcifs/smb1/smb1/C;->s1:I

    iput v2, p0, Ljcifs/smb1/smb1/C;->k1:I

    iput v0, p0, Ljcifs/smb1/smb1/C;->m1:I

    iput v1, p0, Ljcifs/smb1/smb1/C;->n1:I

    const-string v0, ""

    iput-object v0, p0, Ljcifs/smb1/smb1/C;->p1:Ljava/lang/String;

    const/16 v0, 0x400

    iput v0, p0, Ljcifs/smb1/smb1/C;->j1:I

    const/16 v0, 0x3d

    iput v0, p0, Ljcifs/smb1/smb1/C;->I:I

    const/16 v0, 0x33

    iput v0, p0, Ljcifs/smb1/smb1/C;->J:I

    return-void
.end method


# virtual methods
.method A([BI)I
    .locals 6

    iget v0, p0, Ljcifs/smb1/smb1/C;->h1:I

    int-to-long v0, v0

    invoke-static {v0, v1, p1, p2}, Ljcifs/smb1/smb1/l;->x(J[BI)V

    add-int/lit8 v0, p2, 0x2

    iget v1, p0, Ljcifs/smb1/smb1/C;->i1:I

    int-to-long v1, v1

    invoke-static {v1, v2, p1, v0}, Ljcifs/smb1/smb1/l;->x(J[BI)V

    add-int/lit8 v0, p2, 0x4

    iget-byte v1, p0, Ljcifs/smb1/smb1/l;->c:B

    const/4 v2, 0x0

    const/16 v3, 0x26

    if-eq v1, v3, :cond_0

    iget v1, p0, Ljcifs/smb1/smb1/C;->j1:I

    int-to-long v4, v1

    invoke-static {v4, v5, p1, v0}, Ljcifs/smb1/smb1/l;->x(J[BI)V

    add-int/lit8 v0, p2, 0x6

    iget v1, p0, Ljcifs/smb1/smb1/C;->k1:I

    int-to-long v4, v1

    invoke-static {v4, v5, p1, v0}, Ljcifs/smb1/smb1/l;->x(J[BI)V

    add-int/lit8 v0, p2, 0x8

    add-int/lit8 v1, p2, 0x9

    iget-byte v4, p0, Ljcifs/smb1/smb1/C;->l1:B

    aput-byte v4, p1, v0

    add-int/lit8 v0, p2, 0xa

    aput-byte v2, p1, v1

    iget v1, p0, Ljcifs/smb1/smb1/C;->B:I

    int-to-long v4, v1

    invoke-static {v4, v5, p1, v0}, Ljcifs/smb1/smb1/l;->x(J[BI)V

    add-int/lit8 v0, p2, 0xc

    iget v1, p0, Ljcifs/smb1/smb1/C;->m1:I

    int-to-long v4, v1

    invoke-static {v4, v5, p1, v0}, Ljcifs/smb1/smb1/l;->y(J[BI)V

    add-int/lit8 v0, p2, 0x10

    add-int/lit8 v1, p2, 0x11

    aput-byte v2, p1, v0

    add-int/lit8 v0, p2, 0x12

    aput-byte v2, p1, v1

    :cond_0
    iget v1, p0, Ljcifs/smb1/smb1/C;->N:I

    int-to-long v4, v1

    invoke-static {v4, v5, p1, v0}, Ljcifs/smb1/smb1/l;->x(J[BI)V

    add-int/lit8 v1, v0, 0x2

    iget v4, p0, Ljcifs/smb1/smb1/C;->X:I

    int-to-long v4, v4

    invoke-static {v4, v5, p1, v1}, Ljcifs/smb1/smb1/l;->x(J[BI)V

    add-int/lit8 v1, v0, 0x4

    iget-byte v4, p0, Ljcifs/smb1/smb1/l;->c:B

    if-ne v4, v3, :cond_1

    iget v4, p0, Ljcifs/smb1/smb1/C;->Y:I

    int-to-long v4, v4

    invoke-static {v4, v5, p1, v1}, Ljcifs/smb1/smb1/l;->x(J[BI)V

    add-int/lit8 v1, v0, 0x6

    :cond_1
    iget v0, p0, Ljcifs/smb1/smb1/C;->Z:I

    int-to-long v4, v0

    invoke-static {v4, v5, p1, v1}, Ljcifs/smb1/smb1/l;->x(J[BI)V

    add-int/lit8 v0, v1, 0x2

    iget v4, p0, Ljcifs/smb1/smb1/C;->Z:I

    if-nez v4, :cond_2

    move v4, v2

    goto :goto_0

    :cond_2
    iget v4, p0, Ljcifs/smb1/smb1/C;->f1:I

    :goto_0
    int-to-long v4, v4

    invoke-static {v4, v5, p1, v0}, Ljcifs/smb1/smb1/l;->x(J[BI)V

    add-int/lit8 v0, v1, 0x4

    iget-byte v4, p0, Ljcifs/smb1/smb1/l;->c:B

    if-ne v4, v3, :cond_3

    iget v2, p0, Ljcifs/smb1/smb1/C;->g1:I

    int-to-long v2, v2

    invoke-static {v2, v3, p1, v0}, Ljcifs/smb1/smb1/l;->x(J[BI)V

    add-int/lit8 v1, v1, 0x6

    goto :goto_1

    :cond_3
    add-int/lit8 v3, v1, 0x5

    iget v4, p0, Ljcifs/smb1/smb1/C;->n1:I

    int-to-byte v4, v4

    aput-byte v4, p1, v0

    add-int/lit8 v1, v1, 0x6

    aput-byte v2, p1, v3

    invoke-virtual {p0, p1, v1}, Ljcifs/smb1/smb1/C;->G([BI)I

    move-result p1

    add-int/2addr v1, p1

    :goto_1
    sub-int/2addr v1, p2

    return v1
.end method

.method abstract E([BI)I
.end method

.method abstract F([BI)I
.end method

.method abstract G([BI)I
.end method

.method h([BI)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public hasMoreElements()Z
    .locals 1

    iget-boolean v0, p0, Ljcifs/smb1/smb1/C;->E:Z

    return v0
.end method

.method m([BI)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public nextElement()Ljava/lang/Object;
    .locals 5

    iget-boolean v0, p0, Ljcifs/smb1/smb1/C;->F:Z

    const/16 v1, -0x60

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    iput-boolean v2, p0, Ljcifs/smb1/smb1/C;->F:Z

    iget v0, p0, Ljcifs/smb1/smb1/C;->I:I

    iget v3, p0, Ljcifs/smb1/smb1/C;->n1:I

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v0, v3

    add-int/lit8 v3, v0, 0x2

    iput v3, p0, Ljcifs/smb1/smb1/C;->X:I

    iget-byte v3, p0, Ljcifs/smb1/smb1/l;->c:B

    if-eq v3, v1, :cond_0

    const/16 v0, 0x25

    if-ne v3, v0, :cond_1

    invoke-virtual {p0}, Ljcifs/smb1/smb1/l;->g()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Ljcifs/smb1/smb1/C;->X:I

    iget-object v1, p0, Ljcifs/smb1/smb1/C;->p1:Ljava/lang/String;

    invoke-virtual {p0, v1, v0}, Ljcifs/smb1/smb1/l;->u(Ljava/lang/String;I)I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Ljcifs/smb1/smb1/C;->X:I

    goto :goto_0

    :cond_0
    if-ne v3, v1, :cond_1

    add-int/lit8 v0, v0, 0x4

    iput v0, p0, Ljcifs/smb1/smb1/C;->X:I

    :cond_1
    :goto_0
    iget v0, p0, Ljcifs/smb1/smb1/C;->X:I

    rem-int/lit8 v1, v0, 0x2

    iput v1, p0, Ljcifs/smb1/smb1/C;->C:I

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_1

    :cond_2
    rsub-int/lit8 v1, v1, 0x2

    :goto_1
    iput v1, p0, Ljcifs/smb1/smb1/C;->C:I

    add-int/2addr v0, v1

    iput v0, p0, Ljcifs/smb1/smb1/C;->X:I

    iget-object v0, p0, Ljcifs/smb1/smb1/C;->r1:[B

    iget v1, p0, Ljcifs/smb1/smb1/C;->G:I

    invoke-virtual {p0, v0, v1}, Ljcifs/smb1/smb1/C;->F([BI)I

    move-result v0

    iput v0, p0, Ljcifs/smb1/smb1/C;->h1:I

    iput v0, p0, Ljcifs/smb1/smb1/C;->H:I

    iget v1, p0, Ljcifs/smb1/smb1/C;->q1:I

    iget v3, p0, Ljcifs/smb1/smb1/C;->X:I

    sub-int/2addr v1, v3

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Ljcifs/smb1/smb1/C;->N:I

    sub-int/2addr v1, v0

    iget v3, p0, Ljcifs/smb1/smb1/C;->X:I

    add-int/2addr v3, v0

    iput v3, p0, Ljcifs/smb1/smb1/C;->f1:I

    rem-int/lit8 v0, v3, 0x2

    iput v0, p0, Ljcifs/smb1/smb1/C;->D:I

    if-nez v0, :cond_3

    move v0, v2

    goto :goto_2

    :cond_3
    rsub-int/lit8 v0, v0, 0x2

    :goto_2
    iput v0, p0, Ljcifs/smb1/smb1/C;->D:I

    add-int/2addr v3, v0

    iput v3, p0, Ljcifs/smb1/smb1/C;->f1:I

    iget-object v0, p0, Ljcifs/smb1/smb1/C;->r1:[B

    iget v3, p0, Ljcifs/smb1/smb1/C;->H:I

    invoke-virtual {p0, v0, v3}, Ljcifs/smb1/smb1/C;->E([BI)I

    move-result v0

    iput v0, p0, Ljcifs/smb1/smb1/C;->i1:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Ljcifs/smb1/smb1/C;->Z:I

    goto :goto_6

    :cond_4
    iget-byte v0, p0, Ljcifs/smb1/smb1/l;->c:B

    if-eq v0, v1, :cond_5

    const/16 v0, 0x26

    iput-byte v0, p0, Ljcifs/smb1/smb1/l;->c:B

    goto :goto_3

    :cond_5
    const/16 v0, -0x5f

    iput-byte v0, p0, Ljcifs/smb1/smb1/l;->c:B

    :goto_3
    const/16 v0, 0x33

    iput v0, p0, Ljcifs/smb1/smb1/C;->X:I

    iget v1, p0, Ljcifs/smb1/smb1/C;->h1:I

    iget v3, p0, Ljcifs/smb1/smb1/C;->Y:I

    sub-int v4, v1, v3

    if-lez v4, :cond_7

    const/16 v4, 0x33

    rem-int/lit8 v4, v4, 0x2

    iput v4, p0, Ljcifs/smb1/smb1/C;->C:I

    if-nez v4, :cond_6

    move v4, v2

    goto :goto_4

    :cond_6
    rsub-int/lit8 v4, v4, 0x2

    :goto_4
    iput v4, p0, Ljcifs/smb1/smb1/C;->C:I

    add-int/2addr v0, v4

    iput v0, p0, Ljcifs/smb1/smb1/C;->X:I

    :cond_7
    iget v0, p0, Ljcifs/smb1/smb1/C;->N:I

    add-int/2addr v3, v0

    iput v3, p0, Ljcifs/smb1/smb1/C;->Y:I

    iget v0, p0, Ljcifs/smb1/smb1/C;->q1:I

    iget v4, p0, Ljcifs/smb1/smb1/C;->X:I

    sub-int/2addr v0, v4

    iget v4, p0, Ljcifs/smb1/smb1/C;->C:I

    sub-int/2addr v0, v4

    sub-int/2addr v1, v3

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v1

    iput v1, p0, Ljcifs/smb1/smb1/C;->N:I

    sub-int/2addr v0, v1

    iget v3, p0, Ljcifs/smb1/smb1/C;->X:I

    add-int/2addr v3, v1

    iput v3, p0, Ljcifs/smb1/smb1/C;->f1:I

    rem-int/lit8 v1, v3, 0x2

    iput v1, p0, Ljcifs/smb1/smb1/C;->D:I

    if-nez v1, :cond_8

    move v1, v2

    goto :goto_5

    :cond_8
    rsub-int/lit8 v1, v1, 0x2

    :goto_5
    iput v1, p0, Ljcifs/smb1/smb1/C;->D:I

    add-int/2addr v3, v1

    iput v3, p0, Ljcifs/smb1/smb1/C;->f1:I

    iget v3, p0, Ljcifs/smb1/smb1/C;->g1:I

    iget v4, p0, Ljcifs/smb1/smb1/C;->Z:I

    add-int/2addr v3, v4

    iput v3, p0, Ljcifs/smb1/smb1/C;->g1:I

    sub-int/2addr v0, v1

    iget v1, p0, Ljcifs/smb1/smb1/C;->i1:I

    sub-int/2addr v1, v3

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Ljcifs/smb1/smb1/C;->Z:I

    :goto_6
    iget v0, p0, Ljcifs/smb1/smb1/C;->Y:I

    iget v1, p0, Ljcifs/smb1/smb1/C;->N:I

    add-int/2addr v0, v1

    iget v1, p0, Ljcifs/smb1/smb1/C;->h1:I

    if-lt v0, v1, :cond_9

    iget v0, p0, Ljcifs/smb1/smb1/C;->g1:I

    iget v1, p0, Ljcifs/smb1/smb1/C;->Z:I

    add-int/2addr v0, v1

    iget v1, p0, Ljcifs/smb1/smb1/C;->i1:I

    if-lt v0, v1, :cond_9

    iput-boolean v2, p0, Ljcifs/smb1/smb1/C;->E:Z

    :cond_9
    return-object p0
.end method

.method t()V
    .locals 1

    invoke-super {p0}, Ljcifs/smb1/smb1/l;->t()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Ljcifs/smb1/smb1/C;->E:Z

    iput-boolean v0, p0, Ljcifs/smb1/smb1/C;->F:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ljcifs/smb1/smb1/l;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",totalParameterCount="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/C;->h1:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",totalDataCount="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/C;->i1:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",maxParameterCount="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/C;->j1:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",maxDataCount="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/C;->k1:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",maxSetupCount="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v2, p0, Ljcifs/smb1/smb1/C;->l1:B

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",flags=0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/C;->B:I

    const/4 v3, 0x2

    invoke-static {v2, v3}, LUg/d;->c(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",timeout="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/C;->m1:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",parameterCount="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/C;->N:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",parameterOffset="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/C;->X:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",parameterDisplacement="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/C;->Y:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",dataCount="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/C;->Z:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",dataOffset="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/C;->f1:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",dataDisplacement="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/C;->g1:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",setupCount="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/C;->n1:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",pad="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/C;->C:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",pad1="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljcifs/smb1/smb1/C;->D:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method v([BI)I
    .locals 5

    iget v0, p0, Ljcifs/smb1/smb1/C;->C:I

    iget-byte v1, p0, Ljcifs/smb1/smb1/l;->c:B

    const/16 v2, 0x25

    if-ne v1, v2, :cond_0

    invoke-virtual {p0}, Ljcifs/smb1/smb1/l;->g()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Ljcifs/smb1/smb1/C;->p1:Ljava/lang/String;

    invoke-virtual {p0, v1, p1, p2}, Ljcifs/smb1/smb1/l;->B(Ljava/lang/String;[BI)I

    move-result v1

    add-int/2addr v1, p2

    goto :goto_0

    :cond_0
    move v1, p2

    :goto_0
    iget v2, p0, Ljcifs/smb1/smb1/C;->N:I

    const/4 v3, 0x0

    if-lez v2, :cond_2

    :goto_1
    add-int/lit8 v2, v0, -0x1

    if-lez v0, :cond_1

    add-int/lit8 v0, v1, 0x1

    aput-byte v3, p1, v1

    move v1, v0

    move v0, v2

    goto :goto_1

    :cond_1
    iget-object v0, p0, Ljcifs/smb1/smb1/C;->r1:[B

    iget v2, p0, Ljcifs/smb1/smb1/C;->G:I

    iget v4, p0, Ljcifs/smb1/smb1/C;->N:I

    invoke-static {v0, v2, p1, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v0, p0, Ljcifs/smb1/smb1/C;->N:I

    add-int/2addr v1, v0

    :cond_2
    iget v0, p0, Ljcifs/smb1/smb1/C;->Z:I

    if-lez v0, :cond_4

    iget v0, p0, Ljcifs/smb1/smb1/C;->D:I

    :goto_2
    add-int/lit8 v2, v0, -0x1

    if-lez v0, :cond_3

    add-int/lit8 v0, v1, 0x1

    aput-byte v3, p1, v1

    move v1, v0

    move v0, v2

    goto :goto_2

    :cond_3
    iget-object v0, p0, Ljcifs/smb1/smb1/C;->r1:[B

    iget v2, p0, Ljcifs/smb1/smb1/C;->H:I

    iget v3, p0, Ljcifs/smb1/smb1/C;->Z:I

    invoke-static {v0, v2, p1, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Ljcifs/smb1/smb1/C;->H:I

    iget v0, p0, Ljcifs/smb1/smb1/C;->Z:I

    add-int/2addr p1, v0

    iput p1, p0, Ljcifs/smb1/smb1/C;->H:I

    add-int/2addr v1, v0

    :cond_4
    sub-int/2addr v1, p2

    return v1
.end method
