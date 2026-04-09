.class LAh/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:LAh/g;

.field private final b:Loi/n;


# direct methods
.method public constructor <init>(LAh/g;Loi/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAh/e;->a:LAh/g;

    iput-object p2, p0, LAh/e;->b:Loi/n;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LAh/e;->a:LAh/g;

    iget-object v1, p0, LAh/e;->b:Loi/n;

    invoke-static {v0, v1}, LAh/g;->f(LAh/g;Loi/n;)LDh/k;

    move-result-object v0

    return-object v0
.end method
