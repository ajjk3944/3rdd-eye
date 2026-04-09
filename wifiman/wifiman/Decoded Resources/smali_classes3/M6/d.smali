.class public abstract LM6/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/c;


# direct methods
.method public static a(Landroid/bluetooth/BluetoothDevice;LP6/b;LK6/l0;LK6/a;LM6/x;ZLK6/m;)LM6/c;
    .locals 9

    new-instance v8, LM6/c;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, LM6/c;-><init>(Landroid/bluetooth/BluetoothDevice;LP6/b;LK6/l0;LK6/a;LM6/x;ZLK6/m;)V

    return-object v8
.end method
