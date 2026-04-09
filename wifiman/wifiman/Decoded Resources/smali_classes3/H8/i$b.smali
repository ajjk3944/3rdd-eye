.class final LH8/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH8/i;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LH8/i$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LH8/i$b;

    invoke-direct {v0}, LH8/i$b;-><init>()V

    sput-object v0, LH8/i$b;->a:LH8/i$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/teleport/h;

    check-cast p2, LWc/b;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2, p3}, LH8/i$b;->b(Lcom/ui/wifiman/model/teleport/h;LWc/b;Ljava/lang/Boolean;)LYg/s;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lcom/ui/wifiman/model/teleport/h;LWc/b;Ljava/lang/Boolean;)LYg/s;
    .locals 1

    const-string/jumbo v0, "console"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "isNetworkConnected"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, LWc/b;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LOd/a;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    invoke-static {p1, p3, p2}, LId/b;->a(Lcom/ui/wifiman/model/teleport/h;ZLOd/a;)LId/a;

    move-result-object p2

    invoke-static {p1, p2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    return-object p1
.end method
