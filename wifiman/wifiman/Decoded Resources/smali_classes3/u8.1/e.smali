.class public final Lu8/e;
.super Lxe/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu8/e$a;
    }
.end annotation


# static fields
.field static final synthetic o:[Lth/l;

.field public static final p:I


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:LYg/m;

.field private final j:LYg/m;

.field private final k:LYg/m;

.field private final l:Lgg/i;

.field private final m:LLi/N;

.field private final n:LLi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, Lu8/e;

    const-string/jumbo v2, "popupController"

    const-string/jumbo v3, "getPopupController()Lcom/ubnt/usurvey/ui/popup/ApplicationPopupController;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "a2aSpeedtestPopupController"

    const-string/jumbo v5, "getA2aSpeedtestPopupController()Lcom/ubnt/usurvey/ui/speedtest/A2ASpeedtestPopupController;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/F;

    const-string/jumbo v5, "wifimanWizardPopupController"

    const-string/jumbo v6, "getWifimanWizardPopupController()Lcom/ubnt/usurvey/ui/wmw/popup/WmwPopupController;"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v3

    new-instance v5, Lkotlin/jvm/internal/F;

    const-string/jumbo v6, "directConsoleConnectionPopupController"

    const-string/jumbo v7, "getDirectConsoleConnectionPopupController()Lcom/ubnt/usurvey/ui/popup/console/DirectConsoleConnectionPopupController;"

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

    sput-object v5, Lu8/e;->o:[Lth/l;

    const/16 v0, 0x8

    sput v0, Lu8/e;->p:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 9

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lxe/h;-><init>()V

    iput-object p1, p0, Lu8/e;->g:Lorg/kodein/di/DI;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, Lu8/e$f;

    invoke-direct {v0}, Lu8/e$f;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Lu8/a;

    invoke-direct {p1, v0, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    sget-object v2, Lu8/e;->o:[Lth/l;

    const/4 v3, 0x0

    aget-object v3, v2, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lu8/e;->h:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v3, Lu8/e$g;

    invoke-direct {v3}, Lu8/e$g;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, LE8/a;

    invoke-direct {p1, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v3, 0x1

    aget-object v4, v2, v3

    invoke-interface {p1, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lu8/e;->i:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v4, Lu8/e$h;

    invoke-direct {v4}, Lu8/e$h;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, LP8/f;

    invoke-direct {p1, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v4, 0x2

    aget-object v4, v2, v4

    invoke-interface {p1, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lu8/e;->j:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v4, Lu8/e$i;

    invoke-direct {v4}, Lu8/e$i;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, Lv8/a;

    invoke-direct {p1, v4, v1}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v0, 0x3

    aget-object v0, v2, v0

    invoke-interface {p1, p0, v0}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lu8/e;->k:LYg/m;

    invoke-direct {p0}, Lu8/e;->t0()Lu8/a;

    move-result-object p1

    invoke-interface {p1}, Lu8/a;->a()Lgg/i;

    move-result-object p1

    invoke-direct {p0}, Lu8/e;->r0()LE8/a;

    move-result-object v0

    invoke-interface {v0}, LE8/a;->getState()Lgg/i;

    move-result-object v0

    invoke-direct {p0}, Lu8/e;->u0()LP8/f;

    move-result-object v1

    invoke-interface {v1}, LP8/f;->getState()Lgg/i;

    move-result-object v1

    invoke-direct {p0}, Lu8/e;->s0()Lv8/a;

    move-result-object v2

    invoke-interface {v2}, Lv8/a;->a()Lgg/i;

    move-result-object v2

    sget-object v4, Lu8/e$b;->a:Lu8/e$b;

    invoke-static {p1, v0, v1, v2, v4}, Lgg/i;->t(LDj/a;LDj/a;LDj/a;LDj/a;Lkg/h;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    sget-object v0, Lu8/e$c;->a:Lu8/e$c;

    invoke-virtual {p1, v0}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object v1

    const-string/jumbo p1, "refCount(...)"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lu8/e;->l:Lgg/i;

    new-instance p1, Lu8/e$d;

    invoke-direct {p1, p0}, Lu8/e$d;-><init>(Lu8/e;)V

    invoke-virtual {v1, p1}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object v3

    const-string/jumbo p1, "distinctUntilChanged(...)"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v8}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, Lu8/e;->m:LLi/N;

    sget-object v2, Lxe/g;->NONE:Lxe/g;

    const/4 v5, 0x6

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, Lu8/e;->n:LLi/N;

    return-void
.end method

.method public static final synthetic q0(Lu8/e;)LP8/f;
    .locals 0

    invoke-direct {p0}, Lu8/e;->u0()LP8/f;

    move-result-object p0

    return-object p0
.end method

.method private final r0()LE8/a;
    .locals 1

    iget-object v0, p0, Lu8/e;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LE8/a;

    return-object v0
.end method

.method private final s0()Lv8/a;
    .locals 1

    iget-object v0, p0, Lu8/e;->k:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv8/a;

    return-object v0
.end method

.method private final t0()Lu8/a;
    .locals 1

    iget-object v0, p0, Lu8/e;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu8/a;

    return-object v0
.end method

.method private final u0()LP8/f;
    .locals 1

    iget-object v0, p0, Lu8/e;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LP8/f;

    return-object v0
.end method


# virtual methods
.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, Lu8/e;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, Lu8/e;->n:LLi/N;

    return-object v0
.end method

.method public o0()LLi/N;
    .locals 1

    iget-object v0, p0, Lu8/e;->m:LLi/N;

    return-object v0
.end method

.method public p0(Ldh/e;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p1, Lu8/e$e;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lu8/e$e;

    iget v1, v0, Lu8/e$e;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lu8/e$e;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lu8/e$e;

    invoke-direct {v0, p0, p1}, Lu8/e$e;-><init>(Lu8/e;Ldh/e;)V

    :goto_0
    iget-object p1, v0, Lu8/e$e;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lu8/e$e;->d:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_5

    if-eq v2, v6, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_4
    iget-object v2, v0, Lu8/e$e;->a:Ljava/lang/Object;

    check-cast v2, Lu8/e;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lu8/e;->l:Lgg/i;

    invoke-virtual {p1}, Lgg/i;->o0()Lgg/z;

    move-result-object p1

    const-string/jumbo v2, "firstOrError(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p0, v0, Lu8/e$e;->a:Ljava/lang/Object;

    iput v6, v0, Lu8/e$e;->d:I

    invoke-static {p1, v0}, LQi/b;->c(Lgg/D;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    return-object v1

    :cond_6
    move-object v2, p0

    :goto_1
    check-cast p1, Lxe/g;

    sget-object v7, Lu8/e$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v7, p1

    if-eq p1, v6, :cond_d

    const/4 v6, 0x0

    if-eq p1, v5, :cond_b

    if-eq p1, v4, :cond_9

    if-ne p1, v3, :cond_8

    invoke-direct {v2}, Lu8/e;->s0()Lv8/a;

    move-result-object p1

    invoke-interface {p1}, Lv8/a;->dismiss()Lgg/b;

    move-result-object p1

    iput-object v6, v0, Lu8/e$e;->a:Ljava/lang/Object;

    iput v3, v0, Lu8/e$e;->d:I

    invoke-static {p1, v0}, LQi/b;->b(Lgg/f;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    return-object v1

    :cond_7
    :goto_2
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_9
    invoke-direct {v2}, Lu8/e;->u0()LP8/f;

    move-result-object p1

    invoke-interface {p1}, LP8/f;->f()Lgg/b;

    move-result-object p1

    iput-object v6, v0, Lu8/e$e;->a:Ljava/lang/Object;

    iput v4, v0, Lu8/e$e;->d:I

    invoke-static {p1, v0}, LQi/b;->b(Lgg/f;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    return-object v1

    :cond_a
    :goto_3
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_b
    invoke-direct {v2}, Lu8/e;->r0()LE8/a;

    move-result-object p1

    invoke-interface {p1}, LE8/a;->a()Lgg/b;

    move-result-object p1

    iput-object v6, v0, Lu8/e$e;->a:Ljava/lang/Object;

    iput v5, v0, Lu8/e$e;->d:I

    invoke-static {p1, v0}, LQi/b;->b(Lgg/f;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_c

    return-object v1

    :cond_c
    :goto_4
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_d
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
