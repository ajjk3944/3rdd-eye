.class public final LG6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LG6/b$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LG6/b;
    .locals 1

    invoke-static {}, LG6/b$a;->a()LG6/b;

    move-result-object v0

    return-object v0
.end method

.method public static c()Landroid/bluetooth/BluetoothAdapter;
    .locals 1

    invoke-static {}, LG6/a$c;->a()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public b()Landroid/bluetooth/BluetoothAdapter;
    .locals 1

    invoke-static {}, LG6/b;->c()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LG6/b;->b()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    return-object v0
.end method
