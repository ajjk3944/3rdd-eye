.class public final Lw8/c;
.super LRe/a;
.source "SourceFile"


# static fields
.field static final synthetic r:[Lth/l;

.field public static final s:I


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:LYg/m;

.field private final j:LYg/m;

.field private final k:LYg/m;

.field private final l:LYg/m;

.field private final m:LYg/m;

.field private final n:LYg/m;

.field private final o:LLi/N;

.field private final p:LLi/z;

.field private final q:LLi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, Lw8/c;

    const-string/jumbo v2, "viewRouter"

    const-string/jumbo v3, "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "toastService"

    const-string/jumbo v5, "getToastService()Lcom/ui/wifiman/domain/toast/ToastService;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/F;

    const-string/jumbo v5, "supportManager"

    const-string/jumbo v6, "getSupportManager()Lcom/ui/wifiman/model/support/SupportManager;"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v3

    new-instance v5, Lkotlin/jvm/internal/F;

    const-string/jumbo v6, "accountManager"

    const-string/jumbo v7, "getAccountManager()Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;"

    invoke-direct {v5, v1, v6, v7, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v5}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v5

    new-instance v6, Lkotlin/jvm/internal/F;

    const-string/jumbo v7, "clipboardManager"

    const-string/jumbo v8, "getClipboardManager()Landroid/content/ClipboardManager;"

    invoke-direct {v6, v1, v7, v8, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v6}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v6

    new-instance v7, Lkotlin/jvm/internal/F;

    const-string/jumbo v8, "appSession"

    const-string/jumbo v9, "getAppSession()Lcom/ui/wifiman/model/session/AppSessionManager;"

    invoke-direct {v7, v1, v8, v9, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v7}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v7

    new-instance v8, Lkotlin/jvm/internal/F;

    const-string/jumbo v9, "appSupportFile"

    const-string/jumbo v10, "getAppSupportFile()Lcom/ui/wifiman/support/supportfile/AppSupportFile;"

    invoke-direct {v8, v1, v9, v10, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v8}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/4 v8, 0x7

    new-array v8, v8, [Lth/l;

    aput-object v0, v8, v4

    const/4 v0, 0x1

    aput-object v2, v8, v0

    const/4 v0, 0x2

    aput-object v3, v8, v0

    const/4 v0, 0x3

    aput-object v5, v8, v0

    const/4 v0, 0x4

    aput-object v6, v8, v0

    const/4 v0, 0x5

    aput-object v7, v8, v0

    const/4 v0, 0x6

    aput-object v1, v8, v0

    sput-object v8, Lw8/c;->r:[Lth/l;

    const/16 v0, 0x8

    sput v0, Lw8/c;->s:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 7

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LRe/a;-><init>()V

    iput-object p1, p0, Lw8/c;->g:Lorg/kodein/di/DI;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, Lw8/c$i;

    invoke-direct {v0}, Lw8/c$i;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Li8/a;

    invoke-direct {p1, v0, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    sget-object v2, Lw8/c;->r:[Lth/l;

    const/4 v3, 0x0

    aget-object v3, v2, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lw8/c;->h:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v3, Lw8/c$j;

    invoke-direct {v3}, Lw8/c$j;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lhc/b;

    invoke-direct {p1, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v3, 0x1

    aget-object v3, v2, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lw8/c;->i:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v3, Lw8/c$k;

    invoke-direct {v3}, Lw8/c$k;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lcom/ui/wifiman/model/support/SupportManager;

    invoke-direct {p1, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v3, 0x2

    aget-object v3, v2, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lw8/c;->j:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v3, Lw8/c$l;

    invoke-direct {v3}, Lw8/c$l;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;

    invoke-direct {p1, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v3, 0x3

    aget-object v3, v2, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lw8/c;->k:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v3, Lw8/c$m;

    invoke-direct {v3}, Lw8/c$m;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Landroid/content/ClipboardManager;

    invoke-direct {p1, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v3, 0x4

    aget-object v3, v2, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lw8/c;->l:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v3, Lw8/c$n;

    invoke-direct {v3}, Lw8/c$n;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lld/b;

    invoke-direct {p1, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v3, 0x5

    aget-object v3, v2, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lw8/c;->m:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v3, Lw8/c$o;

    invoke-direct {v3}, Lw8/c$o;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, Lve/a;

    invoke-direct {p1, v3, v1}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v0, 0x6

    aget-object v0, v2, v0

    invoke-interface {p1, p0, v0}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lw8/c;->n:LYg/m;

    new-instance p1, Ls9/d$a;

    const-string v0, "2.12.1"

    sget-object v1, Lw8/c$a;->a:Lw8/c$a;

    invoke-direct {p1, v0, v1}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, Lw8/c;->o:LLi/N;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, Lw8/c;->p:LLi/z;

    invoke-direct {p0}, Lw8/c;->J0()Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;

    move-result-object p1

    invoke-interface {p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;->e()Lgg/i;

    move-result-object p1

    sget-object v0, Lw8/c$b;->a:Lw8/c$b;

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

    iput-object p1, p0, Lw8/c;->q:LLi/N;

    return-void
.end method

.method public static final synthetic F0(Lw8/c;)Lve/a;
    .locals 0

    invoke-direct {p0}, Lw8/c;->L0()Lve/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic G0(Lw8/c;)Landroid/content/ClipboardManager;
    .locals 0

    invoke-direct {p0}, Lw8/c;->M0()Landroid/content/ClipboardManager;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic H0(Lw8/c;)Lhc/b;
    .locals 0

    invoke-direct {p0}, Lw8/c;->O0()Lhc/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic I0(Lw8/c;)Li8/a;
    .locals 0

    invoke-direct {p0}, Lw8/c;->P0()Li8/a;

    move-result-object p0

    return-object p0
.end method

.method private final J0()Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;
    .locals 1

    iget-object v0, p0, Lw8/c;->k:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;

    return-object v0
.end method

.method private final K0()Lld/b;
    .locals 1

    iget-object v0, p0, Lw8/c;->m:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lld/b;

    return-object v0
.end method

.method private final L0()Lve/a;
    .locals 1

    iget-object v0, p0, Lw8/c;->n:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lve/a;

    return-object v0
.end method

.method private final M0()Landroid/content/ClipboardManager;
    .locals 1

    iget-object v0, p0, Lw8/c;->l:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ClipboardManager;

    return-object v0
.end method

.method private final N0()Lcom/ui/wifiman/model/support/SupportManager;
    .locals 1

    iget-object v0, p0, Lw8/c;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/support/SupportManager;

    return-object v0
.end method

.method private final O0()Lhc/b;
    .locals 1

    iget-object v0, p0, Lw8/c;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhc/b;

    return-object v0
.end method

.method private final P0()Li8/a;
    .locals 1

    iget-object v0, p0, Lw8/c;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method


# virtual methods
.method public A0()V
    .locals 5

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, Lw8/c;->P0()Li8/a;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Li8/a$b;

    sget-object v3, Li8/a$b$b;->a:Li8/a$b$b;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v1, v2}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public B0()V
    .locals 3

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, Lw8/c;->N0()Lcom/ui/wifiman/model/support/SupportManager;

    move-result-object v1

    invoke-interface {v1}, Lcom/ui/wifiman/model/support/SupportManager;->a()Lgg/z;

    move-result-object v1

    new-instance v2, Lw8/c$d;

    invoke-direct {v2, p0}, Lw8/c$d;-><init>(Lw8/c;)V

    invoke-virtual {v1, v2}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object v1

    new-instance v2, Lw8/c$e;

    invoke-direct {v2, p0}, Lw8/c$e;-><init>(Lw8/c;)V

    invoke-virtual {v1, v2}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v1

    sget-object v2, Lw8/c$f;->a:Lw8/c$f;

    invoke-virtual {v1, v2}, Lgg/b;->z(Lkg/f;)Lgg/b;

    move-result-object v1

    new-instance v2, Lw8/c$g;

    invoke-direct {v2, p0}, Lw8/c$g;-><init>(Lw8/c;)V

    invoke-virtual {v1, v2}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "onErrorResumeNext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public C0()V
    .locals 5

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, Lw8/c;->P0()Li8/a;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Li8/a$b;

    sget-object v3, Li8/a$b$F;->a:Li8/a$b$F;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v1, v2}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public D0()V
    .locals 5

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, Lw8/c;->P0()Li8/a;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Li8/a$b;

    sget-object v3, Li8/a$b$G;->a:Li8/a$b$G;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v1, v2}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public E0()V
    .locals 3

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, Lw8/c;->K0()Lld/b;

    move-result-object v1

    invoke-interface {v1}, Lld/b;->a()Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    new-instance v2, Lw8/c$h;

    invoke-direct {v2, p0}, Lw8/c$h;-><init>(Lw8/c;)V

    invoke-virtual {v1, v2}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "flatMapCompletable(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public Q0()LLi/z;
    .locals 1

    iget-object v0, p0, Lw8/c;->p:LLi/z;

    return-object v0
.end method

.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, Lw8/c;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, Lw8/c;->o:LLi/N;

    return-object v0
.end method

.method public o0()LLi/N;
    .locals 1

    iget-object v0, p0, Lw8/c;->q:LLi/N;

    return-object v0
.end method

.method public bridge synthetic p0()LLi/N;
    .locals 1

    invoke-virtual {p0}, Lw8/c;->Q0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public q0()V
    .locals 5

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, Lw8/c;->P0()Li8/a;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Li8/a$b;

    sget-object v3, Li8/a$b$r;->a:Li8/a$b$r;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v1, v2}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public r0()V
    .locals 5

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, Lw8/c;->P0()Li8/a;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Li8/a$b;

    sget-object v3, Li8/a$b$r;->a:Li8/a$b$r;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v1, v2}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public s0()V
    .locals 5

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, Lw8/c;->P0()Li8/a;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Li8/a$b;

    sget-object v3, Li8/a$b$a;->a:Li8/a$b$a;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v1, v2}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public t0()V
    .locals 5

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, Lw8/c;->P0()Li8/a;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Li8/a$b;

    sget-object v3, Li8/c;->a:Li8/c;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v1, v2}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public u0()V
    .locals 5

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, Lw8/c;->P0()Li8/a;

    move-result-object v1

    new-instance v2, Li8/a$b$o;

    const-string/jumbo v3, "https://community.ui.com/tags/wifiman"

    invoke-direct {v2, v3}, Li8/a$b$o;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x1

    new-array v3, v3, [Li8/a$b;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    invoke-interface {v1, v3}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public v0()V
    .locals 5

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, Lw8/c;->P0()Li8/a;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Li8/a$b;

    sget-object v3, Li8/a$b$f$a;->a:Li8/a$b$f$a;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v1, v2}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public w0()V
    .locals 4

    sget-object v0, Lye/d;->a:Lye/d;

    sget-object v1, LAg/c;->a:LAg/c;

    invoke-direct {p0}, Lw8/c;->J0()Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;

    move-result-object v2

    invoke-interface {v2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;->e()Lgg/i;

    move-result-object v2

    invoke-direct {p0}, Lw8/c;->J0()Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;

    move-result-object v3

    invoke-interface {v3}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;->a()Lgg/i;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, LAg/c;->a(Lgg/i;Lgg/i;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    new-instance v2, Lw8/c$c;

    invoke-direct {v2, p0}, Lw8/c$c;-><init>(Lw8/c;)V

    invoke-virtual {v1, v2}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "flatMapCompletable(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public x0()V
    .locals 5

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, Lw8/c;->P0()Li8/a;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Li8/a$b;

    sget-object v3, Li8/a$b$u;->a:Li8/a$b$u;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v1, v2}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public y0()V
    .locals 5

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, Lw8/c;->P0()Li8/a;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Li8/a$b;

    sget-object v3, Li8/a$b$s;->a:Li8/a$b$s;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v1, v2}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public z0()V
    .locals 5

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, Lw8/c;->P0()Li8/a;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Li8/a$b;

    sget-object v3, Li8/a$b$q;->a:Li8/a$b$q;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v1, v2}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method
