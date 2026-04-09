.class final LD8/x$j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/x$j;->a(Ll9/a;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LD8/x;


# direct methods
.method constructor <init>(LD8/x;)V
    .locals 0

    iput-object p1, p0, LD8/x$j$a;->a:LD8/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lsd/a$a;)Lgg/f;
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x1

    const-string/jumbo v2, "advancedSpeedtestAvailability"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, p1, Lsd/a$a$a;

    if-eqz v2, :cond_0

    iget-object v2, p0, LD8/x$j$a;->a:LD8/x;

    invoke-static {v2}, LD8/x;->J0(LD8/x;)Li8/a;

    move-result-object v2

    new-instance v3, Li8/a$b$B$c$b;

    check-cast p1, Lsd/a$a$a;

    invoke-virtual {p1}, Lsd/a$a$a;->b()Linet/ipaddr/g;

    move-result-object v4

    invoke-virtual {p1}, Lsd/a$a$a;->a()Ljava/lang/String;

    move-result-object p1

    const/4 v5, 0x0

    invoke-direct {v3, v4, p1, v5}, Li8/a$b$B$c$b;-><init>(Linet/ipaddr/g;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-array p1, v1, [Li8/a$b;

    aput-object v3, p1, v0

    invoke-interface {v2, p1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of p1, p1, Lsd/a$a$b;

    if-eqz p1, :cond_1

    iget-object p1, p0, LD8/x$j$a;->a:LD8/x;

    invoke-static {p1}, LD8/x;->J0(LD8/x;)Li8/a;

    move-result-object p1

    new-array v1, v1, [Li8/a$b;

    sget-object v2, Li8/a$b$B$c$c;->a:Li8/a$b$B$c$c;

    aput-object v2, v1, v0

    invoke-interface {p1, v1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lsd/a$a;

    invoke-virtual {p0, p1}, LD8/x$j$a;->a(Lsd/a$a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
