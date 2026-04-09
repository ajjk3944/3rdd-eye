.class public final LUh/h;
.super Lkotlin/reflect/jvm/internal/impl/protobuf/h;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LUh/h$b;,
        LUh/h$c;
    }
.end annotation


# static fields
.field private static final m:LUh/h;

.field public static n:Lkotlin/reflect/jvm/internal/impl/protobuf/p;


# instance fields
.field private final b:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

.field private c:I

.field private d:I

.field private e:I

.field private f:LUh/h$c;

.field private g:LUh/q;

.field private h:I

.field private i:Ljava/util/List;

.field private j:Ljava/util/List;

.field private k:B

.field private l:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LUh/h$a;

    invoke-direct {v0}, LUh/h$a;-><init>()V

    sput-object v0, LUh/h;->n:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    new-instance v0, LUh/h;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LUh/h;-><init>(Z)V

    sput-object v0, LUh/h;->m:LUh/h;

    invoke-direct {v0}, LUh/h;->b1()V

    return-void
.end method

.method private constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)V
    .locals 11

    .line 11
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h;-><init>()V

    const/4 v0, -0x1

    .line 12
    iput-byte v0, p0, LUh/h;->k:B

    .line 13
    iput v0, p0, LUh/h;->l:I

    .line 14
    invoke-direct {p0}, LUh/h;->b1()V

    .line 15
    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->u()Lkotlin/reflect/jvm/internal/impl/protobuf/d$b;

    move-result-object v0

    const/4 v1, 0x1

    .line 16
    invoke-static {v0, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->I(Ljava/io/OutputStream;I)Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    :cond_0
    :goto_0
    const/16 v5, 0x20

    const/16 v6, 0x40

    if-nez v3, :cond_10

    .line 17
    :try_start_0
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->J()I

    move-result v7

    if-eqz v7, :cond_1

    const/16 v8, 0x8

    if-eq v7, v8, :cond_d

    const/16 v9, 0x10

    if-eq v7, v9, :cond_c

    const/16 v10, 0x18

    if-eq v7, v10, :cond_a

    const/16 v10, 0x22

    if-eq v7, v10, :cond_7

    const/16 v8, 0x28

    if-eq v7, v8, :cond_6

    const/16 v8, 0x32

    if-eq v7, v8, :cond_4

    const/16 v8, 0x3a

    if-eq v7, v8, :cond_2

    .line 18
    invoke-virtual {p0, p1, v2, p2, v7}, Lkotlin/reflect/jvm/internal/impl/protobuf/h;->y(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;Lkotlin/reflect/jvm/internal/impl/protobuf/f;I)Z

    move-result v5

    if-nez v5, :cond_0

    :cond_1
    move v3, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :catch_0
    move-exception p1

    goto/16 :goto_2

    :catch_1
    move-exception p1

    goto/16 :goto_3

    :cond_2
    and-int/lit8 v7, v4, 0x40

    if-eq v7, v6, :cond_3

    .line 19
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, p0, LUh/h;->j:Ljava/util/List;

    or-int/lit8 v4, v4, 0x40

    .line 20
    :cond_3
    iget-object v7, p0, LUh/h;->j:Ljava/util/List;

    sget-object v8, LUh/h;->n:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-virtual {p1, v8, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->t(Lkotlin/reflect/jvm/internal/impl/protobuf/p;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    and-int/lit8 v7, v4, 0x20

    if-eq v7, v5, :cond_5

    .line 21
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, p0, LUh/h;->i:Ljava/util/List;

    or-int/lit8 v4, v4, 0x20

    .line 22
    :cond_5
    iget-object v7, p0, LUh/h;->i:Ljava/util/List;

    sget-object v8, LUh/h;->n:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-virtual {p1, v8, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->t(Lkotlin/reflect/jvm/internal/impl/protobuf/p;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 23
    :cond_6
    iget v7, p0, LUh/h;->c:I

    or-int/2addr v7, v9

    iput v7, p0, LUh/h;->c:I

    .line 24
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->r()I

    move-result v7

    iput v7, p0, LUh/h;->h:I

    goto :goto_0

    .line 25
    :cond_7
    iget v7, p0, LUh/h;->c:I

    and-int/2addr v7, v8

    if-ne v7, v8, :cond_8

    .line 26
    iget-object v7, p0, LUh/h;->g:LUh/q;

    invoke-virtual {v7}, LUh/q;->K1()LUh/q$c;

    move-result-object v7

    goto :goto_1

    :cond_8
    const/4 v7, 0x0

    .line 27
    :goto_1
    sget-object v9, LUh/q;->v:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-virtual {p1, v9, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->t(Lkotlin/reflect/jvm/internal/impl/protobuf/p;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    move-result-object v9

    check-cast v9, LUh/q;

    iput-object v9, p0, LUh/h;->g:LUh/q;

    if-eqz v7, :cond_9

    .line 28
    invoke-virtual {v7, v9}, LUh/q$c;->E(LUh/q;)LUh/q$c;

    .line 29
    invoke-virtual {v7}, LUh/q$c;->u()LUh/q;

    move-result-object v7

    iput-object v7, p0, LUh/h;->g:LUh/q;

    .line 30
    :cond_9
    iget v7, p0, LUh/h;->c:I

    or-int/2addr v7, v8

    iput v7, p0, LUh/h;->c:I

    goto/16 :goto_0

    .line 31
    :cond_a
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->m()I

    move-result v8

    .line 32
    invoke-static {v8}, LUh/h$c;->valueOf(I)LUh/h$c;

    move-result-object v9

    if-nez v9, :cond_b

    .line 33
    invoke-virtual {v2, v7}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->n0(I)V

    .line 34
    invoke-virtual {v2, v8}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->n0(I)V

    goto/16 :goto_0

    .line 35
    :cond_b
    iget v7, p0, LUh/h;->c:I

    or-int/lit8 v7, v7, 0x4

    iput v7, p0, LUh/h;->c:I

    .line 36
    iput-object v9, p0, LUh/h;->f:LUh/h$c;

    goto/16 :goto_0

    .line 37
    :cond_c
    iget v7, p0, LUh/h;->c:I

    or-int/lit8 v7, v7, 0x2

    iput v7, p0, LUh/h;->c:I

    .line 38
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->r()I

    move-result v7

    iput v7, p0, LUh/h;->e:I

    goto/16 :goto_0

    .line 39
    :cond_d
    iget v7, p0, LUh/h;->c:I

    or-int/2addr v7, v1

    iput v7, p0, LUh/h;->c:I

    .line 40
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->r()I

    move-result v7

    iput v7, p0, LUh/h;->d:I
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 41
    :goto_2
    :try_start_1
    new-instance p2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 42
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->n(Lkotlin/reflect/jvm/internal/impl/protobuf/n;)Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1

    .line 43
    :goto_3
    invoke-virtual {p1, p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->n(Lkotlin/reflect/jvm/internal/impl/protobuf/n;)Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_4
    and-int/lit8 p2, v4, 0x20

    if-ne p2, v5, :cond_e

    .line 44
    iget-object p2, p0, LUh/h;->i:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, LUh/h;->i:Ljava/util/List;

    :cond_e
    and-int/lit8 p2, v4, 0x40

    if-ne p2, v6, :cond_f

    .line 45
    iget-object p2, p0, LUh/h;->j:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, LUh/h;->j:Ljava/util/List;

    .line 46
    :cond_f
    :try_start_2
    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 47
    :catch_2
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/d$b;->p()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p2

    iput-object p2, p0, LUh/h;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    goto :goto_5

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/d$b;->p()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p2

    iput-object p2, p0, LUh/h;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    .line 48
    throw p1

    .line 49
    :goto_5
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h;->s()V

    .line 50
    throw p1

    :cond_10
    and-int/lit8 p1, v4, 0x20

    if-ne p1, v5, :cond_11

    .line 51
    iget-object p1, p0, LUh/h;->i:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LUh/h;->i:Ljava/util/List;

    :cond_11
    and-int/lit8 p1, v4, 0x40

    if-ne p1, v6, :cond_12

    .line 52
    iget-object p1, p0, LUh/h;->j:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LUh/h;->j:Ljava/util/List;

    .line 53
    :cond_12
    :try_start_3
    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 54
    :catch_3
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/d$b;->p()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    iput-object p1, p0, LUh/h;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    goto :goto_6

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/d$b;->p()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p2

    iput-object p2, p0, LUh/h;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    .line 55
    throw p1

    .line 56
    :goto_6
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h;->s()V

    return-void
.end method

.method synthetic constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;LUh/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LUh/h;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)V

    return-void
.end method

.method private constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, LUh/h;->k:B

    .line 5
    iput v0, p0, LUh/h;->l:I

    .line 6
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->e()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    iput-object p1, p0, LUh/h;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    return-void
.end method

.method synthetic constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;LUh/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LUh/h;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, LUh/h;->k:B

    .line 9
    iput p1, p0, LUh/h;->l:I

    .line 10
    sget-object p1, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->a:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    iput-object p1, p0, LUh/h;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    return-void
.end method

.method static synthetic C(LUh/h;I)I
    .locals 0

    iput p1, p0, LUh/h;->d:I

    return p1
.end method

.method static synthetic E(LUh/h;I)I
    .locals 0

    iput p1, p0, LUh/h;->e:I

    return p1
.end method

.method static synthetic F(LUh/h;LUh/h$c;)LUh/h$c;
    .locals 0

    iput-object p1, p0, LUh/h;->f:LUh/h$c;

    return-object p1
.end method

.method static synthetic J(LUh/h;LUh/q;)LUh/q;
    .locals 0

    iput-object p1, p0, LUh/h;->g:LUh/q;

    return-object p1
.end method

.method static synthetic K(LUh/h;I)I
    .locals 0

    iput p1, p0, LUh/h;->h:I

    return p1
.end method

.method public static K0()LUh/h;
    .locals 1

    sget-object v0, LUh/h;->m:LUh/h;

    return-object v0
.end method

.method static synthetic P(LUh/h;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LUh/h;->i:Ljava/util/List;

    return-object p0
.end method

.method static synthetic S(LUh/h;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, LUh/h;->i:Ljava/util/List;

    return-object p1
.end method

.method static synthetic T(LUh/h;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LUh/h;->j:Ljava/util/List;

    return-object p0
.end method

.method private b1()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, LUh/h;->d:I

    iput v0, p0, LUh/h;->e:I

    sget-object v1, LUh/h$c;->TRUE:LUh/h$c;

    iput-object v1, p0, LUh/h;->f:LUh/h$c;

    invoke-static {}, LUh/q;->h1()LUh/q;

    move-result-object v1

    iput-object v1, p0, LUh/h;->g:LUh/q;

    iput v0, p0, LUh/h;->h:I

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/h;->i:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/h;->j:Ljava/util/List;

    return-void
.end method

.method public static c1()LUh/h$b;
    .locals 1

    invoke-static {}, LUh/h$b;->k()LUh/h$b;

    move-result-object v0

    return-object v0
.end method

.method static synthetic d0(LUh/h;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, LUh/h;->j:Ljava/util/List;

    return-object p1
.end method

.method public static d1(LUh/h;)LUh/h$b;
    .locals 1

    invoke-static {}, LUh/h;->c1()LUh/h$b;

    move-result-object v0

    invoke-virtual {v0, p0}, LUh/h$b;->x(LUh/h;)LUh/h$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic f0(LUh/h;I)I
    .locals 0

    iput p1, p0, LUh/h;->c:I

    return p1
.end method

.method static synthetic q0(LUh/h;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;
    .locals 0

    iget-object p0, p0, LUh/h;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    return-object p0
.end method


# virtual methods
.method public C0(I)LUh/h;
    .locals 1

    iget-object v0, p0, LUh/h;->i:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LUh/h;

    return-object p1
.end method

.method public E0()I
    .locals 1

    iget-object v0, p0, LUh/h;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public G0()LUh/h$c;
    .locals 1

    iget-object v0, p0, LUh/h;->f:LUh/h$c;

    return-object v0
.end method

.method public M0()I
    .locals 1

    iget v0, p0, LUh/h;->d:I

    return v0
.end method

.method public N0()LUh/q;
    .locals 1

    iget-object v0, p0, LUh/h;->g:LUh/q;

    return-object v0
.end method

.method public P0()I
    .locals 1

    iget v0, p0, LUh/h;->h:I

    return v0
.end method

.method public T0(I)LUh/h;
    .locals 1

    iget-object v0, p0, LUh/h;->j:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LUh/h;

    return-object p1
.end method

.method public U0()I
    .locals 1

    iget-object v0, p0, LUh/h;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public V0()I
    .locals 1

    iget v0, p0, LUh/h;->e:I

    return v0
.end method

.method public W0()Z
    .locals 2

    iget v0, p0, LUh/h;->c:I

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

.method public X0()Z
    .locals 2

    iget v0, p0, LUh/h;->c:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public Y0()Z
    .locals 2

    iget v0, p0, LUh/h;->c:I

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

.method public Z0()Z
    .locals 2

    iget v0, p0, LUh/h;->c:I

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

.method public a1()Z
    .locals 2

    iget v0, p0, LUh/h;->c:I

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

.method public d()I
    .locals 5

    iget v0, p0, LUh/h;->l:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, LUh/h;->c:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    iget v0, p0, LUh/h;->d:I

    invoke-static {v1, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->o(II)I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    iget v1, p0, LUh/h;->c:I

    const/4 v3, 0x2

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_2

    iget v1, p0, LUh/h;->e:I

    invoke-static {v3, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    iget v1, p0, LUh/h;->c:I

    const/4 v3, 0x4

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_3

    iget-object v1, p0, LUh/h;->f:LUh/h$c;

    invoke-virtual {v1}, LUh/h$c;->getNumber()I

    move-result v1

    const/4 v4, 0x3

    invoke-static {v4, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->h(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    iget v1, p0, LUh/h;->c:I

    const/16 v4, 0x8

    and-int/2addr v1, v4

    if-ne v1, v4, :cond_4

    iget-object v1, p0, LUh/h;->g:LUh/q;

    invoke-static {v3, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->r(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    iget v1, p0, LUh/h;->c:I

    const/16 v3, 0x10

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_5

    const/4 v1, 0x5

    iget v3, p0, LUh/h;->h:I

    invoke-static {v1, v3}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_5
    move v1, v2

    :goto_1
    iget-object v3, p0, LUh/h;->i:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_6

    iget-object v3, p0, LUh/h;->i:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    const/4 v4, 0x6

    invoke-static {v4, v3}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->r(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)I

    move-result v3

    add-int/2addr v0, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_6
    :goto_2
    iget-object v1, p0, LUh/h;->j:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v2, v1, :cond_7

    iget-object v1, p0, LUh/h;->j:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    const/4 v3, 0x7

    invoke-static {v3, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->r(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_7
    iget-object v1, p0, LUh/h;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->size()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, LUh/h;->l:I

    return v0
.end method

.method public e1()LUh/h$b;
    .locals 1

    invoke-static {}, LUh/h;->c1()LUh/h$b;

    move-result-object v0

    return-object v0
.end method

.method public f1()LUh/h$b;
    .locals 1

    invoke-static {p0}, LUh/h;->d1(LUh/h;)LUh/h$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic h()Lkotlin/reflect/jvm/internal/impl/protobuf/n$a;
    .locals 1

    invoke-virtual {p0}, LUh/h;->e1()LUh/h$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic l()Lkotlin/reflect/jvm/internal/impl/protobuf/n$a;
    .locals 1

    invoke-virtual {p0}, LUh/h;->f1()LUh/h$b;

    move-result-object v0

    return-object v0
.end method

.method public final m()Z
    .locals 4

    iget-byte v0, p0, LUh/h;->k:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, LUh/h;->Y0()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, LUh/h;->N0()LUh/q;

    move-result-object v0

    invoke-virtual {v0}, LUh/q;->m()Z

    move-result v0

    if-nez v0, :cond_2

    iput-byte v2, p0, LUh/h;->k:B

    return v2

    :cond_2
    move v0, v2

    :goto_0
    invoke-virtual {p0}, LUh/h;->E0()I

    move-result v3

    if-ge v0, v3, :cond_4

    invoke-virtual {p0, v0}, LUh/h;->C0(I)LUh/h;

    move-result-object v3

    invoke-virtual {v3}, LUh/h;->m()Z

    move-result v3

    if-nez v3, :cond_3

    iput-byte v2, p0, LUh/h;->k:B

    return v2

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    move v0, v2

    :goto_1
    invoke-virtual {p0}, LUh/h;->U0()I

    move-result v3

    if-ge v0, v3, :cond_6

    invoke-virtual {p0, v0}, LUh/h;->T0(I)LUh/h;

    move-result-object v3

    invoke-virtual {v3}, LUh/h;->m()Z

    move-result v3

    if-nez v3, :cond_5

    iput-byte v2, p0, LUh/h;->k:B

    return v2

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_6
    iput-byte v1, p0, LUh/h;->k:B

    return v1
.end method

.method public n(Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;)V
    .locals 4

    invoke-virtual {p0}, LUh/h;->d()I

    iget v0, p0, LUh/h;->c:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget v0, p0, LUh/h;->d:I

    invoke-virtual {p1, v1, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->Z(II)V

    :cond_0
    iget v0, p0, LUh/h;->c:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget v0, p0, LUh/h;->e:I

    invoke-virtual {p1, v1, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->Z(II)V

    :cond_1
    iget v0, p0, LUh/h;->c:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_2

    iget-object v0, p0, LUh/h;->f:LUh/h$c;

    invoke-virtual {v0}, LUh/h$c;->getNumber()I

    move-result v0

    const/4 v2, 0x3

    invoke-virtual {p1, v2, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->R(II)V

    :cond_2
    iget v0, p0, LUh/h;->c:I

    const/16 v2, 0x8

    and-int/2addr v0, v2

    if-ne v0, v2, :cond_3

    iget-object v0, p0, LUh/h;->g:LUh/q;

    invoke-virtual {p1, v1, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->c0(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)V

    :cond_3
    iget v0, p0, LUh/h;->c:I

    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_4

    const/4 v0, 0x5

    iget v1, p0, LUh/h;->h:I

    invoke-virtual {p1, v0, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->Z(II)V

    :cond_4
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, LUh/h;->i:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_5

    iget-object v2, p0, LUh/h;->i:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    const/4 v3, 0x6

    invoke-virtual {p1, v3, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->c0(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_5
    :goto_1
    iget-object v1, p0, LUh/h;->j:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_6

    iget-object v1, p0, LUh/h;->j:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    const/4 v2, 0x7

    invoke-virtual {p1, v2, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->c0(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_6
    iget-object v0, p0, LUh/h;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    invoke-virtual {p1, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->h0(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)V

    return-void
.end method
