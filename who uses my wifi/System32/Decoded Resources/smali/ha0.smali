.class public final synthetic Lha0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ldy;


# instance fields
.field public final synthetic f:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

.field public final synthetic g:Lap0;

.field public final synthetic h:Lbp0;


# direct methods
.method public synthetic constructor <init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;Lap0;Lbp0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lha0;->f:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 5
    .line 6
    iput-object p2, p0, Lha0;->g:Lap0;

    .line 7
    .line 8
    iput-object p3, p0, Lha0;->h:Lbp0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, Ld10;

    .line 2
    .line 3
    iget-object v0, p0, Lha0;->f:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 4
    .line 5
    iget-boolean v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->a0:Z

    .line 6
    .line 7
    if-eqz v1, :cond_c

    .line 8
    .line 9
    iget-object v1, p0, Lha0;->g:Lap0;

    .line 10
    .line 11
    iget v2, v1, Lap0;->f:I

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    add-int/2addr v2, v3

    .line 15
    iput v2, v1, Lap0;->f:I

    .line 16
    .line 17
    iget-object v1, p0, Lha0;->h:Lbp0;

    .line 18
    .line 19
    iget-wide v4, v1, Lbp0;->f:J

    .line 20
    .line 21
    const-wide/16 v6, 0x0

    .line 22
    .line 23
    cmp-long v1, v4, v6

    .line 24
    .line 25
    if-lez v1, :cond_0

    .line 26
    .line 27
    mul-int/lit16 v2, v2, 0x2710

    .line 28
    .line 29
    int-to-long v1, v2

    .line 30
    div-long/2addr v1, v4

    .line 31
    long-to-int v1, v1

    .line 32
    new-instance v2, Lma0;

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    invoke-direct {v2, v0, v1, v4}, Lma0;-><init>(Ljava/lang/Object;II)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    if-eqz p1, :cond_c

    .line 42
    .line 43
    iget-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->N:Ljava/util/ArrayList;

    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    const-string v4, "hosts"

    .line 47
    .line 48
    if-eqz v1, :cond_b

    .line 49
    .line 50
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    iget-object p1, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C:Lf2;

    .line 54
    .line 55
    if-eqz p1, :cond_a

    .line 56
    .line 57
    iget-object p1, p1, Lf2;->l:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, Landroid/widget/TextView;

    .line 60
    .line 61
    iget-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->N:Ljava/util/ArrayList;

    .line 62
    .line 63
    if-eqz v1, :cond_9

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    const v5, 0x7f120114

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    filled-new-array {v1, v5}, [Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    const v5, 0x7f12012f

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v5, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C()Landroid/content/SharedPreferences;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    const-string v1, "sortPref"

    .line 99
    .line 100
    const-string v5, "ip"

    .line 101
    .line 102
    invoke-interface {p1, v1, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    if-eqz p1, :cond_7

    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    const/16 v6, 0xd27

    .line 113
    .line 114
    if-eq v1, v6, :cond_4

    .line 115
    .line 116
    const v5, 0x337a8b

    .line 117
    .line 118
    .line 119
    if-eq v1, v5, :cond_1

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_1
    const-string v1, "name"

    .line 123
    .line 124
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    if-nez p1, :cond_2

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_2
    iget-object p1, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->N:Ljava/util/ArrayList;

    .line 132
    .line 133
    if-eqz p1, :cond_3

    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    if-le v1, v3, :cond_7

    .line 140
    .line 141
    new-instance v1, Lbk;

    .line 142
    .line 143
    const/4 v3, 0x4

    .line 144
    invoke-direct {v1, v3}, Lbk;-><init>(I)V

    .line 145
    .line 146
    .line 147
    invoke-static {p1, v1}, Ldg;->l0(Ljava/util/List;Ljava/util/Comparator;)V

    .line 148
    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_3
    invoke-static {v4}, Li30;->S(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    throw v2

    .line 155
    :cond_4
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    if-nez p1, :cond_5

    .line 160
    .line 161
    goto :goto_0

    .line 162
    :cond_5
    iget-object p1, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->N:Ljava/util/ArrayList;

    .line 163
    .line 164
    if-eqz p1, :cond_6

    .line 165
    .line 166
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    if-le v1, v3, :cond_7

    .line 171
    .line 172
    new-instance v1, Lbk;

    .line 173
    .line 174
    const/4 v3, 0x3

    .line 175
    invoke-direct {v1, v3}, Lbk;-><init>(I)V

    .line 176
    .line 177
    .line 178
    invoke-static {p1, v1}, Ldg;->l0(Ljava/util/List;Ljava/util/Comparator;)V

    .line 179
    .line 180
    .line 181
    goto :goto_0

    .line 182
    :cond_6
    invoke-static {v4}, Li30;->S(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    throw v2

    .line 186
    :cond_7
    :goto_0
    iget-object p1, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->O:Lc10;

    .line 187
    .line 188
    if-eqz p1, :cond_8

    .line 189
    .line 190
    iget-object p1, p1, Lao0;->f:Lbo0;

    .line 191
    .line 192
    invoke-virtual {p1}, Lbo0;->b()V

    .line 193
    .line 194
    .line 195
    goto :goto_1

    .line 196
    :cond_8
    const-string p1, "hostAdapter"

    .line 197
    .line 198
    invoke-static {p1}, Li30;->S(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    throw v2

    .line 202
    :cond_9
    invoke-static {v4}, Li30;->S(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    throw v2

    .line 206
    :cond_a
    const-string p1, "binding"

    .line 207
    .line 208
    invoke-static {p1}, Li30;->S(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    throw v2

    .line 212
    :cond_b
    invoke-static {v4}, Li30;->S(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    throw v2

    .line 216
    :cond_c
    :goto_1
    sget-object p1, Lz31;->a:Lz31;

    .line 217
    .line 218
    return-object p1
.end method
