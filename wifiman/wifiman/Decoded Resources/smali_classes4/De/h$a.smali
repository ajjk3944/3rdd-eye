.class public abstract LDe/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDe/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(LDe/h;LT/l;I)V
    .locals 3

    const v0, 0x530e9a8d

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.component.label.Tag.Compose (Tag.kt:20)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p0}, LDe/h;->a()Ls9/d;

    move-result-object p0

    const/4 p2, 0x0

    invoke-static {p0, p1, p2}, LDe/j;->b(Ls9/d;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface {p1}, LT/l;->J()V

    return-void
.end method
