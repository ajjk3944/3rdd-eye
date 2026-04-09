.class public abstract Ly8/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/ubnt/usurvey/product/m$c;

.field private final b:Lgg/y;

.field private final c:LTe/L;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget-object v0, Lcom/ubnt/usurvey/product/m$c;->NORMAL:Lcom/ubnt/usurvey/product/m$c;

    iput-object v0, p0, Ly8/f;->a:Lcom/ubnt/usurvey/product/m$c;

    .line 4
    sget-object v0, Lm9/c;->a:Lm9/c;

    const-string/jumbo v1, "signalMapperChart"

    invoke-virtual {v0, v1}, Lm9/c;->h(Ljava/lang/String;)Lgg/y;

    move-result-object v0

    iput-object v0, p0, Ly8/f;->b:Lgg/y;

    .line 5
    new-instance v0, LTe/L;

    const/4 v1, 0x0

    const v2, 0x46ea6000    # 30000.0f

    invoke-direct {v0, v1, v2}, LTe/L;-><init>(FF)V

    iput-object v0, p0, Ly8/f;->c:LTe/L;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ly8/f;-><init>()V

    return-void
.end method

.method public static final synthetic c(Ly8/f;)Lgg/y;
    .locals 0

    iget-object p0, p0, Ly8/f;->b:Lgg/y;

    return-object p0
.end method


# virtual methods
.method protected final d()Lcom/ubnt/usurvey/product/m$c;
    .locals 1

    iget-object v0, p0, Ly8/f;->a:Lcom/ubnt/usurvey/product/m$c;

    return-object v0
.end method

.method protected final e()LTe/L;
    .locals 1

    iget-object v0, p0, Ly8/f;->c:LTe/L;

    return-object v0
.end method

.method protected final f(JLy8/a;F)LTe/I;
    .locals 3

    const-string/jumbo v0, "marker"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p3, Ly8/a$a;

    if-eqz v0, :cond_1

    check-cast p3, Ly8/a$a;

    invoke-virtual {p3}, Ly8/a$a;->a()J

    move-result-wide v0

    invoke-virtual {p0, p1, p2, v0, v1}, Ly8/f;->h(JJ)F

    move-result p1

    invoke-virtual {p3}, Ly8/a$a;->b()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    new-instance p3, Ls9/d$c;

    invoke-direct {p3, p2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    new-instance p3, Ls9/d$b;

    const p2, 0x7f11024e

    invoke-direct {p3, p2}, Ls9/d$b;-><init>(I)V

    :goto_0
    new-instance p2, LTe/I$b;

    invoke-direct {p2, p1, p4, p3}, LTe/I$b;-><init>(FFLs9/d;)V

    goto :goto_1

    :cond_1
    instance-of v0, p3, Ly8/a$c;

    if-eqz v0, :cond_2

    new-instance v0, LTe/I$a;

    check-cast p3, Ly8/a$c;

    invoke-virtual {p3}, Ly8/a$c;->a()J

    move-result-wide v1

    invoke-virtual {p0, p1, p2, v1, v2}, Ly8/f;->h(JJ)F

    move-result p1

    new-instance p2, Ls9/d$c;

    invoke-virtual {p3}, Ly8/a$c;->b()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    invoke-direct {v0, p1, p4, p2}, LTe/I$a;-><init>(FFLs9/d;)V

    move-object p2, v0

    :goto_1
    return-object p2

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method protected final g(Lgg/i;)Lgg/i;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ly8/f$a;

    invoke-direct {v0, p0}, Ly8/f$a;-><init>(Ly8/f;)V

    invoke-virtual {p1, v0}, Lgg/i;->x(Lgg/m;)Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "compose(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method protected final h(JJ)F
    .locals 2

    const-wide/16 v0, 0x7530

    sub-long/2addr v0, p1

    add-long/2addr v0, p3

    long-to-float p1, v0

    return p1
.end method
