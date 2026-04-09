.class public final Lwh/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lth/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwh/y0$a;
    }
.end annotation


# static fields
.field static final synthetic f:[Lth/l;


# instance fields
.field private final a:Lwh/A;

.field private final b:I

.field private final c:Lth/k$a;

.field private final d:Lwh/a1$a;

.field private final e:Lwh/a1$a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, Lwh/y0;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v2

    const-string v3, "descriptor"

    const-string v4, "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;"

    invoke-direct {v0, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v1

    const-string v3, "annotations"

    const-string v4, "getAnnotations()Ljava/util/List;"

    invoke-direct {v2, v1, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lth/l;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, Lwh/y0;->f:[Lth/l;

    return-void
.end method

.method public constructor <init>(Lwh/A;ILth/k$a;Lmh/a;)V
    .locals 1

    const-string v0, "callable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "computeDescriptor"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwh/y0;->a:Lwh/A;

    iput p2, p0, Lwh/y0;->b:I

    iput-object p3, p0, Lwh/y0;->c:Lth/k$a;

    invoke-static {p4}, Lwh/a1;->c(Lmh/a;)Lwh/a1$a;

    move-result-object p1

    iput-object p1, p0, Lwh/y0;->d:Lwh/a1$a;

    new-instance p1, Lwh/w0;

    invoke-direct {p1, p0}, Lwh/w0;-><init>(Lwh/y0;)V

    invoke-static {p1}, Lwh/a1;->c(Lmh/a;)Lwh/a1$a;

    move-result-object p1

    iput-object p1, p0, Lwh/y0;->e:Lwh/a1$a;

    return-void
.end method

.method private static final a(Lwh/y0;)Ljava/lang/reflect/Type;
    .locals 6

    invoke-direct {p0}, Lwh/y0;->m()LBh/V;

    move-result-object v0

    instance-of v1, v0, LBh/b0;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lwh/y0;->a:Lwh/A;

    invoke-virtual {v1}, Lwh/A;->Y()LBh/b;

    move-result-object v1

    invoke-static {v1}, Lwh/j1;->i(LBh/a;)LBh/b0;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lwh/y0;->a:Lwh/A;

    invoke-virtual {v1}, Lwh/A;->Y()LBh/b;

    move-result-object v1

    invoke-interface {v1}, LBh/b;->h()LBh/b$a;

    move-result-object v1

    sget-object v2, LBh/b$a;->FAKE_OVERRIDE:LBh/b$a;

    if-ne v1, v2, :cond_1

    iget-object p0, p0, Lwh/y0;->a:Lwh/A;

    invoke-virtual {p0}, Lwh/A;->Y()LBh/b;

    move-result-object p0

    invoke-interface {p0}, LBh/n;->b()LBh/m;

    move-result-object p0

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, LBh/e;

    invoke-static {p0}, Lwh/j1;->q(LBh/e;)Ljava/lang/Class;

    move-result-object p0

    if-eqz p0, :cond_0

    goto/16 :goto_1

    :cond_0
    new-instance p0, Lwh/Y0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot determine receiver Java type of inherited declaration: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lwh/Y0;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    iget-object v0, p0, Lwh/y0;->a:Lwh/A;

    invoke-virtual {v0}, Lwh/A;->V()Lxh/h;

    move-result-object v0

    instance-of v1, v0, Lxh/n;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    iget-object v1, p0, Lwh/y0;->a:Lwh/A;

    invoke-virtual {v1}, Lwh/A;->b0()Z

    move-result v1

    if-eqz v1, :cond_2

    check-cast v0, Lxh/n;

    invoke-virtual {p0}, Lwh/y0;->getIndex()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lxh/n;->f(I)Lsh/i;

    move-result-object v1

    invoke-virtual {v0, v2}, Lxh/n;->f(I)Lsh/i;

    move-result-object v3

    invoke-virtual {v3}, Lsh/g;->j()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v0}, Lxh/n;->a()Ljava/util/List;

    move-result-object v0

    new-instance v4, Lsh/i;

    invoke-virtual {v1}, Lsh/g;->i()I

    move-result v5

    sub-int/2addr v5, v3

    invoke-virtual {v1}, Lsh/g;->j()I

    move-result v1

    sub-int/2addr v1, v3

    invoke-direct {v4, v5, v1}, Lsh/i;-><init>(II)V

    invoke-static {v0, v4}, LZg/v;->U0(Ljava/util/List;Lsh/i;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_2
    check-cast v0, Lxh/n;

    invoke-virtual {p0}, Lwh/y0;->getIndex()I

    move-result v1

    invoke-virtual {v0, v1}, Lxh/n;->f(I)Lsh/i;

    move-result-object v1

    invoke-virtual {v0}, Lxh/n;->a()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v1}, LZg/v;->U0(Ljava/util/List;Lsh/i;)Ljava/util/List;

    move-result-object v0

    :goto_0
    check-cast v0, Ljava/util/Collection;

    new-array v1, v2, [Ljava/lang/reflect/Type;

    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/reflect/Type;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/reflect/Type;

    invoke-direct {p0, v0}, Lwh/y0;->i([Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object p0

    goto :goto_1

    :cond_3
    instance-of v1, v0, Lxh/n$b;

    if-eqz v1, :cond_4

    check-cast v0, Lxh/n$b;

    invoke-virtual {v0}, Lxh/n$b;->d()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lwh/y0;->getIndex()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    new-array v1, v2, [Ljava/lang/Class;

    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Class;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/reflect/Type;

    invoke-direct {p0, v0}, Lwh/y0;->i([Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object p0

    goto :goto_1

    :cond_4
    invoke-interface {v0}, Lxh/h;->a()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lwh/y0;->getIndex()I

    move-result p0

    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/reflect/Type;

    :goto_1
    return-object p0
.end method

.method static synthetic b(Lwh/y0;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lwh/y0;->f(Lwh/y0;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static synthetic e(Lwh/y0;)Ljava/lang/reflect/Type;
    .locals 0

    invoke-static {p0}, Lwh/y0;->a(Lwh/y0;)Ljava/lang/reflect/Type;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lwh/y0;)Ljava/util/List;
    .locals 0

    invoke-direct {p0}, Lwh/y0;->m()LBh/V;

    move-result-object p0

    invoke-static {p0}, Lwh/j1;->e(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final varargs i([Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
    .locals 2

    array-length v0, p1

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    new-instance v0, Lwh/y0$a;

    invoke-direct {v0, p1}, Lwh/y0$a;-><init>([Ljava/lang/reflect/Type;)V

    goto :goto_0

    :cond_0
    invoke-static {p1}, LZg/n;->Q0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/lang/reflect/Type;

    :goto_0
    return-object v0

    :cond_1
    new-instance p1, Llh/b;

    const-string v0, "Expected at least 1 type for compound type"

    invoke-direct {p1, v0}, Llh/b;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final m()LBh/V;
    .locals 3

    iget-object v0, p0, Lwh/y0;->d:Lwh/a1$a;

    sget-object v1, Lwh/y0;->f:[Lth/l;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lwh/a1$b;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LBh/V;

    return-object v0
.end method


# virtual methods
.method public S()Z
    .locals 2

    invoke-direct {p0}, Lwh/y0;->m()LBh/V;

    move-result-object v0

    instance-of v1, v0, LBh/s0;

    if-eqz v1, :cond_0

    check-cast v0, LBh/s0;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, Lfi/e;->f(LBh/s0;)Z

    move-result v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public c()Z
    .locals 2

    invoke-direct {p0}, Lwh/y0;->m()LBh/V;

    move-result-object v0

    instance-of v1, v0, LBh/s0;

    if-eqz v1, :cond_0

    check-cast v0, LBh/s0;

    invoke-interface {v0}, LBh/s0;->j0()Lpi/S;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lwh/y0;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lwh/y0;->a:Lwh/A;

    check-cast p1, Lwh/y0;

    iget-object v1, p1, Lwh/y0;->a:Lwh/A;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lwh/y0;->getIndex()I

    move-result v0

    invoke-virtual {p1}, Lwh/y0;->getIndex()I

    move-result p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public getIndex()I
    .locals 1

    iget v0, p0, Lwh/y0;->b:I

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 3

    invoke-direct {p0}, Lwh/y0;->m()LBh/V;

    move-result-object v0

    instance-of v1, v0, LBh/s0;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, LBh/s0;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-nez v0, :cond_1

    return-object v2

    :cond_1
    invoke-interface {v0}, LBh/s0;->b()LBh/a;

    move-result-object v1

    invoke-interface {v1}, LBh/a;->H()Z

    move-result v1

    if-eqz v1, :cond_2

    return-object v2

    :cond_2
    invoke-interface {v0}, LBh/I;->getName()LZh/f;

    move-result-object v0

    const-string v1, "getName(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, LZh/f;->j()Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, LZh/f;->b()Ljava/lang/String;

    move-result-object v2

    :goto_1
    return-object v2
.end method

.method public getType()Lth/p;
    .locals 3

    new-instance v0, Lwh/U0;

    invoke-direct {p0}, Lwh/y0;->m()LBh/V;

    move-result-object v1

    invoke-interface {v1}, LBh/r0;->getType()Lpi/S;

    move-result-object v1

    const-string v2, "getType(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lwh/x0;

    invoke-direct {v2, p0}, Lwh/x0;-><init>(Lwh/y0;)V

    invoke-direct {v0, v1, v2}, Lwh/U0;-><init>(Lpi/S;Lmh/a;)V

    return-object v0
.end method

.method public h()Lth/k$a;
    .locals 1

    iget-object v0, p0, Lwh/y0;->c:Lth/k$a;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lwh/y0;->a:Lwh/A;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lwh/y0;->getIndex()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final k()Lwh/A;
    .locals 1

    iget-object v0, p0, Lwh/y0;->a:Lwh/A;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    sget-object v0, Lwh/e1;->a:Lwh/e1;

    invoke-virtual {v0, p0}, Lwh/e1;->j(Lwh/y0;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
