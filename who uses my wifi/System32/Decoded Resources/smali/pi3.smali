.class public final Lpi3;
.super Lti3;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic f:I

.field public final g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lfr1;Lgi3;Ljava/util/Map;Lgk3;)V
    .locals 7

    const/4 v0, 0x1

    iput v0, p0, Lpi3;->f:I

    const/16 v0, 0x76

    .line 1
    invoke-virtual {p4, v0}, Lgk3;->a(I)Lfk3;

    move-result-object v6

    const-string v2, "xLMBD0ZYDeFbDZVCzCownSP8NNmORP0EKF5jeEnOGlb2W22XICiCfQYSI28gi51p"

    const-string v3, "CL6HTaJ4+bHVCQXLR1XCftwOp39gWYfgPib+AnvHUWA="

    move-object v1, p0

    move-object v4, p1

    move-object v5, p2

    .line 2
    invoke-direct/range {v1 .. v6}, Lti3;-><init>(Ljava/lang/String;Ljava/lang/String;Lfr1;Lgi3;Lfk3;)V

    iput-object p3, v1, Lpi3;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lfr1;Lgi3;Lvf3;Lgk3;)V
    .locals 7

    const/4 v0, 0x0

    iput v0, p0, Lpi3;->f:I

    const/16 v0, 0x74

    .line 3
    invoke-virtual {p4, v0}, Lgk3;->a(I)Lfk3;

    move-result-object v6

    const-string v2, "By5K9EmVfikEcCFMOZQd1jxZLLuKkdFWcNBLbmtQ/cGwaIFZzYRhON9QKnCD3h+X"

    const-string v3, "jO4sZLvDsqH0XT1pMychedS7fP8lDaqZlRwqYI2S90Y="

    move-object v1, p0

    move-object v4, p1

    move-object v5, p2

    .line 4
    invoke-direct/range {v1 .. v6}, Lti3;-><init>(Ljava/lang/String;Ljava/lang/String;Lfr1;Lgi3;Lfk3;)V

    iput-object p3, v1, Lpi3;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/reflect/Method;Lfr1;)V
    .locals 5

    .line 1
    iget v0, p0, Lpi3;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lpi3;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/Map;

    .line 9
    .line 10
    const-string v1, "ntc"

    .line 11
    .line 12
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Landroid/net/NetworkCapabilities;

    .line 17
    .line 18
    const-string v2, "vs"

    .line 19
    .line 20
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Ljava/lang/Long;

    .line 25
    .line 26
    const-string v3, "vf"

    .line 27
    .line 28
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Ljava/lang/Long;

    .line 33
    .line 34
    filled-new-array {v1, v2, v0}, [Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v1, ""

    .line 39
    .line 40
    invoke-virtual {p1, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, [Ljava/lang/Object;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    monitor-enter p2

    .line 50
    const/4 v0, 0x0

    .line 51
    :try_start_0
    aget-object v0, p1, v0

    .line 52
    .line 53
    check-cast v0, Ljava/lang/Long;

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    invoke-virtual {p2}, Ln54;->b()V

    .line 60
    .line 61
    .line 62
    iget-object v2, p2, Ln54;->g:Lp54;

    .line 63
    .line 64
    check-cast v2, Lqr1;

    .line 65
    .line 66
    invoke-virtual {v2, v0, v1}, Lqr1;->J0(J)V

    .line 67
    .line 68
    .line 69
    const/4 v0, 0x1

    .line 70
    aget-object v0, p1, v0

    .line 71
    .line 72
    check-cast v0, Ljava/lang/Long;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 75
    .line 76
    .line 77
    move-result-wide v0

    .line 78
    const-wide/16 v2, 0x0

    .line 79
    .line 80
    cmp-long v4, v0, v2

    .line 81
    .line 82
    if-ltz v4, :cond_0

    .line 83
    .line 84
    invoke-virtual {p2}, Ln54;->b()V

    .line 85
    .line 86
    .line 87
    iget-object v4, p2, Ln54;->g:Lp54;

    .line 88
    .line 89
    check-cast v4, Lqr1;

    .line 90
    .line 91
    invoke-virtual {v4, v0, v1}, Lqr1;->h0(J)V

    .line 92
    .line 93
    .line 94
    :cond_0
    const/4 v0, 0x2

    .line 95
    aget-object p1, p1, v0

    .line 96
    .line 97
    check-cast p1, Ljava/lang/Long;

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 100
    .line 101
    .line 102
    move-result-wide v0

    .line 103
    cmp-long p1, v0, v2

    .line 104
    .line 105
    if-ltz p1, :cond_1

    .line 106
    .line 107
    invoke-virtual {p2}, Ln54;->b()V

    .line 108
    .line 109
    .line 110
    iget-object p1, p2, Ln54;->g:Lp54;

    .line 111
    .line 112
    check-cast p1, Lqr1;

    .line 113
    .line 114
    invoke-virtual {p1, v0, v1}, Lqr1;->i0(J)V

    .line 115
    .line 116
    .line 117
    :cond_1
    monitor-exit p2

    .line 118
    return-void

    .line 119
    :catchall_0
    move-exception p1

    .line 120
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    throw p1

    .line 122
    :pswitch_0
    iget-object v0, p0, Lpi3;->g:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v0, Lvf3;

    .line 125
    .line 126
    invoke-virtual {v0}, Lvf3;->E()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    const-string v1, ""

    .line 135
    .line 136
    invoke-virtual {p1, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    check-cast p1, [Ljava/lang/Object;

    .line 141
    .line 142
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    monitor-enter p2

    .line 146
    const/4 v0, 0x0

    .line 147
    :try_start_1
    aget-object v0, p1, v0

    .line 148
    .line 149
    check-cast v0, Ljava/lang/String;

    .line 150
    .line 151
    invoke-virtual {p2}, Ln54;->b()V

    .line 152
    .line 153
    .line 154
    iget-object v1, p2, Ln54;->g:Lp54;

    .line 155
    .line 156
    check-cast v1, Lqr1;

    .line 157
    .line 158
    invoke-virtual {v1, v0}, Lqr1;->F0(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    const/4 v0, 0x1

    .line 162
    aget-object p1, p1, v0

    .line 163
    .line 164
    check-cast p1, Ljava/lang/String;

    .line 165
    .line 166
    invoke-virtual {p2}, Ln54;->b()V

    .line 167
    .line 168
    .line 169
    iget-object v0, p2, Ln54;->g:Lp54;

    .line 170
    .line 171
    check-cast v0, Lqr1;

    .line 172
    .line 173
    invoke-virtual {v0, p1}, Lqr1;->l0(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    monitor-exit p2

    .line 177
    return-void

    .line 178
    :catchall_1
    move-exception p1

    .line 179
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 180
    throw p1

    .line 181
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
