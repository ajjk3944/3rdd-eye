.class public final Lhd/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhd/c$a;,
        Lhd/c$b;
    }
.end annotation


# static fields
.field public static final g:Lhd/c$b;


# instance fields
.field private a:LFg/a;

.field private b:Ljava/util/concurrent/LinkedBlockingQueue;

.field private final c:Lgg/i;

.field private final d:Lgg/i;

.field private final e:Lgg/b;

.field private final f:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lhd/c$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lhd/c$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lhd/c;->g:Lhd/c$b;

    return-void
.end method

.method public constructor <init>(Lje/u;LBc/a;)V
    .locals 2

    const-string v0, "wifiConnectionService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cellularSignalService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-static {v0}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object v0

    const-string v1, "createDefault(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lhd/c;->a:LFg/a;

    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v0, p0, Lhd/c;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-interface {p1}, Lje/u;->a()Lgg/i;

    move-result-object p1

    sget-object v0, Lhd/c$e;->a:Lhd/c$e;

    invoke-virtual {p1, v0}, Lgg/i;->X(Lkg/c;)Lgg/i;

    move-result-object p1

    new-instance v0, Lhd/c$f;

    invoke-direct {v0, p0}, Lhd/c$f;-><init>(Lhd/c;)V

    invoke-virtual {p1, v0}, Lgg/i;->m0(Lkg/p;)Lgg/i;

    move-result-object p1

    const-string v0, "filter(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lhd/c;->c:Lgg/i;

    invoke-interface {p2}, LBc/a;->a()Lgg/i;

    move-result-object p2

    sget-object v0, Lhd/c$c;->a:Lhd/c$c;

    invoke-static {p1, p2, v0}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const-string p2, "distinctUntilChanged(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lhd/c;->d:Lgg/i;

    const/4 p2, 0x0

    const/4 v0, 0x1

    invoke-static {p1, p2, v0, p2}, LI5/b;->b(Lgg/i;Ljava/lang/Object;ILjava/lang/Object;)Lgg/i;

    move-result-object p1

    new-instance p2, Lhd/b;

    invoke-direct {p2, p0}, Lhd/b;-><init>(Lhd/c;)V

    invoke-virtual {p1, p2}, Lgg/i;->r1(Lkg/b;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->E0()Lgg/b;

    move-result-object p1

    const-string p2, "ignoreElements(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lhd/c;->e:Lgg/b;

    iget-object p2, p0, Lhd/c;->a:LFg/a;

    invoke-virtual {p2, p1}, Lgg/i;->U0(Lgg/f;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v1, v0}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    new-instance p2, Lhd/c$d;

    invoke-direct {p2, p0}, Lhd/c$d;-><init>(Lhd/c;)V

    invoke-virtual {p1, p2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lhd/c;->f:Lgg/i;

    return-void
.end method

.method public static synthetic c(Lhd/c;Lhd/c$a;Lhd/c$a;)Lhd/c$a;
    .locals 0

    invoke-static {p0, p1, p2}, Lhd/c;->i(Lhd/c;Lhd/c$a;Lhd/c$a;)Lhd/c$a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lhd/c;)Ljava/util/concurrent/LinkedBlockingQueue;
    .locals 0

    iget-object p0, p0, Lhd/c;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    return-object p0
.end method

.method public static final synthetic e(Lhd/c;Lje/r;)Z
    .locals 0

    invoke-direct {p0, p1}, Lhd/c;->h(Lje/r;)Z

    move-result p0

    return p0
.end method

.method private final f(Lhd/a$d;Lhd/a$d;)Lhd/a;
    .locals 13

    instance-of v0, p2, Lhd/a$d$a$b;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    instance-of v0, p1, Lhd/a$d$a$b;

    if-eqz v0, :cond_1

    move-object v5, p1

    check-cast v5, Lhd/a$d$a$b;

    invoke-virtual {v5}, Lhd/a$d$a$b;->a()Lje/r$b$a;

    move-result-object v0

    invoke-virtual {v0}, Lje/r$b$a;->i()Lke/c;

    move-result-object v0

    move-object v10, p2

    check-cast v10, Lhd/a$d$a$b;

    invoke-virtual {v10}, Lhd/a$d$a$b;->a()Lje/r$b$a;

    move-result-object p2

    invoke-virtual {p2}, Lje/r$b$a;->i()Lke/c;

    move-result-object p2

    invoke-static {v0, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    new-instance v1, Lhd/a$a$b;

    const/4 v11, 0x1

    const/4 v12, 0x0

    const-wide/16 v7, 0x0

    move-object v6, v1

    move-object v9, p1

    invoke-direct/range {v6 .. v12}, Lhd/a$a$b;-><init>(JLhd/a$d;Lhd/a$d$a$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_4

    :cond_0
    invoke-virtual {v5}, Lhd/a$d$a$b;->a()Lje/r$b$a;

    move-result-object p1

    invoke-virtual {p1}, Lje/r$b$a;->c()Lh9/a;

    move-result-object p1

    invoke-virtual {v10}, Lhd/a$d$a$b;->a()Lje/r$b$a;

    move-result-object p2

    invoke-virtual {p2}, Lje/r$b$a;->c()Lh9/a;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    new-instance v1, Lhd/a$a$c;

    const/4 v7, 0x1

    const/4 v8, 0x0

    const-wide/16 v3, 0x0

    move-object v2, v1

    move-object v6, v10

    invoke-direct/range {v2 .. v8}, Lhd/a$a$c;-><init>(JLhd/a$d$a$b;Lhd/a$d$a$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_4

    :cond_1
    instance-of v0, p1, Lhd/a$d$a$a;

    if-nez v0, :cond_3

    instance-of v0, p1, Lhd/a$d$b;

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    :goto_0
    new-instance v7, Lhd/a$a$b;

    move-object v4, p2

    check-cast v4, Lhd/a$d$a$b;

    const/4 v5, 0x1

    const/4 v6, 0x0

    const-wide/16 v1, 0x0

    move-object v0, v7

    move-object v3, p1

    invoke-direct/range {v0 .. v6}, Lhd/a$a$b;-><init>(JLhd/a$d;Lhd/a$d$a$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_1
    move-object v1, v7

    goto :goto_4

    :cond_4
    instance-of v0, p2, Lhd/a$d$a$a;

    if-eqz v0, :cond_8

    instance-of v0, p1, Lhd/a$d$b;

    if-nez v0, :cond_7

    instance-of v0, p1, Lhd/a$d$a$b;

    if-eqz v0, :cond_5

    goto :goto_2

    :cond_5
    instance-of p1, p1, Lhd/a$d$a$a;

    if-eqz p1, :cond_6

    goto :goto_4

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    :goto_2
    new-instance v7, Lhd/a$a$a;

    move-object v4, p2

    check-cast v4, Lhd/a$d$a$a;

    const/4 v5, 0x1

    const/4 v6, 0x0

    const-wide/16 v1, 0x0

    move-object v0, v7

    move-object v3, p1

    invoke-direct/range {v0 .. v6}, Lhd/a$a$a;-><init>(JLhd/a$d;Lhd/a$d$a$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_8
    instance-of p2, p2, Lhd/a$d$b;

    if-eqz p2, :cond_d

    instance-of p2, p1, Lhd/a$d$b;

    if-eqz p2, :cond_9

    goto :goto_4

    :cond_9
    instance-of p2, p1, Lhd/a$d$a$a;

    if-eqz p2, :cond_a

    new-instance p2, Lhd/a$b;

    move-object v3, p1

    check-cast v3, Lhd/a$d$a;

    const/4 v4, 0x1

    const/4 v5, 0x0

    const-wide/16 v1, 0x0

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Lhd/a$b;-><init>(JLhd/a$d$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_3
    move-object v1, p2

    goto :goto_4

    :cond_a
    instance-of p2, p1, Lhd/a$d$a$b;

    if-eqz p2, :cond_c

    new-instance p2, Lhd/a$b;

    move-object v3, p1

    check-cast v3, Lhd/a$d$a;

    const/4 v4, 0x1

    const/4 v5, 0x0

    const-wide/16 v1, 0x0

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Lhd/a$b;-><init>(JLhd/a$d$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_3

    :cond_b
    :goto_4
    return-object v1

    :cond_c
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_d
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final g(Lhd/a;)V
    .locals 2

    iget-object v0, p0, Lhd/c;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lhd/c;->a:LFg/a;

    sget-object v1, LYg/J;->a:LYg/J;

    invoke-virtual {v0, v1}, LFg/a;->h(Ljava/lang/Object;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AP_ROAMING - NEW EVENT - "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p1, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method private final h(Lje/r;)Z
    .locals 2

    instance-of v0, p1, Lje/r$a;

    const/4 v1, 0x1

    if-nez v0, :cond_3

    instance-of v0, p1, Lje/r$b$b;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lje/r$b$a;

    if-eqz v0, :cond_2

    check-cast p1, Lje/r$b$a;

    invoke-virtual {p1}, Lje/r$b$a;->c()Lh9/a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lje/r$b$a;->h()LS8/l;

    move-result-object p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    goto :goto_0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    :goto_0
    return v1
.end method

.method private static final i(Lhd/c;Lhd/c$a;Lhd/c$a;)Lhd/c$a;
    .locals 1

    const-string v0, "previous"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "current"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lhd/c$a;->a()Lhd/a$d;

    move-result-object p1

    invoke-virtual {p2}, Lhd/c$a;->a()Lhd/a$d;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lhd/c;->f(Lhd/a$d;Lhd/a$d;)Lhd/a;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Lhd/c;->g(Lhd/a;)V

    :cond_0
    return-object p2
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Lhd/c;->f:Lgg/i;

    return-object v0
.end method

.method public b()Lgg/b;
    .locals 1

    iget-object v0, p0, Lhd/c;->e:Lgg/b;

    return-object v0
.end method
