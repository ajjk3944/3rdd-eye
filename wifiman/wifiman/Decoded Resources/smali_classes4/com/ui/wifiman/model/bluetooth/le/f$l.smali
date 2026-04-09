.class final Lcom/ui/wifiman/model/bluetooth/le/f$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/bluetooth/le/f;-><init>(Landroid/bluetooth/BluetoothManager;Lwc/d;Lcom/ui/wifiman/model/vendor/d$b;LAc/a;Lxa/o;Landroid/content/pm/PackageManager;Lcom/ui/wifiman/model/bluetooth/le/j$a;Lcom/ui/wifiman/model/android/permissions/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/bluetooth/le/f;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/bluetooth/le/f;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/f$l;->a:Lcom/ui/wifiman/model/bluetooth/le/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lwc/d$b;)LDj/a;
    .locals 2

    const-string v0, "receiverStatus"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lwc/d$b$b;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/f$l;->a:Lcom/ui/wifiman/model/bluetooth/le/f;

    invoke-static {v0}, Lcom/ui/wifiman/model/bluetooth/le/f;->i(Lcom/ui/wifiman/model/bluetooth/le/f;)Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "android.hardware.bluetooth_le"

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lwc/d$b$a;

    if-eqz v0, :cond_1

    check-cast p1, Lwc/d$b$a;

    invoke-virtual {p1}, Lwc/d$b$a;->a()Lwc/d$a;

    move-result-object p1

    sget-object v0, Lwc/d$a;->STATE_ON:Lwc/d$a;

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/f$l;->a:Lcom/ui/wifiman/model/bluetooth/le/f;

    invoke-static {p1}, Lcom/ui/wifiman/model/bluetooth/le/f;->j(Lcom/ui/wifiman/model/bluetooth/le/f;)Lgg/i;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    const-string v0, "just(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    :goto_0
    new-instance p1, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error$BluetoothNotAvailableOnDevice;

    invoke-direct {p1}, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error$BluetoothNotAvailableOnDevice;-><init>()V

    invoke-static {p1}, Lgg/i;->k0(Ljava/lang/Throwable;)Lgg/i;

    move-result-object p1

    const-string v0, "error(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lwc/d$b;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/bluetooth/le/f$l;->a(Lwc/d$b;)LDj/a;

    move-result-object p1

    return-object p1
.end method
