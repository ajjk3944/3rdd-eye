.class final Lcom/ui/wifiman/ui/teleport/consoles/u$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/teleport/consoles/u;->y(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/h$a;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/ui/teleport/consoles/h$a;

.field final synthetic b:Lz/Y;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/ui/teleport/consoles/h$a;Lz/Y;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/teleport/consoles/u$h;->a:Lcom/ui/wifiman/ui/teleport/consoles/h$a;

    iput-object p2, p0, Lcom/ui/wifiman/ui/teleport/consoles/u$h;->b:Lz/Y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq/e;LT/l;I)V
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v14, p2

    const-string v1, "$this$AnimatedVisibility"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.teleport.consoles.TeleportConsoleSubtitleTitleRow.<anonymous>.<anonymous> (TeleportConsolePickerUi.kt:252)"

    const v3, -0x7a466653

    move/from16 v4, p3

    invoke-static {v3, v4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object v1, v0, Lcom/ui/wifiman/ui/teleport/consoles/u$h;->a:Lcom/ui/wifiman/ui/teleport/consoles/h$a;

    invoke-virtual {v1}, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->h()Ls9/d;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, v0, Lcom/ui/wifiman/ui/teleport/consoles/u$h;->b:Lz/Y;

    iget-object v3, v0, Lcom/ui/wifiman/ui/teleport/consoles/u$h;->a:Lcom/ui/wifiman/ui/teleport/consoles/h$a;

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v5, 0x0

    invoke-interface {v1, v2, v4, v5}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-virtual {v3}, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->h()Ls9/d;

    move-result-object v1

    invoke-static {v1, v14, v5}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v1

    sget-object v3, Lla/a;->a:Lla/a;

    sget v4, Lla/a;->b:I

    invoke-virtual {v3, v14, v4}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v5

    invoke-virtual {v5}, Lpa/c;->b()Lpa/b;

    move-result-object v5

    invoke-virtual {v5}, Lpa/b;->f()LL0/U;

    move-result-object v22

    invoke-virtual {v3, v14, v4}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->c()J

    move-result-wide v3

    sget-object v5, LW0/t;->a:LW0/t$a;

    invoke-virtual {v5}, LW0/t$a;->b()I

    move-result v16

    const/16 v25, 0xc30

    const v26, 0x1d7f8

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v17, 0x0

    move-wide/from16 v14, v17

    const/16 v17, 0x0

    const/16 v18, 0x1

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    move-object/from16 v23, p2

    invoke-static/range {v1 .. v26}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/teleport/consoles/u$h;->a(Lq/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
