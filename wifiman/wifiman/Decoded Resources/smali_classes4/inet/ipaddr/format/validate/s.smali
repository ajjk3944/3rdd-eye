.class public Linet/ipaddr/format/validate/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Linet/ipaddr/format/validate/b;


# static fields
.field private static final b:[I

.field private static final c:[I

.field private static final d:C

.field private static final e:[I

.field private static final f:[Linet/ipaddr/format/validate/i;

.field static final g:[[Linet/ipaddr/format/validate/d$j;

.field private static final h:Linet/ipaddr/format/validate/d$i;

.field private static final i:Linet/ipaddr/format/validate/h;

.field public static final j:Linet/ipaddr/format/validate/b;

.field private static final k:Linet/ipaddr/o;

.field private static final l:Linet/ipaddr/o;

.field private static final m:Linet/ipaddr/o;

.field private static final n:[Ljava/math/BigInteger;

.field private static final o:Ljava/math/BigInteger;

.field private static final p:[J

.field private static final q:[[I


# direct methods
.method static constructor <clinit>()V
    .locals 18

    const/4 v0, 0x5

    const/4 v1, 0x1

    const/16 v2, 0x80

    new-array v3, v2, [I

    sput-object v3, Linet/ipaddr/format/validate/s;->b:[I

    sget-object v3, Lag/b;->i:[C

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    array-length v6, v3

    if-ge v5, v6, :cond_0

    sget-object v6, Linet/ipaddr/format/validate/s;->b:[I

    aget-char v7, v3, v5

    aput v5, v6, v7

    add-int/2addr v5, v1

    goto :goto_0

    :cond_0
    new-array v2, v2, [I

    sput-object v2, Linet/ipaddr/format/validate/s;->c:[I

    const/16 v3, 0x30

    move v5, v4

    :goto_1
    const/16 v6, 0xa

    if-ge v5, v6, :cond_1

    aput v5, v2, v3

    add-int/2addr v5, v1

    add-int/2addr v3, v1

    int-to-char v3, v3

    goto :goto_1

    :cond_1
    const/16 v3, 0x61

    const/16 v7, 0x41

    :goto_2
    const/16 v8, 0x1a

    if-ge v5, v8, :cond_2

    aput v5, v2, v7

    aput v5, v2, v3

    add-int/2addr v5, v1

    add-int/2addr v3, v1

    int-to-char v3, v3

    add-int/2addr v7, v1

    int-to-char v7, v7

    goto :goto_2

    :cond_2
    const/16 v2, 0x76

    invoke-static {v2}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v2

    sput-char v2, Linet/ipaddr/format/validate/s;->d:C

    new-array v2, v4, [I

    sput-object v2, Linet/ipaddr/format/validate/s;->e:[I

    const/16 v3, 0x81

    new-array v3, v3, [Linet/ipaddr/format/validate/i;

    sput-object v3, Linet/ipaddr/format/validate/s;->f:[Linet/ipaddr/format/validate/i;

    const/4 v3, 0x3

    new-array v5, v3, [[Linet/ipaddr/format/validate/d$j;

    sput-object v5, Linet/ipaddr/format/validate/s;->g:[[Linet/ipaddr/format/validate/d$j;

    new-instance v5, Linet/ipaddr/format/validate/d$i;

    sget-object v7, Linet/ipaddr/n;->e:Linet/ipaddr/o;

    invoke-direct {v5, v7}, Linet/ipaddr/format/validate/d$i;-><init>(Linet/ipaddr/o;)V

    sput-object v5, Linet/ipaddr/format/validate/s;->h:Linet/ipaddr/format/validate/d$i;

    new-instance v5, Linet/ipaddr/format/validate/h;

    const/4 v7, 0x0

    sget-object v8, Linet/ipaddr/format/validate/h;->j:Linet/ipaddr/format/validate/i;

    const-string v9, ""

    invoke-direct {v5, v9, v2, v7, v8}, Linet/ipaddr/format/validate/h;-><init>(Ljava/lang/String;[I[ZLinet/ipaddr/format/validate/i;)V

    sput-object v5, Linet/ipaddr/format/validate/s;->i:Linet/ipaddr/format/validate/h;

    new-instance v2, Linet/ipaddr/format/validate/s;

    invoke-direct {v2}, Linet/ipaddr/format/validate/s;-><init>()V

    sput-object v2, Linet/ipaddr/format/validate/s;->j:Linet/ipaddr/format/validate/b;

    new-instance v2, Linet/ipaddr/o$a;

    invoke-direct {v2}, Linet/ipaddr/o$a;-><init>()V

    invoke-virtual {v2, v4}, Linet/ipaddr/o$a;->l(Z)Linet/ipaddr/o$a;

    move-result-object v2

    invoke-virtual {v2, v4}, Linet/ipaddr/o$a;->k(Z)Linet/ipaddr/o$a;

    move-result-object v2

    invoke-virtual {v2, v4}, Linet/ipaddr/o$a;->n(Z)Linet/ipaddr/o$a;

    move-result-object v2

    invoke-virtual {v2, v4}, Linet/ipaddr/o$a;->p(Z)Linet/ipaddr/o$a;

    move-result-object v2

    invoke-virtual {v2, v4}, Linet/ipaddr/o$a;->o(Z)Linet/ipaddr/o$a;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/o$a;->v()Linet/ipaddr/o;

    move-result-object v2

    sput-object v2, Linet/ipaddr/format/validate/s;->k:Linet/ipaddr/o;

    new-instance v2, Linet/ipaddr/o$a;

    invoke-direct {v2}, Linet/ipaddr/o$a;-><init>()V

    invoke-virtual {v2, v4}, Linet/ipaddr/o$a;->m(Z)Linet/ipaddr/o$a;

    move-result-object v2

    invoke-virtual {v2, v4}, Linet/ipaddr/o$a;->k(Z)Linet/ipaddr/o$a;

    move-result-object v2

    invoke-virtual {v2, v4}, Linet/ipaddr/o$a;->n(Z)Linet/ipaddr/o$a;

    move-result-object v2

    invoke-virtual {v2, v4}, Linet/ipaddr/o$a;->p(Z)Linet/ipaddr/o$a;

    move-result-object v2

    invoke-virtual {v2, v4}, Linet/ipaddr/o$a;->o(Z)Linet/ipaddr/o$a;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/o$a;->t()Linet/ipaddr/ipv4/Z$a;

    move-result-object v2

    invoke-virtual {v2, v4}, Linet/ipaddr/ipv4/Z$a;->p(Z)Linet/ipaddr/ipv4/Z$a;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/ipv4/Z$a;->f()Linet/ipaddr/o$a;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/o$a;->v()Linet/ipaddr/o;

    move-result-object v2

    sput-object v2, Linet/ipaddr/format/validate/s;->l:Linet/ipaddr/o;

    new-instance v2, Linet/ipaddr/o$a;

    invoke-direct {v2}, Linet/ipaddr/o$a;-><init>()V

    invoke-virtual {v2, v4}, Linet/ipaddr/o$a;->l(Z)Linet/ipaddr/o$a;

    move-result-object v2

    invoke-virtual {v2, v4}, Linet/ipaddr/o$a;->k(Z)Linet/ipaddr/o$a;

    move-result-object v2

    invoke-virtual {v2, v4}, Linet/ipaddr/o$a;->n(Z)Linet/ipaddr/o$a;

    move-result-object v2

    invoke-virtual {v2, v4}, Linet/ipaddr/o$a;->p(Z)Linet/ipaddr/o$a;

    move-result-object v2

    invoke-virtual {v2, v4}, Linet/ipaddr/o$a;->o(Z)Linet/ipaddr/o$a;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/o$a;->u()Linet/ipaddr/ipv6/j0$a;

    move-result-object v2

    invoke-virtual {v2, v4}, Linet/ipaddr/ipv6/j0$a;->p(Z)Linet/ipaddr/ipv6/j0$a;

    move-result-object v2

    invoke-virtual {v2, v4}, Linet/ipaddr/ipv6/j0$a;->r(Z)Linet/ipaddr/ipv6/j0$a;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/ipv6/j0$a;->f()Linet/ipaddr/o$a;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/o$a;->v()Linet/ipaddr/o;

    move-result-object v2

    sput-object v2, Linet/ipaddr/format/validate/s;->m:Linet/ipaddr/o;

    new-array v2, v6, [Ljava/math/BigInteger;

    sput-object v2, Linet/ipaddr/format/validate/s;->n:[Ljava/math/BigInteger;

    const-wide/16 v7, -0x1

    invoke-static {v7, v8}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v5

    sput-object v5, Linet/ipaddr/format/validate/s;->o:Ljava/math/BigInteger;

    new-array v5, v0, [J

    fill-array-data v5, :array_0

    sput-object v5, Linet/ipaddr/format/validate/s;->p:[J

    const/4 v5, 0x6

    const/16 v7, 0x8

    const/16 v8, 0xb

    filled-new-array {v3, v5, v7, v8}, [I

    move-result-object v9

    const/16 v10, 0x18

    const/16 v11, 0x20

    const/16 v12, 0x10

    filled-new-array {v7, v12, v10, v11}, [I

    move-result-object v10

    new-array v11, v4, [I

    new-array v12, v4, [I

    filled-new-array {v3, v5, v7, v8}, [I

    move-result-object v13

    filled-new-array {v3, v0, v7, v6}, [I

    move-result-object v14

    new-array v15, v4, [I

    new-array v0, v4, [I

    const/4 v3, 0x2

    const/4 v6, 0x4

    filled-new-array {v3, v6, v5, v7}, [I

    move-result-object v17

    move-object/from16 v16, v0

    filled-new-array/range {v9 .. v17}, [[I

    move-result-object v0

    sput-object v0, Linet/ipaddr/format/validate/s;->q:[[I

    const-wide/16 v5, 0x55

    invoke-static {v5, v6}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sget-object v3, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    aput-object v3, v2, v4

    move v2, v1

    :goto_3
    sget-object v3, Linet/ipaddr/format/validate/s;->n:[Ljava/math/BigInteger;

    array-length v4, v3

    if-ge v2, v4, :cond_3

    add-int/lit8 v4, v2, -0x1

    aget-object v4, v3, v4

    invoke-virtual {v4, v0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v4

    aput-object v4, v3, v2

    add-int/2addr v2, v1

    goto :goto_3

    :cond_3
    return-void

    nop

    :array_0
    .array-data 8
        0x0
        0xff
        0xffff
        0xffffff
        0xffffffffL
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static A(Ljava/lang/CharSequence;Linet/ipaddr/o;Linet/ipaddr/f;Linet/ipaddr/format/validate/c;I)Linet/ipaddr/format/validate/i;
    .locals 8

    invoke-virtual {p3}, Linet/ipaddr/format/validate/c;->W0()I

    move-result v5

    invoke-virtual {p3}, Linet/ipaddr/format/validate/c;->U0()Linet/ipaddr/format/validate/a;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/format/validate/a;->y0()Z

    move-result v4

    invoke-virtual {p3}, Linet/ipaddr/format/validate/c;->o0()Linet/ipaddr/g$a;

    move-result-object v7

    invoke-virtual {p3}, Linet/ipaddr/format/validate/c;->X0()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move v6, p4

    invoke-static/range {v0 .. v7}, Linet/ipaddr/format/validate/s;->J(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Linet/ipaddr/o;Linet/ipaddr/f;ZIILinet/ipaddr/g$a;)Linet/ipaddr/format/validate/i;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p3}, Linet/ipaddr/format/validate/c;->h1()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-virtual {p3}, Linet/ipaddr/format/validate/c;->Z0()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p3}, Linet/ipaddr/format/validate/c;->d1()Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Linet/ipaddr/AddressStringException;

    add-int/lit8 v5, v5, -0x1

    invoke-direct {p1, p0, v5}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;I)V

    throw p1

    :cond_2
    :goto_0
    if-nez v4, :cond_3

    move-object v0, p0

    move-object v1, p1

    move v2, v4

    move v3, v5

    move v4, p4

    move-object v5, v7

    invoke-static/range {v0 .. v5}, Linet/ipaddr/format/validate/s;->N(Ljava/lang/CharSequence;Linet/ipaddr/o;ZIILinet/ipaddr/g$a;)Linet/ipaddr/format/validate/i;

    move-result-object p0

    return-object p0

    :cond_3
    new-instance p1, Linet/ipaddr/AddressStringException;

    const-string p2, "ipaddress.error.only.zone"

    invoke-direct {p1, p0, p2}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw p1

    :cond_4
    sget-object p0, Linet/ipaddr/format/validate/h;->j:Linet/ipaddr/format/validate/i;

    return-object p0
.end method

.method private static B(Ljava/lang/CharSequence;II)Ljava/math/BigInteger;
    .locals 11

    sget-object v0, Linet/ipaddr/format/validate/s;->b:[I

    sget-object v1, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    :goto_0
    sub-int v2, p2, p1

    const/4 v3, 0x1

    const/16 v4, 0x9

    if-gt v2, v4, :cond_0

    move v5, v3

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    :goto_1
    if-eqz v5, :cond_1

    move v4, v2

    move v2, p2

    goto :goto_2

    :cond_1
    add-int/lit8 v2, p1, 0x9

    :goto_2
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    aget v6, v0, v6

    int-to-long v6, v6

    :goto_3
    add-int/2addr p1, v3

    if-ge p1, v2, :cond_2

    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    aget v8, v0, v8

    const-wide/16 v9, 0x55

    mul-long/2addr v6, v9

    int-to-long v8, v8

    add-long/2addr v6, v8

    goto :goto_3

    :cond_2
    sget-object p1, Linet/ipaddr/format/validate/s;->n:[Ljava/math/BigInteger;

    aget-object p1, p1, v4

    invoke-virtual {v1, p1}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p1

    invoke-static {v6, v7}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    if-eqz v5, :cond_3

    return-object v1

    :cond_3
    move p1, v2

    goto :goto_0
.end method

.method private static C(Linet/ipaddr/o;Ljava/lang/CharSequence;IILinet/ipaddr/format/validate/c;III)Z
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move-object/from16 v10, p4

    move/from16 v4, p5

    move/from16 v5, p6

    move/from16 v6, p7

    invoke-virtual/range {p4 .. p4}, Linet/ipaddr/format/validate/c;->U0()Linet/ipaddr/format/validate/a;

    move-result-object v7

    const-string v8, "ipaddress.error.ipv6"

    const/4 v9, 0x0

    const-string v11, "ipaddress.error.address.too.large"

    const/16 v12, 0x40

    const/4 v15, 0x1

    if-gez v4, :cond_2

    const/16 v4, 0x14

    if-ne v5, v4, :cond_3

    iget-boolean v0, v0, Linet/ipaddr/o;->h:Z

    if-eqz v0, :cond_1

    sget-object v0, Linet/ipaddr/g$a;->IPV6:Linet/ipaddr/g$a;

    invoke-virtual {v10, v0}, Linet/ipaddr/format/validate/c;->s1(Linet/ipaddr/g$a;)V

    invoke-static/range {p1 .. p3}, Linet/ipaddr/format/validate/s;->B(Ljava/lang/CharSequence;II)Ljava/math/BigInteger;

    move-result-object v0

    sget-object v4, Linet/ipaddr/format/validate/s;->o:Ljava/math/BigInteger;

    invoke-virtual {v0, v4}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v4}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v5

    invoke-virtual {v0, v12}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v8

    invoke-virtual {v0, v12}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    move-result-object v0

    sget-object v4, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    invoke-virtual {v0, v4}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v7, v15}, Linet/ipaddr/format/validate/a;->t(I)V

    invoke-virtual {v7}, Linet/ipaddr/format/validate/a;->s()V

    const/4 v4, 0x0

    const/16 v11, 0x55

    move/from16 v0, p2

    move/from16 v1, p3

    move/from16 v2, p2

    move-object v3, v7

    move-wide v7, v8

    move v9, v11

    invoke-static/range {v0 .. v9}, Linet/ipaddr/format/validate/s;->e(IIILinet/ipaddr/format/validate/a;IJJI)V

    invoke-virtual {v10, v15}, Linet/ipaddr/format/validate/c;->k1(Z)V

    return v15

    :cond_0
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v1, v11}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v1, v8}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0

    :cond_2
    const/16 v13, 0x29

    if-eq v5, v13, :cond_4

    const/16 v13, 0x15

    if-ne v5, v13, :cond_3

    if-eqz v4, :cond_4

    add-int/lit8 v5, v4, 0x1

    if-ne v5, v3, :cond_3

    goto :goto_0

    :cond_3
    return v9

    :cond_4
    :goto_0
    iget-boolean v5, v0, Linet/ipaddr/o;->h:Z

    if-eqz v5, :cond_10

    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/o;->r()Linet/ipaddr/ipv6/j0;

    move-result-object v0

    iget-object v5, v0, Linet/ipaddr/d$a;->a:Linet/ipaddr/d$c;

    invoke-virtual {v5}, Linet/ipaddr/d$c;->d()Z

    move-result v5

    if-eqz v5, :cond_f

    sget-object v5, Linet/ipaddr/g$a;->IPV6:Linet/ipaddr/g$a;

    invoke-virtual {v10, v5}, Linet/ipaddr/format/validate/c;->s1(Linet/ipaddr/g$a;)V

    add-int/lit8 v5, v2, 0x14

    const-string v8, "ipaddress.error.empty.segment.at.index"

    if-ne v4, v5, :cond_b

    invoke-static {v1, v2, v4}, Linet/ipaddr/format/validate/s;->B(Ljava/lang/CharSequence;II)Ljava/math/BigInteger;

    move-result-object v5

    sget-object v13, Linet/ipaddr/format/validate/s;->o:Ljava/math/BigInteger;

    invoke-virtual {v5, v13}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v14

    invoke-virtual {v14}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v16

    invoke-virtual {v5, v12}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    move-result-object v14

    invoke-virtual {v14}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v18

    add-int/lit8 v14, v4, 0x1

    if-ge v14, v3, :cond_9

    invoke-static {v1, v14, v3}, Linet/ipaddr/format/validate/s;->B(Ljava/lang/CharSequence;II)Ljava/math/BigInteger;

    move-result-object v6

    invoke-virtual {v6, v13}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v8

    invoke-virtual {v8}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v20

    invoke-virtual {v6, v12}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    move-result-object v8

    invoke-virtual {v8}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v22

    invoke-virtual {v8, v12}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    move-result-object v13

    invoke-virtual {v5, v6}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v5

    if-lez v5, :cond_7

    invoke-virtual {v8, v12}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    move-result-object v5

    iget-object v0, v0, Linet/ipaddr/d$a;->a:Linet/ipaddr/d$c;

    invoke-virtual {v0}, Linet/ipaddr/d$c;->h()Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object v0, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    invoke-virtual {v5, v0}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_1

    :cond_5
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v1, v11}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Linet/ipaddr/AddressStringException;

    const-string v2, "ipaddress.error.invalidRange"

    invoke-direct {v0, v1, v2}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0

    :cond_7
    sget-object v0, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    invoke-virtual {v13, v0}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    move/from16 v29, v14

    move v14, v2

    move/from16 v2, v29

    move/from16 v30, v4

    move v4, v3

    move/from16 v3, v30

    :goto_1
    move/from16 v29, v4

    move v4, v3

    move/from16 v3, v29

    goto :goto_2

    :cond_8
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v1, v11}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0

    :cond_9
    iget-object v0, v0, Linet/ipaddr/d$a;->a:Linet/ipaddr/d$c;

    invoke-virtual {v0}, Linet/ipaddr/d$c;->c()Z

    move-result v0

    if-eqz v0, :cond_a

    const-wide/16 v20, -0x1

    const/high16 v9, 0x400000

    move v14, v2

    move v2, v3

    move-wide/from16 v22, v20

    :goto_2
    move v12, v4

    move v13, v14

    move-wide/from16 v25, v22

    move-wide/from16 v23, v20

    move-wide/from16 v21, v18

    move-wide/from16 v19, v16

    move/from16 v16, v2

    goto :goto_3

    :cond_a
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v1, v8, v6}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;I)V

    throw v0

    :cond_b
    if-nez v4, :cond_e

    iget-object v0, v0, Linet/ipaddr/d$a;->a:Linet/ipaddr/d$c;

    invoke-virtual {v0}, Linet/ipaddr/d$c;->c()Z

    move-result v0

    if-eqz v0, :cond_d

    add-int/lit8 v0, v4, 0x1

    invoke-static {v1, v0, v3}, Linet/ipaddr/format/validate/s;->B(Ljava/lang/CharSequence;II)Ljava/math/BigInteger;

    move-result-object v0

    sget-object v2, Linet/ipaddr/format/validate/s;->o:Ljava/math/BigInteger;

    invoke-virtual {v0, v2}, Ljava/math/BigInteger;->and(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v4

    invoke-virtual {v0, v12}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v13

    invoke-virtual {v0, v12}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    move-result-object v0

    sget-object v2, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    invoke-virtual {v0, v2}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    const-wide/16 v0, 0x0

    const/high16 v2, 0x200000

    move-wide/from16 v19, v0

    move-wide/from16 v21, v19

    move-wide/from16 v23, v4

    move v12, v9

    move-wide/from16 v25, v13

    move/from16 v16, v15

    move v13, v12

    move v9, v2

    :goto_3
    invoke-virtual {v7}, Linet/ipaddr/format/validate/a;->s()V

    invoke-virtual {v7, v15}, Linet/ipaddr/format/validate/a;->t(I)V

    const v0, 0x100055

    or-int v27, v9, v0

    const/16 v28, 0x55

    const/16 v18, 0x0

    move v11, v13

    move/from16 v14, v16

    move v0, v15

    move v15, v3

    move-object/from16 v17, v7

    invoke-static/range {v11 .. v28}, Linet/ipaddr/format/validate/s;->j(IIIIIILinet/ipaddr/format/validate/a;IJJJJII)V

    invoke-virtual {v10, v0}, Linet/ipaddr/format/validate/c;->k1(Z)V

    return v0

    :cond_c
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v1, v11}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0

    :cond_d
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v1, v8, v6}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;I)V

    throw v0

    :cond_e
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v1, v4}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;I)V

    throw v0

    :cond_f
    new-instance v0, Linet/ipaddr/AddressStringException;

    const-string v2, "ipaddress.error.no.range"

    invoke-direct {v0, v1, v2}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0

    :cond_10
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v1, v8}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0
.end method

.method private static D(Ljava/lang/CharSequence;Linet/ipaddr/o;ZIILinet/ipaddr/g$a;)Linet/ipaddr/format/validate/i;
    .locals 9

    const-string v2, "ipaddress.error.invalid.zone"

    if-ne p3, p4, :cond_1

    invoke-virtual {p1}, Linet/ipaddr/o;->r()Linet/ipaddr/ipv6/j0;

    move-result-object v3

    iget-boolean v3, v3, Linet/ipaddr/ipv6/j0;->k:Z

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance v3, Linet/ipaddr/AddressStringException;

    invoke-direct {v3, p0, v2, p3}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;I)V

    throw v3

    :cond_1
    :goto_0
    const/4 v3, 0x0

    move v4, p3

    :goto_1
    if-ge v4, p4, :cond_b

    invoke-interface {p0, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    const/16 v7, 0x25

    if-ne v5, v7, :cond_4

    add-int/lit8 v5, v4, 0x2

    if-ge v5, p4, :cond_3

    if-nez v3, :cond_2

    new-instance v3, Ljava/lang/StringBuilder;

    sub-int v5, p4, p3

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v3, p0, p3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    :cond_2
    sget-object v5, Linet/ipaddr/format/validate/s;->c:[I

    add-int/lit8 v7, v4, 0x1

    invoke-interface {p0, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    aget v7, v5, v7

    shl-int/lit8 v7, v7, 0x4

    int-to-char v7, v7

    add-int/lit8 v4, v4, 0x2

    invoke-interface {p0, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    aget v5, v5, v8

    or-int/2addr v5, v7

    int-to-char v5, v5

    goto :goto_4

    :cond_3
    new-instance v1, Linet/ipaddr/AddressStringException;

    const-string v2, "ipaddress.error.invalid.zone.encoding"

    invoke-direct {v1, p0, v2, v4}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;I)V

    throw v1

    :cond_4
    const/16 v7, 0x2f

    if-ne v5, v7, :cond_8

    if-ne v4, p3, :cond_6

    invoke-virtual {p1}, Linet/ipaddr/o;->r()Linet/ipaddr/ipv6/j0;

    move-result-object v5

    iget-boolean v5, v5, Linet/ipaddr/ipv6/j0;->k:Z

    if-eqz v5, :cond_5

    goto :goto_2

    :cond_5
    new-instance v3, Linet/ipaddr/AddressStringException;

    invoke-direct {v3, p0, v2, p3}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;I)V

    throw v3

    :cond_6
    :goto_2
    if-eqz v3, :cond_7

    move-object v1, v3

    goto :goto_3

    :cond_7
    invoke-interface {p0, p3, v4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v1

    :goto_3
    const/4 v3, 0x0

    add-int/lit8 v5, v4, 0x1

    move-object v0, p0

    move-object v2, p1

    move v4, p2

    move v6, p4

    move-object v7, p5

    invoke-static/range {v0 .. v7}, Linet/ipaddr/format/validate/s;->J(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Linet/ipaddr/o;Linet/ipaddr/f;ZIILinet/ipaddr/g$a;)Linet/ipaddr/format/validate/i;

    move-result-object v0

    return-object v0

    :cond_8
    invoke-static {v5}, Linet/ipaddr/format/validate/s;->x(C)Z

    move-result v7

    if-nez v7, :cond_a

    :goto_4
    if-eqz v3, :cond_9

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_9
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_a
    new-instance v1, Linet/ipaddr/AddressStringException;

    invoke-direct {v1, p0, v2, v4}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;I)V

    throw v1

    :cond_b
    if-nez v3, :cond_c

    new-instance v2, Linet/ipaddr/format/validate/i;

    invoke-interface {p0, p3, p4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-direct {v2, v0}, Linet/ipaddr/format/validate/i;-><init>(Ljava/lang/CharSequence;)V

    return-object v2

    :cond_c
    new-instance v0, Linet/ipaddr/format/validate/i;

    invoke-direct {v0, v3}, Linet/ipaddr/format/validate/i;-><init>(Ljava/lang/CharSequence;)V

    return-object v0
.end method

.method private static E(Ljava/lang/CharSequence;Linet/ipaddr/o;Linet/ipaddr/f;ZZLinet/ipaddr/format/validate/c;II)Linet/ipaddr/format/validate/i;
    .locals 8

    invoke-virtual {p5}, Linet/ipaddr/format/validate/c;->U0()Linet/ipaddr/format/validate/a;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/format/validate/a;->y0()Z

    move-result v4

    invoke-virtual {p5}, Linet/ipaddr/format/validate/c;->o0()Linet/ipaddr/g$a;

    move-result-object v7

    if-eqz p3, :cond_0

    const/4 v1, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move v5, p6

    move v6, p7

    invoke-static/range {v0 .. v7}, Linet/ipaddr/format/validate/s;->J(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Linet/ipaddr/o;Linet/ipaddr/f;ZIILinet/ipaddr/g$a;)Linet/ipaddr/format/validate/i;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p5}, Linet/ipaddr/format/validate/c;->h1()Z

    move-result v1

    if-eqz v1, :cond_2

    if-nez v4, :cond_1

    move-object v0, p0

    move-object v1, p1

    move v2, v4

    move v3, p6

    move v4, p7

    move-object v5, v7

    invoke-static/range {v0 .. v5}, Linet/ipaddr/format/validate/s;->D(Ljava/lang/CharSequence;Linet/ipaddr/o;ZIILinet/ipaddr/g$a;)Linet/ipaddr/format/validate/i;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v1, Linet/ipaddr/AddressStringException;

    const-string v2, "ipaddress.error.only.zone"

    invoke-direct {v1, p0, v2}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v1

    :cond_2
    if-eqz p4, :cond_3

    const/4 v1, 0x0

    invoke-static {p0, v1, p2, p6, p7}, Linet/ipaddr/format/validate/s;->I(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Linet/ipaddr/f;II)Linet/ipaddr/format/validate/i;

    move-result-object v0

    return-object v0

    :cond_3
    sget-object v0, Linet/ipaddr/format/validate/h;->j:Linet/ipaddr/format/validate/i;

    return-object v0
.end method

.method private static F(Ljava/lang/CharSequence;Linet/ipaddr/o;Linet/ipaddr/f;ZZZIILinet/ipaddr/g$a;)Linet/ipaddr/format/validate/i;
    .locals 8

    if-eqz p3, :cond_0

    const/4 v1, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p5

    move v5, p6

    move v6, p7

    move-object/from16 v7, p8

    invoke-static/range {v0 .. v7}, Linet/ipaddr/format/validate/s;->J(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Linet/ipaddr/o;Linet/ipaddr/f;ZIILinet/ipaddr/g$a;)Linet/ipaddr/format/validate/i;

    move-result-object v0

    return-object v0

    :cond_0
    if-eqz p4, :cond_1

    const/4 v0, 0x0

    move-object v1, p0

    move-object v2, p2

    move v3, p6

    move v4, p7

    invoke-static {p0, v0, p2, p6, p7}, Linet/ipaddr/format/validate/s;->I(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Linet/ipaddr/f;II)Linet/ipaddr/format/validate/i;

    move-result-object v0

    return-object v0

    :cond_1
    sget-object v0, Linet/ipaddr/format/validate/h;->j:Linet/ipaddr/format/validate/i;

    return-object v0
.end method

.method private static G(Ljava/lang/CharSequence;II)J
    .locals 5

    sget-object v0, Linet/ipaddr/format/validate/s;->c:[I

    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    aget v1, v0, v1

    int-to-long v1, v1

    :goto_0
    add-int/lit8 p1, p1, 0x1

    if-ge p1, p2, :cond_0

    const/4 v3, 0x4

    shl-long/2addr v1, v3

    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    aget v3, v0, v3

    int-to-long v3, v3

    or-long/2addr v1, v3

    goto :goto_0

    :cond_0
    return-wide v1
.end method

.method private static H(Ljava/lang/CharSequence;II)J
    .locals 5

    sget-object v0, Linet/ipaddr/format/validate/s;->c:[I

    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    aget v0, v0, v1

    int-to-long v0, v0

    :goto_0
    const/4 v2, 0x1

    add-int/2addr p1, v2

    if-ge p1, p2, :cond_1

    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    const/16 v4, 0x31

    if-ne v3, v4, :cond_0

    shl-long/2addr v0, v2

    const-wide/16 v2, 0x1

    or-long/2addr v0, v2

    goto :goto_0

    :cond_0
    shl-long/2addr v0, v2

    goto :goto_0

    :cond_1
    return-wide v0
.end method

.method private static I(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Linet/ipaddr/f;II)Linet/ipaddr/format/validate/i;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    sget-object v5, Linet/ipaddr/format/validate/s;->c:[I

    const/4 v8, -0x1

    move v9, v3

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    :goto_0
    if-ge v9, v4, :cond_13

    invoke-interface {v0, v9}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    const/16 v6, 0x31

    move/from16 v17, v15

    const/4 v15, 0x5

    if-lt v7, v6, :cond_2

    const/16 v6, 0x39

    if-gt v7, v6, :cond_2

    if-eqz v10, :cond_1

    add-int/lit8 v12, v12, 0x1

    if-le v12, v15, :cond_0

    :goto_1
    const/4 v10, 0x0

    goto :goto_2

    :cond_0
    mul-int/lit8 v13, v13, 0xa

    aget v6, v5, v7

    add-int/2addr v13, v6

    const/4 v11, 0x1

    :cond_1
    :goto_2
    add-int/lit8 v14, v14, 0x1

    move/from16 v15, v17

    const/4 v6, 0x1

    goto/16 :goto_8

    :cond_2
    const/16 v6, 0x30

    if-ne v7, v6, :cond_4

    if-eqz v10, :cond_1

    if-eqz v11, :cond_1

    add-int/lit8 v12, v12, 0x1

    if-le v12, v15, :cond_3

    goto :goto_1

    :cond_3
    mul-int/lit8 v13, v13, 0xa

    goto :goto_2

    :cond_4
    const/16 v6, 0x41

    if-lt v7, v6, :cond_5

    const/16 v6, 0x5a

    if-le v7, v6, :cond_6

    :cond_5
    const/16 v6, 0x61

    if-lt v7, v6, :cond_7

    const/16 v6, 0x7a

    if-le v7, v6, :cond_6

    goto :goto_3

    :cond_6
    const/4 v6, 0x0

    goto :goto_6

    :cond_7
    :goto_3
    const/16 v6, 0x2d

    if-ne v7, v6, :cond_8

    const/4 v6, 0x1

    goto :goto_4

    :cond_8
    const/4 v6, 0x0

    :goto_4
    if-nez v6, :cond_b

    const/16 v10, 0x2a

    if-ne v7, v10, :cond_9

    const/16 v16, 0x1

    goto :goto_5

    :cond_9
    const/16 v16, 0x0

    :goto_5
    if-eqz v16, :cond_a

    goto :goto_6

    :cond_a
    new-instance v1, Linet/ipaddr/AddressStringException;

    invoke-interface/range {p0 .. p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "ipaddress.host.error.invalid.port.service"

    invoke-direct {v1, v0, v2, v9}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;I)V

    throw v1

    :cond_b
    :goto_6
    if-eqz v6, :cond_f

    if-eq v9, v3, :cond_e

    add-int/lit8 v6, v9, -0x1

    if-eq v6, v8, :cond_d

    add-int/lit8 v6, v4, -0x1

    if-eq v9, v6, :cond_c

    move v8, v9

    move/from16 v15, v17

    const/4 v6, 0x1

    goto :goto_7

    :cond_c
    new-instance v1, Linet/ipaddr/AddressStringException;

    invoke-interface/range {p0 .. p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "ipaddress.host.error.invalid.service.hyphen.end"

    invoke-direct {v1, v0, v2}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v1

    :cond_d
    new-instance v1, Linet/ipaddr/AddressStringException;

    invoke-interface/range {p0 .. p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "ipaddress.host.error.invalid.service.hyphen.consecutive"

    invoke-direct {v1, v0, v2}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v1

    :cond_e
    new-instance v1, Linet/ipaddr/AddressStringException;

    invoke-interface/range {p0 .. p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "ipaddress.host.error.invalid.service.hyphen.start"

    invoke-direct {v1, v0, v2}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v1

    :cond_f
    if-eqz v16, :cond_12

    if-gt v9, v3, :cond_11

    const/4 v6, 0x1

    add-int/2addr v9, v6

    if-lt v9, v4, :cond_10

    add-int/lit8 v14, v14, 0x1

    const/4 v7, 0x0

    goto :goto_9

    :cond_10
    new-instance v1, Linet/ipaddr/AddressStringException;

    invoke-interface/range {p0 .. p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, v9, v6}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;IZ)V

    throw v1

    :cond_11
    const/4 v6, 0x1

    new-instance v1, Linet/ipaddr/AddressStringException;

    invoke-interface/range {p0 .. p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, v9, v6}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;IZ)V

    throw v1

    :cond_12
    const/4 v6, 0x1

    move v15, v6

    :goto_7
    add-int/lit8 v14, v14, 0x1

    const/4 v10, 0x0

    :goto_8
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    :cond_13
    move/from16 v17, v15

    move v7, v10

    move/from16 v6, v17

    :goto_9
    if-eqz v7, :cond_17

    iget-boolean v2, v2, Linet/ipaddr/f;->g:Z

    if-eqz v2, :cond_16

    if-eqz v13, :cond_15

    const v2, 0xffff

    if-gt v13, v2, :cond_14

    new-instance v0, Linet/ipaddr/format/validate/i;

    invoke-direct {v0, v1, v13}, Linet/ipaddr/format/validate/i;-><init>(Ljava/lang/CharSequence;I)V

    return-object v0

    :cond_14
    new-instance v1, Linet/ipaddr/AddressStringException;

    invoke-interface/range {p0 .. p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "ipaddress.host.error.invalidPort.too.large"

    invoke-direct {v1, v0, v2}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v1

    :cond_15
    new-instance v1, Linet/ipaddr/AddressStringException;

    invoke-interface/range {p0 .. p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "ipaddress.host.error.invalidPort.no.digits"

    invoke-direct {v1, v0, v2}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v1

    :cond_16
    new-instance v1, Linet/ipaddr/AddressStringException;

    invoke-interface/range {p0 .. p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "ipaddress.host.error.port"

    invoke-direct {v1, v0, v2}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v1

    :cond_17
    iget-boolean v2, v2, Linet/ipaddr/f;->h:Z

    if-eqz v2, :cond_1b

    if-eqz v14, :cond_1a

    const/16 v2, 0xf

    if-gt v14, v2, :cond_19

    if-eqz v6, :cond_18

    invoke-interface {v0, v3, v4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    new-instance v2, Linet/ipaddr/format/validate/i;

    invoke-direct {v2, v1, v0}, Linet/ipaddr/format/validate/i;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    return-object v2

    :cond_18
    new-instance v1, Linet/ipaddr/AddressStringException;

    invoke-interface/range {p0 .. p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "ipaddress.host.error.invalidService.no.letter"

    invoke-direct {v1, v0, v2}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v1

    :cond_19
    new-instance v1, Linet/ipaddr/AddressStringException;

    invoke-interface/range {p0 .. p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "ipaddress.host.error.invalidService.too.long"

    invoke-direct {v1, v0, v2}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v1

    :cond_1a
    new-instance v1, Linet/ipaddr/AddressStringException;

    invoke-interface/range {p0 .. p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "ipaddress.host.error.invalidService.no.chars"

    invoke-direct {v1, v0, v2}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v1

    :cond_1b
    new-instance v1, Linet/ipaddr/AddressStringException;

    invoke-interface/range {p0 .. p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "ipaddress.host.error.service"

    invoke-direct {v1, v0, v2}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v1
.end method

.method private static J(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Linet/ipaddr/o;Linet/ipaddr/f;ZIILinet/ipaddr/g$a;)Linet/ipaddr/format/validate/i;
    .locals 7

    iget-boolean v0, p2, Linet/ipaddr/o;->f:Z

    if-eqz v0, :cond_0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p5

    move v5, p6

    move-object v6, p7

    invoke-static/range {v0 .. v6}, Linet/ipaddr/format/validate/s;->Z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Linet/ipaddr/o;Linet/ipaddr/f;IILinet/ipaddr/g$a;)Linet/ipaddr/format/validate/i;

    move-result-object p3

    if-eqz p3, :cond_0

    return-object p3

    :cond_0
    if-nez p4, :cond_a

    iget-boolean p3, p2, Linet/ipaddr/o;->g:Z

    const-string p4, "ipaddress.error.invalidCIDRPrefixOrMask"

    if-eqz p3, :cond_8

    :try_start_0
    invoke-static {p2, p7}, Linet/ipaddr/format/validate/s;->U(Linet/ipaddr/o;Linet/ipaddr/g$a;)Linet/ipaddr/o;

    move-result-object p3

    new-instance v6, Linet/ipaddr/format/validate/r;

    const/4 v0, 0x0

    invoke-direct {v6, v0, p0, p3}, Linet/ipaddr/format/validate/r;-><init>(LZf/f;Ljava/lang/CharSequence;Linet/ipaddr/o;)V

    const/4 v5, 0x0

    move-object v0, p3

    move-object v1, p0

    move v2, p5

    move v3, p6

    move-object v4, v6

    invoke-static/range {v0 .. v5}, Linet/ipaddr/format/validate/s;->X(Linet/ipaddr/o;Ljava/lang/CharSequence;IILinet/ipaddr/format/validate/c;Z)V

    invoke-virtual {v6}, Linet/ipaddr/format/validate/c;->U0()Linet/ipaddr/format/validate/a;

    move-result-object p5

    invoke-virtual {p5}, Linet/ipaddr/format/validate/a;->y0()Z

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {p5}, Linet/ipaddr/format/validate/a;->v()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-static {p0, p3, v6}, Linet/ipaddr/format/validate/s;->m(Ljava/lang/CharSequence;Linet/ipaddr/o;Linet/ipaddr/format/validate/c;)V

    invoke-virtual {p5}, Linet/ipaddr/format/validate/a;->a()I

    move-result p3

    const/4 v0, 0x1

    if-ne p3, p6, :cond_5

    invoke-virtual {v6}, Linet/ipaddr/format/validate/r;->o0()Linet/ipaddr/g$a;

    move-result-object p3

    invoke-virtual {p3}, Linet/ipaddr/g$a;->isIPv4()Z

    move-result p6

    if-eqz p6, :cond_2

    invoke-virtual {p5}, Linet/ipaddr/format/validate/a;->Z()I

    move-result p6

    if-ne p6, v0, :cond_2

    invoke-virtual {p5}, Linet/ipaddr/format/validate/a;->r()Z

    move-result p5

    if-nez p5, :cond_2

    invoke-virtual {p2}, Linet/ipaddr/o;->p()Linet/ipaddr/ipv4/Z;

    move-result-object p2

    iget-boolean p2, p2, Linet/ipaddr/ipv4/Z;->m:Z

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Linet/ipaddr/AddressStringException;

    const-string p2, "ipaddress.error.mask.single.segment"

    invoke-direct {p1, p0, p2}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw p1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_2
    :goto_0
    if-eqz p7, :cond_4

    invoke-virtual {p3}, Linet/ipaddr/g$a;->isIPv4()Z

    move-result p2

    invoke-virtual {p7}, Linet/ipaddr/g$a;->isIPv4()Z

    move-result p5

    if-ne p2, p5, :cond_3

    invoke-virtual {p3}, Linet/ipaddr/g$a;->isIPv6()Z

    move-result p2

    invoke-virtual {p7}, Linet/ipaddr/g$a;->isIPv6()Z

    move-result p3

    if-ne p2, p3, :cond_3

    goto :goto_1

    :cond_3
    new-instance p1, Linet/ipaddr/AddressStringException;

    const-string p2, "ipaddress.error.ipMismatch"

    invoke-direct {p1, p0, p2}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_1
    new-instance p2, Linet/ipaddr/format/validate/i;

    invoke-direct {p2, v6, p1}, Linet/ipaddr/format/validate/i;-><init>(Linet/ipaddr/format/validate/r;Ljava/lang/CharSequence;)V

    return-object p2

    :cond_5
    new-instance p1, Linet/ipaddr/AddressStringException;

    const-string p2, "ipaddress.error.invalid.mask.extra.chars"

    add-int/2addr p3, v0

    invoke-direct {p1, p0, p2, p3}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;I)V

    throw p1

    :cond_6
    new-instance p1, Linet/ipaddr/AddressStringException;

    const-string p2, "ipaddress.error.invalid.mask.wildcard"

    invoke-direct {p1, p0, p2}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p1, Linet/ipaddr/AddressStringException;

    const-string p2, "ipaddress.error.invalid.mask.empty"

    invoke-direct {p1, p0, p2}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Linet/ipaddr/AddressStringException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_2
    new-instance p2, Linet/ipaddr/AddressStringException;

    invoke-direct {p2, p0, p4, p1}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_8
    new-instance p1, Linet/ipaddr/AddressStringException;

    iget-boolean p2, p2, Linet/ipaddr/o;->f:Z

    if-eqz p2, :cond_9

    goto :goto_3

    :cond_9
    const-string p4, "ipaddress.error.CIDRNotAllowed"

    :goto_3
    invoke-direct {p1, p0, p4}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw p1

    :cond_a
    new-instance p1, Linet/ipaddr/AddressStringException;

    const-string p2, "ipaddress.error.invalid.mask.address.empty"

    invoke-direct {p1, p0, p2}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw p1
.end method

.method private static K(JLjava/lang/CharSequence;IIILinet/ipaddr/format/validate/a;IILinet/ipaddr/d$a;)V
    .locals 17

    move-object/from16 v0, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v1, p5

    sub-int v2, v4, v1

    move-object/from16 v5, p9

    invoke-static {v0, v3, v4, v2, v5}, Linet/ipaddr/format/validate/s;->n(Ljava/lang/CharSequence;IIILinet/ipaddr/d$a;)V

    const-wide/16 v5, -0x1

    const/16 v7, 0x10

    if-ge v1, v7, :cond_0

    add-int/lit8 v7, v4, -0x10

    invoke-static {v0, v7, v2}, Linet/ipaddr/format/validate/s;->G(Ljava/lang/CharSequence;II)J

    move-result-wide v8

    shl-int/lit8 v1, v1, 0x2

    shl-long/2addr v8, v1

    shl-long v1, v5, v1

    not-long v1, v1

    or-long/2addr v1, v8

    invoke-static {v0, v3, v7}, Linet/ipaddr/format/validate/s;->G(Ljava/lang/CharSequence;II)J

    move-result-wide v5

    move-wide v12, v1

    move-wide v10, v5

    move-wide v14, v10

    goto :goto_0

    :cond_0
    const-wide/16 v8, 0x0

    if-ne v1, v7, :cond_1

    move-wide/from16 v10, p0

    move-wide v14, v10

    move-wide v12, v5

    goto :goto_0

    :cond_1
    add-int/lit8 v0, v1, -0x10

    shl-int/lit8 v0, v0, 0x2

    shl-long v1, p0, v0

    shl-long v10, v5, v0

    not-long v10, v10

    or-long/2addr v10, v1

    move-wide v12, v5

    move-wide v14, v10

    move-wide v10, v1

    :goto_0
    const/high16 v16, 0x20000

    move/from16 v0, p3

    move/from16 v1, p4

    move/from16 v2, p8

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p8

    move-object/from16 v6, p6

    move/from16 v7, p7

    invoke-static/range {v0 .. v16}, Linet/ipaddr/format/validate/s;->h(IIIIIILinet/ipaddr/format/validate/a;IJJJJI)V

    return-void
.end method

.method private static L(Ljava/lang/CharSequence;IIILinet/ipaddr/format/validate/a;IILinet/ipaddr/d$a;)V
    .locals 17

    move-object/from16 v0, p0

    move/from16 v3, p1

    move/from16 v4, p2

    move/from16 v1, p3

    sub-int v2, v4, v1

    move-object/from16 v5, p7

    invoke-static {v0, v3, v4, v2, v5}, Linet/ipaddr/format/validate/s;->n(Ljava/lang/CharSequence;IIILinet/ipaddr/d$a;)V

    add-int/lit8 v5, v4, -0x40

    const-wide/16 v6, -0x1

    const/16 v8, 0x40

    if-ge v1, v8, :cond_0

    invoke-static {v0, v5, v2}, Linet/ipaddr/format/validate/s;->H(Ljava/lang/CharSequence;II)J

    move-result-wide v8

    shl-long/2addr v8, v1

    shl-long v1, v6, v1

    not-long v1, v1

    or-long/2addr v1, v8

    invoke-static {v0, v3, v5}, Linet/ipaddr/format/validate/s;->H(Ljava/lang/CharSequence;II)J

    move-result-wide v5

    move-wide v12, v1

    move-wide v10, v5

    move-wide v14, v10

    goto :goto_0

    :cond_0
    const-wide/16 v9, 0x0

    if-ne v1, v8, :cond_1

    invoke-static {v0, v3, v5}, Linet/ipaddr/format/validate/s;->H(Ljava/lang/CharSequence;II)J

    move-result-wide v0

    move-wide v14, v0

    move-wide v12, v6

    move-wide v8, v9

    move-wide v10, v14

    goto :goto_0

    :cond_1
    sub-int/2addr v1, v8

    sub-int/2addr v5, v1

    invoke-static {v0, v3, v5}, Linet/ipaddr/format/validate/s;->H(Ljava/lang/CharSequence;II)J

    move-result-wide v11

    shl-long/2addr v11, v1

    shl-long v0, v6, v1

    not-long v0, v0

    or-long/2addr v0, v11

    move-wide v14, v0

    move-wide v8, v9

    move-wide v10, v11

    move-wide v12, v6

    :goto_0
    const/high16 v16, 0x20000

    move/from16 v0, p1

    move/from16 v1, p2

    move/from16 v2, p6

    move/from16 v3, p1

    move/from16 v4, p2

    move/from16 v5, p6

    move-object/from16 v6, p4

    move/from16 v7, p5

    invoke-static/range {v0 .. v16}, Linet/ipaddr/format/validate/s;->h(IIIIIILinet/ipaddr/format/validate/a;IJJJJI)V

    return-void
.end method

.method private static M(ILjava/lang/CharSequence;Ljava/lang/CharSequence;Linet/ipaddr/o;IILinet/ipaddr/g$a;)Linet/ipaddr/format/validate/i;
    .locals 1

    if-nez p4, :cond_0

    add-int/lit8 p5, p5, -0x1

    :cond_0
    const-string p4, "ipaddress.error.prefixSize"

    const/4 v0, 0x0

    if-eqz p6, :cond_5

    invoke-virtual {p6}, Linet/ipaddr/g$a;->isIPv4()Z

    move-result p6

    if-eqz p6, :cond_5

    if-lez p5, :cond_2

    invoke-virtual {p3}, Linet/ipaddr/o;->p()Linet/ipaddr/ipv4/Z;

    move-result-object p5

    iget-boolean p5, p5, Linet/ipaddr/o$b;->h:Z

    if-eqz p5, :cond_1

    goto :goto_0

    :cond_1
    new-instance p0, Linet/ipaddr/AddressStringException;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "ipaddress.error.ipv4.prefix.leading.zeros"

    invoke-direct {p0, p1, p2}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw p0

    :cond_2
    :goto_0
    invoke-virtual {p3}, Linet/ipaddr/o;->p()Linet/ipaddr/ipv4/Z;

    move-result-object p5

    iget-boolean p5, p5, Linet/ipaddr/o$b;->g:Z

    if-nez p5, :cond_4

    const/16 p5, 0x20

    if-le p0, p5, :cond_4

    iget-boolean p0, p3, Linet/ipaddr/d;->c:Z

    if-eqz p0, :cond_3

    return-object v0

    :cond_3
    new-instance p0, Linet/ipaddr/AddressStringException;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, p4}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw p0

    :cond_4
    sget-object p1, Linet/ipaddr/format/validate/s;->f:[Linet/ipaddr/format/validate/i;

    array-length p1, p1

    if-ge p0, p1, :cond_b

    goto :goto_3

    :cond_5
    if-lez p5, :cond_7

    invoke-virtual {p3}, Linet/ipaddr/o;->r()Linet/ipaddr/ipv6/j0;

    move-result-object p5

    iget-boolean p5, p5, Linet/ipaddr/o$b;->h:Z

    if-eqz p5, :cond_6

    goto :goto_1

    :cond_6
    new-instance p0, Linet/ipaddr/AddressStringException;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "ipaddress.error.ipv6.prefix.leading.zeros"

    invoke-direct {p0, p1, p2}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw p0

    :cond_7
    :goto_1
    invoke-virtual {p3}, Linet/ipaddr/o;->r()Linet/ipaddr/ipv6/j0;

    move-result-object p3

    iget-boolean p3, p3, Linet/ipaddr/o$b;->g:Z

    if-nez p3, :cond_9

    const/16 p3, 0x80

    if-gt p0, p3, :cond_8

    goto :goto_2

    :cond_8
    new-instance p0, Linet/ipaddr/AddressStringException;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, p4}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw p0

    :cond_9
    :goto_2
    if-nez p2, :cond_b

    sget-object p1, Linet/ipaddr/format/validate/s;->f:[Linet/ipaddr/format/validate/i;

    array-length p1, p1

    if-ge p0, p1, :cond_b

    :goto_3
    sget-object p1, Linet/ipaddr/format/validate/s;->f:[Linet/ipaddr/format/validate/i;

    aget-object p2, p1, p0

    if-nez p2, :cond_a

    new-instance p2, Linet/ipaddr/format/validate/i;

    invoke-static {p0}, Linet/ipaddr/format/validate/s;->l(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p2, p3, v0}, Linet/ipaddr/format/validate/i;-><init>(Ljava/lang/Integer;Ljava/lang/CharSequence;)V

    aput-object p2, p1, p0

    :cond_a
    return-object p2

    :cond_b
    new-instance p1, Linet/ipaddr/format/validate/i;

    invoke-static {p0}, Linet/ipaddr/format/validate/s;->l(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-direct {p1, p0, p2}, Linet/ipaddr/format/validate/i;-><init>(Ljava/lang/Integer;Ljava/lang/CharSequence;)V

    return-object p1
.end method

.method private static N(Ljava/lang/CharSequence;Linet/ipaddr/o;ZIILinet/ipaddr/g$a;)Linet/ipaddr/format/validate/i;
    .locals 9

    const-string v0, "ipaddress.error.invalid.zone"

    if-ne p3, p4, :cond_1

    invoke-virtual {p1}, Linet/ipaddr/o;->r()Linet/ipaddr/ipv6/j0;

    move-result-object v1

    iget-boolean v1, v1, Linet/ipaddr/ipv6/j0;->k:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Linet/ipaddr/AddressStringException;

    invoke-direct {p1, p0, v0, p3}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;I)V

    throw p1

    :cond_1
    :goto_0
    move v1, p3

    :goto_1
    if-ge v1, p4, :cond_6

    invoke-interface {p0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    const/16 v3, 0x2f

    if-ne v2, v3, :cond_4

    if-ne v1, p3, :cond_3

    invoke-virtual {p1}, Linet/ipaddr/o;->r()Linet/ipaddr/ipv6/j0;

    move-result-object v2

    iget-boolean v2, v2, Linet/ipaddr/ipv6/j0;->k:Z

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    new-instance p1, Linet/ipaddr/AddressStringException;

    invoke-direct {p1, p0, v0, p3}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;I)V

    throw p1

    :cond_3
    :goto_2
    invoke-interface {p0, p3, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v2

    const/4 v4, 0x0

    add-int/lit8 v6, v1, 0x1

    move-object v1, p0

    move-object v3, p1

    move v5, p2

    move v7, p4

    move-object v8, p5

    invoke-static/range {v1 .. v8}, Linet/ipaddr/format/validate/s;->J(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Linet/ipaddr/o;Linet/ipaddr/f;ZIILinet/ipaddr/g$a;)Linet/ipaddr/format/validate/i;

    move-result-object p0

    return-object p0

    :cond_4
    const/16 v3, 0x3a

    if-eq v2, v3, :cond_5

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_5
    new-instance p1, Linet/ipaddr/AddressStringException;

    invoke-direct {p1, p0, v0, v1}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;I)V

    throw p1

    :cond_6
    new-instance p1, Linet/ipaddr/format/validate/i;

    invoke-interface {p0, p3, p4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-direct {p1, p0}, Linet/ipaddr/format/validate/i;-><init>(Ljava/lang/CharSequence;)V

    return-object p1
.end method

.method private static O(JLjava/lang/CharSequence;IIILinet/ipaddr/format/validate/a;IILinet/ipaddr/d$a;)V
    .locals 14

    move-object/from16 v0, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v1, p5

    sub-int v2, v4, v1

    move-object/from16 v5, p9

    invoke-static {v0, v3, v4, v2, v5}, Linet/ipaddr/format/validate/s;->n(Ljava/lang/CharSequence;IIILinet/ipaddr/d$a;)V

    if-ge v3, v2, :cond_0

    sub-int/2addr v2, v3

    move-wide v5, p0

    invoke-static {p0, p1, v0, v2}, Linet/ipaddr/format/validate/s;->R(JLjava/lang/CharSequence;I)J

    move-result-wide v5

    goto :goto_0

    :cond_0
    const-wide/16 v5, 0x0

    :goto_0
    const/4 v0, 0x1

    if-eq v1, v0, :cond_3

    const/4 v0, 0x2

    if-eq v1, v0, :cond_2

    const/4 v0, 0x3

    if-eq v1, v0, :cond_1

    const-wide/high16 v7, 0x4024000000000000L    # 10.0

    int-to-double v0, v1

    invoke-static {v7, v8, v0, v1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    double-to-long v0, v0

    mul-long/2addr v5, v0

    add-long/2addr v0, v5

    const-wide/16 v7, 0x1

    sub-long/2addr v0, v7

    :goto_1
    move-wide v10, v0

    move-wide v8, v5

    goto :goto_3

    :cond_1
    const-wide/16 v0, 0x3e8

    mul-long/2addr v5, v0

    const-wide/16 v0, 0x3e7

    :goto_2
    add-long/2addr v0, v5

    goto :goto_1

    :cond_2
    const-wide/16 v0, 0x64

    mul-long/2addr v5, v0

    const-wide/16 v0, 0x63

    goto :goto_2

    :cond_3
    const-wide/16 v0, 0xa

    mul-long/2addr v5, v0

    const-wide/16 v0, 0x9

    goto :goto_2

    :goto_3
    const/16 v13, 0xa

    const v12, 0x2000a

    move/from16 v0, p3

    move/from16 v1, p4

    move/from16 v2, p8

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p8

    move-object/from16 v6, p6

    move/from16 v7, p7

    invoke-static/range {v0 .. v13}, Linet/ipaddr/format/validate/s;->i(IIIIIILinet/ipaddr/format/validate/a;IJJII)V

    return-void
.end method

.method private static P(JLjava/lang/CharSequence;IIILinet/ipaddr/format/validate/a;IILinet/ipaddr/d$a;)V
    .locals 14

    move-object/from16 v0, p2

    move/from16 v3, p3

    move/from16 v4, p4

    sub-int v1, v4, p5

    move-object/from16 v2, p9

    invoke-static {v0, v3, v4, v1, v2}, Linet/ipaddr/format/validate/s;->n(Ljava/lang/CharSequence;IIILinet/ipaddr/d$a;)V

    if-ge v3, v1, :cond_0

    sub-int/2addr v1, v3

    move-wide v5, p0

    invoke-static {p0, p1, v0, v1}, Linet/ipaddr/format/validate/s;->S(JLjava/lang/CharSequence;I)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    shl-long v8, v0, p5

    packed-switch p5, :pswitch_data_0

    const-wide/16 v0, -0x1

    shl-long v0, v0, p5

    not-long v0, v0

    :goto_1
    or-long/2addr v0, v8

    move-wide v10, v0

    goto :goto_2

    :pswitch_0
    const-wide/32 v0, 0xffff

    goto :goto_1

    :pswitch_1
    const-wide/16 v0, 0x7fff

    goto :goto_1

    :pswitch_2
    const-wide/16 v0, 0x3fff

    goto :goto_1

    :pswitch_3
    const-wide/16 v0, 0x1fff

    goto :goto_1

    :pswitch_4
    const-wide/16 v0, 0xfff

    goto :goto_1

    :pswitch_5
    const-wide/16 v0, 0x7ff

    goto :goto_1

    :pswitch_6
    const-wide/16 v0, 0x3ff

    goto :goto_1

    :pswitch_7
    const-wide/16 v0, 0x1ff

    goto :goto_1

    :pswitch_8
    const-wide/16 v0, 0xff

    goto :goto_1

    :pswitch_9
    const-wide/16 v0, 0x7f

    goto :goto_1

    :pswitch_a
    const-wide/16 v0, 0x3f

    goto :goto_1

    :pswitch_b
    const-wide/16 v0, 0x1f

    goto :goto_1

    :pswitch_c
    const-wide/16 v0, 0xf

    goto :goto_1

    :pswitch_d
    const-wide/16 v0, 0x7

    goto :goto_1

    :pswitch_e
    const-wide/16 v0, 0x3

    goto :goto_1

    :pswitch_f
    const-wide/16 v0, 0x1

    goto :goto_1

    :goto_2
    const/4 v13, 0x2

    const v12, 0x20002

    move/from16 v0, p3

    move/from16 v1, p4

    move/from16 v2, p8

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p8

    move-object/from16 v6, p6

    move/from16 v7, p7

    invoke-static/range {v0 .. v13}, Linet/ipaddr/format/validate/s;->i(IIIIIILinet/ipaddr/format/validate/a;IJJII)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static Q(JLjava/lang/CharSequence;IIILinet/ipaddr/format/validate/a;IILinet/ipaddr/d$a;)V
    .locals 14

    move-object/from16 v0, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v1, p5

    sub-int v2, v4, v1

    move-object/from16 v5, p9

    invoke-static {v0, v3, v4, v2, v5}, Linet/ipaddr/format/validate/s;->n(Ljava/lang/CharSequence;IIILinet/ipaddr/d$a;)V

    if-ge v3, v2, :cond_0

    sub-int/2addr v2, v3

    move-wide v5, p0

    invoke-static {p0, p1, v0, v2}, Linet/ipaddr/format/validate/s;->T(JLjava/lang/CharSequence;I)J

    move-result-wide v5

    goto :goto_0

    :cond_0
    const-wide/16 v5, 0x0

    :goto_0
    const/4 v0, 0x1

    const/4 v2, 0x3

    if-eq v1, v0, :cond_3

    const/4 v0, 0x2

    if-eq v1, v0, :cond_2

    if-eq v1, v2, :cond_1

    mul-int/lit8 v0, v1, 0x3

    shl-long v1, v5, v0

    const-wide/16 v5, -0x1

    shl-long/2addr v5, v0

    not-long v5, v5

    or-long/2addr v5, v1

    move-wide v8, v1

    :goto_1
    move-wide v10, v5

    goto :goto_3

    :cond_1
    const/16 v0, 0x9

    shl-long v0, v5, v0

    const-wide/16 v5, 0x1ff

    :goto_2
    or-long/2addr v5, v0

    move-wide v8, v0

    goto :goto_1

    :cond_2
    const/4 v0, 0x6

    shl-long v0, v5, v0

    const-wide/16 v5, 0x3f

    goto :goto_2

    :cond_3
    shl-long v0, v5, v2

    const-wide/16 v5, 0x7

    goto :goto_2

    :goto_3
    const/16 v13, 0x8

    const v12, 0x20008

    move/from16 v0, p3

    move/from16 v1, p4

    move/from16 v2, p8

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p8

    move-object/from16 v6, p6

    move/from16 v7, p7

    invoke-static/range {v0 .. v13}, Linet/ipaddr/format/validate/s;->i(IIIIIILinet/ipaddr/format/validate/a;IJJII)V

    return-void
.end method

.method private static R(JLjava/lang/CharSequence;I)J
    .locals 16

    move-object/from16 v0, p2

    const-wide/16 v1, 0xf

    and-long v3, p0, v1

    const-wide/16 v5, 0xa

    cmp-long v7, v3, v5

    const-string v8, "ipaddress.error.ipv4.invalid.decimal.digit"

    if-gez v7, :cond_5

    add-int/lit8 v7, p3, -0x1

    if-lez v7, :cond_4

    const/16 v9, 0xa

    move-wide v10, v3

    move v12, v9

    move-wide/from16 v3, p0

    :goto_0
    const/4 v13, 0x4

    ushr-long/2addr v3, v13

    and-long v13, v3, v1

    cmp-long v15, v13, v5

    if-gez v15, :cond_3

    int-to-long v1, v12

    mul-long/2addr v13, v1

    add-long/2addr v10, v13

    add-int/lit8 v7, v7, -0x1

    if-nez v7, :cond_0

    move-wide v3, v10

    goto :goto_3

    :cond_0
    const/16 v1, 0x64

    if-ne v12, v9, :cond_1

    :goto_1
    move v12, v1

    goto :goto_2

    :cond_1
    if-ne v12, v1, :cond_2

    const/16 v1, 0x3e8

    goto :goto_1

    :cond_2
    mul-int/lit8 v12, v12, 0xa

    :goto_2
    const-wide/16 v1, 0xf

    goto :goto_0

    :cond_3
    new-instance v1, Linet/ipaddr/AddressStringException;

    invoke-direct {v1, v0, v8}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v1

    :cond_4
    :goto_3
    return-wide v3

    :cond_5
    new-instance v1, Linet/ipaddr/AddressStringException;

    invoke-direct {v1, v0, v8}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v1
.end method

.method private static S(JLjava/lang/CharSequence;I)J
    .locals 11

    const-wide/16 v0, 0xf

    and-long v2, p0, v0

    const-wide/16 v4, 0x1

    cmp-long v6, v2, v4

    const-string v7, "ipaddress.error.ipv4.invalid.binary.digit"

    if-gtz v6, :cond_3

    const/4 v6, 0x0

    :cond_0
    :goto_0
    add-int/lit8 p3, p3, -0x1

    if-lez p3, :cond_2

    const/4 v8, 0x1

    add-int/2addr v6, v8

    const/4 v9, 0x4

    ushr-long/2addr p0, v9

    and-long v9, p0, v0

    cmp-long v9, v9, v4

    if-ltz v9, :cond_0

    if-nez v9, :cond_1

    shl-int/2addr v8, v6

    int-to-long v8, v8

    or-long/2addr v2, v8

    goto :goto_0

    :cond_1
    new-instance p0, Linet/ipaddr/AddressStringException;

    invoke-direct {p0, p2, v7}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw p0

    :cond_2
    return-wide v2

    :cond_3
    new-instance p0, Linet/ipaddr/AddressStringException;

    invoke-direct {p0, p2, v7}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw p0
.end method

.method private static T(JLjava/lang/CharSequence;I)J
    .locals 11

    const-wide/16 v0, 0xf

    and-long v2, p0, v0

    const-wide/16 v4, 0x8

    cmp-long v6, v2, v4

    const-string v7, "ipaddress.error.ipv4.invalid.octal.digit"

    if-gez v6, :cond_2

    const/4 v6, 0x0

    :goto_0
    add-int/lit8 p3, p3, -0x1

    if-lez p3, :cond_1

    add-int/lit8 v6, v6, 0x3

    const/4 v8, 0x4

    ushr-long/2addr p0, v8

    and-long v8, p0, v0

    cmp-long v10, v8, v4

    if-gez v10, :cond_0

    shl-long/2addr v8, v6

    or-long/2addr v2, v8

    goto :goto_0

    :cond_0
    new-instance p0, Linet/ipaddr/AddressStringException;

    invoke-direct {p0, p2, v7}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw p0

    :cond_1
    return-wide v2

    :cond_2
    new-instance p0, Linet/ipaddr/AddressStringException;

    invoke-direct {p0, p2, v7}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw p0
.end method

.method private static U(Linet/ipaddr/o;Linet/ipaddr/g$a;)Linet/ipaddr/o;
    .locals 4

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Linet/ipaddr/g$a;->isIPv6()Z

    move-result v1

    if-eqz v1, :cond_3

    :cond_0
    invoke-virtual {p0}, Linet/ipaddr/o;->r()Linet/ipaddr/ipv6/j0;

    move-result-object v1

    iget-object v2, v1, Linet/ipaddr/d$a;->a:Linet/ipaddr/d$c;

    invoke-virtual {v2}, Linet/ipaddr/d$c;->t()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {p0}, Linet/ipaddr/o;->B()Linet/ipaddr/o$a;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/o$a;->u()Linet/ipaddr/ipv6/j0$a;

    move-result-object v2

    sget-object v3, Linet/ipaddr/d$c;->f:Linet/ipaddr/d$c;

    invoke-virtual {v2, v3}, Linet/ipaddr/ipv6/j0$a;->w(Linet/ipaddr/d$c;)Linet/ipaddr/ipv6/j0$a;

    :cond_1
    iget-boolean v2, v1, Linet/ipaddr/ipv6/j0;->i:Z

    if-eqz v2, :cond_3

    invoke-virtual {v1}, Linet/ipaddr/ipv6/j0;->r()Linet/ipaddr/o;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/o;->p()Linet/ipaddr/ipv4/Z;

    move-result-object v1

    iget-object v1, v1, Linet/ipaddr/d$a;->a:Linet/ipaddr/d$c;

    invoke-virtual {v1}, Linet/ipaddr/d$c;->t()Z

    move-result v1

    if-nez v1, :cond_3

    if-nez v0, :cond_2

    invoke-virtual {p0}, Linet/ipaddr/o;->B()Linet/ipaddr/o$a;

    move-result-object v0

    :cond_2
    invoke-virtual {v0}, Linet/ipaddr/o$a;->u()Linet/ipaddr/ipv6/j0$a;

    move-result-object v1

    sget-object v2, Linet/ipaddr/d$c;->f:Linet/ipaddr/d$c;

    invoke-virtual {v1, v2}, Linet/ipaddr/ipv6/j0$a;->w(Linet/ipaddr/d$c;)Linet/ipaddr/ipv6/j0$a;

    :cond_3
    if-eqz p1, :cond_4

    invoke-virtual {p1}, Linet/ipaddr/g$a;->isIPv4()Z

    move-result p1

    if-eqz p1, :cond_6

    :cond_4
    invoke-virtual {p0}, Linet/ipaddr/o;->p()Linet/ipaddr/ipv4/Z;

    move-result-object p1

    iget-object p1, p1, Linet/ipaddr/d$a;->a:Linet/ipaddr/d$c;

    invoke-virtual {p1}, Linet/ipaddr/d$c;->t()Z

    move-result p1

    if-nez p1, :cond_6

    if-nez v0, :cond_5

    invoke-virtual {p0}, Linet/ipaddr/o;->B()Linet/ipaddr/o$a;

    move-result-object v0

    :cond_5
    invoke-virtual {v0}, Linet/ipaddr/o$a;->t()Linet/ipaddr/ipv4/Z$a;

    move-result-object p1

    sget-object v1, Linet/ipaddr/d$c;->f:Linet/ipaddr/d$c;

    invoke-virtual {p1, v1}, Linet/ipaddr/ipv4/Z$a;->r(Linet/ipaddr/d$c;)Linet/ipaddr/ipv4/Z$a;

    :cond_6
    iget-boolean p1, p0, Linet/ipaddr/d;->b:Z

    if-eqz p1, :cond_8

    if-nez v0, :cond_7

    invoke-virtual {p0}, Linet/ipaddr/o;->B()Linet/ipaddr/o$a;

    move-result-object v0

    :cond_7
    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Linet/ipaddr/o$a;->j(Z)Linet/ipaddr/o$a;

    :cond_8
    if-nez v0, :cond_9

    goto :goto_0

    :cond_9
    invoke-virtual {v0}, Linet/ipaddr/o$a;->v()Linet/ipaddr/o;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method private static V(Linet/ipaddr/o;Linet/ipaddr/p;Ljava/lang/CharSequence;IILinet/ipaddr/format/validate/c;Linet/ipaddr/format/validate/e;Z)V
    .locals 96

    move-object/from16 v8, p0

    move-object/from16 v15, p2

    move/from16 v14, p3

    move-object/from16 v13, p5

    invoke-virtual/range {p5 .. p5}, Linet/ipaddr/format/validate/c;->U0()Linet/ipaddr/format/validate/a;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/o;->r()Linet/ipaddr/ipv6/j0;

    move-result-object v11

    iget-boolean v0, v11, Linet/ipaddr/ipv6/j0;->l:Z

    invoke-virtual/range {p0 .. p0}, Linet/ipaddr/o;->p()Linet/ipaddr/ipv4/Z;

    move-result-object v9

    sget-object v29, Linet/ipaddr/format/validate/s;->c:[I

    const/16 v30, -0x1

    const-wide/16 v31, 0x0

    move/from16 v5, p4

    move/from16 v33, v0

    move-object/from16 v37, v9

    move v1, v14

    move v4, v1

    move v9, v4

    move/from16 v6, v30

    move v7, v6

    move/from16 v39, v7

    move/from16 v43, v39

    move/from16 v45, v43

    move-wide/from16 v20, v31

    move-wide/from16 v49, v20

    move-wide/from16 v51, v49

    const/4 v0, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v38, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v44, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v53, 0x0

    :goto_0
    const/16 v22, 0x2

    if-lt v1, v5, :cond_16

    if-ne v1, v5, :cond_15

    invoke-virtual {v12, v1}, Linet/ipaddr/format/validate/a;->T(I)V

    if-eqz v35, :cond_5

    if-gez v7, :cond_4

    invoke-virtual/range {v36 .. v36}, Linet/ipaddr/g$a;->isIPv4()Z

    move-result v23

    if-eqz v23, :cond_0

    move/from16 v57, v0

    move/from16 v60, v4

    move/from16 p1, v5

    move/from16 v61, v6

    move/from16 v54, v9

    move-object/from16 v55, v12

    move/from16 v23, v13

    move/from16 v56, v17

    move/from16 v62, v18

    move/from16 v63, v19

    move-wide/from16 v58, v20

    const/16 v2, 0x2e

    :goto_1
    const/16 v13, 0x2e

    move v9, v7

    move v7, v1

    goto/16 :goto_8

    :cond_0
    if-ne v1, v9, :cond_2

    invoke-virtual {v12}, Linet/ipaddr/format/validate/a;->c()I

    move-result v0

    add-int/lit8 v0, v0, 0x2

    if-ne v1, v0, :cond_1

    goto/16 :goto_7

    :cond_1
    new-instance v0, Linet/ipaddr/AddressStringException;

    const-string v1, "ipaddress.error.cannot.end.with.single.separator"

    invoke-direct {v0, v15, v1}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-virtual/range {p5 .. p5}, Linet/ipaddr/format/validate/c;->g1()Z

    move-result v23

    if-eqz v23, :cond_3

    goto/16 :goto_7

    :cond_3
    move/from16 v57, v0

    move/from16 v60, v4

    move/from16 p1, v5

    move/from16 v61, v6

    move/from16 v54, v9

    move-object/from16 v55, v12

    move/from16 v23, v13

    move/from16 v56, v17

    move/from16 v62, v18

    move/from16 v63, v19

    move-wide/from16 v58, v20

    const/16 v2, 0x3a

    goto :goto_1

    :cond_4
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v15, v7}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;I)V

    throw v0

    :cond_5
    move/from16 v54, v9

    sub-int v9, v1, v14

    if-nez v9, :cond_9

    invoke-virtual/range {p5 .. p5}, Linet/ipaddr/format/validate/c;->X0()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-boolean v0, v8, Linet/ipaddr/o;->d:Z

    if-eqz v0, :cond_6

    :goto_2
    const/4 v0, 0x1

    goto :goto_3

    :cond_6
    new-instance v0, Linet/ipaddr/AddressStringException;

    const-string v1, "ipaddress.error.prefix.only"

    invoke-direct {v0, v15, v1}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0

    :cond_7
    iget-boolean v0, v8, Linet/ipaddr/d;->a:Z

    if-eqz v0, :cond_8

    goto :goto_2

    :goto_3
    invoke-virtual {v12, v0}, Linet/ipaddr/format/validate/a;->C0(Z)V

    goto/16 :goto_7

    :cond_8
    new-instance v0, Linet/ipaddr/AddressStringException;

    const-string v1, "ipaddress.error.empty"

    invoke-direct {v0, v15, v1}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0

    :cond_9
    const/16 v18, 0x1

    const/16 v3, 0x13

    if-ne v0, v9, :cond_b

    if-gt v0, v3, :cond_b

    iget-boolean v0, v8, Linet/ipaddr/d;->b:Z

    if-eqz v0, :cond_a

    invoke-virtual {v12}, Linet/ipaddr/format/validate/a;->E0()V

    invoke-virtual {v12}, Linet/ipaddr/format/validate/a;->b0()V

    goto/16 :goto_7

    :cond_a
    new-instance v0, Linet/ipaddr/AddressStringException;

    const-string v1, "ipaddress.error.all"

    invoke-direct {v0, v15, v1}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0

    :cond_b
    sub-int v14, v1, v4

    move-object/from16 v55, v12

    add-int v12, v13, v10

    iget-boolean v2, v8, Linet/ipaddr/d;->c:Z

    if-eqz v2, :cond_14

    if-ltz v6, :cond_c

    move/from16 v2, v18

    goto :goto_4

    :cond_c
    const/4 v2, 0x0

    :goto_4
    invoke-static {v14, v2, v12, v11}, Linet/ipaddr/format/validate/s;->z(IZILinet/ipaddr/ipv6/j0;)Z

    move-result v19

    if-eqz v19, :cond_e

    if-gez v7, :cond_d

    move/from16 v57, v0

    move/from16 v56, v1

    move/from16 v60, v4

    move/from16 p1, v5

    move/from16 v61, v6

    move v9, v7

    move/from16 v23, v13

    move/from16 v7, v18

    move-wide/from16 v58, v20

    const/16 v2, 0x3a

    const/16 v13, 0x2e

    goto/16 :goto_6

    :cond_d
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v15, v7}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;I)V

    throw v0

    :cond_e
    if-eqz v33, :cond_f

    move/from16 v23, v13

    move v13, v0

    move-object/from16 v0, p0

    move/from16 v56, v1

    move-object/from16 v1, p2

    move/from16 v19, v2

    move/from16 v57, v13

    move-wide/from16 v58, v20

    const/16 v13, 0x2e

    move/from16 v2, p3

    move v3, v5

    move/from16 v60, v4

    move-object/from16 v4, p5

    move/from16 p1, v5

    move/from16 v5, v39

    move/from16 v61, v6

    move v6, v9

    move v9, v7

    move/from16 v7, v56

    invoke-static/range {v0 .. v7}, Linet/ipaddr/format/validate/s;->C(Linet/ipaddr/o;Ljava/lang/CharSequence;IILinet/ipaddr/format/validate/c;III)Z

    move-result v0

    if-eqz v0, :cond_10

    goto :goto_7

    :cond_f
    move/from16 v57, v0

    move/from16 v56, v1

    move/from16 v19, v2

    move/from16 v60, v4

    move/from16 p1, v5

    move/from16 v61, v6

    move v9, v7

    move/from16 v23, v13

    move-wide/from16 v58, v20

    const/16 v13, 0x2e

    :cond_10
    if-eqz v41, :cond_11

    add-int/lit8 v0, v40, 0x1

    goto :goto_5

    :cond_11
    move/from16 v0, v40

    :goto_5
    sub-int v1, v14, v0

    move v2, v14

    move/from16 v3, v19

    move v4, v10

    move v5, v12

    move-object/from16 v6, v37

    invoke-static/range {v1 .. v6}, Linet/ipaddr/format/validate/s;->y(IIZIILinet/ipaddr/ipv4/Z;)Z

    move-result v0

    if-eqz v0, :cond_13

    if-gez v9, :cond_12

    move v2, v13

    move/from16 v7, v17

    :goto_6
    invoke-virtual/range {v55 .. v55}, Linet/ipaddr/format/validate/a;->M0()V

    const/16 v62, 0x1

    const/16 v63, 0x0

    move/from16 v93, v56

    move/from16 v56, v7

    move/from16 v7, v93

    goto :goto_8

    :cond_12
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v15, v9}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;I)V

    throw v0

    :cond_13
    new-instance v0, Linet/ipaddr/AddressStringException;

    const-string v1, "ipaddress.error.too.few.segments.digit.count"

    invoke-direct {v0, v1}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_14
    new-instance v0, Linet/ipaddr/AddressStringException;

    const-string v1, "ipaddress.error.single.segment"

    invoke-direct {v0, v15, v1}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0

    :cond_15
    :goto_7
    return-void

    :cond_16
    move/from16 v57, v0

    move/from16 v60, v4

    move/from16 p1, v5

    move/from16 v61, v6

    move/from16 v54, v9

    move-object/from16 v55, v12

    move/from16 v23, v13

    move-wide/from16 v58, v20

    const/16 v13, 0x2e

    move v9, v7

    move v7, v1

    invoke-interface {v15, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    move/from16 v56, v17

    move/from16 v62, v18

    move/from16 v63, v19

    :goto_8
    const/16 v0, 0x39

    const/4 v6, 0x4

    if-gt v2, v0, :cond_1a

    const/16 v0, 0x30

    if-lt v2, v0, :cond_1a

    if-eqz v44, :cond_17

    move-wide/from16 v4, v58

    shl-long v0, v4, v6

    aget v2, v29, v2

    int-to-long v2, v2

    or-long/2addr v2, v0

    goto :goto_9

    :cond_17
    move-wide/from16 v4, v58

    if-ne v2, v0, :cond_19

    if-eqz v41, :cond_18

    add-int/lit8 v40, v40, 0x1

    move-wide v2, v4

    goto :goto_9

    :cond_18
    move-wide v2, v4

    const/16 v41, 0x1

    goto :goto_9

    :cond_19
    shl-long v0, v4, v6

    aget v2, v29, v2

    int-to-long v2, v2

    or-long/2addr v2, v0

    const/16 v44, 0x1

    :goto_9
    add-int/lit8 v1, v7, 0x1

    move-object/from16 v13, p5

    move-wide/from16 v20, v2

    move/from16 v27, v9

    move-object v12, v11

    move-object v8, v15

    move/from16 v80, v23

    move-object/from16 v28, v37

    move/from16 v66, v43

    move/from16 v81, v45

    move-wide/from16 v82, v49

    move/from16 v9, v54

    move-object/from16 v45, v55

    move/from16 v0, v57

    move/from16 v4, v60

    move/from16 v6, v61

    const/4 v14, 0x1

    const/16 v43, 0x0

    :goto_a
    const/16 v58, 0x0

    move/from16 v37, p1

    goto/16 :goto_5a

    :cond_1a
    move-wide/from16 v4, v58

    const/16 v0, 0x61

    if-lt v2, v0, :cond_1b

    const/16 v0, 0x66

    if-gt v2, v0, :cond_1b

    shl-long v0, v4, v6

    aget v2, v29, v2

    int-to-long v2, v2

    or-long/2addr v0, v2

    add-int/lit8 v2, v7, 0x1

    move-object/from16 v13, p5

    move-wide/from16 v20, v0

    move v1, v2

    move/from16 v27, v9

    move-object v12, v11

    move-object v8, v15

    move/from16 v80, v23

    move-object/from16 v28, v37

    move/from16 v66, v43

    move/from16 v81, v45

    move-wide/from16 v82, v49

    move/from16 v9, v54

    move-object/from16 v45, v55

    move/from16 v0, v57

    move/from16 v4, v60

    move/from16 v6, v61

    const/4 v14, 0x1

    const/16 v43, 0x0

    const/16 v44, 0x1

    goto :goto_a

    :cond_1b
    const-string v1, "ipaddress.error.no.wildcard"

    const-string v3, "ipaddress.error.too.many.segments"

    const/high16 v19, 0x100000

    const-string v14, "ipaddress.error.empty.segment.at.index"

    const/high16 v20, 0x40000

    const-string v12, "ipaddress.error.segment.too.long.at.index"

    const-string v6, "ipaddress.error.segment.leading.zeros"

    if-ne v2, v13, :cond_6d

    invoke-virtual/range {v55 .. v55}, Linet/ipaddr/format/validate/a;->Z()I

    move-result v13

    if-nez v13, :cond_1d

    iget-boolean v2, v8, Linet/ipaddr/o;->i:Z

    if-eqz v2, :cond_1c

    sget-object v2, Linet/ipaddr/g$a;->IPV4:Linet/ipaddr/g$a;

    move-wide/from16 v58, v4

    move/from16 v3, v23

    move-object/from16 v5, p5

    invoke-virtual {v5, v2}, Linet/ipaddr/format/validate/c;->s1(Linet/ipaddr/g$a;)V

    move-object/from16 v4, v55

    const/4 v0, 0x4

    invoke-virtual {v4, v0}, Linet/ipaddr/format/validate/a;->t(I)V

    move-object/from16 v36, v2

    move-object v8, v5

    move-object/from16 v4, v37

    move-wide/from16 v64, v58

    const/16 v33, 0x0

    const/16 v35, 0x1

    const/16 v58, 0x0

    move v5, v3

    goto/16 :goto_c

    :cond_1c
    new-instance v0, Linet/ipaddr/AddressStringException;

    const-string v1, "ipaddress.error.ipv4"

    invoke-direct {v0, v15, v1}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0

    :cond_1d
    move-wide/from16 v58, v4

    move/from16 v2, v23

    move-object/from16 v4, v55

    move-object/from16 v5, p5

    invoke-virtual/range {p5 .. p5}, Linet/ipaddr/format/validate/c;->o0()Linet/ipaddr/g$a;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/g$a;->isIPv6()Z

    move-result v0

    if-eqz v0, :cond_21

    iget-boolean v0, v11, Linet/ipaddr/ipv6/j0;->i:Z

    if-eqz v0, :cond_20

    add-int/lit8 v0, v13, 0x2

    const/16 v1, 0x8

    if-gt v0, v1, :cond_1f

    if-lez v57, :cond_1e

    invoke-virtual {v4}, Linet/ipaddr/format/validate/a;->c()I

    move-result v3

    if-gez v3, :cond_1e

    if-ge v0, v1, :cond_1e

    iget-boolean v0, v11, Linet/ipaddr/d$a;->b:Z

    if-eqz v0, :cond_1e

    invoke-virtual {v4}, Linet/ipaddr/format/validate/a;->E0()V

    const-wide/32 v26, 0xffff

    const/high16 v28, 0x810000

    const-wide/16 v24, 0x0

    move/from16 v16, v54

    move/from16 v17, v7

    move/from16 v18, v54

    move/from16 v19, v54

    move/from16 v20, v7

    move/from16 v21, v54

    move-object/from16 v22, v4

    move/from16 v23, v13

    invoke-static/range {v16 .. v28}, Linet/ipaddr/format/validate/s;->g(IIIIIILinet/ipaddr/format/validate/a;IJJI)V

    invoke-virtual {v4}, Linet/ipaddr/format/validate/a;->s()V

    :cond_1e
    invoke-virtual {v11}, Linet/ipaddr/ipv6/j0;->r()Linet/ipaddr/o;

    move-result-object v6

    new-instance v7, Linet/ipaddr/format/validate/r;

    const/4 v12, 0x0

    invoke-direct {v7, v12, v15, v6}, Linet/ipaddr/format/validate/r;-><init>(LZf/f;Ljava/lang/CharSequence;Linet/ipaddr/o;)V

    const/4 v13, 0x1

    move-object v0, v6

    move-object/from16 v1, p2

    move v14, v2

    move/from16 v2, v54

    move/from16 v3, p1

    move-object/from16 v55, v4

    move-wide/from16 v64, v58

    move-object v4, v7

    move-object v8, v5

    move v5, v13

    invoke-static/range {v0 .. v5}, Linet/ipaddr/format/validate/s;->X(Linet/ipaddr/o;Ljava/lang/CharSequence;IILinet/ipaddr/format/validate/c;Z)V

    invoke-virtual {v7}, Linet/ipaddr/format/validate/c;->T0()V

    invoke-static {v15, v6, v7}, Linet/ipaddr/format/validate/s;->m(Ljava/lang/CharSequence;Linet/ipaddr/o;Linet/ipaddr/format/validate/c;)V

    invoke-virtual {v8, v7}, Linet/ipaddr/format/validate/c;->p1(Linet/ipaddr/format/validate/r;)V

    invoke-virtual {v7}, Linet/ipaddr/format/validate/c;->U0()Linet/ipaddr/format/validate/a;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/format/validate/a;->a()I

    move-result v1

    move-object/from16 v8, p0

    move/from16 v5, p1

    move v7, v9

    move v13, v14

    move/from16 v9, v54

    move-object/from16 v12, v55

    move/from16 v17, v56

    move/from16 v0, v57

    move/from16 v4, v60

    move/from16 v6, v61

    move/from16 v18, v62

    move/from16 v19, v63

    move-wide/from16 v20, v64

    :goto_b
    move/from16 v14, p3

    goto/16 :goto_0

    :cond_1f
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v15, v3}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0

    :cond_20
    new-instance v0, Linet/ipaddr/AddressStringException;

    const-string v1, "ipaddress.error.no.mixed"

    invoke-direct {v0, v15, v1}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0

    :cond_21
    move-object/from16 v55, v4

    move-object v8, v5

    move-wide/from16 v64, v58

    const/4 v0, 0x4

    const/16 v58, 0x0

    move v5, v2

    if-ge v13, v0, :cond_6c

    move-object/from16 v4, v42

    :goto_c
    if-lez v57, :cond_24

    iget-object v0, v4, Linet/ipaddr/d$a;->a:Linet/ipaddr/d$c;

    invoke-virtual {v0}, Linet/ipaddr/d$c;->n()Z

    move-result v0

    if-eqz v0, :cond_23

    sub-int v1, v7, v54

    move/from16 v3, v57

    if-ne v3, v1, :cond_22

    move/from16 v2, v43

    if-gez v2, :cond_22

    invoke-virtual/range {v55 .. v55}, Linet/ipaddr/format/validate/a;->E0()V

    sub-int v21, v7, v3

    const/high16 v28, 0x10000

    const-wide/16 v24, 0x0

    const-wide/16 v26, 0xff

    move/from16 v16, v21

    move/from16 v17, v7

    move/from16 v18, v21

    move/from16 v19, v21

    move/from16 v20, v7

    move-object/from16 v22, v55

    move/from16 v23, v13

    invoke-static/range {v16 .. v28}, Linet/ipaddr/format/validate/s;->g(IIIIIILinet/ipaddr/format/validate/a;IJJI)V

    move/from16 v43, v2

    move-object/from16 v42, v4

    move/from16 v80, v5

    move v14, v7

    move/from16 v27, v9

    move v12, v10

    move-object/from16 v67, v11

    move-object/from16 v28, v37

    move/from16 v81, v45

    move-wide/from16 v82, v49

    move/from16 v6, v61

    move-wide/from16 v2, v64

    const/4 v11, 0x0

    const/16 v69, 0x0

    move-object v10, v8

    move-object v8, v15

    goto/16 :goto_30

    :cond_22
    new-instance v0, Linet/ipaddr/AddressStringException;

    const/4 v1, 0x1

    invoke-direct {v0, v15, v7, v1}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;IZ)V

    throw v0

    :cond_23
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v15, v1}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0

    :cond_24
    move/from16 v2, v43

    move/from16 v3, v57

    move/from16 v0, v60

    const/4 v1, 0x1

    add-int v18, v0, v40

    sub-int v0, v7, v18

    if-eqz v41, :cond_28

    if-ne v0, v1, :cond_27

    if-nez v40, :cond_26

    move/from16 v1, v61

    if-gez v1, :cond_25

    if-gez v2, :cond_25

    const/16 v6, 0xa

    move/from16 v12, v60

    move/from16 v0, v18

    move v14, v1

    move v1, v7

    move/from16 v66, v2

    move-object/from16 v2, v55

    move/from16 v57, v3

    move v3, v13

    move-object v13, v4

    move v4, v6

    move v6, v5

    move v5, v12

    invoke-static/range {v0 .. v5}, Linet/ipaddr/format/validate/s;->f(IILinet/ipaddr/format/validate/a;III)V

    invoke-virtual/range {v55 .. v55}, Linet/ipaddr/format/validate/a;->s()V

    add-int/lit8 v0, v7, 0x1

    move-object/from16 v8, p0

    move/from16 v5, p1

    move v1, v0

    move v4, v1

    move v7, v9

    move-object/from16 v42, v13

    move-object/from16 v12, v55

    move/from16 v17, v56

    move/from16 v18, v62

    move/from16 v19, v63

    move-wide/from16 v20, v64

    move/from16 v43, v66

    const/16 v41, 0x0

    move v9, v4

    move v13, v6

    move v6, v14

    move/from16 v0, v57

    goto/16 :goto_b

    :cond_25
    move/from16 v66, v2

    move/from16 v57, v3

    move-object v2, v4

    move v4, v5

    move/from16 v5, v60

    move v3, v1

    goto :goto_d

    :cond_26
    move/from16 v66, v2

    move/from16 v57, v3

    move-object v2, v4

    move v4, v5

    move/from16 v5, v60

    move/from16 v3, v61

    goto :goto_d

    :cond_27
    move/from16 v66, v2

    move/from16 v57, v3

    move-object v2, v4

    move v4, v5

    move/from16 v5, v60

    move/from16 v3, v61

    add-int/lit8 v40, v40, 0x1

    add-int/lit8 v18, v18, 0x1

    add-int/lit8 v0, v0, -0x1

    :goto_d
    move/from16 v23, v4

    move/from16 v60, v5

    move/from16 v1, v18

    move/from16 v4, v40

    const/16 v41, 0x0

    goto :goto_e

    :cond_28
    move/from16 v66, v2

    move/from16 v57, v3

    move-object v2, v4

    move/from16 v3, v61

    move/from16 v23, v5

    move/from16 v1, v18

    move/from16 v4, v40

    :goto_e
    if-nez v0, :cond_2a

    if-ltz v3, :cond_29

    move/from16 v5, v66

    if-gez v5, :cond_29

    move/from16 v18, v9

    iget-object v9, v2, Linet/ipaddr/d$a;->a:Linet/ipaddr/d$c;

    invoke-virtual {v9}, Linet/ipaddr/d$c;->c()Z

    move-result v9

    if-eqz v9, :cond_29

    const-wide/16 v25, 0xff

    move-object/from16 v78, v2

    move/from16 v40, v4

    move/from16 v43, v5

    move-object v5, v6

    move v2, v7

    move-object v7, v8

    move/from16 p4, v10

    move-object/from16 v67, v11

    move-object v4, v12

    move-object/from16 v70, v14

    move-object v8, v15

    move/from16 v27, v18

    move/from16 v72, v23

    move-wide/from16 v9, v25

    move/from16 v69, v57

    const/4 v6, 0x0

    const/16 v12, 0xa

    const/high16 v17, 0x400000

    const/16 v74, 0x0

    move v15, v3

    move/from16 v26, v13

    const/4 v3, 0x1

    :goto_f
    move/from16 v93, v1

    move v1, v0

    move/from16 v0, v93

    goto/16 :goto_1e

    :cond_29
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v15, v14, v7}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;I)V

    throw v0

    :cond_2a
    move/from16 v18, v9

    move/from16 v5, v66

    if-lez v4, :cond_2b

    const/4 v9, 0x1

    goto :goto_10

    :cond_2b
    const/4 v9, 0x0

    :goto_10
    if-lez v34, :cond_2c

    const/16 v17, 0x1

    goto :goto_11

    :cond_2c
    const/16 v17, 0x0

    :goto_11
    if-ltz v5, :cond_34

    iget-boolean v5, v2, Linet/ipaddr/d$a;->c:Z

    if-eqz v5, :cond_33

    move/from16 v25, v4

    move-object/from16 v5, v37

    iget-boolean v4, v5, Linet/ipaddr/ipv4/Z;->i:Z

    if-eqz v4, :cond_32

    if-eqz v9, :cond_2d

    iget-boolean v4, v5, Linet/ipaddr/ipv4/Z;->k:Z

    if-eqz v4, :cond_2e

    :cond_2d
    const/16 v4, 0x8

    goto :goto_12

    :cond_2e
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v15, v6}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0

    :goto_12
    if-gt v0, v4, :cond_31

    const/4 v9, 0x1

    invoke-virtual {v8, v9}, Linet/ipaddr/format/validate/c;->u1(Z)V

    if-eqz v17, :cond_30

    if-gez v3, :cond_2f

    move-object v8, v5

    move v5, v9

    move/from16 p4, v10

    move/from16 v27, v18

    move-wide/from16 v9, v64

    move-object/from16 v67, v11

    move-object/from16 v11, p2

    move-object/from16 v68, v12

    move v12, v1

    move/from16 v26, v13

    move/from16 v69, v57

    move v13, v7

    move-object/from16 v70, v14

    move/from16 v14, v34

    move-object v4, v15

    move-object/from16 v15, v55

    move/from16 v16, v26

    move/from16 v17, v60

    move-object/from16 v18, v2

    invoke-static/range {v9 .. v18}, Linet/ipaddr/format/validate/s;->k(JLjava/lang/CharSequence;IIILinet/ipaddr/format/validate/a;IILinet/ipaddr/d$a;)V

    move v10, v5

    move-wide/from16 v64, v31

    const/16 v34, 0x0

    goto :goto_13

    :cond_2f
    move v5, v9

    move-object v4, v15

    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v4, v7, v5}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;IZ)V

    throw v0

    :cond_30
    move-object v8, v5

    move v5, v9

    move/from16 p4, v10

    move-object/from16 v67, v11

    move-object/from16 v68, v12

    move/from16 v26, v13

    move-object/from16 v70, v14

    move-object v4, v15

    move/from16 v27, v18

    move/from16 v69, v57

    const/4 v10, 0x0

    :goto_13
    move-object/from16 v78, v2

    move/from16 v77, v3

    move v3, v5

    move-object v5, v6

    move v2, v7

    move-object/from16 v37, v8

    move/from16 v74, v10

    move/from16 v72, v23

    move/from16 v40, v25

    move/from16 v43, v30

    const/4 v10, 0x0

    const/16 v12, 0x10

    move-object/from16 v7, p5

    move-object v8, v4

    move-object/from16 v4, v68

    goto/16 :goto_1d

    :cond_31
    move-object/from16 v68, v12

    move-object v4, v15

    new-instance v0, Linet/ipaddr/AddressStringException;

    move/from16 v14, v60

    move-object/from16 v15, v68

    invoke-direct {v0, v4, v15, v14}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;I)V

    throw v0

    :cond_32
    move-object v4, v15

    new-instance v0, Linet/ipaddr/AddressStringException;

    const-string v1, "ipaddress.error.ipv4.segment.hex"

    invoke-direct {v0, v4, v1}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0

    :cond_33
    move-object v4, v15

    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v4, v6}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0

    :cond_34
    move/from16 v25, v4

    move/from16 v43, v5

    move/from16 p4, v10

    move-object/from16 v67, v11

    move/from16 v26, v13

    move-object/from16 v70, v14

    move-object v4, v15

    move/from16 v27, v18

    move-object/from16 v8, v37

    move/from16 v69, v57

    move/from16 v14, v60

    const/4 v5, 0x1

    const/4 v13, 0x0

    move-object v15, v12

    if-eqz v9, :cond_36

    iget-boolean v10, v8, Linet/ipaddr/o$b;->f:Z

    if-eqz v10, :cond_35

    invoke-static {v4, v1}, Linet/ipaddr/format/validate/s;->v(Ljava/lang/CharSequence;I)Z

    move-result v10

    if-eqz v10, :cond_35

    move v10, v5

    goto :goto_14

    :cond_35
    move v10, v13

    :goto_14
    if-nez v10, :cond_37

    iget-boolean v11, v8, Linet/ipaddr/ipv4/Z;->j:Z

    if-eqz v11, :cond_36

    goto :goto_15

    :cond_36
    move-object/from16 p6, v2

    move/from16 v76, v3

    move v3, v5

    move-object v5, v6

    move v2, v7

    move-object/from16 v37, v8

    move/from16 v72, v23

    move/from16 v40, v25

    move/from16 v6, v43

    move-wide/from16 v12, v64

    move-object/from16 v7, p5

    move-object v8, v4

    move-object v4, v15

    move v15, v14

    goto/16 :goto_1b

    :cond_37
    :goto_15
    iget-boolean v9, v2, Linet/ipaddr/d$a;->c:Z

    if-eqz v9, :cond_43

    if-eqz v10, :cond_3d

    const/16 v9, 0x21

    if-gt v0, v9, :cond_3c

    add-int/lit8 v12, v1, 0x1

    add-int/lit8 v11, v0, -0x1

    move-object/from16 v9, p5

    invoke-virtual {v9, v5}, Linet/ipaddr/format/validate/c;->m1(Z)V

    if-eqz v17, :cond_3a

    if-gez v3, :cond_39

    const/16 v10, 0x10

    if-le v11, v10, :cond_38

    move-object/from16 v0, p2

    move v1, v12

    move-object/from16 p6, v2

    move v2, v7

    move/from16 v71, v3

    move/from16 v3, v34

    move-object/from16 v37, v8

    move/from16 v72, v23

    move/from16 v73, v25

    move-object v8, v4

    move-object/from16 v4, v55

    move/from16 v60, v14

    move/from16 v14, v43

    const/16 v10, 0xa

    move/from16 v5, v26

    move-object/from16 v75, v6

    move/from16 v6, v60

    move/from16 v28, v7

    move-object/from16 v7, p6

    invoke-static/range {v0 .. v7}, Linet/ipaddr/format/validate/s;->L(Ljava/lang/CharSequence;IIILinet/ipaddr/format/validate/a;IILinet/ipaddr/d$a;)V

    move-object v7, v9

    move v2, v10

    move v0, v11

    move v5, v13

    move v6, v14

    move-object v4, v15

    goto :goto_16

    :cond_38
    move-object/from16 p6, v2

    move/from16 v71, v3

    move-object/from16 v75, v6

    move/from16 v28, v7

    move-object/from16 v37, v8

    move-object v7, v9

    move/from16 v60, v14

    move/from16 v72, v23

    move/from16 v73, v25

    move/from16 v14, v43

    const/16 v2, 0xa

    move-object v8, v4

    move-wide/from16 v9, v64

    move v0, v11

    move-object/from16 v11, p2

    move v1, v12

    move v5, v13

    move/from16 v13, v28

    move v6, v14

    move/from16 v14, v34

    move-object v4, v15

    move-object/from16 v15, v55

    move/from16 v16, v26

    move/from16 v17, v60

    move-object/from16 v18, p6

    invoke-static/range {v9 .. v18}, Linet/ipaddr/format/validate/s;->P(JLjava/lang/CharSequence;IIILinet/ipaddr/format/validate/a;IILinet/ipaddr/d$a;)V

    :goto_16
    move-object/from16 v78, p6

    move v10, v5

    move/from16 v34, v10

    move/from16 v43, v6

    move/from16 v12, v22

    move/from16 v2, v28

    move-wide/from16 v64, v31

    move/from16 v77, v71

    move/from16 v40, v73

    move-object/from16 v5, v75

    const/4 v3, 0x1

    const/16 v74, 0x1

    goto/16 :goto_1d

    :cond_39
    move-object v8, v4

    move/from16 v28, v7

    new-instance v0, Linet/ipaddr/AddressStringException;

    move/from16 v15, v28

    const/4 v3, 0x1

    invoke-direct {v0, v8, v15, v3}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;IZ)V

    throw v0

    :cond_3a
    move-object/from16 p6, v2

    move/from16 v71, v3

    move v3, v5

    move-object/from16 v75, v6

    move-object/from16 v37, v8

    move v0, v11

    move v1, v12

    move v5, v13

    move/from16 v60, v14

    move/from16 v72, v23

    move/from16 v73, v25

    move/from16 v6, v43

    const/16 v2, 0xa

    const/16 v14, 0x10

    move-object v8, v4

    move-object v4, v15

    move v15, v7

    move-object v7, v9

    if-le v0, v14, :cond_3b

    invoke-static {v8, v1, v15}, Linet/ipaddr/format/validate/s;->H(Ljava/lang/CharSequence;II)J

    move-result-wide v64

    :goto_17
    move-object/from16 v78, p6

    move v10, v5

    move/from16 v74, v10

    move/from16 v43, v6

    move v2, v15

    move/from16 v12, v22

    move/from16 v77, v71

    move/from16 v40, v73

    move-object/from16 v5, v75

    goto/16 :goto_1d

    :cond_3b
    move-wide/from16 v12, v64

    invoke-static {v12, v13, v8, v0}, Linet/ipaddr/format/validate/s;->S(JLjava/lang/CharSequence;I)J

    move-result-wide v64

    goto :goto_17

    :cond_3c
    move-object v8, v4

    move/from16 v60, v14

    move-object v4, v15

    new-instance v0, Linet/ipaddr/AddressStringException;

    move/from16 v11, v60

    invoke-direct {v0, v8, v4, v11}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;I)V

    throw v0

    :cond_3d
    move-object/from16 p6, v2

    move/from16 v71, v3

    move v3, v5

    move-object/from16 v75, v6

    move-object/from16 v37, v8

    move v5, v13

    move v11, v14

    move/from16 v72, v23

    move/from16 v9, v25

    move/from16 v6, v43

    move-wide/from16 v12, v64

    const/16 v2, 0xa

    const/16 v14, 0x10

    move-object v8, v4

    move-object v4, v15

    move v15, v7

    move-object/from16 v7, p5

    move-object/from16 v10, v37

    if-le v9, v3, :cond_3e

    iget-boolean v5, v10, Linet/ipaddr/ipv4/Z;->k:Z

    if-eqz v5, :cond_3f

    :cond_3e
    move-object/from16 v5, v75

    goto :goto_18

    :cond_3f
    new-instance v0, Linet/ipaddr/AddressStringException;

    move-object/from16 v5, v75

    invoke-direct {v0, v8, v5}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0

    :goto_18
    const/16 v14, 0xb

    if-gt v0, v14, :cond_42

    invoke-virtual {v7, v3}, Linet/ipaddr/format/validate/c;->u1(Z)V

    if-eqz v17, :cond_41

    move/from16 v14, v71

    if-gez v14, :cond_40

    move/from16 v40, v9

    move-object/from16 v37, v10

    move-wide v9, v12

    move v13, v11

    move-object/from16 v11, p2

    move v12, v1

    move/from16 v60, v13

    move v13, v15

    move/from16 v76, v14

    move/from16 v14, v34

    move v2, v15

    move-object/from16 v15, v55

    move/from16 v16, v26

    move/from16 v17, v60

    move-object/from16 v18, p6

    invoke-static/range {v9 .. v18}, Linet/ipaddr/format/validate/s;->Q(JLjava/lang/CharSequence;IIILinet/ipaddr/format/validate/a;IILinet/ipaddr/d$a;)V

    move-object/from16 v78, p6

    move/from16 v74, v3

    move/from16 v43, v6

    move-wide/from16 v64, v31

    move/from16 v77, v76

    const/4 v10, 0x0

    const/16 v12, 0x8

    :goto_19
    const/16 v34, 0x0

    goto/16 :goto_1d

    :cond_40
    move v2, v15

    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v8, v2, v3}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;IZ)V

    throw v0

    :cond_41
    move/from16 v40, v9

    move-object/from16 v37, v10

    move/from16 v60, v11

    move v2, v15

    move/from16 v76, v71

    invoke-static {v12, v13, v8, v0}, Linet/ipaddr/format/validate/s;->T(JLjava/lang/CharSequence;I)J

    move-result-wide v64

    move-object/from16 v78, p6

    move/from16 v43, v6

    move/from16 v77, v76

    const/4 v10, 0x0

    const/16 v12, 0x8

    :goto_1a
    const/16 v74, 0x0

    goto/16 :goto_1d

    :cond_42
    move/from16 v60, v11

    new-instance v0, Linet/ipaddr/AddressStringException;

    move/from16 v15, v60

    invoke-direct {v0, v8, v4, v15}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;I)V

    throw v0

    :cond_43
    move-object v8, v4

    move-object v5, v6

    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v8, v5}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0

    :goto_1b
    move-object/from16 v14, p6

    if-eqz v9, :cond_44

    iget-boolean v9, v14, Linet/ipaddr/d$a;->c:Z

    if-eqz v9, :cond_45

    invoke-virtual {v7, v3}, Linet/ipaddr/format/validate/c;->n1(Z)V

    :cond_44
    const/16 v9, 0xa

    goto :goto_1c

    :cond_45
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v8, v5}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0

    :goto_1c
    if-gt v0, v9, :cond_6b

    if-eqz v17, :cond_47

    move/from16 v11, v76

    if-gez v11, :cond_46

    move-wide v9, v12

    move v13, v11

    move-object/from16 v11, p2

    move v12, v1

    move/from16 v77, v13

    move v13, v2

    move-object/from16 v78, v14

    move/from16 v14, v34

    move/from16 v60, v15

    move-object/from16 v15, v55

    move/from16 v16, v26

    move/from16 v17, v60

    move-object/from16 v18, v37

    invoke-static/range {v9 .. v18}, Linet/ipaddr/format/validate/s;->O(JLjava/lang/CharSequence;IIILinet/ipaddr/format/validate/a;IILinet/ipaddr/d$a;)V

    move/from16 v74, v3

    move/from16 v43, v6

    move-wide/from16 v64, v31

    const/4 v10, 0x0

    const/16 v12, 0xa

    goto :goto_19

    :cond_46
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v8, v2, v3}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;IZ)V

    throw v0

    :cond_47
    move-object/from16 v78, v14

    move/from16 v60, v15

    move/from16 v77, v76

    invoke-static {v12, v13, v8, v0}, Linet/ipaddr/format/validate/s;->R(JLjava/lang/CharSequence;I)J

    move-result-wide v64

    move/from16 v43, v6

    move/from16 v10, v20

    const/16 v12, 0xa

    goto :goto_1a

    :goto_1d
    move v6, v10

    move-wide/from16 v9, v64

    move/from16 v15, v77

    const/16 v17, 0x0

    const/16 v44, 0x0

    move-wide/from16 v64, v31

    goto/16 :goto_f

    :goto_1e
    if-ltz v15, :cond_69

    sub-int v11, v15, p4

    move/from16 v14, v72

    sub-int v13, v11, v14

    move/from16 p6, v0

    move-object/from16 v3, v78

    iget-object v0, v3, Linet/ipaddr/d$a;->a:Linet/ipaddr/d$c;

    invoke-virtual {v0}, Linet/ipaddr/d$c;->d()Z

    move-result v0

    if-eqz v0, :cond_68

    if-gtz v46, :cond_67

    if-gtz v38, :cond_67

    if-ne v11, v15, :cond_48

    const/4 v0, 0x1

    goto :goto_1f

    :cond_48
    const/4 v0, 0x0

    :goto_1f
    move/from16 v18, v12

    move/from16 v12, v45

    if-lez v14, :cond_49

    const/16 v16, 0x1

    goto :goto_20

    :cond_49
    const/16 v16, 0x0

    :goto_20
    if-ltz v12, :cond_51

    iget-boolean v6, v3, Linet/ipaddr/d$a;->c:Z

    if-eqz v6, :cond_50

    move/from16 v25, v12

    move-object/from16 v6, v37

    iget-boolean v12, v6, Linet/ipaddr/ipv4/Z;->i:Z

    if-eqz v12, :cond_4f

    if-eqz v16, :cond_4b

    iget-boolean v12, v6, Linet/ipaddr/ipv4/Z;->k:Z

    if-eqz v12, :cond_4a

    goto :goto_21

    :cond_4a
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v8, v5}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0

    :cond_4b
    :goto_21
    if-nez v0, :cond_4e

    move/from16 v12, p4

    const/16 v0, 0x8

    if-gt v12, v0, :cond_4d

    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Linet/ipaddr/format/validate/c;->u1(Z)V

    move-wide/from16 v4, v49

    cmp-long v0, v4, v9

    if-lez v0, :cond_4c

    if-eqz v1, :cond_4c

    const/4 v0, 0x1

    goto :goto_22

    :cond_4c
    const/4 v0, 0x0

    :goto_22
    move-wide/from16 v49, v4

    move-object/from16 v42, v6

    move v1, v12

    move v4, v2

    move-wide/from16 v5, v49

    const/16 v2, 0x10

    goto/16 :goto_2c

    :cond_4d
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v8, v4, v13}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;I)V

    throw v0

    :cond_4e
    new-instance v0, Linet/ipaddr/AddressStringException;

    move-object/from16 v1, v70

    invoke-direct {v0, v8, v1, v2}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;I)V

    throw v0

    :cond_4f
    new-instance v0, Linet/ipaddr/AddressStringException;

    const-string v1, "ipaddress.error.ipv4.segment.hex"

    invoke-direct {v0, v8, v1}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0

    :cond_50
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v8, v5}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0

    :cond_51
    move/from16 v28, v2

    move-object/from16 v75, v5

    move/from16 v25, v12

    move-object/from16 v2, v37

    move-object/from16 v79, v70

    move/from16 v12, p4

    move/from16 p4, v6

    move-wide/from16 v5, v49

    move/from16 v37, v0

    if-eqz v16, :cond_5a

    iget-boolean v0, v3, Linet/ipaddr/d$a;->c:Z

    if-eqz v0, :cond_5b

    iget-boolean v0, v2, Linet/ipaddr/o$b;->f:Z

    if-eqz v0, :cond_55

    invoke-static {v8, v11}, Linet/ipaddr/format/validate/s;->v(Ljava/lang/CharSequence;I)Z

    move-result v0

    if-eqz v0, :cond_55

    const/16 v0, 0x21

    if-gt v12, v0, :cond_54

    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Linet/ipaddr/format/validate/c;->m1(Z)V

    add-int/lit8 v11, v11, 0x1

    add-int/lit8 v0, v12, -0x1

    const/16 v12, 0x10

    if-le v0, v12, :cond_52

    invoke-static {v8, v11, v15}, Linet/ipaddr/format/validate/s;->H(Ljava/lang/CharSequence;II)J

    move-result-wide v49

    goto :goto_23

    :cond_52
    invoke-static {v5, v6, v8, v0}, Linet/ipaddr/format/validate/s;->S(JLjava/lang/CharSequence;I)J

    move-result-wide v49

    :goto_23
    if-eqz v1, :cond_53

    cmp-long v12, v49, v9

    if-lez v12, :cond_53

    const/4 v12, 0x1

    goto :goto_24

    :cond_53
    const/4 v12, 0x0

    :goto_24
    move-object/from16 v42, v2

    move v2, v12

    move v12, v0

    move-object/from16 v0, v75

    goto :goto_28

    :cond_54
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v8, v4, v13}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;I)V

    throw v0

    :cond_55
    iget-boolean v0, v2, Linet/ipaddr/ipv4/Z;->j:Z

    if-eqz v0, :cond_5a

    const/4 v0, 0x1

    if-le v14, v0, :cond_57

    iget-boolean v0, v2, Linet/ipaddr/ipv4/Z;->k:Z

    if-eqz v0, :cond_56

    move-object/from16 v42, v2

    move-object/from16 v0, v75

    goto :goto_25

    :cond_56
    new-instance v0, Linet/ipaddr/AddressStringException;

    move-object/from16 v1, v75

    invoke-direct {v0, v8, v1}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0

    :cond_57
    move-object/from16 v0, v75

    move-object/from16 v42, v2

    :goto_25
    const/16 v2, 0xb

    if-gt v12, v2, :cond_59

    const/4 v2, 0x1

    invoke-virtual {v7, v2}, Linet/ipaddr/format/validate/c;->u1(Z)V

    invoke-static {v5, v6, v8, v12}, Linet/ipaddr/format/validate/s;->T(JLjava/lang/CharSequence;I)J

    move-result-wide v49

    if-eqz v1, :cond_58

    cmp-long v2, v49, v9

    if-lez v2, :cond_58

    const/4 v2, 0x1

    goto :goto_26

    :cond_58
    const/4 v2, 0x0

    :goto_26
    const/16 v22, 0x8

    goto :goto_28

    :cond_59
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v8, v4, v13}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;I)V

    throw v0

    :cond_5a
    move-object/from16 v42, v2

    move-object/from16 v0, v75

    goto :goto_27

    :cond_5b
    move-object/from16 v0, v75

    new-instance v1, Linet/ipaddr/AddressStringException;

    invoke-direct {v1, v8, v0}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v1

    :goto_27
    move-wide/from16 v49, v31

    const/4 v2, 0x0

    const/16 v22, 0x0

    :goto_28
    if-nez v22, :cond_64

    if-eqz v37, :cond_5d

    iget-object v0, v3, Linet/ipaddr/d$a;->a:Linet/ipaddr/d$c;

    invoke-virtual {v0}, Linet/ipaddr/d$c;->c()Z

    move-result v0

    if-eqz v0, :cond_5c

    const/high16 v0, 0x200000

    or-int v17, v17, v0

    move v0, v2

    move v1, v12

    move/from16 v4, v28

    const/16 v2, 0xa

    goto :goto_2c

    :cond_5c
    new-instance v0, Linet/ipaddr/AddressStringException;

    move/from16 v2, v28

    move-object/from16 v7, v79

    invoke-direct {v0, v8, v7, v2}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;I)V

    throw v0

    :cond_5d
    const/16 v2, 0xa

    if-gt v12, v2, :cond_63

    invoke-static {v5, v6, v8, v12}, Linet/ipaddr/format/validate/s;->R(JLjava/lang/CharSequence;I)J

    move-result-wide v49

    if-eqz v16, :cond_5f

    iget-boolean v4, v3, Linet/ipaddr/d$a;->c:Z

    if-eqz v4, :cond_5e

    const/4 v4, 0x1

    invoke-virtual {v7, v4}, Linet/ipaddr/format/validate/c;->n1(Z)V

    goto :goto_29

    :cond_5e
    new-instance v1, Linet/ipaddr/AddressStringException;

    invoke-direct {v1, v8, v0}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v1

    :cond_5f
    :goto_29
    if-eqz v1, :cond_60

    cmp-long v0, v49, v9

    if-lez v0, :cond_60

    const/4 v0, 0x1

    goto :goto_2a

    :cond_60
    const/4 v0, 0x0

    :goto_2a
    if-nez v0, :cond_61

    if-nez v40, :cond_62

    and-int v1, p4, v20

    if-eqz v1, :cond_62

    const/high16 v1, 0xc0000

    or-int v17, v17, v1

    :cond_61
    :goto_2b
    move v1, v12

    move/from16 v4, v28

    goto :goto_2c

    :cond_62
    or-int v17, v17, v20

    goto :goto_2b

    :cond_63
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v8, v4, v13}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;I)V

    throw v0

    :cond_64
    move/from16 v4, v28

    move v0, v2

    move v1, v12

    move/from16 v2, v22

    :goto_2c
    if-eqz v0, :cond_66

    iget-object v0, v3, Linet/ipaddr/d$a;->a:Linet/ipaddr/d$c;

    invoke-virtual {v0}, Linet/ipaddr/d$c;->h()Z

    move-result v0

    if-eqz v0, :cond_65

    move/from16 v22, v2

    move v12, v11

    move-wide/from16 v20, v49

    move/from16 v11, v60

    move-wide/from16 v49, v9

    move/from16 v60, v13

    move v13, v15

    move/from16 v9, p6

    move v10, v4

    goto :goto_2d

    :cond_65
    new-instance v0, Linet/ipaddr/AddressStringException;

    const-string v1, "ipaddress.error.invalidRange"

    invoke-direct {v0, v8, v1}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0

    :cond_66
    move/from16 v12, p6

    move-wide/from16 v20, v9

    move v9, v11

    move v11, v13

    move v10, v15

    move/from16 v22, v18

    move/from16 v18, v2

    move v13, v4

    :goto_2d
    or-int v0, v17, v19

    or-int v0, v0, v18

    move/from16 v2, v25

    move v15, v14

    move/from16 v14, v60

    move/from16 v80, v15

    move-object/from16 v15, v55

    move/from16 v16, v26

    move-wide/from16 v17, v49

    move-wide/from16 v19, v20

    move/from16 v21, v0

    invoke-static/range {v9 .. v22}, Linet/ipaddr/format/validate/s;->i(IIIIIILinet/ipaddr/format/validate/a;IJJII)V

    move v12, v1

    move/from16 v81, v2

    move v14, v4

    move-wide/from16 v82, v5

    move-object v10, v7

    move/from16 v6, v30

    move-object/from16 v28, v42

    const/4 v11, 0x0

    move-object/from16 v42, v3

    goto :goto_2f

    :cond_67
    new-instance v0, Linet/ipaddr/AddressStringException;

    const/4 v11, 0x1

    invoke-direct {v0, v8, v15, v11}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;IZ)V

    throw v0

    :cond_68
    new-instance v0, Linet/ipaddr/AddressStringException;

    const-string v1, "ipaddress.error.no.range"

    invoke-direct {v0, v8, v1}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0

    :cond_69
    move/from16 p6, v0

    move v4, v2

    move v11, v3

    move/from16 v18, v12

    move-object/from16 v42, v37

    move/from16 v2, v45

    move/from16 v80, v72

    move-object/from16 v3, v78

    move/from16 v12, p4

    move/from16 p4, v6

    move-wide/from16 v5, v49

    if-nez v74, :cond_6a

    or-int v13, p4, v18

    move/from16 v0, p6

    move v1, v4

    move v14, v4

    move-object/from16 v28, v42

    move v4, v2

    move/from16 v2, v60

    move-object/from16 v42, v3

    move-object/from16 v3, v55

    move/from16 v81, v4

    move/from16 v4, v26

    move-wide/from16 v82, v5

    const/4 v11, 0x0

    move-wide v5, v9

    move-object v10, v7

    move v7, v13

    invoke-static/range {v0 .. v7}, Linet/ipaddr/format/validate/s;->d(IIILinet/ipaddr/format/validate/a;IJI)V

    goto :goto_2e

    :cond_6a
    move/from16 v81, v2

    move v14, v4

    move-wide/from16 v82, v5

    move-object v10, v7

    move-object/from16 v28, v42

    const/4 v11, 0x0

    move-object/from16 v42, v3

    :goto_2e
    move v6, v15

    :goto_2f
    move/from16 v40, v11

    move-wide/from16 v2, v64

    :goto_30
    invoke-virtual/range {v55 .. v55}, Linet/ipaddr/format/validate/a;->s()V

    add-int/lit8 v1, v14, 0x1

    move/from16 v37, p1

    move v4, v1

    move v9, v4

    move-wide/from16 v20, v2

    move-object v13, v10

    move v10, v12

    move/from16 v66, v43

    move-object/from16 v45, v55

    move-object/from16 v12, v67

    move/from16 v0, v69

    const/4 v14, 0x1

    move/from16 v43, v11

    goto/16 :goto_5a

    :cond_6b
    move/from16 v60, v15

    new-instance v0, Linet/ipaddr/AddressStringException;

    move/from16 v5, v60

    invoke-direct {v0, v8, v4, v5}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;I)V

    throw v0

    :cond_6c
    move-object v8, v15

    new-instance v0, Linet/ipaddr/AddressStringException;

    const-string v1, "ipaddress.error.ipv4.too.many.segments"

    invoke-direct {v0, v8, v1}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0

    :cond_6d
    move-object v0, v6

    move/from16 v27, v9

    move v9, v10

    move-object/from16 v67, v11

    move-object v8, v15

    move/from16 v80, v23

    move-object/from16 v28, v37

    move/from16 v6, v43

    move/from16 v81, v45

    move-wide/from16 v82, v49

    move/from16 v69, v57

    move/from16 v15, v61

    const/16 v11, 0x3a

    const/16 v58, 0x0

    move-object/from16 v10, p5

    move-object/from16 v93, v14

    move v14, v7

    move-object/from16 v7, v93

    move-wide/from16 v94, v4

    move-object v4, v12

    move-wide/from16 v12, v94

    move/from16 v5, v60

    if-ne v2, v11, :cond_bb

    invoke-virtual/range {v55 .. v55}, Linet/ipaddr/format/validate/a;->Z()I

    move-result v2

    if-nez v2, :cond_74

    move-object/from16 v11, p0

    iget-boolean v3, v11, Linet/ipaddr/o;->h:Z

    if-eqz v3, :cond_73

    sget-object v3, Linet/ipaddr/g$a;->IPV6:Linet/ipaddr/g$a;

    invoke-virtual {v10, v3}, Linet/ipaddr/format/validate/c;->s1(Linet/ipaddr/g$a;)V

    move-object/from16 v16, v3

    move/from16 v3, p3

    if-ne v14, v3, :cond_70

    add-int/lit8 v1, v14, 0x1

    move/from16 v0, p1

    if-eq v1, v0, :cond_6f

    invoke-interface {v8, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    const/16 v4, 0x3a

    if-ne v2, v4, :cond_6e

    move-object/from16 v2, v55

    const/16 v4, 0x8

    invoke-virtual {v2, v4}, Linet/ipaddr/format/validate/a;->t(I)V

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Linet/ipaddr/format/validate/a;->q0(I)V

    invoke-virtual {v2, v14}, Linet/ipaddr/format/validate/a;->f0(I)V

    invoke-static {v1, v1, v2, v4, v1}, Linet/ipaddr/format/validate/s;->c(IILinet/ipaddr/format/validate/a;II)V

    invoke-virtual {v2}, Linet/ipaddr/format/validate/a;->s()V

    add-int/lit8 v1, v14, 0x2

    move v5, v0

    move v14, v3

    move/from16 v33, v4

    move/from16 v43, v6

    move v10, v9

    move-wide/from16 v20, v12

    move v6, v15

    move-object/from16 v36, v16

    move/from16 v7, v27

    move-object/from16 v37, v28

    move/from16 v17, v56

    move/from16 v18, v62

    move/from16 v19, v63

    move-object/from16 v42, v67

    move/from16 v0, v69

    move/from16 v13, v80

    move/from16 v45, v81

    move-wide/from16 v49, v82

    const/16 v35, 0x1

    move v4, v1

    move v9, v4

    move-object v12, v2

    move-object v15, v8

    move-object v8, v11

    move-object/from16 v11, v42

    goto/16 :goto_0

    :cond_6e
    new-instance v0, Linet/ipaddr/AddressStringException;

    const-string v1, "ipaddress.error.ipv6.cannot.start.with.single.separator"

    invoke-direct {v0, v8, v1}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0

    :cond_6f
    new-instance v0, Linet/ipaddr/AddressStringException;

    const-string v1, "ipaddress.error.too.few.segments"

    invoke-direct {v0, v8, v1}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0

    :cond_70
    move/from16 v37, p1

    move-object/from16 v75, v0

    move-object/from16 v3, v55

    const/16 v0, 0x8

    const/16 v18, 0x0

    if-eqz v62, :cond_71

    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Linet/ipaddr/format/validate/a;->t(I)V

    goto :goto_31

    :cond_71
    const/4 v0, 0x1

    if-gez v6, :cond_72

    const/16 v0, 0x8

    invoke-virtual {v3, v0}, Linet/ipaddr/format/validate/a;->t(I)V

    :goto_31
    move/from16 p1, v9

    move-object/from16 v36, v16

    move/from16 v33, v18

    move/from16 v9, v54

    move-object/from16 v0, v67

    const/16 v35, 0x1

    goto :goto_32

    :cond_72
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v8, v6}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;I)V

    throw v0

    :cond_73
    new-instance v0, Linet/ipaddr/AddressStringException;

    const-string v1, "ipaddress.error.ipv6"

    invoke-direct {v0, v8, v1}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0

    :cond_74
    move-object/from16 v11, p0

    move/from16 v37, p1

    move-object/from16 v75, v0

    move-object v0, v3

    move-object/from16 v3, v55

    const/16 v18, 0x0

    invoke-virtual/range {p5 .. p5}, Linet/ipaddr/format/validate/c;->o0()Linet/ipaddr/g$a;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Linet/ipaddr/g$a;->isIPv4()Z

    move-result v16

    if-nez v16, :cond_ba

    move/from16 p1, v9

    const/16 v9, 0x8

    if-ge v2, v9, :cond_b9

    move-object/from16 v0, v42

    move/from16 v9, v54

    :goto_32
    if-ne v14, v9, :cond_76

    invoke-virtual {v3}, Linet/ipaddr/format/validate/a;->c()I

    move-result v1

    if-gez v1, :cond_75

    invoke-virtual {v3, v2}, Linet/ipaddr/format/validate/a;->q0(I)V

    add-int/lit8 v1, v14, -0x1

    invoke-virtual {v3, v1}, Linet/ipaddr/format/validate/a;->f0(I)V

    invoke-static {v14, v14, v3, v2, v14}, Linet/ipaddr/format/validate/s;->c(IILinet/ipaddr/format/validate/a;II)V

    invoke-virtual {v3}, Linet/ipaddr/format/validate/a;->s()V

    move/from16 v19, p1

    move-object/from16 v42, v0

    move-object/from16 v45, v3

    move/from16 v66, v6

    move-wide v2, v12

    move v6, v15

    move/from16 v43, v18

    move-object/from16 v12, v67

    move-object v13, v10

    move v10, v14

    :goto_33
    const/4 v14, 0x1

    goto/16 :goto_59

    :cond_75
    new-instance v0, Linet/ipaddr/AddressStringException;

    const-string v1, "ipaddress.error.ipv6.ambiguous"

    invoke-direct {v0, v8, v1}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0

    :cond_76
    move/from16 v61, v15

    move/from16 v15, v69

    if-lez v15, :cond_79

    if-nez v56, :cond_79

    iget-object v4, v0, Linet/ipaddr/d$a;->a:Linet/ipaddr/d$c;

    invoke-virtual {v4}, Linet/ipaddr/d$c;->n()Z

    move-result v4

    if-eqz v4, :cond_78

    sub-int v1, v14, v9

    if-ne v15, v1, :cond_77

    if-gez v6, :cond_77

    invoke-virtual {v3}, Linet/ipaddr/format/validate/a;->E0()V

    sub-int v1, v14, v15

    const/high16 v21, 0x10000

    const-wide/16 v4, 0x0

    const-wide/32 v19, 0xffff

    move/from16 v7, p1

    move v9, v1

    move-object v15, v10

    move v10, v14

    move/from16 v43, v18

    move v11, v1

    move-wide/from16 v64, v12

    move v12, v1

    move v13, v14

    move/from16 v84, v14

    move v14, v1

    move-object v1, v15

    move/from16 v85, v61

    move-object v15, v3

    move/from16 v16, v2

    move-wide/from16 v17, v4

    invoke-static/range {v9 .. v21}, Linet/ipaddr/format/validate/s;->g(IIIIIILinet/ipaddr/format/validate/a;IJJI)V

    invoke-virtual {v3}, Linet/ipaddr/format/validate/a;->s()V

    move-object/from16 v42, v0

    move-object v13, v1

    move-object/from16 v45, v3

    move/from16 v66, v6

    move/from16 v19, v7

    move/from16 v69, v43

    move-wide/from16 v2, v64

    move-object/from16 v12, v67

    move/from16 v10, v84

    move/from16 v6, v85

    goto :goto_33

    :cond_77
    move/from16 v84, v14

    new-instance v0, Linet/ipaddr/AddressStringException;

    move/from16 v13, v84

    const/4 v14, 0x1

    invoke-direct {v0, v8, v13, v14}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;IZ)V

    throw v0

    :cond_78
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v8, v1}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0

    :cond_79
    move-object v1, v10

    move-wide/from16 v64, v12

    move v13, v14

    move/from16 v43, v18

    move/from16 v85, v61

    const/4 v14, 0x1

    move/from16 v12, p1

    sub-int v9, v13, v5

    if-eqz v41, :cond_7d

    if-ne v9, v14, :cond_7b

    move/from16 v11, v85

    if-nez v40, :cond_7a

    if-gez v11, :cond_7a

    invoke-static {v5, v13, v3, v2, v5}, Linet/ipaddr/format/validate/s;->c(IILinet/ipaddr/format/validate/a;II)V

    invoke-virtual {v3}, Linet/ipaddr/format/validate/a;->s()V

    add-int/lit8 v9, v13, 0x1

    move/from16 v14, p3

    move-object/from16 v42, v0

    move v1, v9

    move v4, v1

    move v10, v12

    move v0, v15

    move/from16 v7, v27

    move/from16 v5, v37

    move/from16 v41, v43

    move/from16 v17, v56

    move/from16 v18, v62

    move/from16 v19, v63

    move-wide/from16 v20, v64

    move/from16 v13, v80

    move/from16 v45, v81

    move-wide/from16 v49, v82

    move-object v12, v3

    move/from16 v43, v6

    move-object v15, v8

    move v6, v11

    move-object/from16 v37, v28

    move-object/from16 v11, v67

    :goto_34
    move-object/from16 v8, p0

    goto/16 :goto_0

    :cond_7a
    move v10, v5

    goto :goto_35

    :cond_7b
    move/from16 v11, v85

    if-eqz v44, :cond_7c

    add-int/lit8 v40, v40, 0x1

    :cond_7c
    add-int v10, v5, v40

    sub-int v9, v9, v40

    :goto_35
    move/from16 v66, v6

    move/from16 v6, v40

    move/from16 v41, v43

    move/from16 v93, v10

    move v10, v9

    move/from16 v9, v93

    goto :goto_36

    :cond_7d
    move/from16 v11, v85

    move/from16 v66, v6

    move v10, v9

    move/from16 v6, v40

    move v9, v5

    :goto_36
    if-nez v6, :cond_89

    if-nez v10, :cond_80

    iget-object v10, v0, Linet/ipaddr/d$a;->a:Linet/ipaddr/d$c;

    invoke-virtual {v10}, Linet/ipaddr/d$c;->c()Z

    move-result v10

    if-eqz v10, :cond_7f

    if-eqz v56, :cond_7e

    const-wide/16 v51, -0x1

    move-wide/from16 v23, v51

    goto :goto_37

    :cond_7e
    const-wide/32 v23, 0xffff

    move-wide/from16 v93, v23

    move-wide/from16 v23, v51

    move-wide/from16 v51, v93

    :goto_37
    move-object/from16 v45, v3

    move-object/from16 v92, v4

    move v3, v5

    move/from16 v40, v6

    move-object/from16 v91, v7

    move/from16 v86, v12

    move v7, v14

    move/from16 v87, v15

    move/from16 v10, v43

    move/from16 v18, v10

    move-wide/from16 v14, v51

    move-object/from16 v4, v67

    const/high16 v17, 0x400000

    move-object v6, v0

    move-object v5, v1

    move v0, v11

    move-object/from16 v1, v75

    move-wide/from16 v93, v23

    move/from16 v23, v2

    move v2, v13

    move-wide/from16 v12, v93

    goto/16 :goto_47

    :cond_7f
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v8, v7, v13}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;I)V

    throw v0

    :cond_80
    move-object/from16 v70, v7

    const/4 v7, 0x4

    if-le v10, v7, :cond_82

    if-nez v63, :cond_81

    goto :goto_38

    :cond_81
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v8, v4, v5}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;I)V

    throw v0

    :cond_82
    :goto_38
    if-lez v34, :cond_85

    if-gez v11, :cond_84

    if-eqz v56, :cond_83

    move/from16 p1, v9

    move-wide/from16 v9, v64

    move v7, v11

    move-object/from16 v11, p2

    move/from16 v86, v12

    move/from16 v12, p1

    move/from16 v84, v13

    move-object/from16 v68, v4

    move v4, v14

    move/from16 v14, v34

    move/from16 v87, v15

    move-object v15, v3

    move/from16 v16, v2

    move/from16 v17, v5

    move-object/from16 v18, v0

    invoke-static/range {v9 .. v18}, Linet/ipaddr/format/validate/s;->K(JLjava/lang/CharSequence;IIILinet/ipaddr/format/validate/a;IILinet/ipaddr/d$a;)V

    goto :goto_39

    :cond_83
    move-object/from16 v68, v4

    move/from16 p1, v9

    move v7, v11

    move/from16 v86, v12

    move/from16 v84, v13

    move v4, v14

    move/from16 v87, v15

    move-wide/from16 v9, v64

    move-object/from16 v11, p2

    move/from16 v12, p1

    move/from16 v14, v34

    move-object v15, v3

    move/from16 v16, v2

    move/from16 v17, v5

    move-object/from16 v18, v0

    invoke-static/range {v9 .. v18}, Linet/ipaddr/format/validate/s;->k(JLjava/lang/CharSequence;IIILinet/ipaddr/format/validate/a;IILinet/ipaddr/d$a;)V

    :goto_39
    move/from16 v14, p1

    move v10, v4

    move-wide/from16 v64, v31

    move/from16 v9, v43

    move/from16 v34, v9

    move/from16 v47, v34

    move/from16 v15, v84

    goto :goto_3b

    :cond_84
    move/from16 v84, v13

    move v4, v14

    new-instance v0, Linet/ipaddr/AddressStringException;

    move/from16 v15, v84

    invoke-direct {v0, v8, v15, v4}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;IZ)V

    throw v0

    :cond_85
    move-object/from16 v68, v4

    move/from16 p1, v9

    move v7, v11

    move/from16 v86, v12

    move v4, v14

    move/from16 v87, v15

    move v15, v13

    if-eqz v56, :cond_87

    add-int/lit8 v9, v15, -0x10

    move/from16 v14, p1

    if-ge v14, v9, :cond_86

    invoke-static {v8, v14, v9}, Linet/ipaddr/format/validate/s;->G(Ljava/lang/CharSequence;II)J

    move-result-wide v51

    invoke-static {v8, v9, v15}, Linet/ipaddr/format/validate/s;->G(Ljava/lang/CharSequence;II)J

    move-result-wide v9

    goto :goto_3a

    :cond_86
    move-wide/from16 v9, v64

    :goto_3a
    move-wide/from16 v64, v9

    move/from16 v9, v43

    move v10, v9

    goto :goto_3b

    :cond_87
    move/from16 v14, p1

    if-eqz v47, :cond_88

    move/from16 v9, v43

    move v10, v9

    move/from16 v47, v10

    goto :goto_3b

    :cond_88
    move/from16 v9, v20

    move/from16 v10, v43

    :goto_3b
    move/from16 v23, v2

    move-object/from16 v45, v3

    move v3, v5

    move/from16 v40, v6

    move/from16 v18, v9

    move v9, v14

    move v2, v15

    move/from16 v17, v43

    move/from16 v44, v17

    move-wide/from16 v12, v51

    move-wide/from16 v14, v64

    move-object/from16 v92, v68

    move-object/from16 v91, v70

    move-object v6, v0

    move-object v5, v1

    move v0, v7

    move-wide/from16 v64, v31

    move-object/from16 v1, v75

    move v7, v4

    move-object/from16 v4, v67

    goto/16 :goto_47

    :cond_89
    move-object/from16 v68, v4

    move-object/from16 v70, v7

    move v7, v11

    move/from16 v86, v12

    move v4, v14

    move/from16 v87, v15

    move v14, v9

    move v15, v13

    if-ne v6, v4, :cond_8b

    const/16 v9, 0x11

    if-eq v10, v9, :cond_8a

    const/16 v9, 0x81

    if-ne v10, v9, :cond_8b

    :cond_8a
    move-object/from16 v13, v67

    goto :goto_3d

    :cond_8b
    move/from16 v23, v2

    move-object/from16 v45, v3

    move v3, v5

    move/from16 v40, v6

    move/from16 v90, v7

    move v2, v15

    move-wide/from16 v12, v64

    move-object/from16 v88, v68

    move-object/from16 v91, v70

    move-object v6, v0

    move-object v5, v1

    move v7, v4

    move-object/from16 v4, v67

    :goto_3c
    move-object/from16 v1, v75

    const/4 v0, 0x4

    goto/16 :goto_41

    :goto_3d
    iget-boolean v9, v13, Linet/ipaddr/o$b;->f:Z

    if-eqz v9, :cond_91

    invoke-static {v8, v14}, Linet/ipaddr/format/validate/s;->v(Ljava/lang/CharSequence;I)Z

    move-result v9

    if-eqz v9, :cond_91

    iget-boolean v9, v0, Linet/ipaddr/d$a;->c:Z

    if-eqz v9, :cond_90

    add-int/lit8 v14, v14, 0x1

    add-int/lit8 v10, v10, -0x1

    if-lez v34, :cond_8e

    if-gez v7, :cond_8d

    if-eqz v56, :cond_8c

    move-object v12, v0

    move-object/from16 v9, v75

    move-object/from16 v0, p2

    move-object v11, v1

    move v1, v14

    move/from16 v23, v2

    move v2, v15

    move-object/from16 v45, v3

    move/from16 v3, v34

    move v10, v4

    move-object/from16 v88, v68

    move-object/from16 v4, v45

    move-object/from16 v89, v9

    move v9, v5

    move/from16 v5, v23

    move/from16 v40, v6

    move v6, v9

    move/from16 v90, v7

    move-object/from16 v91, v70

    move-object v7, v12

    invoke-static/range {v0 .. v7}, Linet/ipaddr/format/validate/s;->L(Ljava/lang/CharSequence;IIILinet/ipaddr/format/validate/a;IILinet/ipaddr/d$a;)V

    move v3, v9

    move v7, v10

    move-object v5, v11

    move-object v6, v12

    move-object v4, v13

    move v0, v14

    goto :goto_3e

    :cond_8c
    move-object v12, v0

    move-object v11, v1

    move/from16 v23, v2

    move-object/from16 v45, v3

    move v3, v5

    move/from16 v40, v6

    move/from16 v90, v7

    move-object/from16 v88, v68

    move-object/from16 v91, v70

    move-object/from16 v89, v75

    move v7, v4

    move-wide/from16 v9, v64

    move-object v5, v11

    move-object/from16 v11, p2

    move-object v6, v12

    move v12, v14

    move-object v4, v13

    move v13, v15

    move v0, v14

    move/from16 v14, v34

    move v2, v15

    move-object/from16 v15, v45

    move/from16 v16, v23

    move/from16 v17, v3

    move-object/from16 v18, v6

    invoke-static/range {v9 .. v18}, Linet/ipaddr/format/validate/s;->P(JLjava/lang/CharSequence;IIILinet/ipaddr/format/validate/a;IILinet/ipaddr/d$a;)V

    :goto_3e
    move v1, v7

    move-wide/from16 v9, v31

    move/from16 v11, v43

    move/from16 v34, v11

    goto :goto_40

    :cond_8d
    move v7, v4

    move v2, v15

    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v8, v2, v7}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;IZ)V

    throw v0

    :cond_8e
    move/from16 v23, v2

    move-object/from16 v45, v3

    move v3, v5

    move/from16 v40, v6

    move/from16 v90, v7

    move v2, v15

    move-object/from16 v88, v68

    move-object/from16 v91, v70

    move-object/from16 v89, v75

    move-object v6, v0

    move-object v5, v1

    move v7, v4

    move-object v4, v13

    move v0, v14

    if-eqz v56, :cond_8f

    add-int/lit8 v1, v2, -0x40

    invoke-static {v8, v0, v1}, Linet/ipaddr/format/validate/s;->H(Ljava/lang/CharSequence;II)J

    move-result-wide v51

    invoke-static {v8, v1, v2}, Linet/ipaddr/format/validate/s;->H(Ljava/lang/CharSequence;II)J

    move-result-wide v9

    goto :goto_3f

    :cond_8f
    move-wide/from16 v12, v64

    invoke-static {v12, v13, v8, v10}, Linet/ipaddr/format/validate/s;->S(JLjava/lang/CharSequence;I)J

    move-result-wide v9

    :goto_3f
    move/from16 v11, v22

    move/from16 v1, v43

    :goto_40
    invoke-virtual {v5, v7}, Linet/ipaddr/format/validate/c;->m1(Z)V

    move-wide v14, v9

    move/from16 v18, v11

    move-wide/from16 v64, v31

    move/from16 v17, v43

    move/from16 v44, v17

    move-wide/from16 v12, v51

    move-object/from16 v92, v88

    move v9, v0

    move v10, v1

    move-object/from16 v1, v89

    move/from16 v0, v90

    goto/16 :goto_47

    :cond_90
    move-object/from16 v89, v75

    new-instance v0, Linet/ipaddr/AddressStringException;

    move-object/from16 v1, v89

    invoke-direct {v0, v8, v1}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0

    :cond_91
    move/from16 v23, v2

    move-object/from16 v45, v3

    move v3, v5

    move/from16 v40, v6

    move/from16 v90, v7

    move v2, v15

    move-object/from16 v88, v68

    move-object/from16 v91, v70

    move-object v6, v0

    move-object v5, v1

    move v7, v4

    move-object v4, v13

    move-wide/from16 v12, v64

    goto/16 :goto_3c

    :goto_41
    if-le v10, v0, :cond_92

    if-nez v63, :cond_93

    :cond_92
    move-object/from16 v15, v88

    goto :goto_42

    :cond_93
    new-instance v0, Linet/ipaddr/AddressStringException;

    move-object/from16 v15, v88

    invoke-direct {v0, v8, v15, v3}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;I)V

    throw v0

    :goto_42
    iget-boolean v9, v6, Linet/ipaddr/d$a;->c:Z

    if-eqz v9, :cond_b8

    iget-boolean v9, v6, Linet/ipaddr/d$a;->d:Z

    if-nez v9, :cond_95

    if-eqz v63, :cond_95

    add-int v10, v10, v40

    if-gt v10, v0, :cond_94

    goto :goto_43

    :cond_94
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v8, v15, v3}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;I)V

    throw v0

    :cond_95
    :goto_43
    if-lez v34, :cond_98

    move/from16 v11, v90

    if-gez v11, :cond_97

    if-eqz v56, :cond_96

    move-wide v9, v12

    move v13, v11

    move-object/from16 v11, p2

    move v12, v14

    move v0, v13

    move v13, v2

    move/from16 p1, v14

    move/from16 v14, v34

    move-object/from16 v92, v15

    move-object/from16 v15, v45

    move/from16 v16, v23

    move/from16 v17, v3

    move-object/from16 v18, v6

    invoke-static/range {v9 .. v18}, Linet/ipaddr/format/validate/s;->K(JLjava/lang/CharSequence;IIILinet/ipaddr/format/validate/a;IILinet/ipaddr/d$a;)V

    goto :goto_44

    :cond_96
    move v0, v11

    move/from16 p1, v14

    move-object/from16 v92, v15

    move-wide v9, v12

    move-object/from16 v11, p2

    move/from16 v12, p1

    move v13, v2

    move/from16 v14, v34

    move-object/from16 v15, v45

    move/from16 v16, v23

    move/from16 v17, v3

    move-object/from16 v18, v6

    invoke-static/range {v9 .. v18}, Linet/ipaddr/format/validate/s;->k(JLjava/lang/CharSequence;IIILinet/ipaddr/format/validate/a;IILinet/ipaddr/d$a;)V

    :goto_44
    move/from16 v10, p1

    move v9, v7

    move-wide/from16 v12, v31

    move/from16 v11, v43

    move/from16 v34, v11

    move/from16 v47, v34

    goto :goto_46

    :cond_97
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v8, v2, v7}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;IZ)V

    throw v0

    :cond_98
    move/from16 p1, v14

    move-object/from16 v92, v15

    move/from16 v0, v90

    if-eqz v56, :cond_9a

    add-int/lit8 v9, v2, -0x10

    move/from16 v10, p1

    if-ge v10, v9, :cond_99

    invoke-static {v8, v10, v9}, Linet/ipaddr/format/validate/s;->G(Ljava/lang/CharSequence;II)J

    move-result-wide v51

    invoke-static {v8, v9, v2}, Linet/ipaddr/format/validate/s;->G(Ljava/lang/CharSequence;II)J

    move-result-wide v11

    goto :goto_45

    :cond_99
    move-wide v11, v12

    :goto_45
    move-wide v12, v11

    move/from16 v9, v43

    move v11, v9

    goto :goto_46

    :cond_9a
    move/from16 v10, p1

    if-eqz v47, :cond_9b

    move/from16 v9, v43

    move v11, v9

    move/from16 v47, v11

    goto :goto_46

    :cond_9b
    move/from16 v11, v20

    move/from16 v9, v43

    :goto_46
    move/from16 v18, v11

    move-wide v14, v12

    move-wide/from16 v64, v31

    move/from16 v17, v43

    move/from16 v44, v17

    move-wide/from16 v12, v51

    move/from16 v93, v10

    move v10, v9

    move/from16 v9, v93

    :goto_47
    if-ltz v0, :cond_b5

    move/from16 v11, v86

    sub-int v10, v0, v11

    move/from16 v60, v3

    move/from16 v7, v80

    sub-int v3, v10, v7

    move/from16 p1, v9

    add-int v9, v11, v7

    move/from16 p6, v3

    iget-object v3, v6, Linet/ipaddr/d$a;->a:Linet/ipaddr/d$c;

    invoke-virtual {v3}, Linet/ipaddr/d$c;->d()Z

    move-result v3

    if-eqz v3, :cond_b4

    move/from16 v3, v81

    if-ltz v3, :cond_9d

    if-eqz v62, :cond_9c

    goto :goto_48

    :cond_9c
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v8, v3}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;I)V

    throw v0

    :cond_9d
    :goto_48
    if-gtz v46, :cond_b3

    if-gtz v38, :cond_b3

    if-ne v10, v0, :cond_9e

    const/16 v16, 0x1

    goto :goto_49

    :cond_9e
    move/from16 v16, v43

    :goto_49
    if-eqz v16, :cond_a0

    iget-object v1, v6, Linet/ipaddr/d$a;->a:Linet/ipaddr/d$c;

    invoke-virtual {v1}, Linet/ipaddr/d$c;->c()Z

    move-result v1

    if-eqz v1, :cond_9f

    const/high16 v1, 0x200000

    or-int v22, v17, v1

    move/from16 v84, v2

    move/from16 v81, v3

    move-object/from16 v67, v4

    move/from16 v17, v10

    move v1, v11

    move-wide/from16 v9, v31

    move-wide/from16 v49, v9

    move/from16 v11, v43

    move/from16 v24, v11

    move/from16 v26, v24

    move-wide/from16 v3, v82

    :goto_4a
    move/from16 v2, p6

    goto/16 :goto_53

    :cond_9f
    new-instance v0, Linet/ipaddr/AddressStringException;

    move-object/from16 v1, v91

    invoke-direct {v0, v8, v1, v2}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;I)V

    throw v0

    :cond_a0
    move/from16 v81, v3

    const/4 v3, 0x1

    if-ne v7, v3, :cond_a2

    const/16 v3, 0x11

    if-ne v11, v3, :cond_a2

    iget-boolean v3, v4, Linet/ipaddr/o$b;->f:Z

    if-eqz v3, :cond_a2

    invoke-static {v8, v10}, Linet/ipaddr/format/validate/s;->v(Ljava/lang/CharSequence;I)Z

    move-result v3

    if-eqz v3, :cond_a2

    add-int/lit8 v10, v10, 0x1

    add-int/lit8 v1, v11, -0x1

    move-object/from16 v67, v4

    move/from16 v17, v10

    move-wide/from16 v3, v82

    invoke-static {v3, v4, v8, v1}, Linet/ipaddr/format/validate/s;->S(JLjava/lang/CharSequence;I)J

    move-result-wide v9

    const/4 v11, 0x1

    invoke-virtual {v5, v11}, Linet/ipaddr/format/validate/c;->m1(Z)V

    invoke-static {v9, v10, v14, v15}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result v11

    if-lez v11, :cond_a1

    const/4 v11, 0x1

    goto :goto_4b

    :cond_a1
    move/from16 v11, v43

    :goto_4b
    move/from16 v84, v2

    move-wide/from16 v49, v9

    move/from16 v24, v11

    move/from16 v26, v22

    move-wide/from16 v9, v31

    const/4 v11, 0x1

    goto :goto_4a

    :cond_a2
    move-object/from16 v67, v4

    move-wide/from16 v3, v82

    if-eqz v56, :cond_a7

    const/16 v1, 0x81

    if-ne v11, v1, :cond_a3

    add-int/lit8 v10, v10, 0x1

    add-int/lit8 v1, v11, -0x1

    const/4 v9, 0x1

    invoke-virtual {v5, v9}, Linet/ipaddr/format/validate/c;->m1(Z)V

    add-int/lit8 v9, v0, -0x40

    invoke-static {v8, v10, v9}, Linet/ipaddr/format/validate/s;->H(Ljava/lang/CharSequence;II)J

    move-result-wide v24

    invoke-static {v8, v9, v0}, Linet/ipaddr/format/validate/s;->H(Ljava/lang/CharSequence;II)J

    move-result-wide v49

    move v11, v1

    move/from16 v84, v2

    move/from16 v21, v10

    move/from16 v17, v22

    move-wide/from16 v9, v24

    :goto_4c
    move-wide/from16 v1, v49

    goto :goto_4d

    :cond_a3
    add-int/lit8 v1, v0, -0x10

    if-ge v10, v1, :cond_a4

    invoke-static {v8, v10, v1}, Linet/ipaddr/format/validate/s;->G(Ljava/lang/CharSequence;II)J

    move-result-wide v24

    invoke-static {v8, v1, v0}, Linet/ipaddr/format/validate/s;->G(Ljava/lang/CharSequence;II)J

    move-result-wide v49

    move/from16 v84, v2

    move/from16 v21, v10

    move-wide/from16 v9, v24

    move/from16 v22, v43

    goto :goto_4c

    :cond_a4
    move/from16 v84, v2

    move-wide v1, v3

    move/from16 v21, v10

    move-wide/from16 v9, v31

    move/from16 v22, v43

    :goto_4d
    invoke-static {v9, v10, v12, v13}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result v24

    if-gtz v24, :cond_a6

    if-nez v24, :cond_a5

    invoke-static {v1, v2, v14, v15}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result v24

    if-lez v24, :cond_a5

    goto :goto_4e

    :cond_a5
    move/from16 v24, v43

    goto :goto_4f

    :cond_a6
    :goto_4e
    const/16 v24, 0x1

    :goto_4f
    move-wide/from16 v49, v1

    move v1, v11

    move/from16 v26, v22

    move/from16 v11, v43

    move/from16 v2, p6

    move/from16 v22, v17

    move/from16 v17, v21

    goto :goto_53

    :cond_a7
    move/from16 v84, v2

    iget-boolean v2, v6, Linet/ipaddr/d$a;->c:Z

    if-nez v2, :cond_a9

    if-gtz v7, :cond_a8

    goto :goto_50

    :cond_a8
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v8, v1}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0

    :cond_a9
    :goto_50
    if-eqz v63, :cond_aa

    const/4 v1, 0x4

    if-gt v11, v1, :cond_ac

    iget-boolean v2, v6, Linet/ipaddr/d$a;->d:Z

    if-nez v2, :cond_aa

    if-gt v9, v1, :cond_ab

    :cond_aa
    move/from16 v2, p6

    goto :goto_51

    :cond_ab
    new-instance v0, Linet/ipaddr/AddressStringException;

    move/from16 v2, p6

    move-object/from16 v1, v92

    invoke-direct {v0, v8, v1, v2}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;I)V

    throw v0

    :cond_ac
    move/from16 v2, p6

    move-object/from16 v1, v92

    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v8, v1, v2}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;I)V

    throw v0

    :goto_51
    invoke-static {v3, v4, v14, v15}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result v1

    if-lez v1, :cond_ad

    const/4 v1, 0x1

    goto :goto_52

    :cond_ad
    move/from16 v1, v43

    :goto_52
    move/from16 v24, v1

    move-wide/from16 v49, v3

    move v1, v11

    move/from16 v22, v17

    move/from16 v11, v43

    move/from16 v26, v11

    move/from16 v17, v10

    move-wide/from16 v9, v31

    :goto_53
    move/from16 p6, v1

    if-eqz v24, :cond_af

    iget-object v1, v6, Linet/ipaddr/d$a;->a:Linet/ipaddr/d$c;

    invoke-virtual {v1}, Linet/ipaddr/d$c;->h()Z

    move-result v1

    if-eqz v1, :cond_ae

    move-wide/from16 v51, v12

    move/from16 v12, v17

    move-wide/from16 v54, v49

    move v13, v0

    move-wide v0, v9

    move-wide/from16 v49, v14

    move/from16 v10, v84

    move/from16 v9, p1

    move v14, v2

    goto :goto_54

    :cond_ae
    new-instance v0, Linet/ipaddr/AddressStringException;

    const-string v1, "ipaddress.error.invalidRange"

    invoke-direct {v0, v8, v1}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0

    :cond_af
    move-wide/from16 v51, v9

    move-wide/from16 v54, v14

    move/from16 v9, v17

    move/from16 v14, v60

    move v10, v0

    move/from16 v60, v2

    move-wide v0, v12

    move/from16 v13, v84

    move/from16 v12, p1

    :goto_54
    if-eqz v56, :cond_b0

    or-int v25, v22, v19

    move/from16 v11, v60

    move-object/from16 v15, v45

    move/from16 v16, v23

    move-wide/from16 v17, v49

    move-wide/from16 v19, v51

    move-wide/from16 v21, v54

    move-wide/from16 v23, v0

    invoke-static/range {v9 .. v26}, Linet/ipaddr/format/validate/s;->j(IIIIIILinet/ipaddr/format/validate/a;IJJJJII)V

    goto :goto_56

    :cond_b0
    if-nez v48, :cond_b2

    if-nez v16, :cond_b2

    if-nez v24, :cond_b2

    if-nez v11, :cond_b2

    if-nez v40, :cond_b1

    and-int v2, v18, v20

    if-eqz v2, :cond_b1

    if-eqz v53, :cond_b1

    const/high16 v2, 0xc0000

    or-int v22, v22, v2

    goto :goto_55

    :cond_b1
    or-int v22, v22, v20

    :cond_b2
    :goto_55
    or-int v21, v22, v19

    move/from16 v11, v60

    move-object/from16 v15, v45

    move/from16 v16, v23

    move-wide/from16 v17, v49

    move-wide/from16 v19, v54

    move/from16 v22, v26

    invoke-static/range {v9 .. v22}, Linet/ipaddr/format/validate/s;->i(IIIIIILinet/ipaddr/format/validate/a;IJJII)V

    :goto_56
    move/from16 v19, p6

    move-wide/from16 v51, v0

    move-wide/from16 v82, v3

    move-object v13, v5

    move-object/from16 v42, v6

    move/from16 v80, v7

    move/from16 v6, v30

    move-object/from16 v12, v67

    move/from16 v10, v84

    const/4 v14, 0x1

    goto/16 :goto_58

    :cond_b3
    new-instance v1, Linet/ipaddr/AddressStringException;

    const/4 v2, 0x1

    invoke-direct {v1, v8, v0, v2}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;IZ)V

    throw v1

    :cond_b4
    new-instance v0, Linet/ipaddr/AddressStringException;

    const-string v1, "ipaddress.error.no.range"

    invoke-direct {v0, v8, v1}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0

    :cond_b5
    move/from16 v84, v2

    move/from16 v60, v3

    move-object/from16 v67, v4

    move v2, v7

    move/from16 p1, v9

    move/from16 v7, v80

    move-wide/from16 v3, v82

    move/from16 v11, v86

    if-nez v10, :cond_b7

    if-eqz v56, :cond_b6

    move/from16 v9, p1

    move/from16 v10, v84

    move/from16 v19, v11

    move/from16 v11, v60

    move-wide/from16 v51, v12

    move-object/from16 v12, v45

    move/from16 v13, v23

    move-wide/from16 v16, v51

    invoke-static/range {v9 .. v18}, Linet/ipaddr/format/validate/s;->e(IIILinet/ipaddr/format/validate/a;IJJI)V

    move v11, v0

    move v14, v2

    move-wide/from16 v82, v3

    move-object v13, v5

    move-object/from16 v42, v6

    move/from16 v80, v7

    move-object/from16 v12, v67

    goto :goto_57

    :cond_b6
    move/from16 v19, v11

    move-wide/from16 v51, v12

    move v11, v0

    move/from16 v0, p1

    move/from16 v1, v84

    move v9, v2

    move/from16 v10, v84

    move/from16 v2, v60

    move-wide/from16 v82, v3

    move-object/from16 v3, v45

    move-object/from16 v12, v67

    move/from16 v4, v23

    move-object v13, v5

    move-object/from16 v42, v6

    move-wide v5, v14

    move/from16 v80, v7

    move v14, v9

    move/from16 v7, v18

    invoke-static/range {v0 .. v7}, Linet/ipaddr/format/validate/s;->d(IIILinet/ipaddr/format/validate/a;IJI)V

    goto :goto_57

    :cond_b7
    move v14, v2

    move-wide/from16 v82, v3

    move-object/from16 v42, v6

    move/from16 v80, v7

    move/from16 v19, v11

    move-wide/from16 v51, v12

    move-object/from16 v12, v67

    move/from16 v10, v84

    move v11, v0

    move-object v13, v5

    :goto_57
    move v6, v11

    :goto_58
    invoke-virtual/range {v45 .. v45}, Linet/ipaddr/format/validate/a;->s()V

    move/from16 v40, v43

    move-wide/from16 v2, v64

    move/from16 v69, v87

    :goto_59
    add-int/lit8 v1, v10, 0x1

    move v4, v1

    move v9, v4

    move-wide/from16 v20, v2

    move/from16 v10, v19

    move/from16 v0, v69

    :goto_5a
    move/from16 v14, p3

    move-object v15, v8

    move-object v11, v12

    move/from16 v7, v27

    move/from16 v5, v37

    move-object/from16 v12, v45

    move/from16 v17, v56

    move/from16 v18, v62

    move/from16 v19, v63

    move/from16 v43, v66

    move/from16 v13, v80

    move/from16 v45, v81

    move-wide/from16 v49, v82

    move-object/from16 v8, p0

    :goto_5b
    move-object/from16 v37, v28

    goto/16 :goto_0

    :cond_b8
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v8, v1}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0

    :cond_b9
    new-instance v1, Linet/ipaddr/AddressStringException;

    invoke-direct {v1, v8, v0}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v1

    :cond_ba
    new-instance v0, Linet/ipaddr/AddressStringException;

    const-string v1, "ipaddress.error.ipv6.separator"

    invoke-direct {v0, v8, v1}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v0

    :cond_bb
    move/from16 v37, p1

    move/from16 v60, v5

    move/from16 v66, v6

    move/from16 v19, v9

    move-object v0, v10

    move v10, v14

    move v11, v15

    move/from16 v9, v54

    move-object/from16 v45, v55

    move-object/from16 v1, v67

    move/from16 v87, v69

    const/4 v14, 0x1

    const/16 v43, 0x0

    const/16 v3, 0x2d

    if-ne v2, v3, :cond_bc

    move v3, v14

    goto :goto_5c

    :cond_bc
    move/from16 v3, v43

    :goto_5c
    if-nez v3, :cond_d9

    const/16 v3, 0x2f

    if-ne v2, v3, :cond_bd

    invoke-virtual {v0, v14}, Linet/ipaddr/format/validate/c;->o1(Z)V

    add-int/lit8 v2, v10, 0x1

    invoke-virtual {v0, v2}, Linet/ipaddr/format/validate/c;->r1(I)V

    move/from16 v14, p3

    move-object v15, v8

    move v5, v10

    move v6, v11

    move-wide/from16 v20, v12

    move/from16 v7, v27

    move-object/from16 v37, v28

    move-object/from16 v12, v45

    move/from16 v17, v56

    move/from16 v4, v60

    move/from16 v18, v62

    move/from16 v43, v66

    move/from16 v13, v80

    move/from16 v45, v81

    move-wide/from16 v49, v82

    move/from16 v0, v87

    move-object/from16 v8, p0

    move-object v11, v1

    move v1, v5

    move/from16 v10, v19

    move/from16 v19, v63

    goto/16 :goto_0

    :cond_bd
    const/16 v3, 0x41

    if-lt v2, v3, :cond_be

    const/16 v3, 0x46

    if-gt v2, v3, :cond_be

    add-int/lit8 v3, v10, 0x1

    const/4 v4, 0x4

    shl-long v4, v12, v4

    aget v2, v29, v2

    int-to-long v6, v2

    or-long v20, v4, v6

    move-object v15, v8

    move v6, v11

    move/from16 v44, v14

    move/from16 v47, v44

    move/from16 v10, v19

    move/from16 v7, v27

    move/from16 v5, v37

    move-object/from16 v12, v45

    move/from16 v17, v56

    move/from16 v4, v60

    move/from16 v18, v62

    move/from16 v19, v63

    move/from16 v43, v66

    move/from16 v13, v80

    move/from16 v45, v81

    move-wide/from16 v49, v82

    move/from16 v0, v87

    move-object/from16 v8, p0

    move/from16 v14, p3

    move-object v11, v1

    move v1, v3

    goto/16 :goto_5b

    :cond_be
    const/16 v3, 0x2a

    if-ne v2, v3, :cond_bf

    move v3, v14

    goto :goto_5d

    :cond_bf
    move/from16 v3, v43

    :goto_5d
    if-eqz v3, :cond_c0

    move/from16 v4, v43

    goto :goto_5f

    :cond_c0
    const/16 v3, 0x25

    if-ne v2, v3, :cond_c1

    move v3, v14

    goto :goto_5e

    :cond_c1
    move/from16 v3, v43

    :goto_5e
    move v4, v3

    :goto_5f
    if-eqz v3, :cond_c7

    if-eqz v4, :cond_c5

    iget-boolean v2, v1, Linet/ipaddr/ipv6/j0;->j:Z

    if-eqz v2, :cond_c5

    invoke-virtual/range {v45 .. v45}, Linet/ipaddr/format/validate/a;->Z()I

    move-result v2

    if-lez v2, :cond_c3

    if-nez p7, :cond_c2

    invoke-virtual/range {p5 .. p5}, Linet/ipaddr/format/validate/c;->o0()Linet/ipaddr/g$a;

    move-result-object v2

    sget-object v3, Linet/ipaddr/g$a;->IPV6:Linet/ipaddr/g$a;

    if-eq v2, v3, :cond_c2

    goto :goto_60

    :cond_c2
    move/from16 v15, v87

    goto :goto_62

    :cond_c3
    :goto_60
    sub-int v2, v10, v60

    if-ltz v11, :cond_c4

    move v3, v14

    goto :goto_61

    :cond_c4
    move/from16 v3, v43

    :goto_61
    add-int v4, v80, v19

    invoke-static {v2, v3, v4, v1}, Linet/ipaddr/format/validate/s;->z(IZILinet/ipaddr/ipv6/j0;)Z

    move-result v2

    if-nez v2, :cond_c2

    move/from16 v15, v87

    if-ne v15, v10, :cond_c6

    const/16 v2, 0x13

    if-gt v15, v2, :cond_c6

    :goto_62
    invoke-virtual {v0, v14}, Linet/ipaddr/format/validate/c;->t1(Z)V

    add-int/lit8 v2, v10, 0x1

    invoke-virtual {v0, v2}, Linet/ipaddr/format/validate/c;->r1(I)V

    move v2, v10

    move v5, v2

    move/from16 v7, v27

    move/from16 v33, v43

    :goto_63
    move/from16 v4, v60

    goto/16 :goto_69

    :cond_c5
    move/from16 v15, v87

    :cond_c6
    add-int/lit8 v2, v15, 0x1

    add-int/lit8 v3, v10, 0x1

    move v15, v2

    move v2, v3

    :goto_64
    move/from16 v7, v27

    move/from16 v5, v37

    goto :goto_63

    :cond_c7
    move/from16 v15, v87

    const/16 v3, 0x5f

    if-ne v2, v3, :cond_c8

    add-int/lit8 v2, v10, 0x1

    add-int/lit8 v34, v34, 0x1

    move/from16 v44, v14

    goto :goto_64

    :cond_c8
    invoke-static {v2}, Linet/ipaddr/format/validate/s;->w(C)Z

    move-result v3

    if-eqz v3, :cond_cf

    if-nez v44, :cond_cc

    if-eqz v41, :cond_cc

    if-gtz v40, :cond_cc

    if-gez v66, :cond_cc

    if-lez v34, :cond_c9

    goto :goto_66

    :cond_c9
    if-eqz v36, :cond_cb

    invoke-virtual/range {v36 .. v36}, Linet/ipaddr/g$a;->isIPv6()Z

    move-result v2

    if-nez v2, :cond_ca

    goto :goto_65

    :cond_ca
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v8, v10}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;I)V

    throw v0

    :cond_cb
    :goto_65
    add-int/lit8 v2, v10, 0x1

    move v4, v2

    move/from16 v66, v10

    move/from16 v7, v27

    move/from16 v5, v37

    move/from16 v41, v43

    goto/16 :goto_69

    :cond_cc
    :goto_66
    if-eqz v33, :cond_ce

    if-gez v27, :cond_cd

    :goto_67
    move/from16 v27, v10

    :cond_cd
    add-int/lit8 v2, v10, 0x1

    goto :goto_64

    :cond_ce
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v8, v10, v14}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;IZ)V

    throw v0

    :cond_cf
    const/16 v3, 0xbb

    if-ne v2, v3, :cond_d3

    if-eqz v33, :cond_d2

    if-gez v27, :cond_d0

    move/from16 v27, v10

    goto :goto_68

    :cond_d0
    if-gez v39, :cond_d1

    :goto_68
    add-int/lit8 v2, v10, 0x1

    move/from16 v39, v10

    goto :goto_64

    :cond_d1
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v8, v10, v14}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;IZ)V

    throw v0

    :cond_d2
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v8, v10}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;I)V

    throw v0

    :cond_d3
    const/16 v3, 0xa7

    if-ne v2, v3, :cond_d5

    if-eqz v33, :cond_d4

    iget-boolean v2, v1, Linet/ipaddr/ipv6/j0;->j:Z

    if-eqz v2, :cond_d4

    invoke-virtual {v0, v14}, Linet/ipaddr/format/validate/c;->t1(Z)V

    invoke-virtual {v0, v14}, Linet/ipaddr/format/validate/c;->l1(Z)V

    add-int/lit8 v2, v10, 0x1

    invoke-virtual {v0, v2}, Linet/ipaddr/format/validate/c;->r1(I)V

    move v2, v10

    move v5, v2

    move/from16 v7, v27

    goto/16 :goto_63

    :cond_d4
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v8, v10}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;I)V

    throw v0

    :cond_d5
    if-eqz v33, :cond_d8

    if-ltz v2, :cond_d7

    sget-object v3, Linet/ipaddr/format/validate/s;->b:[I

    array-length v4, v3

    if-ge v2, v4, :cond_d7

    aget v2, v3, v2

    if-eqz v2, :cond_d6

    if-gez v27, :cond_cd

    goto :goto_67

    :goto_69
    move/from16 v14, p3

    move v6, v11

    move-wide/from16 v20, v12

    move v0, v15

    move/from16 v10, v19

    move-object/from16 v37, v28

    move-object/from16 v12, v45

    move/from16 v17, v56

    move/from16 v18, v62

    move/from16 v19, v63

    move/from16 v43, v66

    move/from16 v13, v80

    move/from16 v45, v81

    move-wide/from16 v49, v82

    move-object v11, v1

    move v1, v2

    move-object v15, v8

    goto/16 :goto_34

    :cond_d6
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v8, v10}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;I)V

    throw v0

    :cond_d7
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v8, v10}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;I)V

    throw v0

    :cond_d8
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v8, v10}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;I)V

    throw v0

    :cond_d9
    move/from16 v15, v87

    if-gez v27, :cond_dd

    if-ltz v11, :cond_db

    if-eqz v33, :cond_da

    add-int/lit8 v2, v10, 0x1

    move/from16 v14, p3

    move v7, v10

    move v6, v11

    move-wide/from16 v20, v12

    move v0, v15

    move/from16 v10, v19

    :goto_6a
    move/from16 v5, v37

    move-object/from16 v12, v45

    move/from16 v17, v56

    move/from16 v4, v60

    move/from16 v18, v62

    move/from16 v19, v63

    move/from16 v43, v66

    move/from16 v13, v80

    move/from16 v45, v81

    move-wide/from16 v49, v82

    move-object v11, v1

    move v1, v2

    move-object v15, v8

    move-object/from16 v37, v28

    goto/16 :goto_34

    :cond_da
    new-instance v0, Linet/ipaddr/AddressStringException;

    invoke-direct {v0, v8, v10, v14}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;IZ)V

    throw v0

    :cond_db
    sub-int v2, v10, v60

    sub-int v2, v2, v40

    sub-int/2addr v2, v15

    if-eqz v41, :cond_dc

    if-eq v2, v14, :cond_dc

    add-int/lit8 v40, v40, 0x1

    add-int/lit8 v2, v2, -0x1

    :cond_dc
    add-int/lit8 v4, v10, 0x1

    move/from16 v14, p3

    move-object v11, v1

    move/from16 v53, v3

    move v1, v4

    move v6, v10

    move-wide/from16 v49, v12

    move/from16 v38, v15

    move/from16 v7, v27

    move-wide/from16 v20, v31

    move/from16 v46, v34

    move/from16 v5, v37

    move/from16 v13, v40

    move/from16 v0, v43

    move/from16 v34, v0

    move/from16 v40, v34

    move/from16 v41, v40

    move/from16 v44, v41

    move-object/from16 v12, v45

    move/from16 v48, v47

    move/from16 v17, v56

    move/from16 v18, v62

    move/from16 v19, v63

    move/from16 v45, v66

    move v10, v2

    move-object v15, v8

    move-object/from16 v37, v28

    move/from16 v47, v44

    move-object/from16 v8, p0

    move/from16 v43, v30

    goto/16 :goto_0

    :cond_dd
    add-int/lit8 v2, v10, 0x1

    move/from16 v14, p3

    move v6, v11

    move-wide/from16 v20, v12

    move v0, v15

    move/from16 v10, v19

    move/from16 v7, v27

    goto :goto_6a
