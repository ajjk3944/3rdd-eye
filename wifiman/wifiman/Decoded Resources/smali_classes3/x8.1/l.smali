.class public final Lx8/l;
.super Lcom/ui/wifiman/ui/signal/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx8/l$a;
    }
.end annotation


# static fields
.field static final synthetic k:[Lth/l;

.field public static final l:I


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:Lgg/i;

.field private final j:LLi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/F;

    const-string/jumbo v1, "getScreenConfig()Lcom/ui/wifiman/model/ui/SignalTabConfigManager;"

    const/4 v2, 0x0

    const-class v3, Lx8/l;

    const-string/jumbo v4, "screenConfig"

    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lth/l;

    aput-object v0, v1, v2

    sput-object v1, Lx8/l;->k:[Lth/l;

    const/16 v0, 0x8

    sput v0, Lx8/l;->l:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 7

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/ui/wifiman/ui/signal/e;-><init>()V

    iput-object p1, p0, Lx8/l;->g:Lorg/kodein/di/DI;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, Lx8/l$c;

    invoke-direct {v0}, Lx8/l$c;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, Lde/z;

    invoke-direct {p1, v0, v1}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    sget-object v0, Lx8/l;->k:[Lth/l;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {p1, p0, v0}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lx8/l;->h:LYg/m;

    invoke-direct {p0}, Lx8/l;->q0()Lde/z;

    move-result-object p1

    invoke-interface {p1}, Lee/c;->b()Lgg/i;

    move-result-object p1

    sget-object v0, Lx8/l$b;->a:Lx8/l$b;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lx8/l;->i:Lgg/i;

    sget-object v0, Lx8/l$d;->a:Lx8/l$d;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v2

    const-string/jumbo p1, "map(...)"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lye/g;->h0(Lye/g;Lgg/i;Ljava/lang/Object;Landroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, Lx8/l;->j:LLi/N;

    return-void
.end method

.method public static synthetic p0(Lcom/ui/wifiman/ui/signal/d;Lde/y;)Lde/y;
    .locals 0

    invoke-static {p0, p1}, Lx8/l;->r0(Lcom/ui/wifiman/ui/signal/d;Lde/y;)Lde/y;

    move-result-object p0

    return-object p0
.end method

.method private final q0()Lde/z;
    .locals 1

    iget-object v0, p0, Lx8/l;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lde/z;

    return-object v0
.end method

.method private static final r0(Lcom/ui/wifiman/ui/signal/d;Lde/y;)Lde/y;
    .locals 6

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lx8/l$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    sget-object p0, Lgc/a;->FLOORPLAN:Lgc/a;

    :goto_0
    move-object v1, p0

    goto :goto_1

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Lgc/a;->SIGNAL:Lgc/a;

    goto :goto_0

    :goto_1
    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Lde/y;->b(Lde/y;Lgc/a;Lgc/b;Lgc/c;ILjava/lang/Object;)Lde/y;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, Lx8/l;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public l0()V
    .locals 0

    invoke-super {p0}, Lye/g;->l0()V

    return-void
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, Lx8/l;->j:LLi/N;

    return-object v0
.end method

.method public o0(Lcom/ui/wifiman/ui/signal/d;)V
    .locals 3

    const-string/jumbo v0, "tab"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, Lx8/l;->q0()Lde/z;

    move-result-object v1

    new-instance v2, Lx8/k;

    invoke-direct {v2, p1}, Lx8/k;-><init>(Lcom/ui/wifiman/ui/signal/d;)V

    invoke-interface {v1, v2}, Lee/c;->a(Lmh/l;)Lgg/b;

    move-result-object p1

    invoke-virtual {v0, p1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method
