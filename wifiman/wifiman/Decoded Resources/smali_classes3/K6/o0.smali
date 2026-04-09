.class public final LK6/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/c;


# instance fields
.field private final a:Lz2/a;

.field private final b:Lz2/a;

.field private final c:Lz2/a;


# direct methods
.method public constructor <init>(Lz2/a;Lz2/a;Lz2/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK6/o0;->a:Lz2/a;

    iput-object p2, p0, LK6/o0;->b:Lz2/a;

    iput-object p3, p0, LK6/o0;->c:Lz2/a;

    return-void
.end method

.method public static a(Lz2/a;Lz2/a;Lz2/a;)LK6/o0;
    .locals 1

    new-instance v0, LK6/o0;

    invoke-direct {v0, p0, p1, p2}, LK6/o0;-><init>(Lz2/a;Lz2/a;Lz2/a;)V

    return-object v0
.end method

.method public static c(LO6/d;Landroid/bluetooth/BluetoothGatt;LM6/k;)LK6/n0;
    .locals 1

    new-instance v0, LK6/n0;

    invoke-direct {v0, p0, p1, p2}, LK6/n0;-><init>(LO6/d;Landroid/bluetooth/BluetoothGatt;LM6/k;)V

    return-object v0
.end method


# virtual methods
.method public b()LK6/n0;
    .locals 3

    iget-object v0, p0, LK6/o0;->a:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO6/d;

    iget-object v1, p0, LK6/o0;->b:Lz2/a;

    invoke-interface {v1}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/bluetooth/BluetoothGatt;

    iget-object v2, p0, LK6/o0;->c:Lz2/a;

    invoke-interface {v2}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LM6/k;

    invoke-static {v0, v1, v2}, LK6/o0;->c(LO6/d;Landroid/bluetooth/BluetoothGatt;LM6/k;)LK6/n0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LK6/o0;->b()LK6/n0;

    move-result-object v0

    return-object v0
.end method
