.class public final LY9/l$b;
.super LY9/l;
.source "SourceFile"

# interfaces
.implements LY9/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY9/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/E;Lcom/ui/core/ui/sso/c;LU9/h;Lka/a;)V
    .locals 1

    const-string/jumbo v0, "savedState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "session"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "activityController"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "vibrator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3, p4}, LY9/l;-><init>(Landroidx/lifecycle/E;Lcom/ui/core/ui/sso/c;LU9/h;Lka/a;)V

    invoke-virtual {p0}, LW9/e;->I0()V

    return-void
.end method


# virtual methods
.method protected v0()Lgg/b;
    .locals 1

    invoke-virtual {p0}, LY9/l;->G0()Lgg/b;

    move-result-object v0

    return-object v0
.end method
