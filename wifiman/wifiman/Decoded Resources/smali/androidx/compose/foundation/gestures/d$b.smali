.class public final Landroidx/compose/foundation/gestures/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf0/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/foundation/gestures/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public fold(Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lf0/g$a;->a(Lf0/g;Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public get(Ldh/i$c;)Ldh/i$b;
    .locals 0

    invoke-static {p0, p1}, Lf0/g$a;->b(Lf0/g;Ldh/i$c;)Ldh/i$b;

    move-result-object p1

    return-object p1
.end method

.method public minusKey(Ldh/i$c;)Ldh/i;
    .locals 0

    invoke-static {p0, p1}, Lf0/g$a;->c(Lf0/g;Ldh/i$c;)Ldh/i;

    move-result-object p1

    return-object p1
.end method

.method public plus(Ldh/i;)Ldh/i;
    .locals 0

    invoke-static {p0, p1}, Lf0/g$a;->d(Lf0/g;Ldh/i;)Ldh/i;

    move-result-object p1

    return-object p1
.end method

.method public v()F
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method
