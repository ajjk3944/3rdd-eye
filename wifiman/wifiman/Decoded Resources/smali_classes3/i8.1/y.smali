.class public final Li8/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li8/s$d;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationService;

.field private final c:LFg/a;

.field private final d:LFg/a;

.field private final e:Lgg/i;

.field private final f:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationService;)V
    .locals 3

    const-string/jumbo v0, "applicationContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "teleportInvitationService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li8/y;->a:Landroid/content/Context;

    iput-object p2, p0, Li8/y;->b:Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationService;

    new-instance p1, Ll9/a;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {p1}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p1

    const-string/jumbo v0, "createDefault(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Li8/y;->c:LFg/a;

    new-instance v1, Ll9/a;

    invoke-direct {v1, p2}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {v1}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Li8/y;->d:LFg/a;

    invoke-virtual {p2}, Lgg/i;->e1()Lgg/i;

    move-result-object p2

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {p2, v0, v1, v2}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p2

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0, v1, v2}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    new-instance v0, Li8/y$a;

    invoke-direct {v0, p0}, Li8/y$a;-><init>(Li8/y;)V

    invoke-virtual {p1, v0}, Lgg/i;->t0(Lkg/n;)Lgg/b;

    move-result-object p1

    invoke-virtual {p2, p1}, Lgg/i;->U0(Lgg/f;)Lgg/i;

    move-result-object p1

    const-string/jumbo p2, "mergeWith(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Li8/y;->e:Lgg/i;

    sget-object p2, Li8/y$e;->a:Li8/y$e;

    invoke-virtual {p1, p2}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->h1()Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Li8/y;->f:Lgg/i;

    return-void
.end method

