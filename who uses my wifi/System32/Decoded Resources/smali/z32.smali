.class public final Lz32;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ly32;


# instance fields
.field public final synthetic f:I

.field public final g:Lzw2;


# direct methods
.method public synthetic constructor <init>(Lzw2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lz32;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lz32;->g:Lzw2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 3

    .line 1
    iget p1, p0, Lz32;->f:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_2

    .line 7
    .line 8
    const-string p1, "extras"

    .line 9
    .line 10
    invoke-interface {p2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string p1, "expires"

    .line 18
    .line 19
    invoke-interface {p2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    const-wide v0, 0x7fffffffffffffffL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    :try_start_0
    const-string p1, "expires"

    .line 31
    .line 32
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 39
    .line 40
    .line 41
    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    :catch_0
    :cond_1
    iget-object p1, p0, Lz32;->g:Lzw2;

    .line 43
    .line 44
    const-string v2, "extras"

    .line 45
    .line 46
    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    check-cast p2, Ljava/lang/String;

    .line 51
    .line 52
    monitor-enter p1

    .line 53
    :try_start_1
    iput-object p2, p1, Lzw2;->o:Ljava/lang/String;

    .line 54
    .line 55
    iput-wide v0, p1, Lzw2;->q:J

    .line 56
    .line 57
    invoke-virtual {p1}, Lzw2;->m()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    .line 59
    .line 60
    monitor-exit p1

    .line 61
    goto :goto_0

    .line 62
    :catchall_0
    move-exception p2

    .line 63
    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 64
    throw p2

    .line 65
    :cond_2
    :goto_0
    return-void

    .line 66
    :pswitch_0
    if-eqz p2, :cond_4

    .line 67
    .line 68
    const-string p1, "persistentData"

    .line 69
    .line 70
    invoke-interface {p2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_4

    .line 75
    .line 76
    const-string p1, "persistentData"

    .line 77
    .line 78
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    check-cast p1, Ljava/lang/CharSequence;

    .line 83
    .line 84
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-eqz p1, :cond_3

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    iget-object p1, p0, Lz32;->g:Lzw2;

    .line 92
    .line 93
    const-string v0, "persistentData"

    .line 94
    .line 95
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    check-cast p2, Ljava/lang/String;

    .line 100
    .line 101
    monitor-enter p1

    .line 102
    :try_start_3
    iput-object p2, p1, Lzw2;->x:Ljava/lang/String;

    .line 103
    .line 104
    sget-object p2, Lhg4;->C:Lhg4;

    .line 105
    .line 106
    iget-object p2, p2, Lhg4;->h:Lgd2;

    .line 107
    .line 108
    invoke-virtual {p2}, Lgd2;->g()Lra4;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    iget-object v0, p1, Lzw2;->x:Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {p2, v0}, Lra4;->g(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 115
    .line 116
    .line 117
    monitor-exit p1

    .line 118
    goto :goto_1

    .line 119
    :catchall_1
    move-exception p2

    .line 120
    :try_start_4
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 121
    throw p2

    .line 122
    :cond_4
    :goto_1
    return-void

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
