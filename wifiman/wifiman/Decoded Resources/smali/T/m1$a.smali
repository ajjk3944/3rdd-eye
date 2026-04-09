.class final LT/m1$a;
.super Landroidx/compose/runtime/snapshots/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT/m1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/runtime/snapshots/n;-><init>()V

    iput-object p1, p0, LT/m1$a;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public c(Landroidx/compose/runtime/snapshots/n;)V
    .locals 1

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LT/m1$a;

    iget-object p1, p1, LT/m1$a;->c:Ljava/lang/Object;

    iput-object p1, p0, LT/m1$a;->c:Ljava/lang/Object;

    return-void
.end method

.method public d()Landroidx/compose/runtime/snapshots/n;
    .locals 2

    new-instance v0, LT/m1$a;

    iget-object v1, p0, LT/m1$a;->c:Ljava/lang/Object;

    invoke-direct {v0, v1}, LT/m1$a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final i()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LT/m1$a;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public final j(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, LT/m1$a;->c:Ljava/lang/Object;

    return-void
.end method