.method public static synthetic d(Li8/y;Lgg/o;LV4/b;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, Li8/y;->p(Li8/y;Lgg/o;LV4/b;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Li8/y;->q(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic f(Lgg/o;Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0, p1}, Li8/y;->r(Lgg/o;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic g(Landroid/content/Intent;Li8/y;Lgg/o;)V
    .locals 0

    invoke-static {p0, p1, p2}, Li8/y;->o(Landroid/content/Intent;Li8/y;Lgg/o;)V

    return-void
.end method

.method public static final synthetic h(Li8/y;Landroid/net/Uri;)Lgg/n;
    .locals 0

    invoke-direct {p0, p1}, Li8/y;->m(Landroid/net/Uri;)Lgg/n;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i(Li8/y;)LFg/a;
    .locals 0

    iget-object p0, p0, Li8/y;->d:LFg/a;

    return-object p0
.end method

.method public static final synthetic j(Li8/y;)LFg/a;
    .locals 0

    iget-object p0, p0, Li8/y;->c:LFg/a;

    return-object p0
.end method

.method public static final synthetic k(Li8/y;Landroid/content/Intent;)Lgg/n;
    .locals 0

    invoke-direct {p0, p1}, Li8/y;->t(Landroid/content/Intent;)Lgg/n;

    move-result-object p0

    return-object p0
.end method

.method private final l()J
    .locals 3

    iget-object v0, p0, Li8/y;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iget-object v1, p0, Li8/y;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    invoke-static {v0}, Lu1/a;->a(Landroid/content/pm/PackageInfo;)J

    move-result-wide v0

    return-wide v0
.end method

.method private final m(Landroid/net/Uri;)Lgg/n;
    .locals 2

    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "teleport.ui.link"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Li8/y;->b:Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationService;

    invoke-interface {v0, p1}, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationService;->b(Landroid/net/Uri;)Lgg/z;

    move-result-object p1

    invoke-virtual {p1}, Lgg/z;->X()Lgg/n;

    move-result-object p1

    sget-object v0, Li8/y$c;->a:Li8/y$c;

    invoke-virtual {p1, v0}, Lgg/n;->s(Lkg/n;)Lgg/n;

    move-result-object p1

    sget-object v0, Li8/y$d;->a:Li8/y$d;

    invoke-virtual {p1, v0}, Lgg/n;->p(Lkg/n;)Lgg/n;

    move-result-object p1

    const-string/jumbo v0, "map(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "wifiman"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "deeplink_v1"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Li8/y$b;

    invoke-direct {v0, p1}, Li8/y$b;-><init>(Landroid/net/Uri;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-static {}, Lgg/n;->h()Lgg/n;

    move-result-object p1

    const-string/jumbo v0, "empty(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.method private final n(Landroid/content/Intent;)Lgg/n;
    .locals 1

    new-instance v0, Li8/w;

    invoke-direct {v0, p1, p0}, Li8/w;-><init>(Landroid/content/Intent;Li8/y;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    new-instance v0, Li8/y$g;

    invoke-direct {v0, p0}, Li8/y$g;-><init>(Li8/y;)V

    invoke-virtual {p1, v0}, Lgg/n;->j(Lkg/n;)Lgg/n;

    move-result-object p1

    const-string/jumbo v0, "flatMap(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final o(Landroid/content/Intent;Li8/y;Lgg/o;)V
    .locals 3

    const-string/jumbo v0, "emitter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ll5/a;->a:Ll5/a;

    invoke-static {v0}, LX4/a;->a(Ll5/a;)LV4/a;

    move-result-object v0

    invoke-virtual {v0, p0}, LV4/a;->a(Landroid/content/Intent;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    iget-object v0, p1, Li8/y;->a:Landroid/content/Context;

    invoke-static {v0}, Lt1/a;->h(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Li8/t;

    invoke-direct {v1, p1, p2}, Li8/t;-><init>(Li8/y;Lgg/o;)V

    new-instance v2, Li8/u;

    invoke-direct {v2, v1}, Li8/u;-><init>(Lmh/l;)V

    invoke-virtual {p0, v0, v2}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    iget-object p1, p1, Li8/y;->a:Landroid/content/Context;

    invoke-static {p1}, Lt1/a;->h(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object p1

    new-instance v0, Li8/v;

    invoke-direct {v0, p2}, Li8/v;-><init>(Lgg/o;)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method private static final p(Li8/y;Lgg/o;LV4/b;)LYg/J;
    .locals 7

    if-eqz p2, :cond_3

    invoke-virtual {p2}, LV4/b;->b()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, LV4/b;->b()I

    move-result v0

    int-to-long v3, v0

    invoke-direct {p0}, Li8/y;->l()J

    move-result-wide v5

    cmp-long v0, v3, v5

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, LV4/b;->b()I

    move-result p2

    invoke-direct {p0}, Li8/y;->l()J

    move-result-wide v3

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v0, "Firebase deep link minimal app version requirements not met. min version: "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ", current:"

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v2, v1, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-interface {p1}, Lgg/o;->a()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {p2}, LV4/b;->a()Landroid/net/Uri;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-interface {p1, p0}, Lgg/o;->onSuccess(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p2}, LV4/b;->a()Landroid/net/Uri;

    move-result-object p0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v0, "Firebase link can\'t be processed as internal deep link. Link: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v2, v1, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-interface {p1}, Lgg/o;->a()V

    goto :goto_1

    :cond_3
    invoke-interface {p1}, Lgg/o;->a()V

    :goto_1
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final q(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final r(Lgg/o;Ljava/lang/Exception;)V
    .locals 3

    const-string/jumbo v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x4

    const-string/jumbo v2, "Firebase universal link fetch failed"

    invoke-static {v2, p1, v0, v1, v0}, LZ7/b;->j(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-interface {p0}, Lgg/o;->a()V

    return-void
.end method

.method private final s(Landroid/content/Intent;)Lgg/n;
    .locals 1

    new-instance v0, Li8/y$h;

    invoke-direct {v0, p1}, Li8/y$h;-><init>(Landroid/content/Intent;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Li8/y$i;

    invoke-direct {v0, p0}, Li8/y$i;-><init>(Li8/y;)V

    invoke-virtual {p1, v0}, Lgg/n;->j(Lkg/n;)Lgg/n;

    move-result-object p1

    const-string/jumbo v0, "flatMap(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final t(Landroid/content/Intent;)Lgg/n;
    .locals 1

    invoke-direct {p0, p1}, Li8/y;->n(Landroid/content/Intent;)Lgg/n;

    move-result-object v0

    invoke-direct {p0, p1}, Li8/y;->s(Landroid/content/Intent;)Lgg/n;

    move-result-object p1

    invoke-virtual {v0, p1}, Lgg/n;->w(Lgg/r;)Lgg/n;

    move-result-object p1

    const-string/jumbo v0, "switchIfEmpty(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public a()Lgg/n;
    .locals 2

    new-instance v0, Li8/y$f;

    invoke-direct {v0, p0}, Li8/y$f;-><init>(Li8/y;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object v0

    const-string/jumbo v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, Li8/y;->f:Lgg/i;

    return-object v0
.end method

.method public c(Landroid/content/Intent;)V
    .locals 2

    const-string/jumbo v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Li8/y;->c:LFg/a;

    new-instance v1, Ll9/a;

    invoke-direct {v1, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method
