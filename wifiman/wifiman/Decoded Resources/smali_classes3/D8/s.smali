.class public final LD8/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD8/j$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD8/s$a;,
        LD8/s$b;
    }
.end annotation


# static fields
.field public static final h:LD8/s$a;

.field static final synthetic i:[Lth/l;

.field public static final j:I


# instance fields
.field private final a:LYg/m;

.field private final b:LYg/m;

.field private final c:LYg/m;

.field private final d:LYg/m;

.field private final e:LFg/a;

.field private final f:Lgg/i;

.field private final g:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LD8/s;

    const-string/jumbo v2, "wifiWifiConnectionService"

    const-string/jumbo v3, "getWifiWifiConnectionService()Lcom/ui/wifiman/model/wifi/connection/WifiConnectionService;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "wifiScanner"

    const-string/jumbo v5, "getWifiScanner()Lcom/ui/wifiman/model/wifi/scan/WifiScannerService;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/F;

    const-string/jumbo v5, "wifiEnvironment"

    const-string/jumbo v6, "getWifiEnvironment()Lcom/ui/wifiman/model/wifi/channel/WifiEnvironmentService;"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v3

    new-instance v5, Lkotlin/jvm/internal/F;

    const-string/jumbo v6, "viewRouter"

    const-string/jumbo v7, "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;"

    invoke-direct {v5, v1, v6, v7, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v5}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/4 v5, 0x4

    new-array v5, v5, [Lth/l;

    aput-object v0, v5, v4

    const/4 v0, 0x1

    aput-object v2, v5, v0

    const/4 v0, 0x2

    aput-object v3, v5, v0

    const/4 v0, 0x3

    aput-object v1, v5, v0

    sput-object v5, LD8/s;->i:[Lth/l;

    new-instance v0, LD8/s$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LD8/s$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LD8/s;->h:LD8/s$a;

    const/16 v0, 0x8

    sput v0, LD8/s;->j:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 8

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, LD8/s$e;

    invoke-direct {v1}, LD8/s$e;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string/jumbo v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, Lje/u;

    invoke-direct {v0, v1, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    sget-object v3, LD8/s;->i:[Lth/l;

    const/4 v4, 0x0

    aget-object v5, v3, v4

    invoke-interface {v0, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LD8/s;->a:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v5, LD8/s$f;

    invoke-direct {v5}, LD8/s$f;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Lle/g;

    invoke-direct {v0, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p1, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v5, 0x1

    aget-object v6, v3, v5

    invoke-interface {v0, p0, v6}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LD8/s;->b:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v6, LD8/s$g;

    invoke-direct {v6}, LD8/s$g;-><init>()V

    invoke-virtual {v6}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v6

    invoke-static {v6}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v7, Lie/f;

    invoke-direct {v0, v6, v7}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p1, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v6, 0x2

    aget-object v6, v3, v6

    invoke-interface {v0, p0, v6}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LD8/s;->c:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v6, LD8/s$h;

    invoke-direct {v6}, LD8/s$h;-><init>()V

    invoke-virtual {v6}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v6

    invoke-static {v6}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Li8/a;

    invoke-direct {v0, v6, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p1, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v0, 0x3

    aget-object v0, v3, v0

    invoke-interface {p1, p0, v0}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LD8/s;->d:LYg/m;

    sget-object p1, LS8/c;->GHZ_6:LS8/c;

    invoke-static {p1}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p1

    const-string/jumbo v0, "createDefault(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LD8/s;->e:LFg/a;

    invoke-direct {p0}, LD8/s;->N()Lje/u;

    move-result-object v0

    invoke-interface {v0}, Lje/u;->a()Lgg/i;

    move-result-object v0

    sget-object v1, LD8/s$i;->a:LD8/s$i;

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    invoke-virtual {p1, v1, v4, v5}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    sget-object v1, LD8/s$j;->a:LD8/s$j;

    invoke-static {v0, p1, v1}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v5}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LD8/s;->f:Lgg/i;

    invoke-virtual {p0}, LD8/s;->c()Lgg/i;

    move-result-object p1

    invoke-direct {p0}, LD8/s;->N()Lje/u;

    move-result-object v1

    invoke-interface {v1}, Lje/u;->a()Lgg/i;

    move-result-object v1

    invoke-direct {p0}, LD8/s;->M()Lle/g;

    move-result-object v2

    invoke-interface {v2}, Lle/g;->b()Lgg/i;

    move-result-object v2

    invoke-direct {p0}, LD8/s;->L()Lie/f;

    move-result-object v3

    invoke-interface {v3}, Lie/f;->b()Lgg/i;

    move-result-object v3

    new-instance v4, LD8/s$c;

    invoke-direct {v4, p0}, LD8/s$c;-><init>(LD8/s;)V

    invoke-static {p1, v1, v2, v3, v4}, Lgg/i;->t(LDj/a;LDj/a;LDj/a;LDj/a;Lkg/h;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v5}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LD8/s;->g:Lgg/i;

    return-void
.end method

.method private final A(LS8/c;)LW7/e;
    .locals 1

    sget-object v0, LD8/s$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    sget-object p1, LW7/e;->FAIR:LW7/e;

    :goto_1
    return-object p1
.end method

.method private final B(Lje/q;ZZ)Laf/Q;
    .locals 7

    new-instance v6, Laf/Q;

    invoke-virtual {p1}, Lje/q;->c()LS8/c;

    move-result-object v1

    invoke-virtual {p1}, Lje/q;->i()Lke/a;

    move-result-object v0

    instance-of v3, v0, Lke/a$a$a;

    invoke-virtual {p1}, Lje/q;->i()Lke/a;

    move-result-object p1

    instance-of v4, p1, Lke/a$a$a$a;

    move-object v0, v6

    move v2, p2

    move v5, p3

    invoke-direct/range {v0 .. v5}, Laf/Q;-><init>(LS8/c;ZZZZ)V

    return-object v6
.end method

.method private final C(LS8/c;LS8/d;)LW7/e;
    .locals 2

    sget-object v0, LD8/s$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    sget-object p1, LD8/s$b;->c:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    sget-object v1, LW7/e;->FAIR:LW7/e;

    goto :goto_0

    :pswitch_1
    sget-object v1, LW7/e;->POOR:LW7/e;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, LD8/s$b;->c:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    packed-switch p1, :pswitch_data_1

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_2
    sget-object v1, LW7/e;->FAIR:LW7/e;

    goto :goto_0

    :pswitch_3
    sget-object v1, LW7/e;->POOR:LW7/e;

    :cond_2
    :goto_0
    :pswitch_4
    return-object v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method

.method private final D(LS8/f$a;)LW7/e;
    .locals 1

    sget-object v0, LD8/s$b;->d:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    sget-object p1, LW7/e;->POOR:LW7/e;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, LW7/e;->FAIR:LW7/e;

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method private final E(Lje/q;Lle/i;Lie/c;)Ljava/util/List;
    .locals 4

    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object v0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lje/q;->f()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    sget-object v1, Laf/O$b$a;->CHANNEL:Laf/O$b$a;

    new-instance v2, Ls9/d$b;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const v3, 0x7f1101fe

    invoke-direct {v2, v3, p1}, Ls9/d$b;-><init>(ILjava/util/List;)V

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Lie/c;->b()LS8/f;

    move-result-object p1

    invoke-virtual {p1}, LS8/f;->b()LS8/f$a;

    move-result-object p1

    invoke-direct {p0, p1}, LD8/s;->D(LS8/f$a;)LW7/e;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    new-instance p3, Laf/O$b;

    invoke-direct {p3, v1, v2, p1}, Laf/O$b;-><init>(Laf/O$b$a;Ls9/d;LW7/e;)V

    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lle/i;->t()Ljava/lang/Float;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    const/high16 p2, 0x42c80000    # 100.0f

    mul-float/2addr p1, p2

    invoke-static {p1}, Loh/b;->e(F)I

    move-result p1

    new-instance p2, Laf/O$b;

    sget-object p3, Laf/O$b$a;->UTILIZATION:Laf/O$b$a;

    new-instance v1, Ls9/d$b;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const v3, 0x7f1103c1

    invoke-direct {v1, v3, v2}, Ls9/d$b;-><init>(ILjava/util/List;)V

    invoke-direct {p0, p1}, LD8/s;->J(I)LW7/e;

    move-result-object p1

    invoke-direct {p2, p3, v1, p1}, Laf/O$b;-><init>(Laf/O$b$a;Ls9/d;LW7/e;)V

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-static {v0}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private final F(LS8/a;)LW7/e;
    .locals 1

    sget-object v0, LS8/a;->AC:LS8/a;

    invoke-virtual {p1, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-gez v0, :cond_0

    sget-object p1, LW7/e;->POOR:LW7/e;

    return-object p1

    :cond_0
    sget-object v0, LS8/a;->AD:LS8/a;

    invoke-virtual {p1, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result p1

    if-gez p1, :cond_1

    sget-object p1, LW7/e;->FAIR:LW7/e;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private final G(Ljava/util/List;)Laf/O$a;
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

    sget-object v3, LW7/e;->GOOD:LW7/e;

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

.method private final H(Lje/r$b$a;Lje/q;Lle/i;)Ljava/util/List;
    .locals 7

    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Lje/r$b$a;->e()LS8/a;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v1, Laf/O$b;

    sget-object v2, Laf/O$b$a;->STANDARD:Laf/O$b$a;

    invoke-static {p1}, LNe/b;->b(LS8/a;)Ls9/d;

    move-result-object v3

    invoke-direct {p0, p1}, LD8/s;->F(LS8/a;)LW7/e;

    move-result-object p1

    invoke-direct {v1, v2, v3, p1}, Laf/O$b;-><init>(Laf/O$b$a;Ls9/d;LW7/e;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    if-eqz p3, :cond_1

    invoke-virtual {p3}, Lle/i;->n()Lcom/ubnt/usurvey/wifi/WifiMcs;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/ubnt/usurvey/wifi/WifiMcs;->c()I

    move-result p1

    new-instance p3, Laf/O$b;

    sget-object v2, Laf/O$b$a;->MIMO:Laf/O$b$a;

    new-instance v3, Ls9/d$c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string/jumbo v4, "x"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v3, p1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p3

    invoke-direct/range {v1 .. v6}, Laf/O$b;-><init>(Laf/O$b$a;Ls9/d;LW7/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lje/q;->h()LS8/l;

    move-result-object p1

    if-eqz p1, :cond_2

    new-instance p2, Laf/O$b;

    sget-object p3, Laf/O$b$a;->SIGNAL:Laf/O$b$a;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v1, v3, v2, v3}, LNe/f;->h(LW7/f;ZLW7/f$a;ILjava/lang/Object;)Ls9/d;

    move-result-object v1

    invoke-direct {p0, p1}, LD8/s;->I(LS8/l;)LW7/e;

    move-result-object p1

    invoke-direct {p2, p3, v1, p1}, Laf/O$b;-><init>(Laf/O$b$a;Ls9/d;LW7/e;)V

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-static {v0}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private final I(LS8/l;)LW7/e;
    .locals 2

    invoke-virtual {p1}, LS8/l;->j()LW7/f$a;

    move-result-object p1

    sget-object v0, LD8/s$b;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    sget-object v1, LW7/e;->POOR:LW7/e;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    return-object v1
.end method

.method private final J(I)LW7/e;
    .locals 2

    const/16 v0, 0x1e

    const/4 v1, 0x0

    if-ge p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x32

    if-ge p1, v0, :cond_1

    goto :goto_0

    :cond_1
    const/16 v0, 0x46

    if-ge p1, v0, :cond_2

    sget-object v1, LW7/e;->FAIR:LW7/e;

    goto :goto_0

    :cond_2
    sget-object v1, LW7/e;->POOR:LW7/e;

    :goto_0
    return-object v1
.end method

.method private final K()Li8/a;
    .locals 1

    iget-object v0, p0, LD8/s;->d:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method

.method private final L()Lie/f;
    .locals 1

    iget-object v0, p0, LD8/s;->c:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lie/f;

    return-object v0
.end method

.method private final M()Lle/g;
    .locals 1

    iget-object v0, p0, LD8/s;->b:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lle/g;

    return-object v0
.end method

.method private final N()Lje/u;
    .locals 1

    iget-object v0, p0, LD8/s;->a:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lje/u;

    return-object v0
.end method

.method public static synthetic f(LD8/s;Lje/r$b$a$a;LS8/c;)LYg/s;
    .locals 0

    invoke-static {p0, p1, p2}, LD8/s;->u(LD8/s;Lje/r$b$a$a;LS8/c;)LYg/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(LD8/s;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;LS8/c;)LYg/s;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LD8/s;->x(LD8/s;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;LS8/c;)LYg/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(LD8/s;Lje/r$b$a$a;Ljava/util/Map;Ljava/util/Map;LS8/c;)LYg/s;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LD8/s;->w(LD8/s;Lje/r$b$a$a;Ljava/util/Map;Ljava/util/Map;LS8/c;)LYg/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lje/r$b$a$a;Ljava/util/Map;LD8/s;LS8/c;)LYg/s;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LD8/s;->v(Lje/r$b$a$a;Ljava/util/Map;LD8/s;LS8/c;)LYg/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Laf/O$b;)LW7/e;
    .locals 0

    invoke-static {p0}, LD8/s;->s(Laf/O$b;)LW7/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Laf/O$b;)LW7/e;
    .locals 0

    invoke-static {p0}, LD8/s;->r(Laf/O$b;)LW7/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Laf/O$b;)LW7/e;
    .locals 0

    invoke-static {p0}, LD8/s;->t(Laf/O$b;)LW7/e;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic m(LD8/s;Lje/r$b$a$a;LS8/c;Ljava/util/List;Ljava/util/Map;)Laf/P;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LD8/s;->p(Lje/r$b$a$a;LS8/c;Ljava/util/List;Ljava/util/Map;)Laf/P;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic n(LD8/s;Lje/r$b$a$b;Ljava/util/List;Ljava/util/Map;)Laf/P;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LD8/s;->q(Lje/r$b$a$b;Ljava/util/List;Ljava/util/Map;)Laf/P;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic o(LD8/s;)LFg/a;
    .locals 0

    iget-object p0, p0, LD8/s;->e:LFg/a;

    return-object p0
.end method

.method private final p(Lje/r$b$a$a;LS8/c;Ljava/util/List;Ljava/util/Map;)Laf/P;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-static {}, LZg/d0;->b()Ljava/util/Set;

    move-result-object v2

    invoke-static {}, LS8/c;->getEntries()Lfh/a;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LS8/c;

    invoke-virtual {v1, v4}, Lje/r$b$a$a;->o(LS8/c;)Lje/q;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-interface {v2, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v2}, LZg/d0;->a(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v2

    invoke-virtual/range {p1 .. p2}, Lje/r$b$a$a;->o(LS8/c;)Lje/q;

    move-result-object v3

    if-nez v3, :cond_2

    invoke-virtual/range {p1 .. p1}, Lje/r$b$a$a;->s()Lje/q;

    move-result-object v3

    if-nez v3, :cond_2

    invoke-virtual/range {p1 .. p1}, Lje/r$b$a$a;->r()Lje/q;

    move-result-object v3

    if-nez v3, :cond_2

    invoke-virtual/range {p1 .. p1}, Lje/r$b$a$a;->q()Lje/q;

    move-result-object v3

    :cond_2
    move-object/from16 v4, p3

    check-cast v4, Ljava/lang/Iterable;

    const/16 v5, 0xa

    invoke-static {v4, v5}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-static {v5}, LZg/U;->d(I)I

    move-result v5

    const/16 v6, 0x10

    invoke-static {v5, v6}, Lsh/m;->d(II)I

    move-result v5

    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6, v5}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Lle/i;

    invoke-virtual {v7}, Lle/i;->f()LS8/e;

    move-result-object v7

    invoke-virtual {v7}, LS8/e;->a()LS8/c;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object v4

    new-instance v5, LD8/o;

    invoke-direct {v5, v0, v1}, LD8/o;-><init>(LD8/s;Lje/r$b$a$a;)V

    invoke-static {v4, v5}, Lzi/m;->N(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v4

    invoke-static {v4}, LZg/U;->u(Lzi/j;)Ljava/util/Map;

    move-result-object v4

    invoke-static {v2}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object v5

    new-instance v7, LD8/p;

    invoke-direct {v7, v1, v6, v0}, LD8/p;-><init>(Lje/r$b$a$a;Ljava/util/Map;LD8/s;)V

    invoke-static {v5, v7}, Lzi/m;->N(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v5

    invoke-static {v5}, LZg/U;->u(Lzi/j;)Ljava/util/Map;

    move-result-object v5

    invoke-static {v2}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object v7

    new-instance v8, LD8/q;

    move-object/from16 v9, p4

    invoke-direct {v8, v0, v1, v6, v9}, LD8/q;-><init>(LD8/s;Lje/r$b$a$a;Ljava/util/Map;Ljava/util/Map;)V

    invoke-static {v7, v8}, Lzi/m;->N(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v6

    invoke-static {v6}, LZg/U;->u(Lzi/j;)Ljava/util/Map;

    move-result-object v6

    invoke-static {v2}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object v7

    new-instance v8, LD8/r;

    invoke-direct {v8, v0, v4, v5, v6}, LD8/r;-><init>(LD8/s;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V

    invoke-static {v7, v8}, Lzi/m;->N(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v7

    invoke-static {v7}, LZg/U;->u(Lzi/j;)Ljava/util/Map;

    move-result-object v7

    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object v8

    invoke-static {}, LS8/c;->getEntries()Lfh/a;

    move-result-object v9

    invoke-static {v9}, LZg/v;->P0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v9

    check-cast v9, Ljava/lang/Iterable;

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    const/4 v11, 0x0

    if-eqz v10, :cond_7

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LS8/c;

    invoke-virtual {v1, v10}, Lje/r$b$a$a;->o(LS8/c;)Lje/q;

    move-result-object v12

    if-nez v12, :cond_4

    goto :goto_2

    :cond_4
    if-eqz v3, :cond_5

    invoke-virtual {v3}, Lje/q;->c()LS8/c;

    move-result-object v11

    :cond_5
    const/4 v13, 0x1

    if-ne v11, v10, :cond_6

    move v11, v13

    goto :goto_3

    :cond_6
    const/4 v11, 0x0

    :goto_3
    invoke-interface {v7, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    instance-of v10, v10, Laf/O$a$a;

    xor-int/2addr v10, v13

    invoke-direct {v0, v12, v11, v10}, LD8/s;->B(Lje/q;ZZ)Laf/Q;

    move-result-object v10

    invoke-interface {v8, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    invoke-static {v8}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    new-instance v7, Lkotlin/jvm/internal/N;

    invoke-direct {v7}, Lkotlin/jvm/internal/N;-><init>()V

    sget-object v8, LW7/e;->EXCELLENT:LW7/e;

    iput-object v8, v7, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {v2}, LZg/v;->F0(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, LS8/c;

    if-eqz v2, :cond_a

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    if-eqz v8, :cond_8

    check-cast v8, Ljava/lang/Iterable;

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Laf/O$b;

    invoke-virtual {v9}, Laf/O$b;->a()LW7/e;

    move-result-object v9

    invoke-static {v7, v9}, LD8/s;->y(Lkotlin/jvm/internal/N;LW7/e;)V

    goto :goto_4

    :cond_8
    invoke-interface {v5, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    if-eqz v8, :cond_9

    check-cast v8, Ljava/lang/Iterable;

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_9

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Laf/O$b;

    invoke-virtual {v9}, Laf/O$b;->a()LW7/e;

    move-result-object v9

    invoke-static {v7, v9}, LD8/s;->y(Lkotlin/jvm/internal/N;LW7/e;)V

    goto :goto_5

    :cond_9
    invoke-interface {v6, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_a

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Laf/O$b;

    invoke-virtual {v8}, Laf/O$b;->a()LW7/e;

    move-result-object v8

    invoke-static {v7, v8}, LD8/s;->y(Lkotlin/jvm/internal/N;LW7/e;)V

    goto :goto_6

    :cond_a
    new-instance v13, Ls9/d$b;

    const v2, 0x7f110292

    invoke-direct {v13, v2}, Ls9/d$b;-><init>(I)V

    sget-object v14, LAf/w;->a:LAf/w;

    iget-object v2, v7, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    move-object v15, v2

    check-cast v15, LW7/e;

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, LCi/a;->h(Ljava/lang/Iterable;)LCi/c;

    move-result-object v16

    if-eqz v3, :cond_c

    invoke-virtual {v3}, Lje/q;->c()LS8/c;

    move-result-object v1

    if-eqz v1, :cond_c

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_c

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_b

    goto :goto_7

    :cond_b
    move-object v1, v11

    :goto_7
    if-eqz v1, :cond_c

    new-instance v2, Laf/O;

    new-instance v4, Ls9/d$b;

    const v7, 0x7f110291

    invoke-direct {v4, v7}, Ls9/d$b;-><init>(I)V

    invoke-direct {v0, v1}, LD8/s;->G(Ljava/util/List;)Laf/O$a;

    move-result-object v21

    const/16 v23, 0x10

    const/16 v24, 0x0

    const-string/jumbo v18, "band"

    const/16 v22, 0x0

    move-object/from16 v17, v2

    move-object/from16 v19, v4

    move-object/from16 v20, v1

    invoke-direct/range {v17 .. v24}, Laf/O;-><init>(Ljava/lang/String;Ls9/d;Ljava/util/List;Laf/O$a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_8

    :cond_c
    move-object/from16 v17, v11

    :goto_8
    if-eqz v3, :cond_e

    invoke-virtual {v3}, Lje/q;->c()LS8/c;

    move-result-object v1

    if-eqz v1, :cond_e

    invoke-interface {v5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_e

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_d

    goto :goto_9

    :cond_d
    move-object v1, v11

    :goto_9
    if-eqz v1, :cond_e

    new-instance v2, Laf/O;

    new-instance v4, Ls9/d$b;

    const v5, 0x7f110290

    invoke-direct {v4, v5}, Ls9/d$b;-><init>(I)V

    invoke-direct {v0, v1}, LD8/s;->G(Ljava/util/List;)Laf/O$a;

    move-result-object v22

    const/16 v24, 0x10

    const/16 v25, 0x0

    const-string/jumbo v19, "radio"

    const/16 v23, 0x0

    move-object/from16 v18, v2

    move-object/from16 v20, v4

    move-object/from16 v21, v1

    invoke-direct/range {v18 .. v25}, Laf/O;-><init>(Ljava/lang/String;Ls9/d;Ljava/util/List;Laf/O$a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_a

    :cond_e
    move-object/from16 v18, v11

    :goto_a
    if-eqz v3, :cond_10

    invoke-virtual {v3}, Lje/q;->c()LS8/c;

    move-result-object v1

    if-eqz v1, :cond_10

    invoke-interface {v6, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_10

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_f

    move-object v6, v1

    goto :goto_b

    :cond_f
    move-object v6, v11

    :goto_b
    if-eqz v6, :cond_10

    new-instance v11, Laf/O;

    new-instance v5, Ls9/d$b;

    const v1, 0x7f11028e

    invoke-direct {v5, v1}, Ls9/d$b;-><init>(I)V

    invoke-direct {v0, v6}, LD8/s;->G(Ljava/util/List;)Laf/O$a;

    move-result-object v7

    const/16 v9, 0x10

    const/4 v10, 0x0

    const-string/jumbo v4, "health"

    const/4 v8, 0x0

    move-object v3, v11

    invoke-direct/range {v3 .. v10}, Laf/O;-><init>(Ljava/lang/String;Ls9/d;Ljava/util/List;Laf/O$a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_10
    move-object/from16 v19, v11

    new-instance v1, Laf/P;

    move-object v12, v1

    invoke-direct/range {v12 .. v19}, Laf/P;-><init>(Ls9/d;LDe/g;LW7/e;LCi/c;Laf/O;Laf/O;Laf/O;)V

    return-object v1
.end method

.method private final q(Lje/r$b$a$b;Ljava/util/List;Ljava/util/Map;)Laf/P;
    .locals 26

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Lje/r$b$a$b;->m()Lje/q;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LD8/s;->z(Lje/q;Z)Ljava/util/List;

    move-result-object v6

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v11, 0x0

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lle/i;

    invoke-virtual {v3}, Lle/i;->e()Lh9/a;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lje/r$b$a$b;->m()Lje/q;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lje/q;->e()Lh9/a;

    move-result-object v4

    goto :goto_0

    :cond_1
    move-object v4, v11

    :goto_0
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_2
    move-object v2, v11

    :goto_1
    check-cast v2, Lle/i;

    invoke-virtual/range {p1 .. p1}, Lje/r$b$a$b;->m()Lje/q;

    move-result-object v1

    move-object/from16 v3, p1

    invoke-direct {v0, v3, v1, v2}, LD8/s;->H(Lje/r$b$a;Lje/q;Lle/i;)Ljava/util/List;

    move-result-object v15

    invoke-virtual/range {p1 .. p1}, Lje/r$b$a$b;->m()Lje/q;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lje/r$b$a$b;->m()Lje/q;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lje/q;->c()LS8/c;

    move-result-object v3

    if-eqz v3, :cond_3

    move-object/from16 v4, p3

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lie/c;

    goto :goto_2

    :cond_3
    move-object v3, v11

    :goto_2
    invoke-direct {v0, v1, v2, v3}, LD8/s;->E(Lje/q;Lle/i;Lie/c;)Ljava/util/List;

    move-result-object v1

    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object v2

    move-object v3, v6

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object v3

    new-instance v4, LD8/l;

    invoke-direct {v4}, LD8/l;-><init>()V

    invoke-static {v3, v4}, Lzi/m;->O(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v3

    invoke-interface {v3}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LW7/e;

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    move-object v3, v15

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object v3

    new-instance v4, LD8/m;

    invoke-direct {v4}, LD8/m;-><init>()V

    invoke-static {v3, v4}, Lzi/m;->O(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v3

    invoke-interface {v3}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LW7/e;

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_5
    move-object v3, v1

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object v3

    new-instance v4, LD8/n;

    invoke-direct {v4}, LD8/n;-><init>()V

    invoke-static {v3, v4}, Lzi/m;->O(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v3

    invoke-interface {v3}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LW7/e;

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_6
    invoke-static {v2}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LW7/e;

    if-nez v2, :cond_7

    sget-object v2, LW7/e;->EXCELLENT:LW7/e;

    :cond_7
    new-instance v14, Ls9/d$b;

    const v3, 0x7f110292

    invoke-direct {v14, v3}, Ls9/d$b;-><init>(I)V

    invoke-static {}, LCi/a;->a()LCi/f;

    move-result-object v24

    new-instance v25, Laf/O;

    new-instance v5, Ls9/d$b;

    const v3, 0x7f110291

    invoke-direct {v5, v3}, Ls9/d$b;-><init>(I)V

    invoke-direct {v0, v6}, LD8/s;->G(Ljava/util/List;)Laf/O$a;

    move-result-object v7

    const/16 v9, 0x10

    const/4 v10, 0x0

    const-string/jumbo v4, "band"

    const/4 v8, 0x0

    move-object/from16 v3, v25

    invoke-direct/range {v3 .. v10}, Laf/O;-><init>(Ljava/lang/String;Ls9/d;Ljava/util/List;Laf/O$a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Laf/O;

    new-instance v4, Ls9/d$b;

    const v5, 0x7f110290

    invoke-direct {v4, v5}, Ls9/d$b;-><init>(I)V

    invoke-direct {v0, v15}, LD8/s;->G(Ljava/util/List;)Laf/O$a;

    move-result-object v16

    const/16 v18, 0x10

    const/16 v19, 0x0

    const-string/jumbo v13, "radio"

    const/16 v17, 0x0

    move-object v12, v3

    move-object v5, v14

    move-object v14, v4

    invoke-direct/range {v12 .. v19}, Laf/O;-><init>(Ljava/lang/String;Ls9/d;Ljava/util/List;Laf/O$a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3}, Laf/O;->d()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_8

    goto :goto_6

    :cond_8
    move-object v3, v11

    :goto_6
    new-instance v4, Laf/O;

    new-instance v6, Ls9/d$b;

    const v7, 0x7f11028e

    invoke-direct {v6, v7}, Ls9/d$b;-><init>(I)V

    invoke-direct {v0, v1}, LD8/s;->G(Ljava/util/List;)Laf/O$a;

    move-result-object v20

    const/16 v22, 0x10

    const/16 v23, 0x0

    const-string/jumbo v17, "health"

    const/16 v21, 0x0

    move-object/from16 v16, v4

    move-object/from16 v18, v6

    move-object/from16 v19, v1

    invoke-direct/range {v16 .. v23}, Laf/O;-><init>(Ljava/lang/String;Ls9/d;Ljava/util/List;Laf/O$a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v4}, Laf/O;->d()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_9

    move-object/from16 v23, v4

    goto :goto_7

    :cond_9
    move-object/from16 v23, v11

    :goto_7
    new-instance v1, Laf/P;

    const/16 v18, 0x0

    move-object/from16 v16, v1

    move-object/from16 v17, v5

    move-object/from16 v19, v2

    move-object/from16 v20, v24

    move-object/from16 v21, v25

    move-object/from16 v22, v3

    invoke-direct/range {v16 .. v23}, Laf/P;-><init>(Ls9/d;LDe/g;LW7/e;LCi/c;Laf/O;Laf/O;Laf/O;)V

    return-object v1
.end method

.method private static final r(Laf/O$b;)LW7/e;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Laf/O$b;->a()LW7/e;

    move-result-object p0

    return-object p0
.end method

.method private static final s(Laf/O$b;)LW7/e;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Laf/O$b;->a()LW7/e;

    move-result-object p0

    return-object p0
.end method

.method private static final t(Laf/O$b;)LW7/e;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Laf/O$b;->a()LW7/e;

    move-result-object p0

    return-object p0
.end method

.method private static final u(LD8/s;Lje/r$b$a$a;LS8/c;)LYg/s;
    .locals 1

    const-string/jumbo v0, "band"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lje/r$b$a$a;->o(LS8/c;)Lje/q;

    move-result-object p1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, LD8/s;->z(Lje/q;Z)Ljava/util/List;

    move-result-object p0

    invoke-static {p2, p0}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p0

    return-object p0
.end method

.method private static final v(Lje/r$b$a$a;Ljava/util/Map;LD8/s;LS8/c;)LYg/s;
    .locals 1

    const-string/jumbo v0, "band"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p3}, Lje/r$b$a$a;->o(LS8/c;)Lje/q;

    move-result-object v0

    invoke-interface {p1, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lle/i;

    invoke-direct {p2, p0, v0, p1}, LD8/s;->H(Lje/r$b$a;Lje/q;Lle/i;)Ljava/util/List;

    move-result-object p0

    invoke-static {p3, p0}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p0

    return-object p0
.end method

.method private static final w(LD8/s;Lje/r$b$a$a;Ljava/util/Map;Ljava/util/Map;LS8/c;)LYg/s;
    .locals 1

    const-string/jumbo v0, "band"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p4}, Lje/r$b$a$a;->o(LS8/c;)Lje/q;

    move-result-object p1

    invoke-interface {p2, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lle/i;

    invoke-interface {p3, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lie/c;

    invoke-direct {p0, p1, p2, p3}, LD8/s;->E(Lje/q;Lle/i;Lie/c;)Ljava/util/List;

    move-result-object p0

    invoke-static {p4, p0}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p0

    return-object p0
.end method

.method private static final x(LD8/s;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;LS8/c;)LYg/s;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {p1, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_0

    check-cast p1, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    invoke-interface {p2, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_1

    check-cast p1, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_1
    invoke-interface {p3, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_2

    check-cast p1, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_2
    sget-object p1, LYg/J;->a:LYg/J;

    invoke-static {v0}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, LD8/s;->G(Ljava/util/List;)Laf/O$a;

    move-result-object p0

    invoke-static {p4, p0}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p0

    return-object p0
.end method

.method private static final y(Lkotlin/jvm/internal/N;LW7/e;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v0, LW7/e;

    invoke-virtual {v0, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-lez v0, :cond_0

    iput-object p1, p0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private final z(Lje/q;Z)Ljava/util/List;
    .locals 4

    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object v0

    if-nez p2, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lje/q;->c()LS8/c;

    move-result-object p2

    if-eqz p2, :cond_0

    new-instance v1, Laf/O$b;

    sget-object v2, Laf/O$b$a;->BAND:Laf/O$b$a;

    invoke-static {p2}, LNe/h;->c(LS8/c;)Ls9/d;

    move-result-object v3

    invoke-direct {p0, p2}, LD8/s;->A(LS8/c;)LW7/e;

    move-result-object p2

    invoke-direct {v1, v2, v3, p2}, Laf/O$b;-><init>(Laf/O$b$a;Ls9/d;LW7/e;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lje/q;->d()LS8/d;

    move-result-object p2

    if-eqz p2, :cond_1

    new-instance v1, Laf/O$b;

    sget-object v2, Laf/O$b$a;->CHANNEL_WIDTH:Laf/O$b$a;

    invoke-static {p2}, LNe/i;->a(LS8/d;)Ls9/d;

    move-result-object v3

    invoke-virtual {p1}, Lje/q;->c()LS8/c;

    move-result-object p1

    invoke-direct {p0, p1, p2}, LD8/s;->C(LS8/c;LS8/d;)LW7/e;

    move-result-object p1

    invoke-direct {v1, v2, v3, p1}, Laf/O$b;-><init>(Laf/O$b$a;Ls9/d;LW7/e;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-static {v0}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lgg/b;
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    const-string/jumbo v2, "id"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const v3, -0x48cafda4

    if-eq v2, v3, :cond_4

    const v3, 0x2e0635

    if-eq v2, v3, :cond_2

    const v3, 0x67413fb

    if-eq v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const-string/jumbo v2, "radio"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-direct {p0}, LD8/s;->K()Li8/a;

    move-result-object p1

    new-instance v2, Li8/a$b$A;

    sget-object v3, Lef/b$b$c;->b:Lef/b$b$c;

    invoke-direct {v2, v3}, Li8/a$b$A;-><init>(Lef/b;)V

    new-array v1, v1, [Li8/a$b;

    aput-object v2, v1, v0

    invoke-interface {p1, v1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    goto :goto_1

    :cond_2
    const-string/jumbo v2, "band"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-direct {p0}, LD8/s;->K()Li8/a;

    move-result-object p1

    new-instance v2, Li8/a$b$A;

    sget-object v3, Lef/b$b$d;->b:Lef/b$b$d;

    invoke-direct {v2, v3}, Li8/a$b$A;-><init>(Lef/b;)V

    new-array v1, v1, [Li8/a$b;

    aput-object v2, v1, v0

    invoke-interface {p1, v1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    goto :goto_1

    :cond_4
    const-string/jumbo v2, "health"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    :goto_0
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "complete(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    invoke-direct {p0}, LD8/s;->K()Li8/a;

    move-result-object p1

    new-instance v2, Li8/a$b$A;

    sget-object v3, Lef/b$b$a;->b:Lef/b$b$a;

    invoke-direct {v2, v3}, Li8/a$b$A;-><init>(Lef/b;)V

    new-array v1, v1, [Li8/a$b;

    aput-object v2, v1, v0

    invoke-interface {p1, v1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, LD8/s;->g:Lgg/i;

    return-object v0
.end method

.method public c()Lgg/i;
    .locals 1

    iget-object v0, p0, LD8/s;->f:Lgg/i;

    return-object v0
.end method

.method public d(LS8/c;)Lgg/b;
    .locals 1

    const-string/jumbo v0, "band"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LD8/s$d;

    invoke-direct {v0, p0, p1}, LD8/s$d;-><init>(LD8/s;LS8/c;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public e()Lgg/b;
    .locals 4

    invoke-direct {p0}, LD8/s;->K()Li8/a;

    move-result-object v0

    new-instance v1, Li8/a$b$A;

    sget-object v2, Lef/b$b$b;->b:Lef/b$b$b;

    invoke-direct {v1, v2}, Li8/a$b$A;-><init>(Lef/b;)V

    const/4 v2, 0x1

    new-array v2, v2, [Li8/a$b;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    invoke-interface {v0, v2}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v0

    return-object v0
.end method
