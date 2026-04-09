.class public LN6/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LP6/I;

.field private final b:LN6/j;


# direct methods
.method public constructor <init>(LP6/I;LN6/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN6/f;->a:LP6/I;

    iput-object p2, p0, LN6/f;->b:LN6/j;

    return-void
.end method

.method private static d(I)LQ6/c;
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string/jumbo v0, "Unknown callback type %d -> check android.bluetooth.le.ScanSettings"

    invoke-static {v0, p0}, LI6/q;->q(Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p0, LQ6/c;->CALLBACK_TYPE_UNKNOWN:LQ6/c;

    return-object p0

    :cond_0
    sget-object p0, LQ6/c;->CALLBACK_TYPE_MATCH_LOST:LQ6/c;

    return-object p0

    :cond_1
    sget-object p0, LQ6/c;->CALLBACK_TYPE_FIRST_MATCH:LQ6/c;

    return-object p0

    :cond_2
    sget-object p0, LQ6/c;->CALLBACK_TYPE_ALL_MATCHES:LQ6/c;

    return-object p0
.end method


# virtual methods
.method public a(ILandroid/bluetooth/le/ScanResult;)LN6/o;
    .locals 9

    new-instance v5, LN6/x;

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getScanRecord()Landroid/bluetooth/le/ScanRecord;

    move-result-object v0

    iget-object v1, p0, LN6/f;->a:LP6/I;

    invoke-direct {v5, v0, v1}, LN6/x;-><init>(Landroid/bluetooth/le/ScanRecord;LP6/I;)V

    new-instance v8, LN6/o;

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getRssi()I

    move-result v2

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getTimestampNanos()J

    move-result-wide v3

    invoke-static {p1}, LN6/f;->d(I)LQ6/c;

    move-result-object v6

    iget-object p1, p0, LN6/f;->b:LN6/j;

    invoke-interface {p1, p2}, LN6/j;->a(Landroid/bluetooth/le/ScanResult;)LQ6/b;

    move-result-object v7

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, LN6/o;-><init>(Landroid/bluetooth/BluetoothDevice;IJLQ6/e;LQ6/c;LQ6/b;)V

    return-object v8
.end method

.method public b(Landroid/bluetooth/BluetoothDevice;I[B)LN6/o;
    .locals 9

    iget-object v0, p0, LN6/f;->a:LP6/I;

    invoke-virtual {v0, p3}, LP6/I;->b([B)LQ6/e;

    move-result-object v6

    new-instance p3, LN6/o;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    sget-object v7, LQ6/c;->CALLBACK_TYPE_UNSPECIFIED:LQ6/c;

    sget-object v8, LQ6/b;->LEGACY_UNKNOWN:LQ6/b;

    move-object v1, p3

    move-object v2, p1

    move v3, p2

    invoke-direct/range {v1 .. v8}, LN6/o;-><init>(Landroid/bluetooth/BluetoothDevice;IJLQ6/e;LQ6/c;LQ6/b;)V

    return-object p3
.end method

.method public c(Landroid/bluetooth/le/ScanResult;)LN6/o;
    .locals 9

    new-instance v5, LN6/x;

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getScanRecord()Landroid/bluetooth/le/ScanRecord;

    move-result-object v0

    iget-object v1, p0, LN6/f;->a:LP6/I;

    invoke-direct {v5, v0, v1}, LN6/x;-><init>(Landroid/bluetooth/le/ScanRecord;LP6/I;)V

    new-instance v8, LN6/o;

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getRssi()I

    move-result v2

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getTimestampNanos()J

    move-result-wide v3

    sget-object v6, LQ6/c;->CALLBACK_TYPE_BATCH:LQ6/c;

    iget-object v0, p0, LN6/f;->b:LN6/j;

    invoke-interface {v0, p1}, LN6/j;->a(Landroid/bluetooth/le/ScanResult;)LQ6/b;

    move-result-object v7

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, LN6/o;-><init>(Landroid/bluetooth/BluetoothDevice;IJLQ6/e;LQ6/c;LQ6/b;)V

    return-object v8
.end method
