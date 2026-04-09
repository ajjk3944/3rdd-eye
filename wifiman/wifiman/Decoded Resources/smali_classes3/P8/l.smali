.class public final LP8/l;
.super LIf/Q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP8/l$a;,
        LP8/l$b;
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

.field private final k:Lgg/i;

.field private final l:LLi/N;

.field private final m:LLi/N;

.field private final n:LLi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LP8/l;

    const-string/jumbo v2, "wifimanWizard"

    const-string/jumbo v3, "getWifimanWizard()Lcom/ui/wifiman/model/wmw/WifimanWizard;"

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

    const-string/jumbo v5, "permissionsService"

    const-string/jumbo v6, "getPermissionsService()Lcom/ui/wifiman/model/android/permissions/AndroidPermissionService;"

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

    sput-object v3, LP8/l;->o:[Lth/l;

    const/16 v0, 0x8

    sput v0, LP8/l;->p:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 8

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LIf/Q;-><init>()V

    iput-object p1, p0, LP8/l;->g:Lorg/kodein/di/DI;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, LP8/l$f;

    invoke-direct {v0}, LP8/l$f;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Lcom/ui/wifiman/model/wmw/WifimanWizard;

    invoke-direct {p1, v0, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    sget-object v2, LP8/l;->o:[Lth/l;

    const/4 v3, 0x0

    aget-object v3, v2, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LP8/l;->h:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v3, LP8/l$g;

    invoke-direct {v3}, LP8/l$g;-><init>()V

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

    aget-object v4, v2, v3

    invoke-interface {p1, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LP8/l;->i:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v4, LP8/l$h;

    invoke-direct {v4}, LP8/l$h;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, Lcom/ui/wifiman/model/android/permissions/d;

    invoke-direct {p1, v4, v1}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v0, 0x2

    aget-object v0, v2, v0

    invoke-interface {p1, p0, v0}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LP8/l;->j:LYg/m;

    invoke-direct {p0}, LP8/l;->t0()Lcom/ui/wifiman/model/wmw/WifimanWizard;

    move-result-object p1

    invoke-interface {p1}, Lcom/ui/wifiman/model/wmw/WifimanWizard;->getState()Lgg/i;

    move-result-object p1

    sget-object v0, LP8/l$e;->a:LP8/l$e;

    invoke-virtual {p1, v0}, Lgg/i;->M1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LP8/l;->k:Lgg/i;

    sget-object v0, LP8/l$j;->a:LP8/l$j;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v2

    const-string/jumbo v0, "map(...)"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lye/g;->h0(Lye/g;Lgg/i;Ljava/lang/Object;Landroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v1

    iput-object v1, p0, LP8/l;->l:LLi/N;

    sget-object v1, LP8/l$i;->a:LP8/l$i;

    invoke-virtual {p1, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v7}, Lye/g;->h0(Lye/g;Lgg/i;Ljava/lang/Object;Landroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v1

    iput-object v1, p0, LP8/l;->m:LLi/N;

    sget-object v1, LP8/l$c;->a:LP8/l$c;

    invoke-virtual {p1, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {v2 .. v7}, Lye/g;->h0(Lye/g;Lgg/i;Ljava/lang/Object;Landroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, LP8/l;->n:LLi/N;

    return-void
.end method

.method public static final synthetic q0(LP8/l;LP8/l$a;)Lgg/b;
    .locals 0

    invoke-direct {p0, p1}, LP8/l;->u0(LP8/l$a;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method private final r0()Lcom/ui/wifiman/model/android/permissions/d;
    .locals 1

    iget-object v0, p0, LP8/l;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/android/permissions/d;

    return-object v0
.end method

.method private final s0()Li8/a;
    .locals 1

    iget-object v0, p0, LP8/l;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method

.method private final t0()Lcom/ui/wifiman/model/wmw/WifimanWizard;
    .locals 1

    iget-object v0, p0, LP8/l;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/wmw/WifimanWizard;

    return-object v0
.end method

.method private final u0(LP8/l$a;)Lgg/b;
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    sget-object v2, LP8/l$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v2, p1

    if-eq p1, v1, :cond_3

    const/4 v2, 0x2

    if-eq p1, v2, :cond_2

    const/4 v2, 0x3

    if-eq p1, v2, :cond_1

    const/4 v2, 0x4

    if-ne p1, v2, :cond_0

    invoke-direct {p0}, LP8/l;->s0()Li8/a;

    move-result-object p1

    new-array v1, v1, [Li8/a$b;

    sget-object v2, Li8/a$b$D$b;->a:Li8/a$b$D$b;

    aput-object v2, v1, v0

    invoke-interface {p1, v1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "complete(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    invoke-direct {p0}, LP8/l;->r0()Lcom/ui/wifiman/model/android/permissions/d;

    move-result-object p1

    sget-object v0, Lcom/ui/wifiman/model/android/permissions/a;->LOCATION_FINE:Lcom/ui/wifiman/model/android/permissions/a;

    sget-object v1, Lcom/ui/wifiman/model/android/permissions/a;->BLUETOOTH:Lcom/ui/wifiman/model/android/permissions/a;

    filled-new-array {v0, v1}, [Lcom/ui/wifiman/model/android/permissions/a;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ui/wifiman/model/android/permissions/d;->a([Lcom/ui/wifiman/model/android/permissions/a;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_3
    invoke-direct {p0}, LP8/l;->s0()Li8/a;

    move-result-object p1

    new-array v1, v1, [Li8/a$b;

    sget-object v2, Li8/a$b$D$e;->a:Li8/a$b$D$e;

    aput-object v2, v1, v0

    invoke-interface {p1, v1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method


# virtual methods
.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, LP8/l;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public getTitle()LLi/N;
    .locals 1

    iget-object v0, p0, LP8/l;->l:LLi/N;

    return-object v0
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, LP8/l;->n:LLi/N;

    return-object v0
.end method

.method public o0()LLi/N;
    .locals 1

    iget-object v0, p0, LP8/l;->m:LLi/N;

    return-object v0
.end method

.method public p0()V
    .locals 3

    sget-object v0, Lye/d;->a:Lye/d;

    iget-object v1, p0, LP8/l;->k:Lgg/i;

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    new-instance v2, LP8/l$d;

    invoke-direct {v2, p0}, LP8/l$d;-><init>(LP8/l;)V

    invoke-virtual {v1, v2}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "flatMapCompletable(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method
