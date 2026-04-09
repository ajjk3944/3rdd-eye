.class LAh/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxi/b$c;


# instance fields
.field private final a:LAh/u;


# direct methods
.method public constructor <init>(LAh/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAh/t;->a:LAh/u;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Ljava/lang/Iterable;
    .locals 1

    iget-object v0, p0, LAh/t;->a:LAh/u;

    check-cast p1, LBh/e;

    invoke-static {v0, p1}, LAh/u;->n(LAh/u;LBh/e;)Ljava/lang/Iterable;

    move-result-object p1

    return-object p1
.end method
