.class public final LUh/q$b;
.super Lkotlin/reflect/jvm/internal/impl/protobuf/h;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUh/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LUh/q$b$b;,
        LUh/q$b$c;
    }
.end annotation


# static fields
.field private static final i:LUh/q$b;

.field public static j:Lkotlin/reflect/jvm/internal/impl/protobuf/p;


# instance fields
.field private final b:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

.field private c:I

.field private d:LUh/q$b$c;

.field private e:LUh/q;

.field private f:I

.field private g:B

.field private h:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LUh/q$b$a;

    invoke-direct {v0}, LUh/q$b$a;-><init>()V

    sput-object v0, LUh/q$b;->j:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    new-instance v0, LUh/q$b;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LUh/q$b;-><init>(Z)V

    sput-object v0, LUh/q$b;->i:LUh/q$b;

    invoke-direct {v0}, LUh/q$b;->E0()V

    return-void
.end method

.method private constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)V
    .locals 7

    .line 11
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h;-><init>()V

    const/4 v0, -0x1

    .line 12
    iput-byte v0, p0, LUh/q$b;->g:B

    .line 13
    iput v0, p0, LUh/q$b;->h:I

    .line 14
    invoke-direct {p0}, LUh/q$b;->E0()V

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
    if-nez v3, :cond_8

    .line 17
    :try_start_0
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->J()I

    move-result v4

    if-eqz v4, :cond_1

    const/16 v5, 0x8

    if-eq v4, v5, :cond_6

    const/16 v5, 0x12

    if-eq v4, v5, :cond_3

    const/16 v5, 0x18

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

    goto :goto_4

    :catch_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    goto :goto_3

    .line 19
    :cond_2
    iget v4, p0, LUh/q$b;->c:I

    or-int/lit8 v4, v4, 0x4

    iput v4, p0, LUh/q$b;->c:I

    .line 20
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->r()I

    move-result v4

    iput v4, p0, LUh/q$b;->f:I

    goto :goto_0

    .line 21
    :cond_3
    iget v4, p0, LUh/q$b;->c:I

    const/4 v5, 0x2

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_4

    .line 22
    iget-object v4, p0, LUh/q$b;->e:LUh/q;

    invoke-virtual {v4}, LUh/q;->K1()LUh/q$c;

    move-result-object v4

    goto :goto_1

    :cond_4
    const/4 v4, 0x0

    .line 23
    :goto_1
    sget-object v6, LUh/q;->v:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-virtual {p1, v6, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->t(Lkotlin/reflect/jvm/internal/impl/protobuf/p;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    move-result-object v6

    check-cast v6, LUh/q;

    iput-object v6, p0, LUh/q$b;->e:LUh/q;

    if-eqz v4, :cond_5

    .line 24
    invoke-virtual {v4, v6}, LUh/q$c;->E(LUh/q;)LUh/q$c;

    .line 25
    invoke-virtual {v4}, LUh/q$c;->u()LUh/q;

    move-result-object v4

    iput-object v4, p0, LUh/q$b;->e:LUh/q;

    .line 26
    :cond_5
    iget v4, p0, LUh/q$b;->c:I

    or-int/2addr v4, v5

    iput v4, p0, LUh/q$b;->c:I

    goto :goto_0

    .line 27
    :cond_6
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->m()I

    move-result v5

    .line 28
    invoke-static {v5}, LUh/q$b$c;->valueOf(I)LUh/q$b$c;

    move-result-object v6

    if-nez v6, :cond_7

    .line 29
    invoke-virtual {v2, v4}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->n0(I)V

    .line 30
    invoke-virtual {v2, v5}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->n0(I)V

    goto :goto_0

    .line 31
    :cond_7
    iget v4, p0, LUh/q$b;->c:I

    or-int/2addr v4, v1

    iput v4, p0, LUh/q$b;->c:I

    .line 32
    iput-object v6, p0, LUh/q$b;->d:LUh/q$b$c;
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 33
    :goto_2
    :try_start_1
    new-instance p2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 34
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->n(Lkotlin/reflect/jvm/internal/impl/protobuf/n;)Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1

    .line 35
    :goto_3
    invoke-virtual {p1, p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->n(Lkotlin/reflect/jvm/internal/impl/protobuf/n;)Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    :goto_4
    :try_start_2
    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 37
    :catch_2
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/d$b;->p()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p2

    iput-object p2, p0, LUh/q$b;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    goto :goto_5

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/d$b;->p()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p2

    iput-object p2, p0, LUh/q$b;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    .line 38
    throw p1

    .line 39
    :goto_5
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h;->s()V

    .line 40
    throw p1

    .line 41
    :cond_8
    :try_start_3
    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 42
    :catch_3
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/d$b;->p()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    iput-object p1, p0, LUh/q$b;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    goto :goto_6

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/d$b;->p()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p2

    iput-object p2, p0, LUh/q$b;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    .line 43
    throw p1

    .line 44
    :goto_6
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h;->s()V

    return-void
.end method

.method synthetic constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;LUh/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LUh/q$b;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)V

    return-void
.end method

.method private constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, LUh/q$b;->g:B

    .line 5
    iput v0, p0, LUh/q$b;->h:I

    .line 6
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->e()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    iput-object p1, p0, LUh/q$b;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    return-void
.end method

.method synthetic constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;LUh/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LUh/q$b;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, LUh/q$b;->g:B

    .line 9
    iput p1, p0, LUh/q$b;->h:I

    .line 10
    sget-object p1, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->a:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    iput-object p1, p0, LUh/q$b;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    return-void
.end method

.method static synthetic C(LUh/q$b;LUh/q$b$c;)LUh/q$b$c;
    .locals 0

    iput-object p1, p0, LUh/q$b;->d:LUh/q$b$c;

    return-object p1
.end method

.method static synthetic E(LUh/q$b;LUh/q;)LUh/q;
    .locals 0

    iput-object p1, p0, LUh/q$b;->e:LUh/q;

    return-object p1
.end method

.method private E0()V
    .locals 1

    sget-object v0, LUh/q$b$c;->INV:LUh/q$b$c;

    iput-object v0, p0, LUh/q$b;->d:LUh/q$b$c;

    invoke-static {}, LUh/q;->h1()LUh/q;

    move-result-object v0

    iput-object v0, p0, LUh/q$b;->e:LUh/q;

    const/4 v0, 0x0

    iput v0, p0, LUh/q$b;->f:I

    return-void
.end method

.method static synthetic F(LUh/q$b;I)I
    .locals 0

    iput p1, p0, LUh/q$b;->f:I

    return p1
.end method

.method public static G0()LUh/q$b$b;
    .locals 1

    invoke-static {}, LUh/q$b$b;->k()LUh/q$b$b;

    move-result-object v0

    return-object v0
.end method

.method static synthetic J(LUh/q$b;I)I
    .locals 0

    iput p1, p0, LUh/q$b;->c:I

    return p1
.end method

.method static synthetic K(LUh/q$b;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;
    .locals 0

    iget-object p0, p0, LUh/q$b;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    return-object p0
.end method

.method public static K0(LUh/q$b;)LUh/q$b$b;
    .locals 1

    invoke-static {}, LUh/q$b;->G0()LUh/q$b$b;

    move-result-object v0

    invoke-virtual {v0, p0}, LUh/q$b$b;->u(LUh/q$b;)LUh/q$b$b;

    move-result-object p0

    return-object p0
.end method

.method public static P()LUh/q$b;
    .locals 1

    sget-object v0, LUh/q$b;->i:LUh/q$b;

    return-object v0
.end method


# virtual methods
.method public C0()Z
    .locals 2

    iget v0, p0, LUh/q$b;->c:I

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

.method public M0()LUh/q$b$b;
    .locals 1

    invoke-static {}, LUh/q$b;->G0()LUh/q$b$b;

    move-result-object v0

    return-object v0
.end method

.method public N0()LUh/q$b$b;
    .locals 1

    invoke-static {p0}, LUh/q$b;->K0(LUh/q$b;)LUh/q$b$b;

    move-result-object v0

    return-object v0
.end method

.method public S()LUh/q$b$c;
    .locals 1

    iget-object v0, p0, LUh/q$b;->d:LUh/q$b$c;

    return-object v0
.end method

.method public T()LUh/q;
    .locals 1

    iget-object v0, p0, LUh/q$b;->e:LUh/q;

    return-object v0
.end method

.method public d()I
    .locals 3

    iget v0, p0, LUh/q$b;->h:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, LUh/q$b;->c:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, LUh/q$b;->d:LUh/q$b$c;

    invoke-virtual {v0}, LUh/q$b$c;->getNumber()I

    move-result v0

    invoke-static {v1, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->h(II)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget v1, p0, LUh/q$b;->c:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_2

    iget-object v1, p0, LUh/q$b;->e:LUh/q;

    invoke-static {v2, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->r(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    iget v1, p0, LUh/q$b;->c:I

    const/4 v2, 0x4

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_3

    const/4 v1, 0x3

    iget v2, p0, LUh/q$b;->f:I

    invoke-static {v1, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    iget-object v1, p0, LUh/q$b;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->size()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, LUh/q$b;->h:I

    return v0
.end method

.method public d0()I
    .locals 1

    iget v0, p0, LUh/q$b;->f:I

    return v0
.end method

.method public f0()Z
    .locals 2

    iget v0, p0, LUh/q$b;->c:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public bridge synthetic h()Lkotlin/reflect/jvm/internal/impl/protobuf/n$a;
    .locals 1

    invoke-virtual {p0}, LUh/q$b;->M0()LUh/q$b$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic l()Lkotlin/reflect/jvm/internal/impl/protobuf/n$a;
    .locals 1

    invoke-virtual {p0}, LUh/q$b;->N0()LUh/q$b$b;

    move-result-object v0

    return-object v0
.end method

.method public final m()Z
    .locals 3

    iget-byte v0, p0, LUh/q$b;->g:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, LUh/q$b;->q0()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, LUh/q$b;->T()LUh/q;

    move-result-object v0

    invoke-virtual {v0}, LUh/q;->m()Z

    move-result v0

    if-nez v0, :cond_2

    iput-byte v2, p0, LUh/q$b;->g:B

    return v2

    :cond_2
    iput-byte v1, p0, LUh/q$b;->g:B

    return v1
.end method

.method public n(Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;)V
    .locals 2

    invoke-virtual {p0}, LUh/q$b;->d()I

    iget v0, p0, LUh/q$b;->c:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LUh/q$b;->d:LUh/q$b$c;

    invoke-virtual {v0}, LUh/q$b$c;->getNumber()I

    move-result v0

    invoke-virtual {p1, v1, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->R(II)V

    :cond_0
    iget v0, p0, LUh/q$b;->c:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, LUh/q$b;->e:LUh/q;

    invoke-virtual {p1, v1, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->c0(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)V

    :cond_1
    iget v0, p0, LUh/q$b;->c:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_2

    const/4 v0, 0x3

    iget v1, p0, LUh/q$b;->f:I

    invoke-virtual {p1, v0, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->Z(II)V

    :cond_2
    iget-object v0, p0, LUh/q$b;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    invoke-virtual {p1, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->h0(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)V

    return-void
.end method

.method public q0()Z
    .locals 2

    iget v0, p0, LUh/q$b;->c:I

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
