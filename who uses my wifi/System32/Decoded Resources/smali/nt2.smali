.class public final Lnt2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Lga4;

.field public final c:Lba4;

.field public final d:Lba4;

.field public final e:Lba4;


# direct methods
.method public constructor <init>(Lba4;Lba4;Lba4;Lba4;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Lnt2;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnt2;->c:Lba4;

    iput-object p2, p0, Lnt2;->b:Lga4;

    iput-object p3, p0, Lnt2;->d:Lba4;

    iput-object p4, p0, Lnt2;->e:Lba4;

    return-void
.end method

.method public synthetic constructor <init>(Lba4;Lba4;Lba4;Lba4;I)V
    .locals 0

    .line 2
    iput p5, p0, Lnt2;->a:I

    iput-object p1, p0, Lnt2;->c:Lba4;

    iput-object p2, p0, Lnt2;->d:Lba4;

    iput-object p3, p0, Lnt2;->e:Lba4;

    iput-object p4, p0, Lnt2;->b:Lga4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lga4;Lba4;Lba4;Lba4;I)V
    .locals 0

    .line 3
    iput p5, p0, Lnt2;->a:I

    iput-object p1, p0, Lnt2;->b:Lga4;

    iput-object p2, p0, Lnt2;->c:Lba4;

    iput-object p3, p0, Lnt2;->d:Lba4;

    iput-object p4, p0, Lnt2;->e:Lba4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lh2;
    .locals 7

    .line 1
    sget-object v0, Lmd2;->a:Lld2;

    .line 2
    .line 3
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lnt2;->b:Lga4;

    .line 7
    .line 8
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Ljava/util/concurrent/ScheduledExecutorService;

    .line 13
    .line 14
    iget-object v2, p0, Lnt2;->c:Lba4;

    .line 15
    .line 16
    invoke-virtual {v2}, Lba4;->d()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Lgl2;

    .line 21
    .line 22
    iget-object v3, p0, Lnt2;->d:Lba4;

    .line 23
    .line 24
    invoke-virtual {v3}, Lba4;->d()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Lo13;

    .line 29
    .line 30
    iget-object v4, p0, Lnt2;->e:Lba4;

    .line 31
    .line 32
    invoke-virtual {v4}, Lba4;->d()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, Ldb3;

    .line 37
    .line 38
    new-instance v5, Lh2;

    .line 39
    .line 40
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 41
    .line 42
    .line 43
    new-instance v6, Lwq3;

    .line 44
    .line 45
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object v6, v5, Lh2;->f:Ljava/lang/Object;

    .line 49
    .line 50
    new-instance v6, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 51
    .line 52
    invoke-direct {v6}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v6, v5, Lh2;->g:Ljava/lang/Object;

    .line 56
    .line 57
    iput-object v0, v5, Lh2;->a:Ljava/lang/Object;

    .line 58
    .line 59
    iput-object v1, v5, Lh2;->b:Ljava/lang/Object;

    .line 60
    .line 61
    iput-object v2, v5, Lh2;->c:Ljava/lang/Object;

    .line 62
    .line 63
    iput-object v3, v5, Lh2;->d:Ljava/lang/Object;

    .line 64
    .line 65
    iput-object v4, v5, Lh2;->e:Ljava/lang/Object;

    .line 66
    .line 67
    return-object v5
.end method

