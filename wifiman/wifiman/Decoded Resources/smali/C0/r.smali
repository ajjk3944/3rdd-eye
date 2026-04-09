.class public interface abstract LC0/r;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic c0(LC0/r;LC0/r;ZILjava/lang/Object;)Ll0/i;
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    :cond_0
    invoke-interface {p0, p1, p2}, LC0/r;->J(LC0/r;Z)Ll0/i;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: localBoundingBoxOf"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract A(J)J
.end method

.method public abstract J(LC0/r;Z)Ll0/i;
.end method

.method public abstract M()Z
.end method

.method public abstract O([F)V
.end method

.method public abstract V(LC0/r;JZ)J
.end method

.method public abstract W(J)J
.end method

.method public abstract a0()LC0/r;
.end method

.method public abstract b0(LC0/r;J)J
.end method

.method public abstract h()J
.end method

.method public abstract o0(J)J
.end method

.method public abstract r(J)J
.end method

.method public abstract z(LC0/r;[F)V
.end method
