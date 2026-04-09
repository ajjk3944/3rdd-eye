.class public final LUh/m;
.super Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LUh/m$b;
    }
.end annotation


# static fields
.field private static final k:LUh/m;

.field public static l:Lkotlin/reflect/jvm/internal/impl/protobuf/p;


# instance fields
.field private final c:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

.field private d:I

.field private e:LUh/p;

.field private f:LUh/o;

.field private g:LUh/l;

.field private h:Ljava/util/List;

.field private i:B

.field private j:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LUh/m$a;

    invoke-direct {v0}, LUh/m$a;-><init>()V

    sput-object v0, LUh/m;->l:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    new-instance v0, LUh/m;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LUh/m;-><init>(Z)V

    sput-object v0, LUh/m;->k:LUh/m;

    invoke-direct {v0}, LUh/m;->c1()V

    return-void
.end method

.method private constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)V
    .locals 9

    .line 11
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;-><init>()V

    const/4 v0, -0x1

    .line 12
    iput-byte v0, p0, LUh/m;->i:B

    .line 13
    iput v0, p0, LUh/m;->j:I

    .line 14
    invoke-direct {p0}, LUh/m;->c1()V

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
    const/16 v5, 0x8

    if-nez v3, :cond_e

    .line 17
    :try_start_0
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->J()I

    move-result v6

    if-eqz v6, :cond_1

    const/16 v7, 0xa

    const/4 v8, 0x0

    if-eq v6, v7, :cond_a

    const/16 v7, 0x12

    if-eq v6, v7, :cond_7

    const/16 v7, 0x1a

    if-eq v6, v7, :cond_4

    const/16 v7, 0x22

    if-eq v6, v7, :cond_2

    .line 18
    invoke-virtual {p0, p1, v2, p2, v6}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->y(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;Lkotlin/reflect/jvm/internal/impl/protobuf/f;I)Z

    move-result v5

    if-nez v5, :cond_0

    :cond_1
    move v3, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :catch_0
    move-exception p1

    goto/16 :goto_1

    :catch_1
    move-exception p1

    goto/16 :goto_2

    :cond_2
    and-int/lit8 v6, v4, 0x8

    if-eq v6, v5, :cond_3

    .line 19
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, p0, LUh/m;->h:Ljava/util/List;

    move v4, v5

    .line 20
    :cond_3
    iget-object v6, p0, LUh/m;->h:Ljava/util/List;

    sget-object v7, LUh/c;->X:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-virtual {p1, v7, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->t(Lkotlin/reflect/jvm/internal/impl/protobuf/p;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 21
    :cond_4
    iget v6, p0, LUh/m;->d:I

    const/4 v7, 0x4

    and-int/2addr v6, v7

    if-ne v6, v7, :cond_5

    .line 22
    iget-object v6, p0, LUh/m;->g:LUh/l;

    invoke-virtual {v6}, LUh/l;->o1()LUh/l$b;

    move-result-object v8

    .line 23
    :cond_5
    sget-object v6, LUh/l;->m:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-virtual {p1, v6, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->t(Lkotlin/reflect/jvm/internal/impl/protobuf/p;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    move-result-object v6

    check-cast v6, LUh/l;

    iput-object v6, p0, LUh/m;->g:LUh/l;

    if-eqz v8, :cond_6

    .line 24
    invoke-virtual {v8, v6}, LUh/l$b;->E(LUh/l;)LUh/l$b;

    .line 25
    invoke-virtual {v8}, LUh/l$b;->u()LUh/l;

    move-result-object v6

    iput-object v6, p0, LUh/m;->g:LUh/l;

    .line 26
    :cond_6
    iget v6, p0, LUh/m;->d:I

    or-int/2addr v6, v7

    iput v6, p0, LUh/m;->d:I

    goto :goto_0

    .line 27
    :cond_7
    iget v6, p0, LUh/m;->d:I

    const/4 v7, 0x2

    and-int/2addr v6, v7

    if-ne v6, v7, :cond_8

    .line 28
    iget-object v6, p0, LUh/m;->f:LUh/o;

    invoke-virtual {v6}, LUh/o;->q0()LUh/o$b;

    move-result-object v8

    .line 29
    :cond_8
    sget-object v6, LUh/o;->g:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-virtual {p1, v6, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->t(Lkotlin/reflect/jvm/internal/impl/protobuf/p;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    move-result-object v6

    check-cast v6, LUh/o;

    iput-object v6, p0, LUh/m;->f:LUh/o;

    if-eqz v8, :cond_9

    .line 30
    invoke-virtual {v8, v6}, LUh/o$b;->w(LUh/o;)LUh/o$b;

    .line 31
    invoke-virtual {v8}, LUh/o$b;->p()LUh/o;

    move-result-object v6

    iput-object v6, p0, LUh/m;->f:LUh/o;

    .line 32
    :cond_9
    iget v6, p0, LUh/m;->d:I

    or-int/2addr v6, v7

    iput v6, p0, LUh/m;->d:I

    goto/16 :goto_0

    .line 33
    :cond_a
    iget v6, p0, LUh/m;->d:I

    and-int/2addr v6, v1

    if-ne v6, v1, :cond_b

    .line 34
    iget-object v6, p0, LUh/m;->e:LUh/p;

    invoke-virtual {v6}, LUh/p;->q0()LUh/p$b;

    move-result-object v8

    .line 35
    :cond_b
    sget-object v6, LUh/p;->g:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-virtual {p1, v6, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->t(Lkotlin/reflect/jvm/internal/impl/protobuf/p;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    move-result-object v6

    check-cast v6, LUh/p;

    iput-object v6, p0, LUh/m;->e:LUh/p;

    if-eqz v8, :cond_c

    .line 36
    invoke-virtual {v8, v6}, LUh/p$b;->w(LUh/p;)LUh/p$b;

    .line 37
    invoke-virtual {v8}, LUh/p$b;->p()LUh/p;

    move-result-object v6

    iput-object v6, p0, LUh/m;->e:LUh/p;

    .line 38
    :cond_c
    iget v6, p0, LUh/m;->d:I

    or-int/2addr v6, v1

    iput v6, p0, LUh/m;->d:I
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 39
    :goto_1
    :try_start_1
    new-instance p2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 40
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->n(Lkotlin/reflect/jvm/internal/impl/protobuf/n;)Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1

    .line 41
    :goto_2
    invoke-virtual {p1, p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->n(Lkotlin/reflect/jvm/internal/impl/protobuf/n;)Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_3
    and-int/lit8 p2, v4, 0x8

    if-ne p2, v5, :cond_d

    .line 42
    iget-object p2, p0, LUh/m;->h:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, LUh/m;->h:Ljava/util/List;

    .line 43
    :cond_d
    :try_start_2
    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 44
    :catch_2
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/d$b;->p()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p2

    iput-object p2, p0, LUh/m;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/d$b;->p()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p2

    iput-object p2, p0, LUh/m;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    .line 45
    throw p1

    .line 46
    :goto_4
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->s()V

    .line 47
    throw p1

    :cond_e
    and-int/lit8 p1, v4, 0x8

    if-ne p1, v5, :cond_f

    .line 48
    iget-object p1, p0, LUh/m;->h:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LUh/m;->h:Ljava/util/List;

    .line 49
    :cond_f
    :try_start_3
    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 50
    :catch_3
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/d$b;->p()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    iput-object p1, p0, LUh/m;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    goto :goto_5

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/d$b;->p()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p2

    iput-object p2, p0, LUh/m;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    .line 51
    throw p1

    .line 52
    :goto_5
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->s()V

    return-void
.end method

.method synthetic constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;LUh/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LUh/m;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)V

    return-void
.end method

.method private constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, LUh/m;->i:B

    .line 5
    iput v0, p0, LUh/m;->j:I

    .line 6
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->e()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    iput-object p1, p0, LUh/m;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    return-void
.end method

.method synthetic constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;LUh/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LUh/m;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, LUh/m;->i:B

    .line 9
    iput p1, p0, LUh/m;->j:I

    .line 10
    sget-object p1, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->a:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    iput-object p1, p0, LUh/m;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    return-void
.end method

.method static synthetic C0(LUh/m;LUh/l;)LUh/l;
    .locals 0

    iput-object p1, p0, LUh/m;->g:LUh/l;

    return-object p1
.end method

.method static synthetic E0(LUh/m;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LUh/m;->h:Ljava/util/List;

    return-object p0
.end method

.method static synthetic G0(LUh/m;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, LUh/m;->h:Ljava/util/List;

    return-object p1
.end method

.method static synthetic K0(LUh/m;I)I
    .locals 0

    iput p1, p0, LUh/m;->d:I

    return p1
.end method

.method static synthetic M0(LUh/m;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;
    .locals 0

    iget-object p0, p0, LUh/m;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    return-object p0
.end method

.method public static U0()LUh/m;
    .locals 1

    sget-object v0, LUh/m;->k:LUh/m;

    return-object v0
.end method

.method private c1()V
    .locals 1

    invoke-static {}, LUh/p;->J()LUh/p;

    move-result-object v0

    iput-object v0, p0, LUh/m;->e:LUh/p;

    invoke-static {}, LUh/o;->J()LUh/o;

    move-result-object v0

    iput-object v0, p0, LUh/m;->f:LUh/o;

    invoke-static {}, LUh/l;->U0()LUh/l;

    move-result-object v0

    iput-object v0, p0, LUh/m;->g:LUh/l;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/m;->h:Ljava/util/List;

    return-void
.end method

.method public static d1()LUh/m$b;
    .locals 1

    invoke-static {}, LUh/m$b;->r()LUh/m$b;

    move-result-object v0

    return-object v0
.end method

.method public static e1(LUh/m;)LUh/m$b;
    .locals 1

    invoke-static {}, LUh/m;->d1()LUh/m$b;

    move-result-object v0

    invoke-virtual {v0, p0}, LUh/m$b;->B(LUh/m;)LUh/m$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic f0(LUh/m;LUh/p;)LUh/p;
    .locals 0

    iput-object p1, p0, LUh/m;->e:LUh/p;

    return-object p1
.end method

.method public static g1(Ljava/io/InputStream;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/m;
    .locals 1

    sget-object v0, LUh/m;->l:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-interface {v0, p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/p;->a(Ljava/io/InputStream;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LUh/m;

    return-object p0
.end method

.method static synthetic q0(LUh/m;LUh/o;)LUh/o;
    .locals 0

    iput-object p1, p0, LUh/m;->f:LUh/o;

    return-object p1
.end method


# virtual methods
.method public N0(I)LUh/c;
    .locals 1

    iget-object v0, p0, LUh/m;->h:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LUh/c;

    return-object p1
.end method

.method public P0()I
    .locals 1

    iget-object v0, p0, LUh/m;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public T0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LUh/m;->h:Ljava/util/List;

    return-object v0
.end method

.method public V0()LUh/m;
    .locals 1

    sget-object v0, LUh/m;->k:LUh/m;

    return-object v0
.end method

.method public W0()LUh/l;
    .locals 1

    iget-object v0, p0, LUh/m;->g:LUh/l;

    return-object v0
.end method

.method public X0()LUh/o;
    .locals 1

    iget-object v0, p0, LUh/m;->f:LUh/o;

    return-object v0
.end method

.method public Y0()LUh/p;
    .locals 1

    iget-object v0, p0, LUh/m;->e:LUh/p;

    return-object v0
.end method

.method public Z0()Z
    .locals 2

    iget v0, p0, LUh/m;->d:I

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

.method public a1()Z
    .locals 2

    iget v0, p0, LUh/m;->d:I

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

.method public b1()Z
    .locals 2

    iget v0, p0, LUh/m;->d:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public bridge synthetic c()Lkotlin/reflect/jvm/internal/impl/protobuf/n;
    .locals 1

    invoke-virtual {p0}, LUh/m;->V0()LUh/m;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 5

    iget v0, p0, LUh/m;->j:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, LUh/m;->d:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    iget-object v0, p0, LUh/m;->e:LUh/p;

    invoke-static {v1, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->r(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    iget v1, p0, LUh/m;->d:I

    const/4 v3, 0x2

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_2

    iget-object v1, p0, LUh/m;->f:LUh/o;

    invoke-static {v3, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->r(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    iget v1, p0, LUh/m;->d:I

    const/4 v3, 0x4

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_3

    const/4 v1, 0x3

    iget-object v4, p0, LUh/m;->g:LUh/l;

    invoke-static {v1, v4}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->r(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    :goto_1
    iget-object v1, p0, LUh/m;->h:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v2, v1, :cond_4

    iget-object v1, p0, LUh/m;->h:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    invoke-static {v3, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->r(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->F()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, LUh/m;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->size()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, LUh/m;->j:I

    return v0
.end method

.method public f1()LUh/m$b;
    .locals 1

    invoke-static {}, LUh/m;->d1()LUh/m$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic h()Lkotlin/reflect/jvm/internal/impl/protobuf/n$a;
    .locals 1

    invoke-virtual {p0}, LUh/m;->f1()LUh/m$b;

    move-result-object v0

    return-object v0
.end method

.method public h1()LUh/m$b;
    .locals 1

    invoke-static {p0}, LUh/m;->e1(LUh/m;)LUh/m$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic l()Lkotlin/reflect/jvm/internal/impl/protobuf/n$a;
    .locals 1

    invoke-virtual {p0}, LUh/m;->h1()LUh/m$b;

    move-result-object v0

    return-object v0
.end method

.method public final m()Z
    .locals 4

    iget-byte v0, p0, LUh/m;->i:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, LUh/m;->a1()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, LUh/m;->X0()LUh/o;

    move-result-object v0

    invoke-virtual {v0}, LUh/o;->m()Z

    move-result v0

    if-nez v0, :cond_2

    iput-byte v2, p0, LUh/m;->i:B

    return v2

    :cond_2
    invoke-virtual {p0}, LUh/m;->Z0()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, LUh/m;->W0()LUh/l;

    move-result-object v0

    invoke-virtual {v0}, LUh/l;->m()Z

    move-result v0

    if-nez v0, :cond_3

    iput-byte v2, p0, LUh/m;->i:B

    return v2

    :cond_3
    move v0, v2

    :goto_0
    invoke-virtual {p0}, LUh/m;->P0()I

    move-result v3

    if-ge v0, v3, :cond_5

    invoke-virtual {p0, v0}, LUh/m;->N0(I)LUh/c;

    move-result-object v3

    invoke-virtual {v3}, LUh/c;->m()Z

    move-result v3

    if-nez v3, :cond_4

    iput-byte v2, p0, LUh/m;->i:B

    return v2

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->E()Z

    move-result v0

    if-nez v0, :cond_6

    iput-byte v2, p0, LUh/m;->i:B

    return v2

    :cond_6
    iput-byte v1, p0, LUh/m;->i:B

    return v1
.end method

.method public n(Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;)V
    .locals 4

    invoke-virtual {p0}, LUh/m;->d()I

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->T()Lkotlin/reflect/jvm/internal/impl/protobuf/h$d$a;

    move-result-object v0

    iget v1, p0, LUh/m;->d:I

    const/4 v2, 0x1

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_0

    iget-object v1, p0, LUh/m;->e:LUh/p;

    invoke-virtual {p1, v2, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->c0(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)V

    :cond_0
    iget v1, p0, LUh/m;->d:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_1

    iget-object v1, p0, LUh/m;->f:LUh/o;

    invoke-virtual {p1, v2, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->c0(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)V

    :cond_1
    iget v1, p0, LUh/m;->d:I

    const/4 v2, 0x4

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_2

    const/4 v1, 0x3

    iget-object v3, p0, LUh/m;->g:LUh/l;

    invoke-virtual {p1, v1, v3}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->c0(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)V

    :cond_2
    const/4 v1, 0x0

    :goto_0
    iget-object v3, p0, LUh/m;->h:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_3

    iget-object v3, p0, LUh/m;->h:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    invoke-virtual {p1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->c0(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    const/16 v1, 0xc8

    invoke-virtual {v0, v1, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d$a;->a(ILkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;)V

    iget-object v0, p0, LUh/m;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    invoke-virtual {p1, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->h0(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)V

    return-void
.end method
