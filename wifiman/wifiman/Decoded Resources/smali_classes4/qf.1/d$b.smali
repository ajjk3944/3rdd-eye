.class final Lqf/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqf/d;->b(Lqf/a;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lqf/a$a;


# direct methods
.method constructor <init>(Lqf/a$a;)V
    .locals 0

    iput-object p1, p0, Lqf/d$b;->a:Lqf/a$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lqf/a$a;Landroid/webkit/WebView;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lqf/d$b;->c(Lqf/a$a;Landroid/webkit/WebView;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lqf/a$a;Landroid/webkit/WebView;)LYg/J;
    .locals 2

    const-string v0, "webView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    invoke-virtual {p0}, Lqf/a$a;->b()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(Lz/N;LT/l;I)V
    .locals 14

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v10, p2

    const-string v2, "scaffoldPadding"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, p3, 0x6

    const/4 v3, 0x2

    if-nez v2, :cond_1

    invoke-interface {v10, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int v2, p3, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p3

    :goto_1
    and-int/lit8 v4, v2, 0x13

    const/16 v5, 0x12

    if-ne v4, v5, :cond_3

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v4, -0x1

    const-string v5, "com.ui.wifiman.ui.sso.settings.SSOAccountSettingsUi.<anonymous> (SSOAccountSettingsUi.kt:39)"

    const v6, 0x19ef3bd

    invoke-static {v6, v2, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    iget-object v2, v0, Lqf/d$b;->a:Lqf/a$a;

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Lqf/a$a;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v2, v4, v10, v5, v3}, LZ2/f;->d(Ljava/lang/String;Ljava/util/Map;LT/l;II)LZ2/h;

    move-result-object v2

    iget-object v3, v0, Lqf/d$b;->a:Lqf/a$a;

    const v6, 0x78be4cf7

    invoke-interface {v10, v6}, LT/l;->U(I)V

    iget-object v6, v0, Lqf/d$b;->a:Lqf/a$a;

    invoke-interface {v10, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    iget-object v7, v0, Lqf/d$b;->a:Lqf/a$a;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    if-nez v6, :cond_5

    sget-object v6, LT/l;->a:LT/l$a;

    invoke-virtual {v6}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v8, v6, :cond_6

    :cond_5
    new-instance v8, Lqf/d$b$a;

    invoke-direct {v8, v7, v4}, Lqf/d$b$a;-><init>(Lqf/a$a;Ldh/e;)V

    invoke-interface {v10, v8}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v8, Lmh/p;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-static {v3, v8, v10, v5}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v3, p1}, Landroidx/compose/foundation/layout/o;->h(Landroidx/compose/ui/e;Lz/N;)Landroidx/compose/ui/e;

    move-result-object v3

    const v1, 0x78be994e

    invoke-interface {v10, v1}, LT/l;->U(I)V

    iget-object v1, v0, Lqf/d$b;->a:Lqf/a$a;

    invoke-interface {v10, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    iget-object v4, v0, Lqf/d$b;->a:Lqf/a$a;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_7

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v5, v1, :cond_8

    :cond_7
    new-instance v5, Lqf/e;

    invoke-direct {v5, v4}, Lqf/e;-><init>(Lqf/a$a;)V

    invoke-interface {v10, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    check-cast v5, Lmh/l;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/4 v11, 0x0

    const/16 v12, 0x1ec

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v13, 0x0

    move-object v1, v2

    move-object v2, v3

    move v3, v4

    move-object v4, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    move-object v9, v13

    move-object/from16 v10, p2

    invoke-static/range {v1 .. v12}, LZ2/f;->b(LZ2/h;Landroidx/compose/ui/e;ZLZ2/g;Lmh/l;Lmh/l;LZ2/b;LZ2/a;Lmh/l;LT/l;II)V

    :cond_9
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    :goto_3
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/N;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lqf/d$b;->b(Lz/N;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
