.class final Lp8/i$p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp8/i;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp8/i$p$a;
    }
.end annotation


# static fields
.field public static final a:Lp8/i$p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp8/i$p;

    invoke-direct {v0}, Lp8/i$p;-><init>()V

    sput-object v0, Lp8/i$p;->a:Lp8/i$p;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lde/s;Ljava/lang/Boolean;)LLe/c;
    .locals 1

    const-string/jumbo v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "bluetoothAvailable"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_0

    sget-object p1, LLe/c;->LAN:LLe/c;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lde/s;->b()Lfc/c;

    move-result-object p1

    sget-object p2, Lp8/i$p$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    const/4 p2, 0x1

    if-eq p1, p2, :cond_2

    const/4 p2, 0x2

    if-ne p1, p2, :cond_1

    sget-object p1, LLe/c;->BLUETOOTH:LLe/c;

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    sget-object p1, LLe/c;->LAN:LLe/c;

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lde/s;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2}, Lp8/i$p;->a(Lde/s;Ljava/lang/Boolean;)LLe/c;

    move-result-object p1

    return-object p1
.end method
