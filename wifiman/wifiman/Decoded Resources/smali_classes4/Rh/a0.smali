.class LRh/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field private final a:LBh/s0;


# direct methods
.method public constructor <init>(LBh/s0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRh/a0;->a:LBh/s0;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LRh/a0;->a:LBh/s0;

    check-cast p1, LBh/b;

    invoke-static {v0, p1}, LRh/e0;->b(LBh/s0;LBh/b;)Lpi/S;

    move-result-object p1

    return-object p1
.end method
