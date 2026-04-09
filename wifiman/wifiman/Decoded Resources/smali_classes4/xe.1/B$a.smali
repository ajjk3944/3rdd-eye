.class final Lxe/B$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxe/B;->r(Lxe/r0;Lf2/w;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LN/n0;

.field final synthetic b:Lf2/w;

.field final synthetic c:Lxe/r0;

.field final synthetic d:Lxe/f$b;


# direct methods
.method constructor <init>(LN/n0;Lf2/w;Lxe/r0;Lxe/f$b;)V
    .locals 0

    iput-object p1, p0, Lxe/B$a;->a:LN/n0;

    iput-object p2, p0, Lxe/B$a;->b:Lf2/w;

    iput-object p3, p0, Lxe/B$a;->c:Lxe/r0;

    iput-object p4, p0, Lxe/B$a;->d:Lxe/f$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v14, p1

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

    const-string v3, "com.ui.wifiman.ui.AppModalNavigation.<anonymous> (WiFimanAppNavigation.kt:199)"

    const v4, 0xc99be00

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    const/4 v1, 0x0

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v6

    sget-object v1, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v1}, Lm0/v0$a;->d()J

    move-result-wide v7

    invoke-static {}, LN/t;->a()LT/H0;

    move-result-object v1

    invoke-interface {v14, v1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm0/v0;

    invoke-virtual {v1}, Lm0/v0;->u()J

    move-result-wide v9

    sget-object v1, LQ/b;->a:LQ/b;

    const/4 v2, 0x6

    invoke-virtual {v1, v14, v2}, LQ/b;->b(LT/l;I)Lm0/i1;

    move-result-object v5

    new-instance v1, Lxe/B$a$a;

    iget-object v3, v0, Lxe/B$a;->b:Lf2/w;

    iget-object v4, v0, Lxe/B$a;->c:Lxe/r0;

    iget-object v11, v0, Lxe/B$a;->a:LN/n0;

    iget-object v12, v0, Lxe/B$a;->d:Lxe/f$b;

    invoke-direct {v1, v3, v4, v11, v12}, Lxe/B$a$a;-><init>(Lf2/w;Lxe/r0;LN/n0;Lxe/f$b;)V

    const/16 v3, 0x36

    const v4, -0x4087c352

    const/4 v11, 0x1

    invoke-static {v4, v11, v1, v14, v3}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v1

    iget-object v3, v0, Lxe/B$a;->a:LN/n0;

    sget-object v4, Lxe/a;->a:Lxe/a;

    invoke-virtual {v4}, Lxe/a;->a()Lmh/p;

    move-result-object v13

    sget v4, LN/n0;->e:I

    shl-int/lit8 v2, v4, 0x6

    const v4, 0x301b0006

    or-int v15, v2, v4

    const/16 v16, 0x10a

    const/4 v2, 0x0

    const/4 v4, 0x0

    const-wide/16 v11, 0x0

    move-object/from16 v14, p1

    invoke-static/range {v1 .. v16}, LN/m0;->b(Lmh/q;Landroidx/compose/ui/e;LN/n0;ZLm0/i1;FJJJLmh/p;LT/l;II)V

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

    invoke-virtual {p0, p1, p2}, Lxe/B$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
