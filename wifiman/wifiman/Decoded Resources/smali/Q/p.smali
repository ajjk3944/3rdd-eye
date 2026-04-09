.class final LQ/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls/I;


# instance fields
.field private final a:Z

.field private final b:F

.field private final c:Lm0/y0;

.field private final d:J


# direct methods
.method private constructor <init>(ZFJ)V
    .locals 6

    const/4 v3, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-wide v4, p3

    .line 7
    invoke-direct/range {v0 .. v5}, LQ/p;-><init>(ZFLm0/y0;J)V

    return-void
.end method

.method public synthetic constructor <init>(ZFJLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, LQ/p;-><init>(ZFJ)V

    return-void
.end method

.method private constructor <init>(ZFLm0/y0;J)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, LQ/p;->a:Z

    .line 4
    iput p2, p0, LQ/p;->b:F

    .line 5
    iput-object p3, p0, LQ/p;->c:Lm0/y0;

    .line 6
    iput-wide p4, p0, LQ/p;->d:J

    return-void
.end method

.method public static final synthetic c(LQ/p;)J
    .locals 2

    iget-wide v0, p0, LQ/p;->d:J

    return-wide v0
.end method


# virtual methods
.method public a(Ly/k;)LE0/j;
    .locals 7

    iget-object v0, p0, LQ/p;->c:Lm0/y0;

    if-nez v0, :cond_0

    new-instance v0, LQ/p$a;

    invoke-direct {v0, p0}, LQ/p$a;-><init>(LQ/p;)V

    :cond_0
    move-object v5, v0

    new-instance v0, LQ/g;

    iget-boolean v3, p0, LQ/p;->a:Z

    iget v4, p0, LQ/p;->b:F

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, LQ/g;-><init>(Ly/k;ZFLm0/y0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, LQ/p;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    :cond_1
    iget-boolean v0, p0, LQ/p;->a:Z

    check-cast p1, LQ/p;

    iget-boolean v2, p1, LQ/p;->a:Z

    if-eq v0, v2, :cond_2

    return v1

    :cond_2
    iget v0, p0, LQ/p;->b:F

    iget v2, p1, LQ/p;->b:F

    invoke-static {v0, v2}, LY0/h;->n(FF)Z

    move-result v0

    if-nez v0, :cond_3

    return v1

    :cond_3
    iget-object v0, p0, LQ/p;->c:Lm0/y0;

    iget-object v2, p1, LQ/p;->c:Lm0/y0;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    return v1

    :cond_4
    iget-wide v0, p0, LQ/p;->d:J

    iget-wide v2, p1, LQ/p;->d:J

    invoke-static {v0, v1, v2, v3}, Lm0/v0;->m(JJ)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, LQ/p;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LQ/p;->b:F

    invoke-static {v1}, LY0/h;->p(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LQ/p;->c:Lm0/y0;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LQ/p;->d:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
