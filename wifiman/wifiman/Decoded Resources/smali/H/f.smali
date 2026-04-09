.class public final LH/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Appendable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH/f$a;
    }
.end annotation


# instance fields
.field private final a:LH/h;

.field private final b:LI/S0;

.field private final c:LI/U0;

.field private d:LI/m;

.field private e:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LH/h;LI/m;LH/h;LI/S0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p3, p0, LH/f;->a:LH/h;

    .line 3
    iput-object p4, p0, LH/f;->b:LI/S0;

    .line 4
    new-instance p3, LI/U0;

    invoke-direct {p3, p1}, LI/U0;-><init>(Ljava/lang/CharSequence;)V

    iput-object p3, p0, LH/f;->c:LI/U0;

    if-eqz p2, :cond_0

    .line 5
    new-instance p3, LI/m;

    invoke-direct {p3, p2}, LI/m;-><init>(LI/m;)V

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    .line 6
    :goto_0
    iput-object p3, p0, LH/f;->d:LI/m;

    .line 7
    invoke-virtual {p1}, LH/h;->f()J

    move-result-wide p1

    iput-wide p1, p0, LH/f;->e:J

    return-void
.end method

.method public synthetic constructor <init>(LH/h;LI/m;LH/h;LI/S0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    move-object p3, p1

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    move-object p4, v0

    .line 8
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, LH/f;-><init>(LH/h;LI/m;LH/h;LI/S0;)V

    return-void
.end method

.method private final b()LI/m;
    .locals 3

    iget-object v0, p0, LH/f;->d:LI/m;

    if-nez v0, :cond_0

    new-instance v0, LI/m;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1, v2}, LI/m;-><init>(LI/m;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, LH/f;->d:LI/m;

    :cond_0
    return-object v0
.end method

.method private final g(III)V
    .locals 3

    invoke-direct {p0}, LH/f;->b()LI/m;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, LI/m;->f(III)V

    iget-object v0, p0, LH/f;->b:LI/S0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, LI/S0;->e(III)V

    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-virtual {p0}, LH/f;->e()J

    move-result-wide v1

    invoke-static {v1, v2}, LL0/S;->l(J)I

    move-result p2

    invoke-virtual {p0}, LH/f;->e()J

    move-result-wide v1

    invoke-static {v1, v2}, LL0/S;->k(J)I

    move-result v1

    if-ge v1, v0, :cond_1

    return-void

    :cond_1
    if-gt p2, v0, :cond_3

    if-gt p1, v1, :cond_3

    sub-int/2addr p1, v0

    sub-int/2addr p3, p1

    if-ne p2, v1, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    add-int v0, v1, p3

    goto :goto_2

    :cond_3
    if-le p2, v0, :cond_4

    if-ge v1, p1, :cond_4

    add-int/2addr v0, p3

    move p2, v0

    goto :goto_2

    :cond_4
    if-lt p2, p1, :cond_5

    sub-int/2addr p1, v0

    sub-int/2addr p3, p1

    :goto_1
    add-int/2addr p2, p3

    goto :goto_0

    :cond_5
    if-ge v0, p2, :cond_6

    add-int p2, v0, p3

    sub-int/2addr p1, v0

    sub-int/2addr p3, p1

    goto :goto_0

    :cond_6
    :goto_2
    invoke-static {p2, v0}, LL0/T;->b(II)J

    move-result-wide p1

    iput-wide p1, p0, LH/f;->e:J

    return-void
.end method

.method private final k(IZZ)V
    .locals 2

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    const/4 p2, -0x1

    :goto_0
    if-eqz p3, :cond_1

    invoke-virtual {p0}, LH/f;->d()I

    move-result p3

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, LH/f;->d()I

    move-result p3

    add-int/lit8 p3, p3, 0x1

    :goto_1
    if-gt p2, p1, :cond_2

    if-ge p1, p3, :cond_2

    return-void

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Expected "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " to be in ["

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static synthetic m(LH/f;JLL0/S;ILjava/lang/Object;)LH/h;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    invoke-virtual {p0}, LH/f;->e()J

    move-result-wide p1

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, LH/f;->l(JLL0/S;)LH/h;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, LH/f;->c:LI/U0;

    return-object v0
.end method

.method public append(C)Ljava/lang/Appendable;
    .locals 11

    .line 5
    invoke-virtual {p0}, LH/f;->d()I

    move-result v0

    invoke-virtual {p0}, LH/f;->d()I

    move-result v1

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, LH/f;->g(III)V

    .line 6
    iget-object v3, p0, LH/f;->c:LI/U0;

    invoke-virtual {v3}, LI/U0;->length()I

    move-result v4

    iget-object v0, p0, LH/f;->c:LI/U0;

    invoke-virtual {v0}, LI/U0;->length()I

    move-result v5

    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v6

    const/16 v9, 0x18

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v10}, LI/U0;->d(LI/U0;IILjava/lang/CharSequence;IIILjava/lang/Object;)V

    return-object p0
.end method

.method public append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    .locals 11

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p0}, LH/f;->d()I

    move-result v0

    invoke-virtual {p0}, LH/f;->d()I

    move-result v1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    invoke-direct {p0, v0, v1, v2}, LH/f;->g(III)V

    .line 2
    iget-object v3, p0, LH/f;->c:LI/U0;

    invoke-virtual {v3}, LI/U0;->length()I

    move-result v4

    iget-object v0, p0, LH/f;->c:LI/U0;

    invoke-virtual {v0}, LI/U0;->length()I

    move-result v5

    const/16 v9, 0x18

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v6, p1

    invoke-static/range {v3 .. v10}, LI/U0;->d(LI/U0;IILjava/lang/CharSequence;IIILjava/lang/Object;)V

    :cond_0
    return-object p0
