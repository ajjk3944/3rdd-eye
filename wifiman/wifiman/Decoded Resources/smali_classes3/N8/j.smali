.class public final LN8/j;
.super LHf/b$a;
.source "SourceFile"


# static fields
.field static final synthetic n:[Lth/l;

.field public static final o:I


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:LLi/z;

.field private final j:LLi/z;

.field private final k:LLi/z;

.field private final l:LLi/z;

.field private final m:LLi/z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/F;

    const-string/jumbo v1, "getWizardManager()Lcom/ubnt/usurvey/ui/wizard/AppWizardManager;"

    const/4 v2, 0x0

    const-class v3, LN8/j;

    const-string/jumbo v4, "wizardManager"

    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lth/l;

    aput-object v0, v1, v2

    sput-object v1, LN8/j;->n:[Lth/l;

    const/16 v0, 0x8

    sput v0, LN8/j;->o:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 3

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LHf/b$a;-><init>()V

    iput-object p1, p0, LN8/j;->g:Lorg/kodein/di/DI;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, LN8/j$a;

    invoke-direct {v0}, LN8/j$a;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, LN8/a;

    invoke-direct {p1, v0, v1}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    sget-object v1, LN8/j;->n:[Lth/l;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {p1, p0, v1}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LN8/j;->h:LYg/m;

    new-instance p1, Ls9/d$b;

    const v1, 0x7f110435

    invoke-direct {p1, v1}, Ls9/d$b;-><init>(I)V

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, LN8/j;->i:LLi/z;

    new-instance p1, Ls9/d$b;

    const v1, 0x7f110434

    invoke-direct {p1, v1}, Ls9/d$b;-><init>(I)V

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, LN8/j;->j:LLi/z;

    sget-object p1, LPe/b;->a:LPe/b;

    invoke-virtual {p1}, LPe/b;->a()Ls9/c$a;

    move-result-object p1

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, LN8/j;->k:LLi/z;

    new-instance p1, Ls9/d$b;

    const v1, 0x7f110433

    invoke-direct {p1, v1}, Ls9/d$b;-><init>(I)V

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, LN8/j;->l:LLi/z;

    invoke-static {v0}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, LN8/j;->m:LLi/z;

    return-void
.end method

.method private final y0()LN8/a;
    .locals 1

    iget-object v0, p0, LN8/j;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LN8/a;

    return-object v0
.end method


# virtual methods
.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, LN8/j;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public bridge synthetic getTitle()LLi/N;
    .locals 1

    invoke-virtual {p0}, LN8/j;->x0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic n0()LLi/N;
    .locals 1

    invoke-virtual {p0}, LN8/j;->t0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic o0()LLi/N;
    .locals 1

    invoke-virtual {p0}, LN8/j;->u0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic p0()LLi/N;
    .locals 1

    invoke-virtual {p0}, LN8/j;->v0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic q0()LLi/N;
    .locals 1

    invoke-virtual {p0}, LN8/j;->w0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public r0()V
    .locals 2

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LN8/j;->y0()LN8/a;

    move-result-object v1

    invoke-interface {v1}, LN8/a;->b()Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public s0()V
    .locals 0

    return-void
.end method

.method public t0()LLi/z;
    .locals 1

    iget-object v0, p0, LN8/j;->l:LLi/z;

    return-object v0
.end method

.method public u0()LLi/z;
    .locals 1

    iget-object v0, p0, LN8/j;->m:LLi/z;

    return-object v0
.end method

.method public v0()LLi/z;
    .locals 1

    iget-object v0, p0, LN8/j;->k:LLi/z;

    return-object v0
.end method

.method public w0()LLi/z;
    .locals 1

    iget-object v0, p0, LN8/j;->j:LLi/z;

    return-object v0
.end method

.method public x0()LLi/z;
    .locals 1

    iget-object v0, p0, LN8/j;->i:LLi/z;

    return-object v0
.end method
