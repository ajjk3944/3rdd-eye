.class final LF9/M$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF9/M;->c(Landroidx/compose/ui/e;Ljava/lang/String;Ls9/b;Ljava/lang/String;LCi/c;Lmh/q;Ljava/lang/Object;Lmh/l;Lmh/a;ZLjava/lang/String;LT/l;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LD9/o;

.field final synthetic b:Lmh/q;

.field final synthetic c:Ljava/lang/Object;

.field final synthetic d:I

.field final synthetic e:LCi/c;

.field final synthetic f:Lmh/l;


# direct methods
.method constructor <init>(LD9/o;Lmh/q;Ljava/lang/Object;ILCi/c;Lmh/l;)V
    .locals 0

    iput-object p1, p0, LF9/M$b;->a:LD9/o;

    iput-object p2, p0, LF9/M$b;->b:Lmh/q;

    iput-object p3, p0, LF9/M$b;->c:Ljava/lang/Object;

    iput p4, p0, LF9/M$b;->d:I

    iput-object p5, p0, LF9/M$b;->e:LCi/c;

    iput-object p6, p0, LF9/M$b;->f:Lmh/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/Y;LT/l;I)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v10, p2

    move/from16 v1, p3

    const-string v2, "$this$UiSettingsBase"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

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

    const-string/jumbo v3, "com.ui.core.ui.component.settings.UiSettingsDropdown.<anonymous> (UiSettingsDropdown.kt:61)"

    const v4, 0x51acc874

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    iget-object v2, v0, LF9/M$b;->a:LD9/o;

    invoke-static {v1, v2}, LD9/k;->s(Landroidx/compose/ui/e;LD9/o;)Landroidx/compose/ui/e;

    move-result-object v1

    iget-object v2, v0, LF9/M$b;->b:Lmh/q;

    iget-object v3, v0, LF9/M$b;->c:Ljava/lang/Object;

    iget v4, v0, LF9/M$b;->d:I

    shr-int/lit8 v4, v4, 0x12

    and-int/lit8 v4, v4, 0x8

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v3, v10, v4}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LL0/d;

    iget-object v3, v0, LF9/M$b;->a:LD9/o;

    invoke-virtual {v3}, LD9/o;->d()Z

    move-result v3

    const/4 v7, 0x0

    const/16 v8, 0x18

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v6, p2

    invoke-static/range {v1 .. v8}, LG9/k;->b(Landroidx/compose/ui/e;LL0/d;ZIILT/l;II)V

    iget-object v1, v0, LF9/M$b;->a:LD9/o;

    new-instance v2, LF9/M$b$a;

    iget-object v12, v0, LF9/M$b;->e:LCi/c;

    iget-object v13, v0, LF9/M$b;->c:Ljava/lang/Object;

    iget-object v15, v0, LF9/M$b;->f:Lmh/l;

    iget-object v3, v0, LF9/M$b;->b:Lmh/q;

    iget v4, v0, LF9/M$b;->d:I

    move-object v11, v2

    move-object v14, v1

    move-object/from16 v16, v3

    move/from16 v17, v4

    invoke-direct/range {v11 .. v17}, LF9/M$b$a;-><init>(LCi/c;Ljava/lang/Object;LD9/o;Lmh/l;Lmh/q;I)V

    const/16 v3, 0x36

    const v4, 0x1d68c642

    const/4 v5, 0x1

    invoke-static {v4, v5, v2, v10, v3}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v9

    const/high16 v11, 0xc00000

    const/16 v12, 0x7e

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v10, p2

    invoke-static/range {v1 .. v12}, LD9/k;->j(LD9/o;Landroidx/compose/ui/window/r;Lmh/a;Lmh/p;JLm0/i1;FLmh/p;LT/l;II)V

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

    check-cast p1, Lz/Y;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LF9/M$b;->a(Lz/Y;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
