.class public Lqf1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lcg1;


# instance fields
.field public final synthetic a:I

.field public final b:J

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JJ)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lqf1;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lqf1;->b:J

    const-wide/16 p1, 0x0

    cmp-long v0, p3, p1

    new-instance v1, Lbg1;

    if-nez v0, :cond_0

    sget-object p1, Ldg1;->c:Ldg1;

    goto :goto_0

    :cond_0
    new-instance v0, Ldg1;

    .line 3
    invoke-direct {v0, p1, p2, p3, p4}, Ldg1;-><init>(JJ)V

    move-object p1, v0

    .line 4
    :goto_0
    invoke-direct {v1, p1, p1}, Lbg1;-><init>(Ldg1;Ldg1;)V

    iput-object v1, p0, Lqf1;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;JI)V
    .locals 0

    .line 1
    iput p4, p0, Lqf1;->a:I

    iput-object p1, p0, Lqf1;->c:Ljava/lang/Object;

    iput-wide p2, p0, Lqf1;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget v0, p0, Lqf1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-wide v0, p0, Lqf1;->b:J

    .line 7
    .line 8
    return-wide v0

    .line 9
    :pswitch_0
    iget-wide v0, p0, Lqf1;->b:J

    .line 10
    .line 11
    return-wide v0

    .line 12
    :pswitch_1
    iget-object v0, p0, Lqf1;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lrf1;

    .line 15
    .line 16
    invoke-virtual {v0}, Lrf1;->a()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    return-wide v0

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(J)Lbg1;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    iget v3, v0, Lqf1;->a:I

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x1

    .line 9
    iget-object v6, v0, Lqf1;->c:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v3, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v6, Log1;

    .line 15
    .line 16
    iget-object v3, v6, Log1;->i:[Lsg1;

    .line 17
    .line 18
    aget-object v3, v3, v4

    .line 19
    .line 20
    invoke-virtual {v3, v1, v2}, Lsg1;->a(J)Lbg1;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    :goto_0
    iget-object v4, v6, Log1;->i:[Lsg1;

    .line 25
    .line 26
    array-length v7, v4

    .line 27
    if-ge v5, v7, :cond_1

    .line 28
    .line 29
    aget-object v4, v4, v5

    .line 30
    .line 31
    invoke-virtual {v4, v1, v2}, Lsg1;->a(J)Lbg1;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    iget-object v7, v4, Lbg1;->a:Ldg1;

    .line 36
    .line 37
    iget-object v8, v3, Lbg1;->a:Ldg1;

    .line 38
    .line 39
    iget-wide v9, v7, Ldg1;->b:J

    .line 40
    .line 41
    iget-wide v7, v8, Ldg1;->b:J

    .line 42
    .line 43
    cmp-long v7, v9, v7

    .line 44
    .line 45
    if-gez v7, :cond_0

    .line 46
    .line 47
    move-object v3, v4

    .line 48
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    return-object v3

    .line 52
    :pswitch_0
    check-cast v6, Lbg1;

    .line 53
    .line 54
    return-object v6

    .line 55
    :pswitch_1
    check-cast v6, Lrf1;

    .line 56
    .line 57
    iget-object v3, v6, Lrf1;->k:Lvq2;

    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    sget-object v7, Lv23;->a:Ljava/lang/String;

    .line 63
    .line 64
    iget v7, v6, Lrf1;->e:I

    .line 65
    .line 66
    int-to-long v7, v7

    .line 67
    mul-long/2addr v7, v1

    .line 68
    iget-wide v9, v6, Lrf1;->j:J

    .line 69
    .line 70
    const-wide/32 v11, 0xf4240

    .line 71
    .line 72
    .line 73
    div-long/2addr v7, v11

    .line 74
    const-wide/16 v13, -0x1

    .line 75
    .line 76
    add-long/2addr v9, v13

    .line 77
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->min(JJ)J

    .line 78
    .line 79
    .line 80
    move-result-wide v7

    .line 81
    const-wide/16 v9, 0x0

    .line 82
    .line 83
    invoke-static {v9, v10, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 84
    .line 85
    .line 86
    move-result-wide v7

    .line 87
    iget-object v13, v3, Lvq2;->g:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v13, [J

    .line 90
    .line 91
    invoke-static {v13, v7, v8, v4}, Lv23;->p([JJZ)I

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    const/4 v7, -0x1

    .line 96
    if-ne v4, v7, :cond_2

    .line 97
    .line 98
    move-wide v14, v9

    .line 99
    goto :goto_1

    .line 100
    :cond_2
    aget-wide v14, v13, v4

    .line 101
    .line 102
    :goto_1
    iget-object v3, v3, Lvq2;->h:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v3, [J

    .line 105
    .line 106
    if-ne v4, v7, :cond_3

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_3
    aget-wide v9, v3, v4

    .line 110
    .line 111
    :goto_2
    iget v6, v6, Lrf1;->e:I

    .line 112
    .line 113
    mul-long/2addr v14, v11

    .line 114
    move/from16 v16, v7

    .line 115
    .line 116
    int-to-long v7, v6

    .line 117
    div-long/2addr v14, v7

    .line 118
    new-instance v7, Ldg1;

    .line 119
    .line 120
    move-wide/from16 v17, v11

    .line 121
    .line 122
    iget-wide v11, v0, Lqf1;->b:J

    .line 123
    .line 124
    add-long/2addr v9, v11

    .line 125
    invoke-direct {v7, v14, v15, v9, v10}, Ldg1;-><init>(JJ)V

    .line 126
    .line 127
    .line 128
    cmp-long v1, v14, v1

    .line 129
    .line 130
    if-eqz v1, :cond_5

    .line 131
    .line 132
    array-length v1, v13

    .line 133
    add-int/lit8 v1, v1, -0x1

    .line 134
    .line 135
    if-ne v4, v1, :cond_4

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_4
    add-int/2addr v4, v5

    .line 139
    aget-wide v1, v13, v4

    .line 140
    .line 141
    aget-wide v4, v3, v4

    .line 142
    .line 143
    mul-long v1, v1, v17

    .line 144
    .line 145
    int-to-long v8, v6

    .line 146
    div-long/2addr v1, v8

    .line 147
    new-instance v3, Ldg1;

    .line 148
    .line 149
    add-long/2addr v11, v4

    .line 150
    invoke-direct {v3, v1, v2, v11, v12}, Ldg1;-><init>(JJ)V

    .line 151
    .line 152
    .line 153
    new-instance v1, Lbg1;

    .line 154
    .line 155
    invoke-direct {v1, v7, v3}, Lbg1;-><init>(Ldg1;Ldg1;)V

    .line 156
    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_5
    :goto_3
    new-instance v1, Lbg1;

    .line 160
    .line 161
    invoke-direct {v1, v7, v7}, Lbg1;-><init>(Ldg1;Ldg1;)V

    .line 162
    .line 163
    .line 164
    :goto_4
    return-object v1

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget v0, p0, Lqf1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    return v0

    .line 8
    :pswitch_0
    const/4 v0, 0x0

    .line 9
    return v0

    .line 10
    :pswitch_1
    const/4 v0, 0x1

    .line 11
    return v0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
