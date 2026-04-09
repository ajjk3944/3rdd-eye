.class public final Lo5/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/sessions/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo5/B$a;
    }
.end annotation


# static fields
.field public static final g:Lo5/B$a;

.field private static final h:D


# instance fields
.field private final b:Lcom/google/firebase/f;

.field private final c:Lg5/e;

.field private final d:Lq5/f;

.field private final e:Lo5/h;

.field private final f:Ldh/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo5/B$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo5/B$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lo5/B;->g:Lo5/B$a;

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    sput-wide v0, Lo5/B;->h:D

    return-void
.end method

.method public constructor <init>(Lcom/google/firebase/f;Lg5/e;Lq5/f;Lo5/h;Ldh/i;)V
    .locals 1

    const-string/jumbo v0, "firebaseApp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "firebaseInstallations"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "sessionSettings"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "eventGDTLogger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "backgroundDispatcher"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo5/B;->b:Lcom/google/firebase/f;

    iput-object p2, p0, Lo5/B;->c:Lg5/e;

    iput-object p3, p0, Lo5/B;->d:Lq5/f;

    iput-object p4, p0, Lo5/B;->e:Lo5/h;

    iput-object p5, p0, Lo5/B;->f:Ldh/i;

    return-void
.end method

.method public static final synthetic b(Lo5/B;Lo5/z;)V
    .locals 0

    invoke-direct {p0, p1}, Lo5/B;->g(Lo5/z;)V

    return-void
.end method

.method public static final synthetic c(Lo5/B;)Lcom/google/firebase/f;
    .locals 0

    iget-object p0, p0, Lo5/B;->b:Lcom/google/firebase/f;

    return-object p0
.end method

.method public static final synthetic d(Lo5/B;)Lg5/e;
    .locals 0

    iget-object p0, p0, Lo5/B;->c:Lg5/e;

    return-object p0
.end method

.method public static final synthetic e(Lo5/B;)Lq5/f;
    .locals 0

    iget-object p0, p0, Lo5/B;->d:Lq5/f;

    return-object p0
.end method

.method public static final synthetic f(Lo5/B;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lo5/B;->i(Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final g(Lo5/z;)V
    .locals 2

    const-string/jumbo v0, "SessionFirelogPublisher"

    :try_start_0
    iget-object v1, p0, Lo5/B;->e:Lo5/h;

    invoke-interface {v1, p1}, Lo5/h;->a(Lo5/z;)V

    const-string/jumbo p1, "Successfully logged Session Start event."

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string/jumbo v1, "Error logging Session Start event to DataTransport: "

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method private final h()Z
    .locals 4

    sget-wide v0, Lo5/B;->h:D

    iget-object v2, p0, Lo5/B;->d:Lq5/f;

    invoke-virtual {v2}, Lq5/f;->b()D

    move-result-wide v2

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final i(Ldh/e;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, Lo5/B$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lo5/B$c;

    iget v1, v0, Lo5/B$c;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lo5/B$c;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lo5/B$c;

    invoke-direct {v0, p0, p1}, Lo5/B$c;-><init>(Lo5/B;Ldh/e;)V

    :goto_0
    iget-object p1, v0, Lo5/B$c;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lo5/B$c;->d:I

    const-string/jumbo v3, "SessionFirelogPublisher"

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, Lo5/B$c;->a:Ljava/lang/Object;

    check-cast v0, Lo5/B;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    const-string p1, "Data Collection is enabled for at least one Subscriber"

    invoke-static {v3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lo5/B;->d:Lq5/f;

    iput-object p0, v0, Lo5/B$c;->a:Ljava/lang/Object;

    iput v4, v0, Lo5/B$c;->d:I

    invoke-virtual {p1, v0}, Lq5/f;->g(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    iget-object p1, v0, Lo5/B;->d:Lq5/f;

    invoke-virtual {p1}, Lq5/f;->d()Z

    move-result p1

    const/4 v1, 0x0

    if-nez p1, :cond_4

    const-string/jumbo p1, "Sessions SDK disabled. Events will not be sent."

    invoke-static {v3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-direct {v0}, Lo5/B;->h()Z

    move-result p1

    if-nez p1, :cond_5

    const-string/jumbo p1, "Sessions SDK has dropped this session due to sampling."

    invoke-static {v3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_5
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a(Lo5/y;)V
    .locals 7

    const-string/jumbo v0, "sessionDetails"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lo5/B;->f:Ldh/i;

    invoke-static {v0}, LIi/O;->a(Ldh/i;)LIi/N;

    move-result-object v1

    new-instance v4, Lo5/B$b;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lo5/B$b;-><init>(Lo5/B;Lo5/y;Ldh/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    return-void
.end method
