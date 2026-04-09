.class public final Lut;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Lme0;

.field public final b:[I

.field public final c:I

.field public final d:J

.field public final e:Ljava/util/List;

.field public f:I


# direct methods
.method public constructor <init>(Lwt;Lme0;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    iget-object v1, p1, Lwt;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lut;->e:Ljava/util/List;

    .line 12
    .line 13
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    iget-object v3, p1, Lwt;->c:Ljava/time/Duration;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/time/Duration;->toNanos()J

    .line 20
    .line 21
    .line 22
    move-result-wide v3

    .line 23
    add-long/2addr v3, v1

    .line 24
    iput-wide v3, p0, Lut;->d:J

    .line 25
    .line 26
    sget-object v1, Lwt;->d:Li80;

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v1, Lrt;

    .line 33
    .line 34
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-static {v1}, Ljava/util/Comparator;->comparingInt(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->sorted(Ljava/util/Comparator;)Ljava/util/stream/Stream;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Ljava/util/List;

    .line 54
    .line 55
    iput-object v0, p0, Lut;->e:Ljava/util/List;

    .line 56
    .line 57
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    new-array v0, v0, [I

    .line 62
    .line 63
    iput-object v0, p0, Lut;->b:[I

    .line 64
    .line 65
    iget p1, p1, Lwt;->b:I

    .line 66
    .line 67
    iput p1, p0, Lut;->c:I

    .line 68
    .line 69
    iput-object p2, p0, Lut;->a:Lme0;

    .line 70
    .line 71
    return-void
.end method


# virtual methods
.method public final a(Lme0;Ljava/lang/Throwable;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletionStage;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    iget v3, v0, Lut;->f:I

    .line 8
    .line 9
    iget-object v4, v0, Lut;->e:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    check-cast v3, Lvt;

    .line 16
    .line 17
    iget-object v3, v3, Lvt;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 18
    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    sget-object v5, Lwt;->d:Li80;

    .line 22
    .line 23
    iget-object v6, v0, Lut;->a:Lme0;

    .line 24
    .line 25
    invoke-virtual {v6}, Lme0;->e()Ltn0;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    iget-object v8, v7, Ltn0;->f:Lgg0;

    .line 30
    .line 31
    invoke-virtual {v6}, Lme0;->e()Ltn0;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    iget v7, v7, Ltn0;->g:I

    .line 36
    .line 37
    sget-object v9, Lk31;->a:Lbs0;

    .line 38
    .line 39
    invoke-virtual {v9, v7}, Lue0;->e(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    iget-object v10, v6, Lme0;->f:Ll00;

    .line 44
    .line 45
    iget v10, v10, Ll00;->f:I

    .line 46
    .line 47
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v10

    .line 51
    iget v11, v0, Lut;->f:I

    .line 52
    .line 53
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v11

    .line 57
    iget v12, v0, Lut;->f:I

    .line 58
    .line 59
    invoke-interface {v4, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v12

    .line 63
    check-cast v12, Lvt;

    .line 64
    .line 65
    iget-object v12, v12, Lvt;->a:Lew0;

    .line 66
    .line 67
    iget v13, v0, Lut;->f:I

    .line 68
    .line 69
    iget-object v14, v0, Lut;->b:[I

    .line 70
    .line 71
    aget v13, v14, v13

    .line 72
    .line 73
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v13

    .line 77
    iget v15, v0, Lut;->c:I

    .line 78
    .line 79
    move-object/from16 v16, v14

    .line 80
    .line 81
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object v14

    .line 85
    move/from16 v17, v15

    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v15

    .line 91
    move-object/from16 v18, v16

    .line 92
    .line 93
    move-object/from16 v16, v4

    .line 94
    .line 95
    move/from16 v4, v17

    .line 96
    .line 97
    move-object/from16 v17, v18

    .line 98
    .line 99
    move-object/from16 v18, v9

    .line 100
    .line 101
    move-object v9, v7

    .line 102
    move-object/from16 v7, v18

    .line 103
    .line 104
    filled-new-array/range {v8 .. v15}, [Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    const-string v9, "Failed to resolve {}/{}, id={} with resolver {} ({}) on attempt {} of {}, reason={}"

    .line 109
    .line 110
    invoke-interface {v5, v9, v8}, Li80;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 114
    .line 115
    .line 116
    iget-wide v8, v0, Lut;->d:J

    .line 117
    .line 118
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 119
    .line 120
    .line 121
    move-result-wide v10

    .line 122
    sub-long/2addr v8, v10

    .line 123
    const-wide/16 v10, 0x0

    .line 124
    .line 125
    cmp-long v3, v8, v10

    .line 126
    .line 127
    if-gez v3, :cond_0

    .line 128
    .line 129
    new-instance v1, Ljava/util/concurrent/CompletableFuture;

    .line 130
    .line 131
    invoke-direct {v1}, Ljava/util/concurrent/CompletableFuture;-><init>()V

    .line 132
    .line 133
    .line 134
    new-instance v2, Ljava/io/IOException;

    .line 135
    .line 136
    new-instance v3, Ljava/lang/StringBuilder;

    .line 137
    .line 138
    const-string v4, "Timed out while trying to resolve "

    .line 139
    .line 140
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v6}, Lme0;->e()Ltn0;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    iget-object v4, v4, Ltn0;->f:Lgg0;

    .line 148
    .line 149
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const-string v4, "/"

    .line 153
    .line 154
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v6}, Lme0;->e()Ltn0;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    iget v4, v4, Ltn0;->g:I

    .line 162
    .line 163
    invoke-virtual {v7, v4}, Lue0;->e(I)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    const-string v4, ", id="

    .line 171
    .line 172
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    iget-object v4, v6, Lme0;->f:Ll00;

    .line 176
    .line 177
    iget v4, v4, Ll00;->f:I

    .line 178
    .line 179
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CompletableFuture;->completeExceptionally(Ljava/lang/Throwable;)Z

    .line 190
    .line 191
    .line 192
    return-object v1

    .line 193
    :cond_0
    iget v3, v0, Lut;->f:I

    .line 194
    .line 195
    add-int/lit8 v3, v3, 0x1

    .line 196
    .line 197
    invoke-interface/range {v16 .. v16}, Ljava/util/List;->size()I

    .line 198
    .line 199
    .line 200
    move-result v5

    .line 201
    rem-int/2addr v3, v5

    .line 202
    iput v3, v0, Lut;->f:I

    .line 203
    .line 204
    aget v3, v17, v3

    .line 205
    .line 206
    if-ge v3, v4, :cond_1

    .line 207
    .line 208
    invoke-virtual {v0, v2}, Lut;->b(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletionStage;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    new-instance v3, Lst;

    .line 213
    .line 214
    const/4 v4, 0x1

    .line 215
    invoke-direct {v3, v0, v2, v4}, Lst;-><init>(Lut;Ljava/util/concurrent/Executor;I)V

    .line 216
    .line 217
    .line 218
    invoke-interface {v1, v3}, Ljava/util/concurrent/CompletionStage;->handle(Ljava/util/function/BiFunction;)Ljava/util/concurrent/CompletionStage;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-static {}, Ljava/util/function/Function;->identity()Ljava/util/function/Function;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    invoke-interface {v1, v2}, Ljava/util/concurrent/CompletionStage;->thenCompose(Ljava/util/function/Function;)Ljava/util/concurrent/CompletionStage;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    return-object v1

    .line 231
    :cond_1
    new-instance v2, Ljava/util/concurrent/CompletableFuture;

    .line 232
    .line 233
    invoke-direct {v2}, Ljava/util/concurrent/CompletableFuture;-><init>()V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v2, v1}, Ljava/util/concurrent/CompletableFuture;->completeExceptionally(Ljava/lang/Throwable;)Z

    .line 237
    .line 238
    .line 239
    return-object v2

    .line 240
    :cond_2
    new-instance v1, Ltt;

    .line 241
    .line 242
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v3, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->updateAndGet(Ljava/util/function/IntUnaryOperator;)I

    .line 246
    .line 247
    .line 248
    invoke-static/range {p1 .. p1}, Ljava/util/concurrent/CompletableFuture;->completedFuture(Ljava/lang/Object;)Ljava/util/concurrent/CompletableFuture;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    return-object v1
.end method

.method public final b(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletionStage;
    .locals 12

    .line 1
    iget-object v0, p0, Lut;->e:Ljava/util/List;

    .line 2
    .line 3
    iget v1, p0, Lut;->f:I

    .line 4
    .line 5
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lvt;

    .line 10
    .line 11
    sget-object v1, Lwt;->d:Li80;

    .line 12
    .line 13
    iget-object v2, p0, Lut;->a:Lme0;

    .line 14
    .line 15
    invoke-virtual {v2}, Lme0;->e()Ltn0;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    iget-object v4, v3, Ltn0;->f:Lgg0;

    .line 20
    .line 21
    invoke-virtual {v2}, Lme0;->e()Ltn0;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget v3, v3, Ltn0;->g:I

    .line 26
    .line 27
    sget-object v5, Lk31;->a:Lbs0;

    .line 28
    .line 29
    invoke-virtual {v5, v3}, Lue0;->e(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    iget-object v3, v2, Lme0;->f:Ll00;

    .line 34
    .line 35
    iget v3, v3, Ll00;->f:I

    .line 36
    .line 37
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    iget v3, p0, Lut;->f:I

    .line 42
    .line 43
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    iget-object v8, v0, Lvt;->a:Lew0;

    .line 48
    .line 49
    iget v3, p0, Lut;->f:I

    .line 50
    .line 51
    iget-object v11, p0, Lut;->b:[I

    .line 52
    .line 53
    aget v3, v11, v3

    .line 54
    .line 55
    add-int/lit8 v3, v3, 0x1

    .line 56
    .line 57
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    iget v3, p0, Lut;->c:I

    .line 62
    .line 63
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v10

    .line 67
    filled-new-array/range {v4 .. v10}, [Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    const-string v4, "Sending {}/{}, id={} to resolver {} ({}), attempt {} of {}"

    .line 72
    .line 73
    invoke-interface {v1, v4, v3}, Li80;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iget v1, p0, Lut;->f:I

    .line 77
    .line 78
    aget v3, v11, v1

    .line 79
    .line 80
    add-int/lit8 v3, v3, 0x1

    .line 81
    .line 82
    aput v3, v11, v1

    .line 83
    .line 84
    iget-object v0, v0, Lvt;->a:Lew0;

    .line 85
    .line 86
    invoke-virtual {v0, v2, p1}, Lew0;->f(Lme0;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletionStage;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    return-object p1
.end method
