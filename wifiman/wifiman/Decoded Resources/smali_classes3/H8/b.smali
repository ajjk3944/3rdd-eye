.class public final LH8/b;
.super Lcom/ui/wifiman/ui/teleport/consoles/c;
.source "SourceFile"


# static fields
.field static final synthetic m:[Lth/l;

.field public static final n:I


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:LYg/m;

.field private final j:Lgg/i;

.field private final k:Lgg/i;

.field private final l:LLi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LH8/b;

    const-string/jumbo v2, "teleportManager"

    const-string/jumbo v3, "getTeleportManager()Lcom/ui/wifiman/model/teleport/TeleportManager;"

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

    sput-object v2, LH8/b;->m:[Lth/l;

    const/16 v0, 0x8

    sput v0, LH8/b;->n:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 7

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/ui/wifiman/ui/teleport/consoles/c;-><init>()V

    iput-object p1, p0, LH8/b;->g:Lorg/kodein/di/DI;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, LH8/b$c;

    invoke-direct {v0}, LH8/b$c;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, LFd/D;

    invoke-direct {p1, v0, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    sget-object v2, LH8/b;->m:[Lth/l;

    const/4 v3, 0x0

    aget-object v3, v2, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LH8/b;->h:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v3, LH8/b$d;

    invoke-direct {v3}, LH8/b$d;-><init>()V

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

    iput-object p1, p0, LH8/b;->i:LYg/m;

    sget-object p1, Lgg/a;->LATEST:Lgg/a;

    new-instance v1, LH8/b$b;

    invoke-direct {v1, p0}, LH8/b$b;-><init>(LH8/b;)V

    invoke-static {v1, p1}, Lgg/i;->N(Lgg/k;Lgg/a;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo v1, "refCount(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LH8/b;->j:Lgg/i;

    invoke-direct {p0}, LH8/b;->s0()LFd/D;

    move-result-object v2

    invoke-interface {v2}, LFd/D;->getAll()Lgg/i;

    move-result-object v2

    sget-object v3, LH8/b$e;->a:LH8/b$e;

    invoke-static {p1, v2, v3}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    const-string/jumbo v2, "combineLatest(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, LH8/a;

    invoke-direct {v2, p0}, LH8/a;-><init>(LH8/b;)V

    invoke-static {p1, v2}, Ln9/c;->c(Lgg/i;Lmh/l;)Lgg/i;

    move-result-object p1

    invoke-static {p1}, Ll9/f;->e(Lgg/i;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LH8/b;->k:Lgg/i;

    sget-object v0, LH8/b$f;->a:LH8/b$f;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    const-string/jumbo p1, "distinctUntilChanged(...)"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ls9/d$c;

    const-string p1, ""

    invoke-direct {v2, p1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, LH8/b;->l:LLi/N;

    return-void
.end method

.method public static synthetic p0(LH8/b;Ll9/a;)Lgg/b;
    .locals 0

    invoke-static {p0, p1}, LH8/b;->u0(LH8/b;Ll9/a;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic q0(LH8/b;)Lcom/ui/wifiman/ui/teleport/consoles/b;
    .locals 0

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/teleport/consoles/c;->n0()Lcom/ui/wifiman/ui/teleport/consoles/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic r0(LH8/b;)LFd/D;
    .locals 0

    invoke-direct {p0}, LH8/b;->s0()LFd/D;

    move-result-object p0

    return-object p0
.end method

.method private final s0()LFd/D;
    .locals 1

    iget-object v0, p0, LH8/b;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFd/D;

    return-object v0
.end method

.method private final t0()Li8/a;
    .locals 1

    iget-object v0, p0, LH8/b;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method

.method private static final u0(LH8/b;Ll9/a;)Lgg/b;
    .locals 2

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/teleport/n;

    if-nez p1, :cond_0

    invoke-direct {p0}, LH8/b;->t0()Li8/a;

    move-result-object p0

    const/4 p1, 0x1

    new-array p1, p1, [Li8/a$b;

    sget-object v0, Li8/a$b$n;->a:Li8/a$b$n;

    const/4 v1, 0x0

    aput-object v0, p1, v1

    invoke-interface {p0, p1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_0
    return-object p0
.end method


# virtual methods
.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, LH8/b;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public getTitle()LLi/N;
    .locals 1

    iget-object v0, p0, LH8/b;->l:LLi/N;

    return-object v0
.end method

.method public o0()V
    .locals 3

    sget-object v0, Lye/d;->a:Lye/d;

    iget-object v1, p0, LH8/b;->k:Lgg/i;

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    new-instance v2, LH8/b$a;

    invoke-direct {v2, p0}, LH8/b$a;-><init>(LH8/b;)V

    invoke-virtual {v1, v2}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "flatMapCompletable(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method
