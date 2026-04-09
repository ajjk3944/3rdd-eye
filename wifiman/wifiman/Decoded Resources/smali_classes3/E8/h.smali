.class public final LE8/h;
.super LE8/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE8/h$a;
    }
.end annotation


# static fields
.field static final synthetic p:[Lth/l;

.field public static final q:I


# instance fields
.field private final j:LYg/m;

.field private final k:LYg/m;

.field private final l:Z

.field private final m:Lgg/i;

.field private final n:Lgg/i;

.field private final o:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LE8/h;

    const-string/jumbo v2, "topologyService"

    const-string/jumbo v3, "getTopologyService()Lcom/ui/wifiman/model/network/topology/NetworkTopologyService;"

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

    sput-object v2, LE8/h;->p:[Lth/l;

    const/16 v0, 0x8

    sput v0, LE8/h;->q:I

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

    new-instance v0, LE8/h$f;

    invoke-direct {v0}, LE8/h$f;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Ljd/b;

    invoke-direct {p1, v0, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    sget-object v2, LE8/h;->p:[Lth/l;

    const/4 v3, 0x0

    aget-object v3, v2, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LE8/h;->j:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v3, LE8/h$g;

    invoke-direct {v3}, LE8/h$g;-><init>()V

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

    aget-object v0, v2, p2

    invoke-interface {p1, p0, v0}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LE8/h;->k:LYg/m;

    iput-boolean p2, p0, LE8/h;->l:Z

    invoke-virtual {p0}, LE8/k;->j()Lgg/i;

    move-result-object p1

    new-instance p2, LE8/h$e;

    invoke-direct {p2, p0}, LE8/h$e;-><init>(LE8/h;)V

    invoke-virtual {p1, p2}, Lgg/i;->x0(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string/jumbo p2, "flatMapSingle(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LE8/h;->m:Lgg/i;

    invoke-direct {p0}, LE8/h;->u()Ljd/b;

    move-result-object p1

    invoke-interface {p1}, Ljd/b;->b()Lgg/i;

    move-result-object p1

    invoke-direct {p0}, LE8/h;->u()Ljd/b;

    move-result-object p2

    invoke-interface {p2}, Ljd/b;->d()Lgg/i;

    move-result-object p2

    invoke-virtual {p0}, LE8/k;->j()Lgg/i;

    move-result-object v0

    invoke-direct {p0}, LE8/h;->t()Lkd/d;

    move-result-object v1

    invoke-interface {v1}, Lkd/d;->a()Lgg/i;

    move-result-object v1

    sget-object v2, LE8/h$h;->a:LE8/h$h;

    invoke-virtual {v1, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    sget-object v2, LE8/h$i;->a:LE8/h$i;

    invoke-static {p1, p2, v0, v1, v2}, Lgg/i;->t(LDj/a;LDj/a;LDj/a;LDj/a;Lkg/h;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const-string/jumbo p2, "distinctUntilChanged(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LE8/h;->n:Lgg/i;

    invoke-virtual {p0}, LE8/k;->j()Lgg/i;

    move-result-object p1

    invoke-direct {p0}, LE8/h;->u()Ljd/b;

    move-result-object v0

    invoke-interface {v0}, Ljd/b;->d()Lgg/i;

    move-result-object v0

    new-instance v1, LE8/h$b;

    invoke-direct {v1, p0}, LE8/h$b;-><init>(LE8/h;)V

    invoke-static {p1, v0, v1}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    sget-object v0, LE8/h$c;->a:LE8/h$c;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LE8/h;->o:Lgg/i;

    return-void
.end method

.method public static final synthetic l(LE8/h;Lcom/ubnt/usurvey/product/l;Lcom/ui/wifiman/ui/component/network/h$b;)Lcom/ui/wifiman/ui/component/network/k;
    .locals 0

    invoke-direct {p0, p1, p2}, LE8/h;->o(Lcom/ubnt/usurvey/product/l;Lcom/ui/wifiman/ui/component/network/h$b;)Lcom/ui/wifiman/ui/component/network/k;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic m(LE8/h;Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/z;
    .locals 0

    invoke-direct {p0, p1}, LE8/h;->r(Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic n(LE8/h;Lcom/ubnt/usurvey/product/l;Lcom/ui/wifiman/ui/component/network/h;)Lcom/ui/wifiman/ui/component/network/k;
    .locals 0

    invoke-direct {p0, p1, p2}, LE8/h;->s(Lcom/ubnt/usurvey/product/l;Lcom/ui/wifiman/ui/component/network/h;)Lcom/ui/wifiman/ui/component/network/k;

    move-result-object p0

    return-object p0
.end method

.method private final o(Lcom/ubnt/usurvey/product/l;Lcom/ui/wifiman/ui/component/network/h$b;)Lcom/ui/wifiman/ui/component/network/k;
    .locals 4

    new-instance v0, Lcom/ui/wifiman/ui/component/network/k;

    new-instance v1, Lcom/ui/wifiman/ui/component/network/i;

    sget-object v2, LN9/b;->a:LN9/b;

    invoke-virtual {v2}, LN9/b;->B()Ls9/b;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ui/wifiman/ui/component/network/i;-><init>(Ls9/a;)V

    new-instance v2, Lcom/ui/wifiman/ui/component/network/j;

    new-instance v3, Lcom/ui/wifiman/ui/component/network/i;

    if-eqz p1, :cond_0

    invoke-static {p1}, Lk8/j;->a(Lcom/ubnt/usurvey/product/l;)Ls9/b;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    invoke-direct {p0}, LE8/h;->q()Ls9/b;

    move-result-object p1

    :cond_1
    invoke-direct {v3, p1}, Lcom/ui/wifiman/ui/component/network/i;-><init>(Ls9/a;)V

    invoke-direct {v2, v3, p2}, Lcom/ui/wifiman/ui/component/network/j;-><init>(Lcom/ui/wifiman/ui/component/network/i;Lcom/ui/wifiman/ui/component/network/h;)V

    invoke-static {v2}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/ui/wifiman/ui/component/network/k;-><init>(Lcom/ui/wifiman/ui/component/network/i;Ljava/util/List;)V

    return-object v0
.end method

.method private final q()Ls9/b;
    .locals 1

    sget-object v0, LPe/a;->a:LPe/a;

    invoke-virtual {v0}, LPe/a;->V()Ls9/b;

    move-result-object v0

    return-object v0
.end method

.method private final r(Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/z;
    .locals 1

    new-instance v0, LE8/h$d;

    invoke-direct {v0, p1}, LE8/h$d;-><init>(Lcom/ui/wifiman/model/speedtest/advanced/b;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final s(Lcom/ubnt/usurvey/product/l;Lcom/ui/wifiman/ui/component/network/h;)Lcom/ui/wifiman/ui/component/network/k;
    .locals 4

    new-instance v0, Lcom/ui/wifiman/ui/component/network/k;

    new-instance v1, Lcom/ui/wifiman/ui/component/network/i;

    if-eqz p1, :cond_0

    invoke-static {p1}, Lk8/j;->a(Lcom/ubnt/usurvey/product/l;)Ls9/b;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    invoke-direct {p0}, LE8/h;->q()Ls9/b;

    move-result-object p1

    :cond_1
    invoke-direct {v1, p1}, Lcom/ui/wifiman/ui/component/network/i;-><init>(Ls9/a;)V

    new-instance p1, Lcom/ui/wifiman/ui/component/network/j;

    new-instance v2, Lcom/ui/wifiman/ui/component/network/i;

    sget-object v3, LN9/b;->a:LN9/b;

    invoke-virtual {v3}, LN9/b;->I()Ls9/b;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/ui/wifiman/ui/component/network/i;-><init>(Ls9/a;)V

    invoke-direct {p1, v2, p2}, Lcom/ui/wifiman/ui/component/network/j;-><init>(Lcom/ui/wifiman/ui/component/network/i;Lcom/ui/wifiman/ui/component/network/h;)V

    invoke-static {p1}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/ui/wifiman/ui/component/network/k;-><init>(Lcom/ui/wifiman/ui/component/network/i;Ljava/util/List;)V

    return-object v0
.end method

.method private final t()Lkd/d;
    .locals 1

    iget-object v0, p0, LE8/h;->k:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkd/d;

    return-object v0
.end method

.method private final u()Ljd/b;
    .locals 1

    iget-object v0, p0, LE8/h;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljd/b;

    return-object v0
.end method


# virtual methods
.method public d()Lgg/i;
    .locals 1

    iget-object v0, p0, LE8/h;->o:Lgg/i;

    return-object v0
.end method

.method public bridge synthetic e(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Ljava/lang/Long;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/speedtest/advanced/b;

    invoke-virtual {p0, p1}, LE8/h;->p(Lcom/ui/wifiman/model/speedtest/advanced/b;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public g()Lgg/i;
    .locals 1

    iget-object v0, p0, LE8/h;->m:Lgg/i;

    return-object v0
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, LE8/h;->l:Z

    return v0
.end method

.method public k()Lgg/i;
    .locals 1

    iget-object v0, p0, LE8/h;->n:Lgg/i;

    return-object v0
.end method

.method protected p(Lcom/ui/wifiman/model/speedtest/advanced/b;)Ljava/lang/Long;
    .locals 2

    const-string/jumbo v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/advanced/b;->r()Lcom/ui/wifiman/model/speedtest/advanced/b$b;

    move-result-object v0

    sget-object v1, LE8/h$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/advanced/b;->i()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/speedtest/Speedtest$a;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$a;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    goto :goto_0

    :pswitch_1
    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/advanced/b;->a()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/speedtest/Speedtest$a;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$a;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    goto :goto_0

    :pswitch_2
    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/advanced/b;->t()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LCd/j$d;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LCd/j$d;->b()I

    move-result p1

    int-to-long v0, p1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    goto :goto_0

    :pswitch_3
    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/advanced/b;->p()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/speedtest/Speedtest$a;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$a;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    goto :goto_0

    :pswitch_4
    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/advanced/b;->l()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/speedtest/Speedtest$a;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$a;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    goto :goto_0

    :pswitch_5
    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/advanced/b;->e()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    int-to-long v0, p1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    :cond_0
    :goto_0
    :pswitch_6
    return-object v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
    .end packed-switch
.end method
