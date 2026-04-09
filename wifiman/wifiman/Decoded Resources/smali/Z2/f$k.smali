.class final LZ2/f$k;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZ2/f;->b(LZ2/h;Landroidx/compose/ui/e;ZLZ2/g;Lmh/l;Lmh/l;LZ2/b;LZ2/a;Lmh/l;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LZ2/h;

.field final synthetic b:Z

.field final synthetic c:LZ2/g;

.field final synthetic d:Lmh/l;

.field final synthetic e:Lmh/l;

.field final synthetic f:LZ2/b;

.field final synthetic g:LZ2/a;

.field final synthetic h:Lmh/l;


# direct methods
.method constructor <init>(LZ2/h;ZLZ2/g;Lmh/l;Lmh/l;LZ2/b;LZ2/a;Lmh/l;)V
    .locals 0

    iput-object p1, p0, LZ2/f$k;->a:LZ2/h;

    iput-boolean p2, p0, LZ2/f$k;->b:Z

    iput-object p3, p0, LZ2/f$k;->c:LZ2/g;

    iput-object p4, p0, LZ2/f$k;->d:Lmh/l;

    iput-object p5, p0, LZ2/f$k;->e:Lmh/l;

    iput-object p6, p0, LZ2/f$k;->f:LZ2/b;

    iput-object p7, p0, LZ2/f$k;->g:LZ2/a;

    iput-object p8, p0, LZ2/f$k;->h:Lmh/l;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lz/f;LT/l;I)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "$this$BoxWithConstraints"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, p3, 0xe

    if-nez v2, :cond_1

    move-object/from16 v2, p2

    invoke-interface {v2, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int v3, p3, v3

    goto :goto_1

    :cond_1
    move-object/from16 v2, p2

    move/from16 v3, p3

    :goto_1
    and-int/lit8 v4, v3, 0x5b

    const/16 v5, 0x12

    if-ne v4, v5, :cond_3

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto :goto_5

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v4

    const/4 v5, -0x1

    if-eqz v4, :cond_4

    const v4, -0x5fba294d

    const-string v6, "com.google.accompanist.web.WebView.<anonymous> (WebView.kt:105)"

    invoke-static {v4, v3, v5, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    invoke-interface/range {p1 .. p1}, Lz/f;->d()J

    move-result-wide v3

    invoke-static {v3, v4}, LY0/b;->j(J)Z

    move-result v3

    const/4 v4, -0x2

    if-eqz v3, :cond_5

    move v3, v5

    goto :goto_3

    :cond_5
    move v3, v4

    :goto_3
    invoke-interface/range {p1 .. p1}, Lz/f;->d()J

    move-result-wide v6

    invoke-static {v6, v7}, LY0/b;->i(J)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_4

    :cond_6
    move v5, v4

    :goto_4
    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v4, v3, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    iget-object v3, v0, LZ2/f$k;->a:LZ2/h;

    sget-object v5, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    iget-boolean v6, v0, LZ2/f$k;->b:Z

    iget-object v7, v0, LZ2/f$k;->c:LZ2/g;

    iget-object v8, v0, LZ2/f$k;->d:Lmh/l;

    iget-object v9, v0, LZ2/f$k;->e:Lmh/l;

    iget-object v10, v0, LZ2/f$k;->f:LZ2/b;

    iget-object v11, v0, LZ2/f$k;->g:LZ2/a;

    iget-object v12, v0, LZ2/f$k;->h:Lmh/l;

    const v14, 0x90001c0

    const/4 v15, 0x0

    move-object/from16 v13, p2

    invoke-static/range {v3 .. v15}, LZ2/f;->a(LZ2/h;Landroid/widget/FrameLayout$LayoutParams;Landroidx/compose/ui/e;ZLZ2/g;Lmh/l;Lmh/l;LZ2/b;LZ2/a;Lmh/l;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    :goto_5
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/f;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LZ2/f$k;->a(Lz/f;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
