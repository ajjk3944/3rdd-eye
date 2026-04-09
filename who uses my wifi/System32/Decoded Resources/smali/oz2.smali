.class public final synthetic Loz2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lp82;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Loz2;->f:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Loz2;->g:Ljava/lang/Object;

    iput-object p3, p0, Loz2;->h:Ljava/lang/Object;

    iput-object p1, p0, Loz2;->i:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lpz2;Landroid/app/Activity;Ljh1;I)V
    .locals 0

    .line 1
    iput p4, p0, Loz2;->f:I

    iput-object p1, p0, Loz2;->g:Ljava/lang/Object;

    iput-object p2, p0, Loz2;->h:Ljava/lang/Object;

    iput-object p3, p0, Loz2;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .line 1
    iget p1, p0, Loz2;->f:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Loz2;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lp82;

    .line 9
    .line 10
    iget-object p2, p1, Lp82;->i:Landroid/app/Activity;

    .line 11
    .line 12
    const-string v0, "download"

    .line 13
    .line 14
    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    check-cast p2, Landroid/app/DownloadManager;

    .line 19
    .line 20
    :try_start_0
    iget-object v0, p0, Loz2;->g:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ljava/lang/String;

    .line 23
    .line 24
    iget-object v1, p0, Loz2;->h:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Ljava/lang/String;

    .line 27
    .line 28
    new-instance v2, Landroid/app/DownloadManager$Request;

    .line 29
    .line 30
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-direct {v2, v0}, Landroid/app/DownloadManager$Request;-><init>(Landroid/net/Uri;)V

    .line 35
    .line 36
    .line 37
    sget-object v0, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v2, v0, v1}, Landroid/app/DownloadManager$Request;->setDestinationInExternalPublicDir(Ljava/lang/String;Ljava/lang/String;)Landroid/app/DownloadManager$Request;

    .line 40
    .line 41
    .line 42
    sget-object v0, Lhg4;->C:Lhg4;

    .line 43
    .line 44
    iget-object v0, v0, Lhg4;->c:Llf4;

    .line 45
    .line 46
    invoke-virtual {v2}, Landroid/app/DownloadManager$Request;->allowScanningByMediaScanner()V

    .line 47
    .line 48
    .line 49
    const/4 v0, 0x1

    .line 50
    invoke-virtual {v2, v0}, Landroid/app/DownloadManager$Request;->setNotificationVisibility(I)Landroid/app/DownloadManager$Request;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2, v2}, Landroid/app/DownloadManager;->enqueue(Landroid/app/DownloadManager$Request;)J
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catch_0
    const-string p2, "Could not store picture."

    .line 58
    .line 59
    invoke-virtual {p1, p2}, Lgw3;->G(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    :goto_0
    return-void

    .line 63
    :pswitch_0
    iget-object p1, p0, Loz2;->g:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p1, Lpz2;

    .line 66
    .line 67
    iget-object p2, p0, Loz2;->h:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p2, Landroid/app/Activity;

    .line 70
    .line 71
    iget-object v0, p0, Loz2;->i:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, Ljh1;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    new-instance v1, Ljava/util/HashMap;

    .line 79
    .line 80
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 81
    .line 82
    .line 83
    const-string v2, "dialog_action"

    .line 84
    .line 85
    const-string v3, "confirm"

    .line 86
    .line 87
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    iget-object v2, p1, Lpz2;->k:Ljava/lang/String;

    .line 91
    .line 92
    const-string v3, "dialog_click"

    .line 93
    .line 94
    invoke-virtual {p1, v2, v3, v1}, Lpz2;->H3(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, p2, v0}, Lpz2;->E3(Landroid/app/Activity;Ljh1;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :pswitch_1
    iget-object p1, p0, Loz2;->g:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast p1, Lpz2;

    .line 104
    .line 105
    iget-object p2, p0, Loz2;->h:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast p2, Landroid/app/Activity;

    .line 108
    .line 109
    iget-object v0, p0, Loz2;->i:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v0, Ljh1;

    .line 112
    .line 113
    new-instance v1, Ljava/util/HashMap;

    .line 114
    .line 115
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 116
    .line 117
    .line 118
    const-string v2, "dialog_action"

    .line 119
    .line 120
    const-string v3, "confirm"

    .line 121
    .line 122
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    iget-object v2, p1, Lpz2;->k:Ljava/lang/String;

    .line 126
    .line 127
    const-string v3, "rtsdc"

    .line 128
    .line 129
    invoke-virtual {p1, v2, v3, v1}, Lpz2;->H3(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 130
    .line 131
    .line 132
    sget-object v1, Lhg4;->C:Lhg4;

    .line 133
    .line 134
    iget-object v1, v1, Lhg4;->f:Lnh4;

    .line 135
    .line 136
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    new-instance v1, Landroid/content/Intent;

    .line 140
    .line 141
    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 142
    .line 143
    .line 144
    const-string v2, "android.settings.APP_NOTIFICATION_SETTINGS"

    .line 145
    .line 146
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 147
    .line 148
    .line 149
    const-string v2, "android.provider.extra.APP_PACKAGE"

    .line 150
    .line 151
    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 156
    .line 157
    .line 158
    invoke-virtual {p2, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p1}, Lpz2;->F3()V

    .line 162
    .line 163
    .line 164
    if-eqz v0, :cond_0

    .line 165
    .line 166
    invoke-virtual {v0}, Ljh1;->y()V

    .line 167
    .line 168
    .line 169
    :cond_0
    return-void

    .line 170
    nop

    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
