.class final Lui/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lui/f;


# static fields
.field public static final a:Lui/j;

.field private static final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lui/j;

    invoke-direct {v0}, Lui/j;-><init>()V

    sput-object v0, Lui/j;->a:Lui/j;

    const-string v0, "second parameter must be of type KProperty<*> or its supertype"

    sput-object v0, Lui/j;->b:Ljava/lang/String;

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

    sget-object v0, Lui/j;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b(LBh/z;)Z
    .locals 2

    const-string v0, "functionDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LBh/a;->i()Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LBh/s0;

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/n;->k:Lkotlin/reflect/jvm/internal/impl/builtins/n$b;

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {p1}, Lfi/e;->s(LBh/m;)LBh/G;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/reflect/jvm/internal/impl/builtins/n$b;->a(LBh/G;)Lpi/S;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, LBh/r0;->getType()Lpi/S;

    move-result-object p1

    const-string v1, "getType(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lsi/d;->A(Lpi/S;)Lpi/S;

    move-result-object p1

    invoke-static {v0, p1}, Lsi/d;->w(Lpi/S;Lpi/S;)Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public c(LBh/z;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lui/f$a;->a(Lui/f;LBh/z;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
