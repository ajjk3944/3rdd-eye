.class LG6/L;
.super LG6/G;
.source "SourceFile"


# instance fields
.field final a:LO6/a;

.field private final b:LP6/I;

.field private final c:LI6/o;

.field final d:LN6/B;

.field final e:LN6/q;

.field final f:Lkg/n;

.field private final g:LG6/a$b;

.field final h:Lgg/y;

.field final i:Ljava/util/Map;

.field private final j:LP6/c;

.field private final k:LP6/G;

.field private final l:Lgg/s;

.field private final m:LP6/x;

.field private final n:Lx2/a;

.field private final o:LQ6/a;

.field private final p:LP6/q;

.field private final q:LP6/j;


# direct methods
.method constructor <init>(LP6/c;LP6/G;LO6/a;Lgg/s;LP6/I;LP6/x;Lx2/a;LI6/o;LN6/B;LN6/q;Lkg/n;Lgg/y;LG6/a$b;LQ6/a;LP6/q;LP6/j;)V
    .locals 2

    move-object v0, p0

    invoke-direct {p0}, LG6/G;-><init>()V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, v0, LG6/L;->i:Ljava/util/Map;

    move-object v1, p3

    iput-object v1, v0, LG6/L;->a:LO6/a;

    move-object v1, p1

    iput-object v1, v0, LG6/L;->j:LP6/c;

    move-object v1, p2

    iput-object v1, v0, LG6/L;->k:LP6/G;

    move-object v1, p4

    iput-object v1, v0, LG6/L;->l:Lgg/s;

    move-object v1, p5

    iput-object v1, v0, LG6/L;->b:LP6/I;

    move-object v1, p6

    iput-object v1, v0, LG6/L;->m:LP6/x;

    move-object v1, p7

    iput-object v1, v0, LG6/L;->n:Lx2/a;

    move-object v1, p8

    iput-object v1, v0, LG6/L;->c:LI6/o;

    move-object v1, p9

    iput-object v1, v0, LG6/L;->d:LN6/B;

    move-object v1, p10

    iput-object v1, v0, LG6/L;->e:LN6/q;

    move-object v1, p11

    iput-object v1, v0, LG6/L;->f:Lkg/n;

    move-object v1, p12

    iput-object v1, v0, LG6/L;->h:Lgg/y;

    move-object v1, p13

    iput-object v1, v0, LG6/L;->g:LG6/a$b;

    move-object/from16 v1, p14

    iput-object v1, v0, LG6/L;->o:LQ6/a;

    move-object/from16 v1, p15

    iput-object v1, v0, LG6/L;->p:LP6/q;

    move-object/from16 v1, p16

    iput-object v1, v0, LG6/L;->q:LP6/j;

    return-void
.end method

.method public static synthetic f(LG6/E$b;)Z
    .locals 0

    invoke-static {p0}, LG6/L;->l(LG6/E$b;)Z

    move-result p0

    return p0
.end method

.method public static synthetic g(LQ6/f;)V
    .locals 0

    invoke-static {p0}, LG6/L;->n(LQ6/f;)V

    return-void
.end method

