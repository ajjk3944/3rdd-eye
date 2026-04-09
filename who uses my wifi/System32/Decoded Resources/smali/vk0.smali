.class public final synthetic Lvk0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Li5;


# direct methods
.method public synthetic constructor <init>(Li5;I)V
    .locals 0

    .line 1
    iput p2, p0, Lvk0;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lvk0;->g:Li5;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    iget p1, p0, Lvk0;->f:I

    .line 2
    .line 3
    iget-object v0, p0, Lvk0;->g:Li5;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;

    .line 9
    .line 10
    sget p1, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->K:I

    .line 11
    .line 12
    :try_start_0
    invoke-virtual {v0}, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->y()Lh2;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object p1, p1, Lh2;->i:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, Lp21;

    .line 19
    .line 20
    iget-object p1, p1, Lp21;->i:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catch_0
    move-exception p1

    .line 29
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 30
    .line 31
    .line 32
    :goto_0
    return-void

    .line 33
    :pswitch_0
    check-cast v0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;

    .line 34
    .line 35
    sget p1, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->L:I

    .line 36
    .line 37
    :try_start_1
    iget-object p1, v0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->D:Lg2;

    .line 38
    .line 39
    if-eqz p1, :cond_0

    .line 40
    .line 41
    iget-object p1, p1, Lg2;->h:Lp21;

    .line 42
    .line 43
    iget-object p1, p1, Lp21;->i:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 46
    .line 47
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 48
    .line 49
    .line 50
    goto :goto_2

    .line 51
    :catch_1
    move-exception p1

    .line 52
    goto :goto_1

    .line 53
    :cond_0
    const-string p1, "binding"

    .line 54
    .line 55
    invoke-static {p1}, Li30;->S(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const/4 p1, 0x0

    .line 59
    throw p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 60
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 61
    .line 62
    .line 63
    :goto_2
    return-void

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
