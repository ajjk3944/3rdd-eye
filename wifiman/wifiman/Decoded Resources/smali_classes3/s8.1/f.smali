.class public final Ls8/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls8/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls8/f$a;
    }
.end annotation


# static fields
.field public static final d:Ls8/f$a;

.field static final synthetic e:[Lth/l;

.field public static final f:I


# instance fields
.field private final a:LYg/m;

.field private final b:LYg/m;

.field private final c:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, Ls8/f;

    const-string/jumbo v2, "roamingService"

    const-string/jumbo v3, "getRoamingService()Lcom/ui/wifiman/model/network/roaming/AccessPointRoaming$Service;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "deviceManager"

    const-string/jumbo v5, "getDeviceManager()Lcom/ui/wifiman/model/device/WifimanDeviceManager;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lth/l;

    aput-object v0, v2, v4

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, Ls8/f;->e:[Lth/l;

    new-instance v0, Ls8/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ls8/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ls8/f;->d:Ls8/f$a;

    const/16 v0, 0x8

    sput v0, Ls8/f;->f:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 5

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, Ls8/f$g;

    invoke-direct {v1}, Ls8/f$g;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string/jumbo v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, Lhd/a$c;

    invoke-direct {v0, v1, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    sget-object v3, Ls8/f;->e:[Lth/l;

    const/4 v4, 0x0

    aget-object v4, v3, v4

    invoke-interface {v0, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, Ls8/f;->a:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v4, Ls8/f$h;

    invoke-direct {v4}, Ls8/f$h;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, LCc/n;

    invoke-direct {v0, v4, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p1, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v0, 0x1

    aget-object v0, v3, v0

    invoke-interface {p1, p0, v0}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Ls8/f;->b:LYg/m;

    invoke-direct {p0}, Ls8/f;->k()Lhd/a$c;

    move-result-object p1

    invoke-interface {p1}, Lhd/a$c;->a()Lgg/i;

    move-result-object p1

    const-wide/16 v0, 0xbb8

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Lgg/i;->v1(JLjava/util/concurrent/TimeUnit;)Lgg/i;

    move-result-object p1

    sget-object v0, Ls8/f$e;->a:Ls8/f$e;

    invoke-virtual {p1, v0}, Lgg/i;->v0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    new-instance v0, Ls8/f$f;

    invoke-direct {v0, p0}, Ls8/f$f;-><init>(Ls8/f;)V

    invoke-virtual {p1, v0}, Lgg/i;->v0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->h1()Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ls8/f;->c:Lgg/i;

    return-void
.end method

.method public static final synthetic b(Ls8/f;Lhd/a;)Ls9/d;
    .locals 0

    invoke-direct {p0, p1}, Ls8/f;->g(Lhd/a;)Ls9/d;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Ls8/f;Lhd/a;La8/a;)Ls9/d;
    .locals 0

    invoke-direct {p0, p1, p2}, Ls8/f;->h(Lhd/a;La8/a;)Ls9/d;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Ls8/f;)LCc/n;
    .locals 0

    invoke-direct {p0}, Ls8/f;->i()LCc/n;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Ls8/f;Lhd/a;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Ls8/f;->j(Lhd/a;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final f(Lhd/a$d;La8/a;)Ls9/d;
    .locals 3

    instance-of v0, p1, Lhd/a$d$b;

    if-eqz v0, :cond_0

    new-instance p1, Ls9/d$b;

    const p2, 0x7f11007e

    invoke-direct {p1, p2}, Ls9/d$b;-><init>(I)V

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lhd/a$d$a$b;

    if-eqz v0, :cond_4

    const-string/jumbo v0, "null cannot be cast to non-null type com.ui.wifiman.model.network.roaming.AccessPointRoaming.State.Connected.Wifi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lhd/a$d$a$b;

    invoke-virtual {p1}, Lhd/a$d$a$b;->a()Lje/r$b$a;

    move-result-object v0

    invoke-virtual {v0}, Lje/r$b$a;->c()Lh9/a;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    sget-object v2, La8/b;->c:La8/b$a;

    invoke-virtual {v2, v0}, La8/b$a;->b(Lh9/a;)La8/b;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p2, v0}, La8/a;->a(La8/b;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LCc/a$b;

    goto :goto_0

    :cond_1
    move-object p2, v1

    :goto_0
    if-eqz p2, :cond_2

    invoke-interface {p2}, LCc/a;->getName()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_2

    new-instance p1, Ls9/d$c;

    invoke-direct {p1, p2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lhd/a$d$a$b;->a()Lje/r$b$a;

    move-result-object p1

    invoke-virtual {p1}, Lje/r$b$a;->c()Lh9/a;

    move-result-object p1

    if-eqz p1, :cond_3

    const-string p2, ":"

    invoke-virtual {p1, p2}, Lh9/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    new-instance p2, Ls9/d$c;

    invoke-direct {p2, p1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    move-object p1, p2

    goto :goto_1

    :cond_3
    move-object p1, v1

    goto :goto_1

    :cond_4
    instance-of p1, p1, Lhd/a$d$a$a;

    if-eqz p1, :cond_5

    new-instance p1, Ls9/d$b;

    const p2, 0x7f11002c

    invoke-direct {p1, p2}, Ls9/d$b;-><init>(I)V

    :goto_1
    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final g(Lhd/a;)Ls9/d;
    .locals 5

    invoke-virtual {p1}, Lhd/a;->c()Lhd/a$d;

    move-result-object v0

    instance-of v1, v0, Lhd/a$d$a$b;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast v0, Lhd/a$d$a$b;

    invoke-virtual {v0}, Lhd/a$d$a$b;->a()Lje/r$b$a;

    move-result-object p1

    invoke-virtual {p1}, Lje/r$b$a;->h()LS8/l;

    move-result-object p1

    invoke-virtual {v0}, Lhd/a$d$a$b;->a()Lje/r$b$a;

    move-result-object v1

    invoke-virtual {v1}, Lje/r$b$a;->b()LS8/c;

    move-result-object v1

    invoke-virtual {v0}, Lhd/a$d$a$b;->a()Lje/r$b$a;

    move-result-object v0

    invoke-virtual {v0}, Lje/r$b$a;->d()Ljava/lang/Integer;

    move-result-object v0

    if-nez p1, :cond_0

    if-eqz v0, :cond_5

    :cond_0
    new-instance v3, Ls9/d$a;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LS8/l;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ls8/f$b;

    invoke-direct {v4, p1, v0, v1}, Ls8/f$b;-><init>(LS8/l;Ljava/lang/Integer;LS8/c;)V

    invoke-direct {v3, v2, v4}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    move-object v2, v3

    goto :goto_0

    :cond_2
    instance-of v1, v0, Lhd/a$d$a$a;

    if-eqz v1, :cond_4

    invoke-virtual {p1}, Lhd/a;->c()Lhd/a$d;

    move-result-object p1

    const-string/jumbo v0, "null cannot be cast to non-null type com.ui.wifiman.model.network.roaming.AccessPointRoaming.State.Connected.Cellular"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lhd/a$d$a$a;

    invoke-virtual {p1}, Lhd/a$d$a$a;->a()LBc/a$b$a$b;

    move-result-object p1

    invoke-virtual {p1}, LBc/a$b$a$b;->b()LV7/a;

    move-result-object v0

    if-nez v0, :cond_3

    invoke-virtual {p1}, LBc/a$b$a$b;->c()LV7/b;

    move-result-object v0

    if-eqz v0, :cond_5

    :cond_3
    new-instance v2, Ls9/d$a;

    invoke-virtual {p1}, LBc/a$b$a$b;->b()LV7/a;

    move-result-object v0

    invoke-virtual {p1}, LBc/a$b$a$b;->c()LV7/b;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ls8/f$c;

    invoke-direct {v1, p1}, Ls8/f$c;-><init>(LBc/a$b$a$b;)V

    invoke-direct {v2, v0, v1}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    goto :goto_0

    :cond_4
    instance-of p1, v0, Lhd/a$d$b;

    if-eqz p1, :cond_6

    :cond_5
    :goto_0
    return-object v2

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final h(Lhd/a;La8/a;)Ls9/d;
    .locals 4

    invoke-virtual {p1}, Lhd/a;->a()Lhd/a$d;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Ls8/f;->f(Lhd/a$d;La8/a;)Ls9/d;

    move-result-object v0

    invoke-virtual {p1}, Lhd/a;->c()Lhd/a$d;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Ls8/f;->f(Lhd/a$d;La8/a;)Ls9/d;

    move-result-object p1

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    new-instance p2, Ls9/d$a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ls8/f$d;

    invoke-direct {v2, v0, p1}, Ls8/f$d;-><init>(Ls9/d;Ls9/d;)V

    invoke-direct {p2, v1, v2}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    move-object p1, p2

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    :cond_1
    :goto_0
    return-object p1
.end method

.method private final i()LCc/n;
    .locals 1

    iget-object v0, p0, Ls8/f;->b:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LCc/n;

    return-object v0
.end method

.method private final j(Lhd/a;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p1}, Lhd/a;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final k()Lhd/a$c;
    .locals 1

    iget-object v0, p0, Ls8/f;->a:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhd/a$c;

    return-object v0
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Ls8/f;->c:Lgg/i;

    return-object v0
.end method
