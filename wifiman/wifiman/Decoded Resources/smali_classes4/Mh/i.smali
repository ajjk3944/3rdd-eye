.class LMh/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:LMh/j;

.field private final b:LQh/u;


# direct methods
.method public constructor <init>(LMh/j;LQh/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LMh/i;->a:LMh/j;

    iput-object p2, p0, LMh/i;->b:LQh/u;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LMh/i;->a:LMh/j;

    iget-object v1, p0, LMh/i;->b:LQh/u;

    invoke-static {v0, v1}, LMh/j;->d(LMh/j;LQh/u;)LNh/D;

    move-result-object v0

    return-object v0
.end method
