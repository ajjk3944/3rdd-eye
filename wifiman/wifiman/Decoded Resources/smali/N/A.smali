.class final LN/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN/u0;


# instance fields
.field private final a:J

.field private final b:J

.field private final c:J


# direct methods
.method private constructor <init>(JJJ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, LN/A;->a:J

    .line 4
    iput-wide p3, p0, LN/A;->b:J

    .line 5
    iput-wide p5, p0, LN/A;->c:J

    return-void
.end method

.method public synthetic constructor <init>(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, LN/A;-><init>(JJJ)V

    return-void
.end method


# virtual methods
.method public a(ZZLT/l;I)LT/z1;
    .locals 10

    const v0, 0x4a1d1c8a    # 2574114.5f

    invoke-interface {p3, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.DefaultRadioButtonColors.radioColor (RadioButton.kt:186)"

    invoke-static {v0, p4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    if-nez p1, :cond_1

    iget-wide v0, p0, LN/A;->c:J

    :goto_0
    move-wide v2, v0

    goto :goto_1

    :cond_1
    if-nez p2, :cond_2

    iget-wide v0, p0, LN/A;->b:J

    goto :goto_0

    :cond_2
    iget-wide v0, p0, LN/A;->a:J

    goto :goto_0

    :goto_1
    const/4 p2, 0x0

    if-eqz p1, :cond_3

    const p1, 0x6f9c31ab

    invoke-interface {p3, p1}, LT/l;->U(I)V

    const/16 p1, 0x64

    const/4 p4, 0x6

    const/4 v0, 0x0

    invoke-static {p1, p2, v0, p4, v0}, Lr/j;->l(IILr/E;ILjava/lang/Object;)Lr/r0;

    move-result-object v4

    const/16 v8, 0x30

    const/16 v9, 0xc

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v7, p3

    invoke-static/range {v2 .. v9}, Lq/u;->a(JLr/i;Ljava/lang/String;Lmh/l;LT/l;II)LT/z1;

    move-result-object p1

    invoke-interface {p3}, LT/l;->J()V

    goto :goto_2

    :cond_3
    const p1, 0x6f9dc2da

    invoke-interface {p3, p1}, LT/l;->U(I)V

    invoke-static {v2, v3}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object p1

    invoke-static {p1, p3, p2}, LT/o1;->n(Ljava/lang/Object;LT/l;I)LT/z1;

    move-result-object p1

    invoke-interface {p3}, LT/l;->J()V

    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    invoke-interface {p3}, LT/l;->J()V

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, LN/A;

    if-eq v3, v2, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, LN/A;

    iget-wide v2, p0, LN/A;->a:J

    iget-wide v4, p1, LN/A;->a:J

    invoke-static {v2, v3, v4, v5}, Lm0/v0;->m(JJ)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget-wide v2, p0, LN/A;->b:J

    iget-wide v4, p1, LN/A;->b:J

    invoke-static {v2, v3, v4, v5}, Lm0/v0;->m(JJ)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-wide v2, p0, LN/A;->c:J

    iget-wide v4, p1, LN/A;->c:J

    invoke-static {v2, v3, v4, v5}, Lm0/v0;->m(JJ)Z

    move-result p1

    if-nez p1, :cond_4

    return v1

    :cond_4
    return v0

    :cond_5
    :goto_0
    return v1
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, LN/A;->a:J

    invoke-static {v0, v1}, Lm0/v0;->s(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LN/A;->b:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LN/A;->c:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
