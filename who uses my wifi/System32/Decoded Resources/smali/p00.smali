.class public final synthetic Lp00;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lcom/phuongpn/whousemywifi/networkscanner/HelpActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/phuongpn/whousemywifi/networkscanner/HelpActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lp00;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lp00;->g:Lcom/phuongpn/whousemywifi/networkscanner/HelpActivity;

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
    .locals 4

    .line 1
    iget v0, p0, Lp00;->f:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "binding"

    .line 5
    .line 6
    iget-object v3, p0, Lp00;->g:Lcom/phuongpn/whousemywifi/networkscanner/HelpActivity;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, v3, Lcom/phuongpn/whousemywifi/networkscanner/HelpActivity;->C:Lp21;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, v0, Lp21;->f:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Landroid/widget/FrameLayout;

    .line 18
    .line 19
    const/16 v1, 0x8

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-static {v2}, Li30;->S(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw v1

    .line 29
    :pswitch_0
    sget v0, Lcom/phuongpn/whousemywifi/networkscanner/HelpActivity;->F:I

    .line 30
    .line 31
    :try_start_0
    iget-object v0, v3, Lcom/phuongpn/whousemywifi/networkscanner/HelpActivity;->C:Lp21;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    iget-object v0, v0, Lp21;->f:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Landroid/widget/FrameLayout;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_2

    .line 44
    .line 45
    new-instance v0, Lp00;

    .line 46
    .line 47
    const/4 v1, 0x1

    .line 48
    invoke-direct {v0, v3, v1}, Lp00;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/HelpActivity;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :catch_0
    move-exception v0

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-static {v2}, Li30;->S(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 62
    .line 63
    .line 64
    :cond_2
    :goto_1
    return-void

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
