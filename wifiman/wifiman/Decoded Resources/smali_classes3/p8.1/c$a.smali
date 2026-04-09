.class final Lp8/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp8/c;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lp8/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp8/c$a;

    invoke-direct {v0}, Lp8/c$a;-><init>()V

    sput-object v0, Lp8/c$a;->a:Lp8/c$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lde/p;)LCi/c;
    .locals 6

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/c$b;

    invoke-virtual {p1}, Lde/p;->d()Lfc/a;

    move-result-object v1

    sget-object v2, Lfc/a;->NAME:Lfc/a;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v1, v2, :cond_0

    move v1, v4

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    invoke-direct {v0, v1}, Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/c$b;-><init>(Z)V

    new-instance v1, Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/c$c;

    invoke-virtual {p1}, Lde/p;->d()Lfc/a;

    move-result-object v2

    sget-object v5, Lfc/a;->SIGNAL:Lfc/a;

    if-ne v2, v5, :cond_1

    move v2, v4

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    invoke-direct {v1, v2}, Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/c$c;-><init>(Z)V

    new-instance v2, Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/c$a;

    invoke-virtual {p1}, Lde/p;->d()Lfc/a;

    move-result-object p1

    sget-object v5, Lfc/a;->MAC:Lfc/a;

    if-ne p1, v5, :cond_2

    move p1, v4

    goto :goto_2

    :cond_2
    move p1, v3

    :goto_2
    invoke-direct {v2, p1}, Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/c$a;-><init>(Z)V

    const/4 p1, 0x3

    new-array p1, p1, [Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/c;

    aput-object v0, p1, v3

    aput-object v1, p1, v4

    const/4 v0, 0x2

    aput-object v2, p1, v0

    invoke-static {p1}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LCi/a;->h(Ljava/lang/Iterable;)LCi/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lde/p;

    invoke-virtual {p0, p1}, Lp8/c$a;->a(Lde/p;)LCi/c;

    move-result-object p1

    return-object p1
.end method
