.class public final LH8/q;
.super Lcom/ui/wifiman/ui/teleport/M;
.source "SourceFile"


# static fields
.field static final synthetic l:[Lth/l;

.field public static final m:I


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:LYg/m;

.field private final j:LYg/m;

.field private final k:LYg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LH8/q;

    const-string/jumbo v2, "teleportSession"

    const-string/jumbo v3, "getTeleportSession()Lcom/ui/wifiman/model/teleport/session/TeleportSession;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "teleportConnection"

    const-string/jumbo v5, "getTeleportConnection()Lcom/ui/wifiman/model/teleport/TeleportConnection;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/F;

    const-string/jumbo v5, "viewRouter"

    const-string/jumbo v6, "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v3

    new-instance v5, Lkotlin/jvm/internal/F;

    const-string/jumbo v6, "toastService"

    const-string/jumbo v7, "getToastService()Lcom/ui/wifiman/domain/toast/ToastService;"

    invoke-direct {v5, v1, v6, v7, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v5}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v5

    new-instance v6, Lkotlin/jvm/internal/D;

    const-string/jumbo v7, "stream"

    const-string v8, "<v#0>"

    invoke-direct {v6, v1, v7, v8, v4}, Lkotlin/jvm/internal/D;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v6}, Lkotlin/jvm/internal/O;->g(Lkotlin/jvm/internal/C;)Lth/m;

    move-result-object v1

    const/4 v6, 0x5

    new-array v6, v6, [Lth/l;

    aput-object v0, v6, v4

    const/4 v0, 0x1

    aput-object v2, v6, v0

    const/4 v0, 0x2

    aput-object v3, v6, v0

    const/4 v0, 0x3

    aput-object v5, v6, v0

    const/4 v0, 0x4

    aput-object v1, v6, v0

    sput-object v6, LH8/q;->l:[Lth/l;

    const/16 v0, 0x8

    sput v0, LH8/q;->m:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 5

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/ui/wifiman/ui/teleport/M;-><init>()V

    iput-object p1, p0, LH8/q;->g:Lorg/kodein/di/DI;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, LH8/q$e;

    invoke-direct {v0}, LH8/q$e;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Lcom/ui/wifiman/model/teleport/session/TeleportSession;

    invoke-direct {p1, v0, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    sget-object v2, LH8/q;->l:[Lth/l;

    const/4 v3, 0x0

    aget-object v3, v2, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LH8/q;->h:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v3, LH8/q$f;

    invoke-direct {v3}, LH8/q$f;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lcom/ui/wifiman/model/teleport/TeleportConnection;

    invoke-direct {p1, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v3, 0x1

    aget-object v3, v2, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LH8/q;->i:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v3, LH8/q$g;

    invoke-direct {v3}, LH8/q$g;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Li8/a;

    invoke-direct {p1, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v3, 0x2

    aget-object v3, v2, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LH8/q;->j:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v3, LH8/q$h;

    invoke-direct {v3}, LH8/q$h;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, Lhc/b;

    invoke-direct {p1, v3, v1}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v0, 0x3

    aget-object v0, v2, v0

    invoke-interface {p1, p0, v0}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LH8/q;->k:LYg/m;

    return-void
.end method

.method private final A0()Li8/a;
    .locals 1

    iget-object v0, p0, LH8/q;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method

.method private final B0()V
    .locals 7

    sget-object v6, Lye/d;->a:Lye/d;

    new-instance v3, LH8/p;

    invoke-direct {v3, p0}, LH8/p;-><init>(LH8/q;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, v6

    move-object v1, p0

    invoke-static/range {v0 .. v5}, Lye/d;->c(Lye/d;Lye/g;Landroidx/lifecycle/k$b;Lmh/a;ILjava/lang/Object;)Lye/d$a;

    move-result-object v0

    invoke-static {v0}, LH8/q;->D0(Lye/d$a;)Lgg/i;

    move-result-object v0

    invoke-virtual {v6, v0, p0}, Lye/d;->e(Lgg/i;Lye/g;)V

    return-void
.end method

.method private static final C0(LH8/q;)Lgg/i;
    .locals 2

    invoke-direct {p0}, LH8/q;->y0()Lcom/ui/wifiman/model/teleport/session/TeleportSession;

    move-result-object v0

    invoke-interface {v0}, Lcom/ui/wifiman/model/teleport/session/TeleportSession;->d()Lgg/i;

    move-result-object v0

    new-instance v1, LH8/q$c;

    invoke-direct {v1, p0}, LH8/q$c;-><init>(LH8/q;)V

    invoke-virtual {v0, v1}, Lgg/i;->L1(Lkg/n;)Lgg/b;

    move-result-object p0

    invoke-virtual {p0}, Lgg/b;->c0()Lgg/i;

    move-result-object p0

    const-string/jumbo v0, "toFlowable(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final D0(Lye/d$a;)Lgg/i;
    .locals 2

    sget-object v0, LH8/q;->l:[Lth/l;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lye/d$a;->c(Ljava/lang/Object;Lth/l;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p0(LH8/q;)Lgg/i;
    .locals 0

    invoke-static {p0}, LH8/q;->C0(LH8/q;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic q0(LH8/q;)Lgg/b;
    .locals 0

    invoke-direct {p0}, LH8/q;->w0()Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic r0(LH8/q;)Lcom/ui/wifiman/ui/teleport/L;
    .locals 0

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/teleport/M;->n0()Lcom/ui/wifiman/ui/teleport/L;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic s0(LH8/q;)Lcom/ui/wifiman/model/teleport/TeleportConnection;
    .locals 0

    invoke-direct {p0}, LH8/q;->x0()Lcom/ui/wifiman/model/teleport/TeleportConnection;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic t0(LH8/q;)Lcom/ui/wifiman/model/teleport/session/TeleportSession;
    .locals 0

    invoke-direct {p0}, LH8/q;->y0()Lcom/ui/wifiman/model/teleport/session/TeleportSession;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic u0(LH8/q;)Lhc/b;
    .locals 0

    invoke-direct {p0}, LH8/q;->z0()Lhc/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic v0(LH8/q;)Li8/a;
    .locals 0

    invoke-direct {p0}, LH8/q;->A0()Li8/a;

    move-result-object p0

    return-object p0
.end method

.method private final w0()Lgg/b;
    .locals 2

    new-instance v0, LH8/q$a;

    invoke-direct {v0, p0}, LH8/q$a;-><init>(LH8/q;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v0

    const-string/jumbo v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LH8/q$b;

    invoke-direct {v1, p0}, LH8/q$b;-><init>(LH8/q;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "flatMapCompletable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final x0()Lcom/ui/wifiman/model/teleport/TeleportConnection;
    .locals 1

    iget-object v0, p0, LH8/q;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/teleport/TeleportConnection;

    return-object v0
.end method

.method private final y0()Lcom/ui/wifiman/model/teleport/session/TeleportSession;
    .locals 1

    iget-object v0, p0, LH8/q;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/teleport/session/TeleportSession;

    return-object v0
.end method

.method private final z0()Lhc/b;
    .locals 1

    iget-object v0, p0, LH8/q;->k:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhc/b;

    return-object v0
.end method


# virtual methods
.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, LH8/q;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public l0()V
    .locals 0

    invoke-direct {p0}, LH8/q;->B0()V

    return-void
.end method

.method public o0()V
    .locals 3

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LH8/q;->y0()Lcom/ui/wifiman/model/teleport/session/TeleportSession;

    move-result-object v1

    invoke-interface {v1}, Lcom/ui/wifiman/model/teleport/session/TeleportSession;->d()Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    new-instance v2, LH8/q$d;

    invoke-direct {v2, p0}, LH8/q$d;-><init>(LH8/q;)V

    invoke-virtual {v1, v2}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "flatMapCompletable(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method
