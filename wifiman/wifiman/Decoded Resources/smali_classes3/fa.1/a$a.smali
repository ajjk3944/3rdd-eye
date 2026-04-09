.class final Lfa/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfa/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lfa/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lfa/a$a;

    invoke-direct {v0}, Lfa/a$a;-><init>()V

    sput-object v0, Lfa/a$a;->a:Lfa/a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 6

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

    const-string/jumbo v1, "com.ui.core.ui.sso.trusted.ComposableSingletons$UiTrustedDeviceKt.lambda-1.<anonymous> (UiTrustedDevice.kt:24)"

    const v2, -0x27f6ce93

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object p2

    invoke-interface {p1, p2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/lifecycle/o;

    invoke-interface {p2}, Landroidx/lifecycle/o;->O()Landroidx/lifecycle/k;

    move-result-object v2

    const/16 v4, 0x30

    const/4 v5, 0x0

    const-class v0, Lfa/j;

    const/4 v1, 0x0

    move-object v3, p1

    invoke-static/range {v0 .. v5}, LQ9/h;->m(Ljava/lang/Class;Landroid/os/Bundle;Landroidx/lifecycle/k;LT/l;II)LR9/a;

    move-result-object p2

    check-cast p2, Lfa/j;

    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, Lfa/i;->c(Lfa/j;LT/l;I)V

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

    invoke-virtual {p0, p1, p2}, Lfa/a$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
