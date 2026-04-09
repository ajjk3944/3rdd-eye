.class public final Lb33;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lq53;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lb33;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lb33;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Ln70;
    .locals 5

    .line 1
    iget v0, p0, Lb33;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x2

    .line 6
    iget-object v4, p0, Lb33;->b:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sget-object v1, Lmz1;->D4:Liz1;

    .line 21
    .line 22
    sget-object v2, Ltw1;->e:Ltw1;

    .line 23
    .line 24
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 25
    .line 26
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Ljava/lang/Long;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 33
    .line 34
    .line 35
    move-result-wide v1

    .line 36
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 37
    .line 38
    check-cast v4, Ljava/util/concurrent/ScheduledExecutorService;

    .line 39
    .line 40
    invoke-static {v0, v1, v2, v3, v4}, Lpu1;->N(Ln70;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Ln70;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    sget-object v1, Lgj1;->q:Lgj1;

    .line 45
    .line 46
    sget-object v2, Lmd2;->a:Lld2;

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, Lpu1;->P(Ln70;Lzk3;Ljava/util/concurrent/Executor;)Lrp3;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    return-object v0

    .line 53
    :pswitch_0
    new-instance v0, La53;

    .line 54
    .line 55
    check-cast v4, Landroid/os/Bundle;

    .line 56
    .line 57
    invoke-direct {v0, v4, v2}, La53;-><init>(Ljava/lang/Cloneable;I)V

    .line 58
    .line 59
    .line 60
    invoke-static {v0}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    return-object v0

    .line 65
    :pswitch_1
    new-instance v0, Lq33;

    .line 66
    .line 67
    check-cast v4, Lz73;

    .line 68
    .line 69
    invoke-direct {v0, v1, v4}, Lq33;-><init>(ILjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-static {v0}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    return-object v0

    .line 77
    :pswitch_2
    check-cast v4, Lb73;

    .line 78
    .line 79
    const/4 v0, 0x0

    .line 80
    if-nez v4, :cond_0

    .line 81
    .line 82
    new-instance v1, Lj33;

    .line 83
    .line 84
    invoke-direct {v1, v0, v3}, Lj33;-><init>(Ljava/lang/String;I)V

    .line 85
    .line 86
    .line 87
    invoke-static {v1}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    goto :goto_1

    .line 92
    :cond_0
    iget-object v1, v4, Lb73;->a:Ljava/lang/String;

    .line 93
    .line 94
    sget v2, Lly0;->a:I

    .line 95
    .line 96
    if-eqz v1, :cond_2

    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_1

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_1
    new-instance v0, Lj33;

    .line 110
    .line 111
    invoke-direct {v0, v1, v3}, Lj33;-><init>(Ljava/lang/String;I)V

    .line 112
    .line 113
    .line 114
    invoke-static {v0}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    goto :goto_1

    .line 119
    :cond_2
    :goto_0
    new-instance v1, Lj33;

    .line 120
    .line 121
    invoke-direct {v1, v0, v3}, Lj33;-><init>(Ljava/lang/String;I)V

    .line 122
    .line 123
    .line 124
    invoke-static {v1}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    :goto_1
    return-object v0

    .line 129
    :pswitch_3
    check-cast v4, Ll83;

    .line 130
    .line 131
    new-instance v0, Lc33;

    .line 132
    .line 133
    iget-boolean v2, v4, Ll83;->q:Z

    .line 134
    .line 135
    invoke-direct {v0, v1, v2}, Lc33;-><init>(IZ)V

    .line 136
    .line 137
    .line 138
    invoke-static {v0}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    return-object v0

    .line 143
    :pswitch_4
    new-instance v0, Ljava/util/ArrayList;

    .line 144
    .line 145
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 146
    .line 147
    .line 148
    check-cast v4, Ljava/util/Set;

    .line 149
    .line 150
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    if-eqz v2, :cond_3

    .line 159
    .line 160
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    check-cast v2, Ljava/lang/String;

    .line 165
    .line 166
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_3
    new-instance v1, La53;

    .line 171
    .line 172
    invoke-direct {v1, v0, v3}, La53;-><init>(Ljava/lang/Cloneable;I)V

    .line 173
    .line 174
    .line 175
    invoke-static {v1}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    return-object v0

    .line 180
    :pswitch_5
    check-cast v4, Landroid/content/Context;

    .line 181
    .line 182
    new-instance v0, Lc33;

    .line 183
    .line 184
    const-string v3, "com.google.android.gms.permission.AD_ID"

    .line 185
    .line 186
    invoke-static {v4, v3}, Lob1;->c(Landroid/content/Context;Ljava/lang/String;)I

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    if-nez v3, :cond_4

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_4
    move v1, v2

    .line 194
    :goto_3
    invoke-direct {v0, v2, v1}, Lc33;-><init>(IZ)V

    .line 195
    .line 196
    .line 197
    invoke-static {v0}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    return-object v0

    .line 202
    nop

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d()I
    .locals 1

    .line 1
    iget v0, p0, Lb33;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/16 v0, 0x31

    .line 7
    .line 8
    return v0

    .line 9
    :pswitch_0
    const/16 v0, 0x1e

    .line 10
    .line 11
    return v0

    .line 12
    :pswitch_1
    const/16 v0, 0x19

    .line 13
    .line 14
    return v0

    .line 15
    :pswitch_2
    const/16 v0, 0xf

    .line 16
    .line 17
    return v0

    .line 18
    :pswitch_3
    const/16 v0, 0x3a

    .line 19
    .line 20
    return v0

    .line 21
    :pswitch_4
    const/16 v0, 0x8

    .line 22
    .line 23
    return v0

    .line 24
    :pswitch_5
    const/4 v0, 0x2

    .line 25
    return v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
