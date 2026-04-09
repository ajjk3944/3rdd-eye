.class final Lcom/ui/wifiman/ui/component/network/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/ui/component/network/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/ui/component/network/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/ui/component/network/a$a;

    invoke-direct {v0}, Lcom/ui/wifiman/ui/component/network/a$a;-><init>()V

    sput-object v0, Lcom/ui/wifiman/ui/component/network/a$a;->a:Lcom/ui/wifiman/ui/component/network/a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    move-object v1, p1

    check-cast v1, Lz/f;

    move-object v2, p2

    check-cast v2, LA/B;

    check-cast p3, LY0/h;

    invoke-virtual {p3}, LY0/h;->s()F

    move-result v3

    check-cast p4, Lm0/v0;

    invoke-virtual {p4}, Lm0/v0;->u()J

    move-result-wide v4

    move-object v6, p5

    check-cast v6, LT/l;

    check-cast p6, Ljava/lang/Number;

    invoke-virtual {p6}, Ljava/lang/Number;->intValue()I

    move-result v7

    move-object v0, p0

    invoke-virtual/range {v0 .. v7}, Lcom/ui/wifiman/ui/component/network/a$a;->a(Lz/f;LA/B;FJLT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final a(Lz/f;LA/B;FJLT/l;I)V
    .locals 0

    const-string p3, "<this>"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "$unused$var$"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit16 p1, p7, 0x2001

    const/16 p2, 0x2000

    if-ne p1, p2, :cond_1

    invoke-interface {p6}, LT/l;->v()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p6}, LT/l;->C()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string p2, "com.ui.wifiman.ui.component.network.ComposableSingletons$NetworkTopologyKt.lambda-1.<anonymous> (NetworkTopology.kt:201)"

    const p3, -0x7a802da5

    invoke-static {p3, p7, p1, p2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    :goto_1
    return-void
.end method
