.class LAh/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:LBh/G;

.field private final b:Z


# direct methods
.method public constructor <init>(LBh/G;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAh/i;->a:LBh/G;

    iput-boolean p2, p0, LAh/i;->b:Z

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LAh/i;->a:LBh/G;

    iget-boolean v1, p0, LAh/i;->b:Z

    invoke-static {v0, v1}, LAh/k;->G0(LBh/G;Z)LAh/k$b;

    move-result-object v0

    return-object v0
.end method
