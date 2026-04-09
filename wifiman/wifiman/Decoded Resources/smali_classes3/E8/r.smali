.class public final LE8/r;
.super Llf/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE8/r$a;
    }
.end annotation


# static fields
.field static final synthetic p:[Lth/l;

.field public static final q:I


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:LYg/m;

.field private final j:LYg/m;

.field private final k:LYg/m;

.field private final l:Lgg/i;

.field private final m:LLi/N;

.field private final n:Ljava/text/NumberFormat;

.field private final o:LLi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LE8/r;

    const-string/jumbo v2, "internetSpeedtestServerManager"

    const-string/jumbo v3, "getInternetSpeedtestServerManager()Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$ServerService;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "viewRouter"

    const-string/jumbo v5, "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/F;

    const-string/jumbo v5, "settingsManager"

    const-string/jumbo v6, "getSettingsManager()Lcom/ui/wifiman/model/settings/AppSettingsManager;"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v3

    new-instance v5, Lkotlin/jvm/internal/F;

    const-string/jumbo v6, "networkConnectionManager"

    const-string/jumbo v7, "getNetworkConnectionManager()Lcom/ui/wifiman/model/network/connection/NetworkConnectionManager;"

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

    sput-object v5, LE8/r;->p:[Lth/l;

    const/16 v0, 0x8

    sput v0, LE8/r;->q:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 11

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Llf/l;-><init>()V

    iput-object p1, p0, LE8/r;->g:Lorg/kodein/di/DI;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, LE8/r$h;

    invoke-direct {v0}, LE8/r$h;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d;

    invoke-direct {p1, v0, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    sget-object v2, LE8/r;->p:[Lth/l;

    const/4 v3, 0x0

    aget-object v4, v2, v3

    invoke-interface {p1, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LE8/r;->h:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v4, LE8/r$i;

    invoke-direct {v4}, LE8/r$i;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Li8/a;

    invoke-direct {p1, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v4, 0x1

    aget-object v5, v2, v4

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LE8/r;->i:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v5, LE8/r$j;

    invoke-direct {v5}, LE8/r$j;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Lmd/b;

    invoke-direct {p1, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v5, 0x2

    aget-object v5, v2, v5

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LE8/r;->j:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v5, LE8/r$k;

    invoke-direct {v5}, LE8/r$k;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, LZc/f;

    invoke-direct {p1, v5, v1}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v0, 0x3

    aget-object v0, v2, v0

    invoke-interface {p1, p0, v0}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LE8/r;->k:LYg/m;

    invoke-direct {p0}, LE8/r;->z0()Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d;

    move-result-object p1

    invoke-interface {p1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d;->b()Lgg/i;

    move-result-object p1

    invoke-direct {p0}, LE8/r;->A0()LZc/f;

    move-result-object v0

    invoke-interface {v0}, LZc/f;->getState()Lgg/i;

    move-result-object v0

    sget-object v1, LE8/r$b;->a:LE8/r$b;

    invoke-static {p1, v0, v1}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v4}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object v5

    const-string/jumbo p1, "refCount(...)"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v5, p0, LE8/r;->l:Lgg/i;

    sget-object v6, Llf/k$c;->a:Llf/k$c;

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v4, p0

    invoke-static/range {v4 .. v10}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, LE8/r;->m:LLi/N;

    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {p1}, Ljava/text/NumberFormat;->getInstance(Ljava/util/Locale;)Ljava/text/NumberFormat;

    move-result-object p1

    invoke-virtual {p1, v3}, Ljava/text/NumberFormat;->setMinimumFractionDigits(I)V

    invoke-virtual {p1, v3}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    iput-object p1, p0, LE8/r;->n:Ljava/text/NumberFormat;

    invoke-direct {p0}, LE8/r;->z0()Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d;

    move-result-object p1

    invoke-interface {p1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d;->d()Lgg/i;

    move-result-object p1

    invoke-direct {p0}, LE8/r;->z0()Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d;

    move-result-object v0

    invoke-interface {v0}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d;->b()Lgg/i;

    move-result-object v0

    invoke-direct {p0}, LE8/r;->B0()Lmd/b;

    move-result-object v1

    invoke-interface {v1}, Lee/c;->b()Lgg/i;

    move-result-object v1

    sget-object v2, LE8/r$f;->a:LE8/r$f;

    invoke-virtual {v1, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v1

    new-instance v2, LE8/r$g;

    invoke-direct {v2, p0}, LE8/r$g;-><init>(LE8/r;)V

    invoke-static {p1, v0, v1, v2}, Lgg/i;->u(LDj/a;LDj/a;LDj/a;Lkg/g;)Lgg/i;

    move-result-object v4

    const-string/jumbo p1, "combineLatest(...)"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, LEe/g;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    invoke-direct {v5, p1}, LEe/g;-><init>(Ljava/util/List;)V

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v9}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, LE8/r;->o:LLi/N;

    return-void
.end method

.method private final A0()LZc/f;
    .locals 1

    iget-object v0, p0, LE8/r;->k:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZc/f;

    return-object v0
.end method

.method private final B0()Lmd/b;
    .locals 1

    iget-object v0, p0, LE8/r;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmd/b;

    return-object v0
.end method

.method private final C0()Li8/a;
    .locals 1

    iget-object v0, p0, LE8/r;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method

.method private final D0(Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;LT7/c;Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c;)Lmf/a$a;
    .locals 7

    instance-of v0, p3, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$b;

    if-eqz v0, :cond_0

    check-cast p3, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$b;

    invoke-virtual {p3}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$b;->a()Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;

    move-result-object p3

    invoke-virtual {p3}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;->a()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    :goto_0
    move v5, p3

    goto :goto_1

    :cond_0
    instance-of v0, p3, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$c;

    if-eqz v0, :cond_1

    check-cast p3, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$c;

    invoke-virtual {p3}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$c;->a()Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;

    move-result-object p3

    invoke-virtual {p3}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;->a()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    goto :goto_0

    :cond_1
    instance-of p3, p3, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$a;

    if-eqz p3, :cond_6

    const/4 p3, 0x0

    goto :goto_0

    :goto_1
    instance-of p3, p1, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;

    const-string v0, ""

    if-eqz p3, :cond_3

    new-instance p3, Lmf/a$a;

    move-object v1, p1

    check-cast v1, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;->a()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ls9/d$c;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;->c()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    move-object v0, v4

    :goto_2
    invoke-direct {v3, v0}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    new-instance v4, Ls9/d$a;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;->i()Ljava/lang/String;

    move-result-object v1

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, LE8/r$l;

    invoke-direct {v1, p1, p0, p2}, LE8/r$l;-><init>(Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;LE8/r;LT7/c;)V

    invoke-direct {v4, v0, v1}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    const/4 p1, 0x0

    move-object v0, p3

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    move v4, p1

    invoke-direct/range {v0 .. v5}, Lmf/a$a;-><init>(Ljava/lang/String;Ls9/d;Ls9/d;ZZ)V

    goto :goto_4

    :cond_3
    instance-of p2, p1, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;

    if-eqz p2, :cond_5

    check-cast p1, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;->h()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    new-instance p2, Ls9/d$c;

    invoke-direct {p2, p1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    move-object v2, p2

    goto :goto_3

    :cond_4
    new-instance p1, Ls9/d$c;

    invoke-direct {p1, v0}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    move-object v2, p1

    :goto_3
    new-instance v3, Ls9/d$b;

    const p1, 0x7f1102c4

    invoke-direct {v3, p1}, Ls9/d$b;-><init>(I)V

    new-instance p3, Lmf/a$a;

    const/4 v4, 0x1

    move-object v0, p3

    invoke-direct/range {v0 .. v5}, Lmf/a$a;-><init>(Ljava/lang/String;Ls9/d;Ls9/d;ZZ)V

    :goto_4
    return-object p3

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public static final synthetic r0(LE8/r;Z)Lmf/a$a;
    .locals 0

    invoke-direct {p0, p1}, LE8/r;->x0(Z)Lmf/a$a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic s0(LE8/r;FLT7/c;)Ls9/d;
    .locals 0

    invoke-direct {p0, p1, p2}, LE8/r;->y0(FLT7/c;)Ls9/d;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic t0(LE8/r;)Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d;
    .locals 0

    invoke-direct {p0}, LE8/r;->z0()Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic u0(LE8/r;)Ljava/text/NumberFormat;
    .locals 0

    iget-object p0, p0, LE8/r;->n:Ljava/text/NumberFormat;

    return-object p0
.end method

.method public static final synthetic v0(LE8/r;)Li8/a;
    .locals 0

    invoke-direct {p0}, LE8/r;->C0()Li8/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic w0(LE8/r;Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;LT7/c;Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c;)Lmf/a$a;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LE8/r;->D0(Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;LT7/c;Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c;)Lmf/a$a;

    move-result-object p0

    return-object p0
.end method

.method private final x0(Z)Lmf/a$a;
    .locals 7

    new-instance v6, Lmf/a$a;

    new-instance v2, Ls9/d$b;

    const v0, 0x7f1102c6

    invoke-direct {v2, v0}, Ls9/d$b;-><init>(I)V

    new-instance v3, Ls9/d$b;

    const v0, 0x7f1102c5

    invoke-direct {v3, v0}, Ls9/d$b;-><init>(I)V

    const/4 v4, 0x1

    const-string/jumbo v1, "auto"

    move-object v0, v6

    move v5, p1

    invoke-direct/range {v0 .. v5}, Lmf/a$a;-><init>(Ljava/lang/String;Ls9/d;Ls9/d;ZZ)V

    return-object v6
.end method

.method private final y0(FLT7/c;)Ls9/d;
    .locals 4

    sget-object v0, Lk8/d;->a:Lk8/d$a;

    float-to-double v1, p1

    invoke-virtual {v0, v1, v2, p2}, Lk8/d$a;->b(DLT7/c;)Lk8/d;

    move-result-object p1

    invoke-virtual {p1}, Lk8/d;->i()D

    move-result-wide v0

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    cmpg-double v0, v0, v2

    if-gez v0, :cond_2

    new-instance p1, Ls9/d$b;

    sget-object v0, LE8/r$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_1

    const/4 v0, 0x2

    if-ne p2, v0, :cond_0

    const p2, 0x7f1102ca

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    const p2, 0x7f1102c9

    :goto_0
    invoke-direct {p1, p2}, Ls9/d$b;-><init>(I)V

    goto :goto_1

    :cond_2
    new-instance p2, Ls9/d$a;

    invoke-virtual {p1}, Lk8/d;->i()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    new-instance v1, LE8/r$c;

    invoke-direct {v1, p1, p0}, LE8/r$c;-><init>(Lk8/d;LE8/r;)V

    invoke-direct {p2, v0, v1}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    move-object p1, p2

    :goto_1
    return-object p1
.end method

.method private final z0()Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d;
    .locals 1

    iget-object v0, p0, LE8/r;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d;

    return-object v0
.end method


# virtual methods
.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, LE8/r;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, LE8/r;->m:LLi/N;

    return-object v0
.end method

.method public o0()LLi/N;
    .locals 1

    iget-object v0, p0, LE8/r;->o:LLi/N;

    return-object v0
.end method

.method public p0()V
    .locals 3

    sget-object v0, Lye/d;->a:Lye/d;

    iget-object v1, p0, LE8/r;->l:Lgg/i;

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    new-instance v2, LE8/r$d;

    invoke-direct {v2, p0}, LE8/r$d;-><init>(LE8/r;)V

    invoke-virtual {v1, v2}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "flatMapCompletable(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public q0(Ljava/lang/String;)V
    .locals 3

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LE8/r;->z0()Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d;

    move-result-object v1

    invoke-interface {v1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d;->b()Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    new-instance v2, LE8/r$e;

    invoke-direct {v2, p0, p1}, LE8/r$e;-><init>(LE8/r;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string/jumbo v1, "flatMapCompletable(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method
