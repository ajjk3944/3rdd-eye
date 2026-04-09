.class final Ll8/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll8/a;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll8/a$a$a;
    }
.end annotation


# static fields
.field public static final a:Ll8/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ll8/a$a;

    invoke-direct {v0}, Ll8/a$a;-><init>()V

    sput-object v0, Ll8/a$a;->a:Ll8/a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZc/e;

    check-cast p2, Lje/r;

    check-cast p3, LBc/a$b;

    check-cast p4, LBc/a$b;

    invoke-virtual {p0, p1, p2, p3, p4}, Ll8/a$a;->b(LZc/e;Lje/r;LBc/a$b;LBc/a$b;)Ll9/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(LZc/e;Lje/r;LBc/a$b;LBc/a$b;)Ll9/a;
    .locals 3

    const-string/jumbo v0, "networkState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "wifiState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "simPrimary"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "simSecondary"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll9/a;

    invoke-virtual {p1}, LZc/e;->g()Lb8/c;

    move-result-object p1

    sget-object v1, Ll8/a$a$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_9

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eq p1, v1, :cond_6

    const/4 p3, 0x3

    if-eq p1, p3, :cond_2

    const/4 p2, 0x4

    if-eq p1, p2, :cond_1

    const/4 p2, 0x5

    if-ne p1, p2, :cond_0

    goto :goto_2

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object v2, Lcom/ui/wifiman/ui/component/network/c$a$b;->a:Lcom/ui/wifiman/ui/component/network/c$a$b;

    goto :goto_2

    :cond_2
    instance-of p1, p2, Lje/r$a;

    if-nez p1, :cond_a

    instance-of p1, p2, Lje/r$b$b;

    if-eqz p1, :cond_3

    goto :goto_2

    :cond_3
    instance-of p1, p2, Lje/r$b$a;

    if-eqz p1, :cond_5

    new-instance p1, Lcom/ui/wifiman/ui/component/network/c$a$d;

    check-cast p2, Lje/r$b$a;

    invoke-virtual {p2}, Lje/r$b$a;->i()Lke/c;

    move-result-object p3

    if-eqz p3, :cond_4

    invoke-virtual {p3}, Lke/c;->b()Ljava/lang/String;

    move-result-object v2

    :cond_4
    invoke-virtual {p2}, Lje/r$b$a;->h()LS8/l;

    move-result-object p2

    invoke-direct {p1, v2, p2}, Lcom/ui/wifiman/ui/component/network/c$a$d;-><init>(Ljava/lang/String;LS8/l;)V

    goto :goto_1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_6
    new-instance p1, Lcom/ui/wifiman/ui/component/network/c$a$a;

    instance-of p2, p3, LBc/a$b$a$b;

    if-eqz p2, :cond_7

    check-cast p3, LBc/a$b$a$b;

    invoke-virtual {p3}, LBc/a$b$a$b;->b()LV7/a;

    move-result-object v2

    goto :goto_0

    :cond_7
    instance-of p2, p4, LBc/a$b$a$b;

    if-eqz p2, :cond_8

    check-cast p4, LBc/a$b$a$b;

    invoke-virtual {p4}, LBc/a$b$a$b;->b()LV7/a;

    move-result-object v2

    :cond_8
    :goto_0
    invoke-direct {p1, v2}, Lcom/ui/wifiman/ui/component/network/c$a$a;-><init>(LV7/a;)V

    :goto_1
    move-object v2, p1

    goto :goto_2

    :cond_9
    sget-object v2, Lcom/ui/wifiman/ui/component/network/c$a$c;->a:Lcom/ui/wifiman/ui/component/network/c$a$c;

    :cond_a
    :goto_2
    invoke-direct {v0, v2}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
