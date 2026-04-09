.class public final synthetic Lyc/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/a;


# instance fields
.field public final synthetic a:Landroid/bluetooth/BluetoothDevice;


# direct methods
.method public synthetic constructor <init>(Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyc/e;->a:Landroid/bluetooth/BluetoothDevice;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lyc/e;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-static {v0}, Lcom/ui/wifiman/model/bluetooth/le/d;->g(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method
