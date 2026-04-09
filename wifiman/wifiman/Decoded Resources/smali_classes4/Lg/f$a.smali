.class public LLg/f$a;
.super Ljava/io/ByteArrayOutputStream;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LLg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:LLg/f;

.field private final b:I


# direct methods
.method constructor <init>(ILLg/f;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, LLg/f$a;-><init>(ILLg/f;I)V

    return-void
.end method

.method constructor <init>(ILLg/f;I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 3
    iput-object p2, p0, LLg/f$a;->a:LLg/f;

    .line 4
    iput p3, p0, LLg/f$a;->b:I

    return-void
.end method

.method private static a(Ljava/lang/String;)I
    .locals 3

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x2e

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    if-gez v0, :cond_0

    const/4 p0, -0x1

    return p0

    :cond_0
    if-eqz v0, :cond_2

    add-int/lit8 v1, v0, -0x1

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x5c

    if-eq v1, v2, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return v0
.end method


# virtual methods
.method C(I)V
    .locals 1

    shr-int/lit8 v0, p1, 0x8

    invoke-virtual {p0, v0}, LLg/f$a;->g(I)V

    invoke-virtual {p0, p1}, LLg/f$a;->g(I)V

    return-void
.end method

.method J(Ljava/lang/String;II)V
    .locals 7

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :goto_0
    const/16 v3, 0x7ff

    const/16 v4, 0x7f

    const/4 v5, 0x1

    if-ge v1, p3, :cond_2

    add-int v6, p2, v1

    invoke-virtual {p1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-lt v6, v5, :cond_0

    if-gt v6, v4, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_0
    if-le v6, v3, :cond_1

    add-int/lit8 v2, v2, 0x3

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x2

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v2}, LLg/f$a;->g(I)V

    :goto_2
    if-ge v0, p3, :cond_5

    add-int v1, p2, v0

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-lt v1, v5, :cond_3

    if-gt v1, v4, :cond_3

    invoke-virtual {p0, v1}, LLg/f$a;->g(I)V

    goto :goto_3

    :cond_3
    if-le v1, v3, :cond_4

    shr-int/lit8 v2, v1, 0xc

    and-int/lit8 v2, v2, 0xf

    or-int/lit16 v2, v2, 0xe0

    invoke-virtual {p0, v2}, LLg/f$a;->g(I)V

    shr-int/lit8 v2, v1, 0x6

    and-int/lit8 v2, v2, 0x3f

    or-int/lit16 v2, v2, 0x80

    invoke-virtual {p0, v2}, LLg/f$a;->g(I)V

    and-int/lit8 v1, v1, 0x3f

    or-int/lit16 v1, v1, 0x80

    invoke-virtual {p0, v1}, LLg/f$a;->g(I)V

    goto :goto_3

    :cond_4
    shr-int/lit8 v2, v1, 0x6

    and-int/lit8 v2, v2, 0x1f

    or-int/lit16 v2, v2, 0xc0

    invoke-virtual {p0, v2}, LLg/f$a;->g(I)V

    and-int/lit8 v1, v1, 0x3f

    or-int/lit16 v1, v1, 0x80

    invoke-virtual {p0, v1}, LLg/f$a;->g(I)V

    :goto_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_5
    return-void
.end method

.method g(I)V
    .locals 0

    and-int/lit16 p1, p1, 0xff

    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write(I)V

    return-void
.end method

.method h([BII)V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_0

    add-int v1, p2, v0

    aget-byte v1, p1, v1

    invoke-virtual {p0, v1}, LLg/f$a;->g(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method j(I)V
    .locals 1

    shr-int/lit8 v0, p1, 0x10

    invoke-virtual {p0, v0}, LLg/f$a;->C(I)V

    invoke-virtual {p0, p1}, LLg/f$a;->C(I)V

    return-void
.end method

.method p(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, LLg/f$a;->s(Ljava/lang/String;Z)V

    return-void
.end method

.method s(Ljava/lang/String;Z)V
    .locals 7

    :cond_0
    :goto_0
    invoke-static {p1}, LLg/f$a;->a(Ljava/lang/String;)I

    move-result v0

    if-gez v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    :cond_1
    const/4 v1, 0x0

    if-gtz v0, :cond_2

    invoke-virtual {p0, v1}, LLg/f$a;->g(I)V

    return-void

    :cond_2
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const-string v3, "\\."

    const-string v4, "."

    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    if-eqz p2, :cond_4

    sget-boolean v3, LLg/f;->o:Z

    if-eqz v3, :cond_4

    iget-object v3, p0, LLg/f$a;->a:LLg/f;

    iget-object v3, v3, LLg/f;->h:Ljava/util/Map;

    invoke-interface {v3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    shr-int/lit8 p2, p1, 0x8

    or-int/lit16 p2, p2, 0xc0

    invoke-virtual {p0, p2}, LLg/f$a;->g(I)V

    and-int/lit16 p1, p1, 0xff

    invoke-virtual {p0, p1}, LLg/f$a;->g(I)V

    return-void

    :cond_3
    iget-object v3, p0, LLg/f$a;->a:LLg/f;

    iget-object v3, v3, LLg/f;->h:Ljava/util/Map;

    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v5

    iget v6, p0, LLg/f$a;->b:I

    add-int/2addr v5, v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v3, p1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {p0, v2, v1, v3}, LLg/f$a;->J(Ljava/lang/String;II)V

    goto :goto_1

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {p0, v2, v1, v3}, LLg/f$a;->J(Ljava/lang/String;II)V

    :goto_1
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0
.end method

.method v(LLg/g;)V
    .locals 1

    invoke-virtual {p1}, LLg/b;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, LLg/f$a;->p(Ljava/lang/String;)V

    invoke-virtual {p1}, LLg/b;->g()Ljavax/jmdns/impl/constants/e;

    move-result-object v0

    invoke-virtual {v0}, Ljavax/jmdns/impl/constants/e;->indexValue()I

    move-result v0

    invoke-virtual {p0, v0}, LLg/f$a;->C(I)V

    invoke-virtual {p1}, LLg/b;->f()Ljavax/jmdns/impl/constants/d;

    move-result-object p1

    invoke-virtual {p1}, Ljavax/jmdns/impl/constants/d;->indexValue()I

    move-result p1

    invoke-virtual {p0, p1}, LLg/f$a;->C(I)V

    return-void
.end method

.method public writeBytes([B)V
    .locals 2

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, LLg/f$a;->h([BII)V

    :cond_0
    return-void
.end method

.method y(LLg/h;J)V
    .locals 3

    invoke-virtual {p1}, LLg/b;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, LLg/f$a;->p(Ljava/lang/String;)V

    invoke-virtual {p1}, LLg/b;->g()Ljavax/jmdns/impl/constants/e;

    move-result-object v0

    invoke-virtual {v0}, Ljavax/jmdns/impl/constants/e;->indexValue()I

    move-result v0

    invoke-virtual {p0, v0}, LLg/f$a;->C(I)V

    invoke-virtual {p1}, LLg/b;->f()Ljavax/jmdns/impl/constants/d;

    move-result-object v0

    invoke-virtual {v0}, Ljavax/jmdns/impl/constants/d;->indexValue()I

    move-result v0

    invoke-virtual {p1}, LLg/b;->q()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v1, p0, LLg/f$a;->a:LLg/f;

    invoke-virtual {v1}, LLg/e;->o()Z

    move-result v1

    if-eqz v1, :cond_0

    const v1, 0x8000

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v0, v1

    invoke-virtual {p0, v0}, LLg/f$a;->C(I)V

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, LLg/h;->H()I

    move-result p2

    goto :goto_1

    :cond_1
    invoke-virtual {p1, p2, p3}, LLg/h;->D(J)I

    move-result p2

    :goto_1
    invoke-virtual {p0, p2}, LLg/f$a;->j(I)V

    new-instance p2, LLg/f$a;

    iget-object p3, p0, LLg/f$a;->a:LLg/f;

    iget v0, p0, LLg/f$a;->b:I

    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x2

    const/16 v1, 0x200

    invoke-direct {p2, v1, p3, v0}, LLg/f$a;-><init>(ILLg/f;I)V

    invoke-virtual {p1, p2}, LLg/h;->V(LLg/f$a;)V

    invoke-virtual {p2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    array-length p2, p1

    invoke-virtual {p0, p2}, LLg/f$a;->C(I)V

    array-length p2, p1

    invoke-virtual {p0, p1, v2, p2}, Ljava/io/OutputStream;->write([BII)V

    return-void
.end method
