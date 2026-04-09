.class public final Lnx;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final f:[Llx;

.field public final g:Ll92;

.field public h:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;[Llx;Ll92;)V
    .locals 6

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v5, Lmx;

    .line 5
    .line 6
    invoke-direct {v5, p4, p3}, Lmx;-><init>(Ll92;[Llx;)V

    .line 7
    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/16 v4, 0xc

    .line 11
    .line 12
    move-object v0, p0

    .line 13
    move-object v1, p1

    .line 14
    move-object v2, p2

    .line 15
    invoke-direct/range {v0 .. v5}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;ILandroid/database/DatabaseErrorHandler;)V

    .line 16
    .line 17
    .line 18
    iput-object p4, v0, Lnx;->g:Ll92;

    .line 19
    .line 20
    iput-object p3, v0, Lnx;->f:[Llx;

    .line 21
    .line 22
    return-void
.end method

.method public static a([Llx;Landroid/database/sqlite/SQLiteDatabase;)Llx;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    aget-object v1, p0, v0

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    iget-object v1, v1, Llx;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Landroid/database/sqlite/SQLiteDatabase;

    .line 9
    .line 10
    if-ne v1, p1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance v1, Llx;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {v1, v2, p1}, Llx;-><init>(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    aput-object v1, p0, v0

    .line 20
    .line 21
    :goto_0
    aget-object p0, p0, v0

    .line 22
    .line 23
    return-object p0
.end method


# virtual methods
.method public final declared-synchronized c()Llx;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x0

    .line 3
    :try_start_0
    iput-boolean v0, p0, Lnx;->h:Z

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-boolean v1, p0, Lnx;->h:Z

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lnx;->close()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lnx;->c()Llx;

    .line 17
    .line 18
    .line 19
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    monitor-exit p0

    .line 21
    return-object v0

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    :try_start_1
    iget-object v1, p0, Lnx;->f:[Llx;

    .line 25
    .line 26
    invoke-static {v1, v0}, Lnx;->a([Llx;Landroid/database/sqlite/SQLiteDatabase;)Llx;

    .line 27
    .line 28
    .line 29
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    monitor-exit p0

    .line 31
    return-object v0

    .line 32
    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 33
    throw v0
.end method

.method public final declared-synchronized close()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lnx;->f:[Llx;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x0

    .line 9
    aput-object v2, v0, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    throw v0
.end method

.method public final onConfigure(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnx;->f:[Llx;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lnx;->a([Llx;Landroid/database/sqlite/SQLiteDatabase;)Llx;

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lnx;->g:Ll92;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lnx;->f:[Llx;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lnx;->a([Llx;Landroid/database/sqlite/SQLiteDatabase;)Llx;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lnx;->g:Ll92;

    .line 8
    .line 9
    iget-object v1, v0, Ll92;->g:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lvg0;

    .line 12
    .line 13
    const-string v2, "SELECT count(*) FROM sqlite_master WHERE name != \'android_metadata\'"

    .line 14
    .line 15
    invoke-virtual {p1, v2}, Llx;->p(Ljava/lang/String;)Landroid/database/Cursor;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :try_start_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/4 v4, 0x0

    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getInt(I)I

    .line 27
    .line 28
    .line 29
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    if-nez v3, :cond_0

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    goto :goto_3

    .line 36
    :cond_0
    move v3, v4

    .line 37
    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 38
    .line 39
    .line 40
    invoke-static {p1}, Lvg0;->h(Llx;)V

    .line 41
    .line 42
    .line 43
    if-nez v3, :cond_2

    .line 44
    .line 45
    invoke-static {p1}, Lvg0;->k(Llx;)Lqq0;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    iget-boolean v3, v2, Lqq0;->b:Z

    .line 50
    .line 51
    if-eqz v3, :cond_1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    const-string v1, "Pre-packaged database has an invalid schema: "

    .line 59
    .line 60
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    iget-object v1, v2, Lqq0;->a:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw p1

    .line 76
    :cond_2
    :goto_1
    invoke-virtual {v0, p1}, Ll92;->J(Llx;)V

    .line 77
    .line 78
    .line 79
    iget-object p1, v1, Lvg0;->g:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p1, Landroidx/work/impl/WorkDatabase_Impl;

    .line 82
    .line 83
    sget v0, Landroidx/work/impl/WorkDatabase_Impl;->s:I

    .line 84
    .line 85
    iget-object v0, p1, Lpq0;->g:Ljava/util/List;

    .line 86
    .line 87
    if-eqz v0, :cond_3

    .line 88
    .line 89
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    :goto_2
    if-ge v4, v0, :cond_3

    .line 94
    .line 95
    iget-object v1, p1, Lpq0;->g:Ljava/util/List;

    .line 96
    .line 97
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    check-cast v1, Ly91;

    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    add-int/lit8 v4, v4, 0x1

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_3
    return-void

    .line 110
    :goto_3
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 111
    .line 112
    .line 113
    throw p1
.end method

.method public final onDowngrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lnx;->h:Z

    .line 3
    .line 4
    iget-object v0, p0, Lnx;->f:[Llx;

    .line 5
    .line 6
    invoke-static {v0, p1}, Lnx;->a([Llx;Landroid/database/sqlite/SQLiteDatabase;)Llx;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v0, p0, Lnx;->g:Ll92;

    .line 11
    .line 12
    invoke-virtual {v0, p1, p2, p3}, Ll92;->G(Llx;II)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final onOpen(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 10

    .line 1
    iget-boolean v0, p0, Lnx;->h:Z

    .line 2
    .line 3
    if-nez v0, :cond_8

    .line 4
    .line 5
    iget-object v0, p0, Lnx;->g:Ll92;

    .line 6
    .line 7
    iget-object v1, p0, Lnx;->f:[Llx;

    .line 8
    .line 9
    invoke-static {v1, p1}, Lnx;->a([Llx;Landroid/database/sqlite/SQLiteDatabase;)Llx;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v1, v0, Ll92;->g:Ljava/lang/Object;

    .line 14
    .line 15
    const-string v1, "SELECT 1 FROM sqlite_master WHERE type = \'table\' AND name=\'room_master_table\'"

    .line 16
    .line 17
    invoke-virtual {p1, v1}, Llx;->p(Ljava/lang/String;)Landroid/database/Cursor;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v3, 0x1

    .line 26
    const/4 v4, 0x0

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-interface {v1, v4}, Landroid/database/Cursor;->getInt(I)I

    .line 30
    .line 31
    .line 32
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    move v2, v3

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    goto/16 :goto_7

    .line 39
    .line 40
    :cond_0
    move v2, v4

    .line 41
    :goto_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 42
    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    if-eqz v2, :cond_3

    .line 46
    .line 47
    new-instance v2, Lts3;

    .line 48
    .line 49
    const-string v5, "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"

    .line 50
    .line 51
    const/4 v6, 0x2

    .line 52
    invoke-direct {v2, v5, v6}, Lts3;-><init>(Ljava/lang/String;I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v2}, Llx;->o(Llz0;)Landroid/database/Cursor;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    :try_start_1
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-eqz v5, :cond_1

    .line 64
    .line 65
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 69
    goto :goto_1

    .line 70
    :catchall_1
    move-exception p1

    .line 71
    goto :goto_2

    .line 72
    :cond_1
    move-object v5, v1

    .line 73
    :goto_1
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 74
    .line 75
    .line 76
    const-string v2, "c103703e120ae8cc73c9248622f3cd1e"

    .line 77
    .line 78
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-nez v2, :cond_4

    .line 83
    .line 84
    const-string v2, "49f946663a8deb7054212b8adda248c6"

    .line 85
    .line 86
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-eqz v2, :cond_2

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 94
    .line 95
    const-string v0, "Room cannot verify the data integrity. Looks like you\'ve changed schema but forgot to update the version number. You can simply fix this by increasing the version number."

    .line 96
    .line 97
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw p1

    .line 101
    :goto_2
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 102
    .line 103
    .line 104
    throw p1

    .line 105
    :cond_3
    invoke-static {p1}, Lvg0;->k(Llx;)Lqq0;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    iget-boolean v5, v2, Lqq0;->b:Z

    .line 110
    .line 111
    if-eqz v5, :cond_7

    .line 112
    .line 113
    invoke-virtual {v0, p1}, Ll92;->J(Llx;)V

    .line 114
    .line 115
    .line 116
    :cond_4
    :goto_3
    iget-object v2, v0, Ll92;->g:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v2, Lvg0;

    .line 119
    .line 120
    iget-object v5, v2, Lvg0;->g:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v5, Landroidx/work/impl/WorkDatabase_Impl;

    .line 123
    .line 124
    sget v6, Landroidx/work/impl/WorkDatabase_Impl;->s:I

    .line 125
    .line 126
    iput-object p1, v5, Lpq0;->a:Llx;

    .line 127
    .line 128
    const-string v5, "PRAGMA foreign_keys = ON"

    .line 129
    .line 130
    invoke-virtual {p1, v5}, Llx;->m(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    iget-object v5, v2, Lvg0;->g:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v5, Landroidx/work/impl/WorkDatabase_Impl;

    .line 136
    .line 137
    iget-object v5, v5, Lpq0;->d:Lo30;

    .line 138
    .line 139
    monitor-enter v5

    .line 140
    :try_start_2
    iget-boolean v6, v5, Lo30;->e:Z

    .line 141
    .line 142
    if-eqz v6, :cond_5

    .line 143
    .line 144
    const-string v3, "ROOM"

    .line 145
    .line 146
    const-string v6, "Invalidation tracker is initialized twice :/."

    .line 147
    .line 148
    invoke-static {v3, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 149
    .line 150
    .line 151
    monitor-exit v5

    .line 152
    goto :goto_4

    .line 153
    :catchall_2
    move-exception p1

    .line 154
    goto :goto_6

    .line 155
    :cond_5
    const-string v6, "PRAGMA temp_store = MEMORY;"

    .line 156
    .line 157
    invoke-virtual {p1, v6}, Llx;->m(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    const-string v6, "PRAGMA recursive_triggers=\'ON\';"

    .line 161
    .line 162
    invoke-virtual {p1, v6}, Llx;->m(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    const-string v6, "CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)"

    .line 166
    .line 167
    invoke-virtual {p1, v6}, Llx;->m(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v5, p1}, Lo30;->c(Llx;)V

    .line 171
    .line 172
    .line 173
    const-string v6, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 "

    .line 174
    .line 175
    new-instance v7, Lpx;

    .line 176
    .line 177
    iget-object v8, p1, Llx;->g:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v8, Landroid/database/sqlite/SQLiteDatabase;

    .line 180
    .line 181
    invoke-virtual {v8, v6}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    invoke-direct {v7, v6}, Lpx;-><init>(Landroid/database/sqlite/SQLiteStatement;)V

    .line 186
    .line 187
    .line 188
    iput-object v7, v5, Lo30;->f:Lpx;

    .line 189
    .line 190
    iput-boolean v3, v5, Lo30;->e:Z

    .line 191
    .line 192
    monitor-exit v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 193
    :goto_4
    iget-object v3, v2, Lvg0;->g:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v3, Landroidx/work/impl/WorkDatabase_Impl;

    .line 196
    .line 197
    iget-object v3, v3, Lpq0;->g:Ljava/util/List;

    .line 198
    .line 199
    if-eqz v3, :cond_6

    .line 200
    .line 201
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    :goto_5
    if-ge v4, v3, :cond_6

    .line 206
    .line 207
    iget-object v5, v2, Lvg0;->g:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v5, Landroidx/work/impl/WorkDatabase_Impl;

    .line 210
    .line 211
    iget-object v5, v5, Lpq0;->g:Ljava/util/List;

    .line 212
    .line 213
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v5

    .line 217
    check-cast v5, Ly91;

    .line 218
    .line 219
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    invoke-virtual {p1}, Llx;->a()V

    .line 223
    .line 224
    .line 225
    :try_start_3
    sget v5, Landroidx/work/impl/WorkDatabase;->k:I

    .line 226
    .line 227
    new-instance v5, Ljava/lang/StringBuilder;

    .line 228
    .line 229
    const-string v6, "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < "

    .line 230
    .line 231
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 235
    .line 236
    .line 237
    move-result-wide v6

    .line 238
    sget-wide v8, Landroidx/work/impl/WorkDatabase;->j:J

    .line 239
    .line 240
    sub-long/2addr v6, v8

    .line 241
    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    const-string v6, " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))"

    .line 245
    .line 246
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v5

    .line 253
    invoke-virtual {p1, v5}, Llx;->m(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {p1}, Llx;->q()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 257
    .line 258
    .line 259
    invoke-virtual {p1}, Llx;->k()V

    .line 260
    .line 261
    .line 262
    add-int/lit8 v4, v4, 0x1

    .line 263
    .line 264
    goto :goto_5

    .line 265
    :catchall_3
    move-exception v0

    .line 266
    invoke-virtual {p1}, Llx;->k()V

    .line 267
    .line 268
    .line 269
    throw v0

    .line 270
    :cond_6
    iput-object v1, v0, Ll92;->f:Ljava/lang/Object;

    .line 271
    .line 272
    return-void

    .line 273
    :goto_6
    :try_start_4
    monitor-exit v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 274
    throw p1

    .line 275
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 276
    .line 277
    new-instance v0, Ljava/lang/StringBuilder;

    .line 278
    .line 279
    const-string v1, "Pre-packaged database has an invalid schema: "

    .line 280
    .line 281
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    iget-object v1, v2, Lqq0;->a:Ljava/lang/String;

    .line 285
    .line 286
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    throw p1

    .line 297
    :goto_7
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 298
    .line 299
    .line 300
    throw p1

    .line 301
    :cond_8
    return-void
.end method

.method public final onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lnx;->h:Z

    .line 3
    .line 4
    iget-object v0, p0, Lnx;->f:[Llx;

    .line 5
    .line 6
    invoke-static {v0, p1}, Lnx;->a([Llx;Landroid/database/sqlite/SQLiteDatabase;)Llx;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v0, p0, Lnx;->g:Ll92;

    .line 11
    .line 12
    invoke-virtual {v0, p1, p2, p3}, Ll92;->G(Llx;II)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
