.class public final Lcom/ui/wifiman/db/B$u;
.super Ln2/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/db/B;->w()Ln2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 2

    const/16 v0, 0x1d

    const/16 v1, 0x1e

    invoke-direct {p0, v0, v1}, Ln2/a;-><init>(II)V

    return-void
.end method


# virtual methods
.method public a(Landroidx/sqlite/db/SupportSQLiteDatabase;)V
    .locals 80

    move-object/from16 v0, p1

    const-string/jumbo v1, "resultId"

    const-string/jumbo v2, "endpoint_type"

    const-string/jumbo v3, "serverId"

    const-string/jumbo v4, "server_a2a_device_type"

    const-string/jumbo v5, "server_wifi_experience"

    const-string/jumbo v6, "server_product"

    const-string/jumbo v7, "server_product_image_engine"

    const-string/jumbo v8, "server_product_id"

    const-string/jumbo v9, "server_name"

    const-string/jumbo v10, "dns_servers"

    const-string/jumbo v11, "wifi_experience"

    const-string/jumbo v12, "speedtest_type"

    const-string/jumbo v13, "rate_upload"

    const-string/jumbo v14, "rate_download"

    const-string/jumbo v15, "channel_width"

    move-object/from16 v16, v1

    const-string/jumbo v1, "channel"

    move-object/from16 v17, v2

    const-string/jumbo v2, "signal"

    move-object/from16 v18, v3

    const-string/jumbo v3, "wifi_mode"

    move-object/from16 v19, v4

    const-string/jumbo v4, "ap_name"

    move-object/from16 v20, v5

    const-string/jumbo v5, "topology"

    move-object/from16 v21, v6

    const-string/jumbo v6, "timestamp"

    move-object/from16 v22, v7

    const-string/jumbo v7, "uploadBits"

    move-object/from16 v23, v8

    const-string/jumbo v8, "downloadBits"

    move-object/from16 v24, v9

    const-string/jumbo v9, "latency"

    move-object/from16 v25, v10

    const-string/jumbo v10, "server_location_country"

    move-object/from16 v26, v11

    const-string/jumbo v11, "server_location_city"

    move-object/from16 v27, v12

    const-string/jumbo v12, "server_provider_url"

    move-object/from16 v28, v13

    const-string/jumbo v13, "server_provider"

    move-object/from16 v29, v14

    const-string/jumbo v14, "connection_type"

    move-object/from16 v30, v15

    const-string/jumbo v15, "ssid"

    move-object/from16 v31, v1

    const-string/jumbo v1, "id"

    move-object/from16 v32, v2

    const-string/jumbo v2, "db"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v33

    const-string v2, "CREATE TABLE IF NOT EXISTS `speedTestId` (`id` INTEGER NOT NULL, `serverId` TEXT, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`id`))"

    invoke-interface {v0, v2}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v2, "CREATE INDEX index_timestamp ON speedTestId (timestamp)"

    invoke-interface {v0, v2}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v2, "CREATE TABLE IF NOT EXISTS `speedTestEnv` (`resultId` INTEGER NOT NULL, `connection_type` TEXT, `ssid` TEXT, `topology` TEXT, `ap_name` TEXT, `wifi_mode` TEXT, `signal` INTEGER, `channel` INTEGER, `channel_width` TEXT, `rate_download` INTEGER, `rate_upload` INTEGER, `wifi_experience` REAL, `dns_servers` TEXT, PRIMARY KEY(`resultId`))"

    invoke-interface {v0, v2}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v2, "CREATE INDEX index_connectionType ON speedTestEnv (connection_type)"

    invoke-interface {v0, v2}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v2, "CREATE INDEX index_ssid ON speedTestEnv (ssid)"

    invoke-interface {v0, v2}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v2, "CREATE INDEX index_connTypeAndSsid ON speedTestEnv (connection_type,ssid)"

    invoke-interface {v0, v2}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v2, "CREATE TABLE IF NOT EXISTS `speedTestMeasurement` (`id` INTEGER NOT NULL, `resultId` INTEGER NOT NULL, `speedtest_type` TEXT NOT NULL, `latency` INTEGER, `downloadBits` INTEGER, `uploadBits` INTEGER, `endpoint_type` TEXT NOT NULL, `server_ip` TEXT NOT NULL, `server_name` TEXT, `server_provider` TEXT, `server_provider_url` TEXT, `server_location_city` TEXT, `server_location_country` TEXT, `server_product_id` INTEGER, `server_product_image_engine` INTEGER, `server_product` TEXT, `server_wifi_experience` INTEGER, `server_a2a_device_type` TEXT, PRIMARY KEY(`id`))"

    invoke-interface {v0, v2}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v2, "CREATE INDEX index_resultId ON speedTestMeasurement (resultId)"

    invoke-interface {v0, v2}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string/jumbo v2, "SELECT * FROM speedTestResult"

    invoke-interface {v0, v2}, Landroidx/sqlite/db/SupportSQLiteDatabase;->query(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    :try_start_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v35

    const/4 v0, 0x0

    if-eqz v35, :cond_1c

    move-object/from16 v35, v3

    const-string/jumbo v3, "There is stuff to migrate"

    move-object/from16 v37, v4

    const/4 v4, 0x2

    invoke-static {v3, v0, v4, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-interface {v2, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v2, v15}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v2, v14}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v38, v15

    const-string/jumbo v15, "speedTestServerIP"

    invoke-interface {v2, v15}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v15

    move/from16 v39, v15

    invoke-interface {v2, v13}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v15

    move-object/from16 v40, v13

    invoke-interface {v2, v12}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v13

    move-object/from16 v41, v12

    invoke-interface {v2, v11}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v12

    move-object/from16 v42, v11

    invoke-interface {v2, v10}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v11

    move-object/from16 v43, v10

    invoke-interface {v2, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    move/from16 v44, v11

    invoke-interface {v2, v8}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v11

    move/from16 v45, v12

    invoke-interface {v2, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v12

    move/from16 v46, v13

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v13

    move/from16 v47, v15

    invoke-interface {v2, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v15

    move-object/from16 v48, v7

    move-object/from16 v7, v37

    move/from16 v37, v12

    invoke-interface {v2, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v12

    move-object/from16 v49, v8

    move-object/from16 v8, v35

    move/from16 v35, v11

    invoke-interface {v2, v8}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v11

    move-object/from16 v50, v9

    move-object/from16 v9, v32

    move/from16 v32, v10

    invoke-interface {v2, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    move-object/from16 v51, v9

    move-object/from16 v9, v31

    move/from16 v31, v10

    invoke-interface {v2, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    move-object/from16 v52, v9

    move-object/from16 v9, v30

    move/from16 v30, v10

    invoke-interface {v2, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    move-object/from16 v53, v9

    move-object/from16 v9, v29

    move/from16 v29, v10

    invoke-interface {v2, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    move-object/from16 v54, v9

    move-object/from16 v9, v28

    move/from16 v28, v10

    invoke-interface {v2, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    move-object/from16 v55, v9

    move-object/from16 v9, v27

    move/from16 v27, v10

    invoke-interface {v2, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    move-object/from16 v56, v9

    move-object/from16 v9, v26

    move/from16 v26, v10

    invoke-interface {v2, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    move-object/from16 v57, v9

    move-object/from16 v9, v25

    move/from16 v25, v10

    invoke-interface {v2, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    move-object/from16 v58, v9

    move-object/from16 v9, v24

    move/from16 v24, v10

    invoke-interface {v2, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    move-object/from16 v59, v9

    move-object/from16 v9, v23

    move/from16 v23, v10

    invoke-interface {v2, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    move-object/from16 v60, v9

    move-object/from16 v9, v22

    move/from16 v22, v10

    invoke-interface {v2, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    move-object/from16 v61, v9

    move-object/from16 v9, v21

    move/from16 v21, v10

    invoke-interface {v2, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    move-object/from16 v62, v9

    move-object/from16 v9, v20

    move/from16 v20, v10

    invoke-interface {v2, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    move-object/from16 v63, v9

    move-object/from16 v9, v19

    move/from16 v19, v10

    invoke-interface {v2, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    move-object/from16 v64, v9

    move-object/from16 v9, v18

    move/from16 v18, v10

    invoke-interface {v2, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    move-object/from16 v65, v8

    move-object/from16 v8, v17

    move/from16 v17, v11

    invoke-interface {v2, v8}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v11

    :goto_0
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v66

    move/from16 v68, v3

    const-string/jumbo v3, "speedTestId"

    move-object/from16 v69, v8

    new-instance v8, Landroid/content/ContentValues;

    invoke-direct {v8}, Landroid/content/ContentValues;-><init>()V

    move/from16 v70, v11

    invoke-static/range {v66 .. v67}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    invoke-virtual {v8, v1, v11}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-interface {v2, v10}, Landroid/database/Cursor;->isNull(I)Z

    move-result v11

    if-nez v11, :cond_0

    invoke-interface {v2, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v8, v9, v11}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v1, v0

    goto/16 :goto_30

    :cond_0
    :goto_1
    invoke-interface {v2, v13}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v71

    invoke-static/range {v71 .. v72}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    invoke-virtual {v8, v6, v11}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    sget-object v11, LYg/J;->a:LYg/J;

    move-object/from16 v11, p1

    move-object/from16 v36, v1

    const/4 v1, 0x2

    invoke-interface {v11, v3, v1, v8}, Landroidx/sqlite/db/SupportSQLiteDatabase;->insert(Ljava/lang/String;ILandroid/content/ContentValues;)J

    const-string/jumbo v3, "speedTestEnv"

    new-instance v8, Landroid/content/ContentValues;

    invoke-direct {v8}, Landroid/content/ContentValues;-><init>()V

    invoke-static/range {v66 .. v67}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    move-object/from16 v72, v6

    move-object/from16 v6, v16

    invoke-virtual {v8, v6, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v14, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-interface {v2, v4}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-interface {v2, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    move/from16 v16, v0

    move-object/from16 v0, v38

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    move/from16 v16, v0

    move-object/from16 v0, v38

    :goto_2
    invoke-interface {v2, v15}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-interface {v2, v15}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v5, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    invoke-interface {v2, v12}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-interface {v2, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v7, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    move/from16 v1, v17

    invoke-interface {v2, v1}, Landroid/database/Cursor;->isNull(I)Z

    move-result v17

    if-nez v17, :cond_5

    move-object/from16 v38, v0

    invoke-interface {v2, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move/from16 v17, v1

    move-object/from16 v1, v65

    invoke-virtual {v8, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :goto_3
    move/from16 v0, v31

    goto :goto_4

    :cond_5
    move-object/from16 v38, v0

    move/from16 v17, v1

    move-object/from16 v1, v65

    goto :goto_3

    :goto_4
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v31

    if-nez v31, :cond_6

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v31

    move/from16 v65, v0

    invoke-static/range {v31 .. v31}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v31, v1

    move-object/from16 v1, v51

    invoke-virtual {v8, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    :goto_5
    move/from16 v0, v30

    goto :goto_6

    :cond_6
    move/from16 v65, v0

    move-object/from16 v31, v1

    move-object/from16 v1, v51

    goto :goto_5

    :goto_6
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v30

    if-nez v30, :cond_7

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v30

    move/from16 v51, v0

    invoke-static/range {v30 .. v30}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v30, v1

    move-object/from16 v1, v52

    invoke-virtual {v8, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    :goto_7
    move/from16 v0, v29

    goto :goto_8

    :cond_7
    move/from16 v51, v0

    move-object/from16 v30, v1

    move-object/from16 v1, v52

    goto :goto_7

    :goto_8
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v29

    if-nez v29, :cond_8

    move-object/from16 v52, v1

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    move/from16 v29, v0

    move-object/from16 v0, v53

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :goto_9
    move/from16 v1, v28

    goto :goto_a

    :cond_8
    move/from16 v29, v0

    move-object/from16 v52, v1

    move-object/from16 v0, v53

    goto :goto_9

    :goto_a
    invoke-interface {v2, v1}, Landroid/database/Cursor;->isNull(I)Z

    move-result v28

    if-nez v28, :cond_9

    invoke-interface {v2, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v28

    move-object/from16 v53, v0

    invoke-static/range {v28 .. v28}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move/from16 v28, v1

    move-object/from16 v1, v54

    invoke-virtual {v8, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    :goto_b
    move/from16 v0, v27

    goto :goto_c

    :cond_9
    move-object/from16 v53, v0

    move/from16 v28, v1

    move-object/from16 v1, v54

    goto :goto_b

    :goto_c
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v27

    if-nez v27, :cond_a

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v27

    move/from16 v54, v0

    invoke-static/range {v27 .. v27}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v27, v1

    move-object/from16 v1, v55

    invoke-virtual {v8, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    :goto_d
    move/from16 v0, v25

    goto :goto_e

    :cond_a
    move/from16 v54, v0

    move-object/from16 v27, v1

    move-object/from16 v1, v55

    goto :goto_d

    :goto_e
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v25

    if-nez v25, :cond_b

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getFloat(I)F

    move-result v25

    move/from16 v55, v0

    invoke-static/range {v25 .. v25}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    move-object/from16 v25, v1

    move-object/from16 v1, v57

    invoke-virtual {v8, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Float;)V

    :goto_f
    move/from16 v0, v24

    goto :goto_10

    :cond_b
    move/from16 v55, v0

    move-object/from16 v25, v1

    move-object/from16 v1, v57

    goto :goto_f

    :goto_10
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v24

    if-nez v24, :cond_c

    move-object/from16 v57, v1

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    move/from16 v24, v0

    move-object/from16 v0, v58

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :goto_11
    const/4 v1, 0x2

    goto :goto_12

    :cond_c
    move/from16 v24, v0

    move-object/from16 v57, v1

    move-object/from16 v0, v58

    goto :goto_11

    :goto_12
    invoke-interface {v11, v3, v1, v8}, Landroidx/sqlite/db/SupportSQLiteDatabase;->insert(Ljava/lang/String;ILandroid/content/ContentValues;)J

    const-string/jumbo v1, "speedTestMeasurement"

    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    invoke-static/range {v66 .. v67}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v3, v6, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    move-object/from16 v58, v0

    move/from16 v8, v26

    invoke-interface {v2, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move/from16 v26, v4

    move-object/from16 v4, v56

    invoke-virtual {v3, v4, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    move/from16 v0, v32

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v32

    if-nez v32, :cond_d

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v32

    move/from16 v56, v0

    invoke-static/range {v32 .. v32}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v32, v4

    move-object/from16 v4, v50

    invoke-virtual {v3, v4, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    :goto_13
    move/from16 v0, v35

    goto :goto_14

    :cond_d
    move/from16 v56, v0

    move-object/from16 v32, v4

    move-object/from16 v4, v50

    goto :goto_13

    :goto_14
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v35

    if-nez v35, :cond_e

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v66

    move/from16 v35, v0

    invoke-static/range {v66 .. v67}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    move-object/from16 v50, v4

    move-object/from16 v4, v49

    invoke-virtual {v3, v4, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    :goto_15
    move/from16 v0, v37

    goto :goto_16

    :cond_e
    move/from16 v35, v0

    move-object/from16 v50, v4

    move-object/from16 v4, v49

    goto :goto_15

    :goto_16
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v37

    if-nez v37, :cond_f

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v66

    move/from16 v37, v0

    invoke-static/range {v66 .. v67}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    move-object/from16 v49, v4

    move-object/from16 v4, v48

    invoke-virtual {v3, v4, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    move-object/from16 v48, v4

    :goto_17
    move/from16 v0, v70

    goto :goto_18

    :cond_f
    move/from16 v37, v0

    move-object/from16 v49, v4

    goto :goto_17

    :goto_18
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    move/from16 v70, v0

    move-object/from16 v0, v69

    invoke-virtual {v3, v0, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    move/from16 v4, v39

    invoke-interface {v2, v4}, Landroid/database/Cursor;->isNull(I)Z

    move-result v39

    if-nez v39, :cond_10

    move-object/from16 v69, v0

    const-string/jumbo v0, "server_ip"

    move-object/from16 v39, v5

    invoke-interface {v2, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v0, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :goto_19
    move/from16 v0, v23

    goto :goto_1a

    :cond_10
    move-object/from16 v69, v0

    move-object/from16 v39, v5

    goto :goto_19

    :goto_1a
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v5

    if-nez v5, :cond_11

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    move/from16 v23, v0

    move-object/from16 v0, v59

    invoke-virtual {v3, v0, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1b
    move/from16 v5, v47

    goto :goto_1c

    :cond_11
    move/from16 v23, v0

    move-object/from16 v0, v59

    goto :goto_1b

    :goto_1c
    invoke-interface {v2, v5}, Landroid/database/Cursor;->isNull(I)Z

    move-result v47

    if-nez v47, :cond_12

    move-object/from16 v59, v0

    invoke-interface {v2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move/from16 v47, v4

    move-object/from16 v4, v40

    invoke-virtual {v3, v4, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1d
    move/from16 v0, v46

    goto :goto_1e

    :cond_12
    move-object/from16 v59, v0

    move/from16 v47, v4

    move-object/from16 v4, v40

    goto :goto_1d

    :goto_1e
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v40

    if-nez v40, :cond_13

    move-object/from16 v40, v4

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    move/from16 v46, v0

    move-object/from16 v0, v41

    invoke-virtual {v3, v0, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1f
    move/from16 v4, v45

    goto :goto_20

    :cond_13
    move/from16 v46, v0

    move-object/from16 v40, v4

    move-object/from16 v0, v41

    goto :goto_1f

    :goto_20
    invoke-interface {v2, v4}, Landroid/database/Cursor;->isNull(I)Z

    move-result v41

    if-nez v41, :cond_14

    move-object/from16 v41, v0

    invoke-interface {v2, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move/from16 v45, v4

    move-object/from16 v4, v42

    invoke-virtual {v3, v4, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :goto_21
    move/from16 v0, v44

    goto :goto_22

    :cond_14
    move-object/from16 v41, v0

    move/from16 v45, v4

    move-object/from16 v4, v42

    goto :goto_21

    :goto_22
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v42

    if-nez v42, :cond_15

    move-object/from16 v42, v4

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    move/from16 v44, v0

    move-object/from16 v0, v43

    invoke-virtual {v3, v0, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :goto_23
    move/from16 v4, v22

    goto :goto_24

    :cond_15
    move/from16 v44, v0

    move-object/from16 v42, v4

    move-object/from16 v0, v43

    goto :goto_23

    :goto_24
    invoke-interface {v2, v4}, Landroid/database/Cursor;->isNull(I)Z

    move-result v22

    if-nez v22, :cond_16

    invoke-interface {v2, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v22

    move-object/from16 v43, v0

    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move/from16 v22, v4

    move-object/from16 v4, v60

    invoke-virtual {v3, v4, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    :goto_25
    move/from16 v0, v21

    goto :goto_26

    :cond_16
    move-object/from16 v43, v0

    move/from16 v22, v4

    move-object/from16 v4, v60

    goto :goto_25

    :goto_26
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v21

    if-nez v21, :cond_17

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v21

    move/from16 v60, v0

    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v21, v4

    move-object/from16 v4, v61

    invoke-virtual {v3, v4, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    :goto_27
    move/from16 v0, v20

    goto :goto_28

    :cond_17
    move/from16 v60, v0

    move-object/from16 v21, v4

    move-object/from16 v4, v61

    goto :goto_27

    :goto_28
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v20

    if-nez v20, :cond_18

    move-object/from16 v61, v4

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    move/from16 v20, v0

    move-object/from16 v0, v62

    invoke-virtual {v3, v0, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :goto_29
    move/from16 v4, v19

    goto :goto_2a

    :cond_18
    move/from16 v20, v0

    move-object/from16 v61, v4

    move-object/from16 v0, v62

    goto :goto_29

    :goto_2a
    invoke-interface {v2, v4}, Landroid/database/Cursor;->isNull(I)Z

    move-result v19

    if-nez v19, :cond_19

    invoke-interface {v2, v4}, Landroid/database/Cursor;->getFloat(I)F

    move-result v19

    move-object/from16 v62, v0

    invoke-static/range {v19 .. v19}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    move/from16 v19, v4

    move-object/from16 v4, v63

    invoke-virtual {v3, v4, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Float;)V

    :goto_2b
    move/from16 v0, v18

    goto :goto_2c

    :cond_19
    move-object/from16 v62, v0

    move/from16 v19, v4

    move-object/from16 v4, v63

    goto :goto_2b

    :goto_2c
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v18

    if-nez v18, :cond_1a

    move-object/from16 v63, v4

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    move/from16 v18, v0

    move-object/from16 v0, v64

    invoke-virtual {v3, v0, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2d
    const/4 v4, 0x2

    goto :goto_2e

    :cond_1a
    move/from16 v18, v0

    move-object/from16 v63, v4

    move-object/from16 v0, v64

    goto :goto_2d

    :goto_2e
    invoke-interface {v11, v1, v4, v3}, Landroidx/sqlite/db/SupportSQLiteDatabase;->insert(Ljava/lang/String;ILandroid/content/ContentValues;)J

    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-nez v1, :cond_1b

    goto :goto_2f

    :cond_1b
    move-object/from16 v64, v0

    move/from16 v0, v16

    move/from16 v4, v26

    move-object/from16 v1, v36

    move/from16 v3, v68

    move/from16 v11, v70

    move-object/from16 v16, v6

    move/from16 v26, v8

    move-object/from16 v8, v69

    move-object/from16 v6, v72

    move/from16 v73, v47

    move/from16 v47, v5

    move-object/from16 v5, v39

    move/from16 v39, v73

    move/from16 v74, v60

    move-object/from16 v60, v21

    move/from16 v21, v74

    move/from16 v75, v55

    move-object/from16 v55, v25

    move/from16 v25, v75

    move/from16 v76, v54

    move-object/from16 v54, v27

    move/from16 v27, v76

    move/from16 v77, v51

    move-object/from16 v51, v30

    move/from16 v30, v77

    move/from16 v78, v65

    move-object/from16 v65, v31

    move/from16 v31, v78

    move/from16 v79, v56

    move-object/from16 v56, v32

    move/from16 v32, v79

    goto/16 :goto_0

    :cond_1c
    move-object/from16 v11, p1

    :goto_2f
    sget-object v0, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    invoke-static {v2, v0}, Ljh/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    const-string v1, "DROP TABLE IF EXISTS speedTestResult"

    invoke-interface {v11, v1}, Landroidx/sqlite/db/SupportSQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v1, "DB DROPPED table speedTestResult"

    const/4 v2, 0x2

    invoke-static {v1, v0, v2, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long v3, v3, v33

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "Update to DB version 30 took "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0, v2, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void

    :goto_30
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    move-object v3, v0

    invoke-static {v2, v1}, Ljh/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v3
.end method
