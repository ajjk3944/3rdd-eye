.class final LT/Q0;
.super LT/w1;
.source "SourceFile"


# instance fields
.field private final a:LT/w1;

.field private final b:I


# direct methods
.method public constructor <init>(LT/w1;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LT/w1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, LT/Q0;->a:LT/w1;

    iput p2, p0, LT/Q0;->b:I

    return-void
.end method
