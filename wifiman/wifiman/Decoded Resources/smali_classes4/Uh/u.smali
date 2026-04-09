.class public final LUh/u;
.super Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LUh/u$b;
    }
.end annotation


# static fields
.field private static final m:LUh/u;

.field public static n:Lkotlin/reflect/jvm/internal/impl/protobuf/p;


# instance fields
.field private final c:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

.field private d:I

.field private e:I

.field private f:I

.field private g:LUh/q;

.field private h:I

.field private i:LUh/q;

.field private j:I

.field private k:B

.field private l:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LUh/u$a;

    invoke-direct {v0}, LUh/u$a;-><init>()V

    sput-object v0, LUh/u;->n:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    new-instance v0, LUh/u;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LUh/u;-><init>(Z)V

    sput-object v0, LUh/u;->m:LUh/u;

    invoke-direct {v0}, LUh/u;->g1()V

    return-void
.end method

.method private constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)V
    .locals 9

    .line 11
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;-><init>()V

    const/4 v0, -0x1

    .line 12
    iput-byte v0, p0, LUh/u;->k:B

    .line 13
    iput v0, p0, LUh/u;->l:I

    .line 14
    invoke-direct {p0}, LUh/u;->g1()V

    .line 15
    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->u()Lkotlin/reflect/jvm/internal/impl/protobuf/d$b;

    move-result-object v0

    const/4 v1, 0x1

    .line 16
    invoke-static {v0, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->I(Ljava/io/OutputStream;I)Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;

    move-result-object v2

    const/4 v3, 0x0

    :cond_0
    :goto_0
    if-nez v3, :cond_c

    .line 17
    :try_start_0
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->J()I

    move-result v4

    if-eqz v4, :cond_1

    const/16 v5, 0x8

    if-eq v4, v5, :cond_b

    const/16 v6, 0x10

    if-eq v4, v6, :cond_a

    const/16 v7, 0x1a

    const/4 v8, 0x0

    if-eq v4, v7, :cond_7

    const/16 v7, 0x22

    if-eq v4, v7, :cond_4

    const/16 v6, 0x28

    if-eq v4, v6, :cond_3

    const/16 v5, 0x30

    if-eq v4, v5, :cond_2

    .line 18
    invoke-virtual {p0, p1, v2, p2, v4}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->y(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;Lkotlin/reflect/jvm/internal/impl/protobuf/f;I)Z

    move-result v4

    if-nez v4, :cond_0

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

    .line 19
    :cond_2
    iget v4, p0, LUh/u;->d:I

    or-int/lit8 v4, v4, 0x20

    iput v4, p0, LUh/u;->d:I

    .line 20
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->r()I

    move-result v4

    iput v4, p0, LUh/u;->j:I

    goto :goto_0

    .line 21
    :cond_3
    iget v4, p0, LUh/u;->d:I

    or-int/2addr v4, v5

    iput v4, p0, LUh/u;->d:I

    .line 22
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->r()I

    move-result v4

    iput v4, p0, LUh/u;->h:I

    goto :goto_0

    .line 23
    :cond_4
    iget v4, p0, LUh/u;->d:I

    and-int/2addr v4, v6

    if-ne v4, v6, :cond_5

    .line 24
    iget-object v4, p0, LUh/u;->i:LUh/q;

    invoke-virtual {v4}, LUh/q;->K1()LUh/q$c;

    move-result-object v8

    .line 25
    :cond_5
    sget-object v4, LUh/q;->v:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-virtual {p1, v4, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->t(Lkotlin/reflect/jvm/internal/impl/protobuf/p;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    move-result-object v4

    check-cast v4, LUh/q;

    iput-object v4, p0, LUh/u;->i:LUh/q;

    if-eqz v8, :cond_6

    .line 26
    invoke-virtual {v8, v4}, LUh/q$c;->E(LUh/q;)LUh/q$c;

    .line 27
    invoke-virtual {v8}, LUh/q$c;->u()LUh/q;

    move-result-object v4

    iput-object v4, p0, LUh/u;->i:LUh/q;

    .line 28
    :cond_6
    iget v4, p0, LUh/u;->d:I

    or-int/2addr v4, v6

    iput v4, p0, LUh/u;->d:I

    goto :goto_0

    .line 29
    :cond_7
    iget v4, p0, LUh/u;->d:I

    const/4 v5, 0x4

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_8

    .line 30
    iget-object v4, p0, LUh/u;->g:LUh/q;

    invoke-virtual {v4}, LUh/q;->K1()LUh/q$c;

    move-result-object v8

    .line 31
    :cond_8
    sget-object v4, LUh/q;->v:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-virtual {p1, v4, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->t(Lkotlin/reflect/jvm/internal/impl/protobuf/p;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    move-result-object v4

    check-cast v4, LUh/q;

    iput-object v4, p0, LUh/u;->g:LUh/q;

    if-eqz v8, :cond_9

    .line 32
    invoke-virtual {v8, v4}, LUh/q$c;->E(LUh/q;)LUh/q$c;

    .line 33
    invoke-virtual {v8}, LUh/q$c;->u()LUh/q;

    move-result-object v4

    iput-object v4, p0, LUh/u;->g:LUh/q;

    .line 34
    :cond_9
    iget v4, p0, LUh/u;->d:I

    or-int/2addr v4, v5

    iput v4, p0, LUh/u;->d:I

    goto/16 :goto_0

    .line 35
    :cond_a
    iget v4, p0, LUh/u;->d:I

    or-int/lit8 v4, v4, 0x2

    iput v4, p0, LUh/u;->d:I

    .line 36
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->r()I

    move-result v4

    iput v4, p0, LUh/u;->f:I

    goto/16 :goto_0

    .line 37
    :cond_b
    iget v4, p0, LUh/u;->d:I

    or-int/2addr v4, v1

    iput v4, p0, LUh/u;->d:I

    .line 38
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->r()I

    move-result v4

    iput v4, p0, LUh/u;->e:I
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

    .line 42
    :goto_3
    :try_start_2
    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 43
    :catch_2
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/d$b;->p()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p2

    iput-object p2, p0, LUh/u;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/d$b;->p()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p2

    iput-object p2, p0, LUh/u;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    .line 44
    throw p1

    .line 45
    :goto_4
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->s()V

    .line 46
    throw p1

    .line 47
    :cond_c
    :try_start_3
    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 48
    :catch_3
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/d$b;->p()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    iput-object p1, p0, LUh/u;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    goto :goto_5

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/d$b;->p()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p2

    iput-object p2, p0, LUh/u;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    .line 49
    throw p1

    .line 50
    :goto_5
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->s()V

    return-void
.end method

.method synthetic constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;LUh/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LUh/u;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)V

    return-void
.end method

.method private constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, LUh/u;->k:B

    .line 5
    iput v0, p0, LUh/u;->l:I

    .line 6
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->e()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    iput-object p1, p0, LUh/u;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    return-void
.end method

.method synthetic constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;LUh/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LUh/u;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, LUh/u;->k:B

    .line 9
    iput p1, p0, LUh/u;->l:I

    .line 10
    sget-object p1, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->a:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    iput-object p1, p0, LUh/u;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    return-void
.end method

.method static synthetic C0(LUh/u;LUh/q;)LUh/q;
    .locals 0

    iput-object p1, p0, LUh/u;->g:LUh/q;

    return-object p1
.end method

.method static synthetic E0(LUh/u;I)I
    .locals 0

    iput p1, p0, LUh/u;->h:I

    return p1
.end method

.method static synthetic G0(LUh/u;LUh/q;)LUh/q;
    .locals 0

    iput-object p1, p0, LUh/u;->i:LUh/q;

    return-object p1
.end method

.method static synthetic K0(LUh/u;I)I
    .locals 0

    iput p1, p0, LUh/u;->j:I

    return p1
.end method

.method static synthetic M0(LUh/u;I)I
    .locals 0

    iput p1, p0, LUh/u;->d:I

    return p1
.end method

.method static synthetic N0(LUh/u;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;
    .locals 0

    iget-object p0, p0, LUh/u;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    return-object p0
.end method

.method public static P0()LUh/u;
    .locals 1

    sget-object v0, LUh/u;->m:LUh/u;

    return-object v0
.end method

.method static synthetic f0(LUh/u;I)I
    .locals 0

    iput p1, p0, LUh/u;->e:I

    return p1
.end method

.method private g1()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, LUh/u;->e:I

    iput v0, p0, LUh/u;->f:I

    invoke-static {}, LUh/q;->h1()LUh/q;

    move-result-object v1

    iput-object v1, p0, LUh/u;->g:LUh/q;

    iput v0, p0, LUh/u;->h:I

    invoke-static {}, LUh/q;->h1()LUh/q;

    move-result-object v1

    iput-object v1, p0, LUh/u;->i:LUh/q;

    iput v0, p0, LUh/u;->j:I

    return-void
.end method

.method public static h1()LUh/u$b;
    .locals 1

    invoke-static {}, LUh/u$b;->r()LUh/u$b;

    move-result-object v0

    return-object v0
.end method

.method public static i1(LUh/u;)LUh/u$b;
    .locals 1

    invoke-static {}, LUh/u;->h1()LUh/u$b;

    move-result-object v0

    invoke-virtual {v0, p0}, LUh/u$b;->A(LUh/u;)LUh/u$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic q0(LUh/u;I)I
    .locals 0

    iput p1, p0, LUh/u;->f:I

    return p1
.end method


# virtual methods
.method public T0()LUh/u;
    .locals 1

    sget-object v0, LUh/u;->m:LUh/u;

    return-object v0
.end method

.method public U0()I
    .locals 1

    iget v0, p0, LUh/u;->e:I

    return v0
.end method

.method public V0()I
    .locals 1

    iget v0, p0, LUh/u;->f:I

    return v0
.end method

.method public W0()LUh/q;
    .locals 1

    iget-object v0, p0, LUh/u;->g:LUh/q;

    return-object v0
.end method

.method public X0()I
    .locals 1

    iget v0, p0, LUh/u;->h:I

    return v0
.end method

.method public Y0()LUh/q;
    .locals 1

    iget-object v0, p0, LUh/u;->i:LUh/q;

    return-object v0
.end method

.method public Z0()I
    .locals 1

    iget v0, p0, LUh/u;->j:I

    return v0
.end method

.method public a1()Z
    .locals 2

    iget v0, p0, LUh/u;->d:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public b1()Z
    .locals 2

    iget v0, p0, LUh/u;->d:I

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

.method public bridge synthetic c()Lkotlin/reflect/jvm/internal/impl/protobuf/n;
    .locals 1

    invoke-virtual {p0}, LUh/u;->T0()LUh/u;

    move-result-object v0

    return-object v0
.end method

.method public c1()Z
    .locals 2

    iget v0, p0, LUh/u;->d:I

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

.method public d()I
    .locals 4

    iget v0, p0, LUh/u;->l:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, LUh/u;->d:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget v0, p0, LUh/u;->e:I

    invoke-static {v1, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->o(II)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget v1, p0, LUh/u;->d:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_2

    iget v1, p0, LUh/u;->f:I

    invoke-static {v2, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    iget v1, p0, LUh/u;->d:I

    const/4 v2, 0x4

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_3

    const/4 v1, 0x3

    iget-object v3, p0, LUh/u;->g:LUh/q;

    invoke-static {v1, v3}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->r(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    iget v1, p0, LUh/u;->d:I

    const/16 v3, 0x10

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_4

    iget-object v1, p0, LUh/u;->i:LUh/q;

    invoke-static {v2, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->r(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    iget v1, p0, LUh/u;->d:I

    const/16 v2, 0x8

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_5

    const/4 v1, 0x5

    iget v2, p0, LUh/u;->h:I

    invoke-static {v1, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_5
    iget v1, p0, LUh/u;->d:I

    const/16 v2, 0x20

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_6

    const/4 v1, 0x6

    iget v2, p0, LUh/u;->j:I

    invoke-static {v1, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_6
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->F()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, LUh/u;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->size()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, LUh/u;->l:I

    return v0
.end method

.method public d1()Z
    .locals 2

    iget v0, p0, LUh/u;->d:I

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

.method public e1()Z
    .locals 2

    iget v0, p0, LUh/u;->d:I

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

.method public f1()Z
    .locals 2

    iget v0, p0, LUh/u;->d:I

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

.method public bridge synthetic h()Lkotlin/reflect/jvm/internal/impl/protobuf/n$a;
    .locals 1

    invoke-virtual {p0}, LUh/u;->j1()LUh/u$b;

    move-result-object v0

    return-object v0
.end method

.method public j1()LUh/u$b;
    .locals 1

    invoke-static {}, LUh/u;->h1()LUh/u$b;

    move-result-object v0

    return-object v0
.end method

.method public k1()LUh/u$b;
    .locals 1

    invoke-static {p0}, LUh/u;->i1(LUh/u;)LUh/u$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic l()Lkotlin/reflect/jvm/internal/impl/protobuf/n$a;
    .locals 1

    invoke-virtual {p0}, LUh/u;->k1()LUh/u$b;

    move-result-object v0

    return-object v0
.end method

.method public final m()Z
    .locals 3

    iget-byte v0, p0, LUh/u;->k:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, LUh/u;->b1()Z

    move-result v0

    if-nez v0, :cond_2

    iput-byte v2, p0, LUh/u;->k:B

    return v2

    :cond_2
    invoke-virtual {p0}, LUh/u;->c1()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, LUh/u;->W0()LUh/q;

    move-result-object v0

    invoke-virtual {v0}, LUh/q;->m()Z

    move-result v0

    if-nez v0, :cond_3

    iput-byte v2, p0, LUh/u;->k:B

    return v2

    :cond_3
    invoke-virtual {p0}, LUh/u;->e1()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, LUh/u;->Y0()LUh/q;

    move-result-object v0

    invoke-virtual {v0}, LUh/q;->m()Z

    move-result v0

    if-nez v0, :cond_4

    iput-byte v2, p0, LUh/u;->k:B

    return v2

    :cond_4
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->E()Z

    move-result v0

    if-nez v0, :cond_5

    iput-byte v2, p0, LUh/u;->k:B

    return v2

    :cond_5
    iput-byte v1, p0, LUh/u;->k:B

    return v1
.end method

.method public n(Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;)V
    .locals 4

    invoke-virtual {p0}, LUh/u;->d()I

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->T()Lkotlin/reflect/jvm/internal/impl/protobuf/h$d$a;

    move-result-object v0

    iget v1, p0, LUh/u;->d:I

    const/4 v2, 0x1

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_0

    iget v1, p0, LUh/u;->e:I

    invoke-virtual {p1, v2, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->Z(II)V

    :cond_0
    iget v1, p0, LUh/u;->d:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_1

    iget v1, p0, LUh/u;->f:I

    invoke-virtual {p1, v2, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->Z(II)V

    :cond_1
    iget v1, p0, LUh/u;->d:I

    const/4 v2, 0x4

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_2

    const/4 v1, 0x3

    iget-object v3, p0, LUh/u;->g:LUh/q;

    invoke-virtual {p1, v1, v3}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->c0(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)V

    :cond_2
    iget v1, p0, LUh/u;->d:I

    const/16 v3, 0x10

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_3

    iget-object v1, p0, LUh/u;->i:LUh/q;

    invoke-virtual {p1, v2, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->c0(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)V

    :cond_3
    iget v1, p0, LUh/u;->d:I

    const/16 v2, 0x8

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_4

    const/4 v1, 0x5

    iget v2, p0, LUh/u;->h:I

    invoke-virtual {p1, v1, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->Z(II)V

    :cond_4
    iget v1, p0, LUh/u;->d:I

    const/16 v2, 0x20

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_5

    const/4 v1, 0x6

    iget v2, p0, LUh/u;->j:I

    invoke-virtual {p1, v1, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->Z(II)V

    :cond_5
    const/16 v1, 0xc8

    invoke-virtual {v0, v1, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d$a;->a(ILkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;)V

    iget-object v0, p0, LUh/u;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    invoke-virtual {p1, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->h0(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)V

    return-void
.end method
