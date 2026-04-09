.class final Lcom/ui/wifiman/model/bluetooth/le/f$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/h;


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

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/f$j;->a:Lcom/ui/wifiman/model/bluetooth/le/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Ljava/util/Map$Entry;)Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/bluetooth/le/f$j;->d(Ljava/util/Map$Entry;)Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Ljava/util/Map$Entry;)Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    check-cast p2, Lcom/ui/wifiman/model/vendor/d$a;

    check-cast p3, LAc/a$a;

    check-cast p4, Lwa/a;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ui/wifiman/model/bluetooth/le/f$j;->c(LYg/s;Lcom/ui/wifiman/model/vendor/d$a;LAc/a$a;Lwa/a;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final c(LYg/s;Lcom/ui/wifiman/model/vendor/d$a;LAc/a$a;Lwa/a;)Ljava/util/List;
    .locals 10

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "vendorDirectory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bluetoothVendorDir"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "catalogBrowser"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "component1(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/List;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    const-string v1, "component2(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/List;

    iget-object v7, p0, Lcom/ui/wifiman/model/bluetooth/le/f$j;->a:Lcom/ui/wifiman/model/bluetooth/le/f;

    invoke-static {}, LZg/U;->c()Ljava/util/Map;

    move-result-object v8

    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Landroid/bluetooth/le/ScanResult;

    invoke-virtual {v3}, Landroid/bluetooth/le/ScanResult;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {v9, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-virtual {v3}, Landroid/bluetooth/le/ScanResult;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    const-string v1, "getDevice(...)"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v7

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-static/range {v1 .. v6}, Lcom/ui/wifiman/model/bluetooth/le/f;->f(Lcom/ui/wifiman/model/bluetooth/le/f;Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/le/ScanResult;Lcom/ui/wifiman/model/vendor/d$a;LAc/a$a;Lwa/a;)Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->c()Lh9/a;

    move-result-object v2

    invoke-interface {v8, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    move-object v2, p3

    check-cast v2, Landroid/bluetooth/BluetoothDevice;

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p3

    if-eqz p3, :cond_4

    invoke-virtual {v9, p3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/bluetooth/le/ScanResult;

    :goto_2
    move-object v3, p3

    goto :goto_3

    :cond_4
    const/4 p3, 0x0

    goto :goto_2

    :goto_3
    const/4 v5, 0x0

    move-object v1, v7

    move-object v4, p2

    move-object v6, p4

    invoke-static/range {v1 .. v6}, Lcom/ui/wifiman/model/bluetooth/le/f;->f(Lcom/ui/wifiman/model/bluetooth/le/f;Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/le/ScanResult;Lcom/ui/wifiman/model/vendor/d$a;LAc/a$a;Lwa/a;)Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;

    move-result-object p3

    if-eqz p3, :cond_3

    invoke-virtual {p3}, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->c()Lh9/a;

    move-result-object v0

    invoke-interface {v8, v0, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_5
    invoke-static {v8}, LZg/U;->b(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    invoke-static {p1}, LZg/U;->y(Ljava/util/Map;)Lzi/j;

    move-result-object p1

    new-instance p2, Lcom/ui/wifiman/model/bluetooth/le/h;

    invoke-direct {p2}, Lcom/ui/wifiman/model/bluetooth/le/h;-><init>()V

    invoke-static {p1, p2}, Lzi/m;->N(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object p1

    invoke-static {p1}, Lzi/m;->Z(Lzi/j;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
