.class public final LN8/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN8/a;


# instance fields
.field private final a:Lcom/ui/wifiman/model/android/permissions/d;

.field private final b:Lde/b;

.field private final c:Lgg/i;

.field private final d:Lgg/i;

.field private final e:Lgg/i;

.field private final f:Lgg/i;

.field private final g:Lgg/i;

.field private final h:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/ui/wifiman/model/android/permissions/d;Lde/b;)V
    .locals 4

    const-string/jumbo v0, "permissionsService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "appWizardConfigManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN8/f;->a:Lcom/ui/wifiman/model/android/permissions/d;

    iput-object p2, p0, LN8/f;->b:Lde/b;

    invoke-interface {p2}, Lee/c;->b()Lgg/i;

    move-result-object p1

    sget-object v0, LN8/f$d;->a:LN8/f$d;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    new-instance v0, LN8/f$e;

    invoke-direct {v0, p0}, LN8/f$e;-><init>(LN8/f;)V

    invoke-virtual {p1, v0}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "switchMap(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LN8/f;->c:Lgg/i;

    invoke-interface {p2}, Lee/c;->b()Lgg/i;

    move-result-object v1

    sget-object v2, LN8/f$a;->a:LN8/f$a;

    invoke-virtual {v1, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    const-string/jumbo v2, "distinctUntilChanged(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, LN8/f;->d:Lgg/i;

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1f

    if-lt v2, v3, :cond_0

    invoke-interface {p2}, Lee/c;->b()Lgg/i;

    move-result-object v2

    sget-object v3, LN8/f$b;->a:LN8/f$b;

    invoke-virtual {v2, v3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v2

    goto :goto_0

    :cond_0
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v2}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object v2

    :goto_0
    invoke-virtual {v2}, Lgg/i;->W()Lgg/i;

    move-result-object v2

    new-instance v3, LN8/f$c;

    invoke-direct {v3, p0}, LN8/f$c;-><init>(LN8/f;)V

    invoke-virtual {v2, v3}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, p0, LN8/f;->e:Lgg/i;

    sget-object v3, Lcom/ui/wifiman/model/android/permissions/a;->NOTIFICATION:Lcom/ui/wifiman/model/android/permissions/a;

    invoke-virtual {v3}, Lcom/ui/wifiman/model/android/permissions/a;->getAlwaysGranted()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-interface {p2}, Lee/c;->b()Lgg/i;

    move-result-object p2

    sget-object v3, LN8/f$f;->a:LN8/f$f;

    invoke-virtual {p2, v3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p2

    goto :goto_1

    :cond_1
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p2}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p2

    :goto_1
    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    new-instance v3, LN8/f$g;

    invoke-direct {v3, p0}, LN8/f$g;-><init>(LN8/f;)V

    invoke-virtual {p2, v3}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LN8/f;->f:Lgg/i;

    sget-object v0, LN8/f$h;->a:LN8/f$h;

    invoke-static {p1, v1, v2, p2, v0}, Lgg/i;->t(LDj/a;LDj/a;LDj/a;LDj/a;Lkg/h;)Lgg/i;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LN8/f;->g:Lgg/i;

    iput-object p1, p0, LN8/f;->h:Lgg/i;

    return-void
.end method

.method public static synthetic e(Lde/a;)Lde/a;
    .locals 0

    invoke-static {p0}, LN8/f;->k(Lde/a;)Lde/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lde/a;)Lde/a;
    .locals 0

    invoke-static {p0}, LN8/f;->n(Lde/a;)Lde/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lde/a;)Lde/a;
    .locals 0

    invoke-static {p0}, LN8/f;->m(Lde/a;)Lde/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lde/a;)Lde/a;
    .locals 0

    invoke-static {p0}, LN8/f;->l(Lde/a;)Lde/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i(LN8/f;)Lde/b;
    .locals 0

    iget-object p0, p0, LN8/f;->b:Lde/b;

    return-object p0
.end method

.method public static final synthetic j(LN8/f;)Lcom/ui/wifiman/model/android/permissions/d;
    .locals 0

    iget-object p0, p0, LN8/f;->a:Lcom/ui/wifiman/model/android/permissions/d;

    return-object p0
.end method

.method private static final k(Lde/a;)Lde/a;
    .locals 8

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/16 v6, 0xb

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v7}, Lde/a;->b(Lde/a;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/Object;)Lde/a;

    move-result-object p0

    return-object p0
.end method

.method private static final l(Lde/a;)Lde/a;
    .locals 8

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v7}, Lde/a;->b(Lde/a;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/Object;)Lde/a;

    move-result-object p0

    return-object p0
.end method

.method private static final m(Lde/a;)Lde/a;
    .locals 8

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v7}, Lde/a;->b(Lde/a;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/Object;)Lde/a;

    move-result-object p0

    return-object p0
.end method

.method private static final n(Lde/a;)Lde/a;
    .locals 8

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/16 v6, 0xd

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v7}, Lde/a;->b(Lde/a;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/Object;)Lde/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Lgg/b;
    .locals 2

    iget-object v0, p0, LN8/f;->b:Lde/b;

    new-instance v1, LN8/e;

    invoke-direct {v1}, LN8/e;-><init>()V

    invoke-interface {v0, v1}, Lee/c;->a(Lmh/l;)Lgg/b;

    move-result-object v0

    return-object v0
.end method

.method public b()Lgg/b;
    .locals 2

    iget-object v0, p0, LN8/f;->b:Lde/b;

    new-instance v1, LN8/b;

    invoke-direct {v1}, LN8/b;-><init>()V

    invoke-interface {v0, v1}, Lee/c;->a(Lmh/l;)Lgg/b;

    move-result-object v0

    return-object v0
.end method

.method public c()Lgg/b;
    .locals 2

    iget-object v0, p0, LN8/f;->b:Lde/b;

    new-instance v1, LN8/d;

    invoke-direct {v1}, LN8/d;-><init>()V

    invoke-interface {v0, v1}, Lee/c;->a(Lmh/l;)Lgg/b;

    move-result-object v0

    return-object v0
.end method

.method public d()Lgg/b;
    .locals 2

    iget-object v0, p0, LN8/f;->b:Lde/b;

    new-instance v1, LN8/c;

    invoke-direct {v1}, LN8/c;-><init>()V

    invoke-interface {v0, v1}, Lee/c;->a(Lmh/l;)Lgg/b;

    move-result-object v0

    return-object v0
.end method

.method public getState()Lgg/i;
    .locals 1

    iget-object v0, p0, LN8/f;->h:Lgg/i;

    return-object v0
.end method
