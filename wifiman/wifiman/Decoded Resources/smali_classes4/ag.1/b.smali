.class public abstract Lag/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lag/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lag/b$a;,
        Lag/b$b;
    }
.end annotation


# static fields
.field private static final d:Linet/ipaddr/j$c;

.field private static final e:Linet/ipaddr/j$c;

.field private static final f:Linet/ipaddr/j$c;

.field private static final g:[Ljava/lang/String;

.field protected static final h:[C

.field public static final i:[C

.field protected static final j:Ljava/math/BigInteger;

.field protected static final k:Ljava/math/BigInteger;

.field protected static final l:[C

.field protected static final m:[C

.field private static n:Ljava/util/TreeMap;

.field private static o:Ljava/util/TreeMap;


# instance fields
.field protected transient a:Ljava/lang/String;

.field private transient b:[B

.field private transient c:[B


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/16 v0, 0x30

    new-instance v1, Lbg/d$i$b;

    sget-object v2, Linet/ipaddr/a;->c:Ljava/lang/String;

    invoke-direct {v1, v2}, Lbg/d$i$b;-><init>(Ljava/lang/String;)V

    new-instance v2, Linet/ipaddr/j$c$a;

    const/16 v3, 0x8

    invoke-direct {v2, v3}, Linet/ipaddr/j$c$a;-><init>(I)V

    const-string v3, "0"

    invoke-virtual {v2, v3}, Linet/ipaddr/j$c$a;->n(Ljava/lang/String;)Linet/ipaddr/j$c$a;

    move-result-object v2

    invoke-virtual {v2, v1}, Linet/ipaddr/j$c$a;->s(Lbg/d$i$b;)Linet/ipaddr/j$c$a;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/j$c$a;->u()Linet/ipaddr/j$c;

    move-result-object v2

    sput-object v2, Lag/b;->d:Linet/ipaddr/j$c;

    new-instance v2, Linet/ipaddr/j$c$a;

    const/16 v3, 0x10

    invoke-direct {v2, v3}, Linet/ipaddr/j$c$a;-><init>(I)V

    const-string v3, "0x"

    invoke-virtual {v2, v3}, Linet/ipaddr/j$c$a;->n(Ljava/lang/String;)Linet/ipaddr/j$c$a;

    move-result-object v2

    invoke-virtual {v2, v1}, Linet/ipaddr/j$c$a;->s(Lbg/d$i$b;)Linet/ipaddr/j$c$a;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/j$c$a;->u()Linet/ipaddr/j$c;

    move-result-object v2

    sput-object v2, Lag/b;->e:Linet/ipaddr/j$c;

    new-instance v2, Linet/ipaddr/j$c$a;

    const/16 v3, 0xa

    invoke-direct {v2, v3}, Linet/ipaddr/j$c$a;-><init>(I)V

    invoke-virtual {v2, v1}, Linet/ipaddr/j$c$a;->s(Lbg/d$i$b;)Linet/ipaddr/j$c$a;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/j$c$a;->u()Linet/ipaddr/j$c;

    move-result-object v1

    sput-object v1, Lag/b;->f:Linet/ipaddr/j$c;

    const/16 v1, 0x14

    new-array v2, v1, [Ljava/lang/String;

    sput-object v2, Lag/b;->g:[Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, ""

    aput-object v4, v2, v3

    const/4 v2, 0x1

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    sget-object v4, Lag/b;->g:[Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    add-int/lit8 v6, v3, -0x1

    aget-object v6, v4, v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v3

    add-int/2addr v3, v2

    goto :goto_0

    :cond_0
    const/16 v0, 0x24

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lag/b;->h:[C

    const/16 v0, 0x55

    new-array v0, v0, [C

    fill-array-data v0, :array_1

    sput-object v0, Lag/b;->i:[C

    const-wide/16 v1, 0x2

    invoke-static {v1, v2}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v1

    sput-object v1, Lag/b;->j:Ljava/math/BigInteger;

    const-wide/16 v1, 0x55

    invoke-static {v1, v2}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v1

    sput-object v1, Lag/b;->k:Ljava/math/BigInteger;

    sput-object v0, Lag/b;->l:[C

    const/16 v0, 0xc8

    new-array v0, v0, [C

    fill-array-data v0, :array_2

    sput-object v0, Lag/b;->m:[C

    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    sput-object v0, Lag/b;->n:Ljava/util/TreeMap;

    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    sput-object v0, Lag/b;->o:Ljava/util/TreeMap;

    return-void

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x61s
        0x62s
        0x63s
        0x64s
        0x65s
        0x66s
        0x67s
        0x68s
        0x69s
        0x6as
        0x6bs
        0x6cs
        0x6ds
        0x6es
        0x6fs
        0x70s
        0x71s
        0x72s
        0x73s
        0x74s
        0x75s
        0x76s
        0x77s
        0x78s
        0x79s
        0x7as
    .end array-data

    :array_1
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
        0x47s
        0x48s
        0x49s
        0x4as
        0x4bs
        0x4cs
        0x4ds
        0x4es
        0x4fs
        0x50s
        0x51s
        0x52s
        0x53s
        0x54s
        0x55s
        0x56s
        0x57s
        0x58s
        0x59s
        0x5as
        0x61s
        0x62s
        0x63s
        0x64s
        0x65s
        0x66s
        0x67s
        0x68s
        0x69s
        0x6as
        0x6bs
        0x6cs
        0x6ds
        0x6es
        0x6fs
        0x70s
        0x71s
        0x72s
        0x73s
        0x74s
        0x75s
        0x76s
        0x77s
        0x78s
        0x79s
        0x7as
        0x21s
        0x23s
        0x24s
        0x25s
        0x26s
        0x28s
        0x29s
        0x2as
        0x2bs
        0x2ds
        0x3bs
        0x3cs
        0x3ds
        0x3es
        0x3fs
        0x40s
        0x5es
        0x5fs
        0x60s
        0x7bs
        0x7cs
        0x7ds
        0x7es
    .end array-data

    nop

    :array_2
    .array-data 2
        0x30s
        0x30s
        0x30s
        0x31s
        0x30s
        0x32s
        0x30s
        0x33s
        0x30s
        0x34s
        0x30s
        0x35s
        0x30s
        0x36s
        0x30s
        0x37s
        0x30s
        0x38s
        0x30s
        0x39s
        0x31s
        0x30s
        0x31s
        0x31s
        0x31s
        0x32s
        0x31s
        0x33s
        0x31s
        0x34s
        0x31s
        0x35s
        0x31s
        0x36s
        0x31s
        0x37s
        0x31s
        0x38s
        0x31s
        0x39s
        0x32s
        0x30s
        0x32s
        0x31s
        0x32s
        0x32s
        0x32s
        0x33s
        0x32s
        0x34s
        0x32s
        0x35s
        0x32s
        0x36s
        0x32s
        0x37s
        0x32s
        0x38s
        0x32s
        0x39s
        0x33s
        0x30s
        0x33s
        0x31s
        0x33s
        0x32s
        0x33s
        0x33s
        0x33s
        0x34s
        0x33s
        0x35s
        0x33s
        0x36s
        0x33s
        0x37s
        0x33s
        0x38s
        0x33s
        0x39s
        0x34s
        0x30s
        0x34s
        0x31s
        0x34s
        0x32s
        0x34s
        0x33s
        0x34s
        0x34s
        0x34s
        0x35s
        0x34s
        0x36s
        0x34s
        0x37s
        0x34s
        0x38s
        0x34s
        0x39s
        0x35s
        0x30s
        0x35s
        0x31s
        0x35s
        0x32s
        0x35s
        0x33s
        0x35s
        0x34s
        0x35s
        0x35s
        0x35s
        0x36s
        0x35s
        0x37s
        0x35s
        0x38s
        0x35s
        0x39s
        0x36s
        0x30s
        0x36s
        0x31s
        0x36s
        0x32s
        0x36s
        0x33s
        0x36s
        0x34s
        0x36s
        0x35s
        0x36s
        0x36s
        0x36s
        0x37s
        0x36s
        0x38s
        0x36s
        0x39s
        0x37s
        0x30s
        0x37s
        0x31s
        0x37s
        0x32s
        0x37s
        0x33s
        0x37s
        0x34s
        0x37s
        0x35s
        0x37s
        0x36s
        0x37s
        0x37s
        0x37s
        0x38s
        0x37s
        0x39s
        0x38s
        0x30s
        0x38s
        0x31s
        0x38s
        0x32s
        0x38s
        0x33s
        0x38s
        0x34s
        0x38s
        0x35s
        0x38s
        0x36s
        0x38s
        0x37s
        0x38s
        0x38s
        0x38s
        0x39s
        0x39s
        0x30s
        0x39s
        0x31s
        0x39s
        0x32s
        0x39s
        0x33s
        0x39s
        0x34s
        0x39s
        0x35s
        0x39s
        0x36s
        0x39s
        0x37s
        0x39s
        0x38s
        0x39s
        0x39s
    .end array-data
.end method

.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static C(IJJ)I
    .locals 6

    const/16 v0, 0x20

    ushr-long v1, p1, v0

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    move-wide v1, p1

    goto :goto_0

    :cond_0
    xor-long/2addr v1, p1

    :goto_0
    long-to-int v1, v1

    mul-int/lit8 p0, p0, 0x1f

    add-int/2addr p0, v1

    cmp-long p1, p3, p1

    if-eqz p1, :cond_2

    ushr-long p1, p3, v0

    cmp-long v0, p1, v3

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    xor-long/2addr p3, p1

    :goto_1
    long-to-int p1, p3

    mul-int/lit8 p0, p0, 0x1f

    add-int/2addr p0, p1

    :cond_2
    return p0
.end method

.method protected static G1(Linet/ipaddr/j$c;)Lag/d$b;
    .locals 4

    invoke-static {p0}, Lag/d;->K0(Lag/d$f;)Ldg/c;

    move-result-object v0

    check-cast v0, Lag/d$b;

    if-nez v0, :cond_0

    new-instance v0, Lag/d$c;

    iget v1, p0, Lbg/d$i;->d:I

    iget-object v2, p0, Lbg/d$i;->f:Ljava/lang/Character;

    iget-boolean v3, p0, Lbg/d$i;->j:Z

    invoke-direct {v0, v1, v2, v3}, Lag/d$c;-><init>(ILjava/lang/Character;Z)V

    iget-boolean v1, p0, Lbg/d$i;->c:Z

    invoke-virtual {v0, v1}, Lag/d$b;->u(Z)V

    iget-object v1, p0, Lbg/d$i;->b:Lbg/d$i$b;

    invoke-virtual {v0, v1}, Lag/d$b;->O(Lbg/d$i$b;)V

    iget-object v1, p0, Lbg/d$i;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lag/d$b;->K(Ljava/lang/String;)V

    iget-object v1, p0, Lbg/d$i;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lag/d$b;->G(Ljava/lang/String;)V

    iget-boolean v1, p0, Lbg/d$i;->h:Z

    invoke-virtual {v0, v1}, Lag/d$b;->I(Z)V

    iget-boolean v1, p0, Lbg/d$i;->i:Z

    invoke-virtual {v0, v1}, Lag/d$b;->M(Z)V

    iget v1, p0, Lbg/d$i;->d:I

    invoke-virtual {v0, v1}, Lag/d$b;->H(I)V

    iget-boolean v1, p0, Lbg/d$i;->j:Z

    invoke-virtual {v0, v1}, Lag/d$b;->N(Z)V

    iget-object v1, p0, Lbg/d$i;->f:Ljava/lang/Character;

    invoke-virtual {v0, v1}, Lag/d$b;->L(Ljava/lang/Character;)V

    iget-char v1, p0, Linet/ipaddr/j$c;->m:C

    invoke-virtual {v0, v1}, Lag/d$b;->P(C)V

    invoke-static {p0, v0}, Lag/d;->f1(Lag/d$f;Ldg/c;)V

    :cond_0
    return-object v0
.end method

.method protected static H1(JIIZLjava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 2

    const/4 v0, 0x2

    if-lt p2, v0, :cond_2

    const/16 v0, 0x55

    if-gt p2, v0, :cond_2

    const-wide/32 v0, 0xffff

    cmp-long v0, p0, v0

    if-gtz v0, :cond_0

    long-to-int v0, p0

    invoke-static {v0, p2, p3, p4, p5}, Lag/b;->J1(IIIZLjava/lang/StringBuilder;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-static/range {p0 .. p5}, Lag/b;->N1(JIIZLjava/lang/StringBuilder;)V

    :cond_1
    return-object p5

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method private static I1(IIZLjava/lang/StringBuilder;)Z
    .locals 18

    move/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    const/16 v4, 0x30

    const/16 v5, 0x31

    const/4 v6, 0x1

    if-gt v0, v6, :cond_1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move v4, v5

    :goto_0
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return v6

    :cond_1
    const-string v7, "     "

    const/16 v8, 0xff

    const/16 v9, 0xa

    const-string v10, "    "

    const-string v11, "   "

    const/4 v12, 0x2

    if-ne v1, v9, :cond_b

    if-ge v0, v9, :cond_2

    invoke-static {v2, v1}, Lag/b;->e1(ZI)[C

    move-result-object v1

    aget-char v0, v1, v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return v6

    :cond_2
    const/16 v1, 0x64

    if-ge v0, v1, :cond_3

    sget-object v1, Lag/b;->m:[C

    shl-int/2addr v0, v6

    aget-char v2, v1, v0

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/2addr v0, v6

    aget-char v0, v1, v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return v6

    :cond_3
    const/16 v2, 0xc8

    if-ge v0, v2, :cond_5

    invoke-virtual/range {p3 .. p3}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    const-string v4, "127"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x7f

    if-eq v0, v4, :cond_4

    sget-object v4, Lag/b;->m:[C

    add-int/lit8 v5, v2, 0x1

    sub-int/2addr v0, v1

    shl-int/2addr v0, v6

    aget-char v1, v4, v0

    invoke-virtual {v3, v5, v1}, Ljava/lang/StringBuilder;->setCharAt(IC)V

    add-int/2addr v2, v12

    add-int/2addr v0, v6

    aget-char v0, v4, v0

    invoke-virtual {v3, v2, v0}, Ljava/lang/StringBuilder;->setCharAt(IC)V

    :cond_4
    return v6

    :cond_5
    const/16 v1, 0x12c

    if-ge v0, v1, :cond_7

    invoke-virtual/range {p3 .. p3}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    const-string v4, "255"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eq v0, v8, :cond_6

    sget-object v4, Lag/b;->m:[C

    add-int/lit8 v5, v1, 0x1

    sub-int/2addr v0, v2

    shl-int/2addr v0, v6

    aget-char v2, v4, v0

    invoke-virtual {v3, v5, v2}, Ljava/lang/StringBuilder;->setCharAt(IC)V

    add-int/2addr v1, v12

    add-int/2addr v0, v6

    aget-char v0, v4, v0

    invoke-virtual {v3, v1, v0}, Ljava/lang/StringBuilder;->setCharAt(IC)V

    :cond_6
    return v6

    :cond_7
    const/16 v1, 0x3e8

    if-ge v0, v1, :cond_8

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_8
    const/16 v1, 0x2710

    if-ge v0, v1, :cond_9

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_9
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    sget-object v9, Lag/b;->h:[C

    invoke-virtual/range {p3 .. p3}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    :goto_2
    const v2, 0xcccd

    mul-int/2addr v2, v0

    ushr-int/lit8 v2, v2, 0x13

    shl-int/lit8 v4, v2, 0x3

    shl-int/lit8 v5, v2, 0x1

    add-int/2addr v4, v5

    sub-int/2addr v0, v4

    add-int/lit8 v1, v1, -0x1

    aget-char v0, v9, v0

    invoke-virtual {v3, v1, v0}, Ljava/lang/StringBuilder;->setCharAt(IC)V

    if-nez v2, :cond_a

    return v6

    :cond_a
    move v0, v2

    goto :goto_2

    :cond_b
    const v9, 0xffff

    const/16 v13, 0x1000

    const-string v14, "  "

    const/16 v15, 0x10

    const/16 v16, 0x4

    if-ne v1, v15, :cond_12

    if-ge v0, v15, :cond_c

    invoke-static {v2, v1}, Lag/b;->e1(ZI)[C

    move-result-object v1

    aget-char v0, v1, v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return v6

    :cond_c
    const/16 v4, 0x100

    if-ge v0, v4, :cond_d

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_4

    :cond_d
    if-ge v0, v13, :cond_e

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_4

    :cond_e
    if-ne v0, v9, :cond_10

    if-eqz v2, :cond_f

    const-string v0, "FFFF"

    goto :goto_3

    :cond_f
    const-string v0, "ffff"

    :goto_3
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return v6

    :cond_10
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_4
    invoke-static {v2, v1}, Lag/b;->e1(ZI)[C

    move-result-object v2

    invoke-virtual/range {p3 .. p3}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    :cond_11
    and-int/lit8 v4, v0, 0xf

    ushr-int/lit8 v0, v0, 0x4

    add-int/lit8 v1, v1, -0x1

    aget-char v4, v2, v4

    invoke-virtual {v3, v1, v4}, Ljava/lang/StringBuilder;->setCharAt(IC)V

    if-nez v0, :cond_11

    return v6

    :cond_12
    const/16 v2, 0x8

    if-ne v1, v2, :cond_19

    sget-object v17, Lag/b;->h:[C

    if-ge v0, v2, :cond_13

    aget-char v0, v17, v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return v6

    :cond_13
    const/16 v1, 0x40

    if-ge v0, v1, :cond_14

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_5

    :cond_14
    const/16 v1, 0x200

    if-ge v0, v1, :cond_15

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_5

    :cond_15
    if-ge v0, v13, :cond_16

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_5

    :cond_16
    const v1, 0x8000

    if-ge v0, v1, :cond_17

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_5

    :cond_17
    const-string v1, "      "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_5
    invoke-virtual/range {p3 .. p3}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    :cond_18
    and-int/lit8 v2, v0, 0x7

    ushr-int/lit8 v0, v0, 0x3

    add-int/lit8 v1, v1, -0x1

    aget-char v2, v17, v2

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->setCharAt(IC)V

    if-nez v0, :cond_18

    return v6

    :cond_19
    if-ne v1, v12, :cond_22

    ushr-int/lit8 v1, v0, 0x8

    if-nez v1, :cond_1c

    if-ne v0, v8, :cond_1a

    const-string v0, "11111111"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return v6

    :cond_1a
    ushr-int/lit8 v1, v0, 0x4

    if-nez v1, :cond_1b

    move/from16 v15, v16

    goto :goto_6

    :cond_1b
    move v15, v2

    goto :goto_6

    :cond_1c
    if-ne v0, v9, :cond_1d

    const-string v0, "1111111111111111"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return v6

    :cond_1d
    ushr-int/lit8 v1, v0, 0x4

    if-nez v1, :cond_1e

    const/16 v15, 0xc

    :cond_1e
    :goto_6
    add-int/lit8 v15, v15, -0x1

    if-lez v15, :cond_20

    ushr-int v1, v0, v15

    and-int/2addr v1, v6

    if-ne v1, v6, :cond_1e

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_7
    add-int/lit8 v15, v15, -0x1

    if-lez v15, :cond_20

    ushr-int v1, v0, v15

    and-int/2addr v1, v6

    if-nez v1, :cond_1f

    move v1, v4

    goto :goto_8

    :cond_1f
    move v1, v5

    :goto_8
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_7

    :cond_20
    and-int/2addr v0, v6

    if-nez v0, :cond_21

    goto :goto_9

    :cond_21
    move v4, v5

    :goto_9
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return v6

    :cond_22
    const/4 v0, 0x0

    return v0
.end method

.method private static J1(IIIZLjava/lang/StringBuilder;)Z
    .locals 0

    invoke-static {p0, p1, p3, p4}, Lag/b;->I1(IIZLjava/lang/StringBuilder;)Z

    move-result p0

    if-eqz p0, :cond_1

    if-lez p2, :cond_0

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->length()I

    move-result p0

    sub-int/2addr p0, p2

    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->setLength(I)V

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method protected static K1(JI)I
    .locals 2

    const/4 v0, 0x2

    if-lt p2, v0, :cond_2

    const/16 v0, 0x55

    if-gt p2, v0, :cond_2

    const-wide/32 v0, 0xffff

    cmp-long v0, p0, v0

    if-gtz v0, :cond_0

    long-to-int v0, p0

    invoke-static {v0, p2}, Lag/b;->L1(II)I

    move-result v0

    if-gez v0, :cond_1

    :cond_0
    invoke-static {p0, p1, p2}, Lag/b;->M1(JI)I

    move-result v0

    :cond_1
    return v0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method private static L1(II)I
    .locals 8

    const/4 v0, 0x1

    if-gt p0, v0, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x5

    const/16 v2, 0xa

    const/4 v3, 0x3

    const/4 v4, 0x4

    const/4 v5, 0x2

    if-ne p1, v2, :cond_5

    if-ge p0, v2, :cond_1

    return v0

    :cond_1
    const/16 p1, 0x64

    if-ge p0, p1, :cond_2

    return v5

    :cond_2
    const/16 p1, 0x3e8

    if-ge p0, p1, :cond_3

    return v3

    :cond_3
    const/16 p1, 0x2710

    if-ge p0, p1, :cond_4

    return v4

    :cond_4
    return v1

    :cond_5
    const/16 v2, 0x1000

    const/16 v6, 0x10

    if-ne p1, v6, :cond_9

    if-ge p0, v6, :cond_6

    return v0

    :cond_6
    const/16 p1, 0x100

    if-ge p0, p1, :cond_7

    return v5

    :cond_7
    if-ge p0, v2, :cond_8

    return v3

    :cond_8
    return v4

    :cond_9
    const/16 v6, 0x8

    if-ne p1, v6, :cond_f

    if-ge p0, v6, :cond_a

    return v0

    :cond_a
    const/16 p1, 0x40

    if-ge p0, p1, :cond_b

    return v5

    :cond_b
    const/16 p1, 0x200

    if-ge p0, p1, :cond_c

    return v3

    :cond_c
    if-ge p0, v2, :cond_d

    return v4

    :cond_d
    const p1, 0x8000

    if-ge p0, p1, :cond_e

    return v1

    :cond_e
    const/4 p0, 0x6

    return p0

    :cond_f
    if-ne p1, v5, :cond_14

    ushr-int/lit8 p1, p0, 0x8

    if-nez p1, :cond_10

    const/4 p1, 0x7

    goto :goto_0

    :cond_10
    const/16 p0, 0xf

    move v7, p1

    move p1, p0

    move p0, v7

    :goto_0
    ushr-int/lit8 v0, p0, 0x4

    if-nez v0, :cond_11

    add-int/lit8 p1, p1, -0x4

    goto :goto_1

    :cond_11
    move p0, v0

    :goto_1
    ushr-int/lit8 v0, p0, 0x2

    if-nez v0, :cond_12

    add-int/lit8 p1, p1, -0x2

    goto :goto_2

    :cond_12
    move p0, v0

    :goto_2
    and-int/2addr p0, v5

    if-eqz p0, :cond_13

    add-int/lit8 p1, p1, 0x1

    :cond_13
    return p1

    :cond_14
    const/4 p0, -0x1

    return p0
.end method

.method private static M1(JI)I
    .locals 8

    const-wide/32 v0, 0x7fffffff

    cmp-long v2, p0, v0

    const/4 v3, 0x1

    if-gtz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_1

    long-to-int v4, p0

    goto :goto_1

    :cond_1
    move v4, p2

    :goto_1
    move v5, v3

    :goto_2
    if-lt v4, p2, :cond_4

    if-eqz v2, :cond_2

    div-int/2addr v4, p2

    goto :goto_3

    :cond_2
    int-to-long v6, p2

    div-long/2addr p0, v6

    cmp-long v6, p0, v0

    if-gtz v6, :cond_3

    long-to-int v2, p0

    move v4, v2

    move v2, v3

    :cond_3
    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_4
    return v5
.end method

.method private static N1(JIIZLjava/lang/StringBuilder;)V
    .locals 1

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    invoke-static/range {p0 .. p5}, Lag/b;->q0(JIIZLjava/lang/StringBuilder;)V

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->length()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    :goto_0
    if-ge v0, p0, :cond_0

    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result p1

    add-int/lit8 p2, v0, 0x1

    invoke-virtual {p5, p0}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result p3

    invoke-virtual {p5, v0, p3}, Ljava/lang/StringBuilder;->setCharAt(IC)V

    add-int/lit8 p3, p0, -0x1

    invoke-virtual {p5, p0, p1}, Ljava/lang/StringBuilder;->setCharAt(IC)V

    move v0, p2

    move p0, p3

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected static U0(LZf/d;IILjava/util/function/Supplier;Lag/b$a;Lag/b$b;)Ldg/b;
    .locals 8

    new-instance v7, Lag/i;

    move-object v0, v7

    move-object v1, p0

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lag/i;-><init>(LZf/d;IILjava/util/function/Supplier;Lag/b$a;Lag/b$b;)V

    return-object v7
.end method

.method private W0([BI[B)[B
    .locals 4

    invoke-interface {p0}, Lag/g;->f()I

    move-result v0

    add-int/lit8 v0, v0, 0x7

    shr-int/lit8 v0, v0, 0x3

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    array-length v2, p1

    add-int v3, v0, p2

    if-ge v2, v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p3, v1, p1, p2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object p1

    :cond_1
    :goto_0
    if-lez p2, :cond_3

    add-int/2addr v0, p2

    new-array v0, v0, [B

    if-eqz p1, :cond_2

    array-length v2, p1

    invoke-static {p2, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-static {p1, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_2
    array-length p1, p3

    invoke-static {p3, v1, v0, p2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0

    :cond_3
    invoke-virtual {p3}, [B->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    return-object p1
.end method

.method private static c1(II)I
    .locals 4

    const/16 v0, 0x55

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-gtz p0, :cond_1

    if-nez p0, :cond_0

    if-lt p1, v2, :cond_0

    if-gt p1, v0, :cond_0

    return v1

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    :cond_1
    if-eq p1, v2, :cond_7

    const/4 v3, 0x4

    if-eq p1, v3, :cond_6

    const/16 v1, 0x8

    if-eq p1, v1, :cond_5

    const/16 v1, 0xa

    if-eq p1, v1, :cond_4

    const/16 v1, 0x10

    if-eq p1, v1, :cond_3

    if-lt p1, v2, :cond_2

    if-gt p1, v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    :cond_3
    add-int/lit8 p0, p0, 0x3

    shr-int/2addr p0, v2

    return p0

    :cond_4
    :goto_0
    const/4 p0, -0x1

    return p0

    :cond_5
    add-int/2addr p0, v2

    div-int/lit8 p0, p0, 0x3

    return p0

    :cond_6
    add-int/2addr p0, v1

    shr-int/2addr p0, v1

    :cond_7
    return p0
.end method

.method public static d1(JI)I
    .locals 8

    const/16 v0, 0x10

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    if-ne p2, v0, :cond_1

    cmp-long v0, p0, v1

    if-ltz v0, :cond_1

    :goto_0
    const/4 p2, 0x4

    ushr-long/2addr p0, p2

    cmp-long p2, p0, v1

    if-nez p2, :cond_0

    return v3

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/16 v0, 0xa

    const/4 v4, 0x3

    const/4 v5, 0x2

    if-ne p2, v0, :cond_5

    const-wide/16 v6, -0xa

    cmp-long v0, p0, v6

    if-lez v0, :cond_5

    const-wide/16 v6, 0xa

    cmp-long v0, p0, v6

    if-gez v0, :cond_2

    return v3

    :cond_2
    const-wide/16 v6, 0x64

    cmp-long v0, p0, v6

    if-gez v0, :cond_3

    return v5

    :cond_3
    const-wide/16 v5, 0x3e8

    cmp-long v0, p0, v5

    if-gez v0, :cond_4

    return v4

    :cond_4
    div-long/2addr p0, v5

    move v3, v4

    goto :goto_2

    :cond_5
    const/16 v0, 0x8

    if-ne p2, v0, :cond_7

    cmp-long v0, p0, v1

    if-ltz v0, :cond_7

    :goto_1
    ushr-long/2addr p0, v4

    cmp-long p2, p0, v1

    if-nez p2, :cond_6

    return v3

    :cond_6
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_7
    if-ne p2, v5, :cond_8

    cmp-long v0, p0, v1

    if-lez v0, :cond_8

    invoke-static {p0, p1}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result p0

    rsub-int/lit8 p0, p0, 0x40

    return p0

    :cond_8
    if-lt p2, v5, :cond_a

    const/16 v0, 0x55

    if-gt p2, v0, :cond_a

    :goto_2
    int-to-long v4, p2

    div-long/2addr p0, v4

    cmp-long v0, p0, v1

    if-nez v0, :cond_9

    return v3

    :cond_9
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method private static e1(ZI)[C
    .locals 0

    if-nez p0, :cond_1

    const/16 p0, 0x24

    if-le p1, p0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p0, Lag/b;->h:[C

    return-object p0

    :cond_1
    :goto_0
    sget-object p0, Lag/b;->l:[C

    return-object p0
.end method

.method private static f1(Ljava/lang/String;Ljava/lang/StringBuilder;)I
    .locals 0

    if-nez p1, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    return p0

    :cond_0
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 p0, 0x0

    return p0
.end method

.method protected static g1(ILjava/lang/StringBuilder;)V
    .locals 3

    if-lez p0, :cond_2

    sget-object v0, Lag/b;->g:[Ljava/lang/String;

    array-length v1, v0

    if-lt p0, v1, :cond_1

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    aget-object v2, v0, v1

    :goto_0
    if-lt p0, v1, :cond_0

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sub-int/2addr p0, v1

    goto :goto_0

    :cond_0
    aget-object p0, v0, p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :cond_1
    aget-object p0, v0, p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    return-void
.end method

.method protected static l1(IIJ)I
    .locals 4

    int-to-long v0, p0

    const/16 v2, 0x20

    shl-long/2addr v0, v2

    int-to-long v2, p1

    or-long/2addr v0, v2

    sget-object v2, Lag/b;->n:Ljava/util/TreeMap;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-nez v2, :cond_1

    invoke-static {p1, p0}, Lag/b;->c1(II)I

    move-result p1

    if-gez p1, :cond_0

    invoke-static {p2, p3, p0}, Lag/b;->d1(JI)I

    move-result p1

    :cond_0
    invoke-static {p1}, Lag/d;->s(I)Ljava/lang/Integer;

    move-result-object v2

    sget-object p0, Lag/b;->n:Ljava/util/TreeMap;

    invoke-virtual {p0}, Ljava/util/TreeMap;->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/TreeMap;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p0, p1, v2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sput-object p0, Lag/b;->n:Ljava/util/TreeMap;

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method

.method private static q0(JIIZLjava/lang/StringBuilder;)V
    .locals 10

    const-wide/32 v0, 0x7fffffff

    cmp-long v2, p0, v0

    const/4 v3, 0x1

    if-gtz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_1

    long-to-int v4, p0

    goto :goto_1

    :cond_1
    move v4, p2

    :goto_1
    invoke-static {p4, p2}, Lag/b;->e1(ZI)[C

    move-result-object p4

    :goto_2
    if-lt v4, p2, :cond_6

    if-eqz v2, :cond_3

    div-int v5, v4, p2

    if-lez p3, :cond_2

    add-int/lit8 p3, p3, -0x1

    :goto_3
    move v4, v5

    goto :goto_2

    :cond_2
    rem-int/2addr v4, p2

    goto :goto_4

    :cond_3
    int-to-long v5, p2

    div-long v7, p0, v5

    cmp-long v9, v7, v0

    if-gtz v9, :cond_4

    long-to-int v2, v7

    move v4, v2

    move v2, v3

    :cond_4
    if-lez p3, :cond_5

    add-int/lit8 p3, p3, -0x1

    move-wide p0, v7

    goto :goto_2

    :cond_5
    rem-long/2addr p0, v5

    long-to-int p0, p0

    move v5, v4

    move v4, p0

    move-wide p0, v7

    :goto_4
    aget-char v4, p4, v4

    invoke-virtual {p5, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_6
    if-nez p3, :cond_7

    aget-char p0, p4, v4

    invoke-virtual {p5, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_7
    return-void
.end method

.method private static r1(ICCLjava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 2

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    :goto_0
    add-int/lit8 v1, p0, -0x1

    if-lez p0, :cond_1

    if-lez v0, :cond_0

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move p0, v1

    goto :goto_0

    :cond_1
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->length()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->setLength(I)V

    return-void
.end method

.method private static s1(ICLjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 1

    :goto_0
    add-int/lit8 v0, p0, -0x1

    if-lez p0, :cond_1

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p0

    if-lez p0, :cond_0

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move p0, v0

    goto :goto_0

    :cond_1
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->length()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->setLength(I)V

    return-void
.end method

.method private static t1(ICLjava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 1

    const/16 v0, 0x30

    invoke-static {p0, p1, v0, p2, p3}, Lag/b;->r1(ICCLjava/lang/String;Ljava/lang/StringBuilder;)V

    return-void
.end method


# virtual methods
.method public A1([BI)[B
    .locals 1

    invoke-interface {p0}, Lag/g;->A0()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lag/b;->V0([BI)[B

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lag/b;->c:[B

    if-nez v0, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lag/b;->X0(Z)[B

    move-result-object v0

    iput-object v0, p0, Lag/b;->c:[B

    :cond_1
    invoke-direct {p0, p1, p2, v0}, Lag/b;->W0([BI[B)[B

    move-result-object p1

    return-object p1
.end method

.method protected abstract B1(IZLjava/lang/StringBuilder;)V
.end method

.method protected abstract C1(I)I
.end method

.method protected abstract D1(IZLjava/lang/StringBuilder;)V
.end method

.method protected abstract E1()Ljava/lang/String;
.end method

.method protected F1()V
    .locals 1

    iget-object v0, p0, Lag/b;->a:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lag/b;->a1()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    monitor-enter p0

    :try_start_0
    iput-object v0, p0, Lag/b;->a:Ljava/lang/String;

    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    :goto_0
    return-void
.end method

.method public G([B)[B
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lag/b;->A1([BI)[B

    move-result-object p1

    return-object p1
.end method

.method protected abstract J(II)I
.end method

.method protected K0(Ljava/lang/CharSequence;ILjava/lang/StringBuilder;)V
    .locals 2

    const/16 v0, 0xa

    if-le p2, v0, :cond_1

    const/4 p2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-ge p2, v0, :cond_2

    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v1, 0x61

    if-lt v0, v1, :cond_0

    const/16 v1, 0x7a

    if-gt v0, v1, :cond_0

    add-int/lit8 v0, v0, -0x20

    int-to-char v0, v0

    :cond_0
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    :cond_2
    return-void
.end method

.method public R0([B)[B
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lag/b;->V0([BI)[B

    move-result-object p1

    return-object p1
.end method

.method T(I)I
    .locals 1

    if-eqz p1, :cond_1

    invoke-interface {p0}, Lag/g;->L()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    :cond_0
    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public V0([BI)[B
    .locals 1

    iget-object v0, p0, Lag/b;->b:[B

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lag/b;->X0(Z)[B

    move-result-object v0

    iput-object v0, p0, Lag/b;->b:[B

    :cond_0
    invoke-direct {p0, p1, p2, v0}, Lag/b;->W0([BI[B)[B

    move-result-object p1

    return-object p1
.end method

.method protected abstract X0(Z)[B
.end method

.method protected abstract Y0()Ljava/lang/String;
.end method

.method protected abstract Z0()Ljava/lang/String;
.end method

.method protected abstract a1()Ljava/lang/String;
.end method

.method protected abstract b0(II)I
.end method

.method protected abstract b1()I
.end method

.method public abstract equals(Ljava/lang/Object;)Z
.end method

.method protected abstract h1(IIZLjava/lang/StringBuilder;)V
.end method

.method protected abstract i1(IZLjava/lang/StringBuilder;)V
.end method

.method public j(ILdg/d;Ljava/lang/StringBuilder;)I
    .locals 11

    invoke-interface {p0}, Lag/g;->A0()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_9

    invoke-interface {p2}, Ldg/d;->c()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {p2}, Ldg/d;->h()I

    move-result v3

    invoke-interface {p2, p1}, Ldg/d;->k(I)I

    move-result p1

    invoke-virtual {p0, p1, v3}, Lag/b;->J(II)I

    move-result p1

    invoke-interface {p2}, Ldg/d;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-nez p3, :cond_3

    if-eqz p1, :cond_1

    if-gez p1, :cond_0

    invoke-interface {p0, v3}, Lcg/a;->s(I)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v3}, Lag/b;->j1(I)I

    move-result p2

    add-int/2addr p1, p2

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v3}, Lag/b;->j1(I)I

    move-result p1

    :goto_0
    shl-int/lit8 p2, p1, 0x1

    add-int/lit8 p2, p2, -0x1

    if-lez v2, :cond_2

    mul-int/2addr p1, v2

    add-int/2addr p2, p1

    :cond_2
    return p2

    :cond_3
    invoke-interface {p2}, Ldg/d;->d()Ljava/lang/Character;

    move-result-object v2

    if-nez v2, :cond_4

    move v10, v1

    goto :goto_1

    :cond_4
    invoke-interface {p2}, Ldg/d;->d()Ljava/lang/Character;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Character;->charValue()C

    move-result v2

    move v10, v2

    :goto_1
    invoke-interface {p2}, Ldg/d;->e()Z

    move-result v7

    invoke-interface {p2}, Ldg/d;->b()Z

    move-result v5

    if-eqz v7, :cond_5

    const/4 v4, 0x0

    move-object v2, p0

    move v6, v10

    move-object v8, v0

    move-object v9, p3

    invoke-virtual/range {v2 .. v9}, Lag/b;->u1(IIZCZLjava/lang/String;Ljava/lang/StringBuilder;)V

    if-eqz p1, :cond_7

    invoke-virtual {p3, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p1, v10, v0, p3}, Lag/b;->t1(ICLjava/lang/String;Ljava/lang/StringBuilder;)V

    goto :goto_2

    :cond_5
    if-eqz p1, :cond_6

    invoke-static {p1, v10, v0, p3}, Lag/b;->t1(ICLjava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {p3, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_6
    const/4 v4, 0x0

    move-object v2, p0

    move v6, v10

    move-object v8, v0

    move-object v9, p3

    invoke-virtual/range {v2 .. v9}, Lag/b;->u1(IIZCZLjava/lang/String;Ljava/lang/StringBuilder;)V

    :cond_7
    :goto_2
    return v1

    :cond_8
    invoke-virtual {p0, p1, p2, p3}, Lag/b;->v(ILdg/d;Ljava/lang/StringBuilder;)I

    move-result p1

    return p1

    :cond_9
    invoke-interface {p0}, Lag/g;->w()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-interface {p2}, Ldg/d;->f()Lbg/d$i$b;

    move-result-object v0

    iget-object v0, v0, Lbg/d$i$b;->b:Ljava/lang/String;

    if-eqz v0, :cond_e

    invoke-virtual {p0}, Lag/b;->a1()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-virtual {p0}, Lag/b;->F1()V

    :cond_a
    invoke-interface {p2}, Ldg/d;->c()Z

    move-result p1

    if-eqz p1, :cond_d

    invoke-interface {p2}, Ldg/d;->h()I

    move-result p1

    if-nez p3, :cond_b

    invoke-interface {p0, p1}, Lcg/a;->s(I)I

    move-result p1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p2

    add-int/lit8 p2, p2, 0x1

    mul-int/2addr p1, p2

    add-int/lit8 p1, p1, -0x1

    return p1

    :cond_b
    invoke-interface {p2}, Ldg/d;->d()Ljava/lang/Character;

    move-result-object v2

    if-nez v2, :cond_c

    move p2, v1

    goto :goto_3

    :cond_c
    invoke-interface {p2}, Ldg/d;->d()Ljava/lang/Character;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Character;->charValue()C

    move-result p2

    :goto_3
    invoke-interface {p0, p1}, Lcg/a;->s(I)I

    move-result p1

    const-string v2, ""

    invoke-static {p1, p2, v0, v2, p3}, Lag/b;->s1(ICLjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    return v1

    :cond_d
    invoke-static {v0, p3}, Lag/b;->f1(Ljava/lang/String;Ljava/lang/StringBuilder;)I

    move-result p1

    return p1

    :cond_e
    invoke-virtual {p0, p1, p2, p3}, Lag/b;->p1(ILdg/d;Ljava/lang/StringBuilder;)I

    move-result p1

    return p1
.end method

.method protected abstract j1(I)I
.end method

.method protected abstract k1()I
.end method

.method protected abstract m1(I)I
.end method

.method protected n1(ILdg/d;Ljava/lang/StringBuilder;)I
    .locals 5

    invoke-interface {p2}, Ldg/d;->h()I

    move-result v0

    invoke-interface {p2, p1}, Ldg/d;->k(I)I

    move-result p1

    invoke-virtual {p0, p1, v0}, Lag/b;->J(II)I

    move-result p1

    invoke-interface {p2}, Ldg/d;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-interface {p2}, Ldg/d;->f()Lbg/d$i$b;

    move-result-object v3

    invoke-virtual {p0, v0}, Lag/b;->m1(I)I

    move-result v4

    invoke-virtual {p0, v4}, Lag/b;->T(I)I

    move-result v4

    if-nez p3, :cond_0

    invoke-virtual {p0, v0}, Lag/b;->j1(I)I

    move-result p2

    add-int/2addr p2, p1

    add-int/2addr p2, v2

    return p2

    :cond_0
    if-lez v2, :cond_1

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    if-lez p1, :cond_2

    invoke-static {p1, p3}, Lag/b;->g1(ILjava/lang/StringBuilder;)V

    :cond_2
    invoke-interface {p2}, Ldg/d;->b()Z

    move-result p1

    invoke-virtual {p0, v0, v4, p1, p3}, Lag/b;->h1(IIZLjava/lang/StringBuilder;)V

    const/4 p1, 0x0

    move p2, p1

    :goto_0
    if-ge p2, v4, :cond_3

    iget-object v0, v3, Lbg/d$i$b;->c:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_3
    return p1
.end method

.method protected o1(ILdg/d;IIZLjava/lang/StringBuilder;)I
    .locals 9

    invoke-interface {p2}, Ldg/d;->i()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p2}, Ldg/d;->h()I

    move-result v5

    invoke-interface {p2}, Ldg/d;->f()Lbg/d$i$b;

    move-result-object p1

    iget-object v1, p1, Lbg/d$i$b;->a:Ljava/lang/String;

    invoke-interface {p2}, Ldg/d;->b()Z

    move-result v6

    move-object v0, p0

    move v2, p3

    move v3, p4

    move v7, p5

    move-object v8, p6

    invoke-virtual/range {v0 .. v8}, Lag/b;->q1(Ljava/lang/String;IILjava/lang/String;IZZLjava/lang/StringBuilder;)I

    move-result p1

    return p1
.end method

.method protected p1(ILdg/d;Ljava/lang/StringBuilder;)I
    .locals 13

    move-object v7, p0

    move-object/from16 v6, p3

    invoke-interface {p2}, Ldg/d;->c()Z

    move-result v0

    invoke-interface {p2}, Ldg/d;->h()I

    move-result v1

    move v2, p1

    move-object v3, p2

    invoke-interface {p2, p1}, Ldg/d;->k(I)I

    move-result v4

    invoke-interface {p2}, Ldg/d;->f()Lbg/d$i$b;

    move-result-object v5

    iget-object v8, v5, Lbg/d$i$b;->a:Ljava/lang/String;

    iget-object v5, v5, Lbg/d$i$b;->c:Ljava/lang/String;

    const/4 v9, 0x0

    if-nez v5, :cond_0

    move v5, v9

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v1}, Lag/b;->m1(I)I

    move-result v5

    :goto_0
    invoke-virtual {p0, v4, v1}, Lag/b;->J(II)I

    move-result v10

    invoke-virtual {p0, v4, v1}, Lag/b;->b0(II)I

    move-result v11

    if-nez v5, :cond_9

    invoke-virtual {p0}, Lag/b;->b1()I

    move-result v12

    if-ne v1, v12, :cond_9

    if-nez v0, :cond_9

    invoke-interface {p0}, Lag/g;->w()Z

    move-result v12

    if-nez v12, :cond_9

    invoke-virtual {p0}, Lag/b;->E1()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lag/b;->Z0()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2}, Ldg/d;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v10, :cond_2

    if-nez v11, :cond_2

    if-nez v3, :cond_2

    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    if-nez v6, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    return v0

    :cond_1
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return v9

    :cond_2
    if-nez v6, :cond_4

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v2, v1

    add-int/2addr v0, v2

    add-int/2addr v0, v10

    add-int/2addr v0, v11

    if-lez v3, :cond_3

    shl-int/lit8 v1, v3, 0x1

    add-int/2addr v0, v1

    :cond_3
    return v0

    :cond_4
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    if-lez v3, :cond_5

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    if-lez v10, :cond_6

    invoke-static {v10, v6}, Lag/b;->g1(ILjava/lang/StringBuilder;)V

    :cond_6
    invoke-virtual {v0, v9, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-lez v3, :cond_7

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7
    if-lez v11, :cond_8

    invoke-static {v11, v6}, Lag/b;->g1(ILjava/lang/StringBuilder;)V

    :cond_8
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v4, v1

    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return v9

    :cond_9
    if-nez v0, :cond_d

    if-gez v4, :cond_d

    if-nez v6, :cond_d

    invoke-interface {p2}, Ldg/d;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-interface {p0, v1}, Lcg/a;->s(I)I

    move-result v1

    if-eqz v5, :cond_b

    if-lez v0, :cond_a

    add-int/2addr v1, v0

    :cond_a
    return v1

    :cond_b
    shl-int/lit8 v1, v1, 0x1

    if-lez v0, :cond_c

    shl-int/lit8 v0, v0, 0x1

    add-int/2addr v1, v0

    :cond_c
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v1, v0

    return v1

    :cond_d
    invoke-virtual {p0, v5}, Lag/b;->T(I)I

    move-result v1

    if-eqz v1, :cond_f

    if-eqz v0, :cond_e

    invoke-virtual/range {p0 .. p3}, Lag/b;->v1(ILdg/d;Ljava/lang/StringBuilder;)I

    move-result v0

    return v0

    :cond_e
    invoke-virtual/range {p0 .. p3}, Lag/b;->n1(ILdg/d;Ljava/lang/StringBuilder;)I

    move-result v0

    return v0

    :cond_f
    if-eqz v0, :cond_10

    invoke-virtual/range {p0 .. p3}, Lag/b;->w1(ILdg/d;Ljava/lang/StringBuilder;)I

    move-result v0

    return v0

    :cond_10
    const/4 v5, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move v3, v10

    move v4, v11

    move-object/from16 v6, p3

    invoke-virtual/range {v0 .. v6}, Lag/b;->o1(ILdg/d;IIZLjava/lang/StringBuilder;)I

    move-result v0

    return v0
.end method

.method protected q1(Ljava/lang/String;IILjava/lang/String;IZZLjava/lang/StringBuilder;)I
    .locals 4

    const/4 v0, 0x2

    if-lt p5, v0, :cond_8

    const/16 v0, 0x55

    if-gt p5, v0, :cond_8

    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-lez v0, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    if-nez p8, :cond_2

    add-int/2addr p2, p3

    invoke-virtual {p0, p5}, Lag/b;->j1(I)I

    move-result p3

    add-int/2addr p2, p3

    invoke-virtual {p0, p5}, Lag/b;->C1(I)I

    move-result p3

    add-int/2addr p2, p3

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr p2, p1

    if-eqz v3, :cond_1

    shl-int/lit8 p1, v0, 0x1

    add-int/2addr p2, p1

    :cond_1
    return p2

    :cond_2
    if-eqz v3, :cond_3

    invoke-virtual {p8, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    if-lez p2, :cond_4

    invoke-static {p2, p8}, Lag/b;->g1(ILjava/lang/StringBuilder;)V

    :cond_4
    invoke-virtual {p0, p5, p6, p8}, Lag/b;->i1(IZLjava/lang/StringBuilder;)V

    invoke-virtual {p8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v3, :cond_5

    invoke-virtual {p8, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    if-lez p3, :cond_6

    invoke-static {p3, p8}, Lag/b;->g1(ILjava/lang/StringBuilder;)V

    :cond_6
    if-eqz p7, :cond_7

    invoke-virtual {p0, p5, p6, p8}, Lag/b;->D1(IZLjava/lang/StringBuilder;)V

    goto :goto_1

    :cond_7
    invoke-virtual {p0, p5, p6, p8}, Lag/b;->B1(IZLjava/lang/StringBuilder;)V

    :goto_1
    return v1

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lag/b;->b1()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_2

    const/16 v1, 0xa

    if-eq v0, v1, :cond_1

    const/16 v1, 0x10

    if-eq v0, v1, :cond_0

    new-instance v1, Linet/ipaddr/j$c$a;

    invoke-direct {v1, v0}, Linet/ipaddr/j$c$a;-><init>(I)V

    new-instance v0, Lbg/d$i$b;

    sget-object v2, Linet/ipaddr/a;->c:Ljava/lang/String;

    invoke-direct {v0, v2}, Lbg/d$i$b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Linet/ipaddr/j$c$a;->s(Lbg/d$i$b;)Linet/ipaddr/j$c$a;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/j$c$a;->u()Linet/ipaddr/j$c;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Lag/b;->e:Linet/ipaddr/j$c;

    goto :goto_0

    :cond_1
    sget-object v0, Lag/b;->f:Linet/ipaddr/j$c;

    goto :goto_0

    :cond_2
    sget-object v0, Lag/b;->d:Linet/ipaddr/j$c;

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x22

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-static {v0}, Lag/b;->G1(Linet/ipaddr/j$c;)Lag/d$b;

    move-result-object v0

    invoke-virtual {v0, p0, v1}, Lag/d$b;->p(Lcg/a;Ljava/lang/StringBuilder;)I

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected abstract u1(IIZCZLjava/lang/String;Ljava/lang/StringBuilder;)V
.end method

.method public v(ILdg/d;Ljava/lang/StringBuilder;)I
    .locals 3

    invoke-interface {p2}, Ldg/d;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_1

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    move v1, v2

    :goto_0
    invoke-interface {p2}, Ldg/d;->h()I

    move-result v0

    invoke-interface {p2, p1}, Ldg/d;->k(I)I

    move-result p1

    if-eqz p1, :cond_4

    if-nez p3, :cond_3

    if-gez p1, :cond_2

    invoke-interface {p0, v0}, Lcg/a;->s(I)I

    move-result p1

    :goto_1
    add-int/2addr v1, p1

    return v1

    :cond_2
    add-int/2addr v1, p1

    goto :goto_2

    :cond_3
    invoke-virtual {p0, p1, v0}, Lag/b;->J(II)I

    move-result p1

    invoke-static {p1, p3}, Lag/b;->g1(ILjava/lang/StringBuilder;)V

    :cond_4
    :goto_2
    invoke-interface {p2}, Ldg/d;->b()Z

    move-result p1

    invoke-virtual {p0}, Lag/b;->b1()I

    move-result p2

    if-ne v0, p2, :cond_7

    invoke-virtual {p0}, Lag/b;->Y0()Ljava/lang/String;

    move-result-object p2

    if-nez p3, :cond_5

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    goto :goto_1

    :cond_5
    if-eqz p1, :cond_6

    invoke-virtual {p0, p2, v0, p3}, Lag/b;->K0(Ljava/lang/CharSequence;ILjava/lang/StringBuilder;)V

    goto :goto_3

    :cond_6
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_7
    if-nez p3, :cond_8

    invoke-virtual {p0, v0}, Lag/b;->j1(I)I

    move-result p1

    goto :goto_1

    :cond_8
    invoke-virtual {p0, v0, p1, p3}, Lag/b;->i1(IZLjava/lang/StringBuilder;)V

    :goto_3
    return v2
.end method

.method protected v1(ILdg/d;Ljava/lang/StringBuilder;)I
    .locals 16

    move-object/from16 v8, p0

    move-object/from16 v9, p3

    invoke-interface/range {p2 .. p2}, Ldg/d;->h()I

    move-result v1

    move/from16 v0, p1

    move-object/from16 v2, p2

    invoke-interface {v2, v0}, Ldg/d;->k(I)I

    move-result v0

    invoke-virtual {v8, v0, v1}, Lag/b;->J(II)I

    move-result v10

    invoke-interface/range {p2 .. p2}, Ldg/d;->i()Ljava/lang/String;

    move-result-object v11

    if-nez v9, :cond_1

    invoke-virtual {v8, v1}, Lag/b;->j1(I)I

    move-result v0

    add-int/2addr v0, v10

    shl-int/lit8 v1, v0, 0x1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_0

    mul-int/2addr v0, v2

    add-int/2addr v1, v0

    :cond_0
    return v1

    :cond_1
    invoke-interface/range {p2 .. p2}, Ldg/d;->f()Lbg/d$i$b;

    move-result-object v12

    invoke-virtual {v8, v1}, Lag/b;->m1(I)I

    move-result v0

    invoke-virtual {v8, v0}, Lag/b;->T(I)I

    move-result v13

    invoke-interface/range {p2 .. p2}, Ldg/d;->d()Ljava/lang/Character;

    move-result-object v0

    const/4 v14, 0x0

    if-nez v0, :cond_2

    move v15, v14

    goto :goto_0

    :cond_2
    invoke-interface/range {p2 .. p2}, Ldg/d;->d()Ljava/lang/Character;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    move-result v0

    move v15, v0

    :goto_0
    invoke-interface/range {p2 .. p2}, Ldg/d;->e()Z

    move-result v5

    invoke-interface/range {p2 .. p2}, Ldg/d;->b()Z

    move-result v3

    if-eqz v5, :cond_3

    iget-object v0, v12, Lbg/d$i$b;->c:Ljava/lang/String;

    invoke-static {v13, v15, v0, v11, v9}, Lag/b;->s1(ICLjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-object/from16 v0, p0

    move v2, v13

    move v4, v15

    move-object v6, v11

    move-object/from16 v7, p3

    invoke-virtual/range {v0 .. v7}, Lag/b;->u1(IIZCZLjava/lang/String;Ljava/lang/StringBuilder;)V

    if-lez v10, :cond_5

    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {v10, v15, v11, v9}, Lag/b;->t1(ICLjava/lang/String;Ljava/lang/StringBuilder;)V

    goto :goto_1

    :cond_3
    if-eqz v10, :cond_4

    invoke-static {v10, v15, v11, v9}, Lag/b;->t1(ICLjava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_4
    move-object/from16 v0, p0

    move v2, v13

    move v4, v15

    move-object v6, v11

    move-object/from16 v7, p3

    invoke-virtual/range {v0 .. v7}, Lag/b;->u1(IIZCZLjava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v0, v12, Lbg/d$i$b;->c:Ljava/lang/String;

    invoke-static {v13, v15, v0, v11, v9}, Lag/b;->s1(ICLjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    :cond_5
    :goto_1
    return v14
.end method

.method protected w1(ILdg/d;Ljava/lang/StringBuilder;)I
    .locals 16

    move-object/from16 v9, p3

    invoke-interface/range {p2 .. p2}, Ldg/d;->i()Ljava/lang/String;

    move-result-object v10

    invoke-interface/range {p2 .. p2}, Ldg/d;->h()I

    move-result v4

    move/from16 v0, p1

    move-object/from16 v1, p2

    invoke-interface {v1, v0}, Ldg/d;->k(I)I

    move-result v0

    move-object/from16 v11, p0

    invoke-virtual {v11, v0, v4}, Lag/b;->b0(II)I

    move-result v12

    invoke-interface/range {p2 .. p2}, Ldg/d;->f()Lbg/d$i$b;

    move-result-object v0

    invoke-interface/range {p2 .. p2}, Ldg/d;->b()Z

    move-result v5

    invoke-interface/range {p2 .. p2}, Ldg/d;->d()Ljava/lang/Character;

    move-result-object v2

    const/4 v13, 0x0

    if-nez v2, :cond_0

    move v14, v13

    goto :goto_0

    :cond_0
    invoke-interface/range {p2 .. p2}, Ldg/d;->d()Ljava/lang/Character;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Character;->charValue()C

    move-result v2

    move v14, v2

    :goto_0
    invoke-interface/range {p2 .. p2}, Ldg/d;->e()Z

    move-result v7

    iget-object v1, v0, Lbg/d$i$b;->a:Ljava/lang/String;

    if-nez v9, :cond_1

    iget-object v2, v0, Lbg/d$i$b;->b:Ljava/lang/String;

    move-object/from16 v0, p0

    move v3, v12

    move v6, v14

    move-object v8, v10

    invoke-virtual/range {v0 .. v8}, Lag/b;->y1(Ljava/lang/String;Ljava/lang/String;IIZCZLjava/lang/String;)I

    move-result v0

    return v0

    :cond_1
    if-eqz v12, :cond_2

    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    move v2, v13

    :goto_1
    if-eqz v2, :cond_3

    if-nez v7, :cond_3

    invoke-static {v12, v14, v10, v9}, Lag/b;->t1(ICLjava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move v15, v13

    goto :goto_2

    :cond_3
    move v15, v2

    :goto_2
    iget-object v2, v0, Lbg/d$i$b;->b:Ljava/lang/String;

    move-object/from16 v0, p0

    move v3, v4

    move v4, v5

    move v5, v14

    move v6, v7

    move-object v7, v10

    move-object/from16 v8, p3

    invoke-virtual/range {v0 .. v8}, Lag/b;->x1(Ljava/lang/String;Ljava/lang/String;IZCZLjava/lang/String;Ljava/lang/StringBuilder;)V

    if-eqz v15, :cond_4

    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {v12, v14, v10, v9}, Lag/b;->t1(ICLjava/lang/String;Ljava/lang/StringBuilder;)V

    :cond_4
    return v13
.end method

.method protected abstract x1(Ljava/lang/String;Ljava/lang/String;IZCZLjava/lang/String;Ljava/lang/StringBuilder;)V
.end method

.method protected y(ILdg/d;Ljava/lang/StringBuilder;)I
    .locals 9

    invoke-interface {p2, p1}, Ldg/d;->k(I)I

    move-result v0

    invoke-interface {p2}, Ldg/d;->h()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lag/b;->J(II)I

    move-result v5

    invoke-virtual {p0, v0, v1}, Lag/b;->b0(II)I

    move-result v6

    invoke-interface {p2}, Ldg/d;->f()Lbg/d$i$b;

    move-result-object v2

    iget-object v3, v2, Lbg/d$i$b;->a:Ljava/lang/String;

    iget-object v2, v2, Lbg/d$i$b;->c:Ljava/lang/String;

    const/4 v4, 0x0

    if-nez v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v1}, Lag/b;->m1(I)I

    move-result v2

    :goto_0
    if-nez v2, :cond_a

    invoke-virtual {p0}, Lag/b;->b1()I

    move-result v7

    if-ne v1, v7, :cond_a

    invoke-interface {p0}, Lag/g;->w()Z

    move-result v7

    if-nez v7, :cond_a

    invoke-virtual {p0}, Lag/b;->z1()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lag/b;->Z0()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2}, Ldg/d;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v5, :cond_3

    if-nez v6, :cond_3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    if-nez v7, :cond_3

    if-nez p3, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    return p1

    :cond_1
    invoke-interface {p2}, Ldg/d;->b()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p0, p1, v1, p3}, Lag/b;->K0(Ljava/lang/CharSequence;ILjava/lang/StringBuilder;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    return v4

    :cond_3
    if-nez p3, :cond_5

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result p2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p3

    sub-int/2addr p2, p3

    add-int/2addr p1, p2

    add-int/2addr p1, v5

    add-int/2addr p1, v6

    if-lez v7, :cond_4

    shl-int/lit8 p2, v7, 0x1

    add-int/2addr p1, p2

    :cond_4
    return p1

    :cond_5
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p2

    if-lez v7, :cond_6

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    if-lez v5, :cond_7

    invoke-static {v5, p3}, Lag/b;->g1(ILjava/lang/StringBuilder;)V

    :cond_7
    invoke-virtual {p1, v4, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-lez v7, :cond_8

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_8
    if-lez v6, :cond_9

    invoke-static {v6, p3}, Lag/b;->g1(ILjava/lang/StringBuilder;)V

    :cond_9
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr p2, v0

    invoke-virtual {p1, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return v4

    :cond_a
    invoke-virtual {p0, v2}, Lag/b;->T(I)I

    move-result v2

    if-gez v0, :cond_e

    if-nez p3, :cond_e

    invoke-interface {p0, v1}, Lcg/a;->s(I)I

    move-result p1

    invoke-interface {p2}, Ldg/d;->i()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    if-eqz v2, :cond_c

    if-lez p2, :cond_b

    add-int/2addr p1, p2

    :cond_b
    return p1

    :cond_c
    shl-int/lit8 p1, p1, 0x1

    if-lez p2, :cond_d

    shl-int/lit8 p2, p2, 0x1

    add-int/2addr p1, p2

    :cond_d
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result p2

    add-int/2addr p1, p2

    return p1

    :cond_e
    if-eqz v2, :cond_f

    invoke-virtual {p0, p1, p2, p3}, Lag/b;->n1(ILdg/d;Ljava/lang/StringBuilder;)I

    move-result p1

    return p1

    :cond_f
    const/4 v7, 0x1

    move-object v2, p0

    move v3, p1

    move-object v4, p2

    move-object v8, p3

    invoke-virtual/range {v2 .. v8}, Lag/b;->o1(ILdg/d;IIZLjava/lang/StringBuilder;)I

    move-result p1

    return p1
.end method

.method protected abstract y1(Ljava/lang/String;Ljava/lang/String;IIZCZLjava/lang/String;)I
.end method

.method protected abstract z1()Ljava/lang/String;
.end method
