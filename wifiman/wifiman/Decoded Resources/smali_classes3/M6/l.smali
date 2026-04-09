.class public LM6/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM6/k;


# instance fields
.field private final a:LK6/l0;

.field private final b:Landroid/bluetooth/BluetoothGatt;

.field private final c:LL6/c;

.field private final d:LM6/x;

.field private final e:Lgg/y;

.field private final f:Lgg/y;

.field private final g:Lz2/a;


# direct methods
.method constructor <init>(LK6/l0;Landroid/bluetooth/BluetoothGatt;LL6/c;LM6/x;Lgg/y;Lgg/y;Lz2/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM6/l;->a:LK6/l0;

    iput-object p2, p0, LM6/l;->b:Landroid/bluetooth/BluetoothGatt;

    iput-object p3, p0, LM6/l;->c:LL6/c;

    iput-object p4, p0, LM6/l;->d:LM6/x;

    iput-object p5, p0, LM6/l;->e:Lgg/y;

    iput-object p6, p0, LM6/l;->f:Lgg/y;

    iput-object p7, p0, LM6/l;->g:Lz2/a;

    return-void
.end method


# virtual methods
.method public a(I)LM6/i;
    .locals 4

    new-instance v0, LM6/i;

    iget-object v1, p0, LM6/l;->a:LK6/l0;

    iget-object v2, p0, LM6/l;->b:Landroid/bluetooth/BluetoothGatt;

    iget-object v3, p0, LM6/l;->d:LM6/x;

    invoke-direct {v0, v1, v2, v3, p1}, LM6/i;-><init>(LK6/l0;Landroid/bluetooth/BluetoothGatt;LM6/x;I)V

    return-object v0
.end method

.method public b(Landroid/bluetooth/BluetoothGattDescriptor;[B)LM6/f;
    .locals 8

    new-instance v7, LM6/f;

    iget-object v1, p0, LM6/l;->a:LK6/l0;

    iget-object v2, p0, LM6/l;->b:Landroid/bluetooth/BluetoothGatt;

    iget-object v3, p0, LM6/l;->d:LM6/x;

    const/4 v4, 0x2

    move-object v0, v7

    move-object v5, p1

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, LM6/f;-><init>(LK6/l0;Landroid/bluetooth/BluetoothGatt;LM6/x;ILandroid/bluetooth/BluetoothGattDescriptor;[B)V

    return-object v7
.end method

.method public c(Landroid/bluetooth/BluetoothGattCharacteristic;LG6/N$c;LG6/N$d;LK6/i0;[B)LM6/a;
    .locals 12

    move-object v0, p0

    new-instance v11, LM6/a;

    iget-object v2, v0, LM6/l;->b:Landroid/bluetooth/BluetoothGatt;

    iget-object v3, v0, LM6/l;->a:LK6/l0;

    iget-object v4, v0, LM6/l;->e:Lgg/y;

    iget-object v5, v0, LM6/l;->d:LM6/x;

    move-object v1, v11

    move-object v6, p1

    move-object/from16 v7, p4

    move-object v8, p2

    move-object v9, p3

    move-object/from16 v10, p5

    invoke-direct/range {v1 .. v10}, LM6/a;-><init>(Landroid/bluetooth/BluetoothGatt;LK6/l0;Lgg/y;LM6/x;Landroid/bluetooth/BluetoothGattCharacteristic;LK6/i0;LG6/N$c;LG6/N$d;[B)V

    return-object v11
.end method

.method public d()LM6/n;
    .locals 1

    iget-object v0, p0, LM6/l;->g:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM6/n;

    return-object v0
.end method

.method public e(JLjava/util/concurrent/TimeUnit;)LM6/w;
    .locals 6

    new-instance v0, LM6/w;

    iget-object v1, p0, LM6/l;->a:LK6/l0;

    iget-object v2, p0, LM6/l;->b:Landroid/bluetooth/BluetoothGatt;

    iget-object v3, p0, LM6/l;->c:LL6/c;

    new-instance v4, LM6/x;

    iget-object v5, p0, LM6/l;->f:Lgg/y;

    invoke-direct {v4, p1, p2, p3, v5}, LM6/x;-><init>(JLjava/util/concurrent/TimeUnit;Lgg/y;)V

    invoke-direct {v0, v1, v2, v3, v4}, LM6/w;-><init>(LK6/l0;Landroid/bluetooth/BluetoothGatt;LL6/c;LM6/x;)V

    return-object v0
.end method

.method public f(Landroid/bluetooth/BluetoothGattCharacteristic;[B)LM6/b;
    .locals 7

    new-instance v6, LM6/b;

    iget-object v1, p0, LM6/l;->a:LK6/l0;

    iget-object v2, p0, LM6/l;->b:Landroid/bluetooth/BluetoothGatt;

    iget-object v3, p0, LM6/l;->d:LM6/x;

    move-object v0, v6

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LM6/b;-><init>(LK6/l0;Landroid/bluetooth/BluetoothGatt;LM6/x;Landroid/bluetooth/BluetoothGattCharacteristic;[B)V

    return-object v6
.end method

.method public g(IJLjava/util/concurrent/TimeUnit;)LM6/e;
    .locals 7

    new-instance v6, LM6/e;

    iget-object v1, p0, LM6/l;->a:LK6/l0;

    iget-object v2, p0, LM6/l;->b:Landroid/bluetooth/BluetoothGatt;

    iget-object v3, p0, LM6/l;->d:LM6/x;

    new-instance v5, LM6/x;

    iget-object v0, p0, LM6/l;->f:Lgg/y;

    invoke-direct {v5, p2, p3, p4, v0}, LM6/x;-><init>(JLjava/util/concurrent/TimeUnit;Lgg/y;)V

    move-object v0, v6

    move v4, p1

    invoke-direct/range {v0 .. v5}, LM6/e;-><init>(LK6/l0;Landroid/bluetooth/BluetoothGatt;LM6/x;ILM6/x;)V

    return-object v6
.end method
