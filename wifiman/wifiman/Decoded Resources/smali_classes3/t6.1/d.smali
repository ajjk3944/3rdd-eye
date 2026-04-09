.class public abstract Lt6/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt6/d$a;
    }
.end annotation


# direct methods
.method public static final a(Lt6/c;Landroid/graphics/RectF;FFF)Lt6/c;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "bounds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sub-float v0, p4, p2

    sub-float/2addr v0, p3

    iget v1, p1, Landroid/graphics/RectF;->top:F

    cmpl-float v0, v0, v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ltz v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    const/4 v4, 0x2

    int-to-float v5, v4

    div-float v5, p3, v5

    sub-float v6, p4, v5

    cmpl-float v1, v6, v1

    if-ltz v1, :cond_1

    add-float/2addr v5, p4

    iget v1, p1, Landroid/graphics/RectF;->bottom:F

    cmpg-float v1, v5, v1

    if-gtz v1, :cond_1

    move v1, v3

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    add-float/2addr p4, p2

    add-float/2addr p4, p3

    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    cmpg-float p1, p4, p1

    if-gtz p1, :cond_2

    move v2, v3

    :cond_2
    sget-object p1, Lt6/d$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    if-eq p1, v3, :cond_8

    if-eq p1, v4, :cond_6

    const/4 p2, 0x3

    if-ne p1, p2, :cond_5

    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    if-eqz v0, :cond_4

    sget-object p0, Lt6/c;->Top:Lt6/c;

    goto :goto_2

    :cond_4
    sget-object p0, Lt6/c;->Bottom:Lt6/c;

    goto :goto_2

    :cond_5
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_6
    if-eqz v2, :cond_7

    goto :goto_2

    :cond_7
    sget-object p0, Lt6/c;->Top:Lt6/c;

    goto :goto_2

    :cond_8
    if-eqz v0, :cond_9

    goto :goto_2

    :cond_9
    sget-object p0, Lt6/c;->Bottom:Lt6/c;

    :goto_2
    return-object p0
.end method
