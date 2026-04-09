.class public final LD8/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD8/j$a;


# static fields
.field static final synthetic d:[Lth/l;

.field public static final e:I


# instance fields
.field private final a:LYg/m;

.field private final b:LYg/m;

.field private final c:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LD8/k;

    const-string/jumbo v2, "service"

    const-string/jumbo v3, "getService()Lcom/ui/wifiman/model/cellular/CellularSignalService;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "viewRouter"

    const-string/jumbo v5, "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lth/l;

    aput-object v0, v2, v4

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, LD8/k;->d:[Lth/l;

    const/16 v0, 0x8

    sput v0, LD8/k;->e:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 5

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, LD8/k$d;

    invoke-direct {v1}, LD8/k$d;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string/jumbo v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, LBc/a;

    invoke-direct {v0, v1, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    sget-object v3, LD8/k;->d:[Lth/l;

    const/4 v4, 0x0

    aget-object v4, v3, v4

    invoke-interface {v0, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LD8/k;->a:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v4, LD8/k$e;

    invoke-direct {v4}, LD8/k$e;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Li8/a;

    invoke-direct {v0, v4, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p1, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v0, 0x1

    aget-object v1, v3, v0

    invoke-interface {p1, p0, v1}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LD8/k;->b:LYg/m;

    invoke-direct {p0}, LD8/k;->h()LBc/a;

    move-result-object p1

    invoke-interface {p1}, LBc/a;->e()Lgg/i;

    move-result-object p1

    new-instance v1, LD8/k$a;

    invoke-direct {v1, p0}, LD8/k$a;-><init>(LD8/k;)V

    invoke-virtual {p1, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-direct {p0}, LD8/k;->h()LBc/a;

    move-result-object v1

    invoke-interface {v1}, LBc/a;->d()Lgg/i;

    move-result-object v1

    new-instance v2, LD8/k$b;

    invoke-direct {v2, p0}, LD8/k$b;-><init>(LD8/k;)V

    invoke-virtual {v1, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    sget-object v2, LD8/k$c;->a:LD8/k$c;

    invoke-static {p1, v1, v2}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LD8/k;->c:Lgg/i;

    return-void
.end method

.method public static final synthetic f(LD8/k;LBc/a$b;I)Laf/O;
    .locals 0

    invoke-direct {p0, p1, p2}, LD8/k;->i(LBc/a$b;I)Laf/O;

    move-result-object p0

    return-object p0
.end method

.method private final g(Ljava/util/List;)Laf/O$a;
    .locals 4

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Laf/O$b;

    invoke-virtual {v2}, Laf/O$b;->a()LW7/e;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Laf/O$b;->a()LW7/e;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    sget-object v3, LW7/e;->EXCELLENT:LW7/e;

    invoke-virtual {v2, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v2

    if-gez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_1

    :cond_0
    move v2, v0

    :goto_1
    add-int/2addr v1, v2

    goto :goto_0

    :cond_1
    if-lez v1, :cond_2

    new-instance p1, Laf/O$a$b;

    invoke-direct {p1, v1}, Laf/O$a$b;-><init>(I)V

    return-object p1

    :cond_2
    sget-object p1, Laf/O$a$a;->a:Laf/O$a$a;

    return-object p1
.end method

.method private final h()LBc/a;
    .locals 1

    iget-object v0, p0, LD8/k;->a:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBc/a;

    return-object v0
.end method

.method private final i(LBc/a$b;I)Laf/O;
    .locals 13

    instance-of v0, p1, LBc/a$b$a$b;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    check-cast p1, LBc/a$b$a$b;

    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, LBc/a$b$a$b;->a()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    new-instance v9, Laf/O$b;

    sget-object v4, Laf/O$b$a;->PROVIDER:Laf/O$b$a;

    new-instance v5, Ls9/d$c;

    invoke-direct {v5, v2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v3, v9

    invoke-direct/range {v3 .. v8}, Laf/O$b;-><init>(Laf/O$b$a;Ls9/d;LW7/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual {p1}, LBc/a$b$a$b;->c()LV7/b;

    move-result-object v2

    if-eqz v2, :cond_1

    new-instance v3, Laf/O$b;

    sget-object v4, Laf/O$b$a;->STANDARD:Laf/O$b$a;

    new-instance v5, Ls9/d$b;

    invoke-static {v2}, LNe/a;->a(LV7/b;)I

    move-result v6

    invoke-direct {v5, v6}, Ls9/d$b;-><init>(I)V

    invoke-direct {p0, v2}, LD8/k;->j(LV7/b;)LW7/e;

    move-result-object v2

    invoke-direct {v3, v4, v5, v2}, Laf/O$b;-><init>(Laf/O$b$a;Ls9/d;LW7/e;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {p1}, LBc/a$b$a$b;->b()LV7/a;

    move-result-object p1

    if-eqz p1, :cond_2

    new-instance v2, Laf/O$b;

    sget-object v3, Laf/O$b$a;->SIGNAL:Laf/O$b$a;

    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-static {p1, v4, v1, v5, v1}, LNe/f;->h(LW7/f;ZLW7/f$a;ILjava/lang/Object;)Ls9/d;

    move-result-object v4

    invoke-virtual {p1}, LW7/f;->h()LW7/f$a;

    move-result-object p1

    invoke-static {p1}, LNe/f;->b(LW7/f$a;)LW7/e;

    move-result-object p1

    invoke-direct {v2, v3, v4, p1}, Laf/O$b;-><init>(Laf/O$b$a;Ls9/d;LW7/e;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-static {v0}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v8

    new-instance p1, Laf/O;

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ls9/d$b;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p2}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    const v0, 0x7f11027b

    invoke-direct {v7, v0, p2}, Ls9/d$b;-><init>(ILjava/util/List;)V

    invoke-direct {p0, v8}, LD8/k;->g(Ljava/util/List;)Laf/O$a;

    move-result-object v9

    const/16 v11, 0x10

    const/4 v12, 0x0

    const/4 v10, 0x0

    move-object v5, p1

    invoke-direct/range {v5 .. v12}, Laf/O;-><init>(Ljava/lang/String;Ls9/d;Ljava/util/List;Laf/O$a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1}, Laf/O;->d()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_3

    move-object v1, p1

    :cond_3
    return-object v1

    :cond_4
    instance-of p2, p1, LBc/a$b$a$a;

    if-nez p2, :cond_6

    instance-of p2, p1, LBc/a$b$a$c;

    if-nez p2, :cond_6

    instance-of p1, p1, LBc/a$b$b;

    if-eqz p1, :cond_5

    goto :goto_0

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_6
    :goto_0
    return-object v1
.end method

.method private final j(LV7/b;)LW7/e;
    .locals 1

    instance-of v0, p1, LV7/b$e;

    if-nez v0, :cond_4

    instance-of v0, p1, LV7/b$a;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, LV7/b$b;

    if-eqz v0, :cond_1

    sget-object p1, LW7/e;->FAIR:LW7/e;

    goto :goto_2

    :cond_1
    instance-of v0, p1, LV7/b$c;

    if-nez v0, :cond_3

    instance-of p1, p1, LV7/b$d;

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    :goto_0
    const/4 p1, 0x0

    goto :goto_2

    :cond_4
    :goto_1
    sget-object p1, LW7/e;->POOR:LW7/e;

    :goto_2
    return-object p1
.end method

.method private final k()Li8/a;
    .locals 1

    iget-object v0, p0, LD8/k;->b:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lgg/b;
    .locals 3

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LD8/k;->k()Li8/a;

    move-result-object p1

    new-instance v0, Li8/a$b$A;

    sget-object v1, Lef/b$a$a;->b:Lef/b$a$a;

    invoke-direct {v0, v1}, Li8/a$b$A;-><init>(Lef/b;)V

    const/4 v1, 0x1

    new-array v1, v1, [Li8/a$b;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    invoke-interface {p1, v1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, LD8/k;->c:Lgg/i;

    return-object v0
.end method
