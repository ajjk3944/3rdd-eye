.class public final LCd/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCd/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LCd/g$a;,
        LCd/g$b;
    }
.end annotation


# static fields
.field public static final k:LCd/g$a;


# instance fields
.field private a:LKa/f$a;

.field private final b:LFg/a;

.field private final c:LFg/a;

.field private d:Ljava/util/concurrent/ConcurrentLinkedQueue;

.field private final e:Lgg/i;

.field private final f:Lgg/i;

.field private final g:Lgg/i;

.field private final h:Lgg/i;

.field private final i:Lgg/i;

.field private final j:Lgg/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LCd/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LCd/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LCd/g;->k:LCd/g$a;

    return-void
.end method

.method public constructor <init>(LDc/e;Ltd/d;)V
    .locals 5

    const-string v0, "networkDiscovery"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "speedtestApiFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p2}, Ltd/d;->a()LKa/f$a;

    move-result-object p2

    iput-object p2, p0, LCd/g;->a:LKa/f$a;

    new-instance p2, Ll9/a;

    const/4 v0, 0x0

    invoke-direct {p2, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {p2}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p2

    const-string v0, "createDefault(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LCd/g;->b:LFg/a;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, LCd/g;->c:LFg/a;

    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, LCd/g;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p2}, Lgg/i;->e1()Lgg/i;

    move-result-object p2

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {p2, v0, v2, v3}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p2

    invoke-virtual {p2, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p2

    invoke-virtual {p2}, Ljg/a;->i2()Lgg/i;

    move-result-object p2

    const-string v0, "refCount(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LCd/g;->e:Lgg/i;

    invoke-virtual {v1}, Lgg/i;->e1()Lgg/i;

    move-result-object v1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v4

    invoke-virtual {v1, v4, v2, v3}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object v1

    invoke-virtual {v1, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v1

    invoke-virtual {v1}, Ljg/a;->i2()Lgg/i;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, LCd/g;->f:Lgg/i;

    new-instance v2, LCd/g$d;

    invoke-direct {v2}, LCd/g$d;-><init>()V

    invoke-static {v2}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v2

    const-string v4, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, LCd/g$e;

    invoke-direct {v4, p1}, LCd/g$e;-><init>(LDc/e;)V

    invoke-virtual {v2, v4}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    sget-object v2, LCd/g$f;->a:LCd/g$f;

    invoke-virtual {p1, v2}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LCd/g;->g:Lgg/i;

    sget-object v2, LCd/g$g;->a:LCd/g$g;

    invoke-static {p1, p2, v1, v2}, Lgg/i;->u(LDj/a;LDj/a;LDj/a;Lkg/g;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    invoke-virtual {v1, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v1

    invoke-virtual {v1}, Ljg/a;->i2()Lgg/i;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, LCd/g;->h:Lgg/i;

    new-instance v1, LCd/g$c;

    invoke-direct {v1, p0}, LCd/g$c;-><init>(LCd/g;)V

    invoke-virtual {p2, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p2

    invoke-virtual {p2}, Ljg/a;->i2()Lgg/i;

    move-result-object p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LCd/g;->i:Lgg/i;

    new-instance p2, LCd/g$h;

    invoke-direct {p2, p0}, LCd/g$h;-><init>(LCd/g;)V

    invoke-virtual {p1, p2}, Lgg/i;->L1(Lkg/n;)Lgg/b;

    move-result-object p1

    invoke-virtual {p1}, Lgg/b;->f0()Lgg/s;

    move-result-object p1

    invoke-virtual {p1, v3}, Lgg/s;->x0(I)LBg/a;

    move-result-object p1

    invoke-virtual {p1}, LBg/a;->l1()Lgg/s;

    move-result-object p1

    invoke-virtual {p1}, Lgg/s;->f0()Lgg/b;

    move-result-object p1

    const-string p2, "ignoreElements(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LCd/g;->j:Lgg/b;

    return-void
.end method

.method public static final synthetic c(LCd/g;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, LCd/g;->h(J)V

    return-void
.end method

.method public static final synthetic d(LCd/g;)Ljava/util/concurrent/ConcurrentLinkedQueue;
    .locals 0

    iget-object p0, p0, LCd/g;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    return-object p0
.end method

.method public static final synthetic e(LCd/g;)LKa/f$a;
    .locals 0

    iget-object p0, p0, LCd/g;->a:LKa/f$a;

    return-object p0
.end method

.method public static final synthetic f(LCd/g;)LFg/a;
    .locals 0

    iget-object p0, p0, LCd/g;->b:LFg/a;

    return-object p0
.end method

.method public static final synthetic g(LCd/g;)LFg/a;
    .locals 0

    iget-object p0, p0, LCd/g;->c:LFg/a;

    return-object p0
.end method

.method private final h(J)V
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, LCd/g;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    new-instance v3, LWc/c;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-direct {v3, v0, v1, p1}, LWc/c;-><init>(JLjava/lang/Object;)V

    invoke-virtual {v2, v3}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    :goto_0
    iget-object p1, p0, LCd/g;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->peek()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast p1, LWc/c;

    invoke-virtual {p1}, LWc/c;->c()J

    move-result-wide p1

    const-wide/32 v2, 0x88b8

    sub-long v2, v0, v2

    cmp-long p1, p1, v2

    if-gez p1, :cond_0

    iget-object p1, p0, LCd/g;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public a()Lgg/b;
    .locals 1

    iget-object v0, p0, LCd/g;->j:Lgg/b;

    return-object v0
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, LCd/g;->i:Lgg/i;

    return-object v0
.end method

.method public getState()Lgg/i;
    .locals 1

    iget-object v0, p0, LCd/g;->h:Lgg/i;

    return-object v0
.end method
