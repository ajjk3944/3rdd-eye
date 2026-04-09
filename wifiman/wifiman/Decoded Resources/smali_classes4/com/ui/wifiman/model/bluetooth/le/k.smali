.class public final Lcom/ui/wifiman/model/bluetooth/le/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/bluetooth/le/j$a;


# instance fields
.field private final a:Lyc/s;

.field private final b:Lcom/ui/wifiman/model/bluetooth/le/l$b;


# direct methods
.method public constructor <init>(Lyc/s;Lcom/ui/wifiman/model/bluetooth/le/l$b;)V
    .locals 1

    const-string v0, "ubntBeaconParser"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "microsoftBeaconParser"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/k;->a:Lyc/s;

    iput-object p2, p0, Lcom/ui/wifiman/model/bluetooth/le/k;->b:Lcom/ui/wifiman/model/bluetooth/le/l$b;

    return-void
.end method


# virtual methods
.method public a(Landroid/bluetooth/le/ScanResult;)Ljava/util/List;
    .locals 3

    const-string v0, "scanResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/k;->a:Lyc/s;

    invoke-virtual {v0, p1}, Lyc/s;->a(Landroid/bluetooth/le/ScanResult;)Lyc/r;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/le/k;->b:Lcom/ui/wifiman/model/bluetooth/le/l$b;

    invoke-virtual {v1, p1}, Lcom/ui/wifiman/model/bluetooth/le/l$b;->a(Landroid/bluetooth/le/ScanResult;)Lcom/ui/wifiman/model/bluetooth/le/l$a;

    move-result-object p1

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/ui/wifiman/model/bluetooth/le/j;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const/4 v0, 0x1

    aput-object p1, v1, v0

    invoke-static {v1}, LZg/v;->q([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
