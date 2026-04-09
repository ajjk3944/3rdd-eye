.class public final Lq5/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq5/f$b;
    }
.end annotation


# static fields
.field public static final c:Lq5/f$b;

.field private static final d:Lph/c;


# instance fields
.field private final a:Lq5/h;

.field private final b:Lq5/h;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lq5/f$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lq5/f$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lq5/f;->c:Lq5/f$b;

    sget-object v0, Lo5/w;->a:Lo5/w;

    invoke-virtual {v0}, Lo5/w;->b()Ljava/lang/String;

    move-result-object v1

    new-instance v2, LP1/b;

    sget-object v0, Lq5/f$a;->a:Lq5/f$a;

    invoke-direct {v2, v0}, LP1/b;-><init>(Lmh/l;)V

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LQ1/a;->b(Ljava/lang/String;LP1/b;Lmh/l;LIi/N;ILjava/lang/Object;)Lph/c;

    move-result-object v0

    sput-object v0, Lq5/f;->d:Lph/c;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ldh/i;Ldh/i;Lg5/e;Lo5/b;)V
    .locals 9

    .line 4
    new-instance v0, Lq5/b;

    invoke-direct {v0, p1}, Lq5/b;-><init>(Landroid/content/Context;)V

    .line 5
    new-instance v7, Lq5/c;

    .line 6
    new-instance v8, Lq5/d;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, v8

    move-object v2, p5

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lq5/d;-><init>(Lo5/b;Ldh/i;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    sget-object p2, Lq5/f;->c:Lq5/f$b;

    invoke-static {p2, p1}, Lq5/f$b;->a(Lq5/f$b;Landroid/content/Context;)LO1/e;

    move-result-object v6

    move-object v1, v7

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, v8

    .line 8
    invoke-direct/range {v1 .. v6}, Lq5/c;-><init>(Ldh/i;Lg5/e;Lo5/b;Lq5/a;LO1/e;)V

    .line 9
    invoke-direct {p0, v0, v7}, Lq5/f;-><init>(Lq5/h;Lq5/h;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/firebase/f;Ldh/i;Ldh/i;Lg5/e;)V
    .locals 7

    const-string/jumbo v0, "firebaseApp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "blockingDispatcher"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "backgroundDispatcher"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "firebaseInstallationsApi"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-virtual {p1}, Lcom/google/firebase/f;->k()Landroid/content/Context;

    move-result-object v2

    const-string/jumbo v0, "firebaseApp.applicationContext"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    sget-object v0, Lo5/A;->a:Lo5/A;

    invoke-virtual {v0, p1}, Lo5/A;->b(Lcom/google/firebase/f;)Lo5/b;

    move-result-object v6

    move-object v1, p0

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    .line 12
    invoke-direct/range {v1 .. v6}, Lq5/f;-><init>(Landroid/content/Context;Ldh/i;Ldh/i;Lg5/e;Lo5/b;)V

    return-void
.end method

.method public constructor <init>(Lq5/h;Lq5/h;)V
    .locals 1

    const-string/jumbo v0, "localOverrideSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "remoteSettings"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lq5/f;->a:Lq5/h;

    .line 3
    iput-object p2, p0, Lq5/f;->b:Lq5/h;

    return-void
.end method

.method public static final synthetic a()Lph/c;
    .locals 1

    sget-object v0, Lq5/f;->d:Lph/c;

    return-object v0
.end method

.method private final e(D)Z
    .locals 4

    const-wide/16 v0, 0x0

    cmpg-double v0, v0, p1

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    cmpg-double p1, p1, v2

    if-gtz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method private final f(J)Z
    .locals 1

    invoke-static {p1, p2}, LAi/a;->T(J)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1, p2}, LAi/a;->J(J)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public final b()D
    .locals 3

    iget-object v0, p0, Lq5/f;->a:Lq5/h;

    invoke-interface {v0}, Lq5/h;->c()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lq5/f;->e(D)Z

    move-result v2

    if-eqz v2, :cond_0

    return-wide v0

    :cond_0
    iget-object v0, p0, Lq5/f;->b:Lq5/h;

    invoke-interface {v0}, Lq5/h;->c()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lq5/f;->e(D)Z

    move-result v2

    if-eqz v2, :cond_1

    return-wide v0

    :cond_1
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    return-wide v0
.end method

.method public final c()J
    .locals 3

    iget-object v0, p0, Lq5/f;->a:Lq5/h;

    invoke-interface {v0}, Lq5/h;->b()LAi/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LAi/a;->g0()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lq5/f;->f(J)Z

    move-result v2

    if-eqz v2, :cond_0

    return-wide v0

    :cond_0
    iget-object v0, p0, Lq5/f;->b:Lq5/h;

    invoke-interface {v0}, Lq5/h;->b()LAi/a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LAi/a;->g0()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lq5/f;->f(J)Z

    move-result v2

    if-eqz v2, :cond_1

    return-wide v0

    :cond_1
    sget-object v0, LAi/a;->b:LAi/a$a;

    const/16 v0, 0x1e

    sget-object v1, LAi/d;->MINUTES:LAi/d;

    invoke-static {v0, v1}, LAi/c;->s(ILAi/d;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final d()Z
    .locals 1

    iget-object v0, p0, Lq5/f;->a:Lq5/h;

    invoke-interface {v0}, Lq5/h;->a()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lq5/f;->b:Lq5/h;

    invoke-interface {v0}, Lq5/h;->a()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public final g(Ldh/e;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, Lq5/f$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lq5/f$c;

    iget v1, v0, Lq5/f$c;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lq5/f$c;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lq5/f$c;

    invoke-direct {v0, p0, p1}, Lq5/f$c;-><init>(Lq5/f;Ldh/e;)V

    :goto_0
    iget-object p1, v0, Lq5/f$c;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lq5/f$c;->d:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lq5/f$c;->a:Ljava/lang/Object;

    check-cast v2, Lq5/f;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lq5/f;->a:Lq5/h;

    iput-object p0, v0, Lq5/f$c;->a:Ljava/lang/Object;

    iput v4, v0, Lq5/f$c;->d:I

    invoke-interface {p1, v0}, Lq5/h;->d(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    move-object v2, p0

    :goto_1
    iget-object p1, v2, Lq5/f;->b:Lq5/h;

    const/4 v2, 0x0

    iput-object v2, v0, Lq5/f$c;->a:Ljava/lang/Object;

    iput v3, v0, Lq5/f$c;->d:I

    invoke-interface {p1, v0}, Lq5/h;->d(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
