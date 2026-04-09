.class public final Loi1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Llf1;


# static fields
.field public static final j0:[B

.field public static final k0:[B

.field public static final l0:[B

.field public static final m0:[B

.field public static final n0:Ljava/util/UUID;

.field public static final o0:Ljava/util/Map;


# instance fields
.field public A:J

.field public final B:Landroid/util/SparseArray;

.field public C:Z

.field public D:J

.field public E:I

.field public F:J

.field public G:I

.field public H:Z

.field public I:J

.field public J:J

.field public K:J

.field public L:Z

.field public M:I

.field public N:J

.field public O:J

.field public P:I

.field public Q:I

.field public R:[I

.field public S:I

.field public T:I

.field public U:I

.field public V:I

.field public W:Z

.field public X:J

.field public Y:I

.field public Z:I

.field public final a:Lpi1;

.field public a0:I

.field public final b:Landroid/util/SparseArray;

.field public b0:Z

.field public final c:Z

.field public c0:Z

.field public final d:Z

.field public d0:Z

.field public final e:Ljk1;

.field public e0:I

.field public final f:Lkz2;

.field public f0:B

.field public final g:Lkz2;

.field public g0:Z

.field public final h:Lkz2;

.field public h0:Lnf1;

.field public final i:Lkz2;

.field public final i0:Lki1;

.field public final j:Lkz2;

.field public final k:Lkz2;

.field public final l:Lkz2;

.field public final m:Lkz2;

.field public final n:Lkz2;

.field public final o:Lkz2;

.field public p:Ljava/nio/ByteBuffer;

.field public q:J

.field public r:J

.field public s:J

.field public t:J

.field public u:J

.field public v:Z

.field public w:Z

.field public x:Lni1;

.field public y:Z

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    fill-array-data v1, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v1, Loi1;->j0:[B

    .line 9
    .line 10
    sget-object v1, Lv23;->a:Ljava/lang/String;

    .line 11
    .line 12
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 13
    .line 14
    const-string v2, "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text"

    .line 15
    .line 16
    invoke-virtual {v2, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    sput-object v1, Loi1;->k0:[B

    .line 21
    .line 22
    new-array v0, v0, [B

    .line 23
    .line 24
    fill-array-data v0, :array_1

    .line 25
    .line 26
    .line 27
    sput-object v0, Loi1;->l0:[B

    .line 28
    .line 29
    const/16 v0, 0x26

    .line 30
    .line 31
    new-array v0, v0, [B

    .line 32
    .line 33
    fill-array-data v0, :array_2

    .line 34
    .line 35
    .line 36
    sput-object v0, Loi1;->m0:[B

    .line 37
    .line 38
    new-instance v0, Ljava/util/UUID;

    .line 39
    .line 40
    const-wide v1, 0x100000000001000L

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    const-wide v3, -0x7fffff55ffc7648fL    # -3.607411173533E-312

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    invoke-direct {v0, v1, v2, v3, v4}, Ljava/util/UUID;-><init>(JJ)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Loi1;->n0:Ljava/util/UUID;

    .line 54
    .line 55
    new-instance v0, Ljava/util/HashMap;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 58
    .line 59
    .line 60
    const-string v1, "htc_video_rotA-090"

    .line 61
    .line 62
    const/16 v2, 0x5a

    .line 63
    .line 64
    const/4 v3, 0x0

    .line 65
    const-string v4, "htc_video_rotA-000"

    .line 66
    .line 67
    invoke-static {v3, v0, v4, v2, v1}, Lga1;->m(ILjava/util/HashMap;Ljava/lang/String;ILjava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const-string v1, "htc_video_rotA-270"

    .line 71
    .line 72
    const/16 v2, 0x10e

    .line 73
    .line 74
    const/16 v3, 0xb4

    .line 75
    .line 76
    const-string v4, "htc_video_rotA-180"

    .line 77
    .line 78
    invoke-static {v3, v0, v4, v2, v1}, Lga1;->m(ILjava/util/HashMap;Ljava/lang/String;ILjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    sput-object v0, Loi1;->o0:Ljava/util/Map;

    .line 86
    .line 87
    return-void

    .line 88
    nop

    .line 89
    :array_0
    .array-data 1
        0x31t
        0xat
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x30t
        0x30t
        0x20t
        0x2dt
        0x2dt
        0x3et
        0x20t
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x30t
        0x30t
        0xat
    .end array-data

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    :array_1
    .array-data 1
        0x44t
        0x69t
        0x61t
        0x6ct
        0x6ft
        0x67t
        0x75t
        0x65t
        0x3at
        0x20t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
    .end array-data

    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    :array_2
    .array-data 1
        0x57t
        0x45t
        0x42t
        0x56t
        0x54t
        0x54t
        0xat
        0xat
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2et
        0x30t
        0x30t
        0x30t
        0x20t
        0x2dt
        0x2dt
        0x3et
        0x20t
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2et
        0x30t
        0x30t
        0x30t
        0xat
    .end array-data
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    new-instance v0, Lki1;

    invoke-direct {v0}, Lki1;-><init>()V

    const/4 v1, 0x2

    sget-object v2, Ljk1;->e:Lts0;

    invoke-direct {p0, v0, v1, v2}, Loi1;-><init>(Lki1;ILjk1;)V

    return-void
.end method

.method public constructor <init>(Lki1;ILjk1;)V
    .locals 5

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Loi1;->r:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v2, p0, Loi1;->s:J

    iput-wide v2, p0, Loi1;->t:J

    iput-wide v2, p0, Loi1;->u:J

    iput-wide v2, p0, Loi1;->D:J

    const/4 v4, -0x1

    iput v4, p0, Loi1;->E:I

    iput-wide v0, p0, Loi1;->F:J

    iput v4, p0, Loi1;->G:I

    iput-wide v0, p0, Loi1;->I:J

    iput-wide v0, p0, Loi1;->J:J

    iput-wide v2, p0, Loi1;->K:J

    iput-object p1, p0, Loi1;->i0:Lki1;

    new-instance v0, Lf23;

    const/16 v1, 0xb

    invoke-direct {v0, v1, p0}, Lf23;-><init>(ILjava/lang/Object;)V

    .line 3
    iput-object v0, p1, Lki1;->d:Lf23;

    .line 4
    iput-object p3, p0, Loi1;->e:Ljk1;

    new-instance p1, Landroid/util/SparseArray;

    .line 5
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Loi1;->B:Landroid/util/SparseArray;

    const/4 p1, 0x1

    iput-boolean p1, p0, Loi1;->c:Z

    and-int/lit8 p2, p2, 0x2

    if-nez p2, :cond_0

    move p2, p1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iput-boolean p2, p0, Loi1;->d:Z

    .line 6
    new-instance p2, Lpi1;

    const/4 p3, 0x0

    invoke-direct {p2, p3}, Lpi1;-><init>(I)V

    iput-object p2, p0, Loi1;->a:Lpi1;

    new-instance p2, Landroid/util/SparseArray;

    .line 7
    invoke-direct {p2}, Landroid/util/SparseArray;-><init>()V

    iput-object p2, p0, Loi1;->b:Landroid/util/SparseArray;

    .line 8
    new-instance p2, Lkz2;

    const/4 p3, 0x4

    invoke-direct {p2, p3}, Lkz2;-><init>(I)V

    iput-object p2, p0, Loi1;->h:Lkz2;

    new-instance p2, Lkz2;

    .line 9
    invoke-static {p3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-direct {p2, v0}, Lkz2;-><init>([B)V

    iput-object p2, p0, Loi1;->i:Lkz2;

    new-instance p2, Lkz2;

    .line 10
    invoke-direct {p2, p3}, Lkz2;-><init>(I)V

    iput-object p2, p0, Loi1;->j:Lkz2;

    new-instance p2, Lkz2;

    .line 11
    sget-object v0, Lwl2;->G:[B

    invoke-direct {p2, v0}, Lkz2;-><init>([B)V

    iput-object p2, p0, Loi1;->f:Lkz2;

    new-instance p2, Lkz2;

    .line 12
    invoke-direct {p2, p3}, Lkz2;-><init>(I)V

    iput-object p2, p0, Loi1;->g:Lkz2;

    new-instance p2, Lkz2;

    .line 13
    invoke-direct {p2}, Lkz2;-><init>()V

    iput-object p2, p0, Loi1;->k:Lkz2;

    new-instance p2, Lkz2;

    .line 14
    invoke-direct {p2}, Lkz2;-><init>()V

    iput-object p2, p0, Loi1;->l:Lkz2;

    new-instance p2, Lkz2;

    const/16 p3, 0x8

    .line 15
    invoke-direct {p2, p3}, Lkz2;-><init>(I)V

    iput-object p2, p0, Loi1;->m:Lkz2;

    new-instance p2, Lkz2;

    .line 16
    invoke-direct {p2}, Lkz2;-><init>()V

    iput-object p2, p0, Loi1;->n:Lkz2;

    new-instance p2, Lkz2;

    .line 17
    invoke-direct {p2}, Lkz2;-><init>()V

    iput-object p2, p0, Loi1;->o:Lkz2;

    new-array p2, p1, [I

    iput-object p2, p0, Loi1;->R:[I

    iput-boolean p1, p0, Loi1;->w:Z

    return-void
.end method

.method public static o(JJLjava/lang/String;)[B
    .locals 9

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long v0, p0, v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    invoke-static {v0}, Lzt0;->D(Z)V

    .line 14
    .line 15
    .line 16
    const-wide v0, 0xd693a400L

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    div-long v2, p0, v0

    .line 22
    .line 23
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 24
    .line 25
    long-to-int v2, v2

    .line 26
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    int-to-long v5, v2

    .line 31
    mul-long/2addr v5, v0

    .line 32
    sub-long/2addr p0, v5

    .line 33
    const-wide/32 v0, 0x3938700

    .line 34
    .line 35
    .line 36
    div-long v5, p0, v0

    .line 37
    .line 38
    long-to-int v2, v5

    .line 39
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    int-to-long v6, v2

    .line 44
    mul-long/2addr v6, v0

    .line 45
    sub-long/2addr p0, v6

    .line 46
    const-wide/32 v0, 0xf4240

    .line 47
    .line 48
    .line 49
    div-long v6, p0, v0

    .line 50
    .line 51
    long-to-int v2, v6

    .line 52
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    int-to-long v7, v2

    .line 57
    mul-long/2addr v7, v0

    .line 58
    sub-long/2addr p0, v7

    .line 59
    div-long/2addr p0, p2

    .line 60
    long-to-int p0, p0

    .line 61
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    filled-new-array {v3, v5, v6, p0}, [Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-static {v4, p4, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    sget-object p1, Lv23;->a:Ljava/lang/String;

    .line 74
    .line 75
    sget-object p1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 76
    .line 77
    invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Loi1;->w:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    move v1, v0

    .line 7
    :goto_0
    iget-object v2, p0, Loi1;->b:Landroid/util/SparseArray;

    .line 8
    .line 9
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-ge v1, v3, :cond_1

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Lni1;

    .line 20
    .line 21
    iget-boolean v2, v2, Lni1;->W:Z

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget-object v1, p0, Loi1;->h0:Lnf1;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-interface {v1}, Lnf1;->s()V

    .line 35
    .line 36
    .line 37
    iput-boolean v0, p0, Loi1;->w:Z

    .line 38
    .line 39
    :cond_2
    :goto_1
    return-void
.end method

.method public final b(Lmf1;)Z
    .locals 14

    .line 1
    new-instance v0, Lt3;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Lt3;-><init>(IB)V

    .line 6
    .line 7
    .line 8
    check-cast p1, Ldf1;

    .line 9
    .line 10
    iget-wide v1, p1, Ldf1;->h:J

    .line 11
    .line 12
    const-wide/16 v3, -0x1

    .line 13
    .line 14
    cmp-long v3, v1, v3

    .line 15
    .line 16
    const-wide/16 v4, 0x400

    .line 17
    .line 18
    if-eqz v3, :cond_1

    .line 19
    .line 20
    cmp-long v6, v1, v4

    .line 21
    .line 22
    if-lez v6, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-wide v4, v1

    .line 26
    :cond_1
    :goto_0
    iget-object v6, v0, Lt3;->h:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v6, Lkz2;

    .line 29
    .line 30
    iget-object v7, v6, Lkz2;->a:[B

    .line 31
    .line 32
    const/4 v8, 0x0

    .line 33
    const/4 v9, 0x4

    .line 34
    invoke-virtual {p1, v7, v8, v9, v8}, Ldf1;->B([BIIZ)Z

    .line 35
    .line 36
    .line 37
    invoke-virtual {v6}, Lkz2;->P()J

    .line 38
    .line 39
    .line 40
    move-result-wide v10

    .line 41
    iput v9, v0, Lt3;->g:I

    .line 42
    .line 43
    :goto_1
    const-wide/32 v12, 0x1a45dfa3

    .line 44
    .line 45
    .line 46
    cmp-long v7, v10, v12

    .line 47
    .line 48
    const/4 v9, 0x1

    .line 49
    if-eqz v7, :cond_3

    .line 50
    .line 51
    long-to-int v7, v4

    .line 52
    iget v12, v0, Lt3;->g:I

    .line 53
    .line 54
    add-int/2addr v12, v9

    .line 55
    iput v12, v0, Lt3;->g:I

    .line 56
    .line 57
    if-ne v12, v7, :cond_2

    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_2
    iget-object v7, v6, Lkz2;->a:[B

    .line 61
    .line 62
    invoke-virtual {p1, v7, v8, v9, v8}, Ldf1;->B([BIIZ)Z

    .line 63
    .line 64
    .line 65
    const/16 v7, 0x8

    .line 66
    .line 67
    shl-long v9, v10, v7

    .line 68
    .line 69
    iget-object v7, v6, Lkz2;->a:[B

    .line 70
    .line 71
    aget-byte v7, v7, v8

    .line 72
    .line 73
    and-int/lit16 v7, v7, 0xff

    .line 74
    .line 75
    const-wide/16 v11, -0x100

    .line 76
    .line 77
    and-long/2addr v9, v11

    .line 78
    int-to-long v11, v7

    .line 79
    or-long v10, v9, v11

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    invoke-virtual {v0, p1}, Lt3;->x(Ldf1;)J

    .line 83
    .line 84
    .line 85
    move-result-wide v4

    .line 86
    iget v6, v0, Lt3;->g:I

    .line 87
    .line 88
    int-to-long v6, v6

    .line 89
    const-wide/high16 v10, -0x8000000000000000L

    .line 90
    .line 91
    cmp-long v12, v4, v10

    .line 92
    .line 93
    if-eqz v12, :cond_8

    .line 94
    .line 95
    add-long/2addr v6, v4

    .line 96
    if-nez v3, :cond_4

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_4
    cmp-long v1, v6, v1

    .line 100
    .line 101
    if-ltz v1, :cond_5

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_5
    :goto_2
    iget v1, v0, Lt3;->g:I

    .line 105
    .line 106
    int-to-long v1, v1

    .line 107
    cmp-long v1, v1, v6

    .line 108
    .line 109
    if-gez v1, :cond_7

    .line 110
    .line 111
    invoke-virtual {v0, p1}, Lt3;->x(Ldf1;)J

    .line 112
    .line 113
    .line 114
    move-result-wide v1

    .line 115
    cmp-long v1, v1, v10

    .line 116
    .line 117
    if-nez v1, :cond_6

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_6
    invoke-virtual {v0, p1}, Lt3;->x(Ldf1;)J

    .line 121
    .line 122
    .line 123
    move-result-wide v1

    .line 124
    const-wide/16 v3, 0x0

    .line 125
    .line 126
    cmp-long v3, v1, v3

    .line 127
    .line 128
    if-ltz v3, :cond_8

    .line 129
    .line 130
    if-eqz v3, :cond_5

    .line 131
    .line 132
    long-to-int v1, v1

    .line 133
    invoke-virtual {p1, v1, v8}, Ldf1;->e(IZ)Z

    .line 134
    .line 135
    .line 136
    iget v2, v0, Lt3;->g:I

    .line 137
    .line 138
    add-int/2addr v2, v1

    .line 139
    iput v2, v0, Lt3;->g:I

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_7
    if-nez v1, :cond_8

    .line 143
    .line 144
    return v9

    .line 145
    :cond_8
    :goto_3
    return v8
.end method

.method public final c(Lmf1;Lpf1;)I
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iput-boolean v3, v0, Loi1;->L:Z

    .line 9
    .line 10
    :goto_0
    iget-boolean v4, v0, Loi1;->L:Z

    .line 11
    .line 12
    if-nez v4, :cond_6d

    .line 13
    .line 14
    iget-object v4, v0, Loi1;->i0:Lki1;

    .line 15
    .line 16
    iget-object v5, v4, Lki1;->c:Lpi1;

    .line 17
    .line 18
    iget-object v6, v4, Lki1;->d:Lf23;

    .line 19
    .line 20
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    :goto_1
    iget-object v6, v4, Lki1;->b:Ljava/util/ArrayDeque;

    .line 24
    .line 25
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    check-cast v7, Lji1;

    .line 30
    .line 31
    const/4 v8, -0x1

    .line 32
    const/4 v9, 0x1

    .line 33
    if-eqz v7, :cond_1

    .line 34
    .line 35
    move-object v12, v1

    .line 36
    check-cast v12, Ldf1;

    .line 37
    .line 38
    iget-wide v12, v12, Ldf1;->i:J

    .line 39
    .line 40
    iget-wide v14, v7, Lji1;->b:J

    .line 41
    .line 42
    cmp-long v7, v12, v14

    .line 43
    .line 44
    if-gez v7, :cond_0

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_0
    iget-object v4, v4, Lki1;->d:Lf23;

    .line 48
    .line 49
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    check-cast v5, Lji1;

    .line 54
    .line 55
    iget v5, v5, Lji1;->a:I

    .line 56
    .line 57
    iget-object v4, v4, Lf23;->g:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v4, Loi1;

    .line 60
    .line 61
    invoke-virtual {v4, v5}, Loi1;->g(I)V

    .line 62
    .line 63
    .line 64
    move v11, v9

    .line 65
    goto/16 :goto_30

    .line 66
    .line 67
    :cond_1
    :goto_2
    iget v7, v4, Lki1;->e:I

    .line 68
    .line 69
    const/16 v14, 0x8

    .line 70
    .line 71
    const-wide/16 v16, -0x1

    .line 72
    .line 73
    const v10, 0x1f43b675

    .line 74
    .line 75
    .line 76
    const-wide/16 v18, 0x0

    .line 77
    .line 78
    const/4 v12, 0x4

    .line 79
    if-nez v7, :cond_8

    .line 80
    .line 81
    invoke-virtual {v5, v1, v9, v3, v12}, Lpi1;->e(Lmf1;ZZI)J

    .line 82
    .line 83
    .line 84
    move-result-wide v20

    .line 85
    const-wide/16 v22, -0x2

    .line 86
    .line 87
    cmp-long v7, v20, v22

    .line 88
    .line 89
    if-nez v7, :cond_6

    .line 90
    .line 91
    move-object v7, v1

    .line 92
    check-cast v7, Ldf1;

    .line 93
    .line 94
    iput v3, v7, Ldf1;->k:I

    .line 95
    .line 96
    :goto_3
    iget-object v7, v4, Lki1;->a:[B

    .line 97
    .line 98
    move-object v13, v1

    .line 99
    check-cast v13, Ldf1;

    .line 100
    .line 101
    invoke-virtual {v13, v7, v3, v12, v3}, Ldf1;->B([BIIZ)Z

    .line 102
    .line 103
    .line 104
    aget-byte v11, v7, v3

    .line 105
    .line 106
    move v9, v3

    .line 107
    :goto_4
    if-ge v9, v14, :cond_3

    .line 108
    .line 109
    add-int/lit8 v20, v9, 0x1

    .line 110
    .line 111
    sget-object v21, Lpi1;->i:[J

    .line 112
    .line 113
    aget-wide v24, v21, v9

    .line 114
    .line 115
    int-to-long v14, v11

    .line 116
    and-long v14, v24, v14

    .line 117
    .line 118
    cmp-long v14, v14, v18

    .line 119
    .line 120
    if-eqz v14, :cond_2

    .line 121
    .line 122
    move/from16 v11, v20

    .line 123
    .line 124
    goto :goto_5

    .line 125
    :cond_2
    move/from16 v9, v20

    .line 126
    .line 127
    const/16 v14, 0x8

    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_3
    move v11, v8

    .line 131
    :goto_5
    if-eq v11, v8, :cond_4

    .line 132
    .line 133
    if-gt v11, v12, :cond_4

    .line 134
    .line 135
    invoke-static {v11, v3, v7}, Lpi1;->g(IZ[B)J

    .line 136
    .line 137
    .line 138
    move-result-wide v14

    .line 139
    long-to-int v7, v14

    .line 140
    iget-object v14, v4, Lki1;->d:Lf23;

    .line 141
    .line 142
    iget-object v14, v14, Lf23;->g:Ljava/lang/Object;

    .line 143
    .line 144
    const v14, 0x1549a966

    .line 145
    .line 146
    .line 147
    if-eq v7, v14, :cond_5

    .line 148
    .line 149
    if-eq v7, v10, :cond_5

    .line 150
    .line 151
    const v14, 0x1c53bb6b

    .line 152
    .line 153
    .line 154
    if-eq v7, v14, :cond_5

    .line 155
    .line 156
    const v14, 0x1654ae6b

    .line 157
    .line 158
    .line 159
    if-ne v7, v14, :cond_4

    .line 160
    .line 161
    move v7, v14

    .line 162
    goto :goto_6

    .line 163
    :cond_4
    const/4 v11, 0x1

    .line 164
    goto :goto_7

    .line 165
    :cond_5
    :goto_6
    invoke-virtual {v13, v11, v3}, Ldf1;->c(IZ)Z

    .line 166
    .line 167
    .line 168
    int-to-long v13, v7

    .line 169
    const/4 v11, 0x1

    .line 170
    goto :goto_8

    .line 171
    :goto_7
    invoke-virtual {v13, v11, v3}, Ldf1;->c(IZ)Z

    .line 172
    .line 173
    .line 174
    move v9, v11

    .line 175
    const/16 v14, 0x8

    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_6
    move v11, v9

    .line 179
    move-wide/from16 v13, v20

    .line 180
    .line 181
    :goto_8
    cmp-long v7, v13, v16

    .line 182
    .line 183
    if-nez v7, :cond_7

    .line 184
    .line 185
    move v11, v3

    .line 186
    goto/16 :goto_30

    .line 187
    .line 188
    :cond_7
    long-to-int v7, v13

    .line 189
    iput v7, v4, Lki1;->f:I

    .line 190
    .line 191
    iput v11, v4, Lki1;->e:I

    .line 192
    .line 193
    :goto_9
    const/16 v9, 0x8

    .line 194
    .line 195
    goto :goto_a

    .line 196
    :cond_8
    move v11, v9

    .line 197
    if-ne v7, v11, :cond_9

    .line 198
    .line 199
    goto :goto_9

    .line 200
    :goto_a
    invoke-virtual {v5, v1, v3, v11, v9}, Lpi1;->e(Lmf1;ZZI)J

    .line 201
    .line 202
    .line 203
    move-result-wide v13

    .line 204
    iput-wide v13, v4, Lki1;->g:J

    .line 205
    .line 206
    const/4 v7, 0x2

    .line 207
    iput v7, v4, Lki1;->e:I

    .line 208
    .line 209
    :cond_9
    iget-object v7, v4, Lki1;->d:Lf23;

    .line 210
    .line 211
    iget v11, v4, Lki1;->f:I

    .line 212
    .line 213
    iget-object v7, v7, Lf23;->g:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v7, Loi1;

    .line 216
    .line 217
    const-string v13, " not supported"

    .line 218
    .line 219
    const-wide/32 v20, 0x7fffffff

    .line 220
    .line 221
    .line 222
    const-wide/16 v24, 0x1

    .line 223
    .line 224
    move v15, v8

    .line 225
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    move/from16 v33, v15

    .line 231
    .line 232
    const/16 v27, 0xf

    .line 233
    .line 234
    const-wide/16 v28, 0x8

    .line 235
    .line 236
    const/4 v10, 0x0

    .line 237
    sparse-switch v11, :sswitch_data_0

    .line 238
    .line 239
    .line 240
    iget-wide v6, v4, Lki1;->g:J

    .line 241
    .line 242
    long-to-int v6, v6

    .line 243
    move-object v7, v1

    .line 244
    check-cast v7, Ldf1;

    .line 245
    .line 246
    invoke-virtual {v7, v6, v3}, Ldf1;->c(IZ)Z

    .line 247
    .line 248
    .line 249
    iput v3, v4, Lki1;->e:I

    .line 250
    .line 251
    goto/16 :goto_1

    .line 252
    .line 253
    :sswitch_0
    iget-wide v5, v4, Lki1;->g:J

    .line 254
    .line 255
    const-wide/16 v8, 0x4

    .line 256
    .line 257
    cmp-long v8, v5, v8

    .line 258
    .line 259
    if-eqz v8, :cond_b

    .line 260
    .line 261
    cmp-long v8, v5, v28

    .line 262
    .line 263
    if-nez v8, :cond_a

    .line 264
    .line 265
    goto :goto_b

    .line 266
    :cond_a
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 271
    .line 272
    .line 273
    move-result v1

    .line 274
    new-instance v2, Ljava/lang/StringBuilder;

    .line 275
    .line 276
    add-int/lit8 v1, v1, 0x14

    .line 277
    .line 278
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 279
    .line 280
    .line 281
    const-string v1, "Invalid float size: "

    .line 282
    .line 283
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    invoke-static {v10, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    throw v1

    .line 298
    :cond_b
    :goto_b
    long-to-int v5, v5

    .line 299
    invoke-virtual {v4, v1, v5}, Lki1;->a(Lmf1;I)J

    .line 300
    .line 301
    .line 302
    move-result-wide v8

    .line 303
    if-ne v5, v12, :cond_c

    .line 304
    .line 305
    long-to-int v5, v8

    .line 306
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 307
    .line 308
    .line 309
    move-result v5

    .line 310
    float-to-double v5, v5

    .line 311
    goto :goto_c

    .line 312
    :cond_c
    invoke-static {v8, v9}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 313
    .line 314
    .line 315
    move-result-wide v5

    .line 316
    :goto_c
    const/16 v8, 0xb5

    .line 317
    .line 318
    if-eq v11, v8, :cond_e

    .line 319
    .line 320
    const/16 v8, 0x4489

    .line 321
    .line 322
    if-eq v11, v8, :cond_d

    .line 323
    .line 324
    packed-switch v11, :pswitch_data_0

    .line 325
    .line 326
    .line 327
    packed-switch v11, :pswitch_data_1

    .line 328
    .line 329
    .line 330
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    goto/16 :goto_d

    .line 334
    .line 335
    :pswitch_0
    double-to-float v5, v5

    .line 336
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 337
    .line 338
    .line 339
    iget-object v6, v7, Loi1;->x:Lni1;

    .line 340
    .line 341
    iput v5, v6, Lni1;->w:F

    .line 342
    .line 343
    goto/16 :goto_d

    .line 344
    .line 345
    :pswitch_1
    double-to-float v5, v5

    .line 346
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 347
    .line 348
    .line 349
    iget-object v6, v7, Loi1;->x:Lni1;

    .line 350
    .line 351
    iput v5, v6, Lni1;->v:F

    .line 352
    .line 353
    goto/16 :goto_d

    .line 354
    .line 355
    :pswitch_2
    double-to-float v5, v5

    .line 356
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 357
    .line 358
    .line 359
    iget-object v6, v7, Loi1;->x:Lni1;

    .line 360
    .line 361
    iput v5, v6, Lni1;->u:F

    .line 362
    .line 363
    goto :goto_d

    .line 364
    :pswitch_3
    double-to-float v5, v5

    .line 365
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 366
    .line 367
    .line 368
    iget-object v6, v7, Loi1;->x:Lni1;

    .line 369
    .line 370
    iput v5, v6, Lni1;->O:F

    .line 371
    .line 372
    goto :goto_d

    .line 373
    :pswitch_4
    double-to-float v5, v5

    .line 374
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 375
    .line 376
    .line 377
    iget-object v6, v7, Loi1;->x:Lni1;

    .line 378
    .line 379
    iput v5, v6, Lni1;->N:F

    .line 380
    .line 381
    goto :goto_d

    .line 382
    :pswitch_5
    double-to-float v5, v5

    .line 383
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 384
    .line 385
    .line 386
    iget-object v6, v7, Loi1;->x:Lni1;

    .line 387
    .line 388
    iput v5, v6, Lni1;->M:F

    .line 389
    .line 390
    goto :goto_d

    .line 391
    :pswitch_6
    double-to-float v5, v5

    .line 392
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 393
    .line 394
    .line 395
    iget-object v6, v7, Loi1;->x:Lni1;

    .line 396
    .line 397
    iput v5, v6, Lni1;->L:F

    .line 398
    .line 399
    goto :goto_d

    .line 400
    :pswitch_7
    double-to-float v5, v5

    .line 401
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 402
    .line 403
    .line 404
    iget-object v6, v7, Loi1;->x:Lni1;

    .line 405
    .line 406
    iput v5, v6, Lni1;->K:F

    .line 407
    .line 408
    goto :goto_d

    .line 409
    :pswitch_8
    double-to-float v5, v5

    .line 410
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 411
    .line 412
    .line 413
    iget-object v6, v7, Loi1;->x:Lni1;

    .line 414
    .line 415
    iput v5, v6, Lni1;->J:F

    .line 416
    .line 417
    goto :goto_d

    .line 418
    :pswitch_9
    double-to-float v5, v5

    .line 419
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 420
    .line 421
    .line 422
    iget-object v6, v7, Loi1;->x:Lni1;

    .line 423
    .line 424
    iput v5, v6, Lni1;->I:F

    .line 425
    .line 426
    goto :goto_d

    .line 427
    :pswitch_a
    double-to-float v5, v5

    .line 428
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 429
    .line 430
    .line 431
    iget-object v6, v7, Loi1;->x:Lni1;

    .line 432
    .line 433
    iput v5, v6, Lni1;->H:F

    .line 434
    .line 435
    goto :goto_d

    .line 436
    :pswitch_b
    double-to-float v5, v5

    .line 437
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 438
    .line 439
    .line 440
    iget-object v6, v7, Loi1;->x:Lni1;

    .line 441
    .line 442
    iput v5, v6, Lni1;->G:F

    .line 443
    .line 444
    goto :goto_d

    .line 445
    :pswitch_c
    double-to-float v5, v5

    .line 446
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 447
    .line 448
    .line 449
    iget-object v6, v7, Loi1;->x:Lni1;

    .line 450
    .line 451
    iput v5, v6, Lni1;->F:F

    .line 452
    .line 453
    goto :goto_d

    .line 454
    :cond_d
    double-to-long v5, v5

    .line 455
    iput-wide v5, v7, Loi1;->t:J

    .line 456
    .line 457
    goto :goto_d

    .line 458
    :cond_e
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 459
    .line 460
    .line 461
    iget-object v7, v7, Loi1;->x:Lni1;

    .line 462
    .line 463
    double-to-int v5, v5

    .line 464
    iput v5, v7, Lni1;->S:I

    .line 465
    .line 466
    :goto_d
    iput v3, v4, Lki1;->e:I

    .line 467
    .line 468
    :goto_e
    const/4 v11, 0x1

    .line 469
    goto/16 :goto_30

    .line 470
    .line 471
    :sswitch_1
    iget-wide v5, v4, Lki1;->g:J

    .line 472
    .line 473
    long-to-int v5, v5

    .line 474
    iget-object v6, v7, Loi1;->h:Lkz2;

    .line 475
    .line 476
    iget-object v13, v7, Loi1;->b:Landroid/util/SparseArray;

    .line 477
    .line 478
    const/16 v14, 0xa1

    .line 479
    .line 480
    const/16 v15, 0xa3

    .line 481
    .line 482
    if-eq v11, v14, :cond_1a

    .line 483
    .line 484
    if-eq v11, v15, :cond_1a

    .line 485
    .line 486
    const/16 v6, 0xa5

    .line 487
    .line 488
    if-eq v11, v6, :cond_17

    .line 489
    .line 490
    const/16 v6, 0x41ed

    .line 491
    .line 492
    if-eq v11, v6, :cond_14

    .line 493
    .line 494
    const/16 v6, 0x4255

    .line 495
    .line 496
    if-eq v11, v6, :cond_13

    .line 497
    .line 498
    const/16 v6, 0x47e2

    .line 499
    .line 500
    if-eq v11, v6, :cond_12

    .line 501
    .line 502
    const/16 v6, 0x53ab

    .line 503
    .line 504
    if-eq v11, v6, :cond_11

    .line 505
    .line 506
    const/16 v6, 0x63a2

    .line 507
    .line 508
    if-eq v11, v6, :cond_10

    .line 509
    .line 510
    const/16 v6, 0x7672

    .line 511
    .line 512
    if-ne v11, v6, :cond_f

    .line 513
    .line 514
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 515
    .line 516
    .line 517
    iget-object v6, v7, Loi1;->x:Lni1;

    .line 518
    .line 519
    new-array v7, v5, [B

    .line 520
    .line 521
    iput-object v7, v6, Lni1;->x:[B

    .line 522
    .line 523
    move-object v6, v1

    .line 524
    check-cast v6, Ldf1;

    .line 525
    .line 526
    invoke-virtual {v6, v7, v3, v5, v3}, Ldf1;->w([BIIZ)Z

    .line 527
    .line 528
    .line 529
    goto/16 :goto_21

    .line 530
    .line 531
    :cond_f
    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v1

    .line 535
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 536
    .line 537
    .line 538
    move-result v1

    .line 539
    new-instance v2, Ljava/lang/StringBuilder;

    .line 540
    .line 541
    add-int/lit8 v1, v1, 0xf

    .line 542
    .line 543
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 544
    .line 545
    .line 546
    const-string v1, "Unexpected id: "

    .line 547
    .line 548
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 549
    .line 550
    .line 551
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 552
    .line 553
    .line 554
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 555
    .line 556
    .line 557
    move-result-object v1

    .line 558
    invoke-static {v10, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 559
    .line 560
    .line 561
    move-result-object v1

    .line 562
    throw v1

    .line 563
    :cond_10
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 564
    .line 565
    .line 566
    iget-object v6, v7, Loi1;->x:Lni1;

    .line 567
    .line 568
    new-array v7, v5, [B

    .line 569
    .line 570
    iput-object v7, v6, Lni1;->l:[B

    .line 571
    .line 572
    move-object v6, v1

    .line 573
    check-cast v6, Ldf1;

    .line 574
    .line 575
    invoke-virtual {v6, v7, v3, v5, v3}, Ldf1;->w([BIIZ)Z

    .line 576
    .line 577
    .line 578
    goto/16 :goto_21

    .line 579
    .line 580
    :cond_11
    iget-object v6, v7, Loi1;->j:Lkz2;

    .line 581
    .line 582
    iget-object v8, v6, Lkz2;->a:[B

    .line 583
    .line 584
    invoke-static {v8, v3}, Ljava/util/Arrays;->fill([BB)V

    .line 585
    .line 586
    .line 587
    rsub-int/lit8 v8, v5, 0x4

    .line 588
    .line 589
    iget-object v9, v6, Lkz2;->a:[B

    .line 590
    .line 591
    move-object v10, v1

    .line 592
    check-cast v10, Ldf1;

    .line 593
    .line 594
    invoke-virtual {v10, v9, v8, v5, v3}, Ldf1;->w([BIIZ)Z

    .line 595
    .line 596
    .line 597
    invoke-virtual {v6, v3}, Lkz2;->E(I)V

    .line 598
    .line 599
    .line 600
    invoke-virtual {v6}, Lkz2;->P()J

    .line 601
    .line 602
    .line 603
    move-result-wide v5

    .line 604
    long-to-int v5, v5

    .line 605
    iput v5, v7, Loi1;->z:I

    .line 606
    .line 607
    goto/16 :goto_21

    .line 608
    .line 609
    :cond_12
    new-array v6, v5, [B

    .line 610
    .line 611
    move-object v8, v1

    .line 612
    check-cast v8, Ldf1;

    .line 613
    .line 614
    invoke-virtual {v8, v6, v3, v5, v3}, Ldf1;->w([BIIZ)Z

    .line 615
    .line 616
    .line 617
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 618
    .line 619
    .line 620
    iget-object v5, v7, Loi1;->x:Lni1;

    .line 621
    .line 622
    new-instance v7, Lig1;

    .line 623
    .line 624
    const/4 v11, 0x1

    .line 625
    invoke-direct {v7, v11, v3, v3, v6}, Lig1;-><init>(III[B)V

    .line 626
    .line 627
    .line 628
    iput-object v7, v5, Lni1;->k:Lig1;

    .line 629
    .line 630
    goto/16 :goto_21

    .line 631
    .line 632
    :cond_13
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 633
    .line 634
    .line 635
    iget-object v6, v7, Loi1;->x:Lni1;

    .line 636
    .line 637
    new-array v7, v5, [B

    .line 638
    .line 639
    iput-object v7, v6, Lni1;->j:[B

    .line 640
    .line 641
    move-object v6, v1

    .line 642
    check-cast v6, Ldf1;

    .line 643
    .line 644
    invoke-virtual {v6, v7, v3, v5, v3}, Ldf1;->w([BIIZ)Z

    .line 645
    .line 646
    .line 647
    goto/16 :goto_21

    .line 648
    .line 649
    :cond_14
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 650
    .line 651
    .line 652
    iget-object v6, v7, Loi1;->x:Lni1;

    .line 653
    .line 654
    iget v7, v6, Lni1;->h:I

    .line 655
    .line 656
    const v8, 0x64767643

    .line 657
    .line 658
    .line 659
    if-eq v7, v8, :cond_16

    .line 660
    .line 661
    const v8, 0x64766343

    .line 662
    .line 663
    .line 664
    if-ne v7, v8, :cond_15

    .line 665
    .line 666
    goto :goto_f

    .line 667
    :cond_15
    move-object v6, v1

    .line 668
    check-cast v6, Ldf1;

    .line 669
    .line 670
    invoke-virtual {v6, v5, v3}, Ldf1;->c(IZ)Z

    .line 671
    .line 672
    .line 673
    goto/16 :goto_21

    .line 674
    .line 675
    :cond_16
    :goto_f
    new-array v7, v5, [B

    .line 676
    .line 677
    iput-object v7, v6, Lni1;->P:[B

    .line 678
    .line 679
    move-object v6, v1

    .line 680
    check-cast v6, Ldf1;

    .line 681
    .line 682
    invoke-virtual {v6, v7, v3, v5, v3}, Ldf1;->w([BIIZ)Z

    .line 683
    .line 684
    .line 685
    goto/16 :goto_21

    .line 686
    .line 687
    :cond_17
    iget v6, v7, Loi1;->M:I

    .line 688
    .line 689
    const/4 v8, 0x2

    .line 690
    if-eq v6, v8, :cond_18

    .line 691
    .line 692
    goto/16 :goto_20

    .line 693
    .line 694
    :cond_18
    iget v6, v7, Loi1;->S:I

    .line 695
    .line 696
    invoke-virtual {v13, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 697
    .line 698
    .line 699
    move-result-object v6

    .line 700
    check-cast v6, Lni1;

    .line 701
    .line 702
    iget v8, v7, Loi1;->V:I

    .line 703
    .line 704
    if-ne v8, v12, :cond_19

    .line 705
    .line 706
    iget-object v6, v6, Lni1;->c:Ljava/lang/String;

    .line 707
    .line 708
    const-string v8, "V_VP9"

    .line 709
    .line 710
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 711
    .line 712
    .line 713
    move-result v6

    .line 714
    if-eqz v6, :cond_19

    .line 715
    .line 716
    iget-object v6, v7, Loi1;->o:Lkz2;

    .line 717
    .line 718
    invoke-virtual {v6, v5}, Lkz2;->y(I)V

    .line 719
    .line 720
    .line 721
    iget-object v6, v6, Lkz2;->a:[B

    .line 722
    .line 723
    move-object v7, v1

    .line 724
    check-cast v7, Ldf1;

    .line 725
    .line 726
    invoke-virtual {v7, v6, v3, v5, v3}, Ldf1;->w([BIIZ)Z

    .line 727
    .line 728
    .line 729
    goto/16 :goto_21

    .line 730
    .line 731
    :cond_19
    move-object v6, v1

    .line 732
    check-cast v6, Ldf1;

    .line 733
    .line 734
    invoke-virtual {v6, v5, v3}, Ldf1;->c(IZ)Z

    .line 735
    .line 736
    .line 737
    goto/16 :goto_21

    .line 738
    .line 739
    :cond_1a
    iget v14, v7, Loi1;->M:I

    .line 740
    .line 741
    if-nez v14, :cond_1b

    .line 742
    .line 743
    iget-object v14, v7, Loi1;->a:Lpi1;

    .line 744
    .line 745
    move-object/from16 v28, v13

    .line 746
    .line 747
    const/4 v10, 0x1

    .line 748
    const/16 v15, 0x8

    .line 749
    .line 750
    invoke-virtual {v14, v1, v3, v10, v15}, Lpi1;->e(Lmf1;ZZI)J

    .line 751
    .line 752
    .line 753
    move-result-wide v12

    .line 754
    long-to-int v12, v12

    .line 755
    iput v12, v7, Loi1;->S:I

    .line 756
    .line 757
    iget v12, v14, Lpi1;->g:I

    .line 758
    .line 759
    iput v12, v7, Loi1;->T:I

    .line 760
    .line 761
    iput-wide v8, v7, Loi1;->O:J

    .line 762
    .line 763
    iput v10, v7, Loi1;->M:I

    .line 764
    .line 765
    invoke-virtual {v6, v3}, Lkz2;->y(I)V

    .line 766
    .line 767
    .line 768
    goto :goto_10

    .line 769
    :cond_1b
    move-object/from16 v28, v13

    .line 770
    .line 771
    :goto_10
    iget v8, v7, Loi1;->S:I

    .line 772
    .line 773
    move-object/from16 v9, v28

    .line 774
    .line 775
    invoke-virtual {v9, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 776
    .line 777
    .line 778
    move-result-object v8

    .line 779
    check-cast v8, Lni1;

    .line 780
    .line 781
    if-nez v8, :cond_1c

    .line 782
    .line 783
    iget v6, v7, Loi1;->T:I

    .line 784
    .line 785
    sub-int/2addr v5, v6

    .line 786
    move-object v6, v1

    .line 787
    check-cast v6, Ldf1;

    .line 788
    .line 789
    invoke-virtual {v6, v5, v3}, Ldf1;->c(IZ)Z

    .line 790
    .line 791
    .line 792
    iput v3, v7, Loi1;->M:I

    .line 793
    .line 794
    goto/16 :goto_21

    .line 795
    .line 796
    :cond_1c
    iget-object v9, v8, Lni1;->a0:Ljg1;

    .line 797
    .line 798
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 799
    .line 800
    .line 801
    iget v9, v7, Loi1;->M:I

    .line 802
    .line 803
    const/4 v10, 0x1

    .line 804
    if-ne v9, v10, :cond_31

    .line 805
    .line 806
    const/4 v9, 0x3

    .line 807
    invoke-virtual {v7, v1, v9}, Loi1;->k(Lmf1;I)V

    .line 808
    .line 809
    .line 810
    iget-object v9, v6, Lkz2;->a:[B

    .line 811
    .line 812
    const/16 v22, 0x2

    .line 813
    .line 814
    aget-byte v9, v9, v22

    .line 815
    .line 816
    and-int/lit8 v9, v9, 0x6

    .line 817
    .line 818
    shr-int/2addr v9, v10

    .line 819
    const/16 v12, 0xff

    .line 820
    .line 821
    if-nez v9, :cond_1f

    .line 822
    .line 823
    iput v10, v7, Loi1;->Q:I

    .line 824
    .line 825
    iget-object v9, v7, Loi1;->R:[I

    .line 826
    .line 827
    if-nez v9, :cond_1d

    .line 828
    .line 829
    new-array v9, v10, [I

    .line 830
    .line 831
    goto :goto_11

    .line 832
    :cond_1d
    array-length v13, v9

    .line 833
    if-lt v13, v10, :cond_1e

    .line 834
    .line 835
    goto :goto_11

    .line 836
    :cond_1e
    add-int/2addr v13, v13

    .line 837
    invoke-static {v13, v10}, Ljava/lang/Math;->max(II)I

    .line 838
    .line 839
    .line 840
    move-result v9

    .line 841
    new-array v9, v9, [I

    .line 842
    .line 843
    :goto_11
    iput-object v9, v7, Loi1;->R:[I

    .line 844
    .line 845
    iget v10, v7, Loi1;->T:I

    .line 846
    .line 847
    sub-int/2addr v5, v10

    .line 848
    add-int/lit8 v5, v5, -0x3

    .line 849
    .line 850
    aput v5, v9, v3

    .line 851
    .line 852
    :goto_12
    move/from16 v34, v3

    .line 853
    .line 854
    goto/16 :goto_1a

    .line 855
    .line 856
    :cond_1f
    const/4 v10, 0x4

    .line 857
    invoke-virtual {v7, v1, v10}, Loi1;->k(Lmf1;I)V

    .line 858
    .line 859
    .line 860
    iget-object v13, v6, Lkz2;->a:[B

    .line 861
    .line 862
    const/16 v31, 0x3

    .line 863
    .line 864
    aget-byte v13, v13, v31

    .line 865
    .line 866
    and-int/2addr v13, v12

    .line 867
    const/16 v23, 0x1

    .line 868
    .line 869
    add-int/lit8 v13, v13, 0x1

    .line 870
    .line 871
    iput v13, v7, Loi1;->Q:I

    .line 872
    .line 873
    iget-object v14, v7, Loi1;->R:[I

    .line 874
    .line 875
    if-nez v14, :cond_20

    .line 876
    .line 877
    new-array v14, v13, [I

    .line 878
    .line 879
    goto :goto_13

    .line 880
    :cond_20
    array-length v10, v14

    .line 881
    if-lt v10, v13, :cond_21

    .line 882
    .line 883
    goto :goto_13

    .line 884
    :cond_21
    add-int/2addr v10, v10

    .line 885
    invoke-static {v10, v13}, Ljava/lang/Math;->max(II)I

    .line 886
    .line 887
    .line 888
    move-result v10

    .line 889
    new-array v14, v10, [I

    .line 890
    .line 891
    :goto_13
    iput-object v14, v7, Loi1;->R:[I

    .line 892
    .line 893
    const/4 v10, 0x2

    .line 894
    if-ne v9, v10, :cond_22

    .line 895
    .line 896
    iget v9, v7, Loi1;->T:I

    .line 897
    .line 898
    sub-int/2addr v5, v9

    .line 899
    add-int/lit8 v5, v5, -0x4

    .line 900
    .line 901
    iget v9, v7, Loi1;->Q:I

    .line 902
    .line 903
    div-int/2addr v5, v9

    .line 904
    invoke-static {v14, v3, v9, v5}, Ljava/util/Arrays;->fill([IIII)V

    .line 905
    .line 906
    .line 907
    goto :goto_12

    .line 908
    :cond_22
    const/4 v10, 0x1

    .line 909
    if-ne v9, v10, :cond_25

    .line 910
    .line 911
    move v9, v3

    .line 912
    move v10, v9

    .line 913
    const/16 v32, 0x4

    .line 914
    .line 915
    :goto_14
    iget v13, v7, Loi1;->Q:I

    .line 916
    .line 917
    add-int/lit8 v13, v13, -0x1

    .line 918
    .line 919
    if-ge v9, v13, :cond_24

    .line 920
    .line 921
    iget-object v13, v7, Loi1;->R:[I

    .line 922
    .line 923
    aput v3, v13, v9

    .line 924
    .line 925
    :goto_15
    add-int/lit8 v13, v32, 0x1

    .line 926
    .line 927
    invoke-virtual {v7, v1, v13}, Loi1;->k(Lmf1;I)V

    .line 928
    .line 929
    .line 930
    iget-object v14, v6, Lkz2;->a:[B

    .line 931
    .line 932
    aget-byte v14, v14, v32

    .line 933
    .line 934
    and-int/2addr v14, v12

    .line 935
    iget-object v15, v7, Loi1;->R:[I

    .line 936
    .line 937
    aget v18, v15, v9

    .line 938
    .line 939
    add-int v18, v18, v14

    .line 940
    .line 941
    aput v18, v15, v9

    .line 942
    .line 943
    if-eq v14, v12, :cond_23

    .line 944
    .line 945
    add-int v10, v10, v18

    .line 946
    .line 947
    add-int/lit8 v9, v9, 0x1

    .line 948
    .line 949
    move/from16 v32, v13

    .line 950
    .line 951
    goto :goto_14

    .line 952
    :cond_23
    move/from16 v32, v13

    .line 953
    .line 954
    goto :goto_15

    .line 955
    :cond_24
    iget-object v9, v7, Loi1;->R:[I

    .line 956
    .line 957
    iget v14, v7, Loi1;->T:I

    .line 958
    .line 959
    sub-int/2addr v5, v14

    .line 960
    sub-int v5, v5, v32

    .line 961
    .line 962
    sub-int/2addr v5, v10

    .line 963
    aput v5, v9, v13

    .line 964
    .line 965
    goto :goto_12

    .line 966
    :cond_25
    const/4 v10, 0x3

    .line 967
    if-ne v9, v10, :cond_32

    .line 968
    .line 969
    move v10, v3

    .line 970
    move v13, v10

    .line 971
    const/16 v32, 0x4

    .line 972
    .line 973
    :goto_16
    iget v9, v7, Loi1;->Q:I

    .line 974
    .line 975
    add-int/lit8 v14, v9, -0x1

    .line 976
    .line 977
    if-ge v10, v14, :cond_2d

    .line 978
    .line 979
    iget-object v9, v7, Loi1;->R:[I

    .line 980
    .line 981
    aput v3, v9, v10

    .line 982
    .line 983
    add-int/lit8 v14, v32, 0x1

    .line 984
    .line 985
    invoke-virtual {v7, v1, v14}, Loi1;->k(Lmf1;I)V

    .line 986
    .line 987
    .line 988
    iget-object v9, v6, Lkz2;->a:[B

    .line 989
    .line 990
    aget-byte v9, v9, v32

    .line 991
    .line 992
    if-eqz v9, :cond_2c

    .line 993
    .line 994
    move v15, v3

    .line 995
    :goto_17
    const/16 v9, 0x8

    .line 996
    .line 997
    if-ge v15, v9, :cond_29

    .line 998
    .line 999
    rsub-int/lit8 v27, v15, 0x7

    .line 1000
    .line 1001
    const/16 v23, 0x1

    .line 1002
    .line 1003
    shl-int v9, v23, v27

    .line 1004
    .line 1005
    move/from16 v34, v3

    .line 1006
    .line 1007
    iget-object v3, v6, Lkz2;->a:[B

    .line 1008
    .line 1009
    aget-byte v3, v3, v32

    .line 1010
    .line 1011
    and-int/2addr v3, v9

    .line 1012
    if-eqz v3, :cond_28

    .line 1013
    .line 1014
    add-int v3, v14, v15

    .line 1015
    .line 1016
    invoke-virtual {v7, v1, v3}, Loi1;->k(Lmf1;I)V

    .line 1017
    .line 1018
    .line 1019
    move/from16 v29, v5

    .line 1020
    .line 1021
    iget-object v5, v6, Lkz2;->a:[B

    .line 1022
    .line 1023
    aget-byte v5, v5, v32

    .line 1024
    .line 1025
    and-int/2addr v5, v12

    .line 1026
    not-int v9, v9

    .line 1027
    and-int/2addr v5, v9

    .line 1028
    move/from16 v30, v13

    .line 1029
    .line 1030
    int-to-long v12, v5

    .line 1031
    :goto_18
    if-ge v14, v3, :cond_26

    .line 1032
    .line 1033
    const/16 v9, 0x8

    .line 1034
    .line 1035
    shl-long/2addr v12, v9

    .line 1036
    iget-object v5, v6, Lkz2;->a:[B

    .line 1037
    .line 1038
    add-int/lit8 v28, v14, 0x1

    .line 1039
    .line 1040
    aget-byte v5, v5, v14

    .line 1041
    .line 1042
    const/16 v14, 0xff

    .line 1043
    .line 1044
    and-int/2addr v5, v14

    .line 1045
    move/from16 v31, v10

    .line 1046
    .line 1047
    int-to-long v9, v5

    .line 1048
    or-long/2addr v12, v9

    .line 1049
    move/from16 v14, v28

    .line 1050
    .line 1051
    move/from16 v10, v31

    .line 1052
    .line 1053
    goto :goto_18

    .line 1054
    :cond_26
    move/from16 v31, v10

    .line 1055
    .line 1056
    if-lez v31, :cond_27

    .line 1057
    .line 1058
    mul-int/lit8 v15, v15, 0x7

    .line 1059
    .line 1060
    add-int/lit8 v15, v15, 0x6

    .line 1061
    .line 1062
    shl-long v9, v24, v15

    .line 1063
    .line 1064
    add-long v9, v9, v16

    .line 1065
    .line 1066
    sub-long v9, v12, v9

    .line 1067
    .line 1068
    move/from16 v32, v3

    .line 1069
    .line 1070
    goto :goto_19

    .line 1071
    :cond_27
    move/from16 v32, v3

    .line 1072
    .line 1073
    move-wide v9, v12

    .line 1074
    goto :goto_19

    .line 1075
    :cond_28
    move/from16 v29, v5

    .line 1076
    .line 1077
    move/from16 v31, v10

    .line 1078
    .line 1079
    move/from16 v30, v13

    .line 1080
    .line 1081
    add-int/lit8 v15, v15, 0x1

    .line 1082
    .line 1083
    move/from16 v3, v34

    .line 1084
    .line 1085
    const/16 v12, 0xff

    .line 1086
    .line 1087
    goto :goto_17

    .line 1088
    :cond_29
    move/from16 v34, v3

    .line 1089
    .line 1090
    move/from16 v29, v5

    .line 1091
    .line 1092
    move/from16 v31, v10

    .line 1093
    .line 1094
    move/from16 v30, v13

    .line 1095
    .line 1096
    move/from16 v32, v14

    .line 1097
    .line 1098
    move-wide/from16 v9, v18

    .line 1099
    .line 1100
    :goto_19
    const-wide/32 v12, -0x80000000

    .line 1101
    .line 1102
    .line 1103
    cmp-long v3, v9, v12

    .line 1104
    .line 1105
    if-ltz v3, :cond_2b

    .line 1106
    .line 1107
    cmp-long v3, v9, v20

    .line 1108
    .line 1109
    if-gtz v3, :cond_2b

    .line 1110
    .line 1111
    iget-object v3, v7, Loi1;->R:[I

    .line 1112
    .line 1113
    long-to-int v5, v9

    .line 1114
    if-eqz v31, :cond_2a

    .line 1115
    .line 1116
    add-int/lit8 v10, v31, -0x1

    .line 1117
    .line 1118
    aget v9, v3, v10

    .line 1119
    .line 1120
    add-int/2addr v5, v9

    .line 1121
    :cond_2a
    aput v5, v3, v31

    .line 1122
    .line 1123
    add-int v13, v30, v5

    .line 1124
    .line 1125
    add-int/lit8 v10, v31, 0x1

    .line 1126
    .line 1127
    move/from16 v5, v29

    .line 1128
    .line 1129
    move/from16 v3, v34

    .line 1130
    .line 1131
    const/16 v12, 0xff

    .line 1132
    .line 1133
    goto/16 :goto_16

    .line 1134
    .line 1135
    :cond_2b
    const-string v1, "EBML lacing sample size out of range."

    .line 1136
    .line 1137
    const/4 v2, 0x0

    .line 1138
    invoke-static {v2, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v1

    .line 1142
    throw v1

    .line 1143
    :cond_2c
    const/4 v2, 0x0

    .line 1144
    const-string v1, "No valid varint length mask found"

    .line 1145
    .line 1146
    invoke-static {v2, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v1

    .line 1150
    throw v1

    .line 1151
    :cond_2d
    move/from16 v34, v3

    .line 1152
    .line 1153
    move/from16 v29, v5

    .line 1154
    .line 1155
    move/from16 v30, v13

    .line 1156
    .line 1157
    iget-object v3, v7, Loi1;->R:[I

    .line 1158
    .line 1159
    iget v5, v7, Loi1;->T:I

    .line 1160
    .line 1161
    sub-int v5, v29, v5

    .line 1162
    .line 1163
    sub-int v5, v5, v32

    .line 1164
    .line 1165
    sub-int v5, v5, v30

    .line 1166
    .line 1167
    aput v5, v3, v14

    .line 1168
    .line 1169
    :goto_1a
    iget-object v3, v6, Lkz2;->a:[B

    .line 1170
    .line 1171
    aget-byte v5, v3, v34

    .line 1172
    .line 1173
    const/16 v9, 0x8

    .line 1174
    .line 1175
    shl-int/2addr v5, v9

    .line 1176
    const/4 v10, 0x1

    .line 1177
    aget-byte v3, v3, v10

    .line 1178
    .line 1179
    const/16 v14, 0xff

    .line 1180
    .line 1181
    and-int/2addr v3, v14

    .line 1182
    iget-wide v12, v7, Loi1;->K:J

    .line 1183
    .line 1184
    or-int/2addr v3, v5

    .line 1185
    int-to-long v14, v3

    .line 1186
    invoke-virtual {v7, v14, v15}, Loi1;->p(J)J

    .line 1187
    .line 1188
    .line 1189
    move-result-wide v14

    .line 1190
    add-long/2addr v14, v12

    .line 1191
    iput-wide v14, v7, Loi1;->N:J

    .line 1192
    .line 1193
    iget v3, v8, Lni1;->e:I

    .line 1194
    .line 1195
    if-eq v3, v10, :cond_30

    .line 1196
    .line 1197
    const/16 v3, 0xa3

    .line 1198
    .line 1199
    if-ne v11, v3, :cond_2f

    .line 1200
    .line 1201
    iget-object v3, v6, Lkz2;->a:[B

    .line 1202
    .line 1203
    const/4 v10, 0x2

    .line 1204
    aget-byte v3, v3, v10

    .line 1205
    .line 1206
    const/16 v5, 0x80

    .line 1207
    .line 1208
    and-int/2addr v3, v5

    .line 1209
    if-ne v3, v5, :cond_2e

    .line 1210
    .line 1211
    const/4 v3, 0x1

    .line 1212
    :goto_1b
    const/16 v11, 0xa3

    .line 1213
    .line 1214
    goto :goto_1c

    .line 1215
    :cond_2e
    move/from16 v3, v34

    .line 1216
    .line 1217
    goto :goto_1b

    .line 1218
    :cond_2f
    const/4 v10, 0x2

    .line 1219
    move/from16 v3, v34

    .line 1220
    .line 1221
    goto :goto_1c

    .line 1222
    :cond_30
    const/4 v10, 0x2

    .line 1223
    const/4 v3, 0x1

    .line 1224
    :goto_1c
    iput v3, v7, Loi1;->U:I

    .line 1225
    .line 1226
    iput v10, v7, Loi1;->M:I

    .line 1227
    .line 1228
    move/from16 v3, v34

    .line 1229
    .line 1230
    iput v3, v7, Loi1;->P:I

    .line 1231
    .line 1232
    :cond_31
    const/16 v3, 0xa3

    .line 1233
    .line 1234
    goto :goto_1d

    .line 1235
    :cond_32
    const-string v1, "Unexpected lacing value: 2"

    .line 1236
    .line 1237
    const/4 v2, 0x0

    .line 1238
    invoke-static {v2, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v1

    .line 1242
    throw v1

    .line 1243
    :goto_1d
    if-ne v11, v3, :cond_34

    .line 1244
    .line 1245
    :goto_1e
    iget v3, v7, Loi1;->P:I

    .line 1246
    .line 1247
    iget v5, v7, Loi1;->Q:I

    .line 1248
    .line 1249
    if-ge v3, v5, :cond_33

    .line 1250
    .line 1251
    iget-object v5, v7, Loi1;->R:[I

    .line 1252
    .line 1253
    aget v3, v5, v3

    .line 1254
    .line 1255
    const/4 v5, 0x0

    .line 1256
    invoke-virtual {v7, v1, v8, v3, v5}, Loi1;->l(Lmf1;Lni1;IZ)I

    .line 1257
    .line 1258
    .line 1259
    move-result v31

    .line 1260
    iget-wide v5, v7, Loi1;->N:J

    .line 1261
    .line 1262
    iget v3, v7, Loi1;->P:I

    .line 1263
    .line 1264
    iget v9, v8, Lni1;->f:I

    .line 1265
    .line 1266
    mul-int/2addr v3, v9

    .line 1267
    const/16 v9, 0x3e8

    .line 1268
    .line 1269
    div-int/2addr v3, v9

    .line 1270
    int-to-long v9, v3

    .line 1271
    add-long v28, v5, v9

    .line 1272
    .line 1273
    iget v3, v7, Loi1;->U:I

    .line 1274
    .line 1275
    const/16 v32, 0x0

    .line 1276
    .line 1277
    move/from16 v30, v3

    .line 1278
    .line 1279
    move-object/from16 v26, v7

    .line 1280
    .line 1281
    move-object/from16 v27, v8

    .line 1282
    .line 1283
    invoke-virtual/range {v26 .. v32}, Loi1;->j(Lni1;JIII)V

    .line 1284
    .line 1285
    .line 1286
    iget v3, v7, Loi1;->P:I

    .line 1287
    .line 1288
    const/4 v10, 0x1

    .line 1289
    add-int/2addr v3, v10

    .line 1290
    iput v3, v7, Loi1;->P:I

    .line 1291
    .line 1292
    goto :goto_1e

    .line 1293
    :cond_33
    const/4 v3, 0x0

    .line 1294
    const/4 v10, 0x1

    .line 1295
    iput v3, v7, Loi1;->M:I

    .line 1296
    .line 1297
    goto :goto_21

    .line 1298
    :cond_34
    :goto_1f
    const/4 v10, 0x1

    .line 1299
    iget v3, v7, Loi1;->P:I

    .line 1300
    .line 1301
    iget v5, v7, Loi1;->Q:I

    .line 1302
    .line 1303
    if-ge v3, v5, :cond_35

    .line 1304
    .line 1305
    iget-object v5, v7, Loi1;->R:[I

    .line 1306
    .line 1307
    aget v6, v5, v3

    .line 1308
    .line 1309
    invoke-virtual {v7, v1, v8, v6, v10}, Loi1;->l(Lmf1;Lni1;IZ)I

    .line 1310
    .line 1311
    .line 1312
    move-result v6

    .line 1313
    aput v6, v5, v3

    .line 1314
    .line 1315
    iget v3, v7, Loi1;->P:I

    .line 1316
    .line 1317
    add-int/2addr v3, v10

    .line 1318
    iput v3, v7, Loi1;->P:I

    .line 1319
    .line 1320
    goto :goto_1f

    .line 1321
    :cond_35
    :goto_20
    const/4 v3, 0x0

    .line 1322
    :goto_21
    iput v3, v4, Lki1;->e:I

    .line 1323
    .line 1324
    goto/16 :goto_e

    .line 1325
    .line 1326
    :sswitch_2
    move-object v3, v1

    .line 1327
    check-cast v3, Ldf1;

    .line 1328
    .line 1329
    iget-wide v12, v3, Ldf1;->i:J

    .line 1330
    .line 1331
    iget-wide v14, v4, Lki1;->g:J

    .line 1332
    .line 1333
    add-long/2addr v14, v12

    .line 1334
    new-instance v3, Lji1;

    .line 1335
    .line 1336
    invoke-direct {v3, v11, v14, v15}, Lji1;-><init>(IJ)V

    .line 1337
    .line 1338
    .line 1339
    invoke-virtual {v6, v3}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 1340
    .line 1341
    .line 1342
    iget-object v3, v4, Lki1;->d:Lf23;

    .line 1343
    .line 1344
    iget v5, v4, Lki1;->f:I

    .line 1345
    .line 1346
    iget-wide v6, v4, Lki1;->g:J

    .line 1347
    .line 1348
    iget-object v3, v3, Lf23;->g:Ljava/lang/Object;

    .line 1349
    .line 1350
    check-cast v3, Loi1;

    .line 1351
    .line 1352
    iget-object v10, v3, Loi1;->h0:Lnf1;

    .line 1353
    .line 1354
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1355
    .line 1356
    .line 1357
    const/16 v11, 0xa0

    .line 1358
    .line 1359
    if-eq v5, v11, :cond_43

    .line 1360
    .line 1361
    const/16 v11, 0xae

    .line 1362
    .line 1363
    if-eq v5, v11, :cond_42

    .line 1364
    .line 1365
    const/16 v11, 0xb7

    .line 1366
    .line 1367
    if-eq v5, v11, :cond_41

    .line 1368
    .line 1369
    const/16 v11, 0xbb

    .line 1370
    .line 1371
    if-eq v5, v11, :cond_40

    .line 1372
    .line 1373
    const/16 v8, 0x4dbb

    .line 1374
    .line 1375
    if-eq v5, v8, :cond_3f

    .line 1376
    .line 1377
    const/16 v8, 0x5035

    .line 1378
    .line 1379
    if-eq v5, v8, :cond_3e

    .line 1380
    .line 1381
    const/16 v8, 0x55d0

    .line 1382
    .line 1383
    if-eq v5, v8, :cond_3d

    .line 1384
    .line 1385
    const v8, 0x18538067

    .line 1386
    .line 1387
    .line 1388
    if-eq v5, v8, :cond_3a

    .line 1389
    .line 1390
    const v14, 0x1c53bb6b

    .line 1391
    .line 1392
    .line 1393
    if-eq v5, v14, :cond_39

    .line 1394
    .line 1395
    const v6, 0x1f43b675

    .line 1396
    .line 1397
    .line 1398
    if-eq v5, v6, :cond_37

    .line 1399
    .line 1400
    :cond_36
    const/4 v11, 0x1

    .line 1401
    goto :goto_22

    .line 1402
    :cond_37
    iget-boolean v5, v3, Loi1;->y:Z

    .line 1403
    .line 1404
    if-nez v5, :cond_36

    .line 1405
    .line 1406
    iget-boolean v5, v3, Loi1;->c:Z

    .line 1407
    .line 1408
    if-eqz v5, :cond_38

    .line 1409
    .line 1410
    iget-wide v5, v3, Loi1;->I:J

    .line 1411
    .line 1412
    cmp-long v5, v5, v16

    .line 1413
    .line 1414
    if-eqz v5, :cond_38

    .line 1415
    .line 1416
    const/4 v11, 0x1

    .line 1417
    iput-boolean v11, v3, Loi1;->H:Z

    .line 1418
    .line 1419
    :goto_22
    const/4 v6, 0x0

    .line 1420
    goto/16 :goto_24

    .line 1421
    .line 1422
    :cond_38
    const/4 v11, 0x1

    .line 1423
    new-instance v5, Lqf1;

    .line 1424
    .line 1425
    iget-wide v6, v3, Loi1;->u:J

    .line 1426
    .line 1427
    move-wide/from16 v8, v18

    .line 1428
    .line 1429
    invoke-direct {v5, v6, v7, v8, v9}, Lqf1;-><init>(JJ)V

    .line 1430
    .line 1431
    .line 1432
    invoke-interface {v10, v5}, Lnf1;->v(Lcg1;)V

    .line 1433
    .line 1434
    .line 1435
    iput-boolean v11, v3, Loi1;->y:Z

    .line 1436
    .line 1437
    goto :goto_22

    .line 1438
    :cond_39
    const/4 v11, 0x1

    .line 1439
    iput-boolean v11, v3, Loi1;->C:Z

    .line 1440
    .line 1441
    goto :goto_22

    .line 1442
    :cond_3a
    iget-wide v8, v3, Loi1;->r:J

    .line 1443
    .line 1444
    cmp-long v5, v8, v16

    .line 1445
    .line 1446
    if-eqz v5, :cond_3c

    .line 1447
    .line 1448
    cmp-long v5, v8, v12

    .line 1449
    .line 1450
    if-nez v5, :cond_3b

    .line 1451
    .line 1452
    goto :goto_23

    .line 1453
    :cond_3b
    const-string v1, "Multiple Segment elements not supported"

    .line 1454
    .line 1455
    const/4 v2, 0x0

    .line 1456
    invoke-static {v2, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 1457
    .line 1458
    .line 1459
    move-result-object v1

    .line 1460
    throw v1

    .line 1461
    :cond_3c
    :goto_23
    iput-wide v12, v3, Loi1;->r:J

    .line 1462
    .line 1463
    iput-wide v6, v3, Loi1;->q:J

    .line 1464
    .line 1465
    goto :goto_22

    .line 1466
    :cond_3d
    invoke-virtual {v3, v5}, Loi1;->h(I)V

    .line 1467
    .line 1468
    .line 1469
    iget-object v3, v3, Loi1;->x:Lni1;

    .line 1470
    .line 1471
    const/4 v10, 0x1

    .line 1472
    iput-boolean v10, v3, Lni1;->z:Z

    .line 1473
    .line 1474
    goto :goto_22

    .line 1475
    :cond_3e
    const/4 v10, 0x1

    .line 1476
    invoke-virtual {v3, v5}, Loi1;->h(I)V

    .line 1477
    .line 1478
    .line 1479
    iget-object v3, v3, Loi1;->x:Lni1;

    .line 1480
    .line 1481
    iput-boolean v10, v3, Lni1;->i:Z

    .line 1482
    .line 1483
    goto :goto_22

    .line 1484
    :cond_3f
    move/from16 v15, v33

    .line 1485
    .line 1486
    iput v15, v3, Loi1;->z:I

    .line 1487
    .line 1488
    move-wide/from16 v6, v16

    .line 1489
    .line 1490
    iput-wide v6, v3, Loi1;->A:J

    .line 1491
    .line 1492
    goto :goto_22

    .line 1493
    :cond_40
    move-wide/from16 v6, v16

    .line 1494
    .line 1495
    move/from16 v15, v33

    .line 1496
    .line 1497
    invoke-virtual {v3, v5}, Loi1;->i(I)V

    .line 1498
    .line 1499
    .line 1500
    iput-wide v8, v3, Loi1;->D:J

    .line 1501
    .line 1502
    goto :goto_22

    .line 1503
    :cond_41
    move-wide/from16 v6, v16

    .line 1504
    .line 1505
    move/from16 v15, v33

    .line 1506
    .line 1507
    invoke-virtual {v3, v5}, Loi1;->i(I)V

    .line 1508
    .line 1509
    .line 1510
    iput v15, v3, Loi1;->E:I

    .line 1511
    .line 1512
    iput-wide v6, v3, Loi1;->F:J

    .line 1513
    .line 1514
    goto :goto_22

    .line 1515
    :cond_42
    move/from16 v15, v33

    .line 1516
    .line 1517
    new-instance v5, Lni1;

    .line 1518
    .line 1519
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 1520
    .line 1521
    .line 1522
    iput v15, v5, Lni1;->n:I

    .line 1523
    .line 1524
    iput v15, v5, Lni1;->o:I

    .line 1525
    .line 1526
    iput v15, v5, Lni1;->p:I

    .line 1527
    .line 1528
    iput v15, v5, Lni1;->q:I

    .line 1529
    .line 1530
    iput v15, v5, Lni1;->r:I

    .line 1531
    .line 1532
    const/4 v6, 0x0

    .line 1533
    iput v6, v5, Lni1;->s:I

    .line 1534
    .line 1535
    iput v15, v5, Lni1;->t:I

    .line 1536
    .line 1537
    const/4 v7, 0x0

    .line 1538
    iput v7, v5, Lni1;->u:F

    .line 1539
    .line 1540
    iput v7, v5, Lni1;->v:F

    .line 1541
    .line 1542
    iput v7, v5, Lni1;->w:F

    .line 1543
    .line 1544
    const/4 v7, 0x0

    .line 1545
    iput-object v7, v5, Lni1;->x:[B

    .line 1546
    .line 1547
    iput v15, v5, Lni1;->y:I

    .line 1548
    .line 1549
    iput-boolean v6, v5, Lni1;->z:Z

    .line 1550
    .line 1551
    iput v15, v5, Lni1;->A:I

    .line 1552
    .line 1553
    iput v15, v5, Lni1;->B:I

    .line 1554
    .line 1555
    iput v15, v5, Lni1;->C:I

    .line 1556
    .line 1557
    const/16 v9, 0x3e8

    .line 1558
    .line 1559
    iput v9, v5, Lni1;->D:I

    .line 1560
    .line 1561
    const/16 v6, 0xc8

    .line 1562
    .line 1563
    iput v6, v5, Lni1;->E:I

    .line 1564
    .line 1565
    const/high16 v6, -0x40800000    # -1.0f

    .line 1566
    .line 1567
    iput v6, v5, Lni1;->F:F

    .line 1568
    .line 1569
    iput v6, v5, Lni1;->G:F

    .line 1570
    .line 1571
    iput v6, v5, Lni1;->H:F

    .line 1572
    .line 1573
    iput v6, v5, Lni1;->I:F

    .line 1574
    .line 1575
    iput v6, v5, Lni1;->J:F

    .line 1576
    .line 1577
    iput v6, v5, Lni1;->K:F

    .line 1578
    .line 1579
    iput v6, v5, Lni1;->L:F

    .line 1580
    .line 1581
    iput v6, v5, Lni1;->M:F

    .line 1582
    .line 1583
    iput v6, v5, Lni1;->N:F

    .line 1584
    .line 1585
    iput v6, v5, Lni1;->O:F

    .line 1586
    .line 1587
    const/4 v10, 0x1

    .line 1588
    iput v10, v5, Lni1;->Q:I

    .line 1589
    .line 1590
    const/4 v15, -0x1

    .line 1591
    iput v15, v5, Lni1;->R:I

    .line 1592
    .line 1593
    const/16 v6, 0x1f40

    .line 1594
    .line 1595
    iput v6, v5, Lni1;->S:I

    .line 1596
    .line 1597
    const-wide/16 v8, 0x0

    .line 1598
    .line 1599
    iput-wide v8, v5, Lni1;->T:J

    .line 1600
    .line 1601
    iput-wide v8, v5, Lni1;->U:J

    .line 1602
    .line 1603
    const/4 v6, 0x0

    .line 1604
    iput-boolean v6, v5, Lni1;->W:Z

    .line 1605
    .line 1606
    iput-boolean v10, v5, Lni1;->Y:Z

    .line 1607
    .line 1608
    const-string v7, "eng"

    .line 1609
    .line 1610
    iput-object v7, v5, Lni1;->Z:Ljava/lang/String;

    .line 1611
    .line 1612
    iput-object v5, v3, Loi1;->x:Lni1;

    .line 1613
    .line 1614
    iget-boolean v3, v3, Loi1;->v:Z

    .line 1615
    .line 1616
    iput-boolean v3, v5, Lni1;->a:Z

    .line 1617
    .line 1618
    goto :goto_24

    .line 1619
    :cond_43
    move-wide/from16 v8, v18

    .line 1620
    .line 1621
    const/4 v6, 0x0

    .line 1622
    iput-boolean v6, v3, Loi1;->W:Z

    .line 1623
    .line 1624
    iput-wide v8, v3, Loi1;->X:J

    .line 1625
    .line 1626
    :goto_24
    iput v6, v4, Lki1;->e:I

    .line 1627
    .line 1628
    move v3, v6

    .line 1629
    goto/16 :goto_e

    .line 1630
    .line 1631
    :sswitch_3
    move v6, v3

    .line 1632
    iget-wide v8, v4, Lki1;->g:J

    .line 1633
    .line 1634
    cmp-long v3, v8, v20

    .line 1635
    .line 1636
    if-gtz v3, :cond_4c

    .line 1637
    .line 1638
    long-to-int v3, v8

    .line 1639
    if-nez v3, :cond_44

    .line 1640
    .line 1641
    const-string v3, ""

    .line 1642
    .line 1643
    goto :goto_26

    .line 1644
    :cond_44
    new-array v5, v3, [B

    .line 1645
    .line 1646
    move-object v8, v1

    .line 1647
    check-cast v8, Ldf1;

    .line 1648
    .line 1649
    invoke-virtual {v8, v5, v6, v3, v6}, Ldf1;->w([BIIZ)Z

    .line 1650
    .line 1651
    .line 1652
    :goto_25
    if-lez v3, :cond_45

    .line 1653
    .line 1654
    add-int/lit8 v8, v3, -0x1

    .line 1655
    .line 1656
    aget-byte v9, v5, v8

    .line 1657
    .line 1658
    if-nez v9, :cond_45

    .line 1659
    .line 1660
    move v3, v8

    .line 1661
    goto :goto_25

    .line 1662
    :cond_45
    new-instance v8, Ljava/lang/String;

    .line 1663
    .line 1664
    invoke-direct {v8, v5, v6, v3}, Ljava/lang/String;-><init>([BII)V

    .line 1665
    .line 1666
    .line 1667
    move-object v3, v8

    .line 1668
    :goto_26
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1669
    .line 1670
    .line 1671
    const/16 v5, 0x86

    .line 1672
    .line 1673
    if-eq v11, v5, :cond_4b

    .line 1674
    .line 1675
    const/16 v5, 0x4282

    .line 1676
    .line 1677
    if-eq v11, v5, :cond_48

    .line 1678
    .line 1679
    const/16 v5, 0x536e

    .line 1680
    .line 1681
    if-eq v11, v5, :cond_47

    .line 1682
    .line 1683
    const v5, 0x22b59c

    .line 1684
    .line 1685
    .line 1686
    if-eq v11, v5, :cond_46

    .line 1687
    .line 1688
    :goto_27
    const/4 v3, 0x0

    .line 1689
    goto :goto_29

    .line 1690
    :cond_46
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 1691
    .line 1692
    .line 1693
    iget-object v5, v7, Loi1;->x:Lni1;

    .line 1694
    .line 1695
    iput-object v3, v5, Lni1;->Z:Ljava/lang/String;

    .line 1696
    .line 1697
    goto :goto_27

    .line 1698
    :cond_47
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 1699
    .line 1700
    .line 1701
    iget-object v5, v7, Loi1;->x:Lni1;

    .line 1702
    .line 1703
    iput-object v3, v5, Lni1;->b:Ljava/lang/String;

    .line 1704
    .line 1705
    goto :goto_27

    .line 1706
    :cond_48
    const-string v5, "webm"

    .line 1707
    .line 1708
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1709
    .line 1710
    .line 1711
    move-result v6

    .line 1712
    if-nez v6, :cond_4a

    .line 1713
    .line 1714
    const-string v6, "matroska"

    .line 1715
    .line 1716
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1717
    .line 1718
    .line 1719
    move-result v6

    .line 1720
    if-eqz v6, :cond_49

    .line 1721
    .line 1722
    goto :goto_28

    .line 1723
    :cond_49
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 1724
    .line 1725
    .line 1726
    move-result v1

    .line 1727
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1728
    .line 1729
    add-int/lit8 v1, v1, 0x16

    .line 1730
    .line 1731
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1732
    .line 1733
    .line 1734
    const-string v1, "DocType "

    .line 1735
    .line 1736
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1737
    .line 1738
    .line 1739
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1740
    .line 1741
    .line 1742
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1743
    .line 1744
    .line 1745
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1746
    .line 1747
    .line 1748
    move-result-object v1

    .line 1749
    const/4 v2, 0x0

    .line 1750
    invoke-static {v2, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 1751
    .line 1752
    .line 1753
    move-result-object v1

    .line 1754
    throw v1

    .line 1755
    :cond_4a
    :goto_28
    invoke-virtual {v3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1756
    .line 1757
    .line 1758
    move-result v3

    .line 1759
    iput-boolean v3, v7, Loi1;->v:Z

    .line 1760
    .line 1761
    goto :goto_27

    .line 1762
    :cond_4b
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 1763
    .line 1764
    .line 1765
    iget-object v5, v7, Loi1;->x:Lni1;

    .line 1766
    .line 1767
    iput-object v3, v5, Lni1;->c:Ljava/lang/String;

    .line 1768
    .line 1769
    goto :goto_27

    .line 1770
    :goto_29
    iput v3, v4, Lki1;->e:I

    .line 1771
    .line 1772
    goto/16 :goto_e

    .line 1773
    .line 1774
    :cond_4c
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 1775
    .line 1776
    .line 1777
    move-result-object v1

    .line 1778
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1779
    .line 1780
    .line 1781
    move-result v1

    .line 1782
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1783
    .line 1784
    add-int/lit8 v1, v1, 0x15

    .line 1785
    .line 1786
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1787
    .line 1788
    .line 1789
    const-string v1, "String element size: "

    .line 1790
    .line 1791
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1792
    .line 1793
    .line 1794
    invoke-virtual {v2, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1795
    .line 1796
    .line 1797
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1798
    .line 1799
    .line 1800
    move-result-object v1

    .line 1801
    const/4 v2, 0x0

    .line 1802
    invoke-static {v2, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 1803
    .line 1804
    .line 1805
    move-result-object v1

    .line 1806
    throw v1

    .line 1807
    :sswitch_4
    iget-wide v5, v4, Lki1;->g:J

    .line 1808
    .line 1809
    cmp-long v3, v5, v28

    .line 1810
    .line 1811
    if-gtz v3, :cond_6c

    .line 1812
    .line 1813
    long-to-int v3, v5

    .line 1814
    invoke-virtual {v4, v1, v3}, Lki1;->a(Lmf1;I)J

    .line 1815
    .line 1816
    .line 1817
    move-result-wide v5

    .line 1818
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1819
    .line 1820
    .line 1821
    const/16 v3, 0x5031

    .line 1822
    .line 1823
    if-eq v11, v3, :cond_65

    .line 1824
    .line 1825
    const/16 v3, 0x5032

    .line 1826
    .line 1827
    if-eq v11, v3, :cond_63

    .line 1828
    .line 1829
    const/16 v3, 0x21

    .line 1830
    .line 1831
    sparse-switch v11, :sswitch_data_1

    .line 1832
    .line 1833
    .line 1834
    packed-switch v11, :pswitch_data_2

    .line 1835
    .line 1836
    .line 1837
    goto/16 :goto_2e

    .line 1838
    .line 1839
    :pswitch_d
    long-to-int v3, v5

    .line 1840
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 1841
    .line 1842
    .line 1843
    iget-object v5, v7, Loi1;->x:Lni1;

    .line 1844
    .line 1845
    iput v3, v5, Lni1;->E:I

    .line 1846
    .line 1847
    :cond_4d
    :goto_2a
    const/4 v3, 0x0

    .line 1848
    goto/16 :goto_2f

    .line 1849
    .line 1850
    :pswitch_e
    long-to-int v3, v5

    .line 1851
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 1852
    .line 1853
    .line 1854
    iget-object v5, v7, Loi1;->x:Lni1;

    .line 1855
    .line 1856
    iput v3, v5, Lni1;->D:I

    .line 1857
    .line 1858
    goto :goto_2a

    .line 1859
    :pswitch_f
    long-to-int v3, v5

    .line 1860
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 1861
    .line 1862
    .line 1863
    iget-object v5, v7, Loi1;->x:Lni1;

    .line 1864
    .line 1865
    const/4 v10, 0x1

    .line 1866
    iput-boolean v10, v5, Lni1;->z:Z

    .line 1867
    .line 1868
    invoke-static {v3}, Ln74;->b(I)I

    .line 1869
    .line 1870
    .line 1871
    move-result v3

    .line 1872
    const/4 v15, -0x1

    .line 1873
    if-eq v3, v15, :cond_4d

    .line 1874
    .line 1875
    iget-object v5, v7, Loi1;->x:Lni1;

    .line 1876
    .line 1877
    iput v3, v5, Lni1;->A:I

    .line 1878
    .line 1879
    goto :goto_2a

    .line 1880
    :pswitch_10
    const/4 v15, -0x1

    .line 1881
    long-to-int v3, v5

    .line 1882
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 1883
    .line 1884
    .line 1885
    invoke-static {v3}, Ln74;->c(I)I

    .line 1886
    .line 1887
    .line 1888
    move-result v3

    .line 1889
    if-eq v3, v15, :cond_4d

    .line 1890
    .line 1891
    iget-object v5, v7, Loi1;->x:Lni1;

    .line 1892
    .line 1893
    iput v3, v5, Lni1;->B:I

    .line 1894
    .line 1895
    goto :goto_2a

    .line 1896
    :pswitch_11
    long-to-int v3, v5

    .line 1897
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 1898
    .line 1899
    .line 1900
    const/4 v10, 0x1

    .line 1901
    if-eq v3, v10, :cond_4f

    .line 1902
    .line 1903
    const/4 v8, 0x2

    .line 1904
    if-eq v3, v8, :cond_4e

    .line 1905
    .line 1906
    goto/16 :goto_2e

    .line 1907
    .line 1908
    :cond_4e
    iget-object v3, v7, Loi1;->x:Lni1;

    .line 1909
    .line 1910
    iput v10, v3, Lni1;->C:I

    .line 1911
    .line 1912
    goto :goto_2a

    .line 1913
    :cond_4f
    const/4 v8, 0x2

    .line 1914
    iget-object v3, v7, Loi1;->x:Lni1;

    .line 1915
    .line 1916
    iput v8, v3, Lni1;->C:I

    .line 1917
    .line 1918
    goto :goto_2a

    .line 1919
    :sswitch_5
    iput-wide v5, v7, Loi1;->s:J

    .line 1920
    .line 1921
    goto :goto_2a

    .line 1922
    :sswitch_6
    long-to-int v3, v5

    .line 1923
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 1924
    .line 1925
    .line 1926
    iget-object v5, v7, Loi1;->x:Lni1;

    .line 1927
    .line 1928
    iput v3, v5, Lni1;->f:I

    .line 1929
    .line 1930
    goto :goto_2a

    .line 1931
    :sswitch_7
    long-to-int v3, v5

    .line 1932
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 1933
    .line 1934
    .line 1935
    if-eqz v3, :cond_53

    .line 1936
    .line 1937
    const/4 v10, 0x1

    .line 1938
    if-eq v3, v10, :cond_52

    .line 1939
    .line 1940
    const/4 v8, 0x2

    .line 1941
    if-eq v3, v8, :cond_51

    .line 1942
    .line 1943
    const/4 v9, 0x3

    .line 1944
    if-eq v3, v9, :cond_50

    .line 1945
    .line 1946
    goto/16 :goto_2e

    .line 1947
    .line 1948
    :cond_50
    iget-object v3, v7, Loi1;->x:Lni1;

    .line 1949
    .line 1950
    iput v9, v3, Lni1;->t:I

    .line 1951
    .line 1952
    goto :goto_2a

    .line 1953
    :cond_51
    iget-object v3, v7, Loi1;->x:Lni1;

    .line 1954
    .line 1955
    iput v8, v3, Lni1;->t:I

    .line 1956
    .line 1957
    goto :goto_2a

    .line 1958
    :cond_52
    iget-object v3, v7, Loi1;->x:Lni1;

    .line 1959
    .line 1960
    iput v10, v3, Lni1;->t:I

    .line 1961
    .line 1962
    goto :goto_2a

    .line 1963
    :cond_53
    iget-object v3, v7, Loi1;->x:Lni1;

    .line 1964
    .line 1965
    const/4 v6, 0x0

    .line 1966
    iput v6, v3, Lni1;->t:I

    .line 1967
    .line 1968
    :goto_2b
    move v3, v6

    .line 1969
    goto/16 :goto_2f

    .line 1970
    .line 1971
    :sswitch_8
    iput-wide v5, v7, Loi1;->X:J

    .line 1972
    .line 1973
    goto :goto_2a

    .line 1974
    :sswitch_9
    long-to-int v3, v5

    .line 1975
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 1976
    .line 1977
    .line 1978
    iget-object v5, v7, Loi1;->x:Lni1;

    .line 1979
    .line 1980
    iput v3, v5, Lni1;->R:I

    .line 1981
    .line 1982
    goto/16 :goto_2a

    .line 1983
    .line 1984
    :sswitch_a
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 1985
    .line 1986
    .line 1987
    iget-object v3, v7, Loi1;->x:Lni1;

    .line 1988
    .line 1989
    iput-wide v5, v3, Lni1;->U:J

    .line 1990
    .line 1991
    goto/16 :goto_2a

    .line 1992
    .line 1993
    :sswitch_b
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 1994
    .line 1995
    .line 1996
    iget-object v3, v7, Loi1;->x:Lni1;

    .line 1997
    .line 1998
    iput-wide v5, v3, Lni1;->T:J

    .line 1999
    .line 2000
    goto/16 :goto_2a

    .line 2001
    .line 2002
    :sswitch_c
    long-to-int v3, v5

    .line 2003
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 2004
    .line 2005
    .line 2006
    iget-object v5, v7, Loi1;->x:Lni1;

    .line 2007
    .line 2008
    iput v3, v5, Lni1;->g:I

    .line 2009
    .line 2010
    goto/16 :goto_2a

    .line 2011
    .line 2012
    :sswitch_d
    long-to-int v3, v5

    .line 2013
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 2014
    .line 2015
    .line 2016
    iget-object v5, v7, Loi1;->x:Lni1;

    .line 2017
    .line 2018
    const/4 v10, 0x1

    .line 2019
    iput-boolean v10, v5, Lni1;->z:Z

    .line 2020
    .line 2021
    iput v3, v5, Lni1;->p:I

    .line 2022
    .line 2023
    goto/16 :goto_2a

    .line 2024
    .line 2025
    :sswitch_e
    cmp-long v3, v5, v24

    .line 2026
    .line 2027
    if-nez v3, :cond_54

    .line 2028
    .line 2029
    const/4 v3, 0x1

    .line 2030
    goto :goto_2c

    .line 2031
    :cond_54
    const/4 v3, 0x0

    .line 2032
    :goto_2c
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 2033
    .line 2034
    .line 2035
    iget-object v5, v7, Loi1;->x:Lni1;

    .line 2036
    .line 2037
    iput-boolean v3, v5, Lni1;->X:Z

    .line 2038
    .line 2039
    goto/16 :goto_2a

    .line 2040
    .line 2041
    :sswitch_f
    long-to-int v3, v5

    .line 2042
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 2043
    .line 2044
    .line 2045
    iget-object v5, v7, Loi1;->x:Lni1;

    .line 2046
    .line 2047
    iput v3, v5, Lni1;->r:I

    .line 2048
    .line 2049
    goto/16 :goto_2a

    .line 2050
    .line 2051
    :sswitch_10
    long-to-int v3, v5

    .line 2052
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 2053
    .line 2054
    .line 2055
    iget-object v5, v7, Loi1;->x:Lni1;

    .line 2056
    .line 2057
    iput v3, v5, Lni1;->s:I

    .line 2058
    .line 2059
    goto/16 :goto_2a

    .line 2060
    .line 2061
    :sswitch_11
    long-to-int v3, v5

    .line 2062
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 2063
    .line 2064
    .line 2065
    iget-object v5, v7, Loi1;->x:Lni1;

    .line 2066
    .line 2067
    iput v3, v5, Lni1;->q:I

    .line 2068
    .line 2069
    goto/16 :goto_2a

    .line 2070
    .line 2071
    :sswitch_12
    long-to-int v3, v5

    .line 2072
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 2073
    .line 2074
    .line 2075
    if-eqz v3, :cond_58

    .line 2076
    .line 2077
    const/4 v10, 0x1

    .line 2078
    if-eq v3, v10, :cond_57

    .line 2079
    .line 2080
    const/4 v9, 0x3

    .line 2081
    if-eq v3, v9, :cond_56

    .line 2082
    .line 2083
    move/from16 v5, v27

    .line 2084
    .line 2085
    if-eq v3, v5, :cond_55

    .line 2086
    .line 2087
    goto/16 :goto_2e

    .line 2088
    .line 2089
    :cond_55
    iget-object v3, v7, Loi1;->x:Lni1;

    .line 2090
    .line 2091
    iput v9, v3, Lni1;->y:I

    .line 2092
    .line 2093
    goto/16 :goto_2a

    .line 2094
    .line 2095
    :cond_56
    iget-object v3, v7, Loi1;->x:Lni1;

    .line 2096
    .line 2097
    iput v10, v3, Lni1;->y:I

    .line 2098
    .line 2099
    goto/16 :goto_2a

    .line 2100
    .line 2101
    :cond_57
    iget-object v3, v7, Loi1;->x:Lni1;

    .line 2102
    .line 2103
    const/4 v8, 0x2

    .line 2104
    iput v8, v3, Lni1;->y:I

    .line 2105
    .line 2106
    goto/16 :goto_2a

    .line 2107
    .line 2108
    :cond_58
    iget-object v3, v7, Loi1;->x:Lni1;

    .line 2109
    .line 2110
    const/4 v6, 0x0

    .line 2111
    iput v6, v3, Lni1;->y:I

    .line 2112
    .line 2113
    goto/16 :goto_2b

    .line 2114
    .line 2115
    :sswitch_13
    iget-wide v8, v7, Loi1;->r:J

    .line 2116
    .line 2117
    add-long/2addr v5, v8

    .line 2118
    iput-wide v5, v7, Loi1;->A:J

    .line 2119
    .line 2120
    goto/16 :goto_2a

    .line 2121
    .line 2122
    :sswitch_14
    cmp-long v3, v5, v24

    .line 2123
    .line 2124
    if-nez v3, :cond_59

    .line 2125
    .line 2126
    goto/16 :goto_2e

    .line 2127
    .line 2128
    :cond_59
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 2129
    .line 2130
    .line 2131
    move-result-object v1

    .line 2132
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 2133
    .line 2134
    .line 2135
    move-result v1

    .line 2136
    new-instance v2, Ljava/lang/StringBuilder;

    .line 2137
    .line 2138
    add-int/lit8 v1, v1, 0x24

    .line 2139
    .line 2140
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 2141
    .line 2142
    .line 2143
    const-string v1, "AESSettingsCipherMode "

    .line 2144
    .line 2145
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2146
    .line 2147
    .line 2148
    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 2149
    .line 2150
    .line 2151
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2152
    .line 2153
    .line 2154
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2155
    .line 2156
    .line 2157
    move-result-object v1

    .line 2158
    const/4 v2, 0x0

    .line 2159
    invoke-static {v2, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 2160
    .line 2161
    .line 2162
    move-result-object v1

    .line 2163
    throw v1

    .line 2164
    :sswitch_15
    const-wide/16 v7, 0x5

    .line 2165
    .line 2166
    cmp-long v3, v5, v7

    .line 2167
    .line 2168
    if-nez v3, :cond_5a

    .line 2169
    .line 2170
    goto/16 :goto_2e

    .line 2171
    .line 2172
    :cond_5a
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 2173
    .line 2174
    .line 2175
    move-result-object v1

    .line 2176
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 2177
    .line 2178
    .line 2179
    move-result v1

    .line 2180
    new-instance v2, Ljava/lang/StringBuilder;

    .line 2181
    .line 2182
    add-int/lit8 v1, v1, 0x1d

    .line 2183
    .line 2184
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 2185
    .line 2186
    .line 2187
    const-string v1, "ContentEncAlgo "

    .line 2188
    .line 2189
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2190
    .line 2191
    .line 2192
    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 2193
    .line 2194
    .line 2195
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2196
    .line 2197
    .line 2198
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2199
    .line 2200
    .line 2201
    move-result-object v1

    .line 2202
    const/4 v2, 0x0

    .line 2203
    invoke-static {v2, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 2204
    .line 2205
    .line 2206
    move-result-object v1

    .line 2207
    throw v1

    .line 2208
    :sswitch_16
    cmp-long v3, v5, v24

    .line 2209
    .line 2210
    if-nez v3, :cond_5b

    .line 2211
    .line 2212
    goto/16 :goto_2e

    .line 2213
    .line 2214
    :cond_5b
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 2215
    .line 2216
    .line 2217
    move-result-object v1

    .line 2218
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 2219
    .line 2220
    .line 2221
    move-result v1

    .line 2222
    add-int/lit8 v1, v1, 0x1e

    .line 2223
    .line 2224
    new-instance v2, Ljava/lang/StringBuilder;

    .line 2225
    .line 2226
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 2227
    .line 2228
    .line 2229
    const-string v1, "EBMLReadVersion "

    .line 2230
    .line 2231
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2232
    .line 2233
    .line 2234
    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 2235
    .line 2236
    .line 2237
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2238
    .line 2239
    .line 2240
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2241
    .line 2242
    .line 2243
    move-result-object v1

    .line 2244
    const/4 v2, 0x0

    .line 2245
    invoke-static {v2, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 2246
    .line 2247
    .line 2248
    move-result-object v1

    .line 2249
    throw v1

    .line 2250
    :sswitch_17
    cmp-long v7, v5, v24

    .line 2251
    .line 2252
    if-ltz v7, :cond_5c

    .line 2253
    .line 2254
    const-wide/16 v7, 0x2

    .line 2255
    .line 2256
    cmp-long v7, v5, v7

    .line 2257
    .line 2258
    if-gtz v7, :cond_5c

    .line 2259
    .line 2260
    goto/16 :goto_2e

    .line 2261
    .line 2262
    :cond_5c
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 2263
    .line 2264
    .line 2265
    move-result-object v1

    .line 2266
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 2267
    .line 2268
    .line 2269
    move-result v1

    .line 2270
    new-instance v2, Ljava/lang/StringBuilder;

    .line 2271
    .line 2272
    add-int/2addr v1, v3

    .line 2273
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 2274
    .line 2275
    .line 2276
    const-string v1, "DocTypeReadVersion "

    .line 2277
    .line 2278
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2279
    .line 2280
    .line 2281
    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 2282
    .line 2283
    .line 2284
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2285
    .line 2286
    .line 2287
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2288
    .line 2289
    .line 2290
    move-result-object v1

    .line 2291
    const/4 v2, 0x0

    .line 2292
    invoke-static {v2, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 2293
    .line 2294
    .line 2295
    move-result-object v1

    .line 2296
    throw v1

    .line 2297
    :sswitch_18
    const-wide/16 v7, 0x3

    .line 2298
    .line 2299
    cmp-long v3, v5, v7

    .line 2300
    .line 2301
    if-nez v3, :cond_5d

    .line 2302
    .line 2303
    goto/16 :goto_2e

    .line 2304
    .line 2305
    :cond_5d
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 2306
    .line 2307
    .line 2308
    move-result-object v1

    .line 2309
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 2310
    .line 2311
    .line 2312
    move-result v1

    .line 2313
    add-int/lit8 v1, v1, 0x1e

    .line 2314
    .line 2315
    new-instance v2, Ljava/lang/StringBuilder;

    .line 2316
    .line 2317
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 2318
    .line 2319
    .line 2320
    const-string v1, "ContentCompAlgo "

    .line 2321
    .line 2322
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2323
    .line 2324
    .line 2325
    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 2326
    .line 2327
    .line 2328
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2329
    .line 2330
    .line 2331
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2332
    .line 2333
    .line 2334
    move-result-object v1

    .line 2335
    const/4 v2, 0x0

    .line 2336
    invoke-static {v2, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 2337
    .line 2338
    .line 2339
    move-result-object v1

    .line 2340
    throw v1

    .line 2341
    :sswitch_19
    long-to-int v3, v5

    .line 2342
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 2343
    .line 2344
    .line 2345
    iget-object v5, v7, Loi1;->x:Lni1;

    .line 2346
    .line 2347
    iput v3, v5, Lni1;->h:I

    .line 2348
    .line 2349
    goto/16 :goto_2a

    .line 2350
    .line 2351
    :sswitch_1a
    const/4 v10, 0x1

    .line 2352
    iput-boolean v10, v7, Loi1;->W:Z

    .line 2353
    .line 2354
    goto/16 :goto_2a

    .line 2355
    .line 2356
    :sswitch_1b
    long-to-int v3, v5

    .line 2357
    invoke-virtual {v7, v11}, Loi1;->i(I)V

    .line 2358
    .line 2359
    .line 2360
    iput v3, v7, Loi1;->E:I

    .line 2361
    .line 2362
    goto/16 :goto_2a

    .line 2363
    .line 2364
    :sswitch_1c
    invoke-virtual {v7, v11}, Loi1;->i(I)V

    .line 2365
    .line 2366
    .line 2367
    iget-wide v8, v7, Loi1;->F:J

    .line 2368
    .line 2369
    const-wide/16 v16, -0x1

    .line 2370
    .line 2371
    cmp-long v3, v8, v16

    .line 2372
    .line 2373
    if-nez v3, :cond_4d

    .line 2374
    .line 2375
    iput-wide v5, v7, Loi1;->F:J

    .line 2376
    .line 2377
    goto/16 :goto_2a

    .line 2378
    .line 2379
    :sswitch_1d
    long-to-int v3, v5

    .line 2380
    iput v3, v7, Loi1;->V:I

    .line 2381
    .line 2382
    goto/16 :goto_2a

    .line 2383
    .line 2384
    :sswitch_1e
    invoke-virtual {v7, v5, v6}, Loi1;->p(J)J

    .line 2385
    .line 2386
    .line 2387
    move-result-wide v5

    .line 2388
    iput-wide v5, v7, Loi1;->K:J

    .line 2389
    .line 2390
    goto/16 :goto_2a

    .line 2391
    .line 2392
    :sswitch_1f
    long-to-int v3, v5

    .line 2393
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 2394
    .line 2395
    .line 2396
    iget-object v5, v7, Loi1;->x:Lni1;

    .line 2397
    .line 2398
    iput v3, v5, Lni1;->d:I

    .line 2399
    .line 2400
    goto/16 :goto_2a

    .line 2401
    .line 2402
    :sswitch_20
    long-to-int v3, v5

    .line 2403
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 2404
    .line 2405
    .line 2406
    iget-object v5, v7, Loi1;->x:Lni1;

    .line 2407
    .line 2408
    iput v3, v5, Lni1;->o:I

    .line 2409
    .line 2410
    goto/16 :goto_2a

    .line 2411
    .line 2412
    :sswitch_21
    invoke-virtual {v7, v11}, Loi1;->i(I)V

    .line 2413
    .line 2414
    .line 2415
    invoke-virtual {v7, v5, v6}, Loi1;->p(J)J

    .line 2416
    .line 2417
    .line 2418
    move-result-wide v5

    .line 2419
    iput-wide v5, v7, Loi1;->D:J

    .line 2420
    .line 2421
    goto/16 :goto_2a

    .line 2422
    .line 2423
    :sswitch_22
    long-to-int v3, v5

    .line 2424
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 2425
    .line 2426
    .line 2427
    iget-object v5, v7, Loi1;->x:Lni1;

    .line 2428
    .line 2429
    iput v3, v5, Lni1;->n:I

    .line 2430
    .line 2431
    goto/16 :goto_2a

    .line 2432
    .line 2433
    :sswitch_23
    long-to-int v3, v5

    .line 2434
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 2435
    .line 2436
    .line 2437
    iget-object v5, v7, Loi1;->x:Lni1;

    .line 2438
    .line 2439
    iput v3, v5, Lni1;->Q:I

    .line 2440
    .line 2441
    goto/16 :goto_2a

    .line 2442
    .line 2443
    :sswitch_24
    invoke-virtual {v7, v5, v6}, Loi1;->p(J)J

    .line 2444
    .line 2445
    .line 2446
    move-result-wide v5

    .line 2447
    iput-wide v5, v7, Loi1;->O:J

    .line 2448
    .line 2449
    goto/16 :goto_2a

    .line 2450
    .line 2451
    :sswitch_25
    cmp-long v3, v5, v24

    .line 2452
    .line 2453
    if-nez v3, :cond_5e

    .line 2454
    .line 2455
    const/4 v3, 0x1

    .line 2456
    goto :goto_2d

    .line 2457
    :cond_5e
    const/4 v3, 0x0

    .line 2458
    :goto_2d
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 2459
    .line 2460
    .line 2461
    iget-object v5, v7, Loi1;->x:Lni1;

    .line 2462
    .line 2463
    iput-boolean v3, v5, Lni1;->Y:Z

    .line 2464
    .line 2465
    goto/16 :goto_2a

    .line 2466
    .line 2467
    :sswitch_26
    long-to-int v5, v5

    .line 2468
    const/4 v10, 0x1

    .line 2469
    if-eq v5, v10, :cond_62

    .line 2470
    .line 2471
    const/4 v8, 0x2

    .line 2472
    if-eq v5, v8, :cond_61

    .line 2473
    .line 2474
    const/16 v6, 0x11

    .line 2475
    .line 2476
    if-eq v5, v6, :cond_60

    .line 2477
    .line 2478
    if-eq v5, v3, :cond_5f

    .line 2479
    .line 2480
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 2481
    .line 2482
    .line 2483
    iget-object v3, v7, Loi1;->x:Lni1;

    .line 2484
    .line 2485
    const/4 v15, -0x1

    .line 2486
    iput v15, v3, Lni1;->e:I

    .line 2487
    .line 2488
    goto/16 :goto_2a

    .line 2489
    .line 2490
    :cond_5f
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 2491
    .line 2492
    .line 2493
    iget-object v3, v7, Loi1;->x:Lni1;

    .line 2494
    .line 2495
    const/4 v5, 0x5

    .line 2496
    iput v5, v3, Lni1;->e:I

    .line 2497
    .line 2498
    goto/16 :goto_2a

    .line 2499
    .line 2500
    :cond_60
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 2501
    .line 2502
    .line 2503
    iget-object v3, v7, Loi1;->x:Lni1;

    .line 2504
    .line 2505
    const/4 v9, 0x3

    .line 2506
    iput v9, v3, Lni1;->e:I

    .line 2507
    .line 2508
    goto/16 :goto_2a

    .line 2509
    .line 2510
    :cond_61
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 2511
    .line 2512
    .line 2513
    iget-object v3, v7, Loi1;->x:Lni1;

    .line 2514
    .line 2515
    const/4 v10, 0x1

    .line 2516
    iput v10, v3, Lni1;->e:I

    .line 2517
    .line 2518
    goto/16 :goto_2a

    .line 2519
    .line 2520
    :cond_62
    invoke-virtual {v7, v11}, Loi1;->h(I)V

    .line 2521
    .line 2522
    .line 2523
    iget-object v3, v7, Loi1;->x:Lni1;

    .line 2524
    .line 2525
    const/4 v8, 0x2

    .line 2526
    iput v8, v3, Lni1;->e:I

    .line 2527
    .line 2528
    goto/16 :goto_2a

    .line 2529
    .line 2530
    :cond_63
    cmp-long v3, v5, v24

    .line 2531
    .line 2532
    if-nez v3, :cond_64

    .line 2533
    .line 2534
    goto :goto_2e

    .line 2535
    :cond_64
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 2536
    .line 2537
    .line 2538
    move-result-object v1

    .line 2539
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 2540
    .line 2541
    .line 2542
    move-result v1

    .line 2543
    add-int/lit8 v1, v1, 0x23

    .line 2544
    .line 2545
    new-instance v2, Ljava/lang/StringBuilder;

    .line 2546
    .line 2547
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 2548
    .line 2549
    .line 2550
    const-string v1, "ContentEncodingScope "

    .line 2551
    .line 2552
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2553
    .line 2554
    .line 2555
    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 2556
    .line 2557
    .line 2558
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2559
    .line 2560
    .line 2561
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2562
    .line 2563
    .line 2564
    move-result-object v1

    .line 2565
    const/4 v2, 0x0

    .line 2566
    invoke-static {v2, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 2567
    .line 2568
    .line 2569
    move-result-object v1

    .line 2570
    throw v1

    .line 2571
    :cond_65
    const-wide/16 v18, 0x0

    .line 2572
    .line 2573
    cmp-long v3, v5, v18

    .line 2574
    .line 2575
    if-nez v3, :cond_6b

    .line 2576
    .line 2577
    :goto_2e
    goto/16 :goto_2a

    .line 2578
    .line 2579
    :goto_2f
    iput v3, v4, Lki1;->e:I

    .line 2580
    .line 2581
    goto/16 :goto_e

    .line 2582
    .line 2583
    :goto_30
    if-eqz v11, :cond_68

    .line 2584
    .line 2585
    move-object v4, v1

    .line 2586
    check-cast v4, Ldf1;

    .line 2587
    .line 2588
    iget-wide v4, v4, Ldf1;->i:J

    .line 2589
    .line 2590
    iget-boolean v6, v0, Loi1;->H:Z

    .line 2591
    .line 2592
    if-eqz v6, :cond_66

    .line 2593
    .line 2594
    iput-wide v4, v0, Loi1;->J:J

    .line 2595
    .line 2596
    iget-wide v4, v0, Loi1;->I:J

    .line 2597
    .line 2598
    iput-wide v4, v2, Lpf1;->a:J

    .line 2599
    .line 2600
    iput-boolean v3, v0, Loi1;->H:Z

    .line 2601
    .line 2602
    const/16 v23, 0x1

    .line 2603
    .line 2604
    return v23

    .line 2605
    :cond_66
    const/16 v23, 0x1

    .line 2606
    .line 2607
    iget-boolean v3, v0, Loi1;->y:Z

    .line 2608
    .line 2609
    if-eqz v3, :cond_67

    .line 2610
    .line 2611
    iget-wide v3, v0, Loi1;->J:J

    .line 2612
    .line 2613
    const-wide/16 v6, -0x1

    .line 2614
    .line 2615
    cmp-long v5, v3, v6

    .line 2616
    .line 2617
    if-eqz v5, :cond_67

    .line 2618
    .line 2619
    iput-wide v3, v2, Lpf1;->a:J

    .line 2620
    .line 2621
    iput-wide v6, v0, Loi1;->J:J

    .line 2622
    .line 2623
    return v23

    .line 2624
    :cond_67
    const/4 v3, 0x0

    .line 2625
    goto/16 :goto_0

    .line 2626
    .line 2627
    :cond_68
    const/4 v3, 0x0

    .line 2628
    :goto_31
    iget-object v1, v0, Loi1;->b:Landroid/util/SparseArray;

    .line 2629
    .line 2630
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 2631
    .line 2632
    .line 2633
    move-result v2

    .line 2634
    if-ge v3, v2, :cond_6a

    .line 2635
    .line 2636
    invoke-virtual {v1, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 2637
    .line 2638
    .line 2639
    move-result-object v1

    .line 2640
    check-cast v1, Lni1;

    .line 2641
    .line 2642
    iget-object v2, v1, Lni1;->a0:Ljg1;

    .line 2643
    .line 2644
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2645
    .line 2646
    .line 2647
    iget-object v2, v1, Lni1;->V:Lkg1;

    .line 2648
    .line 2649
    if-eqz v2, :cond_69

    .line 2650
    .line 2651
    iget-object v4, v1, Lni1;->a0:Ljg1;

    .line 2652
    .line 2653
    iget-object v1, v1, Lni1;->k:Lig1;

    .line 2654
    .line 2655
    invoke-virtual {v2, v4, v1}, Lkg1;->c(Ljg1;Lig1;)V

    .line 2656
    .line 2657
    .line 2658
    :cond_69
    add-int/lit8 v3, v3, 0x1

    .line 2659
    .line 2660
    goto :goto_31

    .line 2661
    :cond_6a
    const/4 v15, -0x1

    .line 2662
    return v15

    .line 2663
    :cond_6b
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 2664
    .line 2665
    .line 2666
    move-result-object v1

    .line 2667
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 2668
    .line 2669
    .line 2670
    move-result v1

    .line 2671
    add-int/lit8 v1, v1, 0x23

    .line 2672
    .line 2673
    new-instance v2, Ljava/lang/StringBuilder;

    .line 2674
    .line 2675
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 2676
    .line 2677
    .line 2678
    const-string v1, "ContentEncodingOrder "

    .line 2679
    .line 2680
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2681
    .line 2682
    .line 2683
    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 2684
    .line 2685
    .line 2686
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2687
    .line 2688
    .line 2689
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2690
    .line 2691
    .line 2692
    move-result-object v1

    .line 2693
    const/4 v2, 0x0

    .line 2694
    invoke-static {v2, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 2695
    .line 2696
    .line 2697
    move-result-object v1

    .line 2698
    throw v1

    .line 2699
    :cond_6c
    const/4 v2, 0x0

    .line 2700
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 2701
    .line 2702
    .line 2703
    move-result-object v1

    .line 2704
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 2705
    .line 2706
    .line 2707
    move-result v1

    .line 2708
    new-instance v3, Ljava/lang/StringBuilder;

    .line 2709
    .line 2710
    add-int/lit8 v1, v1, 0x16

    .line 2711
    .line 2712
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 2713
    .line 2714
    .line 2715
    const-string v1, "Invalid integer size: "

    .line 2716
    .line 2717
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2718
    .line 2719
    .line 2720
    invoke-virtual {v3, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 2721
    .line 2722
    .line 2723
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2724
    .line 2725
    .line 2726
    move-result-object v1

    .line 2727
    invoke-static {v2, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 2728
    .line 2729
    .line 2730
    move-result-object v1

    .line 2731
    throw v1

    .line 2732
    :cond_6d
    move/from16 v34, v3

    .line 2733
    .line 2734
    return v34

    .line 2735
    :sswitch_data_0
    .sparse-switch
        0x83 -> :sswitch_4
        0x86 -> :sswitch_3
        0x88 -> :sswitch_4
        0x9b -> :sswitch_4
        0x9f -> :sswitch_4
        0xa0 -> :sswitch_2
        0xa1 -> :sswitch_1
        0xa3 -> :sswitch_1
        0xa5 -> :sswitch_1
        0xa6 -> :sswitch_2
        0xae -> :sswitch_2
        0xb0 -> :sswitch_4
        0xb3 -> :sswitch_4
        0xb5 -> :sswitch_0
        0xb7 -> :sswitch_2
        0xba -> :sswitch_4
        0xbb -> :sswitch_2
        0xd7 -> :sswitch_4
        0xe0 -> :sswitch_2
        0xe1 -> :sswitch_2
        0xe7 -> :sswitch_4
        0xee -> :sswitch_4
        0xf1 -> :sswitch_4
        0xf7 -> :sswitch_4
        0xfb -> :sswitch_4
        0x41e4 -> :sswitch_2
        0x41e7 -> :sswitch_4
        0x41ed -> :sswitch_1
        0x4254 -> :sswitch_4
        0x4255 -> :sswitch_1
        0x4282 -> :sswitch_3
        0x4285 -> :sswitch_4
        0x42f7 -> :sswitch_4
        0x4489 -> :sswitch_0
        0x47e1 -> :sswitch_4
        0x47e2 -> :sswitch_1
        0x47e7 -> :sswitch_2
        0x47e8 -> :sswitch_4
        0x4dbb -> :sswitch_2
        0x5031 -> :sswitch_4
        0x5032 -> :sswitch_4
        0x5034 -> :sswitch_2
        0x5035 -> :sswitch_2
        0x536e -> :sswitch_3
        0x53ab -> :sswitch_1
        0x53ac -> :sswitch_4
        0x53b8 -> :sswitch_4
        0x54b0 -> :sswitch_4
        0x54b2 -> :sswitch_4
        0x54ba -> :sswitch_4
        0x55aa -> :sswitch_4
        0x55b0 -> :sswitch_2
        0x55b2 -> :sswitch_4
        0x55b9 -> :sswitch_4
        0x55ba -> :sswitch_4
        0x55bb -> :sswitch_4
        0x55bc -> :sswitch_4
        0x55bd -> :sswitch_4
        0x55d0 -> :sswitch_2
        0x55d1 -> :sswitch_0
        0x55d2 -> :sswitch_0
        0x55d3 -> :sswitch_0
        0x55d4 -> :sswitch_0
        0x55d5 -> :sswitch_0
        0x55d6 -> :sswitch_0
        0x55d7 -> :sswitch_0
        0x55d8 -> :sswitch_0
        0x55d9 -> :sswitch_0
        0x55da -> :sswitch_0
        0x55ee -> :sswitch_4
        0x56aa -> :sswitch_4
        0x56bb -> :sswitch_4
        0x6240 -> :sswitch_2
        0x6264 -> :sswitch_4
        0x63a2 -> :sswitch_1
        0x6d80 -> :sswitch_2
        0x75a1 -> :sswitch_2
        0x75a2 -> :sswitch_4
        0x7670 -> :sswitch_2
        0x7671 -> :sswitch_4
        0x7672 -> :sswitch_1
        0x7673 -> :sswitch_0
        0x7674 -> :sswitch_0
        0x7675 -> :sswitch_0
        0x22b59c -> :sswitch_3
        0x23e383 -> :sswitch_4
        0x2ad7b1 -> :sswitch_4
        0x114d9b74 -> :sswitch_2
        0x1549a966 -> :sswitch_2
        0x1654ae6b -> :sswitch_2
        0x18538067 -> :sswitch_2
        0x1a45dfa3 -> :sswitch_2
        0x1c53bb6b -> :sswitch_2
        0x1f43b675 -> :sswitch_2
    .end sparse-switch

    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
    .line 2837
    .line 2838
    .line 2839
    .line 2840
    .line 2841
    .line 2842
    .line 2843
    .line 2844
    .line 2845
    .line 2846
    .line 2847
    .line 2848
    .line 2849
    .line 2850
    .line 2851
    .line 2852
    .line 2853
    .line 2854
    .line 2855
    .line 2856
    .line 2857
    .line 2858
    .line 2859
    .line 2860
    .line 2861
    .line 2862
    .line 2863
    .line 2864
    .line 2865
    .line 2866
    .line 2867
    .line 2868
    .line 2869
    .line 2870
    .line 2871
    .line 2872
    .line 2873
    .line 2874
    .line 2875
    .line 2876
    .line 2877
    .line 2878
    .line 2879
    .line 2880
    .line 2881
    .line 2882
    .line 2883
    .line 2884
    .line 2885
    .line 2886
    .line 2887
    .line 2888
    .line 2889
    .line 2890
    .line 2891
    .line 2892
    .line 2893
    .line 2894
    .line 2895
    .line 2896
    .line 2897
    .line 2898
    .line 2899
    .line 2900
    .line 2901
    .line 2902
    .line 2903
    .line 2904
    .line 2905
    .line 2906
    .line 2907
    .line 2908
    .line 2909
    .line 2910
    .line 2911
    .line 2912
    .line 2913
    .line 2914
    .line 2915
    .line 2916
    .line 2917
    .line 2918
    .line 2919
    .line 2920
    .line 2921
    .line 2922
    .line 2923
    .line 2924
    .line 2925
    .line 2926
    .line 2927
    .line 2928
    .line 2929
    .line 2930
    .line 2931
    .line 2932
    .line 2933
    .line 2934
    .line 2935
    .line 2936
    .line 2937
    .line 2938
    .line 2939
    .line 2940
    .line 2941
    .line 2942
    .line 2943
    .line 2944
    .line 2945
    .line 2946
    .line 2947
    .line 2948
    .line 2949
    .line 2950
    .line 2951
    .line 2952
    .line 2953
    .line 2954
    .line 2955
    .line 2956
    .line 2957
    .line 2958
    .line 2959
    .line 2960
    .line 2961
    .line 2962
    .line 2963
    .line 2964
    .line 2965
    .line 2966
    .line 2967
    .line 2968
    .line 2969
    .line 2970
    .line 2971
    .line 2972
    .line 2973
    .line 2974
    .line 2975
    .line 2976
    .line 2977
    .line 2978
    .line 2979
    .line 2980
    .line 2981
    .line 2982
    .line 2983
    .line 2984
    .line 2985
    .line 2986
    .line 2987
    .line 2988
    .line 2989
    .line 2990
    .line 2991
    .line 2992
    .line 2993
    .line 2994
    .line 2995
    .line 2996
    .line 2997
    .line 2998
    .line 2999
    .line 3000
    .line 3001
    .line 3002
    .line 3003
    .line 3004
    .line 3005
    .line 3006
    .line 3007
    .line 3008
    .line 3009
    .line 3010
    .line 3011
    .line 3012
    .line 3013
    .line 3014
    .line 3015
    .line 3016
    .line 3017
    .line 3018
    .line 3019
    .line 3020
    .line 3021
    .line 3022
    .line 3023
    .line 3024
    .line 3025
    .line 3026
    .line 3027
    .line 3028
    .line 3029
    .line 3030
    .line 3031
    .line 3032
    .line 3033
    .line 3034
    .line 3035
    .line 3036
    .line 3037
    .line 3038
    .line 3039
    .line 3040
    .line 3041
    .line 3042
    .line 3043
    .line 3044
    .line 3045
    .line 3046
    .line 3047
    .line 3048
    .line 3049
    .line 3050
    .line 3051
    .line 3052
    .line 3053
    .line 3054
    .line 3055
    .line 3056
    .line 3057
    .line 3058
    .line 3059
    .line 3060
    .line 3061
    .line 3062
    .line 3063
    .line 3064
    .line 3065
    .line 3066
    .line 3067
    .line 3068
    .line 3069
    .line 3070
    .line 3071
    .line 3072
    .line 3073
    .line 3074
    .line 3075
    .line 3076
    .line 3077
    .line 3078
    .line 3079
    .line 3080
    .line 3081
    .line 3082
    .line 3083
    .line 3084
    .line 3085
    .line 3086
    .line 3087
    .line 3088
    .line 3089
    .line 3090
    .line 3091
    .line 3092
    .line 3093
    .line 3094
    .line 3095
    .line 3096
    .line 3097
    .line 3098
    .line 3099
    .line 3100
    .line 3101
    .line 3102
    .line 3103
    .line 3104
    .line 3105
    .line 3106
    .line 3107
    .line 3108
    .line 3109
    .line 3110
    .line 3111
    .line 3112
    .line 3113
    :pswitch_data_0
    .packed-switch 0x55d1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 3114
    .line 3115
    .line 3116
    .line 3117
    .line 3118
    .line 3119
    .line 3120
    .line 3121
    .line 3122
    .line 3123
    .line 3124
    .line 3125
    .line 3126
    .line 3127
    .line 3128
    .line 3129
    .line 3130
    .line 3131
    .line 3132
    .line 3133
    .line 3134
    .line 3135
    .line 3136
    .line 3137
    :pswitch_data_1
    .packed-switch 0x7673
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 3138
    .line 3139
    .line 3140
    .line 3141
    .line 3142
    .line 3143
    .line 3144
    .line 3145
    .line 3146
    .line 3147
    :sswitch_data_1
    .sparse-switch
        0x83 -> :sswitch_26
        0x88 -> :sswitch_25
        0x9b -> :sswitch_24
        0x9f -> :sswitch_23
        0xb0 -> :sswitch_22
        0xb3 -> :sswitch_21
        0xba -> :sswitch_20
        0xd7 -> :sswitch_1f
        0xe7 -> :sswitch_1e
        0xee -> :sswitch_1d
        0xf1 -> :sswitch_1c
        0xf7 -> :sswitch_1b
        0xfb -> :sswitch_1a
        0x41e7 -> :sswitch_19
        0x4254 -> :sswitch_18
        0x4285 -> :sswitch_17
        0x42f7 -> :sswitch_16
        0x47e1 -> :sswitch_15
        0x47e8 -> :sswitch_14
        0x53ac -> :sswitch_13
        0x53b8 -> :sswitch_12
        0x54b0 -> :sswitch_11
        0x54b2 -> :sswitch_10
        0x54ba -> :sswitch_f
        0x55aa -> :sswitch_e
        0x55b2 -> :sswitch_d
        0x55ee -> :sswitch_c
        0x56aa -> :sswitch_b
        0x56bb -> :sswitch_a
        0x6264 -> :sswitch_9
        0x75a2 -> :sswitch_8
        0x7671 -> :sswitch_7
        0x23e383 -> :sswitch_6
        0x2ad7b1 -> :sswitch_5
    .end sparse-switch

    .line 3148
    .line 3149
    .line 3150
    .line 3151
    .line 3152
    .line 3153
    .line 3154
    .line 3155
    .line 3156
    .line 3157
    .line 3158
    .line 3159
    .line 3160
    .line 3161
    .line 3162
    .line 3163
    .line 3164
    .line 3165
    .line 3166
    .line 3167
    .line 3168
    .line 3169
    .line 3170
    .line 3171
    .line 3172
    .line 3173
    .line 3174
    .line 3175
    .line 3176
    .line 3177
    .line 3178
    .line 3179
    .line 3180
    .line 3181
    .line 3182
    .line 3183
    .line 3184
    .line 3185
    .line 3186
    .line 3187
    .line 3188
    .line 3189
    .line 3190
    .line 3191
    .line 3192
    .line 3193
    .line 3194
    .line 3195
    .line 3196
    .line 3197
    .line 3198
    .line 3199
    .line 3200
    .line 3201
    .line 3202
    .line 3203
    .line 3204
    .line 3205
    .line 3206
    .line 3207
    .line 3208
    .line 3209
    .line 3210
    .line 3211
    .line 3212
    .line 3213
    .line 3214
    .line 3215
    .line 3216
    .line 3217
    .line 3218
    .line 3219
    .line 3220
    .line 3221
    .line 3222
    .line 3223
    .line 3224
    .line 3225
    .line 3226
    .line 3227
    .line 3228
    .line 3229
    .line 3230
    .line 3231
    .line 3232
    .line 3233
    .line 3234
    .line 3235
    .line 3236
    .line 3237
    .line 3238
    .line 3239
    .line 3240
    .line 3241
    .line 3242
    .line 3243
    .line 3244
    .line 3245
    .line 3246
    .line 3247
    .line 3248
    .line 3249
    .line 3250
    .line 3251
    .line 3252
    .line 3253
    .line 3254
    .line 3255
    .line 3256
    .line 3257
    .line 3258
    .line 3259
    .line 3260
    .line 3261
    .line 3262
    .line 3263
    .line 3264
    .line 3265
    .line 3266
    .line 3267
    .line 3268
    .line 3269
    .line 3270
    .line 3271
    .line 3272
    .line 3273
    .line 3274
    .line 3275
    .line 3276
    .line 3277
    .line 3278
    .line 3279
    .line 3280
    .line 3281
    .line 3282
    .line 3283
    .line 3284
    .line 3285
    :pswitch_data_2
    .packed-switch 0x55b9
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
    .end packed-switch
.end method

.method public final e(JJ)V
    .locals 1

    .line 1
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide p1, p0, Loi1;->K:J

    .line 7
    .line 8
    const/4 p3, 0x0

    .line 9
    iput p3, p0, Loi1;->M:I

    .line 10
    .line 11
    iget-object p4, p0, Loi1;->i0:Lki1;

    .line 12
    .line 13
    iput p3, p4, Lki1;->e:I

    .line 14
    .line 15
    iget-object v0, p4, Lki1;->b:Ljava/util/ArrayDeque;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 18
    .line 19
    .line 20
    iget-object p4, p4, Lki1;->c:Lpi1;

    .line 21
    .line 22
    iput p3, p4, Lpi1;->f:I

    .line 23
    .line 24
    iput p3, p4, Lpi1;->g:I

    .line 25
    .line 26
    iget-object p4, p0, Loi1;->a:Lpi1;

    .line 27
    .line 28
    iput p3, p4, Lpi1;->f:I

    .line 29
    .line 30
    iput p3, p4, Lpi1;->g:I

    .line 31
    .line 32
    invoke-virtual {p0}, Loi1;->m()V

    .line 33
    .line 34
    .line 35
    iput-boolean p3, p0, Loi1;->C:Z

    .line 36
    .line 37
    iput-wide p1, p0, Loi1;->D:J

    .line 38
    .line 39
    const/4 p1, -0x1

    .line 40
    iput p1, p0, Loi1;->E:I

    .line 41
    .line 42
    const-wide/16 p1, -0x1

    .line 43
    .line 44
    iput-wide p1, p0, Loi1;->F:J

    .line 45
    .line 46
    move p1, p3

    .line 47
    :goto_0
    iget-object p2, p0, Loi1;->b:Landroid/util/SparseArray;

    .line 48
    .line 49
    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    .line 50
    .line 51
    .line 52
    move-result p4

    .line 53
    if-ge p1, p4, :cond_1

    .line 54
    .line 55
    invoke-virtual {p2, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    check-cast p2, Lni1;

    .line 60
    .line 61
    iget-object p2, p2, Lni1;->V:Lkg1;

    .line 62
    .line 63
    if-eqz p2, :cond_0

    .line 64
    .line 65
    iput-boolean p3, p2, Lkg1;->b:Z

    .line 66
    .line 67
    iput p3, p2, Lkg1;->c:I

    .line 68
    .line 69
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    return-void
.end method

.method public final f(Lnf1;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Loi1;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lrl;

    .line 6
    .line 7
    iget-object v1, p0, Loi1;->e:Ljk1;

    .line 8
    .line 9
    invoke-direct {v0, p1, v1}, Lrl;-><init>(Lnf1;Ljk1;)V

    .line 10
    .line 11
    .line 12
    move-object p1, v0

    .line 13
    :cond_0
    iput-object p1, p0, Loi1;->h0:Lnf1;

    .line 14
    .line 15
    return-void
.end method

.method public final g(I)V
    .locals 47

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Loi1;->h0:Lnf1;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/16 v3, 0xa0

    .line 11
    .line 12
    const-wide/16 v4, 0x0

    .line 13
    .line 14
    const-string v6, "A_OPUS"

    .line 15
    .line 16
    const/4 v7, 0x2

    .line 17
    iget-object v8, v0, Loi1;->b:Landroid/util/SparseArray;

    .line 18
    .line 19
    const/4 v9, 0x1

    .line 20
    const/4 v10, 0x0

    .line 21
    if-eq v1, v3, :cond_4d

    .line 22
    .line 23
    const/16 v3, 0xae

    .line 24
    .line 25
    const-string v11, "video/webm"

    .line 26
    .line 27
    const/4 v12, 0x0

    .line 28
    const/4 v13, -0x1

    .line 29
    if-eq v1, v3, :cond_1c

    .line 30
    .line 31
    const/16 v2, 0xb7

    .line 32
    .line 33
    const-wide/16 v14, -0x1

    .line 34
    .line 35
    iget-object v3, v0, Loi1;->B:Landroid/util/SparseArray;

    .line 36
    .line 37
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    if-eq v1, v2, :cond_1a

    .line 43
    .line 44
    const/16 v2, 0x4dbb

    .line 45
    .line 46
    const v6, 0x1c53bb6b

    .line 47
    .line 48
    .line 49
    if-eq v1, v2, :cond_18

    .line 50
    .line 51
    const/16 v2, 0x6240

    .line 52
    .line 53
    if-eq v1, v2, :cond_16

    .line 54
    .line 55
    const/16 v2, 0x6d80

    .line 56
    .line 57
    if-eq v1, v2, :cond_14

    .line 58
    .line 59
    const v2, 0x1549a966

    .line 60
    .line 61
    .line 62
    if-eq v1, v2, :cond_12

    .line 63
    .line 64
    const v2, 0x1654ae6b

    .line 65
    .line 66
    .line 67
    if-eq v1, v2, :cond_6

    .line 68
    .line 69
    if-eq v1, v6, :cond_0

    .line 70
    .line 71
    goto/16 :goto_31

    .line 72
    .line 73
    :cond_0
    iget-boolean v1, v0, Loi1;->y:Z

    .line 74
    .line 75
    if-nez v1, :cond_5

    .line 76
    .line 77
    move v1, v10

    .line 78
    :goto_0
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-ge v1, v2, :cond_4

    .line 83
    .line 84
    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    check-cast v2, Ljava/util/List;

    .line 89
    .line 90
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-nez v2, :cond_3

    .line 95
    .line 96
    iget-wide v1, v0, Loi1;->u:J

    .line 97
    .line 98
    cmp-long v1, v1, v16

    .line 99
    .line 100
    if-nez v1, :cond_1

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_1
    move v1, v10

    .line 104
    :goto_1
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-ge v1, v2, :cond_2

    .line 109
    .line 110
    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    check-cast v2, Ljava/util/List;

    .line 115
    .line 116
    invoke-static {v2}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 117
    .line 118
    .line 119
    add-int/lit8 v1, v1, 0x1

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_2
    new-instance v16, Lmi1;

    .line 123
    .line 124
    iget-wide v1, v0, Loi1;->u:J

    .line 125
    .line 126
    iget v4, v0, Loi1;->G:I

    .line 127
    .line 128
    iget-wide v5, v0, Loi1;->r:J

    .line 129
    .line 130
    iget-wide v7, v0, Loi1;->q:J

    .line 131
    .line 132
    move-wide/from16 v18, v1

    .line 133
    .line 134
    move-object/from16 v17, v3

    .line 135
    .line 136
    move/from16 v20, v4

    .line 137
    .line 138
    move-wide/from16 v21, v5

    .line 139
    .line 140
    move-wide/from16 v23, v7

    .line 141
    .line 142
    invoke-direct/range {v16 .. v24}, Lmi1;-><init>(Landroid/util/SparseArray;JIJJ)V

    .line 143
    .line 144
    .line 145
    move-object/from16 v1, v16

    .line 146
    .line 147
    iget-object v2, v0, Loi1;->h0:Lnf1;

    .line 148
    .line 149
    invoke-interface {v2, v1}, Lnf1;->v(Lcg1;)V

    .line 150
    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_3
    move-object v2, v3

    .line 154
    add-int/lit8 v1, v1, 0x1

    .line 155
    .line 156
    goto :goto_0

    .line 157
    :cond_4
    :goto_2
    iget-object v1, v0, Loi1;->h0:Lnf1;

    .line 158
    .line 159
    new-instance v2, Lqf1;

    .line 160
    .line 161
    iget-wide v6, v0, Loi1;->u:J

    .line 162
    .line 163
    invoke-direct {v2, v6, v7, v4, v5}, Lqf1;-><init>(JJ)V

    .line 164
    .line 165
    .line 166
    invoke-interface {v1, v2}, Lnf1;->v(Lcg1;)V

    .line 167
    .line 168
    .line 169
    :goto_3
    iput-boolean v9, v0, Loi1;->y:Z

    .line 170
    .line 171
    :cond_5
    iput-boolean v10, v0, Loi1;->C:Z

    .line 172
    .line 173
    return-void

    .line 174
    :cond_6
    invoke-virtual {v8}, Landroid/util/SparseArray;->size()I

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    if-eqz v1, :cond_11

    .line 179
    .line 180
    move v1, v10

    .line 181
    move v2, v13

    .line 182
    move v3, v2

    .line 183
    move v4, v3

    .line 184
    move v5, v4

    .line 185
    :goto_4
    invoke-virtual {v8}, Landroid/util/SparseArray;->size()I

    .line 186
    .line 187
    .line 188
    move-result v6

    .line 189
    if-ge v1, v6, :cond_b

    .line 190
    .line 191
    invoke-virtual {v8, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    check-cast v6, Lni1;

    .line 196
    .line 197
    iget v11, v6, Lni1;->e:I

    .line 198
    .line 199
    if-ne v11, v7, :cond_8

    .line 200
    .line 201
    iget-boolean v11, v6, Lni1;->Y:Z

    .line 202
    .line 203
    if-eqz v11, :cond_7

    .line 204
    .line 205
    iget v2, v6, Lni1;->d:I

    .line 206
    .line 207
    :cond_7
    if-ne v3, v13, :cond_a

    .line 208
    .line 209
    iget v3, v6, Lni1;->d:I

    .line 210
    .line 211
    goto :goto_5

    .line 212
    :cond_8
    if-ne v11, v9, :cond_a

    .line 213
    .line 214
    iget-boolean v11, v6, Lni1;->Y:Z

    .line 215
    .line 216
    if-eqz v11, :cond_9

    .line 217
    .line 218
    iget v4, v6, Lni1;->d:I

    .line 219
    .line 220
    :cond_9
    if-ne v5, v13, :cond_a

    .line 221
    .line 222
    iget v5, v6, Lni1;->d:I

    .line 223
    .line 224
    :cond_a
    :goto_5
    add-int/lit8 v1, v1, 0x1

    .line 225
    .line 226
    goto :goto_4

    .line 227
    :cond_b
    if-eq v2, v13, :cond_c

    .line 228
    .line 229
    iput v2, v0, Loi1;->G:I

    .line 230
    .line 231
    goto :goto_6

    .line 232
    :cond_c
    if-eq v3, v13, :cond_d

    .line 233
    .line 234
    iput v3, v0, Loi1;->G:I

    .line 235
    .line 236
    goto :goto_6

    .line 237
    :cond_d
    if-eq v4, v13, :cond_e

    .line 238
    .line 239
    iput v4, v0, Loi1;->G:I

    .line 240
    .line 241
    goto :goto_6

    .line 242
    :cond_e
    if-eq v5, v13, :cond_f

    .line 243
    .line 244
    iput v5, v0, Loi1;->G:I

    .line 245
    .line 246
    goto :goto_6

    .line 247
    :cond_f
    invoke-virtual {v8}, Landroid/util/SparseArray;->size()I

    .line 248
    .line 249
    .line 250
    move-result v1

    .line 251
    if-lez v1, :cond_10

    .line 252
    .line 253
    invoke-virtual {v8, v10}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    check-cast v1, Lni1;

    .line 258
    .line 259
    iget v13, v1, Lni1;->d:I

    .line 260
    .line 261
    :cond_10
    iput v13, v0, Loi1;->G:I

    .line 262
    .line 263
    :goto_6
    invoke-virtual {v0}, Loi1;->a()V

    .line 264
    .line 265
    .line 266
    return-void

    .line 267
    :cond_11
    const-string v1, "No valid tracks were found"

    .line 268
    .line 269
    invoke-static {v12, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    throw v1

    .line 274
    :cond_12
    iget-wide v1, v0, Loi1;->s:J

    .line 275
    .line 276
    cmp-long v1, v1, v16

    .line 277
    .line 278
    if-nez v1, :cond_13

    .line 279
    .line 280
    const-wide/32 v1, 0xf4240

    .line 281
    .line 282
    .line 283
    iput-wide v1, v0, Loi1;->s:J

    .line 284
    .line 285
    :cond_13
    iget-wide v1, v0, Loi1;->t:J

    .line 286
    .line 287
    cmp-long v3, v1, v16

    .line 288
    .line 289
    if-eqz v3, :cond_53

    .line 290
    .line 291
    invoke-virtual {v0, v1, v2}, Loi1;->p(J)J

    .line 292
    .line 293
    .line 294
    move-result-wide v1

    .line 295
    iput-wide v1, v0, Loi1;->u:J

    .line 296
    .line 297
    return-void

    .line 298
    :cond_14
    invoke-virtual/range {p0 .. p1}, Loi1;->h(I)V

    .line 299
    .line 300
    .line 301
    iget-object v1, v0, Loi1;->x:Lni1;

    .line 302
    .line 303
    iget-boolean v2, v1, Lni1;->i:Z

    .line 304
    .line 305
    if-eqz v2, :cond_53

    .line 306
    .line 307
    iget-object v1, v1, Lni1;->j:[B

    .line 308
    .line 309
    if-nez v1, :cond_15

    .line 310
    .line 311
    goto/16 :goto_31

    .line 312
    .line 313
    :cond_15
    const-string v1, "Combining encryption and compression is not supported"

    .line 314
    .line 315
    invoke-static {v12, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    throw v1

    .line 320
    :cond_16
    invoke-virtual/range {p0 .. p1}, Loi1;->h(I)V

    .line 321
    .line 322
    .line 323
    iget-object v1, v0, Loi1;->x:Lni1;

    .line 324
    .line 325
    iget-boolean v2, v1, Lni1;->i:Z

    .line 326
    .line 327
    if-eqz v2, :cond_53

    .line 328
    .line 329
    iget-object v2, v1, Lni1;->k:Lig1;

    .line 330
    .line 331
    if-eqz v2, :cond_17

    .line 332
    .line 333
    new-instance v3, Lie4;

    .line 334
    .line 335
    new-instance v4, Lvd4;

    .line 336
    .line 337
    sget-object v5, Lfh3;->a:Ljava/util/UUID;

    .line 338
    .line 339
    iget-object v2, v2, Lig1;->b:[B

    .line 340
    .line 341
    invoke-direct {v4, v5, v11, v2}, Lvd4;-><init>(Ljava/util/UUID;Ljava/lang/String;[B)V

    .line 342
    .line 343
    .line 344
    filled-new-array {v4}, [Lvd4;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    invoke-direct {v3, v12, v9, v2}, Lie4;-><init>(Ljava/lang/String;Z[Lvd4;)V

    .line 349
    .line 350
    .line 351
    iput-object v3, v1, Lni1;->m:Lie4;

    .line 352
    .line 353
    return-void

    .line 354
    :cond_17
    const-string v1, "Encrypted Track found but ContentEncKeyID was not found"

    .line 355
    .line 356
    invoke-static {v12, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    throw v1

    .line 361
    :cond_18
    iget v1, v0, Loi1;->z:I

    .line 362
    .line 363
    if-eq v1, v13, :cond_19

    .line 364
    .line 365
    iget-wide v2, v0, Loi1;->A:J

    .line 366
    .line 367
    cmp-long v4, v2, v14

    .line 368
    .line 369
    if-eqz v4, :cond_19

    .line 370
    .line 371
    if-ne v1, v6, :cond_53

    .line 372
    .line 373
    iput-wide v2, v0, Loi1;->I:J

    .line 374
    .line 375
    return-void

    .line 376
    :cond_19
    const-string v1, "Mandatory element SeekID or SeekPosition not found"

    .line 377
    .line 378
    invoke-static {v12, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    throw v1

    .line 383
    :cond_1a
    move-object v2, v3

    .line 384
    invoke-virtual/range {p0 .. p1}, Loi1;->i(I)V

    .line 385
    .line 386
    .line 387
    iget-wide v3, v0, Loi1;->D:J

    .line 388
    .line 389
    cmp-long v1, v3, v16

    .line 390
    .line 391
    if-eqz v1, :cond_53

    .line 392
    .line 393
    iget v1, v0, Loi1;->E:I

    .line 394
    .line 395
    if-eq v1, v13, :cond_53

    .line 396
    .line 397
    iget-wide v3, v0, Loi1;->F:J

    .line 398
    .line 399
    cmp-long v3, v3, v14

    .line 400
    .line 401
    if-eqz v3, :cond_53

    .line 402
    .line 403
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v1

    .line 407
    check-cast v1, Ljava/util/List;

    .line 408
    .line 409
    if-nez v1, :cond_1b

    .line 410
    .line 411
    new-instance v1, Ljava/util/ArrayList;

    .line 412
    .line 413
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 414
    .line 415
    .line 416
    iget v3, v0, Loi1;->E:I

    .line 417
    .line 418
    invoke-virtual {v2, v3, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    :cond_1b
    new-instance v2, Lli1;

    .line 422
    .line 423
    iget-wide v3, v0, Loi1;->D:J

    .line 424
    .line 425
    iget-wide v5, v0, Loi1;->r:J

    .line 426
    .line 427
    iget-wide v7, v0, Loi1;->F:J

    .line 428
    .line 429
    add-long/2addr v5, v7

    .line 430
    invoke-direct {v2, v3, v4, v5, v6}, Lli1;-><init>(JJ)V

    .line 431
    .line 432
    .line 433
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 434
    .line 435
    .line 436
    return-void

    .line 437
    :cond_1c
    iget-object v1, v0, Loi1;->x:Lni1;

    .line 438
    .line 439
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 440
    .line 441
    .line 442
    iget-object v3, v1, Lni1;->c:Ljava/lang/String;

    .line 443
    .line 444
    if-eqz v3, :cond_4c

    .line 445
    .line 446
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 447
    .line 448
    .line 449
    move-result v4

    .line 450
    const-string v5, "A_TRUEHD"

    .line 451
    .line 452
    const-string v14, "A_VORBIS"

    .line 453
    .line 454
    const-string v15, "A_MPEG/L2"

    .line 455
    .line 456
    const-string v13, "A_MPEG/L3"

    .line 457
    .line 458
    const-string v7, "V_MS/VFW/FOURCC"

    .line 459
    .line 460
    const-string v9, "S_DVBSUB"

    .line 461
    .line 462
    const-string v10, "V_MPEG4/ISO/ASP"

    .line 463
    .line 464
    const-string v12, "V_MPEG4/ISO/AVC"

    .line 465
    .line 466
    move/from16 p1, v4

    .line 467
    .line 468
    const-string v4, "S_VOBSUB"

    .line 469
    .line 470
    move-object/from16 v21, v11

    .line 471
    .line 472
    const-string v11, "A_DTS/LOSSLESS"

    .line 473
    .line 474
    const-string v0, "A_AAC"

    .line 475
    .line 476
    move-object/from16 v22, v8

    .line 477
    .line 478
    const-string v8, "A_AC3"

    .line 479
    .line 480
    move-object/from16 v23, v2

    .line 481
    .line 482
    const-string v2, "A_DTS"

    .line 483
    .line 484
    move-object/from16 v24, v1

    .line 485
    .line 486
    const-string v1, "V_AV1"

    .line 487
    .line 488
    move-object/from16 v25, v5

    .line 489
    .line 490
    const-string v5, "V_VP8"

    .line 491
    .line 492
    move-object/from16 v26, v14

    .line 493
    .line 494
    const-string v14, "V_VP9"

    .line 495
    .line 496
    move-object/from16 v27, v15

    .line 497
    .line 498
    const-string v15, "S_HDMV/PGS"

    .line 499
    .line 500
    move-object/from16 v28, v13

    .line 501
    .line 502
    const-string v13, "V_THEORA"

    .line 503
    .line 504
    move-object/from16 v29, v7

    .line 505
    .line 506
    const-string v7, "A_DTS/EXPRESS"

    .line 507
    .line 508
    move-object/from16 v30, v9

    .line 509
    .line 510
    const-string v9, "A_PCM/FLOAT/IEEE"

    .line 511
    .line 512
    move-object/from16 v31, v10

    .line 513
    .line 514
    const-string v10, "A_PCM/INT/BIG"

    .line 515
    .line 516
    move-object/from16 v32, v12

    .line 517
    .line 518
    const-string v12, "A_PCM/INT/LIT"

    .line 519
    .line 520
    move-object/from16 v33, v4

    .line 521
    .line 522
    const-string v4, "S_TEXT/ASS"

    .line 523
    .line 524
    move-object/from16 v34, v11

    .line 525
    .line 526
    const-string v11, "S_TEXT/SSA"

    .line 527
    .line 528
    move-object/from16 v35, v0

    .line 529
    .line 530
    const-string v0, "V_MPEGH/ISO/HEVC"

    .line 531
    .line 532
    move-object/from16 v36, v8

    .line 533
    .line 534
    const-string v8, "S_TEXT/WEBVTT"

    .line 535
    .line 536
    move-object/from16 v37, v2

    .line 537
    .line 538
    const-string v2, "S_TEXT/UTF8"

    .line 539
    .line 540
    move-object/from16 v38, v1

    .line 541
    .line 542
    const-string v1, "V_MPEG2"

    .line 543
    .line 544
    move-object/from16 v39, v5

    .line 545
    .line 546
    const-string v5, "A_EAC3"

    .line 547
    .line 548
    move-object/from16 v40, v14

    .line 549
    .line 550
    const-string v14, "A_FLAC"

    .line 551
    .line 552
    sparse-switch p1, :sswitch_data_0

    .line 553
    .line 554
    .line 555
    goto/16 :goto_2d

    .line 556
    .line 557
    :sswitch_0
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 558
    .line 559
    .line 560
    move-result v3

    .line 561
    if-eqz v3, :cond_4b

    .line 562
    .line 563
    :goto_7
    move-object/from16 p1, v15

    .line 564
    .line 565
    :goto_8
    move-object/from16 v3, v24

    .line 566
    .line 567
    goto/16 :goto_a

    .line 568
    .line 569
    :sswitch_1
    invoke-virtual {v3, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 570
    .line 571
    .line 572
    move-result v3

    .line 573
    if-eqz v3, :cond_4b

    .line 574
    .line 575
    goto :goto_7

    .line 576
    :sswitch_2
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 577
    .line 578
    .line 579
    move-result v3

    .line 580
    if-eqz v3, :cond_4b

    .line 581
    .line 582
    goto :goto_7

    .line 583
    :sswitch_3
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 584
    .line 585
    .line 586
    move-result v3

    .line 587
    if-eqz v3, :cond_4b

    .line 588
    .line 589
    goto :goto_7

    .line 590
    :sswitch_4
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 591
    .line 592
    .line 593
    move-result v3

    .line 594
    if-eqz v3, :cond_4b

    .line 595
    .line 596
    goto :goto_7

    .line 597
    :sswitch_5
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 598
    .line 599
    .line 600
    move-result v3

    .line 601
    if-eqz v3, :cond_4b

    .line 602
    .line 603
    goto :goto_7

    .line 604
    :sswitch_6
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 605
    .line 606
    .line 607
    move-result v3

    .line 608
    if-eqz v3, :cond_4b

    .line 609
    .line 610
    goto :goto_7

    .line 611
    :sswitch_7
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 612
    .line 613
    .line 614
    move-result v3

    .line 615
    if-eqz v3, :cond_4b

    .line 616
    .line 617
    goto :goto_7

    .line 618
    :sswitch_8
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 619
    .line 620
    .line 621
    move-result v3

    .line 622
    if-eqz v3, :cond_4b

    .line 623
    .line 624
    goto :goto_7

    .line 625
    :sswitch_9
    invoke-virtual {v3, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 626
    .line 627
    .line 628
    move-result v3

    .line 629
    if-eqz v3, :cond_4b

    .line 630
    .line 631
    goto :goto_7

    .line 632
    :sswitch_a
    invoke-virtual {v3, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 633
    .line 634
    .line 635
    move-result v3

    .line 636
    if-eqz v3, :cond_4b

    .line 637
    .line 638
    goto :goto_7

    .line 639
    :sswitch_b
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 640
    .line 641
    .line 642
    move-result v3

    .line 643
    if-eqz v3, :cond_4b

    .line 644
    .line 645
    goto :goto_7

    .line 646
    :sswitch_c
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 647
    .line 648
    .line 649
    move-result v3

    .line 650
    if-eqz v3, :cond_4b

    .line 651
    .line 652
    goto :goto_7

    .line 653
    :sswitch_d
    invoke-virtual {v3, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 654
    .line 655
    .line 656
    move-result v3

    .line 657
    if-eqz v3, :cond_4b

    .line 658
    .line 659
    goto :goto_7

    .line 660
    :sswitch_e
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 661
    .line 662
    .line 663
    move-result v3

    .line 664
    if-eqz v3, :cond_4b

    .line 665
    .line 666
    goto :goto_7

    .line 667
    :sswitch_f
    move-object/from16 p1, v15

    .line 668
    .line 669
    move-object/from16 v15, v40

    .line 670
    .line 671
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 672
    .line 673
    .line 674
    move-result v3

    .line 675
    if-eqz v3, :cond_4b

    .line 676
    .line 677
    move-object/from16 v40, v15

    .line 678
    .line 679
    goto :goto_8

    .line 680
    :sswitch_10
    move-object/from16 p1, v15

    .line 681
    .line 682
    move-object/from16 v15, v39

    .line 683
    .line 684
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 685
    .line 686
    .line 687
    move-result v3

    .line 688
    if-eqz v3, :cond_4b

    .line 689
    .line 690
    move-object/from16 v39, v15

    .line 691
    .line 692
    goto :goto_8

    .line 693
    :sswitch_11
    move-object/from16 p1, v15

    .line 694
    .line 695
    move-object/from16 v15, v38

    .line 696
    .line 697
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 698
    .line 699
    .line 700
    move-result v3

    .line 701
    if-eqz v3, :cond_4b

    .line 702
    .line 703
    move-object/from16 v38, v15

    .line 704
    .line 705
    goto/16 :goto_8

    .line 706
    .line 707
    :sswitch_12
    move-object/from16 p1, v15

    .line 708
    .line 709
    move-object/from16 v15, v37

    .line 710
    .line 711
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 712
    .line 713
    .line 714
    move-result v3

    .line 715
    if-eqz v3, :cond_4b

    .line 716
    .line 717
    move-object/from16 v37, v15

    .line 718
    .line 719
    goto/16 :goto_8

    .line 720
    .line 721
    :sswitch_13
    move-object/from16 p1, v15

    .line 722
    .line 723
    move-object/from16 v15, v36

    .line 724
    .line 725
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 726
    .line 727
    .line 728
    move-result v3

    .line 729
    if-eqz v3, :cond_4b

    .line 730
    .line 731
    move-object/from16 v36, v15

    .line 732
    .line 733
    goto/16 :goto_8

    .line 734
    .line 735
    :sswitch_14
    move-object/from16 p1, v15

    .line 736
    .line 737
    move-object/from16 v15, v35

    .line 738
    .line 739
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 740
    .line 741
    .line 742
    move-result v3

    .line 743
    if-eqz v3, :cond_4b

    .line 744
    .line 745
    move-object/from16 v35, v15

    .line 746
    .line 747
    goto/16 :goto_8

    .line 748
    .line 749
    :sswitch_15
    move-object/from16 p1, v15

    .line 750
    .line 751
    move-object/from16 v15, v34

    .line 752
    .line 753
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 754
    .line 755
    .line 756
    move-result v3

    .line 757
    if-eqz v3, :cond_4b

    .line 758
    .line 759
    move-object/from16 v34, v15

    .line 760
    .line 761
    goto/16 :goto_8

    .line 762
    .line 763
    :sswitch_16
    move-object/from16 p1, v15

    .line 764
    .line 765
    move-object/from16 v15, v33

    .line 766
    .line 767
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 768
    .line 769
    .line 770
    move-result v3

    .line 771
    if-eqz v3, :cond_4b

    .line 772
    .line 773
    move-object/from16 v33, v15

    .line 774
    .line 775
    goto/16 :goto_8

    .line 776
    .line 777
    :sswitch_17
    move-object/from16 p1, v15

    .line 778
    .line 779
    move-object/from16 v15, v32

    .line 780
    .line 781
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 782
    .line 783
    .line 784
    move-result v3

    .line 785
    if-eqz v3, :cond_4b

    .line 786
    .line 787
    move-object/from16 v32, v15

    .line 788
    .line 789
    goto/16 :goto_8

    .line 790
    .line 791
    :sswitch_18
    move-object/from16 p1, v15

    .line 792
    .line 793
    move-object/from16 v15, v31

    .line 794
    .line 795
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 796
    .line 797
    .line 798
    move-result v3

    .line 799
    if-eqz v3, :cond_4b

    .line 800
    .line 801
    move-object/from16 v31, v15

    .line 802
    .line 803
    goto/16 :goto_8

    .line 804
    .line 805
    :sswitch_19
    move-object/from16 p1, v15

    .line 806
    .line 807
    move-object/from16 v15, v30

    .line 808
    .line 809
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 810
    .line 811
    .line 812
    move-result v3

    .line 813
    if-eqz v3, :cond_4b

    .line 814
    .line 815
    move-object/from16 v30, v15

    .line 816
    .line 817
    goto/16 :goto_8

    .line 818
    .line 819
    :sswitch_1a
    move-object/from16 p1, v15

    .line 820
    .line 821
    move-object/from16 v15, v29

    .line 822
    .line 823
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 824
    .line 825
    .line 826
    move-result v3

    .line 827
    if-eqz v3, :cond_4b

    .line 828
    .line 829
    move-object/from16 v29, v15

    .line 830
    .line 831
    goto/16 :goto_8

    .line 832
    .line 833
    :sswitch_1b
    move-object/from16 p1, v15

    .line 834
    .line 835
    move-object/from16 v15, v28

    .line 836
    .line 837
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 838
    .line 839
    .line 840
    move-result v3

    .line 841
    if-eqz v3, :cond_4b

    .line 842
    .line 843
    move-object/from16 v28, v15

    .line 844
    .line 845
    goto/16 :goto_8

    .line 846
    .line 847
    :sswitch_1c
    move-object/from16 p1, v15

    .line 848
    .line 849
    move-object/from16 v15, v27

    .line 850
    .line 851
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 852
    .line 853
    .line 854
    move-result v3

    .line 855
    if-eqz v3, :cond_4b

    .line 856
    .line 857
    move-object/from16 v27, v15

    .line 858
    .line 859
    goto/16 :goto_8

    .line 860
    .line 861
    :sswitch_1d
    move-object/from16 p1, v15

    .line 862
    .line 863
    move-object/from16 v15, v26

    .line 864
    .line 865
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 866
    .line 867
    .line 868
    move-result v3

    .line 869
    if-eqz v3, :cond_4b

    .line 870
    .line 871
    move-object/from16 v26, v15

    .line 872
    .line 873
    goto/16 :goto_8

    .line 874
    .line 875
    :sswitch_1e
    move-object/from16 p1, v15

    .line 876
    .line 877
    move-object/from16 v15, v25

    .line 878
    .line 879
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 880
    .line 881
    .line 882
    move-result v3

    .line 883
    if-eqz v3, :cond_4b

    .line 884
    .line 885
    move-object/from16 v25, v15

    .line 886
    .line 887
    goto/16 :goto_8

    .line 888
    .line 889
    :sswitch_1f
    move-object/from16 p1, v15

    .line 890
    .line 891
    const-string v15, "A_MS/ACM"

    .line 892
    .line 893
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 894
    .line 895
    .line 896
    move-result v3

    .line 897
    if-eqz v3, :cond_4b

    .line 898
    .line 899
    :goto_9
    goto/16 :goto_8

    .line 900
    .line 901
    :sswitch_20
    move-object/from16 p1, v15

    .line 902
    .line 903
    const-string v15, "V_MPEG4/ISO/SP"

    .line 904
    .line 905
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 906
    .line 907
    .line 908
    move-result v3

    .line 909
    if-eqz v3, :cond_4b

    .line 910
    .line 911
    goto :goto_9

    .line 912
    :sswitch_21
    move-object/from16 p1, v15

    .line 913
    .line 914
    const-string v15, "V_MPEG4/ISO/AP"

    .line 915
    .line 916
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 917
    .line 918
    .line 919
    move-result v3

    .line 920
    if-eqz v3, :cond_4b

    .line 921
    .line 922
    goto :goto_9

    .line 923
    :goto_a
    iget v15, v3, Lni1;->d:I

    .line 924
    .line 925
    move/from16 v24, v15

    .line 926
    .line 927
    iget-object v15, v3, Lni1;->c:Ljava/lang/String;

    .line 928
    .line 929
    invoke-virtual {v15}, Ljava/lang/String;->hashCode()I

    .line 930
    .line 931
    .line 932
    move-result v41

    .line 933
    move-object/from16 v42, v3

    .line 934
    .line 935
    const/16 v43, 0x14

    .line 936
    .line 937
    const/4 v3, 0x3

    .line 938
    sparse-switch v41, :sswitch_data_1

    .line 939
    .line 940
    .line 941
    goto/16 :goto_b

    .line 942
    .line 943
    :sswitch_22
    invoke-virtual {v15, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 944
    .line 945
    .line 946
    move-result v0

    .line 947
    if-eqz v0, :cond_1d

    .line 948
    .line 949
    const/16 v0, 0xc

    .line 950
    .line 951
    goto/16 :goto_c

    .line 952
    .line 953
    :sswitch_23
    invoke-virtual {v15, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 954
    .line 955
    .line 956
    move-result v0

    .line 957
    if-eqz v0, :cond_1d

    .line 958
    .line 959
    const/16 v0, 0x16

    .line 960
    .line 961
    goto/16 :goto_c

    .line 962
    .line 963
    :sswitch_24
    invoke-virtual {v15, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 964
    .line 965
    .line 966
    move-result v0

    .line 967
    if-eqz v0, :cond_1d

    .line 968
    .line 969
    const/16 v0, 0x11

    .line 970
    .line 971
    goto/16 :goto_c

    .line 972
    .line 973
    :sswitch_25
    invoke-virtual {v15, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 974
    .line 975
    .line 976
    move-result v0

    .line 977
    if-eqz v0, :cond_1d

    .line 978
    .line 979
    move v0, v3

    .line 980
    goto/16 :goto_c

    .line 981
    .line 982
    :sswitch_26
    invoke-virtual {v15, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 983
    .line 984
    .line 985
    move-result v0

    .line 986
    if-eqz v0, :cond_1d

    .line 987
    .line 988
    const/16 v0, 0x1b

    .line 989
    .line 990
    goto/16 :goto_c

    .line 991
    .line 992
    :sswitch_27
    invoke-virtual {v15, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 993
    .line 994
    .line 995
    move-result v0

    .line 996
    if-eqz v0, :cond_1d

    .line 997
    .line 998
    const/16 v0, 0x1e

    .line 999
    .line 1000
    goto/16 :goto_c

    .line 1001
    .line 1002
    :sswitch_28
    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1003
    .line 1004
    .line 1005
    move-result v0

    .line 1006
    if-eqz v0, :cond_1d

    .line 1007
    .line 1008
    const/16 v0, 0x8

    .line 1009
    .line 1010
    goto/16 :goto_c

    .line 1011
    .line 1012
    :sswitch_29
    invoke-virtual {v15, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1013
    .line 1014
    .line 1015
    move-result v0

    .line 1016
    if-eqz v0, :cond_1d

    .line 1017
    .line 1018
    const/16 v0, 0x1d

    .line 1019
    .line 1020
    goto/16 :goto_c

    .line 1021
    .line 1022
    :sswitch_2a
    invoke-virtual {v15, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1023
    .line 1024
    .line 1025
    move-result v0

    .line 1026
    if-eqz v0, :cond_1d

    .line 1027
    .line 1028
    const/16 v0, 0x1c

    .line 1029
    .line 1030
    goto/16 :goto_c

    .line 1031
    .line 1032
    :sswitch_2b
    invoke-virtual {v15, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1033
    .line 1034
    .line 1035
    move-result v0

    .line 1036
    if-eqz v0, :cond_1d

    .line 1037
    .line 1038
    const/16 v0, 0x18

    .line 1039
    .line 1040
    goto/16 :goto_c

    .line 1041
    .line 1042
    :sswitch_2c
    invoke-virtual {v15, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1043
    .line 1044
    .line 1045
    move-result v0

    .line 1046
    if-eqz v0, :cond_1d

    .line 1047
    .line 1048
    const/16 v0, 0x19

    .line 1049
    .line 1050
    goto/16 :goto_c

    .line 1051
    .line 1052
    :sswitch_2d
    invoke-virtual {v15, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1053
    .line 1054
    .line 1055
    move-result v0

    .line 1056
    if-eqz v0, :cond_1d

    .line 1057
    .line 1058
    const/16 v0, 0x1a

    .line 1059
    .line 1060
    goto/16 :goto_c

    .line 1061
    .line 1062
    :sswitch_2e
    invoke-virtual {v15, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1063
    .line 1064
    .line 1065
    move-result v0

    .line 1066
    if-eqz v0, :cond_1d

    .line 1067
    .line 1068
    move/from16 v0, v43

    .line 1069
    .line 1070
    goto/16 :goto_c

    .line 1071
    .line 1072
    :sswitch_2f
    invoke-virtual {v15, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1073
    .line 1074
    .line 1075
    move-result v0

    .line 1076
    if-eqz v0, :cond_1d

    .line 1077
    .line 1078
    const/16 v0, 0xa

    .line 1079
    .line 1080
    goto/16 :goto_c

    .line 1081
    .line 1082
    :sswitch_30
    move-object/from16 v0, p1

    .line 1083
    .line 1084
    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1085
    .line 1086
    .line 1087
    move-result v0

    .line 1088
    if-eqz v0, :cond_1d

    .line 1089
    .line 1090
    const/16 v0, 0x20

    .line 1091
    .line 1092
    goto/16 :goto_c

    .line 1093
    .line 1094
    :sswitch_31
    move-object/from16 v0, v40

    .line 1095
    .line 1096
    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1097
    .line 1098
    .line 1099
    move-result v0

    .line 1100
    if-eqz v0, :cond_1d

    .line 1101
    .line 1102
    const/4 v0, 0x1

    .line 1103
    goto/16 :goto_c

    .line 1104
    .line 1105
    :sswitch_32
    move-object/from16 v0, v39

    .line 1106
    .line 1107
    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1108
    .line 1109
    .line 1110
    move-result v0

    .line 1111
    if-eqz v0, :cond_1d

    .line 1112
    .line 1113
    const/4 v0, 0x0

    .line 1114
    goto/16 :goto_c

    .line 1115
    .line 1116
    :sswitch_33
    move-object/from16 v0, v38

    .line 1117
    .line 1118
    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1119
    .line 1120
    .line 1121
    move-result v0

    .line 1122
    if-eqz v0, :cond_1d

    .line 1123
    .line 1124
    const/4 v0, 0x2

    .line 1125
    goto/16 :goto_c

    .line 1126
    .line 1127
    :sswitch_34
    move-object/from16 v0, v37

    .line 1128
    .line 1129
    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1130
    .line 1131
    .line 1132
    move-result v0

    .line 1133
    if-eqz v0, :cond_1d

    .line 1134
    .line 1135
    const/16 v0, 0x13

    .line 1136
    .line 1137
    goto/16 :goto_c

    .line 1138
    .line 1139
    :sswitch_35
    move-object/from16 v0, v36

    .line 1140
    .line 1141
    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1142
    .line 1143
    .line 1144
    move-result v0

    .line 1145
    if-eqz v0, :cond_1d

    .line 1146
    .line 1147
    const/16 v0, 0x10

    .line 1148
    .line 1149
    goto/16 :goto_c

    .line 1150
    .line 1151
    :sswitch_36
    move-object/from16 v0, v35

    .line 1152
    .line 1153
    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1154
    .line 1155
    .line 1156
    move-result v0

    .line 1157
    if-eqz v0, :cond_1d

    .line 1158
    .line 1159
    const/16 v0, 0xd

    .line 1160
    .line 1161
    goto/16 :goto_c

    .line 1162
    .line 1163
    :sswitch_37
    move-object/from16 v0, v34

    .line 1164
    .line 1165
    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1166
    .line 1167
    .line 1168
    move-result v0

    .line 1169
    if-eqz v0, :cond_1d

    .line 1170
    .line 1171
    const/16 v0, 0x15

    .line 1172
    .line 1173
    goto/16 :goto_c

    .line 1174
    .line 1175
    :sswitch_38
    move-object/from16 v0, v33

    .line 1176
    .line 1177
    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1178
    .line 1179
    .line 1180
    move-result v0

    .line 1181
    if-eqz v0, :cond_1d

    .line 1182
    .line 1183
    const/16 v0, 0x1f

    .line 1184
    .line 1185
    goto/16 :goto_c

    .line 1186
    .line 1187
    :sswitch_39
    move-object/from16 v0, v32

    .line 1188
    .line 1189
    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1190
    .line 1191
    .line 1192
    move-result v0

    .line 1193
    if-eqz v0, :cond_1d

    .line 1194
    .line 1195
    const/4 v0, 0x7

    .line 1196
    goto/16 :goto_c

    .line 1197
    .line 1198
    :sswitch_3a
    move-object/from16 v0, v31

    .line 1199
    .line 1200
    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1201
    .line 1202
    .line 1203
    move-result v0

    .line 1204
    if-eqz v0, :cond_1d

    .line 1205
    .line 1206
    const/4 v0, 0x5

    .line 1207
    goto/16 :goto_c

    .line 1208
    .line 1209
    :sswitch_3b
    move-object/from16 v0, v30

    .line 1210
    .line 1211
    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1212
    .line 1213
    .line 1214
    move-result v0

    .line 1215
    if-eqz v0, :cond_1d

    .line 1216
    .line 1217
    const/16 v0, 0x21

    .line 1218
    .line 1219
    goto :goto_c

    .line 1220
    :sswitch_3c
    move-object/from16 v0, v29

    .line 1221
    .line 1222
    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1223
    .line 1224
    .line 1225
    move-result v0

    .line 1226
    if-eqz v0, :cond_1d

    .line 1227
    .line 1228
    const/16 v0, 0x9

    .line 1229
    .line 1230
    goto :goto_c

    .line 1231
    :sswitch_3d
    move-object/from16 v0, v28

    .line 1232
    .line 1233
    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1234
    .line 1235
    .line 1236
    move-result v0

    .line 1237
    if-eqz v0, :cond_1d

    .line 1238
    .line 1239
    const/16 v0, 0xf

    .line 1240
    .line 1241
    goto :goto_c

    .line 1242
    :sswitch_3e
    move-object/from16 v0, v27

    .line 1243
    .line 1244
    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1245
    .line 1246
    .line 1247
    move-result v0

    .line 1248
    if-eqz v0, :cond_1d

    .line 1249
    .line 1250
    const/16 v0, 0xe

    .line 1251
    .line 1252
    goto :goto_c

    .line 1253
    :sswitch_3f
    move-object/from16 v0, v26

    .line 1254
    .line 1255
    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1256
    .line 1257
    .line 1258
    move-result v0

    .line 1259
    if-eqz v0, :cond_1d

    .line 1260
    .line 1261
    const/16 v0, 0xb

    .line 1262
    .line 1263
    goto :goto_c

    .line 1264
    :sswitch_40
    move-object/from16 v0, v25

    .line 1265
    .line 1266
    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1267
    .line 1268
    .line 1269
    move-result v0

    .line 1270
    if-eqz v0, :cond_1d

    .line 1271
    .line 1272
    const/16 v0, 0x12

    .line 1273
    .line 1274
    goto :goto_c

    .line 1275
    :sswitch_41
    const-string v0, "A_MS/ACM"

    .line 1276
    .line 1277
    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1278
    .line 1279
    .line 1280
    move-result v0

    .line 1281
    if-eqz v0, :cond_1d

    .line 1282
    .line 1283
    const/16 v0, 0x17

    .line 1284
    .line 1285
    goto :goto_c

    .line 1286
    :sswitch_42
    const-string v0, "V_MPEG4/ISO/SP"

    .line 1287
    .line 1288
    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1289
    .line 1290
    .line 1291
    move-result v0

    .line 1292
    if-eqz v0, :cond_1d

    .line 1293
    .line 1294
    const/4 v0, 0x4

    .line 1295
    goto :goto_c

    .line 1296
    :sswitch_43
    const-string v0, "V_MPEG4/ISO/AP"

    .line 1297
    .line 1298
    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1299
    .line 1300
    .line 1301
    move-result v0

    .line 1302
    if-eqz v0, :cond_1d

    .line 1303
    .line 1304
    const/4 v0, 0x6

    .line 1305
    goto :goto_c

    .line 1306
    :cond_1d
    :goto_b
    const/4 v0, -0x1

    .line 1307
    :goto_c
    const-string v1, "audio/raw"

    .line 1308
    .line 1309
    const-string v2, "audio/x-unknown"

    .line 1310
    .line 1311
    const-string v4, ". Setting mimeType to audio/x-unknown"

    .line 1312
    .line 1313
    packed-switch v0, :pswitch_data_0

    .line 1314
    .line 1315
    .line 1316
    const-string v0, "Unrecognized codec identifier."

    .line 1317
    .line 1318
    const/4 v1, 0x0

    .line 1319
    invoke-static {v1, v0}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 1320
    .line 1321
    .line 1322
    move-result-object v0

    .line 1323
    throw v0

    .line 1324
    :pswitch_0
    const/4 v0, 0x4

    .line 1325
    new-array v1, v0, [B

    .line 1326
    .line 1327
    move-object/from16 v5, v42

    .line 1328
    .line 1329
    invoke-virtual {v5, v15}, Lni1;->a(Ljava/lang/String;)[B

    .line 1330
    .line 1331
    .line 1332
    move-result-object v2

    .line 1333
    const/4 v4, 0x0

    .line 1334
    invoke-static {v2, v4, v1, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1335
    .line 1336
    .line 1337
    invoke-static {v1}, Lxm3;->i(Ljava/lang/Object;)Lsn3;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v0

    .line 1341
    const-string v1, "application/dvbsubs"

    .line 1342
    .line 1343
    :goto_d
    move-object v2, v0

    .line 1344
    const/4 v0, -0x1

    .line 1345
    :goto_e
    const/4 v4, -0x1

    .line 1346
    :goto_f
    const/4 v6, 0x0

    .line 1347
    goto/16 :goto_23

    .line 1348
    .line 1349
    :pswitch_1
    move-object/from16 v5, v42

    .line 1350
    .line 1351
    const-string v1, "application/pgs"

    .line 1352
    .line 1353
    :goto_10
    const/4 v0, -0x1

    .line 1354
    :goto_11
    const/4 v2, 0x0

    .line 1355
    goto :goto_e

    .line 1356
    :pswitch_2
    move-object/from16 v5, v42

    .line 1357
    .line 1358
    invoke-virtual {v5, v15}, Lni1;->a(Ljava/lang/String;)[B

    .line 1359
    .line 1360
    .line 1361
    move-result-object v0

    .line 1362
    invoke-static {v0}, Lxm3;->i(Ljava/lang/Object;)Lsn3;

    .line 1363
    .line 1364
    .line 1365
    move-result-object v0

    .line 1366
    const-string v1, "application/vobsub"

    .line 1367
    .line 1368
    goto :goto_d

    .line 1369
    :pswitch_3
    move-object/from16 v5, v42

    .line 1370
    .line 1371
    const-string v1, "text/vtt"

    .line 1372
    .line 1373
    goto :goto_10

    .line 1374
    :pswitch_4
    move-object/from16 v5, v42

    .line 1375
    .line 1376
    iget-object v0, v5, Lni1;->c:Ljava/lang/String;

    .line 1377
    .line 1378
    invoke-virtual {v5, v0}, Lni1;->a(Ljava/lang/String;)[B

    .line 1379
    .line 1380
    .line 1381
    move-result-object v0

    .line 1382
    sget-object v1, Loi1;->k0:[B

    .line 1383
    .line 1384
    invoke-static {v1, v0}, Lxm3;->j(Ljava/lang/Object;Ljava/lang/Object;)Lsn3;

    .line 1385
    .line 1386
    .line 1387
    move-result-object v0

    .line 1388
    const-string v1, "text/x-ssa"

    .line 1389
    .line 1390
    goto :goto_d

    .line 1391
    :pswitch_5
    move-object/from16 v5, v42

    .line 1392
    .line 1393
    const-string v1, "application/x-subrip"

    .line 1394
    .line 1395
    goto :goto_10

    .line 1396
    :pswitch_6
    move-object/from16 v5, v42

    .line 1397
    .line 1398
    const/4 v0, 0x4

    .line 1399
    iget v6, v5, Lni1;->R:I

    .line 1400
    .line 1401
    const/16 v7, 0x20

    .line 1402
    .line 1403
    if-ne v6, v7, :cond_1f

    .line 1404
    .line 1405
    :cond_1e
    :goto_12
    move v4, v0

    .line 1406
    :goto_13
    const/4 v0, -0x1

    .line 1407
    const/4 v2, 0x0

    .line 1408
    goto :goto_f

    .line 1409
    :cond_1f
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1410
    .line 1411
    .line 1412
    move-result-object v0

    .line 1413
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1414
    .line 1415
    .line 1416
    move-result v0

    .line 1417
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1418
    .line 1419
    add-int/lit8 v0, v0, 0x4f

    .line 1420
    .line 1421
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1422
    .line 1423
    .line 1424
    const-string v0, "Unsupported floating point PCM bit depth: "

    .line 1425
    .line 1426
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1427
    .line 1428
    .line 1429
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1430
    .line 1431
    .line 1432
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1433
    .line 1434
    .line 1435
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1436
    .line 1437
    .line 1438
    move-result-object v0

    .line 1439
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    .line 1440
    .line 1441
    .line 1442
    :goto_14
    move-object v1, v2

    .line 1443
    goto :goto_10

    .line 1444
    :pswitch_7
    move-object/from16 v5, v42

    .line 1445
    .line 1446
    iget v0, v5, Lni1;->R:I

    .line 1447
    .line 1448
    const/16 v6, 0x8

    .line 1449
    .line 1450
    if-ne v0, v6, :cond_20

    .line 1451
    .line 1452
    move v4, v3

    .line 1453
    goto :goto_13

    .line 1454
    :cond_20
    const/16 v6, 0x10

    .line 1455
    .line 1456
    if-ne v0, v6, :cond_21

    .line 1457
    .line 1458
    const/high16 v0, 0x10000000

    .line 1459
    .line 1460
    goto :goto_12

    .line 1461
    :cond_21
    const/16 v6, 0x18

    .line 1462
    .line 1463
    if-ne v0, v6, :cond_22

    .line 1464
    .line 1465
    const/high16 v0, 0x50000000

    .line 1466
    .line 1467
    goto :goto_12

    .line 1468
    :cond_22
    const/16 v7, 0x20

    .line 1469
    .line 1470
    if-ne v0, v7, :cond_23

    .line 1471
    .line 1472
    const/high16 v0, 0x60000000

    .line 1473
    .line 1474
    goto :goto_12

    .line 1475
    :cond_23
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1476
    .line 1477
    .line 1478
    move-result-object v1

    .line 1479
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1480
    .line 1481
    .line 1482
    move-result v1

    .line 1483
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1484
    .line 1485
    add-int/lit8 v1, v1, 0x4b

    .line 1486
    .line 1487
    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1488
    .line 1489
    .line 1490
    const-string v1, "Unsupported big endian PCM bit depth: "

    .line 1491
    .line 1492
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1493
    .line 1494
    .line 1495
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1496
    .line 1497
    .line 1498
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1499
    .line 1500
    .line 1501
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1502
    .line 1503
    .line 1504
    move-result-object v0

    .line 1505
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    .line 1506
    .line 1507
    .line 1508
    goto :goto_14

    .line 1509
    :pswitch_8
    move-object/from16 v5, v42

    .line 1510
    .line 1511
    iget v0, v5, Lni1;->R:I

    .line 1512
    .line 1513
    sget-object v6, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 1514
    .line 1515
    invoke-static {v0, v6}, Lv23;->y(ILjava/nio/ByteOrder;)I

    .line 1516
    .line 1517
    .line 1518
    move-result v0

    .line 1519
    if-nez v0, :cond_1e

    .line 1520
    .line 1521
    iget v0, v5, Lni1;->R:I

    .line 1522
    .line 1523
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1524
    .line 1525
    .line 1526
    move-result-object v1

    .line 1527
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1528
    .line 1529
    .line 1530
    move-result v1

    .line 1531
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1532
    .line 1533
    add-int/lit8 v1, v1, 0x4e

    .line 1534
    .line 1535
    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1536
    .line 1537
    .line 1538
    const-string v1, "Unsupported little endian PCM bit depth: "

    .line 1539
    .line 1540
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1541
    .line 1542
    .line 1543
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1544
    .line 1545
    .line 1546
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1547
    .line 1548
    .line 1549
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1550
    .line 1551
    .line 1552
    move-result-object v0

    .line 1553
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    .line 1554
    .line 1555
    .line 1556
    goto :goto_14

    .line 1557
    :pswitch_9
    move-object/from16 v5, v42

    .line 1558
    .line 1559
    new-instance v0, Lkz2;

    .line 1560
    .line 1561
    iget-object v6, v5, Lni1;->c:Ljava/lang/String;

    .line 1562
    .line 1563
    invoke-virtual {v5, v6}, Lni1;->a(Ljava/lang/String;)[B

    .line 1564
    .line 1565
    .line 1566
    move-result-object v6

    .line 1567
    invoke-direct {v0, v6}, Lkz2;-><init>([B)V

    .line 1568
    .line 1569
    .line 1570
    :try_start_0
    invoke-virtual {v0}, Lkz2;->M()I

    .line 1571
    .line 1572
    .line 1573
    move-result v6

    .line 1574
    const/4 v7, 0x1

    .line 1575
    if-ne v6, v7, :cond_24

    .line 1576
    .line 1577
    goto :goto_15

    .line 1578
    :cond_24
    const v7, 0xfffe

    .line 1579
    .line 1580
    .line 1581
    if-ne v6, v7, :cond_25

    .line 1582
    .line 1583
    const/16 v6, 0x18

    .line 1584
    .line 1585
    invoke-virtual {v0, v6}, Lkz2;->E(I)V

    .line 1586
    .line 1587
    .line 1588
    invoke-virtual {v0}, Lkz2;->d()J

    .line 1589
    .line 1590
    .line 1591
    move-result-wide v6

    .line 1592
    sget-object v8, Loi1;->n0:Ljava/util/UUID;

    .line 1593
    .line 1594
    invoke-virtual {v8}, Ljava/util/UUID;->getMostSignificantBits()J

    .line 1595
    .line 1596
    .line 1597
    move-result-wide v9

    .line 1598
    cmp-long v6, v6, v9

    .line 1599
    .line 1600
    if-nez v6, :cond_25

    .line 1601
    .line 1602
    invoke-virtual {v0}, Lkz2;->d()J

    .line 1603
    .line 1604
    .line 1605
    move-result-wide v6

    .line 1606
    invoke-virtual {v8}, Ljava/util/UUID;->getLeastSignificantBits()J

    .line 1607
    .line 1608
    .line 1609
    move-result-wide v8
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1610
    cmp-long v0, v6, v8

    .line 1611
    .line 1612
    if-nez v0, :cond_25

    .line 1613
    .line 1614
    :goto_15
    iget v0, v5, Lni1;->R:I

    .line 1615
    .line 1616
    sget-object v6, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 1617
    .line 1618
    invoke-static {v0, v6}, Lv23;->y(ILjava/nio/ByteOrder;)I

    .line 1619
    .line 1620
    .line 1621
    move-result v0

    .line 1622
    if-nez v0, :cond_1e

    .line 1623
    .line 1624
    iget v0, v5, Lni1;->R:I

    .line 1625
    .line 1626
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1627
    .line 1628
    .line 1629
    move-result-object v1

    .line 1630
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1631
    .line 1632
    .line 1633
    move-result v1

    .line 1634
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1635
    .line 1636
    add-int/lit8 v1, v1, 0x40

    .line 1637
    .line 1638
    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1639
    .line 1640
    .line 1641
    const-string v1, "Unsupported PCM bit depth: "

    .line 1642
    .line 1643
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1644
    .line 1645
    .line 1646
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1647
    .line 1648
    .line 1649
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1650
    .line 1651
    .line 1652
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1653
    .line 1654
    .line 1655
    move-result-object v0

    .line 1656
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    .line 1657
    .line 1658
    .line 1659
    goto/16 :goto_14

    .line 1660
    .line 1661
    :cond_25
    const-string v0, "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown"

    .line 1662
    .line 1663
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    .line 1664
    .line 1665
    .line 1666
    goto/16 :goto_14

    .line 1667
    .line 1668
    :catch_0
    const-string v0, "Error parsing MS/ACM codec private"

    .line 1669
    .line 1670
    const/4 v1, 0x0

    .line 1671
    invoke-static {v1, v0}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 1672
    .line 1673
    .line 1674
    move-result-object v0

    .line 1675
    throw v0

    .line 1676
    :pswitch_a
    move-object/from16 v5, v42

    .line 1677
    .line 1678
    invoke-virtual {v5, v15}, Lni1;->a(Ljava/lang/String;)[B

    .line 1679
    .line 1680
    .line 1681
    move-result-object v0

    .line 1682
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 1683
    .line 1684
    .line 1685
    move-result-object v0

    .line 1686
    const-string v1, "audio/flac"

    .line 1687
    .line 1688
    goto/16 :goto_d

    .line 1689
    .line 1690
    :pswitch_b
    move-object/from16 v5, v42

    .line 1691
    .line 1692
    const-string v1, "audio/vnd.dts.hd"

    .line 1693
    .line 1694
    goto/16 :goto_10

    .line 1695
    .line 1696
    :pswitch_c
    move-object/from16 v5, v42

    .line 1697
    .line 1698
    const/4 v7, 0x1

    .line 1699
    iput-boolean v7, v5, Lni1;->W:Z

    .line 1700
    .line 1701
    const-string v1, "audio/vnd.dts"

    .line 1702
    .line 1703
    goto/16 :goto_10

    .line 1704
    .line 1705
    :pswitch_d
    move-object/from16 v5, v42

    .line 1706
    .line 1707
    new-instance v0, Lkg1;

    .line 1708
    .line 1709
    invoke-direct {v0}, Lkg1;-><init>()V

    .line 1710
    .line 1711
    .line 1712
    iput-object v0, v5, Lni1;->V:Lkg1;

    .line 1713
    .line 1714
    const-string v1, "audio/true-hd"

    .line 1715
    .line 1716
    goto/16 :goto_10

    .line 1717
    .line 1718
    :pswitch_e
    move-object/from16 v5, v42

    .line 1719
    .line 1720
    const-string v1, "audio/eac3"

    .line 1721
    .line 1722
    goto/16 :goto_10

    .line 1723
    .line 1724
    :pswitch_f
    move-object/from16 v5, v42

    .line 1725
    .line 1726
    const-string v1, "audio/ac3"

    .line 1727
    .line 1728
    goto/16 :goto_10

    .line 1729
    .line 1730
    :pswitch_10
    move-object/from16 v5, v42

    .line 1731
    .line 1732
    const/16 v0, 0x1000

    .line 1733
    .line 1734
    const-string v1, "audio/mpeg"

    .line 1735
    .line 1736
    goto/16 :goto_11

    .line 1737
    .line 1738
    :pswitch_11
    move-object/from16 v5, v42

    .line 1739
    .line 1740
    const/16 v0, 0x1000

    .line 1741
    .line 1742
    const-string v1, "audio/mpeg-L2"

    .line 1743
    .line 1744
    goto/16 :goto_11

    .line 1745
    .line 1746
    :pswitch_12
    move-object/from16 v5, v42

    .line 1747
    .line 1748
    invoke-virtual {v5, v15}, Lni1;->a(Ljava/lang/String;)[B

    .line 1749
    .line 1750
    .line 1751
    move-result-object v0

    .line 1752
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 1753
    .line 1754
    .line 1755
    move-result-object v0

    .line 1756
    iget-object v1, v5, Lni1;->l:[B

    .line 1757
    .line 1758
    new-instance v2, Llg1;

    .line 1759
    .line 1760
    array-length v4, v1

    .line 1761
    invoke-direct {v2, v4, v1}, Llg1;-><init>(I[B)V

    .line 1762
    .line 1763
    .line 1764
    const/4 v4, 0x0

    .line 1765
    invoke-static {v2, v4}, Li30;->g0(Llg1;Z)Lqe1;

    .line 1766
    .line 1767
    .line 1768
    move-result-object v1

    .line 1769
    iget v2, v1, Lqe1;->b:I

    .line 1770
    .line 1771
    iput v2, v5, Lni1;->S:I

    .line 1772
    .line 1773
    iget v2, v1, Lqe1;->c:I

    .line 1774
    .line 1775
    iput v2, v5, Lni1;->Q:I

    .line 1776
    .line 1777
    iget-object v1, v1, Lqe1;->a:Ljava/lang/String;

    .line 1778
    .line 1779
    const-string v2, "audio/mp4a-latm"

    .line 1780
    .line 1781
    move-object v6, v1

    .line 1782
    move-object v1, v2

    .line 1783
    const/4 v4, -0x1

    .line 1784
    move-object v2, v0

    .line 1785
    const/4 v0, -0x1

    .line 1786
    goto/16 :goto_23

    .line 1787
    .line 1788
    :pswitch_13
    move-object/from16 v5, v42

    .line 1789
    .line 1790
    new-instance v0, Ljava/util/ArrayList;

    .line 1791
    .line 1792
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1793
    .line 1794
    .line 1795
    iget-object v1, v5, Lni1;->c:Ljava/lang/String;

    .line 1796
    .line 1797
    invoke-virtual {v5, v1}, Lni1;->a(Ljava/lang/String;)[B

    .line 1798
    .line 1799
    .line 1800
    move-result-object v1

    .line 1801
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1802
    .line 1803
    .line 1804
    const/16 v44, 0x8

    .line 1805
    .line 1806
    invoke-static/range {v44 .. v44}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 1807
    .line 1808
    .line 1809
    move-result-object v1

    .line 1810
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 1811
    .line 1812
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 1813
    .line 1814
    .line 1815
    move-result-object v1

    .line 1816
    iget-wide v6, v5, Lni1;->T:J

    .line 1817
    .line 1818
    invoke-virtual {v1, v6, v7}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 1819
    .line 1820
    .line 1821
    move-result-object v1

    .line 1822
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    .line 1823
    .line 1824
    .line 1825
    move-result-object v1

    .line 1826
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1827
    .line 1828
    .line 1829
    invoke-static/range {v44 .. v44}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 1830
    .line 1831
    .line 1832
    move-result-object v1

    .line 1833
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 1834
    .line 1835
    .line 1836
    move-result-object v1

    .line 1837
    iget-wide v6, v5, Lni1;->U:J

    .line 1838
    .line 1839
    invoke-virtual {v1, v6, v7}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 1840
    .line 1841
    .line 1842
    move-result-object v1

    .line 1843
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    .line 1844
    .line 1845
    .line 1846
    move-result-object v1

    .line 1847
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1848
    .line 1849
    .line 1850
    const/16 v1, 0x1680

    .line 1851
    .line 1852
    const-string v2, "audio/opus"

    .line 1853
    .line 1854
    :goto_16
    move-object v4, v2

    .line 1855
    move-object v2, v0

    .line 1856
    move v0, v1

    .line 1857
    move-object v1, v4

    .line 1858
    goto/16 :goto_e

    .line 1859
    .line 1860
    :pswitch_14
    move-object/from16 v5, v42

    .line 1861
    .line 1862
    invoke-virtual {v5, v15}, Lni1;->a(Ljava/lang/String;)[B

    .line 1863
    .line 1864
    .line 1865
    move-result-object v0

    .line 1866
    const-string v1, "Error parsing vorbis codec private"

    .line 1867
    .line 1868
    const/16 v19, 0x0

    .line 1869
    .line 1870
    :try_start_1
    aget-byte v2, v0, v19

    .line 1871
    .line 1872
    const/4 v4, 0x2

    .line 1873
    if-ne v2, v4, :cond_2b

    .line 1874
    .line 1875
    const/4 v2, 0x1

    .line 1876
    const/4 v4, 0x0

    .line 1877
    :goto_17
    aget-byte v6, v0, v2

    .line 1878
    .line 1879
    add-int/lit8 v2, v2, 0x1

    .line 1880
    .line 1881
    const/16 v7, 0xff

    .line 1882
    .line 1883
    and-int/2addr v6, v7

    .line 1884
    if-ne v6, v7, :cond_26

    .line 1885
    .line 1886
    add-int/lit16 v4, v4, 0xff

    .line 1887
    .line 1888
    goto :goto_17

    .line 1889
    :cond_26
    add-int/2addr v4, v6

    .line 1890
    const/4 v6, 0x0

    .line 1891
    :goto_18
    aget-byte v8, v0, v2

    .line 1892
    .line 1893
    add-int/lit8 v2, v2, 0x1

    .line 1894
    .line 1895
    and-int/2addr v8, v7

    .line 1896
    if-ne v8, v7, :cond_27

    .line 1897
    .line 1898
    add-int/lit16 v6, v6, 0xff

    .line 1899
    .line 1900
    goto :goto_18

    .line 1901
    :cond_27
    add-int/2addr v6, v8

    .line 1902
    aget-byte v7, v0, v2

    .line 1903
    .line 1904
    const/4 v8, 0x1

    .line 1905
    if-ne v7, v8, :cond_2a

    .line 1906
    .line 1907
    new-array v7, v4, [B

    .line 1908
    .line 1909
    const/4 v8, 0x0

    .line 1910
    invoke-static {v0, v2, v7, v8, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1911
    .line 1912
    .line 1913
    add-int/2addr v2, v4

    .line 1914
    aget-byte v4, v0, v2

    .line 1915
    .line 1916
    if-ne v4, v3, :cond_29

    .line 1917
    .line 1918
    add-int/2addr v2, v6

    .line 1919
    aget-byte v4, v0, v2

    .line 1920
    .line 1921
    const/4 v6, 0x5

    .line 1922
    if-ne v4, v6, :cond_28

    .line 1923
    .line 1924
    array-length v4, v0

    .line 1925
    sub-int/2addr v4, v2

    .line 1926
    new-array v6, v4, [B

    .line 1927
    .line 1928
    const/4 v8, 0x0

    .line 1929
    invoke-static {v0, v2, v6, v8, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1930
    .line 1931
    .line 1932
    new-instance v0, Ljava/util/ArrayList;

    .line 1933
    .line 1934
    const/4 v4, 0x2

    .line 1935
    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 1936
    .line 1937
    .line 1938
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1939
    .line 1940
    .line 1941
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1942
    .line 1943
    .line 1944
    const/16 v1, 0x2000

    .line 1945
    .line 1946
    const-string v2, "audio/vorbis"

    .line 1947
    .line 1948
    goto :goto_16

    .line 1949
    :catch_1
    const/4 v0, 0x0

    .line 1950
    goto :goto_19

    .line 1951
    :cond_28
    const/4 v0, 0x0

    .line 1952
    :try_start_2
    invoke-static {v0, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 1953
    .line 1954
    .line 1955
    move-result-object v2

    .line 1956
    throw v2

    .line 1957
    :cond_29
    const/4 v0, 0x0

    .line 1958
    invoke-static {v0, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 1959
    .line 1960
    .line 1961
    move-result-object v2

    .line 1962
    throw v2

    .line 1963
    :cond_2a
    const/4 v0, 0x0

    .line 1964
    invoke-static {v0, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 1965
    .line 1966
    .line 1967
    move-result-object v2

    .line 1968
    throw v2

    .line 1969
    :cond_2b
    const/4 v0, 0x0

    .line 1970
    invoke-static {v0, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 1971
    .line 1972
    .line 1973
    move-result-object v2

    .line 1974
    throw v2
    :try_end_2
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_2

    .line 1975
    :catch_2
    :goto_19
    invoke-static {v0, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 1976
    .line 1977
    .line 1978
    move-result-object v0

    .line 1979
    throw v0

    .line 1980
    :pswitch_15
    move-object/from16 v5, v42

    .line 1981
    .line 1982
    const-string v1, "video/x-unknown"

    .line 1983
    .line 1984
    goto/16 :goto_10

    .line 1985
    .line 1986
    :pswitch_16
    move-object/from16 v5, v42

    .line 1987
    .line 1988
    new-instance v0, Lkz2;

    .line 1989
    .line 1990
    iget-object v1, v5, Lni1;->c:Ljava/lang/String;

    .line 1991
    .line 1992
    invoke-virtual {v5, v1}, Lni1;->a(Ljava/lang/String;)[B

    .line 1993
    .line 1994
    .line 1995
    move-result-object v1

    .line 1996
    invoke-direct {v0, v1}, Lkz2;-><init>([B)V

    .line 1997
    .line 1998
    .line 1999
    const/16 v6, 0x10

    .line 2000
    .line 2001
    :try_start_3
    invoke-virtual {v0, v6}, Lkz2;->G(I)V

    .line 2002
    .line 2003
    .line 2004
    invoke-virtual {v0}, Lkz2;->a()J

    .line 2005
    .line 2006
    .line 2007
    move-result-wide v1

    .line 2008
    const-wide/32 v6, 0x58564944

    .line 2009
    .line 2010
    .line 2011
    cmp-long v4, v1, v6

    .line 2012
    .line 2013
    if-nez v4, :cond_2c

    .line 2014
    .line 2015
    new-instance v0, Landroid/util/Pair;

    .line 2016
    .line 2017
    const-string v1, "video/divx"
    :try_end_3
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_3 .. :try_end_3} :catch_3

    .line 2018
    .line 2019
    const/4 v2, 0x0

    .line 2020
    :try_start_4
    invoke-direct {v0, v1, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_4 .. :try_end_4} :catch_5

    .line 2021
    .line 2022
    .line 2023
    :goto_1a
    const/4 v2, 0x0

    .line 2024
    goto/16 :goto_1c

    .line 2025
    .line 2026
    :catch_3
    const/4 v2, 0x0

    .line 2027
    goto/16 :goto_1e

    .line 2028
    .line 2029
    :cond_2c
    const-wide/32 v6, 0x33363248

    .line 2030
    .line 2031
    .line 2032
    cmp-long v4, v1, v6

    .line 2033
    .line 2034
    if-nez v4, :cond_2d

    .line 2035
    .line 2036
    :try_start_5
    new-instance v0, Landroid/util/Pair;

    .line 2037
    .line 2038
    const-string v1, "video/3gpp"
    :try_end_5
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_5 .. :try_end_5} :catch_3

    .line 2039
    .line 2040
    const/4 v2, 0x0

    .line 2041
    :try_start_6
    invoke-direct {v0, v1, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_6 .. :try_end_6} :catch_5

    .line 2042
    .line 2043
    .line 2044
    goto :goto_1a

    .line 2045
    :cond_2d
    const-wide/32 v6, 0x31435657

    .line 2046
    .line 2047
    .line 2048
    cmp-long v1, v1, v6

    .line 2049
    .line 2050
    if-nez v1, :cond_31

    .line 2051
    .line 2052
    :try_start_7
    iget v1, v0, Lkz2;->b:I

    .line 2053
    .line 2054
    add-int/lit8 v1, v1, 0x14

    .line 2055
    .line 2056
    iget-object v0, v0, Lkz2;->a:[B

    .line 2057
    .line 2058
    :goto_1b
    array-length v2, v0

    .line 2059
    add-int/lit8 v4, v2, -0x4

    .line 2060
    .line 2061
    if-ge v1, v4, :cond_30

    .line 2062
    .line 2063
    aget-byte v4, v0, v1

    .line 2064
    .line 2065
    add-int/lit8 v6, v1, 0x1

    .line 2066
    .line 2067
    if-nez v4, :cond_2e

    .line 2068
    .line 2069
    aget-byte v4, v0, v6

    .line 2070
    .line 2071
    if-nez v4, :cond_2e

    .line 2072
    .line 2073
    add-int/lit8 v4, v1, 0x2

    .line 2074
    .line 2075
    aget-byte v4, v0, v4

    .line 2076
    .line 2077
    const/4 v7, 0x1

    .line 2078
    if-ne v4, v7, :cond_2e

    .line 2079
    .line 2080
    add-int/lit8 v4, v1, 0x3

    .line 2081
    .line 2082
    aget-byte v4, v0, v4

    .line 2083
    .line 2084
    const/16 v7, 0xf

    .line 2085
    .line 2086
    if-ne v4, v7, :cond_2f

    .line 2087
    .line 2088
    invoke-static {v0, v1, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 2089
    .line 2090
    .line 2091
    move-result-object v0

    .line 2092
    new-instance v1, Landroid/util/Pair;

    .line 2093
    .line 2094
    const-string v2, "video/wvc1"

    .line 2095
    .line 2096
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 2097
    .line 2098
    .line 2099
    move-result-object v0

    .line 2100
    invoke-direct {v1, v2, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2101
    .line 2102
    .line 2103
    move-object v0, v1

    .line 2104
    goto :goto_1a

    .line 2105
    :cond_2e
    const/16 v7, 0xf

    .line 2106
    .line 2107
    :cond_2f
    move v1, v6

    .line 2108
    goto :goto_1b

    .line 2109
    :cond_30
    const-string v0, "Failed to find FourCC VC1 initialization data"
    :try_end_7
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_7 .. :try_end_7} :catch_3

    .line 2110
    .line 2111
    const/4 v1, 0x0

    .line 2112
    :try_start_8
    invoke-static {v1, v0}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 2113
    .line 2114
    .line 2115
    move-result-object v0
    :try_end_8
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_8 .. :try_end_8} :catch_4

    .line 2116
    :try_start_9
    throw v0
    :try_end_9
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_9 .. :try_end_9} :catch_3

    .line 2117
    :catch_4
    move-object v2, v1

    .line 2118
    goto :goto_1e

    .line 2119
    :cond_31
    const-string v0, "Unknown FourCC. Setting mimeType to video/x-unknown"

    .line 2120
    .line 2121
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    .line 2122
    .line 2123
    .line 2124
    new-instance v0, Landroid/util/Pair;

    .line 2125
    .line 2126
    const-string v1, "video/x-unknown"

    .line 2127
    .line 2128
    const/4 v2, 0x0

    .line 2129
    invoke-direct {v0, v1, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2130
    .line 2131
    .line 2132
    :goto_1c
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 2133
    .line 2134
    check-cast v1, Ljava/lang/String;

    .line 2135
    .line 2136
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 2137
    .line 2138
    move-object/from16 v20, v0

    .line 2139
    .line 2140
    check-cast v20, Ljava/util/List;

    .line 2141
    .line 2142
    move-object v6, v2

    .line 2143
    move-object/from16 v2, v20

    .line 2144
    .line 2145
    :goto_1d
    const/4 v0, -0x1

    .line 2146
    const/4 v4, -0x1

    .line 2147
    goto/16 :goto_23

    .line 2148
    .line 2149
    :catch_5
    :goto_1e
    const-string v0, "Error parsing FourCC private data"

    .line 2150
    .line 2151
    invoke-static {v2, v0}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 2152
    .line 2153
    .line 2154
    move-result-object v0

    .line 2155
    throw v0

    .line 2156
    :pswitch_17
    move-object/from16 v5, v42

    .line 2157
    .line 2158
    const/4 v2, 0x0

    .line 2159
    new-instance v0, Lkz2;

    .line 2160
    .line 2161
    iget-object v1, v5, Lni1;->c:Ljava/lang/String;

    .line 2162
    .line 2163
    invoke-virtual {v5, v1}, Lni1;->a(Ljava/lang/String;)[B

    .line 2164
    .line 2165
    .line 2166
    move-result-object v1

    .line 2167
    invoke-direct {v0, v1}, Lkz2;-><init>([B)V

    .line 2168
    .line 2169
    .line 2170
    const/4 v4, 0x0

    .line 2171
    invoke-static {v0, v4, v2}, Lvf1;->a(Lkz2;ZLp21;)Lvf1;

    .line 2172
    .line 2173
    .line 2174
    move-result-object v0

    .line 2175
    iget-object v1, v0, Lvf1;->a:Ljava/util/List;

    .line 2176
    .line 2177
    iget v2, v0, Lvf1;->b:I

    .line 2178
    .line 2179
    iput v2, v5, Lni1;->c0:I

    .line 2180
    .line 2181
    iget-object v0, v0, Lvf1;->n:Ljava/lang/String;

    .line 2182
    .line 2183
    const-string v2, "video/hevc"

    .line 2184
    .line 2185
    :goto_1f
    move-object v4, v2

    .line 2186
    move-object v2, v1

    .line 2187
    move-object v1, v4

    .line 2188
    move-object v6, v0

    .line 2189
    goto :goto_1d

    .line 2190
    :pswitch_18
    move-object/from16 v5, v42

    .line 2191
    .line 2192
    new-instance v0, Lkz2;

    .line 2193
    .line 2194
    iget-object v1, v5, Lni1;->c:Ljava/lang/String;

    .line 2195
    .line 2196
    invoke-virtual {v5, v1}, Lni1;->a(Ljava/lang/String;)[B

    .line 2197
    .line 2198
    .line 2199
    move-result-object v1

    .line 2200
    invoke-direct {v0, v1}, Lkz2;-><init>([B)V

    .line 2201
    .line 2202
    .line 2203
    invoke-static {v0}, Lve1;->a(Lkz2;)Lve1;

    .line 2204
    .line 2205
    .line 2206
    move-result-object v0

    .line 2207
    iget-object v1, v0, Lve1;->a:Ljava/util/ArrayList;

    .line 2208
    .line 2209
    iget v2, v0, Lve1;->b:I

    .line 2210
    .line 2211
    iput v2, v5, Lni1;->c0:I

    .line 2212
    .line 2213
    iget-object v0, v0, Lve1;->l:Ljava/lang/String;

    .line 2214
    .line 2215
    const-string v2, "video/avc"

    .line 2216
    .line 2217
    goto :goto_1f

    .line 2218
    :pswitch_19
    move-object/from16 v5, v42

    .line 2219
    .line 2220
    iget-object v0, v5, Lni1;->l:[B

    .line 2221
    .line 2222
    if-nez v0, :cond_32

    .line 2223
    .line 2224
    const/4 v0, 0x0

    .line 2225
    goto :goto_20

    .line 2226
    :cond_32
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 2227
    .line 2228
    .line 2229
    move-result-object v0

    .line 2230
    :goto_20
    const-string v1, "video/mp4v-es"

    .line 2231
    .line 2232
    goto/16 :goto_d

    .line 2233
    .line 2234
    :pswitch_1a
    move-object/from16 v5, v42

    .line 2235
    .line 2236
    const-string v1, "video/mpeg2"

    .line 2237
    .line 2238
    goto/16 :goto_10

    .line 2239
    .line 2240
    :pswitch_1b
    move-object/from16 v5, v42

    .line 2241
    .line 2242
    iget-object v0, v5, Lni1;->l:[B

    .line 2243
    .line 2244
    if-nez v0, :cond_33

    .line 2245
    .line 2246
    const/4 v0, 0x0

    .line 2247
    goto :goto_21

    .line 2248
    :cond_33
    invoke-static {v0}, Lxm3;->i(Ljava/lang/Object;)Lsn3;

    .line 2249
    .line 2250
    .line 2251
    move-result-object v0

    .line 2252
    :goto_21
    const-string v1, "video/av01"

    .line 2253
    .line 2254
    goto/16 :goto_d

    .line 2255
    .line 2256
    :pswitch_1c
    move-object/from16 v5, v42

    .line 2257
    .line 2258
    iget-object v0, v5, Lni1;->l:[B

    .line 2259
    .line 2260
    if-nez v0, :cond_34

    .line 2261
    .line 2262
    const/4 v0, 0x0

    .line 2263
    goto :goto_22

    .line 2264
    :cond_34
    invoke-static {v0}, Lxm3;->i(Ljava/lang/Object;)Lsn3;

    .line 2265
    .line 2266
    .line 2267
    move-result-object v0

    .line 2268
    :goto_22
    const-string v1, "video/x-vnd.on2.vp9"

    .line 2269
    .line 2270
    goto/16 :goto_d

    .line 2271
    .line 2272
    :pswitch_1d
    move-object/from16 v5, v42

    .line 2273
    .line 2274
    const-string v1, "video/x-vnd.on2.vp8"

    .line 2275
    .line 2276
    goto/16 :goto_10

    .line 2277
    .line 2278
    :goto_23
    iget-object v7, v5, Lni1;->P:[B

    .line 2279
    .line 2280
    if-eqz v7, :cond_35

    .line 2281
    .line 2282
    new-instance v7, Lkz2;

    .line 2283
    .line 2284
    iget-object v8, v5, Lni1;->P:[B

    .line 2285
    .line 2286
    invoke-direct {v7, v8}, Lkz2;-><init>([B)V

    .line 2287
    .line 2288
    .line 2289
    invoke-static {v7}, Lcs3;->a(Lkz2;)Lcs3;

    .line 2290
    .line 2291
    .line 2292
    move-result-object v7

    .line 2293
    if-eqz v7, :cond_35

    .line 2294
    .line 2295
    iget-object v6, v7, Lcs3;->g:Ljava/lang/String;

    .line 2296
    .line 2297
    const-string v1, "video/dolby-vision"

    .line 2298
    .line 2299
    :cond_35
    iget-boolean v7, v5, Lni1;->Y:Z

    .line 2300
    .line 2301
    iget-boolean v8, v5, Lni1;->X:Z

    .line 2302
    .line 2303
    const/4 v9, 0x1

    .line 2304
    if-eq v9, v8, :cond_36

    .line 2305
    .line 2306
    const/4 v8, 0x0

    .line 2307
    goto :goto_24

    .line 2308
    :cond_36
    const/4 v8, 0x2

    .line 2309
    :goto_24
    or-int/2addr v7, v8

    .line 2310
    new-instance v8, Lgg4;

    .line 2311
    .line 2312
    invoke-direct {v8}, Lgg4;-><init>()V

    .line 2313
    .line 2314
    .line 2315
    invoke-static {v1}, Lpp1;->a(Ljava/lang/String;)Z

    .line 2316
    .line 2317
    .line 2318
    move-result v9

    .line 2319
    if-eqz v9, :cond_37

    .line 2320
    .line 2321
    iget v3, v5, Lni1;->Q:I

    .line 2322
    .line 2323
    iput v3, v8, Lgg4;->D:I

    .line 2324
    .line 2325
    iget v3, v5, Lni1;->S:I

    .line 2326
    .line 2327
    iput v3, v8, Lgg4;->E:I

    .line 2328
    .line 2329
    iput v4, v8, Lgg4;->F:I

    .line 2330
    .line 2331
    const/4 v3, 0x1

    .line 2332
    goto/16 :goto_2b

    .line 2333
    .line 2334
    :cond_37
    invoke-static {v1}, Lpp1;->b(Ljava/lang/String;)Z

    .line 2335
    .line 2336
    .line 2337
    move-result v4

    .line 2338
    if-eqz v4, :cond_45

    .line 2339
    .line 2340
    iget v3, v5, Lni1;->s:I

    .line 2341
    .line 2342
    if-nez v3, :cond_3a

    .line 2343
    .line 2344
    iget v3, v5, Lni1;->q:I

    .line 2345
    .line 2346
    const/4 v4, -0x1

    .line 2347
    if-ne v3, v4, :cond_38

    .line 2348
    .line 2349
    iget v3, v5, Lni1;->n:I

    .line 2350
    .line 2351
    :cond_38
    iput v3, v5, Lni1;->q:I

    .line 2352
    .line 2353
    iget v3, v5, Lni1;->r:I

    .line 2354
    .line 2355
    if-ne v3, v4, :cond_39

    .line 2356
    .line 2357
    iget v3, v5, Lni1;->o:I

    .line 2358
    .line 2359
    :cond_39
    iput v3, v5, Lni1;->r:I

    .line 2360
    .line 2361
    goto :goto_25

    .line 2362
    :cond_3a
    const/4 v4, -0x1

    .line 2363
    :goto_25
    iget v3, v5, Lni1;->q:I

    .line 2364
    .line 2365
    const/high16 v9, -0x40800000    # -1.0f

    .line 2366
    .line 2367
    if-eq v3, v4, :cond_3b

    .line 2368
    .line 2369
    iget v10, v5, Lni1;->r:I

    .line 2370
    .line 2371
    if-eq v10, v4, :cond_3b

    .line 2372
    .line 2373
    iget v11, v5, Lni1;->o:I

    .line 2374
    .line 2375
    mul-int/2addr v11, v3

    .line 2376
    iget v3, v5, Lni1;->n:I

    .line 2377
    .line 2378
    mul-int/2addr v3, v10

    .line 2379
    int-to-float v10, v11

    .line 2380
    int-to-float v3, v3

    .line 2381
    div-float/2addr v10, v3

    .line 2382
    goto :goto_26

    .line 2383
    :cond_3b
    move v10, v9

    .line 2384
    :goto_26
    iget-boolean v3, v5, Lni1;->z:Z

    .line 2385
    .line 2386
    if-eqz v3, :cond_3e

    .line 2387
    .line 2388
    iget v3, v5, Lni1;->F:F

    .line 2389
    .line 2390
    cmpl-float v3, v3, v9

    .line 2391
    .line 2392
    if-eqz v3, :cond_3c

    .line 2393
    .line 2394
    iget v3, v5, Lni1;->G:F

    .line 2395
    .line 2396
    cmpl-float v3, v3, v9

    .line 2397
    .line 2398
    if-eqz v3, :cond_3c

    .line 2399
    .line 2400
    iget v3, v5, Lni1;->H:F

    .line 2401
    .line 2402
    cmpl-float v3, v3, v9

    .line 2403
    .line 2404
    if-eqz v3, :cond_3c

    .line 2405
    .line 2406
    iget v3, v5, Lni1;->I:F

    .line 2407
    .line 2408
    cmpl-float v3, v3, v9

    .line 2409
    .line 2410
    if-eqz v3, :cond_3c

    .line 2411
    .line 2412
    iget v3, v5, Lni1;->J:F

    .line 2413
    .line 2414
    cmpl-float v3, v3, v9

    .line 2415
    .line 2416
    if-eqz v3, :cond_3c

    .line 2417
    .line 2418
    iget v3, v5, Lni1;->K:F

    .line 2419
    .line 2420
    cmpl-float v3, v3, v9

    .line 2421
    .line 2422
    if-eqz v3, :cond_3c

    .line 2423
    .line 2424
    iget v3, v5, Lni1;->L:F

    .line 2425
    .line 2426
    cmpl-float v3, v3, v9

    .line 2427
    .line 2428
    if-eqz v3, :cond_3c

    .line 2429
    .line 2430
    iget v3, v5, Lni1;->M:F

    .line 2431
    .line 2432
    cmpl-float v3, v3, v9

    .line 2433
    .line 2434
    if-eqz v3, :cond_3c

    .line 2435
    .line 2436
    iget v3, v5, Lni1;->N:F

    .line 2437
    .line 2438
    cmpl-float v3, v3, v9

    .line 2439
    .line 2440
    if-eqz v3, :cond_3c

    .line 2441
    .line 2442
    iget v3, v5, Lni1;->O:F

    .line 2443
    .line 2444
    cmpl-float v3, v3, v9

    .line 2445
    .line 2446
    if-nez v3, :cond_3d

    .line 2447
    .line 2448
    :cond_3c
    const/16 v29, 0x0

    .line 2449
    .line 2450
    goto/16 :goto_27

    .line 2451
    .line 2452
    :cond_3d
    const/16 v3, 0x19

    .line 2453
    .line 2454
    new-array v3, v3, [B

    .line 2455
    .line 2456
    invoke-static {v3}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 2457
    .line 2458
    .line 2459
    move-result-object v9

    .line 2460
    sget-object v11, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 2461
    .line 2462
    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 2463
    .line 2464
    .line 2465
    move-result-object v9

    .line 2466
    const/4 v11, 0x0

    .line 2467
    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 2468
    .line 2469
    .line 2470
    iget v11, v5, Lni1;->F:F

    .line 2471
    .line 2472
    const v12, 0x47435000    # 50000.0f

    .line 2473
    .line 2474
    .line 2475
    mul-float/2addr v11, v12

    .line 2476
    const/high16 v13, 0x3f000000    # 0.5f

    .line 2477
    .line 2478
    add-float/2addr v11, v13

    .line 2479
    float-to-int v11, v11

    .line 2480
    int-to-short v11, v11

    .line 2481
    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2482
    .line 2483
    .line 2484
    iget v11, v5, Lni1;->G:F

    .line 2485
    .line 2486
    mul-float/2addr v11, v12

    .line 2487
    add-float/2addr v11, v13

    .line 2488
    float-to-int v11, v11

    .line 2489
    int-to-short v11, v11

    .line 2490
    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2491
    .line 2492
    .line 2493
    iget v11, v5, Lni1;->H:F

    .line 2494
    .line 2495
    mul-float/2addr v11, v12

    .line 2496
    add-float/2addr v11, v13

    .line 2497
    float-to-int v11, v11

    .line 2498
    int-to-short v11, v11

    .line 2499
    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2500
    .line 2501
    .line 2502
    iget v11, v5, Lni1;->I:F

    .line 2503
    .line 2504
    mul-float/2addr v11, v12

    .line 2505
    add-float/2addr v11, v13

    .line 2506
    float-to-int v11, v11

    .line 2507
    int-to-short v11, v11

    .line 2508
    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2509
    .line 2510
    .line 2511
    iget v11, v5, Lni1;->J:F

    .line 2512
    .line 2513
    mul-float/2addr v11, v12

    .line 2514
    add-float/2addr v11, v13

    .line 2515
    float-to-int v11, v11

    .line 2516
    int-to-short v11, v11

    .line 2517
    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2518
    .line 2519
    .line 2520
    iget v11, v5, Lni1;->K:F

    .line 2521
    .line 2522
    mul-float/2addr v11, v12

    .line 2523
    add-float/2addr v11, v13

    .line 2524
    float-to-int v11, v11

    .line 2525
    int-to-short v11, v11

    .line 2526
    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2527
    .line 2528
    .line 2529
    iget v11, v5, Lni1;->L:F

    .line 2530
    .line 2531
    mul-float/2addr v11, v12

    .line 2532
    add-float/2addr v11, v13

    .line 2533
    float-to-int v11, v11

    .line 2534
    int-to-short v11, v11

    .line 2535
    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2536
    .line 2537
    .line 2538
    iget v11, v5, Lni1;->M:F

    .line 2539
    .line 2540
    mul-float/2addr v11, v12

    .line 2541
    add-float/2addr v11, v13

    .line 2542
    float-to-int v11, v11

    .line 2543
    int-to-short v11, v11

    .line 2544
    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2545
    .line 2546
    .line 2547
    iget v11, v5, Lni1;->N:F

    .line 2548
    .line 2549
    add-float/2addr v11, v13

    .line 2550
    float-to-int v11, v11

    .line 2551
    int-to-short v11, v11

    .line 2552
    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2553
    .line 2554
    .line 2555
    iget v11, v5, Lni1;->O:F

    .line 2556
    .line 2557
    add-float/2addr v11, v13

    .line 2558
    float-to-int v11, v11

    .line 2559
    int-to-short v11, v11

    .line 2560
    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2561
    .line 2562
    .line 2563
    iget v11, v5, Lni1;->D:I

    .line 2564
    .line 2565
    int-to-short v11, v11

    .line 2566
    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2567
    .line 2568
    .line 2569
    iget v11, v5, Lni1;->E:I

    .line 2570
    .line 2571
    int-to-short v11, v11

    .line 2572
    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2573
    .line 2574
    .line 2575
    move-object/from16 v29, v3

    .line 2576
    .line 2577
    :goto_27
    iget v3, v5, Lni1;->A:I

    .line 2578
    .line 2579
    iget v9, v5, Lni1;->C:I

    .line 2580
    .line 2581
    iget v11, v5, Lni1;->B:I

    .line 2582
    .line 2583
    iget v12, v5, Lni1;->p:I

    .line 2584
    .line 2585
    new-instance v25, Ln74;

    .line 2586
    .line 2587
    move/from16 v31, v12

    .line 2588
    .line 2589
    move/from16 v26, v3

    .line 2590
    .line 2591
    move/from16 v27, v9

    .line 2592
    .line 2593
    move/from16 v28, v11

    .line 2594
    .line 2595
    move/from16 v30, v12

    .line 2596
    .line 2597
    invoke-direct/range {v25 .. v31}, Ln74;-><init>(III[BII)V

    .line 2598
    .line 2599
    .line 2600
    move-object/from16 v3, v25

    .line 2601
    .line 2602
    goto :goto_28

    .line 2603
    :cond_3e
    const/4 v3, 0x0

    .line 2604
    :goto_28
    iget-object v9, v5, Lni1;->b:Ljava/lang/String;

    .line 2605
    .line 2606
    if-eqz v9, :cond_3f

    .line 2607
    .line 2608
    sget-object v11, Loi1;->o0:Ljava/util/Map;

    .line 2609
    .line 2610
    invoke-interface {v11, v9}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 2611
    .line 2612
    .line 2613
    move-result v9

    .line 2614
    if-eqz v9, :cond_3f

    .line 2615
    .line 2616
    iget-object v4, v5, Lni1;->b:Ljava/lang/String;

    .line 2617
    .line 2618
    invoke-interface {v11, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2619
    .line 2620
    .line 2621
    move-result-object v4

    .line 2622
    check-cast v4, Ljava/lang/Integer;

    .line 2623
    .line 2624
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 2625
    .line 2626
    .line 2627
    move-result v13

    .line 2628
    goto :goto_29

    .line 2629
    :cond_3f
    move v13, v4

    .line 2630
    :goto_29
    iget v4, v5, Lni1;->t:I

    .line 2631
    .line 2632
    if-nez v4, :cond_44

    .line 2633
    .line 2634
    iget v4, v5, Lni1;->u:F

    .line 2635
    .line 2636
    const/4 v9, 0x0

    .line 2637
    invoke-static {v4, v9}, Ljava/lang/Float;->compare(FF)I

    .line 2638
    .line 2639
    .line 2640
    move-result v4

    .line 2641
    if-nez v4, :cond_44

    .line 2642
    .line 2643
    iget v4, v5, Lni1;->v:F

    .line 2644
    .line 2645
    invoke-static {v4, v9}, Ljava/lang/Float;->compare(FF)I

    .line 2646
    .line 2647
    .line 2648
    move-result v4

    .line 2649
    if-nez v4, :cond_44

    .line 2650
    .line 2651
    iget v4, v5, Lni1;->w:F

    .line 2652
    .line 2653
    invoke-static {v4, v9}, Ljava/lang/Float;->compare(FF)I

    .line 2654
    .line 2655
    .line 2656
    move-result v4

    .line 2657
    if-nez v4, :cond_40

    .line 2658
    .line 2659
    const/4 v4, 0x0

    .line 2660
    goto :goto_2a

    .line 2661
    :cond_40
    iget v4, v5, Lni1;->w:F

    .line 2662
    .line 2663
    const/high16 v9, 0x42b40000    # 90.0f

    .line 2664
    .line 2665
    invoke-static {v4, v9}, Ljava/lang/Float;->compare(FF)I

    .line 2666
    .line 2667
    .line 2668
    move-result v4

    .line 2669
    if-nez v4, :cond_41

    .line 2670
    .line 2671
    const/16 v4, 0x5a

    .line 2672
    .line 2673
    goto :goto_2a

    .line 2674
    :cond_41
    iget v4, v5, Lni1;->w:F

    .line 2675
    .line 2676
    const/high16 v9, -0x3ccc0000    # -180.0f

    .line 2677
    .line 2678
    invoke-static {v4, v9}, Ljava/lang/Float;->compare(FF)I

    .line 2679
    .line 2680
    .line 2681
    move-result v4

    .line 2682
    if-eqz v4, :cond_42

    .line 2683
    .line 2684
    iget v4, v5, Lni1;->w:F

    .line 2685
    .line 2686
    const/high16 v9, 0x43340000    # 180.0f

    .line 2687
    .line 2688
    invoke-static {v4, v9}, Ljava/lang/Float;->compare(FF)I

    .line 2689
    .line 2690
    .line 2691
    move-result v4

    .line 2692
    if-nez v4, :cond_43

    .line 2693
    .line 2694
    :cond_42
    const/16 v4, 0xb4

    .line 2695
    .line 2696
    goto :goto_2a

    .line 2697
    :cond_43
    iget v4, v5, Lni1;->w:F

    .line 2698
    .line 2699
    const/high16 v9, -0x3d4c0000    # -90.0f

    .line 2700
    .line 2701
    invoke-static {v4, v9}, Ljava/lang/Float;->compare(FF)I

    .line 2702
    .line 2703
    .line 2704
    move-result v4

    .line 2705
    if-nez v4, :cond_44

    .line 2706
    .line 2707
    const/16 v4, 0x10e

    .line 2708
    .line 2709
    goto :goto_2a

    .line 2710
    :cond_44
    move v4, v13

    .line 2711
    :goto_2a
    iget v9, v5, Lni1;->n:I

    .line 2712
    .line 2713
    iput v9, v8, Lgg4;->s:I

    .line 2714
    .line 2715
    iget v9, v5, Lni1;->o:I

    .line 2716
    .line 2717
    iput v9, v8, Lgg4;->t:I

    .line 2718
    .line 2719
    iput v10, v8, Lgg4;->y:F

    .line 2720
    .line 2721
    iput v4, v8, Lgg4;->x:I

    .line 2722
    .line 2723
    iget-object v4, v5, Lni1;->x:[B

    .line 2724
    .line 2725
    iput-object v4, v8, Lgg4;->z:[B

    .line 2726
    .line 2727
    iget v4, v5, Lni1;->y:I

    .line 2728
    .line 2729
    iput v4, v8, Lgg4;->A:I

    .line 2730
    .line 2731
    iput-object v3, v8, Lgg4;->B:Ln74;

    .line 2732
    .line 2733
    const/4 v3, 0x2

    .line 2734
    goto :goto_2b

    .line 2735
    :cond_45
    const-string v4, "application/x-subrip"

    .line 2736
    .line 2737
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2738
    .line 2739
    .line 2740
    move-result v4

    .line 2741
    if-nez v4, :cond_47

    .line 2742
    .line 2743
    const-string v4, "text/x-ssa"

    .line 2744
    .line 2745
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2746
    .line 2747
    .line 2748
    move-result v4

    .line 2749
    if-nez v4, :cond_47

    .line 2750
    .line 2751
    const-string v4, "text/vtt"

    .line 2752
    .line 2753
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2754
    .line 2755
    .line 2756
    move-result v4

    .line 2757
    if-nez v4, :cond_47

    .line 2758
    .line 2759
    const-string v4, "application/vobsub"

    .line 2760
    .line 2761
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2762
    .line 2763
    .line 2764
    move-result v4

    .line 2765
    if-nez v4, :cond_47

    .line 2766
    .line 2767
    const-string v4, "application/pgs"

    .line 2768
    .line 2769
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2770
    .line 2771
    .line 2772
    move-result v4

    .line 2773
    if-nez v4, :cond_47

    .line 2774
    .line 2775
    const-string v4, "application/dvbsubs"

    .line 2776
    .line 2777
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2778
    .line 2779
    .line 2780
    move-result v4

    .line 2781
    if-eqz v4, :cond_46

    .line 2782
    .line 2783
    goto :goto_2b

    .line 2784
    :cond_46
    const-string v0, "Unexpected MIME type."

    .line 2785
    .line 2786
    const/4 v1, 0x0

    .line 2787
    invoke-static {v1, v0}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 2788
    .line 2789
    .line 2790
    move-result-object v0

    .line 2791
    throw v0

    .line 2792
    :cond_47
    :goto_2b
    iget-object v4, v5, Lni1;->b:Ljava/lang/String;

    .line 2793
    .line 2794
    if-eqz v4, :cond_48

    .line 2795
    .line 2796
    sget-object v9, Loi1;->o0:Ljava/util/Map;

    .line 2797
    .line 2798
    invoke-interface {v9, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 2799
    .line 2800
    .line 2801
    move-result v4

    .line 2802
    if-nez v4, :cond_48

    .line 2803
    .line 2804
    iget-object v4, v5, Lni1;->b:Ljava/lang/String;

    .line 2805
    .line 2806
    iput-object v4, v8, Lgg4;->b:Ljava/lang/String;

    .line 2807
    .line 2808
    :cond_48
    move/from16 v4, v24

    .line 2809
    .line 2810
    invoke-virtual {v8, v4}, Lgg4;->c(I)V

    .line 2811
    .line 2812
    .line 2813
    iget-boolean v4, v5, Lni1;->a:Z

    .line 2814
    .line 2815
    const/4 v9, 0x1

    .line 2816
    if-eq v9, v4, :cond_49

    .line 2817
    .line 2818
    const-string v11, "video/x-matroska"

    .line 2819
    .line 2820
    goto :goto_2c

    .line 2821
    :cond_49
    move-object/from16 v11, v21

    .line 2822
    .line 2823
    :goto_2c
    invoke-virtual {v8, v11}, Lgg4;->d(Ljava/lang/String;)V

    .line 2824
    .line 2825
    .line 2826
    invoke-virtual {v8, v1}, Lgg4;->e(Ljava/lang/String;)V

    .line 2827
    .line 2828
    .line 2829
    iput v0, v8, Lgg4;->m:I

    .line 2830
    .line 2831
    iget-object v0, v5, Lni1;->Z:Ljava/lang/String;

    .line 2832
    .line 2833
    iput-object v0, v8, Lgg4;->d:Ljava/lang/String;

    .line 2834
    .line 2835
    iput v7, v8, Lgg4;->e:I

    .line 2836
    .line 2837
    iput-object v2, v8, Lgg4;->o:Ljava/util/List;

    .line 2838
    .line 2839
    iput-object v6, v8, Lgg4;->i:Ljava/lang/String;

    .line 2840
    .line 2841
    iget-object v0, v5, Lni1;->m:Lie4;

    .line 2842
    .line 2843
    iput-object v0, v8, Lgg4;->p:Lie4;

    .line 2844
    .line 2845
    new-instance v0, Lph4;

    .line 2846
    .line 2847
    invoke-direct {v0, v8}, Lph4;-><init>(Lgg4;)V

    .line 2848
    .line 2849
    .line 2850
    iput-object v0, v5, Lni1;->b0:Lph4;

    .line 2851
    .line 2852
    iget v0, v5, Lni1;->d:I

    .line 2853
    .line 2854
    move-object/from16 v1, v23

    .line 2855
    .line 2856
    invoke-interface {v1, v0, v3}, Lnf1;->z(II)Ljg1;

    .line 2857
    .line 2858
    .line 2859
    move-result-object v0

    .line 2860
    iput-object v0, v5, Lni1;->a0:Ljg1;

    .line 2861
    .line 2862
    iget-boolean v1, v5, Lni1;->W:Z

    .line 2863
    .line 2864
    if-nez v1, :cond_4a

    .line 2865
    .line 2866
    iget-object v1, v5, Lni1;->b0:Lph4;

    .line 2867
    .line 2868
    invoke-interface {v0, v1}, Ljg1;->d(Lph4;)V

    .line 2869
    .line 2870
    .line 2871
    :cond_4a
    iget v0, v5, Lni1;->d:I

    .line 2872
    .line 2873
    move-object/from16 v1, v22

    .line 2874
    .line 2875
    invoke-virtual {v1, v0, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 2876
    .line 2877
    .line 2878
    :cond_4b
    :goto_2d
    const/4 v1, 0x0

    .line 2879
    move-object/from16 v0, p0

    .line 2880
    .line 2881
    iput-object v1, v0, Loi1;->x:Lni1;

    .line 2882
    .line 2883
    return-void

    .line 2884
    :cond_4c
    move-object v1, v12

    .line 2885
    const-string v2, "CodecId is missing in TrackEntry element"

    .line 2886
    .line 2887
    invoke-static {v1, v2}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 2888
    .line 2889
    .line 2890
    move-result-object v1

    .line 2891
    throw v1

    .line 2892
    :cond_4d
    move-object v1, v8

    .line 2893
    iget v2, v0, Loi1;->M:I

    .line 2894
    .line 2895
    const/4 v3, 0x2

    .line 2896
    if-ne v2, v3, :cond_53

    .line 2897
    .line 2898
    iget v2, v0, Loi1;->S:I

    .line 2899
    .line 2900
    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 2901
    .line 2902
    .line 2903
    move-result-object v1

    .line 2904
    check-cast v1, Lni1;

    .line 2905
    .line 2906
    iget-object v2, v1, Lni1;->a0:Ljg1;

    .line 2907
    .line 2908
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2909
    .line 2910
    .line 2911
    iget-wide v2, v0, Loi1;->X:J

    .line 2912
    .line 2913
    cmp-long v2, v2, v4

    .line 2914
    .line 2915
    if-lez v2, :cond_4e

    .line 2916
    .line 2917
    iget-object v2, v1, Lni1;->c:Ljava/lang/String;

    .line 2918
    .line 2919
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2920
    .line 2921
    .line 2922
    move-result v2

    .line 2923
    if-eqz v2, :cond_4e

    .line 2924
    .line 2925
    const/16 v2, 0x8

    .line 2926
    .line 2927
    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 2928
    .line 2929
    .line 2930
    move-result-object v2

    .line 2931
    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 2932
    .line 2933
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 2934
    .line 2935
    .line 2936
    move-result-object v2

    .line 2937
    iget-wide v3, v0, Loi1;->X:J

    .line 2938
    .line 2939
    invoke-virtual {v2, v3, v4}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 2940
    .line 2941
    .line 2942
    move-result-object v2

    .line 2943
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    .line 2944
    .line 2945
    .line 2946
    move-result-object v2

    .line 2947
    array-length v3, v2

    .line 2948
    iget-object v4, v0, Loi1;->o:Lkz2;

    .line 2949
    .line 2950
    invoke-virtual {v4, v3, v2}, Lkz2;->z(I[B)V

    .line 2951
    .line 2952
    .line 2953
    :cond_4e
    const/4 v2, 0x0

    .line 2954
    const/4 v4, 0x0

    .line 2955
    :goto_2e
    iget v3, v0, Loi1;->Q:I

    .line 2956
    .line 2957
    if-ge v4, v3, :cond_4f

    .line 2958
    .line 2959
    iget-object v3, v0, Loi1;->R:[I

    .line 2960
    .line 2961
    aget v3, v3, v4

    .line 2962
    .line 2963
    add-int/2addr v2, v3

    .line 2964
    add-int/lit8 v4, v4, 0x1

    .line 2965
    .line 2966
    goto :goto_2e

    .line 2967
    :cond_4f
    const/4 v4, 0x0

    .line 2968
    :goto_2f
    iget v3, v0, Loi1;->Q:I

    .line 2969
    .line 2970
    if-ge v4, v3, :cond_52

    .line 2971
    .line 2972
    iget-wide v5, v0, Loi1;->N:J

    .line 2973
    .line 2974
    iget v3, v1, Lni1;->f:I

    .line 2975
    .line 2976
    mul-int/2addr v3, v4

    .line 2977
    div-int/lit16 v3, v3, 0x3e8

    .line 2978
    .line 2979
    int-to-long v7, v3

    .line 2980
    add-long/2addr v5, v7

    .line 2981
    iget v3, v0, Loi1;->U:I

    .line 2982
    .line 2983
    if-nez v4, :cond_51

    .line 2984
    .line 2985
    iget-boolean v4, v0, Loi1;->W:Z

    .line 2986
    .line 2987
    if-nez v4, :cond_50

    .line 2988
    .line 2989
    or-int/lit8 v3, v3, 0x1

    .line 2990
    .line 2991
    :cond_50
    move v4, v3

    .line 2992
    const/4 v7, 0x0

    .line 2993
    goto :goto_30

    .line 2994
    :cond_51
    move v7, v4

    .line 2995
    move v4, v3

    .line 2996
    :goto_30
    iget-object v3, v0, Loi1;->R:[I

    .line 2997
    .line 2998
    aget v3, v3, v7

    .line 2999
    .line 3000
    sub-int/2addr v2, v3

    .line 3001
    move-wide/from16 v45, v5

    .line 3002
    .line 3003
    move v6, v2

    .line 3004
    move v5, v3

    .line 3005
    move-wide/from16 v2, v45

    .line 3006
    .line 3007
    invoke-virtual/range {v0 .. v6}, Loi1;->j(Lni1;JIII)V

    .line 3008
    .line 3009
    .line 3010
    const/16 v18, 0x1

    .line 3011
    .line 3012
    add-int/lit8 v4, v7, 0x1

    .line 3013
    .line 3014
    move v2, v6

    .line 3015
    goto :goto_2f

    .line 3016
    :cond_52
    const/4 v4, 0x0

    .line 3017
    iput v4, v0, Loi1;->M:I

    .line 3018
    .line 3019
    :cond_53
    :goto_31
    return-void

    .line 3020
    nop

    .line 3021
    :sswitch_data_0
    .sparse-switch
        -0x7ce7f5de -> :sswitch_21
        -0x7ce7f3b0 -> :sswitch_20
        -0x76567dc0 -> :sswitch_1f
        -0x6a615338 -> :sswitch_1e
        -0x672350af -> :sswitch_1d
        -0x585f4fce -> :sswitch_1c
        -0x585f4fcd -> :sswitch_1b
        -0x51dc40b2 -> :sswitch_1a
        -0x37a9c464 -> :sswitch_19
        -0x2016c535 -> :sswitch_18
        -0x2016c4e5 -> :sswitch_17
        -0x19552dbd -> :sswitch_16
        -0x1538b2ba -> :sswitch_15
        0x3c02325 -> :sswitch_14
        0x3c02353 -> :sswitch_13
        0x3c030c5 -> :sswitch_12
        0x4e81333 -> :sswitch_11
        0x4e86155 -> :sswitch_10
        0x4e86156 -> :sswitch_f
        0x5e8da3e -> :sswitch_e
        0x1a8350d6 -> :sswitch_d
        0x2056f406 -> :sswitch_c
        0x25e26ee2 -> :sswitch_b
        0x2b45174d -> :sswitch_a
        0x2b453ce4 -> :sswitch_9
        0x2c0618eb -> :sswitch_8
        0x2c065c6b -> :sswitch_7
        0x32fdf009 -> :sswitch_6
        0x3e4ca2d8 -> :sswitch_5
        0x54c61e47 -> :sswitch_4
        0x6bd6c624 -> :sswitch_3
        0x7446132a -> :sswitch_2
        0x7446b0a6 -> :sswitch_1
        0x744ad97d -> :sswitch_0
    .end sparse-switch

    .line 3022
    .line 3023
    .line 3024
    .line 3025
    .line 3026
    .line 3027
    .line 3028
    .line 3029
    .line 3030
    .line 3031
    .line 3032
    .line 3033
    .line 3034
    .line 3035
    .line 3036
    .line 3037
    .line 3038
    .line 3039
    .line 3040
    .line 3041
    .line 3042
    .line 3043
    .line 3044
    .line 3045
    .line 3046
    .line 3047
    .line 3048
    .line 3049
    .line 3050
    .line 3051
    .line 3052
    .line 3053
    .line 3054
    .line 3055
    .line 3056
    .line 3057
    .line 3058
    .line 3059
    .line 3060
    .line 3061
    .line 3062
    .line 3063
    .line 3064
    .line 3065
    .line 3066
    .line 3067
    .line 3068
    .line 3069
    .line 3070
    .line 3071
    .line 3072
    .line 3073
    .line 3074
    .line 3075
    .line 3076
    .line 3077
    .line 3078
    .line 3079
    .line 3080
    .line 3081
    .line 3082
    .line 3083
    .line 3084
    .line 3085
    .line 3086
    .line 3087
    .line 3088
    .line 3089
    .line 3090
    .line 3091
    .line 3092
    .line 3093
    .line 3094
    .line 3095
    .line 3096
    .line 3097
    .line 3098
    .line 3099
    .line 3100
    .line 3101
    .line 3102
    .line 3103
    .line 3104
    .line 3105
    .line 3106
    .line 3107
    .line 3108
    .line 3109
    .line 3110
    .line 3111
    .line 3112
    .line 3113
    .line 3114
    .line 3115
    .line 3116
    .line 3117
    .line 3118
    .line 3119
    .line 3120
    .line 3121
    .line 3122
    .line 3123
    .line 3124
    .line 3125
    .line 3126
    .line 3127
    .line 3128
    .line 3129
    .line 3130
    .line 3131
    .line 3132
    .line 3133
    .line 3134
    .line 3135
    .line 3136
    .line 3137
    .line 3138
    .line 3139
    .line 3140
    .line 3141
    .line 3142
    .line 3143
    .line 3144
    .line 3145
    .line 3146
    .line 3147
    .line 3148
    .line 3149
    .line 3150
    .line 3151
    .line 3152
    .line 3153
    .line 3154
    .line 3155
    .line 3156
    .line 3157
    .line 3158
    .line 3159
    :sswitch_data_1
    .sparse-switch
        -0x7ce7f5de -> :sswitch_43
        -0x7ce7f3b0 -> :sswitch_42
        -0x76567dc0 -> :sswitch_41
        -0x6a615338 -> :sswitch_40
        -0x672350af -> :sswitch_3f
        -0x585f4fce -> :sswitch_3e
        -0x585f4fcd -> :sswitch_3d
        -0x51dc40b2 -> :sswitch_3c
        -0x37a9c464 -> :sswitch_3b
        -0x2016c535 -> :sswitch_3a
        -0x2016c4e5 -> :sswitch_39
        -0x19552dbd -> :sswitch_38
        -0x1538b2ba -> :sswitch_37
        0x3c02325 -> :sswitch_36
        0x3c02353 -> :sswitch_35
        0x3c030c5 -> :sswitch_34
        0x4e81333 -> :sswitch_33
        0x4e86155 -> :sswitch_32
        0x4e86156 -> :sswitch_31
        0x5e8da3e -> :sswitch_30
        0x1a8350d6 -> :sswitch_2f
        0x2056f406 -> :sswitch_2e
        0x25e26ee2 -> :sswitch_2d
        0x2b45174d -> :sswitch_2c
        0x2b453ce4 -> :sswitch_2b
        0x2c0618eb -> :sswitch_2a
        0x2c065c6b -> :sswitch_29
        0x32fdf009 -> :sswitch_28
        0x3e4ca2d8 -> :sswitch_27
        0x54c61e47 -> :sswitch_26
        0x6bd6c624 -> :sswitch_25
        0x7446132a -> :sswitch_24
        0x7446b0a6 -> :sswitch_23
        0x744ad97d -> :sswitch_22
    .end sparse-switch

    .line 3160
    .line 3161
    .line 3162
    .line 3163
    .line 3164
    .line 3165
    .line 3166
    .line 3167
    .line 3168
    .line 3169
    .line 3170
    .line 3171
    .line 3172
    .line 3173
    .line 3174
    .line 3175
    .line 3176
    .line 3177
    .line 3178
    .line 3179
    .line 3180
    .line 3181
    .line 3182
    .line 3183
    .line 3184
    .line 3185
    .line 3186
    .line 3187
    .line 3188
    .line 3189
    .line 3190
    .line 3191
    .line 3192
    .line 3193
    .line 3194
    .line 3195
    .line 3196
    .line 3197
    .line 3198
    .line 3199
    .line 3200
    .line 3201
    .line 3202
    .line 3203
    .line 3204
    .line 3205
    .line 3206
    .line 3207
    .line 3208
    .line 3209
    .line 3210
    .line 3211
    .line 3212
    .line 3213
    .line 3214
    .line 3215
    .line 3216
    .line 3217
    .line 3218
    .line 3219
    .line 3220
    .line 3221
    .line 3222
    .line 3223
    .line 3224
    .line 3225
    .line 3226
    .line 3227
    .line 3228
    .line 3229
    .line 3230
    .line 3231
    .line 3232
    .line 3233
    .line 3234
    .line 3235
    .line 3236
    .line 3237
    .line 3238
    .line 3239
    .line 3240
    .line 3241
    .line 3242
    .line 3243
    .line 3244
    .line 3245
    .line 3246
    .line 3247
    .line 3248
    .line 3249
    .line 3250
    .line 3251
    .line 3252
    .line 3253
    .line 3254
    .line 3255
    .line 3256
    .line 3257
    .line 3258
    .line 3259
    .line 3260
    .line 3261
    .line 3262
    .line 3263
    .line 3264
    .line 3265
    .line 3266
    .line 3267
    .line 3268
    .line 3269
    .line 3270
    .line 3271
    .line 3272
    .line 3273
    .line 3274
    .line 3275
    .line 3276
    .line 3277
    .line 3278
    .line 3279
    .line 3280
    .line 3281
    .line 3282
    .line 3283
    .line 3284
    .line 3285
    .line 3286
    .line 3287
    .line 3288
    .line 3289
    .line 3290
    .line 3291
    .line 3292
    .line 3293
    .line 3294
    .line 3295
    .line 3296
    .line 3297
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final h(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Loi1;->x:Lni1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    add-int/lit8 v0, v0, 0x20

    .line 17
    .line 18
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 19
    .line 20
    .line 21
    const-string v0, "Element "

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p1, " must be in a TrackEntry"

    .line 30
    .line 31
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-static {v0, p1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    throw p1
.end method

.method public final i(I)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Loi1;->C:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    add-int/lit8 v0, v0, 0x1a

    .line 17
    .line 18
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 19
    .line 20
    .line 21
    const-string v0, "Element "

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p1, " must be in a Cues"

    .line 30
    .line 31
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-static {v0, p1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    throw p1
.end method

.method public final j(Lni1;JIII)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, Lni1;->V:Lkg1;

    .line 6
    .line 7
    const/4 v9, 0x1

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    move-object v3, v2

    .line 11
    iget-object v2, v1, Lni1;->a0:Ljg1;

    .line 12
    .line 13
    iget-object v8, v1, Lni1;->k:Lig1;

    .line 14
    .line 15
    move/from16 v5, p4

    .line 16
    .line 17
    move/from16 v6, p5

    .line 18
    .line 19
    move/from16 v7, p6

    .line 20
    .line 21
    move-object v1, v3

    .line 22
    move-wide/from16 v3, p2

    .line 23
    .line 24
    invoke-virtual/range {v1 .. v8}, Lkg1;->b(Ljg1;JIIILig1;)V

    .line 25
    .line 26
    .line 27
    goto/16 :goto_7

    .line 28
    .line 29
    :cond_0
    iget-object v2, v1, Lni1;->c:Ljava/lang/String;

    .line 30
    .line 31
    const-string v3, "S_TEXT/UTF8"

    .line 32
    .line 33
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    const-string v4, "S_TEXT/WEBVTT"

    .line 38
    .line 39
    const-string v5, "S_TEXT/SSA"

    .line 40
    .line 41
    const-string v6, "S_TEXT/ASS"

    .line 42
    .line 43
    const/4 v7, 0x0

    .line 44
    if-nez v2, :cond_1

    .line 45
    .line 46
    iget-object v2, v1, Lni1;->c:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_1

    .line 53
    .line 54
    iget-object v2, v1, Lni1;->c:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-nez v2, :cond_1

    .line 61
    .line 62
    iget-object v2, v1, Lni1;->c:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_3

    .line 69
    .line 70
    :cond_1
    iget v2, v0, Loi1;->Q:I

    .line 71
    .line 72
    if-le v2, v9, :cond_2

    .line 73
    .line 74
    const-string v2, "Skipping subtitle sample in laced block."

    .line 75
    .line 76
    invoke-static {v2}, La30;->x(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    iget-wide v10, v0, Loi1;->O:J

    .line 81
    .line 82
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    cmp-long v2, v10, v12

    .line 88
    .line 89
    if-nez v2, :cond_4

    .line 90
    .line 91
    const-string v2, "Skipping subtitle sample with no duration."

    .line 92
    .line 93
    invoke-static {v2}, La30;->x(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    :cond_3
    :goto_0
    move/from16 v2, p5

    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_4
    iget-object v2, v1, Lni1;->c:Ljava/lang/String;

    .line 100
    .line 101
    iget-object v8, v0, Loi1;->l:Lkz2;

    .line 102
    .line 103
    iget-object v12, v8, Lkz2;->a:[B

    .line 104
    .line 105
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 106
    .line 107
    .line 108
    move-result v13

    .line 109
    const-wide/16 v14, 0x3e8

    .line 110
    .line 111
    sparse-switch v13, :sswitch_data_0

    .line 112
    .line 113
    .line 114
    goto/16 :goto_8

    .line 115
    .line 116
    :sswitch_0
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    if-eqz v2, :cond_9

    .line 121
    .line 122
    const-string v2, "%02d:%02d:%02d,%03d"

    .line 123
    .line 124
    invoke-static {v10, v11, v14, v15, v2}, Loi1;->o(JJLjava/lang/String;)[B

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    const/16 v3, 0x13

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :sswitch_1
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-eqz v2, :cond_9

    .line 136
    .line 137
    const-string v2, "%02d:%02d:%02d.%03d"

    .line 138
    .line 139
    invoke-static {v10, v11, v14, v15, v2}, Loi1;->o(JJLjava/lang/String;)[B

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    const/16 v3, 0x19

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :sswitch_2
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    if-eqz v2, :cond_9

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :sswitch_3
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    if-eqz v2, :cond_9

    .line 158
    .line 159
    :goto_1
    const-string v2, "%01d:%02d:%02d:%02d"

    .line 160
    .line 161
    const-wide/16 v3, 0x2710

    .line 162
    .line 163
    invoke-static {v10, v11, v3, v4, v2}, Loi1;->o(JJLjava/lang/String;)[B

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    const/16 v3, 0x15

    .line 168
    .line 169
    :goto_2
    array-length v4, v2

    .line 170
    invoke-static {v2, v7, v12, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 171
    .line 172
    .line 173
    iget v2, v8, Lkz2;->b:I

    .line 174
    .line 175
    :goto_3
    iget v3, v8, Lkz2;->c:I

    .line 176
    .line 177
    if-ge v2, v3, :cond_6

    .line 178
    .line 179
    iget-object v3, v8, Lkz2;->a:[B

    .line 180
    .line 181
    aget-byte v3, v3, v2

    .line 182
    .line 183
    if-nez v3, :cond_5

    .line 184
    .line 185
    invoke-virtual {v8, v2}, Lkz2;->C(I)V

    .line 186
    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_5
    add-int/lit8 v2, v2, 0x1

    .line 190
    .line 191
    goto :goto_3

    .line 192
    :cond_6
    :goto_4
    iget-object v2, v1, Lni1;->a0:Ljg1;

    .line 193
    .line 194
    iget v3, v8, Lkz2;->c:I

    .line 195
    .line 196
    invoke-interface {v2, v8, v3, v7}, Ljg1;->a(Lkz2;II)V

    .line 197
    .line 198
    .line 199
    iget v2, v8, Lkz2;->c:I

    .line 200
    .line 201
    add-int v2, p5, v2

    .line 202
    .line 203
    :goto_5
    const/high16 v3, 0x10000000

    .line 204
    .line 205
    and-int v3, p4, v3

    .line 206
    .line 207
    if-eqz v3, :cond_8

    .line 208
    .line 209
    iget v3, v0, Loi1;->Q:I

    .line 210
    .line 211
    iget-object v4, v0, Loi1;->o:Lkz2;

    .line 212
    .line 213
    if-le v3, v9, :cond_7

    .line 214
    .line 215
    invoke-virtual {v4, v7}, Lkz2;->y(I)V

    .line 216
    .line 217
    .line 218
    goto :goto_6

    .line 219
    :cond_7
    iget v3, v4, Lkz2;->c:I

    .line 220
    .line 221
    iget-object v5, v1, Lni1;->a0:Ljg1;

    .line 222
    .line 223
    const/4 v6, 0x2

    .line 224
    invoke-interface {v5, v4, v3, v6}, Ljg1;->a(Lkz2;II)V

    .line 225
    .line 226
    .line 227
    add-int/2addr v2, v3

    .line 228
    :cond_8
    :goto_6
    move v14, v2

    .line 229
    iget-object v10, v1, Lni1;->a0:Ljg1;

    .line 230
    .line 231
    iget-object v1, v1, Lni1;->k:Lig1;

    .line 232
    .line 233
    move-wide/from16 v11, p2

    .line 234
    .line 235
    move/from16 v13, p4

    .line 236
    .line 237
    move/from16 v15, p6

    .line 238
    .line 239
    move-object/from16 v16, v1

    .line 240
    .line 241
    invoke-interface/range {v10 .. v16}, Ljg1;->c(JIIILig1;)V

    .line 242
    .line 243
    .line 244
    :goto_7
    iput-boolean v9, v0, Loi1;->L:Z

    .line 245
    .line 246
    return-void

    .line 247
    :cond_9
    :goto_8
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 248
    .line 249
    invoke-direct {v1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 250
    .line 251
    .line 252
    throw v1

    .line 253
    :sswitch_data_0
    .sparse-switch
        0x2c0618eb -> :sswitch_3
        0x2c065c6b -> :sswitch_2
        0x3e4ca2d8 -> :sswitch_1
        0x54c61e47 -> :sswitch_0
    .end sparse-switch
.end method

.method public final k(Lmf1;I)V
    .locals 4

    .line 1
    iget-object v0, p0, Loi1;->h:Lkz2;

    .line 2
    .line 3
    iget v1, v0, Lkz2;->c:I

    .line 4
    .line 5
    if-lt v1, p2, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v1, v0, Lkz2;->a:[B

    .line 9
    .line 10
    array-length v2, v1

    .line 11
    if-ge v2, p2, :cond_1

    .line 12
    .line 13
    array-length v1, v1

    .line 14
    add-int/2addr v1, v1

    .line 15
    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {v0, v1}, Lkz2;->A(I)V

    .line 20
    .line 21
    .line 22
    :cond_1
    iget-object v1, v0, Lkz2;->a:[B

    .line 23
    .line 24
    iget v2, v0, Lkz2;->c:I

    .line 25
    .line 26
    sub-int v3, p2, v2

    .line 27
    .line 28
    invoke-interface {p1, v1, v2, v3}, Lmf1;->x([BII)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p2}, Lkz2;->C(I)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final l(Lmf1;Lni1;IZ)I
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    const-string v4, "S_TEXT/UTF8"

    .line 10
    .line 11
    iget-object v5, v2, Lni1;->c:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    sget-object v2, Loi1;->j0:[B

    .line 20
    .line 21
    invoke-virtual {v0, v1, v2, v3}, Loi1;->n(Lmf1;[BI)V

    .line 22
    .line 23
    .line 24
    iget v1, v0, Loi1;->Z:I

    .line 25
    .line 26
    invoke-virtual {v0}, Loi1;->m()V

    .line 27
    .line 28
    .line 29
    return v1

    .line 30
    :cond_0
    iget-object v4, v2, Lni1;->c:Ljava/lang/String;

    .line 31
    .line 32
    const-string v5, "S_TEXT/ASS"

    .line 33
    .line 34
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-nez v4, :cond_1f

    .line 39
    .line 40
    iget-object v4, v2, Lni1;->c:Ljava/lang/String;

    .line 41
    .line 42
    const-string v5, "S_TEXT/SSA"

    .line 43
    .line 44
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-eqz v4, :cond_1

    .line 49
    .line 50
    goto/16 :goto_e

    .line 51
    .line 52
    :cond_1
    iget-object v4, v2, Lni1;->c:Ljava/lang/String;

    .line 53
    .line 54
    const-string v5, "S_TEXT/WEBVTT"

    .line 55
    .line 56
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_2

    .line 61
    .line 62
    sget-object v2, Loi1;->m0:[B

    .line 63
    .line 64
    invoke-virtual {v0, v1, v2, v3}, Loi1;->n(Lmf1;[BI)V

    .line 65
    .line 66
    .line 67
    iget v1, v0, Loi1;->Z:I

    .line 68
    .line 69
    invoke-virtual {v0}, Loi1;->m()V

    .line 70
    .line 71
    .line 72
    return v1

    .line 73
    :cond_2
    iget-boolean v4, v2, Lni1;->W:Z

    .line 74
    .line 75
    const/4 v5, 0x2

    .line 76
    const/4 v6, 0x1

    .line 77
    const/4 v7, 0x0

    .line 78
    if-eqz v4, :cond_5

    .line 79
    .line 80
    iget-object v4, v2, Lni1;->b0:Lph4;

    .line 81
    .line 82
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    new-instance v4, Lkz2;

    .line 86
    .line 87
    invoke-direct {v4, v3}, Lkz2;-><init>(I)V

    .line 88
    .line 89
    .line 90
    iget-object v8, v4, Lkz2;->a:[B

    .line 91
    .line 92
    invoke-interface {v1, v8, v7, v3, v6}, Lmf1;->B([BIIZ)Z

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    if-nez v8, :cond_3

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_3
    invoke-interface {v1}, Lmf1;->i()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v4}, Lkz2;->J()I

    .line 103
    .line 104
    .line 105
    move-result v8

    .line 106
    invoke-static {v8}, Lqb1;->w(I)I

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    if-ne v8, v6, :cond_4

    .line 111
    .line 112
    invoke-virtual {v4}, Lkz2;->B()I

    .line 113
    .line 114
    .line 115
    move-result v8

    .line 116
    const/16 v9, 0xa

    .line 117
    .line 118
    if-lt v8, v9, :cond_4

    .line 119
    .line 120
    new-array v8, v9, [B

    .line 121
    .line 122
    invoke-virtual {v4, v8, v7, v9}, Lkz2;->H([BII)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v4, v7}, Lkz2;->E(I)V

    .line 126
    .line 127
    .line 128
    invoke-static {v8}, Lqb1;->D([B)I

    .line 129
    .line 130
    .line 131
    move-result v8

    .line 132
    invoke-virtual {v4}, Lkz2;->B()I

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    add-int/lit8 v10, v8, 0x4

    .line 137
    .line 138
    if-lt v9, v10, :cond_4

    .line 139
    .line 140
    invoke-virtual {v4, v8}, Lkz2;->G(I)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v4}, Lkz2;->b()I

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    invoke-static {v4}, Lqb1;->w(I)I

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    if-ne v4, v5, :cond_4

    .line 152
    .line 153
    iget-object v4, v2, Lni1;->b0:Lph4;

    .line 154
    .line 155
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    new-instance v8, Lgg4;

    .line 159
    .line 160
    invoke-direct {v8, v4}, Lgg4;-><init>(Lph4;)V

    .line 161
    .line 162
    .line 163
    const-string v4, "audio/vnd.dts.hd"

    .line 164
    .line 165
    invoke-virtual {v8, v4}, Lgg4;->e(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    new-instance v4, Lph4;

    .line 169
    .line 170
    invoke-direct {v4, v8}, Lph4;-><init>(Lgg4;)V

    .line 171
    .line 172
    .line 173
    iput-object v4, v2, Lni1;->b0:Lph4;

    .line 174
    .line 175
    :cond_4
    :goto_0
    iget-object v4, v2, Lni1;->a0:Ljg1;

    .line 176
    .line 177
    iget-object v8, v2, Lni1;->b0:Lph4;

    .line 178
    .line 179
    invoke-interface {v4, v8}, Ljg1;->d(Lph4;)V

    .line 180
    .line 181
    .line 182
    iput-boolean v7, v2, Lni1;->W:Z

    .line 183
    .line 184
    invoke-virtual {v0}, Loi1;->a()V

    .line 185
    .line 186
    .line 187
    :cond_5
    iget-object v4, v2, Lni1;->a0:Ljg1;

    .line 188
    .line 189
    iget-boolean v8, v0, Loi1;->b0:Z

    .line 190
    .line 191
    iget-object v9, v0, Loi1;->k:Lkz2;

    .line 192
    .line 193
    const/4 v10, 0x4

    .line 194
    if-nez v8, :cond_14

    .line 195
    .line 196
    iget-boolean v8, v2, Lni1;->i:Z

    .line 197
    .line 198
    iget-object v11, v0, Loi1;->h:Lkz2;

    .line 199
    .line 200
    if-eqz v8, :cond_10

    .line 201
    .line 202
    iget v8, v0, Loi1;->U:I

    .line 203
    .line 204
    const v12, -0x40000001    # -1.9999999f

    .line 205
    .line 206
    .line 207
    and-int/2addr v8, v12

    .line 208
    iput v8, v0, Loi1;->U:I

    .line 209
    .line 210
    iget-boolean v8, v0, Loi1;->c0:Z

    .line 211
    .line 212
    const/16 v12, 0x80

    .line 213
    .line 214
    if-nez v8, :cond_7

    .line 215
    .line 216
    iget-object v8, v11, Lkz2;->a:[B

    .line 217
    .line 218
    invoke-interface {v1, v8, v7, v6}, Lmf1;->x([BII)V

    .line 219
    .line 220
    .line 221
    iget v8, v0, Loi1;->Y:I

    .line 222
    .line 223
    add-int/2addr v8, v6

    .line 224
    iput v8, v0, Loi1;->Y:I

    .line 225
    .line 226
    iget-object v8, v11, Lkz2;->a:[B

    .line 227
    .line 228
    aget-byte v8, v8, v7

    .line 229
    .line 230
    and-int/lit16 v13, v8, 0x80

    .line 231
    .line 232
    if-eq v13, v12, :cond_6

    .line 233
    .line 234
    iput-byte v8, v0, Loi1;->f0:B

    .line 235
    .line 236
    iput-boolean v6, v0, Loi1;->c0:Z

    .line 237
    .line 238
    goto :goto_1

    .line 239
    :cond_6
    const-string v1, "Extension bit is set in signal byte"

    .line 240
    .line 241
    const/4 v2, 0x0

    .line 242
    invoke-static {v2, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    throw v1

    .line 247
    :cond_7
    :goto_1
    iget-byte v8, v0, Loi1;->f0:B

    .line 248
    .line 249
    and-int/lit8 v13, v8, 0x1

    .line 250
    .line 251
    if-ne v13, v6, :cond_11

    .line 252
    .line 253
    and-int/2addr v8, v5

    .line 254
    iget v13, v0, Loi1;->U:I

    .line 255
    .line 256
    const/high16 v14, 0x40000000    # 2.0f

    .line 257
    .line 258
    or-int/2addr v13, v14

    .line 259
    iput v13, v0, Loi1;->U:I

    .line 260
    .line 261
    iget-boolean v13, v0, Loi1;->g0:Z

    .line 262
    .line 263
    if-nez v13, :cond_9

    .line 264
    .line 265
    iget-object v13, v0, Loi1;->m:Lkz2;

    .line 266
    .line 267
    iget-object v14, v13, Lkz2;->a:[B

    .line 268
    .line 269
    const/16 v15, 0x8

    .line 270
    .line 271
    invoke-interface {v1, v14, v7, v15}, Lmf1;->x([BII)V

    .line 272
    .line 273
    .line 274
    iget v14, v0, Loi1;->Y:I

    .line 275
    .line 276
    add-int/2addr v14, v15

    .line 277
    iput v14, v0, Loi1;->Y:I

    .line 278
    .line 279
    iput-boolean v6, v0, Loi1;->g0:Z

    .line 280
    .line 281
    if-ne v8, v5, :cond_8

    .line 282
    .line 283
    goto :goto_2

    .line 284
    :cond_8
    move v12, v7

    .line 285
    :goto_2
    or-int/2addr v12, v15

    .line 286
    iget-object v14, v11, Lkz2;->a:[B

    .line 287
    .line 288
    int-to-byte v12, v12

    .line 289
    aput-byte v12, v14, v7

    .line 290
    .line 291
    invoke-virtual {v11, v7}, Lkz2;->E(I)V

    .line 292
    .line 293
    .line 294
    invoke-interface {v4, v11, v6, v6}, Ljg1;->a(Lkz2;II)V

    .line 295
    .line 296
    .line 297
    iget v12, v0, Loi1;->Z:I

    .line 298
    .line 299
    add-int/2addr v12, v6

    .line 300
    iput v12, v0, Loi1;->Z:I

    .line 301
    .line 302
    invoke-virtual {v13, v7}, Lkz2;->E(I)V

    .line 303
    .line 304
    .line 305
    invoke-interface {v4, v13, v15, v6}, Ljg1;->a(Lkz2;II)V

    .line 306
    .line 307
    .line 308
    iget v12, v0, Loi1;->Z:I

    .line 309
    .line 310
    add-int/2addr v12, v15

    .line 311
    iput v12, v0, Loi1;->Z:I

    .line 312
    .line 313
    :cond_9
    if-ne v8, v5, :cond_11

    .line 314
    .line 315
    iget-boolean v8, v0, Loi1;->d0:Z

    .line 316
    .line 317
    if-nez v8, :cond_a

    .line 318
    .line 319
    iget-object v8, v11, Lkz2;->a:[B

    .line 320
    .line 321
    invoke-interface {v1, v8, v7, v6}, Lmf1;->x([BII)V

    .line 322
    .line 323
    .line 324
    iget v8, v0, Loi1;->Y:I

    .line 325
    .line 326
    add-int/2addr v8, v6

    .line 327
    iput v8, v0, Loi1;->Y:I

    .line 328
    .line 329
    invoke-virtual {v11, v7}, Lkz2;->E(I)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v11}, Lkz2;->K()I

    .line 333
    .line 334
    .line 335
    move-result v8

    .line 336
    iput v8, v0, Loi1;->e0:I

    .line 337
    .line 338
    iput-boolean v6, v0, Loi1;->d0:Z

    .line 339
    .line 340
    :cond_a
    iget v8, v0, Loi1;->e0:I

    .line 341
    .line 342
    mul-int/2addr v8, v10

    .line 343
    invoke-virtual {v11, v8}, Lkz2;->y(I)V

    .line 344
    .line 345
    .line 346
    iget-object v12, v11, Lkz2;->a:[B

    .line 347
    .line 348
    invoke-interface {v1, v12, v7, v8}, Lmf1;->x([BII)V

    .line 349
    .line 350
    .line 351
    iget v12, v0, Loi1;->Y:I

    .line 352
    .line 353
    add-int/2addr v12, v8

    .line 354
    iput v12, v0, Loi1;->Y:I

    .line 355
    .line 356
    iget v8, v0, Loi1;->e0:I

    .line 357
    .line 358
    shr-int/2addr v8, v6

    .line 359
    add-int/2addr v8, v6

    .line 360
    mul-int/lit8 v12, v8, 0x6

    .line 361
    .line 362
    add-int/2addr v12, v5

    .line 363
    iget-object v13, v0, Loi1;->p:Ljava/nio/ByteBuffer;

    .line 364
    .line 365
    if-eqz v13, :cond_b

    .line 366
    .line 367
    invoke-virtual {v13}, Ljava/nio/Buffer;->capacity()I

    .line 368
    .line 369
    .line 370
    move-result v13

    .line 371
    if-ge v13, v12, :cond_c

    .line 372
    .line 373
    :cond_b
    invoke-static {v12}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 374
    .line 375
    .line 376
    move-result-object v13

    .line 377
    iput-object v13, v0, Loi1;->p:Ljava/nio/ByteBuffer;

    .line 378
    .line 379
    :cond_c
    int-to-short v8, v8

    .line 380
    iget-object v13, v0, Loi1;->p:Ljava/nio/ByteBuffer;

    .line 381
    .line 382
    invoke-virtual {v13, v7}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 383
    .line 384
    .line 385
    iget-object v13, v0, Loi1;->p:Ljava/nio/ByteBuffer;

    .line 386
    .line 387
    invoke-virtual {v13, v8}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 388
    .line 389
    .line 390
    move v8, v7

    .line 391
    move v13, v8

    .line 392
    :goto_3
    iget v14, v0, Loi1;->e0:I

    .line 393
    .line 394
    if-ge v8, v14, :cond_e

    .line 395
    .line 396
    invoke-virtual {v11}, Lkz2;->h()I

    .line 397
    .line 398
    .line 399
    move-result v14

    .line 400
    sub-int v13, v14, v13

    .line 401
    .line 402
    rem-int/lit8 v15, v8, 0x2

    .line 403
    .line 404
    if-nez v15, :cond_d

    .line 405
    .line 406
    iget-object v15, v0, Loi1;->p:Ljava/nio/ByteBuffer;

    .line 407
    .line 408
    int-to-short v13, v13

    .line 409
    invoke-virtual {v15, v13}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 410
    .line 411
    .line 412
    goto :goto_4

    .line 413
    :cond_d
    iget-object v15, v0, Loi1;->p:Ljava/nio/ByteBuffer;

    .line 414
    .line 415
    invoke-virtual {v15, v13}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 416
    .line 417
    .line 418
    :goto_4
    add-int/lit8 v8, v8, 0x1

    .line 419
    .line 420
    move v13, v14

    .line 421
    goto :goto_3

    .line 422
    :cond_e
    iget v8, v0, Loi1;->Y:I

    .line 423
    .line 424
    sub-int v8, v3, v8

    .line 425
    .line 426
    sub-int/2addr v8, v13

    .line 427
    and-int/lit8 v13, v14, 0x1

    .line 428
    .line 429
    if-ne v13, v6, :cond_f

    .line 430
    .line 431
    iget-object v13, v0, Loi1;->p:Ljava/nio/ByteBuffer;

    .line 432
    .line 433
    invoke-virtual {v13, v8}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 434
    .line 435
    .line 436
    goto :goto_5

    .line 437
    :cond_f
    iget-object v13, v0, Loi1;->p:Ljava/nio/ByteBuffer;

    .line 438
    .line 439
    int-to-short v8, v8

    .line 440
    invoke-virtual {v13, v8}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 441
    .line 442
    .line 443
    iget-object v8, v0, Loi1;->p:Ljava/nio/ByteBuffer;

    .line 444
    .line 445
    invoke-virtual {v8, v7}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 446
    .line 447
    .line 448
    :goto_5
    iget-object v8, v0, Loi1;->p:Ljava/nio/ByteBuffer;

    .line 449
    .line 450
    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->array()[B

    .line 451
    .line 452
    .line 453
    move-result-object v8

    .line 454
    iget-object v13, v0, Loi1;->n:Lkz2;

    .line 455
    .line 456
    invoke-virtual {v13, v12, v8}, Lkz2;->z(I[B)V

    .line 457
    .line 458
    .line 459
    invoke-interface {v4, v13, v12, v6}, Ljg1;->a(Lkz2;II)V

    .line 460
    .line 461
    .line 462
    iget v8, v0, Loi1;->Z:I

    .line 463
    .line 464
    add-int/2addr v8, v12

    .line 465
    iput v8, v0, Loi1;->Z:I

    .line 466
    .line 467
    goto :goto_6

    .line 468
    :cond_10
    iget-object v8, v2, Lni1;->j:[B

    .line 469
    .line 470
    if-eqz v8, :cond_11

    .line 471
    .line 472
    array-length v12, v8

    .line 473
    invoke-virtual {v9, v12, v8}, Lkz2;->z(I[B)V

    .line 474
    .line 475
    .line 476
    :cond_11
    :goto_6
    iget-object v8, v2, Lni1;->c:Ljava/lang/String;

    .line 477
    .line 478
    const-string v12, "A_OPUS"

    .line 479
    .line 480
    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 481
    .line 482
    .line 483
    move-result v8

    .line 484
    if-eqz v8, :cond_12

    .line 485
    .line 486
    if-eqz p4, :cond_13

    .line 487
    .line 488
    goto :goto_7

    .line 489
    :cond_12
    iget v8, v2, Lni1;->g:I

    .line 490
    .line 491
    if-lez v8, :cond_13

    .line 492
    .line 493
    :goto_7
    iget v8, v0, Loi1;->U:I

    .line 494
    .line 495
    const/high16 v12, 0x10000000

    .line 496
    .line 497
    or-int/2addr v8, v12

    .line 498
    iput v8, v0, Loi1;->U:I

    .line 499
    .line 500
    iget-object v8, v0, Loi1;->o:Lkz2;

    .line 501
    .line 502
    invoke-virtual {v8, v7}, Lkz2;->y(I)V

    .line 503
    .line 504
    .line 505
    iget v8, v9, Lkz2;->c:I

    .line 506
    .line 507
    add-int/2addr v8, v3

    .line 508
    iget v12, v0, Loi1;->Y:I

    .line 509
    .line 510
    sub-int/2addr v8, v12

    .line 511
    invoke-virtual {v11, v10}, Lkz2;->y(I)V

    .line 512
    .line 513
    .line 514
    shr-int/lit8 v12, v8, 0x18

    .line 515
    .line 516
    iget-object v13, v11, Lkz2;->a:[B

    .line 517
    .line 518
    and-int/lit16 v12, v12, 0xff

    .line 519
    .line 520
    int-to-byte v12, v12

    .line 521
    aput-byte v12, v13, v7

    .line 522
    .line 523
    shr-int/lit8 v12, v8, 0x10

    .line 524
    .line 525
    and-int/lit16 v12, v12, 0xff

    .line 526
    .line 527
    int-to-byte v12, v12

    .line 528
    aput-byte v12, v13, v6

    .line 529
    .line 530
    shr-int/lit8 v12, v8, 0x8

    .line 531
    .line 532
    and-int/lit16 v12, v12, 0xff

    .line 533
    .line 534
    int-to-byte v12, v12

    .line 535
    aput-byte v12, v13, v5

    .line 536
    .line 537
    and-int/lit16 v8, v8, 0xff

    .line 538
    .line 539
    int-to-byte v8, v8

    .line 540
    const/4 v12, 0x3

    .line 541
    aput-byte v8, v13, v12

    .line 542
    .line 543
    invoke-interface {v4, v11, v10, v5}, Ljg1;->a(Lkz2;II)V

    .line 544
    .line 545
    .line 546
    iget v8, v0, Loi1;->Z:I

    .line 547
    .line 548
    add-int/2addr v8, v10

    .line 549
    iput v8, v0, Loi1;->Z:I

    .line 550
    .line 551
    :cond_13
    iput-boolean v6, v0, Loi1;->b0:Z

    .line 552
    .line 553
    :cond_14
    iget v8, v9, Lkz2;->c:I

    .line 554
    .line 555
    add-int/2addr v3, v8

    .line 556
    iget-object v8, v2, Lni1;->c:Ljava/lang/String;

    .line 557
    .line 558
    const-string v11, "V_MPEG4/ISO/AVC"

    .line 559
    .line 560
    invoke-virtual {v11, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 561
    .line 562
    .line 563
    move-result v8

    .line 564
    if-nez v8, :cond_19

    .line 565
    .line 566
    iget-object v8, v2, Lni1;->c:Ljava/lang/String;

    .line 567
    .line 568
    const-string v11, "V_MPEGH/ISO/HEVC"

    .line 569
    .line 570
    invoke-virtual {v11, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 571
    .line 572
    .line 573
    move-result v8

    .line 574
    if-eqz v8, :cond_15

    .line 575
    .line 576
    goto :goto_b

    .line 577
    :cond_15
    iget-object v5, v2, Lni1;->V:Lkg1;

    .line 578
    .line 579
    if-nez v5, :cond_16

    .line 580
    .line 581
    goto :goto_9

    .line 582
    :cond_16
    iget v5, v9, Lkz2;->c:I

    .line 583
    .line 584
    if-nez v5, :cond_17

    .line 585
    .line 586
    goto :goto_8

    .line 587
    :cond_17
    move v6, v7

    .line 588
    :goto_8
    invoke-static {v6}, Lzt0;->b0(Z)V

    .line 589
    .line 590
    .line 591
    iget-object v5, v2, Lni1;->V:Lkg1;

    .line 592
    .line 593
    invoke-virtual {v5, v1}, Lkg1;->a(Lmf1;)V

    .line 594
    .line 595
    .line 596
    :goto_9
    iget v5, v0, Loi1;->Y:I

    .line 597
    .line 598
    if-ge v5, v3, :cond_1d

    .line 599
    .line 600
    sub-int v5, v3, v5

    .line 601
    .line 602
    invoke-virtual {v9}, Lkz2;->B()I

    .line 603
    .line 604
    .line 605
    move-result v6

    .line 606
    if-lez v6, :cond_18

    .line 607
    .line 608
    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    .line 609
    .line 610
    .line 611
    move-result v5

    .line 612
    invoke-interface {v4, v9, v5, v7}, Ljg1;->a(Lkz2;II)V

    .line 613
    .line 614
    .line 615
    goto :goto_a

    .line 616
    :cond_18
    invoke-interface {v4, v1, v5, v7}, Ljg1;->b(Lua4;IZ)I

    .line 617
    .line 618
    .line 619
    move-result v5

    .line 620
    :goto_a
    iget v6, v0, Loi1;->Y:I

    .line 621
    .line 622
    add-int/2addr v6, v5

    .line 623
    iput v6, v0, Loi1;->Y:I

    .line 624
    .line 625
    iget v6, v0, Loi1;->Z:I

    .line 626
    .line 627
    add-int/2addr v6, v5

    .line 628
    iput v6, v0, Loi1;->Z:I

    .line 629
    .line 630
    goto :goto_9

    .line 631
    :cond_19
    :goto_b
    iget-object v8, v0, Loi1;->g:Lkz2;

    .line 632
    .line 633
    iget-object v11, v8, Lkz2;->a:[B

    .line 634
    .line 635
    aput-byte v7, v11, v7

    .line 636
    .line 637
    aput-byte v7, v11, v6

    .line 638
    .line 639
    aput-byte v7, v11, v5

    .line 640
    .line 641
    iget v5, v2, Lni1;->c0:I

    .line 642
    .line 643
    rsub-int/lit8 v6, v5, 0x4

    .line 644
    .line 645
    :goto_c
    iget v12, v0, Loi1;->Y:I

    .line 646
    .line 647
    if-ge v12, v3, :cond_1d

    .line 648
    .line 649
    iget v12, v0, Loi1;->a0:I

    .line 650
    .line 651
    if-nez v12, :cond_1b

    .line 652
    .line 653
    invoke-virtual {v9}, Lkz2;->B()I

    .line 654
    .line 655
    .line 656
    move-result v12

    .line 657
    invoke-static {v5, v12}, Ljava/lang/Math;->min(II)I

    .line 658
    .line 659
    .line 660
    move-result v12

    .line 661
    add-int v13, v6, v12

    .line 662
    .line 663
    sub-int v14, v5, v12

    .line 664
    .line 665
    invoke-interface {v1, v11, v13, v14}, Lmf1;->x([BII)V

    .line 666
    .line 667
    .line 668
    if-lez v12, :cond_1a

    .line 669
    .line 670
    invoke-virtual {v9, v11, v6, v12}, Lkz2;->H([BII)V

    .line 671
    .line 672
    .line 673
    :cond_1a
    iget v12, v0, Loi1;->Y:I

    .line 674
    .line 675
    add-int/2addr v12, v5

    .line 676
    iput v12, v0, Loi1;->Y:I

    .line 677
    .line 678
    invoke-virtual {v8, v7}, Lkz2;->E(I)V

    .line 679
    .line 680
    .line 681
    invoke-virtual {v8}, Lkz2;->h()I

    .line 682
    .line 683
    .line 684
    move-result v12

    .line 685
    iput v12, v0, Loi1;->a0:I

    .line 686
    .line 687
    iget-object v12, v0, Loi1;->f:Lkz2;

    .line 688
    .line 689
    invoke-virtual {v12, v7}, Lkz2;->E(I)V

    .line 690
    .line 691
    .line 692
    invoke-interface {v4, v12, v10, v7}, Ljg1;->a(Lkz2;II)V

    .line 693
    .line 694
    .line 695
    iget v12, v0, Loi1;->Z:I

    .line 696
    .line 697
    add-int/2addr v12, v10

    .line 698
    iput v12, v0, Loi1;->Z:I

    .line 699
    .line 700
    goto :goto_c

    .line 701
    :cond_1b
    invoke-virtual {v9}, Lkz2;->B()I

    .line 702
    .line 703
    .line 704
    move-result v13

    .line 705
    if-lez v13, :cond_1c

    .line 706
    .line 707
    invoke-static {v12, v13}, Ljava/lang/Math;->min(II)I

    .line 708
    .line 709
    .line 710
    move-result v12

    .line 711
    invoke-interface {v4, v9, v12, v7}, Ljg1;->a(Lkz2;II)V

    .line 712
    .line 713
    .line 714
    goto :goto_d

    .line 715
    :cond_1c
    invoke-interface {v4, v1, v12, v7}, Ljg1;->b(Lua4;IZ)I

    .line 716
    .line 717
    .line 718
    move-result v12

    .line 719
    :goto_d
    iget v13, v0, Loi1;->Y:I

    .line 720
    .line 721
    add-int/2addr v13, v12

    .line 722
    iput v13, v0, Loi1;->Y:I

    .line 723
    .line 724
    iget v13, v0, Loi1;->Z:I

    .line 725
    .line 726
    add-int/2addr v13, v12

    .line 727
    iput v13, v0, Loi1;->Z:I

    .line 728
    .line 729
    iget v13, v0, Loi1;->a0:I

    .line 730
    .line 731
    sub-int/2addr v13, v12

    .line 732
    iput v13, v0, Loi1;->a0:I

    .line 733
    .line 734
    goto :goto_c

    .line 735
    :cond_1d
    iget-object v1, v2, Lni1;->c:Ljava/lang/String;

    .line 736
    .line 737
    const-string v2, "A_VORBIS"

    .line 738
    .line 739
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 740
    .line 741
    .line 742
    move-result v1

    .line 743
    if-eqz v1, :cond_1e

    .line 744
    .line 745
    iget-object v1, v0, Loi1;->i:Lkz2;

    .line 746
    .line 747
    invoke-virtual {v1, v7}, Lkz2;->E(I)V

    .line 748
    .line 749
    .line 750
    invoke-interface {v4, v1, v10, v7}, Ljg1;->a(Lkz2;II)V

    .line 751
    .line 752
    .line 753
    iget v1, v0, Loi1;->Z:I

    .line 754
    .line 755
    add-int/2addr v1, v10

    .line 756
    iput v1, v0, Loi1;->Z:I

    .line 757
    .line 758
    :cond_1e
    iget v1, v0, Loi1;->Z:I

    .line 759
    .line 760
    invoke-virtual {v0}, Loi1;->m()V

    .line 761
    .line 762
    .line 763
    return v1

    .line 764
    :cond_1f
    :goto_e
    sget-object v2, Loi1;->l0:[B

    .line 765
    .line 766
    invoke-virtual {v0, v1, v2, v3}, Loi1;->n(Lmf1;[BI)V

    .line 767
    .line 768
    .line 769
    iget v1, v0, Loi1;->Z:I

    .line 770
    .line 771
    invoke-virtual {v0}, Loi1;->m()V

    .line 772
    .line 773
    .line 774
    return v1
.end method

.method public final m()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Loi1;->Y:I

    .line 3
    .line 4
    iput v0, p0, Loi1;->Z:I

    .line 5
    .line 6
    iput v0, p0, Loi1;->a0:I

    .line 7
    .line 8
    iput-boolean v0, p0, Loi1;->b0:Z

    .line 9
    .line 10
    iput-boolean v0, p0, Loi1;->c0:Z

    .line 11
    .line 12
    iput-boolean v0, p0, Loi1;->d0:Z

    .line 13
    .line 14
    iput v0, p0, Loi1;->e0:I

    .line 15
    .line 16
    iput-byte v0, p0, Loi1;->f0:B

    .line 17
    .line 18
    iput-boolean v0, p0, Loi1;->g0:Z

    .line 19
    .line 20
    iget-object v1, p0, Loi1;->k:Lkz2;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Lkz2;->y(I)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final n(Lmf1;[BI)V
    .locals 6

    .line 1
    array-length v0, p2

    .line 2
    add-int v1, v0, p3

    .line 3
    .line 4
    iget-object v2, p0, Loi1;->l:Lkz2;

    .line 5
    .line 6
    iget-object v3, v2, Lkz2;->a:[B

    .line 7
    .line 8
    array-length v4, v3

    .line 9
    const/4 v5, 0x0

    .line 10
    if-ge v4, v1, :cond_0

    .line 11
    .line 12
    add-int v3, v1, p3

    .line 13
    .line 14
    invoke-static {p2, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    array-length v3, p2

    .line 19
    invoke-virtual {v2, v3, p2}, Lkz2;->z(I[B)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-static {p2, v5, v3, v5, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 24
    .line 25
    .line 26
    :goto_0
    iget-object p2, v2, Lkz2;->a:[B

    .line 27
    .line 28
    invoke-interface {p1, p2, v0, p3}, Lmf1;->x([BII)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, v5}, Lkz2;->E(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v1}, Lkz2;->C(I)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final p(J)J
    .locals 7

    .line 1
    iget-wide v2, p0, Loi1;->s:J

    .line 2
    .line 3
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v0, v2, v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const-wide/16 v4, 0x3e8

    .line 13
    .line 14
    sget-object v6, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 15
    .line 16
    move-wide v0, p1

    .line 17
    invoke-static/range {v0 .. v6}, Lv23;->t(JJJLjava/math/RoundingMode;)J

    .line 18
    .line 19
    .line 20
    move-result-wide p1

    .line 21
    return-wide p1

    .line 22
    :cond_0
    const-string p1, "Can\'t scale timecode prior to timecodeScale being set."

    .line 23
    .line 24
    const/4 p2, 0x0

    .line 25
    invoke-static {p2, p1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    throw p1
.end method
