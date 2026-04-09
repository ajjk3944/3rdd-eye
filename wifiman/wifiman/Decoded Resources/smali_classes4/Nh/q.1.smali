.class LNh/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:LNh/z;


# direct methods
.method public constructor <init>(LNh/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNh/q;->a:LNh/z;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LNh/q;->a:LNh/z;

    invoke-static {v0}, LNh/z;->j0(LNh/z;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
