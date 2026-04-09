.class public final LP8/e;
.super LIf/y;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP8/e$a;
    }
.end annotation


# static fields
.field static final synthetic m:[Lth/l;

.field public static final n:I


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:Lgg/i;

.field private final j:LLi/N;

.field private final k:LLi/N;

.field private final l:LLi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/F;

    const-string/jumbo v1, "getWizard()Lcom/ui/wifiman/model/wmw/WifimanWizard;"

    const/4 v2, 0x0

    const-class v3, LP8/e;

    const-string/jumbo v4, "wizard"

    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lth/l;

    aput-object v0, v1, v2

    sput-object v1, LP8/e;->m:[Lth/l;

    const/16 v0, 0x8

    sput v0, LP8/e;->n:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 8

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LIf/y;-><init>()V

    iput-object p1, p0, LP8/e;->g:Lorg/kodein/di/DI;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, LP8/e$d;

    invoke-direct {v0}, LP8/e$d;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, Lcom/ui/wifiman/model/wmw/WifimanWizard;

    invoke-direct {p1, v0, v1}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    sget-object v0, LP8/e;->m:[Lth/l;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {p1, p0, v0}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LP8/e;->h:LYg/m;

    invoke-direct {p0}, LP8/e;->v0()Lcom/ui/wifiman/model/wmw/WifimanWizard;

    move-result-object p1

    invoke-interface {p1}, Lcom/ui/wifiman/model/wmw/WifimanWizard;->d()Lgg/i;

    move-result-object p1

    invoke-direct {p0}, LP8/e;->v0()Lcom/ui/wifiman/model/wmw/WifimanWizard;

    move-result-object v0

    invoke-interface {v0}, Lcom/ui/wifiman/model/wmw/WifimanWizard;->e()Lgg/i;

    move-result-object v0

    invoke-direct {p0}, LP8/e;->v0()Lcom/ui/wifiman/model/wmw/WifimanWizard;

    move-result-object v1

    invoke-interface {v1}, Lcom/ui/wifiman/model/wmw/WifimanWizard;->getState()Lgg/i;

    move-result-object v1

    sget-object v2, LP8/e$e;->a:LP8/e$e;

    invoke-static {p1, v0, v1, v2}, Lgg/i;->u(LDj/a;LDj/a;LDj/a;Lkg/g;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LP8/e;->i:Lgg/i;

    new-instance v0, LP8/e$c;

    invoke-direct {v0, p0}, LP8/e$c;-><init>(LP8/e;)V

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v2

    const-string/jumbo v0, "map(...)"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v7}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v1

    iput-object v1, p0, LP8/e;->j:LLi/N;

    new-instance v1, LP8/e$h;

    invoke-direct {v1, p0}, LP8/e$h;-><init>(LP8/e;)V

    invoke-virtual {p1, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x2

    const/4 v4, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v7}, Lye/g;->h0(Lye/g;Lgg/i;Ljava/lang/Object;Landroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v1

    iput-object v1, p0, LP8/e;->k:LLi/N;

    new-instance v1, LP8/e$b;

    invoke-direct {v1, p0}, LP8/e$b;-><init>(LP8/e;)V

    invoke-virtual {p1, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {v2 .. v7}, Lye/g;->h0(Lye/g;Lgg/i;Ljava/lang/Object;Landroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, LP8/e;->l:LLi/N;

    return-void
.end method

.method public static final synthetic p0(LP8/e;LP8/e$a;)Ls9/d;
    .locals 0

    invoke-direct {p0, p1}, LP8/e;->s0(LP8/e$a;)Ls9/d;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic q0(LP8/e;LP8/e$a;)F
    .locals 0

    invoke-direct {p0, p1}, LP8/e;->t0(LP8/e$a;)F

    move-result p0

    return p0
.end method

.method public static final synthetic r0(LP8/e;LP8/e$a;)Ls9/d;
    .locals 0

    invoke-direct {p0, p1}, LP8/e;->u0(LP8/e$a;)Ls9/d;

    move-result-object p0

    return-object p0
.end method

.method private final s0(LP8/e$a;)Ls9/d;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method private final t0(LP8/e$a;)F
    .locals 2

    instance-of v0, p1, LP8/e$a$a;

    if-eqz v0, :cond_0

    check-cast p1, LP8/e$a$a;

    invoke-virtual {p1}, LP8/e$a$a;->a()Lcom/ui/wifiman/model/wmw/b$c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/wmw/b$c;->b()F

    move-result p1

    goto :goto_1

    :cond_0
    instance-of v0, p1, LP8/e$a$b;

    if-eqz v0, :cond_5

    check-cast p1, LP8/e$a$b;

    invoke-virtual {p1}, LP8/e$a$b;->a()Lcom/ui/wifiman/model/wmw/WifimanWizard$a;

    move-result-object v0

    instance-of v1, v0, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$c;

    if-nez v1, :cond_4

    instance-of v1, v0, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$b;

    if-nez v1, :cond_4

    instance-of v1, v0, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$c;

    if-nez v1, :cond_4

    instance-of v1, v0, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$d;

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    instance-of v1, v0, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$b;

    if-eqz v1, :cond_2

    invoke-virtual {p1}, LP8/e$a$b;->a()Lcom/ui/wifiman/model/wmw/WifimanWizard$a;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$b;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$b;->b()F

    move-result p1

    goto :goto_1

    :cond_2
    instance-of p1, v0, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$a;

    if-eqz p1, :cond_3

    const/high16 p1, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    :goto_0
    const/4 p1, 0x0

    :goto_1
    return p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final u0(LP8/e$a;)Ls9/d;
    .locals 4

    instance-of v0, p1, LP8/e$a$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, LP8/e$a$a;

    invoke-virtual {v0}, LP8/e$a$a;->a()Lcom/ui/wifiman/model/wmw/b$c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wifiman/model/wmw/b$c;->a()Lcom/ui/wifiman/model/wmw/b;

    move-result-object v2

    instance-of v3, v2, Lcom/ui/wifiman/model/wmw/b$b;

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    instance-of v1, v2, Lcom/ui/wifiman/model/wmw/b$a;

    if-eqz v1, :cond_1

    new-instance v1, Ls9/d$a;

    invoke-virtual {v0}, LP8/e$a$a;->a()Lcom/ui/wifiman/model/wmw/b$c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/wifiman/model/wmw/b$c;->a()Lcom/ui/wifiman/model/wmw/b;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v2, LP8/e$f;

    invoke-direct {v2, p1}, LP8/e$f;-><init>(LP8/e$a;)V

    invoke-direct {v1, v0, v2}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    instance-of v0, p1, LP8/e$a$b;

    if-eqz v0, :cond_6

    move-object v0, p1

    check-cast v0, LP8/e$a$b;

    invoke-virtual {v0}, LP8/e$a$b;->a()Lcom/ui/wifiman/model/wmw/WifimanWizard$a;

    move-result-object v2

    instance-of v3, v2, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$c;

    if-nez v3, :cond_5

    instance-of v3, v2, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$b;

    if-eqz v3, :cond_3

    goto :goto_0

    :cond_3
    instance-of v1, v2, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a;

    if-eqz v1, :cond_4

    new-instance v1, Ls9/d$a;

    invoke-virtual {v0}, LP8/e$a$b;->a()Lcom/ui/wifiman/model/wmw/WifimanWizard$a;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a;->a()Lcom/ui/wifiman/model/wmw/b$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/wifiman/model/wmw/b$a;->a()Lh9/a;

    move-result-object v0

    const-string v2, ""

    invoke-virtual {v0, v2}, Lh9/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, LP8/e$g;

    invoke-direct {v2, p1}, LP8/e$g;-><init>(LP8/e$a;)V

    invoke-direct {v1, v0, v2}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    goto :goto_0

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    :goto_0
    return-object v1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final v0()Lcom/ui/wifiman/model/wmw/WifimanWizard;
    .locals 1

    iget-object v0, p0, LP8/e;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/wmw/WifimanWizard;

    return-object v0
.end method


# virtual methods
.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, LP8/e;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public getTitle()LLi/N;
    .locals 1

    iget-object v0, p0, LP8/e;->k:LLi/N;

    return-object v0
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, LP8/e;->l:LLi/N;

    return-object v0
.end method

.method public o0()LLi/N;
    .locals 1

    iget-object v0, p0, LP8/e;->j:LLi/N;

    return-object v0
.end method