.end method

.method private static X(Linet/ipaddr/o;Ljava/lang/CharSequence;IILinet/ipaddr/format/validate/c;Z)V
    .locals 8

    const/4 v1, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move v7, p5

    invoke-static/range {v0 .. v7}, Linet/ipaddr/format/validate/s;->V(Linet/ipaddr/o;Linet/ipaddr/p;Ljava/lang/CharSequence;IILinet/ipaddr/format/validate/c;Linet/ipaddr/format/validate/e;Z)V

    return-void
.end method

.method private static Z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Linet/ipaddr/o;Linet/ipaddr/f;IILinet/ipaddr/g$a;)Linet/ipaddr/format/validate/i;
    .locals 14

    move-object v1, p0

    move-object/from16 v0, p3

    move/from16 v2, p4

    move/from16 v3, p5

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v4

    const/4 v5, 0x0

    if-ne v2, v4, :cond_0

    return-object v5

    :cond_0
    sget-object v4, Linet/ipaddr/format/validate/s;->c:[I

    const/4 v6, 0x0

    move v9, v2

    move v7, v6

    move v8, v7

    move v10, v8

    :goto_0
    const/4 v11, 0x1

    if-ge v9, v3, :cond_6

    invoke-interface {p0, v9}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v12

    const/16 v13, 0x31

    if-lt v12, v13, :cond_1

    const/16 v13, 0x39

    if-gt v12, v13, :cond_1

    mul-int/lit8 v7, v7, 0xa

    aget v10, v4, v12

    add-int/2addr v7, v10

    move v10, v11

    goto :goto_1

    :cond_1
    const/16 v13, 0x30

    if-ne v12, v13, :cond_3

    if-eqz v10, :cond_2

    mul-int/lit8 v7, v7, 0xa

    goto :goto_1

    :cond_2
    add-int/lit8 v8, v8, 0x1

    :goto_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_3
    const/16 v4, 0x3a

    if-ne v12, v4, :cond_4

    if-eqz v0, :cond_4

    iget-boolean v4, v0, Linet/ipaddr/f;->g:Z

    if-nez v4, :cond_5

    iget-boolean v4, v0, Linet/ipaddr/f;->h:Z

    if-eqz v4, :cond_4

    goto :goto_2

    :cond_4
    move-object v10, p1

    goto :goto_3

    :cond_5
    :goto_2
    if-le v9, v2, :cond_4

    add-int/lit8 v4, v9, 0x1

    move-object v10, p1

    :try_start_0
    invoke-static {p0, p1, v0, v4, v3}, Linet/ipaddr/format/validate/s;->I(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Linet/ipaddr/f;II)Linet/ipaddr/format/validate/i;

    move-result-object v0
    :try_end_0
    .catch Linet/ipaddr/AddressStringException; {:try_start_0 .. :try_end_0} :catch_0

    move v3, v9

    move v6, v11

    move-object v9, v0

    goto :goto_4

    :catch_0
    return-object v5

    :goto_3
    move-object v9, v5

    goto :goto_4

    :cond_6
    move-object v10, p1

    move-object v9, v5

    move v6, v11

    :goto_4
    if-eqz v6, :cond_8

    sub-int v4, v3, v2

    move v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object/from16 v3, p2

    move v5, v8

    move-object/from16 v6, p6

    invoke-static/range {v0 .. v6}, Linet/ipaddr/format/validate/s;->M(ILjava/lang/CharSequence;Ljava/lang/CharSequence;Linet/ipaddr/o;IILinet/ipaddr/g$a;)Linet/ipaddr/format/validate/i;

    move-result-object v0

    if-eqz v9, :cond_7

    invoke-virtual {v9, v0}, Linet/ipaddr/format/validate/i;->B(Linet/ipaddr/format/validate/i;)V

    return-object v9

    :cond_7
    return-object v0

    :cond_8
    return-object v5
.end method

.method public static a0(Ljava/lang/CharSequence;)I
    .locals 3

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ge v0, v1, :cond_2

    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v2, 0x2f

    if-ne v1, v2, :cond_0

    return v0

    :cond_0
    const/16 v2, 0x3a

    if-ne v1, v2, :cond_1

    return v0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, -0x1

    return p0
.end method

.method private static c(IILinet/ipaddr/format/validate/a;II)V
    .locals 14

    const/16 v10, 0xe

    const/16 v12, 0xf

    const/4 v2, 0x1

    const/4 v4, 0x6

    const/4 v6, 0x7

    const/16 v8, 0x9

    move-object/from16 v0, p2

    move/from16 v1, p3

    move/from16 v3, p4

    move v5, p0

    move v7, p1

    move/from16 v9, p4

    move v11, p0

    move v13, p1

    invoke-virtual/range {v0 .. v13}, Linet/ipaddr/format/validate/a;->G0(IIIIIIIIIIIII)V

    return-void
.end method

.method private static d(IIILinet/ipaddr/format/validate/a;IJI)V
    .locals 22

    move/from16 v9, p0

    move/from16 v11, p0

    move/from16 v15, p1

    move/from16 v13, p1

    move/from16 v5, p2

    move/from16 v7, p2

    move-object/from16 v0, p3

    move/from16 v1, p4

    move-wide/from16 v17, p5

    move-wide/from16 v20, p5

    move/from16 v3, p7

    const/16 v16, 0x2

    const/16 v19, 0xa

    const/4 v2, 0x0

    const/16 v4, 0x9

    const/4 v6, 0x1

    const/16 v8, 0xe

    const/4 v10, 0x6

    const/16 v12, 0xf

    const/4 v14, 0x7

    invoke-virtual/range {v0 .. v21}, Linet/ipaddr/format/validate/a;->F(IIIIIIIIIIIIIIIIJIJ)V

    return-void
.end method

.method private static e(IIILinet/ipaddr/format/validate/a;IJJI)V
    .locals 28

    move/from16 v7, p0

    move/from16 v13, p0

    move/from16 v9, p1

    move/from16 v15, p1

    move/from16 v5, p2

    move/from16 v11, p2

    move-object/from16 v0, p3

    move/from16 v1, p4

    move-wide/from16 v17, p5

    move-wide/from16 v23, p5

    move-wide/from16 v20, p7

    move-wide/from16 v26, p7

    move/from16 v3, p9

    const/16 v22, 0xa

    const/16 v25, 0xc

    const/4 v2, 0x0

    const/4 v4, 0x1

    const/4 v6, 0x6

    const/4 v8, 0x7

    const/16 v10, 0x9

    const/16 v12, 0xe

    const/16 v14, 0xf

    const/16 v16, 0x2

    const/16 v19, 0x4

    invoke-virtual/range {v0 .. v27}, Linet/ipaddr/format/validate/a;->J(IIIIIIIIIIIIIIIIJIJIJIJ)V

    return-void
.end method

.method private static f(IILinet/ipaddr/format/validate/a;III)V
    .locals 16

    const/16 v12, 0xe

    const/16 v14, 0xf

    const/4 v2, 0x0

    const/4 v4, 0x1

    const/4 v6, 0x6

    const/4 v8, 0x7

    const/16 v10, 0x9

    move-object/from16 v0, p2

    move/from16 v1, p3

    move/from16 v3, p4

    move/from16 v5, p5

    move/from16 v7, p0

    move/from16 v9, p1

    move/from16 v11, p5

    move/from16 v13, p0

    move/from16 v15, p1

    invoke-virtual/range {v0 .. v15}, Linet/ipaddr/format/validate/a;->K(IIIIIIIIIIIIIII)V

    return-void
.end method

.method private static g(IIIIIILinet/ipaddr/format/validate/a;IJJI)V
    .locals 22

    move/from16 v7, p0

    move/from16 v9, p1

    move/from16 v5, p2

    move/from16 v13, p3

    move/from16 v15, p4

    move/from16 v11, p5

    move-object/from16 v0, p6

    move/from16 v1, p7

    move-wide/from16 v17, p8

    move-wide/from16 v20, p10

    move/from16 v3, p12

    const/16 v16, 0x2

    const/16 v19, 0xa

    const/4 v2, 0x0

    const/4 v4, 0x1

    const/4 v6, 0x6

    const/4 v8, 0x7

    const/16 v10, 0x9

    const/16 v12, 0xe

    const/16 v14, 0xf

    invoke-virtual/range {v0 .. v21}, Linet/ipaddr/format/validate/a;->F(IIIIIIIIIIIIIIIIJIJ)V

    return-void
.end method

.method private static h(IIIIIILinet/ipaddr/format/validate/a;IJJJJI)V
    .locals 28

    move/from16 v7, p0

    move/from16 v9, p1

    move/from16 v5, p2

    move/from16 v13, p3

    move/from16 v15, p4

    move/from16 v11, p5

    move-object/from16 v0, p6

    move/from16 v1, p7

    move-wide/from16 v17, p8

    move-wide/from16 v20, p10

    move-wide/from16 v23, p12

    move-wide/from16 v26, p14

    move/from16 v3, p16

    const/16 v22, 0xa

    const/16 v25, 0xc

    const/4 v2, 0x0

    const/4 v4, 0x1

    const/4 v6, 0x6

    const/4 v8, 0x7

    const/16 v10, 0x9

    const/16 v12, 0xe

    const/16 v14, 0xf

    const/16 v16, 0x2

    const/16 v19, 0x4

    invoke-virtual/range {v0 .. v27}, Linet/ipaddr/format/validate/a;->J(IIIIIIIIIIIIIIIIJIJIJIJ)V

    return-void
.end method

.method private static i(IIIIIILinet/ipaddr/format/validate/a;IJJII)V
    .locals 24

    move/from16 v7, p0

    move/from16 v9, p1

    move/from16 v5, p2

    move/from16 v15, p3

    move/from16 v17, p4

    move/from16 v13, p5

    move-object/from16 v0, p6

    move/from16 v1, p7

    move-wide/from16 v19, p8

    move-wide/from16 v22, p10

    move/from16 v3, p12

    move/from16 v11, p13

    const/16 v18, 0x2

    const/16 v21, 0xa

    const/4 v2, 0x0

    const/4 v4, 0x1

    const/4 v6, 0x6

    const/4 v8, 0x7

    const/16 v10, 0x8

    const/16 v12, 0x9

    const/16 v14, 0xe

    const/16 v16, 0xf

    invoke-virtual/range {v0 .. v23}, Linet/ipaddr/format/validate/a;->P(IIIIIIIIIIIIIIIIIIJIJ)V

    return-void
.end method

.method private static j(IIIIIILinet/ipaddr/format/validate/a;IJJJJII)V
    .locals 30

    move/from16 v7, p0

    move/from16 v9, p1

    move/from16 v5, p2

    move/from16 v15, p3

    move/from16 v17, p4

    move/from16 v13, p5

    move-object/from16 v0, p6

    move/from16 v1, p7

    move-wide/from16 v19, p8

    move-wide/from16 v22, p10

    move-wide/from16 v25, p12

    move-wide/from16 v28, p14

    move/from16 v3, p16

    move/from16 v11, p17

    const/16 v24, 0xa

    const/16 v27, 0xc

    const/4 v2, 0x0

    const/4 v4, 0x1

    const/4 v6, 0x6

    const/4 v8, 0x7

    const/16 v10, 0x8

    const/16 v12, 0x9

    const/16 v14, 0xe

    const/16 v16, 0xf

    const/16 v18, 0x2

    const/16 v21, 0x4

    invoke-virtual/range {v0 .. v29}, Linet/ipaddr/format/validate/a;->S(IIIIIIIIIIIIIIIIIIJIJIJIJ)V

    return-void
.end method

.method private static k(JLjava/lang/CharSequence;IIILinet/ipaddr/format/validate/a;IILinet/ipaddr/d$a;)V
    .locals 13

    move/from16 v4, p4

    sub-int v0, v4, p5

    move-object v1, p2

    move/from16 v3, p3

    move-object/from16 v2, p9

    invoke-static {p2, v3, v4, v0, v2}, Linet/ipaddr/format/validate/s;->n(Ljava/lang/CharSequence;IIILinet/ipaddr/d$a;)V

    shl-int/lit8 v0, p5, 0x2

    shl-long v8, p0, v0

    const-wide/16 v1, -0x1

    shl-long v0, v1, v0

    not-long v0, v0

    or-long v10, v8, v0

    const/high16 v12, 0x20000

    move/from16 v0, p3

    move/from16 v1, p4

    move/from16 v2, p8

    move/from16 v5, p8

    move-object/from16 v6, p6

    move/from16 v7, p7

    invoke-static/range {v0 .. v12}, Linet/ipaddr/format/validate/s;->g(IIIIIILinet/ipaddr/format/validate/a;IJJI)V

    return-void
.end method

.method private static l(I)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Linet/ipaddr/format/validate/g;->a(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private static m(Ljava/lang/CharSequence;Linet/ipaddr/o;Linet/ipaddr/format/validate/c;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-virtual/range {p2 .. p2}, Linet/ipaddr/format/validate/c;->U0()Linet/ipaddr/format/validate/a;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/format/validate/a;->Z()I

    move-result v3

    invoke-virtual/range {p2 .. p2}, Linet/ipaddr/format/validate/c;->o0()Linet/ipaddr/g$a;

    move-result-object v4

    invoke-virtual {v4}, Linet/ipaddr/g$a;->isIPv4()Z

    move-result v4

    const/4 v6, 0x1

    if-eqz v4, :cond_f

    rsub-int/lit8 v4, v3, 0x4

    invoke-virtual/range {p1 .. p1}, Linet/ipaddr/o;->p()Linet/ipaddr/ipv4/Z;

    move-result-object v7

    invoke-virtual {v2}, Linet/ipaddr/format/validate/a;->r()Z

    move-result v8

    const/4 v9, 0x0

    if-eqz v8, :cond_0

    iget-boolean v8, v7, Linet/ipaddr/d$a;->b:Z

    if-eqz v8, :cond_0

    move v8, v6

    goto :goto_0

    :cond_0
    move v8, v9

    :goto_0
    if-lez v4, :cond_3

    if-le v3, v6, :cond_3

    iget-boolean v10, v7, Linet/ipaddr/ipv4/Z;->l:Z

    if-eqz v10, :cond_1

    invoke-virtual {v1, v6}, Linet/ipaddr/format/validate/c;->v1(Z)V

    goto :goto_1

    :cond_1
    if-eqz v8, :cond_2

    goto :goto_1

    :cond_2
    new-instance v1, Linet/ipaddr/AddressStringException;

    const-string v2, "ipaddress.error.ipv4.too.few.segments"

    invoke-direct {v1, v0, v2}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v1

    :cond_3
    :goto_1
    iget-boolean v8, v7, Linet/ipaddr/d$a;->d:Z

    if-lez v4, :cond_4

    iget-boolean v7, v7, Linet/ipaddr/ipv4/Z;->l:Z

    if-eqz v7, :cond_4

    move v7, v6

    goto :goto_2

    :cond_4
    move v7, v9

    :goto_2
    move v10, v9

    :goto_3
    if-ge v10, v3, :cond_13

    const/16 v11, 0xa

    if-eqz v7, :cond_5

    add-int/lit8 v12, v3, -0x1

    if-ne v10, v12, :cond_5

    rsub-int/lit8 v12, v3, 0x5

    invoke-static {v12}, Linet/ipaddr/format/validate/s;->t(I)J

    move-result-wide v12

    invoke-virtual {v2, v10}, Linet/ipaddr/format/validate/a;->y(I)Z

    move-result v14

    if-eqz v14, :cond_6

    invoke-virtual {v1, v10, v11, v12, v13}, Linet/ipaddr/format/validate/a;->N0(IIJ)V

    goto/16 :goto_4

    :cond_5
    const-wide/16 v12, 0xff

    :cond_6
    const/high16 v14, 0x20000

    invoke-virtual {v1, v10, v14}, Linet/ipaddr/format/validate/a;->g(II)Z

    move-result v14

    const/4 v15, 0x7

    const-string v5, "ipaddress.error.ipv4.segment.too.large"

    const-string v6, "ipaddress.error.segment.too.long"

    if-eqz v14, :cond_a

    const/4 v14, 0x2

    invoke-virtual {v1, v10, v14}, Linet/ipaddr/format/validate/a;->o(II)J

    move-result-wide v16

    cmp-long v14, v16, v12

    if-gtz v14, :cond_9

    invoke-virtual {v1, v10, v11}, Linet/ipaddr/format/validate/a;->o(II)J

    move-result-wide v16

    cmp-long v5, v16, v12

    if-lez v5, :cond_7

    invoke-virtual {v1, v10, v11, v12, v13}, Linet/ipaddr/format/validate/a;->N0(IIJ)V

    :cond_7
    if-nez v8, :cond_d

    invoke-virtual {v2, v10, v9}, Linet/ipaddr/format/validate/a;->l(II)I

    move-result v5

    invoke-static {v4, v5}, Linet/ipaddr/format/validate/s;->s(II)I

    move-result v11

    invoke-virtual {v1, v10, v15}, Linet/ipaddr/format/validate/a;->h(II)I

    move-result v12

    const/4 v13, 0x1

    invoke-virtual {v1, v10, v13}, Linet/ipaddr/format/validate/a;->h(II)I

    move-result v14

    sub-int/2addr v12, v14

    invoke-static {v5}, Linet/ipaddr/format/validate/s;->u(I)I

    move-result v5

    sub-int/2addr v12, v5

    if-gt v12, v11, :cond_8

    goto :goto_4

    :cond_8
    new-instance v1, Linet/ipaddr/AddressStringException;

    invoke-direct {v1, v0, v6}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v1

    :cond_9
    new-instance v1, Linet/ipaddr/AddressStringException;

    invoke-direct {v1, v0, v5}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v1

    :cond_a
    invoke-virtual {v1, v10, v11}, Linet/ipaddr/format/validate/a;->o(II)J

    move-result-wide v16

    cmp-long v11, v16, v12

    if-gtz v11, :cond_e

    if-nez v8, :cond_d

    invoke-virtual {v2, v10, v9}, Linet/ipaddr/format/validate/a;->l(II)I

    move-result v5

    invoke-static {v4, v5}, Linet/ipaddr/format/validate/s;->s(II)I

    move-result v11

    invoke-virtual {v1, v10, v15}, Linet/ipaddr/format/validate/a;->h(II)I

    move-result v12

    const/16 v13, 0xf

    invoke-virtual {v1, v10, v13}, Linet/ipaddr/format/validate/a;->h(II)I

    move-result v13

    const/4 v14, 0x1

    invoke-virtual {v1, v10, v14}, Linet/ipaddr/format/validate/a;->h(II)I

    move-result v15

    sub-int v14, v12, v15

    invoke-static {v5}, Linet/ipaddr/format/validate/s;->u(I)I

    move-result v5

    sub-int/2addr v14, v5

    if-gt v14, v11, :cond_c

    if-eq v12, v13, :cond_d

    const/16 v5, 0x8

    invoke-virtual {v1, v10, v5}, Linet/ipaddr/format/validate/a;->l(II)I

    move-result v11

    invoke-static {v4, v11}, Linet/ipaddr/format/validate/s;->s(II)I

    move-result v5

    const/16 v12, 0x9

    invoke-virtual {v1, v10, v12}, Linet/ipaddr/format/validate/a;->h(II)I

    move-result v12

    sub-int/2addr v13, v12

    invoke-static {v11}, Linet/ipaddr/format/validate/s;->u(I)I

    move-result v11

    sub-int/2addr v13, v11

    if-gt v13, v5, :cond_b

    goto :goto_4

    :cond_b
    new-instance v1, Linet/ipaddr/AddressStringException;

    invoke-direct {v1, v0, v6}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v1

    :cond_c
    new-instance v1, Linet/ipaddr/AddressStringException;

    invoke-direct {v1, v0, v6}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v1

    :cond_d
    :goto_4
    add-int/lit8 v10, v10, 0x1

    const/4 v6, 0x1

    goto/16 :goto_3

    :cond_e
    new-instance v1, Linet/ipaddr/AddressStringException;

    invoke-direct {v1, v0, v5}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v1

    :cond_f
    invoke-virtual/range {p2 .. p2}, Linet/ipaddr/format/validate/c;->g1()Z

    move-result v4

    if-eqz v4, :cond_10

    add-int/lit8 v3, v3, 0x2

    :cond_10
    invoke-virtual {v2}, Linet/ipaddr/format/validate/a;->r()Z

    move-result v2

    if-eqz v2, :cond_11

    invoke-virtual/range {p1 .. p1}, Linet/ipaddr/o;->r()Linet/ipaddr/ipv6/j0;

    move-result-object v2

    iget-boolean v2, v2, Linet/ipaddr/d$a;->b:Z

    if-eqz v2, :cond_11

    goto :goto_5

    :cond_11
    const/4 v2, 0x1

    if-eq v3, v2, :cond_13

    const/16 v2, 0x8

    if-ge v3, v2, :cond_13

    invoke-virtual/range {p2 .. p2}, Linet/ipaddr/format/validate/c;->a1()Z

    move-result v1

    if-eqz v1, :cond_12

    goto :goto_5

    :cond_12
    new-instance v1, Linet/ipaddr/AddressStringException;

    const-string v2, "ipaddress.error.too.few.segments"

    invoke-direct {v1, v0, v2}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw v1

    :cond_13
    :goto_5
    return-void
.end method

.method private static n(Ljava/lang/CharSequence;IIILinet/ipaddr/d$a;)V
    .locals 0

    iget-object p1, p4, Linet/ipaddr/d$a;->a:Linet/ipaddr/d$c;

    invoke-virtual {p1}, Linet/ipaddr/d$c;->l()Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    if-ge p3, p2, :cond_1

    invoke-interface {p0, p3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    const/16 p4, 0x5f

    if-ne p1, p4, :cond_0

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Linet/ipaddr/AddressStringException;

    const-string p2, "ipaddress.error.single.wildcard.order"

    invoke-direct {p1, p0, p2}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw p1

    :cond_1
    return-void

    :cond_2
    new-instance p1, Linet/ipaddr/AddressStringException;

    const-string p2, "ipaddress.error.no.single.wildcard"

    invoke-direct {p1, p0, p2}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw p1
.end method

.method private static o(Ljava/lang/String;ILinet/ipaddr/format/validate/i;)Linet/ipaddr/format/validate/h$a;
    .locals 18

    move-object/from16 v0, p0

    move/from16 v7, p1

    move-object/from16 v8, p2

    const/4 v9, 0x0

    :try_start_0
    const-string v4, ".ipv6-literal.net"

    const/16 v1, 0x11

    const/4 v10, 0x1

    if-le v7, v1, :cond_6

    add-int/lit8 v11, v7, -0x11

    const/4 v2, 0x1

    const/4 v5, 0x0

    const/16 v6, 0x11

    move-object/from16 v1, p0

    move v3, v11

    invoke-virtual/range {v1 .. v6}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v1

    if-eqz v1, :cond_6

    new-instance v1, Ljava/lang/StringBuilder;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    if-ge v2, v3, :cond_3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v3

    const/16 v4, 0x2d

    if-ne v3, v4, :cond_0

    const/16 v3, 0x3a

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->setCharAt(IC)V

    goto :goto_1

    :catch_0
    move-exception v0

    goto/16 :goto_7

    :cond_0
    const/16 v5, 0xbb

    if-ne v3, v5, :cond_1

    invoke-virtual {v1, v2, v4}, Ljava/lang/StringBuilder;->setCharAt(IC)V

    goto :goto_1

    :cond_1
    const/16 v4, 0x73

    if-ne v3, v4, :cond_2

    const/16 v3, 0x25

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->setCharAt(IC)V

    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    new-instance v2, Linet/ipaddr/format/validate/h$a;

    invoke-direct {v2}, Linet/ipaddr/format/validate/h$a;-><init>()V
    :try_end_0
    .catch Linet/ipaddr/AddressStringException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iput-boolean v10, v2, Linet/ipaddr/format/validate/h$a;->a:Z

    sget-object v3, Linet/ipaddr/format/validate/s;->k:Linet/ipaddr/o;

    new-instance v4, Linet/ipaddr/format/validate/r;

    invoke-direct {v4, v9, v0, v3}, Linet/ipaddr/format/validate/r;-><init>(LZf/f;Ljava/lang/CharSequence;Linet/ipaddr/o;)V

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v15

    const/16 v17, 0x0

    const/4 v14, 0x0

    move-object v12, v3

    move-object v13, v1

    move-object/from16 v16, v4

    invoke-static/range {v12 .. v17}, Linet/ipaddr/format/validate/s;->X(Linet/ipaddr/o;Ljava/lang/CharSequence;IILinet/ipaddr/format/validate/c;Z)V

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v5

    invoke-static {v1, v3, v9, v4, v5}, Linet/ipaddr/format/validate/s;->A(Ljava/lang/CharSequence;Linet/ipaddr/o;Linet/ipaddr/f;Linet/ipaddr/format/validate/c;I)Linet/ipaddr/format/validate/i;

    move-result-object v5

    sget-object v6, Linet/ipaddr/format/validate/h;->j:Linet/ipaddr/format/validate/i;

    if-ne v5, v6, :cond_4

    move-object v5, v8

    goto :goto_2

    :cond_4
    if-ne v8, v6, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v5, v8}, Linet/ipaddr/format/validate/i;->B(Linet/ipaddr/format/validate/i;)V

    :goto_2
    invoke-static {v9, v1, v3, v4, v5}, Linet/ipaddr/format/validate/s;->p(LZf/f;Ljava/lang/CharSequence;Linet/ipaddr/o;Linet/ipaddr/format/validate/r;Linet/ipaddr/format/validate/i;)Linet/ipaddr/format/validate/d;

    move-result-object v1

    iput-object v1, v2, Linet/ipaddr/format/validate/h$a;->d:Linet/ipaddr/format/validate/d;
    :try_end_1
    .catch Linet/ipaddr/AddressStringException; {:try_start_1 .. :try_end_1} :catch_1

    move-object v11, v2

    goto :goto_3

    :catch_1
    move-exception v0

    move-object v9, v2

    goto/16 :goto_7

    :cond_6
    move-object v11, v9

    :goto_3
    :try_start_2
    const-string v12, ".ip6.int"

    const/16 v13, 0x8

    if-le v7, v13, :cond_b

    const-string v4, ".in-addr.arpa"

    const-string v14, ".ip6.arpa"

    add-int/lit8 v15, v7, -0xd

    const/4 v2, 0x1

    const/4 v5, 0x0

    const/16 v6, 0xd

    move-object/from16 v1, p0

    move v3, v15

    invoke-virtual/range {v1 .. v6}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v16

    if-nez v16, :cond_8

    const/16 v1, 0x9

    if-le v7, v1, :cond_7

    add-int/lit8 v15, v7, -0x9

    const/4 v2, 0x1

    const/4 v5, 0x0

    const/16 v6, 0x9

    move-object/from16 v1, p0

    move v3, v15

    move-object v4, v14

    invoke-virtual/range {v1 .. v6}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_4

    :catch_2
    move-exception v0

    move-object v9, v11

    goto :goto_7

    :cond_7
    :goto_4
    if-le v7, v13, :cond_b

    add-int/lit8 v15, v7, -0x8

    const/4 v2, 0x1

    const/4 v5, 0x0

    const/16 v6, 0x8

    move-object/from16 v1, p0

    move v3, v15

    move-object v4, v12

    invoke-virtual/range {v1 .. v6}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v1

    if-eqz v1, :cond_b

    :cond_8
    new-instance v1, Linet/ipaddr/format/validate/h$a;

    invoke-direct {v1}, Linet/ipaddr/format/validate/h$a;-><init>()V
    :try_end_2
    .catch Linet/ipaddr/AddressStringException; {:try_start_2 .. :try_end_2} :catch_2

    :try_start_3
    iput-boolean v10, v1, Linet/ipaddr/format/validate/h$a;->b:Z

    if-eqz v16, :cond_9

    invoke-static {v0, v15}, Linet/ipaddr/format/validate/s;->q(Ljava/lang/String;I)Ljava/lang/CharSequence;

    move-result-object v0

    sget-object v2, Linet/ipaddr/format/validate/s;->l:Linet/ipaddr/o;

    goto :goto_5

    :catch_3
    move-exception v0

    move-object v9, v1

    goto :goto_7

    :cond_9
    invoke-static {v0, v15}, Linet/ipaddr/format/validate/s;->r(Ljava/lang/String;I)Ljava/lang/CharSequence;

    move-result-object v0

    sget-object v2, Linet/ipaddr/format/validate/s;->m:Linet/ipaddr/o;

    :goto_5
    new-instance v3, Linet/ipaddr/format/validate/r;

    invoke-direct {v3, v9, v0, v2}, Linet/ipaddr/format/validate/r;-><init>(LZf/f;Ljava/lang/CharSequence;Linet/ipaddr/o;)V

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v13

    const/4 v15, 0x0

    const/4 v12, 0x0

    move-object v10, v2

    move-object v11, v0

    move-object v14, v3

    invoke-static/range {v10 .. v15}, Linet/ipaddr/format/validate/s;->X(Linet/ipaddr/o;Ljava/lang/CharSequence;IILinet/ipaddr/format/validate/c;Z)V

    if-eqz v8, :cond_a

    move-object v4, v8

    goto :goto_6

    :cond_a
    sget-object v4, Linet/ipaddr/format/validate/h;->j:Linet/ipaddr/format/validate/i;

    :goto_6
    invoke-static {v9, v0, v2, v3, v4}, Linet/ipaddr/format/validate/s;->p(LZf/f;Ljava/lang/CharSequence;Linet/ipaddr/o;Linet/ipaddr/format/validate/r;Linet/ipaddr/format/validate/i;)Linet/ipaddr/format/validate/d;

    move-result-object v0

    iput-object v0, v1, Linet/ipaddr/format/validate/h$a;->d:Linet/ipaddr/format/validate/d;
    :try_end_3
    .catch Linet/ipaddr/AddressStringException; {:try_start_3 .. :try_end_3} :catch_3

    move-object v11, v1

    goto :goto_8

    :goto_7
    iput-object v0, v9, Linet/ipaddr/format/validate/h$a;->c:Linet/ipaddr/AddressStringException;

    move-object v11, v9

    :cond_b
    :goto_8
    return-object v11
.end method

.method private static p(LZf/f;Ljava/lang/CharSequence;Linet/ipaddr/o;Linet/ipaddr/format/validate/r;Linet/ipaddr/format/validate/i;)Linet/ipaddr/format/validate/d;
    .locals 2

    invoke-virtual {p3}, Linet/ipaddr/format/validate/r;->o0()Linet/ipaddr/g$a;

    move-result-object v0

    if-nez v0, :cond_c

    invoke-virtual {p4, p2}, Linet/ipaddr/format/validate/i;->p(Linet/ipaddr/o;)Linet/ipaddr/g$a;

    move-result-object v0

    invoke-virtual {p2}, Linet/ipaddr/o;->t()Linet/ipaddr/g$a;

    move-result-object v1

    if-nez v0, :cond_0

    invoke-virtual {p3, v1}, Linet/ipaddr/format/validate/c;->s1(Linet/ipaddr/g$a;)V

    move-object v0, v1

    goto :goto_1

    :cond_0
    if-eqz v1, :cond_2

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    new-instance p0, Linet/ipaddr/AddressStringException;

    sget-object p2, Linet/ipaddr/g$a;->IPV6:Linet/ipaddr/g$a;

    if-ne v0, p2, :cond_1

    const-string p2, "ipaddress.error.ipv6"

    goto :goto_0

    :cond_1
    const-string p2, "ipaddress.error.ipv4"

    :goto_0
    invoke-direct {p0, p1, p2}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw p0

    :cond_2
    :goto_1
    invoke-virtual {p3}, Linet/ipaddr/format/validate/c;->U0()Linet/ipaddr/format/validate/a;

    move-result-object p1

    invoke-virtual {p1}, Linet/ipaddr/format/validate/a;->y0()Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-virtual {p4}, Linet/ipaddr/format/validate/i;->F0()Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_8

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    sget-object p3, Linet/ipaddr/n;->e:Linet/ipaddr/o;

    if-ne p2, p3, :cond_7

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p4

    const/16 v1, 0x80

    if-gt p4, v1, :cond_7

    if-nez v0, :cond_3

    const/4 p2, 0x0

    goto :goto_2

    :cond_3
    invoke-virtual {v0}, Linet/ipaddr/g$a;->isIPv4()Z

    move-result p2

    if-eqz p2, :cond_4

    const/4 p2, 0x1

    goto :goto_2

    :cond_4
    const/4 p2, 0x2

    :goto_2
    sget-object p4, Linet/ipaddr/format/validate/s;->g:[[Linet/ipaddr/format/validate/d$j;

    aget-object v1, p4, p2

    if-nez v1, :cond_5

    const/16 v1, 0x81

    new-array v1, v1, [Linet/ipaddr/format/validate/d$j;

    aput-object v1, p4, p2

    :cond_5
    aget-object p2, v1, p1

    if-nez p2, :cond_6

    new-instance p2, Linet/ipaddr/format/validate/d$j;

    invoke-direct {p2, p0, v0, p3}, Linet/ipaddr/format/validate/d$j;-><init>(Ljava/lang/Integer;Linet/ipaddr/g$a;Linet/ipaddr/o;)V

    aput-object p2, v1, p1

    :cond_6
    return-object p2

    :cond_7
    new-instance p1, Linet/ipaddr/format/validate/d$j;

    invoke-direct {p1, p0, v0, p2}, Linet/ipaddr/format/validate/d$j;-><init>(Ljava/lang/Integer;Linet/ipaddr/g$a;Linet/ipaddr/o;)V

    return-object p1

    :cond_8
    iget-boolean p0, p2, Linet/ipaddr/o;->e:Z

    if-eqz p0, :cond_a

    sget-object p0, Linet/ipaddr/n;->e:Linet/ipaddr/o;

    if-ne p2, p0, :cond_9

    sget-object p0, Linet/ipaddr/format/validate/s;->h:Linet/ipaddr/format/validate/d$i;

    return-object p0

    :cond_9
    new-instance p0, Linet/ipaddr/format/validate/d$i;

    invoke-direct {p0, p2}, Linet/ipaddr/format/validate/d$i;-><init>(Linet/ipaddr/o;)V

    return-object p0

    :cond_a
    sget-object p0, Linet/ipaddr/format/validate/d;->r0:Linet/ipaddr/format/validate/d$k;

    return-object p0

    :cond_b
    new-instance p1, Linet/ipaddr/format/validate/d$f;

    invoke-direct {p1, p4, v0, p0, p2}, Linet/ipaddr/format/validate/d$f;-><init>(Linet/ipaddr/format/validate/i;Linet/ipaddr/g$a;LZf/f;Linet/ipaddr/o;)V

    return-object p1

    :cond_c
    invoke-virtual {p3}, Linet/ipaddr/format/validate/c;->h1()Z

    move-result p0

    if-eqz p0, :cond_e

    invoke-virtual {v0}, Linet/ipaddr/g$a;->isIPv4()Z

    move-result p0

    if-nez p0, :cond_d

    goto :goto_3

    :cond_d
    new-instance p0, Linet/ipaddr/AddressStringException;

    const-string p2, "ipaddress.error.only.ipv6.has.zone"

    invoke-direct {p0, p1, p2}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    throw p0

    :cond_e
    :goto_3
    invoke-virtual {p3, p4}, Linet/ipaddr/format/validate/c;->q1(Linet/ipaddr/format/validate/i;)V

    invoke-static {p1, p2, p3}, Linet/ipaddr/format/validate/s;->m(Ljava/lang/CharSequence;Linet/ipaddr/o;Linet/ipaddr/format/validate/c;)V

    return-object p3
.end method

.method private static q(Ljava/lang/String;I)Ljava/lang/CharSequence;
    .locals 7

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    add-int/lit8 v1, p1, -0x1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const/4 v4, 0x1

    if-lez v1, :cond_3

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x2e

    if-ne v5, v6, :cond_2

    sub-int v6, p1, v1

    if-le v6, v4, :cond_1

    add-int/lit8 v4, v1, 0x1

    :goto_1
    if-ge v4, p1, :cond_0

    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_0
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    move p1, v1

    goto :goto_2

    :cond_1
    new-instance p1, Linet/ipaddr/AddressStringException;

    invoke-direct {p1, p0, v1}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;I)V

    throw p1

    :cond_2
    :goto_2
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_3
    move v1, v2

    :goto_3
    if-ge v1, p1, :cond_4

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_4
    add-int/2addr v3, v4

    const/4 p1, 0x4

    if-ne v3, p1, :cond_5

    return-object v0

    :cond_5
    new-instance p1, Linet/ipaddr/AddressStringException;

    invoke-direct {p1, p0, v2}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;I)V

    throw p1
.end method

.method private static r(Ljava/lang/String;I)Ljava/lang/CharSequence;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v5, 0x1

    sub-int/2addr v1, v5

    const/4 v7, 0x0

    :goto_0
    if-ltz v1, :cond_10

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_1
    const/4 v10, 0x4

    const/16 v11, 0x2d

    if-ge v8, v10, :cond_d

    add-int/lit8 v10, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v12

    const/16 v13, 0x2a

    const/16 v14, 0x66

    const/16 v15, 0x30

    if-ltz v10, :cond_9

    add-int/lit8 v6, v1, -0x2

    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    move-result v10

    const/16 v5, 0x2e

    if-ne v10, v5, :cond_2

    if-ne v12, v13, :cond_0

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v9, 0x1

    :goto_2
    const/4 v11, 0x1

    goto :goto_5

    :cond_0
    if-nez v9, :cond_1

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_1
    new-instance v2, Linet/ipaddr/AddressStringException;

    add-int/lit8 v1, v1, -0x1

    invoke-direct {v2, v0, v1}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;I)V

    throw v2

    :cond_2
    if-ne v10, v11, :cond_8

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v11, 0x1

    if-lt v6, v11, :cond_7

    add-int/lit8 v10, v1, -0x3

    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    if-ne v6, v15, :cond_3

    if-ne v12, v14, :cond_3

    move v6, v11

    goto :goto_3

    :cond_3
    const/4 v6, 0x0

    :goto_3
    if-eqz v9, :cond_5

    if-eqz v6, :cond_4

    goto :goto_4

    :cond_4
    new-instance v2, Linet/ipaddr/AddressStringException;

    add-int/lit8 v1, v1, -0x2

    invoke-direct {v2, v0, v1}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;I)V

    throw v2

    :cond_5
    :goto_4
    add-int/lit8 v6, v1, -0x4

    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-ne v9, v5, :cond_6

    move v9, v11

    :goto_5
    move v1, v6

    goto :goto_6

    :cond_6
    new-instance v2, Linet/ipaddr/AddressStringException;

    add-int/lit8 v1, v1, -0x3

    invoke-direct {v2, v0, v1}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;I)V

    throw v2

    :cond_7
    new-instance v1, Linet/ipaddr/AddressStringException;

    invoke-direct {v1, v0, v6}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;I)V

    throw v1

    :cond_8
    new-instance v2, Linet/ipaddr/AddressStringException;

    add-int/lit8 v1, v1, -0x1

    invoke-direct {v2, v0, v1}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;I)V

    throw v2

    :cond_9
    move v11, v5

    const/4 v5, 0x3

    if-lt v8, v5, :cond_c

    if-ne v12, v13, :cond_a

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move v1, v10

    move v9, v11

    goto :goto_6

    :cond_a
    if-nez v9, :cond_b

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move v1, v10

    :goto_6
    add-int/lit8 v8, v8, 0x1

    move v5, v11

    goto/16 :goto_1

    :cond_b
    new-instance v1, Linet/ipaddr/AddressStringException;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;I)V

    throw v1

    :cond_c
    new-instance v2, Linet/ipaddr/AddressStringException;

    invoke-direct {v2, v0, v1}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;I)V

    throw v2

    :cond_d
    add-int/lit8 v7, v7, 0x1

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v6

    if-lez v6, :cond_e

    const/16 v6, 0x3a

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_e
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    if-eqz v9, :cond_f

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    :cond_f
    const/4 v6, 0x0

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->setLength(I)V

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->setLength(I)V

    goto/16 :goto_0

    :cond_10
    const/4 v6, 0x0

    const/16 v1, 0x8

    if-ne v7, v1, :cond_11

    return-object v2

    :cond_11
    new-instance v1, Linet/ipaddr/AddressStringException;

    invoke-direct {v1, v0, v6}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/CharSequence;I)V

    throw v1
