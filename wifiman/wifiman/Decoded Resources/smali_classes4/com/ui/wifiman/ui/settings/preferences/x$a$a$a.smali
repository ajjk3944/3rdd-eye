.class final Lcom/ui/wifiman/ui/settings/preferences/x$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/settings/preferences/x$a$a;->a(Lz/j;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LCi/c;

.field final synthetic b:Lcom/ui/wifiman/ui/settings/preferences/u;


# direct methods
.method constructor <init>(LCi/c;Lcom/ui/wifiman/ui/settings/preferences/u;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/settings/preferences/x$a$a$a;->a:LCi/c;

    iput-object p2, p0, Lcom/ui/wifiman/ui/settings/preferences/x$a$a$a;->b:Lcom/ui/wifiman/ui/settings/preferences/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/ui/wifiman/ui/settings/preferences/u;Lcom/ui/wifiman/ui/settings/preferences/t;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/ui/settings/preferences/x$a$a$a;->c(Lcom/ui/wifiman/ui/settings/preferences/u;Lcom/ui/wifiman/ui/settings/preferences/t;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lcom/ui/wifiman/ui/settings/preferences/u;Lcom/ui/wifiman/ui/settings/preferences/t;)LYg/J;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/ui/settings/preferences/t;->e()LT7/c;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/ui/settings/preferences/u;->o0(LT7/c;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(LA9/i;LT/l;I)V
    .locals 8

    const-string v0, "$this$UiSettingsCard"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.settings.preferences.UnitSystemConfigUi.<anonymous>.<anonymous>.<anonymous> (UnitSystemConfigUi.kt:62)"

    const v1, -0x49fa284f

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object v3, p0, Lcom/ui/wifiman/ui/settings/preferences/x$a$a$a;->a:LCi/c;

    const p1, 0x1b94fff5

    invoke-interface {p2, p1}, LT/l;->U(I)V

    iget-object p1, p0, Lcom/ui/wifiman/ui/settings/preferences/x$a$a$a;->b:Lcom/ui/wifiman/ui/settings/preferences/u;

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p1

    iget-object p3, p0, Lcom/ui/wifiman/ui/settings/preferences/x$a$a$a;->b:Lcom/ui/wifiman/ui/settings/preferences/u;

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    if-nez p1, :cond_1

    sget-object p1, LT/l;->a:LT/l$a;

    invoke-virtual {p1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p1

    if-ne v0, p1, :cond_2

    :cond_1
    new-instance v0, Lcom/ui/wifiman/ui/settings/preferences/w;

    invoke-direct {v0, p3}, Lcom/ui/wifiman/ui/settings/preferences/w;-><init>(Lcom/ui/wifiman/ui/settings/preferences/u;)V

    invoke-interface {p2, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    move-object v4, v0

    check-cast v4, Lmh/l;

    invoke-interface {p2}, LT/l;->J()V

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v2, 0x0

    move-object v5, p2

    invoke-static/range {v2 .. v7}, LF9/F;->c(Landroidx/compose/ui/e;LCi/c;Lmh/l;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LA9/i;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/settings/preferences/x$a$a$a;->b(LA9/i;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
