.class public abstract LR0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(Landroid/view/inputmethod/CursorAnchorInfo$Builder;IILR0/H;LL0/M;Ll0/i;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;
    .locals 17

    move/from16 v0, p2

    move-object/from16 v1, p3

    move/from16 v2, p1

    move-object/from16 v3, p5

    invoke-interface {v1, v2}, LR0/H;->b(I)I

    move-result v4

    invoke-interface {v1, v0}, LR0/H;->b(I)I

    move-result v5

    sub-int v6, v5, v4

    mul-int/lit8 v6, v6, 0x4

    new-array v6, v6, [F

    invoke-virtual/range {p4 .. p4}, LL0/M;->w()LL0/k;

    move-result-object v7

    invoke-static {v4, v5}, LL0/T;->b(II)J

    move-result-wide v8

    const/4 v5, 0x0

    invoke-virtual {v7, v8, v9, v6, v5}, LL0/k;->a(J[FI)[F

    :goto_0
    if-ge v2, v0, :cond_3

    invoke-interface {v1, v2}, LR0/H;->b(I)I

    move-result v5

    sub-int v7, v5, v4

    mul-int/lit8 v7, v7, 0x4

    new-instance v8, Ll0/i;

    aget v9, v6, v7

    add-int/lit8 v10, v7, 0x1

    aget v10, v6, v10

    add-int/lit8 v11, v7, 0x2

    aget v11, v6, v11

    add-int/lit8 v7, v7, 0x3

    aget v7, v6, v7

    invoke-direct {v8, v9, v10, v11, v7}, Ll0/i;-><init>(FFFF)V

    invoke-virtual {v3, v8}, Ll0/i;->v(Ll0/i;)Z

    move-result v7

    invoke-virtual {v8}, Ll0/i;->k()F

    move-result v9

    invoke-virtual {v8}, Ll0/i;->n()F

    move-result v10

    invoke-static {v3, v9, v10}, LR0/d;->c(Ll0/i;FF)Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-virtual {v8}, Ll0/i;->l()F

    move-result v9

    invoke-virtual {v8}, Ll0/i;->e()F

    move-result v10

    invoke-static {v3, v9, v10}, LR0/d;->c(Ll0/i;FF)Z

    move-result v9

    if-nez v9, :cond_0

    goto :goto_2

    :cond_0
    :goto_1
    move-object/from16 v9, p4

    goto :goto_3

    :cond_1
    :goto_2
    or-int/lit8 v7, v7, 0x2

    goto :goto_1

    :goto_3
    invoke-virtual {v9, v5}, LL0/M;->c(I)LW0/i;

    move-result-object v5

    sget-object v10, LW0/i;->Rtl:LW0/i;

    if-ne v5, v10, :cond_2

    or-int/lit8 v5, v7, 0x4

    move/from16 v16, v5

    goto :goto_4

    :cond_2
    move/from16 v16, v7

    :goto_4
    invoke-virtual {v8}, Ll0/i;->k()F

    move-result v12

    invoke-virtual {v8}, Ll0/i;->n()F

    move-result v13

    invoke-virtual {v8}, Ll0/i;->l()F

    move-result v14

    invoke-virtual {v8}, Ll0/i;->e()F

    move-result v15

    move-object/from16 v10, p0

    move v11, v2

    invoke-virtual/range {v10 .. v16}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->addCharacterBounds(IFFFFI)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-object p0
.end method

.method public static final b(Landroid/view/inputmethod/CursorAnchorInfo$Builder;LR0/Q;LR0/H;LL0/M;Landroid/graphics/Matrix;Ll0/i;Ll0/i;ZZZZ)Landroid/view/inputmethod/CursorAnchorInfo;
    .locals 9

    move-object v6, p0

    move-object v7, p3

    move-object v8, p5

    invoke-virtual {p0}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->reset()V

    move-object v0, p4

    invoke-virtual {p0, p4}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->setMatrix(Landroid/graphics/Matrix;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    invoke-virtual {p1}, LR0/Q;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->l(J)I

    move-result v0

    invoke-virtual {p1}, LR0/Q;->h()J

    move-result-wide v1

    invoke-static {v1, v2}, LL0/S;->k(J)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->setSelectionRange(II)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    move-object v3, p2

    if-eqz p7, :cond_0

    invoke-static {p0, v0, p2, p3, p5}, LR0/d;->d(Landroid/view/inputmethod/CursorAnchorInfo$Builder;ILR0/H;LL0/M;Ll0/i;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    :cond_0
    if-eqz p8, :cond_3

    invoke-virtual {p1}, LR0/Q;->g()LL0/S;

    move-result-object v0

    const/4 v1, -0x1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LL0/S;->r()J

    move-result-wide v4

    invoke-static {v4, v5}, LL0/S;->l(J)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_0
    invoke-virtual {p1}, LR0/Q;->g()LL0/S;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LL0/S;->r()J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->k(J)I

    move-result v0

    move v4, v0

    goto :goto_1

    :cond_2
    move v4, v1

    :goto_1
    if-ltz v2, :cond_3

    if-ge v2, v4, :cond_3

    invoke-virtual {p1}, LR0/Q;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v2, v4}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p0, v2, v0}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->setComposingText(ILjava/lang/CharSequence;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    move-object v0, p0

    move v1, v2

    move v2, v4

    move-object v3, p2

    move-object v4, p3

    move-object v5, p5

    invoke-static/range {v0 .. v5}, LR0/d;->a(Landroid/view/inputmethod/CursorAnchorInfo$Builder;IILR0/H;LL0/M;Ll0/i;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    :cond_3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_4

    if-eqz p9, :cond_4

    move-object v1, p6

    invoke-static {p0, p6}, LR0/b;->a(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Ll0/i;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    :cond_4
    const/16 v1, 0x22

    if-lt v0, v1, :cond_5

    if-eqz p10, :cond_5

    invoke-static {p0, p3, p5}, LR0/c;->a(Landroid/view/inputmethod/CursorAnchorInfo$Builder;LL0/M;Ll0/i;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    :cond_5
    invoke-virtual {p0}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->build()Landroid/view/inputmethod/CursorAnchorInfo;

    move-result-object v0

    return-object v0
.end method

.method private static final c(Ll0/i;FF)Z
    .locals 2

    invoke-virtual {p0}, Ll0/i;->k()F

    move-result v0

    invoke-virtual {p0}, Ll0/i;->l()F

    move-result v1

    cmpg-float v1, p1, v1

    if-gtz v1, :cond_0

    cmpg-float p1, v0, p1

    if-gtz p1, :cond_0

    invoke-virtual {p0}, Ll0/i;->n()F

    move-result p1

    invoke-virtual {p0}, Ll0/i;->e()F

    move-result p0

    cmpg-float p0, p2, p0

    if-gtz p0, :cond_0

    cmpg-float p0, p1, p2

    if-gtz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final d(Landroid/view/inputmethod/CursorAnchorInfo$Builder;ILR0/H;LL0/M;Ll0/i;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;
    .locals 9

    if-gez p1, :cond_0

    return-object p0

    :cond_0
    invoke-interface {p2, p1}, LR0/H;->b(I)I

    move-result p1

    invoke-virtual {p3, p1}, LL0/M;->e(I)Ll0/i;

    move-result-object p2

    invoke-virtual {p2}, Ll0/i;->k()F

    move-result v0

    invoke-virtual {p3}, LL0/M;->B()J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/r;->g(J)I

    move-result v1

    int-to-float v1, v1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lsh/m;->j(FFF)F

    move-result v4

    invoke-virtual {p2}, Ll0/i;->n()F

    move-result v0

    invoke-static {p4, v4, v0}, LR0/d;->c(Ll0/i;FF)Z

    move-result v0

    invoke-virtual {p2}, Ll0/i;->e()F

    move-result v1

    invoke-static {p4, v4, v1}, LR0/d;->c(Ll0/i;FF)Z

    move-result p4

    invoke-virtual {p3, p1}, LL0/M;->c(I)LW0/i;

    move-result-object p1

    sget-object p3, LW0/i;->Rtl:LW0/i;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne p1, p3, :cond_1

    move p1, v2

    goto :goto_0

    :cond_1
    move p1, v1

    :goto_0
    if-nez v0, :cond_2

    if-eqz p4, :cond_3

    :cond_2
    move v1, v2

    :cond_3
    if-eqz v0, :cond_4

    if-nez p4, :cond_5

    :cond_4
    or-int/lit8 v1, v1, 0x2

    :cond_5
    if-eqz p1, :cond_6

    or-int/lit8 p1, v1, 0x4

    move v8, p1

    goto :goto_1

    :cond_6
    move v8, v1

    :goto_1
    invoke-virtual {p2}, Ll0/i;->n()F

    move-result v5

    invoke-virtual {p2}, Ll0/i;->e()F

    move-result v6

    invoke-virtual {p2}, Ll0/i;->e()F

    move-result v7

    move-object v3, p0

    invoke-virtual/range {v3 .. v8}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->setInsertionMarkerLocation(FFFFI)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    return-object p0
.end method
