.class public final Ljd1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static volatile c:F = -1.0f

.field public static volatile d:J

.field public static final e:Ljava/lang/Object;


# instance fields
.field public a:Z

.field public b:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ljd1;->e:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public static b(Landroid/content/Context;)F
    .locals 11

    .line 1
    sget-object v0, Lmz1;->Ie:Liz1;

    .line 2
    .line 3
    sget-object v1, Ltw1;->e:Ltw1;

    .line 4
    .line 5
    iget-object v2, v1, Ltw1;->c:Lkz1;

    .line 6
    .line 7
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v2, 0x3

    .line 18
    const/4 v3, 0x0

    .line 19
    if-eqz v0, :cond_4

    .line 20
    .line 21
    sget-object v0, Lhg4;->C:Lhg4;

    .line 22
    .line 23
    iget-object v4, v0, Lhg4;->k:Lym;

    .line 24
    .line 25
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 29
    .line 30
    .line 31
    move-result-wide v4

    .line 32
    sget-object v6, Lmz1;->Je:Liz1;

    .line 33
    .line 34
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 35
    .line 36
    invoke-virtual {v1, v6}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    int-to-long v6, v1

    .line 47
    sget v1, Ljd1;->c:F

    .line 48
    .line 49
    const/high16 v8, -0x40800000    # -1.0f

    .line 50
    .line 51
    cmpl-float v1, v1, v8

    .line 52
    .line 53
    if-eqz v1, :cond_0

    .line 54
    .line 55
    sget-wide v9, Ljd1;->d:J

    .line 56
    .line 57
    sub-long/2addr v4, v9

    .line 58
    cmp-long v1, v4, v6

    .line 59
    .line 60
    if-gez v1, :cond_0

    .line 61
    .line 62
    sget p0, Ljd1;->c:F

    .line 63
    .line 64
    return p0

    .line 65
    :cond_0
    sget-object v1, Ljd1;->e:Ljava/lang/Object;

    .line 66
    .line 67
    monitor-enter v1

    .line 68
    :try_start_0
    iget-object v0, v0, Lhg4;->k:Lym;

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 74
    .line 75
    .line 76
    move-result-wide v4

    .line 77
    sget v0, Ljd1;->c:F

    .line 78
    .line 79
    cmpl-float v0, v0, v8

    .line 80
    .line 81
    if-eqz v0, :cond_1

    .line 82
    .line 83
    sget-wide v8, Ljd1;->d:J

    .line 84
    .line 85
    sub-long v8, v4, v8

    .line 86
    .line 87
    cmp-long v0, v8, v6

    .line 88
    .line 89
    if-gez v0, :cond_1

    .line 90
    .line 91
    sget p0, Ljd1;->c:F

    .line 92
    .line 93
    monitor-exit v1

    .line 94
    return p0

    .line 95
    :catchall_0
    move-exception p0

    .line 96
    goto :goto_1

    .line 97
    :cond_1
    const-string v0, "audio"

    .line 98
    .line 99
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    check-cast p0, Landroid/media/AudioManager;

    .line 104
    .line 105
    if-nez p0, :cond_2

    .line 106
    .line 107
    sput v3, Ljd1;->c:F

    .line 108
    .line 109
    sput-wide v4, Ljd1;->d:J

    .line 110
    .line 111
    monitor-exit v1

    .line 112
    return v3

    .line 113
    :cond_2
    invoke-virtual {p0, v2}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    invoke-virtual {p0, v2}, Landroid/media/AudioManager;->getStreamVolume(I)I

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    if-nez v0, :cond_3

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_3
    int-to-float p0, p0

    .line 125
    int-to-float v0, v0

    .line 126
    div-float v3, p0, v0

    .line 127
    .line 128
    :goto_0
    sput v3, Ljd1;->c:F

    .line 129
    .line 130
    sput-wide v4, Ljd1;->d:J

    .line 131
    .line 132
    sget p0, Ljd1;->c:F

    .line 133
    .line 134
    monitor-exit v1

    .line 135
    return p0

    .line 136
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    throw p0

    .line 138
    :cond_4
    const-string v0, "audio"

    .line 139
    .line 140
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    check-cast p0, Landroid/media/AudioManager;

    .line 145
    .line 146
    if-nez p0, :cond_5

    .line 147
    .line 148
    return v3

    .line 149
    :cond_5
    invoke-virtual {p0, v2}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    invoke-virtual {p0, v2}, Landroid/media/AudioManager;->getStreamVolume(I)I

    .line 154
    .line 155
    .line 156
    move-result p0

    .line 157
    if-nez v0, :cond_6

    .line 158
    .line 159
    return v3

    .line 160
    :cond_6
    int-to-float p0, p0

    .line 161
    int-to-float v0, v0

    .line 162
    div-float/2addr p0, v0

    .line 163
    return p0
.end method


# virtual methods
.method public final declared-synchronized a()F
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 3
    :try_start_1
    iget v0, p0, Ljd1;->b:F
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    cmpl-float v1, v0, v1

    .line 7
    .line 8
    if-ltz v1, :cond_0

    .line 9
    .line 10
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 11
    monitor-exit p0

    .line 12
    return v0

    .line 13
    :cond_0
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 14
    monitor-exit p0

    .line 15
    const/high16 v0, 0x3f800000    # 1.0f

    .line 16
    .line 17
    return v0

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 20
    :try_start_5
    throw v0

    .line 21
    :goto_0
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 22
    throw v0

    .line 23
    :catchall_1
    move-exception v0

    .line 24
    goto :goto_0
.end method
