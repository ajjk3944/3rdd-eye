.class public final synthetic Lyc/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/u;


# instance fields
.field public final synthetic a:Landroid/bluetooth/BluetoothDevice;

.field public final synthetic b:Lcom/ui/wifiman/model/bluetooth/le/d;


# direct methods
.method public synthetic constructor <init>(Landroid/bluetooth/BluetoothDevice;Lcom/ui/wifiman/model/bluetooth/le/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyc/c;->a:Landroid/bluetooth/BluetoothDevice;

    iput-object p2, p0, Lyc/c;->b:Lcom/ui/wifiman/model/bluetooth/le/d;

    return-void
.end method


# virtual methods
.method public final a(Lgg/t;)V
    .locals 2

    iget-object v0, p0, Lyc/c;->a:Landroid/bluetooth/BluetoothDevice;

    iget-object v1, p0, Lyc/c;->b:Lcom/ui/wifiman/model/bluetooth/le/d;

    invoke-static {v0, v1, p1}, Lcom/ui/wifiman/model/bluetooth/le/d;->c(Landroid/bluetooth/BluetoothDevice;Lcom/ui/wifiman/model/bluetooth/le/d;Lgg/t;)V

    return-void
.end method
