.class public final Lo8/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo8/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo8/d$a;,
        Lo8/d$b;
    }
.end annotation


# static fields
.field public static final h:Lo8/d$a;

.field public static final i:I


# instance fields
.field private final a:Lgd/g;

.field private final b:LFg/a;

.field private final c:LFg/a;

.field private final d:Lgg/i;

.field private final e:Lgg/b;

.field private final f:Lgg/i;

.field private final g:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo8/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo8/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lo8/d;->h:Lo8/d$a;

    const/16 v0, 0x8

    sput v0, Lo8/d;->i:I

    return-void
.end method

.method public constructor <init>(Lgd/g;)V
    .locals 5

    const-string/jumbo v0, "portScan"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo8/d;->a:Lgd/g;

    new-instance p1, Ll9/a;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {p1}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p1

    const-string/jumbo v1, "createDefault(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lo8/d;->b:LFg/a;

    new-instance v2, Ll9/a;

    invoke-direct {v2, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {v2}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lo8/d;->c:LFg/a;

    invoke-virtual {v0}, Lgg/i;->e1()Lgg/i;

    move-result-object v0

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    invoke-virtual {v0, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v0

    const-string/jumbo v1, "refCount(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lo8/d;->d:Lgg/i;

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v4

    invoke-virtual {p1, v4, v2, v3}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    new-instance v2, Lo8/d$g;

    invoke-direct {v2, p0}, Lo8/d$g;-><init>(Lo8/d;)V

    invoke-virtual {p1, v2}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->E0()Lgg/b;

    move-result-object p1

    const-string/jumbo v2, "ignoreElements(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lo8/d;->e:Lgg/b;

    sget-object v2, Lo8/d$d;->a:Lo8/d$d;

    invoke-virtual {v0, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v2

    invoke-virtual {v2}, Lgg/i;->W()Lgg/i;

    move-result-object v2

    invoke-virtual {v2, p1}, Lgg/i;->U0(Lgg/f;)Lgg/i;

    move-result-object v2

    invoke-virtual {v2, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v2

    invoke-virtual {v2}, Ljg/a;->i2()Lgg/i;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, p0, Lo8/d;->f:Lgg/i;

    sget-object v2, Lo8/d$e;->a:Lo8/d$e;

    invoke-virtual {v0, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lgg/i;->U0(Lgg/f;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lo8/d;->g:Lgg/i;

    return-void
.end method

.method public static synthetic f(Ljava/util/ArrayList;Lo8/d;Ljava/lang/Integer;Lgd/a;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lo8/d;->r(Ljava/util/ArrayList;Lo8/d;Ljava/lang/Integer;Lgd/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lmh/p;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lo8/d;->s(Lmh/p;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic h(Lo8/d;Lgg/i;)Lgg/i;
    .locals 0

    invoke-direct {p0, p1}, Lo8/d;->l(Lgg/i;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i(Lo8/d;)Lgd/g;
    .locals 0

    iget-object p0, p0, Lo8/d;->a:Lgd/g;

    return-object p0
.end method

.method public static final synthetic j(Lo8/d;)LFg/a;
    .locals 0

    iget-object p0, p0, Lo8/d;->b:LFg/a;

    return-object p0
.end method

.method public static final synthetic k(Lo8/d;)LFg/a;
    .locals 0

    iget-object p0, p0, Lo8/d;->c:LFg/a;

    return-object p0
.end method

.method private final l(Lgg/i;)Lgg/i;
    .locals 4

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0xc8

    const/4 v3, 0x1

    invoke-virtual {p1, v1, v2, v0, v3}, Lgg/i;->X1(JLjava/util/concurrent/TimeUnit;Z)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, v3}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    new-instance v0, Lo8/d$c;

    invoke-direct {v0, p0}, Lo8/d$c;-><init>(Lo8/d;)V

    invoke-virtual {p1, v0}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "doOnNext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final m(Landroid/os/Bundle;)Lgd/a;
    .locals 4

    const-string/jumbo v0, "port"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    const-string/jumbo v1, "name"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "protocol"

    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v3, "description"

    invoke-virtual {p1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v3, Lgd/a;

    invoke-direct {v3, v0, v1, v2, p1}, Lgd/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v3
.end method

.method private final n(Landroid/os/Bundle;)Lgd/g$b;
    .locals 4

    const-string/jumbo v0, "isDone"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    const-string/jumbo v1, "toScanNum"

    const-string/jumbo v2, "key host not available"

    const-string/jumbo v3, "host"

    if-eqz v0, :cond_1

    invoke-virtual {p1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-direct {p0, p1}, Lo8/d;->o(Landroid/os/Bundle;)Ljava/util/TreeMap;

    move-result-object p1

    new-instance v2, Lgd/g$b$a;

    invoke-direct {v2, v0, v1, p1}, Lgd/g$b$a;-><init>(Ljava/lang/String;ILjava/util/TreeMap;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {p1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v1

    const-string/jumbo v2, "scannedNum"

    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v2

    invoke-direct {p0, p1}, Lo8/d;->o(Landroid/os/Bundle;)Ljava/util/TreeMap;

    move-result-object p1

    new-instance v3, Lgd/g$b$b;

    invoke-direct {v3, v0, v2, v1, p1}, Lgd/g$b$b;-><init>(Ljava/lang/String;IILjava/util/TreeMap;)V

    move-object v2, v3

    :goto_0
    return-object v2

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final o(Landroid/os/Bundle;)Ljava/util/TreeMap;
    .locals 3

    const-string/jumbo v0, "services"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {p0, v1}, Lo8/d;->m(Landroid/os/Bundle;)Lgd/a;

    move-result-object v1

    invoke-virtual {v1}, Lgd/a;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    :cond_1
    return-object v0
.end method

.method private final p(Lgd/a;)Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p1}, Lgd/a;->b()I

    move-result v1

    const-string/jumbo v2, "port"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string/jumbo v1, "name"

    invoke-virtual {p1}, Lgd/a;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string/jumbo v1, "protocol"

    invoke-virtual {p1}, Lgd/a;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string/jumbo v1, "description"

    invoke-virtual {p1}, Lgd/a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private final q(Lgd/g$b;)Landroid/os/Bundle;
    .locals 4

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    instance-of v1, p1, Lgd/g$b$b;

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    instance-of v1, p1, Lgd/g$b$a;

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    :goto_0
    const-string/jumbo v2, "isDone"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-virtual {p1}, Lgd/g$b;->a()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "host"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string/jumbo v1, "scannedNum"

    invoke-virtual {p1}, Lgd/g$b;->d()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string/jumbo v1, "toScanNum"

    invoke-virtual {p1}, Lgd/g$b;->b()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lgd/g$b;->e()Ljava/util/TreeMap;

    move-result-object p1

    new-instance v2, Lo8/b;

    invoke-direct {v2, v1, p0}, Lo8/b;-><init>(Ljava/util/ArrayList;Lo8/d;)V

    new-instance v3, Lo8/c;

    invoke-direct {v3, v2}, Lo8/c;-><init>(Lmh/p;)V

    invoke-virtual {p1, v3}, Ljava/util/TreeMap;->forEach(Ljava/util/function/BiConsumer;)V

    sget-object p1, LYg/J;->a:LYg/J;

    const-string/jumbo p1, "services"

    invoke-virtual {v0, p1, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    return-object v0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private static final r(Ljava/util/ArrayList;Lo8/d;Ljava/lang/Integer;Lgd/a;)LYg/J;
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p2, "service"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, p3}, Lo8/d;->p(Lgd/a;)Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final s(Lmh/p;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1, p2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lgg/b;
    .locals 1

    const-string/jumbo v0, "host"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lo8/d$f;

    invoke-direct {v0, p0, p1}, Lo8/d$f;-><init>(Lo8/d;Ljava/lang/String;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, Lo8/d;->g:Lgg/i;

    return-object v0
.end method

.method public c()Lgg/i;
    .locals 1

    iget-object v0, p0, Lo8/d;->f:Lgg/i;

    return-object v0
.end method

.method public d(Landroidx/lifecycle/E;)V
    .locals 3

    const-string/jumbo v0, "savedState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "portScan"

    invoke-virtual {p1, v0}, Landroidx/lifecycle/E;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Lo8/d;->n(Landroid/os/Bundle;)Lgd/g$b;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Lo8/d;->c:LFg/a;

    new-instance v1, Ll9/a;

    invoke-direct {v1, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, LFg/a;->h(Ljava/lang/Object;)V

    iget-object v0, p0, Lo8/d;->b:LFg/a;

    new-instance v1, Ll9/a;

    new-instance v2, Lo8/d$b$a;

    invoke-direct {v2, p1}, Lo8/d$b$a;-><init>(Lgd/g$b;)V

    invoke-direct {v1, v2}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, LFg/a;->h(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public e(Landroidx/lifecycle/E;)V
    .locals 2

    const-string/jumbo v0, "savedState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lo8/d;->c:LFg/a;

    invoke-virtual {v0}, LFg/a;->l2()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll9/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll9/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgd/g$b;

    if-eqz v0, :cond_0

    const-string/jumbo v1, "portScan"

    invoke-direct {p0, v0}, Lo8/d;->q(Lgd/g$b;)Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Landroidx/lifecycle/E;->i(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
