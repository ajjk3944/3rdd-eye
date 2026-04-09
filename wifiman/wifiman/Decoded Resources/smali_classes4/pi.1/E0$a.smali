.class public final Lpi/E0$a;
.super Lpi/E0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpi/E0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lpi/E0;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic e(Lpi/S;)Lpi/B0;
    .locals 0

    invoke-virtual {p0, p1}, Lpi/E0$a;->i(Lpi/S;)Ljava/lang/Void;

    move-result-object p1

    check-cast p1, Lpi/B0;

    return-object p1
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public i(Lpi/S;)Ljava/lang/Void;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Empty TypeSubstitution"

    return-object v0
.end method
