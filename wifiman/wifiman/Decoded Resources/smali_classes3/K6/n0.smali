.class LK6/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final a:LO6/d;

.field final b:Landroid/bluetooth/BluetoothGatt;

.field final c:LM6/k;

.field private d:Lgg/z;

.field final e:LHg/d;

.field f:Z


# direct methods
.method constructor <init>(LO6/d;Landroid/bluetooth/BluetoothGatt;LM6/k;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LHg/a;->k1()LHg/a;

    move-result-object v0

    invoke-virtual {v0}, LHg/d;->i1()LHg/d;

    move-result-object v0

    iput-object v0, p0, LK6/n0;->e:LHg/d;

    const/4 v0, 0x0

    iput-boolean v0, p0, LK6/n0;->f:Z

    iput-object p1, p0, LK6/n0;->a:LO6/d;

    iput-object p2, p0, LK6/n0;->b:Landroid/bluetooth/BluetoothGatt;

    iput-object p3, p0, LK6/n0;->c:LM6/k;

    invoke-virtual {p0}, LK6/n0;->d()V

    return-void
.end method

.method private b()Lgg/n;
    .locals 2

    new-instance v0, LK6/n0$f;

    invoke-direct {v0, p0}, LK6/n0$f;-><init>(LK6/n0;)V

    invoke-static {v0}, Lgg/z;->x(Ljava/util/concurrent/Callable;)Lgg/z;

    move-result-object v0

    new-instance v1, LK6/n0$e;

    invoke-direct {v1, p0}, LK6/n0$e;-><init>(LK6/n0;)V

    invoke-virtual {v0, v1}, Lgg/z;->r(Lkg/p;)Lgg/n;

    move-result-object v0

    return-object v0
.end method

.method private c()Lgg/z;
    .locals 1

    iget-object v0, p0, LK6/n0;->e:LHg/d;

    invoke-virtual {v0}, Lgg/s;->P()Lgg/z;

    move-result-object v0

    return-object v0
.end method

.method private e()Lkg/n;
    .locals 1

    new-instance v0, LK6/n0$g;

    invoke-direct {v0, p0}, LK6/n0$g;-><init>(LK6/n0;)V

    return-object v0
.end method

.method private static f()Lkg/n;
    .locals 1

    new-instance v0, LK6/n0$d;

    invoke-direct {v0}, LK6/n0$d;-><init>()V

    return-object v0
.end method


# virtual methods
.method a(JLjava/util/concurrent/TimeUnit;)Lgg/z;
    .locals 2

    iget-boolean v0, p0, LK6/n0;->f:Z

    if-eqz v0, :cond_0

    iget-object p1, p0, LK6/n0;->d:Lgg/z;

    return-object p1

    :cond_0
    iget-object v0, p0, LK6/n0;->d:Lgg/z;

    new-instance v1, LK6/n0$a;

    invoke-direct {v1, p0, p1, p2, p3}, LK6/n0$a;-><init>(LK6/n0;JLjava/util/concurrent/TimeUnit;)V

    invoke-virtual {v0, v1}, Lgg/z;->n(Lkg/f;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method d()V
    .locals 3

    const/4 v0, 0x0

    iput-boolean v0, p0, LK6/n0;->f:Z

    invoke-direct {p0}, LK6/n0;->b()Lgg/n;

    move-result-object v0

    invoke-static {}, LK6/n0;->f()Lkg/n;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/n;->p(Lkg/n;)Lgg/n;

    move-result-object v0

    invoke-direct {p0}, LK6/n0;->c()Lgg/z;

    move-result-object v1

    invoke-direct {p0}, LK6/n0;->e()Lkg/n;

    move-result-object v2

    invoke-virtual {v1, v2}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/n;->x(Lgg/D;)Lgg/z;

    move-result-object v0

    new-instance v1, LK6/n0$b;

    invoke-direct {v1, p0}, LK6/n0$b;-><init>(LK6/n0;)V

    invoke-static {v1}, Lmg/a;->a(Lkg/a;)Lkg/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object v0

    new-instance v1, LK6/n0$c;

    invoke-direct {v1, p0}, LK6/n0$c;-><init>(LK6/n0;)V

    invoke-static {v1}, Lmg/a;->a(Lkg/a;)Lkg/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/z;->m(Lkg/f;)Lgg/z;

    move-result-object v0

    invoke-virtual {v0}, Lgg/z;->e()Lgg/z;

    move-result-object v0

    iput-object v0, p0, LK6/n0;->d:Lgg/z;

    return-void
.end method
