.class public final synthetic Loa0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

.field public final synthetic h:Ld10;

.field public final synthetic i:Lvb;


# direct methods
.method public synthetic constructor <init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;Ld10;Lvb;I)V
    .locals 0

    .line 1
    iput p4, p0, Loa0;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Loa0;->g:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 4
    .line 5
    iput-object p2, p0, Loa0;->h:Ld10;

    .line 6
    .line 7
    iput-object p3, p0, Loa0;->i:Lvb;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget p1, p0, Loa0;->f:I

    .line 2
    .line 3
    iget-object v0, p0, Loa0;->i:Lvb;

    .line 4
    .line 5
    iget-object v1, p0, Loa0;->h:Ld10;

    .line 6
    .line 7
    iget-object v2, p0, Loa0;->g:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 8
    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object p1, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->d0:[I

    .line 13
    .line 14
    new-instance p1, Landroid/content/Intent;

    .line 15
    .line 16
    const-class v3, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;

    .line 17
    .line 18
    invoke-direct {p1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 19
    .line 20
    .line 21
    const-string v3, "scan_ip_arg"

    .line 22
    .line 23
    iget-object v1, v1, Ld10;->b:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p1, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lj6;->dismiss()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_0
    sget-object p1, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->d0:[I

    .line 36
    .line 37
    new-instance p1, Landroid/content/Intent;

    .line 38
    .line 39
    const-class v3, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;

    .line 40
    .line 41
    invoke-direct {p1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 42
    .line 43
    .line 44
    const-string v3, "ping_ip_arg"

    .line 45
    .line 46
    iget-object v1, v1, Ld10;->b:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {p1, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Lj6;->dismiss()V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
