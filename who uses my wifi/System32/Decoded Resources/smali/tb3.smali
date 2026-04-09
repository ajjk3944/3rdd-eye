.class public final Ltb3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljb3;


# direct methods
.method public synthetic constructor <init>(Ljb3;I)V
    .locals 0

    .line 1
    iput p2, p0, Ltb3;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Ltb3;->g:Ljb3;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget v0, p0, Ltb3;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ltb3;->g:Ljb3;

    .line 7
    .line 8
    iget-object v1, v0, Ljb3;->p:Lsq0;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v2, v0, Ljb3;->q:Lym;

    .line 13
    .line 14
    iget-object v9, v0, Ljb3;->r:Lqb3;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    iget-object v2, v0, Ljb3;->e:Lae3;

    .line 24
    .line 25
    iget v6, v2, Lae3;->i:I

    .line 26
    .line 27
    invoke-virtual {v0}, Ljb3;->e()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v10

    .line 31
    const-string v2, "pae"

    .line 32
    .line 33
    const-string v3, "paeo_ts"

    .line 34
    .line 35
    const/4 v7, 0x0

    .line 36
    const/4 v8, 0x0

    .line 37
    invoke-virtual/range {v1 .. v10}, Lsq0;->z(Ljava/lang/String;Ljava/lang/String;JIILjava/lang/String;Lqb3;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    return-void

    .line 41
    :pswitch_0
    iget-object v1, p0, Ltb3;->g:Ljb3;

    .line 42
    .line 43
    monitor-enter v1

    .line 44
    :try_start_0
    iget-object v0, v1, Ljb3;->g:Lod2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    const/4 v2, 0x2

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    :try_start_1
    iget-object v3, v1, Ljb3;->e:Lae3;

    .line 50
    .line 51
    invoke-virtual {v0}, Lsb1;->U()Landroid/os/Parcel;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-static {v4, v3}, Liv1;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v4, v2}, Lsb1;->M0(Landroid/os/Parcel;I)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :catchall_0
    move-exception v0

    .line 63
    goto :goto_2

    .line 64
    :catch_0
    :try_start_2
    const-string v0, "Failed to call onAdsExhausted"

    .line 65
    .line 66
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    :cond_1
    :goto_0
    iget-object v0, v1, Ljb3;->h:Lbf2;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 70
    .line 71
    if-eqz v0, :cond_2

    .line 72
    .line 73
    :try_start_3
    iget-object v3, v1, Ljb3;->k:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v0}, Lsb1;->U()Landroid/os/Parcel;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-virtual {v4, v3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v4, v2}, Lsb1;->M0(Landroid/os/Parcel;I)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 83
    .line 84
    .line 85
    :cond_2
    monitor-exit v1

    .line 86
    goto :goto_1

    .line 87
    :catch_1
    :try_start_4
    const-string v0, "Failed to call onAdsExhausted"

    .line 88
    .line 89
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 90
    .line 91
    .line 92
    monitor-exit v1

    .line 93
    :goto_1
    return-void

    .line 94
    :goto_2
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 95
    throw v0

    .line 96
    :pswitch_1
    iget-object v0, p0, Ltb3;->g:Ljb3;

    .line 97
    .line 98
    invoke-virtual {v0}, Ljb3;->n()V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
