.class public final LId/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ubnt/teleport/TeleportTunnelManager$Storage;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LId/d$a;
    }
.end annotation


# static fields
.field public static final g:LId/d$a;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/ui/wifiman/model/teleport/session/TeleportSession;

.field private final c:Lgg/b;

.field private final d:Lgg/i;

.field private final e:Lgg/i;

.field private final f:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LId/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LId/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LId/d;->g:LId/d$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager;Lcom/ui/wifiman/model/teleport/session/TeleportSession;)V
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "passphraseManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "teleportSession"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LId/d;->a:Landroid/content/Context;

    iput-object p3, p0, LId/d;->b:Lcom/ui/wifiman/model/teleport/session/TeleportSession;

    invoke-interface {p2}, Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager;->clear()Lgg/b;

    move-result-object p1

    new-instance v0, LId/d$f;

    invoke-direct {v0, p0}, LId/d$f;-><init>(LId/d;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v0

    const-string v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x2

    new-array v2, v2, [Lgg/f;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 p1, 0x1

    aput-object v0, v2, p1

    invoke-static {v2}, Lgg/b;->p([Lgg/f;)Lgg/b;

    move-result-object v0

    const-string v2, "concatArray(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LId/d;->c:Lgg/b;

    new-instance v0, LId/d$g;

    invoke-direct {v0}, LId/d$g;-><init>()V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LId/d$b;

    invoke-direct {v1, p2, p0}, LId/d$b;-><init>(Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager;LId/d;)V

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p2

    new-instance v0, LId/d$c;

    invoke-direct {v0, p0}, LId/d$c;-><init>(LId/d;)V

    invoke-virtual {p2, v0}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2, p1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p2

    invoke-virtual {p2}, Ljg/a;->i2()Lgg/i;

    move-result-object p2

    const-string v0, "refCount(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LId/d;->d:Lgg/i;

    invoke-interface {p3}, Lcom/ui/wifiman/model/teleport/session/TeleportSession;->a()Lgg/i;

    move-result-object p3

    sget-object v1, LId/d$e;->a:LId/d$e;

    invoke-virtual {p3, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p3

    invoke-virtual {p3, p1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p3

    invoke-virtual {p3}, Ljg/a;->i2()Lgg/i;

    move-result-object p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, LId/d;->e:Lgg/i;

    sget-object p3, LId/d$i;->a:LId/d$i;

    invoke-virtual {p2, p3}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p2

    sget-object p3, LId/d$j;->a:LId/d$j;

    invoke-virtual {p2, p3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p3

    invoke-virtual {p2, p3}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p2

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p3

    invoke-virtual {p2, p3}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2, p1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LId/d;->f:Lgg/i;

    return-void
.end method

.method public static final synthetic f(LId/d;)Lgg/b;
    .locals 0

    iget-object p0, p0, LId/d;->c:Lgg/b;

    return-object p0
.end method

.method public static final synthetic g(LId/d;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, LId/d;->a:Landroid/content/Context;

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lgg/b;
    .locals 1

    iget-object v0, p0, LId/d;->b:Lcom/ui/wifiman/model/teleport/session/TeleportSession;

    invoke-interface {v0, p1}, Lcom/ui/wifiman/model/teleport/session/TeleportSession;->e(Ljava/lang/String;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, LId/d;->e:Lgg/i;

    return-object v0
.end method

.method public c(Ljava/lang/String;)Lgg/b;
    .locals 2

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LId/d;->d:Lgg/i;

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, LId/d$d;

    invoke-direct {v1, p1}, LId/d$d;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

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

.method public d()Lgg/i;
    .locals 1

    iget-object v0, p0, LId/d;->f:Lgg/i;

    return-object v0
.end method

.method public bridge synthetic e(Lcom/ubnt/teleport/TeleportTunnel$a;)Lgg/b;
    .locals 0

    check-cast p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;

    invoke-virtual {p0, p1}, LId/d;->h(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public h(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;)Lgg/b;
    .locals 2

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LId/d;->d:Lgg/i;

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, LId/d$h;

    invoke-direct {v1, p1}, LId/d$h;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

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
