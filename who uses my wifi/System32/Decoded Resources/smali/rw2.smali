.class public final Lrw2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lwm2;
.implements Ljo2;
.implements Ltn2;


# instance fields
.field public final f:Lzw2;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public i:I

.field public j:Lqw2;

.field public k:Lrm2;

.field public l:Lnx2;

.field public m:Ljava/lang/String;

.field public n:Ljava/lang/String;

.field public o:Ljava/lang/String;

.field public p:Lorg/json/JSONObject;

.field public q:Lorg/json/JSONObject;

.field public r:Z

.field public s:Z

.field public t:Z


# direct methods
.method public constructor <init>(Lzw2;Ll83;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lrw2;->m:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v0, p0, Lrw2;->n:Ljava/lang/String;

    .line 9
    .line 10
    iput-object v0, p0, Lrw2;->o:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p1, p0, Lrw2;->f:Lzw2;

    .line 13
    .line 14
    iput-object p3, p0, Lrw2;->h:Ljava/lang/String;

    .line 15
    .line 16
    iget-object p1, p2, Ll83;->g:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p1, p0, Lrw2;->g:Ljava/lang/String;

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    iput p1, p0, Lrw2;->i:I

    .line 22
    .line 23
    sget-object p1, Lqw2;->f:Lqw2;

    .line 24
    .line 25
    iput-object p1, p0, Lrw2;->j:Lqw2;

    .line 26
    .line 27
    return-void
.end method

.method public static c(Lnx2;)Lorg/json/JSONObject;
    .locals 3

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "errorDomain"

    .line 7
    .line 8
    iget-object v2, p0, Lnx2;->h:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    const-string v1, "errorCode"

    .line 14
    .line 15
    iget v2, p0, Lnx2;->f:I

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 18
    .line 19
    .line 20
    const-string v1, "errorDescription"

    .line 21
    .line 22
    iget-object v2, p0, Lnx2;->g:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, Lnx2;->i:Lnx2;

    .line 28
    .line 29
    if-nez p0, :cond_0

    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-static {p0}, Lrw2;->c(Lnx2;)Lorg/json/JSONObject;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    :goto_0
    const-string v1, "underlyingError"

    .line 38
    .line 39
    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 40
    .line 41
    .line 42
    return-object v0
.end method


# virtual methods
.method public final B(Lh83;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lrw2;->f:Lzw2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lzw2;->f()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_0
    iget-object p1, p1, Lh83;->b:Lp21;

    .line 12
    .line 13
    iget-object v1, p1, Lp21;->f:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x0

    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, La83;

    .line 29
    .line 30
    iget v1, v1, La83;->b:I

    .line 31
    .line 32
    iput v1, p0, Lrw2;->i:I

    .line 33
    .line 34
    :cond_1
    iget-object p1, p1, Lp21;->g:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, Lc83;

    .line 37
    .line 38
    iget-object v1, p1, Lc83;->l:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-nez v2, :cond_2

    .line 45
    .line 46
    iput-object v1, p0, Lrw2;->m:Ljava/lang/String;

    .line 47
    .line 48
    :cond_2
    iget-object v1, p1, Lc83;->m:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-nez v2, :cond_3

    .line 55
    .line 56
    iput-object v1, p0, Lrw2;->n:Ljava/lang/String;

    .line 57
    .line 58
    :cond_3
    iget-object v1, p1, Lc83;->p:Lorg/json/JSONObject;

    .line 59
    .line 60
    invoke-virtual {v1}, Lorg/json/JSONObject;->length()I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-lez v2, :cond_4

    .line 65
    .line 66
    iput-object v1, p0, Lrw2;->q:Lorg/json/JSONObject;

    .line 67
    .line 68
    :cond_4
    sget-object v1, Lmz1;->ca:Liz1;

    .line 69
    .line 70
    sget-object v2, Ltw1;->e:Ltw1;

    .line 71
    .line 72
    iget-object v4, v2, Ltw1;->c:Lkz1;

    .line 73
    .line 74
    invoke-virtual {v4, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    check-cast v1, Ljava/lang/Boolean;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_a

    .line 85
    .line 86
    iget-wide v4, v0, Lzw2;->w:J

    .line 87
    .line 88
    sget-object v1, Lmz1;->da:Liz1;

    .line 89
    .line 90
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 91
    .line 92
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    check-cast v1, Ljava/lang/Long;

    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 99
    .line 100
    .line 101
    move-result-wide v1

    .line 102
    cmp-long v1, v4, v1

    .line 103
    .line 104
    if-gez v1, :cond_9

    .line 105
    .line 106
    iget-object v1, p1, Lc83;->n:Ljava/lang/String;

    .line 107
    .line 108
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-nez v2, :cond_5

    .line 113
    .line 114
    iput-object v1, p0, Lrw2;->o:Ljava/lang/String;

    .line 115
    .line 116
    :cond_5
    iget-object p1, p1, Lc83;->o:Lorg/json/JSONObject;

    .line 117
    .line 118
    invoke-virtual {p1}, Lorg/json/JSONObject;->length()I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-lez v1, :cond_6

    .line 123
    .line 124
    iput-object p1, p0, Lrw2;->p:Lorg/json/JSONObject;

    .line 125
    .line 126
    :cond_6
    iget-object p1, p0, Lrw2;->p:Lorg/json/JSONObject;

    .line 127
    .line 128
    if-eqz p1, :cond_7

    .line 129
    .line 130
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    :cond_7
    iget-object p1, p0, Lrw2;->o:Ljava/lang/String;

    .line 139
    .line 140
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    if-nez p1, :cond_8

    .line 145
    .line 146
    iget-object p1, p0, Lrw2;->o:Ljava/lang/String;

    .line 147
    .line 148
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    add-int/2addr v3, p1

    .line 153
    :cond_8
    int-to-long v1, v3

    .line 154
    monitor-enter v0

    .line 155
    :try_start_0
    iget-wide v3, v0, Lzw2;->w:J

    .line 156
    .line 157
    add-long/2addr v3, v1

    .line 158
    iput-wide v3, v0, Lzw2;->w:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 159
    .line 160
    monitor-exit v0

    .line 161
    return-void

    .line 162
    :catchall_0
    move-exception p1

    .line 163
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 164
    throw p1

    .line 165
    :cond_9
    const/4 p1, 0x1

    .line 166
    iput-boolean p1, p0, Lrw2;->t:Z

    .line 167
    .line 168
    :cond_a
    :goto_0
    return-void
.end method

.method public final G0(Lfa2;)V
    .locals 1

    .line 1
    sget-object p1, Lmz1;->ga:Liz1;

    .line 2
    .line 3
    sget-object v0, Ltw1;->e:Ltw1;

    .line 4
    .line 5
    iget-object v0, v0, Ltw1;->c:Lkz1;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    iget-object p1, p0, Lrw2;->f:Lzw2;

    .line 20
    .line 21
    invoke-virtual {p1}, Lzw2;->f()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-object v0, p0, Lrw2;->g:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p1, v0, p0}, Lzw2;->c(Ljava/lang/String;Lrw2;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public final I0(Lel2;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lrw2;->f:Lzw2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lzw2;->f()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object p1, p1, Lel2;->f:Lrm2;

    .line 11
    .line 12
    iput-object p1, p0, Lrw2;->k:Lrm2;

    .line 13
    .line 14
    sget-object p1, Lqw2;->g:Lqw2;

    .line 15
    .line 16
    iput-object p1, p0, Lrw2;->j:Lqw2;

    .line 17
    .line 18
    sget-object p1, Lmz1;->ga:Liz1;

    .line 19
    .line 20
    sget-object v1, Ltw1;->e:Ltw1;

    .line 21
    .line 22
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    iget-object p1, p0, Lrw2;->g:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v0, p1, p0}, Lzw2;->c(Ljava/lang/String;Lrw2;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    :goto_0
    return-void
.end method

.method public final a()Lorg/json/JSONObject;
    .locals 4

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "state"

    .line 7
    .line 8
    iget-object v2, p0, Lrw2;->j:Lqw2;

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    iget v1, p0, Lrw2;->i:I

    .line 14
    .line 15
    invoke-static {v1}, La83;->a(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v2, "format"

    .line 20
    .line 21
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 22
    .line 23
    .line 24
    sget-object v1, Lmz1;->ga:Liz1;

    .line 25
    .line 26
    sget-object v2, Ltw1;->e:Ltw1;

    .line 27
    .line 28
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 29
    .line 30
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    iget-boolean v1, p0, Lrw2;->r:Z

    .line 43
    .line 44
    const-string v2, "isOutOfContext"

    .line 45
    .line 46
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 47
    .line 48
    .line 49
    iget-boolean v1, p0, Lrw2;->r:Z

    .line 50
    .line 51
    if-eqz v1, :cond_0

    .line 52
    .line 53
    iget-boolean v1, p0, Lrw2;->s:Z

    .line 54
    .line 55
    const-string v2, "shown"

    .line 56
    .line 57
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 58
    .line 59
    .line 60
    :cond_0
    iget-object v1, p0, Lrw2;->k:Lrm2;

    .line 61
    .line 62
    if-eqz v1, :cond_1

    .line 63
    .line 64
    invoke-virtual {p0, v1}, Lrw2;->b(Lrm2;)Lorg/json/JSONObject;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    goto :goto_0

    .line 69
    :cond_1
    iget-object v1, p0, Lrw2;->l:Lnx2;

    .line 70
    .line 71
    const/4 v2, 0x0

    .line 72
    if-eqz v1, :cond_2

    .line 73
    .line 74
    iget-object v1, v1, Lnx2;->j:Landroid/os/IBinder;

    .line 75
    .line 76
    if-eqz v1, :cond_2

    .line 77
    .line 78
    check-cast v1, Lrm2;

    .line 79
    .line 80
    invoke-virtual {p0, v1}, Lrw2;->b(Lrm2;)Lorg/json/JSONObject;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    iget-object v1, v1, Lrm2;->j:Ljava/util/List;

    .line 85
    .line 86
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_2

    .line 91
    .line 92
    new-instance v1, Lorg/json/JSONArray;

    .line 93
    .line 94
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 95
    .line 96
    .line 97
    iget-object v3, p0, Lrw2;->l:Lnx2;

    .line 98
    .line 99
    invoke-static {v3}, Lrw2;->c(Lnx2;)Lorg/json/JSONObject;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 104
    .line 105
    .line 106
    const-string v3, "errors"

    .line 107
    .line 108
    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 109
    .line 110
    .line 111
    :cond_2
    move-object v1, v2

    .line 112
    :goto_0
    const-string v2, "responseInfo"

    .line 113
    .line 114
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 115
    .line 116
    .line 117
    return-object v0
.end method

.method public final b(Lrm2;)Lorg/json/JSONObject;
    .locals 7

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "winningAdapterClassName"

    .line 7
    .line 8
    iget-object v2, p1, Lrm2;->f:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    const-string v1, "responseSecsSinceEpoch"

    .line 14
    .line 15
    iget-wide v2, p1, Lrm2;->k:J

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 18
    .line 19
    .line 20
    const-string v1, "responseId"

    .line 21
    .line 22
    iget-object v2, p1, Lrm2;->g:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 25
    .line 26
    .line 27
    sget-object v1, Lmz1;->Z9:Liz1;

    .line 28
    .line 29
    sget-object v2, Ltw1;->e:Ltw1;

    .line 30
    .line 31
    iget-object v3, v2, Ltw1;->c:Lkz1;

    .line 32
    .line 33
    invoke-virtual {v3, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    iget-object v1, p1, Lrm2;->l:Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-nez v3, :cond_0

    .line 52
    .line 53
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    const-string v4, "Bidding data: "

    .line 58
    .line 59
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-static {v3}, Lgi2;->U(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    new-instance v3, Lorg/json/JSONObject;

    .line 67
    .line 68
    invoke-direct {v3, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const-string v1, "biddingData"

    .line 72
    .line 73
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 74
    .line 75
    .line 76
    :cond_0
    iget-object v1, p0, Lrw2;->m:Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-nez v1, :cond_1

    .line 83
    .line 84
    iget-object v1, p0, Lrw2;->m:Ljava/lang/String;

    .line 85
    .line 86
    const-string v3, "adRequestUrl"

    .line 87
    .line 88
    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 89
    .line 90
    .line 91
    :cond_1
    iget-object v1, p0, Lrw2;->n:Ljava/lang/String;

    .line 92
    .line 93
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-nez v1, :cond_2

    .line 98
    .line 99
    iget-object v1, p0, Lrw2;->n:Ljava/lang/String;

    .line 100
    .line 101
    const-string v3, "postBody"

    .line 102
    .line 103
    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 104
    .line 105
    .line 106
    :cond_2
    iget-object v1, p0, Lrw2;->o:Ljava/lang/String;

    .line 107
    .line 108
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-nez v1, :cond_3

    .line 113
    .line 114
    iget-object v1, p0, Lrw2;->o:Ljava/lang/String;

    .line 115
    .line 116
    const-string v3, "adResponseBody"

    .line 117
    .line 118
    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 119
    .line 120
    .line 121
    :cond_3
    iget-object v1, p0, Lrw2;->p:Lorg/json/JSONObject;

    .line 122
    .line 123
    if-eqz v1, :cond_4

    .line 124
    .line 125
    const-string v3, "adResponseHeaders"

    .line 126
    .line 127
    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 128
    .line 129
    .line 130
    :cond_4
    iget-object v1, p0, Lrw2;->q:Lorg/json/JSONObject;

    .line 131
    .line 132
    if-eqz v1, :cond_5

    .line 133
    .line 134
    const-string v3, "transactionExtras"

    .line 135
    .line 136
    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 137
    .line 138
    .line 139
    :cond_5
    sget-object v1, Lmz1;->ca:Liz1;

    .line 140
    .line 141
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 142
    .line 143
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    check-cast v1, Ljava/lang/Boolean;

    .line 148
    .line 149
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-eqz v1, :cond_6

    .line 154
    .line 155
    iget-boolean v1, p0, Lrw2;->t:Z

    .line 156
    .line 157
    const-string v2, "hasExceededMemoryLimit"

    .line 158
    .line 159
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 160
    .line 161
    .line 162
    :cond_6
    new-instance v1, Lorg/json/JSONArray;

    .line 163
    .line 164
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 165
    .line 166
    .line 167
    iget-object p1, p1, Lrm2;->j:Ljava/util/List;

    .line 168
    .line 169
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    if-eqz v2, :cond_9

    .line 178
    .line 179
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    check-cast v2, Lqh4;

    .line 184
    .line 185
    new-instance v3, Lorg/json/JSONObject;

    .line 186
    .line 187
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 188
    .line 189
    .line 190
    iget-object v4, v2, Lqh4;->f:Ljava/lang/String;

    .line 191
    .line 192
    const-string v5, "adapterClassName"

    .line 193
    .line 194
    invoke-virtual {v3, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 195
    .line 196
    .line 197
    iget-wide v4, v2, Lqh4;->g:J

    .line 198
    .line 199
    const-string v6, "latencyMillis"

    .line 200
    .line 201
    invoke-virtual {v3, v6, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 202
    .line 203
    .line 204
    sget-object v4, Lmz1;->aa:Liz1;

    .line 205
    .line 206
    sget-object v5, Ltw1;->e:Ltw1;

    .line 207
    .line 208
    iget-object v5, v5, Ltw1;->c:Lkz1;

    .line 209
    .line 210
    invoke-virtual {v5, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v4

    .line 214
    check-cast v4, Ljava/lang/Boolean;

    .line 215
    .line 216
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    if-eqz v4, :cond_7

    .line 221
    .line 222
    sget-object v4, Lsv1;->f:Lsv1;

    .line 223
    .line 224
    iget-object v4, v4, Lsv1;->a:Lj63;

    .line 225
    .line 226
    iget-object v5, v2, Lqh4;->i:Landroid/os/Bundle;

    .line 227
    .line 228
    invoke-virtual {v4, v5}, Lj63;->j(Landroid/os/Bundle;)Lorg/json/JSONObject;

    .line 229
    .line 230
    .line 231
    move-result-object v4

    .line 232
    const-string v5, "credentials"

    .line 233
    .line 234
    invoke-virtual {v3, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 235
    .line 236
    .line 237
    :cond_7
    iget-object v2, v2, Lqh4;->h:Lnx2;

    .line 238
    .line 239
    if-nez v2, :cond_8

    .line 240
    .line 241
    const/4 v2, 0x0

    .line 242
    goto :goto_1

    .line 243
    :cond_8
    invoke-static {v2}, Lrw2;->c(Lnx2;)Lorg/json/JSONObject;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    :goto_1
    const-string v4, "error"

    .line 248
    .line 249
    invoke-virtual {v3, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 253
    .line 254
    .line 255
    goto :goto_0

    .line 256
    :cond_9
    const-string p1, "adNetworks"

    .line 257
    .line 258
    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 259
    .line 260
    .line 261
    return-object v0
.end method

.method public final d0(Lnx2;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lrw2;->f:Lzw2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lzw2;->f()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object v1, Lqw2;->h:Lqw2;

    .line 11
    .line 12
    iput-object v1, p0, Lrw2;->j:Lqw2;

    .line 13
    .line 14
    iput-object p1, p0, Lrw2;->l:Lnx2;

    .line 15
    .line 16
    sget-object p1, Lmz1;->ga:Liz1;

    .line 17
    .line 18
    sget-object v1, Ltw1;->e:Ltw1;

    .line 19
    .line 20
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 21
    .line 22
    invoke-virtual {v1, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    iget-object p1, p0, Lrw2;->g:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v0, p1, p0}, Lzw2;->c(Ljava/lang/String;Lrw2;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    :goto_0
    return-void
.end method
