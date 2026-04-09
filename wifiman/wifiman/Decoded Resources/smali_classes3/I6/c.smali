.class public final LI6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/c;


# instance fields
.field private final a:Lz2/a;

.field private final b:Lz2/a;


# direct methods
.method public constructor <init>(Lz2/a;Lz2/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI6/c;->a:Lz2/a;

    iput-object p2, p0, LI6/c;->b:Lz2/a;

    return-void
.end method

.method public static a(Lz2/a;Lz2/a;)LI6/c;
    .locals 1

    new-instance v0, LI6/c;

    invoke-direct {v0, p0, p1}, LI6/c;-><init>(Lz2/a;Lz2/a;)V

    return-object v0
.end method

.method public static c(Ljava/lang/String;LP6/G;)Landroid/bluetooth/BluetoothDevice;
    .locals 0

    invoke-static {p0, p1}, LI6/b;->a(Ljava/lang/String;LP6/G;)Landroid/bluetooth/BluetoothDevice;

    move-result-object p0

    invoke-static {p0}, Ly2/e;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/bluetooth/BluetoothDevice;

    return-object p0
.end method


# virtual methods
.method public b()Landroid/bluetooth/BluetoothDevice;
    .locals 2

    iget-object v0, p0, LI6/c;->a:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, LI6/c;->b:Lz2/a;

    invoke-interface {v1}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LP6/G;

    invoke-static {v0, v1}, LI6/c;->c(Ljava/lang/String;LP6/G;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI6/c;->b()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    return-object v0
.end method
