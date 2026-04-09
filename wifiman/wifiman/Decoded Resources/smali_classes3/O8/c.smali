.class public final LO8/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO8/a;


# instance fields
.field private final a:Lhc/b;

.field private final b:Lgg/i;

.field private final c:Lgg/b;

.field private final d:Lgg/b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/ui/wifiman/model/wmw/WifimanWizard;Lhc/b;LP8/f;)V
    .locals 1

    const-string/jumbo v0, "wifimanWizard"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "toastService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "popupController"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LO8/c;->a:Lhc/b;

    invoke-interface {p3}, LP8/f;->getState()Lgg/i;

    move-result-object p2

    sget-object p3, LO8/c$b;->a:LO8/c$b;

    invoke-virtual {p2, p3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    const-string/jumbo p3, "distinctUntilChanged(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LO8/c;->b:Lgg/i;

    invoke-interface {p1}, Lcom/ui/wifiman/model/wmw/WifimanWizard;->getState()Lgg/i;

    move-result-object p1

    new-instance p3, LO8/b;

    invoke-direct {p3}, LO8/b;-><init>()V

    sget-object v0, LO8/c$c;->a:LO8/c$c;

    invoke-virtual {p1, p3, v0}, Lgg/i;->s1(Lkg/q;Lkg/b;)Lgg/i;

    move-result-object p1

    new-instance p3, LO8/c$d;

    invoke-direct {p3, p0}, LO8/c$d;-><init>(LO8/c;)V

    invoke-virtual {p1, p3}, Lgg/i;->t0(Lkg/n;)Lgg/b;

    move-result-object p1

    invoke-virtual {p1}, Lgg/b;->f0()Lgg/s;

    move-result-object p1

    invoke-virtual {p1}, Lgg/s;->r0()LBg/a;

    move-result-object p1

    invoke-virtual {p1}, LBg/a;->l1()Lgg/s;

    move-result-object p1

    invoke-virtual {p1}, Lgg/s;->f0()Lgg/b;

    move-result-object p1

    const-string/jumbo p3, "ignoreElements(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LO8/c;->c:Lgg/b;

    new-instance p1, LO8/c$a;

    invoke-direct {p1, p0}, LO8/c$a;-><init>(LO8/c;)V

    invoke-virtual {p2, p1}, Lgg/i;->L1(Lkg/n;)Lgg/b;

    move-result-object p1

    invoke-virtual {p1}, Lgg/b;->f0()Lgg/s;

    move-result-object p1

    invoke-virtual {p1}, Lgg/s;->r0()LBg/a;

    move-result-object p1

    invoke-virtual {p1}, LBg/a;->l1()Lgg/s;

    move-result-object p1

    invoke-virtual {p1}, Lgg/s;->f0()Lgg/b;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LO8/c;->d:Lgg/b;

    return-void
.end method

.method public static synthetic b()LYg/s;
    .locals 1

    invoke-static {}, LO8/c;->e()LYg/s;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic c(LO8/c;)Lgg/b;
    .locals 0

    iget-object p0, p0, LO8/c;->c:Lgg/b;

    return-object p0
.end method

.method public static final synthetic d(LO8/c;)Lhc/b;
    .locals 0

    iget-object p0, p0, LO8/c;->a:Lhc/b;

    return-object p0
.end method

.method private static final e()LYg/s;
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0, v0}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()Lgg/b;
    .locals 1

    iget-object v0, p0, LO8/c;->d:Lgg/b;

    return-object v0
.end method
