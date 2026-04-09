.class public final LD8/a;
.super Ldf/c;
.source "SourceFile"


# static fields
.field static final synthetic p:[Lth/l;

.field public static final q:I


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:LYg/m;

.field private final j:LYg/m;

.field private final k:LYg/m;

.field private final l:LLi/N;

.field private final m:LLi/N;

.field private final n:LLi/N;

.field private final o:LLi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LD8/a;

    const-string/jumbo v2, "uispController"

    const-string/jumbo v3, "getUispController()Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;"

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

    new-instance v3, Lkotlin/jvm/internal/F;

    const-string/jumbo v5, "publicIPService"

    const-string/jumbo v6, "getPublicIPService()Lcom/ui/wifiman/model/publicip/PublicIP$Service;"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v3

    new-instance v5, Lkotlin/jvm/internal/F;

    const-string/jumbo v6, "internetAvailability"

    const-string/jumbo v7, "getInternetAvailability()Lcom/ui/wifiman/model/network/connection/InternetAvailabilityService;"

    invoke-direct {v5, v1, v6, v7, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v5}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/4 v5, 0x4

    new-array v5, v5, [Lth/l;

    aput-object v0, v5, v4

    const/4 v0, 0x1

    aput-object v2, v5, v0

    const/4 v0, 0x2

    aput-object v3, v5, v0

    const/4 v0, 0x3

    aput-object v1, v5, v0

    sput-object v5, LD8/a;->p:[Lth/l;

    const/16 v0, 0x8

    sput v0, LD8/a;->q:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 8

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ldf/c;-><init>()V

    iput-object p1, p0, LD8/a;->g:Lorg/kodein/di/DI;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, LD8/a$g;

    invoke-direct {v0}, LD8/a$g;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;

    invoke-direct {p1, v0, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    sget-object v2, LD8/a;->p:[Lth/l;

    const/4 v3, 0x0

    aget-object v3, v2, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LD8/a;->h:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v3, LD8/a$h;

    invoke-direct {v3}, LD8/a$h;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Li8/a;

    invoke-direct {p1, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v3, 0x1

    aget-object v3, v2, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LD8/a;->i:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v3, LD8/a$i;

    invoke-direct {v3}, LD8/a$i;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lkd/d;

    invoke-direct {p1, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v3, 0x2

    aget-object v3, v2, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LD8/a;->j:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v3, LD8/a$j;

    invoke-direct {v3}, LD8/a$j;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, LZc/a;

    invoke-direct {p1, v3, v1}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v0, 0x3

    aget-object v0, v2, v0

    invoke-interface {p1, p0, v0}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LD8/a;->k:LYg/m;

    invoke-direct {p0}, LD8/a;->u0()Lkd/d;

    move-result-object p1

    invoke-interface {p1}, Lkd/d;->a()Lgg/i;

    move-result-object p1

    invoke-direct {p0}, LD8/a;->v0()Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;

    move-result-object v0

    invoke-interface {v0}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;->a()Lgg/i;

    move-result-object v0

    sget-object v1, LD8/a$c;->a:LD8/a$c;

    invoke-static {p1, v0, v1}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    const-string/jumbo p1, "distinctUntilChanged(...)"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lye/g;->h0(Lye/g;Lgg/i;Ljava/lang/Object;Landroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v0

    iput-object v0, p0, LD8/a;->l:LLi/N;

    invoke-direct {p0}, LD8/a;->u0()Lkd/d;

    move-result-object v0

    invoke-interface {v0}, Lkd/d;->a()Lgg/i;

    move-result-object v0

    invoke-direct {p0}, LD8/a;->v0()Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;

    move-result-object v1

    invoke-interface {v1}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;->a()Lgg/i;

    move-result-object v1

    sget-object v2, LD8/a$d;->a:LD8/a$d;

    invoke-static {v0, v1, v2}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lye/g;->h0(Lye/g;Lgg/i;Ljava/lang/Object;Landroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v0

    iput-object v0, p0, LD8/a;->m:LLi/N;

    invoke-direct {p0}, LD8/a;->t0()LZc/a;

    move-result-object v0

    invoke-interface {v0}, LZc/a;->a()Lgg/i;

    move-result-object v0

    sget-object v1, LD8/a$a;->a:LD8/a$a;

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ldf/a;

    sget-object v0, Lb8/a$b;->a:Lb8/a$b;

    invoke-direct {v3, v0}, Ldf/a;-><init>(Lb8/a;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v7}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v0

    iput-object v0, p0, LD8/a;->n:LLi/N;

    invoke-direct {p0}, LD8/a;->v0()Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;

    move-result-object v0

    invoke-interface {v0}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;->a()Lgg/i;

    move-result-object v0

    sget-object v1, LD8/a$b;->a:LD8/a$b;

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LCi/a;->a()LCi/f;

    move-result-object v3

    move-object v1, p0

    invoke-static/range {v1 .. v7}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, LD8/a;->o:LLi/N;

    return-void
.end method

.method public static final synthetic s0(LD8/a;)Li8/a;
    .locals 0

    invoke-direct {p0}, LD8/a;->w0()Li8/a;

    move-result-object p0

    return-object p0
.end method

.method private final t0()LZc/a;
    .locals 1

    iget-object v0, p0, LD8/a;->k:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZc/a;

    return-object v0
.end method

.method private final u0()Lkd/d;
    .locals 1

    iget-object v0, p0, LD8/a;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkd/d;

    return-object v0
.end method

.method private final v0()Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;
    .locals 1

    iget-object v0, p0, LD8/a;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;

    return-object v0
.end method

.method private final w0()Li8/a;
    .locals 1

    iget-object v0, p0, LD8/a;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method


# virtual methods
.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, LD8/a;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, LD8/a;->n:LLi/N;

    return-object v0
.end method

.method public o0()LLi/N;
    .locals 1

    iget-object v0, p0, LD8/a;->o:LLi/N;

    return-object v0
.end method

.method public p0()LLi/N;
    .locals 1

    iget-object v0, p0, LD8/a;->l:LLi/N;

    return-object v0
.end method

.method public q0()LLi/N;
    .locals 1

    iget-object v0, p0, LD8/a;->m:LLi/N;

    return-object v0
.end method

.method public r0(Ldf/b;)V
    .locals 3

    const-string/jumbo v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LD8/a;->v0()Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;

    move-result-object v1

    invoke-interface {v1}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;->a()Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    new-instance v2, LD8/a$e;

    invoke-direct {v2, p1}, LD8/a$e;-><init>(Ldf/b;)V

    invoke-virtual {v1, v2}, Lgg/z;->u(Lkg/n;)Lgg/n;

    move-result-object p1

    new-instance v1, LD8/a$f;

    invoke-direct {v1, p0}, LD8/a$f;-><init>(LD8/a;)V

    invoke-virtual {p1, v1}, Lgg/n;->k(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string/jumbo v1, "flatMapCompletable(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method
