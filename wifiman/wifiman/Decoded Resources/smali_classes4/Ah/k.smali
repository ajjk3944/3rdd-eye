.class public final LAh/k;
.super Lkotlin/reflect/jvm/internal/impl/builtins/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LAh/k$a;,
        LAh/k$b;,
        LAh/k$c;
    }
.end annotation


# static fields
.field static final synthetic k:[Lth/l;


# instance fields
.field private final h:LAh/k$a;

.field private i:Lmh/a;

.field private final j:Loi/i;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LAh/k;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v1

    const-string v2, "customizer"

    const-string v3, "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"

    invoke-direct {v0, v1, v2, v3}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lth/l;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, LAh/k;->k:[Lth/l;

    return-void
.end method

.method public constructor <init>(Loi/n;LAh/k$a;)V
    .locals 1

    const-string v0, "storageManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;-><init>(Loi/n;)V

    iput-object p2, p0, LAh/k;->h:LAh/k$a;

    new-instance v0, LAh/h;

    invoke-direct {v0, p0, p1}, LAh/h;-><init>(LAh/k;Loi/n;)V

    invoke-interface {p1, v0}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p1

    iput-object p1, p0, LAh/k;->j:Loi/i;

    sget-object p1, LAh/k$c;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    const/4 p2, 0x1

    if-eq p1, p2, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    invoke-virtual {p0, p2}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->f(Z)V

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->f(Z)V

    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic F0(LAh/k;Loi/n;)LAh/u;
    .locals 0

    invoke-static {p0, p1}, LAh/k;->I0(LAh/k;Loi/n;)LAh/u;

    move-result-object p0

    return-object p0
.end method

.method static synthetic G0(LBh/G;Z)LAh/k$b;
    .locals 0

    invoke-static {p0, p1}, LAh/k;->N0(LBh/G;Z)LAh/k$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic H0(LAh/k;)LAh/k$b;
    .locals 0

    invoke-static {p0}, LAh/k;->J0(LAh/k;)LAh/k$b;

    move-result-object p0

    return-object p0
.end method

.method private static final I0(LAh/k;Loi/n;)LAh/u;
    .locals 3

    new-instance v0, LAh/u;

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->r()LDh/F;

    move-result-object v1

    const-string v2, "getBuiltInsModule(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, LAh/j;

    invoke-direct {v2, p0}, LAh/j;-><init>(LAh/k;)V

    invoke-direct {v0, v1, p1, v2}, LAh/u;-><init>(LBh/G;Loi/n;Lmh/a;)V

    return-object v0
.end method

.method private static final J0(LAh/k;)LAh/k$b;
    .locals 2

    iget-object v0, p0, LAh/k;->i:Lmh/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LAh/k$b;

    const/4 v1, 0x0

    iput-object v1, p0, LAh/k;->i:Lmh/a;

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    const-string v0, "JvmBuiltins instance has not been initialized properly"

    invoke-direct {p0, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0
.end method

.method private static final N0(LBh/G;Z)LAh/k$b;
    .locals 1

    new-instance v0, LAh/k$b;

    invoke-direct {v0, p0, p1}, LAh/k$b;-><init>(LBh/G;Z)V

    return-object v0
.end method


# virtual methods
.method protected K0()Ljava/util/List;
    .locals 8

    invoke-super {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->v()Ljava/lang/Iterable;

    move-result-object v0

    const-string v1, "getClassDescriptorFactories(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LAh/g;

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->U()Loi/n;

    move-result-object v3

    const-string v2, "getStorageManager(...)"

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->r()LDh/F;

    move-result-object v4

    const-string v2, "getBuiltInsModule(...)"

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v7}, LAh/g;-><init>(Loi/n;LBh/G;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0, v1}, LZg/v;->L0(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final L0()LAh/u;
    .locals 3

    iget-object v0, p0, LAh/k;->j:Loi/i;

    sget-object v1, LAh/k;->k:[Lth/l;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Loi/m;->a(Loi/i;Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LAh/u;

    return-object v0
.end method

.method protected M()LCh/c;
    .locals 1

    invoke-virtual {p0}, LAh/k;->L0()LAh/u;

    move-result-object v0

    return-object v0
.end method

.method public final M0(LBh/G;Z)V
    .locals 1

    const-string v0, "moduleDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LAh/i;

    invoke-direct {v0, p1, p2}, LAh/i;-><init>(LBh/G;Z)V

    invoke-virtual {p0, v0}, LAh/k;->O0(Lmh/a;)V

    return-void
.end method

.method public final O0(Lmh/a;)V
    .locals 1

    const-string v0, "computation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LAh/k;->i:Lmh/a;

    return-void
.end method

.method protected g()LCh/a;
    .locals 1

    invoke-virtual {p0}, LAh/k;->L0()LAh/u;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic v()Ljava/lang/Iterable;
    .locals 1

    invoke-virtual {p0}, LAh/k;->K0()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    return-object v0
.end method
