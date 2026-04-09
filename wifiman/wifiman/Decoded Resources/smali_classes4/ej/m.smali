.class public final Lej/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lej/D;


# instance fields
.field private a:B

.field private final b:Lej/x;

.field private final c:Ljava/util/zip/Inflater;

.field private final d:Lej/n;

.field private final e:Ljava/util/zip/CRC32;


# direct methods
.method public constructor <init>(Lej/D;)V
    .locals 2

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lej/x;

    invoke-direct {v0, p1}, Lej/x;-><init>(Lej/D;)V

    iput-object v0, p0, Lej/m;->b:Lej/x;

    new-instance p1, Ljava/util/zip/Inflater;

    const/4 v1, 0x1

    invoke-direct {p1, v1}, Ljava/util/zip/Inflater;-><init>(Z)V

    iput-object p1, p0, Lej/m;->c:Ljava/util/zip/Inflater;

    new-instance v1, Lej/n;

    invoke-direct {v1, v0, p1}, Lej/n;-><init>(Lej/g;Ljava/util/zip/Inflater;)V

    iput-object v1, p0, Lej/m;->d:Lej/n;

    new-instance p1, Ljava/util/zip/CRC32;

    invoke-direct {p1}, Ljava/util/zip/CRC32;-><init>()V

    iput-object p1, p0, Lej/m;->e:Ljava/util/zip/CRC32;

    return-void
.end method

