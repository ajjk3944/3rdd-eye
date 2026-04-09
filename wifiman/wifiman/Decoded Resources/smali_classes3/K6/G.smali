.class public LK6/G;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LP6/i;


# direct methods
.method public constructor <init>(LP6/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK6/G;->a:LP6/i;

    return-void
.end method


# virtual methods
.method public a(Landroid/bluetooth/BluetoothGattCharacteristic;I)Ljava/lang/String;
    .locals 4

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v1

    invoke-static {v1}, LL6/b;->g(Ljava/util/UUID;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, LK6/G;->a:LP6/i;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getProperties()I

    move-result v3

    invoke-virtual {v2, v3}, LP6/i;->c(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getProperties()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object v3, p0, LK6/G;->a:LP6/i;

    invoke-virtual {v3, p2}, LP6/i;->c(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    filled-new-array {v1, v2, p1, v3, p2}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "Characteristic %s supports properties: %s (%d) does not have any property matching %s (%d)"

    invoke-static {v0, p2, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
