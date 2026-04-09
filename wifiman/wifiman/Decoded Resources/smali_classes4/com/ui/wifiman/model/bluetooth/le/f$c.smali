.class public final Lcom/ui/wifiman/model/bluetooth/le/f$c;
.super Landroid/bluetooth/le/ScanCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/bluetooth/le/f;-><init>(Landroid/bluetooth/BluetoothManager;Lwc/d;Lcom/ui/wifiman/model/vendor/d$b;LAc/a;Lxa/o;Landroid/content/pm/PackageManager;Lcom/ui/wifiman/model/bluetooth/le/j$a;Lcom/ui/wifiman/model/android/permissions/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lgg/j;


# direct methods
.method constructor <init>(Lgg/j;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/f$c;->a:Lgg/j;

    invoke-direct {p0}, Landroid/bluetooth/le/ScanCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onBatchScanResults(Ljava/util/List;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/bluetooth/le/ScanCallback;->onBatchScanResults(Ljava/util/List;)V

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/f$c;->a:Lgg/j;

    invoke-interface {v0, p1}, Lgg/h;->h(Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onScanFailed(I)V
    .locals 3

    invoke-super {p0, p1}, Landroid/bluetooth/le/ScanCallback;->onScanFailed(I)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BLeScan - Scanner error "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/f$c;->a:Lgg/j;

    const/4 v1, 0x1

    if-eq p1, v1, :cond_3

    if-eq p1, v2, :cond_2

    const/4 v1, 0x3

    if-eq p1, v1, :cond_1

    const/4 v1, 0x4

    if-eq p1, v1, :cond_0

    new-instance p1, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error$Unknown;

    invoke-direct {p1}, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error$Unknown;-><init>()V

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error$FeatureUnsupported;

    invoke-direct {p1}, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error$FeatureUnsupported;-><init>()V

    goto :goto_0

    :cond_1
    new-instance p1, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error$InternalError;

    invoke-direct {p1}, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error$InternalError;-><init>()V

    goto :goto_0

    :cond_2
    new-instance p1, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error$ApplicationRegistrationFailed;

    invoke-direct {p1}, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error$ApplicationRegistrationFailed;-><init>()V

    goto :goto_0

    :cond_3
    new-instance p1, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error$MultipleScanningAtOnceNotSupported;

    invoke-direct {p1}, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error$MultipleScanningAtOnceNotSupported;-><init>()V

    :goto_0
    invoke-interface {v0, p1}, Lgg/j;->c(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public onScanResult(ILandroid/bluetooth/le/ScanResult;)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/bluetooth/le/ScanCallback;->onScanResult(ILandroid/bluetooth/le/ScanResult;)V

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/f$c;->a:Lgg/j;

    invoke-static {p2}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p1, p2}, Lgg/h;->h(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
