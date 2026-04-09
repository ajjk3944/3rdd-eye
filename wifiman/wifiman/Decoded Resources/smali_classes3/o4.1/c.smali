.class public abstract Lo4/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lo4/p;)Lo4/n;
    .locals 0

    invoke-interface {p0}, Lo4/p;->b()LA4/C;

    move-result-object p0

    invoke-static {p0}, Lo4/n;->e(LA4/C;)Lo4/n;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lo4/n;Lo4/q;)V
    .locals 0

    invoke-virtual {p0}, Lo4/n;->h()LA4/C;

    move-result-object p0

    invoke-interface {p1, p0}, Lo4/q;->a(LA4/C;)V

    return-void
.end method
