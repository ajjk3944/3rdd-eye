.class final Ln8/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln8/a$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field static final synthetic f:[Lth/l;


# instance fields
.field private a:La8/b;

.field private b:Linet/ipaddr/g;

.field private final c:LYg/m;

.field private final d:LYg/m;

.field private final e:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, Ln8/f$a;

    const-string/jumbo v2, "deviceManager"

    const-string/jumbo v3, "getDeviceManager()Lcom/ui/wifiman/model/device/WifimanDeviceManager;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "networkDiscovery"

    const-string/jumbo v5, "getNetworkDiscovery()Lcom/ui/wifiman/model/discovery/NetworkDiscovery;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lth/l;

    aput-object v0, v2, v4

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, Ln8/f$a;->f:[Lth/l;

    return-void
.end method

.method private constructor <init>(Lorg/kodein/di/DI;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, Ln8/f$a$b;

    invoke-direct {v1}, Ln8/f$a$b;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string/jumbo v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, LCc/n;

    invoke-direct {v0, v1, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v1, 0x0

    .line 3
    invoke-static {p1, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    .line 4
    sget-object v3, Ln8/f$a;->f:[Lth/l;

    const/4 v4, 0x0

    aget-object v4, v3, v4

    invoke-interface {v0, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, Ln8/f$a;->c:LYg/m;

    .line 5
    new-instance v0, Lorg/kodein/type/d;

    new-instance v4, Ln8/f$a$c;

    invoke-direct {v4}, Ln8/f$a$c;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, LDc/e;

    invoke-direct {v0, v4, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    .line 6
    invoke-static {p1, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v0, 0x1

    .line 7
    aget-object v1, v3, v0

    invoke-interface {p1, p0, v1}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Ln8/f$a;->d:LYg/m;

    .line 8
    new-instance p1, Ln8/f$a$d;

    invoke-direct {p1, p0}, Ln8/f$a$d;-><init>(Ln8/f$a;)V

    invoke-static {p1}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string/jumbo v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    new-instance v1, Ln8/f$a$a;

    invoke-direct {v1, p0}, Ln8/f$a$a;-><init>(Ln8/f$a;)V

    invoke-virtual {p1, v1}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p1

    .line 10
    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ln8/f$a;->e:Lgg/i;

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;La8/b;)V
    .locals 1

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0, p1}, Ln8/f$a;-><init>(Lorg/kodein/di/DI;)V

    .line 13
    iput-object p2, p0, Ln8/f$a;->a:La8/b;

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;Linet/ipaddr/g;)V
    .locals 1

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "ip"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0, p1}, Ln8/f$a;-><init>(Lorg/kodein/di/DI;)V

    .line 15
    iput-object p2, p0, Ln8/f$a;->b:Linet/ipaddr/g;

    return-void
.end method

.method public static final synthetic b(Ln8/f$a;)Linet/ipaddr/g;
    .locals 0

    iget-object p0, p0, Ln8/f$a;->b:Linet/ipaddr/g;

    return-object p0
.end method

.method public static final synthetic c(Ln8/f$a;)La8/b;
    .locals 0

    iget-object p0, p0, Ln8/f$a;->a:La8/b;

    return-object p0
.end method

.method public static final synthetic d(Ln8/f$a;)LCc/n;
    .locals 0

    invoke-direct {p0}, Ln8/f$a;->f()LCc/n;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Ln8/f$a;)LDc/e;
    .locals 0

    invoke-direct {p0}, Ln8/f$a;->g()LDc/e;

    move-result-object p0

    return-object p0
.end method

.method private final f()LCc/n;
    .locals 1

    iget-object v0, p0, Ln8/f$a;->c:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LCc/n;

    return-object v0
.end method

.method private final g()LDc/e;
    .locals 1

    iget-object v0, p0, Ln8/f$a;->d:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LDc/e;

    return-object v0
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Ln8/f$a;->e:Lgg/i;

    return-object v0
.end method
