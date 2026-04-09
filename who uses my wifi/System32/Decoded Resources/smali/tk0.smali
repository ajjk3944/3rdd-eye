.class public final synthetic Ltk0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Ltk0;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Ltk0;->g:Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget p1, p0, Ltk0;->f:I

    .line 2
    .line 3
    iget-object v0, p0, Ltk0;->g:Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget p1, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->L:I

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->y()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object p1, v0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->G:Lvy2;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    iput-boolean v0, p1, Lvy2;->b:Z

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const-string p1, "ping"

    .line 23
    .line 24
    invoke-static {p1}, Li30;->S(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    throw p1

    .line 29
    :pswitch_1
    sget p1, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->L:I

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->y()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_2
    sget p1, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->L:I

    .line 36
    .line 37
    invoke-virtual {v0}, Lch;->i()Laj0;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Laj0;->c()V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
