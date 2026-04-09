.class final Lxe/e$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxe/e$a;->b(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/e;

.field final synthetic b:Lxe/r0;

.field final synthetic c:Lf2/w;

.field final synthetic d:Lf2/w;

.field final synthetic e:Landroidx/lifecycle/a;

.field final synthetic f:LGe/g$a;

.field final synthetic g:Lxe/h;


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;Lxe/r0;Lf2/w;Lf2/w;Landroidx/lifecycle/a;LGe/g$a;Lxe/h;)V
    .locals 0

    iput-object p1, p0, Lxe/e$a$a;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, Lxe/e$a$a;->b:Lxe/r0;

    iput-object p3, p0, Lxe/e$a$a;->c:Lf2/w;

    iput-object p4, p0, Lxe/e$a$a;->d:Lf2/w;

    iput-object p5, p0, Lxe/e$a$a;->e:Landroidx/lifecycle/a;

    iput-object p6, p0, Lxe/e$a$a;->f:LGe/g$a;

    iput-object p7, p0, Lxe/e$a$a;->g:Lxe/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v13, p1

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

    const-string v3, "com.ui.wifiman.ui.WifimanAppUi.<anonymous>.<anonymous> (WiFiManAppUi.kt:118)"

    const v4, 0x4cbd20bc

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, Lxe/e$a$a;->a:Landroidx/compose/ui/e;

    sget-object v2, Lla/a;->a:Lla/a;

    sget v3, Lla/a;->b:I

    invoke-virtual {v2, v13, v3}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->e()Lma/a$e;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$e;->a()J

    move-result-wide v7

    new-instance v2, Lxe/e$a$a$a;

    iget-object v15, v0, Lxe/e$a$a;->b:Lxe/r0;

    iget-object v3, v0, Lxe/e$a$a;->c:Lf2/w;

    iget-object v4, v0, Lxe/e$a$a;->d:Lf2/w;

    iget-object v5, v0, Lxe/e$a$a;->e:Landroidx/lifecycle/a;

    iget-object v6, v0, Lxe/e$a$a;->f:LGe/g$a;

    iget-object v9, v0, Lxe/e$a$a;->g:Lxe/h;

    move-object v14, v2

    move-object/from16 v16, v3

    move-object/from16 v17, v4

    move-object/from16 v18, v5

    move-object/from16 v19, v6

    move-object/from16 v20, v9

    invoke-direct/range {v14 .. v20}, Lxe/e$a$a$a;-><init>(Lxe/r0;Lf2/w;Lf2/w;Landroidx/lifecycle/a;LGe/g$a;Lxe/h;)V

    const/16 v3, 0x36

    const v4, 0x142d84d

    const/4 v5, 0x1

    invoke-static {v4, v5, v2, v13, v3}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v12

    const/high16 v14, 0x30000000

    const/16 v15, 0x1be

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    move-object/from16 v13, p1

    invoke-static/range {v1 .. v15}, LQ/r;->a(Landroidx/compose/ui/e;Lmh/p;Lmh/p;Lmh/p;Lmh/p;IJJLz/f0;Lmh/q;LT/l;II)V

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

    invoke-virtual {p0, p1, p2}, Lxe/e$a$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
