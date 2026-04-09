.class public final LM6/m;
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

.field private final g:Lz2/a;


# direct methods
.method public constructor <init>(Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM6/m;->a:Lz2/a;

    iput-object p2, p0, LM6/m;->b:Lz2/a;

    iput-object p3, p0, LM6/m;->c:Lz2/a;

    iput-object p4, p0, LM6/m;->d:Lz2/a;

    iput-object p5, p0, LM6/m;->e:Lz2/a;

    iput-object p6, p0, LM6/m;->f:Lz2/a;

    iput-object p7, p0, LM6/m;->g:Lz2/a;

    return-void
.end method

.method public static a(Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;)LM6/m;
    .locals 9

    new-instance v8, LM6/m;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, LM6/m;-><init>(Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;)V

    return-object v8
.end method

.method public static c(LK6/l0;Landroid/bluetooth/BluetoothGatt;LL6/c;LM6/x;Lgg/y;Lgg/y;Lz2/a;)LM6/l;
    .locals 9

    new-instance v8, LM6/l;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, LM6/l;-><init>(LK6/l0;Landroid/bluetooth/BluetoothGatt;LL6/c;LM6/x;Lgg/y;Lgg/y;Lz2/a;)V

    return-object v8
.end method


# virtual methods
.method public b()LM6/l;
    .locals 8

    iget-object v0, p0, LM6/m;->a:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LK6/l0;

    iget-object v0, p0, LM6/m;->b:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/bluetooth/BluetoothGatt;

    iget-object v0, p0, LM6/m;->c:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LL6/c;

    iget-object v0, p0, LM6/m;->d:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LM6/x;

    iget-object v0, p0, LM6/m;->e:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lgg/y;

    iget-object v0, p0, LM6/m;->f:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lgg/y;

    iget-object v7, p0, LM6/m;->g:Lz2/a;

    invoke-static/range {v1 .. v7}, LM6/m;->c(LK6/l0;Landroid/bluetooth/BluetoothGatt;LL6/c;LM6/x;Lgg/y;Lgg/y;Lz2/a;)LM6/l;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LM6/m;->b()LM6/l;

    move-result-object v0

    return-object v0
.end method
