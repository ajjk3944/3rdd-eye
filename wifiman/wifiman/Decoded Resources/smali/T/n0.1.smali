.class public interface abstract LT/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/W;
.implements LT/q0;


# virtual methods
.method public abstract e()I
.end method

.method public getValue()Ljava/lang/Integer;
    .locals 1

    .line 2
    invoke-interface {p0}, LT/n0;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getValue()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-interface {p0}, LT/n0;->getValue()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public abstract l(I)V
.end method

.method public setValue(I)V
    .locals 0

    .line 2
    invoke-interface {p0, p1}, LT/n0;->l(I)V

    return-void
.end method

.method public bridge synthetic setValue(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-interface {p0, p1}, LT/n0;->setValue(I)V

    return-void
.end method
