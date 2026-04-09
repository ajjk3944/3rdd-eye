.class public final Lo5/A;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lo5/A;

.field private static final b:LZ4/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo5/A;

    invoke-direct {v0}, Lo5/A;-><init>()V

    sput-object v0, Lo5/A;->a:Lo5/A;

    new-instance v0, Lb5/d;

    invoke-direct {v0}, Lb5/d;-><init>()V

    sget-object v1, Lo5/c;->a:La5/a;

    invoke-virtual {v0, v1}, Lb5/d;->j(La5/a;)Lb5/d;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lb5/d;->k(Z)Lb5/d;

    move-result-object v0

    invoke-virtual {v0}, Lb5/d;->i()LZ4/a;

    move-result-object v0

    const-string/jumbo v1, "JsonDataEncoderBuilder()\u2026lues(true)\n      .build()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lo5/A;->b:LZ4/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final d(Lp5/b;)Lo5/d;
    .locals 0

    if-nez p1, :cond_0

    sget-object p1, Lo5/d;->COLLECTION_SDK_NOT_INSTALLED:Lo5/d;

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lp5/b;->b()Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lo5/d;->COLLECTION_ENABLED:Lo5/d;

    goto :goto_0

    :cond_1
    sget-object p1, Lo5/d;->COLLECTION_DISABLED:Lo5/d;

    :goto_0
    return-object p1
.end method


# virtual methods
.method public final a(Lcom/google/firebase/f;Lo5/y;Lq5/f;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lo5/z;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    const-string/jumbo v2, "firebaseApp"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v2, "sessionDetails"

    move-object/from16 v4, p2

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v2, "sessionsSettings"

    move-object/from16 v5, p3

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v2, "subscribers"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v2, "firebaseInstallationId"

    move-object/from16 v11, p5

    invoke-static {v11, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v2, "firebaseAuthenticationToken"

    move-object/from16 v12, p6

    invoke-static {v12, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lo5/z;

    sget-object v13, Lo5/i;->SESSION_START:Lo5/i;

    new-instance v14, Lo5/C;

    invoke-virtual/range {p2 .. p2}, Lo5/y;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p2 .. p2}, Lo5/y;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p2 .. p2}, Lo5/y;->c()I

    move-result v8

    invoke-virtual/range {p2 .. p2}, Lo5/y;->d()J

    move-result-wide v9

    new-instance v15, Lo5/e;

    sget-object v4, Lp5/b$a;->PERFORMANCE:Lp5/b$a;

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp5/b;

    invoke-direct {v0, v4}, Lo5/A;->d(Lp5/b;)Lo5/d;

    move-result-object v4

    sget-object v3, Lp5/b$a;->CRASHLYTICS:Lp5/b$a;

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp5/b;

    invoke-direct {v0, v1}, Lo5/A;->d(Lp5/b;)Lo5/d;

    move-result-object v1

    invoke-virtual/range {p3 .. p3}, Lq5/f;->b()D

    move-result-wide v11

    invoke-direct {v15, v4, v1, v11, v12}, Lo5/e;-><init>(Lo5/d;Lo5/d;D)V

    move-object v4, v14

    move-object v5, v6

    move-object v6, v7

    move v7, v8

    move-wide v8, v9

    move-object v10, v15

    move-object/from16 v11, p5

    move-object/from16 v12, p6

    invoke-direct/range {v4 .. v12}, Lo5/C;-><init>(Ljava/lang/String;Ljava/lang/String;IJLo5/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p1}, Lo5/A;->b(Lcom/google/firebase/f;)Lo5/b;

    move-result-object v1

    invoke-direct {v2, v13, v14, v1}, Lo5/z;-><init>(Lo5/i;Lo5/C;Lo5/b;)V

    return-object v2
.end method

.method public final b(Lcom/google/firebase/f;)Lo5/b;
    .locals 16

    const-string/jumbo v0, "firebaseApp"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/google/firebase/f;->k()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v2, "firebaseApp.applicationContext"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {v0, v4, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1c

    if-lt v3, v5, :cond_0

    invoke-static {v0}, Lcom/google/android/recaptcha/internal/e;->a(Landroid/content/pm/PackageInfo;)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    :goto_0
    move-object v6, v3

    goto :goto_1

    :cond_0
    iget v3, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :goto_1
    new-instance v14, Lo5/b;

    invoke-virtual/range {p1 .. p1}, Lcom/google/firebase/f;->n()Lcom/google/firebase/m;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/firebase/m;->c()Ljava/lang/String;

    move-result-object v10

    const-string/jumbo v3, "firebaseApp.options.applicationId"

    invoke-static {v10, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v11, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string/jumbo v3, "MODEL"

    invoke-static {v11, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v12, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    const-string/jumbo v3, "RELEASE"

    invoke-static {v12, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v13, Lo5/t;->LOG_ENVIRONMENT_PROD:Lo5/t;

    new-instance v15, Lo5/a;

    const-string/jumbo v3, "packageName"

    invoke-static {v4, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    if-nez v0, :cond_1

    move-object v5, v6

    goto :goto_2

    :cond_1
    move-object v5, v0

    :goto_2
    sget-object v7, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string/jumbo v0, "MANUFACTURER"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lo5/v;->a:Lo5/v;

    invoke-virtual/range {p1 .. p1}, Lcom/google/firebase/f;->k()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Lo5/v;->d(Landroid/content/Context;)Lo5/u;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lcom/google/firebase/f;->k()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lo5/v;->c(Landroid/content/Context;)Ljava/util/List;

    move-result-object v9

    move-object v3, v15

    invoke-direct/range {v3 .. v9}, Lo5/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo5/u;Ljava/util/List;)V

    const-string v0, "2.0.9"

    move-object v7, v14

    move-object v8, v10

    move-object v9, v11

    move-object v10, v0

    move-object v11, v12

    move-object v12, v13

    move-object v13, v15

    invoke-direct/range {v7 .. v13}, Lo5/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo5/t;Lo5/a;)V

    return-object v14
.end method

.method public final c()LZ4/a;
    .locals 1

    sget-object v0, Lo5/A;->b:LZ4/a;

    return-object v0
.end method
