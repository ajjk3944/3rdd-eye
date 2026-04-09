.class public final LH/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LH/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LH/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LH/r;->a:LH/l;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, LH/r;->a:LH/l;

    invoke-virtual {v0}, LH/l;->j()LH/p;

    move-result-object v0

    iget-object v1, p0, LH/r;->a:LH/l;

    invoke-virtual {v0, v1}, LH/p;->i(LH/l;)V

    return-void
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, LH/r;->a:LH/l;

    invoke-virtual {v0}, LH/l;->j()LH/p;

    move-result-object v0

    iget-object v1, p0, LH/r;->a:LH/l;

    invoke-virtual {v0, v1}, LH/p;->k(LH/l;)V

    return-void
.end method
