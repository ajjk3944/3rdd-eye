.class public final synthetic LM6/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# instance fields
.field public final synthetic a:Landroid/bluetooth/BluetoothGatt;


# direct methods
.method public synthetic constructor <init>(Landroid/bluetooth/BluetoothGatt;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM6/u;->a:Landroid/bluetooth/BluetoothGatt;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LM6/u;->a:Landroid/bluetooth/BluetoothGatt;

    check-cast p1, Ljava/lang/Long;

    invoke-static {v0, p1}, LM6/w;->j(Landroid/bluetooth/BluetoothGatt;Ljava/lang/Long;)Lgg/z;

    move-result-object p1

    return-object p1
.end method
