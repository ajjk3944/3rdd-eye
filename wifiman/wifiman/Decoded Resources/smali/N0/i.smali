.class public final LN0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN0/i$a;
    }
.end annotation


# static fields
.field public static final e:LN0/i$a;

.field public static final f:I


# instance fields
.field private final a:Ljava/lang/CharSequence;

.field private final b:I

.field private final c:I

.field private final d:Ljava/text/BreakIterator;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LN0/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LN0/i$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LN0/i;->e:LN0/i$a;

    const/16 v0, 0x8

    sput v0, LN0/i;->f:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;IILjava/util/Locale;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN0/i;->a:Ljava/lang/CharSequence;

    if-ltz p2, :cond_1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-gt p2, v0, :cond_1

    if-ltz p3, :cond_0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-gt p3, v0, :cond_0

    invoke-static {p4}, Ljava/text/BreakIterator;->getWordInstance(Ljava/util/Locale;)Ljava/text/BreakIterator;

    move-result-object p4

    iput-object p4, p0, LN0/i;->d:Ljava/text/BreakIterator;

    add-int/lit8 v0, p2, -0x32

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, LN0/i;->b:I

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    add-int/lit8 v1, p3, 0x32

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, LN0/i;->c:I

    new-instance v0, LM0/C;

    invoke-direct {v0, p1, p2, p3}, LM0/C;-><init>(Ljava/lang/CharSequence;II)V

    invoke-virtual {p4, v0}, Ljava/text/BreakIterator;->setText(Ljava/text/CharacterIterator;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "input end index is outside the CharSequence"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "input start index is outside the CharSequence"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final a(I)V
    .locals 2

    iget v0, p0, LN0/i;->b:I

    iget v1, p0, LN0/i;->c:I

    if-gt p1, v1, :cond_0

    if-gt v0, p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid offset: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ". Valid range is ["

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p0, LN0/i;->b:I

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " , "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p0, LN0/i;->c:I

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x5d

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final b(IZ)I
    .locals 1

    invoke-direct {p0, p1}, LN0/i;->a(I)V

    invoke-direct {p0, p1}, LN0/i;->j(I)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LN0/i;->d:Ljava/text/BreakIterator;

    invoke-virtual {v0, p1}, Ljava/text/BreakIterator;->isBoundary(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, LN0/i;->h(I)Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p0, LN0/i;->d:Ljava/text/BreakIterator;

    invoke-virtual {p2, p1}, Ljava/text/BreakIterator;->preceding(I)I

    move-result p1

    :cond_1
    :goto_0
    return p1

    :cond_2
    invoke-direct {p0, p1}, LN0/i;->h(I)Z

    move-result p2

    if-eqz p2, :cond_3

    iget-object p2, p0, LN0/i;->d:Ljava/text/BreakIterator;

    invoke-virtual {p2, p1}, Ljava/text/BreakIterator;->preceding(I)I

    move-result p1

    return p1

    :cond_3
    const/4 p1, -0x1

    return p1
.end method

.method private final c(IZ)I
    .locals 1

    invoke-direct {p0, p1}, LN0/i;->a(I)V

    invoke-direct {p0, p1}, LN0/i;->h(I)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LN0/i;->d:Ljava/text/BreakIterator;

    invoke-virtual {v0, p1}, Ljava/text/BreakIterator;->isBoundary(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, LN0/i;->j(I)Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p0, LN0/i;->d:Ljava/text/BreakIterator;

    invoke-virtual {p2, p1}, Ljava/text/BreakIterator;->following(I)I

    move-result p1

    :cond_1
    :goto_0
    return p1

    :cond_2
    invoke-direct {p0, p1}, LN0/i;->j(I)Z

    move-result p2

    if-eqz p2, :cond_3

    iget-object p2, p0, LN0/i;->d:Ljava/text/BreakIterator;

    invoke-virtual {p2, p1}, Ljava/text/BreakIterator;->following(I)I

    move-result p1

    return p1

    :cond_3
    const/4 p1, -0x1

    return p1
.end method

.method private final h(I)Z
    .locals 3

    iget v0, p0, LN0/i;->b:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iget v2, p0, LN0/i;->c:I

    if-gt p1, v2, :cond_0

    if-gt v0, p1, :cond_0

    iget-object v0, p0, LN0/i;->a:Ljava/lang/CharSequence;

    invoke-static {v0, p1}, Ljava/lang/Character;->codePointBefore(Ljava/lang/CharSequence;I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Character;->isLetterOrDigit(I)Z

    move-result p1

    if-eqz p1, :cond_0

    return v1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final j(I)Z
    .locals 2

    iget v0, p0, LN0/i;->b:I

    iget v1, p0, LN0/i;->c:I

    if-ge p1, v1, :cond_0

    if-gt v0, p1, :cond_0

    iget-object v0, p0, LN0/i;->a:Ljava/lang/CharSequence;

    invoke-static {v0, p1}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Character;->isLetterOrDigit(I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final l(I)Z
    .locals 1

    invoke-virtual {p0, p1}, LN0/i;->k(I)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, LN0/i;->i(I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final m(I)Z
    .locals 1

    invoke-virtual {p0, p1}, LN0/i;->k(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, LN0/i;->i(I)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public final d(I)I
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, LN0/i;->c(IZ)I

    move-result p1

    return p1
.end method

.method public final e(I)I
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, LN0/i;->b(IZ)I

    move-result p1

    return p1
.end method

.method public final f(I)I
    .locals 1

    invoke-direct {p0, p1}, LN0/i;->a(I)V

    :goto_0
    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    invoke-direct {p0, p1}, LN0/i;->m(I)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, LN0/i;->o(I)I

    move-result p1

    goto :goto_0

    :cond_0
    return p1
.end method

.method public final g(I)I
    .locals 1

    invoke-direct {p0, p1}, LN0/i;->a(I)V

    :goto_0
    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    invoke-direct {p0, p1}, LN0/i;->l(I)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, LN0/i;->n(I)I

    move-result p1

    goto :goto_0

    :cond_0
    return p1
.end method

.method public final i(I)Z
    .locals 2

    iget v0, p0, LN0/i;->b:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, LN0/i;->c:I

    if-gt p1, v1, :cond_0

    if-gt v0, p1, :cond_0

    iget-object v0, p0, LN0/i;->a:Ljava/lang/CharSequence;

    invoke-static {v0, p1}, Ljava/lang/Character;->codePointBefore(Ljava/lang/CharSequence;I)I

    move-result p1

    sget-object v0, LN0/i;->e:LN0/i$a;

    invoke-virtual {v0, p1}, LN0/i$a;->a(I)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final k(I)Z
    .locals 2

    iget v0, p0, LN0/i;->b:I

    iget v1, p0, LN0/i;->c:I

    if-ge p1, v1, :cond_0

    if-gt v0, p1, :cond_0

    iget-object v0, p0, LN0/i;->a:Ljava/lang/CharSequence;

    invoke-static {v0, p1}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result p1

    sget-object v0, LN0/i;->e:LN0/i$a;

    invoke-virtual {v0, p1}, LN0/i$a;->a(I)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final n(I)I
    .locals 1

    invoke-direct {p0, p1}, LN0/i;->a(I)V

    iget-object v0, p0, LN0/i;->d:Ljava/text/BreakIterator;

    invoke-virtual {v0, p1}, Ljava/text/BreakIterator;->following(I)I

    move-result p1

    return p1
.end method

.method public final o(I)I
    .locals 1

    invoke-direct {p0, p1}, LN0/i;->a(I)V

    iget-object v0, p0, LN0/i;->d:Ljava/text/BreakIterator;

    invoke-virtual {v0, p1}, Ljava/text/BreakIterator;->preceding(I)I

    move-result p1

    return p1
.end method
