.class public Ljcifs/smb1/smb1/O;
.super Ljava/io/OutputStream;
.source "SourceFile"


# instance fields
.field private a:Ljcifs/smb1/smb1/M;

.field private b:Z

.field private c:Z

.field private d:I

.field private e:I

.field private f:I

.field private g:J

.field private h:[B

.field private i:Ljcifs/smb1/smb1/I;

.field private j:Ljcifs/smb1/smb1/J;

.field private k:Ljcifs/smb1/smb1/H;

.field private l:Ljcifs/smb1/smb1/K;


# direct methods
.method public constructor <init>(Ljcifs/smb1/smb1/M;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Ljcifs/smb1/smb1/O;-><init>(Ljcifs/smb1/smb1/M;Z)V

    return-void
.end method

.method public constructor <init>(Ljcifs/smb1/smb1/M;Z)V
    .locals 1

    if-eqz p2, :cond_0

    const/16 v0, 0x16

    goto :goto_0

    :cond_0
    const/16 v0, 0x52

    .line 2
    :goto_0
    invoke-direct {p0, p1, p2, v0}, Ljcifs/smb1/smb1/O;-><init>(Ljcifs/smb1/smb1/M;ZI)V

    return-void
.end method

.method constructor <init>(Ljcifs/smb1/smb1/M;ZI)V
    .locals 2

    .line 3
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    const/4 v0, 0x1

    .line 4
    new-array v0, v0, [B

    iput-object v0, p0, Ljcifs/smb1/smb1/O;->h:[B

    .line 5
    iput-object p1, p0, Ljcifs/smb1/smb1/O;->a:Ljcifs/smb1/smb1/M;

    .line 6
    iput-boolean p2, p0, Ljcifs/smb1/smb1/O;->b:Z

    .line 7
    iput p3, p0, Ljcifs/smb1/smb1/O;->d:I

    ushr-int/lit8 v0, p3, 0x10

    const v1, 0xffff

    and-int/2addr v0, v1

    .line 8
    iput v0, p0, Ljcifs/smb1/smb1/O;->e:I

    if-eqz p2, :cond_0

    .line 9
    :try_start_0
    invoke-virtual {p1}, Ljcifs/smb1/smb1/M;->s()J

    move-result-wide v0

    iput-wide v0, p0, Ljcifs/smb1/smb1/O;->g:J
    :try_end_0
    .catch Ljcifs/smb1/smb1/SmbAuthException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljcifs/smb1/smb1/SmbException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    const-wide/16 v0, 0x0

    .line 10
    iput-wide v0, p0, Ljcifs/smb1/smb1/O;->g:J

    goto :goto_1

    .line 11
    :goto_0
    throw p1

    .line 12
    :cond_0
    :goto_1
    iget p2, p0, Ljcifs/smb1/smb1/O;->e:I

    or-int/lit8 p2, p2, 0x2

    const/16 v0, 0x80

    const/4 v1, 0x0

    invoke-virtual {p1, p3, p2, v0, v1}, Ljcifs/smb1/smb1/M;->t(IIII)V

    .line 13
    iget p2, p0, Ljcifs/smb1/smb1/O;->d:I

    and-int/lit8 p2, p2, -0x51

    iput p2, p0, Ljcifs/smb1/smb1/O;->d:I

    .line 14
    iget-object p1, p1, Ljcifs/smb1/smb1/M;->n:Ljcifs/smb1/smb1/S;

    iget-object p1, p1, Ljcifs/smb1/smb1/S;->f:Ljcifs/smb1/smb1/P;

    iget-object p1, p1, Ljcifs/smb1/smb1/P;->h:Ljcifs/smb1/smb1/Q;

    iget p2, p1, Ljcifs/smb1/smb1/Q;->y:I

    add-int/lit8 p2, p2, -0x46

    iput p2, p0, Ljcifs/smb1/smb1/O;->f:I

    const/16 p2, 0x10

    .line 15
    invoke-virtual {p1, p2}, Ljcifs/smb1/smb1/Q;->u(I)Z

    move-result p1

    iput-boolean p1, p0, Ljcifs/smb1/smb1/O;->c:Z

    if-eqz p1, :cond_1

    .line 16
    new-instance p1, Ljcifs/smb1/smb1/I;

    invoke-direct {p1}, Ljcifs/smb1/smb1/I;-><init>()V

    iput-object p1, p0, Ljcifs/smb1/smb1/O;->i:Ljcifs/smb1/smb1/I;

    .line 17
    new-instance p1, Ljcifs/smb1/smb1/J;

    invoke-direct {p1}, Ljcifs/smb1/smb1/J;-><init>()V

    iput-object p1, p0, Ljcifs/smb1/smb1/O;->j:Ljcifs/smb1/smb1/J;

    goto :goto_2

    .line 18
    :cond_1
    new-instance p1, Ljcifs/smb1/smb1/H;

    invoke-direct {p1}, Ljcifs/smb1/smb1/H;-><init>()V

    iput-object p1, p0, Ljcifs/smb1/smb1/O;->k:Ljcifs/smb1/smb1/H;

    .line 19
    new-instance p1, Ljcifs/smb1/smb1/K;

    invoke-direct {p1}, Ljcifs/smb1/smb1/K;-><init>()V

    iput-object p1, p0, Ljcifs/smb1/smb1/O;->l:Ljcifs/smb1/smb1/K;

    :goto_2
    return-void
.end method


# virtual methods
.method a()V
    .locals 5

    iget-object v0, p0, Ljcifs/smb1/smb1/O;->a:Ljcifs/smb1/smb1/M;

    invoke-virtual {v0}, Ljcifs/smb1/smb1/M;->q()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ljcifs/smb1/smb1/O;->a:Ljcifs/smb1/smb1/M;

    iget v1, p0, Ljcifs/smb1/smb1/O;->d:I

    iget v2, p0, Ljcifs/smb1/smb1/O;->e:I

    or-int/lit8 v2, v2, 0x2

    const/16 v3, 0x80

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Ljcifs/smb1/smb1/M;->t(IIII)V

    iget-boolean v0, p0, Ljcifs/smb1/smb1/O;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljcifs/smb1/smb1/O;->a:Ljcifs/smb1/smb1/M;

    invoke-virtual {v0}, Ljcifs/smb1/smb1/M;->s()J

    move-result-wide v0

    iput-wide v0, p0, Ljcifs/smb1/smb1/O;->g:J

    :cond_0
    return-void
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Ljcifs/smb1/smb1/O;->a:Ljcifs/smb1/smb1/M;

    invoke-virtual {v0}, Ljcifs/smb1/smb1/M;->b()V

    const/4 v0, 0x0

    iput-object v0, p0, Ljcifs/smb1/smb1/O;->h:[B

    return-void
.end method

.method public g([BIII)V
    .locals 10

    if-gtz p3, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ljcifs/smb1/smb1/O;->h:[B

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Ljcifs/smb1/smb1/O;->a()V

    sget-object v0, Ljcifs/smb1/smb1/M;->y:Ljcifs/smb1/smb1/d;

    sget v0, LUg/e;->b:I

    const/4 v1, 0x4

    if-lt v0, v1, :cond_1

    sget-object v0, Ljcifs/smb1/smb1/M;->v:LUg/e;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "write: fid="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ljcifs/smb1/smb1/O;->a:Ljcifs/smb1/smb1/M;

    iget v2, v2, Ljcifs/smb1/smb1/M;->p:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",off="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",len="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_1
    iget v0, p0, Ljcifs/smb1/smb1/O;->f:I

    if-le p3, v0, :cond_2

    goto :goto_0

    :cond_2
    move v0, p3

    :goto_0
    iget-boolean v1, p0, Ljcifs/smb1/smb1/O;->c:Z

    if-eqz v1, :cond_4

    iget-object v2, p0, Ljcifs/smb1/smb1/O;->i:Ljcifs/smb1/smb1/I;

    iget-object v1, p0, Ljcifs/smb1/smb1/O;->a:Ljcifs/smb1/smb1/M;

    iget v3, v1, Ljcifs/smb1/smb1/M;->p:I

    iget-wide v4, p0, Ljcifs/smb1/smb1/O;->g:J

    sub-int v6, p3, v0

    move-object v7, p1

    move v8, p2

    move v9, v0

    invoke-virtual/range {v2 .. v9}, Ljcifs/smb1/smb1/I;->H(IJI[BII)V

    and-int/lit8 v1, p4, 0x1

    if-eqz v1, :cond_3

    iget-object v2, p0, Ljcifs/smb1/smb1/O;->i:Ljcifs/smb1/smb1/I;

    iget-object v1, p0, Ljcifs/smb1/smb1/O;->a:Ljcifs/smb1/smb1/M;

    iget v3, v1, Ljcifs/smb1/smb1/M;->p:I

    iget-wide v4, p0, Ljcifs/smb1/smb1/O;->g:J

    move v6, p3

    move-object v7, p1

    move v8, p2

    move v9, v0

    invoke-virtual/range {v2 .. v9}, Ljcifs/smb1/smb1/I;->H(IJI[BII)V

    iget-object v0, p0, Ljcifs/smb1/smb1/O;->i:Ljcifs/smb1/smb1/I;

    const/16 v1, 0x8

    iput v1, v0, Ljcifs/smb1/smb1/I;->Y:I

    goto :goto_1

    :cond_3
    iget-object v0, p0, Ljcifs/smb1/smb1/O;->i:Ljcifs/smb1/smb1/I;

    const/4 v1, 0x0

    iput v1, v0, Ljcifs/smb1/smb1/I;->Y:I

    :goto_1
    iget-object v0, p0, Ljcifs/smb1/smb1/O;->a:Ljcifs/smb1/smb1/M;

    iget-object v1, p0, Ljcifs/smb1/smb1/O;->i:Ljcifs/smb1/smb1/I;

    iget-object v2, p0, Ljcifs/smb1/smb1/O;->j:Ljcifs/smb1/smb1/J;

    invoke-virtual {v0, v1, v2}, Ljcifs/smb1/smb1/M;->z(Ljcifs/smb1/smb1/l;Ljcifs/smb1/smb1/l;)V

    iget-wide v0, p0, Ljcifs/smb1/smb1/O;->g:J

    iget-object v2, p0, Ljcifs/smb1/smb1/O;->j:Ljcifs/smb1/smb1/J;

    iget-wide v2, v2, Ljcifs/smb1/smb1/J;->E:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Ljcifs/smb1/smb1/O;->g:J

    int-to-long v0, p3

    sub-long/2addr v0, v2

    long-to-int p3, v0

    int-to-long v0, p2

    add-long/2addr v0, v2

    long-to-int p2, v0

    goto :goto_2

    :cond_4
    iget-object v2, p0, Ljcifs/smb1/smb1/O;->k:Ljcifs/smb1/smb1/H;

    iget-object v1, p0, Ljcifs/smb1/smb1/O;->a:Ljcifs/smb1/smb1/M;

    iget v3, v1, Ljcifs/smb1/smb1/M;->p:I

    iget-wide v4, p0, Ljcifs/smb1/smb1/O;->g:J

    sub-int v6, p3, v0

    move-object v7, p1

    move v8, p2

    move v9, v0

    invoke-virtual/range {v2 .. v9}, Ljcifs/smb1/smb1/H;->E(IJI[BII)V

    iget-wide v0, p0, Ljcifs/smb1/smb1/O;->g:J

    iget-object v2, p0, Ljcifs/smb1/smb1/O;->l:Ljcifs/smb1/smb1/K;

    iget-wide v3, v2, Ljcifs/smb1/smb1/K;->B:J

    add-long/2addr v0, v3

    iput-wide v0, p0, Ljcifs/smb1/smb1/O;->g:J

    int-to-long v0, p3

    sub-long/2addr v0, v3

    long-to-int p3, v0

    int-to-long v0, p2

    add-long/2addr v0, v3

    long-to-int p2, v0

    iget-object v0, p0, Ljcifs/smb1/smb1/O;->a:Ljcifs/smb1/smb1/M;

    iget-object v1, p0, Ljcifs/smb1/smb1/O;->k:Ljcifs/smb1/smb1/H;

    invoke-virtual {v0, v1, v2}, Ljcifs/smb1/smb1/M;->z(Ljcifs/smb1/smb1/l;Ljcifs/smb1/smb1/l;)V

    :goto_2
    if-gtz p3, :cond_1

    return-void

    :cond_5
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Bad file descriptor"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public write(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Ljcifs/smb1/smb1/O;->h:[B

    int-to-byte p1, p1

    const/4 v1, 0x0

    aput-byte p1, v0, v1

    const/4 p1, 0x1

    .line 2
    invoke-virtual {p0, v0, v1, p1}, Ljcifs/smb1/smb1/O;->write([BII)V

    return-void
.end method

.method public write([B)V
    .locals 2

    .line 3
    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Ljcifs/smb1/smb1/O;->write([BII)V

    return-void
.end method

.method public write([BII)V
    .locals 1

    .line 4
    iget-object v0, p0, Ljcifs/smb1/smb1/O;->a:Ljcifs/smb1/smb1/M;

    invoke-virtual {v0}, Ljcifs/smb1/smb1/M;->q()Z

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, p1, p2, p3, v0}, Ljcifs/smb1/smb1/O;->g([BIII)V

    return-void
.end method
