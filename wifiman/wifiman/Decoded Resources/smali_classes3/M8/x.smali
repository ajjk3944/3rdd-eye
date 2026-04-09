.class public final LM8/x;
.super Lcom/ui/wifiman/ui/wifi/scan/prefs/quality/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM8/x$a;
    }
.end annotation


# static fields
.field static final synthetic l:[Lth/l;

.field public static final m:I


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:LYg/m;

.field private final j:Ljava/util/List;

.field private final k:LLi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LM8/x;

    const-string/jumbo v2, "screenConfig"

    const-string/jumbo v3, "getScreenConfig()Lcom/ui/wifiman/model/ui/WifiScanHomeConfigManager;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "viewRouter"

    const-string/jumbo v5, "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lth/l;

    aput-object v0, v2, v4

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, LM8/x;->l:[Lth/l;

    const/16 v0, 0x8

    sput v0, LM8/x;->m:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 9

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/ui/wifiman/ui/wifi/scan/prefs/quality/d;-><init>()V

    iput-object p1, p0, LM8/x;->g:Lorg/kodein/di/DI;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, LM8/x$d;

    invoke-direct {v0}, LM8/x$d;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Lde/F;

    invoke-direct {p1, v0, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    sget-object v2, LM8/x;->l:[Lth/l;

    const/4 v3, 0x0

    aget-object v3, v2, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LM8/x;->h:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v3, LM8/x$e;

    invoke-direct {v3}, LM8/x$e;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, Li8/a;

    invoke-direct {p1, v3, v1}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v0, 0x1

    aget-object v0, v2, v0

    invoke-interface {p1, p0, v0}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LM8/x;->i:LYg/m;

    sget-object p1, Lic/c;->NUMBER:Lic/c;

    sget-object v0, Lic/c;->HEALTH:Lic/c;

    filled-new-array {p1, v0}, [Lic/c;

    move-result-object p1

    invoke-static {p1}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LM8/x;->j:Ljava/util/List;

    invoke-direct {p0}, LM8/x;->r0()Lde/F;

    move-result-object v0

    invoke-interface {v0}, Lee/c;->b()Lgg/i;

    move-result-object v0

    sget-object v1, LM8/x$b;->a:LM8/x$b;

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    new-instance v1, LM8/x$c;

    invoke-direct {v1, p0}, LM8/x$c;-><init>(LM8/x;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v3

    const-string/jumbo v0, "map(...)"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lic/c;

    invoke-direct {p0, p1}, LM8/x;->s0(Lic/c;)LCi/c;

    move-result-object v4

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v8}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, LM8/x;->k:LLi/N;

    return-void
.end method

.method public static synthetic p0(Lcom/ui/wifiman/ui/wifi/scan/prefs/quality/c;Lde/E;)Lde/E;
    .locals 0

    invoke-static {p0, p1}, LM8/x;->u0(Lcom/ui/wifiman/ui/wifi/scan/prefs/quality/c;Lde/E;)Lde/E;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic q0(LM8/x;Lic/c;)LCi/c;
    .locals 0

    invoke-direct {p0, p1}, LM8/x;->s0(Lic/c;)LCi/c;

    move-result-object p0

    return-object p0
.end method

.method private final r0()Lde/F;
    .locals 1

    iget-object v0, p0, LM8/x;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lde/F;

    return-object v0
.end method

.method private final s0(Lic/c;)LCi/c;
    .locals 6

    iget-object v0, p0, LM8/x;->j:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lic/c;

    sget-object v3, LM8/x$a;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v2, v4, :cond_2

    const/4 v5, 0x2

    if-ne v2, v5, :cond_1

    new-instance v2, Lcom/ui/wifiman/ui/wifi/scan/prefs/quality/c$b;

    sget-object v5, Lic/c;->HEALTH:Lic/c;

    if-ne p1, v5, :cond_0

    move v3, v4

    :cond_0
    invoke-direct {v2, v3}, Lcom/ui/wifiman/ui/wifi/scan/prefs/quality/c$b;-><init>(Z)V

    goto :goto_1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    new-instance v2, Lcom/ui/wifiman/ui/wifi/scan/prefs/quality/c$a;

    sget-object v5, Lic/c;->NUMBER:Lic/c;

    if-ne p1, v5, :cond_3

    move v3, v4

    :cond_3
    invoke-direct {v2, v3}, Lcom/ui/wifiman/ui/wifi/scan/prefs/quality/c$a;-><init>(Z)V

    :goto_1
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    invoke-static {v1}, LCi/a;->h(Ljava/lang/Iterable;)LCi/c;

    move-result-object p1

    return-object p1
.end method

.method private final t0()Li8/a;
    .locals 1

    iget-object v0, p0, LM8/x;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method

.method private static final u0(Lcom/ui/wifiman/ui/wifi/scan/prefs/quality/c;Lde/E;)Lde/E;
    .locals 7

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/ui/wifiman/ui/wifi/scan/prefs/quality/c$a;

    if-eqz v0, :cond_0

    sget-object p0, Lic/c;->NUMBER:Lic/c;

    :goto_0
    move-object v3, p0

    goto :goto_1

    :cond_0
    instance-of p0, p0, Lcom/ui/wifiman/ui/wifi/scan/prefs/quality/c$b;

    if-eqz p0, :cond_1

    sget-object p0, Lic/c;->HEALTH:Lic/c;

    goto :goto_0

    :goto_1
    const/16 v5, 0xb

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Lde/E;->b(Lde/E;Lic/e;Lic/d;Lic/c;Lic/b;ILjava/lang/Object;)Lde/E;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method


# virtual methods
.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, LM8/x;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, LM8/x;->k:LLi/N;

    return-object v0
.end method

.method public o0(Lcom/ui/wifiman/ui/wifi/scan/prefs/quality/c;)V
    .locals 5

    const-string/jumbo v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LM8/x;->r0()Lde/F;

    move-result-object v1

    new-instance v2, LM8/w;

    invoke-direct {v2, p1}, LM8/w;-><init>(Lcom/ui/wifiman/ui/wifi/scan/prefs/quality/c;)V

    invoke-interface {v1, v2}, Lee/c;->a(Lmh/l;)Lgg/b;

    move-result-object p1

    invoke-direct {p0}, LM8/x;->t0()Li8/a;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Li8/a$b;

    sget-object v3, Li8/a$b$n;->a:Li8/a$b$n;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v1, v2}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v1

    invoke-virtual {p1, v1}, Lgg/b;->g(Lgg/f;)Lgg/b;

    move-result-object p1

    const-string/jumbo v1, "andThen(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method
