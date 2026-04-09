.class final LSe/e$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSe/e$a$a;->a(Lz/j;LT/l;I)V
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

    iput-object p1, p0, LSe/e$a$a$a;->a:LSe/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LA9/i;LT/l;I)V
    .locals 19

    move-object/from16 v14, p2

    const-string v0, "$this$UiSettingsCard"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "com.ui.wifiman.ui.settings.dev.DevPreferencesUi.<anonymous>.<anonymous>.<anonymous> (DevPreferencesUi.kt:61)"

    const v2, -0x2fb09d3a

    move/from16 v3, p3

    invoke-static {v2, v3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    move-object/from16 v15, p0

    iget-object v0, v15, LSe/e$a$a$a;->a:LSe/c;

    const v1, -0xeee9f77

    invoke-interface {v14, v1}, LT/l;->U(I)V

    invoke-interface {v14, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_1

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_2

    :cond_1
    new-instance v2, LSe/e$a$a$a$a;

    invoke-direct {v2, v0}, LSe/e$a$a$a$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {v14, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v2, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    move-object v10, v2

    check-cast v10, Lmh/a;

    const/16 v16, 0x0

    const/16 v17, 0x3bdb

    const/4 v0, 0x0

    const/4 v1, 0x0

    const-string v2, "Send Logs to Firebase Crashlytics"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const v18, 0x30180

    move/from16 v15, v18

    move-object/from16 v14, p2

    invoke-static/range {v0 .. v17}, LF9/u;->c(Landroidx/compose/ui/e;Ls9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ls9/b;LF9/r;ZLjava/lang/Boolean;Ljava/lang/String;Lmh/a;Lmh/a;FLmh/q;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_3

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

    invoke-virtual {p0, p1, p2, p3}, LSe/e$a$a$a;->a(LA9/i;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
