.class public final LBc/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LBc/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LBc/f$a;,
        LBc/f$b;,
        LBc/f$c;,
        LBc/f$d;,
        LBc/f$e;,
        LBc/f$f;
    }
.end annotation


# static fields
.field public static final q:LBc/f$a;


# instance fields
.field private final a:Landroid/telephony/SubscriptionManager;

.field private final b:Landroid/telephony/TelephonyManager;

.field private final c:Lgg/i;

.field private final d:Lgg/i;

.field private final e:Lgg/i;

.field private final f:Lgg/i;

.field private final g:Lgg/i;

.field private final h:Lgg/i;

.field private final i:Lgg/i;

.field private final j:Lgg/i;

.field private final k:Lgg/i;

.field private final l:Lgg/i;

.field private final m:Lgg/i;

.field private final n:Lgg/i;

.field private final o:Lgg/i;

.field private final p:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LBc/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LBc/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LBc/f;->q:LBc/f$a;

    return-void
.end method

.method public constructor <init>(Landroid/telephony/SubscriptionManager;Landroid/telephony/TelephonyManager;Lcom/ui/wifiman/model/android/permissions/d;Lpc/a;)V
    .locals 4

    const-string v0, "subscriptionManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "telephonyManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "permissionsService"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locationService"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBc/f;->a:Landroid/telephony/SubscriptionManager;

    iput-object p2, p0, LBc/f;->b:Landroid/telephony/TelephonyManager;

    invoke-interface {p3}, Lcom/ui/wifiman/model/android/permissions/d;->b()Lgg/i;

    move-result-object p1

    sget-object p2, LBc/f$l;->a:LBc/f$l;

    invoke-virtual {p1, p2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const-string p2, "distinctUntilChanged(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LBc/f;->c:Lgg/i;

    invoke-interface {p3}, Lcom/ui/wifiman/model/android/permissions/d;->b()Lgg/i;

    move-result-object p3

    sget-object v0, LBc/f$m;->a:LBc/f$m;

    invoke-virtual {p3, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p3

    invoke-virtual {p3}, Lgg/i;->W()Lgg/i;

    move-result-object p3

    invoke-static {p3, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, LBc/f;->d:Lgg/i;

    invoke-interface {p4}, Lpc/a;->a()Lgg/i;

    move-result-object p2

    sget-object p4, LBc/f$o;->a:LBc/f$o;

    invoke-static {p1, p3, p2, p4}, Lgg/i;->u(LDj/a;LDj/a;LDj/a;Lkg/g;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p3, "refCount(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LBc/f;->e:Lgg/i;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LBc/f;->r(I)Lgg/i;

    move-result-object p4

    iput-object p4, p0, LBc/f;->f:Lgg/i;

    invoke-direct {p0, p2}, LBc/f;->r(I)Lgg/i;

    move-result-object v0

    iput-object v0, p0, LBc/f;->g:Lgg/i;

    invoke-direct {p0, p1}, LBc/f;->s(I)Lgg/i;

    move-result-object v1

    iput-object v1, p0, LBc/f;->h:Lgg/i;

    invoke-direct {p0, p2}, LBc/f;->s(I)Lgg/i;

    move-result-object v2

    iput-object v2, p0, LBc/f;->i:Lgg/i;

    invoke-direct {p0, p4}, LBc/f;->A(Lgg/i;)Lgg/i;

    move-result-object v3

    invoke-virtual {v3, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v3

    invoke-virtual {v3}, Ljg/a;->i2()Lgg/i;

    move-result-object v3

    invoke-static {v3, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v3, p0, LBc/f;->j:Lgg/i;

    invoke-direct {p0, p4}, LBc/f;->y(Lgg/i;)Lgg/i;

    move-result-object p4

    invoke-virtual {p4, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p4

    invoke-virtual {p4}, Ljg/a;->i2()Lgg/i;

    move-result-object p4

    invoke-static {p4, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p4, p0, LBc/f;->k:Lgg/i;

    invoke-direct {p0, v0}, LBc/f;->A(Lgg/i;)Lgg/i;

    move-result-object v3

    invoke-virtual {v3, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v3

    invoke-virtual {v3}, Ljg/a;->i2()Lgg/i;

    move-result-object v3

    invoke-static {v3, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v3, p0, LBc/f;->l:Lgg/i;

    invoke-direct {p0, v0}, LBc/f;->y(Lgg/i;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v0

    invoke-static {v0, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LBc/f;->m:Lgg/i;

    invoke-virtual {p0}, LBc/f;->b()Lgg/i;

    move-result-object v3

    invoke-direct {p0, v1, v3, p4, p1}, LBc/f;->t(Lgg/i;Lgg/i;Lgg/i;I)Lgg/i;

    move-result-object p1

    sget-object p4, LBc/f$q;->a:LBc/f$q;

    invoke-virtual {p1, p4}, Lgg/i;->g0(Lkg/f;)Lgg/i;

    move-result-object p1

    sget-object p4, LBc/f$r;->a:LBc/f$r;

    invoke-virtual {p1, p4}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    sget-object p4, LBc/f$s;->a:LBc/f$s;

    invoke-virtual {p1, p4}, Lgg/i;->d0(Lkg/f;)Lgg/i;

    move-result-object p1

    new-instance p4, LBc/b;

    invoke-direct {p4}, LBc/b;-><init>()V

    invoke-virtual {p1, p4}, Lgg/i;->Z(Lkg/a;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LBc/f;->n:Lgg/i;

    invoke-virtual {p0}, LBc/f;->c()Lgg/i;

    move-result-object p1

    invoke-direct {p0, v2, p1, v0, p2}, LBc/f;->t(Lgg/i;Lgg/i;Lgg/i;I)Lgg/i;

    move-result-object p1

    sget-object p4, LBc/f$t;->a:LBc/f$t;

    invoke-virtual {p1, p4}, Lgg/i;->g0(Lkg/f;)Lgg/i;

    move-result-object p1

    sget-object p4, LBc/f$u;->a:LBc/f$u;

    invoke-virtual {p1, p4}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    sget-object p4, LBc/f$v;->a:LBc/f$v;

    invoke-virtual {p1, p4}, Lgg/i;->d0(Lkg/f;)Lgg/i;

    move-result-object p1

    new-instance p4, LBc/c;

    invoke-direct {p4}, LBc/c;-><init>()V

    invoke-virtual {p1, p4}, Lgg/i;->Z(Lkg/a;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LBc/f;->o:Lgg/i;

    invoke-virtual {p0}, LBc/f;->e()Lgg/i;

    move-result-object p1

    invoke-virtual {p0}, LBc/f;->d()Lgg/i;

    move-result-object p4

    sget-object v0, LBc/f$w;->a:LBc/f$w;

    invoke-static {p1, p4, v0}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LBc/f;->p:Lgg/i;

    return-void
.end method

.method private final A(Lgg/i;)Lgg/i;
    .locals 5

    sget-object v0, LAg/c;->a:LAg/c;

    const-class v1, LBc/f$b$b;

    invoke-virtual {p1, v1}, Lgg/i;->Z0(Ljava/lang/Class;)Lgg/i;

    move-result-object v1

    const-string v2, "ofType(R::class.java)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, LBc/f$b$c;

    invoke-virtual {p1, v3}, Lgg/i;->Z0(Ljava/lang/Class;)Lgg/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, LBc/f$b$a;

    invoke-virtual {p1, v4}, Lgg/i;->Z0(Ljava/lang/Class;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v3, p1}, LAg/c;->b(Lgg/i;Lgg/i;Lgg/i;)Lgg/i;

    move-result-object p1

    new-instance v0, LBc/a$a;

    const/4 v1, 0x0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v1, v1, v1, v2}, LBc/a$a;-><init>(Ljava/lang/String;LV7/a;LV7/b;Ljava/util/List;)V

    sget-object v1, LBc/f$p;->a:LBc/f$p;

    invoke-virtual {p1, v0, v1}, Lgg/i;->q1(Ljava/lang/Object;Lkg/b;)Lgg/i;

    move-result-object p1

    const-string v0, "scan(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final B()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "Cell State Primary finished"

    invoke-static {v2, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method private static final C()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "Cell State Secondary finished"

    invoke-static {v2, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method private final D(I)Lgg/i;
    .locals 3

    iget-object v0, p0, LBc/f;->e:Lgg/i;

    new-instance v1, LBc/f$x;

    invoke-direct {v1, p0, p1}, LBc/f$x;-><init>(LBc/f;I)V

    invoke-virtual {v0, v1}, Lgg/i;->N1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v1, v2}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    const-string v0, "observeOn(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public static synthetic f(LBc/f$f;LBc/f$k;)V
    .locals 0

    invoke-static {p0, p1}, LBc/f;->w(LBc/f$f;LBc/f$k;)V

    return-void
.end method

.method public static synthetic g(LBc/f$f;LBc/f;Lgg/t;)V
    .locals 0

    invoke-static {p0, p1, p2}, LBc/f;->v(LBc/f$f;LBc/f;Lgg/t;)V

    return-void
.end method

.method public static synthetic h()V
    .locals 0

    invoke-static {}, LBc/f;->C()V

    return-void
.end method

.method public static synthetic i()V
    .locals 0

    invoke-static {}, LBc/f;->B()V

    return-void
.end method

.method public static final synthetic j(LBc/f;LBc/f$c$b;)LBc/a$b$b;
    .locals 0

    invoke-direct {p0, p1}, LBc/f;->q(LBc/f$c$b;)LBc/a$b$b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic k(LBc/f;LBc/f$f;)Lgg/s;
    .locals 0

    invoke-direct {p0, p1}, LBc/f;->u(LBc/f$f;)Lgg/s;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic l(LBc/f;I)LV7/b;
    .locals 0

    invoke-direct {p0, p1}, LBc/f;->x(I)LV7/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic m(LBc/f;)Lgg/i;
    .locals 0

    iget-object p0, p0, LBc/f;->e:Lgg/i;

    return-object p0
.end method

.method public static final synthetic n(LBc/f;)Landroid/telephony/SubscriptionManager;
    .locals 0

    iget-object p0, p0, LBc/f;->a:Landroid/telephony/SubscriptionManager;

    return-object p0
.end method

.method public static final synthetic o(LBc/f;)Landroid/telephony/TelephonyManager;
    .locals 0

    iget-object p0, p0, LBc/f;->b:Landroid/telephony/TelephonyManager;

    return-object p0
.end method

.method public static final synthetic p(LBc/f;I)Lgg/z;
    .locals 0

    invoke-direct {p0, p1}, LBc/f;->z(I)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method private final q(LBc/f$c$b;)LBc/a$b$b;
    .locals 1

    invoke-virtual {p1}, LBc/f$c$b;->c()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, LBc/a$b$b$c;->a:LBc/a$b$b$c;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LBc/f$c$b;->a()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object p1, LBc/a$b$b$b;->a:LBc/a$b$b$b;

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, LBc/f$c$b;->b()Z

    move-result p1

    if-nez p1, :cond_2

    sget-object p1, LBc/a$b$b$a;->a:LBc/a$b$b$a;

    goto :goto_0

    :cond_2
    sget-object p1, LBc/a$b$b$d;->a:LBc/a$b$b$d;

    :goto_0
    return-object p1
.end method

.method private final r(I)Lgg/i;
    .locals 1

    invoke-direct {p0, p1}, LBc/f;->D(I)Lgg/i;

    move-result-object p1

    new-instance v0, LBc/f$g;

    invoke-direct {v0, p0}, LBc/f$g;-><init>(LBc/f;)V

    invoke-virtual {p1, v0}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->h1()Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final s(I)Lgg/i;
    .locals 3

    new-instance v0, LBc/f$h;

    invoke-direct {v0, p0, p1}, LBc/f$h;-><init>(LBc/f;I)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object p1

    sget-object v0, LBc/f$i;->a:LBc/f$i;

    invoke-virtual {p1, v0}, Lgg/z;->K(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v1, v2}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final t(Lgg/i;Lgg/i;Lgg/i;I)Lgg/i;
    .locals 1

    new-instance v0, LBc/f$j;

    invoke-direct {v0, p0, p4, p2, p3}, LBc/f$j;-><init>(LBc/f;ILgg/i;Lgg/i;)V

    invoke-virtual {p1, v0}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final u(LBc/f$f;)Lgg/s;
    .locals 5

    sget-object v0, Lm9/c;->a:Lm9/c;

    invoke-virtual {p1}, LBc/f$f;->a()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "cellularManager-sub-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v2, v3}, Lm9/c;->d(Lm9/c;Ljava/lang/String;IILjava/lang/Object;)Lgg/y;

    move-result-object v0

    new-instance v1, LBc/d;

    invoke-direct {v1, p1, p0}, LBc/d;-><init>(LBc/f$f;LBc/f;)V

    invoke-static {v1}, Lgg/s;->o(Lgg/u;)Lgg/s;

    move-result-object p1

    invoke-virtual {p1, v0}, Lgg/s;->M0(Lgg/y;)Lgg/s;

    move-result-object p1

    invoke-virtual {p1, v0}, Lgg/s;->e1(Lgg/y;)Lgg/s;

    move-result-object p1

    const-string v0, "unsubscribeOn(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final v(LBc/f$f;LBc/f;Lgg/t;)V
    .locals 3

    const-string v0, "emitter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LBc/f$k;

    invoke-direct {v0, p1, p2, p0}, LBc/f$k;-><init>(LBc/f;Lgg/t;LBc/f$f;)V

    invoke-virtual {p0}, LBc/f$f;->b()Landroid/telephony/TelephonyManager;

    move-result-object p1

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-lt v1, v2, :cond_0

    const v1, 0x500510

    goto :goto_0

    :cond_0
    const v1, 0x400550

    :goto_0
    invoke-virtual {p1, v0, v1}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V

    new-instance p1, LBc/e;

    invoke-direct {p1, p0, v0}, LBc/e;-><init>(LBc/f$f;LBc/f$k;)V

    invoke-interface {p2, p1}, Lgg/t;->d(Lkg/e;)V

    new-instance p1, LBc/f$b$b;

    invoke-virtual {p0}, LBc/f$f;->b()Landroid/telephony/TelephonyManager;

    move-result-object p0

    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getSimOperatorName()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, LBc/f$b$b;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, p1}, Lgg/h;->h(Ljava/lang/Object;)V

    return-void
.end method

.method private static final w(LBc/f$f;LBc/f$k;)V
    .locals 1

    invoke-virtual {p0}, LBc/f$f;->b()Landroid/telephony/TelephonyManager;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V

    return-void
.end method

.method private final x(I)LV7/b;
    .locals 4

    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_0

    :pswitch_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid cellular network type "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x2

    invoke-static {v1, v0, p1, v0}, LZ7/b;->f(Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_0

    :pswitch_1
    sget-object v0, LV7/b$d$b;->a:LV7/b$d$b;

    goto :goto_0

    :pswitch_2
    sget-object v0, LV7/b$d$a;->a:LV7/b$d$a;

    goto :goto_0

    :pswitch_3
    sget-object v0, LV7/b$b$h;->a:LV7/b$b$h;

    goto :goto_0

    :pswitch_4
    sget-object v0, LV7/b$e;->a:LV7/b$e;

    goto :goto_0

    :pswitch_5
    sget-object v0, LV7/b$b$f;->a:LV7/b$b$f;

    goto :goto_0

    :pswitch_6
    sget-object v0, LV7/b$c$a;->a:LV7/b$c$a;

    goto :goto_0

    :pswitch_7
    sget-object v0, LV7/b$c$b;->a:LV7/b$c$b;

    goto :goto_0

    :pswitch_8
    sget-object v0, LV7/b$b$c;->a:LV7/b$b$c;

    goto :goto_0

    :pswitch_9
    sget-object v0, LV7/b$a$d;->a:LV7/b$a$d;

    goto :goto_0

    :pswitch_a
    sget-object v0, LV7/b$b$e;->a:LV7/b$b$e;

    goto :goto_0

    :pswitch_b
    sget-object v0, LV7/b$b$g;->a:LV7/b$b$g;

    goto :goto_0

    :pswitch_c
    sget-object v0, LV7/b$b$d;->a:LV7/b$b$d;

    goto :goto_0

    :pswitch_d
    sget-object v0, LV7/b$a$e;->a:LV7/b$a$e;

    goto :goto_0

    :pswitch_e
    sget-object v0, LV7/b$b$b;->a:LV7/b$b$b;

    goto :goto_0

    :pswitch_f
    sget-object v0, LV7/b$b$a;->a:LV7/b$b$a;

    goto :goto_0

    :pswitch_10
    sget-object v0, LV7/b$a$a;->a:LV7/b$a$a;

    goto :goto_0

    :pswitch_11
    sget-object v0, LV7/b$b$i;->a:LV7/b$b$i;

    goto :goto_0

    :pswitch_12
    sget-object v0, LV7/b$a$b;->a:LV7/b$a$b;

    goto :goto_0

    :pswitch_13
    sget-object v0, LV7/b$a$c;->a:LV7/b$a$c;

    :goto_0
    :pswitch_14
    return-object v0

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_14
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private final y(Lgg/i;)Lgg/i;
    .locals 1

    const-class v0, LBc/f$b$a;

    invoke-virtual {p1, v0}, Lgg/i;->Z0(Ljava/lang/Class;)Lgg/i;

    move-result-object p1

    const-string v0, "ofType(R::class.java)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final z(I)Lgg/z;
    .locals 1

    new-instance v0, LBc/f$n;

    invoke-direct {v0, p0, p1}, LBc/f$n;-><init>(LBc/f;I)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/z;->E(Lgg/y;)Lgg/z;

    move-result-object p1

    const-string v0, "observeOn(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, LBc/f;->p:Lgg/i;

    return-object v0
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, LBc/f;->j:Lgg/i;

    return-object v0
.end method

.method public c()Lgg/i;
    .locals 1

    iget-object v0, p0, LBc/f;->l:Lgg/i;

    return-object v0
.end method

.method public d()Lgg/i;
    .locals 1

    iget-object v0, p0, LBc/f;->o:Lgg/i;

    return-object v0
.end method

.method public e()Lgg/i;
    .locals 1

    iget-object v0, p0, LBc/f;->n:Lgg/i;

    return-object v0
.end method
