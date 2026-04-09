.class public final Lw8/b;
.super Lcom/ui/wifiman/ui/settings/preferences/a;
.source "SourceFile"


# static fields
.field static final synthetic w:[Lth/l;

.field public static final x:I


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:LYg/m;

.field private final j:LYg/m;

.field private final k:LYg/m;

.field private final l:LYg/m;

.field private final m:LYg/m;

.field private final n:LYg/m;

.field private final o:LLi/N;

.field private final p:LLi/N;

.field private final q:LLi/z;

.field private final r:LLi/N;

.field private final s:LLi/N;

.field private final t:LLi/N;

.field private final u:LLi/N;

.field private final v:LLi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, Lw8/b;

    const-string/jumbo v2, "settingsManager"

    const-string/jumbo v3, "getSettingsManager()Lcom/ui/wifiman/model/settings/AppSettingsManager;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "themeManager"

    const-string/jumbo v5, "getThemeManager()Lcom/ubnt/usurvey/ui/arch/theme/ThemeService;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/F;

    const-string/jumbo v5, "localConsoleService"

    const-string/jumbo v6, "getLocalConsoleService()Lcom/ui/wifiman/model/ubiquiti/console/local/UnifiLocalConsoleService;"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v3

    new-instance v5, Lkotlin/jvm/internal/F;

    const-string/jumbo v6, "localConsoleCertificateManager"

    const-string/jumbo v7, "getLocalConsoleCertificateManager()Lcom/ui/wifiman/model/ubiquiti/console/local/UnifiLocalConsoleCertificateManager;"

    invoke-direct {v5, v1, v6, v7, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v5}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v5

    new-instance v6, Lkotlin/jvm/internal/F;

    const-string/jumbo v7, "directConnectionPopupController"

    const-string/jumbo v8, "getDirectConnectionPopupController()Lcom/ubnt/usurvey/ui/popup/console/DirectConsoleConnectionPopupController;"

    invoke-direct {v6, v1, v7, v8, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v6}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v6

    new-instance v7, Lkotlin/jvm/internal/F;

    const-string/jumbo v8, "viewRouter"

    const-string/jumbo v9, "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;"

    invoke-direct {v7, v1, v8, v9, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v7}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v7

    new-instance v8, Lkotlin/jvm/internal/F;

    const-string/jumbo v9, "quickSettingsManager"

    const-string/jumbo v10, "getQuickSettingsManager()Lcom/ui/wifiman/quicksettings/TeleportTileServiceManager;"

    invoke-direct {v8, v1, v9, v10, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v8}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/4 v8, 0x7

    new-array v8, v8, [Lth/l;

    aput-object v0, v8, v4

    const/4 v0, 0x1

    aput-object v2, v8, v0

    const/4 v0, 0x2

    aput-object v3, v8, v0

    const/4 v0, 0x3

    aput-object v5, v8, v0

    const/4 v0, 0x4

    aput-object v6, v8, v0

    const/4 v0, 0x5

    aput-object v7, v8, v0

    const/4 v0, 0x6

    aput-object v1, v8, v0

    sput-object v8, Lw8/b;->w:[Lth/l;

    const/16 v0, 0x8

    sput v0, Lw8/b;->x:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 14

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/ui/wifiman/ui/settings/preferences/a;-><init>()V

    iput-object p1, p0, Lw8/b;->g:Lorg/kodein/di/DI;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, Lw8/b$f;

    invoke-direct {v0}, Lw8/b$f;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Lmd/b;

    invoke-direct {p1, v0, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    sget-object v2, Lw8/b;->w:[Lth/l;

    const/4 v3, 0x0

    aget-object v4, v2, v3

    invoke-interface {p1, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lw8/b;->h:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v4, Lw8/b$g;

    invoke-direct {v4}, Lw8/b$g;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lj8/a;

    invoke-direct {p1, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v4, 0x1

    aget-object v5, v2, v4

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lw8/b;->i:LYg/m;

    invoke-virtual {p0}, Lw8/b;->d()Lorg/kodein/di/DI;

    move-result-object p1

    new-instance v5, Lorg/kodein/type/d;

    new-instance v6, Lw8/b$h;

    invoke-direct {v6}, Lw8/b$h;-><init>()V

    invoke-virtual {v6}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v6

    invoke-static {v6}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v6

    invoke-static {v6, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v7, LSd/d;

    invoke-direct {v5, v6, v7}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p1, v5, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v5, 0x2

    aget-object v5, v2, v5

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lw8/b;->j:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v5, Lw8/b$i;

    invoke-direct {v5}, Lw8/b$i;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, LSd/a;

    invoke-direct {p1, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v5, 0x3

    aget-object v5, v2, v5

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lw8/b;->k:LYg/m;

    invoke-virtual {p0}, Lw8/b;->d()Lorg/kodein/di/DI;

    move-result-object p1

    new-instance v5, Lorg/kodein/type/d;

    new-instance v6, Lw8/b$j;

    invoke-direct {v6}, Lw8/b$j;-><init>()V

    invoke-virtual {v6}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v6

    invoke-static {v6}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v6

    invoke-static {v6, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v7, Lv8/a;

    invoke-direct {v5, v6, v7}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p1, v5, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v5, 0x4

    aget-object v5, v2, v5

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lw8/b;->l:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v5, Lw8/b$k;

    invoke-direct {v5}, Lw8/b$k;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Li8/a;

    invoke-direct {p1, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v5, 0x5

    aget-object v5, v2, v5

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lw8/b;->m:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v5, Lw8/b$l;

    invoke-direct {v5}, Lw8/b$l;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, Lcom/ui/wifiman/quicksettings/a;

    invoke-direct {p1, v5, v1}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v0, 0x6

    aget-object v0, v2, v0

    invoke-interface {p1, p0, v0}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lw8/b;->n:LYg/m;

    invoke-direct {p0}, Lw8/b;->J0()Lmd/b;

    move-result-object p1

    invoke-interface {p1}, Lee/c;->b()Lgg/i;

    move-result-object p1

    invoke-direct {p0}, Lw8/b;->K0()Lj8/a;

    move-result-object v0

    invoke-interface {v0}, Lj8/a;->a()Lgg/i;

    move-result-object v0

    sget-object v1, Lw8/b$d;->a:Lw8/b$d;

    invoke-static {p1, v0, v1}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object v6

    const-string/jumbo p1, "distinctUntilChanged(...)"

    invoke-static {v6, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v5, p0

    invoke-static/range {v5 .. v11}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v0

    iput-object v0, p0, Lw8/b;->o:LLi/N;

    invoke-direct {p0}, Lw8/b;->J0()Lmd/b;

    move-result-object v0

    invoke-interface {v0}, Lee/c;->b()Lgg/i;

    move-result-object v0

    sget-object v1, Lw8/b$c;->a:Lw8/b$c;

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v6

    invoke-static {v6, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    move-object v7, v0

    invoke-static/range {v5 .. v11}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v1

    iput-object v1, p0, Lw8/b;->p:LLi/N;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x21

    if-lt v1, v2, :cond_0

    move v5, v4

    goto :goto_0

    :cond_0
    move v5, v3

    :goto_0
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-static {v5}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v5

    iput-object v5, p0, Lw8/b;->q:LLi/z;

    invoke-direct {p0}, Lw8/b;->J0()Lmd/b;

    move-result-object v5

    invoke-interface {v5}, Lee/c;->b()Lgg/i;

    move-result-object v5

    sget-object v6, Lw8/b$m;->a:Lw8/b$m;

    invoke-virtual {v5, v6}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v5

    invoke-virtual {v5}, Lgg/i;->W()Lgg/i;

    move-result-object v7

    invoke-static {v7, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v8, LT7/c;->METRIC:LT7/c;

    const/4 v11, 0x6

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v6, p0

    invoke-static/range {v6 .. v12}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v5

    iput-object v5, p0, Lw8/b;->r:LLi/N;

    invoke-direct {p0}, Lw8/b;->H0()LSd/d;

    move-result-object v5

    invoke-interface {v5}, LSd/d;->a()Lgg/i;

    move-result-object v5

    sget-object v6, Lw8/b$a;->a:Lw8/b$a;

    invoke-virtual {v5, v6}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v5

    invoke-virtual {v5}, Lgg/i;->W()Lgg/i;

    move-result-object v8

    invoke-static {v8, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v12, 0x6

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v7, p0

    move-object v9, v0

    invoke-static/range {v7 .. v13}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v5

    iput-object v5, p0, Lw8/b;->s:LLi/N;

    invoke-direct {p0}, Lw8/b;->H0()LSd/d;

    move-result-object v5

    invoke-interface {v5}, LSd/d;->a()Lgg/i;

    move-result-object v5

    sget-object v6, Lw8/b$b;->a:Lw8/b$b;

    invoke-virtual {v5, v6}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v5

    invoke-virtual {v5}, Lgg/i;->W()Lgg/i;

    move-result-object v8

    invoke-static {v8, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {v7 .. v13}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, Lw8/b;->t:LLi/N;

    if-lt v1, v2, :cond_1

    move v3, v4

    :cond_1
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object v8

    const-string/jumbo p1, "just(...)"

    invoke-static {v8, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v12, 0x6

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v7, p0

    move-object v9, v0

    invoke-static/range {v7 .. v13}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, Lw8/b;->u:LLi/N;

    invoke-direct {p0}, Lw8/b;->I0()Lcom/ui/wifiman/quicksettings/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/ui/wifiman/quicksettings/a;->b()Lgg/i;

    move-result-object v8

    invoke-static/range {v7 .. v13}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, Lw8/b;->v:LLi/N;

    return-void
.end method

.method public static final synthetic C0(Lw8/b;)Lv8/a;
    .locals 0

    invoke-direct {p0}, Lw8/b;->F0()Lv8/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic D0(Lw8/b;)LSd/a;
    .locals 0

    invoke-direct {p0}, Lw8/b;->G0()LSd/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic E0(Lw8/b;)Li8/a;
    .locals 0

    invoke-direct {p0}, Lw8/b;->L0()Li8/a;

    move-result-object p0

    return-object p0
.end method

.method private final F0()Lv8/a;
    .locals 1

    iget-object v0, p0, Lw8/b;->l:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv8/a;

    return-object v0
.end method

.method private final G0()LSd/a;
    .locals 1

    iget-object v0, p0, Lw8/b;->k:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LSd/a;

    return-object v0
.end method

.method private final H0()LSd/d;
    .locals 1

    iget-object v0, p0, Lw8/b;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LSd/d;

    return-object v0
.end method

.method private final I0()Lcom/ui/wifiman/quicksettings/a;
    .locals 1

    iget-object v0, p0, Lw8/b;->n:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/quicksettings/a;

    return-object v0
.end method

.method private final J0()Lmd/b;
    .locals 1

    iget-object v0, p0, Lw8/b;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmd/b;

    return-object v0
.end method

.method private final K0()Lj8/a;
    .locals 1

    iget-object v0, p0, Lw8/b;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj8/a;

    return-object v0
.end method

.method private final L0()Li8/a;
    .locals 1

    iget-object v0, p0, Lw8/b;->m:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method


# virtual methods
.method public A0(Z)V
    .locals 2

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, Lw8/b;->K0()Lj8/a;

    move-result-object v1

    if-eqz p1, :cond_0

    sget-object p1, LT7/b;->SYSTEM:LT7/b;

    goto :goto_0

    :cond_0
    sget-object p1, LT7/b;->LIGHT:LT7/b;

    :goto_0
    invoke-interface {v1, p1}, Lj8/a;->d(LT7/b;)Lgg/b;

    move-result-object p1

    invoke-virtual {v0, p1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public B0()V
    .locals 5

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, Lw8/b;->L0()Li8/a;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Li8/a$b;

    sget-object v3, Li8/f;->a:Li8/f;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v1, v2}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public M0()LLi/z;
    .locals 1

    iget-object v0, p0, Lw8/b;->q:LLi/z;

    return-object v0
.end method

.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, Lw8/b;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, Lw8/b;->s:LLi/N;

    return-object v0
.end method

.method public o0()LLi/N;
    .locals 1

    iget-object v0, p0, Lw8/b;->t:LLi/N;

    return-object v0
.end method

.method public p0()LLi/N;
    .locals 1

    iget-object v0, p0, Lw8/b;->u:LLi/N;

    return-object v0
.end method

.method public q0()LLi/N;
    .locals 1

    iget-object v0, p0, Lw8/b;->v:LLi/N;

    return-object v0
.end method

.method public r0()LLi/N;
    .locals 1

    iget-object v0, p0, Lw8/b;->r:LLi/N;

    return-object v0
.end method

.method public bridge synthetic s0()LLi/N;
    .locals 1

    invoke-virtual {p0}, Lw8/b;->M0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public t0()LLi/N;
    .locals 1

    iget-object v0, p0, Lw8/b;->p:LLi/N;

    return-object v0
.end method

.method public u0()LLi/N;
    .locals 1

    iget-object v0, p0, Lw8/b;->o:LLi/N;

    return-object v0
.end method

.method public v0()V
    .locals 3

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, Lw8/b;->H0()LSd/d;

    move-result-object v1

    invoke-interface {v1}, LSd/d;->a()Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    new-instance v2, Lw8/b$e;

    invoke-direct {v2, p0}, Lw8/b$e;-><init>(Lw8/b;)V

    invoke-virtual {v1, v2}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "flatMapCompletable(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public w0()V
    .locals 5

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, Lw8/b;->L0()Li8/a;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Li8/a$b;

    sget-object v3, Li8/b;->a:Li8/b;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v1, v2}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public x0()V
    .locals 5

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, Lw8/b;->L0()Li8/a;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Li8/a$b;

    sget-object v3, Li8/a$b$D$a;->a:Li8/a$b$D$a;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v1, v2}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public y0(Z)V
    .locals 4

    const/4 v0, 0x0

    sget-object v1, Lye/d;->a:Lye/d;

    const/4 v2, 0x1

    if-ne p1, v2, :cond_0

    invoke-direct {p0}, Lw8/b;->L0()Li8/a;

    move-result-object p1

    new-array v2, v2, [Li8/a$b;

    sget-object v3, Li8/e;->a:Li8/e;

    aput-object v3, v2, v0

    invoke-interface {p1, v2}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    invoke-direct {p0}, Lw8/b;->L0()Li8/a;

    move-result-object p1

    new-array v2, v2, [Li8/a$b;

    sget-object v3, Li8/d;->a:Li8/d;

    aput-object v3, v2, v0

    invoke-interface {p1, v2}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    :goto_0
    invoke-virtual {v1, p1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public z0(Z)V
    .locals 2

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, Lw8/b;->K0()Lj8/a;

    move-result-object v1

    if-eqz p1, :cond_0

    sget-object p1, LT7/b;->DARK:LT7/b;

    goto :goto_0

    :cond_0
    sget-object p1, LT7/b;->LIGHT:LT7/b;

    :goto_0
    invoke-interface {v1, p1}, Lj8/a;->d(LT7/b;)Lgg/b;

    move-result-object p1

    invoke-virtual {v0, p1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method
