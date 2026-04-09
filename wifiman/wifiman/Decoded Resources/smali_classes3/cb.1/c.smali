.class public final Lcb/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lokhttp3/logging/HttpLoggingInterceptor$Level;

.field private final b:Ljava/lang/String;

.field private final c:Ljb/a;

.field private final d:LAb/a;

.field private final e:LGb/f;

.field private final f:Ldb/a;

.field private final g:Lub/d;

.field private final h:Ljb/i;

.field private final i:LCb/a;

.field private final j:LYg/m;


# direct methods
.method public constructor <init>(Landroid/content/Context;LGb/d;Lcb/a;Lorg/webrtc/EglBase;LAb/b;Ljava/lang/String;Ljava/lang/String;Lwb/a;Lokhttp3/logging/HttpLoggingInterceptor$Level;Z)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v11, p3

    move-object/from16 v10, p6

    move-object/from16 v9, p7

    move-object/from16 v8, p9

    const-string/jumbo v3, "context"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v3, "storage"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v3, "environment"

    invoke-static {v11, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v3, "clientName"

    invoke-static {v10, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v3, "clientVersion"

    invoke-static {v9, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v3, "httpLogLevel"

    invoke-static {v8, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object v8, v0, Lcb/c;->a:Lokhttp3/logging/HttpLoggingInterceptor$Level;

    move-object/from16 v3, p4

    .line 3
    invoke-direct {v0, v1, v3}, Lcb/c;->i(Landroid/content/Context;Lorg/webrtc/EglBase;)V

    .line 4
    new-instance v7, LGb/i;

    invoke-direct {v7, v2}, LGb/i;-><init>(LGb/d;)V

    iput-object v7, v0, Lcb/c;->e:LGb/f;

    .line 5
    iput-object v9, v0, Lcb/c;->b:Ljava/lang/String;

    .line 6
    new-instance v2, Ldb/a;

    invoke-direct {v2, v11}, Ldb/a;-><init>(Lcb/a;)V

    iput-object v2, v0, Lcb/c;->f:Ldb/a;

    .line 7
    new-instance v6, LCb/b;

    .line 8
    invoke-static/range {p1 .. p1}, Lub/f;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    move/from16 v3, p10

    .line 9
    invoke-direct {v6, v7, v3, v1}, LCb/b;-><init>(LGb/f;ZLjava/lang/String;)V

    iput-object v6, v0, Lcb/c;->i:LCb/a;

    .line 10
    new-instance v3, LAb/g;

    .line 11
    invoke-virtual/range {p3 .. p3}, Lcb/a;->getSsoConfig()LAb/h;

    move-result-object v13

    const/16 v23, 0x300

    const/16 v24, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object v12, v3

    move-object v14, v7

    move-object/from16 v15, p5

    move-object/from16 v16, p6

    move-object/from16 v17, p7

    move-object/from16 v18, p8

    move-object/from16 v19, v6

    move-object/from16 v20, p9

    .line 12
    invoke-direct/range {v12 .. v24}, LAb/g;-><init>(LAb/h;LGb/f;LAb/b;Ljava/lang/String;Ljava/lang/String;Lwb/a;LCb/a;Lokhttp3/logging/HttpLoggingInterceptor$Level;LAb/i;Lgg/y;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v3, v0, Lcb/c;->d:LAb/a;

    .line 13
    new-instance v12, Ljb/m;

    invoke-direct {v12, v2, v7}, Ljb/m;-><init>(Ldb/a;LGb/f;)V

    iput-object v12, v0, Lcb/c;->h:Ljb/i;

    .line 14
    new-instance v13, Ljb/b;

    move-object v1, v13

    move-object/from16 v2, p3

    move-object/from16 v4, p6

    move-object/from16 v5, p7

    move-object v14, v6

    move-object v6, v7

    move-object v15, v7

    move-object v7, v12

    move-object/from16 v8, p8

    move-object v12, v9

    move-object/from16 v9, p9

    move-object v10, v14

    invoke-direct/range {v1 .. v10}, Ljb/b;-><init>(Lcb/a;LAb/a;Ljava/lang/String;Ljava/lang/String;LGb/f;Ljb/i;Lwb/a;Lokhttp3/logging/HttpLoggingInterceptor$Level;LCb/a;)V

    iput-object v13, v0, Lcb/c;->c:Ljb/a;

    .line 15
    new-instance v1, Lub/e;

    new-instance v2, Lqb/b;

    invoke-direct {v2, v11}, Lqb/b;-><init>(Lcb/a;)V

    invoke-direct {v1, v15, v2}, Lub/e;-><init>(LGb/f;Lcom/ui/unifi/core/base/net/traces/TracesClient;)V

    iput-object v1, v0, Lcb/c;->g:Lub/d;

    .line 16
    new-instance v1, Lcb/b;

    move-object/from16 v2, p6

    invoke-direct {v1, v12, v2}, Lcb/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v1

    iput-object v1, v0, Lcb/c;->j:LYg/m;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;LGb/d;Lcb/a;Lorg/webrtc/EglBase;LAb/b;Ljava/lang/String;Ljava/lang/String;Lwb/a;Lokhttp3/logging/HttpLoggingInterceptor$Level;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_0

    .line 17
    sget-object v1, Lcb/a;->PRODUCTION:Lcb/a;

    move-object v5, v1

    goto :goto_0

    :cond_0
    move-object/from16 v5, p3

    :goto_0
    and-int/lit8 v1, v0, 0x8

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v6, v2

    goto :goto_1

    :cond_1
    move-object/from16 v6, p4

    :goto_1
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_2

    move-object v7, v2

    goto :goto_2

    :cond_2
    move-object/from16 v7, p5

    :goto_2
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_3

    move-object v10, v2

    goto :goto_3

    :cond_3
    move-object/from16 v10, p8

    :goto_3
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_4

    .line 18
    sget-object v1, Lokhttp3/logging/HttpLoggingInterceptor$Level;->BASIC:Lokhttp3/logging/HttpLoggingInterceptor$Level;

    move-object v11, v1

    goto :goto_4

    :cond_4
    move-object/from16 v11, p9

    :goto_4
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_5

    const/4 v0, 0x0

    move v12, v0

    goto :goto_5

    :cond_5
    move/from16 v12, p10

    :goto_5
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    .line 19
    invoke-direct/range {v2 .. v12}, Lcb/c;-><init>(Landroid/content/Context;LGb/d;Lcb/a;Lorg/webrtc/EglBase;LAb/b;Ljava/lang/String;Ljava/lang/String;Lwb/a;Lokhttp3/logging/HttpLoggingInterceptor$Level;Z)V

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;Ljava/lang/String;)Llb/c;
    .locals 0

    invoke-static {p0, p1}, Lcb/c;->b(Ljava/lang/String;Ljava/lang/String;)Llb/c;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Ljava/lang/String;Ljava/lang/String;)Llb/c;
    .locals 7

    new-instance v6, Llb/c;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Llb/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method

.method private final d()Llb/c;
    .locals 1

    iget-object v0, p0, Lcb/c;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llb/c;

    return-object v0
.end method

.method private final f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfb/o;)Lfb/k;
    .locals 13

    move-object v0, p0

    iget-object v7, v0, Lcb/c;->e:LGb/f;

    invoke-direct {p0}, Lcb/c;->d()Llb/c;

    move-result-object v5

    iget-object v8, v0, Lcb/c;->d:LAb/a;

    iget-object v10, v0, Lcb/c;->a:Lokhttp3/logging/HttpLoggingInterceptor$Level;

    iget-object v11, v0, Lcb/c;->i:LCb/a;

    new-instance v12, Lfb/k;

    const/4 v9, 0x0

    move-object v1, v12

    move-object v2, p2

    move-object v3, p1

    move-object/from16 v4, p3

    move-object/from16 v6, p4

    invoke-direct/range {v1 .. v11}, Lfb/k;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llb/c;Lfb/o;LGb/f;LAb/a;Lwb/a;Lokhttp3/logging/HttpLoggingInterceptor$Level;LCb/a;)V

    return-object v12
.end method

.method public static synthetic h(Lcb/c;Ljava/lang/String;ZLeb/g$b;ILjava/lang/Object;)Leb/g;
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcb/c;->g(Ljava/lang/String;ZLeb/g$b;)Leb/g;

    move-result-object p0

    return-object p0
.end method

.method private final i(Landroid/content/Context;Lorg/webrtc/EglBase;)V
    .locals 1

    sget-object v0, Ltb/N;->B:Ltb/N$b;

    invoke-virtual {v0, p1, p2}, Ltb/N$b;->a(Landroid/content/Context;Lorg/webrtc/EglBase;)V

    return-void
.end method


# virtual methods
.method public final c()Ljb/a;
    .locals 1

    iget-object v0, p0, Lcb/c;->c:Ljb/a;

    return-object v0
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Leb/g;
    .locals 1

    const-string/jumbo v0, "deviceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "host"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "macAddress"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "ncaToken"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lfb/o$a;

    invoke-direct {v0, p4}, Lfb/o$a;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3, v0}, Lcb/c;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfb/o;)Lfb/k;

    move-result-object p1

    return-object p1
.end method

.method public final g(Ljava/lang/String;ZLeb/g$b;)Leb/g;
    .locals 10

    const-string/jumbo v0, "deviceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lcb/c;->b:Ljava/lang/String;

    iget-object v5, p0, Lcb/c;->e:LGb/f;

    invoke-direct {p0}, Lcb/c;->d()Llb/c;

    move-result-object v6

    iget-object v7, p0, Lcb/c;->c:Ljb/a;

    iget-object v8, p0, Lcb/c;->h:Ljb/i;

    new-instance v0, Lhb/c;

    move-object v1, v0

    move-object v3, p1

    move v4, p2

    move-object v9, p3

    invoke-direct/range {v1 .. v9}, Lhb/c;-><init>(Ljava/lang/String;Ljava/lang/String;ZLGb/f;Llb/c;Ljb/a;Ljb/i;Leb/g$b;)V

    return-object v0
.end method
