.class public final Lja4;
.super Ltl;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final b:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Lyz1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lja4;->b:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Lsl;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lja4;->b:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lyz1;

    .line 8
    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    iput-object p1, v0, Lyz1;->b:Lsl;

    .line 12
    .line 13
    :try_start_0
    iget-object p1, p1, Lsl;->a:Lp10;

    .line 14
    .line 15
    check-cast p1, Ln10;

    .line 16
    .line 17
    invoke-virtual {p1}, Ln10;->X0()Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    :catch_0
    iget-object p1, v0, Lyz1;->d:Lp21;

    .line 21
    .line 22
    if-eqz p1, :cond_3

    .line 23
    .line 24
    iget-object v0, p1, Lp21;->f:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Lyz1;

    .line 27
    .line 28
    iget-object v1, v0, Lyz1;->b:Lsl;

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    iput-object v2, v0, Lyz1;->a:Lmc2;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-object v3, v0, Lyz1;->a:Lmc2;

    .line 37
    .line 38
    if-nez v3, :cond_1

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Lsl;->b(Lil;)Lmc2;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iput-object v1, v0, Lyz1;->a:Lmc2;

    .line 45
    .line 46
    :cond_1
    :goto_0
    iget-object v1, v0, Lyz1;->a:Lmc2;

    .line 47
    .line 48
    new-instance v3, Lrl;

    .line 49
    .line 50
    invoke-direct {v3, v1}, Lrl;-><init>(Lmc2;)V

    .line 51
    .line 52
    .line 53
    iget-object v1, p1, Lp21;->g:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, Landroid/os/Bundle;

    .line 56
    .line 57
    invoke-static {v3, v1}, Llf4;->y(Lrl;Landroid/os/Bundle;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3}, Lrl;->a()Ll92;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iget-object v3, v1, Ll92;->f:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v3, Landroid/content/Intent;

    .line 67
    .line 68
    iget-object v4, p1, Lp21;->h:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v4, Landroid/content/Context;

    .line 71
    .line 72
    invoke-static {v4}, Lob1;->s(Landroid/content/Context;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-virtual {v3, v5}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 77
    .line 78
    .line 79
    iget-object p1, p1, Lp21;->i:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p1, Landroid/net/Uri;

    .line 82
    .line 83
    invoke-virtual {v3, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 84
    .line 85
    .line 86
    iget-object p1, v1, Ll92;->g:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast p1, Landroid/os/Bundle;

    .line 89
    .line 90
    invoke-virtual {v4, v3, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V

    .line 91
    .line 92
    .line 93
    check-cast v4, Landroid/app/Activity;

    .line 94
    .line 95
    iget-object p1, v0, Lyz1;->c:Lja4;

    .line 96
    .line 97
    if-nez p1, :cond_2

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_2
    invoke-virtual {v4, p1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 101
    .line 102
    .line 103
    iput-object v2, v0, Lyz1;->b:Lsl;

    .line 104
    .line 105
    iput-object v2, v0, Lyz1;->a:Lmc2;

    .line 106
    .line 107
    iput-object v2, v0, Lyz1;->c:Lja4;

    .line 108
    .line 109
    :cond_3
    :goto_1
    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lja4;->b:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lyz1;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p1, Lyz1;->b:Lsl;

    .line 13
    .line 14
    iput-object v0, p1, Lyz1;->a:Lmc2;

    .line 15
    .line 16
    :cond_0
    return-void
.end method
