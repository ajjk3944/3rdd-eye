.class public final Lme/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lme/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lme/E$a;,
        Lme/E$b;,
        Lme/E$c;,
        Lme/E$d;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/Map;


# direct methods
.method public constructor <init>(Landroid/net/wifi/ScanResult;)V
    .locals 19

    move-object/from16 v0, p1

    const-string v1, "Information Elements Reflection failed"

    const-string v2, "scanResult"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {}, Lme/E$a;->getEntries()Lfh/a;

    move-result-object v3

    invoke-static {v3}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object v3

    new-instance v4, Lme/C;

    invoke-direct {v4}, Lme/C;-><init>()V

    invoke-static {v3, v4}, Lzi/m;->N(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v3

    invoke-static {v3}, LZg/U;->u(Lzi/j;)Ljava/util/Map;

    move-result-object v9

    invoke-static {}, Lme/E$a;->getEntries()Lfh/a;

    move-result-object v3

    invoke-static {v3}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object v3

    new-instance v4, Lme/D;

    invoke-direct {v4}, Lme/D;-><init>()V

    invoke-static {v3, v4}, Lzi/m;->C(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v3

    new-instance v4, Lme/y;

    invoke-direct {v4}, Lme/y;-><init>()V

    invoke-static {v3, v4}, Lzi/m;->N(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v3

    invoke-static {v3}, Lzi/m;->Y(Lzi/j;)Ljava/util/HashSet;

    move-result-object v10

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1e

    const/4 v11, 0x0

    if-lt v3, v4, :cond_2

    :try_start_0
    invoke-static/range {p1 .. p1}, Lme/t;->a(Landroid/net/wifi/ScanResult;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lme/u;->a(Ljava/lang/Object;)Landroid/net/wifi/ScanResult$InformationElement;

    move-result-object v1

    invoke-static {v1}, Lme/v;->a(Landroid/net/wifi/ScanResult$InformationElement;)I

    move-result v6

    invoke-static {v1}, Lme/w;->a(Landroid/net/wifi/ScanResult$InformationElement;)I

    move-result v7

    invoke-static {v1}, Lme/x;->a(Landroid/net/wifi/ScanResult$InformationElement;)Ljava/nio/ByteBuffer;

    move-result-object v8

    const-string v1, "getBytes(...)"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v9

    move-object v4, v10

    move-object v5, v2

    invoke-static/range {v3 .. v8}, Lme/E;->o(Ljava/util/Map;Ljava/util/HashSet;Ljava/util/Map;IILjava/nio/ByteBuffer;)V

    goto :goto_0

    :cond_0
    sget-object v0, LYg/J;->a:LYg/J;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_1
    move-object/from16 v1, p0

    goto/16 :goto_10

    :catch_0
    const-string v0, "Failed to read information elements"

    const/4 v1, 0x6

    invoke-static {v0, v11, v11, v1, v11}, LZ7/b;->j(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    sget-object v0, LYg/J;->a:LYg/J;

    goto :goto_1

    :cond_2
    const/4 v12, 0x4

    :try_start_1
    const-class v3, Landroid/net/wifi/ScanResult;

    const-string v4, "informationElements"

    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    const-string v4, "getDeclaredField(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v3, v0, [Ljava/lang/Object;

    if-eqz v3, :cond_3

    check-cast v0, [Ljava/lang/Object;

    goto :goto_2

    :catch_1
    move-exception v0

    goto/16 :goto_c

    :catch_2
    move-exception v0

    goto/16 :goto_d

    :catch_3
    move-exception v0

    goto/16 :goto_e

    :catch_4
    move-exception v0

    goto/16 :goto_f

    :cond_3
    move-object v0, v11

    :goto_2
    if-eqz v0, :cond_1

    invoke-static {v0}, Lkotlin/jvm/internal/c;->a([Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v0

    const/4 v13, 0x0

    move-object v4, v11

    move-object v5, v4

    move-object v6, v5

    move v3, v13

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    if-nez v3, :cond_4

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const-string v4, "id"

    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/ExceptionInInitializerError; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const-string v5, "idExt"

    invoke-virtual {v3, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3
    :try_end_2
    .catch Ljava/lang/NoSuchFieldException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/ExceptionInInitializerError; {:try_start_2 .. :try_end_2} :catch_1

    move-object v5, v3

    goto :goto_4

    :catch_5
    move-object v5, v11

    :goto_4
    :try_start_3
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const-string v6, "bytes"

    invoke-virtual {v3, v6}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v6

    const/4 v3, 0x1

    :cond_4
    move v14, v3

    move-object v15, v4

    move-object v8, v5

    move-object/from16 v16, v6

    if-nez v15, :cond_5

    const-string v3, "idField"

    invoke-static {v3}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v3, v11

    goto :goto_5

    :cond_5
    move-object v3, v15

    :goto_5
    invoke-virtual {v3, v7}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/Integer;

    if-eqz v4, :cond_6

    check-cast v3, Ljava/lang/Integer;

    goto :goto_6

    :cond_6
    move-object v3, v11

    :goto_6
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-eqz v8, :cond_7

    invoke-virtual {v8, v7}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_7

    :cond_7
    move-object v3, v11

    :goto_7
    instance-of v4, v3, Ljava/lang/Integer;

    if-eqz v4, :cond_8

    check-cast v3, Ljava/lang/Integer;

    goto :goto_8

    :cond_8
    move-object v3, v11

    :goto_8
    if-eqz v3, :cond_9

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    move/from16 v17, v3

    goto :goto_9

    :cond_9
    move/from16 v17, v13

    :goto_9
    if-nez v16, :cond_a

    const-string v3, "bytesField"

    invoke-static {v3}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v3, v11

    goto :goto_a

    :cond_a
    move-object/from16 v3, v16

    :goto_a
    invoke-virtual {v3, v7}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, [B

    if-eqz v4, :cond_b

    check-cast v3, [B

    goto :goto_b

    :cond_b
    move-object v3, v11

    :goto_b
    if-nez v3, :cond_c

    goto/16 :goto_1

    :cond_c
    invoke-static {v3}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    move-result-object v7

    const-string v3, "asReadOnlyBuffer(...)"

    invoke-static {v7, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v9

    move-object v4, v10

    move-object v5, v2

    move-object/from16 v18, v7

    move/from16 v7, v17

    move-object/from16 v17, v8

    move-object/from16 v8, v18

    invoke-static/range {v3 .. v8}, Lme/E;->o(Ljava/util/Map;Ljava/util/HashSet;Ljava/util/Map;IILjava/nio/ByteBuffer;)V
    :try_end_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/NullPointerException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/ExceptionInInitializerError; {:try_start_3 .. :try_end_3} :catch_1

    move v3, v14

    move-object v4, v15

    move-object/from16 v6, v16

    move-object/from16 v5, v17

    goto/16 :goto_3

    :goto_c
    invoke-static {v1, v0, v11, v12, v11}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    goto/16 :goto_1

    :goto_d
    invoke-static {v1, v0, v11, v12, v11}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    goto/16 :goto_1

    :goto_e
    invoke-static {v1, v0, v11, v12, v11}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    goto/16 :goto_1

    :goto_f
    invoke-static {v1, v0, v11, v12, v11}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    goto/16 :goto_1

    :goto_10
    iput-object v2, v1, Lme/E;->a:Ljava/util/Map;

    return-void
.end method

.method private final A(Lme/E$c;ILmh/p;)Lcom/ubnt/usurvey/wifi/WifiMcs;
    .locals 4

    const/4 v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {p1}, Lme/E$c;->a()Ljava/nio/ByteBuffer;

    move-result-object v2

    add-int/lit8 v3, p2, 0x1

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v2

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Lme/E$c;->a()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p1

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result p1

    sget-object p2, Lsh/g;->d:Lsh/g$a;

    const/4 v0, 0x0

    const/4 v2, -0x2

    const/16 v3, 0xe

    invoke-virtual {p2, v3, v0, v2}, Lsh/g$a;->a(III)Lsh/g;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v0, p2

    check-cast v0, LZg/Q;

    invoke-virtual {v0}, LZg/Q;->d()I

    move-result v0

    const/4 v2, 0x3

    shl-int/2addr v2, v0

    and-int/2addr v2, p1

    ushr-int/2addr v2, v0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    div-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p3, v2, v0}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ubnt/usurvey/wifi/WifiMcs;

    if-eqz v0, :cond_0

    return-object v0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private final B(Lme/E$c;)Ljava/util/Set;
    .locals 4

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-virtual {p1}, Lme/E$c;->a()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    invoke-virtual {p1}, Lme/E$c;->a()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v2, v1}, Lsh/m;->s(II)Lsh/i;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, LZg/Q;

    invoke-virtual {v2}, LZg/Q;->d()I

    invoke-virtual {p1}, Lme/E$c;->a()Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->get()B

    move-result v2

    invoke-static {v2}, LYg/A;->b(B)B

    move-result v2

    and-int/lit8 v2, v2, 0x7e

    ushr-int/lit8 v2, v2, 0x1

    sget-object v3, LW7/a;->b:LW7/a$a;

    invoke-virtual {v3, v2}, LW7/a$a;->d(I)LW7/a;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private final C()Ljava/util/Set;
    .locals 3

    invoke-static {}, LZg/d0;->b()Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, Lme/E;->a:Ljava/util/Map;

    sget-object v2, Lme/E$a;->HE_CAPABILITIES:Lme/E$a;

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lme/E$c;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lme/E$c;->a()Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    invoke-virtual {v1}, Lme/E$c;->a()Ljava/nio/ByteBuffer;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v1

    invoke-static {v1}, LYg/A;->b(B)B

    move-result v1

    and-int/lit8 v1, v1, 0x4

    if-lez v1, :cond_0

    sget-object v1, LS8/d;->MHZ_160:LS8/d;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v1, p0, Lme/E;->a:Ljava/util/Map;

    sget-object v2, Lme/E$a;->EHT_CAPABILITIES:Lme/E$a;

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lme/E$c;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lme/E$c;->a()Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    invoke-virtual {v1}, Lme/E$c;->a()Ljava/nio/ByteBuffer;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v1

    invoke-static {v1}, LYg/A;->b(B)B

    move-result v1

    and-int/2addr v1, v2

    if-lez v1, :cond_1

    sget-object v1, LS8/d;->MHZ_320:LS8/d;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-static {v0}, LZg/d0;->a(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method private final D()Ljava/util/Set;
    .locals 3

    iget-object v0, p0, Lme/E;->a:Ljava/util/Map;

    sget-object v1, Lme/E$a;->VHT_CAPABILITIES:Lme/E$a;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lme/E$c;

    if-eqz v0, :cond_1

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-virtual {v0}, Lme/E$c;->a()Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    invoke-virtual {v0}, Lme/E$c;->a()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-static {v0}, LYg/A;->b(B)B

    move-result v0

    and-int/lit8 v2, v0, 0x8

    if-lez v2, :cond_0

    sget-object v2, LS8/d;->MHZ_160:LS8/d;

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    and-int/lit8 v0, v0, 0x4

    if-lez v0, :cond_2

    sget-object v0, LS8/d;->MHZ_80_80:LS8/d;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :cond_2
    :goto_0
    return-object v1
.end method

.method public static synthetic i(Lme/E$a;)I
    .locals 0

    invoke-static {p0}, Lme/E;->r(Lme/E$a;)I

    move-result p0

    return p0
.end method

.method public static synthetic j(Lme/E$a;)Z
    .locals 0

    invoke-static {p0}, Lme/E;->q(Lme/E$a;)Z

    move-result p0

    return p0
.end method

.method public static synthetic k(II)Lcom/ubnt/usurvey/wifi/WifiMcs;
    .locals 0

    invoke-static {p0, p1}, Lme/E;->y(II)Lcom/ubnt/usurvey/wifi/WifiMcs;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(II)Lcom/ubnt/usurvey/wifi/WifiMcs;
    .locals 0

    invoke-static {p0, p1}, Lme/E;->u(II)Lcom/ubnt/usurvey/wifi/WifiMcs;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(II)Lcom/ubnt/usurvey/wifi/WifiMcs;
    .locals 0

    invoke-static {p0, p1}, Lme/E;->w(II)Lcom/ubnt/usurvey/wifi/WifiMcs;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lme/E$a;)LYg/s;
    .locals 0

    invoke-static {p0}, Lme/E;->p(Lme/E$a;)LYg/s;

    move-result-object p0

    return-object p0
.end method

.method private static final o(Ljava/util/Map;Ljava/util/HashSet;Ljava/util/Map;IILjava/nio/ByteBuffer;)V
    .locals 2

    invoke-virtual {p5}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    new-instance v0, Lme/E$b;

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p5}, Ljava/nio/Buffer;->remaining()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    :goto_0
    invoke-direct {v0, p3, p4, p1}, Lme/E$b;-><init>(ILjava/lang/Integer;Ljava/lang/Integer;)V

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lme/E$a;

    if-eqz p0, :cond_1

    new-instance p1, Lme/E$c;

    invoke-direct {p1, p0, p5}, Lme/E$c;-><init>(Lme/E$a;Ljava/nio/ByteBuffer;)V

    invoke-interface {p2, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method private static final p(Lme/E$a;)LYg/s;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lme/E$a;->getCoordinates()Lme/E$b;

    move-result-object v0

    invoke-static {v0, p0}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p0

    return-object p0
.end method

.method private static final q(Lme/E$a;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lme/E$a;->getLength()Ljava/lang/Integer;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final r(Lme/E$a;)I
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lme/E$a;->getId()I

    move-result p0

    return p0
.end method

.method private final s(Lme/E$c;I)Lcom/ubnt/usurvey/wifi/WifiMcs;
    .locals 4

    const/4 v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {p1}, Lme/E$c;->a()Ljava/nio/ByteBuffer;

    move-result-object v1

    add-int/lit8 v2, p2, 0x3

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Lme/E$c;->a()Ljava/nio/ByteBuffer;

    move-result-object v1

    add-int/lit8 v2, p2, 0x2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Lme/E$c;->a()Ljava/nio/ByteBuffer;

    move-result-object v1

    add-int/lit8 v2, p2, 0x1

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Lme/E$c;->a()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p1

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result p2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/16 v2, 0x20

    if-ge v1, v2, :cond_1

    ushr-int v2, p2, v1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    div-int/lit8 p2, v1, 0x8

    add-int/lit8 v0, p2, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    move v1, v0

    :goto_1
    if-eqz v0, :cond_2

    :try_start_0
    sget-object p1, Lpe/c;->a:Lpe/c;

    sget-object p2, Lke/b;->HT:Lke/b;

    invoke-virtual {p1, p2, v1, v0}, Lpe/c;->a(Lke/b;II)Lcom/ubnt/usurvey/wifi/WifiMcs;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/IllegalStateException;

    const-string v0, "Failed to get MCS"

    invoke-direct {p2, v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_2
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to parse HT MCS: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private final t(Lme/E$c;Ljava/util/Set;)Lcom/ubnt/usurvey/wifi/WifiMcs;
    .locals 3

    invoke-virtual {p1}, Lme/E$c;->a()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v0

    const/16 v1, 0xe

    if-gt v1, v0, :cond_0

    sget-object v0, LS8/d;->MHZ_160:LS8/d;

    invoke-interface {p2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    sget-object v0, LS8/d;->MHZ_80_80:LS8/d;

    invoke-interface {p2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/16 v1, 0xb

    :cond_2
    :goto_0
    add-int/lit8 v0, v1, 0x3

    invoke-virtual {p1}, Lme/E$c;->a()Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/Buffer;->limit()I

    move-result v2

    if-gt v0, v2, :cond_3

    sget-object v2, LS8/d;->MHZ_320:LS8/d;

    invoke-interface {p2, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    move v1, v0

    :cond_3
    add-int/lit8 p2, v1, 0x3

    invoke-virtual {p1}, Lme/E$c;->a()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v0

    if-le p2, v0, :cond_4

    invoke-virtual {p1}, Lme/E$c;->a()Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/nio/Buffer;->limit()I

    move-result p2

    new-array p2, p2, [B

    invoke-virtual {p1}, Lme/E$c;->a()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    new-instance p1, Ljava/lang/IllegalStateException;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p2, v1, v0, v1}, Lkotlin/text/f;->u([BLkotlin/text/g;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to read EHT MCS: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    const/4 p2, 0x2

    invoke-static {p1, v1, p2, v1}, LZ7/b;->f(Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    return-object v1

    :cond_4
    new-instance p2, Lme/B;

    invoke-direct {p2}, Lme/B;-><init>()V

    invoke-direct {p0, p1, v1, p2}, Lme/E;->z(Lme/E$c;ILmh/p;)Lcom/ubnt/usurvey/wifi/WifiMcs;

    move-result-object p1

    return-object p1
.end method

.method private static final u(II)Lcom/ubnt/usurvey/wifi/WifiMcs;
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    const/4 v1, 0x1

    if-eq p0, v1, :cond_2

    const/4 v1, 0x2

    if-eq p0, v1, :cond_1

    const/4 v1, 0x3

    if-eq p0, v1, :cond_1

    const/4 v1, 0x4

    if-eq p0, v1, :cond_0

    const/4 v1, 0x5

    if-eq p0, v1, :cond_0

    move-object p0, v0

    goto :goto_0

    :cond_0
    const/16 p0, 0xd

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_0

    :cond_1
    const/16 p0, 0xb

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_0

    :cond_2
    const/16 p0, 0x9

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_3

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    :try_start_0
    sget-object v0, Lpe/c;->a:Lpe/c;

    sget-object v1, Lke/b;->EHT:Lke/b;

    invoke-virtual {v0, v1, p0, p1}, Lpe/c;->a(Lke/b;II)Lcom/ubnt/usurvey/wifi/WifiMcs;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Failed to get MCS"

    invoke-direct {p1, v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_3
    :goto_1
    return-object v0
.end method

.method private final v(Lme/E$c;I)Lcom/ubnt/usurvey/wifi/WifiMcs;
    .locals 1

    new-instance v0, Lme/z;

    invoke-direct {v0}, Lme/z;-><init>()V

    invoke-direct {p0, p1, p2, v0}, Lme/E;->A(Lme/E$c;ILmh/p;)Lcom/ubnt/usurvey/wifi/WifiMcs;

    move-result-object p1

    return-object p1
.end method

.method private static final w(II)Lcom/ubnt/usurvey/wifi/WifiMcs;
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    const/4 v1, 0x1

    if-eq p0, v1, :cond_1

    const/4 v1, 0x2

    if-eq p0, v1, :cond_0

    move-object p0, v0

    goto :goto_0

    :cond_0
    const/16 p0, 0xb

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_0

    :cond_1
    const/16 p0, 0x9

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_0

    :cond_2
    const/4 p0, 0x7

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_3

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    :try_start_0
    sget-object v0, Lpe/c;->a:Lpe/c;

    sget-object v1, Lke/b;->HE:Lke/b;

    invoke-virtual {v0, v1, p0, p1}, Lpe/c;->a(Lke/b;II)Lcom/ubnt/usurvey/wifi/WifiMcs;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Failed to get MCS"

    invoke-direct {p1, v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_3
    :goto_1
    return-object v0
.end method

.method private final x(Lme/E$c;I)Lcom/ubnt/usurvey/wifi/WifiMcs;
    .locals 1

    new-instance v0, Lme/A;

    invoke-direct {v0}, Lme/A;-><init>()V

    invoke-direct {p0, p1, p2, v0}, Lme/E;->A(Lme/E$c;ILmh/p;)Lcom/ubnt/usurvey/wifi/WifiMcs;

    move-result-object p1

    return-object p1
.end method

.method private static final y(II)Lcom/ubnt/usurvey/wifi/WifiMcs;
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    const/4 v1, 0x1

    if-eq p0, v1, :cond_0

    const/4 v1, 0x2

    if-eq p0, v1, :cond_0

    move-object p0, v0

    goto :goto_0

    :cond_0
    const/16 p0, 0x9

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    :try_start_0
    sget-object v0, Lpe/c;->a:Lpe/c;

    sget-object v1, Lke/b;->VHT:Lke/b;

    invoke-virtual {v0, v1, p0, p1}, Lpe/c;->a(Lke/b;II)Lcom/ubnt/usurvey/wifi/WifiMcs;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Failed to get MCS"

    invoke-direct {p1, v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_1
    :goto_1
    return-object v0
.end method

.method private final z(Lme/E$c;ILmh/p;)Lcom/ubnt/usurvey/wifi/WifiMcs;
    .locals 3

    const/4 v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {p1}, Lme/E$c;->a()Ljava/nio/ByteBuffer;

    move-result-object v1

    add-int/lit8 v2, p2, 0x2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Lme/E$c;->a()Ljava/nio/ByteBuffer;

    move-result-object v1

    add-int/lit8 v2, p2, 0x1

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Lme/E$c;->a()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p1

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result p1

    sget-object p2, Lsh/g;->d:Lsh/g$a;

    const/4 v0, 0x0

    const/4 v1, -0x1

    const/4 v2, 0x5

    invoke-virtual {p2, v2, v0, v1}, Lsh/g$a;->a(III)Lsh/g;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v0, p2

    check-cast v0, LZg/Q;

    invoke-virtual {v0}, LZg/Q;->d()I

    move-result v0

    mul-int/lit8 v1, v0, 0x4

    rsub-int/lit8 v1, v1, 0x1c

    shl-int v1, p1, v1

    shr-int/lit8 v1, v1, 0x1c

    if-lez v1, :cond_0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p3, v0, v1}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ubnt/usurvey/wifi/WifiMcs;

    if-eqz v0, :cond_0

    return-object v0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 4

    iget-object v0, p0, Lme/E;->a:Ljava/util/Map;

    sget-object v1, Lme/E$a;->EHT_OPERATION:Lme/E$a;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lme/E$c;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lme/E$c;->a()Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    invoke-virtual {v0}, Lme/E$c;->a()Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/Buffer;->remaining()I

    move-result v2

    const/4 v3, 0x6

    if-lt v2, v3, :cond_1

    invoke-virtual {v0}, Lme/E$c;->a()Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    invoke-static {v0}, LYg/A;->b(B)B

    move-result v0

    and-int/lit8 v0, v0, 0x4

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    :cond_1
    return-object v1
.end method

.method public b()Ljava/lang/Integer;
    .locals 4

    iget-object v0, p0, Lme/E;->a:Ljava/util/Map;

    sget-object v1, Lme/E$a;->QBSS_LOAD:Lme/E$a;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lme/E$c;

    if-eqz v0, :cond_0

    const/4 v1, 0x4

    new-array v1, v1, [B

    invoke-virtual {v0}, Lme/E$c;->a()Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-virtual {v0, v1, v2, v3}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    invoke-static {v1}, LZg/n;->O0([B)V

    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public c()Ljava/util/Set;
    .locals 3

    invoke-static {}, LZg/d0;->b()Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, Lme/E;->a:Ljava/util/Map;

    sget-object v2, Lme/E$a;->HT_RATES:Lme/E$a;

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lme/E$c;

    if-eqz v1, :cond_0

    invoke-direct {p0, v1}, Lme/E;->B(Lme/E$c;)Ljava/util/Set;

    move-result-object v1

    if-eqz v1, :cond_0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_0
    iget-object v1, p0, Lme/E;->a:Ljava/util/Map;

    sget-object v2, Lme/E$a;->HT_RATES_EXTENDED:Lme/E$a;

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lme/E$c;

    if-eqz v1, :cond_1

    invoke-direct {p0, v1}, Lme/E;->B(Lme/E$c;)Ljava/util/Set;

    move-result-object v1

    if-eqz v1, :cond_1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_1
    invoke-static {v0}, LZg/d0;->a(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/lang/Float;
    .locals 2

    iget-object v0, p0, Lme/E;->a:Ljava/util/Map;

    sget-object v1, Lme/E$a;->QBSS_LOAD:Lme/E$a;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lme/E$c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lme/E$c;->a()Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    invoke-static {v0}, LYg/A;->b(B)B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    int-to-float v0, v0

    const/high16 v1, 0x437f0000    # 255.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public e(LS8/a;LS8/c;)Ljava/util/Set;
    .locals 1

    const-string v0, "ieeeMode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "band"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lme/E$d;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object p1

    goto/16 :goto_0

    :pswitch_1
    sget-object p1, Lme/E$d;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    const/4 p2, 0x1

    if-eq p1, p2, :cond_4

    const/4 p2, 0x2

    if-eq p1, p2, :cond_2

    const/4 p2, 0x3

    if-ne p1, p2, :cond_1

    invoke-static {}, LZg/d0;->b()Ljava/util/Set;

    move-result-object p1

    sget-object p2, LS8/d;->MHZ_20:LS8/d;

    invoke-interface {p1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object p2, LS8/d;->MHZ_40:LS8/d;

    invoke-interface {p1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object p2, LS8/d;->MHZ_80:LS8/d;

    invoke-interface {p1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-direct {p0}, Lme/E;->C()Ljava/util/Set;

    move-result-object p2

    if-eqz p2, :cond_0

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p1, p2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_0
    invoke-static {p1}, LZg/d0;->a(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    invoke-static {}, LZg/d0;->b()Ljava/util/Set;

    move-result-object p1

    sget-object p2, LS8/d;->MHZ_20:LS8/d;

    invoke-interface {p1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object p2, LS8/d;->MHZ_40:LS8/d;

    invoke-interface {p1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object p2, LS8/d;->MHZ_80:LS8/d;

    invoke-interface {p1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-direct {p0}, Lme/E;->D()Ljava/util/Set;

    move-result-object p2

    if-eqz p2, :cond_3

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p1, p2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_3
    invoke-static {p1}, LZg/d0;->a(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    goto :goto_0

    :cond_4
    sget-object p1, LS8/d;->MHZ_20:LS8/d;

    sget-object p2, LS8/d;->MHZ_40:LS8/d;

    filled-new-array {p1, p2}, [LS8/d;

    move-result-object p1

    invoke-static {p1}, LZg/d0;->i([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    goto :goto_0

    :pswitch_2
    sget-object p1, LS8/d;->MHZ_20:LS8/d;

    sget-object p2, LS8/d;->MHZ_40:LS8/d;

    filled-new-array {p1, p2}, [LS8/d;

    move-result-object p1

    invoke-static {p1}, LZg/d0;->i([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    goto :goto_0

    :pswitch_3
    sget-object p1, LS8/d;->MHZ_20:LS8/d;

    invoke-static {p1}, LZg/d0;->c(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public f(Ljava/util/Set;)Lcom/ubnt/usurvey/wifi/WifiMcs;
    .locals 5

    const-string v0, "Mcs parsing failed"

    const-string v1, "supportedChannelWidthSet"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x4

    const/4 v2, 0x0

    :try_start_0
    iget-object v3, p0, Lme/E;->a:Ljava/util/Map;

    sget-object v4, Lme/E$a;->EHT_CAPABILITIES:Lme/E$a;

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lme/E$c;

    if-eqz v3, :cond_0

    invoke-direct {p0, v3, p1}, Lme/E;->t(Lme/E$c;Ljava/util/Set;)Lcom/ubnt/usurvey/wifi/WifiMcs;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lme/E;->a:Ljava/util/Map;

    sget-object v3, Lme/E$a;->HE_CAPABILITIES:Lme/E$a;

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lme/E$c;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lme/E$c;->a()Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/nio/Buffer;->remaining()I

    move-result v3

    const/16 v4, 0x12

    if-ge v3, v4, :cond_1

    return-object v2

    :cond_1
    const/16 v3, 0x11

    invoke-direct {p0, p1, v3}, Lme/E;->v(Lme/E$c;I)Lcom/ubnt/usurvey/wifi/WifiMcs;

    move-result-object p1

    return-object p1

    :cond_2
    iget-object p1, p0, Lme/E;->a:Ljava/util/Map;

    sget-object v3, Lme/E$a;->VHT_CAPABILITIES:Lme/E$a;

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lme/E$c;

    if-eqz p1, :cond_3

    invoke-direct {p0, p1, v1}, Lme/E;->x(Lme/E$c;I)Lcom/ubnt/usurvey/wifi/WifiMcs;

    move-result-object p1

    if-eqz p1, :cond_3

    return-object p1

    :cond_3
    iget-object p1, p0, Lme/E;->a:Ljava/util/Map;

    sget-object v3, Lme/E$a;->HT_CAPABILITIES:Lme/E$a;

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lme/E$c;

    if-eqz p1, :cond_4

    const/4 v3, 0x3

    invoke-direct {p0, p1, v3}, Lme/E;->s(Lme/E$c;I)Lcom/ubnt/usurvey/wifi/WifiMcs;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/ubnt/usurvey/wifi/WifiMcs$InvalidWifiMcs; {:try_start_0 .. :try_end_0} :catch_1

    :cond_4
    return-object v2

    :catch_1
    const/4 p1, 0x6

    invoke-static {v0, v2, v2, p1, v2}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    return-object v2

    :goto_0
    invoke-static {v0, p1, v2, v1, v2}, LZ7/b;->j(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    return-object v2
.end method

.method public g(LS8/c;Ljava/util/Set;)LS8/a;
    .locals 2

    const-string v0, "band"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "supportedHtRates"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lme/E;->a:Ljava/util/Map;

    sget-object v1, Lme/E$a;->EHT_OPERATION:Lme/E$a;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object p1, LS8/a;->BE:LS8/a;

    goto/16 :goto_1

    :cond_0
    iget-object v0, p0, Lme/E;->a:Ljava/util/Map;

    sget-object v1, Lme/E$a;->HE_CAPABILITIES:Lme/E$a;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object p1, LS8/a;->AX:LS8/a;

    goto/16 :goto_1

    :cond_1
    sget-object v0, LS8/c;->GHZ_2_4:LS8/c;

    if-eq p1, v0, :cond_2

    iget-object v0, p0, Lme/E;->a:Ljava/util/Map;

    sget-object v1, Lme/E$a;->VHT_CAPABILITIES:Lme/E$a;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    sget-object p1, LS8/a;->AC:LS8/a;

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lme/E;->a:Ljava/util/Map;

    sget-object v1, Lme/E$a;->HT_CAPABILITIES:Lme/E$a;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    sget-object p1, LS8/a;->N:LS8/a;

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lme/E;->a:Ljava/util/Map;

    sget-object v1, Lme/E$a;->ERP:Lme/E$a;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    sget-object p1, LS8/a;->G:LS8/a;

    goto :goto_1

    :cond_4
    sget-object v0, Lme/E$d;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_7

    const/4 p2, 0x2

    if-eq p1, p2, :cond_6

    const/4 p2, 0x3

    if-ne p1, p2, :cond_5

    sget-object p1, LS8/a;->AX:LS8/a;

    goto :goto_1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_6
    sget-object p1, LS8/a;->N:LS8/a;

    goto :goto_1

    :cond_7
    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_8

    sget-object p1, LS8/a;->B:LS8/a;

    goto :goto_1

    :cond_8
    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    check-cast v0, LW7/a;

    invoke-virtual {v0}, LW7/a;->d()I

    move-result v0

    const/16 v1, 0x18

    if-ge v0, v1, :cond_9

    goto :goto_0

    :cond_a
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_b

    sget-object p1, LS8/a;->A:LS8/a;

    goto :goto_1

    :cond_b
    sget-object p1, LS8/a;->G:LS8/a;

    :goto_1
    return-object p1
.end method

.method public h()Ljava/lang/Integer;
    .locals 3

    iget-object v0, p0, Lme/E;->a:Ljava/util/Map;

    sget-object v1, Lme/E$a;->TRANSMIT_POWER:Lme/E$a;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lme/E$c;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lme/E$c;->a()Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v2

    if-eqz v2, :cond_0

    move-object v1, v0

    :cond_0
    return-object v1
.end method
