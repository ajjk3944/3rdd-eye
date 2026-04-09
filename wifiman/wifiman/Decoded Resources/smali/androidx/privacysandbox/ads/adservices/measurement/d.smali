.class public final Landroidx/privacysandbox/ads/adservices/measurement/d;
.super Landroidx/privacysandbox/ads/adservices/measurement/l;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroidx/privacysandbox/ads/adservices/measurement/c;->a(Landroid/content/Context;)Landroid/adservices/measurement/MeasurementManager;

    move-result-object p1

    const-string v0, "get(context)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/privacysandbox/ads/adservices/measurement/l;-><init>(Landroid/adservices/measurement/MeasurementManager;)V

    return-void
.end method
