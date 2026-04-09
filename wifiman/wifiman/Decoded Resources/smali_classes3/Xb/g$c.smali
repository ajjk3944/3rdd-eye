.class LXb/g$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LXb/g;->d(Ljava/lang/String;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lm2/t;

.field final synthetic b:LXb/g;


# direct methods
.method constructor <init>(LXb/g;Lm2/t;)V
    .locals 0

    iput-object p1, p0, LXb/g$c;->b:LXb/g;

    iput-object p2, p0, LXb/g$c;->a:Lm2/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 50

    move-object/from16 v1, p0

    iget-object v0, v1, LXb/g$c;->b:LXb/g;

    invoke-static {v0}, LXb/g;->u(LXb/g;)Lm2/q;

    move-result-object v0

    invoke-virtual {v0}, Lm2/q;->e()V

    :try_start_0
    iget-object v0, v1, LXb/g$c;->b:LXb/g;

    invoke-static {v0}, LXb/g;->u(LXb/g;)Lm2/q;

    move-result-object v0

    iget-object v2, v1, LXb/g$c;->a:Lm2/t;

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v0, v2, v3, v4}, Lp2/b;->b(Lm2/q;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    const-string/jumbo v0, "id"

    invoke-static {v2, v0}, Lp2/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    const-string/jumbo v3, "serverId"

    invoke-static {v2, v3}, Lp2/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    const-string/jumbo v5, "unifiControllerId"

    invoke-static {v2, v5}, Lp2/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v5

    const-string/jumbo v6, "timestamp"

    invoke-static {v2, v6}, Lp2/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v6

    const-string/jumbo v7, "resultId"

    invoke-static {v2, v7}, Lp2/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v7

    const-string/jumbo v8, "connection_type"

    invoke-static {v2, v8}, Lp2/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v8

    const-string/jumbo v9, "ssid"

    invoke-static {v2, v9}, Lp2/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    const-string/jumbo v10, "topology"

    invoke-static {v2, v10}, Lp2/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v10

    const-string/jumbo v11, "ap_name"

    invoke-static {v2, v11}, Lp2/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v11

    const-string/jumbo v12, "wifi_mode"

    invoke-static {v2, v12}, Lp2/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v12

    const-string/jumbo v13, "signal"

    invoke-static {v2, v13}, Lp2/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v13

    const-string/jumbo v14, "signalAP"

    invoke-static {v2, v14}, Lp2/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v14

    const-string/jumbo v15, "band_id"

    invoke-static {v2, v15}, Lp2/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v15

    const-string/jumbo v4, "channel"

    invoke-static {v2, v4}, Lp2/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4

    move/from16 v16, v4

    const-string/jumbo v4, "channel_width"

    invoke-static {v2, v4}, Lp2/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4

    move/from16 v17, v4

    const-string/jumbo v4, "rate_download"

    invoke-static {v2, v4}, Lp2/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4

    move/from16 v18, v4

    const-string/jumbo v4, "rate_upload"

    invoke-static {v2, v4}, Lp2/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4

    move/from16 v19, v4

    const-string/jumbo v4, "wifi_experience"

    invoke-static {v2, v4}, Lp2/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4

    move/from16 v20, v4

    const-string/jumbo v4, "dns_servers"

    invoke-static {v2, v4}, Lp2/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4

    move/from16 v21, v4

    new-instance v4, Lo/t;

    invoke-direct {v4}, Lo/t;-><init>()V

    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v22

    if-eqz v22, :cond_1

    move/from16 v22, v14

    move/from16 v23, v15

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v14

    invoke-virtual {v4, v14, v15}, Lo/t;->d(J)Z

    move-result v24

    if-nez v24, :cond_0

    move/from16 v24, v13

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v4, v14, v15, v13}, Lo/t;->k(JLjava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_1b

    :cond_0
    move/from16 v24, v13

    :goto_1
    move/from16 v14, v22

    move/from16 v15, v23

    move/from16 v13, v24

    goto :goto_0

    :cond_1
    move/from16 v24, v13

    move/from16 v22, v14

    move/from16 v23, v15

    const/4 v13, -0x1

    invoke-interface {v2, v13}, Landroid/database/Cursor;->moveToPosition(I)Z

    iget-object v13, v1, LXb/g$c;->b:LXb/g;

    invoke-static {v13, v4}, LXb/g;->w(LXb/g;Lo/t;)V

    new-instance v13, Ljava/util/ArrayList;

    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    move-result v14

    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    :goto_2
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v14

    if-eqz v14, :cond_12

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v26

    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v14

    if-eqz v14, :cond_2

    const/16 v28, 0x0

    goto :goto_3

    :cond_2
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v14

    move-object/from16 v28, v14

    :goto_3
    invoke-interface {v2, v5}, Landroid/database/Cursor;->isNull(I)Z

    move-result v14

    if-eqz v14, :cond_3

    const/16 v29, 0x0

    goto :goto_4

    :cond_3
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v14

    move-object/from16 v29, v14

    :goto_4
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v30

    new-instance v14, LXb/b;

    move-object/from16 v25, v14

    invoke-direct/range {v25 .. v31}, LXb/b;-><init>(JLjava/lang/String;Ljava/lang/String;J)V

    invoke-interface {v2, v7}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v33

    invoke-interface {v2, v8}, Landroid/database/Cursor;->isNull(I)Z

    move-result v15

    if-eqz v15, :cond_4

    const/16 v35, 0x0

    goto :goto_5

    :cond_4
    invoke-interface {v2, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v35, v15

    :goto_5
    invoke-interface {v2, v9}, Landroid/database/Cursor;->isNull(I)Z

    move-result v15

    if-eqz v15, :cond_5

    const/16 v36, 0x0

    goto :goto_6

    :cond_5
    invoke-interface {v2, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v36, v15

    :goto_6
    invoke-interface {v2, v10}, Landroid/database/Cursor;->isNull(I)Z

    move-result v15

    if-eqz v15, :cond_6

    const/16 v37, 0x0

    goto :goto_7

    :cond_6
    invoke-interface {v2, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v37, v15

    :goto_7
    invoke-interface {v2, v11}, Landroid/database/Cursor;->isNull(I)Z

    move-result v15

    if-eqz v15, :cond_7

    const/16 v38, 0x0

    goto :goto_8

    :cond_7
    invoke-interface {v2, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v38, v15

    :goto_8
    invoke-interface {v2, v12}, Landroid/database/Cursor;->isNull(I)Z

    move-result v15

    if-eqz v15, :cond_8

    move/from16 v15, v24

    const/16 v39, 0x0

    goto :goto_9

    :cond_8
    invoke-interface {v2, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v39, v15

    move/from16 v15, v24

    :goto_9
    invoke-interface {v2, v15}, Landroid/database/Cursor;->isNull(I)Z

    move-result v24

    if-eqz v24, :cond_9

    const/16 v40, 0x0

    :goto_a
    move/from16 v49, v22

    move/from16 v22, v3

    move/from16 v3, v49

    goto :goto_b

    :cond_9
    invoke-interface {v2, v15}, Landroid/database/Cursor;->getInt(I)I

    move-result v24

    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v24

    move-object/from16 v40, v24

    goto :goto_a

    :goto_b
    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v24

    if-eqz v24, :cond_a

    const/16 v41, 0x0

    :goto_c
    move/from16 v49, v23

    move/from16 v23, v3

    move/from16 v3, v49

    goto :goto_d

    :cond_a
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v24

    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v24

    move-object/from16 v41, v24

    goto :goto_c

    :goto_d
    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v24

    if-eqz v24, :cond_b

    const/16 v42, 0x0

    :goto_e
    move/from16 v49, v16

    move/from16 v16, v3

    move/from16 v3, v49

    goto :goto_f

    :cond_b
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v24

    move-object/from16 v42, v24

    goto :goto_e

    :goto_f
    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v24

    if-eqz v24, :cond_c

    const/16 v43, 0x0

    :goto_10
    move/from16 v49, v17

    move/from16 v17, v3

    move/from16 v3, v49

    goto :goto_11

    :cond_c
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v24

    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v24

    move-object/from16 v43, v24

    goto :goto_10

    :goto_11
    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v24

    if-eqz v24, :cond_d

    const/16 v44, 0x0

    :goto_12
    move/from16 v49, v18

    move/from16 v18, v3

    move/from16 v3, v49

    goto :goto_13

    :cond_d
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v24

    move-object/from16 v44, v24

    goto :goto_12

    :goto_13
    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v24

    if-eqz v24, :cond_e

    const/16 v45, 0x0

    :goto_14
    move/from16 v49, v19

    move/from16 v19, v3

    move/from16 v3, v49

    goto :goto_15

    :cond_e
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v24

    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v24

    move-object/from16 v45, v24

    goto :goto_14

    :goto_15
    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v24

    if-eqz v24, :cond_f

    const/16 v46, 0x0

    :goto_16
    move/from16 v49, v20

    move/from16 v20, v3

    move/from16 v3, v49

    goto :goto_17

    :cond_f
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v24

    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v24

    move-object/from16 v46, v24

    goto :goto_16

    :goto_17
    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v24

    if-eqz v24, :cond_10

    const/16 v47, 0x0

    :goto_18
    move/from16 v49, v21

    move/from16 v21, v3

    move/from16 v3, v49

    goto :goto_19

    :cond_10
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getFloat(I)F

    move-result v24

    invoke-static/range {v24 .. v24}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v24

    move-object/from16 v47, v24

    goto :goto_18

    :goto_19
    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v24

    if-eqz v24, :cond_11

    move/from16 v25, v3

    move/from16 v24, v5

    const/4 v3, 0x0

    goto :goto_1a

    :cond_11
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v24

    move/from16 v25, v3

    move-object/from16 v3, v24

    move/from16 v24, v5

    :goto_1a
    iget-object v5, v1, LXb/g$c;->b:LXb/g;

    invoke-static {v5}, LXb/g;->v(LXb/g;)Lcom/ui/wifiman/db/A;

    move-result-object v5

    invoke-virtual {v5, v3}, Lcom/ui/wifiman/db/A;->c(Ljava/lang/String;)Ljava/util/List;

    move-result-object v48

    new-instance v3, LXb/a;

    move-object/from16 v32, v3

    invoke-direct/range {v32 .. v48}, LXb/a;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/List;)V

    move/from16 v26, v6

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Lo/t;->e(J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/ArrayList;

    new-instance v6, LXb/d;

    invoke-direct {v6, v14, v3, v5}, LXb/d;-><init>(LXb/b;LXb/a;Ljava/util/List;)V

    invoke-interface {v13, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move/from16 v3, v22

    move/from16 v22, v23

    move/from16 v5, v24

    move/from16 v6, v26

    move/from16 v24, v15

    move/from16 v23, v16

    move/from16 v16, v17

    move/from16 v17, v18

    move/from16 v18, v19

    move/from16 v19, v20

    move/from16 v20, v21

    move/from16 v21, v25

    goto/16 :goto_2

    :cond_12
    iget-object v0, v1, LXb/g$c;->b:LXb/g;

    invoke-static {v0}, LXb/g;->u(LXb/g;)Lm2/q;

    move-result-object v0

    invoke-virtual {v0}, Lm2/q;->A()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-interface {v2}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iget-object v0, v1, LXb/g$c;->b:LXb/g;

    invoke-static {v0}, LXb/g;->u(LXb/g;)Lm2/q;

    move-result-object v0

    invoke-virtual {v0}, Lm2/q;->i()V

    return-object v13

    :catchall_1
    move-exception v0

    goto :goto_1c

    :goto_1b
    :try_start_3
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_1c
    iget-object v2, v1, LXb/g$c;->b:LXb/g;

    invoke-static {v2}, LXb/g;->u(LXb/g;)Lm2/q;

    move-result-object v2

    invoke-virtual {v2}, Lm2/q;->i()V

    throw v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LXb/g$c;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected finalize()V
    .locals 1

    iget-object v0, p0, LXb/g$c;->a:Lm2/t;

    invoke-virtual {v0}, Lm2/t;->s()V

    return-void
.end method
