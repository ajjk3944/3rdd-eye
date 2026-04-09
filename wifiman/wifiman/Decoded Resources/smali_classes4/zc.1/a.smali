.class public abstract Lzc/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroid/bluetooth/BluetoothDevice;)LCc/b;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Landroid/bluetooth/BluetoothDevice;->getBluetoothClass()Landroid/bluetooth/BluetoothClass;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothClass;->getMajorDeviceClass()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_0

    :catch_0
    move-exception p0

    goto/16 :goto_a

    :cond_0
    move-object p0, v0

    :goto_0
    if-nez p0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0x400

    if-ne v1, v2, :cond_2

    sget-object v0, LCc/b$l;->b:LCc/b$l;

    goto/16 :goto_b

    :cond_2
    :goto_1
    if-nez p0, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0x100

    if-ne v1, v2, :cond_4

    sget-object v0, LCc/b$h;->b:LCc/b$h;

    goto/16 :goto_b

    :cond_4
    :goto_2
    if-nez p0, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0x900

    if-ne v1, v2, :cond_6

    goto/16 :goto_b

    :cond_6
    :goto_3
    if-nez p0, :cond_7

    goto :goto_4

    :cond_7
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0x600

    if-ne v1, v2, :cond_8

    goto :goto_b

    :cond_8
    :goto_4
    if-nez p0, :cond_9

    goto :goto_5

    :cond_9
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0x300

    if-ne v1, v2, :cond_a

    sget-object v0, LCc/b$g$d;->b:LCc/b$g$d;

    goto :goto_b

    :cond_a
    :goto_5
    if-nez p0, :cond_b

    goto :goto_6

    :cond_b
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0x500

    if-ne v1, v2, :cond_c

    goto :goto_b

    :cond_c
    :goto_6
    if-nez p0, :cond_d

    goto :goto_7

    :cond_d
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0x200

    if-ne v1, v2, :cond_e

    sget-object v0, LCc/b$i;->b:LCc/b$i;

    goto :goto_b

    :cond_e
    :goto_7
    if-nez p0, :cond_f

    goto :goto_8

    :cond_f
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0x800

    if-ne v1, v2, :cond_10

    sget-object v0, LCc/b$m;->b:LCc/b$m;

    goto :goto_b

    :cond_10
    :goto_8
    if-nez p0, :cond_11

    goto :goto_9

    :cond_11
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0x700

    if-ne v1, v2, :cond_12

    sget-object v0, LCc/b$n;->b:LCc/b$n;

    goto :goto_b

    :cond_12
    :goto_9
    if-nez p0, :cond_13

    goto :goto_b

    :cond_13
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v1
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_b

    :goto_a
    const-string v1, "Attempt to access `bluetoothClass` without bluetooth permission"

    const/4 v2, 0x4

    invoke-static {v1, p0, v0, v2, v0}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    :goto_b
    return-object v0
.end method

.method public static final b(I)Ljava/util/Set;
    .locals 2

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    const/4 v1, 0x1

    if-eq p0, v1, :cond_2

    const/4 v1, 0x2

    if-eq p0, v1, :cond_1

    const/4 v1, 0x3

    if-eq p0, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p0, LU7/b;->CLASSIC:LU7/b;

    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object p0, LU7/b;->BLE:LU7/b;

    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    sget-object p0, LU7/b;->BLE:LU7/b;

    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    sget-object p0, LU7/b;->CLASSIC:LU7/b;

    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :goto_0
    return-object v0
.end method
