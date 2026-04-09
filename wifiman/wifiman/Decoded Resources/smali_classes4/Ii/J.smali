.class public abstract LIi/J;
.super Ldh/a;
.source "SourceFile"

# interfaces
.implements Ldh/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LIi/J$a;
    }
.end annotation


# static fields
.field public static final b:LIi/J$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LIi/J$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LIi/J$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LIi/J;->b:LIi/J$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Ldh/f;->m0:Ldh/f$b;

    invoke-direct {p0, v0}, Ldh/a;-><init>(Ldh/i$c;)V

    return-void
.end method

.method public static synthetic o0(LIi/J;ILjava/lang/String;ILjava/lang/Object;)LIi/J;
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LIi/J;->n0(ILjava/lang/String;)LIi/J;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: limitedParallelism"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final C(Ldh/e;)V
    .locals 1

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LNi/g;

    invoke-virtual {p1}, LNi/g;->o()V

    return-void
.end method

.method public abstract Y(Ldh/i;Ljava/lang/Runnable;)V
.end method

.method public b0(Ldh/i;Ljava/lang/Runnable;)V
    .locals 0

    invoke-static {p0, p1, p2}, LNi/h;->c(LIi/J;Ldh/i;Ljava/lang/Runnable;)V

    return-void
.end method

.method public get(Ldh/i$c;)Ldh/i$b;
    .locals 0

    invoke-static {p0, p1}, Ldh/f$a;->a(Ldh/f;Ldh/i$c;)Ldh/i$b;

    move-result-object p1

    return-object p1
.end method

.method public m0(Ldh/i;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public minusKey(Ldh/i$c;)Ldh/i;
    .locals 0

    invoke-static {p0, p1}, Ldh/f$a;->b(Ldh/f;Ldh/i$c;)Ldh/i;

    move-result-object p1

    return-object p1
.end method

.method public n0(ILjava/lang/String;)LIi/J;
    .locals 1

    invoke-static {p1}, LNi/k;->a(I)V

    new-instance v0, LNi/j;

    invoke-direct {v0, p0, p1, p2}, LNi/j;-><init>(LIi/J;ILjava/lang/String;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, LIi/S;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, LIi/S;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final y(Ldh/e;)Ldh/e;
    .locals 1

    new-instance v0, LNi/g;

    invoke-direct {v0, p0, p1}, LNi/g;-><init>(LIi/J;Ldh/e;)V

    return-object v0
.end method
