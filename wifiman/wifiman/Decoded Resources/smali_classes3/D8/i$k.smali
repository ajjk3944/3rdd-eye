.class final LD8/i$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/i;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LD8/i$k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LD8/i$k;

    invoke-direct {v0}, LD8/i$k;-><init>()V

    sput-object v0, LD8/i$k;->a:LD8/i$k;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LBc/a$b;

    check-cast p2, LBc/a$b;

    check-cast p3, Ljava/lang/Boolean;

    check-cast p4, Ljava/lang/Boolean;

    check-cast p5, Ll9/a;

    check-cast p6, Ljava/lang/Boolean;

    invoke-virtual/range {p0 .. p6}, LD8/i$k;->b(LBc/a$b;LBc/a$b;Ljava/lang/Boolean;Ljava/lang/Boolean;Ll9/a;Ljava/lang/Boolean;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final b(LBc/a$b;LBc/a$b;Ljava/lang/Boolean;Ljava/lang/Boolean;Ll9/a;Ljava/lang/Boolean;)Ljava/util/List;
    .locals 1

    const-string/jumbo v0, "simState0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "simState1"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "permissionLocation"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "locationEnabled"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "gateway"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "networkApiServiceAvailable"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-nez p3, :cond_0

    sget-object p3, Laf/J;->PERMISSION_LOCATION:Laf/J;

    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    instance-of p1, p1, LBc/a$b$b$c;

    if-nez p1, :cond_1

    instance-of p1, p2, LBc/a$b$b$c;

    if-eqz p1, :cond_2

    :cond_1
    sget-object p1, Laf/J;->PERMISSION_CELLLAR:Laf/J;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_3

    sget-object p1, Laf/J;->LOCATION_ACCESS:Laf/J;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-virtual {p5}, Ll9/a;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljd/a$b;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljd/a$b;->b()LCc/a;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-interface {p1}, LCc/a;->f()Lxa/a$d;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-interface {p1}, Lua/a;->j0()LFa/b;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-interface {p1}, LFa/b;->e()LFa/b$a;

    move-result-object p1

    goto :goto_0

    :cond_4
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_5

    invoke-virtual {p6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_5

    sget-object p1, Laf/J;->WIFIMAN_SUPPORT_DISABLED:Laf/J;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    invoke-static {v0}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
