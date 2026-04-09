.class public abstract LAg/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lmh/l;

.field private static final b:Lmh/l;

.field private static final c:Lmh/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, LAg/f$c;->a:LAg/f$c;

    sput-object v0, LAg/f;->a:Lmh/l;

    sget-object v0, LAg/f$b;->a:LAg/f$b;

    sput-object v0, LAg/f;->b:Lmh/l;

    sget-object v0, LAg/f$a;->a:LAg/f$a;

    sput-object v0, LAg/f;->c:Lmh/a;

    return-void
.end method

.method private static final a(Lmh/l;)Lkg/f;
    .locals 1

    sget-object v0, LAg/f;->a:Lmh/l;

    if-ne p0, v0, :cond_0

    invoke-static {}, Lmg/a;->e()Lkg/f;

    move-result-object p0

    const-string v0, "Functions.emptyConsumer()"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    if-eqz p0, :cond_1

    new-instance v0, LAg/h;

    invoke-direct {v0, p0}, LAg/h;-><init>(Lmh/l;)V

    move-object p0, v0

    :cond_1
    check-cast p0, Lkg/f;

    :goto_0
    return-object p0
.end method

.method private static final b(Lmh/a;)Lkg/a;
    .locals 1

    sget-object v0, LAg/f;->c:Lmh/a;

    if-ne p0, v0, :cond_0

    sget-object p0, Lmg/a;->c:Lkg/a;

    const-string v0, "Functions.EMPTY_ACTION"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    if-eqz p0, :cond_1

    new-instance v0, LAg/g;

    invoke-direct {v0, p0}, LAg/g;-><init>(Lmh/a;)V

    move-object p0, v0

    :cond_1
    check-cast p0, Lkg/a;

    :goto_0
    return-object p0
.end method

.method private static final c(Lmh/l;)Lkg/f;
    .locals 1

    sget-object v0, LAg/f;->b:Lmh/l;

    if-ne p0, v0, :cond_0

    sget-object p0, Lmg/a;->f:Lkg/f;

    const-string v0, "Functions.ON_ERROR_MISSING"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    if-eqz p0, :cond_1

    new-instance v0, LAg/h;

    invoke-direct {v0, p0}, LAg/h;-><init>(Lmh/l;)V

    move-object p0, v0

    :cond_1
    check-cast p0, Lkg/f;

    :goto_0
    return-object p0
.end method

.method public static final d(Lgg/b;Lmh/l;Lmh/a;)Lhg/c;
    .locals 2

    const-string v0, "$this$subscribeBy"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onError"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onComplete"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LAg/f;->b:Lmh/l;

    if-ne p1, v0, :cond_0

    sget-object v1, LAg/f;->c:Lmh/a;

    if-ne p2, v1, :cond_0

    invoke-virtual {p0}, Lgg/b;->S()Lhg/c;

    move-result-object p0

    const-string p1, "subscribe()"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    if-ne p1, v0, :cond_1

    new-instance p1, LAg/g;

    invoke-direct {p1, p2}, LAg/g;-><init>(Lmh/a;)V

    invoke-virtual {p0, p1}, Lgg/b;->T(Lkg/a;)Lhg/c;

    move-result-object p0

    const-string p1, "subscribe(onComplete)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-static {p2}, LAg/f;->b(Lmh/a;)Lkg/a;

    move-result-object p2

    new-instance v0, LAg/h;

    invoke-direct {v0, p1}, LAg/h;-><init>(Lmh/l;)V

    invoke-virtual {p0, p2, v0}, Lgg/b;->U(Lkg/a;Lkg/f;)Lhg/c;

    move-result-object p0

    const-string p1, "subscribe(onComplete.asO\u2026ion(), Consumer(onError))"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p0
.end method

.method public static final e(Lgg/i;Lmh/l;Lmh/a;Lmh/l;)Lhg/c;
    .locals 1

    const-string v0, "$this$subscribeBy"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onError"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onComplete"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3}, LAg/f;->a(Lmh/l;)Lkg/f;

    move-result-object p3

    invoke-static {p1}, LAg/f;->c(Lmh/l;)Lkg/f;

    move-result-object p1

    invoke-static {p2}, LAg/f;->b(Lmh/a;)Lkg/a;

    move-result-object p2

    invoke-virtual {p0, p3, p1, p2}, Lgg/i;->C1(Lkg/f;Lkg/f;Lkg/a;)Lhg/c;

    move-result-object p0

    const-string p1, "subscribe(onNext.asConsu\u2026ete.asOnCompleteAction())"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final f(Lgg/s;Lmh/l;Lmh/a;Lmh/l;)Lhg/c;
    .locals 1

    const-string v0, "$this$subscribeBy"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onError"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onComplete"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3}, LAg/f;->a(Lmh/l;)Lkg/f;

    move-result-object p3

    invoke-static {p1}, LAg/f;->c(Lmh/l;)Lkg/f;

    move-result-object p1

    invoke-static {p2}, LAg/f;->b(Lmh/a;)Lkg/a;

    move-result-object p2

    invoke-virtual {p0, p3, p1, p2}, Lgg/s;->K0(Lkg/f;Lkg/f;Lkg/a;)Lhg/c;

    move-result-object p0

    const-string p1, "subscribe(onNext.asConsu\u2026ete.asOnCompleteAction())"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static synthetic g(Lgg/b;Lmh/l;Lmh/a;ILjava/lang/Object;)Lhg/c;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    sget-object p1, LAg/f;->b:Lmh/l;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    sget-object p2, LAg/f;->c:Lmh/a;

    :cond_1
    invoke-static {p0, p1, p2}, LAg/f;->d(Lgg/b;Lmh/l;Lmh/a;)Lhg/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lgg/i;Lmh/l;Lmh/a;Lmh/l;ILjava/lang/Object;)Lhg/c;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    sget-object p1, LAg/f;->b:Lmh/l;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    sget-object p2, LAg/f;->c:Lmh/a;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    sget-object p3, LAg/f;->a:Lmh/l;

    :cond_2
    invoke-static {p0, p1, p2, p3}, LAg/f;->e(Lgg/i;Lmh/l;Lmh/a;Lmh/l;)Lhg/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lgg/s;Lmh/l;Lmh/a;Lmh/l;ILjava/lang/Object;)Lhg/c;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    sget-object p1, LAg/f;->b:Lmh/l;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    sget-object p2, LAg/f;->c:Lmh/a;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    sget-object p3, LAg/f;->a:Lmh/l;

    :cond_2
    invoke-static {p0, p1, p2, p3}, LAg/f;->f(Lgg/s;Lmh/l;Lmh/a;Lmh/l;)Lhg/c;

    move-result-object p0

    return-object p0
.end method
