.class public final LXb/g;
.super LXb/e;
.source "SourceFile"


# instance fields
.field private final b:Lm2/q;

.field private final c:Lm2/i;

.field private final d:Lm2/i;

.field private final e:Lcom/ui/wifiman/db/A;

.field private final f:Lm2/i;

.field private final g:Lm2/h;

.field private final h:Lm2/h;

.field private final i:Lm2/h;

.field private final j:Lm2/w;

.field private final k:Lm2/w;

.field private final l:Lm2/w;


# direct methods
.method public constructor <init>(Lm2/q;)V
    .locals 1

    invoke-direct {p0}, LXb/e;-><init>()V

    new-instance v0, Lcom/ui/wifiman/db/A;

    invoke-direct {v0}, Lcom/ui/wifiman/db/A;-><init>()V

    iput-object v0, p0, LXb/g;->e:Lcom/ui/wifiman/db/A;

    iput-object p1, p0, LXb/g;->b:Lm2/q;

    new-instance v0, LXb/g$f;

    invoke-direct {v0, p0, p1}, LXb/g$f;-><init>(LXb/g;Lm2/q;)V

    iput-object v0, p0, LXb/g;->c:Lm2/i;

    new-instance v0, LXb/g$g;

    invoke-direct {v0, p0, p1}, LXb/g$g;-><init>(LXb/g;Lm2/q;)V

    iput-object v0, p0, LXb/g;->d:Lm2/i;

    new-instance v0, LXb/g$h;

    invoke-direct {v0, p0, p1}, LXb/g$h;-><init>(LXb/g;Lm2/q;)V

    iput-object v0, p0, LXb/g;->f:Lm2/i;

    new-instance v0, LXb/g$i;

    invoke-direct {v0, p0, p1}, LXb/g$i;-><init>(LXb/g;Lm2/q;)V

    iput-object v0, p0, LXb/g;->g:Lm2/h;

    new-instance v0, LXb/g$j;

    invoke-direct {v0, p0, p1}, LXb/g$j;-><init>(LXb/g;Lm2/q;)V

    iput-object v0, p0, LXb/g;->h:Lm2/h;

    new-instance v0, LXb/g$k;

    invoke-direct {v0, p0, p1}, LXb/g$k;-><init>(LXb/g;Lm2/q;)V

    iput-object v0, p0, LXb/g;->i:Lm2/h;

    new-instance v0, LXb/g$l;

    invoke-direct {v0, p0, p1}, LXb/g$l;-><init>(LXb/g;Lm2/q;)V

    iput-object v0, p0, LXb/g;->j:Lm2/w;

    new-instance v0, LXb/g$m;

    invoke-direct {v0, p0, p1}, LXb/g$m;-><init>(LXb/g;Lm2/q;)V

    iput-object v0, p0, LXb/g;->k:Lm2/w;

    new-instance v0, LXb/g$n;

    invoke-direct {v0, p0, p1}, LXb/g$n;-><init>(LXb/g;Lm2/q;)V

    iput-object v0, p0, LXb/g;->l:Lm2/w;

    return-void
.end method

