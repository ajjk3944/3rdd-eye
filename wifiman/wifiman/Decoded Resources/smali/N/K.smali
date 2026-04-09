.class final LN/K;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LN/K;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN/K;

    invoke-direct {v0}, LN/K;-><init>()V

    sput-object v0, LN/K;->a:LN/K;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ly/j;)Lr/i;
    .locals 1

    instance-of v0, p1, Ly/o$b;

    if-eqz v0, :cond_0

    invoke-static {}, LN/L;->a()Lr/r0;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ly/b;

    if-eqz v0, :cond_1

    invoke-static {}, LN/L;->a()Lr/r0;

    move-result-object p1

    goto :goto_0

    :cond_1
    instance-of v0, p1, Ly/g;

    if-eqz v0, :cond_2

    invoke-static {}, LN/L;->a()Lr/r0;

    move-result-object p1

    goto :goto_0

    :cond_2
    instance-of p1, p1, Ly/d;

    if-eqz p1, :cond_3

    invoke-static {}, LN/L;->a()Lr/r0;

    move-result-object p1

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final b(Ly/j;)Lr/i;
    .locals 1

    instance-of v0, p1, Ly/o$b;

    if-eqz v0, :cond_0

    invoke-static {}, LN/L;->b()Lr/r0;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ly/b;

    if-eqz v0, :cond_1

    invoke-static {}, LN/L;->b()Lr/r0;

    move-result-object p1

    goto :goto_0

    :cond_1
    instance-of v0, p1, Ly/g;

    if-eqz v0, :cond_2

    invoke-static {}, LN/L;->c()Lr/r0;

    move-result-object p1

    goto :goto_0

    :cond_2
    instance-of p1, p1, Ly/d;

    if-eqz p1, :cond_3

    invoke-static {}, LN/L;->b()Lr/r0;

    move-result-object p1

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
