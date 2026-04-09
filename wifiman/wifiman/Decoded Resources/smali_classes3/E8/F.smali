.class public final LE8/F;
.super Lkf/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE8/F$a;,
        LE8/F$b;,
        LE8/F$c;
    }
.end annotation


# static fields
.field private static final r:LE8/F$a;

.field static final synthetic s:[Lth/l;

.field public static final t:I


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:LYg/m;

.field private final j:LYg/m;

.field private final k:LYg/m;

.field private final l:LFg/a;

.field private final m:Lgg/i;

.field private final n:Lgg/i;

.field private final o:LLi/N;

.field private final p:LLi/N;

.field private final q:LLi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LE8/F;

    const-string/jumbo v2, "resultManager"

    const-string/jumbo v3, "getResultManager()Lcom/ui/wifiman/model/speedtest/result/SpeedtestResultManager;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "queryFilter"

    const-string/jumbo v5, "getQueryFilter()Lcom/ubnt/usurvey/ui/speedtest/SpeedtestResultQueryFilter;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/F;

    const-string/jumbo v5, "deviceManager"

    const-string/jumbo v6, "getDeviceManager()Lcom/ui/wifiman/model/device/WifimanDeviceManager;"

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

    sput-object v5, LE8/F;->s:[Lth/l;

    new-instance v0, LE8/F$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LE8/F$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LE8/F;->r:LE8/F$a;

    const/16 v0, 0x8

    sput v0, LE8/F;->t:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 10

    const-string/jumbo v1, "di"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lkf/b;-><init>()V

    iput-object p1, p0, LE8/F;->g:Lorg/kodein/di/DI;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, LE8/F$o;

    invoke-direct {v1}, LE8/F$o;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string/jumbo v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, Lcom/ui/wifiman/model/speedtest/result/e;

    invoke-direct {v0, v1, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    sget-object v3, LE8/F;->s:[Lth/l;

    const/4 v4, 0x0

    aget-object v5, v3, v4

    invoke-interface {v0, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LE8/F;->h:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v5, LE8/F$p;

    invoke-direct {v5}, LE8/F$p;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, LE8/E;

    invoke-direct {v0, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v5, 0x1

    aget-object v6, v3, v5

    invoke-interface {v0, p0, v6}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LE8/F;->i:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v6, LE8/F$q;

    invoke-direct {v6}, LE8/F$q;-><init>()V

    invoke-virtual {v6}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v6

    invoke-static {v6}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v7, LCc/n;

    invoke-direct {v0, v6, v7}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v6, 0x2

    aget-object v6, v3, v6

    invoke-interface {v0, p0, v6}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LE8/F;->j:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v6, LE8/F$r;

    invoke-direct {v6}, LE8/F$r;-><init>()V

    invoke-virtual {v6}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v6

    invoke-static {v6}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Li8/a;

    invoke-direct {v0, v6, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    const/4 v2, 0x3

    aget-object v2, v3, v2

    invoke-interface {v0, p0, v2}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LE8/F;->k:LYg/m;

    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v7}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object v0

    const-string/jumbo v2, "createDefault(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LE8/F;->l:LFg/a;

    invoke-virtual {v0}, Lgg/i;->e1()Lgg/i;

    move-result-object v0

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v2

    invoke-virtual {v0, v2, v4, v5}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    invoke-virtual {v0, v5}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v8

    const-string/jumbo v0, "refCount(...)"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v8, p0, LE8/F;->m:Lgg/i;

    invoke-direct {p0}, LE8/F;->E0()Lcom/ui/wifiman/model/speedtest/result/e;

    move-result-object v2

    invoke-interface {v2, v1, v1, v1}, Lcom/ui/wifiman/model/speedtest/result/e;->e(Lb8/c;Ljava/lang/String;Ljava/lang/Integer;)Lgg/i;

    move-result-object v1

    invoke-direct {p0}, LE8/F;->D0()LE8/E;

    move-result-object v2

    invoke-virtual {v2}, Lk8/m;->f()Lgg/i;

    move-result-object v2

    new-instance v3, LE8/F$g;

    invoke-direct {v3, p0}, LE8/F$g;-><init>(LE8/F;)V

    invoke-static {v1, v2, v3}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    invoke-virtual {v1, v5}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v1

    invoke-virtual {v1}, Ljg/a;->i2()Lgg/i;

    move-result-object v9

    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v9, p0, LE8/F;->n:Lgg/i;

    sget-object v0, LE8/F$h;->a:LE8/F$h;

    invoke-virtual {v9, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v1

    const-string/jumbo v0, "map(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lkf/a$c;->a:Lkf/a$c;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v0

    iput-object v0, p0, LE8/F;->o:LLi/N;

    move-object v0, p0

    move-object v1, v8

    move-object v2, v7

    invoke-static/range {v0 .. v6}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v0

    iput-object v0, p0, LE8/F;->p:LLi/N;

    const-class v0, LE8/F$b$b;

    invoke-virtual {v9, v0}, Lgg/i;->Z0(Ljava/lang/Class;)Lgg/i;

    move-result-object v0

    const-string/jumbo v1, "ofType(R::class.java)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LE8/F$d;->a:LE8/F$d;

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-direct {p0}, LE8/F;->C0()LCc/n;

    move-result-object v1

    invoke-interface {v1}, LCc/n;->b()Lgg/i;

    move-result-object v1

    sget-object v2, LE8/F$e;->a:LE8/F$e;

    invoke-virtual {v1, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    new-instance v2, LE8/F$f;

    invoke-direct {v2, p0}, LE8/F$f;-><init>(LE8/F;)V

    invoke-static {v0, v1, v2}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object v1

    const-string/jumbo v0, "combineLatest(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, LEe/g;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    invoke-direct {v2, v0}, LEe/g;-><init>(Ljava/util/List;)V

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v0

    iput-object v0, p0, LE8/F;->q:LLi/N;

    return-void
.end method

.method public static final synthetic A0(LE8/F;Ljava/lang/String;)J
    .locals 0

    invoke-direct {p0, p1}, LE8/F;->H0(Ljava/lang/String;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic B0(LE8/F;Lcom/ui/wifiman/model/speedtest/result/b;JLjava/lang/String;)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LE8/F;->I0(Lcom/ui/wifiman/model/speedtest/result/b;JLjava/lang/String;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final C0()LCc/n;
    .locals 1

    iget-object v0, p0, LE8/F;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LCc/n;

    return-object v0
.end method

.method private final D0()LE8/E;
    .locals 1

    iget-object v0, p0, LE8/F;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LE8/E;

    return-object v0
.end method

.method private final E0()Lcom/ui/wifiman/model/speedtest/result/e;
    .locals 1

    iget-object v0, p0, LE8/F;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/speedtest/result/e;

    return-object v0
.end method

.method private final F0()Li8/a;
    .locals 1

    iget-object v0, p0, LE8/F;->k:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method

.method private final G0(Lcom/ui/wifiman/model/speedtest/result/b;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b;->f()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final H0(Ljava/lang/String;)J
    .locals 2

    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method private final I0(Lcom/ui/wifiman/model/speedtest/result/b;JLjava/lang/String;)Ljava/util/List;
    .locals 17

    move-wide/from16 v0, p2

    move-object/from16 v2, p4

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->g()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x1

    const/16 v5, 0xa

    const/4 v6, 0x0

    if-le v3, v4, :cond_5

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->g()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, LE8/F$i;

    invoke-direct {v4}, LE8/F$i;-><init>()V

    invoke-static {v3, v4}, LZg/v;->X0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v4, v5}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v7, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v5, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v9, v5, 0x1

    if-gez v5, :cond_0

    invoke-static {}, LZg/v;->v()V

    :cond_0
    check-cast v8, Lcom/ui/wifiman/model/speedtest/result/b$c;

    invoke-virtual {v8}, Lcom/ui/wifiman/model/speedtest/result/b$c;->a()Ljava/lang/Long;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    move-result-wide v10

    sget-object v5, LW7/a;->b:LW7/a$a;

    invoke-virtual {v5, v10, v11}, LW7/a$a;->b(J)LW7/a;

    move-result-object v5

    move-object v11, v5

    goto :goto_1

    :cond_1
    move-object v11, v6

    :goto_1
    invoke-virtual {v8}, Lcom/ui/wifiman/model/speedtest/result/b$c;->h()Ljava/lang/Long;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    move-result-wide v12

    sget-object v5, LW7/a;->b:LW7/a$a;

    invoke-virtual {v5, v12, v13}, LW7/a$a;->b(J)LW7/a;

    move-result-object v5

    move-object v12, v5

    goto :goto_2

    :cond_2
    move-object v12, v6

    :goto_2
    sget-object v5, LW7/a;->b:LW7/a$a;

    invoke-virtual {v5, v0, v1}, LW7/a$a;->b(J)LW7/a;

    move-result-object v13

    sget-object v5, LE8/C;->a:LE8/C;

    invoke-virtual {v5, v8}, LE8/C;->d(Lcom/ui/wifiman/model/speedtest/result/b$c;)Ls9/b;

    move-result-object v14

    invoke-virtual {v8}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object v10

    invoke-static {v3, v9}, LZg/v;->t0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/ui/wifiman/model/speedtest/result/b$c;

    if-eqz v15, :cond_3

    invoke-virtual {v15}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object v15

    goto :goto_3

    :cond_3
    move-object v15, v6

    :goto_3
    invoke-virtual {v5, v10, v15, v2}, LE8/C;->c(Lcom/ui/wifiman/model/speedtest/result/b$b;Lcom/ui/wifiman/model/speedtest/result/b$b;Ljava/lang/String;)Ls9/d;

    move-result-object v15

    invoke-virtual {v8}, Lcom/ui/wifiman/model/speedtest/result/b$c;->f()Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    sget-object v8, Lb8/b;->a:Lb8/b$b;

    invoke-virtual {v8, v5}, Lb8/b$b;->a(I)Lb8/b;

    move-result-object v5

    move-object/from16 v16, v5

    goto :goto_4

    :cond_4
    move-object/from16 v16, v6

    :goto_4
    new-instance v5, Lhf/n;

    move-object v10, v5

    invoke-direct/range {v10 .. v16}, Lhf/n;-><init>(LW7/a;LW7/a;LW7/a;Ls9/b;Ls9/d;Lb8/b;)V

    invoke-interface {v7, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v5, v9

    goto :goto_0

    :cond_5
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->g()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v3, v5}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v7, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ui/wifiman/model/speedtest/result/b$c;

    invoke-virtual {v4}, Lcom/ui/wifiman/model/speedtest/result/b$c;->a()Ljava/lang/Long;

    move-result-object v5

    if-eqz v5, :cond_6

    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    move-result-wide v8

    sget-object v5, LW7/a;->b:LW7/a$a;

    invoke-virtual {v5, v8, v9}, LW7/a$a;->b(J)LW7/a;

    move-result-object v5

    move-object v9, v5

    goto :goto_6

    :cond_6
    move-object v9, v6

    :goto_6
    invoke-virtual {v4}, Lcom/ui/wifiman/model/speedtest/result/b$c;->h()Ljava/lang/Long;

    move-result-object v5

    if-eqz v5, :cond_7

    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    move-result-wide v10

    sget-object v5, LW7/a;->b:LW7/a$a;

    invoke-virtual {v5, v10, v11}, LW7/a$a;->b(J)LW7/a;

    move-result-object v5

    move-object v10, v5

    goto :goto_7

    :cond_7
    move-object v10, v6

    :goto_7
    sget-object v5, LW7/a;->b:LW7/a$a;

    invoke-virtual {v5, v0, v1}, LW7/a$a;->b(J)LW7/a;

    move-result-object v11

    sget-object v5, LE8/C;->a:LE8/C;

    invoke-virtual {v5, v4}, LE8/C;->d(Lcom/ui/wifiman/model/speedtest/result/b$c;)Ls9/b;

    move-result-object v12

    invoke-virtual {v4}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object v8

    invoke-virtual {v5, v8, v6, v2}, LE8/C;->c(Lcom/ui/wifiman/model/speedtest/result/b$b;Lcom/ui/wifiman/model/speedtest/result/b$b;Ljava/lang/String;)Ls9/d;

    move-result-object v13

    invoke-virtual {v4}, Lcom/ui/wifiman/model/speedtest/result/b$c;->f()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_8

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    sget-object v5, Lb8/b;->a:Lb8/b$b;

    invoke-virtual {v5, v4}, Lb8/b$b;->a(I)Lb8/b;

    move-result-object v4

    move-object v14, v4

    goto :goto_8

    :cond_8
    move-object v14, v6

    :goto_8
    new-instance v4, Lhf/n;

    move-object v8, v4

    invoke-direct/range {v8 .. v14}, Lhf/n;-><init>(LW7/a;LW7/a;LW7/a;Ls9/b;Ls9/d;Lb8/b;)V

    invoke-interface {v7, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_9
    return-object v7
.end method

.method public static final synthetic v0(LE8/F;)LE8/E;
    .locals 0

    invoke-direct {p0}, LE8/F;->D0()LE8/E;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic w0(LE8/F;)Lcom/ui/wifiman/model/speedtest/result/e;
    .locals 0

    invoke-direct {p0}, LE8/F;->E0()Lcom/ui/wifiman/model/speedtest/result/e;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic x0(LE8/F;)Li8/a;
    .locals 0

    invoke-direct {p0}, LE8/F;->F0()Li8/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic y0(LE8/F;)LFg/a;
    .locals 0

    iget-object p0, p0, LE8/F;->l:LFg/a;

    return-object p0
.end method

.method public static final synthetic z0(LE8/F;Lcom/ui/wifiman/model/speedtest/result/b;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, LE8/F;->G0(Lcom/ui/wifiman/model/speedtest/result/b;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, LE8/F;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, LE8/F;->q:LLi/N;

    return-object v0
.end method

.method public o0()LLi/N;
    .locals 1

    iget-object v0, p0, LE8/F;->o:LLi/N;

    return-object v0
.end method

.method public p0()LLi/N;
    .locals 1

    iget-object v0, p0, LE8/F;->p:LLi/N;

    return-object v0
.end method

.method public q0()V
    .locals 2

    iget-object v0, p0, LE8/F;->l:LFg/a;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public r0()V
    .locals 2

    iget-object v0, p0, LE8/F;->l:LFg/a;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public s0(Ljava/lang/String;)V
    .locals 4

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lye/d;->a:Lye/d;

    new-instance v1, LE8/F$j;

    invoke-direct {v1, p0}, LE8/F$j;-><init>(LE8/F;)V

    invoke-static {v1}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, LE8/F$k;

    invoke-direct {v3, p0, p1}, LE8/F$k;-><init>(LE8/F;Ljava/lang/String;)V

    invoke-static {v3}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Lgg/b;->k(Lgg/D;)Lgg/z;

    move-result-object p1

    new-instance v1, LE8/F$l;

    invoke-direct {v1, p0}, LE8/F$l;-><init>(LE8/F;)V

    invoke-virtual {p1, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string/jumbo v1, "flatMapCompletable(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public t0(Ljava/lang/String;)V
    .locals 2

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lye/d;->a:Lye/d;

    new-instance v1, LE8/F$m;

    invoke-direct {v1, p0, p1}, LE8/F$m;-><init>(LE8/F;Ljava/lang/String;)V

    invoke-static {v1}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string/jumbo v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LE8/F$n;

    invoke-direct {v1, p0}, LE8/F$n;-><init>(LE8/F;)V

    invoke-virtual {p1, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string/jumbo v1, "flatMapCompletable(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public u0(Ljava/lang/String;)V
    .locals 1

    const-string/jumbo v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LE8/F;->D0()LE8/E;

    move-result-object v0

    invoke-virtual {v0, p1}, Lk8/m;->g(Ljava/lang/String;)V

    return-void
.end method
