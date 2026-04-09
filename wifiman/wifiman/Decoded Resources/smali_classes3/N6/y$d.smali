.class LN6/y$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN6/y;->g()Lkg/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LN6/o;)LN6/o;
    .locals 9

    new-instance v8, LN6/o;

    invoke-virtual {p1}, LN6/o;->c()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {p1}, LN6/o;->d()I

    move-result v2

    invoke-virtual {p1}, LN6/o;->f()J

    move-result-wide v3

    invoke-virtual {p1}, LN6/o;->b()LQ6/e;

    move-result-object v5

    sget-object v6, LQ6/c;->CALLBACK_TYPE_FIRST_MATCH:LQ6/c;

    invoke-virtual {p1}, LN6/o;->g()LQ6/b;

    move-result-object v7

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, LN6/o;-><init>(Landroid/bluetooth/BluetoothDevice;IJLQ6/e;LQ6/c;LQ6/b;)V

    return-object v8
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LN6/o;

    invoke-virtual {p0, p1}, LN6/y$d;->a(LN6/o;)LN6/o;

    move-result-object p1

    return-object p1
.end method
