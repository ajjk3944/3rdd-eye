.class public final Lw8/u;
.super Lcom/ui/wifiman/ui/settings/preferences/l;
.source "SourceFile"


# static fields
.field static final synthetic l:[Lth/l;

.field public static final m:I


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:LYg/m;

.field private final j:Lgg/i;

.field private final k:LLi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, Lw8/u;

    const-string/jumbo v2, "localConsoleService"

    const-string/jumbo v3, "getLocalConsoleService()Lcom/ui/wifiman/model/ubiquiti/console/local/UnifiLocalConsoleService;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "localConsoleCertManager"

    const-string/jumbo v5, "getLocalConsoleCertManager()Lcom/ui/wifiman/model/ubiquiti/console/local/UnifiLocalConsoleCertificateManager;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lth/l;

    aput-object v0, v2, v4

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, Lw8/u;->l:[Lth/l;

    const/16 v0, 0x8

    sput v0, Lw8/u;->m:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 8

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/ui/wifiman/ui/settings/preferences/l;-><init>()V

    iput-object p1, p0, Lw8/u;->g:Lorg/kodein/di/DI;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, Lw8/u$e;

    invoke-direct {v0}, Lw8/u$e;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, LSd/d;

    invoke-direct {p1, v0, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    sget-object v2, Lw8/u;->l:[Lth/l;

    const/4 v3, 0x0

    aget-object v3, v2, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lw8/u;->h:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v3, Lw8/u$f;

    invoke-direct {v3}, Lw8/u$f;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, LSd/a;

    invoke-direct {p1, v3, v1}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v0, 0x1

    aget-object v0, v2, v0

    invoke-interface {p1, p0, v0}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lw8/u;->i:LYg/m;

    invoke-direct {p0}, Lw8/u;->q0()LSd/d;

    move-result-object p1

    invoke-interface {p1}, LSd/d;->c()Lgg/i;

    move-result-object p1

    sget-object v0, Lw8/u$b;->a:Lw8/u$b;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    new-instance v0, Lw8/u$c;

    invoke-direct {v0, p0}, Lw8/u$c;-><init>(Lw8/u;)V

    invoke-virtual {p1, v0}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object v0, Lw8/u$d;->a:Lw8/u$d;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "map(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lw8/u;->j:Lgg/i;

    invoke-direct {p0}, Lw8/u;->q0()LSd/d;

    move-result-object v0

    invoke-interface {v0}, LSd/d;->c()Lgg/i;

    move-result-object v0

    sget-object v1, Lw8/u$a;->a:Lw8/u$a;

    invoke-static {v0, p1, v1}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object v3

    const-string/jumbo p1, "combineLatest(...)"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v7}, Lye/g;->h0(Lye/g;Lgg/i;Ljava/lang/Object;Landroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, Lw8/u;->k:LLi/N;

    return-void
.end method

.method public static final synthetic o0(Lw8/u;)LSd/a;
    .locals 0

    invoke-direct {p0}, Lw8/u;->p0()LSd/a;

    move-result-object p0

    return-object p0
.end method

.method private final p0()LSd/a;
    .locals 1

    iget-object v0, p0, Lw8/u;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LSd/a;

    return-object v0
.end method

.method private final q0()LSd/d;
    .locals 1

    iget-object v0, p0, Lw8/u;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LSd/d;

    return-object v0
.end method


# virtual methods
.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, Lw8/u;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, Lw8/u;->k:LLi/N;

    return-object v0
.end method
