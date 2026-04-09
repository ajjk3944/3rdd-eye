.class LAh/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:LNh/n;

.field private final b:LBh/e;


# direct methods
.method public constructor <init>(LNh/n;LBh/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAh/q;->a:LNh/n;

    iput-object p2, p0, LAh/q;->b:LBh/e;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LAh/q;->a:LNh/n;

    iget-object v1, p0, LAh/q;->b:LBh/e;

    invoke-static {v0, v1}, LAh/u;->k(LNh/n;LBh/e;)LBh/e;

    move-result-object v0

    return-object v0
.end method
