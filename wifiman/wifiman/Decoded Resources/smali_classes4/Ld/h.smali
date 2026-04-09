.class public final LLd/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLd/f;


# static fields
.field static final synthetic h:[Lth/l;


# instance fields
.field private final a:Lorg/kodein/di/DI;

.field private final b:Landroid/content/Context;

.field private final c:Ldc/a;

.field private final d:LQd/e;

.field private final e:LZc/f;

.field private final f:Lfe/u;

.field private final g:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lkotlin/jvm/internal/D;

    const-class v1, LLd/h;

    const-string v2, "productCatalog"

    const-string v3, "<v#0>"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/D;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->g(Lkotlin/jvm/internal/C;)Lth/m;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/D;

    const-string v3, "certManager"

    const-string v5, "<v#1>"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/D;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->g(Lkotlin/jvm/internal/C;)Lth/m;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lth/l;

    aput-object v0, v2, v4

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, LLd/h;->h:[Lth/l;

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;Landroid/content/Context;Ldc/a;Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;LQd/e;LZc/f;Lfe/u;)V
    .locals 1

    const-string v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buildConfig"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accountManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consoleCache"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networkConnectionManager"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "schedulers"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLd/h;->a:Lorg/kodein/di/DI;

    iput-object p2, p0, LLd/h;->b:Landroid/content/Context;

    iput-object p3, p0, LLd/h;->c:Ldc/a;

    iput-object p5, p0, LLd/h;->d:LQd/e;

    iput-object p6, p0, LLd/h;->e:LZc/f;

    iput-object p7, p0, LLd/h;->f:Lfe/u;

    invoke-interface {p4}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;->e()Lgg/i;

    move-result-object p1

    new-instance p2, LLd/h$c;

    invoke-direct {p2, p0}, LLd/h$c;-><init>(LLd/h;)V

    invoke-virtual {p1, p2}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const-string p2, "distinctUntilChanged(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, LLd/g;

    invoke-direct {p2, p0}, LLd/g;-><init>(LLd/h;)V

    invoke-static {p1, p2}, Ln9/c;->c(Lgg/i;Lmh/l;)Lgg/i;

    move-result-object p1

    sget-object p2, LLd/h$d;->a:LLd/h$d;

    invoke-virtual {p1, p2}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LLd/h;->g:Lgg/i;

    return-void
.end method

.method public static synthetic b(LLd/h;Ll9/a;)Lgg/b;
    .locals 0

    invoke-static {p0, p1}, LLd/h;->i(LLd/h;Ll9/a;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(LLd/h;)LQd/e;
    .locals 0

    iget-object p0, p0, LLd/h;->d:LQd/e;

    return-object p0
.end method

.method public static final synthetic d(LLd/h;)Lorg/kodein/di/DI;
    .locals 0

    iget-object p0, p0, LLd/h;->a:Lorg/kodein/di/DI;

    return-object p0
.end method

.method public static final synthetic e(LLd/h;Ljava/util/UUID;LQd/e;LGb/d;)LLd/e;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LLd/h;->f(Ljava/util/UUID;LQd/e;LGb/d;)LLd/e;

    move-result-object p0

    return-object p0
.end method

.method private final f(Ljava/util/UUID;LQd/e;LGb/d;)LLd/e;
    .locals 15

    move-object v0, p0

    new-instance v14, Lcb/c;

    iget-object v2, v0, LLd/h;->b:Landroid/content/Context;

    sget-object v1, Lcom/ubnt/usurvey/a;->r:Lcom/ubnt/usurvey/a$a;

    invoke-virtual {v1}, Lcom/ubnt/usurvey/a$a;->a()Lcom/ubnt/usurvey/a$b;

    move-result-object v1

    invoke-interface {v1}, Lcom/ubnt/usurvey/a$b;->getConfig()Lcom/ubnt/usurvey/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ubnt/usurvey/a;->g()Lcb/a;

    move-result-object v4

    iget-object v1, v0, LLd/h;->c:Ldc/a;

    invoke-virtual {v1}, Ldc/a;->d()Ljava/lang/String;

    move-result-object v8

    const/16 v12, 0x188

    const/4 v13, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-string v7, "wifiman/android"

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    move-object v1, v14

    move-object/from16 v3, p3

    invoke-direct/range {v1 .. v13}, Lcb/c;-><init>(Landroid/content/Context;LGb/d;Lcb/a;Lorg/webrtc/EglBase;LAb/b;Ljava/lang/String;Ljava/lang/String;Lwb/a;Lokhttp3/logging/HttpLoggingInterceptor$Level;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v1, v0, LLd/h;->a:Lorg/kodein/di/DI;

    new-instance v2, Lorg/kodein/type/d;

    new-instance v3, LLd/h$a;

    invoke-direct {v3}, LLd/h$a;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lxa/o;

    invoke-direct {v2, v3, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v1

    sget-object v2, LLd/h;->h:[Lth/l;

    const/4 v5, 0x0

    aget-object v5, v2, v5

    invoke-interface {v1, v3, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v1

    iget-object v5, v0, LLd/h;->a:Lorg/kodein/di/DI;

    new-instance v6, Lorg/kodein/type/d;

    new-instance v7, LLd/h$b;

    invoke-direct {v7}, LLd/h$b;-><init>()V

    invoke-virtual {v7}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v7

    invoke-static {v7}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v7

    invoke-static {v7, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, LSd/a;

    invoke-direct {v6, v7, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {v5, v6, v3}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v4

    const/4 v5, 0x1

    aget-object v2, v2, v5

    invoke-interface {v4, v3, v2}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    new-instance v8, LLd/e;

    new-instance v3, Lcom/ui/wifiman/model/ubiquiti/cloud/a;

    invoke-static {v1}, LLd/h;->g(LYg/m;)Lxa/o;

    move-result-object v2

    invoke-direct {v3, v14, v2}, Lcom/ui/wifiman/model/ubiquiti/cloud/a;-><init>(Lcb/c;Lxa/o;)V

    iget-object v2, v0, LLd/h;->e:LZc/f;

    iget-object v4, v0, LLd/h;->f:Lfe/u;

    new-instance v5, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;

    move-object/from16 v6, p2

    invoke-direct {v5, p0, v6, v2, v4}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;-><init>(LLd/f;LQd/e;LZc/f;Lfe/u;)V

    new-instance v6, Lcom/ui/wifiman/model/ubiquiti/console/g;

    invoke-static {v1}, LLd/h;->g(LYg/m;)Lxa/o;

    move-result-object v1

    invoke-direct {v6, v14, v1}, Lcom/ui/wifiman/model/ubiquiti/console/g;-><init>(Lcb/c;Lxa/o;)V

    const/4 v7, 0x0

    move-object v1, v8

    move-object/from16 v2, p1

    move-object v4, v5

    move-object v5, v6

    move-object v6, v14

    invoke-direct/range {v1 .. v7}, LLd/e;-><init>(Ljava/util/UUID;Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient;Lcom/ui/wifiman/model/ubiquiti/console/b;Lcom/ui/wifiman/model/ubiquiti/console/f;Lcb/c;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v8
.end method

.method private static final g(LYg/m;)Lxa/o;
    .locals 0

    invoke-interface {p0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lxa/o;

    return-object p0
.end method

.method private final h(LLd/e;)Lgg/b;
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, LLd/h;->d:LQd/e;

    invoke-virtual {p1}, LLd/e;->a()Ljava/util/UUID;

    move-result-object p1

    invoke-interface {v0, p1}, LQd/e;->b(Ljava/util/UUID;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, LLd/h;->d:LQd/e;

    invoke-interface {p1}, LQd/e;->d()Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private static final i(LLd/h;Ll9/a;)Lgg/b;
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LLd/e;

    invoke-direct {p0, p1}, LLd/h;->h(LLd/e;)Lgg/b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, LLd/h;->g:Lgg/i;

    return-object v0
.end method
