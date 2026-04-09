.class public final LI/i1$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/n1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI/i1$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, LI/i1$b;

    check-cast p2, LI/i1$b;

    invoke-virtual {p0, p1, p2}, LI/i1$b$a;->c(LI/i1$b;LI/i1$b;)Z

    move-result p1

    return p1
.end method

.method public c(LI/i1$b;LI/i1$b;)Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    invoke-virtual {p1}, LI/i1$b;->d()F

    move-result v2

    invoke-virtual {p2}, LI/i1$b;->d()F

    move-result v3

    cmpg-float v2, v2, v3

    if-nez v2, :cond_3

    invoke-virtual {p1}, LI/i1$b;->f()F

    move-result v2

    invoke-virtual {p2}, LI/i1$b;->f()F

    move-result v3

    cmpg-float v2, v2, v3

    if-nez v2, :cond_3

    invoke-virtual {p1}, LI/i1$b;->g()LY0/t;

    move-result-object v2

    invoke-virtual {p2}, LI/i1$b;->g()LY0/t;

    move-result-object v3

    if-ne v2, v3, :cond_3

    invoke-virtual {p1}, LI/i1$b;->e()LQ0/k$b;

    move-result-object v2

    invoke-virtual {p2}, LI/i1$b;->e()LQ0/k$b;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p1}, LI/i1$b;->b()J

    move-result-wide v2

    invoke-virtual {p2}, LI/i1$b;->b()J

    move-result-wide p1

    invoke-static {v2, v3, p1, p2}, LY0/b;->f(JJ)Z

    move-result p1

    if-eqz p1, :cond_3

    :goto_0
    move v0, v1

    goto :goto_3

    :cond_0
    if-nez p1, :cond_1

    move p1, v1

    goto :goto_1

    :cond_1
    move p1, v0

    :goto_1
    if-nez p2, :cond_2

    move p2, v1

    goto :goto_2

    :cond_2
    move p2, v0

    :goto_2
    xor-int/2addr p1, p2

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    :goto_3
    return v0
.end method
