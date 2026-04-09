.class final Lcom/ui/wifiman/ui/settings/preferences/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/ui/settings/preferences/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/ui/settings/preferences/f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/ui/settings/preferences/f$a;

    invoke-direct {v0}, Lcom/ui/wifiman/ui/settings/preferences/f$a;-><init>()V

    sput-object v0, Lcom/ui/wifiman/ui/settings/preferences/f$a;->a:Lcom/ui/wifiman/ui/settings/preferences/f$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 19

    move-object/from16 v14, p1

    move/from16 v0, p2

    and-int/lit8 v1, v0, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    invoke-interface/range {p1 .. p1}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LT/l;->C()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.settings.preferences.ComposableSingletons$AppPreferencesUiKt.lambda-1.<anonymous> (AppPreferencesUi.kt:41)"

    const v3, -0x89e0b95

    invoke-static {v3, v0, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    invoke-static {}, Lxe/B;->K()LT/H0;

    move-result-object v0

    invoke-interface {v14, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxe/f$b;

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v4, v2, v3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1}, Lz/j0;->c(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget v2, Lm8/c;->w:I

    const/4 v3, 0x0

    invoke-static {v2, v14, v3}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v2

    sget-object v18, LL9/d$a;->b:LL9/d$a;

    const v3, 0x32d51dcd

    invoke-interface {v14, v3}, LT/l;->U(I)V

    invoke-interface {v14, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_3

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_4

    :cond_3
    new-instance v4, Lcom/ui/wifiman/ui/settings/preferences/f$a$a;

    invoke-direct {v4, v0}, Lcom/ui/wifiman/ui/settings/preferences/f$a$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {v14, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v4, Lth/g;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    move-object v3, v4

    check-cast v3, Lmh/a;

    sget v0, LL9/d$a;->c:I

    shl-int/lit8 v15, v0, 0x6

    const/16 v16, 0x0

    const/16 v17, 0x7f0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v0, v1

    move-object v1, v2

    move-object/from16 v2, v18

    move-object/from16 v14, p1

    invoke-static/range {v0 .. v17}, LL9/E;->i(Landroidx/compose/ui/e;Ljava/lang/String;LL9/d;Lmh/a;Lmh/q;JJJFLz/N;FLT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/ui/settings/preferences/f$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