.method private final a(Ljava/lang/String;II)V
    .locals 1

    if-ne p3, p2, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/io/IOException;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    filled-new-array {p1, p3, p2}, [Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x3

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string p2, "%s: actual 0x%08x != expected 0x%08x"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "format(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final g()V
    .locals 17

    move-object/from16 v6, p0

    iget-object v0, v6, Lej/m;->b:Lej/x;

    const-wide/16 v1, 0xa

    invoke-virtual {v0, v1, v2}, Lej/x;->g0(J)V

    iget-object v0, v6, Lej/m;->b:Lej/x;

    iget-object v0, v0, Lej/x;->b:Lej/e;

    const-wide/16 v1, 0x3

    invoke-virtual {v0, v1, v2}, Lej/e;->f0(J)B

    move-result v7

    shr-int/lit8 v0, v7, 0x1

    const/4 v8, 0x1

    and-int/2addr v0, v8

    const/4 v9, 0x0

    if-ne v0, v8, :cond_0

    move v10, v8

    goto :goto_0

    :cond_0
    move v10, v9

    :goto_0
    if-eqz v10, :cond_1

    iget-object v0, v6, Lej/m;->b:Lej/x;

    iget-object v1, v0, Lej/x;->b:Lej/e;

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0xa

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v5}, Lej/m;->j(Lej/e;JJ)V

    :cond_1
    iget-object v0, v6, Lej/m;->b:Lej/x;

    invoke-virtual {v0}, Lej/x;->readShort()S

    move-result v0

    const-string v1, "ID1ID2"

    const/16 v2, 0x1f8b

    invoke-direct {v6, v1, v2, v0}, Lej/m;->a(Ljava/lang/String;II)V

    iget-object v0, v6, Lej/m;->b:Lej/x;

    const-wide/16 v1, 0x8

    invoke-virtual {v0, v1, v2}, Lej/x;->d(J)V

    shr-int/lit8 v0, v7, 0x2

    and-int/2addr v0, v8

    if-ne v0, v8, :cond_4

    iget-object v0, v6, Lej/m;->b:Lej/x;

    const-wide/16 v1, 0x2

    invoke-virtual {v0, v1, v2}, Lej/x;->g0(J)V

    if-eqz v10, :cond_2

    iget-object v0, v6, Lej/m;->b:Lej/x;

    iget-object v1, v0, Lej/x;->b:Lej/e;

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x2

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v5}, Lej/m;->j(Lej/e;JJ)V

    :cond_2
    iget-object v0, v6, Lej/m;->b:Lej/x;

    iget-object v0, v0, Lej/x;->b:Lej/e;

    invoke-virtual {v0}, Lej/e;->x0()S

    move-result v0

    const v1, 0xffff

    and-int/2addr v0, v1

    int-to-long v11, v0

    iget-object v0, v6, Lej/m;->b:Lej/x;

    invoke-virtual {v0, v11, v12}, Lej/x;->g0(J)V

    if-eqz v10, :cond_3

    iget-object v0, v6, Lej/m;->b:Lej/x;

    iget-object v1, v0, Lej/x;->b:Lej/e;

    const-wide/16 v2, 0x0

    move-object/from16 v0, p0

    move-wide v4, v11

    invoke-direct/range {v0 .. v5}, Lej/m;->j(Lej/e;JJ)V

    :cond_3
    iget-object v0, v6, Lej/m;->b:Lej/x;

    invoke-virtual {v0, v11, v12}, Lej/x;->d(J)V

    :cond_4
    shr-int/lit8 v0, v7, 0x3

    and-int/2addr v0, v8

    const-wide/16 v11, -0x1

    const-wide/16 v13, 0x1

    if-ne v0, v8, :cond_7

    iget-object v0, v6, Lej/m;->b:Lej/x;

    invoke-virtual {v0, v9}, Lej/x;->j0(B)J

    move-result-wide v15

    cmp-long v0, v15, v11

    if-eqz v0, :cond_6

    if-eqz v10, :cond_5

    iget-object v0, v6, Lej/m;->b:Lej/x;

    iget-object v1, v0, Lej/x;->b:Lej/e;

    const-wide/16 v2, 0x0

    add-long v4, v15, v13

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v5}, Lej/m;->j(Lej/e;JJ)V

    :cond_5
    iget-object v0, v6, Lej/m;->b:Lej/x;

    add-long v1, v15, v13

    invoke-virtual {v0, v1, v2}, Lej/x;->d(J)V

    goto :goto_1

    :cond_6
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    :cond_7
    :goto_1
    shr-int/lit8 v0, v7, 0x4

    and-int/2addr v0, v8

    if-ne v0, v8, :cond_a

    iget-object v0, v6, Lej/m;->b:Lej/x;

    invoke-virtual {v0, v9}, Lej/x;->j0(B)J

    move-result-wide v7

    cmp-long v0, v7, v11

    if-eqz v0, :cond_9

    if-eqz v10, :cond_8

    iget-object v0, v6, Lej/m;->b:Lej/x;

    iget-object v1, v0, Lej/x;->b:Lej/e;

    const-wide/16 v2, 0x0

    add-long v4, v7, v13

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v5}, Lej/m;->j(Lej/e;JJ)V

    :cond_8
    iget-object v0, v6, Lej/m;->b:Lej/x;

    add-long/2addr v7, v13

    invoke-virtual {v0, v7, v8}, Lej/x;->d(J)V

    goto :goto_2

    :cond_9
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    :cond_a
    :goto_2
    if-eqz v10, :cond_b

    iget-object v0, v6, Lej/m;->b:Lej/x;

    invoke-virtual {v0}, Lej/x;->s()S

    move-result v0

    iget-object v1, v6, Lej/m;->e:Ljava/util/zip/CRC32;

    invoke-virtual {v1}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v1

    long-to-int v1, v1

    int-to-short v1, v1

    const-string v2, "FHCRC"

    invoke-direct {v6, v2, v0, v1}, Lej/m;->a(Ljava/lang/String;II)V

    iget-object v0, v6, Lej/m;->e:Ljava/util/zip/CRC32;

    invoke-virtual {v0}, Ljava/util/zip/CRC32;->reset()V

    :cond_b
    return-void
.end method

.method private final h()V
    .locals 3

    iget-object v0, p0, Lej/m;->b:Lej/x;

    invoke-virtual {v0}, Lej/x;->p()I

    move-result v0

    iget-object v1, p0, Lej/m;->e:Ljava/util/zip/CRC32;

    invoke-virtual {v1}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v1

    long-to-int v1, v1

    const-string v2, "CRC"

    invoke-direct {p0, v2, v0, v1}, Lej/m;->a(Ljava/lang/String;II)V

    iget-object v0, p0, Lej/m;->b:Lej/x;

    invoke-virtual {v0}, Lej/x;->p()I

    move-result v0

    iget-object v1, p0, Lej/m;->c:Ljava/util/zip/Inflater;

    invoke-virtual {v1}, Ljava/util/zip/Inflater;->getBytesWritten()J

    move-result-wide v1

    long-to-int v1, v1

    const-string v2, "ISIZE"

    invoke-direct {p0, v2, v0, v1}, Lej/m;->a(Ljava/lang/String;II)V

    return-void
