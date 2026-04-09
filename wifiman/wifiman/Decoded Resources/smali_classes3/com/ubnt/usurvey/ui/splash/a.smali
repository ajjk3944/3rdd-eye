.class public final Lcom/ubnt/usurvey/ui/splash/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ubnt/usurvey/ui/splash/SplashActivity$b;


# static fields
.field static final synthetic f:[Lth/l;

.field public static final g:I


# instance fields
.field private final a:LYg/m;

.field private final b:LYg/m;

.field private final c:LYg/m;

.field private final d:LFg/a;

.field private final e:Lgg/b;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, Lcom/ubnt/usurvey/ui/splash/a;

    const-string/jumbo v2, "viewRouter"

    const-string/jumbo v3, "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "appSessionManager"

    const-string/jumbo v5, "getAppSessionManager()Lcom/ui/wifiman/model/session/AppSessionManager;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/F;

    const-string/jumbo v5, "wizardManager"

    const-string/jumbo v6, "getWizardManager()Lcom/ubnt/usurvey/ui/wizard/AppWizardManager;"

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

    sput-object v3, Lcom/ubnt/usurvey/ui/splash/a;->f:[Lth/l;

    const/16 v0, 0x8

    sput v0, Lcom/ubnt/usurvey/ui/splash/a;->g:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 7

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, Lcom/ubnt/usurvey/ui/splash/a$c;

    invoke-direct {v1}, Lcom/ubnt/usurvey/ui/splash/a$c;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string/jumbo v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, Li8/a;

    invoke-direct {v0, v1, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    sget-object v3, Lcom/ubnt/usurvey/ui/splash/a;->f:[Lth/l;

    const/4 v4, 0x0

    aget-object v5, v3, v4

    invoke-interface {v0, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, Lcom/ubnt/usurvey/ui/splash/a;->a:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v5, Lcom/ubnt/usurvey/ui/splash/a$d;

    invoke-direct {v5}, Lcom/ubnt/usurvey/ui/splash/a$d;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Lld/b;

    invoke-direct {v0, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p1, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v5, 0x1

    aget-object v6, v3, v5

    invoke-interface {v0, p0, v6}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, Lcom/ubnt/usurvey/ui/splash/a;->b:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v6, Lcom/ubnt/usurvey/ui/splash/a$e;

    invoke-direct {v6}, Lcom/ubnt/usurvey/ui/splash/a$e;-><init>()V

    invoke-virtual {v6}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v6

    invoke-static {v6}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, LN8/a;

    invoke-direct {v0, v6, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p1, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v0, 0x2

    aget-object v1, v3, v0

    invoke-interface {p1, p0, v1}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lcom/ubnt/usurvey/ui/splash/a;->c:LYg/m;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p1

    const-string/jumbo v1, "createDefault(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ubnt/usurvey/ui/splash/a;->d:LFg/a;

    invoke-direct {p0}, Lcom/ubnt/usurvey/ui/splash/a;->e()Lld/b;

    move-result-object p1

    invoke-interface {p1}, Lld/b;->b()Lgg/b;

    move-result-object p1

    invoke-direct {p0}, Lcom/ubnt/usurvey/ui/splash/a;->g()LN8/a;

    move-result-object v1

    invoke-interface {v1}, LN8/a;->getState()Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    sget-object v2, Lcom/ubnt/usurvey/ui/splash/a$a;->a:Lcom/ubnt/usurvey/ui/splash/a$a;

    invoke-virtual {v1, v2}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v1

    new-instance v2, Lcom/ubnt/usurvey/ui/splash/a$b;

    invoke-direct {v2, p0}, Lcom/ubnt/usurvey/ui/splash/a$b;-><init>(Lcom/ubnt/usurvey/ui/splash/a;)V

    invoke-virtual {v1, v2}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v1

    new-array v0, v0, [Lgg/f;

    aput-object p1, v0, v4

    aput-object v1, v0, v5

    invoke-static {v0}, Lgg/b;->p([Lgg/f;)Lgg/b;

    move-result-object p1

    new-instance v0, LF8/c;

    invoke-direct {v0, p0}, LF8/c;-><init>(Lcom/ubnt/usurvey/ui/splash/a;)V

    invoke-virtual {p1, v0}, Lgg/b;->x(Lkg/a;)Lgg/b;

    move-result-object p1

    invoke-virtual {p1}, Lgg/b;->l()Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "cache(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ubnt/usurvey/ui/splash/a;->e:Lgg/b;

    return-void
.end method

.method public static synthetic c(Lcom/ubnt/usurvey/ui/splash/a;)V
    .locals 0

    invoke-static {p0}, Lcom/ubnt/usurvey/ui/splash/a;->h(Lcom/ubnt/usurvey/ui/splash/a;)V

    return-void
.end method

.method public static final synthetic d(Lcom/ubnt/usurvey/ui/splash/a;)Li8/a;
    .locals 0

    invoke-direct {p0}, Lcom/ubnt/usurvey/ui/splash/a;->f()Li8/a;

    move-result-object p0

    return-object p0
.end method

.method private final e()Lld/b;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/usurvey/ui/splash/a;->b:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lld/b;

    return-object v0
.end method

.method private final f()Li8/a;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/usurvey/ui/splash/a;->a:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method

.method private final g()LN8/a;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/usurvey/ui/splash/a;->c:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LN8/a;

    return-object v0
.end method

.method private static final h(Lcom/ubnt/usurvey/ui/splash/a;)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string/jumbo v2, "Session setup complete. Setting finished flag to allow spash screen to quit"

    invoke-static {v2, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object p0, p0, Lcom/ubnt/usurvey/ui/splash/a;->d:LFg/a;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a()Lgg/b;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/usurvey/ui/splash/a;->e:Lgg/b;

    return-object v0
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Lcom/ubnt/usurvey/ui/splash/a;->d:LFg/a;

    invoke-virtual {v0}, LFg/a;->l2()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
