.class final LN/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN/d;


# instance fields
.field private final a:J

.field private final b:J

.field private final c:J

.field private final d:J


# direct methods
.method private constructor <init>(JJJJ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, LN/u;->a:J

    .line 4
    iput-wide p3, p0, LN/u;->b:J

    .line 5
    iput-wide p5, p0, LN/u;->c:J

    .line 6
    iput-wide p7, p0, LN/u;->d:J

    return-void
.end method

.method public synthetic constructor <init>(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p8}, LN/u;-><init>(JJJJ)V

    return-void
.end method


# virtual methods
.method public a(ZLT/l;I)LT/z1;
    .locals 3

    const v0, -0x270e63e3

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.DefaultButtonColors.backgroundColor (Button.kt:587)"

    invoke-static {v0, p3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    if-eqz p1, :cond_1

    iget-wide v0, p0, LN/u;->a:J

    goto :goto_0

    :cond_1
    iget-wide v0, p0, LN/u;->c:J

    :goto_0
    invoke-static {v0, v1}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object p1

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, LT/o1;->n(Ljava/lang/Object;LT/l;I)LT/z1;

    move-result-object p1

    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    invoke-interface {p2}, LT/l;->J()V

    return-object p1
.end method

.method public b(ZLT/l;I)LT/z1;
    .locals 3

    const v0, -0x7f2ce0b4

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.DefaultButtonColors.contentColor (Button.kt:592)"

    invoke-static {v0, p3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    if-eqz p1, :cond_1

    iget-wide v0, p0, LN/u;->b:J

    goto :goto_0

    :cond_1
    iget-wide v0, p0, LN/u;->d:J

    :goto_0
    invoke-static {v0, v1}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object p1

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, LT/o1;->n(Ljava/lang/Object;LT/l;I)LT/z1;

    move-result-object p1

    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    invoke-interface {p2}, LT/l;->J()V

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, LN/u;

    if-eq v3, v2, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, LN/u;

    iget-wide v2, p0, LN/u;->a:J

    iget-wide v4, p1, LN/u;->a:J

    invoke-static {v2, v3, v4, v5}, Lm0/v0;->m(JJ)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget-wide v2, p0, LN/u;->b:J

    iget-wide v4, p1, LN/u;->b:J

    invoke-static {v2, v3, v4, v5}, Lm0/v0;->m(JJ)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-wide v2, p0, LN/u;->c:J

    iget-wide v4, p1, LN/u;->c:J

    invoke-static {v2, v3, v4, v5}, Lm0/v0;->m(JJ)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-wide v2, p0, LN/u;->d:J

    iget-wide v4, p1, LN/u;->d:J

    invoke-static {v2, v3, v4, v5}, Lm0/v0;->m(JJ)Z

    move-result p1

    if-nez p1, :cond_5

    return v1

    :cond_5
    return v0

    :cond_6
    :goto_0
    return v1
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, LN/u;->a:J

    invoke-static {v0, v1}, Lm0/v0;->s(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LN/u;->b:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LN/u;->c:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LN/u;->d:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
