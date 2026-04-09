.class LK6/N;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LK6/i0;


# instance fields
.field private final a:LG6/N;

.field private final b:I

.field private final c:I


# direct methods
.method constructor <init>(LG6/N;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK6/N;->a:LG6/N;

    iput p2, p0, LK6/N;->b:I

    iput p3, p0, LK6/N;->c:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 2

    iget-object v0, p0, LK6/N;->a:LG6/N;

    invoke-interface {v0}, LG6/N;->a()I

    move-result v0

    iget v1, p0, LK6/N;->b:I

    sub-int/2addr v0, v1

    iget v1, p0, LK6/N;->c:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0
.end method
