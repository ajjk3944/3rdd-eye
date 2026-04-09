.class public final Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;
.super Li5;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final d0:[I

.field public static e0:I


# instance fields
.field public C:Lf2;

.field public final D:Lra0;

.field public E:Landroid/content/SharedPreferences;

.field public F:Landroid/net/ConnectivityManager;

.field public G:Landroid/net/wifi/WifiManager;

.field public H:Ljava/util/Timer;

.field public I:Lt90;

.field public J:J

.field public K:J

.field public L:J

.field public M:Z

.field public N:Ljava/util/ArrayList;

.field public O:Lc10;

.field public P:Ljava/lang/String;

.field public Q:I

.field public R:Ljava/lang/String;

.field public S:Ljava/util/LinkedHashMap;

.field public T:Ljava/util/ArrayList;

.field public U:Lf10;

.field public final V:Ljava/util/ArrayList;

.field public W:Lvb;

.field public X:Lf20;

.field public final Y:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public Z:Lyn;

.field public a0:Z

.field public final b0:Ljava/util/ArrayList;

.field public c0:Lvq2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x7

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->d0:[I

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    sput v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->e0:I

    .line 11
    .line 12
    return-void

    .line 13
    :array_0
    .array-data 4
        0x16
        0x50
        0x1bb
        0x22a
        0x277
        0x22b3
        0x238c
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Li5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lra0;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1, p0}, Lra0;-><init>(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->D:Lra0;

    .line 11
    .line 12
    const-string v0, "0.0.0.0"

    .line 13
    .line 14
    iput-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->P:Ljava/lang/String;

    .line 15
    .line 16
    const/16 v1, 0x18

    .line 17
    .line 18
    iput v1, p0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->Q:I

    .line 19
    .line 20
    iput-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->R:Ljava/lang/String;

    .line 21
    .line 22
    new-instance v0, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->V:Ljava/util/ArrayList;

    .line 28
    .line 29
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->Y:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 36
    .line 37
    new-instance v0, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->b0:Ljava/util/ArrayList;

    .line 43
    .line 44
    return-void
.end method

.method public static final x(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;I)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_6

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    if-eq p1, v1, :cond_1

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    if-eq p1, v1, :cond_0

    .line 9
    .line 10
    iput-boolean v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->M:Z

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->A()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iput-boolean v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->M:Z

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->A()V

    .line 19
    .line 20
    .line 21
    new-instance p1, Lla0;

    .line 22
    .line 23
    const/4 v0, 0x5

    .line 24
    invoke-direct {p1, p0, v0}, Lla0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    iget-object p1, p0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->G:Landroid/net/wifi/WifiManager;

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    const-string v3, "wifiManager"

    .line 35
    .line 36
    if-eqz p1, :cond_5

    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Landroid/net/wifi/WifiInfo;->getSupplicantState()Landroid/net/wifi/SupplicantState;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    sget-object v5, Landroid/net/wifi/SupplicantState;->COMPLETED:Landroid/net/wifi/SupplicantState;

    .line 47
    .line 48
    if-ne v4, v5, :cond_4

    .line 49
    .line 50
    iput-boolean v1, p0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->M:Z

    .line 51
    .line 52
    iget-object v4, p0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->G:Landroid/net/wifi/WifiManager;

    .line 53
    .line 54
    if-eqz v4, :cond_3

    .line 55
    .line 56
    invoke-virtual {v4}, Landroid/net/wifi/WifiManager;->getDhcpInfo()Landroid/net/DhcpInfo;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    new-instance v3, Ltr;

    .line 61
    .line 62
    const/4 v4, 0x1

    .line 63
    invoke-direct {v3, p0, v2, p1, v4}, Ltr;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 67
    .line 68
    .line 69
    iget p1, v2, Landroid/net/DhcpInfo;->gateway:I

    .line 70
    .line 71
    const-string v2, ""

    .line 72
    .line 73
    move v3, v0

    .line 74
    :goto_0
    const/4 v4, 0x4

    .line 75
    if-ge v3, v4, :cond_2

    .line 76
    .line 77
    mul-int/lit8 v4, v3, 0x8

    .line 78
    .line 79
    shr-int v4, p1, v4

    .line 80
    .line 81
    and-int/lit16 v4, v4, 0xff

    .line 82
    .line 83
    new-instance v5, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v2, "."

    .line 95
    .line 96
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    add-int/lit8 v3, v3, 0x1

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    sub-int/2addr p1, v1

    .line 111
    invoke-virtual {v2, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    const-string v0, "substring(...)"

    .line 116
    .line 117
    invoke-static {p1, v0}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    new-instance v0, Ljava/lang/Thread;

    .line 121
    .line 122
    new-instance v1, Lka0;

    .line 123
    .line 124
    invoke-direct {v1, p1, p0}, Lka0;-><init>(Ljava/lang/String;Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;)V

    .line 125
    .line 126
    .line 127
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :cond_3
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    throw v2

    .line 138
    :cond_4
    return-void

    .line 139
    :cond_5
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    throw v2

    .line 143
    :cond_6
    invoke-virtual {p0}, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->A()V

    .line 144
    .line 145
    .line 146
    iput-boolean v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->M:Z

    .line 147
    .line 148
    new-instance p1, Lla0;

    .line 149
    .line 150
    const/4 v0, 0x4

    .line 151
    invoke-direct {p1, p0, v0}, Lla0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;I)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 155
    .line 156
    .line 157
    return-void
.end method

.method public static final y(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;Ld10;Lqj;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    const-string v3, ""

    .line 8
    .line 9
    instance-of v4, v0, Lqa0;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v0

    .line 14
    check-cast v4, Lqa0;

    .line 15
    .line 16
    iget v5, v4, Lqa0;->l:I

    .line 17
    .line 18
    const/high16 v6, -0x80000000

    .line 19
    .line 20
    and-int v7, v5, v6

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v5, v6

    .line 25
    iput v5, v4, Lqa0;->l:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v4, Lqa0;

    .line 29
    .line 30
    invoke-direct {v4, v1, v0}, Lqa0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;Lqj;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v0, v4, Lqa0;->j:Ljava/lang/Object;

    .line 34
    .line 35
    iget v5, v4, Lqa0;->l:I

    .line 36
    .line 37
    const/4 v6, 0x1

    .line 38
    if-eqz v5, :cond_2

    .line 39
    .line 40
    if-ne v5, v6, :cond_1

    .line 41
    .line 42
    iget-object v1, v4, Lqa0;->i:Ld10;

    .line 43
    .line 44
    invoke-static {v0}, Lbd2;->x(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-object v1

    .line 48
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw v0

    .line 56
    :cond_2
    invoke-static {v0}, Lbd2;->x(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, v2, Ld10;->d:Ljava/lang/String;

    .line 60
    .line 61
    const-string v5, "00:00:00:00:00:00"

    .line 62
    .line 63
    invoke-static {v0, v5}, Li30;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    const-string v5, "substring(...)"

    .line 68
    .line 69
    const/4 v7, 0x0

    .line 70
    const-string v8, "getString(...)"

    .line 71
    .line 72
    const/4 v9, 0x0

    .line 73
    if-nez v0, :cond_6

    .line 74
    .line 75
    iget-object v0, v2, Ld10;->d:Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-lez v0, :cond_6

    .line 82
    .line 83
    iget-object v0, v1, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->c0:Lvq2;

    .line 84
    .line 85
    if-eqz v0, :cond_5

    .line 86
    .line 87
    iget-object v10, v2, Ld10;->d:Ljava/lang/String;

    .line 88
    .line 89
    const-string v11, "hw"

    .line 90
    .line 91
    invoke-static {v10, v11}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    :try_start_0
    const-string v11, ":"

    .line 95
    .line 96
    invoke-static {v10, v11, v3}, Lsy0;->H(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v10

    .line 100
    const/4 v11, 0x6

    .line 101
    invoke-virtual {v10, v7, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v10

    .line 105
    invoke-static {v10, v5}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    const/16 v11, 0x10

    .line 109
    .line 110
    invoke-static {v10, v11}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    .line 111
    .line 112
    .line 113
    move-result-wide v10

    .line 114
    iget-object v0, v0, Lvq2;->h:Ljava/lang/Object;

    .line 115
    .line 116
    move-object v12, v0

    .line 117
    check-cast v12, Landroid/database/sqlite/SQLiteDatabase;

    .line 118
    .line 119
    if-eqz v12, :cond_4

    .line 120
    .line 121
    const-string v13, "oui"

    .line 122
    .line 123
    const-string v0, "vendor"

    .line 124
    .line 125
    filled-new-array {v0}, [Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v14

    .line 129
    const-string v15, "mac=?"

    .line 130
    .line 131
    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    filled-new-array {v0}, [Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v16

    .line 139
    const/16 v19, 0x0

    .line 140
    .line 141
    const/16 v20, 0x0

    .line 142
    .line 143
    const/16 v17, 0x0

    .line 144
    .line 145
    const/16 v18, 0x0

    .line 146
    .line 147
    invoke-virtual/range {v12 .. v20}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    const-string v10, "query(...)"

    .line 152
    .line 153
    invoke-static {v0, v10}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    .line 157
    .line 158
    .line 159
    move-result v10

    .line 160
    if-eqz v10, :cond_3

    .line 161
    .line 162
    invoke-interface {v0, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v10

    .line 166
    invoke-static {v10, v8}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    move-object v3, v10

    .line 170
    goto :goto_1

    .line 171
    :catch_0
    move-exception v0

    .line 172
    goto :goto_2

    .line 173
    :cond_3
    :goto_1
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 174
    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_4
    const-string v0, "db"

    .line 178
    .line 179
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    throw v9
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 183
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    :goto_3
    iput-object v3, v2, Ld10;->e:Ljava/lang/String;

    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_5
    const-string v0, "vendorDb"

    .line 190
    .line 191
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    throw v9

    .line 195
    :cond_6
    :goto_4
    iget-object v0, v2, Ld10;->b:Ljava/lang/String;

    .line 196
    .line 197
    invoke-static {v0}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    const-string v3, "getByName(...)"

    .line 202
    .line 203
    invoke-static {v0, v3}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    iget-object v3, v1, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->P:Ljava/lang/String;

    .line 207
    .line 208
    invoke-static {v0, v3}, Lyb;->o(Ljava/net/InetAddress;Ljava/lang/String;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    const-string v3, "."

    .line 213
    .line 214
    invoke-virtual {v0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    if-eqz v3, :cond_8

    .line 219
    .line 220
    const/16 v3, 0x2e

    .line 221
    .line 222
    invoke-static {v0}, Lsy0;->z(Ljava/lang/CharSequence;)I

    .line 223
    .line 224
    .line 225
    move-result v10

    .line 226
    invoke-virtual {v0, v3, v10}, Ljava/lang/String;->lastIndexOf(II)I

    .line 227
    .line 228
    .line 229
    move-result v3

    .line 230
    const/4 v10, -0x1

    .line 231
    if-ne v3, v10, :cond_7

    .line 232
    .line 233
    goto :goto_5

    .line 234
    :cond_7
    invoke-virtual {v0, v7, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-static {v0, v5}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    :cond_8
    :goto_5
    iput-object v0, v2, Ld10;->c:Ljava/lang/String;

    .line 242
    .line 243
    iget-object v0, v1, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->P:Ljava/lang/String;

    .line 244
    .line 245
    iget-object v3, v2, Ld10;->b:Ljava/lang/String;

    .line 246
    .line 247
    invoke-static {v0, v3}, Li30;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    const-string v3, "<set-?>"

    .line 252
    .line 253
    const-string v5, ")"

    .line 254
    .line 255
    const-string v7, " ("

    .line 256
    .line 257
    if-eqz v0, :cond_b

    .line 258
    .line 259
    sget-object v0, Lro;->h:Lro;

    .line 260
    .line 261
    iput-object v0, v2, Ld10;->a:Lro;

    .line 262
    .line 263
    const v0, 0x7f0800b2

    .line 264
    .line 265
    .line 266
    iput v0, v2, Ld10;->f:I

    .line 267
    .line 268
    new-instance v0, Ljava/util/ArrayList;

    .line 269
    .line 270
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 271
    .line 272
    .line 273
    iput-object v0, v2, Ld10;->g:Ljava/util/ArrayList;

    .line 274
    .line 275
    new-instance v4, Ljava/lang/Integer;

    .line 276
    .line 277
    const/16 v6, 0x50

    .line 278
    .line 279
    invoke-direct {v4, v6}, Ljava/lang/Integer;-><init>(I)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    iget-object v0, v2, Ld10;->c:Ljava/lang/String;

    .line 286
    .line 287
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    const v4, 0x7f120145

    .line 292
    .line 293
    .line 294
    if-nez v0, :cond_9

    .line 295
    .line 296
    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-static {v0, v8}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    iput-object v0, v2, Ld10;->c:Ljava/lang/String;

    .line 304
    .line 305
    goto/16 :goto_7

    .line 306
    .line 307
    :cond_9
    iget-object v0, v2, Ld10;->c:Ljava/lang/String;

    .line 308
    .line 309
    iget-object v6, v2, Ld10;->b:Ljava/lang/String;

    .line 310
    .line 311
    invoke-static {v0, v6}, Li30;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result v0

    .line 315
    if-eqz v0, :cond_a

    .line 316
    .line 317
    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    invoke-static {v0, v8}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    iput-object v0, v2, Ld10;->c:Ljava/lang/String;

    .line 325
    .line 326
    goto/16 :goto_7

    .line 327
    .line 328
    :cond_a
    iget-object v0, v2, Ld10;->c:Ljava/lang/String;

    .line 329
    .line 330
    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    new-instance v4, Ljava/lang/StringBuilder;

    .line 335
    .line 336
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    invoke-static {v0, v3}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    iput-object v0, v2, Ld10;->c:Ljava/lang/String;

    .line 359
    .line 360
    goto/16 :goto_7

    .line 361
    .line 362
    :cond_b
    iget-object v0, v1, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->R:Ljava/lang/String;

    .line 363
    .line 364
    iget-object v8, v2, Ld10;->b:Ljava/lang/String;

    .line 365
    .line 366
    invoke-static {v0, v8}, Li30;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 367
    .line 368
    .line 369
    move-result v0

    .line 370
    if-eqz v0, :cond_d

    .line 371
    .line 372
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 373
    .line 374
    invoke-static {v0}, Li30;->j(Ljava/lang/Object;)V

    .line 375
    .line 376
    .line 377
    invoke-static {v0}, Lum;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    invoke-static {v0, v3}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    iput-object v0, v2, Ld10;->e:Ljava/lang/String;

    .line 385
    .line 386
    iget-object v0, v2, Ld10;->c:Ljava/lang/String;

    .line 387
    .line 388
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 389
    .line 390
    .line 391
    move-result v0

    .line 392
    const v4, 0x7f120156

    .line 393
    .line 394
    .line 395
    if-nez v0, :cond_c

    .line 396
    .line 397
    invoke-virtual {v1}, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->B()Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v1

    .line 405
    new-instance v4, Ljava/lang/StringBuilder;

    .line 406
    .line 407
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 411
    .line 412
    .line 413
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 420
    .line 421
    .line 422
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    invoke-static {v0, v3}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 427
    .line 428
    .line 429
    iput-object v0, v2, Ld10;->c:Ljava/lang/String;

    .line 430
    .line 431
    goto :goto_6

    .line 432
    :cond_c
    iget-object v0, v2, Ld10;->c:Ljava/lang/String;

    .line 433
    .line 434
    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v1

    .line 438
    new-instance v4, Ljava/lang/StringBuilder;

    .line 439
    .line 440
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 450
    .line 451
    .line 452
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    invoke-static {v0, v3}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    iput-object v0, v2, Ld10;->c:Ljava/lang/String;

    .line 463
    .line 464
    :goto_6
    const v0, 0x7f0800b1

    .line 465
    .line 466
    .line 467
    iput v0, v2, Ld10;->f:I

    .line 468
    .line 469
    sget-object v0, Lro;->k:Lro;

    .line 470
    .line 471
    iput-object v0, v2, Ld10;->a:Lro;

    .line 472
    .line 473
    goto :goto_7

    .line 474
    :cond_d
    new-instance v0, Lpa0;

    .line 475
    .line 476
    const/4 v3, 0x2

    .line 477
    invoke-direct {v0, v2, v1, v9, v3}, Lpa0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Loj;I)V

    .line 478
    .line 479
    .line 480
    iput-object v2, v4, Lqa0;->i:Ld10;

    .line 481
    .line 482
    iput v6, v4, Lqa0;->l:I

    .line 483
    .line 484
    new-instance v1, Lht0;

    .line 485
    .line 486
    invoke-interface {v4}, Loj;->getContext()Lhk;

    .line 487
    .line 488
    .line 489
    move-result-object v3

    .line 490
    invoke-direct {v1, v3, v4}, Lht0;-><init>(Lhk;Lqj;)V

    .line 491
    .line 492
    .line 493
    invoke-static {v1, v1, v0}, Lyb;->r(Lht0;Lht0;Lhy;)Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    sget-object v1, Lrk;->f:Lrk;

    .line 498
    .line 499
    if-ne v0, v1, :cond_e

    .line 500
    .line 501
    move-object v2, v1

    .line 502
    :cond_e
    :goto_7
    return-object v2
.end method


# virtual methods
.method public final A()V
    .locals 2

    .line 1
    new-instance v0, Lla0;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, p0, v1}, Lla0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final B()Ljava/lang/String;
    .locals 5

    .line 1
    const v0, 0x7f120157

    .line 2
    .line 3
    .line 4
    :try_start_0
    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 5
    .line 6
    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    const-string v4, "device_name"

    .line 13
    .line 14
    invoke-static {v3, v4}, Landroid/provider/Settings$Global;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-static {v3}, Li30;->j(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-lez v4, :cond_0

    .line 26
    .line 27
    return-object v3

    .line 28
    :cond_0
    invoke-static {v2}, Li30;->j(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-lez v3, :cond_1

    .line 36
    .line 37
    invoke-static {v2}, Lum;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    return-object v0

    .line 42
    :cond_1
    invoke-static {v1}, Li30;->j(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-lez v2, :cond_2

    .line 50
    .line 51
    invoke-static {v1}, Lum;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    return-object v0

    .line 56
    :cond_2
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-static {v1}, Li30;->j(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    .line 62
    .line 63
    return-object v1

    .line 64
    :catch_0
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    const-string v1, "getString(...)"

    .line 69
    .line 70
    invoke-static {v0, v1}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-object v0
.end method

.method public final C()Landroid/content/SharedPreferences;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->E:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "pref"

    .line 7
    .line 8
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
.end method

.method public final D()V
    .locals 14

    .line 1
    iget-boolean v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->M:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const v3, 0x7f12013f

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-static {v0, v3, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    iget-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C:Lf2;

    .line 26
    .line 27
    const/4 v8, 0x0

    .line 28
    if-eqz v0, :cond_c

    .line 29
    .line 30
    iget-object v0, v0, Lf2;->l:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Landroid/widget/TextView;

    .line 33
    .line 34
    const v3, 0x7f120114

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    const-string v4, "0"

    .line 42
    .line 43
    filled-new-array {v4, v3}, [Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    const v4, 0x7f12012f

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v4, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->N:Ljava/util/ArrayList;

    .line 58
    .line 59
    const-string v3, "hosts"

    .line 60
    .line 61
    if-eqz v0, :cond_b

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_4

    .line 68
    .line 69
    iget-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->O:Lc10;

    .line 70
    .line 71
    if-eqz v0, :cond_3

    .line 72
    .line 73
    iget-object v4, p0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->N:Ljava/util/ArrayList;

    .line 74
    .line 75
    if-eqz v4, :cond_2

    .line 76
    .line 77
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    iget-object v0, v0, Lao0;->f:Lbo0;

    .line 82
    .line 83
    invoke-virtual {v0, v1, v4}, Lbo0;->e(II)V

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->N:Ljava/util/ArrayList;

    .line 87
    .line 88
    if-eqz v0, :cond_1

    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_1
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw v8

    .line 98
    :cond_2
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw v8

    .line 102
    :cond_3
    const-string v0, "hostAdapter"

    .line 103
    .line 104
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw v8

    .line 108
    :cond_4
    :goto_0
    iget-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->T:Ljava/util/ArrayList;

    .line 109
    .line 110
    const-string v3, "hostTypes"

    .line 111
    .line 112
    if-eqz v0, :cond_a

    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-nez v0, :cond_8

    .line 119
    .line 120
    iget-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->U:Lf10;

    .line 121
    .line 122
    if-eqz v0, :cond_7

    .line 123
    .line 124
    iget-object v4, p0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->T:Ljava/util/ArrayList;

    .line 125
    .line 126
    if-eqz v4, :cond_6

    .line 127
    .line 128
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    iget-object v0, v0, Lao0;->f:Lbo0;

    .line 133
    .line 134
    invoke-virtual {v0, v1, v4}, Lbo0;->e(II)V

    .line 135
    .line 136
    .line 137
    iget-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->T:Ljava/util/ArrayList;

    .line 138
    .line 139
    if-eqz v0, :cond_5

    .line 140
    .line 141
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 142
    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_5
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    throw v8

    .line 149
    :cond_6
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    throw v8

    .line 153
    :cond_7
    const-string v0, "hostTypeAdapter"

    .line 154
    .line 155
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw v8

    .line 159
    :cond_8
    :goto_1
    iget-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->R:Ljava/lang/String;

    .line 160
    .line 161
    iget v3, p0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->Q:I

    .line 162
    .line 163
    const-string v4, "ip"

    .line 164
    .line 165
    invoke-static {v0, v4}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    invoke-static {v0}, Lum;->n(Ljava/lang/String;)J

    .line 169
    .line 170
    .line 171
    move-result-wide v4

    .line 172
    rsub-int/lit8 v0, v3, 0x20

    .line 173
    .line 174
    const/16 v6, 0x1f

    .line 175
    .line 176
    const/4 v9, 0x1

    .line 177
    const-wide/16 v10, 0x1

    .line 178
    .line 179
    if-ge v3, v6, :cond_9

    .line 180
    .line 181
    shr-long v6, v4, v0

    .line 182
    .line 183
    shl-long/2addr v6, v0

    .line 184
    add-long/2addr v6, v10

    .line 185
    shl-int v0, v9, v0

    .line 186
    .line 187
    sub-int/2addr v0, v9

    .line 188
    int-to-long v12, v0

    .line 189
    or-long/2addr v12, v6

    .line 190
    sub-long/2addr v12, v10

    .line 191
    goto :goto_2

    .line 192
    :cond_9
    shr-long v6, v4, v0

    .line 193
    .line 194
    shl-long/2addr v6, v0

    .line 195
    shl-int v0, v9, v0

    .line 196
    .line 197
    sub-int/2addr v0, v9

    .line 198
    int-to-long v12, v0

    .line 199
    or-long/2addr v12, v6

    .line 200
    :goto_2
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    new-instance v5, Lbp0;

    .line 213
    .line 214
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 218
    .line 219
    .line 220
    move-result-wide v6

    .line 221
    iput-wide v6, v5, Lbp0;->f:J

    .line 222
    .line 223
    new-instance v0, Lbp0;

    .line 224
    .line 225
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 229
    .line 230
    .line 231
    move-result-wide v6

    .line 232
    iput-wide v6, v0, Lbp0;->f:J

    .line 233
    .line 234
    new-instance v3, Lbp0;

    .line 235
    .line 236
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 240
    .line 241
    .line 242
    move-result-wide v6

    .line 243
    iput-wide v6, v3, Lbp0;->f:J

    .line 244
    .line 245
    new-instance v4, Lbp0;

    .line 246
    .line 247
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 248
    .line 249
    .line 250
    iget-wide v12, v0, Lbp0;->f:J

    .line 251
    .line 252
    sub-long/2addr v6, v12

    .line 253
    add-long/2addr v6, v10

    .line 254
    iput-wide v6, v4, Lbp0;->f:J

    .line 255
    .line 256
    new-instance v6, Lso1;

    .line 257
    .line 258
    const/4 v7, 0x5

    .line 259
    invoke-direct {v6, v7, v1}, Lso1;-><init>(IZ)V

    .line 260
    .line 261
    .line 262
    new-instance v10, Lap0;

    .line 263
    .line 264
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 265
    .line 266
    .line 267
    sget-object v7, Lfp;->a:Lon;

    .line 268
    .line 269
    sget-object v7, Lza0;->a:Li00;

    .line 270
    .line 271
    invoke-static {v7}, Lwl2;->a(Lhk;)Lmj;

    .line 272
    .line 273
    .line 274
    move-result-object v11

    .line 275
    new-instance v12, Lga0;

    .line 276
    .line 277
    invoke-direct {v12, v1, p0}, Lga0;-><init>(ILjava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    move-object v1, v0

    .line 281
    new-instance v0, Lya0;

    .line 282
    .line 283
    const/4 v7, 0x0

    .line 284
    move-object v2, v5

    .line 285
    move-object v5, p0

    .line 286
    invoke-direct/range {v0 .. v7}, Lya0;-><init>(Lbp0;Lbp0;Lbp0;Lbp0;Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;Lso1;Loj;)V

    .line 287
    .line 288
    .line 289
    new-instance v5, Lm;

    .line 290
    .line 291
    invoke-direct {v5, v9, p0}, Lm;-><init>(ILjava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    new-instance v1, Lha0;

    .line 295
    .line 296
    invoke-direct {v1, p0, v10, v4}, Lha0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;Lap0;Lbp0;)V

    .line 297
    .line 298
    .line 299
    move-object v3, v0

    .line 300
    new-instance v0, Lnm;

    .line 301
    .line 302
    const/4 v6, 0x0

    .line 303
    move-object v2, p0

    .line 304
    move-object v4, v1

    .line 305
    move-object v1, v12

    .line 306
    invoke-direct/range {v0 .. v6}, Lnm;-><init>(Lga0;Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;Lya0;Lha0;Lm;Loj;)V

    .line 307
    .line 308
    .line 309
    const/4 v1, 0x3

    .line 310
    invoke-static {v11, v8, v0, v1}, Lgi2;->q(Lqk;Lhk;Lhy;I)Lyn;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    iput-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->Z:Lyn;

    .line 315
    .line 316
    return-void

    .line 317
    :cond_a
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    throw v8

    .line 321
    :cond_b
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    throw v8

    .line 325
    :cond_c
    const-string v0, "binding"

    .line 326
    .line 327
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    throw v8
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-super/range {p0 .. p1}, Li5;->onCreate(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lu5;->f:Ls5;

    .line 7
    .line 8
    sget v1, Lz41;->a:I

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const v2, 0x7f0c001d

    .line 15
    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-virtual {v1, v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const v2, 0x7f09005a

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    check-cast v5, Lcom/google/android/material/card/MaterialCardView;

    .line 31
    .line 32
    const-string v6, "Missing required view with ID: "

    .line 33
    .line 34
    if-eqz v5, :cond_14

    .line 35
    .line 36
    const v2, 0x7f09005b

    .line 37
    .line 38
    .line 39
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    check-cast v7, Lcom/google/android/material/card/MaterialCardView;

    .line 44
    .line 45
    if-eqz v7, :cond_14

    .line 46
    .line 47
    const v2, 0x7f090063

    .line 48
    .line 49
    .line 50
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    check-cast v8, Landroid/widget/FrameLayout;

    .line 55
    .line 56
    if-eqz v8, :cond_14

    .line 57
    .line 58
    const v2, 0x7f09007c

    .line 59
    .line 60
    .line 61
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object v9

    .line 65
    check-cast v9, Lcom/google/android/material/bottomappbar/BottomAppBar;

    .line 66
    .line 67
    if-eqz v9, :cond_14

    .line 68
    .line 69
    const v2, 0x7f0900bc

    .line 70
    .line 71
    .line 72
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 73
    .line 74
    .line 75
    move-result-object v10

    .line 76
    if-eqz v10, :cond_14

    .line 77
    .line 78
    const v2, 0x7f0900a0

    .line 79
    .line 80
    .line 81
    invoke-static {v10, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object v11

    .line 85
    move-object v13, v11

    .line 86
    check-cast v13, Landroid/widget/Button;

    .line 87
    .line 88
    if-eqz v13, :cond_13

    .line 89
    .line 90
    const v2, 0x7f0900e2

    .line 91
    .line 92
    .line 93
    invoke-static {v10, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 94
    .line 95
    .line 96
    move-result-object v14

    .line 97
    if-eqz v14, :cond_13

    .line 98
    .line 99
    const v2, 0x7f09011e

    .line 100
    .line 101
    .line 102
    invoke-static {v10, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 103
    .line 104
    .line 105
    move-result-object v11

    .line 106
    check-cast v11, Landroidx/constraintlayout/widget/Guideline;

    .line 107
    .line 108
    if-eqz v11, :cond_13

    .line 109
    .line 110
    const v2, 0x7f09011f

    .line 111
    .line 112
    .line 113
    invoke-static {v10, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 114
    .line 115
    .line 116
    move-result-object v11

    .line 117
    check-cast v11, Landroidx/constraintlayout/widget/Guideline;

    .line 118
    .line 119
    if-eqz v11, :cond_13

    .line 120
    .line 121
    const v2, 0x7f09013f

    .line 122
    .line 123
    .line 124
    invoke-static {v10, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 125
    .line 126
    .line 127
    move-result-object v11

    .line 128
    move-object v15, v11

    .line 129
    check-cast v15, Landroid/widget/ImageView;

    .line 130
    .line 131
    if-eqz v15, :cond_13

    .line 132
    .line 133
    const v2, 0x7f090140

    .line 134
    .line 135
    .line 136
    invoke-static {v10, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 137
    .line 138
    .line 139
    move-result-object v11

    .line 140
    check-cast v11, Landroid/widget/ImageView;

    .line 141
    .line 142
    if-eqz v11, :cond_13

    .line 143
    .line 144
    const v2, 0x7f090143

    .line 145
    .line 146
    .line 147
    invoke-static {v10, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 148
    .line 149
    .line 150
    move-result-object v11

    .line 151
    move-object/from16 v16, v11

    .line 152
    .line 153
    check-cast v16, Landroid/widget/ImageView;

    .line 154
    .line 155
    if-eqz v16, :cond_13

    .line 156
    .line 157
    const v2, 0x7f090155

    .line 158
    .line 159
    .line 160
    invoke-static {v10, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 161
    .line 162
    .line 163
    move-result-object v17

    .line 164
    if-eqz v17, :cond_13

    .line 165
    .line 166
    const v2, 0x7f09027c

    .line 167
    .line 168
    .line 169
    invoke-static {v10, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 170
    .line 171
    .line 172
    move-result-object v11

    .line 173
    move-object/from16 v18, v11

    .line 174
    .line 175
    check-cast v18, Landroid/widget/TextView;

    .line 176
    .line 177
    if-eqz v18, :cond_13

    .line 178
    .line 179
    const v2, 0x7f09027d

    .line 180
    .line 181
    .line 182
    invoke-static {v10, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 183
    .line 184
    .line 185
    move-result-object v11

    .line 186
    move-object/from16 v19, v11

    .line 187
    .line 188
    check-cast v19, Landroid/widget/TextView;

    .line 189
    .line 190
    if-eqz v19, :cond_13

    .line 191
    .line 192
    const v2, 0x7f09027e

    .line 193
    .line 194
    .line 195
    invoke-static {v10, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 196
    .line 197
    .line 198
    move-result-object v11

    .line 199
    move-object/from16 v20, v11

    .line 200
    .line 201
    check-cast v20, Landroid/widget/TextView;

    .line 202
    .line 203
    if-eqz v20, :cond_13

    .line 204
    .line 205
    const v2, 0x7f09027f

    .line 206
    .line 207
    .line 208
    invoke-static {v10, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 209
    .line 210
    .line 211
    move-result-object v11

    .line 212
    move-object/from16 v21, v11

    .line 213
    .line 214
    check-cast v21, Landroid/widget/TextView;

    .line 215
    .line 216
    if-eqz v21, :cond_13

    .line 217
    .line 218
    const v2, 0x7f090282

    .line 219
    .line 220
    .line 221
    invoke-static {v10, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 222
    .line 223
    .line 224
    move-result-object v11

    .line 225
    check-cast v11, Landroid/widget/TextView;

    .line 226
    .line 227
    if-eqz v11, :cond_13

    .line 228
    .line 229
    const v2, 0x7f090289

    .line 230
    .line 231
    .line 232
    invoke-static {v10, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 233
    .line 234
    .line 235
    move-result-object v11

    .line 236
    check-cast v11, Landroid/widget/TextView;

    .line 237
    .line 238
    if-eqz v11, :cond_13

    .line 239
    .line 240
    const v2, 0x7f090290

    .line 241
    .line 242
    .line 243
    invoke-static {v10, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 244
    .line 245
    .line 246
    move-result-object v11

    .line 247
    move-object/from16 v22, v11

    .line 248
    .line 249
    check-cast v22, Landroid/widget/TextView;

    .line 250
    .line 251
    if-eqz v22, :cond_13

    .line 252
    .line 253
    const v2, 0x7f090291

    .line 254
    .line 255
    .line 256
    invoke-static {v10, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 257
    .line 258
    .line 259
    move-result-object v11

    .line 260
    move-object/from16 v23, v11

    .line 261
    .line 262
    check-cast v23, Landroid/widget/TextView;

    .line 263
    .line 264
    if-eqz v23, :cond_13

    .line 265
    .line 266
    const v2, 0x7f090292

    .line 267
    .line 268
    .line 269
    invoke-static {v10, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 270
    .line 271
    .line 272
    move-result-object v11

    .line 273
    move-object/from16 v24, v11

    .line 274
    .line 275
    check-cast v24, Landroid/widget/TextView;

    .line 276
    .line 277
    if-eqz v24, :cond_13

    .line 278
    .line 279
    const v2, 0x7f090294

    .line 280
    .line 281
    .line 282
    invoke-static {v10, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 283
    .line 284
    .line 285
    move-result-object v11

    .line 286
    move-object/from16 v25, v11

    .line 287
    .line 288
    check-cast v25, Landroid/widget/TextView;

    .line 289
    .line 290
    if-eqz v25, :cond_13

    .line 291
    .line 292
    const v2, 0x7f09029a

    .line 293
    .line 294
    .line 295
    invoke-static {v10, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 296
    .line 297
    .line 298
    move-result-object v11

    .line 299
    move-object/from16 v26, v11

    .line 300
    .line 301
    check-cast v26, Landroid/widget/TextView;

    .line 302
    .line 303
    if-eqz v26, :cond_13

    .line 304
    .line 305
    new-instance v12, Lxi;

    .line 306
    .line 307
    check-cast v10, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 308
    .line 309
    invoke-direct/range {v12 .. v26}, Lxi;-><init>(Landroid/widget/Button;Landroid/view/View;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 310
    .line 311
    .line 312
    const v2, 0x7f090101

    .line 313
    .line 314
    .line 315
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 316
    .line 317
    .line 318
    move-result-object v10

    .line 319
    check-cast v10, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 320
    .line 321
    if-eqz v10, :cond_14

    .line 322
    .line 323
    const v2, 0x7f090127

    .line 324
    .line 325
    .line 326
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 327
    .line 328
    .line 329
    move-result-object v11

    .line 330
    check-cast v11, Lcom/google/android/material/card/MaterialCardView;

    .line 331
    .line 332
    if-eqz v11, :cond_14

    .line 333
    .line 334
    const v2, 0x7f0901a6

    .line 335
    .line 336
    .line 337
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 338
    .line 339
    .line 340
    move-result-object v13

    .line 341
    check-cast v13, Lcom/github/mikephil/charting/charts/LineChart;

    .line 342
    .line 343
    if-eqz v13, :cond_14

    .line 344
    .line 345
    const v2, 0x7f0901df

    .line 346
    .line 347
    .line 348
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 349
    .line 350
    .line 351
    move-result-object v14

    .line 352
    check-cast v14, Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    .line 353
    .line 354
    if-eqz v14, :cond_14

    .line 355
    .line 356
    const v2, 0x7f0901f4

    .line 357
    .line 358
    .line 359
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 360
    .line 361
    .line 362
    move-result-object v15

    .line 363
    check-cast v15, Landroidx/recyclerview/widget/RecyclerView;

    .line 364
    .line 365
    if-eqz v15, :cond_14

    .line 366
    .line 367
    const v2, 0x7f0901f6

    .line 368
    .line 369
    .line 370
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 371
    .line 372
    .line 373
    move-result-object v16

    .line 374
    move-object/from16 v2, v16

    .line 375
    .line 376
    check-cast v2, Landroidx/recyclerview/widget/RecyclerView;

    .line 377
    .line 378
    if-eqz v2, :cond_12

    .line 379
    .line 380
    move-object/from16 v16, v3

    .line 381
    .line 382
    const v3, 0x7f090274

    .line 383
    .line 384
    .line 385
    invoke-static {v1, v3}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 386
    .line 387
    .line 388
    move-result-object v17

    .line 389
    move-object/from16 v3, v17

    .line 390
    .line 391
    check-cast v3, Landroid/widget/TextView;

    .line 392
    .line 393
    if-eqz v3, :cond_11

    .line 394
    .line 395
    const v4, 0x7f09029f

    .line 396
    .line 397
    .line 398
    invoke-static {v1, v4}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 399
    .line 400
    .line 401
    move-result-object v17

    .line 402
    check-cast v17, Lcom/google/android/material/card/MaterialCardView;

    .line 403
    .line 404
    if-eqz v17, :cond_10

    .line 405
    .line 406
    new-instance v4, Lf2;

    .line 407
    .line 408
    check-cast v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 409
    .line 410
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 411
    .line 412
    .line 413
    iput-object v5, v4, Lf2;->a:Ljava/lang/Object;

    .line 414
    .line 415
    iput-object v7, v4, Lf2;->b:Ljava/lang/Object;

    .line 416
    .line 417
    iput-object v8, v4, Lf2;->d:Ljava/lang/Object;

    .line 418
    .line 419
    iput-object v9, v4, Lf2;->e:Ljava/lang/Object;

    .line 420
    .line 421
    iput-object v12, v4, Lf2;->f:Ljava/lang/Object;

    .line 422
    .line 423
    iput-object v10, v4, Lf2;->g:Ljava/lang/Object;

    .line 424
    .line 425
    iput-object v11, v4, Lf2;->c:Ljava/lang/Object;

    .line 426
    .line 427
    iput-object v13, v4, Lf2;->h:Ljava/lang/Object;

    .line 428
    .line 429
    iput-object v14, v4, Lf2;->i:Ljava/lang/Object;

    .line 430
    .line 431
    iput-object v15, v4, Lf2;->j:Ljava/lang/Object;

    .line 432
    .line 433
    iput-object v2, v4, Lf2;->k:Ljava/lang/Object;

    .line 434
    .line 435
    iput-object v3, v4, Lf2;->l:Ljava/lang/Object;

    .line 436
    .line 437
    iput-object v4, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C:Lf2;

    .line 438
    .line 439
    const-string v2, "getRoot(...)"

    .line 440
    .line 441
    invoke-static {v1, v2}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v0, v1}, Li5;->setContentView(Landroid/view/View;)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 448
    .line 449
    .line 450
    move-result-object v1

    .line 451
    const-string v2, "getApplicationContext(...)"

    .line 452
    .line 453
    invoke-static {v1, v2}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    sget-object v3, Lf20;->h:Lfr;

    .line 457
    .line 458
    invoke-virtual {v3, v1}, Lfr;->e(Landroid/content/Context;)Lf20;

    .line 459
    .line 460
    .line 461
    move-result-object v1

    .line 462
    iput-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->X:Lf20;

    .line 463
    .line 464
    new-instance v3, Lda0;

    .line 465
    .line 466
    invoke-direct {v3, v0}, Lda0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;)V

    .line 467
    .line 468
    .line 469
    invoke-virtual {v1, v0, v3}, Lf20;->g(Li5;Lmz;)V

    .line 470
    .line 471
    .line 472
    invoke-static {v0}, Lgm0;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v1

    .line 476
    const/4 v3, 0x0

    .line 477
    invoke-virtual {v0, v1, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    const-string v3, "getDefaultSharedPreferences(...)"

    .line 482
    .line 483
    invoke-static {v1, v3}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 484
    .line 485
    .line 486
    iput-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->E:Landroid/content/SharedPreferences;

    .line 487
    .line 488
    const-string v1, "connectivity"

    .line 489
    .line 490
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v1

    .line 494
    const-string v3, "null cannot be cast to non-null type android.net.ConnectivityManager"

    .line 495
    .line 496
    invoke-static {v1, v3}, Li30;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 497
    .line 498
    .line 499
    check-cast v1, Landroid/net/ConnectivityManager;

    .line 500
    .line 501
    iput-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->F:Landroid/net/ConnectivityManager;

    .line 502
    .line 503
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 504
    .line 505
    .line 506
    move-result-object v1

    .line 507
    const-string v3, "wifi"

    .line 508
    .line 509
    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v1

    .line 513
    const-string v3, "null cannot be cast to non-null type android.net.wifi.WifiManager"

    .line 514
    .line 515
    invoke-static {v1, v3}, Li30;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 516
    .line 517
    .line 518
    check-cast v1, Landroid/net/wifi/WifiManager;

    .line 519
    .line 520
    iput-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->G:Landroid/net/wifi/WifiManager;

    .line 521
    .line 522
    iget-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C:Lf2;

    .line 523
    .line 524
    const-string v3, "binding"

    .line 525
    .line 526
    if-eqz v1, :cond_f

    .line 527
    .line 528
    iget-object v1, v1, Lf2;->e:Ljava/lang/Object;

    .line 529
    .line 530
    check-cast v1, Lcom/google/android/material/bottomappbar/BottomAppBar;

    .line 531
    .line 532
    new-instance v4, Lea0;

    .line 533
    .line 534
    const/4 v5, 0x4

    .line 535
    invoke-direct {v4, v0, v5}, Lea0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;I)V

    .line 536
    .line 537
    .line 538
    invoke-virtual {v1, v4}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v0}, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->A()V

    .line 542
    .line 543
    .line 544
    new-instance v1, Lt90;

    .line 545
    .line 546
    iget-object v4, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C:Lf2;

    .line 547
    .line 548
    if-eqz v4, :cond_e

    .line 549
    .line 550
    invoke-direct {v1, v0, v4}, Lt90;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;Lf2;)V

    .line 551
    .line 552
    .line 553
    iput-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->I:Lt90;

    .line 554
    .line 555
    iget-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C:Lf2;

    .line 556
    .line 557
    if-eqz v1, :cond_d

    .line 558
    .line 559
    iget-object v1, v1, Lf2;->f:Ljava/lang/Object;

    .line 560
    .line 561
    check-cast v1, Lxi;

    .line 562
    .line 563
    iget-object v1, v1, Lxi;->a:Landroid/widget/Button;

    .line 564
    .line 565
    new-instance v4, Lea0;

    .line 566
    .line 567
    const/4 v5, 0x0

    .line 568
    invoke-direct {v4, v0, v5}, Lea0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;I)V

    .line 569
    .line 570
    .line 571
    invoke-virtual {v1, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 572
    .line 573
    .line 574
    iget-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C:Lf2;

    .line 575
    .line 576
    if-eqz v1, :cond_c

    .line 577
    .line 578
    iget-object v1, v1, Lf2;->g:Ljava/lang/Object;

    .line 579
    .line 580
    check-cast v1, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 581
    .line 582
    const/16 v4, 0x8

    .line 583
    .line 584
    invoke-virtual {v1, v4}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    .line 585
    .line 586
    .line 587
    iget-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C:Lf2;

    .line 588
    .line 589
    if-eqz v1, :cond_b

    .line 590
    .line 591
    iget-object v1, v1, Lf2;->g:Ljava/lang/Object;

    .line 592
    .line 593
    check-cast v1, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 594
    .line 595
    new-instance v4, Lea0;

    .line 596
    .line 597
    const/4 v5, 0x1

    .line 598
    invoke-direct {v4, v0, v5}, Lea0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;I)V

    .line 599
    .line 600
    .line 601
    invoke-virtual {v1, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 602
    .line 603
    .line 604
    new-instance v1, Ljava/util/ArrayList;

    .line 605
    .line 606
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 607
    .line 608
    .line 609
    iput-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->N:Ljava/util/ArrayList;

    .line 610
    .line 611
    new-instance v4, Lc10;

    .line 612
    .line 613
    new-instance v6, Lfa0;

    .line 614
    .line 615
    const/4 v7, 0x0

    .line 616
    invoke-direct {v6, v7, v0}, Lfa0;-><init>(ILjava/lang/Object;)V

    .line 617
    .line 618
    .line 619
    invoke-direct {v4, v1, v6, v7}, Lc10;-><init>(Ljava/util/ArrayList;Lpy;I)V

    .line 620
    .line 621
    .line 622
    iput-object v4, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->O:Lc10;

    .line 623
    .line 624
    iget-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C:Lf2;

    .line 625
    .line 626
    if-eqz v1, :cond_a

    .line 627
    .line 628
    iget-object v1, v1, Lf2;->j:Ljava/lang/Object;

    .line 629
    .line 630
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 631
    .line 632
    invoke-virtual {v1, v5}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 633
    .line 634
    .line 635
    invoke-virtual {v1, v7}, Landroidx/recyclerview/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    .line 636
    .line 637
    .line 638
    iget-object v4, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->O:Lc10;

    .line 639
    .line 640
    if-eqz v4, :cond_9

    .line 641
    .line 642
    invoke-virtual {v1, v4}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Lao0;)V

    .line 643
    .line 644
    .line 645
    new-instance v1, Ljava/util/ArrayList;

    .line 646
    .line 647
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 648
    .line 649
    .line 650
    iput-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->T:Ljava/util/ArrayList;

    .line 651
    .line 652
    new-instance v1, Lf10;

    .line 653
    .line 654
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 655
    .line 656
    .line 657
    move-result-object v4

    .line 658
    invoke-static {v4, v2}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 659
    .line 660
    .line 661
    iget-object v2, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->T:Ljava/util/ArrayList;

    .line 662
    .line 663
    if-eqz v2, :cond_8

    .line 664
    .line 665
    invoke-direct {v1, v4, v2}, Lf10;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V

    .line 666
    .line 667
    .line 668
    iput-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->U:Lf10;

    .line 669
    .line 670
    iget-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C:Lf2;

    .line 671
    .line 672
    if-eqz v1, :cond_7

    .line 673
    .line 674
    iget-object v1, v1, Lf2;->k:Ljava/lang/Object;

    .line 675
    .line 676
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 677
    .line 678
    const/4 v3, 0x0

    .line 679
    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 680
    .line 681
    .line 682
    iget-object v2, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->U:Lf10;

    .line 683
    .line 684
    if-eqz v2, :cond_6

    .line 685
    .line 686
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Lao0;)V

    .line 687
    .line 688
    .line 689
    new-instance v1, Lvq2;

    .line 690
    .line 691
    invoke-direct {v1, v0}, Lvq2;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;)V

    .line 692
    .line 693
    .line 694
    iget-object v2, v1, Lvq2;->g:Ljava/lang/Object;

    .line 695
    .line 696
    check-cast v2, Lah0;

    .line 697
    .line 698
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 699
    .line 700
    .line 701
    move-result-object v2

    .line 702
    const-string v3, "getWritableDatabase(...)"

    .line 703
    .line 704
    invoke-static {v2, v3}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 705
    .line 706
    .line 707
    iput-object v2, v1, Lvq2;->h:Ljava/lang/Object;

    .line 708
    .line 709
    iput-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->c0:Lvq2;

    .line 710
    .line 711
    new-instance v1, Lv8;

    .line 712
    .line 713
    sget-object v2, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->d0:[I

    .line 714
    .line 715
    invoke-direct {v1, v2}, Lv8;-><init>([I)V

    .line 716
    .line 717
    .line 718
    iget-object v2, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->b0:Ljava/util/ArrayList;

    .line 719
    .line 720
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 721
    .line 722
    .line 723
    new-instance v1, Lvb;

    .line 724
    .line 725
    const/4 v3, 0x0

    .line 726
    invoke-direct {v1, v0, v3}, Lvb;-><init>(Landroid/content/Context;I)V

    .line 727
    .line 728
    .line 729
    invoke-virtual {v1}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 730
    .line 731
    .line 732
    move-result-object v2

    .line 733
    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 734
    .line 735
    .line 736
    move-result-object v2

    .line 737
    const v4, 0x7f0401db

    .line 738
    .line 739
    .line 740
    filled-new-array {v4}, [I

    .line 741
    .line 742
    .line 743
    move-result-object v4

    .line 744
    invoke-virtual {v2, v4}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 745
    .line 746
    .line 747
    move-result-object v2

    .line 748
    invoke-virtual {v2, v3, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 749
    .line 750
    .line 751
    move-result v4

    .line 752
    iput-boolean v4, v1, Lvb;->t:Z

    .line 753
    .line 754
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 755
    .line 756
    .line 757
    iput-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->W:Lvb;

    .line 758
    .line 759
    const v2, 0x7f0c0026

    .line 760
    .line 761
    .line 762
    invoke-virtual {v1, v2}, Lvb;->setContentView(I)V

    .line 763
    .line 764
    .line 765
    iget-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->W:Lvb;

    .line 766
    .line 767
    if-eqz v1, :cond_5

    .line 768
    .line 769
    iput-boolean v5, v1, Lvb;->o:Z

    .line 770
    .line 771
    new-instance v2, Lx00;

    .line 772
    .line 773
    invoke-direct {v2, v5}, Lx00;-><init>(I)V

    .line 774
    .line 775
    .line 776
    invoke-virtual {v1, v2}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 777
    .line 778
    .line 779
    if-eqz p1, :cond_0

    .line 780
    .line 781
    :goto_0
    goto :goto_1

    .line 782
    :cond_0
    invoke-virtual {v0}, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C()Landroid/content/SharedPreferences;

    .line 783
    .line 784
    .line 785
    move-result-object v1

    .line 786
    const-string v2, "ratedialog"

    .line 787
    .line 788
    invoke-interface {v1, v2, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 789
    .line 790
    .line 791
    move-result v1

    .line 792
    if-nez v1, :cond_1

    .line 793
    .line 794
    goto :goto_0

    .line 795
    :cond_1
    invoke-virtual {v0}, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C()Landroid/content/SharedPreferences;

    .line 796
    .line 797
    .line 798
    move-result-object v1

    .line 799
    const-string v2, "date_first_launch"

    .line 800
    .line 801
    const-wide/16 v3, 0x0

    .line 802
    .line 803
    invoke-interface {v1, v2, v3, v4}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 804
    .line 805
    .line 806
    move-result-wide v6

    .line 807
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 808
    .line 809
    .line 810
    move-result-wide v8

    .line 811
    cmp-long v1, v6, v3

    .line 812
    .line 813
    if-nez v1, :cond_3

    .line 814
    .line 815
    invoke-virtual {v0}, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C()Landroid/content/SharedPreferences;

    .line 816
    .line 817
    .line 818
    move-result-object v1

    .line 819
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 820
    .line 821
    .line 822
    move-result-object v1

    .line 823
    invoke-interface {v1, v2, v8, v9}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 824
    .line 825
    .line 826
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 827
    .line 828
    .line 829
    :cond_2
    :goto_1
    const/4 v5, 0x0

    .line 830
    goto :goto_2

    .line 831
    :cond_3
    const v1, 0xa4cb800

    .line 832
    .line 833
    .line 834
    int-to-long v1, v1

    .line 835
    add-long/2addr v6, v1

    .line 836
    cmp-long v1, v8, v6

    .line 837
    .line 838
    if-ltz v1, :cond_2

    .line 839
    .line 840
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 841
    .line 842
    .line 843
    move-result v1

    .line 844
    if-eqz v1, :cond_4

    .line 845
    .line 846
    goto :goto_0

    .line 847
    :cond_4
    new-instance v1, Landroid/app/Dialog;

    .line 848
    .line 849
    const v2, 0x7f13012f

    .line 850
    .line 851
    .line 852
    invoke-direct {v1, v0, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 853
    .line 854
    .line 855
    invoke-virtual {v1, v5}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 856
    .line 857
    .line 858
    const v2, 0x7f0c003d

    .line 859
    .line 860
    .line 861
    invoke-virtual {v1, v2}, Landroid/app/Dialog;->setContentView(I)V

    .line 862
    .line 863
    .line 864
    const/4 v3, 0x0

    .line 865
    invoke-virtual {v1, v3}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 866
    .line 867
    .line 868
    const v2, 0x7f090091

    .line 869
    .line 870
    .line 871
    invoke-virtual {v1, v2}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 872
    .line 873
    .line 874
    move-result-object v2

    .line 875
    check-cast v2, Landroid/widget/Button;

    .line 876
    .line 877
    const v3, 0x7f090099

    .line 878
    .line 879
    .line 880
    invoke-virtual {v1, v3}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 881
    .line 882
    .line 883
    move-result-object v3

    .line 884
    check-cast v3, Landroid/widget/Button;

    .line 885
    .line 886
    const v4, 0x7f0900a7

    .line 887
    .line 888
    .line 889
    invoke-virtual {v1, v4}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 890
    .line 891
    .line 892
    move-result-object v4

    .line 893
    check-cast v4, Landroid/widget/CheckBox;

    .line 894
    .line 895
    new-instance v5, La10;

    .line 896
    .line 897
    const/4 v6, 0x2

    .line 898
    invoke-direct {v5, v4, v0, v1, v6}, La10;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 899
    .line 900
    .line 901
    invoke-virtual {v2, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 902
    .line 903
    .line 904
    new-instance v2, Lia0;

    .line 905
    .line 906
    const/4 v5, 0x0

    .line 907
    invoke-direct {v2, v0, v1, v5}, Lia0;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 908
    .line 909
    .line 910
    invoke-virtual {v3, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 911
    .line 912
    .line 913
    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    .line 914
    .line 915
    .line 916
    :goto_2
    new-instance v1, Landroid/os/Handler;

    .line 917
    .line 918
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 919
    .line 920
    .line 921
    move-result-object v2

    .line 922
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 923
    .line 924
    .line 925
    new-instance v2, Lla0;

    .line 926
    .line 927
    invoke-direct {v2, v0, v5}, Lla0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;I)V

    .line 928
    .line 929
    .line 930
    const-wide/16 v3, 0x1b58

    .line 931
    .line 932
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 933
    .line 934
    .line 935
    return-void

    .line 936
    :cond_5
    const-string v1, "bottomSheetDialog"

    .line 937
    .line 938
    invoke-static {v1}, Li30;->S(Ljava/lang/String;)V

    .line 939
    .line 940
    .line 941
    throw v16

    .line 942
    :cond_6
    const-string v1, "hostTypeAdapter"

    .line 943
    .line 944
    invoke-static {v1}, Li30;->S(Ljava/lang/String;)V

    .line 945
    .line 946
    .line 947
    throw v16

    .line 948
    :cond_7
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 949
    .line 950
    .line 951
    throw v16

    .line 952
    :cond_8
    const-string v1, "hostTypes"

    .line 953
    .line 954
    invoke-static {v1}, Li30;->S(Ljava/lang/String;)V

    .line 955
    .line 956
    .line 957
    throw v16

    .line 958
    :cond_9
    const-string v1, "hostAdapter"

    .line 959
    .line 960
    invoke-static {v1}, Li30;->S(Ljava/lang/String;)V

    .line 961
    .line 962
    .line 963
    throw v16

    .line 964
    :cond_a
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 965
    .line 966
    .line 967
    throw v16

    .line 968
    :cond_b
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 969
    .line 970
    .line 971
    throw v16

    .line 972
    :cond_c
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 973
    .line 974
    .line 975
    throw v16

    .line 976
    :cond_d
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 977
    .line 978
    .line 979
    throw v16

    .line 980
    :cond_e
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 981
    .line 982
    .line 983
    throw v16

    .line 984
    :cond_f
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 985
    .line 986
    .line 987
    throw v16

    .line 988
    :cond_10
    move v2, v4

    .line 989
    goto :goto_3

    .line 990
    :cond_11
    const v2, 0x7f090274

    .line 991
    .line 992
    .line 993
    goto :goto_3

    .line 994
    :cond_12
    const v2, 0x7f0901f6

    .line 995
    .line 996
    .line 997
    goto :goto_3

    .line 998
    :cond_13
    invoke-virtual {v10}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 999
    .line 1000
    .line 1001
    move-result-object v1

    .line 1002
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v1

    .line 1006
    new-instance v2, Ljava/lang/NullPointerException;

    .line 1007
    .line 1008
    invoke-virtual {v6, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v1

    .line 1012
    invoke-direct {v2, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 1013
    .line 1014
    .line 1015
    throw v2

    .line 1016
    :cond_14
    :goto_3
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v1

    .line 1020
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v1

    .line 1024
    new-instance v2, Ljava/lang/NullPointerException;

    .line 1025
    .line 1026
    invoke-virtual {v6, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v1

    .line 1030
    invoke-direct {v2, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 1031
    .line 1032
    .line 1033
    throw v2
.end method

.method public final onPause()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->H:Ljava/util/Timer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "chartTimer"

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    :try_start_1
    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->H:Ljava/util/Timer;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/Timer;->purge()I

    .line 16
    .line 17
    .line 18
    goto :goto_1

    .line 19
    :catch_0
    move-exception v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {v2}, Li30;->S(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v1

    .line 25
    :cond_1
    invoke-static {v2}, Li30;->S(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 29
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 30
    .line 31
    .line 32
    :goto_1
    :try_start_2
    iget-boolean v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->a0:Z

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->z()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 37
    .line 38
    .line 39
    goto :goto_2

    .line 40
    :catch_1
    move-exception v0

    .line 41
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 42
    .line 43
    .line 44
    :cond_2
    :goto_2
    invoke-super {p0}, Li5;->onPause()V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final onResume()V
    .locals 9

    .line 1
    invoke-super {p0}, Li5;->onResume()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->F:Landroid/net/ConnectivityManager;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v1, Landroid/net/NetworkRequest$Builder;

    .line 9
    .line 10
    invoke-direct {v1}, Landroid/net/NetworkRequest$Builder;-><init>()V

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-virtual {v1, v2}, Landroid/net/NetworkRequest$Builder;->addTransportType(I)Landroid/net/NetworkRequest$Builder;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v2}, Landroid/net/NetworkRequest$Builder;->addTransportType(I)Landroid/net/NetworkRequest$Builder;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v2, 0x2

    .line 24
    invoke-virtual {v1, v2}, Landroid/net/NetworkRequest$Builder;->addTransportType(I)Landroid/net/NetworkRequest$Builder;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const-string v2, "build(...)"

    .line 33
    .line 34
    invoke-static {v1, v2}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v2, p0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->D:Lra0;

    .line 38
    .line 39
    invoke-virtual {v0, v1, v2}, Landroid/net/ConnectivityManager;->registerNetworkCallback(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 40
    .line 41
    .line 42
    new-instance v4, Lua0;

    .line 43
    .line 44
    invoke-direct {v4, p0}, Lua0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;)V

    .line 45
    .line 46
    .line 47
    new-instance v3, Ljava/util/Timer;

    .line 48
    .line 49
    invoke-direct {v3}, Ljava/util/Timer;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object v3, p0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->H:Ljava/util/Timer;

    .line 53
    .line 54
    const-wide/16 v5, 0x64

    .line 55
    .line 56
    const-wide/16 v7, 0x7d0

    .line 57
    .line 58
    invoke-virtual/range {v3 .. v8}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_0
    const-string v0, "conMgr"

    .line 63
    .line 64
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const/4 v0, 0x0

    .line 68
    throw v0
.end method

.method public final onStop()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->F:Landroid/net/ConnectivityManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->D:Lra0;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const-string v0, "conMgr"

    .line 12
    .line 13
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    :catch_0
    :goto_0
    invoke-super {p0}, Li5;->onStop()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final z()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->a0:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const v2, 0x7f120152

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-static {v0, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 22
    .line 23
    .line 24
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->Z:Lyn;

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    new-instance v3, Lx30;

    .line 30
    .line 31
    invoke-virtual {v0}, Ln;->q()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-direct {v3, v4, v2, v0}, Lx30;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lg40;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v3}, Lg40;->o(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const-string v0, "job"

    .line 43
    .line 44
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    :catch_0
    move-exception v0

    .line 49
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 50
    .line 51
    .line 52
    :goto_0
    new-instance v0, Lna0;

    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    invoke-direct {v0, v1, p0, v2}, Lna0;-><init>(ZLcom/phuongpn/whousemywifi/networkscanner/MainActivity;I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method
