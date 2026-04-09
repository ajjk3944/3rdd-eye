.class public final Lcom/ui/wifiman/db/B$i;
.super Ln2/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/db/B;->k()Ln2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 2

    const/16 v0, 0x12

    const/16 v1, 0x13

    invoke-direct {p0, v0, v1}, Ln2/a;-><init>(II)V

    return-void
.end method


# virtual methods
.method public a(Landroidx/sqlite/db/SupportSQLiteDatabase;)V
    .locals 35

    move-object/from16 v1, p1

    const-string/jumbo v0, "timestamp"

    const-string/jumbo v2, "uploadBits"

    const-string/jumbo v3, "downloadBits"

    const-string/jumbo v4, "latency"

    const-string/jumbo v5, "server_location_country"

    const-string/jumbo v6, "server_location_city"

    const-string/jumbo v7, "server_provider_url"

    const-string/jumbo v8, "server_provider"

    const-string/jumbo v9, "speedTestServerIP"

    const-string/jumbo v10, "connection_type"

    const-string/jumbo v11, "ssid"

    const-string/jumbo v12, "id"

    const-string/jumbo v13, "db"

    invoke-static {v1, v13}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "DB Migration 19 started"

    const/4 v14, 0x0

    const/4 v15, 0x2

    invoke-static {v13, v14, v15, v14}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "CREATE TABLE `"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v14, "speedTestResulttemp"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v15, "` (`id` INTEGER NOT NULL, `ssid` TEXT, `connection_type` TEXT, `speedTestServerIP` TEXT NOT NULL, `server_provider` TEXT, `server_provider_url` TEXT, `server_location_city` TEXT, `server_location_country` TEXT, `latency` INTEGER, `downloadBits` INTEGER, `uploadBits` INTEGER, `timestamp` INTEGER NOT NULL, `topology` TEXT, `ap_name` TEXT, `wifi_mode` TEXT, `signal` INTEGER, `channel` INTEGER, `channel_width` TEXT, `rate_download` INTEGER, `rate_upload` INTEGER, `speedtest_type` TEXT NOT NULL, `wifi_experience` REAL, PRIMARY KEY(`id`))"

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v1, v13}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "CREATED "

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    move-object/from16 v17, v14

    const/4 v14, 0x2

    const/4 v15, 0x0

    invoke-static {v13, v15, v14, v15}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    const-string/jumbo v13, "SELECT * FROM speedTestResult"

    invoke-interface {v1, v13}, Landroidx/sqlite/db/SupportSQLiteDatabase;->query(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v14

    :try_start_0
    invoke-interface {v14}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v16

    if-eqz v16, :cond_a

    move-object/from16 v18, v13

    const-string/jumbo v13, "There is stuff to migrate"

    const/4 v1, 0x2

    invoke-static {v13, v15, v1, v15}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-interface {v14, v12}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v14, v11}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v13

    invoke-interface {v14, v10}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v15

    move-object/from16 v19, v10

    invoke-interface {v14, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    move-object/from16 v20, v9

    invoke-interface {v14, v8}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v9

    move-object/from16 v21, v8

    invoke-interface {v14, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    move-object/from16 v22, v7

    invoke-interface {v14, v6}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v7

    move-object/from16 v23, v6

    invoke-interface {v14, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v6

    move-object/from16 v24, v5

    invoke-interface {v14, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    move-object/from16 v25, v4

    invoke-interface {v14, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    move-object/from16 v26, v3

    invoke-interface {v14, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    move-object/from16 v27, v2

    invoke-interface {v14, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_e

    move-object/from16 v28, v0

    :goto_0
    :try_start_1
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    invoke-interface {v14, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v29
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_c

    move/from16 v31, v1

    :try_start_2
    invoke-static/range {v29 .. v30}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v12, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-interface {v14, v13}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v14, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v11, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :catchall_0
    :goto_1
    move-object/from16 v29, v11

    move-object/from16 v11, v19

    :catchall_1
    move/from16 v19, v10

    move-object/from16 v10, v20

    :catchall_2
    move/from16 v20, v9

    move-object/from16 v9, v21

    :catchall_3
    move/from16 v21, v8

    move-object/from16 v8, v22

    :catchall_4
    move/from16 v22, v7

    move-object/from16 v7, v23

    :catchall_5
    move/from16 v23, v6

    move-object/from16 v6, v24

    :catchall_6
    move/from16 v24, v5

    move-object/from16 v5, v25

    :catchall_7
    move/from16 v25, v4

    move-object/from16 v4, v26

    :catchall_8
    move/from16 v26, v3

    move-object/from16 v3, v17

    move-object/from16 v17, v27

    move/from16 v27, v2

    move-object/from16 v2, p1

    goto/16 :goto_c

    :cond_0
    :goto_2
    invoke-interface {v14, v15}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {v14, v15}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object/from16 v29, v11

    move-object/from16 v11, v19

    :try_start_3
    invoke-virtual {v0, v11, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :cond_1
    move-object/from16 v29, v11

    move-object/from16 v11, v19

    :goto_3
    invoke-interface {v14, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move/from16 v19, v10

    move-object/from16 v10, v20

    :try_start_4
    invoke-virtual {v0, v10, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v14, v9}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-interface {v14, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    move/from16 v20, v9

    move-object/from16 v9, v21

    :try_start_5
    invoke-virtual {v0, v9, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    :cond_2
    move/from16 v20, v9

    move-object/from16 v9, v21

    :goto_4
    invoke-interface {v14, v8}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-interface {v14, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    move/from16 v21, v8

    move-object/from16 v8, v22

    :try_start_6
    invoke-virtual {v0, v8, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    :cond_3
    move/from16 v21, v8

    move-object/from16 v8, v22

    :goto_5
    invoke-interface {v14, v7}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-interface {v14, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    move/from16 v22, v7

    move-object/from16 v7, v23

    :try_start_7
    invoke-virtual {v0, v7, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_6

    :cond_4
    move/from16 v22, v7

    move-object/from16 v7, v23

    :goto_6
    invoke-interface {v14, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-nez v1, :cond_5

    invoke-interface {v14, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    move/from16 v23, v6

    move-object/from16 v6, v24

    :try_start_8
    invoke-virtual {v0, v6, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_7

    :cond_5
    move/from16 v23, v6

    move-object/from16 v6, v24

    :goto_7
    invoke-interface {v14, v5}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-nez v1, :cond_6

    invoke-interface {v14, v5}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v32

    invoke-static/range {v32 .. v33}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    move/from16 v24, v5

    move-object/from16 v5, v25

    :try_start_9
    invoke-virtual {v0, v5, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    goto :goto_8

    :cond_6
    move/from16 v24, v5

    move-object/from16 v5, v25

    :goto_8
    invoke-interface {v14, v4}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-nez v1, :cond_7

    invoke-interface {v14, v4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v32

    invoke-static/range {v32 .. v33}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    move/from16 v25, v4

    move-object/from16 v4, v26

    :try_start_a
    invoke-virtual {v0, v4, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    goto :goto_9

    :cond_7
    move/from16 v25, v4

    move-object/from16 v4, v26

    :goto_9
    invoke-interface {v14, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-nez v1, :cond_8

    invoke-interface {v14, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v32

    invoke-static/range {v32 .. v33}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    move/from16 v26, v3

    move-object/from16 v3, v27

    :try_start_b
    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    goto :goto_b

    :catchall_9
    move/from16 v27, v2

    :catchall_a
    :goto_a
    move-object/from16 v2, p1

    move-object/from16 v34, v17

    move-object/from16 v17, v3

    move-object/from16 v3, v34

    goto :goto_c

    :cond_8
    move/from16 v26, v3

    move-object/from16 v3, v27

    :goto_b
    invoke-interface {v14, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v32

    invoke-static/range {v32 .. v33}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    move/from16 v27, v2

    move-object/from16 v2, v28

    :try_start_c
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string/jumbo v1, "speedtest_type"
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_b

    move-object/from16 v28, v2

    :try_start_d
    const-string/jumbo v2, "internet"

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, LYg/J;->a:LYg/J;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_a

    const/4 v1, 0x5

    move-object/from16 v2, p1

    move-object/from16 v34, v17

    move-object/from16 v17, v3

    move-object/from16 v3, v34

    :try_start_e
    invoke-interface {v2, v3, v1, v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->insert(Ljava/lang/String;ILandroid/content/ContentValues;)J
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_d

    goto :goto_c

    :catchall_b
    move-object/from16 v28, v2

    goto :goto_a

    :catchall_c
    move/from16 v31, v1

    goto/16 :goto_1

    :catchall_d
    :goto_c
    :try_start_f
    invoke-interface {v14}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_d

    :cond_9
    move/from16 v2, v27

    move/from16 v1, v31

    move-object/from16 v27, v17

    move-object/from16 v17, v3

    move/from16 v3, v26

    move-object/from16 v26, v4

    move/from16 v4, v25

    move-object/from16 v25, v5

    move/from16 v5, v24

    move-object/from16 v24, v6

    move/from16 v6, v23

    move-object/from16 v23, v7

    move/from16 v7, v22

    move-object/from16 v22, v8

    move/from16 v8, v21

    move-object/from16 v21, v9

    move/from16 v9, v20

    move-object/from16 v20, v10

    move/from16 v10, v19

    move-object/from16 v19, v11

    move-object/from16 v11, v29

    goto/16 :goto_0

    :catchall_e
    move-exception v0

    move-object v1, v0

    goto :goto_f

    :cond_a
    move-object v2, v1

    move-object/from16 v18, v13

    move-object/from16 v3, v17

    :goto_d
    sget-object v0, LYg/J;->a:LYg/J;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_e

    const/4 v1, 0x0

    invoke-static {v14, v1}, Ljh/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    const-string v4, "DROP TABLE IF EXISTS speedTestResult"

    invoke-interface {v2, v4}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v5, "DB DROPPED table speedTestResult"

    const/4 v6, 0x2

    invoke-static {v5, v1, v6, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ALTER TABLE "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " RENAME TO speedTestResult"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DB RENAMED table "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " to speedTestResult"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v3, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    move-object/from16 v0, v18

    :try_start_10
    invoke-interface {v2, v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->query(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3
    :try_end_10
    .catch Landroid/database/sqlite/SQLiteBlobTooBigException; {:try_start_10 .. :try_end_10} :catch_0

    :try_start_11
    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_f

    :try_start_12
    invoke-static {v3, v1}, Ljh/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_12
    .catch Landroid/database/sqlite/SQLiteBlobTooBigException; {:try_start_12 .. :try_end_12} :catch_0

    const/4 v1, 0x0

    const/4 v2, 0x2

    goto :goto_e

    :catchall_f
    move-exception v0

    move-object v1, v0

    :try_start_13
    throw v1
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_10

    :catchall_10
    move-exception v0

    move-object v6, v0

    :try_start_14
    invoke-static {v3, v1}, Ljh/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v6
    :try_end_14
    .catch Landroid/database/sqlite/SQLiteBlobTooBigException; {:try_start_14 .. :try_end_14} :catch_0

    :catch_0
    invoke-interface {v2, v4}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v5, v1, v2, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    :goto_e
    const-string v0, "DB Migration 19 finished"

    invoke-static {v0, v1, v2, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void

    :goto_f
    :try_start_15
    throw v1
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_11

    :catchall_11
    move-exception v0

    move-object v2, v0

    invoke-static {v14, v1}, Ljh/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
.end method
