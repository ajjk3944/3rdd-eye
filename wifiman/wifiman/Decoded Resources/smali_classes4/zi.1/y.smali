.class public final Lzi/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzi/j;
.implements Lzi/e;


# instance fields
.field private final a:Lzi/j;

.field private final b:I

.field private final c:I


# direct methods
.method public constructor <init>(Lzi/j;II)V
    .locals 1

    const-string v0, "sequence"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzi/y;->a:Lzi/j;

    iput p2, p0, Lzi/y;->b:I

    iput p3, p0, Lzi/y;->c:I

    if-ltz p2, :cond_2

    if-ltz p3, :cond_1

    if-lt p3, p2, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "endIndex should be not less than startIndex, but was "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " < "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "endIndex should be non-negative, but is "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "startIndex should be non-negative, but is "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static final synthetic c(Lzi/y;)I
    .locals 0

    iget p0, p0, Lzi/y;->c:I

    return p0
.end method

.method public static final synthetic d(Lzi/y;)Lzi/j;
    .locals 0

    iget-object p0, p0, Lzi/y;->a:Lzi/j;

    return-object p0
.end method

.method public static final synthetic e(Lzi/y;)I
    .locals 0

    iget p0, p0, Lzi/y;->b:I

    return p0
.end method

.method private final f()I
    .locals 2

    iget v0, p0, Lzi/y;->c:I

    iget v1, p0, Lzi/y;->b:I

    sub-int/2addr v0, v1

    return v0
.end method


# virtual methods
.method public a(I)Lzi/j;
    .locals 3

    invoke-direct {p0}, Lzi/y;->f()I

    move-result v0

    if-lt p1, v0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    new-instance v0, Lzi/y;

    iget-object v1, p0, Lzi/y;->a:Lzi/j;

    iget v2, p0, Lzi/y;->b:I

    add-int/2addr p1, v2

    invoke-direct {v0, v1, v2, p1}, Lzi/y;-><init>(Lzi/j;II)V

    :goto_0
    return-object v0
.end method

.method public b(I)Lzi/j;
    .locals 3

    invoke-direct {p0}, Lzi/y;->f()I

    move-result v0

    if-lt p1, v0, :cond_0

    invoke-static {}, Lzi/m;->i()Lzi/j;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance v0, Lzi/y;

    iget-object v1, p0, Lzi/y;->a:Lzi/j;

    iget v2, p0, Lzi/y;->b:I

    add-int/2addr v2, p1

    iget p1, p0, Lzi/y;->c:I

    invoke-direct {v0, v1, v2, p1}, Lzi/y;-><init>(Lzi/j;II)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lzi/y$a;

    invoke-direct {v0, p0}, Lzi/y$a;-><init>(Lzi/y;)V

    return-object v0
.end method
