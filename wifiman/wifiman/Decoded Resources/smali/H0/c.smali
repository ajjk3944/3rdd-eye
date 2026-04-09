.class public abstract LH0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(Ljava/lang/CharSequence;Landroid/content/res/Resources;I)Lm0/J0;
    .locals 2

    :try_start_0
    sget-object v0, Lm0/J0;->a:Lm0/J0$a;

    invoke-static {v0, p1, p2}, LH0/a;->a(Lm0/J0$a;Landroid/content/res/Resources;I)Lm0/J0;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    new-instance p2, Landroidx/compose/ui/res/ResourceResolutionException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Error attempting to load resource: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0, p1}, Landroidx/compose/ui/res/ResourceResolutionException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method private static final b(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;IILT/l;I)Ls0/d;
    .locals 3

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:91)"

    const v2, 0x14d7d89

    invoke-static {v2, p5, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->h()LT/H0;

    move-result-object p5

    invoke-interface {p4, p5}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, LH0/b;

    new-instance p5, LH0/b$b;

    invoke-direct {p5, p0, p2}, LH0/b$b;-><init>(Landroid/content/res/Resources$Theme;I)V

    invoke-virtual {p4, p5}, LH0/b;->b(LH0/b$b;)LH0/b$a;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object p2

    invoke-static {p2}, Lt0/c;->j(Lorg/xmlpull/v1/XmlPullParser;)Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v0

    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "vector"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0, p1, p2, p3}, LH0/g;->a(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;I)LH0/b$a;

    move-result-object v0

    invoke-virtual {p4, p5, v0}, LH0/b;->d(LH0/b$b;LH0/b$a;)V

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    :goto_0
    invoke-virtual {v0}, LH0/b$a;->b()Ls0/d;

    move-result-object p0

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    return-object p0
.end method

.method public static final c(ILT/l;I)Lr0/d;
    .locals 9

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.ui.res.painterResource (PainterResources.android.kt:57)"

    const v2, 0x1c403a8f

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->g()LT/H0;

    move-result-object v0

    invoke-interface {p1, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f()LT/H0;

    move-result-object v1

    invoke-interface {p1, v1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->i()LT/H0;

    move-result-object v1

    invoke-interface {p1, v1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LH0/d;

    invoke-virtual {v1, v3, p0}, LH0/d;->b(Landroid/content/res/Resources;I)Landroid/util/TypedValue;

    move-result-object v1

    iget-object v2, v1, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    const/4 v4, 0x1

    const/4 v8, 0x0

    if-eqz v2, :cond_1

    const/4 v5, 0x2

    const/4 v6, 0x0

    const-string v7, ".xml"

    invoke-static {v2, v7, v8, v5, v6}, Lkotlin/text/t;->b0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v5

    if-ne v5, v4, :cond_1

    const v2, -0x2fdd6c65

    invoke-interface {p1, v2}, LT/l;->U(I)V

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    iget v5, v1, Landroid/util/TypedValue;->changingConfigurations:I

    shl-int/lit8 p2, p2, 0x6

    and-int/lit16 v7, p2, 0x380

    move v4, p0

    move-object v6, p1

    invoke-static/range {v2 .. v7}, LH0/c;->b(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;IILT/l;I)Ls0/d;

    move-result-object p0

    invoke-static {p0, p1, v8}, Ls0/q;->g(Ls0/d;LT/l;I)Ls0/p;

    move-result-object p0

    invoke-interface {p1}, LT/l;->J()V

    goto :goto_1

    :cond_1
    const v1, -0x2fdb0c43

    invoke-interface {p1, v1}, LT/l;->U(I)V

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    invoke-interface {p1, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    and-int/lit8 v5, p2, 0xe

    xor-int/lit8 v5, v5, 0x6

    const/4 v6, 0x4

    if-le v5, v6, :cond_2

    invoke-interface {p1, p0}, LT/l;->i(I)Z

    move-result v5

    if-nez v5, :cond_4

    :cond_2
    and-int/lit8 p2, p2, 0x6

    if-ne p2, v6, :cond_3

    goto :goto_0

    :cond_3
    move v4, v8

    :cond_4
    :goto_0
    or-int p2, v1, v4

    invoke-interface {p1, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p2, v0

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    if-nez p2, :cond_5

    sget-object p2, LT/l;->a:LT/l$a;

    invoke-virtual {p2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p2

    if-ne v0, p2, :cond_6

    :cond_5
    invoke-static {v2, v3, p0}, LH0/c;->a(Ljava/lang/CharSequence;Landroid/content/res/Resources;I)Lm0/J0;

    move-result-object v0

    invoke-interface {p1, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    move-object v2, v0

    check-cast v2, Lm0/J0;

    new-instance p0, Lr0/a;

    const/4 v7, 0x6

    const/4 v8, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v8}, Lr0/a;-><init>(Lm0/J0;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1}, LT/l;->J()V

    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    return-object p0
.end method
