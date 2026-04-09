.class public abstract LH0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;I)LH0/b$a;
    .locals 9

    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v6

    new-instance v7, Lt0/a;

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v7, p2, v2, v0, v1}, Lt0/a;-><init>(Lorg/xmlpull/v1/XmlPullParser;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v7, p1, p0, v6}, Lt0/c;->a(Lt0/a;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;)Ls0/d$a;

    move-result-object v8

    move v5, v2

    :goto_0
    invoke-static {p2}, Lt0/c;->d(Lorg/xmlpull/v1/XmlPullParser;)Z

    move-result v0

    if-nez v0, :cond_0

    move-object v0, v7

    move-object v1, p1

    move-object v2, v6

    move-object v3, p0

    move-object v4, v8

    invoke-static/range {v0 .. v5}, Lt0/c;->g(Lt0/a;Landroid/content/res/Resources;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;Ls0/d$a;I)I

    move-result v5

    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    goto :goto_0

    :cond_0
    new-instance p0, LH0/b$a;

    invoke-virtual {v8}, Ls0/d$a;->e()Ls0/d;

    move-result-object p1

    invoke-direct {p0, p1, p3}, LH0/b$a;-><init>(Ls0/d;I)V

    return-object p0
.end method

.method public static final b(Ls0/d$b;ILT/l;I)Ls0/d;
    .locals 6

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.ui.res.vectorResource (VectorResources.android.kt:47)"

    const v2, 0x2a7894a

    invoke-static {v2, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->g()LT/H0;

    move-result-object v0

    invoke-interface {p2, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {p2, v1}, LH0/e;->a(LT/l;I)Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v3

    and-int/lit8 v4, p3, 0x70

    xor-int/lit8 v4, v4, 0x30

    const/16 v5, 0x20

    if-le v4, v5, :cond_1

    invoke-interface {p2, p1}, LT/l;->i(I)Z

    move-result v4

    if-nez v4, :cond_2

    :cond_1
    and-int/lit8 p3, p3, 0x30

    if-ne p3, v5, :cond_3

    :cond_2
    const/4 v1, 0x1

    :cond_3
    invoke-interface {p2, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p3

    or-int/2addr p3, v1

    invoke-interface {p2, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr p3, v1

    invoke-interface {p2, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr p3, v1

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez p3, :cond_4

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v1, p3, :cond_5

    :cond_4
    invoke-static {p0, v0, v2, p1}, LH0/g;->c(Ls0/d$b;Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;I)Ls0/d;

    move-result-object v1

    invoke-interface {p2, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    check-cast v1, Ls0/d;

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
    return-object v1
.end method

.method public static final c(Ls0/d$b;Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;I)Ls0/d;
    .locals 1

    new-instance p0, Landroid/util/TypedValue;

    invoke-direct {p0}, Landroid/util/TypedValue;-><init>()V

    const/4 v0, 0x1

    invoke-virtual {p2, p3, p0, v0}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object p3

    invoke-static {p3}, Lt0/c;->j(Lorg/xmlpull/v1/XmlPullParser;)Lorg/xmlpull/v1/XmlPullParser;

    sget-object v0, LYg/J;->a:LYg/J;

    iget p0, p0, Landroid/util/TypedValue;->changingConfigurations:I

    invoke-static {p1, p2, p3, p0}, LH0/g;->a(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;I)LH0/b$a;

    move-result-object p0

    invoke-virtual {p0}, LH0/b$a;->b()Ls0/d;

    move-result-object p0

    return-object p0
.end method
