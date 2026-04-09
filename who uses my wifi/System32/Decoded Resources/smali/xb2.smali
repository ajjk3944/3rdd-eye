.class public final Lxb2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Lba4;

.field public final c:Lda4;


# direct methods
.method public synthetic constructor <init>(Lba4;Lda4;I)V
    .locals 0

    .line 1
    iput p3, p0, Lxb2;->a:I

    iput-object p1, p0, Lxb2;->b:Lba4;

    iput-object p2, p0, Lxb2;->c:Lda4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lda4;Lba4;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lxb2;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxb2;->c:Lda4;

    iput-object p2, p0, Lxb2;->b:Lba4;

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lxb2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lxb2;->b:Lba4;

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
    iget-object v1, p0, Lxb2;->c:Lda4;

    .line 15
    .line 16
    iget-object v1, v1, Lda4;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Lji2;

    .line 19
    .line 20
    new-instance v2, Ln03;

    .line 21
    .line 22
    const/4 v3, 0x2

    .line 23
    invoke-direct {v2, v0, v1, v3}, Ln03;-><init>(Landroid/content/Context;Ljava/lang/Object;I)V

    .line 24
    .line 25
    .line 26
    return-object v2

    .line 27
    :pswitch_0
    iget-object v0, p0, Lxb2;->b:Lba4;

    .line 28
    .line 29
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Landroid/content/Context;

    .line 34
    .line 35
    iget-object v1, p0, Lxb2;->c:Lda4;

    .line 36
    .line 37
    iget-object v1, v1, Lda4;->a:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Lei2;

    .line 40
    .line 41
    new-instance v2, Ln03;

    .line 42
    .line 43
    const/4 v3, 0x1

    .line 44
    invoke-direct {v2, v0, v1, v3}, Ln03;-><init>(Landroid/content/Context;Ljava/lang/Object;I)V

    .line 45
    .line 46
    .line 47
    return-object v2

    .line 48
    :pswitch_1
    iget-object v0, p0, Lxb2;->b:Lba4;

    .line 49
    .line 50
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Landroid/content/Context;

    .line 55
    .line 56
    iget-object v1, p0, Lxb2;->c:Lda4;

    .line 57
    .line 58
    iget-object v1, v1, Lda4;->a:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v1, Lbi2;

    .line 61
    .line 62
    new-instance v2, Lr03;

    .line 63
    .line 64
    invoke-direct {v2, v0, v1}, Lr03;-><init>(Landroid/content/Context;Lbi2;)V

    .line 65
    .line 66
    .line 67
    return-object v2

    .line 68
    :pswitch_2
    iget-object v0, p0, Lxb2;->b:Lba4;

    .line 69
    .line 70
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v0, Landroid/content/Context;

    .line 75
    .line 76
    iget-object v1, p0, Lxb2;->c:Lda4;

    .line 77
    .line 78
    iget-object v1, v1, Lda4;->a:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v1, Lzh2;

    .line 81
    .line 82
    new-instance v2, Ln03;

    .line 83
    .line 84
    const/4 v3, 0x0

    .line 85
    invoke-direct {v2, v0, v1, v3}, Ln03;-><init>(Landroid/content/Context;Ljava/lang/Object;I)V

    .line 86
    .line 87
    .line 88
    return-object v2

    .line 89
    :pswitch_3
    iget-object v0, p0, Lxb2;->b:Lba4;

    .line 90
    .line 91
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, Landroid/content/Context;

    .line 96
    .line 97
    iget-object v1, p0, Lxb2;->c:Lda4;

    .line 98
    .line 99
    iget-object v1, v1, Lda4;->a:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v1, Lzh2;

    .line 102
    .line 103
    sget-object v2, Lmd2;->a:Lld2;

    .line 104
    .line 105
    invoke-static {v2}, Li41;->M(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    new-instance v3, Ll03;

    .line 109
    .line 110
    const/4 v4, 0x0

    .line 111
    invoke-direct {v3, v0, v1, v2, v4}, Ll03;-><init>(Landroid/content/Context;Ljava/lang/Object;Ljava/util/concurrent/Executor;I)V

    .line 112
    .line 113
    .line 114
    return-object v3

    .line 115
    :pswitch_4
    iget-object v0, p0, Lxb2;->b:Lba4;

    .line 116
    .line 117
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    check-cast v0, Lcx1;

    .line 122
    .line 123
    iget-object v1, p0, Lxb2;->c:Lda4;

    .line 124
    .line 125
    iget-object v1, v1, Lda4;->a:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v1, Lm73;

    .line 128
    .line 129
    new-instance v2, Lcv2;

    .line 130
    .line 131
    invoke-direct {v2, v0, v1}, Lcv2;-><init>(Lcx1;Lm73;)V

    .line 132
    .line 133
    .line 134
    return-object v2

    .line 135
    :pswitch_5
    iget-object v0, p0, Lxb2;->c:Lda4;

    .line 136
    .line 137
    iget-object v0, v0, Lda4;->a:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v0, Lym;

    .line 140
    .line 141
    iget-object v1, p0, Lxb2;->b:Lba4;

    .line 142
    .line 143
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    new-instance v2, Lgw3;

    .line 148
    .line 149
    check-cast v1, Lvb2;

    .line 150
    .line 151
    const/16 v3, 0x18

    .line 152
    .line 153
    const/4 v4, 0x0

    .line 154
    invoke-direct {v2, v0, v1, v3, v4}, Lgw3;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 155
    .line 156
    .line 157
    return-object v2

    .line 158
    nop

    .line 159
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
