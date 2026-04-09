.class final Lcom/ui/wifiman/ui/component/network/a$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/component/network/a$e;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/ui/component/network/a$e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/ui/component/network/a$e$a;

    invoke-direct {v0}, Lcom/ui/wifiman/ui/component/network/a$e$a;-><init>()V

    sput-object v0, Lcom/ui/wifiman/ui/component/network/a$e$a;->a:Lcom/ui/wifiman/ui/component/network/a$e$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/f;LT/l;I)Lcom/ui/wifiman/ui/component/network/q$c;
    .locals 2

    const-string v0, "$this$BaseNetworkTopology"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, -0x1da7f516

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "com.ui.wifiman.ui.component.network.ComposableSingletons$NetworkTopologyKt.lambda-5.<anonymous>.<anonymous> (NetworkTopology.kt:420)"

    invoke-static {p1, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    new-instance p1, Lcom/ui/wifiman/ui/component/network/a$e$a$a;

    invoke-direct {p1}, Lcom/ui/wifiman/ui/component/network/a$e$a$a;-><init>()V

    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface {p2}, LT/l;->J()V

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/f;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/component/network/a$e$a;->a(Lz/f;LT/l;I)Lcom/ui/wifiman/ui/component/network/q$c;

    move-result-object p1

    return-object p1
.end method
