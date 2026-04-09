.class public Lb7/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb7/f$a;
    }
.end annotation


# static fields
.field private static final h:Lej/h;

.field private static final i:Lej/h;


# instance fields
.field private a:I

.field private b:[Ljava/lang/String;

.field private c:[I

.field private d:[I

.field private e:I

.field private final f:Lej/g;

.field private final g:Lej/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, " >/=\n"

    invoke-static {v0}, Lej/h;->j(Ljava/lang/String;)Lej/h;

    move-result-object v0

    sput-object v0, Lb7/f;->h:Lej/h;

    const-string/jumbo v0, "]]>"

    invoke-static {v0}, Lej/h;->j(Ljava/lang/String;)Lej/h;

    move-result-object v0

    sput-object v0, Lb7/f;->i:Lej/h;

    return-void
.end method

.method private constructor <init>(Lej/g;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lb7/f;->a:I

    const/16 v1, 0x20

    new-array v2, v1, [Ljava/lang/String;

    iput-object v2, p0, Lb7/f;->b:[Ljava/lang/String;

    new-array v2, v1, [I

    iput-object v2, p0, Lb7/f;->c:[I

    new-array v1, v1, [I

    iput-object v1, p0, Lb7/f;->d:[I

    const/4 v2, 0x1

    iput v2, p0, Lb7/f;->e:I

    aput v0, v1, v0

    if-eqz p1, :cond_0

    iput-object p1, p0, Lb7/f;->f:Lej/g;

    invoke-interface {p1}, Lej/g;->k()Lej/e;

    move-result-object p1

    iput-object p1, p0, Lb7/f;->g:Lej/e;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string/jumbo v0, "source == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private C()Z
    .locals 5

    const-wide/16 v0, 0x9

    invoke-direct {p0, v0, v1}, Lb7/f;->j(J)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb7/f;->g:Lej/e;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lej/e;->f0(J)B

    move-result v0

    const/16 v1, 0x3c

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lb7/f;->g:Lej/e;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Lej/e;->f0(J)B

    move-result v0

    const/16 v1, 0x21

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lb7/f;->g:Lej/e;

    const-wide/16 v1, 0x2

    invoke-virtual {v0, v1, v2}, Lej/e;->f0(J)B

    move-result v0

    const/16 v1, 0x5b

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lb7/f;->g:Lej/e;

    const-wide/16 v2, 0x3

    invoke-virtual {v0, v2, v3}, Lej/e;->f0(J)B

    move-result v0

    const/16 v2, 0x43

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lb7/f;->g:Lej/e;

    const-wide/16 v2, 0x4

    invoke-virtual {v0, v2, v3}, Lej/e;->f0(J)B

    move-result v0

    const/16 v2, 0x44

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lb7/f;->g:Lej/e;

    const-wide/16 v2, 0x5

    invoke-virtual {v0, v2, v3}, Lej/e;->f0(J)B

    move-result v0

    const/16 v2, 0x41

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lb7/f;->g:Lej/e;

    const-wide/16 v3, 0x6

    invoke-virtual {v0, v3, v4}, Lej/e;->f0(J)B

    move-result v0

    const/16 v3, 0x54

    if-ne v0, v3, :cond_0

    iget-object v0, p0, Lb7/f;->g:Lej/e;

    const-wide/16 v3, 0x7

    invoke-virtual {v0, v3, v4}, Lej/e;->f0(J)B

    move-result v0

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lb7/f;->g:Lej/e;

    const-wide/16 v2, 0x8

    invoke-virtual {v0, v2, v3}, Lej/e;->f0(J)B

    move-result v0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private J(I)Z
    .locals 1

    const/16 v0, 0x20

    if-eq p1, v0, :cond_0

    const/16 v0, 0x2f

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x1

    return p1

    :cond_0
    :pswitch_0
    const/4 p1, 0x0

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x3c
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private T(Z)I
    .locals 6

    const/4 v0, 0x0

    :goto_0
    move v1, v0

    :goto_1
    add-int/lit8 v2, v1, 0x1

    int-to-long v3, v2

    invoke-direct {p0, v3, v4}, Lb7/f;->j(J)Z

    move-result v3

    if-eqz v3, :cond_6

    iget-object v3, p0, Lb7/f;->g:Lej/e;

    int-to-long v4, v1

    invoke-virtual {v3, v4, v5}, Lej/e;->f0(J)B

    move-result v3

    const/16 v4, 0xa

    if-eq v3, v4, :cond_5

    const/16 v4, 0x20

    if-eq v3, v4, :cond_5

    const/16 v4, 0xd

    if-eq v3, v4, :cond_5

    const/16 v4, 0x9

    if-ne v3, v4, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object v2, p0, Lb7/f;->g:Lej/e;

    int-to-long v4, v1

    invoke-virtual {v2, v4, v5}, Lej/e;->d(J)V

    const/16 v1, 0x3c

    if-ne v3, v1, :cond_4

    invoke-direct {p0}, Lb7/f;->C()Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p0, Lb7/f;->g:Lej/e;

    const-wide/16 v4, 0x1

    invoke-virtual {v1, v4, v5}, Lej/e;->f0(J)B

    move-result v1

    const/16 v2, 0x21

    if-ne v1, v2, :cond_2

    const-wide/16 v4, 0x4

    invoke-direct {p0, v4, v5}, Lb7/f;->j(J)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v1, p0, Lb7/f;->g:Lej/e;

    invoke-virtual {v1}, Lej/e;->readByte()B

    iget-object v1, p0, Lb7/f;->g:Lej/e;

    invoke-virtual {v1}, Lej/e;->readByte()B

    iget-object v1, p0, Lb7/f;->g:Lej/e;

    invoke-virtual {v1}, Lej/e;->readByte()B

    iget-object v1, p0, Lb7/f;->g:Lej/e;

    invoke-virtual {v1}, Lej/e;->readByte()B

    const-string v1, "-->"

    invoke-direct {p0, v1}, Lb7/f;->s0(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lb7/f;->g:Lej/e;

    invoke-virtual {v1}, Lej/e;->readByte()B

    iget-object v1, p0, Lb7/f;->g:Lej/e;

    invoke-virtual {v1}, Lej/e;->readByte()B

    iget-object v1, p0, Lb7/f;->g:Lej/e;

    invoke-virtual {v1}, Lej/e;->readByte()B

    goto :goto_0

    :cond_1
    const-string/jumbo p1, "Unterminated comment"

    invoke-direct {p0, p1}, Lb7/f;->t0(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_2
    const/16 v2, 0x3f

    if-ne v1, v2, :cond_4

    iget-object v1, p0, Lb7/f;->g:Lej/e;

    invoke-virtual {v1}, Lej/e;->readByte()B

    iget-object v1, p0, Lb7/f;->g:Lej/e;

    invoke-virtual {v1}, Lej/e;->readByte()B

    const-string v1, "?>"

    invoke-direct {p0, v1}, Lb7/f;->s0(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lb7/f;->g:Lej/e;

    invoke-virtual {v1}, Lej/e;->readByte()B

    iget-object v1, p0, Lb7/f;->g:Lej/e;

    invoke-virtual {v1}, Lej/e;->readByte()B

    goto/16 :goto_0

    :cond_3
    const-string/jumbo p1, "Unterminated xml declaration or processing instruction \"<?\""

    invoke-direct {p0, p1}, Lb7/f;->t0(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_4
    return v3

    :cond_5
    :goto_2
    move v1, v2

    goto/16 :goto_1

    :cond_6
    if-nez p1, :cond_7

    const/4 p1, -0x1

    return p1

    :cond_7
    new-instance p1, Ljava/io/EOFException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "Unexpected end of input at path "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lb7/f;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private b0()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lb7/f;->f:Lej/g;

    sget-object v1, Lb7/f;->h:Lej/h;

    invoke-interface {v0, v1}, Lej/g;->M(Lej/h;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lb7/f;->g:Lej/e;

    invoke-virtual {v2, v0, v1}, Lej/e;->A0(J)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lb7/f;->g:Lej/e;

    invoke-virtual {v0}, Lej/e;->z0()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public static d0(Lej/g;)Lb7/f;
    .locals 1

    new-instance v0, Lb7/f;

    invoke-direct {v0, p0}, Lb7/f;-><init>(Lej/g;)V

    return-object v0
.end method

.method private g()I
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lb7/f;->d:[I

    iget v2, v0, Lb7/f;->e:I

    add-int/lit8 v3, v2, -0x1

    aget v3, v1, v3

    const/4 v4, 0x5

    const/4 v5, 0x1

    const/4 v6, 0x3

    if-ne v3, v6, :cond_1

    invoke-direct {v0, v5}, Lb7/f;->T(Z)I

    move-result v1

    int-to-char v1, v1

    invoke-direct {v0, v1}, Lb7/f;->J(I)Z

    move-result v1

    if-eqz v1, :cond_0

    iput v4, v0, Lb7/f;->a:I

    return v4

    :cond_0
    const-string/jumbo v1, "Expected xml element name (literal expected)"

    invoke-direct {v0, v1}, Lb7/f;->t0(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    :cond_1
    const/16 v11, 0x27

    const/16 v12, 0x22

    const/16 v13, 0x9

    const-wide/16 v14, 0x9

    const/16 v7, 0x2f

    const/4 v8, 0x4

    const/16 v9, 0x3c

    const/16 v10, 0x3e

    if-ne v3, v8, :cond_a

    invoke-direct {v0, v5}, Lb7/f;->T(Z)I

    move-result v1

    invoke-direct {v0, v1}, Lb7/f;->J(I)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v1, 0x8

    iput v1, v0, Lb7/f;->a:I

    return v1

    :cond_2
    if-eq v1, v7, :cond_8

    const/16 v2, 0x3d

    if-eq v1, v2, :cond_5

    if-ne v1, v10, :cond_4

    invoke-direct/range {p0 .. p0}, Lb7/f;->m0()V

    iget-object v1, v0, Lb7/f;->d:[I

    iget v2, v0, Lb7/f;->e:I

    sub-int/2addr v2, v5

    aput v4, v1, v2

    iget-object v1, v0, Lb7/f;->g:Lej/e;

    invoke-virtual {v1}, Lej/e;->readByte()B

    invoke-direct {v0, v5}, Lb7/f;->T(Z)I

    move-result v1

    if-eq v1, v9, :cond_3

    iput v6, v0, Lb7/f;->a:I

    return v6

    :cond_3
    invoke-direct/range {p0 .. p0}, Lb7/f;->C()Z

    move-result v1

    if-eqz v1, :cond_f

    iget-object v1, v0, Lb7/f;->g:Lej/e;

    invoke-virtual {v1, v14, v15}, Lej/e;->d(J)V

    iput v13, v0, Lb7/f;->a:I

    return v13

    :cond_4
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "Unexpected character \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    int-to-char v1, v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, "\' while trying to read xml elements attribute"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lb7/f;->t0(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    :cond_5
    iget-object v1, v0, Lb7/f;->g:Lej/e;

    invoke-virtual {v1}, Lej/e;->readByte()B

    invoke-direct {v0, v5}, Lb7/f;->T(Z)I

    move-result v1

    if-eq v1, v12, :cond_7

    if-ne v1, v11, :cond_6

    iget-object v1, v0, Lb7/f;->g:Lej/e;

    invoke-virtual {v1}, Lej/e;->readByte()B

    const/4 v1, 0x7

    iput v1, v0, Lb7/f;->a:I

    return v1

    :cond_6
    const-string/jumbo v1, "Expected double quote (\") or single quote (\') while reading xml elements attribute"

    invoke-direct {v0, v1}, Lb7/f;->t0(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    :cond_7
    iget-object v1, v0, Lb7/f;->g:Lej/e;

    invoke-virtual {v1}, Lej/e;->readByte()B

    const/4 v1, 0x6

    iput v1, v0, Lb7/f;->a:I

    return v1

    :cond_8
    const-wide/16 v1, 0x2

    invoke-direct {v0, v1, v2}, Lb7/f;->j(J)Z

    move-result v1

    if-eqz v1, :cond_9

    iget-object v1, v0, Lb7/f;->g:Lej/e;

    const-wide/16 v2, 0x1

    invoke-virtual {v1, v2, v3}, Lej/e;->f0(J)B

    move-result v1

    if-ne v1, v10, :cond_9

    invoke-direct/range {p0 .. p0}, Lb7/f;->m0()V

    iget-object v1, v0, Lb7/f;->g:Lej/e;

    invoke-virtual {v1}, Lej/e;->readByte()B

    iget-object v1, v0, Lb7/f;->g:Lej/e;

    invoke-virtual {v1}, Lej/e;->readByte()B

    const/4 v1, 0x2

    iput v1, v0, Lb7/f;->a:I

    return v1

    :cond_9
    const-string/jumbo v1, "Expected closing />"

    invoke-direct {v0, v1}, Lb7/f;->t0(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    :cond_a
    if-ne v3, v4, :cond_c

    invoke-direct {v0, v5}, Lb7/f;->T(Z)I

    move-result v1

    if-eq v1, v9, :cond_b

    iput v6, v0, Lb7/f;->a:I

    return v6

    :cond_b
    invoke-direct/range {p0 .. p0}, Lb7/f;->C()Z

    move-result v1

    if-eqz v1, :cond_f

    iget-object v1, v0, Lb7/f;->g:Lej/e;

    invoke-virtual {v1, v14, v15}, Lej/e;->d(J)V

    iput v13, v0, Lb7/f;->a:I

    return v13

    :cond_c
    if-nez v3, :cond_d

    sub-int/2addr v2, v5

    aput v5, v1, v2

    goto :goto_0

    :cond_d
    if-ne v3, v5, :cond_e

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lb7/f;->T(Z)I

    move-result v2

    const/4 v1, -0x1

    if-ne v2, v1, :cond_f

    iput v8, v0, Lb7/f;->a:I

    return v8

    :cond_e
    const/4 v1, 0x6

    if-eq v3, v1, :cond_16

    :cond_f
    :goto_0
    invoke-direct {v0, v5}, Lb7/f;->T(Z)I

    move-result v1

    if-eq v1, v12, :cond_15

    if-eq v1, v11, :cond_14

    if-eq v1, v9, :cond_10

    const/4 v1, 0x0

    return v1

    :cond_10
    iget-object v1, v0, Lb7/f;->g:Lej/e;

    invoke-virtual {v1}, Lej/e;->readByte()B

    const-wide/16 v1, 0x1

    invoke-direct {v0, v1, v2}, Lb7/f;->j(J)Z

    move-result v1

    if-eqz v1, :cond_13

    iget-object v1, v0, Lb7/f;->g:Lej/e;

    const-wide/16 v2, 0x0

    invoke-virtual {v1, v2, v3}, Lej/e;->f0(J)B

    move-result v1

    if-ne v1, v7, :cond_13

    iget-object v1, v0, Lb7/f;->g:Lej/e;

    invoke-virtual {v1}, Lej/e;->readByte()B

    invoke-direct/range {p0 .. p0}, Lb7/f;->b0()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_12

    iget-object v2, v0, Lb7/f;->b:[Ljava/lang/String;

    iget v3, v0, Lb7/f;->e:I

    sub-int/2addr v3, v5

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_12

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Lb7/f;->T(Z)I

    move-result v1

    if-ne v1, v10, :cond_11

    iget-object v1, v0, Lb7/f;->g:Lej/e;

    invoke-virtual {v1}, Lej/e;->readByte()B

    const/4 v1, 0x2

    iput v1, v0, Lb7/f;->a:I

    return v1

    :cond_11
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Missing closing \'>\' character in </"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v0, Lb7/f;->b:[Ljava/lang/String;

    iget v3, v0, Lb7/f;->e:I

    sub-int/2addr v3, v5

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lb7/f;->t0(Ljava/lang/String;)Ljava/io/IOException;

    goto :goto_1

    :cond_12
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "Expected a closing element tag </"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lb7/f;->b:[Ljava/lang/String;

    iget v4, v0, Lb7/f;->e:I

    sub-int/2addr v4, v5

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "> but found </"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ">"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lb7/f;->t0(Ljava/lang/String;)Ljava/io/IOException;

    :cond_13
    :goto_1
    iput v5, v0, Lb7/f;->a:I

    return v5

    :cond_14
    iget-object v1, v0, Lb7/f;->g:Lej/e;

    invoke-virtual {v1}, Lej/e;->readByte()B

    const/4 v1, 0x7

    iput v1, v0, Lb7/f;->a:I

    return v1

    :cond_15
    iget-object v1, v0, Lb7/f;->g:Lej/e;

    invoke-virtual {v1}, Lej/e;->readByte()B

    const/4 v1, 0x6

    iput v1, v0, Lb7/f;->a:I

    return v1

    :cond_16
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string/jumbo v2, "XmlReader is closed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private j(J)Z
    .locals 1

    iget-object v0, p0, Lb7/f;->f:Lej/g;

    invoke-interface {v0, p1, p2}, Lej/g;->request(J)Z

    move-result p1

    return p1
.end method

.method private m0()V
    .locals 4

    iget-object v0, p0, Lb7/f;->d:[I

    iget v1, p0, Lb7/f;->e:I

    add-int/lit8 v2, v1, -0x1

    const/4 v3, 0x0

    aput v3, v0, v2

    add-int/lit8 v0, v1, -0x1

    iput v0, p0, Lb7/f;->e:I

    iget-object v2, p0, Lb7/f;->b:[Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v3, v2, v0

    iget-object v0, p0, Lb7/f;->c:[I

    add-int/lit8 v1, v1, -0x2

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    return-void
.end method

.method private n0(I)V
    .locals 6

    iget v0, p0, Lb7/f;->e:I

    iget-object v1, p0, Lb7/f;->d:[I

    array-length v2, v1

    if-ne v0, v2, :cond_0

    mul-int/lit8 v2, v0, 0x2

    new-array v2, v2, [I

    mul-int/lit8 v3, v0, 0x2

    new-array v3, v3, [I

    mul-int/lit8 v4, v0, 0x2

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    invoke-static {v1, v5, v2, v5, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lb7/f;->c:[I

    iget v1, p0, Lb7/f;->e:I

    invoke-static {v0, v5, v3, v5, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lb7/f;->b:[Ljava/lang/String;

    iget v1, p0, Lb7/f;->e:I

    invoke-static {v0, v5, v4, v5, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v2, p0, Lb7/f;->d:[I

    iput-object v3, p0, Lb7/f;->c:[I

    iput-object v4, p0, Lb7/f;->b:[Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lb7/f;->d:[I

    iget v1, p0, Lb7/f;->e:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lb7/f;->e:I

    aput p1, v0, v1

    return-void
.end method

.method private o0()C
    .locals 8

    const-wide/16 v0, 0x1

    invoke-direct {p0, v0, v1}, Lb7/f;->j(J)Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Lb7/f;->g:Lej/e;

    invoke-virtual {v0}, Lej/e;->readByte()B

    move-result v0

    const/16 v1, 0x62

    if-eq v0, v1, :cond_a

    const/16 v1, 0x66

    if-eq v0, v1, :cond_9

    const/16 v2, 0x6e

    if-eq v0, v2, :cond_8

    const/16 v2, 0x72

    if-eq v0, v2, :cond_7

    const/16 v2, 0x74

    if-eq v0, v2, :cond_6

    const/16 v2, 0x75

    if-eq v0, v2, :cond_0

    int-to-char v0, v0

    return v0

    :cond_0
    const-wide/16 v2, 0x4

    invoke-direct {p0, v2, v3}, Lb7/f;->j(J)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, 0x0

    move v4, v0

    :goto_0
    const/4 v5, 0x4

    if-ge v0, v5, :cond_4

    iget-object v5, p0, Lb7/f;->g:Lej/e;

    int-to-long v6, v0

    invoke-virtual {v5, v6, v7}, Lej/e;->f0(J)B

    move-result v5

    shl-int/lit8 v4, v4, 0x4

    int-to-char v4, v4

    const/16 v6, 0x30

    if-lt v5, v6, :cond_1

    const/16 v6, 0x39

    if-gt v5, v6, :cond_1

    add-int/lit8 v5, v5, -0x30

    :goto_1
    add-int/2addr v4, v5

    int-to-char v4, v4

    goto :goto_2

    :cond_1
    const/16 v6, 0x61

    if-lt v5, v6, :cond_2

    if-gt v5, v1, :cond_2

    add-int/lit8 v5, v5, -0x57

    goto :goto_1

    :cond_2
    const/16 v6, 0x41

    if-lt v5, v6, :cond_3

    const/16 v6, 0x46

    if-gt v5, v6, :cond_3

    add-int/lit8 v5, v5, -0x37

    goto :goto_1

    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "\\u"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb7/f;->g:Lej/e;

    invoke-virtual {v1, v2, v3}, Lej/e;->A0(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lb7/f;->t0(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    :cond_4
    iget-object v0, p0, Lb7/f;->g:Lej/e;

    invoke-virtual {v0, v2, v3}, Lej/e;->d(J)V

    return v4

    :cond_5
    new-instance v0, Ljava/io/EOFException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Unterminated escape sequence at path "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lb7/f;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    const/16 v0, 0x9

    return v0

    :cond_7
    const/16 v0, 0xd

    return v0

    :cond_8
    const/16 v0, 0xa

    return v0

    :cond_9
    const/16 v0, 0xc

    return v0

    :cond_a
    const/16 v0, 0x8

    return v0

    :cond_b
    const-string/jumbo v0, "Unterminated escape sequence"

    invoke-direct {p0, v0}, Lb7/f;->t0(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method

.method private r0(Ljava/lang/Byte;)V
    .locals 6

    :goto_0
    iget-object v0, p0, Lb7/f;->f:Lej/g;

    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    move-result v1

    invoke-interface {v0, v1}, Lej/g;->j0(B)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lb7/f;->g:Lej/e;

    invoke-virtual {v2, v0, v1}, Lej/e;->f0(J)B

    move-result v2

    const/16 v3, 0x5c

    const-wide/16 v4, 0x1

    if-ne v2, v3, :cond_0

    iget-object v2, p0, Lb7/f;->g:Lej/e;

    add-long/2addr v0, v4

    invoke-virtual {v2, v0, v1}, Lej/e;->d(J)V

    invoke-direct {p0}, Lb7/f;->o0()C

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lb7/f;->g:Lej/e;

    add-long/2addr v0, v4

    invoke-virtual {p1, v0, v1}, Lej/e;->d(J)V

    return-void

    :cond_1
    const-string/jumbo p1, "Unterminated string"

    invoke-direct {p0, p1}, Lb7/f;->t0(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object p1

    throw p1
.end method

.method private s0(Ljava/lang/String;)Z
    .locals 4

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    int-to-long v0, v0

    invoke-direct {p0, v0, v1}, Lb7/f;->j(J)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v1, v0, :cond_1

    iget-object v0, p0, Lb7/f;->g:Lej/e;

    int-to-long v2, v1

    invoke-virtual {v0, v2, v3}, Lej/e;->f0(J)B

    move-result v0

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Lb7/f;->g:Lej/e;

    invoke-virtual {v0}, Lej/e;->readByte()B

    goto :goto_0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    return v1
.end method

.method private t0(Ljava/lang/String;)Ljava/io/IOException;
    .locals 2

    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " at path "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lb7/f;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private y()J
    .locals 4

    iget-object v0, p0, Lb7/f;->f:Lej/g;

    sget-object v1, Lb7/f;->i:Lej/h;

    invoke-interface {v0, v1}, Lej/g;->W(Lej/h;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    return-wide v0

    :cond_0
    new-instance v0, Ljava/io/EOFException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "<![CDATA[ at "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lb7/f;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " has never been closed with ]]>"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public P()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lb7/f;->a:I

    if-nez v0, :cond_0

    invoke-direct {p0}, Lb7/f;->g()I

    move-result v0

    :cond_0
    const/16 v1, 0x8

    if-ne v0, v1, :cond_1

    invoke-direct {p0}, Lb7/f;->b0()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    iput v1, p0, Lb7/f;->a:I

    iget-object v1, p0, Lb7/f;->b:[Ljava/lang/String;

    iget v2, p0, Lb7/f;->e:I

    add-int/lit8 v2, v2, -0x1

    aput-object v0, v1, v2

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "Expected xml element attribute name but was "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lb7/f;->f0()Lb7/f$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lb7/f;->t0(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method

.method public S()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lb7/f;->a:I

    if-nez v0, :cond_0

    invoke-direct {p0}, Lb7/f;->g()I

    move-result v0

    :cond_0
    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    invoke-direct {p0}, Lb7/f;->b0()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    iput v1, p0, Lb7/f;->a:I

    iget-object v1, p0, Lb7/f;->b:[Ljava/lang/String;

    iget v2, p0, Lb7/f;->e:I

    add-int/lit8 v2, v2, -0x1

    aput-object v0, v1, v2

    const/4 v1, 0x4

    invoke-direct {p0, v1}, Lb7/f;->n0(I)V

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "Expected XML Tag Element name, but have "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lb7/f;->f0()Lb7/f$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lb7/f;->t0(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method

.method public Y()Ljava/lang/String;
    .locals 4

    iget v0, p0, Lb7/f;->a:I

    if-nez v0, :cond_0

    invoke-direct {p0}, Lb7/f;->g()I

    move-result v0

    :cond_0
    const/4 v1, 0x3

    const/4 v2, 0x0

    if-ne v0, v1, :cond_2

    iput v2, p0, Lb7/f;->a:I

    iget-object v0, p0, Lb7/f;->f:Lej/g;

    const/16 v1, 0x3c

    invoke-interface {v0, v1}, Lej/g;->j0(B)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lb7/f;->g:Lej/e;

    invoke-virtual {v2, v0, v1}, Lej/e;->A0(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "Unterminated element text content. Expected </"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb7/f;->b:[Ljava/lang/String;

    iget v2, p0, Lb7/f;->e:I

    add-int/lit8 v2, v2, -0x1

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "> but haven\'t found"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lb7/f;->t0(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    :cond_2
    const/16 v1, 0x9

    if-ne v0, v1, :cond_3

    iput v2, p0, Lb7/f;->a:I

    invoke-direct {p0}, Lb7/f;->y()J

    move-result-wide v0

    iget-object v2, p0, Lb7/f;->g:Lej/e;

    invoke-virtual {v2, v0, v1}, Lej/e;->A0(J)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lb7/f;->g:Lej/e;

    const-wide/16 v2, 0x3

    invoke-virtual {v1, v2, v3}, Lej/e;->d(J)V

    return-object v0

    :cond_3
    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    const-string v0, ""

    return-object v0

    :cond_4
    new-instance v0, Lcom/tickaroo/tikxml/XmlDataException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Expected xml element text content but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lb7/f;->f0()Lb7/f$a;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " at path "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lb7/f;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/tickaroo/tikxml/XmlDataException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a()V
    .locals 3

    iget v0, p0, Lb7/f;->a:I

    if-nez v0, :cond_0

    invoke-direct {p0}, Lb7/f;->g()I

    move-result v0

    :cond_0
    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lb7/f;->n0(I)V

    const/4 v0, 0x0

    iput v0, p0, Lb7/f;->a:I

    return-void

    :cond_1
    new-instance v0, Lcom/tickaroo/tikxml/XmlDataException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Expected "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lb7/f$a;->ELEMENT_BEGIN:Lb7/f$a;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lb7/f;->f0()Lb7/f$a;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " at path "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lb7/f;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/tickaroo/tikxml/XmlDataException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public close()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lb7/f;->a:I

    iget-object v0, p0, Lb7/f;->g:Lej/e;

    invoke-virtual {v0}, Lej/e;->clear()V

    iget-object v0, p0, Lb7/f;->f:Lej/g;

    invoke-interface {v0}, Lej/D;->close()V

    return-void
.end method

.method public f0()Lb7/f$a;
    .locals 4

    iget v0, p0, Lb7/f;->a:I

    if-nez v0, :cond_0

    invoke-direct {p0}, Lb7/f;->g()I

    move-result v0

    :cond_0
    packed-switch v0, :pswitch_data_0

    new-instance v1, Ljava/lang/AssertionError;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "Unknown XmlToken: Peeked = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    :pswitch_0
    sget-object v0, Lb7/f$a;->ATTRIBUTE_NAME:Lb7/f$a;

    return-object v0

    :pswitch_1
    sget-object v0, Lb7/f$a;->ATTRIBUTE_VALUE:Lb7/f$a;

    return-object v0

    :pswitch_2
    sget-object v0, Lb7/f$a;->ELEMENT_NAME:Lb7/f$a;

    return-object v0

    :pswitch_3
    sget-object v0, Lb7/f$a;->END_OF_DOCUMENT:Lb7/f$a;

    return-object v0

    :pswitch_4
    sget-object v0, Lb7/f$a;->ELEMENT_TEXT_CONTENT:Lb7/f$a;

    return-object v0

    :pswitch_5
    sget-object v0, Lb7/f$a;->ELEMENT_END:Lb7/f$a;

    return-object v0

    :pswitch_6
    sget-object v0, Lb7/f$a;->ELEMENT_BEGIN:Lb7/f$a;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_4
    .end packed-switch
.end method

.method public getPath()Ljava/lang/String;
    .locals 4

    iget v0, p0, Lb7/f;->e:I

    iget-object v1, p0, Lb7/f;->d:[I

    iget-object v2, p0, Lb7/f;->b:[Ljava/lang/String;

    iget-object v3, p0, Lb7/f;->c:[I

    invoke-static {v0, v1, v2, v3}, Lb7/g;->a(I[I[Ljava/lang/String;[I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public h()V
    .locals 2

    iget v0, p0, Lb7/f;->a:I

    if-nez v0, :cond_0

    invoke-direct {p0}, Lb7/f;->g()I

    move-result v0

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-direct {p0}, Lb7/f;->m0()V

    const/4 v0, 0x0

    iput v0, p0, Lb7/f;->a:I

    return-void

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "Expected end of element but was "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lb7/f;->f0()Lb7/f$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lb7/f;->t0(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method

.method public p()Z
    .locals 2

    iget v0, p0, Lb7/f;->a:I

    if-nez v0, :cond_0

    invoke-direct {p0}, Lb7/f;->g()I

    move-result v0

    :cond_0
    const/16 v1, 0x8

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public p0()V
    .locals 0

    invoke-virtual {p0}, Lb7/f;->P()Ljava/lang/String;

    invoke-virtual {p0}, Lb7/f;->q0()V

    return-void
.end method

.method public q0()V
    .locals 5

    iget v0, p0, Lb7/f;->a:I

    if-nez v0, :cond_0

    invoke-direct {p0}, Lb7/f;->g()I

    move-result v0

    :cond_0
    const/4 v1, 0x6

    if-eq v0, v1, :cond_2

    const/4 v2, 0x7

    if-ne v0, v2, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/tickaroo/tikxml/XmlDataException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Expected xml element attribute value (in double quotes or single quotes) but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lb7/f;->f0()Lb7/f$a;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " at path "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lb7/f;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/tickaroo/tikxml/XmlDataException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    const/4 v2, 0x0

    iput v2, p0, Lb7/f;->a:I

    iget-object v2, p0, Lb7/f;->b:[Ljava/lang/String;

    iget v3, p0, Lb7/f;->e:I

    add-int/lit8 v3, v3, -0x1

    const/4 v4, 0x0

    aput-object v4, v2, v3

    if-ne v0, v1, :cond_3

    const/16 v0, 0x22

    goto :goto_1

    :cond_3
    const/16 v0, 0x27

    :goto_1
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    invoke-direct {p0, v0}, Lb7/f;->r0(Ljava/lang/Byte;)V

    return-void
.end method

.method public s()Z
    .locals 2

    iget v0, p0, Lb7/f;->a:I

    if-nez v0, :cond_0

    invoke-direct {p0}, Lb7/f;->g()I

    move-result v0

    :cond_0
    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public v()Z
    .locals 2

    iget v0, p0, Lb7/f;->a:I

    if-nez v0, :cond_0

    invoke-direct {p0}, Lb7/f;->g()I

    move-result v0

    :cond_0
    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/16 v1, 0x9

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
