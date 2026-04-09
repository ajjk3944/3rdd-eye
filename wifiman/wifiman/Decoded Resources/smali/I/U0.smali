.class public final LI/U0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/CharSequence;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI/U0$a;
    }
.end annotation


# static fields
.field public static final e:LI/U0$a;

.field public static final f:I


# instance fields
.field private a:Ljava/lang/CharSequence;

.field private b:LI/W;

.field private c:I

.field private d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LI/U0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LI/U0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LI/U0;->e:LI/U0$a;

    const/16 v0, 0x8

    sput v0, LI/U0;->f:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI/U0;->a:Ljava/lang/CharSequence;

    const/4 p1, -0x1

    iput p1, p0, LI/U0;->c:I

    iput p1, p0, LI/U0;->d:I

    return-void
.end method

.method public static synthetic d(LI/U0;IILjava/lang/CharSequence;IIILjava/lang/Object;)V
    .locals 6

    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_0

    const/4 p4, 0x0

    :cond_0
    move v4, p4

    and-int/lit8 p4, p6, 0x10

    if-eqz p4, :cond_1

    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result p5

    :cond_1
    move v5, p5

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    invoke-virtual/range {v0 .. v5}, LI/U0;->c(IILjava/lang/CharSequence;II)V

    return-void
.end method


# virtual methods
.method public a(I)C
    .locals 4

    iget-object v0, p0, LI/U0;->b:LI/W;

    if-nez v0, :cond_0

    iget-object v0, p0, LI/U0;->a:Ljava/lang/CharSequence;

    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    return p1

    :cond_0
    iget v1, p0, LI/U0;->c:I

    if-ge p1, v1, :cond_1

    iget-object v0, p0, LI/U0;->a:Ljava/lang/CharSequence;

    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    return p1

    :cond_1
    invoke-virtual {v0}, LI/W;->e()I

    move-result v1

    iget v2, p0, LI/U0;->c:I

    add-int v3, v1, v2

    if-ge p1, v3, :cond_2

    sub-int/2addr p1, v2

    invoke-virtual {v0, p1}, LI/W;->d(I)C

    move-result p1

    return p1

    :cond_2
    iget-object v0, p0, LI/U0;->a:Ljava/lang/CharSequence;

    iget v3, p0, LI/U0;->d:I

    sub-int/2addr v1, v3

    add-int/2addr v1, v2

    sub-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    return p1
.end method

.method public b()I
    .locals 4

    iget-object v0, p0, LI/U0;->b:LI/W;

    if-nez v0, :cond_0

    iget-object v0, p0, LI/U0;->a:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    return v0

    :cond_0
    iget-object v1, p0, LI/U0;->a:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    iget v2, p0, LI/U0;->d:I

    iget v3, p0, LI/U0;->c:I

    sub-int/2addr v2, v3

    sub-int/2addr v1, v2

    invoke-virtual {v0}, LI/W;->e()I

    move-result v0

    add-int/2addr v1, v0

    return v1
.end method

.method public final c(IILjava/lang/CharSequence;II)V
    .locals 8

    if-gt p1, p2, :cond_6

    if-gt p4, p5, :cond_5

    if-ltz p1, :cond_4

    if-ltz p4, :cond_3

    iget-object v0, p0, LI/U0;->b:LI/W;

    sub-int v1, p5, p4

    if-nez v0, :cond_0

    add-int/lit16 v0, v1, 0x80

    const/16 v2, 0xff

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    new-array v2, v0, [C

    const/16 v3, 0x40

    invoke-static {p1, v3}, Ljava/lang/Math;->min(II)I

    move-result v4

    iget-object v5, p0, LI/U0;->a:Ljava/lang/CharSequence;

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v5

    sub-int/2addr v5, p2

    invoke-static {v5, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    iget-object v5, p0, LI/U0;->a:Ljava/lang/CharSequence;

    sub-int v6, p1, v4

    const/4 v7, 0x0

    invoke-static {v5, v2, v7, v6, p1}, LI/n1;->a(Ljava/lang/CharSequence;[CIII)V

    iget-object p1, p0, LI/U0;->a:Ljava/lang/CharSequence;

    sub-int/2addr v0, v3

    add-int/2addr v3, p2

    invoke-static {p1, v2, v0, p2, v3}, LI/n1;->a(Ljava/lang/CharSequence;[CIII)V

    invoke-static {p3, v2, v4, p4, p5}, LI/n1;->a(Ljava/lang/CharSequence;[CIII)V

    new-instance p1, LI/W;

    add-int/2addr v4, v1

    invoke-direct {p1, v2, v4, v0}, LI/W;-><init>([CII)V

    iput-object p1, p0, LI/U0;->b:LI/W;

    iput v6, p0, LI/U0;->c:I

    iput v3, p0, LI/U0;->d:I

    return-void

    :cond_0
    iget v1, p0, LI/U0;->c:I

    sub-int v2, p1, v1

    sub-int v3, p2, v1

    if-ltz v2, :cond_2

    invoke-virtual {v0}, LI/W;->e()I

    move-result v1

    if-le v3, v1, :cond_1

    goto :goto_0

    :cond_1
    move v1, v2

    move v2, v3

    move-object v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, LI/W;->g(IILjava/lang/CharSequence;II)V

    return-void

    :cond_2
    :goto_0
    invoke-virtual {p0}, LI/U0;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LI/U0;->a:Ljava/lang/CharSequence;

    const/4 v0, 0x0

    iput-object v0, p0, LI/U0;->b:LI/W;

    const/4 v0, -0x1

    iput v0, p0, LI/U0;->c:I

    iput v0, p0, LI/U0;->d:I

    invoke-virtual/range {p0 .. p5}, LI/U0;->c(IILjava/lang/CharSequence;II)V

    return-void

    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "textStart must be non-negative, but was "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "start must be non-negative, but was "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "textStart="

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " > textEnd="

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_6
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "start="

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " > end="

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final bridge charAt(I)C
    .locals 0

    invoke-virtual {p0, p1}, LI/U0;->a(I)C

    move-result p1

    return p1
.end method

.method public final bridge length()I
    .locals 1

    invoke-virtual {p0}, LI/U0;->b()I

    move-result v0

    return v0
.end method

.method public subSequence(II)Ljava/lang/CharSequence;
    .locals 1

    invoke-virtual {p0}, LI/U0;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, LI/U0;->b:LI/W;

    if-nez v0, :cond_0

    iget-object v0, p0, LI/U0;->a:Ljava/lang/CharSequence;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, LI/U0;->a:Ljava/lang/CharSequence;

    const/4 v3, 0x0

    iget v4, p0, LI/U0;->c:I

    invoke-virtual {v1, v2, v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, LI/W;->a(Ljava/lang/StringBuilder;)V

    iget-object v0, p0, LI/U0;->a:Ljava/lang/CharSequence;

    iget v2, p0, LI/U0;->d:I

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v3

    invoke-virtual {v1, v0, v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
