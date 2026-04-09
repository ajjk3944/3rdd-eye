.class public interface abstract LT/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/f0;
.implements LT/q0;


# virtual methods
.method public abstract a()J
.end method

.method public getValue()Ljava/lang/Long;
    .locals 2

    .line 2
    invoke-interface {p0}, LT/o0;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getValue()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-interface {p0}, LT/o0;->getValue()Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public abstract m(J)V
.end method

.method public setValue(J)V
    .locals 0

    .line 2
    invoke-interface {p0, p1, p2}, LT/o0;->m(J)V

    return-void
.end method

.method public bridge synthetic setValue(Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-interface {p0, v0, v1}, LT/o0;->setValue(J)V

    return-void
.end method
