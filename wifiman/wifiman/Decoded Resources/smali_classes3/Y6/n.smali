.class final LY6/n;
.super LY6/o;
.source "SourceFile"


# static fields
.field private static final m:[Ljava/lang/String;


# instance fields
.field private final j:Lej/f;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x80

    new-array v0, v0, [Ljava/lang/String;

    sput-object v0, LY6/n;->m:[Ljava/lang/String;

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x1f

    if-gt v0, v1, :cond_0

    sget-object v1, LY6/n;->m:[Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string/jumbo v3, "\\u%04x"

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    sget-object v0, LY6/n;->m:[Ljava/lang/String;

    const/16 v1, 0x22

    const-string/jumbo v2, "\\\""

    aput-object v2, v0, v1

    const/16 v1, 0x5c

    const-string/jumbo v2, "\\\\"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string/jumbo v2, "\\t"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string/jumbo v2, "\\b"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string/jumbo v2, "\\n"

    aput-object v2, v0, v1

    const/16 v1, 0xd

    const-string/jumbo v2, "\\r"

    aput-object v2, v0, v1

    const/16 v1, 0xc

    const-string/jumbo v2, "\\f"

    aput-object v2, v0, v1

    return-void
.end method

.method constructor <init>(Lej/f;)V
    .locals 1

    invoke-direct {p0}, LY6/o;-><init>()V

    const-string v0, ":"

    iput-object v0, p0, LY6/n;->k:Ljava/lang/String;

    if-eqz p1, :cond_0

    iput-object p1, p0, LY6/n;->j:Lej/f;

    const/4 p1, 0x6

    invoke-virtual {p0, p1}, LY6/o;->b0(I)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string/jumbo v0, "sink == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static A0(Lej/f;Ljava/lang/String;)V
    .locals 7

    sget-object v0, LY6/n;->m:[Ljava/lang/String;

    const/16 v1, 0x22

    invoke-interface {p0, v1}, Lej/f;->u(I)Lej/f;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v3, v2, :cond_5

    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x80

    if-ge v5, v6, :cond_0

    aget-object v5, v0, v5

    if-nez v5, :cond_2

    goto :goto_2

    :cond_0
    const/16 v6, 0x2028

    if-ne v5, v6, :cond_1

    const-string/jumbo v5, "\\u2028"

    goto :goto_1

    :cond_1
    const/16 v6, 0x2029

    if-ne v5, v6, :cond_4

    const-string/jumbo v5, "\\u2029"

    :cond_2
    :goto_1
    if-ge v4, v3, :cond_3

    invoke-interface {p0, p1, v4, v3}, Lej/f;->H(Ljava/lang/String;II)Lej/f;

    :cond_3
    invoke-interface {p0, v5}, Lej/f;->F(Ljava/lang/String;)Lej/f;

    add-int/lit8 v4, v3, 0x1

    :cond_4
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    if-ge v4, v2, :cond_6

    invoke-interface {p0, p1, v4, v2}, Lej/f;->H(Ljava/lang/String;II)Lej/f;

    :cond_6
    invoke-interface {p0, v1}, Lej/f;->u(I)Lej/f;

    return-void
.end method

.method private B0()V
    .locals 2

    iget-object v0, p0, LY6/n;->l:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-direct {p0}, LY6/n;->v0()V

    iget-object v0, p0, LY6/n;->j:Lej/f;

    iget-object v1, p0, LY6/n;->l:Ljava/lang/String;

    invoke-static {v0, v1}, LY6/n;->A0(Lej/f;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-object v0, p0, LY6/n;->l:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method static synthetic u0(LY6/n;)Lej/f;
    .locals 0

    iget-object p0, p0, LY6/n;->j:Lej/f;

    return-object p0
.end method

.method private v0()V
    .locals 2

    invoke-virtual {p0}, LY6/o;->T()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LY6/n;->j:Lej/f;

    const/16 v1, 0x2c

    invoke-interface {v0, v1}, Lej/f;->u(I)Lej/f;

    goto :goto_0

    :cond_0
    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    :goto_0
    invoke-direct {p0}, LY6/n;->y0()V

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, LY6/o;->d0(I)V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "Nesting problem."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private w0()V
    .locals 3

    invoke-virtual {p0}, LY6/o;->T()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-eq v0, v1, :cond_5

    if-eq v0, v2, :cond_4

    const/4 v1, 0x4

    if-eq v0, v1, :cond_3

    const/16 v1, 0x9

    if-eq v0, v1, :cond_2

    const/4 v1, 0x6

    const/4 v2, 0x7

    if-eq v0, v1, :cond_6

    if-ne v0, v2, :cond_1

    iget-boolean v0, p0, LY6/o;->f:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "JSON must have only one top-level value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "Nesting problem."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "Sink from valueSink() was not closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    iget-object v0, p0, LY6/n;->j:Lej/f;

    iget-object v1, p0, LY6/n;->k:Ljava/lang/String;

    invoke-interface {v0, v1}, Lej/f;->F(Ljava/lang/String;)Lej/f;

    const/4 v2, 0x5

    goto :goto_0

    :cond_4
    iget-object v0, p0, LY6/n;->j:Lej/f;

    const/16 v1, 0x2c

    invoke-interface {v0, v1}, Lej/f;->u(I)Lej/f;

    :cond_5
    invoke-direct {p0}, LY6/n;->y0()V

    :cond_6
    :goto_0
    invoke-virtual {p0, v2}, LY6/o;->d0(I)V

    return-void
.end method

.method private x0(IIC)LY6/o;
    .locals 4

    invoke-virtual {p0}, LY6/o;->T()I

    move-result v0

    if-eq v0, p2, :cond_1

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo p2, "Nesting problem."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object p1, p0, LY6/n;->l:Ljava/lang/String;

    if-nez p1, :cond_4

    iget p1, p0, LY6/o;->a:I

    iget v1, p0, LY6/o;->i:I

    not-int v2, v1

    if-ne p1, v2, :cond_2

    not-int p1, v1

    iput p1, p0, LY6/o;->i:I

    return-object p0

    :cond_2
    add-int/lit8 v1, p1, -0x1

    iput v1, p0, LY6/o;->a:I

    iget-object v2, p0, LY6/o;->c:[Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v3, v2, v1

    iget-object v1, p0, LY6/o;->d:[I

    add-int/lit8 p1, p1, -0x2

    aget v2, v1, p1

    add-int/lit8 v2, v2, 0x1

    aput v2, v1, p1

    if-ne v0, p2, :cond_3

    invoke-direct {p0}, LY6/n;->y0()V

    :cond_3
    iget-object p1, p0, LY6/n;->j:Lej/f;

    invoke-interface {p1, p3}, Lej/f;->u(I)Lej/f;

    return-object p0

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Dangling name: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, LY6/n;->l:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private y0()V
    .locals 4

    iget-object v0, p0, LY6/o;->e:Ljava/lang/String;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LY6/n;->j:Lej/f;

    const/16 v1, 0xa

    invoke-interface {v0, v1}, Lej/f;->u(I)Lej/f;

    iget v0, p0, LY6/o;->a:I

    const/4 v1, 0x1

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, LY6/n;->j:Lej/f;

    iget-object v3, p0, LY6/o;->e:Ljava/lang/String;

    invoke-interface {v2, v3}, Lej/f;->F(Ljava/lang/String;)Lej/f;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private z0(IIC)LY6/o;
    .locals 4

    iget v0, p0, LY6/o;->a:I

    iget v1, p0, LY6/o;->i:I

    if-ne v0, v1, :cond_1

    iget-object v2, p0, LY6/o;->b:[I

    add-int/lit8 v3, v0, -0x1

    aget v3, v2, v3

    if-eq v3, p1, :cond_0

    add-int/lit8 v0, v0, -0x1

    aget v0, v2, v0

    if-ne v0, p2, :cond_1

    :cond_0
    not-int p1, v1

    iput p1, p0, LY6/o;->i:I

    return-object p0

    :cond_1
    invoke-direct {p0}, LY6/n;->w0()V

    invoke-virtual {p0}, LY6/o;->j()Z

    invoke-virtual {p0, p1}, LY6/o;->b0(I)V

    iget-object p1, p0, LY6/o;->d:[I

    iget p2, p0, LY6/o;->a:I

    add-int/lit8 p2, p2, -0x1

    const/4 v0, 0x0

    aput v0, p1, p2

    iget-object p1, p0, LY6/n;->j:Lej/f;

    invoke-interface {p1, p3}, Lej/f;->u(I)Lej/f;

    return-object p0
.end method


# virtual methods
.method public J(Ljava/lang/String;)LY6/o;
    .locals 2

    if-eqz p1, :cond_3

    iget v0, p0, LY6/o;->a:I

    if-eqz v0, :cond_2

    invoke-virtual {p0}, LY6/o;->T()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    :cond_0
    iget-object v0, p0, LY6/n;->l:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-boolean v0, p0, LY6/o;->h:Z

    if-nez v0, :cond_1

    iput-object p1, p0, LY6/n;->l:Ljava/lang/String;

    iget-object v0, p0, LY6/o;->c:[Ljava/lang/String;

    iget v1, p0, LY6/o;->a:I

    add-int/lit8 v1, v1, -0x1

    aput-object p1, v0, v1

    return-object p0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "Nesting problem."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "JsonWriter is closed."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string/jumbo v0, "name == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public P()LY6/o;
    .locals 3

    iget-boolean v0, p0, LY6/o;->h:Z

    if-nez v0, :cond_2

    iget-object v0, p0, LY6/n;->l:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-boolean v0, p0, LY6/o;->g:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, LY6/n;->B0()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, LY6/n;->l:Ljava/lang/String;

    return-object p0

    :cond_1
    :goto_0
    invoke-direct {p0}, LY6/n;->w0()V

    iget-object v0, p0, LY6/n;->j:Lej/f;

    const-string/jumbo v1, "null"

    invoke-interface {v0, v1}, Lej/f;->F(Ljava/lang/String;)Lej/f;

    iget-object v0, p0, LY6/o;->d:[I

    iget v1, p0, LY6/o;->a:I

    add-int/lit8 v1, v1, -0x1

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    return-object p0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "null cannot be used as a map key in JSON at path "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LY6/o;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a()LY6/o;
    .locals 3

    iget-boolean v0, p0, LY6/o;->h:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, LY6/n;->B0()V

    const/4 v0, 0x2

    const/16 v1, 0x5b

    const/4 v2, 0x1

    invoke-direct {p0, v2, v0, v1}, LY6/n;->z0(IIC)LY6/o;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Array cannot be used as a map key in JSON at path "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LY6/o;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public close()V
    .locals 3

    iget-object v0, p0, LY6/n;->j:Lej/f;

    invoke-interface {v0}, Lej/B;->close()V

    iget v0, p0, LY6/o;->a:I

    const/4 v1, 0x1

    if-gt v0, v1, :cond_1

    if-ne v0, v1, :cond_0

    iget-object v2, p0, LY6/o;->b:[I

    sub-int/2addr v0, v1

    aget v0, v2, v0

    const/4 v1, 0x7

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x0

    iput v0, p0, LY6/o;->a:I

    return-void

    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string/jumbo v1, "Incomplete document"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public flush()V
    .locals 2

    iget v0, p0, LY6/o;->a:I

    if-eqz v0, :cond_0

    iget-object v0, p0, LY6/n;->j:Lej/f;

    invoke-interface {v0}, Lej/f;->flush()V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "JsonWriter is closed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public h()LY6/o;
    .locals 3

    iget-boolean v0, p0, LY6/o;->h:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, LY6/n;->B0()V

    const/4 v0, 0x5

    const/16 v1, 0x7b

    const/4 v2, 0x3

    invoke-direct {p0, v2, v0, v1}, LY6/n;->z0(IIC)LY6/o;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Object cannot be used as a map key in JSON at path "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LY6/o;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public n0(D)LY6/o;
    .locals 3

    iget-boolean v0, p0, LY6/o;->f:Z

    if-nez v0, :cond_1

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1, p2}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Numeric values must be finite, but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-boolean v0, p0, LY6/o;->h:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    iput-boolean v0, p0, LY6/o;->h:Z

    invoke-static {p1, p2}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LY6/n;->J(Ljava/lang/String;)LY6/o;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-direct {p0}, LY6/n;->B0()V

    invoke-direct {p0}, LY6/n;->w0()V

    iget-object v0, p0, LY6/n;->j:Lej/f;

    invoke-static {p1, p2}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lej/f;->F(Ljava/lang/String;)Lej/f;

    iget-object p1, p0, LY6/o;->d:[I

    iget p2, p0, LY6/o;->a:I

    add-int/lit8 p2, p2, -0x1

    aget v0, p1, p2

    add-int/lit8 v0, v0, 0x1

    aput v0, p1, p2

    return-object p0
.end method

.method public o0(J)LY6/o;
    .locals 1

    iget-boolean v0, p0, LY6/o;->h:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, LY6/o;->h:Z

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LY6/n;->J(Ljava/lang/String;)LY6/o;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0}, LY6/n;->B0()V

    invoke-direct {p0}, LY6/n;->w0()V

    iget-object v0, p0, LY6/n;->j:Lej/f;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lej/f;->F(Ljava/lang/String;)Lej/f;

    iget-object p1, p0, LY6/o;->d:[I

    iget p2, p0, LY6/o;->a:I

    add-int/lit8 p2, p2, -0x1

    aget v0, p1, p2

    add-int/lit8 v0, v0, 0x1

    aput v0, p1, p2

    return-object p0
.end method

.method public p()LY6/o;
    .locals 3

    const/4 v0, 0x2

    const/16 v1, 0x5d

    const/4 v2, 0x1

    invoke-direct {p0, v2, v0, v1}, LY6/n;->x0(IIC)LY6/o;

    move-result-object v0

    return-object v0
.end method

.method public q0(Ljava/lang/Number;)LY6/o;
    .locals 3

    if-nez p1, :cond_0

    invoke-virtual {p0}, LY6/n;->P()LY6/o;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, p0, LY6/o;->f:Z

    if-nez v1, :cond_2

    const-string v1, "-Infinity"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string/jumbo v1, "Infinity"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string/jumbo v1, "NaN"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Numeric values must be finite, but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    iget-boolean p1, p0, LY6/o;->h:Z

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    iput-boolean p1, p0, LY6/o;->h:Z

    invoke-virtual {p0, v0}, LY6/n;->J(Ljava/lang/String;)LY6/o;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-direct {p0}, LY6/n;->B0()V

    invoke-direct {p0}, LY6/n;->w0()V

    iget-object p1, p0, LY6/n;->j:Lej/f;

    invoke-interface {p1, v0}, Lej/f;->F(Ljava/lang/String;)Lej/f;

    iget-object p1, p0, LY6/o;->d:[I

    iget v0, p0, LY6/o;->a:I

    add-int/lit8 v0, v0, -0x1

    aget v1, p1, v0

    add-int/lit8 v1, v1, 0x1

    aput v1, p1, v0

    return-object p0
.end method

.method public r0(Ljava/lang/String;)LY6/o;
    .locals 2

    if-nez p1, :cond_0

    invoke-virtual {p0}, LY6/n;->P()LY6/o;

    move-result-object p1

    return-object p1

    :cond_0
    iget-boolean v0, p0, LY6/o;->h:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, LY6/o;->h:Z

    invoke-virtual {p0, p1}, LY6/n;->J(Ljava/lang/String;)LY6/o;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-direct {p0}, LY6/n;->B0()V

    invoke-direct {p0}, LY6/n;->w0()V

    iget-object v0, p0, LY6/n;->j:Lej/f;

    invoke-static {v0, p1}, LY6/n;->A0(Lej/f;Ljava/lang/String;)V

    iget-object p1, p0, LY6/o;->d:[I

    iget v0, p0, LY6/o;->a:I

    add-int/lit8 v0, v0, -0x1

    aget v1, p1, v0

    add-int/lit8 v1, v1, 0x1

    aput v1, p1, v0

    return-object p0
.end method

.method public s0(Z)LY6/o;
    .locals 2

    iget-boolean v0, p0, LY6/o;->h:Z

    if-nez v0, :cond_1

    invoke-direct {p0}, LY6/n;->B0()V

    invoke-direct {p0}, LY6/n;->w0()V

    iget-object v0, p0, LY6/n;->j:Lej/f;

    if-eqz p1, :cond_0

    const-string/jumbo p1, "true"

    goto :goto_0

    :cond_0
    const-string/jumbo p1, "false"

    :goto_0
    invoke-interface {v0, p1}, Lej/f;->F(Ljava/lang/String;)Lej/f;

    iget-object p1, p0, LY6/o;->d:[I

    iget v0, p0, LY6/o;->a:I

    add-int/lit8 v0, v0, -0x1

    aget v1, p1, v0

    add-int/lit8 v1, v1, 0x1

    aput v1, p1, v0

    return-object p0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Boolean cannot be used as a map key in JSON at path "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LY6/o;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public t0()Lej/f;
    .locals 3

    iget-boolean v0, p0, LY6/o;->h:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, LY6/n;->B0()V

    invoke-direct {p0}, LY6/n;->w0()V

    const/16 v0, 0x9

    invoke-virtual {p0, v0}, LY6/o;->b0(I)V

    new-instance v0, LY6/n$a;

    invoke-direct {v0, p0}, LY6/n$a;-><init>(LY6/n;)V

    invoke-static {v0}, Lej/p;->c(Lej/B;)Lej/f;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "BufferedSink cannot be used as a map key in JSON at path "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LY6/o;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public v()LY6/o;
    .locals 3

    const/4 v0, 0x0

    iput-boolean v0, p0, LY6/o;->h:Z

    const/4 v0, 0x5

    const/16 v1, 0x7d

    const/4 v2, 0x3

    invoke-direct {p0, v2, v0, v1}, LY6/n;->x0(IIC)LY6/o;

    move-result-object v0

    return-object v0
.end method
