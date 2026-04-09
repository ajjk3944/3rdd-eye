.class public final synthetic Ly24;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Luv3;
.implements Lxu3;
.implements Lo34;
.implements Lks2;
.implements Lgp0;


# static fields
.field public static final synthetic g:Ly24;

.field public static final synthetic h:Ly24;

.field public static final synthetic i:Ly24;

.field public static final synthetic j:Ly24;

.field public static final synthetic k:Ly24;

.field public static final synthetic l:Ly24;

.field public static final synthetic m:Ly24;


# instance fields
.field public final synthetic f:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ly24;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ly24;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ly24;->g:Ly24;

    .line 8
    .line 9
    new-instance v0, Ly24;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Ly24;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Ly24;->h:Ly24;

    .line 16
    .line 17
    new-instance v0, Ly24;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, Ly24;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Ly24;->i:Ly24;

    .line 24
    .line 25
    new-instance v0, Ly24;

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    invoke-direct {v0, v1}, Ly24;-><init>(I)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Ly24;->j:Ly24;

    .line 32
    .line 33
    new-instance v0, Ly24;

    .line 34
    .line 35
    const/4 v1, 0x4

    .line 36
    invoke-direct {v0, v1}, Ly24;-><init>(I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Ly24;->k:Ly24;

    .line 40
    .line 41
    new-instance v0, Ly24;

    .line 42
    .line 43
    const/4 v1, 0x5

    .line 44
    invoke-direct {v0, v1}, Ly24;-><init>(I)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Ly24;->l:Ly24;

    .line 48
    .line 49
    new-instance v0, Ly24;

    .line 50
    .line 51
    const/16 v1, 0x10

    .line 52
    .line 53
    invoke-direct {v0, v1}, Ly24;-><init>(I)V

    .line 54
    .line 55
    .line 56
    sput-object v0, Ly24;->m:Ly24;

    .line 57
    .line 58
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ly24;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    const/16 p1, 0xf

    iput p1, p0, Ly24;->f:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 3
    iput p1, p0, Ly24;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lfk1;I)V
    .locals 0

    const/16 p1, 0x11

    iput p1, p0, Ly24;->f:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Z)V
    .locals 0

    const/16 p1, 0xd

    iput p1, p0, Ly24;->f:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(JLjava/lang/Object;)Lx54;
    .locals 2

    .line 1
    invoke-static {p0, p1, p2}, Lg74;->k(JLjava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lx54;

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lt44;

    .line 9
    .line 10
    iget-boolean v1, v1, Lt44;->f:Z

    .line 11
    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    const/16 v1, 0xa

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    add-int/2addr v1, v1

    .line 24
    :goto_0
    invoke-interface {v0, v1}, Lx54;->z(I)Lx54;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {p2, p0, p1, v0}, Lg74;->l(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-object v0
.end method

.method public static final b(Landroid/content/Context;Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;ZLmv2;)V
    .locals 6

    .line 1
    iget v0, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->p:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    if-ne v0, v1, :cond_4

    .line 5
    .line 6
    iget-object v0, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->h:Lye4;

    .line 7
    .line 8
    if-nez v0, :cond_4

    .line 9
    .line 10
    iget-object p2, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->g:Lfd1;

    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    invoke-interface {p2}, Lfd1;->C()V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object p2, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->z:Lxp2;

    .line 18
    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    invoke-interface {p2}, Lxp2;->s0()V

    .line 22
    .line 23
    .line 24
    :cond_1
    iget-object p2, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->i:Lag2;

    .line 25
    .line 26
    invoke-interface {p2}, Lag2;->g()Landroid/app/Activity;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    iget-object v1, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->f:Lfc2;

    .line 31
    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    iget-boolean v0, v1, Lfc2;->o:Z

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    if-eqz p2, :cond_2

    .line 39
    .line 40
    move-object v0, p2

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    move-object v0, p0

    .line 43
    :goto_0
    sget-object p0, Lhg4;->C:Lhg4;

    .line 44
    .line 45
    iget-object p0, p0, Lhg4;->a:Lus0;

    .line 46
    .line 47
    iget-object v2, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->n:Lkf1;

    .line 48
    .line 49
    if-eqz v1, :cond_3

    .line 50
    .line 51
    iget-object p0, v1, Lfc2;->n:Lid1;

    .line 52
    .line 53
    :goto_1
    move-object v3, p0

    .line 54
    goto :goto_2

    .line 55
    :cond_3
    const/4 p0, 0x0

    .line 56
    goto :goto_1

    .line 57
    :goto_2
    iget-object v5, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->v:Ljava/lang/String;

    .line 58
    .line 59
    move-object v4, p3

    .line 60
    invoke-static/range {v0 .. v5}, Lus0;->t(Landroid/content/Context;Lfc2;Lkf1;Lid1;Lmv2;Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_4
    move-object v4, p3

    .line 65
    new-instance p3, Landroid/content/Intent;

    .line 66
    .line 67
    invoke-direct {p3}, Landroid/content/Intent;-><init>()V

    .line 68
    .line 69
    .line 70
    const-string v0, "com.google.android.gms.ads.AdActivity"

    .line 71
    .line 72
    invoke-virtual {p3, p0, v0}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 73
    .line 74
    .line 75
    iget-object v0, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->r:Le51;

    .line 76
    .line 77
    iget-boolean v0, v0, Le51;->i:Z

    .line 78
    .line 79
    const-string v1, "com.google.android.gms.ads.internal.overlay.useClientJar"

    .line 80
    .line 81
    invoke-virtual {p3, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 82
    .line 83
    .line 84
    const-string v0, "shouldCallOnOverlayOpened"

    .line 85
    .line 86
    invoke-virtual {p3, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 87
    .line 88
    .line 89
    new-instance p2, Landroid/os/Bundle;

    .line 90
    .line 91
    const/4 v0, 0x1

    .line 92
    invoke-direct {p2, v0}, Landroid/os/Bundle;-><init>(I)V

    .line 93
    .line 94
    .line 95
    const-string v0, "com.google.android.gms.ads.inernal.overlay.AdOverlayInfo"

    .line 96
    .line 97
    invoke-virtual {p2, v0, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p3, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 101
    .line 102
    .line 103
    instance-of p2, p0, Landroid/app/Activity;

    .line 104
    .line 105
    if-nez p2, :cond_5

    .line 106
    .line 107
    const/high16 p2, 0x10000000

    .line 108
    .line 109
    invoke-virtual {p3, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 110
    .line 111
    .line 112
    :cond_5
    sget-object p2, Lmz1;->Td:Liz1;

    .line 113
    .line 114
    sget-object v0, Ltw1;->e:Ltw1;

    .line 115
    .line 116
    iget-object v0, v0, Ltw1;->c:Lkz1;

    .line 117
    .line 118
    invoke-virtual {v0, p2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    check-cast p2, Ljava/lang/Boolean;

    .line 123
    .line 124
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 125
    .line 126
    .line 127
    move-result p2

    .line 128
    if-eqz p2, :cond_6

    .line 129
    .line 130
    sget-object p2, Lhg4;->C:Lhg4;

    .line 131
    .line 132
    iget-object p2, p2, Lhg4;->c:Llf4;

    .line 133
    .line 134
    iget-object p1, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->v:Ljava/lang/String;

    .line 135
    .line 136
    invoke-static {p0, p3, v4, p1}, Llf4;->v(Landroid/content/Context;Landroid/content/Intent;Lmv2;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_6
    sget-object p1, Lhg4;->C:Lhg4;

    .line 141
    .line 142
    iget-object p1, p1, Lhg4;->c:Llf4;

    .line 143
    .line 144
    invoke-static {p0, p3}, Llf4;->s(Landroid/content/Context;Landroid/content/Intent;)V

    .line 145
    .line 146
    .line 147
    return-void
.end method

.method public static f([BII)Ljava/lang/String;
    .locals 7

    .line 1
    array-length v0, p0

    .line 2
    sub-int v1, v0, p1

    .line 3
    .line 4
    or-int v2, p1, p2

    .line 5
    .line 6
    sub-int/2addr v1, p2

    .line 7
    or-int/2addr v1, v2

    .line 8
    if-ltz v1, :cond_9

    .line 9
    .line 10
    add-int v0, p1, p2

    .line 11
    .line 12
    new-array v5, p2, [C

    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    move v1, p2

    .line 16
    :goto_0
    if-ge p1, v0, :cond_0

    .line 17
    .line 18
    aget-byte v2, p0, p1

    .line 19
    .line 20
    if-ltz v2, :cond_0

    .line 21
    .line 22
    add-int/lit8 p1, p1, 0x1

    .line 23
    .line 24
    add-int/lit8 v3, v1, 0x1

    .line 25
    .line 26
    int-to-char v2, v2

    .line 27
    aput-char v2, v5, v1

    .line 28
    .line 29
    move v1, v3

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v6, v1

    .line 32
    :cond_1
    :goto_1
    if-ge p1, v0, :cond_8

    .line 33
    .line 34
    add-int/lit8 v1, p1, 0x1

    .line 35
    .line 36
    move v2, v1

    .line 37
    aget-byte v1, p0, p1

    .line 38
    .line 39
    if-ltz v1, :cond_2

    .line 40
    .line 41
    add-int/lit8 p1, v6, 0x1

    .line 42
    .line 43
    int-to-char v1, v1

    .line 44
    aput-char v1, v5, v6

    .line 45
    .line 46
    move v6, p1

    .line 47
    move p1, v2

    .line 48
    :goto_2
    if-ge p1, v0, :cond_1

    .line 49
    .line 50
    aget-byte v1, p0, p1

    .line 51
    .line 52
    if-ltz v1, :cond_1

    .line 53
    .line 54
    add-int/lit8 p1, p1, 0x1

    .line 55
    .line 56
    add-int/lit8 v2, v6, 0x1

    .line 57
    .line 58
    int-to-char v1, v1

    .line 59
    aput-char v1, v5, v6

    .line 60
    .line 61
    move v6, v2

    .line 62
    goto :goto_2

    .line 63
    :cond_2
    const/16 v3, -0x20

    .line 64
    .line 65
    const-string v4, "Protocol message had invalid UTF-8."

    .line 66
    .line 67
    if-ge v1, v3, :cond_4

    .line 68
    .line 69
    if-ge v2, v0, :cond_3

    .line 70
    .line 71
    add-int/lit8 v3, v6, 0x1

    .line 72
    .line 73
    add-int/lit8 p1, p1, 0x2

    .line 74
    .line 75
    aget-byte v2, p0, v2

    .line 76
    .line 77
    invoke-static {v1, v2, v5, v6}, Li30;->m0(BB[CI)V

    .line 78
    .line 79
    .line 80
    :goto_3
    move v6, v3

    .line 81
    goto :goto_1

    .line 82
    :cond_3
    new-instance p0, La64;

    .line 83
    .line 84
    invoke-direct {p0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw p0

    .line 88
    :cond_4
    const/16 v3, -0x10

    .line 89
    .line 90
    if-ge v1, v3, :cond_6

    .line 91
    .line 92
    add-int/lit8 v3, v0, -0x1

    .line 93
    .line 94
    if-ge v2, v3, :cond_5

    .line 95
    .line 96
    add-int/lit8 v3, v6, 0x1

    .line 97
    .line 98
    add-int/lit8 v4, p1, 0x2

    .line 99
    .line 100
    aget-byte v2, p0, v2

    .line 101
    .line 102
    add-int/lit8 p1, p1, 0x3

    .line 103
    .line 104
    aget-byte v4, p0, v4

    .line 105
    .line 106
    invoke-static {v1, v2, v4, v5, v6}, Li30;->o0(BBB[CI)V

    .line 107
    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_5
    new-instance p0, La64;

    .line 111
    .line 112
    invoke-direct {p0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw p0

    .line 116
    :cond_6
    add-int/lit8 v3, v0, -0x2

    .line 117
    .line 118
    if-ge v2, v3, :cond_7

    .line 119
    .line 120
    add-int/lit8 v3, p1, 0x2

    .line 121
    .line 122
    aget-byte v2, p0, v2

    .line 123
    .line 124
    add-int/lit8 v4, p1, 0x3

    .line 125
    .line 126
    aget-byte v3, p0, v3

    .line 127
    .line 128
    add-int/lit8 p1, p1, 0x4

    .line 129
    .line 130
    aget-byte v4, p0, v4

    .line 131
    .line 132
    invoke-static/range {v1 .. v6}, Li30;->q0(BBBB[CI)V

    .line 133
    .line 134
    .line 135
    add-int/lit8 v6, v6, 0x2

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_7
    new-instance p0, La64;

    .line 139
    .line 140
    invoke-direct {p0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    throw p0

    .line 144
    :cond_8
    new-instance p0, Ljava/lang/String;

    .line 145
    .line 146
    invoke-direct {p0, v5, p2, v6}, Ljava/lang/String;-><init>([CII)V

    .line 147
    .line 148
    .line 149
    return-object p0

    .line 150
    :cond_9
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 151
    .line 152
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 161
    .line 162
    .line 163
    move-result-object p2

    .line 164
    filled-new-array {v0, p1, p2}, [Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    const-string p2, "buffer length=%d, index=%d, size=%d"

    .line 169
    .line 170
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-direct {p0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw p0
.end method

.method public static final h(Ljava/lang/Object;Ljava/lang/Object;)Lg64;
    .locals 1

    .line 1
    check-cast p0, Lg64;

    .line 2
    .line 3
    check-cast p1, Lg64;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-boolean v0, p0, Lg64;->f:Z

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lg64;->a()Lg64;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :cond_0
    invoke-virtual {p0}, Lg64;->c()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Lg64;->putAll(Ljava/util/Map;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-object p0
.end method

.method public static final i(Ljava/nio/ByteBuffer;II)Ljava/lang/String;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/nio/Buffer;->limit()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sub-int/2addr v0, p1

    .line 6
    or-int v1, p1, p2

    .line 7
    .line 8
    sub-int/2addr v0, p2

    .line 9
    or-int/2addr v0, v1

    .line 10
    if-ltz v0, :cond_9

    .line 11
    .line 12
    add-int v0, p1, p2

    .line 13
    .line 14
    new-array v5, p2, [C

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    move v1, p2

    .line 18
    :goto_0
    if-ge p1, v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-ltz v2, :cond_0

    .line 25
    .line 26
    add-int/lit8 p1, p1, 0x1

    .line 27
    .line 28
    add-int/lit8 v3, v1, 0x1

    .line 29
    .line 30
    int-to-char v2, v2

    .line 31
    aput-char v2, v5, v1

    .line 32
    .line 33
    move v1, v3

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v6, v1

    .line 36
    :cond_1
    :goto_1
    if-ge p1, v0, :cond_8

    .line 37
    .line 38
    add-int/lit8 v1, p1, 0x1

    .line 39
    .line 40
    move v2, v1

    .line 41
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-ltz v1, :cond_2

    .line 46
    .line 47
    add-int/lit8 p1, v6, 0x1

    .line 48
    .line 49
    int-to-char v1, v1

    .line 50
    aput-char v1, v5, v6

    .line 51
    .line 52
    move v6, p1

    .line 53
    move p1, v2

    .line 54
    :goto_2
    if-ge p1, v0, :cond_1

    .line 55
    .line 56
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-ltz v1, :cond_1

    .line 61
    .line 62
    add-int/lit8 p1, p1, 0x1

    .line 63
    .line 64
    add-int/lit8 v2, v6, 0x1

    .line 65
    .line 66
    int-to-char v1, v1

    .line 67
    aput-char v1, v5, v6

    .line 68
    .line 69
    move v6, v2

    .line 70
    goto :goto_2

    .line 71
    :cond_2
    const/16 v3, -0x20

    .line 72
    .line 73
    const-string v4, "Protocol message had invalid UTF-8."

    .line 74
    .line 75
    if-ge v1, v3, :cond_4

    .line 76
    .line 77
    if-ge v2, v0, :cond_3

    .line 78
    .line 79
    add-int/lit8 v3, v6, 0x1

    .line 80
    .line 81
    add-int/lit8 p1, p1, 0x2

    .line 82
    .line 83
    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->get(I)B

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    invoke-static {v1, v2, v5, v6}, Li30;->m0(BB[CI)V

    .line 88
    .line 89
    .line 90
    :goto_3
    move v6, v3

    .line 91
    goto :goto_1

    .line 92
    :cond_3
    new-instance p0, La64;

    .line 93
    .line 94
    invoke-direct {p0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw p0

    .line 98
    :cond_4
    const/16 v3, -0x10

    .line 99
    .line 100
    if-ge v1, v3, :cond_6

    .line 101
    .line 102
    add-int/lit8 v3, v0, -0x1

    .line 103
    .line 104
    if-ge v2, v3, :cond_5

    .line 105
    .line 106
    add-int/lit8 v3, v6, 0x1

    .line 107
    .line 108
    add-int/lit8 v4, p1, 0x2

    .line 109
    .line 110
    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->get(I)B

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    add-int/lit8 p1, p1, 0x3

    .line 115
    .line 116
    invoke-virtual {p0, v4}, Ljava/nio/ByteBuffer;->get(I)B

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    invoke-static {v1, v2, v4, v5, v6}, Li30;->o0(BBB[CI)V

    .line 121
    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_5
    new-instance p0, La64;

    .line 125
    .line 126
    invoke-direct {p0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw p0

    .line 130
    :cond_6
    add-int/lit8 v3, v0, -0x2

    .line 131
    .line 132
    if-ge v2, v3, :cond_7

    .line 133
    .line 134
    add-int/lit8 v3, p1, 0x2

    .line 135
    .line 136
    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->get(I)B

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    add-int/lit8 v4, p1, 0x3

    .line 141
    .line 142
    invoke-virtual {p0, v3}, Ljava/nio/ByteBuffer;->get(I)B

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    add-int/lit8 p1, p1, 0x4

    .line 147
    .line 148
    invoke-virtual {p0, v4}, Ljava/nio/ByteBuffer;->get(I)B

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    invoke-static/range {v1 .. v6}, Li30;->q0(BBBB[CI)V

    .line 153
    .line 154
    .line 155
    add-int/lit8 v6, v6, 0x2

    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_7
    new-instance p0, La64;

    .line 159
    .line 160
    invoke-direct {p0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    throw p0

    .line 164
    :cond_8
    new-instance p0, Ljava/lang/String;

    .line 165
    .line 166
    invoke-direct {p0, v5, p2, v6}, Ljava/lang/String;-><init>([CII)V

    .line 167
    .line 168
    .line 169
    return-object p0

    .line 170
    :cond_9
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 171
    .line 172
    invoke-virtual {p0}, Ljava/nio/Buffer;->limit()I

    .line 173
    .line 174
    .line 175
    move-result p0

    .line 176
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    filled-new-array {p0, p1, p2}, [Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    const-string p1, "buffer limit=%d, index=%d, limit=%d"

    .line 193
    .line 194
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    invoke-direct {v0, p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    throw v0
.end method


# virtual methods
.method public accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, Lkn2;

    .line 2
    .line 3
    check-cast p2, Lk01;

    .line 4
    .line 5
    invoke-virtual {p1}, Lw9;->t()Landroid/os/IInterface;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lgh3;

    .line 10
    .line 11
    new-instance v0, Lhf0;

    .line 12
    .line 13
    invoke-direct {v0, p2}, Lhf0;-><init>(Lk01;)V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    const-string v1, "com.google.android.gms.appset.internal.IAppSetService"

    .line 21
    .line 22
    invoke-virtual {p2, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    sget v1, Lbc2;->a:I

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    invoke-virtual {p2, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 29
    .line 30
    .line 31
    const/16 v2, 0x4f45

    .line 32
    .line 33
    invoke-static {p2, v2}, Luk2;->I(Landroid/os/Parcel;I)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-static {p2, v2}, Luk2;->O(Landroid/os/Parcel;I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 41
    .line 42
    .line 43
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :try_start_0
    iget-object p1, p1, Lgh3;->f:Landroid/os/IBinder;

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    invoke-interface {p1, v1, p2, v0, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2}, Landroid/os/Parcel;->recycle()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :catchall_0
    move-exception p1

    .line 64
    invoke-virtual {p2}, Landroid/os/Parcel;->recycle()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 68
    .line 69
    .line 70
    throw p1
.end method

.method public c(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget v0, p0, Ly24;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    check-cast p1, Lbd4;

    .line 7
    .line 8
    return-void

    .line 9
    :pswitch_1
    check-cast p1, Lbd4;

    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_2
    check-cast p1, Lbd4;

    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_3
    check-cast p1, Lbd4;

    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_4
    check-cast p1, Lbd4;

    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_5
    check-cast p1, Lbd4;

    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_6
    check-cast p1, Lbd4;

    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_7
    check-cast p1, Lbd4;

    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_8
    check-cast p1, Lbd4;

    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_9
    check-cast p1, Lbd4;

    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_a
    check-cast p1, Lzt1;

    .line 37
    .line 38
    sget v0, Lya4;->g0:I

    .line 39
    .line 40
    invoke-interface {p1}, Lzt1;->h()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_b
    check-cast p1, Lzt1;

    .line 45
    .line 46
    sget v0, Lya4;->g0:I

    .line 47
    .line 48
    new-instance v0, Lrg;

    .line 49
    .line 50
    const-string v1, "Player release timed out."

    .line 51
    .line 52
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    new-instance v1, Lb84;

    .line 56
    .line 57
    const/4 v2, 0x2

    .line 58
    const/16 v3, 0x3eb

    .line 59
    .line 60
    invoke-direct {v1, v2, v0, v3}, Lb84;-><init>(ILjava/lang/Exception;I)V

    .line 61
    .line 62
    .line 63
    invoke-interface {p1, v1}, Lzt1;->G(Lb84;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_c
    check-cast p1, Lzt1;

    .line 68
    .line 69
    sget v0, Lya4;->g0:I

    .line 70
    .line 71
    invoke-interface {p1}, Lzt1;->v()V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :pswitch_d
    check-cast p1, Lzt1;

    .line 76
    .line 77
    sget v0, Lya4;->g0:I

    .line 78
    .line 79
    invoke-interface {p1}, Lzt1;->b()V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :pswitch_e
    check-cast p1, Lzt1;

    .line 84
    .line 85
    invoke-interface {p1}, Lzt1;->u()V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :pswitch_data_0
    .packed-switch 0xd
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public bridge synthetic d(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Ly24;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {p1, p2}, Ljava/security/Signature;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/Signature;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    :goto_0
    return-object p1

    .line 18
    :pswitch_0
    if-nez p2, :cond_1

    .line 19
    .line 20
    invoke-static {p1}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    invoke-static {p1, p2}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/Mac;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    :goto_1
    return-object p1

    .line 30
    :pswitch_1
    if-nez p2, :cond_2

    .line 31
    .line 32
    invoke-static {p1}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    goto :goto_2

    .line 37
    :cond_2
    invoke-static {p1, p2}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/KeyFactory;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    :goto_2
    return-object p1

    .line 42
    :pswitch_2
    if-nez p2, :cond_3

    .line 43
    .line 44
    invoke-static {p1}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    goto :goto_3

    .line 49
    :cond_3
    invoke-static {p1, p2}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/Cipher;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    :goto_3
    return-object p1

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public e(Lgw3;)Lmr3;
    .locals 5

    .line 1
    iget v0, p0, Ly24;->f:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    sget-object v0, Lc34;->a:Lvv3;

    .line 8
    .line 9
    iget-object p1, p1, Lgw3;->h:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Lqz3;

    .line 12
    .line 13
    invoke-virtual {p1}, Lqz3;->A()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v2, "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey"

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    :try_start_0
    invoke-virtual {p1}, Lqz3;->B()La54;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sget-object v2, Lh54;->a:Lh54;

    .line 30
    .line 31
    sget v2, Lu44;->a:I

    .line 32
    .line 33
    sget-object v2, Lh54;->b:Lh54;

    .line 34
    .line 35
    invoke-static {v0, v2}, Lt04;->D(La54;Lh54;)Lt04;

    .line 36
    .line 37
    .line 38
    move-result-object v0
    :try_end_0
    .catch La64; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    sget-object v2, Lj24;->g:Ljava/math/BigInteger;

    .line 40
    .line 41
    new-instance v2, Lg24;

    .line 42
    .line 43
    invoke-direct {v2}, Lg24;-><init>()V

    .line 44
    .line 45
    .line 46
    sget-object v3, Lc34;->h:Ltb1;

    .line 47
    .line 48
    invoke-virtual {v0}, Lt04;->A()Lv04;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {v4}, Lv04;->A()Lgz3;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-virtual {v3, v4}, Ltb1;->c(Ljava/lang/Enum;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    check-cast v4, Lh24;

    .line 61
    .line 62
    iput-object v4, v2, Lg24;->c:Lh24;

    .line 63
    .line 64
    invoke-virtual {v0}, Lt04;->A()Lv04;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-virtual {v4}, Lv04;->B()Lgz3;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-virtual {v3, v4}, Ltb1;->c(Ljava/lang/Enum;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    check-cast v3, Lh24;

    .line 77
    .line 78
    iput-object v3, v2, Lg24;->d:Lh24;

    .line 79
    .line 80
    invoke-virtual {v0}, Lt04;->C()La54;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-virtual {v3}, La54;->p()[B

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    new-instance v4, Ljava/math/BigInteger;

    .line 89
    .line 90
    invoke-direct {v4, v1, v3}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 91
    .line 92
    .line 93
    iput-object v4, v2, Lg24;->b:Ljava/math/BigInteger;

    .line 94
    .line 95
    invoke-virtual {v0}, Lt04;->B()I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    invoke-virtual {v2, v1}, Lg24;->a(I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, Lt04;->A()Lv04;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {v0}, Lv04;->C()I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    invoke-virtual {v2, v0}, Lg24;->b(I)V

    .line 111
    .line 112
    .line 113
    sget-object v0, Lc34;->g:Ltb1;

    .line 114
    .line 115
    invoke-virtual {p1}, Lqz3;->C()Li04;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-virtual {v0, p1}, Ltb1;->c(Ljava/lang/Enum;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    check-cast p1, Li24;

    .line 124
    .line 125
    iput-object p1, v2, Lg24;->f:Li24;

    .line 126
    .line 127
    invoke-virtual {v2}, Lg24;->c()Lj24;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    return-object p1

    .line 132
    :catch_0
    move-exception p1

    .line 133
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 134
    .line 135
    const-string v1, "Parsing RsaSsaPssParameters failed: "

    .line 136
    .line 137
    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 138
    .line 139
    .line 140
    throw v0

    .line 141
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 142
    .line 143
    invoke-virtual {p1}, Lqz3;->A()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    const-string v1, "Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: "

    .line 152
    .line 153
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    throw v0

    .line 161
    :pswitch_0
    sget-object v0, Lz24;->a:Lvv3;

    .line 162
    .line 163
    iget-object p1, p1, Lgw3;->h:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast p1, Lqz3;

    .line 166
    .line 167
    invoke-virtual {p1}, Lqz3;->A()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    const-string v2, "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey"

    .line 172
    .line 173
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    if-eqz v0, :cond_1

    .line 178
    .line 179
    :try_start_1
    invoke-virtual {p1}, Lqz3;->B()La54;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    sget-object v2, Lh54;->a:Lh54;

    .line 184
    .line 185
    sget v2, Lu44;->a:I

    .line 186
    .line 187
    sget-object v2, Lh54;->b:Lh54;

    .line 188
    .line 189
    invoke-static {v0, v2}, Ll04;->D(La54;Lh54;)Ll04;

    .line 190
    .line 191
    .line 192
    move-result-object v0
    :try_end_1
    .catch La64; {:try_start_1 .. :try_end_1} :catch_1

    .line 193
    sget-object v2, Lc24;->e:Ljava/math/BigInteger;

    .line 194
    .line 195
    new-instance v2, Lz14;

    .line 196
    .line 197
    invoke-direct {v2}, Lz14;-><init>()V

    .line 198
    .line 199
    .line 200
    sget-object v3, Lz24;->h:Ltb1;

    .line 201
    .line 202
    invoke-virtual {v0}, Ll04;->A()Ln04;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    invoke-virtual {v4}, Ln04;->A()Lgz3;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    invoke-virtual {v3, v4}, Ltb1;->c(Ljava/lang/Enum;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    check-cast v3, La24;

    .line 215
    .line 216
    iput-object v3, v2, Lz14;->c:La24;

    .line 217
    .line 218
    invoke-virtual {v0}, Ll04;->C()La54;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    invoke-virtual {v3}, La54;->p()[B

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    new-instance v4, Ljava/math/BigInteger;

    .line 227
    .line 228
    invoke-direct {v4, v1, v3}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 229
    .line 230
    .line 231
    iput-object v4, v2, Lz14;->b:Ljava/math/BigInteger;

    .line 232
    .line 233
    invoke-virtual {v0}, Ll04;->B()I

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    invoke-virtual {v2, v0}, Lz14;->a(I)V

    .line 238
    .line 239
    .line 240
    sget-object v0, Lz24;->g:Ltb1;

    .line 241
    .line 242
    invoke-virtual {p1}, Lqz3;->C()Li04;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    invoke-virtual {v0, p1}, Ltb1;->c(Ljava/lang/Enum;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    check-cast p1, Lb24;

    .line 251
    .line 252
    iput-object p1, v2, Lz14;->d:Lb24;

    .line 253
    .line 254
    invoke-virtual {v2}, Lz14;->b()Lc24;

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    return-object p1

    .line 259
    :catch_1
    move-exception p1

    .line 260
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 261
    .line 262
    const-string v1, "Parsing RsaSsaPkcs1Parameters failed: "

    .line 263
    .line 264
    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 265
    .line 266
    .line 267
    throw v0

    .line 268
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 269
    .line 270
    invoke-virtual {p1}, Lqz3;->A()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object p1

    .line 278
    const-string v1, "Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: "

    .line 279
    .line 280
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object p1

    .line 284
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    throw v0

    .line 288
    nop

    .line 289
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public g(Lfw3;)Lgi2;
    .locals 10

    .line 1
    iget v0, p0, Ly24;->f:I

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    const/4 v2, 0x5

    .line 5
    const/4 v3, 0x0

    .line 6
    const-string v4, "Only version 0 keys are accepted"

    .line 7
    .line 8
    const/4 v5, 0x1

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    :pswitch_0
    sget-object v0, Lc34;->a:Lvv3;

    .line 13
    .line 14
    iget-object v0, p1, Lfw3;->g:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ljava/lang/String;

    .line 17
    .line 18
    const-string v1, "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    :try_start_0
    iget-object v0, p1, Lfw3;->i:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, La54;

    .line 29
    .line 30
    sget-object v1, Lh54;->a:Lh54;

    .line 31
    .line 32
    sget v1, Lu44;->a:I

    .line 33
    .line 34
    sget-object v1, Lh54;->b:Lh54;

    .line 35
    .line 36
    invoke-static {v0, v1}, Lx04;->I(La54;Lh54;)Lx04;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Lx04;->A()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_1

    .line 45
    .line 46
    invoke-virtual {v0}, Lx04;->B()Lz04;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v1}, Lz04;->A()I

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    if-nez v6, :cond_0

    .line 55
    .line 56
    invoke-virtual {v1}, Lz04;->C()La54;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v4}, La54;->p()[B

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    new-instance v6, Ljava/math/BigInteger;

    .line 65
    .line 66
    invoke-direct {v6, v5, v4}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v6}, Ljava/math/BigInteger;->bitLength()I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    invoke-virtual {v1}, Lz04;->D()La54;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    invoke-virtual {v7}, La54;->p()[B

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    new-instance v8, Ljava/math/BigInteger;

    .line 82
    .line 83
    invoke-direct {v8, v5, v7}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 84
    .line 85
    .line 86
    sget-object v5, Lj24;->g:Ljava/math/BigInteger;

    .line 87
    .line 88
    new-instance v5, Lg24;

    .line 89
    .line 90
    invoke-direct {v5}, Lg24;-><init>()V

    .line 91
    .line 92
    .line 93
    sget-object v7, Lc34;->h:Ltb1;

    .line 94
    .line 95
    invoke-virtual {v1}, Lz04;->B()Lv04;

    .line 96
    .line 97
    .line 98
    move-result-object v9

    .line 99
    invoke-virtual {v9}, Lv04;->A()Lgz3;

    .line 100
    .line 101
    .line 102
    move-result-object v9

    .line 103
    invoke-virtual {v7, v9}, Ltb1;->c(Ljava/lang/Enum;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v9

    .line 107
    check-cast v9, Lh24;

    .line 108
    .line 109
    iput-object v9, v5, Lg24;->c:Lh24;

    .line 110
    .line 111
    invoke-virtual {v1}, Lz04;->B()Lv04;

    .line 112
    .line 113
    .line 114
    move-result-object v9

    .line 115
    invoke-virtual {v9}, Lv04;->B()Lgz3;

    .line 116
    .line 117
    .line 118
    move-result-object v9

    .line 119
    invoke-virtual {v7, v9}, Ltb1;->c(Ljava/lang/Enum;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    check-cast v7, Lh24;

    .line 124
    .line 125
    iput-object v7, v5, Lg24;->d:Lh24;

    .line 126
    .line 127
    iput-object v8, v5, Lg24;->b:Ljava/math/BigInteger;

    .line 128
    .line 129
    invoke-virtual {v5, v4}, Lg24;->a(I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1}, Lz04;->B()Lv04;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-virtual {v1}, Lv04;->C()I

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    invoke-virtual {v5, v1}, Lg24;->b(I)V

    .line 141
    .line 142
    .line 143
    sget-object v1, Lc34;->g:Ltb1;

    .line 144
    .line 145
    iget-object v4, p1, Lfw3;->j:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v4, Li04;

    .line 148
    .line 149
    invoke-virtual {v1, v4}, Ltb1;->c(Ljava/lang/Enum;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    check-cast v1, Li24;

    .line 154
    .line 155
    iput-object v1, v5, Lg24;->f:Li24;

    .line 156
    .line 157
    invoke-virtual {v5}, Lg24;->c()Lj24;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    new-instance v4, Ljr3;

    .line 162
    .line 163
    invoke-direct {v4, v2, v3}, Ljr3;-><init>(IZ)V

    .line 164
    .line 165
    .line 166
    iput-object v1, v4, Ljr3;->g:Ljava/lang/Object;

    .line 167
    .line 168
    iput-object v6, v4, Ljr3;->h:Ljava/lang/Object;

    .line 169
    .line 170
    iget-object p1, p1, Lfw3;->k:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast p1, Ljava/lang/Integer;

    .line 173
    .line 174
    iput-object p1, v4, Ljr3;->i:Ljava/lang/Object;

    .line 175
    .line 176
    invoke-virtual {v4}, Ljr3;->n()Ll24;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    new-instance v1, Luk1;

    .line 181
    .line 182
    invoke-direct {v1, v3}, Luk1;-><init>(Z)V

    .line 183
    .line 184
    .line 185
    iput-object p1, v1, Luk1;->f:Ljava/lang/Object;

    .line 186
    .line 187
    invoke-virtual {v0}, Lx04;->D()La54;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    invoke-static {p1}, Lc34;->c(La54;)Lx34;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-virtual {v0}, Lx04;->E()La54;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    invoke-static {v2}, Lc34;->c(La54;)Lx34;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    iput-object p1, v1, Luk1;->h:Ljava/lang/Object;

    .line 204
    .line 205
    iput-object v2, v1, Luk1;->i:Ljava/lang/Object;

    .line 206
    .line 207
    invoke-virtual {v0}, Lx04;->C()La54;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    invoke-static {p1}, Lc34;->c(La54;)Lx34;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    iput-object p1, v1, Luk1;->g:Ljava/lang/Object;

    .line 216
    .line 217
    invoke-virtual {v0}, Lx04;->F()La54;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    invoke-static {p1}, Lc34;->c(La54;)Lx34;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    invoke-virtual {v0}, Lx04;->G()La54;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    invoke-static {v2}, Lc34;->c(La54;)Lx34;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    iput-object p1, v1, Luk1;->j:Ljava/lang/Object;

    .line 234
    .line 235
    iput-object v2, v1, Luk1;->k:Ljava/lang/Object;

    .line 236
    .line 237
    invoke-virtual {v0}, Lx04;->H()La54;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    invoke-static {p1}, Lc34;->c(La54;)Lx34;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    iput-object p1, v1, Luk1;->l:Ljava/lang/Object;

    .line 246
    .line 247
    invoke-virtual {v1}, Luk1;->o()Lk24;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    return-object p1

    .line 252
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 253
    .line 254
    invoke-direct {p1, v4}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    throw p1

    .line 258
    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 259
    .line 260
    invoke-direct {p1, v4}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    throw p1
    :try_end_0
    .catch La64; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 264
    :catch_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 265
    .line 266
    const-string v0, "Parsing RsaSsaPssPrivateKey failed"

    .line 267
    .line 268
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    throw p1

    .line 272
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 273
    .line 274
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    const-string v1, "Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: "

    .line 279
    .line 280
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    throw p1

    .line 288
    :pswitch_1
    sget-object v0, Lc34;->a:Lvv3;

    .line 289
    .line 290
    iget-object v0, p1, Lfw3;->g:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast v0, Ljava/lang/String;

    .line 293
    .line 294
    const-string v1, "type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey"

    .line 295
    .line 296
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result v1

    .line 300
    if-eqz v1, :cond_4

    .line 301
    .line 302
    :try_start_1
    iget-object v0, p1, Lfw3;->i:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v0, La54;

    .line 305
    .line 306
    sget-object v1, Lh54;->a:Lh54;

    .line 307
    .line 308
    sget v1, Lu44;->a:I

    .line 309
    .line 310
    sget-object v1, Lh54;->b:Lh54;

    .line 311
    .line 312
    invoke-static {v0, v1}, Lz04;->E(La54;Lh54;)Lz04;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    invoke-virtual {v0}, Lz04;->A()I

    .line 317
    .line 318
    .line 319
    move-result v1

    .line 320
    if-nez v1, :cond_3

    .line 321
    .line 322
    invoke-virtual {v0}, Lz04;->C()La54;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    invoke-virtual {v1}, La54;->p()[B

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    new-instance v4, Ljava/math/BigInteger;

    .line 331
    .line 332
    invoke-direct {v4, v5, v1}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v4}, Ljava/math/BigInteger;->bitLength()I

    .line 336
    .line 337
    .line 338
    move-result v1

    .line 339
    sget-object v6, Lj24;->g:Ljava/math/BigInteger;

    .line 340
    .line 341
    new-instance v6, Lg24;

    .line 342
    .line 343
    invoke-direct {v6}, Lg24;-><init>()V

    .line 344
    .line 345
    .line 346
    sget-object v7, Lc34;->h:Ltb1;

    .line 347
    .line 348
    invoke-virtual {v0}, Lz04;->B()Lv04;

    .line 349
    .line 350
    .line 351
    move-result-object v8

    .line 352
    invoke-virtual {v8}, Lv04;->A()Lgz3;

    .line 353
    .line 354
    .line 355
    move-result-object v8

    .line 356
    invoke-virtual {v7, v8}, Ltb1;->c(Ljava/lang/Enum;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v8

    .line 360
    check-cast v8, Lh24;

    .line 361
    .line 362
    iput-object v8, v6, Lg24;->c:Lh24;

    .line 363
    .line 364
    invoke-virtual {v0}, Lz04;->B()Lv04;

    .line 365
    .line 366
    .line 367
    move-result-object v8

    .line 368
    invoke-virtual {v8}, Lv04;->B()Lgz3;

    .line 369
    .line 370
    .line 371
    move-result-object v8

    .line 372
    invoke-virtual {v7, v8}, Ltb1;->c(Ljava/lang/Enum;)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v7

    .line 376
    check-cast v7, Lh24;

    .line 377
    .line 378
    iput-object v7, v6, Lg24;->d:Lh24;

    .line 379
    .line 380
    invoke-virtual {v0}, Lz04;->D()La54;

    .line 381
    .line 382
    .line 383
    move-result-object v7

    .line 384
    invoke-virtual {v7}, La54;->p()[B

    .line 385
    .line 386
    .line 387
    move-result-object v7

    .line 388
    new-instance v8, Ljava/math/BigInteger;

    .line 389
    .line 390
    invoke-direct {v8, v5, v7}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 391
    .line 392
    .line 393
    iput-object v8, v6, Lg24;->b:Ljava/math/BigInteger;

    .line 394
    .line 395
    invoke-virtual {v6, v1}, Lg24;->a(I)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v0}, Lz04;->B()Lv04;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    invoke-virtual {v0}, Lv04;->C()I

    .line 403
    .line 404
    .line 405
    move-result v0

    .line 406
    invoke-virtual {v6, v0}, Lg24;->b(I)V

    .line 407
    .line 408
    .line 409
    sget-object v0, Lc34;->g:Ltb1;

    .line 410
    .line 411
    iget-object v1, p1, Lfw3;->j:Ljava/lang/Object;

    .line 412
    .line 413
    check-cast v1, Li04;

    .line 414
    .line 415
    invoke-virtual {v0, v1}, Ltb1;->c(Ljava/lang/Enum;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    check-cast v0, Li24;

    .line 420
    .line 421
    iput-object v0, v6, Lg24;->f:Li24;

    .line 422
    .line 423
    invoke-virtual {v6}, Lg24;->c()Lj24;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    new-instance v1, Ljr3;

    .line 428
    .line 429
    invoke-direct {v1, v2, v3}, Ljr3;-><init>(IZ)V

    .line 430
    .line 431
    .line 432
    iput-object v0, v1, Ljr3;->g:Ljava/lang/Object;

    .line 433
    .line 434
    iput-object v4, v1, Ljr3;->h:Ljava/lang/Object;

    .line 435
    .line 436
    iget-object p1, p1, Lfw3;->k:Ljava/lang/Object;

    .line 437
    .line 438
    check-cast p1, Ljava/lang/Integer;

    .line 439
    .line 440
    iput-object p1, v1, Ljr3;->i:Ljava/lang/Object;

    .line 441
    .line 442
    invoke-virtual {v1}, Ljr3;->n()Ll24;

    .line 443
    .line 444
    .line 445
    move-result-object p1

    .line 446
    return-object p1

    .line 447
    :cond_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 448
    .line 449
    invoke-direct {p1, v4}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 450
    .line 451
    .line 452
    throw p1
    :try_end_1
    .catch La64; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 453
    :catch_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 454
    .line 455
    const-string v0, "Parsing RsaSsaPssPublicKey failed"

    .line 456
    .line 457
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 458
    .line 459
    .line 460
    throw p1

    .line 461
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 462
    .line 463
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    const-string v1, "Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: "

    .line 468
    .line 469
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 474
    .line 475
    .line 476
    throw p1

    .line 477
    :pswitch_2
    sget-object v0, Lz24;->a:Lvv3;

    .line 478
    .line 479
    iget-object v0, p1, Lfw3;->g:Ljava/lang/Object;

    .line 480
    .line 481
    check-cast v0, Ljava/lang/String;

    .line 482
    .line 483
    const-string v2, "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey"

    .line 484
    .line 485
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 486
    .line 487
    .line 488
    move-result v2

    .line 489
    if-eqz v2, :cond_7

    .line 490
    .line 491
    :try_start_2
    iget-object v0, p1, Lfw3;->i:Ljava/lang/Object;

    .line 492
    .line 493
    check-cast v0, La54;

    .line 494
    .line 495
    sget-object v2, Lh54;->a:Lh54;

    .line 496
    .line 497
    sget v2, Lu44;->a:I

    .line 498
    .line 499
    sget-object v2, Lh54;->b:Lh54;

    .line 500
    .line 501
    invoke-static {v0, v2}, Lp04;->I(La54;Lh54;)Lp04;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    invoke-virtual {v0}, Lp04;->A()I

    .line 506
    .line 507
    .line 508
    move-result v2

    .line 509
    if-nez v2, :cond_6

    .line 510
    .line 511
    invoke-virtual {v0}, Lp04;->B()Lr04;

    .line 512
    .line 513
    .line 514
    move-result-object v2

    .line 515
    invoke-virtual {v2}, Lr04;->A()I

    .line 516
    .line 517
    .line 518
    move-result v6

    .line 519
    if-nez v6, :cond_5

    .line 520
    .line 521
    invoke-virtual {v2}, Lr04;->C()La54;

    .line 522
    .line 523
    .line 524
    move-result-object v4

    .line 525
    invoke-virtual {v4}, La54;->p()[B

    .line 526
    .line 527
    .line 528
    move-result-object v4

    .line 529
    new-instance v6, Ljava/math/BigInteger;

    .line 530
    .line 531
    invoke-direct {v6, v5, v4}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 532
    .line 533
    .line 534
    invoke-virtual {v6}, Ljava/math/BigInteger;->bitLength()I

    .line 535
    .line 536
    .line 537
    move-result v4

    .line 538
    invoke-virtual {v2}, Lr04;->D()La54;

    .line 539
    .line 540
    .line 541
    move-result-object v7

    .line 542
    invoke-virtual {v7}, La54;->p()[B

    .line 543
    .line 544
    .line 545
    move-result-object v7

    .line 546
    new-instance v8, Ljava/math/BigInteger;

    .line 547
    .line 548
    invoke-direct {v8, v5, v7}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 549
    .line 550
    .line 551
    sget-object v5, Lc24;->e:Ljava/math/BigInteger;

    .line 552
    .line 553
    new-instance v5, Lz14;

    .line 554
    .line 555
    invoke-direct {v5}, Lz14;-><init>()V

    .line 556
    .line 557
    .line 558
    sget-object v7, Lz24;->h:Ltb1;

    .line 559
    .line 560
    invoke-virtual {v2}, Lr04;->B()Ln04;

    .line 561
    .line 562
    .line 563
    move-result-object v2

    .line 564
    invoke-virtual {v2}, Ln04;->A()Lgz3;

    .line 565
    .line 566
    .line 567
    move-result-object v2

    .line 568
    invoke-virtual {v7, v2}, Ltb1;->c(Ljava/lang/Enum;)Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    move-result-object v2

    .line 572
    check-cast v2, La24;

    .line 573
    .line 574
    iput-object v2, v5, Lz14;->c:La24;

    .line 575
    .line 576
    iput-object v8, v5, Lz14;->b:Ljava/math/BigInteger;

    .line 577
    .line 578
    invoke-virtual {v5, v4}, Lz14;->a(I)V

    .line 579
    .line 580
    .line 581
    sget-object v2, Lz24;->g:Ltb1;

    .line 582
    .line 583
    iget-object v4, p1, Lfw3;->j:Ljava/lang/Object;

    .line 584
    .line 585
    check-cast v4, Li04;

    .line 586
    .line 587
    invoke-virtual {v2, v4}, Ltb1;->c(Ljava/lang/Enum;)Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object v2

    .line 591
    check-cast v2, Lb24;

    .line 592
    .line 593
    iput-object v2, v5, Lz14;->d:Lb24;

    .line 594
    .line 595
    invoke-virtual {v5}, Lz14;->b()Lc24;

    .line 596
    .line 597
    .line 598
    move-result-object v2

    .line 599
    new-instance v4, Lpb3;

    .line 600
    .line 601
    invoke-direct {v4, v1}, Lpb3;-><init>(I)V

    .line 602
    .line 603
    .line 604
    iput-object v2, v4, Lpb3;->g:Ljava/lang/Object;

    .line 605
    .line 606
    iput-object v6, v4, Lpb3;->h:Ljava/lang/Object;

    .line 607
    .line 608
    iget-object p1, p1, Lfw3;->k:Ljava/lang/Object;

    .line 609
    .line 610
    check-cast p1, Ljava/lang/Integer;

    .line 611
    .line 612
    iput-object p1, v4, Lpb3;->i:Ljava/lang/Object;

    .line 613
    .line 614
    invoke-virtual {v4}, Lpb3;->j()Le24;

    .line 615
    .line 616
    .line 617
    move-result-object p1

    .line 618
    new-instance v1, Luk1;

    .line 619
    .line 620
    invoke-direct {v1, v3}, Luk1;-><init>(Z)V

    .line 621
    .line 622
    .line 623
    iput-object p1, v1, Luk1;->f:Ljava/lang/Object;

    .line 624
    .line 625
    invoke-virtual {v0}, Lp04;->D()La54;

    .line 626
    .line 627
    .line 628
    move-result-object p1

    .line 629
    invoke-static {p1}, Lz24;->b(La54;)Lx34;

    .line 630
    .line 631
    .line 632
    move-result-object p1

    .line 633
    invoke-virtual {v0}, Lp04;->E()La54;

    .line 634
    .line 635
    .line 636
    move-result-object v2

    .line 637
    invoke-static {v2}, Lz24;->b(La54;)Lx34;

    .line 638
    .line 639
    .line 640
    move-result-object v2

    .line 641
    iput-object p1, v1, Luk1;->h:Ljava/lang/Object;

    .line 642
    .line 643
    iput-object v2, v1, Luk1;->i:Ljava/lang/Object;

    .line 644
    .line 645
    invoke-virtual {v0}, Lp04;->C()La54;

    .line 646
    .line 647
    .line 648
    move-result-object p1

    .line 649
    invoke-static {p1}, Lz24;->b(La54;)Lx34;

    .line 650
    .line 651
    .line 652
    move-result-object p1

    .line 653
    iput-object p1, v1, Luk1;->g:Ljava/lang/Object;

    .line 654
    .line 655
    invoke-virtual {v0}, Lp04;->F()La54;

    .line 656
    .line 657
    .line 658
    move-result-object p1

    .line 659
    invoke-static {p1}, Lz24;->b(La54;)Lx34;

    .line 660
    .line 661
    .line 662
    move-result-object p1

    .line 663
    invoke-virtual {v0}, Lp04;->G()La54;

    .line 664
    .line 665
    .line 666
    move-result-object v2

    .line 667
    invoke-static {v2}, Lz24;->b(La54;)Lx34;

    .line 668
    .line 669
    .line 670
    move-result-object v2

    .line 671
    iput-object p1, v1, Luk1;->j:Ljava/lang/Object;

    .line 672
    .line 673
    iput-object v2, v1, Luk1;->k:Ljava/lang/Object;

    .line 674
    .line 675
    invoke-virtual {v0}, Lp04;->H()La54;

    .line 676
    .line 677
    .line 678
    move-result-object p1

    .line 679
    invoke-static {p1}, Lz24;->b(La54;)Lx34;

    .line 680
    .line 681
    .line 682
    move-result-object p1

    .line 683
    iput-object p1, v1, Luk1;->l:Ljava/lang/Object;

    .line 684
    .line 685
    invoke-virtual {v1}, Luk1;->n()Ld24;

    .line 686
    .line 687
    .line 688
    move-result-object p1

    .line 689
    return-object p1

    .line 690
    :cond_5
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 691
    .line 692
    invoke-direct {p1, v4}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 693
    .line 694
    .line 695
    throw p1

    .line 696
    :cond_6
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 697
    .line 698
    invoke-direct {p1, v4}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 699
    .line 700
    .line 701
    throw p1
    :try_end_2
    .catch La64; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_2

    .line 702
    :catch_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 703
    .line 704
    const-string v0, "Parsing RsaSsaPkcs1PrivateKey failed"

    .line 705
    .line 706
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 707
    .line 708
    .line 709
    throw p1

    .line 710
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 711
    .line 712
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 713
    .line 714
    .line 715
    move-result-object v0

    .line 716
    const-string v1, "Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: "

    .line 717
    .line 718
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 719
    .line 720
    .line 721
    move-result-object v0

    .line 722
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 723
    .line 724
    .line 725
    throw p1

    .line 726
    :pswitch_3
    sget-object v0, Lz24;->a:Lvv3;

    .line 727
    .line 728
    iget-object v0, p1, Lfw3;->g:Ljava/lang/Object;

    .line 729
    .line 730
    check-cast v0, Ljava/lang/String;

    .line 731
    .line 732
    const-string v2, "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey"

    .line 733
    .line 734
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 735
    .line 736
    .line 737
    move-result v2

    .line 738
    if-eqz v2, :cond_9

    .line 739
    .line 740
    :try_start_3
    iget-object v0, p1, Lfw3;->i:Ljava/lang/Object;

    .line 741
    .line 742
    check-cast v0, La54;

    .line 743
    .line 744
    sget-object v2, Lh54;->a:Lh54;

    .line 745
    .line 746
    sget v2, Lu44;->a:I

    .line 747
    .line 748
    sget-object v2, Lh54;->b:Lh54;

    .line 749
    .line 750
    invoke-static {v0, v2}, Lr04;->E(La54;Lh54;)Lr04;

    .line 751
    .line 752
    .line 753
    move-result-object v0

    .line 754
    invoke-virtual {v0}, Lr04;->A()I

    .line 755
    .line 756
    .line 757
    move-result v2

    .line 758
    if-nez v2, :cond_8

    .line 759
    .line 760
    invoke-virtual {v0}, Lr04;->C()La54;

    .line 761
    .line 762
    .line 763
    move-result-object v2

    .line 764
    invoke-virtual {v2}, La54;->p()[B

    .line 765
    .line 766
    .line 767
    move-result-object v2

    .line 768
    new-instance v3, Ljava/math/BigInteger;

    .line 769
    .line 770
    invoke-direct {v3, v5, v2}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 771
    .line 772
    .line 773
    invoke-virtual {v3}, Ljava/math/BigInteger;->bitLength()I

    .line 774
    .line 775
    .line 776
    move-result v2

    .line 777
    sget-object v4, Lc24;->e:Ljava/math/BigInteger;

    .line 778
    .line 779
    new-instance v4, Lz14;

    .line 780
    .line 781
    invoke-direct {v4}, Lz14;-><init>()V

    .line 782
    .line 783
    .line 784
    sget-object v6, Lz24;->h:Ltb1;

    .line 785
    .line 786
    invoke-virtual {v0}, Lr04;->B()Ln04;

    .line 787
    .line 788
    .line 789
    move-result-object v7

    .line 790
    invoke-virtual {v7}, Ln04;->A()Lgz3;

    .line 791
    .line 792
    .line 793
    move-result-object v7

    .line 794
    invoke-virtual {v6, v7}, Ltb1;->c(Ljava/lang/Enum;)Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    move-result-object v6

    .line 798
    check-cast v6, La24;

    .line 799
    .line 800
    iput-object v6, v4, Lz14;->c:La24;

    .line 801
    .line 802
    invoke-virtual {v0}, Lr04;->D()La54;

    .line 803
    .line 804
    .line 805
    move-result-object v0

    .line 806
    invoke-virtual {v0}, La54;->p()[B

    .line 807
    .line 808
    .line 809
    move-result-object v0

    .line 810
    new-instance v6, Ljava/math/BigInteger;

    .line 811
    .line 812
    invoke-direct {v6, v5, v0}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 813
    .line 814
    .line 815
    iput-object v6, v4, Lz14;->b:Ljava/math/BigInteger;

    .line 816
    .line 817
    invoke-virtual {v4, v2}, Lz14;->a(I)V

    .line 818
    .line 819
    .line 820
    sget-object v0, Lz24;->g:Ltb1;

    .line 821
    .line 822
    iget-object v2, p1, Lfw3;->j:Ljava/lang/Object;

    .line 823
    .line 824
    check-cast v2, Li04;

    .line 825
    .line 826
    invoke-virtual {v0, v2}, Ltb1;->c(Ljava/lang/Enum;)Ljava/lang/Object;

    .line 827
    .line 828
    .line 829
    move-result-object v0

    .line 830
    check-cast v0, Lb24;

    .line 831
    .line 832
    iput-object v0, v4, Lz14;->d:Lb24;

    .line 833
    .line 834
    invoke-virtual {v4}, Lz14;->b()Lc24;

    .line 835
    .line 836
    .line 837
    move-result-object v0

    .line 838
    new-instance v2, Lpb3;

    .line 839
    .line 840
    invoke-direct {v2, v1}, Lpb3;-><init>(I)V

    .line 841
    .line 842
    .line 843
    iput-object v0, v2, Lpb3;->g:Ljava/lang/Object;

    .line 844
    .line 845
    iput-object v3, v2, Lpb3;->h:Ljava/lang/Object;

    .line 846
    .line 847
    iget-object p1, p1, Lfw3;->k:Ljava/lang/Object;

    .line 848
    .line 849
    check-cast p1, Ljava/lang/Integer;

    .line 850
    .line 851
    iput-object p1, v2, Lpb3;->i:Ljava/lang/Object;

    .line 852
    .line 853
    invoke-virtual {v2}, Lpb3;->j()Le24;

    .line 854
    .line 855
    .line 856
    move-result-object p1

    .line 857
    return-object p1

    .line 858
    :cond_8
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 859
    .line 860
    invoke-direct {p1, v4}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 861
    .line 862
    .line 863
    throw p1
    :try_end_3
    .catch La64; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_3

    .line 864
    :catch_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 865
    .line 866
    const-string v0, "Parsing RsaSsaPkcs1PublicKey failed"

    .line 867
    .line 868
    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 869
    .line 870
    .line 871
    throw p1

    .line 872
    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 873
    .line 874
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 875
    .line 876
    .line 877
    move-result-object v0

    .line 878
    const-string v1, "Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: "

    .line 879
    .line 880
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 881
    .line 882
    .line 883
    move-result-object v0

    .line 884
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 885
    .line 886
    .line 887
    throw p1

    .line 888
    nop

    .line 889
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
