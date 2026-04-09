.class public abstract LIi/U;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Z

.field private static final b:LIi/X;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "kotlinx.coroutines.main.delay"

    const/4 v1, 0x0

    invoke-static {v0, v1}, LNi/D;->f(Ljava/lang/String;Z)Z

    move-result v0

    sput-boolean v0, LIi/U;->a:Z

    invoke-static {}, LIi/U;->b()LIi/X;

    move-result-object v0

    sput-object v0, LIi/U;->b:LIi/X;

    return-void
.end method

.method public static final a()LIi/X;
    .locals 1

    sget-object v0, LIi/U;->b:LIi/X;

    return-object v0
.end method

.method private static final b()LIi/X;
    .locals 2

    sget-boolean v0, LIi/U;->a:Z

    if-nez v0, :cond_0

    sget-object v0, LIi/T;->i:LIi/T;

    return-object v0

    :cond_0
    invoke-static {}, LIi/c0;->c()LIi/H0;

    move-result-object v0

    invoke-static {v0}, LNi/s;->c(LIi/H0;)Z

    move-result v1

    if-nez v1, :cond_2

    instance-of v1, v0, LIi/X;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast v0, LIi/X;

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v0, LIi/T;->i:LIi/T;

    :goto_1
    return-object v0
.end method
