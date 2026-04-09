.class public final LE8/l;
.super LE8/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE8/l$a;
    }
.end annotation


# static fields
.field static final synthetic n:[Lth/l;

.field public static final o:I


# instance fields
.field private final j:LYg/m;

.field private final k:LYg/m;

.field private final l:Lgg/i;

.field private final m:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LE8/l;

    const-string/jumbo v2, "deviceManager"

    const-string/jumbo v3, "getDeviceManager()Lcom/ui/wifiman/model/device/WifimanDeviceManager;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "publicIpService"

    const-string/jumbo v5, "getPublicIpService()Lcom/ui/wifiman/model/publicip/PublicIP$Service;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lth/l;

    aput-object v0, v2, v4

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, LE8/l;->n:[Lth/l;

    const/16 v0, 0x8

    sput v0, LE8/l;->o:I

    return-void
.end method

.method public constructor <init>(Lgg/i;Lorg/kodein/di/DI;)V
    .locals 4

    const-string/jumbo v0, "speedtestStream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "di"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LE8/k;-><init>(Lgg/i;)V

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, LE8/l$e;

    invoke-direct {v0}, LE8/l$e;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, LCc/n;

    invoke-direct {p1, v0, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    sget-object v2, LE8/l;->n:[Lth/l;

    const/4 v3, 0x0

    aget-object v3, v2, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LE8/l;->j:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v3, LE8/l$f;

    invoke-direct {v3}, LE8/l$f;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, Lkd/d;

    invoke-direct {p1, v3, v1}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p2, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 p2, 0x1

    aget-object p2, v2, p2

    invoke-interface {p1, p0, p2}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LE8/l;->k:LYg/m;

    invoke-virtual {p0}, LE8/k;->j()Lgg/i;

    move-result-object p1

    new-instance p2, LE8/l$d;

    invoke-direct {p2, p0}, LE8/l$d;-><init>(LE8/l;)V

    invoke-virtual {p1, p2}, Lgg/i;->x0(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string/jumbo p2, "flatMapSingle(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LE8/l;->l:Lgg/i;

    invoke-direct {p0}, LE8/l;->n()LCc/n;

    move-result-object p1

    invoke-interface {p1}, LCc/n;->b()Lgg/i;

    move-result-object p1

    invoke-virtual {p0}, LE8/k;->j()Lgg/i;

    move-result-object p2

    invoke-direct {p0}, LE8/l;->p()Lkd/d;

    move-result-object v0

    invoke-interface {v0}, Lkd/d;->a()Lgg/i;

    move-result-object v0

    sget-object v1, LE8/l$g;->a:LE8/l$g;

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    sget-object v1, LE8/l$h;->a:LE8/l$h;

    invoke-static {p1, p2, v0, v1}, Lgg/i;->u(LDj/a;LDj/a;LDj/a;Lkg/g;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const-string/jumbo p2, "distinctUntilChanged(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LE8/l;->m:Lgg/i;

    return-void
.end method

.method public static final synthetic l(LE8/l;Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/z;
    .locals 0

    invoke-direct {p0, p1}, LE8/l;->o(Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method private final n()LCc/n;
    .locals 1

    iget-object v0, p0, LE8/l;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LCc/n;

    return-object v0
.end method

.method private final o(Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/z;
    .locals 1

    new-instance v0, LE8/l$b;

    invoke-direct {v0, p1}, LE8/l$b;-><init>(Lcom/ui/wifiman/model/speedtest/internet/f;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final p()Lkd/d;
    .locals 1

    iget-object v0, p0, LE8/l;->k:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkd/d;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic e(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Ljava/lang/Long;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/speedtest/internet/f;

    invoke-virtual {p0, p1}, LE8/l;->m(Lcom/ui/wifiman/model/speedtest/internet/f;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public g()Lgg/i;
    .locals 1

    iget-object v0, p0, LE8/l;->l:Lgg/i;

    return-object v0
.end method

.method public k()Lgg/i;
    .locals 1

    iget-object v0, p0, LE8/l;->m:Lgg/i;

    return-object v0
.end method

.method protected m(Lcom/ui/wifiman/model/speedtest/internet/f;)Ljava/lang/Long;
    .locals 2

    const-string/jumbo v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/internet/f;->l()Lcom/ui/wifiman/model/speedtest/internet/f$b;

    move-result-object v0

    sget-object v1, LE8/l$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/internet/f;->i()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/speedtest/Speedtest$a;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$a;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    goto :goto_1

    :pswitch_1
    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/internet/f;->a()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/speedtest/Speedtest$a;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$a;->a()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    :cond_1
    :goto_1
    :pswitch_2
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method
