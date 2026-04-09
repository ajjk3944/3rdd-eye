.class public final Lw/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lw/x;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw/x;

    invoke-direct {v0}, Lw/x;-><init>()V

    sput-object v0, Lw/x;->a:Lw/x;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)Lw/n;
    .locals 3

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior (Scrollable.kt:570)"

    const v2, 0x4206c4aa

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const/4 p2, 0x0

    invoke-static {p1, p2}, Lq/z;->b(LT/l;I)Lr/z;

    move-result-object p2

    invoke-interface {p1, p2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_1

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_2

    :cond_1
    new-instance v1, Lw/h;

    const/4 v0, 0x2

    const/4 v2, 0x0

    invoke-direct {v1, p2, v2, v0, v2}, Lw/h;-><init>(Lr/z;Lf0/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v1, Lw/h;

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    return-object v1
.end method

.method public final b(LT/l;I)Ls/S;
    .locals 3

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.gestures.ScrollableDefaults.overscrollEffect (Scrollable.kt:583)"

    const v2, 0x6bdf63e4

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const/4 p2, 0x0

    invoke-static {p1, p2}, Ls/b;->a(LT/l;I)Ls/S;

    move-result-object p1

    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    return-object p1
.end method

.method public final c(LY0/t;Lw/q;Z)Z
    .locals 2

    xor-int/lit8 v0, p3, 0x1

    sget-object v1, LY0/t;->Rtl:LY0/t;

    if-ne p1, v1, :cond_0

    sget-object p1, Lw/q;->Vertical:Lw/q;

    if-eq p2, p1, :cond_0

    goto :goto_0

    :cond_0
    move p3, v0

    :goto_0
    return p3
.end method
