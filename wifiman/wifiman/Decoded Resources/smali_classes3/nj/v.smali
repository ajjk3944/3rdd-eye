.class public Lnj/v;
.super Ljava/io/InputStream;
.source "SourceFile"


# instance fields
.field private a:[B

.field private b:I

.field private c:I

.field private d:[B

.field private e:I

.field private f:I

.field private g:I


# direct methods
.method public constructor <init>([BII[BII)V
    .locals 1

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lnj/v;->g:I

    invoke-virtual {p1}, [B->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    iput-object p1, p0, Lnj/v;->a:[B

    invoke-virtual {p4}, [B->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    iput-object p1, p0, Lnj/v;->d:[B

    iput p2, p0, Lnj/v;->b:I

    iput p5, p0, Lnj/v;->e:I

    iput p3, p0, Lnj/v;->c:I

    iput p6, p0, Lnj/v;->f:I

    return-void
.end method


# virtual methods
.method public read()I
    .locals 4

    iget v0, p0, Lnj/v;->g:I

    iget v1, p0, Lnj/v;->c:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lnj/v;->a:[B

    iget v2, p0, Lnj/v;->b:I

    add-int/2addr v2, v0

    aget-byte v1, v1, v2

    goto :goto_0

    :cond_0
    iget v2, p0, Lnj/v;->f:I

    add-int/2addr v2, v1

    if-ge v0, v2, :cond_2

    iget-object v2, p0, Lnj/v;->d:[B

    iget v3, p0, Lnj/v;->e:I

    add-int/2addr v3, v0

    sub-int/2addr v3, v1

    aget-byte v1, v2, v3

    :goto_0
    if-gez v1, :cond_1

    add-int/lit16 v1, v1, 0x100

    :cond_1
    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lnj/v;->g:I

    return v1

    :cond_2
    const/4 v0, -0x1

    return v0
.end method
