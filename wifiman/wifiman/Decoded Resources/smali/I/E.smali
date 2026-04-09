.class public abstract LI/E;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(Landroid/view/inputmethod/CursorAnchorInfo$Builder;IILL0/M;Ll0/i;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;
    .locals 14

    move/from16 v0, p2

    move-object/from16 v1, p4

    sub-int v2, v0, p1

    mul-int/lit8 v2, v2, 0x4

    new-array v2, v2, [F

    invoke-virtual/range {p3 .. p3}, LL0/M;->w()LL0/k;

    move-result-object v3

    invoke-static/range {p1 .. p2}, LL0/T;->b(II)J

    move-result-wide v4

    const/4 v6, 0x0

    invoke-virtual {v3, v4, v5, v2, v6}, LL0/k;->a(J[FI)[F

    move v3, p1

    :goto_0
    if-ge v3, v0, :cond_3

    sub-int v4, v3, p1

    mul-int/lit8 v4, v4, 0x4

    new-instance v5, Ll0/i;

    aget v6, v2, v4

    add-int/lit8 v7, v4, 0x1

    aget v7, v2, v7

    add-int/lit8 v8, v4, 0x2

    aget v8, v2, v8

    add-int/lit8 v4, v4, 0x3

    aget v4, v2, v4

    invoke-direct {v5, v6, v7, v8, v4}, Ll0/i;-><init>(FFFF)V

    invoke-virtual {v1, v5}, Ll0/i;->v(Ll0/i;)Z

    move-result v4

    invoke-virtual {v5}, Ll0/i;->k()F

    move-result v6

    invoke-virtual {v5}, Ll0/i;->n()F

    move-result v7

    invoke-static {v1, v6, v7}, LI/L0;->c(Ll0/i;FF)Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {v5}, Ll0/i;->l()F

    move-result v6

    invoke-virtual {v5}, Ll0/i;->e()F

    move-result v7

    invoke-static {v1, v6, v7}, LI/L0;->c(Ll0/i;FF)Z

    move-result v6

    if-nez v6, :cond_0

    goto :goto_2

    :cond_0
    :goto_1
    move-object/from16 v6, p3

    goto :goto_3

    :cond_1
    :goto_2
    or-int/lit8 v4, v4, 0x2

    goto :goto_1

    :goto_3
    invoke-virtual {v6, v3}, LL0/M;->c(I)LW0/i;

    move-result-object v7

    sget-object v8, LW0/i;->Rtl:LW0/i;

    if-ne v7, v8, :cond_2

    or-int/lit8 v4, v4, 0x4

    :cond_2
    move v13, v4

    invoke-virtual {v5}, Ll0/i;->k()F

    move-result v9

    invoke-virtual {v5}, Ll0/i;->n()F

    move-result v10

    invoke-virtual {v5}, Ll0/i;->l()F

    move-result v11

    invoke-virtual {v5}, Ll0/i;->e()F

    move-result v12

    move-object v7, p0

    move v8, v3

    invoke-virtual/range {v7 .. v13}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->addCharacterBounds(IFFFFI)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return-object p0
.end method

.method public static final b(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Ljava/lang/CharSequence;JLL0/S;LL0/M;Landroid/graphics/Matrix;Ll0/i;Ll0/i;ZZZZ)Landroid/view/inputmethod/CursorAnchorInfo;
    .locals 0

    invoke-virtual {p0}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->reset()V

    invoke-virtual {p0, p6}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->setMatrix(Landroid/graphics/Matrix;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    invoke-static {p2, p3}, LL0/S;->l(J)I

    move-result p6

    invoke-static {p2, p3}, LL0/S;->k(J)I

    move-result p2

    invoke-virtual {p0, p6, p2}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->setSelectionRange(II)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    if-eqz p9, :cond_0

    invoke-static {p0, p6, p5, p7}, LI/E;->c(Landroid/view/inputmethod/CursorAnchorInfo$Builder;ILL0/M;Ll0/i;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    :cond_0
    if-eqz p10, :cond_3

    const/4 p2, -0x1

    if-eqz p4, :cond_1

    invoke-virtual {p4}, LL0/S;->r()J

    move-result-wide p9

    invoke-static {p9, p10}, LL0/S;->l(J)I

    move-result p3

    goto :goto_0

    :cond_1
    move p3, p2

    :goto_0
    if-eqz p4, :cond_2

    invoke-virtual {p4}, LL0/S;->r()J

    move-result-wide p9

    invoke-static {p9, p10}, LL0/S;->k(J)I

    move-result p2

    :cond_2
    if-ltz p3, :cond_3

    if-ge p3, p2, :cond_3

    invoke-interface {p1, p3, p2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p3, p1}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->setComposingText(ILjava/lang/CharSequence;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    invoke-static {p0, p3, p2, p5, p7}, LI/E;->a(Landroid/view/inputmethod/CursorAnchorInfo$Builder;IILL0/M;Ll0/i;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    :cond_3
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x21

    if-lt p1, p2, :cond_4

    if-eqz p11, :cond_4

    invoke-static {p0, p8}, LI/B;->a(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Ll0/i;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    :cond_4
    const/16 p2, 0x22

    if-lt p1, p2, :cond_5

    if-eqz p12, :cond_5

    invoke-static {p0, p5, p7}, LI/D;->a(Landroid/view/inputmethod/CursorAnchorInfo$Builder;LL0/M;Ll0/i;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    :cond_5
    invoke-virtual {p0}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->build()Landroid/view/inputmethod/CursorAnchorInfo;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Landroid/view/inputmethod/CursorAnchorInfo$Builder;ILL0/M;Ll0/i;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;
    .locals 10

    if-gez p1, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p2, p1}, LL0/M;->e(I)Ll0/i;

    move-result-object v0

    invoke-virtual {v0}, Ll0/i;->k()F

    move-result v1

    invoke-virtual {p2}, LL0/M;->B()J

    move-result-wide v2

    invoke-static {v2, v3}, LY0/r;->g(J)I

    move-result v2

    int-to-float v2, v2

    const/4 v3, 0x0

    invoke-static {v1, v3, v2}, Lsh/m;->j(FFF)F

    move-result v5

    invoke-virtual {v0}, Ll0/i;->n()F

    move-result v1

    invoke-static {p3, v5, v1}, LI/L0;->c(Ll0/i;FF)Z

    move-result v1

    invoke-virtual {v0}, Ll0/i;->e()F

    move-result v2

    invoke-static {p3, v5, v2}, LI/L0;->c(Ll0/i;FF)Z

    move-result p3

    invoke-virtual {p2, p1}, LL0/M;->c(I)LW0/i;

    move-result-object p1

    sget-object p2, LW0/i;->Rtl:LW0/i;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne p1, p2, :cond_1

    move p1, v3

    goto :goto_0

    :cond_1
    move p1, v2

    :goto_0
    if-nez v1, :cond_2

    if-eqz p3, :cond_3

    :cond_2
    move v2, v3

    :cond_3
    if-eqz v1, :cond_4

    if-nez p3, :cond_5

    :cond_4
    or-int/lit8 v2, v2, 0x2

    :cond_5
    if-eqz p1, :cond_6

    or-int/lit8 p1, v2, 0x4

    move v9, p1

    goto :goto_1

    :cond_6
    move v9, v2

    :goto_1
    invoke-virtual {v0}, Ll0/i;->n()F

    move-result v6

    invoke-virtual {v0}, Ll0/i;->e()F

    move-result v7

    invoke-virtual {v0}, Ll0/i;->e()F

    move-result v8

    move-object v4, p0

    invoke-virtual/range {v4 .. v9}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->setInsertionMarkerLocation(FFFFI)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    return-object p0
.end method