.method public static synthetic h(LG6/L;LQ6/g;[LQ6/d;)Lgg/v;
    .locals 0

    invoke-direct {p0, p1, p2}, LG6/L;->o(LQ6/g;[LQ6/d;)Lgg/v;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(LG6/E$b;)Lgg/r;
    .locals 0

    invoke-static {p0}, LG6/L;->m(LG6/E$b;)Lgg/r;

    move-result-object p0

    return-object p0
.end method

.method private k()V
    .locals 2

    iget-object v0, p0, LG6/L;->k:LP6/G;

    invoke-virtual {v0}, LP6/G;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string/jumbo v1, "RxAndroidBle library needs a BluetoothAdapter to be available in the system to work. If this is a test on an emulator then you can use \'https://github.com/Polidea/RxAndroidBle/tree/master/mockrxandroidble\'"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static synthetic l(LG6/E$b;)Z
    .locals 1

    sget-object v0, LG6/E$b;->c:LG6/E$b;

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static synthetic m(LG6/E$b;)Lgg/r;
    .locals 1

    new-instance p0, Lcom/polidea/rxandroidble3/exceptions/BleScanException;

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/polidea/rxandroidble3/exceptions/BleScanException;-><init>(I)V

    invoke-static {p0}, Lgg/n;->i(Ljava/lang/Throwable;)Lgg/n;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic n(LQ6/f;)V
    .locals 1

    invoke-static {}, LI6/q;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "%s"

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v0, p0}, LI6/q;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private synthetic o(LQ6/g;[LQ6/d;)Lgg/v;
    .locals 2

    iget-object v0, p0, LG6/L;->e:LN6/q;

    invoke-virtual {p1}, LQ6/g;->h()Z

    move-result v1

    invoke-interface {v0, v1}, LN6/q;->a(Z)V

    iget-object v0, p0, LG6/L;->d:LN6/B;

    invoke-interface {v0, p1, p2}, LN6/B;->a(LQ6/g;[LQ6/d;)LN6/A;

    move-result-object p1

    iget-object p2, p1, LN6/A;->a:LM6/j;

    iget-object v0, p0, LG6/L;->a:LO6/a;

    invoke-interface {v0, p2}, LO6/a;->a(LM6/j;)Lgg/s;

    move-result-object p2

    iget-object v0, p0, LG6/L;->h:Lgg/y;

    invoke-virtual {p2, v0}, Lgg/s;->e1(Lgg/y;)Lgg/s;

    move-result-object p2

    iget-object p1, p1, LN6/A;->b:Lgg/w;

    invoke-virtual {p2, p1}, Lgg/s;->g(Lgg/w;)Lgg/s;

    move-result-object p1

    iget-object p2, p0, LG6/L;->f:Lkg/n;

    invoke-virtual {p1, p2}, Lgg/s;->i0(Lkg/n;)Lgg/s;

    move-result-object p1

    new-instance p2, LG6/I;

    invoke-direct {p2}, LG6/I;-><init>()V

    invoke-virtual {p1, p2}, Lgg/s;->F(Lkg/f;)Lgg/s;

    move-result-object p1

    invoke-virtual {p0}, LG6/L;->j()Lgg/s;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/s;->m0(Lgg/v;)Lgg/s;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public b(Ljava/lang/String;)LG6/O;
    .locals 1

    invoke-direct {p0}, LG6/L;->k()V

    iget-object v0, p0, LG6/L;->c:LI6/o;

    invoke-virtual {v0, p1}, LI6/o;->a(Ljava/lang/String;)LG6/O;

    move-result-object p1

    return-object p1
.end method

.method public c()LG6/G$a;
    .locals 1

    iget-object v0, p0, LG6/L;->k:LP6/G;

    invoke-virtual {v0}, LP6/G;->b()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, LG6/G$a;->BLUETOOTH_NOT_AVAILABLE:LG6/G$a;

    return-object v0

    :cond_0
    iget-object v0, p0, LG6/L;->m:LP6/x;

    invoke-interface {v0}, LP6/x;->b()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, LG6/G$a;->LOCATION_PERMISSION_NOT_GRANTED:LG6/G$a;

    return-object v0

    :cond_1
    iget-object v0, p0, LG6/L;->k:LP6/G;

    invoke-virtual {v0}, LP6/G;->c()Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, LG6/G$a;->BLUETOOTH_NOT_ENABLED:LG6/G$a;

    return-object v0

    :cond_2
    iget-object v0, p0, LG6/L;->m:LP6/x;

    invoke-interface {v0}, LP6/x;->a()Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, LG6/G$a;->LOCATION_SERVICES_NOT_ENABLED:LG6/G$a;

    return-object v0

    :cond_3
    sget-object v0, LG6/G$a;->READY:LG6/G$a;

    return-object v0
.end method

.method public d()Lgg/s;
    .locals 1

    iget-object v0, p0, LG6/L;->n:Lx2/a;

    invoke-interface {v0}, Lx2/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgg/s;

    return-object v0
.end method

.method public varargs e(LQ6/g;[LQ6/d;)Lgg/s;
    .locals 1

    new-instance v0, LG6/H;

    invoke-direct {v0, p0, p1, p2}, LG6/H;-><init>(LG6/L;LQ6/g;[LQ6/d;)V

    invoke-static {v0}, Lgg/s;->r(Lkg/q;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method protected finalize()V
    .locals 1

    iget-object v0, p0, LG6/L;->g:LG6/a$b;

    invoke-interface {v0}, LG6/a$b;->a()V

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    return-void
.end method

.method j()Lgg/s;
    .locals 2

    iget-object v0, p0, LG6/L;->l:Lgg/s;

    new-instance v1, LG6/J;

    invoke-direct {v1}, LG6/J;-><init>()V

    invoke-virtual {v0, v1}, Lgg/s;->N(Lkg/p;)Lgg/s;

    move-result-object v0

    invoke-virtual {v0}, Lgg/s;->O()Lgg/n;

    move-result-object v0

    new-instance v1, LG6/K;

    invoke-direct {v1}, LG6/K;-><init>()V

    invoke-virtual {v0, v1}, Lgg/n;->j(Lkg/n;)Lgg/n;

    move-result-object v0

    invoke-virtual {v0}, Lgg/n;->B()Lgg/s;

    move-result-object v0

    return-object v0
.end method
