.class public abstract Lkg4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lfc4;


# instance fields
.field public final A:Lvw3;

.field public final B:Lvw3;

.field public final C:Lvw3;

.field public final D:Lxf4;

.field public final E:Landroid/media/MediaCodec$BufferInfo;

.field public final F:Ljava/util/ArrayDeque;

.field public final G:Lpi1;

.field public H:Lph4;

.field public I:Lph4;

.field public J:Lci3;

.field public K:Lci3;

.field public L:Lza4;

.field public final M:J

.field public N:F

.field public O:F

.field public P:Lzf4;

.field public Q:Lph4;

.field public R:Landroid/media/MediaFormat;

.field public S:Z

.field public T:F

.field public U:Ljava/util/ArrayDeque;

.field public V:Lig4;

.field public W:Lbg4;

.field public X:Z

.field public Y:Z

.field public Z:J

.field public a0:J

.field public b0:I

.field public c0:I

.field public d0:Ljava/nio/ByteBuffer;

.field public e0:Z

.field public final f:Ljava/lang/Object;

.field public f0:Z

.field public final g:I

.field public g0:Z

.field public final h:Lmr2;

.field public h0:Z

.field public i:Ljc4;

.field public i0:Z

.field public j:I

.field public j0:I

.field public k:Lxd4;

.field public k0:I

.field public l:Lpz;

.field public l0:I

.field public m:I

.field public m0:Z

.field public n:Lli4;

.field public n0:Z

