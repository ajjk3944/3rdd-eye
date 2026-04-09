.class public Ljcifs/smb1/smb1/N;
.super Ljava/io/InputStream;
.source "SourceFile"


# instance fields
.field private a:J

.field private b:I

.field private c:I

.field private d:I

.field private e:[B

.field f:Ljcifs/smb1/smb1/M;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljcifs/smb1/smb1/M;

    invoke-direct {v0, p1}, Ljcifs/smb1/smb1/M;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Ljcifs/smb1/smb1/N;-><init>(Ljcifs/smb1/smb1/M;)V

    return-void
.end method

.method public constructor <init>(Ljcifs/smb1/smb1/M;)V
    .locals 1

    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, v0}, Ljcifs/smb1/smb1/N;-><init>(Ljcifs/smb1/smb1/M;I)V

    return-void
.end method

.method constructor <init>(Ljcifs/smb1/smb1/M;I)V
    .locals 3

    .line 3
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 v0, 0x1

    .line 4
    new-array v0, v0, [B

    iput-object v0, p0, Ljcifs/smb1/smb1/N;->e:[B

    .line 5
    iput-object p1, p0, Ljcifs/smb1/smb1/N;->f:Ljcifs/smb1/smb1/M;

    const v0, 0xffff

    and-int v1, p2, v0

    .line 6
    iput v1, p0, Ljcifs/smb1/smb1/N;->c:I

    ushr-int/lit8 v1, p2, 0x10

    and-int/2addr v0, v1

    .line 7
    iput v0, p0, Ljcifs/smb1/smb1/N;->d:I

    .line 8
    iget v1, p1, Ljcifs/smb1/smb1/M;->q:I

    const/16 v2, 0x10

    if-eq v1, v2, :cond_0

    const/16 v1, 0x80

    const/4 v2, 0x0

    .line 9
    invoke-virtual {p1, p2, v0, v1, v2}, Ljcifs/smb1/smb1/M;->t(IIII)V

    .line 10
    iget p2, p0, Ljcifs/smb1/smb1/N;->c:I

    and-int/lit8 p2, p2, -0x51

    iput p2, p0, Ljcifs/smb1/smb1/N;->c:I

    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p1}, Ljcifs/smb1/smb1/M;->e()V

    .line 12
    :goto_0
    iget-object p1, p1, Ljcifs/smb1/smb1/M;->n:Ljcifs/smb1/smb1/S;

    iget-object p1, p1, Ljcifs/smb1/smb1/S;->f:Ljcifs/smb1/smb1/P;

    iget-object p1, p1, Ljcifs/smb1/smb1/P;->h:Ljcifs/smb1/smb1/Q;

    iget p2, p1, Ljcifs/smb1/smb1/Q;->z:I

    add-int/lit8 p2, p2, -0x46

    iget-object p1, p1, Ljcifs/smb1/smb1/Q;->v:Ljcifs/smb1/smb1/Q$a;

    iget p1, p1, Ljcifs/smb1/smb1/Q$a;->b:I

    add-int/lit8 p1, p1, -0x46

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Ljcifs/smb1/smb1/N;->b:I

    return-void
.end method


# virtual methods
.method public a([BII)I
    .locals 17

    move-object/from16 v1, p0

    move/from16 v0, p2

    move/from16 v2, p3

    const/4 v3, 0x0

    if-gtz v2, :cond_0

    return v3

    :cond_0
    iget-wide v4, v1, Ljcifs/smb1/smb1/N;->a:J

    iget-object v6, v1, Ljcifs/smb1/smb1/N;->e:[B

    if-eqz v6, :cond_b

    iget-object v6, v1, Ljcifs/smb1/smb1/N;->f:Ljcifs/smb1/smb1/M;

    iget v7, v1, Ljcifs/smb1/smb1/N;->c:I

    iget v8, v1, Ljcifs/smb1/smb1/N;->d:I

    const/16 v9, 0x80

    invoke-virtual {v6, v7, v8, v9, v3}, Ljcifs/smb1/smb1/M;->t(IIII)V

    sget-object v3, Ljcifs/smb1/smb1/M;->y:Ljcifs/smb1/smb1/d;

    sget v3, LUg/e;->b:I

    const/4 v6, 0x4

    if-lt v3, v6, :cond_1

    sget-object v3, Ljcifs/smb1/smb1/M;->v:LUg/e;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "read: fid="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v8, v1, Ljcifs/smb1/smb1/N;->f:Ljcifs/smb1/smb1/M;

    iget v8, v8, Ljcifs/smb1/smb1/M;->p:I

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, ",off="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, ",len="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_1
    new-instance v3, Ljcifs/smb1/smb1/z;

    move-object/from16 v7, p1

    invoke-direct {v3, v7, v0}, Ljcifs/smb1/smb1/z;-><init>([BI)V

    iget-object v0, v1, Ljcifs/smb1/smb1/N;->f:Ljcifs/smb1/smb1/M;

    iget v0, v0, Ljcifs/smb1/smb1/M;->q:I

    const-wide/16 v7, 0x0

    const/16 v9, 0x10

    if-ne v0, v9, :cond_2

    iput-wide v7, v3, Ljcifs/smb1/smb1/l;->s:J

    :cond_2
    :goto_0
    iget v0, v1, Ljcifs/smb1/smb1/N;->b:I

    if-le v2, v0, :cond_3

    goto :goto_1

    :cond_3
    move v0, v2

    :goto_1
    sget-object v10, Ljcifs/smb1/smb1/M;->y:Ljcifs/smb1/smb1/d;

    sget v10, LUg/e;->b:I

    if-lt v10, v6, :cond_4

    sget-object v10, Ljcifs/smb1/smb1/M;->v:LUg/e;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "read: len="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v12, ",r="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v12, ",fp="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v12, v1, Ljcifs/smb1/smb1/N;->a:J

    invoke-virtual {v11, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_4
    :try_start_0
    new-instance v15, Ljcifs/smb1/smb1/y;

    iget-object v10, v1, Ljcifs/smb1/smb1/N;->f:Ljcifs/smb1/smb1/M;

    iget v11, v10, Ljcifs/smb1/smb1/M;->p:I

    iget-wide v12, v1, Ljcifs/smb1/smb1/N;->a:J

    const/16 v16, 0x0

    move-object v10, v15

    move v14, v0

    move-object v6, v15

    move-object/from16 v15, v16

    invoke-direct/range {v10 .. v15}, Ljcifs/smb1/smb1/y;-><init>(IJILjcifs/smb1/smb1/l;)V

    iget-object v10, v1, Ljcifs/smb1/smb1/N;->f:Ljcifs/smb1/smb1/M;

    iget v11, v10, Ljcifs/smb1/smb1/M;->q:I

    if-ne v11, v9, :cond_5

    const/16 v11, 0x400

    iput v11, v6, Ljcifs/smb1/smb1/y;->J:I

    iput v11, v6, Ljcifs/smb1/smb1/y;->H:I

    iput v11, v6, Ljcifs/smb1/smb1/y;->I:I

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_5

    :cond_5
    :goto_2
    invoke-virtual {v10, v6, v3}, Ljcifs/smb1/smb1/M;->z(Ljcifs/smb1/smb1/l;Ljcifs/smb1/smb1/l;)V
    :try_end_0
    .catch Ljcifs/smb1/smb1/SmbException; {:try_start_0 .. :try_end_0} :catch_0

    iget v6, v3, Ljcifs/smb1/smb1/z;->H:I

    if-gtz v6, :cond_7

    iget-wide v2, v1, Ljcifs/smb1/smb1/N;->a:J

    sub-long v9, v2, v4

    cmp-long v0, v9, v7

    if-lez v0, :cond_6

    sub-long/2addr v2, v4

    goto :goto_3

    :cond_6
    const-wide/16 v2, -0x1

    :goto_3
    long-to-int v0, v2

    return v0

    :cond_7
    iget-wide v10, v1, Ljcifs/smb1/smb1/N;->a:J

    int-to-long v12, v6

    add-long/2addr v10, v12

    iput-wide v10, v1, Ljcifs/smb1/smb1/N;->a:J

    sub-int/2addr v2, v6

    iget v12, v3, Ljcifs/smb1/smb1/z;->F:I

    add-int/2addr v12, v6

    iput v12, v3, Ljcifs/smb1/smb1/z;->F:I

    if-lez v2, :cond_9

    if-eq v6, v0, :cond_8

    goto :goto_4

    :cond_8
    const/4 v6, 0x4

    goto :goto_0

    :cond_9
    :goto_4
    sub-long/2addr v10, v4

    long-to-int v0, v10

    return v0

    :goto_5
    iget-object v2, v1, Ljcifs/smb1/smb1/N;->f:Ljcifs/smb1/smb1/M;

    iget v2, v2, Ljcifs/smb1/smb1/M;->q:I

    if-ne v2, v9, :cond_a

    invoke-virtual {v0}, Ljcifs/smb1/smb1/SmbException;->d()I

    move-result v2

    const v3, -0x3ffffeb5    # -2.000079f

    if-ne v2, v3, :cond_a

    const/4 v0, -0x1

    return v0

    :cond_a
    invoke-virtual {v1, v0}, Ljcifs/smb1/smb1/N;->g(Ljcifs/smb1/smb1/SmbException;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    :cond_b
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Bad file descriptor"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public available()I
    .locals 3

    iget-object v0, p0, Ljcifs/smb1/smb1/N;->f:Ljcifs/smb1/smb1/M;

    iget v1, v0, Ljcifs/smb1/smb1/M;->q:I

    const/16 v2, 0x10

    if-eq v1, v2, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    :try_start_0
    invoke-static {v0}, Lf/d;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljcifs/smb1/smb1/SmbException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x0

    throw v0

    :catch_0
    move-exception v0

    invoke-virtual {p0, v0}, Ljcifs/smb1/smb1/N;->g(Ljcifs/smb1/smb1/SmbException;)Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method

.method public close()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Ljcifs/smb1/smb1/N;->f:Ljcifs/smb1/smb1/M;

    invoke-virtual {v0}, Ljcifs/smb1/smb1/M;->b()V

    const/4 v0, 0x0

    iput-object v0, p0, Ljcifs/smb1/smb1/N;->e:[B
    :try_end_0
    .catch Ljcifs/smb1/smb1/SmbException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {p0, v0}, Ljcifs/smb1/smb1/N;->g(Ljcifs/smb1/smb1/SmbException;)Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method

.method protected g(Ljcifs/smb1/smb1/SmbException;)Ljava/io/IOException;
    .locals 2

    invoke-virtual {p1}, Ljcifs/smb1/smb1/SmbException;->g()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v1, v0, Ljcifs/smb1/util/transport/TransportException;

    if-eqz v1, :cond_0

    move-object p1, v0

    check-cast p1, Ljcifs/smb1/util/transport/TransportException;

    invoke-virtual {p1}, Ljcifs/smb1/util/transport/TransportException;->a()Ljava/lang/Throwable;

    move-result-object v0

    :cond_0
    instance-of v1, v0, Ljava/lang/InterruptedException;

    if-eqz v1, :cond_1

    new-instance p1, Ljava/io/InterruptedIOException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_1
    return-object p1
.end method

.method public read()I
    .locals 3

    .line 1
    iget-object v0, p0, Ljcifs/smb1/smb1/N;->e:[B

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v2, v1}, Ljcifs/smb1/smb1/N;->read([BII)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    return v1

    .line 2
    :cond_0
    iget-object v0, p0, Ljcifs/smb1/smb1/N;->e:[B

    aget-byte v0, v0, v2

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public read([B)I
    .locals 2

    .line 3
    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Ljcifs/smb1/smb1/N;->read([BII)I

    move-result p1

    return p1
.end method

.method public read([BII)I
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2, p3}, Ljcifs/smb1/smb1/N;->a([BII)I

    move-result p1

    return p1
.end method

.method public skip(J)J
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_0

    iget-wide v0, p0, Ljcifs/smb1/smb1/N;->a:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Ljcifs/smb1/smb1/N;->a:J

    return-wide p1

    :cond_0
    return-wide v0
.end method
