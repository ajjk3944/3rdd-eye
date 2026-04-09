.class final Lu8/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu8/e;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lu8/e$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu8/e$b;

    invoke-direct {v0}, Lu8/e$b;-><init>()V

    sput-object v0, Lu8/e$b;->a:Lu8/e$b;

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

    check-cast p1, Ljava/lang/Boolean;

    check-cast p2, LE8/a$a;

    check-cast p3, LP8/f$b;

    check-cast p4, Lv8/a$a;

    invoke-virtual {p0, p1, p2, p3, p4}, Lu8/e$b;->b(Ljava/lang/Boolean;LE8/a$a;LP8/f$b;Lv8/a$a;)Lxe/g;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/Boolean;LE8/a$a;LP8/f$b;Lv8/a$a;)Lxe/g;
    .locals 1

    const-string/jumbo v0, "isForciblyHidden"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "a2aSpeedtestPopup"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "wizardPopup"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "directConnectionPopup"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lxe/g;->NONE:Lxe/g;

    goto :goto_0

    :cond_0
    instance-of p1, p3, LP8/f$b$b;

    if-eqz p1, :cond_1

    sget-object p1, Lxe/g;->WIFIMAN_WIZARD:Lxe/g;

    goto :goto_0

    :cond_1
    instance-of p1, p2, LE8/a$a$c;

    if-eqz p1, :cond_2

    sget-object p1, Lxe/g;->SPEED_TEST_A2A:Lxe/g;

    goto :goto_0

    :cond_2
    instance-of p1, p4, Lv8/a$a$a;

    if-eqz p1, :cond_3

    check-cast p4, Lv8/a$a$a;

    invoke-virtual {p4}, Lv8/a$a$a;->a()Z

    move-result p1

    if-nez p1, :cond_3

    sget-object p1, Lxe/g;->DIRECT_CONSOLE_CONNECT:Lxe/g;

    goto :goto_0

    :cond_3
    sget-object p1, Lxe/g;->NONE:Lxe/g;

    :goto_0
    return-object p1
.end method
