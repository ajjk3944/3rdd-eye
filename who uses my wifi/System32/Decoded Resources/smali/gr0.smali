.class public final Lgr0;
.super Lyc0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic n:I

.field public final o:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/ads/mediation/AbstractAdViewAdapter;Lhd0;)V
    .locals 0

    const/4 p1, 0x2

    iput p1, p0, Lgr0;->n:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, Lgr0;->o:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Li5;I)V
    .locals 0

    .line 1
    iput p2, p0, Lgr0;->n:I

    iput-object p1, p0, Lgr0;->o:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    .line 1
    iget v0, p0, Lgr0;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lgr0;->o:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lhd0;

    .line 9
    .line 10
    check-cast v0, Lxb4;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const-string v1, "#008 Must be called on the main UI thread."

    .line 16
    .line 17
    invoke-static {v1}, Lou1;->h(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v1, "Adapter called onAdClosed."

    .line 21
    .line 22
    invoke-static {v1}, Lgi2;->U(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :try_start_0
    iget-object v0, v0, Lxb4;->g:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Lz62;

    .line 28
    .line 29
    invoke-interface {v0}, Lz62;->c()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catch_0
    move-exception v0

    .line 34
    const-string v1, "#007 Could not call remote method."

    .line 35
    .line 36
    invoke-static {v1, v0}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    return-void

    .line 40
    :pswitch_0
    iget-object v0, p0, Lgr0;->o:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Lcom/phuongpn/whousemywifi/networkscanner/RouterPasswordActivity;

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    iput-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/RouterPasswordActivity;->G:Lk52;

    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_1
    iget-object v0, p0, Lgr0;->o:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;

    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    iput-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;->D:Lk52;

    .line 54
    .line 55
    return-void

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public c(Lr2;)V
    .locals 1

    .line 1
    iget p1, p0, Lgr0;->n:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object p1, p0, Lgr0;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Lcom/phuongpn/whousemywifi/networkscanner/RouterPasswordActivity;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p1, Lcom/phuongpn/whousemywifi/networkscanner/RouterPasswordActivity;->G:Lk52;

    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_1
    iget-object p1, p0, Lgr0;->o:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-object v0, p1, Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;->D:Lk52;

    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d()V
    .locals 2

    .line 1
    iget v0, p0, Lgr0;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lgr0;->o:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lhd0;

    .line 9
    .line 10
    check-cast v0, Lxb4;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const-string v1, "#008 Must be called on the main UI thread."

    .line 16
    .line 17
    invoke-static {v1}, Lou1;->h(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v1, "Adapter called onAdOpened."

    .line 21
    .line 22
    invoke-static {v1}, Lgi2;->U(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :try_start_0
    iget-object v0, v0, Lxb4;->g:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Lz62;

    .line 28
    .line 29
    invoke-interface {v0}, Lz62;->j()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catch_0
    move-exception v0

    .line 34
    const-string v1, "#007 Could not call remote method."

    .line 35
    .line 36
    invoke-static {v1, v0}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    return-void

    .line 40
    :pswitch_0
    iget-object v0, p0, Lgr0;->o:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Lcom/phuongpn/whousemywifi/networkscanner/RouterPasswordActivity;

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    iput-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/RouterPasswordActivity;->G:Lk52;

    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_1
    iget-object v0, p0, Lgr0;->o:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;

    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    iput-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;->D:Lk52;

    .line 54
    .line 55
    return-void

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
