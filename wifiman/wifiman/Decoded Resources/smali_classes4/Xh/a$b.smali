.class public final LXh/a$b;
.super Lkotlin/reflect/jvm/internal/impl/protobuf/h;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LXh/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LXh/a$b$b;
    }
.end annotation


# static fields
.field private static final h:LXh/a$b;

.field public static i:Lkotlin/reflect/jvm/internal/impl/protobuf/p;


# instance fields
.field private final b:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

.field private c:I

.field private d:I

.field private e:I

.field private f:B

.field private g:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LXh/a$b$a;

    invoke-direct {v0}, LXh/a$b$a;-><init>()V

    sput-object v0, LXh/a$b;->i:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    new-instance v0, LXh/a$b;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LXh/a$b;-><init>(Z)V

    sput-object v0, LXh/a$b;->h:LXh/a$b;

    invoke-direct {v0}, LXh/a$b;->f0()V

    return-void
.end method

.method private constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)V
    .locals 6

    .line 11
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h;-><init>()V

    const/4 v0, -0x1

    .line 12
    iput-byte v0, p0, LXh/a$b;->f:B

    .line 13
    iput v0, p0, LXh/a$b;->g:I

    .line 14
    invoke-direct {p0}, LXh/a$b;->f0()V

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
    if-nez v3, :cond_4

    .line 17
    :try_start_0
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->J()I

    move-result v4

    if-eqz v4, :cond_1

    const/16 v5, 0x8

    if-eq v4, v5, :cond_3

    const/16 v5, 0x10

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

    goto :goto_3

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_2

    .line 19
    :cond_2
    iget v4, p0, LXh/a$b;->c:I

    or-int/lit8 v4, v4, 0x2

    iput v4, p0, LXh/a$b;->c:I

    .line 20
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->r()I

    move-result v4

    iput v4, p0, LXh/a$b;->e:I

    goto :goto_0

    .line 21
    :cond_3
    iget v4, p0, LXh/a$b;->c:I

    or-int/2addr v4, v1

    iput v4, p0, LXh/a$b;->c:I

    .line 22
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/e;->r()I

    move-result v4

    iput v4, p0, LXh/a$b;->d:I
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 23
    :goto_1
    :try_start_1
    new-instance p2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 24
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->n(Lkotlin/reflect/jvm/internal/impl/protobuf/n;)Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1

    .line 25
    :goto_2
    invoke-virtual {p1, p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->n(Lkotlin/reflect/jvm/internal/impl/protobuf/n;)Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    :goto_3
    :try_start_2
    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 27
    :catch_2
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/d$b;->p()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p2

    iput-object p2, p0, LXh/a$b;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/d$b;->p()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p2

    iput-object p2, p0, LXh/a$b;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    .line 28
    throw p1

    .line 29
    :goto_4
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h;->s()V

    .line 30
    throw p1

    .line 31
    :cond_4
    :try_start_3
    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 32
    :catch_3
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/d$b;->p()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    iput-object p1, p0, LXh/a$b;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    goto :goto_5

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/d$b;->p()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p2

    iput-object p2, p0, LXh/a$b;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    .line 33
    throw p1

    .line 34
    :goto_5
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h;->s()V

    return-void
.end method

.method synthetic constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;LXh/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LXh/a$b;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)V

    return-void
.end method

.method private constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;)V

    const/4 v0, -0x1

    .line 4
    iput-byte v0, p0, LXh/a$b;->f:B

    .line 5
    iput v0, p0, LXh/a$b;->g:I

    .line 6
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->e()Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    move-result-object p1

    iput-object p1, p0, LXh/a$b;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    return-void
.end method

.method synthetic constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;LXh/a$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LXh/a$b;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h;-><init>()V

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, LXh/a$b;->f:B

    .line 9
    iput p1, p0, LXh/a$b;->g:I

    .line 10
    sget-object p1, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->a:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    iput-object p1, p0, LXh/a$b;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    return-void
