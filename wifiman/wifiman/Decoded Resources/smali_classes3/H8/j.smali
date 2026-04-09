.class public final LH8/j;
.super Lcom/ui/wifiman/ui/teleport/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH8/j$a;,
        LH8/j$b;
    }
.end annotation


# static fields
.field static final synthetic t:[Lth/l;

.field public static final u:I


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:LYg/m;

.field private final j:LYg/m;

.field private final k:LYg/m;

.field private final l:LYg/m;

.field private final m:LYg/m;

.field private final n:Lgg/i;

.field private final o:Lgg/i;

.field private final p:LLi/N;

.field private final q:LLi/N;

.field private final r:Ljava/util/Map;

.field private final s:LLi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LH8/j;

    const-string/jumbo v2, "teleportAvailableService"

    const-string/jumbo v3, "getTeleportAvailableService()Lcom/ui/wifiman/model/teleport/TeleportAvailableService;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "teleportConsoles"

    const-string/jumbo v5, "getTeleportConsoles()Lcom/ui/wifiman/model/teleport/TeleportConsoleService;"

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

    const-string/jumbo v6, "deeplinkConsoleConnection"

    const-string/jumbo v7, "getDeeplinkConsoleConnection()Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessor;"

    invoke-direct {v5, v1, v6, v7, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v5}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v5

    new-instance v6, Lkotlin/jvm/internal/F;

    const-string/jumbo v7, "pickerEditModeManager"

    const-string/jumbo v8, "getPickerEditModeManager()Lcom/ubnt/usurvey/ui/teleport/TeleportConsolePickerVM$EditModeManager;"

    invoke-direct {v6, v1, v7, v8, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v6}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v6

    new-instance v7, Lkotlin/jvm/internal/F;

    const-string/jumbo v8, "teleportInvitationService"

    const-string/jumbo v9, "getTeleportInvitationService()Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationService;"

    invoke-direct {v7, v1, v8, v9, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v7}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/4 v7, 0x6

    new-array v7, v7, [Lth/l;

    aput-object v0, v7, v4

    const/4 v0, 0x1

    aput-object v2, v7, v0

    const/4 v0, 0x2

    aput-object v3, v7, v0

    const/4 v0, 0x3

    aput-object v5, v7, v0

    const/4 v0, 0x4

    aput-object v6, v7, v0

    const/4 v0, 0x5

    aput-object v1, v7, v0

    sput-object v7, LH8/j;->t:[Lth/l;

    const/16 v0, 0x8

    sput v0, LH8/j;->u:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 9

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/ui/wifiman/ui/teleport/d;-><init>()V

    iput-object p1, p0, LH8/j;->g:Lorg/kodein/di/DI;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, LH8/j$g;

    invoke-direct {v0}, LH8/j$g;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, LFd/s;

    invoke-direct {p1, v0, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    sget-object v2, LH8/j;->t:[Lth/l;

    const/4 v3, 0x0

    aget-object v3, v2, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LH8/j;->h:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v3, LH8/j$h;

    invoke-direct {v3}, LH8/j$h;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, LFd/C;

    invoke-direct {p1, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v3, 0x1

    aget-object v3, v2, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LH8/j;->i:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v3, LH8/j$i;

    invoke-direct {v3}, LH8/j$i;-><init>()V

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

    iput-object p1, p0, LH8/j;->j:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v3, LH8/j$j;

    invoke-direct {v3}, LH8/j$j;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lcom/ubnt/usurvey/ui/teleport/deeplink/a;

    invoke-direct {p1, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v3, 0x3

    aget-object v3, v2, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LH8/j;->k:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v3, LH8/j$k;

    invoke-direct {v3}, LH8/j$k;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, LH8/d$b;

    invoke-direct {p1, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v3, 0x4

    aget-object v3, v2, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LH8/j;->l:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v3, LH8/j$l;

    invoke-direct {v3}, LH8/j$l;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationService;

    invoke-direct {p1, v3, v1}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v0, 0x5

    aget-object v0, v2, v0

    invoke-interface {p1, p0, v0}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LH8/j;->m:LYg/m;

    invoke-direct {p0}, LH8/j;->B0()LFd/s;

    move-result-object p1

    invoke-interface {p1}, LFd/s;->getState()Lgg/i;

    move-result-object p1

    invoke-direct {p0}, LH8/j;->z0()Lcom/ubnt/usurvey/ui/teleport/deeplink/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/ubnt/usurvey/ui/teleport/deeplink/a;->getState()Lgg/i;

    move-result-object v0

    new-instance v1, LH8/j$m;

    invoke-direct {v1, p0}, LH8/j$m;-><init>(LH8/j;)V

    invoke-static {p1, v0, v1}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    const-string/jumbo p1, "distinctUntilChanged(...)"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, LH8/j;->n:Lgg/i;

    invoke-direct {p0}, LH8/j;->C0()LFd/C;

    move-result-object v0

    invoke-interface {v0}, LFd/C;->getAll()Lgg/i;

    move-result-object v0

    invoke-direct {p0}, LH8/j;->A0()LH8/d$b;

    move-result-object v2

    invoke-interface {v2}, LH8/d$b;->a()Lgg/i;

    move-result-object v2

    sget-object v3, LH8/j$c;->a:LH8/j$c;

    invoke-static {v0, v2, v3}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v3

    invoke-static {v3, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v3, p0, LH8/j;->o:Lgg/i;

    new-instance v4, Lcom/ui/wifiman/ui/teleport/c$b;

    new-instance v0, Ls9/d$c;

    const-string v2, ""

    invoke-direct {v0, v2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    invoke-direct {v4, v0}, Lcom/ui/wifiman/ui/teleport/c$b;-><init>(Ls9/d;)V

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v8}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v0

    iput-object v0, p0, LH8/j;->p:LLi/N;

    sget-object v2, Lcom/ui/wifiman/ui/teleport/b$b;->a:Lcom/ui/wifiman/ui/teleport/b$b;

    const/4 v5, 0x6

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object v0

    iput-object v0, p0, LH8/j;->q:LLi/N;

    invoke-static {}, LH8/j$a;->getEntries()Lfh/a;

    move-result-object v0

    const/16 v1, 0xa

    invoke-static {v0, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, LZg/U;->d(I)I

    move-result v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Lsh/m;->d(II)I

    move-result v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, LH8/j$a;

    invoke-virtual {v3}, LH8/j$a;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iput-object v2, p0, LH8/j;->r:Ljava/util/Map;

    invoke-direct {p0}, LH8/j;->C0()LFd/C;

    move-result-object v0

    invoke-interface {v0}, LFd/C;->a()Lgg/i;

    move-result-object v0

    sget-object v1, LH8/j$n;->a:LH8/j$n;

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    sget-object v1, LH8/j$o;->a:LH8/j$o;

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LCi/a;->a()LCi/f;

    move-result-object v3

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v7}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, LH8/j;->s:LLi/N;

    return-void
.end method

.method private final A0()LH8/d$b;
    .locals 1

    iget-object v0, p0, LH8/j;->l:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LH8/d$b;

    return-object v0
.end method

.method private final B0()LFd/s;
    .locals 1

    iget-object v0, p0, LH8/j;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFd/s;

    return-object v0
.end method

.method private final C0()LFd/C;
    .locals 1

    iget-object v0, p0, LH8/j;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFd/C;

    return-object v0
.end method

.method private final D0()Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationService;
    .locals 1

    iget-object v0, p0, LH8/j;->m:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationService;

    return-object v0
.end method

.method private final E0()Li8/a;
    .locals 1

    iget-object v0, p0, LH8/j;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method

.method private final F0(LFd/s$a;)Lcom/ui/wifiman/ui/teleport/b;
    .locals 1

    instance-of v0, p1, LFd/s$a$a$a;

    if-eqz v0, :cond_0

    sget-object p1, Lcom/ui/wifiman/ui/teleport/b$c;->a:Lcom/ui/wifiman/ui/teleport/b$c;

    goto :goto_0

    :cond_0
    sget-object v0, LFd/s$a$b;->a:LFd/s$a$b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lcom/ui/wifiman/ui/teleport/b$b;->a:Lcom/ui/wifiman/ui/teleport/b$b;

    goto :goto_0

    :cond_1
    sget-object v0, LFd/s$a$c$a;->a:LFd/s$a$c$a;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p1, Lcom/ui/wifiman/ui/teleport/b$a$a;->a:Lcom/ui/wifiman/ui/teleport/b$a$a;

    goto :goto_0

    :cond_2
    sget-object v0, LFd/s$a$c$b;->a:LFd/s$a$c$b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p1, Lcom/ui/wifiman/ui/teleport/b$a$b;->a:Lcom/ui/wifiman/ui/teleport/b$a$b;

    goto :goto_0

    :cond_3
    sget-object v0, LFd/s$a$c$c;->a:LFd/s$a$c$c;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p1, Lcom/ui/wifiman/ui/teleport/b$a$c;->a:Lcom/ui/wifiman/ui/teleport/b$a$c;

    goto :goto_0

    :cond_4
    sget-object v0, LFd/s$a$c$d;->a:LFd/s$a$c$d;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    sget-object p1, Lcom/ui/wifiman/ui/teleport/b$a$d;->a:Lcom/ui/wifiman/ui/teleport/b$a$d;

    :goto_0
    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public static final synthetic x0(LH8/j;)Li8/a;
    .locals 0

    invoke-direct {p0}, LH8/j;->E0()Li8/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic y0(LH8/j;LFd/s$a;)Lcom/ui/wifiman/ui/teleport/b;
    .locals 0

    invoke-direct {p0, p1}, LH8/j;->F0(LFd/s$a;)Lcom/ui/wifiman/ui/teleport/b;

    move-result-object p0

    return-object p0
.end method

.method private final z0()Lcom/ubnt/usurvey/ui/teleport/deeplink/a;
    .locals 1

    iget-object v0, p0, LH8/j;->k:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ubnt/usurvey/ui/teleport/deeplink/a;

    return-object v0
.end method


# virtual methods
.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, LH8/j;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, LH8/j;->q:LLi/N;

    return-object v0
.end method

.method public o0()LLi/N;
    .locals 1

    iget-object v0, p0, LH8/j;->s:LLi/N;

    return-object v0
.end method

.method public p0()LLi/N;
    .locals 1

    iget-object v0, p0, LH8/j;->p:LLi/N;

    return-object v0
.end method

.method public q0()V
    .locals 5

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LH8/j;->E0()Li8/a;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Li8/a$b;

    sget-object v3, Li8/a$b$D$g;->a:Li8/a$b$D$g;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v1, v2}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public r0()V
    .locals 3

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LH8/j;->A0()LH8/d$b;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v1, v2}, LH8/d$b;->update(Z)Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public s0()V
    .locals 3

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LH8/j;->A0()LH8/d$b;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, LH8/d$b;->update(Z)Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public t0()V
    .locals 3

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LH8/j;->A0()LH8/d$b;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, LH8/d$b;->update(Z)Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public u0()V
    .locals 5

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LH8/j;->E0()Li8/a;

    move-result-object v1

    new-instance v2, Li8/a$b$t;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Li8/a$b$t;-><init>(Ljava/lang/String;)V

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

    invoke-direct {p0}, LH8/j;->E0()Li8/a;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Li8/a$b;

    sget-object v3, Li8/o;->a:Li8/o;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v1, v2}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public w0(Ljava/lang/String;)V
    .locals 2

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lye/d;->a:Lye/d;

    iget-object v1, p0, LH8/j;->r:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast p1, LH8/j$a;

    sget-object v1, LH8/j$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    const/4 v1, 0x2

    if-ne p1, v1, :cond_0

    invoke-direct {p0}, LH8/j;->C0()LFd/C;

    move-result-object p1

    invoke-interface {p1}, LFd/C;->a()Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->o0()Lgg/z;

    move-result-object p1

    const-string/jumbo v1, "firstOrError(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ll9/f;->f(Lgg/z;)Lgg/n;

    move-result-object p1

    new-instance v1, LH8/j$f;

    invoke-direct {v1, p0}, LH8/j$f;-><init>(LH8/j;)V

    invoke-virtual {p1, v1}, Lgg/n;->k(Lkg/n;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    invoke-direct {p0}, LH8/j;->D0()Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationService;

    move-result-object p1

    invoke-interface {p1}, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationService;->a()Lgg/z;

    move-result-object p1

    invoke-virtual {p1}, Lgg/z;->X()Lgg/n;

    move-result-object p1

    new-instance v1, LH8/j$d;

    invoke-direct {v1, p0}, LH8/j$d;-><init>(LH8/j;)V

    invoke-virtual {p1, v1}, Lgg/n;->s(Lkg/n;)Lgg/n;

    move-result-object p1

    new-instance v1, LH8/j$e;

    invoke-direct {v1, p0}, LH8/j$e;-><init>(LH8/j;)V

    invoke-virtual {p1, v1}, Lgg/n;->k(Lkg/n;)Lgg/b;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0, p1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method
