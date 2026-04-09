.class public final LP8/k;
.super LIf/F;
.source "SourceFile"


# static fields
.field static final synthetic k:[Lth/l;

.field public static final l:I


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:Lgg/i;

.field private final j:LLi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/F;

    const-string/jumbo v1, "getWizardUpgrade()Lcom/ui/wifiman/model/wmw/WifimanWizardFirmwareUpgrade;"

    const/4 v2, 0x0

    const-class v3, LP8/k;

    const-string/jumbo v4, "wizardUpgrade"

    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lth/l;

    aput-object v0, v1, v2

    sput-object v1, LP8/k;->k:[Lth/l;

    const/16 v0, 0x8

    sput v0, LP8/k;->l:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 7

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LIf/F;-><init>()V

    iput-object p1, p0, LP8/k;->g:Lorg/kodein/di/DI;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, LP8/k$c;

    invoke-direct {v0}, LP8/k$c;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, Lcom/ui/wifiman/model/wmw/g;

    invoke-direct {p1, v0, v1}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    sget-object v0, LP8/k;->k:[Lth/l;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {p1, p0, v0}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LP8/k;->h:LYg/m;

    invoke-direct {p0}, LP8/k;->q0()Lcom/ui/wifiman/model/wmw/g;

    move-result-object p1

    invoke-interface {p1}, Lcom/ui/wifiman/model/wmw/g;->a()Lgg/i;

    move-result-object p1

    invoke-direct {p0}, LP8/k;->q0()Lcom/ui/wifiman/model/wmw/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/ui/wifiman/model/wmw/g;->f()Lgg/i;

    move-result-object v0

    sget-object v1, LP8/k$a;->a:LP8/k$a;

    invoke-static {p1, v0, v1}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "combineLatest(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ll9/f;->e(Lgg/i;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object v1

    const-string/jumbo p1, "refCount(...)"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, LP8/k;->i:Lgg/i;

    new-instance v2, LIf/E$a;

    const-string p1, ""

    invoke-direct {v2, p1}, LIf/E$a;-><init>(Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, LP8/k;->j:LLi/N;

    return-void
.end method

.method public static final synthetic p0(LP8/k;)Lcom/ui/wifiman/model/wmw/g;
    .locals 0

    invoke-direct {p0}, LP8/k;->q0()Lcom/ui/wifiman/model/wmw/g;

    move-result-object p0

    return-object p0
.end method

.method private final q0()Lcom/ui/wifiman/model/wmw/g;
    .locals 1

    iget-object v0, p0, LP8/k;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/wmw/g;

    return-object v0
.end method


# virtual methods
.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, LP8/k;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, LP8/k;->j:LLi/N;

    return-object v0
.end method

.method public o0()V
    .locals 4

    sget-object v0, Lye/d;->a:Lye/d;

    sget-object v1, LAg/c;->a:LAg/c;

    invoke-direct {p0}, LP8/k;->q0()Lcom/ui/wifiman/model/wmw/g;

    move-result-object v2

    invoke-interface {v2}, Lcom/ui/wifiman/model/wmw/g;->a()Lgg/i;

    move-result-object v2

    invoke-direct {p0}, LP8/k;->q0()Lcom/ui/wifiman/model/wmw/g;

    move-result-object v3

    invoke-interface {v3}, Lcom/ui/wifiman/model/wmw/g;->f()Lgg/i;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, LAg/c;->a(Lgg/i;Lgg/i;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    new-instance v2, LP8/k$b;

    invoke-direct {v2, p0}, LP8/k$b;-><init>(LP8/k;)V

    invoke-virtual {v1, v2}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "flatMapCompletable(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method
