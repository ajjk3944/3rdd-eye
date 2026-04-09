.class public abstract LIi/E0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LNi/C;

.field public static final b:LNi/C;

.field private static final c:LNi/C;

.field private static final d:LNi/C;

.field private static final e:LNi/C;

.field private static final f:LIi/h0;

.field private static final g:LIi/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LNi/C;

    const-string v1, "COMPLETING_ALREADY"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    sput-object v0, LIi/E0;->a:LNi/C;

    new-instance v0, LNi/C;

    const-string v1, "COMPLETING_WAITING_CHILDREN"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    sput-object v0, LIi/E0;->b:LNi/C;

    new-instance v0, LNi/C;

    const-string v1, "COMPLETING_RETRY"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    sput-object v0, LIi/E0;->c:LNi/C;

    new-instance v0, LNi/C;

    const-string v1, "TOO_LATE_TO_CANCEL"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    sput-object v0, LIi/E0;->d:LNi/C;

    new-instance v0, LNi/C;

    const-string v1, "SEALED"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    sput-object v0, LIi/E0;->e:LNi/C;

    new-instance v0, LIi/h0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LIi/h0;-><init>(Z)V

    sput-object v0, LIi/E0;->f:LIi/h0;

    new-instance v0, LIi/h0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LIi/h0;-><init>(Z)V

    sput-object v0, LIi/E0;->g:LIi/h0;

    return-void
.end method

.method public static final synthetic a()LNi/C;
    .locals 1

    sget-object v0, LIi/E0;->a:LNi/C;

    return-object v0
.end method

.method public static final synthetic b()LNi/C;
    .locals 1

    sget-object v0, LIi/E0;->c:LNi/C;

    return-object v0
.end method

.method public static final synthetic c()LIi/h0;
    .locals 1

    sget-object v0, LIi/E0;->g:LIi/h0;

    return-object v0
.end method

.method public static final synthetic d()LIi/h0;
    .locals 1

    sget-object v0, LIi/E0;->f:LIi/h0;

    return-object v0
.end method

.method public static final synthetic e()LNi/C;
    .locals 1

    sget-object v0, LIi/E0;->e:LNi/C;

    return-object v0
.end method

.method public static final synthetic f()LNi/C;
    .locals 1

    sget-object v0, LIi/E0;->d:LNi/C;

    return-object v0
.end method

.method public static final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p0, LIi/u0;

    if-eqz v0, :cond_0

    new-instance v0, LIi/v0;

    check-cast p0, LIi/u0;

    invoke-direct {v0, p0}, LIi/v0;-><init>(LIi/u0;)V

    move-object p0, v0

    :cond_0
    return-object p0
.end method

.method public static final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p0, LIi/v0;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, LIi/v0;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    iget-object v0, v0, LIi/v0;->a:LIi/u0;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object p0, v0

    :cond_2
    :goto_1
    return-object p0
.end method
