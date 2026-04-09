.class public abstract Lcom/ui/wifiman/ui/settings/preferences/s;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ui/wifiman/ui/settings/preferences/s;->c(ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(LT/l;I)V
    .locals 11

    const v0, -0x79ffbe99

    invoke-interface {p0, v0}, LT/l;->r(I)LT/l;

    move-result-object p0

    if-nez p1, :cond_1

    invoke-interface {p0}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, LT/l;->C()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.settings.preferences.TeleportQuickActionExplanationRemoveUi (TeleportQuickActionExplanationRemoveUi.kt:30)"

    invoke-static {v0, p1, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    invoke-static {}, Lxe/B;->K()LT/H0;

    move-result-object v0

    invoke-interface {p0, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxe/f$b;

    sget-object v1, Lla/a;->a:Lla/a;

    sget v2, Lla/a;->b:I

    invoke-virtual {v1, p0, v2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a;->e()Lma/a$e;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$e;->b()J

    move-result-wide v2

    new-instance v1, Lcom/ui/wifiman/ui/settings/preferences/s$a;

    invoke-direct {v1, v0}, Lcom/ui/wifiman/ui/settings/preferences/s$a;-><init>(Lxe/f$b;)V

    const/16 v0, 0x36

    const v4, 0x459eb2e1

    const/4 v5, 0x1

    invoke-static {v4, v5, v1, p0, v0}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v4

    sget-object v0, Lcom/ui/wifiman/ui/settings/preferences/i;->a:Lcom/ui/wifiman/ui/settings/preferences/i;

    invoke-virtual {v0}, Lcom/ui/wifiman/ui/settings/preferences/i;->a()Lmh/q;

    move-result-object v7

    const v9, 0x30180

    const/16 v10, 0x19

    const/4 v1, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v8, p0

    invoke-static/range {v1 .. v10}, LFe/g;->b(Landroidx/compose/ui/e;JLmh/q;ZFLmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    :goto_1
    invoke-interface {p0}, LT/l;->z()LT/X0;

    move-result-object p0

    if-eqz p0, :cond_4

    new-instance v0, Lcom/ui/wifiman/ui/settings/preferences/r;

    invoke-direct {v0, p1}, Lcom/ui/wifiman/ui/settings/preferences/r;-><init>(I)V

    invoke-interface {p0, v0}, LT/X0;->a(Lmh/p;)V

    :cond_4
    return-void
.end method

.method private static final c(ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, LT/L0;->a(I)I

    move-result p0

    invoke-static {p1, p0}, Lcom/ui/wifiman/ui/settings/preferences/s;->b(LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
