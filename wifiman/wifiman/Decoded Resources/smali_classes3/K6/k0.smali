.class public final LK6/k0;
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

.field private final h:Lz2/a;

.field private final i:Lz2/a;

.field private final j:Lz2/a;

.field private final k:Lz2/a;


# direct methods
.method public constructor <init>(Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK6/k0;->a:Lz2/a;

    iput-object p2, p0, LK6/k0;->b:Lz2/a;

    iput-object p3, p0, LK6/k0;->c:Lz2/a;

    iput-object p4, p0, LK6/k0;->d:Lz2/a;

    iput-object p5, p0, LK6/k0;->e:Lz2/a;

    iput-object p6, p0, LK6/k0;->f:Lz2/a;

    iput-object p7, p0, LK6/k0;->g:Lz2/a;

    iput-object p8, p0, LK6/k0;->h:Lz2/a;

    iput-object p9, p0, LK6/k0;->i:Lz2/a;

    iput-object p10, p0, LK6/k0;->j:Lz2/a;

    iput-object p11, p0, LK6/k0;->k:Lz2/a;

    return-void
.end method

.method public static a(Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;)LK6/k0;
    .locals 13

    new-instance v12, LK6/k0;

    move-object v0, v12

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v0 .. v11}, LK6/k0;-><init>(Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;)V

    return-object v12
.end method

.method public static c(LO6/d;LK6/l0;Landroid/bluetooth/BluetoothGatt;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;LM6/k;Lz2/a;Lgg/y;LK6/D;)LK6/j0;
    .locals 13

    new-instance v12, LK6/j0;

    move-object/from16 v4, p3

    check-cast v4, LK6/n0;

    move-object/from16 v5, p4

    check-cast v5, LK6/g0;

    move-object/from16 v6, p5

    check-cast v6, LK6/P;

    move-object/from16 v7, p6

    check-cast v7, LK6/w;

    move-object v0, v12

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v0 .. v11}, LK6/j0;-><init>(LO6/d;LK6/l0;Landroid/bluetooth/BluetoothGatt;LK6/n0;LK6/g0;LK6/P;LK6/w;LM6/k;Lz2/a;Lgg/y;LK6/D;)V

    return-object v12
.end method


# virtual methods
.method public b()LK6/j0;
    .locals 12

    iget-object v0, p0, LK6/k0;->a:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LO6/d;

    iget-object v0, p0, LK6/k0;->b:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LK6/l0;

    iget-object v0, p0, LK6/k0;->c:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/bluetooth/BluetoothGatt;

    iget-object v0, p0, LK6/k0;->d:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v4

    iget-object v0, p0, LK6/k0;->e:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v5

    iget-object v0, p0, LK6/k0;->f:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v6

    iget-object v0, p0, LK6/k0;->g:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v7

    iget-object v0, p0, LK6/k0;->h:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, LM6/k;

    iget-object v9, p0, LK6/k0;->i:Lz2/a;

    iget-object v0, p0, LK6/k0;->j:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lgg/y;

    iget-object v0, p0, LK6/k0;->k:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, LK6/D;

    invoke-static/range {v1 .. v11}, LK6/k0;->c(LO6/d;LK6/l0;Landroid/bluetooth/BluetoothGatt;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;LM6/k;Lz2/a;Lgg/y;LK6/D;)LK6/j0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LK6/k0;->b()LK6/j0;

    move-result-object v0

    return-object v0
.end method
