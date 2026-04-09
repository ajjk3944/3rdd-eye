.class public final Lcom/ui/wifiman/model/speedtest/advanced/b;
.super Lcom/ui/wifiman/model/speedtest/Speedtest$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/speedtest/advanced/b$a;,
        Lcom/ui/wifiman/model/speedtest/advanced/b$b;,
        Lcom/ui/wifiman/model/speedtest/advanced/b$c;
    }
.end annotation


# static fields
.field public static final r:Lcom/ui/wifiman/model/speedtest/advanced/b$a;


# instance fields
.field private final a:Lcom/ui/wifiman/model/speedtest/advanced/a$a;

.field private final b:LVd/c$a;

.field private final c:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

.field private final d:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

.field private final e:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

.field private final f:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

.field private final g:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

.field private final h:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

.field private final i:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

.field private final j:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

.field private final k:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

.field private final l:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

.field private final m:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

.field private final n:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

.field private final o:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

.field private final p:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

.field private final q:Lpd/s;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/speedtest/advanced/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/speedtest/advanced/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/model/speedtest/advanced/b;->r:Lcom/ui/wifiman/model/speedtest/advanced/b$a;

    return-void
.end method

.method public constructor <init>(Lcom/ui/wifiman/model/speedtest/advanced/a$a;LVd/c$a;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move-object/from16 v9, p10

    move-object/from16 v10, p11

    move-object/from16 v11, p12

    move-object/from16 v12, p13

    move-object/from16 v13, p14

    move-object/from16 v14, p15

    move-object/from16 v15, p16

    const-string v0, "params"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consoleLatencyCheck"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consoleJitterCheck"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consoleDownloadInitialization"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consoleDownload"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consoleUploadInitialization"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consoleUpload"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "evaluation"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "downloadInitialization"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "download"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uploadInitialization"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "upload"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resultReported"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resultReportStored"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Lcom/ui/wifiman/model/speedtest/Speedtest$d;-><init>()V

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/ui/wifiman/model/speedtest/advanced/b;->a:Lcom/ui/wifiman/model/speedtest/advanced/a$a;

    move-object/from16 v1, p2

    iput-object v1, v0, Lcom/ui/wifiman/model/speedtest/advanced/b;->b:LVd/c$a;

    iput-object v2, v0, Lcom/ui/wifiman/model/speedtest/advanced/b;->c:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iput-object v3, v0, Lcom/ui/wifiman/model/speedtest/advanced/b;->d:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iput-object v4, v0, Lcom/ui/wifiman/model/speedtest/advanced/b;->e:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iput-object v5, v0, Lcom/ui/wifiman/model/speedtest/advanced/b;->f:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iput-object v6, v0, Lcom/ui/wifiman/model/speedtest/advanced/b;->g:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iput-object v7, v0, Lcom/ui/wifiman/model/speedtest/advanced/b;->h:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iput-object v8, v0, Lcom/ui/wifiman/model/speedtest/advanced/b;->i:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iput-object v9, v0, Lcom/ui/wifiman/model/speedtest/advanced/b;->j:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iput-object v10, v0, Lcom/ui/wifiman/model/speedtest/advanced/b;->k:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iput-object v11, v0, Lcom/ui/wifiman/model/speedtest/advanced/b;->l:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iput-object v12, v0, Lcom/ui/wifiman/model/speedtest/advanced/b;->m:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iput-object v13, v0, Lcom/ui/wifiman/model/speedtest/advanced/b;->n:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iput-object v14, v0, Lcom/ui/wifiman/model/speedtest/advanced/b;->o:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iput-object v15, v0, Lcom/ui/wifiman/model/speedtest/advanced/b;->p:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    sget-object v1, Lpd/s;->LOCAL:Lpd/s;

    iput-object v1, v0, Lcom/ui/wifiman/model/speedtest/advanced/b;->q:Lpd/s;

    return-void
.end method

.method public static synthetic k(Lcom/ui/wifiman/model/speedtest/advanced/b;Lcom/ui/wifiman/model/speedtest/advanced/a$a;LVd/c$a;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;ILjava/lang/Object;)Lcom/ui/wifiman/model/speedtest/advanced/b;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p17

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/ui/wifiman/model/speedtest/advanced/b;->a:Lcom/ui/wifiman/model/speedtest/advanced/a$a;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/ui/wifiman/model/speedtest/advanced/b;->b:LVd/c$a;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/ui/wifiman/model/speedtest/advanced/b;->c:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/ui/wifiman/model/speedtest/advanced/b;->d:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/ui/wifiman/model/speedtest/advanced/b;->e:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/ui/wifiman/model/speedtest/advanced/b;->f:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/ui/wifiman/model/speedtest/advanced/b;->g:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/ui/wifiman/model/speedtest/advanced/b;->h:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/ui/wifiman/model/speedtest/advanced/b;->i:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/ui/wifiman/model/speedtest/advanced/b;->j:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/ui/wifiman/model/speedtest/advanced/b;->k:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/ui/wifiman/model/speedtest/advanced/b;->l:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/ui/wifiman/model/speedtest/advanced/b;->m:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/ui/wifiman/model/speedtest/advanced/b;->n:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p14, v15

    and-int/lit16 v15, v1, 0x4000

    if-eqz v15, :cond_e

    iget-object v15, v0, Lcom/ui/wifiman/model/speedtest/advanced/b;->o:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    goto :goto_e

    :cond_e
    move-object/from16 v15, p15

    :goto_e
    const v16, 0x8000

    and-int v1, v1, v16

    if-eqz v1, :cond_f

    iget-object v1, v0, Lcom/ui/wifiman/model/speedtest/advanced/b;->p:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    move-object/from16 p1, v2

    move-object/from16 p2, v3

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v12

    move-object/from16 p12, v13

    move-object/from16 p13, v14

    move-object/from16 p15, v15

    move-object/from16 p16, v1

    invoke-virtual/range {p0 .. p16}, Lcom/ui/wifiman/model/speedtest/advanced/b;->j(Lcom/ui/wifiman/model/speedtest/advanced/a$a;LVd/c$a;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;)Lcom/ui/wifiman/model/speedtest/advanced/b;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()Lcom/ui/wifiman/model/speedtest/Speedtest$f;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->k:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    return-object v0
.end method

.method public b()Lcom/ui/wifiman/model/speedtest/Speedtest$Error;
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->c:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    instance-of v1, v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;->c()Ljava/lang/Throwable;

    move-result-object v0

    goto/16 :goto_0

    :cond_0
    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->f:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    instance-of v1, v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;->c()Ljava/lang/Throwable;

    move-result-object v0

    goto/16 :goto_0

    :cond_1
    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->e:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    instance-of v1, v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    if-eqz v1, :cond_2

    check-cast v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;->c()Ljava/lang/Throwable;

    move-result-object v0

    goto/16 :goto_0

    :cond_2
    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->h:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    instance-of v1, v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    if-eqz v1, :cond_3

    check-cast v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;->c()Ljava/lang/Throwable;

    move-result-object v0

    goto/16 :goto_0

    :cond_3
    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->g:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    instance-of v1, v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    if-eqz v1, :cond_4

    check-cast v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;->c()Ljava/lang/Throwable;

    move-result-object v0

    goto/16 :goto_0

    :cond_4
    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->i:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    instance-of v1, v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    if-eqz v1, :cond_5

    check-cast v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;->c()Ljava/lang/Throwable;

    move-result-object v0

    goto :goto_0

    :cond_5
    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/advanced/b;->a()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    instance-of v0, v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/advanced/b;->a()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;->c()Ljava/lang/Throwable;

    move-result-object v0

    goto :goto_0

    :cond_6
    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/advanced/b;->x()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    instance-of v0, v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/advanced/b;->x()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;->c()Ljava/lang/Throwable;

    move-result-object v0

    goto :goto_0

    :cond_7
    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/advanced/b;->i()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    instance-of v0, v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/advanced/b;->i()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;->c()Ljava/lang/Throwable;

    move-result-object v0

    goto :goto_0

    :cond_8
    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/advanced/b;->f()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    instance-of v0, v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    if-eqz v0, :cond_9

    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/advanced/b;->f()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;->c()Ljava/lang/Throwable;

    move-result-object v0

    goto :goto_0

    :cond_9
    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->o:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    instance-of v1, v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    if-eqz v1, :cond_a

    check-cast v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;->c()Ljava/lang/Throwable;

    move-result-object v0

    goto :goto_0

    :cond_a
    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->p:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    instance-of v1, v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    if-eqz v1, :cond_b

    check-cast v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;->c()Ljava/lang/Throwable;

    move-result-object v0

    goto :goto_0

    :cond_b
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_d

    instance-of v1, v0, Ljava/io/IOException;

    if-eqz v1, :cond_c

    new-instance v1, Lcom/ui/wifiman/model/speedtest/Speedtest$Error$NetworkConnection;

    invoke-direct {v1, v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$Error$NetworkConnection;-><init>(Ljava/lang/Throwable;)V

    :goto_1
    move-object v2, v1

    goto :goto_2

    :cond_c
    new-instance v1, Lcom/ui/wifiman/model/speedtest/Speedtest$Error$Unexpected;

    invoke-direct {v1, v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$Error$Unexpected;-><init>(Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_d
    :goto_2
    return-object v2
.end method

.method public c()Z
    .locals 3

    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/advanced/b;->r()Lcom/ui/wifiman/model/speedtest/advanced/b$b;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/speedtest/advanced/b$b;->END:Lcom/ui/wifiman/model/speedtest/advanced/b$b;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/advanced/b;->b()Lcom/ui/wifiman/model/speedtest/Speedtest$Error;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    return v2
.end method

.method public d()Lcom/ui/wifiman/model/speedtest/Speedtest$f;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->d:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    return-object v0
.end method

.method public e()Lcom/ui/wifiman/model/speedtest/Speedtest$f;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->c:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/speedtest/advanced/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/model/speedtest/advanced/b;

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->a:Lcom/ui/wifiman/model/speedtest/advanced/a$a;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/advanced/b;->a:Lcom/ui/wifiman/model/speedtest/advanced/a$a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->b:LVd/c$a;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/advanced/b;->b:LVd/c$a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->c:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/advanced/b;->c:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->d:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/advanced/b;->d:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->e:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/advanced/b;->e:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->f:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/advanced/b;->f:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->g:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/advanced/b;->g:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->h:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/advanced/b;->h:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->i:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/advanced/b;->i:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->j:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/advanced/b;->j:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->k:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/advanced/b;->k:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->l:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/advanced/b;->l:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->m:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/advanced/b;->m:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->n:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/advanced/b;->n:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->o:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/advanced/b;->o:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->p:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    iget-object p1, p1, Lcom/ui/wifiman/model/speedtest/advanced/b;->p:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    return v2

    :cond_11
    return v0
.end method

.method public f()Lcom/ui/wifiman/model/speedtest/Speedtest$f;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->n:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    return-object v0
.end method

.method public g()Lcom/ui/wifiman/model/speedtest/Speedtest$f;
    .locals 6

    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/advanced/b;->f()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    instance-of v0, v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->o:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    instance-of v0, v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->p:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    instance-of v0, v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/advanced/b;->f()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v1

    check-cast v1, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ui/wifiman/model/speedtest/result/b;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/result/b;->f()J

    move-result-wide v1

    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/advanced/b;->f()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v3

    check-cast v3, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ui/wifiman/model/speedtest/result/b;

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/result/b;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/advanced/b;->f()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v4

    check-cast v4, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    invoke-virtual {v4}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;->c()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ui/wifiman/model/speedtest/result/b;

    invoke-virtual {v4}, Lcom/ui/wifiman/model/speedtest/result/b;->c()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/ui/wifiman/model/speedtest/Speedtest$c;

    invoke-direct {v5, v1, v2, v4, v3}, Lcom/ui/wifiman/model/speedtest/Speedtest$c;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, v5}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;

    invoke-direct {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;-><init>()V

    :goto_0
    return-object v0
.end method

.method public h()Lcom/ui/wifiman/model/speedtest/Speedtest$e;
    .locals 2

    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/advanced/b;->r()Lcom/ui/wifiman/model/speedtest/advanced/b$b;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/speedtest/advanced/b$c;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_0
    sget-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->END:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    goto :goto_0

    :pswitch_1
    sget-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->RESULT_PROCESSING:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    goto :goto_0

    :pswitch_2
    sget-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->UPLOAD:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    goto :goto_0

    :pswitch_3
    sget-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->UPLOAD_INIT:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    goto :goto_0

    :pswitch_4
    sget-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->DOWNLOAD:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    goto :goto_0

    :pswitch_5
    sget-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->DOWNLOAD_INIT:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    goto :goto_0

    :pswitch_6
    sget-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->LATENCY_CHECK:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    goto :goto_0

    :pswitch_7
    sget-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->UPLOAD:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    goto :goto_0

    :pswitch_8
    sget-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->UPLOAD_INIT:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    goto :goto_0

    :pswitch_9
    sget-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->DOWNLOAD:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    goto :goto_0

    :pswitch_a
    sget-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->DOWNLOAD_INIT:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    goto :goto_0

    :pswitch_b
    sget-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->LATENCY_CHECK:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    :goto_0
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->a:Lcom/ui/wifiman/model/speedtest/advanced/a$a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->b:LVd/c$a;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, LVd/c$a;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->c:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->d:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->e:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->f:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->g:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->h:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->i:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->j:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->k:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->l:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->m:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->n:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->o:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->p:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public i()Lcom/ui/wifiman/model/speedtest/Speedtest$f;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->m:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    return-object v0
.end method

.method public final j(Lcom/ui/wifiman/model/speedtest/advanced/a$a;LVd/c$a;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;)Lcom/ui/wifiman/model/speedtest/advanced/b;
    .locals 19

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    move-object/from16 v16, p16

    const-string v0, "params"

    move-object/from16 v17, v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consoleLatencyCheck"

    move-object/from16 v1, p3

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consoleJitterCheck"

    move-object/from16 v1, p4

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consoleDownloadInitialization"

    move-object/from16 v1, p5

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consoleDownload"

    move-object/from16 v1, p6

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consoleUploadInitialization"

    move-object/from16 v1, p7

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consoleUpload"

    move-object/from16 v1, p8

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "evaluation"

    move-object/from16 v1, p9

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "downloadInitialization"

    move-object/from16 v1, p10

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "download"

    move-object/from16 v1, p11

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uploadInitialization"

    move-object/from16 v1, p12

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "upload"

    move-object/from16 v1, p13

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    move-object/from16 v1, p14

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resultReported"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resultReportStored"

    move-object/from16 v1, p16

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v18, Lcom/ui/wifiman/model/speedtest/advanced/b;

    move-object/from16 v0, v18

    move-object/from16 v1, v17

    invoke-direct/range {v0 .. v16}, Lcom/ui/wifiman/model/speedtest/advanced/b;-><init>(Lcom/ui/wifiman/model/speedtest/advanced/a$a;LVd/c$a;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;)V

    return-object v18
.end method

.method public final l()Lcom/ui/wifiman/model/speedtest/Speedtest$f;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->f:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    return-object v0
.end method

.method public final m()Lcom/ui/wifiman/model/speedtest/Speedtest$f;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->e:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    return-object v0
.end method

.method public final n()Lcom/ui/wifiman/model/speedtest/Speedtest$f;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->d:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    return-object v0
.end method

.method public final o()Lcom/ui/wifiman/model/speedtest/Speedtest$f;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->c:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    return-object v0
.end method

.method public final p()Lcom/ui/wifiman/model/speedtest/Speedtest$f;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->h:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    return-object v0
.end method

.method public final q()Lcom/ui/wifiman/model/speedtest/Speedtest$f;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->g:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    return-object v0
.end method

.method public final r()Lcom/ui/wifiman/model/speedtest/advanced/b$b;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/advanced/b;->e()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->a()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/ui/wifiman/model/speedtest/advanced/b$b;->CONSOLE_LATENCY_CHECK:Lcom/ui/wifiman/model/speedtest/advanced/b$b;

    goto/16 :goto_0

    :cond_0
    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->e:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->a()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/ui/wifiman/model/speedtest/advanced/b$b;->CONSOLE_DOWNLOAD_SETUP:Lcom/ui/wifiman/model/speedtest/advanced/b$b;

    goto/16 :goto_0

    :cond_1
    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->f:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->a()Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lcom/ui/wifiman/model/speedtest/advanced/b$b;->CONSOLE_DOWNLOAD:Lcom/ui/wifiman/model/speedtest/advanced/b$b;

    goto/16 :goto_0

    :cond_2
    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->g:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->a()Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Lcom/ui/wifiman/model/speedtest/advanced/b$b;->CONSOLE_UPLOAD_SETUP:Lcom/ui/wifiman/model/speedtest/advanced/b$b;

    goto/16 :goto_0

    :cond_3
    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->h:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->a()Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, Lcom/ui/wifiman/model/speedtest/advanced/b$b;->CONSOLE_UPLOAD:Lcom/ui/wifiman/model/speedtest/advanced/b$b;

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->i:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->a()Z

    move-result v0

    if-nez v0, :cond_5

    sget-object v0, Lcom/ui/wifiman/model/speedtest/advanced/b$b;->EVALUATION:Lcom/ui/wifiman/model/speedtest/advanced/b$b;

    goto :goto_0

    :cond_5
    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/advanced/b;->s()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->a()Z

    move-result v0

    if-nez v0, :cond_6

    sget-object v0, Lcom/ui/wifiman/model/speedtest/advanced/b$b;->DOWNLOAD_SETUP:Lcom/ui/wifiman/model/speedtest/advanced/b$b;

    goto :goto_0

    :cond_6
    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/advanced/b;->a()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->a()Z

    move-result v0

    if-nez v0, :cond_7

    sget-object v0, Lcom/ui/wifiman/model/speedtest/advanced/b$b;->DOWNLOAD:Lcom/ui/wifiman/model/speedtest/advanced/b$b;

    goto :goto_0

    :cond_7
    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/advanced/b;->x()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->a()Z

    move-result v0

    if-nez v0, :cond_8

    sget-object v0, Lcom/ui/wifiman/model/speedtest/advanced/b$b;->UPLOAD_SETUP:Lcom/ui/wifiman/model/speedtest/advanced/b$b;

    goto :goto_0

    :cond_8
    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/advanced/b;->i()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->a()Z

    move-result v0

    if-nez v0, :cond_9

    sget-object v0, Lcom/ui/wifiman/model/speedtest/advanced/b$b;->UPLOAD:Lcom/ui/wifiman/model/speedtest/advanced/b$b;

    goto :goto_0

    :cond_9
    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/advanced/b;->f()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->a()Z

    move-result v0

    if-nez v0, :cond_a

    sget-object v0, Lcom/ui/wifiman/model/speedtest/advanced/b$b;->RESULT_SAVE:Lcom/ui/wifiman/model/speedtest/advanced/b$b;

    goto :goto_0

    :cond_a
    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->o:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->a()Z

    move-result v0

    if-nez v0, :cond_b

    sget-object v0, Lcom/ui/wifiman/model/speedtest/advanced/b$b;->RESULT_REPORT:Lcom/ui/wifiman/model/speedtest/advanced/b$b;

    goto :goto_0

    :cond_b
    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->p:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->a()Z

    move-result v0

    if-nez v0, :cond_c

    sget-object v0, Lcom/ui/wifiman/model/speedtest/advanced/b$b;->RESULT_UPDATE_WITH_REPORT:Lcom/ui/wifiman/model/speedtest/advanced/b$b;

    goto :goto_0

    :cond_c
    sget-object v0, Lcom/ui/wifiman/model/speedtest/advanced/b$b;->END:Lcom/ui/wifiman/model/speedtest/advanced/b$b;

    :goto_0
    return-object v0
.end method

.method public s()Lcom/ui/wifiman/model/speedtest/Speedtest$f;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->j:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    return-object v0
.end method

.method public final t()Lcom/ui/wifiman/model/speedtest/Speedtest$f;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->i:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lcom/ui/wifiman/model/speedtest/Speedtest$d;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()Lcom/ui/wifiman/model/speedtest/advanced/a$a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->a:Lcom/ui/wifiman/model/speedtest/advanced/a$a;

    return-object v0
.end method

.method public final v()Lcom/ui/wifiman/model/speedtest/Speedtest$f;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->o:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    return-object v0
.end method

.method public final w()LVd/c$a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->b:LVd/c$a;

    return-object v0
.end method

.method public x()Lcom/ui/wifiman/model/speedtest/Speedtest$f;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/b;->l:Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    return-object v0
.end method
