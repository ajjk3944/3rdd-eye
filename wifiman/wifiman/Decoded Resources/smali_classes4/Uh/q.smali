.class public final LUh/q;
.super Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LUh/q$c;,
        LUh/q$b;
    }
.end annotation


# static fields
.field private static final u:LUh/q;

.field public static v:Lkotlin/reflect/jvm/internal/impl/protobuf/p;


# instance fields
.field private final c:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

.field private d:I

.field private e:Ljava/util/List;

.field private f:Z

.field private g:I

.field private h:LUh/q;

.field private i:I

.field private j:I

.field private k:I

.field private l:I

.field private m:I

.field private n:LUh/q;

.field private o:I

.field private p:LUh/q;

.field private q:I

.field private r:I

.field private s:B

.field private t:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LUh/q$a;

    invoke-direct {v0}, LUh/q$a;-><init>()V

    sput-object v0, LUh/q;->v:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    new-instance v0, LUh/q;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LUh/q;-><init>(Z)V

    sput-object v0, LUh/q;->u:LUh/q;

    invoke-direct {v0}, LUh/q;->G1()V

    return-void
.end method

.method private constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)V
    .locals 8

    .line 11
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;-><init>()V

    const/4 v0, -0x1

    .line 12
    iput-byte v0, p0, LUh/q;->s:B

    .line 13
    iput v0, p0, LUh/q;->t:I

    .line 14
    invoke-direct {p0}, LUh/q;->G1()V

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
    if-nez v3, :cond_9

    .line 17
    :try_start_0
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->J()I

    move-result v5

    const/4 v6, 0x0

    sparse-switch v5, :sswitch_data_0

    .line 18
    invoke-virtual {p0, p1, v2, p2, v5}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->y(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;Lkotlin/reflect/jvm/internal/impl/protobuf/f;I)Z

    move-result v5

    if-nez v5, :cond_0

    :sswitch_0
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
    :sswitch_1
    iget v5, p0, LUh/q;->d:I

    or-int/lit16 v5, v5, 0x800

    iput v5, p0, LUh/q;->d:I

    .line 20
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->r()I

    move-result v5

    iput v5, p0, LUh/q;->q:I

    goto :goto_0

    .line 21
    :sswitch_2
    iget v5, p0, LUh/q;->d:I

    const/16 v7, 0x400

    and-int/2addr v5, v7

    if-ne v5, v7, :cond_1

    .line 22
    iget-object v5, p0, LUh/q;->p:LUh/q;

    invoke-virtual {v5}, LUh/q;->K1()LUh/q$c;

    move-result-object v6

    .line 23
    :cond_1
    sget-object v5, LUh/q;->v:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-virtual {p1, v5, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->t(Lkotlin/reflect/jvm/internal/impl/protobuf/p;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    move-result-object v5

    check-cast v5, LUh/q;

    iput-object v5, p0, LUh/q;->p:LUh/q;

    if-eqz v6, :cond_2

    .line 24
    invoke-virtual {v6, v5}, LUh/q$c;->E(LUh/q;)LUh/q$c;

    .line 25
    invoke-virtual {v6}, LUh/q$c;->u()LUh/q;

    move-result-object v5

    iput-object v5, p0, LUh/q;->p:LUh/q;

    .line 26
    :cond_2
    iget v5, p0, LUh/q;->d:I

    or-int/2addr v5, v7

    iput v5, p0, LUh/q;->d:I

    goto :goto_0

    .line 27
    :sswitch_3
    iget v5, p0, LUh/q;->d:I

    or-int/lit16 v5, v5, 0x80

    iput v5, p0, LUh/q;->d:I

    .line 28
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->r()I

    move-result v5

    iput v5, p0, LUh/q;->m:I

    goto :goto_0

    .line 29
    :sswitch_4
    iget v5, p0, LUh/q;->d:I

    or-int/lit16 v5, v5, 0x200

    iput v5, p0, LUh/q;->d:I

    .line 30
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->r()I

    move-result v5

    iput v5, p0, LUh/q;->o:I

    goto :goto_0

    .line 31
    :sswitch_5
    iget v5, p0, LUh/q;->d:I

    const/16 v7, 0x100

    and-int/2addr v5, v7

    if-ne v5, v7, :cond_3

    .line 32
    iget-object v5, p0, LUh/q;->n:LUh/q;

    invoke-virtual {v5}, LUh/q;->K1()LUh/q$c;

    move-result-object v6

    .line 33
    :cond_3
    sget-object v5, LUh/q;->v:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-virtual {p1, v5, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->t(Lkotlin/reflect/jvm/internal/impl/protobuf/p;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    move-result-object v5

    check-cast v5, LUh/q;

    iput-object v5, p0, LUh/q;->n:LUh/q;

    if-eqz v6, :cond_4

    .line 34
    invoke-virtual {v6, v5}, LUh/q$c;->E(LUh/q;)LUh/q$c;

    .line 35
    invoke-virtual {v6}, LUh/q$c;->u()LUh/q;

    move-result-object v5

    iput-object v5, p0, LUh/q;->n:LUh/q;

    .line 36
    :cond_4
    iget v5, p0, LUh/q;->d:I

    or-int/2addr v5, v7

    iput v5, p0, LUh/q;->d:I

    goto/16 :goto_0

    .line 37
    :sswitch_6
    iget v5, p0, LUh/q;->d:I

    or-int/lit8 v5, v5, 0x40

    iput v5, p0, LUh/q;->d:I

    .line 38
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->r()I

    move-result v5

    iput v5, p0, LUh/q;->l:I

    goto/16 :goto_0

    .line 39
    :sswitch_7
    iget v5, p0, LUh/q;->d:I

    or-int/lit8 v5, v5, 0x8

    iput v5, p0, LUh/q;->d:I

    .line 40
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->r()I

    move-result v5

    iput v5, p0, LUh/q;->i:I

    goto/16 :goto_0

    .line 41
    :sswitch_8
    iget v5, p0, LUh/q;->d:I

    or-int/lit8 v5, v5, 0x20

    iput v5, p0, LUh/q;->d:I

    .line 42
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->r()I

    move-result v5

    iput v5, p0, LUh/q;->k:I

    goto/16 :goto_0

    .line 43
    :sswitch_9
    iget v5, p0, LUh/q;->d:I

    or-int/lit8 v5, v5, 0x10

    iput v5, p0, LUh/q;->d:I

    .line 44
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->r()I

    move-result v5

    iput v5, p0, LUh/q;->j:I

    goto/16 :goto_0

    .line 45
    :sswitch_a
    iget v5, p0, LUh/q;->d:I

    const/4 v7, 0x4

    and-int/2addr v5, v7

    if-ne v5, v7, :cond_5

    .line 46
    iget-object v5, p0, LUh/q;->h:LUh/q;

    invoke-virtual {v5}, LUh/q;->K1()LUh/q$c;

    move-result-object v6

    .line 47
    :cond_5
    sget-object v5, LUh/q;->v:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-virtual {p1, v5, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->t(Lkotlin/reflect/jvm/internal/impl/protobuf/p;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    move-result-object v5

    check-cast v5, LUh/q;

    iput-object v5, p0, LUh/q;->h:LUh/q;

    if-eqz v6, :cond_6

    .line 48
    invoke-virtual {v6, v5}, LUh/q$c;->E(LUh/q;)LUh/q$c;

    .line 49
    invoke-virtual {v6}, LUh/q$c;->u()LUh/q;

    move-result-object v5

    iput-object v5, p0, LUh/q;->h:LUh/q;

    .line 50
    :cond_6
    iget v5, p0, LUh/q;->d:I

    or-int/2addr v5, v7

    iput v5, p0, LUh/q;->d:I

    goto/16 :goto_0

    .line 51
    :sswitch_b
    iget v5, p0, LUh/q;->d:I

    or-int/lit8 v5, v5, 0x2

    iput v5, p0, LUh/q;->d:I

    .line 52
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->r()I

    move-result v5

    iput v5, p0, LUh/q;->g:I

    goto/16 :goto_0

    .line 53
    :sswitch_c
    iget v5, p0, LUh/q;->d:I

    or-int/2addr v5, v1

    iput v5, p0, LUh/q;->d:I

    .line 54
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->j()Z

    move-result v5

    iput-boolean v5, p0, LUh/q;->f:Z

    goto/16 :goto_0

    :sswitch_d
    if-eq v4, v1, :cond_7

    .line 55
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, p0, LUh/q;->e:Ljava/util/List;

    move v4, v1

    .line 56
    :cond_7
    iget-object v5, p0, LUh/q;->e:Ljava/util/List;

    sget-object v6, LUh/q$b;->j:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    invoke-virtual {p1, v6, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->t(Lkotlin/reflect/jvm/internal/impl/protobuf/p;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 57
    :sswitch_e
    iget v5, p0, LUh/q;->d:I

    or-int/lit16 v5, v5, 0x1000

    iput v5, p0, LUh/q;->d:I

    .line 58
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->r()I

    move-result v5

    iput v5, p0, LUh/q;->r:I
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 59
    :goto_1
    :try_start_1
    new-instance p2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 60
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->n(Lkotlin/reflect/jvm/internal/impl/protobuf/n;)Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1

    .line 61
    :goto_2
    invoke-virtual {p1, p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->n(Lkotlin/reflect/jvm/internal/impl/protobuf/n;)Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_3
    if-ne v4, v1, :cond_8

    .line 62
    iget-object p2, p0, LUh/q;->e:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, LUh/q;->e:Ljava/util/List;

    .line 63
    :cond_8
    :try_start_2
    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 64
    :catch_2
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/d$b;->p()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p2

    iput-object p2, p0, LUh/q;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/d$b;->p()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p2

    iput-object p2, p0, LUh/q;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    .line 65
    throw p1

    .line 66
    :goto_4
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->s()V

    .line 67
    throw p1

    :cond_9
    if-ne v4, v1, :cond_a

    .line 68
    iget-object p1, p0, LUh/q;->e:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LUh/q;->e:Ljava/util/List;

    .line 69
    :cond_a
    :try_start_3
    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 70
    :catch_3
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/d$b;->p()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    iput-object p1, p0, LUh/q;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    goto :goto_5

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/d$b;->p()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p2

    iput-object p2, p0, LUh/q;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    .line 71
    throw p1

    .line 72
    :goto_5
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->s()V

    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_e
        0x12 -> :sswitch_d
        0x18 -> :sswitch_c
        0x20 -> :sswitch_b
        0x2a -> :sswitch_a
        0x30 -> :sswitch_9
        0x38 -> :sswitch_8
        0x40 -> :sswitch_7
        0x48 -> :sswitch_6
        0x52 -> :sswitch_5
        0x58 -> :sswitch_4
        0x60 -> :sswitch_3
        0x6a -> :sswitch_2
        0x70 -> :sswitch_1
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;LUh/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LUh/q;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)V

    return-void
.end method

.method private constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, LUh/q;->s:B

    .line 5
    iput v0, p0, LUh/q;->t:I

    .line 6
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->e()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    iput-object p1, p0, LUh/q;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    return-void
.end method

.method synthetic constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;LUh/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LUh/q;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, LUh/q;->s:B

    .line 9
    iput p1, p0, LUh/q;->t:I

    .line 10
    sget-object p1, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->a:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    iput-object p1, p0, LUh/q;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    return-void
.end method

.method static synthetic C0(LUh/q;Z)Z
    .locals 0

    iput-boolean p1, p0, LUh/q;->f:Z

    return p1
.end method

.method static synthetic E0(LUh/q;I)I
    .locals 0

    iput p1, p0, LUh/q;->g:I

    return p1
.end method

.method static synthetic G0(LUh/q;LUh/q;)LUh/q;
    .locals 0

    iput-object p1, p0, LUh/q;->h:LUh/q;

    return-object p1
.end method

.method private G1()V
    .locals 2

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LUh/q;->e:Ljava/util/List;

    const/4 v0, 0x0

    iput-boolean v0, p0, LUh/q;->f:Z

    iput v0, p0, LUh/q;->g:I

    invoke-static {}, LUh/q;->h1()LUh/q;

    move-result-object v1

    iput-object v1, p0, LUh/q;->h:LUh/q;

    iput v0, p0, LUh/q;->i:I

    iput v0, p0, LUh/q;->j:I

    iput v0, p0, LUh/q;->k:I

    iput v0, p0, LUh/q;->l:I

    iput v0, p0, LUh/q;->m:I

    invoke-static {}, LUh/q;->h1()LUh/q;

    move-result-object v1

    iput-object v1, p0, LUh/q;->n:LUh/q;

    iput v0, p0, LUh/q;->o:I

    invoke-static {}, LUh/q;->h1()LUh/q;

    move-result-object v1

    iput-object v1, p0, LUh/q;->p:LUh/q;

    iput v0, p0, LUh/q;->q:I

    iput v0, p0, LUh/q;->r:I

    return-void
.end method

.method public static H1()LUh/q$c;
    .locals 1

    invoke-static {}, LUh/q$c;->r()LUh/q$c;

    move-result-object v0

    return-object v0
.end method

.method public static I1(LUh/q;)LUh/q$c;
    .locals 1

    invoke-static {}, LUh/q;->H1()LUh/q$c;

    move-result-object v0

    invoke-virtual {v0, p0}, LUh/q$c;->E(LUh/q;)LUh/q$c;

    move-result-object p0

    return-object p0
.end method

.method static synthetic K0(LUh/q;I)I
    .locals 0

    iput p1, p0, LUh/q;->i:I

    return p1
.end method

.method static synthetic M0(LUh/q;I)I
    .locals 0

    iput p1, p0, LUh/q;->j:I

    return p1
.end method

.method static synthetic N0(LUh/q;I)I
    .locals 0

    iput p1, p0, LUh/q;->k:I

    return p1
.end method

.method static synthetic P0(LUh/q;I)I
    .locals 0

    iput p1, p0, LUh/q;->l:I

    return p1
.end method

.method static synthetic T0(LUh/q;I)I
    .locals 0

    iput p1, p0, LUh/q;->m:I

    return p1
.end method

.method static synthetic U0(LUh/q;LUh/q;)LUh/q;
    .locals 0

    iput-object p1, p0, LUh/q;->n:LUh/q;

    return-object p1
.end method

.method static synthetic V0(LUh/q;I)I
    .locals 0

    iput p1, p0, LUh/q;->o:I

    return p1
.end method

.method static synthetic W0(LUh/q;LUh/q;)LUh/q;
    .locals 0

    iput-object p1, p0, LUh/q;->p:LUh/q;

    return-object p1
.end method

.method static synthetic X0(LUh/q;I)I
    .locals 0

    iput p1, p0, LUh/q;->q:I

    return p1
.end method

.method static synthetic Y0(LUh/q;I)I
    .locals 0

    iput p1, p0, LUh/q;->r:I

    return p1
.end method

.method static synthetic Z0(LUh/q;I)I
    .locals 0

    iput p1, p0, LUh/q;->d:I

    return p1
.end method

.method static synthetic a1(LUh/q;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;
    .locals 0

    iget-object p0, p0, LUh/q;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    return-object p0
.end method

.method static synthetic f0(LUh/q;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LUh/q;->e:Ljava/util/List;

    return-object p0
.end method

.method public static h1()LUh/q;
    .locals 1

    sget-object v0, LUh/q;->u:LUh/q;

    return-object v0
.end method

.method static synthetic q0(LUh/q;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, LUh/q;->e:Ljava/util/List;

    return-object p1
.end method


# virtual methods
.method public A1()Z
    .locals 2

    iget v0, p0, LUh/q;->d:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public B1()Z
    .locals 2

    iget v0, p0, LUh/q;->d:I

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

    iget v0, p0, LUh/q;->d:I

    const/16 v1, 0x200

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public D1()Z
    .locals 2

    iget v0, p0, LUh/q;->d:I

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

.method public E1()Z
    .locals 2

    iget v0, p0, LUh/q;->d:I

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

.method public F1()Z
    .locals 2

    iget v0, p0, LUh/q;->d:I

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

.method public J1()LUh/q$c;
    .locals 1

    invoke-static {}, LUh/q;->H1()LUh/q$c;

    move-result-object v0

    return-object v0
.end method

.method public K1()LUh/q$c;
    .locals 1

    invoke-static {p0}, LUh/q;->I1(LUh/q;)LUh/q$c;

    move-result-object v0

    return-object v0
.end method

.method public b1()LUh/q;
    .locals 1

    iget-object v0, p0, LUh/q;->p:LUh/q;

    return-object v0
.end method

.method public bridge synthetic c()Lkotlin/reflect/jvm/internal/impl/protobuf/n;
    .locals 1

    invoke-virtual {p0}, LUh/q;->i1()LUh/q;

    move-result-object v0

    return-object v0
.end method

.method public c1()I
    .locals 1

    iget v0, p0, LUh/q;->q:I

    return v0
.end method

.method public d()I
    .locals 5

    iget v0, p0, LUh/q;->t:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, LUh/q;->d:I

    const/16 v1, 0x1000

    and-int/2addr v0, v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_1

    iget v0, p0, LUh/q;->r:I

    invoke-static {v3, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->o(II)I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    iget-object v1, p0, LUh/q;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v4, 0x2

    if-ge v2, v1, :cond_2

    iget-object v1, p0, LUh/q;->e:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    invoke-static {v4, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->r(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget v1, p0, LUh/q;->d:I

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_3

    const/4 v1, 0x3

    iget-boolean v2, p0, LUh/q;->f:Z

    invoke-static {v1, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->a(IZ)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    iget v1, p0, LUh/q;->d:I

    and-int/2addr v1, v4

    const/4 v2, 0x4

    if-ne v1, v4, :cond_4

    iget v1, p0, LUh/q;->g:I

    invoke-static {v2, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    iget v1, p0, LUh/q;->d:I

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_5

    const/4 v1, 0x5

    iget-object v2, p0, LUh/q;->h:LUh/q;

    invoke-static {v1, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->r(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_5
    iget v1, p0, LUh/q;->d:I

    const/16 v2, 0x10

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_6

    const/4 v1, 0x6

    iget v2, p0, LUh/q;->j:I

    invoke-static {v1, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_6
    iget v1, p0, LUh/q;->d:I

    const/16 v2, 0x20

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_7

    const/4 v1, 0x7

    iget v2, p0, LUh/q;->k:I

    invoke-static {v1, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_7
    iget v1, p0, LUh/q;->d:I

    const/16 v2, 0x8

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_8

    iget v1, p0, LUh/q;->i:I

    invoke-static {v2, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_8
    iget v1, p0, LUh/q;->d:I

    const/16 v2, 0x40

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_9

    const/16 v1, 0x9

    iget v2, p0, LUh/q;->l:I

    invoke-static {v1, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_9
    iget v1, p0, LUh/q;->d:I

    const/16 v2, 0x100

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_a

    const/16 v1, 0xa

    iget-object v2, p0, LUh/q;->n:LUh/q;

    invoke-static {v1, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->r(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_a
    iget v1, p0, LUh/q;->d:I

    const/16 v2, 0x200

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_b

    const/16 v1, 0xb

    iget v2, p0, LUh/q;->o:I

    invoke-static {v1, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_b
    iget v1, p0, LUh/q;->d:I

    const/16 v2, 0x80

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_c

    const/16 v1, 0xc

    iget v2, p0, LUh/q;->m:I

    invoke-static {v1, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_c
    iget v1, p0, LUh/q;->d:I

    const/16 v2, 0x400

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_d

    const/16 v1, 0xd

    iget-object v2, p0, LUh/q;->p:LUh/q;

    invoke-static {v1, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->r(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_d
    iget v1, p0, LUh/q;->d:I

    const/16 v2, 0x800

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_e

    const/16 v1, 0xe

    iget v2, p0, LUh/q;->q:I

    invoke-static {v1, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_e
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->F()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, LUh/q;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->size()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, LUh/q;->t:I

    return v0
.end method

.method public d1(I)LUh/q$b;
    .locals 1

    iget-object v0, p0, LUh/q;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LUh/q$b;

    return-object p1
.end method

.method public e1()I
    .locals 1

    iget-object v0, p0, LUh/q;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public f1()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LUh/q;->e:Ljava/util/List;

    return-object v0
.end method

.method public g1()I
    .locals 1

    iget v0, p0, LUh/q;->j:I

    return v0
.end method

.method public bridge synthetic h()Lkotlin/reflect/jvm/internal/impl/protobuf/n$a;
    .locals 1

    invoke-virtual {p0}, LUh/q;->J1()LUh/q$c;

    move-result-object v0

    return-object v0
.end method

.method public i1()LUh/q;
    .locals 1

    sget-object v0, LUh/q;->u:LUh/q;

    return-object v0
.end method

.method public j1()I
    .locals 1

    iget v0, p0, LUh/q;->r:I

    return v0
.end method

.method public k1()I
    .locals 1

    iget v0, p0, LUh/q;->g:I

    return v0
.end method

.method public bridge synthetic l()Lkotlin/reflect/jvm/internal/impl/protobuf/n$a;
    .locals 1

    invoke-virtual {p0}, LUh/q;->K1()LUh/q$c;

    move-result-object v0

    return-object v0
.end method

.method public l1()LUh/q;
    .locals 1

    iget-object v0, p0, LUh/q;->h:LUh/q;

    return-object v0
.end method

.method public final m()Z
    .locals 4

    iget-byte v0, p0, LUh/q;->s:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    move v0, v2

    :goto_0
    invoke-virtual {p0}, LUh/q;->e1()I

    move-result v3

    if-ge v0, v3, :cond_3

    invoke-virtual {p0, v0}, LUh/q;->d1(I)LUh/q$b;

    move-result-object v3

    invoke-virtual {v3}, LUh/q$b;->m()Z

    move-result v3

    if-nez v3, :cond_2

    iput-byte v2, p0, LUh/q;->s:B

    return v2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, LUh/q;->y1()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, LUh/q;->l1()LUh/q;

    move-result-object v0

    invoke-virtual {v0}, LUh/q;->m()Z

    move-result v0

    if-nez v0, :cond_4

    iput-byte v2, p0, LUh/q;->s:B

    return v2

    :cond_4
    invoke-virtual {p0}, LUh/q;->B1()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, LUh/q;->o1()LUh/q;

    move-result-object v0

    invoke-virtual {v0}, LUh/q;->m()Z

    move-result v0

    if-nez v0, :cond_5

    iput-byte v2, p0, LUh/q;->s:B

    return v2

    :cond_5
    invoke-virtual {p0}, LUh/q;->t1()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, LUh/q;->b1()LUh/q;

    move-result-object v0

    invoke-virtual {v0}, LUh/q;->m()Z

    move-result v0

    if-nez v0, :cond_6

    iput-byte v2, p0, LUh/q;->s:B

    return v2

    :cond_6
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->E()Z

    move-result v0

    if-nez v0, :cond_7

    iput-byte v2, p0, LUh/q;->s:B

    return v2

    :cond_7
    iput-byte v1, p0, LUh/q;->s:B

    return v1
.end method

.method public m1()I
    .locals 1

    iget v0, p0, LUh/q;->i:I

    return v0
.end method

.method public n(Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;)V
    .locals 5

    invoke-virtual {p0}, LUh/q;->d()I

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->T()Lkotlin/reflect/jvm/internal/impl/protobuf/h$d$a;

    move-result-object v0

    iget v1, p0, LUh/q;->d:I

    const/16 v2, 0x1000

    and-int/2addr v1, v2

    const/4 v3, 0x1

    if-ne v1, v2, :cond_0

    iget v1, p0, LUh/q;->r:I

    invoke-virtual {p1, v3, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->Z(II)V

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, LUh/q;->e:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v4, 0x2

    if-ge v1, v2, :cond_1

    iget-object v2, p0, LUh/q;->e:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    invoke-virtual {p1, v4, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->c0(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget v1, p0, LUh/q;->d:I

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_2

    const/4 v1, 0x3

    iget-boolean v2, p0, LUh/q;->f:Z

    invoke-virtual {p1, v1, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->K(IZ)V

    :cond_2
    iget v1, p0, LUh/q;->d:I

    and-int/2addr v1, v4

    const/4 v2, 0x4

    if-ne v1, v4, :cond_3

    iget v1, p0, LUh/q;->g:I

    invoke-virtual {p1, v2, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->Z(II)V

    :cond_3
    iget v1, p0, LUh/q;->d:I

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_4

    const/4 v1, 0x5

    iget-object v2, p0, LUh/q;->h:LUh/q;

    invoke-virtual {p1, v1, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->c0(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)V

    :cond_4
    iget v1, p0, LUh/q;->d:I

    const/16 v2, 0x10

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_5

    const/4 v1, 0x6

    iget v2, p0, LUh/q;->j:I

    invoke-virtual {p1, v1, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->Z(II)V

    :cond_5
    iget v1, p0, LUh/q;->d:I

    const/16 v2, 0x20

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_6

    const/4 v1, 0x7

    iget v2, p0, LUh/q;->k:I

    invoke-virtual {p1, v1, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->Z(II)V

    :cond_6
    iget v1, p0, LUh/q;->d:I

    const/16 v2, 0x8

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_7

    iget v1, p0, LUh/q;->i:I

    invoke-virtual {p1, v2, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->Z(II)V

    :cond_7
    iget v1, p0, LUh/q;->d:I

    const/16 v2, 0x40

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_8

    const/16 v1, 0x9

    iget v2, p0, LUh/q;->l:I

    invoke-virtual {p1, v1, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->Z(II)V

    :cond_8
    iget v1, p0, LUh/q;->d:I

    const/16 v2, 0x100

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_9

    const/16 v1, 0xa

    iget-object v2, p0, LUh/q;->n:LUh/q;

    invoke-virtual {p1, v1, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->c0(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)V

    :cond_9
    iget v1, p0, LUh/q;->d:I

    const/16 v2, 0x200

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_a

    const/16 v1, 0xb

    iget v2, p0, LUh/q;->o:I

    invoke-virtual {p1, v1, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->Z(II)V

    :cond_a
    iget v1, p0, LUh/q;->d:I

    const/16 v2, 0x80

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_b

    const/16 v1, 0xc

    iget v2, p0, LUh/q;->m:I

    invoke-virtual {p1, v1, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->Z(II)V

    :cond_b
    iget v1, p0, LUh/q;->d:I

    const/16 v2, 0x400

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_c

    const/16 v1, 0xd

    iget-object v2, p0, LUh/q;->p:LUh/q;

    invoke-virtual {p1, v1, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->c0(ILkotlin/reflect/jvm/internal/impl/protobuf/n;)V

    :cond_c
    iget v1, p0, LUh/q;->d:I

    const/16 v2, 0x800

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_d

    const/16 v1, 0xe

    iget v2, p0, LUh/q;->q:I

    invoke-virtual {p1, v1, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->Z(II)V

    :cond_d
    const/16 v1, 0xc8

    invoke-virtual {v0, v1, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d$a;->a(ILkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;)V

    iget-object v0, p0, LUh/q;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    invoke-virtual {p1, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->h0(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)V

    return-void
.end method

.method public n1()Z
    .locals 1

    iget-boolean v0, p0, LUh/q;->f:Z

    return v0
.end method

.method public o1()LUh/q;
    .locals 1

    iget-object v0, p0, LUh/q;->n:LUh/q;

    return-object v0
.end method

.method public p1()I
    .locals 1

    iget v0, p0, LUh/q;->o:I

    return v0
.end method

.method public q1()I
    .locals 1

    iget v0, p0, LUh/q;->m:I

    return v0
.end method

.method public r1()I
    .locals 1

    iget v0, p0, LUh/q;->k:I

    return v0
.end method

.method public s1()I
    .locals 1

    iget v0, p0, LUh/q;->l:I

    return v0
.end method

.method public t1()Z
    .locals 2

    iget v0, p0, LUh/q;->d:I

    const/16 v1, 0x400

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public u1()Z
    .locals 2

    iget v0, p0, LUh/q;->d:I

    const/16 v1, 0x800

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public v1()Z
    .locals 2

    iget v0, p0, LUh/q;->d:I

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

.method public w1()Z
    .locals 2

    iget v0, p0, LUh/q;->d:I

    const/16 v1, 0x1000

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public x1()Z
    .locals 2

    iget v0, p0, LUh/q;->d:I

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

.method public y1()Z
    .locals 2

    iget v0, p0, LUh/q;->d:I

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

.method public z1()Z
    .locals 2

    iget v0, p0, LUh/q;->d:I

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