.method public final bridge synthetic d()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lnt2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lnt2;->c:Lba4;

    .line 7
    .line 8
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljv2;

    .line 13
    .line 14
    iget-object v1, p0, Lnt2;->b:Lga4;

    .line 15
    .line 16
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Loh4;

    .line 21
    .line 22
    iget-object v2, p0, Lnt2;->d:Lba4;

    .line 23
    .line 24
    invoke-virtual {v2}, Lba4;->d()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Ljava/lang/String;

    .line 29
    .line 30
    iget-object v3, p0, Lnt2;->e:Lba4;

    .line 31
    .line 32
    invoke-virtual {v3}, Lba4;->d()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Ljava/lang/Integer;

    .line 37
    .line 38
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    new-instance v4, Lei4;

    .line 43
    .line 44
    invoke-direct {v4, v0, v1, v2, v3}, Lei4;-><init>(Ljv2;Loh4;Ljava/lang/String;I)V

    .line 45
    .line 46
    .line 47
    return-object v4

    .line 48
    :pswitch_0
    iget-object v0, p0, Lnt2;->c:Lba4;

    .line 49
    .line 50
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    move-object v2, v0

    .line 55
    check-cast v2, Llg3;

    .line 56
    .line 57
    iget-object v0, p0, Lnt2;->d:Lba4;

    .line 58
    .line 59
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    move-object v3, v0

    .line 64
    check-cast v3, Llg3;

    .line 65
    .line 66
    iget-object v0, p0, Lnt2;->e:Lba4;

    .line 67
    .line 68
    invoke-static {v0}, Lba4;->b(Lga4;)Lz94;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    iget-object v0, p0, Lnt2;->b:Lga4;

    .line 73
    .line 74
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    move-object v5, v0

    .line 79
    check-cast v5, Lgk3;

    .line 80
    .line 81
    new-instance v1, Lrj3;

    .line 82
    .line 83
    const/4 v6, 0x1

    .line 84
    invoke-direct/range {v1 .. v6}, Lrj3;-><init>(Llg3;Llg3;Lz94;Lgk3;I)V

    .line 85
    .line 86
    .line 87
    return-object v1

    .line 88
    :pswitch_1
    iget-object v0, p0, Lnt2;->c:Lba4;

    .line 89
    .line 90
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    move-object v2, v0

    .line 95
    check-cast v2, Llg3;

    .line 96
    .line 97
    iget-object v0, p0, Lnt2;->d:Lba4;

    .line 98
    .line 99
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    move-object v3, v0

    .line 104
    check-cast v3, Llg3;

    .line 105
    .line 106
    iget-object v0, p0, Lnt2;->e:Lba4;

    .line 107
    .line 108
    invoke-static {v0}, Lba4;->b(Lga4;)Lz94;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    iget-object v0, p0, Lnt2;->b:Lga4;

    .line 113
    .line 114
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    move-object v5, v0

    .line 119
    check-cast v5, Lgk3;

    .line 120
    .line 121
    new-instance v1, Lrj3;

    .line 122
    .line 123
    const/4 v6, 0x0

    .line 124
    invoke-direct/range {v1 .. v6}, Lrj3;-><init>(Llg3;Llg3;Lz94;Lgk3;I)V

    .line 125
    .line 126
    .line 127
    return-object v1

    .line 128
    :pswitch_2
    iget-object v0, p0, Lnt2;->c:Lba4;

    .line 129
    .line 130
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    check-cast v0, Luj3;

    .line 135
    .line 136
    iget-object v1, p0, Lnt2;->d:Lba4;

    .line 137
    .line 138
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    check-cast v1, Lpj3;

    .line 143
    .line 144
    iget-object v2, p0, Lnt2;->e:Lba4;

    .line 145
    .line 146
    invoke-virtual {v2}, Lba4;->d()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    check-cast v2, Lrj3;

    .line 151
    .line 152
    iget-object v3, p0, Lnt2;->b:Lga4;

    .line 153
    .line 154
    invoke-interface {v3}, Lga4;->d()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    check-cast v3, Lgk3;

    .line 159
    .line 160
    new-instance v4, Lfj3;

    .line 161
    .line 162
    invoke-direct {v4, v0, v1, v2, v3}, Lfj3;-><init>(Luj3;Lpj3;Lrj3;Lgk3;)V

    .line 163
    .line 164
    .line 165
    return-object v4

    .line 166
    :pswitch_3
    invoke-virtual {p0}, Lnt2;->a()Lh2;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    return-object v0

    .line 171
    :pswitch_4
    iget-object v0, p0, Lnt2;->b:Lga4;

    .line 172
    .line 173
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    check-cast v0, Ljava/util/concurrent/Executor;

    .line 178
    .line 179
    iget-object v1, p0, Lnt2;->c:Lba4;

    .line 180
    .line 181
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    check-cast v1, Lzj2;

    .line 186
    .line 187
    iget-object v2, p0, Lnt2;->d:Lba4;

    .line 188
    .line 189
    invoke-virtual {v2}, Lba4;->d()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    check-cast v2, Lvp2;

    .line 194
    .line 195
    iget-object v3, p0, Lnt2;->e:Lba4;

    .line 196
    .line 197
    invoke-virtual {v3}, Lba4;->d()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    check-cast v3, Lgj2;

    .line 202
    .line 203
    new-instance v4, Llt2;

    .line 204
    .line 205
    invoke-direct {v4, v0, v1, v2, v3}, Llt2;-><init>(Ljava/util/concurrent/Executor;Lzj2;Lvp2;Lgj2;)V

    .line 206
    .line 207
    .line 208
    return-object v4

    .line 209
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
