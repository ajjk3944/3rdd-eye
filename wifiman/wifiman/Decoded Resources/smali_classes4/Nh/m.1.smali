.class LNh/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:LNh/n;


# direct methods
.method public constructor <init>(LNh/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNh/m;->a:LNh/n;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LNh/m;->a:LNh/n;

    invoke-static {v0}, LNh/n;->O0(LNh/n;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
