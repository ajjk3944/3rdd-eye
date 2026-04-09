.class public final Lti2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lsi2;


# instance fields
.field public final synthetic a:I

.field public final b:Lra4;


# direct methods
.method public synthetic constructor <init>(Lra4;I)V
    .locals 0

    .line 1
    iput p2, p0, Lti2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lti2;->b:Lra4;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/HashMap;)V
    .locals 4

    .line 1
    iget v0, p0, Lti2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "content_vertical_opted_out"

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    iget-object v0, p0, Lti2;->b:Lra4;

    .line 19
    .line 20
    invoke-virtual {v0}, Lra4;->h()V

    .line 21
    .line 22
    .line 23
    iget-object v1, v0, Lra4;->a:Ljava/lang/Object;

    .line 24
    .line 25
    monitor-enter v1

    .line 26
    :try_start_0
    iget-boolean v2, v0, Lra4;->v:Z

    .line 27
    .line 28
    if-ne v2, p1, :cond_0

    .line 29
    .line 30
    monitor-exit v1

    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    iput-boolean p1, v0, Lra4;->v:Z

    .line 35
    .line 36
    iget-object v2, v0, Lra4;->g:Landroid/content/SharedPreferences$Editor;

    .line 37
    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    const-string v3, "content_vertical_opted_out"

    .line 41
    .line 42
    invoke-interface {v2, v3, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 43
    .line 44
    .line 45
    iget-object p1, v0, Lra4;->g:Landroid/content/SharedPreferences$Editor;

    .line 46
    .line 47
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 48
    .line 49
    .line 50
    :cond_1
    invoke-virtual {v0}, Lra4;->i()V

    .line 51
    .line 52
    .line 53
    monitor-exit v1

    .line 54
    :goto_0
    return-void

    .line 55
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    throw p1

    .line 57
    :pswitch_0
    const-string v0, "content_url_opted_out"

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {p1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    iget-object v0, p0, Lti2;->b:Lra4;

    .line 70
    .line 71
    invoke-virtual {v0}, Lra4;->h()V

    .line 72
    .line 73
    .line 74
    iget-object v1, v0, Lra4;->a:Ljava/lang/Object;

    .line 75
    .line 76
    monitor-enter v1

    .line 77
    :try_start_1
    iget-boolean v2, v0, Lra4;->u:Z

    .line 78
    .line 79
    if-ne v2, p1, :cond_2

    .line 80
    .line 81
    monitor-exit v1

    .line 82
    goto :goto_2

    .line 83
    :catchall_1
    move-exception p1

    .line 84
    goto :goto_3

    .line 85
    :cond_2
    iput-boolean p1, v0, Lra4;->u:Z

    .line 86
    .line 87
    iget-object v2, v0, Lra4;->g:Landroid/content/SharedPreferences$Editor;

    .line 88
    .line 89
    if-eqz v2, :cond_3

    .line 90
    .line 91
    const-string v3, "content_url_opted_out"

    .line 92
    .line 93
    invoke-interface {v2, v3, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 94
    .line 95
    .line 96
    iget-object p1, v0, Lra4;->g:Landroid/content/SharedPreferences$Editor;

    .line 97
    .line 98
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 99
    .line 100
    .line 101
    :cond_3
    invoke-virtual {v0}, Lra4;->i()V

    .line 102
    .line 103
    .line 104
    monitor-exit v1

    .line 105
    :goto_2
    return-void

    .line 106
    :goto_3
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 107
    throw p1

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
