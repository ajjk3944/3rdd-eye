.class public abstract LK6/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static a()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method static b(I)I
    .locals 1

    const/16 v0, 0x21

    if-lt p0, v0, :cond_0

    const/16 p0, 0x200

    return p0

    :cond_0
    const/16 p0, 0x258

    return p0
.end method

.method static c()I
    .locals 1

    const/16 v0, 0x17

    return v0
.end method

.method static d(LK6/a;)Landroid/bluetooth/BluetoothGatt;
    .locals 0

    invoke-virtual {p0}, LK6/a;->a()Landroid/bluetooth/BluetoothGatt;

    move-result-object p0

    return-object p0
.end method

.method static e()LP6/i;
    .locals 9

    new-instance v8, LP6/i;

    const/16 v6, 0x20

    const/16 v7, 0x40

    const/4 v1, 0x1

    const/4 v2, 0x2

    const/4 v3, 0x4

    const/16 v4, 0x8

    const/16 v5, 0x10

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, LP6/i;-><init>(IIIIIII)V

    return-object v8
.end method

.method static f(ZLz2/a;Lz2/a;)LK6/F;
    .locals 0

    if-eqz p0, :cond_0

    invoke-interface {p1}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LK6/F;

    return-object p0

    :cond_0
    invoke-interface {p2}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LK6/F;

    return-object p0
.end method

.method static g(Lgg/y;LG6/S;)LM6/x;
    .locals 3

    new-instance v0, LM6/x;

    iget-wide v1, p1, LG6/S;->b:J

    iget-object p1, p1, LG6/S;->a:Ljava/util/concurrent/TimeUnit;

    invoke-direct {v0, v1, v2, p1, p0}, LM6/x;-><init>(JLjava/util/concurrent/TimeUnit;Lgg/y;)V

    return-object v0
.end method
