.class public final synthetic Lga0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lrx;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lga0;->f:I

    .line 2
    .line 3
    iput-object p2, p0, Lga0;->g:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lga0;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lga0;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lat0;

    .line 9
    .line 10
    invoke-interface {v0}, Lb60;->e()Ld60;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v2, Lun0;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-direct {v2, v3, v0}, Lun0;-><init>(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ld60;->a(La60;)V

    .line 21
    .line 22
    .line 23
    sget-object v0, Lz31;->a:Lz31;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_0
    iget-object v0, p0, Lga0;->g:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lr61;

    .line 29
    .line 30
    invoke-static {v0}, Lg82;->i(Lr61;)Lws0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0

    .line 35
    :pswitch_1
    iget-object v0, p0, Lga0;->g:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    iput-boolean v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->a0:Z

    .line 41
    .line 42
    new-instance v2, Lna0;

    .line 43
    .line 44
    const/4 v3, 0x0

    .line 45
    invoke-direct {v2, v1, v0, v3}, Lna0;-><init>(ZLcom/phuongpn/whousemywifi/networkscanner/MainActivity;I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 49
    .line 50
    .line 51
    sget-object v0, Lz31;->a:Lz31;

    .line 52
    .line 53
    return-object v0

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
