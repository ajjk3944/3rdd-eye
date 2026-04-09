.class public final LA/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB/m;


# instance fields
.field private final a:LA/B;

.field private final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LA/B;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA/h;->a:LA/B;

    iput p2, p0, LA/h;->b:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, LA/h;->a:LA/B;

    invoke-virtual {v0}, LA/B;->w()LA/q;

    move-result-object v0

    invoke-interface {v0}, LA/q;->h()I

    move-result v0

    return v0
.end method

.method public b()I
    .locals 3

    invoke-virtual {p0}, LA/h;->a()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iget-object v1, p0, LA/h;->a:LA/B;

    invoke-virtual {v1}, LA/B;->w()LA/q;

    move-result-object v1

    invoke-interface {v1}, LA/q;->j()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, LZg/v;->B0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LA/l;

    invoke-interface {v1}, LA/l;->getIndex()I

    move-result v1

    iget v2, p0, LA/h;->b:I

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, LA/h;->a:LA/B;

    invoke-virtual {v0}, LA/B;->D()LC0/N;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LC0/N;->j()V

    :cond_0
    return-void
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, LA/h;->a:LA/B;

    invoke-virtual {v0}, LA/B;->w()LA/q;

    move-result-object v0

    invoke-interface {v0}, LA/q;->j()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public e()I
    .locals 2

    iget-object v0, p0, LA/h;->a:LA/B;

    invoke-virtual {v0}, LA/B;->r()I

    move-result v0

    iget v1, p0, LA/h;->b:I

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method
