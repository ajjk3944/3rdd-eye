.class public final LD8/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD8/f;


# static fields
.field static final synthetic e:[Lth/l;

.field public static final f:I


# instance fields
.field private final a:LYg/m;

.field private final b:LYg/m;

.field private final c:LYg/m;

.field private final d:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LD8/g;

    const-string/jumbo v2, "favoriteHostsManager"

    const-string/jumbo v3, "getFavoriteHostsManager()Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "topologyService"

    const-string/jumbo v5, "getTopologyService()Lcom/ui/wifiman/model/network/topology/NetworkTopologyService;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/F;

    const-string/jumbo v5, "viewRouter"

    const-string/jumbo v6, "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/4 v3, 0x3

    new-array v3, v3, [Lth/l;

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v2, v3, v0

    const/4 v0, 0x2

    aput-object v1, v3, v0

    sput-object v3, LD8/g;->e:[Lth/l;

    const/16 v0, 0x8

    sput v0, LD8/g;->f:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 6

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, LD8/g$b;

    invoke-direct {v1}, LD8/g$b;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string/jumbo v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager;

    invoke-direct {v0, v1, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    sget-object v3, LD8/g;->e:[Lth/l;

    const/4 v4, 0x0

    aget-object v4, v3, v4

    invoke-interface {v0, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LD8/g;->a:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v4, LD8/g$c;

    invoke-direct {v4}, LD8/g$c;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Ljd/b;

    invoke-direct {v0, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p1, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v4, 0x1

    aget-object v5, v3, v4

    invoke-interface {v0, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LD8/g;->b:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v5, LD8/g$d;

    invoke-direct {v5}, LD8/g$d;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Li8/a;

    invoke-direct {v0, v5, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p1, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v0, 0x2

    aget-object v0, v3, v0

    invoke-interface {p1, p0, v0}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LD8/g;->c:LYg/m;

    invoke-direct {p0}, LD8/g;->c()Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager;

    move-result-object p1

    invoke-interface {p1}, Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager;->c()Lgg/i;

    move-result-object p1

    invoke-direct {p0}, LD8/g;->d()Ljd/b;

    move-result-object v0

    invoke-interface {v0}, Ljd/b;->d()Lgg/i;

    move-result-object v0

    sget-object v1, LD8/g$a;->a:LD8/g$a;

    invoke-static {p1, v0, v1}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v4}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LD8/g;->d:Lgg/i;

    return-void
.end method

.method private final c()Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager;
    .locals 1

    iget-object v0, p0, LD8/g;->a:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager;

    return-object v0
.end method

.method private final d()Ljd/b;
    .locals 1

    iget-object v0, p0, LD8/g;->b:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljd/b;

    return-object v0
.end method

.method private final e()Li8/a;
    .locals 1

    iget-object v0, p0, LD8/g;->c:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method


# virtual methods
.method public a()Lgg/b;
    .locals 4

    invoke-direct {p0}, LD8/g;->e()Li8/a;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Li8/a$b;

    sget-object v2, Li8/j;->a:Li8/j;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v0, v1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v0

    return-object v0
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, LD8/g;->d:Lgg/i;

    return-object v0
.end method
