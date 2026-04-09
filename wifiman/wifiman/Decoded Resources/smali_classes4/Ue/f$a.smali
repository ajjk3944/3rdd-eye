.class final LUe/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LUe/f;->e(Landroidx/compose/ui/e;Ljava/lang/Long;Lmh/a;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Ljava/lang/Long;

.field final synthetic c:Lmh/a;


# direct methods
.method constructor <init>(JLjava/lang/Long;Lmh/a;)V
    .locals 0

    iput-wide p1, p0, LUe/f$a;->a:J

    iput-object p3, p0, LUe/f$a;->b:Ljava/lang/Long;

    iput-object p4, p0, LUe/f$a;->c:Lmh/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 8

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.ui.wifiman.ui.signal.floorplan.component.ComposeFloorplanPreview.<anonymous>.<anonymous>.<anonymous> (ComposeFloorplanPreview.kt:49)"

    const v2, -0x3cadd5fd

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-wide v0, p0, LUe/f$a;->a:J

    invoke-static {v0, v1}, LY0/r;->g(J)I

    move-result v2

    iget-wide v0, p0, LUe/f$a;->a:J

    invoke-static {v0, v1}, LY0/r;->f(J)I

    move-result v3

    iget-object v4, p0, LUe/f$a;->b:Ljava/lang/Long;

    iget-object v5, p0, LUe/f$a;->c:Lmh/a;

    const/4 v7, 0x0

    move-object v6, p1

    invoke-static/range {v2 .. v7}, LUe/f;->m(IILjava/lang/Long;Lmh/a;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_3

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

    invoke-virtual {p0, p1, p2}, LUe/f$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
