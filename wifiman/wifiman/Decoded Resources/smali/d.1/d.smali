.class public final Ld/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ld/d;

.field private static final b:LT/H0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ld/d;

    invoke-direct {v0}, Ld/d;-><init>()V

    sput-object v0, Ld/d;->a:Ld/d;

    sget-object v0, Ld/d$a;->a:Ld/d$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, LT/w;->d(LT/n1;Lmh/a;ILjava/lang/Object;)LT/H0;

    move-result-object v0

    sput-object v0, Ld/d;->b:LT/H0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)Lc/J;
    .locals 3

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.activity.compose.LocalOnBackPressedDispatcherOwner.<get-current> (BackHandler.kt:50)"

    const v2, -0x7b43639d

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, Ld/d;->b:LT/H0;

    invoke-interface {p1, p2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lc/J;

    if-nez p2, :cond_1

    const p2, 0x206f5359

    invoke-interface {p1, p2}, LT/l;->U(I)V

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->k()LT/H0;

    move-result-object p2

    invoke-interface {p1, p2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/View;

    invoke-static {p2}, Lc/N;->a(Landroid/view/View;)Lc/J;

    move-result-object p2

    invoke-interface {p1}, LT/l;->J()V

    goto :goto_0

    :cond_1
    const v0, 0x206f49c8

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->J()V

    :goto_0
    if-nez p2, :cond_4

    const p2, 0x206f5b2c

    invoke-interface {p1, p2}, LT/l;->U(I)V

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->g()LT/H0;

    move-result-object p2

    invoke-interface {p1, p2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/content/Context;

    :goto_1
    instance-of v0, p2, Landroid/content/ContextWrapper;

    if-eqz v0, :cond_3

    instance-of v0, p2, Lc/J;

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    check-cast p2, Landroid/content/ContextWrapper;

    invoke-virtual {p2}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p2

    goto :goto_1

    :cond_3
    const/4 p2, 0x0

    :goto_2
    check-cast p2, Lc/J;

    invoke-interface {p1}, LT/l;->J()V

    goto :goto_3

    :cond_4
    const v0, 0x206f4a19

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->J()V

    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    return-object p2
.end method