.end method

.method public append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;
    .locals 11

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, LH/f;->d()I

    move-result v0

    invoke-virtual {p0}, LH/f;->d()I

    move-result v1

    sub-int v2, p3, p2

    invoke-direct {p0, v0, v1, v2}, LH/f;->g(III)V

    .line 4
    iget-object v3, p0, LH/f;->c:LI/U0;

    invoke-virtual {v3}, LI/U0;->length()I

    move-result v4

    iget-object v0, p0, LH/f;->c:LI/U0;

    invoke-virtual {v0}, LI/U0;->length()I

    move-result v5

    invoke-interface {p1, p2, p3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v6

    const/16 v9, 0x18

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v10}, LI/U0;->d(LI/U0;IILjava/lang/CharSequence;IIILjava/lang/Object;)V

    :cond_0
    return-object p0
.end method

.method public final c()LH/f$a;
    .locals 1

    invoke-direct {p0}, LH/f;->b()LI/m;

    move-result-object v0

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget-object v0, p0, LH/f;->c:LI/U0;

    invoke-virtual {v0}, LI/U0;->length()I

    move-result v0

    return v0
.end method

.method public final e()J
    .locals 2

    iget-wide v0, p0, LH/f;->e:J

    return-wide v0
.end method

.method public final f()Z
    .locals 2

    invoke-virtual {p0}, LH/f;->e()J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->h(J)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final h(I)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, LH/f;->k(IZZ)V

    invoke-static {p1}, LL0/T;->a(I)J

    move-result-wide v0

    iput-wide v0, p0, LH/f;->e:J

    return-void
.end method

.method public final i(IILjava/lang/CharSequence;)V
    .locals 6

    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v5

    const/4 v4, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    invoke-virtual/range {v0 .. v5}, LH/f;->j(IILjava/lang/CharSequence;II)V

    return-void
.end method

.method public final j(IILjava/lang/CharSequence;II)V
    .locals 7

    if-gt p1, p2, :cond_1

    if-gt p4, p5, :cond_0

    sub-int v0, p5, p4

    invoke-direct {p0, p1, p2, v0}, LH/f;->g(III)V

    iget-object v1, p0, LH/f;->c:LI/U0;

    move v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    invoke-virtual/range {v1 .. v6}, LI/U0;->c(IILjava/lang/CharSequence;II)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Expected textStart="

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " <= textEnd="

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Expected start="

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " <= end="

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

.method public final l(JLL0/S;)LH/h;
    .locals 9

    new-instance v8, LH/h;

    iget-object v0, p0, LH/f;->c:LI/U0;

    invoke-virtual {v0}, LI/U0;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v0, v8

    move-wide v2, p1

    move-object v4, p3

    invoke-direct/range {v0 .. v7}, LH/h;-><init>(Ljava/lang/CharSequence;JLL0/S;LYg/s;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v8
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LH/f;->c:LI/U0;

    invoke-virtual {v0}, LI/U0;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
