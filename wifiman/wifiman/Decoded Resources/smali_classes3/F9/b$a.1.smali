.class final LF9/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF9/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LF9/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF9/b$a;

    invoke-direct {v0}, LF9/b$a;-><init>()V

    sput-object v0, LF9/b$a;->a:LF9/b$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq/e;LT/l;I)V
    .locals 2

    const-string v0, "$this$AnimatedVisibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string/jumbo v0, "com.ui.core.ui.component.settings.ComposableSingletons$UiSettingsTextFieldKt.lambda-1.<anonymous> (UiSettingsTextField.kt:200)"

    const v1, 0x35e5c72f

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 p3, 0x10

    int-to-float p3, p3

    invoke-static {p3}, LY0/h;->j(F)F

    move-result p3

    invoke-static {p1, p3}, Landroidx/compose/foundation/layout/r;->z(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object p1

    const/4 p3, 0x6

    invoke-static {p1, p2, p3}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_1

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

    invoke-virtual {p0, p1, p2, p3}, LF9/b$a;->a(Lq/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
