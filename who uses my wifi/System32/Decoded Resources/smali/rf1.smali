.class public final Lrf1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:J

.field public final k:Lvq2;

.field public final l:Lwn1;


# direct methods
.method public constructor <init>(IIIIIIIJLvq2;Lwn1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lrf1;->a:I

    iput p2, p0, Lrf1;->b:I

    iput p3, p0, Lrf1;->c:I

    iput p4, p0, Lrf1;->d:I

    iput p5, p0, Lrf1;->e:I

    invoke-static {p5}, Lrf1;->c(I)I

    move-result p1

    iput p1, p0, Lrf1;->f:I

    iput p6, p0, Lrf1;->g:I

    iput p7, p0, Lrf1;->h:I

    invoke-static {p7}, Lrf1;->d(I)I

    move-result p1

    iput p1, p0, Lrf1;->i:I

    iput-wide p8, p0, Lrf1;->j:J

    iput-object p10, p0, Lrf1;->k:Lvq2;

    iput-object p11, p0, Lrf1;->l:Lwn1;

    return-void
.end method

.method public constructor <init>(I[B)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Llg1;

    array-length v1, p2

    invoke-direct {v0, v1, p2}, Llg1;-><init>(I[B)V

    mul-int/lit8 p1, p1, 0x8

    .line 3
    invoke-virtual {v0, p1}, Llg1;->l(I)V

    const/16 p1, 0x10

    .line 4
    invoke-virtual {v0, p1}, Llg1;->r(I)I

    move-result p2

    iput p2, p0, Lrf1;->a:I

    .line 5
    invoke-virtual {v0, p1}, Llg1;->r(I)I

    move-result p1

    iput p1, p0, Lrf1;->b:I

    const/16 p1, 0x18

    .line 6
    invoke-virtual {v0, p1}, Llg1;->r(I)I

    move-result p2

    iput p2, p0, Lrf1;->c:I

    .line 7
    invoke-virtual {v0, p1}, Llg1;->r(I)I

    move-result p1

    iput p1, p0, Lrf1;->d:I

    const/16 p1, 0x14

    .line 8
    invoke-virtual {v0, p1}, Llg1;->r(I)I

    move-result p1

    iput p1, p0, Lrf1;->e:I

    invoke-static {p1}, Lrf1;->c(I)I

    move-result p1

    iput p1, p0, Lrf1;->f:I

    const/4 p1, 0x3

    .line 9
    invoke-virtual {v0, p1}, Llg1;->r(I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lrf1;->g:I

    const/4 p1, 0x5

    .line 10
    invoke-virtual {v0, p1}, Llg1;->r(I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lrf1;->h:I

    invoke-static {p1}, Lrf1;->d(I)I

    move-result p1

    iput p1, p0, Lrf1;->i:I

    const/16 p1, 0x24

    .line 11
    invoke-virtual {v0, p1}, Llg1;->t(I)J

    move-result-wide p1

    iput-wide p1, p0, Lrf1;->j:J

    const/4 p1, 0x0

    iput-object p1, p0, Lrf1;->k:Lvq2;

    iput-object p1, p0, Lrf1;->l:Lwn1;

    return-void
.end method

.method public static c(I)I
    .locals 0

    .line 1
    sparse-switch p0, :sswitch_data_0

    .line 2
    .line 3
    .line 4
    const/4 p0, -0x1

    .line 5
    return p0

    .line 6
    :sswitch_0
    const/4 p0, 0x3

    .line 7
    return p0

    .line 8
    :sswitch_1
    const/4 p0, 0x2

    .line 9
    return p0

    .line 10
    :sswitch_2
    const/16 p0, 0xb

    .line 11
    .line 12
    return p0

    .line 13
    :sswitch_3
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :sswitch_4
    const/16 p0, 0xa

    .line 16
    .line 17
    return p0

    .line 18
    :sswitch_5
    const/16 p0, 0x9

    .line 19
    .line 20
    return p0

    .line 21
    :sswitch_6
    const/16 p0, 0x8

    .line 22
    .line 23
    return p0

    .line 24
    :sswitch_7
    const/4 p0, 0x7

    .line 25
    return p0

    .line 26
    :sswitch_8
    const/4 p0, 0x6

    .line 27
    return p0

    .line 28
    :sswitch_9
    const/4 p0, 0x5

    .line 29
    return p0

    .line 30
    :sswitch_a
    const/4 p0, 0x4

    .line 31
    return p0

    .line 32
    nop

    .line 33
    :sswitch_data_0
    .sparse-switch
        0x1f40 -> :sswitch_a
        0x3e80 -> :sswitch_9
        0x5622 -> :sswitch_8
        0x5dc0 -> :sswitch_7
        0x7d00 -> :sswitch_6
        0xac44 -> :sswitch_5
        0xbb80 -> :sswitch_4
        0x15888 -> :sswitch_3
        0x17700 -> :sswitch_2
        0x2b110 -> :sswitch_1
        0x2ee00 -> :sswitch_0
    .end sparse-switch
.end method

.method public static d(I)I
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    if-eq p0, v0, :cond_5

    .line 4
    .line 5
    const/16 v0, 0xc

    .line 6
    .line 7
    if-eq p0, v0, :cond_4

    .line 8
    .line 9
    const/16 v0, 0x10

    .line 10
    .line 11
    if-eq p0, v0, :cond_3

    .line 12
    .line 13
    const/16 v0, 0x14

    .line 14
    .line 15
    if-eq p0, v0, :cond_2

    .line 16
    .line 17
    const/16 v0, 0x18

    .line 18
    .line 19
    if-eq p0, v0, :cond_1

    .line 20
    .line 21
    const/16 v0, 0x20

    .line 22
    .line 23
    if-eq p0, v0, :cond_0

    .line 24
    .line 25
    const/4 p0, -0x1

    .line 26
    return p0

    .line 27
    :cond_0
    const/4 p0, 0x7

    .line 28
    return p0

    .line 29
    :cond_1
    const/4 p0, 0x6

    .line 30
    return p0

    .line 31
    :cond_2
    const/4 p0, 0x5

    .line 32
    return p0

    .line 33
    :cond_3
    const/4 p0, 0x4

    .line 34
    return p0

    .line 35
    :cond_4
    const/4 p0, 0x2

    .line 36
    return p0

    .line 37
    :cond_5
    const/4 p0, 0x1

    .line 38
    return p0
.end method


# virtual methods
.method public final a()J
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iget-wide v2, p0, Lrf1;->j:J

    .line 4
    .line 5
    cmp-long v0, v2, v0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    return-wide v0

    .line 15
    :cond_0
    const-wide/32 v0, 0xf4240

    .line 16
    .line 17
    .line 18
    mul-long/2addr v2, v0

    .line 19
    iget v0, p0, Lrf1;->e:I

    .line 20
    .line 21
    int-to-long v0, v0

    .line 22
    div-long/2addr v2, v0

    .line 23
    return-wide v2
.end method

.method public final b([BLwn1;)Lph4;
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    const/16 v1, -0x80

    .line 3
    .line 4
    aput-byte v1, p1, v0

    .line 5
    .line 6
    iget-object v0, p0, Lrf1;->l:Lwn1;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {v0, p2}, Lwn1;->b(Lwn1;)Lwn1;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    :goto_0
    new-instance v0, Lgg4;

    .line 16
    .line 17
    invoke-direct {v0}, Lgg4;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v1, "audio/flac"

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lgg4;->e(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget v1, p0, Lrf1;->d:I

    .line 26
    .line 27
    if-gtz v1, :cond_1

    .line 28
    .line 29
    const/4 v1, -0x1

    .line 30
    :cond_1
    iput v1, v0, Lgg4;->m:I

    .line 31
    .line 32
    iget v1, p0, Lrf1;->g:I

    .line 33
    .line 34
    iput v1, v0, Lgg4;->D:I

    .line 35
    .line 36
    iget v1, p0, Lrf1;->e:I

    .line 37
    .line 38
    iput v1, v0, Lgg4;->E:I

    .line 39
    .line 40
    iget v1, p0, Lrf1;->h:I

    .line 41
    .line 42
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 43
    .line 44
    invoke-static {v1, v2}, Lv23;->y(ILjava/nio/ByteOrder;)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    iput v1, v0, Lgg4;->F:I

    .line 49
    .line 50
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iput-object p1, v0, Lgg4;->o:Ljava/util/List;

    .line 55
    .line 56
    iput-object p2, v0, Lgg4;->j:Lwn1;

    .line 57
    .line 58
    new-instance p1, Lph4;

    .line 59
    .line 60
    invoke-direct {p1, v0}, Lph4;-><init>(Lgg4;)V

    .line 61
    .line 62
    .line 63
    return-object p1
.end method
