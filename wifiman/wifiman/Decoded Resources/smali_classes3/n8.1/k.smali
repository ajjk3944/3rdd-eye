.class public final Ln8/k;
.super LJe/n;
.source "SourceFile"


# static fields
.field static final synthetic o:[Lth/l;

.field public static final p:I


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:LYg/m;

.field private j:Ljava/lang/String;

.field private final k:Lgg/i;

.field private final l:Lgg/i;

.field private final m:LLi/N;

.field private final n:LLi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, Ln8/k;

    const-string/jumbo v2, "deviceManager"

    const-string/jumbo v3, "getDeviceManager()Lcom/ui/wifiman/model/device/WifimanDeviceManager;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "viewRouter"

    const-string/jumbo v5, "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lth/l;

    aput-object v0, v2, v4

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, Ln8/k;->o:[Lth/l;

    const/16 v0, 0x8

    sput v0, Ln8/k;->p:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 9

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LJe/n;-><init>()V

    iput-object p1, p0, Ln8/k;->g:Lorg/kodein/di/DI;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, Ln8/k$i;

    invoke-direct {v0}, Ln8/k$i;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, LCc/n;

    invoke-direct {p1, v0, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    sget-object v2, Ln8/k;->o:[Lth/l;

    const/4 v3, 0x0

    aget-object v3, v2, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Ln8/k;->h:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v3, Ln8/k$j;

    invoke-direct {v3}, Ln8/k$j;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, Li8/a;

    invoke-direct {p1, v3, v1}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v0, 0x1

    aget-object v1, v2, v0

    invoke-interface {p1, p0, v1}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Ln8/k;->i:LYg/m;

    const-string p1, ""

    iput-object p1, p0, Ln8/k;->j:Ljava/lang/String;

    sget-object p1, Lgg/a;->LATEST:Lgg/a;

    new-instance v1, Ln8/k$h;

    invoke-direct {v1, p0}, Ln8/k$h;-><init>(Ln8/k;)V

    invoke-static {v1, p1}, Lgg/i;->N(Lgg/k;Lgg/a;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ln8/k;->k:Lgg/i;

    sget-object v0, Ln8/k$d;->a:Ln8/k$d;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-direct {p0}, Ln8/k;->w0()LCc/n;

    move-result-object v0

    invoke-interface {v0}, LCc/n;->a()Lgg/i;

    move-result-object v0

    sget-object v1, Ln8/k$e;->a:Ln8/k$e;

    invoke-static {p1, v0, v1}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "distinctUntilChanged(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ln8/k;->l:Lgg/i;

    sget-object v0, Ln8/k$a;->a:Ln8/k$a;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    new-instance v1, Ln8/k$b;

    invoke-direct {v1, p0}, Ln8/k$b;-><init>(Ln8/k;)V

    invoke-virtual {v0, v1}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object v0

    sget-object v1, Ln8/k$c;->a:Ln8/k$c;

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v3

    const-string/jumbo v0, "map(...)"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v7}, Lye/g;->h0(Lye/g;Lgg/i;Ljava/lang/Object;Landroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v1

    iput-object v1, p0, Ln8/k;->m:LLi/N;

    sget-object v1, Ln8/k$f;->a:Ln8/k$f;

    invoke-virtual {p1, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Ls9/d$b;

    const p1, 0x7f1100af

    invoke-direct {v4, p1}, Ls9/d$b;-><init>(I)V

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, Ln8/k;->n:LLi/N;

    return-void
.end method

.method public static final synthetic s0(Ln8/k;)LCc/n;
    .locals 0

    invoke-direct {p0}, Ln8/k;->w0()LCc/n;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic t0(Ln8/k;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ln8/k;->j:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic u0(Ln8/k;)LJe/m;
    .locals 0

    invoke-virtual {p0}, LJe/n;->p0()LJe/m;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic v0(Ln8/k;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ln8/k;->j:Ljava/lang/String;

    return-void
.end method

.method private final w0()LCc/n;
    .locals 1

    iget-object v0, p0, Ln8/k;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LCc/n;

    return-object v0
.end method

.method private final x0()Li8/a;
    .locals 1

    iget-object v0, p0, Ln8/k;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method


# virtual methods
.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, Ln8/k;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, Ln8/k;->m:LLi/N;

    return-object v0
.end method

.method public o0()LLi/N;
    .locals 1

    iget-object v0, p0, Ln8/k;->n:LLi/N;

    return-object v0
.end method

.method public q0(Ljava/lang/String;)V
    .locals 1

    const-string/jumbo v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ln8/k;->j:Ljava/lang/String;

    return-void
.end method

.method public r0()V
    .locals 6

    sget-object v0, Lye/d;->a:Lye/d;

    iget-object v1, p0, Ln8/k;->k:Lgg/i;

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    new-instance v2, Ln8/k$g;

    invoke-direct {v2, p0}, Ln8/k$g;-><init>(Ln8/k;)V

    invoke-virtual {v1, v2}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v1

    invoke-direct {p0}, Ln8/k;->x0()Li8/a;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Li8/a$b;

    sget-object v4, Li8/a$b$n;->a:Li8/a$b$n;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-interface {v2, v3}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v2

    invoke-virtual {v1, v2}, Lgg/b;->g(Lgg/f;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "andThen(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method
