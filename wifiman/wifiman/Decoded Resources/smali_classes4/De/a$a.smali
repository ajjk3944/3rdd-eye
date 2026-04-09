.class public abstract LDe/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDe/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(LDe/a;LT/l;I)V
    .locals 10

    const v0, -0x207421d3

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.component.label.Badge.Compose (Badge.kt:28)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p0}, LDe/a;->a()Ls9/d;

    move-result-object v6

    invoke-interface {p0}, LDe/a;->d()Z

    move-result v5

    and-int/lit8 p2, p2, 0xe

    invoke-interface {p0, p1, p2}, LDe/a;->b(LT/l;I)J

    move-result-wide v3

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v7, p1

    invoke-static/range {v3 .. v9}, LDe/c;->b(JZLs9/d;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface {p1}, LT/l;->J()V

    return-void
.end method

.method public static b(LDe/a;)Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method
