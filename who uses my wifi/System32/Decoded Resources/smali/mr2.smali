.class public final Lmr2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Liq3;
.implements Lug2;
.implements Lo93;
.implements Lp93;
.implements Lk73;
.implements Ldp2;
.implements Lhh3;
.implements Lks2;
.implements Lg8;
.implements Lzf4;


# instance fields
.field public final synthetic f:I

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 3

    iput p1, p0, Lmr2;->f:I

    packed-switch p1, :pswitch_data_0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lrc3;

    invoke-direct {p1}, Lrc3;-><init>()V

    iput-object p1, p0, Lmr2;->g:Ljava/lang/Object;

    new-instance v0, Lvg0;

    const/16 v1, 0x1a

    invoke-direct {v0, v1, p1}, Lvg0;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Lmr2;->h:Ljava/lang/Object;

    return-void

    .line 2
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    .line 3
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lmr2;->g:Ljava/lang/Object;

    iput-object p1, p0, Lmr2;->h:Ljava/lang/Object;

    return-void

    .line 4
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lmr2;->g:Ljava/lang/Object;

    new-instance p1, Ljava/util/HashMap;

    .line 5
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lmr2;->h:Ljava/lang/Object;

    return-void

    .line 6
    :pswitch_3
    new-instance p1, Ljr3;

    const/4 v0, 0x2

    invoke-direct {p1, v0}, Ljr3;-><init>(I)V

    const/16 v0, 0xa

    new-array v0, v0, [J

    const/16 v1, 0xd

    const/4 v2, 0x0

    invoke-direct {p0, p1, v0, v1, v2}, Lmr2;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    return-void

    .line 7
    :pswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lmr2;->g:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    iput p2, p0, Lmr2;->f:I

    packed-switch p2, :pswitch_data_0

    .line 11
    new-instance p2, Lpi1;

    const/4 v0, 0x7

    invoke-direct {p2, v0}, Lpi1;-><init>(I)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lmr2;->g:Ljava/lang/Object;

    .line 13
    iput-object p2, p0, Lmr2;->h:Ljava/lang/Object;

    return-void

    .line 14
    :pswitch_0
    sget-object p2, Lgz;->b:Lgz;

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance v0, Lwd4;

    invoke-direct {v0, p1, p2}, Lwd4;-><init>(Landroid/content/Context;Lgz;)V

    iput-object v0, p0, Lmr2;->g:Ljava/lang/Object;

    .line 17
    const-class p2, Lxb4;

    monitor-enter p2

    .line 18
    :try_start_0
    sget-object v0, Lxb4;->j:Lxb4;

    if-nez v0, :cond_0

    new-instance v0, Lxb4;

    .line 19
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lxb4;-><init>(Landroid/content/Context;)V

    sput-object v0, Lxb4;->j:Lxb4;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object p1, Lxb4;->j:Lxb4;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p2

    .line 20
    iput-object p1, p0, Lmr2;->h:Ljava/lang/Object;

    return-void

    .line 21
    :goto_1
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :pswitch_data_0
    .packed-switch 0x13
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Landroid/media/MediaCodec;Lwt2;)V
    .locals 2

    const/16 v0, 0x14

    iput v0, p0, Lmr2;->f:I

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmr2;->g:Ljava/lang/Object;

    iput-object p2, p0, Lmr2;->h:Ljava/lang/Object;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x23

    if-lt v0, v1, :cond_1

    if-eqz p2, :cond_1

    .line 23
    iget-object v0, p2, Lwt2;->h:Ljava/lang/Object;

    check-cast v0, Landroid/media/LoudnessCodecController;

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, Lsf4;->e(Landroid/media/LoudnessCodecController;Landroid/media/MediaCodec;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p2, Lwt2;->g:Ljava/lang/Object;

    check-cast p2, Ljava/util/HashSet;

    .line 24
    invoke-virtual {p2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Lzt0;->b0(Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public synthetic constructor <init>(Ldw3;)V
    .locals 2

    const/16 v0, 0xe

    iput v0, p0, Lmr2;->f:I

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    .line 40
    iget-object v1, p1, Ldw3;->a:Ljava/util/HashMap;

    .line 41
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lmr2;->g:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashMap;

    .line 42
    iget-object p1, p1, Ldw3;->b:Ljava/util/HashMap;

    .line 43
    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lmr2;->h:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 8
    iput p3, p0, Lmr2;->f:I

    iput-object p2, p0, Lmr2;->g:Ljava/lang/Object;

    iput-object p1, p0, Lmr2;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V
    .locals 0

    .line 9
    iput p3, p0, Lmr2;->f:I

    iput-object p1, p0, Lmr2;->g:Ljava/lang/Object;

    iput-object p2, p0, Lmr2;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lof4;Landroid/util/SparseArray;)V
    .locals 5

    const/16 v0, 0x11

    iput v0, p0, Lmr2;->f:I

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmr2;->g:Ljava/lang/Object;

    new-instance v0, Landroid/util/SparseArray;

    .line 28
    iget-object v1, p1, Lof4;->a:Landroid/util/SparseBooleanArray;

    .line 29
    invoke-virtual {v1}, Landroid/util/SparseBooleanArray;->size()I

    move-result v2

    .line 30
    invoke-direct {v0, v2}, Landroid/util/SparseArray;-><init>(I)V

    const/4 v2, 0x0

    .line 31
    :goto_0
    invoke-virtual {v1}, Landroid/util/SparseBooleanArray;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    .line 32
    invoke-virtual {p1, v2}, Lof4;->a(I)I

    move-result v3

    .line 33
    invoke-virtual {p2, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lad4;

    .line 34
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    invoke-virtual {v0, v3, v4}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 36
    :cond_0
    iput-object v0, p0, Lmr2;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lsn3;[I)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, Lmr2;->f:I

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lxm3;->m(Ljava/util/Collection;)Lxm3;

    move-result-object p1

    iput-object p1, p0, Lmr2;->g:Ljava/lang/Object;

    iput-object p2, p0, Lmr2;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lwt2;)V
    .locals 1

    const/16 v0, 0xd

    iput v0, p0, Lmr2;->f:I

    .line 37
    invoke-direct {p0, v0}, Lmr2;-><init>(I)V

    .line 38
    invoke-static {p0, p1}, Lmr2;->x(Lmr2;Lwt2;)V

    return-void
.end method

.method public constructor <init>(Lxy2;Lea2;Lw92;)V
    .locals 0

    const/4 p1, 0x3

    iput p1, p0, Lmr2;->f:I

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lmr2;->h:Ljava/lang/Object;

    iput-object p3, p0, Lmr2;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lzs1;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Lmr2;->f:I

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmr2;->g:Ljava/lang/Object;

    return-void
.end method

.method public static x(Lmr2;Lwt2;)V
    .locals 5

    .line 1
    iget-object v0, p1, Lwt2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljr3;

    .line 4
    .line 5
    iget-object v1, p0, Lmr2;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljr3;

    .line 8
    .line 9
    iget-object v2, v1, Ljr3;->g:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, [J

    .line 12
    .line 13
    iget-object v3, v0, Ljr3;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, [J

    .line 16
    .line 17
    iget-object p1, p1, Lwt2;->h:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p1, [J

    .line 20
    .line 21
    invoke-static {v2, v3, p1}, Lpu1;->G([J[J[J)V

    .line 22
    .line 23
    .line 24
    iget-object v2, v1, Ljr3;->h:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, [J

    .line 27
    .line 28
    iget-object v4, v0, Ljr3;->h:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v4, [J

    .line 31
    .line 32
    iget-object v0, v0, Ljr3;->i:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, [J

    .line 35
    .line 36
    invoke-static {v2, v4, v0}, Lpu1;->G([J[J[J)V

    .line 37
    .line 38
    .line 39
    iget-object v1, v1, Ljr3;->i:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, [J

    .line 42
    .line 43
    invoke-static {v1, v0, p1}, Lpu1;->G([J[J[J)V

    .line 44
    .line 45
    .line 46
    iget-object p0, p0, Lmr2;->h:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, [J

    .line 49
    .line 50
    invoke-static {p0, v3, v4}, Lpu1;->G([J[J[J)V

    .line 51
    .line 52
    .line 53
    return-void
.end method


# virtual methods
.method public A(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lmr2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lof4;

    .line 4
    .line 5
    iget-object v0, v0, Lof4;->a:Landroid/util/SparseBooleanArray;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public B(I)Ljava/nio/ByteBuffer;
    .locals 1

    .line 1
    iget-object v0, p0, Lmr2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->getOutputBuffer(I)Ljava/nio/ByteBuffer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public C()Lm14;
    .locals 10

    .line 1
    iget-object v0, p0, Lmr2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ln14;

    .line 4
    .line 5
    if-eqz v0, :cond_a

    .line 6
    .line 7
    iget-object v1, p0, Lmr2;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lx34;

    .line 10
    .line 11
    if-eqz v1, :cond_9

    .line 12
    .line 13
    iget-object v1, v1, Lx34;->f:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Ljava/math/BigInteger;

    .line 16
    .line 17
    iget-object v2, v0, Ln14;->k:Ljava/security/spec/ECPoint;

    .line 18
    .line 19
    iget-object v0, v0, Ln14;->j:Ll14;

    .line 20
    .line 21
    iget-object v0, v0, Ll14;->b:Lj14;

    .line 22
    .line 23
    iget-object v3, v0, Lj14;->b:Ljava/security/spec/ECParameterSpec;

    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/security/spec/ECParameterSpec;->getOrder()Ljava/math/BigInteger;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v1}, Ljava/math/BigInteger;->signum()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    const-string v5, "Invalid private value"

    .line 34
    .line 35
    if-lez v4, :cond_8

    .line 36
    .line 37
    invoke-virtual {v1, v3}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-gez v3, :cond_8

    .line 42
    .line 43
    iget-object v0, v0, Lj14;->b:Ljava/security/spec/ECParameterSpec;

    .line 44
    .line 45
    sget-object v3, Lru3;->a:Ljava/security/spec/ECParameterSpec;

    .line 46
    .line 47
    invoke-static {v0, v3}, Lru3;->b(Ljava/security/spec/ECParameterSpec;Ljava/security/spec/ECParameterSpec;)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-nez v3, :cond_1

    .line 52
    .line 53
    sget-object v3, Lru3;->b:Ljava/security/spec/ECParameterSpec;

    .line 54
    .line 55
    invoke-static {v0, v3}, Lru3;->b(Ljava/security/spec/ECParameterSpec;Ljava/security/spec/ECParameterSpec;)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-nez v3, :cond_1

    .line 60
    .line 61
    sget-object v3, Lru3;->c:Ljava/security/spec/ECParameterSpec;

    .line 62
    .line 63
    invoke-static {v0, v3}, Lru3;->b(Ljava/security/spec/ECParameterSpec;Ljava/security/spec/ECParameterSpec;)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_0

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 71
    .line 72
    const-string v1, "spec must be NIST P256, P384 or P521"

    .line 73
    .line 74
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw v0

    .line 78
    :cond_1
    :goto_0
    invoke-virtual {v1}, Ljava/math/BigInteger;->signum()I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    const/4 v4, 0x1

    .line 83
    if-ne v3, v4, :cond_7

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/security/spec/ECParameterSpec;->getOrder()Ljava/math/BigInteger;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-virtual {v1, v3}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-gez v3, :cond_6

    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-virtual {v0}, Ljava/security/spec/ECParameterSpec;->getGenerator()Ljava/security/spec/ECPoint;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    invoke-static {v4, v3}, Lru3;->a(Ljava/security/spec/ECPoint;Ljava/security/spec/EllipticCurve;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v0}, Ljava/security/spec/EllipticCurve;->getA()Ljava/math/BigInteger;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-static {v3}, Lru3;->c(Ljava/security/spec/EllipticCurve;)Ljava/math/BigInteger;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    sget-object v7, Ljava/security/spec/ECPoint;->POINT_INFINITY:Ljava/security/spec/ECPoint;

    .line 119
    .line 120
    invoke-static {v7, v6}, Lru3;->d(Ljava/security/spec/ECPoint;Ljava/math/BigInteger;)Lqu3;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    invoke-static {v4, v6}, Lru3;->d(Ljava/security/spec/ECPoint;Ljava/math/BigInteger;)Lqu3;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    invoke-virtual {v1}, Ljava/math/BigInteger;->bitLength()I

    .line 129
    .line 130
    .line 131
    move-result v8

    .line 132
    :goto_1
    if-ltz v8, :cond_3

    .line 133
    .line 134
    invoke-virtual {v1, v8}, Ljava/math/BigInteger;->testBit(I)Z

    .line 135
    .line 136
    .line 137
    move-result v9

    .line 138
    if-eqz v9, :cond_2

    .line 139
    .line 140
    invoke-static {v7, v4, v0, v6}, Lru3;->f(Lqu3;Lqu3;Ljava/math/BigInteger;Ljava/math/BigInteger;)Lqu3;

    .line 141
    .line 142
    .line 143
    move-result-object v7

    .line 144
    invoke-static {v4, v0, v6}, Lru3;->e(Lqu3;Ljava/math/BigInteger;Ljava/math/BigInteger;)Lqu3;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    goto :goto_2

    .line 149
    :cond_2
    invoke-static {v7, v4, v0, v6}, Lru3;->f(Lqu3;Lqu3;Ljava/math/BigInteger;Ljava/math/BigInteger;)Lqu3;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    invoke-static {v7, v0, v6}, Lru3;->e(Lqu3;Ljava/math/BigInteger;Ljava/math/BigInteger;)Lqu3;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    :goto_2
    add-int/lit8 v8, v8, -0x1

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_3
    iget-object v0, v7, Lqu3;->c:Ljava/math/BigInteger;

    .line 161
    .line 162
    sget-object v1, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    .line 163
    .line 164
    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-eqz v0, :cond_4

    .line 169
    .line 170
    sget-object v0, Ljava/security/spec/ECPoint;->POINT_INFINITY:Ljava/security/spec/ECPoint;

    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_4
    iget-object v0, v7, Lqu3;->c:Ljava/math/BigInteger;

    .line 174
    .line 175
    invoke-virtual {v0, v6}, Ljava/math/BigInteger;->modInverse(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-virtual {v0, v0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    invoke-virtual {v1, v6}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    iget-object v4, v7, Lqu3;->a:Ljava/math/BigInteger;

    .line 188
    .line 189
    new-instance v8, Ljava/security/spec/ECPoint;

    .line 190
    .line 191
    invoke-virtual {v4, v1}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    invoke-virtual {v4, v6}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    iget-object v7, v7, Lqu3;->b:Ljava/math/BigInteger;

    .line 200
    .line 201
    invoke-virtual {v7, v1}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    invoke-virtual {v1, v6}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-virtual {v0, v6}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-direct {v8, v4, v0}, Ljava/security/spec/ECPoint;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    .line 218
    .line 219
    .line 220
    move-object v0, v8

    .line 221
    :goto_3
    invoke-static {v0, v3}, Lru3;->a(Ljava/security/spec/ECPoint;Ljava/security/spec/EllipticCurve;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v0, v2}, Ljava/security/spec/ECPoint;->equals(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    if-eqz v0, :cond_5

    .line 229
    .line 230
    new-instance v0, Lm14;

    .line 231
    .line 232
    iget-object v1, p0, Lmr2;->g:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v1, Ln14;

    .line 235
    .line 236
    iget-object v2, p0, Lmr2;->h:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v2, Lx34;

    .line 239
    .line 240
    invoke-direct {v0, v1, v2}, Lm14;-><init>(Ln14;Lx34;)V

    .line 241
    .line 242
    .line 243
    return-object v0

    .line 244
    :cond_5
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 245
    .line 246
    invoke-direct {v0, v5}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    throw v0

    .line 250
    :cond_6
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 251
    .line 252
    const-string v1, "k must be smaller than the order of the generator"

    .line 253
    .line 254
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    throw v0

    .line 258
    :cond_7
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 259
    .line 260
    const-string v1, "k must be positive"

    .line 261
    .line 262
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    throw v0

    .line 266
    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 267
    .line 268
    invoke-direct {v0, v5}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    throw v0

    .line 272
    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 273
    .line 274
    const-string v1, "Cannot build without a private value"

    .line 275
    .line 276
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    throw v0

    .line 280
    :cond_a
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 281
    .line 282
    const-string v1, "Cannot build without a ecdsa public key"

    .line 283
    .line 284
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    throw v0
.end method

.method public I(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lmr2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, p1, v1}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public a()Lth3;
    .locals 10

    .line 1
    new-instance v0, Ltj3;

    iget-object v1, p0, Lmr2;->h:Ljava/lang/Object;

    check-cast v1, Lpi1;

    iget-object v2, p0, Lmr2;->g:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    .line 2
    iget-object v3, v1, Lpi1;->h:Ljava/lang/Object;

    move-object v9, v3

    check-cast v9, Lmr2;

    new-instance v4, Lbl3;

    iget v6, v1, Lpi1;->f:I

    iget v7, v1, Lpi1;->g:I

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v4 .. v9}, Lbl3;-><init>(Ljava/lang/String;IIZLmr2;)V

    .line 3
    invoke-direct {v0, v2, v4}, Ltj3;-><init>(Landroid/content/Context;Lbl3;)V

    return-object v0
.end method

.method public a()V
    .locals 3

    iget-object v0, p0, Lmr2;->g:Ljava/lang/Object;

    check-cast v0, Lt03;

    iget-object v1, p0, Lmr2;->h:Ljava/lang/Object;

    check-cast v1, Luz1;

    .line 4
    iget-object v0, v0, Lt03;->d:Ljava/lang/Object;

    check-cast v0, Lvz1;

    .line 5
    invoke-virtual {v0}, Lsb1;->U()Landroid/os/Parcel;

    move-result-object v2

    .line 6
    invoke-static {v2, v1}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 v1, 0x1

    .line 7
    invoke-virtual {v0, v2, v1}, Lsb1;->M0(Landroid/os/Parcel;I)V

    return-void
.end method

.method public b()I
    .locals 3

    .line 1
    iget-object v0, p0, Lmr2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lmr2;->g:Ljava/lang/Object;

    check-cast v0, Ljz2;

    iget-object v1, p0, Lmr2;->h:Ljava/lang/Object;

    check-cast v1, Lwo1;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1
    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    iget-wide v3, v1, Lwo1;->a:J

    const-string v5, "timestamp"

    .line 2
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v2, v5, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    iget-object v3, v1, Lwo1;->c:Ljava/io/Serializable;

    check-cast v3, Ljava/lang/String;

    .line 3
    const-string v4, "gws_query_id"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, v1, Lwo1;->d:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    .line 4
    const-string v4, "url"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget v1, v1, Lwo1;->b:I

    add-int/lit8 v1, v1, -0x1

    const-string v3, "event_state"

    .line 5
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 6
    const-string v1, "offline_buffered_pings"

    const/4 v3, 0x0

    invoke-virtual {p1, v1, v3, v2}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 7
    sget-object p1, Lhg4;->C:Lhg4;

    iget-object p1, p1, Lhg4;->c:Llf4;

    .line 8
    iget-object p1, v0, Ljz2;->f:Landroid/content/Context;

    invoke-static {p1}, Llf4;->b(Landroid/content/Context;)Ly42;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 9
    :try_start_0
    new-instance v1, Loi0;

    invoke-direct {v1, p1}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 10
    invoke-interface {v0, v1}, Ly42;->zzf(Lu10;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 11
    :catch_0
    invoke-static {}, Lgi2;->R()Z

    :cond_0
    :goto_0
    return-object v3
.end method

.method public c(Ljava/lang/Object;)V
    .locals 3

    iget v0, p0, Lmr2;->f:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lbd4;

    .line 12
    iget-object v0, p0, Lmr2;->g:Ljava/lang/Object;

    check-cast v0, Lad4;

    iget-object v1, p0, Lmr2;->h:Ljava/lang/Object;

    check-cast v1, Lhh4;

    invoke-interface {p1, v0, v1}, Lbd4;->n(Lad4;Lhh4;)V

    return-void

    .line 13
    :pswitch_0
    check-cast p1, Lv93;

    .line 14
    iget-object v0, p0, Lmr2;->g:Ljava/lang/Object;

    check-cast v0, Lq93;

    .line 15
    iget-object v1, v0, Lq93;->f:Ljava/lang/Object;

    .line 16
    check-cast v1, Ls93;

    .line 17
    iget-object v0, v0, Lq93;->g:Ljava/lang/String;

    .line 18
    iget-object v2, p0, Lmr2;->h:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Throwable;

    invoke-interface {p1, v1, v0, v2}, Lv93;->H(Ls93;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
    .end packed-switch
.end method

.method public c0(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lmr2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setParameters(Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public d(IIJI)V
    .locals 8

    .line 1
    iget-object v0, p0, Lmr2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Landroid/media/MediaCodec;

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    move v2, p1

    .line 8
    move v4, p2

    .line 9
    move-wide v5, p3

    .line 10
    move v7, p5

    .line 11
    invoke-virtual/range {v1 .. v7}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public e()Landroid/media/MediaFormat;
    .locals 1

    .line 1
    iget-object v0, p0, Lmr2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public f(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lmr2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setVideoScalingMode(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public g()V
    .locals 1

    .line 1
    iget-object v0, p0, Lmr2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/media/MediaCodec;->flush()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public h()Lgi4;
    .locals 6

    .line 1
    iget-object v0, p0, Lmr2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lwd4;

    .line 4
    .line 5
    invoke-virtual {v0}, Lwd4;->h()Lgi4;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lyf3;

    .line 10
    .line 11
    invoke-direct {v1, p0}, Lyf3;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    sget-object v2, Lm01;->a:Lia1;

    .line 18
    .line 19
    new-instance v3, Lgi4;

    .line 20
    .line 21
    invoke-direct {v3}, Lgi4;-><init>()V

    .line 22
    .line 23
    .line 24
    new-instance v4, Lmn2;

    .line 25
    .line 26
    const/4 v5, 0x1

    .line 27
    invoke-direct {v4, v2, v1, v3, v5}, Lmn2;-><init>(Ljava/util/concurrent/Executor;Lpj;Lgi4;I)V

    .line 28
    .line 29
    .line 30
    iget-object v1, v0, Lgi4;->b:Lwy0;

    .line 31
    .line 32
    invoke-virtual {v1, v4}, Lwy0;->c(Lje4;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lgi4;->h()V

    .line 36
    .line 37
    .line 38
    return-object v3
.end method

.method public bridge synthetic i(Llv2;Lj73;)Ln70;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Lmr2;->w(Llv2;Lj73;Llm2;)Ln70;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method public k()V
    .locals 5

    .line 1
    iget-object v0, p0, Lmr2;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lwt2;

    .line 4
    .line 5
    iget-object v1, p0, Lmr2;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/media/MediaCodec;

    .line 8
    .line 9
    const/16 v2, 0x23

    .line 10
    .line 11
    :try_start_0
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 12
    .line 13
    const/16 v4, 0x1e

    .line 14
    .line 15
    if-lt v3, v4, :cond_0

    .line 16
    .line 17
    const/16 v4, 0x21

    .line 18
    .line 19
    if-ge v3, v4, :cond_0

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/media/MediaCodec;->stop()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v3

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    :goto_0
    if-lt v3, v2, :cond_1

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lwt2;->l(Landroid/media/MediaCodec;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {v1}, Landroid/media/MediaCodec;->release()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :goto_1
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 39
    .line 40
    if-lt v4, v2, :cond_3

    .line 41
    .line 42
    if-nez v0, :cond_2

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    invoke-virtual {v0, v1}, Lwt2;->l(Landroid/media/MediaCodec;)V

    .line 46
    .line 47
    .line 48
    :cond_3
    :goto_2
    invoke-virtual {v1}, Landroid/media/MediaCodec;->release()V

    .line 49
    .line 50
    .line 51
    throw v3
.end method

.method public l()Ljava/lang/Object;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lmr2;->h:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Llm2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-object v0

    .line 8
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    throw v0

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    goto :goto_0
.end method

.method public m(IJ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lmr2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Landroid/media/MediaCodec;->releaseOutputBuffer(IJ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public n(ILyu3;JI)V
    .locals 7

    .line 1
    iget-object v3, p2, Lyu3;->i:Landroid/media/MediaCodec$CryptoInfo;

    .line 2
    .line 3
    iget-object p2, p0, Lmr2;->g:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Landroid/media/MediaCodec;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    move v1, p1

    .line 10
    move-wide v4, p3

    .line 11
    move v6, p5

    .line 12
    invoke-virtual/range {v0 .. v6}, Landroid/media/MediaCodec;->queueSecureInputBuffer(IILandroid/media/MediaCodec$CryptoInfo;JI)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public o()V
    .locals 1

    .line 1
    iget-object v0, p0, Lmr2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-static {v0}, Lsf4;->d(Landroid/media/MediaCodec;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public p(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, Lmr2;->f:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lmr2;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lh2;

    .line 9
    .line 10
    check-cast p1, Lp13;

    .line 11
    .line 12
    monitor-enter v0

    .line 13
    :try_start_0
    iget-object v1, v0, Lh2;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Lh13;

    .line 16
    .line 17
    iget-object v2, p0, Lmr2;->g:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, La83;

    .line 20
    .line 21
    invoke-virtual {v1, p1, v2}, Lh13;->b(Lp13;La83;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, v0, Lh2;->h:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Lh13;

    .line 27
    .line 28
    invoke-virtual {p1}, Lh13;->a()La83;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Lh2;->q(La83;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception p1

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    :goto_0
    monitor-exit v0

    .line 41
    return-void

    .line 42
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    throw p1

    .line 44
    :sswitch_0
    check-cast p1, Ljava/lang/String;

    .line 45
    .line 46
    :try_start_1
    iget-object v0, p0, Lmr2;->h:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Lea2;

    .line 49
    .line 50
    iget-object v1, p0, Lmr2;->g:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, Lw92;

    .line 53
    .line 54
    invoke-virtual {v0}, Lsb1;->U()Landroid/os/Parcel;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v2, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v2, v1}, Liv1;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 62
    .line 63
    .line 64
    const/4 p1, 0x1

    .line 65
    invoke-virtual {v0, v2, p1}, Lsb1;->M0(Landroid/os/Parcel;I)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :catch_0
    invoke-static {}, Lgi2;->R()Z

    .line 70
    .line 71
    .line 72
    :goto_2
    return-void

    .line 73
    :sswitch_1
    iget-object v0, p0, Lmr2;->h:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, Lpr2;

    .line 76
    .line 77
    iget-object v1, p0, Lmr2;->g:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v1, Landroid/view/View;

    .line 80
    .line 81
    check-cast p1, Lxz2;

    .line 82
    .line 83
    invoke-virtual {v0, v1, p1}, Lpr2;->m(Landroid/view/View;Lxz2;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x3 -> :sswitch_0
    .end sparse-switch
.end method

.method public q(Landroid/view/Surface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lmr2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setOutputSurface(Landroid/view/Surface;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public r(Landroid/media/MediaCodec$BufferInfo;)I
    .locals 3

    .line 1
    :cond_0
    iget-object v0, p0, Lmr2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    invoke-virtual {v0, p1, v1, v2}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, -0x3

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    return v0
.end method

.method public s(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    iget v0, p0, Lmr2;->f:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lmr2;->h:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v0, p1

    .line 9
    check-cast v0, Lh2;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    iget-object p1, v0, Lh2;->h:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, Lh13;

    .line 15
    .line 16
    iget-object v1, p0, Lmr2;->g:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, La83;

    .line 19
    .line 20
    invoke-virtual {p1, v1}, Lh13;->c(La83;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, v0, Lh2;->h:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, Lh13;

    .line 26
    .line 27
    invoke-virtual {p1}, Lh13;->a()La83;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-boolean v1, v1, La83;->v0:Z

    .line 32
    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    :goto_0
    if-eqz p1, :cond_1

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Lh2;->q(La83;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, v0, Lh2;->h:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Lh13;

    .line 43
    .line 44
    invoke-virtual {p1}, Lh13;->a()La83;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    if-eqz p1, :cond_1

    .line 52
    .line 53
    invoke-virtual {v0, p1}, Lh2;->q(La83;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    monitor-exit v0

    .line 57
    return-void

    .line 58
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    throw p1

    .line 60
    :sswitch_0
    :try_start_1
    iget-object v0, p0, Lmr2;->h:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v0, Lea2;

    .line 63
    .line 64
    invoke-static {p1}, Lzt0;->A(Ljava/lang/Throwable;)Lnx2;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-static {v2}, Lyc0;->s(Ljava/lang/String;)Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_2

    .line 77
    .line 78
    iget-object p1, v1, Lnx2;->g:Ljava/lang/String;

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    :goto_2
    new-instance v2, Lwu1;

    .line 86
    .line 87
    iget v1, v1, Lnx2;->f:I

    .line 88
    .line 89
    invoke-direct {v2, p1, v1}, Lwu1;-><init>(Ljava/lang/String;I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Lsb1;->U()Landroid/os/Parcel;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-static {p1, v2}, Liv1;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 97
    .line 98
    .line 99
    const/4 v1, 0x2

    .line 100
    invoke-virtual {v0, p1, v1}, Lsb1;->M0(Landroid/os/Parcel;I)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    .line 101
    .line 102
    .line 103
    goto :goto_3

    .line 104
    :catch_0
    invoke-static {}, Lgi2;->R()Z

    .line 105
    .line 106
    .line 107
    :goto_3
    return-void

    .line 108
    :sswitch_1
    sget-object v0, Lmz1;->O5:Liz1;

    .line 109
    .line 110
    sget-object v1, Ltw1;->e:Ltw1;

    .line 111
    .line 112
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 113
    .line 114
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    check-cast v0, Ljava/lang/Boolean;

    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-eqz v0, :cond_3

    .line 125
    .line 126
    const-string v0, "omid native display exp"

    .line 127
    .line 128
    sget-object v1, Lhg4;->C:Lhg4;

    .line 129
    .line 130
    iget-object v1, v1, Lhg4;->h:Lgd2;

    .line 131
    .line 132
    invoke-virtual {v1, v0, p1}, Lgd2;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 133
    .line 134
    .line 135
    :cond_3
    return-void

    .line 136
    nop

    .line 137
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x3 -> :sswitch_0
    .end sparse-switch
.end method

.method public declared-synchronized t()Ljava/util/Map;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lmr2;->h:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Ljava/util/Map;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lmr2;->g:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/util/HashMap;

    .line 11
    .line 12
    new-instance v1, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {v1, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lmr2;->h:Ljava/lang/Object;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    :goto_0
    iget-object v0, p0, Lmr2;->h:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    monitor-exit p0

    .line 31
    return-object v0

    .line 32
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    throw v0
.end method

.method public u(Law3;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    new-instance v0, Lcw3;

    .line 4
    .line 5
    iget-object v1, p1, Law3;->a:Ljava/lang/Class;

    .line 6
    .line 7
    iget-object v2, p1, Law3;->b:Ljava/lang/Class;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Lcw3;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lmr2;->g:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Law3;

    .line 27
    .line 28
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 42
    .line 43
    invoke-virtual {v0}, Lcw3;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v1, "Attempt to register non-equal PrimitiveConstructor object for already existing object of type: "

    .line 48
    .line 49
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_1
    invoke-virtual {v1, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    .line 62
    .line 63
    const-string v0, "primitive constructor must be non-null"

    .line 64
    .line 65
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1
.end method

.method public v(Ljava/lang/String;ILjava/lang/String;Z)V
    .locals 4

    .line 1
    iget v0, p0, Lmr2;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lmr2;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lpd2;

    .line 9
    .line 10
    if-eqz p4, :cond_1

    .line 11
    .line 12
    sget-object p1, Lmz1;->p2:Liz1;

    .line 13
    .line 14
    sget-object p2, Ltw1;->e:Ltw1;

    .line 15
    .line 16
    iget-object p2, p2, Ltw1;->c:Lkz1;

    .line 17
    .line 18
    invoke-virtual {p2, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Ljava/lang/Boolean;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    iget-object p1, p0, Lmr2;->g:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p1, Landroid/os/Bundle;

    .line 33
    .line 34
    sget-object p2, Lhg4;->C:Lhg4;

    .line 35
    .line 36
    iget-object p2, p2, Lhg4;->k:Lym;

    .line 37
    .line 38
    const-string p3, "rendering-webview-load-html-end"

    .line 39
    .line 40
    invoke-static {p2, p1, p3}, Lga1;->n(Lym;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    const/4 p1, 0x0

    .line 44
    invoke-virtual {v0, p1}, Lpd2;->a(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    new-instance p4, Ljava/lang/Exception;

    .line 49
    .line 50
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    add-int/lit8 v1, v1, 0x37

    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    add-int/2addr v1, v2

    .line 73
    add-int/lit8 v1, v1, 0xf

    .line 74
    .line 75
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    new-instance v3, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    add-int/2addr v1, v2

    .line 82
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 83
    .line 84
    .line 85
    const-string v1, "Ad Web View failed to load. Error code: "

    .line 86
    .line 87
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string p2, ", Description: "

    .line 94
    .line 95
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string p1, ", Failing URL: "

    .line 102
    .line 103
    invoke-static {v3, p1, p3}, Lex0;->k(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-direct {p4, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, p4}, Lpd2;->b(Ljava/lang/Throwable;)V

    .line 111
    .line 112
    .line 113
    :goto_0
    return-void

    .line 114
    :pswitch_0
    iget-object p1, p0, Lmr2;->g:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast p1, Lqs2;

    .line 117
    .line 118
    iget-object p2, p0, Lmr2;->h:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast p2, Ljava/util/Map;

    .line 121
    .line 122
    new-instance p3, Ljava/util/HashMap;

    .line 123
    .line 124
    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    .line 125
    .line 126
    .line 127
    const-string p4, "messageType"

    .line 128
    .line 129
    const-string v0, "validatorHtmlLoaded"

    .line 130
    .line 131
    invoke-virtual {p3, p4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    const-string p4, "id"

    .line 135
    .line 136
    invoke-interface {p2, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    check-cast p2, Ljava/lang/String;

    .line 141
    .line 142
    invoke-virtual {p3, p4, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    iget-object p1, p1, Lqs2;->b:Lau2;

    .line 146
    .line 147
    invoke-virtual {p1, p3}, Lau2;->d(Ljava/util/Map;)V

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public declared-synchronized w(Llv2;Lj73;Llm2;)Ln70;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-object p3, p0, Lmr2;->h:Ljava/lang/Object;

    .line 3
    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    iget-object v0, p1, Llv2;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lfa2;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p3}, Llm2;->a()Lnl2;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {v0}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-virtual {p1, p2}, Lnl2;->a(Ln70;)Lq93;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-virtual {p1, p2}, Lnl2;->c(Ln70;)Lq93;

    .line 25
    .line 26
    .line 27
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    monitor-exit p0

    .line 29
    return-object p1

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    :try_start_1
    iget-object v0, p0, Lmr2;->g:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Lzs1;

    .line 35
    .line 36
    invoke-virtual {v0, p1, p2, p3}, Lzs1;->E(Llv2;Lj73;Llm2;)Ln70;

    .line 37
    .line 38
    .line 39
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    monitor-exit p0

    .line 41
    return-object p1

    .line 42
    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 43
    throw p1
.end method

.method public y(Lew3;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lmr2;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-interface {p1}, Lew3;->a()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lew3;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-string v1, "Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type"

    .line 41
    .line 42
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_1
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public z(I)Ljava/nio/ByteBuffer;
    .locals 1

    .line 1
    iget-object v0, p0, Lmr2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->getInputBuffer(I)Ljava/nio/ByteBuffer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
