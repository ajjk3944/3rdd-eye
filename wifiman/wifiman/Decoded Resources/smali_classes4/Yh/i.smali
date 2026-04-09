.class public final LYh/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LYh/i;

.field private static final b:Lkotlin/reflect/jvm/internal/impl/protobuf/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYh/i;

    invoke-direct {v0}, LYh/i;-><init>()V

    sput-object v0, LYh/i;->a:LYh/i;

    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/protobuf/f;->d()Lkotlin/reflect/jvm/internal/impl/protobuf/f;

    move-result-object v0

    invoke-static {v0}, LXh/a;->a(Lkotlin/reflect/jvm/internal/impl/protobuf/f;)V

    const-string v1, "apply(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LYh/i;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic d(LYh/i;LUh/n;LWh/c;LWh/g;ZILjava/lang/Object;)LYh/d$a;
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x1

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, LYh/i;->c(LUh/n;LWh/c;LWh/g;Z)LYh/d$a;

    move-result-object p0

    return-object p0
.end method

.method public static final f(LUh/n;)Z
    .locals 2

    const-string v0, "proto"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYh/c;->a:LYh/c;

    invoke-virtual {v0}, LYh/c;->a()LWh/b$b;

    move-result-object v0

    sget-object v1, LXh/a;->e:Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;

    invoke-virtual {p0, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->J(Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;)Ljava/lang/Object;

    move-result-object p0

    const-string v1, "getExtension(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    invoke-virtual {v0, p0}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object p0

    const-string v0, "get(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private final g(LUh/q;LWh/c;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p1}, LUh/q;->v1()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LUh/q;->g1()I

    move-result p1

    invoke-interface {p2, p1}, LWh/c;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LYh/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public static final h([B[Ljava/lang/String;)LYg/s;
    .locals 2

    const-string v0, "bytes"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    new-instance p0, LYg/s;

    sget-object v1, LYh/i;->a:LYh/i;

    invoke-direct {v1, v0, p1}, LYh/i;->k(Ljava/io/InputStream;[Ljava/lang/String;)LYh/f;

    move-result-object p1

    sget-object v1, LYh/i;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/f;

    invoke-static {v0, v1}, LUh/c;->G2(Ljava/io/InputStream;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/c;

    move-result-object v0

    invoke-direct {p0, p1, v0}, LYg/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final i([Ljava/lang/String;[Ljava/lang/String;)LYg/s;
    .locals 1

    const-string v0, "data"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LYh/a;->e([Ljava/lang/String;)[B

    move-result-object p0

    const-string v0, "decodeBytes(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LYh/i;->h([B[Ljava/lang/String;)LYg/s;

    move-result-object p0

    return-object p0
.end method

.method public static final j([Ljava/lang/String;[Ljava/lang/String;)LYg/s;
    .locals 2

    const-string v0, "data"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-static {p0}, LYh/a;->e([Ljava/lang/String;)[B

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    new-instance p0, LYg/s;

    sget-object v1, LYh/i;->a:LYh/i;

    invoke-direct {v1, v0, p1}, LYh/i;->k(Ljava/io/InputStream;[Ljava/lang/String;)LYh/f;

    move-result-object p1

    sget-object v1, LYh/i;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/f;

    invoke-static {v0, v1}, LUh/i;->O1(Ljava/io/InputStream;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/i;

    move-result-object v0

    invoke-direct {p0, p1, v0}, LYg/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0
.end method

.method private final k(Ljava/io/InputStream;[Ljava/lang/String;)LYh/f;
    .locals 2

    new-instance v0, LYh/f;

    sget-object v1, LYh/i;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/f;

    invoke-static {p1, v1}, LXh/a$e;->E0(Ljava/io/InputStream;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LXh/a$e;

    move-result-object p1

    const-string v1, "parseDelimitedFrom(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1, p2}, LYh/f;-><init>(LXh/a$e;[Ljava/lang/String;)V

    return-object v0
.end method

.method public static final l([B[Ljava/lang/String;)LYg/s;
    .locals 2

    const-string v0, "bytes"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    new-instance p0, LYg/s;

    sget-object v1, LYh/i;->a:LYh/i;

    invoke-direct {v1, v0, p1}, LYh/i;->k(Ljava/io/InputStream;[Ljava/lang/String;)LYh/f;

    move-result-object p1

    sget-object v1, LYh/i;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/f;

    invoke-static {v0, v1}, LUh/l;->n1(Ljava/io/InputStream;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LUh/l;

    move-result-object v0

    invoke-direct {p0, p1, v0}, LYg/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final m([Ljava/lang/String;[Ljava/lang/String;)LYg/s;
    .locals 1

    const-string v0, "data"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LYh/a;->e([Ljava/lang/String;)[B

    move-result-object p0

    const-string v0, "decodeBytes(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LYh/i;->l([B[Ljava/lang/String;)LYg/s;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a()Lkotlin/reflect/jvm/internal/impl/protobuf/f;
    .locals 1

    sget-object v0, LYh/i;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/f;

    return-object v0
.end method

.method public final b(LUh/d;LWh/c;LWh/g;)LYh/d$b;
    .locals 11

    const-string v0, "proto"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LXh/a;->a:Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;

    const-string v1, "constructorSignature"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, LWh/e;->a(Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXh/a$c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LXh/a$c;->d0()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, LXh/a$c;->S()I

    move-result v1

    invoke-interface {p2, v1}, LWh/c;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, "<init>"

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, LXh/a$c;->T()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, LXh/a$c;->P()I

    move-result p1

    invoke-interface {p2, p1}, LWh/c;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_1
    invoke-virtual {p1}, LUh/d;->W0()Ljava/util/List;

    move-result-object p1

    const-string v0, "getValueParameterList(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p1, v0}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LUh/u;

    sget-object v3, LYh/i;->a:LYh/i;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {v0, p3}, LWh/f;->q(LUh/u;LWh/g;)LUh/q;

    move-result-object v0

    invoke-direct {v3, v0, p2}, LYh/i;->g(LUh/q;LWh/c;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    const/4 p1, 0x0

    return-object p1

    :cond_2
    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    const/16 v9, 0x38

    const/4 v10, 0x0

    const-string v3, ""

    const-string v4, "("

    const-string v5, ")V"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v10}, LZg/v;->z0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_2
    new-instance p2, LYh/d$b;

    invoke-direct {p2, v1, p1}, LYh/d$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object p2
.end method

.method public final c(LUh/n;LWh/c;LWh/g;Z)LYh/d$a;
    .locals 3

    const-string v0, "proto"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LXh/a;->d:Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;

    const-string v1, "propertySignature"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, LWh/e;->a(Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXh/a$d;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v0}, LXh/a$d;->K0()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, LXh/a$d;->f0()LXh/a$b;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_2

    if-eqz p4, :cond_2

    return-object v1

    :cond_2
    if-eqz v0, :cond_3

    invoke-virtual {v0}, LXh/a$b;->d0()Z

    move-result p4

    if-eqz p4, :cond_3

    invoke-virtual {v0}, LXh/a$b;->S()I

    move-result p4

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, LUh/n;->m1()I

    move-result p4

    :goto_1
    if-eqz v0, :cond_4

    invoke-virtual {v0}, LXh/a$b;->T()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v0}, LXh/a$b;->P()I

    move-result p1

    invoke-interface {p2, p1}, LWh/c;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_4
    invoke-static {p1, p3}, LWh/f;->n(LUh/n;LWh/g;)LUh/q;

    move-result-object p1

    invoke-direct {p0, p1, p2}, LYh/i;->g(LUh/q;LWh/c;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    new-instance p3, LYh/d$a;

    invoke-interface {p2, p4}, LWh/c;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p3, p2, p1}, LYh/d$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object p3
.end method

.method public final e(LUh/i;LWh/c;LWh/g;)LYh/d$b;
    .locals 17

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    const-string v3, "proto"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "nameResolver"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "typeTable"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, LXh/a;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;

    const-string v4, "methodSignature"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v3}, LWh/e;->a(Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LXh/a$c;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, LXh/a$c;->d0()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3}, LXh/a$c;->S()I

    move-result v4

    goto :goto_0

    :cond_0
    invoke-virtual/range {p1 .. p1}, LUh/i;->n1()I

    move-result v4

    :goto_0
    if-eqz v3, :cond_1

    invoke-virtual {v3}, LXh/a$c;->T()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v3}, LXh/a$c;->P()I

    move-result v0

    invoke-interface {v1, v0}, LWh/c;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v2, p0

    goto/16 :goto_3

    :cond_1
    invoke-static {v0, v2}, LWh/f;->k(LUh/i;LWh/g;)LUh/q;

    move-result-object v3

    invoke-static {v3}, LZg/v;->p(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-virtual/range {p1 .. p1}, LUh/i;->z1()Ljava/util/List;

    move-result-object v5

    const-string v6, "getValueParameterList(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v5, v7}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LUh/u;

    invoke-static {v8}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {v8, v2}, LWh/f;->q(LUh/u;LWh/g;)LUh/q;

    move-result-object v8

    invoke-interface {v6, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-static {v3, v6}, LZg/v;->M0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    invoke-static {v3, v7}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v8, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LUh/q;

    sget-object v7, LYh/i;->a:LYh/i;

    invoke-direct {v7, v5, v1}, LYh/i;->g(LUh/q;LWh/c;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_3

    return-object v6

    :cond_3
    invoke-interface {v8, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    invoke-static {v0, v2}, LWh/f;->m(LUh/i;LWh/g;)LUh/q;

    move-result-object v0

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, LYh/i;->g(LUh/q;LWh/c;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    return-object v6

    :cond_5
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v15, 0x38

    const/16 v16, 0x0

    const-string v9, ""

    const-string v10, "("

    const-string v11, ")"

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v8 .. v16}, LZg/v;->z0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_3
    new-instance v3, LYh/d$b;

    invoke-interface {v1, v4}, LWh/c;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1, v0}, LYh/d$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v3
.end method
