.class final LG6/A$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI6/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LG6/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "g"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:LG6/A$c;

.field private final c:LG6/A$g;

.field private d:Lz2/a;

.field private e:Lz2/a;

.field private f:Lz2/a;

.field private g:Lz2/a;

.field private h:Lz2/a;

.field private i:Lz2/a;

.field private j:Lz2/a;

.field private k:Lz2/a;


# direct methods
.method private constructor <init>(LG6/A$c;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p0, p0, LG6/A$g;->c:LG6/A$g;

    .line 4
    iput-object p1, p0, LG6/A$g;->b:LG6/A$c;

    .line 5
    iput-object p2, p0, LG6/A$g;->a:Ljava/lang/String;

    .line 6
    invoke-direct {p0, p2}, LG6/A$g;->j(Ljava/lang/String;)V

    return-void
.end method

.method synthetic constructor <init>(LG6/A$c;Ljava/lang/String;LG6/A$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LG6/A$g;-><init>(LG6/A$c;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic b(LG6/A$g;)Lz2/a;
    .locals 0

    iget-object p0, p0, LG6/A$g;->k:Lz2/a;

    return-object p0
.end method

.method static synthetic c(LG6/A$g;)Lz2/a;
    .locals 0

    iget-object p0, p0, LG6/A$g;->j:Lz2/a;

    return-object p0
.end method

.method static synthetic d(LG6/A$g;)Landroid/bluetooth/BluetoothDevice;
    .locals 0

    invoke-direct {p0}, LG6/A$g;->i()Landroid/bluetooth/BluetoothDevice;

    move-result-object p0

    return-object p0
.end method

.method static synthetic e(LG6/A$g;)LM6/x;
    .locals 0

    invoke-direct {p0}, LG6/A$g;->k()LM6/x;

    move-result-object p0

    return-object p0
.end method

.method static synthetic f(LG6/A$g;)LG6/A$c;
    .locals 0

    iget-object p0, p0, LG6/A$g;->b:LG6/A$c;

    return-object p0
.end method

.method static synthetic g(LG6/A$g;)LG6/A$g;
    .locals 0

    iget-object p0, p0, LG6/A$g;->c:LG6/A$g;

    return-object p0
.end method

.method static synthetic h(LG6/A$g;)Lz2/a;
    .locals 0

    iget-object p0, p0, LG6/A$g;->d:Lz2/a;

    return-object p0
.end method

.method private i()Landroid/bluetooth/BluetoothDevice;
    .locals 2

    iget-object v0, p0, LG6/A$g;->a:Ljava/lang/String;

    iget-object v1, p0, LG6/A$g;->b:LG6/A$c;

    invoke-static {v1}, LG6/A$c;->e(LG6/A$c;)LP6/G;

    move-result-object v1

    invoke-static {v0, v1}, LI6/c;->c(Ljava/lang/String;LP6/G;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    return-object v0
.end method

.method private j(Ljava/lang/String;)V
    .locals 3

    invoke-static {p1}, Ly2/d;->a(Ljava/lang/Object;)Ly2/c;

    move-result-object p1

    iput-object p1, p0, LG6/A$g;->d:Lz2/a;

    iget-object v0, p0, LG6/A$g;->b:LG6/A$c;

    invoke-static {v0}, LG6/A$c;->i(LG6/A$c;)Lz2/a;

    move-result-object v0

    invoke-static {p1, v0}, LI6/c;->a(Lz2/a;Lz2/a;)LI6/c;

    move-result-object p1

    iput-object p1, p0, LG6/A$g;->e:Lz2/a;

    new-instance p1, LG6/A$g$a;

    invoke-direct {p1, p0}, LG6/A$g$a;-><init>(LG6/A$g;)V

    iput-object p1, p0, LG6/A$g;->f:Lz2/a;

    iget-object p1, p0, LG6/A$g;->b:LG6/A$c;

    invoke-static {p1}, LG6/A$c;->d(LG6/A$c;)Lz2/a;

    move-result-object p1

    iget-object v0, p0, LG6/A$g;->f:Lz2/a;

    iget-object v1, p0, LG6/A$g;->b:LG6/A$c;

    invoke-static {v1}, LG6/A$c;->k(LG6/A$c;)Lz2/a;

    move-result-object v1

    invoke-static {p1, v0, v1}, LK6/u;->a(Lz2/a;Lz2/a;Lz2/a;)LK6/u;

    move-result-object p1

    iput-object p1, p0, LG6/A$g;->g:Lz2/a;

    invoke-static {}, LI6/e;->a()LI6/e;

    move-result-object p1

    invoke-static {p1}, Ly2/b;->b(Lz2/a;)Lz2/a;

    move-result-object p1

    iput-object p1, p0, LG6/A$g;->h:Lz2/a;

    iget-object v0, p0, LG6/A$g;->e:Lz2/a;

    iget-object v1, p0, LG6/A$g;->g:Lz2/a;

    iget-object v2, p0, LG6/A$g;->b:LG6/A$c;

    invoke-static {v2}, LG6/A$c;->f(LG6/A$c;)Lz2/a;

    move-result-object v2

    invoke-static {v0, v1, p1, v2}, LI6/n;->a(Lz2/a;Lz2/a;Lz2/a;Lz2/a;)LI6/n;

    move-result-object p1

    invoke-static {p1}, Ly2/b;->b(Lz2/a;)Lz2/a;

    move-result-object p1

    iput-object p1, p0, LG6/A$g;->i:Lz2/a;

    iget-object p1, p0, LG6/A$g;->h:Lz2/a;

    invoke-static {p1}, LI6/d;->a(Lz2/a;)LI6/d;

    move-result-object p1

    invoke-static {p1}, Ly2/b;->b(Lz2/a;)Lz2/a;

    move-result-object p1

    iput-object p1, p0, LG6/A$g;->j:Lz2/a;

    invoke-static {}, LG6/g;->a()LG6/g;

    move-result-object p1

    invoke-static {p1}, LI6/g;->a(Lz2/a;)LI6/g;

    move-result-object p1

    iput-object p1, p0, LG6/A$g;->k:Lz2/a;

    return-void
.end method

.method private k()LM6/x;
    .locals 1

    invoke-static {}, LG6/g;->c()Lgg/y;

    move-result-object v0

    invoke-static {v0}, LI6/f;->a(Lgg/y;)LM6/x;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()LG6/O;
    .locals 1

    iget-object v0, p0, LG6/A$g;->i:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LG6/O;

    return-object v0
.end method