.method static synthetic A(LXb/g;[J)Z
    .locals 0

    invoke-super {p0, p1}, LXb/e;->g([J)Z

    move-result p0

    return p0
.end method

.method public static B()Ljava/util/List;
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private synthetic C(Lo/t;)LYg/J;
    .locals 0

    invoke-direct {p0, p1}, LXb/g;->x(Lo/t;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public static synthetic t(LXb/g;Lo/t;)LYg/J;
    .locals 0

    invoke-direct {p0, p1}, LXb/g;->C(Lo/t;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method static bridge synthetic u(LXb/g;)Lm2/q;
    .locals 0

    iget-object p0, p0, LXb/g;->b:Lm2/q;

    return-object p0
.end method

.method static bridge synthetic v(LXb/g;)Lcom/ui/wifiman/db/A;
    .locals 0

    iget-object p0, p0, LXb/g;->e:Lcom/ui/wifiman/db/A;

    return-object p0
.end method

.method static bridge synthetic w(LXb/g;Lo/t;)V
    .locals 0

    invoke-direct {p0, p1}, LXb/g;->x(Lo/t;)V

    return-void
.end method

.method private x(Lo/t;)V
    .locals 36

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    invoke-virtual/range {p1 .. p1}, Lo/t;->h()Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lo/t;->o()I

    move-result v2

    const/16 v3, 0x3e7

    const/4 v4, 0x1

    if-le v2, v3, :cond_1

    new-instance v2, LXb/f;

    invoke-direct {v2, v1}, LXb/f;-><init>(LXb/g;)V

    invoke-static {v0, v4, v2}, Lp2/d;->a(Lo/t;ZLmh/l;)V

    return-void

    :cond_1
    invoke-static {}, Lp2/e;->b()Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, "SELECT `id`,`resultId`,`speedtest_type`,`latency`,`jitter`,`downloadBits`,`download_bits_history`,`uploadBits`,`upload_bits_history`,`endpoint_type`,`server_ip`,`server_name`,`server_provider`,`server_provider_url`,`server_location_city`,`server_location_country`,`server_product_id`,`server_product_image_engine`,`server_product_image_url`,`server_product`,`server_wifi_experience`,`server_a2a_device_type`,`server_provider_secondary`,`public_ip_provider`,`public_ip_provider_image` FROM `speedTestMeasurement` WHERE `resultId` IN ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p1 .. p1}, Lo/t;->o()I

    move-result v3

    invoke-static {v2, v3}, Lp2/e;->a(Ljava/lang/StringBuilder;I)V

    const-string v5, ")"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Lm2/t;->j(Ljava/lang/String;I)Lm2/t;

    move-result-object v2

    const/4 v3, 0x0

    move v5, v3

    move v6, v4

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lo/t;->o()I

    move-result v7

    if-ge v5, v7, :cond_2

    invoke-virtual {v0, v5}, Lo/t;->i(I)J

    move-result-wide v7

    invoke-virtual {v2, v6, v7, v8}, Lm2/t;->bindLong(IJ)V

    add-int/2addr v6, v4

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    iget-object v5, v1, LXb/g;->b:Lm2/q;

    const/4 v6, 0x0

    invoke-static {v5, v2, v3, v6}, Lp2/b;->b(Lm2/q;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v2

    :try_start_0
    const-string/jumbo v5, "resultId"

    invoke-static {v2, v5}, Lp2/a;->c(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v7, -0x1

    if-ne v5, v7, :cond_3

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    return-void

    :cond_3
    :goto_1
    :try_start_1
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v7

    if-eqz v7, :cond_19

    invoke-interface {v2, v5}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v7

    invoke-virtual {v0, v7, v8}, Lo/t;->e(J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/ArrayList;

    if-eqz v7, :cond_18

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v9

    invoke-interface {v2, v4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v11

    const/4 v8, 0x2

    invoke-interface {v2, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v13

    const/4 v8, 0x3

    invoke-interface {v2, v8}, Landroid/database/Cursor;->isNull(I)Z

    move-result v14

    if-eqz v14, :cond_4

    move-object v14, v6

    goto :goto_2

    :cond_4
    invoke-interface {v2, v8}, Landroid/database/Cursor;->getInt(I)I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    move-object v14, v8

    :goto_2
    const/4 v8, 0x4

    invoke-interface {v2, v8}, Landroid/database/Cursor;->isNull(I)Z

    move-result v15

    if-eqz v15, :cond_5

    move-object v15, v6

    goto :goto_3

    :cond_5
    invoke-interface {v2, v8}, Landroid/database/Cursor;->getInt(I)I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    move-object v15, v8

    :goto_3
    const/4 v8, 0x5

    invoke-interface {v2, v8}, Landroid/database/Cursor;->isNull(I)Z

    move-result v16

    if-eqz v16, :cond_6

    move-object/from16 v16, v6

    goto :goto_4

    :cond_6
    invoke-interface {v2, v8}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v16

    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    move-object/from16 v16, v8

    :goto_4
    const/4 v8, 0x6

    invoke-interface {v2, v8}, Landroid/database/Cursor;->isNull(I)Z

    move-result v17

    if-eqz v17, :cond_7

    move-object v8, v6

    goto :goto_5

    :cond_7
    invoke-interface {v2, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    :goto_5
    iget-object v3, v1, LXb/g;->e:Lcom/ui/wifiman/db/A;

    invoke-virtual {v3, v8}, Lcom/ui/wifiman/db/A;->a(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v17

    const/4 v3, 0x7

    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_8

    move-object/from16 v18, v6

    goto :goto_6

    :cond_8
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v18

    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    move-object/from16 v18, v3

    :goto_6
    const/16 v3, 0x8

    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_9

    move-object v3, v6

    goto :goto_7

    :cond_9
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    :goto_7
    iget-object v8, v1, LXb/g;->e:Lcom/ui/wifiman/db/A;

    invoke-virtual {v8, v3}, Lcom/ui/wifiman/db/A;->a(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v19

    const/16 v3, 0x9

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v20

    const/16 v3, 0xa

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v21

    const/16 v3, 0xb

    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_a

    move-object/from16 v22, v6

    goto :goto_8

    :cond_a
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v22, v3

    :goto_8
    const/16 v3, 0xc

    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_b

    move-object/from16 v23, v6

    goto :goto_9

    :cond_b
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v23, v3

    :goto_9
    const/16 v3, 0xd

    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_c

    move-object/from16 v24, v6

    goto :goto_a

    :cond_c
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v24, v3

    :goto_a
    const/16 v3, 0xe

    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_d

    move-object/from16 v25, v6

    goto :goto_b

    :cond_d
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v25, v3

    :goto_b
    const/16 v3, 0xf

    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_e

    move-object/from16 v26, v6

    goto :goto_c

    :cond_e
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v26, v3

    :goto_c
    const/16 v3, 0x10

    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_f

    move-object/from16 v27, v6

    goto :goto_d

    :cond_f
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    move-object/from16 v27, v3

    :goto_d
    const/16 v3, 0x11

    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_10

    move-object/from16 v28, v6

    goto :goto_e

    :cond_10
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    move-object/from16 v28, v3

    :goto_e
    const/16 v3, 0x12

    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_11

    move-object/from16 v29, v6

    goto :goto_f

    :cond_11
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v29, v3

    :goto_f
    const/16 v3, 0x13

    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_12

    move-object/from16 v30, v6

    goto :goto_10

    :cond_12
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v30, v3

    :goto_10
    const/16 v3, 0x14

    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_13

    move-object/from16 v31, v6

    goto :goto_11

    :cond_13
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    move-object/from16 v31, v3

    :goto_11
    const/16 v3, 0x15

    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_14

    move-object/from16 v32, v6

    goto :goto_12

    :cond_14
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v32, v3

    :goto_12
    const/16 v3, 0x16

    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_15

    move-object/from16 v33, v6

    goto :goto_13

    :cond_15
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v33, v3

    :goto_13
    const/16 v3, 0x17

    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_16

    move-object/from16 v34, v6

    goto :goto_14

    :cond_16
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v34, v3

    :goto_14
    const/16 v3, 0x18

    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_17

    move-object/from16 v35, v6

    goto :goto_15

    :cond_17
    const/16 v3, 0x18

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v35, v3

    :goto_15
    new-instance v3, LXb/c;

    move-object v8, v3

    invoke-direct/range {v8 .. v35}, LXb/c;-><init>(JJLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/ArrayList;Ljava/lang/Long;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_16

    :catchall_0
    move-exception v0

    goto :goto_17

    :cond_18
    :goto_16
    const/4 v3, 0x0

    goto/16 :goto_1

    :cond_19
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    return-void

    :goto_17
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    throw v0
.end method

.method static synthetic y(LXb/g;LXb/d;)LXb/d;
    .locals 0

    invoke-super {p0, p1}, LXb/e;->l(LXb/d;)LXb/d;

    move-result-object p0

    return-object p0
.end method

.method static synthetic z(LXb/g;LXb/d;)Z
    .locals 0

    invoke-super {p0, p1}, LXb/e;->p(LXb/d;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 5

    const-string/jumbo v0, "SELECT speedTestId.*, speedTestEnv.* FROM speedTestId INNER JOIN speedTestEnv ON speedTestId.id = speedTestEnv.resultId ORDER BY speedTestId.timestamp DESC"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lm2/t;->j(Ljava/lang/String;I)Lm2/t;

    move-result-object v0

    iget-object v1, p0, LXb/g;->b:Lm2/q;

    const-string/jumbo v2, "speedTestId"

    const-string/jumbo v3, "speedTestEnv"

    const-string/jumbo v4, "speedTestMeasurement"

    filled-new-array {v4, v2, v3}, [Ljava/lang/String;

    move-result-object v2

    new-instance v3, LXb/g$a;

    invoke-direct {v3, p0, v0}, LXb/g$a;-><init>(LXb/g;Lm2/t;)V

    const/4 v0, 0x1

    invoke-static {v1, v0, v2, v3}, Lo2/d;->d(Lm2/q;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lgg/i;

    move-result-object v0

    return-object v0
.end method

.method public b(I)Lgg/i;
    .locals 5

    const-string/jumbo v0, "SELECT speedTestId.*, speedTestEnv.* FROM speedTestId INNER JOIN speedTestEnv ON speedTestId.id = speedTestEnv.resultId ORDER BY speedTestId.timestamp DESC LIMIT ?"

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lm2/t;->j(Ljava/lang/String;I)Lm2/t;

    move-result-object v0

    int-to-long v2, p1

    invoke-virtual {v0, v1, v2, v3}, Lm2/t;->bindLong(IJ)V

    iget-object p1, p0, LXb/g;->b:Lm2/q;

    const-string/jumbo v2, "speedTestId"

    const-string/jumbo v3, "speedTestEnv"

    const-string/jumbo v4, "speedTestMeasurement"

    filled-new-array {v4, v2, v3}, [Ljava/lang/String;

    move-result-object v2

    new-instance v3, LXb/g$b;

    invoke-direct {v3, p0, v0}, LXb/g$b;-><init>(LXb/g;Lm2/t;)V

    invoke-static {p1, v1, v2, v3}, Lo2/d;->d(Lm2/q;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/lang/String;)Lgg/i;
    .locals 5

    const-string/jumbo v0, "SELECT speedTestId.*, speedTestEnv.* FROM speedTestId INNER JOIN speedTestEnv ON speedTestId.id = speedTestEnv.resultId WHERE speedTestEnv.connection_type = ? ORDER BY speedTestId.timestamp DESC"

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lm2/t;->j(Ljava/lang/String;I)Lm2/t;

    move-result-object v0

    invoke-virtual {v0, v1, p1}, Lm2/t;->bindString(ILjava/lang/String;)V

    iget-object p1, p0, LXb/g;->b:Lm2/q;

    const-string/jumbo v2, "speedTestId"

    const-string/jumbo v3, "speedTestEnv"

    const-string/jumbo v4, "speedTestMeasurement"

    filled-new-array {v4, v2, v3}, [Ljava/lang/String;

    move-result-object v2

    new-instance v3, LXb/g$c;

    invoke-direct {v3, p0, v0}, LXb/g$c;-><init>(LXb/g;Lm2/t;)V

    invoke-static {p1, v1, v2, v3}, Lo2/d;->d(Lm2/q;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public f(Ljava/lang/String;Ljava/lang/String;I)Lgg/i;
    .locals 3

    const-string/jumbo v0, "SELECT speedTestId.*, speedTestEnv.* FROM speedTestId INNER JOIN speedTestEnv ON speedTestId.id = speedTestEnv.resultId WHERE speedTestEnv.connection_type = ? AND speedTestEnv.ssid = ? ORDER BY speedTestId.timestamp DESC LIMIT ?"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lm2/t;->j(Ljava/lang/String;I)Lm2/t;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v2, p1}, Lm2/t;->bindString(ILjava/lang/String;)V

    const/4 p1, 0x2

    if-nez p2, :cond_0

    invoke-virtual {v0, p1}, Lm2/t;->bindNull(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1, p2}, Lm2/t;->bindString(ILjava/lang/String;)V

    :goto_0
    int-to-long p1, p3

    invoke-virtual {v0, v1, p1, p2}, Lm2/t;->bindLong(IJ)V

    iget-object p1, p0, LXb/g;->b:Lm2/q;

    const-string/jumbo p2, "speedTestId"

    const-string/jumbo p3, "speedTestEnv"

    const-string/jumbo v1, "speedTestMeasurement"

    filled-new-array {v1, p2, p3}, [Ljava/lang/String;

    move-result-object p2

    new-instance p3, LXb/g$d;

    invoke-direct {p3, p0, v0}, LXb/g$d;-><init>(LXb/g;Lm2/t;)V

    invoke-static {p1, v2, p2, p3}, Lo2/d;->d(Lm2/q;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public varargs g([J)Z
    .locals 1

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->e()V

    :try_start_0
    invoke-static {p0, p1}, LXb/g;->A(LXb/g;[J)Z

    move-result p1

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    return p1

    :catchall_0
    move-exception p1

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    throw p1
.end method

.method protected varargs h([J)I
    .locals 7

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->d()V

    invoke-static {}, Lp2/e;->b()Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "DELETE FROM speedTestEnv WHERE resultId in ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v1, p1

    invoke-static {v0, v1}, Lp2/e;->a(Ljava/lang/StringBuilder;I)V

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v1, v0}, Lm2/q;->f(Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteStatement;

    move-result-object v0

    array-length v1, p1

    const/4 v2, 0x1

    const/4 v3, 0x0

    move v4, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-wide v5, p1, v3

    invoke-interface {v0, v4, v5, v6}, Lr2/g;->bindLong(IJ)V

    add-int/2addr v4, v2

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->e()V

    :try_start_0
    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->executeUpdateDelete()I

    move-result p1

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    return p1

    :catchall_0
    move-exception p1

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    throw p1
.end method

.method protected varargs i([J)I
    .locals 7

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->d()V

    invoke-static {}, Lp2/e;->b()Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "DELETE FROM speedTestId WHERE id in ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v1, p1

    invoke-static {v0, v1}, Lp2/e;->a(Ljava/lang/StringBuilder;I)V

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v1, v0}, Lm2/q;->f(Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteStatement;

    move-result-object v0

    array-length v1, p1

    const/4 v2, 0x1

    const/4 v3, 0x0

    move v4, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-wide v5, p1, v3

    invoke-interface {v0, v4, v5, v6}, Lr2/g;->bindLong(IJ)V

    add-int/2addr v4, v2

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->e()V

    :try_start_0
    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->executeUpdateDelete()I

    move-result p1

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    return p1

    :catchall_0
    move-exception p1

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    throw p1
.end method

.method protected varargs j([J)I
    .locals 7

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->d()V

    invoke-static {}, Lp2/e;->b()Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "DELETE FROM speedTestMeasurement WHERE resultId in ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v1, p1

    invoke-static {v0, v1}, Lp2/e;->a(Ljava/lang/StringBuilder;I)V

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v1, v0}, Lm2/q;->f(Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteStatement;

    move-result-object v0

    array-length v1, p1

    const/4 v2, 0x1

    const/4 v3, 0x0

    move v4, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-wide v5, p1, v3

    invoke-interface {v0, v4, v5, v6}, Lr2/g;->bindLong(IJ)V

    add-int/2addr v4, v2

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->e()V

    :try_start_0
    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->executeUpdateDelete()I

    move-result p1

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    return p1

    :catchall_0
    move-exception p1

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    throw p1
.end method

.method public k(J)Lgg/i;
    .locals 4

    const-string/jumbo v0, "SELECT speedTestId.*, speedTestEnv.* FROM speedTestId INNER JOIN speedTestEnv ON speedTestId.id = speedTestEnv.resultId WHERE speedTestId.id = ?"

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lm2/t;->j(Ljava/lang/String;I)Lm2/t;

    move-result-object v0

    invoke-virtual {v0, v1, p1, p2}, Lm2/t;->bindLong(IJ)V

    iget-object p1, p0, LXb/g;->b:Lm2/q;

    const-string/jumbo p2, "speedTestId"

    const-string/jumbo v2, "speedTestEnv"

    const-string/jumbo v3, "speedTestMeasurement"

    filled-new-array {v3, p2, v2}, [Ljava/lang/String;

    move-result-object p2

    new-instance v2, LXb/g$e;

    invoke-direct {v2, p0, v0}, LXb/g$e;-><init>(LXb/g;Lm2/t;)V

    invoke-static {p1, v1, p2, v2}, Lo2/d;->d(Lm2/q;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public l(LXb/d;)LXb/d;
    .locals 1

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->e()V

    :try_start_0
    invoke-static {p0, p1}, LXb/g;->y(LXb/g;LXb/d;)LXb/d;

    move-result-object p1

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    return-object p1

    :catchall_0
    move-exception p1

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    throw p1
.end method

.method protected m(LXb/a;)J
    .locals 2

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->d()V

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->e()V

    :try_start_0
    iget-object v0, p0, LXb/g;->d:Lm2/i;

    invoke-virtual {v0, p1}, Lm2/i;->m(Ljava/lang/Object;)J

    move-result-wide v0

    iget-object p1, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->i()V

    return-wide v0

    :catchall_0
    move-exception p1

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    throw p1
.end method

.method protected n(LXb/b;)J
    .locals 2

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->d()V

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->e()V

    :try_start_0
    iget-object v0, p0, LXb/g;->c:Lm2/i;

    invoke-virtual {v0, p1}, Lm2/i;->m(Ljava/lang/Object;)J

    move-result-wide v0

    iget-object p1, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->i()V

    return-wide v0

    :catchall_0
    move-exception p1

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    throw p1
.end method

.method protected o(LXb/c;)J
    .locals 2

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->d()V

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->e()V

    :try_start_0
    iget-object v0, p0, LXb/g;->f:Lm2/i;

    invoke-virtual {v0, p1}, Lm2/i;->m(Ljava/lang/Object;)J

    move-result-wide v0

    iget-object p1, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->i()V

    return-wide v0

    :catchall_0
    move-exception p1

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    throw p1
.end method

.method public p(LXb/d;)Z
    .locals 1

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->e()V

    :try_start_0
    invoke-static {p0, p1}, LXb/g;->z(LXb/g;LXb/d;)Z

    move-result p1

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    return p1

    :catchall_0
    move-exception p1

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    throw p1
.end method

.method protected q(LXb/a;)I
    .locals 1

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->d()V

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->e()V

    :try_start_0
    iget-object v0, p0, LXb/g;->h:Lm2/h;

    invoke-virtual {v0, p1}, Lm2/h;->j(Ljava/lang/Object;)I

    move-result p1

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    return p1

    :catchall_0
    move-exception p1

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    throw p1
.end method

.method protected r(LXb/b;)I
    .locals 1

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->d()V

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->e()V

    :try_start_0
    iget-object v0, p0, LXb/g;->g:Lm2/h;

    invoke-virtual {v0, p1}, Lm2/h;->j(Ljava/lang/Object;)I

    move-result p1

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    return p1

    :catchall_0
    move-exception p1

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    throw p1
.end method

.method protected s(LXb/c;)I
    .locals 1

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->d()V

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->e()V

    :try_start_0
    iget-object v0, p0, LXb/g;->i:Lm2/h;

    invoke-virtual {v0, p1}, Lm2/h;->j(Ljava/lang/Object;)I

    move-result p1

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    return p1

    :catchall_0
    move-exception p1

    iget-object v0, p0, LXb/g;->b:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    throw p1
.end method
