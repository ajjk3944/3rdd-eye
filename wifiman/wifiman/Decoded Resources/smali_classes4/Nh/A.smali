.class LNh/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:LNh/D;


# direct methods
.method public constructor <init>(LNh/D;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNh/A;->a:LNh/D;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LNh/A;->a:LNh/D;

    invoke-static {v0}, LNh/D;->G0(LNh/D;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
