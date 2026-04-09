.class public final LUh/v;
.super Lkotlin/reflect/jvm/internal/impl/protobuf/h;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LUh/v$b;,
        LUh/v$d;,
        LUh/v$c;
    }
.end annotation


# static fields
.field private static final l:LUh/v;

.field public static m:Lkotlin/reflect/jvm/internal/impl/protobuf/p;


# instance fields
.field private final b:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

.field private c:I

.field private d:I

.field private e:I

.field private f:LUh/v$c;

.field private g:I

.field private h:I

.field private i:LUh/v$d;

.field private j:B

.field private k:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LUh/v$a;

    invoke-direct {v0}, LUh/v$a;-><init>()V

    sput-object v0, LUh/v;->m:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    new-instance v0, LUh/v;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LUh/v;-><init>(Z)V

    sput-object v0, LUh/v;->l:LUh/v;

    invoke-direct {v0}, LUh/v;->V0()V

    return-void
.end method

.method private constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)V
    .locals 8

    .line 11
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h;-><init>()V

    const/4 v0, -0x1

    .line 12
    iput-byte v0, p0, LUh/v;->j:B

    .line 13
    iput v0, p0, LUh/v;->k:I

    .line 14
    invoke-direct {p0}, LUh/v;->V0()V

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
    if-nez v3, :cond_a

    .line 17
    :try_start_0
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->J()I

    move-result v4

    if-eqz v4, :cond_1

    const/16 v5, 0x8

    if-eq v4, v5, :cond_9

    const/16 v6, 0x10

    if-eq v4, v6, :cond_8

    const/16 v7, 0x18

    if-eq v4, v7, :cond_6

    const/16 v7, 0x20

    if-eq v4, v7, :cond_5

    const/16 v5, 0x28

    if-eq v4, v5, :cond_4

    const/16 v5, 0x30

    if-eq v4, v5, :cond_2

    .line 18
    invoke-virtual {p0, p1, v2, p2, v4}, Lkotlin/reflect/jvm/internal/impl/protobuf/h;->y(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;Lkotlin/reflect/jvm/internal/impl/protobuf/f;I)Z

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

    goto :goto_1

    :catch_1
    move-exception p1

    goto/16 :goto_2

    .line 19
    :cond_2
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->m()I

    move-result v5

    .line 20
    invoke-static {v5}, LUh/v$d;->valueOf(I)LUh/v$d;

    move-result-object v6

    if-nez v6, :cond_3

    .line 21
    invoke-virtual {v2, v4}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->n0(I)V

    .line 22
    invoke-virtual {v2, v5}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->n0(I)V

    goto :goto_0

    .line 23
    :cond_3
    iget v4, p0, LUh/v;->c:I

    or-int/2addr v4, v7

    iput v4, p0, LUh/v;->c:I

    .line 24
    iput-object v6, p0, LUh/v;->i:LUh/v$d;

    goto :goto_0

    .line 25
    :cond_4
    iget v4, p0, LUh/v;->c:I

    or-int/2addr v4, v6

    iput v4, p0, LUh/v;->c:I

    .line 26
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->r()I

    move-result v4

    iput v4, p0, LUh/v;->h:I

    goto :goto_0

    .line 27
    :cond_5
    iget v4, p0, LUh/v;->c:I

    or-int/2addr v4, v5

    iput v4, p0, LUh/v;->c:I

    .line 28
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->r()I

    move-result v4

    iput v4, p0, LUh/v;->g:I

    goto :goto_0

    .line 29
    :cond_6
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->m()I

    move-result v5

    .line 30
    invoke-static {v5}, LUh/v$c;->valueOf(I)LUh/v$c;

    move-result-object v6

    if-nez v6, :cond_7

    .line 31
    invoke-virtual {v2, v4}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->n0(I)V

    .line 32
    invoke-virtual {v2, v5}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->n0(I)V

    goto :goto_0

    .line 33
    :cond_7
    iget v4, p0, LUh/v;->c:I

    or-int/lit8 v4, v4, 0x4

    iput v4, p0, LUh/v;->c:I

    .line 34
    iput-object v6, p0, LUh/v;->f:LUh/v$c;

    goto :goto_0

    .line 35
    :cond_8
    iget v4, p0, LUh/v;->c:I

    or-int/lit8 v4, v4, 0x2

    iput v4, p0, LUh/v;->c:I

    .line 36
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->r()I

    move-result v4

    iput v4, p0, LUh/v;->e:I

    goto/16 :goto_0

    .line 37
    :cond_9
    iget v4, p0, LUh/v;->c:I

    or-int/2addr v4, v1

    iput v4, p0, LUh/v;->c:I

    .line 38
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->r()I

    move-result v4

    iput v4, p0, LUh/v;->d:I
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

    iput-object p2, p0, LUh/v;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/d$b;->p()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p2

    iput-object p2, p0, LUh/v;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    .line 44
    throw p1

    .line 45
    :goto_4
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h;->s()V

    .line 46
    throw p1

    .line 47
    :cond_a
    :try_start_3
    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 48
    :catch_3
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/d$b;->p()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    iput-object p1, p0, LUh/v;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    goto :goto_5

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/d$b;->p()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p2

    iput-object p2, p0, LUh/v;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    .line 49
    throw p1

    .line 50
    :goto_5
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h;->s()V

    return-void
