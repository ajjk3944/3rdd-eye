.class public final Lcom/ui/wifiman/ui/wifi/scan/prefs/quality/b$b$a;
.super Lcom/ui/wifiman/ui/wifi/scan/prefs/quality/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/wifi/scan/prefs/quality/b$b;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final g:LLi/z;


# direct methods
.method constructor <init>()V
    .locals 5

    invoke-direct {p0}, Lcom/ui/wifiman/ui/wifi/scan/prefs/quality/d;-><init>()V

    new-instance v0, Lcom/ui/wifiman/ui/wifi/scan/prefs/quality/c$a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/ui/wifiman/ui/wifi/scan/prefs/quality/c$a;-><init>(Z)V

    new-instance v2, Lcom/ui/wifiman/ui/wifi/scan/prefs/quality/c$b;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lcom/ui/wifiman/ui/wifi/scan/prefs/quality/c$b;-><init>(Z)V

    const/4 v4, 0x2

    new-array v4, v4, [Lcom/ui/wifiman/ui/wifi/scan/prefs/quality/c;

    aput-object v0, v4, v3

    aput-object v2, v4, v1

    invoke-static {v4}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, LCi/a;->h(Ljava/lang/Iterable;)LCi/c;

    move-result-object v0

    invoke-static {v0}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v0

    iput-object v0, p0, Lcom/ui/wifiman/ui/wifi/scan/prefs/quality/b$b$a;->g:LLi/z;

    return-void
.end method


# virtual methods
.method public d()Lorg/kodein/di/DI;
    .locals 1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public bridge synthetic n0()LLi/N;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/wifi/scan/prefs/quality/b$b$a;->p0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public o0(Lcom/ui/wifiman/ui/wifi/scan/prefs/quality/c;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public p0()LLi/z;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/wifi/scan/prefs/quality/b$b$a;->g:LLi/z;

    return-object v0
.end method
