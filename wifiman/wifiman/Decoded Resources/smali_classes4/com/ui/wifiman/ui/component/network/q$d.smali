.class final Lcom/ui/wifiman/ui/component/network/q$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/component/network/q;->a()Lmh/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/ui/component/network/q$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/ui/component/network/q$d;

    invoke-direct {v0}, Lcom/ui/wifiman/ui/component/network/q$d;-><init>()V

    sput-object v0, Lcom/ui/wifiman/ui/component/network/q$d;->a:Lcom/ui/wifiman/ui/component/network/q$d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/f;Lcom/ui/wifiman/ui/component/network/q$c;LT/l;I)F
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "it"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, -0x15c9e52

    invoke-interface {p3, p1}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, -0x1

    const-string v0, "com.ui.wifiman.ui.component.network.NetworkTopology.<get-itemWidthMin>.<anonymous> (NetworkTopology.kt:114)"

    invoke-static {p1, p4, p2, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const/16 p1, 0x64

    int-to-float p1, p1

    invoke-static {p1}, LY0/h;->j(F)F

    move-result p1

    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface {p3}, LT/l;->J()V

    return p1
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/f;

    check-cast p2, Lcom/ui/wifiman/ui/component/network/q$c;

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ui/wifiman/ui/component/network/q$d;->a(Lz/f;Lcom/ui/wifiman/ui/component/network/q$c;LT/l;I)F

    move-result p1

    invoke-static {p1}, LY0/h;->d(F)LY0/h;

    move-result-object p1

    return-object p1
.end method
