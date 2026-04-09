.class public LN6/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# instance fields
.field private final a:LI6/o;


# direct methods
.method public constructor <init>(LI6/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN6/h;->a:LI6/o;

    return-void
.end method


# virtual methods
.method public a(LN6/o;)LQ6/f;
    .locals 9

    new-instance v8, LQ6/f;

    iget-object v0, p0, LN6/h;->a:LI6/o;

    invoke-virtual {p1}, LN6/o;->c()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LI6/o;->a(Ljava/lang/String;)LG6/O;

    move-result-object v1

    invoke-virtual {p1}, LN6/o;->d()I

    move-result v2

    invoke-virtual {p1}, LN6/o;->f()J

    move-result-wide v3

    invoke-virtual {p1}, LN6/o;->e()LQ6/c;

    move-result-object v5

    invoke-virtual {p1}, LN6/o;->b()LQ6/e;

    move-result-object v6

    invoke-virtual {p1}, LN6/o;->g()LQ6/b;

    move-result-object v7

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, LQ6/f;-><init>(LG6/O;IJLQ6/c;LQ6/e;LQ6/b;)V

    return-object v8
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LN6/o;

    invoke-virtual {p0, p1}, LN6/h;->a(LN6/o;)LQ6/f;

    move-result-object p1

    return-object p1
.end method
