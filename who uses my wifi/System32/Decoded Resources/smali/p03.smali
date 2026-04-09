.class public final Lp03;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Lba4;

.field public final c:Lga4;

.field public final d:Lda4;


# direct methods
.method public synthetic constructor <init>(Lba4;Lda4;Lga4;I)V
    .locals 0

    .line 1
    iput p4, p0, Lp03;->a:I

    iput-object p1, p0, Lp03;->b:Lba4;

    iput-object p2, p0, Lp03;->d:Lda4;

    iput-object p3, p0, Lp03;->c:Lga4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lba4;Lga4;Lda4;I)V
    .locals 0

    .line 2
    iput p4, p0, Lp03;->a:I

    iput-object p1, p0, Lp03;->b:Lba4;

    iput-object p2, p0, Lp03;->c:Lga4;

    iput-object p3, p0, Lp03;->d:Lda4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lp03;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lp03;->b:Lba4;

    .line 7
    .line 8
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Landroid/content/Context;

    .line 13
    .line 14
    iget-object v1, p0, Lp03;->c:Lga4;

    .line 15
    .line 16
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ljava/util/concurrent/Executor;

    .line 21
    .line 22
    iget-object v2, p0, Lp03;->d:Lda4;

    .line 23
    .line 24
    iget-object v2, v2, Lda4;->a:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, Lji2;

    .line 27
    .line 28
    new-instance v3, Lt13;

    .line 29
    .line 30
    const/4 v4, 0x1

    .line 31
    invoke-direct {v3, v0, v1, v2, v4}, Lt13;-><init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lji2;I)V

    .line 32
    .line 33
    .line 34
    return-object v3

    .line 35
    :pswitch_0
    iget-object v0, p0, Lp03;->b:Lba4;

    .line 36
    .line 37
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Landroid/content/Context;

    .line 42
    .line 43
    iget-object v1, p0, Lp03;->c:Lga4;

    .line 44
    .line 45
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Ljava/util/concurrent/Executor;

    .line 50
    .line 51
    iget-object v2, p0, Lp03;->d:Lda4;

    .line 52
    .line 53
    iget-object v2, v2, Lda4;->a:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v2, Lji2;

    .line 56
    .line 57
    new-instance v3, Lt13;

    .line 58
    .line 59
    const/4 v4, 0x0

    .line 60
    invoke-direct {v3, v0, v1, v2, v4}, Lt13;-><init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lji2;I)V

    .line 61
    .line 62
    .line 63
    return-object v3

    .line 64
    :pswitch_1
    iget-object v0, p0, Lp03;->b:Lba4;

    .line 65
    .line 66
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    check-cast v0, Landroid/content/Context;

    .line 71
    .line 72
    iget-object v1, p0, Lp03;->d:Lda4;

    .line 73
    .line 74
    iget-object v1, v1, Lda4;->a:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v1, Lsh2;

    .line 77
    .line 78
    iget-object v2, p0, Lp03;->c:Lga4;

    .line 79
    .line 80
    check-cast v2, Lph2;

    .line 81
    .line 82
    invoke-virtual {v2}, Lph2;->a()Le51;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    new-instance v3, Lr03;

    .line 87
    .line 88
    invoke-direct {v3, v0, v1, v2}, Lr03;-><init>(Landroid/content/Context;Lsh2;Le51;)V

    .line 89
    .line 90
    .line 91
    return-object v3

    .line 92
    :pswitch_2
    iget-object v0, p0, Lp03;->b:Lba4;

    .line 93
    .line 94
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, Landroid/content/Context;

    .line 99
    .line 100
    iget-object v1, p0, Lp03;->d:Lda4;

    .line 101
    .line 102
    iget-object v1, v1, Lda4;->a:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v1, Lsh2;

    .line 105
    .line 106
    iget-object v2, p0, Lp03;->c:Lga4;

    .line 107
    .line 108
    invoke-interface {v2}, Lga4;->d()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    check-cast v2, Ljava/util/concurrent/Executor;

    .line 113
    .line 114
    new-instance v3, Ll03;

    .line 115
    .line 116
    const/4 v4, 0x2

    .line 117
    invoke-direct {v3, v0, v1, v2, v4}, Ll03;-><init>(Landroid/content/Context;Ljava/lang/Object;Ljava/util/concurrent/Executor;I)V

    .line 118
    .line 119
    .line 120
    return-object v3

    .line 121
    :pswitch_3
    iget-object v0, p0, Lp03;->b:Lba4;

    .line 122
    .line 123
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    check-cast v0, Landroid/content/Context;

    .line 128
    .line 129
    iget-object v1, p0, Lp03;->c:Lga4;

    .line 130
    .line 131
    check-cast v1, Lph2;

    .line 132
    .line 133
    invoke-virtual {v1}, Lph2;->a()Le51;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    iget-object v2, p0, Lp03;->d:Lda4;

    .line 138
    .line 139
    iget-object v2, v2, Lda4;->a:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v2, Lei2;

    .line 142
    .line 143
    sget-object v3, Lmd2;->a:Lld2;

    .line 144
    .line 145
    invoke-static {v3}, Li41;->M(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    new-instance v4, Lr03;

    .line 149
    .line 150
    invoke-direct {v4, v0, v1, v2, v3}, Lr03;-><init>(Landroid/content/Context;Le51;Lei2;Lld2;)V

    .line 151
    .line 152
    .line 153
    return-object v4

    .line 154
    :pswitch_4
    iget-object v0, p0, Lp03;->b:Lba4;

    .line 155
    .line 156
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    check-cast v0, Landroid/content/Context;

    .line 161
    .line 162
    iget-object v1, p0, Lp03;->d:Lda4;

    .line 163
    .line 164
    iget-object v1, v1, Lda4;->a:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v1, Lbi2;

    .line 167
    .line 168
    iget-object v2, p0, Lp03;->c:Lga4;

    .line 169
    .line 170
    invoke-interface {v2}, Lga4;->d()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    check-cast v2, Ljava/util/concurrent/Executor;

    .line 175
    .line 176
    new-instance v3, Ll03;

    .line 177
    .line 178
    const/4 v4, 0x1

    .line 179
    invoke-direct {v3, v0, v1, v2, v4}, Ll03;-><init>(Landroid/content/Context;Ljava/lang/Object;Ljava/util/concurrent/Executor;I)V

    .line 180
    .line 181
    .line 182
    return-object v3

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
