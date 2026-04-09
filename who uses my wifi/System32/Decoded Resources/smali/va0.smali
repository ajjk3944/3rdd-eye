.class public final Lva0;
.super Lmz0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lhy;


# instance fields
.field public j:I

.field public final synthetic k:J

.field public final synthetic l:Lso1;

.field public final synthetic m:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;


# direct methods
.method public constructor <init>(JLso1;Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;Loj;)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lva0;->k:J

    .line 2
    .line 3
    iput-object p3, p0, Lva0;->l:Lso1;

    .line 4
    .line 5
    iput-object p4, p0, Lva0;->m:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p5}, Lmz0;-><init>(ILoj;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lqk;

    .line 2
    .line 3
    check-cast p2, Loj;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lva0;->h(Loj;Ljava/lang/Object;)Loj;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lva0;

    .line 10
    .line 11
    sget-object p2, Lz31;->a:Lz31;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lva0;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final h(Loj;Ljava/lang/Object;)Loj;
    .locals 6

    .line 1
    new-instance v0, Lva0;

    .line 2
    .line 3
    iget-object v3, p0, Lva0;->l:Lso1;

    .line 4
    .line 5
    iget-object v4, p0, Lva0;->m:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 6
    .line 7
    iget-wide v1, p0, Lva0;->k:J

    .line 8
    .line 9
    move-object v5, p1

    .line 10
    invoke-direct/range {v0 .. v5}, Lva0;-><init>(JLso1;Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;Loj;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lva0;->l:Lso1;

    .line 2
    .line 3
    iget v1, p0, Lva0;->j:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    if-eq v1, v3, :cond_1

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    :goto_0
    :try_start_0
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_2
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    const-string p1, ""

    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    move-object v4, p1

    .line 33
    :goto_1
    const/4 v5, -0x1

    .line 34
    if-ge v5, v1, :cond_3

    .line 35
    .line 36
    mul-int/lit8 v5, v1, 0x8

    .line 37
    .line 38
    iget-wide v6, p0, Lva0;->k:J

    .line 39
    .line 40
    shr-long v5, v6, v5

    .line 41
    .line 42
    const-wide/16 v7, 0xff

    .line 43
    .line 44
    and-long/2addr v5, v7

    .line 45
    new-instance v7, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v7, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v4, "."

    .line 57
    .line 58
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    add-int/lit8 v1, v1, -0x1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    sub-int/2addr v1, v3

    .line 73
    const/4 v5, 0x0

    .line 74
    invoke-virtual {v4, v5, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    const-string v4, "substring(...)"

    .line 79
    .line 80
    invoke-static {v1, v4}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    new-instance v4, Ld10;

    .line 84
    .line 85
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 86
    .line 87
    .line 88
    sget-object v5, Lro;->j:Lro;

    .line 89
    .line 90
    iput-object v5, v4, Ld10;->a:Lro;

    .line 91
    .line 92
    iput-object p1, v4, Ld10;->c:Ljava/lang/String;

    .line 93
    .line 94
    const-string v5, "00:00:00:00:00:00"

    .line 95
    .line 96
    iput-object v5, v4, Ld10;->d:Ljava/lang/String;

    .line 97
    .line 98
    iput-object p1, v4, Ld10;->e:Ljava/lang/String;

    .line 99
    .line 100
    const p1, 0x7f0800ab

    .line 101
    .line 102
    .line 103
    iput p1, v4, Ld10;->f:I

    .line 104
    .line 105
    iput-object v1, v4, Ld10;->b:Ljava/lang/String;

    .line 106
    .line 107
    :try_start_1
    invoke-static {v1}, Li41;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    iput-object p1, v4, Ld10;->d:Ljava/lang/String;

    .line 112
    .line 113
    invoke-virtual {v5, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 117
    iget-object v5, p0, Lva0;->m:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 118
    .line 119
    sget-object v6, Lrk;->f:Lrk;

    .line 120
    .line 121
    if-nez p1, :cond_5

    .line 122
    .line 123
    :try_start_2
    iput v3, p0, Lva0;->j:I

    .line 124
    .line 125
    invoke-static {v5, v4, p0}, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->y(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;Ld10;Lqj;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    if-ne p1, v6, :cond_4

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_4
    :goto_2
    check-cast p1, Ld10;

    .line 133
    .line 134
    return-object p1

    .line 135
    :cond_5
    invoke-static {v1}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    iget v3, v0, Lso1;->f:I

    .line 140
    .line 141
    invoke-virtual {p1, v3}, Ljava/net/InetAddress;->isReachable(I)Z

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    if-eqz p1, :cond_7

    .line 146
    .line 147
    iget-object p1, v5, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->R:Ljava/lang/String;

    .line 148
    .line 149
    iget-object v3, v4, Ld10;->b:Ljava/lang/String;

    .line 150
    .line 151
    invoke-static {p1, v3}, Li30;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    if-nez p1, :cond_6

    .line 156
    .line 157
    iput-object v1, v0, Lso1;->h:Ljava/lang/Object;

    .line 158
    .line 159
    invoke-virtual {v0}, Lso1;->a()V

    .line 160
    .line 161
    .line 162
    :cond_6
    iput v2, p0, Lva0;->j:I

    .line 163
    .line 164
    invoke-static {v5, v4, p0}, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->y(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;Ld10;Lqj;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 168
    if-ne p1, v6, :cond_4

    .line 169
    .line 170
    :goto_3
    return-object v6

    .line 171
    :cond_7
    sget-object p1, Lz31;->a:Lz31;

    .line 172
    .line 173
    return-object p1

    .line 174
    :catch_0
    const/4 p1, 0x0

    .line 175
    return-object p1
.end method
