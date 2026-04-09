.class abstract LF3/b;
.super LF3/c;
.source "SourceFile"


# instance fields
.field a:[Ljava/lang/Object;

.field b:I

.field c:Z


# direct methods
.method constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, LF3/c;-><init>()V

    const/4 p1, 0x4

    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, LF3/b;->a:[Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, p0, LF3/b;->b:I

    return-void
.end method
