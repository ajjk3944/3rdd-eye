.class LAh/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:LAh/u;


# direct methods
.method public constructor <init>(LAh/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAh/o;->a:LAh/u;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LAh/o;->a:LAh/u;

    invoke-static {v0}, LAh/u;->i(LAh/u;)Lpi/S;

    move-result-object v0

    return-object v0
.end method
