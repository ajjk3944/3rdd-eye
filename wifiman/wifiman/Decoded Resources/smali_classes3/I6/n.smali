.class public final LI6/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/c;


# instance fields
.field private final a:Lz2/a;

.field private final b:Lz2/a;

.field private final c:Lz2/a;

.field private final d:Lz2/a;


# direct methods
.method public constructor <init>(Lz2/a;Lz2/a;Lz2/a;Lz2/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI6/n;->a:Lz2/a;

    iput-object p2, p0, LI6/n;->b:Lz2/a;

    iput-object p3, p0, LI6/n;->c:Lz2/a;

    iput-object p4, p0, LI6/n;->d:Lz2/a;

    return-void
.end method

.method public static a(Lz2/a;Lz2/a;Lz2/a;Lz2/a;)LI6/n;
    .locals 1

    new-instance v0, LI6/n;

    invoke-direct {v0, p0, p1, p2, p3}, LI6/n;-><init>(Lz2/a;Lz2/a;Lz2/a;Lz2/a;)V

    return-object v0
.end method

.method public static c(Landroid/bluetooth/BluetoothDevice;LK6/o;LJ5/b;LP6/j;)LI6/m;
    .locals 1

    new-instance v0, LI6/m;

    invoke-direct {v0, p0, p1, p2, p3}, LI6/m;-><init>(Landroid/bluetooth/BluetoothDevice;LK6/o;LJ5/b;LP6/j;)V

    return-object v0
.end method


# virtual methods
.method public b()LI6/m;
    .locals 4

    iget-object v0, p0, LI6/n;->a:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/bluetooth/BluetoothDevice;

    iget-object v1, p0, LI6/n;->b:Lz2/a;

    invoke-interface {v1}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LK6/o;

    iget-object v2, p0, LI6/n;->c:Lz2/a;

    invoke-interface {v2}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LJ5/b;

    iget-object v3, p0, LI6/n;->d:Lz2/a;

    invoke-interface {v3}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LP6/j;

    invoke-static {v0, v1, v2, v3}, LI6/n;->c(Landroid/bluetooth/BluetoothDevice;LK6/o;LJ5/b;LP6/j;)LI6/m;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI6/n;->b()LI6/m;

    move-result-object v0

    return-object v0
.end method
