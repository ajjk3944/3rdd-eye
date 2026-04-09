.class public final synthetic Lve4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lve4;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lve4;->g:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lve4;->h:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, Lve4;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lve4;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lgi4;

    .line 9
    .line 10
    :try_start_0
    iget-object v1, p0, Lve4;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lw53;

    .line 13
    .line 14
    invoke-virtual {v1}, Lw53;->call()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Lgi4;->e(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    goto :goto_2

    .line 22
    :catchall_0
    move-exception v1

    .line 23
    goto :goto_0

    .line 24
    :catch_0
    move-exception v1

    .line 25
    goto :goto_1

    .line 26
    :goto_0
    new-instance v2, Ljava/lang/RuntimeException;

    .line 27
    .line 28
    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v2}, Lgi4;->d(Ljava/lang/Exception;)V

    .line 32
    .line 33
    .line 34
    goto :goto_2

    .line 35
    :goto_1
    invoke-virtual {v0, v1}, Lgi4;->d(Ljava/lang/Exception;)V

    .line 36
    .line 37
    .line 38
    :goto_2
    return-void

    .line 39
    :pswitch_0
    iget-object v0, p0, Lve4;->g:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Lbi4;

    .line 42
    .line 43
    iget-object v1, p0, Lve4;->h:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, Lcg1;

    .line 46
    .line 47
    iget-object v2, v0, Lbi4;->v:Loh1;

    .line 48
    .line 49
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    if-nez v2, :cond_0

    .line 55
    .line 56
    move-object v2, v1

    .line 57
    goto :goto_3

    .line 58
    :cond_0
    new-instance v2, Lqf1;

    .line 59
    .line 60
    const-wide/16 v5, 0x0

    .line 61
    .line 62
    invoke-direct {v2, v3, v4, v5, v6}, Lqf1;-><init>(JJ)V

    .line 63
    .line 64
    .line 65
    :goto_3
    iput-object v2, v0, Lbi4;->D:Lcg1;

    .line 66
    .line 67
    invoke-interface {v1}, Lcg1;->a()J

    .line 68
    .line 69
    .line 70
    move-result-wide v5

    .line 71
    iput-wide v5, v0, Lbi4;->E:J

    .line 72
    .line 73
    iget-boolean v2, v0, Lbi4;->L:Z

    .line 74
    .line 75
    const/4 v5, 0x0

    .line 76
    const/4 v6, 0x1

    .line 77
    if-nez v2, :cond_1

    .line 78
    .line 79
    invoke-interface {v1}, Lcg1;->a()J

    .line 80
    .line 81
    .line 82
    move-result-wide v7

    .line 83
    cmp-long v2, v7, v3

    .line 84
    .line 85
    if-nez v2, :cond_1

    .line 86
    .line 87
    move v5, v6

    .line 88
    :cond_1
    iput-boolean v5, v0, Lbi4;->F:Z

    .line 89
    .line 90
    if-eq v6, v5, :cond_2

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_2
    const/4 v6, 0x7

    .line 94
    :goto_4
    iput v6, v0, Lbi4;->G:I

    .line 95
    .line 96
    iget-boolean v2, v0, Lbi4;->z:Z

    .line 97
    .line 98
    if-eqz v2, :cond_3

    .line 99
    .line 100
    iget-object v2, v0, Lbi4;->k:Lhi4;

    .line 101
    .line 102
    iget-wide v3, v0, Lbi4;->E:J

    .line 103
    .line 104
    invoke-virtual {v2, v3, v4, v1, v5}, Lhi4;->s(JLcg1;Z)V

    .line 105
    .line 106
    .line 107
    goto :goto_5

    .line 108
    :cond_3
    invoke-virtual {v0}, Lbi4;->u()V

    .line 109
    .line 110
    .line 111
    :goto_5
    return-void

    .line 112
    :pswitch_1
    iget-object v0, p0, Lve4;->g:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v0, Lnp2;

    .line 115
    .line 116
    iget-object v1, p0, Lve4;->h:Ljava/lang/Object;

    .line 117
    .line 118
    invoke-interface {v0, v1}, Lnp2;->c(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :pswitch_2
    iget-object v0, p0, Lve4;->g:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v0, Lmc2;

    .line 125
    .line 126
    iget-object v1, p0, Lve4;->h:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v1, Landroid/media/AudioDeviceInfo;

    .line 129
    .line 130
    iget-object v2, v0, Lmc2;->j:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v2, Lbf4;

    .line 133
    .line 134
    if-nez v2, :cond_4

    .line 135
    .line 136
    goto :goto_6

    .line 137
    :cond_4
    iget-object v0, v0, Lmc2;->h:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v0, Lx03;

    .line 140
    .line 141
    invoke-virtual {v0, v1}, Lx03;->a(Landroid/media/AudioDeviceInfo;)V

    .line 142
    .line 143
    .line 144
    :goto_6
    return-void

    .line 145
    :pswitch_3
    iget-object v0, p0, Lve4;->g:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v0, Lmc2;

    .line 148
    .line 149
    iget-object v1, p0, Lve4;->h:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v1, Landroid/media/AudioRouting;

    .line 152
    .line 153
    invoke-interface {v1}, Landroid/media/AudioRouting;->getRoutedDevice()Landroid/media/AudioDeviceInfo;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    if-eqz v1, :cond_5

    .line 158
    .line 159
    iget-object v2, v0, Lmc2;->i:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v2, Landroid/os/Handler;

    .line 162
    .line 163
    new-instance v3, Lve4;

    .line 164
    .line 165
    const/4 v4, 0x1

    .line 166
    invoke-direct {v3, v0, v1, v4}, Lve4;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 170
    .line 171
    .line 172
    :cond_5
    return-void

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
