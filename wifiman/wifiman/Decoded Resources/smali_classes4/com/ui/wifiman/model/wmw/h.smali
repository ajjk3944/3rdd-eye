.class public final Lcom/ui/wifiman/model/wmw/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/wmw/g;
.implements Lse/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/wmw/h$a;,
        Lcom/ui/wifiman/model/wmw/h$b;
    }
.end annotation


# static fields
.field public static final n:Lcom/ui/wifiman/model/wmw/h$a;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/ui/wifiman/model/wmw/WifimanWizard;

.field private final c:Lcc/b;

.field private final d:LWd/f;

.field private final e:Lse/a;

.field private final f:LP7/a;

.field private final g:LFg/a;

.field private final h:LFg/a;

.field private final i:Lgg/i;

.field private final j:Lgg/i;

.field private final k:Lgg/i;

.field private final l:Lgg/i;

.field private final m:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/wmw/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/wmw/h$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/model/wmw/h;->n:Lcom/ui/wifiman/model/wmw/h$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/ui/wifiman/model/wmw/WifimanWizard;Lcc/b;LWd/f;Lse/a;LP7/a;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wizard"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adoptionDao"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fwService"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wizardFwService"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/h;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/ui/wifiman/model/wmw/h;->b:Lcom/ui/wifiman/model/wmw/WifimanWizard;

    iput-object p3, p0, Lcom/ui/wifiman/model/wmw/h;->c:Lcc/b;

    iput-object p4, p0, Lcom/ui/wifiman/model/wmw/h;->d:LWd/f;

    iput-object p5, p0, Lcom/ui/wifiman/model/wmw/h;->e:Lse/a;

    iput-object p6, p0, Lcom/ui/wifiman/model/wmw/h;->f:LP7/a;

    sget-object p1, Lcom/ui/wifiman/model/wmw/g$c$a;->a:Lcom/ui/wifiman/model/wmw/g$c$a;

    invoke-static {p1}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p1

    const-string p4, "createDefault(...)"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/h;->g:LFg/a;

    new-instance p5, Ll9/a;

    const/4 p6, 0x0

    invoke-direct {p5, p6}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {p5}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p5

    invoke-static {p5, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p5, p0, Lcom/ui/wifiman/model/wmw/h;->h:LFg/a;

    invoke-interface {p3}, Lcc/b;->a()Lgg/i;

    move-result-object p3

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p4

    invoke-virtual {p3, p4}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p3

    invoke-virtual {p3}, Lgg/i;->W()Lgg/i;

    move-result-object p3

    sget-object p4, Lcom/ui/wifiman/model/wmw/h$c;->a:Lcom/ui/wifiman/model/wmw/h$c;

    invoke-virtual {p3, p4}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p3

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p4

    invoke-virtual {p3, p4}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object p3

    const/4 p4, 0x1

    invoke-virtual {p3, p4}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p3

    invoke-virtual {p3}, Ljg/a;->i2()Lgg/i;

    move-result-object p3

    const-string p6, "refCount(...)"

    invoke-static {p3, p6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/ui/wifiman/model/wmw/h;->i:Lgg/i;

    sget-object v0, Lcom/ui/wifiman/model/wmw/h$g;->a:Lcom/ui/wifiman/model/wmw/h$g;

    invoke-virtual {p3, v0}, Lgg/i;->v0(Lkg/n;)Lgg/i;

    move-result-object p3

    sget-object v0, Lcom/ui/wifiman/model/wmw/h$h;->a:Lcom/ui/wifiman/model/wmw/h$h;

    invoke-virtual {p3, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p3

    invoke-virtual {p3}, Lgg/i;->W()Lgg/i;

    move-result-object p3

    const-string v0, "distinctUntilChanged(...)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/ui/wifiman/model/wmw/h;->j:Lgg/i;

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p3

    const/4 v0, 0x0

    invoke-virtual {p1, p3, v0, p4}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    new-instance p3, Lcom/ui/wifiman/model/wmw/h$A;

    invoke-direct {p3, p0}, Lcom/ui/wifiman/model/wmw/h$A;-><init>(Lcom/ui/wifiman/model/wmw/h;)V

    invoke-virtual {p1, p3}, Lgg/i;->p0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p4}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/h;->k:Lgg/i;

    invoke-virtual {p5}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p3

    invoke-virtual {p1, p3, v0, p4}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p4}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/h;->l:Lgg/i;

    invoke-interface {p2}, Lcom/ui/wifiman/model/wmw/WifimanWizard;->getState()Lgg/i;

    move-result-object p1

    sget-object p2, Lcom/ui/wifiman/model/wmw/h$d;->a:Lcom/ui/wifiman/model/wmw/h$d;

    invoke-virtual {p1, p2}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    new-instance p2, Lcom/ui/wifiman/model/wmw/h$e;

    invoke-direct {p2, p0}, Lcom/ui/wifiman/model/wmw/h$e;-><init>(Lcom/ui/wifiman/model/wmw/h;)V

    invoke-virtual {p1, p2}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object p2, Lcom/ui/wifiman/model/wmw/g$a$c;->a:Lcom/ui/wifiman/model/wmw/g$a$c;

    invoke-virtual {p1, p2}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p4}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/h;->m:Lgg/i;

    return-void
