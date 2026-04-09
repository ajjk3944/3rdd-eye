.class public abstract LDe/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDe/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(LDe/d;LT/l;I)V
    .locals 3

    const v0, -0x8225333

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.component.label.IconBadge.Compose (IconBadge.kt:23)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p0}, LDe/d;->e()I

    move-result v0

    and-int/lit8 p2, p2, 0xe

    invoke-interface {p0, p1, p2}, LDe/d;->b(LT/l;I)J

    move-result-wide v1

    const/4 p0, 0x0

    invoke-static {v1, v2, v0, p1, p0}, LDe/f;->b(JILT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface {p1}, LT/l;->J()V

    return-void
.end method
