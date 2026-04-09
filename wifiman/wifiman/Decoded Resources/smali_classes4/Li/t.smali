.class abstract synthetic LLi/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x1

    const v1, 0x7fffffff

    const-string v2, "kotlinx.coroutines.flow.defaultConcurrency"

    const/16 v3, 0x10

    invoke-static {v2, v3, v0, v1}, LNi/D;->b(Ljava/lang/String;III)I

    move-result v0

    sput v0, LLi/t;->a:I

    return-void
.end method

.method public static final a(LLi/g;Lmh/p;)LLi/g;
    .locals 2

    new-instance v0, LLi/t$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LLi/t$a;-><init>(Lmh/p;Ldh/e;)V

    invoke-static {p0, v0}, LLi/i;->O(LLi/g;Lmh/q;)LLi/g;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/lang/Iterable;)LLi/g;
    .locals 8

    new-instance v7, LMi/i;

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, v7

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, LMi/i;-><init>(Ljava/lang/Iterable;Ldh/i;ILKi/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7
.end method

.method public static final varargs c([LLi/g;)LLi/g;
    .locals 0

    invoke-static {p0}, LZg/n;->P([Ljava/lang/Object;)Ljava/lang/Iterable;

    move-result-object p0

    invoke-static {p0}, LLi/i;->F(Ljava/lang/Iterable;)LLi/g;

    move-result-object p0

    return-object p0
.end method

.method public static final d(LLi/g;Lmh/q;)LLi/g;
    .locals 9

    new-instance v8, LMi/h;

    const/16 v6, 0x1c

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v8

    move-object v1, p1

    move-object v2, p0

    invoke-direct/range {v0 .. v7}, LMi/h;-><init>(Lmh/q;LLi/g;Ldh/i;ILKi/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v8
.end method
