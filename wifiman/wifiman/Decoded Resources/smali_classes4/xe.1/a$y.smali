.class final Lxe/a$y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxe/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lxe/a$y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxe/a$y;

    invoke-direct {v0}, Lxe/a$y;-><init>()V

    sput-object v0, Lxe/a$y;->a:Lxe/a$y;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lf2/k;LT/l;I)V
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.ComposableSingletons$WiFimanAppNavigationKt.lambda-31.<anonymous> (WiFimanAppNavigation.kt:392)"

    const v1, 0x44568095

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const/4 p1, 0x0

    const/4 p3, 0x1

    const/4 v0, 0x0

    invoke-static {v0, p2, p1, p3}, Lcom/ui/wifiman/ui/teleport/consoles/y;->b(Lcom/ui/wifiman/ui/teleport/consoles/w;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lf2/k;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lxe/a$y;->a(Lf2/k;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
