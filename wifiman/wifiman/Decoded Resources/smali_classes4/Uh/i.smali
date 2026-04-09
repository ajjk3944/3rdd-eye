.class public final LUh/i;
.super Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LUh/i$b;
    }
.end annotation


# static fields
.field private static final v:LUh/i;

.field public static w:Lkotlin/reflect/jvm/internal/impl/protobuf/p;


# instance fields
.field private final c:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:LUh/q;

.field private i:I

.field private j:Ljava/util/List;

.field private k:LUh/q;

.field private l:I

.field private m:Ljava/util/List;

.field private n:Ljava/util/List;

.field private o:I

.field private p:Ljava/util/List;

.field private q:LUh/t;

.field private r:Ljava/util/List;

.field private s:LUh/e;

.field private t:B

.field private u:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LUh/i$a;

    invoke-direct {v0}, LUh/i$a;-><init>()V

    sput-object v0, LUh/i;->w:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    new-instance v0, LUh/i;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LUh/i;-><init>(Z)V

    sput-object v0, LUh/i;->v:LUh/i;

    invoke-direct {v0}, LUh/i;->K1()V

    return-void
.end method

.method private constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)V
    .locals 13

    .line 13
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;-><init>()V

    const/4 v0, -0x1

    .line 14
    iput v0, p0, LUh/i;->o:I

    .line 15
    iput-byte v0, p0, LUh/i;->t:B

    .line 16
    iput v0, p0, LUh/i;->u:I

    .line 17
    invoke-direct {p0}, LUh/i;->K1()V

    .line 18
    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->u()Lkotlin/reflect/jvm/internal/impl/protobuf/d$b;

    move-result-object v0

    const/4 v1, 0x1

    .line 19
    invoke-static {v0, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->I(Ljava/io/OutputStream;I)Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    :cond_0
    :goto_0
    const/16 v5, 0x400

    const/16 v6, 0x20

    const/16 v7, 0x200

    const/16 v8, 0x1000

    const/16 v9, 0x100

    if-nez v3, :cond_17

    .line 20
    :try_start_0
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->J()I

    move-result v10

    const/4 v11, 0x0

    sparse-switch v10, :sswitch_data_0

    .line 21
    invoke-virtual {p0, p1, v2, p2, v10}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->y(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;Lkotlin/reflect/jvm/internal/impl/protobuf/f;I)Z

    move-result v5

    if-nez v5, :cond_0

    :sswitch_0
    move v3, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :catch_0
    move-exception p1

    goto/16 :goto_3

    :catch_1
    move-exception p1

    goto/16 :goto_4

    .line 22
    :sswitch_1
    iget v10, p0, LUh/i;->d:I

    and-int/2addr v10, v9

    if-ne v10, v9, :cond_1

    .line 23
    iget-object v10, p0, LUh/i;->s:LUh/e;

    invoke-virtual {v10}, LUh/e;->q0()LUh/e$b;

    move-result-object v11

    .line 24
    :cond_1
    sget-object v10, LUh/e;->g:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-virtual {p1, v10, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->t(Lkotlin/reflect/jvm/internal/impl/protobuf/p;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    move-result-object v10

    check-cast v10, LUh/e;

    iput-object v10, p0, LUh/i;->s:LUh/e;

    if-eqz v11, :cond_2

    .line 25
    invoke-virtual {v11, v10}, LUh/e$b;->w(LUh/e;)LUh/e$b;

    .line 26
    invoke-virtual {v11}, LUh/e$b;->p()LUh/e;

    move-result-object v10

    iput-object v10, p0, LUh/i;->s:LUh/e;

    .line 27
    :cond_2
    iget v10, p0, LUh/i;->d:I

    or-int/2addr v10, v9

    iput v10, p0, LUh/i;->d:I

    goto :goto_0

    .line 28
    :sswitch_2
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->z()I

    move-result v10

    .line 29
    invoke-virtual {p1, v10}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->i(I)I

    move-result v10

    and-int/lit16 v11, v4, 0x1000

    if-eq v11, v8, :cond_3

    .line 30
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->e()I

    move-result v11

    if-lez v11, :cond_3

    .line 31
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iput-object v11, p0, LUh/i;->r:Ljava/util/List;

    or-int/lit16 v4, v4, 0x1000

    .line 32
    :cond_3
    :goto_1
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->e()I

    move-result v11

    if-lez v11, :cond_4

    .line 33
    iget-object v11, p0, LUh/i;->r:Ljava/util/List;

    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->r()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 34
    :cond_4
    invoke-virtual {p1, v10}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->h(I)V

    goto :goto_0

    :sswitch_3
    and-int/lit16 v10, v4, 0x1000

    if-eq v10, v8, :cond_5

    .line 35
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    iput-object v10, p0, LUh/i;->r:Ljava/util/List;

    or-int/lit16 v4, v4, 0x1000

    .line 36
    :cond_5
    iget-object v10, p0, LUh/i;->r:Ljava/util/List;

    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->r()I

    move-result v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 37
    :sswitch_4
    iget v10, p0, LUh/i;->d:I

    const/16 v12, 0x80

    and-int/2addr v10, v12

    if-ne v10, v12, :cond_6

    .line 38
    iget-object v10, p0, LUh/i;->q:LUh/t;

    invoke-virtual {v10}, LUh/t;->M0()LUh/t$b;

    move-result-object v11

    .line 39
    :cond_6
    sget-object v10, LUh/t;->i:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-virtual {p1, v10, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->t(Lkotlin/reflect/jvm/internal/impl/protobuf/p;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    move-result-object v10

    check-cast v10, LUh/t;

    iput-object v10, p0, LUh/i;->q:LUh/t;

    if-eqz v11, :cond_7

    .line 40
    invoke-virtual {v11, v10}, LUh/t$b;->w(LUh/t;)LUh/t$b;

    .line 41
    invoke-virtual {v11}, LUh/t$b;->p()LUh/t;

    move-result-object v10

    iput-object v10, p0, LUh/i;->q:LUh/t;

    .line 42
    :cond_7
    iget v10, p0, LUh/i;->d:I

    or-int/2addr v10, v12

    iput v10, p0, LUh/i;->d:I

    goto/16 :goto_0

    .line 43
    :sswitch_5
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->z()I

    move-result v10

    .line 44
    invoke-virtual {p1, v10}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->i(I)I

    move-result v10

    and-int/lit16 v11, v4, 0x200

    if-eq v11, v7, :cond_8

    .line 45
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->e()I

    move-result v11

    if-lez v11, :cond_8

    .line 46
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iput-object v11, p0, LUh/i;->n:Ljava/util/List;

    or-int/lit16 v4, v4, 0x200

    .line 47
    :cond_8
    :goto_2
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->e()I

    move-result v11

    if-lez v11, :cond_9

    .line 48
    iget-object v11, p0, LUh/i;->n:Ljava/util/List;

    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->r()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 49
    :cond_9
    invoke-virtual {p1, v10}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->h(I)V

    goto/16 :goto_0

    :sswitch_6
    and-int/lit16 v10, v4, 0x200

    if-eq v10, v7, :cond_a

    .line 50
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    iput-object v10, p0, LUh/i;->n:Ljava/util/List;

    or-int/lit16 v4, v4, 0x200

    .line 51
    :cond_a
    iget-object v10, p0, LUh/i;->n:Ljava/util/List;

    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->r()I

    move-result v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :sswitch_7
    and-int/lit16 v10, v4, 0x100

    if-eq v10, v9, :cond_b

    .line 52
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    iput-object v10, p0, LUh/i;->m:Ljava/util/List;

    or-int/lit16 v4, v4, 0x100

    .line 53
    :cond_b
    iget-object v10, p0, LUh/i;->m:Ljava/util/List;

    sget-object v11, LUh/q;->v:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-virtual {p1, v11, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->t(Lkotlin/reflect/jvm/internal/impl/protobuf/p;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    move-result-object v11

    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 54
    :sswitch_8
    iget v10, p0, LUh/i;->d:I

    or-int/2addr v10, v1

    iput v10, p0, LUh/i;->d:I

    .line 55
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->r()I

    move-result v10

    iput v10, p0, LUh/i;->e:I

    goto/16 :goto_0

    .line 56
    :sswitch_9
    iget v10, p0, LUh/i;->d:I

    or-int/lit8 v10, v10, 0x40

    iput v10, p0, LUh/i;->d:I

    .line 57
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->r()I

    move-result v10

    iput v10, p0, LUh/i;->l:I

    goto/16 :goto_0

    .line 58
    :sswitch_a
    iget v10, p0, LUh/i;->d:I

    or-int/lit8 v10, v10, 0x10

    iput v10, p0, LUh/i;->d:I

    .line 59
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->r()I

    move-result v10

    iput v10, p0, LUh/i;->i:I

    goto/16 :goto_0

    :sswitch_b
    and-int/lit16 v10, v4, 0x400

    if-eq v10, v5, :cond_c

    .line 60
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    iput-object v10, p0, LUh/i;->p:Ljava/util/List;

    or-int/lit16 v4, v4, 0x400

    .line 61
    :cond_c
    iget-object v10, p0, LUh/i;->p:Ljava/util/List;

    sget-object v11, LUh/u;->n:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-virtual {p1, v11, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->t(Lkotlin/reflect/jvm/internal/impl/protobuf/p;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    move-result-object v11

    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 62
    :sswitch_c
    iget v10, p0, LUh/i;->d:I

    and-int/2addr v10, v6

    if-ne v10, v6, :cond_d

    .line 63
    iget-object v10, p0, LUh/i;->k:LUh/q;

    invoke-virtual {v10}, LUh/q;->K1()LUh/q$c;

    move-result-object v11

    .line 64
    :cond_d
    sget-object v10, LUh/q;->v:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-virtual {p1, v10, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->t(Lkotlin/reflect/jvm/internal/impl/protobuf/p;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    move-result-object v10

    check-cast v10, LUh/q;

    iput-object v10, p0, LUh/i;->k:LUh/q;

    if-eqz v11, :cond_e

    .line 65
    invoke-virtual {v11, v10}, LUh/q$c;->E(LUh/q;)LUh/q$c;

    .line 66
    invoke-virtual {v11}, LUh/q$c;->u()LUh/q;

    move-result-object v10

    iput-object v10, p0, LUh/i;->k:LUh/q;

    .line 67
    :cond_e
    iget v10, p0, LUh/i;->d:I

    or-int/2addr v10, v6

    iput v10, p0, LUh/i;->d:I

    goto/16 :goto_0

    :sswitch_d
    and-int/lit8 v10, v4, 0x20

    if-eq v10, v6, :cond_f

    .line 68
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    iput-object v10, p0, LUh/i;->j:Ljava/util/List;

    or-int/lit8 v4, v4, 0x20

    .line 69
    :cond_f
    iget-object v10, p0, LUh/i;->j:Ljava/util/List;

    sget-object v11, LUh/s;->o:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-virtual {p1, v11, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->t(Lkotlin/reflect/jvm/internal/impl/protobuf/p;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    move-result-object v11

    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 70
    :sswitch_e
    iget v10, p0, LUh/i;->d:I

    const/16 v12, 0x8

    and-int/2addr v10, v12

    if-ne v10, v12, :cond_10

    .line 71
    iget-object v10, p0, LUh/i;->h:LUh/q;

    invoke-virtual {v10}, LUh/q;->K1()LUh/q$c;

    move-result-object v11

    .line 72
    :cond_10
    sget-object v10, LUh/q;->v:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-virtual {p1, v10, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->t(Lkotlin/reflect/jvm/internal/impl/protobuf/p;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    move-result-object v10

    check-cast v10, LUh/q;

    iput-object v10, p0, LUh/i;->h:LUh/q;

    if-eqz v11, :cond_11

    .line 73
    invoke-virtual {v11, v10}, LUh/q$c;->E(LUh/q;)LUh/q$c;

    .line 74
    invoke-virtual {v11}, LUh/q$c;->u()LUh/q;

    move-result-object v10

    iput-object v10, p0, LUh/i;->h:LUh/q;

    .line 75
    :cond_11
    iget v10, p0, LUh/i;->d:I

    or-int/2addr v10, v12

    iput v10, p0, LUh/i;->d:I

    goto/16 :goto_0

    .line 76
    :sswitch_f
    iget v10, p0, LUh/i;->d:I

    or-int/lit8 v10, v10, 0x4

    iput v10, p0, LUh/i;->d:I

    .line 77
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->r()I

    move-result v10

    iput v10, p0, LUh/i;->g:I

    goto/16 :goto_0

    .line 78
    :sswitch_10
    iget v10, p0, LUh/i;->d:I

    or-int/lit8 v10, v10, 0x2

    iput v10, p0, LUh/i;->d:I

    .line 79
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->r()I

    move-result v10

    iput v10, p0, LUh/i;->f:I
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 80
    :goto_3
    :try_start_1
    new-instance p2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 81
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->n(Lkotlin/reflect/jvm/internal/impl/protobuf/n;)Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1

    .line 82
    :goto_4
    invoke-virtual {p1, p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->n(Lkotlin/reflect/jvm/internal/impl/protobuf/n;)Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_5
    and-int/lit8 p2, v4, 0x20

    if-ne p2, v6, :cond_12

    .line 83
    iget-object p2, p0, LUh/i;->j:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, LUh/i;->j:Ljava/util/List;

    :cond_12
    and-int/lit16 p2, v4, 0x400

    if-ne p2, v5, :cond_13

    .line 84
    iget-object p2, p0, LUh/i;->p:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, LUh/i;->p:Ljava/util/List;

    :cond_13
    and-int/lit16 p2, v4, 0x100

    if-ne p2, v9, :cond_14

    .line 85
    iget-object p2, p0, LUh/i;->m:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, LUh/i;->m:Ljava/util/List;

    :cond_14
    and-int/lit16 p2, v4, 0x200

    if-ne p2, v7, :cond_15

    .line 86
    iget-object p2, p0, LUh/i;->n:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, LUh/i;->n:Ljava/util/List;

    :cond_15
    and-int/lit16 p2, v4, 0x1000

    if-ne p2, v8, :cond_16

    .line 87
    iget-object p2, p0, LUh/i;->r:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, LUh/i;->r:Ljava/util/List;

    .line 88
    :cond_16
    :try_start_2
    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 89
    :catch_2
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/d$b;->p()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p2

    iput-object p2, p0, LUh/i;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    goto :goto_6

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/d$b;->p()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p2

    iput-object p2, p0, LUh/i;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    .line 90
    throw p1

    .line 91
    :goto_6
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->s()V

    .line 92
    throw p1

    :cond_17
    and-int/lit8 p1, v4, 0x20

    if-ne p1, v6, :cond_18

    .line 93
    iget-object p1, p0, LUh/i;->j:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LUh/i;->j:Ljava/util/List;

    :cond_18
    and-int/lit16 p1, v4, 0x400

    if-ne p1, v5, :cond_19

    .line 94
    iget-object p1, p0, LUh/i;->p:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LUh/i;->p:Ljava/util/List;

    :cond_19
    and-int/lit16 p1, v4, 0x100

    if-ne p1, v9, :cond_1a

    .line 95
    iget-object p1, p0, LUh/i;->m:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LUh/i;->m:Ljava/util/List;

    :cond_1a
    and-int/lit16 p1, v4, 0x200

    if-ne p1, v7, :cond_1b

    .line 96
    iget-object p1, p0, LUh/i;->n:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LUh/i;->n:Ljava/util/List;

    :cond_1b
    and-int/lit16 p1, v4, 0x1000

    if-ne p1, v8, :cond_1c

    .line 97
    iget-object p1, p0, LUh/i;->r:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LUh/i;->r:Ljava/util/List;

    .line 98
    :cond_1c
    :try_start_3
    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 99
    :catch_3
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/d$b;->p()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    iput-object p1, p0, LUh/i;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    goto :goto_7

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/d$b;->p()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p2

    iput-object p2, p0, LUh/i;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    .line 100
    throw p1

    .line 101
    :goto_7
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->s()V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_10
        0x10 -> :sswitch_f
        0x1a -> :sswitch_e
        0x22 -> :sswitch_d
        0x2a -> :sswitch_c
        0x32 -> :sswitch_b
        0x38 -> :sswitch_a
        0x40 -> :sswitch_9
        0x48 -> :sswitch_8
        0x52 -> :sswitch_7
        0x58 -> :sswitch_6
        0x5a -> :sswitch_5
        0xf2 -> :sswitch_4
        0xf8 -> :sswitch_3
        0xfa -> :sswitch_2
        0x102 -> :sswitch_1
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;LUh/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LUh/i;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)V

    return-void
.end method

.method private constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;)V

    const/4 v0, -0x1

    .line 4
    iput v0, p0, LUh/i;->o:I

    .line 5
    iput-byte v0, p0, LUh/i;->t:B

    .line 6
    iput v0, p0, LUh/i;->u:I

    .line 7
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->e()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    iput-object p1, p0, LUh/i;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    return-void
.end method

.method synthetic constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;LUh/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LUh/i;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 8
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;-><init>()V

    const/4 p1, -0x1

    .line 9
    iput p1, p0, LUh/i;->o:I

    .line 10
    iput-byte p1, p0, LUh/i;->t:B

    .line 11
    iput p1, p0, LUh/i;->u:I

    .line 12
    sget-object p1, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->a:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    iput-object p1, p0, LUh/i;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    return-void
.end method

.method static synthetic C0(LUh/i;I)I
    .locals 0

    iput p1, p0, LUh/i;->g:I

    return p1
.end method

.method static synthetic E0(LUh/i;LUh/q;)LUh/q;
    .locals 0

    iput-object p1, p0, LUh/i;->h:LUh/q;

    return-object p1
.end method

.method static synthetic G0(LUh/i;I)I
    .locals 0

    iput p1, p0, LUh/i;->i:I

    return p1
.end method

.method static synthetic K0(LUh/i;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LUh/i;->j:Ljava/util/List;

    return-object p0
.end method

.method private K1()V
    .locals 2

    const/4 v0, 0x6

    iput v0, p0, LUh/i;->e:I

    iput v0, p0, LUh/i;->f:I

    const/4 v0, 0x0

    iput v0, p0, LUh/i;->g:I

    invoke-static {}, LUh/q;->h1()LUh/q;

    move-result-object v1

    iput-object v1, p0, LUh/i;->h:LUh/q;

    iput v0, p0, LUh/i;->i:I

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, LUh/i;->j:Ljava/util/List;

    invoke-static {}, LUh/q;->h1()LUh/q;

    move-result-object v1

    iput-object v1, p0, LUh/i;->k:LUh/q;

    iput v0, p0, LUh/i;->l:I

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/i;->m:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/i;->n:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/i;->p:Ljava/util/List;

    invoke-static {}, LUh/t;->P()LUh/t;

    move-result-object v0

    iput-object v0, p0, LUh/i;->q:LUh/t;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/i;->r:Ljava/util/List;

    invoke-static {}, LUh/e;->J()LUh/e;

    move-result-object v0

    iput-object v0, p0, LUh/i;->s:LUh/e;

    return-void
.end method

.method public static L1()LUh/i$b;
    .locals 1

    invoke-static {}, LUh/i$b;->r()LUh/i$b;

    move-result-object v0

    return-object v0
.end method

.method static synthetic M0(LUh/i;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, LUh/i;->j:Ljava/util/List;

    return-object p1
.end method

.method public static M1(LUh/i;)LUh/i$b;
    .locals 1

    invoke-static {}, LUh/i;->L1()LUh/i$b;

    move-result-object v0

    invoke-virtual {v0, p0}, LUh/i$b;->H(LUh/i;)LUh/i$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic N0(LUh/i;LUh/q;)LUh/q;
    .locals 0

    iput-object p1, p0, LUh/i;->k:LUh/q;

    return-object p1
.end method

.method public static O1(Ljava/io/InputStream;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/i;
    .locals 1

    sget-object v0, LUh/i;->w:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-interface {v0, p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/p;->a(Ljava/io/InputStream;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LUh/i;

    return-object p0
.end method

.method static synthetic P0(LUh/i;I)I
    .locals 0

    iput p1, p0, LUh/i;->l:I

    return p1
.end method

.method static synthetic T0(LUh/i;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LUh/i;->m:Ljava/util/List;

    return-object p0
.end method

.method static synthetic U0(LUh/i;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, LUh/i;->m:Ljava/util/List;

    return-object p1
.end method

.method static synthetic V0(LUh/i;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LUh/i;->n:Ljava/util/List;

    return-object p0
.end method

.method static synthetic W0(LUh/i;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, LUh/i;->n:Ljava/util/List;

    return-object p1
.end method

.method static synthetic X0(LUh/i;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LUh/i;->p:Ljava/util/List;

    return-object p0
.end method

.method static synthetic Y0(LUh/i;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, LUh/i;->p:Ljava/util/List;

    return-object p1
.end method

.method static synthetic Z0(LUh/i;LUh/t;)LUh/t;
    .locals 0

    iput-object p1, p0, LUh/i;->q:LUh/t;

    return-object p1
.end method

.method static synthetic a1(LUh/i;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LUh/i;->r:Ljava/util/List;

    return-object p0
.end method

.method static synthetic b1(LUh/i;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, LUh/i;->r:Ljava/util/List;

    return-object p1
.end method

.method static synthetic c1(LUh/i;LUh/e;)LUh/e;
    .locals 0

    iput-object p1, p0, LUh/i;->s:LUh/e;

    return-object p1
.end method

.method static synthetic d1(LUh/i;I)I
    .locals 0

    iput p1, p0, LUh/i;->d:I

    return p1
.end method

.method static synthetic e1(LUh/i;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;
    .locals 0

    iget-object p0, p0, LUh/i;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    return-object p0
.end method

.method static synthetic f0(LUh/i;I)I
    .locals 0

    iput p1, p0, LUh/i;->e:I

    return p1
.end method

.method public static k1()LUh/i;
    .locals 1

    sget-object v0, LUh/i;->v:LUh/i;

    return-object v0
.end method

.method static synthetic q0(LUh/i;I)I
    .locals 0

    iput p1, p0, LUh/i;->f:I

    return p1
.end method


# virtual methods
.method public A1()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LUh/i;->r:Ljava/util/List;

    return-object v0
.end method

.method public B1()Z
    .locals 2

    iget v0, p0, LUh/i;->d:I

    const/16 v1, 0x100

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public C1()Z
    .locals 2

    iget v0, p0, LUh/i;->d:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public D1()Z
    .locals 2

    iget v0, p0, LUh/i;->d:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public E1()Z
    .locals 2

    iget v0, p0, LUh/i;->d:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public F1()Z
    .locals 2

    iget v0, p0, LUh/i;->d:I

    const/16 v1, 0x20

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public G1()Z
    .locals 2

    iget v0, p0, LUh/i;->d:I

    const/16 v1, 0x40

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public H1()Z
    .locals 2

    iget v0, p0, LUh/i;->d:I

    const/16 v1, 0x8

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public I1()Z
    .locals 2

    iget v0, p0, LUh/i;->d:I

    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public J1()Z
    .locals 2

    iget v0, p0, LUh/i;->d:I

    const/16 v1, 0x80

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public N1()LUh/i$b;
    .locals 1

    invoke-static {}, LUh/i;->L1()LUh/i$b;

    move-result-object v0

    return-object v0
.end method

.method public P1()LUh/i$b;
    .locals 1

    invoke-static {p0}, LUh/i;->M1(LUh/i;)LUh/i$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c()Lkotlin/reflect/jvm/internal/impl/protobuf/n;
    .locals 1

    invoke-virtual {p0}, LUh/i;->l1()LUh/i;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 9

    iget v0, p0, LUh/i;->u:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, LUh/i;->d:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_1

    iget v0, p0, LUh/i;->f:I

    invoke-static {v3, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->o(II)I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    iget v4, p0, LUh/i;->d:I

    const/4 v5, 0x4

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_2

    iget v4, p0, LUh/i;->g:I

    invoke-static {v1, v4}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->o(II)I

    move-result v4

    add-int/2addr v0, v4

    :cond_2
    iget v4, p0, LUh/i;->d:I

    const/16 v6, 0x8

    and-int/2addr v4, v6

    if-ne v4, v6, :cond_3

    const/4 v4, 0x3

    iget-object v7, p0, LUh/i;->h:LUh/q;

    invoke-static {v4, v7}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->r(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)I

    move-result v4

    add-int/2addr v0, v4

    :cond_3
    move v4, v2

    :goto_1
    iget-object v7, p0, LUh/i;->j:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-ge v4, v7, :cond_4

    iget-object v7, p0, LUh/i;->j:Ljava/util/List;

    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    invoke-static {v5, v7}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->r(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)I

    move-result v7

    add-int/2addr v0, v7

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_4
    iget v4, p0, LUh/i;->d:I

    const/16 v5, 0x20

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_5

    const/4 v4, 0x5

    iget-object v7, p0, LUh/i;->k:LUh/q;

    invoke-static {v4, v7}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->r(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)I

    move-result v4

    add-int/2addr v0, v4

    :cond_5
    move v4, v2

    :goto_2
    iget-object v7, p0, LUh/i;->p:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-ge v4, v7, :cond_6

    iget-object v7, p0, LUh/i;->p:Ljava/util/List;

    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    const/4 v8, 0x6

    invoke-static {v8, v7}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->r(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)I

    move-result v7

    add-int/2addr v0, v7

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_6
    iget v4, p0, LUh/i;->d:I

    const/16 v7, 0x10

    and-int/2addr v4, v7

    if-ne v4, v7, :cond_7

    const/4 v4, 0x7

    iget v7, p0, LUh/i;->i:I

    invoke-static {v4, v7}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->o(II)I

    move-result v4

    add-int/2addr v0, v4

    :cond_7
    iget v4, p0, LUh/i;->d:I

    const/16 v7, 0x40

    and-int/2addr v4, v7

    if-ne v4, v7, :cond_8

    iget v4, p0, LUh/i;->l:I

    invoke-static {v6, v4}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->o(II)I

    move-result v4

    add-int/2addr v0, v4

    :cond_8
    iget v4, p0, LUh/i;->d:I

    and-int/2addr v4, v3

    if-ne v4, v3, :cond_9

    const/16 v3, 0x9

    iget v4, p0, LUh/i;->e:I

    invoke-static {v3, v4}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->o(II)I

    move-result v3

    add-int/2addr v0, v3

    :cond_9
    move v3, v2

    :goto_3
    iget-object v4, p0, LUh/i;->m:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_a

    iget-object v4, p0, LUh/i;->m:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    const/16 v6, 0xa

    invoke-static {v6, v4}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->r(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)I

    move-result v4

    add-int/2addr v0, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_a
    move v3, v2

    move v4, v3

    :goto_4
    iget-object v6, p0, LUh/i;->n:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v3, v6, :cond_b

    iget-object v6, p0, LUh/i;->n:Ljava/util/List;

    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static {v6}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->p(I)I

    move-result v6

    add-int/2addr v4, v6

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_b
    add-int/2addr v0, v4

    invoke-virtual {p0}, LUh/i;->h1()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_c

    add-int/lit8 v0, v0, 0x1

    invoke-static {v4}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->p(I)I

    move-result v3

    add-int/2addr v0, v3

    :cond_c
    iput v4, p0, LUh/i;->o:I

    iget v3, p0, LUh/i;->d:I

    const/16 v4, 0x80

    and-int/2addr v3, v4

    if-ne v3, v4, :cond_d

    const/16 v3, 0x1e

    iget-object v4, p0, LUh/i;->q:LUh/t;

    invoke-static {v3, v4}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->r(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)I

    move-result v3

    add-int/2addr v0, v3

    :cond_d
    move v3, v2

    :goto_5
    iget-object v4, p0, LUh/i;->r:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v2, v4, :cond_e

    iget-object v4, p0, LUh/i;->r:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v4}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->p(I)I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_e
    add-int/2addr v0, v3

    invoke-virtual {p0}, LUh/i;->A1()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    mul-int/2addr v2, v1

    add-int/2addr v0, v2

    iget v1, p0, LUh/i;->d:I

    const/16 v2, 0x100

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_f

    iget-object v1, p0, LUh/i;->s:LUh/e;

    invoke-static {v5, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->r(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_f
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->F()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, LUh/i;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->size()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, LUh/i;->u:I

    return v0
.end method

.method public f1(I)LUh/q;
    .locals 1

    iget-object v0, p0, LUh/i;->m:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LUh/q;

    return-object p1
.end method

.method public g1()I
    .locals 1

    iget-object v0, p0, LUh/i;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic h()Lkotlin/reflect/jvm/internal/impl/protobuf/n$a;
    .locals 1

    invoke-virtual {p0}, LUh/i;->N1()LUh/i$b;

    move-result-object v0

    return-object v0
.end method

.method public h1()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LUh/i;->n:Ljava/util/List;

    return-object v0
.end method

.method public i1()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LUh/i;->m:Ljava/util/List;

    return-object v0
.end method

.method public j1()LUh/e;
    .locals 1

    iget-object v0, p0, LUh/i;->s:LUh/e;

    return-object v0
.end method

.method public bridge synthetic l()Lkotlin/reflect/jvm/internal/impl/protobuf/n$a;
    .locals 1

    invoke-virtual {p0}, LUh/i;->P1()LUh/i$b;

    move-result-object v0

    return-object v0
.end method

.method public l1()LUh/i;
    .locals 1

    sget-object v0, LUh/i;->v:LUh/i;

    return-object v0
.end method

.method public final m()Z
    .locals 4

    iget-byte v0, p0, LUh/i;->t:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, LUh/i;->D1()Z

    move-result v0

    if-nez v0, :cond_2

    iput-byte v2, p0, LUh/i;->t:B

    return v2

    :cond_2
    invoke-virtual {p0}, LUh/i;->H1()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, LUh/i;->r1()LUh/q;

    move-result-object v0

    invoke-virtual {v0}, LUh/q;->m()Z

    move-result v0

    if-nez v0, :cond_3

    iput-byte v2, p0, LUh/i;->t:B

    return v2

    :cond_3
    move v0, v2

    :goto_0
    invoke-virtual {p0}, LUh/i;->u1()I

    move-result v3

    if-ge v0, v3, :cond_5

    invoke-virtual {p0, v0}, LUh/i;->t1(I)LUh/s;

    move-result-object v3

    invoke-virtual {v3}, LUh/s;->m()Z

    move-result v3

    if-nez v3, :cond_4

    iput-byte v2, p0, LUh/i;->t:B

    return v2

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    invoke-virtual {p0}, LUh/i;->F1()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, LUh/i;->p1()LUh/q;

    move-result-object v0

    invoke-virtual {v0}, LUh/q;->m()Z

    move-result v0

    if-nez v0, :cond_6

    iput-byte v2, p0, LUh/i;->t:B

    return v2

    :cond_6
    move v0, v2

    :goto_1
    invoke-virtual {p0}, LUh/i;->g1()I

    move-result v3

    if-ge v0, v3, :cond_8

    invoke-virtual {p0, v0}, LUh/i;->f1(I)LUh/q;

    move-result-object v3

    invoke-virtual {v3}, LUh/q;->m()Z

    move-result v3

    if-nez v3, :cond_7

    iput-byte v2, p0, LUh/i;->t:B

    return v2

    :cond_7
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_8
    move v0, v2

    :goto_2
    invoke-virtual {p0}, LUh/i;->y1()I

    move-result v3

    if-ge v0, v3, :cond_a

    invoke-virtual {p0, v0}, LUh/i;->x1(I)LUh/u;

    move-result-object v3

    invoke-virtual {v3}, LUh/u;->m()Z

    move-result v3

    if-nez v3, :cond_9

    iput-byte v2, p0, LUh/i;->t:B

    return v2

    :cond_9
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_a
    invoke-virtual {p0}, LUh/i;->J1()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual {p0}, LUh/i;->w1()LUh/t;

    move-result-object v0

    invoke-virtual {v0}, LUh/t;->m()Z

    move-result v0

    if-nez v0, :cond_b

    iput-byte v2, p0, LUh/i;->t:B

    return v2

    :cond_b
    invoke-virtual {p0}, LUh/i;->B1()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual {p0}, LUh/i;->j1()LUh/e;

    move-result-object v0

    invoke-virtual {v0}, LUh/e;->m()Z

    move-result v0

    if-nez v0, :cond_c

    iput-byte v2, p0, LUh/i;->t:B

    return v2

    :cond_c
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->E()Z

    move-result v0

    if-nez v0, :cond_d

    iput-byte v2, p0, LUh/i;->t:B

    return v2

    :cond_d
    iput-byte v1, p0, LUh/i;->t:B

    return v1
.end method

.method public m1()I
    .locals 1

    iget v0, p0, LUh/i;->e:I

    return v0
.end method

.method public n(Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;)V
    .locals 8

    invoke-virtual {p0}, LUh/i;->d()I

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->T()Lkotlin/reflect/jvm/internal/impl/protobuf/h$d$a;

    move-result-object v0

    iget v1, p0, LUh/i;->d:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    const/4 v3, 0x1

    if-ne v1, v2, :cond_0

    iget v1, p0, LUh/i;->f:I

    invoke-virtual {p1, v3, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->Z(II)V

    :cond_0
    iget v1, p0, LUh/i;->d:I

    const/4 v4, 0x4

    and-int/2addr v1, v4

    if-ne v1, v4, :cond_1

    iget v1, p0, LUh/i;->g:I

    invoke-virtual {p1, v2, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->Z(II)V

    :cond_1
    iget v1, p0, LUh/i;->d:I

    const/16 v2, 0x8

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_2

    const/4 v1, 0x3

    iget-object v5, p0, LUh/i;->h:LUh/q;

    invoke-virtual {p1, v1, v5}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->c0(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)V

    :cond_2
    const/4 v1, 0x0

    move v5, v1

    :goto_0
    iget-object v6, p0, LUh/i;->j:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_3

    iget-object v6, p0, LUh/i;->j:Ljava/util/List;

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    invoke-virtual {p1, v4, v6}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->c0(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    iget v4, p0, LUh/i;->d:I

    const/16 v5, 0x20

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_4

    const/4 v4, 0x5

    iget-object v6, p0, LUh/i;->k:LUh/q;

    invoke-virtual {p1, v4, v6}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->c0(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)V

    :cond_4
    move v4, v1

    :goto_1
    iget-object v6, p0, LUh/i;->p:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v4, v6, :cond_5

    iget-object v6, p0, LUh/i;->p:Ljava/util/List;

    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    const/4 v7, 0x6

    invoke-virtual {p1, v7, v6}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->c0(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_5
    iget v4, p0, LUh/i;->d:I

    const/16 v6, 0x10

    and-int/2addr v4, v6

    if-ne v4, v6, :cond_6

    const/4 v4, 0x7

    iget v6, p0, LUh/i;->i:I

    invoke-virtual {p1, v4, v6}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->Z(II)V

    :cond_6
    iget v4, p0, LUh/i;->d:I

    const/16 v6, 0x40

    and-int/2addr v4, v6

    if-ne v4, v6, :cond_7

    iget v4, p0, LUh/i;->l:I

    invoke-virtual {p1, v2, v4}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->Z(II)V

    :cond_7
    iget v2, p0, LUh/i;->d:I

    and-int/2addr v2, v3

    if-ne v2, v3, :cond_8

    const/16 v2, 0x9

    iget v3, p0, LUh/i;->e:I

    invoke-virtual {p1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->Z(II)V

    :cond_8
    move v2, v1

    :goto_2
    iget-object v3, p0, LUh/i;->m:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_9

    iget-object v3, p0, LUh/i;->m:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    const/16 v4, 0xa

    invoke-virtual {p1, v4, v3}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->c0(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_9
    invoke-virtual {p0}, LUh/i;->h1()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_a

    const/16 v2, 0x5a

    invoke-virtual {p1, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->n0(I)V

    iget v2, p0, LUh/i;->o:I

    invoke-virtual {p1, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->n0(I)V

    :cond_a
    move v2, v1

    :goto_3
    iget-object v3, p0, LUh/i;->n:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_b

    iget-object v3, p0, LUh/i;->n:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {p1, v3}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->a0(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_b
    iget v2, p0, LUh/i;->d:I

    const/16 v3, 0x80

    and-int/2addr v2, v3

    if-ne v2, v3, :cond_c

    const/16 v2, 0x1e

    iget-object v3, p0, LUh/i;->q:LUh/t;

    invoke-virtual {p1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->c0(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)V

    :cond_c
    :goto_4
    iget-object v2, p0, LUh/i;->r:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_d

    iget-object v2, p0, LUh/i;->r:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0x1f

    invoke-virtual {p1, v3, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->Z(II)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_d
    iget v1, p0, LUh/i;->d:I

    const/16 v2, 0x100

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_e

    iget-object v1, p0, LUh/i;->s:LUh/e;

    invoke-virtual {p1, v5, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->c0(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)V

    :cond_e
    const/16 v1, 0x4a38

    invoke-virtual {v0, v1, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d$a;->a(ILkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;)V

    iget-object v0, p0, LUh/i;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    invoke-virtual {p1, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->h0(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)V

    return-void
.end method

.method public n1()I
    .locals 1

    iget v0, p0, LUh/i;->g:I

    return v0
.end method

.method public o1()I
    .locals 1

    iget v0, p0, LUh/i;->f:I

    return v0
.end method

.method public p1()LUh/q;
    .locals 1

    iget-object v0, p0, LUh/i;->k:LUh/q;

    return-object v0
.end method

.method public q1()I
    .locals 1

    iget v0, p0, LUh/i;->l:I

    return v0
.end method

.method public r1()LUh/q;
    .locals 1

    iget-object v0, p0, LUh/i;->h:LUh/q;

    return-object v0
.end method

.method public s1()I
    .locals 1

    iget v0, p0, LUh/i;->i:I

    return v0
.end method

.method public t1(I)LUh/s;
    .locals 1

    iget-object v0, p0, LUh/i;->j:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LUh/s;

    return-object p1
.end method

.method public u1()I
    .locals 1

    iget-object v0, p0, LUh/i;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public v1()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LUh/i;->j:Ljava/util/List;

    return-object v0
.end method

.method public w1()LUh/t;
    .locals 1

    iget-object v0, p0, LUh/i;->q:LUh/t;

    return-object v0
.end method

.method public x1(I)LUh/u;
    .locals 1

    iget-object v0, p0, LUh/i;->p:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LUh/u;

    return-object p1
.end method

.method public y1()I
    .locals 1

    iget-object v0, p0, LUh/i;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public z1()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LUh/i;->p:Ljava/util/List;

    return-object v0
.end method