.field public o:[Lph4;

.field public o0:Z

.field public p:J

.field public p0:J

.field public q:J

.field public q0:Z

.field public r:J

.field public r0:Z

.field public s:Z

.field public s0:Z

.field public t:Z

.field public t0:Ln34;

.field public u:Loz1;

.field public u0:Ljg4;

.field public v:Lkh4;

.field public v0:J

.field public w:Llj4;

.field public w0:Z

.field public final x:Lcy2;

.field public x0:Z

.field public final y:Lhd4;

.field public y0:Z

.field public final z:F

.field public z0:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(ILcy2;Lhd4;F)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lkg4;->f:Ljava/lang/Object;

    .line 10
    .line 11
    iput p1, p0, Lkg4;->g:I

    .line 12
    .line 13
    new-instance p1, Lmr2;

    .line 14
    .line 15
    const/16 v0, 0x10

    .line 16
    .line 17
    invoke-direct {p1, v0}, Lmr2;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lkg4;->h:Lmr2;

    .line 21
    .line 22
    const-wide/high16 v0, -0x8000000000000000L

    .line 23
    .line 24
    iput-wide v0, p0, Lkg4;->r:J

    .line 25
    .line 26
    sget-object p1, Loz1;->a:Law1;

    .line 27
    .line 28
    iput-object p1, p0, Lkg4;->u:Loz1;

    .line 29
    .line 30
    iput-object p2, p0, Lkg4;->x:Lcy2;

    .line 31
    .line 32
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iput-object p3, p0, Lkg4;->y:Lhd4;

    .line 36
    .line 37
    iput p4, p0, Lkg4;->z:F

    .line 38
    .line 39
    new-instance p1, Lvw3;

    .line 40
    .line 41
    const/4 p2, 0x0

    .line 42
    invoke-direct {p1, p2}, Lvw3;-><init>(I)V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Lkg4;->A:Lvw3;

    .line 46
    .line 47
    new-instance p1, Lvw3;

    .line 48
    .line 49
    invoke-direct {p1, p2}, Lvw3;-><init>(I)V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Lkg4;->B:Lvw3;

    .line 53
    .line 54
    new-instance p1, Lvw3;

    .line 55
    .line 56
    const/4 p3, 0x2

    .line 57
    invoke-direct {p1, p3}, Lvw3;-><init>(I)V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, Lkg4;->C:Lvw3;

    .line 61
    .line 62
    new-instance p1, Lxf4;

    .line 63
    .line 64
    invoke-direct {p1, p3}, Lvw3;-><init>(I)V

    .line 65
    .line 66
    .line 67
    const/16 p4, 0x20

    .line 68
    .line 69
    iput p4, p1, Lxf4;->l:I

    .line 70
    .line 71
    iput-object p1, p0, Lkg4;->D:Lxf4;

    .line 72
    .line 73
    new-instance p4, Landroid/media/MediaCodec$BufferInfo;

    .line 74
    .line 75
    invoke-direct {p4}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object p4, p0, Lkg4;->E:Landroid/media/MediaCodec$BufferInfo;

    .line 79
    .line 80
    const/high16 p4, 0x3f800000    # 1.0f

    .line 81
    .line 82
    iput p4, p0, Lkg4;->N:F

    .line 83
    .line 84
    iput p4, p0, Lkg4;->O:F

    .line 85
    .line 86
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    iput-wide v0, p0, Lkg4;->M:J

    .line 92
    .line 93
    new-instance p4, Ljava/util/ArrayDeque;

    .line 94
    .line 95
    invoke-direct {p4}, Ljava/util/ArrayDeque;-><init>()V

    .line 96
    .line 97
    .line 98
    iput-object p4, p0, Lkg4;->F:Ljava/util/ArrayDeque;

    .line 99
    .line 100
    sget-object p4, Ljg4;->f:Ljg4;

    .line 101
    .line 102
    iput-object p4, p0, Lkg4;->u0:Ljg4;

    .line 103
    .line 104
    invoke-virtual {p1, p2}, Lvw3;->j(I)V

    .line 105
    .line 106
    .line 107
    iget-object p1, p1, Lvw3;->e:Ljava/nio/ByteBuffer;

    .line 108
    .line 109
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 110
    .line 111
    .line 112
    move-result-object p4

    .line 113
    invoke-virtual {p1, p4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 114
    .line 115
    .line 116
    new-instance p1, Lpi1;

    .line 117
    .line 118
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 119
    .line 120
    .line 121
    sget-object p4, Lqf2;->a:Ljava/nio/ByteBuffer;

    .line 122
    .line 123
    iput-object p4, p1, Lpi1;->h:Ljava/lang/Object;

    .line 124
    .line 125
    iput p2, p1, Lpi1;->g:I

    .line 126
    .line 127
    iput p3, p1, Lpi1;->f:I

    .line 128
    .line 129
    iput-object p1, p0, Lkg4;->G:Lpi1;

    .line 130
    .line 131
    const/high16 p1, -0x40800000    # -1.0f

    .line 132
    .line 133
    iput p1, p0, Lkg4;->T:F

    .line 134
    .line 135
    iput p2, p0, Lkg4;->j0:I

    .line 136
    .line 137
    const/4 p1, -0x1

    .line 138
    iput p1, p0, Lkg4;->b0:I

    .line 139
    .line 140
    iput p1, p0, Lkg4;->c0:I

    .line 141
    .line 142
    iput-wide v0, p0, Lkg4;->a0:J

    .line 143
    .line 144
    iput-wide v0, p0, Lkg4;->p0:J

    .line 145
    .line 146
    iput-wide v0, p0, Lkg4;->v0:J

    .line 147
    .line 148
    iput-wide v0, p0, Lkg4;->Z:J

    .line 149
    .line 150
    iput p2, p0, Lkg4;->k0:I

    .line 151
    .line 152
    iput p2, p0, Lkg4;->l0:I

    .line 153
    .line 154
    new-instance p1, Ln34;

    .line 155
    .line 156
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 157
    .line 158
    .line 159
    iput-object p1, p0, Lkg4;->t0:Ln34;

    .line 160
    .line 161
    iput-boolean p2, p0, Lkg4;->y0:Z

    .line 162
    .line 163
    const-wide/16 p1, 0x0

    .line 164
    .line 165
    iput-wide p1, p0, Lkg4;->z0:J

    .line 166
    .line 167
    return-void
.end method

.method public static I(IZ)Z
    .locals 1

    .line 1
    and-int/lit8 p0, p0, 0x7

    .line 2
    .line 3
    const/4 v0, 0x4

    .line 4
    if-eq p0, v0, :cond_1

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x3

    .line 9
    if-ne p0, p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0

    .line 14
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 15
    return p0
.end method


# virtual methods
.method public A()V
    .locals 3

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lkg4;->b0:I

    .line 3
    .line 4
    iget-object v1, p0, Lkg4;->B:Lvw3;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    iput-object v2, v1, Lvw3;->e:Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    iput v0, p0, Lkg4;->c0:I

    .line 10
    .line 11
    iput-object v2, p0, Lkg4;->d0:Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    iput-wide v0, p0, Lkg4;->p0:J

    .line 19
    .line 20
    iget-object v2, p0, Lkg4;->u0:Ljg4;

    .line 21
    .line 22
    iput-wide v0, v2, Ljg4;->e:J

    .line 23
    .line 24
    iput-wide v0, p0, Lkg4;->v0:J

    .line 25
    .line 26
    iput-wide v0, p0, Lkg4;->a0:J

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    iput-boolean v2, p0, Lkg4;->n0:Z

    .line 30
    .line 31
    iput-wide v0, p0, Lkg4;->Z:J

    .line 32
    .line 33
    iput-boolean v2, p0, Lkg4;->m0:Z

    .line 34
    .line 35
    iput-boolean v2, p0, Lkg4;->e0:Z

    .line 36
    .line 37
    iput v2, p0, Lkg4;->k0:I

    .line 38
    .line 39
    iput v2, p0, Lkg4;->l0:I

    .line 40
    .line 41
    iget-boolean v0, p0, Lkg4;->i0:Z

    .line 42
    .line 43
    iput v0, p0, Lkg4;->j0:I

    .line 44
    .line 45
    iput-boolean v2, p0, Lkg4;->y0:Z

    .line 46
    .line 47
    const-wide/16 v0, 0x0

    .line 48
    .line 49
    iput-wide v0, p0, Lkg4;->z0:J

    .line 50
    .line 51
    return-void
.end method

.method public final B()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lkg4;->A()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lkg4;->U:Ljava/util/ArrayDeque;

    .line 6
    .line 7
    iput-object v0, p0, Lkg4;->W:Lbg4;

    .line 8
    .line 9
    iput-object v0, p0, Lkg4;->Q:Lph4;

    .line 10
    .line 11
    iput-object v0, p0, Lkg4;->R:Landroid/media/MediaFormat;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-boolean v0, p0, Lkg4;->S:Z

    .line 15
    .line 16
    iput-boolean v0, p0, Lkg4;->o0:Z

    .line 17
    .line 18
    const/high16 v1, -0x40800000    # -1.0f

    .line 19
    .line 20
    iput v1, p0, Lkg4;->T:F

    .line 21
    .line 22
    iput-boolean v0, p0, Lkg4;->X:Z

    .line 23
    .line 24
    iput-boolean v0, p0, Lkg4;->Y:Z

    .line 25
    .line 26
    iput-boolean v0, p0, Lkg4;->i0:Z

    .line 27
    .line 28
    iput v0, p0, Lkg4;->j0:I

    .line 29
    .line 30
    return-void
.end method

.method public C(Ljava/lang/IllegalStateException;Lbg4;)Lag4;
    .locals 1

    .line 1
    new-instance v0, Lag4;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lag4;-><init>(Ljava/lang/IllegalStateException;Lbg4;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public D(Lph4;)V
    .locals 0

    .line 1
    return-void
.end method

.method public E(Lvw3;)V
    .locals 0

    .line 1
    return-void
.end method

.method public F(Lvw3;)I
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public G(Lvw3;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public H(J)V
    .locals 3

    .line 1
    iput-wide p1, p0, Lkg4;->v0:J

    .line 2
    .line 3
    :goto_0
    iget-object v0, p0, Lkg4;->F:Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljg4;

    .line 16
    .line 17
    iget-wide v1, v1, Ljg4;->a:J

    .line 18
    .line 19
    cmp-long v1, p1, v1

    .line 20
    .line 21
    if-ltz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ljg4;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, Lkg4;->i0(Ljg4;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lkg4;->X()V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    return-void
.end method

.method public final J(Lph4;)I
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lkg4;->y:Lhd4;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lkg4;->K(Lhd4;Lph4;)I

    .line 4
    .line 5
    .line 6
    move-result p1
    :try_end_0
    .catch Lmg4; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return p1

    .line 8
    :catch_0
    move-exception v0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/16 v2, 0xfa2

    .line 11
    .line 12
    invoke-virtual {p0, v0, p1, v1, v2}, Lkg4;->m(Ljava/lang/Exception;Lph4;ZI)Lb84;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    throw p1
.end method

.method public abstract K(Lhd4;Lph4;)I
.end method

.method public final L(JZZ)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lkg4;->s:Z

    .line 3
    .line 4
    iput-wide p1, p0, Lkg4;->q:J

    .line 5
    .line 6
    iput-wide p1, p0, Lkg4;->r:J

    .line 7
    .line 8
    if-nez p4, :cond_1

    .line 9
    .line 10
    iget-object p4, p0, Lkg4;->n:Lli4;

    .line 11
    .line 12
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-wide v1, p0, Lkg4;->p:J

    .line 16
    .line 17
    sub-long v1, p1, v1

    .line 18
    .line 19
    invoke-interface {p4, v1, v2}, Lli4;->f(J)I

    .line 20
    .line 21
    .line 22
    move-result p4

    .line 23
    if-eqz p4, :cond_0

    .line 24
    .line 25
    const/4 p4, 0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move p4, v0

    .line 28
    :cond_1
    :goto_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lkg4;->c(JZZ)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public abstract M(Lhd4;Lph4;)Ljava/util/ArrayList;
.end method

.method public N(Lph4;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public abstract O(Lbg4;Lph4;F)Lg4;
.end method

.method public abstract P(Lbg4;Lph4;Lph4;)Lw34;
.end method

.method public Q(JJ)J
    .locals 0

    .line 1
    iget p1, p0, Lkg4;->m:I

    .line 2
    .line 3
    const/4 p2, 0x1

    .line 4
    if-ne p1, p2, :cond_1

    .line 5
    .line 6
    invoke-virtual {p0}, Lkg4;->t()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lkg4;->u()Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-wide/32 p1, 0xf4240

    .line 20
    .line 21
    .line 22
    return-wide p1

    .line 23
    :cond_1
    :goto_0
    const-wide/16 p1, 0x2710

    .line 24
    .line 25
    return-wide p1
.end method

.method public abstract R(FLph4;[Lph4;)F
.end method

.method public abstract S(JJLjava/lang/String;)V
.end method

.method public abstract T(Ljava/lang/String;)V
.end method

.method public abstract U(Ljava/lang/Exception;)V
.end method

.method public V(Lmr2;)Lw34;
    .locals 12

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lkg4;->s0:Z

    .line 3
    .line 4
    iget-object v1, p1, Lmr2;->h:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Lph4;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v2, v1, Lph4;->m:Ljava/lang/String;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v2, :cond_f

    .line 15
    .line 16
    const-string v4, "video/av01"

    .line 17
    .line 18
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const/4 v5, 0x0

    .line 23
    if-nez v4, :cond_0

    .line 24
    .line 25
    const-string v4, "video/x-vnd.on2.vp9"

    .line 26
    .line 27
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    :cond_0
    iget-object v2, v1, Lph4;->p:Ljava/util/List;

    .line 34
    .line 35
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_1

    .line 40
    .line 41
    new-instance v2, Lgg4;

    .line 42
    .line 43
    invoke-direct {v2, v1}, Lgg4;-><init>(Lph4;)V

    .line 44
    .line 45
    .line 46
    iput-object v5, v2, Lgg4;->o:Ljava/util/List;

    .line 47
    .line 48
    new-instance v1, Lph4;

    .line 49
    .line 50
    invoke-direct {v1, v2}, Lph4;-><init>(Lgg4;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    move-object v9, v1

    .line 54
    iget-object p1, p1, Lmr2;->g:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, Lci3;

    .line 57
    .line 58
    iput-object p1, p0, Lkg4;->K:Lci3;

    .line 59
    .line 60
    iput-object v9, p0, Lkg4;->H:Lph4;

    .line 61
    .line 62
    iget-boolean p1, p0, Lkg4;->f0:Z

    .line 63
    .line 64
    if-eqz p1, :cond_2

    .line 65
    .line 66
    iput-boolean v0, p0, Lkg4;->h0:Z

    .line 67
    .line 68
    return-object v5

    .line 69
    :cond_2
    iget-object p1, p0, Lkg4;->P:Lzf4;

    .line 70
    .line 71
    if-nez p1, :cond_3

    .line 72
    .line 73
    iput-object v5, p0, Lkg4;->U:Ljava/util/ArrayDeque;

    .line 74
    .line 75
    invoke-virtual {p0}, Lkg4;->v()V

    .line 76
    .line 77
    .line 78
    return-object v5

    .line 79
    :cond_3
    iget-object v1, p0, Lkg4;->W:Lbg4;

    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    iget-object v8, p0, Lkg4;->Q:Lph4;

    .line 85
    .line 86
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    iget-object v2, p0, Lkg4;->J:Lci3;

    .line 90
    .line 91
    iget-object v4, p0, Lkg4;->K:Lci3;

    .line 92
    .line 93
    if-ne v2, v4, :cond_e

    .line 94
    .line 95
    invoke-virtual {p0, v1, v8, v9}, Lkg4;->P(Lbg4;Lph4;Lph4;)Lw34;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    iget v6, v5, Lw34;->d:I

    .line 100
    .line 101
    if-eqz v6, :cond_b

    .line 102
    .line 103
    const/16 v7, 0x10

    .line 104
    .line 105
    if-eq v6, v0, :cond_8

    .line 106
    .line 107
    const/4 v10, 0x2

    .line 108
    if-eq v6, v10, :cond_6

    .line 109
    .line 110
    invoke-virtual {p0, v9}, Lkg4;->e0(Lph4;)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-nez v0, :cond_4

    .line 115
    .line 116
    :goto_0
    move v11, v7

    .line 117
    goto :goto_2

    .line 118
    :cond_4
    iput-object v9, p0, Lkg4;->Q:Lph4;

    .line 119
    .line 120
    if-eq v4, v2, :cond_5

    .line 121
    .line 122
    invoke-virtual {p0}, Lkg4;->f0()Z

    .line 123
    .line 124
    .line 125
    :cond_5
    :goto_1
    move v11, v3

    .line 126
    goto :goto_2

    .line 127
    :cond_6
    invoke-virtual {p0, v9}, Lkg4;->e0(Lph4;)Z

    .line 128
    .line 129
    .line 130
    move-result v10

    .line 131
    if-nez v10, :cond_7

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_7
    iput-boolean v0, p0, Lkg4;->i0:Z

    .line 135
    .line 136
    iput v0, p0, Lkg4;->j0:I

    .line 137
    .line 138
    iput-object v9, p0, Lkg4;->Q:Lph4;

    .line 139
    .line 140
    if-eq v4, v2, :cond_5

    .line 141
    .line 142
    invoke-virtual {p0}, Lkg4;->f0()Z

    .line 143
    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_8
    invoke-virtual {p0, v9}, Lkg4;->e0(Lph4;)Z

    .line 147
    .line 148
    .line 149
    move-result v10

    .line 150
    if-nez v10, :cond_9

    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_9
    iput-object v9, p0, Lkg4;->Q:Lph4;

    .line 154
    .line 155
    if-eq v4, v2, :cond_a

    .line 156
    .line 157
    invoke-virtual {p0}, Lkg4;->f0()Z

    .line 158
    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_a
    iget-boolean v2, p0, Lkg4;->m0:Z

    .line 162
    .line 163
    if-eqz v2, :cond_5

    .line 164
    .line 165
    iput v0, p0, Lkg4;->k0:I

    .line 166
    .line 167
    iput v0, p0, Lkg4;->l0:I

    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_b
    invoke-virtual {p0}, Lkg4;->g0()V

    .line 171
    .line 172
    .line 173
    goto :goto_1

    .line 174
    :goto_2
    if-eqz v6, :cond_d

    .line 175
    .line 176
    iget-object v0, p0, Lkg4;->P:Lzf4;

    .line 177
    .line 178
    if-ne v0, p1, :cond_c

    .line 179
    .line 180
    iget p1, p0, Lkg4;->l0:I

    .line 181
    .line 182
    const/4 v0, 0x3

    .line 183
    if-ne p1, v0, :cond_d

    .line 184
    .line 185
    :cond_c
    iget-object v7, v1, Lbg4;->a:Ljava/lang/String;

    .line 186
    .line 187
    new-instance v6, Lw34;

    .line 188
    .line 189
    const/4 v10, 0x0

    .line 190
    invoke-direct/range {v6 .. v11}, Lw34;-><init>(Ljava/lang/String;Lph4;Lph4;II)V

    .line 191
    .line 192
    .line 193
    return-object v6

    .line 194
    :cond_d
    return-object v5

    .line 195
    :cond_e
    invoke-virtual {p0}, Lkg4;->g0()V

    .line 196
    .line 197
    .line 198
    iget-object v7, v1, Lbg4;->a:Ljava/lang/String;

    .line 199
    .line 200
    new-instance v6, Lw34;

    .line 201
    .line 202
    const/4 v10, 0x0

    .line 203
    const/16 v11, 0x80

    .line 204
    .line 205
    invoke-direct/range {v6 .. v11}, Lw34;-><init>(Ljava/lang/String;Lph4;Lph4;II)V

    .line 206
    .line 207
    .line 208
    return-object v6

    .line 209
    :cond_f
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 210
    .line 211
    const-string v0, "Sample MIME type is null."

    .line 212
    .line 213
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    const/16 v0, 0xfa5

    .line 217
    .line 218
    invoke-virtual {p0, p1, v1, v3, v0}, Lkg4;->m(Ljava/lang/Exception;Lph4;ZI)Lb84;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    throw p1
.end method

.method public abstract W(Lph4;Landroid/media/MediaFormat;)V
.end method

.method public abstract X()V
.end method

.method public abstract Y(JJLzf4;Ljava/nio/ByteBuffer;IIIJZZLph4;)Z
.end method

.method public abstract Z()V
.end method

.method public abstract a0(Lvw3;)V
.end method

.method public final b0()V
    .locals 3

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide v0, p0, Lkg4;->p0:J

    .line 7
    .line 8
    iget-object v2, p0, Lkg4;->u0:Ljg4;

    .line 9
    .line 10
    iput-wide v0, v2, Ljg4;->e:J

    .line 11
    .line 12
    iput-wide v0, p0, Lkg4;->v0:J

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-boolean v0, p0, Lkg4;->h0:Z

    .line 16
    .line 17
    iget-object v1, p0, Lkg4;->D:Lxf4;

    .line 18
    .line 19
    invoke-virtual {v1}, Lxf4;->i()V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lkg4;->C:Lvw3;

    .line 23
    .line 24
    invoke-virtual {v1}, Lvw3;->i()V

    .line 25
    .line 26
    .line 27
    iput-boolean v0, p0, Lkg4;->g0:Z

    .line 28
    .line 29
    iget-object v1, p0, Lkg4;->G:Lpi1;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    sget-object v2, Lqf2;->a:Ljava/nio/ByteBuffer;

    .line 35
    .line 36
    iput-object v2, v1, Lpi1;->h:Ljava/lang/Object;

    .line 37
    .line 38
    iput v0, v1, Lpi1;->g:I

    .line 39
    .line 40
    const/4 v0, 0x2

    .line 41
    iput v0, v1, Lpi1;->f:I

    .line 42
    .line 43
    return-void
.end method

.method public c(JZZ)V
    .locals 0

    .line 1
    if-nez p4, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lkg4;->q0:Z

    .line 6
    .line 7
    iput-boolean p1, p0, Lkg4;->r0:Z

    .line 8
    .line 9
    iget-boolean p2, p0, Lkg4;->f0:Z

    .line 10
    .line 11
    const/4 p3, 0x1

    .line 12
    if-eqz p2, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0}, Lkg4;->b0()V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    iget-object p2, p0, Lkg4;->P:Lzf4;

    .line 19
    .line 20
    if-nez p2, :cond_2

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    invoke-virtual {p0}, Lkg4;->y()Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    if-eqz p2, :cond_3

    .line 28
    .line 29
    invoke-virtual {p0}, Lkg4;->x()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lkg4;->v()V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_3
    invoke-virtual {p0}, Lkg4;->z()Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-eqz p2, :cond_4

    .line 41
    .line 42
    invoke-virtual {p0}, Lkg4;->c0()V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_4
    iput-boolean p3, p0, Lkg4;->y0:Z

    .line 47
    .line 48
    :goto_0
    iget-object p2, p0, Lkg4;->u0:Ljg4;

    .line 49
    .line 50
    iget-object p2, p2, Ljg4;->d:Lts;

    .line 51
    .line 52
    invoke-virtual {p2}, Lts;->c()I

    .line 53
    .line 54
    .line 55
    move-result p4

    .line 56
    if-lez p4, :cond_5

    .line 57
    .line 58
    iput-boolean p3, p0, Lkg4;->s0:Z

    .line 59
    .line 60
    :cond_5
    monitor-enter p2

    .line 61
    :try_start_0
    iput p1, p2, Lts;->a:I

    .line 62
    .line 63
    iput p1, p2, Lts;->b:I

    .line 64
    .line 65
    iget-object p1, p2, Lts;->d:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p1, [Ljava/lang/Object;

    .line 68
    .line 69
    const/4 p3, 0x0

    .line 70
    invoke-static {p1, p3}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    .line 73
    monitor-exit p2

    .line 74
    iget-object p1, p0, Lkg4;->F:Ljava/util/ArrayDeque;

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :catchall_0
    move-exception p1

    .line 81
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    throw p1
.end method

.method public final c0()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lkg4;->P:Lzf4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lzf4;->g()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lkg4;->A()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    :goto_0
    invoke-virtual {p0}, Lkg4;->A()V

    .line 17
    .line 18
    .line 19
    throw v0
.end method

.method public abstract d()V
.end method

.method public final d0(I)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lkg4;->h:Lmr2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-object v1, v0, Lmr2;->g:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object v1, v0, Lmr2;->h:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v1, p0, Lkg4;->A:Lvw3;

    .line 9
    .line 10
    invoke-virtual {v1}, Lvw3;->i()V

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x4

    .line 14
    or-int/2addr p1, v2

    .line 15
    invoke-virtual {p0, v0, v1, p1}, Lkg4;->n(Lmr2;Lvw3;I)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    const/4 v3, -0x5

    .line 20
    const/4 v4, 0x1

    .line 21
    if-ne p1, v3, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lkg4;->V(Lmr2;)Lw34;

    .line 24
    .line 25
    .line 26
    return v4

    .line 27
    :cond_0
    const/4 v0, -0x4

    .line 28
    if-ne p1, v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ltd;->h(I)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    iput-boolean v4, p0, Lkg4;->q0:Z

    .line 37
    .line 38
    invoke-virtual {p0}, Lkg4;->h0()V

    .line 39
    .line 40
    .line 41
    :cond_1
    const/4 p1, 0x0

    .line 42
    return p1
.end method

.method public final e0(Lph4;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lkg4;->P:Lzf4;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    iget v0, p0, Lkg4;->l0:I

    .line 7
    .line 8
    const/4 v2, 0x3

    .line 9
    if-eq v0, v2, :cond_3

    .line 10
    .line 11
    iget v0, p0, Lkg4;->m:I

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget v0, p0, Lkg4;->O:F

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object v2, p0, Lkg4;->o:[Lph4;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0, p1, v2}, Lkg4;->R(FLph4;[Lph4;)F

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    iget v0, p0, Lkg4;->T:F

    .line 31
    .line 32
    cmpl-float v2, v0, p1

    .line 33
    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    const/high16 v2, -0x40800000    # -1.0f

    .line 37
    .line 38
    cmpl-float v3, p1, v2

    .line 39
    .line 40
    if-nez v3, :cond_1

    .line 41
    .line 42
    invoke-virtual {p0}, Lkg4;->g0()V

    .line 43
    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    return p1

    .line 47
    :cond_1
    cmpl-float v0, v0, v2

    .line 48
    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    iget v0, p0, Lkg4;->z:F

    .line 52
    .line 53
    cmpl-float v0, p1, v0

    .line 54
    .line 55
    if-lez v0, :cond_3

    .line 56
    .line 57
    :cond_2
    new-instance v0, Landroid/os/Bundle;

    .line 58
    .line 59
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 60
    .line 61
    .line 62
    const-string v2, "operating-rate"

    .line 63
    .line 64
    invoke-virtual {v0, v2, p1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 65
    .line 66
    .line 67
    iget-object v2, p0, Lkg4;->P:Lzf4;

    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-interface {v2, v0}, Lzf4;->c0(Landroid/os/Bundle;)V

    .line 73
    .line 74
    .line 75
    iput p1, p0, Lkg4;->T:F

    .line 76
    .line 77
    :cond_3
    :goto_0
    return v1
.end method

.method public final f0()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lkg4;->m0:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput v1, p0, Lkg4;->k0:I

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    iput v0, p0, Lkg4;->l0:I

    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    iget-object v0, p0, Lkg4;->K:Lci3;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lkg4;->J:Lci3;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput v0, p0, Lkg4;->k0:I

    .line 21
    .line 22
    iput v0, p0, Lkg4;->l0:I

    .line 23
    .line 24
    return v1
.end method

.method public final g0()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lkg4;->m0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput v0, p0, Lkg4;->k0:I

    .line 7
    .line 8
    const/4 v0, 0x3

    .line 9
    iput v0, p0, Lkg4;->l0:I

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p0}, Lkg4;->x()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lkg4;->v()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public abstract h()V
.end method

.method public final h0()V
    .locals 3

    .line 1
    iget v0, p0, Lkg4;->l0:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_2

    .line 5
    .line 6
    const/4 v2, 0x2

    .line 7
    if-eq v0, v2, :cond_1

    .line 8
    .line 9
    const/4 v2, 0x3

    .line 10
    if-eq v0, v2, :cond_0

    .line 11
    .line 12
    iput-boolean v1, p0, Lkg4;->r0:Z

    .line 13
    .line 14
    invoke-virtual {p0}, Lkg4;->Z()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-virtual {p0}, Lkg4;->x()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lkg4;->v()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    invoke-virtual {p0}, Lkg4;->c0()V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lkg4;->K:Lci3;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lkg4;->J:Lci3;

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    iput v0, p0, Lkg4;->k0:I

    .line 37
    .line 38
    iput v0, p0, Lkg4;->l0:I

    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    invoke-virtual {p0}, Lkg4;->c0()V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public i()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lkg4;->H:Lph4;

    .line 3
    .line 4
    sget-object v0, Ljg4;->f:Ljg4;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lkg4;->i0(Ljg4;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lkg4;->F:Ljava/util/ArrayDeque;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 12
    .line 13
    .line 14
    iget-boolean v0, p0, Lkg4;->f0:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, Lkg4;->f0:Z

    .line 20
    .line 21
    invoke-virtual {p0}, Lkg4;->b0()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    iget-object v0, p0, Lkg4;->P:Lzf4;

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-virtual {p0}, Lkg4;->y()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {p0}, Lkg4;->x()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_2
    invoke-virtual {p0}, Lkg4;->z()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    invoke-virtual {p0}, Lkg4;->c0()V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    const/4 v0, 0x1

    .line 51
    iput-boolean v0, p0, Lkg4;->y0:Z

    .line 52
    .line 53
    :goto_0
    return-void
.end method

.method public final i0(Ljg4;)V
    .locals 4

    .line 1
    iput-object p1, p0, Lkg4;->u0:Ljg4;

    .line 2
    .line 3
    iget-wide v0, p1, Ljg4;->c:J

    .line 4
    .line 5
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long p1, v0, v2

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, Lkg4;->w0:Z

    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public abstract j()V
.end method

.method public final j0()Ljg4;
    .locals 2

    .line 1
    iget-object v0, p0, Lkg4;->F:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->getLast()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljg4;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    iget-object v0, p0, Lkg4;->u0:Ljg4;

    .line 17
    .line 18
    return-object v0
.end method

.method public abstract k()V
.end method

.method public final k0(JJ)Z
    .locals 4

    .line 1
    cmp-long v0, p3, p1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-gez v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lkg4;->I:Lph4;

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lph4;->m:Ljava/lang/String;

    .line 12
    .line 13
    const-string v3, "audio/opus"

    .line 14
    .line 15
    invoke-static {v0, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    sub-long/2addr p1, p3

    .line 22
    const-wide/32 p3, 0x13880

    .line 23
    .line 24
    .line 25
    cmp-long p1, p1, p3

    .line 26
    .line 27
    if-gtz p1, :cond_0

    .line 28
    .line 29
    return v1

    .line 30
    :cond_0
    return v2

    .line 31
    :cond_1
    return v1
.end method

.method public final l()V
    .locals 1

    .line 1
    iget-object v0, p0, Lkg4;->i:Ljc4;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final l0([Lph4;Lli4;JJLkh4;)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lkg4;->s:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lzt0;->b0(Z)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lkg4;->n:Lli4;

    .line 9
    .line 10
    iput-object p7, p0, Lkg4;->v:Lkh4;

    .line 11
    .line 12
    iget-wide v0, p0, Lkg4;->r:J

    .line 13
    .line 14
    const-wide/high16 v2, -0x8000000000000000L

    .line 15
    .line 16
    cmp-long p2, v0, v2

    .line 17
    .line 18
    if-nez p2, :cond_0

    .line 19
    .line 20
    iput-wide p3, p0, Lkg4;->r:J

    .line 21
    .line 22
    :cond_0
    iput-object p1, p0, Lkg4;->o:[Lph4;

    .line 23
    .line 24
    iput-wide p5, p0, Lkg4;->p:J

    .line 25
    .line 26
    move-object v0, p0

    .line 27
    move-object v1, p1

    .line 28
    move-wide v2, p3

    .line 29
    move-wide v4, p5

    .line 30
    move-object v6, p7

    .line 31
    invoke-virtual/range {v0 .. v6}, Lkg4;->q0([Lph4;JJLkh4;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final m(Ljava/lang/Exception;Lph4;ZI)Lb84;
    .locals 11

    .line 1
    const/4 v0, 0x4

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    iget-boolean v1, p0, Lkg4;->t:Z

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    iput-boolean v1, p0, Lkg4;->t:Z

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    :try_start_0
    invoke-virtual {p0, p2}, Lkg4;->J(Lph4;)I

    .line 13
    .line 14
    .line 15
    move-result v2
    :try_end_0
    .catch Lb84; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    and-int/lit8 v2, v2, 0x7

    .line 17
    .line 18
    iput-boolean v1, p0, Lkg4;->t:Z

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    iput-boolean v1, p0, Lkg4;->t:Z

    .line 23
    .line 24
    throw v0

    .line 25
    :catch_0
    iput-boolean v1, p0, Lkg4;->t:Z

    .line 26
    .line 27
    :cond_0
    move v2, v0

    .line 28
    :goto_0
    invoke-virtual {p0}, Lkg4;->o()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    iget v6, p0, Lkg4;->j:I

    .line 33
    .line 34
    iget-object v9, p0, Lkg4;->v:Lkh4;

    .line 35
    .line 36
    new-instance v1, Lb84;

    .line 37
    .line 38
    if-nez p2, :cond_1

    .line 39
    .line 40
    move v8, v0

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move v8, v2

    .line 43
    :goto_1
    const/4 v2, 0x1

    .line 44
    move-object v3, p1

    .line 45
    move-object v7, p2

    .line 46
    move v10, p3

    .line 47
    move v4, p4

    .line 48
    invoke-direct/range {v1 .. v10}, Lb84;-><init>(ILjava/lang/Exception;ILjava/lang/String;ILph4;ILkh4;Z)V

    .line 49
    .line 50
    .line 51
    return-object v1
.end method

.method public m0()Lob4;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final n(Lmr2;Lvw3;I)I
    .locals 5

    .line 1
    iget-object v0, p0, Lkg4;->n:Lli4;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {v0, p1, p2, p3}, Lli4;->a(Lmr2;Lvw3;I)I

    .line 7
    .line 8
    .line 9
    move-result p3

    .line 10
    const/4 v0, -0x4

    .line 11
    if-ne p3, v0, :cond_2

    .line 12
    .line 13
    const/4 p1, 0x4

    .line 14
    invoke-virtual {p2, p1}, Ltd;->h(I)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    const-wide/high16 p1, -0x8000000000000000L

    .line 21
    .line 22
    iput-wide p1, p0, Lkg4;->r:J

    .line 23
    .line 24
    iget-boolean p1, p0, Lkg4;->s:Z

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    return v0

    .line 29
    :cond_0
    const/4 p1, -0x3

    .line 30
    return p1

    .line 31
    :cond_1
    iget-wide v0, p2, Lvw3;->g:J

    .line 32
    .line 33
    iget-wide v2, p0, Lkg4;->p:J

    .line 34
    .line 35
    add-long/2addr v0, v2

    .line 36
    iput-wide v0, p2, Lvw3;->g:J

    .line 37
    .line 38
    iget-wide p1, p0, Lkg4;->r:J

    .line 39
    .line 40
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 41
    .line 42
    .line 43
    move-result-wide p1

    .line 44
    iput-wide p1, p0, Lkg4;->r:J

    .line 45
    .line 46
    return p3

    .line 47
    :cond_2
    const/4 p2, -0x5

    .line 48
    if-ne p3, p2, :cond_3

    .line 49
    .line 50
    iget-object v0, p1, Lmr2;->h:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Lph4;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    iget-wide v1, v0, Lph4;->r:J

    .line 58
    .line 59
    const-wide v3, 0x7fffffffffffffffL

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    cmp-long v3, v1, v3

    .line 65
    .line 66
    if-eqz v3, :cond_3

    .line 67
    .line 68
    new-instance p3, Lgg4;

    .line 69
    .line 70
    invoke-direct {p3, v0}, Lgg4;-><init>(Lph4;)V

    .line 71
    .line 72
    .line 73
    iget-wide v3, p0, Lkg4;->p:J

    .line 74
    .line 75
    add-long/2addr v1, v3

    .line 76
    iput-wide v1, p3, Lgg4;->q:J

    .line 77
    .line 78
    new-instance v0, Lph4;

    .line 79
    .line 80
    invoke-direct {v0, p3}, Lph4;-><init>(Lgg4;)V

    .line 81
    .line 82
    .line 83
    iput-object v0, p1, Lmr2;->h:Ljava/lang/Object;

    .line 84
    .line 85
    return p2

    .line 86
    :cond_3
    return p3
.end method

.method public final n0()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lkg4;->r:J

    .line 2
    .line 3
    const-wide/high16 v2, -0x8000000000000000L

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public abstract o()Ljava/lang/String;
.end method

.method public final o0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lkg4;->f:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    iput-object v1, p0, Lkg4;->w:Llj4;

    .line 6
    .line 7
    monitor-exit v0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception v1

    .line 10
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    throw v1
.end method

.method public p(J)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public abstract p0(ZZ)V
.end method

.method public q(FF)V
    .locals 0

    .line 1
    iput p1, p0, Lkg4;->N:F

    .line 2
    .line 3
    iput p2, p0, Lkg4;->O:F

    .line 4
    .line 5
    iget-object p1, p0, Lkg4;->Q:Lph4;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lkg4;->e0(Lph4;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public q0([Lph4;JJLkh4;)V
    .locals 11

    .line 1
    iget-object p1, p0, Lkg4;->u0:Ljg4;

    .line 2
    .line 3
    iget-wide v0, p1, Ljg4;->c:J

    .line 4
    .line 5
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long p1, v0, v2

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    new-instance v4, Ljg4;

    .line 15
    .line 16
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    move-wide v7, p2

    .line 22
    move-wide v9, p4

    .line 23
    invoke-direct/range {v4 .. v10}, Ljg4;-><init>(JJJ)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v4}, Lkg4;->i0(Ljg4;)V

    .line 27
    .line 28
    .line 29
    iget-boolean p1, p0, Lkg4;->x0:Z

    .line 30
    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0}, Lkg4;->X()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    iget-object p1, p0, Lkg4;->F:Ljava/util/ArrayDeque;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    iget-wide v0, p0, Lkg4;->p0:J

    .line 46
    .line 47
    cmp-long v4, v0, v2

    .line 48
    .line 49
    if-eqz v4, :cond_1

    .line 50
    .line 51
    iget-wide v4, p0, Lkg4;->v0:J

    .line 52
    .line 53
    cmp-long v6, v4, v2

    .line 54
    .line 55
    if-eqz v6, :cond_3

    .line 56
    .line 57
    cmp-long v0, v4, v0

    .line 58
    .line 59
    if-ltz v0, :cond_3

    .line 60
    .line 61
    :cond_1
    new-instance v4, Ljg4;

    .line 62
    .line 63
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    move-wide v7, p2

    .line 69
    move-wide v9, p4

    .line 70
    invoke-direct/range {v4 .. v10}, Ljg4;-><init>(JJJ)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v4}, Lkg4;->i0(Ljg4;)V

    .line 74
    .line 75
    .line 76
    iget-object p1, p0, Lkg4;->u0:Ljg4;

    .line 77
    .line 78
    iget-wide p1, p1, Ljg4;->c:J

    .line 79
    .line 80
    cmp-long p1, p1, v2

    .line 81
    .line 82
    if-eqz p1, :cond_2

    .line 83
    .line 84
    invoke-virtual {p0}, Lkg4;->X()V

    .line 85
    .line 86
    .line 87
    :cond_2
    return-void

    .line 88
    :cond_3
    new-instance v0, Ljg4;

    .line 89
    .line 90
    iget-wide v1, p0, Lkg4;->p0:J

    .line 91
    .line 92
    move-wide v3, p2

    .line 93
    move-wide v5, p4

    .line 94
    invoke-direct/range {v0 .. v6}, Ljg4;-><init>(JJJ)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method public r()V
    .locals 0

    .line 1
    return-void
.end method

.method public s(JJ)V
    .locals 31

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v3, 0x1

    .line 4
    :try_start_0
    iget-boolean v0, v1, Lkg4;->r0:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v1}, Lkg4;->Z()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catch_0
    move-exception v0

    .line 13
    move v10, v3

    .line 14
    :goto_0
    const/4 v12, 0x0

    .line 15
    goto/16 :goto_2c

    .line 16
    .line 17
    :catch_1
    move-exception v0

    .line 18
    const/4 v12, 0x0

    .line 19
    goto/16 :goto_30

    .line 20
    .line 21
    :cond_0
    iget-object v0, v1, Lkg4;->H:Lph4;

    .line 22
    .line 23
    const/4 v4, 0x2

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {v1, v4}, Lkg4;->d0(I)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_57

    .line 31
    .line 32
    :cond_1
    invoke-virtual {v1}, Lkg4;->v()V

    .line 33
    .line 34
    .line 35
    iget-boolean v0, v1, Lkg4;->f0:Z
    :try_end_0
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    iget-object v7, v1, Lkg4;->h:Lmr2;

    .line 38
    .line 39
    const/4 v8, 0x4

    .line 40
    const/4 v9, -0x5

    .line 41
    iget-object v10, v1, Lkg4;->B:Lvw3;

    .line 42
    .line 43
    const/4 v11, 0x0

    .line 44
    if-eqz v0, :cond_1c

    .line 45
    .line 46
    :try_start_1
    const-string v0, "bypassRender"

    .line 47
    .line 48
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :goto_1
    iget-boolean v0, v1, Lkg4;->r0:Z

    .line 52
    .line 53
    xor-int/2addr v0, v3

    .line 54
    invoke-static {v0}, Lzt0;->b0(Z)V

    .line 55
    .line 56
    .line 57
    iget-object v0, v1, Lkg4;->D:Lxf4;

    .line 58
    .line 59
    invoke-virtual {v0}, Lxf4;->o()Z

    .line 60
    .line 61
    .line 62
    move-result v4
    :try_end_1
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_5

    .line 63
    if-eqz v4, :cond_4

    .line 64
    .line 65
    move-object v4, v7

    .line 66
    :try_start_2
    iget-object v7, v0, Lvw3;->e:Ljava/nio/ByteBuffer;

    .line 67
    .line 68
    iget v12, v1, Lkg4;->c0:I

    .line 69
    .line 70
    move-object v13, v10

    .line 71
    invoke-virtual {v0}, Lxf4;->n()I

    .line 72
    .line 73
    .line 74
    move-result v10

    .line 75
    move-object v15, v11

    .line 76
    move v14, v12

    .line 77
    iget-wide v11, v0, Lvw3;->g:J

    .line 78
    .line 79
    iget-wide v2, v1, Lkg4;->q:J

    .line 80
    .line 81
    iget-wide v5, v0, Lxf4;->j:J

    .line 82
    .line 83
    invoke-virtual {v1, v2, v3, v5, v6}, Lkg4;->k0(JJ)Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    move v3, v14

    .line 88
    invoke-virtual {v0, v8}, Ltd;->h(I)Z

    .line 89
    .line 90
    .line 91
    move-result v14

    .line 92
    move-object v5, v15

    .line 93
    iget-object v15, v1, Lkg4;->I:Lph4;

    .line 94
    .line 95
    if-eqz v15, :cond_3

    .line 96
    .line 97
    const/4 v6, 0x0

    .line 98
    move/from16 v20, v9

    .line 99
    .line 100
    const/4 v9, 0x0

    .line 101
    move v8, v3

    .line 102
    move-object/from16 v24, v4

    .line 103
    .line 104
    move-object/from16 v27, v13

    .line 105
    .line 106
    move-wide/from16 v4, p3

    .line 107
    .line 108
    move v13, v2

    .line 109
    move-wide/from16 v2, p1

    .line 110
    .line 111
    invoke-virtual/range {v1 .. v15}, Lkg4;->Y(JJLzf4;Ljava/nio/ByteBuffer;IIIJZZLph4;)Z

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    if-eqz v6, :cond_2

    .line 116
    .line 117
    iget-wide v2, v0, Lxf4;->j:J

    .line 118
    .line 119
    invoke-virtual {v1, v2, v3}, Lkg4;->H(J)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Lxf4;->i()V

    .line 123
    .line 124
    .line 125
    const/4 v2, 0x0

    .line 126
    goto :goto_3

    .line 127
    :catch_2
    move-exception v0

    .line 128
    const/4 v10, 0x1

    .line 129
    goto :goto_0

    .line 130
    :cond_2
    const/4 v3, 0x1

    .line 131
    :goto_2
    const/4 v6, 0x0

    .line 132
    goto/16 :goto_11

    .line 133
    .line 134
    :cond_3
    move-object v2, v5

    .line 135
    throw v2
    :try_end_2
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_2

    .line 136
    :cond_4
    move-object/from16 v24, v7

    .line 137
    .line 138
    move-object/from16 v27, v10

    .line 139
    .line 140
    move-object v2, v11

    .line 141
    :goto_3
    :try_start_3
    iget-boolean v3, v1, Lkg4;->q0:Z
    :try_end_3
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_3 .. :try_end_3} :catch_6
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_7

    .line 142
    .line 143
    if-eqz v3, :cond_5

    .line 144
    .line 145
    const/4 v3, 0x1

    .line 146
    :try_start_4
    iput-boolean v3, v1, Lkg4;->r0:Z
    :try_end_4
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_0

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_5
    const/4 v3, 0x1

    .line 150
    :try_start_5
    iget-boolean v4, v1, Lkg4;->g0:Z
    :try_end_5
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_5 .. :try_end_5} :catch_6
    .catch Ljava/lang/IllegalStateException; {:try_start_5 .. :try_end_5} :catch_5

    .line 151
    .line 152
    iget-object v5, v1, Lkg4;->C:Lvw3;

    .line 153
    .line 154
    if-eqz v4, :cond_6

    .line 155
    .line 156
    :try_start_6
    invoke-virtual {v0, v5}, Lxf4;->p(Lvw3;)Z

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    invoke-static {v4}, Lzt0;->b0(Z)V
    :try_end_6
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_6 .. :try_end_6} :catch_6
    .catch Ljava/lang/IllegalStateException; {:try_start_6 .. :try_end_6} :catch_5

    .line 161
    .line 162
    .line 163
    const/4 v6, 0x0

    .line 164
    :try_start_7
    iput-boolean v6, v1, Lkg4;->g0:Z

    .line 165
    .line 166
    goto :goto_7

    .line 167
    :catch_3
    move-exception v0

    .line 168
    :goto_4
    move v10, v3

    .line 169
    move v12, v6

    .line 170
    goto/16 :goto_2c

    .line 171
    .line 172
    :catch_4
    move-exception v0

    .line 173
    :goto_5
    move v12, v6

    .line 174
    goto/16 :goto_30

    .line 175
    .line 176
    :catch_5
    move-exception v0

    .line 177
    :goto_6
    const/4 v6, 0x0

    .line 178
    goto :goto_4

    .line 179
    :catch_6
    move-exception v0

    .line 180
    const/4 v6, 0x0

    .line 181
    goto :goto_5

    .line 182
    :cond_6
    const/4 v6, 0x0

    .line 183
    :goto_7
    iget-boolean v4, v1, Lkg4;->h0:Z

    .line 184
    .line 185
    if-eqz v4, :cond_8

    .line 186
    .line 187
    invoke-virtual {v0}, Lxf4;->o()Z

    .line 188
    .line 189
    .line 190
    move-result v4

    .line 191
    if-nez v4, :cond_7

    .line 192
    .line 193
    iput-boolean v6, v1, Lkg4;->f0:Z

    .line 194
    .line 195
    invoke-virtual {v1}, Lkg4;->b0()V

    .line 196
    .line 197
    .line 198
    iput-boolean v6, v1, Lkg4;->h0:Z

    .line 199
    .line 200
    invoke-virtual {v1}, Lkg4;->v()V

    .line 201
    .line 202
    .line 203
    iget-boolean v4, v1, Lkg4;->f0:Z

    .line 204
    .line 205
    if-eqz v4, :cond_1b

    .line 206
    .line 207
    goto :goto_8

    .line 208
    :cond_7
    move-object v11, v2

    .line 209
    move-object/from16 v7, v24

    .line 210
    .line 211
    move-object/from16 v10, v27

    .line 212
    .line 213
    const/4 v8, 0x4

    .line 214
    const/4 v9, -0x5

    .line 215
    goto/16 :goto_1

    .line 216
    .line 217
    :cond_8
    :goto_8
    iget-boolean v4, v1, Lkg4;->q0:Z

    .line 218
    .line 219
    xor-int/2addr v4, v3

    .line 220
    invoke-static {v4}, Lzt0;->b0(Z)V

    .line 221
    .line 222
    .line 223
    move-object/from16 v7, v24

    .line 224
    .line 225
    iput-object v2, v7, Lmr2;->g:Ljava/lang/Object;

    .line 226
    .line 227
    iput-object v2, v7, Lmr2;->h:Ljava/lang/Object;

    .line 228
    .line 229
    invoke-virtual {v5}, Lvw3;->i()V

    .line 230
    .line 231
    .line 232
    :goto_9
    invoke-virtual {v5}, Lvw3;->i()V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v1, v7, v5, v6}, Lkg4;->n(Lmr2;Lvw3;I)I

    .line 236
    .line 237
    .line 238
    move-result v4

    .line 239
    const/4 v8, -0x5

    .line 240
    if-eq v4, v8, :cond_18

    .line 241
    .line 242
    const/4 v9, -0x4

    .line 243
    if-eq v4, v9, :cond_a

    .line 244
    .line 245
    invoke-virtual {v1}, Lkg4;->n0()Z

    .line 246
    .line 247
    .line 248
    move-result v4

    .line 249
    if-eqz v4, :cond_9

    .line 250
    .line 251
    invoke-virtual {v1}, Lkg4;->j0()Ljg4;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    iget-wide v9, v1, Lkg4;->p0:J

    .line 256
    .line 257
    iput-wide v9, v4, Ljg4;->e:J

    .line 258
    .line 259
    :cond_9
    move-object/from16 v11, v27

    .line 260
    .line 261
    const/high16 v10, 0x20000000

    .line 262
    .line 263
    const/high16 v12, 0x10000000

    .line 264
    .line 265
    const/16 v25, 0x4

    .line 266
    .line 267
    goto/16 :goto_10

    .line 268
    .line 269
    :cond_a
    const/4 v9, 0x4

    .line 270
    invoke-virtual {v5, v9}, Ltd;->h(I)Z

    .line 271
    .line 272
    .line 273
    move-result v4

    .line 274
    if-eqz v4, :cond_b

    .line 275
    .line 276
    iput-boolean v3, v1, Lkg4;->q0:Z

    .line 277
    .line 278
    invoke-virtual {v1}, Lkg4;->j0()Ljg4;

    .line 279
    .line 280
    .line 281
    move-result-object v4

    .line 282
    iget-wide v10, v1, Lkg4;->p0:J

    .line 283
    .line 284
    iput-wide v10, v4, Ljg4;->e:J

    .line 285
    .line 286
    move/from16 v25, v9

    .line 287
    .line 288
    move-object/from16 v11, v27

    .line 289
    .line 290
    const/high16 v10, 0x20000000

    .line 291
    .line 292
    const/high16 v12, 0x10000000

    .line 293
    .line 294
    goto/16 :goto_10

    .line 295
    .line 296
    :cond_b
    iget-wide v10, v1, Lkg4;->p0:J

    .line 297
    .line 298
    iget-wide v12, v5, Lvw3;->g:J

    .line 299
    .line 300
    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->max(JJ)J

    .line 301
    .line 302
    .line 303
    move-result-wide v10

    .line 304
    iput-wide v10, v1, Lkg4;->p0:J

    .line 305
    .line 306
    invoke-virtual {v1}, Lkg4;->n0()Z

    .line 307
    .line 308
    .line 309
    move-result v4

    .line 310
    if-nez v4, :cond_c

    .line 311
    .line 312
    move-object/from16 v11, v27

    .line 313
    .line 314
    const/high16 v10, 0x20000000

    .line 315
    .line 316
    invoke-virtual {v11, v10}, Ltd;->h(I)Z

    .line 317
    .line 318
    .line 319
    move-result v4

    .line 320
    if-eqz v4, :cond_d

    .line 321
    .line 322
    goto :goto_a

    .line 323
    :cond_c
    move-object/from16 v11, v27

    .line 324
    .line 325
    const/high16 v10, 0x20000000

    .line 326
    .line 327
    :goto_a
    invoke-virtual {v1}, Lkg4;->j0()Ljg4;

    .line 328
    .line 329
    .line 330
    move-result-object v4

    .line 331
    iget-wide v12, v1, Lkg4;->p0:J

    .line 332
    .line 333
    iput-wide v12, v4, Ljg4;->e:J

    .line 334
    .line 335
    :cond_d
    iget-boolean v4, v1, Lkg4;->s0:Z
    :try_end_7
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_7 .. :try_end_7} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_7 .. :try_end_7} :catch_3

    .line 336
    .line 337
    const-string v12, "audio/opus"

    .line 338
    .line 339
    if-eqz v4, :cond_10

    .line 340
    .line 341
    :try_start_8
    iget-object v4, v1, Lkg4;->H:Lph4;

    .line 342
    .line 343
    if-eqz v4, :cond_f

    .line 344
    .line 345
    iput-object v4, v1, Lkg4;->I:Lph4;

    .line 346
    .line 347
    iget-object v4, v4, Lph4;->m:Ljava/lang/String;

    .line 348
    .line 349
    invoke-static {v4, v12}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    move-result v4

    .line 353
    if-eqz v4, :cond_e

    .line 354
    .line 355
    iget-object v4, v1, Lkg4;->I:Lph4;

    .line 356
    .line 357
    iget-object v4, v4, Lph4;->p:Ljava/util/List;

    .line 358
    .line 359
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 360
    .line 361
    .line 362
    move-result v4

    .line 363
    if-nez v4, :cond_e

    .line 364
    .line 365
    iget-object v4, v1, Lkg4;->I:Lph4;

    .line 366
    .line 367
    iget-object v4, v4, Lph4;->p:Ljava/util/List;

    .line 368
    .line 369
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v4

    .line 373
    check-cast v4, [B

    .line 374
    .line 375
    const/16 v13, 0xb

    .line 376
    .line 377
    aget-byte v13, v4, v13

    .line 378
    .line 379
    and-int/lit16 v13, v13, 0xff

    .line 380
    .line 381
    const/16 v14, 0xa

    .line 382
    .line 383
    aget-byte v4, v4, v14

    .line 384
    .line 385
    and-int/lit16 v4, v4, 0xff

    .line 386
    .line 387
    shl-int/lit8 v13, v13, 0x8

    .line 388
    .line 389
    or-int/2addr v4, v13

    .line 390
    iget-object v13, v1, Lkg4;->I:Lph4;

    .line 391
    .line 392
    invoke-virtual {v13}, Lph4;->a()Lgg4;

    .line 393
    .line 394
    .line 395
    move-result-object v13

    .line 396
    invoke-virtual {v13, v4}, Lgg4;->a(I)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v13}, Lgg4;->b()Lph4;

    .line 400
    .line 401
    .line 402
    move-result-object v4

    .line 403
    iput-object v4, v1, Lkg4;->I:Lph4;

    .line 404
    .line 405
    :cond_e
    iget-object v4, v1, Lkg4;->I:Lph4;

    .line 406
    .line 407
    invoke-virtual {v1, v4, v2}, Lkg4;->W(Lph4;Landroid/media/MediaFormat;)V

    .line 408
    .line 409
    .line 410
    iput-boolean v6, v1, Lkg4;->s0:Z

    .line 411
    .line 412
    goto :goto_b

    .line 413
    :cond_f
    throw v2

    .line 414
    :cond_10
    :goto_b
    invoke-virtual {v5}, Lvw3;->l()V

    .line 415
    .line 416
    .line 417
    iget-object v4, v1, Lkg4;->I:Lph4;

    .line 418
    .line 419
    if-eqz v4, :cond_13

    .line 420
    .line 421
    iget-object v4, v4, Lph4;->m:Ljava/lang/String;

    .line 422
    .line 423
    invoke-static {v4, v12}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 424
    .line 425
    .line 426
    move-result v4

    .line 427
    if-eqz v4, :cond_13

    .line 428
    .line 429
    const/high16 v12, 0x10000000

    .line 430
    .line 431
    invoke-virtual {v5, v12}, Ltd;->h(I)Z

    .line 432
    .line 433
    .line 434
    move-result v4

    .line 435
    if-eqz v4, :cond_11

    .line 436
    .line 437
    iget-object v4, v1, Lkg4;->I:Lph4;

    .line 438
    .line 439
    iput-object v4, v5, Lvw3;->c:Lph4;

    .line 440
    .line 441
    invoke-virtual {v1, v5}, Lkg4;->a0(Lvw3;)V

    .line 442
    .line 443
    .line 444
    :cond_11
    iget-wide v13, v1, Lkg4;->q:J

    .line 445
    .line 446
    move/from16 v25, v9

    .line 447
    .line 448
    iget-wide v8, v5, Lvw3;->g:J

    .line 449
    .line 450
    sub-long/2addr v13, v8

    .line 451
    const-wide/32 v8, 0x13880

    .line 452
    .line 453
    .line 454
    cmp-long v4, v13, v8

    .line 455
    .line 456
    if-gtz v4, :cond_12

    .line 457
    .line 458
    move v4, v3

    .line 459
    goto :goto_c

    .line 460
    :cond_12
    move v4, v6

    .line 461
    :goto_c
    if-eqz v4, :cond_14

    .line 462
    .line 463
    iget-object v4, v1, Lkg4;->G:Lpi1;

    .line 464
    .line 465
    iget-object v8, v1, Lkg4;->I:Lph4;

    .line 466
    .line 467
    iget-object v8, v8, Lph4;->p:Ljava/util/List;

    .line 468
    .line 469
    invoke-virtual {v4, v5, v8}, Lpi1;->c(Lvw3;Ljava/util/List;)V

    .line 470
    .line 471
    .line 472
    goto :goto_d

    .line 473
    :cond_13
    move/from16 v25, v9

    .line 474
    .line 475
    const/high16 v12, 0x10000000

    .line 476
    .line 477
    :cond_14
    :goto_d
    invoke-virtual {v0}, Lxf4;->o()Z

    .line 478
    .line 479
    .line 480
    move-result v4

    .line 481
    if-nez v4, :cond_15

    .line 482
    .line 483
    goto :goto_e

    .line 484
    :cond_15
    iget-wide v8, v1, Lkg4;->q:J

    .line 485
    .line 486
    iget-wide v13, v0, Lxf4;->j:J

    .line 487
    .line 488
    invoke-virtual {v1, v8, v9, v13, v14}, Lkg4;->k0(JJ)Z

    .line 489
    .line 490
    .line 491
    move-result v4

    .line 492
    iget-wide v13, v5, Lvw3;->g:J

    .line 493
    .line 494
    invoke-virtual {v1, v8, v9, v13, v14}, Lkg4;->k0(JJ)Z

    .line 495
    .line 496
    .line 497
    move-result v8

    .line 498
    if-ne v4, v8, :cond_17

    .line 499
    .line 500
    :goto_e
    invoke-virtual {v0, v5}, Lxf4;->p(Lvw3;)Z

    .line 501
    .line 502
    .line 503
    move-result v4

    .line 504
    if-nez v4, :cond_16

    .line 505
    .line 506
    goto :goto_f

    .line 507
    :cond_16
    move-object/from16 v27, v11

    .line 508
    .line 509
    goto/16 :goto_9

    .line 510
    .line 511
    :cond_17
    :goto_f
    iput-boolean v3, v1, Lkg4;->g0:Z

    .line 512
    .line 513
    goto :goto_10

    .line 514
    :cond_18
    move-object/from16 v11, v27

    .line 515
    .line 516
    const/high16 v10, 0x20000000

    .line 517
    .line 518
    const/high16 v12, 0x10000000

    .line 519
    .line 520
    const/16 v25, 0x4

    .line 521
    .line 522
    invoke-virtual {v1, v7}, Lkg4;->V(Lmr2;)Lw34;

    .line 523
    .line 524
    .line 525
    :goto_10
    invoke-virtual {v0}, Lxf4;->o()Z

    .line 526
    .line 527
    .line 528
    move-result v4

    .line 529
    if-eqz v4, :cond_19

    .line 530
    .line 531
    invoke-virtual {v0}, Lvw3;->l()V

    .line 532
    .line 533
    .line 534
    :cond_19
    invoke-virtual {v0}, Lxf4;->o()Z

    .line 535
    .line 536
    .line 537
    move-result v0

    .line 538
    if-nez v0, :cond_1a

    .line 539
    .line 540
    iget-boolean v0, v1, Lkg4;->q0:Z

    .line 541
    .line 542
    if-nez v0, :cond_1a

    .line 543
    .line 544
    iget-boolean v0, v1, Lkg4;->h0:Z

    .line 545
    .line 546
    if-eqz v0, :cond_1b

    .line 547
    .line 548
    :cond_1a
    move-object v10, v11

    .line 549
    move/from16 v8, v25

    .line 550
    .line 551
    const/4 v9, -0x5

    .line 552
    move-object v11, v2

    .line 553
    goto/16 :goto_1

    .line 554
    .line 555
    :cond_1b
    :goto_11
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 556
    .line 557
    .line 558
    move v10, v3

    .line 559
    move v12, v6

    .line 560
    goto/16 :goto_2b

    .line 561
    .line 562
    :catch_7
    move-exception v0

    .line 563
    const/4 v3, 0x1

    .line 564
    goto/16 :goto_6

    .line 565
    .line 566
    :cond_1c
    move/from16 v25, v8

    .line 567
    .line 568
    move-object v2, v11

    .line 569
    const/4 v6, 0x0

    .line 570
    const/high16 v12, 0x10000000

    .line 571
    .line 572
    move-object v11, v10

    .line 573
    const/high16 v10, 0x20000000

    .line 574
    .line 575
    iget-object v0, v1, Lkg4;->P:Lzf4;

    .line 576
    .line 577
    if-eqz v0, :cond_56

    .line 578
    .line 579
    iget-object v0, v1, Lkg4;->l:Lpz;

    .line 580
    .line 581
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 582
    .line 583
    .line 584
    invoke-virtual {v0}, Lpz;->n()J

    .line 585
    .line 586
    .line 587
    move-result-wide v16

    .line 588
    const-string v0, "drainAndFeed"

    .line 589
    .line 590
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 591
    .line 592
    .line 593
    :goto_12
    iget-object v0, v1, Lkg4;->P:Lzf4;

    .line 594
    .line 595
    if-eqz v0, :cond_55

    .line 596
    .line 597
    iget v5, v1, Lkg4;->c0:I
    :try_end_8
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_8 .. :try_end_8} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_8 .. :try_end_8} :catch_3

    .line 598
    .line 599
    if-ltz v5, :cond_1d

    .line 600
    .line 601
    move v5, v3

    .line 602
    goto :goto_13

    .line 603
    :cond_1d
    move v5, v6

    .line 604
    :goto_13
    iget-wide v8, v1, Lkg4;->M:J

    .line 605
    .line 606
    const/4 v13, -0x1

    .line 607
    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    iget-object v14, v1, Lkg4;->E:Landroid/media/MediaCodec$BufferInfo;

    .line 613
    .line 614
    if-nez v5, :cond_29

    .line 615
    .line 616
    :try_start_9
    invoke-interface {v0, v14}, Lzf4;->r(Landroid/media/MediaCodec$BufferInfo;)I

    .line 617
    .line 618
    .line 619
    move-result v5
    :try_end_9
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_9 .. :try_end_9} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_9 .. :try_end_9} :catch_8

    .line 620
    if-gez v5, :cond_23

    .line 621
    .line 622
    const/4 v0, -0x2

    .line 623
    if-ne v5, v0, :cond_1f

    .line 624
    .line 625
    :try_start_a
    iput-boolean v3, v1, Lkg4;->o0:Z

    .line 626
    .line 627
    iget-object v0, v1, Lkg4;->P:Lzf4;

    .line 628
    .line 629
    if-eqz v0, :cond_1e

    .line 630
    .line 631
    invoke-interface {v0}, Lzf4;->e()Landroid/media/MediaFormat;

    .line 632
    .line 633
    .line 634
    move-result-object v0

    .line 635
    iput-object v0, v1, Lkg4;->R:Landroid/media/MediaFormat;

    .line 636
    .line 637
    iput-boolean v3, v1, Lkg4;->S:Z

    .line 638
    .line 639
    move-object v15, v2

    .line 640
    move-object/from16 v29, v7

    .line 641
    .line 642
    move-wide/from16 v21, v8

    .line 643
    .line 644
    move-object/from16 v30, v11

    .line 645
    .line 646
    move v3, v13

    .line 647
    move/from16 v9, v25

    .line 648
    .line 649
    goto/16 :goto_19

    .line 650
    .line 651
    :cond_1e
    throw v2

    .line 652
    :cond_1f
    iget-boolean v0, v1, Lkg4;->Y:Z

    .line 653
    .line 654
    if-eqz v0, :cond_21

    .line 655
    .line 656
    iget-boolean v0, v1, Lkg4;->q0:Z

    .line 657
    .line 658
    if-nez v0, :cond_20

    .line 659
    .line 660
    iget v0, v1, Lkg4;->k0:I

    .line 661
    .line 662
    if-ne v0, v4, :cond_21

    .line 663
    .line 664
    :cond_20
    invoke-virtual {v1}, Lkg4;->h0()V

    .line 665
    .line 666
    .line 667
    :cond_21
    iget-wide v14, v1, Lkg4;->Z:J

    .line 668
    .line 669
    cmp-long v0, v14, v18

    .line 670
    .line 671
    if-eqz v0, :cond_22

    .line 672
    .line 673
    const-wide/16 v21, 0x64

    .line 674
    .line 675
    add-long v14, v14, v21

    .line 676
    .line 677
    iget-object v0, v1, Lkg4;->l:Lpz;

    .line 678
    .line 679
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 680
    .line 681
    .line 682
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 683
    .line 684
    .line 685
    move-result-wide v21

    .line 686
    cmp-long v0, v14, v21

    .line 687
    .line 688
    if-gez v0, :cond_22

    .line 689
    .line 690
    invoke-virtual {v1}, Lkg4;->h0()V
    :try_end_a
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_a .. :try_end_a} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_a .. :try_end_a} :catch_3

    .line 691
    .line 692
    .line 693
    :cond_22
    move-object v15, v2

    .line 694
    move-object/from16 v29, v7

    .line 695
    .line 696
    move-wide/from16 v21, v8

    .line 697
    .line 698
    move-object/from16 v30, v11

    .line 699
    .line 700
    move v3, v13

    .line 701
    move/from16 v9, v25

    .line 702
    .line 703
    goto/16 :goto_1c

    .line 704
    .line 705
    :cond_23
    move-object v15, v2

    .line 706
    :try_start_b
    iget-wide v2, v14, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 707
    .line 708
    move-object/from16 v27, v11

    .line 709
    .line 710
    iget-wide v10, v1, Lkg4;->z0:J

    .line 711
    .line 712
    sub-long/2addr v2, v10

    .line 713
    iput-wide v2, v14, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 714
    .line 715
    iget v2, v14, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 716
    .line 717
    if-nez v2, :cond_24

    .line 718
    .line 719
    iget v2, v14, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 720
    .line 721
    and-int/lit8 v2, v2, 0x4

    .line 722
    .line 723
    if-eqz v2, :cond_24

    .line 724
    .line 725
    invoke-virtual {v1}, Lkg4;->h0()V

    .line 726
    .line 727
    .line 728
    move-object/from16 v29, v7

    .line 729
    .line 730
    move-wide/from16 v21, v8

    .line 731
    .line 732
    move v3, v13

    .line 733
    move/from16 v9, v25

    .line 734
    .line 735
    move-object/from16 v30, v27

    .line 736
    .line 737
    goto/16 :goto_1c

    .line 738
    .line 739
    :catch_8
    move-exception v0

    .line 740
    move v12, v6

    .line 741
    const/4 v10, 0x1

    .line 742
    goto/16 :goto_2c

    .line 743
    .line 744
    :cond_24
    iput v5, v1, Lkg4;->c0:I

    .line 745
    .line 746
    invoke-interface {v0, v5}, Lzf4;->B(I)Ljava/nio/ByteBuffer;

    .line 747
    .line 748
    .line 749
    move-result-object v2

    .line 750
    iput-object v2, v1, Lkg4;->d0:Ljava/nio/ByteBuffer;

    .line 751
    .line 752
    if-eqz v2, :cond_25

    .line 753
    .line 754
    iget v3, v14, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 755
    .line 756
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 757
    .line 758
    .line 759
    iget-object v2, v1, Lkg4;->d0:Ljava/nio/ByteBuffer;

    .line 760
    .line 761
    iget v3, v14, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 762
    .line 763
    iget v5, v14, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 764
    .line 765
    add-int/2addr v3, v5

    .line 766
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 767
    .line 768
    .line 769
    :cond_25
    iget-wide v2, v14, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 770
    .line 771
    iget-object v5, v1, Lkg4;->u0:Ljg4;

    .line 772
    .line 773
    iget-object v5, v5, Ljg4;->d:Lts;

    .line 774
    .line 775
    invoke-virtual {v5, v2, v3}, Lts;->e(J)Ljava/lang/Object;

    .line 776
    .line 777
    .line 778
    move-result-object v2

    .line 779
    check-cast v2, Lph4;

    .line 780
    .line 781
    if-nez v2, :cond_26

    .line 782
    .line 783
    iget-boolean v3, v1, Lkg4;->w0:Z

    .line 784
    .line 785
    if-eqz v3, :cond_26

    .line 786
    .line 787
    iget-object v3, v1, Lkg4;->R:Landroid/media/MediaFormat;

    .line 788
    .line 789
    if-eqz v3, :cond_26

    .line 790
    .line 791
    iget-object v2, v1, Lkg4;->u0:Ljg4;

    .line 792
    .line 793
    iget-object v2, v2, Ljg4;->d:Lts;

    .line 794
    .line 795
    invoke-virtual {v2}, Lts;->d()Ljava/lang/Object;

    .line 796
    .line 797
    .line 798
    move-result-object v2

    .line 799
    check-cast v2, Lph4;

    .line 800
    .line 801
    :cond_26
    if-eqz v2, :cond_27

    .line 802
    .line 803
    iput-object v2, v1, Lkg4;->I:Lph4;

    .line 804
    .line 805
    goto :goto_14

    .line 806
    :cond_27
    iget-boolean v2, v1, Lkg4;->S:Z

    .line 807
    .line 808
    if-eqz v2, :cond_2a

    .line 809
    .line 810
    iget-object v2, v1, Lkg4;->I:Lph4;

    .line 811
    .line 812
    if-eqz v2, :cond_2a

    .line 813
    .line 814
    :goto_14
    iget-object v2, v1, Lkg4;->I:Lph4;

    .line 815
    .line 816
    if-eqz v2, :cond_28

    .line 817
    .line 818
    iget-object v3, v1, Lkg4;->R:Landroid/media/MediaFormat;

    .line 819
    .line 820
    invoke-virtual {v1, v2, v3}, Lkg4;->W(Lph4;Landroid/media/MediaFormat;)V

    .line 821
    .line 822
    .line 823
    iput-boolean v6, v1, Lkg4;->S:Z

    .line 824
    .line 825
    iput-boolean v6, v1, Lkg4;->w0:Z

    .line 826
    .line 827
    goto :goto_15

    .line 828
    :cond_28
    throw v15

    .line 829
    :cond_29
    move-object v15, v2

    .line 830
    move-object/from16 v27, v11

    .line 831
    .line 832
    :cond_2a
    :goto_15
    iget-boolean v2, v1, Lkg4;->y0:Z

    .line 833
    .line 834
    if-nez v2, :cond_2b

    .line 835
    .line 836
    iget-wide v2, v14, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 837
    .line 838
    iget-wide v10, v1, Lkg4;->q:J

    .line 839
    .line 840
    cmp-long v2, v2, v10

    .line 841
    .line 842
    if-gez v2, :cond_2c

    .line 843
    .line 844
    :cond_2b
    const/4 v2, 0x1

    .line 845
    goto :goto_16

    .line 846
    :cond_2c
    move v2, v6

    .line 847
    :goto_16
    iget-object v3, v1, Lkg4;->u0:Ljg4;

    .line 848
    .line 849
    iget-wide v10, v3, Ljg4;->e:J

    .line 850
    .line 851
    cmp-long v3, v10, v18

    .line 852
    .line 853
    if-eqz v3, :cond_2d

    .line 854
    .line 855
    iget-wide v4, v14, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 856
    .line 857
    cmp-long v4, v10, v4

    .line 858
    .line 859
    if-gtz v4, :cond_2d

    .line 860
    .line 861
    const/4 v4, 0x1

    .line 862
    goto :goto_17

    .line 863
    :cond_2d
    move v4, v6

    .line 864
    :goto_17
    iput-boolean v4, v1, Lkg4;->e0:Z

    .line 865
    .line 866
    move-object/from16 v24, v7

    .line 867
    .line 868
    iget-object v7, v1, Lkg4;->d0:Ljava/nio/ByteBuffer;

    .line 869
    .line 870
    move-wide v9, v8

    .line 871
    iget v8, v1, Lkg4;->c0:I

    .line 872
    .line 873
    move-wide v10, v9

    .line 874
    iget v9, v14, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 875
    .line 876
    move-wide/from16 v21, v10

    .line 877
    .line 878
    move v5, v12

    .line 879
    iget-wide v11, v14, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 880
    .line 881
    move-object/from16 v28, v15

    .line 882
    .line 883
    iget-object v15, v1, Lkg4;->I:Lph4;
    :try_end_b
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_b .. :try_end_b} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_b .. :try_end_b} :catch_8

    .line 884
    .line 885
    if-eqz v15, :cond_54

    .line 886
    .line 887
    const/4 v10, 0x1

    .line 888
    move-object v6, v0

    .line 889
    move v13, v2

    .line 890
    move-object v0, v14

    .line 891
    move-object/from16 v29, v24

    .line 892
    .line 893
    move-object/from16 v30, v27

    .line 894
    .line 895
    move-wide/from16 v2, p1

    .line 896
    .line 897
    move v14, v4

    .line 898
    move-wide/from16 v4, p3

    .line 899
    .line 900
    :try_start_c
    invoke-virtual/range {v1 .. v15}, Lkg4;->Y(JJLzf4;Ljava/nio/ByteBuffer;IIIJZZLph4;)Z

    .line 901
    .line 902
    .line 903
    move-result v6

    .line 904
    if-eqz v6, :cond_34

    .line 905
    .line 906
    iget-wide v2, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 907
    .line 908
    invoke-virtual {v1, v2, v3}, Lkg4;->H(J)V

    .line 909
    .line 910
    .line 911
    iget v0, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 912
    .line 913
    const/4 v9, 0x4

    .line 914
    and-int/2addr v0, v9

    .line 915
    if-eqz v0, :cond_2e

    .line 916
    .line 917
    const/4 v2, 0x1

    .line 918
    goto :goto_18

    .line 919
    :cond_2e
    const/4 v2, 0x0

    .line 920
    :goto_18
    if-nez v2, :cond_2f

    .line 921
    .line 922
    iget-boolean v0, v1, Lkg4;->n0:Z

    .line 923
    .line 924
    if-eqz v0, :cond_2f

    .line 925
    .line 926
    iget-boolean v0, v1, Lkg4;->e0:Z

    .line 927
    .line 928
    if-eqz v0, :cond_2f

    .line 929
    .line 930
    iget-object v0, v1, Lkg4;->l:Lpz;

    .line 931
    .line 932
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 933
    .line 934
    .line 935
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 936
    .line 937
    .line 938
    move-result-wide v3

    .line 939
    iput-wide v3, v1, Lkg4;->Z:J

    .line 940
    .line 941
    :cond_2f
    const/4 v3, -0x1

    .line 942
    iput v3, v1, Lkg4;->c0:I

    .line 943
    .line 944
    const/4 v15, 0x0

    .line 945
    iput-object v15, v1, Lkg4;->d0:Ljava/nio/ByteBuffer;

    .line 946
    .line 947
    if-eqz v2, :cond_30

    .line 948
    .line 949
    invoke-virtual {v1}, Lkg4;->h0()V

    .line 950
    .line 951
    .line 952
    goto :goto_1c

    .line 953
    :cond_30
    :goto_19
    cmp-long v0, v21, v18

    .line 954
    .line 955
    if-eqz v0, :cond_32

    .line 956
    .line 957
    iget-object v0, v1, Lkg4;->l:Lpz;

    .line 958
    .line 959
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 960
    .line 961
    .line 962
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 963
    .line 964
    .line 965
    move-result-wide v4

    .line 966
    sub-long v4, v4, v16

    .line 967
    .line 968
    cmp-long v0, v4, v21

    .line 969
    .line 970
    if-gez v0, :cond_31

    .line 971
    .line 972
    goto :goto_1a

    .line 973
    :cond_31
    const/4 v2, 0x0

    .line 974
    goto :goto_1b

    .line 975
    :cond_32
    :goto_1a
    const/4 v2, 0x1

    .line 976
    :goto_1b
    if-nez v2, :cond_33

    .line 977
    .line 978
    goto :goto_1c

    .line 979
    :cond_33
    move/from16 v25, v9

    .line 980
    .line 981
    move-object v2, v15

    .line 982
    move-object/from16 v7, v29

    .line 983
    .line 984
    move-object/from16 v11, v30

    .line 985
    .line 986
    const/4 v3, 0x1

    .line 987
    const/4 v4, 0x2

    .line 988
    const/4 v6, 0x0

    .line 989
    const/high16 v10, 0x20000000

    .line 990
    .line 991
    const/high16 v12, 0x10000000

    .line 992
    .line 993
    goto/16 :goto_12

    .line 994
    .line 995
    :cond_34
    const/4 v3, -0x1

    .line 996
    const/4 v9, 0x4

    .line 997
    const/4 v15, 0x0

    .line 998
    :goto_1c
    iget-object v4, v1, Lkg4;->P:Lzf4;

    .line 999
    .line 1000
    if-eqz v4, :cond_35

    .line 1001
    .line 1002
    iget v0, v1, Lkg4;->k0:I

    .line 1003
    .line 1004
    const/4 v2, 0x2

    .line 1005
    if-eq v0, v2, :cond_35

    .line 1006
    .line 1007
    iget-boolean v0, v1, Lkg4;->q0:Z

    .line 1008
    .line 1009
    if-eqz v0, :cond_36

    .line 1010
    .line 1011
    :cond_35
    const/4 v10, 0x1

    .line 1012
    :goto_1d
    const/4 v12, 0x0

    .line 1013
    goto/16 :goto_2a

    .line 1014
    .line 1015
    :cond_36
    iget v0, v1, Lkg4;->b0:I

    .line 1016
    .line 1017
    if-gez v0, :cond_37

    .line 1018
    .line 1019
    invoke-interface {v4}, Lzf4;->b()I

    .line 1020
    .line 1021
    .line 1022
    move-result v0

    .line 1023
    iput v0, v1, Lkg4;->b0:I

    .line 1024
    .line 1025
    if-ltz v0, :cond_35

    .line 1026
    .line 1027
    invoke-interface {v4, v0}, Lzf4;->z(I)Ljava/nio/ByteBuffer;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v0

    .line 1031
    move-object/from16 v11, v30

    .line 1032
    .line 1033
    iput-object v0, v11, Lvw3;->e:Ljava/nio/ByteBuffer;

    .line 1034
    .line 1035
    invoke-virtual {v11}, Lvw3;->i()V

    .line 1036
    .line 1037
    .line 1038
    goto :goto_1e

    .line 1039
    :cond_37
    move-object/from16 v11, v30

    .line 1040
    .line 1041
    :goto_1e
    iget v0, v1, Lkg4;->k0:I
    :try_end_c
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_c .. :try_end_c} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_c .. :try_end_c} :catch_2

    .line 1042
    .line 1043
    const/4 v10, 0x1

    .line 1044
    if-ne v0, v10, :cond_39

    .line 1045
    .line 1046
    :try_start_d
    iget-boolean v0, v1, Lkg4;->Y:Z

    .line 1047
    .line 1048
    if-nez v0, :cond_38

    .line 1049
    .line 1050
    iput-boolean v10, v1, Lkg4;->n0:Z

    .line 1051
    .line 1052
    iget v5, v1, Lkg4;->b0:I

    .line 1053
    .line 1054
    const-wide/16 v7, 0x0

    .line 1055
    .line 1056
    const/4 v9, 0x4

    .line 1057
    const/4 v6, 0x0

    .line 1058
    invoke-interface/range {v4 .. v9}, Lzf4;->d(IIJI)V

    .line 1059
    .line 1060
    .line 1061
    iput v3, v1, Lkg4;->b0:I

    .line 1062
    .line 1063
    iput-object v15, v11, Lvw3;->e:Ljava/nio/ByteBuffer;

    .line 1064
    .line 1065
    goto :goto_1f

    .line 1066
    :catch_9
    move-exception v0

    .line 1067
    goto/16 :goto_0

    .line 1068
    .line 1069
    :cond_38
    :goto_1f
    iput v2, v1, Lkg4;->k0:I

    .line 1070
    .line 1071
    goto :goto_1d

    .line 1072
    :cond_39
    iget v0, v1, Lkg4;->j0:I

    .line 1073
    .line 1074
    if-ne v0, v10, :cond_3d

    .line 1075
    .line 1076
    const/4 v0, 0x0

    .line 1077
    :goto_20
    iget-object v5, v1, Lkg4;->Q:Lph4;

    .line 1078
    .line 1079
    if-eqz v5, :cond_3c

    .line 1080
    .line 1081
    iget-object v5, v5, Lph4;->p:Ljava/util/List;

    .line 1082
    .line 1083
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 1084
    .line 1085
    .line 1086
    move-result v5

    .line 1087
    if-ge v0, v5, :cond_3b

    .line 1088
    .line 1089
    iget-object v5, v1, Lkg4;->Q:Lph4;

    .line 1090
    .line 1091
    iget-object v5, v5, Lph4;->p:Ljava/util/List;

    .line 1092
    .line 1093
    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v5

    .line 1097
    check-cast v5, [B

    .line 1098
    .line 1099
    iget-object v6, v11, Lvw3;->e:Ljava/nio/ByteBuffer;

    .line 1100
    .line 1101
    if-eqz v6, :cond_3a

    .line 1102
    .line 1103
    invoke-virtual {v6, v5}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 1104
    .line 1105
    .line 1106
    add-int/lit8 v0, v0, 0x1

    .line 1107
    .line 1108
    goto :goto_20

    .line 1109
    :cond_3a
    throw v15

    .line 1110
    :cond_3b
    iput v2, v1, Lkg4;->j0:I

    .line 1111
    .line 1112
    goto :goto_21

    .line 1113
    :cond_3c
    throw v15

    .line 1114
    :cond_3d
    :goto_21
    iget-object v0, v11, Lvw3;->e:Ljava/nio/ByteBuffer;

    .line 1115
    .line 1116
    if-eqz v0, :cond_52

    .line 1117
    .line 1118
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 1119
    .line 1120
    .line 1121
    move-result v0

    .line 1122
    move-object/from16 v7, v29

    .line 1123
    .line 1124
    iput-object v15, v7, Lmr2;->g:Ljava/lang/Object;

    .line 1125
    .line 1126
    iput-object v15, v7, Lmr2;->h:Ljava/lang/Object;
    :try_end_d
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_d .. :try_end_d} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_d .. :try_end_d} :catch_9

    .line 1127
    .line 1128
    const/4 v12, 0x0

    .line 1129
    :try_start_e
    invoke-virtual {v1, v7, v11, v12}, Lkg4;->n(Lmr2;Lvw3;I)I

    .line 1130
    .line 1131
    .line 1132
    move-result v5
    :try_end_e
    .catch Liw3; {:try_start_e .. :try_end_e} :catch_c
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_e .. :try_end_e} :catch_b
    .catch Ljava/lang/IllegalStateException; {:try_start_e .. :try_end_e} :catch_a

    .line 1133
    const/4 v6, -0x3

    .line 1134
    if-ne v5, v6, :cond_3e

    .line 1135
    .line 1136
    :try_start_f
    invoke-virtual {v1}, Lkg4;->n0()Z

    .line 1137
    .line 1138
    .line 1139
    move-result v0

    .line 1140
    if-eqz v0, :cond_53

    .line 1141
    .line 1142
    invoke-virtual {v1}, Lkg4;->j0()Ljg4;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v0

    .line 1146
    iget-wide v2, v1, Lkg4;->p0:J

    .line 1147
    .line 1148
    iput-wide v2, v0, Ljg4;->e:J

    .line 1149
    .line 1150
    goto/16 :goto_2a

    .line 1151
    .line 1152
    :catch_a
    move-exception v0

    .line 1153
    goto/16 :goto_2c

    .line 1154
    .line 1155
    :catch_b
    move-exception v0

    .line 1156
    goto/16 :goto_30

    .line 1157
    .line 1158
    :cond_3e
    const/4 v8, -0x5

    .line 1159
    if-ne v5, v8, :cond_41

    .line 1160
    .line 1161
    iget v0, v1, Lkg4;->j0:I

    .line 1162
    .line 1163
    if-ne v0, v2, :cond_3f

    .line 1164
    .line 1165
    invoke-virtual {v11}, Lvw3;->i()V

    .line 1166
    .line 1167
    .line 1168
    iput v10, v1, Lkg4;->j0:I

    .line 1169
    .line 1170
    :cond_3f
    invoke-virtual {v1, v7}, Lkg4;->V(Lmr2;)Lw34;

    .line 1171
    .line 1172
    .line 1173
    :cond_40
    :goto_22
    move-object/from16 v29, v7

    .line 1174
    .line 1175
    goto/16 :goto_27

    .line 1176
    .line 1177
    :cond_41
    invoke-virtual {v11, v9}, Ltd;->h(I)Z

    .line 1178
    .line 1179
    .line 1180
    move-result v5

    .line 1181
    if-eqz v5, :cond_44

    .line 1182
    .line 1183
    invoke-virtual {v1}, Lkg4;->j0()Ljg4;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v0

    .line 1187
    iget-wide v5, v1, Lkg4;->p0:J

    .line 1188
    .line 1189
    iput-wide v5, v0, Ljg4;->e:J

    .line 1190
    .line 1191
    iget v0, v1, Lkg4;->j0:I

    .line 1192
    .line 1193
    if-ne v0, v2, :cond_42

    .line 1194
    .line 1195
    invoke-virtual {v11}, Lvw3;->i()V

    .line 1196
    .line 1197
    .line 1198
    iput v10, v1, Lkg4;->j0:I

    .line 1199
    .line 1200
    :cond_42
    iput-boolean v10, v1, Lkg4;->q0:Z

    .line 1201
    .line 1202
    iget-boolean v0, v1, Lkg4;->m0:Z

    .line 1203
    .line 1204
    if-nez v0, :cond_43

    .line 1205
    .line 1206
    invoke-virtual {v1}, Lkg4;->h0()V

    .line 1207
    .line 1208
    .line 1209
    goto/16 :goto_2a

    .line 1210
    .line 1211
    :cond_43
    iget-boolean v0, v1, Lkg4;->Y:Z

    .line 1212
    .line 1213
    if-nez v0, :cond_53

    .line 1214
    .line 1215
    iput-boolean v10, v1, Lkg4;->n0:Z

    .line 1216
    .line 1217
    iget v5, v1, Lkg4;->b0:I

    .line 1218
    .line 1219
    const-wide/16 v7, 0x0

    .line 1220
    .line 1221
    const/4 v9, 0x4

    .line 1222
    const/4 v6, 0x0

    .line 1223
    invoke-interface/range {v4 .. v9}, Lzf4;->d(IIJI)V

    .line 1224
    .line 1225
    .line 1226
    iput v3, v1, Lkg4;->b0:I

    .line 1227
    .line 1228
    iput-object v15, v11, Lvw3;->e:Ljava/nio/ByteBuffer;

    .line 1229
    .line 1230
    goto/16 :goto_2a

    .line 1231
    .line 1232
    :cond_44
    iget-boolean v5, v1, Lkg4;->m0:Z

    .line 1233
    .line 1234
    if-nez v5, :cond_45

    .line 1235
    .line 1236
    invoke-virtual {v11}, Ltd;->f()Z

    .line 1237
    .line 1238
    .line 1239
    move-result v5

    .line 1240
    if-nez v5, :cond_45

    .line 1241
    .line 1242
    invoke-virtual {v11}, Lvw3;->i()V

    .line 1243
    .line 1244
    .line 1245
    iget v0, v1, Lkg4;->j0:I

    .line 1246
    .line 1247
    if-ne v0, v2, :cond_40

    .line 1248
    .line 1249
    iput v10, v1, Lkg4;->j0:I

    .line 1250
    .line 1251
    goto :goto_22

    .line 1252
    :cond_45
    invoke-virtual {v1, v11}, Lkg4;->G(Lvw3;)Z

    .line 1253
    .line 1254
    .line 1255
    move-result v5

    .line 1256
    if-nez v5, :cond_40

    .line 1257
    .line 1258
    invoke-virtual {v11}, Lvw3;->k()Z

    .line 1259
    .line 1260
    .line 1261
    move-result v5

    .line 1262
    if-eqz v5, :cond_46

    .line 1263
    .line 1264
    iget-object v6, v11, Lvw3;->d:Lyu3;

    .line 1265
    .line 1266
    invoke-virtual {v6, v0}, Lyu3;->a(I)V

    .line 1267
    .line 1268
    .line 1269
    :cond_46
    iget-wide v13, v11, Lvw3;->g:J

    .line 1270
    .line 1271
    iget-boolean v0, v1, Lkg4;->s0:Z

    .line 1272
    .line 1273
    if-eqz v0, :cond_48

    .line 1274
    .line 1275
    invoke-virtual {v1}, Lkg4;->j0()Ljg4;

    .line 1276
    .line 1277
    .line 1278
    move-result-object v0

    .line 1279
    iget-object v0, v0, Ljg4;->d:Lts;

    .line 1280
    .line 1281
    iget-object v6, v1, Lkg4;->H:Lph4;

    .line 1282
    .line 1283
    if-eqz v6, :cond_47

    .line 1284
    .line 1285
    invoke-virtual {v0, v13, v14, v6}, Lts;->b(JLjava/lang/Object;)V

    .line 1286
    .line 1287
    .line 1288
    iput-boolean v12, v1, Lkg4;->s0:Z

    .line 1289
    .line 1290
    goto :goto_23

    .line 1291
    :cond_47
    throw v15

    .line 1292
    :cond_48
    :goto_23
    iget-wide v8, v1, Lkg4;->p0:J

    .line 1293
    .line 1294
    invoke-static {v8, v9, v13, v14}, Ljava/lang/Math;->max(JJ)J

    .line 1295
    .line 1296
    .line 1297
    move-result-wide v8

    .line 1298
    iput-wide v8, v1, Lkg4;->p0:J

    .line 1299
    .line 1300
    invoke-virtual {v1}, Lkg4;->n0()Z

    .line 1301
    .line 1302
    .line 1303
    move-result v0

    .line 1304
    if-nez v0, :cond_49

    .line 1305
    .line 1306
    const/high16 v6, 0x20000000

    .line 1307
    .line 1308
    invoke-virtual {v11, v6}, Ltd;->h(I)Z

    .line 1309
    .line 1310
    .line 1311
    move-result v0

    .line 1312
    if-eqz v0, :cond_4a

    .line 1313
    .line 1314
    goto :goto_24

    .line 1315
    :cond_49
    const/high16 v6, 0x20000000

    .line 1316
    .line 1317
    :goto_24
    invoke-virtual {v1}, Lkg4;->j0()Ljg4;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v0

    .line 1321
    iget-wide v8, v1, Lkg4;->p0:J

    .line 1322
    .line 1323
    iput-wide v8, v0, Ljg4;->e:J

    .line 1324
    .line 1325
    :cond_4a
    invoke-virtual {v11}, Lvw3;->l()V

    .line 1326
    .line 1327
    .line 1328
    const/high16 v8, 0x10000000

    .line 1329
    .line 1330
    invoke-virtual {v11, v8}, Ltd;->h(I)Z

    .line 1331
    .line 1332
    .line 1333
    move-result v0

    .line 1334
    if-eqz v0, :cond_4b

    .line 1335
    .line 1336
    invoke-virtual {v1, v11}, Lkg4;->a0(Lvw3;)V

    .line 1337
    .line 1338
    .line 1339
    :cond_4b
    iget-boolean v0, v1, Lkg4;->y0:Z

    .line 1340
    .line 1341
    if-eqz v0, :cond_4d

    .line 1342
    .line 1343
    move-object/from16 v29, v7

    .line 1344
    .line 1345
    iget-wide v6, v1, Lkg4;->p0:J

    .line 1346
    .line 1347
    cmp-long v0, v13, v6

    .line 1348
    .line 1349
    if-gtz v0, :cond_4c

    .line 1350
    .line 1351
    iget-wide v8, v1, Lkg4;->z0:J

    .line 1352
    .line 1353
    sub-long/2addr v6, v13

    .line 1354
    const-wide/16 v23, 0x1

    .line 1355
    .line 1356
    add-long v6, v6, v23

    .line 1357
    .line 1358
    add-long/2addr v6, v8

    .line 1359
    iput-wide v6, v1, Lkg4;->z0:J

    .line 1360
    .line 1361
    :cond_4c
    iput-wide v13, v1, Lkg4;->p0:J

    .line 1362
    .line 1363
    iput-boolean v12, v1, Lkg4;->y0:Z

    .line 1364
    .line 1365
    goto :goto_25

    .line 1366
    :cond_4d
    move-object/from16 v29, v7

    .line 1367
    .line 1368
    :goto_25
    invoke-virtual {v1, v11}, Lkg4;->E(Lvw3;)V

    .line 1369
    .line 1370
    .line 1371
    invoke-virtual {v1, v11}, Lkg4;->F(Lvw3;)I

    .line 1372
    .line 1373
    .line 1374
    move-result v28

    .line 1375
    iget-wide v6, v1, Lkg4;->z0:J

    .line 1376
    .line 1377
    add-long v26, v13, v6

    .line 1378
    .line 1379
    if-eqz v5, :cond_4e

    .line 1380
    .line 1381
    iget v0, v1, Lkg4;->b0:I

    .line 1382
    .line 1383
    iget-object v5, v11, Lvw3;->d:Lyu3;

    .line 1384
    .line 1385
    move/from16 v24, v0

    .line 1386
    .line 1387
    move-object/from16 v23, v4

    .line 1388
    .line 1389
    move-object/from16 v25, v5

    .line 1390
    .line 1391
    invoke-interface/range {v23 .. v28}, Lzf4;->n(ILyu3;JI)V

    .line 1392
    .line 1393
    .line 1394
    goto :goto_26

    .line 1395
    :cond_4e
    iget v0, v1, Lkg4;->b0:I

    .line 1396
    .line 1397
    iget-object v5, v11, Lvw3;->e:Ljava/nio/ByteBuffer;

    .line 1398
    .line 1399
    if-eqz v5, :cond_4f

    .line 1400
    .line 1401
    invoke-virtual {v5}, Ljava/nio/Buffer;->limit()I

    .line 1402
    .line 1403
    .line 1404
    move-result v25

    .line 1405
    move/from16 v24, v0

    .line 1406
    .line 1407
    move-object/from16 v23, v4

    .line 1408
    .line 1409
    invoke-interface/range {v23 .. v28}, Lzf4;->d(IIJI)V

    .line 1410
    .line 1411
    .line 1412
    :goto_26
    iput v3, v1, Lkg4;->b0:I

    .line 1413
    .line 1414
    iput-object v15, v11, Lvw3;->e:Ljava/nio/ByteBuffer;

    .line 1415
    .line 1416
    iput-boolean v10, v1, Lkg4;->m0:Z

    .line 1417
    .line 1418
    iput v12, v1, Lkg4;->j0:I

    .line 1419
    .line 1420
    iget-object v0, v1, Lkg4;->t0:Ln34;

    .line 1421
    .line 1422
    iget v4, v0, Ln34;->c:I

    .line 1423
    .line 1424
    add-int/2addr v4, v10

    .line 1425
    iput v4, v0, Ln34;->c:I

    .line 1426
    .line 1427
    goto :goto_27

    .line 1428
    :cond_4f
    throw v15

    .line 1429
    :catch_c
    move-exception v0

    .line 1430
    move-object/from16 v29, v7

    .line 1431
    .line 1432
    invoke-virtual {v1, v0}, Lkg4;->U(Ljava/lang/Exception;)V

    .line 1433
    .line 1434
    .line 1435
    invoke-virtual {v1, v12}, Lkg4;->d0(I)Z

    .line 1436
    .line 1437
    .line 1438
    invoke-virtual {v1}, Lkg4;->c0()V

    .line 1439
    .line 1440
    .line 1441
    :goto_27
    cmp-long v0, v21, v18

    .line 1442
    .line 1443
    if-eqz v0, :cond_51

    .line 1444
    .line 1445
    iget-object v0, v1, Lkg4;->l:Lpz;

    .line 1446
    .line 1447
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1448
    .line 1449
    .line 1450
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 1451
    .line 1452
    .line 1453
    move-result-wide v4

    .line 1454
    sub-long v4, v4, v16

    .line 1455
    .line 1456
    cmp-long v0, v4, v21

    .line 1457
    .line 1458
    if-gez v0, :cond_50

    .line 1459
    .line 1460
    goto :goto_28

    .line 1461
    :cond_50
    move v0, v12

    .line 1462
    goto :goto_29

    .line 1463
    :cond_51
    :goto_28
    move v0, v10

    .line 1464
    :goto_29
    if-eqz v0, :cond_53

    .line 1465
    .line 1466
    move-object/from16 v30, v11

    .line 1467
    .line 1468
    const/4 v9, 0x4

    .line 1469
    goto/16 :goto_1c

    .line 1470
    .line 1471
    :cond_52
    const/4 v12, 0x0

    .line 1472
    throw v15

    .line 1473
    :cond_53
    :goto_2a
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1474
    .line 1475
    .line 1476
    goto :goto_2b

    .line 1477
    :cond_54
    move v12, v6

    .line 1478
    move-object/from16 v15, v28

    .line 1479
    .line 1480
    const/4 v10, 0x1

    .line 1481
    throw v15

    .line 1482
    :cond_55
    move-object v15, v2

    .line 1483
    move v10, v3

    .line 1484
    move v12, v6

    .line 1485
    throw v15

    .line 1486
    :cond_56
    move v10, v3

    .line 1487
    move v12, v6

    .line 1488
    iget-object v0, v1, Lkg4;->t0:Ln34;

    .line 1489
    .line 1490
    iget v2, v0, Ln34;->d:I

    .line 1491
    .line 1492
    iget-object v3, v1, Lkg4;->n:Lli4;

    .line 1493
    .line 1494
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1495
    .line 1496
    .line 1497
    iget-wide v4, v1, Lkg4;->p:J

    .line 1498
    .line 1499
    sub-long v4, p1, v4

    .line 1500
    .line 1501
    invoke-interface {v3, v4, v5}, Lli4;->f(J)I

    .line 1502
    .line 1503
    .line 1504
    move-result v3

    .line 1505
    add-int/2addr v2, v3

    .line 1506
    iput v2, v0, Ln34;->d:I

    .line 1507
    .line 1508
    invoke-virtual {v1, v10}, Lkg4;->d0(I)Z

    .line 1509
    .line 1510
    .line 1511
    :goto_2b
    iget-object v0, v1, Lkg4;->t0:Ln34;

    .line 1512
    .line 1513
    invoke-virtual {v0}, Ln34;->a()V
    :try_end_f
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_f .. :try_end_f} :catch_b
    .catch Ljava/lang/IllegalStateException; {:try_start_f .. :try_end_f} :catch_a

    .line 1514
    .line 1515
    .line 1516
    :cond_57
    return-void

    .line 1517
    :goto_2c
    instance-of v2, v0, Landroid/media/MediaCodec$CodecException;

    .line 1518
    .line 1519
    if-eqz v2, :cond_58

    .line 1520
    .line 1521
    goto :goto_2d

    .line 1522
    :cond_58
    invoke-virtual {v0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 1523
    .line 1524
    .line 1525
    move-result-object v3

    .line 1526
    array-length v4, v3

    .line 1527
    if-lez v4, :cond_5c

    .line 1528
    .line 1529
    aget-object v3, v3, v12

    .line 1530
    .line 1531
    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 1532
    .line 1533
    .line 1534
    move-result-object v3

    .line 1535
    const-string v4, "android.media.MediaCodec"

    .line 1536
    .line 1537
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1538
    .line 1539
    .line 1540
    move-result v3

    .line 1541
    if-eqz v3, :cond_5c

    .line 1542
    .line 1543
    :goto_2d
    invoke-virtual {v1, v0}, Lkg4;->U(Ljava/lang/Exception;)V

    .line 1544
    .line 1545
    .line 1546
    if-eqz v2, :cond_59

    .line 1547
    .line 1548
    move-object v2, v0

    .line 1549
    check-cast v2, Landroid/media/MediaCodec$CodecException;

    .line 1550
    .line 1551
    invoke-virtual {v2}, Landroid/media/MediaCodec$CodecException;->isRecoverable()Z

    .line 1552
    .line 1553
    .line 1554
    move-result v2

    .line 1555
    if-eqz v2, :cond_59

    .line 1556
    .line 1557
    move v2, v10

    .line 1558
    goto :goto_2e

    .line 1559
    :cond_59
    move v2, v12

    .line 1560
    :goto_2e
    if-eqz v2, :cond_5a

    .line 1561
    .line 1562
    invoke-virtual {v1}, Lkg4;->x()V

    .line 1563
    .line 1564
    .line 1565
    :cond_5a
    iget-object v3, v1, Lkg4;->W:Lbg4;

    .line 1566
    .line 1567
    invoke-virtual {v1, v0, v3}, Lkg4;->C(Ljava/lang/IllegalStateException;Lbg4;)Lag4;

    .line 1568
    .line 1569
    .line 1570
    move-result-object v0

    .line 1571
    iget v3, v0, Lag4;->f:I

    .line 1572
    .line 1573
    const/16 v4, 0x44d

    .line 1574
    .line 1575
    if-ne v3, v4, :cond_5b

    .line 1576
    .line 1577
    const/16 v3, 0xfa6

    .line 1578
    .line 1579
    goto :goto_2f

    .line 1580
    :cond_5b
    const/16 v3, 0xfa3

    .line 1581
    .line 1582
    :goto_2f
    iget-object v4, v1, Lkg4;->H:Lph4;

    .line 1583
    .line 1584
    invoke-virtual {v1, v0, v4, v2, v3}, Lkg4;->m(Ljava/lang/Exception;Lph4;ZI)Lb84;

    .line 1585
    .line 1586
    .line 1587
    move-result-object v0

    .line 1588
    throw v0

    .line 1589
    :cond_5c
    throw v0

    .line 1590
    :goto_30
    iget-object v2, v1, Lkg4;->H:Lph4;

    .line 1591
    .line 1592
    invoke-virtual {v0}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    .line 1593
    .line 1594
    .line 1595
    move-result v3

    .line 1596
    invoke-static {v3}, Lv23;->e(I)I

    .line 1597
    .line 1598
    .line 1599
    move-result v3

    .line 1600
    invoke-virtual {v1, v0, v2, v12, v3}, Lkg4;->m(Ljava/lang/Exception;Lph4;ZI)Lb84;

    .line 1601
    .line 1602
    .line 1603
    move-result-object v0

    .line 1604
    throw v0
.end method

.method public abstract t()Z
.end method

.method public abstract u()Z
.end method

.method public final v()V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lkg4;->D:Lxf4;

    .line 4
    .line 5
    iget-object v2, v1, Lkg4;->P:Lzf4;

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    iget-boolean v2, v1, Lkg4;->f0:Z

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    iget-object v7, v1, Lkg4;->H:Lph4;

    .line 14
    .line 15
    if-nez v7, :cond_1

    .line 16
    .line 17
    :cond_0
    move-object v8, v1

    .line 18
    goto/16 :goto_13

    .line 19
    .line 20
    :cond_1
    iget-object v2, v1, Lkg4;->K:Lci3;

    .line 21
    .line 22
    const/4 v8, 0x1

    .line 23
    const/4 v9, 0x0

    .line 24
    if-nez v2, :cond_3

    .line 25
    .line 26
    invoke-virtual {v1, v7}, Lkg4;->N(Lph4;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_3

    .line 31
    .line 32
    iput-boolean v9, v1, Lkg4;->f0:Z

    .line 33
    .line 34
    invoke-virtual {v1}, Lkg4;->b0()V

    .line 35
    .line 36
    .line 37
    iget-object v2, v7, Lph4;->m:Ljava/lang/String;

    .line 38
    .line 39
    const-string v3, "audio/mp4a-latm"

    .line 40
    .line 41
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-nez v3, :cond_2

    .line 46
    .line 47
    const-string v3, "audio/mpeg"

    .line 48
    .line 49
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-nez v3, :cond_2

    .line 54
    .line 55
    const-string v3, "audio/opus"

    .line 56
    .line 57
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-nez v2, :cond_2

    .line 62
    .line 63
    iput v8, v0, Lxf4;->l:I

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    const/16 v2, 0x20

    .line 67
    .line 68
    iput v2, v0, Lxf4;->l:I

    .line 69
    .line 70
    :goto_0
    iput-boolean v8, v1, Lkg4;->f0:Z

    .line 71
    .line 72
    return-void

    .line 73
    :cond_3
    iget-object v0, v1, Lkg4;->K:Lci3;

    .line 74
    .line 75
    iput-object v0, v1, Lkg4;->J:Lci3;

    .line 76
    .line 77
    if-eqz v0, :cond_4

    .line 78
    .line 79
    sget v0, Lqf4;->a:I

    .line 80
    .line 81
    :cond_4
    :try_start_0
    const-string v10, "Failed to initialize decoder: "

    .line 82
    .line 83
    iget-object v11, v1, Lkg4;->H:Lph4;

    .line 84
    .line 85
    const/4 v12, 0x0

    .line 86
    if-eqz v11, :cond_1a

    .line 87
    .line 88
    iget-object v0, v1, Lkg4;->U:Ljava/util/ArrayDeque;
    :try_end_0
    .catch Lig4; {:try_start_0 .. :try_end_0} :catch_0

    .line 89
    .line 90
    if-nez v0, :cond_6

    .line 91
    .line 92
    :try_start_1
    iget-object v0, v1, Lkg4;->y:Lhd4;

    .line 93
    .line 94
    invoke-virtual {v1, v0, v11}, Lkg4;->M(Lhd4;Lph4;)Ljava/util/ArrayList;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 99
    .line 100
    .line 101
    new-instance v2, Ljava/util/ArrayDeque;

    .line 102
    .line 103
    invoke-direct {v2}, Ljava/util/ArrayDeque;-><init>()V

    .line 104
    .line 105
    .line 106
    iput-object v2, v1, Lkg4;->U:Ljava/util/ArrayDeque;

    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-nez v2, :cond_5

    .line 113
    .line 114
    iget-object v2, v1, Lkg4;->U:Ljava/util/ArrayDeque;

    .line 115
    .line 116
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    check-cast v0, Lbg4;

    .line 121
    .line 122
    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :catch_0
    move-exception v0

    .line 127
    move-object v8, v1

    .line 128
    goto/16 :goto_12

    .line 129
    .line 130
    :catch_1
    move-exception v0

    .line 131
    goto :goto_2

    .line 132
    :cond_5
    :goto_1
    iput-object v12, v1, Lkg4;->V:Lig4;
    :try_end_1
    .catch Lmg4; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lig4; {:try_start_1 .. :try_end_1} :catch_0

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :goto_2
    :try_start_2
    new-instance v2, Lig4;

    .line 136
    .line 137
    const v3, -0xc34e

    .line 138
    .line 139
    .line 140
    invoke-direct {v2, v11, v0, v3}, Lig4;-><init>(Lph4;Lmg4;I)V

    .line 141
    .line 142
    .line 143
    throw v2

    .line 144
    :cond_6
    :goto_3
    iget-object v0, v1, Lkg4;->U:Ljava/util/ArrayDeque;

    .line 145
    .line 146
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    if-nez v0, :cond_19

    .line 151
    .line 152
    iget-object v13, v1, Lkg4;->U:Ljava/util/ArrayDeque;

    .line 153
    .line 154
    if-eqz v13, :cond_18

    .line 155
    .line 156
    :goto_4
    iget-object v0, v1, Lkg4;->P:Lzf4;

    .line 157
    .line 158
    if-nez v0, :cond_17

    .line 159
    .line 160
    invoke-virtual {v13}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    move-object v14, v0

    .line 165
    check-cast v14, Lbg4;

    .line 166
    .line 167
    if-eqz v14, :cond_16

    .line 168
    .line 169
    invoke-virtual {v1, v11}, Lkg4;->D(Lph4;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v1, v14}, Lkg4;->w(Lbg4;)Z

    .line 173
    .line 174
    .line 175
    move-result v0
    :try_end_2
    .catch Lig4; {:try_start_2 .. :try_end_2} :catch_0

    .line 176
    if-eqz v0, :cond_0

    .line 177
    .line 178
    :try_start_3
    const-string v0, "createCodec:"

    .line 179
    .line 180
    iput-object v14, v1, Lkg4;->W:Lbg4;

    .line 181
    .line 182
    iget-object v2, v1, Lkg4;->H:Lph4;

    .line 183
    .line 184
    if-eqz v2, :cond_12

    .line 185
    .line 186
    iget-object v6, v14, Lbg4;->a:Ljava/lang/String;

    .line 187
    .line 188
    iget v3, v1, Lkg4;->O:F
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_8

    .line 189
    .line 190
    :try_start_4
    iget-object v4, v1, Lkg4;->o:[Lph4;

    .line 191
    .line 192
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_9

    .line 193
    .line 194
    .line 195
    :try_start_5
    invoke-virtual {v1, v3, v2, v4}, Lkg4;->R(FLph4;[Lph4;)F

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    iget v4, v1, Lkg4;->z:F
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_8

    .line 200
    .line 201
    cmpg-float v4, v3, v4

    .line 202
    .line 203
    if-gtz v4, :cond_7

    .line 204
    .line 205
    const/high16 v3, -0x40800000    # -1.0f

    .line 206
    .line 207
    :cond_7
    :try_start_6
    iget-object v4, v1, Lkg4;->l:Lpz;

    .line 208
    .line 209
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_9

    .line 210
    .line 211
    .line 212
    :try_start_7
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 213
    .line 214
    .line 215
    move-result-wide v4

    .line 216
    invoke-virtual {v1, v14, v2, v3}, Lkg4;->O(Lbg4;Lph4;F)Lg4;

    .line 217
    .line 218
    .line 219
    move-result-object v15
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_8

    .line 220
    move/from16 v16, v8

    .line 221
    .line 222
    :try_start_8
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7

    .line 223
    .line 224
    const/16 v9, 0x1f

    .line 225
    .line 226
    if-lt v8, v9, :cond_a

    .line 227
    .line 228
    :try_start_9
    iget-object v9, v1, Lkg4;->k:Lxd4;

    .line 229
    .line 230
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    monitor-enter v9
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_3

    .line 234
    move-object/from16 v17, v12

    .line 235
    .line 236
    :try_start_a
    iget-object v12, v9, Lxd4;->b:Lx34;

    .line 237
    .line 238
    if-eqz v12, :cond_9

    .line 239
    .line 240
    iget-object v12, v12, Lx34;->f:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v12, Landroid/media/metrics/LogSessionId;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 243
    .line 244
    :try_start_b
    monitor-exit v9

    .line 245
    invoke-static {}, Lqd4;->d()Landroid/media/metrics/LogSessionId;

    .line 246
    .line 247
    .line 248
    invoke-static {v12}, Lqd4;->y(Landroid/media/metrics/LogSessionId;)Z

    .line 249
    .line 250
    .line 251
    move-result v9

    .line 252
    if-nez v9, :cond_8

    .line 253
    .line 254
    iget-object v9, v15, Lg4;->j:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v9, Landroid/media/MediaFormat;

    .line 257
    .line 258
    move-wide/from16 v18, v4

    .line 259
    .line 260
    const-string v4, "log-session-id"

    .line 261
    .line 262
    invoke-static {v12}, Lzd4;->b(Landroid/media/metrics/LogSessionId;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v5

    .line 266
    invoke-virtual {v9, v4, v5}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_2

    .line 267
    .line 268
    .line 269
    goto :goto_6

    .line 270
    :catch_2
    move-exception v0

    .line 271
    :goto_5
    move-object v3, v0

    .line 272
    move-object v8, v1

    .line 273
    goto/16 :goto_e

    .line 274
    .line 275
    :cond_8
    move-wide/from16 v18, v4

    .line 276
    .line 277
    goto :goto_6

    .line 278
    :cond_9
    :try_start_c
    throw v17

    .line 279
    :catchall_0
    move-exception v0

    .line 280
    monitor-exit v9
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 281
    :try_start_d
    throw v0
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_2

    .line 282
    :catch_3
    move-exception v0

    .line 283
    move-object/from16 v17, v12

    .line 284
    .line 285
    goto :goto_5

    .line 286
    :cond_a
    move-wide/from16 v18, v4

    .line 287
    .line 288
    move-object/from16 v17, v12

    .line 289
    .line 290
    :goto_6
    :try_start_e
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 291
    .line 292
    .line 293
    move-result v4

    .line 294
    add-int/lit8 v4, v4, 0xc

    .line 295
    .line 296
    new-instance v5, Ljava/lang/StringBuilder;

    .line 297
    .line 298
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    iget-object v0, v1, Lkg4;->x:Lcy2;

    .line 315
    .line 316
    invoke-virtual {v0, v15}, Lcy2;->b(Lg4;)Lzf4;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    iput-object v0, v1, Lkg4;->P:Lzf4;

    .line 321
    .line 322
    new-instance v4, Lk34;

    .line 323
    .line 324
    invoke-direct {v4, v1}, Lk34;-><init>(Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    invoke-interface {v0, v4}, Lzf4;->j(Lk34;)Z
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    .line 328
    .line 329
    .line 330
    :try_start_f
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_4

    .line 331
    .line 332
    .line 333
    :try_start_10
    iget-object v0, v1, Lkg4;->l:Lpz;

    .line 334
    .line 335
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_6

    .line 336
    .line 337
    .line 338
    :try_start_11
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 339
    .line 340
    .line 341
    move-result-wide v4

    .line 342
    invoke-virtual {v14, v2}, Lbg4;->b(Lph4;)Z

    .line 343
    .line 344
    .line 345
    move-result v0
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_4

    .line 346
    if-nez v0, :cond_b

    .line 347
    .line 348
    :try_start_12
    invoke-static {v2}, Lph4;->c(Lph4;)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    sget-object v9, Lv23;->a:Ljava/lang/String;

    .line 353
    .line 354
    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 355
    .line 356
    new-instance v9, Ljava/lang/StringBuilder;

    .line 357
    .line 358
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 359
    .line 360
    .line 361
    const-string v12, "Format exceeds selected codec\'s capabilities ["

    .line 362
    .line 363
    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 367
    .line 368
    .line 369
    const-string v0, ", "

    .line 370
    .line 371
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 375
    .line 376
    .line 377
    const-string v0, "]"

    .line 378
    .line 379
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_2

    .line 387
    .line 388
    .line 389
    :cond_b
    :try_start_13
    iput v3, v1, Lkg4;->T:F

    .line 390
    .line 391
    iput-object v2, v1, Lkg4;->Q:Lph4;
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_4

    .line 392
    .line 393
    const/16 v0, 0x1d

    .line 394
    .line 395
    if-ne v8, v0, :cond_c

    .line 396
    .line 397
    :try_start_14
    const-string v2, "c2.android.aac.decoder"

    .line 398
    .line 399
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 400
    .line 401
    .line 402
    move-result v2
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_2

    .line 403
    if-eqz v2, :cond_c

    .line 404
    .line 405
    move/from16 v2, v16

    .line 406
    .line 407
    goto :goto_7

    .line 408
    :cond_c
    const/4 v2, 0x0

    .line 409
    :goto_7
    :try_start_15
    iput-boolean v2, v1, Lkg4;->X:Z

    .line 410
    .line 411
    iget-object v2, v14, Lbg4;->a:Ljava/lang/String;
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_4

    .line 412
    .line 413
    if-gt v8, v0, :cond_e

    .line 414
    .line 415
    :try_start_16
    const-string v0, "OMX.broadcom.video_decoder.tunnel"

    .line 416
    .line 417
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 418
    .line 419
    .line 420
    move-result v0

    .line 421
    if-nez v0, :cond_d

    .line 422
    .line 423
    const-string v0, "OMX.broadcom.video_decoder.tunnel.secure"

    .line 424
    .line 425
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    move-result v0

    .line 429
    if-nez v0, :cond_d

    .line 430
    .line 431
    const-string v0, "OMX.bcm.vdec.avc.tunnel"

    .line 432
    .line 433
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 434
    .line 435
    .line 436
    move-result v0

    .line 437
    if-nez v0, :cond_d

    .line 438
    .line 439
    const-string v0, "OMX.bcm.vdec.avc.tunnel.secure"

    .line 440
    .line 441
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 442
    .line 443
    .line 444
    move-result v0

    .line 445
    if-nez v0, :cond_d

    .line 446
    .line 447
    const-string v0, "OMX.bcm.vdec.hevc.tunnel"

    .line 448
    .line 449
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 450
    .line 451
    .line 452
    move-result v0

    .line 453
    if-nez v0, :cond_d

    .line 454
    .line 455
    const-string v0, "OMX.bcm.vdec.hevc.tunnel.secure"

    .line 456
    .line 457
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 458
    .line 459
    .line 460
    move-result v0
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_2

    .line 461
    if-nez v0, :cond_d

    .line 462
    .line 463
    goto :goto_9

    .line 464
    :cond_d
    :goto_8
    move/from16 v0, v16

    .line 465
    .line 466
    goto :goto_a

    .line 467
    :cond_e
    :goto_9
    :try_start_17
    const-string v0, "Amazon"

    .line 468
    .line 469
    sget-object v2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 470
    .line 471
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 472
    .line 473
    .line 474
    move-result v0
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_4

    .line 475
    if-eqz v0, :cond_f

    .line 476
    .line 477
    :try_start_18
    const-string v0, "AFTS"

    .line 478
    .line 479
    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 480
    .line 481
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 482
    .line 483
    .line 484
    move-result v0

    .line 485
    if-eqz v0, :cond_f

    .line 486
    .line 487
    iget-boolean v0, v14, Lbg4;->f:Z
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_2

    .line 488
    .line 489
    if-eqz v0, :cond_f

    .line 490
    .line 491
    goto :goto_8

    .line 492
    :cond_f
    const/4 v0, 0x0

    .line 493
    :goto_a
    :try_start_19
    iput-boolean v0, v1, Lkg4;->Y:Z

    .line 494
    .line 495
    iget-object v0, v1, Lkg4;->P:Lzf4;

    .line 496
    .line 497
    if-eqz v0, :cond_11

    .line 498
    .line 499
    iget v0, v1, Lkg4;->m:I
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_4

    .line 500
    .line 501
    const/4 v2, 0x2

    .line 502
    if-ne v0, v2, :cond_10

    .line 503
    .line 504
    :try_start_1a
    iget-object v0, v1, Lkg4;->l:Lpz;

    .line 505
    .line 506
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 507
    .line 508
    .line 509
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 510
    .line 511
    .line 512
    move-result-wide v2

    .line 513
    const-wide/16 v8, 0x3e8

    .line 514
    .line 515
    add-long/2addr v2, v8

    .line 516
    iput-wide v2, v1, Lkg4;->a0:J
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_2

    .line 517
    .line 518
    :cond_10
    :try_start_1b
    iget-object v0, v1, Lkg4;->t0:Ln34;

    .line 519
    .line 520
    iget v2, v0, Ln34;->a:I

    .line 521
    .line 522
    add-int/lit8 v2, v2, 0x1

    .line 523
    .line 524
    iput v2, v0, Ln34;->a:I

    .line 525
    .line 526
    sub-long v2, v4, v18

    .line 527
    .line 528
    move-wide/from16 v20, v4

    .line 529
    .line 530
    move-wide v4, v2

    .line 531
    move-wide/from16 v2, v20

    .line 532
    .line 533
    invoke-virtual/range {v1 .. v6}, Lkg4;->S(JJLjava/lang/String;)V
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1b} :catch_4

    .line 534
    .line 535
    .line 536
    move-object v8, v1

    .line 537
    :goto_b
    move-object v1, v8

    .line 538
    move/from16 v8, v16

    .line 539
    .line 540
    move-object/from16 v12, v17

    .line 541
    .line 542
    const/4 v9, 0x0

    .line 543
    goto/16 :goto_4

    .line 544
    .line 545
    :catch_4
    move-exception v0

    .line 546
    :goto_c
    move-object v8, v1

    .line 547
    :goto_d
    move-object v3, v0

    .line 548
    goto :goto_e

    .line 549
    :cond_11
    move-object v8, v1

    .line 550
    :try_start_1c
    throw v17

    .line 551
    :catch_5
    move-exception v0

    .line 552
    goto :goto_d

    .line 553
    :catch_6
    move-exception v0

    .line 554
    goto :goto_c

    .line 555
    :catchall_1
    move-exception v0

    .line 556
    move-object v8, v1

    .line 557
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 558
    .line 559
    .line 560
    throw v0

    .line 561
    :catch_7
    move-exception v0

    .line 562
    move-object v8, v1

    .line 563
    move-object/from16 v17, v12

    .line 564
    .line 565
    goto :goto_d

    .line 566
    :catch_8
    move-exception v0

    .line 567
    move/from16 v16, v8

    .line 568
    .line 569
    move-object/from16 v17, v12

    .line 570
    .line 571
    goto :goto_c

    .line 572
    :catch_9
    move-exception v0

    .line 573
    move/from16 v16, v8

    .line 574
    .line 575
    move-object/from16 v17, v12

    .line 576
    .line 577
    goto :goto_c

    .line 578
    :cond_12
    move/from16 v16, v8

    .line 579
    .line 580
    move-object/from16 v17, v12

    .line 581
    .line 582
    move-object v8, v1

    .line 583
    throw v17
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_1c .. :try_end_1c} :catch_5

    .line 584
    :goto_e
    :try_start_1d
    iget-object v0, v14, Lbg4;->a:Ljava/lang/String;

    .line 585
    .line 586
    invoke-virtual {v10, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 587
    .line 588
    .line 589
    move-result-object v0

    .line 590
    invoke-static {v0, v3}, La30;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 591
    .line 592
    .line 593
    invoke-virtual {v13}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 594
    .line 595
    .line 596
    new-instance v1, Lig4;

    .line 597
    .line 598
    iget-object v0, v14, Lbg4;->a:Ljava/lang/String;

    .line 599
    .line 600
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 601
    .line 602
    .line 603
    move-result v2

    .line 604
    invoke-virtual {v11}, Lph4;->toString()Ljava/lang/String;

    .line 605
    .line 606
    .line 607
    move-result-object v4

    .line 608
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 609
    .line 610
    .line 611
    move-result v5

    .line 612
    new-instance v6, Ljava/lang/StringBuilder;

    .line 613
    .line 614
    add-int/lit8 v2, v2, 0x17

    .line 615
    .line 616
    add-int/2addr v2, v5

    .line 617
    invoke-direct {v6, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 618
    .line 619
    .line 620
    const-string v2, "Decoder init failed: "

    .line 621
    .line 622
    const-string v5, ", "

    .line 623
    .line 624
    invoke-static {v6, v2, v0, v5, v4}, Lex0;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object v2

    .line 628
    iget-object v4, v11, Lph4;->m:Ljava/lang/String;

    .line 629
    .line 630
    instance-of v0, v3, Landroid/media/MediaCodec$CodecException;

    .line 631
    .line 632
    if-eqz v0, :cond_13

    .line 633
    .line 634
    move-object v0, v3

    .line 635
    check-cast v0, Landroid/media/MediaCodec$CodecException;

    .line 636
    .line 637
    invoke-virtual {v0}, Landroid/media/MediaCodec$CodecException;->getDiagnosticInfo()Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object v0

    .line 641
    move-object v6, v0

    .line 642
    :goto_f
    move-object v5, v14

    .line 643
    goto :goto_10

    .line 644
    :cond_13
    move-object/from16 v6, v17

    .line 645
    .line 646
    goto :goto_f

    .line 647
    :goto_10
    invoke-direct/range {v1 .. v6}, Lig4;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Lbg4;Ljava/lang/String;)V

    .line 648
    .line 649
    .line 650
    invoke-virtual {v8, v1}, Lkg4;->U(Ljava/lang/Exception;)V

    .line 651
    .line 652
    .line 653
    iget-object v0, v8, Lkg4;->V:Lig4;

    .line 654
    .line 655
    if-nez v0, :cond_14

    .line 656
    .line 657
    iput-object v1, v8, Lkg4;->V:Lig4;

    .line 658
    .line 659
    goto :goto_11

    .line 660
    :catch_a
    move-exception v0

    .line 661
    goto :goto_12

    .line 662
    :cond_14
    iget-object v5, v0, Lig4;->g:Lbg4;

    .line 663
    .line 664
    iget-object v6, v0, Lig4;->h:Ljava/lang/String;

    .line 665
    .line 666
    new-instance v1, Lig4;

    .line 667
    .line 668
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 669
    .line 670
    .line 671
    move-result-object v2

    .line 672
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 673
    .line 674
    .line 675
    move-result-object v3

    .line 676
    iget-object v4, v0, Lig4;->f:Ljava/lang/String;

    .line 677
    .line 678
    invoke-direct/range {v1 .. v6}, Lig4;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Lbg4;Ljava/lang/String;)V

    .line 679
    .line 680
    .line 681
    iput-object v1, v8, Lkg4;->V:Lig4;

    .line 682
    .line 683
    :goto_11
    invoke-virtual {v13}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 684
    .line 685
    .line 686
    move-result v0

    .line 687
    if-nez v0, :cond_15

    .line 688
    .line 689
    goto/16 :goto_b

    .line 690
    .line 691
    :cond_15
    iget-object v0, v8, Lkg4;->V:Lig4;

    .line 692
    .line 693
    throw v0

    .line 694
    :cond_16
    move-object v8, v1

    .line 695
    move-object/from16 v17, v12

    .line 696
    .line 697
    throw v17

    .line 698
    :cond_17
    move-object v8, v1

    .line 699
    move-object v1, v12

    .line 700
    iput-object v1, v8, Lkg4;->U:Ljava/util/ArrayDeque;

    .line 701
    .line 702
    goto :goto_13

    .line 703
    :cond_18
    move-object v8, v1

    .line 704
    move-object v1, v12

    .line 705
    throw v1

    .line 706
    :cond_19
    move-object v8, v1

    .line 707
    move-object v1, v12

    .line 708
    new-instance v0, Lig4;

    .line 709
    .line 710
    const v2, -0xc34f

    .line 711
    .line 712
    .line 713
    invoke-direct {v0, v11, v1, v2}, Lig4;-><init>(Lph4;Lmg4;I)V

    .line 714
    .line 715
    .line 716
    throw v0

    .line 717
    :cond_1a
    move-object v8, v1

    .line 718
    move-object v1, v12

    .line 719
    throw v1
    :try_end_1d
    .catch Lig4; {:try_start_1d .. :try_end_1d} :catch_a

    .line 720
    :goto_12
    const/16 v1, 0xfa1

    .line 721
    .line 722
    const/4 v2, 0x0

    .line 723
    invoke-virtual {v8, v0, v7, v2, v1}, Lkg4;->m(Ljava/lang/Exception;Lph4;ZI)Lb84;

    .line 724
    .line 725
    .line 726
    move-result-object v0

    .line 727
    throw v0

    .line 728
    :goto_13
    return-void
.end method

.method public w(Lbg4;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method

.method public final x()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lkg4;->P:Lzf4;

    .line 3
    .line 4
    if-eqz v1, :cond_1

    .line 5
    .line 6
    invoke-interface {v1}, Lzf4;->k()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lkg4;->t0:Ln34;

    .line 10
    .line 11
    iget v2, v1, Ln34;->b:I

    .line 12
    .line 13
    add-int/lit8 v2, v2, 0x1

    .line 14
    .line 15
    iput v2, v1, Ln34;->b:I

    .line 16
    .line 17
    iget-object v1, p0, Lkg4;->W:Lbg4;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    iget-object v1, v1, Lbg4;->a:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Lkg4;->T(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v1

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    :cond_1
    :goto_0
    iput-object v0, p0, Lkg4;->P:Lzf4;

    .line 31
    .line 32
    iput-object v0, p0, Lkg4;->J:Lci3;

    .line 33
    .line 34
    invoke-virtual {p0}, Lkg4;->B()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :goto_1
    iput-object v0, p0, Lkg4;->P:Lzf4;

    .line 39
    .line 40
    iput-object v0, p0, Lkg4;->J:Lci3;

    .line 41
    .line 42
    invoke-virtual {p0}, Lkg4;->B()V

    .line 43
    .line 44
    .line 45
    throw v1
.end method

.method public y()Z
    .locals 4

    .line 1
    iget v0, p0, Lkg4;->l0:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eq v0, v1, :cond_2

    .line 6
    .line 7
    iget-boolean v1, p0, Lkg4;->X:Z

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-boolean v1, p0, Lkg4;->o0:Z

    .line 12
    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    :cond_0
    const/4 v1, 0x2

    .line 16
    const/4 v3, 0x0

    .line 17
    if-ne v0, v1, :cond_1

    .line 18
    .line 19
    :try_start_0
    iget-object v0, p0, Lkg4;->K:Lci3;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lkg4;->J:Lci3;

    .line 25
    .line 26
    iput v3, p0, Lkg4;->k0:I

    .line 27
    .line 28
    iput v3, p0, Lkg4;->l0:I
    :try_end_0
    .catch Lb84; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catch_0
    move-exception v0

    .line 32
    const-string v1, "Failed to update the DRM session, releasing the codec instead."

    .line 33
    .line 34
    invoke-static {v1, v0}, La30;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    return v2

    .line 38
    :cond_1
    :goto_0
    return v3

    .line 39
    :cond_2
    return v2
.end method

.method public z()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method
