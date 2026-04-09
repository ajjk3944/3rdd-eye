.class public final Lt8/e;
.super LOe/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt8/e$a;
    }
.end annotation


# static fields
.field static final synthetic n:[Lth/l;

.field public static final o:I


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:LYg/m;

.field private final j:LYg/m;

.field private final k:LYg/m;

.field private final l:LYg/m;

.field private final m:LYg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, Lt8/e;

    const-string/jumbo v2, "permissionManager"

    const-string/jumbo v3, "getPermissionManager()Lcom/ui/wifiman/model/android/permissions/AndroidPermissionService;"

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

    const-string/jumbo v5, "locationService"

    const-string/jumbo v6, "getLocationService()Lcom/ui/wifiman/model/android/location/LocationService;"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v3

    new-instance v5, Lkotlin/jvm/internal/D;

    const-string/jumbo v6, "stream"

    const-string v7, "<v#0>"

    invoke-direct {v5, v1, v6, v7, v4}, Lkotlin/jvm/internal/D;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v5}, Lkotlin/jvm/internal/O;->g(Lkotlin/jvm/internal/C;)Lth/m;

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

    sput-object v5, Lt8/e;->n:[Lth/l;

    const/16 v0, 0x8

    sput v0, Lt8/e;->o:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 6

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LOe/b;-><init>()V

    iput-object p1, p0, Lt8/e;->g:Lorg/kodein/di/DI;

    invoke-virtual {p0}, Lt8/e;->d()Lorg/kodein/di/DI;

    move-result-object p1

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, Lt8/e$h;

    invoke-direct {v1}, Lt8/e$h;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string/jumbo v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, Lcom/ui/wifiman/model/android/permissions/d;

    invoke-direct {v0, v1, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    sget-object v0, Lt8/e;->n:[Lth/l;

    const/4 v3, 0x0

    aget-object v3, v0, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lt8/e;->h:LYg/m;

    invoke-virtual {p0}, Lt8/e;->d()Lorg/kodein/di/DI;

    move-result-object p1

    new-instance v3, Lorg/kodein/type/d;

    new-instance v4, Lt8/e$i;

    invoke-direct {v4}, Lt8/e$i;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Li8/a;

    invoke-direct {v3, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p1, v3, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v3, 0x1

    aget-object v3, v0, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lt8/e;->i:LYg/m;

    invoke-virtual {p0}, Lt8/e;->d()Lorg/kodein/di/DI;

    move-result-object p1

    new-instance v3, Lorg/kodein/type/d;

    new-instance v4, Lt8/e$j;

    invoke-direct {v4}, Lt8/e$j;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Lpc/a;

    invoke-direct {v3, v4, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p1, v3, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-interface {p1, p0, v0}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lt8/e;->j:LYg/m;

    new-instance p1, Lt8/a;

    invoke-direct {p1, p0}, Lt8/a;-><init>(Lt8/e;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lt8/e;->k:LYg/m;

    new-instance p1, Lt8/b;

    invoke-direct {p1, p0}, Lt8/b;-><init>(Lt8/e;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lt8/e;->l:LYg/m;

    new-instance p1, Lt8/c;

    invoke-direct {p1, p0}, Lt8/c;-><init>(Lt8/e;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lt8/e;->m:LYg/m;

    return-void
.end method

.method private final A0(LOe/a;)Ls9/d;
    .locals 1

    sget-object v0, Lt8/e$a;->a:[I

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

    new-instance p1, Ls9/d$b;

    const v0, 0x7f1100d8

    invoke-direct {p1, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    new-instance p1, Ls9/d$b;

    const v0, 0x7f110209

    invoke-direct {p1, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_2
    new-instance p1, Ls9/d$b;

    const v0, 0x7f11020b

    invoke-direct {p1, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_3
    new-instance p1, Ls9/d$b;

    const v0, 0x7f110205

    invoke-direct {p1, v0}, Ls9/d$b;-><init>(I)V

    :goto_0
    return-object p1
.end method

.method private final B0()Lcom/ui/wifiman/model/android/permissions/d;
    .locals 1

    iget-object v0, p0, Lt8/e;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/android/permissions/d;

    return-object v0
.end method

.method private final D0(LOe/a;)Ls9/d;
    .locals 1

    sget-object v0, Lt8/e$a;->a:[I

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

    new-instance p1, Ls9/d$b;

    const v0, 0x7f1100d9

    invoke-direct {p1, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    new-instance p1, Ls9/d$b;

    const v0, 0x7f11020a

    invoke-direct {p1, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_2
    new-instance p1, Ls9/d$b;

    const v0, 0x7f11020c

    invoke-direct {p1, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_3
    new-instance p1, Ls9/d$b;

    const v0, 0x7f110206

    invoke-direct {p1, v0}, Ls9/d$b;-><init>(I)V

    :goto_0
    return-object p1
.end method

.method private final E0()Li8/a;
    .locals 1

    iget-object v0, p0, Lt8/e;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method

.method private final F0()V
    .locals 3

    sget-object v0, Lye/d;->a:Lye/d;

    sget-object v1, Landroidx/lifecycle/k$b;->STARTED:Landroidx/lifecycle/k$b;

    new-instance v2, Lt8/d;

    invoke-direct {v2, p0}, Lt8/d;-><init>(Lt8/e;)V

    invoke-virtual {v0, p0, v1, v2}, Lye/d;->b(Lye/g;Landroidx/lifecycle/k$b;Lmh/a;)Lye/d$a;

    move-result-object v1

    invoke-static {v1}, Lt8/e;->H0(Lye/d$a;)Lgg/i;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lye/d;->e(Lgg/i;Lye/g;)V

    return-void
.end method

.method private static final G0(Lt8/e;)Lgg/i;
    .locals 2

    invoke-virtual {p0}, LOe/b;->p0()LOe/a;

    move-result-object v0

    invoke-direct {p0, v0}, Lt8/e;->J0(LOe/a;)Lgg/i;

    move-result-object v0

    sget-object v1, Lt8/e$b;->a:Lt8/e$b;

    invoke-virtual {v0, v1}, Lgg/i;->m0(Lkg/p;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, Lt8/e$c;

    invoke-direct {v1, p0}, Lt8/e$c;-><init>(Lt8/e;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p0

    sget-object v0, Lt8/e$d;->a:Lt8/e$d;

    invoke-virtual {p0, v0}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object p0

    invoke-virtual {p0}, Lgg/b;->c0()Lgg/i;

    move-result-object p0

    const-string/jumbo v0, "toFlowable(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final H0(Lye/d$a;)Lgg/i;
    .locals 2

    sget-object v0, Lt8/e;->n:[Lth/l;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lye/d$a;->c(Ljava/lang/Object;Lth/l;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method private final I0(LOe/a;)Z
    .locals 2

    sget-object v0, Lt8/e$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_1

    const/4 v1, 0x3

    if-eq p1, v1, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    return v0
.end method

.method private final J0(LOe/a;)Lgg/i;
    .locals 1

    sget-object v0, Lt8/e$a;->a:[I

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

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    invoke-virtual {p1}, Lgg/z;->W()Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    invoke-direct {p0}, Lt8/e;->y0()Lpc/a;

    move-result-object p1

    invoke-interface {p1}, Lpc/a;->a()Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lt8/e;->B0()Lcom/ui/wifiman/model/android/permissions/d;

    move-result-object p1

    invoke-interface {p1}, Lcom/ui/wifiman/model/android/permissions/d;->b()Lgg/i;

    move-result-object p1

    sget-object v0, Lt8/e$f;->a:Lt8/e$f;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_3
    invoke-direct {p0}, Lt8/e;->B0()Lcom/ui/wifiman/model/android/permissions/d;

    move-result-object p1

    invoke-interface {p1}, Lcom/ui/wifiman/model/android/permissions/d;->b()Lgg/i;

    move-result-object p1

    sget-object v0, Lt8/e$e;->a:Lt8/e$e;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    :goto_0
    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "distinctUntilChanged(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final K0(Lt8/e;)LLi/z;
    .locals 1

    invoke-virtual {p0}, LOe/b;->p0()LOe/a;

    move-result-object v0

    invoke-direct {p0, v0}, Lt8/e;->A0(LOe/a;)Ls9/d;

    move-result-object p0

    invoke-static {p0}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p0

    return-object p0
.end method

.method private static final L0(Lt8/e;)LLi/z;
    .locals 1

    invoke-virtual {p0}, LOe/b;->p0()LOe/a;

    move-result-object v0

    invoke-direct {p0, v0}, Lt8/e;->D0(LOe/a;)Ls9/d;

    move-result-object p0

    invoke-static {p0}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r0(Lt8/e;)LLi/z;
    .locals 0

    invoke-static {p0}, Lt8/e;->L0(Lt8/e;)LLi/z;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s0(Lt8/e;)Lgg/i;
    .locals 0

    invoke-static {p0}, Lt8/e;->G0(Lt8/e;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t0(Lt8/e;)LLi/z;
    .locals 0

    invoke-static {p0}, Lt8/e;->w0(Lt8/e;)LLi/z;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u0(Lt8/e;)LLi/z;
    .locals 0

    invoke-static {p0}, Lt8/e;->K0(Lt8/e;)LLi/z;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic v0(Lt8/e;)Li8/a;
    .locals 0

    invoke-direct {p0}, Lt8/e;->E0()Li8/a;

    move-result-object p0

    return-object p0
.end method

.method private static final w0(Lt8/e;)LLi/z;
    .locals 1

    invoke-virtual {p0}, LOe/b;->p0()LOe/a;

    move-result-object v0

    invoke-direct {p0, v0}, Lt8/e;->I0(LOe/a;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-static {p0}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p0

    return-object p0
.end method

.method private final x0(LOe/a;)Lgg/b;
    .locals 3

    const/4 v0, 0x1

    sget-object v1, Lt8/e$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    if-eq p1, v0, :cond_3

    const/4 v1, 0x2

    if-eq p1, v1, :cond_2

    const/4 v1, 0x3

    if-eq p1, v1, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    new-instance p1, Lt8/e$g;

    invoke-direct {p1}, Lt8/e$g;-><init>()V

    invoke-static {p1}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    invoke-direct {p0}, Lt8/e;->E0()Li8/a;

    move-result-object p1

    new-array v0, v0, [Li8/a$b;

    sget-object v1, Li8/a$b$D$e;->a:Li8/a$b$D$e;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-interface {p1, v0}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lt8/e;->B0()Lcom/ui/wifiman/model/android/permissions/d;

    move-result-object p1

    sget-object v0, Lcom/ui/wifiman/model/android/permissions/a;->LOCATION_FINE:Lcom/ui/wifiman/model/android/permissions/a;

    filled-new-array {v0}, [Lcom/ui/wifiman/model/android/permissions/a;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ui/wifiman/model/android/permissions/d;->a([Lcom/ui/wifiman/model/android/permissions/a;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_3
    invoke-direct {p0}, Lt8/e;->B0()Lcom/ui/wifiman/model/android/permissions/d;

    move-result-object p1

    sget-object v0, Lcom/ui/wifiman/model/android/permissions/a;->PHONE_STATE:Lcom/ui/wifiman/model/android/permissions/a;

    filled-new-array {v0}, [Lcom/ui/wifiman/model/android/permissions/a;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ui/wifiman/model/android/permissions/d;->a([Lcom/ui/wifiman/model/android/permissions/a;)Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private final y0()Lpc/a;
    .locals 1

    iget-object v0, p0, Lt8/e;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpc/a;

    return-object v0
.end method


# virtual methods
.method public C0()LLi/z;
    .locals 1

    iget-object v0, p0, Lt8/e;->k:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LLi/z;

    return-object v0
.end method

.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, Lt8/e;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public bridge synthetic getTitle()LLi/N;
    .locals 1

    invoke-virtual {p0}, Lt8/e;->C0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public l0()V
    .locals 0

    invoke-super {p0}, Lye/g;->l0()V

    invoke-direct {p0}, Lt8/e;->F0()V

    return-void
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, Lt8/e;->m:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LLi/N;

    return-object v0
.end method

.method public bridge synthetic o0()LLi/N;
    .locals 1

    invoke-virtual {p0}, Lt8/e;->z0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public q0()V
    .locals 2

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-virtual {p0}, LOe/b;->p0()LOe/a;

    move-result-object v1

    invoke-direct {p0, v1}, Lt8/e;->x0(LOe/a;)Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public z0()LLi/z;
    .locals 1

    iget-object v0, p0, Lt8/e;->l:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LLi/z;

    return-object v0
.end method
