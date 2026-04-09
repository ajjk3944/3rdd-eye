.class LNh/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field private final a:LNh/G;

.field private final b:LMh/k;


# direct methods
.method public constructor <init>(LNh/G;LMh/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNh/F;->a:LNh/G;

    iput-object p2, p0, LNh/F;->b:LMh/k;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LNh/F;->a:LNh/G;

    iget-object v1, p0, LNh/F;->b:LMh/k;

    check-cast p1, LNh/G$a;

    invoke-static {v0, v1, p1}, LNh/G;->h0(LNh/G;LMh/k;LNh/G$a;)LBh/e;

    move-result-object p1

    return-object p1
.end method
