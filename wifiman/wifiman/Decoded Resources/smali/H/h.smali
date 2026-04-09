.class public final LH/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/CharSequence;


# instance fields
.field private final a:Ljava/lang/CharSequence;

.field private final b:J

.field private final c:LL0/S;

.field private final d:LYg/s;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Ljava/lang/CharSequence;JLL0/S;LYg/s;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    instance-of v0, p1, LH/h;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LH/h;

    iget-object v0, v0, LH/h;->a:Ljava/lang/CharSequence;

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    iput-object v0, p0, LH/h;->a:Ljava/lang/CharSequence;

    .line 4
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {p2, p3, v1, v0}, LL0/T;->c(JII)J

    move-result-wide p2

    iput-wide p2, p0, LH/h;->b:J

    const/4 p2, 0x0

    if-eqz p4, :cond_1

    .line 5
    invoke-virtual {p4}, LL0/S;->r()J

    move-result-wide p3

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-static {p3, p4, v1, v0}, LL0/T;->c(JII)J

    move-result-wide p3

    invoke-static {p3, p4}, LL0/S;->b(J)LL0/S;

    move-result-object p3

    goto :goto_1

    :cond_1
    move-object p3, p2

    :goto_1
    iput-object p3, p0, LH/h;->c:LL0/S;

    if-eqz p5, :cond_2

    .line 6
    invoke-virtual {p5}, LYg/s;->j()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LL0/S;

    invoke-virtual {p3}, LL0/S;->r()J

    move-result-wide p3

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    invoke-static {p3, p4, v1, p1}, LL0/T;->c(JII)J

    move-result-wide p3

    invoke-static {p3, p4}, LL0/S;->b(J)LL0/S;

    move-result-object p1

    const/4 p3, 0x1

    invoke-static {p5, p2, p1, p3, p2}, LYg/s;->g(LYg/s;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)LYg/s;

    move-result-object p2

    :cond_2
    iput-object p2, p0, LH/h;->d:LYg/s;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/CharSequence;JLL0/S;LYg/s;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    .line 7
    const-string p1, ""

    :cond_0
    move-object v1, p1

    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    .line 8
    sget-object p1, LL0/S;->b:LL0/S$a;

    invoke-virtual {p1}, LL0/S$a;->a()J

    move-result-wide p2

    :cond_1
    move-wide v2, p2

    and-int/lit8 p1, p6, 0x4

    const/4 p2, 0x0

    if-eqz p1, :cond_2

    move-object v4, p2

    goto :goto_0

    :cond_2
    move-object v4, p4

    :goto_0
    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_3

    move-object v5, p2

    goto :goto_1

    :cond_3
    move-object v5, p5

    :goto_1
    const/4 v6, 0x0

    move-object v0, p0

    .line 9
    invoke-direct/range {v0 .. v6}, LH/h;-><init>(Ljava/lang/CharSequence;JLL0/S;LYg/s;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/CharSequence;JLL0/S;LYg/s;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, LH/h;-><init>(Ljava/lang/CharSequence;JLL0/S;LYg/s;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/CharSequence;)Z
    .locals 1

    iget-object v0, p0, LH/h;->a:Ljava/lang/CharSequence;

    invoke-static {v0, p1}, Lkotlin/text/t;->x(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    return p1
.end method

.method public b(I)C
    .locals 1

    iget-object v0, p0, LH/h;->a:Ljava/lang/CharSequence;

    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    return p1
.end method

.method public final c()LL0/S;
    .locals 1

    iget-object v0, p0, LH/h;->c:LL0/S;

    return-object v0
.end method

.method public final bridge charAt(I)C
    .locals 0

    invoke-virtual {p0, p1}, LH/h;->b(I)C

    move-result p1

    return p1
.end method

.method public final d()LYg/s;
    .locals 1

    iget-object v0, p0, LH/h;->d:LYg/s;

    return-object v0
.end method

.method public e()I
    .locals 1

    iget-object v0, p0, LH/h;->a:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, LH/h;

    if-eq v3, v2, :cond_2

    return v1

    :cond_2
    check-cast p1, LH/h;

    iget-wide v2, p0, LH/h;->b:J

    iget-wide v4, p1, LH/h;->b:J

    invoke-static {v2, v3, v4, v5}, LL0/S;->g(JJ)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, LH/h;->c:LL0/S;

    iget-object v3, p1, LH/h;->c:LL0/S;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-object v2, p0, LH/h;->d:LYg/s;

    iget-object v3, p1, LH/h;->d:LYg/s;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    return v1

    :cond_5
    iget-object p1, p1, LH/h;->a:Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, LH/h;->a(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_6

    return v1

    :cond_6
    return v0
.end method

.method public final f()J
    .locals 2

    iget-wide v0, p0, LH/h;->b:J

    return-wide v0
.end method

.method public final g()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, LH/h;->a:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final h()Z
    .locals 1

    iget-object v0, p0, LH/h;->d:LYg/s;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 5

    iget-object v0, p0, LH/h;->a:Ljava/lang/CharSequence;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LH/h;->b:J

    invoke-static {v1, v2}, LL0/S;->o(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LH/h;->c:LL0/S;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, LL0/S;->r()J

    move-result-wide v3

    invoke-static {v3, v4}, LL0/S;->o(J)I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LH/h;->d:LYg/s;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :cond_1
    add-int/2addr v0, v2

    return v0
.end method

.method public final i([CIII)V
    .locals 1

    iget-object v0, p0, LH/h;->a:Ljava/lang/CharSequence;

    invoke-static {v0, p1, p2, p3, p4}, LI/n1;->a(Ljava/lang/CharSequence;[CIII)V

    return-void
.end method

.method public final bridge length()I
    .locals 1

    invoke-virtual {p0}, LH/h;->e()I

    move-result v0

    return v0
.end method

.method public subSequence(II)Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, LH/h;->a:Ljava/lang/CharSequence;

    invoke-interface {v0, p1, p2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LH/h;->a:Ljava/lang/CharSequence;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