.end method

.method synthetic constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;LUh/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LUh/v;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)V

    return-void
.end method

.method private constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, LUh/v;->j:B

    .line 5
    iput v0, p0, LUh/v;->k:I

    .line 6
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->e()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    iput-object p1, p0, LUh/v;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    return-void
.end method

.method synthetic constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;LUh/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LUh/v;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, LUh/v;->j:B

    .line 9
    iput p1, p0, LUh/v;->k:I

    .line 10
    sget-object p1, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->a:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    iput-object p1, p0, LUh/v;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    return-void
.end method

.method static synthetic C(LUh/v;I)I
    .locals 0

    iput p1, p0, LUh/v;->d:I

    return p1
.end method

.method static synthetic E(LUh/v;I)I
    .locals 0

    iput p1, p0, LUh/v;->e:I

    return p1
.end method

.method static synthetic F(LUh/v;LUh/v$c;)LUh/v$c;
    .locals 0

    iput-object p1, p0, LUh/v;->f:LUh/v$c;

    return-object p1
.end method

.method static synthetic J(LUh/v;I)I
    .locals 0

    iput p1, p0, LUh/v;->g:I

    return p1
.end method

.method static synthetic K(LUh/v;I)I
    .locals 0

    iput p1, p0, LUh/v;->h:I

    return p1
.end method

.method static synthetic P(LUh/v;LUh/v$d;)LUh/v$d;
    .locals 0

    iput-object p1, p0, LUh/v;->i:LUh/v$d;

    return-object p1
.end method

.method static synthetic S(LUh/v;I)I
    .locals 0

    iput p1, p0, LUh/v;->c:I

    return p1
.end method

