.class public final LH8/d;
.super Lcom/ui/wifiman/ui/teleport/consoles/i;
.source "SourceFile"

# interfaces
.implements LK8/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH8/d$a;,
        LH8/d$b;,
        LH8/d$c;,
        LH8/d$d;,
        LH8/d$e;
    }
.end annotation


# static fields
.field public static final w:LH8/d$a;

.field static final synthetic x:[Lth/l;

.field public static final y:I


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:LYg/m;

.field private final j:LYg/m;

.field private final k:LYg/m;

.field private final l:LYg/m;

.field private final m:LYg/m;

.field private final n:LYg/m;

.field private final o:LYg/m;

.field private final p:LYg/m;

.field private final q:LLi/y;

.field private final r:Lgg/i;

.field private final s:Lgg/i;

.field private final t:Lgg/i;

.field private final u:Lye/d$a;

.field private final v:LLi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, LH8/d;

    const-string/jumbo v2, "teleportManager"

    const-string/jumbo v3, "getTeleportManager()Lcom/ui/wifiman/model/teleport/TeleportManager;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "teleportConsoleService"

    const-string/jumbo v5, "getTeleportConsoleService()Lcom/ui/wifiman/model/teleport/TeleportConsoleService;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/F;

    const-string/jumbo v5, "teleportConnection"

    const-string/jumbo v6, "getTeleportConnection()Lcom/ui/wifiman/model/teleport/TeleportConnection;"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v3

    new-instance v5, Lkotlin/jvm/internal/F;

    const-string/jumbo v6, "cloudSessionService"

    const-string/jumbo v7, "getCloudSessionService()Lcom/ui/wifiman/model/ubiquiti/UbiquitiSsoAccountSessionService;"

    invoke-direct {v5, v1, v6, v7, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v5}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v5

    new-instance v6, Lkotlin/jvm/internal/F;

    const-string/jumbo v7, "cloudStatusService"

    const-string/jumbo v8, "getCloudStatusService()Lcom/ui/wifiman/model/ubiquiti/cloud/status/UbiquitiCloudStatus$Service;"

    invoke-direct {v6, v1, v7, v8, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v6}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v6

    new-instance v7, Lkotlin/jvm/internal/F;

    const-string/jumbo v8, "accountManager"

    const-string/jumbo v9, "getAccountManager()Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;"

    invoke-direct {v7, v1, v8, v9, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v7}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v7

    new-instance v8, Lkotlin/jvm/internal/F;

    const-string/jumbo v9, "networkConnection"

    const-string/jumbo v10, "getNetworkConnection()Lcom/ui/wifiman/model/network/connection/NetworkConnectionManager;"

    invoke-direct {v8, v1, v9, v10, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v8}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v8

    new-instance v9, Lkotlin/jvm/internal/F;

    const-string/jumbo v10, "editModeManager"

    const-string/jumbo v11, "getEditModeManager()Lcom/ubnt/usurvey/ui/teleport/TeleportConsolePickerVM$EditModeManager;"

    invoke-direct {v9, v1, v10, v11, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v9}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v9

    new-instance v10, Lkotlin/jvm/internal/F;

    const-string/jumbo v11, "viewRouter"

    const-string/jumbo v12, "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;"

    invoke-direct {v10, v1, v11, v12, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v10}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v10

    new-instance v11, Lkotlin/jvm/internal/F;

    const-string/jumbo v12, "itemsStream"

    const-string/jumbo v13, "getItemsStream()Lio/reactivex/rxjava3/core/Flowable;"

    invoke-direct {v11, v1, v12, v13, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v11}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/16 v11, 0xa

    new-array v11, v11, [Lth/l;

    aput-object v0, v11, v4

    const/4 v0, 0x1

    aput-object v2, v11, v0

    const/4 v0, 0x2

    aput-object v3, v11, v0

    const/4 v0, 0x3

    aput-object v5, v11, v0

    const/4 v0, 0x4

    aput-object v6, v11, v0

    const/4 v0, 0x5

    aput-object v7, v11, v0

    const/4 v0, 0x6

    aput-object v8, v11, v0

    const/4 v0, 0x7

    aput-object v9, v11, v0

    const/16 v0, 0x8

    aput-object v10, v11, v0

    const/16 v2, 0x9

    aput-object v1, v11, v2

    sput-object v11, LH8/d;->x:[Lth/l;

    new-instance v1, LH8/d$a;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, LH8/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, LH8/d;->w:LH8/d$a;

    sput v0, LH8/d;->y:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 7

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/ui/wifiman/ui/teleport/consoles/i;-><init>()V

    iput-object p1, p0, LH8/d;->g:Lorg/kodein/di/DI;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, LH8/d$l;

    invoke-direct {v0}, LH8/d$l;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, LFd/D;

    invoke-direct {p1, v0, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    sget-object v2, LH8/d;->x:[Lth/l;

    const/4 v3, 0x0

    aget-object v4, v2, v3

    invoke-interface {p1, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LH8/d;->h:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v4, LH8/d$m;

    invoke-direct {v4}, LH8/d$m;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, LFd/C;

    invoke-direct {p1, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v4, 0x1

    aget-object v5, v2, v4

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LH8/d;->i:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v5, LH8/d$n;

    invoke-direct {v5}, LH8/d$n;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Lcom/ui/wifiman/model/teleport/TeleportConnection;

    invoke-direct {p1, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v5, 0x2

    aget-object v5, v2, v5

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LH8/d;->j:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v5, LH8/d$o;

    invoke-direct {v5}, LH8/d$o;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, LLd/f;

    invoke-direct {p1, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v5, 0x3

    aget-object v5, v2, v5

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LH8/d;->k:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v5, LH8/d$p;

    invoke-direct {v5}, LH8/d$p;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, LOd/a$a;

    invoke-direct {p1, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v5, 0x4

    aget-object v5, v2, v5

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LH8/d;->l:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v5, LH8/d$q;

    invoke-direct {v5}, LH8/d$q;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;

    invoke-direct {p1, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v5, 0x5

    aget-object v5, v2, v5

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LH8/d;->m:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v5, LH8/d$r;

    invoke-direct {v5}, LH8/d$r;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, LZc/f;

    invoke-direct {p1, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v5, 0x6

    aget-object v5, v2, v5

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LH8/d;->n:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v5, LH8/d$s;

    invoke-direct {v5}, LH8/d$s;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, LH8/d$b;

    invoke-direct {p1, v5, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v5, 0x7

    aget-object v5, v2, v5

    invoke-interface {p1, p0, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LH8/d;->o:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v5, LH8/d$t;

    invoke-direct {v5}, LH8/d$t;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, Li8/a;

    invoke-direct {p1, v5, v1}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/16 v1, 0x8

    aget-object v1, v2, v1

    invoke-interface {p1, p0, v1}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LH8/d;->p:LYg/m;

    sget-object p1, LKi/a;->DROP_OLDEST:LKi/a;

    invoke-static {v3, v4, p1, v4, v0}, LLi/F;->b(IILKi/a;ILjava/lang/Object;)LLi/y;

    move-result-object p1

    iput-object p1, p0, LH8/d;->q:LLi/y;

    invoke-direct {p0}, LH8/d;->z0()LLd/f;

    move-result-object p1

    invoke-interface {p1}, LLd/f;->a()Lgg/i;

    move-result-object p1

    sget-object v0, LH8/d$u;->a:LH8/d$u;

    invoke-virtual {p1, v0}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "distinctUntilChanged(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LH8/d;->r:Lgg/i;

    invoke-direct {p0}, LH8/d;->F0()Lcom/ui/wifiman/model/teleport/TeleportConnection;

    move-result-object p1

    invoke-interface {p1}, Lcom/ui/wifiman/model/teleport/TeleportConnection;->getState()Lgg/i;

    move-result-object p1

    sget-object v1, LH8/d$i;->a:LH8/d$i;

    invoke-virtual {p1, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LH8/d;->s:Lgg/i;

    invoke-direct {p0}, LH8/d;->E0()LZc/f;

    move-result-object p1

    invoke-interface {p1}, LZc/f;->getState()Lgg/i;

    move-result-object p1

    sget-object v1, LH8/d$g;->a:LH8/d$g;

    invoke-virtual {p1, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LH8/d;->t:Lgg/i;

    sget-object v1, Lye/d;->a:Lye/d;

    new-instance v4, LH8/c;

    invoke-direct {v4, p0}, LH8/c;-><init>(LH8/d;)V

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v6}, Lye/d;->c(Lye/d;Lye/g;Landroidx/lifecycle/k$b;Lmh/a;ILjava/lang/Object;)Lye/d$a;

    move-result-object p1

    iput-object p1, p0, LH8/d;->u:Lye/d$a;

    invoke-direct {p0}, LH8/d;->D0()Lgg/i;

    move-result-object v1

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, LH8/d;->v:LLi/N;

    return-void
.end method

.method private final A0()LOd/a$a;
    .locals 1

    iget-object v0, p0, LH8/d;->l:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LOd/a$a;

    return-object v0
.end method

.method private final B0()LH8/d$b;
    .locals 1

    iget-object v0, p0, LH8/d;->o:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LH8/d$b;

    return-object v0
.end method

.method private final D0()Lgg/i;
    .locals 3

    iget-object v0, p0, LH8/d;->u:Lye/d$a;

    sget-object v1, LH8/d;->x:[Lth/l;

    const/16 v2, 0x9

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lye/d$a;->c(Ljava/lang/Object;Lth/l;)Lgg/i;

    move-result-object v0

    return-object v0
.end method

.method private final E0()LZc/f;
    .locals 1

    iget-object v0, p0, LH8/d;->n:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZc/f;

    return-object v0
.end method

.method private final F0()Lcom/ui/wifiman/model/teleport/TeleportConnection;
    .locals 1

    iget-object v0, p0, LH8/d;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/teleport/TeleportConnection;

    return-object v0
.end method

.method private final G0()LFd/C;
    .locals 1

    iget-object v0, p0, LH8/d;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFd/C;

    return-object v0
.end method

.method private final H0()LFd/D;
    .locals 1

    iget-object v0, p0, LH8/d;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFd/D;

    return-object v0
.end method

.method private final I0()Li8/a;
    .locals 1

    iget-object v0, p0, LH8/d;->p:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method

.method private static final J0(LH8/d;)Lgg/i;
    .locals 8

    invoke-direct {p0}, LH8/d;->G0()LFd/C;

    move-result-object v0

    invoke-interface {v0}, LFd/C;->getAll()Lgg/i;

    move-result-object v1

    iget-object v2, p0, LH8/d;->r:Lgg/i;

    iget-object v3, p0, LH8/d;->s:Lgg/i;

    iget-object v4, p0, LH8/d;->t:Lgg/i;

    invoke-direct {p0}, LH8/d;->A0()LOd/a$a;

    move-result-object v0

    invoke-interface {v0}, LOd/a$a;->a()Lgg/i;

    move-result-object v5

    invoke-direct {p0}, LH8/d;->B0()LH8/d$b;

    move-result-object v0

    invoke-interface {v0}, LH8/d$b;->a()Lgg/i;

    move-result-object v6

    new-instance v7, LH8/d$h;

    invoke-direct {v7, p0}, LH8/d$h;-><init>(LH8/d;)V

    invoke-static/range {v1 .. v7}, Lgg/i;->r(LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;Lkg/j;)Lgg/i;

    move-result-object p0

    const-string/jumbo v0, "combineLatest(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static synthetic r0(LH8/d;)Lgg/i;
    .locals 0

    invoke-static {p0}, LH8/d;->J0(LH8/d;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic s0(LH8/d;Lcom/ui/wifiman/model/teleport/h;LH8/d$c;ZLOd/a;Z)Lcom/ui/wifiman/ui/teleport/consoles/h$a;
    .locals 0

    invoke-direct/range {p0 .. p5}, LH8/d;->u0(Lcom/ui/wifiman/model/teleport/h;LH8/d$c;ZLOd/a;Z)Lcom/ui/wifiman/ui/teleport/consoles/h$a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic t0(LH8/d;)Li8/a;
    .locals 0

    invoke-direct {p0}, LH8/d;->I0()Li8/a;

    move-result-object p0

    return-object p0
.end method

.method private final u0(Lcom/ui/wifiman/model/teleport/h;LH8/d$c;ZLOd/a;Z)Lcom/ui/wifiman/ui/teleport/consoles/h$a;
    .locals 15

    move-object/from16 v0, p1

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/teleport/h;->s()LFd/B;

    move-result-object v1

    const/4 v2, 0x0

    move-object v3, p0

    if-eqz v1, :cond_0

    invoke-virtual {p0, v1}, LH8/d;->v0(LFd/B;)Lcom/ui/wifiman/ui/teleport/z;

    move-result-object v1

    move-object/from16 v4, p4

    move-object v9, v1

    move/from16 v1, p3

    goto :goto_0

    :cond_0
    move/from16 v1, p3

    move-object/from16 v4, p4

    move-object v9, v2

    :goto_0
    invoke-static {v0, v1, v4}, LId/b;->a(Lcom/ui/wifiman/model/teleport/h;ZLOd/a;)LId/a;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/teleport/h;->j()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p0 .. p1}, LH8/d;->x0(Lcom/ui/wifiman/model/teleport/h;)Ls9/a;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/teleport/h;->l()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1

    new-instance v7, Ls9/d$c;

    invoke-direct {v7, v4}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_1
    new-instance v4, Ls9/d$b;

    const v7, 0x7f11030c

    invoke-direct {v4, v7}, Ls9/d$b;-><init>(I)V

    move-object v7, v4

    :goto_1
    instance-of v4, v1, LId/a$b;

    if-eqz v4, :cond_2

    new-instance v8, Ls9/d$b;

    const v10, 0x7f1103c5

    invoke-direct {v8, v10}, Ls9/d$b;-><init>(I)V

    goto :goto_3

    :cond_2
    instance-of v8, v1, LId/a$a;

    if-eqz v8, :cond_3

    new-instance v8, Ls9/d$b;

    const v10, 0x7f1102ee

    invoke-direct {v8, v10}, Ls9/d$b;-><init>(I)V

    goto :goto_3

    :cond_3
    instance-of v8, v1, LId/a$c$b;

    if-nez v8, :cond_6

    instance-of v8, v1, LId/a$c$d;

    if-eqz v8, :cond_4

    goto :goto_2

    :cond_4
    instance-of v8, v1, LId/a$c;

    if-eqz v8, :cond_5

    move-object v8, v1

    check-cast v8, LId/a$c;

    invoke-static {v8}, LH8/o;->b(LId/a$c;)Ls9/d;

    move-result-object v8

    goto :goto_3

    :cond_5
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_6
    :goto_2
    new-instance v8, Ls9/d$b;

    const v10, 0x7f1102ed

    invoke-direct {v8, v10}, Ls9/d$b;-><init>(I)V

    :goto_3
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/teleport/h;->C()Z

    move-result v10

    if-eqz v10, :cond_a

    sget-object v10, LH8/d$e;->a:[I

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aget v10, v10, v11

    const/4 v11, 0x1

    if-eq v10, v11, :cond_9

    const/4 v11, 0x2

    if-eq v10, v11, :cond_8

    const/4 v11, 0x3

    if-ne v10, v11, :cond_7

    goto :goto_5

    :cond_7
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_8
    sget-object v1, Lcom/ui/wifiman/ui/teleport/consoles/h$a$a;->CONNECTED:Lcom/ui/wifiman/ui/teleport/consoles/h$a$a;

    :goto_4
    move-object v10, v1

    goto :goto_7

    :cond_9
    sget-object v1, Lcom/ui/wifiman/ui/teleport/consoles/h$a$a;->CONNECTED:Lcom/ui/wifiman/ui/teleport/consoles/h$a$a;

    goto :goto_4

    :cond_a
    :goto_5
    if-eqz v4, :cond_b

    goto :goto_6

    :cond_b
    instance-of v2, v1, LId/a$a;

    if-eqz v2, :cond_c

    sget-object v2, Lcom/ui/wifiman/ui/teleport/consoles/h$a$a;->CONNECTABLE:Lcom/ui/wifiman/ui/teleport/consoles/h$a$a;

    goto :goto_6

    :cond_c
    instance-of v1, v1, LId/a$c;

    if-eqz v1, :cond_d

    sget-object v2, Lcom/ui/wifiman/ui/teleport/consoles/h$a$a;->CONNECTION_NOT_POSSIBLE:Lcom/ui/wifiman/ui/teleport/consoles/h$a$a;

    :goto_6
    move-object v10, v2

    :goto_7
    instance-of v14, v0, Lcom/ui/wifiman/model/teleport/h$c;

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/teleport/h;->y()Lcom/ui/wifiman/model/teleport/n$b;

    move-result-object v0

    instance-of v0, v0, Lcom/ui/wifiman/model/teleport/n$b$a$c;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    new-instance v0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;

    move-object v4, v0

    move v11, v14

    move/from16 v13, p5

    invoke-direct/range {v4 .. v14}, Lcom/ui/wifiman/ui/teleport/consoles/h$a;-><init>(Ljava/lang/String;Ls9/a;Ls9/d;Ls9/d;Lcom/ui/wifiman/ui/teleport/z;Lcom/ui/wifiman/ui/teleport/consoles/h$a$a;ZLjava/lang/Boolean;ZZ)V

    return-object v0

    :cond_d
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method private final w0()Lgg/b;
    .locals 2

    new-instance v0, LH8/d$f;

    invoke-direct {v0, p0}, LH8/d$f;-><init>(LH8/d;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final y0()Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;
    .locals 1

    iget-object v0, p0, LH8/d;->m:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;

    return-object v0
.end method

.method private final z0()LLd/f;
    .locals 1

    iget-object v0, p0, LH8/d;->k:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LLd/f;

    return-object v0
.end method


# virtual methods
.method public C0()LLi/y;
    .locals 1

    iget-object v0, p0, LH8/d;->q:LLi/y;

    return-object v0
.end method

.method public bridge synthetic b()LLi/g;
    .locals 1

    invoke-virtual {p0}, LH8/d;->C0()LLi/y;

    move-result-object v0

    return-object v0
.end method

.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, LH8/d;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public n0()LLi/N;
    .locals 1

    iget-object v0, p0, LH8/d;->v:LLi/N;

    return-object v0
.end method

.method public o0(Lcom/ui/wifiman/ui/teleport/consoles/h$a;)V
    .locals 4

    const-string/jumbo v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LH8/d;->I0()Li8/a;

    move-result-object v1

    new-instance v2, Li8/a$b$E$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v3, 0x0

    invoke-direct {v2, p1, v3}, Li8/a$b$E$a;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 p1, 0x1

    new-array p1, p1, [Li8/a$b;

    const/4 v3, 0x0

    aput-object v2, p1, v3

    invoke-interface {v1, p1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    invoke-virtual {v0, p1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public p0(Lcom/ui/wifiman/ui/teleport/consoles/h;)V
    .locals 5

    const/4 v0, 0x1

    const-string/jumbo v1, "item"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, p1, Lcom/ui/wifiman/ui/teleport/consoles/h$a;

    if-eqz v1, :cond_5

    sget-object v1, Lye/d;->a:Lye/d;

    check-cast p1, Lcom/ui/wifiman/ui/teleport/consoles/h$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->b()Lcom/ui/wifiman/ui/teleport/consoles/h$a$a;

    move-result-object v2

    const/4 v3, -0x1

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    sget-object v4, LH8/d$e;->b:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v4, v2

    :goto_0
    if-eq v2, v3, :cond_4

    if-eq v2, v0, :cond_3

    const/4 v0, 0x2

    if-eq v2, v0, :cond_2

    const/4 p1, 0x3

    if-ne v2, p1, :cond_1

    invoke-direct {p0}, LH8/d;->w0()Lgg/b;

    move-result-object p1

    goto :goto_1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    invoke-direct {p0}, LH8/d;->H0()LFd/D;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, LFd/D;->b(Ljava/lang/String;)Lgg/b;

    move-result-object p1

    invoke-direct {p0}, LH8/d;->F0()Lcom/ui/wifiman/model/teleport/TeleportConnection;

    move-result-object v0

    invoke-interface {v0}, Lcom/ui/wifiman/model/teleport/TeleportConnection;->connect()Lgg/b;

    move-result-object v0

    const-wide/16 v2, 0x32

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v2, v3, v4}, Lgg/b;->a0(JLjava/util/concurrent/TimeUnit;)Lgg/b;

    move-result-object v2

    invoke-virtual {v0, v2}, Lgg/b;->X(Lgg/f;)Lgg/b;

    move-result-object v0

    new-instance v2, LH8/d$j;

    invoke-direct {v2, p0}, LH8/d$j;-><init>(LH8/d;)V

    invoke-virtual {v0, v2}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/b;->g(Lgg/f;)Lgg/b;

    move-result-object p1

    invoke-direct {p0}, LH8/d;->w0()Lgg/b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/b;->g(Lgg/f;)Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "andThen(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    invoke-direct {p0}, LH8/d;->I0()Li8/a;

    move-result-object v2

    new-instance v3, Li8/a$b$E$b;

    invoke-virtual {p1}, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v4, 0x0

    invoke-direct {v3, p1, v4}, Li8/a$b$E$b;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-array p1, v0, [Li8/a$b;

    const/4 v0, 0x0

    aput-object v3, p1, v0

    invoke-interface {v2, p1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    goto :goto_1

    :cond_4
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "complete(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    invoke-virtual {v1, p1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    goto :goto_2

    :cond_5
    instance-of v0, p1, Lcom/ui/wifiman/ui/teleport/consoles/h$b;

    if-nez v0, :cond_7

    instance-of v0, p1, Lcom/ui/wifiman/ui/teleport/consoles/h$c;

    if-nez v0, :cond_7

    instance-of p1, p1, Lcom/ui/wifiman/ui/teleport/consoles/h$d;

    if-eqz p1, :cond_6

    goto :goto_2

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    :goto_2
    return-void
.end method

.method public q0()V
    .locals 3

    sget-object v0, Lye/d;->a:Lye/d;

    invoke-direct {p0}, LH8/d;->y0()Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;

    move-result-object v1

    invoke-interface {v1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;->e()Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    new-instance v2, LH8/d$k;

    invoke-direct {v2, p0}, LH8/d$k;-><init>(LH8/d;)V

    invoke-virtual {v1, v2}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "flatMapCompletable(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method

.method public v0(LFd/B;)Lcom/ui/wifiman/ui/teleport/z;
    .locals 0

    invoke-static {p0, p1}, LK8/d$a;->a(LK8/d;LFd/B;)Lcom/ui/wifiman/ui/teleport/z;

    move-result-object p1

    return-object p1
.end method

.method public x0(Lcom/ui/wifiman/model/teleport/h;)Ls9/a;
    .locals 0

    invoke-static {p0, p1}, LK8/d$a;->b(LK8/d;Lcom/ui/wifiman/model/teleport/h;)Ls9/a;

    move-result-object p1

    return-object p1
.end method
