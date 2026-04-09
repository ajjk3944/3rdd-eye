.class public final Lsv1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final f:Lsv1;


# instance fields
.field public final a:Lj63;

.field public final b:Lbu1;

.field public final c:Ljava/lang/String;

.field public final d:Le51;

.field public final e:Ljava/util/Random;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lsv1;

    .line 2
    .line 3
    invoke-direct {v0}, Lsv1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lsv1;->f:Lsv1;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 11

    .line 1
    new-instance v0, Lj63;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/high16 v1, -0x40800000    # -1.0f

    .line 7
    .line 8
    iput v1, v0, Lj63;->a:F

    .line 9
    .line 10
    new-instance v2, Lbu1;

    .line 11
    .line 12
    new-instance v3, Lg32;

    .line 13
    .line 14
    const-string v1, "com.google.android.gms.ads.AdManagerCreatorImpl"

    .line 15
    .line 16
    const/4 v4, 0x4

    .line 17
    invoke-direct {v3, v1, v4}, Lg32;-><init>(Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    new-instance v4, Lg32;

    .line 21
    .line 22
    const-string v1, "com.google.android.gms.ads.AdLoaderBuilderCreatorImpl"

    .line 23
    .line 24
    const/4 v5, 0x3

    .line 25
    invoke-direct {v4, v1, v5}, Lg32;-><init>(Ljava/lang/String;I)V

    .line 26
    .line 27
    .line 28
    new-instance v5, Lg32;

    .line 29
    .line 30
    const-string v1, "com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl"

    .line 31
    .line 32
    const/4 v6, 0x2

    .line 33
    invoke-direct {v5, v1, v6}, Lg32;-><init>(Ljava/lang/String;I)V

    .line 34
    .line 35
    .line 36
    new-instance v6, Lg32;

    .line 37
    .line 38
    const-string v1, "com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl"

    .line 39
    .line 40
    const/4 v7, 0x0

    .line 41
    invoke-direct {v6, v1, v7}, Lg32;-><init>(Ljava/lang/String;I)V

    .line 42
    .line 43
    .line 44
    new-instance v7, Lg32;

    .line 45
    .line 46
    const-string v1, "com.google.android.gms.ads.AdOverlayCreatorImpl"

    .line 47
    .line 48
    const/4 v8, 0x1

    .line 49
    invoke-direct {v7, v1, v8}, Lg32;-><init>(Ljava/lang/String;I)V

    .line 50
    .line 51
    .line 52
    new-instance v8, Lg32;

    .line 53
    .line 54
    const-string v1, "com.google.android.gms.ads.AdPreloaderRemoteCreatorImpl"

    .line 55
    .line 56
    const/4 v9, 0x5

    .line 57
    invoke-direct {v8, v1, v9}, Lg32;-><init>(Ljava/lang/String;I)V

    .line 58
    .line 59
    .line 60
    const/4 v9, 0x0

    .line 61
    invoke-direct/range {v2 .. v9}, Lbu1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 62
    .line 63
    .line 64
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v1}, Ljava/util/UUID;->getLeastSignificantBits()J

    .line 69
    .line 70
    .line 71
    move-result-wide v3

    .line 72
    invoke-static {v3, v4}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-virtual {v3}, Ljava/math/BigInteger;->toByteArray()[B

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-virtual {v1}, Ljava/util/UUID;->getMostSignificantBits()J

    .line 81
    .line 82
    .line 83
    move-result-wide v4

    .line 84
    invoke-static {v4, v5}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-virtual {v1}, Ljava/math/BigInteger;->toByteArray()[B

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    new-instance v4, Ljava/math/BigInteger;

    .line 93
    .line 94
    const/4 v5, 0x1

    .line 95
    invoke-direct {v4, v5, v3}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    const/4 v6, 0x0

    .line 103
    move v7, v6

    .line 104
    :goto_0
    const/4 v8, 0x2

    .line 105
    if-ge v7, v8, :cond_0

    .line 106
    .line 107
    :try_start_0
    const-string v8, "MD5"

    .line 108
    .line 109
    invoke-static {v8}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    invoke-virtual {v8, v3}, Ljava/security/MessageDigest;->update([B)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v8, v1}, Ljava/security/MessageDigest;->update([B)V

    .line 117
    .line 118
    .line 119
    const/16 v9, 0x8

    .line 120
    .line 121
    new-array v10, v9, [B

    .line 122
    .line 123
    invoke-virtual {v8}, Ljava/security/MessageDigest;->digest()[B

    .line 124
    .line 125
    .line 126
    move-result-object v8

    .line 127
    invoke-static {v8, v6, v10, v6, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 128
    .line 129
    .line 130
    new-instance v8, Ljava/math/BigInteger;

    .line 131
    .line 132
    invoke-direct {v8, v5, v10}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v8}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v4
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    .line 139
    :catch_0
    add-int/lit8 v7, v7, 0x1

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_0
    new-instance v1, Le51;

    .line 143
    .line 144
    const v3, 0xf212370

    .line 145
    .line 146
    .line 147
    invoke-direct {v1, v6, v3, v5}, Le51;-><init>(IIZ)V

    .line 148
    .line 149
    .line 150
    new-instance v3, Ljava/util/Random;

    .line 151
    .line 152
    invoke-direct {v3}, Ljava/util/Random;-><init>()V

    .line 153
    .line 154
    .line 155
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 156
    .line 157
    .line 158
    iput-object v0, p0, Lsv1;->a:Lj63;

    .line 159
    .line 160
    iput-object v2, p0, Lsv1;->b:Lbu1;

    .line 161
    .line 162
    iput-object v4, p0, Lsv1;->c:Ljava/lang/String;

    .line 163
    .line 164
    iput-object v1, p0, Lsv1;->d:Le51;

    .line 165
    .line 166
    iput-object v3, p0, Lsv1;->e:Ljava/util/Random;

    .line 167
    .line 168
    return-void
.end method
