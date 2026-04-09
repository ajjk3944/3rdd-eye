.class public LN6/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI6/s;


# instance fields
.field private final a:Landroid/bluetooth/BluetoothDevice;

.field private final b:I

.field private final c:J

.field private final d:LQ6/e;

.field private final e:LQ6/c;

.field private final f:LQ6/b;


# direct methods
.method public constructor <init>(Landroid/bluetooth/BluetoothDevice;IJLQ6/e;LQ6/c;LQ6/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN6/o;->a:Landroid/bluetooth/BluetoothDevice;

    iput p2, p0, LN6/o;->b:I

    iput-wide p3, p0, LN6/o;->c:J

    iput-object p5, p0, LN6/o;->d:LQ6/e;

    iput-object p6, p0, LN6/o;->e:LQ6/c;

    iput-object p7, p0, LN6/o;->f:LQ6/b;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LN6/o;->c()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public b()LQ6/e;
    .locals 1

    iget-object v0, p0, LN6/o;->d:LQ6/e;

    return-object v0
.end method

.method public c()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    iget-object v0, p0, LN6/o;->a:Landroid/bluetooth/BluetoothDevice;

    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, LN6/o;->b:I

    return v0
.end method

.method public e()LQ6/c;
    .locals 1

    iget-object v0, p0, LN6/o;->e:LQ6/c;

    return-object v0
.end method

.method public f()J
    .locals 2

    iget-wide v0, p0, LN6/o;->c:J

    return-wide v0
.end method

.method public g()LQ6/b;
    .locals 1

    iget-object v0, p0, LN6/o;->f:LQ6/b;

    return-object v0
.end method

.method public getAddress()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LN6/o;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
