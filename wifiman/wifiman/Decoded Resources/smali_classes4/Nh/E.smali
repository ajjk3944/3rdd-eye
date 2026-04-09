.class LNh/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:LMh/k;

.field private final b:LNh/G;


# direct methods
.method public constructor <init>(LMh/k;LNh/G;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNh/E;->a:LMh/k;

    iput-object p2, p0, LNh/E;->b:LNh/G;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LNh/E;->a:LMh/k;

    iget-object v1, p0, LNh/E;->b:LNh/G;

    invoke-static {v0, v1}, LNh/G;->g0(LMh/k;LNh/G;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
