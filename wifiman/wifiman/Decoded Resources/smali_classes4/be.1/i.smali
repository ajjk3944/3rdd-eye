.class public final Lbe/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbe/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbe/i$a;
    }
.end annotation


# static fields
.field public static final m:Lbe/i$a;


# instance fields
.field private final a:Lbe/c$a;

.field private final b:LP7/a;

.field private final c:LFd/D;

.field private final d:Lcom/ui/wifiman/model/support/a;

.field private final e:Lgg/i;

.field private final f:Lgg/i;

.field private final g:Lgg/i;

.field private final h:Lgg/i;

.field private final i:Lgg/i;

.field private final j:Lgg/i;

.field private final k:Lgg/i;

.field private final l:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbe/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbe/i$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lbe/i;->m:Lbe/i$a;

    return-void
.end method

.method public constructor <init>(LZc/f;Lbe/c$a;LP7/a;Lcom/ui/wifiman/model/teleport/TeleportConnection;LFd/D;Lcom/ui/wifiman/model/support/a;)V
    .locals 7

    const-string v0, "networkConnectionManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "teleportConnection"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "teleportManager"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "supportFileDataCollector"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lbe/i;->a:Lbe/c$a;

    iput-object p3, p0, Lbe/i;->b:LP7/a;

    iput-object p5, p0, Lbe/i;->c:LFd/D;

    iput-object p6, p0, Lbe/i;->d:Lcom/ui/wifiman/model/support/a;

    invoke-interface {p1}, LZc/f;->getState()Lgg/i;

    move-result-object p1

    sget-object p2, Lbe/i$g;->a:Lbe/i$g;

    invoke-virtual {p1, p2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const-string p2, "distinctUntilChanged(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lbe/i;->e:Lgg/i;

    invoke-interface {p4}, Lcom/ui/wifiman/model/teleport/TeleportConnection;->getState()Lgg/i;

    move-result-object p1

    sget-object p3, Lbe/i$h;->a:Lbe/i$h;

    invoke-virtual {p1, p3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    new-instance p3, Lbe/i$i;

    invoke-direct {p3, p0}, Lbe/i$i;-><init>(Lbe/i;)V

    invoke-virtual {p1, p3}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lbe/i;->f:Lgg/i;

    sget-object p1, Lcom/ubnt/usurvey/a;->r:Lcom/ubnt/usurvey/a$a;

    invoke-virtual {p1}, Lcom/ubnt/usurvey/a$a;->a()Lcom/ubnt/usurvey/a$b;

    move-result-object p1

    invoke-interface {p1}, Lcom/ubnt/usurvey/a$b;->b()Lgg/i;

    move-result-object p1

    sget-object p3, Lbe/i$d;->a:Lbe/i$d;

    invoke-virtual {p1, p3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    new-instance p3, Lbe/i$e;

    invoke-direct {p3, p0}, Lbe/i$e;-><init>(Lbe/i;)V

    invoke-virtual {p1, p3}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    sget-object p3, Lbe/i$f;->a:Lbe/i$f;

    invoke-virtual {p1, p3}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    const/4 p3, 0x1

    invoke-virtual {p1, p3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p4, "refCount(...)"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lbe/i;->g:Lgg/i;

    new-instance p5, Lbe/i$b;

    invoke-direct {p5, p0}, Lbe/i$b;-><init>(Lbe/i;)V

    invoke-virtual {p1, p5}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lbe/f;

    invoke-direct {p2, p0}, Lbe/f;-><init>(Lbe/i;)V

    invoke-static {p1, p2}, Ln9/c;->c(Lgg/i;Lmh/l;)Lgg/i;

    move-result-object p1

    new-instance p2, Lbe/i$c;

    invoke-direct {p2, p0}, Lbe/i$c;-><init>(Lbe/i;)V

    invoke-virtual {p1, p2}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lbe/i;->h:Lgg/i;

    invoke-virtual {p0}, Lbe/i;->c()Lgg/i;

    move-result-object p1

    new-instance p2, Lbe/g;

    invoke-direct {p2}, Lbe/g;-><init>()V

    const-wide/16 p5, 0x3e8

    invoke-static {p1, p5, p6, p2}, Lfe/h;->m(Lgg/i;JLmh/l;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lbe/i;->i:Lgg/i;

    const/4 p2, 0x0

    const/4 p5, 0x0

    invoke-static {p1, p5, p3, p2}, Lfe/h;->h(Lgg/i;ZILjava/lang/Object;)Lgg/i;

    move-result-object p2

    sget-object p6, Lbe/i$k;->a:Lbe/i$k;

    invoke-virtual {p2, p6}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p2

    const-string p6, "map(...)"

    invoke-static {p2, p6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lbe/i;->j:Lgg/i;

    invoke-static {p1, p5}, Lfe/h;->g(Lgg/i;Z)Lgg/i;

    move-result-object p1

    sget-object p2, Lbe/i$l;->a:Lbe/i$l;

    invoke-virtual {p1, p2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {p1, p6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lbe/i;->k:Lgg/i;

    invoke-virtual {p0}, Lbe/i;->c()Lgg/i;

    move-result-object v0

    new-instance v4, Lbe/h;

    invoke-direct {v4}, Lbe/h;-><init>()V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const-wide/16 v1, 0x3e8

    const/4 v3, 0x0

    invoke-static/range {v0 .. v6}, Lfe/h;->l(Lgg/i;JZLmh/l;ILjava/lang/Object;)Lgg/i;

    move-result-object p1

    sget-object p2, Lbe/i$m;->a:Lbe/i$m;

    invoke-virtual {p1, p2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lbe/i;->l:Lgg/i;

    return-void
.end method

.method public static synthetic e(Lbe/c;)Lgg/z;
    .locals 0

    invoke-static {p0}, Lbe/i;->q(Lbe/c;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lbe/i;Ll9/a;)Lgg/b;
    .locals 0

    invoke-static {p0, p1}, Lbe/i;->m(Lbe/i;Ll9/a;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lbe/c;)Lgg/z;
    .locals 0

    invoke-static {p0}, Lbe/i;->p(Lbe/c;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h(Lbe/i;Lbe/c$b;)Lgg/z;
    .locals 0

    invoke-direct {p0, p1}, Lbe/i;->n(Lbe/c$b;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i(Lbe/i;)Lgg/i;
    .locals 0

    iget-object p0, p0, Lbe/i;->e:Lgg/i;

    return-object p0
.end method

.method public static final synthetic j(Lbe/i;)Lgg/i;
    .locals 0

    iget-object p0, p0, Lbe/i;->f:Lgg/i;

    return-object p0
.end method

.method public static final synthetic k(Lbe/i;)Lcom/ui/wifiman/model/support/a;
    .locals 0

    iget-object p0, p0, Lbe/i;->d:Lcom/ui/wifiman/model/support/a;

    return-object p0
.end method

.method public static final synthetic l(Lbe/i;)LFd/D;
    .locals 0

    iget-object p0, p0, Lbe/i;->c:LFd/D;

    return-object p0
.end method

.method private static final m(Lbe/i;Ll9/a;)Lgg/b;
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbe/c;

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lbe/i;->o()Lgg/b;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_0
    return-object p0
.end method

.method private final n(Lbe/c$b;)Lgg/z;
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object v1, p0, Lbe/i;->a:Lbe/c$a;

    invoke-interface {v1, p1}, Lbe/c$a;->a(Lbe/c$b;)Lbe/c;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lbe/c;->a()Lgg/z;

    move-result-object v1

    new-instance v2, Lbe/i$j;

    invoke-direct {v2, p1}, Lbe/i$j;-><init>(Lbe/c;)V

    invoke-virtual {v1, v2}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    new-instance v1, Ll9/a;

    invoke-direct {v1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, v1}, Lgg/z;->H(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    new-instance p1, Ll9/a;

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {p1}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    const-string v0, "just(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    return-object p1
.end method

.method private final o()Lgg/b;
    .locals 2

    iget-object v0, p0, Lbe/i;->b:LP7/a;

    new-instance v1, LP7/g;

    invoke-direct {v1}, LP7/g;-><init>()V

    invoke-interface {v0, v1}, LP7/a;->d(LP7/c;)Lgg/b;

    move-result-object v0

    return-object v0
.end method

.method private static final p(Lbe/c;)Lgg/z;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lbe/c;->b()Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method private static final q(Lbe/c;)Lgg/z;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lbe/c;->a()Lgg/z;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Lbe/i;->j:Lgg/i;

    return-object v0
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, Lbe/i;->l:Lgg/i;

    return-object v0
.end method

.method public c()Lgg/i;
    .locals 1

    iget-object v0, p0, Lbe/i;->h:Lgg/i;

    return-object v0
.end method

.method public d()Lgg/i;
    .locals 1

    iget-object v0, p0, Lbe/i;->k:Lgg/i;

    return-object v0
.end method
