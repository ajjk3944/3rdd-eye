.class public final synthetic Lja0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic f:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

.field public final synthetic g:Ld10;


# direct methods
.method public synthetic constructor <init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;Ld10;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lja0;->f:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 5
    .line 6
    iput-object p2, p0, Lja0;->g:Ld10;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .line 1
    sget-object v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->d0:[I

    .line 2
    .line 3
    iget-object v0, p0, Lja0;->f:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 4
    .line 5
    iget-object v1, p0, Lja0;->g:Ld10;

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    new-instance p2, Landroid/content/Intent;

    .line 10
    .line 11
    const-class v2, Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;

    .line 12
    .line 13
    invoke-direct {p2, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 14
    .line 15
    .line 16
    const-string v2, "ping_ip_arg"

    .line 17
    .line 18
    iget-object v1, v1, Ld10;->b:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {p2, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-string p2, "clipboard"

    .line 28
    .line 29
    invoke-virtual {v0, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    const-string v2, "null cannot be cast to non-null type android.content.ClipboardManager"

    .line 34
    .line 35
    invoke-static {p2, v2}, Li30;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    check-cast p2, Landroid/content/ClipboardManager;

    .line 39
    .line 40
    iget-object v1, v1, Ld10;->b:Ljava/lang/String;

    .line 41
    .line 42
    new-instance v2, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v3, "http://"

    .line 45
    .line 46
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    const-string v3, "URI"

    .line 65
    .line 66
    invoke-static {v2, v3, v1}, Landroid/content/ClipData;->newUri(Landroid/content/ContentResolver;Ljava/lang/CharSequence;Landroid/net/Uri;)Landroid/content/ClipData;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    const-string v2, "newUri(...)"

    .line 71
    .line 72
    invoke-static {v1, v2}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p2, v1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    const v1, 0x7f120123

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    const/4 v1, 0x0

    .line 90
    invoke-static {p2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    invoke-virtual {p2}, Landroid/widget/Toast;->show()V

    .line 95
    .line 96
    .line 97
    :goto_0
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 98
    .line 99
    .line 100
    return-void
.end method
