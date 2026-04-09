.class public final Ljj1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Llf1;


# static fields
.field public static final L:[B

.field public static final M:Lph4;


# instance fields
.field public A:Lij1;

.field public B:I

.field public C:I

.field public D:I

.field public E:Z

.field public F:Z

.field public G:Lnf1;

.field public H:[Ljg1;

.field public I:[Ljg1;

.field public J:Z

.field public K:J

.field public final a:Ljk1;

.field public final b:I

.field public final c:Ljava/util/List;

.field public final d:Landroid/util/SparseArray;

.field public final e:Lkz2;

.field public final f:Lkz2;

.field public final g:Lkz2;

.field public final h:[B

.field public final i:Lkz2;

.field public final j:Lgw3;

.field public final k:Lkz2;

.field public final l:Ljava/util/ArrayDeque;

.field public final m:Ljava/util/ArrayDeque;

.field public final n:Lfw3;

.field public final o:Lcf1;

.field public p:Lsn3;

.field public q:I

.field public r:I

.field public s:J

.field public t:I

.field public u:Lkz2;

.field public v:J

.field public w:I

.field public x:J

.field public y:J

.field public z:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Ljj1;->L:[B

    .line 9
    .line 10
    new-instance v0, Lgg4;

    .line 11
    .line 12
    invoke-direct {v0}, Lgg4;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v1, "application/x-emsg"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lgg4;->e(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    new-instance v1, Lph4;

    .line 21
    .line 22
    invoke-direct {v1, v0}, Lph4;-><init>(Lgg4;)V

    .line 23
    .line 24
    .line 25
    sput-object v1, Ljj1;->M:Lph4;

    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :array_0
    .array-data 1
        -0x5et
        0x39t
        0x4ft
        0x52t
        0x5at
        -0x65t
        0x4ft
        0x14t
        -0x5et
        0x44t
        0x6ct
        0x42t
        0x7ct
        0x64t
        -0x73t
        -0xct
    .end array-data
.end method

.method public constructor <init>(Ljk1;ILsn3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljj1;->a:Ljk1;

    .line 5
    .line 6
    iput p2, p0, Ljj1;->b:I

    .line 7
    .line 8
    invoke-static {p3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Ljj1;->c:Ljava/util/List;

    .line 13
    .line 14
    new-instance p1, Lgw3;

    .line 15
    .line 16
    const/16 p2, 0x13

    .line 17
    .line 18
    invoke-direct {p1, p2}, Lgw3;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Ljj1;->j:Lgw3;

    .line 22
    .line 23
    new-instance p1, Lkz2;

    .line 24
    .line 25
    const/16 p2, 0x10

    .line 26
    .line 27
    invoke-direct {p1, p2}, Lkz2;-><init>(I)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Ljj1;->k:Lkz2;

    .line 31
    .line 32
    new-instance p1, Lkz2;

    .line 33
    .line 34
    sget-object p3, Lwl2;->G:[B

    .line 35
    .line 36
    invoke-direct {p1, p3}, Lkz2;-><init>([B)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Ljj1;->e:Lkz2;

    .line 40
    .line 41
    new-instance p1, Lkz2;

    .line 42
    .line 43
    const/4 p3, 0x6

    .line 44
    invoke-direct {p1, p3}, Lkz2;-><init>(I)V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Ljj1;->f:Lkz2;

    .line 48
    .line 49
    new-instance p1, Lkz2;

    .line 50
    .line 51
    invoke-direct {p1}, Lkz2;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, Ljj1;->g:Lkz2;

    .line 55
    .line 56
    new-array p1, p2, [B

    .line 57
    .line 58
    iput-object p1, p0, Ljj1;->h:[B

    .line 59
    .line 60
    new-instance p2, Lkz2;

    .line 61
    .line 62
    invoke-direct {p2, p1}, Lkz2;-><init>([B)V

    .line 63
    .line 64
    .line 65
    iput-object p2, p0, Ljj1;->i:Lkz2;

    .line 66
    .line 67
    new-instance p1, Ljava/util/ArrayDeque;

    .line 68
    .line 69
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-object p1, p0, Ljj1;->l:Ljava/util/ArrayDeque;

    .line 73
    .line 74
    new-instance p1, Ljava/util/ArrayDeque;

    .line 75
    .line 76
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 77
    .line 78
    .line 79
    iput-object p1, p0, Ljj1;->m:Ljava/util/ArrayDeque;

    .line 80
    .line 81
    new-instance p1, Landroid/util/SparseArray;

    .line 82
    .line 83
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 84
    .line 85
    .line 86
    iput-object p1, p0, Ljj1;->d:Landroid/util/SparseArray;

    .line 87
    .line 88
    sget-object p1, Lxm3;->g:Lvm3;

    .line 89
    .line 90
    sget-object p1, Lsn3;->j:Lsn3;

    .line 91
    .line 92
    iput-object p1, p0, Ljj1;->p:Lsn3;

    .line 93
    .line 94
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    iput-wide p1, p0, Ljj1;->y:J

    .line 100
    .line 101
    iput-wide p1, p0, Ljj1;->x:J

    .line 102
    .line 103
    iput-wide p1, p0, Ljj1;->z:J

    .line 104
    .line 105
    sget-object p1, Lnf1;->d:Lts0;

    .line 106
    .line 107
    iput-object p1, p0, Ljj1;->G:Lnf1;

    .line 108
    .line 109
    const/4 p1, 0x0

    .line 110
    new-array p2, p1, [Ljg1;

    .line 111
    .line 112
    iput-object p2, p0, Ljj1;->H:[Ljg1;

    .line 113
    .line 114
    new-array p1, p1, [Ljg1;

    .line 115
    .line 116
    iput-object p1, p0, Ljj1;->I:[Ljg1;

    .line 117
    .line 118
    new-instance p1, Lfw3;

    .line 119
    .line 120
    new-instance p2, Lsq0;

    .line 121
    .line 122
    const/16 p3, 0x9

    .line 123
    .line 124
    invoke-direct {p2, p3, p0}, Lsq0;-><init>(ILjava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    invoke-direct {p1, p2}, Lfw3;-><init>(Lzb3;)V

    .line 128
    .line 129
    .line 130
    iput-object p1, p0, Ljj1;->n:Lfw3;

    .line 131
    .line 132
    new-instance p1, Lcf1;

    .line 133
    .line 134
    invoke-direct {p1}, Lcf1;-><init>()V

    .line 135
    .line 136
    .line 137
    iput-object p1, p0, Ljj1;->o:Lcf1;

    .line 138
    .line 139
    const-wide/16 p1, -0x1

    .line 140
    .line 141
    iput-wide p1, p0, Ljj1;->K:J

    .line 142
    .line 143
    return-void
.end method

.method public static h(I)V
    .locals 2

    .line 1
    if-ltz p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    add-int/lit8 v0, v0, 0x1b

    .line 15
    .line 16
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 17
    .line 18
    .line 19
    const-string v0, "Unexpected negative value: "

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-static {v0, p0}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    throw p0
.end method

.method public static i(Lkz2;ILsj1;)V
    .locals 5

    .line 1
    add-int/lit8 p1, p1, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lkz2;->E(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lkz2;->b()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    sget-object v0, Lej1;->a:[B

    .line 11
    .line 12
    and-int/lit8 v0, p1, 0x1

    .line 13
    .line 14
    if-nez v0, :cond_3

    .line 15
    .line 16
    and-int/lit8 p1, p1, 0x2

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    const/4 v1, 0x1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    move p1, v1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move p1, v0

    .line 25
    :goto_0
    invoke-virtual {p0}, Lkz2;->h()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    iget-object p0, p2, Lsj1;->l:[Z

    .line 32
    .line 33
    iget p1, p2, Lsj1;->e:I

    .line 34
    .line 35
    invoke-static {p0, v0, p1, v0}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    iget v3, p2, Lsj1;->e:I

    .line 40
    .line 41
    iget-object v4, p2, Lsj1;->n:Lkz2;

    .line 42
    .line 43
    if-ne v2, v3, :cond_2

    .line 44
    .line 45
    iget-object v3, p2, Lsj1;->l:[Z

    .line 46
    .line 47
    invoke-static {v3, v0, v2, p1}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lkz2;->B()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    invoke-virtual {v4, p1}, Lkz2;->y(I)V

    .line 55
    .line 56
    .line 57
    iput-boolean v1, p2, Lsj1;->k:Z

    .line 58
    .line 59
    iput-boolean v1, p2, Lsj1;->o:Z

    .line 60
    .line 61
    iget-object p1, v4, Lkz2;->a:[B

    .line 62
    .line 63
    iget v1, v4, Lkz2;->c:I

    .line 64
    .line 65
    invoke-virtual {p0, p1, v0, v1}, Lkz2;->H([BII)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4, v0}, Lkz2;->E(I)V

    .line 69
    .line 70
    .line 71
    iput-boolean v0, p2, Lsj1;->o:Z

    .line 72
    .line 73
    return-void

    .line 74
    :cond_2
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    add-int/lit8 p0, p0, 0x3a

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    new-instance p2, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    add-int/2addr p0, p1

    .line 95
    invoke-direct {p2, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 96
    .line 97
    .line 98
    const-string p0, "Senc sample count "

    .line 99
    .line 100
    const-string p1, " is different from fragment sample count"

    .line 101
    .line 102
    invoke-static {p2, p0, v2, p1, v3}, Lga1;->l(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    const/4 p1, 0x0

    .line 107
    invoke-static {p1, p0}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    throw p0

    .line 112
    :cond_3
    const-string p0, "Overriding TrackEncryptionBox parameters is unsupported."

    .line 113
    .line 114
    invoke-static {p0}, Llq1;->b(Ljava/lang/String;)Llq1;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    throw p0
.end method

.method public static j(JLkz2;)Landroid/util/Pair;
    .locals 22

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lkz2;->E(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lkz2;->b()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-static {v1}, Lej1;->a(I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x4

    .line 17
    invoke-virtual {v0, v2}, Lkz2;->G(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lkz2;->P()J

    .line 21
    .line 22
    .line 23
    move-result-wide v7

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0}, Lkz2;->P()J

    .line 27
    .line 28
    .line 29
    move-result-wide v3

    .line 30
    invoke-virtual {v0}, Lkz2;->P()J

    .line 31
    .line 32
    .line 33
    move-result-wide v5

    .line 34
    :goto_0
    add-long v5, v5, p0

    .line 35
    .line 36
    move-wide v10, v5

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    invoke-virtual {v0}, Lkz2;->j()J

    .line 39
    .line 40
    .line 41
    move-result-wide v3

    .line 42
    invoke-virtual {v0}, Lkz2;->j()J

    .line 43
    .line 44
    .line 45
    move-result-wide v5

    .line 46
    goto :goto_0

    .line 47
    :goto_1
    const-wide/32 v5, 0xf4240

    .line 48
    .line 49
    .line 50
    sget-object v9, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 51
    .line 52
    invoke-static/range {v3 .. v9}, Lv23;->t(JJJLjava/math/RoundingMode;)J

    .line 53
    .line 54
    .line 55
    move-result-wide v12

    .line 56
    const/4 v1, 0x2

    .line 57
    invoke-virtual {v0, v1}, Lkz2;->G(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Lkz2;->L()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    new-array v14, v1, [I

    .line 65
    .line 66
    new-array v15, v1, [J

    .line 67
    .line 68
    new-array v5, v1, [J

    .line 69
    .line 70
    new-array v6, v1, [J

    .line 71
    .line 72
    const/4 v9, 0x0

    .line 73
    move-wide/from16 v16, v10

    .line 74
    .line 75
    move-wide/from16 v18, v12

    .line 76
    .line 77
    move v10, v9

    .line 78
    :goto_2
    if-ge v10, v1, :cond_2

    .line 79
    .line 80
    invoke-virtual {v0}, Lkz2;->b()I

    .line 81
    .line 82
    .line 83
    move-result v9

    .line 84
    const/high16 v11, -0x80000000

    .line 85
    .line 86
    and-int/2addr v11, v9

    .line 87
    if-nez v11, :cond_1

    .line 88
    .line 89
    invoke-virtual {v0}, Lkz2;->P()J

    .line 90
    .line 91
    .line 92
    move-result-wide v20

    .line 93
    const v11, 0x7fffffff

    .line 94
    .line 95
    .line 96
    and-int/2addr v9, v11

    .line 97
    aput v9, v14, v10

    .line 98
    .line 99
    aput-wide v16, v15, v10

    .line 100
    .line 101
    aput-wide v18, v6, v10

    .line 102
    .line 103
    add-long v3, v3, v20

    .line 104
    .line 105
    move-object v9, v5

    .line 106
    move-object v11, v6

    .line 107
    const-wide/32 v5, 0xf4240

    .line 108
    .line 109
    .line 110
    move-object/from16 v18, v9

    .line 111
    .line 112
    sget-object v9, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 113
    .line 114
    move-object v2, v11

    .line 115
    move-object/from16 v11, v18

    .line 116
    .line 117
    invoke-static/range {v3 .. v9}, Lv23;->t(JJJLjava/math/RoundingMode;)J

    .line 118
    .line 119
    .line 120
    move-result-wide v5

    .line 121
    aget-wide v19, v2, v10

    .line 122
    .line 123
    sub-long v19, v5, v19

    .line 124
    .line 125
    aput-wide v19, v11, v10

    .line 126
    .line 127
    const/4 v9, 0x4

    .line 128
    invoke-virtual {v0, v9}, Lkz2;->G(I)V

    .line 129
    .line 130
    .line 131
    aget v9, v14, v10

    .line 132
    .line 133
    move/from16 p0, v1

    .line 134
    .line 135
    int-to-long v0, v9

    .line 136
    add-long v16, v16, v0

    .line 137
    .line 138
    add-int/lit8 v10, v10, 0x1

    .line 139
    .line 140
    move/from16 v1, p0

    .line 141
    .line 142
    move-object/from16 v0, p2

    .line 143
    .line 144
    move-wide/from16 v18, v5

    .line 145
    .line 146
    move-object v5, v11

    .line 147
    move-object v6, v2

    .line 148
    const/4 v2, 0x4

    .line 149
    goto :goto_2

    .line 150
    :cond_1
    const-string v0, "Unhandled indirect reference"

    .line 151
    .line 152
    const/4 v1, 0x0

    .line 153
    invoke-static {v1, v0}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    throw v0

    .line 158
    :cond_2
    move-object v11, v5

    .line 159
    move-object v2, v6

    .line 160
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    new-instance v1, Lbf1;

    .line 165
    .line 166
    invoke-direct {v1, v14, v15, v11, v2}, Lbf1;-><init>([I[J[J[J)V

    .line 167
    .line 168
    .line 169
    invoke-static {v0, v1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    return-object v0
.end method

.method public static k(Ljava/util/List;)Lie4;
    .locals 17

    .line 1
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v3, v1

    .line 7
    const/4 v4, 0x0

    .line 8
    :goto_0
    if-ge v3, v0, :cond_a

    .line 9
    .line 10
    move-object/from16 v5, p0

    .line 11
    .line 12
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v6

    .line 16
    check-cast v6, Lp43;

    .line 17
    .line 18
    iget v7, v6, Ltd;->b:I

    .line 19
    .line 20
    const v8, 0x70737368    # 3.013775E29f

    .line 21
    .line 22
    .line 23
    if-ne v7, v8, :cond_9

    .line 24
    .line 25
    if-nez v4, :cond_0

    .line 26
    .line 27
    new-instance v4, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    :cond_0
    iget-object v6, v6, Lp43;->c:Lkz2;

    .line 33
    .line 34
    iget-object v6, v6, Lkz2;->a:[B

    .line 35
    .line 36
    new-instance v7, Lkz2;

    .line 37
    .line 38
    invoke-direct {v7, v6}, Lkz2;-><init>([B)V

    .line 39
    .line 40
    .line 41
    iget v9, v7, Lkz2;->c:I

    .line 42
    .line 43
    const/16 v10, 0x20

    .line 44
    .line 45
    if-ge v9, v10, :cond_1

    .line 46
    .line 47
    :goto_1
    move/from16 v16, v3

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    const/4 v15, 0x0

    .line 51
    goto/16 :goto_3

    .line 52
    .line 53
    :cond_1
    invoke-virtual {v7, v1}, Lkz2;->E(I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v7}, Lkz2;->B()I

    .line 57
    .line 58
    .line 59
    move-result v9

    .line 60
    invoke-virtual {v7}, Lkz2;->b()I

    .line 61
    .line 62
    .line 63
    move-result v10

    .line 64
    if-eq v10, v9, :cond_2

    .line 65
    .line 66
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    add-int/lit8 v7, v7, 0x34

    .line 79
    .line 80
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    new-instance v11, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    add-int/2addr v7, v8

    .line 87
    invoke-direct {v11, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 88
    .line 89
    .line 90
    const-string v7, "Advertised atom size ("

    .line 91
    .line 92
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string v7, ") does not match buffer size: "

    .line 99
    .line 100
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    invoke-static {v7}, La30;->x(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_2
    invoke-virtual {v7}, Lkz2;->b()I

    .line 115
    .line 116
    .line 117
    move-result v9

    .line 118
    if-eq v9, v8, :cond_3

    .line 119
    .line 120
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 125
    .line 126
    .line 127
    move-result v7

    .line 128
    new-instance v8, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    add-int/lit8 v7, v7, 0x17

    .line 131
    .line 132
    invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 133
    .line 134
    .line 135
    const-string v7, "Atom type is not pssh: "

    .line 136
    .line 137
    invoke-static {v8, v9, v7}, Lga1;->q(Ljava/lang/StringBuilder;ILjava/lang/String;)V

    .line 138
    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_3
    invoke-virtual {v7}, Lkz2;->b()I

    .line 142
    .line 143
    .line 144
    move-result v8

    .line 145
    invoke-static {v8}, Lej1;->a(I)I

    .line 146
    .line 147
    .line 148
    move-result v8

    .line 149
    const/4 v9, 0x1

    .line 150
    if-le v8, v9, :cond_4

    .line 151
    .line 152
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v7

    .line 156
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 157
    .line 158
    .line 159
    move-result v7

    .line 160
    new-instance v9, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    add-int/lit8 v7, v7, 0x1a

    .line 163
    .line 164
    invoke-direct {v9, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 165
    .line 166
    .line 167
    const-string v7, "Unsupported pssh version: "

    .line 168
    .line 169
    invoke-static {v9, v8, v7}, Lga1;->q(Ljava/lang/StringBuilder;ILjava/lang/String;)V

    .line 170
    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_4
    new-instance v10, Ljava/util/UUID;

    .line 174
    .line 175
    invoke-virtual {v7}, Lkz2;->d()J

    .line 176
    .line 177
    .line 178
    move-result-wide v11

    .line 179
    invoke-virtual {v7}, Lkz2;->d()J

    .line 180
    .line 181
    .line 182
    move-result-wide v13

    .line 183
    invoke-direct {v10, v11, v12, v13, v14}, Ljava/util/UUID;-><init>(JJ)V

    .line 184
    .line 185
    .line 186
    if-ne v8, v9, :cond_5

    .line 187
    .line 188
    invoke-virtual {v7}, Lkz2;->h()I

    .line 189
    .line 190
    .line 191
    move-result v8

    .line 192
    new-array v9, v8, [Ljava/util/UUID;

    .line 193
    .line 194
    move v11, v1

    .line 195
    :goto_2
    if-ge v11, v8, :cond_5

    .line 196
    .line 197
    new-instance v12, Ljava/util/UUID;

    .line 198
    .line 199
    invoke-virtual {v7}, Lkz2;->d()J

    .line 200
    .line 201
    .line 202
    move-result-wide v13

    .line 203
    move/from16 v16, v3

    .line 204
    .line 205
    const/4 v15, 0x0

    .line 206
    invoke-virtual {v7}, Lkz2;->d()J

    .line 207
    .line 208
    .line 209
    move-result-wide v2

    .line 210
    invoke-direct {v12, v13, v14, v2, v3}, Ljava/util/UUID;-><init>(JJ)V

    .line 211
    .line 212
    .line 213
    aput-object v12, v9, v11

    .line 214
    .line 215
    add-int/lit8 v11, v11, 0x1

    .line 216
    .line 217
    move/from16 v3, v16

    .line 218
    .line 219
    goto :goto_2

    .line 220
    :cond_5
    move/from16 v16, v3

    .line 221
    .line 222
    const/4 v15, 0x0

    .line 223
    invoke-virtual {v7}, Lkz2;->h()I

    .line 224
    .line 225
    .line 226
    move-result v2

    .line 227
    invoke-virtual {v7}, Lkz2;->B()I

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    if-eq v2, v3, :cond_6

    .line 232
    .line 233
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v7

    .line 237
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 238
    .line 239
    .line 240
    move-result v7

    .line 241
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v8

    .line 245
    add-int/lit8 v7, v7, 0x31

    .line 246
    .line 247
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 248
    .line 249
    .line 250
    move-result v8

    .line 251
    new-instance v9, Ljava/lang/StringBuilder;

    .line 252
    .line 253
    add-int/2addr v7, v8

    .line 254
    invoke-direct {v9, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 255
    .line 256
    .line 257
    const-string v7, "Atom data size ("

    .line 258
    .line 259
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    const-string v2, ") does not match the bytes left: "

    .line 266
    .line 267
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    invoke-static {v2}, La30;->x(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    move-object v2, v15

    .line 281
    goto :goto_3

    .line 282
    :cond_6
    new-array v3, v2, [B

    .line 283
    .line 284
    invoke-virtual {v7, v3, v1, v2}, Lkz2;->H([BII)V

    .line 285
    .line 286
    .line 287
    new-instance v2, Lug0;

    .line 288
    .line 289
    const/16 v3, 0xa

    .line 290
    .line 291
    invoke-direct {v2, v3, v10}, Lug0;-><init>(ILjava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    :goto_3
    if-nez v2, :cond_7

    .line 295
    .line 296
    move-object v2, v15

    .line 297
    goto :goto_4

    .line 298
    :cond_7
    iget-object v2, v2, Lug0;->g:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast v2, Ljava/util/UUID;

    .line 301
    .line 302
    :goto_4
    if-nez v2, :cond_8

    .line 303
    .line 304
    const-string v2, "Skipped pssh atom (failed to extract uuid)"

    .line 305
    .line 306
    invoke-static {v2}, La30;->x(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    goto :goto_5

    .line 310
    :cond_8
    new-instance v3, Lvd4;

    .line 311
    .line 312
    const-string v7, "video/mp4"

    .line 313
    .line 314
    invoke-direct {v3, v2, v7, v6}, Lvd4;-><init>(Ljava/util/UUID;Ljava/lang/String;[B)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    goto :goto_5

    .line 321
    :cond_9
    move/from16 v16, v3

    .line 322
    .line 323
    const/4 v15, 0x0

    .line 324
    :goto_5
    add-int/lit8 v3, v16, 0x1

    .line 325
    .line 326
    goto/16 :goto_0

    .line 327
    .line 328
    :cond_a
    const/4 v15, 0x0

    .line 329
    if-nez v4, :cond_b

    .line 330
    .line 331
    return-object v15

    .line 332
    :cond_b
    new-instance v0, Lie4;

    .line 333
    .line 334
    new-array v2, v1, [Lvd4;

    .line 335
    .line 336
    invoke-interface {v4, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v2

    .line 340
    check-cast v2, [Lvd4;

    .line 341
    .line 342
    invoke-direct {v0, v15, v1, v2}, Lie4;-><init>(Ljava/lang/String;Z[Lvd4;)V

    .line 343
    .line 344
    .line 345
    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ljj1;->q:I

    .line 3
    .line 4
    iput v0, p0, Ljj1;->t:I

    .line 5
    .line 6
    return-void
.end method

.method public final b(Lmf1;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-static {p1, v0, v1}, Lg82;->D(Lmf1;ZZ)Lgg1;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Lxm3;->i(Ljava/lang/Object;)Lsn3;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object v2, Lxm3;->g:Lvm3;

    .line 15
    .line 16
    sget-object v2, Lsn3;->j:Lsn3;

    .line 17
    .line 18
    :goto_0
    iput-object v2, p0, Ljj1;->p:Lsn3;

    .line 19
    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    return v0

    .line 23
    :cond_1
    return v1
.end method

.method public final c(Lmf1;Lpf1;)I
    .locals 34

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    :goto_0
    iget v2, v1, Ljj1;->q:I

    .line 6
    .line 7
    iget-object v5, v1, Ljj1;->i:Lkz2;

    .line 8
    .line 9
    iget-object v6, v1, Ljj1;->o:Lcf1;

    .line 10
    .line 11
    const v7, 0x73696478

    .line 12
    .line 13
    .line 14
    iget-object v8, v1, Ljj1;->l:Ljava/util/ArrayDeque;

    .line 15
    .line 16
    iget-object v9, v1, Ljj1;->d:Landroid/util/SparseArray;

    .line 17
    .line 18
    const/4 v10, 0x2

    .line 19
    iget-object v11, v1, Ljj1;->n:Lfw3;

    .line 20
    .line 21
    const/4 v12, 0x0

    .line 22
    const/4 v14, 0x1

    .line 23
    const/4 v15, 0x0

    .line 24
    if-eqz v2, :cond_3d

    .line 25
    .line 26
    iget-object v3, v1, Ljj1;->m:Ljava/util/ArrayDeque;

    .line 27
    .line 28
    if-eq v2, v14, :cond_32

    .line 29
    .line 30
    const-wide v6, 0x7fffffffffffffffL

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    if-eq v2, v10, :cond_2d

    .line 36
    .line 37
    iget-object v2, v1, Ljj1;->A:Lij1;

    .line 38
    .line 39
    if-nez v2, :cond_9

    .line 40
    .line 41
    invoke-virtual {v9}, Landroid/util/SparseArray;->size()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    move-wide/from16 v16, v6

    .line 46
    .line 47
    move-object v6, v12

    .line 48
    move v7, v15

    .line 49
    :goto_1
    if-ge v7, v2, :cond_4

    .line 50
    .line 51
    invoke-virtual {v9, v7}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v18

    .line 55
    move/from16 v19, v10

    .line 56
    .line 57
    move-object/from16 v10, v18

    .line 58
    .line 59
    check-cast v10, Lij1;

    .line 60
    .line 61
    iget-boolean v4, v10, Lij1;->m:Z

    .line 62
    .line 63
    iget-object v13, v10, Lij1;->b:Lsj1;

    .line 64
    .line 65
    if-nez v4, :cond_0

    .line 66
    .line 67
    iget v14, v10, Lij1;->f:I

    .line 68
    .line 69
    iget-object v8, v10, Lij1;->d:Ltj1;

    .line 70
    .line 71
    iget v8, v8, Ltj1;->b:I

    .line 72
    .line 73
    if-eq v14, v8, :cond_3

    .line 74
    .line 75
    :cond_0
    if-eqz v4, :cond_1

    .line 76
    .line 77
    iget v8, v10, Lij1;->h:I

    .line 78
    .line 79
    iget v14, v13, Lsj1;->d:I

    .line 80
    .line 81
    if-ne v8, v14, :cond_1

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_1
    if-nez v4, :cond_2

    .line 85
    .line 86
    iget-object v4, v10, Lij1;->d:Ltj1;

    .line 87
    .line 88
    iget-object v4, v4, Ltj1;->c:[J

    .line 89
    .line 90
    iget v8, v10, Lij1;->f:I

    .line 91
    .line 92
    aget-wide v13, v4, v8

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_2
    iget-object v4, v13, Lsj1;->f:[J

    .line 96
    .line 97
    iget v8, v10, Lij1;->h:I

    .line 98
    .line 99
    aget-wide v13, v4, v8

    .line 100
    .line 101
    :goto_2
    cmp-long v4, v13, v16

    .line 102
    .line 103
    if-gez v4, :cond_3

    .line 104
    .line 105
    move-object v6, v10

    .line 106
    move-wide/from16 v16, v13

    .line 107
    .line 108
    :cond_3
    :goto_3
    add-int/lit8 v7, v7, 0x1

    .line 109
    .line 110
    move/from16 v10, v19

    .line 111
    .line 112
    const/4 v14, 0x1

    .line 113
    goto :goto_1

    .line 114
    :cond_4
    move/from16 v19, v10

    .line 115
    .line 116
    if-nez v6, :cond_6

    .line 117
    .line 118
    iget-wide v2, v1, Ljj1;->v:J

    .line 119
    .line 120
    move-object v4, v0

    .line 121
    check-cast v4, Ldf1;

    .line 122
    .line 123
    iget-wide v4, v4, Ldf1;->i:J

    .line 124
    .line 125
    sub-long/2addr v2, v4

    .line 126
    long-to-int v2, v2

    .line 127
    if-ltz v2, :cond_5

    .line 128
    .line 129
    move-object v3, v0

    .line 130
    check-cast v3, Ldf1;

    .line 131
    .line 132
    invoke-virtual {v3, v2, v15}, Ldf1;->c(IZ)Z

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1}, Ljj1;->a()V

    .line 136
    .line 137
    .line 138
    goto/16 :goto_0

    .line 139
    .line 140
    :cond_5
    const-string v0, "Offset to end of mdat was negative."

    .line 141
    .line 142
    invoke-static {v12, v0}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    throw v0

    .line 147
    :cond_6
    iget-boolean v2, v6, Lij1;->m:Z

    .line 148
    .line 149
    if-nez v2, :cond_7

    .line 150
    .line 151
    iget-object v2, v6, Lij1;->d:Ltj1;

    .line 152
    .line 153
    iget-object v2, v2, Ltj1;->c:[J

    .line 154
    .line 155
    iget v4, v6, Lij1;->f:I

    .line 156
    .line 157
    aget-wide v7, v2, v4

    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_7
    iget-object v2, v6, Lij1;->b:Lsj1;

    .line 161
    .line 162
    iget-object v2, v2, Lsj1;->f:[J

    .line 163
    .line 164
    iget v4, v6, Lij1;->h:I

    .line 165
    .line 166
    aget-wide v7, v2, v4

    .line 167
    .line 168
    :goto_4
    move-object v2, v0

    .line 169
    check-cast v2, Ldf1;

    .line 170
    .line 171
    iget-wide v9, v2, Ldf1;->i:J

    .line 172
    .line 173
    sub-long/2addr v7, v9

    .line 174
    long-to-int v2, v7

    .line 175
    if-gez v2, :cond_8

    .line 176
    .line 177
    const-string v2, "Ignoring negative offset to sample data."

    .line 178
    .line 179
    invoke-static {v2}, La30;->x(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    move v2, v15

    .line 183
    :cond_8
    move-object v4, v0

    .line 184
    check-cast v4, Ldf1;

    .line 185
    .line 186
    invoke-virtual {v4, v2, v15}, Ldf1;->c(IZ)Z

    .line 187
    .line 188
    .line 189
    iput-object v6, v1, Ljj1;->A:Lij1;

    .line 190
    .line 191
    move-object v2, v6

    .line 192
    goto :goto_5

    .line 193
    :cond_9
    move/from16 v19, v10

    .line 194
    .line 195
    :goto_5
    iget-object v4, v2, Lij1;->b:Lsj1;

    .line 196
    .line 197
    iget v6, v1, Ljj1;->q:I

    .line 198
    .line 199
    const/4 v7, 0x6

    .line 200
    const-string v8, "video/hevc"

    .line 201
    .line 202
    const-string v9, "video/avc"

    .line 203
    .line 204
    const/4 v10, 0x4

    .line 205
    const/4 v13, 0x3

    .line 206
    if-ne v6, v13, :cond_13

    .line 207
    .line 208
    iget-boolean v6, v2, Lij1;->m:Z

    .line 209
    .line 210
    if-nez v6, :cond_a

    .line 211
    .line 212
    iget-object v6, v2, Lij1;->d:Ltj1;

    .line 213
    .line 214
    iget-object v6, v6, Ltj1;->d:[I

    .line 215
    .line 216
    iget v13, v2, Lij1;->f:I

    .line 217
    .line 218
    aget v6, v6, v13

    .line 219
    .line 220
    goto :goto_6

    .line 221
    :cond_a
    iget-object v6, v4, Lsj1;->h:[I

    .line 222
    .line 223
    iget v13, v2, Lij1;->f:I

    .line 224
    .line 225
    aget v6, v6, v13

    .line 226
    .line 227
    :goto_6
    iput v6, v1, Ljj1;->B:I

    .line 228
    .line 229
    iget-object v6, v2, Lij1;->d:Ltj1;

    .line 230
    .line 231
    iget-object v6, v6, Ltj1;->a:Lqj1;

    .line 232
    .line 233
    iget-object v6, v6, Lqj1;->g:Lph4;

    .line 234
    .line 235
    iget-object v6, v6, Lph4;->m:Ljava/lang/String;

    .line 236
    .line 237
    invoke-static {v6, v9}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v13

    .line 241
    if-nez v13, :cond_b

    .line 242
    .line 243
    invoke-static {v6, v8}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    :cond_b
    const/4 v6, 0x1

    .line 247
    iput-boolean v6, v1, Ljj1;->E:Z

    .line 248
    .line 249
    iget v6, v2, Lij1;->f:I

    .line 250
    .line 251
    iget v13, v2, Lij1;->i:I

    .line 252
    .line 253
    if-ge v6, v13, :cond_10

    .line 254
    .line 255
    iget v3, v1, Ljj1;->B:I

    .line 256
    .line 257
    check-cast v0, Ldf1;

    .line 258
    .line 259
    invoke-virtual {v0, v3, v15}, Ldf1;->c(IZ)Z

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2}, Lij1;->e()Lrj1;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    if-nez v0, :cond_c

    .line 267
    .line 268
    goto :goto_7

    .line 269
    :cond_c
    iget-object v3, v4, Lsj1;->n:Lkz2;

    .line 270
    .line 271
    iget v0, v0, Lrj1;->d:I

    .line 272
    .line 273
    if-eqz v0, :cond_d

    .line 274
    .line 275
    invoke-virtual {v3, v0}, Lkz2;->G(I)V

    .line 276
    .line 277
    .line 278
    :cond_d
    iget v0, v2, Lij1;->f:I

    .line 279
    .line 280
    iget-boolean v5, v4, Lsj1;->k:Z

    .line 281
    .line 282
    if-eqz v5, :cond_e

    .line 283
    .line 284
    iget-object v4, v4, Lsj1;->l:[Z

    .line 285
    .line 286
    aget-boolean v0, v4, v0

    .line 287
    .line 288
    if-eqz v0, :cond_e

    .line 289
    .line 290
    invoke-virtual {v3}, Lkz2;->L()I

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    mul-int/2addr v0, v7

    .line 295
    invoke-virtual {v3, v0}, Lkz2;->G(I)V

    .line 296
    .line 297
    .line 298
    :cond_e
    :goto_7
    invoke-virtual {v2}, Lij1;->c()Z

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    if-nez v0, :cond_f

    .line 303
    .line 304
    iput-object v12, v1, Ljj1;->A:Lij1;

    .line 305
    .line 306
    :cond_f
    :goto_8
    const/4 v13, 0x3

    .line 307
    goto/16 :goto_1c

    .line 308
    .line 309
    :cond_10
    iget-object v6, v2, Lij1;->d:Ltj1;

    .line 310
    .line 311
    iget-object v6, v6, Ltj1;->a:Lqj1;

    .line 312
    .line 313
    iget v6, v6, Lqj1;->h:I

    .line 314
    .line 315
    const/4 v13, 0x1

    .line 316
    if-ne v6, v13, :cond_11

    .line 317
    .line 318
    iget v6, v1, Ljj1;->B:I

    .line 319
    .line 320
    add-int/lit8 v6, v6, -0x8

    .line 321
    .line 322
    iput v6, v1, Ljj1;->B:I

    .line 323
    .line 324
    move-object v6, v0

    .line 325
    check-cast v6, Ldf1;

    .line 326
    .line 327
    const/16 v13, 0x8

    .line 328
    .line 329
    invoke-virtual {v6, v13, v15}, Ldf1;->c(IZ)Z

    .line 330
    .line 331
    .line 332
    :cond_11
    iget-object v6, v2, Lij1;->d:Ltj1;

    .line 333
    .line 334
    iget-object v6, v6, Ltj1;->a:Lqj1;

    .line 335
    .line 336
    iget-object v6, v6, Lqj1;->g:Lph4;

    .line 337
    .line 338
    const-string v13, "audio/ac4"

    .line 339
    .line 340
    iget-object v6, v6, Lph4;->m:Ljava/lang/String;

    .line 341
    .line 342
    invoke-virtual {v13, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    move-result v6

    .line 346
    if-eqz v6, :cond_12

    .line 347
    .line 348
    iget v6, v1, Ljj1;->B:I

    .line 349
    .line 350
    const/4 v13, 0x7

    .line 351
    invoke-virtual {v2, v6, v13}, Lij1;->d(II)I

    .line 352
    .line 353
    .line 354
    move-result v6

    .line 355
    iput v6, v1, Ljj1;->C:I

    .line 356
    .line 357
    iget v6, v1, Ljj1;->B:I

    .line 358
    .line 359
    invoke-static {v6, v5}, Lzt0;->P(ILkz2;)V

    .line 360
    .line 361
    .line 362
    iget-object v6, v2, Lij1;->a:Ljg1;

    .line 363
    .line 364
    invoke-interface {v6, v5, v13, v15}, Ljg1;->a(Lkz2;II)V

    .line 365
    .line 366
    .line 367
    iget v5, v1, Ljj1;->C:I

    .line 368
    .line 369
    add-int/2addr v5, v13

    .line 370
    iput v5, v1, Ljj1;->C:I

    .line 371
    .line 372
    goto :goto_9

    .line 373
    :cond_12
    iget v5, v1, Ljj1;->B:I

    .line 374
    .line 375
    invoke-virtual {v2, v5, v15}, Lij1;->d(II)I

    .line 376
    .line 377
    .line 378
    move-result v5

    .line 379
    iput v5, v1, Ljj1;->C:I

    .line 380
    .line 381
    :goto_9
    iget v6, v1, Ljj1;->B:I

    .line 382
    .line 383
    add-int/2addr v6, v5

    .line 384
    iput v6, v1, Ljj1;->B:I

    .line 385
    .line 386
    iput v10, v1, Ljj1;->q:I

    .line 387
    .line 388
    iput v15, v1, Ljj1;->D:I

    .line 389
    .line 390
    :cond_13
    iget-object v5, v2, Lij1;->d:Ltj1;

    .line 391
    .line 392
    iget-object v6, v5, Ltj1;->a:Lqj1;

    .line 393
    .line 394
    iget-object v13, v2, Lij1;->a:Ljg1;

    .line 395
    .line 396
    iget-boolean v14, v2, Lij1;->m:Z

    .line 397
    .line 398
    if-nez v14, :cond_14

    .line 399
    .line 400
    iget-object v4, v5, Ltj1;->f:[J

    .line 401
    .line 402
    iget v5, v2, Lij1;->f:I

    .line 403
    .line 404
    aget-wide v16, v4, v5

    .line 405
    .line 406
    :goto_a
    move-wide/from16 v4, v16

    .line 407
    .line 408
    goto :goto_b

    .line 409
    :cond_14
    iget v5, v2, Lij1;->f:I

    .line 410
    .line 411
    iget-object v4, v4, Lsj1;->i:[J

    .line 412
    .line 413
    aget-wide v16, v4, v5

    .line 414
    .line 415
    goto :goto_a

    .line 416
    :goto_b
    iget v14, v6, Lqj1;->k:I

    .line 417
    .line 418
    iget-object v6, v6, Lqj1;->g:Lph4;

    .line 419
    .line 420
    iget-object v12, v6, Lph4;->j:Ljava/lang/String;

    .line 421
    .line 422
    if-nez v14, :cond_17

    .line 423
    .line 424
    :goto_c
    iget v6, v1, Ljj1;->C:I

    .line 425
    .line 426
    iget v7, v1, Ljj1;->B:I

    .line 427
    .line 428
    if-ge v6, v7, :cond_15

    .line 429
    .line 430
    sub-int/2addr v7, v6

    .line 431
    invoke-interface {v13, v0, v7, v15}, Ljg1;->b(Lua4;IZ)I

    .line 432
    .line 433
    .line 434
    move-result v6

    .line 435
    iget v7, v1, Ljj1;->C:I

    .line 436
    .line 437
    add-int/2addr v7, v6

    .line 438
    iput v7, v1, Ljj1;->C:I

    .line 439
    .line 440
    goto :goto_c

    .line 441
    :cond_15
    move-object/from16 v20, v2

    .line 442
    .line 443
    :cond_16
    move-object/from16 v31, v3

    .line 444
    .line 445
    goto/16 :goto_19

    .line 446
    .line 447
    :cond_17
    iget-object v7, v1, Ljj1;->f:Lkz2;

    .line 448
    .line 449
    iget-object v10, v7, Lkz2;->a:[B

    .line 450
    .line 451
    aput-byte v15, v10, v15

    .line 452
    .line 453
    const/16 v21, 0x1

    .line 454
    .line 455
    aput-byte v15, v10, v21

    .line 456
    .line 457
    aput-byte v15, v10, v19

    .line 458
    .line 459
    rsub-int/lit8 v15, v14, 0x4

    .line 460
    .line 461
    move-object/from16 v20, v2

    .line 462
    .line 463
    :goto_d
    iget v2, v1, Ljj1;->C:I

    .line 464
    .line 465
    move/from16 v23, v14

    .line 466
    .line 467
    iget v14, v1, Ljj1;->B:I

    .line 468
    .line 469
    if-ge v2, v14, :cond_16

    .line 470
    .line 471
    iget v2, v1, Ljj1;->D:I

    .line 472
    .line 473
    if-nez v2, :cond_23

    .line 474
    .line 475
    iget-object v2, v1, Ljj1;->I:[Ljg1;

    .line 476
    .line 477
    array-length v2, v2

    .line 478
    if-gtz v2, :cond_19

    .line 479
    .line 480
    iget-boolean v2, v1, Ljj1;->E:Z

    .line 481
    .line 482
    if-nez v2, :cond_18

    .line 483
    .line 484
    goto :goto_f

    .line 485
    :cond_18
    :goto_e
    const/4 v2, 0x0

    .line 486
    goto :goto_10

    .line 487
    :cond_19
    :goto_f
    invoke-static {v6}, Lwl2;->H(Lph4;)I

    .line 488
    .line 489
    .line 490
    move-result v2

    .line 491
    add-int v14, v23, v2

    .line 492
    .line 493
    move/from16 v19, v2

    .line 494
    .line 495
    iget v2, v1, Ljj1;->B:I

    .line 496
    .line 497
    move/from16 v24, v2

    .line 498
    .line 499
    iget v2, v1, Ljj1;->C:I

    .line 500
    .line 501
    sub-int v2, v24, v2

    .line 502
    .line 503
    if-le v14, v2, :cond_1a

    .line 504
    .line 505
    goto :goto_e

    .line 506
    :cond_1a
    move/from16 v2, v19

    .line 507
    .line 508
    :goto_10
    add-int v14, v23, v2

    .line 509
    .line 510
    move-object/from16 v31, v3

    .line 511
    .line 512
    move-object v3, v0

    .line 513
    check-cast v3, Ldf1;

    .line 514
    .line 515
    const/4 v0, 0x0

    .line 516
    invoke-virtual {v3, v10, v15, v14, v0}, Ldf1;->w([BIIZ)Z

    .line 517
    .line 518
    .line 519
    invoke-virtual {v7, v0}, Lkz2;->E(I)V

    .line 520
    .line 521
    .line 522
    invoke-virtual {v7}, Lkz2;->b()I

    .line 523
    .line 524
    .line 525
    move-result v3

    .line 526
    if-ltz v3, :cond_22

    .line 527
    .line 528
    sub-int/2addr v3, v2

    .line 529
    iput v3, v1, Ljj1;->D:I

    .line 530
    .line 531
    iget-object v3, v1, Ljj1;->e:Lkz2;

    .line 532
    .line 533
    invoke-virtual {v3, v0}, Lkz2;->E(I)V

    .line 534
    .line 535
    .line 536
    const/4 v14, 0x4

    .line 537
    invoke-interface {v13, v3, v14, v0}, Ljg1;->a(Lkz2;II)V

    .line 538
    .line 539
    .line 540
    iget v0, v1, Ljj1;->C:I

    .line 541
    .line 542
    add-int/2addr v0, v14

    .line 543
    iput v0, v1, Ljj1;->C:I

    .line 544
    .line 545
    iget v0, v1, Ljj1;->B:I

    .line 546
    .line 547
    add-int/2addr v0, v15

    .line 548
    iput v0, v1, Ljj1;->B:I

    .line 549
    .line 550
    iget-object v0, v1, Ljj1;->I:[Ljg1;

    .line 551
    .line 552
    array-length v0, v0

    .line 553
    if-lez v0, :cond_20

    .line 554
    .line 555
    if-lez v2, :cond_20

    .line 556
    .line 557
    aget-byte v0, v10, v14

    .line 558
    .line 559
    iget-object v3, v6, Lph4;->m:Ljava/lang/String;

    .line 560
    .line 561
    invoke-static {v3, v9}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 562
    .line 563
    .line 564
    move-result v14

    .line 565
    if-nez v14, :cond_1c

    .line 566
    .line 567
    invoke-static {v12, v9}, Lpp1;->e(Ljava/lang/String;Ljava/lang/String;)Z

    .line 568
    .line 569
    .line 570
    move-result v14

    .line 571
    if-eqz v14, :cond_1b

    .line 572
    .line 573
    goto :goto_11

    .line 574
    :cond_1b
    move/from16 v19, v0

    .line 575
    .line 576
    const/4 v0, 0x6

    .line 577
    goto :goto_12

    .line 578
    :cond_1c
    :goto_11
    and-int/lit8 v14, v0, 0x1f

    .line 579
    .line 580
    move/from16 v19, v0

    .line 581
    .line 582
    const/4 v0, 0x6

    .line 583
    if-eq v14, v0, :cond_1f

    .line 584
    .line 585
    :goto_12
    invoke-static {v3, v8}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 586
    .line 587
    .line 588
    move-result v3

    .line 589
    if-nez v3, :cond_1e

    .line 590
    .line 591
    invoke-static {v12, v8}, Lpp1;->e(Ljava/lang/String;Ljava/lang/String;)Z

    .line 592
    .line 593
    .line 594
    move-result v3

    .line 595
    if-eqz v3, :cond_1d

    .line 596
    .line 597
    goto :goto_14

    .line 598
    :cond_1d
    :goto_13
    const/4 v3, 0x0

    .line 599
    goto :goto_15

    .line 600
    :cond_1e
    :goto_14
    and-int/lit8 v3, v19, 0x7e

    .line 601
    .line 602
    const/16 v21, 0x1

    .line 603
    .line 604
    shr-int/lit8 v3, v3, 0x1

    .line 605
    .line 606
    const/16 v14, 0x27

    .line 607
    .line 608
    if-ne v3, v14, :cond_1d

    .line 609
    .line 610
    :cond_1f
    const/4 v3, 0x1

    .line 611
    goto :goto_15

    .line 612
    :cond_20
    const/4 v0, 0x6

    .line 613
    goto :goto_13

    .line 614
    :goto_15
    iput-boolean v3, v1, Ljj1;->F:Z

    .line 615
    .line 616
    const/4 v3, 0x0

    .line 617
    invoke-interface {v13, v7, v2, v3}, Ljg1;->a(Lkz2;II)V

    .line 618
    .line 619
    .line 620
    iget v3, v1, Ljj1;->C:I

    .line 621
    .line 622
    add-int/2addr v3, v2

    .line 623
    iput v3, v1, Ljj1;->C:I

    .line 624
    .line 625
    if-lez v2, :cond_21

    .line 626
    .line 627
    iget-boolean v3, v1, Ljj1;->E:Z

    .line 628
    .line 629
    if-nez v3, :cond_21

    .line 630
    .line 631
    invoke-static {v10, v2, v6}, Lwl2;->M([BILph4;)Z

    .line 632
    .line 633
    .line 634
    move-result v2

    .line 635
    if-eqz v2, :cond_21

    .line 636
    .line 637
    const/4 v2, 0x1

    .line 638
    iput-boolean v2, v1, Ljj1;->E:Z

    .line 639
    .line 640
    :cond_21
    move-object/from16 v0, p1

    .line 641
    .line 642
    move/from16 v14, v23

    .line 643
    .line 644
    :goto_16
    move-object/from16 v3, v31

    .line 645
    .line 646
    goto/16 :goto_d

    .line 647
    .line 648
    :cond_22
    const-string v0, "Invalid NAL length"

    .line 649
    .line 650
    const/4 v2, 0x0

    .line 651
    invoke-static {v2, v0}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 652
    .line 653
    .line 654
    move-result-object v0

    .line 655
    throw v0

    .line 656
    :cond_23
    move-object/from16 v31, v3

    .line 657
    .line 658
    const/4 v0, 0x6

    .line 659
    iget-boolean v3, v1, Ljj1;->F:Z

    .line 660
    .line 661
    if-eqz v3, :cond_27

    .line 662
    .line 663
    iget-object v3, v1, Ljj1;->g:Lkz2;

    .line 664
    .line 665
    invoke-virtual {v3, v2}, Lkz2;->y(I)V

    .line 666
    .line 667
    .line 668
    iget-object v2, v3, Lkz2;->a:[B

    .line 669
    .line 670
    iget v14, v1, Ljj1;->D:I

    .line 671
    .line 672
    move-object/from16 v0, p1

    .line 673
    .line 674
    check-cast v0, Ldf1;

    .line 675
    .line 676
    move-object/from16 v24, v7

    .line 677
    .line 678
    const/4 v7, 0x0

    .line 679
    invoke-virtual {v0, v2, v7, v14, v7}, Ldf1;->w([BIIZ)Z

    .line 680
    .line 681
    .line 682
    iget v0, v1, Ljj1;->D:I

    .line 683
    .line 684
    invoke-interface {v13, v3, v0, v7}, Ljg1;->a(Lkz2;II)V

    .line 685
    .line 686
    .line 687
    iget v0, v1, Ljj1;->D:I

    .line 688
    .line 689
    iget-object v2, v3, Lkz2;->a:[B

    .line 690
    .line 691
    iget v14, v3, Lkz2;->c:I

    .line 692
    .line 693
    invoke-static {v14, v2}, Lwl2;->z(I[B)I

    .line 694
    .line 695
    .line 696
    move-result v2

    .line 697
    invoke-virtual {v3, v7}, Lkz2;->E(I)V

    .line 698
    .line 699
    .line 700
    invoke-virtual {v3, v2}, Lkz2;->C(I)V

    .line 701
    .line 702
    .line 703
    iget v2, v6, Lph4;->o:I

    .line 704
    .line 705
    const/4 v14, -0x1

    .line 706
    if-ne v2, v14, :cond_24

    .line 707
    .line 708
    iget v2, v11, Lfw3;->f:I

    .line 709
    .line 710
    if-eqz v2, :cond_25

    .line 711
    .line 712
    invoke-virtual {v11, v7}, Lfw3;->w(I)V

    .line 713
    .line 714
    .line 715
    goto :goto_17

    .line 716
    :cond_24
    iget v7, v11, Lfw3;->f:I

    .line 717
    .line 718
    if-eq v7, v2, :cond_25

    .line 719
    .line 720
    invoke-virtual {v11, v2}, Lfw3;->w(I)V

    .line 721
    .line 722
    .line 723
    :cond_25
    :goto_17
    invoke-virtual {v11, v4, v5, v3}, Lfw3;->x(JLkz2;)V

    .line 724
    .line 725
    .line 726
    invoke-virtual/range {v20 .. v20}, Lij1;->b()I

    .line 727
    .line 728
    .line 729
    move-result v2

    .line 730
    const/16 v16, 0x4

    .line 731
    .line 732
    and-int/lit8 v2, v2, 0x4

    .line 733
    .line 734
    const/4 v3, 0x0

    .line 735
    if-eqz v2, :cond_26

    .line 736
    .line 737
    invoke-virtual {v11, v3}, Lfw3;->y(I)V

    .line 738
    .line 739
    .line 740
    :cond_26
    move v2, v0

    .line 741
    move-object/from16 v0, p1

    .line 742
    .line 743
    goto :goto_18

    .line 744
    :cond_27
    move-object/from16 v0, p1

    .line 745
    .line 746
    move-object/from16 v24, v7

    .line 747
    .line 748
    const/4 v3, 0x0

    .line 749
    const/16 v16, 0x4

    .line 750
    .line 751
    invoke-interface {v13, v0, v2, v3}, Ljg1;->b(Lua4;IZ)I

    .line 752
    .line 753
    .line 754
    move-result v2

    .line 755
    :goto_18
    iget v3, v1, Ljj1;->C:I

    .line 756
    .line 757
    add-int/2addr v3, v2

    .line 758
    iput v3, v1, Ljj1;->C:I

    .line 759
    .line 760
    iget v3, v1, Ljj1;->D:I

    .line 761
    .line 762
    sub-int/2addr v3, v2

    .line 763
    iput v3, v1, Ljj1;->D:I

    .line 764
    .line 765
    move/from16 v14, v23

    .line 766
    .line 767
    move-object/from16 v7, v24

    .line 768
    .line 769
    goto :goto_16

    .line 770
    :goto_19
    invoke-virtual/range {v20 .. v20}, Lij1;->b()I

    .line 771
    .line 772
    .line 773
    move-result v0

    .line 774
    iget-boolean v2, v1, Ljj1;->E:Z

    .line 775
    .line 776
    if-nez v2, :cond_28

    .line 777
    .line 778
    const/high16 v2, 0x4000000

    .line 779
    .line 780
    or-int/2addr v0, v2

    .line 781
    :cond_28
    move/from16 v26, v0

    .line 782
    .line 783
    invoke-virtual/range {v20 .. v20}, Lij1;->e()Lrj1;

    .line 784
    .line 785
    .line 786
    move-result-object v0

    .line 787
    if-eqz v0, :cond_29

    .line 788
    .line 789
    iget-object v0, v0, Lrj1;->c:Lig1;

    .line 790
    .line 791
    move-object/from16 v29, v0

    .line 792
    .line 793
    goto :goto_1a

    .line 794
    :cond_29
    const/16 v29, 0x0

    .line 795
    .line 796
    :goto_1a
    iget v0, v1, Ljj1;->B:I

    .line 797
    .line 798
    const/16 v28, 0x0

    .line 799
    .line 800
    move/from16 v27, v0

    .line 801
    .line 802
    move-wide/from16 v24, v4

    .line 803
    .line 804
    move-object/from16 v23, v13

    .line 805
    .line 806
    invoke-interface/range {v23 .. v29}, Ljg1;->c(JIIILig1;)V

    .line 807
    .line 808
    .line 809
    :cond_2a
    invoke-virtual/range {v31 .. v31}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 810
    .line 811
    .line 812
    move-result v0

    .line 813
    if-nez v0, :cond_2c

    .line 814
    .line 815
    invoke-virtual/range {v31 .. v31}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 816
    .line 817
    .line 818
    move-result-object v0

    .line 819
    check-cast v0, Lhj1;

    .line 820
    .line 821
    iget v2, v1, Ljj1;->w:I

    .line 822
    .line 823
    iget v7, v0, Lhj1;->c:I

    .line 824
    .line 825
    sub-int/2addr v2, v7

    .line 826
    iput v2, v1, Ljj1;->w:I

    .line 827
    .line 828
    iget-wide v2, v0, Lhj1;->a:J

    .line 829
    .line 830
    iget-boolean v0, v0, Lhj1;->b:Z

    .line 831
    .line 832
    if-eqz v0, :cond_2b

    .line 833
    .line 834
    add-long v2, v2, v24

    .line 835
    .line 836
    :cond_2b
    move-wide v4, v2

    .line 837
    iget-object v0, v1, Ljj1;->H:[Ljg1;

    .line 838
    .line 839
    array-length v2, v0

    .line 840
    const/4 v10, 0x0

    .line 841
    :goto_1b
    if-ge v10, v2, :cond_2a

    .line 842
    .line 843
    aget-object v3, v0, v10

    .line 844
    .line 845
    iget v8, v1, Ljj1;->w:I

    .line 846
    .line 847
    const/4 v9, 0x0

    .line 848
    const/4 v6, 0x1

    .line 849
    invoke-interface/range {v3 .. v9}, Ljg1;->c(JIIILig1;)V

    .line 850
    .line 851
    .line 852
    add-int/lit8 v10, v10, 0x1

    .line 853
    .line 854
    goto :goto_1b

    .line 855
    :cond_2c
    invoke-virtual/range {v20 .. v20}, Lij1;->c()Z

    .line 856
    .line 857
    .line 858
    move-result v0

    .line 859
    if-nez v0, :cond_f

    .line 860
    .line 861
    const/4 v2, 0x0

    .line 862
    iput-object v2, v1, Ljj1;->A:Lij1;

    .line 863
    .line 864
    goto/16 :goto_8

    .line 865
    .line 866
    :goto_1c
    iput v13, v1, Ljj1;->q:I

    .line 867
    .line 868
    const/16 v30, 0x0

    .line 869
    .line 870
    return v30

    .line 871
    :cond_2d
    invoke-virtual {v9}, Landroid/util/SparseArray;->size()I

    .line 872
    .line 873
    .line 874
    move-result v2

    .line 875
    const/4 v3, 0x0

    .line 876
    const/4 v4, 0x0

    .line 877
    :goto_1d
    if-ge v4, v2, :cond_2f

    .line 878
    .line 879
    invoke-virtual {v9, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 880
    .line 881
    .line 882
    move-result-object v5

    .line 883
    check-cast v5, Lij1;

    .line 884
    .line 885
    iget-object v5, v5, Lij1;->b:Lsj1;

    .line 886
    .line 887
    iget-boolean v8, v5, Lsj1;->o:Z

    .line 888
    .line 889
    if-eqz v8, :cond_2e

    .line 890
    .line 891
    iget-wide v10, v5, Lsj1;->c:J

    .line 892
    .line 893
    cmp-long v5, v10, v6

    .line 894
    .line 895
    if-gez v5, :cond_2e

    .line 896
    .line 897
    invoke-virtual {v9, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 898
    .line 899
    .line 900
    move-result-object v3

    .line 901
    check-cast v3, Lij1;

    .line 902
    .line 903
    move-wide v6, v10

    .line 904
    :cond_2e
    add-int/lit8 v4, v4, 0x1

    .line 905
    .line 906
    goto :goto_1d

    .line 907
    :cond_2f
    if-nez v3, :cond_30

    .line 908
    .line 909
    const/4 v13, 0x3

    .line 910
    iput v13, v1, Ljj1;->q:I

    .line 911
    .line 912
    goto/16 :goto_0

    .line 913
    .line 914
    :cond_30
    move-object v2, v0

    .line 915
    check-cast v2, Ldf1;

    .line 916
    .line 917
    iget-wide v4, v2, Ldf1;->i:J

    .line 918
    .line 919
    sub-long/2addr v6, v4

    .line 920
    long-to-int v2, v6

    .line 921
    if-ltz v2, :cond_31

    .line 922
    .line 923
    move-object v4, v0

    .line 924
    check-cast v4, Ldf1;

    .line 925
    .line 926
    const/4 v7, 0x0

    .line 927
    invoke-virtual {v4, v2, v7}, Ldf1;->c(IZ)Z

    .line 928
    .line 929
    .line 930
    iget-object v2, v3, Lij1;->b:Lsj1;

    .line 931
    .line 932
    iget-object v3, v2, Lsj1;->n:Lkz2;

    .line 933
    .line 934
    iget-object v5, v3, Lkz2;->a:[B

    .line 935
    .line 936
    iget v6, v3, Lkz2;->c:I

    .line 937
    .line 938
    invoke-virtual {v4, v5, v7, v6, v7}, Ldf1;->w([BIIZ)Z

    .line 939
    .line 940
    .line 941
    invoke-virtual {v3, v7}, Lkz2;->E(I)V

    .line 942
    .line 943
    .line 944
    iput-boolean v7, v2, Lsj1;->o:Z

    .line 945
    .line 946
    goto/16 :goto_0

    .line 947
    .line 948
    :cond_31
    const-string v0, "Offset to encryption data was negative."

    .line 949
    .line 950
    const/4 v2, 0x0

    .line 951
    invoke-static {v2, v0}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 952
    .line 953
    .line 954
    move-result-object v0

    .line 955
    throw v0

    .line 956
    :cond_32
    move-object/from16 v31, v3

    .line 957
    .line 958
    iget-wide v2, v1, Ljj1;->s:J

    .line 959
    .line 960
    iget v4, v1, Ljj1;->t:I

    .line 961
    .line 962
    int-to-long v4, v4

    .line 963
    sub-long/2addr v2, v4

    .line 964
    iget-object v4, v1, Ljj1;->u:Lkz2;

    .line 965
    .line 966
    long-to-int v2, v2

    .line 967
    if-eqz v4, :cond_3b

    .line 968
    .line 969
    iget-object v3, v4, Lkz2;->a:[B

    .line 970
    .line 971
    move-object v5, v0

    .line 972
    check-cast v5, Ldf1;

    .line 973
    .line 974
    const/4 v9, 0x0

    .line 975
    const/16 v13, 0x8

    .line 976
    .line 977
    invoke-virtual {v5, v3, v13, v2, v9}, Ldf1;->w([BIIZ)Z

    .line 978
    .line 979
    .line 980
    new-instance v2, Lp43;

    .line 981
    .line 982
    iget v3, v1, Ljj1;->r:I

    .line 983
    .line 984
    invoke-direct {v2, v3, v4}, Lp43;-><init>(ILkz2;)V

    .line 985
    .line 986
    .line 987
    invoke-virtual {v8}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 988
    .line 989
    .line 990
    move-result v5

    .line 991
    if-nez v5, :cond_33

    .line 992
    .line 993
    invoke-virtual {v8}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 994
    .line 995
    .line 996
    move-result-object v3

    .line 997
    check-cast v3, Lm43;

    .line 998
    .line 999
    iget-object v3, v3, Lm43;->d:Ljava/util/ArrayList;

    .line 1000
    .line 1001
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1002
    .line 1003
    .line 1004
    goto/16 :goto_22

    .line 1005
    .line 1006
    :cond_33
    if-ne v3, v7, :cond_34

    .line 1007
    .line 1008
    move-object v2, v0

    .line 1009
    check-cast v2, Ldf1;

    .line 1010
    .line 1011
    iget-wide v2, v2, Ldf1;->i:J

    .line 1012
    .line 1013
    invoke-static {v2, v3, v4}, Ljj1;->j(JLkz2;)Landroid/util/Pair;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v2

    .line 1017
    iget-object v3, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 1018
    .line 1019
    check-cast v3, Lbf1;

    .line 1020
    .line 1021
    invoke-virtual {v6, v3}, Lcf1;->b(Lbf1;)V

    .line 1022
    .line 1023
    .line 1024
    iget-boolean v3, v1, Ljj1;->J:Z

    .line 1025
    .line 1026
    if-nez v3, :cond_3c

    .line 1027
    .line 1028
    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 1029
    .line 1030
    check-cast v3, Ljava/lang/Long;

    .line 1031
    .line 1032
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 1033
    .line 1034
    .line 1035
    move-result-wide v3

    .line 1036
    iput-wide v3, v1, Ljj1;->z:J

    .line 1037
    .line 1038
    iget-object v3, v1, Ljj1;->G:Lnf1;

    .line 1039
    .line 1040
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 1041
    .line 1042
    check-cast v2, Lcg1;

    .line 1043
    .line 1044
    invoke-interface {v3, v2}, Lnf1;->v(Lcg1;)V

    .line 1045
    .line 1046
    .line 1047
    const/4 v13, 0x1

    .line 1048
    iput-boolean v13, v1, Ljj1;->J:Z

    .line 1049
    .line 1050
    goto/16 :goto_22

    .line 1051
    .line 1052
    :cond_34
    const v2, 0x656d7367

    .line 1053
    .line 1054
    .line 1055
    if-ne v3, v2, :cond_3c

    .line 1056
    .line 1057
    iget-object v2, v1, Ljj1;->H:[Ljg1;

    .line 1058
    .line 1059
    array-length v2, v2

    .line 1060
    if-eqz v2, :cond_3c

    .line 1061
    .line 1062
    const/16 v13, 0x8

    .line 1063
    .line 1064
    invoke-virtual {v4, v13}, Lkz2;->E(I)V

    .line 1065
    .line 1066
    .line 1067
    invoke-virtual {v4}, Lkz2;->b()I

    .line 1068
    .line 1069
    .line 1070
    move-result v2

    .line 1071
    invoke-static {v2}, Lej1;->a(I)I

    .line 1072
    .line 1073
    .line 1074
    move-result v2

    .line 1075
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    if-eqz v2, :cond_36

    .line 1081
    .line 1082
    const/4 v13, 0x1

    .line 1083
    if-eq v2, v13, :cond_35

    .line 1084
    .line 1085
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v3

    .line 1089
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 1090
    .line 1091
    .line 1092
    move-result v3

    .line 1093
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1094
    .line 1095
    add-int/lit8 v3, v3, 0x23

    .line 1096
    .line 1097
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1098
    .line 1099
    .line 1100
    const-string v3, "Skipping unsupported emsg version: "

    .line 1101
    .line 1102
    invoke-static {v4, v2, v3}, Lga1;->q(Ljava/lang/StringBuilder;ILjava/lang/String;)V

    .line 1103
    .line 1104
    .line 1105
    goto/16 :goto_22

    .line 1106
    .line 1107
    :cond_35
    invoke-virtual {v4}, Lkz2;->P()J

    .line 1108
    .line 1109
    .line 1110
    move-result-wide v11

    .line 1111
    invoke-virtual {v4}, Lkz2;->j()J

    .line 1112
    .line 1113
    .line 1114
    move-result-wide v7

    .line 1115
    sget-object v13, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1116
    .line 1117
    const-wide/32 v9, 0xf4240

    .line 1118
    .line 1119
    .line 1120
    invoke-static/range {v7 .. v13}, Lv23;->t(JJJLjava/math/RoundingMode;)J

    .line 1121
    .line 1122
    .line 1123
    move-result-wide v2

    .line 1124
    invoke-virtual {v4}, Lkz2;->P()J

    .line 1125
    .line 1126
    .line 1127
    move-result-wide v7

    .line 1128
    const-wide/16 v9, 0x3e8

    .line 1129
    .line 1130
    invoke-static/range {v7 .. v13}, Lv23;->t(JJJLjava/math/RoundingMode;)J

    .line 1131
    .line 1132
    .line 1133
    move-result-wide v7

    .line 1134
    invoke-virtual {v4}, Lkz2;->P()J

    .line 1135
    .line 1136
    .line 1137
    move-result-wide v9

    .line 1138
    invoke-virtual {v4}, Lkz2;->m()Ljava/lang/String;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v11

    .line 1142
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1143
    .line 1144
    .line 1145
    invoke-virtual {v4}, Lkz2;->m()Ljava/lang/String;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v12

    .line 1149
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1150
    .line 1151
    .line 1152
    move-wide v13, v9

    .line 1153
    move-wide v9, v7

    .line 1154
    move-wide v7, v5

    .line 1155
    goto :goto_1f

    .line 1156
    :cond_36
    invoke-virtual {v4}, Lkz2;->m()Ljava/lang/String;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v11

    .line 1160
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1161
    .line 1162
    .line 1163
    invoke-virtual {v4}, Lkz2;->m()Ljava/lang/String;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v12

    .line 1167
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1168
    .line 1169
    .line 1170
    invoke-virtual {v4}, Lkz2;->P()J

    .line 1171
    .line 1172
    .line 1173
    move-result-wide v17

    .line 1174
    invoke-virtual {v4}, Lkz2;->P()J

    .line 1175
    .line 1176
    .line 1177
    move-result-wide v13

    .line 1178
    sget-object v19, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1179
    .line 1180
    const-wide/32 v15, 0xf4240

    .line 1181
    .line 1182
    .line 1183
    invoke-static/range {v13 .. v19}, Lv23;->t(JJJLjava/math/RoundingMode;)J

    .line 1184
    .line 1185
    .line 1186
    move-result-wide v2

    .line 1187
    iget-wide v7, v1, Ljj1;->z:J

    .line 1188
    .line 1189
    cmp-long v9, v7, v5

    .line 1190
    .line 1191
    if-eqz v9, :cond_37

    .line 1192
    .line 1193
    add-long/2addr v7, v2

    .line 1194
    goto :goto_1e

    .line 1195
    :cond_37
    move-wide v7, v5

    .line 1196
    :goto_1e
    invoke-virtual {v4}, Lkz2;->P()J

    .line 1197
    .line 1198
    .line 1199
    move-result-wide v13

    .line 1200
    const-wide/16 v15, 0x3e8

    .line 1201
    .line 1202
    invoke-static/range {v13 .. v19}, Lv23;->t(JJJLjava/math/RoundingMode;)J

    .line 1203
    .line 1204
    .line 1205
    move-result-wide v9

    .line 1206
    invoke-virtual {v4}, Lkz2;->P()J

    .line 1207
    .line 1208
    .line 1209
    move-result-wide v13

    .line 1210
    move-wide/from16 v32, v7

    .line 1211
    .line 1212
    move-wide v7, v2

    .line 1213
    move-wide/from16 v2, v32

    .line 1214
    .line 1215
    :goto_1f
    invoke-virtual {v4}, Lkz2;->B()I

    .line 1216
    .line 1217
    .line 1218
    move-result v15

    .line 1219
    new-array v15, v15, [B

    .line 1220
    .line 1221
    move-wide/from16 v16, v5

    .line 1222
    .line 1223
    invoke-virtual {v4}, Lkz2;->B()I

    .line 1224
    .line 1225
    .line 1226
    move-result v5

    .line 1227
    const/4 v6, 0x0

    .line 1228
    invoke-virtual {v4, v15, v6, v5}, Lkz2;->H([BII)V

    .line 1229
    .line 1230
    .line 1231
    new-instance v4, Lmh1;

    .line 1232
    .line 1233
    new-instance v4, Lkz2;

    .line 1234
    .line 1235
    iget-object v5, v1, Ljj1;->j:Lgw3;

    .line 1236
    .line 1237
    iget-object v6, v5, Lgw3;->g:Ljava/lang/Object;

    .line 1238
    .line 1239
    check-cast v6, Ljava/io/ByteArrayOutputStream;

    .line 1240
    .line 1241
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->reset()V

    .line 1242
    .line 1243
    .line 1244
    :try_start_0
    iget-object v5, v5, Lgw3;->h:Ljava/lang/Object;

    .line 1245
    .line 1246
    check-cast v5, Ljava/io/DataOutputStream;

    .line 1247
    .line 1248
    invoke-virtual {v5, v11}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V

    .line 1249
    .line 1250
    .line 1251
    const/4 v11, 0x0

    .line 1252
    invoke-virtual {v5, v11}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 1253
    .line 1254
    .line 1255
    invoke-virtual {v5, v12}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V

    .line 1256
    .line 1257
    .line 1258
    invoke-virtual {v5, v11}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 1259
    .line 1260
    .line 1261
    invoke-virtual {v5, v9, v10}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 1262
    .line 1263
    .line 1264
    invoke-virtual {v5, v13, v14}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 1265
    .line 1266
    .line 1267
    invoke-virtual {v5, v15}, Ljava/io/OutputStream;->write([B)V

    .line 1268
    .line 1269
    .line 1270
    invoke-virtual {v5}, Ljava/io/DataOutputStream;->flush()V

    .line 1271
    .line 1272
    .line 1273
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 1274
    .line 1275
    .line 1276
    move-result-object v5
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1277
    invoke-direct {v4, v5}, Lkz2;-><init>([B)V

    .line 1278
    .line 1279
    .line 1280
    invoke-virtual {v4}, Lkz2;->B()I

    .line 1281
    .line 1282
    .line 1283
    move-result v5

    .line 1284
    iget-object v6, v1, Ljj1;->H:[Ljg1;

    .line 1285
    .line 1286
    array-length v9, v6

    .line 1287
    const/4 v10, 0x0

    .line 1288
    :goto_20
    if-ge v10, v9, :cond_38

    .line 1289
    .line 1290
    aget-object v11, v6, v10

    .line 1291
    .line 1292
    const/4 v12, 0x0

    .line 1293
    invoke-virtual {v4, v12}, Lkz2;->E(I)V

    .line 1294
    .line 1295
    .line 1296
    invoke-interface {v11, v4, v5, v12}, Ljg1;->a(Lkz2;II)V

    .line 1297
    .line 1298
    .line 1299
    add-int/lit8 v10, v10, 0x1

    .line 1300
    .line 1301
    goto :goto_20

    .line 1302
    :cond_38
    cmp-long v4, v2, v16

    .line 1303
    .line 1304
    if-nez v4, :cond_39

    .line 1305
    .line 1306
    new-instance v2, Lhj1;

    .line 1307
    .line 1308
    const/4 v13, 0x1

    .line 1309
    invoke-direct {v2, v5, v7, v8, v13}, Lhj1;-><init>(IJZ)V

    .line 1310
    .line 1311
    .line 1312
    move-object/from16 v4, v31

    .line 1313
    .line 1314
    invoke-virtual {v4, v2}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 1315
    .line 1316
    .line 1317
    iget v2, v1, Ljj1;->w:I

    .line 1318
    .line 1319
    add-int/2addr v2, v5

    .line 1320
    iput v2, v1, Ljj1;->w:I

    .line 1321
    .line 1322
    goto :goto_22

    .line 1323
    :cond_39
    move-object/from16 v4, v31

    .line 1324
    .line 1325
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 1326
    .line 1327
    .line 1328
    move-result v6

    .line 1329
    if-nez v6, :cond_3a

    .line 1330
    .line 1331
    new-instance v6, Lhj1;

    .line 1332
    .line 1333
    const/4 v7, 0x0

    .line 1334
    invoke-direct {v6, v5, v2, v3, v7}, Lhj1;-><init>(IJZ)V

    .line 1335
    .line 1336
    .line 1337
    invoke-virtual {v4, v6}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 1338
    .line 1339
    .line 1340
    iget v2, v1, Ljj1;->w:I

    .line 1341
    .line 1342
    add-int/2addr v2, v5

    .line 1343
    iput v2, v1, Ljj1;->w:I

    .line 1344
    .line 1345
    goto :goto_22

    .line 1346
    :cond_3a
    iget-object v4, v1, Ljj1;->H:[Ljg1;

    .line 1347
    .line 1348
    array-length v6, v4

    .line 1349
    const/4 v15, 0x0

    .line 1350
    :goto_21
    if-ge v15, v6, :cond_3c

    .line 1351
    .line 1352
    aget-object v22, v4, v15

    .line 1353
    .line 1354
    const/16 v27, 0x0

    .line 1355
    .line 1356
    const/16 v28, 0x0

    .line 1357
    .line 1358
    const/16 v25, 0x1

    .line 1359
    .line 1360
    move-wide/from16 v23, v2

    .line 1361
    .line 1362
    move/from16 v26, v5

    .line 1363
    .line 1364
    invoke-interface/range {v22 .. v28}, Ljg1;->c(JIIILig1;)V

    .line 1365
    .line 1366
    .line 1367
    add-int/lit8 v15, v15, 0x1

    .line 1368
    .line 1369
    goto :goto_21

    .line 1370
    :catch_0
    move-exception v0

    .line 1371
    new-instance v2, Ljava/lang/RuntimeException;

    .line 1372
    .line 1373
    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 1374
    .line 1375
    .line 1376
    throw v2

    .line 1377
    :cond_3b
    move-object v3, v0

    .line 1378
    check-cast v3, Ldf1;

    .line 1379
    .line 1380
    const/4 v7, 0x0

    .line 1381
    invoke-virtual {v3, v2, v7}, Ldf1;->c(IZ)Z

    .line 1382
    .line 1383
    .line 1384
    :cond_3c
    :goto_22
    move-object v2, v0

    .line 1385
    check-cast v2, Ldf1;

    .line 1386
    .line 1387
    iget-wide v2, v2, Ldf1;->i:J

    .line 1388
    .line 1389
    invoke-virtual {v1, v2, v3}, Ljj1;->g(J)V

    .line 1390
    .line 1391
    .line 1392
    goto/16 :goto_0

    .line 1393
    .line 1394
    :cond_3d
    move/from16 v19, v10

    .line 1395
    .line 1396
    iget v2, v1, Ljj1;->t:I

    .line 1397
    .line 1398
    const-wide/16 v3, 0x0

    .line 1399
    .line 1400
    iget-object v10, v1, Ljj1;->k:Lkz2;

    .line 1401
    .line 1402
    if-nez v2, :cond_44

    .line 1403
    .line 1404
    iget-object v2, v10, Lkz2;->a:[B

    .line 1405
    .line 1406
    move-object v14, v0

    .line 1407
    check-cast v14, Ldf1;

    .line 1408
    .line 1409
    const/4 v7, 0x1

    .line 1410
    const/4 v12, 0x0

    .line 1411
    const/16 v15, 0x8

    .line 1412
    .line 1413
    const-wide/16 v23, -0x1

    .line 1414
    .line 1415
    invoke-virtual {v14, v2, v12, v15, v7}, Ldf1;->w([BIIZ)Z

    .line 1416
    .line 1417
    .line 1418
    move-result v2

    .line 1419
    if-nez v2, :cond_43

    .line 1420
    .line 1421
    iget-wide v7, v1, Ljj1;->K:J

    .line 1422
    .line 1423
    cmp-long v0, v7, v23

    .line 1424
    .line 1425
    if-eqz v0, :cond_42

    .line 1426
    .line 1427
    move-object/from16 v2, p2

    .line 1428
    .line 1429
    iput-wide v3, v2, Lpf1;->a:J

    .line 1430
    .line 1431
    move-wide/from16 v7, v23

    .line 1432
    .line 1433
    iput-wide v7, v1, Ljj1;->K:J

    .line 1434
    .line 1435
    iget-object v0, v1, Ljj1;->G:Lnf1;

    .line 1436
    .line 1437
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1438
    .line 1439
    .line 1440
    new-instance v2, Ljava/util/ArrayList;

    .line 1441
    .line 1442
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1443
    .line 1444
    .line 1445
    new-instance v5, Ljava/util/ArrayList;

    .line 1446
    .line 1447
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1448
    .line 1449
    .line 1450
    new-instance v7, Ljava/util/ArrayList;

    .line 1451
    .line 1452
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1453
    .line 1454
    .line 1455
    new-instance v8, Ljava/util/ArrayList;

    .line 1456
    .line 1457
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1458
    .line 1459
    .line 1460
    iget-object v6, v6, Lcf1;->a:Ljava/util/LinkedHashMap;

    .line 1461
    .line 1462
    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v6

    .line 1466
    invoke-interface {v6}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 1467
    .line 1468
    .line 1469
    move-result-object v6

    .line 1470
    :goto_23
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1471
    .line 1472
    .line 1473
    move-result v9

    .line 1474
    if-eqz v9, :cond_3e

    .line 1475
    .line 1476
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1477
    .line 1478
    .line 1479
    move-result-object v9

    .line 1480
    check-cast v9, Lbf1;

    .line 1481
    .line 1482
    iget-object v10, v9, Lbf1;->b:[I

    .line 1483
    .line 1484
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1485
    .line 1486
    .line 1487
    iget-object v10, v9, Lbf1;->c:[J

    .line 1488
    .line 1489
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1490
    .line 1491
    .line 1492
    iget-object v10, v9, Lbf1;->d:[J

    .line 1493
    .line 1494
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1495
    .line 1496
    .line 1497
    iget-object v9, v9, Lbf1;->e:[J

    .line 1498
    .line 1499
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1500
    .line 1501
    .line 1502
    goto :goto_23

    .line 1503
    :cond_3e
    new-instance v6, Lbf1;

    .line 1504
    .line 1505
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 1506
    .line 1507
    .line 1508
    move-result v9

    .line 1509
    new-array v9, v9, [[I

    .line 1510
    .line 1511
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1512
    .line 1513
    .line 1514
    move-result-object v2

    .line 1515
    check-cast v2, [[I

    .line 1516
    .line 1517
    array-length v9, v2

    .line 1518
    const/4 v10, 0x0

    .line 1519
    :goto_24
    if-ge v10, v9, :cond_3f

    .line 1520
    .line 1521
    aget-object v11, v2, v10

    .line 1522
    .line 1523
    array-length v11, v11

    .line 1524
    int-to-long v11, v11

    .line 1525
    add-long/2addr v3, v11

    .line 1526
    add-int/lit8 v10, v10, 0x1

    .line 1527
    .line 1528
    goto :goto_24

    .line 1529
    :cond_3f
    long-to-int v9, v3

    .line 1530
    int-to-long v10, v9

    .line 1531
    cmp-long v10, v3, v10

    .line 1532
    .line 1533
    if-nez v10, :cond_40

    .line 1534
    .line 1535
    const/4 v10, 0x1

    .line 1536
    goto :goto_25

    .line 1537
    :cond_40
    const/4 v10, 0x0

    .line 1538
    :goto_25
    const-string v11, "the total number of elements (%s) in the arrays must fit in an int"

    .line 1539
    .line 1540
    invoke-static {v10, v11, v3, v4}, Lzt0;->V(ZLjava/lang/String;J)V

    .line 1541
    .line 1542
    .line 1543
    new-array v3, v9, [I

    .line 1544
    .line 1545
    array-length v4, v2

    .line 1546
    const/4 v9, 0x0

    .line 1547
    const/4 v10, 0x0

    .line 1548
    :goto_26
    if-ge v9, v4, :cond_41

    .line 1549
    .line 1550
    aget-object v11, v2, v9

    .line 1551
    .line 1552
    array-length v12, v11

    .line 1553
    const/4 v13, 0x0

    .line 1554
    invoke-static {v11, v13, v3, v10, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1555
    .line 1556
    .line 1557
    add-int/2addr v10, v12

    .line 1558
    add-int/lit8 v9, v9, 0x1

    .line 1559
    .line 1560
    goto :goto_26

    .line 1561
    :cond_41
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 1562
    .line 1563
    .line 1564
    move-result v2

    .line 1565
    new-array v2, v2, [[J

    .line 1566
    .line 1567
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1568
    .line 1569
    .line 1570
    move-result-object v2

    .line 1571
    check-cast v2, [[J

    .line 1572
    .line 1573
    invoke-static {v2}, Lqb1;->A([[J)[J

    .line 1574
    .line 1575
    .line 1576
    move-result-object v2

    .line 1577
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 1578
    .line 1579
    .line 1580
    move-result v4

    .line 1581
    new-array v4, v4, [[J

    .line 1582
    .line 1583
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1584
    .line 1585
    .line 1586
    move-result-object v4

    .line 1587
    check-cast v4, [[J

    .line 1588
    .line 1589
    invoke-static {v4}, Lqb1;->A([[J)[J

    .line 1590
    .line 1591
    .line 1592
    move-result-object v4

    .line 1593
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 1594
    .line 1595
    .line 1596
    move-result v5

    .line 1597
    new-array v5, v5, [[J

    .line 1598
    .line 1599
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1600
    .line 1601
    .line 1602
    move-result-object v5

    .line 1603
    check-cast v5, [[J

    .line 1604
    .line 1605
    invoke-static {v5}, Lqb1;->A([[J)[J

    .line 1606
    .line 1607
    .line 1608
    move-result-object v5

    .line 1609
    invoke-direct {v6, v3, v2, v4, v5}, Lbf1;-><init>([I[J[J[J)V

    .line 1610
    .line 1611
    .line 1612
    invoke-interface {v0, v6}, Lnf1;->v(Lcg1;)V

    .line 1613
    .line 1614
    .line 1615
    const/16 v21, 0x1

    .line 1616
    .line 1617
    return v21

    .line 1618
    :cond_42
    const/4 v7, 0x0

    .line 1619
    invoke-virtual {v11, v7}, Lfw3;->y(I)V

    .line 1620
    .line 1621
    .line 1622
    const/16 v18, -0x1

    .line 1623
    .line 1624
    return v18

    .line 1625
    :cond_43
    move-object/from16 v2, p2

    .line 1626
    .line 1627
    const/4 v7, 0x0

    .line 1628
    const/16 v13, 0x8

    .line 1629
    .line 1630
    iput v13, v1, Ljj1;->t:I

    .line 1631
    .line 1632
    invoke-virtual {v10, v7}, Lkz2;->E(I)V

    .line 1633
    .line 1634
    .line 1635
    invoke-virtual {v10}, Lkz2;->P()J

    .line 1636
    .line 1637
    .line 1638
    move-result-wide v11

    .line 1639
    iput-wide v11, v1, Ljj1;->s:J

    .line 1640
    .line 1641
    invoke-virtual {v10}, Lkz2;->b()I

    .line 1642
    .line 1643
    .line 1644
    move-result v7

    .line 1645
    iput v7, v1, Ljj1;->r:I

    .line 1646
    .line 1647
    goto :goto_27

    .line 1648
    :cond_44
    move-object/from16 v2, p2

    .line 1649
    .line 1650
    :goto_27
    iget-wide v11, v1, Ljj1;->s:J

    .line 1651
    .line 1652
    const-wide/16 v13, 0x1

    .line 1653
    .line 1654
    cmp-long v7, v11, v13

    .line 1655
    .line 1656
    if-nez v7, :cond_45

    .line 1657
    .line 1658
    iget-object v3, v10, Lkz2;->a:[B

    .line 1659
    .line 1660
    move-object v4, v0

    .line 1661
    check-cast v4, Ldf1;

    .line 1662
    .line 1663
    const/4 v7, 0x0

    .line 1664
    const/16 v13, 0x8

    .line 1665
    .line 1666
    invoke-virtual {v4, v3, v13, v13, v7}, Ldf1;->w([BIIZ)Z

    .line 1667
    .line 1668
    .line 1669
    iget v3, v1, Ljj1;->t:I

    .line 1670
    .line 1671
    add-int/2addr v3, v13

    .line 1672
    iput v3, v1, Ljj1;->t:I

    .line 1673
    .line 1674
    invoke-virtual {v10}, Lkz2;->j()J

    .line 1675
    .line 1676
    .line 1677
    move-result-wide v3

    .line 1678
    iput-wide v3, v1, Ljj1;->s:J

    .line 1679
    .line 1680
    goto :goto_29

    .line 1681
    :cond_45
    cmp-long v3, v11, v3

    .line 1682
    .line 1683
    if-nez v3, :cond_48

    .line 1684
    .line 1685
    move-object v3, v0

    .line 1686
    check-cast v3, Ldf1;

    .line 1687
    .line 1688
    iget-wide v3, v3, Ldf1;->h:J

    .line 1689
    .line 1690
    const-wide/16 v23, -0x1

    .line 1691
    .line 1692
    cmp-long v7, v3, v23

    .line 1693
    .line 1694
    if-nez v7, :cond_47

    .line 1695
    .line 1696
    invoke-virtual {v8}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 1697
    .line 1698
    .line 1699
    move-result v3

    .line 1700
    if-nez v3, :cond_46

    .line 1701
    .line 1702
    invoke-virtual {v8}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 1703
    .line 1704
    .line 1705
    move-result-object v3

    .line 1706
    check-cast v3, Lm43;

    .line 1707
    .line 1708
    iget-wide v3, v3, Lm43;->c:J

    .line 1709
    .line 1710
    goto :goto_28

    .line 1711
    :cond_46
    move-wide/from16 v3, v23

    .line 1712
    .line 1713
    :cond_47
    :goto_28
    cmp-long v7, v3, v23

    .line 1714
    .line 1715
    if-eqz v7, :cond_48

    .line 1716
    .line 1717
    move-object v7, v0

    .line 1718
    check-cast v7, Ldf1;

    .line 1719
    .line 1720
    iget-wide v11, v7, Ldf1;->i:J

    .line 1721
    .line 1722
    sub-long/2addr v3, v11

    .line 1723
    iget v7, v1, Ljj1;->t:I

    .line 1724
    .line 1725
    int-to-long v11, v7

    .line 1726
    add-long/2addr v3, v11

    .line 1727
    iput-wide v3, v1, Ljj1;->s:J

    .line 1728
    .line 1729
    :cond_48
    :goto_29
    iget-wide v3, v1, Ljj1;->s:J

    .line 1730
    .line 1731
    iget v7, v1, Ljj1;->t:I

    .line 1732
    .line 1733
    int-to-long v11, v7

    .line 1734
    cmp-long v13, v3, v11

    .line 1735
    .line 1736
    if-gez v13, :cond_4a

    .line 1737
    .line 1738
    iget v3, v1, Ljj1;->r:I

    .line 1739
    .line 1740
    const v4, 0x66726565

    .line 1741
    .line 1742
    .line 1743
    if-ne v3, v4, :cond_49

    .line 1744
    .line 1745
    const/16 v13, 0x8

    .line 1746
    .line 1747
    if-ne v7, v13, :cond_49

    .line 1748
    .line 1749
    iput-wide v11, v1, Ljj1;->s:J

    .line 1750
    .line 1751
    move-wide v3, v11

    .line 1752
    goto :goto_2a

    .line 1753
    :cond_49
    const-string v0, "Atom size less than header length (unsupported)."

    .line 1754
    .line 1755
    invoke-static {v0}, Llq1;->b(Ljava/lang/String;)Llq1;

    .line 1756
    .line 1757
    .line 1758
    move-result-object v0

    .line 1759
    throw v0

    .line 1760
    :cond_4a
    :goto_2a
    iget-wide v13, v1, Ljj1;->K:J

    .line 1761
    .line 1762
    const-wide/16 v23, -0x1

    .line 1763
    .line 1764
    cmp-long v7, v13, v23

    .line 1765
    .line 1766
    if-eqz v7, :cond_4c

    .line 1767
    .line 1768
    iget v7, v1, Ljj1;->r:I

    .line 1769
    .line 1770
    const v8, 0x73696478

    .line 1771
    .line 1772
    .line 1773
    if-ne v7, v8, :cond_4b

    .line 1774
    .line 1775
    long-to-int v3, v3

    .line 1776
    invoke-virtual {v5, v3}, Lkz2;->y(I)V

    .line 1777
    .line 1778
    .line 1779
    iget-object v3, v10, Lkz2;->a:[B

    .line 1780
    .line 1781
    iget-object v4, v5, Lkz2;->a:[B

    .line 1782
    .line 1783
    const/4 v7, 0x0

    .line 1784
    const/16 v13, 0x8

    .line 1785
    .line 1786
    invoke-static {v3, v7, v4, v7, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1787
    .line 1788
    .line 1789
    iget-object v3, v5, Lkz2;->a:[B

    .line 1790
    .line 1791
    iget-wide v8, v1, Ljj1;->s:J

    .line 1792
    .line 1793
    iget v4, v1, Ljj1;->t:I

    .line 1794
    .line 1795
    int-to-long v10, v4

    .line 1796
    sub-long/2addr v8, v10

    .line 1797
    long-to-int v4, v8

    .line 1798
    move-object v8, v0

    .line 1799
    check-cast v8, Ldf1;

    .line 1800
    .line 1801
    invoke-virtual {v8, v3, v13, v4, v7}, Ldf1;->w([BIIZ)Z

    .line 1802
    .line 1803
    .line 1804
    move-object v3, v0

    .line 1805
    check-cast v3, Ldf1;

    .line 1806
    .line 1807
    invoke-virtual {v3}, Ldf1;->n()J

    .line 1808
    .line 1809
    .line 1810
    move-result-wide v3

    .line 1811
    invoke-static {v3, v4, v5}, Ljj1;->j(JLkz2;)Landroid/util/Pair;

    .line 1812
    .line 1813
    .line 1814
    move-result-object v3

    .line 1815
    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 1816
    .line 1817
    check-cast v3, Lbf1;

    .line 1818
    .line 1819
    invoke-virtual {v6, v3}, Lcf1;->b(Lbf1;)V

    .line 1820
    .line 1821
    .line 1822
    goto :goto_2b

    .line 1823
    :cond_4b
    sub-long/2addr v3, v11

    .line 1824
    long-to-int v3, v3

    .line 1825
    move-object v4, v0

    .line 1826
    check-cast v4, Ldf1;

    .line 1827
    .line 1828
    const/4 v13, 0x1

    .line 1829
    invoke-virtual {v4, v3, v13}, Ldf1;->c(IZ)Z

    .line 1830
    .line 1831
    .line 1832
    :goto_2b
    invoke-virtual {v1}, Ljj1;->a()V

    .line 1833
    .line 1834
    .line 1835
    goto/16 :goto_0

    .line 1836
    .line 1837
    :cond_4c
    move-object v3, v0

    .line 1838
    check-cast v3, Ldf1;

    .line 1839
    .line 1840
    iget-wide v3, v3, Ldf1;->i:J

    .line 1841
    .line 1842
    sub-long/2addr v3, v11

    .line 1843
    iget v6, v1, Ljj1;->r:I

    .line 1844
    .line 1845
    const v7, 0x6d646174

    .line 1846
    .line 1847
    .line 1848
    const v11, 0x6d6f6f66

    .line 1849
    .line 1850
    .line 1851
    if-eq v6, v11, :cond_4d

    .line 1852
    .line 1853
    if-ne v6, v7, :cond_4e

    .line 1854
    .line 1855
    :cond_4d
    iget-boolean v6, v1, Ljj1;->J:Z

    .line 1856
    .line 1857
    if-nez v6, :cond_4e

    .line 1858
    .line 1859
    iget-object v6, v1, Ljj1;->G:Lnf1;

    .line 1860
    .line 1861
    new-instance v12, Lqf1;

    .line 1862
    .line 1863
    iget-wide v13, v1, Ljj1;->y:J

    .line 1864
    .line 1865
    invoke-direct {v12, v13, v14, v3, v4}, Lqf1;-><init>(JJ)V

    .line 1866
    .line 1867
    .line 1868
    invoke-interface {v6, v12}, Lnf1;->v(Lcg1;)V

    .line 1869
    .line 1870
    .line 1871
    const/4 v13, 0x1

    .line 1872
    iput-boolean v13, v1, Ljj1;->J:Z

    .line 1873
    .line 1874
    :cond_4e
    iget v6, v1, Ljj1;->r:I

    .line 1875
    .line 1876
    if-ne v6, v11, :cond_4f

    .line 1877
    .line 1878
    invoke-virtual {v9}, Landroid/util/SparseArray;->size()I

    .line 1879
    .line 1880
    .line 1881
    move-result v6

    .line 1882
    const/4 v12, 0x0

    .line 1883
    :goto_2c
    if-ge v12, v6, :cond_4f

    .line 1884
    .line 1885
    invoke-virtual {v9, v12}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 1886
    .line 1887
    .line 1888
    move-result-object v13

    .line 1889
    check-cast v13, Lij1;

    .line 1890
    .line 1891
    iget-object v13, v13, Lij1;->b:Lsj1;

    .line 1892
    .line 1893
    iput-wide v3, v13, Lsj1;->c:J

    .line 1894
    .line 1895
    iput-wide v3, v13, Lsj1;->b:J

    .line 1896
    .line 1897
    add-int/lit8 v12, v12, 0x1

    .line 1898
    .line 1899
    goto :goto_2c

    .line 1900
    :cond_4f
    iget v6, v1, Ljj1;->r:I

    .line 1901
    .line 1902
    if-ne v6, v7, :cond_50

    .line 1903
    .line 1904
    const/4 v7, 0x0

    .line 1905
    iput-object v7, v1, Ljj1;->A:Lij1;

    .line 1906
    .line 1907
    iget-wide v5, v1, Ljj1;->s:J

    .line 1908
    .line 1909
    add-long/2addr v3, v5

    .line 1910
    iput-wide v3, v1, Ljj1;->v:J

    .line 1911
    .line 1912
    move/from16 v3, v19

    .line 1913
    .line 1914
    iput v3, v1, Ljj1;->q:I

    .line 1915
    .line 1916
    goto/16 :goto_0

    .line 1917
    .line 1918
    :cond_50
    const v3, 0x6d6f6f76

    .line 1919
    .line 1920
    .line 1921
    const v4, 0x6d657461

    .line 1922
    .line 1923
    .line 1924
    if-eq v6, v3, :cond_57

    .line 1925
    .line 1926
    const v3, 0x7472616b

    .line 1927
    .line 1928
    .line 1929
    if-eq v6, v3, :cond_57

    .line 1930
    .line 1931
    const v3, 0x6d646961

    .line 1932
    .line 1933
    .line 1934
    if-eq v6, v3, :cond_57

    .line 1935
    .line 1936
    const v3, 0x6d696e66

    .line 1937
    .line 1938
    .line 1939
    if-eq v6, v3, :cond_57

    .line 1940
    .line 1941
    const v3, 0x7374626c

    .line 1942
    .line 1943
    .line 1944
    if-eq v6, v3, :cond_57

    .line 1945
    .line 1946
    if-eq v6, v11, :cond_57

    .line 1947
    .line 1948
    const v3, 0x74726166

    .line 1949
    .line 1950
    .line 1951
    if-eq v6, v3, :cond_57

    .line 1952
    .line 1953
    const v3, 0x6d766578

    .line 1954
    .line 1955
    .line 1956
    if-eq v6, v3, :cond_57

    .line 1957
    .line 1958
    const v3, 0x65647473

    .line 1959
    .line 1960
    .line 1961
    if-eq v6, v3, :cond_57

    .line 1962
    .line 1963
    if-ne v6, v4, :cond_51

    .line 1964
    .line 1965
    goto/16 :goto_2e

    .line 1966
    .line 1967
    :cond_51
    const v3, 0x68646c72    # 4.3148E24f

    .line 1968
    .line 1969
    .line 1970
    const-wide/32 v4, 0x7fffffff

    .line 1971
    .line 1972
    .line 1973
    if-eq v6, v3, :cond_54

    .line 1974
    .line 1975
    const v3, 0x6d646864

    .line 1976
    .line 1977
    .line 1978
    if-eq v6, v3, :cond_54

    .line 1979
    .line 1980
    const v3, 0x6d766864

    .line 1981
    .line 1982
    .line 1983
    if-eq v6, v3, :cond_54

    .line 1984
    .line 1985
    const v8, 0x73696478

    .line 1986
    .line 1987
    .line 1988
    if-eq v6, v8, :cond_54

    .line 1989
    .line 1990
    const v3, 0x73747364

    .line 1991
    .line 1992
    .line 1993
    if-eq v6, v3, :cond_54

    .line 1994
    .line 1995
    const v3, 0x73747473

    .line 1996
    .line 1997
    .line 1998
    if-eq v6, v3, :cond_54

    .line 1999
    .line 2000
    const v3, 0x63747473

    .line 2001
    .line 2002
    .line 2003
    if-eq v6, v3, :cond_54

    .line 2004
    .line 2005
    const v3, 0x73747363

    .line 2006
    .line 2007
    .line 2008
    if-eq v6, v3, :cond_54

    .line 2009
    .line 2010
    const v3, 0x7374737a

    .line 2011
    .line 2012
    .line 2013
    if-eq v6, v3, :cond_54

    .line 2014
    .line 2015
    const v3, 0x73747a32

    .line 2016
    .line 2017
    .line 2018
    if-eq v6, v3, :cond_54

    .line 2019
    .line 2020
    const v3, 0x7374636f

    .line 2021
    .line 2022
    .line 2023
    if-eq v6, v3, :cond_54

    .line 2024
    .line 2025
    const v3, 0x636f3634

    .line 2026
    .line 2027
    .line 2028
    if-eq v6, v3, :cond_54

    .line 2029
    .line 2030
    const v3, 0x73747373

    .line 2031
    .line 2032
    .line 2033
    if-eq v6, v3, :cond_54

    .line 2034
    .line 2035
    const v3, 0x74666474

    .line 2036
    .line 2037
    .line 2038
    if-eq v6, v3, :cond_54

    .line 2039
    .line 2040
    const v3, 0x74666864

    .line 2041
    .line 2042
    .line 2043
    if-eq v6, v3, :cond_54

    .line 2044
    .line 2045
    const v3, 0x746b6864

    .line 2046
    .line 2047
    .line 2048
    if-eq v6, v3, :cond_54

    .line 2049
    .line 2050
    const v3, 0x74726578

    .line 2051
    .line 2052
    .line 2053
    if-eq v6, v3, :cond_54

    .line 2054
    .line 2055
    const v3, 0x7472756e

    .line 2056
    .line 2057
    .line 2058
    if-eq v6, v3, :cond_54

    .line 2059
    .line 2060
    const v3, 0x70737368    # 3.013775E29f

    .line 2061
    .line 2062
    .line 2063
    if-eq v6, v3, :cond_54

    .line 2064
    .line 2065
    const v3, 0x7361697a

    .line 2066
    .line 2067
    .line 2068
    if-eq v6, v3, :cond_54

    .line 2069
    .line 2070
    const v3, 0x7361696f

    .line 2071
    .line 2072
    .line 2073
    if-eq v6, v3, :cond_54

    .line 2074
    .line 2075
    const v3, 0x73656e63

    .line 2076
    .line 2077
    .line 2078
    if-eq v6, v3, :cond_54

    .line 2079
    .line 2080
    const v3, 0x75756964

    .line 2081
    .line 2082
    .line 2083
    if-eq v6, v3, :cond_54

    .line 2084
    .line 2085
    const v3, 0x73626770

    .line 2086
    .line 2087
    .line 2088
    if-eq v6, v3, :cond_54

    .line 2089
    .line 2090
    const v3, 0x73677064

    .line 2091
    .line 2092
    .line 2093
    if-eq v6, v3, :cond_54

    .line 2094
    .line 2095
    const v3, 0x656c7374

    .line 2096
    .line 2097
    .line 2098
    if-eq v6, v3, :cond_54

    .line 2099
    .line 2100
    const v3, 0x6d656864

    .line 2101
    .line 2102
    .line 2103
    if-eq v6, v3, :cond_54

    .line 2104
    .line 2105
    const v3, 0x656d7367

    .line 2106
    .line 2107
    .line 2108
    if-eq v6, v3, :cond_54

    .line 2109
    .line 2110
    const v3, 0x75647461

    .line 2111
    .line 2112
    .line 2113
    if-eq v6, v3, :cond_54

    .line 2114
    .line 2115
    const v3, 0x6b657973

    .line 2116
    .line 2117
    .line 2118
    if-eq v6, v3, :cond_54

    .line 2119
    .line 2120
    const v3, 0x696c7374

    .line 2121
    .line 2122
    .line 2123
    if-ne v6, v3, :cond_52

    .line 2124
    .line 2125
    goto :goto_2d

    .line 2126
    :cond_52
    iget-wide v6, v1, Ljj1;->s:J

    .line 2127
    .line 2128
    cmp-long v3, v6, v4

    .line 2129
    .line 2130
    if-gtz v3, :cond_53

    .line 2131
    .line 2132
    const/4 v7, 0x0

    .line 2133
    iput-object v7, v1, Ljj1;->u:Lkz2;

    .line 2134
    .line 2135
    const/4 v13, 0x1

    .line 2136
    iput v13, v1, Ljj1;->q:I

    .line 2137
    .line 2138
    goto/16 :goto_0

    .line 2139
    .line 2140
    :cond_53
    const-string v0, "Skipping atom with length > 2147483647 (unsupported)."

    .line 2141
    .line 2142
    invoke-static {v0}, Llq1;->b(Ljava/lang/String;)Llq1;

    .line 2143
    .line 2144
    .line 2145
    move-result-object v0

    .line 2146
    throw v0

    .line 2147
    :cond_54
    :goto_2d
    iget v3, v1, Ljj1;->t:I

    .line 2148
    .line 2149
    const/16 v13, 0x8

    .line 2150
    .line 2151
    if-ne v3, v13, :cond_56

    .line 2152
    .line 2153
    iget-wide v6, v1, Ljj1;->s:J

    .line 2154
    .line 2155
    cmp-long v3, v6, v4

    .line 2156
    .line 2157
    if-gtz v3, :cond_55

    .line 2158
    .line 2159
    new-instance v3, Lkz2;

    .line 2160
    .line 2161
    iget-wide v4, v1, Ljj1;->s:J

    .line 2162
    .line 2163
    long-to-int v4, v4

    .line 2164
    invoke-direct {v3, v4}, Lkz2;-><init>(I)V

    .line 2165
    .line 2166
    .line 2167
    iget-object v4, v10, Lkz2;->a:[B

    .line 2168
    .line 2169
    iget-object v5, v3, Lkz2;->a:[B

    .line 2170
    .line 2171
    const/4 v7, 0x0

    .line 2172
    invoke-static {v4, v7, v5, v7, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2173
    .line 2174
    .line 2175
    iput-object v3, v1, Ljj1;->u:Lkz2;

    .line 2176
    .line 2177
    const/4 v13, 0x1

    .line 2178
    iput v13, v1, Ljj1;->q:I

    .line 2179
    .line 2180
    goto/16 :goto_0

    .line 2181
    .line 2182
    :cond_55
    const-string v0, "Leaf atom with length > 2147483647 (unsupported)."

    .line 2183
    .line 2184
    invoke-static {v0}, Llq1;->b(Ljava/lang/String;)Llq1;

    .line 2185
    .line 2186
    .line 2187
    move-result-object v0

    .line 2188
    throw v0

    .line 2189
    :cond_56
    const-string v0, "Leaf atom defines extended atom size (unsupported)."

    .line 2190
    .line 2191
    invoke-static {v0}, Llq1;->b(Ljava/lang/String;)Llq1;

    .line 2192
    .line 2193
    .line 2194
    move-result-object v0

    .line 2195
    throw v0

    .line 2196
    :cond_57
    :goto_2e
    move-object v3, v0

    .line 2197
    check-cast v3, Ldf1;

    .line 2198
    .line 2199
    iget-wide v9, v3, Ldf1;->i:J

    .line 2200
    .line 2201
    iget-wide v11, v1, Ljj1;->s:J

    .line 2202
    .line 2203
    add-long/2addr v9, v11

    .line 2204
    iget v7, v1, Ljj1;->t:I

    .line 2205
    .line 2206
    int-to-long v13, v7

    .line 2207
    cmp-long v7, v11, v13

    .line 2208
    .line 2209
    if-eqz v7, :cond_58

    .line 2210
    .line 2211
    if-ne v6, v4, :cond_58

    .line 2212
    .line 2213
    const/16 v13, 0x8

    .line 2214
    .line 2215
    invoke-virtual {v5, v13}, Lkz2;->y(I)V

    .line 2216
    .line 2217
    .line 2218
    iget-object v4, v5, Lkz2;->a:[B

    .line 2219
    .line 2220
    const/4 v7, 0x0

    .line 2221
    invoke-virtual {v3, v4, v7, v13, v7}, Ldf1;->B([BIIZ)Z

    .line 2222
    .line 2223
    .line 2224
    invoke-static {v5}, Lej1;->f(Lkz2;)V

    .line 2225
    .line 2226
    .line 2227
    iget v4, v5, Lkz2;->b:I

    .line 2228
    .line 2229
    invoke-virtual {v3, v4, v7}, Ldf1;->c(IZ)Z

    .line 2230
    .line 2231
    .line 2232
    iput v7, v3, Ldf1;->k:I

    .line 2233
    .line 2234
    :cond_58
    const-wide/16 v3, -0x8

    .line 2235
    .line 2236
    add-long/2addr v9, v3

    .line 2237
    new-instance v3, Lm43;

    .line 2238
    .line 2239
    iget v4, v1, Ljj1;->r:I

    .line 2240
    .line 2241
    invoke-direct {v3, v4, v9, v10}, Lm43;-><init>(IJ)V

    .line 2242
    .line 2243
    .line 2244
    invoke-virtual {v8, v3}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 2245
    .line 2246
    .line 2247
    iget-wide v3, v1, Ljj1;->s:J

    .line 2248
    .line 2249
    iget v5, v1, Ljj1;->t:I

    .line 2250
    .line 2251
    int-to-long v5, v5

    .line 2252
    cmp-long v3, v3, v5

    .line 2253
    .line 2254
    if-nez v3, :cond_59

    .line 2255
    .line 2256
    invoke-virtual {v1, v9, v10}, Ljj1;->g(J)V

    .line 2257
    .line 2258
    .line 2259
    goto/16 :goto_0

    .line 2260
    .line 2261
    :cond_59
    invoke-virtual {v1}, Ljj1;->a()V

    .line 2262
    .line 2263
    .line 2264
    goto/16 :goto_0
.end method

.method public final synthetic d()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ljj1;->p:Lsn3;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e(JJ)V
    .locals 3

    .line 1
    iget-object p1, p0, Ljj1;->d:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    const/4 v0, 0x0

    .line 8
    move v1, v0

    .line 9
    :goto_0
    if-ge v1, p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Lij1;

    .line 16
    .line 17
    invoke-virtual {v2}, Lij1;->a()V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object p1, p0, Ljj1;->m:Ljava/util/ArrayDeque;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 26
    .line 27
    .line 28
    iput v0, p0, Ljj1;->w:I

    .line 29
    .line 30
    iget-object p1, p0, Ljj1;->n:Lfw3;

    .line 31
    .line 32
    iget-object p1, p1, Lfw3;->j:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, Ljava/util/PriorityQueue;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/util/PriorityQueue;->clear()V

    .line 37
    .line 38
    .line 39
    iput-wide p3, p0, Ljj1;->x:J

    .line 40
    .line 41
    iget-object p1, p0, Ljj1;->l:Ljava/util/ArrayDeque;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Ljj1;->a()V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final f(Lnf1;)V
    .locals 5

    .line 1
    iget v0, p0, Ljj1;->b:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x20

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lrl;

    .line 8
    .line 9
    iget-object v1, p0, Ljj1;->a:Ljk1;

    .line 10
    .line 11
    invoke-direct {v0, p1, v1}, Lrl;-><init>(Lnf1;Ljk1;)V

    .line 12
    .line 13
    .line 14
    move-object p1, v0

    .line 15
    :cond_0
    iput-object p1, p0, Ljj1;->G:Lnf1;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljj1;->a()V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x2

    .line 21
    new-array p1, p1, [Ljg1;

    .line 22
    .line 23
    iput-object p1, p0, Ljj1;->H:[Ljg1;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-static {p1, v0}, Lv23;->m([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, [Ljg1;

    .line 31
    .line 32
    iput-object p1, p0, Ljj1;->H:[Ljg1;

    .line 33
    .line 34
    array-length v1, p1

    .line 35
    move v2, v0

    .line 36
    :goto_0
    if-ge v2, v1, :cond_1

    .line 37
    .line 38
    aget-object v3, p1, v2

    .line 39
    .line 40
    sget-object v4, Ljj1;->M:Lph4;

    .line 41
    .line 42
    invoke-interface {v3, v4}, Ljg1;->d(Lph4;)V

    .line 43
    .line 44
    .line 45
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    iget-object p1, p0, Ljj1;->c:Ljava/util/List;

    .line 49
    .line 50
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    new-array v1, v1, [Ljg1;

    .line 55
    .line 56
    iput-object v1, p0, Ljj1;->I:[Ljg1;

    .line 57
    .line 58
    const/16 v1, 0x64

    .line 59
    .line 60
    :goto_1
    iget-object v2, p0, Ljj1;->I:[Ljg1;

    .line 61
    .line 62
    array-length v2, v2

    .line 63
    if-ge v0, v2, :cond_2

    .line 64
    .line 65
    iget-object v2, p0, Ljj1;->G:Lnf1;

    .line 66
    .line 67
    add-int/lit8 v3, v1, 0x1

    .line 68
    .line 69
    const/4 v4, 0x3

    .line 70
    invoke-interface {v2, v1, v4}, Lnf1;->z(II)Ljg1;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    check-cast v2, Lph4;

    .line 79
    .line 80
    invoke-interface {v1, v2}, Ljg1;->d(Lph4;)V

    .line 81
    .line 82
    .line 83
    iget-object v2, p0, Ljj1;->I:[Ljg1;

    .line 84
    .line 85
    aput-object v1, v2, v0

    .line 86
    .line 87
    add-int/lit8 v0, v0, 0x1

    .line 88
    .line 89
    move v1, v3

    .line 90
    goto :goto_1

    .line 91
    :cond_2
    return-void
.end method

.method public final g(J)V
    .locals 53

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    :cond_0
    :goto_0
    iget-object v1, v0, Ljj1;->l:Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_54

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Lm43;

    .line 16
    .line 17
    iget-wide v2, v2, Lm43;->c:J

    .line 18
    .line 19
    cmp-long v2, v2, p1

    .line 20
    .line 21
    if-nez v2, :cond_54

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    move-object v3, v2

    .line 28
    check-cast v3, Lm43;

    .line 29
    .line 30
    iget v2, v3, Ltd;->b:I

    .line 31
    .line 32
    iget-object v4, v3, Lm43;->d:Ljava/util/ArrayList;

    .line 33
    .line 34
    const v5, 0x6d6f6f76

    .line 35
    .line 36
    .line 37
    iget-object v11, v0, Ljj1;->d:Landroid/util/SparseArray;

    .line 38
    .line 39
    const/16 v6, 0xc

    .line 40
    .line 41
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    const/16 v10, 0x8

    .line 47
    .line 48
    if-ne v2, v5, :cond_e

    .line 49
    .line 50
    invoke-static {v4}, Ljj1;->k(Ljava/util/List;)Lie4;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    const v1, 0x6d766578

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3, v1}, Lm43;->j(I)Lm43;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    new-instance v2, Landroid/util/SparseArray;

    .line 65
    .line 66
    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    .line 67
    .line 68
    .line 69
    iget-object v1, v1, Lm43;->d:Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    const/4 v5, 0x0

    .line 76
    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    :goto_1
    if-ge v5, v4, :cond_4

    .line 82
    .line 83
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    check-cast v8, Lp43;

    .line 88
    .line 89
    iget v9, v8, Ltd;->b:I

    .line 90
    .line 91
    iget-object v8, v8, Lp43;->c:Lkz2;

    .line 92
    .line 93
    const/16 v18, -0x1

    .line 94
    .line 95
    const v12, 0x74726578

    .line 96
    .line 97
    .line 98
    if-ne v9, v12, :cond_1

    .line 99
    .line 100
    invoke-virtual {v8, v6}, Lkz2;->E(I)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v8}, Lkz2;->b()I

    .line 104
    .line 105
    .line 106
    move-result v9

    .line 107
    invoke-virtual {v8}, Lkz2;->b()I

    .line 108
    .line 109
    .line 110
    move-result v12

    .line 111
    add-int/lit8 v12, v12, -0x1

    .line 112
    .line 113
    invoke-virtual {v8}, Lkz2;->b()I

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    const/16 v20, 0x0

    .line 118
    .line 119
    invoke-virtual {v8}, Lkz2;->b()I

    .line 120
    .line 121
    .line 122
    move-result v14

    .line 123
    invoke-virtual {v8}, Lkz2;->b()I

    .line 124
    .line 125
    .line 126
    move-result v8

    .line 127
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 128
    .line 129
    .line 130
    move-result-object v9

    .line 131
    new-instance v13, Lfj1;

    .line 132
    .line 133
    invoke-direct {v13, v12, v6, v14, v8}, Lfj1;-><init>(IIII)V

    .line 134
    .line 135
    .line 136
    invoke-static {v9, v13}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    iget-object v8, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v8, Ljava/lang/Integer;

    .line 143
    .line 144
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 145
    .line 146
    .line 147
    move-result v8

    .line 148
    iget-object v6, v6, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v6, Lfj1;

    .line 151
    .line 152
    invoke-virtual {v2, v8, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_1
    const/16 v20, 0x0

    .line 157
    .line 158
    const v6, 0x6d656864

    .line 159
    .line 160
    .line 161
    if-ne v9, v6, :cond_3

    .line 162
    .line 163
    invoke-virtual {v8, v10}, Lkz2;->E(I)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v8}, Lkz2;->b()I

    .line 167
    .line 168
    .line 169
    move-result v6

    .line 170
    invoke-static {v6}, Lej1;->a(I)I

    .line 171
    .line 172
    .line 173
    move-result v6

    .line 174
    if-nez v6, :cond_2

    .line 175
    .line 176
    invoke-virtual {v8}, Lkz2;->P()J

    .line 177
    .line 178
    .line 179
    move-result-wide v8

    .line 180
    goto :goto_2

    .line 181
    :cond_2
    invoke-virtual {v8}, Lkz2;->j()J

    .line 182
    .line 183
    .line 184
    move-result-wide v8

    .line 185
    :goto_2
    move-wide v15, v8

    .line 186
    :cond_3
    :goto_3
    add-int/lit8 v5, v5, 0x1

    .line 187
    .line 188
    const/16 v6, 0xc

    .line 189
    .line 190
    goto :goto_1

    .line 191
    :cond_4
    const/16 v18, -0x1

    .line 192
    .line 193
    const/16 v20, 0x0

    .line 194
    .line 195
    const v1, 0x6d657461

    .line 196
    .line 197
    .line 198
    invoke-virtual {v3, v1}, Lm43;->j(I)Lm43;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    if-eqz v1, :cond_5

    .line 203
    .line 204
    invoke-static {v1}, Lej1;->e(Lm43;)Lwn1;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    goto :goto_4

    .line 209
    :cond_5
    const/4 v1, 0x0

    .line 210
    :goto_4
    new-instance v4, Luf1;

    .line 211
    .line 212
    invoke-direct {v4}, Luf1;-><init>()V

    .line 213
    .line 214
    .line 215
    const v5, 0x75647461

    .line 216
    .line 217
    .line 218
    invoke-virtual {v3, v5}, Lm43;->i(I)Lp43;

    .line 219
    .line 220
    .line 221
    move-result-object v5

    .line 222
    if-eqz v5, :cond_6

    .line 223
    .line 224
    invoke-static {v5}, Lej1;->c(Lp43;)Lwn1;

    .line 225
    .line 226
    .line 227
    move-result-object v9

    .line 228
    invoke-virtual {v4, v9}, Luf1;->a(Lwn1;)V

    .line 229
    .line 230
    .line 231
    move-object v12, v9

    .line 232
    goto :goto_5

    .line 233
    :cond_6
    const/4 v12, 0x0

    .line 234
    :goto_5
    new-instance v13, Lwn1;

    .line 235
    .line 236
    const v5, 0x6d766864

    .line 237
    .line 238
    .line 239
    invoke-virtual {v3, v5}, Lm43;->i(I)Lp43;

    .line 240
    .line 241
    .line 242
    move-result-object v5

    .line 243
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    iget-object v5, v5, Lp43;->c:Lkz2;

    .line 247
    .line 248
    invoke-static {v5}, Lej1;->d(Lkz2;)Lo53;

    .line 249
    .line 250
    .line 251
    move-result-object v5

    .line 252
    const/4 v6, 0x1

    .line 253
    new-array v8, v6, [Len1;

    .line 254
    .line 255
    aput-object v5, v8, v20

    .line 256
    .line 257
    invoke-direct {v13, v8}, Lwn1;-><init>([Len1;)V

    .line 258
    .line 259
    .line 260
    new-instance v10, Lgj1;

    .line 261
    .line 262
    move/from16 v5, v20

    .line 263
    .line 264
    invoke-direct {v10, v5}, Lgj1;-><init>(I)V

    .line 265
    .line 266
    .line 267
    const/4 v8, 0x0

    .line 268
    const/4 v9, 0x0

    .line 269
    move-wide v5, v15

    .line 270
    invoke-static/range {v3 .. v10}, Lej1;->b(Lm43;Luf1;JLie4;ZZLzk3;)Ljava/util/ArrayList;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 275
    .line 276
    .line 277
    move-result v5

    .line 278
    invoke-virtual {v11}, Landroid/util/SparseArray;->size()I

    .line 279
    .line 280
    .line 281
    move-result v6

    .line 282
    if-nez v6, :cond_b

    .line 283
    .line 284
    invoke-static {v3}, Lm54;->F(Ljava/util/ArrayList;)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v6

    .line 288
    const/4 v7, 0x0

    .line 289
    :goto_6
    if-ge v7, v5, :cond_a

    .line 290
    .line 291
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v8

    .line 295
    check-cast v8, Ltj1;

    .line 296
    .line 297
    iget-object v9, v8, Ltj1;->a:Lqj1;

    .line 298
    .line 299
    iget-object v10, v0, Ljj1;->G:Lnf1;

    .line 300
    .line 301
    iget v14, v9, Lqj1;->b:I

    .line 302
    .line 303
    invoke-interface {v10, v7, v14}, Lnf1;->z(II)Ljg1;

    .line 304
    .line 305
    .line 306
    move-result-object v10

    .line 307
    move v15, v7

    .line 308
    move-object/from16 v16, v8

    .line 309
    .line 310
    iget-wide v7, v9, Lqj1;->e:J

    .line 311
    .line 312
    move/from16 v17, v15

    .line 313
    .line 314
    iget-object v15, v9, Lqj1;->g:Lph4;

    .line 315
    .line 316
    move-object/from16 v19, v3

    .line 317
    .line 318
    new-instance v3, Lgg4;

    .line 319
    .line 320
    invoke-direct {v3, v15}, Lgg4;-><init>(Lph4;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v3, v6}, Lgg4;->d(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    move-object/from16 v22, v6

    .line 327
    .line 328
    const/4 v6, 0x1

    .line 329
    if-ne v14, v6, :cond_7

    .line 330
    .line 331
    iget v6, v4, Luf1;->a:I

    .line 332
    .line 333
    move/from16 v23, v5

    .line 334
    .line 335
    move/from16 v5, v18

    .line 336
    .line 337
    move-wide/from16 v24, v7

    .line 338
    .line 339
    if-eq v6, v5, :cond_8

    .line 340
    .line 341
    iget v7, v4, Luf1;->b:I

    .line 342
    .line 343
    if-eq v7, v5, :cond_8

    .line 344
    .line 345
    iput v6, v3, Lgg4;->G:I

    .line 346
    .line 347
    iput v7, v3, Lgg4;->H:I

    .line 348
    .line 349
    goto :goto_7

    .line 350
    :cond_7
    move/from16 v23, v5

    .line 351
    .line 352
    move-wide/from16 v24, v7

    .line 353
    .line 354
    :cond_8
    :goto_7
    filled-new-array {v12, v13}, [Lwn1;

    .line 355
    .line 356
    .line 357
    move-result-object v5

    .line 358
    iget-object v6, v15, Lph4;->k:Lwn1;

    .line 359
    .line 360
    invoke-static {v14, v1, v3, v6, v5}, Lwl2;->E(ILwn1;Lgg4;Lwn1;[Lwn1;)V

    .line 361
    .line 362
    .line 363
    iget v5, v9, Lqj1;->a:I

    .line 364
    .line 365
    new-instance v6, Lij1;

    .line 366
    .line 367
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 368
    .line 369
    .line 370
    move-result v7

    .line 371
    const/4 v8, 0x1

    .line 372
    if-ne v7, v8, :cond_9

    .line 373
    .line 374
    const/4 v7, 0x0

    .line 375
    invoke-virtual {v2, v7}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v8

    .line 379
    check-cast v8, Lfj1;

    .line 380
    .line 381
    goto :goto_8

    .line 382
    :cond_9
    invoke-virtual {v2, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v7

    .line 386
    move-object v8, v7

    .line 387
    check-cast v8, Lfj1;

    .line 388
    .line 389
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 390
    .line 391
    .line 392
    :goto_8
    new-instance v7, Lph4;

    .line 393
    .line 394
    invoke-direct {v7, v3}, Lph4;-><init>(Lgg4;)V

    .line 395
    .line 396
    .line 397
    move-object/from16 v3, v16

    .line 398
    .line 399
    invoke-direct {v6, v10, v3, v8, v7}, Lij1;-><init>(Ljg1;Ltj1;Lfj1;Lph4;)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v11, v5, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 403
    .line 404
    .line 405
    iget-wide v5, v0, Ljj1;->y:J

    .line 406
    .line 407
    move-wide/from16 v7, v24

    .line 408
    .line 409
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 410
    .line 411
    .line 412
    move-result-wide v5

    .line 413
    iput-wide v5, v0, Ljj1;->y:J

    .line 414
    .line 415
    add-int/lit8 v7, v17, 0x1

    .line 416
    .line 417
    move-object/from16 v3, v19

    .line 418
    .line 419
    move-object/from16 v6, v22

    .line 420
    .line 421
    move/from16 v5, v23

    .line 422
    .line 423
    const/16 v18, -0x1

    .line 424
    .line 425
    goto/16 :goto_6

    .line 426
    .line 427
    :cond_a
    iget-object v1, v0, Ljj1;->G:Lnf1;

    .line 428
    .line 429
    invoke-interface {v1}, Lnf1;->s()V

    .line 430
    .line 431
    .line 432
    goto/16 :goto_0

    .line 433
    .line 434
    :cond_b
    move-object/from16 v19, v3

    .line 435
    .line 436
    move/from16 v23, v5

    .line 437
    .line 438
    invoke-virtual {v11}, Landroid/util/SparseArray;->size()I

    .line 439
    .line 440
    .line 441
    move-result v1

    .line 442
    move/from16 v3, v23

    .line 443
    .line 444
    if-ne v1, v3, :cond_c

    .line 445
    .line 446
    const/4 v1, 0x1

    .line 447
    goto :goto_9

    .line 448
    :cond_c
    const/4 v1, 0x0

    .line 449
    :goto_9
    invoke-static {v1}, Lzt0;->b0(Z)V

    .line 450
    .line 451
    .line 452
    const/4 v1, 0x0

    .line 453
    :goto_a
    if-ge v1, v3, :cond_0

    .line 454
    .line 455
    move-object/from16 v4, v19

    .line 456
    .line 457
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v5

    .line 461
    check-cast v5, Ltj1;

    .line 462
    .line 463
    iget-object v6, v5, Ltj1;->a:Lqj1;

    .line 464
    .line 465
    iget v6, v6, Lqj1;->a:I

    .line 466
    .line 467
    invoke-virtual {v11, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v7

    .line 471
    check-cast v7, Lij1;

    .line 472
    .line 473
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 474
    .line 475
    .line 476
    move-result v8

    .line 477
    const/4 v9, 0x1

    .line 478
    if-ne v8, v9, :cond_d

    .line 479
    .line 480
    const/4 v8, 0x0

    .line 481
    invoke-virtual {v2, v8}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v6

    .line 485
    check-cast v6, Lfj1;

    .line 486
    .line 487
    goto :goto_b

    .line 488
    :cond_d
    invoke-virtual {v2, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v6

    .line 492
    check-cast v6, Lfj1;

    .line 493
    .line 494
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 495
    .line 496
    .line 497
    :goto_b
    iput-object v5, v7, Lij1;->d:Ltj1;

    .line 498
    .line 499
    iput-object v6, v7, Lij1;->e:Lfj1;

    .line 500
    .line 501
    iget-object v5, v7, Lij1;->a:Ljg1;

    .line 502
    .line 503
    iget-object v6, v7, Lij1;->j:Lph4;

    .line 504
    .line 505
    invoke-interface {v5, v6}, Ljg1;->d(Lph4;)V

    .line 506
    .line 507
    .line 508
    invoke-virtual {v7}, Lij1;->a()V

    .line 509
    .line 510
    .line 511
    add-int/lit8 v1, v1, 0x1

    .line 512
    .line 513
    move-object/from16 v19, v4

    .line 514
    .line 515
    goto :goto_a

    .line 516
    :cond_e
    const v5, 0x6d6f6f66

    .line 517
    .line 518
    .line 519
    if-ne v2, v5, :cond_53

    .line 520
    .line 521
    iget-object v1, v3, Lm43;->e:Ljava/util/ArrayList;

    .line 522
    .line 523
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 524
    .line 525
    .line 526
    move-result v2

    .line 527
    const/4 v5, 0x0

    .line 528
    :goto_c
    if-ge v5, v2, :cond_4d

    .line 529
    .line 530
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object v3

    .line 534
    check-cast v3, Lm43;

    .line 535
    .line 536
    iget v6, v3, Ltd;->b:I

    .line 537
    .line 538
    const v7, 0x74726166

    .line 539
    .line 540
    .line 541
    if-ne v6, v7, :cond_4c

    .line 542
    .line 543
    const v6, 0x74666864

    .line 544
    .line 545
    .line 546
    invoke-virtual {v3, v6}, Lm43;->i(I)Lp43;

    .line 547
    .line 548
    .line 549
    move-result-object v6

    .line 550
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 551
    .line 552
    .line 553
    iget-object v6, v6, Lp43;->c:Lkz2;

    .line 554
    .line 555
    invoke-virtual {v6, v10}, Lkz2;->E(I)V

    .line 556
    .line 557
    .line 558
    invoke-virtual {v6}, Lkz2;->b()I

    .line 559
    .line 560
    .line 561
    move-result v7

    .line 562
    sget-object v8, Lej1;->a:[B

    .line 563
    .line 564
    invoke-virtual {v6}, Lkz2;->b()I

    .line 565
    .line 566
    .line 567
    move-result v8

    .line 568
    invoke-virtual {v11, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    move-result-object v8

    .line 572
    check-cast v8, Lij1;

    .line 573
    .line 574
    if-nez v8, :cond_f

    .line 575
    .line 576
    const/4 v8, 0x0

    .line 577
    const/16 v18, -0x1

    .line 578
    .line 579
    goto :goto_11

    .line 580
    :cond_f
    iget-object v9, v8, Lij1;->b:Lsj1;

    .line 581
    .line 582
    and-int/lit8 v12, v7, 0x1

    .line 583
    .line 584
    if-eqz v12, :cond_10

    .line 585
    .line 586
    invoke-virtual {v6}, Lkz2;->j()J

    .line 587
    .line 588
    .line 589
    move-result-wide v12

    .line 590
    iput-wide v12, v9, Lsj1;->b:J

    .line 591
    .line 592
    iput-wide v12, v9, Lsj1;->c:J

    .line 593
    .line 594
    :cond_10
    iget-object v12, v8, Lij1;->e:Lfj1;

    .line 595
    .line 596
    and-int/lit8 v13, v7, 0x2

    .line 597
    .line 598
    if-eqz v13, :cond_11

    .line 599
    .line 600
    invoke-virtual {v6}, Lkz2;->b()I

    .line 601
    .line 602
    .line 603
    move-result v13

    .line 604
    const/16 v18, -0x1

    .line 605
    .line 606
    add-int/lit8 v13, v13, -0x1

    .line 607
    .line 608
    goto :goto_d

    .line 609
    :cond_11
    const/16 v18, -0x1

    .line 610
    .line 611
    iget v13, v12, Lfj1;->a:I

    .line 612
    .line 613
    :goto_d
    and-int/lit8 v14, v7, 0x8

    .line 614
    .line 615
    if-eqz v14, :cond_12

    .line 616
    .line 617
    invoke-virtual {v6}, Lkz2;->b()I

    .line 618
    .line 619
    .line 620
    move-result v14

    .line 621
    goto :goto_e

    .line 622
    :cond_12
    iget v14, v12, Lfj1;->b:I

    .line 623
    .line 624
    :goto_e
    and-int/lit8 v22, v7, 0x10

    .line 625
    .line 626
    if-eqz v22, :cond_13

    .line 627
    .line 628
    invoke-virtual {v6}, Lkz2;->b()I

    .line 629
    .line 630
    .line 631
    move-result v22

    .line 632
    move/from16 v15, v22

    .line 633
    .line 634
    goto :goto_f

    .line 635
    :cond_13
    iget v15, v12, Lfj1;->c:I

    .line 636
    .line 637
    :goto_f
    and-int/lit8 v7, v7, 0x20

    .line 638
    .line 639
    if-eqz v7, :cond_14

    .line 640
    .line 641
    invoke-virtual {v6}, Lkz2;->b()I

    .line 642
    .line 643
    .line 644
    move-result v6

    .line 645
    goto :goto_10

    .line 646
    :cond_14
    iget v6, v12, Lfj1;->d:I

    .line 647
    .line 648
    :goto_10
    new-instance v7, Lfj1;

    .line 649
    .line 650
    invoke-direct {v7, v13, v14, v15, v6}, Lfj1;-><init>(IIII)V

    .line 651
    .line 652
    .line 653
    iput-object v7, v9, Lsj1;->a:Lfj1;

    .line 654
    .line 655
    :goto_11
    if-nez v8, :cond_15

    .line 656
    .line 657
    move-object/from16 v16, v1

    .line 658
    .line 659
    move/from16 v29, v2

    .line 660
    .line 661
    move-object/from16 v30, v4

    .line 662
    .line 663
    move/from16 v31, v5

    .line 664
    .line 665
    move v15, v10

    .line 666
    const/4 v2, 0x0

    .line 667
    const/4 v8, 0x1

    .line 668
    const/16 v9, 0xc

    .line 669
    .line 670
    const/4 v10, 0x0

    .line 671
    goto/16 :goto_31

    .line 672
    .line 673
    :cond_15
    iget-object v6, v8, Lij1;->b:Lsj1;

    .line 674
    .line 675
    iget-wide v12, v6, Lsj1;->p:J

    .line 676
    .line 677
    iget-boolean v7, v6, Lsj1;->q:Z

    .line 678
    .line 679
    invoke-virtual {v8}, Lij1;->a()V

    .line 680
    .line 681
    .line 682
    const/4 v9, 0x1

    .line 683
    iput-boolean v9, v8, Lij1;->m:Z

    .line 684
    .line 685
    const v14, 0x74666474

    .line 686
    .line 687
    .line 688
    invoke-virtual {v3, v14}, Lm43;->i(I)Lp43;

    .line 689
    .line 690
    .line 691
    move-result-object v14

    .line 692
    if-eqz v14, :cond_17

    .line 693
    .line 694
    iget-object v7, v14, Lp43;->c:Lkz2;

    .line 695
    .line 696
    invoke-virtual {v7, v10}, Lkz2;->E(I)V

    .line 697
    .line 698
    .line 699
    invoke-virtual {v7}, Lkz2;->b()I

    .line 700
    .line 701
    .line 702
    move-result v12

    .line 703
    invoke-static {v12}, Lej1;->a(I)I

    .line 704
    .line 705
    .line 706
    move-result v12

    .line 707
    if-ne v12, v9, :cond_16

    .line 708
    .line 709
    invoke-virtual {v7}, Lkz2;->j()J

    .line 710
    .line 711
    .line 712
    move-result-wide v12

    .line 713
    goto :goto_12

    .line 714
    :cond_16
    invoke-virtual {v7}, Lkz2;->P()J

    .line 715
    .line 716
    .line 717
    move-result-wide v12

    .line 718
    :goto_12
    iput-wide v12, v6, Lsj1;->p:J

    .line 719
    .line 720
    iput-boolean v9, v6, Lsj1;->q:Z

    .line 721
    .line 722
    goto :goto_13

    .line 723
    :cond_17
    iput-wide v12, v6, Lsj1;->p:J

    .line 724
    .line 725
    iput-boolean v7, v6, Lsj1;->q:Z

    .line 726
    .line 727
    :goto_13
    iget-object v7, v3, Lm43;->d:Ljava/util/ArrayList;

    .line 728
    .line 729
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 730
    .line 731
    .line 732
    move-result v9

    .line 733
    const/4 v12, 0x0

    .line 734
    const/4 v13, 0x0

    .line 735
    const/4 v14, 0x0

    .line 736
    :goto_14
    const v15, 0x7472756e

    .line 737
    .line 738
    .line 739
    if-ge v12, v9, :cond_19

    .line 740
    .line 741
    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 742
    .line 743
    .line 744
    move-result-object v16

    .line 745
    move-object/from16 v10, v16

    .line 746
    .line 747
    check-cast v10, Lp43;

    .line 748
    .line 749
    move-object/from16 v16, v1

    .line 750
    .line 751
    iget v1, v10, Ltd;->b:I

    .line 752
    .line 753
    if-ne v1, v15, :cond_18

    .line 754
    .line 755
    iget-object v1, v10, Lp43;->c:Lkz2;

    .line 756
    .line 757
    const/16 v10, 0xc

    .line 758
    .line 759
    invoke-virtual {v1, v10}, Lkz2;->E(I)V

    .line 760
    .line 761
    .line 762
    invoke-virtual {v1}, Lkz2;->h()I

    .line 763
    .line 764
    .line 765
    move-result v1

    .line 766
    if-lez v1, :cond_18

    .line 767
    .line 768
    add-int/2addr v14, v1

    .line 769
    add-int/lit8 v13, v13, 0x1

    .line 770
    .line 771
    :cond_18
    add-int/lit8 v12, v12, 0x1

    .line 772
    .line 773
    move-object/from16 v1, v16

    .line 774
    .line 775
    const/16 v10, 0x8

    .line 776
    .line 777
    goto :goto_14

    .line 778
    :cond_19
    move-object/from16 v16, v1

    .line 779
    .line 780
    const/4 v1, 0x0

    .line 781
    iput v1, v8, Lij1;->h:I

    .line 782
    .line 783
    iput v1, v8, Lij1;->g:I

    .line 784
    .line 785
    iput v1, v8, Lij1;->f:I

    .line 786
    .line 787
    iput v13, v6, Lsj1;->d:I

    .line 788
    .line 789
    iput v14, v6, Lsj1;->e:I

    .line 790
    .line 791
    iget-object v1, v6, Lsj1;->g:[I

    .line 792
    .line 793
    array-length v1, v1

    .line 794
    if-ge v1, v13, :cond_1a

    .line 795
    .line 796
    new-array v1, v13, [J

    .line 797
    .line 798
    iput-object v1, v6, Lsj1;->f:[J

    .line 799
    .line 800
    new-array v1, v13, [I

    .line 801
    .line 802
    iput-object v1, v6, Lsj1;->g:[I

    .line 803
    .line 804
    :cond_1a
    iget-object v1, v6, Lsj1;->h:[I

    .line 805
    .line 806
    array-length v1, v1

    .line 807
    if-ge v1, v14, :cond_1b

    .line 808
    .line 809
    mul-int/lit8 v14, v14, 0x7d

    .line 810
    .line 811
    div-int/lit8 v14, v14, 0x64

    .line 812
    .line 813
    new-array v1, v14, [I

    .line 814
    .line 815
    iput-object v1, v6, Lsj1;->h:[I

    .line 816
    .line 817
    new-array v1, v14, [J

    .line 818
    .line 819
    iput-object v1, v6, Lsj1;->i:[J

    .line 820
    .line 821
    new-array v1, v14, [Z

    .line 822
    .line 823
    iput-object v1, v6, Lsj1;->j:[Z

    .line 824
    .line 825
    new-array v1, v14, [Z

    .line 826
    .line 827
    iput-object v1, v6, Lsj1;->l:[Z

    .line 828
    .line 829
    :cond_1b
    const/4 v1, 0x0

    .line 830
    const/4 v10, 0x0

    .line 831
    const/4 v12, 0x0

    .line 832
    :goto_15
    const-wide/16 v25, 0x0

    .line 833
    .line 834
    if-ge v1, v9, :cond_2e

    .line 835
    .line 836
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 837
    .line 838
    .line 839
    move-result-object v14

    .line 840
    check-cast v14, Lp43;

    .line 841
    .line 842
    const/16 v27, 0x10

    .line 843
    .line 844
    iget v13, v14, Ltd;->b:I

    .line 845
    .line 846
    if-ne v13, v15, :cond_2d

    .line 847
    .line 848
    add-int/lit8 v13, v10, 0x1

    .line 849
    .line 850
    iget-object v14, v14, Lp43;->c:Lkz2;

    .line 851
    .line 852
    const/16 v15, 0x8

    .line 853
    .line 854
    invoke-virtual {v14, v15}, Lkz2;->E(I)V

    .line 855
    .line 856
    .line 857
    invoke-virtual {v14}, Lkz2;->b()I

    .line 858
    .line 859
    .line 860
    move-result v15

    .line 861
    move/from16 v28, v1

    .line 862
    .line 863
    iget-object v1, v8, Lij1;->d:Ltj1;

    .line 864
    .line 865
    iget-object v1, v1, Ltj1;->a:Lqj1;

    .line 866
    .line 867
    move/from16 v29, v2

    .line 868
    .line 869
    iget-object v2, v6, Lsj1;->a:Lfj1;

    .line 870
    .line 871
    sget-object v30, Lv23;->a:Ljava/lang/String;

    .line 872
    .line 873
    move-object/from16 v30, v4

    .line 874
    .line 875
    iget-object v4, v6, Lsj1;->g:[I

    .line 876
    .line 877
    invoke-virtual {v14}, Lkz2;->h()I

    .line 878
    .line 879
    .line 880
    move-result v31

    .line 881
    aput v31, v4, v10

    .line 882
    .line 883
    iget-object v4, v6, Lsj1;->f:[J

    .line 884
    .line 885
    move-object/from16 v32, v4

    .line 886
    .line 887
    move/from16 v31, v5

    .line 888
    .line 889
    iget-wide v4, v6, Lsj1;->b:J

    .line 890
    .line 891
    aput-wide v4, v32, v10

    .line 892
    .line 893
    and-int/lit8 v33, v15, 0x1

    .line 894
    .line 895
    if-eqz v33, :cond_1c

    .line 896
    .line 897
    move-wide/from16 v33, v4

    .line 898
    .line 899
    invoke-virtual {v14}, Lkz2;->b()I

    .line 900
    .line 901
    .line 902
    move-result v4

    .line 903
    int-to-long v4, v4

    .line 904
    add-long v4, v33, v4

    .line 905
    .line 906
    aput-wide v4, v32, v10

    .line 907
    .line 908
    :cond_1c
    and-int/lit8 v4, v15, 0x4

    .line 909
    .line 910
    if-eqz v4, :cond_1d

    .line 911
    .line 912
    const/4 v4, 0x1

    .line 913
    goto :goto_16

    .line 914
    :cond_1d
    const/4 v4, 0x0

    .line 915
    :goto_16
    iget v5, v2, Lfj1;->d:I

    .line 916
    .line 917
    if-eqz v4, :cond_1e

    .line 918
    .line 919
    invoke-virtual {v14}, Lkz2;->b()I

    .line 920
    .line 921
    .line 922
    move-result v32

    .line 923
    goto :goto_17

    .line 924
    :cond_1e
    move/from16 v32, v5

    .line 925
    .line 926
    :goto_17
    move/from16 v33, v4

    .line 927
    .line 928
    and-int/lit16 v4, v15, 0x100

    .line 929
    .line 930
    move/from16 v34, v4

    .line 931
    .line 932
    and-int/lit16 v4, v15, 0x200

    .line 933
    .line 934
    move/from16 v35, v4

    .line 935
    .line 936
    and-int/lit16 v4, v15, 0x400

    .line 937
    .line 938
    and-int/lit16 v15, v15, 0x800

    .line 939
    .line 940
    move/from16 v36, v4

    .line 941
    .line 942
    iget-object v4, v1, Lqj1;->i:[J

    .line 943
    .line 944
    if-eqz v4, :cond_22

    .line 945
    .line 946
    move/from16 v37, v5

    .line 947
    .line 948
    array-length v5, v4

    .line 949
    move-object/from16 v38, v4

    .line 950
    .line 951
    const/4 v4, 0x1

    .line 952
    if-ne v5, v4, :cond_23

    .line 953
    .line 954
    iget-object v4, v1, Lqj1;->j:[J

    .line 955
    .line 956
    if-nez v4, :cond_1f

    .line 957
    .line 958
    goto :goto_19

    .line 959
    :cond_1f
    const/16 v20, 0x0

    .line 960
    .line 961
    aget-wide v39, v38, v20

    .line 962
    .line 963
    cmp-long v5, v39, v25

    .line 964
    .line 965
    if-nez v5, :cond_20

    .line 966
    .line 967
    move-object/from16 v38, v4

    .line 968
    .line 969
    goto :goto_18

    .line 970
    :cond_20
    move-object/from16 v38, v4

    .line 971
    .line 972
    iget-wide v4, v1, Lqj1;->d:J

    .line 973
    .line 974
    sget-object v45, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 975
    .line 976
    const-wide/32 v41, 0xf4240

    .line 977
    .line 978
    .line 979
    move-wide/from16 v43, v4

    .line 980
    .line 981
    invoke-static/range {v39 .. v45}, Lv23;->t(JJJLjava/math/RoundingMode;)J

    .line 982
    .line 983
    .line 984
    move-result-wide v4

    .line 985
    aget-wide v41, v38, v20

    .line 986
    .line 987
    const-wide/32 v43, 0xf4240

    .line 988
    .line 989
    .line 990
    move-wide/from16 v39, v4

    .line 991
    .line 992
    iget-wide v4, v1, Lqj1;->c:J

    .line 993
    .line 994
    move-object/from16 v47, v45

    .line 995
    .line 996
    move-wide/from16 v45, v4

    .line 997
    .line 998
    invoke-static/range {v41 .. v47}, Lv23;->t(JJJLjava/math/RoundingMode;)J

    .line 999
    .line 1000
    .line 1001
    move-result-wide v4

    .line 1002
    add-long v4, v39, v4

    .line 1003
    .line 1004
    move-wide/from16 v39, v4

    .line 1005
    .line 1006
    iget-wide v4, v1, Lqj1;->e:J

    .line 1007
    .line 1008
    cmp-long v4, v39, v4

    .line 1009
    .line 1010
    if-gez v4, :cond_21

    .line 1011
    .line 1012
    goto :goto_19

    .line 1013
    :cond_21
    :goto_18
    aget-wide v4, v38, v20

    .line 1014
    .line 1015
    move-wide/from16 v25, v4

    .line 1016
    .line 1017
    goto :goto_19

    .line 1018
    :cond_22
    move/from16 v37, v5

    .line 1019
    .line 1020
    :cond_23
    :goto_19
    iget-object v4, v6, Lsj1;->h:[I

    .line 1021
    .line 1022
    iget-object v5, v6, Lsj1;->i:[J

    .line 1023
    .line 1024
    move-object/from16 v38, v4

    .line 1025
    .line 1026
    iget-object v4, v6, Lsj1;->j:[Z

    .line 1027
    .line 1028
    move-object/from16 v39, v4

    .line 1029
    .line 1030
    iget-object v4, v6, Lsj1;->g:[I

    .line 1031
    .line 1032
    aget v4, v4, v10

    .line 1033
    .line 1034
    add-int/2addr v4, v12

    .line 1035
    move/from16 v47, v9

    .line 1036
    .line 1037
    iget-wide v9, v1, Lqj1;->c:J

    .line 1038
    .line 1039
    move-wide/from16 v44, v9

    .line 1040
    .line 1041
    iget-wide v9, v6, Lsj1;->p:J

    .line 1042
    .line 1043
    :goto_1a
    if-ge v12, v4, :cond_2c

    .line 1044
    .line 1045
    if-eqz v34, :cond_24

    .line 1046
    .line 1047
    invoke-virtual {v14}, Lkz2;->b()I

    .line 1048
    .line 1049
    .line 1050
    move-result v1

    .line 1051
    goto :goto_1b

    .line 1052
    :cond_24
    iget v1, v2, Lfj1;->b:I

    .line 1053
    .line 1054
    :goto_1b
    invoke-static {v1}, Ljj1;->h(I)V

    .line 1055
    .line 1056
    .line 1057
    if-eqz v35, :cond_25

    .line 1058
    .line 1059
    invoke-virtual {v14}, Lkz2;->b()I

    .line 1060
    .line 1061
    .line 1062
    move-result v40

    .line 1063
    move/from16 v48, v4

    .line 1064
    .line 1065
    move/from16 v4, v40

    .line 1066
    .line 1067
    goto :goto_1c

    .line 1068
    :cond_25
    move/from16 v48, v4

    .line 1069
    .line 1070
    iget v4, v2, Lfj1;->c:I

    .line 1071
    .line 1072
    :goto_1c
    invoke-static {v4}, Ljj1;->h(I)V

    .line 1073
    .line 1074
    .line 1075
    if-eqz v36, :cond_26

    .line 1076
    .line 1077
    invoke-virtual {v14}, Lkz2;->b()I

    .line 1078
    .line 1079
    .line 1080
    move-result v40

    .line 1081
    move/from16 v49, v40

    .line 1082
    .line 1083
    goto :goto_1d

    .line 1084
    :cond_26
    if-nez v12, :cond_28

    .line 1085
    .line 1086
    if-eqz v33, :cond_27

    .line 1087
    .line 1088
    move/from16 v49, v32

    .line 1089
    .line 1090
    const/4 v12, 0x0

    .line 1091
    goto :goto_1d

    .line 1092
    :cond_27
    const/4 v12, 0x0

    .line 1093
    :cond_28
    move/from16 v49, v37

    .line 1094
    .line 1095
    :goto_1d
    if-eqz v15, :cond_29

    .line 1096
    .line 1097
    invoke-virtual {v14}, Lkz2;->b()I

    .line 1098
    .line 1099
    .line 1100
    move-result v40

    .line 1101
    move-object/from16 v50, v2

    .line 1102
    .line 1103
    move/from16 v2, v40

    .line 1104
    .line 1105
    :goto_1e
    move/from16 v52, v4

    .line 1106
    .line 1107
    move-object/from16 v51, v5

    .line 1108
    .line 1109
    goto :goto_1f

    .line 1110
    :cond_29
    move-object/from16 v50, v2

    .line 1111
    .line 1112
    const/4 v2, 0x0

    .line 1113
    goto :goto_1e

    .line 1114
    :goto_1f
    int-to-long v4, v2

    .line 1115
    add-long/2addr v4, v9

    .line 1116
    sub-long v40, v4, v25

    .line 1117
    .line 1118
    const-wide/32 v42, 0xf4240

    .line 1119
    .line 1120
    .line 1121
    sget-object v46, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1122
    .line 1123
    invoke-static/range {v40 .. v46}, Lv23;->t(JJJLjava/math/RoundingMode;)J

    .line 1124
    .line 1125
    .line 1126
    move-result-wide v4

    .line 1127
    aput-wide v4, v51, v12

    .line 1128
    .line 1129
    iget-boolean v2, v6, Lsj1;->q:Z

    .line 1130
    .line 1131
    if-nez v2, :cond_2a

    .line 1132
    .line 1133
    iget-object v2, v8, Lij1;->d:Ltj1;

    .line 1134
    .line 1135
    move-wide/from16 v40, v4

    .line 1136
    .line 1137
    iget-wide v4, v2, Ltj1;->h:J

    .line 1138
    .line 1139
    add-long v4, v40, v4

    .line 1140
    .line 1141
    aput-wide v4, v51, v12

    .line 1142
    .line 1143
    :cond_2a
    aput v52, v38, v12

    .line 1144
    .line 1145
    shr-int/lit8 v2, v49, 0x10

    .line 1146
    .line 1147
    const/16 v21, 0x1

    .line 1148
    .line 1149
    and-int/lit8 v2, v2, 0x1

    .line 1150
    .line 1151
    if-nez v2, :cond_2b

    .line 1152
    .line 1153
    const/4 v2, 0x1

    .line 1154
    goto :goto_20

    .line 1155
    :cond_2b
    const/4 v2, 0x0

    .line 1156
    :goto_20
    aput-boolean v2, v39, v12

    .line 1157
    .line 1158
    int-to-long v1, v1

    .line 1159
    add-long/2addr v9, v1

    .line 1160
    add-int/lit8 v12, v12, 0x1

    .line 1161
    .line 1162
    move/from16 v4, v48

    .line 1163
    .line 1164
    move-object/from16 v2, v50

    .line 1165
    .line 1166
    move-object/from16 v5, v51

    .line 1167
    .line 1168
    goto :goto_1a

    .line 1169
    :cond_2c
    move/from16 v48, v4

    .line 1170
    .line 1171
    iput-wide v9, v6, Lsj1;->p:J

    .line 1172
    .line 1173
    move v10, v13

    .line 1174
    move/from16 v12, v48

    .line 1175
    .line 1176
    goto :goto_21

    .line 1177
    :cond_2d
    move/from16 v28, v1

    .line 1178
    .line 1179
    move/from16 v29, v2

    .line 1180
    .line 1181
    move-object/from16 v30, v4

    .line 1182
    .line 1183
    move/from16 v31, v5

    .line 1184
    .line 1185
    move/from16 v47, v9

    .line 1186
    .line 1187
    :goto_21
    add-int/lit8 v1, v28, 0x1

    .line 1188
    .line 1189
    move/from16 v2, v29

    .line 1190
    .line 1191
    move-object/from16 v4, v30

    .line 1192
    .line 1193
    move/from16 v5, v31

    .line 1194
    .line 1195
    move/from16 v9, v47

    .line 1196
    .line 1197
    const v15, 0x7472756e

    .line 1198
    .line 1199
    .line 1200
    goto/16 :goto_15

    .line 1201
    .line 1202
    :cond_2e
    move/from16 v29, v2

    .line 1203
    .line 1204
    move-object/from16 v30, v4

    .line 1205
    .line 1206
    move/from16 v31, v5

    .line 1207
    .line 1208
    const/16 v27, 0x10

    .line 1209
    .line 1210
    iget-object v1, v8, Lij1;->d:Ltj1;

    .line 1211
    .line 1212
    iget-object v1, v1, Ltj1;->a:Lqj1;

    .line 1213
    .line 1214
    iget-object v2, v6, Lsj1;->a:Lfj1;

    .line 1215
    .line 1216
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1217
    .line 1218
    .line 1219
    iget v2, v2, Lfj1;->a:I

    .line 1220
    .line 1221
    iget-object v1, v1, Lqj1;->l:[Lrj1;

    .line 1222
    .line 1223
    aget-object v1, v1, v2

    .line 1224
    .line 1225
    const v2, 0x7361697a

    .line 1226
    .line 1227
    .line 1228
    invoke-virtual {v3, v2}, Lm43;->i(I)Lp43;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v2

    .line 1232
    if-eqz v2, :cond_35

    .line 1233
    .line 1234
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1235
    .line 1236
    .line 1237
    iget v4, v1, Lrj1;->d:I

    .line 1238
    .line 1239
    iget-object v2, v2, Lp43;->c:Lkz2;

    .line 1240
    .line 1241
    const/16 v15, 0x8

    .line 1242
    .line 1243
    invoke-virtual {v2, v15}, Lkz2;->E(I)V

    .line 1244
    .line 1245
    .line 1246
    invoke-virtual {v2}, Lkz2;->b()I

    .line 1247
    .line 1248
    .line 1249
    move-result v5

    .line 1250
    const/4 v9, 0x1

    .line 1251
    and-int/2addr v5, v9

    .line 1252
    if-ne v5, v9, :cond_2f

    .line 1253
    .line 1254
    invoke-virtual {v2, v15}, Lkz2;->G(I)V

    .line 1255
    .line 1256
    .line 1257
    :cond_2f
    invoke-virtual {v2}, Lkz2;->K()I

    .line 1258
    .line 1259
    .line 1260
    move-result v5

    .line 1261
    invoke-virtual {v2}, Lkz2;->h()I

    .line 1262
    .line 1263
    .line 1264
    move-result v8

    .line 1265
    iget v9, v6, Lsj1;->e:I

    .line 1266
    .line 1267
    if-gt v8, v9, :cond_34

    .line 1268
    .line 1269
    if-nez v5, :cond_32

    .line 1270
    .line 1271
    iget-object v5, v6, Lsj1;->l:[Z

    .line 1272
    .line 1273
    const/4 v9, 0x0

    .line 1274
    const/4 v10, 0x0

    .line 1275
    :goto_22
    if-ge v9, v8, :cond_31

    .line 1276
    .line 1277
    invoke-virtual {v2}, Lkz2;->K()I

    .line 1278
    .line 1279
    .line 1280
    move-result v12

    .line 1281
    add-int/2addr v10, v12

    .line 1282
    if-le v12, v4, :cond_30

    .line 1283
    .line 1284
    const/4 v12, 0x1

    .line 1285
    goto :goto_23

    .line 1286
    :cond_30
    const/4 v12, 0x0

    .line 1287
    :goto_23
    aput-boolean v12, v5, v9

    .line 1288
    .line 1289
    add-int/lit8 v9, v9, 0x1

    .line 1290
    .line 1291
    goto :goto_22

    .line 1292
    :cond_31
    const/4 v5, 0x0

    .line 1293
    goto :goto_25

    .line 1294
    :cond_32
    if-le v5, v4, :cond_33

    .line 1295
    .line 1296
    const/4 v2, 0x1

    .line 1297
    goto :goto_24

    .line 1298
    :cond_33
    const/4 v2, 0x0

    .line 1299
    :goto_24
    mul-int v10, v5, v8

    .line 1300
    .line 1301
    iget-object v4, v6, Lsj1;->l:[Z

    .line 1302
    .line 1303
    const/4 v5, 0x0

    .line 1304
    invoke-static {v4, v5, v8, v2}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 1305
    .line 1306
    .line 1307
    :goto_25
    iget-object v2, v6, Lsj1;->l:[Z

    .line 1308
    .line 1309
    iget v4, v6, Lsj1;->e:I

    .line 1310
    .line 1311
    invoke-static {v2, v8, v4, v5}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 1312
    .line 1313
    .line 1314
    if-lez v10, :cond_35

    .line 1315
    .line 1316
    iget-object v2, v6, Lsj1;->n:Lkz2;

    .line 1317
    .line 1318
    invoke-virtual {v2, v10}, Lkz2;->y(I)V

    .line 1319
    .line 1320
    .line 1321
    const/4 v9, 0x1

    .line 1322
    iput-boolean v9, v6, Lsj1;->k:Z

    .line 1323
    .line 1324
    iput-boolean v9, v6, Lsj1;->o:Z

    .line 1325
    .line 1326
    goto :goto_26

    .line 1327
    :cond_34
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1328
    .line 1329
    .line 1330
    move-result-object v1

    .line 1331
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1332
    .line 1333
    .line 1334
    move-result v1

    .line 1335
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v2

    .line 1339
    add-int/lit8 v1, v1, 0x38

    .line 1340
    .line 1341
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 1342
    .line 1343
    .line 1344
    move-result v2

    .line 1345
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1346
    .line 1347
    add-int/2addr v1, v2

    .line 1348
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1349
    .line 1350
    .line 1351
    const-string v1, "Saiz sample count "

    .line 1352
    .line 1353
    const-string v2, " is greater than fragment sample count"

    .line 1354
    .line 1355
    invoke-static {v3, v1, v8, v2, v9}, Lga1;->l(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;

    .line 1356
    .line 1357
    .line 1358
    move-result-object v1

    .line 1359
    const/4 v2, 0x0

    .line 1360
    invoke-static {v2, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 1361
    .line 1362
    .line 1363
    move-result-object v1

    .line 1364
    throw v1

    .line 1365
    :cond_35
    :goto_26
    const v2, 0x7361696f

    .line 1366
    .line 1367
    .line 1368
    invoke-virtual {v3, v2}, Lm43;->i(I)Lp43;

    .line 1369
    .line 1370
    .line 1371
    move-result-object v2

    .line 1372
    if-eqz v2, :cond_38

    .line 1373
    .line 1374
    iget-object v2, v2, Lp43;->c:Lkz2;

    .line 1375
    .line 1376
    const/16 v15, 0x8

    .line 1377
    .line 1378
    invoke-virtual {v2, v15}, Lkz2;->E(I)V

    .line 1379
    .line 1380
    .line 1381
    invoke-virtual {v2}, Lkz2;->b()I

    .line 1382
    .line 1383
    .line 1384
    move-result v4

    .line 1385
    and-int/lit8 v5, v4, 0x1

    .line 1386
    .line 1387
    const/4 v9, 0x1

    .line 1388
    if-ne v5, v9, :cond_36

    .line 1389
    .line 1390
    invoke-virtual {v2, v15}, Lkz2;->G(I)V

    .line 1391
    .line 1392
    .line 1393
    :cond_36
    invoke-virtual {v2}, Lkz2;->h()I

    .line 1394
    .line 1395
    .line 1396
    move-result v5

    .line 1397
    if-ne v5, v9, :cond_39

    .line 1398
    .line 1399
    invoke-static {v4}, Lej1;->a(I)I

    .line 1400
    .line 1401
    .line 1402
    move-result v4

    .line 1403
    iget-wide v8, v6, Lsj1;->c:J

    .line 1404
    .line 1405
    if-nez v4, :cond_37

    .line 1406
    .line 1407
    invoke-virtual {v2}, Lkz2;->P()J

    .line 1408
    .line 1409
    .line 1410
    move-result-wide v4

    .line 1411
    goto :goto_27

    .line 1412
    :cond_37
    invoke-virtual {v2}, Lkz2;->j()J

    .line 1413
    .line 1414
    .line 1415
    move-result-wide v4

    .line 1416
    :goto_27
    add-long/2addr v8, v4

    .line 1417
    iput-wide v8, v6, Lsj1;->c:J

    .line 1418
    .line 1419
    :cond_38
    const/4 v2, 0x0

    .line 1420
    goto :goto_28

    .line 1421
    :cond_39
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1422
    .line 1423
    .line 1424
    move-result-object v1

    .line 1425
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1426
    .line 1427
    .line 1428
    move-result v1

    .line 1429
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1430
    .line 1431
    add-int/lit8 v1, v1, 0x1d

    .line 1432
    .line 1433
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1434
    .line 1435
    .line 1436
    const-string v1, "Unexpected saio entry count: "

    .line 1437
    .line 1438
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1439
    .line 1440
    .line 1441
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1442
    .line 1443
    .line 1444
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v1

    .line 1448
    const/4 v2, 0x0

    .line 1449
    invoke-static {v2, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 1450
    .line 1451
    .line 1452
    move-result-object v1

    .line 1453
    throw v1

    .line 1454
    :goto_28
    const v4, 0x73656e63

    .line 1455
    .line 1456
    .line 1457
    invoke-virtual {v3, v4}, Lm43;->i(I)Lp43;

    .line 1458
    .line 1459
    .line 1460
    move-result-object v3

    .line 1461
    if-eqz v3, :cond_3a

    .line 1462
    .line 1463
    iget-object v3, v3, Lp43;->c:Lkz2;

    .line 1464
    .line 1465
    const/4 v5, 0x0

    .line 1466
    invoke-static {v3, v5, v6}, Ljj1;->i(Lkz2;ILsj1;)V

    .line 1467
    .line 1468
    .line 1469
    :cond_3a
    if-eqz v1, :cond_3b

    .line 1470
    .line 1471
    iget-object v1, v1, Lrj1;->b:Ljava/lang/String;

    .line 1472
    .line 1473
    move-object/from16 v34, v1

    .line 1474
    .line 1475
    goto :goto_29

    .line 1476
    :cond_3b
    move-object/from16 v34, v2

    .line 1477
    .line 1478
    :goto_29
    move-object v1, v2

    .line 1479
    move-object v3, v1

    .line 1480
    const/4 v4, 0x0

    .line 1481
    :goto_2a
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 1482
    .line 1483
    .line 1484
    move-result v5

    .line 1485
    if-ge v4, v5, :cond_3e

    .line 1486
    .line 1487
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1488
    .line 1489
    .line 1490
    move-result-object v5

    .line 1491
    check-cast v5, Lp43;

    .line 1492
    .line 1493
    iget-object v8, v5, Lp43;->c:Lkz2;

    .line 1494
    .line 1495
    iget v5, v5, Ltd;->b:I

    .line 1496
    .line 1497
    const v9, 0x73626770

    .line 1498
    .line 1499
    .line 1500
    const v10, 0x73656967

    .line 1501
    .line 1502
    .line 1503
    if-ne v5, v9, :cond_3c

    .line 1504
    .line 1505
    const/16 v9, 0xc

    .line 1506
    .line 1507
    invoke-virtual {v8, v9}, Lkz2;->E(I)V

    .line 1508
    .line 1509
    .line 1510
    invoke-virtual {v8}, Lkz2;->b()I

    .line 1511
    .line 1512
    .line 1513
    move-result v5

    .line 1514
    if-ne v5, v10, :cond_3d

    .line 1515
    .line 1516
    move-object v1, v8

    .line 1517
    goto :goto_2b

    .line 1518
    :cond_3c
    const/16 v9, 0xc

    .line 1519
    .line 1520
    const v12, 0x73677064

    .line 1521
    .line 1522
    .line 1523
    if-ne v5, v12, :cond_3d

    .line 1524
    .line 1525
    invoke-virtual {v8, v9}, Lkz2;->E(I)V

    .line 1526
    .line 1527
    .line 1528
    invoke-virtual {v8}, Lkz2;->b()I

    .line 1529
    .line 1530
    .line 1531
    move-result v5

    .line 1532
    if-ne v5, v10, :cond_3d

    .line 1533
    .line 1534
    move-object v3, v8

    .line 1535
    :cond_3d
    :goto_2b
    add-int/lit8 v4, v4, 0x1

    .line 1536
    .line 1537
    goto :goto_2a

    .line 1538
    :cond_3e
    const/16 v9, 0xc

    .line 1539
    .line 1540
    if-eqz v1, :cond_3f

    .line 1541
    .line 1542
    if-nez v3, :cond_40

    .line 1543
    .line 1544
    :cond_3f
    const/4 v8, 0x1

    .line 1545
    goto/16 :goto_2e

    .line 1546
    .line 1547
    :cond_40
    const/16 v15, 0x8

    .line 1548
    .line 1549
    invoke-virtual {v1, v15}, Lkz2;->E(I)V

    .line 1550
    .line 1551
    .line 1552
    invoke-virtual {v1}, Lkz2;->b()I

    .line 1553
    .line 1554
    .line 1555
    move-result v4

    .line 1556
    invoke-static {v4}, Lej1;->a(I)I

    .line 1557
    .line 1558
    .line 1559
    move-result v4

    .line 1560
    const/4 v5, 0x4

    .line 1561
    invoke-virtual {v1, v5}, Lkz2;->G(I)V

    .line 1562
    .line 1563
    .line 1564
    const/4 v8, 0x1

    .line 1565
    if-ne v4, v8, :cond_41

    .line 1566
    .line 1567
    invoke-virtual {v1, v5}, Lkz2;->G(I)V

    .line 1568
    .line 1569
    .line 1570
    :cond_41
    invoke-virtual {v1}, Lkz2;->b()I

    .line 1571
    .line 1572
    .line 1573
    move-result v1

    .line 1574
    if-ne v1, v8, :cond_47

    .line 1575
    .line 1576
    invoke-virtual {v3, v15}, Lkz2;->E(I)V

    .line 1577
    .line 1578
    .line 1579
    invoke-virtual {v3}, Lkz2;->b()I

    .line 1580
    .line 1581
    .line 1582
    move-result v1

    .line 1583
    invoke-static {v1}, Lej1;->a(I)I

    .line 1584
    .line 1585
    .line 1586
    move-result v1

    .line 1587
    invoke-virtual {v3, v5}, Lkz2;->G(I)V

    .line 1588
    .line 1589
    .line 1590
    if-ne v1, v8, :cond_43

    .line 1591
    .line 1592
    invoke-virtual {v3}, Lkz2;->P()J

    .line 1593
    .line 1594
    .line 1595
    move-result-wide v12

    .line 1596
    cmp-long v1, v12, v25

    .line 1597
    .line 1598
    if-eqz v1, :cond_42

    .line 1599
    .line 1600
    goto :goto_2c

    .line 1601
    :cond_42
    const-string v1, "Variable length description in sgpd found (unsupported)"

    .line 1602
    .line 1603
    invoke-static {v1}, Llq1;->b(Ljava/lang/String;)Llq1;

    .line 1604
    .line 1605
    .line 1606
    move-result-object v1

    .line 1607
    throw v1

    .line 1608
    :cond_43
    const/4 v4, 0x2

    .line 1609
    if-lt v1, v4, :cond_44

    .line 1610
    .line 1611
    invoke-virtual {v3, v5}, Lkz2;->G(I)V

    .line 1612
    .line 1613
    .line 1614
    :cond_44
    :goto_2c
    invoke-virtual {v3}, Lkz2;->P()J

    .line 1615
    .line 1616
    .line 1617
    move-result-wide v12

    .line 1618
    const-wide/16 v14, 0x1

    .line 1619
    .line 1620
    cmp-long v1, v12, v14

    .line 1621
    .line 1622
    if-nez v1, :cond_46

    .line 1623
    .line 1624
    const/4 v8, 0x1

    .line 1625
    invoke-virtual {v3, v8}, Lkz2;->G(I)V

    .line 1626
    .line 1627
    .line 1628
    invoke-virtual {v3}, Lkz2;->K()I

    .line 1629
    .line 1630
    .line 1631
    move-result v1

    .line 1632
    and-int/lit16 v4, v1, 0xf0

    .line 1633
    .line 1634
    shr-int/lit8 v37, v4, 0x4

    .line 1635
    .line 1636
    and-int/lit8 v38, v1, 0xf

    .line 1637
    .line 1638
    invoke-virtual {v3}, Lkz2;->K()I

    .line 1639
    .line 1640
    .line 1641
    move-result v1

    .line 1642
    if-ne v1, v8, :cond_48

    .line 1643
    .line 1644
    invoke-virtual {v3}, Lkz2;->K()I

    .line 1645
    .line 1646
    .line 1647
    move-result v35

    .line 1648
    move/from16 v1, v27

    .line 1649
    .line 1650
    new-array v4, v1, [B

    .line 1651
    .line 1652
    const/4 v5, 0x0

    .line 1653
    invoke-virtual {v3, v4, v5, v1}, Lkz2;->H([BII)V

    .line 1654
    .line 1655
    .line 1656
    if-nez v35, :cond_45

    .line 1657
    .line 1658
    invoke-virtual {v3}, Lkz2;->K()I

    .line 1659
    .line 1660
    .line 1661
    move-result v1

    .line 1662
    new-array v10, v1, [B

    .line 1663
    .line 1664
    invoke-virtual {v3, v10, v5, v1}, Lkz2;->H([BII)V

    .line 1665
    .line 1666
    .line 1667
    move-object/from16 v39, v10

    .line 1668
    .line 1669
    goto :goto_2d

    .line 1670
    :cond_45
    move-object/from16 v39, v2

    .line 1671
    .line 1672
    :goto_2d
    iput-boolean v8, v6, Lsj1;->k:Z

    .line 1673
    .line 1674
    new-instance v32, Lrj1;

    .line 1675
    .line 1676
    const/16 v33, 0x1

    .line 1677
    .line 1678
    move-object/from16 v36, v4

    .line 1679
    .line 1680
    invoke-direct/range {v32 .. v39}, Lrj1;-><init>(ZLjava/lang/String;I[BII[B)V

    .line 1681
    .line 1682
    .line 1683
    move-object/from16 v1, v32

    .line 1684
    .line 1685
    iput-object v1, v6, Lsj1;->m:Lrj1;

    .line 1686
    .line 1687
    goto :goto_2e

    .line 1688
    :cond_46
    const-string v1, "Entry count in sgpd != 1 (unsupported)."

    .line 1689
    .line 1690
    invoke-static {v1}, Llq1;->b(Ljava/lang/String;)Llq1;

    .line 1691
    .line 1692
    .line 1693
    move-result-object v1

    .line 1694
    throw v1

    .line 1695
    :cond_47
    const-string v1, "Entry count in sbgp != 1 (unsupported)."

    .line 1696
    .line 1697
    invoke-static {v1}, Llq1;->b(Ljava/lang/String;)Llq1;

    .line 1698
    .line 1699
    .line 1700
    move-result-object v1

    .line 1701
    throw v1

    .line 1702
    :cond_48
    :goto_2e
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 1703
    .line 1704
    .line 1705
    move-result v1

    .line 1706
    const/4 v5, 0x0

    .line 1707
    :goto_2f
    if-ge v5, v1, :cond_4b

    .line 1708
    .line 1709
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1710
    .line 1711
    .line 1712
    move-result-object v3

    .line 1713
    check-cast v3, Lp43;

    .line 1714
    .line 1715
    iget v4, v3, Ltd;->b:I

    .line 1716
    .line 1717
    const v10, 0x75756964

    .line 1718
    .line 1719
    .line 1720
    if-ne v4, v10, :cond_49

    .line 1721
    .line 1722
    iget-object v3, v3, Lp43;->c:Lkz2;

    .line 1723
    .line 1724
    const/16 v15, 0x8

    .line 1725
    .line 1726
    invoke-virtual {v3, v15}, Lkz2;->E(I)V

    .line 1727
    .line 1728
    .line 1729
    iget-object v4, v0, Ljj1;->h:[B

    .line 1730
    .line 1731
    const/4 v10, 0x0

    .line 1732
    const/16 v12, 0x10

    .line 1733
    .line 1734
    invoke-virtual {v3, v4, v10, v12}, Lkz2;->H([BII)V

    .line 1735
    .line 1736
    .line 1737
    sget-object v13, Ljj1;->L:[B

    .line 1738
    .line 1739
    invoke-static {v4, v13}, Ljava/util/Arrays;->equals([B[B)Z

    .line 1740
    .line 1741
    .line 1742
    move-result v4

    .line 1743
    if-eqz v4, :cond_4a

    .line 1744
    .line 1745
    invoke-static {v3, v12, v6}, Ljj1;->i(Lkz2;ILsj1;)V

    .line 1746
    .line 1747
    .line 1748
    goto :goto_30

    .line 1749
    :cond_49
    const/4 v10, 0x0

    .line 1750
    const/16 v12, 0x10

    .line 1751
    .line 1752
    const/16 v15, 0x8

    .line 1753
    .line 1754
    :cond_4a
    :goto_30
    add-int/lit8 v5, v5, 0x1

    .line 1755
    .line 1756
    goto :goto_2f

    .line 1757
    :cond_4b
    const/4 v10, 0x0

    .line 1758
    const/16 v15, 0x8

    .line 1759
    .line 1760
    goto :goto_31

    .line 1761
    :cond_4c
    move-object/from16 v16, v1

    .line 1762
    .line 1763
    move/from16 v29, v2

    .line 1764
    .line 1765
    move-object/from16 v30, v4

    .line 1766
    .line 1767
    move/from16 v31, v5

    .line 1768
    .line 1769
    move v15, v10

    .line 1770
    const/4 v2, 0x0

    .line 1771
    const/4 v8, 0x1

    .line 1772
    const/16 v9, 0xc

    .line 1773
    .line 1774
    const/4 v10, 0x0

    .line 1775
    const/16 v18, -0x1

    .line 1776
    .line 1777
    :goto_31
    add-int/lit8 v5, v31, 0x1

    .line 1778
    .line 1779
    move v10, v15

    .line 1780
    move-object/from16 v1, v16

    .line 1781
    .line 1782
    move/from16 v2, v29

    .line 1783
    .line 1784
    move-object/from16 v4, v30

    .line 1785
    .line 1786
    goto/16 :goto_c

    .line 1787
    .line 1788
    :cond_4d
    move-object/from16 v30, v4

    .line 1789
    .line 1790
    const/4 v2, 0x0

    .line 1791
    const/4 v10, 0x0

    .line 1792
    invoke-static/range {v30 .. v30}, Ljj1;->k(Ljava/util/List;)Lie4;

    .line 1793
    .line 1794
    .line 1795
    move-result-object v1

    .line 1796
    if-eqz v1, :cond_4f

    .line 1797
    .line 1798
    invoke-virtual {v11}, Landroid/util/SparseArray;->size()I

    .line 1799
    .line 1800
    .line 1801
    move-result v3

    .line 1802
    move v5, v10

    .line 1803
    :goto_32
    if-ge v5, v3, :cond_4f

    .line 1804
    .line 1805
    invoke-virtual {v11, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 1806
    .line 1807
    .line 1808
    move-result-object v4

    .line 1809
    check-cast v4, Lij1;

    .line 1810
    .line 1811
    iget-object v6, v4, Lij1;->d:Ltj1;

    .line 1812
    .line 1813
    iget-object v6, v6, Ltj1;->a:Lqj1;

    .line 1814
    .line 1815
    iget-object v7, v4, Lij1;->b:Lsj1;

    .line 1816
    .line 1817
    iget-object v7, v7, Lsj1;->a:Lfj1;

    .line 1818
    .line 1819
    sget-object v8, Lv23;->a:Ljava/lang/String;

    .line 1820
    .line 1821
    iget v7, v7, Lfj1;->a:I

    .line 1822
    .line 1823
    iget-object v6, v6, Lqj1;->l:[Lrj1;

    .line 1824
    .line 1825
    aget-object v6, v6, v7

    .line 1826
    .line 1827
    if-eqz v6, :cond_4e

    .line 1828
    .line 1829
    iget-object v6, v6, Lrj1;->b:Ljava/lang/String;

    .line 1830
    .line 1831
    goto :goto_33

    .line 1832
    :cond_4e
    move-object v6, v2

    .line 1833
    :goto_33
    invoke-virtual {v1, v6}, Lie4;->a(Ljava/lang/String;)Lie4;

    .line 1834
    .line 1835
    .line 1836
    move-result-object v6

    .line 1837
    iget-object v7, v4, Lij1;->j:Lph4;

    .line 1838
    .line 1839
    new-instance v8, Lgg4;

    .line 1840
    .line 1841
    invoke-direct {v8, v7}, Lgg4;-><init>(Lph4;)V

    .line 1842
    .line 1843
    .line 1844
    iput-object v6, v8, Lgg4;->p:Lie4;

    .line 1845
    .line 1846
    new-instance v6, Lph4;

    .line 1847
    .line 1848
    invoke-direct {v6, v8}, Lph4;-><init>(Lgg4;)V

    .line 1849
    .line 1850
    .line 1851
    iget-object v4, v4, Lij1;->a:Ljg1;

    .line 1852
    .line 1853
    invoke-interface {v4, v6}, Ljg1;->d(Lph4;)V

    .line 1854
    .line 1855
    .line 1856
    add-int/lit8 v5, v5, 0x1

    .line 1857
    .line 1858
    goto :goto_32

    .line 1859
    :cond_4f
    iget-wide v1, v0, Ljj1;->x:J

    .line 1860
    .line 1861
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    cmp-long v1, v1, v3

    .line 1867
    .line 1868
    if-eqz v1, :cond_0

    .line 1869
    .line 1870
    invoke-virtual {v11}, Landroid/util/SparseArray;->size()I

    .line 1871
    .line 1872
    .line 1873
    move-result v1

    .line 1874
    move v14, v10

    .line 1875
    :goto_34
    if-ge v14, v1, :cond_52

    .line 1876
    .line 1877
    invoke-virtual {v11, v14}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 1878
    .line 1879
    .line 1880
    move-result-object v2

    .line 1881
    check-cast v2, Lij1;

    .line 1882
    .line 1883
    iget-wide v5, v0, Ljj1;->x:J

    .line 1884
    .line 1885
    iget v7, v2, Lij1;->f:I

    .line 1886
    .line 1887
    :goto_35
    iget-object v8, v2, Lij1;->b:Lsj1;

    .line 1888
    .line 1889
    iget v9, v8, Lsj1;->e:I

    .line 1890
    .line 1891
    if-ge v7, v9, :cond_51

    .line 1892
    .line 1893
    iget-object v9, v8, Lsj1;->i:[J

    .line 1894
    .line 1895
    aget-wide v12, v9, v7

    .line 1896
    .line 1897
    cmp-long v9, v12, v5

    .line 1898
    .line 1899
    if-gtz v9, :cond_51

    .line 1900
    .line 1901
    iget-object v8, v8, Lsj1;->j:[Z

    .line 1902
    .line 1903
    aget-boolean v8, v8, v7

    .line 1904
    .line 1905
    if-eqz v8, :cond_50

    .line 1906
    .line 1907
    iput v7, v2, Lij1;->i:I

    .line 1908
    .line 1909
    :cond_50
    add-int/lit8 v7, v7, 0x1

    .line 1910
    .line 1911
    goto :goto_35

    .line 1912
    :cond_51
    add-int/lit8 v14, v14, 0x1

    .line 1913
    .line 1914
    goto :goto_34

    .line 1915
    :cond_52
    iput-wide v3, v0, Ljj1;->x:J

    .line 1916
    .line 1917
    goto/16 :goto_0

    .line 1918
    .line 1919
    :cond_53
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 1920
    .line 1921
    .line 1922
    move-result v2

    .line 1923
    if-nez v2, :cond_0

    .line 1924
    .line 1925
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 1926
    .line 1927
    .line 1928
    move-result-object v1

    .line 1929
    check-cast v1, Lm43;

    .line 1930
    .line 1931
    iget-object v1, v1, Lm43;->e:Ljava/util/ArrayList;

    .line 1932
    .line 1933
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1934
    .line 1935
    .line 1936
    goto/16 :goto_0

    .line 1937
    .line 1938
    :cond_54
    invoke-virtual {v0}, Ljj1;->a()V

    .line 1939
    .line 1940
    .line 1941
    return-void
.end method
