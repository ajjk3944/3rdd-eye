.class LMh/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:LMh/k;

.field private final b:LBh/g;


# direct methods
.method public constructor <init>(LMh/k;LBh/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LMh/a;->a:LMh/k;

    iput-object p2, p0, LMh/a;->b:LBh/g;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LMh/a;->a:LMh/k;

    iget-object v1, p0, LMh/a;->b:LBh/g;

    invoke-static {v0, v1}, LMh/c;->a(LMh/k;LBh/g;)LJh/E;

    move-result-object v0

    return-object v0
.end method
