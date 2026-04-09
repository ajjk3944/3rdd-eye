.class public final Ls8/b;
.super LGe/g$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls8/b$a;
    }
.end annotation


# static fields
.field static final synthetic l:[Lth/l;

.field public static final m:I


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:LYg/m;

.field private final j:LFg/c;

.field private final k:LLi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, Ls8/b;

    const-string/jumbo v2, "wifiRoamingNotificationService"

    const-string/jumbo v3, "getWifiRoamingNotificationService()Lcom/ubnt/usurvey/ui/notification/NetworkConnectionNotificationService;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "vibrator"

    const-string/jumbo v5, "getVibrator()Lcom/ui/wifiman/model/android/vibrator/AndroidVibrator;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lth/l;

    aput-object v0, v2, v4

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, Ls8/b;->l:[Lth/l;

    const/16 v0, 0x8

    sput v0, Ls8/b;->m:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 7

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LGe/g$a;-><init>()V

    iput-object p1, p0, Ls8/b;->g:Lorg/kodein/di/DI;

    invoke-virtual {p0}, Ls8/b;->d()Lorg/kodein/di/DI;

    move-result-object p1

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, Ls8/b$f;

    invoke-direct {v1}, Ls8/b$f;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string/jumbo v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, Ls8/e;

    invoke-direct {v0, v1, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    sget-object v0, Ls8/b;->l:[Lth/l;

    const/4 v3, 0x0

    aget-object v3, v0, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Ls8/b;->h:LYg/m;

    invoke-virtual {p0}, Ls8/b;->d()Lorg/kodein/di/DI;

    move-result-object p1

    new-instance v3, Lorg/kodein/type/d;

    new-instance v4, Ls8/b$g;

    invoke-direct {v4}, Ls8/b$g;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Luc/a;

    invoke-direct {v3, v4, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p1, v3, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-interface {p1, p0, v0}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Ls8/b;->i:LYg/m;

    invoke-static {}, LFg/c;->j2()LFg/c;

    move-result-object p1

    const-string/jumbo v0, "create(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ls8/b;->j:LFg/c;

    invoke-direct {p0}, Ls8/b;->v0()Ls8/e;

    move-result-object p1

    invoke-interface {p1}, Ls8/e;->a()Lgg/i;

    move-result-object p1

    invoke-direct {p0, p1}, Ls8/b;->s0(Lgg/i;)Lgg/i;

    move-result-object p1

    sget-object v0, Ls8/b$h;->a:Ls8/b$h;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    const-string/jumbo p1, "distinctUntilChanged(...)"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LCi/a;->a()LCi/f;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, Ls8/b;->k:LLi/N;

    return-void
.end method

.method public static synthetic p0()Ljava/util/ArrayList;
    .locals 1

    invoke-static {}, Ls8/b;->t0()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic q0(Ls8/b;)LFg/c;
    .locals 0

    iget-object p0, p0, Ls8/b;->j:LFg/c;

    return-object p0
.end method

.method public static final synthetic r0(Ls8/b;)Luc/a;
    .locals 0

    invoke-direct {p0}, Ls8/b;->u0()Luc/a;

    move-result-object p0

    return-object p0
.end method

.method private final s0(Lgg/i;)Lgg/i;
    .locals 2

    sget-object v0, Ls8/b$b;->a:Ls8/b$b;

    invoke-virtual {p1, v0}, Lgg/i;->p0(Lkg/n;)Lgg/i;

    move-result-object p1

    iget-object v0, p0, Ls8/b;->j:LFg/c;

    invoke-virtual {p1, v0}, Lgg/i;->T0(LDj/a;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->a1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "observeOn(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ls8/b;->w0(Lgg/i;)Lgg/i;

    move-result-object p1

    new-instance v0, Ls8/a;

    invoke-direct {v0}, Ls8/a;-><init>()V

    sget-object v1, Ls8/b$c;->a:Ls8/b$c;

    invoke-virtual {p1, v0, v1}, Lgg/i;->s1(Lkg/q;Lkg/b;)Lgg/i;

    move-result-object p1

    sget-object v0, Ls8/b$d;->a:Ls8/b$d;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "map(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Ljava/util/List;

    invoke-virtual {p1, v0}, Lgg/i;->n(Ljava/lang/Class;)Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "cast(R::class.java)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final t0()Ljava/util/ArrayList;
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method private final u0()Luc/a;
    .locals 1

    iget-object v0, p0, Ls8/b;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Luc/a;

    return-object v0
.end method

.method private final v0()Ls8/e;
    .locals 1

    iget-object v0, p0, Ls8/b;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls8/e;

    return-object v0
.end method

.method private final w0(Lgg/i;)Lgg/i;
    .locals 1

    new-instance v0, Ls8/b$i;

    invoke-direct {v0, p0}, Ls8/b$i;-><init>(Ls8/b;)V

    invoke-virtual {p1, v0}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "doOnNext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, Ls8/b;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, Ls8/b;->k:LLi/N;

    return-object v0
.end method

.method public o0(Ljava/lang/String;)V
    .locals 2

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lye/d;->a:Lye/d;

    new-instance v1, Ls8/b$e;

    invoke-direct {v1, p0, p1}, Ls8/b$e;-><init>(Ls8/b;Ljava/lang/String;)V

    invoke-static {v1}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string/jumbo v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method
