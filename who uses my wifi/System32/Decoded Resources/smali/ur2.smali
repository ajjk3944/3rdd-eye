.class public final Lur2;
.super Lvr2;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final b:Lorg/json/JSONObject;

.field public final c:Z

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:Ljava/lang/String;

.field public final h:Lorg/json/JSONObject;


# direct methods
.method public constructor <init>(La83;Lorg/json/JSONObject;)V
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Lvr2;-><init>(La83;)V

    .line 2
    .line 3
    .line 4
    const-string p1, "tracking_urls_and_actions"

    .line 5
    .line 6
    const-string v0, "active_view"

    .line 7
    .line 8
    filled-new-array {p1, v0}, [Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p2, p1}, Lbd2;->b0(Lorg/json/JSONObject;[Ljava/lang/String;)Lorg/json/JSONObject;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x1

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    aget-object p1, p1, v1

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    :goto_0
    iput-object p1, p0, Lur2;->b:Lorg/json/JSONObject;

    .line 28
    .line 29
    const-string p1, "allow_pub_owned_ad_view"

    .line 30
    .line 31
    filled-new-array {p1}, [Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-static {p2, p1}, Lbd2;->b0(Lorg/json/JSONObject;[Ljava/lang/String;)Lorg/json/JSONObject;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const/4 v2, 0x0

    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    move p1, v2

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    aget-object p1, p1, v2

    .line 45
    .line 46
    invoke-virtual {v0, p1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    :goto_1
    iput-boolean p1, p0, Lur2;->c:Z

    .line 51
    .line 52
    const-string p1, "attribution"

    .line 53
    .line 54
    const-string v0, "allow_pub_rendering"

    .line 55
    .line 56
    filled-new-array {p1, v0}, [Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-static {p2, p1}, Lbd2;->b0(Lorg/json/JSONObject;[Ljava/lang/String;)Lorg/json/JSONObject;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    if-nez v0, :cond_2

    .line 65
    .line 66
    move p1, v2

    .line 67
    goto :goto_2

    .line 68
    :cond_2
    aget-object p1, p1, v1

    .line 69
    .line 70
    invoke-virtual {v0, p1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    :goto_2
    iput-boolean p1, p0, Lur2;->d:Z

    .line 75
    .line 76
    const-string p1, "enable_omid"

    .line 77
    .line 78
    filled-new-array {p1}, [Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {p2, p1}, Lbd2;->b0(Lorg/json/JSONObject;[Ljava/lang/String;)Lorg/json/JSONObject;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    if-nez v0, :cond_3

    .line 87
    .line 88
    move p1, v2

    .line 89
    goto :goto_3

    .line 90
    :cond_3
    aget-object p1, p1, v2

    .line 91
    .line 92
    invoke-virtual {v0, p1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    :goto_3
    iput-boolean p1, p0, Lur2;->e:Z

    .line 97
    .line 98
    const-string p1, "watermark_overlay_png_base64"

    .line 99
    .line 100
    filled-new-array {p1}, [Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-static {p2, p1}, Lbd2;->b0(Lorg/json/JSONObject;[Ljava/lang/String;)Lorg/json/JSONObject;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    const-string v3, ""

    .line 109
    .line 110
    if-nez v0, :cond_4

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_4
    aget-object p1, p1, v2

    .line 114
    .line 115
    invoke-virtual {v0, p1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    :goto_4
    iput-object v3, p0, Lur2;->g:Ljava/lang/String;

    .line 120
    .line 121
    const-string p1, "overlay"

    .line 122
    .line 123
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    if-eqz p1, :cond_5

    .line 128
    .line 129
    goto :goto_5

    .line 130
    :cond_5
    move v1, v2

    .line 131
    :goto_5
    iput-boolean v1, p0, Lur2;->f:Z

    .line 132
    .line 133
    const-string p1, "omid_settings"

    .line 134
    .line 135
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    iput-object p1, p0, Lur2;->h:Lorg/json/JSONObject;

    .line 140
    .line 141
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lur2;->f:Z

    .line 2
    .line 3
    return v0
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lur2;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lur2;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lur2;->d:Z

    .line 2
    .line 3
    return v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lur2;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()Lug0;
    .locals 3

    .line 1
    iget-object v0, p0, Lur2;->h:Lorg/json/JSONObject;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lug0;

    .line 6
    .line 7
    const/16 v2, 0x1c

    .line 8
    .line 9
    invoke-direct {v1, v2, v0}, Lug0;-><init>(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-object v1

    .line 13
    :cond_0
    iget-object v0, p0, Lvr2;->a:La83;

    .line 14
    .line 15
    iget-object v0, v0, La83;->V:Lug0;

    .line 16
    .line 17
    return-object v0
.end method
