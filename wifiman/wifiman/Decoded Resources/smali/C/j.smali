.class final LC/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/d;


# instance fields
.field private final b:LC/C;

.field private final c:Lw/d;

.field private final d:Lr/i;


# direct methods
.method public constructor <init>(LC/C;Lw/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC/j;->b:LC/C;

    iput-object p2, p0, LC/j;->c:Lw/d;

    invoke-interface {p2}, Lw/d;->b()Lr/i;

    move-result-object p1

    iput-object p1, p0, LC/j;->d:Lr/i;

    return-void
.end method

.method private final c(F)F
    .locals 3

    iget-object v0, p0, LC/j;->b:LC/C;

    invoke-virtual {v0}, LC/C;->z()I

    move-result v0

    int-to-float v0, v0

    const/4 v1, -0x1

    int-to-float v1, v1

    mul-float/2addr v0, v1

    :goto_0
    const/4 v1, 0x0

    cmpl-float v2, p1, v1

    if-lez v2, :cond_0

    cmpg-float v2, v0, p1

    if-gez v2, :cond_0

    iget-object v1, p0, LC/j;->b:LC/C;

    invoke-virtual {v1}, LC/C;->H()I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    goto :goto_0

    :cond_0
    :goto_1
    cmpg-float v2, p1, v1

    if-gez v2, :cond_1

    cmpl-float v2, v0, p1

    if-lez v2, :cond_1

    iget-object v2, p0, LC/j;->b:LC/C;

    invoke-virtual {v2}, LC/C;->H()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v0, v2

    goto :goto_1

    :cond_1
    return v0
.end method


# virtual methods
.method public a(FFF)F
    .locals 1

    iget-object v0, p0, LC/j;->c:Lw/d;

    invoke-interface {v0, p1, p2, p3}, Lw/d;->a(FFF)F

    move-result p1

    const/4 p2, 0x0

    cmpg-float v0, p1, p2

    if-nez v0, :cond_2

    iget-object p1, p0, LC/j;->b:LC/C;

    invoke-virtual {p1}, LC/C;->z()I

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, LC/j;->b:LC/C;

    invoke-virtual {p1}, LC/C;->z()I

    move-result p1

    int-to-float p1, p1

    const/high16 p2, -0x40800000    # -1.0f

    mul-float/2addr p1, p2

    iget-object p2, p0, LC/j;->b:LC/C;

    invoke-virtual {p2}, LC/C;->B()Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, LC/j;->b:LC/C;

    invoke-virtual {p2}, LC/C;->H()I

    move-result p2

    int-to-float p2, p2

    add-float/2addr p1, p2

    :cond_1
    neg-float p2, p3

    invoke-static {p1, p2, p3}, Lsh/m;->j(FFF)F

    move-result p2

    goto :goto_0

    :cond_2
    invoke-direct {p0, p1}, LC/j;->c(F)F

    move-result p2

    :goto_0
    return p2
.end method

.method public b()Lr/i;
    .locals 1

    iget-object v0, p0, LC/j;->d:Lr/i;

    return-object v0
.end method
