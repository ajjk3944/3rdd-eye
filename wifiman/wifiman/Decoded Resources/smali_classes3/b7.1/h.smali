.class public Lb7/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field private static final g:Ljava/lang/Byte;

.field private static final h:Ljava/lang/Byte;

.field private static final i:Ljava/lang/Byte;

.field private static final j:Lej/h;

.field private static final k:Lej/h;

.field private static final l:Lej/h;

.field private static final m:Lej/h;

.field private static final n:Lej/h;

.field private static final o:Lej/h;


# instance fields
.field private final a:Lej/f;

.field private b:Z

.field private c:[I

.field private d:I

.field private e:[Ljava/lang/String;

.field private f:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x22

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    sput-object v0, Lb7/h;->g:Ljava/lang/Byte;

    const/16 v0, 0x3c

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    sput-object v0, Lb7/h;->h:Ljava/lang/Byte;

    const/16 v0, 0x3e

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    sput-object v0, Lb7/h;->i:Ljava/lang/Byte;

    const-string v0, "</"

    invoke-static {v0}, Lej/h;->j(Ljava/lang/String;)Lej/h;

    move-result-object v0

    sput-object v0, Lb7/h;->j:Lej/h;

    const-string v0, "/>"

    invoke-static {v0}, Lej/h;->j(Ljava/lang/String;)Lej/h;

    move-result-object v0

    sput-object v0, Lb7/h;->k:Lej/h;

    const-string v0, "=\""

    invoke-static {v0}, Lej/h;->j(Ljava/lang/String;)Lej/h;

    move-result-object v0

    sput-object v0, Lb7/h;->l:Lej/h;

    const-string v0, "<![CDATA["

    invoke-static {v0}, Lej/h;->j(Ljava/lang/String;)Lej/h;

    move-result-object v0

    sput-object v0, Lb7/h;->m:Lej/h;

    const-string/jumbo v0, "]]>"

    invoke-static {v0}, Lej/h;->j(Ljava/lang/String;)Lej/h;

    move-result-object v0

    sput-object v0, Lb7/h;->n:Lej/h;

    const-string v0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"

    invoke-static {v0}, Lej/h;->j(Ljava/lang/String;)Lej/h;

    move-result-object v0

    sput-object v0, Lb7/h;->o:Lej/h;

    return-void
.end method

.method private constructor <init>(Lej/f;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lb7/h;->b:Z

    const/16 v1, 0x20

    new-array v2, v1, [I

    iput-object v2, p0, Lb7/h;->c:[I

    new-array v3, v1, [Ljava/lang/String;

    iput-object v3, p0, Lb7/h;->e:[Ljava/lang/String;

    new-array v1, v1, [I

    iput-object v1, p0, Lb7/h;->f:[I

    const/4 v1, 0x1

    iput v1, p0, Lb7/h;->d:I

    aput v0, v2, v0

    if-eqz p1, :cond_0

    iput-object p1, p0, Lb7/h;->a:Lej/f;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string/jumbo v0, "sink == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static a(Lej/f;)Lb7/h;
    .locals 1

    new-instance v0, Lb7/h;

    invoke-direct {v0, p0}, Lb7/h;-><init>(Lej/f;)V

    return-object v0
.end method

.method private g()I
    .locals 2

    iget v0, p0, Lb7/h;->d:I

    if-eqz v0, :cond_0

    iget-object v1, p0, Lb7/h;->c:[I

    add-int/lit8 v0, v0, -0x1

    aget v0, v1, v0

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "XML Writer is closed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private h(Ljava/lang/String;)Ljava/io/IOException;
    .locals 5

    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " at path "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p0, Lb7/h;->d:I

    iget-object v2, p0, Lb7/h;->c:[I

    iget-object v3, p0, Lb7/h;->e:[Ljava/lang/String;

    iget-object v4, p0, Lb7/h;->f:[I

    invoke-static {p1, v2, v3, v4}, Lb7/g;->a(I[I[Ljava/lang/String;[I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public close()V
    .locals 6

    iget-object v0, p0, Lb7/h;->a:Lej/f;

    invoke-interface {v0}, Lej/B;->close()V

    iget v0, p0, Lb7/h;->d:I

    const/4 v1, 0x1

    if-gt v0, v1, :cond_1

    if-ne v0, v1, :cond_0

    iget-object v2, p0, Lb7/h;->c:[I

    sub-int/2addr v0, v1

    aget v0, v2, v0

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lb7/h;->d:I

    return-void

    :cond_1
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Incomplete document. Abrupt end at "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lb7/h;->d:I

    iget-object v3, p0, Lb7/h;->c:[I

    iget-object v4, p0, Lb7/h;->e:[Ljava/lang/String;

    iget-object v5, p0, Lb7/h;->f:[I

    invoke-static {v2, v3, v4, v5}, Lb7/g;->a(I[I[Ljava/lang/String;[I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " in scope "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lb7/h;->d:I

    iget-object v3, p0, Lb7/h;->c:[I

    invoke-static {v2, v3}, Lb7/g;->b(I[I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public j()Lb7/h;
    .locals 3

    iget-boolean v0, p0, Lb7/h;->b:Z

    if-nez v0, :cond_1

    invoke-direct {p0}, Lb7/h;->g()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lb7/h;->a:Lej/f;

    sget-object v1, Lb7/h;->o:Lej/h;

    invoke-interface {v0, v1}, Lej/f;->R(Lej/h;)Lej/f;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lb7/h;->b:Z

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "Xml Declatraion "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Lb7/h;->o:Lej/h;

    invoke-virtual {v1}, Lej/h;->q0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " can only be written at the beginning of a xml document! You are not at the beginning of a xml document: current xml scope is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lb7/h;->d:I

    iget-object v2, p0, Lb7/h;->c:[I

    invoke-static {v1, v2}, Lb7/g;->b(I[I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lb7/h;->h(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    :cond_1
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Xml declaration "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lb7/h;->o:Lej/h;

    invoke-virtual {v2}, Lej/h;->q0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " has already been written in this xml document. Xml declaration can only be written once at the beginning of the document."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
