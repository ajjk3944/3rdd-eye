.class public final Lfr0;
.super Lh30;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic y:I

.field public final synthetic z:Li5;


# direct methods
.method public synthetic constructor <init>(Li5;I)V
    .locals 0

    .line 1
    iput p2, p0, Lfr0;->y:I

    .line 2
    .line 3
    iput-object p1, p0, Lfr0;->z:Li5;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final q(Lu70;)V
    .locals 1

    .line 1
    iget v0, p0, Lfr0;->y:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Lr2;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Ljava/lang/String;

    .line 9
    .line 10
    const-string v0, "getMessage(...)"

    .line 11
    .line 12
    invoke-static {p1, v0}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lfr0;->z:Li5;

    .line 16
    .line 17
    check-cast p1, Lcom/phuongpn/whousemywifi/networkscanner/RouterPasswordActivity;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-object v0, p1, Lcom/phuongpn/whousemywifi/networkscanner/RouterPasswordActivity;->G:Lk52;

    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    iget-object p1, p1, Lr2;->h:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, Ljava/lang/String;

    .line 26
    .line 27
    const-string v0, "getMessage(...)"

    .line 28
    .line 29
    invoke-static {p1, v0}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lfr0;->z:Li5;

    .line 33
    .line 34
    check-cast p1, Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    iput-object v0, p1, Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;->D:Lk52;

    .line 38
    .line 39
    return-void

    .line 40
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final r(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lfr0;->y:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lg30;

    .line 7
    .line 8
    const-string v0, "ad"

    .line 9
    .line 10
    invoke-static {p1, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lfr0;->z:Li5;

    .line 14
    .line 15
    check-cast v0, Lcom/phuongpn/whousemywifi/networkscanner/RouterPasswordActivity;

    .line 16
    .line 17
    check-cast p1, Lk52;

    .line 18
    .line 19
    iput-object p1, v0, Lcom/phuongpn/whousemywifi/networkscanner/RouterPasswordActivity;->G:Lk52;

    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    check-cast p1, Lg30;

    .line 23
    .line 24
    const-string v0, "ad"

    .line 25
    .line 26
    invoke-static {p1, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lfr0;->z:Li5;

    .line 30
    .line 31
    check-cast v0, Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;

    .line 32
    .line 33
    check-cast p1, Lk52;

    .line 34
    .line 35
    iput-object p1, v0, Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;->D:Lk52;

    .line 36
    .line 37
    return-void

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
