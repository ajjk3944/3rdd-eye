.class public final LC8/b;
.super Lcom/ui/wifiman/ui/signal/E;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LC8/b$a;
    }
.end annotation


# static fields
.field static final synthetic o:[Lth/l;

.field public static final p:I


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:LYg/m;

.field private final j:LYg/m;

.field private final k:Lgg/i;

.field private final l:Lgg/i;

.field private final m:LLi/N;

.field private final n:LLi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LC8/b;

    const-string/jumbo v2, "placesManager"

    const-string/jumbo v3, "getPlacesManager()Lcom/ui/wifiman/model/signalmapper/SignalMapperPlacesManager;"

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

    const-string/jumbo v5, "analytics"

    const-string/jumbo v6, "getAnalytics()Lcom/ubnt/usurvey/analytics/Analytics;"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/4 v3, 0x3

    new-array v3, v3, [Lth/l;

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v2, v3, v0

    const/4 v0, 0x2

    aput-object v1, v3, v0

    sput-object v3, LC8/b;->o:[Lth/l;

    const/16 v0, 0x8

    sput v0, LC8/b;->p:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 9

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/ui/wifiman/ui/signal/E;-><init>()V

    iput-object p1, p0, LC8/b;->g:Lorg/kodein/di/DI;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, LC8/b$h;

    invoke-direct {v0}, LC8/b$h;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Lnd/g;

    invoke-direct {p1, v0, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    sget-object v2, LC8/b;->o:[Lth/l;

    const/4 v3, 0x0

    aget-object v3, v2, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LC8/b;->h:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v3, LC8/b$i;

    invoke-direct {v3}, LC8/b$i;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Li8/a;

    invoke-direct {p1, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v3, 0x1

    aget-object v4, v2, v3

    invoke-interface {p1, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LC8/b;->i:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v4, LC8/b$j;

    invoke-direct {v4}, LC8/b$j;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, LP7/a;

    invoke-direct {p1, v4, v1}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v0, 0x2

    aget-object v0, v2, v0

    invoke-interface {p1, p0, v0}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LC8/b;->j:LYg/m;

    sget-object p1, Lgg/a;->LATEST:Lgg/a;

    new-instance v0, LC8/b$g;

    invoke-direct {v0, p0}, LC8/b$g;-><init>(LC8/b;)V

    invoke-static {v0, p1}, Lgg/i;->N(Lgg/k;Lgg/a;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LC8/b;->k:Lgg/i;

    sget-object v1, LC8/b$e;->a:LC8/b$e;

    invoke-virtual {p1, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    new-instance v1, LC8/b$f;

    invoke-direct {v1, p0}, LC8/b$f;-><init>(LC8/b;)V

    invoke-virtual {p1, v1}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LC8/b;->l:Lgg/i;

    sget-object v0, LC8/b$k;->a:LC8/b$k;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v2

    const-string/jumbo v0, "map(...)"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lye/g;->h0(Lye/g;Lgg/i;Ljava/lang/Object;Landroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v1

    iput-object v1, p0, LC8/b;->m:LLi/N;

    new-instance v1, LC8/b$b;

    invoke-direct {v1, p0}, LC8/b$b;-><init>(LC8/b;)V

    invoke-virtual {p1, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v4

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v8}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, LC8/b;->n:LLi/N;

    return-void
.end method

.method public static final synthetic q0(LC8/b;Ljava/util/List;LC8/b$a;Ls9/d;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LC8/b;->t0(Ljava/util/List;LC8/b$a;Ls9/d;)V

    return-void
.end method

.method public static final synthetic r0(LC8/b;)Lcom/ui/wifiman/ui/signal/D;
    .locals 0

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/signal/E;->o0()Lcom/ui/wifiman/ui/signal/D;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic s0(LC8/b;)Lnd/g;
    .locals 0

    invoke-direct {p0}, LC8/b;->v0()Lnd/g;

    move-result-object p0

    return-object p0
.end method

.method private final t0(Ljava/util/List;LC8/b$a;Ls9/d;)V
    .locals 3

    new-instance v0, LTe/E$a;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ls9/d$b;

    invoke-virtual {p2}, LC8/b$a;->getTitleRes()I

    move-result p2

    invoke-direct {v2, p2}, Ls9/d$b;-><init>(I)V

    invoke-direct {v0, v1, v2, p3}, LTe/E$a;-><init>(Ljava/lang/String;Ls9/d;Ls9/d;)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private final u0()LP7/a;
    .locals 1

    iget-object v0, p0, LC8/b;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LP7/a;

    return-object v0
.end method

.method private final v0()Lnd/g;
    .locals 1

    iget-object v0, p0, LC8/b;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnd/g;

    return-object v0
.end method

.method private final w0()Li8/a;
    .locals 1

    iget-object v0, p0, LC8/b;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method


# virtual methods
.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, LC8/b;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public getTitle()LLi/N;
    .locals 1

    iget-object v0, p0, LC8/b;->m:LLi/N;

    return-object v0
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, LC8/b;->n:LLi/N;

    return-object v0
.end method

.method public p0()V
    .locals 8

    sget-object v0, Lye/d;->a:Lye/d;

    iget-object v1, p0, LC8/b;->l:Lgg/i;

    sget-object v2, LC8/b$c;->a:LC8/b$c;

    invoke-virtual {v1, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    new-instance v2, LC8/b$d;

    invoke-direct {v2, p0}, LC8/b$d;-><init>(LC8/b;)V

    invoke-virtual {v1, v2}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v1

    invoke-direct {p0}, LC8/b;->u0()LP7/a;

    move-result-object v2

    new-instance v3, LP7/c$f$b;

    invoke-direct {v3}, LP7/c$f$b;-><init>()V

    invoke-interface {v2, v3}, LP7/a;->d(LP7/c;)Lgg/b;

    move-result-object v2

    invoke-direct {p0}, LC8/b;->w0()Li8/a;

    move-result-object v3

    const/4 v4, 0x1

    new-array v5, v4, [Li8/a$b;

    sget-object v6, Li8/a$b$n;->a:Li8/a$b$n;

    const/4 v7, 0x0

    aput-object v6, v5, v7

    invoke-interface {v3, v5}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v3

    const/4 v5, 0x3

    new-array v5, v5, [Lgg/f;

    aput-object v1, v5, v7

    aput-object v2, v5, v4

    const/4 v1, 0x2

    aput-object v3, v5, v1

    invoke-static {v5}, Lgg/b;->p([Lgg/f;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "concatArray(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method
