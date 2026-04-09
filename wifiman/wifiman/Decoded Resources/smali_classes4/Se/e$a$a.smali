.class final LSe/e$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSe/e$a;->a(Lz/N;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LSe/c;


# direct methods
.method constructor <init>(LSe/c;)V
    .locals 0

    iput-object p1, p0, LSe/e$a$a;->a:LSe/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/j;LT/l;I)V
    .locals 14

    move-object v0, p0

    move-object/from16 v13, p2

    move/from16 v1, p3

    const-string v2, "$this$UiSettings"

    move-object v3, p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, v1, 0x11

    const/16 v3, 0x10

    if-ne v2, v3, :cond_1

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.settings.dev.DevPreferencesUi.<anonymous>.<anonymous> (DevPreferencesUi.kt:54)"

    const v4, 0x57b9c33e

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    new-instance v3, LB9/b$a;

    const-string v1, "By clicking on the above button, latest dev logs will be sent to Firebase Crashylitics so the developer can reach them.\nPlease restart the app after clicking this button to make sure the logs were sent properly."

    invoke-direct {v3, v1}, LB9/b$a;-><init>(Ljava/lang/String;)V

    new-instance v1, LSe/e$a$a$a;

    iget-object v2, v0, LSe/e$a$a;->a:LSe/c;

    invoke-direct {v1, v2}, LSe/e$a$a$a;-><init>(LSe/c;)V

    const/16 v2, 0x36

    const/4 v4, 0x1

    const v5, -0x2fb09d3a

    invoke-static {v5, v4, v1, v13, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v9

    const v11, 0x60001b0

    const/16 v12, 0xf9

    const/4 v1, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-string v2, "Logs"

    move-object/from16 v10, p2

    invoke-static/range {v1 .. v12}, LF9/x;->c(Landroidx/compose/ui/e;Ljava/lang/String;LB9/b;LB9/b;Ls9/a;Lmh/a;Ljava/lang/String;Lmh/a;Lmh/q;LT/l;II)V

    new-instance v1, LSe/e$a$a$c;

    iget-object v2, v0, LSe/e$a$a;->a:LSe/c;

    invoke-direct {v1, v2}, LSe/e$a$a$c;-><init>(LSe/c;)V

    const/16 v2, 0x36

    const/4 v3, 0x1

    const v4, 0x2120ff2f

    invoke-static {v4, v3, v1, v13, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v9

    const v11, 0x6000030

    const/16 v12, 0xfd

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v2, "UI Cloud"

    invoke-static/range {v1 .. v12}, LF9/x;->c(Landroidx/compose/ui/e;Ljava/lang/String;LB9/b;LB9/b;Ls9/a;Lmh/a;Ljava/lang/String;Lmh/a;Lmh/q;LT/l;II)V

    new-instance v1, LSe/e$a$a$d;

    iget-object v2, v0, LSe/e$a$a;->a:LSe/c;

    invoke-direct {v1, v2}, LSe/e$a$a$d;-><init>(LSe/c;)V

    const/16 v2, 0x36

    const/4 v3, 0x1

    const v4, -0x78def7b2

    invoke-static {v4, v3, v1, v13, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v9

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v2, "SSO"

    invoke-static/range {v1 .. v12}, LF9/x;->c(Landroidx/compose/ui/e;Ljava/lang/String;LB9/b;LB9/b;Ls9/a;Lmh/a;Ljava/lang/String;Lmh/a;Lmh/q;LT/l;II)V

    new-instance v1, LSe/e$a$a$e;

    iget-object v2, v0, LSe/e$a$a;->a:LSe/c;

    invoke-direct {v1, v2}, LSe/e$a$a$e;-><init>(LSe/c;)V

    const/16 v2, 0x36

    const/4 v3, 0x1

    const v4, -0x12deee93

    invoke-static {v4, v3, v1, v13, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v9

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v2, "WiFiman API"

    invoke-static/range {v1 .. v12}, LF9/x;->c(Landroidx/compose/ui/e;Ljava/lang/String;LB9/b;LB9/b;Ls9/a;Lmh/a;Ljava/lang/String;Lmh/a;Lmh/q;LT/l;II)V

    new-instance v1, LSe/e$a$a$f;

    iget-object v2, v0, LSe/e$a$a;->a:LSe/c;

    invoke-direct {v1, v2}, LSe/e$a$a$f;-><init>(LSe/c;)V

    const/16 v2, 0x36

    const/4 v3, 0x1

    const v4, 0x53211a8c

    invoke-static {v4, v3, v1, v13, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v9

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v2, "WiFiman Wizard"

    invoke-static/range {v1 .. v12}, LF9/x;->c(Landroidx/compose/ui/e;Ljava/lang/String;LB9/b;LB9/b;Ls9/a;Lmh/a;Ljava/lang/String;Lmh/a;Lmh/q;LT/l;II)V

    new-instance v1, LSe/e$a$a$g;

    iget-object v2, v0, LSe/e$a$a;->a:LSe/c;

    invoke-direct {v1, v2}, LSe/e$a$a$g;-><init>(LSe/c;)V

    const/16 v2, 0x36

    const/4 v3, 0x1

    const v4, -0x46dedc55

    invoke-static {v4, v3, v1, v13, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v9

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v2, "WiFi Scan"

    invoke-static/range {v1 .. v12}, LF9/x;->c(Landroidx/compose/ui/e;Ljava/lang/String;LB9/b;LB9/b;Ls9/a;Lmh/a;Ljava/lang/String;Lmh/a;Lmh/q;LT/l;II)V

    new-instance v1, LSe/e$a$a$h;

    iget-object v2, v0, LSe/e$a$a;->a:LSe/c;

    invoke-direct {v1, v2}, LSe/e$a$a$h;-><init>(LSe/c;)V

    const/16 v2, 0x36

    const/4 v3, 0x1

    const v4, 0x1f212cca

    invoke-static {v4, v3, v1, v13, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v9

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v2, "Discovery"

    invoke-static/range {v1 .. v12}, LF9/x;->c(Landroidx/compose/ui/e;Ljava/lang/String;LB9/b;LB9/b;Ls9/a;Lmh/a;Ljava/lang/String;Lmh/a;Lmh/q;LT/l;II)V

    new-instance v1, LSe/e$a$a$i;

    iget-object v2, v0, LSe/e$a$a;->a:LSe/c;

    invoke-direct {v1, v2}, LSe/e$a$a$i;-><init>(LSe/c;)V

    const/16 v2, 0x36

    const/4 v3, 0x1

    const v4, -0x7adeca17

    invoke-static {v4, v3, v1, v13, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v9

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v2, "Bluetooth Scan"

    invoke-static/range {v1 .. v12}, LF9/x;->c(Landroidx/compose/ui/e;Ljava/lang/String;LB9/b;LB9/b;Ls9/a;Lmh/a;Ljava/lang/String;Lmh/a;Lmh/q;LT/l;II)V

    new-instance v1, LSe/e$a$a$j;

    iget-object v2, v0, LSe/e$a$a;->a:LSe/c;

    invoke-direct {v1, v2}, LSe/e$a$a$j;-><init>(LSe/c;)V

    const/16 v2, 0x36

    const/4 v3, 0x1

    const v4, -0x14dec0f8

    invoke-static {v4, v3, v1, v13, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v9

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v2, "Floorplan"

    invoke-static/range {v1 .. v12}, LF9/x;->c(Landroidx/compose/ui/e;Ljava/lang/String;LB9/b;LB9/b;Ls9/a;Lmh/a;Ljava/lang/String;Lmh/a;Lmh/q;LT/l;II)V

    new-instance v1, LSe/e$a$a$b;

    iget-object v2, v0, LSe/e$a$a;->a:LSe/c;

    invoke-direct {v1, v2}, LSe/e$a$a$b;-><init>(LSe/c;)V

    const/16 v2, 0x36

    const/4 v3, 0x1

    const v4, 0x51214827

    invoke-static {v4, v3, v1, v13, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v9

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v2, "Throughput Speed"

    invoke-static/range {v1 .. v12}, LF9/x;->c(Landroidx/compose/ui/e;Ljava/lang/String;LB9/b;LB9/b;Ls9/a;Lmh/a;Ljava/lang/String;Lmh/a;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/j;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LSe/e$a$a;->a(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
