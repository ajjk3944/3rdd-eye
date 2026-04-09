.class public final LKc/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKc/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LKc/e$a;
    }
.end annotation


# static fields
.field public static final p:LKc/e$a;


# instance fields
.field private final a:LKc/a$a;

.field private final b:Lgg/y;

.field private final c:J

.field private final d:J

.field private e:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private f:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final g:J

.field private final h:Ljava/util/Set;

.field private i:Ljava/util/concurrent/atomic/AtomicLong;

.field private final j:LFg/a;

.field private final k:LFg/a;

.field private final l:Lgg/i;

.field private final m:Lgg/b;

.field private final n:Lgg/i;

.field private final o:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LKc/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LKc/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LKc/e;->p:LKc/e$a;

    return-void
.end method

.method public constructor <init>(LKc/a$a;Lgg/y;)V
    .locals 9

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scheduler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKc/e;->a:LKc/a$a;

    iput-object p2, p0, LKc/e;->b:Lgg/y;

    sget-object p2, Lee/a;->a:Lee/a;

    invoke-virtual {p1}, LKc/a$a;->a()LWc/a;

    move-result-object v0

    invoke-virtual {p2, v0}, Lee/a;->c(LWc/a;)J

    move-result-wide v0

    iput-wide v0, p0, LKc/e;->c:J

    invoke-virtual {p1}, LKc/a$a;->a()LWc/a;

    move-result-object v2

    invoke-virtual {p2, v2}, Lee/a;->a(LWc/a;)J

    move-result-wide v2

    iput-wide v2, p0, LKc/e;->d:J

    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v4, 0x0

    invoke-direct {p2, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p2, p0, LKc/e;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p2, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p2, v4}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p2, p0, LKc/e;->f:Ljava/util/concurrent/atomic/AtomicInteger;

    sub-long/2addr v2, v0

    const-wide/16 v5, 0x1

    sub-long/2addr v2, v5

    const-wide/16 v7, 0x400

    invoke-static {v2, v3, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    iput-wide v2, p0, LKc/e;->g:J

    new-instance p2, Ljava/util/LinkedHashSet;

    invoke-direct {p2}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p2, p0, LKc/e;->h:Ljava/util/Set;

    new-instance p2, Ljava/util/concurrent/atomic/AtomicLong;

    add-long/2addr v0, v5

    invoke-direct {p2, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object p2, p0, LKc/e;->i:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p0}, LKc/e;->o()LKc/a$c;

    move-result-object p2

    invoke-static {p2}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p2

    const-string v0, "createDefault(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LKc/e;->j:LFg/a;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p2

    invoke-static {p2}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LKc/e;->k:LFg/a;

    new-instance p2, LKc/c;

    invoke-direct {p2, p0}, LKc/c;-><init>(LKc/e;)V

    invoke-static {p2}, Lgg/i;->C0(Lkg/f;)Lgg/i;

    move-result-object p2

    sget-object v0, LKc/e$b;->a:LKc/e$b;

    invoke-virtual {p2, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p2

    sget-object v0, LKc/e$c;->a:LKc/e$c;

    invoke-virtual {p2, v0}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p2

    const-string v0, "doOnNext(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LKc/e;->l:Lgg/i;

    new-instance p2, Lsh/i;

    invoke-virtual {p1}, LKc/a$a;->c()I

    move-result p1

    invoke-direct {p2, v4, p1}, Lsh/i;-><init>(II)V

    new-instance p1, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p2, v0}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LZg/Q;

    invoke-virtual {v0}, LZg/Q;->d()I

    iget-object v0, p0, LKc/e;->l:Lgg/i;

    new-instance v1, LKc/e$e;

    invoke-direct {v1, p0}, LKc/e$e;-><init>(LKc/e;)V

    invoke-virtual {v0, v1}, Lgg/i;->x0(Lkg/n;)Lgg/i;

    move-result-object v0

    iget-object v1, p0, LKc/e;->b:Lgg/y;

    invoke-virtual {v0, v1}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lgg/i;->S0(Ljava/lang/Iterable;)Lgg/i;

    move-result-object p1

    const-wide/16 v0, 0x1f4

    sget-object p2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, p2}, Lgg/i;->d(JLjava/util/concurrent/TimeUnit;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->a1()Lgg/i;

    move-result-object p1

    new-instance p2, LKc/e$f;

    invoke-direct {p2, p0}, LKc/e$f;-><init>(LKc/e;)V

    invoke-virtual {p1, p2}, Lgg/i;->t0(Lkg/n;)Lgg/b;

    move-result-object p1

    new-instance p2, LKc/e$g;

    invoke-direct {p2, p0}, LKc/e$g;-><init>(LKc/e;)V

    invoke-virtual {p1, p2}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object p1

    new-instance p2, LKc/d;

    invoke-direct {p2, p0}, LKc/d;-><init>(LKc/e;)V

    invoke-virtual {p1, p2}, Lgg/b;->y(Lkg/a;)Lgg/b;

    move-result-object p1

    const-string p2, "doOnDispose(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LKc/e;->m:Lgg/b;

    iget-object p2, p0, LKc/e;->j:LFg/a;

    invoke-virtual {p2}, Lgg/i;->e1()Lgg/i;

    move-result-object p2

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p2, v0, v4, v1}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    invoke-virtual {p2, v1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p2

    invoke-virtual {p2}, Ljg/a;->i2()Lgg/i;

    move-result-object p2

    const-string v0, "refCount(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LKc/e;->n:Lgg/i;

    iget-object p2, p0, LKc/e;->k:LFg/a;

    invoke-virtual {p2, p1}, Lgg/i;->U0(Lgg/f;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LKc/e;->o:Lgg/i;

    return-void
.end method

.method public static synthetic c(LKc/e;Lgg/h;)V
    .locals 0

    invoke-static {p0, p1}, LKc/e;->r(LKc/e;Lgg/h;)V

    return-void
.end method

.method public static synthetic d(LKc/e;)V
    .locals 0

    invoke-static {p0}, LKc/e;->u(LKc/e;)V

    return-void
.end method

.method public static synthetic e(Ljava/lang/Throwable;)Ll9/a;
    .locals 0

    invoke-static {p0}, LKc/e;->t(Ljava/lang/Throwable;)Ll9/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(LKc/e;)V
    .locals 0

    invoke-direct {p0}, LKc/e;->m()V

    return-void
.end method

.method public static final synthetic g(LKc/e;)J
    .locals 2

    iget-wide v0, p0, LKc/e;->g:J

    return-wide v0
.end method

.method public static final synthetic h(LKc/e;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, LKc/e;->h:Ljava/util/Set;

    return-object p0
.end method

.method public static final synthetic i(LKc/e;)LKc/a$a;
    .locals 0

    iget-object p0, p0, LKc/e;->a:LKc/a$a;

    return-object p0
.end method

.method public static final synthetic j(LKc/e;I)V
    .locals 0

    invoke-direct {p0, p1}, LKc/e;->q(I)V

    return-void
.end method

.method public static final synthetic k(LKc/e;Ljava/lang/String;)Lgg/z;
    .locals 0

    invoke-direct {p0, p1}, LKc/e;->s(Ljava/lang/String;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic l(LKc/e;Z)V
    .locals 0

    invoke-direct {p0, p1}, LKc/e;->v(Z)V

    return-void
.end method

.method private final m()V
    .locals 2

    iget-object v0, p0, LKc/e;->k:LFg/a;

    iget-object v1, p0, LKc/e;->h:Ljava/util/Set;

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method private final n()V
    .locals 2

    iget-object v0, p0, LKc/e;->j:LFg/a;

    invoke-direct {p0}, LKc/e;->o()LKc/a$c;

    move-result-object v1

    invoke-virtual {v0, v1}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method private final o()LKc/a$c;
    .locals 7

    new-instance v6, LKc/a$c;

    iget-object v0, p0, LKc/e;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    invoke-direct {p0}, LKc/e;->p()Z

    move-result v2

    iget-object v0, p0, LKc/e;->f:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v3

    iget-wide v4, p0, LKc/e;->g:J

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LKc/a$c;-><init>(ZZIJ)V

    return-object v6
.end method

.method private final p()Z
    .locals 4

    iget-object v0, p0, LKc/e;->f:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    int-to-long v0, v0

    iget-wide v2, p0, LKc/e;->g:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final q(I)V
    .locals 1

    iget-object v0, p0, LKc/e;->f:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    invoke-direct {p0}, LKc/e;->n()V

    return-void
.end method

.method private static final r(LKc/e;Lgg/h;)V
    .locals 4

    const-string v0, "emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LKc/e;->i:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v0

    iget-wide v2, p0, LKc/e;->d:J

    cmp-long p0, v0, v2

    if-gtz p0, :cond_0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-interface {p1, p0}, Lgg/h;->h(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lgg/h;->a()V

    :goto_0
    return-void
.end method

.method private final s(Ljava/lang/String;)Lgg/z;
    .locals 1

    new-instance v0, LKc/e$d;

    invoke-direct {v0, p1, p0}, LKc/e$d;-><init>(Ljava/lang/String;LKc/e;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LKc/b;

    invoke-direct {v0}, LKc/b;-><init>()V

    invoke-virtual {p1, v0}, Lgg/z;->G(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string v0, "onErrorReturn(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final t(Ljava/lang/Throwable;)Ll9/a;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Ll9/a;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p0
.end method

.method private static final u(LKc/e;)V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LKc/e;->v(Z)V

    iget-object p0, p0, LKc/e;->a:LKc/a$a;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ICMP Subnet scan "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " DISPOSED"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method private final v(Z)V
    .locals 1

    iget-object v0, p0, LKc/e;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-direct {p0}, LKc/e;->n()V

    return-void
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, LKc/e;->n:Lgg/i;

    return-object v0
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, LKc/e;->o:Lgg/i;

    return-object v0
.end method
