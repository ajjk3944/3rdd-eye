.class public final LP8/i;
.super LIf/B;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP8/i$a;
    }
.end annotation


# static fields
.field public static final m:LP8/i$a;

.field static final synthetic n:[Lth/l;

.field public static final o:I


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:LYg/m;

.field private final j:LLi/N;

.field private final k:LLi/z;

.field private final l:LLi/y;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LP8/i;

    const-string/jumbo v2, "discovery"

    const-string/jumbo v3, "getDiscovery()Lcom/ui/wifiman/model/wmw/WifimanWizardDiscovery;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "viewRouter"

    const-string/jumbo v5, "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/D;

    const-string/jumbo v5, "discoveredDeviceStream"

    const-string v6, "<v#0>"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/D;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->g(Lkotlin/jvm/internal/C;)Lth/m;

    move-result-object v1

    const/4 v3, 0x3

    new-array v3, v3, [Lth/l;

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v2, v3, v0

    const/4 v0, 0x2

    aput-object v1, v3, v0

    sput-object v3, LP8/i;->n:[Lth/l;

    new-instance v0, LP8/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LP8/i$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LP8/i;->m:LP8/i$a;

    const/16 v0, 0x8

    sput v0, LP8/i;->o:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 5

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LIf/B;-><init>()V

    iput-object p1, p0, LP8/i;->g:Lorg/kodein/di/DI;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, LP8/i$d;

    invoke-direct {v0}, LP8/i$d;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Lcom/ui/wifiman/model/wmw/d;

    invoke-direct {p1, v0, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    sget-object v2, LP8/i;->n:[Lth/l;

    const/4 v3, 0x0

    aget-object v4, v2, v3

    invoke-interface {p1, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LP8/i;->h:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v4, LP8/i$e;

    invoke-direct {v4}, LP8/i$e;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, Li8/a;

    invoke-direct {p1, v4, v1}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v1, 0x1

    aget-object v2, v2, v1

    invoke-interface {p1, p0, v2}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LP8/i;->i:LYg/m;

    invoke-direct {p0}, LP8/i;->v0()V

    new-instance p1, Ls9/d$b;

    const v2, 0x7f110445

    invoke-direct {p1, v2}, Ls9/d$b;-><init>(I)V

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, LP8/i;->j:LLi/N;

    new-instance p1, Ls9/d$b;

    const v2, 0x7f110446

    invoke-direct {p1, v2}, Ls9/d$b;-><init>(I)V

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, LP8/i;->k:LLi/z;

    sget-object p1, LKi/a;->DROP_OLDEST:LKi/a;

    invoke-static {v3, v1, p1, v1, v0}, LLi/F;->b(IILKi/a;ILjava/lang/Object;)LLi/y;

    move-result-object p1

    iput-object p1, p0, LP8/i;->l:LLi/y;

    return-void
.end method

.method public static synthetic q0(LP8/i;)Lgg/i;
    .locals 0

    invoke-static {p0}, LP8/i;->w0(LP8/i;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method private final r0()Lcom/ui/wifiman/model/wmw/d;
    .locals 1

    iget-object v0, p0, LP8/i;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/wmw/d;

    return-object v0
.end method

.method private final t0()Li8/a;
    .locals 1

    iget-object v0, p0, LP8/i;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method

.method private final v0()V
    .locals 7

    sget-object v6, Lye/d;->a:Lye/d;

    new-instance v3, LP8/h;

    invoke-direct {v3, p0}, LP8/h;-><init>(LP8/i;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, v6

    move-object v1, p0

    invoke-static/range {v0 .. v5}, Lye/d;->c(Lye/d;Lye/g;Landroidx/lifecycle/k$b;Lmh/a;ILjava/lang/Object;)Lye/d$a;

    move-result-object v0

    invoke-static {v0}, LP8/i;->x0(Lye/d$a;)Lgg/i;

    move-result-object v0

    invoke-virtual {v6, v0, p0}, Lye/d;->e(Lgg/i;Lye/g;)V

    return-void
.end method

.method private static final w0(LP8/i;)Lgg/i;
    .locals 4

    invoke-direct {p0}, LP8/i;->r0()Lcom/ui/wifiman/model/wmw/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/ui/wifiman/model/wmw/d;->a()Lgg/i;

    move-result-object v0

    sget-object v1, LP8/i$b;->a:LP8/i$b;

    invoke-virtual {v0, v1}, Lgg/i;->p0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->U()Lgg/i;

    move-result-object v0

    const-wide/16 v1, 0x3e8

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lgg/i;->Y1(JLjava/util/concurrent/TimeUnit;)Lgg/i;

    move-result-object v0

    new-instance v1, LP8/i$c;

    invoke-direct {v1, p0}, LP8/i$c;-><init>(LP8/i;)V

    invoke-virtual {v0, v1}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p0

    const-string/jumbo v0, "doOnNext(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final x0(Lye/d$a;)Lgg/i;
    .locals 2

    sget-object v0, LP8/i;->n:[Lth/l;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lye/d$a;->c(Ljava/lang/Object;Lth/l;)Lgg/i;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic b()LLi/g;
    .locals 1

    invoke-virtual {p0}, LP8/i;->s0()LLi/y;

    move-result-object v0

    return-object v0
.end method

.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, LP8/i;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, LP8/i;->j:LLi/N;

    return-object v0
.end method

.method public bridge synthetic o0()LLi/N;
    .locals 1

    invoke-virtual {p0}, LP8/i;->u0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public p0()V
    .locals 5

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LP8/i;->t0()Li8/a;

    move-result-object v1

    new-instance v2, Li8/a$b$o;

    const-string/jumbo v3, "https://eu.store.ui.com/collections/unifi-accessories/products/wifiman-wizard-ea"

    invoke-direct {v2, v3}, Li8/a$b$o;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x1

    new-array v3, v3, [Li8/a$b;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    invoke-interface {v1, v3}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public s0()LLi/y;
    .locals 1

    iget-object v0, p0, LP8/i;->l:LLi/y;

    return-object v0
.end method

.method public u0()LLi/z;
    .locals 1

    iget-object v0, p0, LP8/i;->k:LLi/z;

    return-object v0
.end method
