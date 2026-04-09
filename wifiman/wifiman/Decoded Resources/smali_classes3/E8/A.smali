.class public final LE8/A;
.super Ljf/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE8/A$a;,
        LE8/A$b;
    }
.end annotation


# static fields
.field static final synthetic y:[Lth/l;

.field public static final z:I


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:LYg/m;

.field private final j:LYg/m;

.field private final k:LYg/m;

.field private final l:LYg/m;

.field private final m:LYg/m;

.field private final n:LYg/m;

.field private final o:LYg/m;

.field private final p:LYg/m;

.field private final q:LYg/m;

.field private final r:LYg/m;

.field private final s:Lgg/i;

.field private final t:Lgg/i;

.field private final u:LLi/N;

.field private final v:LLi/N;

.field private final w:LLi/N;

.field private final x:LLi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LE8/A;

    const-string/jumbo v2, "applicationContext"

    const-string/jumbo v3, "getApplicationContext()Landroid/content/Context;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "resultManager"

    const-string/jumbo v5, "getResultManager()Lcom/ui/wifiman/model/speedtest/result/SpeedtestResultManager;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/F;

    const-string/jumbo v5, "deviceManager"

    const-string/jumbo v6, "getDeviceManager()Lcom/ui/wifiman/model/device/WifimanDeviceManager;"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v3

    new-instance v5, Lkotlin/jvm/internal/F;

    const-string/jumbo v6, "viewRouter"

    const-string/jumbo v7, "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;"

    invoke-direct {v5, v1, v6, v7, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v5}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v5

    new-instance v6, Lkotlin/jvm/internal/F;

    const-string/jumbo v7, "speedtestResultCloud"

    const-string/jumbo v8, "getSpeedtestResultCloud()Lcom/ui/wifiman/model/speedtest/result/SpeedtestResult$Cloud;"

    invoke-direct {v6, v1, v7, v8, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v6}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v6

    new-instance v7, Lkotlin/jvm/internal/F;

    const-string/jumbo v8, "speedtestSettings"

    const-string/jumbo v9, "getSpeedtestSettings()Lcom/ui/wifiman/model/speedtest/settings/SpeedtestSettingsManager;"

    invoke-direct {v7, v1, v8, v9, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v7}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v7

    new-instance v8, Lkotlin/jvm/internal/F;

    const-string/jumbo v9, "feedbackService"

    const-string/jumbo v10, "getFeedbackService()Lcom/ui/wifiman/model/speedtest/feedback/SpeedtestFeedbackService;"

    invoke-direct {v8, v1, v9, v10, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v8}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v8

    new-instance v9, Lkotlin/jvm/internal/F;

    const-string/jumbo v10, "uispController"

    const-string/jumbo v11, "getUispController()Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;"

    invoke-direct {v9, v1, v10, v11, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v9}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v9

    new-instance v10, Lkotlin/jvm/internal/F;

    const-string/jumbo v11, "uispReporter"

    const-string/jumbo v12, "getUispReporter()Lcom/ui/wifiman/model/speedtest/common/report/service/UispSpeedtestResultReportService;"

    invoke-direct {v10, v1, v11, v12, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v10}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v10

    new-instance v11, Lkotlin/jvm/internal/F;

    const-string/jumbo v12, "analytics"

    const-string/jumbo v13, "getAnalytics()Lcom/ubnt/usurvey/analytics/Analytics;"

    invoke-direct {v11, v1, v12, v13, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v11}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v11

    new-instance v12, Lkotlin/jvm/internal/F;

    const-string/jumbo v13, "appReview"

    const-string/jumbo v14, "getAppReview()Lcom/ui/wifiman/model/android/review/AppReviewOperator;"

    invoke-direct {v12, v1, v13, v14, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v12}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/16 v12, 0xb

    new-array v12, v12, [Lth/l;

    aput-object v0, v12, v4

    const/4 v0, 0x1

    aput-object v2, v12, v0

    const/4 v0, 0x2

    aput-object v3, v12, v0

    const/4 v0, 0x3

    aput-object v5, v12, v0

    const/4 v0, 0x4

    aput-object v6, v12, v0

    const/4 v0, 0x5

    aput-object v7, v12, v0

    const/4 v0, 0x6

    aput-object v8, v12, v0

    const/4 v0, 0x7

    aput-object v9, v12, v0

    const/16 v0, 0x8

    aput-object v10, v12, v0

    const/16 v2, 0x9

    aput-object v11, v12, v2

    const/16 v2, 0xa

    aput-object v1, v12, v2

    sput-object v12, LE8/A;->y:[Lth/l;

    sput v0, LE8/A;->z:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 12

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljf/h;-><init>()V

    iput-object p1, p0, LE8/A;->g:Lorg/kodein/di/DI;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, LE8/A$x;

    invoke-direct {v0}, LE8/A$x;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Landroid/content/Context;

    invoke-direct {p1, v0, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    sget-object v2, LE8/A;->y:[Lth/l;

    const/4 v3, 0x0

    aget-object v4, v2, v3

    invoke-interface {p1, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LE8/A;->h:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v4, LE8/A$y;

    invoke-direct {v4}, LE8/A$y;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lcom/ui/wifiman/model/speedtest/result/e;

    invoke-direct {p1, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v4, 0x1

    aget-object v5, v2, v4

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LE8/A;->i:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v5, LE8/A$z;

    invoke-direct {v5}, LE8/A$z;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, LCc/n;

    invoke-direct {p1, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v5, 0x2

    aget-object v5, v2, v5

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LE8/A;->j:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v5, LE8/A$A;

    invoke-direct {v5}, LE8/A$A;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Li8/a;

    invoke-direct {p1, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v5, 0x3

    aget-object v5, v2, v5

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LE8/A;->k:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v5, LE8/A$B;

    invoke-direct {v5}, LE8/A$B;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Lcom/ui/wifiman/model/speedtest/result/b$a;

    invoke-direct {p1, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v5, 0x4

    aget-object v5, v2, v5

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LE8/A;->l:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v5, LE8/A$C;

    invoke-direct {v5}, LE8/A$C;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, LDd/b;

    invoke-direct {p1, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v5, 0x5

    aget-object v5, v2, v5

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LE8/A;->m:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v5, LE8/A$D;

    invoke-direct {v5}, LE8/A$D;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, LAd/a;

    invoke-direct {p1, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v5, 0x6

    aget-object v5, v2, v5

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LE8/A;->n:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v5, LE8/A$E;

    invoke-direct {v5}, LE8/A$E;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;

    invoke-direct {p1, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v5, 0x7

    aget-object v5, v2, v5

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LE8/A;->o:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v5, LE8/A$F;

    invoke-direct {v5}, LE8/A$F;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Lxd/g;

    invoke-direct {p1, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/16 v5, 0x8

    aget-object v5, v2, v5

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LE8/A;->p:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v5, LE8/A$v;

    invoke-direct {v5}, LE8/A$v;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, LP7/a;

    invoke-direct {p1, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/16 v5, 0x9

    aget-object v5, v2, v5

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LE8/A;->q:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v5, LE8/A$w;

    invoke-direct {v5}, LE8/A$w;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, Lrc/b;

    invoke-direct {p1, v5, v1}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/16 v0, 0xa

    aget-object v0, v2, v0

    invoke-interface {p1, p0, v0}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LE8/A;->r:LYg/m;

    sget-object p1, Lgg/a;->LATEST:Lgg/a;

    new-instance v0, LE8/A$u;

    invoke-direct {v0, p0}, LE8/A$u;-><init>(LE8/A;)V

    invoke-static {v0, p1}, Lgg/i;->N(Lgg/k;Lgg/a;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v4}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LE8/A;->s:Lgg/i;

    new-instance v0, LE8/A$t;

    invoke-direct {v0, p0}, LE8/A$t;-><init>(LE8/A;)V

    invoke-virtual {p1, v0}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    const-string/jumbo v1, "distinctUntilChanged(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LE8/A;->t:Lgg/i;

    sget-object v2, LE8/A$f;->a:LE8/A$f;

    invoke-virtual {v0, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v6

    const-string/jumbo v2, "map(...)"

    invoke-static {v6, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v7, Ljf/d$b;->a:Ljf/d$b;

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v5, p0

    invoke-static/range {v5 .. v11}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v2

    iput-object v2, p0, LE8/A;->u:LLi/N;

    sget-object v2, LAg/c;->a:LAg/c;

    invoke-direct {p0}, LE8/A;->R0()LCc/n;

    move-result-object v5

    invoke-interface {v5}, LCc/n;->b()Lgg/i;

    move-result-object v5

    invoke-virtual {v2, v0, v5}, LAg/c;->a(Lgg/i;Lgg/i;)Lgg/i;

    move-result-object v2

    new-instance v5, LE8/A$e;

    invoke-direct {v5, p0}, LE8/A$e;-><init>(LE8/A;)V

    invoke-virtual {v2, v5}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v2

    invoke-virtual {v2}, Lgg/i;->e1()Lgg/i;

    move-result-object v2

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v5

    invoke-virtual {v2, v5, v3, v4}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object v2

    invoke-virtual {v2}, Lgg/i;->W()Lgg/i;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v8}, Lye/g;->h0(Lye/g;Lgg/i;Ljava/lang/Object;Landroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v2

    iput-object v2, p0, LE8/A;->v:LLi/N;

    invoke-direct {p0}, LE8/A;->W0()Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;

    move-result-object v2

    invoke-interface {v2}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;->b()Lgg/i;

    move-result-object v2

    invoke-direct {p0}, LE8/A;->V0()LDd/b;

    move-result-object v3

    invoke-interface {v3}, Lee/c;->b()Lgg/i;

    move-result-object v3

    sget-object v4, LE8/A$d;->a:LE8/A$d;

    invoke-static {v2, v3, p1, v4}, Lgg/i;->u(LDj/a;LDj/a;LDj/a;Lkg/g;)Lgg/i;

    move-result-object v2

    invoke-virtual {v2}, Lgg/i;->W()Lgg/i;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, p0

    invoke-static/range {v3 .. v8}, Lye/g;->h0(Lye/g;Lgg/i;Ljava/lang/Object;Landroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v2

    iput-object v2, p0, LE8/A;->w:LLi/N;

    invoke-direct {p0}, LE8/A;->S0()LAd/a;

    move-result-object v2

    invoke-interface {v2}, LAd/a;->b()Lgg/i;

    move-result-object v2

    sget-object v3, LE8/A$c;->a:LE8/A$c;

    invoke-static {p1, v0, v2, v3}, Lgg/i;->u(LDj/a;LDj/a;LDj/a;Lkg/g;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v7}, Lye/g;->h0(Lye/g;Lgg/i;Ljava/lang/Object;Landroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, LE8/A;->x:LLi/N;

    return-void
.end method

.method public static final synthetic A0(LE8/A;Lcom/ui/wifiman/model/speedtest/result/b$c;)Lhf/t$c;
    .locals 0

    invoke-direct {p0, p1}, LE8/A;->M0(Lcom/ui/wifiman/model/speedtest/result/b$c;)Lhf/t$c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic B0(LE8/A;)LP7/a;
    .locals 0

    invoke-direct {p0}, LE8/A;->N0()LP7/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic C0(LE8/A;)Lrc/b;
    .locals 0

    invoke-direct {p0}, LE8/A;->O0()Lrc/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic D0(LE8/A;)Landroid/content/Context;
    .locals 0

    invoke-direct {p0}, LE8/A;->P0()Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic E0(LE8/A;Lcom/ui/wifiman/model/speedtest/result/b;)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1}, LE8/A;->Q0(Lcom/ui/wifiman/model/speedtest/result/b;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic F0(LE8/A;)Ljf/f;
    .locals 0

    invoke-virtual {p0}, Ljf/h;->r0()Ljf/f;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic G0(LE8/A;)Lcom/ui/wifiman/model/speedtest/result/e;
    .locals 0

    invoke-direct {p0}, LE8/A;->T0()Lcom/ui/wifiman/model/speedtest/result/e;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic H0(LE8/A;)Lcom/ui/wifiman/model/speedtest/result/b$a;
    .locals 0

    invoke-direct {p0}, LE8/A;->U0()Lcom/ui/wifiman/model/speedtest/result/b$a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic I0(LE8/A;)LDd/b;
    .locals 0

    invoke-direct {p0}, LE8/A;->V0()LDd/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic J0(LE8/A;)Lxd/g;
    .locals 0

    invoke-direct {p0}, LE8/A;->X0()Lxd/g;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic K0(LE8/A;)Li8/a;
    .locals 0

    invoke-direct {p0}, LE8/A;->Y0()Li8/a;

    move-result-object p0

    return-object p0
.end method

.method private final L0(Lcom/ui/wifiman/model/speedtest/result/b$c;)Lhf/t$b;
    .locals 3

    new-instance v0, Lhf/t$b;

    sget-object v1, LE8/C;->a:LE8/C;

    sget-object v2, Lcom/ubnt/usurvey/product/m$c;->NORMAL:Lcom/ubnt/usurvey/product/m$c;

    invoke-virtual {v1, p1, v2}, LE8/C;->e(Lcom/ui/wifiman/model/speedtest/result/b$c;Lcom/ubnt/usurvey/product/m$c;)Ls9/a;

    move-result-object p1

    invoke-direct {v0, p1}, Lhf/t$b;-><init>(Ls9/a;)V

    return-object v0
.end method

.method private final M0(Lcom/ui/wifiman/model/speedtest/result/b$c;)Lhf/t$c;
    .locals 8

    sget-object v1, Lhf/t$c$a;->COMPLETE:Lhf/t$c$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->f()Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    sget-object v3, Lb8/b;->a:Lb8/b$b;

    invoke-virtual {v3, v0}, Lb8/b$b;->a(I)Lb8/b;

    move-result-object v0

    move-object v3, v0

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->e()Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->a()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v5

    sget-object v0, LW7/a;->b:LW7/a$a;

    invoke-virtual {v0, v5, v6}, LW7/a$a;->b(J)LW7/a;

    move-result-object v0

    move-object v5, v0

    goto :goto_1

    :cond_1
    move-object v5, v2

    :goto_1
    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->h()Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v6

    sget-object p1, LW7/a;->b:LW7/a$a;

    invoke-virtual {p1, v6, v7}, LW7/a$a;->b(J)LW7/a;

    move-result-object p1

    goto :goto_2

    :cond_2
    move-object p1, v2

    :goto_2
    new-instance v6, Lhf/t$c;

    move-object v0, v6

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lhf/t$c;-><init>(Lhf/t$c$a;Lb8/b;Ljava/lang/Integer;LW7/a;LW7/a;)V

    return-object v6
.end method

.method private final N0()LP7/a;
    .locals 1

    iget-object v0, p0, LE8/A;->q:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LP7/a;

    return-object v0
.end method

.method private final O0()Lrc/b;
    .locals 1

    iget-object v0, p0, LE8/A;->r:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrc/b;

    return-object v0
.end method

.method private final P0()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, LE8/A;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    return-object v0
.end method

.method private final Q0(Lcom/ui/wifiman/model/speedtest/result/b;)Ljava/util/List;
    .locals 20

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->d()Lb8/c;

    move-result-object v1

    sget-object v2, Lb8/c;->WIFI:Lb8/c;

    const/4 v3, 0x0

    if-ne v1, v2, :cond_9

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->j()Lcom/ui/wifiman/model/speedtest/result/b$d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/result/b$d;->j()LS8/a;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->j()Lcom/ui/wifiman/model/speedtest/result/b$d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/result/b$d;->j()LS8/a;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    new-instance v2, Lhf/k;

    new-instance v5, Ls9/d$b;

    const v4, 0x7f1103d1

    invoke-direct {v5, v4}, Ls9/d$b;-><init>(I)V

    new-instance v6, Ls9/d$a;

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->j()Lcom/ui/wifiman/model/speedtest/result/b$d;

    move-result-object v4

    invoke-virtual {v4}, Lcom/ui/wifiman/model/speedtest/result/b$d;->j()LS8/a;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    new-instance v7, LE8/A$g;

    invoke-direct {v7, v1}, LE8/A$g;-><init>(LS8/a;)V

    invoke-direct {v6, v4, v7}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v4, v2

    invoke-direct/range {v4 .. v9}, Lhf/k;-><init>(Ls9/d;Ls9/d;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->j()Lcom/ui/wifiman/model/speedtest/result/b$d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/result/b$d;->e()LW7/b;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, LW7/b;->b()LW7/a;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v3

    :goto_0
    if-nez v1, :cond_4

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->j()Lcom/ui/wifiman/model/speedtest/result/b$d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/result/b$d;->e()LW7/b;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, LW7/b;->c()LW7/a;

    move-result-object v1

    goto :goto_1

    :cond_2
    move-object v1, v3

    :goto_1
    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    move-object/from16 v10, p1

    goto :goto_3

    :cond_4
    :goto_2
    new-instance v1, Lhf/k;

    new-instance v5, Ls9/d$b;

    const v2, 0x7f1103d2

    invoke-direct {v5, v2}, Ls9/d$b;-><init>(I)V

    new-instance v6, Ls9/d$a;

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->j()Lcom/ui/wifiman/model/speedtest/result/b$d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/result/b$d;->e()LW7/b;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, LE8/A$h;

    move-object/from16 v10, p1

    invoke-direct {v4, v10}, LE8/A$h;-><init>(Lcom/ui/wifiman/model/speedtest/result/b;)V

    invoke-direct {v6, v2, v4}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v4, v1

    invoke-direct/range {v4 .. v9}, Lhf/k;-><init>(Ls9/d;Ls9/d;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_3
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->j()Lcom/ui/wifiman/model/speedtest/result/b$d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/result/b$d;->f()LW7/f;

    move-result-object v1

    if-eqz v1, :cond_5

    new-instance v1, Lhf/k;

    new-instance v5, Ls9/d$b;

    const v2, 0x7f110274

    invoke-direct {v5, v2}, Ls9/d$b;-><init>(I)V

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->j()Lcom/ui/wifiman/model/speedtest/result/b$d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/result/b$d;->f()LW7/f;

    move-result-object v2

    const/4 v4, 0x1

    const/4 v6, 0x2

    invoke-static {v2, v4, v3, v6, v3}, LNe/f;->h(LW7/f;ZLW7/f$a;ILjava/lang/Object;)Ls9/d;

    move-result-object v6

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v4, v1

    invoke-direct/range {v4 .. v9}, Lhf/k;-><init>(Ls9/d;Ls9/d;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->j()Lcom/ui/wifiman/model/speedtest/result/b$d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/result/b$d;->b()LS8/c;

    move-result-object v1

    if-eqz v1, :cond_6

    new-instance v1, Lhf/k;

    new-instance v5, Ls9/d$b;

    const v2, 0x7f11003d

    invoke-direct {v5, v2}, Ls9/d$b;-><init>(I)V

    new-instance v6, Ls9/d$b;

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->j()Lcom/ui/wifiman/model/speedtest/result/b$d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/result/b$d;->b()LS8/c;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {v2}, LNe/h;->e(LS8/c;)I

    move-result v2

    invoke-direct {v6, v2}, Ls9/d$b;-><init>(I)V

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v4, v1

    invoke-direct/range {v4 .. v9}, Lhf/k;-><init>(Ls9/d;Ls9/d;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_6
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->j()Lcom/ui/wifiman/model/speedtest/result/b$d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/result/b$d;->c()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_a

    new-instance v5, Ls9/d$b;

    const v1, 0x7f1103cb

    invoke-direct {v5, v1}, Ls9/d$b;-><init>(I)V

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->j()Lcom/ui/wifiman/model/speedtest/result/b$d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/result/b$d;->c()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->j()Lcom/ui/wifiman/model/speedtest/result/b$d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/result/b$d;->d()LS8/d;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v2}, LS8/d;->getWidth()I

    move-result v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, " ("

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " MHz)"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_8

    :cond_7
    const-string v2, ""

    :cond_8
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v6, Ls9/d$c;

    invoke-direct {v6, v1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    new-instance v1, Lhf/k;

    const/4 v7, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    move-object v4, v1

    invoke-direct/range {v4 .. v9}, Lhf/k;-><init>(Ls9/d;Ls9/d;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_9
    move-object/from16 v10, p1

    :cond_a
    :goto_4
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->e()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_b

    new-instance v1, Lhf/k;

    new-instance v5, Ls9/d$b;

    const v2, 0x7f1100f4

    invoke-direct {v5, v2}, Ls9/d$b;-><init>(I)V

    new-instance v6, Ls9/d$c;

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->e()Ljava/util/List;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Ljava/lang/Iterable;

    const/16 v18, 0x3e

    const/16 v19, 0x0

    const-string v12, "\n"

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v11 .. v19}, LZg/v;->z0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v6, v2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v4, v1

    invoke-direct/range {v4 .. v9}, Lhf/k;-><init>(Ls9/d;Ls9/d;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_b
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->g()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_c
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_12

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ui/wifiman/model/speedtest/result/b$c;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object v2

    instance-of v4, v2, Lcom/ui/wifiman/model/speedtest/result/b$b$b$a;

    const v5, 0x7f1102b8

    if-eqz v4, :cond_d

    check-cast v2, Lcom/ui/wifiman/model/speedtest/result/b$b$b$a;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/result/b$b$b$a;->d()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_c

    new-instance v4, Lhf/k;

    new-instance v7, Ls9/d$b;

    invoke-direct {v7, v5}, Ls9/d$b;-><init>(I)V

    new-instance v8, Ls9/d$c;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/result/b$b$b$a;->d()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {v8, v2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object v6, v4

    invoke-direct/range {v6 .. v11}, Lhf/k;-><init>(Ls9/d;Ls9/d;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_d
    instance-of v4, v2, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b;

    if-eqz v4, :cond_10

    new-instance v4, Ls9/d$b;

    invoke-direct {v4, v5}, Ls9/d$b;-><init>(I)V

    new-instance v5, Ls9/d$a;

    move-object v6, v2

    check-cast v6, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b;

    invoke-virtual {v6}, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b;->e()Lcom/ui/wifiman/model/speedtest/result/b$b$b$b$a;

    move-result-object v7

    invoke-virtual {v6}, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b;->f()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    new-instance v8, LE8/A$i;

    invoke-direct {v8, v2}, LE8/A$i;-><init>(Lcom/ui/wifiman/model/speedtest/result/b$b;)V

    invoke-direct {v5, v7, v8}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    instance-of v2, v2, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b;

    if-eqz v2, :cond_e

    goto :goto_6

    :cond_e
    move-object v6, v3

    :goto_6
    if-eqz v6, :cond_f

    invoke-virtual {v6}, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b;->e()Lcom/ui/wifiman/model/speedtest/result/b$b$b$b$a;

    move-result-object v2

    if-eqz v2, :cond_f

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b$a;->e()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_f

    const-string/jumbo v2, "SERVER_PROVIDER"

    goto :goto_7

    :cond_f
    move-object v2, v3

    :goto_7
    new-instance v6, Lhf/k;

    invoke-direct {v6, v4, v5, v2}, Lhf/k;-><init>(Ls9/d;Ls9/d;Ljava/lang/String;)V

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_5

    :cond_10
    instance-of v4, v2, Lcom/ui/wifiman/model/speedtest/result/b$b$a;

    if-nez v4, :cond_c

    instance-of v2, v2, Lcom/ui/wifiman/model/speedtest/result/b$b$c;

    if-eqz v2, :cond_11

    goto/16 :goto_5

    :cond_11
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_12
    return-object v0
.end method

.method private final R0()LCc/n;
    .locals 1

    iget-object v0, p0, LE8/A;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LCc/n;

    return-object v0
.end method

.method private final S0()LAd/a;
    .locals 1

    iget-object v0, p0, LE8/A;->n:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LAd/a;

    return-object v0
.end method

.method private final T0()Lcom/ui/wifiman/model/speedtest/result/e;
    .locals 1

    iget-object v0, p0, LE8/A;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/speedtest/result/e;

    return-object v0
.end method

.method private final U0()Lcom/ui/wifiman/model/speedtest/result/b$a;
    .locals 1

    iget-object v0, p0, LE8/A;->l:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/speedtest/result/b$a;

    return-object v0
.end method

.method private final V0()LDd/b;
    .locals 1

    iget-object v0, p0, LE8/A;->m:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LDd/b;

    return-object v0
.end method

.method private final W0()Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;
    .locals 1

    iget-object v0, p0, LE8/A;->o:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;

    return-object v0
.end method

.method private final X0()Lxd/g;
    .locals 1

    iget-object v0, p0, LE8/A;->p:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxd/g;

    return-object v0
.end method

.method private final Y0()Li8/a;
    .locals 1

    iget-object v0, p0, LE8/A;->k:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method

.method private static final Z0()V
    .locals 0

    return-void
.end method

.method private static final a1(ZLDd/a;)LDd/a;
    .locals 3

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, p0, v2, v0, v1}, LDd/a;->b(LDd/a;ZZILjava/lang/Object;)LDd/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x0()V
    .locals 0

    invoke-static {}, LE8/A;->Z0()V

    return-void
.end method

.method public static synthetic y0(ZLDd/a;)LDd/a;
    .locals 0

    invoke-static {p0, p1}, LE8/A;->a1(ZLDd/a;)LDd/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic z0(LE8/A;Lcom/ui/wifiman/model/speedtest/result/b$c;)Lhf/t$b;
    .locals 0

    invoke-direct {p0, p1}, LE8/A;->L0(Lcom/ui/wifiman/model/speedtest/result/b$c;)Lhf/t$b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method protected W()V
    .locals 3

    invoke-super {p0}, Landroidx/lifecycle/N;->W()V

    iget-object v0, p0, LE8/A;->t:Lgg/i;

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    sget-object v1, LE8/A$j;->a:LE8/A$j;

    invoke-virtual {v0, v1}, Lgg/z;->u(Lkg/n;)Lgg/n;

    move-result-object v0

    new-instance v1, LE8/A$k;

    invoke-direct {v1, p0}, LE8/A$k;-><init>(LE8/A;)V

    invoke-virtual {v0, v1}, Lgg/n;->k(Lkg/n;)Lgg/b;

    move-result-object v0

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object v0

    new-instance v1, LE8/z;

    invoke-direct {v1}, LE8/z;-><init>()V

    sget-object v2, LE8/A$l;->a:LE8/A$l;

    invoke-virtual {v0, v1, v2}, Lgg/b;->U(Lkg/a;Lkg/f;)Lhg/c;

    return-void
.end method

.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, LE8/A;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, LE8/A;->x:LLi/N;

    return-object v0
.end method

.method public o0()LLi/N;
    .locals 1

    iget-object v0, p0, LE8/A;->w:LLi/N;

    return-object v0
.end method

.method public p0()LLi/N;
    .locals 1

    iget-object v0, p0, LE8/A;->v:LLi/N;

    return-object v0
.end method

.method public q0()LLi/N;
    .locals 1

    iget-object v0, p0, LE8/A;->u:LLi/N;

    return-object v0
.end method

.method public s0(Ljava/lang/String;)V
    .locals 2

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LE8/A$a;->valueOf(Ljava/lang/String;)LE8/A$a;

    move-result-object p1

    sget-object v0, LE8/A$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    sget-object p1, Lye/d;->a:Lye/d;

    iget-object v0, p0, LE8/A;->t:Lgg/i;

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    sget-object v1, LE8/A$m;->a:LE8/A$m;

    invoke-virtual {v0, v1}, Lgg/z;->u(Lkg/n;)Lgg/n;

    move-result-object v0

    new-instance v1, LE8/A$n;

    invoke-direct {v1, p0}, LE8/A$n;-><init>(LE8/A;)V

    invoke-virtual {v0, v1}, Lgg/n;->k(Lkg/n;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "flatMapCompletable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public t0()V
    .locals 7

    sget-object v0, Lye/d;->a:Lye/d;

    iget-object v1, p0, LE8/A;->s:Lgg/i;

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    sget-object v2, LE8/A$o;->a:LE8/A$o;

    invoke-virtual {v1, v2}, Lgg/z;->r(Lkg/p;)Lgg/n;

    move-result-object v1

    new-instance v2, LE8/A$p;

    invoke-direct {v2, p0}, LE8/A$p;-><init>(LE8/A;)V

    invoke-virtual {v1, v2}, Lgg/n;->k(Lkg/n;)Lgg/b;

    move-result-object v1

    invoke-direct {p0}, LE8/A;->Y0()Li8/a;

    move-result-object v2

    const/4 v3, 0x1

    new-array v4, v3, [Li8/a$b;

    sget-object v5, Li8/a$b$n;->a:Li8/a$b$n;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-interface {v2, v4}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v2

    const/4 v4, 0x2

    new-array v4, v4, [Lgg/f;

    aput-object v1, v4, v6

    aput-object v2, v4, v3

    invoke-static {v4}, Lgg/b;->p([Lgg/f;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "concatArray(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public u0()V
    .locals 3

    sget-object v0, Lye/d;->a:Lye/d;

    iget-object v1, p0, LE8/A;->s:Lgg/i;

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    new-instance v2, LE8/A$q;

    invoke-direct {v2, p0}, LE8/A$q;-><init>(LE8/A;)V

    invoke-virtual {v1, v2}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "flatMapCompletable(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public v0()V
    .locals 3

    sget-object v0, Lye/d;->a:Lye/d;

    iget-object v1, p0, LE8/A;->t:Lgg/i;

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    new-instance v2, LE8/A$r;

    invoke-direct {v2, p0}, LE8/A$r;-><init>(LE8/A;)V

    invoke-virtual {v1, v2}, Lgg/z;->u(Lkg/n;)Lgg/n;

    move-result-object v1

    new-instance v2, LE8/A$s;

    invoke-direct {v2, p0}, LE8/A$s;-><init>(LE8/A;)V

    invoke-virtual {v1, v2}, Lgg/n;->k(Lkg/n;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "flatMapCompletable(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public w0(Z)V
    .locals 4

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LE8/A;->N0()LP7/a;

    move-result-object v1

    new-instance v2, LP7/c$h$a;

    invoke-direct {v2}, LP7/c$h$a;-><init>()V

    invoke-interface {v1, v2}, LP7/a;->d(LP7/c;)Lgg/b;

    move-result-object v1

    invoke-direct {p0}, LE8/A;->V0()LDd/b;

    move-result-object v2

    new-instance v3, LE8/y;

    invoke-direct {v3, p1}, LE8/y;-><init>(Z)V

    invoke-interface {v2, v3}, Lee/c;->a(Lmh/l;)Lgg/b;

    move-result-object p1

    const/4 v2, 0x2

    new-array v2, v2, [Lgg/f;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v1, 0x1

    aput-object p1, v2, v1

    invoke-static {v2}, Lgg/b;->I([Lgg/f;)Lgg/b;

    move-result-object p1

    const-string/jumbo v1, "mergeArray(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method
