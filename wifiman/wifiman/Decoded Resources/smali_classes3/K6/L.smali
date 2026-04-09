.class public final LK6/L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG6/N$a;


# instance fields
.field final a:LO6/d;

.field private final b:LG6/N;

.field final c:LM6/k;

.field private d:Lgg/z;

.field e:LK6/i0;

.field f:LG6/N$c;

.field g:LG6/N$d;

.field h:[B


# direct methods
.method constructor <init>(LO6/d;LK6/N;LG6/N;LM6/k;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LK6/I;

    invoke-direct {v0}, LK6/I;-><init>()V

    iput-object v0, p0, LK6/L;->f:LG6/N$c;

    new-instance v0, LK6/V;

    invoke-direct {v0}, LK6/V;-><init>()V

    iput-object v0, p0, LK6/L;->g:LG6/N$d;

    iput-object p1, p0, LK6/L;->a:LO6/d;

    iput-object p2, p0, LK6/L;->e:LK6/i0;

    iput-object p3, p0, LK6/L;->b:LG6/N;

    iput-object p4, p0, LK6/L;->c:LM6/k;

    return-void
.end method


# virtual methods
.method public a()Lgg/s;
    .locals 2

    iget-object v0, p0, LK6/L;->d:Lgg/z;

    if-eqz v0, :cond_1

    iget-object v1, p0, LK6/L;->h:[B

    if-eqz v1, :cond_0

    new-instance v1, LK6/L$a;

    invoke-direct {v1, p0}, LK6/L$a;-><init>(LK6/L;)V

    invoke-virtual {v0, v1}, Lgg/z;->v(Lkg/n;)Lgg/s;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v1, "setBytes() needs to be called before build()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v1, "setCharacteristicUuid() or setCharacteristic() needs to be called before build()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(I)LG6/N$a;
    .locals 1

    new-instance v0, LK6/v;

    invoke-direct {v0, p1}, LK6/v;-><init>(I)V

    iput-object v0, p0, LK6/L;->e:LK6/i0;

    return-object p0
.end method

.method public c(Landroid/bluetooth/BluetoothGattCharacteristic;)LG6/N$a;
    .locals 0

    invoke-static {p1}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    iput-object p1, p0, LK6/L;->d:Lgg/z;

    return-object p0
.end method

.method public d([B)LG6/N$a;
    .locals 0

    iput-object p1, p0, LK6/L;->h:[B

    return-object p0
.end method
