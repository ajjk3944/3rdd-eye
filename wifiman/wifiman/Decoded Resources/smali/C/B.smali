.class public final LC/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC/A;


# instance fields
.field private final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LC/B;->b:I

    return-void
.end method


# virtual methods
.method public a(IIFII)I
    .locals 4

    int-to-long p3, p1

    iget p1, p0, LC/B;->b:I

    int-to-long v0, p1

    sub-long v0, p3, v0

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v2, v3}, Lsh/m;->e(JJ)J

    move-result-wide v0

    long-to-int p1, v0

    iget p5, p0, LC/B;->b:I

    int-to-long v0, p5

    add-long/2addr p3, v0

    const-wide/32 v0, 0x7fffffff

    invoke-static {p3, p4, v0, v1}, Lsh/m;->h(JJ)J

    move-result-wide p3

    long-to-int p3, p3

    invoke-static {p2, p1, p3}, Lsh/m;->k(III)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, LC/B;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget v0, p0, LC/B;->b:I

    check-cast p1, LC/B;

    iget p1, p1, LC/B;->b:I

    if-ne v0, p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, LC/B;->b:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    return v0
.end method