.end method

.method private final j(Lej/e;JJ)V
    .locals 4

    iget-object p1, p1, Lej/e;->a:Lej/y;

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_0
    iget v0, p1, Lej/y;->c:I

    iget v1, p1, Lej/y;->b:I

    sub-int v2, v0, v1

    int-to-long v2, v2

    cmp-long v2, p2, v2

    if-ltz v2, :cond_0

    sub-int/2addr v0, v1

    int-to-long v0, v0

    sub-long/2addr p2, v0

    iget-object p1, p1, Lej/y;->f:Lej/y;

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    :goto_1
    const-wide/16 v0, 0x0

    cmp-long v2, p4, v0

    if-lez v2, :cond_1

    iget v2, p1, Lej/y;->b:I

    int-to-long v2, v2

    add-long/2addr v2, p2

    long-to-int p2, v2

    iget p3, p1, Lej/y;->c:I

    sub-int/2addr p3, p2

    int-to-long v2, p3

    invoke-static {v2, v3, p4, p5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int p3, v2

    iget-object v2, p0, Lej/m;->e:Ljava/util/zip/CRC32;

    iget-object v3, p1, Lej/y;->a:[B

    invoke-virtual {v2, v3, p2, p3}, Ljava/util/zip/CRC32;->update([BII)V

    int-to-long p2, p3

    sub-long/2addr p4, p2

    iget-object p1, p1, Lej/y;->f:Lej/y;

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    move-wide p2, v0

    goto :goto_1

    :cond_1
    return-void
.end method


# virtual methods
.method public U(Lej/e;J)J
    .locals 11

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_6

    if-nez v2, :cond_0

    return-wide v0

    :cond_0
    iget-byte v0, p0, Lej/m;->a:B

    const/4 v1, 0x1

    if-nez v0, :cond_1

    invoke-direct {p0}, Lej/m;->g()V

    iput-byte v1, p0, Lej/m;->a:B

    :cond_1
    iget-byte v0, p0, Lej/m;->a:B

    const/4 v2, 0x2

    const-wide/16 v3, -0x1

    if-ne v0, v1, :cond_3

    invoke-virtual {p1}, Lej/e;->D0()J

    move-result-wide v7

    iget-object v0, p0, Lej/m;->d:Lej/n;

    invoke-virtual {v0, p1, p2, p3}, Lej/n;->U(Lej/e;J)J

    move-result-wide p2

    cmp-long v0, p2, v3

    if-eqz v0, :cond_2

    move-object v5, p0

    move-object v6, p1

    move-wide v9, p2

    invoke-direct/range {v5 .. v10}, Lej/m;->j(Lej/e;JJ)V

    return-wide p2

    :cond_2
    iput-byte v2, p0, Lej/m;->a:B

    :cond_3
    iget-byte p1, p0, Lej/m;->a:B

    if-ne p1, v2, :cond_5

    invoke-direct {p0}, Lej/m;->h()V

    const/4 p1, 0x3

    iput-byte p1, p0, Lej/m;->a:B

    iget-object p1, p0, Lej/m;->b:Lej/x;

    invoke-virtual {p1}, Lej/x;->t()Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_0

    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string p2, "gzip finished without exhausting source"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_0
    return-wide v3

    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "byteCount < 0: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public c()Lej/E;
    .locals 1

    iget-object v0, p0, Lej/m;->b:Lej/x;

    invoke-virtual {v0}, Lej/x;->c()Lej/E;

    move-result-object v0

    return-object v0
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lej/m;->d:Lej/n;

    invoke-virtual {v0}, Lej/n;->close()V

    return-void
.end method