.method static synthetic T(LUh/v;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;
    .locals 0

    iget-object p0, p0, LUh/v;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    return-object p0
.end method

.method private V0()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, LUh/v;->d:I

    iput v0, p0, LUh/v;->e:I

    sget-object v1, LUh/v$c;->ERROR:LUh/v$c;

    iput-object v1, p0, LUh/v;->f:LUh/v$c;

    iput v0, p0, LUh/v;->g:I

    iput v0, p0, LUh/v;->h:I

    sget-object v0, LUh/v$d;->LANGUAGE_VERSION:LUh/v$d;

    iput-object v0, p0, LUh/v;->i:LUh/v$d;

    return-void
.end method

.method public static W0()LUh/v$b;
    .locals 1

    invoke-static {}, LUh/v$b;->k()LUh/v$b;

    move-result-object v0

    return-object v0
.end method

.method public static X0(LUh/v;)LUh/v$b;
    .locals 1

    invoke-static {}, LUh/v;->W0()LUh/v$b;

    move-result-object v0

    invoke-virtual {v0, p0}, LUh/v$b;->u(LUh/v;)LUh/v$b;

    move-result-object p0

    return-object p0
.end method

.method public static d0()LUh/v;
    .locals 1

    sget-object v0, LUh/v;->l:LUh/v;

    return-object v0
.end method


# virtual methods
.method public C0()I
    .locals 1

    iget v0, p0, LUh/v;->h:I

    return v0
.end method

.method public E0()I
    .locals 1

    iget v0, p0, LUh/v;->e:I

    return v0
.end method

.method public G0()LUh/v$d;
    .locals 1

    iget-object v0, p0, LUh/v;->i:LUh/v$d;

    return-object v0
.end method

.method public K0()Z
    .locals 2

    iget v0, p0, LUh/v;->c:I

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

.method public M0()Z
    .locals 2

    iget v0, p0, LUh/v;->c:I

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

.method public N0()Z
    .locals 2

    iget v0, p0, LUh/v;->c:I

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

.method public P0()Z
    .locals 2

    iget v0, p0, LUh/v;->c:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public T0()Z
    .locals 2

    iget v0, p0, LUh/v;->c:I

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

.method public U0()Z
    .locals 2

    iget v0, p0, LUh/v;->c:I

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

.method public Y0()LUh/v$b;
    .locals 1

    invoke-static {}, LUh/v;->W0()LUh/v$b;

    move-result-object v0

    return-object v0
.end method

.method public Z0()LUh/v$b;
    .locals 1

    invoke-static {p0}, LUh/v;->X0(LUh/v;)LUh/v$b;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 4

    iget v0, p0, LUh/v;->k:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, LUh/v;->c:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget v0, p0, LUh/v;->d:I

    invoke-static {v1, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->o(II)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget v1, p0, LUh/v;->c:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_2

    iget v1, p0, LUh/v;->e:I

    invoke-static {v2, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    iget v1, p0, LUh/v;->c:I

    const/4 v2, 0x4

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_3

    iget-object v1, p0, LUh/v;->f:LUh/v$c;

    invoke-virtual {v1}, LUh/v$c;->getNumber()I

    move-result v1

    const/4 v3, 0x3

    invoke-static {v3, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->h(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    iget v1, p0, LUh/v;->c:I

    const/16 v3, 0x8

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_4

    iget v1, p0, LUh/v;->g:I

    invoke-static {v2, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    iget v1, p0, LUh/v;->c:I

    const/16 v2, 0x10

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_5

    const/4 v1, 0x5

    iget v2, p0, LUh/v;->h:I

    invoke-static {v1, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_5
    iget v1, p0, LUh/v;->c:I

    const/16 v2, 0x20

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_6

    iget-object v1, p0, LUh/v;->i:LUh/v$d;

    invoke-virtual {v1}, LUh/v$d;->getNumber()I

    move-result v1

    const/4 v2, 0x6

    invoke-static {v2, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->h(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_6
    iget-object v1, p0, LUh/v;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->size()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, LUh/v;->k:I

    return v0
.end method

.method public f0()I
    .locals 1

    iget v0, p0, LUh/v;->g:I

    return v0
.end method

.method public getVersion()I
    .locals 1

    iget v0, p0, LUh/v;->d:I

    return v0
.end method

.method public bridge synthetic h()Lkotlin/reflect/jvm/internal/impl/protobuf/n$a;
    .locals 1

    invoke-virtual {p0}, LUh/v;->Y0()LUh/v$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic l()Lkotlin/reflect/jvm/internal/impl/protobuf/n$a;
    .locals 1

    invoke-virtual {p0}, LUh/v;->Z0()LUh/v$b;

    move-result-object v0

    return-object v0
.end method

.method public final m()Z
    .locals 2

    iget-byte v0, p0, LUh/v;->j:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    if-nez v0, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    iput-byte v1, p0, LUh/v;->j:B

    return v1
.end method

.method public n(Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;)V
    .locals 3

    invoke-virtual {p0}, LUh/v;->d()I

    iget v0, p0, LUh/v;->c:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget v0, p0, LUh/v;->d:I

    invoke-virtual {p1, v1, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->Z(II)V

    :cond_0
    iget v0, p0, LUh/v;->c:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget v0, p0, LUh/v;->e:I

    invoke-virtual {p1, v1, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->Z(II)V

    :cond_1
    iget v0, p0, LUh/v;->c:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_2

    iget-object v0, p0, LUh/v;->f:LUh/v$c;

    invoke-virtual {v0}, LUh/v$c;->getNumber()I

    move-result v0

    const/4 v2, 0x3

    invoke-virtual {p1, v2, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->R(II)V

    :cond_2
    iget v0, p0, LUh/v;->c:I

    const/16 v2, 0x8

    and-int/2addr v0, v2

    if-ne v0, v2, :cond_3

    iget v0, p0, LUh/v;->g:I

    invoke-virtual {p1, v1, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->Z(II)V

    :cond_3
    iget v0, p0, LUh/v;->c:I

    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_4

    const/4 v0, 0x5

    iget v1, p0, LUh/v;->h:I

    invoke-virtual {p1, v0, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->Z(II)V

    :cond_4
    iget v0, p0, LUh/v;->c:I

    const/16 v1, 0x20

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_5

    iget-object v0, p0, LUh/v;->i:LUh/v$d;

    invoke-virtual {v0}, LUh/v$d;->getNumber()I

    move-result v0

    const/4 v1, 0x6

    invoke-virtual {p1, v1, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->R(II)V

    :cond_5
    iget-object v0, p0, LUh/v;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    invoke-virtual {p1, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->h0(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)V

    return-void
.end method

.method public q0()LUh/v$c;
    .locals 1

    iget-object v0, p0, LUh/v;->f:LUh/v$c;

    return-object v0
.end method
