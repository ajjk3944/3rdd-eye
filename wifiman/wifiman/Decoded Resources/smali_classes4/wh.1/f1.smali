.class public final Lwh/f1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lwh/f1;

.field private static final b:LZh/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lwh/f1;

    invoke-direct {v0}, Lwh/f1;-><init>()V

    sput-object v0, Lwh/f1;->a:Lwh/f1;

    sget-object v0, LZh/b;->d:LZh/b$a;

    new-instance v1, LZh/c;

    const-string v2, "java.lang.Void"

    invoke-direct {v1, v2}, LZh/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LZh/b$a;->c(LZh/c;)LZh/b;

    move-result-object v0

    sput-object v0, Lwh/f1;->b:LZh/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Ljava/lang/Class;)Lkotlin/reflect/jvm/internal/impl/builtins/l;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lgi/e;->get(Ljava/lang/String;)Lgi/e;

    move-result-object p1

    invoke-virtual {p1}, Lgi/e;->getPrimitiveType()Lkotlin/reflect/jvm/internal/impl/builtins/l;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method private final b(LBh/z;)Z
    .locals 3

    invoke-static {p1}, Lbi/h;->p(LBh/z;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_2

    invoke-static {p1}, Lbi/h;->q(LBh/z;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LBh/I;->getName()LZh/f;

    move-result-object v0

    sget-object v2, LAh/a;->e:LAh/a$a;

    invoke-virtual {v2}, LAh/a$a;->a()LZh/f;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, LBh/a;->i()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_0
    return v1
.end method

.method private final d(LBh/z;)Lwh/n$e;
    .locals 6

    new-instance v0, Lwh/n$e;

    new-instance v1, LYh/d$b;

    invoke-direct {p0, p1}, Lwh/f1;->e(LBh/b;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {p1, v5, v5, v3, v4}, LSh/C;->c(LBh/z;ZZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, p1}, LYh/d$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lwh/n$e;-><init>(LYh/d$b;)V

    return-object v0
.end method

.method private final e(LBh/b;)Ljava/lang/String;
    .locals 2

    invoke-static {p1}, LJh/T;->e(LBh/b;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    instance-of v0, p1, LBh/Z;

    const-string v1, "asString(...)"

    if-eqz v0, :cond_0

    invoke-static {p1}, Lfi/e;->w(LBh/b;)LBh/b;

    move-result-object p1

    invoke-interface {p1}, LBh/I;->getName()LZh/f;

    move-result-object p1

    invoke-virtual {p1}, LZh/f;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LJh/H;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    instance-of v0, p1, LBh/a0;

    if-eqz v0, :cond_1

    invoke-static {p1}, Lfi/e;->w(LBh/b;)LBh/b;

    move-result-object p1

    invoke-interface {p1}, LBh/I;->getName()LZh/f;

    move-result-object p1

    invoke-virtual {p1}, LZh/f;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LJh/H;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-interface {p1}, LBh/I;->getName()LZh/f;

    move-result-object p1

    invoke-virtual {p1}, LZh/f;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-object v0
.end method


# virtual methods
.method public final c(Ljava/lang/Class;)LZh/b;
    .locals 2

    const-string v0, "klass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p1

    const-string v0, "getComponentType(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lwh/f1;->a(Ljava/lang/Class;)Lkotlin/reflect/jvm/internal/impl/builtins/l;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, LZh/b;

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/builtins/o;->A:LZh/c;

    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/builtins/l;->getArrayTypeName()LZh/f;

    move-result-object p1

    invoke-direct {v0, v1, p1}, LZh/b;-><init>(LZh/c;LZh/f;)V

    return-object v0

    :cond_0
    sget-object p1, LZh/b;->d:LZh/b$a;

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->i:LZh/d;

    invoke-virtual {v0}, LZh/d;->l()LZh/c;

    move-result-object v0

    const-string v1, "toSafe(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, LZh/b$a;->c(LZh/c;)LZh/b;

    move-result-object p1

    return-object p1

    :cond_1
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p1, Lwh/f1;->b:LZh/b;

    return-object p1

    :cond_2
    invoke-direct {p0, p1}, Lwh/f1;->a(Ljava/lang/Class;)Lkotlin/reflect/jvm/internal/impl/builtins/l;

    move-result-object v0

    if-eqz v0, :cond_3

    new-instance p1, LZh/b;

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/builtins/o;->A:LZh/c;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/l;->getTypeName()LZh/f;

    move-result-object v0

    invoke-direct {p1, v1, v0}, LZh/b;-><init>(LZh/c;LZh/f;)V

    return-object p1

    :cond_3
    invoke-static {p1}, LGh/f;->e(Ljava/lang/Class;)LZh/b;

    move-result-object p1

    invoke-virtual {p1}, LZh/b;->i()Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, LAh/c;->a:LAh/c;

    invoke-virtual {p1}, LZh/b;->a()LZh/c;

    move-result-object v1

    invoke-virtual {v0, v1}, LAh/c;->m(LZh/c;)LZh/b;

    move-result-object v0

    if-eqz v0, :cond_4

    return-object v0

    :cond_4
    return-object p1
.end method

.method public final f(LBh/Y;)Lwh/p;
    .locals 7

    const-string v0, "possiblyOverriddenProperty"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lbi/i;->L(LBh/b;)LBh/b;

    move-result-object p1

    check-cast p1, LBh/Y;

    invoke-interface {p1}, LBh/Y;->a()LBh/Y;

    move-result-object v1

    const-string p1, "getOriginal(...)"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, v1, Lni/N;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    move-object p1, v1

    check-cast p1, Lni/N;

    invoke-virtual {p1}, Lni/N;->f1()LUh/n;

    move-result-object v2

    sget-object v3, LXh/a;->d:Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;

    const-string v4, "propertySignature"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v3}, LWh/e;->a(Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LXh/a$d;

    if-eqz v3, :cond_a

    new-instance v6, Lwh/p$c;

    invoke-virtual {p1}, Lni/N;->X()LWh/c;

    move-result-object v4

    invoke-virtual {p1}, Lni/N;->R()LWh/g;

    move-result-object v5

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lwh/p$c;-><init>(LBh/Y;LUh/n;LXh/a$d;LWh/c;LWh/g;)V

    return-object v6

    :cond_0
    instance-of p1, v1, LLh/f;

    if-eqz p1, :cond_a

    move-object p1, v1

    check-cast p1, LLh/f;

    invoke-virtual {p1}, LDh/n;->j()LBh/g0;

    move-result-object v2

    instance-of v3, v2, LPh/a;

    if-eqz v3, :cond_1

    check-cast v2, LPh/a;

    goto :goto_0

    :cond_1
    move-object v2, v0

    :goto_0
    if-eqz v2, :cond_2

    invoke-interface {v2}, LPh/a;->b()LQh/l;

    move-result-object v2

    goto :goto_1

    :cond_2
    move-object v2, v0

    :goto_1
    instance-of v3, v2, LGh/w;

    if-eqz v3, :cond_3

    new-instance p1, Lwh/p$a;

    check-cast v2, LGh/w;

    invoke-virtual {v2}, LGh/w;->U()Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-direct {p1, v0}, Lwh/p$a;-><init>(Ljava/lang/reflect/Field;)V

    goto :goto_6

    :cond_3
    instance-of v3, v2, LGh/z;

    if-eqz v3, :cond_9

    new-instance v1, Lwh/p$b;

    check-cast v2, LGh/z;

    invoke-virtual {v2}, LGh/z;->U()Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {p1}, LDh/K;->g()LBh/a0;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-interface {p1}, LBh/p;->j()LBh/g0;

    move-result-object p1

    goto :goto_2

    :cond_4
    move-object p1, v0

    :goto_2
    instance-of v3, p1, LPh/a;

    if-eqz v3, :cond_5

    check-cast p1, LPh/a;

    goto :goto_3

    :cond_5
    move-object p1, v0

    :goto_3
    if-eqz p1, :cond_6

    invoke-interface {p1}, LPh/a;->b()LQh/l;

    move-result-object p1

    goto :goto_4

    :cond_6
    move-object p1, v0

    :goto_4
    instance-of v3, p1, LGh/z;

    if-eqz v3, :cond_7

    check-cast p1, LGh/z;

    goto :goto_5

    :cond_7
    move-object p1, v0

    :goto_5
    if-eqz p1, :cond_8

    invoke-virtual {p1}, LGh/z;->U()Ljava/lang/reflect/Method;

    move-result-object v0

    :cond_8
    invoke-direct {v1, v2, v0}, Lwh/p$b;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    move-object p1, v1

    :goto_6
    return-object p1

    :cond_9
    new-instance p1, Lwh/Y0;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Incorrect resolution sequence for Java field "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " (source = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lwh/Y0;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    invoke-interface {v1}, LBh/Y;->d()LBh/Z;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lwh/f1;->d(LBh/z;)Lwh/n$e;

    move-result-object p1

    invoke-interface {v1}, LBh/Y;->g()LBh/a0;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-direct {p0, v1}, Lwh/f1;->d(LBh/z;)Lwh/n$e;

    move-result-object v0

    :cond_b
    new-instance v1, Lwh/p$d;

    invoke-direct {v1, p1, v0}, Lwh/p$d;-><init>(Lwh/n$e;Lwh/n$e;)V

    return-object v1
.end method

.method public final g(LBh/z;)Lwh/n;
    .locals 8

    const-string v0, "possiblySubstitutedFunction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lbi/i;->L(LBh/b;)LBh/b;

    move-result-object v0

    check-cast v0, LBh/z;

    invoke-interface {v0}, LBh/z;->a()LBh/z;

    move-result-object v0

    const-string v1, "getOriginal(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, v0, Lni/b;

    const/4 v2, 0x0

    if-eqz v1, :cond_9

    move-object v1, v0

    check-cast v1, Lni/t;

    invoke-interface {v1}, Lni/t;->F()Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    move-result-object v3

    instance-of v4, v3, LUh/i;

    if-eqz v4, :cond_0

    sget-object v4, LYh/i;->a:LYh/i;

    move-object v5, v3

    check-cast v5, LUh/i;

    invoke-interface {v1}, Lni/t;->X()LWh/c;

    move-result-object v6

    invoke-interface {v1}, Lni/t;->R()LWh/g;

    move-result-object v7

    invoke-virtual {v4, v5, v6, v7}, LYh/i;->e(LUh/i;LWh/c;LWh/g;)LYh/d$b;

    move-result-object v4

    if-eqz v4, :cond_0

    new-instance p1, Lwh/n$e;

    invoke-direct {p1, v4}, Lwh/n$e;-><init>(LYh/d$b;)V

    return-object p1

    :cond_0
    instance-of v4, v3, LUh/d;

    if-eqz v4, :cond_8

    sget-object v4, LYh/i;->a:LYh/i;

    check-cast v3, LUh/d;

    invoke-interface {v1}, Lni/t;->X()LWh/c;

    move-result-object v5

    invoke-interface {v1}, Lni/t;->R()LWh/g;

    move-result-object v1

    invoke-virtual {v4, v3, v5, v1}, LYh/i;->b(LUh/d;LWh/c;LWh/g;)LYh/d$b;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-interface {p1}, LBh/z;->b()LBh/m;

    move-result-object v0

    const-string v3, "getContainingDeclaration(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lbi/k;->b(LBh/m;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance p1, Lwh/n$e;

    invoke-direct {p1, v1}, Lwh/n$e;-><init>(LYh/d$b;)V

    goto/16 :goto_1

    :cond_1
    invoke-interface {p1}, LBh/z;->b()LBh/m;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lbi/k;->d(LBh/m;)Z

    move-result v0

    if-eqz v0, :cond_7

    check-cast p1, LBh/l;

    invoke-interface {p1}, LBh/l;->B()Z

    move-result v0

    const-string v3, ")V"

    const-string v4, "constructor-impl"

    const-string v5, "Invalid signature: "

    const/4 v6, 0x2

    const/4 v7, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {v1}, LYh/d$b;->e()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v1}, LYh/d$b;->d()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3, v7, v6, v2}, Lkotlin/text/t;->B(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    invoke-virtual {v1}, LYh/d$b;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, LBh/l;->C()LBh/e;

    move-result-object p1

    const-string v0, "getConstructedClass(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lxh/o;->u(LBh/h;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1}, LYh/d$b;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3, v7, v6, v2}, Lkotlin/text/t;->B(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, LYh/d$b;->d()Ljava/lang/String;

    move-result-object v3

    const-string v4, "V"

    invoke-static {v3, v4}, Lkotlin/text/t;->H0(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {v1, v2, p1, v0, v2}, LYh/d$b;->c(LYh/d$b;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)LYh/d$b;

    move-result-object v1

    goto :goto_0

    :cond_4
    invoke-virtual {v1}, LYh/d$b;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1, v7, v6, v2}, Lkotlin/text/t;->B(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    :goto_0
    new-instance p1, Lwh/n$e;

    invoke-direct {p1, v1}, Lwh/n$e;-><init>(LYh/d$b;)V

    goto :goto_1

    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance p1, Lwh/n$d;

    invoke-direct {p1, v1}, Lwh/n$d;-><init>(LYh/d$b;)V

    :goto_1
    return-object p1

    :cond_8
    invoke-direct {p0, v0}, Lwh/f1;->d(LBh/z;)Lwh/n$e;

    move-result-object p1

    return-object p1

    :cond_9
    instance-of p1, v0, LLh/e;

    if-eqz p1, :cond_e

    move-object p1, v0

    check-cast p1, LLh/e;

    invoke-virtual {p1}, LDh/n;->j()LBh/g0;

    move-result-object p1

    instance-of v1, p1, LPh/a;

    if-eqz v1, :cond_a

    check-cast p1, LPh/a;

    goto :goto_2

    :cond_a
    move-object p1, v2

    :goto_2
    if-eqz p1, :cond_b

    invoke-interface {p1}, LPh/a;->b()LQh/l;

    move-result-object p1

    goto :goto_3

    :cond_b
    move-object p1, v2

    :goto_3
    instance-of v1, p1, LGh/z;

    if-eqz v1, :cond_c

    move-object v2, p1

    check-cast v2, LGh/z;

    :cond_c
    if-eqz v2, :cond_d

    invoke-virtual {v2}, LGh/z;->U()Ljava/lang/reflect/Method;

    move-result-object p1

    if-eqz p1, :cond_d

    new-instance v0, Lwh/n$c;

    invoke-direct {v0, p1}, Lwh/n$c;-><init>(Ljava/lang/reflect/Method;)V

    return-object v0

    :cond_d
    new-instance p1, Lwh/Y0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Incorrect resolution sequence for Java method "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lwh/Y0;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    instance-of p1, v0, LLh/b;

    const/16 v1, 0x29

    const-string v3, " ("

    if-eqz p1, :cond_13

    move-object p1, v0

    check-cast p1, LLh/b;

    invoke-virtual {p1}, LDh/n;->j()LBh/g0;

    move-result-object p1

    instance-of v4, p1, LPh/a;

    if-eqz v4, :cond_f

    check-cast p1, LPh/a;

    goto :goto_4

    :cond_f
    move-object p1, v2

    :goto_4
    if-eqz p1, :cond_10

    invoke-interface {p1}, LPh/a;->b()LQh/l;

    move-result-object v2

    :cond_10
    instance-of p1, v2, LGh/t;

    if-eqz p1, :cond_11

    new-instance p1, Lwh/n$b;

    check-cast v2, LGh/t;

    invoke-virtual {v2}, LGh/t;->U()Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-direct {p1, v0}, Lwh/n$b;-><init>(Ljava/lang/reflect/Constructor;)V

    goto :goto_5

    :cond_11
    instance-of p1, v2, LGh/q;

    if-eqz p1, :cond_12

    move-object p1, v2

    check-cast p1, LGh/q;

    invoke-virtual {p1}, LGh/q;->n()Z

    move-result v4

    if-eqz v4, :cond_12

    new-instance v0, Lwh/n$a;

    invoke-virtual {p1}, LGh/q;->Y()Ljava/lang/Class;

    move-result-object p1

    invoke-direct {v0, p1}, Lwh/n$a;-><init>(Ljava/lang/Class;)V

    move-object p1, v0

    :goto_5
    return-object p1

    :cond_12
    new-instance p1, Lwh/Y0;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Incorrect resolution sequence for Java constructor "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lwh/Y0;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_13
    invoke-direct {p0, v0}, Lwh/f1;->b(LBh/z;)Z

    move-result p1

    if-eqz p1, :cond_14

    invoke-direct {p0, v0}, Lwh/f1;->d(LBh/z;)Lwh/n$e;

    move-result-object p1

    return-object p1

    :cond_14
    new-instance p1, Lwh/Y0;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unknown origin of "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lwh/Y0;-><init>(Ljava/lang/String;)V

    throw p1
.end method
