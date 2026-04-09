.class LAh/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:LAh/k;

.field private final b:Loi/n;


# direct methods
.method public constructor <init>(LAh/k;Loi/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAh/h;->a:LAh/k;

    iput-object p2, p0, LAh/h;->b:Loi/n;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LAh/h;->a:LAh/k;

    iget-object v1, p0, LAh/h;->b:Loi/n;

    invoke-static {v0, v1}, LAh/k;->F0(LAh/k;Loi/n;)LAh/u;

    move-result-object v0

    return-object v0
.end method
