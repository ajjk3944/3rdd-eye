.class public abstract LSh/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lli/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LSh/e$a;,
        LSh/e$b;,
        LSh/e$c;,
        LSh/e$d;
    }
.end annotation


# static fields
.field public static final b:LSh/e$b;


# instance fields
.field private final a:LSh/v;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LSh/e$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LSh/e$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LSh/e;->b:LSh/e$b;

    return-void
.end method

.method public constructor <init>(LSh/v;)V
    .locals 1

    const-string v0, "kotlinClassFinder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSh/e;->a:LSh/v;

    return-void
.end method

.method private final A(Lli/N$a;)LSh/x;
    .locals 2

    invoke-virtual {p1}, Lli/N;->c()LBh/g0;

    move-result-object p1

    instance-of v0, p1, LSh/z;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, LSh/z;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, LSh/z;->d()LSh/x;

    move-result-object v1

    :cond_1
    return-object v1
.end method

.method private final m(Lli/N;Lkotlin/reflect/jvm/internal/impl/protobuf/n;)I
    .locals 3

    instance-of v0, p2, LUh/i;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    check-cast p2, LUh/i;

    invoke-static {p2}, LWh/f;->g(LUh/i;)Z

    move-result p1

    if-eqz p1, :cond_3

    :goto_0
    move v1, v2

    goto :goto_1

    :cond_0
    instance-of v0, p2, LUh/n;

    if-eqz v0, :cond_1

    check-cast p2, LUh/n;

    invoke-static {p2}, LWh/f;->h(LUh/n;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_1
    instance-of v0, p2, LUh/d;

    if-eqz v0, :cond_4

    const-string p2, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lli/N$a;

    invoke-virtual {p1}, Lli/N$a;->g()LUh/c$c;

    move-result-object p2

    sget-object v0, LUh/c$c;->ENUM_CLASS:LUh/c$c;

    if-ne p2, v0, :cond_2

    const/4 v1, 0x2

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lli/N$a;->i()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    :goto_1
    return v1

    :cond_4
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported message: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final n(Lli/N;LSh/A;ZZLjava/lang/Boolean;Z)Ljava/util/List;
    .locals 8

    sget-object v0, LSh/e;->b:LSh/e$b;

    iget-object v6, p0, LSh/e;->a:LSh/v;

    invoke-virtual {p0}, LSh/e;->u()LYh/e;

    move-result-object v7

    move-object v1, p1

    move v2, p3

    move v3, p4

    move-object v4, p5

    move v5, p6

    invoke-virtual/range {v0 .. v7}, LSh/e$b;->a(Lli/N;ZZLjava/lang/Boolean;ZLSh/v;LYh/e;)LSh/x;

    move-result-object p3

    invoke-virtual {p0, p1, p3}, LSh/e;->p(Lli/N;LSh/x;)LSh/x;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0, p1}, LSh/e;->q(LSh/x;)LSh/e$a;

    move-result-object p1

    invoke-virtual {p1}, LSh/e$a;->a()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_1

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method static synthetic o(LSh/e;Lli/N;LSh/A;ZZLjava/lang/Boolean;ZILjava/lang/Object;)Ljava/util/List;
    .locals 9

    if-nez p8, :cond_4

    and-int/lit8 v0, p7, 0x4

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move v5, v1

    goto :goto_0

    :cond_0
    move v5, p3

    :goto_0
    and-int/lit8 v0, p7, 0x8

    if-eqz v0, :cond_1

    move v6, v1

    goto :goto_1

    :cond_1
    move v6, p4

    :goto_1
    and-int/lit8 v0, p7, 0x10

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    move-object v7, v0

    goto :goto_2

    :cond_2
    move-object v7, p5

    :goto_2
    and-int/lit8 v0, p7, 0x20

    if-eqz v0, :cond_3

    move v8, v1

    goto :goto_3

    :cond_3
    move v8, p6

    :goto_3
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v2 .. v8}, LSh/e;->n(Lli/N;LSh/A;ZZLjava/lang/Boolean;Z)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_4
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic t(LSh/e;Lkotlin/reflect/jvm/internal/impl/protobuf/n;LWh/c;LWh/g;Lli/d;ZILjava/lang/Object;)LSh/A;
    .locals 6

    if-nez p7, :cond_1

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, LSh/e;->s(Lkotlin/reflect/jvm/internal/impl/protobuf/n;LWh/c;LWh/g;Lli/d;Z)LSh/A;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: getCallableSignature"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final z(Lli/N;LUh/n;LSh/e$c;)Ljava/util/List;
    .locals 18

    move-object/from16 v0, p3

    sget-object v1, LWh/b;->B:LWh/b$b;

    invoke-virtual/range {p2 .. p2}, LUh/n;->k1()I

    move-result v2

    invoke-virtual {v1, v2}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v8

    const-string v1, "get(...)"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    invoke-static/range {p2 .. p2}, LYh/i;->f(LUh/n;)Z

    move-result v9

    sget-object v1, LSh/e$c;->PROPERTY:LSh/e$c;

    if-ne v0, v1, :cond_1

    invoke-virtual/range {p1 .. p1}, Lli/N;->b()LWh/c;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lli/N;->d()LWh/g;

    move-result-object v12

    const/16 v16, 0x28

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x1

    const/4 v15, 0x0

    move-object/from16 v10, p2

    invoke-static/range {v10 .. v17}, LSh/f;->b(LUh/n;LWh/c;LWh/g;ZZZILjava/lang/Object;)LSh/A;

    move-result-object v5

    if-nez v5, :cond_0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    const/16 v10, 0x8

    const/4 v11, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    invoke-static/range {v3 .. v11}, LSh/e;->o(LSh/e;Lli/N;LSh/A;ZZLjava/lang/Boolean;ZILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-virtual/range {p1 .. p1}, Lli/N;->b()LWh/c;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lli/N;->d()LWh/g;

    move-result-object v12

    const/16 v16, 0x30

    const/16 v17, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v10, p2

    invoke-static/range {v10 .. v17}, LSh/f;->b(LUh/n;LWh/c;LWh/g;ZZZILjava/lang/Object;)LSh/A;

    move-result-object v5

    if-nez v5, :cond_2

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_2
    invoke-virtual {v5}, LSh/A;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const-string v4, "$delegate"

    const/4 v6, 0x0

    invoke-static {v1, v4, v6, v2, v3}, Lkotlin/text/t;->W(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v1

    sget-object v2, LSh/e$c;->DELEGATE_FIELD:LSh/e$c;

    if-ne v0, v2, :cond_3

    const/4 v6, 0x1

    :cond_3
    if-eq v1, v6, :cond_4

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_4
    const/4 v7, 0x1

    const/4 v6, 0x1

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    invoke-direct/range {v3 .. v9}, LSh/e;->n(Lli/N;LSh/A;ZZLjava/lang/Boolean;Z)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lli/N$a;)Ljava/util/List;
    .locals 3

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LSh/e;->A(Lli/N$a;)LSh/x;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance p1, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v1, LSh/e$e;

    invoke-direct {v1, p0, p1}, LSh/e$e;-><init>(LSh/e;Ljava/util/ArrayList;)V

    invoke-virtual {p0, v0}, LSh/e;->r(LSh/x;)[B

    move-result-object v2

    invoke-interface {v0, v1, v2}, LSh/x;->d(LSh/x$c;[B)V

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Class for loading annotations is not found: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lli/N$a;->a()LZh/c;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(Lli/N;Lkotlin/reflect/jvm/internal/impl/protobuf/n;Lli/d;ILUh/u;)Ljava/util/List;
    .locals 9

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callableProto"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proto"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lli/N;->b()LWh/c;

    move-result-object v3

    invoke-virtual {p1}, Lli/N;->d()LWh/g;

    move-result-object v4

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p2

    move-object v5, p3

    invoke-static/range {v1 .. v8}, LSh/e;->t(LSh/e;Lkotlin/reflect/jvm/internal/impl/protobuf/n;LWh/c;LWh/g;Lli/d;ZILjava/lang/Object;)LSh/A;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-direct {p0, p1, p2}, LSh/e;->m(Lli/N;Lkotlin/reflect/jvm/internal/impl/protobuf/n;)I

    move-result p2

    add-int/2addr p4, p2

    sget-object p2, LSh/A;->b:LSh/A$a;

    invoke-virtual {p2, p3, p4}, LSh/A$a;->e(LSh/A;I)LSh/A;

    move-result-object v2

    const/16 v7, 0x3c

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v8}, LSh/e;->o(LSh/e;Lli/N;LSh/A;ZZLjava/lang/Boolean;ZILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public d(Lli/N;LUh/g;)Ljava/util/List;
    .locals 11

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proto"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LSh/A;->b:LSh/A$a;

    invoke-virtual {p1}, Lli/N;->b()LWh/c;

    move-result-object v1

    invoke-virtual {p2}, LUh/g;->K0()I

    move-result p2

    invoke-interface {v1, p2}, LWh/c;->getString(I)Ljava/lang/String;

    move-result-object p2

    move-object v1, p1

    check-cast v1, Lli/N$a;

    invoke-virtual {v1}, Lli/N$a;->e()LZh/b;

    move-result-object v1

    invoke-virtual {v1}, LZh/b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LYh/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p2, v1}, LSh/A$a;->a(Ljava/lang/String;Ljava/lang/String;)LSh/A;

    move-result-object v4

    const/16 v9, 0x3c

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v2, p0

    move-object v3, p1

    invoke-static/range {v2 .. v10}, LSh/e;->o(LSh/e;Lli/N;LSh/A;ZZLjava/lang/Boolean;ZILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public f(Lli/N;LUh/n;)Ljava/util/List;
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proto"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LSh/e$c;->DELEGATE_FIELD:LSh/e$c;

    invoke-direct {p0, p1, p2, v0}, LSh/e;->z(Lli/N;LUh/n;LSh/e$c;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public g(Lli/N;LUh/n;)Ljava/util/List;
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proto"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LSh/e$c;->BACKING_FIELD:LSh/e$c;

    invoke-direct {p0, p1, p2, v0}, LSh/e;->z(Lli/N;LUh/n;LSh/e$c;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public h(Lli/N;Lkotlin/reflect/jvm/internal/impl/protobuf/n;Lli/d;)Ljava/util/List;
    .locals 10

    const-string v2, "container"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "proto"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "kind"

    invoke-static {p3, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lli/d;->PROPERTY:Lli/d;

    if-ne p3, v2, :cond_0

    move-object v0, p2

    check-cast v0, LUh/n;

    sget-object v2, LSh/e$c;->PROPERTY:LSh/e$c;

    invoke-direct {p0, p1, v0, v2}, LSh/e;->z(Lli/N;LUh/n;LSh/e$c;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p1}, Lli/N;->b()LWh/c;

    move-result-object v4

    invoke-virtual {p1}, Lli/N;->d()LWh/g;

    move-result-object v5

    const/16 v8, 0x10

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v2, p0

    move-object v3, p2

    move-object v6, p3

    invoke-static/range {v2 .. v9}, LSh/e;->t(LSh/e;Lkotlin/reflect/jvm/internal/impl/protobuf/n;LWh/c;LWh/g;Lli/d;ZILjava/lang/Object;)LSh/A;

    move-result-object v2

    if-nez v2, :cond_1

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_1
    const/16 v7, 0x3c

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v8}, LSh/e;->o(LSh/e;Lli/N;LSh/A;ZZLjava/lang/Boolean;ZILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public i(LUh/s;LWh/c;)Ljava/util/List;
    .locals 2

    const-string v0, "proto"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LXh/a;->h:Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;

    invoke-virtual {p1, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->J(Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "getExtension(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LUh/b;

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p0, v1, p2}, LSh/e;->l(LUh/b;LWh/c;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public j(LUh/q;LWh/c;)Ljava/util/List;
    .locals 2

    const-string v0, "proto"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LXh/a;->f:Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;

    invoke-virtual {p1, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->J(Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "getExtension(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LUh/b;

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p0, v1, p2}, LSh/e;->l(LUh/b;LWh/c;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public k(Lli/N;Lkotlin/reflect/jvm/internal/impl/protobuf/n;Lli/d;)Ljava/util/List;
    .locals 10

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proto"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lli/N;->b()LWh/c;

    move-result-object v3

    invoke-virtual {p1}, Lli/N;->d()LWh/g;

    move-result-object v4

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p2

    move-object v5, p3

    invoke-static/range {v1 .. v8}, LSh/e;->t(LSh/e;Lkotlin/reflect/jvm/internal/impl/protobuf/n;LWh/c;LWh/g;Lli/d;ZILjava/lang/Object;)LSh/A;

    move-result-object p2

    if-eqz p2, :cond_0

    sget-object p3, LSh/A;->b:LSh/A$a;

    const/4 v0, 0x0

    invoke-virtual {p3, p2, v0}, LSh/A$a;->e(LSh/A;I)LSh/A;

    move-result-object v3

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v9}, LSh/e;->o(LSh/e;Lli/N;LSh/A;ZZLjava/lang/Boolean;ZILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public abstract l(LUh/b;LWh/c;)Ljava/lang/Object;
.end method

.method protected final p(Lli/N;LSh/x;)LSh/x;
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_1

    instance-of p2, p1, Lli/N$a;

    if-eqz p2, :cond_0

    check-cast p1, Lli/N$a;

    invoke-direct {p0, p1}, LSh/e;->A(Lli/N$a;)LSh/x;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :cond_1
    :goto_0
    return-object p2
.end method

.method protected abstract q(LSh/x;)LSh/e$a;
.end method

.method protected r(LSh/x;)[B
    .locals 1

    const-string v0, "kotlinClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method protected final s(Lkotlin/reflect/jvm/internal/impl/protobuf/n;LWh/c;LWh/g;Lli/d;Z)LSh/A;
    .locals 8

    const-string v0, "proto"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LUh/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    sget-object p4, LSh/A;->b:LSh/A$a;

    sget-object p5, LYh/i;->a:LYh/i;

    check-cast p1, LUh/d;

    invoke-virtual {p5, p1, p2, p3}, LYh/i;->b(LUh/d;LWh/c;LWh/g;)LYh/d$b;

    move-result-object p1

    if-nez p1, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p4, p1}, LSh/A$a;->b(LYh/d;)LSh/A;

    move-result-object v1

    goto/16 :goto_0

    :cond_1
    instance-of v0, p1, LUh/i;

    if-eqz v0, :cond_3

    sget-object p4, LSh/A;->b:LSh/A$a;

    sget-object p5, LYh/i;->a:LYh/i;

    check-cast p1, LUh/i;

    invoke-virtual {p5, p1, p2, p3}, LYh/i;->e(LUh/i;LWh/c;LWh/g;)LYh/d$b;

    move-result-object p1

    if-nez p1, :cond_2

    return-object v1

    :cond_2
    invoke-virtual {p4, p1}, LSh/A$a;->b(LYh/d;)LSh/A;

    move-result-object v1

    goto :goto_0

    :cond_3
    instance-of v0, p1, LUh/n;

    if-eqz v0, :cond_8

    move-object v0, p1

    check-cast v0, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;

    sget-object v2, LXh/a;->d:Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;

    const-string v3, "propertySignature"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v2}, LWh/e;->a(Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXh/a$d;

    if-nez v0, :cond_4

    return-object v1

    :cond_4
    sget-object v2, LSh/e$d;->a:[I

    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    move-result p4

    aget p4, v2, p4

    const/4 v2, 0x1

    if-eq p4, v2, :cond_7

    const/4 v2, 0x2

    if-eq p4, v2, :cond_6

    const/4 v0, 0x3

    if-eq p4, v0, :cond_5

    goto :goto_0

    :cond_5
    move-object v2, p1

    check-cast v2, LUh/n;

    const/4 v5, 0x1

    const/4 v6, 0x1

    move-object v3, p2

    move-object v4, p3

    move v7, p5

    invoke-static/range {v2 .. v7}, LSh/f;->a(LUh/n;LWh/c;LWh/g;ZZZ)LSh/A;

    move-result-object v1

    goto :goto_0

    :cond_6
    invoke-virtual {v0}, LXh/a$d;->N0()Z

    move-result p1

    if-eqz p1, :cond_8

    sget-object p1, LSh/A;->b:LSh/A$a;

    invoke-virtual {v0}, LXh/a$d;->C0()LXh/a$c;

    move-result-object p3

    const-string p4, "getSetter(...)"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2, p3}, LSh/A$a;->c(LWh/c;LXh/a$c;)LSh/A;

    move-result-object v1

    goto :goto_0

    :cond_7
    invoke-virtual {v0}, LXh/a$d;->M0()Z

    move-result p1

    if-eqz p1, :cond_8

    sget-object p1, LSh/A;->b:LSh/A$a;

    invoke-virtual {v0}, LXh/a$d;->q0()LXh/a$c;

    move-result-object p3

    const-string p4, "getGetter(...)"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2, p3}, LSh/A$a;->c(LWh/c;LXh/a$c;)LSh/A;

    move-result-object v1

    :cond_8
    :goto_0
    return-object v1
.end method

.method public abstract u()LYh/e;
.end method

.method protected final v()LSh/v;
    .locals 1

    iget-object v0, p0, LSh/e;->a:LSh/v;

    return-object v0
.end method

.method protected final w(LZh/b;)Z
    .locals 3

    const-string v0, "classId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LZh/b;->e()LZh/b;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LZh/b;->h()LZh/f;

    move-result-object v0

    invoke-virtual {v0}, LZh/f;->b()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Container"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LSh/e;->a:LSh/v;

    invoke-virtual {p0}, LSh/e;->u()LYh/e;

    move-result-object v2

    invoke-static {v0, p1, v2}, LSh/w;->b(LSh/v;LZh/b;LYh/e;)LSh/x;

    move-result-object p1

    if-eqz p1, :cond_1

    sget-object v0, Lyh/a;->a:Lyh/a;

    invoke-virtual {v0, p1}, Lyh/a;->c(LSh/x;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    :goto_0
    return v1
.end method

.method protected abstract x(LZh/b;LBh/g0;Ljava/util/List;)LSh/x$a;
.end method

.method protected final y(LZh/b;LBh/g0;Ljava/util/List;)LSh/x$a;
    .locals 1

    const-string v0, "annotationClassId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lyh/a;->a:Lyh/a;

    invoke-virtual {v0}, Lyh/a;->b()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LSh/e;->x(LZh/b;LBh/g0;Ljava/util/List;)LSh/x$a;

    move-result-object p1

    return-object p1
.end method
