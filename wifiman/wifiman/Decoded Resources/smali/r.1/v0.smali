.class public interface abstract Lr/v0;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract a()Z
.end method

.method public abstract b(Lr/q;Lr/q;Lr/q;)J
.end method

.method public abstract c(JLr/q;Lr/q;Lr/q;)Lr/q;
.end method

.method public d(Lr/q;Lr/q;Lr/q;)Lr/q;
    .locals 6

    invoke-interface {p0, p1, p2, p3}, Lr/v0;->b(Lr/q;Lr/q;Lr/q;)J

    move-result-wide v1

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-interface/range {v0 .. v5}, Lr/v0;->f(JLr/q;Lr/q;Lr/q;)Lr/q;

    move-result-object p1

    return-object p1
.end method

.method public abstract f(JLr/q;Lr/q;Lr/q;)Lr/q;
.end method
