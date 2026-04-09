.class public final Lpu2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lvs1;

.field public final c:Lf02;

.field public final d:Le51;

.field public final e:Ll92;

.field public final f:Lcx1;

.field public final g:Lgo2;

.field public final h:Lpz2;

.field public final i:Lm83;

.field public final j:Lmv2;

.field public final k:Lwg2;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lvs1;Lf02;Le51;Ll92;Lcx1;Lgo2;Lpz2;Lm83;Lmv2;Lwg2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lpu2;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lpu2;->b:Lvs1;

    .line 7
    .line 8
    iput-object p3, p0, Lpu2;->c:Lf02;

    .line 9
    .line 10
    iput-object p4, p0, Lpu2;->d:Le51;

    .line 11
    .line 12
    iput-object p5, p0, Lpu2;->e:Ll92;

    .line 13
    .line 14
    iput-object p6, p0, Lpu2;->f:Lcx1;

    .line 15
    .line 16
    iput-object p7, p0, Lpu2;->g:Lgo2;

    .line 17
    .line 18
    iput-object p8, p0, Lpu2;->h:Lpz2;

    .line 19
    .line 20
    iput-object p9, p0, Lpu2;->i:Lm83;

    .line 21
    .line 22
    iput-object p10, p0, Lpu2;->j:Lmv2;

    .line 23
    .line 24
    iput-object p11, p0, Lpu2;->k:Lwg2;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final a(Lxe4;La83;Lc83;)Lag2;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-static/range {p1 .. p1}, Lzq;->a(Lxe4;)Lzq;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    move-object/from16 v0, p1

    .line 8
    .line 9
    iget-object v4, v0, Lxe4;->f:Ljava/lang/String;

    .line 10
    .line 11
    new-instance v10, Lkf3;

    .line 12
    .line 13
    const/16 v0, 0x17

    .line 14
    .line 15
    invoke-direct {v10, v0, v1}, Lkf3;-><init>(ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object v12, v1, Lpu2;->f:Lcx1;

    .line 19
    .line 20
    iget-object v0, v1, Lpu2;->j:Lmv2;

    .line 21
    .line 22
    iget-object v2, v1, Lpu2;->a:Landroid/content/Context;

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    const/4 v6, 0x0

    .line 26
    iget-object v7, v1, Lpu2;->b:Lvs1;

    .line 27
    .line 28
    iget-object v8, v1, Lpu2;->c:Lf02;

    .line 29
    .line 30
    iget-object v9, v1, Lpu2;->d:Le51;

    .line 31
    .line 32
    iget-object v11, v1, Lpu2;->e:Ll92;

    .line 33
    .line 34
    iget-object v15, v1, Lpu2;->h:Lpz2;

    .line 35
    .line 36
    iget-object v13, v1, Lpu2;->i:Lm83;

    .line 37
    .line 38
    move-object/from16 v14, p3

    .line 39
    .line 40
    move-object/from16 v17, v0

    .line 41
    .line 42
    move-object/from16 v16, v13

    .line 43
    .line 44
    move-object/from16 v13, p2

    .line 45
    .line 46
    invoke-static/range {v2 .. v17}, Lsd2;->b(Landroid/content/Context;Lzq;Ljava/lang/String;ZZLvs1;Lf02;Le51;Lkf3;Ll92;Lcx1;La83;Lc83;Lpz2;Lm83;Lmv2;)Lag2;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    sget-object v0, Lmz1;->De:Liz1;

    .line 51
    .line 52
    sget-object v3, Ltw1;->e:Ltw1;

    .line 53
    .line 54
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 55
    .line 56
    invoke-virtual {v3, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, Ljava/lang/Boolean;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_1

    .line 67
    .line 68
    invoke-interface {v2}, Lag2;->t()Landroid/webkit/WebView;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iget-object v3, v1, Lpu2;->k:Lwg2;

    .line 73
    .line 74
    iget-object v3, v3, Lwg2;->a:Lpm0;

    .line 75
    .line 76
    if-eqz v3, :cond_1

    .line 77
    .line 78
    :try_start_0
    const-string v3, "GMA_WEBVIEW_PROFILE"

    .line 79
    .line 80
    sget v4, Lc81;->a:I

    .line 81
    .line 82
    sget-object v4, Lf81;->f:Le81;

    .line 83
    .line 84
    invoke-virtual {v4}, Le81;->b()Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    if-eqz v4, :cond_0

    .line 89
    .line 90
    invoke-static {v0}, Lc81;->a(Landroid/webkit/WebView;)Lof3;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iget-object v0, v0, Lof3;->g:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;

    .line 97
    .line 98
    invoke-interface {v0, v3}, Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;->setProfile(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    const-string v0, "WebViewCompat Profile is defined"

    .line 102
    .line 103
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    return-object v2

    .line 107
    :catch_0
    move-exception v0

    .line 108
    goto :goto_0

    .line 109
    :cond_0
    invoke-static {}, Lf81;->a()Ljava/lang/UnsupportedOperationException;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    throw v0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 114
    :goto_0
    const-string v3, "WebViewCompat error: "

    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    invoke-static {v3}, Lgi2;->i0(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    sget-object v3, Lmz1;->Ce:Liz1;

    .line 128
    .line 129
    sget-object v4, Ltw1;->e:Ltw1;

    .line 130
    .line 131
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 132
    .line 133
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    check-cast v3, Ljava/lang/Boolean;

    .line 138
    .line 139
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    if-eqz v3, :cond_1

    .line 144
    .line 145
    sget-object v3, Lhg4;->C:Lhg4;

    .line 146
    .line 147
    iget-object v3, v3, Lhg4;->h:Lgd2;

    .line 148
    .line 149
    const-string v4, "WebViewCompat.setProfile"

    .line 150
    .line 151
    invoke-virtual {v3, v4, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 152
    .line 153
    .line 154
    :cond_1
    return-object v2
.end method
