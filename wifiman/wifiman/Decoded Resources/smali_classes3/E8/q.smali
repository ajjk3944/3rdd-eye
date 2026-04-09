.class public final LE8/q;
.super Lcom/ui/wifiman/ui/speedtest/feedback/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE8/q$a;,
        LE8/q$b;
    }
.end annotation


# static fields
.field public static final n:LE8/q$a;

.field static final synthetic o:[Lth/l;

.field public static final p:I


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:LYg/m;

.field private final j:LYg/m;

.field private final k:LFg/a;

.field private final l:LLi/N;

.field private final m:LLi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LE8/q;

    const-string/jumbo v2, "viewRouter"

    const-string/jumbo v3, "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "toastService"

    const-string/jumbo v5, "getToastService()Lcom/ui/wifiman/domain/toast/ToastService;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/F;

    const-string/jumbo v5, "feedbackService"

    const-string/jumbo v6, "getFeedbackService()Lcom/ui/wifiman/model/speedtest/feedback/SpeedtestFeedbackService;"

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

    sput-object v3, LE8/q;->o:[Lth/l;

    new-instance v0, LE8/q$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LE8/q$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LE8/q;->n:LE8/q$a;

    const/16 v0, 0x8

    sput v0, LE8/q;->p:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 11

    const-string/jumbo v1, "di"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/ui/wifiman/ui/speedtest/feedback/e;-><init>()V

    iput-object p1, p0, LE8/q;->g:Lorg/kodein/di/DI;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, LE8/q$e;

    invoke-direct {v1}, LE8/q$e;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string/jumbo v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, Li8/a;

    invoke-direct {v0, v1, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    sget-object v3, LE8/q;->o:[Lth/l;

    const/4 v7, 0x0

    aget-object v4, v3, v7

    invoke-interface {v0, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LE8/q;->h:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v4, LE8/q$f;

    invoke-direct {v4}, LE8/q$f;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lhc/b;

    invoke-direct {v0, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v8, 0x1

    aget-object v4, v3, v8

    invoke-interface {v0, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LE8/q;->i:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v4, LE8/q$g;

    invoke-direct {v4}, LE8/q$g;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, LAd/a;

    invoke-direct {v0, v4, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v2, 0x2

    aget-object v2, v3, v2

    invoke-interface {v0, p0, v2}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LE8/q;->j:LYg/m;

    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v9}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object v10

    const-string/jumbo v0, "createDefault(...)"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v10, p0, LE8/q;->k:LFg/a;

    new-instance v0, LE8/p;

    invoke-direct {v0, p0}, LE8/p;-><init>(LE8/q;)V

    invoke-static {v0}, LT/o1;->o(Lmh/a;)LLi/g;

    move-result-object v0

    new-instance v2, LE8/q$d;

    invoke-direct {v2, v1}, LE8/q$d;-><init>(Ldh/e;)V

    invoke-static {v0, v2}, LLi/i;->O(LLi/g;Lmh/q;)LLi/g;

    move-result-object v1

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lye/g;->c0(Lye/g;LLi/g;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v0

    iput-object v0, p0, LE8/q;->l:LLi/N;

    invoke-virtual {v10}, Lgg/i;->e1()Lgg/i;

    move-result-object v0

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1, v7, v8}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object v0

    invoke-virtual {p0}, LE8/q;->o0()LLi/N;

    move-result-object v1

    new-instance v2, LE8/q$h;

    invoke-direct {v2, v1}, LE8/q$h;-><init>(LLi/g;)V

    invoke-static {p0}, Landroidx/lifecycle/O;->a(Landroidx/lifecycle/N;)LIi/N;

    move-result-object v1

    invoke-interface {v1}, LIi/N;->getCoroutineContext()Ldh/i;

    move-result-object v1

    invoke-static {v2, v1}, LQi/i;->b(LLi/g;Ldh/i;)Lgg/i;

    move-result-object v1

    sget-object v2, LE8/q$i;->a:LE8/q$i;

    invoke-static {v0, v1, v2}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object v1

    const-string/jumbo v0, "combineLatest(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    move-object v2, v9

    invoke-static/range {v0 .. v6}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v0

    iput-object v0, p0, LE8/q;->m:LLi/N;

    return-void
.end method

.method public static final synthetic A0(LE8/q;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, LE8/q;->G0()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic B0(LE8/q;)Lcom/ui/wifiman/ui/speedtest/feedback/d;
    .locals 0

    invoke-direct {p0}, LE8/q;->H0()Lcom/ui/wifiman/ui/speedtest/feedback/d;

    move-result-object p0

    return-object p0
.end method

.method private final C0(Lcom/ui/wifiman/ui/speedtest/feedback/d;)LAd/a$a;
    .locals 1

    sget-object v0, LE8/q$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    sget-object p1, LAd/a$a;->NOT_AS_EXPECTED:LAd/a$a;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, LAd/a$a;->POOR_THROUGHPUT:LAd/a$a;

    goto :goto_0

    :cond_2
    sget-object p1, LAd/a$a;->POOR_LATENCY:LAd/a$a;

    goto :goto_0

    :cond_3
    sget-object p1, LAd/a$a;->DROPPED_CONNECTIVITY:LAd/a$a;

    :goto_0
    return-object p1
.end method

.method private final D0()LAd/a;
    .locals 1

    iget-object v0, p0, LE8/q;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LAd/a;

    return-object v0
.end method

.method private final E0()Lhc/b;
    .locals 1

    iget-object v0, p0, LE8/q;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhc/b;

    return-object v0
.end method

.method private final F0()Li8/a;
    .locals 1

    iget-object v0, p0, LE8/q;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method

.method private final G0()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lye/g;->j0()Landroidx/lifecycle/E;

    move-result-object v0

    const-string/jumbo v1, "comment"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/E;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final H0()Lcom/ui/wifiman/ui/speedtest/feedback/d;
    .locals 2

    invoke-virtual {p0}, Lye/g;->j0()Landroidx/lifecycle/E;

    move-result-object v0

    const-string/jumbo v1, "reason"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/E;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/ui/speedtest/feedback/d;

    return-object v0
.end method

.method private static final I0(LE8/q;)V
    .locals 1

    iget-object p0, p0, LE8/q;->k:LFg/a;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method private static final J0(LE8/q;)Landroidx/lifecycle/E;
    .locals 0

    invoke-virtual {p0}, Lye/g;->j0()Landroidx/lifecycle/E;

    move-result-object p0

    return-object p0
.end method

.method private final K0(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0}, Lye/g;->j0()Landroidx/lifecycle/E;

    move-result-object v0

    const-string/jumbo v1, "comment"

    invoke-virtual {v0, v1, p1}, Landroidx/lifecycle/E;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private final L0(Lcom/ui/wifiman/ui/speedtest/feedback/d;)V
    .locals 2

    invoke-virtual {p0}, Lye/g;->j0()Landroidx/lifecycle/E;

    move-result-object v0

    const-string/jumbo v1, "reason"

    invoke-virtual {v0, v1, p1}, Landroidx/lifecycle/E;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private final M0()Lgg/b;
    .locals 2

    new-instance v0, LE8/q$j;

    invoke-direct {v0, p0}, LE8/q$j;-><init>(LE8/q;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object v0

    const-string/jumbo v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LE8/q$k;

    invoke-direct {v1, p0}, LE8/q$k;-><init>(LE8/q;)V

    invoke-virtual {v0, v1}, Lgg/n;->k(Lkg/n;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "flatMapCompletable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public static synthetic t0(LE8/q;)Landroidx/lifecycle/E;
    .locals 0

    invoke-static {p0}, LE8/q;->J0(LE8/q;)Landroidx/lifecycle/E;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u0(LE8/q;)V
    .locals 0

    invoke-static {p0}, LE8/q;->I0(LE8/q;)V

    return-void
.end method

.method public static final synthetic v0(LE8/q;Lcom/ui/wifiman/ui/speedtest/feedback/d;)LAd/a$a;
    .locals 0

    invoke-direct {p0, p1}, LE8/q;->C0(Lcom/ui/wifiman/ui/speedtest/feedback/d;)LAd/a$a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic w0(LE8/q;)LAd/a;
    .locals 0

    invoke-direct {p0}, LE8/q;->D0()LAd/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic x0(LE8/q;)Lcom/ui/wifiman/ui/speedtest/feedback/c;
    .locals 0

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/speedtest/feedback/e;->n0()Lcom/ui/wifiman/ui/speedtest/feedback/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic y0(LE8/q;)LFg/a;
    .locals 0

    iget-object p0, p0, LE8/q;->k:LFg/a;

    return-object p0
.end method

.method public static final synthetic z0(LE8/q;)Lhc/b;
    .locals 0

    invoke-direct {p0}, LE8/q;->E0()Lhc/b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, LE8/q;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public o0()LLi/N;
    .locals 1

    iget-object v0, p0, LE8/q;->l:LLi/N;

    return-object v0
.end method

.method public p0()LLi/N;
    .locals 1

    iget-object v0, p0, LE8/q;->m:LLi/N;

    return-object v0
.end method

.method public q0(Ljava/lang/String;)V
    .locals 1

    const-string/jumbo v0, "comment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LE8/q;->K0(Ljava/lang/String;)V

    return-void
.end method

.method public r0(Lcom/ui/wifiman/ui/speedtest/feedback/d;)V
    .locals 1

    const-string/jumbo v0, "reason"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LE8/q;->H0()Lcom/ui/wifiman/ui/speedtest/feedback/d;

    move-result-object v0

    if-eq v0, p1, :cond_0

    invoke-direct {p0, p1}, LE8/q;->L0(Lcom/ui/wifiman/ui/speedtest/feedback/d;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    invoke-direct {p0, p1}, LE8/q;->L0(Lcom/ui/wifiman/ui/speedtest/feedback/d;)V

    :goto_0
    return-void
.end method

.method public s0()V
    .locals 6

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LE8/q;->M0()Lgg/b;

    move-result-object v1

    invoke-direct {p0}, LE8/q;->F0()Li8/a;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Li8/a$b;

    sget-object v4, Li8/a$b$n;->a:Li8/a$b$n;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-interface {v2, v3}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v2

    filled-new-array {v1, v2}, [Lgg/b;

    move-result-object v1

    invoke-static {v1}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lgg/b;->o(Ljava/lang/Iterable;)Lgg/b;

    move-result-object v1

    new-instance v2, LE8/q$c;

    invoke-direct {v2, p0}, LE8/q$c;-><init>(LE8/q;)V

    invoke-virtual {v1, v2}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object v1

    new-instance v2, LE8/o;

    invoke-direct {v2, p0}, LE8/o;-><init>(LE8/q;)V

    invoke-virtual {v1, v2}, Lgg/b;->w(Lkg/a;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "doFinally(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method
