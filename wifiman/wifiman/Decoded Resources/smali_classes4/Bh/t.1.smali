.class public abstract LBh/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LBh/u;

.field public static final b:LBh/u;

.field public static final c:LBh/u;

.field public static final d:LBh/u;

.field public static final e:LBh/u;

.field public static final f:LBh/u;

.field public static final g:LBh/u;

.field public static final h:LBh/u;

.field public static final i:LBh/u;

.field public static final j:Ljava/util/Set;

.field private static final k:Ljava/util/Map;

.field public static final l:LBh/u;

.field private static final m:Lji/g;

.field public static final n:Lji/g;

.field public static final o:Lji/g;

.field private static final p:Lui/l;

.field private static final q:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    new-instance v0, LBh/t$d;

    sget-object v1, LBh/v0$e;->c:LBh/v0$e;

    invoke-direct {v0, v1}, LBh/t$d;-><init>(LBh/w0;)V

    sput-object v0, LBh/t;->a:LBh/u;

    new-instance v1, LBh/t$e;

    sget-object v2, LBh/v0$f;->c:LBh/v0$f;

    invoke-direct {v1, v2}, LBh/t$e;-><init>(LBh/w0;)V

    sput-object v1, LBh/t;->b:LBh/u;

    new-instance v2, LBh/t$f;

    sget-object v3, LBh/v0$g;->c:LBh/v0$g;

    invoke-direct {v2, v3}, LBh/t$f;-><init>(LBh/w0;)V

    sput-object v2, LBh/t;->c:LBh/u;

    new-instance v3, LBh/t$g;

    sget-object v4, LBh/v0$b;->c:LBh/v0$b;

    invoke-direct {v3, v4}, LBh/t$g;-><init>(LBh/w0;)V

    sput-object v3, LBh/t;->d:LBh/u;

    new-instance v4, LBh/t$h;

    sget-object v5, LBh/v0$h;->c:LBh/v0$h;

    invoke-direct {v4, v5}, LBh/t$h;-><init>(LBh/w0;)V

    sput-object v4, LBh/t;->e:LBh/u;

    new-instance v5, LBh/t$i;

    sget-object v6, LBh/v0$d;->c:LBh/v0$d;

    invoke-direct {v5, v6}, LBh/t$i;-><init>(LBh/w0;)V

    sput-object v5, LBh/t;->f:LBh/u;

    new-instance v6, LBh/t$j;

    sget-object v7, LBh/v0$a;->c:LBh/v0$a;

    invoke-direct {v6, v7}, LBh/t$j;-><init>(LBh/w0;)V

    sput-object v6, LBh/t;->g:LBh/u;

    new-instance v7, LBh/t$k;

    sget-object v8, LBh/v0$c;->c:LBh/v0$c;

    invoke-direct {v7, v8}, LBh/t$k;-><init>(LBh/w0;)V

    sput-object v7, LBh/t;->h:LBh/u;

    new-instance v8, LBh/t$l;

    sget-object v9, LBh/v0$i;->c:LBh/v0$i;

    invoke-direct {v8, v9}, LBh/t$l;-><init>(LBh/w0;)V

    sput-object v8, LBh/t;->i:LBh/u;

    const/4 v9, 0x4

    new-array v10, v9, [LBh/u;

    const/4 v11, 0x0

    aput-object v0, v10, v11

    const/4 v12, 0x1

    aput-object v1, v10, v12

    const/4 v13, 0x2

    aput-object v3, v10, v13

    const/4 v14, 0x3

    aput-object v5, v10, v14

    invoke-static {v10}, LZg/d0;->i([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v10

    invoke-static {v10}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v10

    sput-object v10, LBh/t;->j:Ljava/util/Set;

    invoke-static {v9}, Lxi/a;->e(I)Ljava/util/HashMap;

    move-result-object v9

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v9, v1, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v9, v0, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v9, v3, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v9, v2, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v9, v4, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v9}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v9

    sput-object v9, LBh/t;->k:Ljava/util/Map;

    sput-object v4, LBh/t;->l:LBh/u;

    new-instance v9, LBh/t$a;

    invoke-direct {v9}, LBh/t$a;-><init>()V

    sput-object v9, LBh/t;->m:Lji/g;

    new-instance v9, LBh/t$b;

    invoke-direct {v9}, LBh/t$b;-><init>()V

    sput-object v9, LBh/t;->n:Lji/g;

    new-instance v9, LBh/t$c;

    invoke-direct {v9}, LBh/t$c;-><init>()V

    sput-object v9, LBh/t;->o:Lji/g;

    const-class v9, Lui/l;

    invoke-virtual {v9}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v10

    invoke-static {v9, v10}, Ljava/util/ServiceLoader;->load(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/ServiceLoader;

    move-result-object v9

    invoke-virtual {v9}, Ljava/util/ServiceLoader;->iterator()Ljava/util/Iterator;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_0

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lui/l;

    goto :goto_0

    :cond_0
    sget-object v9, Lui/l$a;->a:Lui/l$a;

    :goto_0
    sput-object v9, LBh/t;->p:Lui/l;

    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    sput-object v9, LBh/t;->q:Ljava/util/Map;

    invoke-static {v0}, LBh/t;->i(LBh/u;)V

    invoke-static {v1}, LBh/t;->i(LBh/u;)V

    invoke-static {v2}, LBh/t;->i(LBh/u;)V

    invoke-static {v3}, LBh/t;->i(LBh/u;)V

    invoke-static {v4}, LBh/t;->i(LBh/u;)V

    invoke-static {v5}, LBh/t;->i(LBh/u;)V

    invoke-static {v6}, LBh/t;->i(LBh/u;)V

    invoke-static {v7}, LBh/t;->i(LBh/u;)V

    invoke-static {v8}, LBh/t;->i(LBh/u;)V

    return-void
.end method

.method private static synthetic a(I)V
    .locals 8

    const/16 v0, 0x10

    if-eq p0, v0, :cond_0

    const-string v1, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    const-string v1, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v2, 0x3

    const/4 v3, 0x2

    if-eq p0, v0, :cond_1

    move v4, v2

    goto :goto_1

    :cond_1
    move v4, v3

    :goto_1
    new-array v4, v4, [Ljava/lang/Object;

    const-string v5, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities"

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eq p0, v6, :cond_2

    if-eq p0, v2, :cond_2

    const/4 v2, 0x5

    if-eq p0, v2, :cond_2

    const/4 v2, 0x7

    if-eq p0, v2, :cond_2

    packed-switch p0, :pswitch_data_0

    const-string v2, "what"

    aput-object v2, v4, v7

    goto :goto_2

    :pswitch_0
    aput-object v5, v4, v7

    goto :goto_2

    :pswitch_1
    const-string v2, "visibility"

    aput-object v2, v4, v7

    goto :goto_2

    :pswitch_2
    const-string v2, "second"

    aput-object v2, v4, v7

    goto :goto_2

    :pswitch_3
    const-string v2, "first"

    aput-object v2, v4, v7

    goto :goto_2

    :cond_2
    :pswitch_4
    const-string v2, "from"

    aput-object v2, v4, v7

    :goto_2
    const-string v2, "toDescriptorVisibility"

    if-eq p0, v0, :cond_3

    aput-object v5, v4, v6

    goto :goto_3

    :cond_3
    aput-object v2, v4, v6

    :goto_3
    packed-switch p0, :pswitch_data_1

    const-string v2, "isVisible"

    aput-object v2, v4, v3

    goto :goto_4

    :pswitch_5
    aput-object v2, v4, v3

    goto :goto_4

    :pswitch_6
    const-string v2, "isPrivate"

    aput-object v2, v4, v3

    goto :goto_4

    :pswitch_7
    const-string v2, "compare"

    aput-object v2, v4, v3

    goto :goto_4

    :pswitch_8
    const-string v2, "compareLocal"

    aput-object v2, v4, v3

    goto :goto_4

    :pswitch_9
    const-string v2, "findInvisibleMember"

    aput-object v2, v4, v3

    goto :goto_4

    :pswitch_a
    const-string v2, "inSameFile"

    aput-object v2, v4, v3

    goto :goto_4

    :pswitch_b
    const-string v2, "isVisibleWithAnyReceiver"

    aput-object v2, v4, v3

    goto :goto_4

    :pswitch_c
    const-string v2, "isVisibleIgnoringReceiver"

    aput-object v2, v4, v3

    :goto_4
    :pswitch_d
    invoke-static {v1, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eq p0, v0, :cond_4

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x2
        :pswitch_c
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_9
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_d
    .end packed-switch
.end method

.method static synthetic b()Lji/g;
    .locals 1

    sget-object v0, LBh/t;->m:Lji/g;

    return-object v0
.end method

.method static synthetic c()Lui/l;
    .locals 1

    sget-object v0, LBh/t;->p:Lui/l;

    return-object v0
.end method

.method public static d(LBh/u;LBh/u;)Ljava/lang/Integer;
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0xc

    invoke-static {v0}, LBh/t;->a(I)V

    :cond_0
    if-nez p1, :cond_1

    const/16 v0, 0xd

    invoke-static {v0}, LBh/t;->a(I)V

    :cond_1
    invoke-virtual {p0, p1}, LBh/u;->a(LBh/u;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_2

    return-object v0

    :cond_2
    invoke-virtual {p1, p0}, LBh/u;->a(LBh/u;)Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    neg-int p0, p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_3
    const/4 p0, 0x0

    return-object p0
.end method

.method public static e(Lji/g;LBh/q;LBh/m;Z)LBh/q;
    .locals 3

    if-nez p1, :cond_0

    const/16 v0, 0x8

    invoke-static {v0}, LBh/t;->a(I)V

    :cond_0
    if-nez p2, :cond_1

    const/16 v0, 0x9

    invoke-static {v0}, LBh/t;->a(I)V

    :cond_1
    invoke-interface {p1}, LBh/m;->a()LBh/m;

    move-result-object v0

    check-cast v0, LBh/q;

    :goto_0
    if-eqz v0, :cond_3

    invoke-interface {v0}, LBh/q;->getVisibility()LBh/u;

    move-result-object v1

    sget-object v2, LBh/t;->f:LBh/u;

    if-eq v1, v2, :cond_3

    invoke-interface {v0}, LBh/q;->getVisibility()LBh/u;

    move-result-object v1

    invoke-virtual {v1, p0, v0, p2, p3}, LBh/u;->e(Lji/g;LBh/q;LBh/m;Z)Z

    move-result v1

    if-nez v1, :cond_2

    return-object v0

    :cond_2
    const-class v1, LBh/q;

    invoke-static {v0, v1}, Lbi/i;->q(LBh/m;Ljava/lang/Class;)LBh/m;

    move-result-object v0

    check-cast v0, LBh/q;

    goto :goto_0

    :cond_3
    instance-of v0, p1, LDh/Q;

    if-eqz v0, :cond_4

    check-cast p1, LDh/Q;

    invoke-interface {p1}, LDh/Q;->n0()LBh/d;

    move-result-object p1

    invoke-static {p0, p1, p2, p3}, LBh/t;->e(Lji/g;LBh/q;LBh/m;Z)LBh/q;

    move-result-object p0

    if-eqz p0, :cond_4

    return-object p0

    :cond_4
    const/4 p0, 0x0

    return-object p0
.end method

.method public static f(LBh/m;LBh/m;)Z
    .locals 1

    if-nez p0, :cond_0

    const/4 v0, 0x6

    invoke-static {v0}, LBh/t;->a(I)V

    :cond_0
    if-nez p1, :cond_1

    const/4 v0, 0x7

    invoke-static {v0}, LBh/t;->a(I)V

    :cond_1
    invoke-static {p1}, Lbi/i;->j(LBh/m;)LBh/h0;

    move-result-object p1

    sget-object v0, LBh/h0;->a:LBh/h0;

    if-eq p1, v0, :cond_2

    invoke-static {p0}, Lbi/i;->j(LBh/m;)LBh/h0;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static g(LBh/u;)Z
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0xe

    invoke-static {v0}, LBh/t;->a(I)V

    :cond_0
    sget-object v0, LBh/t;->a:LBh/u;

    if-eq p0, v0, :cond_2

    sget-object v0, LBh/t;->b:LBh/u;

    if-ne p0, v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static h(LBh/q;LBh/m;Z)Z
    .locals 1

    if-nez p0, :cond_0

    const/4 v0, 0x2

    invoke-static {v0}, LBh/t;->a(I)V

    :cond_0
    if-nez p1, :cond_1

    const/4 v0, 0x3

    invoke-static {v0}, LBh/t;->a(I)V

    :cond_1
    sget-object v0, LBh/t;->n:Lji/g;

    invoke-static {v0, p0, p1, p2}, LBh/t;->e(Lji/g;LBh/q;LBh/m;Z)LBh/q;

    move-result-object p0

    if-nez p0, :cond_2

    const/4 p0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static i(LBh/u;)V
    .locals 2

    sget-object v0, LBh/t;->q:Ljava/util/Map;

    invoke-virtual {p0}, LBh/u;->b()LBh/w0;

    move-result-object v1

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static j(LBh/w0;)LBh/u;
    .locals 3

    if-nez p0, :cond_0

    const/16 v0, 0xf

    invoke-static {v0}, LBh/t;->a(I)V

    :cond_0
    sget-object v0, LBh/t;->q:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBh/u;

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Inapplicable visibility: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
