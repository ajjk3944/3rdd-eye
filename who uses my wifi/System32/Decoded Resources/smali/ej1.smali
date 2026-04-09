.class public abstract Lej1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final a:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lv23;->a:Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "OpusHead"

    .line 4
    .line 5
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lej1;->a:[B

    .line 12
    .line 13
    return-void
.end method

.method public static a(I)I
    .locals 0

    .line 1
    shr-int/lit8 p0, p0, 0x18

    .line 2
    .line 3
    and-int/lit16 p0, p0, 0xff

    .line 4
    .line 5
    return p0
.end method

.method public static b(Lm43;Luf1;JLie4;ZZLzk3;)Ljava/util/ArrayList;
    .locals 83

    move-object/from16 v0, p0

    .line 1
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    const/4 v13, 0x0

    .line 2
    :goto_0
    iget-object v1, v0, Lm43;->e:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v13, v2, :cond_a4

    .line 3
    invoke-virtual {v1, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Lm43;

    .line 4
    iget v1, v14, Ltd;->b:I

    const v2, 0x7472616b

    if-eq v1, v2, :cond_0

    move-object/from16 v3, p1

    move-object/from16 v0, p7

    move-object v2, v11

    move/from16 v35, v13

    const/16 v34, 0x0

    goto/16 :goto_7b

    :cond_0
    const v1, 0x6d766864

    .line 5
    invoke-virtual {v0, v1}, Lm43;->i(I)Lp43;

    move-result-object v1

    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v15, 0x6d646961

    .line 7
    invoke-virtual {v14, v15}, Lm43;->j(I)Lm43;

    move-result-object v2

    .line 8
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v3, 0x68646c72    # 4.3148E24f

    .line 9
    invoke-virtual {v2, v3}, Lm43;->i(I)Lp43;

    move-result-object v3

    .line 10
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    iget-object v3, v3, Lp43;->c:Lkz2;

    const/16 v4, 0x10

    .line 12
    invoke-virtual {v3, v4}, Lkz2;->E(I)V

    .line 13
    invoke-virtual {v3}, Lkz2;->b()I

    move-result v3

    const v5, 0x736f756e

    const/16 v16, 0x5

    const/4 v8, -0x1

    if-ne v3, v5, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const v5, 0x76696465

    if-ne v3, v5, :cond_2

    const/4 v3, 0x2

    goto :goto_1

    :cond_2
    const v5, 0x74657874

    if-eq v3, v5, :cond_3

    const v5, 0x7362746c

    if-eq v3, v5, :cond_3

    const v5, 0x73756274

    if-eq v3, v5, :cond_3

    const v5, 0x636c6370

    if-eq v3, v5, :cond_3

    const v5, 0x73756270

    if-ne v3, v5, :cond_4

    :cond_3
    const/4 v3, 0x3

    goto :goto_1

    :cond_4
    const v5, 0x6d657461

    if-ne v3, v5, :cond_5

    move/from16 v3, v16

    goto :goto_1

    :cond_5
    move v3, v8

    :goto_1
    if-ne v3, v8, :cond_6

    move-object/from16 v0, p7

    move-object/from16 v47, v11

    move/from16 v35, v13

    move-object v1, v14

    :goto_2
    const/4 v15, 0x0

    const/16 v34, 0x0

    goto/16 :goto_7a

    :cond_6
    const v15, 0x746b6864

    .line 14
    invoke-virtual {v14, v15}, Lm43;->i(I)Lp43;

    move-result-object v15

    .line 15
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    iget-object v15, v15, Lp43;->c:Lkz2;

    const/16 v34, 0x0

    const/16 v12, 0x8

    .line 17
    invoke-virtual {v15, v12}, Lkz2;->E(I)V

    .line 18
    invoke-virtual {v15}, Lkz2;->b()I

    move-result v18

    invoke-static/range {v18 .. v18}, Lej1;->a(I)I

    move-result v18

    if-nez v18, :cond_7

    move v6, v12

    goto :goto_3

    :cond_7
    move v6, v4

    .line 19
    :goto_3
    invoke-virtual {v15, v6}, Lkz2;->G(I)V

    .line 20
    invoke-virtual {v15}, Lkz2;->b()I

    move-result v6

    const/4 v12, 0x4

    .line 21
    invoke-virtual {v15, v12}, Lkz2;->G(I)V

    .line 22
    iget v5, v15, Lkz2;->b:I

    move/from16 v10, v34

    :goto_4
    if-nez v18, :cond_8

    move v7, v12

    goto :goto_5

    :cond_8
    const/16 v7, 0x8

    :goto_5
    const-wide/16 v24, 0x0

    const-wide v26, -0x7fffffffffffffffL    # -4.9E-324

    if-ge v10, v7, :cond_b

    .line 23
    iget-object v7, v15, Lkz2;->a:[B

    add-int v28, v5, v10

    .line 24
    aget-byte v7, v7, v28

    if-eq v7, v8, :cond_a

    if-nez v18, :cond_9

    .line 25
    invoke-virtual {v15}, Lkz2;->P()J

    move-result-wide v28

    goto :goto_6

    :cond_9
    invoke-virtual {v15}, Lkz2;->j()J

    move-result-wide v28

    :goto_6
    cmp-long v5, v28, v24

    if-nez v5, :cond_c

    :goto_7
    move-wide/from16 v28, v26

    goto :goto_8

    :cond_a
    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    .line 26
    :cond_b
    invoke-virtual {v15, v7}, Lkz2;->G(I)V

    goto :goto_7

    :cond_c
    :goto_8
    const/16 v5, 0xa

    .line 27
    invoke-virtual {v15, v5}, Lkz2;->G(I)V

    .line 28
    invoke-virtual {v15}, Lkz2;->L()I

    move-result v7

    .line 29
    invoke-virtual {v15, v12}, Lkz2;->G(I)V

    .line 30
    invoke-virtual {v15}, Lkz2;->b()I

    move-result v10

    .line 31
    invoke-virtual {v15}, Lkz2;->b()I

    move-result v5

    .line 32
    invoke-virtual {v15, v12}, Lkz2;->G(I)V

    .line 33
    invoke-virtual {v15}, Lkz2;->b()I

    move-result v12

    .line 34
    invoke-virtual {v15}, Lkz2;->b()I

    move-result v8

    const/high16 v4, 0x10000

    const/high16 v9, -0x10000

    if-nez v10, :cond_12

    if-ne v5, v4, :cond_f

    if-eq v12, v9, :cond_10

    if-ne v12, v4, :cond_e

    if-nez v8, :cond_d

    move/from16 v5, v34

    goto :goto_9

    :cond_d
    const/4 v5, 0x1

    :goto_9
    move v12, v4

    :goto_a
    const/4 v10, 0x1

    goto :goto_b

    :cond_e
    move v5, v4

    :cond_f
    move/from16 v10, v34

    goto :goto_e

    :cond_10
    if-nez v8, :cond_11

    move/from16 v5, v34

    goto :goto_a

    :cond_11
    const/4 v5, 0x1

    goto :goto_a

    :goto_b
    if-eq v10, v5, :cond_e

    const/16 v4, 0x5a

    :goto_c
    move v12, v4

    :goto_d
    const/16 v4, 0x10

    goto :goto_14

    :cond_12
    :goto_e
    if-nez v10, :cond_18

    if-ne v5, v9, :cond_15

    if-eq v12, v4, :cond_16

    if-ne v12, v9, :cond_14

    if-nez v8, :cond_13

    move/from16 v5, v34

    goto :goto_f

    :cond_13
    const/4 v5, 0x1

    :goto_f
    move v12, v9

    :goto_10
    const/4 v10, 0x1

    goto :goto_11

    :cond_14
    move v5, v9

    :cond_15
    move/from16 v10, v34

    goto :goto_12

    :cond_16
    if-nez v8, :cond_17

    move/from16 v5, v34

    goto :goto_10

    :cond_17
    const/4 v5, 0x1

    goto :goto_10

    :goto_11
    if-eq v10, v5, :cond_14

    const/16 v4, 0x10e

    goto :goto_c

    :cond_18
    :goto_12
    if-eq v10, v9, :cond_1a

    if-ne v10, v4, :cond_19

    goto :goto_13

    :cond_19
    move/from16 v12, v34

    goto :goto_d

    :cond_1a
    :goto_13
    if-nez v5, :cond_19

    if-nez v12, :cond_19

    if-ne v8, v9, :cond_19

    const/16 v4, 0xb4

    goto :goto_c

    .line 35
    :goto_14
    invoke-virtual {v15, v4}, Lkz2;->G(I)V

    .line 36
    invoke-virtual {v15}, Lkz2;->N()S

    move-result v4

    const/4 v5, 0x2

    .line 37
    invoke-virtual {v15, v5}, Lkz2;->G(I)V

    .line 38
    invoke-virtual {v15}, Lkz2;->N()S

    move-result v15

    cmp-long v5, p2, v26

    if-nez v5, :cond_1b

    move-wide/from16 v35, v28

    goto :goto_15

    :cond_1b
    move-wide/from16 v35, p2

    :goto_15
    iget-object v1, v1, Lp43;->c:Lkz2;

    .line 39
    invoke-static {v1}, Lej1;->d(Lkz2;)Lo53;

    move-result-object v1

    iget-wide v8, v1, Lo53;->c:J

    cmp-long v1, v35, v26

    if-nez v1, :cond_1c

    move-wide/from16 v39, v8

    move-wide/from16 v28, v26

    :goto_16
    const v1, 0x6d696e66

    goto :goto_17

    :cond_1c
    const-wide/32 v37, 0xf4240

    .line 40
    sget-object v41, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    move-wide/from16 v39, v8

    .line 41
    invoke-static/range {v35 .. v41}, Lv23;->t(JJJLjava/math/RoundingMode;)J

    move-result-wide v8

    move-wide/from16 v28, v8

    goto :goto_16

    .line 42
    :goto_17
    invoke-virtual {v2, v1}, Lm43;->j(I)Lm43;

    move-result-object v5

    .line 43
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v8, 0x7374626c

    .line 44
    invoke-virtual {v5, v8}, Lm43;->j(I)Lm43;

    move-result-object v5

    .line 45
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v9, 0x6d646864

    .line 46
    invoke-virtual {v2, v9}, Lm43;->i(I)Lp43;

    move-result-object v2

    .line 47
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    iget-object v2, v2, Lp43;->c:Lkz2;

    const/16 v9, 0x8

    .line 49
    invoke-virtual {v2, v9}, Lkz2;->E(I)V

    .line 50
    invoke-virtual {v2}, Lkz2;->b()I

    move-result v9

    invoke-static {v9}, Lej1;->a(I)I

    move-result v9

    if-nez v9, :cond_1d

    const/16 v10, 0x8

    goto :goto_18

    :cond_1d
    const/16 v10, 0x10

    .line 51
    :goto_18
    invoke-virtual {v2, v10}, Lkz2;->G(I)V

    .line 52
    invoke-virtual {v2}, Lkz2;->P()J

    move-result-wide v45

    .line 53
    iget v10, v2, Lkz2;->b:I

    move/from16 v1, v34

    :goto_19
    if-nez v9, :cond_1e

    const/4 v8, 0x4

    goto :goto_1a

    :cond_1e
    const/16 v8, 0x8

    :goto_1a
    if-ge v1, v8, :cond_22

    .line 54
    iget-object v8, v2, Lkz2;->a:[B

    add-int v35, v10, v1

    .line 55
    aget-byte v8, v8, v35

    const/4 v0, -0x1

    if-eq v8, v0, :cond_21

    if-nez v9, :cond_1f

    .line 56
    invoke-virtual {v2}, Lkz2;->P()J

    move-result-wide v8

    :goto_1b
    move-wide/from16 v41, v8

    goto :goto_1c

    :cond_1f
    invoke-virtual {v2}, Lkz2;->j()J

    move-result-wide v8

    goto :goto_1b

    :goto_1c
    cmp-long v1, v41, v24

    if-nez v1, :cond_20

    goto :goto_1d

    :cond_20
    const-wide/32 v43, 0xf4240

    .line 57
    sget-object v47, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 58
    invoke-static/range {v41 .. v47}, Lv23;->t(JJJLjava/math/RoundingMode;)J

    move-result-wide v26

    goto :goto_1d

    :cond_21
    add-int/lit8 v1, v1, 0x1

    move-object/from16 v0, p0

    const v8, 0x7374626c

    goto :goto_19

    :cond_22
    const/4 v0, -0x1

    .line 59
    invoke-virtual {v2, v8}, Lkz2;->G(I)V

    .line 60
    :goto_1d
    invoke-virtual {v2}, Lkz2;->L()I

    move-result v1

    shr-int/lit8 v2, v1, 0xa

    and-int/lit8 v2, v2, 0x1f

    add-int/lit8 v2, v2, 0x60

    int-to-char v2, v2

    shr-int/lit8 v8, v1, 0x5

    and-int/lit8 v8, v8, 0x1f

    add-int/lit8 v8, v8, 0x60

    int-to-char v8, v8

    and-int/lit8 v1, v1, 0x1f

    add-int/lit8 v1, v1, 0x60

    int-to-char v1, v1

    const/4 v9, 0x3

    new-array v10, v9, [C

    aput-char v2, v10, v34

    const/16 v33, 0x1

    aput-char v8, v10, v33

    const/16 v23, 0x2

    aput-char v1, v10, v23

    move/from16 v1, v34

    :goto_1e
    if-ge v1, v9, :cond_25

    .line 61
    aget-char v2, v10, v1

    const/16 v8, 0x61

    if-lt v2, v8, :cond_23

    const/16 v8, 0x7a

    if-le v2, v8, :cond_24

    :cond_23
    const/4 v1, 0x0

    goto :goto_1f

    :cond_24
    add-int/lit8 v1, v1, 0x1

    goto :goto_1e

    .line 62
    :cond_25
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v10}, Ljava/lang/String;-><init>([C)V

    :goto_1f
    const v2, 0x73747364

    .line 63
    invoke-virtual {v5, v2}, Lm43;->i(I)Lp43;

    move-result-object v2

    if-nez v2, :cond_26

    const-string v0, "Ignoring track where sample table (stbl) box is missing a sample description (stsd)."

    .line 64
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    move-object/from16 v0, p7

    move-object/from16 v47, v11

    move/from16 v35, v13

    move-object v1, v14

    const/4 v15, 0x0

    goto/16 :goto_7a

    :cond_26
    iget-object v2, v2, Lp43;->c:Lkz2;

    const/16 v5, 0xc

    .line 65
    invoke-virtual {v2, v5}, Lkz2;->E(I)V

    .line 66
    invoke-virtual {v2}, Lkz2;->b()I

    move-result v8

    move/from16 v19, v9

    new-instance v9, Lts;

    .line 67
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    new-array v10, v8, [Lrj1;

    iput-object v10, v9, Lts;->c:Ljava/lang/Object;

    move/from16 v10, v34

    iput v10, v9, Lts;->b:I

    const/4 v10, 0x0

    :goto_20
    if-ge v10, v8, :cond_98

    move/from16 v31, v3

    .line 68
    iget v3, v2, Lkz2;->b:I

    .line 69
    invoke-virtual {v2}, Lkz2;->b()I

    move-result v35

    if-lez v35, :cond_27

    const/4 v0, 0x1

    goto :goto_21

    :cond_27
    const/4 v0, 0x0

    .line 70
    :goto_21
    const-string v5, "childAtomSize must be positive"

    invoke-static {v5, v0}, Lqb1;->y(Ljava/lang/String;Z)V

    .line 71
    invoke-virtual {v2}, Lkz2;->b()I

    move-result v0

    move/from16 v38, v3

    const/16 v44, 0x7

    const v3, 0x61766331

    if-eq v0, v3, :cond_28

    const v3, 0x61766333

    if-eq v0, v3, :cond_28

    const v3, 0x656e6376

    if-eq v0, v3, :cond_28

    const v3, 0x6d317620

    if-eq v0, v3, :cond_28

    const v3, 0x6d703476

    if-eq v0, v3, :cond_28

    const v3, 0x68766331

    if-eq v0, v3, :cond_28

    const v3, 0x68657631

    if-eq v0, v3, :cond_28

    const v3, 0x73323633

    if-eq v0, v3, :cond_28

    const v3, 0x48323633

    if-eq v0, v3, :cond_28

    const v3, 0x68323633

    if-eq v0, v3, :cond_28

    const v3, 0x76703038

    if-eq v0, v3, :cond_28

    const v3, 0x76703039

    if-eq v0, v3, :cond_28

    const v3, 0x61763031

    if-eq v0, v3, :cond_28

    const v3, 0x64766176

    if-eq v0, v3, :cond_28

    const v3, 0x64766131

    if-eq v0, v3, :cond_28

    const v3, 0x64766865

    if-eq v0, v3, :cond_28

    const v3, 0x64766831

    if-eq v0, v3, :cond_28

    const v3, 0x61707631

    if-ne v0, v3, :cond_29

    :cond_28
    move v3, v6

    move-object v6, v1

    move v1, v3

    move/from16 v18, v4

    move/from16 v52, v7

    move/from16 v21, v8

    move/from16 v4, v35

    move/from16 v3, v38

    const/16 v22, 0xa

    move-object/from16 v8, p4

    move v7, v0

    const/16 v0, 0x10

    goto/16 :goto_2d

    :cond_29
    const v3, 0x6d703461

    if-eq v0, v3, :cond_39

    const v3, 0x656e6361

    if-eq v0, v3, :cond_39

    const v3, 0x61632d33

    if-eq v0, v3, :cond_39

    const v3, 0x65632d33

    if-eq v0, v3, :cond_39

    const v3, 0x61632d34

    if-eq v0, v3, :cond_39

    const v3, 0x6d6c7061

    if-eq v0, v3, :cond_39

    const v3, 0x64747363

    if-eq v0, v3, :cond_39

    const v3, 0x64747365

    if-eq v0, v3, :cond_39

    const v3, 0x64747368

    if-eq v0, v3, :cond_39

    const v3, 0x6474736c

    if-eq v0, v3, :cond_39

    const v3, 0x64747378

    if-eq v0, v3, :cond_39

    const v3, 0x73616d72

    if-eq v0, v3, :cond_39

    const v3, 0x73617762

    if-eq v0, v3, :cond_39

    const v3, 0x6c70636d

    if-eq v0, v3, :cond_39

    const v3, 0x736f7774

    if-eq v0, v3, :cond_39

    const v3, 0x74776f73

    if-eq v0, v3, :cond_39

    const v3, 0x2e6d7032

    if-eq v0, v3, :cond_39

    const v3, 0x2e6d7033

    if-eq v0, v3, :cond_39

    const v3, 0x6d686131

    if-eq v0, v3, :cond_39

    const v3, 0x6d686d31

    if-eq v0, v3, :cond_39

    const v3, 0x616c6163

    if-eq v0, v3, :cond_39

    const v3, 0x616c6177

    if-eq v0, v3, :cond_39

    const v3, 0x756c6177

    if-eq v0, v3, :cond_39

    const v3, 0x4f707573

    if-eq v0, v3, :cond_39

    const v3, 0x664c6143

    if-eq v0, v3, :cond_39

    const v3, 0x69616d66

    if-eq v0, v3, :cond_39

    const v3, 0x6970636d

    if-eq v0, v3, :cond_39

    const v3, 0x6670636d

    if-ne v0, v3, :cond_2a

    move/from16 v18, v4

    move v5, v6

    move/from16 v52, v7

    move/from16 v21, v8

    move/from16 v4, v35

    move/from16 v3, v38

    const/16 v22, 0xa

    move-object/from16 v8, p4

    move/from16 v7, p6

    move-object v6, v1

    move-object v1, v2

    move v2, v0

    const/16 v0, 0x10

    goto/16 :goto_2c

    :cond_2a
    const v5, 0x74783367

    const v3, 0x54544d4c

    if-eq v0, v3, :cond_2e

    if-eq v0, v5, :cond_2e

    const v5, 0x77767474

    if-eq v0, v5, :cond_2e

    const v5, 0x73747070

    if-eq v0, v5, :cond_2e

    const v5, 0x63363038

    if-eq v0, v5, :cond_2e

    const v5, 0x6d703473

    if-ne v0, v5, :cond_2b

    goto :goto_24

    :cond_2b
    const v3, 0x6d657474

    if-ne v0, v3, :cond_2d

    add-int/lit8 v3, v38, 0x10

    .line 72
    invoke-virtual {v2, v3}, Lkz2;->E(I)V

    .line 73
    invoke-virtual {v2}, Lkz2;->m()Ljava/lang/String;

    .line 74
    invoke-virtual {v2}, Lkz2;->m()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2c

    new-instance v3, Lgg4;

    .line 75
    invoke-direct {v3}, Lgg4;-><init>()V

    invoke-virtual {v3, v6}, Lgg4;->c(I)V

    invoke-virtual {v3, v0}, Lgg4;->e(Ljava/lang/String;)V

    .line 76
    new-instance v0, Lph4;

    .line 77
    invoke-direct {v0, v3}, Lph4;-><init>(Lgg4;)V

    .line 78
    iput-object v0, v9, Lts;->d:Ljava/lang/Object;

    :cond_2c
    :goto_22
    move-object v0, v1

    move/from16 v18, v4

    move v5, v6

    move/from16 v52, v7

    move/from16 v21, v8

    move/from16 v32, v10

    move-object/from16 v47, v11

    move v4, v12

    move-object/from16 v48, v14

    move/from16 v37, v15

    move/from16 v67, v35

    const/4 v6, 0x4

    const/4 v11, -0x1

    const/16 v22, 0xa

    :goto_23
    move/from16 v35, v13

    goto/16 :goto_71

    :cond_2d
    const v3, 0x63616d6d

    if-ne v0, v3, :cond_2c

    new-instance v0, Lgg4;

    .line 79
    invoke-direct {v0}, Lgg4;-><init>()V

    .line 80
    invoke-virtual {v0, v6}, Lgg4;->c(I)V

    const-string v3, "application/x-camera-motion"

    .line 81
    invoke-virtual {v0, v3}, Lgg4;->e(Ljava/lang/String;)V

    .line 82
    new-instance v3, Lph4;

    .line 83
    invoke-direct {v3, v0}, Lph4;-><init>(Lgg4;)V

    .line 84
    iput-object v3, v9, Lts;->d:Ljava/lang/Object;

    goto :goto_22

    :cond_2e
    :goto_24
    add-int/lit8 v5, v38, 0x10

    .line 85
    invoke-virtual {v2, v5}, Lkz2;->E(I)V

    const-string v5, "application/ttml+xml"

    const-wide v49, 0x7fffffffffffffffL

    if-ne v0, v3, :cond_2f

    :goto_25
    move-object/from16 v41, v2

    move-object v2, v5

    move/from16 v51, v7

    move/from16 v42, v8

    move-wide/from16 v7, v49

    :goto_26
    const/4 v0, 0x0

    :goto_27
    const/4 v3, 0x1

    const/16 v5, 0xa

    const/16 v32, 0x10

    goto/16 :goto_2b

    :cond_2f
    const v3, 0x74783367

    if-ne v0, v3, :cond_30

    add-int/lit8 v0, v35, -0x10

    .line 86
    new-array v3, v0, [B

    const/4 v5, 0x0

    .line 87
    invoke-virtual {v2, v3, v5, v0}, Lkz2;->H([BII)V

    .line 88
    invoke-static {v3}, Lxm3;->i(Ljava/lang/Object;)Lsn3;

    move-result-object v0

    const-string v5, "application/x-quicktime-tx3g"

    move-object/from16 v41, v2

    move-object v2, v5

    move/from16 v51, v7

    move/from16 v42, v8

    move-wide/from16 v7, v49

    goto :goto_27

    :cond_30
    const v3, 0x77767474

    if-ne v0, v3, :cond_31

    const-string v5, "application/x-mp4-vtt"

    goto :goto_25

    :cond_31
    const v3, 0x73747070

    if-ne v0, v3, :cond_32

    move-object/from16 v41, v2

    move-object v2, v5

    move/from16 v51, v7

    move/from16 v42, v8

    move-wide/from16 v7, v24

    goto :goto_26

    :cond_32
    const v5, 0x63363038

    if-ne v0, v5, :cond_33

    const/4 v0, 0x1

    iput v0, v9, Lts;->b:I

    const-string v5, "application/x-mp4-cea-608"

    goto :goto_25

    .line 89
    :cond_33
    iget v0, v2, Lkz2;->b:I

    const/4 v3, 0x4

    .line 90
    invoke-virtual {v2, v3}, Lkz2;->G(I)V

    .line 91
    invoke-virtual {v2}, Lkz2;->b()I

    move-result v3

    const v5, 0x65736473

    if-ne v3, v5, :cond_37

    .line 92
    invoke-static {v0, v2}, Lej1;->j(ILkz2;)Lcj1;

    move-result-object v0

    .line 93
    iget-object v0, v0, Lcj1;->i:Ljava/lang/Object;

    check-cast v0, [B

    if-eqz v0, :cond_36

    .line 94
    array-length v3, v0

    const/16 v5, 0x40

    if-ne v3, v5, :cond_36

    .line 95
    array-length v3, v0

    if-ne v3, v5, :cond_34

    const/4 v3, 0x1

    goto :goto_28

    :cond_34
    const/4 v3, 0x0

    :goto_28
    invoke-static {v3}, Lzt0;->b0(Z)V

    new-instance v3, Ljava/util/ArrayList;

    const/16 v5, 0x10

    .line 96
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    move-object/from16 v41, v2

    const/4 v5, 0x0

    .line 97
    :goto_29
    array-length v2, v0

    add-int/lit8 v2, v2, -0x3

    if-ge v5, v2, :cond_35

    .line 98
    aget-byte v2, v0, v5

    add-int/lit8 v42, v5, 0x1

    move-object/from16 v43, v0

    aget-byte v0, v43, v42

    add-int/lit8 v42, v5, 0x2

    move/from16 v47, v5

    aget-byte v5, v43, v42

    add-int/lit8 v42, v47, 0x3

    move/from16 v51, v7

    aget-byte v7, v43, v42

    invoke-static {v2, v0, v5, v7}, Lzt0;->T(BBBB)I

    move-result v0

    shr-int/lit8 v2, v0, 0x10

    .line 99
    sget-object v5, Lv23;->a:Ljava/lang/String;

    shr-int/lit8 v5, v0, 0x8

    const/16 v7, 0xff

    and-int/2addr v5, v7

    add-int/lit8 v5, v5, -0x80

    move/from16 v42, v8

    mul-int/lit16 v8, v5, 0x36fb

    and-int/2addr v2, v7

    div-int/lit16 v8, v8, 0x2710

    add-int/2addr v8, v2

    .line 100
    invoke-static {v8, v7}, Ljava/lang/Math;->min(II)I

    move-result v8

    const/4 v7, 0x0

    invoke-static {v7, v8}, Ljava/lang/Math;->max(II)I

    move-result v8

    const/16 v32, 0x10

    shl-int/lit8 v7, v8, 0x10

    const/16 v8, 0xff

    and-int/2addr v0, v8

    add-int/lit8 v0, v0, -0x80

    mul-int/lit16 v5, v5, 0x1c01

    mul-int/lit16 v8, v0, 0xd7f

    div-int/lit16 v8, v8, 0x2710

    sub-int v8, v2, v8

    div-int/lit16 v5, v5, 0x2710

    sub-int/2addr v8, v5

    const/16 v5, 0xff

    .line 101
    invoke-static {v8, v5}, Ljava/lang/Math;->min(II)I

    move-result v8

    const/4 v5, 0x0

    invoke-static {v5, v8}, Ljava/lang/Math;->max(II)I

    move-result v8

    const/16 v20, 0x8

    shl-int/lit8 v8, v8, 0x8

    mul-int/lit16 v0, v0, 0x457e

    div-int/lit16 v0, v0, 0x2710

    add-int/2addr v0, v2

    const/16 v2, 0xff

    .line 102
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {v5, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    or-int v2, v7, v8

    or-int/2addr v0, v2

    .line 103
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v2, "%06x"

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v47, 0x4

    move/from16 v8, v42

    move-object/from16 v0, v43

    move/from16 v7, v51

    goto/16 :goto_29

    :cond_35
    move/from16 v51, v7

    move/from16 v42, v8

    const/16 v32, 0x10

    .line 104
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    .line 105
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ", "

    invoke-static {v2, v0, v3}, Li30;->k0(Ljava/lang/StringBuilder;Ljava/util/Iterator;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 106
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v15}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v2, v2, 0x7

    const/16 v5, 0xa

    .line 107
    invoke-static {v3, v2, v5}, Lga1;->i(Ljava/lang/String;II)I

    move-result v2

    const/4 v3, 0x1

    invoke-static {v0, v2, v3}, Lga1;->i(Ljava/lang/String;II)I

    move-result v2

    .line 108
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "size: "

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "x"

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "\npalette: "

    const-string v8, "\n"

    .line 109
    invoke-static {v7, v2, v0, v8}, Lex0;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 110
    sget-object v2, Lv23;->a:Ljava/lang/String;

    .line 111
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 112
    invoke-static {v0}, Lxm3;->i(Ljava/lang/Object;)Lsn3;

    move-result-object v0

    const-string v2, "application/vobsub"

    goto :goto_2a

    :cond_36
    const/16 v32, 0x10

    goto/16 :goto_22

    :cond_37
    move-object/from16 v41, v2

    move/from16 v51, v7

    move/from16 v42, v8

    const/4 v3, 0x1

    const/16 v5, 0xa

    const/16 v32, 0x10

    const/4 v0, 0x0

    const/4 v2, 0x0

    :goto_2a
    move-wide/from16 v7, v49

    :goto_2b
    if-eqz v2, :cond_38

    .line 113
    new-instance v3, Lgg4;

    .line 114
    invoke-direct {v3}, Lgg4;-><init>()V

    .line 115
    invoke-virtual {v3, v6}, Lgg4;->c(I)V

    .line 116
    invoke-virtual {v3, v2}, Lgg4;->e(Ljava/lang/String;)V

    .line 117
    iput-object v1, v3, Lgg4;->d:Ljava/lang/String;

    .line 118
    iput-wide v7, v3, Lgg4;->q:J

    .line 119
    iput-object v0, v3, Lgg4;->o:Ljava/util/List;

    .line 120
    new-instance v0, Lph4;

    .line 121
    invoke-direct {v0, v3}, Lph4;-><init>(Lgg4;)V

    .line 122
    iput-object v0, v9, Lts;->d:Ljava/lang/Object;

    :cond_38
    move-object v0, v1

    move/from16 v18, v4

    move/from16 v22, v5

    move v5, v6

    move/from16 v32, v10

    move-object/from16 v47, v11

    move v4, v12

    move-object/from16 v48, v14

    move/from16 v37, v15

    move/from16 v67, v35

    move-object/from16 v2, v41

    move/from16 v21, v42

    move/from16 v52, v51

    const/4 v6, 0x4

    const/4 v11, -0x1

    goto/16 :goto_23

    :cond_39
    const/16 v32, 0x10

    move/from16 v18, v4

    move v5, v6

    move/from16 v52, v7

    move/from16 v21, v8

    move/from16 v4, v35

    move/from16 v3, v38

    const/16 v22, 0xa

    move-object/from16 v8, p4

    move/from16 v7, p6

    move-object v6, v1

    move-object v1, v2

    move v2, v0

    move/from16 v0, v32

    .line 123
    :goto_2c
    invoke-static/range {v1 .. v10}, Lej1;->i(Lkz2;IIIILjava/lang/String;ZLie4;Lts;I)V

    move-object v2, v1

    move/from16 v38, v3

    move/from16 v67, v4

    move-object v0, v6

    move/from16 v32, v10

    move-object/from16 v47, v11

    move v4, v12

    move/from16 v35, v13

    move-object/from16 v48, v14

    move/from16 v37, v15

    const/4 v6, 0x4

    const/4 v11, -0x1

    goto/16 :goto_71

    :goto_2d
    move/from16 v32, v10

    add-int/lit8 v10, v3, 0x10

    .line 124
    invoke-virtual {v2, v10}, Lkz2;->E(I)V

    .line 125
    invoke-virtual {v2, v0}, Lkz2;->G(I)V

    .line 126
    invoke-virtual {v2}, Lkz2;->L()I

    move-result v10

    .line 127
    invoke-virtual {v2}, Lkz2;->L()I

    move-result v0

    move/from16 v35, v13

    const/16 v13, 0x32

    .line 128
    invoke-virtual {v2, v13}, Lkz2;->G(I)V

    .line 129
    iget v13, v2, Lkz2;->b:I

    move/from16 v37, v15

    const v15, 0x656e6376

    if-ne v7, v15, :cond_3c

    .line 130
    invoke-static {v2, v3, v4}, Lej1;->k(Lkz2;II)Landroid/util/Pair;

    move-result-object v7

    if-eqz v7, :cond_3b

    .line 131
    iget-object v15, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v15, Ljava/lang/Integer;

    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v15

    if-nez v8, :cond_3a

    move/from16 v38, v3

    const/16 v41, 0x0

    goto :goto_2e

    :cond_3a
    move/from16 v38, v3

    .line 132
    iget-object v3, v7, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, Lrj1;

    iget-object v3, v3, Lrj1;->b:Ljava/lang/String;

    invoke-virtual {v8, v3}, Lie4;->a(Ljava/lang/String;)Lie4;

    move-result-object v3

    move-object/from16 v41, v3

    .line 133
    :goto_2e
    iget-object v3, v9, Lts;->c:Ljava/lang/Object;

    check-cast v3, [Lrj1;

    .line 134
    iget-object v7, v7, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v7, Lrj1;

    aput-object v7, v3, v32

    goto :goto_2f

    :cond_3b
    move/from16 v38, v3

    move-object/from16 v41, v8

    .line 135
    :goto_2f
    invoke-virtual {v2, v13}, Lkz2;->E(I)V

    move-object/from16 v3, v41

    goto :goto_30

    :cond_3c
    move/from16 v38, v3

    move v15, v7

    move-object v3, v8

    :goto_30
    const-string v7, "video/3gpp"

    move-object/from16 v41, v7

    const v7, 0x6d317620

    if-ne v15, v7, :cond_3d

    const-string v7, "video/mpeg"

    goto :goto_31

    :cond_3d
    const v7, 0x48323633

    if-ne v15, v7, :cond_3e

    move v15, v7

    move-object/from16 v7, v41

    goto :goto_31

    :cond_3e
    const/4 v7, 0x0

    :goto_31
    const/high16 v47, 0x3f800000    # 1.0f

    move/from16 v57, v0

    move/from16 v66, v1

    move-object/from16 v50, v3

    move-object/from16 v49, v6

    move/from16 v58, v10

    move/from16 v60, v12

    move-object/from16 v48, v14

    move/from16 v61, v47

    const/4 v0, 0x0

    const/4 v3, -0x1

    const/16 v6, 0x8

    const/4 v8, -0x1

    const/4 v10, 0x0

    const/16 v12, 0x8

    const/16 v51, -0x1

    const/16 v53, -0x1

    const/16 v54, -0x1

    const/16 v55, 0x0

    const/16 v56, -0x1

    const/16 v59, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    move-object/from16 v47, v11

    move v14, v13

    const/4 v11, -0x1

    move-object v13, v7

    const/4 v7, -0x1

    :goto_32
    sub-int v1, v14, v38

    if-ge v1, v4, :cond_3f

    .line 136
    invoke-virtual {v2, v14}, Lkz2;->E(I)V

    .line 137
    iget v1, v2, Lkz2;->b:I

    .line 138
    invoke-virtual {v2}, Lkz2;->b()I

    move-result v67

    move/from16 v68, v14

    if-nez v67, :cond_41

    .line 139
    iget v14, v2, Lkz2;->b:I

    sub-int v14, v14, v38

    if-ne v14, v4, :cond_40

    :cond_3f
    move/from16 v67, v4

    move/from16 v74, v6

    move/from16 v82, v7

    move-object/from16 v75, v9

    move/from16 v77, v11

    move/from16 v71, v12

    const/4 v6, 0x4

    const/4 v11, -0x1

    goto/16 :goto_6e

    :cond_40
    const/4 v14, 0x0

    goto :goto_33

    :cond_41
    move/from16 v14, v67

    :goto_33
    if-lez v14, :cond_42

    move/from16 v67, v4

    const/4 v4, 0x1

    goto :goto_34

    :cond_42
    move/from16 v67, v4

    const/4 v4, 0x0

    .line 140
    :goto_34
    invoke-static {v5, v4}, Lqb1;->y(Ljava/lang/String;Z)V

    .line 141
    invoke-virtual {v2}, Lkz2;->b()I

    move-result v4

    move/from16 v69, v1

    const v1, 0x61766343

    if-ne v4, v1, :cond_45

    add-int/lit8 v1, v69, 0x8

    if-nez v13, :cond_43

    const/4 v0, 0x1

    :goto_35
    const/4 v3, 0x0

    goto :goto_36

    :cond_43
    const/4 v0, 0x0

    goto :goto_35

    .line 142
    :goto_36
    invoke-static {v3, v0}, Lqb1;->y(Ljava/lang/String;Z)V

    .line 143
    invoke-virtual {v2, v1}, Lkz2;->E(I)V

    .line 144
    invoke-static {v2}, Lve1;->a(Lkz2;)Lve1;

    move-result-object v0

    iget-object v1, v0, Lve1;->a:Ljava/util/ArrayList;

    iget v3, v0, Lve1;->b:I

    iput v3, v9, Lts;->a:I

    if-nez v55, :cond_44

    iget v3, v0, Lve1;->k:F

    move/from16 v61, v3

    const/4 v3, 0x0

    goto :goto_37

    :cond_44
    const/4 v3, 0x1

    :goto_37
    iget-object v4, v0, Lve1;->l:Ljava/lang/String;

    iget v6, v0, Lve1;->j:I

    iget v8, v0, Lve1;->g:I

    iget v11, v0, Lve1;->h:I

    iget v12, v0, Lve1;->i:I

    iget v13, v0, Lve1;->e:I

    iget v0, v0, Lve1;->f:I

    const-string v53, "video/avc"

    move/from16 v74, v0

    move-object v0, v1

    move/from16 v55, v3

    move-object/from16 v65, v4

    move-object/from16 v76, v5

    move v3, v8

    move-object/from16 v75, v9

    move/from16 v77, v11

    move v8, v12

    move v12, v13

    move/from16 v73, v15

    move-object/from16 v13, v53

    const/4 v11, -0x1

    const v43, 0x76703038

    move/from16 v53, v6

    :goto_38
    const/4 v6, 0x4

    goto/16 :goto_6d

    :cond_45
    const v1, 0x68766343

    move/from16 v70, v15

    const-string v15, "video/hevc"

    if-ne v4, v1, :cond_49

    add-int/lit8 v1, v69, 0x8

    if-nez v13, :cond_46

    const/4 v0, 0x1

    :goto_39
    const/4 v3, 0x0

    goto :goto_3a

    :cond_46
    const/4 v0, 0x0

    goto :goto_39

    .line 145
    :goto_3a
    invoke-static {v3, v0}, Lqb1;->y(Ljava/lang/String;Z)V

    .line 146
    invoke-virtual {v2, v1}, Lkz2;->E(I)V

    const/4 v10, 0x0

    .line 147
    invoke-static {v2, v10, v3}, Lvf1;->a(Lkz2;ZLp21;)Lvf1;

    move-result-object v0

    .line 148
    iget-object v1, v0, Lvf1;->a:Ljava/util/List;

    iget v3, v0, Lvf1;->b:I

    iput v3, v9, Lts;->a:I

    if-nez v55, :cond_47

    iget v3, v0, Lvf1;->l:F

    move/from16 v61, v3

    const/4 v3, 0x0

    goto :goto_3b

    :cond_47
    const/4 v3, 0x1

    :goto_3b
    iget v4, v0, Lvf1;->m:I

    iget v6, v0, Lvf1;->c:I

    iget-object v10, v0, Lvf1;->n:Ljava/lang/String;

    iget v8, v0, Lvf1;->k:I

    const/4 v11, -0x1

    if-eq v8, v11, :cond_48

    goto :goto_3c

    :cond_48
    move v8, v7

    :goto_3c
    iget v7, v0, Lvf1;->d:I

    iget v11, v0, Lvf1;->e:I

    iget v12, v0, Lvf1;->h:I

    iget v13, v0, Lvf1;->i:I

    move-object/from16 v51, v1

    iget v1, v0, Lvf1;->j:I

    move/from16 v53, v1

    iget v1, v0, Lvf1;->f:I

    move/from16 v54, v1

    iget v1, v0, Lvf1;->g:I

    iget-object v0, v0, Lvf1;->o:Lp21;

    move/from16 v74, v1

    move/from16 v55, v3

    move-object/from16 v76, v5

    move/from16 v56, v7

    move v7, v8

    move-object/from16 v75, v9

    move-object/from16 v65, v10

    move v3, v12

    move/from16 v77, v13

    move-object v13, v15

    move/from16 v8, v53

    move/from16 v12, v54

    move/from16 v73, v70

    const v43, 0x76703038

    move-object v10, v0

    move/from16 v53, v4

    move/from16 v54, v11

    move-object/from16 v0, v51

    const/4 v11, -0x1

    move/from16 v51, v6

    goto :goto_38

    :cond_49
    const v1, 0x6c687643

    if-ne v4, v1, :cond_56

    add-int/lit8 v1, v69, 0x8

    .line 149
    invoke-virtual {v15, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const-string v13, "lhvC must follow hvcC atom"

    .line 150
    invoke-static {v13, v4}, Lqb1;->y(Ljava/lang/String;Z)V

    if-eqz v10, :cond_4b

    iget-object v4, v10, Lp21;->f:Ljava/lang/Object;

    check-cast v4, Lxm3;

    .line 151
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->size()I

    move-result v4

    const/4 v13, 0x2

    if-lt v4, v13, :cond_4a

    const/4 v4, 0x1

    goto :goto_3d

    :cond_4a
    const/4 v4, 0x0

    goto :goto_3d

    :cond_4b
    const/4 v4, 0x0

    const/4 v10, 0x0

    :goto_3d
    const-string v13, "must have at least two layers"

    .line 152
    invoke-static {v13, v4}, Lqb1;->y(Ljava/lang/String;Z)V

    .line 153
    invoke-virtual {v2, v1}, Lkz2;->E(I)V

    .line 154
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x1

    .line 155
    invoke-static {v2, v1, v10}, Lvf1;->a(Lkz2;ZLp21;)Lvf1;

    move-result-object v4

    .line 156
    iget v13, v9, Lts;->a:I

    iget v15, v4, Lvf1;->b:I

    if-ne v13, v15, :cond_4c

    move v13, v1

    goto :goto_3e

    :cond_4c
    const/4 v13, 0x0

    :goto_3e
    const-string v15, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms"

    .line 157
    invoke-static {v15, v13}, Lqb1;->y(Ljava/lang/String;Z)V

    iget v13, v4, Lvf1;->h:I

    const/4 v15, -0x1

    if-eq v13, v15, :cond_4e

    if-ne v3, v13, :cond_4d

    move v13, v1

    goto :goto_3f

    :cond_4d
    const/4 v13, 0x0

    :goto_3f
    const-string v1, "colorSpace must be the same for both views"

    .line 158
    invoke-static {v1, v13}, Lqb1;->y(Ljava/lang/String;Z)V

    :cond_4e
    iget v1, v4, Lvf1;->i:I

    if-eq v1, v15, :cond_50

    if-ne v11, v1, :cond_4f

    const/4 v1, 0x1

    goto :goto_40

    :cond_4f
    const/4 v1, 0x0

    :goto_40
    const-string v13, "colorRange must be the same for both views"

    .line 159
    invoke-static {v13, v1}, Lqb1;->y(Ljava/lang/String;Z)V

    :cond_50
    iget v1, v4, Lvf1;->j:I

    if-eq v1, v15, :cond_52

    if-ne v8, v1, :cond_51

    const/4 v1, 0x1

    goto :goto_41

    :cond_51
    const/4 v1, 0x0

    :goto_41
    const-string v13, "colorTransfer must be the same for both views"

    .line 160
    invoke-static {v13, v1}, Lqb1;->y(Ljava/lang/String;Z)V

    :cond_52
    iget v1, v4, Lvf1;->f:I

    if-ne v12, v1, :cond_53

    const/4 v1, 0x1

    goto :goto_42

    :cond_53
    const/4 v1, 0x0

    :goto_42
    const-string v13, "bitdepthLuma must be the same for both views"

    .line 161
    invoke-static {v13, v1}, Lqb1;->y(Ljava/lang/String;Z)V

    iget v1, v4, Lvf1;->g:I

    if-ne v6, v1, :cond_54

    const/4 v1, 0x1

    goto :goto_43

    :cond_54
    const/4 v1, 0x0

    :goto_43
    const-string v13, "bitdepthChroma must be the same for both views"

    .line 162
    invoke-static {v13, v1}, Lqb1;->y(Ljava/lang/String;Z)V

    if-eqz v0, :cond_55

    .line 163
    sget-object v1, Lxm3;->g:Lvm3;

    new-instance v1, Lum3;

    const/4 v13, 0x4

    .line 164
    invoke-direct {v1, v13}, Lrm3;-><init>(I)V

    .line 165
    invoke-virtual {v1, v0}, Lrm3;->b(Ljava/lang/Iterable;)V

    .line 166
    iget-object v0, v4, Lvf1;->a:Ljava/util/List;

    .line 167
    invoke-virtual {v1, v0}, Lrm3;->b(Ljava/lang/Iterable;)V

    .line 168
    invoke-virtual {v1}, Lum3;->f()Lsn3;

    move-result-object v0

    goto :goto_44

    :cond_55
    const-string v0, "initializationData must be already set from hvcC atom"

    const/4 v1, 0x0

    .line 169
    invoke-static {v0, v1}, Lqb1;->y(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    .line 170
    :goto_44
    iget-object v1, v4, Lvf1;->n:Ljava/lang/String;

    const-string v4, "video/mv-hevc"

    move-object/from16 v65, v1

    move-object v13, v4

    move-object/from16 v76, v5

    move/from16 v74, v6

    move-object/from16 v75, v9

    move/from16 v77, v11

    :goto_45
    move/from16 v73, v70

    :goto_46
    const/4 v6, 0x4

    :goto_47
    const/4 v11, -0x1

    :goto_48
    const v43, 0x76703038

    goto/16 :goto_6d

    :cond_56
    const v1, 0x76657875

    if-ne v4, v1, :cond_67

    add-int/lit8 v1, v69, 0x8

    .line 171
    invoke-virtual {v2, v1}, Lkz2;->E(I)V

    .line 172
    iget v1, v2, Lkz2;->b:I

    const/4 v4, 0x0

    :goto_49
    sub-int v15, v1, v69

    if-ge v15, v14, :cond_5f

    .line 173
    invoke-virtual {v2, v1}, Lkz2;->E(I)V

    .line 174
    invoke-virtual {v2}, Lkz2;->b()I

    move-result v15

    if-lez v15, :cond_57

    move/from16 v73, v1

    const/4 v1, 0x1

    goto :goto_4a

    :cond_57
    move/from16 v73, v1

    const/4 v1, 0x0

    .line 175
    :goto_4a
    invoke-static {v5, v1}, Lqb1;->y(Ljava/lang/String;Z)V

    .line 176
    invoke-virtual {v2}, Lkz2;->b()I

    move-result v1

    move/from16 v74, v6

    const v6, 0x65796573

    if-ne v1, v6, :cond_5e

    add-int/lit8 v1, v73, 0x8

    .line 177
    invoke-virtual {v2, v1}, Lkz2;->E(I)V

    .line 178
    iget v1, v2, Lkz2;->b:I

    :goto_4b
    sub-int v4, v1, v73

    if-ge v4, v15, :cond_5d

    .line 179
    invoke-virtual {v2, v1}, Lkz2;->E(I)V

    .line 180
    invoke-virtual {v2}, Lkz2;->b()I

    move-result v4

    if-lez v4, :cond_58

    const/4 v6, 0x1

    goto :goto_4c

    :cond_58
    const/4 v6, 0x0

    .line 181
    :goto_4c
    invoke-static {v5, v6}, Lqb1;->y(Ljava/lang/String;Z)V

    .line 182
    invoke-virtual {v2}, Lkz2;->b()I

    move-result v6

    move/from16 v75, v1

    const v1, 0x73747269

    if-ne v6, v1, :cond_5c

    const/4 v1, 0x4

    .line 183
    invoke-virtual {v2, v1}, Lkz2;->G(I)V

    .line 184
    invoke-virtual {v2}, Lkz2;->K()I

    move-result v1

    and-int/lit8 v4, v1, 0x1

    and-int/lit8 v6, v1, 0x2

    move/from16 v75, v1

    const/4 v1, 0x2

    if-ne v6, v1, :cond_59

    const/4 v1, 0x1

    goto :goto_4d

    :cond_59
    const/4 v1, 0x0

    :goto_4d
    and-int/lit8 v6, v75, 0x8

    move-object/from16 v76, v5

    const/16 v5, 0x8

    if-ne v6, v5, :cond_5a

    const/4 v5, 0x1

    :goto_4e
    const/4 v6, 0x1

    goto :goto_4f

    :cond_5a
    const/4 v5, 0x0

    goto :goto_4e

    :goto_4f
    if-eq v6, v4, :cond_5b

    const/4 v4, 0x0

    goto :goto_50

    :cond_5b
    const/4 v4, 0x1

    :goto_50
    new-instance v6, Lkf3;

    move/from16 v77, v11

    new-instance v11, Lk51;

    .line 185
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    iput-boolean v4, v11, Lk51;->a:Z

    iput-boolean v1, v11, Lk51;->b:Z

    iput-boolean v5, v11, Lk51;->c:Z

    const/16 v1, 0xb

    .line 186
    invoke-direct {v6, v1, v11}, Lkf3;-><init>(ILjava/lang/Object;)V

    move-object v4, v6

    goto :goto_51

    :cond_5c
    move-object/from16 v76, v5

    move/from16 v77, v11

    add-int v1, v75, v4

    goto :goto_4b

    :cond_5d
    move-object/from16 v76, v5

    move/from16 v77, v11

    const/4 v4, 0x0

    goto :goto_51

    :cond_5e
    move-object/from16 v76, v5

    move/from16 v77, v11

    :goto_51
    add-int v1, v73, v15

    move/from16 v6, v74

    move-object/from16 v5, v76

    move/from16 v11, v77

    goto/16 :goto_49

    :cond_5f
    move-object/from16 v76, v5

    move/from16 v74, v6

    move/from16 v77, v11

    if-nez v4, :cond_60

    const/4 v1, 0x0

    goto :goto_52

    .line 187
    :cond_60
    new-instance v1, Lof3;

    const/16 v5, 0x9

    invoke-direct {v1, v5, v4}, Lof3;-><init>(ILjava/lang/Object;)V

    :goto_52
    if-eqz v1, :cond_62

    .line 188
    iget-object v1, v1, Lof3;->g:Ljava/lang/Object;

    check-cast v1, Lkf3;

    if-eqz v10, :cond_64

    iget-object v4, v10, Lp21;->f:Ljava/lang/Object;

    check-cast v4, Lxm3;

    .line 189
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->size()I

    move-result v4

    const/4 v5, 0x2

    if-lt v4, v5, :cond_63

    .line 190
    iget-object v4, v1, Lkf3;->g:Ljava/lang/Object;

    check-cast v4, Lk51;

    .line 191
    iget-boolean v5, v4, Lk51;->a:Z

    if-eqz v5, :cond_61

    .line 192
    iget-boolean v4, v4, Lk51;->b:Z

    if-eqz v4, :cond_61

    const/4 v4, 0x1

    goto :goto_53

    :cond_61
    const/4 v4, 0x0

    .line 193
    :goto_53
    const-string v5, "both eye views must be marked as available"

    .line 194
    invoke-static {v5, v4}, Lqb1;->y(Ljava/lang/String;Z)V

    .line 195
    iget-object v1, v1, Lkf3;->g:Ljava/lang/Object;

    check-cast v1, Lk51;

    .line 196
    iget-boolean v1, v1, Lk51;->c:Z

    const/4 v6, 0x1

    xor-int/2addr v1, v6

    .line 197
    const-string v4, "for MV-HEVC, eye_views_reversed must be set to false"

    .line 198
    invoke-static {v4, v1}, Lqb1;->y(Ljava/lang/String;Z)V

    :cond_62
    move/from16 v82, v7

    move-object/from16 v75, v9

    move/from16 v71, v12

    move/from16 v73, v70

    const/4 v11, -0x1

    const v43, 0x76703038

    move-object/from16 v70, v10

    goto/16 :goto_67

    :cond_63
    :goto_54
    const/4 v6, 0x1

    const/4 v11, -0x1

    goto :goto_55

    :cond_64
    const/4 v10, 0x0

    goto :goto_54

    :goto_55
    if-ne v7, v11, :cond_66

    .line 199
    iget-object v1, v1, Lkf3;->g:Ljava/lang/Object;

    check-cast v1, Lk51;

    .line 200
    iget-boolean v1, v1, Lk51;->c:Z

    move-object/from16 v75, v9

    if-eq v6, v1, :cond_65

    move/from16 v73, v70

    const/4 v6, 0x4

    const/4 v7, 0x4

    goto/16 :goto_47

    :cond_65
    move/from16 v7, v16

    goto/16 :goto_45

    :cond_66
    move-object/from16 v75, v9

    move/from16 v73, v70

    const/4 v6, 0x4

    goto/16 :goto_48

    :cond_67
    move-object/from16 v76, v5

    move/from16 v74, v6

    move/from16 v77, v11

    const v1, 0x64766343

    if-eq v4, v1, :cond_68

    const v1, 0x64767643

    if-eq v4, v1, :cond_68

    const v1, 0x64767743

    if-ne v4, v1, :cond_69

    :cond_68
    move/from16 v82, v7

    move-object/from16 v75, v9

    move/from16 v71, v12

    move/from16 v7, v69

    move/from16 v73, v70

    const/4 v11, -0x1

    const v43, 0x76703038

    move-object/from16 v70, v10

    goto/16 :goto_6b

    :cond_69
    const v1, 0x76706343

    const/4 v5, 0x6

    if-ne v4, v1, :cond_6e

    add-int/lit8 v1, v69, 0xc

    if-nez v13, :cond_6a

    const/4 v3, 0x1

    :goto_56
    const/4 v4, 0x0

    goto :goto_57

    :cond_6a
    const/4 v3, 0x0

    goto :goto_56

    .line 201
    :goto_57
    invoke-static {v4, v3}, Lqb1;->y(Ljava/lang/String;Z)V

    .line 202
    invoke-virtual {v2, v1}, Lkz2;->E(I)V

    .line 203
    invoke-virtual {v2}, Lkz2;->K()I

    move-result v1

    int-to-byte v1, v1

    .line 204
    invoke-virtual {v2}, Lkz2;->K()I

    move-result v3

    int-to-byte v3, v3

    .line 205
    invoke-virtual {v2}, Lkz2;->K()I

    move-result v4

    shr-int/lit8 v6, v4, 0x4

    shr-int/lit8 v8, v4, 0x1

    const-string v11, "video/x-vnd.on2.vp9"

    move/from16 v15, v70

    const v12, 0x76703038

    if-ne v15, v12, :cond_6b

    const-string v13, "video/x-vnd.on2.vp8"

    goto :goto_58

    :cond_6b
    move-object v13, v11

    .line 206
    :goto_58
    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6c

    and-int/lit8 v0, v8, 0x7

    int-to-byte v8, v6

    .line 207
    sget-object v11, Lmo2;->a:[B

    int-to-byte v0, v0

    const/16 v11, 0xc

    new-array v12, v11, [B

    const/4 v11, 0x1

    const/16 v34, 0x0

    aput-byte v11, v12, v34

    aput-byte v11, v12, v11

    const/16 v23, 0x2

    aput-byte v1, v12, v23

    aput-byte v23, v12, v19

    const/16 v30, 0x4

    aput-byte v11, v12, v30

    aput-byte v3, v12, v16

    aput-byte v19, v12, v5

    aput-byte v11, v12, v44

    const/16 v20, 0x8

    aput-byte v8, v12, v20

    const/16 v71, 0x9

    aput-byte v30, v12, v71

    aput-byte v11, v12, v22

    const/16 v72, 0xb

    aput-byte v0, v12, v72

    .line 208
    invoke-static {v12}, Lxm3;->i(Ljava/lang/Object;)Lsn3;

    move-result-object v0

    goto :goto_59

    :cond_6c
    const/4 v11, 0x1

    :goto_59
    and-int/lit8 v1, v4, 0x1

    .line 209
    invoke-virtual {v2}, Lkz2;->K()I

    move-result v3

    .line 210
    invoke-virtual {v2}, Lkz2;->K()I

    move-result v4

    .line 211
    invoke-static {v3}, Ln74;->b(I)I

    move-result v3

    if-eq v11, v1, :cond_6d

    const/4 v1, 0x2

    goto :goto_5a

    :cond_6d
    const/4 v1, 0x1

    :goto_5a
    invoke-static {v4}, Ln74;->c(I)I

    move-result v4

    move/from16 v77, v1

    move v8, v4

    move v12, v6

    move/from16 v74, v12

    move-object/from16 v75, v9

    move/from16 v73, v15

    goto/16 :goto_46

    :cond_6e
    move/from16 v15, v70

    const v43, 0x76703038

    const v1, 0x61763143

    if-ne v4, v1, :cond_6f

    add-int/lit8 v0, v14, -0x8

    add-int/lit8 v1, v69, 0x8

    .line 212
    new-array v3, v0, [B

    const/4 v5, 0x0

    .line 213
    invoke-virtual {v2, v3, v5, v0}, Lkz2;->H([BII)V

    .line 214
    invoke-static {v3}, Lxm3;->i(Ljava/lang/Object;)Lsn3;

    move-result-object v0

    .line 215
    invoke-virtual {v2, v1}, Lkz2;->E(I)V

    .line 216
    invoke-static {v2}, Lej1;->h(Lkz2;)Ln74;

    move-result-object v1

    iget v3, v1, Ln74;->e:I

    iget v4, v1, Ln74;->f:I

    iget v5, v1, Ln74;->a:I

    iget v6, v1, Ln74;->b:I

    iget v1, v1, Ln74;->c:I

    const-string v8, "video/av01"

    move v12, v3

    move/from16 v74, v4

    move v3, v5

    move/from16 v77, v6

    move-object v13, v8

    move-object/from16 v75, v9

    move/from16 v73, v15

    const/4 v6, 0x4

    const/4 v11, -0x1

    move v8, v1

    goto/16 :goto_6d

    :cond_6f
    const v1, 0x636c6c69

    if-ne v4, v1, :cond_71

    if-nez v59, :cond_70

    const/16 v1, 0x19

    .line 217
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    sget-object v4, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v59

    :cond_70
    move-object/from16 v1, v59

    const/16 v4, 0x15

    .line 218
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 219
    invoke-virtual {v2}, Lkz2;->N()S

    move-result v4

    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 220
    invoke-virtual {v2}, Lkz2;->N()S

    move-result v4

    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    move-object/from16 v59, v1

    move-object/from16 v75, v9

    move/from16 v73, v15

    :goto_5b
    const/4 v6, 0x4

    :goto_5c
    const/4 v11, -0x1

    goto/16 :goto_6d

    :cond_71
    const v1, 0x6d646376

    if-ne v4, v1, :cond_73

    if-nez v59, :cond_72

    const/16 v1, 0x19

    .line 221
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    sget-object v4, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v59

    :cond_72
    move-object/from16 v1, v59

    .line 222
    invoke-virtual {v2}, Lkz2;->N()S

    move-result v4

    .line 223
    invoke-virtual {v2}, Lkz2;->N()S

    move-result v5

    .line 224
    invoke-virtual {v2}, Lkz2;->N()S

    move-result v6

    .line 225
    invoke-virtual {v2}, Lkz2;->N()S

    move-result v11

    move-object/from16 v70, v10

    .line 226
    invoke-virtual {v2}, Lkz2;->N()S

    move-result v10

    move/from16 v71, v12

    .line 227
    invoke-virtual {v2}, Lkz2;->N()S

    move-result v12

    move/from16 v73, v15

    .line 228
    invoke-virtual {v2}, Lkz2;->N()S

    move-result v15

    move-object/from16 v75, v9

    .line 229
    invoke-virtual {v2}, Lkz2;->N()S

    move-result v9

    .line 230
    invoke-virtual {v2}, Lkz2;->P()J

    move-result-wide v78

    .line 231
    invoke-virtual {v2}, Lkz2;->P()J

    move-result-wide v80

    move/from16 v82, v7

    const/4 v7, 0x1

    .line 232
    invoke-virtual {v1, v7}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 233
    invoke-virtual {v1, v10}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 234
    invoke-virtual {v1, v12}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 235
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 236
    invoke-virtual {v1, v5}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 237
    invoke-virtual {v1, v6}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 238
    invoke-virtual {v1, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 239
    invoke-virtual {v1, v15}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 240
    invoke-virtual {v1, v9}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    const-wide/16 v4, 0x2710

    div-long v4, v78, v4

    long-to-int v4, v4

    int-to-short v4, v4

    .line 241
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    const-wide/16 v4, 0x2710

    div-long v4, v80, v4

    long-to-int v4, v4

    int-to-short v4, v4

    .line 242
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    move-object/from16 v59, v1

    :goto_5d
    move-object/from16 v10, v70

    move/from16 v12, v71

    move/from16 v7, v82

    goto/16 :goto_5b

    :cond_73
    move/from16 v82, v7

    move-object/from16 v75, v9

    move-object/from16 v70, v10

    move/from16 v71, v12

    move/from16 v73, v15

    const v1, 0x64323633

    if-ne v4, v1, :cond_75

    if-nez v13, :cond_74

    const/4 v9, 0x1

    :goto_5e
    const/4 v1, 0x0

    goto :goto_5f

    :cond_74
    const/4 v9, 0x0

    goto :goto_5e

    .line 243
    :goto_5f
    invoke-static {v1, v9}, Lqb1;->y(Ljava/lang/String;Z)V

    move-object/from16 v13, v41

    goto :goto_5d

    :cond_75
    const/4 v1, 0x0

    const v6, 0x65736473

    if-ne v4, v6, :cond_78

    if-nez v13, :cond_76

    const/4 v9, 0x1

    goto :goto_60

    :cond_76
    const/4 v9, 0x0

    .line 244
    :goto_60
    invoke-static {v1, v9}, Lqb1;->y(Ljava/lang/String;Z)V

    move/from16 v7, v69

    .line 245
    invoke-static {v7, v2}, Lej1;->j(ILkz2;)Lcj1;

    move-result-object v4

    .line 246
    iget-object v5, v4, Lcj1;->h:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    .line 247
    iget-object v7, v4, Lcj1;->i:Ljava/lang/Object;

    check-cast v7, [B

    if-eqz v7, :cond_77

    .line 248
    invoke-static {v7}, Lxm3;->i(Ljava/lang/Object;)Lsn3;

    move-result-object v0

    :cond_77
    move-object/from16 v64, v4

    move-object v13, v5

    goto :goto_5d

    :cond_78
    move/from16 v7, v69

    const v9, 0x62747274

    if-ne v4, v9, :cond_79

    add-int/lit8 v4, v7, 0x8

    .line 249
    invoke-virtual {v2, v4}, Lkz2;->E(I)V

    const/4 v4, 0x4

    .line 250
    invoke-virtual {v2, v4}, Lkz2;->G(I)V

    .line 251
    invoke-virtual {v2}, Lkz2;->P()J

    move-result-wide v4

    .line 252
    invoke-virtual {v2}, Lkz2;->P()J

    move-result-wide v9

    new-instance v7, Lib1;

    invoke-direct {v7, v9, v10, v4, v5}, Lib1;-><init>(JJ)V

    move-object/from16 v63, v7

    goto :goto_5d

    :cond_79
    const v9, 0x70617370

    if-ne v4, v9, :cond_7a

    add-int/lit8 v4, v7, 0x8

    .line 253
    invoke-virtual {v2, v4}, Lkz2;->E(I)V

    .line 254
    invoke-virtual {v2}, Lkz2;->h()I

    move-result v4

    .line 255
    invoke-virtual {v2}, Lkz2;->h()I

    move-result v5

    int-to-float v4, v4

    int-to-float v5, v5

    div-float/2addr v4, v5

    move/from16 v61, v4

    move-object/from16 v10, v70

    move/from16 v12, v71

    move/from16 v7, v82

    const/4 v6, 0x4

    const/4 v11, -0x1

    const/16 v55, 0x1

    goto/16 :goto_6d

    :cond_7a
    const v9, 0x73763364

    if-ne v4, v9, :cond_7d

    add-int/lit8 v4, v7, 0x8

    :goto_61
    sub-int v5, v4, v7

    if-ge v5, v14, :cond_7c

    .line 256
    invoke-virtual {v2, v4}, Lkz2;->E(I)V

    .line 257
    invoke-virtual {v2}, Lkz2;->b()I

    move-result v5

    add-int/2addr v5, v4

    .line 258
    invoke-virtual {v2}, Lkz2;->b()I

    move-result v9

    const v10, 0x70726f6a

    if-ne v9, v10, :cond_7b

    .line 259
    iget-object v7, v2, Lkz2;->a:[B

    .line 260
    invoke-static {v7, v4, v5}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v62

    goto/16 :goto_5d

    :cond_7b
    move v4, v5

    goto :goto_61

    :cond_7c
    move-object/from16 v62, v1

    goto/16 :goto_5d

    :cond_7d
    const v9, 0x73743364

    if-ne v4, v9, :cond_83

    .line 261
    invoke-virtual {v2}, Lkz2;->K()I

    move-result v4

    move/from16 v9, v19

    .line 262
    invoke-virtual {v2, v9}, Lkz2;->G(I)V

    if-nez v4, :cond_7e

    .line 263
    invoke-virtual {v2}, Lkz2;->K()I

    move-result v4

    if-eqz v4, :cond_82

    const/4 v10, 0x1

    if-eq v4, v10, :cond_81

    const/4 v5, 0x2

    if-eq v4, v5, :cond_80

    if-eq v4, v9, :cond_7f

    :cond_7e
    const/4 v11, -0x1

    goto/16 :goto_67

    :cond_7f
    move v7, v9

    move-object/from16 v10, v70

    move/from16 v12, v71

    goto/16 :goto_5b

    :cond_80
    move-object/from16 v10, v70

    move/from16 v12, v71

    const/4 v6, 0x4

    const/4 v7, 0x2

    goto/16 :goto_5c

    :cond_81
    move-object/from16 v10, v70

    move/from16 v12, v71

    const/4 v6, 0x4

    const/4 v7, 0x1

    goto/16 :goto_5c

    :cond_82
    move-object/from16 v10, v70

    move/from16 v12, v71

    const/4 v6, 0x4

    const/4 v7, 0x0

    goto/16 :goto_5c

    :cond_83
    move/from16 v9, v19

    const v10, 0x61707643

    if-ne v4, v10, :cond_8a

    add-int/lit8 v0, v7, 0xc

    add-int/lit8 v3, v14, -0xc

    .line 264
    new-array v4, v3, [B

    .line 265
    invoke-virtual {v2, v0}, Lkz2;->E(I)V

    const/4 v10, 0x0

    .line 266
    invoke-virtual {v2, v4, v10, v3}, Lkz2;->H([BII)V

    .line 267
    sget-object v0, Lmo2;->a:[B

    const/16 v0, 0x11

    if-lt v3, v0, :cond_84

    const/4 v0, 0x1

    goto :goto_62

    :cond_84
    move v0, v10

    .line 268
    :goto_62
    const-string v7, "Invalid APV CSD length: %s"

    invoke-static {v3, v7, v0}, Lzt0;->R(ILjava/lang/String;Z)V

    .line 269
    aget-byte v0, v4, v10

    const/4 v10, 0x1

    if-ne v0, v10, :cond_85

    const/4 v3, 0x1

    goto :goto_63

    :cond_85
    const/4 v3, 0x0

    :goto_63
    const-string v7, "Invalid APV CSD version: %s"

    invoke-static {v0, v7, v3}, Lzt0;->R(ILjava/lang/String;Z)V

    .line 270
    aget-byte v0, v4, v16

    .line 271
    aget-byte v3, v4, v5

    .line 272
    aget-byte v7, v4, v44

    .line 273
    sget-object v8, Lv23;->a:Ljava/lang/String;

    sget-object v8, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 274
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v10, "apv1.apvf"

    invoke-direct {v8, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 275
    const-string v0, ".apvl"

    .line 276
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 277
    const-string v0, ".apvb"

    .line 278
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 279
    invoke-static {v4}, Lxm3;->i(Ljava/lang/Object;)Lsn3;

    move-result-object v0

    new-instance v3, Lkz2;

    .line 280
    invoke-direct {v3, v4}, Lkz2;-><init>([B)V

    .line 281
    new-instance v7, Llg1;

    array-length v8, v4

    invoke-direct {v7, v8, v4}, Llg1;-><init>(I[B)V

    .line 282
    iget v3, v3, Lkz2;->b:I

    const/16 v4, 0x8

    mul-int/2addr v3, v4

    .line 283
    invoke-virtual {v7, v3}, Llg1;->l(I)V

    const/4 v11, 0x1

    .line 284
    invoke-virtual {v7, v11}, Llg1;->x(I)V

    .line 285
    invoke-virtual {v7, v4}, Llg1;->r(I)I

    move-result v3

    const/4 v1, 0x0

    const/4 v8, -0x1

    const/4 v12, -0x1

    const/4 v13, -0x1

    const/4 v15, -0x1

    const/16 v17, -0x1

    :goto_64
    if-ge v1, v3, :cond_89

    .line 286
    invoke-virtual {v7, v11}, Llg1;->x(I)V

    .line 287
    invoke-virtual {v7, v4}, Llg1;->r(I)I

    move-result v6

    const/4 v9, 0x0

    :goto_65
    if-ge v9, v6, :cond_88

    .line 288
    invoke-virtual {v7, v5}, Llg1;->o(I)V

    .line 289
    invoke-virtual {v7}, Llg1;->q()Z

    move-result v15

    .line 290
    invoke-virtual {v7}, Llg1;->m()V

    const/16 v5, 0xb

    .line 291
    invoke-virtual {v7, v5}, Llg1;->x(I)V

    const/4 v5, 0x4

    .line 292
    invoke-virtual {v7, v5}, Llg1;->o(I)V

    .line 293
    invoke-virtual {v7, v5}, Llg1;->r(I)I

    move-result v17

    add-int/lit8 v17, v17, 0x8

    .line 294
    invoke-virtual {v7, v11}, Llg1;->x(I)V

    if-eqz v15, :cond_87

    .line 295
    invoke-virtual {v7, v4}, Llg1;->r(I)I

    move-result v5

    .line 296
    invoke-virtual {v7, v4}, Llg1;->r(I)I

    move-result v8

    .line 297
    invoke-virtual {v7, v11}, Llg1;->x(I)V

    .line 298
    invoke-virtual {v7}, Llg1;->q()Z

    move-result v4

    .line 299
    invoke-static {v5}, Ln74;->b(I)I

    move-result v5

    if-eq v11, v4, :cond_86

    const/4 v4, 0x2

    goto :goto_66

    :cond_86
    const/4 v4, 0x1

    .line 300
    :goto_66
    invoke-static {v8}, Ln74;->c(I)I

    move-result v13

    move v12, v4

    move v8, v5

    :cond_87
    add-int/lit8 v9, v9, 0x1

    move/from16 v15, v17

    const/16 v4, 0x8

    const/4 v5, 0x6

    const/4 v11, 0x1

    goto :goto_65

    :cond_88
    add-int/lit8 v1, v1, 0x1

    const/16 v4, 0x8

    const/4 v5, 0x6

    const v6, 0x65736473

    const/4 v9, 0x3

    const/4 v11, 0x1

    goto :goto_64

    .line 301
    :cond_89
    new-instance v1, Ln74;

    .line 302
    const-string v1, "video/apv"

    move v3, v8

    move-object/from16 v65, v10

    move/from16 v77, v12

    move v8, v13

    move v12, v15

    move/from16 v74, v17

    move-object/from16 v10, v70

    move/from16 v7, v82

    const/4 v6, 0x4

    const/4 v11, -0x1

    move-object v13, v1

    goto/16 :goto_6d

    :cond_8a
    const v1, 0x636f6c72

    if-ne v4, v1, :cond_7e

    const/4 v11, -0x1

    if-ne v3, v11, :cond_8c

    if-ne v8, v11, :cond_91

    .line 303
    invoke-virtual {v2}, Lkz2;->b()I

    move-result v1

    const v3, 0x6e636c78

    if-eq v1, v3, :cond_8d

    const v3, 0x6e636c63

    if-ne v1, v3, :cond_8b

    goto :goto_68

    .line 304
    :cond_8b
    const-string v3, "Unsupported color type: "

    .line 305
    invoke-static {v1}, Ltd;->g(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, La30;->x(Ljava/lang/String;)V

    move v3, v11

    move v8, v3

    :cond_8c
    :goto_67
    move-object/from16 v10, v70

    move/from16 v12, v71

    move/from16 v7, v82

    goto/16 :goto_38

    .line 306
    :cond_8d
    :goto_68
    invoke-virtual {v2}, Lkz2;->L()I

    move-result v1

    .line 307
    invoke-virtual {v2}, Lkz2;->L()I

    move-result v3

    const/4 v5, 0x2

    .line 308
    invoke-virtual {v2, v5}, Lkz2;->G(I)V

    const/16 v4, 0x13

    if-ne v14, v4, :cond_8f

    .line 309
    invoke-virtual {v2}, Lkz2;->K()I

    move-result v5

    and-int/lit16 v5, v5, 0x80

    if-eqz v5, :cond_8e

    move v14, v4

    const/4 v9, 0x1

    goto :goto_69

    :cond_8e
    move v14, v4

    :cond_8f
    const/4 v9, 0x0

    .line 310
    :goto_69
    invoke-static {v1}, Ln74;->b(I)I

    move-result v1

    const/4 v10, 0x1

    if-eq v10, v9, :cond_90

    const/4 v7, 0x2

    goto :goto_6a

    :cond_90
    const/4 v7, 0x1

    :goto_6a
    invoke-static {v3}, Ln74;->c(I)I

    move-result v3

    move v8, v3

    move/from16 v77, v7

    move-object/from16 v10, v70

    move/from16 v12, v71

    move/from16 v7, v82

    const/4 v6, 0x4

    move v3, v1

    goto :goto_6d

    :cond_91
    move v3, v11

    goto :goto_67

    :goto_6b
    add-int/lit8 v1, v14, -0x8

    add-int/lit8 v4, v7, 0x8

    .line 311
    new-array v5, v1, [B

    const/4 v10, 0x0

    .line 312
    invoke-virtual {v2, v5, v10, v1}, Lkz2;->H([BII)V

    if-eqz v0, :cond_92

    .line 313
    sget-object v1, Lxm3;->g:Lvm3;

    new-instance v1, Lum3;

    const/4 v6, 0x4

    .line 314
    invoke-direct {v1, v6}, Lrm3;-><init>(I)V

    .line 315
    invoke-virtual {v1, v0}, Lrm3;->b(Ljava/lang/Iterable;)V

    .line 316
    invoke-virtual {v1, v5}, Lrm3;->a(Ljava/lang/Object;)V

    .line 317
    invoke-virtual {v1}, Lum3;->f()Lsn3;

    move-result-object v0

    goto :goto_6c

    :cond_92
    const/4 v6, 0x4

    .line 318
    const-string v0, "initializationData must already be set from hvcC or avcC atom"

    .line 319
    invoke-static {v0, v10}, Lqb1;->y(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    .line 320
    :goto_6c
    invoke-virtual {v2, v4}, Lkz2;->E(I)V

    .line 321
    invoke-static {v2}, Lcs3;->a(Lkz2;)Lcs3;

    move-result-object v1

    if-eqz v1, :cond_93

    iget-object v10, v1, Lcs3;->g:Ljava/lang/String;

    const-string v1, "video/dolby-vision"

    move-object v13, v1

    move-object/from16 v65, v10

    :cond_93
    move-object/from16 v10, v70

    move/from16 v12, v71

    move/from16 v7, v82

    :goto_6d
    add-int v14, v68, v14

    move/from16 v4, v67

    move/from16 v15, v73

    move/from16 v6, v74

    move-object/from16 v9, v75

    move-object/from16 v5, v76

    move/from16 v11, v77

    const/16 v19, 0x3

    goto/16 :goto_32

    :goto_6e
    if-nez v13, :cond_94

    move-object/from16 v0, v49

    move/from16 v4, v60

    move/from16 v5, v66

    move-object/from16 v9, v75

    goto/16 :goto_71

    .line 322
    :cond_94
    new-instance v1, Lgg4;

    .line 323
    invoke-direct {v1}, Lgg4;-><init>()V

    move/from16 v5, v66

    .line 324
    invoke-virtual {v1, v5}, Lgg4;->c(I)V

    .line 325
    invoke-virtual {v1, v13}, Lgg4;->e(Ljava/lang/String;)V

    move-object/from16 v4, v65

    .line 326
    iput-object v4, v1, Lgg4;->i:Ljava/lang/String;

    move/from16 v4, v58

    .line 327
    iput v4, v1, Lgg4;->s:I

    move/from16 v4, v57

    .line 328
    iput v4, v1, Lgg4;->t:I

    move/from16 v4, v56

    .line 329
    iput v4, v1, Lgg4;->u:I

    move/from16 v4, v54

    .line 330
    iput v4, v1, Lgg4;->v:I

    move/from16 v4, v61

    .line 331
    iput v4, v1, Lgg4;->y:F

    move/from16 v4, v60

    .line 332
    iput v4, v1, Lgg4;->x:I

    move-object/from16 v7, v62

    .line 333
    iput-object v7, v1, Lgg4;->z:[B

    move/from16 v7, v82

    .line 334
    iput v7, v1, Lgg4;->A:I

    .line 335
    iput-object v0, v1, Lgg4;->o:Ljava/util/List;

    move/from16 v0, v53

    .line 336
    iput v0, v1, Lgg4;->n:I

    move/from16 v0, v51

    .line 337
    iput v0, v1, Lgg4;->C:I

    move-object/from16 v0, v50

    .line 338
    iput-object v0, v1, Lgg4;->p:Lie4;

    move-object/from16 v0, v49

    .line 339
    iput-object v0, v1, Lgg4;->d:Ljava/lang/String;

    if-eqz v59, :cond_95

    .line 340
    invoke-virtual/range {v59 .. v59}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v7

    move-object/from16 v57, v7

    goto :goto_6f

    :cond_95
    const/16 v57, 0x0

    .line 341
    :goto_6f
    new-instance v53, Ln74;

    move/from16 v54, v3

    move/from16 v56, v8

    move/from16 v58, v71

    move/from16 v59, v74

    move/from16 v55, v77

    invoke-direct/range {v53 .. v59}, Ln74;-><init>(III[BII)V

    move-object/from16 v3, v53

    .line 342
    iput-object v3, v1, Lgg4;->B:Ln74;

    move-object/from16 v3, v63

    if-eqz v3, :cond_96

    .line 343
    iget-wide v7, v3, Lib1;->a:J

    .line 344
    invoke-static {v7, v8}, Lzt0;->G(J)I

    move-result v7

    .line 345
    iput v7, v1, Lgg4;->g:I

    .line 346
    iget-wide v7, v3, Lib1;->b:J

    .line 347
    invoke-static {v7, v8}, Lzt0;->G(J)I

    move-result v3

    .line 348
    iput v3, v1, Lgg4;->h:I

    goto :goto_70

    :cond_96
    move-object/from16 v3, v64

    if-eqz v3, :cond_97

    .line 349
    iget-wide v7, v3, Lcj1;->f:J

    .line 350
    invoke-static {v7, v8}, Lzt0;->G(J)I

    move-result v7

    .line 351
    iput v7, v1, Lgg4;->g:I

    .line 352
    iget-wide v7, v3, Lcj1;->g:J

    .line 353
    invoke-static {v7, v8}, Lzt0;->G(J)I

    move-result v3

    .line 354
    iput v3, v1, Lgg4;->h:I

    .line 355
    :cond_97
    :goto_70
    new-instance v3, Lph4;

    .line 356
    invoke-direct {v3, v1}, Lph4;-><init>(Lgg4;)V

    move-object/from16 v9, v75

    .line 357
    iput-object v3, v9, Lts;->d:Ljava/lang/Object;

    :goto_71
    add-int v3, v38, v67

    .line 358
    invoke-virtual {v2, v3}, Lkz2;->E(I)V

    add-int/lit8 v10, v32, 0x1

    move-object v1, v0

    move v12, v4

    move v6, v5

    move v0, v11

    move/from16 v4, v18

    move/from16 v8, v21

    move/from16 v3, v31

    move/from16 v13, v35

    move/from16 v15, v37

    move-object/from16 v11, v47

    move-object/from16 v14, v48

    move/from16 v7, v52

    const/16 v5, 0xc

    const/16 v19, 0x3

    const/16 v23, 0x2

    goto/16 :goto_20

    :cond_98
    move/from16 v31, v3

    move v5, v6

    move/from16 v52, v7

    move-object/from16 v47, v11

    move/from16 v35, v13

    move-object/from16 v48, v14

    if-nez p5, :cond_9f

    const v0, 0x65647473

    move-object/from16 v1, v48

    .line 359
    invoke-virtual {v1, v0}, Lm43;->j(I)Lm43;

    move-result-object v0

    if-eqz v0, :cond_9e

    const v2, 0x656c7374

    .line 360
    invoke-virtual {v0, v2}, Lm43;->i(I)Lp43;

    move-result-object v0

    if-nez v0, :cond_99

    const/4 v3, 0x0

    goto :goto_75

    :cond_99
    iget-object v0, v0, Lp43;->c:Lkz2;

    const/16 v4, 0x8

    .line 361
    invoke-virtual {v0, v4}, Lkz2;->E(I)V

    .line 362
    invoke-virtual {v0}, Lkz2;->b()I

    move-result v2

    invoke-static {v2}, Lej1;->a(I)I

    move-result v2

    .line 363
    invoke-virtual {v0}, Lkz2;->h()I

    move-result v3

    new-array v4, v3, [J

    new-array v6, v3, [J

    const/4 v10, 0x0

    :goto_72
    if-ge v10, v3, :cond_9d

    const/4 v11, 0x1

    if-ne v2, v11, :cond_9a

    .line 364
    invoke-virtual {v0}, Lkz2;->j()J

    move-result-wide v7

    goto :goto_73

    :cond_9a
    invoke-virtual {v0}, Lkz2;->P()J

    move-result-wide v7

    :goto_73
    aput-wide v7, v4, v10

    if-ne v2, v11, :cond_9b

    .line 365
    invoke-virtual {v0}, Lkz2;->d()J

    move-result-wide v7

    goto :goto_74

    :cond_9b
    invoke-virtual {v0}, Lkz2;->b()I

    move-result v7

    int-to-long v7, v7

    :goto_74
    aput-wide v7, v6, v10

    .line 366
    invoke-virtual {v0}, Lkz2;->N()S

    move-result v7

    if-ne v7, v11, :cond_9c

    const/4 v13, 0x2

    .line 367
    invoke-virtual {v0, v13}, Lkz2;->G(I)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_72

    .line 368
    :cond_9c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported media rate."

    .line 369
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 370
    :cond_9d
    invoke-static {v4, v6}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v3

    :goto_75
    if-eqz v3, :cond_9e

    .line 371
    iget-object v0, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, [J

    .line 372
    iget-object v2, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    move-object v3, v2

    check-cast v3, [J

    move-object/from16 v32, v0

    move-object/from16 v33, v3

    goto :goto_77

    :cond_9e
    :goto_76
    const/16 v32, 0x0

    const/16 v33, 0x0

    goto :goto_77

    :cond_9f
    move-object/from16 v1, v48

    goto :goto_76

    :goto_77
    iget-object v0, v9, Lts;->d:Ljava/lang/Object;

    check-cast v0, Lph4;

    if-nez v0, :cond_a0

    move-object/from16 v0, p7

    goto/16 :goto_2

    :cond_a0
    move/from16 v2, v52

    if-eqz v2, :cond_a2

    new-instance v3, Lj43;

    invoke-direct {v3, v2}, Lj43;-><init>(I)V

    .line 373
    new-instance v2, Lgg4;

    invoke-direct {v2, v0}, Lgg4;-><init>(Lph4;)V

    .line 374
    iget-object v0, v0, Lph4;->k:Lwn1;

    if-eqz v0, :cond_a1

    const/4 v10, 0x1

    new-array v4, v10, [Len1;

    const/16 v34, 0x0

    aput-object v3, v4, v34

    .line 375
    invoke-virtual {v0, v4}, Lwn1;->c([Len1;)Lwn1;

    move-result-object v0

    goto :goto_78

    :cond_a1
    const/4 v10, 0x1

    const/16 v34, 0x0

    .line 376
    new-instance v0, Lwn1;

    new-array v4, v10, [Len1;

    aput-object v3, v4, v34

    .line 377
    invoke-direct {v0, v4}, Lwn1;-><init>([Len1;)V

    .line 378
    :goto_78
    iput-object v0, v2, Lgg4;->j:Lwn1;

    .line 379
    new-instance v0, Lph4;

    .line 380
    invoke-direct {v0, v2}, Lph4;-><init>(Lgg4;)V

    goto :goto_79

    :cond_a2
    const/16 v34, 0x0

    .line 381
    :goto_79
    new-instance v17, Lqj1;

    iget v2, v9, Lts;->b:I

    iget-object v3, v9, Lts;->c:Ljava/lang/Object;

    move-object/from16 v30, v3

    check-cast v30, [Lrj1;

    iget v3, v9, Lts;->a:I

    move/from16 v18, v5

    move-wide/from16 v24, v28

    move/from16 v19, v31

    move-wide/from16 v22, v39

    move-wide/from16 v20, v45

    move-object/from16 v28, v0

    move/from16 v29, v2

    move/from16 v31, v3

    invoke-direct/range {v17 .. v33}, Lqj1;-><init>(IIJJJJLph4;I[Lrj1;I[J[J)V

    move-object/from16 v0, p7

    move-object/from16 v15, v17

    .line 382
    :goto_7a
    invoke-interface {v0, v15}, Lzk3;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lqj1;

    if-eqz v2, :cond_a3

    const v3, 0x6d646961

    .line 383
    invoke-virtual {v1, v3}, Lm43;->j(I)Lm43;

    move-result-object v1

    .line 384
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v3, 0x6d696e66

    .line 385
    invoke-virtual {v1, v3}, Lm43;->j(I)Lm43;

    move-result-object v1

    .line 386
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v8, 0x7374626c

    .line 387
    invoke-virtual {v1, v8}, Lm43;->j(I)Lm43;

    move-result-object v1

    .line 388
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v3, p1

    .line 389
    invoke-static {v2, v1, v3}, Lej1;->g(Lqj1;Lm43;Luf1;)Ltj1;

    move-result-object v1

    move-object/from16 v2, v47

    .line 390
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7b

    :cond_a3
    move-object/from16 v3, p1

    move-object/from16 v2, v47

    :goto_7b
    add-int/lit8 v13, v35, 0x1

    move-object/from16 v0, p0

    move-object v11, v2

    goto/16 :goto_0

    :cond_a4
    move-object v2, v11

    return-object v2
.end method

.method public static c(Lp43;)Lwn1;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lp43;->c:Lkz2;

    .line 4
    .line 5
    const/16 v0, 0x8

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lkz2;->E(I)V

    .line 8
    .line 9
    .line 10
    new-instance v2, Lwn1;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    new-array v4, v3, [Len1;

    .line 14
    .line 15
    invoke-direct {v2, v4}, Lwn1;-><init>([Len1;)V

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-virtual {v1}, Lkz2;->B()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-lt v4, v0, :cond_42

    .line 23
    .line 24
    iget v4, v1, Lkz2;->b:I

    .line 25
    .line 26
    invoke-virtual {v1}, Lkz2;->b()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    add-int/2addr v5, v4

    .line 31
    invoke-virtual {v1}, Lkz2;->b()I

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    const v7, 0x6d657461

    .line 36
    .line 37
    .line 38
    const/16 v9, 0xd

    .line 39
    .line 40
    const/4 v11, 0x1

    .line 41
    const/4 v13, 0x0

    .line 42
    if-ne v6, v7, :cond_33

    .line 43
    .line 44
    invoke-virtual {v1, v4}, Lkz2;->E(I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v0}, Lkz2;->G(I)V

    .line 48
    .line 49
    .line 50
    invoke-static {v1}, Lej1;->f(Lkz2;)V

    .line 51
    .line 52
    .line 53
    :goto_1
    iget v4, v1, Lkz2;->b:I

    .line 54
    .line 55
    if-ge v4, v5, :cond_2f

    .line 56
    .line 57
    invoke-virtual {v1}, Lkz2;->b()I

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    add-int/2addr v6, v4

    .line 62
    invoke-virtual {v1}, Lkz2;->b()I

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    const v14, 0x696c7374

    .line 67
    .line 68
    .line 69
    if-ne v7, v14, :cond_31

    .line 70
    .line 71
    invoke-virtual {v1, v4}, Lkz2;->E(I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, v0}, Lkz2;->G(I)V

    .line 75
    .line 76
    .line 77
    new-instance v4, Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 80
    .line 81
    .line 82
    :goto_2
    iget v7, v1, Lkz2;->b:I

    .line 83
    .line 84
    if-ge v7, v6, :cond_2e

    .line 85
    .line 86
    invoke-virtual {v1}, Lkz2;->b()I

    .line 87
    .line 88
    .line 89
    move-result v14

    .line 90
    add-int/2addr v14, v7

    .line 91
    invoke-virtual {v1}, Lkz2;->b()I

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    shr-int/lit8 v15, v7, 0x18

    .line 96
    .line 97
    and-int/lit16 v15, v15, 0xff

    .line 98
    .line 99
    const-string v0, "Skipped unknown metadata entry: "

    .line 100
    .line 101
    const/16 v8, 0xa9

    .line 102
    .line 103
    const v16, 0xffffff

    .line 104
    .line 105
    .line 106
    const/16 v17, -0x1

    .line 107
    .line 108
    const-string v12, "TCON"

    .line 109
    .line 110
    const v10, 0x64617461

    .line 111
    .line 112
    .line 113
    if-eq v15, v8, :cond_1d

    .line 114
    .line 115
    const/16 v8, 0xfd

    .line 116
    .line 117
    if-ne v15, v8, :cond_0

    .line 118
    .line 119
    goto/16 :goto_9

    .line 120
    .line 121
    :cond_0
    const v8, 0x676e7265

    .line 122
    .line 123
    .line 124
    if-ne v7, v8, :cond_2

    .line 125
    .line 126
    :try_start_0
    invoke-static {v1}, Lwl2;->S(Lkz2;)I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    add-int/lit8 v0, v0, -0x1

    .line 131
    .line 132
    invoke-static {v0}, Lxh1;->a(I)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    if-eqz v0, :cond_1

    .line 137
    .line 138
    new-instance v7, Lbi1;

    .line 139
    .line 140
    invoke-static {v0}, Lxm3;->i(Ljava/lang/Object;)Lsn3;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-direct {v7, v12, v13, v0}, Lbi1;-><init>(Ljava/lang/String;Ljava/lang/String;Lsn3;)V

    .line 145
    .line 146
    .line 147
    goto/16 :goto_c

    .line 148
    .line 149
    :catchall_0
    move-exception v0

    .line 150
    goto/16 :goto_d

    .line 151
    .line 152
    :cond_1
    const-string v0, "Failed to parse standard genre code"

    .line 153
    .line 154
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    :goto_3
    move-object v7, v13

    .line 158
    goto/16 :goto_c

    .line 159
    .line 160
    :cond_2
    const v8, 0x6469736b

    .line 161
    .line 162
    .line 163
    if-ne v7, v8, :cond_3

    .line 164
    .line 165
    const-string v0, "TPOS"

    .line 166
    .line 167
    invoke-static {v8, v0, v1}, Lwl2;->V(ILjava/lang/String;Lkz2;)Lbi1;

    .line 168
    .line 169
    .line 170
    move-result-object v7

    .line 171
    goto/16 :goto_c

    .line 172
    .line 173
    :cond_3
    const v8, 0x74726b6e

    .line 174
    .line 175
    .line 176
    if-ne v7, v8, :cond_4

    .line 177
    .line 178
    const-string v0, "TRCK"

    .line 179
    .line 180
    invoke-static {v8, v0, v1}, Lwl2;->V(ILjava/lang/String;Lkz2;)Lbi1;

    .line 181
    .line 182
    .line 183
    move-result-object v7

    .line 184
    goto/16 :goto_c

    .line 185
    .line 186
    :cond_4
    const v8, 0x746d706f

    .line 187
    .line 188
    .line 189
    if-ne v7, v8, :cond_5

    .line 190
    .line 191
    const-string v0, "TBPM"

    .line 192
    .line 193
    invoke-static {v8, v0, v1, v11, v3}, Lwl2;->Q(ILjava/lang/String;Lkz2;ZZ)Lwh1;

    .line 194
    .line 195
    .line 196
    move-result-object v7

    .line 197
    goto/16 :goto_c

    .line 198
    .line 199
    :cond_5
    const v8, 0x6370696c

    .line 200
    .line 201
    .line 202
    if-ne v7, v8, :cond_6

    .line 203
    .line 204
    const-string v0, "TCMP"

    .line 205
    .line 206
    invoke-static {v8, v0, v1, v11, v11}, Lwl2;->Q(ILjava/lang/String;Lkz2;ZZ)Lwh1;

    .line 207
    .line 208
    .line 209
    move-result-object v7

    .line 210
    goto/16 :goto_c

    .line 211
    .line 212
    :cond_6
    const v8, 0x636f7672

    .line 213
    .line 214
    .line 215
    if-ne v7, v8, :cond_b

    .line 216
    .line 217
    const-string v0, "Unrecognized cover art flags: "

    .line 218
    .line 219
    invoke-virtual {v1}, Lkz2;->b()I

    .line 220
    .line 221
    .line 222
    move-result v7

    .line 223
    invoke-virtual {v1}, Lkz2;->b()I

    .line 224
    .line 225
    .line 226
    move-result v8

    .line 227
    if-ne v8, v10, :cond_a

    .line 228
    .line 229
    invoke-virtual {v1}, Lkz2;->b()I

    .line 230
    .line 231
    .line 232
    move-result v8

    .line 233
    and-int v8, v8, v16

    .line 234
    .line 235
    if-ne v8, v9, :cond_7

    .line 236
    .line 237
    const-string v10, "image/jpeg"

    .line 238
    .line 239
    goto :goto_4

    .line 240
    :cond_7
    const/16 v10, 0xe

    .line 241
    .line 242
    if-ne v8, v10, :cond_8

    .line 243
    .line 244
    const-string v8, "image/png"

    .line 245
    .line 246
    move/from16 v19, v10

    .line 247
    .line 248
    move-object v10, v8

    .line 249
    move/from16 v8, v19

    .line 250
    .line 251
    goto :goto_4

    .line 252
    :cond_8
    move-object v10, v13

    .line 253
    :goto_4
    if-nez v10, :cond_9

    .line 254
    .line 255
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v7

    .line 259
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 260
    .line 261
    .line 262
    move-result v7

    .line 263
    add-int/lit8 v7, v7, 0x1e

    .line 264
    .line 265
    new-instance v10, Ljava/lang/StringBuilder;

    .line 266
    .line 267
    invoke-direct {v10, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    goto :goto_3

    .line 284
    :cond_9
    const/4 v0, 0x4

    .line 285
    invoke-virtual {v1, v0}, Lkz2;->G(I)V

    .line 286
    .line 287
    .line 288
    add-int/lit8 v7, v7, -0x10

    .line 289
    .line 290
    new-array v0, v7, [B

    .line 291
    .line 292
    invoke-virtual {v1, v0, v3, v7}, Lkz2;->H([BII)V

    .line 293
    .line 294
    .line 295
    new-instance v7, Lph1;

    .line 296
    .line 297
    const/4 v8, 0x3

    .line 298
    invoke-direct {v7, v10, v13, v8, v0}, Lph1;-><init>(Ljava/lang/String;Ljava/lang/String;I[B)V

    .line 299
    .line 300
    .line 301
    goto/16 :goto_c

    .line 302
    .line 303
    :cond_a
    const-string v0, "Failed to parse cover art attribute"

    .line 304
    .line 305
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    goto/16 :goto_3

    .line 309
    .line 310
    :cond_b
    const v8, 0x61415254

    .line 311
    .line 312
    .line 313
    if-ne v7, v8, :cond_c

    .line 314
    .line 315
    const-string v0, "TPE2"

    .line 316
    .line 317
    invoke-static {v8, v0, v1}, Lwl2;->N(ILjava/lang/String;Lkz2;)Lbi1;

    .line 318
    .line 319
    .line 320
    move-result-object v7

    .line 321
    goto/16 :goto_c

    .line 322
    .line 323
    :cond_c
    const v8, 0x736f6e6d

    .line 324
    .line 325
    .line 326
    if-ne v7, v8, :cond_d

    .line 327
    .line 328
    const-string v0, "TSOT"

    .line 329
    .line 330
    invoke-static {v8, v0, v1}, Lwl2;->N(ILjava/lang/String;Lkz2;)Lbi1;

    .line 331
    .line 332
    .line 333
    move-result-object v7

    .line 334
    goto/16 :goto_c

    .line 335
    .line 336
    :cond_d
    const v8, 0x736f616c

    .line 337
    .line 338
    .line 339
    if-ne v7, v8, :cond_e

    .line 340
    .line 341
    const-string v0, "TSOA"

    .line 342
    .line 343
    invoke-static {v8, v0, v1}, Lwl2;->N(ILjava/lang/String;Lkz2;)Lbi1;

    .line 344
    .line 345
    .line 346
    move-result-object v7

    .line 347
    goto/16 :goto_c

    .line 348
    .line 349
    :cond_e
    const v8, 0x736f6172

    .line 350
    .line 351
    .line 352
    if-ne v7, v8, :cond_f

    .line 353
    .line 354
    const-string v0, "TSOP"

    .line 355
    .line 356
    invoke-static {v8, v0, v1}, Lwl2;->N(ILjava/lang/String;Lkz2;)Lbi1;

    .line 357
    .line 358
    .line 359
    move-result-object v7

    .line 360
    goto/16 :goto_c

    .line 361
    .line 362
    :cond_f
    const v8, 0x736f6161

    .line 363
    .line 364
    .line 365
    if-ne v7, v8, :cond_10

    .line 366
    .line 367
    const-string v0, "TSO2"

    .line 368
    .line 369
    invoke-static {v8, v0, v1}, Lwl2;->N(ILjava/lang/String;Lkz2;)Lbi1;

    .line 370
    .line 371
    .line 372
    move-result-object v7

    .line 373
    goto/16 :goto_c

    .line 374
    .line 375
    :cond_10
    const v8, 0x736f636f

    .line 376
    .line 377
    .line 378
    if-ne v7, v8, :cond_11

    .line 379
    .line 380
    const-string v0, "TSOC"

    .line 381
    .line 382
    invoke-static {v8, v0, v1}, Lwl2;->N(ILjava/lang/String;Lkz2;)Lbi1;

    .line 383
    .line 384
    .line 385
    move-result-object v7

    .line 386
    goto/16 :goto_c

    .line 387
    .line 388
    :cond_11
    const v8, 0x72746e67

    .line 389
    .line 390
    .line 391
    if-ne v7, v8, :cond_12

    .line 392
    .line 393
    const-string v0, "ITUNESADVISORY"

    .line 394
    .line 395
    invoke-static {v8, v0, v1, v3, v3}, Lwl2;->Q(ILjava/lang/String;Lkz2;ZZ)Lwh1;

    .line 396
    .line 397
    .line 398
    move-result-object v7

    .line 399
    goto/16 :goto_c

    .line 400
    .line 401
    :cond_12
    const v8, 0x70676170

    .line 402
    .line 403
    .line 404
    if-ne v7, v8, :cond_13

    .line 405
    .line 406
    const-string v0, "ITUNESGAPLESS"

    .line 407
    .line 408
    invoke-static {v8, v0, v1, v3, v11}, Lwl2;->Q(ILjava/lang/String;Lkz2;ZZ)Lwh1;

    .line 409
    .line 410
    .line 411
    move-result-object v7

    .line 412
    goto/16 :goto_c

    .line 413
    .line 414
    :cond_13
    const v8, 0x736f736e

    .line 415
    .line 416
    .line 417
    if-ne v7, v8, :cond_14

    .line 418
    .line 419
    const-string v0, "TVSHOWSORT"

    .line 420
    .line 421
    invoke-static {v8, v0, v1}, Lwl2;->N(ILjava/lang/String;Lkz2;)Lbi1;

    .line 422
    .line 423
    .line 424
    move-result-object v7

    .line 425
    goto/16 :goto_c

    .line 426
    .line 427
    :cond_14
    const v8, 0x74767368

    .line 428
    .line 429
    .line 430
    if-ne v7, v8, :cond_15

    .line 431
    .line 432
    const-string v0, "TVSHOW"

    .line 433
    .line 434
    invoke-static {v8, v0, v1}, Lwl2;->N(ILjava/lang/String;Lkz2;)Lbi1;

    .line 435
    .line 436
    .line 437
    move-result-object v7

    .line 438
    goto/16 :goto_c

    .line 439
    .line 440
    :cond_15
    const v8, 0x2d2d2d2d

    .line 441
    .line 442
    .line 443
    if-ne v7, v8, :cond_2a

    .line 444
    .line 445
    move-object v0, v13

    .line 446
    move-object v7, v0

    .line 447
    move/from16 v8, v17

    .line 448
    .line 449
    move v12, v8

    .line 450
    :goto_5
    iget v15, v1, Lkz2;->b:I

    .line 451
    .line 452
    if-ge v15, v14, :cond_1a

    .line 453
    .line 454
    invoke-virtual {v1}, Lkz2;->b()I

    .line 455
    .line 456
    .line 457
    move-result v16

    .line 458
    invoke-virtual {v1}, Lkz2;->b()I

    .line 459
    .line 460
    .line 461
    move-result v13

    .line 462
    const/4 v9, 0x4

    .line 463
    invoke-virtual {v1, v9}, Lkz2;->G(I)V

    .line 464
    .line 465
    .line 466
    const v9, 0x6d65616e

    .line 467
    .line 468
    .line 469
    if-ne v13, v9, :cond_16

    .line 470
    .line 471
    add-int/lit8 v0, v16, -0xc

    .line 472
    .line 473
    invoke-virtual {v1, v0}, Lkz2;->l(I)Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    :goto_6
    const/16 v9, 0xd

    .line 478
    .line 479
    const/4 v13, 0x0

    .line 480
    goto :goto_5

    .line 481
    :cond_16
    add-int/lit8 v9, v16, -0xc

    .line 482
    .line 483
    const v3, 0x6e616d65

    .line 484
    .line 485
    .line 486
    if-ne v13, v3, :cond_17

    .line 487
    .line 488
    invoke-virtual {v1, v9}, Lkz2;->l(I)Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object v7

    .line 492
    :goto_7
    const/4 v3, 0x0

    .line 493
    goto :goto_6

    .line 494
    :cond_17
    if-ne v13, v10, :cond_18

    .line 495
    .line 496
    move/from16 v12, v16

    .line 497
    .line 498
    :cond_18
    if-ne v13, v10, :cond_19

    .line 499
    .line 500
    move v8, v15

    .line 501
    :cond_19
    invoke-virtual {v1, v9}, Lkz2;->G(I)V

    .line 502
    .line 503
    .line 504
    goto :goto_7

    .line 505
    :cond_1a
    if-eqz v0, :cond_1b

    .line 506
    .line 507
    if-eqz v7, :cond_1b

    .line 508
    .line 509
    move/from16 v3, v17

    .line 510
    .line 511
    if-ne v8, v3, :cond_1c

    .line 512
    .line 513
    :cond_1b
    :goto_8
    const/4 v7, 0x0

    .line 514
    goto/16 :goto_c

    .line 515
    .line 516
    :cond_1c
    invoke-virtual {v1, v8}, Lkz2;->E(I)V

    .line 517
    .line 518
    .line 519
    const/16 v3, 0x10

    .line 520
    .line 521
    invoke-virtual {v1, v3}, Lkz2;->G(I)V

    .line 522
    .line 523
    .line 524
    add-int/lit8 v12, v12, -0x10

    .line 525
    .line 526
    invoke-virtual {v1, v12}, Lkz2;->l(I)Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    move-result-object v3

    .line 530
    new-instance v8, Lyh1;

    .line 531
    .line 532
    invoke-direct {v8, v0, v7, v3}, Lyh1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 533
    .line 534
    .line 535
    move-object v7, v8

    .line 536
    goto/16 :goto_c

    .line 537
    .line 538
    :cond_1d
    :goto_9
    and-int v3, v7, v16

    .line 539
    .line 540
    const v8, 0x636d74

    .line 541
    .line 542
    .line 543
    if-ne v3, v8, :cond_1f

    .line 544
    .line 545
    const-string v0, "Failed to parse comment attribute: "

    .line 546
    .line 547
    invoke-virtual {v1}, Lkz2;->b()I

    .line 548
    .line 549
    .line 550
    move-result v3

    .line 551
    invoke-virtual {v1}, Lkz2;->b()I

    .line 552
    .line 553
    .line 554
    move-result v8

    .line 555
    if-ne v8, v10, :cond_1e

    .line 556
    .line 557
    const/16 v8, 0x8

    .line 558
    .line 559
    invoke-virtual {v1, v8}, Lkz2;->G(I)V

    .line 560
    .line 561
    .line 562
    add-int/lit8 v3, v3, -0x10

    .line 563
    .line 564
    invoke-virtual {v1, v3}, Lkz2;->l(I)Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    move-result-object v0

    .line 568
    new-instance v7, Lth1;

    .line 569
    .line 570
    const-string v3, "und"

    .line 571
    .line 572
    invoke-direct {v7, v3, v0, v0}, Lth1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 573
    .line 574
    .line 575
    goto/16 :goto_c

    .line 576
    .line 577
    :cond_1e
    invoke-static {v7}, Ltd;->g(I)Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v3

    .line 581
    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 582
    .line 583
    .line 584
    move-result-object v0

    .line 585
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    .line 586
    .line 587
    .line 588
    goto :goto_8

    .line 589
    :cond_1f
    const v8, 0x6e616d

    .line 590
    .line 591
    .line 592
    if-eq v3, v8, :cond_2c

    .line 593
    .line 594
    const v8, 0x74726b

    .line 595
    .line 596
    .line 597
    if-ne v3, v8, :cond_20

    .line 598
    .line 599
    goto/16 :goto_b

    .line 600
    .line 601
    :cond_20
    const v8, 0x636f6d

    .line 602
    .line 603
    .line 604
    if-eq v3, v8, :cond_2b

    .line 605
    .line 606
    const v8, 0x777274

    .line 607
    .line 608
    .line 609
    if-ne v3, v8, :cond_21

    .line 610
    .line 611
    goto/16 :goto_a

    .line 612
    .line 613
    :cond_21
    const v8, 0x646179

    .line 614
    .line 615
    .line 616
    if-ne v3, v8, :cond_22

    .line 617
    .line 618
    const-string v0, "TDRC"

    .line 619
    .line 620
    invoke-static {v7, v0, v1}, Lwl2;->N(ILjava/lang/String;Lkz2;)Lbi1;

    .line 621
    .line 622
    .line 623
    move-result-object v7

    .line 624
    goto/16 :goto_c

    .line 625
    .line 626
    :cond_22
    const v8, 0x415254

    .line 627
    .line 628
    .line 629
    if-ne v3, v8, :cond_23

    .line 630
    .line 631
    const-string v0, "TPE1"

    .line 632
    .line 633
    invoke-static {v7, v0, v1}, Lwl2;->N(ILjava/lang/String;Lkz2;)Lbi1;

    .line 634
    .line 635
    .line 636
    move-result-object v7

    .line 637
    goto/16 :goto_c

    .line 638
    .line 639
    :cond_23
    const v8, 0x746f6f

    .line 640
    .line 641
    .line 642
    if-ne v3, v8, :cond_24

    .line 643
    .line 644
    const-string v0, "TSSE"

    .line 645
    .line 646
    invoke-static {v7, v0, v1}, Lwl2;->N(ILjava/lang/String;Lkz2;)Lbi1;

    .line 647
    .line 648
    .line 649
    move-result-object v7

    .line 650
    goto/16 :goto_c

    .line 651
    .line 652
    :cond_24
    const v8, 0x616c62

    .line 653
    .line 654
    .line 655
    if-ne v3, v8, :cond_25

    .line 656
    .line 657
    const-string v0, "TALB"

    .line 658
    .line 659
    invoke-static {v7, v0, v1}, Lwl2;->N(ILjava/lang/String;Lkz2;)Lbi1;

    .line 660
    .line 661
    .line 662
    move-result-object v7

    .line 663
    goto :goto_c

    .line 664
    :cond_25
    const v8, 0x6c7972

    .line 665
    .line 666
    .line 667
    if-ne v3, v8, :cond_26

    .line 668
    .line 669
    const-string v0, "USLT"

    .line 670
    .line 671
    invoke-static {v7, v0, v1}, Lwl2;->N(ILjava/lang/String;Lkz2;)Lbi1;

    .line 672
    .line 673
    .line 674
    move-result-object v7

    .line 675
    goto :goto_c

    .line 676
    :cond_26
    const v8, 0x67656e

    .line 677
    .line 678
    .line 679
    if-ne v3, v8, :cond_27

    .line 680
    .line 681
    invoke-static {v7, v12, v1}, Lwl2;->N(ILjava/lang/String;Lkz2;)Lbi1;

    .line 682
    .line 683
    .line 684
    move-result-object v7

    .line 685
    goto :goto_c

    .line 686
    :cond_27
    const v8, 0x677270

    .line 687
    .line 688
    .line 689
    if-ne v3, v8, :cond_28

    .line 690
    .line 691
    const-string v0, "TIT1"

    .line 692
    .line 693
    invoke-static {v7, v0, v1}, Lwl2;->N(ILjava/lang/String;Lkz2;)Lbi1;

    .line 694
    .line 695
    .line 696
    move-result-object v7

    .line 697
    goto :goto_c

    .line 698
    :cond_28
    const v8, 0x6d766e

    .line 699
    .line 700
    .line 701
    if-ne v3, v8, :cond_29

    .line 702
    .line 703
    const-string v0, "MVNM"

    .line 704
    .line 705
    invoke-static {v7, v0, v1}, Lwl2;->N(ILjava/lang/String;Lkz2;)Lbi1;

    .line 706
    .line 707
    .line 708
    move-result-object v7

    .line 709
    goto :goto_c

    .line 710
    :cond_29
    const v8, 0x6d7669

    .line 711
    .line 712
    .line 713
    if-ne v3, v8, :cond_2a

    .line 714
    .line 715
    const-string v0, "MVIN"

    .line 716
    .line 717
    const/4 v3, 0x0

    .line 718
    invoke-static {v7, v0, v1, v11, v3}, Lwl2;->Q(ILjava/lang/String;Lkz2;ZZ)Lwh1;

    .line 719
    .line 720
    .line 721
    move-result-object v7

    .line 722
    goto :goto_c

    .line 723
    :cond_2a
    invoke-static {v7}, Ltd;->g(I)Ljava/lang/String;

    .line 724
    .line 725
    .line 726
    move-result-object v3

    .line 727
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 728
    .line 729
    .line 730
    move-result v7

    .line 731
    add-int/lit8 v7, v7, 0x20

    .line 732
    .line 733
    new-instance v8, Ljava/lang/StringBuilder;

    .line 734
    .line 735
    invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 736
    .line 737
    .line 738
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 739
    .line 740
    .line 741
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 742
    .line 743
    .line 744
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 745
    .line 746
    .line 747
    move-result-object v0

    .line 748
    invoke-static {v0}, La30;->o(Ljava/lang/String;)V

    .line 749
    .line 750
    .line 751
    goto/16 :goto_8

    .line 752
    .line 753
    :cond_2b
    :goto_a
    const-string v0, "TCOM"

    .line 754
    .line 755
    invoke-static {v7, v0, v1}, Lwl2;->N(ILjava/lang/String;Lkz2;)Lbi1;

    .line 756
    .line 757
    .line 758
    move-result-object v7

    .line 759
    goto :goto_c

    .line 760
    :cond_2c
    :goto_b
    const-string v0, "TIT2"

    .line 761
    .line 762
    invoke-static {v7, v0, v1}, Lwl2;->N(ILjava/lang/String;Lkz2;)Lbi1;

    .line 763
    .line 764
    .line 765
    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 766
    :goto_c
    invoke-virtual {v1, v14}, Lkz2;->E(I)V

    .line 767
    .line 768
    .line 769
    if-eqz v7, :cond_2d

    .line 770
    .line 771
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 772
    .line 773
    .line 774
    :cond_2d
    const/16 v0, 0x8

    .line 775
    .line 776
    const/4 v3, 0x0

    .line 777
    const/16 v9, 0xd

    .line 778
    .line 779
    const/4 v13, 0x0

    .line 780
    goto/16 :goto_2

    .line 781
    .line 782
    :goto_d
    invoke-virtual {v1, v14}, Lkz2;->E(I)V

    .line 783
    .line 784
    .line 785
    throw v0

    .line 786
    :cond_2e
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 787
    .line 788
    .line 789
    move-result v0

    .line 790
    if-eqz v0, :cond_30

    .line 791
    .line 792
    :cond_2f
    const/4 v13, 0x0

    .line 793
    goto :goto_e

    .line 794
    :cond_30
    new-instance v13, Lwn1;

    .line 795
    .line 796
    invoke-direct {v13, v4}, Lwn1;-><init>(Ljava/util/List;)V

    .line 797
    .line 798
    .line 799
    goto :goto_e

    .line 800
    :cond_31
    invoke-virtual {v1, v6}, Lkz2;->E(I)V

    .line 801
    .line 802
    .line 803
    const/16 v0, 0x8

    .line 804
    .line 805
    const/4 v3, 0x0

    .line 806
    const/16 v9, 0xd

    .line 807
    .line 808
    const/4 v13, 0x0

    .line 809
    goto/16 :goto_1

    .line 810
    .line 811
    :goto_e
    invoke-virtual {v2, v13}, Lwn1;->b(Lwn1;)Lwn1;

    .line 812
    .line 813
    .line 814
    move-result-object v0

    .line 815
    move-object v2, v0

    .line 816
    const/16 v10, 0x8

    .line 817
    .line 818
    :cond_32
    :goto_f
    const/16 v18, 0x0

    .line 819
    .line 820
    goto/16 :goto_1a

    .line 821
    .line 822
    :cond_33
    const v0, 0x736d7461

    .line 823
    .line 824
    .line 825
    const/4 v3, 0x2

    .line 826
    if-ne v6, v0, :cond_41

    .line 827
    .line 828
    invoke-virtual {v1, v4}, Lkz2;->E(I)V

    .line 829
    .line 830
    .line 831
    const/16 v0, 0xc

    .line 832
    .line 833
    invoke-virtual {v1, v0}, Lkz2;->G(I)V

    .line 834
    .line 835
    .line 836
    :goto_10
    iget v4, v1, Lkz2;->b:I

    .line 837
    .line 838
    if-ge v4, v5, :cond_34

    .line 839
    .line 840
    invoke-virtual {v1}, Lkz2;->b()I

    .line 841
    .line 842
    .line 843
    move-result v6

    .line 844
    invoke-virtual {v1}, Lkz2;->b()I

    .line 845
    .line 846
    .line 847
    move-result v7

    .line 848
    const v8, 0x73617574

    .line 849
    .line 850
    .line 851
    if-ne v7, v8, :cond_40

    .line 852
    .line 853
    const/16 v7, 0x10

    .line 854
    .line 855
    if-ge v6, v7, :cond_35

    .line 856
    .line 857
    :cond_34
    const/16 v10, 0x8

    .line 858
    .line 859
    :goto_11
    const/4 v13, 0x0

    .line 860
    goto/16 :goto_17

    .line 861
    .line 862
    :cond_35
    const/4 v9, 0x4

    .line 863
    invoke-virtual {v1, v9}, Lkz2;->G(I)V

    .line 864
    .line 865
    .line 866
    const/4 v4, 0x0

    .line 867
    const/4 v6, 0x0

    .line 868
    const/4 v12, -0x1

    .line 869
    :goto_12
    if-ge v4, v3, :cond_38

    .line 870
    .line 871
    invoke-virtual {v1}, Lkz2;->K()I

    .line 872
    .line 873
    .line 874
    move-result v7

    .line 875
    invoke-virtual {v1}, Lkz2;->K()I

    .line 876
    .line 877
    .line 878
    move-result v8

    .line 879
    if-nez v7, :cond_36

    .line 880
    .line 881
    move v12, v8

    .line 882
    goto :goto_13

    .line 883
    :cond_36
    if-ne v7, v11, :cond_37

    .line 884
    .line 885
    move v6, v8

    .line 886
    :cond_37
    :goto_13
    add-int/lit8 v4, v4, 0x1

    .line 887
    .line 888
    goto :goto_12

    .line 889
    :cond_38
    const v3, -0x7fffffff

    .line 890
    .line 891
    .line 892
    if-ne v12, v0, :cond_39

    .line 893
    .line 894
    const/16 v0, 0xf0

    .line 895
    .line 896
    :goto_14
    const/16 v10, 0x8

    .line 897
    .line 898
    goto :goto_16

    .line 899
    :cond_39
    const/16 v8, 0xd

    .line 900
    .line 901
    if-ne v12, v8, :cond_3a

    .line 902
    .line 903
    const/16 v0, 0x78

    .line 904
    .line 905
    goto :goto_14

    .line 906
    :cond_3a
    const/16 v4, 0x15

    .line 907
    .line 908
    if-eq v12, v4, :cond_3b

    .line 909
    .line 910
    move v0, v3

    .line 911
    goto :goto_14

    .line 912
    :cond_3b
    invoke-virtual {v1}, Lkz2;->B()I

    .line 913
    .line 914
    .line 915
    move-result v4

    .line 916
    const/16 v10, 0x8

    .line 917
    .line 918
    if-lt v4, v10, :cond_3c

    .line 919
    .line 920
    iget v4, v1, Lkz2;->b:I

    .line 921
    .line 922
    add-int/2addr v4, v10

    .line 923
    if-le v4, v5, :cond_3d

    .line 924
    .line 925
    :cond_3c
    :goto_15
    move v0, v3

    .line 926
    goto :goto_16

    .line 927
    :cond_3d
    invoke-virtual {v1}, Lkz2;->b()I

    .line 928
    .line 929
    .line 930
    move-result v4

    .line 931
    invoke-virtual {v1}, Lkz2;->b()I

    .line 932
    .line 933
    .line 934
    move-result v7

    .line 935
    if-lt v4, v0, :cond_3c

    .line 936
    .line 937
    const v0, 0x73726672

    .line 938
    .line 939
    .line 940
    if-eq v7, v0, :cond_3e

    .line 941
    .line 942
    goto :goto_15

    .line 943
    :cond_3e
    invoke-virtual {v1}, Lkz2;->f()I

    .line 944
    .line 945
    .line 946
    move-result v0

    .line 947
    :goto_16
    if-ne v0, v3, :cond_3f

    .line 948
    .line 949
    goto :goto_11

    .line 950
    :cond_3f
    new-instance v13, Lwn1;

    .line 951
    .line 952
    new-instance v3, Lhi1;

    .line 953
    .line 954
    int-to-float v0, v0

    .line 955
    invoke-direct {v3, v6, v0}, Lhi1;-><init>(IF)V

    .line 956
    .line 957
    .line 958
    new-array v0, v11, [Len1;

    .line 959
    .line 960
    const/16 v18, 0x0

    .line 961
    .line 962
    aput-object v3, v0, v18

    .line 963
    .line 964
    invoke-direct {v13, v0}, Lwn1;-><init>([Len1;)V

    .line 965
    .line 966
    .line 967
    goto :goto_17

    .line 968
    :cond_40
    const/16 v7, 0x10

    .line 969
    .line 970
    const/16 v8, 0xd

    .line 971
    .line 972
    const/4 v9, 0x4

    .line 973
    const/16 v10, 0x8

    .line 974
    .line 975
    add-int/2addr v4, v6

    .line 976
    invoke-virtual {v1, v4}, Lkz2;->E(I)V

    .line 977
    .line 978
    .line 979
    goto/16 :goto_10

    .line 980
    .line 981
    :goto_17
    invoke-virtual {v2, v13}, Lwn1;->b(Lwn1;)Lwn1;

    .line 982
    .line 983
    .line 984
    move-result-object v0

    .line 985
    move-object v2, v0

    .line 986
    goto/16 :goto_f

    .line 987
    .line 988
    :cond_41
    const/16 v10, 0x8

    .line 989
    .line 990
    const v0, -0x56878686

    .line 991
    .line 992
    .line 993
    if-ne v6, v0, :cond_32

    .line 994
    .line 995
    invoke-virtual {v1}, Lkz2;->N()S

    .line 996
    .line 997
    .line 998
    move-result v0

    .line 999
    invoke-virtual {v1, v3}, Lkz2;->G(I)V

    .line 1000
    .line 1001
    .line 1002
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 1003
    .line 1004
    invoke-virtual {v1, v0, v3}, Lkz2;->k(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v0

    .line 1008
    const/16 v3, 0x2b

    .line 1009
    .line 1010
    invoke-virtual {v0, v3}, Ljava/lang/String;->lastIndexOf(I)I

    .line 1011
    .line 1012
    .line 1013
    move-result v3

    .line 1014
    const/16 v4, 0x2d

    .line 1015
    .line 1016
    invoke-virtual {v0, v4}, Ljava/lang/String;->lastIndexOf(I)I

    .line 1017
    .line 1018
    .line 1019
    move-result v4

    .line 1020
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    .line 1021
    .line 1022
    .line 1023
    move-result v3

    .line 1024
    const/4 v4, 0x0

    .line 1025
    :try_start_1
    invoke-virtual {v0, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v6
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1029
    :try_start_2
    invoke-static {v6}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 1030
    .line 1031
    .line 1032
    move-result v4

    .line 1033
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1034
    .line 1035
    .line 1036
    move-result v6

    .line 1037
    const/16 v17, -0x1

    .line 1038
    .line 1039
    add-int/lit8 v6, v6, -0x1

    .line 1040
    .line 1041
    invoke-virtual {v0, v3, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v0

    .line 1045
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 1046
    .line 1047
    .line 1048
    move-result v0

    .line 1049
    new-instance v3, Lwn1;

    .line 1050
    .line 1051
    new-instance v6, Le53;

    .line 1052
    .line 1053
    invoke-direct {v6, v4, v0}, Le53;-><init>(FF)V

    .line 1054
    .line 1055
    .line 1056
    new-array v0, v11, [Len1;
    :try_end_2
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_0

    .line 1057
    .line 1058
    const/16 v18, 0x0

    .line 1059
    .line 1060
    :try_start_3
    aput-object v6, v0, v18

    .line 1061
    .line 1062
    invoke-direct {v3, v0}, Lwn1;-><init>([Len1;)V
    :try_end_3
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_2

    .line 1063
    .line 1064
    .line 1065
    move-object v13, v3

    .line 1066
    goto :goto_19

    .line 1067
    :catch_0
    const/16 v18, 0x0

    .line 1068
    .line 1069
    goto :goto_18

    .line 1070
    :catch_1
    move/from16 v18, v4

    .line 1071
    .line 1072
    :catch_2
    :goto_18
    const/4 v13, 0x0

    .line 1073
    :goto_19
    invoke-virtual {v2, v13}, Lwn1;->b(Lwn1;)Lwn1;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v0

    .line 1077
    move-object v2, v0

    .line 1078
    :goto_1a
    invoke-virtual {v1, v5}, Lkz2;->E(I)V

    .line 1079
    .line 1080
    .line 1081
    move v0, v10

    .line 1082
    move/from16 v3, v18

    .line 1083
    .line 1084
    goto/16 :goto_0

    .line 1085
    .line 1086
    :cond_42
    return-object v2
.end method

.method public static d(Lkz2;)Lo53;
    .locals 11

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lkz2;->E(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lkz2;->b()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-static {v0}, Lej1;->a(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lkz2;->P()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    invoke-virtual {p0}, Lkz2;->P()J

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    :goto_0
    move-wide v5, v0

    .line 25
    move-wide v7, v2

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    invoke-virtual {p0}, Lkz2;->d()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    invoke-virtual {p0}, Lkz2;->d()J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    goto :goto_0

    .line 36
    :goto_1
    invoke-virtual {p0}, Lkz2;->P()J

    .line 37
    .line 38
    .line 39
    move-result-wide v9

    .line 40
    new-instance v4, Lo53;

    .line 41
    .line 42
    invoke-direct/range {v4 .. v10}, Lo53;-><init>(JJJ)V

    .line 43
    .line 44
    .line 45
    return-object v4
.end method

.method public static e(Lm43;)Lwn1;
    .locals 12

    .line 1
    const v0, 0x68646c72    # 4.3148E24f

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lm43;->i(I)Lp43;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const v1, 0x6b657973

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v1}, Lm43;->i(I)Lp43;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const v2, 0x696c7374

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v2}, Lm43;->i(I)Lp43;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const/4 v2, 0x0

    .line 23
    if-eqz v0, :cond_7

    .line 24
    .line 25
    if-eqz v1, :cond_7

    .line 26
    .line 27
    if-eqz p0, :cond_7

    .line 28
    .line 29
    iget-object v0, v0, Lp43;->c:Lkz2;

    .line 30
    .line 31
    const/16 v3, 0x10

    .line 32
    .line 33
    invoke-virtual {v0, v3}, Lkz2;->E(I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lkz2;->b()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    const v3, 0x6d647461

    .line 41
    .line 42
    .line 43
    if-eq v0, v3, :cond_0

    .line 44
    .line 45
    goto/16 :goto_5

    .line 46
    .line 47
    :cond_0
    iget-object v0, v1, Lp43;->c:Lkz2;

    .line 48
    .line 49
    const/16 v1, 0xc

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Lkz2;->E(I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Lkz2;->b()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    new-array v3, v1, [Ljava/lang/String;

    .line 59
    .line 60
    const/4 v4, 0x0

    .line 61
    move v5, v4

    .line 62
    :goto_0
    if-ge v5, v1, :cond_1

    .line 63
    .line 64
    invoke-virtual {v0}, Lkz2;->b()I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    const/4 v7, 0x4

    .line 69
    invoke-virtual {v0, v7}, Lkz2;->G(I)V

    .line 70
    .line 71
    .line 72
    add-int/lit8 v6, v6, -0x8

    .line 73
    .line 74
    sget-object v7, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 75
    .line 76
    invoke-virtual {v0, v6, v7}, Lkz2;->k(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    aput-object v6, v3, v5

    .line 81
    .line 82
    add-int/lit8 v5, v5, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    iget-object p0, p0, Lp43;->c:Lkz2;

    .line 86
    .line 87
    const/16 v0, 0x8

    .line 88
    .line 89
    invoke-virtual {p0, v0}, Lkz2;->E(I)V

    .line 90
    .line 91
    .line 92
    new-instance v5, Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 95
    .line 96
    .line 97
    :goto_1
    invoke-virtual {p0}, Lkz2;->B()I

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    if-le v6, v0, :cond_6

    .line 102
    .line 103
    iget v6, p0, Lkz2;->b:I

    .line 104
    .line 105
    invoke-virtual {p0}, Lkz2;->b()I

    .line 106
    .line 107
    .line 108
    move-result v7

    .line 109
    add-int/2addr v7, v6

    .line 110
    invoke-virtual {p0}, Lkz2;->b()I

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    add-int/lit8 v6, v6, -0x1

    .line 115
    .line 116
    if-ltz v6, :cond_4

    .line 117
    .line 118
    if-ge v6, v1, :cond_4

    .line 119
    .line 120
    aget-object v6, v3, v6

    .line 121
    .line 122
    :goto_2
    iget v8, p0, Lkz2;->b:I

    .line 123
    .line 124
    if-ge v8, v7, :cond_3

    .line 125
    .line 126
    invoke-virtual {p0}, Lkz2;->b()I

    .line 127
    .line 128
    .line 129
    move-result v9

    .line 130
    invoke-virtual {p0}, Lkz2;->b()I

    .line 131
    .line 132
    .line 133
    move-result v10

    .line 134
    const v11, 0x64617461

    .line 135
    .line 136
    .line 137
    if-ne v10, v11, :cond_2

    .line 138
    .line 139
    invoke-virtual {p0}, Lkz2;->b()I

    .line 140
    .line 141
    .line 142
    move-result v8

    .line 143
    invoke-virtual {p0}, Lkz2;->b()I

    .line 144
    .line 145
    .line 146
    move-result v10

    .line 147
    add-int/lit8 v9, v9, -0x10

    .line 148
    .line 149
    new-array v11, v9, [B

    .line 150
    .line 151
    invoke-virtual {p0, v11, v4, v9}, Lkz2;->H([BII)V

    .line 152
    .line 153
    .line 154
    new-instance v9, Lz33;

    .line 155
    .line 156
    invoke-direct {v9, v6, v11, v10, v8}, Lz33;-><init>(Ljava/lang/String;[BII)V

    .line 157
    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_2
    add-int/2addr v8, v9

    .line 161
    invoke-virtual {p0, v8}, Lkz2;->E(I)V

    .line 162
    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_3
    move-object v9, v2

    .line 166
    :goto_3
    if-eqz v9, :cond_5

    .line 167
    .line 168
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_4
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v8

    .line 176
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 177
    .line 178
    .line 179
    move-result v8

    .line 180
    new-instance v9, Ljava/lang/StringBuilder;

    .line 181
    .line 182
    add-int/lit8 v8, v8, 0x29

    .line 183
    .line 184
    invoke-direct {v9, v8}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 185
    .line 186
    .line 187
    const-string v8, "Skipped metadata with unknown key index: "

    .line 188
    .line 189
    invoke-static {v9, v6, v8}, Lga1;->q(Ljava/lang/StringBuilder;ILjava/lang/String;)V

    .line 190
    .line 191
    .line 192
    :cond_5
    :goto_4
    invoke-virtual {p0, v7}, Lkz2;->E(I)V

    .line 193
    .line 194
    .line 195
    goto :goto_1

    .line 196
    :cond_6
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 197
    .line 198
    .line 199
    move-result p0

    .line 200
    if-nez p0, :cond_7

    .line 201
    .line 202
    new-instance p0, Lwn1;

    .line 203
    .line 204
    invoke-direct {p0, v5}, Lwn1;-><init>(Ljava/util/List;)V

    .line 205
    .line 206
    .line 207
    return-object p0

    .line 208
    :cond_7
    :goto_5
    return-object v2
.end method

.method public static f(Lkz2;)V
    .locals 3

    .line 1
    iget v0, p0, Lkz2;->b:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-virtual {p0, v1}, Lkz2;->G(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lkz2;->b()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const v2, 0x68646c72    # 4.3148E24f

    .line 12
    .line 13
    .line 14
    if-eq v1, v2, :cond_0

    .line 15
    .line 16
    add-int/lit8 v0, v0, 0x4

    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0, v0}, Lkz2;->E(I)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static g(Lqj1;Lm43;Luf1;)Ltj1;
    .locals 53

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v3, v1, Lqj1;->g:Lph4;

    .line 6
    .line 7
    const v4, 0x7374737a

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v4}, Lm43;->i(I)Lp43;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    const-string v5, "audio/raw"

    .line 15
    .line 16
    const/16 v6, 0xc

    .line 17
    .line 18
    const/4 v8, -0x1

    .line 19
    if-eqz v4, :cond_3

    .line 20
    .line 21
    new-instance v9, Lpi1;

    .line 22
    .line 23
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    iget-object v4, v4, Lp43;->c:Lkz2;

    .line 27
    .line 28
    iput-object v4, v9, Lpi1;->h:Ljava/lang/Object;

    .line 29
    .line 30
    invoke-virtual {v4, v6}, Lkz2;->E(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v4}, Lkz2;->h()I

    .line 34
    .line 35
    .line 36
    move-result v10

    .line 37
    iget-object v11, v3, Lph4;->m:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v11

    .line 43
    if-eqz v11, :cond_1

    .line 44
    .line 45
    iget v11, v3, Lph4;->G:I

    .line 46
    .line 47
    iget v12, v3, Lph4;->E:I

    .line 48
    .line 49
    invoke-static {v11}, Lv23;->d(I)I

    .line 50
    .line 51
    .line 52
    move-result v11

    .line 53
    mul-int/2addr v11, v12

    .line 54
    if-eqz v10, :cond_0

    .line 55
    .line 56
    rem-int v12, v10, v11

    .line 57
    .line 58
    if-eqz v12, :cond_1

    .line 59
    .line 60
    :cond_0
    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v12

    .line 64
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 65
    .line 66
    .line 67
    move-result v12

    .line 68
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v13

    .line 72
    add-int/lit8 v12, v12, 0x42

    .line 73
    .line 74
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 75
    .line 76
    .line 77
    move-result v13

    .line 78
    new-instance v14, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    add-int/2addr v12, v13

    .line 81
    invoke-direct {v14, v12}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 82
    .line 83
    .line 84
    const-string v12, "Audio sample size mismatch. stsd sample size: "

    .line 85
    .line 86
    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v12, ", stsz sample size: "

    .line 93
    .line 94
    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v10

    .line 104
    invoke-static {v10}, La30;->x(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    move v10, v11

    .line 108
    :cond_1
    if-nez v10, :cond_2

    .line 109
    .line 110
    move v10, v8

    .line 111
    :cond_2
    iput v10, v9, Lpi1;->f:I

    .line 112
    .line 113
    invoke-virtual {v4}, Lkz2;->h()I

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    iput v4, v9, Lpi1;->g:I

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_3
    const v4, 0x73747a32

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v4}, Lm43;->i(I)Lp43;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    if-eqz v4, :cond_49

    .line 128
    .line 129
    new-instance v9, Lcm;

    .line 130
    .line 131
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 132
    .line 133
    .line 134
    iget-object v4, v4, Lp43;->c:Lkz2;

    .line 135
    .line 136
    iput-object v4, v9, Lcm;->j:Ljava/lang/Object;

    .line 137
    .line 138
    invoke-virtual {v4, v6}, Lkz2;->E(I)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v4}, Lkz2;->h()I

    .line 142
    .line 143
    .line 144
    move-result v10

    .line 145
    and-int/lit16 v10, v10, 0xff

    .line 146
    .line 147
    iput v10, v9, Lcm;->g:I

    .line 148
    .line 149
    invoke-virtual {v4}, Lkz2;->h()I

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    iput v4, v9, Lcm;->f:I

    .line 154
    .line 155
    :goto_0
    invoke-interface {v9}, Ldj1;->a()I

    .line 156
    .line 157
    .line 158
    move-result v4

    .line 159
    const/4 v10, 0x0

    .line 160
    if-nez v4, :cond_4

    .line 161
    .line 162
    new-instance v0, Ltj1;

    .line 163
    .line 164
    new-array v2, v10, [J

    .line 165
    .line 166
    new-array v3, v10, [I

    .line 167
    .line 168
    new-array v5, v10, [J

    .line 169
    .line 170
    new-array v6, v10, [I

    .line 171
    .line 172
    const-wide/16 v7, 0x0

    .line 173
    .line 174
    const/4 v9, 0x0

    .line 175
    const/4 v4, 0x0

    .line 176
    invoke-direct/range {v0 .. v9}, Ltj1;-><init>(Lqj1;[J[II[J[IJI)V

    .line 177
    .line 178
    .line 179
    return-object v0

    .line 180
    :cond_4
    iget v11, v1, Lqj1;->b:I

    .line 181
    .line 182
    const/4 v12, 0x2

    .line 183
    const-wide/16 v15, 0x0

    .line 184
    .line 185
    if-ne v11, v12, :cond_5

    .line 186
    .line 187
    iget-wide v13, v1, Lqj1;->f:J

    .line 188
    .line 189
    cmp-long v11, v13, v15

    .line 190
    .line 191
    if-lez v11, :cond_5

    .line 192
    .line 193
    int-to-float v11, v4

    .line 194
    long-to-float v13, v13

    .line 195
    new-instance v14, Lgg4;

    .line 196
    .line 197
    invoke-direct {v14, v3}, Lgg4;-><init>(Lph4;)V

    .line 198
    .line 199
    .line 200
    const v3, 0x49742400    # 1000000.0f

    .line 201
    .line 202
    .line 203
    div-float/2addr v13, v3

    .line 204
    div-float/2addr v11, v13

    .line 205
    iput v11, v14, Lgg4;->w:F

    .line 206
    .line 207
    new-instance v3, Lph4;

    .line 208
    .line 209
    invoke-direct {v3, v14}, Lph4;-><init>(Lgg4;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v1, v3}, Lqj1;->a(Lph4;)Lqj1;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    :cond_5
    const v3, 0x7374636f

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0, v3}, Lm43;->i(I)Lp43;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    if-nez v3, :cond_6

    .line 224
    .line 225
    const v3, 0x636f3634

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0, v3}, Lm43;->i(I)Lp43;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    const/4 v13, 0x1

    .line 236
    goto :goto_1

    .line 237
    :cond_6
    move v13, v10

    .line 238
    :goto_1
    const v14, 0x73747363

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0, v14}, Lm43;->i(I)Lp43;

    .line 242
    .line 243
    .line 244
    move-result-object v14

    .line 245
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    iget-object v14, v14, Lp43;->c:Lkz2;

    .line 249
    .line 250
    move-wide/from16 v17, v15

    .line 251
    .line 252
    const v15, 0x73747473

    .line 253
    .line 254
    .line 255
    invoke-virtual {v0, v15}, Lm43;->i(I)Lp43;

    .line 256
    .line 257
    .line 258
    move-result-object v15

    .line 259
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    iget-object v15, v15, Lp43;->c:Lkz2;

    .line 263
    .line 264
    const v7, 0x73747373

    .line 265
    .line 266
    .line 267
    invoke-virtual {v0, v7}, Lm43;->i(I)Lp43;

    .line 268
    .line 269
    .line 270
    move-result-object v7

    .line 271
    if-eqz v7, :cond_7

    .line 272
    .line 273
    iget-object v7, v7, Lp43;->c:Lkz2;

    .line 274
    .line 275
    :goto_2
    move/from16 v19, v10

    .line 276
    .line 277
    goto :goto_3

    .line 278
    :cond_7
    const/4 v7, 0x0

    .line 279
    goto :goto_2

    .line 280
    :goto_3
    const v10, 0x63747473

    .line 281
    .line 282
    .line 283
    invoke-virtual {v0, v10}, Lm43;->i(I)Lp43;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    if-eqz v0, :cond_8

    .line 288
    .line 289
    iget-object v0, v0, Lp43;->c:Lkz2;

    .line 290
    .line 291
    goto :goto_4

    .line 292
    :cond_8
    const/4 v0, 0x0

    .line 293
    :goto_4
    iget-object v3, v3, Lp43;->c:Lkz2;

    .line 294
    .line 295
    new-instance v10, Lbj1;

    .line 296
    .line 297
    invoke-direct {v10, v14, v3, v13}, Lbj1;-><init>(Lkz2;Lkz2;Z)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v15, v6}, Lkz2;->E(I)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v15}, Lkz2;->h()I

    .line 304
    .line 305
    .line 306
    move-result v3

    .line 307
    add-int/2addr v3, v8

    .line 308
    invoke-virtual {v15}, Lkz2;->h()I

    .line 309
    .line 310
    .line 311
    move-result v13

    .line 312
    invoke-virtual {v15}, Lkz2;->h()I

    .line 313
    .line 314
    .line 315
    move-result v14

    .line 316
    if-eqz v0, :cond_9

    .line 317
    .line 318
    invoke-virtual {v0, v6}, Lkz2;->E(I)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v0}, Lkz2;->h()I

    .line 322
    .line 323
    .line 324
    move-result v20

    .line 325
    goto :goto_5

    .line 326
    :cond_9
    move/from16 v20, v19

    .line 327
    .line 328
    :goto_5
    if-eqz v7, :cond_b

    .line 329
    .line 330
    invoke-virtual {v7, v6}, Lkz2;->E(I)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v7}, Lkz2;->h()I

    .line 334
    .line 335
    .line 336
    move-result v6

    .line 337
    if-lez v6, :cond_a

    .line 338
    .line 339
    invoke-virtual {v7}, Lkz2;->h()I

    .line 340
    .line 341
    .line 342
    move-result v16

    .line 343
    add-int/lit8 v16, v16, -0x1

    .line 344
    .line 345
    goto :goto_6

    .line 346
    :cond_a
    move/from16 v16, v8

    .line 347
    .line 348
    const/4 v7, 0x0

    .line 349
    goto :goto_6

    .line 350
    :cond_b
    move/from16 v16, v8

    .line 351
    .line 352
    move/from16 v6, v19

    .line 353
    .line 354
    :goto_6
    invoke-interface {v9}, Ldj1;->d()I

    .line 355
    .line 356
    .line 357
    move-result v12

    .line 358
    const/16 p0, 0x1

    .line 359
    .line 360
    iget-object v11, v1, Lqj1;->g:Lph4;

    .line 361
    .line 362
    move/from16 v22, v8

    .line 363
    .line 364
    if-eq v12, v8, :cond_12

    .line 365
    .line 366
    iget-object v8, v11, Lph4;->m:Ljava/lang/String;

    .line 367
    .line 368
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    move-result v5

    .line 372
    if-nez v5, :cond_c

    .line 373
    .line 374
    const-string v5, "audio/g711-mlaw"

    .line 375
    .line 376
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    move-result v5

    .line 380
    if-nez v5, :cond_c

    .line 381
    .line 382
    const-string v5, "audio/g711-alaw"

    .line 383
    .line 384
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    move-result v5

    .line 388
    if-eqz v5, :cond_12

    .line 389
    .line 390
    :cond_c
    if-nez v3, :cond_12

    .line 391
    .line 392
    if-nez v20, :cond_11

    .line 393
    .line 394
    if-nez v6, :cond_11

    .line 395
    .line 396
    iget v0, v10, Lbj1;->a:I

    .line 397
    .line 398
    new-array v3, v0, [J

    .line 399
    .line 400
    new-array v4, v0, [I

    .line 401
    .line 402
    :goto_7
    invoke-virtual {v10}, Lbj1;->a()Z

    .line 403
    .line 404
    .line 405
    move-result v5

    .line 406
    if-eqz v5, :cond_d

    .line 407
    .line 408
    iget v5, v10, Lbj1;->b:I

    .line 409
    .line 410
    iget-wide v6, v10, Lbj1;->d:J

    .line 411
    .line 412
    aput-wide v6, v3, v5

    .line 413
    .line 414
    iget v6, v10, Lbj1;->c:I

    .line 415
    .line 416
    aput v6, v4, v5

    .line 417
    .line 418
    goto :goto_7

    .line 419
    :cond_d
    int-to-long v5, v14

    .line 420
    const/16 v7, 0x2000

    .line 421
    .line 422
    div-int/2addr v7, v12

    .line 423
    move/from16 v8, v19

    .line 424
    .line 425
    move v9, v8

    .line 426
    :goto_8
    if-ge v8, v0, :cond_e

    .line 427
    .line 428
    aget v10, v4, v8

    .line 429
    .line 430
    sget-object v13, Lv23;->a:Ljava/lang/String;

    .line 431
    .line 432
    add-int/2addr v10, v7

    .line 433
    add-int/lit8 v10, v10, -0x1

    .line 434
    .line 435
    div-int/2addr v10, v7

    .line 436
    add-int/2addr v9, v10

    .line 437
    add-int/lit8 v8, v8, 0x1

    .line 438
    .line 439
    goto :goto_8

    .line 440
    :cond_e
    new-array v8, v9, [J

    .line 441
    .line 442
    new-array v10, v9, [I

    .line 443
    .line 444
    new-array v13, v9, [J

    .line 445
    .line 446
    new-array v14, v9, [I

    .line 447
    .line 448
    move-object/from16 v16, v3

    .line 449
    .line 450
    move-object/from16 v20, v4

    .line 451
    .line 452
    move/from16 v3, v19

    .line 453
    .line 454
    move v4, v3

    .line 455
    move v15, v4

    .line 456
    move/from16 v23, v15

    .line 457
    .line 458
    move/from16 v24, v23

    .line 459
    .line 460
    :goto_9
    if-ge v15, v0, :cond_10

    .line 461
    .line 462
    aget v25, v20, v15

    .line 463
    .line 464
    aget-wide v26, v16, v15

    .line 465
    .line 466
    move/from16 p1, v24

    .line 467
    .line 468
    move/from16 v24, v0

    .line 469
    .line 470
    move/from16 v0, v23

    .line 471
    .line 472
    move/from16 v23, p1

    .line 473
    .line 474
    move/from16 p1, v4

    .line 475
    .line 476
    move/from16 v4, v25

    .line 477
    .line 478
    :goto_a
    if-lez v4, :cond_f

    .line 479
    .line 480
    invoke-static {v7, v4}, Ljava/lang/Math;->min(II)I

    .line 481
    .line 482
    .line 483
    move-result v25

    .line 484
    aput-wide v26, v8, v23

    .line 485
    .line 486
    move/from16 v28, v4

    .line 487
    .line 488
    mul-int v4, v12, v25

    .line 489
    .line 490
    aput v4, v10, v23

    .line 491
    .line 492
    add-int v29, p1, v4

    .line 493
    .line 494
    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    .line 495
    .line 496
    .line 497
    move-result v0

    .line 498
    move-wide/from16 v30, v5

    .line 499
    .line 500
    int-to-long v4, v3

    .line 501
    mul-long v5, v30, v4

    .line 502
    .line 503
    aput-wide v5, v13, v23

    .line 504
    .line 505
    aput p0, v14, v23

    .line 506
    .line 507
    aget v4, v10, v23

    .line 508
    .line 509
    int-to-long v4, v4

    .line 510
    add-long v26, v26, v4

    .line 511
    .line 512
    add-int v3, v3, v25

    .line 513
    .line 514
    sub-int v4, v28, v25

    .line 515
    .line 516
    add-int/lit8 v23, v23, 0x1

    .line 517
    .line 518
    move/from16 p1, v29

    .line 519
    .line 520
    move-wide/from16 v5, v30

    .line 521
    .line 522
    goto :goto_a

    .line 523
    :cond_f
    move-wide/from16 v30, v5

    .line 524
    .line 525
    add-int/lit8 v15, v15, 0x1

    .line 526
    .line 527
    move/from16 v4, v23

    .line 528
    .line 529
    move/from16 v23, v0

    .line 530
    .line 531
    move/from16 v0, v24

    .line 532
    .line 533
    move/from16 v24, v4

    .line 534
    .line 535
    move/from16 v4, p1

    .line 536
    .line 537
    goto :goto_9

    .line 538
    :cond_10
    move-wide/from16 v30, v5

    .line 539
    .line 540
    int-to-long v5, v3

    .line 541
    mul-long v5, v5, v30

    .line 542
    .line 543
    int-to-long v3, v4

    .line 544
    move-object v15, v1

    .line 545
    move/from16 v34, v9

    .line 546
    .line 547
    move/from16 v9, v23

    .line 548
    .line 549
    move-wide/from16 v23, v5

    .line 550
    .line 551
    :goto_b
    move-object/from16 v31, v14

    .line 552
    .line 553
    goto/16 :goto_1d

    .line 554
    .line 555
    :cond_11
    move/from16 v3, v19

    .line 556
    .line 557
    :cond_12
    new-array v5, v4, [J

    .line 558
    .line 559
    new-array v8, v4, [I

    .line 560
    .line 561
    new-array v12, v4, [J

    .line 562
    .line 563
    move-object/from16 p1, v0

    .line 564
    .line 565
    new-array v0, v4, [I

    .line 566
    .line 567
    move/from16 v30, v3

    .line 568
    .line 569
    move-object/from16 v31, v9

    .line 570
    .line 571
    move/from16 v29, v13

    .line 572
    .line 573
    move/from16 v3, v16

    .line 574
    .line 575
    move-wide/from16 v23, v17

    .line 576
    .line 577
    move-wide/from16 v25, v23

    .line 578
    .line 579
    move-wide/from16 v27, v25

    .line 580
    .line 581
    move/from16 v9, v19

    .line 582
    .line 583
    move v13, v9

    .line 584
    move/from16 v32, v13

    .line 585
    .line 586
    move/from16 v33, v20

    .line 587
    .line 588
    move/from16 v20, v6

    .line 589
    .line 590
    move-object/from16 v16, v7

    .line 591
    .line 592
    move/from16 v6, v32

    .line 593
    .line 594
    move v7, v6

    .line 595
    :goto_c
    if-ge v6, v4, :cond_1f

    .line 596
    .line 597
    move-wide/from16 v34, v23

    .line 598
    .line 599
    move/from16 v23, v13

    .line 600
    .line 601
    move/from16 v13, p0

    .line 602
    .line 603
    :goto_d
    if-nez v23, :cond_14

    .line 604
    .line 605
    invoke-virtual {v10}, Lbj1;->a()Z

    .line 606
    .line 607
    .line 608
    move-result v13

    .line 609
    move-object/from16 v24, v1

    .line 610
    .line 611
    if-eqz v13, :cond_13

    .line 612
    .line 613
    iget-wide v1, v10, Lbj1;->d:J

    .line 614
    .line 615
    move-wide/from16 v34, v1

    .line 616
    .line 617
    iget v1, v10, Lbj1;->c:I

    .line 618
    .line 619
    move/from16 v23, v1

    .line 620
    .line 621
    move-object/from16 v1, v24

    .line 622
    .line 623
    goto :goto_d

    .line 624
    :cond_13
    move/from16 v1, v19

    .line 625
    .line 626
    goto :goto_e

    .line 627
    :cond_14
    move-object/from16 v24, v1

    .line 628
    .line 629
    move/from16 v1, v23

    .line 630
    .line 631
    :goto_e
    if-nez v13, :cond_15

    .line 632
    .line 633
    const-string v1, "Unexpected end of chunk data"

    .line 634
    .line 635
    invoke-static {v1}, La30;->x(Ljava/lang/String;)V

    .line 636
    .line 637
    .line 638
    invoke-static {v5, v6}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 639
    .line 640
    .line 641
    move-result-object v1

    .line 642
    invoke-static {v8, v6}, Ljava/util/Arrays;->copyOf([II)[I

    .line 643
    .line 644
    .line 645
    move-result-object v2

    .line 646
    invoke-static {v12, v6}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 647
    .line 648
    .line 649
    move-result-object v3

    .line 650
    invoke-static {v0, v6}, Ljava/util/Arrays;->copyOf([II)[I

    .line 651
    .line 652
    .line 653
    move-result-object v0

    .line 654
    move-object v14, v0

    .line 655
    move-object v8, v1

    .line 656
    move-object v10, v2

    .line 657
    move-object v13, v3

    .line 658
    move v4, v6

    .line 659
    goto/16 :goto_13

    .line 660
    .line 661
    :cond_15
    if-nez p1, :cond_16

    .line 662
    .line 663
    goto :goto_10

    .line 664
    :cond_16
    :goto_f
    if-nez v32, :cond_18

    .line 665
    .line 666
    if-lez v33, :cond_17

    .line 667
    .line 668
    add-int/lit8 v33, v33, -0x1

    .line 669
    .line 670
    invoke-virtual/range {p1 .. p1}, Lkz2;->h()I

    .line 671
    .line 672
    .line 673
    move-result v32

    .line 674
    invoke-virtual/range {p1 .. p1}, Lkz2;->b()I

    .line 675
    .line 676
    .line 677
    move-result v7

    .line 678
    goto :goto_f

    .line 679
    :cond_17
    move/from16 v32, v19

    .line 680
    .line 681
    :cond_18
    add-int/lit8 v32, v32, -0x1

    .line 682
    .line 683
    :goto_10
    invoke-interface/range {v31 .. v31}, Ldj1;->h()I

    .line 684
    .line 685
    .line 686
    move-result v2

    .line 687
    move-object/from16 v23, v0

    .line 688
    .line 689
    move v13, v1

    .line 690
    int-to-long v0, v2

    .line 691
    add-long v27, v27, v0

    .line 692
    .line 693
    if-le v2, v9, :cond_19

    .line 694
    .line 695
    move v9, v2

    .line 696
    :cond_19
    aput-wide v34, v5, v6

    .line 697
    .line 698
    aput v2, v8, v6

    .line 699
    .line 700
    move-wide/from16 v36, v0

    .line 701
    .line 702
    int-to-long v0, v7

    .line 703
    add-long v0, v25, v0

    .line 704
    .line 705
    aput-wide v0, v12, v6

    .line 706
    .line 707
    if-nez v16, :cond_1a

    .line 708
    .line 709
    move/from16 v0, p0

    .line 710
    .line 711
    goto :goto_11

    .line 712
    :cond_1a
    move/from16 v0, v19

    .line 713
    .line 714
    :goto_11
    aput v0, v23, v6

    .line 715
    .line 716
    if-ne v6, v3, :cond_1b

    .line 717
    .line 718
    aput p0, v23, v6

    .line 719
    .line 720
    :cond_1b
    if-eqz v16, :cond_1c

    .line 721
    .line 722
    if-ne v6, v3, :cond_1c

    .line 723
    .line 724
    add-int/lit8 v20, v20, -0x1

    .line 725
    .line 726
    if-lez v20, :cond_1c

    .line 727
    .line 728
    invoke-virtual/range {v16 .. v16}, Lkz2;->h()I

    .line 729
    .line 730
    .line 731
    move-result v0

    .line 732
    add-int/lit8 v0, v0, -0x1

    .line 733
    .line 734
    move v3, v0

    .line 735
    :cond_1c
    int-to-long v0, v14

    .line 736
    add-long v25, v25, v0

    .line 737
    .line 738
    add-int/lit8 v0, v29, -0x1

    .line 739
    .line 740
    if-nez v0, :cond_1e

    .line 741
    .line 742
    if-lez v30, :cond_1d

    .line 743
    .line 744
    invoke-virtual {v15}, Lkz2;->h()I

    .line 745
    .line 746
    .line 747
    move-result v0

    .line 748
    invoke-virtual {v15}, Lkz2;->b()I

    .line 749
    .line 750
    .line 751
    move-result v1

    .line 752
    add-int/lit8 v30, v30, -0x1

    .line 753
    .line 754
    move/from16 v29, v0

    .line 755
    .line 756
    move v14, v1

    .line 757
    goto :goto_12

    .line 758
    :cond_1d
    move/from16 v29, v19

    .line 759
    .line 760
    goto :goto_12

    .line 761
    :cond_1e
    move/from16 v29, v0

    .line 762
    .line 763
    :goto_12
    add-long v0, v34, v36

    .line 764
    .line 765
    add-int/lit8 v13, v13, -0x1

    .line 766
    .line 767
    add-int/lit8 v6, v6, 0x1

    .line 768
    .line 769
    move-wide/from16 v51, v0

    .line 770
    .line 771
    move-object/from16 v0, v23

    .line 772
    .line 773
    move-object/from16 v1, v24

    .line 774
    .line 775
    move-wide/from16 v23, v51

    .line 776
    .line 777
    goto/16 :goto_c

    .line 778
    .line 779
    :cond_1f
    move-object/from16 v23, v0

    .line 780
    .line 781
    move-object/from16 v24, v1

    .line 782
    .line 783
    move-object v10, v8

    .line 784
    move-object/from16 v14, v23

    .line 785
    .line 786
    move-object v8, v5

    .line 787
    move/from16 v23, v13

    .line 788
    .line 789
    move-object v13, v12

    .line 790
    :goto_13
    int-to-long v0, v7

    .line 791
    add-long v5, v25, v0

    .line 792
    .line 793
    if-eqz p1, :cond_21

    .line 794
    .line 795
    :goto_14
    if-lez v33, :cond_21

    .line 796
    .line 797
    invoke-virtual/range {p1 .. p1}, Lkz2;->h()I

    .line 798
    .line 799
    .line 800
    move-result v0

    .line 801
    if-eqz v0, :cond_20

    .line 802
    .line 803
    move/from16 v0, v19

    .line 804
    .line 805
    goto :goto_15

    .line 806
    :cond_20
    invoke-virtual/range {p1 .. p1}, Lkz2;->b()I

    .line 807
    .line 808
    .line 809
    add-int/lit8 v33, v33, -0x1

    .line 810
    .line 811
    goto :goto_14

    .line 812
    :cond_21
    move/from16 v0, p0

    .line 813
    .line 814
    :goto_15
    if-nez v20, :cond_27

    .line 815
    .line 816
    if-nez v29, :cond_26

    .line 817
    .line 818
    if-nez v23, :cond_25

    .line 819
    .line 820
    if-nez v30, :cond_24

    .line 821
    .line 822
    if-nez v32, :cond_23

    .line 823
    .line 824
    if-nez v0, :cond_22

    .line 825
    .line 826
    move/from16 p1, v4

    .line 827
    .line 828
    move/from16 v0, v19

    .line 829
    .line 830
    move v1, v0

    .line 831
    move v2, v1

    .line 832
    move v3, v2

    .line 833
    move v7, v3

    .line 834
    move v12, v7

    .line 835
    move-object/from16 v15, v24

    .line 836
    .line 837
    goto :goto_1a

    .line 838
    :cond_22
    move/from16 p1, v4

    .line 839
    .line 840
    move-object/from16 v16, v8

    .line 841
    .line 842
    move-object/from16 v15, v24

    .line 843
    .line 844
    move-wide/from16 v23, v5

    .line 845
    .line 846
    goto/16 :goto_1c

    .line 847
    .line 848
    :cond_23
    move v12, v0

    .line 849
    move/from16 p1, v4

    .line 850
    .line 851
    move/from16 v0, v19

    .line 852
    .line 853
    move v1, v0

    .line 854
    move v2, v1

    .line 855
    move v3, v2

    .line 856
    move-object/from16 v15, v24

    .line 857
    .line 858
    :goto_16
    move/from16 v7, v32

    .line 859
    .line 860
    goto :goto_1a

    .line 861
    :cond_24
    move v12, v0

    .line 862
    move/from16 p1, v4

    .line 863
    .line 864
    move/from16 v0, v19

    .line 865
    .line 866
    move v1, v0

    .line 867
    move v2, v1

    .line 868
    :goto_17
    move-object/from16 v15, v24

    .line 869
    .line 870
    :goto_18
    move/from16 v3, v30

    .line 871
    .line 872
    goto :goto_16

    .line 873
    :cond_25
    move v12, v0

    .line 874
    move/from16 p1, v4

    .line 875
    .line 876
    move/from16 v0, v19

    .line 877
    .line 878
    move v1, v0

    .line 879
    move/from16 v2, v23

    .line 880
    .line 881
    goto :goto_17

    .line 882
    :cond_26
    move v12, v0

    .line 883
    move/from16 p1, v4

    .line 884
    .line 885
    move/from16 v0, v19

    .line 886
    .line 887
    :goto_19
    move/from16 v2, v23

    .line 888
    .line 889
    move-object/from16 v15, v24

    .line 890
    .line 891
    move/from16 v1, v29

    .line 892
    .line 893
    goto :goto_18

    .line 894
    :cond_27
    move v12, v0

    .line 895
    move/from16 p1, v4

    .line 896
    .line 897
    move/from16 v0, v20

    .line 898
    .line 899
    goto :goto_19

    .line 900
    :goto_1a
    iget v4, v15, Lqj1;->a:I

    .line 901
    .line 902
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 903
    .line 904
    .line 905
    move-result-object v16

    .line 906
    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    .line 907
    .line 908
    .line 909
    move-result v16

    .line 910
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 911
    .line 912
    .line 913
    move-result-object v20

    .line 914
    add-int/lit8 v16, v16, 0x42

    .line 915
    .line 916
    invoke-virtual/range {v20 .. v20}, Ljava/lang/String;->length()I

    .line 917
    .line 918
    .line 919
    move-result v20

    .line 920
    add-int v20, v20, v16

    .line 921
    .line 922
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 923
    .line 924
    .line 925
    move-result-object v16

    .line 926
    add-int/lit8 v20, v20, 0x23

    .line 927
    .line 928
    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    .line 929
    .line 930
    .line 931
    move-result v16

    .line 932
    add-int v16, v16, v20

    .line 933
    .line 934
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 935
    .line 936
    .line 937
    move-result-object v20

    .line 938
    add-int/lit8 v16, v16, 0x1a

    .line 939
    .line 940
    invoke-virtual/range {v20 .. v20}, Ljava/lang/String;->length()I

    .line 941
    .line 942
    .line 943
    move-result v20

    .line 944
    add-int v20, v20, v16

    .line 945
    .line 946
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 947
    .line 948
    .line 949
    move-result-object v16

    .line 950
    add-int/lit8 v20, v20, 0x21

    .line 951
    .line 952
    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    .line 953
    .line 954
    .line 955
    move-result v16

    .line 956
    add-int v16, v16, v20

    .line 957
    .line 958
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 959
    .line 960
    .line 961
    move-result-object v20

    .line 962
    add-int/lit8 v16, v16, 0x24

    .line 963
    .line 964
    invoke-virtual/range {v20 .. v20}, Ljava/lang/String;->length()I

    .line 965
    .line 966
    .line 967
    move-result v20

    .line 968
    move-wide/from16 v23, v5

    .line 969
    .line 970
    move/from16 v5, p0

    .line 971
    .line 972
    if-eq v5, v12, :cond_28

    .line 973
    .line 974
    const-string v5, ", ctts invalid"

    .line 975
    .line 976
    goto :goto_1b

    .line 977
    :cond_28
    const-string v5, ""

    .line 978
    .line 979
    :goto_1b
    add-int v16, v16, v20

    .line 980
    .line 981
    new-instance v6, Ljava/lang/StringBuilder;

    .line 982
    .line 983
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 984
    .line 985
    .line 986
    move-result v12

    .line 987
    add-int v12, v12, v16

    .line 988
    .line 989
    invoke-direct {v6, v12}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 990
    .line 991
    .line 992
    const-string v12, "Inconsistent stbl box for track "

    .line 993
    .line 994
    move-object/from16 v16, v8

    .line 995
    .line 996
    const-string v8, ": remainingSynchronizationSamples "

    .line 997
    .line 998
    invoke-static {v6, v12, v4, v8, v0}, Lex0;->o(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;I)V

    .line 999
    .line 1000
    .line 1001
    const-string v0, ", remainingSamplesAtTimestampDelta "

    .line 1002
    .line 1003
    const-string v4, ", remainingSamplesInChunk "

    .line 1004
    .line 1005
    invoke-static {v6, v0, v1, v4, v2}, Lex0;->o(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;I)V

    .line 1006
    .line 1007
    .line 1008
    const-string v0, ", remainingTimestampDeltaChanges "

    .line 1009
    .line 1010
    const-string v1, ", remainingSamplesAtTimestampOffset "

    .line 1011
    .line 1012
    invoke-static {v6, v0, v3, v1, v7}, Lex0;->o(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;I)V

    .line 1013
    .line 1014
    .line 1015
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1016
    .line 1017
    .line 1018
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v0

    .line 1022
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    .line 1023
    .line 1024
    .line 1025
    :goto_1c
    move/from16 v34, p1

    .line 1026
    .line 1027
    move-object/from16 v8, v16

    .line 1028
    .line 1029
    move-wide/from16 v3, v27

    .line 1030
    .line 1031
    goto/16 :goto_b

    .line 1032
    .line 1033
    :goto_1d
    iget-wide v0, v15, Lqj1;->f:J

    .line 1034
    .line 1035
    cmp-long v2, v0, v17

    .line 1036
    .line 1037
    const-wide/32 v5, 0x7fffffff

    .line 1038
    .line 1039
    .line 1040
    if-lez v2, :cond_29

    .line 1041
    .line 1042
    const-wide/16 v25, 0x8

    .line 1043
    .line 1044
    mul-long v35, v3, v25

    .line 1045
    .line 1046
    const-wide/32 v37, 0xf4240

    .line 1047
    .line 1048
    .line 1049
    sget-object v41, Ljava/math/RoundingMode;->HALF_DOWN:Ljava/math/RoundingMode;

    .line 1050
    .line 1051
    move-wide/from16 v39, v0

    .line 1052
    .line 1053
    invoke-static/range {v35 .. v41}, Lv23;->t(JJJLjava/math/RoundingMode;)J

    .line 1054
    .line 1055
    .line 1056
    move-result-wide v0

    .line 1057
    cmp-long v2, v0, v17

    .line 1058
    .line 1059
    if-lez v2, :cond_29

    .line 1060
    .line 1061
    cmp-long v2, v0, v5

    .line 1062
    .line 1063
    if-gez v2, :cond_29

    .line 1064
    .line 1065
    new-instance v2, Lgg4;

    .line 1066
    .line 1067
    invoke-direct {v2, v11}, Lgg4;-><init>(Lph4;)V

    .line 1068
    .line 1069
    .line 1070
    long-to-int v0, v0

    .line 1071
    iput v0, v2, Lgg4;->g:I

    .line 1072
    .line 1073
    new-instance v0, Lph4;

    .line 1074
    .line 1075
    invoke-direct {v0, v2}, Lph4;-><init>(Lgg4;)V

    .line 1076
    .line 1077
    .line 1078
    invoke-virtual {v15, v0}, Lqj1;->a(Lph4;)Lqj1;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v1

    .line 1082
    goto :goto_1e

    .line 1083
    :cond_29
    move-object v1, v15

    .line 1084
    :goto_1e
    iget-object v0, v1, Lqj1;->g:Lph4;

    .line 1085
    .line 1086
    iget v2, v1, Lqj1;->b:I

    .line 1087
    .line 1088
    iget-object v3, v1, Lqj1;->j:[J

    .line 1089
    .line 1090
    iget-wide v11, v1, Lqj1;->c:J

    .line 1091
    .line 1092
    sget-object v41, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1093
    .line 1094
    const-wide/32 v25, 0xf4240

    .line 1095
    .line 1096
    .line 1097
    move-wide/from16 v27, v11

    .line 1098
    .line 1099
    move-object/from16 v29, v41

    .line 1100
    .line 1101
    invoke-static/range {v23 .. v29}, Lv23;->t(JJJLjava/math/RoundingMode;)J

    .line 1102
    .line 1103
    .line 1104
    move-result-wide v32

    .line 1105
    iget-object v4, v1, Lqj1;->i:[J

    .line 1106
    .line 1107
    if-nez v4, :cond_2a

    .line 1108
    .line 1109
    invoke-static {v13, v11, v12}, Lv23;->u([JJ)V

    .line 1110
    .line 1111
    .line 1112
    new-instance v25, Ltj1;

    .line 1113
    .line 1114
    move-object/from16 v26, v1

    .line 1115
    .line 1116
    move-object/from16 v27, v8

    .line 1117
    .line 1118
    move/from16 v29, v9

    .line 1119
    .line 1120
    move-object/from16 v28, v10

    .line 1121
    .line 1122
    move-object/from16 v30, v13

    .line 1123
    .line 1124
    invoke-direct/range {v25 .. v34}, Ltj1;-><init>(Lqj1;[J[II[J[IJI)V

    .line 1125
    .line 1126
    .line 1127
    return-object v25

    .line 1128
    :cond_2a
    move-object/from16 v27, v8

    .line 1129
    .line 1130
    move/from16 v29, v9

    .line 1131
    .line 1132
    move-object/from16 v28, v10

    .line 1133
    .line 1134
    array-length v7, v4

    .line 1135
    const/4 v8, 0x1

    .line 1136
    if-ne v7, v8, :cond_2f

    .line 1137
    .line 1138
    if-ne v2, v8, :cond_2b

    .line 1139
    .line 1140
    array-length v7, v13

    .line 1141
    const/4 v8, 0x2

    .line 1142
    if-lt v7, v8, :cond_2b

    .line 1143
    .line 1144
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1145
    .line 1146
    .line 1147
    aget-wide v8, v3, v19

    .line 1148
    .line 1149
    aget-wide v35, v4, v19

    .line 1150
    .line 1151
    iget-wide v14, v1, Lqj1;->d:J

    .line 1152
    .line 1153
    move-wide/from16 v37, v11

    .line 1154
    .line 1155
    move-wide/from16 v39, v14

    .line 1156
    .line 1157
    invoke-static/range {v35 .. v41}, Lv23;->t(JJJLjava/math/RoundingMode;)J

    .line 1158
    .line 1159
    .line 1160
    move-result-wide v10

    .line 1161
    move-wide/from16 v25, v39

    .line 1162
    .line 1163
    move-wide/from16 v39, v37

    .line 1164
    .line 1165
    add-long/2addr v10, v8

    .line 1166
    add-int/lit8 v12, v7, -0x1

    .line 1167
    .line 1168
    const/4 v14, 0x4

    .line 1169
    invoke-static {v14, v12}, Ljava/lang/Math;->min(II)I

    .line 1170
    .line 1171
    .line 1172
    move-result v14

    .line 1173
    move/from16 v15, v19

    .line 1174
    .line 1175
    invoke-static {v15, v14}, Ljava/lang/Math;->max(II)I

    .line 1176
    .line 1177
    .line 1178
    move-result v14

    .line 1179
    add-int/lit8 v7, v7, -0x4

    .line 1180
    .line 1181
    invoke-static {v7, v12}, Ljava/lang/Math;->min(II)I

    .line 1182
    .line 1183
    .line 1184
    move-result v7

    .line 1185
    invoke-static {v15, v7}, Ljava/lang/Math;->max(II)I

    .line 1186
    .line 1187
    .line 1188
    move-result v7

    .line 1189
    aget-wide v32, v13, v15

    .line 1190
    .line 1191
    cmp-long v12, v32, v8

    .line 1192
    .line 1193
    if-gtz v12, :cond_2e

    .line 1194
    .line 1195
    aget-wide v14, v13, v14

    .line 1196
    .line 1197
    cmp-long v12, v8, v14

    .line 1198
    .line 1199
    if-gez v12, :cond_2e

    .line 1200
    .line 1201
    aget-wide v14, v13, v7

    .line 1202
    .line 1203
    cmp-long v7, v14, v10

    .line 1204
    .line 1205
    if-gez v7, :cond_2e

    .line 1206
    .line 1207
    const-wide/16 v14, 0x2

    .line 1208
    .line 1209
    add-long v14, v23, v14

    .line 1210
    .line 1211
    cmp-long v7, v10, v14

    .line 1212
    .line 1213
    if-gtz v7, :cond_2e

    .line 1214
    .line 1215
    sub-long v10, v23, v10

    .line 1216
    .line 1217
    move-wide/from16 v14, v17

    .line 1218
    .line 1219
    invoke-static {v14, v15, v10, v11}, Ljava/lang/Math;->max(JJ)J

    .line 1220
    .line 1221
    .line 1222
    move-result-wide v10

    .line 1223
    const/16 v19, 0x0

    .line 1224
    .line 1225
    aget-wide v16, v13, v19

    .line 1226
    .line 1227
    sub-long v35, v8, v16

    .line 1228
    .line 1229
    iget v7, v0, Lph4;->F:I

    .line 1230
    .line 1231
    int-to-long v7, v7

    .line 1232
    move-wide/from16 v37, v7

    .line 1233
    .line 1234
    invoke-static/range {v35 .. v41}, Lv23;->t(JJJLjava/math/RoundingMode;)J

    .line 1235
    .line 1236
    .line 1237
    move-result-wide v7

    .line 1238
    move-wide/from16 v35, v10

    .line 1239
    .line 1240
    invoke-static/range {v35 .. v41}, Lv23;->t(JJJLjava/math/RoundingMode;)J

    .line 1241
    .line 1242
    .line 1243
    move-result-wide v9

    .line 1244
    move-wide/from16 v11, v39

    .line 1245
    .line 1246
    cmp-long v16, v7, v14

    .line 1247
    .line 1248
    if-nez v16, :cond_2c

    .line 1249
    .line 1250
    cmp-long v7, v9, v14

    .line 1251
    .line 1252
    if-eqz v7, :cond_2b

    .line 1253
    .line 1254
    const-wide/16 v7, 0x0

    .line 1255
    .line 1256
    goto :goto_21

    .line 1257
    :cond_2b
    :goto_1f
    move-object/from16 v26, v1

    .line 1258
    .line 1259
    :goto_20
    const/4 v5, 0x1

    .line 1260
    const/4 v7, 0x1

    .line 1261
    goto :goto_22

    .line 1262
    :cond_2c
    :goto_21
    cmp-long v14, v7, v5

    .line 1263
    .line 1264
    if-gtz v14, :cond_2b

    .line 1265
    .line 1266
    cmp-long v5, v9, v5

    .line 1267
    .line 1268
    if-lez v5, :cond_2d

    .line 1269
    .line 1270
    goto :goto_1f

    .line 1271
    :cond_2d
    long-to-int v0, v7

    .line 1272
    move-object/from16 v2, p2

    .line 1273
    .line 1274
    iput v0, v2, Luf1;->a:I

    .line 1275
    .line 1276
    long-to-int v0, v9

    .line 1277
    iput v0, v2, Luf1;->b:I

    .line 1278
    .line 1279
    invoke-static {v13, v11, v12}, Lv23;->u([JJ)V

    .line 1280
    .line 1281
    .line 1282
    const/16 v19, 0x0

    .line 1283
    .line 1284
    aget-wide v35, v4, v19

    .line 1285
    .line 1286
    const-wide/32 v37, 0xf4240

    .line 1287
    .line 1288
    .line 1289
    move-wide/from16 v39, v25

    .line 1290
    .line 1291
    invoke-static/range {v35 .. v41}, Lv23;->t(JJJLjava/math/RoundingMode;)J

    .line 1292
    .line 1293
    .line 1294
    move-result-wide v32

    .line 1295
    new-instance v25, Ltj1;

    .line 1296
    .line 1297
    move-object/from16 v26, v1

    .line 1298
    .line 1299
    move-object/from16 v30, v13

    .line 1300
    .line 1301
    invoke-direct/range {v25 .. v34}, Ltj1;-><init>(Lqj1;[J[II[J[IJI)V

    .line 1302
    .line 1303
    .line 1304
    return-object v25

    .line 1305
    :cond_2e
    move-object/from16 v26, v1

    .line 1306
    .line 1307
    move-wide/from16 v11, v39

    .line 1308
    .line 1309
    goto :goto_20

    .line 1310
    :cond_2f
    move-object/from16 v26, v1

    .line 1311
    .line 1312
    move v5, v8

    .line 1313
    :goto_22
    const/16 v19, 0x0

    .line 1314
    .line 1315
    if-ne v7, v5, :cond_32

    .line 1316
    .line 1317
    aget-wide v5, v4, v19

    .line 1318
    .line 1319
    const-wide/16 v15, 0x0

    .line 1320
    .line 1321
    cmp-long v1, v5, v15

    .line 1322
    .line 1323
    if-nez v1, :cond_31

    .line 1324
    .line 1325
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1326
    .line 1327
    .line 1328
    aget-wide v0, v3, v19

    .line 1329
    .line 1330
    move/from16 v10, v19

    .line 1331
    .line 1332
    :goto_23
    array-length v2, v13

    .line 1333
    if-ge v10, v2, :cond_30

    .line 1334
    .line 1335
    aget-wide v2, v13, v10

    .line 1336
    .line 1337
    sub-long v35, v2, v0

    .line 1338
    .line 1339
    const-wide/32 v37, 0xf4240

    .line 1340
    .line 1341
    .line 1342
    sget-object v41, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1343
    .line 1344
    move-wide/from16 v39, v11

    .line 1345
    .line 1346
    invoke-static/range {v35 .. v41}, Lv23;->t(JJJLjava/math/RoundingMode;)J

    .line 1347
    .line 1348
    .line 1349
    move-result-wide v2

    .line 1350
    aput-wide v2, v13, v10

    .line 1351
    .line 1352
    add-int/lit8 v10, v10, 0x1

    .line 1353
    .line 1354
    goto :goto_23

    .line 1355
    :cond_30
    move-wide/from16 v39, v11

    .line 1356
    .line 1357
    sub-long v35, v23, v0

    .line 1358
    .line 1359
    const-wide/32 v37, 0xf4240

    .line 1360
    .line 1361
    .line 1362
    sget-object v41, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1363
    .line 1364
    invoke-static/range {v35 .. v41}, Lv23;->t(JJJLjava/math/RoundingMode;)J

    .line 1365
    .line 1366
    .line 1367
    move-result-wide v32

    .line 1368
    new-instance v25, Ltj1;

    .line 1369
    .line 1370
    move-object/from16 v30, v13

    .line 1371
    .line 1372
    invoke-direct/range {v25 .. v34}, Ltj1;-><init>(Lqj1;[J[II[J[IJI)V

    .line 1373
    .line 1374
    .line 1375
    return-object v25

    .line 1376
    :cond_31
    const/4 v5, 0x1

    .line 1377
    :cond_32
    move-wide/from16 v39, v11

    .line 1378
    .line 1379
    move-object/from16 v1, v26

    .line 1380
    .line 1381
    move-object/from16 v8, v27

    .line 1382
    .line 1383
    move-object/from16 v10, v28

    .line 1384
    .line 1385
    move-object/from16 v14, v31

    .line 1386
    .line 1387
    move/from16 v9, v34

    .line 1388
    .line 1389
    if-ne v2, v5, :cond_33

    .line 1390
    .line 1391
    const/4 v5, 0x1

    .line 1392
    goto :goto_24

    .line 1393
    :cond_33
    move/from16 v5, v19

    .line 1394
    .line 1395
    :goto_24
    new-array v6, v7, [I

    .line 1396
    .line 1397
    new-array v7, v7, [I

    .line 1398
    .line 1399
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1400
    .line 1401
    .line 1402
    move-object/from16 v16, v3

    .line 1403
    .line 1404
    move/from16 v11, v19

    .line 1405
    .line 1406
    move v12, v11

    .line 1407
    move v15, v12

    .line 1408
    move/from16 v17, v15

    .line 1409
    .line 1410
    :goto_25
    array-length v3, v4

    .line 1411
    if-ge v11, v3, :cond_3d

    .line 1412
    .line 1413
    move v3, v5

    .line 1414
    move-object/from16 v18, v6

    .line 1415
    .line 1416
    aget-wide v5, v16, v11

    .line 1417
    .line 1418
    const-wide/16 v23, -0x1

    .line 1419
    .line 1420
    cmp-long v20, v5, v23

    .line 1421
    .line 1422
    if-eqz v20, :cond_3c

    .line 1423
    .line 1424
    aget-wide v35, v4, v11

    .line 1425
    .line 1426
    move-object/from16 v28, v10

    .line 1427
    .line 1428
    move/from16 v20, v11

    .line 1429
    .line 1430
    iget-wide v10, v1, Lqj1;->d:J

    .line 1431
    .line 1432
    sget-object v41, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1433
    .line 1434
    move-wide/from16 v37, v39

    .line 1435
    .line 1436
    move-wide/from16 v39, v10

    .line 1437
    .line 1438
    invoke-static/range {v35 .. v41}, Lv23;->t(JJJLjava/math/RoundingMode;)J

    .line 1439
    .line 1440
    .line 1441
    move-result-wide v10

    .line 1442
    move/from16 v23, v3

    .line 1443
    .line 1444
    move-wide/from16 v39, v37

    .line 1445
    .line 1446
    const/4 v3, 0x1

    .line 1447
    invoke-static {v13, v5, v6, v3}, Lv23;->p([JJZ)I

    .line 1448
    .line 1449
    .line 1450
    move-result v24

    .line 1451
    aput v24, v18, v20

    .line 1452
    .line 1453
    add-long/2addr v5, v10

    .line 1454
    invoke-static {v13, v5, v6}, Ljava/util/Arrays;->binarySearch([JJ)I

    .line 1455
    .line 1456
    .line 1457
    move-result v3

    .line 1458
    if-gez v3, :cond_34

    .line 1459
    .line 1460
    not-int v3, v3

    .line 1461
    goto :goto_28

    .line 1462
    :cond_34
    :goto_26
    add-int/lit8 v10, v3, 0x1

    .line 1463
    .line 1464
    array-length v11, v13

    .line 1465
    if-ge v10, v11, :cond_36

    .line 1466
    .line 1467
    aget-wide v24, v13, v10

    .line 1468
    .line 1469
    cmp-long v11, v24, v5

    .line 1470
    .line 1471
    if-eqz v11, :cond_35

    .line 1472
    .line 1473
    goto :goto_27

    .line 1474
    :cond_35
    move v3, v10

    .line 1475
    goto :goto_26

    .line 1476
    :cond_36
    :goto_27
    if-nez v23, :cond_37

    .line 1477
    .line 1478
    move v3, v10

    .line 1479
    :cond_37
    :goto_28
    aput v3, v7, v20

    .line 1480
    .line 1481
    aget v3, v18, v20

    .line 1482
    .line 1483
    :goto_29
    aget v10, v18, v20

    .line 1484
    .line 1485
    if-ltz v10, :cond_38

    .line 1486
    .line 1487
    aget v11, v14, v10

    .line 1488
    .line 1489
    const/16 v24, 0x1

    .line 1490
    .line 1491
    and-int/lit8 v11, v11, 0x1

    .line 1492
    .line 1493
    if-nez v11, :cond_38

    .line 1494
    .line 1495
    add-int/lit8 v10, v10, -0x1

    .line 1496
    .line 1497
    aput v10, v18, v20

    .line 1498
    .line 1499
    goto :goto_29

    .line 1500
    :cond_38
    if-gez v10, :cond_39

    .line 1501
    .line 1502
    aput v3, v18, v20

    .line 1503
    .line 1504
    :goto_2a
    aget v10, v18, v20

    .line 1505
    .line 1506
    aget v3, v7, v20

    .line 1507
    .line 1508
    if-ge v10, v3, :cond_39

    .line 1509
    .line 1510
    aget v3, v14, v10

    .line 1511
    .line 1512
    const/16 v24, 0x1

    .line 1513
    .line 1514
    and-int/lit8 v3, v3, 0x1

    .line 1515
    .line 1516
    if-nez v3, :cond_39

    .line 1517
    .line 1518
    add-int/lit8 v10, v10, 0x1

    .line 1519
    .line 1520
    aput v10, v18, v20

    .line 1521
    .line 1522
    goto :goto_2a

    .line 1523
    :cond_39
    const/4 v3, 0x2

    .line 1524
    if-ne v2, v3, :cond_3a

    .line 1525
    .line 1526
    aget v11, v7, v20

    .line 1527
    .line 1528
    if-eq v10, v11, :cond_3a

    .line 1529
    .line 1530
    :goto_2b
    aget v10, v7, v20

    .line 1531
    .line 1532
    array-length v11, v13

    .line 1533
    add-int/lit8 v11, v11, -0x1

    .line 1534
    .line 1535
    if-ge v10, v11, :cond_3a

    .line 1536
    .line 1537
    add-int/lit8 v10, v10, 0x1

    .line 1538
    .line 1539
    aget-wide v24, v13, v10

    .line 1540
    .line 1541
    cmp-long v11, v24, v5

    .line 1542
    .line 1543
    if-gtz v11, :cond_3a

    .line 1544
    .line 1545
    aput v10, v7, v20

    .line 1546
    .line 1547
    goto :goto_2b

    .line 1548
    :cond_3a
    aget v5, v7, v20

    .line 1549
    .line 1550
    aget v6, v18, v20

    .line 1551
    .line 1552
    sub-int v10, v5, v6

    .line 1553
    .line 1554
    add-int/2addr v10, v12

    .line 1555
    if-eq v15, v6, :cond_3b

    .line 1556
    .line 1557
    const/4 v6, 0x1

    .line 1558
    goto :goto_2c

    .line 1559
    :cond_3b
    move/from16 v6, v19

    .line 1560
    .line 1561
    :goto_2c
    or-int v6, v17, v6

    .line 1562
    .line 1563
    move v15, v5

    .line 1564
    move/from16 v17, v6

    .line 1565
    .line 1566
    move v12, v10

    .line 1567
    goto :goto_2d

    .line 1568
    :cond_3c
    move/from16 v23, v3

    .line 1569
    .line 1570
    move-object/from16 v28, v10

    .line 1571
    .line 1572
    move/from16 v20, v11

    .line 1573
    .line 1574
    const/4 v3, 0x2

    .line 1575
    :goto_2d
    add-int/lit8 v11, v20, 0x1

    .line 1576
    .line 1577
    move-object/from16 v6, v18

    .line 1578
    .line 1579
    move/from16 v5, v23

    .line 1580
    .line 1581
    move-object/from16 v10, v28

    .line 1582
    .line 1583
    goto/16 :goto_25

    .line 1584
    .line 1585
    :cond_3d
    move-object/from16 v18, v6

    .line 1586
    .line 1587
    move-object/from16 v28, v10

    .line 1588
    .line 1589
    if-eq v12, v9, :cond_3e

    .line 1590
    .line 1591
    const/4 v2, 0x1

    .line 1592
    goto :goto_2e

    .line 1593
    :cond_3e
    move/from16 v2, v19

    .line 1594
    .line 1595
    :goto_2e
    or-int v2, v17, v2

    .line 1596
    .line 1597
    if-eqz v2, :cond_3f

    .line 1598
    .line 1599
    new-array v3, v12, [J

    .line 1600
    .line 1601
    goto :goto_2f

    .line 1602
    :cond_3f
    move-object v3, v8

    .line 1603
    :goto_2f
    if-eqz v2, :cond_40

    .line 1604
    .line 1605
    new-array v10, v12, [I

    .line 1606
    .line 1607
    :goto_30
    const/4 v5, 0x1

    .line 1608
    goto :goto_31

    .line 1609
    :cond_40
    move-object/from16 v10, v28

    .line 1610
    .line 1611
    goto :goto_30

    .line 1612
    :goto_31
    if-ne v5, v2, :cond_41

    .line 1613
    .line 1614
    move/from16 v9, v19

    .line 1615
    .line 1616
    goto :goto_32

    .line 1617
    :cond_41
    move/from16 v9, v29

    .line 1618
    .line 1619
    :goto_32
    if-eqz v2, :cond_42

    .line 1620
    .line 1621
    new-array v5, v12, [I

    .line 1622
    .line 1623
    goto :goto_33

    .line 1624
    :cond_42
    move-object v5, v14

    .line 1625
    :goto_33
    new-array v6, v12, [J

    .line 1626
    .line 1627
    move/from16 v45, v9

    .line 1628
    .line 1629
    move/from16 v9, v19

    .line 1630
    .line 1631
    move v11, v9

    .line 1632
    move v15, v11

    .line 1633
    const-wide/16 v20, 0x0

    .line 1634
    .line 1635
    :goto_34
    array-length v12, v4

    .line 1636
    if-ge v15, v12, :cond_47

    .line 1637
    .line 1638
    aget-wide v29, v16, v15

    .line 1639
    .line 1640
    aget v12, v18, v15

    .line 1641
    .line 1642
    move/from16 v17, v2

    .line 1643
    .line 1644
    aget v2, v7, v15

    .line 1645
    .line 1646
    move-object/from16 v27, v4

    .line 1647
    .line 1648
    if-eqz v17, :cond_43

    .line 1649
    .line 1650
    sub-int v4, v2, v12

    .line 1651
    .line 1652
    invoke-static {v8, v12, v3, v11, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1653
    .line 1654
    .line 1655
    move-object/from16 v46, v6

    .line 1656
    .line 1657
    move-object/from16 v6, v28

    .line 1658
    .line 1659
    invoke-static {v6, v12, v10, v11, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1660
    .line 1661
    .line 1662
    invoke-static {v14, v12, v5, v11, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1663
    .line 1664
    .line 1665
    goto :goto_35

    .line 1666
    :cond_43
    move-object/from16 v46, v6

    .line 1667
    .line 1668
    move-object/from16 v6, v28

    .line 1669
    .line 1670
    :goto_35
    move/from16 v4, v45

    .line 1671
    .line 1672
    :goto_36
    if-ge v12, v2, :cond_46

    .line 1673
    .line 1674
    move-object/from16 v47, v5

    .line 1675
    .line 1676
    move-object/from16 v28, v6

    .line 1677
    .line 1678
    iget-wide v5, v1, Lqj1;->d:J

    .line 1679
    .line 1680
    sget-object v41, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1681
    .line 1682
    const-wide/32 v22, 0xf4240

    .line 1683
    .line 1684
    .line 1685
    move-wide/from16 v24, v5

    .line 1686
    .line 1687
    move-object/from16 v26, v41

    .line 1688
    .line 1689
    invoke-static/range {v20 .. v26}, Lv23;->t(JJJLjava/math/RoundingMode;)J

    .line 1690
    .line 1691
    .line 1692
    move-result-wide v5

    .line 1693
    aget-wide v22, v13, v12

    .line 1694
    .line 1695
    sub-long v35, v22, v29

    .line 1696
    .line 1697
    const-wide/32 v37, 0xf4240

    .line 1698
    .line 1699
    .line 1700
    invoke-static/range {v35 .. v41}, Lv23;->t(JJJLjava/math/RoundingMode;)J

    .line 1701
    .line 1702
    .line 1703
    move-result-wide v22

    .line 1704
    const-wide/16 v24, 0x0

    .line 1705
    .line 1706
    cmp-long v26, v22, v24

    .line 1707
    .line 1708
    if-gez v26, :cond_44

    .line 1709
    .line 1710
    move/from16 v26, v19

    .line 1711
    .line 1712
    :goto_37
    const/16 v31, 0x1

    .line 1713
    .line 1714
    goto :goto_38

    .line 1715
    :cond_44
    const/16 v26, 0x1

    .line 1716
    .line 1717
    goto :goto_37

    .line 1718
    :goto_38
    xor-int/lit8 v26, v26, 0x1

    .line 1719
    .line 1720
    or-int v9, v26, v9

    .line 1721
    .line 1722
    add-long v5, v5, v22

    .line 1723
    .line 1724
    aput-wide v5, v46, v11

    .line 1725
    .line 1726
    if-eqz v17, :cond_45

    .line 1727
    .line 1728
    aget v5, v10, v11

    .line 1729
    .line 1730
    if-le v5, v4, :cond_45

    .line 1731
    .line 1732
    aget v4, v28, v12

    .line 1733
    .line 1734
    :cond_45
    add-int/lit8 v11, v11, 0x1

    .line 1735
    .line 1736
    add-int/lit8 v12, v12, 0x1

    .line 1737
    .line 1738
    move-object/from16 v6, v28

    .line 1739
    .line 1740
    move-object/from16 v5, v47

    .line 1741
    .line 1742
    goto :goto_36

    .line 1743
    :cond_46
    move-object/from16 v47, v5

    .line 1744
    .line 1745
    move-object/from16 v28, v6

    .line 1746
    .line 1747
    const-wide/16 v24, 0x0

    .line 1748
    .line 1749
    aget-wide v5, v27, v15

    .line 1750
    .line 1751
    add-long v20, v20, v5

    .line 1752
    .line 1753
    add-int/lit8 v15, v15, 0x1

    .line 1754
    .line 1755
    move/from16 v45, v4

    .line 1756
    .line 1757
    move/from16 v2, v17

    .line 1758
    .line 1759
    move-object/from16 v4, v27

    .line 1760
    .line 1761
    move-object/from16 v6, v46

    .line 1762
    .line 1763
    move-object/from16 v5, v47

    .line 1764
    .line 1765
    goto/16 :goto_34

    .line 1766
    .line 1767
    :cond_47
    move-object/from16 v47, v5

    .line 1768
    .line 1769
    move-object/from16 v46, v6

    .line 1770
    .line 1771
    iget-wide v4, v1, Lqj1;->d:J

    .line 1772
    .line 1773
    sget-object v26, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1774
    .line 1775
    const-wide/32 v22, 0xf4240

    .line 1776
    .line 1777
    .line 1778
    move-wide/from16 v24, v4

    .line 1779
    .line 1780
    invoke-static/range {v20 .. v26}, Lv23;->t(JJJLjava/math/RoundingMode;)J

    .line 1781
    .line 1782
    .line 1783
    move-result-wide v48

    .line 1784
    if-eqz v9, :cond_48

    .line 1785
    .line 1786
    new-instance v2, Lgg4;

    .line 1787
    .line 1788
    invoke-direct {v2, v0}, Lgg4;-><init>(Lph4;)V

    .line 1789
    .line 1790
    .line 1791
    const/4 v5, 0x1

    .line 1792
    iput-boolean v5, v2, Lgg4;->r:Z

    .line 1793
    .line 1794
    new-instance v0, Lph4;

    .line 1795
    .line 1796
    invoke-direct {v0, v2}, Lph4;-><init>(Lgg4;)V

    .line 1797
    .line 1798
    .line 1799
    invoke-virtual {v1, v0}, Lqj1;->a(Lph4;)Lqj1;

    .line 1800
    .line 1801
    .line 1802
    move-result-object v1

    .line 1803
    :cond_48
    move-object/from16 v42, v1

    .line 1804
    .line 1805
    new-instance v41, Ltj1;

    .line 1806
    .line 1807
    array-length v0, v3

    .line 1808
    move/from16 v50, v0

    .line 1809
    .line 1810
    move-object/from16 v43, v3

    .line 1811
    .line 1812
    move-object/from16 v44, v10

    .line 1813
    .line 1814
    invoke-direct/range {v41 .. v50}, Ltj1;-><init>(Lqj1;[J[II[J[IJI)V

    .line 1815
    .line 1816
    .line 1817
    return-object v41

    .line 1818
    :cond_49
    const-string v0, "Track has no sample table size information"

    .line 1819
    .line 1820
    const/4 v1, 0x0

    .line 1821
    invoke-static {v1, v0}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 1822
    .line 1823
    .line 1824
    move-result-object v0

    .line 1825
    throw v0
.end method

.method public static h(Lkz2;)Ln74;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Llg1;

    .line 4
    .line 5
    iget-object v2, v0, Lkz2;->a:[B

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    invoke-direct {v1, v3, v2}, Llg1;-><init>(I[B)V

    .line 9
    .line 10
    .line 11
    iget v0, v0, Lkz2;->b:I

    .line 12
    .line 13
    const/16 v2, 0x8

    .line 14
    .line 15
    mul-int/2addr v0, v2

    .line 16
    invoke-virtual {v1, v0}, Llg1;->l(I)V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-virtual {v1, v0}, Llg1;->x(I)V

    .line 21
    .line 22
    .line 23
    const/4 v3, 0x3

    .line 24
    invoke-virtual {v1, v3}, Llg1;->r(I)I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    const/4 v5, 0x6

    .line 29
    invoke-virtual {v1, v5}, Llg1;->o(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Llg1;->q()Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    invoke-virtual {v1}, Llg1;->q()Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    const/16 v7, 0xc

    .line 41
    .line 42
    const/16 v8, 0xa

    .line 43
    .line 44
    const/4 v11, -0x1

    .line 45
    const/4 v10, 0x2

    .line 46
    if-ne v4, v10, :cond_3

    .line 47
    .line 48
    if-eqz v5, :cond_2

    .line 49
    .line 50
    if-eq v0, v6, :cond_0

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    move v8, v7

    .line 54
    :cond_1
    :goto_0
    move v15, v8

    .line 55
    :goto_1
    move/from16 v16, v15

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    move v4, v10

    .line 59
    const/4 v5, 0x0

    .line 60
    :cond_3
    if-gt v4, v10, :cond_4

    .line 61
    .line 62
    if-eq v0, v5, :cond_1

    .line 63
    .line 64
    move v8, v2

    .line 65
    goto :goto_0

    .line 66
    :cond_4
    move v15, v11

    .line 67
    goto :goto_1

    .line 68
    :goto_2
    const/16 v4, 0xd

    .line 69
    .line 70
    invoke-virtual {v1, v4}, Llg1;->o(I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Llg1;->m()V

    .line 74
    .line 75
    .line 76
    const/4 v5, 0x4

    .line 77
    invoke-virtual {v1, v5}, Llg1;->r(I)I

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    const/4 v14, 0x0

    .line 82
    if-eq v6, v0, :cond_5

    .line 83
    .line 84
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    new-instance v1, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    add-int/lit8 v0, v0, 0x16

    .line 95
    .line 96
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 97
    .line 98
    .line 99
    const-string v0, "Unsupported obu_type: "

    .line 100
    .line 101
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-static {v0}, La30;->u(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    new-instance v10, Ln74;

    .line 115
    .line 116
    move v12, v11

    .line 117
    move v13, v11

    .line 118
    invoke-direct/range {v10 .. v16}, Ln74;-><init>(III[BII)V

    .line 119
    .line 120
    .line 121
    return-object v10

    .line 122
    :cond_5
    invoke-virtual {v1}, Llg1;->q()Z

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    if-eqz v6, :cond_6

    .line 127
    .line 128
    const-string v0, "Unsupported obu_extension_flag"

    .line 129
    .line 130
    invoke-static {v0}, La30;->u(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    new-instance v10, Ln74;

    .line 134
    .line 135
    move v12, v11

    .line 136
    move v13, v11

    .line 137
    invoke-direct/range {v10 .. v16}, Ln74;-><init>(III[BII)V

    .line 138
    .line 139
    .line 140
    return-object v10

    .line 141
    :cond_6
    invoke-virtual {v1}, Llg1;->q()Z

    .line 142
    .line 143
    .line 144
    move-result v6

    .line 145
    invoke-virtual {v1}, Llg1;->m()V

    .line 146
    .line 147
    .line 148
    if-eqz v6, :cond_8

    .line 149
    .line 150
    invoke-virtual {v1, v2}, Llg1;->r(I)I

    .line 151
    .line 152
    .line 153
    move-result v6

    .line 154
    const/16 v8, 0x7f

    .line 155
    .line 156
    if-gt v6, v8, :cond_7

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_7
    const-string v0, "Excessive obu_size"

    .line 160
    .line 161
    invoke-static {v0}, La30;->u(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    new-instance v10, Ln74;

    .line 165
    .line 166
    move v12, v11

    .line 167
    move v13, v11

    .line 168
    invoke-direct/range {v10 .. v16}, Ln74;-><init>(III[BII)V

    .line 169
    .line 170
    .line 171
    return-object v10

    .line 172
    :cond_8
    :goto_3
    invoke-virtual {v1, v3}, Llg1;->r(I)I

    .line 173
    .line 174
    .line 175
    move-result v6

    .line 176
    invoke-virtual {v1}, Llg1;->m()V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1}, Llg1;->q()Z

    .line 180
    .line 181
    .line 182
    move-result v8

    .line 183
    if-eqz v8, :cond_9

    .line 184
    .line 185
    const-string v0, "Unsupported reduced_still_picture_header"

    .line 186
    .line 187
    invoke-static {v0}, La30;->u(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    new-instance v10, Ln74;

    .line 191
    .line 192
    move v12, v11

    .line 193
    move v13, v11

    .line 194
    invoke-direct/range {v10 .. v16}, Ln74;-><init>(III[BII)V

    .line 195
    .line 196
    .line 197
    return-object v10

    .line 198
    :cond_9
    invoke-virtual {v1}, Llg1;->q()Z

    .line 199
    .line 200
    .line 201
    move-result v8

    .line 202
    if-eqz v8, :cond_a

    .line 203
    .line 204
    const-string v0, "Unsupported timing_info_present_flag"

    .line 205
    .line 206
    invoke-static {v0}, La30;->u(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    new-instance v10, Ln74;

    .line 210
    .line 211
    move v12, v11

    .line 212
    move v13, v11

    .line 213
    invoke-direct/range {v10 .. v16}, Ln74;-><init>(III[BII)V

    .line 214
    .line 215
    .line 216
    return-object v10

    .line 217
    :cond_a
    invoke-virtual {v1}, Llg1;->q()Z

    .line 218
    .line 219
    .line 220
    move-result v8

    .line 221
    if-eqz v8, :cond_b

    .line 222
    .line 223
    const-string v0, "Unsupported initial_display_delay_present_flag"

    .line 224
    .line 225
    invoke-static {v0}, La30;->u(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    new-instance v10, Ln74;

    .line 229
    .line 230
    move v12, v11

    .line 231
    move v13, v11

    .line 232
    invoke-direct/range {v10 .. v16}, Ln74;-><init>(III[BII)V

    .line 233
    .line 234
    .line 235
    return-object v10

    .line 236
    :cond_b
    const/4 v8, 0x5

    .line 237
    invoke-virtual {v1, v8}, Llg1;->r(I)I

    .line 238
    .line 239
    .line 240
    move-result v12

    .line 241
    const/4 v13, 0x0

    .line 242
    :goto_4
    const/4 v9, 0x7

    .line 243
    if-gt v13, v12, :cond_d

    .line 244
    .line 245
    invoke-virtual {v1, v7}, Llg1;->o(I)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v1, v8}, Llg1;->r(I)I

    .line 249
    .line 250
    .line 251
    move-result v7

    .line 252
    if-le v7, v9, :cond_c

    .line 253
    .line 254
    invoke-virtual {v1}, Llg1;->m()V

    .line 255
    .line 256
    .line 257
    :cond_c
    add-int/lit8 v13, v13, 0x1

    .line 258
    .line 259
    const/16 v7, 0xc

    .line 260
    .line 261
    goto :goto_4

    .line 262
    :cond_d
    invoke-virtual {v1, v5}, Llg1;->r(I)I

    .line 263
    .line 264
    .line 265
    move-result v7

    .line 266
    invoke-virtual {v1, v5}, Llg1;->r(I)I

    .line 267
    .line 268
    .line 269
    move-result v5

    .line 270
    add-int/2addr v7, v0

    .line 271
    invoke-virtual {v1, v7}, Llg1;->o(I)V

    .line 272
    .line 273
    .line 274
    add-int/2addr v5, v0

    .line 275
    invoke-virtual {v1, v5}, Llg1;->o(I)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v1}, Llg1;->q()Z

    .line 279
    .line 280
    .line 281
    move-result v5

    .line 282
    if-eqz v5, :cond_e

    .line 283
    .line 284
    invoke-virtual {v1, v9}, Llg1;->o(I)V

    .line 285
    .line 286
    .line 287
    :cond_e
    invoke-virtual {v1, v9}, Llg1;->o(I)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v1}, Llg1;->q()Z

    .line 291
    .line 292
    .line 293
    move-result v5

    .line 294
    if-eqz v5, :cond_f

    .line 295
    .line 296
    invoke-virtual {v1, v10}, Llg1;->o(I)V

    .line 297
    .line 298
    .line 299
    :cond_f
    invoke-virtual {v1}, Llg1;->q()Z

    .line 300
    .line 301
    .line 302
    move-result v7

    .line 303
    if-eqz v7, :cond_10

    .line 304
    .line 305
    goto :goto_5

    .line 306
    :cond_10
    invoke-virtual {v1, v0}, Llg1;->r(I)I

    .line 307
    .line 308
    .line 309
    move-result v7

    .line 310
    if-lez v7, :cond_11

    .line 311
    .line 312
    :goto_5
    invoke-virtual {v1}, Llg1;->q()Z

    .line 313
    .line 314
    .line 315
    move-result v7

    .line 316
    if-nez v7, :cond_11

    .line 317
    .line 318
    invoke-virtual {v1, v0}, Llg1;->o(I)V

    .line 319
    .line 320
    .line 321
    :cond_11
    if-eqz v5, :cond_12

    .line 322
    .line 323
    invoke-virtual {v1, v3}, Llg1;->o(I)V

    .line 324
    .line 325
    .line 326
    :cond_12
    invoke-virtual {v1, v3}, Llg1;->o(I)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v1}, Llg1;->q()Z

    .line 330
    .line 331
    .line 332
    move-result v3

    .line 333
    if-ne v6, v10, :cond_13

    .line 334
    .line 335
    if-eqz v3, :cond_15

    .line 336
    .line 337
    invoke-virtual {v1}, Llg1;->m()V

    .line 338
    .line 339
    .line 340
    goto :goto_6

    .line 341
    :cond_13
    if-ne v6, v0, :cond_15

    .line 342
    .line 343
    :cond_14
    const/4 v9, 0x0

    .line 344
    goto :goto_7

    .line 345
    :cond_15
    :goto_6
    invoke-virtual {v1}, Llg1;->q()Z

    .line 346
    .line 347
    .line 348
    move-result v3

    .line 349
    if-eqz v3, :cond_14

    .line 350
    .line 351
    move v9, v0

    .line 352
    :goto_7
    invoke-virtual {v1}, Llg1;->q()Z

    .line 353
    .line 354
    .line 355
    move-result v3

    .line 356
    if-eqz v3, :cond_1a

    .line 357
    .line 358
    invoke-virtual {v1, v2}, Llg1;->r(I)I

    .line 359
    .line 360
    .line 361
    move-result v3

    .line 362
    invoke-virtual {v1, v2}, Llg1;->r(I)I

    .line 363
    .line 364
    .line 365
    move-result v5

    .line 366
    invoke-virtual {v1, v2}, Llg1;->r(I)I

    .line 367
    .line 368
    .line 369
    move-result v2

    .line 370
    if-nez v9, :cond_18

    .line 371
    .line 372
    if-ne v3, v0, :cond_18

    .line 373
    .line 374
    if-ne v5, v4, :cond_17

    .line 375
    .line 376
    if-nez v2, :cond_16

    .line 377
    .line 378
    move v1, v0

    .line 379
    move v3, v1

    .line 380
    goto :goto_9

    .line 381
    :cond_16
    move v3, v0

    .line 382
    goto :goto_8

    .line 383
    :cond_17
    move v3, v0

    .line 384
    :cond_18
    move v4, v5

    .line 385
    :goto_8
    invoke-virtual {v1, v0}, Llg1;->r(I)I

    .line 386
    .line 387
    .line 388
    move-result v1

    .line 389
    :goto_9
    invoke-static {v3}, Ln74;->b(I)I

    .line 390
    .line 391
    .line 392
    move-result v11

    .line 393
    if-ne v1, v0, :cond_19

    .line 394
    .line 395
    goto :goto_a

    .line 396
    :cond_19
    move v0, v10

    .line 397
    :goto_a
    invoke-static {v4}, Ln74;->c(I)I

    .line 398
    .line 399
    .line 400
    move-result v1

    .line 401
    move v13, v11

    .line 402
    move/from16 v17, v15

    .line 403
    .line 404
    move v11, v0

    .line 405
    move v15, v1

    .line 406
    goto :goto_b

    .line 407
    :cond_1a
    move v13, v11

    .line 408
    move/from16 v17, v15

    .line 409
    .line 410
    move v15, v13

    .line 411
    :goto_b
    new-instance v12, Ln74;

    .line 412
    .line 413
    move/from16 v18, v16

    .line 414
    .line 415
    move-object/from16 v16, v14

    .line 416
    .line 417
    move v14, v11

    .line 418
    invoke-direct/range {v12 .. v18}, Ln74;-><init>(III[BII)V

    .line 419
    .line 420
    .line 421
    return-object v12
.end method

.method public static i(Lkz2;IIIILjava/lang/String;ZLie4;Lts;I)V
    .locals 51

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move-object/from16 v5, p5

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    .line 1
    sget-object v8, Lyc0;->f:[I

    sget-object v9, Lyc0;->d:[I

    add-int/lit8 v10, v2, 0x10

    invoke-virtual {v0, v10}, Lkz2;->E(I)V

    const/4 v10, 0x6

    const/16 v11, 0x8

    if-eqz p6, :cond_0

    .line 2
    invoke-virtual {v0}, Lkz2;->L()I

    move-result v13

    .line 3
    invoke-virtual {v0, v10}, Lkz2;->G(I)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v0, v11}, Lkz2;->G(I)V

    const/4 v13, 0x0

    :goto_0
    const/4 v12, 0x4

    const/4 v10, 0x2

    const/4 v15, 0x1

    const/16 v14, 0x10

    if-eqz v13, :cond_a

    if-ne v13, v15, :cond_1

    goto/16 :goto_2

    :cond_1
    if-ne v13, v10, :cond_a2

    .line 5
    invoke-virtual {v0, v14}, Lkz2;->G(I)V

    .line 6
    invoke-virtual {v0}, Lkz2;->d()J

    move-result-wide v21

    invoke-static/range {v21 .. v22}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v21

    .line 7
    invoke-static/range {v21 .. v22}, Ljava/lang/Math;->round(D)J

    move-result-wide v14

    long-to-int v13, v14

    .line 8
    invoke-virtual {v0}, Lkz2;->h()I

    move-result v14

    .line 9
    invoke-virtual {v0, v12}, Lkz2;->G(I)V

    .line 10
    invoke-virtual {v0}, Lkz2;->h()I

    move-result v15

    .line 11
    invoke-virtual {v0}, Lkz2;->h()I

    move-result v21

    and-int/lit8 v22, v21, 0x1

    and-int/lit8 v21, v21, 0x2

    if-nez v22, :cond_9

    if-ne v15, v11, :cond_2

    const/4 v15, 0x3

    goto :goto_1

    :cond_2
    const/16 v10, 0x10

    if-ne v15, v10, :cond_4

    if-eqz v21, :cond_3

    const/high16 v15, 0x10000000

    goto :goto_1

    :cond_3
    const/4 v15, 0x2

    goto :goto_1

    :cond_4
    const/16 v10, 0x18

    if-ne v15, v10, :cond_6

    if-eqz v21, :cond_5

    const/high16 v10, 0x50000000

    move v15, v10

    goto :goto_1

    :cond_5
    const/16 v15, 0x15

    goto :goto_1

    :cond_6
    const/16 v10, 0x20

    if-ne v15, v10, :cond_8

    if-eqz v21, :cond_7

    const/high16 v15, 0x60000000

    goto :goto_1

    :cond_7
    const/16 v15, 0x16

    goto :goto_1

    :cond_8
    const/4 v15, -0x1

    goto :goto_1

    :cond_9
    const/16 v10, 0x20

    if-ne v15, v10, :cond_8

    move v15, v12

    .line 12
    :goto_1
    invoke-virtual {v0, v11}, Lkz2;->G(I)V

    move v10, v15

    const/4 v15, 0x0

    goto :goto_3

    .line 13
    :cond_a
    :goto_2
    invoke-virtual {v0}, Lkz2;->L()I

    move-result v10

    const/4 v14, 0x6

    .line 14
    invoke-virtual {v0, v14}, Lkz2;->G(I)V

    .line 15
    invoke-virtual {v0}, Lkz2;->f()I

    move-result v14

    .line 16
    iget v15, v0, Lkz2;->b:I

    add-int/lit8 v15, v15, -0x4

    .line 17
    invoke-virtual {v0, v15}, Lkz2;->E(I)V

    .line 18
    invoke-virtual {v0}, Lkz2;->b()I

    move-result v15

    const/4 v11, 0x1

    if-ne v13, v11, :cond_b

    const/16 v11, 0x10

    .line 19
    invoke-virtual {v0, v11}, Lkz2;->G(I)V

    :cond_b
    move v13, v14

    move v14, v10

    const/4 v10, -0x1

    :goto_3
    const v11, 0x73616d72

    const v12, 0x69616d66

    if-ne v1, v12, :cond_c

    const/4 v13, -0x1

    const/4 v14, -0x1

    goto :goto_5

    :cond_c
    if-ne v1, v11, :cond_d

    const/16 v13, 0x1f40

    :goto_4
    const/4 v14, 0x1

    goto :goto_5

    :cond_d
    const v12, 0x73617762

    if-ne v1, v12, :cond_e

    const/16 v1, 0x3e80

    move v13, v1

    const v1, 0x73617762

    goto :goto_4

    .line 20
    :cond_e
    :goto_5
    iget v12, v0, Lkz2;->b:I

    const v11, 0x656e6361

    move-object/from16 v29, v8

    if-ne v1, v11, :cond_11

    .line 21
    invoke-static {v0, v2, v3}, Lej1;->k(Lkz2;II)Landroid/util/Pair;

    move-result-object v1

    if-eqz v1, :cond_10

    .line 22
    iget-object v11, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v11, Ljava/lang/Integer;

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    if-nez v6, :cond_f

    const/4 v6, 0x0

    goto :goto_6

    .line 23
    :cond_f
    iget-object v8, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v8, Lrj1;

    iget-object v8, v8, Lrj1;->b:Ljava/lang/String;

    invoke-virtual {v6, v8}, Lie4;->a(Ljava/lang/String;)Lie4;

    move-result-object v6

    .line 24
    :goto_6
    iget-object v8, v7, Lts;->c:Ljava/lang/Object;

    check-cast v8, [Lrj1;

    .line 25
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Lrj1;

    aput-object v1, v8, p9

    :cond_10
    move v1, v11

    .line 26
    invoke-virtual {v0, v12}, Lkz2;->E(I)V

    :cond_11
    const-string v11, "audio/mhm1"

    const-string v8, "audio/ac4"

    const-string v30, "audio/eac3"

    const-string v2, "audio/ac3"

    const-string v31, "audio/raw"

    move-object/from16 v32, v9

    const v9, 0x61632d33

    if-ne v1, v9, :cond_12

    move-object v9, v2

    goto/16 :goto_a

    :cond_12
    const v9, 0x65632d33

    if-ne v1, v9, :cond_13

    move-object/from16 v9, v30

    goto/16 :goto_a

    :cond_13
    const v9, 0x61632d34

    if-ne v1, v9, :cond_14

    move-object v9, v8

    goto/16 :goto_a

    :cond_14
    const v9, 0x64747363

    if-ne v1, v9, :cond_15

    .line 27
    const-string v9, "audio/vnd.dts"

    goto/16 :goto_a

    :cond_15
    const v9, 0x64747368

    if-eq v1, v9, :cond_2a

    const v9, 0x6474736c

    if-ne v1, v9, :cond_16

    goto/16 :goto_9

    :cond_16
    const v9, 0x64747365

    if-ne v1, v9, :cond_17

    const-string v9, "audio/vnd.dts.hd;profile=lbr"

    goto/16 :goto_a

    :cond_17
    const v9, 0x64747378

    if-ne v1, v9, :cond_18

    const-string v9, "audio/vnd.dts.uhd;profile=p2"

    goto/16 :goto_a

    :cond_18
    const v9, 0x73616d72

    if-ne v1, v9, :cond_19

    const-string v9, "audio/3gpp"

    goto/16 :goto_a

    :cond_19
    const v9, 0x73617762

    if-ne v1, v9, :cond_1a

    const-string v9, "audio/amr-wb"

    goto/16 :goto_a

    :cond_1a
    const v9, 0x736f7774

    if-ne v1, v9, :cond_1b

    :goto_7
    move-object/from16 v9, v31

    const/4 v10, 0x2

    goto/16 :goto_a

    :cond_1b
    const v9, 0x74776f73

    if-ne v1, v9, :cond_1c

    move-object/from16 v9, v31

    const/high16 v10, 0x10000000

    goto/16 :goto_a

    :cond_1c
    const v9, 0x6c70636d

    if-ne v1, v9, :cond_1e

    const/4 v9, -0x1

    if-ne v10, v9, :cond_1d

    goto :goto_7

    :cond_1d
    move-object/from16 v9, v31

    goto/16 :goto_a

    :cond_1e
    const v9, 0x2e6d7032

    if-eq v1, v9, :cond_29

    const v9, 0x2e6d7033

    if-ne v1, v9, :cond_1f

    goto :goto_8

    :cond_1f
    const v9, 0x6d686131

    if-ne v1, v9, :cond_20

    const-string v9, "audio/mha1"

    goto :goto_a

    :cond_20
    const v9, 0x6d686d31

    if-ne v1, v9, :cond_21

    move-object v9, v11

    goto :goto_a

    :cond_21
    const v9, 0x616c6163

    if-ne v1, v9, :cond_22

    const-string v9, "audio/alac"

    goto :goto_a

    :cond_22
    const v9, 0x616c6177

    if-ne v1, v9, :cond_23

    const-string v9, "audio/g711-alaw"

    goto :goto_a

    :cond_23
    const v9, 0x756c6177

    if-ne v1, v9, :cond_24

    const-string v9, "audio/g711-mlaw"

    goto :goto_a

    :cond_24
    const v9, 0x4f707573

    if-ne v1, v9, :cond_25

    const-string v9, "audio/opus"

    goto :goto_a

    :cond_25
    const v9, 0x664c6143

    if-ne v1, v9, :cond_26

    const-string v9, "audio/flac"

    goto :goto_a

    :cond_26
    const v9, 0x6d6c7061

    if-ne v1, v9, :cond_27

    const-string v9, "audio/true-hd"

    goto :goto_a

    :cond_27
    const v9, 0x69616d66

    if-ne v1, v9, :cond_28

    const-string v1, "audio/iamf"

    move/from16 v50, v9

    move-object v9, v1

    move/from16 v1, v50

    goto :goto_a

    :cond_28
    const/4 v9, 0x0

    goto :goto_a

    :cond_29
    :goto_8
    const-string v9, "audio/mpeg"

    goto :goto_a

    :cond_2a
    :goto_9
    const-string v9, "audio/vnd.dts.hd"

    :goto_a
    move/from16 v16, v10

    move/from16 v27, v13

    const/4 v10, 0x0

    const/16 v26, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    :goto_b
    sub-int v13, v12, p2

    if-ge v13, v3, :cond_9f

    .line 28
    invoke-virtual {v0, v12}, Lkz2;->E(I)V

    .line 29
    invoke-virtual {v0}, Lkz2;->b()I

    move-result v13

    if-lez v13, :cond_2b

    const/4 v3, 0x1

    :goto_c
    move/from16 v28, v14

    goto :goto_d

    :cond_2b
    const/4 v3, 0x0

    goto :goto_c

    .line 30
    :goto_d
    const-string v14, "childAtomSize must be positive"

    invoke-static {v14, v3}, Lqb1;->y(Ljava/lang/String;Z)V

    .line 31
    invoke-virtual {v0}, Lkz2;->b()I

    move-result v3

    const v4, 0x6d686143

    if-ne v3, v4, :cond_2e

    add-int/lit8 v3, v12, 0x8

    .line 32
    invoke-virtual {v0, v3}, Lkz2;->E(I)V

    const/4 v3, 0x1

    .line 33
    invoke-virtual {v0, v3}, Lkz2;->G(I)V

    .line 34
    invoke-virtual {v0}, Lkz2;->K()I

    move-result v4

    .line 35
    invoke-virtual {v0, v3}, Lkz2;->G(I)V

    .line 36
    invoke-static {v9, v11}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2c

    .line 37
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "mhm1.%02X"

    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    goto :goto_e

    .line 38
    :cond_2c
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "mha1.%02X"

    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 39
    :goto_e
    invoke-virtual {v0}, Lkz2;->L()I

    move-result v4

    new-array v14, v4, [B

    move-object/from16 p9, v3

    const/4 v3, 0x0

    .line 40
    invoke-virtual {v0, v14, v3, v4}, Lkz2;->H([BII)V

    if-nez v10, :cond_2d

    .line 41
    invoke-static {v14}, Lxm3;->i(Ljava/lang/Object;)Lsn3;

    move-result-object v10

    move/from16 v4, p4

    move-object/from16 v26, p9

    move-object/from16 v38, v2

    move-object/from16 v46, v9

    move-object/from16 v44, v10

    move-object/from16 p9, v11

    move/from16 v39, v12

    move/from16 v36, v13

    move/from16 v14, v28

    const/16 v18, 0x3

    const/16 v21, 0x8

    const/16 v25, 0x4

    move v9, v1

    move v10, v3

    goto/16 :goto_5d

    .line 42
    :cond_2d
    invoke-interface {v10, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [B

    invoke-static {v14, v4}, Lxm3;->j(Ljava/lang/Object;Ljava/lang/Object;)Lsn3;

    move-result-object v10

    move/from16 v4, p4

    move-object/from16 v26, p9

    :goto_f
    move-object/from16 v38, v2

    move-object/from16 v46, v9

    move-object/from16 v44, v10

    move-object/from16 p9, v11

    move/from16 v39, v12

    move/from16 v36, v13

    :goto_10
    move/from16 v14, v28

    const/4 v10, 0x0

    :goto_11
    const/16 v18, 0x3

    const/16 v21, 0x8

    const/16 v25, 0x4

    move v9, v1

    goto/16 :goto_5d

    :cond_2e
    const v4, 0x6d686150

    if-ne v3, v4, :cond_31

    add-int/lit8 v3, v12, 0x8

    .line 43
    invoke-virtual {v0, v3}, Lkz2;->E(I)V

    .line 44
    invoke-virtual {v0}, Lkz2;->K()I

    move-result v3

    if-lez v3, :cond_30

    new-array v4, v3, [B

    const/4 v14, 0x0

    .line 45
    invoke-virtual {v0, v4, v14, v3}, Lkz2;->H([BII)V

    if-nez v10, :cond_2f

    .line 46
    invoke-static {v4}, Lxm3;->i(Ljava/lang/Object;)Lsn3;

    move-result-object v10

    move/from16 v4, p4

    move-object/from16 v38, v2

    move-object/from16 v46, v9

    move-object/from16 v44, v10

    move-object/from16 p9, v11

    move/from16 v39, v12

    move/from16 v36, v13

    move v10, v14

    move/from16 v14, v28

    goto :goto_11

    .line 47
    :cond_2f
    invoke-interface {v10, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    invoke-static {v3, v4}, Lxm3;->j(Ljava/lang/Object;Ljava/lang/Object;)Lsn3;

    move-result-object v10

    move/from16 v4, p4

    goto :goto_f

    :cond_30
    move-object/from16 p9, v9

    move v9, v1

    move-object/from16 v1, p9

    move/from16 v4, p4

    move-object/from16 v38, v2

    move-object/from16 v44, v10

    move-object/from16 p9, v11

    move/from16 v39, v12

    move/from16 v36, v13

    :goto_12
    move/from16 v13, v27

    move/from16 v14, v28

    const/4 v10, 0x0

    const/16 v18, 0x3

    const/16 v21, 0x8

    :goto_13
    const/16 v25, 0x4

    goto/16 :goto_5c

    :cond_31
    const v4, 0x65736473

    move-object/from16 p9, v11

    if-eq v3, v4, :cond_99

    if-eqz p6, :cond_36

    const v11, 0x77617665

    if-ne v3, v11, :cond_36

    .line 48
    iget v3, v0, Lkz2;->b:I

    if-lt v3, v12, :cond_32

    const/4 v11, 0x1

    :goto_14
    const/4 v4, 0x0

    goto :goto_15

    :cond_32
    const/4 v11, 0x0

    goto :goto_14

    .line 49
    :goto_15
    invoke-static {v4, v11}, Lqb1;->y(Ljava/lang/String;Z)V

    :goto_16
    sub-int v4, v3, v12

    if-ge v4, v13, :cond_35

    .line 50
    invoke-virtual {v0, v3}, Lkz2;->E(I)V

    .line 51
    invoke-virtual {v0}, Lkz2;->b()I

    move-result v4

    if-lez v4, :cond_33

    const/4 v11, 0x1

    goto :goto_17

    :cond_33
    const/4 v11, 0x0

    .line 52
    :goto_17
    invoke-static {v14, v11}, Lqb1;->y(Ljava/lang/String;Z)V

    .line 53
    invoke-virtual {v0}, Lkz2;->b()I

    move-result v11

    move/from16 v37, v3

    const v3, 0x65736473

    if-eq v11, v3, :cond_34

    add-int v4, v37, v4

    move v3, v4

    goto :goto_16

    :cond_34
    move-object v3, v9

    move v9, v1

    move-object v1, v3

    move/from16 v4, p4

    move-object/from16 v38, v2

    move-object/from16 v44, v10

    move/from16 v39, v12

    move/from16 v36, v13

    move/from16 v13, v27

    move/from16 v14, v28

    const/4 v3, -0x1

    const/16 v10, 0x20

    const/4 v12, 0x2

    const/16 v18, 0x3

    const/16 v21, 0x8

    const/16 v25, 0x4

    move-object v2, v0

    move/from16 v0, v37

    goto/16 :goto_56

    :cond_35
    move-object v3, v9

    move v9, v1

    move-object v1, v3

    move/from16 v4, p4

    move-object/from16 v38, v2

    move-object/from16 v44, v10

    move/from16 v39, v12

    move/from16 v36, v13

    move/from16 v13, v27

    move/from16 v14, v28

    const/4 v3, -0x1

    const/16 v10, 0x20

    const/4 v12, 0x2

    const/16 v18, 0x3

    const/16 v21, 0x8

    const/16 v25, 0x4

    move-object v2, v0

    const/4 v0, -0x1

    goto/16 :goto_56

    :cond_36
    const v4, 0x62747274

    if-ne v3, v4, :cond_37

    add-int/lit8 v3, v12, 0x8

    .line 54
    invoke-virtual {v0, v3}, Lkz2;->E(I)V

    const/4 v3, 0x4

    .line 55
    invoke-virtual {v0, v3}, Lkz2;->G(I)V

    .line 56
    invoke-virtual {v0}, Lkz2;->P()J

    move-result-wide v3

    move v14, v12

    .line 57
    invoke-virtual {v0}, Lkz2;->P()J

    move-result-wide v11

    move/from16 v36, v13

    new-instance v13, Lib1;

    invoke-direct {v13, v11, v12, v3, v4}, Lib1;-><init>(JJ)V

    move/from16 v4, p4

    move-object/from16 v38, v2

    move-object/from16 v46, v9

    move-object/from16 v44, v10

    move-object/from16 v34, v13

    move/from16 v39, v14

    goto/16 :goto_10

    :cond_37
    move v14, v12

    move/from16 v36, v13

    const v4, 0x64616333

    if-ne v3, v4, :cond_39

    add-int/lit8 v12, v14, 0x8

    .line 58
    invoke-virtual {v0, v12}, Lkz2;->E(I)V

    .line 59
    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    .line 60
    new-instance v4, Llg1;

    invoke-direct {v4}, Llg1;-><init>()V

    .line 61
    invoke-virtual {v4, v0}, Llg1;->b(Lkz2;)V

    const/4 v12, 0x2

    .line 62
    invoke-virtual {v4, v12}, Llg1;->r(I)I

    move-result v13

    .line 63
    aget v12, v32, v13

    const/16 v13, 0x8

    .line 64
    invoke-virtual {v4, v13}, Llg1;->o(I)V

    const/4 v13, 0x3

    .line 65
    invoke-virtual {v4, v13}, Llg1;->r(I)I

    move-result v35

    aget v13, v29, v35

    const/4 v11, 0x1

    .line 66
    invoke-virtual {v4, v11}, Llg1;->r(I)I

    move-result v35

    if-eqz v35, :cond_38

    add-int/lit8 v13, v13, 0x1

    :cond_38
    const/4 v11, 0x5

    .line 67
    invoke-virtual {v4, v11}, Llg1;->r(I)I

    move-result v11

    sget-object v35, Lyc0;->g:[I

    .line 68
    aget v11, v35, v11

    mul-int/lit16 v11, v11, 0x3e8

    .line 69
    invoke-virtual {v4}, Llg1;->w()V

    .line 70
    invoke-virtual {v4}, Llg1;->i()I

    move-result v4

    invoke-virtual {v0, v4}, Lkz2;->E(I)V

    new-instance v4, Lgg4;

    .line 71
    invoke-direct {v4}, Lgg4;-><init>()V

    .line 72
    iput-object v3, v4, Lgg4;->a:Ljava/lang/String;

    .line 73
    invoke-virtual {v4, v2}, Lgg4;->e(Ljava/lang/String;)V

    .line 74
    iput v13, v4, Lgg4;->D:I

    .line 75
    iput v12, v4, Lgg4;->E:I

    .line 76
    iput-object v6, v4, Lgg4;->p:Lie4;

    .line 77
    iput-object v5, v4, Lgg4;->d:Ljava/lang/String;

    .line 78
    iput v11, v4, Lgg4;->g:I

    .line 79
    iput v11, v4, Lgg4;->h:I

    .line 80
    new-instance v3, Lph4;

    .line 81
    invoke-direct {v3, v4}, Lph4;-><init>(Lgg4;)V

    .line 82
    iput-object v3, v7, Lts;->d:Ljava/lang/Object;

    move-object v4, v9

    move v9, v1

    move-object v1, v4

    move/from16 v4, p4

    move-object/from16 v38, v2

    move-object/from16 v44, v10

    move/from16 v39, v14

    goto/16 :goto_12

    :cond_39
    const v4, 0x64656333

    const/16 v11, 0xa

    const/16 v12, 0xd

    if-ne v3, v4, :cond_3e

    add-int/lit8 v3, v14, 0x8

    .line 83
    invoke-virtual {v0, v3}, Lkz2;->E(I)V

    .line 84
    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    .line 85
    new-instance v4, Llg1;

    invoke-direct {v4}, Llg1;-><init>()V

    .line 86
    invoke-virtual {v4, v0}, Llg1;->b(Lkz2;)V

    .line 87
    invoke-virtual {v4, v12}, Llg1;->r(I)I

    move-result v12

    mul-int/lit16 v12, v12, 0x3e8

    const/4 v13, 0x3

    .line 88
    invoke-virtual {v4, v13}, Llg1;->o(I)V

    const/4 v13, 0x2

    .line 89
    invoke-virtual {v4, v13}, Llg1;->r(I)I

    move-result v35

    .line 90
    aget v13, v32, v35

    .line 91
    invoke-virtual {v4, v11}, Llg1;->o(I)V

    const/4 v11, 0x3

    .line 92
    invoke-virtual {v4, v11}, Llg1;->r(I)I

    move-result v18

    aget v18, v29, v18

    const/4 v11, 0x1

    .line 93
    invoke-virtual {v4, v11}, Llg1;->r(I)I

    move-result v23

    if-eqz v23, :cond_3a

    add-int/lit8 v18, v18, 0x1

    :cond_3a
    move/from16 v23, v18

    const/4 v11, 0x3

    .line 94
    invoke-virtual {v4, v11}, Llg1;->o(I)V

    const/4 v11, 0x4

    .line 95
    invoke-virtual {v4, v11}, Llg1;->r(I)I

    move-result v37

    const/4 v11, 0x1

    .line 96
    invoke-virtual {v4, v11}, Llg1;->o(I)V

    move-object/from16 v38, v2

    if-lez v37, :cond_3c

    const/4 v2, 0x6

    .line 97
    invoke-virtual {v4, v2}, Llg1;->o(I)V

    .line 98
    invoke-virtual {v4, v11}, Llg1;->r(I)I

    move-result v2

    if-eqz v2, :cond_3b

    add-int/lit8 v23, v23, 0x2

    .line 99
    :cond_3b
    invoke-virtual {v4, v11}, Llg1;->o(I)V

    :cond_3c
    move/from16 v2, v23

    invoke-virtual {v4}, Llg1;->f()I

    move-result v11

    move/from16 v39, v14

    const/4 v14, 0x7

    if-le v11, v14, :cond_3d

    .line 100
    invoke-virtual {v4, v14}, Llg1;->o(I)V

    const/4 v11, 0x1

    .line 101
    invoke-virtual {v4, v11}, Llg1;->r(I)I

    move-result v14

    if-eqz v14, :cond_3d

    const-string v11, "audio/eac3-joc"

    goto :goto_18

    :cond_3d
    move-object/from16 v11, v30

    .line 102
    :goto_18
    invoke-virtual {v4}, Llg1;->w()V

    .line 103
    invoke-virtual {v4}, Llg1;->i()I

    move-result v4

    invoke-virtual {v0, v4}, Lkz2;->E(I)V

    new-instance v4, Lgg4;

    .line 104
    invoke-direct {v4}, Lgg4;-><init>()V

    .line 105
    iput-object v3, v4, Lgg4;->a:Ljava/lang/String;

    .line 106
    invoke-virtual {v4, v11}, Lgg4;->e(Ljava/lang/String;)V

    .line 107
    iput v2, v4, Lgg4;->D:I

    .line 108
    iput v13, v4, Lgg4;->E:I

    .line 109
    iput-object v6, v4, Lgg4;->p:Lie4;

    .line 110
    iput-object v5, v4, Lgg4;->d:Ljava/lang/String;

    .line 111
    iput v12, v4, Lgg4;->h:I

    .line 112
    new-instance v2, Lph4;

    .line 113
    invoke-direct {v2, v4}, Lph4;-><init>(Lgg4;)V

    .line 114
    iput-object v2, v7, Lts;->d:Ljava/lang/Object;

    move-object v4, v9

    move v9, v1

    move-object v1, v4

    move/from16 v4, p4

    move-object/from16 v44, v10

    goto/16 :goto_12

    :cond_3e
    move-object/from16 v38, v2

    move/from16 v39, v14

    const v2, 0x64616334

    const/16 v14, 0x9

    if-ne v3, v2, :cond_7d

    add-int/lit8 v2, v39, 0x8

    .line 115
    invoke-virtual {v0, v2}, Lkz2;->E(I)V

    .line 116
    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    .line 117
    new-instance v3, Llg1;

    invoke-direct {v3}, Llg1;-><init>()V

    .line 118
    invoke-virtual {v3, v0}, Llg1;->b(Lkz2;)V

    invoke-virtual {v3}, Llg1;->f()I

    move-result v40

    const/4 v12, 0x3

    .line 119
    invoke-virtual {v3, v12}, Llg1;->r(I)I

    move-result v11

    const/4 v12, 0x1

    if-gt v11, v12, :cond_7c

    const/4 v13, 0x7

    .line 120
    invoke-virtual {v3, v13}, Llg1;->r(I)I

    move-result v4

    .line 121
    invoke-virtual {v3}, Llg1;->q()Z

    move-result v13

    if-eq v12, v13, :cond_3f

    const v13, 0xac44

    :goto_19
    const/4 v12, 0x4

    goto :goto_1a

    :cond_3f
    const v13, 0xbb80

    goto :goto_19

    .line 122
    :goto_1a
    invoke-virtual {v3, v12}, Llg1;->o(I)V

    .line 123
    invoke-virtual {v3, v14}, Llg1;->r(I)I

    move-result v12

    const/4 v14, 0x1

    if-le v4, v14, :cond_41

    if-eqz v11, :cond_40

    .line 124
    invoke-virtual {v3}, Llg1;->q()Z

    move-result v14

    if-eqz v14, :cond_41

    const/16 v14, 0x10

    .line 125
    invoke-virtual {v3, v14}, Llg1;->o(I)V

    .line 126
    invoke-virtual {v3}, Llg1;->q()Z

    move-result v14

    if-eqz v14, :cond_41

    const/16 v14, 0x80

    .line 127
    invoke-virtual {v3, v14}, Llg1;->o(I)V

    goto :goto_1b

    .line 128
    :cond_40
    const-string v0, "Invalid AC-4 DSI version: 0"

    .line 129
    invoke-static {v0}, Llq1;->b(Ljava/lang/String;)Llq1;

    move-result-object v0

    throw v0

    :cond_41
    :goto_1b
    const/4 v14, 0x1

    if-ne v11, v14, :cond_43

    .line 130
    invoke-virtual {v3}, Llg1;->f()I

    move-result v14

    move/from16 v43, v4

    const/16 v4, 0x42

    if-lt v14, v4, :cond_42

    invoke-virtual {v3, v4}, Llg1;->o(I)V

    .line 131
    invoke-virtual {v3}, Llg1;->w()V

    goto :goto_1c

    .line 132
    :cond_42
    const-string v0, "Invalid AC-4 DSI bitrate."

    .line 133
    invoke-static {v0}, Llq1;->b(Ljava/lang/String;)Llq1;

    move-result-object v0

    throw v0

    :cond_43
    move/from16 v43, v4

    .line 134
    :goto_1c
    new-instance v4, Lue1;

    .line 135
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    const/4 v14, 0x1

    iput-boolean v14, v4, Lue1;->a:Z

    const/4 v14, -0x1

    iput v14, v4, Lue1;->b:I

    iput v14, v4, Lue1;->c:I

    const/4 v14, 0x1

    iput-boolean v14, v4, Lue1;->d:Z

    move-object/from16 v44, v10

    const/4 v10, 0x2

    iput v10, v4, Lue1;->e:I

    iput v14, v4, Lue1;->f:I

    const/4 v14, 0x0

    iput v14, v4, Lue1;->g:I

    const/4 v10, 0x0

    :goto_1d
    if-ge v10, v12, :cond_6c

    if-nez v11, :cond_44

    .line 136
    invoke-virtual {v3}, Llg1;->q()Z

    move-result v12

    const/4 v14, 0x5

    .line 137
    invoke-virtual {v3, v14}, Llg1;->r(I)I

    move-result v35

    .line 138
    invoke-virtual {v3, v14}, Llg1;->r(I)I

    move-result v42

    move/from16 v48, v1

    move-object/from16 v46, v9

    move/from16 v9, v42

    const/4 v1, 0x0

    const/4 v14, 0x0

    move/from16 v42, v12

    move/from16 v12, v35

    const/16 v35, 0x0

    goto :goto_21

    :cond_44
    move/from16 v45, v12

    const/16 v14, 0x8

    .line 139
    invoke-virtual {v3, v14}, Llg1;->r(I)I

    move-result v12

    move-object/from16 v46, v9

    .line 140
    invoke-virtual {v3, v14}, Llg1;->r(I)I

    move-result v9

    const/16 v14, 0xff

    move/from16 v48, v1

    if-ne v9, v14, :cond_45

    const/16 v9, 0x10

    .line 141
    invoke-virtual {v3, v9}, Llg1;->r(I)I

    move-result v1

    add-int/2addr v1, v14

    move/from16 v47, v1

    :goto_1e
    const/4 v1, 0x2

    goto :goto_1f

    :cond_45
    move/from16 v47, v9

    goto :goto_1e

    :goto_1f
    if-le v12, v1, :cond_46

    mul-int/lit8 v1, v47, 0x8

    .line 142
    invoke-virtual {v3, v1}, Llg1;->o(I)V

    add-int/lit8 v10, v10, 0x1

    move/from16 v12, v45

    move-object/from16 v9, v46

    move/from16 v1, v48

    goto :goto_1d

    :cond_46
    invoke-virtual {v3}, Llg1;->f()I

    move-result v1

    sub-int v1, v40, v1

    const/16 v21, 0x8

    div-int/lit8 v1, v1, 0x8

    const/4 v14, 0x5

    .line 143
    invoke-virtual {v3, v14}, Llg1;->r(I)I

    move-result v9

    const/16 v14, 0x1f

    if-ne v9, v14, :cond_47

    const/4 v14, 0x1

    goto :goto_20

    :cond_47
    const/4 v14, 0x0

    :goto_20
    move/from16 v35, v12

    move v12, v9

    move/from16 v9, v35

    move/from16 v35, v1

    move/from16 v1, v47

    const/16 v42, 0x0

    .line 144
    :goto_21
    iput v9, v4, Lue1;->f:I

    move/from16 v45, v14

    if-nez v42, :cond_48

    if-nez v45, :cond_48

    const/4 v14, 0x6

    if-eq v12, v14, :cond_49

    :cond_48
    const/4 v14, 0x3

    goto :goto_23

    :cond_49
    :goto_22
    const/4 v14, 0x7

    goto/16 :goto_33

    .line 145
    :goto_23
    invoke-virtual {v3, v14}, Llg1;->r(I)I

    move-result v0

    iput v0, v4, Lue1;->g:I

    .line 146
    invoke-virtual {v3}, Llg1;->q()Z

    move-result v0

    if-eqz v0, :cond_4a

    const/4 v14, 0x5

    .line 147
    invoke-virtual {v3, v14}, Llg1;->o(I)V

    :cond_4a
    const/4 v0, 0x2

    .line 148
    invoke-virtual {v3, v0}, Llg1;->o(I)V

    const/4 v14, 0x1

    if-ne v11, v14, :cond_4c

    if-eq v9, v14, :cond_4b

    if-ne v9, v0, :cond_4c

    move v9, v0

    .line 149
    :cond_4b
    invoke-virtual {v3, v0}, Llg1;->o(I)V

    :cond_4c
    const/4 v0, 0x5

    .line 150
    invoke-virtual {v3, v0}, Llg1;->o(I)V

    const/16 v0, 0xa

    .line 151
    invoke-virtual {v3, v0}, Llg1;->o(I)V

    if-ne v11, v14, :cond_55

    if-lez v9, :cond_4d

    .line 152
    invoke-virtual {v3}, Llg1;->q()Z

    move-result v0

    iput-boolean v0, v4, Lue1;->a:Z

    :cond_4d
    iget-boolean v0, v4, Lue1;->a:Z

    if-eqz v0, :cond_52

    if-eq v9, v14, :cond_4f

    const/4 v0, 0x2

    if-ne v9, v0, :cond_4e

    const/16 v49, 0x2

    :goto_24
    const/4 v14, 0x5

    goto :goto_26

    :cond_4e
    move/from16 v49, v9

    :goto_25
    const/16 v14, 0x18

    goto :goto_27

    :cond_4f
    const/16 v49, 0x1

    goto :goto_24

    .line 153
    :goto_26
    invoke-virtual {v3, v14}, Llg1;->r(I)I

    move-result v0

    if-ltz v0, :cond_50

    const/16 v14, 0xf

    if-gt v0, v14, :cond_50

    iput v0, v4, Lue1;->b:I

    :cond_50
    const/16 v14, 0xb

    if-lt v0, v14, :cond_51

    const/16 v14, 0xe

    if-gt v0, v14, :cond_51

    .line 154
    invoke-virtual {v3}, Llg1;->q()Z

    move-result v0

    iput-boolean v0, v4, Lue1;->d:Z

    const/4 v0, 0x2

    .line 155
    invoke-virtual {v3, v0}, Llg1;->r(I)I

    move-result v14

    iput v14, v4, Lue1;->e:I

    goto :goto_25

    :cond_51
    const/4 v0, 0x2

    goto :goto_25

    .line 156
    :goto_27
    invoke-virtual {v3, v14}, Llg1;->o(I)V

    const/4 v14, 0x1

    goto :goto_28

    :cond_52
    const/4 v0, 0x2

    move/from16 v49, v9

    :goto_28
    if-eq v9, v14, :cond_53

    if-ne v9, v0, :cond_56

    .line 157
    :cond_53
    invoke-virtual {v3}, Llg1;->q()Z

    move-result v9

    if-eqz v9, :cond_54

    .line 158
    invoke-virtual {v3}, Llg1;->q()Z

    move-result v9

    if-eqz v9, :cond_54

    .line 159
    invoke-virtual {v3, v0}, Llg1;->o(I)V

    .line 160
    :cond_54
    invoke-virtual {v3}, Llg1;->q()Z

    move-result v0

    if-eqz v0, :cond_56

    .line 161
    invoke-virtual {v3}, Llg1;->m()V

    const/16 v14, 0x8

    .line 162
    invoke-virtual {v3, v14}, Llg1;->r(I)I

    move-result v0

    const/4 v9, 0x0

    :goto_29
    if-ge v9, v0, :cond_56

    .line 163
    invoke-virtual {v3, v14}, Llg1;->o(I)V

    add-int/lit8 v9, v9, 0x1

    const/16 v14, 0x8

    goto :goto_29

    :cond_55
    move/from16 v49, v9

    :cond_56
    if-nez v42, :cond_5f

    if-eqz v45, :cond_57

    goto/16 :goto_31

    .line 164
    :cond_57
    invoke-virtual {v3}, Llg1;->m()V

    if-eqz v12, :cond_5d

    const/4 v14, 0x1

    if-eq v12, v14, :cond_5d

    const/4 v0, 0x2

    if-eq v12, v0, :cond_5d

    const/4 v14, 0x3

    if-eq v12, v14, :cond_5b

    const/4 v0, 0x4

    if-eq v12, v0, :cond_5b

    const/4 v14, 0x5

    if-eq v12, v14, :cond_58

    const/4 v14, 0x7

    .line 165
    invoke-virtual {v3, v14}, Llg1;->r(I)I

    move-result v0

    const/4 v9, 0x0

    :goto_2a
    if-ge v9, v0, :cond_61

    const/16 v14, 0x8

    .line 166
    invoke-virtual {v3, v14}, Llg1;->o(I)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_2a

    :cond_58
    if-nez v49, :cond_5a

    .line 167
    invoke-static {v3, v4}, Lzt0;->S(Llg1;Lue1;)V

    :cond_59
    :goto_2b
    const/16 v49, 0x0

    goto :goto_32

    :cond_5a
    const/4 v14, 0x3

    .line 168
    invoke-virtual {v3, v14}, Llg1;->r(I)I

    move-result v0

    const/4 v9, 0x0

    :goto_2c
    const/16 v22, 0x2

    add-int/lit8 v12, v0, 0x2

    if-ge v9, v12, :cond_61

    .line 169
    invoke-static {v3, v4}, Lzt0;->U(Llg1;Lue1;)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_2c

    :cond_5b
    if-nez v49, :cond_5c

    const/4 v0, 0x0

    const/4 v14, 0x3

    :goto_2d
    if-ge v0, v14, :cond_59

    .line 170
    invoke-static {v3, v4}, Lzt0;->S(Llg1;Lue1;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2d

    :cond_5c
    const/4 v0, 0x0

    :goto_2e
    const/4 v14, 0x3

    if-ge v0, v14, :cond_61

    .line 171
    invoke-static {v3, v4}, Lzt0;->U(Llg1;Lue1;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2e

    :cond_5d
    if-nez v49, :cond_5e

    const/4 v0, 0x0

    const/4 v12, 0x2

    :goto_2f
    if-ge v0, v12, :cond_59

    .line 172
    invoke-static {v3, v4}, Lzt0;->S(Llg1;Lue1;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2f

    :cond_5e
    const/4 v0, 0x0

    :goto_30
    const/4 v12, 0x2

    if-ge v0, v12, :cond_61

    .line 173
    invoke-static {v3, v4}, Lzt0;->U(Llg1;Lue1;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_30

    :cond_5f
    :goto_31
    if-nez v49, :cond_60

    .line 174
    invoke-static {v3, v4}, Lzt0;->S(Llg1;Lue1;)V

    goto :goto_2b

    .line 175
    :cond_60
    invoke-static {v3, v4}, Lzt0;->U(Llg1;Lue1;)V

    .line 176
    :cond_61
    :goto_32
    invoke-virtual {v3}, Llg1;->m()V

    .line 177
    invoke-virtual {v3}, Llg1;->q()Z

    move-result v0

    if-eqz v0, :cond_63

    move/from16 v9, v49

    goto/16 :goto_22

    .line 178
    :goto_33
    invoke-virtual {v3, v14}, Llg1;->r(I)I

    move-result v0

    const/4 v12, 0x0

    :goto_34
    if-ge v12, v0, :cond_62

    const/16 v14, 0xf

    .line 179
    invoke-virtual {v3, v14}, Llg1;->o(I)V

    add-int/lit8 v12, v12, 0x1

    const/4 v14, 0x7

    goto :goto_34

    :cond_62
    move/from16 v49, v9

    :cond_63
    if-lez v49, :cond_68

    .line 180
    invoke-virtual {v3}, Llg1;->q()Z

    move-result v0

    if-eqz v0, :cond_66

    .line 181
    invoke-virtual {v3}, Llg1;->f()I

    move-result v0

    const/16 v9, 0x42

    if-ge v0, v9, :cond_64

    const/4 v0, 0x0

    goto :goto_35

    :cond_64
    invoke-virtual {v3, v9}, Llg1;->o(I)V

    const/4 v0, 0x1

    :goto_35
    if-eqz v0, :cond_65

    goto :goto_36

    .line 182
    :cond_65
    const-string v0, "Can\'t parse bitrate DSI."

    .line 183
    invoke-static {v0}, Llq1;->b(Ljava/lang/String;)Llq1;

    move-result-object v0

    throw v0

    .line 184
    :cond_66
    :goto_36
    invoke-virtual {v3}, Llg1;->q()Z

    move-result v0

    if-eqz v0, :cond_68

    .line 185
    invoke-virtual {v3}, Llg1;->w()V

    const/16 v9, 0x10

    .line 186
    invoke-virtual {v3, v9}, Llg1;->r(I)I

    move-result v0

    .line 187
    invoke-virtual {v3, v0}, Llg1;->x(I)V

    const/4 v14, 0x5

    .line 188
    invoke-virtual {v3, v14}, Llg1;->r(I)I

    move-result v0

    const/4 v12, 0x0

    :goto_37
    if-ge v12, v0, :cond_67

    const/4 v14, 0x3

    .line 189
    invoke-virtual {v3, v14}, Llg1;->o(I)V

    const/16 v14, 0x8

    .line 190
    invoke-virtual {v3, v14}, Llg1;->o(I)V

    add-int/lit8 v12, v12, 0x1

    goto :goto_37

    :cond_67
    :goto_38
    const/16 v14, 0x8

    goto :goto_39

    :cond_68
    const/16 v9, 0x10

    goto :goto_38

    .line 191
    :goto_39
    invoke-virtual {v3}, Llg1;->w()V

    const/4 v12, 0x1

    if-ne v11, v12, :cond_6a

    invoke-virtual {v3}, Llg1;->f()I

    move-result v0

    sub-int v40, v40, v0

    div-int/lit8 v40, v40, 0x8

    sub-int v0, v40, v35

    if-lt v1, v0, :cond_69

    sub-int/2addr v1, v0

    .line 192
    invoke-virtual {v3, v1}, Llg1;->x(I)V

    goto :goto_3a

    .line 193
    :cond_69
    const-string v0, "pres_bytes is smaller than presentation bytes read."

    .line 194
    invoke-static {v0}, Llq1;->b(Ljava/lang/String;)Llq1;

    move-result-object v0

    throw v0

    .line 195
    :cond_6a
    :goto_3a
    iget-boolean v0, v4, Lue1;->a:Z

    if-eqz v0, :cond_6d

    iget v0, v4, Lue1;->b:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_6b

    goto :goto_3b

    .line 196
    :cond_6b
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x2d

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Can\'t determine channel mode of presentation "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Llq1;->b(Ljava/lang/String;)Llq1;

    move-result-object v0

    throw v0

    :cond_6c
    move/from16 v48, v1

    move-object/from16 v46, v9

    const/16 v9, 0x10

    const/16 v14, 0x8

    .line 197
    :cond_6d
    :goto_3b
    iget-boolean v0, v4, Lue1;->a:Z

    const/16 v1, 0xc

    if-eqz v0, :cond_73

    iget v0, v4, Lue1;->b:I

    iget-boolean v3, v4, Lue1;->d:Z

    iget v10, v4, Lue1;->e:I

    packed-switch v0, :pswitch_data_0

    const/16 v11, 0xb

    const/16 v37, -0x1

    goto :goto_3d

    :pswitch_0
    const/16 v11, 0xb

    const/16 v37, 0x18

    goto :goto_3d

    :pswitch_1
    const/16 v11, 0xb

    const/16 v37, 0xe

    goto :goto_3d

    :pswitch_2
    const/16 v11, 0xb

    const/16 v37, 0xd

    goto :goto_3d

    :pswitch_3
    move/from16 v37, v1

    :goto_3c
    const/16 v11, 0xb

    goto :goto_3d

    :pswitch_4
    const/16 v11, 0xb

    const/16 v37, 0xb

    goto :goto_3d

    :pswitch_5
    move/from16 v37, v14

    goto :goto_3c

    :pswitch_6
    const/16 v11, 0xb

    const/16 v37, 0x7

    goto :goto_3d

    :pswitch_7
    const/16 v11, 0xb

    const/16 v37, 0x6

    goto :goto_3d

    :pswitch_8
    const/16 v11, 0xb

    const/16 v37, 0x5

    goto :goto_3d

    :pswitch_9
    const/16 v11, 0xb

    const/16 v37, 0x3

    goto :goto_3d

    :pswitch_a
    const/16 v11, 0xb

    const/16 v37, 0x2

    goto :goto_3d

    :pswitch_b
    const/16 v11, 0xb

    const/16 v37, 0x1

    :goto_3d
    if-eq v0, v11, :cond_6f

    if-eq v0, v1, :cond_6f

    const/16 v1, 0xd

    if-eq v0, v1, :cond_6f

    const/16 v1, 0xe

    if-ne v0, v1, :cond_6e

    goto :goto_3f

    :cond_6e
    :goto_3e
    move/from16 v0, v37

    goto/16 :goto_40

    :cond_6f
    :goto_3f
    if-nez v3, :cond_70

    add-int/lit8 v37, v37, -0x2

    :cond_70
    if-eqz v10, :cond_72

    const/4 v11, 0x1

    if-eq v10, v11, :cond_71

    goto :goto_3e

    :cond_71
    add-int/lit8 v0, v37, -0x2

    goto :goto_40

    :cond_72
    add-int/lit8 v0, v37, -0x4

    goto :goto_40

    .line 198
    :cond_73
    iget v0, v4, Lue1;->c:I

    if-lez v0, :cond_74

    add-int/lit8 v0, v0, 0x1

    iget v1, v4, Lue1;->g:I

    const/4 v11, 0x4

    if-ne v1, v11, :cond_7a

    const/16 v1, 0x11

    if-ne v0, v1, :cond_7a

    const/16 v0, 0x15

    goto :goto_40

    :cond_74
    iget v0, v4, Lue1;->g:I

    if-eqz v0, :cond_75

    const/4 v11, 0x1

    if-eq v0, v11, :cond_79

    const/4 v12, 0x2

    if-eq v0, v12, :cond_78

    const/4 v11, 0x3

    if-eq v0, v11, :cond_77

    const/4 v11, 0x4

    if-eq v0, v11, :cond_76

    .line 199
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    new-instance v3, Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x21

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "AC-4 level "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " has not been defined."

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    :cond_75
    const/4 v0, 0x2

    goto :goto_40

    :cond_76
    move v0, v1

    goto :goto_40

    :cond_77
    const/16 v0, 0xa

    goto :goto_40

    :cond_78
    move v0, v14

    goto :goto_40

    :cond_79
    const/4 v0, 0x6

    :cond_7a
    :goto_40
    if-lez v0, :cond_7b

    .line 200
    iget v1, v4, Lue1;->f:I

    iget v3, v4, Lue1;->g:I

    .line 201
    invoke-static/range {v43 .. v43}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v4, v1, v3}, [Ljava/lang/Object;

    move-result-object v1

    .line 202
    sget-object v3, Lv23;->a:Ljava/lang/String;

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "ac-4.%02d.%02d.%02d"

    .line 203
    invoke-static {v3, v4, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lgg4;

    .line 204
    invoke-direct {v3}, Lgg4;-><init>()V

    .line 205
    iput-object v2, v3, Lgg4;->a:Ljava/lang/String;

    .line 206
    invoke-virtual {v3, v8}, Lgg4;->e(Ljava/lang/String;)V

    .line 207
    iput v0, v3, Lgg4;->D:I

    .line 208
    iput v13, v3, Lgg4;->E:I

    .line 209
    iput-object v6, v3, Lgg4;->p:Lie4;

    .line 210
    iput-object v5, v3, Lgg4;->d:Ljava/lang/String;

    .line 211
    iput-object v1, v3, Lgg4;->i:Ljava/lang/String;

    .line 212
    new-instance v0, Lph4;

    .line 213
    invoke-direct {v0, v3}, Lph4;-><init>(Lgg4;)V

    .line 214
    iput-object v0, v7, Lts;->d:Ljava/lang/Object;

    move/from16 v4, p4

    move/from16 v21, v14

    move/from16 v13, v27

    move/from16 v14, v28

    move-object/from16 v1, v46

    move/from16 v9, v48

    const/4 v10, 0x0

    const/16 v18, 0x3

    goto/16 :goto_13

    .line 215
    :cond_7b
    const-string v0, "Cannot determine channel count of presentation."

    .line 216
    invoke-static {v0}, Llq1;->b(Ljava/lang/String;)Llq1;

    move-result-object v0

    throw v0

    .line 217
    :cond_7c
    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1e

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Unsupported AC-4 DSI version: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Llq1;->b(Ljava/lang/String;)Llq1;

    move-result-object v0

    throw v0

    :cond_7d
    move/from16 v48, v1

    move-object/from16 v46, v9

    move-object/from16 v44, v10

    const/16 v9, 0x10

    const/16 v21, 0x8

    const v0, 0x646d6c70

    if-ne v3, v0, :cond_7f

    if-lez v15, :cond_7e

    move/from16 v4, p4

    move/from16 v27, v15

    move/from16 v9, v48

    const/4 v10, 0x0

    const/4 v14, 0x2

    :goto_41
    const/16 v18, 0x3

    :goto_42
    const/16 v25, 0x4

    goto/16 :goto_5d

    .line 218
    :cond_7e
    invoke-static {v15}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x31

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Invalid sample rate for Dolby TrueHD MLP stream: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x0

    invoke-static {v4, v0}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    move-result-object v0

    throw v0

    :cond_7f
    const/4 v4, 0x0

    const v0, 0x64647473

    if-eq v3, v0, :cond_80

    const v0, 0x75647473

    if-ne v3, v0, :cond_81

    :cond_80
    move/from16 v9, v48

    const/16 v10, 0x20

    const/4 v12, 0x2

    const/16 v18, 0x3

    const/16 v25, 0x4

    move-object/from16 v2, p0

    goto/16 :goto_55

    :cond_81
    const v0, 0x644f7073

    if-ne v3, v0, :cond_82

    add-int/lit8 v12, v39, 0x8

    add-int/lit8 v13, v36, -0x8

    .line 219
    sget-object v0, Lej1;->a:[B

    array-length v1, v0

    add-int v2, v1, v13

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    move-object/from16 v2, p0

    .line 220
    invoke-virtual {v2, v12}, Lkz2;->E(I)V

    .line 221
    invoke-virtual {v2, v0, v1, v13}, Lkz2;->H([BII)V

    .line 222
    invoke-static {v0}, Lou1;->H([B)Ljava/util/ArrayList;

    move-result-object v10

    move/from16 v4, p4

    move-object/from16 v44, v10

    move/from16 v14, v28

    move/from16 v9, v48

    const/4 v10, 0x0

    goto :goto_41

    :cond_82
    move-object/from16 v2, p0

    const v0, 0x64664c61

    if-ne v3, v0, :cond_83

    add-int/lit8 v12, v39, 0xc

    add-int/lit8 v13, v36, -0xc

    add-int/lit8 v0, v36, -0x8

    .line 223
    new-array v0, v0, [B

    const/16 v1, 0x66

    const/16 v17, 0x0

    .line 224
    aput-byte v1, v0, v17

    const/16 v1, 0x4c

    const/16 v23, 0x1

    .line 225
    aput-byte v1, v0, v23

    const/16 v1, 0x61

    const/16 v22, 0x2

    .line 226
    aput-byte v1, v0, v22

    const/16 v1, 0x43

    const/16 v18, 0x3

    .line 227
    aput-byte v1, v0, v18

    .line 228
    invoke-virtual {v2, v12}, Lkz2;->E(I)V

    const/4 v11, 0x4

    .line 229
    invoke-virtual {v2, v0, v11, v13}, Lkz2;->H([BII)V

    .line 230
    invoke-static {v0}, Lxm3;->i(Ljava/lang/Object;)Lsn3;

    move-result-object v10

    move/from16 v4, p4

    move-object/from16 v44, v10

    move/from16 v14, v28

    :goto_43
    move/from16 v9, v48

    const/4 v10, 0x0

    goto/16 :goto_42

    :cond_83
    const v0, 0x616c6163

    const/16 v18, 0x3

    if-ne v3, v0, :cond_84

    add-int/lit8 v12, v39, 0xc

    add-int/lit8 v13, v36, -0xc

    .line 231
    new-array v1, v13, [B

    .line 232
    invoke-virtual {v2, v12}, Lkz2;->E(I)V

    const/4 v3, 0x0

    .line 233
    invoke-virtual {v2, v1, v3, v13}, Lkz2;->H([BII)V

    .line 234
    sget-object v3, Lmo2;->a:[B

    new-instance v3, Lkz2;

    .line 235
    invoke-direct {v3, v1}, Lkz2;-><init>([B)V

    const/4 v11, 0x5

    .line 236
    invoke-virtual {v3, v11}, Lkz2;->E(I)V

    .line 237
    invoke-virtual {v3}, Lkz2;->K()I

    move-result v10

    .line 238
    invoke-virtual {v3, v14}, Lkz2;->E(I)V

    .line 239
    invoke-virtual {v3}, Lkz2;->K()I

    move-result v11

    const/16 v12, 0x14

    .line 240
    invoke-virtual {v3, v12}, Lkz2;->E(I)V

    .line 241
    invoke-virtual {v3}, Lkz2;->h()I

    move-result v3

    filled-new-array {v3, v11, v10}, [I

    move-result-object v3

    const/16 v17, 0x0

    aget v11, v3, v17

    const/16 v23, 0x1

    aget v3, v3, v23

    sget-object v12, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 242
    invoke-static {v10, v12}, Lv23;->y(ILjava/nio/ByteOrder;)I

    move-result v10

    .line 243
    invoke-static {v1}, Lxm3;->i(Ljava/lang/Object;)Lsn3;

    move-result-object v1

    move/from16 v4, p4

    move-object/from16 v44, v1

    move v14, v3

    move/from16 v16, v10

    move/from16 v27, v11

    goto :goto_43

    :cond_84
    const v1, 0x69616362

    if-ne v3, v1, :cond_92

    add-int/lit8 v12, v39, 0x9

    .line 244
    invoke-virtual {v2, v12}, Lkz2;->E(I)V

    .line 245
    invoke-virtual {v2}, Lkz2;->p()J

    move-result-wide v10

    invoke-static {v10, v11}, Lzt0;->y(J)I

    move-result v1

    .line 246
    new-array v3, v1, [B

    const/4 v14, 0x0

    .line 247
    invoke-virtual {v2, v3, v14, v1}, Lkz2;->H([BII)V

    .line 248
    sget-object v1, Lmo2;->a:[B

    new-instance v1, Lkz2;

    .line 249
    invoke-direct {v1, v3}, Lkz2;-><init>([B)V

    move-object v10, v4

    move-object v11, v10

    .line 250
    :goto_44
    invoke-virtual {v1}, Lkz2;->B()I

    move-result v12

    if-lez v12, :cond_85

    if-eqz v10, :cond_86

    if-nez v11, :cond_85

    goto :goto_45

    :cond_85
    const/4 v12, 0x2

    const/16 v25, 0x4

    goto/16 :goto_4e

    .line 251
    :cond_86
    :goto_45
    invoke-virtual {v1}, Lkz2;->K()I

    move-result v12

    shr-int/lit8 v13, v12, 0x3

    and-int/lit8 v14, v12, 0x2

    const/16 v23, 0x1

    and-int/lit8 v12, v12, 0x1

    .line 252
    invoke-virtual {v1}, Lkz2;->p()J

    move-result-wide v40

    invoke-static/range {v40 .. v41}, Lzt0;->y(J)I

    move-result v24

    const/4 v0, 0x4

    if-le v13, v0, :cond_89

    const/16 v0, 0x18

    if-ge v13, v0, :cond_89

    if-eqz v14, :cond_89

    .line 253
    :goto_46
    invoke-virtual {v1}, Lkz2;->K()I

    move-result v14

    const/16 v0, 0x80

    and-int/2addr v14, v0

    if-nez v14, :cond_88

    .line 254
    :goto_47
    invoke-virtual {v1}, Lkz2;->K()I

    move-result v14

    and-int/2addr v14, v0

    if-nez v14, :cond_87

    goto :goto_48

    :cond_87
    const/16 v0, 0x80

    goto :goto_47

    :cond_88
    const/16 v0, 0x18

    goto :goto_46

    :cond_89
    :goto_48
    if-eqz v12, :cond_8a

    .line 255
    invoke-virtual {v1}, Lkz2;->p()J

    move-result-wide v40

    invoke-static/range {v40 .. v41}, Lzt0;->y(J)I

    move-result v0

    .line 256
    invoke-virtual {v1, v0}, Lkz2;->G(I)V

    .line 257
    :cond_8a
    iget v0, v1, Lkz2;->b:I

    add-int v0, v0, v24

    const/16 v14, 0x1f

    if-ne v13, v14, :cond_8c

    const/4 v12, 0x4

    .line 258
    invoke-virtual {v1, v12}, Lkz2;->G(I)V

    .line 259
    invoke-virtual {v1}, Lkz2;->K()I

    move-result v10

    .line 260
    invoke-virtual {v1}, Lkz2;->K()I

    move-result v12

    .line 261
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    filled-new-array {v10, v12}, [Ljava/lang/Object;

    move-result-object v10

    sget-object v12, Lv23;->a:Ljava/lang/String;

    sget-object v12, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v13, "iamf.%03X.%03X"

    .line 262
    invoke-static {v12, v13, v10}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    :cond_8b
    const/4 v12, 0x2

    const/16 v14, 0x80

    :goto_49
    const/16 v25, 0x4

    goto/16 :goto_4d

    :cond_8c
    if-nez v13, :cond_8b

    .line 263
    :goto_4a
    invoke-virtual {v1}, Lkz2;->K()I

    move-result v11

    const/16 v14, 0x80

    and-int/2addr v11, v14

    if-nez v11, :cond_90

    .line 264
    sget-object v11, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const/4 v12, 0x4

    invoke-virtual {v1, v12, v11}, Lkz2;->k(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v11

    const-string v12, "mp4a"

    .line 265
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8f

    .line 266
    :goto_4b
    invoke-virtual {v1}, Lkz2;->K()I

    move-result v12

    and-int/2addr v12, v14

    if-nez v12, :cond_8e

    const/4 v12, 0x2

    .line 267
    invoke-virtual {v1, v12}, Lkz2;->G(I)V

    new-instance v13, Llg1;

    .line 268
    invoke-direct {v13}, Llg1;-><init>()V

    .line 269
    invoke-virtual {v13, v1}, Llg1;->b(Lkz2;)V

    const/4 v4, 0x5

    .line 270
    invoke-virtual {v13, v4}, Llg1;->r(I)I

    move-result v9

    const/16 v4, 0x1f

    if-ne v9, v4, :cond_8d

    const/4 v4, 0x6

    .line 271
    invoke-virtual {v13, v4}, Llg1;->r(I)I

    move-result v9

    const/16 v20, 0x20

    add-int/lit8 v9, v9, 0x20

    goto :goto_4c

    :cond_8d
    const/4 v4, 0x6

    :goto_4c
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v13

    const/16 v25, 0x4

    add-int/lit8 v13, v13, 0x4

    .line 272
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->length()I

    move-result v19

    new-instance v4, Ljava/lang/StringBuilder;

    add-int v13, v13, v19

    invoke-direct {v4, v13}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, ".40."

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    move-object v11, v4

    goto :goto_4d

    :cond_8e
    const/16 v25, 0x4

    goto :goto_4b

    :cond_8f
    const/4 v12, 0x2

    goto :goto_49

    :cond_90
    const/16 v25, 0x4

    goto :goto_4a

    .line 273
    :goto_4d
    invoke-virtual {v1, v0}, Lkz2;->E(I)V

    const v0, 0x616c6163

    const/4 v4, 0x0

    const/16 v9, 0x10

    goto/16 :goto_44

    :goto_4e
    if-eqz v10, :cond_91

    if-eqz v11, :cond_91

    .line 274
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v23, 0x1

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v1

    new-instance v4, Ljava/lang/StringBuilder;

    add-int/2addr v0, v1

    .line 275
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "."

    .line 276
    invoke-static {v4, v10, v0, v11}, Lex0;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v10, v0

    goto :goto_4f

    :cond_91
    const/4 v10, 0x0

    .line 277
    :goto_4f
    invoke-static {v3}, Lxm3;->i(Ljava/lang/Object;)Lsn3;

    move-result-object v0

    move/from16 v4, p4

    move-object/from16 v44, v0

    move-object/from16 v26, v10

    move/from16 v14, v28

    move/from16 v9, v48

    :goto_50
    const/4 v10, 0x0

    goto/16 :goto_5d

    :cond_92
    const/4 v12, 0x2

    const/16 v25, 0x4

    const v0, 0x70636d43

    if-ne v3, v0, :cond_97

    add-int/lit8 v0, v39, 0xc

    .line 278
    invoke-virtual {v2, v0}, Lkz2;->E(I)V

    .line 279
    invoke-virtual {v2}, Lkz2;->K()I

    move-result v0

    const/16 v23, 0x1

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_93

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    goto :goto_51

    .line 280
    :cond_93
    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 281
    :goto_51
    invoke-virtual {v2}, Lkz2;->K()I

    move-result v1

    const v3, 0x6970636d

    move/from16 v9, v48

    if-ne v9, v3, :cond_94

    .line 282
    invoke-static {v1, v0}, Lv23;->y(ILjava/nio/ByteOrder;)I

    move-result v10

    move v0, v10

    const/16 v10, 0x20

    :goto_52
    const/4 v14, -0x1

    goto :goto_53

    :cond_94
    const v3, 0x6670636d

    const/16 v10, 0x20

    if-ne v9, v3, :cond_95

    if-ne v1, v10, :cond_95

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 283
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_95

    move/from16 v0, v25

    goto :goto_52

    :cond_95
    move/from16 v0, v16

    goto :goto_52

    :goto_53
    move/from16 v4, p4

    move/from16 v16, v0

    if-eq v0, v14, :cond_96

    move/from16 v14, v28

    move-object/from16 v46, v31

    goto :goto_50

    :cond_96
    move/from16 v14, v28

    goto :goto_50

    :cond_97
    move/from16 v9, v48

    move/from16 v4, p4

    move/from16 v13, v27

    move/from16 v14, v28

    move-object/from16 v1, v46

    :cond_98
    :goto_54
    const/4 v10, 0x0

    goto/16 :goto_5c

    .line 284
    :goto_55
    new-instance v0, Lgg4;

    .line 285
    invoke-direct {v0}, Lgg4;-><init>()V

    move/from16 v4, p4

    .line 286
    invoke-virtual {v0, v4}, Lgg4;->c(I)V

    move-object/from16 v1, v46

    .line 287
    invoke-virtual {v0, v1}, Lgg4;->e(Ljava/lang/String;)V

    move/from16 v14, v28

    .line 288
    iput v14, v0, Lgg4;->D:I

    move/from16 v13, v27

    .line 289
    iput v13, v0, Lgg4;->E:I

    .line 290
    iput-object v6, v0, Lgg4;->p:Lie4;

    .line 291
    iput-object v5, v0, Lgg4;->d:Ljava/lang/String;

    .line 292
    new-instance v3, Lph4;

    .line 293
    invoke-direct {v3, v0}, Lph4;-><init>(Lgg4;)V

    .line 294
    iput-object v3, v7, Lts;->d:Ljava/lang/Object;

    goto :goto_54

    :cond_99
    move-object v4, v9

    move v9, v1

    move-object v1, v4

    move/from16 v4, p4

    move-object/from16 v38, v2

    move-object/from16 v44, v10

    move/from16 v39, v12

    move/from16 v36, v13

    move/from16 v13, v27

    move/from16 v14, v28

    const/16 v10, 0x20

    const/4 v12, 0x2

    const/16 v18, 0x3

    const/16 v21, 0x8

    const/16 v25, 0x4

    move-object v2, v0

    move/from16 v0, v39

    const/4 v3, -0x1

    :goto_56
    if-eq v0, v3, :cond_98

    .line 295
    invoke-static {v0, v2}, Lej1;->j(ILkz2;)Lcj1;

    move-result-object v0

    .line 296
    iget-object v1, v0, Lcj1;->h:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    .line 297
    iget-object v11, v0, Lcj1;->i:Ljava/lang/Object;

    check-cast v11, [B

    if-eqz v11, :cond_9e

    .line 298
    const-string v3, "audio/vorbis"

    .line 299
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9c

    new-instance v3, Lkz2;

    .line 300
    invoke-direct {v3, v11}, Lkz2;-><init>([B)V

    const/4 v10, 0x1

    .line 301
    invoke-virtual {v3, v10}, Lkz2;->G(I)V

    const/4 v12, 0x0

    .line 302
    :goto_57
    invoke-virtual {v3}, Lkz2;->B()I

    move-result v23

    move-object/from16 v27, v0

    if-lez v23, :cond_9a

    invoke-virtual {v3}, Lkz2;->I()I

    move-result v0

    const/16 v2, 0xff

    if-ne v0, v2, :cond_9a

    .line 303
    invoke-virtual {v3, v10}, Lkz2;->G(I)V

    add-int/lit16 v12, v12, 0xff

    move-object/from16 v2, p0

    move-object/from16 v0, v27

    const/4 v10, 0x1

    goto :goto_57

    .line 304
    :cond_9a
    invoke-virtual {v3}, Lkz2;->K()I

    move-result v0

    add-int/2addr v0, v12

    const/4 v2, 0x0

    .line 305
    :goto_58
    invoke-virtual {v3}, Lkz2;->B()I

    move-result v10

    if-lez v10, :cond_9b

    invoke-virtual {v3}, Lkz2;->I()I

    move-result v10

    const/16 v12, 0xff

    if-ne v10, v12, :cond_9b

    const/4 v10, 0x1

    .line 306
    invoke-virtual {v3, v10}, Lkz2;->G(I)V

    add-int/lit16 v2, v2, 0xff

    goto :goto_58

    :cond_9b
    const/4 v10, 0x1

    .line 307
    invoke-virtual {v3}, Lkz2;->K()I

    move-result v12

    add-int/2addr v12, v2

    .line 308
    new-array v2, v0, [B

    .line 309
    iget v3, v3, Lkz2;->b:I

    const/4 v10, 0x0

    .line 310
    invoke-static {v11, v3, v2, v10, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v3, v0

    array-length v0, v11

    add-int/2addr v3, v12

    sub-int/2addr v0, v3

    .line 311
    new-array v12, v0, [B

    .line 312
    invoke-static {v11, v3, v12, v10, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 313
    invoke-static {v2, v12}, Lxm3;->j(Ljava/lang/Object;Ljava/lang/Object;)Lsn3;

    move-result-object v0

    :goto_59
    move-object/from16 v44, v0

    :goto_5a
    move-object/from16 v46, v1

    move-object/from16 v33, v27

    :goto_5b
    move/from16 v27, v13

    goto :goto_5d

    :cond_9c
    move-object/from16 v27, v0

    const/4 v10, 0x0

    const-string v0, "audio/mp4a-latm"

    .line 314
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9d

    .line 315
    new-instance v0, Llg1;

    array-length v2, v11

    invoke-direct {v0, v2, v11}, Llg1;-><init>(I[B)V

    .line 316
    invoke-static {v0, v10}, Li30;->g0(Llg1;Z)Lqe1;

    move-result-object v0

    .line 317
    iget v13, v0, Lqe1;->b:I

    iget v14, v0, Lqe1;->c:I

    iget-object v0, v0, Lqe1;->a:Ljava/lang/String;

    move-object/from16 v26, v0

    .line 318
    :cond_9d
    invoke-static {v11}, Lxm3;->i(Ljava/lang/Object;)Lsn3;

    move-result-object v0

    goto :goto_59

    :cond_9e
    move-object/from16 v27, v0

    const/4 v10, 0x0

    goto :goto_5a

    :goto_5c
    move-object/from16 v46, v1

    goto :goto_5b

    :goto_5d
    add-int v12, v39, v36

    move-object/from16 v0, p0

    move/from16 v3, p3

    move-object/from16 v11, p9

    move v1, v9

    move-object/from16 v2, v38

    move-object/from16 v10, v44

    move-object/from16 v9, v46

    goto/16 :goto_b

    :cond_9f
    move/from16 v4, p4

    move-object v1, v9

    move-object/from16 v44, v10

    move/from16 v13, v27

    .line 319
    iget-object v0, v7, Lts;->d:Ljava/lang/Object;

    check-cast v0, Lph4;

    if-nez v0, :cond_a2

    if-eqz v1, :cond_a2

    new-instance v0, Lgg4;

    .line 320
    invoke-direct {v0}, Lgg4;-><init>()V

    .line 321
    invoke-virtual {v0, v4}, Lgg4;->c(I)V

    .line 322
    invoke-virtual {v0, v1}, Lgg4;->e(Ljava/lang/String;)V

    move-object/from16 v1, v26

    .line 323
    iput-object v1, v0, Lgg4;->i:Ljava/lang/String;

    .line 324
    iput v14, v0, Lgg4;->D:I

    .line 325
    iput v13, v0, Lgg4;->E:I

    move/from16 v10, v16

    .line 326
    iput v10, v0, Lgg4;->F:I

    move-object/from16 v1, v44

    .line 327
    iput-object v1, v0, Lgg4;->o:Ljava/util/List;

    .line 328
    iput-object v6, v0, Lgg4;->p:Lie4;

    .line 329
    iput-object v5, v0, Lgg4;->d:Ljava/lang/String;

    move-object/from16 v1, v33

    if-eqz v1, :cond_a0

    .line 330
    iget-wide v2, v1, Lcj1;->f:J

    .line 331
    invoke-static {v2, v3}, Lzt0;->G(J)I

    move-result v2

    .line 332
    iput v2, v0, Lgg4;->g:I

    .line 333
    iget-wide v1, v1, Lcj1;->g:J

    .line 334
    invoke-static {v1, v2}, Lzt0;->G(J)I

    move-result v1

    .line 335
    iput v1, v0, Lgg4;->h:I

    goto :goto_5e

    :cond_a0
    move-object/from16 v1, v34

    if-eqz v1, :cond_a1

    .line 336
    iget-wide v2, v1, Lib1;->a:J

    .line 337
    invoke-static {v2, v3}, Lzt0;->G(J)I

    move-result v2

    .line 338
    iput v2, v0, Lgg4;->g:I

    .line 339
    iget-wide v1, v1, Lib1;->b:J

    .line 340
    invoke-static {v1, v2}, Lzt0;->G(J)I

    move-result v1

    .line 341
    iput v1, v0, Lgg4;->h:I

    .line 342
    :cond_a1
    :goto_5e
    new-instance v1, Lph4;

    .line 343
    invoke-direct {v1, v0}, Lph4;-><init>(Lgg4;)V

    .line 344
    iput-object v1, v7, Lts;->d:Ljava/lang/Object;

    :cond_a2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_6
        :pswitch_5
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static j(ILkz2;)Lcj1;
    .locals 9

    .line 1
    add-int/lit8 p0, p0, 0xc

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lkz2;->E(I)V

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    invoke-virtual {p1, p0}, Lkz2;->G(I)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lej1;->l(Lkz2;)I

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    invoke-virtual {p1, v0}, Lkz2;->G(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lkz2;->K()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    and-int/lit16 v2, v1, 0x80

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lkz2;->G(I)V

    .line 26
    .line 27
    .line 28
    :cond_0
    and-int/lit8 v2, v1, 0x40

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {p1}, Lkz2;->K()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-virtual {p1, v2}, Lkz2;->G(I)V

    .line 37
    .line 38
    .line 39
    :cond_1
    and-int/lit8 v1, v1, 0x20

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Lkz2;->G(I)V

    .line 44
    .line 45
    .line 46
    :cond_2
    invoke-virtual {p1, p0}, Lkz2;->G(I)V

    .line 47
    .line 48
    .line 49
    invoke-static {p1}, Lej1;->l(Lkz2;)I

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Lkz2;->K()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-static {v0}, Lpp1;->f(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    const-string v0, "audio/mpeg"

    .line 61
    .line 62
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_6

    .line 67
    .line 68
    const-string v0, "audio/vnd.dts"

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_6

    .line 75
    .line 76
    const-string v0, "audio/vnd.dts.hd"

    .line 77
    .line 78
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_3

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    const/4 v0, 0x4

    .line 86
    invoke-virtual {p1, v0}, Lkz2;->G(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Lkz2;->P()J

    .line 90
    .line 91
    .line 92
    move-result-wide v0

    .line 93
    invoke-virtual {p1}, Lkz2;->P()J

    .line 94
    .line 95
    .line 96
    move-result-wide v3

    .line 97
    invoke-virtual {p1, p0}, Lkz2;->G(I)V

    .line 98
    .line 99
    .line 100
    invoke-static {p1}, Lej1;->l(Lkz2;)I

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    move-wide v4, v3

    .line 105
    new-array v3, p0, [B

    .line 106
    .line 107
    const/4 v6, 0x0

    .line 108
    invoke-virtual {p1, v3, v6, p0}, Lkz2;->H([BII)V

    .line 109
    .line 110
    .line 111
    const-wide/16 p0, 0x0

    .line 112
    .line 113
    cmp-long v6, v4, p0

    .line 114
    .line 115
    const-wide/16 v7, -0x1

    .line 116
    .line 117
    if-gtz v6, :cond_4

    .line 118
    .line 119
    move-wide v4, v7

    .line 120
    :cond_4
    cmp-long p0, v0, p0

    .line 121
    .line 122
    if-lez p0, :cond_5

    .line 123
    .line 124
    move-wide v6, v0

    .line 125
    goto :goto_0

    .line 126
    :cond_5
    move-wide v6, v7

    .line 127
    :goto_0
    new-instance v1, Lcj1;

    .line 128
    .line 129
    invoke-direct/range {v1 .. v7}, Lcj1;-><init>(Ljava/lang/String;[BJJ)V

    .line 130
    .line 131
    .line 132
    return-object v1

    .line 133
    :cond_6
    :goto_1
    new-instance v1, Lcj1;

    .line 134
    .line 135
    const/4 v3, 0x0

    .line 136
    const-wide/16 v4, -0x1

    .line 137
    .line 138
    move-wide v6, v4

    .line 139
    invoke-direct/range {v1 .. v7}, Lcj1;-><init>(Ljava/lang/String;[BJJ)V

    .line 140
    .line 141
    .line 142
    return-object v1
.end method

.method public static k(Lkz2;II)Landroid/util/Pair;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lkz2;->b:I

    .line 4
    .line 5
    :goto_0
    sub-int v2, v1, p1

    .line 6
    .line 7
    move/from16 v4, p2

    .line 8
    .line 9
    if-ge v2, v4, :cond_11

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lkz2;->E(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lkz2;->b()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v5, 0x1

    .line 19
    const/4 v6, 0x0

    .line 20
    if-lez v2, :cond_0

    .line 21
    .line 22
    move v7, v5

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    move v7, v6

    .line 25
    :goto_1
    const-string v8, "childAtomSize must be positive"

    .line 26
    .line 27
    invoke-static {v8, v7}, Lqb1;->y(Ljava/lang/String;Z)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lkz2;->b()I

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    const v8, 0x73696e66

    .line 35
    .line 36
    .line 37
    if-ne v7, v8, :cond_10

    .line 38
    .line 39
    add-int/lit8 v7, v1, 0x8

    .line 40
    .line 41
    const/4 v8, -0x1

    .line 42
    move v12, v6

    .line 43
    move v9, v8

    .line 44
    const/4 v10, 0x0

    .line 45
    const/4 v11, 0x0

    .line 46
    :goto_2
    sub-int v13, v7, v1

    .line 47
    .line 48
    const/4 v14, 0x4

    .line 49
    if-ge v13, v2, :cond_4

    .line 50
    .line 51
    invoke-virtual {v0, v7}, Lkz2;->E(I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Lkz2;->b()I

    .line 55
    .line 56
    .line 57
    move-result v13

    .line 58
    invoke-virtual {v0}, Lkz2;->b()I

    .line 59
    .line 60
    .line 61
    move-result v15

    .line 62
    const/16 v16, 0x0

    .line 63
    .line 64
    const v3, 0x66726d61

    .line 65
    .line 66
    .line 67
    if-ne v15, v3, :cond_1

    .line 68
    .line 69
    invoke-virtual {v0}, Lkz2;->b()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v10

    .line 77
    goto :goto_3

    .line 78
    :cond_1
    const v3, 0x7363686d

    .line 79
    .line 80
    .line 81
    if-ne v15, v3, :cond_2

    .line 82
    .line 83
    invoke-virtual {v0, v14}, Lkz2;->G(I)V

    .line 84
    .line 85
    .line 86
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 87
    .line 88
    invoke-virtual {v0, v14, v3}, Lkz2;->k(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v11

    .line 92
    goto :goto_3

    .line 93
    :cond_2
    const v3, 0x73636869

    .line 94
    .line 95
    .line 96
    if-ne v15, v3, :cond_3

    .line 97
    .line 98
    move v9, v7

    .line 99
    move v12, v13

    .line 100
    :cond_3
    :goto_3
    add-int/2addr v7, v13

    .line 101
    goto :goto_2

    .line 102
    :cond_4
    const/16 v16, 0x0

    .line 103
    .line 104
    const-string v3, "cenc"

    .line 105
    .line 106
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    if-nez v3, :cond_6

    .line 111
    .line 112
    const-string v3, "cbc1"

    .line 113
    .line 114
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    if-nez v3, :cond_6

    .line 119
    .line 120
    const-string v3, "cens"

    .line 121
    .line 122
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    if-nez v3, :cond_6

    .line 127
    .line 128
    const-string v3, "cbcs"

    .line 129
    .line 130
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    if-eqz v3, :cond_5

    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_5
    move-object/from16 v3, v16

    .line 138
    .line 139
    goto/16 :goto_c

    .line 140
    .line 141
    :cond_6
    :goto_4
    if-eqz v10, :cond_7

    .line 142
    .line 143
    move v3, v5

    .line 144
    goto :goto_5

    .line 145
    :cond_7
    move v3, v6

    .line 146
    :goto_5
    const-string v7, "frma atom is mandatory"

    .line 147
    .line 148
    invoke-static {v7, v3}, Lqb1;->y(Ljava/lang/String;Z)V

    .line 149
    .line 150
    .line 151
    if-eq v9, v8, :cond_8

    .line 152
    .line 153
    move v3, v5

    .line 154
    goto :goto_6

    .line 155
    :cond_8
    move v3, v6

    .line 156
    :goto_6
    const-string v7, "schi atom is mandatory"

    .line 157
    .line 158
    invoke-static {v7, v3}, Lqb1;->y(Ljava/lang/String;Z)V

    .line 159
    .line 160
    .line 161
    add-int/lit8 v3, v9, 0x8

    .line 162
    .line 163
    :goto_7
    sub-int v7, v3, v9

    .line 164
    .line 165
    if-ge v7, v12, :cond_d

    .line 166
    .line 167
    invoke-virtual {v0, v3}, Lkz2;->E(I)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, Lkz2;->b()I

    .line 171
    .line 172
    .line 173
    move-result v7

    .line 174
    invoke-virtual {v0}, Lkz2;->b()I

    .line 175
    .line 176
    .line 177
    move-result v8

    .line 178
    const v13, 0x74656e63

    .line 179
    .line 180
    .line 181
    if-ne v8, v13, :cond_c

    .line 182
    .line 183
    invoke-virtual {v0}, Lkz2;->b()I

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    invoke-static {v3}, Lej1;->a(I)I

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    invoke-virtual {v0, v5}, Lkz2;->G(I)V

    .line 192
    .line 193
    .line 194
    if-nez v3, :cond_9

    .line 195
    .line 196
    invoke-virtual {v0, v5}, Lkz2;->G(I)V

    .line 197
    .line 198
    .line 199
    move v14, v6

    .line 200
    move v15, v14

    .line 201
    goto :goto_8

    .line 202
    :cond_9
    invoke-virtual {v0}, Lkz2;->K()I

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    and-int/lit16 v7, v3, 0xf0

    .line 207
    .line 208
    shr-int/2addr v7, v14

    .line 209
    and-int/lit8 v3, v3, 0xf

    .line 210
    .line 211
    move v15, v3

    .line 212
    move v14, v7

    .line 213
    :goto_8
    invoke-virtual {v0}, Lkz2;->K()I

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    if-ne v3, v5, :cond_a

    .line 218
    .line 219
    move-object v3, v10

    .line 220
    move v10, v5

    .line 221
    goto :goto_9

    .line 222
    :cond_a
    move-object v3, v10

    .line 223
    move v10, v6

    .line 224
    :goto_9
    invoke-virtual {v0}, Lkz2;->K()I

    .line 225
    .line 226
    .line 227
    move-result v12

    .line 228
    const/16 v7, 0x10

    .line 229
    .line 230
    new-array v13, v7, [B

    .line 231
    .line 232
    invoke-virtual {v0, v13, v6, v7}, Lkz2;->H([BII)V

    .line 233
    .line 234
    .line 235
    if-eqz v10, :cond_b

    .line 236
    .line 237
    if-nez v12, :cond_b

    .line 238
    .line 239
    invoke-virtual {v0}, Lkz2;->K()I

    .line 240
    .line 241
    .line 242
    move-result v7

    .line 243
    new-array v8, v7, [B

    .line 244
    .line 245
    invoke-virtual {v0, v8, v6, v7}, Lkz2;->H([BII)V

    .line 246
    .line 247
    .line 248
    move-object/from16 v16, v8

    .line 249
    .line 250
    :cond_b
    new-instance v9, Lrj1;

    .line 251
    .line 252
    move-object v8, v3

    .line 253
    invoke-direct/range {v9 .. v16}, Lrj1;-><init>(ZLjava/lang/String;I[BII[B)V

    .line 254
    .line 255
    .line 256
    move-object v3, v9

    .line 257
    goto :goto_a

    .line 258
    :cond_c
    move-object v8, v10

    .line 259
    add-int/2addr v3, v7

    .line 260
    goto :goto_7

    .line 261
    :cond_d
    move-object v8, v10

    .line 262
    move-object/from16 v3, v16

    .line 263
    .line 264
    :goto_a
    if-eqz v3, :cond_e

    .line 265
    .line 266
    goto :goto_b

    .line 267
    :cond_e
    move v5, v6

    .line 268
    :goto_b
    const-string v6, "tenc atom is mandatory"

    .line 269
    .line 270
    invoke-static {v6, v5}, Lqb1;->y(Ljava/lang/String;Z)V

    .line 271
    .line 272
    .line 273
    sget-object v5, Lv23;->a:Ljava/lang/String;

    .line 274
    .line 275
    invoke-static {v8, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 276
    .line 277
    .line 278
    move-result-object v3

    .line 279
    :goto_c
    if-nez v3, :cond_f

    .line 280
    .line 281
    goto :goto_d

    .line 282
    :cond_f
    return-object v3

    .line 283
    :cond_10
    :goto_d
    add-int/2addr v1, v2

    .line 284
    goto/16 :goto_0

    .line 285
    .line 286
    :cond_11
    const/16 v16, 0x0

    .line 287
    .line 288
    return-object v16
.end method

.method public static l(Lkz2;)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lkz2;->K()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit8 v1, v0, 0x7f

    .line 6
    .line 7
    :goto_0
    const/16 v2, 0x80

    .line 8
    .line 9
    and-int/2addr v0, v2

    .line 10
    if-ne v0, v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lkz2;->K()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    shl-int/lit8 v1, v1, 0x7

    .line 17
    .line 18
    and-int/lit8 v2, v0, 0x7f

    .line 19
    .line 20
    or-int/2addr v1, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return v1
.end method
