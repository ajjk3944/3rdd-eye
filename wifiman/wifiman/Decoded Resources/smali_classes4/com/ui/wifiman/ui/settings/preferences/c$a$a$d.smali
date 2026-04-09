.class final Lcom/ui/wifiman/ui/settings/preferences/c$a$a$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/settings/preferences/c$a$a;->b(Lz/j;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/ui/settings/preferences/a;

.field final synthetic b:LT/z1;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/ui/settings/preferences/a;LT/z1;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$d;->a:Lcom/ui/wifiman/ui/settings/preferences/a;

    iput-object p2, p0, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$d;->b:LT/z1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq/e;LT/l;I)V
    .locals 17

    move-object/from16 v0, p0

    const-string v1, "$this$AnimatedVisibility"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.settings.preferences.AppPreferencesUi.<anonymous>.<anonymous>.<anonymous> (AppPreferencesUi.kt:101)"

    const v3, -0x40ee099d

    move/from16 v4, p3

    invoke-static {v3, v4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    new-instance v1, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$d$a;

    iget-object v2, v0, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$d;->a:Lcom/ui/wifiman/ui/settings/preferences/a;

    iget-object v3, v0, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$d;->b:LT/z1;

    invoke-direct {v1, v2, v3}, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$d$a;-><init>(Lcom/ui/wifiman/ui/settings/preferences/a;LT/z1;)V

    const/16 v2, 0x36

    const v3, -0x7f3bbe15

    const/4 v4, 0x1

    move-object/from16 v14, p2

    invoke-static {v3, v4, v1, v14, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v13

    const/high16 v15, 0x6000000

    const/16 v16, 0xff

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v5 .. v16}, LF9/x;->c(Landroidx/compose/ui/e;Ljava/lang/String;LB9/b;LB9/b;Ls9/a;Lmh/a;Ljava/lang/String;Lmh/a;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$d;->a(Lq/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
