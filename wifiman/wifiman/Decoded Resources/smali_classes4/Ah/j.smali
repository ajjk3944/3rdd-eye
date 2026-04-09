.class LAh/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:LAh/k;


# direct methods
.method public constructor <init>(LAh/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAh/j;->a:LAh/k;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LAh/j;->a:LAh/k;

    invoke-static {v0}, LAh/k;->H0(LAh/k;)LAh/k$b;

    move-result-object v0

    return-object v0
.end method
