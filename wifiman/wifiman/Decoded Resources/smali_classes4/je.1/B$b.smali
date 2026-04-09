.class final Lje/B$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lje/B;-><init>(Landroid/net/wifi/WifiManager;Lje/a;LT7/a;Lfe/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lje/B;


# direct methods
.method constructor <init>(Lje/B;)V
    .locals 0

    iput-object p1, p0, Lje/B$b;->a:Lje/B;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Long;)Lje/r;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lje/B$b;->a:Lje/B;

    invoke-static {p1}, Lje/B;->d(Lje/B;)Lje/r;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, Lje/B$b;->a(Ljava/lang/Long;)Lje/r;

    move-result-object p1

    return-object p1
.end method
