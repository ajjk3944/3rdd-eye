.class public abstract LTi/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LNi/C;

.field private static final b:LNi/C;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LNi/C;

    const-string v1, "NO_OWNER"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    sput-object v0, LTi/g;->a:LNi/C;

    new-instance v0, LNi/C;

    const-string v1, "ALREADY_LOCKED_BY_OWNER"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    sput-object v0, LTi/g;->b:LNi/C;

    return-void
.end method

.method public static final a(Z)LTi/a;
    .locals 1

    new-instance v0, LTi/f;

    invoke-direct {v0, p0}, LTi/f;-><init>(Z)V

    return-object v0
.end method

.method public static synthetic b(ZILjava/lang/Object;)LTi/a;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, LTi/g;->a(Z)LTi/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c()LNi/C;
    .locals 1

    sget-object v0, LTi/g;->a:LNi/C;

    return-object v0
.end method
