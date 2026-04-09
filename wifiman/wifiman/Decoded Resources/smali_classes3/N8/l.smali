.class public final LN8/l;
.super LHf/b$c;
.source "SourceFile"


# static fields
.field static final synthetic o:[Lth/l;

.field public static final p:I


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:LYg/m;

.field private final j:LLi/z;

.field private final k:LLi/z;

.field private final l:LLi/z;

.field private final m:LLi/z;

.field private final n:LLi/z;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LN8/l;

    const-string/jumbo v2, "wizardManager"

    const-string/jumbo v3, "getWizardManager()Lcom/ubnt/usurvey/ui/wizard/AppWizardManager;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "permissionsService"

    const-string/jumbo v5, "getPermissionsService()Lcom/ui/wifiman/model/android/permissions/AndroidPermissionService;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lth/l;

    aput-object v0, v2, v4

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, LN8/l;->o:[Lth/l;

    const/16 v0, 0x8

    sput v0, LN8/l;->p:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 4

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LHf/b$c;-><init>()V

    iput-object p1, p0, LN8/l;->g:Lorg/kodein/di/DI;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, LN8/l$a;

    invoke-direct {v0}, LN8/l$a;-><init>()V

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

    sget-object v2, LN8/l;->o:[Lth/l;

    const/4 v3, 0x0

    aget-object v3, v2, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LN8/l;->h:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v3, LN8/l$b;

    invoke-direct {v3}, LN8/l$b;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, Lcom/ui/wifiman/model/android/permissions/d;

    invoke-direct {p1, v3, v1}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v0, 0x1

    aget-object v0, v2, v0

    invoke-interface {p1, p0, v0}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LN8/l;->i:LYg/m;

    new-instance p1, Ls9/d$b;

    const v0, 0x7f11042e

    invoke-direct {p1, v0}, Ls9/d$b;-><init>(I)V

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, LN8/l;->j:LLi/z;

    new-instance p1, Ls9/d$b;

    const v0, 0x7f11042d

    invoke-direct {p1, v0}, Ls9/d$b;-><init>(I)V

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, LN8/l;->k:LLi/z;

    sget-object p1, LPe/b;->a:LPe/b;

    invoke-virtual {p1}, LPe/b;->d()Ls9/c$a;

    move-result-object p1

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, LN8/l;->l:LLi/z;

    new-instance p1, Ls9/d$b;

    const v0, 0x7f11042b

    invoke-direct {p1, v0}, Ls9/d$b;-><init>(I)V

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, LN8/l;->m:LLi/z;

    new-instance p1, Ls9/d$b;

    const v0, 0x7f11042c

    invoke-direct {p1, v0}, Ls9/d$b;-><init>(I)V

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, LN8/l;->n:LLi/z;

    return-void
.end method

.method private final w0()Lcom/ui/wifiman/model/android/permissions/d;
    .locals 1

    iget-object v0, p0, LN8/l;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/android/permissions/d;

    return-object v0
.end method

.method private final z0()LN8/a;
    .locals 1

    iget-object v0, p0, LN8/l;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LN8/a;

    return-object v0
.end method


# virtual methods
.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, LN8/l;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public bridge synthetic getTitle()LLi/N;
    .locals 1

    invoke-virtual {p0}, LN8/l;->y0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic n0()LLi/N;
    .locals 1

    invoke-virtual {p0}, LN8/l;->t0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic o0()LLi/N;
    .locals 1

    invoke-virtual {p0}, LN8/l;->u0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic p0()LLi/N;
    .locals 1

    invoke-virtual {p0}, LN8/l;->v0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic q0()LLi/N;
    .locals 1

    invoke-virtual {p0}, LN8/l;->x0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public r0()V
    .locals 3

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LN8/l;->w0()Lcom/ui/wifiman/model/android/permissions/d;

    move-result-object v1

    sget-object v2, Lcom/ui/wifiman/model/android/permissions/a;->LOCATION_FINE:Lcom/ui/wifiman/model/android/permissions/a;

    filled-new-array {v2}, [Lcom/ui/wifiman/model/android/permissions/a;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/ui/wifiman/model/android/permissions/d;->a([Lcom/ui/wifiman/model/android/permissions/a;)Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public s0()V
    .locals 2

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LN8/l;->z0()LN8/a;

    move-result-object v1

    invoke-interface {v1}, LN8/a;->c()Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public t0()LLi/z;
    .locals 1

    iget-object v0, p0, LN8/l;->m:LLi/z;

    return-object v0
.end method

.method public u0()LLi/z;
    .locals 1

    iget-object v0, p0, LN8/l;->n:LLi/z;

    return-object v0
.end method

.method public v0()LLi/z;
    .locals 1

    iget-object v0, p0, LN8/l;->l:LLi/z;

    return-object v0
.end method

.method public x0()LLi/z;
    .locals 1

    iget-object v0, p0, LN8/l;->k:LLi/z;

    return-object v0
.end method

.method public y0()LLi/z;
    .locals 1

    iget-object v0, p0, LN8/l;->j:LLi/z;

    return-object v0
.end method
