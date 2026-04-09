.class final Ly9/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly9/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ly9/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ly9/a$a;

    invoke-direct {v0}, Ly9/a$a;-><init>()V

    sput-object v0, Ly9/a$a;->a:Ly9/a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/e;Ls9/c;LT/l;I)V
    .locals 12

    move-object v1, p1

    move-object v0, p2

    move-object v9, p3

    const-string/jumbo v2, "mdf"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, p4, 0x6

    if-nez v2, :cond_1

    invoke-interface {p3, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p4, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p4

    :goto_1
    and-int/lit8 v3, p4, 0x30

    if-nez v3, :cond_3

    invoke-interface {p3, p2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    and-int/lit16 v3, v2, 0x93

    const/16 v4, 0x92

    if-ne v3, v4, :cond_5

    invoke-interface {p3}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p3}, LT/l;->C()V

    goto :goto_5

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_6

    const/4 v3, -0x1

    const-string/jumbo v4, "com.ui.core.ui.component.dialog.ComposableSingletons$UiDialogAlertBottomKt.lambda-1.<anonymous> (UiDialogAlertBottom.kt:154)"

    const v5, -0x65a58b89

    invoke-static {v5, v2, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    if-nez v0, :cond_7

    goto :goto_4

    :cond_7
    shr-int/lit8 v3, v2, 0x3

    and-int/lit8 v3, v3, 0xe

    shl-int/lit8 v2, v2, 0x3

    and-int/lit8 v2, v2, 0x70

    or-int v10, v3, v2

    const/16 v11, 0xfe

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p2

    move-object v1, p1

    move-object v9, p3

    invoke-static/range {v0 .. v11}, Lta/c;->e(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;Lf0/c;LC0/h;FLm0/w0;LT/l;II)V

    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    :goto_5
    return-void
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/e;

    check-cast p2, Ls9/c;

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Ly9/a$a;->a(Landroidx/compose/ui/e;Ls9/c;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
