.class public final LC/q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/q;->a(LC/C;)LB/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LC/C;


# direct methods
.method constructor <init>(LC/C;)V
    .locals 0

    iput-object p1, p0, LC/q$a;->a:LC/C;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final h()I
    .locals 2

    iget-object v0, p0, LC/q$a;->a:LC/C;

    invoke-virtual {v0}, LC/C;->G()I

    move-result v0

    iget-object v1, p0, LC/q$a;->a:LC/C;

    invoke-virtual {v1}, LC/C;->I()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, LC/q$a;->a:LC/C;

    invoke-virtual {v0}, LC/C;->F()I

    move-result v0

    return v0
.end method

.method public b(Lw/v;II)V
    .locals 1

    int-to-float p1, p3

    iget-object p3, p0, LC/q$a;->a:LC/C;

    invoke-virtual {p3}, LC/C;->H()I

    move-result p3

    int-to-float p3, p3

    div-float/2addr p1, p3

    iget-object p3, p0, LC/q$a;->a:LC/C;

    const/4 v0, 0x1

    invoke-virtual {p3, p2, p1, v0}, LC/C;->i0(IFZ)V

    return-void
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, LC/q$a;->a:LC/C;

    invoke-virtual {v0}, LC/C;->C()LC/n;

    move-result-object v0

    invoke-interface {v0}, LC/n;->h()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LZg/v;->B0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC/f;

    invoke-interface {v0}, LC/f;->getIndex()I

    move-result v0

    return v0
.end method

.method public d(Lmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, LC/q$a;->a:LC/C;

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v1, 0x0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v0 .. v5}, Lw/y;->b(Lw/y;Ls/L;Lmh/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public e()I
    .locals 1

    iget-object v0, p0, LC/q$a;->a:LC/C;

    invoke-virtual {v0}, LC/C;->z()I

    move-result v0

    return v0
.end method

.method public f(I)F
    .locals 5

    iget-object v0, p0, LC/q$a;->a:LC/C;

    invoke-virtual {v0}, LC/C;->C()LC/n;

    move-result-object v0

    invoke-interface {v0}, LC/n;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, LC/f;

    invoke-interface {v4}, LC/f;->getIndex()I

    move-result v4

    if-ne v4, p1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_1
    check-cast v3, LC/f;

    if-nez v3, :cond_2

    iget-object v0, p0, LC/q$a;->a:LC/C;

    invoke-virtual {v0}, LC/C;->v()I

    move-result v0

    sub-int/2addr p1, v0

    int-to-float p1, p1

    invoke-direct {p0}, LC/q$a;->h()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr p1, v0

    iget-object v0, p0, LC/q$a;->a:LC/C;

    invoke-virtual {v0}, LC/C;->w()F

    move-result v0

    iget-object v1, p0, LC/q$a;->a:LC/C;

    invoke-virtual {v1}, LC/C;->H()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sub-float/2addr p1, v0

    goto :goto_2

    :cond_2
    invoke-interface {v3}, LC/f;->b()I

    move-result p1

    int-to-float p1, p1

    :goto_2
    return p1
.end method

.method public g()I
    .locals 1

    iget-object v0, p0, LC/q$a;->a:LC/C;

    invoke-virtual {v0}, LC/C;->y()I

    move-result v0

    return v0
.end method