.end method

.method private static s(II)I
    .locals 1

    :try_start_0
    sget-object v0, Linet/ipaddr/format/validate/s;->q:[[I

    ushr-int/lit8 p1, p1, 0x1

    aget-object p1, v0, p1

    aget p0, p1, p0
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    const/4 p0, 0x0

    return p0
.end method

.method private static t(I)J
    .locals 3

    sget-object v0, Linet/ipaddr/format/validate/s;->p:[J

    aget-wide v1, v0, p0

    return-wide v1
.end method

.method private static u(I)I
    .locals 2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/16 v1, 0xa

    if-eq p0, v1, :cond_0

    const/16 v1, 0x10

    if-eq p0, v1, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    return v0
.end method

.method private static v(Ljava/lang/CharSequence;I)Z
    .locals 0

    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p0

    const/16 p1, 0x62

    if-eq p0, p1, :cond_1

    const/16 p1, 0x42

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private static w(C)Z
    .locals 1

    const/16 v0, 0x78

    if-eq p0, v0, :cond_1

    const/16 v0, 0x58

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static x(C)Z
    .locals 2

    const/16 v0, 0x30

    const/4 v1, 0x1

    if-lt p0, v0, :cond_0

    const/16 v0, 0x39

    if-le p0, v0, :cond_4

    :cond_0
    const/16 v0, 0x41

    if-lt p0, v0, :cond_1

    const/16 v0, 0x5a

    if-le p0, v0, :cond_4

    :cond_1
    const/16 v0, 0x61

    if-lt p0, v0, :cond_2

    const/16 v0, 0x7a

    if-le p0, v0, :cond_4

    :cond_2
    const/16 v0, 0x2d

    if-eq p0, v0, :cond_4

    const/16 v0, 0x2e

    if-eq p0, v0, :cond_4

    const/16 v0, 0x5f

    if-eq p0, v0, :cond_4

    const/16 v0, 0x7e

    if-ne p0, v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 p0, 0x0

    goto :goto_1

    :cond_4
    :goto_0
    move p0, v1

    :goto_1
    xor-int/2addr p0, v1

    return p0
.end method

.method private static y(IIZIILinet/ipaddr/ipv4/Z;)Z
    .locals 2

    const/16 v0, 0x22

    const/16 v1, 0xb

    if-le p0, v1, :cond_2

    iget-boolean p0, p5, Linet/ipaddr/o$b;->f:Z

    if-eqz p0, :cond_0

    if-eq p1, v0, :cond_2

    :cond_0
    if-eqz p2, :cond_1

    if-nez p1, :cond_1

    if-le p4, v1, :cond_2

    if-eqz p0, :cond_1

    if-ne p4, v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p0, 0x1

    :goto_1
    if-eqz p0, :cond_5

    if-eqz p2, :cond_5

    if-eqz p1, :cond_5

    if-le p3, v1, :cond_5

    iget-boolean p1, p5, Linet/ipaddr/o$b;->f:Z

    if-eqz p1, :cond_3

    if-eq p4, v0, :cond_5

    :cond_3
    if-nez p4, :cond_4

    goto :goto_2

    :cond_4
    new-instance p0, Linet/ipaddr/AddressStringException;

    const-string p1, "ipaddress.error.too.few.segments.digit.count"

    invoke-direct {p0, p1}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    :goto_2
    return p0
.end method

.method private static z(IZILinet/ipaddr/ipv6/j0;)Z
    .locals 3

    const/16 v0, 0x82

    const/16 v1, 0x20

    if-eq p0, v1, :cond_2

    iget-boolean v2, p3, Linet/ipaddr/o$b;->f:Z

    if-eqz v2, :cond_0

    if-eq p0, v0, :cond_2

    :cond_0
    if-eqz p1, :cond_1

    if-nez p0, :cond_1

    if-eq p2, v1, :cond_2

    if-eqz v2, :cond_1

    if-ne p2, v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v2, 0x1

    :goto_1
    if-eqz v2, :cond_5

    if-eqz p1, :cond_5

    if-eqz p0, :cond_5

    if-eq p2, v1, :cond_5

    iget-boolean p0, p3, Linet/ipaddr/o$b;->f:Z

    if-eqz p0, :cond_3

    if-eq p2, v0, :cond_5

    :cond_3
    if-nez p2, :cond_4

    goto :goto_2

    :cond_4
    new-instance p0, Linet/ipaddr/AddressStringException;

    const-string p1, "ipaddress.error.too.few.segments.digit.count"

    invoke-direct {p0, p1}, Linet/ipaddr/AddressStringException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    :goto_2
    return v2
.end method


# virtual methods
.method public W(Linet/ipaddr/e;)Linet/ipaddr/format/validate/h;
    .locals 43

    move-object/from16 v1, p1

    invoke-virtual/range {p1 .. p1}, Linet/ipaddr/e;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Linet/ipaddr/e;->h()Linet/ipaddr/f;

    move-result-object v12

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v2, 0x2e

    const/16 v3, 0xfd

    if-le v0, v3, :cond_1

    const/16 v4, 0xfe

    if-gt v0, v4, :cond_0

    invoke-virtual {v11, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-ne v3, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Linet/ipaddr/HostNameException;

    const-string v1, "ipaddress.host.error.invalid.length"

    invoke-direct {v0, v11, v1}, Linet/ipaddr/HostNameException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    move v10, v0

    const/4 v0, -0x1

    const/4 v4, 0x1

    const/4 v5, -0x1

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/4 v8, -0x1

    const/4 v9, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, -0x1

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, -0x1

    const/16 v26, -0x1

    const/16 v27, -0x1

    const/16 v28, -0x1

    const/16 v29, -0x1

    const/16 v30, -0x1

    const/16 v31, 0x0

    const/16 v32, 0x0

    :goto_1
    add-int/lit8 v3, v0, 0x1

    const-string v15, "ipaddress.host.error.invalid"

    if-gt v3, v10, :cond_39

    if-ne v3, v10, :cond_b

    if-nez v3, :cond_2

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/16 v2, 0x3a

    const/4 v3, 0x0

    const/16 v17, 0x1

    :goto_2
    const/16 v39, 0x6

    goto/16 :goto_1c

    :cond_2
    if-eqz v4, :cond_3

    add-int/lit8 v2, v9, 0x1

    const/4 v1, 0x4

    if-eq v2, v1, :cond_6

    goto :goto_3

    :cond_3
    const/4 v1, 0x4

    :goto_3
    add-int/lit8 v2, v9, 0x1

    if-ge v2, v1, :cond_4

    if-gez v8, :cond_6

    :cond_4
    if-ge v2, v1, :cond_5

    iget-object v1, v12, Linet/ipaddr/f;->j:Linet/ipaddr/o;

    invoke-virtual {v1}, Linet/ipaddr/o;->p()Linet/ipaddr/ipv4/Z;

    move-result-object v1

    iget-boolean v1, v1, Linet/ipaddr/ipv4/Z;->l:Z

    if-nez v1, :cond_6

    :cond_5
    if-nez v9, :cond_7

    iget-object v1, v12, Linet/ipaddr/f;->j:Linet/ipaddr/o;

    iget-boolean v1, v1, Linet/ipaddr/d;->c:Z

    if-eqz v1, :cond_7

    :cond_6
    const/4 v1, 0x1

    goto :goto_4

    :cond_7
    const/4 v1, 0x0

    :goto_4
    if-eqz v6, :cond_a

    if-eqz v4, :cond_8

    if-eqz v1, :cond_8

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/16 v2, 0x3a

    const/4 v3, 0x0

    :goto_5
    const/16 v17, 0x0

    goto :goto_2

    :cond_8
    if-eqz v16, :cond_9

    if-eqz v7, :cond_9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/16 v2, 0x3a

    const/4 v3, 0x1

    const/4 v4, 0x0

    goto :goto_5

    :cond_9
    new-instance v0, Linet/ipaddr/HostNameException;

    invoke-direct {v0, v11, v15}, Linet/ipaddr/HostNameException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v0

    :cond_a
    and-int/2addr v4, v1

    const/16 v1, 0x2e

    :goto_6
    const/16 v2, 0x61

    goto :goto_7

    :cond_b
    invoke-virtual {v11, v3}, Ljava/lang/String;->charAt(I)C

    move-result v1

    goto :goto_6

    :goto_7
    if-lt v1, v2, :cond_f

    const/16 v2, 0x7a

    if-gt v1, v2, :cond_f

    const/16 v0, 0x66

    if-le v1, v0, :cond_d

    const/16 v0, 0x78

    if-ne v1, v0, :cond_c

    iget-object v0, v12, Linet/ipaddr/f;->j:Linet/ipaddr/o;

    invoke-virtual {v0}, Linet/ipaddr/o;->p()Linet/ipaddr/ipv4/Z;

    move-result-object v0

    iget-boolean v0, v0, Linet/ipaddr/ipv4/Z;->i:Z

    if-eqz v0, :cond_c

    const/4 v0, 0x1

    goto :goto_8

    :cond_c
    const/4 v0, 0x0

    :goto_8
    and-int/2addr v0, v4

    move v4, v0

    const/4 v7, 0x0

    goto :goto_9

    :cond_d
    const/16 v0, 0x62

    if-ne v1, v0, :cond_e

    iget-object v0, v12, Linet/ipaddr/f;->j:Linet/ipaddr/o;

    invoke-virtual {v0}, Linet/ipaddr/o;->p()Linet/ipaddr/ipv4/Z;

    move-result-object v0

    iget-boolean v0, v0, Linet/ipaddr/o$b;->f:Z

    and-int/2addr v0, v4

    move v4, v0

    :cond_e
    :goto_9
    move-object/from16 v1, p1

    move v0, v3

    const/16 v2, 0x2e

    :goto_a
    const/4 v6, 0x0

    goto/16 :goto_1

    :cond_f
    const/16 v2, 0x30

    if-lt v1, v2, :cond_10

    const/16 v2, 0x39

    if-gt v1, v2, :cond_10

    move-object/from16 v1, p1

    move v0, v3

    :goto_b
    const/16 v2, 0x2e

    goto/16 :goto_1

    :cond_10
    const/16 v2, 0x41

    if-lt v1, v2, :cond_14

    const/16 v2, 0x5a

    if-gt v1, v2, :cond_14

    const/16 v0, 0x46

    if-le v1, v0, :cond_12

    const/16 v0, 0x58

    if-ne v1, v0, :cond_11

    iget-object v0, v12, Linet/ipaddr/f;->j:Linet/ipaddr/o;

    invoke-virtual {v0}, Linet/ipaddr/o;->p()Linet/ipaddr/ipv4/Z;

    move-result-object v0

    iget-boolean v0, v0, Linet/ipaddr/ipv4/Z;->i:Z

    if-eqz v0, :cond_11

    const/4 v0, 0x1

    goto :goto_c

    :cond_11
    const/4 v0, 0x0

    :goto_c
    and-int/2addr v0, v4

    move v4, v0

    const/4 v7, 0x0

    goto :goto_d

    :cond_12
    const/16 v0, 0x42

    if-ne v1, v0, :cond_13

    iget-object v0, v12, Linet/ipaddr/f;->j:Linet/ipaddr/o;

    invoke-virtual {v0}, Linet/ipaddr/o;->p()Linet/ipaddr/ipv4/Z;

    move-result-object v0

    iget-boolean v0, v0, Linet/ipaddr/o$b;->f:Z

    and-int/2addr v0, v4

    move v4, v0

    :cond_13
    :goto_d
    move-object/from16 v1, p1

    move v0, v3

    const/16 v2, 0x2e

    const/4 v6, 0x0

    const/16 v17, 0x1

    goto/16 :goto_1

    :cond_14
    const/16 v2, 0x2e

    if-ne v1, v2, :cond_23

    sub-int v0, v3, v5

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    const/16 v1, 0x3f

    if-gt v0, v1, :cond_22

    if-nez v0, :cond_16

    if-lt v3, v10, :cond_15

    const/4 v4, 0x0

    const/16 v18, 0x1

    goto/16 :goto_11

    :cond_15
    new-instance v0, Linet/ipaddr/HostNameException;

    const-string v1, "ipaddress.host.error.segment.too.short"

    invoke-direct {v0, v11, v1}, Linet/ipaddr/HostNameException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v0

    :cond_16
    const/4 v1, 0x6

    if-ge v9, v1, :cond_1c

    const/4 v0, 0x3

    if-ge v9, v0, :cond_19

    if-nez v9, :cond_17

    move/from16 v25, v3

    move/from16 v31, v17

    :goto_e
    move/from16 v17, v21

    goto :goto_f

    :cond_17
    const/4 v1, 0x1

    if-ne v9, v1, :cond_18

    move/from16 v26, v3

    move/from16 v32, v17

    goto :goto_e

    :cond_18
    move/from16 v27, v3

    goto :goto_f

    :cond_19
    if-ne v9, v0, :cond_1a

    move/from16 v28, v3

    move/from16 v22, v17

    goto :goto_e

    :cond_1a
    const/4 v2, 0x4

    if-ne v9, v2, :cond_1b

    move/from16 v29, v3

    move/from16 v23, v17

    goto :goto_e

    :cond_1b
    move/from16 v30, v3

    move/from16 v24, v17

    goto :goto_e

    :goto_f
    add-int/lit8 v9, v9, 0x1

    move/from16 v21, v17

    goto :goto_10

    :cond_1c
    if-ne v9, v1, :cond_1e

    const/16 v0, 0x80

    new-array v14, v0, [I

    aput v3, v14, v9

    iget-boolean v1, v12, Linet/ipaddr/f;->e:Z

    if-eqz v1, :cond_1d

    new-array v13, v0, [Z

    xor-int/lit8 v0, v17, 0x1

    aput-boolean v0, v13, v9

    or-int v18, v18, v17

    :cond_1d
    add-int/lit8 v9, v9, 0x1

    goto :goto_10

    :cond_1e
    aput v3, v14, v9

    if-eqz v13, :cond_1f

    xor-int/lit8 v0, v17, 0x1

    aput-boolean v0, v13, v9

    or-int v18, v18, v17

    :cond_1f
    add-int/lit8 v9, v9, 0x1

    const/16 v0, 0x7f

    if-gt v9, v0, :cond_21

    :goto_10
    const/16 v17, 0x0

    :goto_11
    if-ne v3, v10, :cond_20

    const/4 v0, 0x1

    goto :goto_12

    :cond_20
    const/4 v0, 0x0

    :goto_12
    and-int/2addr v7, v0

    move-object/from16 v1, p1

    move v0, v3

    move v5, v0

    goto/16 :goto_b

    :cond_21
    new-instance v0, Linet/ipaddr/HostNameException;

    const-string v1, "ipaddress.host.error.too.many.segments"

    invoke-direct {v0, v11, v1}, Linet/ipaddr/HostNameException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v0

    :cond_22
    new-instance v0, Linet/ipaddr/HostNameException;

    const-string v1, "ipaddress.error.segment.too.long"

    invoke-direct {v0, v11, v1}, Linet/ipaddr/HostNameException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v0

    :cond_23
    const/16 v39, 0x6

    const/16 v2, 0x5f

    if-ne v1, v2, :cond_24

    goto/16 :goto_9

    :cond_24
    const/16 v2, 0x2d

    if-ne v1, v2, :cond_26

    add-int/lit8 v1, v5, 0x1

    if-eq v3, v1, :cond_25

    add-int/lit8 v1, v10, -0x1

    if-eq v3, v1, :cond_25

    add-int/lit8 v0, v0, 0x2

    invoke-virtual {v11, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v2, 0x2e

    if-eq v0, v2, :cond_25

    move-object/from16 v1, p1

    move v0, v3

    goto/16 :goto_a

    :cond_25
    new-instance v0, Linet/ipaddr/HostNameException;

    invoke-direct {v0, v11, v3}, Linet/ipaddr/HostNameException;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_26
    const/16 v2, 0x5b

    if-ne v1, v2, :cond_28

    if-nez v3, :cond_27

    if-nez v9, :cond_27

    const/4 v2, 0x2

    if-le v10, v2, :cond_27

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/16 v2, 0x3a

    :goto_13
    const/4 v3, 0x0

    :goto_14
    const/16 v17, 0x0

    goto/16 :goto_1c

    :cond_27
    new-instance v0, Linet/ipaddr/HostNameException;

    invoke-direct {v0, v11, v3}, Linet/ipaddr/HostNameException;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_28
    const/16 v2, 0x2f

    if-ne v1, v2, :cond_29

    add-int/lit8 v19, v0, 0x2

    move-object/from16 v1, p1

    move v10, v3

    const/16 v2, 0x2e

    const/16 v18, 0x1

    const/16 v20, 0x1

    goto/16 :goto_1

    :cond_29
    const/16 v2, 0x2a

    if-eq v1, v2, :cond_32

    const/16 v2, 0x25

    if-ne v1, v2, :cond_2a

    const/4 v2, 0x1

    goto :goto_15

    :cond_2a
    const/4 v2, 0x0

    :goto_15
    if-eqz v2, :cond_2b

    move v0, v2

    const/16 v2, 0x3a

    goto :goto_19

    :cond_2b
    const/16 v2, 0x3a

    if-ne v1, v2, :cond_2f

    iget-boolean v1, v12, Linet/ipaddr/f;->g:Z

    if-nez v1, :cond_2e

    iget-boolean v1, v12, Linet/ipaddr/f;->h:Z

    if-eqz v1, :cond_2c

    goto :goto_17

    :cond_2c
    if-eqz v7, :cond_2d

    :goto_16
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    goto :goto_14

    :cond_2d
    new-instance v0, Linet/ipaddr/HostNameException;

    invoke-direct {v0, v11, v3}, Linet/ipaddr/HostNameException;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_2e
    :goto_17
    add-int/lit8 v1, v0, 0x2

    move/from16 v19, v1

    move v10, v3

    const/16 v16, 0x1

    const/16 v18, 0x1

    goto :goto_1b

    :cond_2f
    const/16 v0, 0xbb

    if-ne v1, v0, :cond_31

    :cond_30
    :goto_18
    move v0, v3

    const/4 v6, 0x0

    goto :goto_1b

    :cond_31
    new-instance v0, Linet/ipaddr/HostNameException;

    invoke-direct {v0, v11, v3}, Linet/ipaddr/HostNameException;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_32
    const/16 v2, 0x3a

    const/4 v0, 0x0

    :goto_19
    iget-object v1, v12, Linet/ipaddr/f;->j:Linet/ipaddr/o;

    if-eqz v0, :cond_34

    invoke-virtual {v1}, Linet/ipaddr/o;->r()Linet/ipaddr/ipv6/j0;

    move-result-object v0

    iget-boolean v0, v0, Linet/ipaddr/ipv6/j0;->j:Z

    if-eqz v0, :cond_34

    if-eqz v7, :cond_33

    const/16 v0, 0x8

    if-ge v9, v0, :cond_33

    goto :goto_16

    :cond_33
    new-instance v0, Linet/ipaddr/HostNameException;

    invoke-direct {v0, v11, v3}, Linet/ipaddr/HostNameException;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_34
    if-eqz v4, :cond_35

    invoke-virtual {v1}, Linet/ipaddr/o;->p()Linet/ipaddr/ipv4/Z;

    move-result-object v0

    iget-object v0, v0, Linet/ipaddr/d$a;->a:Linet/ipaddr/d$c;

    invoke-virtual {v0}, Linet/ipaddr/d$c;->n()Z

    move-result v0

    if-eqz v0, :cond_35

    if-gez v8, :cond_36

    move v8, v3

    goto :goto_1a

    :cond_35
    const/4 v4, 0x0

    :cond_36
    :goto_1a
    if-eqz v7, :cond_37

    invoke-virtual {v1}, Linet/ipaddr/o;->r()Linet/ipaddr/ipv6/j0;

    move-result-object v0

    iget-object v0, v0, Linet/ipaddr/d$a;->a:Linet/ipaddr/d$c;

    invoke-virtual {v0}, Linet/ipaddr/d$c;->n()Z

    move-result v0

    if-eqz v0, :cond_37

    if-gez v8, :cond_30

    move v8, v3

    goto :goto_18

    :cond_37
    if-eqz v4, :cond_38

    const/4 v7, 0x0

    goto :goto_18

    :goto_1b
    move-object/from16 v1, p1

    goto/16 :goto_b

    :cond_38
    new-instance v0, Linet/ipaddr/HostNameException;

    invoke-direct {v0, v11, v3}, Linet/ipaddr/HostNameException;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_39
    const/16 v2, 0x3a

    const/16 v39, 0x6

    const/4 v0, 0x0

    const/4 v1, 0x0

    goto/16 :goto_13

    :goto_1c
    iget-object v6, v12, Linet/ipaddr/f;->j:Linet/ipaddr/o;

    if-nez v0, :cond_3b

    if-nez v1, :cond_3b

    if-eqz v3, :cond_3a

    goto :goto_1d

    :cond_3a
    const/4 v1, 0x0

    goto :goto_1e

    :cond_3b
    :goto_1d
    const/4 v1, 0x1

    :goto_1e
    :try_start_0
    iget-boolean v5, v12, Linet/ipaddr/f;->f:Z

    if-nez v5, :cond_3d

    if-nez v1, :cond_3c

    goto :goto_1f

    :cond_3c
    new-instance v0, Linet/ipaddr/HostNameException;

    const-string v1, "ipaddress.host.error.ipaddress"

    invoke-direct {v0, v11, v1}, Linet/ipaddr/HostNameException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Linet/ipaddr/AddressStringException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    move-object/from16 v36, v15

    goto/16 :goto_51

    :cond_3d
    if-nez v1, :cond_3f

    if-nez v4, :cond_3f

    if-eqz v7, :cond_3e

    goto :goto_20

    :cond_3e
    :goto_1f
    move/from16 v39, v8

    move/from16 v42, v10

    move-object/from16 v36, v15

    move/from16 v5, v16

    move/from16 v7, v19

    move-object v10, v6

    move v15, v9

    goto/16 :goto_45

    :cond_3f
    :goto_20
    :try_start_1
    new-instance v5, Linet/ipaddr/format/validate/r;

    move-object/from16 v4, p1

    invoke-direct {v5, v4, v11, v6}, Linet/ipaddr/format/validate/r;-><init>(LZf/f;Ljava/lang/CharSequence;Linet/ipaddr/o;)V

    sget-object v38, Linet/ipaddr/format/validate/h;->j:Linet/ipaddr/format/validate/i;
    :try_end_1
    .catch Linet/ipaddr/AddressStringException; {:try_start_1 .. :try_end_1} :catch_1

    if-eqz v0, :cond_4e

    add-int/lit8 v0, v10, -0x1

    :try_start_2
    invoke-virtual {v11, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3
    :try_end_2
    .catch Linet/ipaddr/AddressStringException; {:try_start_2 .. :try_end_2} :catch_5

    const/16 v7, 0x5d

    if-eq v3, v7, :cond_40

    const/16 v35, 0x1

    goto :goto_21

    :cond_40
    const/16 v35, 0x0

    :goto_21
    if-eqz v35, :cond_42

    const/16 v33, -0x1

    :goto_22
    add-int/lit8 v0, v0, -0x1

    :try_start_3
    invoke-virtual {v11, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v7, 0x5d

    if-eq v3, v7, :cond_42

    const/4 v3, 0x1

    if-eq v0, v3, :cond_41

    goto :goto_22

    :cond_41
    new-instance v0, Linet/ipaddr/HostNameException;

    const-string v2, "ipaddress.host.error.bracketed.missing.end"

    invoke-direct {v0, v11, v2}, Linet/ipaddr/HostNameException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catch Linet/ipaddr/AddressStringException; {:try_start_3 .. :try_end_3} :catch_1

    :catch_1
    move-exception v0

    move/from16 v39, v8

    move/from16 v42, v10

    move-object/from16 v36, v15

    move-object v10, v6

    move v15, v9

    goto/16 :goto_44

    :cond_42
    :try_start_4
    const-string v3, "IPv6:"

    const/4 v7, 0x1

    invoke-virtual {v11, v3, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_43

    move/from16 v7, v39

    goto :goto_23

    :cond_43
    invoke-virtual {v11, v7}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v7, 0x76

    if-eq v3, v7, :cond_4d

    sget-char v7, Linet/ipaddr/format/validate/s;->d:C
    :try_end_4
    .catch Linet/ipaddr/AddressStringException; {:try_start_4 .. :try_end_4} :catch_5

    if-eq v3, v7, :cond_4d

    const/4 v7, 0x1

    :goto_23
    const/16 v33, 0x0

    move/from16 v3, v39

    move/from16 v39, v8

    move v8, v2

    move-object v2, v6

    move-object v3, v11

    move v4, v7

    move-object v7, v5

    move v5, v0

    move-object/from16 v40, v6

    move-object v6, v7

    move-object/from16 v41, v7

    move/from16 v7, v33

    :try_start_5
    invoke-static/range {v2 .. v7}, Linet/ipaddr/format/validate/s;->X(Linet/ipaddr/o;Ljava/lang/CharSequence;IILinet/ipaddr/format/validate/c;Z)V

    if-eqz v35, :cond_49

    add-int/lit8 v2, v0, 0x1

    invoke-virtual {v11, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x2f

    if-ne v3, v4, :cond_44

    const/16 v20, 0x1

    goto :goto_24

    :cond_44
    if-ne v3, v8, :cond_48

    const/16 v16, 0x1

    :goto_24
    add-int/lit8 v19, v0, 0x2

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v33

    invoke-virtual/range {v41 .. v41}, Linet/ipaddr/format/validate/c;->U0()Linet/ipaddr/format/validate/a;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/format/validate/a;->y0()Z

    move-result v7

    invoke-virtual/range {v41 .. v41}, Linet/ipaddr/format/validate/r;->o0()Linet/ipaddr/g$a;

    move-result-object v35
    :try_end_5
    .catch Linet/ipaddr/AddressStringException; {:try_start_5 .. :try_end_5} :catch_3

    move-object v2, v11

    move-object/from16 v3, v40

    move-object v4, v12

    move/from16 v5, v20

    move/from16 v6, v16

    move-object/from16 v36, v15

    move/from16 v15, v39

    move/from16 v8, v19

    move v15, v9

    move/from16 v9, v33

    move/from16 v42, v10

    move-object/from16 v10, v35

    :try_start_6
    invoke-static/range {v2 .. v10}, Linet/ipaddr/format/validate/s;->F(Ljava/lang/CharSequence;Linet/ipaddr/o;Linet/ipaddr/f;ZZZIILinet/ipaddr/g$a;)Linet/ipaddr/format/validate/i;

    move-result-object v10

    invoke-virtual/range {v41 .. v41}, Linet/ipaddr/format/validate/c;->W0()I

    move-result v2

    invoke-virtual/range {v41 .. v41}, Linet/ipaddr/format/validate/c;->h1()Z

    move-result v3

    if-eqz v3, :cond_45

    invoke-virtual {v11, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x32

    if-ne v3, v4, :cond_45

    add-int/lit8 v3, v2, 0x1

    invoke-virtual {v11, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x35

    if-ne v3, v4, :cond_45

    add-int/lit8 v2, v2, 0x2

    :cond_45
    move v8, v2

    goto :goto_26

    :catch_2
    move-exception v0

    :goto_25
    move-object/from16 v10, v40

    goto/16 :goto_44

    :goto_26
    invoke-virtual/range {v41 .. v41}, Linet/ipaddr/format/validate/r;->X0()Z

    move-result v5

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, v11

    move-object/from16 v3, v40

    move-object/from16 v7, v41

    move v9, v0

    invoke-static/range {v2 .. v9}, Linet/ipaddr/format/validate/s;->E(Ljava/lang/CharSequence;Linet/ipaddr/o;Linet/ipaddr/f;ZZLinet/ipaddr/format/validate/c;II)Linet/ipaddr/format/validate/i;

    move-result-object v0

    if-eqz v20, :cond_47

    sget-object v2, Linet/ipaddr/format/validate/h;->j:Linet/ipaddr/format/validate/i;

    if-ne v0, v2, :cond_46

    goto/16 :goto_2a

    :cond_46
    invoke-virtual {v0}, Linet/ipaddr/format/validate/i;->d()Linet/ipaddr/format/validate/i;

    move-result-object v0

    invoke-virtual {v0, v10}, Linet/ipaddr/format/validate/i;->r(Linet/ipaddr/format/validate/i;)V

    :goto_27
    move-object v10, v0

    goto :goto_2a

    :cond_47
    move-object/from16 v38, v10

    goto :goto_27

    :catch_3
    move-exception v0

    :goto_28
    move/from16 v42, v10

    move-object/from16 v36, v15

    move v15, v9

    goto :goto_25

    :cond_48
    move/from16 v42, v10

    move-object/from16 v36, v15

    move v15, v9

    new-instance v0, Linet/ipaddr/HostNameException;

    invoke-direct {v0, v11, v2}, Linet/ipaddr/HostNameException;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_49
    move/from16 v42, v10

    move-object/from16 v36, v15

    move v15, v9

    invoke-virtual/range {v41 .. v41}, Linet/ipaddr/format/validate/c;->W0()I

    move-result v2
    :try_end_6
    .catch Linet/ipaddr/AddressStringException; {:try_start_6 .. :try_end_6} :catch_2

    :try_start_7
    invoke-virtual/range {v41 .. v41}, Linet/ipaddr/format/validate/r;->X0()Z

    move-result v20

    const/16 v16, 0x0

    invoke-virtual/range {v41 .. v41}, Linet/ipaddr/format/validate/c;->h1()Z

    move-result v3

    if-eqz v3, :cond_4a

    invoke-virtual {v11, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x32

    if-ne v3, v4, :cond_4a

    add-int/lit8 v3, v2, 0x1

    invoke-virtual {v11, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3
    :try_end_7
    .catch Linet/ipaddr/AddressStringException; {:try_start_7 .. :try_end_7} :catch_4

    const/16 v4, 0x35

    if-ne v3, v4, :cond_4a

    add-int/lit8 v2, v2, 0x2

    :cond_4a
    move/from16 v19, v2

    goto :goto_29

    :catch_4
    move-exception v0

    move/from16 v19, v2

    goto :goto_25

    :goto_29
    move-object v2, v11

    move-object/from16 v3, v40

    move-object v4, v12

    move/from16 v5, v20

    move/from16 v6, v16

    move-object/from16 v7, v41

    move/from16 v8, v19

    move v9, v0

    :try_start_8
    invoke-static/range {v2 .. v9}, Linet/ipaddr/format/validate/s;->E(Ljava/lang/CharSequence;Linet/ipaddr/o;Linet/ipaddr/f;ZZLinet/ipaddr/format/validate/c;II)Linet/ipaddr/format/validate/i;

    move-result-object v10

    :goto_2a
    invoke-virtual/range {v41 .. v41}, Linet/ipaddr/format/validate/r;->o0()Linet/ipaddr/g$a;

    move-result-object v0

    sget-object v2, Linet/ipaddr/g$a;->IPV6:Linet/ipaddr/g$a;

    if-eq v0, v2, :cond_4c

    iget-boolean v0, v12, Linet/ipaddr/f;->c:Z

    if-eqz v0, :cond_4b

    goto :goto_2b

    :cond_4b
    new-instance v0, Linet/ipaddr/HostNameException;

    const-string v2, "ipaddress.host.error.bracketed.not.ipv6"

    invoke-direct {v0, v11, v2}, Linet/ipaddr/HostNameException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v0

    :cond_4c
    :goto_2b
    move-object/from16 v2, p1

    move-object v0, v10

    move-object/from16 v3, v38

    move-object/from16 v10, v40

    move-object/from16 v5, v41

    goto/16 :goto_43

    :cond_4d
    move-object/from16 v40, v6

    move/from16 v39, v8

    move/from16 v42, v10

    move-object/from16 v36, v15

    move v15, v9

    goto :goto_2c

    :catch_5
    move-exception v0

    move-object/from16 v40, v6

    move/from16 v39, v8

    goto/16 :goto_28

    :goto_2c
    new-instance v0, Linet/ipaddr/HostNameException;

    const-string v2, "ipaddress.host.error.invalid.mechanism"

    invoke-direct {v0, v11, v2}, Linet/ipaddr/HostNameException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v0

    :cond_4e
    move-object/from16 v41, v5

    move-object/from16 v40, v6

    move/from16 v39, v8

    move/from16 v42, v10

    move-object/from16 v36, v15

    const/16 v33, -0x1

    move v8, v2

    move v15, v9

    if-nez v7, :cond_50

    if-eqz v3, :cond_4f

    goto :goto_2d

    :cond_4f
    const/4 v9, 0x0

    goto :goto_2e

    :cond_50
    :goto_2d
    const/4 v9, 0x1

    :goto_2e
    if-eqz v9, :cond_5b

    if-nez v20, :cond_5a

    iget-boolean v0, v12, Linet/ipaddr/f;->g:Z

    if-nez v0, :cond_51

    iget-boolean v0, v12, Linet/ipaddr/f;->h:Z

    if-eqz v0, :cond_5a

    :cond_51
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v2, 0x1

    sub-int/2addr v0, v2

    :goto_2f
    if-ltz v0, :cond_59

    invoke-virtual {v11, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3
    :try_end_8
    .catch Linet/ipaddr/AddressStringException; {:try_start_8 .. :try_end_8} :catch_2

    if-ne v3, v8, :cond_52

    add-int/lit8 v3, v0, 0x1

    const/4 v0, 0x1

    goto :goto_35

    :cond_52
    const/16 v2, 0x30

    const/16 v4, 0x39

    if-lt v3, v2, :cond_53

    if-le v3, v4, :cond_54

    :cond_53
    const/16 v5, 0x41

    goto :goto_31

    :cond_54
    const/16 v2, 0x2a

    const/16 v5, 0x41

    const/16 v6, 0x5a

    :goto_30
    const/16 v7, 0x61

    const/16 v10, 0x7a

    goto :goto_34

    :goto_31
    const/16 v6, 0x5a

    if-lt v3, v5, :cond_55

    if-le v3, v6, :cond_56

    :cond_55
    const/16 v7, 0x61

    goto :goto_32

    :cond_56
    const/16 v2, 0x2a

    goto :goto_30

    :goto_32
    const/16 v10, 0x7a

    if-lt v3, v7, :cond_57

    if-le v3, v10, :cond_58

    :cond_57
    const/16 v2, 0x2d

    goto :goto_33

    :cond_58
    const/16 v2, 0x2a

    goto :goto_34

    :goto_33
    if-eq v3, v2, :cond_58

    const/16 v2, 0x2a

    if-ne v3, v2, :cond_59

    :goto_34
    add-int/lit8 v0, v0, -0x1

    const/4 v2, 0x1

    goto :goto_2f

    :cond_59
    move/from16 v3, v33

    const/4 v0, 0x0

    :goto_35
    move v8, v3

    goto :goto_36

    :cond_5a
    move/from16 v8, v33

    const/4 v0, 0x0

    goto :goto_36

    :cond_5b
    move/from16 v0, v16

    move/from16 v8, v19

    :goto_36
    if-eqz v0, :cond_60

    :try_start_9
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v2, 0x0

    invoke-static {v11, v2, v12, v8, v0}, Linet/ipaddr/format/validate/s;->I(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Linet/ipaddr/f;II)Linet/ipaddr/format/validate/i;

    move-result-object v0
    :try_end_9
    .catch Linet/ipaddr/AddressStringException; {:try_start_9 .. :try_end_9} :catch_d

    if-eqz v9, :cond_5e

    :try_start_a
    iget-boolean v10, v12, Linet/ipaddr/f;->i:Z
    :try_end_a
    .catch Linet/ipaddr/AddressStringException; {:try_start_a .. :try_end_a} :catch_c

    if-eqz v10, :cond_5c

    add-int/lit8 v2, v8, -0x1

    move-object/from16 v33, v0

    move v7, v2

    goto :goto_37

    :cond_5c
    :try_start_b
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v2

    sget-object v3, Linet/ipaddr/format/validate/h;->j:Linet/ipaddr/format/validate/i;
    :try_end_b
    .catch Linet/ipaddr/AddressStringException; {:try_start_b .. :try_end_b} :catch_7

    move v7, v2

    move-object/from16 v33, v3

    :goto_37
    const/4 v4, 0x0

    const/16 v35, 0x0

    move-object/from16 v2, v40

    move-object v3, v11

    move v5, v7

    move-object/from16 v6, v41

    move-object/from16 v37, v0

    move v0, v7

    move/from16 v7, v35

    :try_start_c
    invoke-static/range {v2 .. v7}, Linet/ipaddr/format/validate/s;->X(Linet/ipaddr/o;Ljava/lang/CharSequence;IILinet/ipaddr/format/validate/c;Z)V
    :try_end_c
    .catch Linet/ipaddr/AddressStringException; {:try_start_c .. :try_end_c} :catch_6

    move-object/from16 v7, v40

    move-object/from16 v3, v41

    const/4 v2, 0x0

    :try_start_d
    invoke-static {v11, v7, v2, v3, v0}, Linet/ipaddr/format/validate/s;->A(Ljava/lang/CharSequence;Linet/ipaddr/o;Linet/ipaddr/f;Linet/ipaddr/format/validate/c;I)Linet/ipaddr/format/validate/i;

    move-result-object v4
    :try_end_d
    .catch Linet/ipaddr/AddressStringException; {:try_start_d .. :try_end_d} :catch_8

    move-object/from16 v6, p1

    move-object v5, v3

    const/4 v2, 0x1

    const/16 v34, 0x1

    move v3, v0

    move-object/from16 v0, v33

    goto :goto_3b

    :catch_6
    :goto_38
    move-object/from16 v7, v40

    move-object/from16 v3, v41

    goto :goto_39

    :catch_7
    move-object/from16 v37, v0

    goto :goto_38

    :catch_8
    :goto_39
    :try_start_e
    new-instance v5, Linet/ipaddr/format/validate/r;
    :try_end_e
    .catch Linet/ipaddr/AddressStringException; {:try_start_e .. :try_end_e} :catch_b

    move-object/from16 v6, p1

    :try_start_f
    invoke-direct {v5, v6, v11, v7}, Linet/ipaddr/format/validate/r;-><init>(LZf/f;Ljava/lang/CharSequence;Linet/ipaddr/o;)V
    :try_end_f
    .catch Linet/ipaddr/AddressStringException; {:try_start_f .. :try_end_f} :catch_a

    if-eqz v10, :cond_5d

    :try_start_10
    sget-object v0, Linet/ipaddr/format/validate/h;->j:Linet/ipaddr/format/validate/i;

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v2
    :try_end_10
    .catch Linet/ipaddr/AddressStringException; {:try_start_10 .. :try_end_10} :catch_9

    move v3, v2

    const/4 v2, 0x1

    :goto_3a
    const/4 v4, 0x0

    const/16 v34, 0x0

    goto :goto_3b

    :catch_9
    move-exception v0

    goto :goto_3f

    :cond_5d
    const/4 v2, 0x1

    add-int/lit8 v0, v8, -0x1

    move v3, v0

    move-object/from16 v0, v37

    goto :goto_3a

    :goto_3b
    move-object/from16 v38, v0

    move/from16 v0, v34

    goto :goto_3e

    :catch_a
    move-exception v0

    :goto_3c
    const/4 v2, 0x1

    :goto_3d
    move-object v5, v3

    goto :goto_3f

    :catch_b
    move-exception v0

    move-object/from16 v6, p1

    goto :goto_3c

    :catch_c
    move-exception v0

    move-object/from16 v6, p1

    move-object/from16 v7, v40

    move-object/from16 v3, v41

    goto :goto_3c

    :cond_5e
    move-object/from16 v6, p1

    move-object/from16 v37, v0

    move-object/from16 v7, v40

    move-object/from16 v3, v41

    const/4 v2, 0x1

    add-int/lit8 v0, v8, -0x1

    move-object v5, v3

    move-object/from16 v38, v37

    const/4 v4, 0x0

    move v3, v0

    const/4 v0, 0x0

    :goto_3e
    move v8, v3

    move-object v10, v4

    move-object v9, v5

    goto :goto_41

    :catch_d
    move-exception v0

    move-object/from16 v6, p1

    move-object/from16 v7, v40

    move-object/from16 v3, v41

    goto :goto_3d

    :goto_3f
    if-eqz v9, :cond_5f

    :try_start_11
    sget-object v38, Linet/ipaddr/format/validate/h;->j:Linet/ipaddr/format/validate/i;

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v3

    move v8, v3

    move-object v9, v5

    :goto_40
    const/4 v0, 0x0

    const/4 v10, 0x0

    goto :goto_41

    :catch_e
    move-exception v0

    move-object v10, v7

    goto :goto_44

    :cond_5f
    throw v0

    :cond_60
    move-object/from16 v6, p1

    move-object/from16 v7, v40

    move-object/from16 v3, v41

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v0
    :try_end_11
    .catch Linet/ipaddr/AddressStringException; {:try_start_11 .. :try_end_11} :catch_e

    move v8, v0

    move-object v9, v3

    goto :goto_40

    :goto_41
    if-nez v0, :cond_61

    const/4 v4, 0x0

    const/4 v0, 0x0

    move-object v2, v7

    move-object v3, v11

    move v5, v8

    move-object v10, v6

    move-object v6, v9

    move-object v10, v7

    move v7, v0

    :try_start_12
    invoke-static/range {v2 .. v7}, Linet/ipaddr/format/validate/s;->X(Linet/ipaddr/o;Ljava/lang/CharSequence;IILinet/ipaddr/format/validate/c;Z)V

    const/4 v2, 0x0

    invoke-static {v11, v10, v2, v9, v8}, Linet/ipaddr/format/validate/s;->A(Ljava/lang/CharSequence;Linet/ipaddr/o;Linet/ipaddr/f;Linet/ipaddr/format/validate/c;I)Linet/ipaddr/format/validate/i;

    move-result-object v0

    move-object/from16 v2, p1

    :goto_42
    move-object v5, v9

    move-object/from16 v3, v38

    goto :goto_43

    :catch_f
    move-exception v0

    goto :goto_44

    :cond_61
    move-object v2, v6

    move-object v4, v10

    move-object v10, v7

    move-object v0, v4

    goto :goto_42

    :goto_43
    invoke-static {v2, v11, v10, v5, v0}, Linet/ipaddr/format/validate/s;->p(LZf/f;Ljava/lang/CharSequence;Linet/ipaddr/o;Linet/ipaddr/format/validate/r;Linet/ipaddr/format/validate/i;)Linet/ipaddr/format/validate/d;

    move-result-object v0

    new-instance v2, Linet/ipaddr/format/validate/h;

    invoke-direct {v2, v11, v0, v3}, Linet/ipaddr/format/validate/h;-><init>(Ljava/lang/String;Linet/ipaddr/format/validate/d;Linet/ipaddr/format/validate/i;)V
    :try_end_12
    .catch Linet/ipaddr/AddressStringException; {:try_start_12 .. :try_end_12} :catch_f

    return-object v2

    :goto_44
    if-nez v1, :cond_76

    move/from16 v5, v16

    move/from16 v7, v19

    :goto_45
    :try_start_13
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v8

    const/4 v9, 0x0

    move-object v1, v11

    move-object v2, v10

    move-object v3, v12

    move/from16 v4, v20

    move/from16 v6, v17

    invoke-static/range {v1 .. v9}, Linet/ipaddr/format/validate/s;->F(Ljava/lang/CharSequence;Linet/ipaddr/o;Linet/ipaddr/f;ZZZIILinet/ipaddr/g$a;)Linet/ipaddr/format/validate/i;

    move-result-object v0

    if-eqz v17, :cond_64

    iget-boolean v1, v12, Linet/ipaddr/f;->a:Z

    if-eqz v1, :cond_63

    sget-object v1, Linet/ipaddr/format/validate/h;->j:Linet/ipaddr/format/validate/i;

    if-ne v0, v1, :cond_62

    sget-object v0, Linet/ipaddr/format/validate/s;->i:Linet/ipaddr/format/validate/h;

    goto/16 :goto_50

    :catch_10
    move-exception v0

    goto/16 :goto_51

    :cond_62
    new-instance v1, Linet/ipaddr/format/validate/h;

    sget-object v2, Linet/ipaddr/format/validate/s;->e:[I

    const/4 v3, 0x0

    invoke-direct {v1, v11, v2, v3, v0}, Linet/ipaddr/format/validate/h;-><init>(Ljava/lang/String;[I[ZLinet/ipaddr/format/validate/i;)V

    move-object v0, v1

    goto/16 :goto_50

    :cond_63
    new-instance v0, Linet/ipaddr/HostNameException;

    const-string v1, "ipaddress.host.error.empty"

    invoke-direct {v0, v11, v1}, Linet/ipaddr/HostNameException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v0

    :cond_64
    const/4 v1, 0x6

    const/4 v3, 0x0

    if-gt v15, v1, :cond_66

    new-array v1, v15, [I

    iget-boolean v2, v12, Linet/ipaddr/f;->e:Z

    if-eqz v2, :cond_65

    new-array v2, v15, [Z

    move-object v14, v1

    move-object v4, v2

    :goto_46
    move v9, v15

    goto :goto_48

    :cond_65
    move-object v14, v1

    move-object v4, v13

    goto :goto_46

    :cond_66
    array-length v2, v14

    if-eq v15, v2, :cond_68

    new-array v2, v15, [I

    add-int/lit8 v9, v15, -0x6

    invoke-static {v14, v1, v2, v1, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-eqz v13, :cond_67

    new-array v4, v15, [Z

    invoke-static {v13, v1, v4, v1, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move v9, v1

    move-object v14, v2

    goto :goto_48

    :cond_67
    move v9, v1

    move-object v14, v2

    :goto_47
    move-object v4, v13

    goto :goto_48

    :cond_68
    move v9, v1

    goto :goto_47

    :goto_48
    const/4 v1, 0x0

    :goto_49
    if-ge v1, v9, :cond_6f

    const/4 v2, 0x2

    if-ge v1, v2, :cond_6a

    if-nez v1, :cond_69

    move/from16 v6, v25

    move/from16 v7, v31

    :goto_4a
    const/4 v5, 0x4

    goto :goto_4b

    :cond_69
    move/from16 v6, v26

    move/from16 v7, v32

    goto :goto_4a

    :cond_6a
    const/4 v5, 0x4

    if-ge v1, v5, :cond_6c

    if-ne v1, v2, :cond_6b

    move/from16 v7, v21

    move/from16 v6, v27

    goto :goto_4b

    :cond_6b
    move/from16 v7, v22

    move/from16 v6, v28

    goto :goto_4b

    :cond_6c
    if-ne v1, v5, :cond_6d

    move/from16 v7, v23

    move/from16 v6, v29

    goto :goto_4b

    :cond_6d
    move/from16 v7, v24

    move/from16 v6, v30

    :goto_4b
    aput v6, v14, v1

    if-eqz v4, :cond_6e

    const/4 v6, 0x1

    xor-int/lit8 v8, v7, 0x1

    aput-boolean v8, v4, v1

    or-int v7, v18, v7

    move/from16 v18, v7

    goto :goto_4c

    :cond_6e
    const/4 v6, 0x1

    :goto_4c
    add-int/lit8 v1, v1, 0x1

    goto :goto_49

    :cond_6f
    if-eqz v20, :cond_70

    sget-object v1, Linet/ipaddr/format/validate/h;->j:Linet/ipaddr/format/validate/i;

    move-object v2, v1

    move/from16 v10, v42

    move-object v1, v0

    goto :goto_4d

    :cond_70
    sget-object v1, Linet/ipaddr/format/validate/h;->j:Linet/ipaddr/format/validate/i;

    move-object v2, v0

    move/from16 v10, v42

    :goto_4d
    invoke-static {v11, v10, v1}, Linet/ipaddr/format/validate/s;->o(Ljava/lang/String;ILinet/ipaddr/format/validate/i;)Linet/ipaddr/format/validate/h$a;

    move-result-object v7

    if-ltz v39, :cond_73

    if-eqz v7, :cond_71

    iget-object v13, v7, Linet/ipaddr/format/validate/h$a;->c:Linet/ipaddr/AddressStringException;

    if-eqz v13, :cond_73

    goto :goto_4e

    :cond_71
    move-object v13, v3

    :goto_4e
    if-eqz v13, :cond_72

    new-instance v0, Linet/ipaddr/HostNameException;

    move/from16 v8, v39

    invoke-direct {v0, v11, v8, v13}, Linet/ipaddr/HostNameException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v0

    :cond_72
    move/from16 v8, v39

    new-instance v0, Linet/ipaddr/HostNameException;

    invoke-direct {v0, v11, v8}, Linet/ipaddr/HostNameException;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_73
    new-instance v8, Linet/ipaddr/format/validate/h;

    if-nez v7, :cond_74

    move-object v5, v0

    goto :goto_4f

    :cond_74
    move-object v5, v2

    :goto_4f
    move-object v1, v8

    move-object v2, v11

    move-object v3, v14

    move-object v6, v7

    invoke-direct/range {v1 .. v6}, Linet/ipaddr/format/validate/h;-><init>(Ljava/lang/String;[I[ZLinet/ipaddr/format/validate/i;Linet/ipaddr/format/validate/h$a;)V

    if-nez v18, :cond_75

    if-nez v7, :cond_75

    iput-object v11, v8, Linet/ipaddr/format/validate/h;->g:Ljava/lang/String;

    :cond_75
    move-object v0, v8

    :goto_50
    return-object v0

    :cond_76
    throw v0
    :try_end_13
    .catch Linet/ipaddr/AddressStringException; {:try_start_13 .. :try_end_13} :catch_10

    :goto_51
    new-instance v1, Linet/ipaddr/HostNameException;

    move-object/from16 v2, v36

    invoke-direct {v1, v11, v0, v2}, Linet/ipaddr/HostNameException;-><init>(Ljava/lang/String;Linet/ipaddr/AddressStringException;Ljava/lang/String;)V

    throw v1
.end method

.method public Y(Linet/ipaddr/n;)Linet/ipaddr/format/validate/d;
    .locals 9

    invoke-virtual {p1}, Linet/ipaddr/n;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Linet/ipaddr/n;->h()Linet/ipaddr/o;

    move-result-object v7

    new-instance v8, Linet/ipaddr/format/validate/r;

    invoke-direct {v8, p1, v6, v7}, Linet/ipaddr/format/validate/r;-><init>(LZf/f;Ljava/lang/CharSequence;Linet/ipaddr/o;)V

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, v7

    move-object v1, v6

    move-object v4, v8

    invoke-static/range {v0 .. v5}, Linet/ipaddr/format/validate/s;->X(Linet/ipaddr/o;Ljava/lang/CharSequence;IILinet/ipaddr/format/validate/c;Z)V

    const/4 v0, 0x0

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v1

    invoke-static {v6, v7, v0, v8, v1}, Linet/ipaddr/format/validate/s;->A(Ljava/lang/CharSequence;Linet/ipaddr/o;Linet/ipaddr/f;Linet/ipaddr/format/validate/c;I)Linet/ipaddr/format/validate/i;

    move-result-object v0

    invoke-static {p1, v6, v7, v8, v0}, Linet/ipaddr/format/validate/s;->p(LZf/f;Ljava/lang/CharSequence;Linet/ipaddr/o;Linet/ipaddr/format/validate/r;Linet/ipaddr/format/validate/i;)Linet/ipaddr/format/validate/d;

    move-result-object p1

    return-object p1
.end method

.method public a(Linet/ipaddr/n;)Linet/ipaddr/format/validate/d;
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/format/validate/s;->Y(Linet/ipaddr/n;)Linet/ipaddr/format/validate/d;

    move-result-object p1

    return-object p1
.end method

.method public b(Linet/ipaddr/e;)Linet/ipaddr/format/validate/h;
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/format/validate/s;->W(Linet/ipaddr/e;)Linet/ipaddr/format/validate/h;

    move-result-object p1

    return-object p1
.end method
