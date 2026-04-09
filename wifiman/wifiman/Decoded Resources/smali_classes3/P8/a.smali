.class public final LP8/a;
.super LIf/f;
.source "SourceFile"


# static fields
.field static final synthetic k:[Lth/l;

.field public static final l:I


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:LLi/z;

.field private final j:LLi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/F;

    const-string/jumbo v1, "getWizard()Lcom/ui/wifiman/model/wmw/WifimanWizard;"

    const/4 v2, 0x0

    const-class v3, LP8/a;

    const-string/jumbo v4, "wizard"

    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lth/l;

    aput-object v0, v1, v2

    sput-object v1, LP8/a;->k:[Lth/l;

    const/16 v0, 0x8

    sput v0, LP8/a;->l:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 7

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LIf/f;-><init>()V

    iput-object p1, p0, LP8/a;->g:Lorg/kodein/di/DI;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, LP8/a$b;

    invoke-direct {v0}, LP8/a$b;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, Lcom/ui/wifiman/model/wmw/WifimanWizard;

    invoke-direct {p1, v0, v1}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    sget-object v0, LP8/a;->k:[Lth/l;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {p1, p0, v0}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LP8/a;->h:LYg/m;

    new-instance p1, Ls9/d$b;

    const v0, 0x7f110441

    invoke-direct {p1, v0}, Ls9/d$b;-><init>(I)V

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, LP8/a;->i:LLi/z;

    invoke-direct {p0}, LP8/a;->q0()Lcom/ui/wifiman/model/wmw/WifimanWizard;

    move-result-object p1

    invoke-interface {p1}, Lcom/ui/wifiman/model/wmw/WifimanWizard;->e()Lgg/i;

    move-result-object p1

    sget-object v0, LP8/a$a;->a:LP8/a$a;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v2

    const-string/jumbo p1, "map(...)"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lye/g;->h0(Lye/g;Lgg/i;Ljava/lang/Object;Landroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, LP8/a;->j:LLi/N;

    return-void
.end method

.method private final q0()Lcom/ui/wifiman/model/wmw/WifimanWizard;
    .locals 1

    iget-object v0, p0, LP8/a;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/wmw/WifimanWizard;

    return-object v0
.end method


# virtual methods
.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, LP8/a;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public bridge synthetic getTitle()LLi/N;
    .locals 1

    invoke-virtual {p0}, LP8/a;->p0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, LP8/a;->j:LLi/N;

    return-object v0
.end method

.method public o0()V
    .locals 2

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LP8/a;->q0()Lcom/ui/wifiman/model/wmw/WifimanWizard;

    move-result-object v1

    invoke-interface {v1}, Lcom/ui/wifiman/model/wmw/WifimanWizard;->a()Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public p0()LLi/z;
    .locals 1

    iget-object v0, p0, LP8/a;->i:LLi/z;

    return-object v0
.end method
