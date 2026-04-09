.class public final LN8/p;
.super LHf/c;
.source "SourceFile"


# static fields
.field static final synthetic l:[Lth/l;

.field public static final m:I


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:LYg/m;

.field private final j:LYg/m;

.field private final k:LLi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LN8/p;

    const-string/jumbo v2, "wizardManager"

    const-string/jumbo v3, "getWizardManager()Lcom/ubnt/usurvey/ui/wizard/AppWizardManager;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "popupController"

    const-string/jumbo v5, "getPopupController()Lcom/ubnt/usurvey/ui/popup/ApplicationPopupController;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/F;

    const-string/jumbo v5, "viewRouter"

    const-string/jumbo v6, "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v3

    new-instance v5, Lkotlin/jvm/internal/D;

    const-string/jumbo v6, "wizardFinished"

    const-string v7, "<v#0>"

    invoke-direct {v5, v1, v6, v7, v4}, Lkotlin/jvm/internal/D;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v5}, Lkotlin/jvm/internal/O;->g(Lkotlin/jvm/internal/C;)Lth/m;

    move-result-object v5

    new-instance v6, Lkotlin/jvm/internal/D;

    const-string/jumbo v7, "hidePopupsStream"

    const-string v8, "<v#1>"

    invoke-direct {v6, v1, v7, v8, v4}, Lkotlin/jvm/internal/D;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v6}, Lkotlin/jvm/internal/O;->g(Lkotlin/jvm/internal/C;)Lth/m;

    move-result-object v1

    const/4 v6, 0x5

    new-array v6, v6, [Lth/l;

    aput-object v0, v6, v4

    const/4 v0, 0x1

    aput-object v2, v6, v0

    const/4 v0, 0x2

    aput-object v3, v6, v0

    const/4 v0, 0x3

    aput-object v5, v6, v0

    const/4 v0, 0x4

    aput-object v1, v6, v0

    sput-object v6, LN8/p;->l:[Lth/l;

    const/16 v0, 0x8

    sput v0, LN8/p;->m:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 7

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LHf/c;-><init>()V

    iput-object p1, p0, LN8/p;->g:Lorg/kodein/di/DI;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, LN8/p$b;

    invoke-direct {v0}, LN8/p$b;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, LN8/a;

    invoke-direct {p1, v0, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    sget-object v2, LN8/p;->l:[Lth/l;

    const/4 v3, 0x0

    aget-object v3, v2, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LN8/p;->h:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v3, LN8/p$c;

    invoke-direct {v3}, LN8/p$c;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lu8/a;

    invoke-direct {p1, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v3, 0x1

    aget-object v3, v2, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LN8/p;->i:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v3, LN8/p$d;

    invoke-direct {v3}, LN8/p$d;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, Li8/a;

    invoke-direct {p1, v3, v1}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v0, 0x2

    aget-object v0, v2, v0

    invoke-interface {p1, p0, v0}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LN8/p;->j:LYg/m;

    invoke-direct {p0}, LN8/p;->t0()LN8/a;

    move-result-object p1

    invoke-interface {p1}, LN8/a;->getState()Lgg/i;

    move-result-object p1

    const-class v0, LN8/a$a$b;

    invoke-virtual {p1, v0}, Lgg/i;->Z0(Ljava/lang/Class;)Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "ofType(R::class.java)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LN8/p$e;->a:LN8/p$e;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v2

    const-string/jumbo p1, "map(...)"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lye/g;->h0(Lye/g;Lgg/i;Ljava/lang/Object;Landroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, LN8/p;->k:LLi/N;

    return-void
.end method

.method public static synthetic o0(LN8/p;)Lgg/i;
    .locals 0

    invoke-static {p0}, LN8/p;->v0(LN8/p;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p0(LN8/p;)Lgg/i;
    .locals 0

    invoke-static {p0}, LN8/p;->y0(LN8/p;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic q0(LN8/p;)Li8/a;
    .locals 0

    invoke-direct {p0}, LN8/p;->s0()Li8/a;

    move-result-object p0

    return-object p0
.end method

.method private final r0()Lu8/a;
    .locals 1

    iget-object v0, p0, LN8/p;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu8/a;

    return-object v0
.end method

.method private final s0()Li8/a;
    .locals 1

    iget-object v0, p0, LN8/p;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method

.method private final t0()LN8/a;
    .locals 1

    iget-object v0, p0, LN8/p;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LN8/a;

    return-object v0
.end method

.method private final u0()V
    .locals 7

    sget-object v6, Lye/d;->a:Lye/d;

    new-instance v3, LN8/o;

    invoke-direct {v3, p0}, LN8/o;-><init>(LN8/p;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, v6

    move-object v1, p0

    invoke-static/range {v0 .. v5}, Lye/d;->c(Lye/d;Lye/g;Landroidx/lifecycle/k$b;Lmh/a;ILjava/lang/Object;)Lye/d$a;

    move-result-object v0

    invoke-static {v0}, LN8/p;->w0(Lye/d$a;)Lgg/i;

    move-result-object v0

    new-instance v1, LN8/p$a;

    invoke-direct {v1, p0}, LN8/p$a;-><init>(LN8/p;)V

    invoke-virtual {v0, v1}, Lgg/i;->t0(Lkg/n;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "flatMapCompletable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, v0, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method private static final v0(LN8/p;)Lgg/i;
    .locals 1

    invoke-direct {p0}, LN8/p;->t0()LN8/a;

    move-result-object p0

    invoke-interface {p0}, LN8/a;->getState()Lgg/i;

    move-result-object p0

    const-class v0, LN8/a$a$a;

    invoke-virtual {p0, v0}, Lgg/i;->Z0(Ljava/lang/Class;)Lgg/i;

    move-result-object p0

    const-string/jumbo v0, "ofType(R::class.java)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final w0(Lye/d$a;)Lgg/i;
    .locals 2

    sget-object v0, LN8/p;->l:[Lth/l;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lye/d$a;->c(Ljava/lang/Object;Lth/l;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method private final x0()V
    .locals 7

    sget-object v6, Lye/d;->a:Lye/d;

    new-instance v3, LN8/n;

    invoke-direct {v3, p0}, LN8/n;-><init>(LN8/p;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, v6

    move-object v1, p0

    invoke-static/range {v0 .. v5}, Lye/d;->c(Lye/d;Lye/g;Landroidx/lifecycle/k$b;Lmh/a;ILjava/lang/Object;)Lye/d$a;

    move-result-object v0

    invoke-static {v0}, LN8/p;->z0(Lye/d$a;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->E0()Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "ignoreElements(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, v0, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method private static final y0(LN8/p;)Lgg/i;
    .locals 1

    invoke-direct {p0}, LN8/p;->r0()Lu8/a;

    move-result-object p0

    invoke-interface {p0}, Lu8/a;->b()Lgg/b;

    move-result-object p0

    invoke-virtual {p0}, Lgg/b;->c0()Lgg/i;

    move-result-object p0

    const-string/jumbo v0, "toFlowable(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final z0(Lye/d$a;)Lgg/i;
    .locals 2

    sget-object v0, LN8/p;->l:[Lth/l;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lye/d$a;->c(Ljava/lang/Object;Lth/l;)Lgg/i;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, LN8/p;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public l0()V
    .locals 0

    invoke-direct {p0}, LN8/p;->u0()V

    invoke-direct {p0}, LN8/p;->x0()V

    return-void
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, LN8/p;->k:LLi/N;

    return-object v0
.end method
