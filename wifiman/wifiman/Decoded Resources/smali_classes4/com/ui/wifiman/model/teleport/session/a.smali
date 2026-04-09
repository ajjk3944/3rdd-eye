.class public final Lcom/ui/wifiman/model/teleport/session/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/teleport/session/TeleportSession;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/teleport/session/a$a;,
        Lcom/ui/wifiman/model/teleport/session/a$b;
    }
.end annotation


# static fields
.field public static final k:Lcom/ui/wifiman/model/teleport/session/a$a;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Llc/e;

.field private final c:Lmc/a;

.field private final d:Lcom/ui/wifiman/model/teleport/session/a$b;

.field private final e:Lgg/z;

.field private final f:Lgg/z;

.field private final g:Lgg/i;

.field private final h:Lgg/i;

.field private final i:Lgg/i;

.field private final j:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/teleport/session/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/teleport/session/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/model/teleport/session/a;->k:Lcom/ui/wifiman/model/teleport/session/a$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Llc/e;Lmc/a;Lac/c;)V
    .locals 1

    const-string v0, "applicationContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityResultService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "androidDeviceInfo"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "teleportSessionDao"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/session/a;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/ui/wifiman/model/teleport/session/a;->b:Llc/e;

    iput-object p3, p0, Lcom/ui/wifiman/model/teleport/session/a;->c:Lmc/a;

    new-instance p1, Lcom/ui/wifiman/model/teleport/session/a$b;

    invoke-direct {p1, p4}, Lcom/ui/wifiman/model/teleport/session/a$b;-><init>(Lac/c;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/session/a;->d:Lcom/ui/wifiman/model/teleport/session/a$b;

    invoke-interface {p3}, Lmc/a;->getId()Lgg/z;

    move-result-object p2

    iput-object p2, p0, Lcom/ui/wifiman/model/teleport/session/a;->e:Lgg/z;

    new-instance p2, Lcom/ui/wifiman/model/teleport/session/a$j;

    invoke-direct {p2, p0}, Lcom/ui/wifiman/model/teleport/session/a$j;-><init>(Lcom/ui/wifiman/model/teleport/session/a;)V

    invoke-static {p2}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p2

    const-string p3, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/ui/wifiman/model/teleport/session/a;->f:Lgg/z;

    new-instance p2, Lcom/ui/wifiman/model/teleport/session/a$k;

    invoke-direct {p2, p0}, Lcom/ui/wifiman/model/teleport/session/a$k;-><init>(Lcom/ui/wifiman/model/teleport/session/a;)V

    invoke-static {p2}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p2

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p3, Lcom/ui/wifiman/model/teleport/session/a$l;->a:Lcom/ui/wifiman/model/teleport/session/a$l;

    invoke-virtual {p2, p3}, Lgg/z;->K(Lkg/n;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p3

    invoke-virtual {p2, p3}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object p2

    const-string p3, "subscribeOn(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/ui/wifiman/model/teleport/session/a;->g:Lgg/i;

    sget-object p3, Lcom/ui/wifiman/model/teleport/session/a$e;->a:Lcom/ui/wifiman/model/teleport/session/a$e;

    invoke-virtual {p2, p3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    sget-object p3, Lcom/ui/wifiman/model/teleport/session/a$f;->a:Lcom/ui/wifiman/model/teleport/session/a$f;

    invoke-virtual {p2, p3}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p2

    const/4 p3, 0x1

    invoke-virtual {p2, p3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p2

    invoke-virtual {p2}, Ljg/a;->i2()Lgg/i;

    move-result-object p2

    const-string p4, "refCount(...)"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/ui/wifiman/model/teleport/session/a;->h:Lgg/i;

    invoke-virtual {p1}, Lcom/ui/wifiman/db/RoomPersistentInstance;->b()Lgg/i;

    move-result-object p2

    sget-object v0, Lcom/ui/wifiman/model/teleport/session/a$c;->a:Lcom/ui/wifiman/model/teleport/session/a$c;

    invoke-virtual {p2, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    invoke-virtual {p2, p3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p2

    invoke-virtual {p2}, Ljg/a;->i2()Lgg/i;

    move-result-object p2

    invoke-static {p2, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/ui/wifiman/model/teleport/session/a;->i:Lgg/i;

    invoke-virtual {p1}, Lcom/ui/wifiman/db/RoomPersistentInstance;->b()Lgg/i;

    move-result-object p1

    sget-object p2, Lcom/ui/wifiman/model/teleport/session/a$d;->a:Lcom/ui/wifiman/model/teleport/session/a$d;

    invoke-virtual {p1, p2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/session/a;->j:Lgg/i;

    return-void
.end method

.method public static synthetic h(Ljava/lang/String;Lac/a;)Lac/a;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/model/teleport/session/a;->m(Ljava/lang/String;Lac/a;)Lac/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ljava/lang/String;Lac/a;)Lac/a;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/model/teleport/session/a;->l(Ljava/lang/String;Lac/a;)Lac/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic j(Lcom/ui/wifiman/model/teleport/session/a;)Lmc/a;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/teleport/session/a;->c:Lmc/a;

    return-object p0
.end method

.method public static final synthetic k(Lcom/ui/wifiman/model/teleport/session/a;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/teleport/session/a;->a:Landroid/content/Context;

    return-object p0
.end method

.method private static final l(Ljava/lang/String;Lac/a;)Lac/a;
    .locals 7

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p0, :cond_0

    const/4 p0, 0x0

    :cond_0
    move-object v3, p0

    const/16 v5, 0xb

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Lac/a;->b(Lac/a;IZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lac/a;

    move-result-object p0

    return-object p0
.end method

.method private static final m(Ljava/lang/String;Lac/a;)Lac/a;
    .locals 7

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p0, :cond_0

    const/4 p0, 0x0

    :cond_0
    move-object v4, p0

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Lac/a;->b(Lac/a;IZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lac/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/session/a;->j:Lgg/i;

    return-object v0
.end method

.method public b()Lgg/b;
    .locals 8

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/session/a;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/net/VpnService;->prepare(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    if-eqz v0, :cond_0

    sget-object v2, LAg/e;->a:LAg/e;

    new-instance v3, Lcom/ui/wifiman/model/teleport/session/a$i;

    invoke-direct {v3}, Lcom/ui/wifiman/model/teleport/session/a$i;-><init>()V

    invoke-static {v3}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Lcom/ui/wifiman/model/teleport/session/a;->b:Llc/e;

    new-instance v5, Llc/a;

    sget-object v6, LO7/a;->VPN_PROFILE_CREATION:LO7/a;

    invoke-static {v6}, Llc/f;->a(LO7/a;)I

    move-result v6

    const/4 v7, 0x0

    invoke-direct {v5, v6, v0, v7}, Llc/a;-><init>(ILandroid/content/Intent;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v4, v5}, Llc/e;->a(Llc/a;)Lgg/z;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, LAg/e;->a(Lgg/D;Lgg/D;)Lgg/z;

    move-result-object v0

    sget-object v2, Lcom/ui/wifiman/model/teleport/session/a$h;->a:Lcom/ui/wifiman/model/teleport/session/a$h;

    invoke-virtual {v0, v2}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, Lcom/ui/wifiman/model/teleport/session/a$g;

    invoke-direct {v0}, Lcom/ui/wifiman/model/teleport/session/a$g;-><init>()V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    return-object v0
.end method

.method public c()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/session/a;->i:Lgg/i;

    return-object v0
.end method

.method public d()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/session/a;->h:Lgg/i;

    return-object v0
.end method

.method public e(Ljava/lang/String;)Lgg/b;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/session/a;->d:Lcom/ui/wifiman/model/teleport/session/a$b;

    new-instance v1, LHd/b;

    invoke-direct {v1, p1}, LHd/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ui/wifiman/db/RoomPersistentInstance;->a(Lmh/l;)Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/b;->L(Lgg/y;)Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    const-string v0, "subscribeOn(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public f()Lgg/z;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/session/a;->f:Lgg/z;

    return-object v0
.end method

.method public g(Ljava/lang/String;)Lgg/b;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/session/a;->d:Lcom/ui/wifiman/model/teleport/session/a$b;

    new-instance v1, LHd/a;

    invoke-direct {v1, p1}, LHd/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ui/wifiman/db/RoomPersistentInstance;->a(Lmh/l;)Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/b;->L(Lgg/y;)Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    const-string v0, "subscribeOn(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public getClientId()Lgg/z;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/session/a;->e:Lgg/z;

    return-object v0
.end method
