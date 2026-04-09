.class public final LI/I;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI/I$a;
    }
.end annotation


# static fields
.field public static final h:LI/I$a;

.field public static final i:I


# instance fields
.field private final a:LI/U0;

.field private final b:LI/m;

.field private c:I

.field private d:I

.field private e:LYg/s;

.field private f:I

.field private g:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LI/I$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LI/I$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LI/I;->h:LI/I$a;

    const/16 v0, 0x8

    sput v0, LI/I;->i:I

    return-void
.end method

.method private constructor <init>(LL0/d;J)V
    .locals 2

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, LI/U0;

    invoke-virtual {p1}, LL0/d;->k()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, LI/U0;-><init>(Ljava/lang/CharSequence;)V

    iput-object v0, p0, LI/I;->a:LI/U0;

    .line 5
    new-instance p1, LI/m;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1, v0}, LI/m;-><init>(LI/m;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, LI/I;->b:LI/m;

    .line 6
    invoke-static {p2, p3}, LL0/S;->n(J)I

    move-result p1

    iput p1, p0, LI/I;->c:I

    .line 7
    invoke-static {p2, p3}, LL0/S;->i(J)I

    move-result p1

    iput p1, p0, LI/I;->d:I

    const/4 p1, -0x1

    .line 8
    iput p1, p0, LI/I;->f:I

    .line 9
    iput p1, p0, LI/I;->g:I

    .line 10
    invoke-static {p2, p3}, LL0/S;->n(J)I

    move-result p1

    invoke-static {p2, p3}, LL0/S;->i(J)I

    move-result p2

    invoke-direct {p0, p1, p2}, LI/I;->a(II)V

    return-void
.end method

.method public synthetic constructor <init>(LL0/d;JLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, LI/I;-><init>(LL0/d;J)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;J)V
    .locals 7

    .line 11
    new-instance v6, LL0/d;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, LL0/d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 p1, 0x0

    invoke-direct {p0, v6, p2, p3, p1}, LI/I;-><init>(LL0/d;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, LI/I;-><init>(Ljava/lang/String;J)V

    return-void
.end method

.method private final a(II)V
    .locals 3

    const-string v0, ") offset is outside of text region "

    if-ltz p1, :cond_1

    iget-object v1, p0, LI/I;->a:LI/U0;

    invoke-virtual {v1}, LI/U0;->length()I

    move-result v1

    if-gt p1, v1, :cond_1

    if-ltz p2, :cond_0

    iget-object p1, p0, LI/I;->a:LI/U0;

    invoke-virtual {p1}, LI/U0;->length()I

    move-result p1

    if-gt p2, p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "end ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, LI/I;->a:LI/U0;

    invoke-virtual {p2}, LI/U0;->length()I

    move-result p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "start ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, LI/I;->a:LI/U0;

    invoke-virtual {p1}, LI/U0;->length()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private final v(I)V
    .locals 2

    if-ltz p1, :cond_0

    iput p1, p0, LI/I;->d:I

    const/4 p1, 0x0

    iput-object p1, p0, LI/I;->e:LYg/s;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot set selectionEnd to a negative value: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final w(I)V
    .locals 2

    if-ltz p1, :cond_0

    iput p1, p0, LI/I;->c:I

    const/4 p1, 0x0

    iput-object p1, p0, LI/I;->e:LYg/s;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot set selectionStart to a negative value: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final b()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LI/I;->e:LYg/s;

    return-void
.end method

.method public final c()V
    .locals 1

    const/4 v0, -0x1

    iput v0, p0, LI/I;->f:I

    iput v0, p0, LI/I;->g:I

    return-void
.end method

.method public final d(II)V
    .locals 12

    invoke-direct {p0, p1, p2}, LI/I;->a(II)V

    invoke-static {p1, p2}, LL0/T;->b(II)J

    move-result-wide v0

    iget-object v2, p0, LI/I;->b:LI/m;

    const/4 v3, 0x0

    invoke-virtual {v2, p1, p2, v3}, LI/m;->f(III)V

    iget-object v4, p0, LI/I;->a:LI/U0;

    invoke-static {v0, v1}, LL0/S;->l(J)I

    move-result v5

    invoke-static {v0, v1}, LL0/S;->k(J)I

    move-result v6

    const/16 v10, 0x18

    const/4 v11, 0x0

    const-string v7, ""

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v4 .. v11}, LI/U0;->d(LI/U0;IILjava/lang/CharSequence;IIILjava/lang/Object;)V

    iget p1, p0, LI/I;->c:I

    iget p2, p0, LI/I;->d:I

    invoke-static {p1, p2}, LL0/T;->b(II)J

    move-result-wide p1

    invoke-static {p1, p2, v0, v1}, LI/J;->a(JJ)J

    move-result-wide p1

    invoke-static {p1, p2}, LL0/S;->n(J)I

    move-result v2

    invoke-direct {p0, v2}, LI/I;->w(I)V

    invoke-static {p1, p2}, LL0/S;->i(J)I

    move-result p1

    invoke-direct {p0, p1}, LI/I;->v(I)V

    invoke-virtual {p0}, LI/I;->p()Z

    move-result p1

    if-eqz p1, :cond_1

    iget p1, p0, LI/I;->f:I

    iget p2, p0, LI/I;->g:I

    invoke-static {p1, p2}, LL0/T;->b(II)J

    move-result-wide p1

    invoke-static {p1, p2, v0, v1}, LI/J;->a(JJ)J

    move-result-wide p1

    invoke-static {p1, p2}, LL0/S;->h(J)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LI/I;->c()V

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, LL0/S;->l(J)I

    move-result v0

    iput v0, p0, LI/I;->f:I

    invoke-static {p1, p2}, LL0/S;->k(J)I

    move-result p1

    iput p1, p0, LI/I;->g:I

    :cond_1
    :goto_0
    const/4 p1, 0x0

    iput-object p1, p0, LI/I;->e:LYg/s;

    return-void
.end method

.method public final e(I)C
    .locals 1

    iget-object v0, p0, LI/I;->a:LI/U0;

    invoke-virtual {v0, p1}, LI/U0;->charAt(I)C

    move-result p1

    return p1
.end method

.method public final f()LI/m;
    .locals 1

    iget-object v0, p0, LI/I;->b:LI/m;

    return-object v0
.end method

.method public final g()LL0/S;
    .locals 2

    invoke-virtual {p0}, LI/I;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, LI/I;->f:I

    iget v1, p0, LI/I;->g:I

    invoke-static {v0, v1}, LL0/T;->b(II)J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->b(J)LL0/S;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final h()I
    .locals 1

    iget v0, p0, LI/I;->g:I

    return v0
.end method

.method public final i()I
    .locals 1

    iget v0, p0, LI/I;->f:I

    return v0
.end method

.method public final j()I
    .locals 2

    iget v0, p0, LI/I;->c:I

    iget v1, p0, LI/I;->d:I

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, -0x1

    :goto_0
    return v1
.end method

.method public final k()LYg/s;
    .locals 1

    iget-object v0, p0, LI/I;->e:LYg/s;

    return-object v0
.end method

.method public final l()I
    .locals 1

    iget-object v0, p0, LI/I;->a:LI/U0;

    invoke-virtual {v0}, LI/U0;->length()I

    move-result v0

    return v0
.end method

.method public final m()J
    .locals 2

    iget v0, p0, LI/I;->c:I

    iget v1, p0, LI/I;->d:I

    invoke-static {v0, v1}, LL0/T;->b(II)J

    move-result-wide v0

    return-wide v0
.end method

.method public final n()I
    .locals 1

    iget v0, p0, LI/I;->d:I

    return v0
.end method

.method public final o()I
    .locals 1

    iget v0, p0, LI/I;->c:I

    return v0
.end method

.method public final p()Z
    .locals 2

    iget v0, p0, LI/I;->f:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final q(IILjava/lang/CharSequence;)V
    .locals 9

    invoke-direct {p0, p1, p2}, LI/I;->a(II)V

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result v8

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result v2

    const/4 p1, 0x0

    move p2, v8

    :goto_0
    if-ge p2, v2, :cond_0

    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-ge p1, v0, :cond_0

    invoke-interface {p3, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    iget-object v1, p0, LI/I;->a:LI/U0;

    invoke-virtual {v1, p2}, LI/U0;->charAt(I)C

    move-result v1

    if-ne v0, v1, :cond_0

    add-int/lit8 p1, p1, 0x1

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v0

    move v1, v2

    :goto_1
    if-le v1, v8, :cond_1

    if-le v0, p1, :cond_1

    add-int/lit8 v3, v0, -0x1

    invoke-interface {p3, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    iget-object v4, p0, LI/I;->a:LI/U0;

    add-int/lit8 v5, v1, -0x1

    invoke-virtual {v4, v5}, LI/U0;->charAt(I)C

    move-result v4

    if-ne v3, v4, :cond_1

    add-int/lit8 v0, v0, -0x1

    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    :cond_1
    iget-object v3, p0, LI/I;->b:LI/m;

    sub-int/2addr v0, p1

    invoke-virtual {v3, p2, v1, v0}, LI/m;->f(III)V

    iget-object v0, p0, LI/I;->a:LI/U0;

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v1, v8

    move-object v3, p3

    invoke-static/range {v0 .. v7}, LI/U0;->d(LI/U0;IILjava/lang/CharSequence;IIILjava/lang/Object;)V

    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result p1

    add-int/2addr p1, v8

    invoke-direct {p0, p1}, LI/I;->w(I)V

    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result p1

    add-int/2addr v8, p1

    invoke-direct {p0, v8}, LI/I;->v(I)V

    const/4 p1, -0x1

    iput p1, p0, LI/I;->f:I

    iput p1, p0, LI/I;->g:I

    const/4 p1, 0x0

    iput-object p1, p0, LI/I;->e:LYg/s;

    return-void
.end method

.method public final r(II)V
    .locals 3

    const-string v0, ") offset is outside of text region "

    if-ltz p1, :cond_2

    iget-object v1, p0, LI/I;->a:LI/U0;

    invoke-virtual {v1}, LI/U0;->length()I

    move-result v1

    if-gt p1, v1, :cond_2

    if-ltz p2, :cond_1

    iget-object v1, p0, LI/I;->a:LI/U0;

    invoke-virtual {v1}, LI/U0;->length()I

    move-result v1

    if-gt p2, v1, :cond_1

    if-ge p1, p2, :cond_0

    iput p1, p0, LI/I;->f:I

    iput p2, p0, LI/I;->g:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Do not set reversed or empty range: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " > "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "end ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, LI/I;->a:LI/U0;

    invoke-virtual {p2}, LI/U0;->length()I

    move-result p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "start ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, LI/I;->a:LI/U0;

    invoke-virtual {p1}, LI/U0;->length()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final s(I)V
    .locals 0

    invoke-virtual {p0, p1, p1}, LI/I;->u(II)V

    return-void
.end method

.method public final t(III)V
    .locals 2

    if-ge p2, p3, :cond_0

    invoke-virtual {p0}, LI/I;->l()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {p2, v1, v0}, Lsh/m;->k(III)I

    move-result p2

    invoke-virtual {p0}, LI/I;->l()I

    move-result v0

    invoke-static {p3, v1, v0}, Lsh/m;->k(III)I

    move-result p3

    new-instance v0, LYg/s;

    invoke-static {p1}, LH/n;->c(I)LH/n;

    move-result-object p1

    invoke-static {p2, p3}, LL0/T;->b(II)J

    move-result-wide p2

    invoke-static {p2, p3}, LL0/S;->b(J)LL0/S;

    move-result-object p2

    invoke-direct {v0, p1, p2}, LYg/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, LI/I;->e:LYg/s;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Do not set reversed or empty range: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " > "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LI/I;->a:LI/U0;

    invoke-virtual {v0}, LI/U0;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(II)V
    .locals 2

    invoke-virtual {p0}, LI/I;->l()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {p1, v1, v0}, Lsh/m;->k(III)I

    move-result p1

    invoke-virtual {p0}, LI/I;->l()I

    move-result v0

    invoke-static {p2, v1, v0}, Lsh/m;->k(III)I

    move-result p2

    invoke-direct {p0, p1}, LI/I;->w(I)V

    invoke-direct {p0, p2}, LI/I;->v(I)V

    return-void
.end method
