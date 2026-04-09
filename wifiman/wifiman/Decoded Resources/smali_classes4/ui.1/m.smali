.class final Lui/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lui/f;


# static fields
.field public static final a:Lui/m;

.field private static final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lui/m;

    invoke-direct {v0}, Lui/m;-><init>()V

    sput-object v0, Lui/m;->a:Lui/m;

    const-string v0, "should not have varargs or parameters with default values"

    sput-object v0, Lui/m;->b:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    sget-object v0, Lui/m;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b(LBh/z;)Z
    .locals 3

    const-string v0, "functionDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LBh/a;->i()Ljava/util/List;

    move-result-object p1

    const-string v0, "getValueParameters(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    instance-of v0, p1, Ljava/util/Collection;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBh/s0;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {v0}, Lfi/e;->f(LBh/s0;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-interface {v0}, LBh/s0;->j0()Lpi/S;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :cond_2
    :goto_1
    return v1
.end method

.method public c(LBh/z;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lui/f$a;->a(Lui/f;LBh/z;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
