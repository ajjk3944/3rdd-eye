.class public interface abstract Lw/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic b(Lw/m;Ls/L;Lmh/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_0

    sget-object p1, Ls/L;->Default:Ls/L;

    :cond_0
    invoke-interface {p0, p1, p2, p3}, Lw/m;->a(Ls/L;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: drag"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract a(Ls/L;Lmh/p;Ldh/e;)Ljava/lang/Object;
.end method
