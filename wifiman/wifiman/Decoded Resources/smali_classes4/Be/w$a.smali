.class final LBe/w$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBe/w;->b(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;FJLT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ls9/a;

.field final synthetic b:Landroidx/compose/ui/e;

.field final synthetic c:Ls9/a$b;

.field final synthetic d:Ls9/a$b;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:F


# direct methods
.method constructor <init>(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;F)V
    .locals 0

    iput-object p1, p0, LBe/w$a;->a:Ls9/a;

    iput-object p2, p0, LBe/w$a;->b:Landroidx/compose/ui/e;

    iput-object p3, p0, LBe/w$a;->c:Ls9/a$b;

    iput-object p4, p0, LBe/w$a;->d:Ls9/a$b;

    iput-object p5, p0, LBe/w$a;->e:Ljava/lang/String;

    iput p6, p0, LBe/w$a;->f:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 17

    move-object/from16 v0, p0

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

    const-string v3, "com.ui.wifiman.ui.component.ImageOrTintedIcon.<anonymous> (ImageOrTintedIcon.kt:27)"

    const v4, 0x92ac09d

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v5, v0, LBe/w$a;->a:Ls9/a;

    iget-object v6, v0, LBe/w$a;->b:Landroidx/compose/ui/e;

    iget-object v7, v0, LBe/w$a;->c:Ls9/a$b;

    iget-object v8, v0, LBe/w$a;->d:Ls9/a$b;

    iget-object v9, v0, LBe/w$a;->e:Ljava/lang/String;

    iget v12, v0, LBe/w$a;->f:F

    const/4 v15, 0x0

    const/16 v16, 0xb0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    move-object/from16 v14, p1

    invoke-static/range {v5 .. v16}, Lta/c;->e(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;Lf0/c;LC0/h;FLm0/w0;LT/l;II)V

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

    invoke-virtual {p0, p1, p2}, LBe/w$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
