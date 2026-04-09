.class final Lcom/ui/wifiman/model/bluetooth/classic/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/bluetooth/classic/a;-><init>(Landroid/content/Context;Landroid/bluetooth/BluetoothManager;Lwc/d;Ltc/a;Lcom/ui/wifiman/model/vendor/d$b;Lcom/ui/wifiman/model/android/permissions/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/bluetooth/classic/a;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/bluetooth/classic/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/classic/a$b;->a:Lcom/ui/wifiman/model/bluetooth/classic/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)Lgg/r;
    .locals 5

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Intent;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    const-string v1, "component2(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/ui/wifiman/model/vendor/d$a;

    const-string v1, "android.bluetooth.device.extra.DEVICE"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x21

    if-lt v2, v4, :cond_0

    const-class v2, Landroid/bluetooth/BluetoothDevice;

    invoke-static {v0, v1, v2}, Lo5/E;->a(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/bluetooth/BluetoothDevice;

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Landroid/bluetooth/BluetoothDevice;

    goto :goto_0

    :cond_1
    move-object v1, v3

    :goto_0
    if-eqz v1, :cond_3

    const-string v2, "android.bluetooth.device.extra.RSSI"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v3, -0x5a

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->getShortExtra(Ljava/lang/String;S)S

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    :cond_2
    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/classic/a$b;->a:Lcom/ui/wifiman/model/bluetooth/classic/a;

    new-instance v2, Lcom/ui/wifiman/model/bluetooth/classic/a$b$a;

    invoke-direct {v2, v0, v1, v3, p1}, Lcom/ui/wifiman/model/bluetooth/classic/a$b$a;-><init>(Lcom/ui/wifiman/model/bluetooth/classic/a;Landroid/bluetooth/BluetoothDevice;Ljava/lang/Integer;Lcom/ui/wifiman/model/vendor/d$a;)V

    invoke-static {v2}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    invoke-static {}, Lgg/n;->h()Lgg/n;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_1
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/bluetooth/classic/a$b;->a(LYg/s;)Lgg/r;

    move-result-object p1

    return-object p1
.end method
