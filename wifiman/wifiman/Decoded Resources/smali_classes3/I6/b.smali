.class public abstract LI6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static a(Ljava/lang/String;LP6/G;)Landroid/bluetooth/BluetoothDevice;
    .locals 0

    invoke-virtual {p1, p0}, LP6/G;->a(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object p0

    return-object p0
.end method

.method static b(LJ5/b;)LK6/m;
    .locals 1

    new-instance v0, LI6/b$a;

    invoke-direct {v0, p0}, LI6/b$a;-><init>(LJ5/b;)V

    return-object v0
.end method

.method static c()LJ5/b;
    .locals 1

    sget-object v0, LG6/N$b;->DISCONNECTED:LG6/N$b;

    invoke-static {v0}, LJ5/b;->m1(Ljava/lang/Object;)LJ5/b;

    move-result-object v0

    return-object v0
.end method

.method static d(Lgg/y;)LM6/x;
    .locals 4

    new-instance v0, LM6/x;

    const-wide/16 v1, 0x23

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-direct {v0, v1, v2, v3, p0}, LM6/x;-><init>(JLjava/util/concurrent/TimeUnit;Lgg/y;)V

    return-object v0
.end method

.method static e(Lgg/y;)LM6/x;
    .locals 4

    new-instance v0, LM6/x;

    const-wide/16 v1, 0xa

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-direct {v0, v1, v2, v3, p0}, LM6/x;-><init>(JLjava/util/concurrent/TimeUnit;Lgg/y;)V

    return-object v0
.end method
