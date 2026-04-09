.class public final LCc/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCc/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LCc/p$a;,
        LCc/p$b;
    }
.end annotation


# instance fields
.field private final a:LOb/a;

.field private final b:La8/a;

.field private final c:Lgg/i;

.field private final d:Lgg/i;

.field private final e:Lgg/i;

.field private final f:Lgg/i;

.field private final g:Lgg/i;

.field private final h:Lgg/i;


# direct methods
.method public constructor <init>(LOb/a;LDc/e;Lle/g;Lwc/h;Lcom/ui/wifiman/model/bluetooth/le/a;Lmc/a;)V
    .locals 3

    const-string v0, "deviceConfigDao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networkDiscovery"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wifiScan"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bluetoothScan"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bleCommonCharacteristics"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "androidDeviceInfo"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCc/p;->a:LOb/a;

    new-instance v0, La8/a;

    invoke-direct {v0}, La8/a;-><init>()V

    iput-object v0, p0, LCc/p;->b:La8/a;

    invoke-interface {p1}, LOb/a;->c()Lgg/i;

    move-result-object p1

    new-instance v0, LCc/p$d;

    invoke-direct {v0, p0}, LCc/p$d;-><init>(LCc/p;)V

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string v1, "refCount(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LCc/p;->c:Lgg/i;

    invoke-interface {p2}, LDc/e;->b()Lgg/i;

    move-result-object p2

    invoke-interface {p3}, Lle/g;->a()Lgg/i;

    move-result-object p3

    sget-object v2, Lwc/f;->BLE:Lwc/f;

    invoke-interface {p4, v2}, Lwc/h;->a(Lwc/f;)Lgg/i;

    move-result-object p4

    sget-object v2, LCc/p$c;->a:LCc/p$c;

    invoke-static {p2, p3, p4, v2}, Lgg/i;->u(LDj/a;LDj/a;LDj/a;Lkg/g;)Lgg/i;

    move-result-object p2

    const-wide/16 p3, 0x3e8

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p2, p3, p4, v2}, Lgg/i;->S1(JLjava/util/concurrent/TimeUnit;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->e1()Lgg/i;

    move-result-object p2

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p3

    const/4 p4, 0x0

    invoke-virtual {p2, p3, p4, v0}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p2

    const-string p3, "observeOn(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LCc/p;->d:Lgg/i;

    sget-object p3, LCc/p$g;->a:LCc/p$g;

    invoke-virtual {p2, p3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p3

    invoke-virtual {p3}, Lgg/i;->W()Lgg/i;

    move-result-object p3

    invoke-virtual {p3, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p3

    invoke-virtual {p3}, Ljg/a;->i2()Lgg/i;

    move-result-object p3

    invoke-static {p3, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, LCc/p;->e:Lgg/i;

    sget-object p4, LCc/p$h;->a:LCc/p$h;

    invoke-virtual {p3, p4}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p3

    invoke-virtual {p3}, Lgg/i;->W()Lgg/i;

    move-result-object p3

    new-instance p4, LCc/p$i;

    invoke-direct {p4, p0}, LCc/p$i;-><init>(LCc/p;)V

    invoke-virtual {p3, p4}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p3

    const-string p4, "switchMap(...)"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, LCc/p;->f:Lgg/i;

    new-instance p3, LCc/p$j;

    invoke-direct {p3, p6}, LCc/p$j;-><init>(Lmc/a;)V

    invoke-static {p3}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p3

    const-string p4, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p4, LCc/p$f;

    invoke-direct {p4, p0}, LCc/p$f;-><init>(LCc/p;)V

    invoke-virtual {p3, p4}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p3

    invoke-virtual {p3}, Lgg/i;->W()Lgg/i;

    move-result-object p3

    invoke-virtual {p3, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p3

    invoke-virtual {p3}, Ljg/a;->i2()Lgg/i;

    move-result-object p3

    invoke-static {p3, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, LCc/p;->g:Lgg/i;

    invoke-interface {p5}, Lcom/ui/wifiman/model/bluetooth/le/a;->b()Lgg/i;

    move-result-object p3

    new-instance p4, LCc/p$e;

    invoke-direct {p4, p0}, LCc/p$e;-><init>(LCc/p;)V

    invoke-static {p2, p1, p3, p4}, Lgg/i;->u(LDj/a;LDj/a;LDj/a;Lkg/g;)Lgg/i;

    move-result-object p1

    const-string p2, "combineLatest(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-class p2, La8/a;

    invoke-virtual {p1, p2}, Lgg/i;->n(Ljava/lang/Class;)Lgg/i;

    move-result-object p1

    const-string p2, "cast(R::class.java)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LCc/p;->h:Lgg/i;

    return-void
.end method

.method public static synthetic d(La8/b;)LCc/p$b;
    .locals 0

    invoke-static {p0}, LCc/p;->m(La8/b;)LCc/p$b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(LCc/p;La8/a;Ljava/lang/Object;Lmh/l;Lmh/p;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LCc/p;->l(La8/a;Ljava/lang/Object;Lmh/l;Lmh/p;)V

    return-void
.end method

.method public static final synthetic f(LCc/p;)La8/a;
    .locals 0

    iget-object p0, p0, LCc/p;->b:La8/a;

    return-object p0
.end method

.method public static final synthetic g(LCc/p;)LOb/a;
    .locals 0

    iget-object p0, p0, LCc/p;->a:LOb/a;

    return-object p0
.end method

.method public static final synthetic h(LCc/p;)Lgg/i;
    .locals 0

    iget-object p0, p0, LCc/p;->e:Lgg/i;

    return-object p0
.end method

.method public static final synthetic i(LCc/p;)Lgg/i;
    .locals 0

    iget-object p0, p0, LCc/p;->f:Lgg/i;

    return-object p0
.end method

.method public static final synthetic j(LCc/p;LCc/l;)LOb/c;
    .locals 0

    invoke-direct {p0, p1}, LCc/p;->n(LCc/l;)LOb/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic k(LCc/p;LOb/c;)LCc/l;
    .locals 0

    invoke-direct {p0, p1}, LCc/p;->o(LOb/c;)LCc/l;

    move-result-object p0

    return-object p0
.end method

.method private final l(La8/a;Ljava/lang/Object;Lmh/l;Lmh/p;)V
    .locals 1

    invoke-interface {p3, p2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, La8/b;

    if-eqz p3, :cond_0

    new-instance v0, LCc/o;

    invoke-direct {v0, p3}, LCc/o;-><init>(La8/b;)V

    invoke-virtual {p1, p3, v0}, La8/a;->b(La8/b;Lmh/a;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p4, p1, p2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private static final m(La8/b;)LCc/p$b;
    .locals 10

    new-instance v9, LCc/p$b;

    const/16 v7, 0x3e

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, v9

    move-object v1, p0

    invoke-direct/range {v0 .. v8}, LCc/p$b;-><init>(La8/b;Ljava/util/TreeSet;LDc/j;Lwc/a;Lcom/ui/wifiman/model/bluetooth/le/a$a;LCc/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9
.end method

.method private final n(LCc/l;)LOb/c;
    .locals 9

    invoke-virtual {p1}, LCc/l;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, LCc/l;->f()Lh9/a;

    move-result-object v0

    const-string v2, ""

    invoke-virtual {v0, v2}, Lh9/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, LCc/l;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    move-object v0, v3

    :cond_0
    move-object v4, v0

    goto :goto_0

    :cond_1
    move-object v4, v3

    :goto_0
    invoke-virtual {p1}, LCc/l;->g()J

    move-result-wide v5

    new-instance p1, LOb/c;

    const/4 v3, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v8}, LOb/c;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method private final o(LOb/c;)LCc/l;
    .locals 9

    sget-object v0, Lh9/a;->b:Lh9/a$b;

    invoke-virtual {p1}, LOb/c;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lh9/a$b;->e(Ljava/lang/String;)Lh9/a;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    new-instance v0, LCc/l;

    invoke-virtual {p1}, LOb/c;->c()Ljava/lang/String;

    move-result-object v3

    sget-object v1, La8/b;->c:La8/b$a;

    invoke-virtual {v1, v5}, La8/b$a;->b(Lh9/a;)La8/b;

    move-result-object v4

    invoke-virtual {p1}, LOb/c;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, LOb/c;->e()J

    move-result-wide v7

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, LCc/l;-><init>(Ljava/lang/String;La8/b;Lh9/a;Ljava/lang/String;J)V

    return-object v0
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, LCc/p;->h:Lgg/i;

    return-object v0
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, LCc/p;->g:Lgg/i;

    return-object v0
.end method

.method public c(Lh9/a;Lmh/l;)Lgg/b;
    .locals 2

    const-string v0, "mac"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updater"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LCc/p;->c:Lgg/i;

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, LCc/p$k;

    invoke-direct {v1, p1}, LCc/p$k;-><init>(Lh9/a;)V

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v0

    new-instance v1, LCc/p$l;

    invoke-direct {v1, p0, p2, p1}, LCc/p$l;-><init>(LCc/p;Lmh/l;Lh9/a;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string p2, "flatMapCompletable(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
