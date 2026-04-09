.class public LK6/D;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final a:LK6/F;


# direct methods
.method public constructor <init>(LK6/F;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK6/D;->a:LK6/F;

    return-void
.end method


# virtual methods
.method public a(Landroid/bluetooth/BluetoothGattCharacteristic;I)Lgg/b;
    .locals 1

    new-instance v0, LK6/D$a;

    invoke-direct {v0, p0, p1, p2}, LK6/D$a;-><init>(LK6/D;Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    invoke-static {v0}, Lgg/b;->E(Lkg/a;)Lgg/b;

    move-result-object p1

    return-object p1
.end method
