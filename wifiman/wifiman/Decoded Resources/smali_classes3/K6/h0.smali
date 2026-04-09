.class public final LK6/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/c;


# instance fields
.field private final a:Lz2/a;

.field private final b:Lz2/a;

.field private final c:Lz2/a;

.field private final d:Lz2/a;

.field private final e:Lz2/a;

.field private final f:Lz2/a;


# direct methods
.method public constructor <init>(Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK6/h0;->a:Lz2/a;

    iput-object p2, p0, LK6/h0;->b:Lz2/a;

    iput-object p3, p0, LK6/h0;->c:Lz2/a;

    iput-object p4, p0, LK6/h0;->d:Lz2/a;

    iput-object p5, p0, LK6/h0;->e:Lz2/a;

    iput-object p6, p0, LK6/h0;->f:Lz2/a;

    return-void
.end method

.method public static a(Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;)LK6/h0;
    .locals 8

    new-instance v7, LK6/h0;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, LK6/h0;-><init>(Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;)V

    return-object v7
.end method

.method public static c([B[B[BLandroid/bluetooth/BluetoothGatt;LK6/l0;Ljava/lang/Object;)LK6/g0;
    .locals 8

    new-instance v7, LK6/g0;

    move-object v6, p5

    check-cast v6, LK6/w;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v6}, LK6/g0;-><init>([B[B[BLandroid/bluetooth/BluetoothGatt;LK6/l0;LK6/w;)V

    return-object v7
.end method


# virtual methods
.method public b()LK6/g0;
    .locals 7

    iget-object v0, p0, LK6/h0;->a:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, [B

    iget-object v0, p0, LK6/h0;->b:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, [B

    iget-object v0, p0, LK6/h0;->c:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, [B

    iget-object v0, p0, LK6/h0;->d:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/bluetooth/BluetoothGatt;

    iget-object v0, p0, LK6/h0;->e:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LK6/l0;

    iget-object v0, p0, LK6/h0;->f:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v6

    invoke-static/range {v1 .. v6}, LK6/h0;->c([B[B[BLandroid/bluetooth/BluetoothGatt;LK6/l0;Ljava/lang/Object;)LK6/g0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LK6/h0;->b()LK6/g0;

    move-result-object v0

    return-object v0
.end method
