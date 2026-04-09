.class LNh/P;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:LNh/U;


# direct methods
.method public constructor <init>(LNh/U;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNh/P;->a:LNh/U;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LNh/P;->a:LNh/U;

    invoke-static {v0}, LNh/U;->p(LNh/U;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
