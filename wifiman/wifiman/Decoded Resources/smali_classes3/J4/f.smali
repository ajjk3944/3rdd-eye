.class public LJ4/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ4/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object p1

    const-string/jumbo p2, "Skipping logging Crashlytics event to Firebase, no Firebase Analytics"

    invoke-virtual {p1, p2}, LI4/g;->b(Ljava/lang/String;)V

    return-void
.end method
