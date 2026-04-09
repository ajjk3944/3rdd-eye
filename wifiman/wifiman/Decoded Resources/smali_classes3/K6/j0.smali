.class public LK6/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG6/N;


# instance fields
.field private final a:LO6/d;

.field final b:LK6/l0;

.field final c:Landroid/bluetooth/BluetoothGatt;

.field private final d:LM6/k;

.field private final e:Lz2/a;

.field final f:Lgg/y;

.field private final g:LK6/n0;

.field private final h:LK6/g0;

.field private final i:LK6/P;

.field private final j:LK6/w;

.field private final k:LK6/D;


# direct methods
.method public constructor <init>(LO6/d;LK6/l0;Landroid/bluetooth/BluetoothGatt;LK6/n0;LK6/g0;LK6/P;LK6/w;LM6/k;Lz2/a;Lgg/y;LK6/D;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK6/j0;->a:LO6/d;

    iput-object p2, p0, LK6/j0;->b:LK6/l0;

    iput-object p3, p0, LK6/j0;->c:Landroid/bluetooth/BluetoothGatt;

    iput-object p4, p0, LK6/j0;->g:LK6/n0;

    iput-object p5, p0, LK6/j0;->h:LK6/g0;

    iput-object p6, p0, LK6/j0;->i:LK6/P;

    iput-object p7, p0, LK6/j0;->j:LK6/w;

    iput-object p8, p0, LK6/j0;->d:LM6/k;

    iput-object p9, p0, LK6/j0;->e:Lz2/a;

    iput-object p10, p0, LK6/j0;->f:Lgg/y;

    iput-object p11, p0, LK6/j0;->k:LK6/D;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, LK6/j0;->i:LK6/P;

    invoke-interface {v0}, LK6/P;->a()I

    move-result v0

    return v0
.end method

.method public b()Lgg/z;
    .locals 4

    iget-object v0, p0, LK6/j0;->g:LK6/n0;

    const-wide/16 v1, 0x14

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, LK6/n0;->a(JLjava/util/concurrent/TimeUnit;)Lgg/z;

    move-result-object v0

    return-object v0
.end method

.method public c()LG6/N$a;
    .locals 1

    iget-object v0, p0, LK6/j0;->e:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LG6/N$a;

    return-object v0
.end method

.method public d(IJLjava/util/concurrent/TimeUnit;)Lgg/b;
    .locals 2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Connection priority must have valid value from BluetoothGatt (received "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Lgg/b;->D(Ljava/lang/Throwable;)Lgg/b;

    move-result-object p1

    return-object p1

    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-gtz v0, :cond_1

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Delay must be bigger than 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lgg/b;->D(Ljava/lang/Throwable;)Lgg/b;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object v0, p0, LK6/j0;->a:LO6/d;

    iget-object v1, p0, LK6/j0;->d:LM6/k;

    invoke-interface {v1, p1, p2, p3, p4}, LM6/k;->g(IJLjava/util/concurrent/TimeUnit;)LM6/e;

    move-result-object p1

    invoke-interface {v0, p1}, LO6/a;->a(LM6/j;)Lgg/s;

    move-result-object p1

    invoke-virtual {p1}, Lgg/s;->f0()Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public e(I)Lgg/z;
    .locals 2

    iget-object v0, p0, LK6/j0;->a:LO6/d;

    iget-object v1, p0, LK6/j0;->d:LM6/k;

    invoke-interface {v1, p1}, LM6/k;->a(I)LM6/i;

    move-result-object p1

    invoke-interface {v0, p1}, LO6/a;->a(LM6/j;)Lgg/s;

    move-result-object p1

    invoke-virtual {p1}, Lgg/s;->P()Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public f(Landroid/bluetooth/BluetoothGattCharacteristic;[B)Lgg/z;
    .locals 3

    iget-object v0, p0, LK6/j0;->k:LK6/D;

    const/16 v1, 0x4c

    invoke-virtual {v0, p1, v1}, LK6/D;->a(Landroid/bluetooth/BluetoothGattCharacteristic;I)Lgg/b;

    move-result-object v0

    iget-object v1, p0, LK6/j0;->a:LO6/d;

    iget-object v2, p0, LK6/j0;->d:LM6/k;

    invoke-interface {v2, p1, p2}, LM6/k;->f(Landroid/bluetooth/BluetoothGattCharacteristic;[B)LM6/b;

    move-result-object p1

    invoke-interface {v1, p1}, LO6/a;->a(LM6/j;)Lgg/s;

    move-result-object p1

    invoke-virtual {v0, p1}, Lgg/b;->j(Lgg/v;)Lgg/s;

    move-result-object p1

    invoke-virtual {p1}, Lgg/s;->P()Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public g()Lgg/z;
    .locals 2

    iget-object v0, p0, LK6/j0;->a:LO6/d;

    iget-object v1, p0, LK6/j0;->d:LM6/k;

    invoke-interface {v1}, LM6/k;->d()LM6/n;

    move-result-object v1

    invoke-interface {v0, v1}, LO6/a;->a(LM6/j;)Lgg/s;

    move-result-object v0

    invoke-virtual {v0}, Lgg/s;->P()Lgg/z;

    move-result-object v0

    return-object v0
.end method

.method public h(Landroid/bluetooth/BluetoothGattCharacteristic;)Lgg/s;
    .locals 1

    sget-object v0, LG6/C;->DEFAULT:LG6/C;

    invoke-virtual {p0, p1, v0}, LK6/j0;->i(Landroid/bluetooth/BluetoothGattCharacteristic;LG6/C;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public i(Landroid/bluetooth/BluetoothGattCharacteristic;LG6/C;)Lgg/s;
    .locals 3

    iget-object v0, p0, LK6/j0;->k:LK6/D;

    const/16 v1, 0x10

    invoke-virtual {v0, p1, v1}, LK6/D;->a(Landroid/bluetooth/BluetoothGattCharacteristic;I)Lgg/b;

    move-result-object v0

    iget-object v1, p0, LK6/j0;->h:LK6/g0;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, p2, v2}, LK6/g0;->x(Landroid/bluetooth/BluetoothGattCharacteristic;LG6/C;Z)Lgg/s;

    move-result-object p1

    invoke-virtual {v0, p1}, Lgg/b;->j(Lgg/v;)Lgg/s;

    move-result-object p1

    return-object p1
.end method
