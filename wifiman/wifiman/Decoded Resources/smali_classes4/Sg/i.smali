.class LSg/i;
.super LSg/f;
.source "SourceFile"


# instance fields
.field private A:I

.field private B:[B

.field private C:[B

.field D:[LSg/g;

.field private z:LSg/g;


# direct methods
.method constructor <init>(LSg/g;)V
    .locals 0

    invoke-direct {p0}, LSg/f;-><init>()V

    iput-object p1, p0, LSg/i;->z:LSg/g;

    new-instance p1, LSg/b;

    invoke-direct {p1}, LSg/b;-><init>()V

    iput-object p1, p0, LSg/f;->r:LSg/b;

    const/4 p1, 0x6

    new-array p1, p1, [B

    iput-object p1, p0, LSg/i;->B:[B

    return-void
.end method

.method private o([BI)I
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, LSg/i;->A:I

    new-array v2, v2, [LSg/g;

    iput-object v2, v0, LSg/i;->D:[LSg/g;

    iget-object v2, v0, LSg/i;->z:LSg/g;

    iget-object v2, v2, LSg/g;->a:LSg/b;

    iget-object v2, v2, LSg/b;->b:Ljava/lang/String;

    move/from16 v5, p2

    const/4 v4, 0x0

    const/4 v6, 0x0

    :goto_0
    :try_start_0
    iget v7, v0, LSg/i;->A:I

    if-ge v4, v7, :cond_9

    add-int/lit8 v7, v5, 0xe

    :goto_1
    aget-byte v8, v1, v7

    const/16 v9, 0x20

    if-ne v8, v9, :cond_0

    add-int/lit8 v7, v7, -0x1

    goto :goto_1

    :cond_0
    new-instance v8, Ljava/lang/String;

    sub-int/2addr v7, v5

    const/4 v9, 0x1

    add-int/2addr v7, v9

    sget-object v10, LSg/b;->f:Ljava/lang/String;

    invoke-direct {v8, v1, v5, v7, v10}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    add-int/lit8 v7, v5, 0xf

    aget-byte v7, v1, v7

    and-int/lit16 v7, v7, 0xff

    add-int/lit8 v10, v5, 0x10

    aget-byte v10, v1, v10

    and-int/lit16 v11, v10, 0x80

    const/16 v12, 0x80

    if-ne v11, v12, :cond_1

    move v11, v9

    goto :goto_2

    :cond_1
    const/4 v11, 0x0

    :goto_2
    and-int/lit8 v12, v10, 0x60

    shr-int/lit8 v12, v12, 0x5

    and-int/lit8 v13, v10, 0x10

    const/16 v14, 0x10

    if-ne v13, v14, :cond_2

    move v15, v9

    goto :goto_3

    :cond_2
    const/4 v15, 0x0

    :goto_3
    and-int/lit8 v13, v10, 0x8

    const/16 v14, 0x8

    if-ne v13, v14, :cond_3

    move v14, v9

    goto :goto_4

    :cond_3
    const/4 v14, 0x0

    :goto_4
    and-int/lit8 v13, v10, 0x4

    const/4 v3, 0x4

    if-ne v13, v3, :cond_4

    move v3, v9

    goto :goto_5

    :cond_4
    const/4 v3, 0x0

    :goto_5
    and-int/lit8 v10, v10, 0x2

    const/4 v13, 0x2

    if-ne v10, v13, :cond_5

    move v10, v9

    goto :goto_6

    :cond_5
    const/4 v10, 0x0

    :goto_6
    if-nez v6, :cond_8

    iget-object v13, v0, LSg/i;->z:LSg/g;

    iget-object v13, v13, LSg/g;->a:LSg/b;

    iget v9, v13, LSg/b;->c:I

    if-ne v9, v7, :cond_8

    sget-object v9, LSg/g;->r:LSg/b;

    if-eq v13, v9, :cond_6

    iget-object v13, v13, LSg/b;->a:Ljava/lang/String;

    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_8

    :cond_6
    iget-object v6, v0, LSg/i;->z:LSg/g;

    iget-object v13, v6, LSg/g;->a:LSg/b;

    if-ne v13, v9, :cond_7

    new-instance v9, LSg/b;

    invoke-direct {v9, v8, v7, v2}, LSg/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    iput-object v9, v6, LSg/g;->a:LSg/b;

    :cond_7
    iget-object v6, v0, LSg/i;->z:LSg/g;

    iput-boolean v11, v6, LSg/g;->d:Z

    iput v12, v6, LSg/g;->c:I

    iput-boolean v15, v6, LSg/g;->e:Z

    iput-boolean v14, v6, LSg/g;->f:Z

    iput-boolean v3, v6, LSg/g;->g:Z

    iput-boolean v10, v6, LSg/g;->h:Z

    iget-object v3, v0, LSg/i;->B:[B

    iput-object v3, v6, LSg/g;->j:[B

    const/4 v3, 0x1

    iput-boolean v3, v6, LSg/g;->i:Z

    iget-object v7, v0, LSg/i;->D:[LSg/g;

    aput-object v6, v7, v4

    move v6, v3

    goto :goto_7

    :cond_8
    iget-object v9, v0, LSg/i;->D:[LSg/g;

    new-instance v23, LSg/g;

    new-instance v13, LSg/b;

    invoke-direct {v13, v8, v7, v2}, LSg/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    iget-object v7, v0, LSg/i;->z:LSg/g;

    iget v7, v7, LSg/g;->b:I

    iget-object v8, v0, LSg/i;->B:[B

    move-object/from16 v16, v13

    move-object/from16 v13, v23

    move/from16 v19, v14

    move-object/from16 v14, v16

    move/from16 v18, v15

    move v15, v7

    move/from16 v16, v11

    move/from16 v17, v12

    move/from16 v20, v3

    move/from16 v21, v10

    move-object/from16 v22, v8

    invoke-direct/range {v13 .. v22}, LSg/g;-><init>(LSg/b;IZIZZZZ[B)V

    aput-object v23, v9, v4
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_7
    add-int/lit8 v5, v5, 0x12

    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    :catch_0
    :cond_9
    sub-int v5, v5, p2

    return v5
.end method


# virtual methods
.method a([BI)I
    .locals 0

    invoke-virtual {p0, p1, p2}, LSg/f;->h([BI)I

    move-result p1

    return p1
.end method

.method g([BI)I
    .locals 6

    aget-byte v0, p1, p2

    and-int/lit16 v1, v0, 0xff

    iput v1, p0, LSg/i;->A:I

    mul-int/lit8 v1, v1, 0x12

    iget v2, p0, LSg/f;->x:I

    sub-int/2addr v2, v1

    add-int/lit8 v2, v2, -0x1

    add-int/lit8 v3, p2, 0x1

    and-int/lit16 v0, v0, 0xff

    iput v0, p0, LSg/i;->A:I

    add-int/2addr v1, v3

    iget-object v0, p0, LSg/i;->B:[B

    const/4 v4, 0x6

    const/4 v5, 0x0

    invoke-static {p1, v1, v0, v5, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-direct {p0, p1, v3}, LSg/i;->o([BI)I

    move-result v0

    add-int/2addr v3, v0

    new-array v0, v2, [B

    iput-object v0, p0, LSg/i;->C:[B

    invoke-static {p1, v3, v0, v5, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v3, v2

    sub-int/2addr v3, p2

    return v3
.end method

.method j([BI)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "NodeStatusResponse["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, LSg/f;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
