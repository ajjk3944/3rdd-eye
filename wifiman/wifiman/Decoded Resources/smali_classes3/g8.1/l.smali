.class public abstract Lg8/l;
.super Lh8/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg8/l$a;
    }
.end annotation


# static fields
.field public static final k1:Lg8/l$a;

.field static final synthetic l1:[Lth/l;

.field public static final m1:I


# instance fields
.field private final H:LYg/m;

.field private final I:LYg/m;

.field private final J:LYg/m;

.field private final N:LYg/m;

.field private final X:LYg/m;

.field private final Y:LYg/m;

.field private final Z:LYg/m;

.field private final f1:LYg/m;

.field private final g1:LYg/m;

.field private final h1:LYg/m;

.field private final i1:LYg/m;

.field private j1:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 17

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, Lg8/l;

    const-string/jumbo v2, "activityResultModel"

    const-string/jumbo v3, "getActivityResultModel()Lcom/ui/wifiman/model/android/activityresult/ActivityResult$Launcher;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "appSynchronizer"

    const-string/jumbo v5, "getAppSynchronizer()Lcom/ubnt/usurvey/sync/AppRuntimeSynchronizer;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/F;

    const-string/jumbo v5, "permissionsService"

    const-string/jumbo v6, "getPermissionsService()Lcom/ui/wifiman/model/android/permissions/AndroidPermissionActivityApi;"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v3

    new-instance v5, Lkotlin/jvm/internal/F;

    const-string/jumbo v6, "appReviewActivityApi"

    const-string/jumbo v7, "getAppReviewActivityApi()Lcom/ui/wifiman/model/android/review/AppReviewActivityApi;"

    invoke-direct {v5, v1, v6, v7, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v5}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v5

    new-instance v6, Lkotlin/jvm/internal/F;

    const-string/jumbo v7, "appWindowActivityApi"

    const-string/jumbo v8, "getAppWindowActivityApi()Lcom/ui/wifiman/model/android/window/AppWindowActivityApi;"

    invoke-direct {v6, v1, v7, v8, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v6}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v6

    new-instance v7, Lkotlin/jvm/internal/F;

    const-string/jumbo v8, "deepLinkProcessor"

    const-string/jumbo v9, "getDeepLinkProcessor()Lcom/ubnt/usurvey/ui/arch/routing/WifimanDeeplink$Processor;"

    invoke-direct {v7, v1, v8, v9, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v7}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v7

    new-instance v8, Lkotlin/jvm/internal/F;

    const-string/jumbo v9, "appSessionManager"

    const-string/jumbo v10, "getAppSessionManager()Lcom/ui/wifiman/model/session/AppSessionManager;"

    invoke-direct {v8, v1, v9, v10, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v8}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v8

    new-instance v9, Lkotlin/jvm/internal/F;

    const-string/jumbo v10, "appThemeService"

    const-string/jumbo v11, "getAppThemeService()Lcom/ubnt/usurvey/ui/arch/theme/ThemeService;"

    invoke-direct {v9, v1, v10, v11, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v9}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v9

    new-instance v10, Lkotlin/jvm/internal/F;

    const-string/jumbo v11, "viewRouter"

    const-string/jumbo v12, "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;"

    invoke-direct {v10, v1, v11, v12, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v10}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v10

    new-instance v11, Lkotlin/jvm/internal/F;

    const-string/jumbo v12, "toastServiceActivityApi"

    const-string/jumbo v13, "getToastServiceActivityApi()Lcom/ui/wifiman/domain/toast/ToastServiceActivityApi;"

    invoke-direct {v11, v1, v12, v13, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v11}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v11

    new-instance v12, Lkotlin/jvm/internal/F;

    const-string/jumbo v13, "appLifecycleOperator"

    const-string/jumbo v14, "getAppLifecycleOperator()Lcom/ui/wifiman/model/android/lifecycle/AppLifecycleServiceOperator;"

    invoke-direct {v12, v1, v13, v14, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v12}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v12

    new-instance v13, Lkotlin/jvm/internal/D;

    const-string/jumbo v14, "di"

    const-string v15, "<v#0>"

    invoke-direct {v13, v1, v14, v15, v4}, Lkotlin/jvm/internal/D;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v13}, Lkotlin/jvm/internal/O;->g(Lkotlin/jvm/internal/C;)Lth/m;

    move-result-object v13

    new-instance v14, Lkotlin/jvm/internal/D;

    const-string/jumbo v15, "localeService"

    move-object/from16 v16, v13

    const-string v13, "<v#1>"

    invoke-direct {v14, v1, v15, v13, v4}, Lkotlin/jvm/internal/D;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v14}, Lkotlin/jvm/internal/O;->g(Lkotlin/jvm/internal/C;)Lth/m;

    move-result-object v1

    const/16 v13, 0xd

    new-array v13, v13, [Lth/l;

    aput-object v0, v13, v4

    const/4 v0, 0x1

    aput-object v2, v13, v0

    const/4 v0, 0x2

    aput-object v3, v13, v0

    const/4 v0, 0x3

    aput-object v5, v13, v0

    const/4 v0, 0x4

    aput-object v6, v13, v0

    const/4 v0, 0x5

    aput-object v7, v13, v0

    const/4 v0, 0x6

    aput-object v8, v13, v0

    const/4 v0, 0x7

    aput-object v9, v13, v0

    const/16 v0, 0x8

    aput-object v10, v13, v0

    const/16 v2, 0x9

    aput-object v11, v13, v2

    const/16 v2, 0xa

    aput-object v12, v13, v2

    const/16 v2, 0xb

    aput-object v16, v13, v2

    const/16 v2, 0xc

    aput-object v1, v13, v2

    sput-object v13, Lg8/l;->l1:[Lth/l;

    new-instance v1, Lg8/l$a;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lg8/l$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lg8/l;->k1:Lg8/l$a;

    sput v0, Lg8/l;->m1:I

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Lh8/b;-><init>()V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, Lg8/l$e;

    invoke-direct {v1}, Lg8/l$e;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string/jumbo v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, Llc/d;

    invoke-direct {v0, v1, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    sget-object v3, Lg8/l;->l1:[Lth/l;

    const/4 v4, 0x0

    aget-object v4, v3, v4

    invoke-interface {v0, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, Lg8/l;->H:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v4, Lg8/l$f;

    invoke-direct {v4}, Lg8/l$f;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Ld8/a;

    invoke-direct {v0, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v4, 0x1

    aget-object v4, v3, v4

    invoke-interface {v0, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, Lg8/l;->I:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v4, Lg8/l$g;

    invoke-direct {v4}, Lg8/l$g;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lcom/ui/wifiman/model/android/permissions/b;

    invoke-direct {v0, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v4, 0x2

    aget-object v4, v3, v4

    invoke-interface {v0, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, Lg8/l;->J:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v4, Lg8/l$h;

    invoke-direct {v4}, Lg8/l$h;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lrc/a;

    invoke-direct {v0, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v4, 0x3

    aget-object v4, v3, v4

    invoke-interface {v0, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, Lg8/l;->N:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v4, Lg8/l$i;

    invoke-direct {v4}, Lg8/l$i;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lvc/a;

    invoke-direct {v0, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v4, 0x4

    aget-object v4, v3, v4

    invoke-interface {v0, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, Lg8/l;->X:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v4, Lg8/l$j;

    invoke-direct {v4}, Lg8/l$j;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Li8/s$d;

    invoke-direct {v0, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v4, 0x5

    aget-object v4, v3, v4

    invoke-interface {v0, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, Lg8/l;->Y:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v4, Lg8/l$k;

    invoke-direct {v4}, Lg8/l$k;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lld/b;

    invoke-direct {v0, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v4, 0x6

    aget-object v4, v3, v4

    invoke-interface {v0, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, Lg8/l;->Z:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v4, Lg8/l$l;

    invoke-direct {v4}, Lg8/l$l;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lj8/a;

    invoke-direct {v0, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v4, 0x7

    aget-object v4, v3, v4

    invoke-interface {v0, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, Lg8/l;->f1:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v4, Lg8/l$m;

    invoke-direct {v4}, Lg8/l$m;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Li8/a;

    invoke-direct {v0, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/16 v4, 0x8

    aget-object v4, v3, v4

    invoke-interface {v0, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, Lg8/l;->g1:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v4, Lg8/l$c;

    invoke-direct {v4}, Lg8/l$c;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lhc/c;

    invoke-direct {v0, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/16 v4, 0x9

    aget-object v4, v3, v4

    invoke-interface {v0, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, Lg8/l;->h1:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v4, Lg8/l$d;

    invoke-direct {v4}, Lg8/l$d;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Loc/c;

    invoke-direct {v0, v4, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/16 v1, 0xa

    aget-object v1, v3, v1

    invoke-interface {v0, p0, v1}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, Lg8/l;->i1:LYg/m;

    return-void
.end method

.method private final A1()V
    .locals 10

    invoke-direct {p0}, Lg8/l;->s1()Lhc/c;

    move-result-object v0

    invoke-interface {v0}, Lhc/c;->b()Lgg/s;

    move-result-object v2

    sget-object v3, Lh8/c;->PAUSED:Lh8/c;

    new-instance v7, Lg8/g;

    invoke-direct {v7, p0}, Lg8/g;-><init>(Lg8/l;)V

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v9}, Lh8/k$a;->q(Lh8/k;Lgg/s;Lh8/c;Lmh/l;Lmh/a;ZLmh/l;ILjava/lang/Object;)V

    return-void
.end method

.method private static final B1(Lg8/l;Lhc/a;)LYg/J;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lg8/l;->O1(Lhc/a;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private final C1()V
    .locals 10

    invoke-direct {p0}, Lg8/l;->p1()Lvc/a;

    move-result-object v0

    invoke-interface {v0}, Lvc/a;->b()Lgg/s;

    move-result-object v2

    sget-object v3, Lh8/c;->DESTROYED:Lh8/c;

    new-instance v7, Lg8/i;

    invoke-direct {v7, p0}, Lg8/i;-><init>(Lg8/l;)V

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v9}, Lh8/k$a;->q(Lh8/k;Lgg/s;Lh8/c;Lmh/l;Lmh/a;ZLmh/l;ILjava/lang/Object;)V

    return-void
.end method

.method private static final D1(Lg8/l;Z)LYg/J;
    .locals 1

    const/16 v0, 0x80

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/view/Window;->addFlags(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/view/Window;->clearFlags(I)V

    :goto_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final E1()LYg/J;
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final F1()LYg/J;
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final G1()LYg/J;
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final H1()LYg/J;
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final I1(Lg8/l;Ljava/util/List;)LYg/J;
    .locals 4

    const-string/jumbo v0, "permissionRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {p0, v2}, Ls1/b;->t(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iput-object v1, p0, Lg8/l;->j1:Ljava/util/List;

    check-cast p1, Ljava/util/Collection;

    new-array v0, v3, [Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Ls1/b;->s(Landroid/app/Activity;[Ljava/lang/String;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private final J1(Li8/a$a;)V
    .locals 1

    instance-of v0, p1, Li8/a$a$f;

    if-nez v0, :cond_6

    instance-of v0, p1, Li8/a$a$h;

    if-eqz v0, :cond_0

    check-cast p1, Li8/a$a$h;

    invoke-direct {p0, p1}, Lg8/l;->L1(Li8/a$a$h;)V

    goto/16 :goto_0

    :cond_0
    instance-of v0, p1, Li8/a$a$d;

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/location/LocationRequest;->b()Lcom/google/android/gms/location/LocationRequest;

    move-result-object p1

    const-string/jumbo v0, "create(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LI3/f$a;

    invoke-direct {v0}, LI3/f$a;-><init>()V

    invoke-virtual {v0, p1}, LI3/f$a;->a(Lcom/google/android/gms/location/LocationRequest;)LI3/f$a;

    move-result-object p1

    const-string/jumbo v0, "addLocationRequest(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, LI3/f$a;->c(Z)LI3/f$a;

    invoke-static {p0}, LI3/e;->b(Landroid/app/Activity;)LI3/k;

    move-result-object v0

    invoke-virtual {p1}, LI3/f$a;->b()LI3/f;

    move-result-object p1

    invoke-interface {v0, p1}, LI3/k;->b(LI3/f;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v0, Lg8/b;

    invoke-direct {v0, p0}, Lg8/b;-><init>(Lg8/l;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Li8/a$a$b;

    if-eqz v0, :cond_2

    check-cast p1, Li8/a$a$b;

    invoke-virtual {p1}, Li8/a$a$b;->a()Lmh/l;

    move-result-object p1

    invoke-interface {p1, p0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    instance-of v0, p1, Li8/a$a$a;

    if-eqz v0, :cond_3

    check-cast p1, Li8/a$a$a;

    invoke-virtual {p1}, Li8/a$a$a;->a()Lmh/l;

    move-result-object p1

    invoke-interface {p1, p0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/a$a;

    invoke-direct {p0, p1}, Lg8/l;->J1(Li8/a$a;)V

    goto :goto_0

    :cond_3
    instance-of v0, p1, Li8/a$a$c;

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Landroid/app/Activity;->finishAffinity()V

    goto :goto_0

    :cond_4
    instance-of v0, p1, Li8/a$a$e;

    if-nez v0, :cond_6

    instance-of v0, p1, Li8/a$a$g;

    if-eqz v0, :cond_5

    check-cast p1, Li8/a$a$g;

    invoke-virtual {p1}, Li8/a$a$g;->a()Lhc/a;

    move-result-object p1

    invoke-direct {p0, p1}, Lg8/l;->O1(Lhc/a;)V

    goto :goto_0

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_6
    :goto_0
    return-void
.end method

.method private static final K1(Lg8/l;Ljava/lang/Exception;)V
    .locals 1

    const-string/jumbo v0, "exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/google/android/gms/common/api/ResolvableApiException;

    if-eqz v0, :cond_0

    :try_start_0
    check-cast p1, Lcom/google/android/gms/common/api/ResolvableApiException;

    const/4 v0, 0x2

    invoke-virtual {p1, p0, v0}, Lcom/google/android/gms/common/api/ResolvableApiException;->a(Landroid/app/Activity;I)V
    :try_end_0
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method private final L1(Li8/a$a$h;)V
    .locals 8

    const-string/jumbo v0, "Failed to process StartActivity routing event"

    invoke-virtual {p1}, Li8/a$a$h;->d()Lmh/l;

    move-result-object v1

    invoke-interface {v1, p0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Intent;

    const/4 v2, 0x2

    const v3, 0x7f1103b6

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v6, 0x0

    :try_start_0
    invoke-virtual {p1}, Li8/a$a$h;->e()Ljava/lang/Integer;

    move-result-object v7

    if-eqz v7, :cond_0

    invoke-virtual {p1}, Li8/a$a$h;->e()Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-virtual {p0, v1, v7}, Lc/j;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    goto :goto_3

    :cond_0
    invoke-virtual {p0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    invoke-virtual {p1}, Li8/a$a$h;->a()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Li8/a$a$h;->b()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_4

    :cond_1
    invoke-virtual {p1}, Li8/a$a$h;->a()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_1

    :cond_2
    move v0, v6

    :goto_1
    invoke-virtual {p1}, Li8/a$a$h;->b()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v6

    :cond_3
    invoke-virtual {p0, v0, v6}, Landroid/app/Activity;->overridePendingTransition(II)V

    :cond_4
    invoke-virtual {p1}, Li8/a$a$h;->c()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_5
    return-void

    :goto_2
    invoke-static {v0, p1, v5, v4, v5}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    new-instance p1, Lhc/a;

    new-instance v0, Lec/a$a;

    new-array v1, v6, [Ljava/lang/Object;

    invoke-direct {v0, v3, v1}, Lec/a$a;-><init>(I[Ljava/lang/Object;)V

    invoke-direct {p1, v0, v6, v2, v5}, Lhc/a;-><init>(Lec/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0, p1}, Lg8/l;->O1(Lhc/a;)V

    return-void

    :goto_3
    invoke-static {v0, p1, v5, v4, v5}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    new-instance p1, Lhc/a;

    new-instance v0, Lec/a$a;

    new-array v1, v6, [Ljava/lang/Object;

    invoke-direct {v0, v3, v1}, Lec/a$a;-><init>(I[Ljava/lang/Object;)V

    invoke-direct {p1, v0, v6, v2, v5}, Lhc/a;-><init>(Lec/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0, p1}, Lg8/l;->O1(Lhc/a;)V

    return-void
.end method

.method private final M1()V
    .locals 3

    sget-object v0, Lc/L;->e:Lc/L$a;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Lc/L$a;->c(I)Lc/L;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1, v2}, Lc/s;->b(Lc/j;Lc/L;Lc/L;ILjava/lang/Object;)V

    return-void
.end method

.method private final N1()V
    .locals 2

    invoke-virtual {p0}, Landroidx/appcompat/app/c;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f040002

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    const/16 v0, 0xc

    :goto_0
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

    return-void
.end method

.method private final O1(Lhc/a;)V
    .locals 1

    invoke-virtual {p1}, Lhc/a;->b()Lec/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lec/a;->a(Landroid/content/Context;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1}, Lhc/a;->a()Z

    move-result p1

    invoke-static {p0, v0, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public static synthetic W0(Lg8/l;Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0, p1}, Lg8/l;->K1(Lg8/l;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic X0()LYg/J;
    .locals 1

    invoke-static {}, Lg8/l;->G1()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic Y0()LYg/J;
    .locals 1

    invoke-static {}, Lg8/l;->H1()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic Z0(Lg8/l;Z)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lg8/l;->D1(Lg8/l;Z)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a1(Lg8/l;Lhc/a;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lg8/l;->B1(Lg8/l;Lhc/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b1(Lg8/l;Llc/d$a;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lg8/l;->x1(Lg8/l;Llc/d$a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c1()LYg/J;
    .locals 1

    invoke-static {}, Lg8/l;->F1()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d1()LYg/J;
    .locals 1

    invoke-static {}, Lg8/l;->z1()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e1(Lg8/l;Li8/a$a;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lg8/l;->v1(Lg8/l;Li8/a$a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f1()LYg/J;
    .locals 1

    invoke-static {}, Lg8/l;->E1()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g1(Lg8/l;Ljava/util/List;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lg8/l;->I1(Lg8/l;Ljava/util/List;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final h1(LYg/m;)Lorg/kodein/di/DI;
    .locals 0

    invoke-interface {p0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/kodein/di/DI;

    return-object p0
.end method

.method private static final i1(LYg/m;)LY7/a;
    .locals 0

    invoke-interface {p0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LY7/a;

    return-object p0
.end method

.method private final j1()Llc/d;
    .locals 1

    iget-object v0, p0, Lg8/l;->H:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llc/d;

    return-object v0
.end method

.method private final k1()Loc/c;
    .locals 1

    iget-object v0, p0, Lg8/l;->i1:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Loc/c;

    return-object v0
.end method

.method private final l1()Lrc/a;
    .locals 1

    iget-object v0, p0, Lg8/l;->N:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrc/a;

    return-object v0
.end method

.method private final m1()Lld/b;
    .locals 1

    iget-object v0, p0, Lg8/l;->Z:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lld/b;

    return-object v0
.end method

.method private final n1()Ld8/a;
    .locals 1

    iget-object v0, p0, Lg8/l;->I:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld8/a;

    return-object v0
.end method

.method private final o1()Lj8/a;
    .locals 1

    iget-object v0, p0, Lg8/l;->f1:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj8/a;

    return-object v0
.end method

.method private final p1()Lvc/a;
    .locals 1

    iget-object v0, p0, Lg8/l;->X:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvc/a;

    return-object v0
.end method

.method private final q1()Li8/s$d;
    .locals 1

    iget-object v0, p0, Lg8/l;->Y:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/s$d;

    return-object v0
.end method

.method private final r1()Lcom/ui/wifiman/model/android/permissions/b;
    .locals 1

    iget-object v0, p0, Lg8/l;->J:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/android/permissions/b;

    return-object v0
.end method

.method private final s1()Lhc/c;
    .locals 1

    iget-object v0, p0, Lg8/l;->h1:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhc/c;

    return-object v0
.end method

.method private final t1()Li8/a;
    .locals 1

    iget-object v0, p0, Lg8/l;->g1:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method

.method private final u1()V
    .locals 10

    invoke-direct {p0}, Lg8/l;->t1()Li8/a;

    move-result-object v0

    invoke-interface {v0}, Li8/a;->b()Lgg/s;

    move-result-object v2

    sget-object v3, Lh8/c;->PAUSED:Lh8/c;

    new-instance v7, Lg8/k;

    invoke-direct {v7, p0}, Lg8/k;-><init>(Lg8/l;)V

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v9}, Lh8/k$a;->q(Lh8/k;Lgg/s;Lh8/c;Lmh/l;Lmh/a;ZLmh/l;ILjava/lang/Object;)V

    return-void
.end method

.method private static final v1(Lg8/l;Li8/a$a;)LYg/J;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lg8/l;->J1(Li8/a$a;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private final w1()V
    .locals 10

    invoke-direct {p0}, Lg8/l;->j1()Llc/d;

    move-result-object v0

    invoke-interface {v0}, Llc/d;->d()Lgg/i;

    move-result-object v2

    sget-object v3, Lh8/c;->PAUSED:Lh8/c;

    new-instance v7, Lg8/h;

    invoke-direct {v7, p0}, Lg8/h;-><init>(Lg8/l;)V

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v9}, Lh8/k$a;->p(Lh8/k;Lgg/i;Lh8/c;Lmh/l;Lmh/a;ZLmh/l;ILjava/lang/Object;)V

    return-void
.end method

.method private static final x1(Lg8/l;Llc/d$a;)LYg/J;
    .locals 2

    const-string/jumbo v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Llc/d$a;->a()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p1}, Llc/d$a;->b()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lc/j;->startActivityForResult(Landroid/content/Intent;I)V

    invoke-virtual {p1}, Llc/d$a;->b()I

    move-result p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Activity Result Request launched "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    const/4 v0, 0x2

    invoke-static {p0, p1, v0, p1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private final y1()V
    .locals 9

    invoke-direct {p0}, Lg8/l;->o1()Lj8/a;

    move-result-object v0

    invoke-interface {v0}, Lj8/a;->c()Lgg/b;

    move-result-object v2

    sget-object v3, Lh8/c;->DESTROYED:Lh8/c;

    new-instance v6, Lg8/j;

    invoke-direct {v6}, Lg8/j;-><init>()V

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v8}, Lh8/k$a;->o(Lh8/k;Lgg/b;Lh8/c;Lmh/l;ZLmh/a;ILjava/lang/Object;)V

    return-void
.end method

.method private static final z1()LYg/J;
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method


# virtual methods
.method protected attachBaseContext(Landroid/content/Context;)V
    .locals 6

    if-eqz p1, :cond_0

    invoke-static {p1}, Lsj/a;->d(Landroid/content/Context;)Lsj/d;

    move-result-object v0

    sget-object v1, Lg8/l;->l1:[Lth/l;

    const/16 v2, 0xb

    aget-object v2, v1, v2

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v2}, Lsj/d;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    invoke-static {v0}, Lg8/l;->h1(LYg/m;)Lorg/kodein/di/DI;

    move-result-object v0

    new-instance v2, Lorg/kodein/type/d;

    new-instance v4, Lg8/l$b;

    invoke-direct {v4}, Lg8/l$b;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    const-string/jumbo v5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, LY7/a;

    invoke-direct {v2, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {v0, v2, v3}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/16 v2, 0xc

    aget-object v1, v1, v2

    invoke-interface {v0, v3, v1}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    invoke-static {v0}, Lg8/l;->i1(LYg/m;)LY7/a;

    move-result-object v0

    invoke-interface {v0, p1}, LY7/a;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->attachBaseContext(Landroid/content/Context;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "context unavailable in attachBaseContext"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 3

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/j;->onActivityResult(IILandroid/content/Intent;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Activity Result Request Obtained "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-direct {p0}, Lg8/l;->j1()Llc/d;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Llc/d;->c(IILandroid/content/Intent;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-direct {p0}, Lg8/l;->M1()V

    invoke-super {p0, p1}, Landroidx/fragment/app/j;->onCreate(Landroid/os/Bundle;)V

    invoke-direct {p0}, Lg8/l;->N1()V

    invoke-direct {p0}, Lg8/l;->y1()V

    invoke-direct {p0}, Lg8/l;->C1()V

    if-nez p1, :cond_0

    invoke-direct {p0}, Lg8/l;->q1()Li8/s$d;

    move-result-object p1

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string/jumbo v1, "getIntent(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Li8/s$d;->c(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 1

    const-string/jumbo v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lc/j;->onNewIntent(Landroid/content/Intent;)V

    invoke-direct {p0}, Lg8/l;->q1()Li8/s$d;

    move-result-object v0

    invoke-interface {v0, p1}, Li8/s$d;->c(Landroid/content/Intent;)V

    return-void
.end method

.method protected onPause()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/j;->onPause()V

    invoke-direct {p0}, Lg8/l;->k1()Loc/c;

    move-result-object v0

    invoke-interface {v0}, Loc/c;->c()V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 10

    const-string/jumbo v0, "permissions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "grantResults"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/j;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    array-length p1, p3

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    if-nez p1, :cond_7

    array-length p1, p3

    move v2, v1

    :goto_1
    if-ge v2, p1, :cond_2

    aget v3, p3, v2

    if-nez v3, :cond_1

    invoke-direct {p0}, Lg8/l;->r1()Lcom/ui/wifiman/model/android/permissions/b;

    move-result-object p1

    invoke-interface {p1}, Lcom/ui/wifiman/model/android/permissions/b;->d()Lgg/b;

    move-result-object v3

    sget-object v4, Lh8/c;->DESTROYED:Lh8/c;

    new-instance v7, Lg8/a;

    invoke-direct {v7}, Lg8/a;-><init>()V

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v9}, Lh8/k$a;->o(Lh8/k;Lgg/b;Lh8/c;Lmh/l;ZLmh/a;ILjava/lang/Object;)V

    goto :goto_2

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    array-length p1, p3

    move v2, v1

    :goto_3
    if-ge v2, p1, :cond_7

    aget v3, p3, v2

    const/4 v4, -0x1

    if-ne v3, v4, :cond_6

    array-length p1, p2

    move p3, v1

    move v2, p3

    move v3, v2

    :goto_4
    if-ge p3, p1, :cond_5

    aget-object v4, p2, p3

    add-int/lit8 v5, v3, 0x1

    invoke-static {p0, v4}, Ls1/b;->t(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result v4

    iget-object v6, p0, Lg8/l;->j1:Ljava/util/List;

    if-eqz v6, :cond_3

    invoke-static {v6, v3}, LZg/v;->t0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v3

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v3, v6}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    goto :goto_5

    :cond_3
    move v3, v1

    :goto_5
    if-eqz v3, :cond_4

    if-nez v4, :cond_4

    move v2, v0

    :cond_4
    add-int/lit8 p3, p3, 0x1

    move v3, v5

    goto :goto_4

    :cond_5
    if-eqz v2, :cond_7

    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    const-string/jumbo p2, "android.settings.APPLICATION_DETAILS_SETTINGS"

    invoke-virtual {p1, p2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x0

    const-string/jumbo v0, "package"

    invoke-static {v0, p2, p3}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_6

    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_7
    :goto_6
    return-void
.end method

.method protected onResume()V
    .locals 9

    invoke-super {p0}, Landroidx/fragment/app/j;->onResume()V

    invoke-direct {p0}, Lg8/l;->u1()V

    invoke-direct {p0}, Lg8/l;->A1()V

    invoke-direct {p0}, Lg8/l;->w1()V

    invoke-direct {p0}, Lg8/l;->r1()Lcom/ui/wifiman/model/android/permissions/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/ui/wifiman/model/android/permissions/b;->d()Lgg/b;

    move-result-object v2

    sget-object v3, Lh8/c;->PAUSED:Lh8/c;

    new-instance v6, Lg8/c;

    invoke-direct {v6}, Lg8/c;-><init>()V

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v8}, Lh8/k$a;->o(Lh8/k;Lgg/b;Lh8/c;Lmh/l;ZLmh/a;ILjava/lang/Object;)V

    invoke-direct {p0}, Lg8/l;->k1()Loc/c;

    move-result-object v0

    invoke-interface {v0}, Loc/c;->a()V

    return-void
.end method

.method protected onStart()V
    .locals 12

    invoke-super {p0}, Landroidx/appcompat/app/c;->onStart()V

    invoke-direct {p0}, Lg8/l;->k1()Loc/c;

    move-result-object v0

    invoke-interface {v0}, Loc/c;->d()V

    invoke-direct {p0}, Lg8/l;->n1()Ld8/a;

    move-result-object v0

    invoke-interface {v0}, Ld8/a;->a()Lgg/b;

    move-result-object v2

    sget-object v0, Lh8/c;->STOPPED:Lh8/c;

    new-instance v6, Lg8/d;

    invoke-direct {v6}, Lg8/d;-><init>()V

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v3, v0

    invoke-static/range {v1 .. v8}, Lh8/k$a;->o(Lh8/k;Lgg/b;Lh8/c;Lmh/l;ZLmh/a;ILjava/lang/Object;)V

    invoke-direct {p0}, Lg8/l;->l1()Lrc/a;

    move-result-object v1

    invoke-interface {v1, p0}, Lrc/a;->b(Landroid/app/Activity;)V

    invoke-direct {p0}, Lg8/l;->m1()Lld/b;

    move-result-object v1

    invoke-interface {v1}, Lld/b;->b()Lgg/b;

    move-result-object v4

    new-instance v8, Lg8/e;

    invoke-direct {v8}, Lg8/e;-><init>()V

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, p0

    move-object v5, v0

    invoke-static/range {v3 .. v10}, Lh8/k$a;->o(Lh8/k;Lgg/b;Lh8/c;Lmh/l;ZLmh/a;ILjava/lang/Object;)V

    invoke-direct {p0}, Lg8/l;->r1()Lcom/ui/wifiman/model/android/permissions/b;

    move-result-object v1

    invoke-interface {v1}, Lcom/ui/wifiman/model/android/permissions/b;->c()Lgg/s;

    move-result-object v4

    new-instance v9, Lg8/f;

    invoke-direct {v9, p0}, Lg8/f;-><init>(Lg8/l;)V

    const/16 v10, 0xe

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v11}, Lh8/k$a;->q(Lh8/k;Lgg/s;Lh8/c;Lmh/l;Lmh/a;ZLmh/l;ILjava/lang/Object;)V

    return-void
.end method

.method protected onStop()V
    .locals 1

    invoke-super {p0}, Landroidx/appcompat/app/c;->onStop()V

    invoke-direct {p0}, Lg8/l;->k1()Loc/c;

    move-result-object v0

    invoke-interface {v0}, Loc/c;->b()V

    invoke-direct {p0}, Lg8/l;->l1()Lrc/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lrc/a;->d(Landroid/app/Activity;)V

    return-void
.end method
