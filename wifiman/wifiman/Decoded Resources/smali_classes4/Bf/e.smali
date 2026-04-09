.class public abstract LBf/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/util/Comparator;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LBf/e$b;

    invoke-direct {v0}, LBf/e$b;-><init>()V

    new-instance v1, LBf/e$d;

    invoke-direct {v1, v0}, LBf/e$d;-><init>(Ljava/util/Comparator;)V

    new-instance v0, LBf/e$c;

    invoke-direct {v0, v1}, LBf/e$c;-><init>(Ljava/util/Comparator;)V

    sput-object v0, LBf/e;->a:Ljava/util/Comparator;

    return-void
.end method

.method public static final synthetic a(FLBf/b;LBf/b;)LBf/b;
    .locals 0

    invoke-static {p0, p1, p2}, LBf/e;->c(FLBf/b;LBf/b;)LBf/b;

    move-result-object p0

    return-object p0
.end method

.method public static final b(LBf/b;LT/l;I)LLi/N;
    .locals 6

    const-string v0, "currentChartModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x408c3346

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.wifi.component.chart.animatedWifiSpectrumChartModel (WifiSpectrumChartAnimation.kt:61)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const v0, 0x7f9c83fa

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_1

    invoke-static {p0}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v0

    invoke-interface {p1, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1
    check-cast v0, LLi/z;

    invoke-interface {p1}, LT/l;->J()V

    const v2, 0x7f9c9370

    invoke-interface {p1, v2}, LT/l;->U(I)V

    invoke-interface {p1, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    and-int/lit8 v3, p2, 0xe

    xor-int/lit8 v4, v3, 0x6

    const/4 v5, 0x4

    if-le v4, v5, :cond_2

    invoke-interface {p1, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    and-int/lit8 p2, p2, 0x6

    if-ne p2, v5, :cond_4

    :cond_3
    const/4 p2, 0x1

    goto :goto_0

    :cond_4
    const/4 p2, 0x0

    :goto_0
    or-int/2addr p2, v2

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez p2, :cond_5

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p2

    if-ne v2, p2, :cond_6

    :cond_5
    new-instance v2, LBf/e$a;

    const/4 p2, 0x0

    invoke-direct {v2, v0, p0, p2}, LBf/e$a;-><init>(LLi/z;LBf/b;Ldh/e;)V

    invoke-interface {p1, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v2, Lmh/p;

    invoke-interface {p1}, LT/l;->J()V

    invoke-static {p0, v2, p1, v3}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    invoke-interface {p1}, LT/l;->J()V

    return-object v0
.end method

.method private static final c(FLBf/b;LBf/b;)LBf/b;
    .locals 18

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p0, v0

    if-gez v0, :cond_9

    invoke-static {}, LZg/d0;->b()Ljava/util/Set;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, LBf/b;->d()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LBf/c;

    invoke-virtual {v2}, LBf/c;->e()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual/range {p2 .. p2}, LBf/b;->d()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LBf/c;

    invoke-virtual {v2}, LBf/c;->e()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-static {v0}, LZg/d0;->a(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, LBf/b;->d()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    const/16 v2, 0xa

    invoke-static {v1, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-static {v3}, LZg/U;->d(I)I

    move-result v3

    const/16 v4, 0x10

    invoke-static {v3, v4}, Lsh/m;->d(II)I

    move-result v3

    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, LBf/c;

    invoke-virtual {v6}, LBf/c;->e()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_2
    invoke-virtual/range {p2 .. p2}, LBf/b;->d()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-static {v3}, LZg/U;->d(I)I

    move-result v3

    invoke-static {v3, v4}, Lsh/m;->d(II)I

    move-result v3

    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, LBf/c;

    invoke-virtual {v6}, LBf/c;->e()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v6, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_3
    invoke-virtual/range {p2 .. p2}, LBf/b;->c()LS8/c;

    move-result-object v1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v5, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LBf/c;

    const/high16 v7, -0x3d420000    # -95.0f

    if-eqz v2, :cond_4

    invoke-virtual {v2}, LBf/c;->f()Ljava/lang/Float;

    move-result-object v8

    if-eqz v8, :cond_4

    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    move-result v8

    goto :goto_5

    :cond_4
    move v8, v7

    :goto_5
    invoke-static {v8, v7}, Ljava/lang/Math;->max(FF)F

    move-result v8

    check-cast v6, LBf/c;

    if-eqz v6, :cond_5

    invoke-virtual {v6}, LBf/c;->f()Ljava/lang/Float;

    move-result-object v9

    if-eqz v9, :cond_5

    invoke-virtual {v9}, Ljava/lang/Float;->floatValue()F

    move-result v9

    goto :goto_6

    :cond_5
    move v9, v7

    :goto_6
    invoke-static {v9, v7}, Ljava/lang/Math;->max(FF)F

    move-result v9

    sub-float/2addr v8, v9

    if-nez v6, :cond_6

    move-object v9, v2

    goto :goto_7

    :cond_6
    move-object v9, v6

    :goto_7
    invoke-static {v9}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    if-eqz v6, :cond_7

    invoke-virtual {v6}, LBf/c;->f()Ljava/lang/Float;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v7

    :cond_7
    mul-float v8, v8, p0

    add-float/2addr v7, v8

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    const/16 v16, 0x1b

    const/16 v17, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    invoke-static/range {v9 .. v17}, LBf/c;->b(LBf/c;Ljava/lang/String;Ljava/util/List;Ljava/lang/Float;JLjava/lang/Boolean;ILjava/lang/Object;)LBf/c;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_8
    sget-object v0, LBf/e;->a:Ljava/util/Comparator;

    invoke-static {v3, v0}, LZg/v;->X0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    new-instance v2, LBf/b;

    invoke-direct {v2, v1, v0}, LBf/b;-><init>(LS8/c;Ljava/util/List;)V

    goto :goto_8

    :cond_9
    invoke-virtual/range {p2 .. p2}, LBf/b;->d()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    sget-object v1, LBf/e;->a:Ljava/util/Comparator;

    invoke-static {v0, v1}, LZg/v;->X0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    move-object/from16 v3, p2

    invoke-static {v3, v2, v0, v1, v2}, LBf/b;->b(LBf/b;LS8/c;Ljava/util/List;ILjava/lang/Object;)LBf/b;

    move-result-object v2

    :goto_8
    return-object v2
.end method
