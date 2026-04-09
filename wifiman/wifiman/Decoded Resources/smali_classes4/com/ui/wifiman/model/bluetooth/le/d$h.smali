.class public final Lcom/ui/wifiman/model/bluetooth/le/d$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/bluetooth/le/d;->a(Lh9/a;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/bluetooth/le/d;

.field final synthetic b:Lh9/a;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/bluetooth/le/d;Lh9/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/d$h;->a:Lcom/ui/wifiman/model/bluetooth/le/d;

    iput-object p2, p0, Lcom/ui/wifiman/model/bluetooth/le/d$h;->b:Lh9/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/d$h;->a:Lcom/ui/wifiman/model/bluetooth/le/d;

    invoke-static {v0}, Lcom/ui/wifiman/model/bluetooth/le/d;->m(Lcom/ui/wifiman/model/bluetooth/le/d;)Landroid/bluetooth/BluetoothManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothManager;->getAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/le/d$h;->b:Lh9/a;

    invoke-virtual {v1}, Lh9/a;->g()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothAdapter;->getRemoteDevice([B)Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
