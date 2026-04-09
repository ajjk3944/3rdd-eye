.class public abstract LLi/P;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LNi/C;

.field private static final b:LNi/C;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LNi/C;

    const-string v1, "NONE"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    sput-object v0, LLi/P;->a:LNi/C;

    new-instance v0, LNi/C;

    const-string v1, "PENDING"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    sput-object v0, LLi/P;->b:LNi/C;

    return-void
.end method

.method public static final a(Ljava/lang/Object;)LLi/z;
    .locals 1

    new-instance v0, LLi/O;

    if-nez p0, :cond_0

    sget-object p0, LMi/r;->a:LNi/C;

    :cond_0
    invoke-direct {v0, p0}, LLi/O;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static final synthetic b()LNi/C;
    .locals 1

    sget-object v0, LLi/P;->a:LNi/C;

    return-object v0
.end method

.method public static final synthetic c()LNi/C;
    .locals 1

    sget-object v0, LLi/P;->b:LNi/C;

    return-object v0
.end method

.method public static final d(LLi/N;Ldh/i;ILKi/a;)LLi/g;
    .locals 1

    if-ltz p2, :cond_0

    const/4 v0, 0x2

    if-ge p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, -0x2

    if-ne p2, v0, :cond_1

    :goto_0
    sget-object v0, LKi/a;->DROP_OLDEST:LKi/a;

    if-ne p3, v0, :cond_1

    return-object p0

    :cond_1
    invoke-static {p0, p1, p2, p3}, LLi/F;->e(LLi/D;Ldh/i;ILKi/a;)LLi/g;

    move-result-object p0

    return-object p0
.end method