.end method

.method private final A(Lcom/ui/wifiman/model/wmw/g$c;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WMW Upgrade process state - "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/h;->g:LFg/a;

    invoke-virtual {v0, p1}, LFg/a;->h(Ljava/lang/Object;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/g$c$b$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/h;->h:LFg/a;

    new-instance v1, Ll9/a;

    invoke-direct {v1, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, LFg/a;->h(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static synthetic g(Lcom/ui/wifiman/model/wmw/h;)V
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/wmw/h;->z(Lcom/ui/wifiman/model/wmw/h;)V

    return-void
.end method

.method public static final synthetic h(Lcom/ui/wifiman/model/wmw/h;)Lcc/b;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/wmw/h;->c:Lcc/b;

    return-object p0
.end method

.method public static final synthetic i(Lcom/ui/wifiman/model/wmw/h;)LP7/a;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/wmw/h;->f:LP7/a;

    return-object p0
.end method

.method public static final synthetic j(Lcom/ui/wifiman/model/wmw/h;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/wmw/h;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic k(Lcom/ui/wifiman/model/wmw/h;Lcom/ui/wifiman/model/wmw/g$b;)Ljava/io/File;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/wmw/h;->u(Lcom/ui/wifiman/model/wmw/g$b;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic l(Lcom/ui/wifiman/model/wmw/h;)Lgg/i;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/wmw/h;->j:Lgg/i;

    return-object p0
.end method

.method public static final synthetic m(Lcom/ui/wifiman/model/wmw/h;)Lcom/ui/wifiman/model/wmw/WifimanWizard;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/wmw/h;->b:Lcom/ui/wifiman/model/wmw/WifimanWizard;

    return-object p0
.end method

.method public static final synthetic n(Lcom/ui/wifiman/model/wmw/h;)Lse/a;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/wmw/h;->e:Lse/a;

    return-object p0
.end method

.method public static final synthetic o(Lcom/ui/wifiman/model/wmw/h;)LFg/a;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/wmw/h;->h:LFg/a;

    return-object p0
.end method

.method public static final synthetic p(Lcom/ui/wifiman/model/wmw/h;Lcom/ui/wifiman/model/wmw/g$b;)Lgg/b;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/wmw/h;->v(Lcom/ui/wifiman/model/wmw/g$b;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic q(Lcom/ui/wifiman/model/wmw/h;Lcom/ui/wifiman/model/wmw/g$b;J)Lgg/i;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/ui/wifiman/model/wmw/h;->w(Lcom/ui/wifiman/model/wmw/g$b;J)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic r(Lcom/ui/wifiman/model/wmw/h;Lcom/ui/wifiman/model/wmw/g$b;J)Lgg/i;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/ui/wifiman/model/wmw/h;->x(Lcom/ui/wifiman/model/wmw/g$b;J)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic s(Lcom/ui/wifiman/model/wmw/h;Lcom/ui/wifiman/model/wmw/g$b;J)Lgg/i;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/ui/wifiman/model/wmw/h;->y(Lcom/ui/wifiman/model/wmw/g$b;J)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic t(Lcom/ui/wifiman/model/wmw/h;Lcom/ui/wifiman/model/wmw/g$c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/wmw/h;->A(Lcom/ui/wifiman/model/wmw/g$c;)V

    return-void
.end method

.method private final u(Lcom/ui/wifiman/model/wmw/g$b;)Ljava/io/File;
    .locals 4

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/h;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/wmw/g$b;->c()Lcom/ui/common/semver/SemVer;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "fw_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method private final v(Lcom/ui/wifiman/model/wmw/g$b;)Lgg/b;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/h;->c:Lcc/b;

    invoke-interface {v0}, Lcc/b;->a()Lgg/i;

    move-result-object v0

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/wmw/h$i;->a:Lcom/ui/wifiman/model/wmw/h$i;

    invoke-virtual {v0, v1}, Lgg/z;->u(Lkg/n;)Lgg/n;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/wmw/h$j;

    invoke-direct {v1, p0, p1}, Lcom/ui/wifiman/model/wmw/h$j;-><init>(Lcom/ui/wifiman/model/wmw/h;Lcom/ui/wifiman/model/wmw/g$b;)V

    invoke-virtual {v0, v1}, Lgg/n;->k(Lkg/n;)Lgg/b;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/wmw/h$k;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/wmw/h$k;-><init>(Lcom/ui/wifiman/model/wmw/g$b;)V

    invoke-virtual {v0, v1}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    const-string v0, "subscribeOn(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final w(Lcom/ui/wifiman/model/wmw/g$b;J)Lgg/i;
    .locals 11

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/h;->d:LWd/f;

    invoke-interface {v0}, LWd/f;->getClient()Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    const-wide/16 v1, 0x2710

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lgg/z;->Q(JLjava/util/concurrent/TimeUnit;)Lgg/z;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/wmw/h$m;->a:Lcom/ui/wifiman/model/wmw/h$m;

    invoke-virtual {v0, v1}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/wmw/h$n;

    invoke-direct {v1, p1, p0}, Lcom/ui/wifiman/model/wmw/h$n;-><init>(Lcom/ui/wifiman/model/wmw/g$b;Lcom/ui/wifiman/model/wmw/h;)V

    invoke-virtual {v0, v1}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/wmw/h$o;->a:Lcom/ui/wifiman/model/wmw/h$o;

    invoke-virtual {v0, v1}, Lgg/i;->f1(Lkg/n;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/wmw/h$p;

    invoke-direct {v1, p1, p2, p3}, Lcom/ui/wifiman/model/wmw/h$p;-><init>(Lcom/ui/wifiman/model/wmw/g$b;J)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    new-instance v10, Lcom/ui/wifiman/model/wmw/g$c$b$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/wmw/g$b;->c()Lcom/ui/common/semver/SemVer;

    move-result-object v2

    invoke-virtual {p1}, Lcom/ui/wifiman/model/wmw/g$b;->a()Lcom/ui/wifiman/model/ubiquiti/firmware/a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->c()J

    move-result-wide v5

    sget-object p1, Lcom/ui/wifiman/model/wmw/h$b;->DOWNLOAD:Lcom/ui/wifiman/model/wmw/h$b;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lcom/ui/wifiman/model/wmw/h$b;->mapStageProgressToTotalProgress(F)F

    move-result v9

    const-wide/16 v7, 0x0

    move-object v1, v10

    move-wide v3, p2

    invoke-direct/range {v1 .. v9}, Lcom/ui/wifiman/model/wmw/g$c$b$a;-><init>(Lcom/ui/common/semver/SemVer;JJJF)V

    invoke-virtual {v0, v10}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    const-string p2, "startWithItem(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final x(Lcom/ui/wifiman/model/wmw/g$b;J)Lgg/i;
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/wmw/h$q;

    invoke-direct {v0, p0, p1}, Lcom/ui/wifiman/model/wmw/h$q;-><init>(Lcom/ui/wifiman/model/wmw/h;Lcom/ui/wifiman/model/wmw/g$b;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v0

    const-string v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/ui/wifiman/model/wmw/h$r;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/ui/wifiman/model/wmw/h$r;-><init>(Lcom/ui/wifiman/model/wmw/h;Lcom/ui/wifiman/model/wmw/g$b;J)V

    invoke-virtual {v0, v1}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string p2, "flatMapPublisher(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final y(Lcom/ui/wifiman/model/wmw/g$b;J)Lgg/i;
    .locals 8

    new-instance v0, Lcom/ui/wifiman/model/wmw/g$c$b$c;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/wmw/g$b;->c()Lcom/ui/common/semver/SemVer;

    move-result-object v1

    sget-object v2, Lcom/ui/wifiman/model/wmw/h$b;->UPGRADE:Lcom/ui/wifiman/model/wmw/h$b;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/ui/wifiman/model/wmw/h$b;->mapStageProgressToTotalProgress(F)F

    move-result v2

    invoke-direct {v0, v1, p2, p3, v2}, Lcom/ui/wifiman/model/wmw/g$c$b$c;-><init>(Lcom/ui/common/semver/SemVer;JF)V

    invoke-static {v0}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0xc8

    invoke-static {v2, v3, v4, v5, v1}, Lgg/i;->F0(JJLjava/util/concurrent/TimeUnit;)Lgg/i;

    move-result-object v2

    new-instance v3, Lcom/ui/wifiman/model/wmw/h$s;

    invoke-direct {v3, p1, p2, p3}, Lcom/ui/wifiman/model/wmw/h$s;-><init>(Lcom/ui/wifiman/model/wmw/g$b;J)V

    invoke-virtual {v2, v3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v2

    invoke-virtual {v2}, Lgg/i;->e1()Lgg/i;

    move-result-object v2

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-virtual {v2, v3, v4, v5}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object v2

    const-wide/16 v6, 0x4e20

    invoke-static {v6, v7, v1}, Lgg/b;->a0(JLjava/util/concurrent/TimeUnit;)Lgg/b;

    move-result-object v3

    iget-object v6, p0, Lcom/ui/wifiman/model/wmw/h;->b:Lcom/ui/wifiman/model/wmw/WifimanWizard;

    invoke-interface {v6}, Lcom/ui/wifiman/model/wmw/WifimanWizard;->getState()Lgg/i;

    move-result-object v6

    invoke-virtual {v3, v6}, Lgg/b;->h(LDj/a;)Lgg/i;

    move-result-object v3

    sget-object v6, Lcom/ui/wifiman/model/wmw/h$t;->a:Lcom/ui/wifiman/model/wmw/h$t;

    invoke-virtual {v3, v6}, Lgg/i;->M1(Lkg/n;)Lgg/i;

    move-result-object v3

    invoke-virtual {v3}, Lgg/i;->o0()Lgg/z;

    move-result-object v3

    const-wide/32 v6, 0x2bf20

    invoke-virtual {v3, v6, v7, v1}, Lgg/z;->Q(JLjava/util/concurrent/TimeUnit;)Lgg/z;

    move-result-object v1

    sget-object v3, Lcom/ui/wifiman/model/wmw/h$u;->a:Lcom/ui/wifiman/model/wmw/h$u;

    invoke-virtual {v1, v3}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object v1

    new-instance v3, Lcom/ui/wifiman/model/wmw/h$v;

    invoke-direct {v3, p1}, Lcom/ui/wifiman/model/wmw/h$v;-><init>(Lcom/ui/wifiman/model/wmw/g$b;)V

    invoke-virtual {v1, v3}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object v1

    invoke-virtual {v1}, Lgg/z;->W()Lgg/i;

    move-result-object v1

    invoke-virtual {v2, v1}, Lgg/i;->Q1(LDj/a;)Lgg/i;

    move-result-object v1

    new-instance v2, Lcom/ui/wifiman/model/wmw/g$c$b$c;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/wmw/g$b;->c()Lcom/ui/common/semver/SemVer;

    move-result-object p1

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v2, p1, p2, p3, v3}, Lcom/ui/wifiman/model/wmw/g$c$b$c;-><init>(Lcom/ui/common/semver/SemVer;JF)V

    invoke-static {v2}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    const/4 p2, 0x3

    new-array p2, p2, [LDj/a;

    aput-object v0, p2, v4

    aput-object v1, p2, v5

    const/4 p3, 0x2

    aput-object p1, p2, p3

    invoke-static {p2}, Lgg/i;->A([LDj/a;)Lgg/i;

    move-result-object p1

    const-string p2, "concatArray(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final z(Lcom/ui/wifiman/model/wmw/h;)V
    .locals 1

    sget-object v0, Lcom/ui/wifiman/model/wmw/g$c$a;->a:Lcom/ui/wifiman/model/wmw/g$c$a;

    invoke-direct {p0, v0}, Lcom/ui/wifiman/model/wmw/h;->A(Lcom/ui/wifiman/model/wmw/g$c;)V

    return-void
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/h;->m:Lgg/i;

    return-object v0
.end method

.method public b(Lcom/ui/wifiman/model/wmw/g$b;)Lgg/i;
    .locals 3

    const-string v0, "firmware"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/model/wmw/h$w;

    invoke-direct {v0}, Lcom/ui/wifiman/model/wmw/h$w;-><init>()V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v0

    const-string v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/ui/wifiman/model/wmw/h$x;

    invoke-direct {v1, p0, p1}, Lcom/ui/wifiman/model/wmw/h$x;-><init>(Lcom/ui/wifiman/model/wmw/h;Lcom/ui/wifiman/model/wmw/g$b;)V

    invoke-virtual {v0, v1}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p1

    new-instance v0, Lcom/ui/wifiman/model/wmw/h$y;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/wmw/h$y;-><init>(Lcom/ui/wifiman/model/wmw/h;)V

    invoke-virtual {p1, v0}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/h;->b:Lcom/ui/wifiman/model/wmw/WifimanWizard;

    invoke-interface {v0}, Lcom/ui/wifiman/model/wmw/WifimanWizard;->c()Lgg/b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/i;->U0(Lgg/f;)Lgg/i;

    move-result-object p1

    sget-object v0, Lcom/ui/wifiman/model/wmw/h$z;->a:Lcom/ui/wifiman/model/wmw/h$z;

    invoke-virtual {p1, v0}, Lgg/i;->R1(Lkg/p;)Lgg/i;

    move-result-object p1

    new-instance v0, Lqe/k;

    invoke-direct {v0, p0}, Lqe/k;-><init>(Lcom/ui/wifiman/model/wmw/h;)V

    invoke-virtual {p1, v0}, Lgg/i;->Z(Lkg/a;)Lgg/i;

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

    const-string v0, "observeOn(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public c()Lgg/b;
    .locals 2

    invoke-virtual {p0}, Lcom/ui/wifiman/model/wmw/h;->a()Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/wmw/h$l;

    invoke-direct {v1, p0}, Lcom/ui/wifiman/model/wmw/h$l;-><init>(Lcom/ui/wifiman/model/wmw/h;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v0

    const-string v1, "flatMapCompletable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public d(Lcom/ui/wifiman/model/wmw/g$b;)Lgg/b;
    .locals 1

    const-string v0, "firmware"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/model/wmw/h$B;

    invoke-direct {v0, p0, p1}, Lcom/ui/wifiman/model/wmw/h$B;-><init>(Lcom/ui/wifiman/model/wmw/h;Lcom/ui/wifiman/model/wmw/g$b;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public e()Lgg/b;
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/wmw/h$f;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/wmw/h$f;-><init>(Lcom/ui/wifiman/model/wmw/h;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v0

    const-string v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object v0

    const-string v1, "subscribeOn(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public f()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/h;->l:Lgg/i;

    return-object v0
.end method

.method public getState()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/h;->k:Lgg/i;

    return-object v0
.end method
