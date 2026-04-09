.class public final synthetic LP7/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Luj/j;

    invoke-static {p1}, LP7/p;->c(Luj/j;)Lcom/google/firebase/analytics/FirebaseAnalytics;

    move-result-object p1

    return-object p1
.end method
