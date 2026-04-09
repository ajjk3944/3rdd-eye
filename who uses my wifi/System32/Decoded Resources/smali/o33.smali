.class public final Lo33;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lq53;


# instance fields
.field public final synthetic a:I

.field public final b:Lpq3;

.field public final c:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lpq3;I)V
    .locals 0

    .line 1
    iput p3, p0, Lo33;->a:I

    iput-object p1, p0, Lo33;->c:Landroid/content/Context;

    iput-object p2, p0, Lo33;->b:Lpq3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lpq3;Landroid/content/Context;I)V
    .locals 0

    .line 2
    iput p3, p0, Lo33;->a:I

    iput-object p1, p0, Lo33;->b:Lpq3;

    iput-object p2, p0, Lo33;->c:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ln70;
    .locals 4

    .line 1
    iget v0, p0, Lo33;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lw53;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, v1, p0}, Lw53;-><init>(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lo33;->b:Lpq3;

    .line 13
    .line 14
    check-cast v1, Lld2;

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0

    .line 21
    :pswitch_0
    sget-object v0, Lm02;->b:Lso1;

    .line 22
    .line 23
    invoke-virtual {v0}, Lso1;->w()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    new-instance v0, Lxs1;

    .line 36
    .line 37
    const/16 v1, 0x1c

    .line 38
    .line 39
    invoke-direct {v0, v1, p0}, Lxs1;-><init>(ILjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Lo33;->b:Lpq3;

    .line 43
    .line 44
    check-cast v1, Lld2;

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    new-instance v0, Lt53;

    .line 52
    .line 53
    const/4 v1, -0x1

    .line 54
    invoke-direct {v0, v1, v1}, Lt53;-><init>(II)V

    .line 55
    .line 56
    .line 57
    invoke-static {v0}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    :goto_0
    return-object v0

    .line 62
    :pswitch_1
    new-instance v0, Lxs1;

    .line 63
    .line 64
    const/16 v1, 0x1b

    .line 65
    .line 66
    invoke-direct {v0, v1, p0}, Lxs1;-><init>(ILjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object v1, p0, Lo33;->b:Lpq3;

    .line 70
    .line 71
    check-cast v1, Lld2;

    .line 72
    .line 73
    invoke-virtual {v1, v0}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    return-object v0

    .line 78
    :pswitch_2
    new-instance v0, Lxs1;

    .line 79
    .line 80
    const/16 v1, 0x12

    .line 81
    .line 82
    invoke-direct {v0, v1, p0}, Lxs1;-><init>(ILjava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    iget-object v1, p0, Lo33;->b:Lpq3;

    .line 86
    .line 87
    check-cast v1, Lld2;

    .line 88
    .line 89
    invoke-virtual {v1, v0}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    return-object v0

    .line 94
    :pswitch_3
    new-instance v0, Lxs1;

    .line 95
    .line 96
    const/16 v1, 0x11

    .line 97
    .line 98
    invoke-direct {v0, v1, p0}, Lxs1;-><init>(ILjava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    iget-object v1, p0, Lo33;->b:Lpq3;

    .line 102
    .line 103
    check-cast v1, Lld2;

    .line 104
    .line 105
    invoke-virtual {v1, v0}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    return-object v0

    .line 110
    :pswitch_4
    new-instance v0, Lxs1;

    .line 111
    .line 112
    const/16 v1, 0xf

    .line 113
    .line 114
    invoke-direct {v0, v1, p0}, Lxs1;-><init>(ILjava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    iget-object v1, p0, Lo33;->b:Lpq3;

    .line 118
    .line 119
    check-cast v1, Lld2;

    .line 120
    .line 121
    invoke-virtual {v1, v0}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    return-object v0

    .line 126
    :pswitch_5
    new-instance v0, Lxs1;

    .line 127
    .line 128
    const/16 v1, 0xe

    .line 129
    .line 130
    invoke-direct {v0, v1, p0}, Lxs1;-><init>(ILjava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    iget-object v1, p0, Lo33;->b:Lpq3;

    .line 134
    .line 135
    check-cast v1, Lld2;

    .line 136
    .line 137
    invoke-virtual {v1, v0}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    return-object v0

    .line 142
    :pswitch_6
    sget-object v0, Lmz1;->Id:Liz1;

    .line 143
    .line 144
    sget-object v1, Ltw1;->e:Ltw1;

    .line 145
    .line 146
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 147
    .line 148
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    check-cast v0, Ljava/lang/Boolean;

    .line 153
    .line 154
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    const/4 v1, 0x0

    .line 159
    const/4 v2, 0x0

    .line 160
    if-nez v0, :cond_1

    .line 161
    .line 162
    new-instance v0, Lp33;

    .line 163
    .line 164
    const/4 v3, 0x0

    .line 165
    invoke-direct {v0, v2, v1, v3}, Lp33;-><init>(Ljava/lang/Object;ZI)V

    .line 166
    .line 167
    .line 168
    invoke-static {v0}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    goto :goto_1

    .line 173
    :cond_1
    iget-object v0, p0, Lo33;->c:Landroid/content/Context;

    .line 174
    .line 175
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    if-nez v0, :cond_2

    .line 180
    .line 181
    new-instance v0, Lp33;

    .line 182
    .line 183
    const/4 v3, 0x0

    .line 184
    invoke-direct {v0, v2, v1, v3}, Lp33;-><init>(Ljava/lang/Object;ZI)V

    .line 185
    .line 186
    .line 187
    invoke-static {v0}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    goto :goto_1

    .line 192
    :cond_2
    new-instance v1, Lxs1;

    .line 193
    .line 194
    const/16 v2, 0xb

    .line 195
    .line 196
    invoke-direct {v1, v2, v0}, Lxs1;-><init>(ILjava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    iget-object v0, p0, Lo33;->b:Lpq3;

    .line 200
    .line 201
    check-cast v0, Lld2;

    .line 202
    .line 203
    invoke-virtual {v0, v1}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    :goto_1
    return-object v0

    .line 208
    nop

    .line 209
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b()Landroid/content/Intent;
    .locals 5

    .line 1
    new-instance v0, Landroid/content/IntentFilter;

    .line 2
    .line 3
    const-string v1, "android.intent.action.BATTERY_CHANGED"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lmz1;->Nb:Liz1;

    .line 9
    .line 10
    sget-object v2, Ltw1;->e:Ltw1;

    .line 11
    .line 12
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 13
    .line 14
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v2, 0x0

    .line 25
    iget-object v3, p0, Lo33;->c:Landroid/content/Context;

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 30
    .line 31
    const/16 v4, 0x21

    .line 32
    .line 33
    if-lt v1, v4, :cond_0

    .line 34
    .line 35
    const/4 v1, 0x4

    .line 36
    invoke-virtual {v3, v2, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    return-object v0

    .line 41
    :cond_0
    invoke-virtual {v3, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0
.end method

.method public final d()I
    .locals 1

    .line 1
    iget v0, p0, Lo33;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/16 v0, 0x27

    .line 7
    .line 8
    return v0

    .line 9
    :pswitch_0
    const/16 v0, 0x3b

    .line 10
    .line 11
    return v0

    .line 12
    :pswitch_1
    const/16 v0, 0x25

    .line 13
    .line 14
    return v0

    .line 15
    :pswitch_2
    const/16 v0, 0x39

    .line 16
    .line 17
    return v0

    .line 18
    :pswitch_3
    const/16 v0, 0x12

    .line 19
    .line 20
    return v0

    .line 21
    :pswitch_4
    const/16 v0, 0xe

    .line 22
    .line 23
    return v0

    .line 24
    :pswitch_5
    const/16 v0, 0xd

    .line 25
    .line 26
    return v0

    .line 27
    :pswitch_6
    const/16 v0, 0x3d

    .line 28
    .line 29
    return v0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