.end method

.method static synthetic C(LXh/a$b;I)I
    .locals 0

    iput p1, p0, LXh/a$b;->d:I

    return p1
.end method

.method public static C0(LXh/a$b;)LXh/a$b$b;
    .locals 1

    invoke-static {}, LXh/a$b;->q0()LXh/a$b$b;

    move-result-object v0

    invoke-virtual {v0, p0}, LXh/a$b$b;->u(LXh/a$b;)LXh/a$b$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic E(LXh/a$b;I)I
    .locals 0

    iput p1, p0, LXh/a$b;->e:I

    return p1
.end method

.method static synthetic F(LXh/a$b;I)I
    .locals 0

    iput p1, p0, LXh/a$b;->c:I

    return p1
.end method

.method static synthetic J(LXh/a$b;)Lkotlin/reflect/jvm/internal/impl/protobuf/d;
    .locals 0

    iget-object p0, p0, LXh/a$b;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    return-object p0
.end method

.method public static K()LXh/a$b;
    .locals 1

    sget-object v0, LXh/a$b;->h:LXh/a$b;

    return-object v0
.end method

.method private f0()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LXh/a$b;->d:I

    iput v0, p0, LXh/a$b;->e:I

    return-void
.end method

.method public static q0()LXh/a$b$b;
    .locals 1

    invoke-static {}, LXh/a$b$b;->k()LXh/a$b$b;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public E0()LXh/a$b$b;
    .locals 1

    invoke-static {}, LXh/a$b;->q0()LXh/a$b$b;

    move-result-object v0

    return-object v0
.end method

.method public G0()LXh/a$b$b;
    .locals 1

    invoke-static {p0}, LXh/a$b;->C0(LXh/a$b;)LXh/a$b$b;

    move-result-object v0

    return-object v0
.end method

.method public P()I
    .locals 1

    iget v0, p0, LXh/a$b;->e:I

    return v0
.end method

.method public S()I
    .locals 1

    iget v0, p0, LXh/a$b;->d:I

    return v0
.end method

.method public T()Z
    .locals 2

    iget v0, p0, LXh/a$b;->c:I

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
    .locals 3

    iget v0, p0, LXh/a$b;->g:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, LXh/a$b;->c:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget v0, p0, LXh/a$b;->d:I

    invoke-static {v1, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->o(II)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget v1, p0, LXh/a$b;->c:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_2

    iget v1, p0, LXh/a$b;->e:I

    invoke-static {v2, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    iget-object v1, p0, LXh/a$b;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/d;->size()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, LXh/a$b;->g:I

    return v0
.end method

.method public d0()Z
    .locals 2

    iget v0, p0, LXh/a$b;->c:I

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

    invoke-virtual {p0}, LXh/a$b;->E0()LXh/a$b$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic l()Lkotlin/reflect/jvm/internal/impl/protobuf/n$a;
    .locals 1

    invoke-virtual {p0}, LXh/a$b;->G0()LXh/a$b$b;

    move-result-object v0

    return-object v0
.end method

.method public final m()Z
    .locals 2

    iget-byte v0, p0, LXh/a$b;->f:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    if-nez v0, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    iput-byte v1, p0, LXh/a$b;->f:B

    return v1
.end method

.method public n(Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;)V
    .locals 2

    invoke-virtual {p0}, LXh/a$b;->d()I

    iget v0, p0, LXh/a$b;->c:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget v0, p0, LXh/a$b;->d:I

    invoke-virtual {p1, v1, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->Z(II)V

    :cond_0
    iget v0, p0, LXh/a$b;->c:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget v0, p0, LXh/a$b;->e:I

    invoke-virtual {p1, v1, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->Z(II)V

    :cond_1
    iget-object v0, p0, LXh/a$b;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/d;

    invoke-virtual {p1, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;->h0(Lkotlin/reflect/jvm/internal/impl/protobuf/d;)V

    return-void
.end method
