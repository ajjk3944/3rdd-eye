.class public final synthetic LM6/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/q;


# instance fields
.field public final synthetic a:Landroid/bluetooth/BluetoothGatt;

.field public final synthetic b:Lgg/y;


# direct methods
.method public synthetic constructor <init>(Landroid/bluetooth/BluetoothGatt;Lgg/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM6/t;->a:Landroid/bluetooth/BluetoothGatt;

    iput-object p2, p0, LM6/t;->b:Lgg/y;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LM6/t;->a:Landroid/bluetooth/BluetoothGatt;

    iget-object v1, p0, LM6/t;->b:Lgg/y;

    invoke-static {v0, v1}, LM6/w;->l(Landroid/bluetooth/BluetoothGatt;Lgg/y;)Lgg/D;

    move-result-object v0

    return-object v0
.end method
