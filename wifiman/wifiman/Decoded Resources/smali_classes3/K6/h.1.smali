.class public final LK6/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/c;


# instance fields
.field private final a:Lz2/a;


# direct methods
.method public constructor <init>(Lz2/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK6/h;->a:Lz2/a;

    return-void
.end method

.method public static a(Lz2/a;)LK6/h;
    .locals 1

    new-instance v0, LK6/h;

    invoke-direct {v0, p0}, LK6/h;-><init>(Lz2/a;)V

    return-object v0
.end method

.method public static c(LK6/a;)Landroid/bluetooth/BluetoothGatt;
    .locals 0

    invoke-static {p0}, LK6/d;->d(LK6/a;)Landroid/bluetooth/BluetoothGatt;

    move-result-object p0

    invoke-static {p0}, Ly2/e;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/bluetooth/BluetoothGatt;

    return-object p0
.end method


# virtual methods
.method public b()Landroid/bluetooth/BluetoothGatt;
    .locals 1

    iget-object v0, p0, LK6/h;->a:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LK6/a;

    invoke-static {v0}, LK6/h;->c(LK6/a;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LK6/h;->b()Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    return-object v0
.end method
