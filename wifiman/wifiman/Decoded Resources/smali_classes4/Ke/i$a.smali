.class final LKe/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKe/i;->f(Landroidx/compose/ui/e;LKe/a$a;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LKe/a$a;


# direct methods
.method constructor <init>(LKe/a$a;)V
    .locals 0

    iput-object p1, p0, LKe/i$a;->a:LKe/a$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq/e;LT/l;I)V
    .locals 20

    const-string v0, "$this$AnimatedVisibility"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "com.ui.wifiman.ui.device.card.DeviceDetailCardHeader.<anonymous>.<anonymous> (DeviceDetailCardHeader.kt:103)"

    const v2, -0x5edc3af2

    move/from16 v3, p3

    invoke-static {v2, v3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v0, 0xc

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v5

    const/16 v8, 0xd

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v10

    sget-object v0, Lz/c;->a:Lz/c;

    const/16 v1, 0x8

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-virtual {v0, v1}, Lz/c;->n(F)Lz/c$f;

    move-result-object v11

    const/4 v1, 0x4

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-virtual {v0, v1}, Lz/c;->n(F)Lz/c$f;

    move-result-object v12

    new-instance v0, LKe/i$a$a;

    move-object/from16 v1, p0

    iget-object v2, v1, LKe/i$a;->a:LKe/a$a;

    invoke-direct {v0, v2}, LKe/i$a$a;-><init>(LKe/a$a;)V

    const/16 v2, 0x36

    const v3, 0x26958189

    const/4 v4, 0x1

    move-object/from16 v5, p2

    invoke-static {v3, v4, v0, v5, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v16

    const v18, 0x1801b6

    const/16 v19, 0x38

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v17, p2

    invoke-static/range {v10 .. v19}, Lz/t;->a(Landroidx/compose/ui/e;Lz/c$e;Lz/c$m;IILz/z;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_1

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

    invoke-virtual {p0, p1, p2, p3}, LKe/i$a;->a(Lq/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
