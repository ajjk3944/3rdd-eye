.class public abstract LJh/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LBh/u;

.field public static final b:LBh/u;

.field public static final c:LBh/u;

.field private static final d:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LJh/y$a;

    sget-object v1, LEh/a;->c:LEh/a;

    invoke-direct {v0, v1}, LJh/y$a;-><init>(LBh/w0;)V

    sput-object v0, LJh/y;->a:LBh/u;

    new-instance v1, LJh/y$b;

    sget-object v2, LEh/c;->c:LEh/c;

    invoke-direct {v1, v2}, LJh/y$b;-><init>(LBh/w0;)V

    sput-object v1, LJh/y;->b:LBh/u;

    new-instance v2, LJh/y$c;

    sget-object v3, LEh/b;->c:LEh/b;

    invoke-direct {v2, v3}, LJh/y$c;-><init>(LBh/w0;)V

    sput-object v2, LJh/y;->c:LBh/u;

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    sput-object v3, LJh/y;->d:Ljava/util/Map;

    invoke-static {v0}, LJh/y;->f(LBh/u;)V

    invoke-static {v1}, LJh/y;->f(LBh/u;)V

    invoke-static {v2}, LJh/y;->f(LBh/u;)V

    return-void
.end method

.method private static synthetic a(I)V
    .locals 9

    const/4 v0, 0x6

    const/4 v1, 0x5

    if-eq p0, v1, :cond_0

    if-eq p0, v0, :cond_0

    const-string v2, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    const-string v2, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v3, 0x3

    const/4 v4, 0x2

    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_1

    move v5, v3

    goto :goto_1

    :cond_1
    move v5, v4

    :goto_1
    new-array v5, v5, [Ljava/lang/Object;

    const-string v6, "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities"

    const/4 v7, 0x0

    packed-switch p0, :pswitch_data_0

    const-string v8, "what"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_0
    aput-object v6, v5, v7

    goto :goto_2

    :pswitch_1
    const-string v8, "visibility"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_2
    const-string v8, "second"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_3
    const-string v8, "first"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_4
    const-string v8, "from"

    aput-object v8, v5, v7

    :goto_2
    const-string v7, "toDescriptorVisibility"

    const/4 v8, 0x1

    if-eq p0, v1, :cond_2

    if-eq p0, v0, :cond_2

    aput-object v6, v5, v8

    goto :goto_3

    :cond_2
    aput-object v7, v5, v8

    :goto_3
    if-eq p0, v4, :cond_4

    if-eq p0, v3, :cond_4

    const/4 v3, 0x4

    if-eq p0, v3, :cond_3

    if-eq p0, v1, :cond_5

    if-eq p0, v0, :cond_5

    const-string v3, "isVisibleForProtectedAndPackage"

    aput-object v3, v5, v4

    goto :goto_4

    :cond_3
    aput-object v7, v5, v4

    goto :goto_4

    :cond_4
    const-string v3, "areInSamePackage"

    aput-object v3, v5, v4

    :cond_5
    :goto_4
    invoke-static {v2, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    if-eq p0, v1, :cond_6

    if-eq p0, v0, :cond_6

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_6
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method static synthetic b(LBh/m;LBh/m;)Z
    .locals 0

    invoke-static {p0, p1}, LJh/y;->d(LBh/m;LBh/m;)Z

    move-result p0

    return p0
.end method

.method static synthetic c(Lji/g;LBh/q;LBh/m;)Z
    .locals 0

    invoke-static {p0, p1, p2}, LJh/y;->e(Lji/g;LBh/q;LBh/m;)Z

    move-result p0

    return p0
.end method

.method private static d(LBh/m;LBh/m;)Z
    .locals 2

    if-nez p0, :cond_0

    const/4 v0, 0x2

    invoke-static {v0}, LJh/y;->a(I)V

    :cond_0
    if-nez p1, :cond_1

    const/4 v0, 0x3

    invoke-static {v0}, LJh/y;->a(I)V

    :cond_1
    const-class v0, LBh/M;

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lbi/i;->r(LBh/m;Ljava/lang/Class;Z)LBh/m;

    move-result-object p0

    check-cast p0, LBh/M;

    invoke-static {p1, v0, v1}, Lbi/i;->r(LBh/m;Ljava/lang/Class;Z)LBh/m;

    move-result-object p1

    check-cast p1, LBh/M;

    if-eqz p1, :cond_2

    if-eqz p0, :cond_2

    invoke-interface {p0}, LBh/M;->e()LZh/c;

    move-result-object p0

    invoke-interface {p1}, LBh/M;->e()LZh/c;

    move-result-object p1

    invoke-virtual {p0, p1}, LZh/c;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method private static e(Lji/g;LBh/q;LBh/m;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    invoke-static {v0}, LJh/y;->a(I)V

    :cond_0
    const/4 v1, 0x1

    if-nez p2, :cond_1

    invoke-static {v1}, LJh/y;->a(I)V

    :cond_1
    invoke-static {p1}, Lbi/i;->M(LBh/q;)LBh/q;

    move-result-object v2

    invoke-static {v2, p2}, LJh/y;->d(LBh/m;LBh/m;)Z

    move-result v2

    if-eqz v2, :cond_2

    return v1

    :cond_2
    sget-object v1, LBh/t;->c:LBh/u;

    invoke-virtual {v1, p0, p1, p2, v0}, LBh/u;->e(Lji/g;LBh/q;LBh/m;Z)Z

    move-result p0

    return p0
.end method

.method private static f(LBh/u;)V
    .locals 2

    sget-object v0, LJh/y;->d:Ljava/util/Map;

    invoke-virtual {p0}, LBh/u;->b()LBh/w0;

    move-result-object v1

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static g(LBh/w0;)LBh/u;
    .locals 1

    if-nez p0, :cond_0

    const/4 v0, 0x4

    invoke-static {v0}, LJh/y;->a(I)V

    :cond_0
    sget-object v0, LJh/y;->d:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBh/u;

    if-nez v0, :cond_2

    invoke-static {p0}, LBh/t;->j(LBh/w0;)LBh/u;

    move-result-object p0

    if-nez p0, :cond_1

    const/4 v0, 0x5

    invoke-static {v0}, LJh/y;->a(I)V

    :cond_1
    return-object p0

    :cond_2
    return-object v0
.end method
