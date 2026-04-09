.class final Ly9/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly9/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ly9/a$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ly9/a$c;

    invoke-direct {v0}, Ly9/a$c;-><init>()V

    sput-object v0, Ly9/a$c;->a:Ly9/a$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic K(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    move-object v1, p1

    check-cast v1, Landroidx/compose/ui/e;

    move-object v2, p2

    check-cast v2, Ljava/lang/String;

    move-object v3, p3

    check-cast v3, Lmh/a;

    move-object v4, p4

    check-cast v4, LT/l;

    check-cast p5, Ljava/lang/Number;

    invoke-virtual {p5}, Ljava/lang/Number;->intValue()I

    move-result v5

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Ly9/a$c;->a(Landroidx/compose/ui/e;Ljava/lang/String;Lmh/a;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final a(Landroidx/compose/ui/e;Ljava/lang/String;Lmh/a;LT/l;I)V
    .locals 11

    move-object v0, p1

    move-object v6, p2

    move-object v1, p3

    move-object v8, p4

    move/from16 v2, p5

    const-string/jumbo v3, "modifier"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v3, "onClick"

    invoke-static {p3, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v3, v2, 0x6

    if-nez v3, :cond_1

    invoke-interface {p4, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v2

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    and-int/lit8 v4, v2, 0x30

    if-nez v4, :cond_3

    invoke-interface {p4, p2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_3
    and-int/lit16 v2, v2, 0x180

    if-nez v2, :cond_5

    invoke-interface {p4, p3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v3, v2

    :cond_5
    and-int/lit16 v2, v3, 0x493

    const/16 v4, 0x492

    if-ne v2, v4, :cond_7

    invoke-interface {p4}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {p4}, LT/l;->C()V

    goto :goto_6

    :cond_7
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_8

    const/4 v2, -0x1

    const-string/jumbo v4, "com.ui.core.ui.component.dialog.ComposableSingletons$UiDialogAlertBottomKt.lambda-11.<anonymous> (UiDialogAlertBottom.kt:293)"

    const v5, -0x4cbbf1

    invoke-static {v5, v3, v2, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_8
    if-nez v6, :cond_9

    goto :goto_5

    :cond_9
    sget-object v5, Lw9/p;->ALERT:Lw9/p;

    and-int/lit8 v2, v3, 0xe

    const/high16 v4, 0x30000

    or-int/2addr v2, v4

    shr-int/lit8 v3, v3, 0x3

    and-int/lit8 v3, v3, 0x70

    or-int v9, v2, v3

    const/16 v10, 0x9c

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    move-object v0, p1

    move-object v1, p3

    move-object v6, p2

    move-object v8, p4

    invoke-static/range {v0 .. v10}, Lw9/r;->b(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Lw9/p;Ljava/lang/String;LL0/U;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    :goto_6
    return-void
.end method
