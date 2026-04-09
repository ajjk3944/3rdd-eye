.class public abstract LTi/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:I

.field private static final b:LNi/C;

.field private static final c:LNi/C;

.field private static final d:LNi/C;

.field private static final e:LNi/C;

.field private static final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    const/16 v4, 0xc

    const/4 v5, 0x0

    const-string v0, "kotlinx.coroutines.semaphore.maxSpinCycles"

    const/16 v1, 0x64

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, LNi/D;->g(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result v0

    sput v0, LTi/j;->a:I

    new-instance v0, LNi/C;

    const-string v1, "PERMIT"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    sput-object v0, LTi/j;->b:LNi/C;

    new-instance v0, LNi/C;

    const-string v1, "TAKEN"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    sput-object v0, LTi/j;->c:LNi/C;

    new-instance v0, LNi/C;

    const-string v1, "BROKEN"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    sput-object v0, LTi/j;->d:LNi/C;

    new-instance v0, LNi/C;

    const-string v1, "CANCELLED"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    sput-object v0, LTi/j;->e:LNi/C;

    const/16 v6, 0xc

    const/4 v7, 0x0

    const-string v2, "kotlinx.coroutines.semaphore.segmentSize"

    const/16 v3, 0x10

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, LNi/D;->g(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result v0

    sput v0, LTi/j;->f:I

    return-void
.end method

.method public static final synthetic a(JLTi/k;)LTi/k;
    .locals 0

    invoke-static {p0, p1, p2}, LTi/j;->h(JLTi/k;)LTi/k;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b()LNi/C;
    .locals 1

    sget-object v0, LTi/j;->d:LNi/C;

    return-object v0
.end method

.method public static final synthetic c()LNi/C;
    .locals 1

    sget-object v0, LTi/j;->e:LNi/C;

    return-object v0
.end method

.method public static final synthetic d()I
    .locals 1

    sget v0, LTi/j;->a:I

    return v0
.end method

.method public static final synthetic e()LNi/C;
    .locals 1

    sget-object v0, LTi/j;->b:LNi/C;

    return-object v0
.end method

.method public static final synthetic f()I
    .locals 1

    sget v0, LTi/j;->f:I

    return v0
.end method

.method public static final synthetic g()LNi/C;
    .locals 1

    sget-object v0, LTi/j;->c:LNi/C;

    return-object v0
.end method

.method private static final h(JLTi/k;)LTi/k;
    .locals 2

    new-instance v0, LTi/k;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, LTi/k;-><init>(JLTi/k;I)V

    return-object v0
.end method
