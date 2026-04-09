.class public final Lpa/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lpa/a;

.field private static final b:LQ0/k;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    new-instance v0, Lpa/a;

    invoke-direct {v0}, Lpa/a;-><init>()V

    sput-object v0, Lpa/a;->a:Lpa/a;

    sget v1, Lp9/a;->d:I

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LQ0/p;->b(ILQ0/A;IIILjava/lang/Object;)LQ0/j;

    move-result-object v0

    sget v1, Lp9/a;->b:I

    sget-object v7, LQ0/A;->b:LQ0/A$a;

    invoke-virtual {v7}, LQ0/A$a;->b()LQ0/A;

    move-result-object v2

    const/16 v5, 0xc

    invoke-static/range {v1 .. v6}, LQ0/p;->b(ILQ0/A;IIILjava/lang/Object;)LQ0/j;

    move-result-object v1

    sget v8, Lp9/a;->c:I

    invoke-virtual {v7}, LQ0/A$a;->c()LQ0/A;

    move-result-object v9

    const/16 v12, 0xc

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, LQ0/p;->b(ILQ0/A;IIILjava/lang/Object;)LQ0/j;

    move-result-object v2

    sget v8, Lp9/a;->a:I

    invoke-virtual {v7}, LQ0/A$a;->a()LQ0/A;

    move-result-object v9

    invoke-static/range {v8 .. v13}, LQ0/p;->b(ILQ0/A;IIILjava/lang/Object;)LQ0/j;

    move-result-object v3

    const/4 v4, 0x4

    new-array v4, v4, [LQ0/j;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    aput-object v1, v4, v0

    const/4 v0, 0x2

    aput-object v2, v4, v0

    const/4 v0, 0x3

    aput-object v3, v4, v0

    invoke-static {v4}, LQ0/l;->a([LQ0/j;)LQ0/k;

    move-result-object v0

    sput-object v0, Lpa/a;->b:LQ0/k;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LQ0/k;
    .locals 1

    sget-object v0, Lpa/a;->b:LQ0/k;

    return-object v0
.end method
