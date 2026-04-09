.class public abstract LE8/i;
.super LE8/k;
.source "SourceFile"


# static fields
.field static final synthetic o:[Lth/l;

.field public static final p:I


# instance fields
.field private final j:LYg/m;

.field private final k:LYg/m;

.field private final l:Lgg/i;

.field private final m:Lgg/i;

.field private final n:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LE8/i;

    const-string/jumbo v2, "networkDiscovery"

    const-string/jumbo v3, "getNetworkDiscovery()Lcom/ui/wifiman/model/discovery/NetworkDiscovery;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "deviceManager"

    const-string/jumbo v5, "getDeviceManager()Lcom/ui/wifiman/model/device/WifimanDeviceManager;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lth/l;

    aput-object v0, v2, v4

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, LE8/i;->o:[Lth/l;

    const/16 v0, 0x8

    sput v0, LE8/i;->p:I

    return-void
.end method

.method public constructor <init>(Lgg/i;Ljava/lang/String;Lorg/kodein/di/DI;)V
    .locals 4

    const-string/jumbo v0, "speedtestStream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "hostIp"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "di"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LE8/k;-><init>(Lgg/i;)V

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, LE8/i$b;

    invoke-direct {v0}, LE8/i$b;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, LDc/e;

    invoke-direct {p1, v0, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v0, 0x0

    invoke-static {p3, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    sget-object v2, LE8/i;->o:[Lth/l;

    const/4 v3, 0x0

    aget-object v3, v2, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LE8/i;->j:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v3, LE8/i$c;

    invoke-direct {v3}, LE8/i$c;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, LCc/n;

    invoke-direct {p1, v3, v1}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p3, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 p3, 0x1

    aget-object v0, v2, p3

    invoke-interface {p1, p0, v0}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LE8/i;->k:LYg/m;

    new-instance p1, LE8/i$d;

    invoke-direct {p1, p2}, LE8/i$d;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string/jumbo p2, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, LE8/i$e;

    invoke-direct {p2, p0}, LE8/i$e;-><init>(LE8/i;)V

    invoke-virtual {p1, p2}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LE8/i;->l:Lgg/i;

    invoke-direct {p0}, LE8/i;->n()LCc/n;

    move-result-object p2

    invoke-interface {p2}, LCc/n;->b()Lgg/i;

    move-result-object p2

    invoke-virtual {p0}, LE8/k;->j()Lgg/i;

    move-result-object p3

    sget-object v0, LE8/i$f;->a:LE8/i$f;

    invoke-static {p1, p2, p3, v0}, Lgg/i;->u(LDj/a;LDj/a;LDj/a;Lkg/g;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    const-string/jumbo p3, "distinctUntilChanged(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LE8/i;->m:Lgg/i;

    sget-object p2, LE8/i$a;->a:LE8/i$a;

    invoke-virtual {p1, p2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LE8/i;->n:Lgg/i;

    return-void
.end method

.method public static final synthetic l(LE8/i;)LCc/n;
    .locals 0

    invoke-direct {p0}, LE8/i;->n()LCc/n;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic m(LE8/i;)LDc/e;
    .locals 0

    invoke-direct {p0}, LE8/i;->o()LDc/e;

    move-result-object p0

    return-object p0
.end method

.method private final n()LCc/n;
    .locals 1

    iget-object v0, p0, LE8/i;->k:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LCc/n;

    return-object v0
.end method

.method private final o()LDc/e;
    .locals 1

    iget-object v0, p0, LE8/i;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LDc/e;

    return-object v0
.end method


# virtual methods
.method public g()Lgg/i;
    .locals 1

    iget-object v0, p0, LE8/i;->n:Lgg/i;

    return-object v0
.end method

.method public k()Lgg/i;
    .locals 1

    iget-object v0, p0, LE8/i;->m:Lgg/i;

    return-object v0
.end method
