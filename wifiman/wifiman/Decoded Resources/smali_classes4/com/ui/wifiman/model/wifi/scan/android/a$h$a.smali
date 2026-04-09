.class public final Lcom/ui/wifiman/model/wifi/scan/android/a$h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wifi/scan/android/a$h;->a(Ljava/lang/Long;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/wifi/scan/android/a;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/wifi/scan/android/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/wifi/scan/android/a$h$a;->a:Lcom/ui/wifiman/model/wifi/scan/android/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 3

    const-string v0, "WifiScanner"

    :try_start_0
    const-string v1, "WifiManager startScan()"

    invoke-static {v1, v0}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v1, p0, Lcom/ui/wifiman/model/wifi/scan/android/a$h$a;->a:Lcom/ui/wifiman/model/wifi/scan/android/a;

    invoke-static {v1}, Lcom/ui/wifiman/model/wifi/scan/android/a;->h(Lcom/ui/wifiman/model/wifi/scan/android/a;)Landroid/net/wifi/WifiManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/wifi/WifiManager;->startScan()Z
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v1

    :try_start_2
    const-string v2, "startScanError"

    invoke-static {v2, v1, v0}, LZ7/b;->c(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    :catch_1
    :goto_0
    invoke-interface {p1}, Lgg/c;->a()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
