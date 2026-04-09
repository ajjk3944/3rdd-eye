.class final LL9/E$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LL9/E;->i(Landroidx/compose/ui/e;Ljava/lang/String;LL9/d;Lmh/a;Lmh/q;JJJFLz/N;FLT/l;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/e;

.field final synthetic b:Lmh/q;

.field final synthetic c:J

.field final synthetic d:F

.field final synthetic e:Lz/N;

.field final synthetic f:F

.field final synthetic g:Ljava/lang/String;

.field final synthetic h:J

.field final synthetic i:LL9/d;

.field final synthetic j:Lmh/a;


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;Lmh/q;JFLz/N;FLjava/lang/String;JLL9/d;Lmh/a;)V
    .locals 0

    iput-object p1, p0, LL9/E$b;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LL9/E$b;->b:Lmh/q;

    iput-wide p3, p0, LL9/E$b;->c:J

    iput p5, p0, LL9/E$b;->d:F

    iput-object p6, p0, LL9/E$b;->e:Lz/N;

    iput p7, p0, LL9/E$b;->f:F

    iput-object p8, p0, LL9/E$b;->g:Ljava/lang/String;

    iput-wide p9, p0, LL9/E$b;->h:J

    iput-object p11, p0, LL9/E$b;->i:LL9/d;

    iput-object p12, p0, LL9/E$b;->j:Lmh/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 15

    move-object v0, p0

    move-object/from16 v12, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    invoke-interface/range {p1 .. p1}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LT/l;->C()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string/jumbo v3, "com.ui.core.ui.component.toolbar.UiToolbar.<anonymous> (UiToolbar.kt:123)"

    const v4, -0x1cd5ae66

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, LL9/E$b;->a:Landroidx/compose/ui/e;

    new-instance v2, LL9/E$b$a;

    iget-object v3, v0, LL9/E$b;->g:Ljava/lang/String;

    iget-wide v4, v0, LL9/E$b;->h:J

    invoke-direct {v2, v3, v4, v5}, LL9/E$b$a;-><init>(Ljava/lang/String;J)V

    const v3, 0x4d788c2e    # 2.6062102E8f

    const/4 v4, 0x1

    const/16 v5, 0x36

    invoke-static {v3, v4, v2, v12, v5}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v2

    new-instance v3, LL9/E$b$b;

    iget-object v6, v0, LL9/E$b;->i:LL9/d;

    iget-object v7, v0, LL9/E$b;->j:Lmh/a;

    invoke-direct {v3, v6, v7}, LL9/E$b$b;-><init>(LL9/d;Lmh/a;)V

    const v6, 0x50ed496f

    invoke-static {v6, v4, v3, v12, v5}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v3

    iget-object v4, v0, LL9/E$b;->b:Lmh/q;

    iget-wide v5, v0, LL9/E$b;->c:J

    iget v7, v0, LL9/E$b;->d:F

    iget-object v10, v0, LL9/E$b;->e:Lz/N;

    iget v11, v0, LL9/E$b;->f:F

    const/16 v13, 0x1b0

    const/16 v14, 0x40

    const-wide/16 v8, 0x0

    move-object/from16 v12, p1

    invoke-static/range {v1 .. v14}, LL9/q;->r(Landroidx/compose/ui/e;Lmh/p;Lmh/p;Lmh/q;JFJLz/N;FLT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LL9/E$b;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
