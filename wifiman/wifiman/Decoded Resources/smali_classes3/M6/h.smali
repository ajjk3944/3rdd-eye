.class public final LM6/h;
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

    iput-object p1, p0, LM6/h;->a:Lz2/a;

    iput-object p2, p0, LM6/h;->b:Lz2/a;

    iput-object p3, p0, LM6/h;->c:Lz2/a;

    iput-object p4, p0, LM6/h;->d:Lz2/a;

    iput-object p5, p0, LM6/h;->e:Lz2/a;

    iput-object p6, p0, LM6/h;->f:Lz2/a;

    iput-object p7, p0, LM6/h;->g:Lz2/a;

    return-void
.end method

.method public static a(Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;)LM6/h;
    .locals 9

    new-instance v8, LM6/h;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, LM6/h;-><init>(Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;)V

    return-object v8
.end method

.method public static c(LK6/l0;LK6/a;Ljava/lang/String;Landroid/bluetooth/BluetoothManager;Lgg/y;LM6/x;LK6/m;)LM6/g;
    .locals 9

    new-instance v8, LM6/g;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, LM6/g;-><init>(LK6/l0;LK6/a;Ljava/lang/String;Landroid/bluetooth/BluetoothManager;Lgg/y;LM6/x;LK6/m;)V

    return-object v8
.end method


# virtual methods
.method public b()LM6/g;
    .locals 8

    iget-object v0, p0, LM6/h;->a:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LK6/l0;

    iget-object v0, p0, LM6/h;->b:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LK6/a;

    iget-object v0, p0, LM6/h;->c:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    iget-object v0, p0, LM6/h;->d:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/bluetooth/BluetoothManager;

    iget-object v0, p0, LM6/h;->e:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lgg/y;

    iget-object v0, p0, LM6/h;->f:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, LM6/x;

    iget-object v0, p0, LM6/h;->g:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, LK6/m;

    invoke-static/range {v1 .. v7}, LM6/h;->c(LK6/l0;LK6/a;Ljava/lang/String;Landroid/bluetooth/BluetoothManager;Lgg/y;LM6/x;LK6/m;)LM6/g;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LM6/h;->b()LM6/g;

    move-result-object v0

    return-object v0
.end method
