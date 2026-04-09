.class public abstract LH0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LT/l;I)Landroid/content/res/Resources;
    .locals 3

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.ui.res.resources (Resources.android.kt:33)"

    const v2, 0x5ca0ff57

    invoke-static {v2, p1, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f()LT/H0;

    move-result-object p1

    invoke-interface {p0, p1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->g()LT/H0;

    move-result-object p1

    invoke-interface {p0, p1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    return-object p0
.end method
